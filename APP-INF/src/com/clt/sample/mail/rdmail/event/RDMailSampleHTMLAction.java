/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSampleHTMLAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;

/**
 * It's RDMailSampleHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public class RDMailSampleHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2459728479213131956L;

	/**
	 * RD mail Sample의 HTMLAction.
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		if(request.getParameter("receiver_eml") == null){
			return null;
		} else{
			RDMailSampleEvent rdMailSampleEvent = new RDMailSampleEvent();
			rdMailSampleEvent.setSubSysCd(request.getParameter("sub_sys_cd"));
			rdMailSampleEvent.setSenderUsrId(request.getParameter("sender_usr_id"));
			rdMailSampleEvent.setSenderUsrNm(request.getParameter("sender_usr_nm"));
			rdMailSampleEvent.setSenderUsrEml(request.getParameter("sender_usr_eml"));
			rdMailSampleEvent.setSenderOfcCd(request.getParameter("sender_ofc_cd"));
			rdMailSampleEvent.setReceiverEml(request.getParameter("receiver_eml"));
			rdMailSampleEvent.setTitle(request.getParameter("title"));
			rdMailSampleEvent.setContent(request.getParameter("content"));
			rdMailSampleEvent.setTmplMrd(request.getParameter("tmpl_mrd"));
			rdMailSampleEvent.setTmplParam(request.getParameter("tmpl_param"));
			rdMailSampleEvent.setEmlFileKey1(request.getParameter("emlFileKey1"));
			rdMailSampleEvent.setEmlFileKey2(request.getParameter("emlFileKey2"));
			rdMailSampleEvent.setXptFileNm(request.getParameter("xptFileNm"));
			rdMailSampleEvent.setSmtpIp(request.getParameter("smtpIp"));
			return rdMailSampleEvent;
		}
	}

}
