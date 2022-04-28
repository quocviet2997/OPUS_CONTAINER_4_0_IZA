/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DctionaryEvent.java
*@FileTitle : Dctionary
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.07
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.12.07 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.dctionary.event;

import com.clt.framework.support.layer.event.EventSupport;


/**
 * DctionaryEvent 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - DctionaryEvent 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Sun JungIn
 * @see DctionaryHTMLAction 참조
 * @since J2EE 1.6
 */
public class DctionaryEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	private String abbrCd = "";
	
	public DctionaryEvent(){}

	public String getAbbr_cd() {
		return abbrCd;
	}

	public void setAbbr_cd(String abbrCd) {
		this.abbrCd = abbrCd;
	}

}
