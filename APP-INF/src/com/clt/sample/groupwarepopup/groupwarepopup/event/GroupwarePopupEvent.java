/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : GroupwarePopupEvent.java
*@FileTitle : GROUPWARE_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.groupwarepopup.groupwarepopup.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComEmlSndInfoVO;


/**
 * GROUPWARE_POPUP 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  GROUPWARE_POPUPHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see GROUPWARE_POPUPHTMLAction 참조
 * @since J2EE 1.6
 */

public class GroupwarePopupEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComEmlSndInfoVO comEmlSndInfoVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComEmlSndInfoVO[] comEmlSndInfoVOs = null;

	public GroupwarePopupEvent(){}
	
	public void setComEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO){
		this. comEmlSndInfoVO = comEmlSndInfoVO;
	}

	public void setComEmlSndInfoVOS(ComEmlSndInfoVO[] comEmlSndInfoVOs){
		this. comEmlSndInfoVOs = comEmlSndInfoVOs;
	}

	public ComEmlSndInfoVO getComEmlSndInfoVO(){
		return comEmlSndInfoVO;
	}

	public ComEmlSndInfoVO[] getComEmlSndInfoVOS(){
		return comEmlSndInfoVOs;
	}

}