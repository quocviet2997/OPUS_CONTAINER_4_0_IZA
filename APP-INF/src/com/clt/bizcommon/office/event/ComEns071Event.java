/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_071Event.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.office.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_071 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_071HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyunsu, Ryu
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns071Event extends EventSupport {

    private String locCd      = "";
    private String ofcLev      = "";
    private String ofcPtsCd   	= "";
    private String ofcCd       = "";
    private String ofcNm       = "";
    private String calltype     = "";
    private String ofcAddr		= "";
  
    private int iPage = 0;
    /*
	 * 20120210 added by JUN SUNG, KIM 
	 * mdm yn 추가 관련 param
	 */
    private String mdmYN = "";
    private String deltFlg = "";
    
    

    /**
     * Constructor<br>
     */
    public ComEns071Event(){}

    
    /**
     * 
     * @param String locCd
     * @param String ofcLev
     * @param String ofcPtsCd
     * @param String ofcCd
     * @param String ofcNm
     * @param String calltype
     * @param int iPage
     * @param String ofc_addr
     */
    public ComEns071Event( String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofc_addr) {
        this.locCd      	= locCd;
        this.ofcLev      	= ofcLev;
        this.ofcPtsCd  	= ofcPtsCd;
        this.ofcCd       	= ofcCd;
        this.ofcNm       	= ofcNm;
        this.calltype     	= calltype;
        this.iPage 			= iPage;
        this.ofcAddr		= ofc_addr;

    }    
    
    /**
     * 
     * @param String locCd
     * @param String ofcLev
     * @param String ofcPtsCd
     * @param String ofcCd
     * @param String ofcNm
     * @param String calltype
     * @param int iPage
     * @param String ofc_addr
     * @param String mdmYN
     * @param String deltFlg
     */
    public ComEns071Event( String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofc_addr, String mdmYN, String deltFlg) {
    	this.locCd      	= locCd;
    	this.ofcLev      	= ofcLev;
    	this.ofcPtsCd  	= ofcPtsCd;
    	this.ofcCd       	= ofcCd;
    	this.ofcNm       	= ofcNm;
    	this.calltype     	= calltype;
    	this.iPage 			= iPage;
    	this.ofcAddr		= ofc_addr;
    	this.mdmYN		= mdmYN;
    	this.deltFlg		= deltFlg;
    }    

    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns071Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns071Event";
    }

	/**
	 * Office 코드 반환<br>
	 * @return
	 */
	public String getOfc_cd() {
		return ofcCd;
	}

	/**
	 * Office 코드 세팅<br>
	 * @param ofcCd
	 */
	public void setOfc_cd(String ofcCd) {
		this.ofcCd = ofcCd;
	}

	/**
	 * Office Level 반환<br>
	 * @return
	 */
	public String getOfc_lev() {
		return ofcLev;
	}


	/**
	 * Office Level 세팅<br>
	 * @param ofcLev
	 */
	public void setOfc_lev(String ofcLev) {
		this.ofcLev = ofcLev;
	}

	/**
	 * Office Name 반환<br>
	 * @return
	 */
	public String getOfc_nm() {
		return ofcNm;
	}


	/**
	 * Office Name 세팅<br>
	 * @param ofcNm
	 */
	public void setOfc_nm(String ofcNm) {
		this.ofcNm = ofcNm;
	}


	/**
	 * Office PTS Code 반환<br>
	 * @return
	 */
	public String getOfc_pts_cd() {
		return ofcPtsCd;
	}


	/**
	 * Office Parent Code 세팅<br>
	 * @param ofcPtsCd
	 */
	public void setOfc_pts_cd(String ofcPtsCd) {
		this.ofcPtsCd = ofcPtsCd;
	}
	
	
	/**
	 * Call Type 반환<br>
	 * @return
	 */
	public String getCallType() {
		return calltype;
	}


	public void setCallType(String calltype ) {
		this.calltype = calltype;
	}



	
	
	
	
	public int getIPage() {
		return iPage;
	}

	public void setIPage(int page) {
		iPage = page;
	}


	public String getLoc_cd() {
		return locCd;
	}


	public void setLoc_cd(String locCd) {
		this.locCd = locCd;
	}


	public String getOfc_addr() {
		return ofcAddr;
	}


	public void setOfc_addr(String ofc_addr) {
		this.ofcAddr = ofc_addr;
	}


	public String getMdmYN() {
		return mdmYN;
	}


	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}


	public String getDeltFlg() {
		return deltFlg;
	}


	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	
}
