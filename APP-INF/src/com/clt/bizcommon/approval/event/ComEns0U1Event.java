/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0U1Event.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.event;

import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0T1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0U1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0U1Event extends EventSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4239335916203863181L;

	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalStaffVO approvalStaffVO = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalCsrVO approvalCsrVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApprovalCsrVO[] approvalCsrVOs = null;

	public ComEns0U1Event(){}
	
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
}
