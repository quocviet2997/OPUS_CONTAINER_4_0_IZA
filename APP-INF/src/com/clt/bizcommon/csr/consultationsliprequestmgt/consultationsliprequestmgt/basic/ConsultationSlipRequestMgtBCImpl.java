/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtBCImpl.java
*@FileTitle : CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration.ConsultationSlipRequestMgtDBDAO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration.ConsultationSlipRequestMgtEAIDAO;
import com.clt.framework.component.backend.core.BackEndJobManager;
import com.clt.framework.component.backend.support.BackEndJobException;
import com.clt.framework.component.backend.support.BackEndJobMetaDataSelector;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.irep.enis.FNS0080003Document;
import com.clt.syscommon.common.table.ApInvDtrbVO;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AutoRevVVDListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOhdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOlistVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CheckAsaVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CreateApInvDTRBASANoSelectVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.DtrbListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrDtrGrpVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.TAXInfoVO;

/**
 * ALPS-ConsultationSlipRequestMgt Business Logic Basic Command implementation<br>
 * - Handling the business logic about ALPS-ConsultationSlipRequestMgt<br>
 *
 * @author
 * @see UI-CSR-0001EventResponse,ConsultationSlipRequestMgtBC
 * @since J2EE 1.6
 */
public class ConsultationSlipRequestMgtBCImpl extends BasicCommandSupport implements ConsultationSlipRequestMgtBC {

	// Database Access Object
	private transient ConsultationSlipRequestMgtDBDAO dbDao = null;
	private transient ConsultationSlipRequestMgtEAIDAO eaiDao = null;

	/**
	 * The constructor.<br>
	 * Creating ConsultationSlipRequestMgtDBDAO class.<br>
	 */
	public ConsultationSlipRequestMgtBCImpl() {
		dbDao = new ConsultationSlipRequestMgtDBDAO();
		eaiDao = new ConsultationSlipRequestMgtEAIDAO();
	}

	/**
	 * Retrieving the list of the CSR creation.
	 * @param ApPayInvListVO apPayInvListVO
	 * @return List<ApPayInvListVO>
	 * @exception EventException
	 */
	public List<ApPayInvListVO> searchCsrList (ApPayInvListVO apPayInvListVO) throws EventException {
		try {
			return dbDao.searchCsrList(apPayInvListVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Checking the A/P and ASA of the CSR Creation<br>
	 * @param CheckAsaVO checkAsaVO
	 * @return CheckAsaVO
	 * @exception EventException
	 */
	public CheckAsaVO checkAsaOffice(CheckAsaVO checkAsaVO) throws EventException {
		try {
			List<CheckAsaVO> checkAsaVOLst = null;
			CheckAsaVO checkAsaVO2 = new CheckAsaVO();

			checkAsaVOLst = dbDao.checkAsaOffice(checkAsaVO);

			if(checkAsaVOLst.size() > 0){
				checkAsaVO2.setSoIfCd(checkAsaVOLst.get(0).getSoIfCd());
				checkAsaVO2.setApOfcCd(checkAsaVOLst.get(0).getApOfcCd());
			}
			return checkAsaVO2;
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the detail information of CSR Creation<br>
	 * @param CsrListInputVO csrListInputVO
	 * @return List<CsrListInputVO>
	 * @exception EventException
	 */
	public List<CsrListInputVO> searchCSRSummaryDetail (CsrListInputVO csrListInputVO) throws EventException {
		try {
			return dbDao.searchCSRSummaryDetail(csrListInputVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the list of the ASA No<br>
	 * @param String invOfcCd
	 * @return List<AsaNoVO>
	 * @exception EventException
	 */
	public List<AsaNoVO> searchAsaNoList(String invOfcCd) throws EventException {
		try {
			return dbDao.searchAsaNoList(invOfcCd);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the EVI code to make the combo box. 
	 * @return List<TAXInfoVO>
	 * @throws EventException
	 */
	public List<TAXInfoVO> searchEviCodeList() throws EventException {
		try {
			return dbDao.searchEviCodeList();
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the TAX information(business number, vendor code, company name, business status, address, and representative of the company)     
	 * @param String compNo
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchTAXInfo(String compNo) throws EventException {
		try {
			List<TAXInfoVO> voLst = null;
			TAXInfoVO vo = new TAXInfoVO();

			voLst = dbDao.searchTAXInfo(compNo);

			if(voLst.size() > 0){
				vo.setVndrNm(voLst.get(0).getVndrNm());
				vo.setBzctNm(voLst.get(0).getBzctNm());
				vo.setBztpNm(voLst.get(0).getBztpNm());
				vo.setVndrAddr(voLst.get(0).getVndrAddr());
				vo.setVndrSeqHdr(voLst.get(0).getVndrSeqHdr());
				vo.setCeoNm(voLst.get(0).getCeoNm());
			}
			return vo;
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Getting and saving the new evid_no.  
	 * @param TAXInfoVO tAXInfoVO
	 * @param SignOnUserAccount signOnUserAccount
	 * @return TAXInfoVO
	 * @throws EventException
	 */
	public TAXInfoVO searchApEviNo(TAXInfoVO tAXInfoVO, SignOnUserAccount signOnUserAccount) throws EventException {
		try {
			/*1. getting the new evid_no.
			  2. saving it. */
			//1
			String taxNo1 = (String) tAXInfoVO.getTaxNo1();
			String taxNo2 = (String) tAXInfoVO.getTaxNo2();
			String taxNo3 = dbDao.searchApEviNo(taxNo1, taxNo2);
			//2
			tAXInfoVO.setCreUsrId(signOnUserAccount.getUsr_id());
			tAXInfoVO.setTaxNo3(taxNo1+taxNo2+taxNo3);
			tAXInfoVO.setOfcCd(signOnUserAccount.getOfc_cd());

			dbDao.addApEviNo(tAXInfoVO);

			String taxNoMax = dbDao.searchApEviNo(taxNo1, taxNo2);

			tAXInfoVO.setTaxNo3(taxNoMax);
			return tAXInfoVO;
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the tax code. 
	 * @param TAXInfoVO tAXInfoVO
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchTAXCode(TAXInfoVO tAXInfoVO) throws EventException {
		try {
			List<TAXInfoVO> voLst = null;
			voLst = dbDao.searchTAXCode(tAXInfoVO);

			if(voLst.size() > 0){
				tAXInfoVO.setApTaxNm(voLst.get(0).getApTaxNm());
			}
			return tAXInfoVO;
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the business number.
	 * @param TAXInfoVO tAXInfoVO
	 * @return TAXInfoVO
	 * @exception EventException
	 */
	public TAXInfoVO searchCompNo(TAXInfoVO tAXInfoVO) throws EventException {
		try {
			String compNo = dbDao.searchCompNo(tAXInfoVO);
			tAXInfoVO.setCompNo(compNo);
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
		return tAXInfoVO;
	} 
	
	/**
	 * Retrieving Auto Rev VVD List.
	 * @param Collection payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[]
	 * @throws EventException
	 */
	public DBRowSet[] getAutoRevVVDList(Collection payInvVOs, CsrParmVO csrParmVO) throws EventException {

		DBRowSet[] dRsArr = null;

		try {
			dRsArr = dbDao.getAutoRevVVDList(payInvVOs, csrParmVO);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return dRsArr;
	}

	/**
	 * Modifying Auto Rev VVD.
	 * @param List<AutoRevVVDListVO> autoRevVVDListVO
	 * @throws EventException
	 */
	public void modifyAutoRevVVD(List<AutoRevVVDListVO> autoRevVVDListVO) throws EventException {

		try {
			dbDao.modifyAutoRevVVD(autoRevVVDListVO);
			log.error("\n DONE - searchPreVeiw.modifyAutoRevVVD:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving ApInDTRB(domestic)
	 * @param Collection<PayInvVO> payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[] 
	 * @throws EventException
	 */
	public DBRowSet[] searchApInvDTRBIn(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws EventException {

		DBRowSet[] dRsArr = null;

		try {
			dRsArr = dbDao.searchApInvDTRBIn(payInvVOs, csrParmVO);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return dRsArr;
	}

	/**
	 * Retrieving ApInDTRB(overseas)
	 * @param Collection<PayInvVO> payInvVOs
	 * @param CsrParmVO csrParmVO
	 * @return DBRowSet[]
	 * @throws EventException
	 */
	public DBRowSet[] searchApInvDTRBOut(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws EventException {

		DBRowSet[] dRsArr = null;

		try {
			dRsArr = dbDao.searchApInvDTRBOut(payInvVOs, csrParmVO);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return dRsArr;
	}
	
    /**
     * Retrieving the result value of BackEndJob result.
     * @param String key
     * @return String
     * @throws EventException
     */
	public String searchBakEndJobStatus(String key) throws EventException {
		DBRowSet rowSet;
		try {
			rowSet = new BackEndJobMetaDataSelector(key).getDbRowset();
			rowSet.next();
			Thread.sleep(1000);
			return (String) rowSet.getObject("jb_sts_flg") + (String) rowSet.getObject("jb_usr_err_msg");
		} catch (BackEndJobException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{"Confirm Approval"}).getMessage(), ex);
		} catch (SQLException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{"Confirm Approval"}).getMessage(), ex);
		} catch (InterruptedException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{"Confirm Approval"}).getMessage(), ex);
		} catch(Exception ex){
			throw new EventException(new ErrorHandler("CSR00010", new String[]{"Confirm Approval"}).getMessage(), ex);
		}
	}

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
	public String approvalRequest(Collection<PayInvVO> payInvVOs, List<AutoRevVVDListVO> autoRevVVDListVO, List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws EventException {
        try {
			ConsultationSlipRequestBackEndJob backEndResult = new ConsultationSlipRequestBackEndJob();
			
			BackEndJobManager backEndJobManager = new BackEndJobManager();
			backEndResult.setAutoRevVVDListVO(autoRevVVDListVO);
			backEndResult.setSearchDTRBTtlVOList(searchDTRBTtlVOList);
			backEndResult.setPayInvVOs(payInvVOs);
			backEndResult.setCsrParmVO(csrParmVO);
			backEndResult.setCreUsrId(creUsrId);
			backEndResult.setJobFlg("SAVE");
			
			return backEndJobManager.execute(backEndResult, creUsrId, "CSR Approval Requst!!!");
		} catch (Exception de) {
			//log.error("\n DONE - approvalRequest.DAOException - CSR_NO:"+csr_no+" / "+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n\n");
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		}
	}

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
	public HdrDtrGrpVO searchPreVeiw(Collection<PayInvVO> payInvVOs, List<AutoRevVVDListVO> autoRevVVDListVO, List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws EventException {
		log.debug("\n\n\n\n\n BCImpl searchPreVeiw >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> searchPreVeiw");
		log.error("\n searchPreVeiw:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

		HdrDtrGrpVO grpVO = new HdrDtrGrpVO();
		HdrVO hdrSet = null;
		List<DtrbListVO> dtrbSet = null;

		String asa_no 	 = csrParmVO.getAsaNoS();
		String csr_tp_cd = csrParmVO.getCsrTpCd();
//		String cnt_cd 	 = csrParmVO.getCntCd();
//		String evi_gb 	 = csrParmVO.getEviGb();
		String csr_no 	 = "";
		String chkAmt    = ""; 
		//Adding TLL logic
		String inv_sub_sys_cd = csrParmVO.getInvSubSysCd();
		String ofc_cd    	  = JSPUtil.getNull(csrParmVO.getOfcCd());
		String cost_ofc_cd    = JSPUtil.getNull(csrParmVO.getCostOfcCd());
		//createApInvDTRB_sum
		DBRowSet		dtrbSumSet		= null;		
		String inv_no2			= "";
		String vndr_seq			= ""; 
		String gap		 		= "";
		String cost_cd	 		= "";
		String cntr_tpsz_cd		= ""; 
		//Rev.VVD
		DBRowSet 		revVVDSet 	= null;
		DBRowSet 		revVVDSet2 	= null;
		DBRowSet 		acctCdSet	= null;
		String 			vvd_cd 	= "";
		String 			dtrb_coa_acct_cd 	= "";
		String 			inv_no 	= "";
		String 			chk 	= "";
		String 			tmp_del_vvd_inv 		= "";
		String 			tmp_not_found_vvd_inv 	= "";
		//createApInvDTRBASANo
		DBRowSet		asaRowSet	= null;
		String iss_dt = "";
		String loc_cd = "";
		String line_seq = "";
		String line_no = "";
		String total_amt = "";
//		String acct_cd = "954113";
		//modifyApInvDTRBLineNo
		DBRowSet 		dtrbLineSet 	= null;
		ApInvDtrbVO		apInvDtrbVO		= null;
		List<ApInvDtrbVO> 	lineNoVoList 	= new ArrayList<ApInvDtrbVO>();
		
		try {
			//1. Throwing Exception and not processing this logic any more if the checked data is not existed. - mdm_organization
			CSRSOhdrVO rtnVO = dbDao.searchApInvChacke1(csrParmVO);
			if((rtnVO.getApOfcCd()).equals("N") || (rtnVO.getApOfcCd()).equals("")){
				throw new DAOException(new ErrorHandler("CSR00023").getMessage());
			}
			if((rtnVO.getFincRgnCd()).equals("N") || (rtnVO.getFincRgnCd()).equals("")){
				throw new DAOException(new ErrorHandler("CSR00023").getMessage());
			}
			if((rtnVO.getApCtrCd()).equals("N") || (rtnVO.getApCtrCd()).equals("")){
				throw new DAOException(new ErrorHandler("CSR00023").getMessage());
			}
			log.error("\n DONE - approvalRequest.searchApInvChacke1:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			//2. Retrieving the ACCT_CD
			dbDao.searchApInvChacke2(payInvVOs);
			log.error("\n DONE - approvalRequest.searchApInvChacke2:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			//3. Creating the CSR_NO - Retrieving the CSR_NO and inserting the AP_CSR_NO table./ >>>>>>> Getting the new CSR_NO classified by the distribution and equipment.
			csr_no = dbDao.multiCSRNo(cost_ofc_cd, csr_tp_cd, inv_sub_sys_cd);

			log.error("\n DONE - approvalRequest.multiCSRNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			csrParmVO.setCsrNo(csr_no); 
			
			if(!inv_sub_sys_cd.equals("CNI") && autoRevVVDListVO.size() > 0){	//Modifying the AutoRevVVD if the module is not CNI.
				// 2. Modifying REVENUE VVD CONVERSION AUTO, MANUAL invoice.
				dbDao.modifyAutoRevVVD(autoRevVVDListVO);
				log.error("\n DONE - searchPreVeiw.modifyAutoRevVVD:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			} 

			//4. Insert AP HDR AND DTRB.
			dbDao.createApInvHDR(csrParmVO, creUsrId);
			log.error("\n DONE - approvalRequest.createApInvHDR:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			 //searchApInvDTRBIn -> or searchApInvDTRBOut -> Inserting the gotten data whose type is DBRowSet[] to AP_INV_DTRB table and updating it to AP_INV_HDR table.
			//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
			dbDao.createApInvDTRB(searchDTRBTtlVOList, csrParmVO, creUsrId);  //Calling it only if event.setDTRBRowSetArr() is called in the SC class.
			log.error("\n DONE - approvalRequest.createApInvDTRB:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			//Updating LINE_SEQ, LINE_NO in AP_INV_DTRB table.
			dbDao.modifyApInvDTRBLineNo(csr_no);
			dtrbLineSet = dbDao.modifyApInvDTRBLineNo03(csr_no);
			if (dtrbLineSet != null) {
				while(dtrbLineSet.next()){
					apInvDtrbVO = new ApInvDtrbVO();
					
					apInvDtrbVO.setLineNo(dtrbLineSet.getString("line_no"));
					apInvDtrbVO.setCsrNo(csr_no);
					apInvDtrbVO.setAttrCtnt1(dtrbLineSet.getString("attr_ctnt1"));
					apInvDtrbVO.setDtrbCoaAcctCd(dtrbLineSet.getString("dtrb_coa_Acct_cd"));
					apInvDtrbVO.setDtrbCoaVvdCd(dtrbLineSet.getString("dtrb_coa_vvd_cd"));
					apInvDtrbVO.setActYm(dtrbLineSet.getString("act_ym"));  //2017.08.30 Activity Month Summary condition add
					
					lineNoVoList.add(apInvDtrbVO);
				}
			}
			dbDao.modifyApInvDTRBLineNo02(lineNoVoList); 
			
			log.error("\n DONE - approvalRequest.modifyApInvDTRBLineNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			
			//Updating the GAP, AP_INV_DTRB.
			Iterator itr   =	payInvVOs.iterator();
			PayInvVO model = null;

			while (itr.hasNext()) {
				model 			= (PayInvVO)itr.next();
				inv_no = model.getInv_no();
				vndr_seq = model.getVndr_seq();
				
				dtrbSumSet = dbDao.createApInvDTRB_sum(csrParmVO.getCsrNo(), inv_no, vndr_seq);
				
				if (dtrbSumSet != null) {
    				while(dtrbSumSet.next()){
    					gap 			= dtrbSumSet.getString("GAP");
    					inv_no2 		= dtrbSumSet.getString("ATTR_CTNT1");
    					cost_cd 		= dtrbSumSet.getString("FTU_USE_CTNT1");
    					cntr_tpsz_cd 	= dtrbSumSet.getString("CNTR_TPSZ_CD");
    					
    					if (inv_no==null || inv_no.trim().equals("") || inv_no2==null || inv_no2.trim().equals("") || !inv_no.equals(inv_no2)){
    						throw new DAOException(new ErrorHandler("Wrong Inv.No Exception!!!").getMessage());
    					}
    					
    					dbDao.createApInvDTRB_sumUpdateDiff(csrParmVO, gap, inv_no2, cost_cd, cntr_tpsz_cd);
    				}
				}
			}
			log.error("\n DONE - approvalRequest.createApInvDTRB_sum:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			if (!asa_no.equals("")) {
				//if asa_no exists
				asaRowSet = dbDao.createApInvDTRBASANoSelect(csr_no);
	            if (asaRowSet != null) {
	            	while(asaRowSet.next()){
	            		inv_no  	= asaRowSet.getString("inv_no");
	            		iss_dt  	= asaRowSet.getString("iss_dt");
	            		loc_cd		= asaRowSet.getString("loc_cd");
	            		line_seq	= asaRowSet.getString("line_seq");
	            		line_no		= asaRowSet.getString("line_no");
	            		total_amt	= asaRowSet.getString("total_amt");
	            	}
	            }
	            
	            CreateApInvDTRBASANoSelectVO createApInvDTRBASANoSelectVO = new CreateApInvDTRBASANoSelectVO();
	            
	            createApInvDTRBASANoSelectVO.setInvNo(inv_no);
	            createApInvDTRBASANoSelectVO.setIssDt(iss_dt);
	            createApInvDTRBASANoSelectVO.setLocCd(loc_cd);
	            createApInvDTRBASANoSelectVO.setLineSeq(line_seq);
	            createApInvDTRBASANoSelectVO.setLineNo(line_no);
	            createApInvDTRBASANoSelectVO.setTotalAmt(total_amt);
//	            createApInvDTRBASANoSelectVO.setAcctCd(acct_cd);
	            createApInvDTRBASANoSelectVO.setCsrNo(csr_no);
	            
	            dbDao.createApInvDTRBASANoInsert(createApInvDTRBASANoSelectVO, ofc_cd, cost_ofc_cd, vndr_seq, creUsrId, csr_tp_cd);
	            dbDao.createApInvDTRBASANoUpdate(csr_no);
				log.error("\n DONE - approvalRequest.createApInvDTRBASANo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			}
			 
			if(!inv_sub_sys_cd.equals("CNI")){	//Not checking the CNI module level.
				// 5. Checking R.VVD LEVEL
	 			dbDao.searchApInvVVDChacke(csr_no);
	 			log.error("\n DONE - approvalRequest.searchApInvVVDChacke:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			}

			//7. Updating HDR CSR NO -> Updating CSR_NO in AP_PAY_INV table.
			dbDao.upateInvCSRNo(payInvVOs, csr_no, "N");
			log.error("\n DONE - approvalRequest.upateInvCSRNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			

			//10. CSR AMT VAILD CHECK
			chkAmt = dbDao.checkCSRAmtVsInvAmt(csr_no);
			log.error("\n DONE - approvalRequest.checkCSRAmtVsInvAmt:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			if (chkAmt==null || (chkAmt!=null && !chkAmt.equals("Y"))){
				//throw new DAOException("\n\n Invoice header amout don't match invoice detail amount. \n\n Please, contact COL.");
				throw new DAOException(new ErrorHandler("CSR00080").getMessage());	//\n\n Invoice header amout don't match invoice detail amount. \n\n Please, contact COL.
			}

			//11. Checking existed or removed Rev.VVD master by Rev.VVD.
			revVVDSet = dbDao.checkMstRevVVD01(csr_no);

			if (revVVDSet!=null){
				while (revVVDSet.next()){
					vvd_cd = revVVDSet.getString("DTRB_COA_VVD_CD");
					inv_no = revVVDSet.getString("ATTR_CTNT1");
					log.debug("\n\n DTRB_COA_VVD_CD:"+revVVDSet.getString("DTRB_COA_VVD_CD")+" / inv_no:"+revVVDSet.getString("ATTR_CTNT1")+"  ---------------------  --------------------- ---------------------  \n\n");
					

					
					revVVDSet2 = dbDao.checkMstRevVVD02(vvd_cd);
					if (revVVDSet2!=null){
						while (revVVDSet2.next()){
							chk = revVVDSet2.getString("CHK");
							if (chk!=null){
								if (chk.trim().equals("Y")){
									tmp_del_vvd_inv = tmp_del_vvd_inv + (vvd_cd + " at the invoice " + inv_no + " has been deleted. ");
								}
							} else {
								tmp_not_found_vvd_inv = tmp_not_found_vvd_inv + (vvd_cd + " at the invoice " + inv_no + " is not found in Revenue VVD master. ");
							}
						}
					}
				}
			} else {
				throw new DAOException((new ErrorHandler("CSR00026").getMessage()));			
			}
			
			//12. Modifying INV_DESC if the module is PSO.
		
			if (inv_sub_sys_cd.equals("PSO")) {
				acctCdSet = dbDao.checkAcctCd(csr_no);
				// Updating the previous INV_DESC + (Actual VVD) to INV_DESC column in AP_INV_HDR table if the accunt code is 110911 and PSO_TRNS_SLP_CTNT is 'GO'.
				dbDao.modifyHdrDesc(csr_no);
				
				// Updating the previous INV_DESC + (Actual VVD) to INV_DESC column in AP_INV_DTRB table if the accunt code is 962111 or 110911.
				if (acctCdSet!=null) {
					while (acctCdSet.next()) {
						dtrb_coa_acct_cd = acctCdSet.getString("DTRB_COA_ACCT_CD");
						String modFlg = acctCdSet.getString("MOD_FLG");
						line_seq = acctCdSet.getString("LINE_SEQ");
						line_no  = acctCdSet.getString("LINE_NO");
						
						if (modFlg.equals("Y")) {
							dbDao.modifyDesc(csr_no, dtrb_coa_acct_cd, line_seq, line_no);
						}
					}
				}
			}
			
			hdrSet = dbDao.searchPreviewHDR(csr_no);
			log.error("\n DONE - searchPreVeiw.searchPreviewHDR:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			//
			dtrbSet = dbDao.searchPreviewDTRBList(csr_no);
			log.error("\n DONE - searchPreVeiw.searchPreviewDTRBList:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			grpVO.setHdrVOs(hdrSet);
			grpVO.setDtrbListVOs(dtrbSet);
			//Updating null to updated CSR_NO in AP_PAY_INV table.
			dbDao.upateInvCSRNoNull(payInvVOs);
			//Removing and Updating.
			dbDao.deleteApInvHDRDTRB(csr_no);
			dbDao.deleteApInvHDRDTRB02(csr_no);  
			log.error("\n DONE - searchPreVeiw.deleteApInvHDRDTRB:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n\n\n\n\n");

		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception ex) {
			throw new EventException(ex.getMessage());
		}
		return grpVO;
	}

	/**
	 * Implementing CSR Format button.
	 * @param String csrNo
	 * @return HdrDtrGrpVO
	 * @exception EventException
	 */
	public HdrDtrGrpVO tmpSearchPreVeiw(String csrNo) throws EventException {
		HdrDtrGrpVO grpVO = new HdrDtrGrpVO();
		HdrVO hdrSet = null;
		List<DtrbListVO> dtrbSet = null;

		try {
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> tmpSearchPreVeiw");
			hdrSet = dbDao.searchPreviewHDR(csrNo);
			dtrbSet = dbDao.searchPreviewDTRBList(csrNo);

			grpVO.setHdrVOs(hdrSet);
			grpVO.setDtrbListVOs(dtrbSet);

		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
		return grpVO;
	}

	/**
	 * Retrieving the list of CSR I/F
	 * @param IfCsrListInputVO ifCsrListInputVO
	 * @return List<IfCsrListInputVO>
	 * @exception EventException
	 */
	public List<IfCsrListInputVO> searchCsrIfList (IfCsrListInputVO ifCsrListInputVO) throws EventException {
		try {
			return dbDao.searchCsrIfList(ifCsrListInputVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Retrieving the list of the invoice 
	 * @param CSRSOlistVO cSRSOlistVO
	 * @return List<CSRSOlistVO>
	 * @exception EventException
	 */
	public List<CSRSOlistVO> searchCSRSOlist(CSRSOlistVO cSRSOlistVO) throws EventException {
		try {
			return dbDao.searchCSRSOlist(cSRSOlistVO);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}
 
	/**
	 * Retrieving the fleet form of the invoice list : searched the list of SO by the transfer slip 
	 * @param CSRSOhdrVO cSRSOhdrVO
	 * @return CSRSOhdrVO
	 * @exception EventException
	 */
	public CSRSOhdrVO searchCSRSOhdr(CSRSOhdrVO cSRSOhdrVO) throws EventException {
		try {
			return dbDao.searchCSRSOhdr(cSRSOhdrVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}
 
	/**
	 * Implementing CSR Cancel button - Saving the cancellation of I/F Error
	 * @param IfCsrListInputVO ifCsrListInputVO
	 * @param SignOnUserAccount signOnUserAccount
	 * @throws EventException
	 */
	public void multiConfirmCSR(IfCsrListInputVO ifCsrListInputVO, SignOnUserAccount signOnUserAccount) throws EventException{
		try {
			ifCsrListInputVO.setInvStsCd("X");
			ifCsrListInputVO.setAftActFlg("N");
			ifCsrListInputVO.setUpdUsrId(signOnUserAccount.getUsr_id());
			ifCsrListInputVO.setOfcCd(signOnUserAccount.getOfc_cd());

			dbDao.multiConfirmCSR(ifCsrListInputVO);
			dbDao.cancelCSR(ifCsrListInputVO);
			dbDao.cancelCSRApro1(ifCsrListInputVO);
			dbDao.cancelCSRApro2(ifCsrListInputVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Implementing CSR Cancel button of Approval Requested
	 * @param  IfCsrListInputVO ifCsrListInputVO
	 * @param  SignOnUserAccount signOnUserAccount
	 * @throws EventException
	 */
	public void cancelCSR(IfCsrListInputVO ifCsrListInputVO, SignOnUserAccount signOnUserAccount) throws EventException{
		try {
			ifCsrListInputVO.setInvStsCd("X");
			ifCsrListInputVO.setAftActFlg("X");
			ifCsrListInputVO.setUpdUsrId(signOnUserAccount.getUsr_id());
			ifCsrListInputVO.setOfcCd(signOnUserAccount.getOfc_cd());

			dbDao.multiConfirmCSR(ifCsrListInputVO);
			dbDao.cancelCSR(ifCsrListInputVO);
			dbDao.cancelCSRApro1(ifCsrListInputVO);
			dbDao.cancelCSRApro2(ifCsrListInputVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Saving the cancellation by invoice of A/P Rejected and Disapproved.
	 * @param Collection<PayInvVO> payInvVOs
	 * @param String[] chks
	 * @param CsrParmVO csrParmVO
	 * @param String userId
	 * @param String ofcCd
	 * @throws EventException
	 */
	public void multiRejectedCSRCancellation(Collection<PayInvVO> payInvVOs, String[] chks, CsrParmVO csrParmVO, String userId, String ofcCd) throws EventException {
		log.debug("\n BC.multiRejectedCSRCancellation \n");

		try {
			Collection updModels = new ArrayList<PayInvVO>();
			String ifStatus = csrParmVO.getIfStatus();
			String csrNo    = csrParmVO.getCsrNo();

			Iterator<PayInvVO> itr = payInvVOs.iterator();
			PayInvVO model = null;
			String inv_sts_cd = "";
			String delt_flg = "";

			int i = 0;
			while (itr.hasNext()) {

				model = (PayInvVO) itr.next();

				if(JSPUtil.getNull(model.getTml_inv_rjct_sts_cd()).equals("Y")){
					if(JSPUtil.getNull(model.getInv_sts_cd()).equals("B")){
						inv_sts_cd = "B";
					}else if(JSPUtil.getNull(model.getInv_sts_cd()).equals("G")){
						inv_sts_cd = "G";
					}
				}else{
					if(chks[i]!=null && chks[i].trim().equals("1") ){
						if(ifStatus.equals("R")){
							inv_sts_cd = "B";
						}else if(ifStatus.equals("J")){
							inv_sts_cd = "G";
						}
					}else{
						inv_sts_cd = "C";
					}
				}
				
				if(inv_sts_cd.equals("B") || inv_sts_cd.equals("G")){
					delt_flg = "Y";
				}else{
					delt_flg = "N";
				}
				
				//The parameter of query-1.
				model.setInv_sts_cd(JSPUtil.getNull(inv_sts_cd));
				model.setHld_flg(JSPUtil.getNull(delt_flg));
				model.setUpd_usr_id(JSPUtil.getNull(userId));
				model.setInv_ofc_cd(JSPUtil.getNull(ofcCd));
				model.setOfc_cd(JSPUtil.getNull(ofcCd));
				//The parameter of query-2.
				model.setCsr_no(csrNo);
				model.setInv_rgst_no(JSPUtil.getNull(model.getInv_rgst_no()));

				updModels.add(model);

				i++;
			}
			
			if(updModels.size() > 0){
				dbDao.multiRejectedCSRCancellation01(updModels);
				dbDao.multiRejectedCSRCancellation02(updModels);
				dbDao.multiRejectedCSRCancellation03(updModels);
				dbDao.multiRejectedCSRCancellation04(updModels);
			}
			
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Converting from CSR data of processing AP I/F to the standard XML document for the web service.
	 * @param String flag
	 * @param String sCsrNo
	 * @param String ofcCd
	 * @param ComAproRqstRoutVO comAproRqstRoutVO
	 * @return FNS0080003Document[]
	 * @exception EventException
	 */
	public FNS0080003Document[] approvalRequestAccount1(String flag, String sCsrNo, String ofcCd, ComAproRqstRoutVO comAproRqstRoutVO) throws EventException
	{
		DBRowSet 				rowSet				= null;
		FNS0080003Document[] 	docReq 				= null;
		try {

			/** APPROVAL CONFIRMATION	*/
			if ( flag.equals("C") )
			{
				//Getting the sending CSR information to AP.
				rowSet 	= dbDao.searchApInvInfForEAIInterface(sCsrNo, ofcCd);

				if( rowSet != null ){
					//Converting from CSR data of processing AP I/F to the standard XML document for the web service.
					docReq 		= eaiDao.transferAtOnceCSR024ToEAIByWS(rowSet, sCsrNo, comAproRqstRoutVO);

				}
			/** APPROVAL REJECTION [DISAPPROVED]	*/
			}

		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (EventException ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return docReq;
	}

	/**
	 * Saving the data to AP_INV_IF for AP I/F if CSR is created.
	 * @param String csrNo
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String createApInvIF(String csrNo, String ofcCd) throws EventException
	{
		String pgm_no = "";

		try{
			//6.Insert it to AP I/F.
			pgm_no = dbDao.createApInvIF(csrNo, ofcCd);
		    log.error("\n DONE - createApInvIF:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
		} catch (DAOException de) {
			log.error("\n DONE - createApInvIF.DAOException - CSR_NO:"+csrNo+" / "+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n\n");
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return pgm_no;
	}
	
	/**
	 * Calling CSR from EP.<br>
	 * @param String flag
	 * @param String sCsrNo
	 * @param ComAproRqstRoutVO model
	 * @exception EventException
	 */
	public void approvalRequestAccount2(String flag, String sCsrNo, ComAproRqstRoutVO model) throws EventException
	{
		//String 					hdr_gl_dt 	= "";
		String					title_name				= null;

		try {

			title_name	= model.getAproUsrJbTitNm()+"/"+model.getAproUsrNm();

			if ( flag.equals("C") )	{
				/**	The information of the last approver.( *GL_DT + APRO_FLG = 'Y' + the position and name of approver) UPDATE	*/
				dbDao.approvalRequestAccount	(sCsrNo, title_name);  
			}

		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

	}
 
	/**
	 * Converting from EP to calling CSR.<br>
	 * Modifying AP_PAY_INV data for using HPC
	 * @param String csrNo
	 * @param String gubun
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse approvalSrCSR(String csrNo, String gubun) throws EventException {
		try {
			dbDao.updateHPC(csrNo, gubun);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}

		return null;
	}    

    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoInvoiceInterfaceResult <br>
	 *
	 * @author sangyoung cha
	 * @param String csrNo
	 * @param String ifErrRsn
	 * @exception DAOException
	 */    
    public void manageSoInvoiceInterfaceResult(String csrNo, String ifErrRsn) throws EventException {
		try {
			
			dbDao.modifySoInvoiceInterfaceResult(csrNo, ifErrRsn); 
			dbDao.modifySoPayInvoiceInterface(csrNo, "E");  //ERROR  
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
    }
    
    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoInvoiceInterfaceSucess <br>
	 *
	 * @author sangyoung cha
	 * @param String csrNo
	 * @exception DAOException
	 */    
    public void manageSoInvoiceInterfaceSucess(String csrNo) throws EventException {
		try {
			
			dbDao.modifySoInvoiceInterfaceSucess(csrNo); 
			dbDao.modifySoPayInvoiceInterface(csrNo, "P"); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
    }
    
    
    /**
	 * STM_SAP_0250 : interface batch
	 * manageSoPayInvoiceInterface <br>
	 *
	 * @author ORKIM
	 * @param String csrNo
	 * @param String invStsCd
	 * @exception DAOException
	 */    
    public void modifySoPayInvoiceInterface(String csrNo, String invStsCd) throws EventException {
		try {
			
			dbDao.modifySoPayInvoiceInterface(csrNo, invStsCd); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
    }  
    
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
    public void modifySoPayInvoiceInterfaceBatchByStmSap(String invStsCd, String pay_bat_seq, String pay_bat_nm, String vndr_no) throws EventException {
		try {
			
			dbDao.modifySoPayInvoiceInterfaceBatchByStmSap(invStsCd, pay_bat_seq, pay_bat_nm, vndr_no); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}    	
    }
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceByStmSap
     * @param String csr_no
     * @exception EventException
     */
    public void modifyAPInvoiceByStmSap(String csr_no) throws EventException {
		try {
			
			dbDao.modifyAPInvoiceByStmSap(csr_no); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
    }  
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceDeleteByStmSap
     * @param String csr_no
     * @exception EventException
     */
    public void modifyAPInvoiceDeleteByStmSap(String csr_no) throws EventException {
		try {
			
			dbDao.modifyAPInvoiceDeleteByStmSap(csr_no); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}    	
    }
    
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoicePayBatchByStmSap
     * @param String pay_bat_seq
     * @param String pay_bat_nm
     * @param String vndr_no
     * @exception EventException
     */
    public void modifyAPInvoicePayBatchByStmSap(String pay_bat_seq, String pay_bat_nm, String vndr_no) throws EventException {
		try {
			
			dbDao.modifyAPInvoicePayBatchByStmSap(pay_bat_seq, pay_bat_nm, vndr_no); 
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}    	
    }
    
    /**
     * STM_SAP_0060 : interface payment<br>
     * modifyAPInvoiceRejectByStmSap
     * @param String csr_no
     * @param String rcv_err_flg
     * @param String rcv_err_rsn
     * @param String usr_id
     * @exception EventException
     */
    public void modifyAPInvoiceRejectByStmSap(String csr_no, String rcv_err_flg, String rcv_err_rsn,String usr_id) throws EventException {
		try {
			
			dbDao.modifyAPInvoiceRejectByStmSap(csr_no, rcv_err_flg, rcv_err_rsn, usr_id);
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
    }    
     
    
}