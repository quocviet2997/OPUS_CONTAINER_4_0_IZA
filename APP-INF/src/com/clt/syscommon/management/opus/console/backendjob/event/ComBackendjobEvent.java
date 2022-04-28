/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComBackendjobEvent.java
*@FileTitle : COM_BACKENDJOB
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.console.backendjob.event;

import java.util.Arrays;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComBakEndJbVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtDtlVO;


/**
 * COM_BACKENDJOB 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_BACKENDJOBHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see COM_BACKENDJOBHTMLAction 참조
 * @since J2EE 1.6
 */

public class ComBackendjobEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComBakEndJbVO comBakEndJbVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComBakEndJbVO[] comBakEndJbVOs = null;

	public ComBackendjobEvent(){}
	
	public void setComBakEndJbVO(ComBakEndJbVO comBakEndJbVO){
		this. comBakEndJbVO = comBakEndJbVO;
	}

	public void setComBakEndJbVOS(ComBakEndJbVO[] comBakEndJbVOs){
		if(comBakEndJbVOs != null){
			ComBakEndJbVO[] tmpVOs = Arrays.copyOf(comBakEndJbVOs, comBakEndJbVOs.length);
			this.comBakEndJbVOs  = tmpVOs;
		}
	}

	public ComBakEndJbVO getComBakEndJbVO(){
		return comBakEndJbVO;
	}

	public ComBakEndJbVO[] getComBakEndJbVOS(){
		ComBakEndJbVO[] rtnVOs = null;
		if (this.comBakEndJbVOs != null) {
			rtnVOs = Arrays.copyOf(comBakEndJbVOs, comBakEndJbVOs.length);
		}
		return rtnVOs;
	}

}