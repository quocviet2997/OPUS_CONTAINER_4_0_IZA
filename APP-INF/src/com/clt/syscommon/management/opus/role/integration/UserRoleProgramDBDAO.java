/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserRoleProgramDBDAO.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.role.event.ComSys006Event;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see UserRoleProgramBCImpl 참조
 * @since J2EE 1.4
 */
public class UserRoleProgramDBDAO extends DBDAOSupport {

	/**
	 * UserRoleProgram의 모든 목록을 가져온다.<br>
	 * 
	 * @param e 이벤트
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchUserRoleProgramList(Event e) throws DAOException {
		ComSys006Event event=(ComSys006Event)e;
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("usr_id", event.getUsrId());
		params.put("usr_nm", event.getUsr_nm());
		params.put("usr_role_cd", event.getRoleCd());
		params.put("usr_role_nm", event.getRole_nm());
		params.put("pgm_no", event.getPgmNo());
		params.put("pgm_nm", event.getPgm_nm());

		try {
			DBRowSet dRs = null;
			
			dRs = new SQLExecuter("SysComDB").executeQuery(new UserRoleProgramDAOSearchUserRoleProgramListRSQL(), params, params);
			return dRs;
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 


	}

}