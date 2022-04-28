/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ComCom1004Event.java
*@FileTitle : Estimated FMC Entry
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlFmcEntVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_COM_1004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_1004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see COM_COM_1004HTMLAction 참조
 * @since J2EE 1.6
 */
public class ComCom1004Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	private GlFmcEntVO glFmcEntVO;

	private GlFmcEntVO[] glFmcEntVOs;

	public ComCom1004Event() {
	}

	public GlFmcEntVO getGlFmcEntVO() {
		return glFmcEntVO;
	}

	public void setGlFmcEntVO(GlFmcEntVO glFmcEntVO) {
		this.glFmcEntVO = glFmcEntVO;
	}

	public GlFmcEntVO[] getGlFmcEntVOs() {
		//return glFmcEntVOs;
		GlFmcEntVO[] rtnVOs = null;
		if(this.glFmcEntVOs != null) {
			rtnVOs = new GlFmcEntVO[glFmcEntVOs.length];
			System.arraycopy(glFmcEntVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setGlFmcEntVOs(GlFmcEntVO[] glFmcEntVOs) {
		//this.glFmcEntVOs = glFmcEntVOs;
		if(glFmcEntVOs != null) {
			GlFmcEntVO[] tmpVOs = new GlFmcEntVO[glFmcEntVOs.length];
			System.arraycopy(glFmcEntVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.glFmcEntVOs = tmpVOs;
		}
	}

}
