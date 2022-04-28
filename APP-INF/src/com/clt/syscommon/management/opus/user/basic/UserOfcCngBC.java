/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : UserOfcCngBC.java
 *@FileTitle : 오피스체인지 사용자관리
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009-03-19
 *@LastModifier : SeongWook LEE
 *@LastVersion : 1.0

=========================================================*/
package com.clt.syscommon.management.opus.user.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * syscommon-syscommon Business Logic Command Interface<br>
 * - syscommon-syscommon에 대한 비지니스 로직에 대한 인터페이스<br>
 * 
 * @author SeongWook LEE
 * @see UI_COM_SYS_015EventResponse 참조
 * @since J2EE 1.4
 */
public interface UserOfcCngBC {

	/**
	 * 추가 이벤트 처리<br>
	 * UI_COM_SYS_015 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return EventResponse UI_COM_SYS_015EventResponse
	 * @exception EventException
	 */
	public EventResponse changeOffice(Event e) throws EventException;

	/**
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserList(Event e) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_015 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiUser(Event e, SignOnUserAccount account) throws EventException;

	/**
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet getUserBasicInfo(Event e) throws EventException;

	/**
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet getUserRhqInfo(Event e) throws EventException;

}