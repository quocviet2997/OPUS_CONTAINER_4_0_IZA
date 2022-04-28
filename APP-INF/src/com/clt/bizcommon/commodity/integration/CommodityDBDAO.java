/**
 * Copyright(c) 2006 CyberLogitec
 * @FileName : CommodityDBDAO.java
 * @FileTitle : Commodity정보조회(공통 Popup)
 * Open Issues :
 * Change history :
 * @LastModifyDate : 2006-08-03
 * @LastModifier : sungseok, choi
 * @LastVersion : 1.0
 * 2006-08-03 sungseok, choi 1.0 최초 생성
 */
package com.clt.bizcommon.commodity.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.commodity.basic.CommodityBCImpl;
import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.bizcommon.commodity.vo.SearchCommodityListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당
 * ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.
 * 
 * @author sungseok, choi
 * @see CommodityBCImpl 참조
 * @since J2EE 1.4
 */
public class CommodityDBDAO extends DBDAOSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * Commodity 리스트 조회
	 * @param cmdtCd
	 * @param repCmdtCd
	 * @param repImdgLvlCd
	 * @param cmdtNm
	 * @param iPage
	 * @return List<SearchCommodityListVO>
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchCommodityListVO> searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage) throws DAOException {
		List<SearchCommodityListVO> list = null;
		DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();    // query parameter
		Map<String, Object> velParam = new HashMap<String, Object>(); // velocity parameter
/*
		int currentPage = iPage;
		int startPart = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart = Constants.PAGE_SIZE_50 * currentPage;
*/
		if (!cmdtCd.equals("")) {
			param.put("cmdt_cd", cmdtCd);
			velParam.put("cmdt_cd", cmdtCd);
		}
		if (!repCmdtCd.equals("")) {
			param.put("rep_cmdt_cd", repCmdtCd);
			velParam.put("rep_cmdt_cd", repCmdtCd);
		}
		if (!repImdgLvlCd.equals("")) {
			param.put("rep_imdg_lvl_cd", repImdgLvlCd);
			velParam.put("rep_imdg_lvl_cd", repImdgLvlCd);
		}
		if (!cmdtNm.equals("")) {
			param.put("cmdt_nm", cmdtNm);
			velParam.put("cmdt_nm", cmdtNm);
		}
/*
		velParam.put("ipage", currentPage);
		param.put("startpart", startPart);
		param.put("endpart", endPart);
*/
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CommodityDBDAOTotalCommodityRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CommodityDBDAOSearchCommodityListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCommodityListVO.class);
			if (list.size() > 0) list.get(0).setMaxRows(cnt);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return list;
	}

	/**
	 * Commodity List 조회.
	 * @param cmdtCd
	 * @param repCmdtCd
	 * @param repImdgLvlCd
	 * @param cmdtNm
	 * @param iPage
	 * @param mdmYN
	 * @param deltFlg
	 * @return List<SearchCommodityListVO>
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchCommodityListVO> searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage, String mdmYN, String deltFlg) throws DAOException {
		List<SearchCommodityListVO> list = null;
    	DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();    // query parameter
		Map<String, Object> velParam = new HashMap<String, Object>(); // velocity parameter
/*
		// Paging 기능 없앰 by Sang-Hyun Kim
		int currentPage = iPage;
		int startPart = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart = Constants.PAGE_SIZE_50 * currentPage;
*/
		if (!cmdtCd.equals("")) {
			param.put("cmdt_cd", cmdtCd);
			velParam.put("cmdt_cd", cmdtCd);
		}
		if (!mdmYN.equals("")) {
			param.put("mdm_yn", mdmYN);
			velParam.put("mdm_yn", mdmYN);
		}
		if (!deltFlg.equals("")) {
			param.put("delt_flg", deltFlg);
			velParam.put("delt_flg", deltFlg);
		}
		if (!repCmdtCd.equals("")) {
			param.put("rep_cmdt_cd", repCmdtCd);
			velParam.put("rep_cmdt_cd", repCmdtCd);
		}
		if (!repImdgLvlCd.equals("")) {
			param.put("rep_imdg_lvl_cd", repImdgLvlCd);
			velParam.put("rep_imdg_lvl_cd", repImdgLvlCd);
		}
		if (!cmdtNm.equals("")) {
			param.put("cmdt_nm", cmdtNm);
			velParam.put("cmdt_nm", cmdtNm);
		}
/*
		// Paging 기능 없앰 by Sang-Hyun Kim
		velParam.put("ipage", currentPage);
		param.put("startpart", startPart);
		param.put("endpart", endPart);
*/

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CommodityDBDAOTotalCommodityRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CommodityDBDAOSearchCommodityListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCommodityListVO.class);
			if (list.size() > 0) list.get(0).setMaxRows(cnt);  
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return list;
	}

	/**
	 * Commodity Code를 입력하기 위해 Code를 검색 (COM_ENS_012)
	 * @param vo
	 * @return List<SearchCmdtCdRepCmdtCdVO>
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchCmdtCdRepCmdtCdVO> searchCmdtCdRepCmdtCd(SearchCmdtCdRepCmdtCdVO vo) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchCmdtCdRepCmdtCdVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();    // query parameter
		Map<String, Object> velParam = new HashMap<String, Object>(); // velocity parameter

		try {
			Map<String, String> mapVO = vo.getColumnValues();
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CommodityDBDAOSearchCmdtCdRepCmdtCdRSQL(), param, velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchCmdtCdRepCmdtCdVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}

		return list;
	}

	/**
	 * Commodity Code를 입력하기 위해 Code를 검색 (COM_ENS_012)
	 * @param moreInfoVO
	 * @return
	 * @throws DAOException
	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public List<MoreInfoVO> checkCmdtCd(MoreInfoVO moreInfoVO) throws DAOException {
//		DBRowSet dbRowset = null;
//		List<MoreInfoVO > list = null;
//		Map<String, Object> param = new HashMap<String, Object>();    // query parameter
//		Map<String, Object> velParam = new HashMap<String, Object>(); // velocity parameter
//
//		try {
//			if (moreInfoVO  != null) {
//				Map<String, String> mapVO = moreInfoVO.getColumnValues();
//				param.putAll(mapVO);
//				velParam.putAll(mapVO);
//			}
//			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CommodityDBDAOSearchCommodityCodeRSQL(), param, velParam);
//			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MoreInfoVO.class);
//		} catch (SQLException se) {
//			log.error(se.getMessage(), se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch(Exception ex) {
//			log.error(ex.getMessage(), ex);
//			throw new DAOException(new ErrorHandler(ex).getMessage());
//		}
//
//		return list;
//	}
}
