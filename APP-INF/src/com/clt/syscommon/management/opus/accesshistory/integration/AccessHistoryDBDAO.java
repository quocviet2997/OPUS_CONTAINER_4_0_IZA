/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryDBDAO.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.accesshistory.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.accesshistory.basic.AccessHistoryBCImpl;
import com.clt.syscommon.management.opus.accesshistory.vo.AccessHistoryVO;
import com.clt.syscommon.management.opus.accesshistory.vo.LastLoginDateVO;


/**
 * ALPS AccessHistoryDBDAO <br>
 * - ALPS-AccessHistory system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author kyungbum kim
 * @see AccessHistoryBCImpl 참조
 * @since J2EE 1.6
 */
public class AccessHistoryDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<AccessHistoryVO>
	 * @exception DAOException
	 */
	public List<AccessHistoryVO> getAccessHistory(HashMap<String, String> param) throws DAOException {
		DBRowSet dbRowset = null;
		List<AccessHistoryVO> list = null;

		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new AccessHistoryDBDAOAccessHistoryVORSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, AccessHistoryVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<AccessHistoryVO>
	 * @exception DAOException
	 */
	public List<AccessHistoryVO> getAccessHistoryExcel(HashMap<String, String> param) throws DAOException {
		DBRowSet dbRowset = null;
		List<AccessHistoryVO> list = null;
		param.put("regexp", "#[^#]*");

		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new AccessHistoryDAOExcelDownloadRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, AccessHistoryVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<LastLoginDateVO>
	 * @exception DAOException
	 */
	public List<LastLoginDateVO> getLastLoginDate(HashMap<String, String> param) throws DAOException {
		DBRowSet dbRowset = null;
		List<LastLoginDateVO> list = null;

		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LastLoginDateDAOLastLoginDateRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, LastLoginDateVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
}