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
public class ComEns0S4Event extends EventSupport {
	
	private String contiCd 	= "";
	private String cntCd 	= "";
	private String year 	= "";
    private int iPage = 0;
    
	public ComEns0S4Event(){}	
	
	/**
	 * 
	 * @param String conti_cd
	 * @param String cnt_cd
	 * @param String year
	 * @param int iPage
	 */
	public ComEns0S4Event(String conti_cd, String cnt_cd, String year, int iPage) {
		this.contiCd = conti_cd;
		this.cntCd = cnt_cd;
		this.year = year;
		this.iPage 	= iPage;
	}	

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_0S4Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_0S4Event";
	}

	public String getCnt_cd() {
		return cntCd;
	}

	public void setCnt_cd(String cnt_cd) {
		this.cntCd = cnt_cd;
	}	

	public int getIPage() {
		return iPage;
	}

	public void setIPage(int page) {
		iPage = page;
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

	public String getConti_cd() {
		return contiCd;
	}

	public void setConti_cd(String conti_cd) {
		this.contiCd = conti_cd;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
