/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0E1Event.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.monthly.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;



/**
 * COM_ENS_0E1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0E1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0E1Event extends EventSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String frYearMon 	= "";    
	private String toYearMon 	= "";
	private String currCd 	= "";
	
	private int iPage = 0;
	
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
	 * Constructor<br>
	 */
	public ComEns0E1Event(){}
	
	/**
	 * Constructor<br>
	 * @param frYearMon
	 * @param toYearMon
	 * @param curr_cd
	 * @param iPage
	 */
	public ComEns0E1Event(String frYearMon, String toYearMon, String curr_cd, int iPage) {
		this.frYearMon = frYearMon;
		this.toYearMon = toYearMon;
		this.currCd = curr_cd;
		this.iPage = iPage;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_0E1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_0E1Event";
	}

	/**
	 * Currency Code 반환<br>
	 * @return
	 */
	public String getCurr_cd() {
		return currCd;
	}

	/**
	 * Currency Code 세팅<br>
	 * @param curr_cd
	 */
	public void setCurr_cd(String curr_cd) {
		this.currCd = curr_cd;
	}

	/**
	 * From Date 반환<br>
	 * @return
	 */
	public String getFrYearMon() {
		return frYearMon;
	}

	/**
	 * From Date 세팅<br>
	 * @param frYearMon
	 */
	public void setFrYearMon(String frYearMon) {
		this.frYearMon = frYearMon;
	}

	/**
	 * To Date 반환<br>
	 * @return
	 */
	public String getToYearMon() {
		return toYearMon;
	}

	/**
	 * To Date 세팅<br>
	 * @param toYearMon
	 */
	public void setToYearMon(String toYearMon) {
		this.toYearMon = toYearMon;
	}

}
