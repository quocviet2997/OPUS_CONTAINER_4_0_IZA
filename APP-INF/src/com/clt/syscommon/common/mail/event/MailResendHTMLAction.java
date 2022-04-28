/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailResendHTMLAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 29, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;

/**
 * It's MailResendHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 29, 2009
 */
public class MailResendHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2334583354972217755L;

	/**
	 * Mail 재전송 Html Action.
	 * @author Jeong-Hoon, KIM
	 * @param request
	 * @return Event
	 * @throws HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		if(request.getParameter("MailKey") != null){
			MailResendEvent mailResendEvent = new MailResendEvent();
			mailResendEvent.setMailKey(request.getParameter("MailKey"));
			mailResendEvent.setFileKey(request.getParameter("FileKey"));	
			return mailResendEvent;	
		}
		return null;
	}

}
