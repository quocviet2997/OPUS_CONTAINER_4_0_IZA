/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : FaxManagementBCImpl.java
 *@FileTitle : 공통코드관리
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2014-12-01
 *@LastModifier : SW Jean
 *@LastVersion : 1.0
 * 2014-12-01 SW Jean
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.faxmanagement.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.bluecast.util.DuplicateKeyException;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.COM_CODEDOMAIN;
import com.clt.syscommon.management.opus.faxmanagement.integration.FaxManagementDBDAO;
import com.clt.syscommon.management.opus.faxmanagement.integration.FaxSendEAIDAO;
import com.clt.syscommon.management.opus.faxmanagement.vo.FaxMgmtCondVO;
import com.jf.transfer.TransferEAI;


/**
 * edm-edm Business Logic Basic Command implementation<br>
 * - edm-edm에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see FaxManagementBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class FaxManagementBCImpl extends BasicCommandSupport implements FaxManagementBC{

	// Database Access Object
	private transient FaxManagementDBDAO dbDao = null;
	private transient FaxSendEAIDAO   faxSendEAIDAO= null;
	/**
	 * 
	 * It's Constructor
	 * @author SeongWook Kim
	 */
	public FaxManagementBCImpl() {
		dbDao 			= new FaxManagementDBDAO();
		faxSendEAIDAO	= new FaxSendEAIDAO();
	}

	/**
	 * 
	 * searchFaxDataList
	 * @author SeongWook Kim
	 * @param e
	 * @return
	 * @throws EventException DBRowSet
	 */
	public DBRowSet searchFaxDataList(Event e) throws EventException {
		try {
			return dbDao.searchFaxDataList(e);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	

	
	/**
	 * 
	 * multiFaxMgmtMst
	 * @author SeongWook Kim
	 * @param faxMgmtMstVOs
	 * @param account
	 * @throws EventException void
	 */
	public void multiFaxMgmtMst( FaxMgmtCondVO[] faxMgmtMstVOs, SignOnUserAccount account) throws EventException {
		
		try {
			List<FaxMgmtCondVO> updateVoList = new ArrayList<FaxMgmtCondVO>();
			
			for ( int i=0; i<faxMgmtMstVOs .length; i++ ) {	
				faxMgmtMstVOs[i].setUpdUsrId(account.getUsr_id());
				updateVoList.add(faxMgmtMstVOs[i]);				 			
			} 
			
			if ( updateVoList.size() > 0 ) {				
			faxSendEAIDAO.sendFax(updateVoList);				
			 dbDao.multiFaxMgmtMst(updateVoList);
			}
								
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	


	/**
	 * 
	 * doEnd
	 * @author SeongWook Kim void
	 */
	public void doEnd() {
		dbDao = null;
	}
}