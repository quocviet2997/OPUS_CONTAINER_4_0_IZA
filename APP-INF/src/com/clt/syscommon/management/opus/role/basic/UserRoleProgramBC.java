/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserRoleProgramBC.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.basic;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * syscommon-syscommon Business Logic Command Interface<br>
 * - syscommon-syscommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see 
 * @since J2EE 1.4
 */
public interface UserRoleProgramBC  {

	/**
	 * 추가 이벤트 처리<br>
	 * UI_COM_SYS_006 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_006Event
	 * @return EventResponse UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
//	public EventResponse addUserRoleProgram(Event e) throws EventException;

	/**
	 * 수정 이벤트 처리<br>
	 * UI_COM_SYS_006 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_006Event
	 * @return EventResponse UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
//	public EventResponse modifyUserRoleProgram(Event e) throws EventException;

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_006 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_006Event
	 * @return EventResponse UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeUserRoleProgram(Event e) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_006 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_006Event
	 * @return EventResponse UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
//	public EventResponse multiUserRoleProgram(Event e) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * UserRoleProgram화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return response UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
	public EventResponse searchUserRoleProgramList(Event e) throws EventException;

}