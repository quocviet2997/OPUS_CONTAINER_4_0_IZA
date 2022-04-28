/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0D1Event.java
*@FileTitle : Surcharge
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.surcharge.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0D1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0D1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0D1Event extends EventSupport {

	private String contiCd 	= "";    
	private String scontiCd 	= "";
	private String cntCd 	= "";
	private String cntNm 	= "";
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComEns0D1Event(){}
	
	/**
	 * 
	 * @param String conti_cd
	 * @param String sconti_cd
	 * @param String cnt_cd
	 * @param String cnt_nm
	 * @param int iPage
	 */
	public ComEns0D1Event(String conti_cd, String sconti_cd, String cnt_cd, String cnt_nm, int iPage) {
    	this.contiCd     = conti_cd;    	
    	this.scontiCd     = sconti_cd;
    	this.cntCd     = cnt_cd;
    	this.cntNm     = cnt_nm;
    	this.iPage     = iPage;
    }

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_0D1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_0D1Event";
	}

	/**
	 * Country Code 반환<br>
	 * @return
	 */
	public String getCnt_cd() {
		return cntCd;
	}	
	
	/**
	 * Country Code 세팅<br>
	 * @param cnt_cd
	 */
	public void setCnt_cd(String cnt_cd) {
		this.cntCd = cnt_cd;
	}

	/**
	 * Country Name 반환<br>
	 * @return
	 */
	public String getCnt_nm() {
		return cntNm;
	}

	/**
	 * Country Name 세팅<br>
	 * @param cnt_nm
	 */
	public void setCnt_nm(String cnt_nm) {
		this.cntNm = cnt_nm;
	}

	/**
	 * Continent Code 반환<br>
	 * @return
	 */
	public String getConti_cd() {
		return contiCd;
	}

	/**
	 * Continent Code 세팅<br>
	 * @param conti_cd
	 */
	public void setConti_cd(String conti_cd) {
		this.contiCd = conti_cd;
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
	 * Sub Continent Code 반환<br>
	 * @return
	 */
	public String getSconti_cd() {
		return scontiCd;
	}

	/**
	 * Sub Continent Code 세팅<br>
	 * @param sconti_cd
	 */
	public void setSconti_cd(String sconti_cd) {
		this.scontiCd = sconti_cd;
	}

}
