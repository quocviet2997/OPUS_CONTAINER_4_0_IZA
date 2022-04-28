/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : CodepublishDBDAO.java
 *@FileTitle : 공통코드관리
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2006-09-07
 *@LastModifier : SeongWook Kim
 *@LastVersion : 1.0
 * 2006-09-07 SeongWook Kim
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.faxmanagement.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.codemanagement.integration.CodeManagementDBDAOmodifyCodeMgmtMstUSQL;
import com.clt.syscommon.management.opus.faxmanagement.event.FaxManagementEvent;
import com.clt.syscommon.management.opus.faxmanagement.vo.FaxMgmtCondVO;


/**
 * edm-edm에 대한 DB 처리를 담당<br>
 * - edm-edm Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see CodepublishBCImpl 참조
 * @since J2EE 1.4
 */
public class FaxManagementDBDAO extends DBDAOSupport {


	/**
	 * Codepublish의 모든 목록을 가져온다.<br>
	 * 
	 * @param e
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchFaxDataList(Event e) throws DAOException {
		
		DBRowSet dbRowset = null;
		FaxManagementEvent event = (FaxManagementEvent) e;
		
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		FaxMgmtCondVO faxMgmtCondVO = event.getFaxMgmtCondVO();
		
		if(faxMgmtCondVO != null){
			Map<String, String> mapVO = faxMgmtCondVO .getColumnValues();
		
			param.putAll(mapVO);
			velParam.putAll(mapVO);
		}
		try {
			 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FaxManagementDBDAOsearchFaxDataListRSQL(), param, velParam);
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
	 * multiFaxMgmtMst
	 * @author SeongWook Kim
	 * @param updModels
	 * @throws SQLException
	 * @throws Exception void
	 */
	public void multiFaxMgmtMst(List<FaxMgmtCondVO> updModels) throws SQLException, Exception {
		try	{
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
									
			if(updModels.size() > 0){				
				updCnt = sqlExe.executeBatch((ISQLTemplate)new FaxManagementDBDAOupdateFaxProcStsCdByResendUSQL(), updModels, null);				
				checkFail(updCnt);
				updCnt = sqlExe.executeBatch((ISQLTemplate)new FaxManagementDBDAOComUpldFileDSQL(), updModels, null);				
				checkFail(updCnt);
			}		
		}catch (SQLException se){
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch (Exception ex){
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * checkFail
	 * @author Jeong-Hoon, KIM
	 * @param updCnt
	 * @throws DAOException void
	 */
	private void checkFail(int[] updCnt) throws DAOException {
		for(int i = 0; i < updCnt.length; i++){
			if(updCnt[i]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert No"+ i + " SQL");
		}
	}
	

}