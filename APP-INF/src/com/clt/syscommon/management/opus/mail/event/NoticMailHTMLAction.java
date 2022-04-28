/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticMailHTMLAction.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 8.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.management.opus.mail.vo.NoticeMailVO;

/**
 * NoticMailHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 8.
 */
public class NoticMailHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4834024206526768815L;

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param request
	 * @return
	 * @throws HTMLActionException Event
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		FormCommand formCommand = FormCommand.fromRequest(request);
		if(formCommand.isCommand(FormCommand.COMMAND01)){
			NoticeMailSendEvent noticeMailSendEvent = new NoticeMailSendEvent();
			noticeMailSendEvent.setAttribute("NoticeMailVO", getVO(request, NoticeMailVO.class));
			return noticeMailSendEvent;
		} else{
			return new NoticeMailEvent();
		}
	}

}

