/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteEvent.java
*@FileTitle : Approval Route PopUp
*Open Issues :
*Change history :
*@LastModifyDate : 2008-08-29
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2008-08-29 Jeong-Hoon, KIM
* 1.0 최초 생성
=========================================================*/ 
package com.clt.bizcommon.approute.event;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * Approute 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - ApprouteHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 * 
 * @author Jeong-Hoon, KIM
 * @see EventSupport
 * @since J2EE 1.4
 *
 * 2008. 08. 29
 */
public class ApprouteEvent extends EventSupport {

	
	private String ofcCdDeptsrch ;
	
	private String ofcCd;

	private String subSysCd;
	
	private String mode;

	private int iPage;
	
	private String csrNo;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * It's a Constructor
	 */
	public ApprouteEvent(){}
	
	/**
	 * It's a Constructor
	 * @param ofc_cd_deptsrch
	 * @param ofc_cd
	 * @param sub_sys_cd
	 * @param mode
	 * @param iPage
	 * @param csr_no
	 */
	public ApprouteEvent(String ofc_cd_deptsrch, String ofc_cd,  String sub_sys_cd, String mode, int iPage, String csr_no) {
		this.ofcCdDeptsrch = ofc_cd_deptsrch;
		this.ofcCd = ofc_cd;
		this.subSysCd = sub_sys_cd;
		this.mode = mode;
		this.iPage = iPage;
		this.csrNo = csr_no;
	}
	
	/**
	 * This method get ofc cd
	 * @return
	 */
	public String getOfc_cd_deptsrch() {
		return ofcCdDeptsrch;
	}

	/**
	 * This method set ofc cd
	 * @param ofc_cd_deptsrch
	 */
	public void setOfc_cd_deptsrch(String ofc_cd_deptsrch) {
		this.ofcCdDeptsrch = ofc_cd_deptsrch;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ApprouteEvent";
	}
	
	/**
	 * Office Code 반환<br>
	 * @return
	 */
	public String getOfc_cd() {
		return ofcCd;
	}

	/**
	 * Office Code 세팅<br>
	 * @param ofc_cd
	 */
	public void setOfc_cd(String ofc_cd) {
		this.ofcCd = ofc_cd;
	}
	
	/**
	 * Sub System 코드 세팅<br>
	 * @return 
	 */
	public String getSub_sys_cd() {
		return subSysCd;
	}

	/**
	 * Sub System 코드 세팅<br>
	 * @param sub_sys_cd
	 */
	public void setSub_sys_cd(String sub_sys_cd) {
		this.subSysCd = sub_sys_cd;
	}
	
	/**
	 * Page No 반환<br>
	 * @return
	 */
	public int getIPage() {
		return iPage;
	}

	/**
	 * Page No 세팅<br>
	 * @param page
	 */
	public void setIPage(int page) {
		iPage = page;
	}
	
	/**
	 * 팝업 모드 반환<br>
	 * @return
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * 팝업 모드 세팅<br>
	 * @param mode
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	/**
	 * Get a csrNo
	 * 2008. 09. 04
	 */
	public String getCsrNo(){
		return csrNo;		
	}
	
	/**
	 * This method set CsrNo
	 * @param csr_no
	 */
	public void setCsrNo(String csr_no){
		this.csrNo = csr_no;
	}
	
	
	/**
	 * This method get object
	 * @param key
	 * @return
	 */
	public Object getObject(String key) {
		// setAttribute, getAttribute 에 사용되는 공통 사용메소드 입니다. - START 	
		return (key==null) ? null : this.getAttribute(key);
	}

	/**
	 * This method get string
	 * @param key
	 * @return
	 */
	public String getString(String key) {
		Object tmp = this.getObject(key);
		return (tmp==null) ? "" : (String)tmp;
	}
	
	/**
	 * This method get int
	 * @param key
	 * @return
	 */
	public int getInt(String key) {
		String tmp = this.getString(key);
		return ("".equals(tmp)) ? 0 : Integer.parseInt(tmp);
	}
	
	/**
	 * This method put value
	 * @param key
	 * @param value
	 */
	public void putValue(String key, Object value) {
		if(key==null) return;
		this.setAttribute(key, value);
	}	
}
