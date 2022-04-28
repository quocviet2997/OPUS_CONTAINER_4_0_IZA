/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MailBC.java
*@FileTitle : Mail Sample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.mail.mail.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.table.ComEmlSndInfoVO;

/**
 * NIS2010-Mail Business Logic Command Interface<br>
 * - NIS2010-Mail에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, KIM
 * @see Mail_01EventResponse 참조
 * @since J2EE 1.6
 */

public interface MailBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Mail화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e Mail_01Event
	 * @return EventResponse Mail_01EventResponse
	 * @exception EventException
	 */
	public List<ComEmlSndInfoVO> comEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException;
}