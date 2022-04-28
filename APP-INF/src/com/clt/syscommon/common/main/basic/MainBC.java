/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : MainBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 5. 30.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.main.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.user.history.ComRctMnuAcssHis;

/**
 * MainBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 5. 30.
 */
public interface MainBC {
	/**
	 * 
	 * inquireRecentHistory
	 * @author Jeong-Hoon, KIM
	 * @param signOnUserAccount
	 * @return
	 * @throws EventException List<ComRctMnuAcssHis>
	 */
	public List<ComRctMnuAcssHis> inquireRecentHistory(SignOnUserAccount signOnUserAccount) throws EventException;
}

