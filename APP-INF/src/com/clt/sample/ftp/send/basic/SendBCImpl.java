/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendBCImpl.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComFtpSndInfoVO;
import com.clt.sample.ftp.send.integration.SendDBDAO;

/**
 * ALPS-Ftp Business Logic Basic Command implementation<br>
 * - ALPS-Ftp에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, Kim
 * @see FTP_SENDEventResponse,SendBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class SendBCImpl extends BasicCommandSupport implements SendBC {

	// Database Access Object
	private transient SendDBDAO dbDao = null;

	/**
	 * SendBCImpl 객체 생성<br>
	 * SendDBDAO를 생성한다.<br>
	 */
	public SendBCImpl() {
		dbDao = new SendDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComFtpSndInfoVO comFtpSndInfoVO
	 * @return List<ComFtpSndInfoVO>
	 * @exception EventException
	 */
	public List<ComFtpSndInfoVO> retrieveFtp(ComFtpSndInfoVO comFtpSndInfoVO) throws EventException {
		try {
			return dbDao.retrieveFtp(comFtpSndInfoVO);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		
	}
	
}