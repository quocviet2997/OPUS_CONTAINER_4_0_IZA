/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CustGrpDBDAO.java
*@FileTitle : CustGrp
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : sungho park
*@LastVersion : 1.0
* 2012-02-21 sungho park
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.custgroup.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.custgroup.basic.CustGroupBCImpl;
import com.clt.bizcommon.custgroup.vo.SearchCustGroupVO;
import com.clt.bizcommon.customer.integration.CustomerDBDAOSearchCustomerRSQL;
import com.clt.bizcommon.customer.integration.CustomerDBDAOTotalCustomerRSQL;
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
 * @author sungho park
 * @see CustGroupBCImpl 참조
 * @since J2EE 1.4
 */
public class CustGroupDBDAO extends DBDAOSupport {
	
    /**
     * CustGroup의 모든 목록을 가져온다.<br>
	 * @param String custGrpId
	 * @param String custGrpNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String mdmYn
	 * @param String deltFlg
	 * @param String custGrpAbbrNm
	 * @return List<SearchCustGroupVO>
     * @throws DAOException
     */
    public List<SearchCustGroupVO> searchCustGroupList(String custGrpId, String custGrpNm, String ofcCd, int iPage, String mdmYn, String deltFlg, String custGrpAbbrNm) throws DAOException {
    	
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchCustGroupVO> list = null;
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
		//param.put("include", include);
		//velParam.put("include", include);
		
		log.debug("currentPage: " + currentPage);
		log.debug("startPart: " + startPart);
		log.debug("endPart: " + endPart);
		
		try {
			
			if(!custGrpId.equals("")) {
	        	param.put("cust_grp_id", custGrpId);
	        	velParam.put("cust_grp_id", custGrpId);
			}
			if(!custGrpNm.equals("")) {
				param.put("cust_grp_nm", custGrpNm);
	        	velParam.put("cust_grp_nm", custGrpNm);
			}
			
			if(!custGrpAbbrNm.equals("")) {
				param.put("cust_grp_abbr_nm", custGrpAbbrNm);
	        	velParam.put("cust_grp_abbr_nm", custGrpAbbrNm);
			}		
			
			param.put("delt_flg", deltFlg);
	        velParam.put("delt_flg", deltFlg);
			
			param.put("mdm_yn", mdmYn);
	        velParam.put("mdm_yn", mdmYn);
			
			log.info("param::"+param);
			log.info("velParam::"+velParam);
			
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new CustgroupDBDAOSearchTotCustGroupRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}
//			log.info("ttttttttttttttttttttt");
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CustgroupDBDAOSearchCustGroupRSQL(), param, velParam);
//			log.info("aaaaaaaaaaaaaaaaaaaaaaa");
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCustGroupVO.class);
//			log.info("bbbbbbbbbbbbbbbbbbbbbbbbb");
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