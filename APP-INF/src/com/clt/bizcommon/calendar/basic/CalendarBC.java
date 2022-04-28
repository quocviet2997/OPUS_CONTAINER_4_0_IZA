/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : countryBC.java
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.calendar.basic;

import com.clt.bizcommon.calendar.event.ComEns0S1EventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0S1EventResponse 참조
 * @since J2EE 1.4
 */
public interface CalendarBC  {
	
	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e COM_ENS_0S1Event
	 * @return EventResponse COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse modifyCntHoliday(Event e) throws EventException;

	
	/**
	 * 조회 이벤트 처리<br>
	 * country화면에 대한 조회 이벤트 처리<br>
	 * @param e 0S1Event
	 * @return response COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchCntHolidayList(Event e) throws EventException;
	
	
	
	
	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e COM_ENS_0S1Event
	 * @return EventResponse COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse modifySteHoliday(Event e) throws EventException;

	
	/**
	 * 조회 이벤트 처리<br>
	 * country화면에 대한 조회 이벤트 처리<br>
	 * @param e COM_ENS_0S1Event
	 * @return response COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchSteHolidayList(Event e) throws EventException;
	
	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e COM_ENS_0S1Event
	 * @return EventResponse COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse modifyLocHoliday(Event e) throws EventException;

	
	/**
	 * 조회 이벤트 처리<br>
	 * Location별 Holiday 조회 화면에 대한 조회 이벤트 처리<br>
	 * @param e COM_ENS_0S1Event
	 * @return response COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchLocHolidayList(Event e) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Monthly Holiday(by Country)화면에 대한 조회 이벤트 처리<br>
	 * @param e COM_ENS_0S1Event
	 * @return response COM_ENS_0S1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchMonthlyHolidayList(Event e) throws EventException;

}