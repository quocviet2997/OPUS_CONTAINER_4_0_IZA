/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring;

import java.util.List;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.basic.MailMonitoringBC;
import com.clt.syscommon.management.opus.mailmonitoring.basic.MailMonitoringBCImpl;

/**
 * MailMonitoringSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public class MailMonitoringSC extends ServiceCommandSupport{

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws EventException EventResponse
	 */
	public EventResponse perform(Event event) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ComEmlSndInfoVO comEmlSndInfoVO  = (ComEmlSndInfoVO)event.getAttribute("ComEmlSndInfoVO");
		MailMonitoringBC mailMonitoringBC = new MailMonitoringBCImpl();
		List<ComEmlSndInfoVO> comEmlSndInfoVOs = mailMonitoringBC.searchSendMailData(comEmlSndInfoVO);
		eventResponse.setRsVoList(comEmlSndInfoVOs);
		return eventResponse;
	}

}

