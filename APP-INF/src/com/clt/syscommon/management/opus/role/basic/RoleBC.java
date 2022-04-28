/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleBC.java
*@FileTitle : 역할관리
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
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.role.vo.ComUsrRoleConditionVO;
import com.clt.syscommon.management.opus.role.vo.SearchComUsrRoleVO;

/**
 * syscommon-syscommon Business Logic Command Interface<br>
 * - syscommon-syscommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see UI_COM_SYS_007EventResponse 참조
 * @since J2EE 1.4
 */
public interface RoleBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse searchRole(ComUsrRoleConditionVO  comUsrRoleConditionVO) throws EventException;

	/**
	 * 추가 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse addRole(Event e) throws EventException;

	/**
	 * 수정 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse modifyRole(Event e) throws EventException;

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeRole(Event e) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_007 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
	public EventResponse multiRole(Event e) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComUsrRoleConditionVO comUsrRoleConditionVO
	 * @param SignOnUserAccount account
	 * @return response UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
	public SearchComUsrRoleVO[] searchRoleList(ComUsrRoleConditionVO comUsrRoleConditionVO, SignOnUserAccount account) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * 부모Role 조회팝업 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return SearchComUsrRoleVO[]
	 * @exception EventException
	 */
	public SearchComUsrRoleVO[] searchUpperRoleList() throws EventException;

}