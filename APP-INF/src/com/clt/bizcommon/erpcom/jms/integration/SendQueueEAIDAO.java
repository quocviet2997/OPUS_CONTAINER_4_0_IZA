/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : terminalagreementmanageEAIDAO.java
*@FileTitle : TerminalAgreement 조회화면 -Detail(Terminal Rate)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-07
*@LastModifier : kimjinjoo
*@LastVersion : 1.0
* 2006-11-07 kimjinjoo
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.erpcom.jms.integration;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.irep.enis.FNS0080003Document;
import com.jf.transfer.TransferEAI;


/**
 * ENIS-ESD에 대한 EAI 처리를 담당<br>
 * - ENIS-ESD Business Logic을 처리하기 위한 EAI 작업수행.<br>
 *
 * @author kimjinjoo
 * @see terminalagreementmanageBCImpl 참조
 * @since J2EE 1.4
 */
public class SendQueueEAIDAO extends EAIDAOSupport {
	
	/**
	 * invoice 정산내역을 ERP AP로 인터페이스한다.<br>
	 * - <br>
	 * 
	 * @param docReq 연동 데이타 FNS0080003Document
	 * @throws DAOException
	 */	
	public void transferInvToERP(FNS0080003Document docReq) throws Exception, DAOException {		
		TransferEAI eai 				= null;
		//TransferEAI eai 				= null;
        
		try {
			eai = new WeblogicSendQClientTemp(SubSystemConfigFactory.get("COM.ALPSJ.JMS.SEND.URL"), SendQueueEAIDAO.class);			
			eai.setFactory(SubSystemConfigFactory.get("COM.ALPSJ.JMS.FACTORY"));
			eai.setQueue(SubSystemConfigFactory.get("COM.ALPSJ.JMS.QUEUE"));
			eai.setJmsType("FNS008-0003");			
			
			//StopWatch sw = new StopWatch();					
			
			
			
			//System.out.println(">>>>> 1 (setObj Complete) " + sw.getElapsed());
			
			//sw = new StopWatch();
			//writeFile(docReq.toString());
			//System.out.println(">>>>> 2 (toString Complete) " + sw.getElapsed());			
			//eai.setObj(docReq);
			eai.setMessage(docReq.toString());
			//sw = new StopWatch();
			//chun
			//eai.commit(docReq.getFNS0080003().getEAIHeader().getInstanceId(),docReq.toString());			
			eai.commit(docReq.getFNS0080003().getEAIHeader().getInstanceId());
			//System.out.println(">>>>> 3 (commit Complete) " + sw.getElapsed());			
//		} catch (EAIException e) {
//			eai.rollback(e);			
//        	log.error(e.getMessage(),e);
//            throw new EventException(e.getMessage());
		} catch (Exception e) { 
			eai.rollback(e);
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			eai.close();	
			//eai = null;
		}
		
	}
	
//	private void writeFile(String msg) {
//		
//		FileOutputStream out; 
//		// declare a file output object                 
//		PrintStream p; 
//		// declare a print stream object                  
//		try                 {                         
//			// Create a new file output stream                         
//			// connected to "myfile.txt"                         
//			out = new FileOutputStream("C:\\myfile.txt");                          
//			// Connect print stream to the output stream                         
//			p = new PrintStream( out ); 			
//			p.println (msg);                          
//			p.close();                 }                 
//		catch (Exception e)                 {                         
//			System.err.println ("Error writing to file");                 
//		}
//	}
}