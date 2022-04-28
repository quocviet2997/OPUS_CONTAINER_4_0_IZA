/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0A1Event.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0A1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0A1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sangyool pak
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0A1Event extends EventSupport {

    private String vslCd     = "";
    private String vslEngNm = "";
    private String carCd     = "";
    private String callSgnNo = "";
    private String lloydNo = "";
    
    // mdm yn 관련 추가 param
    private String mdmYN = "";
    private String deltFlg = "";
    
    // feeder/trunk 관련 추가.
    private String fdrDiv_cd = "";
    
    private int iPage = 0;

    /**
     * Constructor<br>
     */
    public ComEns0A1Event(){}

   /**
    * Constructor<br>
    * @param vsl_cd
    * @param vsl_eng_nm
    * @param car_cd
    * @param iPage
    * @param call_sgn_no
    * @param lloyd_no
    */
    public ComEns0A1Event(String vsl_cd, String vsl_eng_nm, String car_cd, int iPage, String call_sgn_no, String lloyd_no) {
    	this.vslCd     = vsl_cd;
    	this.vslEngNm = vsl_eng_nm;
    	this.carCd     = car_cd;
    	this.iPage      = iPage;
    	this.callSgnNo = call_sgn_no;
    	this.lloydNo	= lloyd_no;
    }
    
    /**
     * Constructor<br>
     * @param vsl_cd
     * @param vsl_eng_nm
     * @param car_cd
     * @param iPage
     * @param call_sgn_no
     * @param lloyd_no
     * @param mdm_yn
     * @param delt_flg
     * @param fdr_div_cd
     */
    public ComEns0A1Event(String vsl_cd, String vsl_eng_nm, String car_cd, int iPage, String call_sgn_no, String lloyd_no, String mdm_yn, String delt_flg, String fdr_div_cd ) {
    	this.vslCd     = vsl_cd;
    	this.vslEngNm = vsl_eng_nm;
    	this.carCd     = car_cd;
    	this.iPage      = iPage;
    	this.callSgnNo = call_sgn_no;
    	this.lloydNo	= lloyd_no;
    	this.mdmYN = mdm_yn;
    	this.deltFlg = delt_flg;
    	this.fdrDiv_cd = fdr_div_cd;
    }

	/**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns0A1Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns0A1Event";
    }

	/**
	 * Carrier Code 반환<br>
	 * @return
	 */
	public String getCar_cd() {
		return carCd;
	}

	/**
	 * Carrier Code 세팅<br>
	 * @param car_cd
	 */
	public void setCar_cd(String car_cd) {
		this.carCd = car_cd;
	}

	/**
	 * Vessel Code 반환<br>
	 * @return
	 */
	public String getVsl_cd() {
		return vslCd;
	}

	/**
	 * Vessel Code 세팅<br>
	 * @param vsl_cd
	 */
	public void setVsl_cd(String vsl_cd) {
		this.vslCd = vsl_cd;
	}

	/**
	 * Vessel Name 반환<br>
	 * @return
	 */
	public String getVsl_eng_nm() {
		return vslEngNm;
	}

	/**
	 * Vessel Name 세팅<br>
	 * @param vsl_eng_nm
	 */
	public void setVsl_eng_nm(String vsl_eng_nm) {
		this.vslEngNm = vsl_eng_nm;
	}

	/**
	 * Page No 반환<br>
	 * @return
	 */
	public int getIPage() {
		return iPage;
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

	/**
	 * Page No 세팅<br>
	 * @param page
	 */
	public void setIPage(int page) {
		iPage = page;
	}

	public String getCall_sgn_no() {
		return callSgnNo;
	}

	public String getLloyd_no() {
		return lloydNo;
	}

	public String getFdrDiv_cd() {
		return fdrDiv_cd;
	}

	public void setFdrDiv_cd(String fdrDiv_cd) {
		this.fdrDiv_cd = fdrDiv_cd;
	}
	

}
