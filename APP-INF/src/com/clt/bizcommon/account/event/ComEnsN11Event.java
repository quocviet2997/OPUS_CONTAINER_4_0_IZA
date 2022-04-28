/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComEnsN11Event.java
*@FileTitle : Account Code
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.04.20 김석준
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.account.event;

import com.clt.bizcommon.account.vo.SearchMdmAccountVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_N11 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_ENS_N11HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Suk Jun Kim
 * @see COM_ENS_N11HTMLAction 참조
 * @since J2EE 1.4
 */

public class ComEnsN11Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchMdmAccountVO mdmaccountvo = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchMdmAccountVO[] mdmaccountvos = null;

	public ComEnsN11Event(){}
	
	public void setMdmAccountVO(SearchMdmAccountVO mdmaccountvo){
		this. mdmaccountvo = mdmaccountvo;
	}

	public void setMdmAccountVOS(SearchMdmAccountVO[] mdmaccountvos){
		if(mdmaccountvos != null){
			SearchMdmAccountVO[] tmpVOs = java.util.Arrays.copyOf(mdmaccountvos, mdmaccountvos.length);
			this.mdmaccountvos = tmpVOs;
		}
	}

	public SearchMdmAccountVO getMdmAccountVO(){
		return mdmaccountvo;
	}

	public SearchMdmAccountVO[] getMdmAccountVOS(){
		SearchMdmAccountVO[] rtnVOs = null;
		if (this.mdmaccountvos != null) {
			rtnVOs = java.util.Arrays.copyOf(mdmaccountvos, mdmaccountvos.length);
		}
		return rtnVOs;
	}

}