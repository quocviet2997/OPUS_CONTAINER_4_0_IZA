/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : GroupwarePopupMailLoggingProxy.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : May 28, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.syscommon.mail.servicesio;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;

import weblogic.jws.WLHttpTransport;

/** It's GroupwarePopupMailLoggingProxy.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 28, 2009
 */
@WebService(name="GroupwarePopupMailLoggingPortType", serviceName="GroupwarePopupMailLogging",
        targetNamespace="http://www.clt.com/integration/schedule")

@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
         use=SOAPBinding.Use.LITERAL,
         parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

@WLHttpTransport(contextPath="/opuscntr/webservices", serviceUri="/GroupwarePopupMailLogging",
             portName="GroupwarePopupMailLoggingPort")
public class GroupwarePopupMailLoggingProxy {
	

	protected transient Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * This method writes a log. 
	 * @author Jeong-Hoon, KIM
	 * @param groupwareReturnMsg
	 * @return String
	 * @throws IOException
	 */
	@WebMethod()
	public String groupwareUpdateResultLogging(String groupwareReturnMsg) throws IOException{
		log.info("Groupware Return Message");
		log.info("[groupwareReturnMsg]"+groupwareReturnMsg);
		return "OK";
	}
}
