/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsRuleStupVO.java
*@FileTitle : BkgCstmsRuleStupVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.23
*@LastModifier : 이수빈
*@LastVersion : 1.0
* 2009.04.23 이수빈 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이수빈
 * @since J2EE 1.5
 */

public class BkgCstmsRuleStupVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsRuleStupVO> models = new ArrayList<BkgCstmsRuleStupVO>();
	
	/* Column Inpo */
	private String shprCoRgstFlg = null;
	/* Column Inpo */
	private String frobFlg = null;
	/* Column Inpo */
	private String ntfyCoRgstFlg = null;
	/* Column Inpo */
	private String measFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String blMkFlg = null;
	/* Column Inpo */
	private String locCd = null;
	/* Column Inpo */
	private String shprPhnFlg = null;
	/* Column Inpo */
	private String cntCd = null;
	/* Column Inpo */
	private String shprCtyFlg = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String shprCntFlg = null;
	/* Column Inpo */
	private String ntfyNmFlg = null;
	/* Column Inpo */
	private String wgtFlg = null;
	/* Column Inpo */
	private String cneeCntFlg = null;
	/* Column Inpo */
	private String ntfyZipFlg = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String amsRefNoFlg = null;
	/* Column Inpo */
	private String cneeAddrFlg = null;
	/* Column Inpo */
	private String sealNoFlg = null;
	/* Column Inpo */
	private String cntrNoFlg = null;
	/* Column Inpo */
	private String ntfySteFlg = null;
	/* Column Inpo */
	private String cneeSteFlg = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String ntfyAddrFlg = null;
	/* Column Inpo */
	private String cneeCtyFlg = null;
	/* Column Inpo */
	private String cneeFaxFlg = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String ntfyFaxFlg = null;
	/* Column Inpo */
	private String xptImpCd = null;
	/* Column Inpo */
	private String cneeZipFlg = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String cneeCoRgstFlg = null;
	/* Column Inpo */
	private String blDescFlg = null;
	/* Column Inpo */
	private String refNoFlg2 = null;
	/* Column Inpo */
	private String refNoFlg1 = null;
	/* Column Inpo */
	private String cneePhnFlg = null;
	/* Column Inpo */
	private String shprNmFlg = null;
	/* Column Inpo */
	private String refNoFlg3 = null;
	/* Column Inpo */
	private String ntfyCtyFlg = null;
	/* Column Inpo */
	private String shprSteFlg = null;
	/* Column Inpo */
	private String ntfyPhnFlg = null;
	/* Column Inpo */
	private String blTpCd = null;
	/* Column Inpo */
	private String cneeNmFlg = null;
	/* Column Inpo */
	private String shprZipFlg = null;
	/* Column Inpo */
	private String shprFaxFlg = null;
	/* Column Inpo */
	private String pckFlg = null;
	/* Column Inpo */
	private String ntfyCntFlg = null;
	/* Column Inpo */
	private String shprAddrFlg = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsRuleStupVO() {}

	public BkgCstmsRuleStupVO(String ibflag, String pagerows, String cntCd, String locCd, String frobFlg, String xptImpCd, String blTpCd, String shprNmFlg, String shprAddrFlg, String shprZipFlg, String shprCtyFlg, String shprSteFlg, String shprCntFlg, String shprPhnFlg, String shprFaxFlg, String shprCoRgstFlg, String cneeNmFlg, String cneeAddrFlg, String cneeZipFlg, String cneeCtyFlg, String cneeSteFlg, String cneeCntFlg, String cneePhnFlg, String cneeFaxFlg, String cneeCoRgstFlg, String ntfyNmFlg, String ntfyAddrFlg, String ntfyZipFlg, String ntfyCtyFlg, String ntfySteFlg, String ntfyCntFlg, String ntfyPhnFlg, String ntfyFaxFlg, String ntfyCoRgstFlg, String wgtFlg, String measFlg, String pckFlg, String blDescFlg, String blMkFlg, String sealNoFlg, String cntrNoFlg, String amsRefNoFlg, String refNoFlg1, String refNoFlg2, String refNoFlg3, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.shprCoRgstFlg = shprCoRgstFlg;
		this.frobFlg = frobFlg;
		this.ntfyCoRgstFlg = ntfyCoRgstFlg;
		this.measFlg = measFlg;
		this.pagerows = pagerows;
		this.blMkFlg = blMkFlg;
		this.locCd = locCd;
		this.shprPhnFlg = shprPhnFlg;
		this.cntCd = cntCd;
		this.shprCtyFlg = shprCtyFlg;
		this.updUsrId = updUsrId;
		this.shprCntFlg = shprCntFlg;
		this.ntfyNmFlg = ntfyNmFlg;
		this.wgtFlg = wgtFlg;
		this.cneeCntFlg = cneeCntFlg;
		this.ntfyZipFlg = ntfyZipFlg;
		this.creUsrId = creUsrId;
		this.amsRefNoFlg = amsRefNoFlg;
		this.cneeAddrFlg = cneeAddrFlg;
		this.sealNoFlg = sealNoFlg;
		this.cntrNoFlg = cntrNoFlg;
		this.ntfySteFlg = ntfySteFlg;
		this.cneeSteFlg = cneeSteFlg;
		this.creDt = creDt;
		this.ntfyAddrFlg = ntfyAddrFlg;
		this.cneeCtyFlg = cneeCtyFlg;
		this.cneeFaxFlg = cneeFaxFlg;
		this.ibflag = ibflag;
		this.ntfyFaxFlg = ntfyFaxFlg;
		this.xptImpCd = xptImpCd;
		this.cneeZipFlg = cneeZipFlg;
		this.updDt = updDt;
		this.cneeCoRgstFlg = cneeCoRgstFlg;
		this.blDescFlg = blDescFlg;
		this.refNoFlg2 = refNoFlg2;
		this.refNoFlg1 = refNoFlg1;
		this.cneePhnFlg = cneePhnFlg;
		this.shprNmFlg = shprNmFlg;
		this.refNoFlg3 = refNoFlg3;
		this.ntfyCtyFlg = ntfyCtyFlg;
		this.shprSteFlg = shprSteFlg;
		this.ntfyPhnFlg = ntfyPhnFlg;
		this.blTpCd = blTpCd;
		this.cneeNmFlg = cneeNmFlg;
		this.shprZipFlg = shprZipFlg;
		this.shprFaxFlg = shprFaxFlg;
		this.pckFlg = pckFlg;
		this.ntfyCntFlg = ntfyCntFlg;
		this.shprAddrFlg = shprAddrFlg;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("shpr_co_rgst_flg", getShprCoRgstFlg());
		this.hashColumns.put("frob_flg", getFrobFlg());
		this.hashColumns.put("ntfy_co_rgst_flg", getNtfyCoRgstFlg());
		this.hashColumns.put("meas_flg", getMeasFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bl_mk_flg", getBlMkFlg());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("shpr_phn_flg", getShprPhnFlg());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("shpr_cty_flg", getShprCtyFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("shpr_cnt_flg", getShprCntFlg());
		this.hashColumns.put("ntfy_nm_flg", getNtfyNmFlg());
		this.hashColumns.put("wgt_flg", getWgtFlg());
		this.hashColumns.put("cnee_cnt_flg", getCneeCntFlg());
		this.hashColumns.put("ntfy_zip_flg", getNtfyZipFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ams_ref_no_flg", getAmsRefNoFlg());
		this.hashColumns.put("cnee_addr_flg", getCneeAddrFlg());
		this.hashColumns.put("seal_no_flg", getSealNoFlg());
		this.hashColumns.put("cntr_no_flg", getCntrNoFlg());
		this.hashColumns.put("ntfy_ste_flg", getNtfySteFlg());
		this.hashColumns.put("cnee_ste_flg", getCneeSteFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ntfy_addr_flg", getNtfyAddrFlg());
		this.hashColumns.put("cnee_cty_flg", getCneeCtyFlg());
		this.hashColumns.put("cnee_fax_flg", getCneeFaxFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ntfy_fax_flg", getNtfyFaxFlg());
		this.hashColumns.put("xpt_imp_cd", getXptImpCd());
		this.hashColumns.put("cnee_zip_flg", getCneeZipFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cnee_co_rgst_flg", getCneeCoRgstFlg());
		this.hashColumns.put("bl_desc_flg", getBlDescFlg());
		this.hashColumns.put("ref_no_flg2", getRefNoFlg2());
		this.hashColumns.put("ref_no_flg1", getRefNoFlg1());
		this.hashColumns.put("cnee_phn_flg", getCneePhnFlg());
		this.hashColumns.put("shpr_nm_flg", getShprNmFlg());
		this.hashColumns.put("ref_no_flg3", getRefNoFlg3());
		this.hashColumns.put("ntfy_cty_flg", getNtfyCtyFlg());
		this.hashColumns.put("shpr_ste_flg", getShprSteFlg());
		this.hashColumns.put("ntfy_phn_flg", getNtfyPhnFlg());
		this.hashColumns.put("bl_tp_cd", getBlTpCd());
		this.hashColumns.put("cnee_nm_flg", getCneeNmFlg());
		this.hashColumns.put("shpr_zip_flg", getShprZipFlg());
		this.hashColumns.put("shpr_fax_flg", getShprFaxFlg());
		this.hashColumns.put("pck_flg", getPckFlg());
		this.hashColumns.put("ntfy_cnt_flg", getNtfyCntFlg());
		this.hashColumns.put("shpr_addr_flg", getShprAddrFlg());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("shpr_co_rgst_flg", "shprCoRgstFlg");
		this.hashFields.put("frob_flg", "frobFlg");
		this.hashFields.put("ntfy_co_rgst_flg", "ntfyCoRgstFlg");
		this.hashFields.put("meas_flg", "measFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bl_mk_flg", "blMkFlg");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("shpr_phn_flg", "shprPhnFlg");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("shpr_cty_flg", "shprCtyFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("shpr_cnt_flg", "shprCntFlg");
		this.hashFields.put("ntfy_nm_flg", "ntfyNmFlg");
		this.hashFields.put("wgt_flg", "wgtFlg");
		this.hashFields.put("cnee_cnt_flg", "cneeCntFlg");
		this.hashFields.put("ntfy_zip_flg", "ntfyZipFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ams_ref_no_flg", "amsRefNoFlg");
		this.hashFields.put("cnee_addr_flg", "cneeAddrFlg");
		this.hashFields.put("seal_no_flg", "sealNoFlg");
		this.hashFields.put("cntr_no_flg", "cntrNoFlg");
		this.hashFields.put("ntfy_ste_flg", "ntfySteFlg");
		this.hashFields.put("cnee_ste_flg", "cneeSteFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ntfy_addr_flg", "ntfyAddrFlg");
		this.hashFields.put("cnee_cty_flg", "cneeCtyFlg");
		this.hashFields.put("cnee_fax_flg", "cneeFaxFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ntfy_fax_flg", "ntfyFaxFlg");
		this.hashFields.put("xpt_imp_cd", "xptImpCd");
		this.hashFields.put("cnee_zip_flg", "cneeZipFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cnee_co_rgst_flg", "cneeCoRgstFlg");
		this.hashFields.put("bl_desc_flg", "blDescFlg");
		this.hashFields.put("ref_no_flg2", "refNoFlg2");
		this.hashFields.put("ref_no_flg1", "refNoFlg1");
		this.hashFields.put("cnee_phn_flg", "cneePhnFlg");
		this.hashFields.put("shpr_nm_flg", "shprNmFlg");
		this.hashFields.put("ref_no_flg3", "refNoFlg3");
		this.hashFields.put("ntfy_cty_flg", "ntfyCtyFlg");
		this.hashFields.put("shpr_ste_flg", "shprSteFlg");
		this.hashFields.put("ntfy_phn_flg", "ntfyPhnFlg");
		this.hashFields.put("bl_tp_cd", "blTpCd");
		this.hashFields.put("cnee_nm_flg", "cneeNmFlg");
		this.hashFields.put("shpr_zip_flg", "shprZipFlg");
		this.hashFields.put("shpr_fax_flg", "shprFaxFlg");
		this.hashFields.put("pck_flg", "pckFlg");
		this.hashFields.put("ntfy_cnt_flg", "ntfyCntFlg");
		this.hashFields.put("shpr_addr_flg", "shprAddrFlg");
		return this.hashFields;
	}
	
	public String getShprCoRgstFlg() {
		return this.shprCoRgstFlg;
	}
	public String getFrobFlg() {
		return this.frobFlg;
	}
	public String getNtfyCoRgstFlg() {
		return this.ntfyCoRgstFlg;
	}
	public String getMeasFlg() {
		return this.measFlg;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getBlMkFlg() {
		return this.blMkFlg;
	}
	public String getLocCd() {
		return this.locCd;
	}
	public String getShprPhnFlg() {
		return this.shprPhnFlg;
	}
	public String getCntCd() {
		return this.cntCd;
	}
	public String getShprCtyFlg() {
		return this.shprCtyFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getShprCntFlg() {
		return this.shprCntFlg;
	}
	public String getNtfyNmFlg() {
		return this.ntfyNmFlg;
	}
	public String getWgtFlg() {
		return this.wgtFlg;
	}
	public String getCneeCntFlg() {
		return this.cneeCntFlg;
	}
	public String getNtfyZipFlg() {
		return this.ntfyZipFlg;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAmsRefNoFlg() {
		return this.amsRefNoFlg;
	}
	public String getCneeAddrFlg() {
		return this.cneeAddrFlg;
	}
	public String getSealNoFlg() {
		return this.sealNoFlg;
	}
	public String getCntrNoFlg() {
		return this.cntrNoFlg;
	}
	public String getNtfySteFlg() {
		return this.ntfySteFlg;
	}
	public String getCneeSteFlg() {
		return this.cneeSteFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getNtfyAddrFlg() {
		return this.ntfyAddrFlg;
	}
	public String getCneeCtyFlg() {
		return this.cneeCtyFlg;
	}
	public String getCneeFaxFlg() {
		return this.cneeFaxFlg;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getNtfyFaxFlg() {
		return this.ntfyFaxFlg;
	}
	public String getXptImpCd() {
		return this.xptImpCd;
	}
	public String getCneeZipFlg() {
		return this.cneeZipFlg;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCneeCoRgstFlg() {
		return this.cneeCoRgstFlg;
	}
	public String getBlDescFlg() {
		return this.blDescFlg;
	}
	public String getRefNoFlg2() {
		return this.refNoFlg2;
	}
	public String getRefNoFlg1() {
		return this.refNoFlg1;
	}
	public String getCneePhnFlg() {
		return this.cneePhnFlg;
	}
	public String getShprNmFlg() {
		return this.shprNmFlg;
	}
	public String getRefNoFlg3() {
		return this.refNoFlg3;
	}
	public String getNtfyCtyFlg() {
		return this.ntfyCtyFlg;
	}
	public String getShprSteFlg() {
		return this.shprSteFlg;
	}
	public String getNtfyPhnFlg() {
		return this.ntfyPhnFlg;
	}
	public String getBlTpCd() {
		return this.blTpCd;
	}
	public String getCneeNmFlg() {
		return this.cneeNmFlg;
	}
	public String getShprZipFlg() {
		return this.shprZipFlg;
	}
	public String getShprFaxFlg() {
		return this.shprFaxFlg;
	}
	public String getPckFlg() {
		return this.pckFlg;
	}
	public String getNtfyCntFlg() {
		return this.ntfyCntFlg;
	}
	public String getShprAddrFlg() {
		return this.shprAddrFlg;
	}

	public void setShprCoRgstFlg(String shprCoRgstFlg) {
		this.shprCoRgstFlg = shprCoRgstFlg;
		//this.shprCoRgstFlg=true;
	}
	public void setFrobFlg(String frobFlg) {
		this.frobFlg = frobFlg;
		//this.frobFlg=true;
	}
	public void setNtfyCoRgstFlg(String ntfyCoRgstFlg) {
		this.ntfyCoRgstFlg = ntfyCoRgstFlg;
		//this.ntfyCoRgstFlg=true;
	}
	public void setMeasFlg(String measFlg) {
		this.measFlg = measFlg;
		//this.measFlg=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setBlMkFlg(String blMkFlg) {
		this.blMkFlg = blMkFlg;
		//this.blMkFlg=true;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setShprPhnFlg(String shprPhnFlg) {
		this.shprPhnFlg = shprPhnFlg;
		//this.shprPhnFlg=true;
	}
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setShprCtyFlg(String shprCtyFlg) {
		this.shprCtyFlg = shprCtyFlg;
		//this.shprCtyFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setShprCntFlg(String shprCntFlg) {
		this.shprCntFlg = shprCntFlg;
		//this.shprCntFlg=true;
	}
	public void setNtfyNmFlg(String ntfyNmFlg) {
		this.ntfyNmFlg = ntfyNmFlg;
		//this.ntfyNmFlg=true;
	}
	public void setWgtFlg(String wgtFlg) {
		this.wgtFlg = wgtFlg;
		//this.wgtFlg=true;
	}
	public void setCneeCntFlg(String cneeCntFlg) {
		this.cneeCntFlg = cneeCntFlg;
		//this.cneeCntFlg=true;
	}
	public void setNtfyZipFlg(String ntfyZipFlg) {
		this.ntfyZipFlg = ntfyZipFlg;
		//this.ntfyZipFlg=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAmsRefNoFlg(String amsRefNoFlg) {
		this.amsRefNoFlg = amsRefNoFlg;
		//this.amsRefNoFlg=true;
	}
	public void setCneeAddrFlg(String cneeAddrFlg) {
		this.cneeAddrFlg = cneeAddrFlg;
		//this.cneeAddrFlg=true;
	}
	public void setSealNoFlg(String sealNoFlg) {
		this.sealNoFlg = sealNoFlg;
		//this.sealNoFlg=true;
	}
	public void setCntrNoFlg(String cntrNoFlg) {
		this.cntrNoFlg = cntrNoFlg;
		//this.cntrNoFlg=true;
	}
	public void setNtfySteFlg(String ntfySteFlg) {
		this.ntfySteFlg = ntfySteFlg;
		//this.ntfySteFlg=true;
	}
	public void setCneeSteFlg(String cneeSteFlg) {
		this.cneeSteFlg = cneeSteFlg;
		//this.cneeSteFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setNtfyAddrFlg(String ntfyAddrFlg) {
		this.ntfyAddrFlg = ntfyAddrFlg;
		//this.ntfyAddrFlg=true;
	}
	public void setCneeCtyFlg(String cneeCtyFlg) {
		this.cneeCtyFlg = cneeCtyFlg;
		//this.cneeCtyFlg=true;
	}
	public void setCneeFaxFlg(String cneeFaxFlg) {
		this.cneeFaxFlg = cneeFaxFlg;
		//this.cneeFaxFlg=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setNtfyFaxFlg(String ntfyFaxFlg) {
		this.ntfyFaxFlg = ntfyFaxFlg;
		//this.ntfyFaxFlg=true;
	}
	public void setXptImpCd(String xptImpCd) {
		this.xptImpCd = xptImpCd;
		//this.xptImpCd=true;
	}
	public void setCneeZipFlg(String cneeZipFlg) {
		this.cneeZipFlg = cneeZipFlg;
		//this.cneeZipFlg=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCneeCoRgstFlg(String cneeCoRgstFlg) {
		this.cneeCoRgstFlg = cneeCoRgstFlg;
		//this.cneeCoRgstFlg=true;
	}
	public void setBlDescFlg(String blDescFlg) {
		this.blDescFlg = blDescFlg;
		//this.blDescFlg=true;
	}
	public void setRefNoFlg2(String refNoFlg2) {
		this.refNoFlg2 = refNoFlg2;
		//this.refNoFlg2=true;
	}
	public void setRefNoFlg1(String refNoFlg1) {
		this.refNoFlg1 = refNoFlg1;
		//this.refNoFlg1=true;
	}
	public void setCneePhnFlg(String cneePhnFlg) {
		this.cneePhnFlg = cneePhnFlg;
		//this.cneePhnFlg=true;
	}
	public void setShprNmFlg(String shprNmFlg) {
		this.shprNmFlg = shprNmFlg;
		//this.shprNmFlg=true;
	}
	public void setRefNoFlg3(String refNoFlg3) {
		this.refNoFlg3 = refNoFlg3;
		//this.refNoFlg3=true;
	}
	public void setNtfyCtyFlg(String ntfyCtyFlg) {
		this.ntfyCtyFlg = ntfyCtyFlg;
		//this.ntfyCtyFlg=true;
	}
	public void setShprSteFlg(String shprSteFlg) {
		this.shprSteFlg = shprSteFlg;
		//this.shprSteFlg=true;
	}
	public void setNtfyPhnFlg(String ntfyPhnFlg) {
		this.ntfyPhnFlg = ntfyPhnFlg;
		//this.ntfyPhnFlg=true;
	}
	public void setBlTpCd(String blTpCd) {
		this.blTpCd = blTpCd;
		//this.blTpCd=true;
	}
	public void setCneeNmFlg(String cneeNmFlg) {
		this.cneeNmFlg = cneeNmFlg;
		//this.cneeNmFlg=true;
	}
	public void setShprZipFlg(String shprZipFlg) {
		this.shprZipFlg = shprZipFlg;
		//this.shprZipFlg=true;
	}
	public void setShprFaxFlg(String shprFaxFlg) {
		this.shprFaxFlg = shprFaxFlg;
		//this.shprFaxFlg=true;
	}
	public void setPckFlg(String pckFlg) {
		this.pckFlg = pckFlg;
		//this.pckFlg=true;
	}
	public void setNtfyCntFlg(String ntfyCntFlg) {
		this.ntfyCntFlg = ntfyCntFlg;
		//this.ntfyCntFlg=true;
	}
	public void setShprAddrFlg(String shprAddrFlg) {
		this.shprAddrFlg = shprAddrFlg;
		//this.shprAddrFlg=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setShprCoRgstFlg(JSPUtil.getParameter(request, "shpr_co_rgst_flg", ""));
		setFrobFlg(JSPUtil.getParameter(request, "frob_flg", ""));
		setNtfyCoRgstFlg(JSPUtil.getParameter(request, "ntfy_co_rgst_flg", ""));
		setMeasFlg(JSPUtil.getParameter(request, "meas_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBlMkFlg(JSPUtil.getParameter(request, "bl_mk_flg", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setShprPhnFlg(JSPUtil.getParameter(request, "shpr_phn_flg", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setShprCtyFlg(JSPUtil.getParameter(request, "shpr_cty_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setShprCntFlg(JSPUtil.getParameter(request, "shpr_cnt_flg", ""));
		setNtfyNmFlg(JSPUtil.getParameter(request, "ntfy_nm_flg", ""));
		setWgtFlg(JSPUtil.getParameter(request, "wgt_flg", ""));
		setCneeCntFlg(JSPUtil.getParameter(request, "cnee_cnt_flg", ""));
		setNtfyZipFlg(JSPUtil.getParameter(request, "ntfy_zip_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAmsRefNoFlg(JSPUtil.getParameter(request, "ams_ref_no_flg", ""));
		setCneeAddrFlg(JSPUtil.getParameter(request, "cnee_addr_flg", ""));
		setSealNoFlg(JSPUtil.getParameter(request, "seal_no_flg", ""));
		setCntrNoFlg(JSPUtil.getParameter(request, "cntr_no_flg", ""));
		setNtfySteFlg(JSPUtil.getParameter(request, "ntfy_ste_flg", ""));
		setCneeSteFlg(JSPUtil.getParameter(request, "cnee_ste_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setNtfyAddrFlg(JSPUtil.getParameter(request, "ntfy_addr_flg", ""));
		setCneeCtyFlg(JSPUtil.getParameter(request, "cnee_cty_flg", ""));
		setCneeFaxFlg(JSPUtil.getParameter(request, "cnee_fax_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNtfyFaxFlg(JSPUtil.getParameter(request, "ntfy_fax_flg", ""));
		setXptImpCd(JSPUtil.getParameter(request, "xpt_imp_cd", ""));
		setCneeZipFlg(JSPUtil.getParameter(request, "cnee_zip_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCneeCoRgstFlg(JSPUtil.getParameter(request, "cnee_co_rgst_flg", ""));
		setBlDescFlg(JSPUtil.getParameter(request, "bl_desc_flg", ""));
		setRefNoFlg2(JSPUtil.getParameter(request, "ref_no_flg2", ""));
		setRefNoFlg1(JSPUtil.getParameter(request, "ref_no_flg1", ""));
		setCneePhnFlg(JSPUtil.getParameter(request, "cnee_phn_flg", ""));
		setShprNmFlg(JSPUtil.getParameter(request, "shpr_nm_flg", ""));
		setRefNoFlg3(JSPUtil.getParameter(request, "ref_no_flg3", ""));
		setNtfyCtyFlg(JSPUtil.getParameter(request, "ntfy_cty_flg", ""));
		setShprSteFlg(JSPUtil.getParameter(request, "shpr_ste_flg", ""));
		setNtfyPhnFlg(JSPUtil.getParameter(request, "ntfy_phn_flg", ""));
		setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
		setCneeNmFlg(JSPUtil.getParameter(request, "cnee_nm_flg", ""));
		setShprZipFlg(JSPUtil.getParameter(request, "shpr_zip_flg", ""));
		setShprFaxFlg(JSPUtil.getParameter(request, "shpr_fax_flg", ""));
		setPckFlg(JSPUtil.getParameter(request, "pck_flg", ""));
		setNtfyCntFlg(JSPUtil.getParameter(request, "ntfy_cnt_flg", ""));
		setShprAddrFlg(JSPUtil.getParameter(request, "shpr_addr_flg", ""));
	}

	public BkgCstmsRuleStupVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsRuleStupVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsRuleStupVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] shprCoRgstFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_co_rgst_flg".trim(), length));
			String[] frobFlg = (JSPUtil.getParameter(request, prefix	+ "frob_flg".trim(), length));
			String[] ntfyCoRgstFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_co_rgst_flg".trim(), length));
			String[] measFlg = (JSPUtil.getParameter(request, prefix	+ "meas_flg".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] blMkFlg = (JSPUtil.getParameter(request, prefix	+ "bl_mk_flg".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] shprPhnFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_phn_flg".trim(), length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] shprCtyFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_cty_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] shprCntFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_flg".trim(), length));
			String[] ntfyNmFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm_flg".trim(), length));
			String[] wgtFlg = (JSPUtil.getParameter(request, prefix	+ "wgt_flg".trim(), length));
			String[] cneeCntFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_flg".trim(), length));
			String[] ntfyZipFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_zip_flg".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] amsRefNoFlg = (JSPUtil.getParameter(request, prefix	+ "ams_ref_no_flg".trim(), length));
			String[] cneeAddrFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_addr_flg".trim(), length));
			String[] sealNoFlg = (JSPUtil.getParameter(request, prefix	+ "seal_no_flg".trim(), length));
			String[] cntrNoFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_no_flg".trim(), length));
			String[] ntfySteFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_ste_flg".trim(), length));
			String[] cneeSteFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_ste_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] ntfyAddrFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_addr_flg".trim(), length));
			String[] cneeCtyFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_cty_flg".trim(), length));
			String[] cneeFaxFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_fax_flg".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ntfyFaxFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_fax_flg".trim(), length));
			String[] xptImpCd = (JSPUtil.getParameter(request, prefix	+ "xpt_imp_cd".trim(), length));
			String[] cneeZipFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_zip_flg".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cneeCoRgstFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_co_rgst_flg".trim(), length));
			String[] blDescFlg = (JSPUtil.getParameter(request, prefix	+ "bl_desc_flg".trim(), length));
			String[] refNoFlg2 = (JSPUtil.getParameter(request, prefix	+ "ref_no_flg2".trim(), length));
			String[] refNoFlg1 = (JSPUtil.getParameter(request, prefix	+ "ref_no_flg1".trim(), length));
			String[] cneePhnFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_phn_flg".trim(), length));
			String[] shprNmFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_nm_flg".trim(), length));
			String[] refNoFlg3 = (JSPUtil.getParameter(request, prefix	+ "ref_no_flg3".trim(), length));
			String[] ntfyCtyFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_cty_flg".trim(), length));
			String[] shprSteFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_ste_flg".trim(), length));
			String[] ntfyPhnFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_phn_flg".trim(), length));
			String[] blTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_tp_cd".trim(), length));
			String[] cneeNmFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_nm_flg".trim(), length));
			String[] shprZipFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_zip_flg".trim(), length));
			String[] shprFaxFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_fax_flg".trim(), length));
			String[] pckFlg = (JSPUtil.getParameter(request, prefix	+ "pck_flg".trim(), length));
			String[] ntfyCntFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_cnt_flg".trim(), length));
			String[] shprAddrFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_addr_flg".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsRuleStupVO();
				if (shprCoRgstFlg[i] != null)
					model.setShprCoRgstFlg(shprCoRgstFlg[i]);
				if (frobFlg[i] != null)
					model.setFrobFlg(frobFlg[i]);
				if (ntfyCoRgstFlg[i] != null)
					model.setNtfyCoRgstFlg(ntfyCoRgstFlg[i]);
				if (measFlg[i] != null)
					model.setMeasFlg(measFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (blMkFlg[i] != null)
					model.setBlMkFlg(blMkFlg[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (shprPhnFlg[i] != null)
					model.setShprPhnFlg(shprPhnFlg[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (shprCtyFlg[i] != null)
					model.setShprCtyFlg(shprCtyFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (shprCntFlg[i] != null)
					model.setShprCntFlg(shprCntFlg[i]);
				if (ntfyNmFlg[i] != null)
					model.setNtfyNmFlg(ntfyNmFlg[i]);
				if (wgtFlg[i] != null)
					model.setWgtFlg(wgtFlg[i]);
				if (cneeCntFlg[i] != null)
					model.setCneeCntFlg(cneeCntFlg[i]);
				if (ntfyZipFlg[i] != null)
					model.setNtfyZipFlg(ntfyZipFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (amsRefNoFlg[i] != null)
					model.setAmsRefNoFlg(amsRefNoFlg[i]);
				if (cneeAddrFlg[i] != null)
					model.setCneeAddrFlg(cneeAddrFlg[i]);
				if (sealNoFlg[i] != null)
					model.setSealNoFlg(sealNoFlg[i]);
				if (cntrNoFlg[i] != null)
					model.setCntrNoFlg(cntrNoFlg[i]);
				if (ntfySteFlg[i] != null)
					model.setNtfySteFlg(ntfySteFlg[i]);
				if (cneeSteFlg[i] != null)
					model.setCneeSteFlg(cneeSteFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ntfyAddrFlg[i] != null)
					model.setNtfyAddrFlg(ntfyAddrFlg[i]);
				if (cneeCtyFlg[i] != null)
					model.setCneeCtyFlg(cneeCtyFlg[i]);
				if (cneeFaxFlg[i] != null)
					model.setCneeFaxFlg(cneeFaxFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ntfyFaxFlg[i] != null)
					model.setNtfyFaxFlg(ntfyFaxFlg[i]);
				if (xptImpCd[i] != null)
					model.setXptImpCd(xptImpCd[i]);
				if (cneeZipFlg[i] != null)
					model.setCneeZipFlg(cneeZipFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cneeCoRgstFlg[i] != null)
					model.setCneeCoRgstFlg(cneeCoRgstFlg[i]);
				if (blDescFlg[i] != null)
					model.setBlDescFlg(blDescFlg[i]);
				if (refNoFlg2[i] != null)
					model.setRefNoFlg2(refNoFlg2[i]);
				if (refNoFlg1[i] != null)
					model.setRefNoFlg1(refNoFlg1[i]);
				if (cneePhnFlg[i] != null)
					model.setCneePhnFlg(cneePhnFlg[i]);
				if (shprNmFlg[i] != null)
					model.setShprNmFlg(shprNmFlg[i]);
				if (refNoFlg3[i] != null)
					model.setRefNoFlg3(refNoFlg3[i]);
				if (ntfyCtyFlg[i] != null)
					model.setNtfyCtyFlg(ntfyCtyFlg[i]);
				if (shprSteFlg[i] != null)
					model.setShprSteFlg(shprSteFlg[i]);
				if (ntfyPhnFlg[i] != null)
					model.setNtfyPhnFlg(ntfyPhnFlg[i]);
				if (blTpCd[i] != null)
					model.setBlTpCd(blTpCd[i]);
				if (cneeNmFlg[i] != null)
					model.setCneeNmFlg(cneeNmFlg[i]);
				if (shprZipFlg[i] != null)
					model.setShprZipFlg(shprZipFlg[i]);
				if (shprFaxFlg[i] != null)
					model.setShprFaxFlg(shprFaxFlg[i]);
				if (pckFlg[i] != null)
					model.setPckFlg(pckFlg[i]);
				if (ntfyCntFlg[i] != null)
					model.setNtfyCntFlg(ntfyCntFlg[i]);
				if (shprAddrFlg[i] != null)
					model.setShprAddrFlg(shprAddrFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgCstmsRuleStupVOs();
	}

	public BkgCstmsRuleStupVO[] getBkgCstmsRuleStupVOs(){
		BkgCstmsRuleStupVO[] vos = (BkgCstmsRuleStupVO[])models.toArray(new BkgCstmsRuleStupVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.shprCoRgstFlg = this.shprCoRgstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frobFlg = this.frobFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCoRgstFlg = this.ntfyCoRgstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measFlg = this.measFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blMkFlg = this.blMkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprPhnFlg = this.shprPhnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCtyFlg = this.shprCtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntFlg = this.shprCntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNmFlg = this.ntfyNmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtFlg = this.wgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntFlg = this.cneeCntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyZipFlg = this.ntfyZipFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsRefNoFlg = this.amsRefNoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeAddrFlg = this.cneeAddrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sealNoFlg = this.sealNoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNoFlg = this.cntrNoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfySteFlg = this.ntfySteFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeSteFlg = this.cneeSteFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyAddrFlg = this.ntfyAddrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCtyFlg = this.cneeCtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeFaxFlg = this.cneeFaxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyFaxFlg = this.ntfyFaxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptImpCd = this.xptImpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeZipFlg = this.cneeZipFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCoRgstFlg = this.cneeCoRgstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDescFlg = this.blDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNoFlg2 = this.refNoFlg2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNoFlg1 = this.refNoFlg1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneePhnFlg = this.cneePhnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNmFlg = this.shprNmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNoFlg3 = this.refNoFlg3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCtyFlg = this.ntfyCtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSteFlg = this.shprSteFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyPhnFlg = this.ntfyPhnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blTpCd = this.blTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNmFlg = this.cneeNmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprZipFlg = this.shprZipFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprFaxFlg = this.shprFaxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckFlg = this.pckFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCntFlg = this.ntfyCntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprAddrFlg = this.shprAddrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
