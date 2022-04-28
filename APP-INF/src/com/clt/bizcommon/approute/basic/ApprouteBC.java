/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteBC.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2008-09-03
*@LastModifier : Jeong-Hoon KIM
*@LastVersion : 1.0
* 2008-09-03 Jeong-Hoon KIM
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approute.basic;

import com.clt.bizcommon.approute.event.ApprouteEventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon KIM
 * @see ApprouteEventResponse 참조
 * @since J2EE 1.4
 */
public interface ApprouteBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchStaffList(Event e) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchDeptList() throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchApprovalRouteList(Event e) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse saveApprovalRoute(Event e) throws EventException;
}