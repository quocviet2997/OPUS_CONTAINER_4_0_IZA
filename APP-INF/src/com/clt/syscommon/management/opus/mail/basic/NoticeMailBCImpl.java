/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailBCImpl.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 9.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.management.opus.mail.integration.NoticeMailDBDAO;
import com.clt.syscommon.management.opus.mail.integration.NoticeMailEAIDAO;
import com.clt.syscommon.management.opus.mail.vo.NoticeMailVO;

/**
 * 
 * NoticeMailBCImpl.java
 * 
 * @author Jeong-Hoon, KIM
 * @see
 * @since J2SE 1.6 2016. 4. 11.
 */
public class NoticeMailBCImpl extends BasicCommandSupport implements NoticeMailBC {
	private transient NoticeMailDBDAO noticeMailDBDAO;

	/**
	 * 
	 * It's Constructor
	 * 
	 * @author Jeong-Hoon, KIM
	 */
	public NoticeMailBCImpl() {
		noticeMailDBDAO = new NoticeMailDBDAO();
	}

	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @param userEml
	 * @throws EventException void
	 */
	public void sendNoticeMail(NoticeMailVO noticeMailVO, String userEml) throws EventException {
		NoticeMailEAIDAO noticeMailEAIDAO = new NoticeMailEAIDAO();
		noticeMailEAIDAO.sendNoticeMailBcc(noticeMailVO, userEml);
	}
	
	/**
	 * 
	 * getUserEmailList
	 * @author Jeong-Hoon, KIM
	 * @return
	 * @throws EventException List<String>
	 */
	public List<String> getUserEmailList() throws EventException {
		try {
			return noticeMailDBDAO.getUserEml();
		} catch (Exception e) {
			throw new EventException(new ErrorHandler(e).getMessage(), e);
		}
	}

	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @throws EventException void
	 */
	public void sendNoticeMail(NoticeMailVO noticeMailVO) throws EventException {
		List<String> userEmailList = getUserEmailList();
		List<String> emailGroupList = separateList(userEmailList, 900);
		sendNoticeMail(noticeMailVO, emailGroupList);
	}

	/**
	 * 
	 * separateList
	 * @author Jeong-Hoon, KIM
	 * @param userEmailList
	 * @param groupCount
	 * @return List<String>
	 */
	private List<String> separateList(List<String> userEmailList, int groupCount) {
		
		int countMail = 0;
		List<String> separatedMailGroupList = new ArrayList<String>();
		
		StringBuilder userEmailBuilder = new StringBuilder();
		for(String userEmail : userEmailList){
			countMail++;
			userEmailBuilder.append(userEmail);
			userEmailBuilder.append(";");
			if(countMail == groupCount){
				separatedMailGroupList.add(userEmailBuilder.toString());
				countMail = 0;
				userEmailBuilder = new StringBuilder();
			}
		}
		separatedMailGroupList.add(userEmailBuilder.toString());
		return separatedMailGroupList;
	}

	/**
	 * 
	 * sendNoticeMail
	 * @author Jeong-Hoon, KIM
	 * @param noticeMailVO
	 * @param userEmailList
	 * @throws EventException void
	 */
	private void sendNoticeMail(NoticeMailVO noticeMailVO, List<String> userEmailList) throws EventException {
		for(String userEmail:userEmailList){
			sendNoticeMail(noticeMailVO, userEmail);
		}
	}

}
