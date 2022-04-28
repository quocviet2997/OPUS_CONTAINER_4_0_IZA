/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSampleBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail.basic;

import com.clt.framework.core.layer.event.Event;

/**
 * It's RDMailSampleBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public interface RDMailSampleBC {

	/**
	 * This method sends RDMails. 
	 * @author Jeong-Hoon, KIM
	 * @param ev 
	 */
	String send(Event ev);

}
