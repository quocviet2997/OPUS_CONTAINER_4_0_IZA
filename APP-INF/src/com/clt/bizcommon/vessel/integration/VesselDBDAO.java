/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VesselDBDAO.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.vessel.basic.VesselBCImpl;
import com.clt.bizcommon.vessel.vo.SearchVesselLIstVO;
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
 * @see VesselBCImpl 참조
 * @since J2EE 1.4
 */
public class VesselDBDAO extends DBDAOSupport {

    /**
     * Vessel의 모든 목록을 가져온다.<br>
     * @param vslCd
     * @param vslEngNm
     * @param carCd
     * @param iPage
     * @param callSgnNo
     * @param lloydNo
     * @return List<SearchVesselLIstVO>
     * @throws DAOException
     */
    public List<SearchVesselLIstVO> searchVesselList(String vslCd, String vslEngNm, String carCd, int iPage , String callSgnNo, String lloydNo) throws DAOException {
    	DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchVesselLIstVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		if(!vslCd.equals("")) {
			param.put("vsl_cd", vslCd);
			velParam.put("vsl_cd", vslCd);
		}
		if(!vslEngNm.equals("")) {
			param.put("vsl_eng_nm", vslEngNm);
			velParam.put("vsl_eng_nm", vslEngNm);
		}
		if(!carCd.equals("")) {
			param.put("crr_cd", carCd);
			velParam.put("crr_cd", carCd);
		}
		if(!callSgnNo.equals("")) {
			param.put("call_sgn_no", callSgnNo);
			velParam.put("call_sgn_no", callSgnNo);
		}
		if(!lloydNo.equals("")) {
			param.put("lloyd_no", lloydNo);
			velParam.put("lloyd_no", lloydNo);
		}
		param.put("startpart", startPart);
		param.put("endpart", endPart);
		
		try {
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new VesselDBDAOTotalVesselRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VesselDBDAOSearchVesselLIstRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchVesselLIstVO.class);
			if (list.size() > 0){
				list.get(0).setMaxRows(cnt); 
			}
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
     * Vessel의 모든 목록을 가져온다.<br>
     * @param vslCd
     * @param vslEngNm
     * @param carCd
     * @param iPage
     * @param callSgnNo
     * @param lloydNo
     * @param mdmYN
     * @param deltFlg
     * @param fdrDiv_cd
     * @return List<SearchVesselLIstVO>
     * @throws DAOException
     */
	public List<SearchVesselLIstVO> searchVesselList(String vslCd, String vslEngNm, String carCd, int iPage, String callSgnNo, String lloydNo, String mdmYN, String deltFlg, String fdrDiv_cd) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchVesselLIstVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		if(!vslCd.equals("")) {
			param.put("vsl_cd", vslCd);
			velParam.put("vsl_cd", vslCd);
		}
		if(!vslEngNm.equals("")) {
			param.put("vsl_eng_nm", vslEngNm);
			velParam.put("vsl_eng_nm", vslEngNm);
		}
		if(!carCd.equals("")) {
			param.put("crr_cd", carCd);
			velParam.put("crr_cd", carCd);
		}
		if(!callSgnNo.equals("")) {
			param.put("call_sgn_no", callSgnNo);
			velParam.put("call_sgn_no", callSgnNo);
		}
		if(!lloydNo.equals("")) {
			param.put("lloyd_no", lloydNo);
			velParam.put("lloyd_no", lloydNo);
		}
		if(!mdmYN.equals("")) {
			param.put("mdm_yn", mdmYN);
			velParam.put("mdm_yn", mdmYN);
		}
		if(!deltFlg.equals("")) {
			param.put("delt_flg", deltFlg);
			velParam.put("delt_flg", deltFlg);
		}
		if(!fdrDiv_cd.equals("")) {
			param.put("fdr_div_cd", fdrDiv_cd);
			velParam.put("fdr_div_cd", fdrDiv_cd);
		}
		
		param.put("startpart", startPart);
		param.put("endpart", endPart);
		
		
		try {
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new VesselDBDAOTotalVesselRSQL(), param, velParam);

			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VesselDBDAOSearchVesselLIstRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchVesselLIstVO.class);
			if(list.size() > 0){
				list.get(0).setMaxRows(cnt); 
			}
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