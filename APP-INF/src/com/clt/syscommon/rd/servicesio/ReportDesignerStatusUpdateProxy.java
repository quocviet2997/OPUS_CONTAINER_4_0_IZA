/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : ReportDesignerStatusUpdateProxy.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Feb 16, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.rd.servicesio;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import weblogic.jws.WLHttpTransport;

import com.clt.framework.component.rdmail.servicesio.ReportDesignerStatusUpdate;

/**
 * It's ReportDesignerStatusUpdateProxy.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Feb 23, 2009
 */
@WebService(name="ReportDesignerStatusUpdatePortType", serviceName="ReportDesignerStatusUpdate",
        targetNamespace="http://www.clt.com/integration/schedule")

@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
         use=SOAPBinding.Use.LITERAL,
         parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

@WLHttpTransport(contextPath="/opuscntr/webservices", serviceUri="/ReportDesignerStatusUpdate",
             portName="ReportDesignerStatusUpdatePort")
public class ReportDesignerStatusUpdateProxy extends ReportDesignerStatusUpdate {
	
	/**
	 * This method updates a status 
	 * @author Jeong-Hoon, KIM
	 * @param sendNo
	 * @param type
	 * @param status
	 * @param exportErrorMessage
	 * @return String
	 */
	@WebMethod()
	public String updateStatus(String sendNo ,String type ,String status, String exportErrorMessage) {
		return super.updateStatus(sendNo, type, status, exportErrorMessage);
	}
}
