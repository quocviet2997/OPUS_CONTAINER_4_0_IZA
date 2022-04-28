/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : scheduleBC.java
*@FileTitle : schedule
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.23
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.23 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.basic;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.syscommon.management.opus.schedule.event.ScheduleLogEvent;


/**
 * NIS2010-schedule Business Logic Command Interface<br>
 * - NIS2010-schedule에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author In Sun Jung
 * @see scheduleEventResponse 참조
 * @since J2EE 1.4
 */

public interface ScheduleBC {
	/**
	 * 조회 이벤트 처리<br>
	 * schedule log 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ScheduleLogEvent event
	 * @return EventResponse scheduleEventResponse
	 * @exception EventException
	 */
	public EventResponse searchscheduleLogList(ScheduleLogEvent event) throws EventException;
	
}
