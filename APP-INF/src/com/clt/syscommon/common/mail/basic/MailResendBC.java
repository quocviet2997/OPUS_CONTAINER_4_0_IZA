/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailResendBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 29, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.basic;


/**
 * It's MailResendBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 29, 2009
 */
public interface MailResendBC {
	
	/**
	 * This method resends a mail.
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 */
	String send(String mailKey, String fileKey) throws Exception;

}
