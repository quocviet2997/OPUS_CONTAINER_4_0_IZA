/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_042Event.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.actualcustomer.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_042 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_042HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sangyool pak
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns042Event extends EventSupport {
	 
    private String locCd  = "";
    private String custCd = "";
    private String custNm = "";
    private int    iPage   = 0;

    /**
     * Constructor
     */
    public ComEns042Event(){}
    
    /**
     * Constructor
     * @param loc_cd
     * @param cust_cd
     * @param cust_nm
     * @param iPage
     */
    public ComEns042Event(String loc_cd, String cust_cd, String cust_nm, int iPage) {
        this.locCd  = loc_cd;
        this.custCd = cust_cd;
        this.custNm = cust_nm;
        this.iPage   = iPage;
    }
    
    /**
     * Constructor
     * @param cust_cd
     * @param iPage
     */
    public ComEns042Event(String cust_cd, int iPage) {
        this.custCd = cust_cd;
        this.iPage   = iPage;
    }
    
    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns042Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns042Event";
    }

	/**
	 * Cust 코드 Get 메소드
	 * @return
	 */
	public String getCust_cd() {
		return custCd;
	}

	/**
	 * Cust 코드 Set 메소드
	 * @param cust_cd
	 */
		public void setCust_cd(String cust_cd) {
		this.custCd = cust_cd;
	}

	/**
	 * Cust Name Get 메소드
	 * @return
	 */
	public String getCust_nm() {
		return custNm;
	}

	/**
	 * Cust Name Set 메소드
	 * @param cust_nm
	 */
	public void setCust_nm(String cust_nm) {
		this.custNm = cust_nm;
	}

	/**
	 * Page No Get 메소드
	 * @return
	 */
	public int getIPage() {
		return iPage;
	}

	/**
	 * Page No Set 메소드
	 * @param page
	 */
	public void setIPage(int page) {
		iPage = page;
	}

	/**
	 * Location 코드 Get 메소드
	 * @return
	 */
	public String getLoc_cd() {
		return locCd;
	}

	/**
	 * Location 코드 Set 메소드
	 * @param loc_cd
	 */
	public void setLoc_cd(String loc_cd) {
		this.locCd = loc_cd;
	}

}
