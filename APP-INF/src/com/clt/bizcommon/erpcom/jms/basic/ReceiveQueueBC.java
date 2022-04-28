/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ReceiveQueueBC.java
*@FileTitle : ENIS Interface 연동 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-05
 *@LastModifier : Jung-Hyung,Kim
 *@LastVersion : 1.0
 * 2007-03-05 Jung-Hyung,Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.erpcom.jms.basic;

import java.util.Collection;

import org.apache.xmlbeans.XmlObject;

import com.clt.framework.core.layer.event.EventException;

/**
 * XML 메시지를 parsing 하고 DBDAO에게 넘겨준다.
 *
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueRSC, ReceiveQueueBCImpl 참조
 * @since J2EE 1.4
 */
public interface ReceiveQueueBC {
	
	/**
	 * FNS008R003Document parse
	 * @param XmlObject xmlObject
	 * @return Collection
	 */
	public Collection receiveFNS008R003(XmlObject xmlObject);
		
	/**
	 * flag에 따라 DBDAO의 메서드를 호출 한다.
	 * @param Collection models
	 */
	public void ctrlFNS008R003First(Collection models) throws EventException;
	
	/**
	 * flag에 따라 DBDAO의 메서드를 호출 한다.
	 * @param Collection models
	 */
	public void ctrlFNS008R003Second(Collection models) throws EventException;
	
	/**
	 * FNS0100002Document parse
	 * @param XmlObject xmlObject
	 * @return Collection
	 */
	public Collection receiveFNS0100002(XmlObject xmlObject);
		
	/**
	 * AP_HDR, SO_HDR UPDATE
	 * @param Collection models
	 */
	public void ctrlFNS0100002(Collection models);
}