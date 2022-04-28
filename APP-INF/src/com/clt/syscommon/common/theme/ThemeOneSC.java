/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : ThemeSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 4. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.theme;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.theme.basic.ThemeBC;
import com.clt.syscommon.common.theme.basic.ThemeBCImpl;

/**
 * ThemeSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 4. 16.
 */
public class ThemeOneSC extends ServiceCommandSupport {

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param ev
	 * @return
	 * @throws EventException EventResponse
	 */
	public EventResponse perform(Event ev) throws EventException {
		SignOnUserAccount signOnUserAccount = ev.getSignOnUserAccount();
		String userId = signOnUserAccount.getUsr_id();
		ThemeBC themeBC = new ThemeBCImpl();
		themeBC.updateThemeOne(userId);
		return new GeneralEventResponse();
	}

}

