/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : System Common
*@FileName       : FileUploadHtmlAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 1. 5.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.file;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.attachment.file.upload.FileUpload;
import com.clt.framework.component.attachment.file.upload.FileUploadException;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
/**
 * It's FileUploadHtmlAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 1. 8.
 */
public class FileSampleTestHTMLAction extends HTMLActionSupport {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3762101406228802153L;

/**
 * File Sample의 HTML Action을 수행한다.
 */
public Event perform(HttpServletRequest request) throws HTMLActionException {
	Event event = new FileSampleTestEvent();
	FileUpload fileUpload = null;
	try {
		fileUpload = new FileUpload(request,"FMS", event, false);
	} catch (FileUploadException e) {
		throw new HTMLActionException(e.getMessage());
	}		
	HttpServletRequest multipartRequest = fileUpload.getRequest();
//	System.out.println("[And Test Parameter]"+multipartRequest.getParameter("title"));
	return doBusiness(multipartRequest, event);
}

/**
 * 비즈니스 Logic을 수행 합니다.
 * @author Jeong-Hoon, KIM
 * @param multipartRequest
 */
private Event doBusiness(HttpServletRequest multipartRequest,Event event) {
	super.log.debug("Business Test [" + multipartRequest.getParameter("moduleId") + "]");
	super.log.debug("Keys [" + multipartRequest.getAttribute("KEYS") + "]");
	
	
	FormCommand formCommand = FormCommand.fromRequest(multipartRequest);
	event.setFormCommand(formCommand);
	event.setAttribute("KEYS", (List<?>)multipartRequest.getAttribute(SiteConfigFactory.get("COM.FILE.UPLOAD.KEYS")));
	return event;
}
}
