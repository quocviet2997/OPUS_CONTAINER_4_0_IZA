/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : ComEns011Event.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 2009-05-22 hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_011 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * COM_ENS_011HTMLAction에서 작성<br>
 * ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sungseok, choi
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns011Event extends EventSupport {
    
    /**
     * Add Title	: Variable Creation
     * 				: Commodity Code 		= cmdt_cd
     * 				: Rep Commodity Code 	= rep_cmdt_cd
     * 				: Commodity Description = cmdt_nm 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     * @return		  
     */
	private String cmdtCd 		= "";
	private String repCmdtCd 	= "";
	private String repImdgLvlCd = "";
	private String cmdtNm 	= "";
	private String mdmYN = "";
	private String deltFlg = "";
	
	
	private int iPage 			= 0;

    /**
     * Constructor<br>
     */
    public ComEns011Event(){}
    
    /**
     * Constructor<br>
     * @param cmdt_cd
     * @param rep_cmdt_cd
     * @param rep_imdg_lvl_cd
     * @param cmdt_nm
     * @param iPage
     */
    public ComEns011Event(String cmdt_cd, String rep_cmdt_cd, String rep_imdg_lvl_cd, String cmdt_nm, int iPage) {
        this.cmdtCd		= cmdt_cd;
        this.repCmdtCd 	= rep_cmdt_cd;        
        this.repImdgLvlCd 	= rep_imdg_lvl_cd;
        this.cmdtNm  	= cmdt_nm;
        this.iPage      	= iPage;
    }

    /**
     * Constructor<br>
     * @param cmdt_cd
     * @param rep_cmdt_cd
     * @param rep_imdg_lvl_cd
     * @param cmdt_nm
     * @param iPage
     * @param mdm_yn
     * @param delt_flg
     */
    public ComEns011Event(String cmdt_cd, String rep_cmdt_cd, String rep_imdg_lvl_cd, String cmdt_nm, int iPage, String mdm_yn, String delt_flg) {
    	 this.cmdtCd		= cmdt_cd;
         this.repCmdtCd 	= rep_cmdt_cd;        
         this.repImdgLvlCd 	= rep_imdg_lvl_cd;
         this.cmdtNm  	= cmdt_nm;
         this.iPage      	= iPage;
         this.mdmYN      	= mdm_yn;
         this.deltFlg      	= delt_flg;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns011Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns011Event";
    }

	/**
	 * Commodity 코드 반환<br>
	 * @return
	 */
	public String getCmdtCd() {
		return cmdtCd;
	}

	/**
	 * Commodity 코드 세팅<br>
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}

	/**
	 * Commodity Name 반환<br>
	 * @return
	 */
	public String getCmdtNm() {
		return cmdtNm;
	}

	/**
	 * Commodity Name 세팅<br>
	 * @param cmdtNm
	 */
	public void setCmdtNm(String cmdtNm) {
		this.cmdtNm = cmdtNm;
	}

	/**
	 * Rep Commodity 코드 반환<br>
	 * @return
	 */
	public String getRepCmdtCd() {
		return repCmdtCd;
	}

	/**
	 * Rep Commodity 코드 세팅<br>
	 * @param repCmdtCd
	 */
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
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
	 * Rep IMDG Level 코드 반환<br>
	 * @return
	 */
	public String getRepImdgLvlCd() {
		return repImdgLvlCd;
	}

	/**
	 * Rep IMDG Level 세팅<br>
	 * @param repImdgLvlCd
	 */
	public void setRepImdgLvlCd(String repImdgLvlCd) {
		this.repImdgLvlCd = repImdgLvlCd;
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