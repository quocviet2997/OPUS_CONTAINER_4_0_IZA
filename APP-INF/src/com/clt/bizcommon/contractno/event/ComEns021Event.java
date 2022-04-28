/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ComEns021Event.java
*@FileTitle : Contract No 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-11 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.contractno.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_021 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_021HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sangyool pak
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns021Event extends EventSupport {    
    
	private static final long serialVersionUID = 1L;
	private String contTp = "";
    private String contNo = "";
    private String custNm = "";
    private String sdate   = "";
    private String edate   = "";
    private int    iPage   = 0;
    private String ofcCd     = "";
    private String ctrtCustSlsOfcCd = "";
    
    /*
     * mdm yn 추가 관련.
     */
    private String mdmYN = "";
    private String deltFlg = "";

    /**
     * Constructor<br>
     */
    public ComEns021Event(){}

    /**
     * Contract Type 반환<br>
     * @return
     */
    public String getContTp() {
		return contTp;
	}

	/**
	 * Contract Type 세팅<br>
	 * @param contTp
	 */
	public void setContTp(String contTp) {
		this.contTp = contTp;
	}
	
    /**
     * Constructor<br>
     * @param String contTp
     * @param String contNo
     * @param String custNm
     * @param String sdate
     * @param String edate
     * @param int iPage
     * @param String ofc_cd
     * @param String ctrt_cust_sls_ofc_cd
     */
    public ComEns021Event(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofc_cd, String ctrt_cust_sls_ofc_cd) {
    	this.contTp = contTp;
    	this.contNo = contNo;
    	this.custNm = custNm;
    	this.sdate = sdate;
    	this.edate = edate;
    	this.iPage = iPage;
    	this.ofcCd = ofc_cd;
    	this.ctrtCustSlsOfcCd = ctrt_cust_sls_ofc_cd;
    }
    
    /**
     * Constructor<br>
     * @param String contTp
     * @param String contNo
     * @param String custNm
     * @param String sdate
     * @param String edate
     * @param int iPage
     * @param String ofc_cd
     * @param String ctrt_cust_sls_ofc_cd
     * @param mdm_yn
     * @param delt_flg
     */
    public ComEns021Event(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofc_cd, String ctrt_cust_sls_ofc_cd, String mdm_yn, String delt_flg) {
    	this.contTp = contTp;
    	this.contNo = contNo;
    	this.custNm = custNm;
    	this.sdate = sdate;
    	this.edate = edate;
    	this.iPage = iPage;
    	this.ofcCd = ofc_cd;
    	this.ctrtCustSlsOfcCd = ctrt_cust_sls_ofc_cd;
    	this.mdmYN = mdm_yn;
    	this.deltFlg = delt_flg;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns021Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns021Event";
    }	

	/**
	 * Cust Name 반환<br>
	 * @return
	 */
	public String getCustNm() {
		return custNm;
	}

	/**
	 * Cust Name 세팅<br>
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}

	/**
	 * Edate 반환<br>
	 * @return
	 */
	public String getEdate() {
		return edate;
	}

	/**
	 * Edate 세팅<br>
	 * @param edate
	 */
	public void setEdate(String edate) {
		this.edate = edate;
	}

	/**
	 * Sdate 반환<br>
	 * @return
	 */
	public String getSdate() {
		return sdate;
	}

	/**
	 * Sdate 세팅<br>
	 * @param sdate
	 */
	public void setSdate(String sdate) {
		this.sdate = sdate;
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
	 * @param iPage
	 */
	public void setIPage(int iPage) {
		this.iPage = iPage;
	}

	/**
	 * Contract No 반환<br>
	 * @return
	 */
	public String getContNo() {
		return contNo;
	}

	/**
	 * Contract No 세팅<br>
	 * @param contNo
	 */
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getOfc_cd() {
		return ofcCd;
	}

	public void setOfc_cd(String ofc_cd) {
		this.ofcCd = ofc_cd;
	}

	public String getCtrt_cust_sls_ofc_cd() {
		return ctrtCustSlsOfcCd;
	}

	public void setCtrt_cust_sls_ofc_cd(String ctrt_cust_sls_ofc_cd) {
		this.ctrtCustSlsOfcCd = ctrt_cust_sls_ofc_cd;
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
