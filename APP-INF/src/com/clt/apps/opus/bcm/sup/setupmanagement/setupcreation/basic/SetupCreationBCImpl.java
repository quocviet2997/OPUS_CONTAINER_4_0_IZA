/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationBCImpl.java
*@FileTitle : EDI CROUP
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration.SetupCreationDBDAO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForCustomerVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForUSReleaseVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiPrnrPortLaneListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiSubLnkMsgListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiTrdPrnrSubLnkListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCargoStandardStatusListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCustomerScheduleListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCargoListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCustomerListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchYardListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * OPUS_CNTR-SetupManagement Business Logic Basic Command implementation<br>
 * - Handling the business logic of OPUS_CNTR-SetupManagement<br>
 *
 * @author 
 * @see SetupCreationBC,SetupCreationBCImpl, each DAO classes
 * @since J2EE 1.6
 */

public class SetupCreationBCImpl extends BasicCommandSupport implements SetupCreationBC {
	
	// Database Access Object
	private transient SetupCreationDBDAO dbDao = null;

	/**
	 * The constructor of this class<br>
	 * Creating SetupCreationDBDAO class<br>
	 */
	public SetupCreationBCImpl() {
		dbDao = new SetupCreationDBDAO();
	}
	
	/**
	 * Retrieving the list of EDI GROUP<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param ediGrpDesc String
	 * @param custTrdPrnrId String
	 * @return List<SearchBunkerVO>
	 * @exception EventException
	 */
	public List<SearchGroupListVO> searchGroupList(String grpCd, String coDivCd, String ediGrpDesc, String custTrdPrnrId) throws EventException {
		try {
			return dbDao.searchGroupList(grpCd, coDivCd, ediGrpDesc, custTrdPrnrId);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI GROUP(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchGroupListVOs SearchGroupListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroup(SearchGroupListVO[] searchGroupListVOs, String usrId) throws EventException{
		try {
			List<SearchGroupListVO> addVoList 	 = new ArrayList<SearchGroupListVO>();
			List<SearchGroupListVO> modifyVoList = new ArrayList<SearchGroupListVO>();
			List<SearchGroupListVO> removeVoList = new ArrayList<SearchGroupListVO>();
			
			for(int i=0; i<searchGroupListVOs.length; i++) {
				if(searchGroupListVOs[i].getIbflag().equals("I")) {
					
					searchGroupListVOs[i].setCreUsrId(usrId);
					searchGroupListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchGroupListVOs[i]);
					
				} else if(searchGroupListVOs[i].getIbflag().equals("U")) {
					searchGroupListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchGroupListVOs[i]);
					
				} else if(searchGroupListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchGroupListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//EDI GROUP
				dbDao.removeGroups(removeVoList);
				
				//BKG EDI GROUP
				dbDao.removeBkgGroups(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				
				for(int i=0; i<addVoList.size(); i++) {
					// Checking if the data is duplicated
					int cnt = dbDao.checkDupGroup(addVoList.get(i).getEdiGrpCd(), addVoList.get(i).getCoDivCd());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI GROUP"}).getMessage());
					}
				}
				
				//EDI GROUP
				dbDao.addGroups(addVoList);
				
				//BKG EDI GROUP
				dbDao.addBkgGroups(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//EDI GROUP
				dbDao.modifyGroups(modifyVoList);
				
				//BKG EDI GROUP
				dbDao.modifyBkgGroups(modifyVoList);
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
	 * Retrieving the list of EDI CARGO STANDARD STATUS 
	 * 
	 * @param stndStsCd String
	 * @param coDivCd String
	 * @return List<SearchCargoStandardStatusListVO>
	 * @exception EventException
	 */
	public List<SearchCargoStandardStatusListVO> searchCargoStandardStatusList(String stndStsCd, String coDivCd) throws EventException {
		try {
			
			return dbDao.searchCargoStandardStatusList(stndStsCd, coDivCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI CARGO STANDARD STATUS(Inserting, updating, deleting)
	 * 
	 * @param searchCargoStandardStatusListVOs SearchCargoStandardStatusListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStandardStatus(SearchCargoStandardStatusListVO[] searchCargoStandardStatusListVOs, String usrId) throws EventException{
		try {
			List<SearchCargoStandardStatusListVO> addVoList    = new ArrayList<SearchCargoStandardStatusListVO>();
			List<SearchCargoStandardStatusListVO> modifyVoList = new ArrayList<SearchCargoStandardStatusListVO>();
			List<SearchCargoStandardStatusListVO> removeVoList = new ArrayList<SearchCargoStandardStatusListVO>();
			
			for(int i=0; i<searchCargoStandardStatusListVOs.length; i++) {
				if(searchCargoStandardStatusListVOs[i].getIbflag().equals("I")) {
					
					searchCargoStandardStatusListVOs[i].setCreUsrId(usrId);
					searchCargoStandardStatusListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchCargoStandardStatusListVOs[i]);
					
				} else if(searchCargoStandardStatusListVOs[i].getIbflag().equals("U")) {
					
					searchCargoStandardStatusListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchCargoStandardStatusListVOs[i]);
					
				} else if(searchCargoStandardStatusListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchCargoStandardStatusListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//EDI GROUP
				dbDao.removeCargoStandardStatus(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				
				for(int i=0; i<addVoList.size(); i++) {
					// Checking if the EDI CARGO STANDARD STATUS is duplicated
					int cnt = dbDao.checkDupCargoStandardStatus(addVoList.get(i).getEdiStndStsCd(), addVoList.get(i).getCoDivCd());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI CARGO STANDARD STATUS"}).getMessage());
					}
				}
				
				//EDI GROUP
				dbDao.addCargoStandardStatus(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//EDI GROUP
				dbDao.modifyCargoStandardStatus(modifyVoList);
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
	 * Retrieving the list of EDI GROUP CUSTOMER
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param scNo String
	 * @param cgoTrcSvcFlg String
	 * @param custCd String
	 * @return List<SearchGroupCustomerListVO>
	 * @throws EventException
	 */
	public List<SearchGroupCustomerListVO> searchGroupCustomerList(String grpCd, String coDivCd, String scNo, String cgoTrcSvcFlg, String custCd) throws EventException {
		try {
			
			return dbDao.searchGroupCustomerList(grpCd, coDivCd, scNo, cgoTrcSvcFlg, custCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI GROUP CUSTOMER<br>
	 * 
	 * @param searchGroupCustomerListVOs SearchGroupCustomerListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroupCustomer(SearchGroupCustomerListVO[] searchGroupCustomerListVOs, String usrId) throws EventException{
		try {
			List<SearchGroupCustomerListVO> addVoList 	 = new ArrayList<SearchGroupCustomerListVO>();
			List<SearchGroupCustomerListVO> modifyVoList = new ArrayList<SearchGroupCustomerListVO>();
			List<SearchGroupCustomerListVO> removeVoList = new ArrayList<SearchGroupCustomerListVO>();
			
			for(int i=0; i<searchGroupCustomerListVOs.length; i++) {
				
				if(searchGroupCustomerListVOs[i].getCustCntCd() == null || searchGroupCustomerListVOs[i].getCustCntCd().equals("")) {
					searchGroupCustomerListVOs[i].setCustCntCd(" ");
					searchGroupCustomerListVOs[i].setCustSeq("0");
				} else {
					searchGroupCustomerListVOs[i].setScNo(" ");
				}
				
				if(searchGroupCustomerListVOs[i].getIbflag().equals("I")) {
					
					searchGroupCustomerListVOs[i].setCreUsrId(usrId);
					searchGroupCustomerListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchGroupCustomerListVOs[i]);
					
				} else if(searchGroupCustomerListVOs[i].getIbflag().equals("U")) {
					
					searchGroupCustomerListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchGroupCustomerListVOs[i]);
					
				} else if(searchGroupCustomerListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchGroupCustomerListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//EDI GROUP CUSTOMER
				dbDao.removeGroupCustomers(removeVoList);
				
				//BKG EDI GROUP CUSTOMER
				dbDao.removeBkgGroupCustomers(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				
				for(int i=0; i<addVoList.size(); i++) {
					// Checking if EDI GROUP CUSTOMER is duplicated
					int cnt = dbDao.checkDupGroupCustomer(addVoList.get(i).getEdiGrpCd(), addVoList.get(i).getCoDivCd(), addVoList.get(i).getCustCntCd(), addVoList.get(i).getCustSeq(), addVoList.get(i).getScNo());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI GROUP CUSTOMER"}).getMessage());
					}
				}
				
				//EDI GROUP CUSTOMER
				dbDao.addGroupCustomers(addVoList);
				
				//BKG EDI GROUP CUSTOMER
				dbDao.addBkgGroupCustomers(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//EDI GROUP CUSTOMER
				dbDao.modifyGroupCustomers(modifyVoList);
				
				//BKG EDI GROUP CUSTOMER
				dbDao.modifyBkgGroupCustomers(modifyVoList);
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
	 * Retrieving the list of EDI GROUP CARGO
	 * @param grpCd String
	 * @param coDivCd String
	 * @param stndStsCd String
	 * @param custCd String
	 * @return List<SearchGroupCargoListVO>
	 * @throws EventException
	 */
	public List<SearchGroupCargoListVO> searchGroupCargoList(String grpCd, String coDivCd, String stndStsCd, String custCd) throws EventException {
		try {
			
			return dbDao.searchGroupCargoList(grpCd, coDivCd, stndStsCd, custCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving Standard Status Code<br>
	 * 
	 * @param stndStsCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkStandardStatusCode(String stndStsCd) throws EventException {
		return checkStandardStatusCode(stndStsCd, null);
	}
	
	/**
	 * Retrieving Edi Standard Status Code
	 * 
	 * @param ediStndStsCd String
	 * @param coDivCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkStandardStatusCode(String ediStndStsCd, String coDivCd) throws EventException {
		try {
			return dbDao.checkStandardStatusCode(ediStndStsCd, coDivCd);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking Edi Group Code<br>
	 * 
	 * @param ediGrpCd String
	 * @param coDivCd String
	 * @return result String
	 * @exception EventException
	 */
	public String checkEdiGroupCode(String ediGrpCd, String coDivCd) throws EventException {
		try {
			return dbDao.checkEdiGroupCode(ediGrpCd, coDivCd);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI GROUP CARGO(inserting, updating, deleting)<br>
	 * 
	 * @param searchGroupCargoListVOs SearchGroupCargoListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroupCargo(SearchGroupCargoListVO[] searchGroupCargoListVOs, String usrId) throws EventException{
		try {
			List<SearchGroupCargoListVO> addVoList 	  = new ArrayList<SearchGroupCargoListVO>();
			List<SearchGroupCargoListVO> modifyVoList = new ArrayList<SearchGroupCargoListVO>();
			List<SearchGroupCargoListVO> removeVoList = new ArrayList<SearchGroupCargoListVO>();
			
			for(int i=0; i<searchGroupCargoListVOs.length; i++) {
				
				if(searchGroupCargoListVOs[i].getIbflag().equals("I")) {
					
					searchGroupCargoListVOs[i].setCreUsrId(usrId);
					searchGroupCargoListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchGroupCargoListVOs[i]);
					
				} else if(searchGroupCargoListVOs[i].getIbflag().equals("U")) {
					
					searchGroupCargoListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchGroupCargoListVOs[i]);
					
				} else if(searchGroupCargoListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchGroupCargoListVOs[i]);
				}
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				//EDI GROUP CARGO
				dbDao.addGroupCargos(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//EDI GROUP CARGO
				dbDao.modifyGroupCargos(modifyVoList);
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//EDI GROUP CARGO
				dbDao.removeGroupCargos(removeVoList);
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
	 * Retrieving the list of EDI TRADE PARTNER SUB LINK
	 * 
	 * @param subLnkDivCd String
	 * @param subLnkCd String
	 * @param portCd String
	 * @return List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiTrdPrnrSubLnkListVO> searchSetupLogisticsMainList(String subLnkDivCd, String subLnkCd, String portCd) throws EventException {
		try {
			
			return dbDao.searchSetupLogisticsMainList(subLnkDivCd, subLnkCd, portCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving BKG EDI SUB LNK MSG.
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiSubLnkMsgListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiSubLnkMsgListVO> searchSubLinkMsgList(String trdPrnrSubLnkSeq) throws EventException {
		try {
			
			return dbDao.searchSubLinkMsgList(trdPrnrSubLnkSeq);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the EDI PARTNER PORT LANE
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiSubLnkMsgListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiPrnrPortLaneListVO> searchPartnerPortLaneList(String trdPrnrSubLnkSeq) throws EventException {
		try {
			
			return dbDao.searchPartnerPortLaneList(trdPrnrSubLnkSeq);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving EDI SETUP LOGISTICS(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchBkgEdiTrdPrnrSubLnkListVOs SearchBkgEdiTrdPrnrSubLnkListVO[]
	 * @param searchBkgEdiSubLnkMsgListVOs SearchBkgEdiSubLnkMsgListVO[] 
	 * @param searchBkgEdiPrnrPortLaneListVOs SearchBkgEdiPrnrPortLaneListVO[] 
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageSetupLogistics(SearchBkgEdiTrdPrnrSubLnkListVO[] searchBkgEdiTrdPrnrSubLnkListVOs, SearchBkgEdiSubLnkMsgListVO[] searchBkgEdiSubLnkMsgListVOs, SearchBkgEdiPrnrPortLaneListVO[] searchBkgEdiPrnrPortLaneListVOs, String usrId) throws EventException{
		try {
			List<SearchBkgEdiTrdPrnrSubLnkListVO> addLnkVoList    = new ArrayList<SearchBkgEdiTrdPrnrSubLnkListVO>();
			List<SearchBkgEdiTrdPrnrSubLnkListVO> modifyLnkVoList = new ArrayList<SearchBkgEdiTrdPrnrSubLnkListVO>();
			List<SearchBkgEdiTrdPrnrSubLnkListVO> removeLnkVoList = new ArrayList<SearchBkgEdiTrdPrnrSubLnkListVO>();
			
			List<SearchBkgEdiSubLnkMsgListVO> addMsgVoList       = new ArrayList<SearchBkgEdiSubLnkMsgListVO>();
			List<SearchBkgEdiSubLnkMsgListVO> modifyMsgVoList    = new ArrayList<SearchBkgEdiSubLnkMsgListVO>();
			List<SearchBkgEdiSubLnkMsgListVO> removeMsgVoList 	 = new ArrayList<SearchBkgEdiSubLnkMsgListVO>();
			List<SearchBkgEdiSubLnkMsgListVO> removeAllMsgVoList = new ArrayList<SearchBkgEdiSubLnkMsgListVO>();
			
			List<SearchBkgEdiPrnrPortLaneListVO> addLanVoList       = new ArrayList<SearchBkgEdiPrnrPortLaneListVO>();
			List<SearchBkgEdiPrnrPortLaneListVO> modifyLanVoList    = new ArrayList<SearchBkgEdiPrnrPortLaneListVO>();
			List<SearchBkgEdiPrnrPortLaneListVO> removeLanVoList    = new ArrayList<SearchBkgEdiPrnrPortLaneListVO>();
			List<SearchBkgEdiPrnrPortLaneListVO> removeAllLanVoList = new ArrayList<SearchBkgEdiPrnrPortLaneListVO>();
			
			//Saving EDI TRADE PARTNER SUB LINK info
			if(searchBkgEdiTrdPrnrSubLnkListVOs != null) {
				int idx = 0;
				int subLnkSeq = 0;
				
				for(int i=0; i<searchBkgEdiTrdPrnrSubLnkListVOs.length; i++) {
					
					if(searchBkgEdiTrdPrnrSubLnkListVOs[i].getIbflag().equals("I")) {
						//Retrieving EDI TRADE PARTNER SUB LINK SEQUENCE(MAX+1)
						if(idx == 0) {
							subLnkSeq = dbDao.searchBkgEdiTrdPrnrSubLnkSeq();
						}
						
						searchBkgEdiTrdPrnrSubLnkListVOs[i].setTrdPrnrSubLnkSeq(subLnkSeq+idx+"");
						searchBkgEdiTrdPrnrSubLnkListVOs[i].setCreUsrId(usrId);
						searchBkgEdiTrdPrnrSubLnkListVOs[i].setUpdUsrId(usrId);
						
						addLnkVoList.add(searchBkgEdiTrdPrnrSubLnkListVOs[i]);
						
						idx++;
						
					} else if(searchBkgEdiTrdPrnrSubLnkListVOs[i].getIbflag().equals("U")) {
						
						searchBkgEdiTrdPrnrSubLnkListVOs[i].setUpdUsrId(usrId);
						
						modifyLnkVoList.add(searchBkgEdiTrdPrnrSubLnkListVOs[i]);
						
					} else if(searchBkgEdiTrdPrnrSubLnkListVOs[i].getIbflag().equals("D")) {
						removeLnkVoList.add(searchBkgEdiTrdPrnrSubLnkListVOs[i]);
						
						//Deleting BKG EDI SUB LNK MSG information
						SearchBkgEdiSubLnkMsgListVO searchBkgEdiSubLnkMsgListVO = new SearchBkgEdiSubLnkMsgListVO();
						
						searchBkgEdiSubLnkMsgListVO.setTrdPrnrSubLnkSeq(searchBkgEdiTrdPrnrSubLnkListVOs[i].getTrdPrnrSubLnkSeq());
						removeAllMsgVoList.add(searchBkgEdiSubLnkMsgListVO);
						
						//Deleting EDI PARTNER PORT LANE information
						SearchBkgEdiPrnrPortLaneListVO searchBkgEdiPrnrPortLaneListVO = new SearchBkgEdiPrnrPortLaneListVO();
						searchBkgEdiPrnrPortLaneListVO.setTrdPrnrSubLnkSeq(searchBkgEdiTrdPrnrSubLnkListVOs[i].getTrdPrnrSubLnkSeq());
						removeAllLanVoList.add(searchBkgEdiPrnrPortLaneListVO);
					}
				}
			}
			
			//Saving BKG EDI SUB LNK MSG(inserting, updating, deleting)
			if(searchBkgEdiSubLnkMsgListVOs != null) {
				for(int i=0; i<searchBkgEdiSubLnkMsgListVOs.length; i++) {
					
					if(searchBkgEdiSubLnkMsgListVOs[i].getIbflag().equals("I")) {
						
						searchBkgEdiSubLnkMsgListVOs[i].setCreUsrId(usrId);
						searchBkgEdiSubLnkMsgListVOs[i].setUpdUsrId(usrId);
						
						addMsgVoList.add(searchBkgEdiSubLnkMsgListVOs[i]);
						
					} else if(searchBkgEdiSubLnkMsgListVOs[i].getIbflag().equals("U")) {
						
						searchBkgEdiSubLnkMsgListVOs[i].setUpdUsrId(usrId);
						
						modifyMsgVoList.add(searchBkgEdiSubLnkMsgListVOs[i]);
						
					} else if(searchBkgEdiSubLnkMsgListVOs[i].getIbflag().equals("D")) {
						removeMsgVoList.add(searchBkgEdiSubLnkMsgListVOs[i]);
					}
				}
			}
			
			//Saving EDI PARTNER PORT LANE(inserting, updating, deleting)
			if(searchBkgEdiPrnrPortLaneListVOs != null) {
				for(int i=0; i<searchBkgEdiPrnrPortLaneListVOs.length; i++) {
					
					if(searchBkgEdiPrnrPortLaneListVOs[i].getIbflag().equals("I")) {
						
						searchBkgEdiPrnrPortLaneListVOs[i].setCreUsrId(usrId);
						searchBkgEdiPrnrPortLaneListVOs[i].setUpdUsrId(usrId);
						
						addLanVoList.add(searchBkgEdiPrnrPortLaneListVOs[i]);
						
					} else if(searchBkgEdiPrnrPortLaneListVOs[i].getIbflag().equals("U")) {
						
						searchBkgEdiPrnrPortLaneListVOs[i].setUpdUsrId(usrId);
						
						modifyLanVoList.add(searchBkgEdiPrnrPortLaneListVOs[i]);
						
					} else if(searchBkgEdiPrnrPortLaneListVOs[i].getIbflag().equals("D")) {
						removeLanVoList.add(searchBkgEdiPrnrPortLaneListVOs[i]);
					}
				}
			}
			
			//Inserting EDI TRADE PARTNER SUB LINK
			if(addLnkVoList.size() > 0) {
				//EDI TRADE PARTNER SUB LINK
				dbDao.addTradePartnerSubLinks(addLnkVoList);
			}
			
			//Updating EDI TRADE PARTNER SUB LINK
			if(modifyLnkVoList.size() > 0) {
				//EDI TRADE PARTNER SUB LINK
				dbDao.modifyTradePartnerSubLinks(modifyLnkVoList);
			}
			
			//Deleting EDI TRADE PARTNER SUB LINK
			if(removeLnkVoList.size() > 0) {
				//EDI TRADE PARTNER SUB LINK
				dbDao.removeTradePartnerSubLinks(removeLnkVoList);
				
				//BKG EDI SUB LNK MSG
				dbDao.removeAllSubLinkMsgs(removeAllMsgVoList);
				
				//EDI PARTNER PORT LANE
				dbDao.removeAllPartnerPortLanes(removeAllLanVoList);
			}
			
			//Deleting BKG EDI SUB LNK MSG data
			if(removeMsgVoList.size() > 0) {
				//BKG EDI SUB LNK MSG
				dbDao.removeSubLinkMsgs(removeMsgVoList);
			}
			
			//Inserting BKG EDI SUB LNK MSG data
			if(addMsgVoList.size() > 0) {
				
				for(int i=0; i<addMsgVoList.size(); i++) {
					//Checking if BKG EDI SUB LNK MSG data is duplicated
					int cnt = dbDao.checkDupSubLinkMsg(addMsgVoList.get(i).getTrdPrnrSubLnkSeq(), addMsgVoList.get(i).getEdiMsgTpId(), addMsgVoList.get(i).getEdiMsgIndCd());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"BKG EDI SUB LNK MSG"}).getMessage());
					}
				}
				
				//BKG EDI SUB LNK MSG
				dbDao.addSubLinkMsgs(addMsgVoList);
			}
			
			//Updating BKG EDI SUB LNK MSG data
			if(modifyMsgVoList.size() > 0) {
				//BKG EDI SUB LNK MSG
				dbDao.modifySubLinkMsgs(modifyMsgVoList);
			}
			
			//Deleting EDI PARTNER PORT LANE data
			if(removeLanVoList.size() > 0) {
				//EDI PARTNER PORT LANE
				dbDao.removePartnerPortLanes(removeLanVoList);
			}
			
			//Inserting EDI PARTNER PORT LANE data
			if(addLanVoList.size() > 0) {
				
				for(int i=0; i<addLanVoList.size(); i++) {
					//Checking the duplicated EDI PARTNER PORT LANE data
					int cnt = dbDao.checkDupPartnerPortLane(addLanVoList.get(i).getTrdPrnrSubLnkSeq(), addLanVoList.get(i).getSlanCd());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI PARTNER PORT LANE"}).getMessage());
					}
				}
				
				//EDI PARTNER PORT LANE
				dbDao.addPartnerPortLanes(addLanVoList);
			}
			
			//Updating EDI PARTNER PORT LANE data
			if(modifyLanVoList.size() > 0) {
				//EDI PARTNER PORT LANE
				dbDao.modifyPartnerPortLanes(modifyLanVoList);
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
	 * Retrieving the list of EDI YARD<br>
	 * 
	 * @param ydCd String
	 * @return List<SearchYardListVO>
	 * @exception EventException
	 */
	public List<SearchYardListVO> searchYardList(String ydCd) throws EventException {
		try {
			
			return dbDao.searchYardList(ydCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI YARD (Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchYardListVOs SearchYardListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageYard(SearchYardListVO[] searchYardListVOs, String usrId) throws EventException{
		try {
			List<SearchYardListVO> addVoList 	= new ArrayList<SearchYardListVO>();
			List<SearchYardListVO> modifyVoList = new ArrayList<SearchYardListVO>();
			List<SearchYardListVO> removeVoList = new ArrayList<SearchYardListVO>();
			
			for(int i=0; i<searchYardListVOs.length; i++) {
				if(searchYardListVOs[i].getIbflag().equals("I")) {
					
					searchYardListVOs[i].setCreUsrId(usrId);
					searchYardListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchYardListVOs[i]);
					
				} else if(searchYardListVOs[i].getIbflag().equals("U")) {
					searchYardListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchYardListVOs[i]);
					
				} else if(searchYardListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchYardListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//EDI YARD
				dbDao.removeYards(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				
				for(int i=0; i<addVoList.size(); i++) {
					// Checking the duplicated EDI YARD data
					int cnt = dbDao.checkDupYard(addVoList.get(i).getYdCd());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI YARD"}).getMessage());
					}
				}
				
				//EDI YARD
				dbDao.addYards(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//EDI YARD
				dbDao.modifyYards(modifyVoList);
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
	 * Retrieving the list of CUSTOMER SCHEDULE EDI SETUP
	 * 
	 * @param stupId String
	 * @param msgNm String
	 * @param svcTpNm String
	 * @return List<SearchCustomerScheduleListVO>
	 * @exception EventException
	 */
	public List<SearchCustomerScheduleListVO> searchCustomerScheduleList(String stupId, String msgNm, String svcTpNm) throws EventException {
		try {
			
			return dbDao.searchCustomerScheduleList(stupId, msgNm, svcTpNm);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of CUSTOMER SCHEDULE EDI SETUP(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchCustomerScheduleListVOs SearchCustomerScheduleListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCustomerSchedule(SearchCustomerScheduleListVO[] searchCustomerScheduleListVOs, String usrId) throws EventException{
		try {
			List<SearchCustomerScheduleListVO> addVoList 	= new ArrayList<SearchCustomerScheduleListVO>();
			List<SearchCustomerScheduleListVO> modifyVoList = new ArrayList<SearchCustomerScheduleListVO>();
			List<SearchCustomerScheduleListVO> removeVoList = new ArrayList<SearchCustomerScheduleListVO>();
			
			for(int i=0; i<searchCustomerScheduleListVOs.length; i++) {
				if(searchCustomerScheduleListVOs[i].getIbflag().equals("I")) {
					
					searchCustomerScheduleListVOs[i].setCreUsrId(usrId);
					searchCustomerScheduleListVOs[i].setUpdUsrId(usrId);
					
					addVoList.add(searchCustomerScheduleListVOs[i]);
					
				} else if(searchCustomerScheduleListVOs[i].getIbflag().equals("U")) {
					searchCustomerScheduleListVOs[i].setUpdUsrId(usrId);
					
					modifyVoList.add(searchCustomerScheduleListVOs[i]);
					
				} else if(searchCustomerScheduleListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchCustomerScheduleListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				//CUSTOMER SCHEDULE EDI SETUP
				dbDao.removeCustomerSchedules(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				
				for(int i=0; i<addVoList.size(); i++) {
					// Checking the duplicated CUSTOMER SCHEDULE EDI SETUP data
					int cnt = dbDao.checkDupCustomerSchedule(addVoList.get(i).getEdiStupId());
					
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"EDI Setup ID"}).getMessage());
					}
				}
				
				//CUSTOMER SCHEDULE EDI SETUP
				dbDao.addCustomerSchedules(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				//CUSTOMER SCHEDULE EDI SETUP
				dbDao.modifyCustomerSchedules(modifyVoList); 
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
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for customer)
	 * 
	 * @param orgEdiStsCd String
	 * @param preEdiGrpCd String
	 * @param pstEdiGrpCd String
	 * @return List<CargoStatusForCustomerVO>
	 * @exception EventException
	 */
	public List<CargoStatusForCustomerVO> searchCargoStatusForCustomerList(String orgEdiStsCd, String preEdiGrpCd, String pstEdiGrpCd) throws EventException {
		try {
			return dbDao.searchCargoStatusForCustomerList(orgEdiStsCd, preEdiGrpCd, pstEdiGrpCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for customer)<br>
	 * 
	 * @param searchCargoStatusForCustomerListVOs CargoStatusForCustomerVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStatusForCustomer(CargoStatusForCustomerVO[] searchCargoStatusForCustomerListVOs, String usrId) throws EventException{
		try {
			List<CargoStatusForCustomerVO> addVoList 	= new ArrayList<CargoStatusForCustomerVO>();
			List<CargoStatusForCustomerVO> modifyVoList = new ArrayList<CargoStatusForCustomerVO>();
			List<CargoStatusForCustomerVO> removeVoList = new ArrayList<CargoStatusForCustomerVO>();
			
			for(int i=0; i<searchCargoStatusForCustomerListVOs.length; i++) {
				if(searchCargoStatusForCustomerListVOs[i].getIbflag().equals("I")) {
					searchCargoStatusForCustomerListVOs[i].setCreUsrId(usrId);
					searchCargoStatusForCustomerListVOs[i].setUpdUsrId(usrId);
					addVoList.add(searchCargoStatusForCustomerListVOs[i]);
				} else if(searchCargoStatusForCustomerListVOs[i].getIbflag().equals("U")) {
					searchCargoStatusForCustomerListVOs[i].setUpdUsrId(usrId);
					modifyVoList.add(searchCargoStatusForCustomerListVOs[i]);
				} else if(searchCargoStatusForCustomerListVOs[i].getIbflag().equals("D")) {
					removeVoList.add(searchCargoStatusForCustomerListVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				dbDao.removeCargoStatusForCustomer(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
//				for(int i=0; i<addVoList.size(); i++) {
//					// Checking the duplicated CUSTOMER SCHEDULE EDI SETUP data
//					int cnt = dbDao.checkDupCargoStatusForCustomer(addVoList.get(i).getOrgEdiStsCd());
//					if (cnt > 0) {
//						throw new EventException(new ErrorHandler("COM12226",new String[]{"Origin Status"}).getMessage());
//					}
//				}
				dbDao.addCargoStatusForCustomer(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				dbDao.modifyCargoStatusForCustomer(modifyVoList); 
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
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for US cargo release)
	 * 
	 * @param ediOrgStsCd String
	 * @return List<CargoStatusForUSReleaseVO>
	 * @exception EventException
	 */
	public List<CargoStatusForUSReleaseVO> searchCargoStatusForUSReleaseList(String ediOrgStsCd) throws EventException {
		try {
			return dbDao.searchCargoStatusForUSReleaseList(ediOrgStsCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for US cargo release)<br>
	 * 
	 * @param cargoStatusForUSReleaseVOs CargoStatusForUSReleaseVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStatusForUSRelease(CargoStatusForUSReleaseVO[] cargoStatusForUSReleaseVOs, String usrId) throws EventException{
		try {
			List<CargoStatusForUSReleaseVO> addVoList 	= new ArrayList<CargoStatusForUSReleaseVO>();
			List<CargoStatusForUSReleaseVO> modifyVoList = new ArrayList<CargoStatusForUSReleaseVO>();
			List<CargoStatusForUSReleaseVO> removeVoList = new ArrayList<CargoStatusForUSReleaseVO>();
			
			for(int i=0; i<cargoStatusForUSReleaseVOs.length; i++) {
				if(cargoStatusForUSReleaseVOs[i].getIbflag().equals("I")) {
					cargoStatusForUSReleaseVOs[i].setCreUsrId(usrId);
					cargoStatusForUSReleaseVOs[i].setUpdUsrId(usrId);
					addVoList.add(cargoStatusForUSReleaseVOs[i]);
				} else if(cargoStatusForUSReleaseVOs[i].getIbflag().equals("U")) {
					cargoStatusForUSReleaseVOs[i].setUpdUsrId(usrId);
					modifyVoList.add(cargoStatusForUSReleaseVOs[i]);
				} else if(cargoStatusForUSReleaseVOs[i].getIbflag().equals("D")) {
					removeVoList.add(cargoStatusForUSReleaseVOs[i]);
				}
			}
			
			//Deleting data
			if(removeVoList.size() > 0) {
				dbDao.removeCargoStatusForUSRelease(removeVoList);
			}
			
			//Inserting data
			if(addVoList.size() > 0) {
				for(int i=0; i<addVoList.size(); i++) {
					// Checking the duplicated CUSTOMER SCHEDULE EDI SETUP data
					int cnt = dbDao.checkDupCargoStatusForUSRelease(addVoList.get(i).getEdiOrgStsCd(), addVoList.get(i).getEdiPreSntStsCd(), addVoList.get(i).getEdiEvntStsCd());
					if (cnt > 0) {
						throw new EventException(new ErrorHandler("COM12226",new String[]{"Origin Status, Pre Sent Status, Event Status"}).getMessage());
					}
				}
				dbDao.addCargoStatusForUSRelease(addVoList);
			}
			
			//Updating data
			if(modifyVoList.size() > 0) {
				dbDao.modifyCargoStatusForUSRelease(modifyVoList); 
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

}
