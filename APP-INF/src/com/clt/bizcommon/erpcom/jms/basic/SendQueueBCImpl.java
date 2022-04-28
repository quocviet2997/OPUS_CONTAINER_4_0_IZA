/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueAR_FINC_DIR_CONVImpl.java
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

import com.clt.bizcommon.erpcom.jms.integration.SendQueueEAIDAO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.irep.enis.FNS0080003Document;

/**
 * XML 메시지를 parsing 하고 DBDAO에게 넘겨준다.
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueBC, ReceiveQueueDBDAO 참조
 * @since J2EE 1.4
 */
public class SendQueueBCImpl extends BasicCommandSupport implements SendQueueBC {
	private transient SendQueueEAIDAO eaiDao = null;

	/**
	 * 생성자
	 */
	public SendQueueBCImpl() {
		eaiDao = new SendQueueEAIDAO();
	}

	/**
	 * invoice 정산내역을 ERP AP로 인터페이스한다.
	 * @param FNS0080003Document[] docReq
	 * @param SignOnUserAccount signOnUserAccount
	 * @exception EventException
	 */
	public void transferInvToERP(FNS0080003Document[] docReq, SignOnUserAccount signOnUserAccount) throws EventException {
		try {
			for(int i=0; docReq!=null&&i<docReq.length; i++) {
				eaiDao.transferInvToERP(docReq[i]);	
			}
		}catch(DAOException de){
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}catch(Exception ex){
			log.error("err " + ex.toString(), ex);
			throw new EventException(ex.getMessage());
		}
	}
	
}
