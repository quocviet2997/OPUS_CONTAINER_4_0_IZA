/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : InvoiceMgmtBC.java
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

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
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

public interface InvoiceMgmtBC {
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO	invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> searchPartner(InvoiceVO invoiceVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO	invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> searchLane(InvoiceVO invoiceVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO	invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<SearchTradeVO> searchTrade(SearchTradeVO searchTradeVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO	invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceVO> InvoiceVO(InvoiceVO invoiceVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO	invoiceVO
	 * @return List<InvoiceVO>
	 * @exception EventException
	 */
	public List<InvoiceDtlVO> InvoiceDtlVO(InvoiceDtlVO invoiceDtlVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param InvoiceVO[] invoiceVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void InvoiceVO(InvoiceVO[] invoiceVO,SignOnUserAccount account) throws EventException;
}