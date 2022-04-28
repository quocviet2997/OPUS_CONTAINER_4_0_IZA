/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeDBDAO.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.office.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.office.basic.OfficeBCImpl;
import com.clt.bizcommon.office.vo.SearchOfficeListVO;
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
 * @author Hyunsu, Ryu
 * @see OfficeBCImpl 참조
 * @since J2EE 1.4
 */
public class OfficeDBDAO extends DBDAOSupport {

	/**
	 * 
	 * @param locCd
	 * @param ofcLev
	 * @param ofcPtsCd
	 * @param ofcCd
	 * @param ofcNm
	 * @param calltype
	 * @param iPage
	 * @param ofcAddr
	 * @return List<SearchOfficeListVO>
	 * @throws DAOException
	 */
    public List<SearchOfficeListVO> searchOfficeList(String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofcAddr) throws DAOException {
        DBRowSet dbRowset = null;
        List<SearchOfficeListVO> list = null;
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;  
		
		log.debug("currentPage: " + currentPage);
		log.debug("startPart: " + startPart);
		log.debug("endPart: " + endPart);
		
		Map<String,String> mapParam = new HashMap<String,String>();
		
    	mapParam.put("loc_cd", locCd);
    	mapParam.put("ofc_lev", ofcLev);
    	mapParam.put("ofc_pts_cd", ofcPtsCd);
    	mapParam.put("ofc_cd", ofcCd);
    	mapParam.put("ofc_nm", ofcNm);
    	mapParam.put("startpart", "" + startPart);
    	mapParam.put("endpart",  "" + endPart);
    	mapParam.put("ofc_addr", ofcAddr);
        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new OfficeDBDAOTotalOfficeRSQL(), mapParam, mapParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new OfficeDBDAOSearchOfficeListRSQL(), mapParam, mapParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchOfficeListVO.class);
			if (list.size() > 0)
				list.get(0).setMaxRows(cnt);  

        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
               
        return list;
    }
    
    /**
	 * 
	 * @param locCd
	 * @param ofcLev
	 * @param ofcPtsCd
	 * @param ofcCd
	 * @param ofcNm
	 * @param calltype
	 * @param iPage
	 * @param ofcAddr
	 * @param mdmYN
	 * @param deltFlg
	 * @return List<SearchOfficeListVO>
	 * @throws DAOException
	 */
    public List<SearchOfficeListVO> searchOfficeList(String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofcAddr, String mdmYN, String deltFlg) throws DAOException {
    	DBRowSet dbRowset = null;
    	List<SearchOfficeListVO> list = null;
    	// 페이징 처리
    	int currentPage = iPage;
    	int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
    	int endPart     = Constants.PAGE_SIZE_50 * currentPage;  
    	
    	log.debug("currentPage: " + currentPage);
    	log.debug("startPart: " + startPart);
    	log.debug("endPart: " + endPart);
    	
    	Map<String,String> mapParam = new HashMap<String,String>();
    	
    	mapParam.put("loc_cd", locCd);
    	mapParam.put("ofc_lev", ofcLev);
    	mapParam.put("ofc_pts_cd", ofcPtsCd);
    	mapParam.put("ofc_cd", ofcCd);
    	mapParam.put("ofc_nm", ofcNm);
    	mapParam.put("startpart", "" + startPart);
    	mapParam.put("endpart",  "" + endPart);
    	mapParam.put("ofc_addr", ofcAddr);
    	if(!"".equals(mdmYN)){
    		mapParam.put("mdm_yn", mdmYN);
    	}
    	
    	if(!"".equals(deltFlg)){
    		mapParam.put("delt_flg", deltFlg);
    	}
    	
    	try {
    		dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new OfficeDBDAOTotalOfficeRSQL(), mapParam, mapParam);
    		int cnt = 0;
    		if (dbRowset.next()) {
    			cnt = dbRowset.getInt(1);
    		}
    		
    		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new OfficeDBDAOSearchOfficeListRSQL(), mapParam, mapParam);
    		list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchOfficeListVO.class);
    		if (list.size() > 0)
    			list.get(0).setMaxRows(cnt);  
    		
    	} catch (SQLException se) {
    		log.error(se.getMessage(), se);
    		throw new DAOException(new ErrorHandler(se).getMessage());
    	} catch (Exception e) {
    		log.error(e.getMessage(), e);
    		throw new DAOException(e.getMessage());
    	}
    	
    	return list;
    }

}