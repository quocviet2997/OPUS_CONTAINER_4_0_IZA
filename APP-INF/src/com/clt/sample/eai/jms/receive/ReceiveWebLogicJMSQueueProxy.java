/* =========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ReceiveWebLogicJMSQueueProxy.java
*@FileTitle : Receive WebLogic JMS Queue Proxy
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.jms.receive;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.clt.bizcommon.BizCommonSC;
import com.clt.bizcommon.commodity.event.ComEns011Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.integration.alps.SynchWebServicesSampleDocument;
import com.clt.integration.alps.SynchWebServicesSampleDocument.SynchWebServicesSample;
import com.jf.transfer.TransferEAI;

/**
 * It's ReceiveWebLogicJMSQueueProxy.java
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class ReceiveWebLogicJMSQueueProxy {
	
	protected transient Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * JMS Receive Example (return commodity name by code) ! 
	 * @param TransferEAI : message include code of commodity 
	 * @return void
	 * @throws DAOException 
	 */
	public void webLogicJMSSample( TransferEAI eai ) throws DAOException 
	{
		
		String str = eai.getMessage();
		log.debug("======================================");		
		log.debug("xml : " + str);
		log.debug("======================================");
		
		SynchWebServicesSampleDocument docRes = null;
		BizCommonSC bizComSC = new BizCommonSC();
		
		try {
			
			/**
			 * JMS 메시지인 경우 Hanjin 은 instance id를 따로 선언함이 없이 메시지에 포함되어 있다. 
			 * 따라서 eai.commit()의 instance id는 아래와 선언해서 사용하지 않고 메시지로 부터 추출하여 사용한다.
			 * eai.commit(doc.getESD0500001().getEAIHeader().getInstanceId());  
			 */
			String integrationId = "SMPL_JMS_0001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());

			docRes = SynchWebServicesSampleDocument.Factory.parse( str );
			SynchWebServicesSample syWsResponse = docRes.getSynchWebServicesSample();
		
	        String cmdt_cd = syWsResponse.getCmdtCd();
	
			// ========= Validation Parameters for WebServices ========= 
			if( cmdt_cd == null || cmdt_cd.equals("") )
			{
				throw new EventException("Parameter is not valided !");
			}else if( cmdt_cd.length() < 6 )
			{
				throw new EventException("Parameter is too short !");
			}
			// ========= Validation Parameters for WebServices ========= 
	
	
			// =DAOException======== Command Add ===============
			FormCommand f = new FormCommand();
			f.setCommand(FormCommand.SEARCH01);
			// ========= Command Add ===============
			
			ComEns011Event event = new ComEns011Event(cmdt_cd, "", "", "", 0);
	        event.setFormCommand(f);
        
	        /**
	         * SC를 호출한다. 
	         */
	        bizComSC.perform(event);

			eai.commit(integrationId);

             
		} catch (Exception e) {
			eai.rollback(e);
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		}
		eai.close();
      }

}
