/*=========================================================
 *Copyright(c) 2011 CyberLogitec
 *@FileName : FinanceCreationDBDAO.java
 *@FileTitle : FinanceManagement
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2011.02.28
 *@LastModifier : 정윤태
 *@LastVersion : 1.0
 * 2011.02.28 정윤태
 * 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.basic.FinanceCreationBCImpl;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlCtrErpVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlErrVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlEstmRevVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlFmcEntVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.RevenueMonthVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchApPeriodListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArFincDirConvListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArMasterRevenueVvdListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArRouteRankListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchEstmVvdCreationFlagVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlEstimateRevenueVvdListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlMonthlyExchangeRateListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.GlDlyXchRtVO;

/**
 * OPUS_CNTR-FinanceManagement <br>
 * - OPUS_CNTR-FinanceManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Yoon-Tae, Jung
 * @see FinanceCreationBCImpl 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAO extends DBDAOSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * AP PERIOD 정보를 가져온다<br>
	 * 
	 * @param String effYrmon
	 * @param String sysDivCd
	 * @param String ofcCd
	 * @param String arApDivCd
	 * @return List<SearchApPeriodListVO>
	 * @throws DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchApPeriodListVO> searchApPeriodList(String effYrmon, String sysDivCd, String ofcCd, String arApDivCd) throws DAOException {
		DBRowSet dbRowset = null;

		List<SearchApPeriodListVO> searchApPeriodListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("sys_div_cd", sysDivCd);
			param.put("eff_yrmon", effYrmon);
			param.put("ofc_cd", ofcCd);
			param.put("ar_ap_div_cd", arApDivCd);

			vparam.put("sys_div_cd", sysDivCd);
			vparam.put("eff_yrmon", effYrmon);
			vparam.put("ofc_cd", ofcCd);
			vparam.put("ar_ap_div_cd", arApDivCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchApPeriodListVORSQL(), param, vparam);

			searchApPeriodListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchApPeriodListVO.class);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}

		return searchApPeriodListVO;
	}

	/**
	 * AP PERIOD에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param String sysDivCd
	 * @param String effYrmon
	 * @param String ofcCd
	 * @param String arApDivCd
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupApPeriod(String sysDivCd, String effYrmon, String ofcCd, String arApDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {

			// query parameter
			param.put("sys_div_cd", sysDivCd);
			param.put("eff_yrmon", effYrmon);
			param.put("ofc_cd", ofcCd);
			param.put("ar_ap_div_cd", arApDivCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupApPeriodRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}

	/**
	 * AP PERIOD 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param List<SearchApPeriodListVO> searchApPeriodListVO
	 * @throws DAOException
	 */
	public void addApPeriods(List<SearchApPeriodListVO> searchApPeriodListVO) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (searchApPeriodListVO.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddApPeriodCSQL(), searchApPeriodListVO, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AP PERIOD 정보를 변경한다.<br>
	 * 
	 * @param List<SearchApPeriodListVO> searchApPeriodListVO
	 * @throws DAOException
	 */
	public void modifyApPeriods(List<SearchApPeriodListVO> searchApPeriodListVO) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (searchApPeriodListVO.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyApPeriodUSQL(), searchApPeriodListVO, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AP PERIOD 정보를 삭제한다.<br>
	 * 
	 * @param List<SearchApPeriodListVO> searchApPeriodListVO
	 * @throws DAOException
	 */
	public void removeApPeriods(List<SearchApPeriodListVO> searchApPeriodListVO) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if (searchApPeriodListVO.size() > 0) {
				delCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveApPeriodDSQL(), searchApPeriodListVO, null);
				for (int i = 0; i < delCnt.length; i++) {
					if (delCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Finance Direction Conversion 정보를 가져온다
	 * 
	 * @param String slanCd
	 * @param String rlaneCd
	 * @return List<SearchArFincDirConvListVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchArFincDirConvListVO> searchArFincDirConvList(String slanCd, String rlaneCd) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<SearchArFincDirConvListVO> searchArFincDirConvListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("slan_cd", slanCd);
			param.put("rlane_cd", rlaneCd);

			vparam.putAll(param);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchArFincDirConvListRSQL(), param, vparam);
			searchArFincDirConvListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchArFincDirConvListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchArFincDirConvListVO;
	}

	/**
	 * AR Finance Direction Conversion 정보를 저장할때 중복 데이터가 있는지 확인한다<br>
	 * 
	 * @param String slanCd
	 * @param String scontiCd
	 * @param String slanDirCd
	 * @param String rlaneDirCd
	 * @return int
	 * @throws DAOException
	 * @exception EventException
	 */
	public int checkDupArFincDirConv(String slanCd, String scontiCd, String slanDirCd, String rlaneDirCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("slan_cd", slanCd);
			param.put("sconti_cd", scontiCd);
			param.put("slan_dir_cd", slanDirCd);
			param.put("rlane_dir_cd", rlaneDirCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupArFincDirConvRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}

	/**
	 * AR Finance Direction Conversion 정보를 저장한다(입력)<br>
	 * 
	 * @param List<SearchArFincDirConvListVO> addVoList
	 * @throws DAOException
	 */
	public void addArFincDirConvs(List<SearchArFincDirConvListVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddArFincDirConvCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Finance Direction Conversion 정보를 저장한다(수정)<br>
	 * 
	 * @param List<SearchArFincDirConvListVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyArFincDirConvs(List<SearchArFincDirConvListVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyArFincDirConvUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Finance Direction Conversion 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<SearchArFincDirConvListVO> removeVoList
	 * @throws DAOException
	 */
	public void removeArFincDirConvs(List<SearchArFincDirConvListVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveArFincDirConvDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Master Revenue VVD 정보를 가져온다
	 * 
	 * @param String revYrmon
	 * @param String vslCd
	 * @param String vvd
	 * @return List<SearchArMasterRevenueVvdListVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchArMasterRevenueVvdListVO> searchArMasterRevenueVvdList(String revYrmon, String vslCd, String vvd) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<SearchArMasterRevenueVvdListVO> searchArMasterRevenueVvdListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("rev_yrmon", revYrmon.replace("-", ""));
			param.put("vsl_cd", vslCd);
			param.put("vvd", vvd);

			vparam.putAll(param);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchArMasterRevenueVvdListRSQL(), param, vparam);
			searchArMasterRevenueVvdListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchArMasterRevenueVvdListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchArMasterRevenueVvdListVO;
	}

	/**
	 * AR Master Revenue VVD 정보를 저장할때 중복 데이터가 있는지 확인한다<br>
	 * 
	 * @param String vslCd
	 * @param String skdVoyNo
	 * @param String skdDirCd
	 * @param String rlaneDirCd
	 * @return int
	 * @throws DAOException
	 * @exception EventException
	 */
	public int checkDupArMasterRevenueVvd(String vslCd, String skdVoyNo, String skdDirCd, String rlaneDirCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("vsl_cd", vslCd);
			param.put("skd_voy_no", skdVoyNo);
			param.put("skd_dir_cd", skdDirCd);
			param.put("rlane_dir_cd", rlaneDirCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupArMasterRevenueVvdRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}

	/**
	 * AR Master Revenue VVD 정보를 저장한다(입력)<br>
	 * 
	 * @param List<SearchArMasterRevenueVvdListVO> addVoList
	 * @throws DAOException
	 * @throws DAOException
	 */
	public void addArMasterRevenueVvds(List<SearchArMasterRevenueVvdListVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddArMasterRevenueVvdCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Master Revenue VVD 정보를 저장한다(수정)<br>
	 * 
	 * @param List<SearchArMasterRevenueVvdListVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyArMasterRevenueVvds(List<SearchArMasterRevenueVvdListVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyArMasterRevenueVvdsUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Master Revenue VVD 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<SearchArMasterRevenueVvdListVO> removeVoList
	 * @throws DAOException
	 */
	public void removeArMasterRevenueVvds(List<SearchArMasterRevenueVvdListVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveArMasterRevenueVvdsDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Route Rank 정보를 가져온다
	 * 
	 * @param String slanCd
	 * @param String rlaneCd
	 * @param String deltFlg
	 * @return List<SearchArRouteRankListVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchArRouteRankListVO> searchArRouteRankList(String slanCd, String rlaneCd, String deltFlg) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<SearchArRouteRankListVO> searchArRouteRankListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("slan_cd", slanCd);
			param.put("rlane_cd", rlaneCd);
			param.put("delt_flg", deltFlg);
			vparam.putAll(param);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchArRouteRankListRSQL(), param, vparam);
			searchArRouteRankListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchArRouteRankListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchArRouteRankListVO;
	}

	/**
	 * AR Route Rank 정보를 저장한다(입력)<br>
	 * 
	 * @param List<SearchArRouteRankListVO> addVoList
	 * @throws DAOException
	 * @throws DAOException
	 */
	public void addArRouteRanks(List<SearchArRouteRankListVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddArRouteRanksCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Route Rank 정보를 저장한다(수정)<br>
	 * 
	 * @param List<SearchArRouteRankListVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyArRouteRanks(List<SearchArRouteRankListVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyArRouteRanksUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Route Rank 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<SearchArRouteRankListVO> removeVoList
	 * @throws DAOException
	 */
	public void removeArRouteRanks(List<SearchArRouteRankListVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveArRouteRanksDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * AR Route Rank 정보 전체를 삭제한다.<br>
	 * 
	 * @throws DAOException
	 */
	public void removeAllArRouteRanks() throws DAOException {

		try {
			SQLExecuter sqlExe = new SQLExecuter("");

			sqlExe.executeUpdate(new FinanceCreationDBDAORemoveAllArRouteRanksDSQL(), null, null);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL ESTIMATE REVENUE VVD 정보를 가져온다
	 * 
	 * @param String exeYrmon
	 * @param String revYrmon
	 * @param String vslCd
	 * @param String revDirCd 
	 * @param String estmVvdTpCd
	 * @param String estmIocDivCd
	 * @param String vvd 
	 * @return List<SearchGlEstimateRevenueVvdListVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchGlEstimateRevenueVvdListVO> searchGlEstimateRevenueVvdList(String exeYrmon, String revYrmon, String vslCd, String revDirCd, String estmVvdTpCd,
			String estmIocDivCd, String vvd) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<SearchGlEstimateRevenueVvdListVO> searchGlEstimateRevenueVvdListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("exe_yrmon", exeYrmon.replace("-", ""));
			param.put("rev_yrmon", revYrmon.replace("-", ""));
			param.put("vsl_cd", vslCd);
			param.put("rev_dir_cd", revDirCd);
			param.put("estm_vvd_tp_cd", estmVvdTpCd);
			param.put("estm_ioc_div_cd", estmIocDivCd);
			param.put("vvd", vvd);
			vparam.putAll(param);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchGlEstimateRevenueVvdListRSQL(), param, vparam);
			searchGlEstimateRevenueVvdListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchGlEstimateRevenueVvdListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchGlEstimateRevenueVvdListVO;
	}

	/**
	 * GL ESTIMATE REVENUE VVD 정보를 저장할때 중복 데이터가 있는지 확인한다<br>
	 * 
	 * @param String exeYrmon
	 * @param String revYrmon
	 * @param String vslCd
	 * @param String skdVoyNo
	 * @param String skdDirCd
	 * @param  String revDirCd
	 * @param String estmVvdTpCd
	 * @param String estmIocDivCd 
	 * @return int
	 * @throws DAOException
	 * @exception EventException
	 */
	public int checkDupGlEstimateRevenueVvd(String exeYrmon, String revYrmon, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String estmVvdTpCd,
			String estmIocDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("exe_yrmon", exeYrmon);
			param.put("rev_yrmon", revYrmon);
			param.put("vsl_cd", vslCd);
			param.put("skd_voy_no", skdVoyNo);
			param.put("skd_dir_cd", skdDirCd);
			param.put("rev_dir_cd", revDirCd);
			param.put("estm_vvd_tp_cd", estmVvdTpCd);
			param.put("estm_ioc_div_cd", estmIocDivCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupGlEstimateRevenueVvdRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}

	/**
	 * GL ESTIMATE REVENUE VVD 정보를 저장한다(입력)<br>
	 * 
	 * @param List<SearchGlEstimateRevenueVvdListVO> addVoList
	 * @throws DAOException
	 * @throws DAOException
	 */
	public void addGlEstimateRevenueVvds(List<SearchGlEstimateRevenueVvdListVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddGlEstimateRevenueVvdsCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL ESTIMATE REVENUE VVD 정보를 저장한다(수정)<br>
	 * 
	 * @param List<SearchGlEstimateRevenueVvdListVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyGlEstimateRevenueVvds(List<SearchGlEstimateRevenueVvdListVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyGlEstimateRevenueVvdsUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL ESTIMATE REVENUE VVD 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<SearchGlEstimateRevenueVvdListVO> removeVoList
	 * @throws DAOException
	 */
	public void removeGlEstimateRevenueVvds(List<SearchGlEstimateRevenueVvdListVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveGlEstimateRevenueVvdsDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL MONTHLY EXCHNAGE RATE 정보를 가져온다
	 * 
	 * @param String acctXchRtYrmon
	 * @param String currCd
	 * @return List<SearchGlMonthlyExchangeRateListVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<SearchGlMonthlyExchangeRateListVO> searchGlMonthlyExchangeRateList(String acctXchRtYrmon, String currCd) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<SearchGlMonthlyExchangeRateListVO> searchGlMonthlyExchangeRateListVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("acct_xch_rt_yrmon", acctXchRtYrmon.replace("-", ""));
			param.put("curr_cd", currCd);

			vparam.putAll(param);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchGlMonthlyExchangeRateListRSQL(), param, vparam);
			searchGlMonthlyExchangeRateListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchGlMonthlyExchangeRateListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchGlMonthlyExchangeRateListVO;
	}

	/**
	 * GL MONTHLY EXCHNAGE RATE 정보를 저장할때 중복 데이터가 있는지 확인한다<br>
	 * 
	 * @param String acctXchRtYrmon
	 * @param String acctXchRtLvl
	 * @param String currCd
	 * @return int
	 * @throws DAOException
	 * @exception EventException
	 */
	public int checkDupGlMonthlyExchangeRate(String acctXchRtYrmon, String acctXchRtLvl, String currCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("acct_xch_rt_yrmon", acctXchRtYrmon);
			param.put("acct_xch_rt_lvl", acctXchRtLvl);
			param.put("curr_cd", currCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupGlMonthlyExchangeRateRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}

	/**
	 * GL MONTHLY EXCHNAGE RATE 정보를 저장한다(입력)<br>
	 * 
	 * @param List<SearchGlMonthlyExchangeRateListVO> addVoList
	 * @throws DAOException
	 * @throws DAOException
	 */
	public void addGlMonthlyExchangeRates(List<SearchGlMonthlyExchangeRateListVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddGlMonthlyExchangeRatesCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL MONTHLY EXCHNAGE RATE 정보를 저장한다(수정)<br>
	 * 
	 * @param List<SearchGlMonthlyExchangeRateListVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyGlMonthlyExchangeRates(List<SearchGlMonthlyExchangeRateListVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyGlMonthlyExchangeRatesUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * GL MONTHLY EXCHNAGE RATE 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<SearchGlMonthlyExchangeRateListVO> removeVoList
	 * @throws DAOException
	 */
	public void removeGlMonthlyExchangeRates(List<SearchGlMonthlyExchangeRateListVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveGlMonthlyExchangeRatesDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Center Code를 조회합니다.<br>
	 * 
	 * @param GlCtrErpVO glCtrErpVO
	 * @return List<GlCtrErpVO>
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<GlCtrErpVO> searchCenterCode(GlCtrErpVO glCtrErpVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<GlCtrErpVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			if (glCtrErpVO != null) {
				Map<String, String> mapVO = glCtrErpVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchCenterCodeRSQL(), param, velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, GlCtrErpVO.class);

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
	 * Center Code를 추가합니다.<br>
	 * 
	 * @param List<GlCtrErpVO> glCtrErpVOs
	 * @exception DAOException
	 */
	public void addCenterCode(List<GlCtrErpVO> glCtrErpVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glCtrErpVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddCenterCodeCSQL(), glCtrErpVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Center Code를 수정합니다.<br>
	 * 
	 * @param List<GlCtrErpVO> glCtrErpVOs
	 * @exception DAOException
	 */
	public void modifyCenterCode(List<GlCtrErpVO> glCtrErpVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glCtrErpVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyCenterCodeUSQL(), glCtrErpVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Center Code를 삭제합니다.<br>
	 * 
	 * @param List<GlCtrErpVO> glCtrErpVOs
	 * @exception DAOException
	 */
	public void removeCenterCode(List<GlCtrErpVO> glCtrErpVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glCtrErpVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveCenterCodeDSQL(), glCtrErpVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Error Vvd를 조회합니다.<br>
	 * 
	 * @param GlErrVvdVO glErrVvdVO
	 * @return List<GlErrVvdVO>
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<GlErrVvdVO> searchErrVvd(GlErrVvdVO glErrVvdVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<GlErrVvdVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			if (glErrVvdVO != null) {
				Map<String, String> mapVO = glErrVvdVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchErrVvdRSQL(), param, velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, GlErrVvdVO.class);

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
	 * Error Vvd를 추가합니다.<br>
	 * 
	 * @param List<GlErrVvdVO> glErrVvdVOs
	 * @exception DAOException
	 */
	public void addErrVvd(List<GlErrVvdVO> glErrVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glErrVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddErrVvdCSQL(), glErrVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Error Vvd를 수정합니다.<br>
	 * 
	 * @param List<GlErrVvdVO> glErrVvdVOs
	 * @exception DAOException
	 */
	public void modifyErrVvd(List<GlErrVvdVO> glErrVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glErrVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyErrVvdUSQL(), glErrVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Error Vvd를 삭제합니다.<br>
	 * 
	 * @param List<GlErrVvdVO> glErrVvdVOs
	 * @exception DAOException
	 */
	public void removeErrVvd(List<GlErrVvdVO> glErrVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glErrVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveErrVvdDSQL(), glErrVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * Estm Rev VVD를 조회합니다.<br>
	 * 
	 * @param GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<GlEstmRevVvdVO> searchEstRvvdCode(GlEstmRevVvdVO glEstmRevVvdVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<GlEstmRevVvdVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			if (glEstmRevVvdVO != null) {
				Map<String, String> mapVO = glEstmRevVvdVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchEstRvvdCodeRSQL(), param, velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, GlEstmRevVvdVO.class);
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
	 * 
	 * 
	 * @param List<GlEstmRevVvdVO> glEstmRevVvdVOs
	 * @throws DAOException
	 */
	public void addEstRvvdCode(List<GlEstmRevVvdVO> glEstmRevVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glEstmRevVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddEstRvvdCodeCSQL(), glEstmRevVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * 
	 * @param List<GlEstmRevVvdVO> glEstmRevVvdVOs
	 * @throws DAOException
	 */
	public void modifyEstRvvdCode(List<GlEstmRevVvdVO> glEstmRevVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glEstmRevVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyEstRvvdCodeUSQL(), glEstmRevVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * 
	 * @param List<GlEstmRevVvdVO> glEstmRevVvdVOs
	 * @throws DAOException
	 */
	public void removeEstRvvdCode(List<GlEstmRevVvdVO> glEstmRevVvdVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glEstmRevVvdVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveEstRvvdCodeDSQL(), glEstmRevVvdVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * 
	 * @param GlFmcEntVO glFmcEntVO
	 * @return List<GlFmcEntVO>
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<GlFmcEntVO> searchEstFmcCode(GlFmcEntVO glFmcEntVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<GlFmcEntVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			if (glFmcEntVO != null) {
				Map<String, String> mapVO = glFmcEntVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchEstFmcCodeRSQL(), param, velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, GlFmcEntVO.class);
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
	 * 
	 * @param List<GlFmcEntVO> glFmcEntVOs
	 * @throws DAOException
	 */
	public void addEstFmcCode(List<GlFmcEntVO> glFmcEntVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glFmcEntVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddEstFmcCodeCSQL(), glFmcEntVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * @param List<GlFmcEntVO> glFmcEntVOs
	 * @throws DAOException
	 */
	public void modifyEstFmcCode(List<GlFmcEntVO> glFmcEntVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glFmcEntVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyEstFmcCodeUSQL(), glFmcEntVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * @param List<GlFmcEntVO> glFmcEntVOs
	 * @throws DAOException
	 */
	public void removeEstFmcCode(List<GlFmcEntVO> glFmcEntVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (glFmcEntVOs.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveEstFmcCodeDSQL(), glFmcEntVOs, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Open the data of Next Month AP period(inserting)<br>
	 * 
	 * @param String usrId
	 * @throws DAOException
	 */
	public void manageOpenNextMonthApPeriod(String usrId) throws DAOException {
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {			
			param.put("usr_id", usrId);
			velParam.put("usr_id", usrId);
			
			SQLExecuter sqlExe = new SQLExecuter("");

			sqlExe.executeUpdate(new FinanceCreationDBDAOAddOpenNextMonthApPeriodCSQL(), param, param);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the list of Max AP PERIOD
	 * 
	 * @return SearchApPeriodListVO
	 * @throws DAOException
	 */
	@SuppressWarnings("unchecked")
	public SearchApPeriodListVO searchMaxApPeriodList() throws DAOException {
		DBRowSet dbRowset = null;

		List<SearchApPeriodListVO> searchApPeriodListVO = null;
		SearchApPeriodListVO result = null;

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchMaxApPeriodListVORSQL(), null, null);

			searchApPeriodListVO = (List) RowSetUtil.rowSetToVOs(dbRowset, SearchApPeriodListVO.class);
			
			if(searchApPeriodListVO.size() > 0){
				result = searchApPeriodListVO.get(0);
			}
			

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}

		return result;
	}
	
	/**
	 * Retrieving the list of GL Daily EXCHNAGE RATE
	 * 
	 * @param String acctXchRtFmDt
	 * @param String acctXchRtToDt
	 * @param String fmCurrCd
	 * @param String toCurrCd
	 * @return List<GlDlyXchRtVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<GlDlyXchRtVO> searchGlDailyExchangeRateList(String acctXchRtFmDt, String acctXchRtToDt, String fmCurrCd, String toCurrCd) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<GlDlyXchRtVO> glDlyXchRtVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("s_acct_xch_rt_fm_dt", acctXchRtFmDt.replace("-", ""));			
			vparam.put("s_acct_xch_rt_fm_dt", acctXchRtFmDt.replace("-", ""));
			
			param.put("s_acct_xch_rt_to_dt", acctXchRtToDt.replace("-", ""));
			vparam.put("s_acct_xch_rt_to_dt", acctXchRtToDt.replace("-", ""));
			
			param.put("s_fm_curr_cd", fmCurrCd);
			vparam.put("s_fm_curr_cd", fmCurrCd);
			
			param.put("s_to_curr_cd", toCurrCd);
			vparam.put("s_to_curr_cd", toCurrCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchGlDailyExchangeRateListRSQL(), param, vparam);
			glDlyXchRtVO = (List) RowSetUtil.rowSetToVOs(dbRowset, GlDlyXchRtVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return glDlyXchRtVO;
	}
	
	/**
	 * GL Daily EXCHNAGE RATE 정보를 저장한다(삭제)<br>
	 * 
	 * @param List<GlDlyXchRtVO> removeVoList
	 * @throws DAOException
	 */
	public void removeGlDailyExchangeRates(List<GlDlyXchRtVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveGlDailyExchangeRatesDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * GL Daily EXCHNAGE RATE 정보를 저장할때 중복 데이터가 있는지 확인한다<br>
	 * 
	 * @param String acctXchRtDt
	 * @param String acctXchRtLvl
	 * @param String fmCurrCd
	 * @param String toCurrCd
	 * @return int
	 * @throws DAOException
	 * @exception EventException
	 */
	public int checkDupGlDailyExchangeRate(String acctXchRtDt, String acctXchRtLvl, String fmCurrCd, String toCurrCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("acct_xch_rt_dt", acctXchRtDt);
			param.put("acct_xch_rt_lvl", acctXchRtLvl);
			param.put("fm_curr_cd", fmCurrCd);
			param.put("to_curr_cd", toCurrCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOCheckDupGlDailyExchangeRateRSQL(), param, null);
			if (dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * GL Daily EXCHNAGE RATE 정보를 저장한다(입력)<br>
	 * 
	 * @param List<GlDlyXchRtVO> addVoList
	 * @throws DAOException
	 * @throws DAOException
	 */
	public void addGlDailyExchangeRates(List<GlDlyXchRtVO> addVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (addVoList != null && addVoList.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddGlDailyExchangeRatesCSQL(), addVoList, null);
				for (int i = 0; i < insCnt.length; i++) {
					if (insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * GL Daily EXCHNAGE RATE 정보를 저장한다(수정)<br>
	 * 
	 * @param List<GlDlyXchRtVO> modifyVoList
	 * @throws DAOException
	 */
	public void modifyGlDailyExchangeRates(List<GlDlyXchRtVO> modifyVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (modifyVoList != null && modifyVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyGlDailyExchangeRatesUSQL(), modifyVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the list of Revenue Month VVD
	 * 
	 * @param String tarYrmon
	 * @param String monthFlag
	 * @return List<RevenueMonthVvdVO>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<RevenueMonthVvdVO> searchRevenueVvdMonth(String tarYrmon, String monthFlag) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		List<RevenueMonthVvdVO> searchRevenueMonthVvdVO = null;

		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();

		try {
			// query parameter
			param.put("tar_yrmon", tarYrmon.replace("-", ""));
			param.put("month_flag", monthFlag);

			vparam.putAll(param);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchRevenueMonthVvdRSQL(), param, vparam);
			searchRevenueMonthVvdVO = (List) RowSetUtil.rowSetToVOs(dbRowset, RevenueMonthVvdVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return searchRevenueMonthVvdVO;
	}
	
	/**
	 * Insert Revenue Month VVD<br>
	 * 
	 * @param List<RevenueMonthVvdVO> insertVoList
	 * @throws DAOException
	 */
	public void addRevenueMonthVvd(List<RevenueMonthVvdVO> insertVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (insertVoList != null && insertVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOAddRevenueMonthVvdCSQL(), insertVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to add No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Modify Revenue Month VVD<br>
	 * 
	 * @param List<RevenueMonthVvdVO> updateVoList
	 * @throws DAOException
	 */
	public void modifyRevenueMonthVvd(List<RevenueMonthVvdVO> updateVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (updateVoList != null && updateVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAOModifyRevenueMonthVvdUSQL(), updateVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to modify No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Remove Revenue Month VVD<br>
	 * 
	 * @param List<RevenueMonthVvdVO> removeVoList
	 * @throws DAOException
	 */
	public void removeRevenueMonthVvd(List<RevenueMonthVvdVO> removeVoList) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if (removeVoList != null && removeVoList.size() > 0) {
				updCnt = sqlExe.executeBatch((ISQLTemplate) new FinanceCreationDBDAORemoveRevenueMonthVvdDSQL(), removeVoList, null);
				for (int i = 0; i < updCnt.length; i++) {
					if (updCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No" + i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler("COM12244", new String[] {}).getUserMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 *Check SCO Period<br>
	 * 
	 * @param String revYrmon
	 * @return String
	 * @throws DAOException
	 */
	public String checkSCOPeriodIsOpened(String revYrmon) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();		
		try{
			param.put("rev_yrmon", revYrmon.replace("-", "").substring(0, 6));	// Rev Date
			
			vparam.putAll(param);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinanceCreationDBDAOCheckSCOPeriodIsOpenedRSQL(), param, vparam);
			if(dbRowset.next()) {
				result = dbRowset.getString("cnt");
			}

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return result;
	}
	 
	/**
	 * Create Estimated Revenue VVD with AR Master Revenue VVD for last 6 months<br>
	 * 
	 * @param GlEstmRevVvdVO glEstmRevVvdVO
	 * @param String userId
	 * @return GlEstmRevVvdVO
	 * @exception  DAOException
	*/
	@SuppressWarnings("unchecked")
    public GlEstmRevVvdVO manageEstmRevVVDInfo(GlEstmRevVvdVO glEstmRevVvdVO, String userId) throws DAOException {
		
		Map<String, Object> param 	= new HashMap<String, Object>();
		Map<String, Object> rtnMap 	= new HashMap<String, Object>();
		try {
			log.debug("glEstmRevVvdVO.getExeYrmon() : ----------------------------->" + glEstmRevVvdVO.getExeYrmon()	);
			log.debug("userId  						: ----------------------------->" + userId							);
			if(glEstmRevVvdVO != null)
			{
				param.put("pi_exe_month", glEstmRevVvdVO.getExeYrmon()	);
				param.put("pi_user_id"  , userId						);
			
				rtnMap = new SQLExecuter("DEFAULT").executeSP( (ISQLTemplate)new FinanceCreationDBDAOAddEstmRevVvdCSQL(), param, null );
				log.debug("rtnMap 		: ---------------------------->" + rtnMap						);
				log.debug("po_result 	: ---------------------------->" + rtnMap.get("po_result"	)	);
				log.debug("po_err_msg 	: ---------------------------->" + rtnMap.get("po_err_msg"	)	);
				
				glEstmRevVvdVO.setPoResult((rtnMap!=null && rtnMap.get("po_result"	)!=null)?(String)rtnMap.get("po_result"	):"");
				glEstmRevVvdVO.setPoErrMsg((rtnMap!=null && rtnMap.get("po_err_msg"	)!=null)?(String)rtnMap.get("po_err_msg"):"");
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
	    return glEstmRevVvdVO;
    }

	/**
	 * Duplicate Revenue Month VVD<br>
	 * 
	 * @param RevenueMonthVvdVO revenueMonthVvdVO
	 * @return boolean
	 * @exception  DAOException
	 */
	@SuppressWarnings("unchecked")
	public boolean isDupRevenueMonthVvd(RevenueMonthVvdVO revenueMonthVvdVO) throws DAOException {
		DBRowSet dbRowset = null;
		boolean result = false;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> vparam = new HashMap<String, Object>();		
		try {
			Map<String, String> mapVO = revenueMonthVvdVO.getColumnValues();
			
			param.putAll(mapVO);
			vparam.putAll(param);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new FinanceCreationDBDAODupRevenueMonthVvdRSQL(), param, vparam);
			if(dbRowset.next()) {
				result = true;
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return result;
	}

	/**
	 * search to Estimation VVD Creation Flag.<br>
	 * 
	 * @param GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception DAOException
	 */
	public SearchEstmVvdCreationFlagVO searchEstmVvdCreationFlag(GlEstmRevVvdVO glEstmRevVvdVO) throws DAOException {
		DBRowSet dbRowset = null;
		SearchEstmVvdCreationFlagVO flgVO = new SearchEstmVvdCreationFlagVO();
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		String acclMonth 	= "";
		String btnBlockFlg 	= "";
		
		try {
			log.debug("glEstmRevVvdVO : ----------------------------->" + glEstmRevVvdVO	);
			if(glEstmRevVvdVO != null) {
				log.debug("glEstmRevVvdVO.getExeYrmon() : ----------------------------->" + glEstmRevVvdVO.getExeYrmon()	);
				Map<String, String> mapVO = glEstmRevVvdVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new FinanceCreationDBDAOSearchEstmVvdCreationFlagRSQL(), param, velParam);
			if(dbRowset.next()) {
				acclMonth 	= dbRowset.getString("ACCL_YRMON"		);
				btnBlockFlg = dbRowset.getString("BUTTON_BLOCK_FLAG");
			}
			log.debug("acclMonth 		: ---------------------------->" + acclMonth	);
			log.debug("btnBlockFlg 		: ---------------------------->" + btnBlockFlg	);
			
			flgVO.setAcclYrmon(acclMonth);
			flgVO.setButtonBlockFlag(btnBlockFlg);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return flgVO;
	}
}