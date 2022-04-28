/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : GroupwareMailPopupExecuteBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : May 26, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.syscommon.common.groupwaremail.basic;

import java.sql.SQLException;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/** It's GroupwareMailPopupExecuteBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 26, 2009
 */
public interface GroupwareMailPopupExecuteBC {

	/**This method opens a popup.
	 * @author Jeong-Hoon, KIM
	 * @param gwSubject
	 * @param gwContents
	 * @param account
	 * @return
	 * @throws SQLException 
	 */
	String popGroupwareWindow(String gwSubject, String gwContents,
			SignOnUserAccount account)  throws EventException, DAOException, SQLException;

}
