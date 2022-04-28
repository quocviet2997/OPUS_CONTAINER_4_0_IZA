/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_091Event.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.staff.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_091 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_091HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns091Event extends EventSupport {

	private String ofcCd = "";
	private String userCd = "";
	private String userNm = "";
	private int iPage = 0;
	
	/**
	 * Constructor<br>
	 */
	public ComEns091Event(){}
	
	/**
	 * Constructor<br>
	 * @param ofcCd
	 * @param userCd
	 * @param userNm
	 * @param iPage
	 */
	public ComEns091Event(String ofcCd, String userCd, String userNm, int iPage) {
		this.ofcCd = ofcCd;
		this.userCd = userCd;
		this.userNm = userNm;
		this.iPage = iPage;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns091Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns091Event";
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
	 * @param ofcCd
	 */
	public void setOfc_cd(String ofcCd) {
		this.ofcCd = ofcCd;
	}

	/**
	 * User Code 반환<br>
	 * @return
	 */
	public String getUser_cd() {
		return userCd;
	}

	/**
	 * User Code 세팅<br>
	 * @param userCd
	 */
	public void setUser_cd(String userCd) {
		this.userCd = userCd;
	}

	/**
	 * User Name 반환<br>
	 * @return
	 */
	public String getUser_nm() {
		return userNm;
	}

	/**
	 * User Name 세팅<br>
	 * @param userNm
	 */
	public void setUser_nm(String userNm) {
		this.userNm = userNm;
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

}
