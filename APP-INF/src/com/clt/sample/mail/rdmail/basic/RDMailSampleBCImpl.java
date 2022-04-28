/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSampleBCImpl.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail.basic;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.sample.mail.rdmail.integration.RDMailSampleEAIDAO;

/**
 * It's RDMailSampleBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public class RDMailSampleBCImpl extends BasicCommandSupport implements RDMailSampleBC {

	/**
	 * Rd Mail Sample의 BC.
	 */
	public String send(Event ev) {
		RDMailSampleEAIDAO rdMailSampleEAIDAO = new RDMailSampleEAIDAO();
		return rdMailSampleEAIDAO.send(ev);
	}

}
