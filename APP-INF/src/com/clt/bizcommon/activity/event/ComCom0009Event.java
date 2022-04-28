/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ComCom0010Event.java
*@FileTitle : Movement Code
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2012.02.17 김종옥
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.activity.event;

import com.clt.bizcommon.activity.vo.SearchMdmActivityVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_COM_0010 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_0010HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author KIM JONG OCK
 * @see COM_COM_0009HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0009Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchMdmActivityVO mdmactivityvo = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchMdmActivityVO[] mdmactivityvos = null;

	public ComCom0009Event(){}
	
	public void setSearchMdmActivityVO(SearchMdmActivityVO mdmactivityvo){
		this. mdmactivityvo = mdmactivityvo;
	}

	public void setSearchMdmActivityVOS(SearchMdmActivityVO[] mdmactivityvos){
		if(mdmactivityvos != null){
			SearchMdmActivityVO[] tmpVOs = java.util.Arrays.copyOf(mdmactivityvos, mdmactivityvos.length);
			this.mdmactivityvos = tmpVOs;
		}
	}

	public SearchMdmActivityVO getSearchMdmActivityVO(){
		return mdmactivityvo;
	}

	public SearchMdmActivityVO[] getSearchMdmActivityVOS(){
		SearchMdmActivityVO[] rtnVOs = null;
		if (this.mdmactivityvos != null) {
			rtnVOs = java.util.Arrays.copyOf(mdmactivityvos, mdmactivityvos.length);
		}
		return rtnVOs;
	}

}