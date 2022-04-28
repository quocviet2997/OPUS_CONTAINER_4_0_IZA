/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ProgramManagementSC.java
*@FileTitle : Program Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.17
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.17 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.List;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.officemanagement.basic.OfficeManagementBC;
import com.clt.syscommon.management.opus.officemanagement.basic.OfficeManagementBCImpl;
import com.clt.syscommon.management.opus.officemanagement.event.OfficeManagementEvent;
import com.clt.syscommon.management.opus.officemanagement.vo.OfficListVO;
import com.clt.syscommon.management.opus.program.basic.ProgramBC;
import com.clt.syscommon.management.opus.program.basic.ProgramBCImpl;
import com.clt.syscommon.management.opus.program.event.ProgramManagementEvent;

/**
 * NIS2010-ProgramManagement Business Logic ServiceCommand - NIS2010-ProgramManagement 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author KyungBum Kim
 * @see ProgramManagementEventResponse,ProgramDBDAO
 * @since J2EE 1.4
 */

public class ProgramManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * ProgramManagement system 업무 시나리오 선행작업<br>
	 * ProgramManagement업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("ProgramManagementSC doStart error!");
		}
	}

	/**
	 * ProgramManagement system 업무 시나리오 마감작업<br>
	 * ProgramManagement 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("ProgramManagementSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-ProgramManagement system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ProgramManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchProgramList(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiComProgramVO(e);
			}
		}
		else if(e.getEventName().equalsIgnoreCase("OfficeManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = comOfcPgmMtchSearch(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = comOfcPgmMtchs(e);
			}
		}
		return eventResponse;
	}
	/**
	 * 조회 이벤트 처리<br>
	 * Program의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchProgramList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ProgramManagementEvent event = (ProgramManagementEvent)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoArray(new ProgramBCImpl().searchProgramList(event.getComProgramVO()));
		return eventResponse;
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * Program의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiComProgramVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ProgramBC command = new ProgramBCImpl();
		try{
			begin();
			command.multiComProgramVO(((ProgramManagementEvent)e).getComProgramVOS(), account);
			
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Program의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse comOfcPgmMtchSearch(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		OfficeManagementEvent event = (OfficeManagementEvent)e;
		OfficeManagementBC command = new OfficeManagementBCImpl();

		try{
			List<OfficListVO> list = command.comOfcPgmMtchSearch(event.getOfficListVO(),event.getPgm_no());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			throw ex;
		}catch(Exception ex){
			throw new EventException(ex.getMessage(), ex);
		}		
		return eventResponse;
	}
	
	/**
	 * 멀티 이벤트 처리<br>
	 * Program의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse comOfcPgmMtchs(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		OfficeManagementEvent event = (OfficeManagementEvent)e;
		OfficeManagementBC command = new OfficeManagementBCImpl();
		try{
			begin();
			command.comOfcPgmMtchs(event.getComOfcPgmMtchVOS(),account);
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}catch(Exception ex){
			throw new EventException(ex.getMessage(), ex);
		}
		return eventResponse;
	}
}