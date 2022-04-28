/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComCsr0004Event.java
*@FileTitle : 세금계산서입력화면
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.09
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.09 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.TAXInfoVO;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ApPayInvVO;


/**
 * COM_CSR_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_CSR_0004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author HAM DAE SUNG
 * @see COM_CSR_0004HTMLAction 참조
 * @since J2EE 1.6
 */

public class ComCsr0004Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApPayInvVO apPayInvVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApPayInvVO[] apPayInvVOs = null;
	
	private TAXInfoVO	tAXInfoVO = null;

	public ComCsr0004Event(){}
	
	public void setApPayInvVO(ApPayInvVO apPayInvVO){
		this. apPayInvVO = apPayInvVO;
	}

	public void setApPayInvVOS(ApPayInvVO[] apPayInvVOs) {
		if (apPayInvVOs != null) {
			ApPayInvVO[] tmpVOs = new ApPayInvVO[apPayInvVOs.length];
			System.arraycopy(apPayInvVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.apPayInvVOs = tmpVOs;
		}
	}

	public ApPayInvVO getApPayInvVO(){
		return apPayInvVO;
	}

	public ApPayInvVO[] getApPayInvVOS() {
		ApPayInvVO[] rtnVOs = null;
		if (this.apPayInvVOs != null) {
			rtnVOs = new ApPayInvVO[apPayInvVOs.length];
			System.arraycopy(apPayInvVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @return the tAXInfoVO
	 */
	public TAXInfoVO getTAXInfoVO() {
		return tAXInfoVO;
	}
 
	/**
	 * @param infoVO the tAXInfoVO to set
	 */
	public void setTAXInfoVO(TAXInfoVO infoVO) {
		tAXInfoVO = infoVO;
	}
}