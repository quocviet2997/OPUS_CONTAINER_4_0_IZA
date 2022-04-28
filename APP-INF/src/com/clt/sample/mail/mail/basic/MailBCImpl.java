/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MailBCImpl.java
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
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.sample.mail.mail.integration.MailDBDAO;

/**
 * NIS2010-Mail Business Logic Basic Command implementation<br>
 * - NIS2010-Mail에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, KIM
 * @see MAIL_01EventResponse,MailBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class MailBCImpl extends BasicCommandSupport implements MailBC {

	// Database Access Object
	private transient MailDBDAO dbDao = null;

	/**
	 * MailBCImpl 객체 생성<br>
	 * MailDBDAO를 생성한다.<br>
	 */
	public MailBCImpl() {
		dbDao = new MailDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Mail화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param comEmlSndInfoVO   ComEmlSndInfoVO
	 * @return List<ComEmlSndInfoVO>
	 * @exception EventException
	 */
	public List<ComEmlSndInfoVO> comEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException {
		try {
			return dbDao.comEmlSndInfoVO(comEmlSndInfoVO);
		} catch (DAOException ex) {
			throw new EventException(ex.getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(ex.getMessage(),ex);
		}
	}
	
}