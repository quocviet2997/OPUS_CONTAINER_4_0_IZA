/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_081Event.java
*@FileTitle : Lane 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-09 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.lane.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_081 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_081HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns081Event extends EventSupport {

    private String tradeCd = null;
    private String subTradeCd = null;
    private String svcTp  = null;
    private String laneCd  = null;
    private String laneNm  = null;
    
    private String mode  = null;
    
    private String mdmYN = null;
    private String deltFlg = null;
    
    
    private int iPage = 0;
    
    /**
     * Constructor<br>
     */
    public ComEns081Event(){}

    /**
     * Constructor<br>
     * @param tradeCd
     * @param subTradeCd
     * @param svcTp
     * @param laneCd
     * @param laneNm
     * @param mode
     * @param iPage
     */
    public ComEns081Event(String tradeCd, String subTradeCd, String svcTp, String laneCd, String laneNm, String mode, int iPage) {
    	this.tradeCd     	= tradeCd;
    	this.subTradeCd 	= subTradeCd;
    	this.svcTp     	= svcTp;
    	this.laneCd     	= laneCd;
    	this.laneNm     	= laneNm;
    	this.mode     		= mode;
    	this.iPage      	= iPage;
    }
    
    /**
     * Constructor<br>
     * @param tradeCd
     * @param subTradeCd
     * @param svcTp
     * @param laneCd
     * @param laneNm
     * @param mode
     * @param iPage
     * @param mdmYn
     * @param deltFlg
     */
    public ComEns081Event(String tradeCd, String subTradeCd, String svcTp, String laneCd, String laneNm, String mode, int iPage , String mdmYn, String deltFlg) {
    	this.tradeCd     	= tradeCd;
    	this.subTradeCd 	= subTradeCd;
    	this.svcTp     	= svcTp;
    	this.laneCd     	= laneCd;
    	this.laneNm     	= laneNm;
    	this.mode     		= mode;
    	this.iPage      	= iPage;
    	this.mdmYN      	= mdmYn;
    	this.deltFlg      	= deltFlg;
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
	 * Lane Code 반환<br>
	 * @return
	 */
	public String getLane_cd() {
		return laneCd;
	}

	/**
	 * Lane Code 세팅<br>
	 * @param laneCd
	 */
	public void setLane_cd(String laneCd) {
		this.laneCd = laneCd;
	}

	/**
	 * Lane Name 반환<br>
	 * @return
	 */
	public String getLane_nm() {
		return laneNm;
	}

	/**
	 * Lane Name 세팅<br>
	 * @param laneNm
	 */
	public void setLane_nm(String laneNm) {
		this.laneNm = laneNm;
	}

	/**
	 * Sub Trade Code 반환<br>
	 * @return
	 */
	public String getSub_tradeCd() {
		return subTradeCd;
	}

	/**
	 * Sub Trade Code 세팅<br>
	 * @param subTradeCd
	 */
	public void setSub_tradeCd(String subTradeCd) {
		this.subTradeCd = subTradeCd;
	}

	/**
	 * Service Type 반환<br>
	 * @return
	 */
	public String getSvc_tp() {
		return svcTp;
	}

	/**
	 * Service Type 세팅<br>
	 * @param svcTp
	 */
	public void setSvc_tp(String svcTp) {
		this.svcTp = svcTp;
	}

	/**
	 * Trade Code 반환<br>
	 * @return
	 */
	public String getTrade_cd() {
		return tradeCd;
	}

	/**
	 * Trade Code 세팅<br>
	 * @param tradeCd
	 */
	public void setTrade_cd(String tradeCd) {
		this.tradeCd = tradeCd;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
        return "ComEns081Event";
    }

	/**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns081Event";
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
