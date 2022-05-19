/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtDBDAO.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.17
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic.CarrierMgmtBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;


/**
 * ALPS CarrierMgmtDBDAO <br>
 * - JDBC operation to process ALPS-Carrier system business logic.<br>
 * 
 * @author Viet Tran
 * @see CarrierMgmtBCImpl
 * @since J2EE 1.6
 */
public class CarrierMgmtDBDAO extends DBDAOSupport {

	/**
	 * Get a list of CarrierListVO object data from JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<CarrierListVO> listCarrierListVO(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
				List<String> jo_crr_cd_list = new ArrayList<>();
				if(carrierListVO.getJoCrrCd() != null){
					String[] listCarrier = carrierListVO.getJoCrrCd().split(",");
					for(int i=0; i<listCarrier.length; i++){
						jo_crr_cd_list.add(listCarrier[i]);
					}
				}
			
				param.putAll(mapVO);
				param.put("jo_crr_cd_list", jo_crr_cd_list);
				velParam.putAll(mapVO);
				velParam.put("jo_crr_cd_list", jo_crr_cd_list);
			}
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchCarrierRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
		 * Get a list of JO_CRR_CD from JOO_CARRIER table.<br>
		 * 
		 * @param carrierListVO a CarrierListVO object
		 * @return List<CarrierListVO>
		 * @exception DAOException
		 */
	public List<CarrierListVO> searchCarrierCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{			
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchCarrierCodeRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	 * Get a list of CRR_CD from MDM_CARRIER table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	public List<CarrierListVO> searchCrrCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
	
		try{			
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchCrrCdRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	 * Get a list of RLaneCode from MDM_REV_LANE table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	public List<CarrierListVO> searchRLaneCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchRLaneCodeRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	 * Get a list of CUST_CNT_CD, CUST_SEQ from MDM_CUSTOMER table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	public List<CarrierListVO> searchCustCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchCustCdRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	 * Get a list of TRD_CD from MDM_TRADE table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	public List<CarrierListVO> searchTrdCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchTrdCdRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	 * Get a list of VNDR_SEQ from MDM_VENDOR table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return List<CarrierListVO>
	 * @exception DAOException
	 */
	public List<CarrierListVO> searchVndrCode(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CarrierListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(carrierListVO != null){
				Map<String, String> mapVO = carrierListVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierMgmtDBDAOSearchVndrCdRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO .class);
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
	  * Insert a CarrierListVO object data out of JOO_CARRIER table.<br>
	  * 
	  * @param carrierListVO a CarrierListVO object
	  * @exception DAOException
	  * @exception Exception
	  */
	public void addCarrierListVO(CarrierListVO carrierListVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = carrierListVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			int result = sqlExe.executeUpdate((ISQLTemplate)new CarrierMgmtDBDAOInsertCarrierCSQL(), param, velParam);
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
	 * Update a CarrierListVO object data out of JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return int the value of item can be: <br>
	 * &nbsp&nbsp + Greater than or equal 0: the statement succeeded. And it is row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + SUCCESS_NO_INFO: the statement succeeded but didn't know row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + EXECUTE_FAILED: the statement was failed.
	 * @exception DAOException
	 * @exception Exception
	 */
	public int modifyCarrierListVO(CarrierListVO carrierListVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = carrierListVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new CarrierMgmtDBDAOUpdateCarrierUSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update SQL");
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
	 * Delete a CarrierListVO object data out of JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object
	 * @return int the value of item can be: <br>
	 * &nbsp&nbsp + Greater than or equal 0: the statement succeeded. And it is row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + SUCCESS_NO_INFO: the statement succeeded but didn't know row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + EXECUTE_FAILED: the statement was failed.
	 * @exception DAOException
	 * @exception Exception
	 */
	public int removeCarrierListVO(CarrierListVO carrierListVO) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = carrierListVO .getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("");
			result = sqlExe.executeUpdate((ISQLTemplate)new CarrierMgmtDBDAODeleteCarrierDSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to delete SQL");
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
	 * Insert a list of CarrierListVO object data out of JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVOS a list of CarrierListVO object
	 * @return int[] the value of items can be: <br>
	 * &nbsp&nbsp + Greater than or equal 0: the statement succeeded. And it is row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + SUCCESS_NO_INFO: the statement succeeded but didn't know row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + EXECUTE_FAILED: the statement was failed.
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addCarrierListVOS(List<CarrierListVO> carrierListVOS) throws DAOException,Exception {
		int insCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(carrierListVOS .size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CarrierMgmtDBDAOInsertCarrierCSQL(), carrierListVOS,null);
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
	 * Update a list of CarrierListVO object data out of JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVOS a list of CarrierListVO object
	 * @return int[] the value of items can be: <br>
	 * &nbsp&nbsp + Greater than or equal 0: the statement succeeded. And it is row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + SUCCESS_NO_INFO: the statement succeeded but didn't know row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + EXECUTE_FAILED: the statement was failed.
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifyCarrierListVOS(List<CarrierListVO> carrierListVOS) throws DAOException,Exception {
		int updCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(carrierListVOS .size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new CarrierMgmtDBDAOUpdateCarrierUSQL(), carrierListVOS,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
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
	 * Delete a list of CarrierListVO object data out of JOO_CARRIER table.<br>
	 * 
	 * @param carrierListVOS a list of CarrierListVO object
	 * @return int[] the value of items can be: <br>
	 * &nbsp&nbsp + Greater than or equal 0: the statement succeeded. And it is row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + SUCCESS_NO_INFO: the statement succeeded but didn't know row numbers was effect by the statement.<br>
	 * &nbsp&nbsp + EXECUTE_FAILED: the statement was failed.
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removeCarrierListVOS(List<CarrierListVO> carrierListVOS) throws DAOException,Exception {
		int delCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(carrierListVOS .size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new CarrierMgmtDBDAODeleteCarrierDSQL(), carrierListVOS,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
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
