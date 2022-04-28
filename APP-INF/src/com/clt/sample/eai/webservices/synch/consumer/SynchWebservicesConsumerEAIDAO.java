/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SynchWebservicesConsumerEAIDAO.java
*@FileTitle : Synch Webservices Consumer EAI DAO
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.webservices.synch.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.integration.alps.SynchWebServicesSampleDocument;
import com.clt.integration.alps.SynchWebServicesSampleDocument.SynchWebServicesSample;
import com.clt.integration.alps.SynchWebServicesSampleResponseDocument.SynchWebServicesSampleResponse;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.ws.AxDocClient;

/**
 * It's Synch Webservices Consumer 
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class SynchWebservicesConsumerEAIDAO {
	
	
	public static void main(String[] args) {
		SynchWebservicesConsumerEAIDAO e = new SynchWebservicesConsumerEAIDAO();
		try {
			e.searchCommodityInfoByCode("000001");
		} catch (DAOException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
		}
	}
	/**
	 * Web Service 연동 / 싱크<br>
	 * MDM Commodity Code에 따른 Commodity name을 리턴한다. <br>
	 * 
	 * @param null
	 * @return void
	 * @throws DAOException
	 */
	public String searchCommodityInfoByCode(String cmdtcd) throws DAOException {

		TransferEAI eai 						= null;
		String reString 						= "";
		SynchWebServicesSampleResponse syWsResponse = null;
		
		try {

			/**
			 * WebServices 메시지인 경우 Hanjin 은 instance id를 따로 선언함이 없이 메시지에 포함되어 있다. 
			 * 따라서 eai.commit()의 instance id는 아래와 선언해서 사용하지 않고 메시지로 부터 추출하여 사용한다.
			 * eai.commit(doc.getESD0500001().getEAIHeader().getInstanceId());  
			 */
			String integrationId = "SMPL_WS_0001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());

			String target = SubSystemConfigFactory.get("COM.SAMPLE.WS.SYNCH.CONSUMER.WSDL");

			// Send and Receive Object init 
			SynchWebServicesSampleDocument doc = SynchWebServicesSampleDocument.Factory.newInstance(); 
			SynchWebServicesSample synchwssample = doc.addNewSynchWebServicesSample();
			synchwssample.setCmdtCd(cmdtcd);

            eai = new AxDocClient(target, this.getClass());
            	
			// XML형식의 데이타셋으로 만든다.
			eai.setObj(doc);

			// "SUBSYSTEM_NAME + "_" + BIZ Name + "_" + Sequesnce + ... ... <<DATE>>
			reString = eai.commit("SMPL_SWS_0001"+ (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date())); //<== EAI SEND QUEUE 방식에 따른 연동 ID부여를 준용한다.

//            System.out.println(" SynchWebServicesSampleResponse -----------reString------------ \n\n" + reString );
			
			// Response (Receive message from target) -------start-------
			
		} catch (EAIException e) {
			eai.rollback(e);
//        	System.out.println(e.getMessage());
            throw new DAOException(e.getMessage());
		} catch (Exception e) {
			eai.rollback(e);
//			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage());
		}
		eai.close();
		return reString;
	}
}
