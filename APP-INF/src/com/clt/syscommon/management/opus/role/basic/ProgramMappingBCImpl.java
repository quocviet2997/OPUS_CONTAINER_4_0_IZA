/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleBCImpl.java
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
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComPgmRoleVO;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDBDAO;



/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_010EventResponse,ProgramMappingBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ProgramMappingBCImpl   extends BasicCommandSupport implements ProgramMappingBC {

	// Database Access Object
	private transient ProgramMappingDBDAO dbDao=null;

	/**
	 * ProgramMappingBCImpl 객체 생성<br>
	 * ProgramMappingDBDAO를 생성한다.<br>
	 */
	public ProgramMappingBCImpl(){
		dbDao = new ProgramMappingDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면의 프로그램매핑 팝업에 대한 조회 이벤트 처리<br>
	 * 
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchMenuList() throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchMenuList();
			return rowSet;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면의 프로그램매핑 팝업에 대한 조회 이벤트 처리<br>
	 * 
	 * @param String pgmNoForm
	 * @param String roleCd
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchProgramList(String pgmNoForm, String roleCd) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchProgramList(pgmNoForm,roleCd);
			return rowSet;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_010 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComPgmRoleVO[] models
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiRoleProgramMatch(ComPgmRoleVO[] models, SignOnUserAccount account) throws EventException{
		try {
			dbDao.multiComPgmRoleVO(models, account);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}