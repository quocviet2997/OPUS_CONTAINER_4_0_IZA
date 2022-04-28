/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAO.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.sinhvien.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.dou.sinhvien.sinhvien.basic.SinhVienBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.dou.sinhvien.sinhvien.vo.SinhVienVO;


/**
 * ALPS SinhVienDBDAO <br>
 * - ALPS-SinhVien system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Vi Nguyen
 * @see SinhVienBCImpl 참조
 * @since J2EE 1.6
 */
public class SinhVienDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO sinhVienVO
	 * @return List<SinhVienVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<SinhVienVO> searchSinhVien(SinhVienVO sinhVienVO) throws DAOException {
		 DBRowSet dbRowset = null;
		 List<SinhVienVO> list = new ArrayList();
		 //query parameter
		 Map<String, Object> param = new HashMap<String, Object>();
		 //velocity parameter
		 Map<String, Object> velParam = new HashMap<String, Object>();
		 
		 try{
			 if(sinhVienVO != null){
				 Map<String, String> mapVO = sinhVienVO.getColumnValues();
				 List<String> obj_list_no = new ArrayList<>();
				 if(null != sinhVienVO.getKhoahoc()){
					 String[] khoaHocs = sinhVienVO.getKhoahoc().split(",");
					 for(int i = 0; i < khoaHocs.length; i++){
						 obj_list_no.add(khoaHocs[i]);
						 }
					 }
				 param.putAll(mapVO);
				 param.put("obj_list_no", obj_list_no);
					
				 velParam.putAll(mapVO);
				 velParam.put("obj_list_no", obj_list_no);
			 }
			 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SinhVienDBDAOSinhVienVORSQL(), param, velParam);
			 list = (List) RowSetUtil.rowSetToVOs(dbRowset, SinhVienVO .class);
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
	 * @param SinhVienVO sinhVienVO
	 * @exception DAOException
	 * @exception Exception
	 */
	public void addmanageSinhVien(SinhVienVO sinhVienVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = sinhVienVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			int result = sqlExe.executeUpdate((ISQLTemplate)new SinhVienDBDAOSinhVienVOCSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO sinhVienVO
	 * @return int
	 * @exception DAOException
	 * @exception Exception
	 */
	public int modifymanageSinhVien(SinhVienVO sinhVienVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = sinhVienVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new SinhVienDBDAOSinhVienVOUSQL(), param, velParam);
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
	 * @param SinhVienVO sinhVienVO
	 * @return int
	 * @exception DAOException
	 * @exception Exception
	 */
	public int removemanageSinhVien(SinhVienVO sinhVienVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = sinhVienVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new SinhVienDBDAOSinhVienVODSQL(), param, velParam);
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
	 * @param List<SinhVienVO> sinhVienVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addmanageSinhVienS(List<SinhVienVO> sinhVienVO) throws DAOException,Exception {
		int insCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(sinhVienVO .size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SinhVienDBDAOSinhVienVOCSQL(), sinhVienVO,null);
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
	 * @param List<SinhVienVO> sinhVienVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifymanageSinhVienS(List<SinhVienVO> sinhVienVO) throws DAOException,Exception {
		int updCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(sinhVienVO .size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SinhVienDBDAOSinhVienVOUSQL(), sinhVienVO,null);
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
	 * @param List<SinhVienVO> sinhVienVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removemanageSinhVienS(List<SinhVienVO> sinhVienVO) throws DAOException,Exception {
		int delCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(sinhVienVO .size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SinhVienDBDAOSinhVienVODSQL(), sinhVienVO,null);
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
	
	@SuppressWarnings("unchecked")
	public List<SinhVienVO> searchKhoaHoc() throws DAOException {
		DBRowSet dbRowset = null;
		 List<SinhVienVO> list = new ArrayList();
		 //query parameter
		 Map<String, Object> param = new HashMap<String, Object>();
		 //velocity parameter
		 Map<String, Object> velParam = new HashMap<String, Object>();
		 
		 try{
			
			 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SinhVienDBDAOSinhVienSearchKhoaHocRSQL(), param, velParam);
			 list = (List)RowSetUtil.rowSetToVOs(dbRowset, SinhVienVO .class);
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
	public List<SinhVienVO> searchKhoaHocDetails() throws DAOException {
		 DBRowSet dbRowset = null;
		 List<SinhVienVO> list = new ArrayList();
		 //query parameter
		 Map<String, Object> param = new HashMap<String, Object>();
		 //velocity parameter
		 Map<String, Object> velParam = new HashMap<String, Object>();
		 
		 try{
		
			 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SinhVienDBDAOKhoaHocSearchRSQL(), param, velParam);
			 list = (List)RowSetUtil.rowSetToVOs(dbRowset, SinhVienVO .class);
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