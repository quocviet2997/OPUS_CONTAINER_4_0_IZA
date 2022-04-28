/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FaxSendBC.java
*@FileTitle : fax_send
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.01
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.01 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.fax.faxsend.basic;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.table.ComFaxSndInfoVO;

/**
 * NIS2010-Fax Business Logic Command Interface<br>
 * - NIS2010-Fax에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Fax_sendEventResponse 참조
 * @since J2EE 1.6
 */

public interface FaxSendBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Faxsend화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e Fax_sendEvent
	 * @return EventResponse Fax_sendEventResponse
	 * @exception EventException
	 */
	public String comFaxSndInfoVO(ComFaxSndInfoVO comFaxSndInfoVO) throws EventException;
}