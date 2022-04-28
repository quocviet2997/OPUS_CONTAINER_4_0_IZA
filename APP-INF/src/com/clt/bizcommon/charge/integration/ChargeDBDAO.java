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
package com.clt.bizcommon.charge.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.charge.basic.ChargeBCImpl;
import com.clt.bizcommon.charge.vo.ChargeListVO;
import com.clt.bizcommon.charge.vo.RepChargeVO;
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
public class ChargeDBDAO extends DBDAOSupport {

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
	 * @param ChargeListVO chargeListVO
     * @return int
     * @throws DAOException
     *
     */
	public int totalCharge(ChargeListVO chargeListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			if(!chargeListVO.getChgCd().equals("")) {
				param.put("chg_cd", chargeListVO.getChgCd());
				velParam.put("chg_cd", chargeListVO.getChgCd());
			}
			if(!chargeListVO.getChgNm().equals("")) {
				param.put("chg_nm", chargeListVO.getChgNm());
				velParam.put("chg_nm", chargeListVO.getChgNm());
			}
			if(!chargeListVO.getMdmYn().equals("")) {
				param.put("mdm_yn", chargeListVO.getMdmYn());
				velParam.put("mdm_yn", chargeListVO.getMdmYn());
			}
			if(!chargeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", chargeListVO.getDeltFlg());
				velParam.put("delt_flg", chargeListVO.getDeltFlg());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ChargeDBDAOTotalChargeRSQL(), param, velParam);
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
	 * @param ChargeListVO chargeListVO
	 * @param int iPage
	 * @return List<ChargeListVO>
	 * @throws DAOException
	 */
	public List<ChargeListVO> searchChargeList(ChargeListVO chargeListVO, int iPage) throws DAOException {
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		//List
		List<ChargeListVO> list = null; 
		try{
			if(!chargeListVO.getChgCd().equals("")) {
				param.put("chg_cd", chargeListVO.getChgCd());
				velParam.put("chg_cd", chargeListVO.getChgCd());
			}
			if(!chargeListVO.getChgNm().equals("")) {
				param.put("chg_nm", chargeListVO.getChgNm());
				velParam.put("chg_nm", chargeListVO.getChgNm());
			}
			if(!chargeListVO.getMdmYn().equals("")) {
				param.put("mdm_yn", chargeListVO.getMdmYn());
				velParam.put("mdm_yn", chargeListVO.getMdmYn());
			}
			if(!chargeListVO.getRepChgCd().equals("")) {
				param.put("rep_chg_cd", chargeListVO.getRepChgCd());
				velParam.put("rep_chg_cd", chargeListVO.getRepChgCd());
			}
			if(!chargeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", chargeListVO.getDeltFlg());
				velParam.put("delt_flg", chargeListVO.getDeltFlg());
			}
			param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ChargeDBDAOChargeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ChargeListVO.class);
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
	 * Charge의 모든 목록을 가져온다.<br>
	 * @return List<RepChargeVO>
	 * @throws DAOException
	 */
    @SuppressWarnings("unchecked")
    public List<RepChargeVO> searchRepChgCd() throws DAOException {
        DBRowSet dbRowset = null;
        
        List<RepChargeVO> list = null;        
       
        try{    
        	// query parameter
            Map<String, Object> param = new HashMap<String, Object>();
            // velocity parameter
            Map<String, Object> velParam = new HashMap<String, Object>();
            
            dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ChargeDBDAORepChargeListRSQL(), param, velParam);
            
            list = (List)RowSetUtil.rowSetToVOs(dbRowset, RepChargeVO.class);
                 
            return list;
            
        } catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
       
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