/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : BackEndJobSampleDBDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.backendjob.thread.integer;

import java.sql.SQLException;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * It's BackEndJobSampleDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 21.
 */
public class BackEndJobSampleDBDAO extends DBDAOSupport{
	/**
	 * MDM Vandor 테이블의 값을 가져온다.
	 * @author Jeong-Hoon, KIM
	 * @return
	 * @throws DAOException 
	 * @throws SQLException 
	 */
	public DBRowSet searchMdmVandor() throws SQLException, DAOException{
		return new SQLExecuter().executeQuery(new BackEndJobSampleDAOMdmVandorRSQL(),null,null);
	}

}
