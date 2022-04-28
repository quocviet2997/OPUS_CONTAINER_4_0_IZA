/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail;

import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.sample.mail.rdmail.basic.RDMailSampleBC;
import com.clt.sample.mail.rdmail.basic.RDMailSampleBCImpl;

/**
 * It's RDMailSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public class RDMailSampleSC extends ServiceCommandSupport{

	/**
	 * RDMail Sample 의 SC.
	 */
	public EventResponse perform(Event ev) throws EventException {
		if(ev.getEventName().equalsIgnoreCase("RDMailSampleEvent")){
			begin();			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			RDMailSampleBC rdMailSampleBC = new RDMailSampleBCImpl();
			eventResponse.setCustomData(SubSystemConfigFactory.get("COM.MAIL.KEYS"), rdMailSampleBC.send(ev));
			commit();
			return eventResponse;
		}
		return null;
	}
}
