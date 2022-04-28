/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringEvent.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public class MqInboundMonitoringEvent extends EventSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4673009660310783142L;
	
	private MqInboundMonitoringSearchVO MqInboundMonitoringSearchVO;

	/**
	 * It's Getter. 
	 * @returnType MqInboundMonitoringSearchVO
	 * @return the MqInboundMonitoringSearchVO
	 */
	public MqInboundMonitoringSearchVO getMqInboundMonitoringSearchVO() {
		return MqInboundMonitoringSearchVO;
	}

	/**
	 * It's Setter. MqInboundMonitoringSearchVO
	 * @param MqInboundMonitoringSearchVO the MqInboundMonitoringSearchVO to set
	 */
	public void setMqInboundMonitoringSearchVO(MqInboundMonitoringSearchVO MqInboundMonitoringSearchVO) {
		this.MqInboundMonitoringSearchVO = MqInboundMonitoringSearchVO;
	} 

}

