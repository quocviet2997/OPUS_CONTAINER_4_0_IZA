/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CustomerDBDAO.java
*@FileTitle : Customer
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-09 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.customer.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.customer.basic.CustomerBCImpl;
import com.clt.bizcommon.customer.vo.SearchCustomerVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author sangyool pak
 * @see CustomerBCImpl 참조
 * @since J2EE 1.4
 */
public class CustomerDBDAO extends DBDAOSupport {
	
    /**
     * CustomerA의 모든 목록을 가져온다.<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List<SearchCustomerVO>
     * @throws DAOException
     */
    public List<SearchCustomerVO> searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws DAOException {
    	
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchCustomerVO> list = null;
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
         
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = 200 * (currentPage - 1) + 1;
		int endPart     = 200 * currentPage;
		
		param.put("startpart", startPart);
		param.put("endpart", endPart);
		param.put("include", include);
		velParam.put("include", include);
		
		log.debug("currentPage: " + currentPage);
		log.debug("startPart: " + startPart);
		log.debug("endPart: " + endPart);
		log.debug("nmd_cust_flg:" +  nmdCustFlg);
		try {
			if(!cust.equals("")){
				StringBuffer tmp = new StringBuffer();
				for (int i = cust.length(); i < 6; i++) {
//					cust = "0" + cust;
					tmp.append("0");
				}
				tmp.append(cust);
				cust = tmp.toString();
			}
			if(!custCd.equals("") || !cust.equals("")) {
				param.put("cust_cnt_cd", custCd);
    			velParam.put("cust_cnt_cd", custCd);
    			param.put("cust_seq", cust);
    			velParam.put("cust_seq", cust);
			}
			if(!custNm.equals("")) {
				param.put("cust_lgl_eng_nm", custNm);
	        	velParam.put("cust_lgl_eng_nm", custNm);
			}		
			if(!ofcCd.equals("")) {
				param.put("ofc_cd", ofcCd);
	        	velParam.put("ofc_cd", ofcCd);
			}
			if(!lgcyNm.equals("")) {
				param.put("lgcy_nm", lgcyNm);
	        	velParam.put("lgcy_nm", lgcyNm);
			}	
			if(!lgcyCd.equals("")) {
				param.put("lgcy_cd", lgcyCd);
				velParam.put("lgcy_cd", lgcyCd);
			}	
			if(!ctrtSrcCd.equals("")) {
				param.put("ctrt_src_cd", ctrtSrcCd);
				velParam.put("ctrt_src_cd", ctrtSrcCd);
			}	
//			if(!nmdCustFlg.equals("")) {
				param.put("nmd_cust_flg", nmdCustFlg);
				velParam.put("nmd_cust_flg", nmdCustFlg);
//			}	
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new CustomerDBDAOTotalCustomerRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CustomerDBDAOSearchCustomerRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCustomerVO.class);
			if (list.size() > 0)
				list.get(0).setMaxRows(cnt);  
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
     * CustomerA의 모든 목록을 가져온다.<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String mdmYN
	 * @param String deltFlg
	 * @param String locCd
	 * @param String creditFlg
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List<SearchCustomerVO>
     * @throws DAOException
     */
    public List<SearchCustomerVO> searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust, String mdmYN, String deltFlg, String locCd, String creditFlg, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws DAOException {
    	
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchCustomerVO> list = null;
    	DBRowSet dbRowset = null;
    	//query parameter
    	Map<String, Object> param = new HashMap<String, Object>();
    	//velocity parameter
    	Map<String, Object> velParam = new HashMap<String, Object>();
    	
    	// 페이징 처리
    	int currentPage = iPage;
    	int startPart   = 200 * (currentPage - 1) + 1;
    	int endPart     = 200 * currentPage;
    	
    	param.put("startpart", startPart);
    	param.put("endpart", endPart);
    	param.put("include", include);
    	velParam.put("include", include);
    	
    	log.debug("currentPage: " + currentPage);
    	log.debug("startPart: " + startPart);
    	log.debug("endPart: " + endPart);
    	
    	try {
    		if(!cust.equals("")){
    			StringBuffer tmp = new StringBuffer();
				for (int i = cust.length(); i < 6; i++) {
//					cust = "0" + cust;
					tmp.append("0");
				}
				tmp.append(cust);
				cust = tmp.toString();
    		}
    		if(!custCd.equals("") || !cust.equals("")) {
    			param.put("cust_cnt_cd", custCd);
    			velParam.put("cust_cnt_cd", custCd);
    			param.put("cust_seq", cust);
    			velParam.put("cust_seq", cust);
    		}
    		if(!custNm.equals("")) {
    			param.put("cust_lgl_eng_nm", custNm);
    			velParam.put("cust_lgl_eng_nm", custNm);
    		}		
    		if(!ofcCd.equals("")) {
    			param.put("ofc_cd", ofcCd);
    			velParam.put("ofc_cd", ofcCd);
    		}
//    		if(!mdmYN.equals("")) {
    			param.put("mdm_yn", mdmYN);
    			velParam.put("mdm_yn", mdmYN);
//    		}
    		if(!deltFlg.equals("")) {
    			param.put("delt_flg", deltFlg);
    			velParam.put("delt_flg", deltFlg);
    		}
    		if(!locCd.equals("")) {
    			param.put("loc_cd", locCd);
    			velParam.put("loc_cd", locCd);
    		}
    		if(!creditFlg.equals("")) {
    			param.put("credit_flg", creditFlg);
    			velParam.put("credit_flg", creditFlg);
    		}
    		if(!lgcyNm.equals("")) {
				param.put("lgcy_nm", lgcyNm);
	        	velParam.put("lgcy_nm", lgcyNm);
			}	
			if(!lgcyCd.equals("")) {
				param.put("lgcy_cd", lgcyCd);
				velParam.put("lgcy_cd", lgcyCd);
			}	
			if(!ctrtSrcCd.equals("")) {
				param.put("ctrt_src_cd", ctrtSrcCd);
				velParam.put("ctrt_src_cd", ctrtSrcCd);
			}	
//			if(!nmdCustFlg.equals("")) {
				param.put("nmd_cust_flg", nmdCustFlg);
				velParam.put("nmd_cust_flg", nmdCustFlg);
//			}
			
			log.debug("mdmYN: [" + mdmYN + "]");
	    	log.debug("nmdCustFlg: [" + nmdCustFlg + "]");
    		
    		dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new CustomerDBDAOTotalCustomerRSQL(), param, velParam);
    		int cnt = 0;
    		if (dbRowset.next()) {
    			cnt = dbRowset.getInt(1);
    		}
    		
    		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CustomerDBDAOSearchCustomerRSQL(), param, velParam);
    		list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCustomerVO.class);
    		if (list.size() > 0)
    			list.get(0).setMaxRows(cnt);  
    	}catch(SQLException se){
    		log.error(se.getMessage(),se);
    		throw new DAOException(new ErrorHandler(se).getMessage());
    	}catch(Exception ex){
    		log.error(ex.getMessage(),ex);
    		throw new DAOException(new ErrorHandler(ex).getMessage());
    	}
    	return list;
    }
}