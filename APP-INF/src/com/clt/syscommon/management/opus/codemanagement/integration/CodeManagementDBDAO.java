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
package com.clt.syscommon.management.opus.codemanagement.integration;

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
import com.clt.syscommon.management.opus.codemanagement.event.CodeManagementEvent;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtDtlVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtMstVO;

/**
 * edm-edm에 대한 DB 처리를 담당<br>
 * - edm-edm Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see CodepublishBCImpl 참조
 * @since J2EE 1.4
 */
public class CodeManagementDBDAO extends DBDAOSupport {


	/**
	 * Codepublish의 모든 목록을 가져온다.<br>
	 * 
	 * @param e
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchAPPCodeList(Event e) throws DAOException {
		DBRowSet dbRowset = null;
		CodeManagementEvent event = (CodeManagementEvent) e;
		// form 조회조건
		String subsystem = event.getCodeMgmtCondVO().getSubsystem().toUpperCase(); 
		String searchCdTp = event.getCodeMgmtCondVO().getSearchCdTp();
		String searchtype = event.getCodeMgmtCondVO().getSearchtype();
		String codeVal = event.getCodeMgmtCondVO().getCodeVal().toUpperCase(); 
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("subsystem", subsystem);
		param.put("codeVal", codeVal);
		param.put("searchCdTp", searchCdTp);
		Map<String, Object> velParam = new HashMap<String, Object>();
		velParam.put("subsystem", subsystem);
		velParam.put("searchCdTp", searchCdTp);
		velParam.put("searchtype", searchtype);
		velParam.put("codeVal", codeVal);
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOComIntgCdRSQL(), param, velParam);
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
	 * searchSubSystemCodeList<br>
	 * 
	 * @return String[]
	 * @Exception DAOException
	 */
	public String[] searchSubSystemCodeList() throws DAOException {
		String[] list = null;
		try {
			DBRowSet dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CodeManagementDBDAOsearchSubSystemCdRSQL(), null, null);
			list = new String[dbRowset.getRowCount()];
			int idx = 0;
			while(dbRowset.next()){
				list[idx++] = dbRowset.getString("sub_sys_cd");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	
	/**
	 * searchMaxIntgCdId<br>
	 * 
	 * @return String[]
	 * @Exception DAOException
	 */
	public String searchMaxIntgCdId() throws DAOException {
		String resultStr = null;
		try {
			DBRowSet dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CodeManagementDBDAOsearchMaxIntgCdIdRSQL(), null, null);
			if ( dbRowset!=null && dbRowset.next() ){
				resultStr = dbRowset.getString("max_intg_cd_id");
			}
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return resultStr;
	}
	
//	/**
//	 * searchSubSystemValList<br>
//	 * 
//	 * @return String[]
//	 * @Exception DAOException
//	 */
//	public String[] searchSubSystemValList() throws DAOException {
//		String[] list = null;
//		try {
//			DBRowSet dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CodeManagementDBDAOSubSystemValRSQL(), null, null);
//			list = new String[dbRowset.getRowCount()];
//			int idx = 0;
//			while(dbRowset.next()){
//				list[idx++] = dbRowset.getString("sub_sys_val");
//			}
//		} catch (SQLException se) {
//			log.error(se.getMessage(), se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch (Exception ex) {
//			log.error(ex.getMessage(), ex);
//			throw new DAOException(new ErrorHandler(ex).getMessage());
//		}
//		return list;
//	}
	
	/**
	 * Codepublish의 모든 목록을 가져온다.<br>
	 * 
	 * @param e
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchAPPCodeDetailList(Event e) throws DAOException {
		DBRowSet dbRowset = null;
		CodeManagementEvent event = (CodeManagementEvent) e;
		// form 조회조건
		String codeid = event.getCodeMgmtCondVO().getCodeid().toUpperCase(); 
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("codeid", codeid);
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOComIntgCdDtlRSQL(), param, null);
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
	 * Code Management - Save - Update<br>
	 * 
	 * @param List<CodeMgmtMstVO> updModels
	 * @throws SQLException 
	 */
	public void modifyCodeMgmtMst(List<CodeMgmtMstVO> updModels) throws SQLException, Exception {
		try	{
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOmodifyCodeMgmtMstUSQL(), updModels, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
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
	 * Code Management - Save - Update<br>
	 * 
	 * @param List<CodeMgmtDtlVO> updModels
	 * @throws SQLException 
	 */
	public void modifyCodeMgmtDtl(List<CodeMgmtDtlVO> updModels) throws SQLException, Exception {
		try	{
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOmodifyCodeMgmtDtlUSQL(), updModels, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
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
	 * 코드 테이블을 삭제한다.<br>
	 * @param List<CodeMgmtMstVO> delModels
	 * @throws DAOException
	 */
	public void removeCodeMgmtMst(List<CodeMgmtMstVO> delModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOComIntgCdDtlDSQL(), delModels,null);
				for(int i = 0; i < 1; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOComIntgCdDSQL(), delModels,null);
				for(int i = 0; i < 1; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * 코드 테이블을 삭제한다.<br>
	 * @param List<CodeMgmtDtlVO> delModels
	 * @throws DAOException
	 */
	public void removeCodeMgmtDtl(List<CodeMgmtDtlVO> delModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOComIntgCdDtlDSQL(), delModels,null);
				for(int i = 0; i < 1; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 
	 * 코드 데이터를 생성한다.<br>
	 * 
	 * @param List<CodeMgmtMstVO> insModels
	 * @throws DAOException 
	 */
	public void addAPPCodeList(List<CodeMgmtMstVO> insModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOComIntgCdCSQL(), insModels,null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
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
	 * 코드 데이터를 생성한다.<br>
	 * 
	 * @param List<CodeMgmtDtlVO> insModels
	 * @throws DAOException 
	 */
	public void addAPPCodeDetailList(List<CodeMgmtDtlVO> insModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOComIntgCdDtlCSQL(), insModels,null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}		
	}
	
	/**
	 * Default Currency Creation의 Duplication Checking<br>
	 * 
	 * @param inputVO
	 * @return
	 * @throws DAOException
	 */
	public String searchDupChkCodeMgmtMst(CodeMgmtMstVO inputVO) throws DAOException {
		DBRowSet dbRowset = null;
		String dupFlg = "";
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			if( inputVO != null ){
				Map<String, String> mapVO = inputVO .getColumnValues();
				 
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOsearchDupChkCodeMgmtMstRSQL(), param, velParam);
			if ( dbRowset!=null && dbRowset.next() ){
				dupFlg = dbRowset.getString(1);
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return dupFlg;
	}
	
	/**
	 * Default Currency Creation의 Duplication Checking<br>
	 * 
	 * @param inputVO
	 * @return
	 * @throws DAOException
	 */
	public String searchDupChkCodeMgmtDtl(CodeMgmtDtlVO inputVO) throws DAOException {
		DBRowSet dbRowset = null;
		String dupFlg = "";
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			if( inputVO != null ){
				Map<String, String> mapVO = inputVO .getColumnValues();
				 
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOsearchDupChkCodeMgmtDtlRSQL(), param, velParam);
			if ( dbRowset!=null && dbRowset.next() ){
				dupFlg = dbRowset.getString(1);
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return dupFlg;
	}

}