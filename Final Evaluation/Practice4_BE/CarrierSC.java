/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierSC.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic.CarrierMgmtBC;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic.CarrierMgmtBCImpl;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.event.FnsDou0004Event;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;


/**
 * ALPS-Carrier Business Logic ServiceCommand - Process business transaction for ALPS-Carrier.
 * 
 * @author Viet Tran
 * @see CarrierMgmtDBDAO
 * @since J2EE 1.6
 */

public class CarrierSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Carrier system task scenario precedent work<br>
	 * Creating related internal objects when calling a business scenario<br>
	 */
	public void doStart() {
		log.debug("CarrierSC start");
		try {
			// once comment --> login check part
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Carrier system work scenario finishing work<br>
	 * Release related internal objects when the work scenario is finished<br>
	 */
	public void doEnd() {
		log.debug("CarrierSC end");
	}

	/**
	 * Carry out business scenarios for each event<br>
	 * Branch processing of all events occurring in ALPS-Carrier system work<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// The part to use when SC handles multiple events
		if (e.getEventName().equalsIgnoreCase("FnsDou0004Event")) {
			if (e.getFormCommand().isCommand(FormCommand.DEFAULT)) {
				eventResponse = initData(e);
			}
			else
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCarrierListVO(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = modifyCarrierListVO(e);
			}
			else if(e.getFormCommand().isCommand(FormCommand.COMMAND01)){
				eventResponse = checkDuplicate(e);
			}
			else if(e.getFormCommand().isCommand(FormCommand.COMMAND02)
				  ||e.getFormCommand().isCommand(FormCommand.COMMAND03)
				  ||e.getFormCommand().isCommand(FormCommand.COMMAND04)
				  ||e.getFormCommand().isCommand(FormCommand.COMMAND05)){
				eventResponse = checkValid(e);
			}
		}
		return eventResponse;
	}
	
	/**
	 * Generate ETCData for CarrierCode and RLaneCode.<br>
	 * 
	 * @param e DouTraining0004Event.
	 * @return eventResponse.
	 * @exception EventException
	 */
	private EventResponse initData(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FnsDou0004Event event = (FnsDou0004Event)e;
		CarrierMgmtBC command = new CarrierMgmtBCImpl();

		try{
			List<CarrierListVO> carrierList = command.searchCarrierCode(event.getCarrierListVO());
			List<CarrierListVO> rLaneList = command.searchRLaneCode(event.getCarrierListVO());
			StringBuilder crList = new StringBuilder();
			StringBuilder rlList = new StringBuilder();
			for(int i = 0; i < carrierList.size(); i++){
				if(i == 0)
					crList.append(carrierList.get(i).getJoCrrCd());
				else
					crList.append("|"+carrierList.get(i).getJoCrrCd());
			}
			for(int i = 0; i < rLaneList.size(); i++){
				if(i == 0)
					rlList.append(rLaneList.get(i).getRlaneCd());
				else
					rlList.append("|"+rLaneList.get(i).getRlaneCd());
			}
			eventResponse.setETCData("carrierItems", crList.toString());
			eventResponse.setETCData("rLaneItems", rlList.toString());
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * Generate search data for CarrierListVO.<br>
	 * 
	 * @param e DouTraining0004Event.
	 * @return eventResponse.
	 * @exception EventException
	 */
	private EventResponse searchCarrierListVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FnsDou0004Event event = (FnsDou0004Event)e;
		CarrierMgmtBC command = new CarrierMgmtBCImpl();

		try{
			List<CarrierListVO> list = command.searchCarrierListVO(event.getCarrierListVO());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * Generate search data for CarrierListVO.<br>
	 * 
	 * @param e DouTraining0004Event.
	 * @return eventResponse.
	 * @exception EventException
	 */
	private EventResponse checkValid(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FnsDou0004Event event = (FnsDou0004Event)e;
		CarrierMgmtBC command = new CarrierMgmtBCImpl();
		List<CarrierListVO> list = null;

		try {
			if (e.getFormCommand().isCommand(FormCommand.COMMAND02)) {
				list = command.searchCarrierCode2(event.getCarrierListVO());
			}
			if (e.getFormCommand().isCommand(FormCommand.COMMAND03)) {
				list = command.searchVndrCode(event.getCarrierListVO());
			}
			if (e.getFormCommand().isCommand(FormCommand.COMMAND04)) {
				list = command.searchCustCode(event.getCarrierListVO());
			}
			if (e.getFormCommand().isCommand(FormCommand.COMMAND05)) {
				list = command.searchTrdCode(event.getCarrierListVO());
			}
			if (list == null) {
				list = new ArrayList<>();
			}
			eventResponse.setETCData("isExisted", list.size() > 0 ? "Y" : "N");
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * Generate search data for CarrierListVO.<br>
	 * 
	 * @param e DouTraining0004Event.
	 * @return eventResponse.
	 * @exception EventException
	 */
	private EventResponse checkDuplicate(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FnsDou0004Event event = (FnsDou0004Event)e;
		CarrierMgmtBC command = new CarrierMgmtBCImpl();
		List<CarrierListVO> list = null;

		try {
			list = command.searchCarrierListVO(event.getCarrierListVO());
			if (list == null) {
				eventResponse.setETCData("isExisted", "N");
				list = new ArrayList<>();
				int t = list.size();
				System.out.println(t);
			}
			else{
				eventResponse.setETCData("isExisted", list.size() > 0 ? "Y" : "N");
			}
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * Generate save data for CarrierListVO.<br>
	 * 
	 * @param e DouTraining0004Event.
	 * @return eventResponse.
	 * @exception EventException
	 */
	private EventResponse modifyCarrierListVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FnsDou0004Event event = (FnsDou0004Event)e;
		CarrierMgmtBC command = new CarrierMgmtBCImpl();
		try{
			begin();
			command.modifyCarrierListVO(event.getCarrierListVOS(),account);
			commit();
		} catch(EventException ex) {
			rollback();
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch(Exception ex) {
			rollback();
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return eventResponse;
	}
}