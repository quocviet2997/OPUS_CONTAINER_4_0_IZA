/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 9.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.management.opus.mail.vo.NoticeMailVO;

/**
 * NoticeMailBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 9.
 */
public interface NoticeMailBC {
	
	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @param userMail
	 * @throws EventException void
	 */
	public void sendNoticeMail(NoticeMailVO noticeMailVO, String userMail) throws EventException;
	
	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @throws EventException void
	 */
	public void sendNoticeMail(NoticeMailVO noticeMailVO) throws EventException;

	/**
	 * 
	 * getUserEmailList
	 * @author Jeong-Hoon, KIM
	 * @return
	 * @throws EventException List<String>
	 */
	public List<String> getUserEmailList() throws EventException;
}

