/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VENDOR.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;


/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author Hyunsu Ryu
 * @since J2EE 1.4
 */ 
public final class MdmVendor implements java.io.Serializable {

	// vendor master 
	private MdmVendorMaster             mdmVendermaster   = null;
	
	// Vender detail 
	private MdmCntrVndrClss[]     	  mdmCntrVndrClss   = null;
	
	// Check Mailling Address
	private MdmChkmailAddr			  mdmChkMailAddr    = null;

	// toString() method is overriding ..
	public String toString() {
		return mdmVendermaster.toString() + "\n\n" + mdmCntrVndrClss.toString() ;
	}


	public MdmVendorMaster getMdmVendermaster() {
		return mdmVendermaster;
	}


	public void setMdmVendermaster(MdmVendorMaster mdmVendermaster) {
		this.mdmVendermaster = mdmVendermaster;
	}


	public MdmCntrVndrClss[] getMdmCntrVndrClss() {
		return mdmCntrVndrClss;
	}


	public void setMdmCntrVndrClss(MdmCntrVndrClss[] mdmCntrVndrClss) {
		this.mdmCntrVndrClss = mdmCntrVndrClss;
	}

	public MdmChkmailAddr getMdmChkMailAddr() {
		return mdmChkMailAddr;
	}


	public void setMdmChkMailAddr(MdmChkmailAddr mdmChkMailAddr) {
		this.mdmChkMailAddr = mdmChkMailAddr;
	}


}
