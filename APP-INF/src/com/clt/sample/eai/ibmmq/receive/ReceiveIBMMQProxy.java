/**
 * 
 */
package com.clt.sample.eai.ibmmq.receive;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.clt.bizcommon.BizCommonSC;
import com.clt.bizcommon.commodity.event.ComEns011Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.sample.eai.webservices.synch.provider.servicesio.SampleVO;
import com.clt.integration.alps.SynchWebServicesSampleResponseDocument;
import com.clt.integration.alps.SynchWebServicesSampleResponseDocument.SynchWebServicesSampleResponse;
import com.jf.transfer.TransferEAI;

/**
 * It's ReceiveIBMMQProxy.java
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class ReceiveIBMMQProxy {
	
	protected transient Logger log = Logger.getLogger(this.getClass().getName());

	/**
	 * MQ Receive Example (return commodity name by code) ! 
	 * @param TransferEAI : message include code of commodity 
	 * @return void
	 * @throws DAOException 
	 */
	public void ibmMQSample(  TransferEAI eai ) throws DAOException 
	{
		
		String str = eai.getMessage();
		log.debug("======================================");		
		log.debug("xml : " + str);
		log.debug("======================================");
		
		SynchWebServicesSampleResponseDocument docRes = null;
		BizCommonSC bizComSC = new BizCommonSC();
		
		try {
			
			/**
			 * IBM MQ인경우는 일반적으로 메세지 형태가 xml 형식이 아니어서 integration id가 따로 메시지에 
			 * 등록되어 있지 않아 임의로 추가한다. 
			 */
			String integrationId = "SMPL_MQ_0001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());
			
			docRes = SynchWebServicesSampleResponseDocument.Factory.parse( str );
			SynchWebServicesSampleResponse syWsResponse = docRes.getSynchWebServicesSampleResponse();
		
			SampleVO sv = syWsResponse.getReturn();
	        log.debug(">> " + sv.getCmdtCd());
	        log.debug(">> " + sv.getCmdtNm() );
	        log.debug(">> " + sv.getRepCmdtCd() );
	        log.debug(">> " + sv.getRepImdgLvlCd() );
	        String cmdt_cd = sv.getCmdtCd();
	
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
