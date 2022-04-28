/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FaxSendEAIDAO.java
*@FileTitle : Send Fax JMS Queue EAIDAO
*Open Issues :
*Change history :
*@LastModifyDate : 2014-12-08
*@LastModifier : SW Jean
*@LastVersion : 1.0
* 2009-09-07 SW Jean
* 1.0 Creation
--------------------------------------------------------
* History 
* 2014.12.08  전상화 		   
=========================================================*/
package com.clt.syscommon.management.opus.faxmanagement.integration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.clt.framework.component.rdmail.RDConfig;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.EAIDAOSupport;

import com.clt.irep.com.COM001TRANSFERMESSAGEDocument;

import com.clt.irep.com.COM001TRANSFERMESSAGEDocument.COM001TRANSFERMESSAGE;
import com.clt.irep.com.COM001TRANSFERMESSAGEDocument.COM001TRANSFERMESSAGE.DataArea;
import com.clt.irep.com.COM001TRANSFERMESSAGEDocument.COM001TRANSFERMESSAGE.DataArea.TRANSFERINFO;
import com.clt.irep.com.COM001TRANSFERMESSAGEDocument.COM001TRANSFERMESSAGE.DataArea.TRANSFERINFO.SENDITEM;

import com.clt.irep.com.EAIHeaderType;
import com.clt.irep.com.EAIHeaderType.Parameters;
import com.clt.irep.com.EAIHeaderType.Parameters.Parameter;

import com.clt.syscommon.management.opus.faxmanagement.vo.FaxMgmtCondVO;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.jms.send.vandor.WeblogicSendQClient;


/**
 * ALPS FASendEAIDAO <br>
 * - ALPS-EquipmentManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author WanGyu Kim
 * @see BCImpl 참조
 * @since J2EE 1.6
 */
public class FaxSendEAIDAO   extends EAIDAOSupport{

	/**
	 * 
	 * sendFax
	 * @author WanGyu Kim
	 * @param faxMgmtCondVO
	 * @throws DAOException void
	 */
	public void sendFax( List<FaxMgmtCondVO> faxMgmtCondVO) throws DAOException {
			
		TransferEAI transferEAI ;
		try{
			
			for(int i=0; i<faxMgmtCondVO.size(); i++){
			 
				transferEAI = new WeblogicSendQClient (  SiteConfigFactory.get("RDEXP.SENDJMS.URL"),this.getClass());
				transferEAI.setFactory(SiteConfigFactory.get("RDEXP.SENDJMS.FACTORY"));
				transferEAI.setQueue(SiteConfigFactory.get("RDEXP.SENDJMS.QUEUE"));
				
				transferEAI.setMessage( marshalingSndNo(faxMgmtCondVO.get(i).getFaxSndNo()) );
				transferEAI.setDestination(RDConfig.JMS_TYPE_FAXS  );
				
				transferEAI.commit("COM_SND_001" + (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date()));
							
				transferEAI.close();	
			}	
			
		} catch (EAIException e) {
			
		    log.error("EAIException : " + e.getMessage(),e);
	        throw new DAOException(e.getMessage());
		} catch (Exception e) {			
			log.error("Exception : " + e.getMessage(),e);
			throw new DAOException(e.getMessage());
		}
	}
	
	

	/**
	 * 
	 * @author Jeong-Hoon, KIM
	 * @param sndNo
	 * @return
	 */
	private static String marshalingSndNo(String sndNo) {
		
		COM001TRANSFERMESSAGEDocument document = COM001TRANSFERMESSAGEDocument.Factory.newInstance();
		COM001TRANSFERMESSAGE com001transfermessage = document.addNewCOM001TRANSFERMESSAGE();
		String instanceId =  "COM001TRANSFERMESSAGE" + (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
			
		EAIHeaderType headerType = com001transfermessage.addNewEAIHeader();		
		Parameters parameters   = headerType.addNewParameters();
		Parameter parameter     =  parameters.addNewParameter(); 
		
		parameter.setStringValue(instanceId);
		
		DataArea dataArea = com001transfermessage.addNewDataArea();
		TRANSFERINFO transferinfo = dataArea.addNewTRANSFERINFO();

		SENDITEM senditem = null;
		senditem = transferinfo.addNewSENDITEM();
		senditem.setSENDNO(sndNo);
		return document.toString();
	}
	
}
