/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FinCommonDBDAO.java
 *@FileTitle : FinCommonDBDAO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
 * 
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * FinCommonDBDAO <br>
 * - FinCommonBC system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author 
 * @see   FinCommonBCImpl 참조
 * @since J2EE 1.6
 */
public class FinCommonDBDAO  extends DBDAOSupport{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * AR Finance Direction Conversion Slan에 해당하는 정보를 가져온다
	 * 
	 * @param String slanCd
	 * @return String
	 * @exception EventException
	 */
	public String checkServiceLaneCode(String slanCd) throws DAOException,Exception {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("slan_cd", slanCd);
			vparam.put("slan_cd", slanCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckServiceLaneCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("VSL_SLAN_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}

	/**
	 * AR Finance Direction Conversion Sconti에 해당하는 정보를 가져온다
	 * 
	 * @param String scontiCd
	 * @return String
	 * @exception EventException
	 */
	public String checkPolSubcontiCode(String scontiCd) throws DAOException,Exception {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("sconti_cd", scontiCd);
			vparam.put("sconti_cd", scontiCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckPolSubcontiCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("SCONTI_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}
	
	/**
	 * AR Finance Direction Conversion Rlane에 해당하는 정보를 가져온다
	 * 
	 * @param String rlaneCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRevenueLaneCode(String rlaneCd) throws DAOException,Exception {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("rlane_cd", rlaneCd);
			vparam.put("rlane_cd", rlaneCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckRevenueLaneCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("RLANE_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}

	/**
	 * AR Master Revenue VVD Revenue Port Code에 해당하는 정보를 가져온다
	 * 
	 * @param String revPortCd
	 * @return String
	 * @throws DAOException 
	 * @exception EventException
	 */
	public String checkRevenuePortCode(String revPortCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("rev_port_cd", revPortCd);
			vparam.put("rev_port_cd", revPortCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckRevenuePortCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("LOC_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}

	/**
	 * MDM_VSL_CNTR table에서 Vessel Code에 해당하는 정보를 가져온다
	 * 
	 * @param String vslCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVesselCode(String vslCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("vsl_cd", vslCd);
			vparam.put("vsl_cd", vslCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckVesselCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("VSL_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}
	
	/**
	 * MDM_CURRENCY table에서 Currency Code에 해당하는 정보를 가져온다
	 * 
	 * @param String currCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCurrencyCode(String currCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("curr_cd", currCd);
			vparam.put("curr_cd", currCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckCurrencyCodeRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("curr_cd");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}
	
	/**
	 * AR_MST_REV_VVD table에서 VVD에 해당하는 정보를 가져온다
	 * 
	 * @param String vvd
	 * @return String
	 * @exception EventException
	 */
	public String checkArMasterRevenueVvd(String vvd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.put("vvd", vvd);
			vparam.put("vvd", vvd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckArMasterRevenueVvdRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("vsl_cd");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}
	
	/**
	 * InvoiceNo의 중복정보를 체크한다 : 공통
	 * @param CheckInvoiceNoVO checkInvoiceNoVO
	 * @return List<CheckInvoiceNoVO>
	 * @exception DAOException
	 */
	public List<CheckInvoiceNoVO> checkInvoiceNo(CheckInvoiceNoVO checkInvoiceNoVO) throws DAOException {
		log.debug("\n DAO.checkInvoiceNo \n");
		
		DBRowSet dbRowset = null;
		List<CheckInvoiceNoVO> resultVOs = null;

		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			param.putAll(checkInvoiceNoVO.getColumnValues());
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOCheckInvoiceNoRSQL(), param, vparam);
			resultVOs = (List)RowSetUtil.rowSetToVOs(dbRowset, CheckInvoiceNoVO.class);

			if(!resultVOs.isEmpty()){
				log.info("\n[][checkInvoiceNo] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> inv_no :" + checkInvoiceNoVO.getInvNo());
				throw new DAOException((new ErrorHandler("CSR10005", new String[]{checkInvoiceNoVO.getInvNo()})).getMessage());
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch (DAOException de) { 
			log.error(de.getMessage(), de);
			throw de;
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return resultVOs;
	}
	
	/**
	 * Search Functional Currency code
	 * 
	 * @return String
	 * @exception EventException
	 */
	public String searchFunctionalCurrency() throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			//query parameter
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinCommonDBDAOsearchFunctionalCurrencyRSQL(), param, vparam);
			if(dbRowset.next()){
				result = dbRowset.getString("LU_CD");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return result;
	}
}
