/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentBC.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.state.basic;

import com.clt.bizcommon.state.event.ComEns0X1EventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0X1EventResponse 참조
 * @since J2EE 1.4
 */
public interface StateBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * State화면에 대한 조회 이벤트 처리<br>
	 * @param Event e
	 * @return response COM_ENS_0H1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchStateList(Event e) throws EventException;

}