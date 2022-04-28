/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MailSC.java
*@FileTitle : Mail Sample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.mail;

import java.sql.SQLException;
import java.util.List;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.sample.mail.mail.basic.MailBC;
import com.clt.sample.mail.mail.basic.MailBCImpl;
import com.clt.sample.mail.mail.basic.MailSendBC;
import com.clt.sample.mail.mail.basic.MailSendBCImpl;
import com.clt.sample.mail.mail.event.Mail01Event;
import com.clt.sample.mail.mail.integration.MailDBDAO;


/**
 * NIS2010-Mail Business Logic ServiceCommand - NIS2010-Mail 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, KIM
 * @see MailDBDAO
 * @since J2EE 1.6
 */

public class MailSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Mail system 업무 시나리오 선행작업<br>
	 * MAIL_01업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("MailSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Mail system 업무 시나리오 마감작업<br>
	 * MAIL_01 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("MailSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-Mail system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event event) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (event.getEventName().equalsIgnoreCase("Mail01Event")) {
			if (event.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = comEmlSndInfoVO(event);
			} else if(event.getFormCommand().isCommand(FormCommand.COMMAND01)){
				try {
					begin();
					eventResponse = doMail(event);
					commit();
				} catch (MailerAppException e) {
					log.error("[MailerAppException]"+e.getMessage());
					throw new EventException("[MailerAppException]"+e.getMessage());
				} catch (DAOException e) {
					log.error("[MailerAppException]"+e.getMessage());
					throw new EventException("[MailerAppException]"+e.getMessage());
				} catch (SQLException e) {
					log.error("[MailerAppException]"+e.getMessage());
					throw new EventException("[MailerAppException]"+e.getMessage());
				} catch (CheckUtilsException e) {
					log.error("[MailerAppException]"+e.getMessage());
					throw new EventException("[MailerAppException]"+e.getMessage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					log.error("[MailerAppException]"+e.getMessage());
//					e.printStackTrace();
				}
			}
		}
		return eventResponse;
	}
	/**
	 * Mail을 전송하는 BC를 호출한다.
	 * @param e
	 * @return
	 * @throws Exception 
	 */
	private EventResponse doMail(Event e) throws Exception {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MailSendBC command = new MailSendBCImpl();
		command.doMail();
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Mail의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse comEmlSndInfoVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		Mail01Event event = (Mail01Event)e;
		MailBC command = new MailBCImpl();

		try{
			List<ComEmlSndInfoVO> list = command.comEmlSndInfoVO(event.getComEmlSndInfoVO());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			throw ex;
		}catch(Exception ex){
			throw new EventException(ex.getMessage(), ex);
		}		
		return eventResponse;
	}
}