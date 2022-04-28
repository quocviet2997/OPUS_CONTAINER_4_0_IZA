/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UiComEnsN12Event.java
*@FileTitle : Revenue VVD Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.28
*@LastModifier : 서창열
*@LastVersion : 1.0
* 2009.04.28 서창열
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.revenuevvd.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ArMstRevVvdVO;


/**
 * COM_ENS_N12 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  UI_COM_ENS_N12HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SEO CHANG YUL
 * @see COM_ENS_N12HTMLAction 참조
 * @since J2EE 1.4
 */

public class UiComEnsN12Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ArMstRevVvdVO arMstRevVvdVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ArMstRevVvdVO[] arMstRevVvdVOs = null;

	public UiComEnsN12Event(){}
	
	public void setArMstRevVvdVO(ArMstRevVvdVO arMstRevVvdVO){
		this. arMstRevVvdVO = arMstRevVvdVO;
	}

	public void setArMstRevVvdVOS(ArMstRevVvdVO[] arMstRevVvdVOs){
		if(arMstRevVvdVOs != null){
			ArMstRevVvdVO[] tmpVOs = java.util.Arrays.copyOf(arMstRevVvdVOs, arMstRevVvdVOs.length);
			this.arMstRevVvdVOs = tmpVOs;
		}
	}

	public ArMstRevVvdVO getArMstRevVvdVO(){
		return arMstRevVvdVO;
	}

	public ArMstRevVvdVO[] getArMstRevVvdVOS(){
		ArMstRevVvdVO[] rtnVOs = null;
		if (this.arMstRevVvdVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(arMstRevVvdVOs, arMstRevVvdVOs.length);
		}
		return rtnVOs;
	}

}