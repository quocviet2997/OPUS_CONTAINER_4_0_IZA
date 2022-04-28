/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ComCom0002Event.java
*@FileTitle : CNTR Type Common Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.14
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2009.04.20 민정호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.cntrtype.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.bizcommon.cntrtype.vo.MdmCntrTpListVO;


/**
 * COM_ENS_N11 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_ENS_N11HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Suk Jun Kim
 * @see COM_ENS_N11HTMLAction 참조
 * @since J2EE 1.4
 */

public class ComCom0002Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private MdmCntrTpListVO mdmcntrtplist = null;
	
	/** Table Value Object Multi Data 처리 */
	private MdmCntrTpListVO[] mdmcntrtplists = null;

	public ComCom0002Event(){}
	
	public void setMdmCntrTpListVO(MdmCntrTpListVO mdmcntrtplist){
		this. mdmcntrtplist = mdmcntrtplist;
	}

	public void setMdmCntrTpListVOS(MdmCntrTpListVO[] mdmcntrtplists){
		if(mdmcntrtplists != null){
			MdmCntrTpListVO[] tmpVOs = java.util.Arrays.copyOf(mdmcntrtplists, mdmcntrtplists.length);
			this.mdmcntrtplists = tmpVOs;
		}
	}

	public MdmCntrTpListVO getMdmCntrTpListVO(){
		return mdmcntrtplist;
	}

	public MdmCntrTpListVO[] getMdmCntrTpListVOS(){
		MdmCntrTpListVO[] rtnVOs = null;
		if (this.mdmcntrtplists != null) {
			rtnVOs = java.util.Arrays.copyOf(mdmcntrtplists, mdmcntrtplists.length);
		}
		return rtnVOs;
	}

}