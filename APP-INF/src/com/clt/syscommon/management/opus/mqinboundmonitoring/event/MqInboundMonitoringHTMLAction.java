/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringHTMLAction.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public class MqInboundMonitoringHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3153712831265959576L;

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param request
	 * @return
	 * @throws HTMLActionException Event
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
    	MqInboundMonitoringEvent inboundMonitoringEvent = new MqInboundMonitoringEvent();
		if(command.isCommand(FormCommand.SEARCH01)) {
			MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO = (MqInboundMonitoringSearchVO)getVO(request, MqInboundMonitoringSearchVO.class);
			inboundMonitoringEvent.setMqInboundMonitoringSearchVO(mqInboundMonitoringSearchVO);
		}
		return inboundMonitoringEvent;
	}

}

