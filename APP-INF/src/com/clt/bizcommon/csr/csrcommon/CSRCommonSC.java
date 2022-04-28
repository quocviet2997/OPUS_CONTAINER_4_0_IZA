/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRCommonSC.java
*@FileTitle : CSR Common SC
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier :
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.csrcommon;

import java.util.Map;

import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.basic.CSRExternalFinderBC;
import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.basic.CSRExternalFinderBCImpl;
import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.event.CsrComExternalEvent;
import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.vo.SpCsrVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

 
/**
 * Handling business transaction about NIS2010-CSRCommonSC Business Logic ServiceCommand - NIS2010-CSRCommonSC
 * @author 
 * @see SCGExternalFinderDBDAO
 * @since J2EE 1.6
 */

public class CSRCommonSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount signOnUserAccount = null;
	 
	/**
	 * Preceding process for business scenario, CSRCommonSC system<br>
	 * Creating the related objects.<br>
	 */
	public void doStart() {
		try {
			signOnUserAccount = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Closing the business scenario, CSRCommonSC system<br>
	 * Clearing the related objects.<br>
	 */
	public void doEnd() {
		log.debug("CSRCommonSC ends");
	}

	/**
	 * Processing the business scenario.<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		if (e.getEventName().equalsIgnoreCase("CsrComExternalEvent")) {
			// Service Provider Detail Information
			if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				 eventResponse = checkVendor(e);     
			}else if(e.getFormCommand().isCommand(FormCommand.COMMAND05)) {
				 eventResponse = getDBdate(e);     
			}else if(e.getFormCommand().isCommand(FormCommand.COMMAND02)) {
				 eventResponse = getMDMCntCd(e);     
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = createApPayInvInfo(e);
			}
		}

		return eventResponse;
	}
	
	/**
	 * Checking the vendor<br>
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkVendor(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		try{
			CsrComExternalEvent event = (CsrComExternalEvent)e;
			CSRExternalFinderBC command = new CSRExternalFinderBCImpl(); 
			
			SpCsrVO spCsrVO = event.getSpCsrVO();
			String vndrSeq = spCsrVO.getVndrSeq();
			
			spCsrVO = command.checkVendor(vndrSeq);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();    
			
			if(spCsrVO != null){
				Map<String, String> mapVO = spCsrVO.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
			return eventResponse;
		}catch (EventException ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Retrieving the locale date by the office code.<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse getDBdate(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		try{
			CsrComExternalEvent event = (CsrComExternalEvent)e;
			CSRExternalFinderBC command = new CSRExternalFinderBCImpl(); 
			
			SpCsrVO spCsrVO = event.getSpCsrVO();
			String ofcCd = spCsrVO.getOfcCd();
			
			spCsrVO = command.getDBdate(ofcCd);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();    
			
			if(spCsrVO != null){
				Map<String, String> mapVO = spCsrVO.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
			return eventResponse;
		}catch (EventException ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Retrieving the MDM country code.<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse getMDMCntCd(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		try{
			CsrComExternalEvent event = (CsrComExternalEvent)e;
			CSRExternalFinderBC command = new CSRExternalFinderBCImpl(); 
			
			SpCsrVO spCsrVO = event.getSpCsrVO();
			String ofcCd = spCsrVO.getOfcCd();
			
			String cntCd = command.getMDMCntCd(ofcCd);
			
			spCsrVO.setCntCd(cntCd);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();    
			
			if(spCsrVO != null){
				Map<String, String> mapVO = spCsrVO.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
			return eventResponse;
		}catch (EventException ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Saving the list of AP_PAY_INV_DTL<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse createApPayInvInfo(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		CsrComExternalEvent event = (CsrComExternalEvent)e;
		CSRExternalFinderBC command = new CSRExternalFinderBCImpl();
		
		try{
			begin();
			command.createApPayInvInfo(event.getApPayInvVO(),event.getApPayInvDtlVOs(),signOnUserAccount);
			eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			commit();
			
			return eventResponse;
		}catch (EventException ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
			log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		
	}
 
}