/*========================================================
 *Copyright(c) 2009 CyberLogitec
 *ProcessChain    : NPI
 *@FileName       : GroupwareMailPopupExecuteBCImpl.java
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
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.groupwaremail.integration.GroupwareMailPopupExecuteEAIDAO;

/**
 * It's GroupwareMailPopupExecuteBCImpl.java
 * 
 * @author Jeong-Hoon, KIM
 * @see
 * @since J2EE 1.5 May 26, 2009
 */
public class GroupwareMailPopupExecuteBCImpl extends BasicCommandSupport implements GroupwareMailPopupExecuteBC {

	/**
	 * Groupware의 Popup을 띄운다.
	 * @author Jeong-Hoon, KIM
	 * @param gwSubject
	 * @param gwContents
	 * @param account
	 * @return String
	 * @throws EventException
	 * @throws DAOException
	 * @throws SQLException
	 */
	public String popGroupwareWindow(String gwSubject, String gwContents, SignOnUserAccount account) throws EventException, DAOException,
			SQLException {
		GroupwareMailPopupExecuteEAIDAO eaidao = new GroupwareMailPopupExecuteEAIDAO();
		return eaidao.popGroupwareWindow(gwSubject, gwContents, account);
	}
}
