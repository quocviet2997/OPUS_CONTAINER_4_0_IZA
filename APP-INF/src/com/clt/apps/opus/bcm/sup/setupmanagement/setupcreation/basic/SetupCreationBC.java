/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationBC.java
*@FileTitle : EDI CROUP
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.basic;

import java.util.List;

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
import com.clt.framework.core.layer.event.EventException;

/**
 * OPUS_CNTR-SetupManagement Business Logic Command Interface<br>
 * - Handling the business logic of OPUS_CNTR-SetupManagement interface<br>
 *
 * @author 
 * @see SetupCreationBCImpl
 * @since J2EE 1.6
 */

public interface SetupCreationBC {
	
	/**
	 * Retrieving the list of EDI GROUP
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param ediGrpDesc String
	 * @param custTrdPrnrId String
	 * @return List<SearchBunkerVO>
	 * @exception EventException
	 */
	public List<SearchGroupListVO> searchGroupList(String grpCd, String coDivCd, String ediGrpDesc, String custTrdPrnrId) throws EventException;
	
	/**
	 * Saving the data of EDI GROUP(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchGroupListVOs SearchGroupListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroup(SearchGroupListVO[] searchGroupListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of EDI CARGO STANDARD STATUS 
	 * 
	 * @param stndStsCd String
	 * @param coDivCd String
	 * @return List<SearchCargoStandardStatusListVO>
	 * @exception EventException
	 */
	public List<SearchCargoStandardStatusListVO> searchCargoStandardStatusList(String stndStsCd, String coDivCd) throws EventException;
	
	/**
	 * Saving the data of EDI CARGO STANDARD STATUS(Inserting, updating, deleting)<br>
	 * 
	 * @param searchCargoStandardStatusListVOs SearchCargoStandardStatusListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStandardStatus(SearchCargoStandardStatusListVO[] searchCargoStandardStatusListVOs, String usrId) throws EventException;
	
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
	public List<SearchGroupCustomerListVO> searchGroupCustomerList(String grpCd, String coDivCd, String scNo, String cgoTrcSvcFlg, String custCd) throws EventException;
	
	/**
	 * Saving the data of EDI GROUP CUSTOMER<br>
	 * 
	 * @param searchGroupCustomerListVOs SearchGroupCustomerListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroupCustomer(SearchGroupCustomerListVO[] searchGroupCustomerListVOs, String usrId) throws EventException;

	/**
	 * Retrieving the list of EDI GROUP CARGO
	 * @param grpCd String
	 * @param coDivCd String
	 * @param stndStsCd String
	 * @param custCd String
	 * @return List<SearchGroupCargoListVO>
	 * @throws EventException
	 */
	public List<SearchGroupCargoListVO> searchGroupCargoList(String grpCd, String coDivCd, String stndStsCd, String custCd) throws EventException;
	
	/**
	 * Retrieving Standard Status Code
	 * 
	 * @param stndStsCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkStandardStatusCode(String stndStsCd) throws EventException;
	
	/**
	 * Retrieving Edi Standard Status Code
	 * 
	 * @param ediStndStsCd String
	 * @param coDivCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkStandardStatusCode(String ediStndStsCd, String coDivCd) throws EventException ;
	
	/**
	 * Checking Edi Group Code<br>
	 * 
	 * @param ediGrpCd String
	 * @param coDivCd String
	 * @return result String
	 * @exception EventException
	 */
	public String checkEdiGroupCode(String ediGrpCd, String coDivCd) throws EventException;
	
	/**
	 * Saving the data of EDI GROUP CARGO(inserting, updating, deleting)<br>
	 * 
	 * @param searchGroupCargoListVOs SearchGroupCargoListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageGroupCargo(SearchGroupCargoListVO[] searchGroupCargoListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of EDI TRADE PARTNER SUB LINK
	 * 
	 * @param subLnkDivCd String
	 * @param subLnkCd String
	 * @param portCd String
	 * @return List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiTrdPrnrSubLnkListVO> searchSetupLogisticsMainList(String subLnkDivCd, String subLnkCd, String portCd) throws EventException;
	
	/**
	 * Retrieving BKG EDI SUB LNK MSG.
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiSubLnkMsgListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiSubLnkMsgListVO> searchSubLinkMsgList(String trdPrnrSubLnkSeq) throws EventException;
	
	/**
	 * Retrieving the EDI PARTNER PORT LANE
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiPrnrPortLaneListVO>
	 * @exception EventException
	 */
	public List<SearchBkgEdiPrnrPortLaneListVO> searchPartnerPortLaneList(String trdPrnrSubLnkSeq) throws EventException;
	
	/**
	 * Saving EDI SETUP LOGISTICS(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchBkgEdiTrdPrnrSubLnkListVOs SearchBkgEdiTrdPrnrSubLnkListVO[]
	 * @param searchBkgEdiSubLnkMsgListVOs SearchBkgEdiSubLnkMsgListVO[] 
	 * @param searchBkgEdiPrnrPortLaneListVOs SearchBkgEdiPrnrPortLaneListVO[] 
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageSetupLogistics(SearchBkgEdiTrdPrnrSubLnkListVO[] searchBkgEdiTrdPrnrSubLnkListVOs, SearchBkgEdiSubLnkMsgListVO[] searchBkgEdiSubLnkMsgListVOs, SearchBkgEdiPrnrPortLaneListVO[] searchBkgEdiPrnrPortLaneListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of EDI YARD
	 * 
	 * @param ydCd String
	 * @return List<SearchYardListVO>
	 * @exception EventException
	 */
	public List<SearchYardListVO> searchYardList(String ydCd) throws EventException;
	
	/**
	 * Saving the data of EDI YARD (Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchYardListVOs SearchYardListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageYard(SearchYardListVO[] searchYardListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of CUSTOMER SCHEDULE EDI SETUP
	 * 
	 * @param stupId String
	 * @param msgNm String
	 * @param svcTpNm String
	 * @return List<SearchCustomerScheduleListVO>
	 * @exception EventException
	 */
	public List<SearchCustomerScheduleListVO> searchCustomerScheduleList(String stupId, String msgNm, String svcTpNm) throws EventException;
	
	/**
	 * Saving the data of CUSTOMER SCHEDULE EDI SETUP(Inserting, Updating, Deleting)<br>
	 * 
	 * @param searchCustomerScheduleListVOs SearchCustomerScheduleListVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCustomerSchedule(SearchCustomerScheduleListVO[] searchCustomerScheduleListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for customer)
	 * 
	 * @param orgEdiStsCd String
	 * @param preEdiGrpCd String
	 * @param pstEdiGrpCd String
	 * @return List<CargoStatusForCustomerVO>
	 * @exception EventException
	 */
	public List<CargoStatusForCustomerVO> searchCargoStatusForCustomerList(String orgEdiStsCd, String preEdiGrpCd, String pstEdiGrpCd) throws EventException;
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for customer)<br>
	 * 
	 * @param searchCargoStatusForCustomerListVOs CargoStatusForCustomerVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStatusForCustomer(CargoStatusForCustomerVO[] searchCargoStatusForCustomerListVOs, String usrId) throws EventException;
	
	/**
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for US cargo release)
	 * 
	 * @param ediOrgStsCd String
	 * @return List<CargoStatusForUSReleaseVO>
	 * @exception EventException
	 */
	public List<CargoStatusForUSReleaseVO> searchCargoStatusForUSReleaseList(String ediOrgStsCd) throws EventException;
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for US cargo release)<br>
	 * 
	 * @param cargoStatusForUSReleaseVOs CargoStatusForUSReleaseVO[]
	 * @param usrId String
	 * @exception EventException
	 */
	public void manageCargoStatusForUSRelease(CargoStatusForUSReleaseVO[] cargoStatusForUSReleaseVOs, String usrId) throws EventException;

}
