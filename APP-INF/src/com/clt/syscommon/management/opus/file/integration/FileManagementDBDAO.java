/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileManagementDBDAO.java
*@FileTitle : File Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.file.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.syscommon.management.opus.file.basic.FileManagementBCImpl;


/**
 * NIS2010 FileManagementDBDAO <br>
 * - NIS2010-File system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jeong-Hoon, Kim
 * @see FileManagementBCImpl 참조
 * @since J2EE 1.4
 */
public class FileManagementDBDAO extends DBDAOSupport {

	/**
	 * FileManagementDBDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param comUpldFileVO
	 * @return List<ComUpldFileVO>
	 * @throws DAOException
	 */
	public List<ComUpldFileVO> getComUpldFile(ComUpldFileVO comUpldFileVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComUpldFileVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comUpldFileVO != null){
				Map<String, String> mapVO = comUpldFileVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new FileManagementDBDAOComUpldFileVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUpldFileVO .class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	
	/**
	 * 단건의 데이터를 생성한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @throws DAOException
	 * @throws Exception
	 */
	public void adddeleteFileComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVOCSQL(), param, velParam);
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
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @return int
	 * @throws DAOException
	 * @throws Exception
	 */
	public int modifydeleteFileComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVOUSQL(), param, velParam);
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
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @return int
	 * @throws DAOException
	 * @throws Exception
	 */
	public int removedeleteFileComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVODSQL(), param, velParam);
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
	 * 다건의 데이터를 일괄적으로 생성한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param insModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void adddeleteFileComUpldFileS(List<ComUpldFileVO> insModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int insCnt[] = null;
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVOCSQL(), insModels,null);
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
	 * 다건의 데이터를 일괄적으로 갱신한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param updModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void modifydeleteFileComUpldFileS(List<ComUpldFileVO> updModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int updCnt[] = null;
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVOUSQL(), updModels,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
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
	 * 다건의 데이터를 일괄적으로 삭제한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param delModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void removedeleteFileComUpldFileS(List<ComUpldFileVO> delModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int delCnt[] = null;
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVODSQL(), delModels,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
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
	 * 단건의 데이터를 생성한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @throws DAOException
	 * @throws Exception
	 */
	public void adddeleteComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVOCSQL(), param, velParam);
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
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @return int
	 * @throws DAOException
	 * @throws Exception
	 */
	public int modifydeleteComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVOUSQL(), param, velParam);
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
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param vo
	 * @return int
	 * @throws DAOException
	 * @throws Exception
	 */
	public int removedeleteComUpldFile(ComUpldFileVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new FileManagementDBDAOComUpldFileVODSQL(), param, velParam);
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
	 * 다건의 데이터를 일괄적으로 생성한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param insModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void adddeleteComUpldFileS(List<ComUpldFileVO> insModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int insCnt[] = null;
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVOCSQL(), insModels,null);
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
	 * 다건의 데이터를 일괄적으로 갱신한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param updModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void modifydeleteComUpldFileS(List<ComUpldFileVO> updModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int updCnt[] = null;
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVOUSQL(), updModels,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
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
	 * 다건의 데이터를 일괄적으로 삭제한다.<br>
	 * @author Jeong-Hoon, KIM
	 * @param delModels
	 * @throws DAOException
	 * @throws Exception
	 */
	public void removedeleteComUpldFileS(List<ComUpldFileVO> delModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int delCnt[] = null;
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new FileManagementDBDAOComUpldFileVODSQL(), delModels,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
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
	
}
