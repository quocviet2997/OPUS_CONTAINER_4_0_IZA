/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MonthlyDBDAO.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.vvd.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.exrate.vvd.vo.VVDListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see MonthlyBCImpl 참조
 * @since J2EE 1.4
 */
public class VVDRateDBDAO extends DBDAOSupport {
	
	/**
     * 1. 기능 : Monthly Exchange Rate count<p>
     * 2. 처리개요 : Monthly Exchange Rate의 총 카운트를 조회한다.<p> 
     * - totalLocation<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.08.03<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param et COM_ENS_0F1Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalVVDRate(VVDListVO vvdListVO) throws DAOException {
        
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		velParam.put("where", "");
		
    	if(!vvdListVO.getVvdCd().equals("")) {
			velParam.put("vsl_cd", vvdListVO.getVvdCd());
			param.put("vsl_cd", vvdListVO.getVvdCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "vsl_cd");
		}
		if(!vvdListVO.getPortCd().equals("")) {
			param.put("port_cd", vvdListVO.getPortCd());
			velParam.put("port_cd", vvdListVO.getPortCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "port_cd");
		}
		if(!vvdListVO.getChgCurrCd().equals("")) {
			param.put("chg_curr_cd", vvdListVO.getChgCurrCd());
			velParam.put("chg_curr_cd", vvdListVO.getChgCurrCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "chg_curr_cd");
		}
		if(!vvdListVO.getLoclCurrCd().equals("")) {
			param.put("locl_curr_cd", vvdListVO.getLoclCurrCd());
			velParam.put("locl_curr_cd", vvdListVO.getLoclCurrCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "locl_curr_cd");
		}
		if(!vvdListVO.getSvcScpCd().equals("")) {
			param.put("svc_scp_cd", vvdListVO.getSvcScpCd());
			velParam.put("svc_scp_cd", vvdListVO.getSvcScpCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "svc_scp_cd");
		}
		if(!vvdListVO.getIoBndCd().equals("")) {
			param.put("io_bnd_cd", vvdListVO.getIoBndCd());
			velParam.put("io_bnd_cd", vvdListVO.getIoBndCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "io_bnd_cd");
		}
		
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VVDRateDAOCountRSQL(), param, velParam);
			if (dbRowset.next()) {
				return dbRowset.getInt(1);
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return 0;
	}
	
	/**
	 * Monthly의 모든 목록을 가져온다.<br>
	 * @param VVDListVO vvdListVO
	 * @param int iPage
	 * @return List<VVDListVO>
	 * @throws DAOException
	 */
	public List<VVDListVO> searchVVDRateList(VVDListVO vvdListVO, int iPage) throws DAOException {
	   	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		velParam.put("where", "");
		
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		//List
		List<VVDListVO> list = null; 
		
		param.put("startpart", startPart);
		param.put("endpart", endPart);
		
    	if(!vvdListVO.getVvdCd().equals("")) {
			velParam.put("vsl_cd", vvdListVO.getVvdCd());
			param.put("vsl_cd", vvdListVO.getVvdCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "vsl_cd");
		}
		if(!vvdListVO.getPortCd().equals("")) {
			param.put("port_cd", vvdListVO.getPortCd());
			velParam.put("port_cd", vvdListVO.getPortCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "port_cd");
		}
		if(!vvdListVO.getChgCurrCd().equals("")) {
			param.put("chg_curr_cd", vvdListVO.getChgCurrCd());
			velParam.put("chg_curr_cd", vvdListVO.getChgCurrCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "chg_curr_cd");
		}
		if(!vvdListVO.getLoclCurrCd().equals("")) {
			param.put("locl_curr_cd", vvdListVO.getLoclCurrCd());
			velParam.put("locl_curr_cd", vvdListVO.getLoclCurrCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "locl_curr_cd");
		}
		if(!vvdListVO.getSvcScpCd().equals("")) {
			param.put("svc_scp_cd", vvdListVO.getSvcScpCd());
			velParam.put("svc_scp_cd", vvdListVO.getSvcScpCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "svc_scp_cd");
		}
		if(!vvdListVO.getIoBndCd().equals("")) {
			param.put("io_bnd_cd", vvdListVO.getIoBndCd());
			velParam.put("io_bnd_cd", vvdListVO.getIoBndCd());
			if(velParam.get("where").equals(""))
				velParam.put("where", "io_bnd_cd");
		}

		param.put("startpart", startPart);
		param.put("endpart", endPart);

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VVDRateDAOVVDListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, VVDListVO.class);
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