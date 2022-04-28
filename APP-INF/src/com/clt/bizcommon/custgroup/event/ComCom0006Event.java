/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : COM_COM_0006Event.java
*@FileTitle : CustomerGroup
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : sungho park
*@LastVersion : 1.0
* 2012-02-21 sungho park
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.custgroup.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_COM_0006 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_COM_0006HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sungho park
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComCom0006Event extends EventSupport {

    private String custGrpId = "";
    private String custGrpNm = "";
    private String ofcCd  = "";
    private String mdmYn = "";
    private String deltFlg = "";
    private String custGrpAbbrNm = "";
    int    iPage   = 0;

    /**
     * Constructor<br>
     */
    public ComCom0006Event(){}

    /**
     * Office Code 반환<br>
     * @return
     */
    public String getOfcCd() {
		return ofcCd;
	}

	/**
	 * Office Code 세팅<br>
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}	
    
    /**
     * 
     * @param String custGrpId
     * @param String custGrpNm
     * @param String ofcCd
     * @param int iPage
     * @param String mdmYn
     * @param String deltFlg
     * @param String custGrpAbbrNm
     */
    public ComCom0006Event(String custGrpId, String custGrpNm, String ofcCd, int iPage, String mdmYn, String deltFlg, String custGrpAbbrNm) {
        this.custGrpId = custGrpId;
        this.custGrpNm = custGrpNm;
        this.ofcCd  = ofcCd;
        this.iPage   = iPage;
        this.mdmYn = mdmYn;
        this.custGrpAbbrNm = custGrpAbbrNm;
        this.deltFlg = deltFlg;
    }

    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComCom0006Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComCom0006Event";
    }

	/**
	 * CustGrp Code 반환<br>
	 * @return String
	 */
	public String getCustGrpId() {
		return custGrpId;
	}

	/**
	 * CustGrp Code 세팅<br>
	 * @param custGrpId
	 */
	public void setCustGrpId(String custGrpId) {
		this.custGrpId = custGrpId;
	}
	
	/**
	 * include 반환<br>
	 * @return String
	 */
	public String getMdmYn() {
		return mdmYn;
	}
	
	/**
	 * include 세팅<br>
	 * @param include
	 */
	public void setMdmYn(String mdmYn) {
		this.mdmYn = mdmYn;
	}
	
	/**
	 * CustGrp Name 반환<br>
	 * @return String
	 */
	public String getCustGrpNm() {
		return custGrpNm;
	}

	/**
	 * CustGrp Name 세팅<br>
	 * @param custGrpNm
	 */
	public void setCustGrpNm(String custGrpNm) {
		this.custGrpNm = custGrpNm;
	}

	/**
	 * Page No 반환<br>
	 * @return String
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
	 * Delt Flg 반환<br>
	 * @return String
	 */
	public String getDeltFlg() {
		return deltFlg;
	}
	/**
	 * Delt Flg 세팅<br>
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	public String getCustGrpAbbrNm() {
		return custGrpAbbrNm;
	}

	public void setCustGrpAbbrNm(String custGrpAbbrNm) {
		this.custGrpAbbrNm = custGrpAbbrNm;
	}
	
	
}
