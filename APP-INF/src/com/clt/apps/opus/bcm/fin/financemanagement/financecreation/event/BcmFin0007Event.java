/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : BcmFin0007Event.java
*@FileTitle : GL Daily Exchange Rate
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.GlDlyXchRtVO;

/**
 * BCM_FIN_0007 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0007HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0007HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0007Event extends EventSupport{
	private static final long serialVersionUID = 1L;
	
	private String sAcctXchRtFmDt;
	
	private String sAcctXchRtToDt;
	
	private String sFmCurrCd;
	
	private String sToCurrCd;
	
	private GlDlyXchRtVO glDlyXchRtVO;
	
	private GlDlyXchRtVO[] glDlyXchRtVOs;
	

	public String getsAcctXchRtFmDt() {
		return sAcctXchRtFmDt;
	}

	public void setsAcctXchRtFmDt(String sAcctXchRtFmDt) {
		this.sAcctXchRtFmDt = sAcctXchRtFmDt;
	}

	public String getsAcctXchRtToDt() {
		return sAcctXchRtToDt;
	}

	public void setsAcctXchRtToDt(String sAcctXchRtToDt) {
		this.sAcctXchRtToDt = sAcctXchRtToDt;
	}

	public String getsFmCurrCd() {
		return sFmCurrCd;
	}

	public void setsFmCurrCd(String sFmCurrCd) {
		this.sFmCurrCd = sFmCurrCd;
	}

	public String getsToCurrCd() {
		return sToCurrCd;
	}

	public void setsToCurrCd(String sToCurrCd) {
		this.sToCurrCd = sToCurrCd;
	}

	public GlDlyXchRtVO getGlDlyXchRtVO() {
		return glDlyXchRtVO;
	}

	public void setGlDlyXchRtVO(GlDlyXchRtVO glDlyXchRtVO) {
		this.glDlyXchRtVO = glDlyXchRtVO;
	}

	public GlDlyXchRtVO[] getGlDlyXchRtVOs() {
		//return glDlyXchRtVOs;
		GlDlyXchRtVO[] rtnVOs = null;
		if(this.glDlyXchRtVOs != null) {
			rtnVOs = new GlDlyXchRtVO[glDlyXchRtVOs.length];
			System.arraycopy(glDlyXchRtVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setGlDlyXchRtVOs(GlDlyXchRtVO[] glDlyXchRtVOs) {
		//this.glDlyXchRtVOs = glDlyXchRtVOs;
		if(glDlyXchRtVOs != null) {
			GlDlyXchRtVO[] tmpVOs = new GlDlyXchRtVO[glDlyXchRtVOs.length];
			System.arraycopy(glDlyXchRtVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.glDlyXchRtVOs = tmpVOs;
		}
	}
}