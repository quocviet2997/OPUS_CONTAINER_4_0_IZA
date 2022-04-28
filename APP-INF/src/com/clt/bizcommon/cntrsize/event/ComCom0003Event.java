/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ComCom0003Event.java
*@FileTitle : CNTR Size Common Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.14
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2009.04.20 민정호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.cntrsize.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.bizcommon.cntrsize.vo.MdmCntrSzListVO;


/**
 * COM_ENS_N11 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_ENS_N11HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Suk Jun Kim
 * @see COM_ENS_N11HTMLAction 참조
 * @since J2EE 1.4
 */

public class ComCom0003Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private MdmCntrSzListVO mdmcntrszlist = null;
	
	/** Table Value Object Multi Data 처리 */
	private MdmCntrSzListVO[] mdmcntrszlists = null;

	public ComCom0003Event(){}
	
	public void setMdmCntrSzListVO(MdmCntrSzListVO mdmcntrszlist){
		this. mdmcntrszlist = mdmcntrszlist;
	}

	public void setMdmCntrSzListVOS(MdmCntrSzListVO[] mdmcntrszlists){
		if(mdmcntrszlists != null){
			MdmCntrSzListVO[] tmpVOs = java.util.Arrays.copyOf(mdmcntrszlists, mdmcntrszlists.length);
			this.mdmcntrszlists = tmpVOs;
		}
	}

	public MdmCntrSzListVO getMdmCntrSzListVO(){
		return mdmcntrszlist;
	}

	public MdmCntrSzListVO[] getMdmCntrSzListVOS(){
		MdmCntrSzListVO[] rtnVOs = null;
		if (this.mdmcntrszlists != null) {
			rtnVOs = java.util.Arrays.copyOf(mdmcntrszlists, mdmcntrszlists.length);
		}
		return rtnVOs;
	}

}