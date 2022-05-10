/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CodeManagementDBDAO.java
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02.codemanagement.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.esm.clv.training02.codemanagement.basic.CodeManagementBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtDtlVO;


/**
 * ALPS CodeManagementDBDAO <br>
 * - ALPS-Training02 system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Viet Tran
 * @see CodeManagementBCImpl 참조
 * @since J2EE 1.6
 */
public class CodeManagementDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO codeMgmtVO
	 * @return List<CodeMgmtVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<CodeMgmtVO> searchCodeMgmt(CodeMgmtVO codeMgmtVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CodeMgmtVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(codeMgmtVO != null){
				Map<String, String> mapVO = codeMgmtVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOSearchCodeRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CodeMgmtVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	
	 @SuppressWarnings("unchecked")
	public List<CodeMgmtDtlVO> searchCodeMgmtDtl(CodeMgmtDtlVO codeMgmtDtlVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CodeMgmtDtlVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(codeMgmtDtlVO != null){
				Map<String, String> mapVO = codeMgmtDtlVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CodeManagementDBDAOSearchCodeDetailRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CodeMgmtDtlVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	 
//	/**
//	 * [처리대상] 정보를 [행위] 합니다.<br>
//	 * 
//	 * @param CodeMgmtVO codeMgmtVO
//	 * @exception DAOException
//	 * @exception Exception
//	 */
//	public void addCodeMgmtVO(CodeMgmtVO codeMgmtVO) throws DAOException,Exception {
//		//query parameter
//		Map<String, Object> param = new HashMap<String, Object>();
//		//velocity parameter
//		Map<String, Object> velParam = new HashMap<String, Object>();
//		try {
//			Map<String, String> mapVO = codeMgmtVO .getColumnValues();
//			
//			param.putAll(mapVO);
//			velParam.putAll(mapVO);
//			
//			SQLExecuter sqlExe = new SQLExecuter("");
//			int result = sqlExe.executeUpdate((ISQLTemplate)new CodeManagementDBDAOCreateCodeCSQL(), param, velParam);
//			if(result == Statement.EXECUTE_FAILED)
//					throw new DAOException("Fail to insert SQL");
//		} catch(SQLException se) {
//			log.error(se.getMessage(),se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch(Exception ex) {
//			log.error(ex.getMessage(),ex);
//			throw new DAOException(new ErrorHandler(ex).getMessage());
//		}
//	}
//	
//	/**
//	 * [처리대상] 정보를 [행위] 합니다.<br>
//	 * 
//	 * @param CodeMgmtVO codeMgmtVO
//	 * @return int
//	 * @exception DAOException
//	 * @exception Exception
//	 */
//	public int modifyCodeMgmtVO(CodeMgmtVO codeMgmtVO) throws DAOException,Exception {
//		//query parameter
//		Map<String, Object> param = new HashMap<String, Object>();
//		//velocity parameter
//		Map<String, Object> velParam = new HashMap<String, Object>();
//		
//		int result = 0;
//		try {
//			Map<String, String> mapVO = codeMgmtVO .getColumnValues();
//			
//			param.putAll(mapVO);
//			velParam.putAll(mapVO);
//			
//			SQLExecuter sqlExe = new SQLExecuter("");
//			result = sqlExe.executeUpdate((ISQLTemplate)new CodeManagementDBDAOUpdateCodeUSQL(), param, velParam);
//			if(result == Statement.EXECUTE_FAILED)
//					throw new DAOException("Fail to insert SQL");
//		} catch(SQLException se) {
//			log.error(se.getMessage(),se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch(Exception ex) {
//			log.error(ex.getMessage(),ex);
//			throw new DAOException(new ErrorHandler(ex).getMessage());
//		}
//		return result;
//	}
//	
//	/**
//	 * [처리대상] 정보를 [행위] 합니다.<br>
//	 * 
//	 * @param CodeMgmtVO codeMgmtVO
//	 * @return int
//	 * @exception DAOException
//	 * @exception Exception
//	 */
//	public int removeCodeMgmtVO(CodeMgmtVO codeMgmtVO) throws DAOException,Exception {
//		//query parameter
//		Map<String, Object> param = new HashMap<String, Object>();
//		//velocity parameter
//		Map<String, Object> velParam = new HashMap<String, Object>();
//		
//		int result = 0;
//		try {
//			Map<String, String> mapVO = codeMgmtVO .getColumnValues();
//			
//			param.putAll(mapVO);
//			velParam.putAll(mapVO);
//			
//			SQLExecuter sqlExe = new SQLExecuter("");
//			result = sqlExe.executeUpdate((ISQLTemplate)new CodeManagementDBDAODeleteCodeDSQL(), param, velParam);
//			if(result == Statement.EXECUTE_FAILED)
//					throw new DAOException("Fail to insert SQL");
//		} catch(SQLException se) {
//			log.error(se.getMessage(),se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch(Exception ex) {
//			log.error(ex.getMessage(),ex);
//			throw new DAOException(new ErrorHandler(ex).getMessage());
//		}
//		return result;
//	}
	 
		/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO codeMgmtVO
	 * @return int
	 * @exception DAOException
	 * @exception Exception
	 */
	public int removeCodeDetailByCodeID(List<String> listCode) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			List<String> codeID_list = new ArrayList<>();
			
			for(int i=0; i< listCode.size(); i++){
				codeID_list.add(listCode.get(i));
			}
			
			param.put("codeID_list", codeID_list);
			velParam.put("codeID_list", codeID_list);
			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new CodeManagementDBDAODeleteCodeDtlByCodeIDDSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addCodeMgmtVOS(List<CodeMgmtVO> codeMgmtVO) throws DAOException,Exception {
		int insCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(codeMgmtVO .size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOCreateCodeCSQL(), codeMgmtVO,null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return insCnt;
	}
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifyCodeMgmtVOS(List<CodeMgmtVO> codeMgmtVO) throws DAOException,Exception {
		int updCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(codeMgmtVO .size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOUpdateCodeUSQL(), codeMgmtVO,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return updCnt;
	}
	
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removeCodeMgmtVOS(List<CodeMgmtVO> codeMgmtVO) throws DAOException,Exception {
		int delCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			List<String> codeId = new ArrayList<String>();
			if(codeMgmtVO .size() > 0){
				for(CodeMgmtVO item: codeMgmtVO){
					codeId.add(item.getIntgCdId());
				}
				
				removeCodeDetailByCodeID(codeId);
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAODeleteCodeDSQL(), codeMgmtVO,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return delCnt;
	}
	
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addCodeMgmtDtlVOS(List<CodeMgmtDtlVO> codeMgmtDtlVO) throws DAOException,Exception {
		int insCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(codeMgmtDtlVO .size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOCreateCodeDetailCSQL(), codeMgmtDtlVO,null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return insCnt;
	}
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifyCodeMgmtDtlVOS(List<CodeMgmtDtlVO> codeMgmtDtlVO) throws DAOException,Exception {
		int updCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(codeMgmtDtlVO .size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAOUpdateCodeDetailUSQL(), codeMgmtDtlVO,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return updCnt;
	}
	
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param List<CodeMgmtVO> codeMgmtVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removeCodeMgmtDtlVOS(List<CodeMgmtDtlVO> codeMgmtDtlVO) throws DAOException,Exception {
		int delCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			List<String> codeId = null;
			if(codeMgmtDtlVO .size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CodeManagementDBDAODeleteCodeDetailDSQL(), codeMgmtDtlVO,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return delCnt;
	}
}