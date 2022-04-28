/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0T1Event.java
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
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0T1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0T1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0T1Event extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1619473780139237972L;
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalStaffVO approvalStaffVO = null;
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalCsrVO approvalCsrVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApprovalRouteVO[] approvalRouteVOs = null;

	public ComEns0T1Event(){}
	
	public void setApprovalStaffVO(ApprovalStaffVO approvalStaffVO){
		this.approvalStaffVO = approvalStaffVO;
	}

	public void setApprovalRouteVOS(ApprovalRouteVO[] approvalRouteVOs){
		if(approvalRouteVOs != null){
			ApprovalRouteVO[] tmpVOs = java.util.Arrays.copyOf(approvalRouteVOs, approvalRouteVOs.length);
			this.approvalRouteVOs = tmpVOs;
		}
	}
	
	public void setApprovalCsrVO(ApprovalCsrVO approvalCsrVO){
		this.approvalCsrVO = approvalCsrVO;
	}

	public ApprovalStaffVO getApprovalStaffVO(){
		return approvalStaffVO;
	}

	public ApprovalRouteVO[] getApprovalRouteVOS(){
		ApprovalRouteVO[] rtnVOs = null;
		if (this.approvalRouteVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(approvalRouteVOs, approvalRouteVOs.length);
		}
		return rtnVOs;
	}
	
	public ApprovalCsrVO getApprovalCsrVO(){
		return approvalCsrVO;
	}
}
