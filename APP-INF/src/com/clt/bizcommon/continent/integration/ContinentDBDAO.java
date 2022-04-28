/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentDBDAO.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.continent.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.continent.basic.ContinentBCImpl;
import com.clt.bizcommon.continent.vo.SearchContinentListVO;
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
 * @see ContinentBCImpl 참조
 * @since J2EE 1.4
 */
public class ContinentDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Continent count<p>
     * 2. 처리개요 : Continent의 총 카운트를 조회한다.<p>
     * - totalContinent<p>
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
     * @return int
     * @Exception DAOException
     */
	public int totalContinent() throws DAOException {
		DBRowSet dbRowset = null;
        try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ContinentDBDAOTotalContinentRSQL(), null, null);
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
	
	
	public int totalContinent(SearchContinentListVO vo)throws DAOException {
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	String contiCd = vo.getContiCd();
        	String contiNm = vo.getContiNm();
        	
        	String mdmYN = vo.getMdmYN();
        	String deltFlg = vo.getDeltFlg();
        	
        	if(!contiCd.equals("")){
        		param.put("conti_cd", contiCd);
        		velParam.put("conti_cd", contiCd);
        	}
        	if(!contiNm.equals("")){
        		param.put("conti_nm", contiNm);
        		velParam.put("conti_nm", contiNm);
        	}
        	if(!mdmYN.equals("")){
        		param.put("mdm_yn", mdmYN);
        		velParam.put("mdm_yn", mdmYN);
        	}
        	if(!deltFlg.equals("")){
        		param.put("delt_flg", deltFlg);
        		velParam.put("delt_flg", deltFlg);
        	}
        	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ContinentDBDAOTotalContinentRSQL(), param, velParam);
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
	 * Continent의 모든 목록을 가져온다.<br>
	 * @return List<SearchContinentListVO>
	 * @Exception DAOException
	 */
	public List<SearchContinentListVO> searchContinentList() throws DAOException {
    	DBRowSet dbRowset = null;
    	List<SearchContinentListVO> list = null; 
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ContinentDBDAOSearchContinentListRSQL(), null, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchContinentListVO.class);
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
	 * Continent의 모든 목록을 가져온다.<br>
	 * @param SearchContinentListVO vo
	 * @return List<SearchContinentListVO>
	 * @Exception DAOException
	 */
	public List<SearchContinentListVO> searchContinentList( SearchContinentListVO vo) throws DAOException {
		DBRowSet dbRowset = null;
    	List<SearchContinentListVO> list = null; 
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	String contiCd = vo.getContiCd();
        	String contiNm = vo.getContiNm();
        	
        	String mdmYN = vo.getMdmYN();
        	String deltFlg = vo.getDeltFlg();
        	
        	if(!contiCd.equals("")){
        		param.put("conti_cd", contiCd);
        		velParam.put("conti_cd", contiCd);
        	}
        	if(!contiNm.equals("")){
        		param.put("conti_nm", contiNm);
        		velParam.put("conti_nm", contiNm);
        	}
        	if(!mdmYN.equals("")){
        		param.put("mdm_yn", mdmYN);
        		velParam.put("mdm_yn", mdmYN);
        	}
        	if(!deltFlg.equals("")){
        		param.put("delt_flg", deltFlg);
        		velParam.put("delt_flg", deltFlg);
        	}
        	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ContinentDBDAOSearchContinentListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchContinentListVO.class);
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