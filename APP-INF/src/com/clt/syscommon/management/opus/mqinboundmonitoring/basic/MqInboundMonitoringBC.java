/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.basic;

import java.sql.SQLException;
import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public interface MqInboundMonitoringBC {

	/**
	 * 
	 * searchMqInboundMonitoringList
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVO
	 * @return DBRowSet
	 * @throws DAOException 
	 * @throws SQLException 
	 * @throws EventException 
	 */
	List<MqInboundMonitoringSearchVO> searchMqInboundMonitoringList(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO) throws EventException;

}

