/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendIBMMQEAIDAO.java
*@FileTitle : Send Messahe IBM MQ EAIDAO
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.ibmmq.send;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.integration.alps.SynchWebServicesSampleDocument;
import com.clt.integration.alps.SynchWebServicesSampleDocument.SynchWebServicesSample;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.jms.send.vandor.IBMSendQClient;

/**
 * It's ASynch IBM MQ Listener 
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class SendIBMMQEAIDAO    extends DBDAOSupport {
	
//	public static void main(String[] args) {
//		SendIBMMQEAIDAO d = new SendIBMMQEAIDAO();
//		try {
//			d.searchCommodityInfoByCode("COM_SAM_001", "000001");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	
	/**
	 * IBM MQ<br>
	 * MDM Commodity Code에 따른 Commodity name을 비동기로 요청한다. . <br>
	 * 
	 * @param null
	 * @return void
	 * @throws IOException 
	 * @throws DAOException
	 */
    public String searchCommodityInfoByCode(String cmdtcd ) throws EAIException, IOException {
		String reString = "";

		// "SUBSYSTEM_NAME + "_" + BIZ Name + "_" + Sequesnce + ... ... <<DATE>>
		String integrationId = "SMPL_IBMMQ_0001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());

		/* System properties : classpath/properties/subsystem-config.properties */
		String target = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.URL");
		String transfertype = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.TRANSFERTYPE");
		String channel = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.CHANNEL");
		String factory = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.FACTORY");
		String queue = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.QUEUE");
		String targetclient = SubSystemConfigFactory.get("COM.SAMPLE.IBMMQ.SEND.TARGETCLIENT");

		// Send and Receive Object init 
		SynchWebServicesSampleDocument doc = SynchWebServicesSampleDocument.Factory.newInstance(); 
		SynchWebServicesSample synchwssample = doc.addNewSynchWebServicesSample();
		synchwssample.setCmdtCd("000001");

		TransferEAI eai = new IBMSendQClient(target, this.getClass());
		eai.setTransferType(transfertype);
		eai.setChannel(channel);
		eai.setFactory(factory);
		eai.setQueue(queue);
		eai.setTargetClient(targetclient);
		eai.setMessage(doc.toString());

		try {
			reString = eai.commit(integrationId); // <== EAI SEND QUEUE 방식에 따른
		} catch (EAIException ea) {
			eai.rollback(ea);
			log.error(ea.getMessage(), ea);
			throw new EAIException(new ErrorHandler(ea).getMessage());
		}
		eai.close();
		return reString;
	}
}
