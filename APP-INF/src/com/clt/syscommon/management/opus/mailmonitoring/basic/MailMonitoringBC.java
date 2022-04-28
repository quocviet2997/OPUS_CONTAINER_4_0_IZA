/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.table.ComEmlSndInfoVO;

/**
 * MailMonitoringBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public interface MailMonitoringBC {

	/**
	 * 
	 * searchSendMailData
	 * @author Jeong-Hoon, KIM
	 * @param comEmlSndInfoVO
	 * @return
	 * @throws EventException List<ComEmlSndInfoVO>
	 */
	List<ComEmlSndInfoVO> searchSendMailData(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException;

}

