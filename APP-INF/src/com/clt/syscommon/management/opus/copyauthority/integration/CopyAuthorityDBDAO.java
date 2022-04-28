/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryDBDAO.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.copyauthority.integration;

import java.util.HashMap;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.accesshistory.basic.AccessHistoryBCImpl;


/**
 * ALPS AccessHistoryDBDAO <br>
 * - ALPS-AccessHistory system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author kyungbum kim
 * @see AccessHistoryBCImpl 참조
 * @since J2EE 1.6
 */
public class CopyAuthorityDBDAO extends DBDAOSupport {

	/**
	 * Authority 정보를  copy합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @exception DAOException
	 */
	public void copyAuthority(HashMap<String, String> param) throws DAOException {
		int cnt = 0;
		SQLExecuter exe = new SQLExecuter("SysComDB");
		try{
			if ( param.get("opt").equals("del") ) {
				if ( param.get("RAP") != null && param.get("RAP").equals("on") ) {
					cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAORoleDSQL(), param, param);
					cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOmodifyRoleHisUSQL(), param, param);
					cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOProgramDSQL(), param, param);
				}
				if ( param.get("SUR") != null && param.get("SUR").equals("on") ) 
					cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOSuperUserRoleDSQL(), param, param);
				if ( param.get("OC") != null && param.get("OC").equals("on") ) 
					cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOOfcChgDSQL(), param, param);
			}
			if ( param.get("RAP") != null && param.get("RAP").equals("on") ) {
				cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOaddRoleHisCSQL(), param, param);
				cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOaddRoleCSQL(), param, param);
				cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOaddProgramCSQL(), param, param);
			}
			if ( param.get("SUR") != null && param.get("SUR").equals("on") ) 
				cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOSuperUserRoleCSQL(), param, param);
			if ( param.get("OC") != null && param.get("OC").equals("on") ) 
				cnt += exe.executeUpdate((ISQLTemplate)new CopyAuthorityDAOOfcChgCSQL(), param, param);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

}