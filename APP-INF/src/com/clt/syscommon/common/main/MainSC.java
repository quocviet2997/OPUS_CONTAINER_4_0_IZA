/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : MainSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 5. 30.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.main;

import java.util.List;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.user.history.ComRctMnuAcssHis;
import com.clt.syscommon.common.main.basic.MainBC;
import com.clt.syscommon.common.main.basic.MainBCImpl;

/**
 * MainSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 5. 30.
 */
public class MainSC extends ServiceCommandSupport{

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws EventException EventResponse
	 */
	public EventResponse perform(Event event) throws EventException {
		SignOnUserAccount signOnUserAccount = getSignOnUserAccount();
		MainBC mainBC = new MainBCImpl();
		List<ComRctMnuAcssHis> comRctMnuAcssHiss = mainBC.inquireRecentHistory(signOnUserAccount);
		GeneralEventResponse generalEventResponse = new GeneralEventResponse();
		generalEventResponse.setCustomData("comRctMnuAcssHiss", comRctMnuAcssHiss);
		return generalEventResponse;
	}

}

