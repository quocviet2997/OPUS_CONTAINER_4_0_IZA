/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendWebLogicJMSQueueEAIDAO.java
*@FileTitle : Send WebLogic JMS Queue EAIDAO
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.jms.send;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.integration.alps.SynchWebServicesSampleDocument;
import com.clt.integration.alps.SynchWebServicesSampleDocument.SynchWebServicesSample;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.jms.send.vandor.WeblogicSendQClient;

/**
 * It's ASynch JMS Listener 
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class SendWebLogicJMSQueueEAIDAO    extends DBDAOSupport {
	
	public static void main(String[] args) {
		SendWebLogicJMSQueueEAIDAO logicJMSQueueEAIDAO = new SendWebLogicJMSQueueEAIDAO();
		try {
			logicJMSQueueEAIDAO.searchCommodityInfoByCode("COM_SAM_001", "000001");
		} catch (DAOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	/**
	 * JMS <br>
	 * MDM Commodity Code에 따른 Commodity name을 비동기로 요청한다. . <br>
	 * 
	 * @param null
	 * @return void
	 * @throws DAOException
	 */
	public String searchCommodityInfoByCode(String destnmae, String cmdtcd ) throws DAOException {

		String reString = "";
		TransferEAI eai 						= null;

		String sendUrl = "";
		String factory							= "";
		String queue = "";

		try{
			// "SUBSYSTEM_NAME + "_" + BIZ Name + "_" + Sequesnce + ... ... <<DATE>>
			String integrationId = "SMPL_JMS_0001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());

			sendUrl = SubSystemConfigFactory.get("COM.SAMPLE.JMS.SEND.URL");
			factory = SubSystemConfigFactory.get("COM.SAMPLE.JMS.SEND.FACTORY");
			queue = SubSystemConfigFactory.get("COM.SAMPLE.JMS.SEND.QUEUE");

			// Send and Receive Object init 
			SynchWebServicesSampleDocument doc = SynchWebServicesSampleDocument.Factory.newInstance(); 
			SynchWebServicesSample synchwssample = doc.addNewSynchWebServicesSample();
			synchwssample.setCmdtCd(cmdtcd);

	        eai = new WeblogicSendQClient(sendUrl, this.getClass()); // LOCAL TEST
	        eai.setFactory(factory); 
	        eai.setQueue(queue); 
//	        eai.setJmsType("EAIJMS_SAQ_006");		// This method was deprecated 
	        eai.setDestination(destnmae);	// queue-mapping.xml 맵핑 정의
//	        eai.setMessage(doc);					// bind message It is using for string message objects. 
	        eai.setObj(doc);						// The Object convert a String by toString() method in Connector Module. 
	        
	        reString = eai.commit(integrationId);
		
		} catch (EAIException e) {
			eai.rollback(e);
	    	log.error("EAIException : " + e.getMessage(),e);
	        throw new DAOException(e.getMessage());
		} catch (Exception e) {
			eai.rollback(e);
			log.error("Exception : " + e.getMessage(),e);
			throw new DAOException(e.getMessage());
		}finally{
			eai.close();
		}
		return reString;
	}
  
}
