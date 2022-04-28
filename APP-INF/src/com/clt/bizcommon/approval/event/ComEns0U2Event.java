/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComEns0U2Event.java
*@FileTitle : Approval Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.03
*@LastModifier : YoNa Ha
*@LastVersion : 1.0
* 2017.07.03 YoNa Ha
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.event;

import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * ESM_FLT_0035 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - ESM_FLT_0035HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author YoNa Ha
 * @see COM_ENS_0U2HTMLAction 참조
 * @since J2EE 1.4
 */

public class ComEns0U2Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalStaffVO approvalStaffVO = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalCsrVO approvalCsrVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApprovalCsrVO[] approvalCsrVOs = null;

	private String arHdQtrOfcCd = null;
	private String cOfcCd = null;
	private String aOfcCd = null;
	
	public ComEns0U2Event(){}
	
	public void setApprovalStaffVO(ApprovalStaffVO approvalStaffVO){
		this.approvalStaffVO = approvalStaffVO;
	}

	public void setApprovalCsrVOS(ApprovalCsrVO[] approvalCsrVOs){
		if(approvalCsrVOs != null){
			ApprovalCsrVO[] tmpVOs = java.util.Arrays.copyOf(approvalCsrVOs, approvalCsrVOs.length);
			this.approvalCsrVOs = tmpVOs;
		}
	}

	public ApprovalStaffVO getApprovalStaffVO(){
		return approvalStaffVO;
	}

	public ApprovalCsrVO[] getApprovalCsrVOS(){
		ApprovalCsrVO[] rtnVOs = null;
		if (this.approvalCsrVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(approvalCsrVOs, approvalCsrVOs.length);
		}
		return rtnVOs;
	}

	public ApprovalCsrVO getApprovalCsrVO() {
		return approvalCsrVO;
	}

	public void setApprovalCsrVO(ApprovalCsrVO approvalCsrVO) {
		this.approvalCsrVO = approvalCsrVO;
	}
	
	/**
	 * Column Info
	 * @return arHdQtrOfcCd
	 */
	public String getArHdQtrOfcCd() {
		return this.arHdQtrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param arHdQtrOfcCd
	 */
	public void setArHdQtrOfcCd(String arHdQtrOfcCd) {
		this.arHdQtrOfcCd = arHdQtrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cOfcCd
	 */
	public String getCOfcCd() {
		return this.cOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cOfcCd
	 */
	public void setCOfcCd(String cOfcCd) {
		this.cOfcCd = cOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aOfcCd
	 */
	public String getAOfcCd() {
		return this.aOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aOfcCd
	 */
	public void setAOfcCd(String aOfcCd) {
		this.aOfcCd = aOfcCd;
	}
}