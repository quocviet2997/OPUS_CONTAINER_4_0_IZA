/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadHTMLAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 20, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.event;

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
 * It's FileUploadHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 20, 2009
 */
public class FileUploadHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4936601865176238390L;

	/**
	 * This method performs a subject.
	 * @author Jeong-Hoon, KIM
	 * @param multipartRequest
	 * @return Event
	 * @throws HTMLActionException
	 */
	public Event perform(HttpServletRequest multipartRequest) throws HTMLActionException {
		FileUploadEvent fileUploadEvent = new FileUploadEvent();
		FileUpload fileUpload;
		try {
			fileUpload = new FileUpload();
			fileUpload.setInitRequest(multipartRequest);
			fileUpload.setModuleId(SubSystemConfigFactory.get("TMP.MODULE.ID"));
			fileUpload.setEncoding(SubSystemConfigFactory.get("COM.ENCODING.EUCKR"));
			//fileUpload.setEncoding(SiteConfigFactory.get("COM.FILE.UPLOAD.ENCODING"));
			fileUpload.setEvent(fileUploadEvent);
			fileUpload.setIsMail(false);
			fileUpload.doUpload();
//			fileUpload = new FileUpload(multipartRequest, SubSystemConfigFactory.get("TMP.MODULE.ID"), SubSystemConfigFactory.get("COM.ENCODING.EUCKR"), fileUploadEvent);
		} catch (FileUploadException e) {
			this.log.error("[FileUploadException]"+e.getMessage());
			throw new HTMLActionException("[FileUploadException]"+e.getMessage());
		}
		HttpServletRequest request = fileUpload.getRequest();
		FormCommand formCommand = new FormCommand();
		formCommand.setCommand(FormCommand.ADD);
		fileUploadEvent.setFormCommand(formCommand);
		fileUploadEvent.setModuleId(request.getParameter("subSysCd"));
		fileUploadEvent.setKeys((List<String>)request.getAttribute(SiteConfigFactory.get("COM.FILE.UPLOAD.KEYS")));
		return fileUploadEvent;
	}

}
