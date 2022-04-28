/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringDBDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.integration;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public class MqInboundMonitoringDBDAO {

	/**
	 * 
	 * searchMqInboundMonitoringList
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVO
	 * @return
	 * @throws SQLException
	 * @throws DAOException
	 * @throws NoSuchMethodException List<MqInboundMonitoringSearchVO>
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<MqInboundMonitoringSearchVO> searchMqInboundMonitoringList(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO) throws SQLException, DAOException, NoSuchMethodException {
		Map<String, String> map = mqInboundMonitoringSearchVO.getColumnValues();
		DBRowSet dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new MqInboundMonitoringDAOSearchRSQL(), map, map);
		return (List)RowSetUtil.rowSetToVOs(dbRowSet, MqInboundMonitoringSearchVO.class);		
	}

	/**
	 * 
	 * searchMqInboundMonitoringFailedList
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVO
	 * @return
	 * @throws SQLException
	 * @throws DAOException
	 * @throws NoSuchMethodException List<MqInboundMonitoringSearchVO>
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<MqInboundMonitoringSearchVO> searchMqInboundMonitoringFailedList(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO) throws SQLException, DAOException, NoSuchMethodException {
		Map<String, String> map = mqInboundMonitoringSearchVO.getColumnValues();
		DBRowSet dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new MqInboundMonitoringDAOFailedSearchRSQL(), map, map);
		return (List)RowSetUtil.rowSetToVOs(dbRowSet, MqInboundMonitoringSearchVO.class);	
	}

	/**
	 * 
	 * searchMqInboundMonitoringSendingList
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVO
	 * @return
	 * @throws SQLException
	 * @throws DAOException
	 * @throws NoSuchMethodException List<MqInboundMonitoringSearchVO>
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<MqInboundMonitoringSearchVO> searchMqInboundMonitoringSendingList(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO) throws SQLException, DAOException, NoSuchMethodException {
		Map<String, String> map = mqInboundMonitoringSearchVO.getColumnValues();
		DBRowSet dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new MqInboundMonitoringDAOSendingSearchRSQL(), map, map);
		return (List)RowSetUtil.rowSetToVOs(dbRowSet, MqInboundMonitoringSearchVO.class);	
	}

}

