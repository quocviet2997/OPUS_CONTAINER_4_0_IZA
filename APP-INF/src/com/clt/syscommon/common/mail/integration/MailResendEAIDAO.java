/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailResendEAIDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 29, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.integration;

import com.clt.framework.component.common.mail.MailReSend;
import com.clt.framework.component.vo.ComEmlReSndInfoVO;
import com.clt.framework.support.layer.integration.EAIDAOSupport;

/**
 * It's MailResendEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 29, 2009
 */
public class MailResendEAIDAO extends EAIDAOSupport{

	/**
	 * This method resends a mail.
	 * @author Jeong-Hoon, KIM
	 * @param mailKey
	 * @param fileKey
	 * @return String
	 * @throws Exception
	 */
	public String send(String mailKey, String fileKey) throws Exception {
		ComEmlReSndInfoVO comEmlReSndInfoVO = new ComEmlReSndInfoVO();
		comEmlReSndInfoVO.setEmlsndno(mailKey);
		comEmlReSndInfoVO.setEmlfilepathurlctnt(fileKey);
		MailReSend.send(comEmlReSndInfoVO);
		return null;
	}

}
