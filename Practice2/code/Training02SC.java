/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : Training02SC.java
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02;

import java.util.List;
import com.clt.apps.opus.esm.clv.training02.codemanagement.basic.CodeManagementBC;
import com.clt.apps.opus.esm.clv.training02.codemanagement.basic.CodeManagementBCImpl;
import com.clt.apps.opus.esm.clv.training02.codemanagement.event.DouTraining0002Event;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtDtlVO;

/**
 * ALPS-Training02 Business Logic ServiceCommand - ALPS-Training02 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Viet Tran
 * @see CodeManagementDBDAO
 * @since J2EE 1.6
 */

public class Training02SC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Training02 system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("Training02SC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Training02 system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("Training02SC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-Training02 system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("DouTraining0002Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchCodeMgmt(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchCodeMgmtDtl(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
				eventResponse = modifyCodeMgmt(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI02)) {
				eventResponse = modifyCodeMgmtDtl(e);
			}
		}
		return eventResponse;
	}
	
	/**
	 * DOU_TRAINING_0002 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCodeMgmt(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0002Event event = (DouTraining0002Event)e;
		CodeManagementBC command = new CodeManagementBCImpl();

		try{
			List<CodeMgmtVO> list = command.searchCodeMgmt(event.getCodeMgmtVO());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	
	/**
	 * DOU_TRAINING_0002 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCodeMgmtDtl(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0002Event event = (DouTraining0002Event)e;
		CodeManagementBC command = new CodeManagementBCImpl();

		try{
			List<CodeMgmtDtlVO> list = command.searchCodeMgmtDtl(event.getCodeMgmtDtlVO());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	 
	/**
	 * DOU_TRAINING_0002 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 *
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse modifyCodeMgmt(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0002Event event = (DouTraining0002Event)e;
		CodeManagementBC command = new CodeManagementBCImpl();
		try{
			begin();
			command.modifyCodeMgmt(event.getCodeMgmtVOS(),account);
			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
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
	
	/**
	 * DOU_TRAINING_0002 : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 *
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse modifyCodeMgmtDtl(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		DouTraining0002Event event = (DouTraining0002Event)e;
		CodeManagementBC command = new CodeManagementBCImpl();
		try{
			begin();
			command.modifyCodeMgmtDtl(event.getCodeMgmtDtlVOS(),account);
			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
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