/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UI_PRI_4002Event.java
*@FileTitle : PerType
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 박광석
*@LastVersion : 1.0
* 2009.04.08 박광석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.pertype.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.PriRatUtVO;


/**
 * UI_PRI_4002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  UI_PRI_4002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Prak Kwang Seok
 * @see UI_PRI_4002HTMLAction 참조
 * @since J2EE 1.4
 */

public class UiPri4002Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private PriRatUtVO pretypevo = null;
 

	/** Table Value Object Multi Data 처리 */
	private PriRatUtVO[] pretypevos = null;

	public UiPri4002Event(){}

	public PriRatUtVO getPretypevo() {
		return pretypevo;
	}

	public void setPretypevo(PriRatUtVO pretypevo) {
		this.pretypevo = pretypevo;
	}

	public PriRatUtVO[] getPretypevos() {
		PriRatUtVO[] rtnVOs = null;
		if (this.pretypevos != null) {
			rtnVOs = java.util.Arrays.copyOf(pretypevos, pretypevos.length);
		}
		return rtnVOs;
	}

	public void setPretypevos(PriRatUtVO[] pretypevos){
		if(pretypevos != null){
			PriRatUtVO[] tmpVOs = java.util.Arrays.copyOf(pretypevos, pretypevos.length);
			this.pretypevos = tmpVOs;
		}
	}
}