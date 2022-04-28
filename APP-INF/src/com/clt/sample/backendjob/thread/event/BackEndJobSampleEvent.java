/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackendjobEvent.java
*@FileTitle : BackEndJob
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.backendjob.thread.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComBakEndJbVO;


/**
 * BackEndJob 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BackEndJobHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see BackEndJobHTMLAction 참조
 * @since J2EE 1.6
 */

public class BackEndJobSampleEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComBakEndJbVO comBakEndJbVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComBakEndJbVO[] comBakEndJbVOs = null;

	public BackEndJobSampleEvent(){}
	
	public void setComBakEndJbVO(ComBakEndJbVO comBakEndJbVO){
		this. comBakEndJbVO = comBakEndJbVO;
	}

	public void setComBakEndJbVOS(ComBakEndJbVO[] comBakEndJbVOs){
		this. comBakEndJbVOs = comBakEndJbVOs;
	}

	public ComBakEndJbVO getComBakEndJbVO(){
		return comBakEndJbVO;
	}

	public ComBakEndJbVO[] getComBakEndJbVOS(){
		return comBakEndJbVOs;
	}

}