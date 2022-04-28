/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FaxSendBCImpl.java
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

import com.clt.framework.component.fax.FaxSendException;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComFaxSndInfoVO;
import com.clt.sample.fax.faxsend.integration.FaxSendEAIDAO;

/**
 * NIS2010-Fax Business Logic Basic Command implementation<br>
 * - NIS2010-Fax에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, Kim
 * @see fax_sendEventResponse,FaxSendBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class FaxSendBCImpl extends BasicCommandSupport implements FaxSendBC {

	// Database Access Object
	private transient FaxSendEAIDAO eaiDao = null;

	/**
	 * FaxSendBCImpl 객체 생성<br>
	 * FaxSendDBDAO를 생성한다.<br>
	 */
	public FaxSendBCImpl() {
		eaiDao = new FaxSendEAIDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  FaxSend화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param comFaxSndInfoVO   ComFaxSndInfoVO
	 * @return List<ComFaxSndInfoVO>
	 * @exception EventException
	 */
	public String comFaxSndInfoVO(ComFaxSndInfoVO comFaxSndInfoVO) throws EventException {
		try {
			return eaiDao.comFaxSndInfoVO(comFaxSndInfoVO);
		} catch (FaxSendException e) {
			throw new EventException(e.getMessage());
		}
	}
	
}