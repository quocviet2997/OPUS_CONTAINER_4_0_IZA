/*========================================================
 *Copyright(c) 2009 CyberLogitec
 *ProcessChain    : NPI
 *@FileName       : GroupwareWebServiceCaller.java
 *@FileTitle      : NIS2010
 *Open Issues     :
 *Change history  :
 *@LastModifyDate : Jul 29, 2009
 *@LastModifier   : Jeong-Hoon, KIM
 *@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.sample.groupwarepopup;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import com.clt.integration.schedule.GroupwareUpdateResultLoggingDocument;
import com.clt.integration.schedule.GroupwareUpdateResultLoggingResponseDocument;
import com.clt.integration.schedule.GroupwareUpdateResultLoggingDocument.GroupwareUpdateResultLogging;
import com.clt.integration.schedule.GroupwareUpdateResultLoggingResponseDocument.GroupwareUpdateResultLoggingResponse;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.ws.AxDocClient;

/**
 * It's GroupwareWebServiceCaller.java
 * 
 * @author Jeong-Hoon, KIM
 * @see
 * @since J2EE 1.5 Jul 29, 2009
 */
public class GroupwareWebServiceCaller {
	public static void main(String[] args) throws EAIException, XmlException {

		String target = "http://203.246.142.84:9001/opuscntr/webservices/GroupwarePopupMailLogging?WSDL";
		TransferEAI transferEAI = new AxDocClient(target, GroupwareWebServiceCaller.class);
		GroupwareUpdateResultLoggingDocument document = GroupwareUpdateResultLoggingDocument.Factory.newInstance();
		GroupwareUpdateResultLogging groupwareUpdateResultLogging = document.addNewGroupwareUpdateResultLogging();
		groupwareUpdateResultLogging.setGroupwareReturnMsg("1234");
		transferEAI.setObj(document);
		String restring = transferEAI.commit("SMPL_SWS_0001"+ (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date()));
		GroupwareUpdateResultLoggingResponseDocument document2 = GroupwareUpdateResultLoggingResponseDocument.Factory.parse(restring);
		GroupwareUpdateResultLoggingResponse groupwareUpdateResultLoggingResponse = document2.getGroupwareUpdateResultLoggingResponse();
		Logger.getLogger(GroupwareWebServiceCaller.class.getName()).debug(groupwareUpdateResultLoggingResponse.getReturn());
	}
}
