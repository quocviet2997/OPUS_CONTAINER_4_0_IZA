/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuManagementSC.java
*@FileTitle : Menu Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범
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
import com.clt.syscommon.management.opus.menu.basic.MenuBC;
import com.clt.syscommon.management.opus.menu.basic.MenuBCImpl;
import com.clt.syscommon.management.opus.menu.event.MenuManagementEvent;
import com.clt.syscommon.management.opus.menu.vo.ComMnuCfgSearchVO;
import com.clt.syscommon.management.opus.menu.vo.MnuCfgExcelVO;
import com.clt.syscommon.management.opus.program.basic.ProgramBC;
import com.clt.syscommon.management.opus.program.basic.ProgramBCImpl;
import com.clt.syscommon.management.opus.program.vo.ComProgramSearchVO;


/**
 * NIS2010-MenuManagement Business Logic ServiceCommand - NIS2010-MenuManagement 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author KyungBum Kim
 * @see MenuManagementEventResponse,MenuDBDAO
 * @since J2EE 1.4
 */

public class MenuManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * MenuManagement system 업무 시나리오 선행작업<br>
	 * MenuManagement업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("MenuManagementSC doStart error!");
		}
	}

	/**
	 * MenuManagement system 업무 시나리오 마감작업<br>
	 * MenuManagement 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("MenuManagementSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-MenuManagement system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("MenuManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchComMnuCfgVO(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchExcelData(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiComMnuCfgVO(e);
			}
		}
		return eventResponse;
	}
	/**
	 * 조회 이벤트 처리<br>
	 * Menu의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchComMnuCfgVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		MenuManagementEvent event = (MenuManagementEvent)e;
		MenuBC command = new MenuBCImpl();
		ProgramBC pbc = new ProgramBCImpl();
		List<ComMnuCfgSearchVO> list = command.searchComMnuCfgVO(event.getComProgramVO());
		ComProgramSearchVO[] array = pbc.searchProgramList(event.getComProgramVO());
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoList(list);
		eventResponse.setRsVoArray(array);
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Menu의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchExcelData(Event e) throws EventException {
		MenuBC command = new MenuBCImpl();
		List<MnuCfgExcelVO> list = command.searchExcelData();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoList(list);
		return eventResponse;
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * Menu의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiComMnuCfgVO(Event e) throws EventException {
		MenuManagementEvent event = (MenuManagementEvent)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MenuBC command = new MenuBCImpl();
		try{
			begin();
			command.multiComMnuCfgVO(event.getComMnuCfgVOS(),account);
			//eventResponse.setUserMessage("OK");
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}
}