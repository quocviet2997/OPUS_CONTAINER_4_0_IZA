/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : ThemeDBDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 4. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.theme.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * ThemeDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 4. 16.
 */
public class ThemeDBDAO extends DBDAOSupport {

	/**
	 * 
	 * updateThemeOne
	 * @author Jeong-Hoon, KIM
	 * @param userId void
	 * @throws DAOException 
	 * @throws SQLException 
	 */
	public void updateThemeDelete(String userId) throws SQLException, DAOException {
		Map<String, String> mapParam = new HashMap<String, String>();
		mapParam.put("USR_ID", userId);
		new SQLExecuter().executeUpdate(new ThemeDBDAOUserDSQL(), mapParam, mapParam);
	}

	/**
	 * 
	 * updateThemeUpdateOne
	 * @author Jeong-Hoon, KIM
	 * @param userId
	 * @throws SQLException
	 * @throws DAOException void
	 */
	public void updateThemeUpdateOne(String userId) throws SQLException, DAOException {
		Map<String, String> mapParam = new HashMap<String, String>();
		mapParam.put("USR_ID", userId);
		new SQLExecuter().executeUpdate(new ThemeDBDAOOneISQL(), mapParam, mapParam);
	}

	/**
	 * 
	 * updateThemeTwo
	 * @author Jeong-Hoon, KIM
	 * @param userId
	 * @throws SQLException
	 * @throws DAOException void
	 */
	public void updateThemeUpdateTwo(String userId) throws SQLException, DAOException {
		Map<String, String> mapParam = new HashMap<String, String>();
		mapParam.put("USR_ID", userId);
		new SQLExecuter().executeUpdate(new ThemeDBDAOTwoISQL(), mapParam, mapParam);
	}

}

