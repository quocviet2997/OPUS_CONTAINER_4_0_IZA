/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CntrTpSzBC.java
*@FileTitle : CntrTpSz
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrtpsz.basic;

import com.clt.bizcommon.cntrtpsz.event.ComEns0G1EventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0G1EventResponse 참조
 * @since J2EE 1.4
 */
public interface CntrTpSzBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * CntrTpSz화면에 대한 조회 이벤트 처리<br>
	 * @param Event e
	 * @return EventResponse COM_ENS_0G1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchCntrTpSzList(Event e) throws EventException;

}