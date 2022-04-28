/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : InvoiceSC.java
 *@FileTitle : Invoice Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.03.25
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.03.25 
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice;

import java.util.List;

import com.bea.common.security.xacml.context.Request;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.basic.InvoiceMgmtBC;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.basic.InvoiceMgmtBCImpl;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.event.DouTraining0003Event;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceDtlVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.SearchTradeVO;


/**
 * ALPS-Invoice Business Logic ServiceCommand - ALPS-Invoice 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Viet Tran
 * @see InvoiceMgmtDBDAO
 * @since J2EE 1.6
 */

public class InvoiceSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Invoice system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("InvoiceSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Invoice system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("InvoiceSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-Invoice system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e
	 *            Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("DouTraining0003Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = InvoiceVO(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = InvoiceDtlVO(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = laneData(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
				eventResponse = tradeData(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = InvoiceVOs(e);
			} else if (e.getFormCommand().isCommand(FormCommand.DEFAULT)) {
				eventResponse = partnerData(e);
			}
		}
		return eventResponse;
	}

	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse InvoiceVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();

		try {
			List<InvoiceVO> list = command.InvoiceVO(event.getInvoiceVO());
			eventResponse.setRsVoList(list);
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse partnerData(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();
		StringBuilder partnerCb = new StringBuilder();

		try {
			List<InvoiceVO> partnerList = command.searchPartner(event.getInvoiceVO());
			if(partnerList.size() > 0){
				for (int i = 0; i < partnerList.size(); i++) {
					partnerCb.append("|"+partnerList.get(i).getJoCrrCd());
				}
			}
			eventResponse.setETCData("partnerCb", partnerCb.toString());
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse laneData(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();
		StringBuilder laneCb = new StringBuilder();

		try {
			List<InvoiceVO> laneList = command.searchLane(event.getInvoiceVO());
			if(laneList.size()>0){
				laneCb.append(laneList.get(0).getRlaneCd());
				for (int i = 1; i < laneList.size(); i++) {
					laneCb.append("|"+laneList.get(i).getRlaneCd());
				}
			}
			eventResponse.setETCData("laneCb", laneCb.toString());
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	
	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse tradeData(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();
		StringBuilder tradeCb = new StringBuilder();

		try {
			List<SearchTradeVO> tradeList = command.searchTrade(event.getSearchTradeVO());
			if(tradeList.size()>0){
				tradeCb.append(tradeList.get(0).getTrdCd());
				for (int i = 1; i < tradeList.size(); i++) {
					tradeCb.append("|"+tradeList.get(i).getTrdCd());
				}
			}
			eventResponse.setETCData("tradeCb", tradeCb.toString());
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse InvoiceDtlVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();

		try {
			List<InvoiceDtlVO> list = command.InvoiceDtlVO(event
					.getInvoiceDtlVO());
			eventResponse.setRsVoList(list);
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * DOU_TRAINING_0003 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 *
	 * @param Event
	 *            e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse InvoiceVOs(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0003Event event = (DouTraining0003Event) e;
		InvoiceMgmtBC command = new InvoiceMgmtBCImpl();
		try {
			begin();
			command.InvoiceVO(event.getInvoiceVOS(), account);
			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX")
					.getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
}