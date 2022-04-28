/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeManagementSC.java
*@FileTitle : 공통코드관리 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-07
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-07 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.Arrays;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

import com.clt.syscommon.management.opus.faxmanagement.basic.FaxManagementBC;
import com.clt.syscommon.management.opus.faxmanagement.basic.FaxManagementBCImpl;
import com.clt.syscommon.management.opus.faxmanagement.event.FaxManagementEvent;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBC;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBCImpl;

/**
 * edm-edm Business Logic ServiceCommand<br>
 * - edm-edm에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_EDM_001EventResponse,CodeManagementDBDAO 참조
 * @since J2EE 1.4
 */
public class FaxManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * edm 업무 시나리오 선행작업<br>
	 * Codepublish업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account=getSignOnUserAccount();
		} catch (Exception e) {
			log.error("CodeManagementSC 선행 작업 시 오류 " + e.toString(), e);
		}
	}

	/**
	 * edm 업무 시나리오 마감작업<br>
	 * Codepublish업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("CodeManagementSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * edm-edm 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;
		
		//log.debug("event : " + e);
		
		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("FaxManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) { 
				eventResponse = searchFaxDataList(e);		
			
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) { //DELETE,INSERT APP COM_INTG_CD,COM_INTG_CD_DTL
				eventResponse = resendMgmt(e);
			} 
		}
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * CodeManagement 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchFaxDataList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		try {
			FaxManagementBC command = new FaxManagementBCImpl();
			eventResponse.setRs(command.searchFaxDataList(e));
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}


	/**
	 * 멀티 이벤트 처리<br>
	 * Codepublish의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse resendMgmt(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FaxManagementEvent event = (FaxManagementEvent)e;
		FaxManagementBC command = new FaxManagementBCImpl();
		try{
			begin();
			
			if(event.getFaxMgmtCondVOs()!=null){
				command.multiFaxMgmtMst(event.getFaxMgmtCondVOs(), account);
			}
			
			eventResponse.setUserMessage(new ErrorHandler("COM12191", new String[]{"Data"}).getUserMessage());
			commit();
        } catch (EventException ex) {
        	log.error("error:"+ex.toString(), ex);
            rollback();
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
        	log.error("error:"+ex.toString(), ex);
            rollback();
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Data"}).getMessage(), ex);
        }
		//return this.searchCodepublish(e);
		return eventResponse;
	}

	
	
}