/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SUPCommonSC.java
*@FileTitle : SUPCommon Code
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.supcommon;

import java.util.HashMap;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.supcommon.supcommon.basic.SupCommonBC;
import com.clt.apps.opus.bcm.sup.supcommon.supcommon.basic.SupCommonBCImpl;
import com.clt.apps.opus.bcm.sup.supcommon.supcommon.event.SupComEvent;
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
 * @see SupCommonBC, SupCommonBCImpl, SupCommonBCDBDAO
 * @since J2EE 1.6
 */
public class SUPCommonSC extends ServiceCommandSupport {
	
	// Login User Information
	@SuppressWarnings("unused")
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
	 * Closing the business objects of SetupManagement system<br>
	 * Clearing the related objects<br>
	 */
	public void doEnd() {
		log.debug("End of SUPCommonSC");
	}
	
	/**
	 * Calling the method by the event name and the form command in OPUS_CNTR-SetupManagement system<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		if(e.getEventName().equalsIgnoreCase("SupComEvent")) {
			if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = checkCustomerCountryCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = checkContinentCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = checkCountryCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
				eventResponse = checkServiceLaneCode(e);
				
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH05)) {
				eventResponse = checkPortCode(e);
			}
		}
		
		return eventResponse;
	}
	
	/**
	 * Checking the customer country code and customer sequence<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkCustomerCountryCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		SupComEvent event = (SupComEvent)e;
		  
		SupCommonBC command = new SupCommonBCImpl();
		  
		try {
			
			String custCntCd = command.checkCustomerCountryCode(event.getCustCntCd(), event.getCustSeq());

			if (custCntCd == null || custCntCd.equals("")) {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00002",new String[]{}).getUserMessage());
			} else {

				Map<String,String> etcData = new HashMap<String,String>();
				
				etcData.put("custCntCd",custCntCd);
				
				eventResponse.setETCData(etcData);
				
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
	 * Checking the continent code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkContinentCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		SupComEvent event = (SupComEvent)e;
		  
		SupCommonBC command = new SupCommonBCImpl();
		  
		try {
			
			String contiDesc = command.checkContinentCode(event.getContiDesc());

			if(!contiDesc.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				
				etcData.put("contiDesc",contiDesc);
				
				eventResponse.setETCData(etcData);
				
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00006",new String[]{}).getUserMessage());
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
	 * Checking the country code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkCountryCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		SupComEvent event = (SupComEvent)e;
		  
		SupCommonBC command = new SupCommonBCImpl();
		  
		try {
			
			String cntDesc = command.checkCountryCode(event.getCntDesc());

			if(!cntDesc.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				
				etcData.put("cntDesc",cntDesc);
				
				eventResponse.setETCData(etcData);
				
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00007",new String[]{}).getUserMessage());
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
	 * Checking the service land code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkServiceLaneCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		SupComEvent event = (SupComEvent)e;
		  
		SupCommonBC command = new SupCommonBCImpl();
		  
		try {
			
			String slanCd = command.checkServiceLaneCode(event.getSlanCd());

			if(!slanCd.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				
				etcData.put("slanCd",slanCd);
				
				eventResponse.setETCData(etcData);
				
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00004",new String[]{}).getUserMessage());
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
	 * Checking the port code<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkPortCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		SupComEvent event = (SupComEvent)e;
		  
		SupCommonBC command = new SupCommonBCImpl();
		  
		try {
			
			String portCd = command.checkPortCode(event.getSlanCd());

			if(!portCd.equals("")) {
				Map<String,String> etcData = new HashMap<String,String>();
				
				etcData.put("portCd",portCd);
				
				eventResponse.setETCData(etcData);
				
			} else {
				eventResponse.setUserMessage((String) new ErrorHandler("SUP00003",new String[]{}).getUserMessage());
			}
			
		} catch(EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return eventResponse;
	}

}