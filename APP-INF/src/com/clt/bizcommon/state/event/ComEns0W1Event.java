/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0W1Event.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.state.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0W1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0W1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0W1Event extends EventSupport {

	private String cntCd = "";
	
	/**
	 * Constructor<br>
	 */
	public ComEns0W1Event(){} 
	
	/**
	 * Constructor<br>
	 * @param String cnt_cd
	 */
	public ComEns0W1Event(String cnt_cd){
		this.cntCd = cnt_cd;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "COM_ENS_0W1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "COM_ENS_0W1Event";
	}

	public String getCnt_cd() {
		return cntCd;
	}

	public void setCnt_cd(String cnt_cd) {
		this.cntCd = cnt_cd;
	}
}
