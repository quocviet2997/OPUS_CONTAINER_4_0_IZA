/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeProgramSC.java
*@FileTitle : OfficeProgramSC
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : SEUNGYOL LEE
*@LastVersion : 1.0
* 2009-05-21 SEUNGYOL LEE
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officeprogram.basic.OfficeProgramBC;
import com.clt.syscommon.management.opus.officeprogram.basic.OfficeProgramBCImpl;
import com.clt.syscommon.management.opus.officeprogram.event.OfficeProgramEvent;
import com.clt.syscommon.management.opus.officeprogram.event.OfficeProgramMappingEvent;
import com.clt.syscommon.management.opus.officeprogram.vo.OfficeProgramListVO;
import com.clt.syscommon.management.opus.role.basic.ProgramMappingBC;
import com.clt.syscommon.management.opus.role.basic.ProgramMappingBCImpl;

/**
 * Office별 프로그램 조회/저장을 담당<br>
 * 
 * @author SEUNGYOL LEE
 * @see OfficeProgramBCImpl 참조
 * @since J2EE 1.4
 */
public class OfficeProgramSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * TestSample system 업무 시나리오 선행작업<br>
	 * TES_SNR_001업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
		}
	}

	/**
	 * TestSample system 업무 시나리오 마감작업<br>
	 * TES_SNR_001업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
	}

    /**
     * Office Program 매핑정보를 처리한다.<br>
     * @param ev		Event
     * @return  EventResponse
     * @throws EventException
     */	
	public EventResponse perform(Event ev) throws EventException {
		EventResponse eventResponse = null;
		
		if(ev.getEventName().equals("OfficeProgramEvent")){
	        if (ev.getFormCommand().isCommand(FormCommand.SEARCH)) {
	            eventResponse = searchOfficeProgramList(ev);
	        }
		}else{
	        if (ev.getFormCommand().isCommand(FormCommand.SEARCH01)) {
	            eventResponse = searchMenuList();
	        }else if (ev.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchProgramList(ev);
			} else if (ev.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiOfficeProgram(ev);

	        }
		}
	   
	       
        return eventResponse;
	}

    /**
     * 메뉴 목록을 조회한다.<br>
     * @return  EventResponse
     * @throws EventException
     */	
	private EventResponse searchMenuList() throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		try {
			ProgramMappingBC command = new ProgramMappingBCImpl();
			DBRowSet dbRowSet = command.searchMenuList();
			eventResponse.setRsVo(dbRowSet);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}

    /**
     * Office Program 매핑목록을 조회한다.<br>
     * @param ev		Event
     * @return  EventResponse
     * @throws EventException
     */	
	private EventResponse searchOfficeProgramList(Event ev) throws EventException{
		GeneralEventResponse response = new GeneralEventResponse();
		OfficeProgramBC bc = new OfficeProgramBCImpl();
		OfficeProgramEvent event =(OfficeProgramEvent)ev;
		List<OfficeProgramListVO> vos= bc.searchOfficeProgramList(event.getSearchComOfcPgmMtchVO());
		
		response.setRsVoList(vos);
		
		return response;
	}

    /**
     * Program 목록을 조회한다.<br>
     * @param ev		Event
     * @return  EventResponse
     * @throws EventException
     */	
	private EventResponse searchProgramList(Event ev) throws EventException {
		OfficeProgramMappingEvent event = (OfficeProgramMappingEvent)ev;

		String pgmNoForm = event.getPgmNoForm(); 
		String ofcCd = event.getOfcCd();
		
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
		
		try {
			OfficeProgramBC command = new OfficeProgramBCImpl();
			DBRowSet dbRowSet = command.searchSubmenuList(pgmNoForm, ofcCd);
			eventResponse.setRsVo(dbRowSet);
			eventResponse.setFlowFlag("SUBMENU");
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}

    /**
     * Office Program 매핑목록을 저장한다.<br>
     * @param ev		Event
     * @return  EventResponse
     * @throws EventException
     */
	private  EventResponse multiOfficeProgram(Event ev) throws EventException{
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		OfficeProgramMappingEvent event = (OfficeProgramMappingEvent)ev;
		try {
			OfficeProgramBC command = new OfficeProgramBCImpl();
			ComOfcPgmMtchVO[] model = event.getComOfcPgmMtchVOs();
			begin();
			command.multiOfficeProgram(model, account);

			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return eventResponse;
	}
}
