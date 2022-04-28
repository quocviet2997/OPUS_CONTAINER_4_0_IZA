/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ComCom1003Event.java
*@FileTitle : Estimated Revenue VVD Entry
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlEstmRevVvdVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_COM_1003 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_1003HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see COM_COM_1003HTMLAction 참조
 * @since J2EE 1.6
 */
public class ComCom1003Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	private GlEstmRevVvdVO glEstmRevVvdVO;

	private GlEstmRevVvdVO[] glEstmRevVvdVOs;

	public ComCom1003Event() {
	}

	public GlEstmRevVvdVO getGlEstmRevVvdVO() {
		return glEstmRevVvdVO;
	}

	public void setGlEstmRevVvdVO(GlEstmRevVvdVO glEstmRevVvdVO) {
		this.glEstmRevVvdVO = glEstmRevVvdVO;
	}

	public GlEstmRevVvdVO[] getGlEstmRevVvdVOs() {
		//return glEstmRevVvdVOs;
		GlEstmRevVvdVO[] rtnVOs = null;
		if(this.glEstmRevVvdVOs != null) {
			rtnVOs = new GlEstmRevVvdVO[glEstmRevVvdVOs.length];
			System.arraycopy(glEstmRevVvdVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setGlEstmRevVvdVOs(GlEstmRevVvdVO[] glEstmRevVvdVOs) {
		//this.glEstmRevVvdVOs = glEstmRevVvdVOs;
		if(glEstmRevVvdVOs != null) {
			GlEstmRevVvdVO[] tmpVOs = new GlEstmRevVvdVO[glEstmRevVvdVOs.length];
			System.arraycopy(glEstmRevVvdVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.glEstmRevVvdVOs = tmpVOs;
		}
	}
}
