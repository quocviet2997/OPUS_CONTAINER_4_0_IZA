/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : CcdCommonDBDAO.java
*@FileTitle : Office Access Group
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.16
*@LastModifier : 
*@LastVersion : 1.0
* 2011.02.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration;
 
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.basic.CcdCommonBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

 
/**
 * OPUS CcdCommonDBDAO <br>
 * - OPUS-CcdCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 *  
 * @author 
 * @see CcdCommonBCImpl 참조
 * @since J2EE 1.6
 */
public class CcdCommonDBDAO extends DBDAOSupport {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Account Code 유무를 확인.<br>
	 * 
	 * @param String acctCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkAcctCode(String acctCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
			try {
				if(acctCd != null){
					param.put("acct_cd"    ,acctCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckAcctCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}

			return dbRowset;
	}
	
	/**
	 * Customer Code 유무를 확인.<br>
	 * 
	 * @param String custCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkCustCode(String custCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
			try {
				if(custCd != null){
					param.put("cust_cd"    ,custCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckCustCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}

			return dbRowset;
	}
	
	/**
	 * Country Code 유무를 확인.<br>
	 * 
	 * @param String cntCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkCntCode(String cntCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		Map<String, Object> param = new HashMap<String, Object>();//parameter
			try {
				if(cntCd != null){
					param.put("cnt_cd",cntCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckCntCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}

			return dbRowset;
	}
	
	/**
	 * Currency Code 유무를 확인.<br>
	 * 
	 * @param String currCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkCurrCode(String currCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(currCd != null){
					param.put("curr_cd",currCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckCurrCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}

	/**
	 * Group Commodity Code 유무를 확인.<br>
	 * 
	 * @param String grpCmdt
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkGrpCmdt(String grpCmdt) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(grpCmdt != null){
					param.put("grp_cmdt_cd",grpCmdt);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckGrpCmdtRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Location Code 유무를 확인.<br>
	 * 
	 * @param String locCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkLocCode(String locCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(locCd != null){
					param.put("loc_cd" ,locCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckLocCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Office Code 유무를 확인.<br>
	 * 
	 * @param String ofcCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkOfcCode(String ofcCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
			try {
				if(ofcCd != null){
					param.put("ofc_cd" ,ofcCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckOfcCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Repository Commodity Code 유무를 확인.<br>
	 * 
	 * @param String repCmdt
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkRepCmdt(String repCmdt) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(repCmdt != null){
					param.put("rep_cmdt_cd" ,repCmdt);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckRepCmdtRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Region Commodity Code 유무를 확인.<br>
	 * 
	 * @param String rgnCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkRgnCode(String rgnCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(rgnCd != null){
					param.put("rgn_cd",rgnCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckRgnCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Sales Repository Code 유무를 확인.<br>
	 * 
	 * @param String slsRepCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkSlsRepCode(String slsRepCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(slsRepCd != null){
					param.put("srep_cd" ,slsRepCd);
				}			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckSlsRepCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * State Code 유무를 확인.<br>
	 * 
	 * @param String stateCd
	 * @param String cntCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkStateCode(String stateCd, String cntCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(stateCd != null){
					param.put("ste_cd", stateCd);
				}
				param.put("cnt_cd", cntCd);
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckStateCodeRSQL(), param, param);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Sub Continent Code 유무를 확인.<br>
	 * 
	 * @param String scontiCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkSubConti(String scontiCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(scontiCd != null){
					param.put("sconti_cd" ,scontiCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckSubContiRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Sub Trade Code 유무를 확인.<br>
	 * 
	 * @param String strdCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkSubTrdCode(String strdCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(strdCd != null){
					param.put("sub_trd_cd" ,strdCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckSubTrdCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}

	/**
	 * Vender Code 를 체크합니다.<br>
	 * 
	 * @param String vndrCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkVndrCode(String vndrCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(vndrCd != null){
					param.put("vndr_cd",vndrCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckVndrCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}	
	
	/**
	 * Vender Code 를 체크합니다.<br>
	 * 
	 * @param String vndrCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkVndrCodeName(String vndrCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(vndrCd != null){
					param.put("vndr_cd",vndrCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckVndrCodeNameRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}	
	
	/**
	 * Trade Code 유무를 확인.<br>
	 * 
	 * @param String trdCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkTrdCode (String trdCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(trdCd != null){
					param.put("trd_cd" ,trdCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckTrdCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Vessel Service Lane Code 유무를 확인.<br>
	 * 
	 * @param String slanCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkVslSlanCode(String slanCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(slanCd != null){
					param.put("vsl_slan_cd" ,slanCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckVslSlanCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Yard Code 유무를 확인.<br>
	 * 
	 * @param String ydCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkYardCode(String ydCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter			
			try {
				if(ydCd != null){
					param.put("yd_cd" ,ydCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckYardCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Zone Code 유무를 확인.<br>
	 * 
	 * @param String znCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkZoneCode (String znCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(znCd != null){
					param.put("zn_cd" ,znCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckZoneCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Carrier Code 유무를 확인.<br>
	 * 
	 * @param String crrCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkCrrCode (String crrCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(crrCd != null){
					param.put("crr_cd" ,crrCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckCrrCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * CONTINENT 콤보의 목록을 가져온다.<br>
	 * MDM_CONTINENT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchContiCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","Conti");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Group Commodity 콤보의 목록을 가져온다.<br>
	 * MDM_GRP_CMDT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchGrpCmdtList() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","GrpCmdt");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Repository Commodity 콤보의 목록을 가져온다.<br>
	 * MDM_REP_CMDT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchRepCmdtList() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","RepCmdt");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Rep. Charge Code List 콤보의 목록을 가져온다.<br>
	 * MDM_CONTINENT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchRepChgCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","RepChg");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 5. Sub Trade Code List 콤보의 목록을 가져온다.<br>
	 * MDM_SUB_TRD
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchSubTradeCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","SubTrade");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 6. Trade Code List 콤보의 목록을 가져온다.<br>
	 * MDM_TRADE
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchTradeCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","Trade");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 7. Container Size Code List 콤보의 목록을 가져온다.<br>
	 * MDM_CNTR_SZ
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchCntrSize() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","CntrSize");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 8. Container Type Code List 콤보의 목록을 가져온다.<br>
	 * MDM_CNTR_TP
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchCntrType() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","CntrType");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * 9. Container Type/Size Code List 콤보의 목록을 가져온다.<br>
	 * MDM_CNTR_TP_SZ
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchCntrTypeSize() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","CntrTpSz");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * 10. Package Code List 콤보의 목록을 가져온다.<br>
	 * MDM_PCK_TP
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchPackage() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","Package");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * 11. Office Code List 콤보의 목록을 가져온다.<br>
	 * MDM_ORGANIZATION
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchOffice() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			//velParam.put("codeItem","Package");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchOfficeList(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 12. RCC Code List 콤보의 목록을 가져온다.<br>
	 * MDM_EQ_ORZ_CHT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchRccCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			//velParam.put("codeItem","Package");				
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchRccCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 13. MDA History Table List 콤보의 목록을 가져온다.<br>
	 * MDM_EQ_ORZ_CHT
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	/**
	 * 10. Package Code List 콤보의 목록을 가져온다.<br>
	 * MDM_PCK_TP
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchTblCode() throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			velParam.put("codeItem","TBL");
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}	
	
	/**
	 * 14. MDA History Column List 콤보의 목록을 가져온다.<br>
	 * MDM_EQ_ORZ_CHT
	 * 
	 * @param String TBL
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet searchColCode(String TBL) throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
		try{
			velParam.put("codeItem","COL");
			if(TBL != null && !"".equals(TBL)){
				param.put("tbl", TBL);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchComCodeListRSQL(), param, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Group Customer Code 유무를 확인.<br>
	 * 
	 * @param String grpCustCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkGrpCustCode(String grpCustCd) throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
		try{
			if(grpCustCd != null){
				param.put("cust_grp_id" ,grpCustCd);
			}		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckGrpCustCodeRSQLRSQL(), param, null);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Vender Country Code를 조회합니다.<br>
	 * 
	 * @param String vndrCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchVndrCntCode(String vndrCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(vndrCd != null){
					param.put("vndr_cd",vndrCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchVndrCntCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * Lease Company Yard Code Check<br>
	 * 
	 * @param String ydCd
	 * @return DBRowSet DB
	 * @throws DAOException
	 */
	public DBRowSet checkLseCoYdCode(String ydCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(ydCd != null){
					param.put("yd_cd",ydCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckLseCoYdCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * EQ SCC Code Check<br>
	 * 
	 * @param String sccCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkSccCode(String sccCd) throws DAOException {
		DBRowSet dbRowset = null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체		
		Map<String, Object> param = new HashMap<String, Object>();//parameter		
			try {
				if(sccCd != null){
					param.put("scc_cd",sccCd);
				}				
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckSccCodeRSQL(), param, null);
			} catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());			
			} catch(Exception ex){
				log.error(ex.getMessage(),ex);			
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return dbRowset;
	}
	
	/**
	 * PSA Code를 조회합니다.<br>
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchPsaCode() throws DAOException {
		DBRowSet dbRowset = null;
		Map<String, Object> velParam = new HashMap<String, Object>();		
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOSearchPsaCodeListRSQL(), null, velParam);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	
	/**
	 * Group Customer Code 유무를 확인.<br>
	 * 
	 * @param String grpCustCd
	 * @param String getCustCntCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet checkCntResult(String grpCustCd, String getCustCntCd) throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
		try{
			if(grpCustCd != null){
				param.put("cust_grp_id" ,grpCustCd);
				param.put("cust_cnt_cd" ,getCustCntCd);
			}		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckCntResultRSQL(), param, null);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * Check whether Active Yard Code exists.<br>
	 * 
	 * @param String locCd
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet checkActiveYardCode(String locCd) throws DAOException {
		DBRowSet dbRowset = new DBRowSet(); // 데이터 전송을 위해 DB ResultSet을 구현한 객체	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();//parameter	
		try{
			if(locCd != null){
				param.put("loc_cd" ,locCd);
			}		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CcdCommonDBDAOCheckActiveYardCodeRSQL(), param, null);			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
}