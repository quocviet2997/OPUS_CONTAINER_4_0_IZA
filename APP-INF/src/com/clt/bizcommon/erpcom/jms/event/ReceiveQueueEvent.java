/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueEvent.java
 *@FileTitle : ENIS Interface 연동 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2007-03-05
 *@LastModifier : Jung-Hyung,Kim
 *@LastVersion : 1.0
 * 2007-03-05 Jung-Hyung,Kim
 * 1.0 최초 생성
 =========================================================*/
package com.clt.bizcommon.erpcom.jms.event;

import com.clt.framework.support.layer.event.EventSupport;

import org.apache.xmlbeans.XmlObject;

/**
 * Event 처리를 담당한다.<br>
 * 
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueEventResponse 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueEvent extends EventSupport {
	private String event = "";
	private String msg = "";
	
	/** event getter 메서드.<br>
	 */
	public String getEvent() {
		return event;
	}

	/** event setter 메서드.<br>
	 * @param event String
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/** ReceiveQueueEvent 생성자<br>
	 */
	public ReceiveQueueEvent() {
	}

	/** ReceiveQueueEvent setter 메서드.<br>
	 * @param event String
	 */
	public ReceiveQueueEvent(String event) {
		this.event = event;
	}

	public XmlObject xmlObject = null;

	/**
	 * eventName getter 메서드
	 */
	public String getEventName() {
		return "ReceiveQueueEvent";
	}

	/**
	 * toString() 메서드
	 */
	public String toString() {
		return "ReceiveQueueEvent";
	}

	/**
	 * xmlObject getter 메서드 
	 * @return XmlObject
	 */
	public XmlObject getXmlObject() {
		return xmlObject;
	}

	/**
	 * xmlObject setter 메서
	 * @param xmlObject
	 */
	public void setXmlObject(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}
	
	/**
	 * msg getter 메서드 
	 * @return msg
	 */
	public String getMsg() {
		return this.msg;
	}

	/**
	 * msg setter 메서
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
