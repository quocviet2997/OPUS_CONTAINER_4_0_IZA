/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestBackEndJob.java
*@FileTitle : Approval Request BackEndJob
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.clt.bizcommon.approval.util.ApprovalUtil;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration.ConsultationSlipRequestMgtDBDAO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AutoRevVVDListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOhdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CreateApInvDTRBASANoSelectVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.backend.BackEndCommandSupport;
import com.clt.syscommon.common.table.ApInvDtrbVO;
 
/**
 * ALPS-ConsultationSlipRequestMgt Long Transaction Business Logic <br>
 * - The business logic of Long Transaction about ALPS-ConsultationSlipRequestMgt<br>
 *
 * @author 
 * @see com_csr_0002 
 * @since J2EE 1.6
 */
public class ConsultationSlipRequestBackEndJob extends BackEndCommandSupport {
	
	private ConsultationSlipRequestMgtDBDAO dbDao;
	private String jobFlg = null;
	private String creUsrId = null;
	private List<AutoRevVVDListVO> autoRevVVDListVO = null;
	private List<SearchDTRBTtlVO> searchDTRBTtlVOList = null;
	private CsrParmVO csrParmVO = null;
	private Collection<PayInvVO> payInvVOs = null;

	/**
	 * serialVersionUID 
	 */
	private static final long serialVersionUID = -4432166936180768897L;

	/**
	 * Main Start
	 * @return List<EstmActRsltVO>
	 * @throws Exception
	 */
	public String doStart() throws Exception {
        String csr_no = null;
        try{
	        dbDao = new ConsultationSlipRequestMgtDBDAO();
	
	       if ("SAVE".equals(jobFlg)){
	    	   csr_no = this.approvalRequest(payInvVOs, autoRevVVDListVO, searchDTRBTtlVOList, csrParmVO, creUsrId);
	        }
		} catch (DAOException de) {
			log.error("\n DONE - approvalRequest.DAOException - CSR_NO:"+csr_no+" / "+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n\n");
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
        return csr_no;
	}

	/**
	 * JOB FLAG setting
	 * @param String jobFlg
	 */
	public void setJobFlg(String jobFlg){
		this.jobFlg = jobFlg;
	}
	
	/**
	 * @return the creUsrId
	 */
	public String getCreUsrId() {
		return creUsrId;
	}

	/**
	 * @param creUsrId the creUsrId to set
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	/**
	 * @return the searchDTRBTtlVOList
	 */
	public List<SearchDTRBTtlVO> getSearchDTRBTtlVOList() {
		return searchDTRBTtlVOList;
	}

	/**
	 * @param searchDTRBTtlVOList the searchDTRBTtlVOList to set
	 */
	public void setSearchDTRBTtlVOList(List<SearchDTRBTtlVO> searchDTRBTtlVOList) {
		this.searchDTRBTtlVOList = searchDTRBTtlVOList;
	}
	
	/**
	 * @return the autoRevVVDListVO
	 */
	public List<AutoRevVVDListVO> getAutoRevVVDListVO() {
		return autoRevVVDListVO;
	}

	/**
	 * @param autoRevVVDListVO the autoRevVVDListVO to set
	 */
	public void setAutoRevVVDListVO(List<AutoRevVVDListVO> autoRevVVDListVO) {
		this.autoRevVVDListVO = autoRevVVDListVO;
	}
	
	/**
	 * @return the csrParmVO
	 */
	public CsrParmVO getCsrParmVO() {
		return csrParmVO;
	}

	/**
	 * @param csrParmVO the csrParmVO to set
	 */
	public void setCsrParmVO(CsrParmVO csrParmVO) {
		this.csrParmVO = csrParmVO;
	}

	/**
	 * @return the payInvVOs
	 */
	public Collection<PayInvVO> getPayInvVOs() {
		return payInvVOs;
	}

	/**
	 * @param payInvVOs the payInvVOs to set
	 */
	public void setPayInvVOs(Collection<PayInvVO> payInvVOs) {
		this.payInvVOs = payInvVOs;
	}

	/**
	 * Estimation Save
	 * @throws Exception
	 */
	private String approvalRequest(Collection<PayInvVO> payInvVOs, List<AutoRevVVDListVO> autoRevVVDListVO, List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws Exception {

		log.error("\n\n\n\n\n BCImpl approvalRequest >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> approvalRequest");
		log.error("\n approvalRequest:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

		String asa_no 	 = csrParmVO.getAsaNoS();
		String csr_tp_cd = csrParmVO.getCsrTpCd();
//		String cnt_cd 	 = csrParmVO.getCntCd();
//		String evi_gb 	 = csrParmVO.getEviGb();
		String csr_no 	 = "";
		String chkAmt    = ""; 
		//Adding the TLL logic
		String inv_sub_sys_cd = csrParmVO.getInvSubSysCd();
		String ofc_cd    	  = JSPUtil.getNull(csrParmVO.getOfcCd());
		String cost_ofc_cd    = JSPUtil.getNull(csrParmVO.getCostOfcCd());
		//createApInvDTRB_sum
		DBRowSet		dtrbSumSet	= null;		
		String inv_no2			= "";
		String vndr_seq			= ""; 
		String gap		 		= "";
		String cost_cd	 		= "";
		String cntr_tpsz_cd		= ""; 
		//Rev.VVD
		DBRowSet 		revVVDSet 	= null;
		DBRowSet 		revVVDSet2 	= null;
		DBRowSet 		acctCdSet 	= null;
		DBRowSet 		actSet 	= null;
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
		String attr_ctnt11 = "";
		String attr_ctnt12 = "";
		String attr_ctnt14 = "";
		String inv_rgst_no = "";
		String inv_status = "";
		
		
		try {
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
			
			dbDao.searchApInvChacke2(payInvVOs);
			log.error("\n DONE - approvalRequest.searchApInvChacke2:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			csr_no = dbDao.multiCSRNo(cost_ofc_cd, csr_tp_cd, inv_sub_sys_cd);
			dbDao.multiCSRInsert(cost_ofc_cd, csr_no, creUsrId);

			log.error("\n DONE - approvalRequest.multiCSRNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			csrParmVO.setCsrNo(csr_no); 
			
			// 2016.11.30 CSR 처리시 생성하는 Revenue VVD에 대해서 비용 모듈에서 처리한 Revenue VVD에 변경 하는 기능 제거
			//if(!inv_sub_sys_cd.equals("CNI") && autoRevVVDListVO.size() > 0){	
			//	dbDao.modifyAutoRevVVD(autoRevVVDListVO);
			//	log.error("\n DONE - searchPreVeiw.modifyAutoRevVVD:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			//}
			
			dbDao.createApInvHDR(csrParmVO, creUsrId);
			log.error("\n DONE - approvalRequest.createApInvHDR:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

//			new ApprovalUtil().checkValidBankAcctFlg(csr_no); // [2018-01-24] mdm vendor의 bank acct flg 확인
			
			//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
			dbDao.createApInvDTRB(searchDTRBTtlVOList, csrParmVO, creUsrId);  
			log.error("\n DONE - approvalRequest.createApInvDTRB:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			dbDao.modifyApInvDTRBLineNo(csr_no);
			dtrbLineSet = dbDao.modifyApInvDTRBLineNo03(csr_no);
			if (dtrbLineSet != null) {
				while(dtrbLineSet.next()){
					apInvDtrbVO = new ApInvDtrbVO();
					
					apInvDtrbVO.setLineNo(dtrbLineSet.getString("line_no"));
					apInvDtrbVO.setCsrNo(csr_no);
					apInvDtrbVO.setAttrCtnt1(dtrbLineSet.getString("attr_ctnt1"));
					apInvDtrbVO.setDtrbCoaAcctCd(dtrbLineSet.getString("dtrb_coa_acct_cd"));
					apInvDtrbVO.setDtrbCoaVvdCd(dtrbLineSet.getString("dtrb_coa_vvd_cd"));
					apInvDtrbVO.setActYm(dtrbLineSet.getString("act_ym"));
					apInvDtrbVO.setActVvdCd(dtrbLineSet.getString("act_vvd_cd"));
					apInvDtrbVO.setAttrCtnt7(dtrbLineSet.getString("attr_ctnt7"));
					apInvDtrbVO.setAttrCtnt10(dtrbLineSet.getString("attr_ctnt10"));
					apInvDtrbVO.setAttrCtnt13(dtrbLineSet.getString("attr_ctnt13"));
					
					lineNoVoList.add(apInvDtrbVO);
				}
			}
			dbDao.modifyApInvDTRBLineNo02(lineNoVoList); 
			
			log.error("\n DONE - approvalRequest.modifyApInvDTRBLineNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			
			Iterator itr   =	payInvVOs.iterator();
			PayInvVO model = null;

			while (itr.hasNext()) {
				model 			= (PayInvVO)itr.next();
				inv_no = model.getInv_no();
				vndr_seq = model.getVndr_seq();
				inv_rgst_no = model.getInv_rgst_no();
				
				dtrbSumSet = dbDao.createApInvDTRB_sum(csr_no, inv_no, vndr_seq);
				
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
				
				inv_status = dbDao.searchCsrCreationCheck(inv_rgst_no); // 동시 접속자에 의한 중복 CSR 생성 방지 체크 2016.04.21
				log.error("\n DONE - approvalRequest.searchCsrCreationCheck:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
				if (inv_status==null || inv_status.equals("") || inv_status.equals("A")){
					throw new DAOException("Invoice No.:" +  inv_no + " is already created. Please check the invoice.");
				}
				
				/** [2018-01-16] PSO 요구사항 : P전표일때 PSO BC 실행  **/
				if (inv_sub_sys_cd.equals("PSO") && csr_tp_cd.equals("P")) {
//					new GeneralInvoiceAuditBCImpl().updatePsoChargeCsrNo(inv_rgst_no, csr_no);
				}
			}
			
			log.error("\n DONE - approvalRequest.createApInvDTRB_sum:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			if (!asa_no.equals("")) {
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
			 
			new ApprovalUtil().checkValidBankAcctFlg(csr_no); // [2018-04-12] 검사 위치 조정  + [2018-01-24] mdm vendor의 bank acct flg 확인
			
			if(!inv_sub_sys_cd.equals("CNI")){	
	 			dbDao.searchApInvVVDChacke(csr_no);
	 			log.error("\n DONE - approvalRequest.searchApInvVVDChacke:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			}

			dbDao.upateInvCSRNo(payInvVOs, csr_no,"Y");
			log.error("\n DONE - approvalRequest.upateInvCSRNo:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			dbDao.createCSREPApproval(csrParmVO);
			log.error("\n DONE - approvalRequest.createCSREPApproval:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			dbDao.modifyStsCdSOHDR(payInvVOs, "A");
			log.error("\n DONE - approvalRequest.modifyStsCdSOHDR:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");

			chkAmt = dbDao.checkCSRAmtVsInvAmt(csr_no);
			log.error("\n DONE - approvalRequest.checkCSRAmtVsInvAmt:"+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n");
			if (chkAmt==null || (chkAmt!=null && !chkAmt.equals("Y"))){
				throw new DAOException(new ErrorHandler("CSR00080").getMessage());	//\n\n Invoice header amout don't match invoice detail amount. \n\n Please, contact COL.
			}

			revVVDSet = dbDao.checkMstRevVVD01(csr_no);

			if (revVVDSet != null) {
				while (revVVDSet.next()) {
					vvd_cd = revVVDSet.getString("DTRB_COA_VVD_CD");
					inv_no = revVVDSet.getString("ATTR_CTNT1");
					log.debug("\n\n DTRB_COA_VVD_CD:"+revVVDSet.getString("DTRB_COA_VVD_CD")+" / inv_no:"+revVVDSet.getString("ATTR_CTNT1")+"  ---------------------  --------------------- ---------------------  \n\n");

					revVVDSet2 = dbDao.checkMstRevVVD02(vvd_cd);
					if (revVVDSet2 != null) {
						while (revVVDSet2.next()) {
							chk = revVVDSet2.getString("CHK");
							if (chk != null) {
								if (chk.trim().equals("Y")) {
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
			
			
			if (inv_sub_sys_cd.equals("PSO")) {
				acctCdSet = dbDao.checkAcctCd(csr_no);	
				
				dbDao.modifyHdrDesc(csr_no);
				
				if (acctCdSet!=null){
					while (acctCdSet.next()){
						dtrb_coa_acct_cd = acctCdSet.getString("DTRB_COA_ACCT_CD");
						String modFlg = acctCdSet.getString("MOD_FLG");
						line_seq = acctCdSet.getString("LINE_SEQ");
						line_no  = acctCdSet.getString("LINE_NO");
						
//						if(dtrb_coa_acct_cd.equals("962111") || dtrb_coa_acct_cd.equals("110911")){
						if(modFlg.equals("Y")) {
							dbDao.modifyDesc(csr_no, dtrb_coa_acct_cd, line_seq, line_no);
						}
					}
				}
			}
			
			//2014.10.30 ACTIVITY DATE/PLACE LOGIC ADD by IY Cho
			acctCdSet = dbDao.checkAcctCd(csr_no);
			if (acctCdSet!=null){
				while (acctCdSet.next()){
					dtrb_coa_acct_cd = acctCdSet.getString("DTRB_COA_ACCT_CD");
					cost_cd = acctCdSet.getString("FTU_USE_CTNT1");
					line_seq = acctCdSet.getString("LINE_SEQ"); 
					attr_ctnt11 = acctCdSet.getString("ATTR_CTNT11");
					attr_ctnt12 = acctCdSet.getString("ATTR_CTNT12");
					attr_ctnt14 = acctCdSet.getString("ATTR_CTNT14");
					
					if(inv_sub_sys_cd.equals("TLL")){
						inv_sub_sys_cd = "MNR";
					}
					
					if(attr_ctnt11==null || attr_ctnt11.trim().equals("") || attr_ctnt12==null || attr_ctnt12.trim().equals("") || attr_ctnt14==null || attr_ctnt14.trim().equals("")){
						if(!cost_cd.equals("")){
							actSet = dbDao.searchActivity(inv_sub_sys_cd, cost_cd, dtrb_coa_acct_cd);
							if(actSet != null){
								while(actSet.next()){
									String act_dt = actSet.getString("ACTIVITY_DATE");
									String act_plc = actSet.getString("ACTIVITY_PLACE");
									dbDao.modifyActivity(csr_no, line_seq, act_dt, act_plc);
								}
							}
						}else{
							dbDao.modifyActivity2(csr_no, line_seq);
						}
					}
				}
			}
			
		} catch (DAOException de) {
			log.error("\n DONE - approvalRequest.DAOException - CSR_NO:"+csr_no+" / "+((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS")).format(new java.util.Date()))+"\n\n");
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}

		return csr_no;	
	}
	
}
