/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MonthlyBC.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.monthly.basic;

import com.clt.bizcommon.exrate.monthly.event.ComEns0E1EventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0E1EventResponse 참조
 * @since J2EE 1.4
 */
public interface MonthlyRateBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Monthly화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchMonthlyRateList(Event e) throws EventException;

}