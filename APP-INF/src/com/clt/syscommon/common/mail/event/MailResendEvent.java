/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailResendEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 29, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.event;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * It's MailResendEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 29, 2009
 */
public class MailResendEvent extends EventSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3932049740467600618L;
	
	private String mailKey;
	private String fileKey;

	public void setMailKey(String mailKey) {
		this.mailKey = mailKey;
	}
	
	public String getMailKey(){
		return this.mailKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	
	public String getFileKey(){
		return this.fileKey;
	}

}
