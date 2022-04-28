/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailHTMLAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 6.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.event;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import m2soft.rdsystem.server.core.rddbagent.util.serverexport.ExportInfo;

import com.clt.framework.component.attachment.file.upload.FileUpload;
import com.clt.framework.component.util.CheckUtils;
import com.clt.framework.component.util.StringUtil;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public class MailHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4886511331311008028L;

	/**
	 * Mail을 전송하는 Html Action.
	 * @author Jeong-Hoon, KIM
	 * @param request
	 * @return Event
	 * @throws HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		try{
			MailEvent mailEvent = new MailEvent();
			String strFilekeys = "";
			if(request.getHeader("Content-Type").startsWith("multipart/")){
				
				FileUpload fileUpload = new FileUpload();
				fileUpload.setModuleId("EML");
				fileUpload.setEncoding(SubSystemConfigFactory.get("COM.ENCODING.EUCKR"));
				fileUpload.setEvent(mailEvent);
				fileUpload.setInitRequest(request);
				fileUpload.setIsMail(true);
				fileUpload.doUpload();
				
				request = fileUpload.getRequest();
				List<String> fileKeys = (List<String>)request.getAttribute(SiteConfigFactory.get("COM.FILE.UPLOAD.KEYS"));
				strFilekeys = StringUtil.attachStringWithDelimeter(fileKeys, ";");
			}
			
			MailCustomVO mailCustomVO = new MailCustomVO();
			mailCustomVO.setFrom(request.getParameter("com_from"));
			mailCustomVO.setFromName(request.getParameter("com_fromName"));
			mailCustomVO.setCarbonCopy(request.getParameter("com_carbonCopy"));
			mailCustomVO.setBlindCarbonCopy(request.getParameter("com_blindCarbonCopy"));
			mailCustomVO.setSubject(request.getParameter("com_subject"));
			mailCustomVO.setContent(request.getParameter("com_content"));
			mailCustomVO.setFileKey(request.getParameter("com_fileKey")+strFilekeys);
			mailCustomVO.setReportFileKeys(request.getParameterValues("com_reportKeys"));
			mailCustomVO.setRecipient(request.getParameter("com_recipient"));
			mailCustomVO.setSmtp(request.getParameter("com_smtp"));
			mailCustomVO.setOfficeCode(request.getParameter("com_officeCode"));
			mailCustomVO.setGroupwareMail(Boolean.valueOf(request.getParameter("com_groupwareMail")));
			
			mailCustomVO.setTemplate(request.getParameter("com_template"));
			mailCustomVO.setArgument(request.getParameter("com_argument"));
			
			if(!CheckUtils.isNullAndNullString(request.getParameter("com_templateMrd"))){
				String templateMrd = request.getParameter("com_templateMrd");
				String templateMrdArguments = request.getParameter("com_templateMrdArguments");
				String rdExportFileName = request.getParameter("com_rdExportFileName");
				String rdExportFileType = request.getParameter("com_rdExportFileType");
								
				String[] arrTemplateMrd = templateMrd.split(";");
				String[] arrTemplateMrdArguments = templateMrdArguments.split(";",1000);
				String[] arrRdExportFileName = rdExportFileName.split(";",1000);
				String[] arrRdExportFileType = rdExportFileType.split(";",1000);
				
				for(int i=0;i<arrTemplateMrd.length;i++){
					mailCustomVO.setTemplateMrd(arrTemplateMrd[i]);
					mailCustomVO.setTemplateMrdArguments(arrTemplateMrdArguments[i]);
					mailCustomVO.setRdExportFileName(CheckUtils.isNullAndNullString(arrRdExportFileName[i])? "Report.pdf": arrRdExportFileName[i]);
					mailCustomVO.setRdExportFileType(CheckUtils.isNullAndNullString(arrRdExportFileType[i])? ExportInfo.FTYPE_PDF: arrRdExportFileType[i]);
				}
			}
			
			mailCustomVO.setRdSubSysCd(request.getParameter("com_rdSubSysCd"));
			mailCustomVO.setMailKeyFlag(request.getParameter("com_mailKeyFlag"));
			mailEvent.setMailCustomVO(mailCustomVO);
			mailEvent.setAttribute("mailKeyFlag", request.getParameter("com_mailKeyFlag"));
			return mailEvent;
		} catch(Exception e){
			log.error(e.getMessage());
			throw new HTMLActionException(e.getMessage(),e);
		}
	}
}
