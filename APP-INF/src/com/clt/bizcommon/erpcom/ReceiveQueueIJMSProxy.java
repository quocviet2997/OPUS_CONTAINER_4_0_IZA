/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueIJMSProxy.java
 *@FileTitle : ENIS Interface 연동 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2007-03-05
 *@LastModifier : Jung-Hyung,Kim
 *@LastVersion : 1.0
 * 2007-03-05 Jung-Hyung,Kim
 * 1.0 최초 생성
 =========================================================*/
package com.clt.bizcommon.erpcom;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import com.clt.bizcommon.erpcom.jms.event.ReceiveQueueEvent;
import com.clt.bizcommon.erpcom.jms.event.ReceiveQueueEventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.irep.enis.FNS008R003Document;
import com.clt.irep.erp.FNS0100002Document;
//import com.clt.irep.erp.FNS0100002Document;
import com.jf.transfer.TransferEAI;

/**
 * JMS 서버에서 받은 xml 메세지를 Event에 담아 Service Command에 넘겨준다.
 * [주의]queue-mapping.xml에 메서드가 정의 되어 있어야 한다.
 * 
 * @author Jung-Hyung,Kim
 * @see queue-mappinp.xml, ReceiveQueueRSC 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueIJMSProxy {
	protected transient Logger log = Logger.getLogger(this.getClass().getName());

	/**
	 * FNS008-R003Document
	 * @param TransferEAI eai Queue에서 받은 XML메시지
	 */
	public void receiveFNS008R003(TransferEAI eai) {
		String str = eai.getMessage();
		
		log.debug("<<<<<<<<<< receiveFNS008R003 시작 >>>>>>>>>>>>>>>>");		
		log.debug("<<<<<<<<<< receiveFNS008R003 시작 >>>>>>>>>>>>>>>>");		
		log.debug("\n\n" + str + "\n\n");
		
		Event event = null;
		ReceiveQueueRSC rsc = new ReceiveQueueRSC();

		try {
			//Event 생성
			event = new ReceiveQueueEvent("receiveFNS008R003");
			FormCommand f = new FormCommand();
			f.setCommand(FormCommand.SEARCH);
			event.setFormCommand(f);

			//Event에 XML 파싱하기 담기
			FNS008R003Document bkgDoc = FNS008R003Document.Factory.parse(str);
			((ReceiveQueueEvent) event).setXmlObject(bkgDoc);
			((ReceiveQueueEventResponse) rsc.perform(event)).getXmlObject();
			
			log.debug("<<<<<<<<<< receiveFNS008R003 종료 >>>>>>>>>>>>>>>>");		
			log.debug("<<<<<<<<<< receiveFNS008R003 종료 >>>>>>>>>>>>>>>>");
			
			eai.commit(bkgDoc.getFNS008R003().getEAIHeader().getInstanceId());
			
		} catch (EventException ee) {
			log.error("EventException ee : " + ee.toString(), ee);
			eai.rollback(ee);
		} catch (XmlException xe) {
			log.error("XmlException xe : " + xe.toString(), xe);
			eai.rollback(xe);
		} catch (Exception e){
			log.error("Exception e : " + e.toString());
			eai.rollback(e);
		}
		
		eai.close();
	}	
	
	/**
	 * receiveEAIJMS_SCE_AGT_sendInfoAGT
	 * @param TransferEAI eai Queue에서 받은 XML메시지
	 */
	public void receiveSearchRouteInfoforAGT(TransferEAI eai) {
		String str = eai.getMessage();
		
		log.debug("<<<<<<<<<< receiveSearchRouteInfoforAGT 시작 >>>>>>>>>>>>>>>>");		
		log.debug("<<<<<<<<<< receiveSearchRouteInfoforAGT 시작 >>>>>>>>>>>>>>>>");		
		log.debug("\n\n" + str + "\n\n");
		
		Event event = null;
		ReceiveQueueRSC rsc = new ReceiveQueueRSC();

		try {
			//Event 생성
			event = new ReceiveQueueEvent("receiveSearchRouteInfoforAGT");
			FormCommand f = new FormCommand();
			f.setCommand(FormCommand.SEARCH);
			event.setFormCommand(f);

			//Event에 XML 파싱하기 담기
			//FNS008R003Document bkgDoc = FNS008R003Document.Factory.parse(str);
			((ReceiveQueueEvent) event).setMsg(str);
			((ReceiveQueueEventResponse) rsc.perform(event)).getXmlObject();
			
			log.debug("<<<<<<<<<< receiveSearchRouteInfoforAGT 종료 >>>>>>>>>>>>>>>>");		
			log.debug("<<<<<<<<<< receiveSearchRouteInfoforAGT 종료 >>>>>>>>>>>>>>>>");
			
			eai.commit(str);			
			
		} catch (EventException ee) {
			log.error("EventException ee : " + ee.toString(), ee);
			eai.rollback(ee);
		} catch (Exception e){
			log.error("Exception e : " + e.toString());
			eai.rollback(e);
		}
		
		eai.close();
	}
	
	/**
	 * FNS010-0002Document
	 * @param TransferEAI eai
	 */
	public void receiveFNS0100002(TransferEAI eai) {
		String str = eai.getMessage();
		
		log.debug("<<<<<<<<<< Proxy.receiveFNS0100002(str) 시작 >>>>>>>>>>>>>>>>");		
		log.debug("\n" + str);
		log.debug("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		Event event = null;
		ReceiveQueueRSC rsc = new ReceiveQueueRSC();

		try {
			event = new ReceiveQueueEvent("receiveFNS0100002");
			log.debug(" <<<<<<<<<<<<<<<< event = new ReceiveQueueEvent(receiveFNS0100002);");
			FormCommand f = new FormCommand();
			f.setCommand(FormCommand.SEARCH);
			event.setFormCommand(f);
			
			FNS0100002Document bkgDoc = FNS0100002Document.Factory.parse(str);
			log.debug("<<<<<<<<<<<<<<<<< FNS0100002 bkgDoc = FNS0100002Document.Factory.parse(str);");
			log.debug("\n"+bkgDoc.toString());
			log.info("\n"+bkgDoc.toString());
			((ReceiveQueueEvent) event).setXmlObject(bkgDoc);
			((ReceiveQueueEventResponse) rsc.perform(event)).getXmlObject();
			log.debug("<<<<<<<<<< receiveFNS0100002(str) 종료 >>>>>>>>>>>>>>>>");	
			
			eai.commit(bkgDoc.getFNS0100002().getEAIHeader().getInstanceId());
			
		} catch (EventException ee) {
			log.error("EventException ee : " + ee.toString(), ee);
			eai.rollback(ee);
		} catch (XmlException xe) {
			log.error("XmlException xe : " + xe.toString());
			eai.rollback(xe);
		} catch (Exception e){
			log.error("Exception e : " + e.toString());
			eai.rollback(e);
		}
		
		eai.close();
	}
}
