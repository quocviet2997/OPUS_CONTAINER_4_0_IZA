/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ChargeDBDAO.java
*@FileTitle : Charge
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-20
*@LastModifier : JunBum Lee
*@LastVersion : 1.0
* 2012-02-20 JunBum Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.daylightsavingtime.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.daylightsavingtime.basic.DaylightSavingTimeBCImpl;
import com.clt.bizcommon.daylightsavingtime.vo.DaylightSavingTimeListVO;
import com.clt.bizcommon.comm.Constants;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
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
 * @see ChargeBCImpl 참조
 * @since J2EE 1.4
 */
public class DaylightSavingTimeDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Charge count<p>
     * 2. 처리개요 : Charge의 총 카운트를 조회한다.<p> 
     * - totalCharge<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.10.17<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param DaylightSavingTimeListVO daylightSavingTimeListVO
     * @return int
     * @throws DAOException
     *
     */
	public int totalDaylightSavingTime(DaylightSavingTimeListVO daylightSavingTimeListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			if(!daylightSavingTimeListVO.getDstCntCd().equals("")) {
				param.put("dst_cnt_cd", daylightSavingTimeListVO.getDstCntCd());
				velParam.put("dst_cnt_cd", daylightSavingTimeListVO.getDstCntCd());
			}
			if(!daylightSavingTimeListVO.getMdmYn().equals("")) {
				param.put("mdm_yn", daylightSavingTimeListVO.getMdmYn());
				velParam.put("mdm_yn", daylightSavingTimeListVO.getMdmYn());
			}
			if(!daylightSavingTimeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", daylightSavingTimeListVO.getDeltFlg());
				velParam.put("delt_flg", daylightSavingTimeListVO.getDeltFlg());
			}
			if(!daylightSavingTimeListVO.getDstYr().equals("")) {
				param.put("dst_yr", daylightSavingTimeListVO.getDstYr());
				velParam.put("dst_yr", daylightSavingTimeListVO.getDstYr());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new DaylightSavingTimeDBDAOTotalDaylightSavingTimeRSQL(), param, velParam);
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
	 * Charge의 모든 목록을 가져온다.<br>
	 * @param DaylightSavingTimeListVO daylightSavingTimeListVO
	 * @param int iPage
	 * @return List<DaylightSavingTimeListVO>
	 * @throws DAOException
	 */
	public List<DaylightSavingTimeListVO> searchDaylightSavingTimeList(DaylightSavingTimeListVO daylightSavingTimeListVO, int iPage) throws DAOException {
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		//List
		List<DaylightSavingTimeListVO> list = null; 
		try{
			if(!daylightSavingTimeListVO.getDstCntCd().equals("")) {
				param.put("dst_cnt_cd", daylightSavingTimeListVO.getDstCntCd());
				velParam.put("dst_cnt_cd", daylightSavingTimeListVO.getDstCntCd());
			}
			if(!daylightSavingTimeListVO.getMdmYn().equals("")) {
				param.put("mdm_yn", daylightSavingTimeListVO.getMdmYn());
				velParam.put("mdm_yn", daylightSavingTimeListVO.getMdmYn());
			}
			if(!daylightSavingTimeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", daylightSavingTimeListVO.getDeltFlg());
				velParam.put("delt_flg", daylightSavingTimeListVO.getDeltFlg());
			}
			if(!daylightSavingTimeListVO.getDstYr().equals("")) {
				param.put("dst_yr", daylightSavingTimeListVO.getDstYr());
				velParam.put("dst_yr", daylightSavingTimeListVO.getDstYr());
			}
			param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new DaylightSavingTimeDBDAODaylightSavingTimeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, DaylightSavingTimeListVO.class);
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
	 * 
	 * @param String code
	 * @param String tagName
	 * @param String sOptionalSelectTag
	 * @return String
	 * @throws DAOException
	 */
	public String getCode(String code, String tagName, String sOptionalSelectTag) throws DAOException {
		StringBuffer sb = new StringBuffer();
		sb.append("<SELECT name = \"" + tagName + "\" " + sOptionalSelectTag + ">").append("\n");
		
		if(code.indexOf("&") > 0){
			String[] codes = code.split("&");
			for (int i = 0; i < codes.length; i++) {
				sb.append("<option value=\"" + codes[i] +"\">" + codes[i] + "</option>").append("\n");
			}
		}else{
			sb.append("<option value=\"\" selected>ALL</option>").append("\n");
		}
		sb.append("</SELECT>");

		return sb.toString();
	}
}