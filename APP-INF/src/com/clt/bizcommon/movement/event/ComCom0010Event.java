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
package com.clt.bizcommon.movement.event;

import com.clt.bizcommon.movement.vo.SearchMdmMovementVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_COM_0010 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_0010HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author KIM JONG OCK
 * @see COM_COM_0010HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0010Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchMdmMovementVO mdmmovementvo = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchMdmMovementVO[] mdmmovementvos = null;

	public ComCom0010Event(){}
	
	public void setMdmMovementVO(SearchMdmMovementVO mdmmovementvo){
		this. mdmmovementvo = mdmmovementvo;
	}

	public void setMdmMovementVOS(SearchMdmMovementVO[] mdmmovementvos){
		if(mdmmovementvos != null){
			SearchMdmMovementVO[] tmpVOs = java.util.Arrays.copyOf(mdmmovementvos, mdmmovementvos.length);
			this.mdmmovementvos = tmpVOs;
		}
	}

	public SearchMdmMovementVO getMdmMovementVO(){
		return mdmmovementvo;
	}

	public SearchMdmMovementVO[] getMdmMovementVOS(){
		SearchMdmMovementVO[] rtnVOs = null;
		if (this.mdmmovementvos != null) {
			rtnVOs = java.util.Arrays.copyOf(mdmmovementvos, mdmmovementvos.length);
		}
		return rtnVOs;
	}

}