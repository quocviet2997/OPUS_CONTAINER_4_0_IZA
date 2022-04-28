/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupCommonDBDAO.java
*@FileTitle : SUPCommon Code 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.supcommon.supcommon.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.supcommon.supcommon.basic.SupCommonBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * OPUS_CNTR-SetupManagement <br>
 * - OPUS_CNTR-SetupManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Yoon-Tae, Jung
 * @see SupCommonBCImpl 참조
 * @since J2EE 1.6
 */

public class SupCommonDBDAO extends DBDAOSupport {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Customer Country Code 정보를 가져온다<br>
	 * 
	 * @param custCntCd String
	 * @param custSeq String
	 * @return String
	 * @throws DAOException
	 */
	 
	public String checkCustomerCountryCode(String custCntCd, String custSeq) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();
	
		try{
			
			param.put("cust_cnt_cd", custCntCd);	//Customer Country Code
			param.put("cust_seq", custSeq);			//Customer Sequence
			
			vparam.put("cust_seq", custSeq);			//Customer Sequence
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SupCommonDBDAOCheckCustomerCountryCodeRSQL(), param, vparam);
			if(dbRowset.next()) {
				result = dbRowset.getString("cust_cnt_cd");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * Continent Code 정보를 가져온다<br>
	 * 
	 * @param lstContiDesc List<String>
	 * @return String
	 * @throws DAOException
	 */
	public String checkContinentCode(List<String> lstContiDesc) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();
	
		try{
			
			vparam.put("lst_conti_desc", lstContiDesc.iterator());
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SupCommonDBDAOCheckContinentCodeRSQL(), null, vparam);
			if(dbRowset.next()) {
				result = dbRowset.getString("conti_cd");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * Country Code 정보를 가져온다<br>
	 * 
	 * @param lstCntDesc List<String>
	 * @return String
	 * @throws DAOException
	 */
	public String checkCountryCode(List<String> lstCntDesc) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();
	
		try{
			
			vparam.put("lst_cnt_desc", lstCntDesc.iterator());
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SupCommonDBDAOCheckCountryCodeRSQL(), null, vparam);
			if(dbRowset.next()) {
				result = dbRowset.getString("cnt_cd");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * Service Lane Code 정보를 가져온다<br>
	 * 
	 * @param slanCd String
	 * @return String
	 * @throws DAOException
	 */
	public String checkServiceLaneCode(String slanCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//sql parameter
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			
			param.put("slan_cd", slanCd);			//Service Lane Code
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SupCommonDBDAOCheckServiceLaneCodeRSQL(), param, null);
			if(dbRowset.next()) {
				result = dbRowset.getString("vsl_slan_cd");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * Port Code 정보를 가져온다<br>
	 * 
	 * @param portCd String
	 * @return String
	 * @throws DAOException
	 */
	public String checkPortCode(String portCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//sql parameter
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("port_cd", portCd);			//Service Lane Code
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SupCommonDBDAOCheckPortCodeRSQL(), param, null);
			if(dbRowset.next()) {
				result = dbRowset.getString("loc_cd");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}

}
