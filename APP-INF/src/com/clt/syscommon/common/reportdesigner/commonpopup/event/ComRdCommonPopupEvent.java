/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComRdCommonPopupEvent.java
*@FileTitle : COM_RD_COMMON_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.08.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.reportdesigner.commonpopup.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComBakEndJbVO;


/**
 * COM_RD_COMMON_POPUP 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_RD_COMMON_POPUPHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see COM_RD_COMMON_POPUPHTMLAction 참조
 * @since J2EE 1.6
 */

public class ComRdCommonPopupEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComBakEndJbVO comBakEndJbVO = null;

	public ComRdCommonPopupEvent(){}
	
	public void setComBakEndJbVO(ComBakEndJbVO comBakEndJbVO){
		this. comBakEndJbVO = comBakEndJbVO;
	}

	public ComBakEndJbVO getComBakEndJbVO(){
		return comBakEndJbVO;
	}

}