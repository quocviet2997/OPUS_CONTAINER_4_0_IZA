/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailDBDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 10.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mail.integration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * NoticeMailDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 10.
 */
public class NoticeMailDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8931931373579332708L;

	/**
	 * 
	 * getUserEml
	 * @author Jeong-Hoon, KIM
	 * @return
	 * @throws SQLException
	 * @throws DAOException List<String>
	 */
	public List<String> getUserEml() throws SQLException, DAOException {
		DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new NoticeMailDAOGetBccReceiverEmailRSQL(), null, null);
		List<String> userEmlList = new ArrayList<String>();
		while(dbRowset.next()){
			userEmlList.add(dbRowset.getString("USR_EML"));
		}
		return userEmlList;
	}

	
}

