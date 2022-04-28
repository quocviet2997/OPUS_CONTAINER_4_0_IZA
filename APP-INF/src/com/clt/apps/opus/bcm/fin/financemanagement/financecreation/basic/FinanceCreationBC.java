/*=========================================================
 *Copyright(c) 2011 CyberLogitec
 *@FileName : FinanceCreationBC.java
 *@FileTitle : FinanceManagement
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.basic;

import java.util.List;

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
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.GlDlyXchRtVO;

/**
 * OPUS_CNTR-FinanceManagement Business Logic Command Interface<br>
 * - The interface of the business logic about OPUS_CNTR-FinanceManagement<br>
 * 
 * @author
 * @see FinanceCreationBCImpl
 * @since J2EE 1.6
 */
public interface FinanceCreationBC {

	/**
	 * Retrieving the list of AP PERIOD
	 * 
	 * @param String effYrmon
	 * @param String sysDivCd
	 * @param String ofcCd
	 * @param String arApDivCd
	 * @return List<SearchApPeriodListVO>
	 * @exception EventException
	 */
	public List<SearchApPeriodListVO> searchApPeriodList(String effYrmon, String sysDivCd, String ofcCd, String arApDivCd) throws EventException;

	/**
	 * Saving AP PERIOD(inserting, updating, deleting)<br>
	 * 
	 * @param SearchApPeriodListVO[] searchApPeriodListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageApPeriod(SearchApPeriodListVO[] searchApPeriodListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of AR Finance Direction Conversion
	 * 
	 * @param String slanCd
	 * @param String rlaneDirCd
	 * @return List<SearchArFincDirConvListVO>
	 * @exception EventException
	 */
	public List<SearchArFincDirConvListVO> searchArFincDirConvList(String slanCd, String rlaneDirCd) throws EventException;

	/**
	 * Saving AR Finance Direction Conversion(inserting, updating, deleting)
	 * 
	 * @param SearchArFincDirConvListVO[] searchArFincDirConvListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageArFincDirConv(SearchArFincDirConvListVO[] searchArFincDirConvListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of AR Finance Direction Conversion
	 * 
	 * @param String revYrmon
	 * @param String vslCd
	 * @param String vvd
	 * @return List<SearchArMasterRevenueVvdListVO>
	 * @exception EventException
	 */
	public List<SearchArMasterRevenueVvdListVO> searchArMasterRevenueVvdList(String revYrmon, String vslCd, String vvd) throws EventException;

	/**
	 * Saving AR Revenue Master VVD(inserting, updating and deleting)
	 * 
	 * @param SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageArMasterRevenueVvd(SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of AR Route Rank
	 * 
	 * @param String slanCd
	 * @param String rlaneCd
	 * @param String deltFlg
	 * @return List<SearchArRouteRankListVO>
	 * @exception EventException
	 */
	public List<SearchArRouteRankListVO> searchArRouteRankList(String slanCd, String rlaneCd, String deltFlg) throws EventException;

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating and deleting)
	 * 
	 * @param SearchArRouteRankListVO[] searchArRouteRankListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageArRouteRank(SearchArRouteRankListVO[] searchArRouteRankListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of GL ESTIMATE REVENUE VVD
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
	public List<SearchGlEstimateRevenueVvdListVO> searchGlEstimateRevenueVvdList(String exeYrmon, String revYrmon, String vslCd, String revDirCd, String estmVvdTpCd,
			String estmIocDivCd, String vvd) throws EventException;

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating and deleting)<br>
	 * 
	 * @param SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageGlEstimateRevenueVvd(SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of GL ESTIMATE REVENUE VVD
	 * 
	 * @param String acctXchRtYrmon
	 * @param String currCd
	 * @return List<SearchGlMonthlyExchangeRateListVO>
	 * @exception EventException
	 */
	public List<SearchGlMonthlyExchangeRateListVO> searchGlMonthlyExchangeRateList(String acctXchRtYrmon, String currCd) throws EventException;

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating, deleting)
	 * 
	 * @param SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageGlMonthlyExchangeRate(SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs, String usrId) throws EventException;

	/**
	 * search center code
	 * 
	 * @param  GlCtrErpVO glGlCtrErpVO
	 * @return List<GlCtrErpVO>
	 * @exception EventException
	 */
	public List<GlCtrErpVO> searchCenterCode(GlCtrErpVO glGlCtrErpVO) throws EventException;

	/**
	 * save/update center code
	 * 
	 * @param GlCtrErpVO[] glCtrErpVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void manageCenterCode(GlCtrErpVO[] glCtrErpVO, SignOnUserAccount account) throws EventException;

	/**
	 * search to errVVD
	 * 
	 * @param  GlErrVvdVO glErrVvdVO
	 * @return List<GlErrVvdVO>
	 * @exception EventException
	 */
	public List<GlErrVvdVO> searchErrorVvd(GlErrVvdVO glErrVvdVO) throws EventException;

	/**
	 * save/update to error vvd
	 * 
	 * @param GlErrVvdVO[] glErrVvdVO
	 * @exception EventException
	 */
	public void manageErrorVvd(GlErrVvdVO[] glErrVvdVO) throws EventException;

	/**
	 * search to estmrevvvd
	 * 
	 * @param  GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception EventException
	 */
	public List<GlEstmRevVvdVO> searchEstRvvdCode(GlEstmRevVvdVO glEstmRevVvdVO) throws EventException;

	/**
	 * save/update to estmrevvvd
	 * 
	 * @param GlEstmRevVvdVO[] glEstmRevVvdVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void manageEstRvvdCode(GlEstmRevVvdVO[] glEstmRevVvdVO, SignOnUserAccount account) throws EventException;

	/**
	 * search to estfmccode
	 * 
	 * @param  GlFmcEntVO glFmcEntVO
	 * @return List<GlFmcEntVO>
	 * @exception EventException
	 */
	public List<GlFmcEntVO> searchEstFmcCode(GlFmcEntVO glFmcEntVO) throws EventException;

	/**
	 * save/update to EstFmcCode
	 * 
	 * @param  GlFmcEntVO[] glFmcEntVOs
	 * @param  SignOnUserAccount account
	 * @exception EventException
	 */
	public void manageEstFmcCode(GlFmcEntVO[] glFmcEntVOs, SignOnUserAccount account) throws EventException;
	
	/**
	 * Open the data of Next Month AP period(inserting)<br>
	 * 
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageOpenNextMonthApPeriod(String usrId) throws EventException;
	
	/**
	 * Retrieving the list of Max AP PERIOD
	 * 
	 * @return SearchApPeriodListVO
	 * @exception EventException
	 */
	public SearchApPeriodListVO searchMaxApPeriodList() throws EventException;
	
	/**
	 * Retrieving the list of GL Daily EXCHNAGE RATE
	 * 
	 * @param  String acctXchRtFmDt
	 * @param  String acctXchRtToDt
	 * @param  String fmCurrCd
	 * @param  String toCurrCd
	 * @return List<GlDlyXchRtVO>
	 * @exception EventException
	 */
	public List<GlDlyXchRtVO> searchGlDailyExchangeRateList(String acctXchRtFmDt, String acctXchRtToDt, String fmCurrCd, String toCurrCd) throws EventException;
	
	/**
	 * Saving the data of GL Daily EXCHNAGE RATE<br>
	 * 
	 * @param GlDlyXchRtVO[] glDlyXchRtVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageGlDailyExchangeRate(GlDlyXchRtVO[] glDlyXchRtVOs, String usrId) throws EventException;
	
	/**
	 *Checking the list of GL Daily EXCHNAGE RATE
	 * 
	 * @param GlDlyXchRtVO[] glDlyXchRtVOs
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse chkGlDailyExchangeRateList(GlDlyXchRtVO[] glDlyXchRtVOs) throws EventException;
	
	/**
	 * Retrieving the list of Revenue Month VVD
	 * 
	 * @param String tarYrmon
	 * @param String monthFlag
	 * @return List<SearchArMasterRevenueVvdListVO>
	 * @exception EventException
	 */
	public List<RevenueMonthVvdVO> searchRevenueVvdMonth(String tarYrmon, String monthFlag) throws EventException;
	
	/**
	 * Saving the data of the list of Revenue Month VVD
	 * 
	 * @param RevenueMonthVvdVO[] revenueMonthVvdVOs
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void manageRevenueVvdMonth(RevenueMonthVvdVO[] revenueMonthVvdVOs, SignOnUserAccount account) throws EventException;
	
	/**
	 * Check SCOPeriod is opened
	 * 
	 * @param String revYrmon
	 * @return String
	 * @exception EventException
	 */
	public String checkSCOPeriodIsOpened(String revYrmon) throws EventException;
	
	/**
	 * Create Estimated Revenue VVD with AR Master Revenue VVD for last 6 months<br>
	 * 
	 * @param GlEstmRevVvdVO vo
	 * @param String userId
	 * @exception EventException
	 */	
	public void estmRevVvdBatch(GlEstmRevVvdVO vo, String userId) throws EventException;
	
	/**
	 * Create Estimated Revenue VVD with AR Master Revenue VVD for last 6 months<br>
	 * 
	 * @param GlEstmRevVvdVO vo
	 * @param String userId
	 * @return GlEstmRevVvdVO
	 * @exception EventException
	 */	
	public GlEstmRevVvdVO manageEstmRevVVDInfo(GlEstmRevVvdVO vo, String userId) throws EventException;

	/**
	 * search to Estimation VVD Creation Flag
	 * 
	 * @param  GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception EventException
	 */
	public SearchEstmVvdCreationFlagVO searchEstmVvdCreationFlag(GlEstmRevVvdVO glEstmRevVvdVO) throws EventException;
}