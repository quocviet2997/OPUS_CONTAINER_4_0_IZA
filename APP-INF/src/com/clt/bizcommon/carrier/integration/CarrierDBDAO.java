/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CarrierDBDAO.java
*@FileTitle : Carrier
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.carrier.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.carrier.basic.CarrierBCImpl;
import com.clt.bizcommon.carrier.event.ComEns0N1Event;
import com.clt.bizcommon.carrier.vo.CarrierListVO;
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
 * @see CarrierBCImpl 참조
 * @since J2EE 1.4
 */
public class CarrierDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Carrier count<p>
     * 2. 처리개요 : Carrier의 총 카운트를 조회한다.<p> 
     * - totalCarrier<p>
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
	 * @param CarrierListVO carrierListVO
     * @return int
     * @throws DAOException
     *
     */
	public int totalCarrier(CarrierListVO carrierListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			if(!carrierListVO.getCrrCd().equals("")) {
				param.put("crr_cd", carrierListVO.getCrrCd());
				velParam.put("crr_cd", carrierListVO.getCrrCd());
			}
			if(!carrierListVO.getCrrNm().equals("")) {
				param.put("crr_nm", carrierListVO.getCrrNm());
				velParam.put("crr_nm", carrierListVO.getCrrNm());
			}
			if(!carrierListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", carrierListVO.getMdmYN());
				velParam.put("mdm_yn", carrierListVO.getMdmYN());
			}
			if(!carrierListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", carrierListVO.getDeltFlg());
				velParam.put("delt_flg", carrierListVO.getDeltFlg());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierDAOTotalCarrierRSQL(), param, velParam);
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
	 * Carrier의 모든 목록을 가져온다.<br>
	 * @param CarrierListVO carrierListVO
	 * @param int iPage
	 * @return List<CarrierListVO>
	 * @throws DAOException
	 */
	public List<CarrierListVO> searchCarrierList(CarrierListVO carrierListVO, int iPage) throws DAOException {
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		//List
		List<CarrierListVO> list = null; 
		try{
			if(!carrierListVO.getCrrCd().equals("")) {
				param.put("crr_cd", carrierListVO.getCrrCd());
				velParam.put("crr_cd", carrierListVO.getCrrCd());
			}
			if(!carrierListVO.getCrrNm().equals("")) {
				param.put("crr_nm", carrierListVO.getCrrNm());
				velParam.put("crr_nm", carrierListVO.getCrrNm());
			}
			if(!carrierListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", carrierListVO.getMdmYN());
				velParam.put("mdm_yn", carrierListVO.getMdmYN());
			}
			if(!carrierListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", carrierListVO.getDeltFlg());
				velParam.put("delt_flg", carrierListVO.getDeltFlg());
			}
			param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierDBDAOCarrierListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CarrierListVO.class);
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
	 * ContinentCode의 모든 목록을 가져온다.<br>
	 * @param Event et
	 * @return String
	 * @throws DAOException
	 */
	public String searchContinentCode(Event et) throws DAOException {
    	DBRowSet dbRowset = null;
    	StringBuffer code = new StringBuffer();
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierDBDAOContinentCodeRSQL(), null, null);
			for (int i=0; i<dbRowset.getRowCount(); i++) { 
				dbRowset.next(); 
				code.append(dbRowset.getString("name") + "," + dbRowset.getString("code") + "|"); 
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return code.toString().substring(0, code.length()-1);
	}
	
	/**
	 * ContinentCode의 모든 목록을 가져온다.<br>
	 * @param Event et
	 * @return String
	 * @throws DAOException
	 */
	public String searchSubContinentCode(Event et) throws DAOException {
    	DBRowSet dbRowset = null;
    	StringBuffer code = new StringBuffer();
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CarrierDBDAOSubContinentCodeRSQL(), param, velParam);
			for (int i=0; i<dbRowset.getRowCount(); i++) { 
				dbRowset.next(); 
				code.append(dbRowset.getString("name") + "&"); 
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return getCode(code.substring(0, code.length()-1),"sconti_cd","");
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