/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FaxSC.java
*@FileTitle : fax_send
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.01
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.01 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.fax;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.sample.fax.faxsend.basic.FaxSendBC;
import com.clt.sample.fax.faxsend.basic.FaxSendBCImpl;
import com.clt.sample.fax.faxsend.event.FaxSendEvent;


/**
 * NIS2010-Fax Business Logic ServiceCommand - NIS2010-Fax 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see FaxSendDBDAO
 * @since J2EE 1.6
 */

public class FaxSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Fax system 업무 시나리오 선행작업<br>
	 * fax_send업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("FaxSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Fax system 업무 시나리오 마감작업<br>
	 * fax_send 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("FaxSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-Fax system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
			EventResponse eventResponse = null;
			begin();
			eventResponse = comFaxSndInfoVO(e);
			commit();
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * FaxSend의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse comFaxSndInfoVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FaxSendEvent event = (FaxSendEvent)e;
		FaxSendBC command = new FaxSendBCImpl();

		try{
			String returnKey = command.comFaxSndInfoVO(event.getComFaxSndInfoVO());
			eventResponse.setCustomData("key", returnKey);
		}catch(EventException ex){
			throw ex;
		}catch(Exception ex){
			throw new EventException(ex.getMessage(), ex);
		}
		return eventResponse;
	}
}