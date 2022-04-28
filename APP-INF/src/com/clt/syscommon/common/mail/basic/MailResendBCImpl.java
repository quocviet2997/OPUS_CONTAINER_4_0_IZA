/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailResendBCImpl.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 29, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.basic;

import com.clt.syscommon.common.mail.integration.MailResendEAIDAO;

/**
 * It's MailResendBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 29, 2009
 */
public class MailResendBCImpl implements MailResendBC {

	/**
	 * Mail 재전송 한다.<br>
	 * @param mailKey		String
	 * @param fileKey		String
	 * @return String
	 * @throws Exception
	 */		
	public String send(String mailKey, String fileKey) throws Exception {
		MailResendEAIDAO mailResendEAIDAO = new MailResendEAIDAO();
		return mailResendEAIDAO.send(mailKey, fileKey);
	}

}
