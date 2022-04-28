/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringDBDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.integration;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.table.ComEmlSndInfoVO;

/**
 * MailMonitoringDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public class MailMonitoringDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8988814504235158890L;

	/**
	 * 
	 * searchSendMailData
	 * @author Jeong-Hoon, KIM
	 * @param comEmlSndInfoVO
	 * @return
	 * @throws SQLException
	 * @throws DAOException
	 * @throws NoSuchMethodException List<ComEmlSndInfoVO>
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<ComEmlSndInfoVO> searchSendMailData(ComEmlSndInfoVO comEmlSndInfoVO) throws SQLException, DAOException, NoSuchMethodException {
		Map<String, String> map = comEmlSndInfoVO.getColumnValues();
		DBRowSet dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new MailMonitoringDAOSearchRSQL(), map, map);
		return (List)RowSetUtil.rowSetToVOs(dbRowSet, ComEmlSndInfoVO.class);	
	}

}

