/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComCsr0003Event.java
*@FileTitle : CSR Creation – Detail (국외)
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.02 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_CSR_0003 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_CSR_0003HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author HAM DAE SUNG
 * @see COM_CSR_0003HTMLAction 참조
 * @since J2EE 1.6
 */

public class ComCsr0003Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApPayInvListVO apPayInvListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApPayInvListVO[] apPayInvListVOs = null;

	public ComCsr0003Event(){}
	
	public void setApPayInvListVO(ApPayInvListVO apPayInvListVO){
		this. apPayInvListVO = apPayInvListVO;
	}

	public void setApPayInvListVOs(ApPayInvListVO[] apPayInvListVOs) {
		if (apPayInvListVOs != null) {
			ApPayInvListVO[] tmpVOs = new ApPayInvListVO[apPayInvListVOs.length];
			System.arraycopy(apPayInvListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.apPayInvListVOs = tmpVOs;
		}
	}

	public ApPayInvListVO getApPayInvListVO(){
		return apPayInvListVO;
	}

	public ApPayInvListVO[] getApPayInvListVOS() {
		ApPayInvListVO[] rtnVOs = null;
		if (this.apPayInvListVOs != null) {
			rtnVOs = new ApPayInvListVO[apPayInvListVOs.length];
			System.arraycopy(apPayInvListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

}