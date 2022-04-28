/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : MessageSC.java
 *@FileTitle : Message
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.01.02
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2009.01.02 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages;

import java.sql.SQLException;
import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.messages.basic.MessagesBC;
import com.clt.syscommon.common.messages.basic.MessagesBCImpl;
import com.clt.syscommon.common.messages.event.MessageEvent;

/**
 * NIS2010-Message Business Logic ServiceCommand - NIS2010-Message에 대한 비지니스
 * 트랜잭션을 처리한다.
 * 
 * @author Jung_InSun
 * @see MessageEventResponse,MessagesDBDAO
 * @since J2EE 1.4
 */
public class MessageSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Message system 업무 시나리오 선행작업<br>
	 * Message 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("Message SC doStart error!!");
		}
	}

	/**
	 * Message system 업무 시나리오 마감작업<br>
	 * Message 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("Nis2010SC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-Message system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e
	 *            Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {

		EventResponse eventResponse = null;

		FormCommand cmd = e.getFormCommand();
		if (cmd.isCommand(FormCommand.SEARCH)) { // message pop up init
			eventResponse = searchComMessagesList(e);
		} else if (cmd.isCommand(FormCommand.SEARCH01)) { // main message check
			eventResponse = checkComMessagesList(e);
		} else if (cmd.isCommand(FormCommand.ADD)) {
			eventResponse = addComMessages(e);
		} else if (cmd.isCommand(FormCommand.MODIFY)) {
			eventResponse = modifyComMessages(e);
		}
		return eventResponse;
	}

	/**
	 * 메세지 조회 이벤트 처리<br>
	 * 
	 * @param e
	 * @return EventResponse
	 * @throws EventException
	 * @throws NoSuchMethodException 
	 * @throws SQLException 
	 */
	private EventResponse searchComMessagesList(Event e) throws EventException {

		GeneralEventResponse eventResponse = new GeneralEventResponse();

		MessagesBC command = new MessagesBCImpl();
		List[] responseData = command.searchMessagesList(account);
		eventResponse.setRsVoList(responseData[0]);
		eventResponse.setRsVoList(responseData[1]);
		eventResponse.setRsVoList(responseData[2]);

		return eventResponse;
	}

	/**
	 * 메세지 조회 이벤트 처리<br>
	 * 
	 * @param e
	 * @return EventResponse
	 * @throws EventException
	 */
	@SuppressWarnings("deprecation")
	private EventResponse checkComMessagesList(Event e) throws EventException {

		GeneralEventResponse eventResponse = new GeneralEventResponse();

		MessagesBC command = new MessagesBCImpl();
		DBRowSet rowset = command.checkMessagesList(account.getUsr_id());

		eventResponse.setRs(rowset);

		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Message의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e
	 *            Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse addComMessages(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MessagesBC command = new MessagesBCImpl();
		try {
			begin();
			command.addComMessages(e);

			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		}
		return eventResponse;
	}

	/**
	 * 
	 * @param e
	 * @return
	 * @throws EventException
	 */
	private EventResponse modifyComMessages(Event e) throws EventException {
		MessageEvent event = (MessageEvent) e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MessagesBC command = new MessagesBCImpl();
		try {
			begin();
			event.setUsrId(account.getUsr_id());
			command.modifyMessage(event);
			DBRowSet rowset = command.checkMessagesList(account.getUsr_id());
			eventResponse.setRs(rowset);
			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		}

		return eventResponse;
	}
}
