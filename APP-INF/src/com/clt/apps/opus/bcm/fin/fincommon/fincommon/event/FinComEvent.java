/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : FinComEvent.java
*@FileTitle : Financial Common
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.fincommon.fincommon.event;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * FIN_COM_0001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  FIN_COM_HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see FIN_COM_HTMLAction 참조
 * @since J2EE 1.6
 */

public class FinComEvent  extends EventSupport{
	
	private static final long serialVersionUID = 1L;
	
	/** VVD **/
	private String vvd = "";
	
	public String getVvd() {
		return vvd;
	}

	public void setVvd(String vvd) {
		this.vvd = vvd;
	}

	/** Slane Code */
	private String slanCd = "";
	
	/** Revenue Lane Direction code */
	private String rlaneCd = "";
	
	/** Sconti code */
	private String scontiCd = "";
	
	/** Vessel code */
	private String vslCd = "";
	
	/** Rev Port code */
	private String revPortCd = "";
	
	/** Currency code */
	private String currCd = "";	
	
	/** Com Code Id */
	private String comCdId = "";
	
	/** Com Code */
	private String comCode = "";
	
	/** Com Text */
	private String comText = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private CheckInvoiceNoVO checkInvoiceNoVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private CheckInvoiceNoVO[] checkInvoiceNoVOs = null;
	
	
	public String getCurrCd() {
		return currCd;
	}
	
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	public String getVslCd() {
		return vslCd;
	}
	
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	public String getRevPortCd() {
		return revPortCd;
	}
	
	public void setRevPortCd(String revPortCd) {
		this.revPortCd = revPortCd;
	}
	
	public String getScontiCd() {
		return scontiCd;
	}
	
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
	}
	
	public String getRlaneCd() {
		return rlaneCd;
	}
	
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	public String getSlanCd() {
		return slanCd;
	}
	
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	public void setComCdId(String comCdId) {
		this.comCdId = comCdId;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public void setComText(String comText) {
		this.comText = comText;
	}
	
	public String getComCdId() {
		return comCdId;
	}
	
	public String getComCode() {
		return comCode;
	}
	
	public String getComText() {
		return comText;
	}
	

	public void setCheckInvoiceNoVO(CheckInvoiceNoVO checkInvoiceNoVO) {
		this.checkInvoiceNoVO = checkInvoiceNoVO;
	}
	
	public void setCheckInvoiceNoVOS(CheckInvoiceNoVO[] checkInvoiceNoVOs) {
		//this.checkInvoiceNoVOs = checkInvoiceNoVOs;
		if(checkInvoiceNoVOs != null) {
			CheckInvoiceNoVO[] tmpVOs = new CheckInvoiceNoVO[checkInvoiceNoVOs.length];
			System.arraycopy(checkInvoiceNoVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.checkInvoiceNoVOs = tmpVOs;
		}
	}

	public CheckInvoiceNoVO getCheckInvoiceNoVO() {
		return checkInvoiceNoVO;
	}
	
	public CheckInvoiceNoVO[] getCheckInvoiceNoVOS() {
		//return checkInvoiceNoVOs;
		CheckInvoiceNoVO[] rtnVOs = null;
		if(this.checkInvoiceNoVOs != null) {
			rtnVOs = new CheckInvoiceNoVO[checkInvoiceNoVOs.length];
			System.arraycopy(checkInvoiceNoVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	
}
