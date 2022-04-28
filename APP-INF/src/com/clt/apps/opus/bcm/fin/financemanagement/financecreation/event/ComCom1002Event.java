/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ComCom1002Event.java
*@FileTitle : ERROR VVD ENTRY
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlErrVvdVO;
import com.clt.framework.support.layer.event.EventSupport;



/**
 * COM_COM_1002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_1002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see COM_COM_1002HTMLAction 참조
 * @since J2EE 1.6
 */
public class ComCom1002Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	private GlErrVvdVO glErrVvdVO;

	private GlErrVvdVO[] glErrVvdVOs;

	public ComCom1002Event() {
	}

	public GlErrVvdVO getGlErrVvdVO() {
		return glErrVvdVO;
	}

	public void setGlErrVvdVO(GlErrVvdVO glErrVvdVO) {
		this.glErrVvdVO = glErrVvdVO;
	}

	public GlErrVvdVO[] getGlErrVvdVOs() {
		//return glErrVvdVOs;
		GlErrVvdVO[] rtnVOs = null;
		if(this.glErrVvdVOs != null) {
			rtnVOs = new GlErrVvdVO[glErrVvdVOs.length];
			System.arraycopy(glErrVvdVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setGlErrVvdVOs(GlErrVvdVO[] glErrVvdVOs) {
		//this.glErrVvdVOs = glErrVvdVOs;
		if(glErrVvdVOs != null) {
			GlErrVvdVO[] tmpVOs = new GlErrVvdVO[glErrVvdVOs.length];
			System.arraycopy(glErrVvdVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.glErrVvdVOs = tmpVOs;
		}
	}
}
