/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : ApprovalBackEndJob.java
 *@FileTitle : 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2016.07.04
 *@LastModifier : KIM OK RYE
 *@LastVersion : 0.1
 * 2014.05.20
 * 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.basic;

//import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.backend.BackEndCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * It's ApprovalBackEndJob.java
 * @author ORKIM
 * @see BackEndCommandSupport
 * @since J2EE 1.6
 */
public class ApprovalBackEndJob extends BackEndCommandSupport  {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Backend job을 위한 DAO
	 */
	private	ApprovalBC 	   command;
	String usrId;
	ApprovalCsrVO[] approvalCsrVOs = null;
	SignOnUserAccount account = null;	
	ApprovalCsrVO approvalCsrVO = null;
	

	public ApprovalBackEndJob() {		
		command = new ApprovalBCImpl();	
	}
	
	
	public ApprovalCsrVO[] getApprovalCsrVOs() {
		return approvalCsrVOs;
	}

	public void setApprovalCsrVOs(ApprovalCsrVO[] approvalCsrVOs) {
		this.approvalCsrVOs = approvalCsrVOs;
	}

	public ApprovalCsrVO getApprovalCsrVO() {
		return approvalCsrVO;
	}

	public void setApprovalCsrVO(ApprovalCsrVO approvalCsrVO) {
		this.approvalCsrVO = approvalCsrVO;
	}
	
	public SignOnUserAccount getAccount() {
		return account;
	}


	public void setAccount(SignOnUserAccount account) {
		this.account = account;
	}
	
	
	/**
	 * It's a getter of usrId.
	 * @return String
	 */
	public String getUsrId() {
		return usrId;
	}
	
	/**
	 * It's a setter of usrId.
	 * @param String usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
    /**
	 * doStart
	 * 
	 * @return String[]
	 * @see com.clt.framework.support.layer.backend.BackEndCommandSupport#doStart()
	 * @exception Exception
    */	
	public String doStart() throws Exception {
		
		String rtnMsg = "";	//csr_no+"#"+apro_rqst_no+"#"+apro_rqst_seq+"#"+apro_rmk

		if(approvalCsrVOs != null) {
    		for (int i=0; i<approvalCsrVOs.length; i++) {
    			//결재 선택 건 체크 (ibflag = 'U')
    			if("U".equals(approvalCsrVOs[i].getIbflag())) {
    				try {
    					
    					//1) Approval화면에서 선택한 결재대상 기본정보
    					approvalCsrVO = approvalCsrVOs[i];
    					String sAppDup = command.checkApprovalDuplication(approvalCsrVO, account);
    					if("Y".equals(sAppDup)) {
	    					//2) 결재요청헤더의 결재상태 완료 여부 파악 - 완료된 건 중복 결재 피하기 위함  - 'P' 여부 체크
	    					boolean bAppComplete = command.searchApprovalCompletion(approvalCsrVO);
	    					if(bAppComplete) {
	    						throw new EventException((new ErrorHandler("CSR00091", new String[]{approvalCsrVO.getCsrNo()}).getMessage()));   //CSR No. has already Interfaced! Please check CSR No.
	    					} 
		    			
	    					//3) 결재 Update 수행 (Header & Route 정보)
	    					String errMsg = command.confirmApproval(approvalCsrVO, account);
		    			    // 최종 확인
	    					boolean bComplete = false;
	    					if (errMsg != null && errMsg.equals("")) {
	    						bComplete = command.searchLastApprovalRoute(approvalCsrVO);
	    					} else {
	    	    				rtnMsg = makeReturnInfo(approvalCsrVO, errMsg);
	    	    				log.error("confirmApproval Exception:::\n" + rtnMsg);
	    	    				throw new EventException(rtnMsg); 
	    	    			}
	    					// 최종 승인의 경우만 실행
	    					if (bComplete) { 
	    					
	    						//4) SAP Interface 수행
	    						EventResponse apEventResponse = new GeneralEventResponse();
		    				
//	    						AccountPayableInvoiceSC invSC = new AccountPayableInvoiceSC();
//		    					apEventResponse = invSC.manageSapIfValidateImportCheck("S/O_BIZ", approvalCsrVO.getCsrNo(), account.getUsr_id());
		    			
		    					
		    					Map<String, String> mapVO = new HashMap<String, String>();
		    					mapVO = apEventResponse.getETCData();
		    					String success_flg = mapVO.get("SUCCESS_FLG");
		    					String result_msg = mapVO.get("RESULT_MSG");
		    					
		    					log.debug("success_flg::" + success_flg);
		    					log.debug("result_msg::" + result_msg);	
		    					
		    					if (!success_flg.equals("SUCCESS")) {
		    						rtnMsg = makeReturnInfo(approvalCsrVO, result_msg);
		    						log.error("manageSapIfValidateImportCheck Exception:::\n" + rtnMsg);
		    						throw new EventException(rtnMsg); 
		    					}
		    					
	    	    			} 
    					}

					} catch (EventException ex) {
						log.error("[EventException]:"+ex.getMessage());
						String result_msg = ex.getMessage();
						
						String[] err_msg=result_msg.split("<\\|\\|>");
						String[] biz_err=result_msg.split("#");
						
						
						if(result_msg.indexOf("SAP00062") > 0) {
							if(err_msg != null && err_msg.length > 2) {
								result_msg = makeReturnInfo(approvalCsrVO, err_msg[err_msg.length-2]);
							} 
							throw new EventException(result_msg);
						}
						
						if(result_msg.indexOf("SAP00064") > 0) {
							if(err_msg != null && err_msg.length > 2) {
								result_msg = makeReturnInfo(approvalCsrVO, err_msg[err_msg.length-2]);
							} 
							throw new EventException(result_msg);
						}
						
						if(biz_err != null && biz_err.length > 0) {
							throw new EventException(result_msg); 
						} else {						
		
							if(err_msg != null && err_msg.length > 2) {
								result_msg = err_msg[err_msg.length-2];
							} 
							throw new EventException(result_msg);						
							
						}
					} catch (Exception ex) {
						log.error("[Exception]:"+ex.getMessage());
						String result_msg = ex.getMessage();
						
						String[] err_msg=result_msg.split("<\\|\\|>");
						if(err_msg != null && err_msg.length > 2) {
							result_msg = err_msg[err_msg.length-2];
						} 
						throw new EventException(result_msg);	
						
					}
	
    			}
    		}
		}
				
		return rtnMsg;

	}
	
	private String makeReturnInfo(ApprovalCsrVO vo, String msg) {
		String rtnStr = "";
		String delim = "#";
		
		rtnStr = vo.getCsrNo() + delim + vo.getAproRqstNo() + delim + vo.getAproRqstSeq() + delim + msg;
		
		return rtnStr;
	}
	


}