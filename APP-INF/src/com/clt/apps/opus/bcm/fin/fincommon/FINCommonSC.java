/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : FINCommonSC.java
*@FileTitle : FINCommon
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.basic.FinCommonBC;
import com.clt.apps.opus.bcm.fin.fincommon.fincommon.basic.FinCommonBCImpl;
import com.clt.apps.opus.bcm.fin.fincommon.fincommon.event.FinComEvent;
import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.code.CodeInfo;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * Financial Common Business Logic ServiceCommand 
 * - Handling Financial Common Business transaction.
 * 
 * @author 
 * @see FinCommonDBDAO
 * @since J2EE 1.6
 */ 
 
public class FINCommonSC  extends ServiceCommandSupport{
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Preceding process for the business scenario of SetupManagement system<br>
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
	 * Closing the business scenario<br>
	 * Clearing the related objects<br>
	 */
	public void doEnd() {
		log.debug("End of FinanceManagementSC");
	}
	
	/**
	 * Calling the method by the event and the form command of OPUS_CNTR-SetupManagement system <br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	@Override
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;
		if(e.getEventName().equalsIgnoreCase("FinComEvent")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = checkServiceLaneCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = checkPolSubContiCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = checkRevenueLaneCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
				eventResponse = checkVesselCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH05)) {
				eventResponse = checkRevenuePortCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH06)) {
				eventResponse = checkCurrencyCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH07)) {
				eventResponse = searchComboList(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH08)) {
				eventResponse = checkArMasterRevenueVvd(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH09)) {
				eventResponse = checkInvoiceNo(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH10)) {
				eventResponse = searchFunctionalCurrency(e);
			}
		}
		return eventResponse;
	}
	/**
	 * Checking the AR Finance Direction Conversion Rlane<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkRevenueLaneCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkRevenueLaneCode(event.getRlaneCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Checking the AR Finance Direction Conversion Sconti<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkPolSubContiCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkPolSubContiCode(event.getScontiCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the Service Lane Code
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkServiceLaneCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkServiceLaneCode(event.getSlanCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the AR Master Revenue VVD Vessel Code
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkVesselCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkVesselCode(event.getVslCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the AR Master Revenue VVD Revenue Port Code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkRevenuePortCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkRevenuePortCode(event.getRevPortCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the Currency Code
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkCurrencyCode(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkCurrencyCode(event.getCurrCd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking AR Master Revenue VVD<br>
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkArMasterRevenueVvd(Event e) throws EventException {
		FinComEvent event = (FinComEvent)e;
		
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.checkArMasterRevenueVvd(event.getVvd());
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Checking The Invoice No.<br>
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkInvoiceNo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();		

		FinComEvent event = (FinComEvent)e;
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			List<CheckInvoiceNoVO> list = command.checkInvoiceNo(event.getCheckInvoiceNoVO());
			if ( list.size() > 0 ) {
			    eventResponse.setRsVoList(list);
			}
			return eventResponse;
		} catch(EventException ex) {
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
			//throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
			//throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	
	/**
     * Getting the common code for making the combo box.
     * 
     * @param e Event
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchComboList(Event e) throws EventException {
    	
    	FinComEvent event = (FinComEvent)e;
    	
		FinCommonBC command = new FinCommonBCImpl();
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
    	
    	try{
    		
    		String[] cdId      = event.getComCdId().split(":");
    		String[] etcCodeNm = event.getComCode().split(":");
    		String[] etcTextNm = event.getComText().split(":");
    		
    		int comSize = cdId.length;
    		
    		int[] sortKey = new int[comSize];
    		
    		for (int i=0; i<comSize; i++) {
    			sortKey[i] = 0;
    		}
    		
    		List<Collection<CodeInfo>> codeInfoList = new ArrayList<Collection<CodeInfo>>();
			
			codeInfoList = command.searchComboList(cdId, sortKey);
			
			Map<String,String> etcData = new HashMap<String,String>();
			
			etcData = searchCommonCodeList(codeInfoList, etcCodeNm, etcTextNm);
			
			eventResponse.setETCData(etcData);
    		
    		return eventResponse;

    	} catch(Exception ex) {
    		throw new EventException(new ErrorHandler(ex).getMessage(), ex);
    	}
    }
    
    /**
	 * Retrieving the list of common code
	 * 
	 * @param codeInfoList List<Collection<CodeInfo>>
	 * @param etcCodeNm String[]
	 * @param etcTextNm String[]
	 * @return Map<String, String>
	 * @exception EventException
	 */
    private Map<String, String> searchCommonCodeList(List<Collection<CodeInfo>> codeInfoList, String[] etcCodeNm, String[] etcTextNm) throws EventException{
		
	    try{
			if(codeInfoList == null) return null;
			
			StringBuilder comboCode = new StringBuilder();
			
			StringBuilder comboText = new StringBuilder();
			
			CodeInfo codeInfo = null;
			Iterator<CodeInfo> iterator = null;
			
			Map<String,String> etcData = new HashMap<String,String>();
			
			for(int i=0; i<codeInfoList.size(); i++) {

				iterator = codeInfoList.get(i).iterator();

				while(iterator.hasNext()) {
					codeInfo = iterator.next();
					
					comboCode.append(codeInfo.getCode()+"|");
					comboText.append(codeInfo.getName()+"|");
					
					etcData.put(etcCodeNm[i],comboCode.toString());
					etcData.put(etcTextNm[i],comboText.toString());
				}
				
				comboCode.setLength(0);
				comboText.setLength(0);
			}

			return etcData;
			
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
    
    
    /**
	 * Search Functional Currency code<br>
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchFunctionalCurrency(Event e) throws EventException {
		FinCommonBC command = new FinCommonBCImpl();
		
		try {
			String result = command.searchFunctionalCurrency(); 
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setETCData("result", result);
			
			return eventResponse;
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
}