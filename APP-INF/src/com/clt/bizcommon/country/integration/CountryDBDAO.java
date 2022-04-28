/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CountryDBDAO.java
*@FileTitle : Country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.country.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.country.basic.CountryBCImpl;
import com.clt.bizcommon.country.vo.CountryListVO;
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
 * @see CountryBCImpl 참조
 * @since J2EE 1.4
 */
public class CountryDBDAO extends DBDAOSupport {
	
	/**
     * 1. 기능 : Location count<p>
     * 2. 처리개요 : Location의 총 카운트를 조회한다.<p> 
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
	 * @param CountryListVO countryListVO
     * @return int
     * @throws DAOException
     */
	public int totalCountry(CountryListVO countryListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			if(!countryListVO.getContiCd().equals("")) {
				param.put("conti_cd", countryListVO.getContiCd());
				velParam.put("conti_cd", countryListVO.getContiCd());
			}
			if(!countryListVO.getScontiCd().equals("")) {
				param.put("sconti_cd", countryListVO.getScontiCd());
				velParam.put("sconti_cd", countryListVO.getScontiCd());
			}
			if(!countryListVO.getCntCd().equals("")) {
				param.put("cnt_cd", countryListVO.getCntCd());
				velParam.put("cnt_cd", countryListVO.getCntCd());
			}
			if(!countryListVO.getCntNm().equals("")) {
				param.put("cnt_nm", countryListVO.getCntNm());
				velParam.put("cnt_nm", countryListVO.getCntNm());
			}
			if(!countryListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", countryListVO.getMdmYN());
				velParam.put("mdm_yn", countryListVO.getMdmYN());
			}
			if(!countryListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", countryListVO.getDeltFlg());
				velParam.put("delt_flg", countryListVO.getDeltFlg());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CountryDBDAOTotalLocationRSQL(), param, velParam);
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
	 * Country의 모든 목록을 가져온다.<br>
	 * @param CountryListVO countryListVO
	 * @param int iPage
	 * @return List<CountryListVO>
	 * @throws DAOException
	 */
	public List<CountryListVO> searchCountryList(CountryListVO countryListVO, int iPage) throws DAOException {
    	DBRowSet dbRowset = null;
		//List
		List<CountryListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
			if(!countryListVO.getContiCd().equals("")) {
				param.put("conti_cd", countryListVO.getContiCd());
				velParam.put("conti_cd", countryListVO.getContiCd());
			}
			if(!countryListVO.getScontiCd().equals("")) {
				param.put("sconti_cd", countryListVO.getScontiCd());
				velParam.put("sconti_cd", countryListVO.getScontiCd());
			}
			if(!countryListVO.getCntCd().equals("")) {
				param.put("cnt_cd", countryListVO.getCntCd());
				velParam.put("cnt_cd", countryListVO.getCntCd());
			}
			if(!countryListVO.getCntNm().equals("")) {
				param.put("cnt_nm", countryListVO.getCntNm());
				velParam.put("cnt_nm", countryListVO.getCntNm());
			}
			if(!countryListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", countryListVO.getMdmYN());
				velParam.put("mdm_yn", countryListVO.getMdmYN());
			}
			if(!countryListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", countryListVO.getDeltFlg());
				velParam.put("delt_flg", countryListVO.getDeltFlg());
			}
			param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CountryDBDAOCountryListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CountryListVO.class);
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