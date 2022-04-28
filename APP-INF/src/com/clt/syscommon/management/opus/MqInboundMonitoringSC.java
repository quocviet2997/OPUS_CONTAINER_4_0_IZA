/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.management.opus.mqinboundmonitoring.basic.MqInboundMonitoringBC;
import com.clt.syscommon.management.opus.mqinboundmonitoring.basic.MqInboundMonitoringBCImpl;
import com.clt.syscommon.management.opus.mqinboundmonitoring.event.MqInboundMonitoringEvent;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public class MqInboundMonitoringSC extends ServiceCommandSupport{

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param ev
	 * @return
	 * @throws EventException EventResponse
	 */
	public EventResponse perform(Event ev) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		if (ev.getEventName().equalsIgnoreCase("MqInboundMonitoringEvent")) {
			MqInboundMonitoringEvent mqInboundMonitoringEvent = (MqInboundMonitoringEvent)ev;
			MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO = mqInboundMonitoringEvent.getMqInboundMonitoringSearchVO();
			if (ev.getFormCommand().isCommand(FormCommand.SEARCH01)) { 
				MqInboundMonitoringBC mqInboundMonitoringBC = new MqInboundMonitoringBCImpl(); 
				eventResponse.setRsVoList(mqInboundMonitoringBC.searchMqInboundMonitoringList(mqInboundMonitoringSearchVO));
			}
		}
		return eventResponse;
	}

}

