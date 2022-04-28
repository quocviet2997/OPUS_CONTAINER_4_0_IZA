/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_061Event.java
*@FileTitle : Node 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-17
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-17 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.node.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_061 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_061HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns061Event extends EventSupport {

	private String cntCd       = null;
	private String locCd   	= null;
	private String ofcCd       = null;
	private String nodeCd      = null;
	private String nodeNm      = null;
	private String mode      	= null;
	private String modeOnly     = null;
	private String sccCd     = null;
	
	// mdm yn 추가 param
	private String mdmYN = null;
	private String deltFlg = null;
	
	private int iPage = 0;
 	
    /**
     * Constructor<br>
     */
    public ComEns061Event(){}

    /**
     * 
     * @param String cntCd
     * @param String locCd
     * @param String ofcCd
     * @param String nodeCd
     * @param String nodeNm
     * @param String mode
     * @param String modeOnly
     * @param String sccCd
     * @param int iPage
     */
    public ComEns061Event(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd,  int iPage) {
    	this.cntCd = cntCd;
    	this.locCd = locCd;
    	this.ofcCd = ofcCd;
    	this.nodeCd = nodeCd;
    	this.nodeNm = nodeNm;
    	this.mode = mode;
    	this.modeOnly = modeOnly;
    	this.sccCd = sccCd;
    	this.iPage = iPage;
    }

    /**
     * 
     * @param String cntCd
     * @param String locCd
     * @param String ofcCd
     * @param String nodeCd
     * @param String nodeNm
     * @param String mode
     * @param String modeOnly
     * @param String sccCd
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     */
    public ComEns061Event(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd,  int iPage, String mdmYN, String deltFlg) {
    	this.cntCd = cntCd;
    	this.locCd = locCd;
    	this.ofcCd = ofcCd;
    	this.nodeCd = nodeCd;
    	this.nodeNm = nodeNm;
    	this.mode = mode;
    	this.modeOnly = modeOnly;
    	this.sccCd = sccCd;
    	this.iPage = iPage;
    	this.mdmYN = mdmYN;
    	this.deltFlg = deltFlg;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "COM_ENS_061Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "COM_ENS_061Event";
    }

	/**
	 * Count Code 반환<br>
	 * @return String
	 */
	public String getCnt_cd() {
		return cntCd;
	}

	/**
	 * Count Code 세팅<br>
	 * @param cntCd
	 */
	public void setCnt_cd(String cntCd) {
		this.cntCd = cntCd;
	}

	/**
	 * Location Code 반환<br>
	 * @return
	 */
	public String getLoc_cd() {
		return locCd;
	}

	/**
	 * Location Code 세팅<br>
	 * @param locCd
	 */
	public void setLoc_cd(String locCd) {
		this.locCd = locCd;
	}

	/**
	 * Node Code 반환<br>
	 * @return
	 */
	public String getNode_cd() {
		return nodeCd;
	}

	/**
	 * Node 코드 세팅<br>
	 * @param nodeCd
	 */
	public void setNode_cd(String nodeCd) {
		this.nodeCd = nodeCd;
	}

	/**
	 * Node Name 반환<br>
	 * @return
	 */
	public String getNode_nm() {
		return nodeNm;
	}

	/**
	 * Node Name 세팅<br>
	 * @param nodeNm
	 */
	public void setNode_nm(String nodeNm) {
		this.nodeNm = nodeNm;
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
	 * Mode 반환<br>
	 * @return
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Mode 세팅<br>
	 * @param mode
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * Mode Only 반환<br>
	 * @return
	 */
	public String getMode_only() {
		return modeOnly;
	}

	/**
	 * Mode Only 세팅<br>
	 * @param modeOnly
	 */
	public void setMode_only(String modeOnly) {
		this.modeOnly = modeOnly;
	}

	public void setScc_cd(String sccCd) {
		this.sccCd = sccCd;
	}

	public String getScc_cd() {
		return sccCd;
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
