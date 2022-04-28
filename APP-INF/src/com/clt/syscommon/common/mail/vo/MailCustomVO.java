/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailCustomVO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 6.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * It's MailCustomVO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public class MailCustomVO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3779133229953411131L;
	private String from;
	private String fromName;
	private String carbonCopy;
	private String blindCarbonCopy;
	private String subject;
	private String content;
	private String fileKey;
	private String[] fileLocation;
	private String recipient;
	private String argument;
	private String template;
	private List<String> templateMrd = new ArrayList<String>();
	private List<String> rdParameter = new ArrayList<String>();
	private List<String> rdExportFileName = new ArrayList<String>();
	private List<String> rdExportFileType = new ArrayList<String>();
	private String creUsrId;
	private String rdSubSysCd;
	private String smtp;
	private String officeCode;
	private boolean groupwareMail;
	private String mailKeyFlag;
	
	/**
	 * setFrom
	 * @author Jeong-Hoon, KIM
	 * @param from
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	
	/**
	 * getFrom
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getFrom() {
		return from;
	}
	
	/**
	 * This method set a CarbonCopy
	 * @author Jeong-Hoon, KIM
	 * @param carbonCopy
	 */
	public void setCarbonCopy(String carbonCopy) {
		this.carbonCopy = carbonCopy;
	}
	
	/**
	 * This method get a CarbonCopy
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getCarbonCopy() {
		return carbonCopy;
	}
	
	/**
	 * This method setBlindCarbonCopy
	 * @author Jeong-Hoon, KIM
	 * @param blindCarbonCopy
	 */
	public void setBlindCarbonCopy(String blindCarbonCopy) {
		this.blindCarbonCopy = blindCarbonCopy;
	}
	
	/**
	 * This method getBlindCarbonCopy
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getBlindCarbonCopy() {
		return blindCarbonCopy;
	}
	
	/**
	 * This method setSubject
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}	
	
	/**
	 * This method getSubject
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * This method setContent
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * This method getContent
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * This method setFileKey
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	
	/** 
	 * This method getFileKey
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public String getFileKey() {
		return fileKey;
	}

	
	/**
	 * This method setRecipient
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	
	/**
	 * This method getRecipient
	 * @author Jeong-Hoon, KIM
	 * @param subject
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * This method sets Arguments. 
	 * @author Jeong-Hoon, KIM
	 * @param parameterValues
	 */
	public void setArgument(String argument) {
		this.argument = argument;
	}
	
	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getArgument(){
		return this.argument;
	}
	
	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param template
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getTemplate() {
		return this.template;
	}

	public void setTemplateMrd(String templateMrd) {
		this.templateMrd.add(templateMrd);
	}

	public List<String> getTemplateMrd() {
		return templateMrd;
	}

	public void setTemplateMrdArguments(String rdParameter) {
		this.rdParameter.add(rdParameter);
	}

	public List<String> getTemplateMrdArguments() {
		return rdParameter;
	}

	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	public String getCreUsrId() {
		return creUsrId;
	}

	public void setRdSubSysCd(String rdSubSysCd) {
		this.rdSubSysCd = rdSubSysCd;
	}

	public String getRdSubSysCd() {
		return rdSubSysCd;
	}

	/**
	 * It's a setter of rdFileName.
	 * @param rdFileName the rdFileName to set
	 */
	public void setRdExportFileName(String rdFileName) {
		this.rdExportFileName.add(rdFileName);
	}

	/**
	 * It's a getter of rdFileName.
	 * @return the rdFileName
	 */
	public List<String> getRdExportFileName() {
		return rdExportFileName;
	}

	/**
	 * It's a setter of rdExportFileType.
	 * @param rdExportFileType the rdExportFileType to set
	 */
	public void setRdExportFileType(String rdExportFileType) {
		this.rdExportFileType.add(rdExportFileType);
	}

	/**
	 * It's a getter of rdExportFileType.
	 * @return the rdExportFileType
	 */
	public List<String> getRdExportFileType() {
		return rdExportFileType;
	}

	/**
	 * It's a setter of fileLocation.
	 * @param fileLocation the fileLocation to set
	 */
	public void setReportFileKeys(String[] fileLocation) {
		this.fileLocation = fileLocation;
	}

	/**
	 * It's a getter of fileLocation.
	 * @return the fileLocation
	 */
	public String[] getReportFileKeys() {
		return fileLocation;
	}

	/**
	 * It's a setter of smtp.
	 * @param smtp the smtp to set
	 */
	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	/**
	 * It's a getter of smtp.
	 * @return the smtp
	 */
	public String getSmtp() {
		return smtp;
	}

	/**
	 * It's a setter of fromName.
	 * @param fromName the fromName to set
	 */
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	/**
	 * It's a getter of fromName.
	 * @return the fromName
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * It's Setter. String
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * It's Setter. String
	 * @param groupwareMail the groupwareMail to set
	 */
	public void setGroupwareMail(boolean groupwareMail) {
		this.groupwareMail = groupwareMail;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the groupwareMail
	 */
	public boolean getGroupwareMail() {
		return groupwareMail;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the mailKeyFlag
	 */
	public String getMailKeyFlag() {
		return mailKeyFlag;
	}

	/**
	 * It's Setter. String
	 * @param mailKeyFlag the mailKeyFlag to set
	 */
	public void setMailKeyFlag(String mailKeyFlag) {
		this.mailKeyFlag = mailKeyFlag;
	}
}
