/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSampleEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail.event;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * It's RDMailSampleEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public class RDMailSampleEvent extends EventSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2287661516472859337L;
	private String subSysCd;
	private String senderUsrId;
	private String senderUsrNm;
	private String senderUsrEml;
	private String senderOfcCd;
	private String receiverEml;
	private String title;
	private String content;
	private String tmplMrd;
	private String tmplParam;
	private String emlFileKey1;
	private String emlFileKey2;
	private String xptFileNm;
	private String smtpIp;
	
	public String getSubSysCd() {
		return subSysCd;
	}
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
	}
	public String getSenderUsrId() {
		return senderUsrId;
	}
	public void setSenderUsrId(String senderUsrId) {
		this.senderUsrId = senderUsrId;
	}
	public String getSenderUsrNm() {
		return senderUsrNm;
	}
	public void setSenderUsrNm(String senderUsrNm) {
		this.senderUsrNm = senderUsrNm;
	}
	public String getSenderUsrEml() {
		return senderUsrEml;
	}
	public void setSenderUsrEml(String senderUsrEml) {
		this.senderUsrEml = senderUsrEml;
	}
	public String getSenderOfcCd() {
		return senderOfcCd;
	}
	public void setSenderOfcCd(String senderOfcCd) {
		this.senderOfcCd = senderOfcCd;
	}
	public String getReceiverEml() {
		return receiverEml;
	}
	public void setReceiverEml(String receiverEml) {
		this.receiverEml = receiverEml;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTmplMrd() {
		return tmplMrd;
	}
	public void setTmplMrd(String tmplMrd) {
		this.tmplMrd = tmplMrd;
	}
	public String getTmplParam() {
		return tmplParam;
	}
	public void setTmplParam(String tmplParam) {
		this.tmplParam = tmplParam;
	}
	public void setEmlFileKey1(String emlFileKey1) {
		this.emlFileKey1 = emlFileKey1;
	}
	public String getEmlFileKey1() {
		return emlFileKey1;
	}
	public void setEmlFileKey2(String emlFileKey2) {
		this.emlFileKey2 = emlFileKey2;
	}
	public String getEmlFileKey2() {
		return emlFileKey2;
	}
	/**
	 * It's a setter of xptFileNm.
	 * @param xptFileNm the xptFileNm to set
	 */
	public void setXptFileNm(String xptFileNm) {
		this.xptFileNm = xptFileNm;
	}
	/**
	 * It's a getter of xptFileNm.
	 * @return the xptFileNm
	 */
	public String getXptFileNm() {
		return xptFileNm;
	}
	/**
	 * It's a setter of smtpIp.
	 * @param smtpIp the smtpIp to set
	 */
	public void setSmtpIp(String smtpIp) {
		this.smtpIp = smtpIp;
	}
	/**
	 * It's a getter of smtpIp.
	 * @return the smtpIp
	 */
	public String getSmtpIp() {
		return smtpIp;
	}


}
