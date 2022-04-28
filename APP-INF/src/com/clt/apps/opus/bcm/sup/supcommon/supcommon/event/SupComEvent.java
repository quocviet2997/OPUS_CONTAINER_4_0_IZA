/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupComEvent.java
*@FileTitle : SUPCommon Code
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.supcommon.supcommon.event;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * SUP_COM 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  SUP_COM_HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see SUP_COM_HTMLAction 참조
 * @since J2EE 1.6
 */

public class SupComEvent extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Customer Country Code */
	private String custCntCd = "";
	
	/** Customer Sequence */
	private String custSeq = "";
	
	/** Continent Description */
	private String contiDesc = "";
	
	/** Country Description */
	private String cntDesc = "";
	
	/** Service Lane Code */
	private String slanCd = "";
	
	/** Port Code */
	private String portCd = "";
	
	
	public SupComEvent(){}
	

	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	public String getCustCntCd() {
		return custCntCd;
	}

	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	public String getCustSeq() {
		return custSeq;
	}
	
	public void setContiDesc(String contiDesc) {
		this.contiDesc = contiDesc;
	}
	
	public String getContiDesc() {
		return contiDesc;
	}
	
	public void setCntDesc(String cntDesc) {
		this.cntDesc = cntDesc;
	}
	
	public String getCntDesc() {
		return cntDesc;
	}
	
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	public String getSlanCd() {
		return slanCd;
	}
	
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	public String getPortCd() {
		return portCd;
	}

}
