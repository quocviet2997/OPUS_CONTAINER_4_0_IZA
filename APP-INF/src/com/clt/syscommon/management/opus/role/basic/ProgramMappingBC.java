/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ProgramMappingBC.java
*@FileTitle : 프로그램 매핑
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
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComPgmRoleVO;

/**
 * syscommon-syscommon Business Logic Command Interface<br>
 * - syscommon-syscommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see 
 * @since J2EE 1.4
 */
public interface ProgramMappingBC  {

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_010 화면에 대한 멀티 이벤트 처리<br>
	 * @param ComPgmRoleVO[] models
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiRoleProgramMatch(ComPgmRoleVO[] models, SignOnUserAccount account) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * role화면의 프로그램매핑 팝업에 대한 조회 이벤트 처리<br>
	 * 
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchMenuList() throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * role화면의 프로그램매핑 팝업에 대한 조회 이벤트 처리<br>
	 * 
	 * @param String pgmNoForm
	 * @param String roleCd
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchProgramList(String pgmNoForm, String roleCd) throws EventException;

}