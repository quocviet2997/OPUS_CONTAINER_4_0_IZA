/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UiCtm0435Event.java
*@FileTitle : LogicsServiceProvider
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.23
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.23 우경민
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.logicsserviceprovider.event;

import com.clt.bizcommon.logicsserviceprovider.vo.RMdmVenderVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * ui_ctm_0435 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  ui_ctm_0435HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author KyungMin Woo
 * @see UI_CTM_0435HTMLAction 참조
 * @since J2EE 1.4
 */

public class UiCtm0435Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private RMdmVenderVO rMdmVender = null;
	
	/** Table Value Object Multi Data 처리 */
	private RMdmVenderVO[] rMdmVenders = null;
 
	public UiCtm0435Event(){}
	
	public void setRMdmVenderVO(RMdmVenderVO rMdmVender){
		this. rMdmVender = rMdmVender;
	}

	public void setRMdmVenderVOS(RMdmVenderVO[] rMdmVenders){
		if(rMdmVenders != null){
			RMdmVenderVO[] tmpVOs = java.util.Arrays.copyOf(rMdmVenders, rMdmVenders.length);
			this.rMdmVenders = tmpVOs;
		}
	}

	public RMdmVenderVO getRMdmVenderVO(){
		return rMdmVender;
	}

	public RMdmVenderVO[] getRMdmVenderVOS(){
		RMdmVenderVO[] rtnVOs = null;
		if (this.rMdmVenders != null) {
			rtnVOs = java.util.Arrays.copyOf(rMdmVenders, rMdmVenders.length);
		}
		return rtnVOs;
	}

}