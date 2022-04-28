/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0B1Event.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-07 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel_skd.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0B1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0B1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyunsu, Ryu
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns0B1Event extends EventSupport {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// VVD CD 
    private String vvdCd     = "";
    
    private int iPage = 0;

    /**
     * Constructor<br>
     */
    public ComEns0B1Event(){}
    
    /**
     * Constructor<br>
     * @param vvd_cd
     * @param iPage
     */
    public ComEns0B1Event(String vvd_cd, int iPage) {
        this.vvdCd = vvd_cd;
        this.iPage = iPage;
    }

    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns0B1Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns0B1Event";
    }

	/**
	 * VVD Code 반환<br>
	 * @return
	 */
	public String getVvd_cd() {
		return vvdCd;
	}

	/**
	 * VVD Code 세팅<br>
	 * @param vvd_cd
	 */
	public void setVvd_cd(String vvd_cd) {
		this.vvdCd = vvd_cd;
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
