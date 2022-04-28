/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CsrComExternalEvent.java
*@FileTitle : 공통유틸
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.15
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.10.15 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.event;

import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.vo.SpCsrVO;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ApPayInvDtlVO;
import com.clt.syscommon.common.table.ApPayInvVO;

/**
 * SCG_COM_ 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  SCG_COM_HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Dohyoung Lee
 * @see CSR_COM_EXTERNALHTMLAction 참조
 * @since J2EE 1.4
 */

public class CsrComExternalEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	//Service Provider Detail Information   
	private SpCsrVO spCsrVO = null;

	/** AP_PAY_INV 저장처리  */
	private ApPayInvVO apPayInvVO = null;
	 
	/** AP_PAY_INV_DTL 목록 저장처리 */
	private ApPayInvDtlVO[] apPayInvDtlVOs = null;
	
	/**
	 * @return the spCsrVO
	 */
	public SpCsrVO getSpCsrVO() {
		return spCsrVO;
	}

	/**
	 * @param spCsrVO the spCsrVO to set
	 */
	public void setSpCsrVO(SpCsrVO spCsrVO) {
		this.spCsrVO = spCsrVO;
	}

	/**
	 * @return the apPayInvVO
	 */
	public ApPayInvVO getApPayInvVO() {
		return apPayInvVO;
	}

	/**
	 * @param apPayInvVO the apPayInvVO to set
	 */
	public void setApPayInvVO(ApPayInvVO apPayInvVO) {
		this.apPayInvVO = apPayInvVO;
	}

	/**
	 * @return the apPayInvDtlVOs
	 */
	public ApPayInvDtlVO[] getApPayInvDtlVOs() {
		ApPayInvDtlVO[] rtnVOs = null;
		if (this.apPayInvDtlVOs != null) {
			rtnVOs = new ApPayInvDtlVO[apPayInvDtlVOs.length];
			System.arraycopy(apPayInvDtlVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param apPayInvDtlVOs the apPayInvDtlVOs to set
	 */
	public void setApPayInvDtlVOs(ApPayInvDtlVO[] apPayInvDtlVOs) {
		if (apPayInvDtlVOs != null) {
			ApPayInvDtlVO[] tmpVOs = new ApPayInvDtlVO[apPayInvDtlVOs.length];
			System.arraycopy(apPayInvDtlVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.apPayInvDtlVOs = tmpVOs;
		}
	}
 

}