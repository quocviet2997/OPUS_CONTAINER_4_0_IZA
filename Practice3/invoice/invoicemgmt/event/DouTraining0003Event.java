/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DouTraining0003Event.java
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceDtlVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.SearchTradeVO;

/**
 * DOU_TRAINING_0003 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  DOU_TRAINING_0003HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Viet Tran
 * @see DOU_TRAINING_0003HTMLAction 참조
 * @since J2EE 1.6
 */

public class DouTraining0003Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	InvoiceVO invoiceVO = null;
	
	/** Table Value Object Multi Data 처리 */
	InvoiceVO[] invoiceVOs = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	InvoiceDtlVO invoiceDtlVO = null;
	
	/** Table Value Object Multi Data 처리 */
	InvoiceDtlVO[] invoiceDtlVOs = null;

	/** Table Value Object 조회 조건 및 단건 처리  */
	SearchTradeVO searchTradeVO = null;
	
	/** Table Value Object Multi Data 처리 */
	SearchTradeVO[] searchTradeVOs = null;
	
	public DouTraining0003Event(){}
	
	public void setInvoiceVO(InvoiceVO invoiceVO){
		this. invoiceVO = invoiceVO;
	}

	public void setInvoiceVOS(InvoiceVO[] invoiceVOs){
		this. invoiceVOs = invoiceVOs;
	}

	public InvoiceVO getInvoiceVO(){
		return invoiceVO;
	}

	public InvoiceVO[] getInvoiceVOS(){
		return invoiceVOs;
	}

	public void setInvoiceDtlVO(InvoiceDtlVO invoiceDtlVO){
		this. invoiceDtlVO = invoiceDtlVO;
	}

	public void setInvoiceDtlVOS(InvoiceDtlVO[] invoiceDtlVOs){
		this. invoiceDtlVOs = invoiceDtlVOs;
	}

	public InvoiceDtlVO getInvoiceDtlVO(){
		return invoiceDtlVO;
	}

	public InvoiceDtlVO[] getInvoiceDtlVOS(){
		return invoiceDtlVOs;
	}
	
	public void setSearchTradeVO(SearchTradeVO searchTradeVO){
		this. searchTradeVO = searchTradeVO;
	}

	public void setSearchTradeVO(SearchTradeVO[] searchTradeVOs){
		this. searchTradeVOs = searchTradeVOs;
	}

	public SearchTradeVO getSearchTradeVO(){
		return searchTradeVO;
	}

	public SearchTradeVO[] getSearchTradeVOS(){
		return searchTradeVOs;
	}
}