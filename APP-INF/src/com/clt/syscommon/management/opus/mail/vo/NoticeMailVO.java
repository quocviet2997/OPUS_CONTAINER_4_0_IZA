/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailVO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 8.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.vo;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * NoticeMailVO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 8.
 */
public class NoticeMailVO{
	private String emailTitle;
	private String emailContents;
	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the emailTitle
	 */
	public String getEmailTitle() {
		return emailTitle;
	}
	/**
	 * It's Setter. String
	 * @param emailTitle the emailTitle to set
	 */
	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}
	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the emailContents
	 */
	public String getEmailContents() {
		return emailContents;
	}
	/**
	 * It's Setter. String
	 * @param emailContents the emailContents to set
	 */
	public void setEmailContents(String emailContents) {
		this.emailContents = emailContents;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setEmailTitle(JSPUtil.getParameter(request, "emailTitle"));
		setEmailContents(JSPUtil.getParameter(request, "emailContents"));
	}
}

