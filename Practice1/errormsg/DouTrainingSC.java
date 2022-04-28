/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DouTrainingSC.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.doutraining;

import java.util.List;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.basic.ErrMsgMgmtBC;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.basic.ErrMsgMgmtBCImpl;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.event.DouTraining0001Event;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;


/**
 * ALPS-DouTraining Business Logic ServiceCommand - ALPS-DouTraining 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Viet Tran
 * @see ErrMsgMgmtDBDAO
 * @since J2EE 1.6
 */

public class DouTrainingSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * [doStart] ...<br>
	 */
	public void doStart() {
		log.debug("DouTrainingSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
			System.out.println(account);
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * [doEnd] ...<br>
	 */
//	public void doEnd() {
//		log.debug("DouTrainingSC 종료");
//	}
	/**
	 * [modifyErrMsg] modify ErrMsgVOs to save the change in database.<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// Which part to use if SC handles multiple events
		if (e.getEventName().equalsIgnoreCase("DouTraining0001Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				// run the function searchErrMsgVO
				eventResponse = searchErrMsgVO(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				// run the function multiErrMsgVO
				eventResponse = multiErrMsgVO(e);
			}
		}
		return eventResponse;
	}
	
	/**
	 * [searchErrMsgVO] receive a list of searching ErrMsgVO then set it in eventResponse.<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchErrMsgVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		// define an eventResponse variable
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		// define an event variable
		DouTraining0001Event event = (DouTraining0001Event)e;
		// define a business component variable
		ErrMsgMgmtBC command = new ErrMsgMgmtBCImpl();

		try{
			// get list of ErrMsgVO
			List<ErrMsgVO> list = command.searchErrMsg(event.getErrMsgVO());
			// set that list in eventResponse
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * [multiErrMsgVO] modify ErrMsgVOs to save the change in database.<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse multiErrMsgVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		// define an eventResponse variable
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		// define an event variable
		DouTraining0001Event event = (DouTraining0001Event)e;
		// define a business component variable
		ErrMsgMgmtBC command = new ErrMsgMgmtBCImpl();
		
		try{
			// start a transaction
			begin();
			// to insert, update, delete a list of ErrMsgVO to database
			command.modifyErrMsg(event.getErrMsgVOS(),account);
//			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
			// end a transaction and accept the result
			commit();
		} catch(EventException ex) {
			// cancel that transaction
			rollback();
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch(Exception ex) {
			// cancel that transaction
			rollback();
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return eventResponse;
	}
}