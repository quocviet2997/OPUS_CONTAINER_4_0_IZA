/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupManagementSC.java
*@FileTitle : EDI CROUP
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.basic.SetupCreationBC;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.basic.SetupCreationBCImpl;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0001Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0002Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0003Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0004Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0005Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0006Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0007Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0008Event;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0009Event;
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
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * Handling the business transaction of OPUS_CNTR-SetupManagement Business Logic ServiceCommand - OPUS_CNTR-SetupManagement
 * 
 * @author 
 * @see SetupCreationBC, SetupCreationBCImpl, SetupCreationDBDAO
 * @since J2EE 1.6
 */
public class SetupManagementSC extends ServiceCommandSupport {
	
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Preceding the business scenario of SetupManagement system<br>
	 * Creating the related objects<br>
	 */
	public void doStart() {
		try {
			account = getSignOnUserAccount();
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
		}
	}

	/**
	 * Closing the business scenario of SetupManagement system<br>
	 * Clearing the related objects<br>
	 */
	public void doEnd() {
		log.debug("End of SetupManagement");
	}
	
	/**
	 * Calling the method by the event name and the form command in OPUS_CNTR-SetupManagement system<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		EventResponse eventResponse = null;

		if(e.getEventName().equalsIgnoreCase("BcmSup0001Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGroupList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGroup(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0002Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGroupCustomerList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGroupCustomer(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0003Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGroupCargoList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = checkStandardStatusCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGroupCargo(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0004Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCargoStandardStatusList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageCargoStandardStatus(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0005Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchSetupLogisticsMainList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchSetupLogisticsDetailList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageSetupLogistics(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0006Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchYardList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageYard(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0007Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCustomerScheduleList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageCustomerSchedule(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0008Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCargoStatusForCustomerList(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				BcmSup0008Event event = (BcmSup0008Event)e;
				eventResponse = checkStandardStatusCode(event.getEdiStndStsCd(), event.getCoDivCd());
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				BcmSup0008Event event = (BcmSup0008Event)e;
				eventResponse = checkEdiGroupCode(event.getEdiGrpCd(), event.getCoDivCd());
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageCargoStatusForCustomer(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("BcmSup0009Event")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCargoStatusForUSReleaseList(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				BcmSup0009Event event = (BcmSup0009Event)e;
				eventResponse = checkStandardStatusCode(event.getEdiStndStsCd(), event.getCoDivCd());
			} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageCargoStatusForUSRelease(e);
			}
		}
		
		return eventResponse;
	}
		
	/**
	 * Retrieving the list of EDI group<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchGroupList(Event e) throws EventException {
		BcmSup0001Event event = (BcmSup0001Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchGroupListVO> searchGroupListVO = command.searchGroupList(event.getGrpCd(), event.getCoDivCd(), event.getEdiGrpDesc(), event.getCustTrdPrnrId());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(searchGroupListVO);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI GROUP<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageGroup(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BcmSup0001Event event = (BcmSup0001Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchGroupListVO[] searchGroupListVOs = event.getSearchGroupListVOS();
			String usrId = account.getUsr_id();
			
			begin();
			command.manageGroup(searchGroupListVOs, usrId);
			eventResponse = (GeneralEventResponse)searchGroupList(e);
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of EDI cargo standard status
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCargoStandardStatusList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0004Event event = (BcmSup0004Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchCargoStandardStatusListVO> searchCargoStandardStatusListVO = command.searchCargoStandardStatusList(event.getStndStsCd(), event.getCoDivCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchCargoStandardStatusListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI cargo standard status
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageCargoStandardStatus(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0004Event event = (BcmSup0004Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchCargoStandardStatusListVO[] searchCargoStandardStatusListVOs = event.getSearchCargoStandardStatusListVOS();
			
			String usrId = account.getUsr_id();
			
			begin();
			command.manageCargoStandardStatus(searchCargoStandardStatusListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchCargoStandardStatusList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of EDI group customer<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchGroupCustomerList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0002Event event = (BcmSup0002Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchGroupCustomerListVO> searchGroupCustomerListVO = command.searchGroupCustomerList(event.getGrpCd(), event.getCoDivCd(), event.getScNo(), event.getCgoTrcSvcFlg(), event.getCustCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchGroupCustomerListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI group customer<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageGroupCustomer(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0002Event event = (BcmSup0002Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchGroupCustomerListVO[] searchGroupCustomerListVOs = event.getSearchGroupCustomerListVOS();

			String usrId = account.getUsr_id();
			
			begin();
			command.manageGroupCustomer(searchGroupCustomerListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchGroupCustomerList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of EDI group cargo<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchGroupCargoList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0003Event event = (BcmSup0003Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchGroupCargoListVO> searchGroupCargoListVO = command.searchGroupCargoList(event.getGrpCd(), event.getCoDivCd(), event.getStndStsCd(), event.getCustCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchGroupCargoListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking Standard Status Code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkStandardStatusCode(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BcmSup0003Event event = (BcmSup0003Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			String stndStsCd = command.checkStandardStatusCode(event.getStndStsCd(), null);

			if(!stndStsCd.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				etcData.put("stndStsCd",stndStsCd);
				eventResponse.setETCData(etcData);
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00005",new String[]{}).getUserMessage());
			}
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Checking Standard Status Code<br>
	 * 
	 * @param ediStndStsCd String
	 * @param coDivCd String
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkStandardStatusCode(String ediStndStsCd, String coDivCd) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			String stndStsCd = command.checkStandardStatusCode(ediStndStsCd, coDivCd);

			if(stndStsCd!=null && !stndStsCd.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				etcData.put("stndStsCd",stndStsCd);
				eventResponse.setETCData(etcData);
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("COM12199",new String[]{"Edi Status : " + ediStndStsCd}).getUserMessage());
			}
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Checking Edi Group Code<br>
	 * 
	 * @param ediGrpCd String
	 * @param coDivCd String
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkEdiGroupCode(String ediGrpCd, String coDivCd) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			String ediGroupCd = command.checkEdiGroupCode(ediGrpCd, coDivCd);

			if(ediGroupCd!=null && !ediGroupCd.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				etcData.put("ediGrpCd",ediGroupCd);
				eventResponse.setETCData(etcData);
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("COM12199",new String[]{"Edi Group : " + ediGrpCd}).getUserMessage());
			}
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Saving the data of EDI group cargo<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageGroupCargo(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0003Event event = (BcmSup0003Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchGroupCargoListVO[] searchGroupCargoListVOs = event.getSearchGroupCargoListVOS();
			
			String usrId = account.getUsr_id();
			
			begin();
			command.manageGroupCargo(searchGroupCargoListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchGroupCargoList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of EDI trade partner sub link<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchSetupLogisticsMainList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0005Event event = (BcmSup0005Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchBkgEdiTrdPrnrSubLnkListVO> searchBkgEdiTrdPrnrSubLnkListVO = command.searchSetupLogisticsMainList(event.getSubLnkDivCd(), event.getSubLnkCd(), event.getPortCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchBkgEdiTrdPrnrSubLnkListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the data of BKG EDI SUB LNK MSG and EDI PARTNER PORT LANE by Partner Sub Link Sequence<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchSetupLogisticsDetailList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0005Event event = (BcmSup0005Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO = command.searchSubLinkMsgList(event.getTrdPrnrSubLnkSeq());
			
			List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO = command.searchPartnerPortLaneList(event.getTrdPrnrSubLnkSeq());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchBkgEdiSubLnkMsgListVO);
			eventResponse.setRsVoList(searchBkgEdiPrnrPortLaneListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI setup logistics<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageSetupLogistics(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0005Event event = (BcmSup0005Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchBkgEdiTrdPrnrSubLnkListVO[] searchBkgEdiTrdPrnrSubLnkListVOs = event.getSearchBkgEdiTrdPrnrSubLnkListVOS();
			
			SearchBkgEdiSubLnkMsgListVO[] searchBkgEdiSubLnkMsgListVOs = event.getSearchBkgEdiSubLnkMsgListVOS();
			
			SearchBkgEdiPrnrPortLaneListVO[] searchBkgEdiPrnrPortLaneListVOs = event.getSearchBkgEdiPrnrPortLaneListVOS();
			
			String usrId = account.getUsr_id();
			
			begin();
			command.manageSetupLogistics(searchBkgEdiTrdPrnrSubLnkListVOs, searchBkgEdiSubLnkMsgListVOs, searchBkgEdiPrnrPortLaneListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchSetupLogisticsMainList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of EDI yard<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchYardList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0006Event event = (BcmSup0006Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchYardListVO> searchYardListVO = command.searchYardList(event.getYardCode());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchYardListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of EDI yard<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageYard(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0006Event event = (BcmSup0006Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchYardListVO[] searchYardListVOs = event.getSearchYardListVOS();

			String usrId = account.getUsr_id();
			
			begin();
			command.manageYard(searchYardListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchYardList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of customer schedule EDI setup<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCustomerScheduleList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmSup0007Event event = (BcmSup0007Event)e;
		  
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<SearchCustomerScheduleListVO> searchCustomerScheduleListVO = command.searchCustomerScheduleList(event.getStupId(), event.getMsgNm(), event.getSvcTpNm());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(searchCustomerScheduleListVO);
			
			return eventResponse;
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of customer schedule EDI setup<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageCustomerSchedule(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		BcmSup0007Event event = (BcmSup0007Event)e;
		
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			SearchCustomerScheduleListVO[] searchCustomerScheduleListVOs = event.getSearchCustomerScheduleListVOS();

			String usrId = account.getUsr_id();
			
			begin();
			command.manageCustomerSchedule(searchCustomerScheduleListVOs, usrId);
			
			eventResponse = (GeneralEventResponse)searchCustomerScheduleList(e);
			
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for customer)<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCargoStatusForCustomerList(Event e) throws EventException { //SCE_EDI_MNG_AMS_STS
		BcmSup0008Event event = (BcmSup0008Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<CargoStatusForCustomerVO> cargoStatusForCustomerListVOs = command.searchCargoStatusForCustomerList(event.getOrgEdiStsCd(), event.getPreEdiGrpCd(), event.getPstEdiGrpCd());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(cargoStatusForCustomerListVOs);
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for customer)<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageCargoStatusForCustomer(Event e) throws EventException { // SCE_EDI_MNG_AMS_STS
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BcmSup0008Event event = (BcmSup0008Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			CargoStatusForCustomerVO[] cargoStatusForCustomerVOs = event.getCargoStatusForCustomerVOS();
			String usrId = account.getUsr_id();
			
			begin();
			command.manageCargoStatusForCustomer(cargoStatusForCustomerVOs, usrId);
			eventResponse = (GeneralEventResponse)searchCargoStatusForCustomerList(e);
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of Cargo Tracking Info.(Non physical event for US cargo release)<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCargoStatusForUSReleaseList(Event e) throws EventException { // SCE_EDI_MNG_STS
		BcmSup0009Event event = (BcmSup0009Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		  
		try {
			List<CargoStatusForUSReleaseVO> cargoStatusForUSReleaseVOs = command.searchCargoStatusForUSReleaseList(event.getEdiOrgStsCd());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(cargoStatusForUSReleaseVOs);
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of Cargo Tracking Info.(Non physical event for US cargo release)<br>
	 * 
	 * @param e Event
	 * @return eventResponse EventResponse
	 * @exception EventException
	 */
	private EventResponse manageCargoStatusForUSRelease(Event e) throws EventException { // SCE_EDI_MNG_STS
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BcmSup0009Event event = (BcmSup0009Event)e;
		SetupCreationBC command = new SetupCreationBCImpl();
		
		try {
			CargoStatusForUSReleaseVO[] cargoStatusForUSReleaseVOs = event.getCargoStatusForUSReleaseVOS();
			String usrId = account.getUsr_id();
			
			begin();
			command.manageCargoStatusForUSRelease(cargoStatusForUSReleaseVOs, usrId);
			eventResponse = (GeneralEventResponse)searchCargoStatusForUSReleaseList(e);
			eventResponse.setUserMessage((String) new ErrorHandler("SUP00001",new String[]{}).getUserMessage());
			commit();
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}

}
