/*========================================================
 *Copyright(c) 2009 CyberLogitec
 *ProcessChain    : NPI
 *@FileName       : MailSC.java
 *@FileTitle      : NIS2010
 *Open Issues     :
 *Change history  :
 *@LastModifyDate : 2009. 4. 6.
 *@LastModifier   : Jeong-Hoon, KIM
 *@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail;

import java.io.IOException;
import java.sql.SQLException;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.component.rdexport.ReportDesignerExportException;
import com.clt.framework.component.rdmail.RDMailSendException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.mail.basic.MailBC;
import com.clt.syscommon.common.mail.basic.MailBCImpl;
import com.clt.syscommon.common.mail.basic.MailPopupBC;
import com.clt.syscommon.common.mail.basic.MailPopupBCImpl;
import com.clt.syscommon.common.mail.basic.MailResendBC;
import com.clt.syscommon.common.mail.basic.MailResendBCImpl;
import com.clt.syscommon.common.mail.event.MailEvent;
import com.clt.syscommon.common.mail.event.MailResendEvent;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailSC.java
 * 
 * @author Jeong-Hoon, KIM
 * @see
 * @since J2EE 1.5 2009. 4. 6.
 */
public class MailSC extends ServiceCommandSupport {
	
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Common system 업무 시나리오 선행작업<br>
	 * Common업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			account = getSignOnUserAccount();
		} catch (EventException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	/**
	 * Common system 업무 시나리오 마감작업<br>
	 * Common 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("Mail CommonSC 종료");
	}

	/**
	 * Mail 전송 SC.
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return EventResponse
	 * @throws EventException
	 */
	public EventResponse perform(Event event) throws EventException {
		GeneralEventResponse eventResponse = null;
		if (event.getEventName().equalsIgnoreCase("MailEvent") && event.getFormCommand().isCommand(FormCommand.MULTI)) {
			try {
				begin();
				eventResponse = doMail(event);
				commit();
			} catch (MailerAppException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (RDMailSendException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (ReportDesignerExportException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (SQLException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (DAOException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (Exception e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			}
		} else if (event.getEventName().equalsIgnoreCase("MailEvent") && event.getFormCommand().isCommand(FormCommand.DEFAULT)) {
			try {
				eventResponse = doMailPopup(event);
			} catch (IOException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (ReportDesignerExportException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (DAOException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (SQLException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (CheckUtilsException e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			} catch (Exception e) {
				throw new EventException("["+e.getClass().getName()+"]" + e.getMessage());
			}
		} else if (event.getEventName().equalsIgnoreCase("MailResendEvent")) {
			try {
				begin();
				eventResponse = doMailResend(event);
				commit();
			} catch (Exception e) {
				throw new EventException(e.getMessage());
			}
		}
		return eventResponse;
	}

	/**
	 * This method resends a mail.
	 * 
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws Exception
	 */
	private GeneralEventResponse doMailResend(Event event) throws Exception {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MailResendEvent mailResendEvent = (MailResendEvent) event;
		MailResendBC mailResendBC = new MailResendBCImpl();
		eventResponse.setCustomData("MailKey", mailResendBC.send(mailResendEvent.getMailKey(), mailResendEvent.getFileKey()));
		return eventResponse;
	}

	/**
	 * This method opens a popup.
	 * It doesn't send a mail.
	 * 
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws Exception 
	 */
	private GeneralEventResponse doMailPopup(Event event) throws Exception{
		MailEvent mailPopupEvent = (MailEvent) event;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		MailCustomVO mailCustomVO = mailPopupEvent.getMailCustomVO();
		
		if (mailCustomVO.getRecipient() == null) {
			return eventResponse;
		}

		MailPopupBC mailPopupBC = new MailPopupBCImpl();
		String template = mailCustomVO.getTemplate();
		String args = mailCustomVO.getArgument();
		if (template != null && !"".equals(template)) {
			String templateContent = mailPopupBC.getTemplateContent(template, args);
			eventResponse.setCustomData("templateContent", templateContent);
		} else{
			eventResponse.setCustomData("templateContent", mailCustomVO.getContent());
		}
		eventResponse.setCustomData("mailCustomVO", mailCustomVO);
		return eventResponse;
	}

	/**
	 * this method sends a Mail.
	 * 
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws MailerAppException
	 * @throws RDMailSendException 
	 * @throws DAOException 
	 * @throws SQLException 
	 * @throws ReportDesignerExportException 
	 */
	private GeneralEventResponse doMail(Event event) throws MailerAppException, RDMailSendException, ReportDesignerExportException, SQLException, DAOException {
		MailEvent mailEvent = (MailEvent) event;
		
		mailEvent.getMailCustomVO().setCreUsrId(account.getUsr_id());
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		if (mailEvent.getMailCustomVO().getRecipient() == null) {
			return eventResponse;
		}

		MailBC mailBC = new MailBCImpl();
		String key = mailBC.doMail(mailEvent.getMailCustomVO());
		eventResponse.setETCData("mailKey", key);
		return eventResponse;
	}

}
