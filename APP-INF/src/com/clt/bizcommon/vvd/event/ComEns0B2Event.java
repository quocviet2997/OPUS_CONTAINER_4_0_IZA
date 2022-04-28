/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0B2Event.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvd.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0B2 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0B2HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyunsu, Ryu
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0B2Event extends EventSupport {

    private int iPage = 0;
    
    // Search Options 
    private String etdeta 		= "";
    private String sdate 	= "";
    private String edate 		= "";
    private String vvdCd 		= "";
    private String locCd 		= "";
    private String laneCd 		= "";
    private String oper 		= "";
    
    /**
     * ETD or ETA Getting 
     * @return
     */
    public String getEtdeta() {
		return etdeta;
	}

    /**
	 * ETD or ETA Setting 
	 * @param etdeta
	 */
	public void setEtdeta(String etdeta) {
		this.etdeta = etdeta;
	}

	/**
	 * Getting Start date for ETD/ETA
	 * @return
	 */
	public String getSdate() {
		return sdate;
	}
	
	/**
	 * Setting Start date for ETD/ETA
	 * @param sdate
	 */
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	/**
	 * Getting Lane CD 
	 * @return
	 */
	public String getLane_cd() {
		return laneCd;
	}

	/**
	 * Setting Lane CD 
	 * @param lane_cd
	 */
	public void setLane_cd(String lane_cd) {
		this.laneCd = lane_cd;
	}

	/**
	 * Getting Location CD
	 * @return
	 */
	public String getLoc_cd() {
		return locCd;
	}

	/**
	 * Setting Location CD 
	 * @param loc_cd
	 */
	public void setLoc_cd(String loc_cd) {
		this.locCd = loc_cd;
	}

	/**
	 * Getting Operator 
	 * @return
	 */
	public String getOper() {
		return oper;
	}

	/**
	 * Setting Operator 
	 * @param oper
	 */
	public void setOper(String oper) {
		this.oper = oper;
	}

	/**
	 * Getting End date for ETD/ETA
	 * @return
	 */
	public String getEdate() {
		return edate;
	}

	/**
	 * Getting End date for ETD/ETA
	 * @param edate
	 */
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	/**
	 * Getting VVD CD 
	 * @return
	 */
	public String getVvd_cd() {
		return vvdCd;
	}

	/**
	 * Setting VVD CD
	 * @param vvd_cd
	 */
	public void setVvd_cd(String vvd_cd) {
		this.vvdCd = vvd_cd;
	}
	
	/**
	 * Constructor<br>
	 */
	public ComEns0B2Event(){}
   
    /**
     * Constructor<br>
     * @param etdeta
     * @param sdate
     * @param edate
     * @param vvd_cd
     * @param loc_cd
     * @param lane_cd
     * @param oper
     * @param iPage
     */
    public ComEns0B2Event(
    		String etdeta,
    	    String sdate,
    	    String edate,
    	    String vvd_cd,
    	    String loc_cd,
    	    String lane_cd,
    	    String oper,
    	    int iPage
    ) {
		this.etdeta 	= etdeta;
	    this.sdate 		= sdate;
	    this.edate 		= edate;
	    this.vvdCd 	= vvd_cd;
	    this.locCd 	= loc_cd;
	    this.laneCd 	= lane_cd;
	    this.oper 		= oper;
	    this.iPage		= iPage;
    }
    
    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns0B2Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns0B2Event";
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
