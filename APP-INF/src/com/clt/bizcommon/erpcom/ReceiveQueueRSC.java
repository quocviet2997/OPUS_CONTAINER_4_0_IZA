/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueRSC.java
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

import java.util.Collection;

import org.apache.xmlbeans.XmlObject;

import com.clt.bizcommon.erpcom.jms.basic.ReceiveQueueBC;
import com.clt.bizcommon.erpcom.jms.basic.ReceiveQueueBCImpl;
import com.clt.bizcommon.erpcom.jms.event.ReceiveQueueEvent;
import com.clt.bizcommon.erpcom.jms.event.ReceiveQueueEventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;

/**
 * 받은 xml을 parsing, DB 처리를 control 한다.
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueIJMSProxy, ReceiveQueueBC 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueRSC extends ServiceCommandSupport {
	
	/**
	 * ReceiveQueueSC 선행 작업
	 */
	public void doStart() {
		try {
			// account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("ReceiveQueueSC 선행 작업 시 오류 " + e.toString(), e);
		}
	}
	
	/**
	 * ReceiveQueueSC 종료
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("ReceiveQueueSC 종료");
	}

	/**
	 * command를 찾아서 적합한 메서드를 호출한다.
	 * @param e
	 * @return EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		
		EventResponse eventResponse = null;
		ReceiveQueueEvent re = (ReceiveQueueEvent) e;

		if (e.getEventName().equalsIgnoreCase("ReceiveQueueEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				if(re.getEvent().equals("receiveFNS008R003")){
					eventResponse = receiveFNS008R003First(e);
					eventResponse = receiveFNS008R003Second(e);
//				} else if (re.getEvent().equals("receiveSearchRouteInfoforAGT")) {
//					eventResponse = this.receiveSearchRouteInfoforAGT(e);
//				} 
				} else if (re.getEvent().equals("receiveFNS0100002")) {
					eventResponse = receiveFNS0100002(e);
				}
			}
		}
		return eventResponse;
	}

	/**
	 * receiveFNS008R003First
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse receiveFNS008R003First(Event e) throws EventException {
		EventResponse eventResponse = new ReceiveQueueEventResponse();
		
		try {
			ReceiveQueueBC command = new ReceiveQueueBCImpl();

			begin();
			XmlObject xmlObject = ((ReceiveQueueEvent) e).getXmlObject();
			Collection models = command.receiveFNS008R003(xmlObject);
			command.ctrlFNS008R003First(models);
			((ReceiveQueueEventResponse) eventResponse).setXmlObject(xmlObject);
			commit();
			
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return eventResponse;
	}
	
	/**
	 * receiveFNS008R003Second
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse receiveFNS008R003Second(Event e) throws EventException {
		EventResponse eventResponse = new ReceiveQueueEventResponse();		
log.error("===================== start rsc.receiveFNS008R003Second ");
		
		try {
			ReceiveQueueBC command = new ReceiveQueueBCImpl();

			begin();
			XmlObject xmlObject = ((ReceiveQueueEvent) e).getXmlObject();
			Collection models = command.receiveFNS008R003(xmlObject);
			command.ctrlFNS008R003Second(models);
			((ReceiveQueueEventResponse) eventResponse).setXmlObject(xmlObject);
			commit();
			
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return eventResponse;
	}
	
	/**
	 * receiveSearchRouteInfoforAGT
	 * @param Event e
	 * @return
	 * @throws EventException
	 */
//	public EventResponse receiveSearchRouteInfoforAGT(Event e) throws EventException {
//		EventResponse eventResponse = new ReceiveQueueEventResponse();
//		try {
//			AGTCalcBC command = new AGTCalcBCImpl();
//	
//			begin();
//			XmlObject xmlObject = ((ReceiveQueueEvent) e).getXmlObject();
//			// 처리 
//			command.receiveJmsInbound(((ReceiveQueueEvent) e).getMsg());
//			((ReceiveQueueEventResponse) eventResponse).setXmlObject(xmlObject);
//			commit();
//		
//		} catch (Exception ex) {
//			rollback();
//			log.error("Exception e: " + ex.toString());
//			throw new EventException(ex.getMessage());
//		}
//		return eventResponse;
//	}
	
	/**
	 * receiveFNS0100002
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse receiveFNS0100002(Event e) throws EventException {
		log.debug("\n\n RSC.receiveFNS0100002 --- \n\n");
		EventResponse eventResponse = new ReceiveQueueEventResponse();

		try {
			ReceiveQueueBC command = new ReceiveQueueBCImpl();

			begin();
			XmlObject xmlObject = ((ReceiveQueueEvent) e).getXmlObject();
			Collection models = command.receiveFNS0100002(xmlObject);
			command.ctrlFNS0100002(models);
			((ReceiveQueueEventResponse) eventResponse).setXmlObject(xmlObject);
			commit();

		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}

		return eventResponse;
	}

}
