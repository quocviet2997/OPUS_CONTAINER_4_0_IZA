/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : MainHTMLAction.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 5. 30.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.main.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;

/**
 * MainHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 5. 30.
 */
public class MainHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 289968645178537593L;

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param httpServletRequest
	 * @return
	 * @throws HTMLActionException Event
	 */
	public Event perform(HttpServletRequest httpServletRequest) throws HTMLActionException {
		MainEvent recentHistoryEvent = new MainEvent();
		return recentHistoryEvent;
	}

}

