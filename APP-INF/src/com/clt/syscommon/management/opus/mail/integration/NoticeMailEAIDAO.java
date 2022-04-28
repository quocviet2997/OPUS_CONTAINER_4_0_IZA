/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailEAIDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 8.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.integration;

import com.clt.framework.component.javamail.Mail;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.syscommon.management.opus.mail.vo.NoticeMailVO;
import com.clt.utilitybox.utility.StringUtilities;

/**
 * NoticeMailEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 8.
 */
public class NoticeMailEAIDAO extends EAIDAOSupport {

	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @param userEml void
	 */
	public void sendNoticeMail(NoticeMailVO noticeMailVO, String userEml) {
		
		try {
			Mail mail = new Mail();
			mail.setFrom(SubSystemConfigFactory.get("COM.NOTICE.MAIL.SENDER"));
			mail.setSubject(noticeMailVO.getEmailTitle());
			mail.setRecipient(userEml);
			mail.setHtmlContent(noticeMailVO.getEmailContents());
			mail.setBatFlg("Z");
			mail.send();
		} catch (Exception e) {
			log.error("User Email is incorrect. ["+userEml+"]", e);
			log.error(StringUtilities.getErrorStackString(e));
		}
	}

	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @param userEml void
	 */
	public void sendNoticeMailBcc(NoticeMailVO noticeMailVO, String userEml) {
		String senderEmail = SubSystemConfigFactory.get("COM.NOTICE.MAIL.SENDER");
		try {
			Mail mail = new Mail();
			mail.setFrom(senderEmail);
			mail.setSubject(noticeMailVO.getEmailTitle());
			mail.setRecipient(senderEmail);
			mail.setBccRcvrEml(userEml);
			mail.setHtmlContent(noticeMailVO.getEmailContents());
			mail.setBatFlg("Z");
			mail.send();
		} catch (Exception e) {
			log.error("User Email is incorrect. ["+userEml+"]", e);
			log.error(StringUtilities.getErrorStackString(e));
		}
	}


}

