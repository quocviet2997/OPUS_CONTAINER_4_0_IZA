/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringSendSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.management.opus.mailmonitoring.basic.MailMonitringResendBC;
import com.clt.syscommon.management.opus.mailmonitoring.basic.MailMonitringResendBCImpl;

/**
 * MailMonitoringSendSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public class MailMonitoringSendSC extends ServiceCommandSupport {

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
		String emlSndNo = (String)event.getAttribute("eml_snd_no");
		MailMonitringResendBC mailResendBC = new MailMonitringResendBCImpl();
		try {
			begin();
			String resendedEmlSndNo = mailResendBC.resend(emlSndNo);
			eventResponse.setETCData("eml_snd_no", resendedEmlSndNo);
			commit();
		} catch (Exception e) {
			throw new EventException(e.getMessage(), e);
		}
		return eventResponse;
	}

}

