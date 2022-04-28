/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0S1Event.java
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.calendar.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0S1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0S1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0S3Event extends EventSupport {
	
	private String cntCd 	= "";
	private String steCd 	= "";
	private String locCd 	= "";
	private String frDate 	= "";
	private String toDate 	= "";
    private int iPage = 0;
    
	public String getLoc_cd() {
		return locCd;
	}

	public void setLoc_cd(String loc_cd) {
		this.locCd = loc_cd;
	}

	public ComEns0S3Event(){}	
	
	/**
	 * 
	 * @param String cnt_cd
	 * @param String ste_cd
	 * @param String loc_cd
	 * @param String frDate
	 * @param String toDate
	 * @param int iPage
	 */
	public ComEns0S3Event(String cnt_cd, String ste_cd, String loc_cd, String frDate, String toDate, int iPage) {
		this.cntCd = cnt_cd;
		this.steCd = ste_cd;
		this.locCd = loc_cd;
		this.frDate = frDate;
		this.toDate = toDate;
		this.iPage 	= iPage;
	}	

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_0S3Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_0S3Event";
	}

	public String getCnt_cd() {
		return cntCd;
	}

	public void setCnt_cd(String cnt_cd) {
		this.cntCd = cnt_cd;
	}

	public String getFrDate() {
		return frDate;
	}

	public void setFrDate(String frDate) {
		this.frDate = frDate;
	}

	public int getIPage() {
		return iPage;
	}

	public void setIPage(int page) {
		iPage = page;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	// setAttribute, getAttribute 에 사용되는 공통 사용메소드 입니다. - START 	
	public Object getObject(String key) {
		return (key==null) ? null : this.getAttribute(key);
	}

	public String getString(String key) {
		Object tmp = this.getObject(key);
		return (tmp==null) ? "" : (String)tmp;
	}
	
	public int getInt(String key) {
		String tmp = this.getString(key);
		return ("".equals(tmp)) ? 0 : Integer.parseInt(tmp);
	}
	
	/**
	 * 
	 * @param String key
	 * @param Object value
	 */
	public void putValue(String key, Object value) {
		if(key==null) return;
		this.setAttribute(key, value);
	}	
	// setAttribute, getAttribute 에 사용되는 공통 사용메소드 입니다. - END 	

	public String getSte_cd() {
		return steCd;
	}

	public void setSte_cd(String ste_cd) {
		this.steCd = ste_cd;
	}
}
