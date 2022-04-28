/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ErrorMessageManagementSC.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.26
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.26 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComErrMsgVO;
import com.clt.syscommon.management.opus.errormessage.basic.ErrorMessageBC;
import com.clt.syscommon.management.opus.errormessage.basic.ErrorMessageBCImpl;
import com.clt.syscommon.management.opus.errormessage.event.ErrorMessageManagementEvent;
import com.clt.syscommon.management.opus.errormessage.vo.ErrorMessageResponseContainerVO;

/**
 * NIS2010-ErrorMessageManagement Business Logic ServiceCommand - NIS2010-ErrorMessageManagement 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author KyungBum Kim
 * @see ErrorMessageManagementEventResponse,ErrorMessageDBDAO
 * @since J2EE 1.4
 */

public class ErrorMessageManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * ErrorMessageManagement system 업무 시나리오 선행작업<br>
	 * ErrorMessageManagement업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("ErrorMessageManagementSC doStart error!!");
		}
	}

	/**
	 * ErrorMessageManagement system 업무 시나리오 마감작업<br>
	 * ErrorMessageManagement 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("ErrorMessageManagementSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-ErrorMessageManagement system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ErrorMessageManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchComErrMsgVO(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiComErrMsgVO(e);
			}
		}
		return eventResponse;
	}
	/**
	 * 조회 이벤트 처리<br>
	 * ErrorMessage의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchComErrMsgVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ErrorMessageManagementEvent event = (ErrorMessageManagementEvent)e;
		ErrorMessageBC command = new ErrorMessageBCImpl();
		ComErrMsgVO comerrmsgvo = event.getComErrMsgVO();
		ErrorMessageResponseContainerVO containerVO = command.searchComErrMsgVO(comerrmsgvo);
	
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoArray(containerVO.getComErrMsgVO());
		eventResponse.setETCData("etckey1",containerVO.getEtcKey1());
		eventResponse.setETCData("etckey2",containerVO.getEtcKey2());
		//eventResponse.setUserMessage(containerVO.getUsrMessage());
		
		return eventResponse;
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * ErrorMessage의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiComErrMsgVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ErrorMessageManagementEvent event = (ErrorMessageManagementEvent)e;
		ErrorMessageBC command = new ErrorMessageBCImpl();
		try{
			begin();
			ErrorMessageResponseContainerVO containerVO = command.multiComErrMsgVO(event.getComErrMsgVOS(), event.getSignOnUserAccount());
			containerVO = command.searchComErrMsgVO(event.getComErrMsgVO());

			eventResponse.setRsVoArray(containerVO.getComErrMsgVO());
			eventResponse.setETCData("etckey1",containerVO.getEtcKey1());
			eventResponse.setETCData("etckey2",containerVO.getEtcKey2());

			//eventResponse.setUserMessage(containerVO.getUsrMessage());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}

	public void setAccount(SignOnUserAccount account) {
		this.account = account;
	}

	public SignOnUserAccount getAccount() {
		return account;
	}
}