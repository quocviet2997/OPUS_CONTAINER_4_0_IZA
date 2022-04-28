/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : scheduleSC.java
*@FileTitle : schedule
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.23
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.23 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.management.opus.schedule.basic.ScheduleBC;
import com.clt.syscommon.management.opus.schedule.basic.ScheduleBCImpl;
import com.clt.syscommon.management.opus.schedule.event.ScheduleLogEvent;

/**
 * NIS2010-schedule Business Logic ServiceCommand
 * - NIS2010-schedule에 대한 비지니스 트랜잭션을 처리한다.
 *
 * @author In Sun Jung
 * @see scheduleEventResponse,scheduleDBDAO
 * @since J2EE 1.4
 */

public class ScheduleSC extends ServiceCommandSupport {
	/**
	 * schedule system 업무 시나리오 선행작업<br>
	 * schedule업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			getSignOnUserAccount();
		} catch (Exception e) {
			log.error("scheduleSC doStart error!");
		}
	}

	/**
	 * schedule system 업무 시나리오 마감작업<br>
	 * schedule업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("scheduleSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-schedule system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;
		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
			eventResponse = searchscheduleLogList(e);
		}
		return eventResponse;
	}


	/**
	 * 조회 이벤트 처리<br>
	 * schedule의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchscheduleLogList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ScheduleLogEvent event = (ScheduleLogEvent)e;
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;
		try {
			ScheduleBC command = new ScheduleBCImpl();
			eventResponse = command.searchscheduleLogList(event);
		} catch (EventException de) {
			throw new EventException(new ErrorHandler(de).getMessage());
		}
		return eventResponse;
	}

}
