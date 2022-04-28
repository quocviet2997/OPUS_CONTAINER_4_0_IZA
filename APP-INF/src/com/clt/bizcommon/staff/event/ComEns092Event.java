/*=========================================================
*Copyright(c) 2007 CyberLogitec
*@FileName : NotifiedSubscriberEvent.java
*@FileTitle : Notified Subscriber Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-02
*@LastModifier : JeongSeon An
*@LastVersion : 1.0
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.staff.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * NotifiedSubscriber 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - NotifiedSubscriberHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns092Event extends EventSupport {

	private String ofcCd = "";
	private String usrCd = "";
	private String usrNm = "";
	private int iPage = 0;
	
	/**
	 * Constructor<br>
	 */
	public ComEns092Event(){}
	
	/**
	 * Constructor<br>
	 * @param ofcCd
	 * @param usrCd
	 * @param usrNm
	 * @param iPage
	 */
	public ComEns092Event(String ofcCd, String usrCd, String usrNm, int iPage) {
		this.ofcCd = ofcCd;
		this.usrCd = usrCd;
		this.usrNm = usrNm;
		this.iPage = iPage;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_092Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_092Event";
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
	 * usr Code 반환<br>
	 * @return
	 */
	public String getUsr_cd() {
		return usrCd;
	}

	/**
	 * usr Code 세팅<br>
	 * @param usrCd
	 */
	public void setUsr_cd(String usrCd) {
		this.usrCd = usrCd;
	}

	/**
	 * usr Name 반환<br>
	 * @return
	 */
	public String getUsr_nm() {
		return usrNm;
	}

	/**
	 * usr Name 세팅<br>
	 * @param usrNm
	 */
	public void setUsr_nm(String usrNm) {
		this.usrNm = usrNm;
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
