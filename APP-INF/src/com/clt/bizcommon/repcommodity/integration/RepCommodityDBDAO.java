/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RepCommodityDBDAO.java
*@FileTitle : RepCommodity
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.repcommodity.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.repcommodity.basic.RepCommodityBCImpl;
import com.clt.bizcommon.repcommodity.vo.SearchRepCommodityListVO;
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
 * @see RepCommodityBCImpl 참조
 * @since J2EE 1.4
 */
public class RepCommodityDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Rep Commodity count<p>
     * 2. 처리개요 : Rep Commodity의 총 카운트를 조회한다.<p>
     * - totalRepCommodity<p>
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
	 * @param SearchRepCommodityListVO searchRepCommodityListVO
     * @return int
     * @throws DAOException
     *
     */
	public int totalRepCommodity(SearchRepCommodityListVO searchRepCommodityListVO) throws DAOException {
		DBRowSet dbRowset = null;
		Map<String,String> mapParam = new HashMap<String,String>();
    	if(!searchRepCommodityListVO.getRepCmdtCd().equals("")){
    		mapParam.put("rep_cmdt_cd", searchRepCommodityListVO.getRepCmdtCd());
    	}
    	if(!searchRepCommodityListVO.getRepCmdtNm().equals("")){
    		mapParam.put("rep_cmdt_nm", searchRepCommodityListVO.getRepCmdtNm());
    	}
        try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new RepCommodityDBDAOTotalRepCommodityRSQL(), mapParam, mapParam);
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
	 * RepCommodity의 모든 목록을 가져온다.<br>
	 * @param SearchRepCommodityListVO searchRepCommodityListVO
	 * @return List<SearchRepCommodityListVO>
	 * @throws DAOException
	 */
	public List<SearchRepCommodityListVO> searchRepCommodityList(SearchRepCommodityListVO searchRepCommodityListVO) throws DAOException {
    	DBRowSet dbRowset = null;		
		//List
		List<SearchRepCommodityListVO> list = null; 
		
    	Map<String,String> mapParam = new HashMap<String,String>();
    	if(!searchRepCommodityListVO.getRepCmdtCd().equals("")){
    		mapParam.put("rep_cmdt_cd", searchRepCommodityListVO.getRepCmdtCd());
    	}
    	if(!searchRepCommodityListVO.getRepCmdtNm().equals("")){
    		mapParam.put("rep_cmdt_nm", searchRepCommodityListVO.getRepCmdtNm());
    	}
    	
    	if(!searchRepCommodityListVO.getMdmYN().equals("")){
    		mapParam.put("mdm_yn", searchRepCommodityListVO.getMdmYN());
    	}
    	
    	if(!searchRepCommodityListVO.getDeltFlg().equals("")){
    		mapParam.put("delt_flg", searchRepCommodityListVO.getDeltFlg());
    	}
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new RepCommodityDBDAOSearchRepCommodityListRSQL(), mapParam, mapParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchRepCommodityListVO.class);
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