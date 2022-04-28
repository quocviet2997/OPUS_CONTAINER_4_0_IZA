/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ComEns0Z2Event.java
*@FileTitle : CSR amount limitation setup history
*Open Issues :
*Change history :
*@LastModifyDate : 2017.10.18
*@LastModifier : YoNa Ha
*@LastVersion : 1.0
* 2017.10.18 YoNa Ha
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.event;

import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0Z2 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0Z2HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author YoNa Ha
 * @see COM_ENS_0Z2HTMLAction 참조
 * @since J2EE 1.4
 */

public class ComEns0Z2Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApprovalCsrAmountLimitVO ApprovalCsrAmountLimitVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApprovalCsrAmountLimitVO[] ApprovalCsrAmountLimitVOs = null;
	private String rhqOfcCd = null;
	private String ofcCdList = null;
	private String subSysCd = null;
	
	public ComEns0Z2Event(){}
	
	public void setApprovalCsrAmountLimitVO(ApprovalCsrAmountLimitVO ApprovalCsrAmountLimitVO){
		this. ApprovalCsrAmountLimitVO = ApprovalCsrAmountLimitVO;
	}

	public void setApprovalCsrAmountLimitVOS(ApprovalCsrAmountLimitVO[] ApprovalCsrAmountLimitVOs){
		if (ApprovalCsrAmountLimitVOs != null) {
			ApprovalCsrAmountLimitVO[] tmpVOs = new ApprovalCsrAmountLimitVO[ApprovalCsrAmountLimitVOs.length];
			System.arraycopy(ApprovalCsrAmountLimitVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.ApprovalCsrAmountLimitVOs = tmpVOs;
		}
	}

	public ApprovalCsrAmountLimitVO getApprovalCsrAmountLimitVO(){
		return ApprovalCsrAmountLimitVO;
	}

	public ApprovalCsrAmountLimitVO[] getApprovalCsrAmountLimitVOS(){
		ApprovalCsrAmountLimitVO[] tmpVOs = null;
		if (this.ApprovalCsrAmountLimitVOs != null) {
			tmpVOs = new ApprovalCsrAmountLimitVO[ApprovalCsrAmountLimitVOs.length];
			System.arraycopy(ApprovalCsrAmountLimitVOs, 0, tmpVOs, 0, tmpVOs.length);
		}
		return tmpVOs;
	}
	
	/**
	 * setRhqOfcCd
	 * @param rhqOfcCd
	 */
	public void setRhqOfcCd(String rhqOfcCd) {
		this.rhqOfcCd = rhqOfcCd;
	}
	
	/**
	 * getRhqOfcCd
	 * @return String
	 */
	public String getRhqOfcCd() {
		return this.rhqOfcCd;
	}
	
	/**
	 * setOfcCdList
	 * @param ofcCdList
	 */
	public void setOfcCdList(String ofcCdList) {
		this.ofcCdList = ofcCdList;
	}
	
	/**
	 * getOfcCdList
	 * @return String
	 */
	public String getOfcCdList() {
		return this.ofcCdList;
	}
	
	/**
	 * setSubSysCd
	 * @param subSysCd
	 */
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
	}
	
	/**
	 * getSubSysCd
	 * @return String
	 */
	public String getSubSysCd() {
		return this.subSysCd;
	}
}