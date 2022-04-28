/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : SendFileBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Sep 4, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.sample.ftp.send.basic;

import com.clt.framework.component.ftp.FtpException;
import com.clt.framework.table.ComFtpSndInfoVO;

/** It's SendFileBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Sep 4, 2009
 */
public interface SendFileBC {

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param comFtpSndInfoVO
	 * @return
	 */
	String sendFile(ComFtpSndInfoVO comFtpSndInfoVO) throws FtpException;

}
