/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitringResendBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.basic;

import com.clt.framework.core.layer.event.EventException;

/**
 * MailMonitringResendBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 21.
 */
public interface MailMonitringResendBC {

	/**
	 * 
	 * resend
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws EventException String
	 */
	String resend(String emlSndNo) throws EventException;

}

