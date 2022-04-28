/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : InvoiceMgmtBCImpl.java
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.basic;

import java.util.ArrayList;
import java.util.List;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration.InvoiceMgmtDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceDtlVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.SearchTradeVO;

/**
 * ALPS-Invoice Business Logic Command Interface<br>
 * - ALPS-Invoice에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */
public class InvoiceMgmtBCImpl extends BasicCommandSupport implements InvoiceMgmtBC {

	// Database Access Object
	private transient InvoiceMgmtDBDAO dbDao = null;

	/**
	 * InvoiceMgmtBCImpl 객체 생성<br>
	 * InvoiceMgmtDBDAO를 생성한다.<br>
	 */
	public InvoiceMgmtBCImpl() {
		dbDao = new InvoiceMgmtDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> InvoiceVO(InvoiceVO invoiceVO) throws EventException {
		try {
			return dbDao.InvoiceVO(invoiceVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> searchPartner(InvoiceVO invoiceVO) throws EventException {
		try {
			return dbDao.searchPartner(invoiceVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> searchLane(InvoiceVO invoiceVO) throws EventException {
		try {
			return dbDao.searchLane(invoiceVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<SearchTradeVO> searchTrade(SearchTradeVO searchTradeVO) throws EventException {
		try {
			return dbDao.searchTrade(searchTradeVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceDtlVO> InvoiceDtlVO(InvoiceDtlVO invoiceDtlVO) throws EventException {
		try {
			return dbDao.InvoiceDtlVO(invoiceDtlVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO[] invoiceVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void InvoiceVO(InvoiceVO[] invoiceVO, SignOnUserAccount account) throws EventException{
		try {
			List<InvoiceVO> insertVoList = new ArrayList<InvoiceVO>();
			List<InvoiceVO> updateVoList = new ArrayList<InvoiceVO>();
			List<InvoiceVO> deleteVoList = new ArrayList<InvoiceVO>();
			for ( int i=0; i<invoiceVO .length; i++ ) {
				if ( invoiceVO[i].getIbflag().equals("I")){
//					invoiceVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(invoiceVO[i]);
				} else if ( invoiceVO[i].getIbflag().equals("U")){
//					invoiceVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(invoiceVO[i]);
				} else if ( invoiceVO[i].getIbflag().equals("D")){
					deleteVoList.add(invoiceVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addInvoiceVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyInvoiceVOS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeInvoiceVOS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
}