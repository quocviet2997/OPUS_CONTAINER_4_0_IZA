/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueEventResponse.java
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

import com.clt.framework.support.layer.event.EventResponseSupport;

import org.apache.xmlbeans.XmlObject;

/**
 * Event의 피드백을 담당한다.
 * 
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueEvent 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueEventResponse extends EventResponseSupport {

	public XmlObject xmlObject = null;

	/**
	 * 생성자
	 *
	 */
	public ReceiveQueueEventResponse() {
	}

	/**
	 * 생성자
	 * @param xmlObject
	 */
	public ReceiveQueueEventResponse(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	/**
	 * toString()
	 */
	public String toString() {
		return "ReceiveQueueEventResponse";
	}

	/**
	 * eventName getter 메서드
	 * @return String
	 */
	public String getEventName() {
		return "ReceiveQueueEventResponse";
	}

	/**
	 * xmlObject getter 메서드
	 * @return XmlObject
	 */
	public XmlObject getXmlObject() {
		return xmlObject;
	}

	/**
	 * xmlObject setter 메서드
	 * @param xmlObject
	 */
	public void setXmlObject(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}
}
