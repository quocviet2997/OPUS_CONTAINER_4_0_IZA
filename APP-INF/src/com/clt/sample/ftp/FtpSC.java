/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FtpSC.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp;

import java.util.List;

import com.clt.framework.component.ftp.FtpException;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComFtpSndInfoVO;
import com.clt.sample.ftp.send.basic.SendBC;
import com.clt.sample.ftp.send.basic.SendBCImpl;
import com.clt.sample.ftp.send.basic.SendFileBC;
import com.clt.sample.ftp.send.basic.SendFileBCImpl;
import com.clt.sample.ftp.send.event.FtpSendEvent;
import com.clt.sample.ftp.send.integration.SendDBDAO;


/**
 * ALPS-Ftp Business Logic ServiceCommand - ALPS-Ftp 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see SendDBDAO
 * @since J2EE 1.6
 */

public class FtpSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Ftp system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("FtpSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Ftp system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("FtpSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-Ftp system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("FtpSendEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = retrieveFtp(e);
			} else if(e.getFormCommand().isCommand(FormCommand.COMMAND01)){
				try {
					begin();
					eventResponse = sendFtp(e);
					commit();
				} catch (FtpException e1) {
					throw new EventException(e1.getMessage());
				}
			}
		}
		return eventResponse;
	}
	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws FtpException 
	 */
	private EventResponse sendFtp(Event e) throws FtpException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FtpSendEvent event = (FtpSendEvent)e;
		SendFileBC command = new SendFileBCImpl();
		eventResponse.setETCData("KEY", command.sendFile(event.getComFtpSndInfoVO()));
		return eventResponse;
	}

	/**
	 * FTP_SEND : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse retrieveFtp(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FtpSendEvent event = (FtpSendEvent)e;
		SendBC command = new SendBCImpl();

		try{
			List<ComFtpSndInfoVO> list = command.retrieveFtp(event.getComFtpSndInfoVO());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}catch(Exception ex){
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}	
		return eventResponse;
	}
}