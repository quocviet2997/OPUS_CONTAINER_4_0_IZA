/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : GroupwareMailPopupEvent.java
*@FileTitle : Groupware_Mail_Popup
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.26 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.groupwaremail.event;

import com.clt.framework.support.layer.event.EventSupport;


/**
 * Groupware_Mail_Popup 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  Groupware_Mail_PopupHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Groupware_Mail_PopupHTMLAction 참조
 * @since J2EE 1.6
 */

public class GroupwareMailPopupEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	private String gwSubject;
	private String gwContents;
	

	/**This method sets a GwSubject
	 * @author Jeong-Hoon, KIM
	 * @param parameter
	 */
	public void setGwSubject(String gwSubject) {
		this.gwSubject = gwSubject;
	}
	
	/**
	 * This method gets a GwSubject. 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getGwSubject() {
		return gwSubject;
	}
	
	/**This method sets a GwContents
	 * @author Jeong-Hoon, KIM
	 * @param parameter
	 */
	public void setGwContents(String gwContents) {
		this.gwContents = gwContents;
	}
	
	/**
	 * This method gets a GwContents
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getGwContents() {
		return gwContents;
	}
}