/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ComCom1001Event.java
*@FileTitle : CENTER CODE ENTRY
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlCtrErpVO;
import com.clt.framework.support.layer.event.EventSupport;



/**
 * COM_COM_1001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_1001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see COM_COM_1001HTMLAction 참조
 * @since J2EE 1.6
 */
public class ComCom1001Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	private GlCtrErpVO glCtrErpVO;

	private GlCtrErpVO[] glCtrErpVOs;

	public ComCom1001Event() {
	}

	public GlCtrErpVO getGlCtrErpVO() {
		return glCtrErpVO;
	}

	public void setGlCtrErpVO(GlCtrErpVO glCtrErpVO) {
		this.glCtrErpVO = glCtrErpVO;
	}

	public GlCtrErpVO[] getGlCtrErpVOs() {
		//return glCtrErpVOs;
		GlCtrErpVO[] rtnVOs = null;
		if(this.glCtrErpVOs != null) {
			rtnVOs = new GlCtrErpVO[glCtrErpVOs.length];
			System.arraycopy(glCtrErpVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setGlCtrErpVOs(GlCtrErpVO[] glCtrErpVOs) {
		//this.glCtrErpVOs = glCtrErpVOs;
		if(glCtrErpVOs != null) {
			GlCtrErpVO[] tmpVOs = new GlCtrErpVO[glCtrErpVOs.length];
			System.arraycopy(glCtrErpVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.glCtrErpVOs = tmpVOs;
		}
	}
}
