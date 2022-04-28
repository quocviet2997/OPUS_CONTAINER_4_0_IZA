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

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.irep.enis.FNS0080003Document;
//import com.clt.framework.core.layer.integration.DAOException;

/**
 * XML 메시지를 parsing 하고 DBDAO에게 넘겨준다.
 *
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueRSC, ReceiveQueueBCImpl 참조
 * @since J2EE 1.4
 */
public interface SendQueueBC {

	/**
	 * invoice 정산내역을 ERP AP로 인터페이스한다.
	 * @param FNS0080003Document[] docReq
	 * @param SignOnUserAccount signOnUserAccount
	 * @exception EventException
	 */
	public void transferInvToERP(FNS0080003Document[] docReq, SignOnUserAccount signOnUserAccount) throws EventException;
}