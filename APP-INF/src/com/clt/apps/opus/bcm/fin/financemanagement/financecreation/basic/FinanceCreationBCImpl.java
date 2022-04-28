/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : FinanceCreationBCImpl.java
*@FileTitle : FinanceManagement
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration.FinanceCreationDBDAO;
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
import com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration.FinCommonDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.GlDlyXchRtVO;
import com.clt.syscommon.common.util.ScheduleUtil;

/**
 * OPUS_CNTR-FinanceManagement Business Logic Basic Command implementation<br>
 * - Handling the business logic of OPUS_CNTR-FinanceManagement<br>
 *
 * @author 
 * @see FinanceCreationBCBC,FinanceCreationBCImpl
 * @since J2EE 1.6
 */

public class FinanceCreationBCImpl extends BasicCommandSupport implements FinanceCreationBC {
	// Database Access Object
	private transient FinanceCreationDBDAO dbDao = null;

	/**
	 * The constructor<br>
	 * Creating SetupCreationDBDAO class.<br>
	 */
	public FinanceCreationBCImpl() {
		dbDao = new FinanceCreationDBDAO();
	}
	
	/**
	 * Retrieving the list of AP PERIOD<br>
	 * 
	 * @param String effYrmon
	 * @param String sysDivCd
	 * @param String ofcCd
	 * @param String arApDivCd
	 * @return List<SearchApPeriodListVO>
	 * @exception EventException
	 */
	public List<SearchApPeriodListVO> searchApPeriodList(String effYrmon, String sysDivCd, String ofcCd, String arApDivCd) throws EventException {
		try {
			effYrmon = JSPUtil.removeCharacter(effYrmon,"-");
			
			return dbDao.searchApPeriodList(effYrmon, sysDivCd, ofcCd, arApDivCd);
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving AP PERIOD(inserting, updating, deleting)
	 * 
	 * @param SearchApPeriodListVO[] searchApPeriodListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageApPeriod(SearchApPeriodListVO[] searchApPeriodListVOs, String usrId) throws EventException{
		try {
			List<SearchApPeriodListVO> addVoList 	= new ArrayList<SearchApPeriodListVO>();
			List<SearchApPeriodListVO> modifyVoList = new ArrayList<SearchApPeriodListVO>();
			List<SearchApPeriodListVO> removeVoList = new ArrayList<SearchApPeriodListVO>();
			
			for(int i=0; i<searchApPeriodListVOs.length; i++) {
				searchApPeriodListVOs[i].setEffYrmon(JSPUtil.removeCharacter(searchApPeriodListVOs[i].getEffYrmon(),"-"));
				
				if(searchApPeriodListVOs[i].getIbflag().equals("I")) {
					
					searchApPeriodListVOs[i].setCreUsrId(usrId);
					searchApPeriodListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchApPeriodListVOs[i]);
					
				} else if(searchApPeriodListVOs[i].getIbflag().equals("U")) {
					searchApPeriodListVOs[i].setUpdUsrId(usrId);
					modifyVoList.add(searchApPeriodListVOs[i]);
					
				} else if(searchApPeriodListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchApPeriodListVOs[i]);
				}
			}
			
			//Deleting the data
			if(removeVoList.size() > 0) {
				//AP PERIOD
				dbDao.removeApPeriods(removeVoList);
			}
			
			//Inserting the data
			if(addVoList.size() > 0) {
				for(int i=0; i<addVoList.size(); i++) {
					// Checking duplicated AP PERIOD
					int cnt = dbDao.checkDupApPeriod(addVoList.get(i).getSysDivCd(), addVoList.get(i).getEffYrmon(), addVoList.get(i).getOfcCd(), addVoList.get(i).getArApDivCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"AP PERIOD"}).getMessage());
					}
				}
				//AP PERIOD
				dbDao.addApPeriods(addVoList);
			}
			
			//Updating the data
			if(modifyVoList.size() > 0) {
				//AP PERIOD
				dbDao.modifyApPeriods(modifyVoList);
			}
			
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}

	/**
	 * Retrieving the list of AR Finance Direction Conversion 
	 * 
	 * @param String slanCd
	 * @param String rlaneDirCd
	 * @return List<SearchArFincDirConvListVO>
	 * @exception EventException
	 */
	public List<SearchArFincDirConvListVO> searchArFincDirConvList(String slanCd, String rlaneDirCd) throws EventException {
		try {
			return dbDao.searchArFincDirConvList(slanCd, rlaneDirCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving AR Finance Direction Conversion(inserting, updating, deleting)
	 * 
	 * @param SearchArFincDirConvListVO[] searchArFincDirConvListVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageArFincDirConv(SearchArFincDirConvListVO[] searchArFincDirConvListVOs, String usrId) throws EventException{
		try {
			List<SearchArFincDirConvListVO> addVoList 	 = new ArrayList<SearchArFincDirConvListVO>();
			List<SearchArFincDirConvListVO> modifyVoList = new ArrayList<SearchArFincDirConvListVO>();
			List<SearchArFincDirConvListVO> removeVoList = new ArrayList<SearchArFincDirConvListVO>();
			
			for(int i=0; i<searchArFincDirConvListVOs.length; i++){
				SearchArFincDirConvListVO rowVo = searchArFincDirConvListVOs[i];
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);
				
				if(rowVo.getIbflag().equals("I")) {
					addVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}

			//Deleting the data
			dbDao.removeArFincDirConvs(removeVoList);
			//Inserting the data
			if(addVoList != null && addVoList.size() > 0){
				for(int i = 0; i<addVoList.size(); i++){
					SearchArFincDirConvListVO rowVo = addVoList.get(i);
					
					int cnt = dbDao.checkDupArFincDirConv(rowVo.getSlanCd(), rowVo.getScontiCd(), rowVo.getSlanDirCd(), rowVo.getRlaneDirCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"AP FIANACE DIRECTION CONVERSION"}).getMessage());
					}
				}
				dbDao.addArFincDirConvs(addVoList);
			}
			//Updating the data
			dbDao.modifyArFincDirConvs(modifyVoList);
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}

	/**
	 * Retrieving the list of AR Finance Direction Conversion
	 * 
	 * @param String revYrmon
	 * @param String vslCd
	 * @param String vvd
	 * @return List<SearchArMasterRevenueVvdListVO>
	 * @exception EventException
	 */
	public List<SearchArMasterRevenueVvdListVO> searchArMasterRevenueVvdList(String revYrmon, String vslCd, String vvd) throws EventException {
		try {
			return dbDao.searchArMasterRevenueVvdList(revYrmon, vslCd, vvd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * Saving AR Revenue Master VVD(inserting, updating and deleting)
	 * 
	 * @param SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs
	 * @param String usrId
	 * @throws EventException 
	 * @exception EventException
	 */
	public void manageArMasterRevenueVvd(SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs, String usrId) throws EventException {
		try {
			List<SearchArMasterRevenueVvdListVO> addVoList 	  = new ArrayList<SearchArMasterRevenueVvdListVO>();
			List<SearchArMasterRevenueVvdListVO> modifyVoList = new ArrayList<SearchArMasterRevenueVvdListVO>();
			List<SearchArMasterRevenueVvdListVO> removeVoList = new ArrayList<SearchArMasterRevenueVvdListVO>();
			
			for(int i=0; i<searchArMasterRevenueVvdListVOs.length; i++){
				SearchArMasterRevenueVvdListVO rowVo = searchArMasterRevenueVvdListVOs[i];
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);
				
				if(rowVo.getIbflag().equals("I")) {
					addVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}

			//Deleting the data
			dbDao.removeArMasterRevenueVvds(removeVoList);
			//Inserting the data
			if(addVoList != null && addVoList.size() > 0){
				for(int i = 0; i<addVoList.size(); i++){
					SearchArMasterRevenueVvdListVO rowVo = addVoList.get(i);
					int cnt = dbDao.checkDupArMasterRevenueVvd(rowVo.getVslCd(), rowVo.getSkdVoyNo(), rowVo.getSkdDirCd(), rowVo.getRlaneDirCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"AP MASTER REVENUE VVD"}).getMessage());
					}
				}
				dbDao.addArMasterRevenueVvds(addVoList);
			}
			//Updating the data
			dbDao.modifyArMasterRevenueVvds(modifyVoList);
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
	/**
	 * Retrieving the list of AR Route Rank
	 * 
	 * @param String slanCd
	 * @param String rlaneCd
	 * @param String deltFlg
	 * @return List<SearchArRouteRankListVO>
	 * @exception EventException
	 */
	public List<SearchArRouteRankListVO> searchArRouteRankList(String slanCd, String rlaneCd, String deltFlg) throws EventException {
		String[] slanCdArr = null;
		String[] rlaneCdArr = null;
		String slanCdTxt = "";
		String rlaneCdTxt = "";
		
		try {
			//multi 선택된 service lane 값 변환
			slanCdArr = slanCd.split(",");
			for(int i=0;i<slanCdArr.length;i++) {
				if(i == 0 && !slanCdArr[i].equals("")){
					slanCdTxt = "'" + slanCdArr[i] + "'";
				} else if (i >0){
					slanCdTxt = slanCdTxt + ",'" + slanCdArr[i] + "'";
				}
			}
			//multi 선택된 revenue lane 값 변환
			rlaneCdArr = rlaneCd.split(",");
			for(int i=0;i<rlaneCdArr.length;i++) {
				if(i == 0 && !rlaneCdArr[i].equals("")){
					rlaneCdTxt = "'" + rlaneCdArr[i] + "'";
				} else if (i >0){
					rlaneCdTxt = rlaneCdTxt + ",'" + rlaneCdArr[i] + "'";
				}
			}			
			return dbDao.searchArRouteRankList(slanCdTxt, rlaneCdTxt, deltFlg);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating and deleting)
	 * 
	 * @param SearchArRouteRankListVO[] searchArRouteRankListVOs
	 * @param String usrId
	 * @throws EventException 
	 * @exception EventException
	 */
	public void manageArRouteRank(SearchArRouteRankListVO[] searchArRouteRankListVOs, String usrId) throws EventException {
		try {
			List<SearchArRouteRankListVO> addVoList    = new ArrayList<SearchArRouteRankListVO>();
			List<SearchArRouteRankListVO> modifyVoList = new ArrayList<SearchArRouteRankListVO>();
			List<SearchArRouteRankListVO> removeVoList = new ArrayList<SearchArRouteRankListVO>();
			
			//The flag for checking inserting or deleting in the grid of the sheet.
			String changeYn = "N";
			
			//Index variable for making the sequence.
			int idx = 1;
			
			for(int i=0; i<searchArRouteRankListVOs.length; i++){
				
				SearchArRouteRankListVO rowVo = searchArRouteRankListVOs[i];
				
				//Checking if each grid has been changed(inserting or deleting). 
				//Y means existed, N means not existed
				if(i==0 && rowVo.getChangeFlg().equals("Y")) {
					changeYn = "Y";
				}

				if(changeYn.equals("Y") && !rowVo.getIbflag().equals("D")) {
					rowVo.setIbflag("I");
				}
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);

				if(rowVo.getIbflag().equals("I")) {

					rowVo.setRnkSeq(idx+"");
					addVoList.add(rowVo);
					idx++;
					
				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}
			
			if(addVoList.size() > 0 || removeVoList.size() > 0){
				//Deleting all data
				dbDao.removeAllArRouteRanks();
			}

			if(addVoList.size() > 0){
				//Inserting the data
				dbDao.addArRouteRanks(addVoList);
			}
			
			if(modifyVoList.size() > 0) {
				//Updating the data
				dbDao.modifyArRouteRanks(modifyVoList);
			}
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
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
	public List<SearchGlEstimateRevenueVvdListVO> searchGlEstimateRevenueVvdList(String exeYrmon, String revYrmon, String vslCd, String revDirCd, String estmVvdTpCd, String estmIocDivCd, String vvd) throws EventException {
		try {
			return dbDao.searchGlEstimateRevenueVvdList(exeYrmon, revYrmon, vslCd, revDirCd, estmVvdTpCd, estmIocDivCd, vvd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating and deleting)<br>
	 * 
	 * @param SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs
	 * @param String usrId
	 * @throws EventException 
	 * @exception EventException
	 */
	public void manageGlEstimateRevenueVvd(SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs, String usrId) throws EventException {
		try {
			List<SearchGlEstimateRevenueVvdListVO> addVoList 	= new ArrayList<SearchGlEstimateRevenueVvdListVO>();
			List<SearchGlEstimateRevenueVvdListVO> modifyVoList = new ArrayList<SearchGlEstimateRevenueVvdListVO>();
			List<SearchGlEstimateRevenueVvdListVO> removeVoList = new ArrayList<SearchGlEstimateRevenueVvdListVO>();
			
			for(int i=0; i<searchGlEstimateRevenueVvdListVOs.length; i++){
				SearchGlEstimateRevenueVvdListVO rowVo = searchGlEstimateRevenueVvdListVOs[i];
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);
				
				if(rowVo.getIbflag().equals("I")) {

					addVoList.add(rowVo);

				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}

			//Deleting the data
			dbDao.removeGlEstimateRevenueVvds(removeVoList);
			//Inserting the data
			if(addVoList != null && addVoList.size() > 0){
				for(int i = 0; i<addVoList.size(); i++){
					SearchGlEstimateRevenueVvdListVO rowVo = addVoList.get(i);
					int cnt = dbDao.checkDupGlEstimateRevenueVvd(rowVo.getExeYrmon(), rowVo.getRevYrmon(), rowVo.getVslCd(), rowVo.getSkdVoyNo(), rowVo.getSkdDirCd(), rowVo.getRevDirCd(), rowVo.getEstmVvdTpCd(), rowVo.getEstmIocDivCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"GL ESTIMATE REVENUE VVD"}).getMessage());
					}
				}
				dbDao.addGlEstimateRevenueVvds(addVoList);
			}
			//Updating the data
			dbDao.modifyGlEstimateRevenueVvds(modifyVoList);
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
	/**
	 * Retrieving the list of GL ESTIMATE REVENUE VVD
	 * 
	 * @param String acctXchRtYrmon
	 * @param String currCd
	 * @return List<SearchGlMonthlyExchangeRateListVO>
	 * @exception EventException
	 */
	public List<SearchGlMonthlyExchangeRateListVO> searchGlMonthlyExchangeRateList(String acctXchRtYrmon, String currCd) throws EventException {
		try {
			return dbDao.searchGlMonthlyExchangeRateList(acctXchRtYrmon, currCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * Saving GL ESTIMATE REVENUE VVD(inserting, updating, deleting)
	 * 
	 * @param SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs
	 * @param String usrId
	 * @throws EventException 
	 * @exception EventException
	 */
	public void manageGlMonthlyExchangeRate(SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs, String usrId) throws EventException {
		try {
			List<SearchGlMonthlyExchangeRateListVO> addVoList 	 = new ArrayList<SearchGlMonthlyExchangeRateListVO>();
			List<SearchGlMonthlyExchangeRateListVO> modifyVoList = new ArrayList<SearchGlMonthlyExchangeRateListVO>();
			List<SearchGlMonthlyExchangeRateListVO> removeVoList = new ArrayList<SearchGlMonthlyExchangeRateListVO>();
			
			for(int i=0; i<searchGlMonthlyExchangeRateListVOs.length; i++){
				SearchGlMonthlyExchangeRateListVO rowVo = searchGlMonthlyExchangeRateListVOs[i];
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);
				
				if(rowVo.getIbflag().equals("I")) {
					addVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}

			//Deleting the data of the removing list
			dbDao.removeGlMonthlyExchangeRates(removeVoList);
			//Inserting the data of the adding list
			if(addVoList != null && addVoList.size() > 0){
				for(int i = 0; i<addVoList.size(); i++){
					SearchGlMonthlyExchangeRateListVO rowVo = addVoList.get(i);
					// Checking if there is a duplicated GL ESTIMATE REVENUE VVD data.
					int cnt = dbDao.checkDupGlMonthlyExchangeRate(rowVo.getAcctXchRtYrmon(), rowVo.getAcctXchRtLvl(), rowVo.getCurrCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"GL MONTHLY EXCHNAGE RATE"}).getMessage());
					}
				}
				dbDao.addGlMonthlyExchangeRates(addVoList);
			}
			
			//Updating the data of the modifying list.
			dbDao.modifyGlMonthlyExchangeRates(modifyVoList);
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
	/**
	 * search center code
	 * 
	 * @param  GlCtrErpVO glCtrErpVO
	 * @return List<GlCtrErpVO>
	 * @exception EventException
	 */
	@Override
	public List<GlCtrErpVO> searchCenterCode(GlCtrErpVO glCtrErpVO) throws EventException {
		try {
			return dbDao.searchCenterCode(glCtrErpVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * save/update center code
	 * 
	 * @param GlCtrErpVO[] glCtrErpVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	@Override
	public void manageCenterCode(GlCtrErpVO[] glCtrErpVO, SignOnUserAccount account) throws EventException {
		try {
			List<GlCtrErpVO> insertVoList = new ArrayList<GlCtrErpVO>();
			List<GlCtrErpVO> updateVoList = new ArrayList<GlCtrErpVO>();
			List<GlCtrErpVO> deleteVoList = new ArrayList<GlCtrErpVO>();

			for (int i = 0; i < glCtrErpVO.length; i++) {
				if (glCtrErpVO[i].getIbflag().equals("I")) {
					glCtrErpVO[i].setCreUsrId(account.getUsr_id());
					glCtrErpVO[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(glCtrErpVO[i]);
				} else if (glCtrErpVO[i].getIbflag().equals("U")) {
					glCtrErpVO[i].setUpdUsrId(account.getUsr_id());					
					updateVoList.add(glCtrErpVO[i]);
					
				} else if (glCtrErpVO[i].getIbflag().equals("D")) {
					deleteVoList.add(glCtrErpVO[i]);
				}
			}

			if (insertVoList.size() > 0) {
				dbDao.addCenterCode(insertVoList);
			}

			if (updateVoList.size() > 0) {
				dbDao.modifyCenterCode(updateVoList);
			}

			if (deleteVoList.size() > 0) {
				dbDao.removeCenterCode(deleteVoList);
			}
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
	
	/**
	 * search to errVVD
	 * 
	 * @param  GlErrVvdVO glErrVvdVO
	 * @return List<GlErrVvdVO>
	 * @exception EventException
	 */
	@Override
	public List<GlErrVvdVO> searchErrorVvd(GlErrVvdVO glErrVvdVO) throws EventException {
		try {
			return dbDao.searchErrVvd(glErrVvdVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * save/update to error vvd
	 * 
	 * @param GlErrVvdVO[] glErrVvdVO
	 * @exception EventException
	 */
	@Override
	public void manageErrorVvd(GlErrVvdVO[] glErrVvdVO) throws EventException {
		try {
			List<GlErrVvdVO> insertVoList = new ArrayList<GlErrVvdVO>();
			List<GlErrVvdVO> updateVoList = new ArrayList<GlErrVvdVO>();
			List<GlErrVvdVO> deleteVoList = new ArrayList<GlErrVvdVO>();

			for (int i = 0; i < glErrVvdVO.length; i++) {
				if (glErrVvdVO[i].getIbflag().equals("I")) {
					insertVoList.add(glErrVvdVO[i]);
				} else if (glErrVvdVO[i].getIbflag().equals("U")) {				
					updateVoList.add(glErrVvdVO[i]);
					
				} else if (glErrVvdVO[i].getIbflag().equals("D")) {
					deleteVoList.add(glErrVvdVO[i]);
				}
			}

			if (insertVoList.size() > 0) {
				dbDao.addErrVvd(insertVoList);
			}

			if (updateVoList.size() > 0) {
				dbDao.modifyErrVvd(updateVoList);
			}

			if (deleteVoList.size() > 0) {
				dbDao.removeErrVvd(deleteVoList);
			}
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
	
	/**
	 * search to estmrevvvd
	 * 
	 * @param  GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception EventException
	 */
	@Override
	public List<GlEstmRevVvdVO> searchEstRvvdCode(GlEstmRevVvdVO glEstmRevVvdVO) throws EventException {
		try {
			return dbDao.searchEstRvvdCode(glEstmRevVvdVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * save/update to estmrevvvd
	 * 
	 * @param GlEstmRevVvdVO[] glEstmRevVvdVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	@Override
	public void manageEstRvvdCode(GlEstmRevVvdVO[] glEstmRevVvdVO, SignOnUserAccount account) throws EventException {
		try {
			List<GlEstmRevVvdVO> insertVoList = new ArrayList<GlEstmRevVvdVO>();
			List<GlEstmRevVvdVO> updateVoList = new ArrayList<GlEstmRevVvdVO>();
			List<GlEstmRevVvdVO> deleteVoList = new ArrayList<GlEstmRevVvdVO>();

			for (int i = 0; i < glEstmRevVvdVO.length; i++) {
				if (glEstmRevVvdVO[i].getIbflag().equals("I")) {
					glEstmRevVvdVO[i].setCreUsrId(account.getUsr_id());
					glEstmRevVvdVO[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(glEstmRevVvdVO[i]);
				} else if (glEstmRevVvdVO[i].getIbflag().equals("U")) {
					glEstmRevVvdVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(glEstmRevVvdVO[i]);
				} else if (glEstmRevVvdVO[i].getIbflag().equals("D")) {
					deleteVoList.add(glEstmRevVvdVO[i]);
				}
			}

			if (insertVoList.size() > 0) {
				dbDao.addEstRvvdCode(insertVoList);
			}

			if (updateVoList.size() > 0) {
				dbDao.modifyEstRvvdCode(updateVoList);
			}

			if (deleteVoList.size() > 0) {
				dbDao.removeEstRvvdCode(deleteVoList);
			}
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
	
	
	/**
	 * search to estfmccode
	 * 
	 * @param  GlFmcEntVO glFmcEntVO
	 * @return List<GlFmcEntVO>
	 * @exception EventException
	 */
	@Override
	public List<GlFmcEntVO> searchEstFmcCode(GlFmcEntVO glFmcEntVO) throws EventException {
		try {
			return dbDao.searchEstFmcCode(glFmcEntVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * save/update to EstFmcCode
	 * 
	 * @param  GlFmcEntVO[] glFmcEntVOs
	 * @param  SignOnUserAccount account
	 * @exception EventException
	 */
	@Override
	public void manageEstFmcCode(GlFmcEntVO[] glFmcEntVOs, SignOnUserAccount account) throws EventException {
		try {
			List<GlFmcEntVO> insertVoList = new ArrayList<GlFmcEntVO>();
			List<GlFmcEntVO> updateVoList = new ArrayList<GlFmcEntVO>();
			List<GlFmcEntVO> deleteVoList = new ArrayList<GlFmcEntVO>();
			
			for (int i = 0; i < glFmcEntVOs.length; i++) {
				if (glFmcEntVOs[i].getIbflag().equals("I")) {
					glFmcEntVOs[i].setCreUsrId(account.getUsr_id());
					glFmcEntVOs[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(glFmcEntVOs[i]);
				} else if (glFmcEntVOs[i].getIbflag().equals("U")) {
					glFmcEntVOs[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(glFmcEntVOs[i]);
				} else if (glFmcEntVOs[i].getIbflag().equals("D")) {
					deleteVoList.add(glFmcEntVOs[i]);
				}
			}
			
			if (insertVoList.size() > 0) {
				dbDao.addEstFmcCode(insertVoList);
			}
			
			if (updateVoList.size() > 0) {
				dbDao.modifyEstFmcCode(updateVoList);
			}
			
			if (deleteVoList.size() > 0) {
				dbDao.removeEstFmcCode(deleteVoList);
			}
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
	
	/**
	 * Open the data of Next Month AP period(inserting)<br>
	 * 
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageOpenNextMonthApPeriod(String usrId) throws EventException{
		try {
			
			dbDao.manageOpenNextMonthApPeriod(usrId);
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
	/**
	 * Retrieving the list of Max AP PERIOD
	 * 
	 * @return SearchApPeriodListVO
	 * @exception EventException
	 */
	public SearchApPeriodListVO searchMaxApPeriodList() throws EventException{
		try {
			
			return dbDao.searchMaxApPeriodList();
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
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
	public List<GlDlyXchRtVO> searchGlDailyExchangeRateList(String acctXchRtFmDt, String acctXchRtToDt, String fmCurrCd, String toCurrCd) throws EventException{
		try {
			return dbDao.searchGlDailyExchangeRateList(acctXchRtFmDt, acctXchRtToDt, fmCurrCd, toCurrCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of GL Daily EXCHNAGE RATE<br>
	 * 
	 * @param GlDlyXchRtVO[] glDlyXchRtVOs
	 * @param String usrId
	 * @exception EventException
	 */
	public void manageGlDailyExchangeRate(GlDlyXchRtVO[] glDlyXchRtVOs, String usrId) throws EventException{
		try {
			List<GlDlyXchRtVO> addVoList 	 = new ArrayList<GlDlyXchRtVO>();
			List<GlDlyXchRtVO> modifyVoList = new ArrayList<GlDlyXchRtVO>();
			List<GlDlyXchRtVO> removeVoList = new ArrayList<GlDlyXchRtVO>();
			
			for(int i=0; i<glDlyXchRtVOs.length; i++){
				GlDlyXchRtVO rowVo = glDlyXchRtVOs[i];
				
				rowVo.setCreUsrId(usrId);
				rowVo.setUpdUsrId(usrId);
				
				if(rowVo.getIbflag().equals("I")) {
					addVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("D")) {
					removeVoList.add(rowVo);
					
				} else if(rowVo.getIbflag().equals("U")) {
					modifyVoList.add(rowVo);
				}
			}

			//Deleting the data of the removing list
			dbDao.removeGlDailyExchangeRates(removeVoList);
			//Inserting the data of the adding list
			if(addVoList != null && addVoList.size() > 0){
				for(int i = 0; i<addVoList.size(); i++){
					GlDlyXchRtVO rowVo = addVoList.get(i);
					// Checking if there is a duplicated GL ESTIMATE REVENUE VVD data.
					int cnt = dbDao.checkDupGlDailyExchangeRate(rowVo.getAcctXchRtDt(), rowVo.getAcctXchRtLvl(), rowVo.getFmCurrCd(), rowVo.getToCurrCd());

					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"GL Daily EXCHNAGE RATE"}).getMessage());
					}
				}
				dbDao.addGlDailyExchangeRates(addVoList);
			}
			
			//Updating the data of the modifying list.
			dbDao.modifyGlDailyExchangeRates(modifyVoList);
		} catch (EventException ex) {
			log.error("err " + ex.getMessage(), ex);
			throw ex;
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		}
	}
	
	/**
	 *Checking the list of GL Daily EXCHNAGE RATE
	 * 
	 * @param GlDlyXchRtVO[] glDlyXchRtVOs
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	@SuppressWarnings("finally")
	public EventResponse chkGlDailyExchangeRateList(GlDlyXchRtVO[] glDlyXchRtVOs) throws EventException {
		FinCommonDBDAO comDao = new FinCommonDBDAO();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		String fmCurrCd = "";
		String toCurrCd = "";
		String strResultMsg = "";
		
		int rowNo = 0;
		
		try {
			DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			formatter.setLenient(false);
			
			for(int i=0; i<glDlyXchRtVOs.length; i++){
				
				rowNo = i;
				formatter.parse(glDlyXchRtVOs[i].getAcctXchRtDt());
				
				
				if( Integer.parseInt(glDlyXchRtVOs[i].getAcctXchRtLvl()) > 6 || Integer.parseInt(glDlyXchRtVOs[i].getAcctXchRtLvl()) < 1 ){
					eventResponse.setETCData("curr_row", String.valueOf(i+1));
					eventResponse.setETCData("curr_col", "acct_xch_rt_lvl");
					strResultMsg = new ErrorHandler("FIN00010" ,new String[]{"Account Exchange Rate Level"}).getUserMessage();
					eventResponse.setUserMessage(strResultMsg);
					break;
				}
				
				
				if( !"".equals(glDlyXchRtVOs[i].getAcctRtUsrLvl()) && (Integer.parseInt(glDlyXchRtVOs[i].getAcctRtUsrLvl()) > 6 || Integer.parseInt(glDlyXchRtVOs[i].getAcctRtUsrLvl()) < 1) ){
					eventResponse.setETCData("curr_row", String.valueOf(i+1));
					eventResponse.setETCData("curr_col", "acct_rt_usr_lvl");
					strResultMsg = new ErrorHandler("FIN00010" ,new String[]{"Account Rate User Level"}).getUserMessage();
					eventResponse.setUserMessage(strResultMsg);
					break;
				}
				
				
				fmCurrCd = comDao.checkCurrencyCode(glDlyXchRtVOs[i].getFmCurrCd());
				
				if(fmCurrCd == null || "".equals(fmCurrCd)){
					eventResponse.setETCData("curr_row", String.valueOf(i+1));
					eventResponse.setETCData("curr_col", "fm_curr_cd");
					strResultMsg = new ErrorHandler("FIN00010" ,new String[]{"From Currency"}).getUserMessage();
					eventResponse.setUserMessage(strResultMsg);
					break;
				}
				
				
				toCurrCd = comDao.checkCurrencyCode(glDlyXchRtVOs[i].getToCurrCd());
				
				if(toCurrCd == null || "".equals(toCurrCd)){
					eventResponse.setETCData("curr_row", String.valueOf(i+1));
					eventResponse.setETCData("curr_col", "to_curr_cd");
					strResultMsg = new ErrorHandler("FIN00010" ,new String[]{"To Currency"}).getUserMessage();
					eventResponse.setUserMessage(strResultMsg);
					break;
				}
				
			}
		} catch(java.text.ParseException e) {             
			log.error("err " + e.toString(), e);
			eventResponse.setETCData("curr_row", String.valueOf(rowNo+1));
			eventResponse.setETCData("curr_col", "acct_xch_rt_dt");
			strResultMsg = new ErrorHandler("FIN00010" ,new String[]{"Exchage Rate Date"}).getUserMessage();
			eventResponse.setUserMessage(strResultMsg);
			//return eventResponse;
			throw new EventException(new ErrorHandler("FIN00010", new String[]{"Exchage Rate Date"}).getMessage()); 
	    } catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} finally {
			return eventResponse;		
		}
	}
	
	/**
	 * Retrieving the list of Revenue Month VVD
	 * 
	 * @param String tarYrmon
	 * @param String monthFlag
	 * @return List<SearchArMasterRevenueVvdListVO>
	 * @exception EventException
	 */
	@Override	
	public List<RevenueMonthVvdVO> searchRevenueVvdMonth(String tarYrmon, String monthFlag) throws EventException{
		try {
			return dbDao.searchRevenueVvdMonth(tarYrmon, monthFlag);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of the list of Revenue Month VVD
	 * 
	 * @param RevenueMonthVvdVO[] revenueMonthVvdVOs
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	@Override
	public void manageRevenueVvdMonth(RevenueMonthVvdVO[] revenueMonthVvdVOs, SignOnUserAccount account) throws EventException {
		try {
			List<RevenueMonthVvdVO> insertVoList = new ArrayList<RevenueMonthVvdVO>();
			List<RevenueMonthVvdVO> updateVoList = new ArrayList<RevenueMonthVvdVO>();
			List<RevenueMonthVvdVO> deleteVoList = new ArrayList<RevenueMonthVvdVO>();

			for (int i = 0; i < revenueMonthVvdVOs.length; i++) {
				log.debug("=================" + revenueMonthVvdVOs[i].getIbflag());
				if (revenueMonthVvdVOs[i].getIbflag().equals("I")) {
					if(dbDao.isDupRevenueMonthVvd(revenueMonthVvdVOs[i])) {
						revenueMonthVvdVOs[i].setDeltFlg("N");
						revenueMonthVvdVOs[i].setUpdUsrId(account.getUsr_id());
						updateVoList.add(revenueMonthVvdVOs[i]);
					} else {
						revenueMonthVvdVOs[i].setRevYrmon(revenueMonthVvdVOs[i].getRevYrmon().replace("-", "").substring(0, 6));
						revenueMonthVvdVOs[i].setCreUsrId(account.getUsr_id());
						revenueMonthVvdVOs[i].setUpdUsrId(account.getUsr_id());
						insertVoList.add(revenueMonthVvdVOs[i]);
					}
				} else if (revenueMonthVvdVOs[i].getIbflag().equals("U")) {
					revenueMonthVvdVOs[i].setDeltFlg("N");
					revenueMonthVvdVOs[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(revenueMonthVvdVOs[i]);
				} else if (revenueMonthVvdVOs[i].getIbflag().equals("D")) {
					revenueMonthVvdVOs[i].setDeltFlg("Y");
					revenueMonthVvdVOs[i].setUpdUsrId(account.getUsr_id());
					deleteVoList.add(revenueMonthVvdVOs[i]);
				}
			}

			if (insertVoList.size() > 0) {
				dbDao.addRevenueMonthVvd(insertVoList);
			}

			if (updateVoList.size() > 0) {
				dbDao.modifyRevenueMonthVvd(updateVoList);
			}

			if (deleteVoList.size() > 0) {
				dbDao.removeRevenueMonthVvd(deleteVoList);
			}
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
	
	/**
	 * Check SCOPeriod is opened
	 * 
	 * @param String revYrmon
	 * @return String
	 * @exception EventException
	 */
	@Override
	public String checkSCOPeriodIsOpened(String revYrmon) throws EventException {
		try {
			return dbDao.checkSCOPeriodIsOpened(revYrmon);
		} catch (DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20031").getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}
    
	/**
	 * Create Estimated Revenue VVD with AR Master Revenue VVD for last 6 months<br>
	 * 
	 * @param GlEstmRevVvdVO vo
	 * @param String userId
	 * @exception EventException
	 */	
	public void estmRevVvdBatch(GlEstmRevVvdVO vo, String userId) throws EventException {
		String batchStatus = "";
		try {
        	log.debug("vo.getExeYrmon() : ---------------------------------->" + vo.getExeYrmon());
	    	if(vo.getExeYrmon() == null || "".equals(vo.getExeYrmon()))
	    	{              
	        	throw new EventException(new ErrorHandler("COM12113",new String[]{"Exe Month"}).getMessage());
	        } 
	    	else 
	    	{
	        	String params = vo.getExeYrmon() + "#" + userId;
	        	ScheduleUtil su = new ScheduleUtil();
	        	log.debug("STM_SCO_B1003 : ------------------------------>" + params);
//	        	String batchStatus = su.directExecuteJob("STM_SCO_B1003", params);
			    if (!su.isRunningInIsolatedTrx("STM_SCO_B1003")) { // 2018-10-24 : on-line batch 수정 사항
			    	batchStatus = su.directExecuteJob("STM_SCO_B1003", params);
				    log.error("Generate Estimated Revenue VVD batchStatus:::" + batchStatus);
			    } else {
				    log.error("Generate Estimated Revenue VVD batchStatus:::Processing");
			    	throw new EventException(new ErrorHandler("SAC00002",new String[] {}).getMessage());
			    }
	        	log.debug("batchStatus : ---------------------------------->" + batchStatus);
	        }
		} catch (EventException e) {
			log.error("err "+e.toString(),e);
			throw new EventException(new ErrorHandler(e).getMessage(), e);
		} catch (DAOException e) {
			log.error("err "+e.toString(),e);
        	throw new EventException(new ErrorHandler("COM12113", new String[]{"Exe Month"}).getMessage(),e);
		} catch (Exception e){
			log.error("err "+e.toString(),e);
        	throw new EventException(new ErrorHandler("COM12113", new String[]{"Exe Month"}).getMessage(),e);
		}
	} 

	
	/**
	 * Create Estimated Revenue VVD with AR Master Revenue VVD for last 6 months<br>
	 * 
	 * @param GlEstmRevVvdVO vo
	 * @param String userId
	 * @return GlEstmRevVvdVO
	 * @exception EventException
	 */	
	public GlEstmRevVvdVO manageEstmRevVVDInfo(GlEstmRevVvdVO vo, String userId) throws EventException {
		try {
			return dbDao.manageEstmRevVVDInfo(vo, userId);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		}
	}  
	
	/**
	 * search to Estimation VVD Creation Flag
	 * 
	 * @param  GlEstmRevVvdVO glEstmRevVvdVO
	 * @return List<GlEstmRevVvdVO>
	 * @exception EventException
	 */
	@Override
	public SearchEstmVvdCreationFlagVO searchEstmVvdCreationFlag(GlEstmRevVvdVO glEstmRevVvdVO) throws EventException {
		try {
			return dbDao.searchEstmVvdCreationFlag(glEstmRevVvdVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
}
