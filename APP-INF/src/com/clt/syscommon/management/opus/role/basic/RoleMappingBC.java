/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleMappingBC.java
*@FileTitle : 역할 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.basic;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;

/**
 * syscommon-syscommon Business Logic Command Interface<br>
 * - syscommon-syscommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see 
 * @since J2EE 1.4
 */
public interface RoleMappingBC  {

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_008 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeUserRole(Event e) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_008 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUsrRoleMtchVO[] models
	 * @param SignOnUserAccount account
	 * @param String adminFlag
	 * @exception EventException
	 */
	public void multiComUsrRoleMtchVO(ComUsrRoleMtchVO[] models, SignOnUserAccount account, String adminFlag) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserRoleList(Event e) throws EventException;

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_008 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeProgRole(Event e) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_008 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
	public EventResponse multiProgRole(Event e) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
	public EventResponse searchProgRoleList(Event e) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserRoleHistoryList(Event e) throws EventException;
}