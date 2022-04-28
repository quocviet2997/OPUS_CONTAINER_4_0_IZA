/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : User2DBDAO.java
*@FileTitle : 사용자관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-14
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-14 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.ComUsrOfcCngVO;
import com.clt.syscommon.management.opus.user.basic.UserBCImpl;
import com.clt.syscommon.management.opus.user.event.UiComSys015Event;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see UserBCImpl 참조
 * @since J2EE 1.4
 */
public class User2DBOfcCngDAO extends DBDAOSupport {

	/**
	 * user의 모든 목록을 가져온다.<br>
	 * 
	 * @param Event e 이벤트
	 * @return DBRowSet DB 처리 결과
	 * @Exception DAOException
	 */
	public DBRowSet searchUserList(Event e) throws DAOException {
		UiComSys015Event event = (UiComSys015Event)e;
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(event.getAdmin_page().equals("Y")){
				velParam.put("admin_page", event.getAdmin_page());
			}
			param.put("usr_id", event.getUsr_id());
			param.put("usr_nm", event.getUsr_nm());
	
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserOfcCngDBDAOSearchUserListRSQL(), param, velParam);

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * user의 데이타 모델을 DB에서 삭제한다.<br>
	 * 
	 * @param Event e 데이타 모델
	 * @Exception DAOException
	 */
	public void changeOffice(Event e) throws DAOException {
		
		UiComSys015Event event = (UiComSys015Event)e;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		try {

			param.put("lst_lgin_ofc_cd", event.getDefault_ofc_cd());
			param.put("usr_id",event.getUsr_id());

			SQLExecuter sqlExe = new SQLExecuter("");
			int result = sqlExe.executeUpdate((ISQLTemplate)new UserOfcCngDBDAOChangeOfficeUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 
	 * @param Event e
	 * @return	DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet userBasicInfo(Event e) throws DAOException {
		UiComSys015Event event = (UiComSys015Event)e;
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		try{
			param.put("usr_id", event.getUsr_id());
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserOfcCngDBDAOUserBasicInfoRSQL(), param, null);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet userRhqInfo(Event e) throws DAOException {
		UiComSys015Event event = (UiComSys015Event)e;
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		try{
			param.put("cng_ofc_cd", event.getCng_ofc_cd());
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserOfcCngDBDAOUserRhqInfoRSQL(), param, null);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 단건의 데이터를 생성한다.<br>
	 *
	 * @param ComUsrOfcCngVO vo 데이터객체
	 * @Exception DAOException
	 */
	public void addComUser(ComUsrOfcCngVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			SQLExecuter sqlExe = new SQLExecuter("");
			int result = sqlExe.executeUpdate((ISQLTemplate)new UserOfcCngDBDAOUserCSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 단건의 데이터를 갱신한다.<br>
	 *
	 * @param ComUsrOfcCngVO vo 데이터객체
	 * @return int
	 * @Exception DAOException
	 */
	public int modifyComUser(ComUsrOfcCngVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new UserOfcCngDBDAOUserUSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}

	/**
	 * 단건의 데이터를 삭제한다.<br>
	 *
	 * @param ComUsrOfcCngVO vo 데이터객체
	 * @return int
	 * @Exception DAOException
	 */
	public int removeComUser(ComUsrOfcCngVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new UserOfcCngDBDAOUserDSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
}