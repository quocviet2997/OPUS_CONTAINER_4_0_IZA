/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : COM_COM_0011Event.java
*@FileTitle : Revenue Lane 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier :SEOK JIN
*@LastVersion : 1.0
* 2012-02-16 SEOK JIN
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.revenuelane.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_COM_0011 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_COM_0011HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SEOK JIN
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComCom0011Event extends EventSupport {

    private String rlaneCd = null;
    private String rlaneNm = null;
    private String status  = null;
    private String mdmYn  = null;
    
    private int iPage = 0;
    
    /**
     * Constructor<br>
     */
    public ComCom0011Event(){}

    /**
     * Constructor<br>
     * @param rlaneCd
     * @param rlaneNm
     * @param status
     * @param mdmYn
     * @param iPage
     */
    public ComCom0011Event(String rlaneCd, String rlaneNm, String status, String mdmYn, int iPage) {
    	this.rlaneCd     	= rlaneCd;
    	this.rlaneNm 	= rlaneNm;
    	this.status     	= status;
    	this.mdmYn     	= mdmYn;
    	this.iPage      	= iPage;
    }

	public String getRlaneCd() {
		return rlaneCd;
	}

	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}

	public String getRlaneNm() {
		return rlaneNm;
	}

	public void setRlaneNm(String rlaneNm) {
		this.rlaneNm = rlaneNm;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMdmYn() {
		return mdmYn;
	}

	public void setMdmYn(String mdmYn) {
		this.mdmYn = mdmYn;
	}

	public int getIPage() {
		return iPage;
	}

	public void setIPage(int page) {
		iPage = page;
	}

   
}
