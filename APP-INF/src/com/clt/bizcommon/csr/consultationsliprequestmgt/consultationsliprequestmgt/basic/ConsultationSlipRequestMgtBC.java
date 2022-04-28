/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtBC.java
*@FileTitle : CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier :
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic;
 
import java.util.Collection;
import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.irep.enis.FNS0080003Document;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AutoRevVVDListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOhdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOlistVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CheckAsaVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrDtrGrpVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.TAXInfoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
 
/**
 * ALPS-ConsultationSlipRequestMgt Business Logic Command Interface<br>
 * - The interface of the business logic about ALPS-ConsultationSlipRequestMgt<br>
 *
 * @author
 * @see Ui-csr-0001EventResponse 
 * @since J2EE 1.6
 */
public interface ConsultationSlipRequestMgtBC { 
	
	/**
	 * Retrieving the list of the CSR creation.
	 * @param ApPayInvListVO apPayInvListVO
	 * @return List<ApPayInvListVO>
	 * @exception EventException
	 */
	public List<ApPayInvListVO> searchCsrList(ApPayInvListVO apPayInvListVO) throws EventException;
	
	/**
	 * Checking the A/P and ASA of the CSR Creatio
	 * @param CheckAsaVO checkAsaVO
	 * @return CheckAsaVO
	 * @exception EventException
	 */
	public CheckAsaVO checkAsaOffice(CheckAsaVO checkAsaVO) throws EventException;
	
	/**
	 * Retrieving the detail information of CSR Creation<br>
	 * @param CsrListInputVO csrListInputVO
	 * @return List<CsrListInputVO>
	 * @exception EventException
	 */
	public List<CsrListInputVO> searchCSRSummaryDetail(CsrListInputVO csrListInputVO) throws EventException;	
	
	/**
	 * Retrieving the list of the ASA No<br>
	 * @param String invOfcCd
	 * @return List<AsaNoVO>
	 * @throws EventException
	 */
	public List<AsaNoVO> searchAsaNoList(String invOfcCd) throws EventException;

	/**
	 * Retrieving the EVI code to make the combo box. 
	 * @return List<TAXInfoVO>
	 * @throws EventException
	 */
	public List<TAXInfoVO> searchEviCodeList() throws EventException;
	
	/**
	 * Retrieving the TAX informationRetrieving the TAX information(business number, vendor code, company name, business status, address, and representative of the company)  
	 * @param String compNo
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchTAXInfo(String compNo) throws EventException;
	
	/**
	 * Retrieving the business number.
	 * @param TAXInfoVO tAXInfoVO
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchCompNo(TAXInfoVO tAXInfoVO) throws EventException;
	
	/**
	 * Getting and saving the new evid_no.  
	 * @param TAXInfoVO tAXInfoVO
	 * @param SignOnUserAccount signOnUserAccount
	 * @return TAXInfoVO
	 * @throws EventException
	 */
	public TAXInfoVO searchApEviNo(TAXInfoVO tAXInfoVO, SignOnUserAccount signOnUserAccount) throws EventException;
	
	/**
	 * Retrieving the tax code. 
	 * @param TAXInfoVO tAXInfoVO
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchTAXCode(TAXInfoVO tAXInfoVO) throws EventException;
	
	/**
	 * Retrieving Auto Rev VVD List.
	 * @param Collection payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[]
	 * @exception EventException
	 */
	public DBRowSet[] getAutoRevVVDList(Collection payInvVOs, CsrParmVO csrParmVO) throws EventException;
	
	/**
	 * Modifying Auto Rev VVD.
	 * @param List<AutoRevVVDListVO> autoRevVVDListVO
	 * @exception EventException
	 */
	public void modifyAutoRevVVD(List<AutoRevVVDListVO> autoRevVVDListVO) throws EventException;
	
	/**
	 * Retrieving ApInDTRB(domestic)
	 * @param Collection<PayInvVO> payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[]
	 * @exception EventException
	 */
	public DBRowSet[] searchApInvDTRBIn(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws EventException;	
	
	/**
	 * Retrieving ApInDTRB(overseas)
	 * @param Collection<PayInvVO> payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[]
	 * @exception EventException
	 */
	public DBRowSet[] searchApInvDTRBOut(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws EventException;
	
	/**
	 * Implementing Approval Request button.
	 * @param Collection<PayInvVO> payInvVOs
	 * @param List<AutoRevVVDListVO> autoRevVVDListVO
	 * @param List<SearchDTRBTtlVO> searchDTRBTtlVOList
	 * @param CsrParmVO csrParmVO
	 * @param String creUsrId
	 * @return String
	 * @exception EventException
	 */
	public String approvalRequest(Collection<PayInvVO> payInvVOs, List<AutoRevVVDListVO> autoRevVVDListVO, List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws EventException;
	
	/**
	 * Implementing Preview button.
	 * @param Collection<PayInvVO> payInvVOs
	 * @param List<AutoRevVVDListVO> autoRevVVDListVO
	 * @param List<SearchDTRBTtlVO> searchDTRBTtlVOList
	 * @param CsrParmVO csrParmVO
	 * @param String creUsrId
	 * @return HdrDtrGrpVO
	 * @exception EventException
	 */
	public HdrDtrGrpVO searchPreVeiw(Collection<PayInvVO> payInvVOs, List<AutoRevVVDListVO> autoRevVVDListVO, List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws EventException;
	
	/**
	 * Implementing CSR Format button.
	 * @param String csrNo
	 * @return HdrDtrGrpVO
	 * @exception EventException
	 */
	public HdrDtrGrpVO tmpSearchPreVeiw(String csrNo) throws EventException;
	
	/**
	 * Retrieving the list of CSR I/F
	 * @param IfCsrListInputVO ifCsrListInputVO
	 * @return List<IfCsrListInputVO>
	 * @exception EventException
	 */
	public List<IfCsrListInputVO> searchCsrIfList(IfCsrListInputVO ifCsrListInputVO) throws EventException;
	
	/**
	 * Retrieving the list of the invoice
	 * @param CSRSOlistVO cSRSOlistVO
	 * @return List<CSRSOlistVO>
	 * @exception EventException
	 */
	public List<CSRSOlistVO> searchCSRSOlist(CSRSOlistVO cSRSOlistVO) throws EventException;	
	
	/**
	 * Retrieving the fleet form of the invoice list : searched the list of SO by the transfer slip 
	 * @param CSRSOhdrVO cSRSOhdrVO
	 * @return CSRSOhdrVO
	 * @exception EventException
	 */
	public CSRSOhdrVO searchCSRSOhdr(CSRSOhdrVO cSRSOhdrVO) throws EventException;	
	
	/**
	 * Implementing CSR Cancel button - Saving the cancellation of I/F Error
	 * @param IfCsrListInputVO ifCsrListInputVO
	 * @param SignOnUserAccount signOnUserAccount
	 * @throws EventException
	 */
	public void multiConfirmCSR(IfCsrListInputVO ifCsrListInputVO,SignOnUserAccount signOnUserAccount) throws EventException;
	
	/**
	 * Implementing CSR Cancel button of Approval Requested
	 * @param  IfCsrListInputVO ifCsrListInputVO
	 * @param  SignOnUserAccount signOnUserAccount
	 * @throws EventException
	 */
	public void cancelCSR(IfCsrListInputVO ifCsrListInputVO,SignOnUserAccount signOnUserAccount) throws EventException;
	
	/**
	 * Saving the cancellation by invoice of A/P Rejected and Disapproved.
	 * @param Collection<PayInvVO> payInvVOs
	 * @param String[] chks
	 * @param CsrParmVO csrParmVO
	 * @param String userId
	 * @param String ofcCd
	 * @throws EventException
	 */
	public void multiRejectedCSRCancellation(Collection<PayInvVO> payInvVOs, String[] chks, CsrParmVO csrParmVO, String userId, String ofcCd) throws EventException;
	
	/**
	 * Converting from CSR data of processing AP I/F to the standard XML document for the web service.
	 * @param String flag
	 * @param String csrNo
	 * @param String ofcCd
	 * @param ComAproRqstRoutVO comAproRqstRoutVO
	 * @return FNS0080003Document[]
	 * @exception EventException
	 */
	public FNS0080003Document[] approvalRequestAccount1(String flag, String csrNo, String ofcCd, ComAproRqstRoutVO comAproRqstRoutVO) throws EventException; 
	
	/**
	 * Calling CSR from EP.
	 * @param String flag
	 * @param String csrNo
	 * @param ComAproRqstRoutVO comAproRqstRoutVO
	 * @exception EventException
	 */
	public void approvalRequestAccount2(String flag, String csrNo, ComAproRqstRoutVO comAproRqstRoutVO) throws EventException;
	
	/**
	 * Saving the data to AP_INV_IF for AP I/F if CSR is created.
	 * @param String csrNo
	 * @param String ofcCd
	 * @return String
	 * @throws EventException
	 */
	public String createApInvIF(String csrNo, String ofcCd) throws EventException;

    /**
     * Retrieving the result value of BackEndJob result.
     * @param String key
     * @return String
     * @throws EventException
     */
	public String searchBakEndJobStatus(String key) throws EventException;
	   

    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoInvoiceInterfaceResult <br>
	 *
	 * @author sangyoung cha
	 * @param String csrNo
	 * @param String ifErrRsn
	 * @exception EventException
	 */    
    public void manageSoInvoiceInterfaceResult(String csrNo, String ifErrRsn) throws EventException;
    
    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoInvoiceInterfaceSucess <br>
	 *
	 * @author sangyoung cha
	 * @param String csrNo
	 * @exception EventException
	 */    
    public void manageSoInvoiceInterfaceSucess(String csrNo) throws EventException;
    
    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoPayInvoiceInterface <br>
	 *
	 * @author ORKIM
	 * @param String csrNo
	 * @param String invStsCd
	 * @exception EventException
	 */    
    public void modifySoPayInvoiceInterface(String csrNo, String invStsCd) throws EventException;
    
    /**
	 * STM_SAP_0250 : interface batch
	 * modifySoPayInvoiceInterfaceBatchByStmSap <br>
	 *
	 * @author ORKIM
	 * @param String invStsCd
	 * @param String pay_bat_seq
	 * @param String pay_bat_nm
	 * @param String vndr_no
	 * @exception EventException
	 */    
    public void modifySoPayInvoiceInterfaceBatchByStmSap(String invStsCd, String pay_bat_seq, String pay_bat_nm, String vndr_no) throws EventException;    
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceByStmSap
     * @param String csr_no
     * @exception EventException
     */
    public void modifyAPInvoiceByStmSap(String csr_no) throws EventException;
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceDeleteByStmSap
     * @param String csr_no
     * @exception EventException
     */
    public void modifyAPInvoiceDeleteByStmSap(String csr_no) throws EventException;    
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoicePayBatchByStmSap
     * @param String pay_bat_seq
     * @param String pay_bat_nm
     * @param String vndr_no
     * @exception EventException
     */
    public void modifyAPInvoicePayBatchByStmSap(String pay_bat_seq, String pay_bat_nm, String vndr_no) throws EventException;    
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceRejectByStmSap
     * @param String csr_no
     * @param String rcv_err_flg
     * @param String rcv_err_rsn
     * @param String usr_id
     * @exception EventException
     */
    public void modifyAPInvoiceRejectByStmSap(String csr_no, String rcv_err_flg, String rcv_err_rsn,String usr_id) throws EventException;   

}