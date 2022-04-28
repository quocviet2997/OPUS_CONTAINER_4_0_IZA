/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgRevDtlVO.java
*@FileTitle : CoaBkgRevDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaBkgRevDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgRevDtlVO> models = new ArrayList<CoaBkgRevDtlVO>();
	
	/* Column Info */
	private String fcgoTzHrs = null;
	/* Column Info */
	private String costRoutNo = null;
	/* Column Info */
	private String scrChgRev = null;
	/* Column Info */
	private String mcgoTzDys = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String spclRcFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rdFlg = null;
	/* Column Info */
	private String revActFlg = null;
	/* Column Info */
	private String raCmCostAmt = null;
	/* Column Info */
	private String raActCmAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String estmOpfitCostAmt = null;
	/* Column Info */
	private String shprCntrQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String actCmCostAmt = null;
	/* Column Info */
	private String bkgQty = null;
	/* Column Info */
	private String raOpfitCostAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String spclDgCgoFlg = null;
	/* Column Info */
	private String mcgoTzHrs = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String shprCntrTpszCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String actOpfitCostAmt = null;
	/* Column Info */
	private String bkgMiscRev = null;
	/* Column Info */
	private String bkgRev = null;
	/* Column Info */
	private String fcgoTzDys = null;
	/* Column Info */
	private String acclRtAmt = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String bkgOftRev = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String spclBbCgoFlg = null;
	/* Column Info */
	private String etcUtRevAmt = null;
	/* Column Info */
	private String raOpfitActAmt = null;
	/* Column Info */
	private String spclCntrTpszCd = null;
	/* Column Info */
	private String estmCmCostAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgRevDtlVO() {}

	public CoaBkgRevDtlVO(String ibflag, String pagerows, String bkgNo, String cntrTpszCd, String costRoutNo, String bkgRev, String bkgOftRev, String bkgMiscRev, String scrChgRev, String revActFlg, String bkgQty, String estmCmCostAmt, String estmOpfitCostAmt, String raCmCostAmt, String raOpfitCostAmt, String actCmCostAmt, String actOpfitCostAmt, String raOpfitActAmt, String raActCmAmt, String acclRtAmt, String shprCntrTpszCd, String shprCntrQty, String spclRcFlg, String spclDgCgoFlg, String spclBbCgoFlg, String spclAwkCgoFlg, String rdFlg, String socFlg, String deltFlg, String fcgoTzDys, String fcgoTzHrs, String mcgoTzDys, String mcgoTzHrs, String etcUtRevAmt, String spclCntrTpszCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.fcgoTzHrs = fcgoTzHrs;
		this.costRoutNo = costRoutNo;
		this.scrChgRev = scrChgRev;
		this.mcgoTzDys = mcgoTzDys;
		this.deltFlg = deltFlg;
		this.spclRcFlg = spclRcFlg;
		this.creDt = creDt;
		this.rdFlg = rdFlg;
		this.revActFlg = revActFlg;
		this.raCmCostAmt = raCmCostAmt;
		this.raActCmAmt = raActCmAmt;
		this.pagerows = pagerows;
		this.estmOpfitCostAmt = estmOpfitCostAmt;
		this.shprCntrQty = shprCntrQty;
		this.ibflag = ibflag;
		this.actCmCostAmt = actCmCostAmt;
		this.bkgQty = bkgQty;
		this.raOpfitCostAmt = raOpfitCostAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.spclDgCgoFlg = spclDgCgoFlg;
		this.mcgoTzHrs = mcgoTzHrs;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.shprCntrTpszCd = shprCntrTpszCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.actOpfitCostAmt = actOpfitCostAmt;
		this.bkgMiscRev = bkgMiscRev;
		this.bkgRev = bkgRev;
		this.fcgoTzDys = fcgoTzDys;
		this.acclRtAmt = acclRtAmt;
		this.socFlg = socFlg;
		this.bkgOftRev = bkgOftRev;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.spclBbCgoFlg = spclBbCgoFlg;
		this.etcUtRevAmt = etcUtRevAmt;
		this.raOpfitActAmt = raOpfitActAmt;
		this.spclCntrTpszCd = spclCntrTpszCd;
		this.estmCmCostAmt = estmCmCostAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("fcgo_tz_hrs", getFcgoTzHrs());
		this.hashColumns.put("cost_rout_no", getCostRoutNo());
		this.hashColumns.put("scr_chg_rev", getScrChgRev());
		this.hashColumns.put("mcgo_tz_dys", getMcgoTzDys());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("spcl_rc_flg", getSpclRcFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rd_flg", getRdFlg());
		this.hashColumns.put("rev_act_flg", getRevActFlg());
		this.hashColumns.put("ra_cm_cost_amt", getRaCmCostAmt());
		this.hashColumns.put("ra_act_cm_amt", getRaActCmAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("estm_opfit_cost_amt", getEstmOpfitCostAmt());
		this.hashColumns.put("shpr_cntr_qty", getShprCntrQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("act_cm_cost_amt", getActCmCostAmt());
		this.hashColumns.put("bkg_qty", getBkgQty());
		this.hashColumns.put("ra_opfit_cost_amt", getRaOpfitCostAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("spcl_dg_cgo_flg", getSpclDgCgoFlg());
		this.hashColumns.put("mcgo_tz_hrs", getMcgoTzHrs());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("shpr_cntr_tpsz_cd", getShprCntrTpszCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("act_opfit_cost_amt", getActOpfitCostAmt());
		this.hashColumns.put("bkg_misc_rev", getBkgMiscRev());
		this.hashColumns.put("bkg_rev", getBkgRev());
		this.hashColumns.put("fcgo_tz_dys", getFcgoTzDys());
		this.hashColumns.put("accl_rt_amt", getAcclRtAmt());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("bkg_oft_rev", getBkgOftRev());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("spcl_bb_cgo_flg", getSpclBbCgoFlg());
		this.hashColumns.put("etc_ut_rev_amt", getEtcUtRevAmt());
		this.hashColumns.put("ra_opfit_act_amt", getRaOpfitActAmt());
		this.hashColumns.put("spcl_cntr_tpsz_cd", getSpclCntrTpszCd());
		this.hashColumns.put("estm_cm_cost_amt", getEstmCmCostAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("fcgo_tz_hrs", "fcgoTzHrs");
		this.hashFields.put("cost_rout_no", "costRoutNo");
		this.hashFields.put("scr_chg_rev", "scrChgRev");
		this.hashFields.put("mcgo_tz_dys", "mcgoTzDys");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("spcl_rc_flg", "spclRcFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rd_flg", "rdFlg");
		this.hashFields.put("rev_act_flg", "revActFlg");
		this.hashFields.put("ra_cm_cost_amt", "raCmCostAmt");
		this.hashFields.put("ra_act_cm_amt", "raActCmAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("estm_opfit_cost_amt", "estmOpfitCostAmt");
		this.hashFields.put("shpr_cntr_qty", "shprCntrQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("act_cm_cost_amt", "actCmCostAmt");
		this.hashFields.put("bkg_qty", "bkgQty");
		this.hashFields.put("ra_opfit_cost_amt", "raOpfitCostAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("spcl_dg_cgo_flg", "spclDgCgoFlg");
		this.hashFields.put("mcgo_tz_hrs", "mcgoTzHrs");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("shpr_cntr_tpsz_cd", "shprCntrTpszCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("act_opfit_cost_amt", "actOpfitCostAmt");
		this.hashFields.put("bkg_misc_rev", "bkgMiscRev");
		this.hashFields.put("bkg_rev", "bkgRev");
		this.hashFields.put("fcgo_tz_dys", "fcgoTzDys");
		this.hashFields.put("accl_rt_amt", "acclRtAmt");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("bkg_oft_rev", "bkgOftRev");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("spcl_bb_cgo_flg", "spclBbCgoFlg");
		this.hashFields.put("etc_ut_rev_amt", "etcUtRevAmt");
		this.hashFields.put("ra_opfit_act_amt", "raOpfitActAmt");
		this.hashFields.put("spcl_cntr_tpsz_cd", "spclCntrTpszCd");
		this.hashFields.put("estm_cm_cost_amt", "estmCmCostAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return fcgoTzHrs
	 */
	public String getFcgoTzHrs() {
		return this.fcgoTzHrs;
	}
	
	/**
	 * Column Info
	 * @return costRoutNo
	 */
	public String getCostRoutNo() {
		return this.costRoutNo;
	}
	
	/**
	 * Column Info
	 * @return scrChgRev
	 */
	public String getScrChgRev() {
		return this.scrChgRev;
	}
	
	/**
	 * Column Info
	 * @return mcgoTzDys
	 */
	public String getMcgoTzDys() {
		return this.mcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return spclRcFlg
	 */
	public String getSpclRcFlg() {
		return this.spclRcFlg;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return rdFlg
	 */
	public String getRdFlg() {
		return this.rdFlg;
	}
	
	/**
	 * Column Info
	 * @return revActFlg
	 */
	public String getRevActFlg() {
		return this.revActFlg;
	}
	
	/**
	 * Column Info
	 * @return raCmCostAmt
	 */
	public String getRaCmCostAmt() {
		return this.raCmCostAmt;
	}
	
	/**
	 * Column Info
	 * @return raActCmAmt
	 */
	public String getRaActCmAmt() {
		return this.raActCmAmt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return estmOpfitCostAmt
	 */
	public String getEstmOpfitCostAmt() {
		return this.estmOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @return shprCntrQty
	 */
	public String getShprCntrQty() {
		return this.shprCntrQty;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return actCmCostAmt
	 */
	public String getActCmCostAmt() {
		return this.actCmCostAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgQty
	 */
	public String getBkgQty() {
		return this.bkgQty;
	}
	
	/**
	 * Column Info
	 * @return raOpfitCostAmt
	 */
	public String getRaOpfitCostAmt() {
		return this.raOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return spclDgCgoFlg
	 */
	public String getSpclDgCgoFlg() {
		return this.spclDgCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return mcgoTzHrs
	 */
	public String getMcgoTzHrs() {
		return this.mcgoTzHrs;
	}
	
	/**
	 * Column Info
	 * @return spclAwkCgoFlg
	 */
	public String getSpclAwkCgoFlg() {
		return this.spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return shprCntrTpszCd
	 */
	public String getShprCntrTpszCd() {
		return this.shprCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return actOpfitCostAmt
	 */
	public String getActOpfitCostAmt() {
		return this.actOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgMiscRev
	 */
	public String getBkgMiscRev() {
		return this.bkgMiscRev;
	}
	
	/**
	 * Column Info
	 * @return bkgRev
	 */
	public String getBkgRev() {
		return this.bkgRev;
	}
	
	/**
	 * Column Info
	 * @return fcgoTzDys
	 */
	public String getFcgoTzDys() {
		return this.fcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @return acclRtAmt
	 */
	public String getAcclRtAmt() {
		return this.acclRtAmt;
	}
	
	/**
	 * Column Info
	 * @return socFlg
	 */
	public String getSocFlg() {
		return this.socFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgOftRev
	 */
	public String getBkgOftRev() {
		return this.bkgOftRev;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return spclBbCgoFlg
	 */
	public String getSpclBbCgoFlg() {
		return this.spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return etcUtRevAmt
	 */
	public String getEtcUtRevAmt() {
		return this.etcUtRevAmt;
	}
	
	/**
	 * Column Info
	 * @return raOpfitActAmt
	 */
	public String getRaOpfitActAmt() {
		return this.raOpfitActAmt;
	}
	
	/**
	 * Column Info
	 * @return spclCntrTpszCd
	 */
	public String getSpclCntrTpszCd() {
		return this.spclCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return estmCmCostAmt
	 */
	public String getEstmCmCostAmt() {
		return this.estmCmCostAmt;
	}
	

	/**
	 * Column Info
	 * @param fcgoTzHrs
	 */
	public void setFcgoTzHrs(String fcgoTzHrs) {
		this.fcgoTzHrs = fcgoTzHrs;
	}
	
	/**
	 * Column Info
	 * @param costRoutNo
	 */
	public void setCostRoutNo(String costRoutNo) {
		this.costRoutNo = costRoutNo;
	}
	
	/**
	 * Column Info
	 * @param scrChgRev
	 */
	public void setScrChgRev(String scrChgRev) {
		this.scrChgRev = scrChgRev;
	}
	
	/**
	 * Column Info
	 * @param mcgoTzDys
	 */
	public void setMcgoTzDys(String mcgoTzDys) {
		this.mcgoTzDys = mcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param spclRcFlg
	 */
	public void setSpclRcFlg(String spclRcFlg) {
		this.spclRcFlg = spclRcFlg;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param rdFlg
	 */
	public void setRdFlg(String rdFlg) {
		this.rdFlg = rdFlg;
	}
	
	/**
	 * Column Info
	 * @param revActFlg
	 */
	public void setRevActFlg(String revActFlg) {
		this.revActFlg = revActFlg;
	}
	
	/**
	 * Column Info
	 * @param raCmCostAmt
	 */
	public void setRaCmCostAmt(String raCmCostAmt) {
		this.raCmCostAmt = raCmCostAmt;
	}
	
	/**
	 * Column Info
	 * @param raActCmAmt
	 */
	public void setRaActCmAmt(String raActCmAmt) {
		this.raActCmAmt = raActCmAmt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param estmOpfitCostAmt
	 */
	public void setEstmOpfitCostAmt(String estmOpfitCostAmt) {
		this.estmOpfitCostAmt = estmOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @param shprCntrQty
	 */
	public void setShprCntrQty(String shprCntrQty) {
		this.shprCntrQty = shprCntrQty;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param actCmCostAmt
	 */
	public void setActCmCostAmt(String actCmCostAmt) {
		this.actCmCostAmt = actCmCostAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgQty
	 */
	public void setBkgQty(String bkgQty) {
		this.bkgQty = bkgQty;
	}
	
	/**
	 * Column Info
	 * @param raOpfitCostAmt
	 */
	public void setRaOpfitCostAmt(String raOpfitCostAmt) {
		this.raOpfitCostAmt = raOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param spclDgCgoFlg
	 */
	public void setSpclDgCgoFlg(String spclDgCgoFlg) {
		this.spclDgCgoFlg = spclDgCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param mcgoTzHrs
	 */
	public void setMcgoTzHrs(String mcgoTzHrs) {
		this.mcgoTzHrs = mcgoTzHrs;
	}
	
	/**
	 * Column Info
	 * @param spclAwkCgoFlg
	 */
	public void setSpclAwkCgoFlg(String spclAwkCgoFlg) {
		this.spclAwkCgoFlg = spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param shprCntrTpszCd
	 */
	public void setShprCntrTpszCd(String shprCntrTpszCd) {
		this.shprCntrTpszCd = shprCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param actOpfitCostAmt
	 */
	public void setActOpfitCostAmt(String actOpfitCostAmt) {
		this.actOpfitCostAmt = actOpfitCostAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgMiscRev
	 */
	public void setBkgMiscRev(String bkgMiscRev) {
		this.bkgMiscRev = bkgMiscRev;
	}
	
	/**
	 * Column Info
	 * @param bkgRev
	 */
	public void setBkgRev(String bkgRev) {
		this.bkgRev = bkgRev;
	}
	
	/**
	 * Column Info
	 * @param fcgoTzDys
	 */
	public void setFcgoTzDys(String fcgoTzDys) {
		this.fcgoTzDys = fcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @param acclRtAmt
	 */
	public void setAcclRtAmt(String acclRtAmt) {
		this.acclRtAmt = acclRtAmt;
	}
	
	/**
	 * Column Info
	 * @param socFlg
	 */
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgOftRev
	 */
	public void setBkgOftRev(String bkgOftRev) {
		this.bkgOftRev = bkgOftRev;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param spclBbCgoFlg
	 */
	public void setSpclBbCgoFlg(String spclBbCgoFlg) {
		this.spclBbCgoFlg = spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param etcUtRevAmt
	 */
	public void setEtcUtRevAmt(String etcUtRevAmt) {
		this.etcUtRevAmt = etcUtRevAmt;
	}
	
	/**
	 * Column Info
	 * @param raOpfitActAmt
	 */
	public void setRaOpfitActAmt(String raOpfitActAmt) {
		this.raOpfitActAmt = raOpfitActAmt;
	}
	
	/**
	 * Column Info
	 * @param spclCntrTpszCd
	 */
	public void setSpclCntrTpszCd(String spclCntrTpszCd) {
		this.spclCntrTpszCd = spclCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param estmCmCostAmt
	 */
	public void setEstmCmCostAmt(String estmCmCostAmt) {
		this.estmCmCostAmt = estmCmCostAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setFcgoTzHrs(JSPUtil.getParameter(request, "fcgo_tz_hrs", ""));
		setCostRoutNo(JSPUtil.getParameter(request, "cost_rout_no", ""));
		setScrChgRev(JSPUtil.getParameter(request, "scr_chg_rev", ""));
		setMcgoTzDys(JSPUtil.getParameter(request, "mcgo_tz_dys", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setSpclRcFlg(JSPUtil.getParameter(request, "spcl_rc_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRdFlg(JSPUtil.getParameter(request, "rd_flg", ""));
		setRevActFlg(JSPUtil.getParameter(request, "rev_act_flg", ""));
		setRaCmCostAmt(JSPUtil.getParameter(request, "ra_cm_cost_amt", ""));
		setRaActCmAmt(JSPUtil.getParameter(request, "ra_act_cm_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEstmOpfitCostAmt(JSPUtil.getParameter(request, "estm_opfit_cost_amt", ""));
		setShprCntrQty(JSPUtil.getParameter(request, "shpr_cntr_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setActCmCostAmt(JSPUtil.getParameter(request, "act_cm_cost_amt", ""));
		setBkgQty(JSPUtil.getParameter(request, "bkg_qty", ""));
		setRaOpfitCostAmt(JSPUtil.getParameter(request, "ra_opfit_cost_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setSpclDgCgoFlg(JSPUtil.getParameter(request, "spcl_dg_cgo_flg", ""));
		setMcgoTzHrs(JSPUtil.getParameter(request, "mcgo_tz_hrs", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setShprCntrTpszCd(JSPUtil.getParameter(request, "shpr_cntr_tpsz_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setActOpfitCostAmt(JSPUtil.getParameter(request, "act_opfit_cost_amt", ""));
		setBkgMiscRev(JSPUtil.getParameter(request, "bkg_misc_rev", ""));
		setBkgRev(JSPUtil.getParameter(request, "bkg_rev", ""));
		setFcgoTzDys(JSPUtil.getParameter(request, "fcgo_tz_dys", ""));
		setAcclRtAmt(JSPUtil.getParameter(request, "accl_rt_amt", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setBkgOftRev(JSPUtil.getParameter(request, "bkg_oft_rev", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setSpclBbCgoFlg(JSPUtil.getParameter(request, "spcl_bb_cgo_flg", ""));
		setEtcUtRevAmt(JSPUtil.getParameter(request, "etc_ut_rev_amt", ""));
		setRaOpfitActAmt(JSPUtil.getParameter(request, "ra_opfit_act_amt", ""));
		setSpclCntrTpszCd(JSPUtil.getParameter(request, "spcl_cntr_tpsz_cd", ""));
		setEstmCmCostAmt(JSPUtil.getParameter(request, "estm_cm_cost_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgRevDtlVO[]
	 */
	public CoaBkgRevDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgRevDtlVO[]
	 */
	public CoaBkgRevDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgRevDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] fcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_hrs", length));
			String[] costRoutNo = (JSPUtil.getParameter(request, prefix	+ "cost_rout_no", length));
			String[] scrChgRev = (JSPUtil.getParameter(request, prefix	+ "scr_chg_rev", length));
			String[] mcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_dys", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] spclRcFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rc_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rdFlg = (JSPUtil.getParameter(request, prefix	+ "rd_flg", length));
			String[] revActFlg = (JSPUtil.getParameter(request, prefix	+ "rev_act_flg", length));
			String[] raCmCostAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_cost_amt", length));
			String[] raActCmAmt = (JSPUtil.getParameter(request, prefix	+ "ra_act_cm_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] estmOpfitCostAmt = (JSPUtil.getParameter(request, prefix	+ "estm_opfit_cost_amt", length));
			String[] shprCntrQty = (JSPUtil.getParameter(request, prefix	+ "shpr_cntr_qty", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] actCmCostAmt = (JSPUtil.getParameter(request, prefix	+ "act_cm_cost_amt", length));
			String[] bkgQty = (JSPUtil.getParameter(request, prefix	+ "bkg_qty", length));
			String[] raOpfitCostAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_cost_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] spclDgCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_dg_cgo_flg", length));
			String[] mcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_hrs", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] shprCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cntr_tpsz_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] actOpfitCostAmt = (JSPUtil.getParameter(request, prefix	+ "act_opfit_cost_amt", length));
			String[] bkgMiscRev = (JSPUtil.getParameter(request, prefix	+ "bkg_misc_rev", length));
			String[] bkgRev = (JSPUtil.getParameter(request, prefix	+ "bkg_rev", length));
			String[] fcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_dys", length));
			String[] acclRtAmt = (JSPUtil.getParameter(request, prefix	+ "accl_rt_amt", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] bkgOftRev = (JSPUtil.getParameter(request, prefix	+ "bkg_oft_rev", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] spclBbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bb_cgo_flg", length));
			String[] etcUtRevAmt = (JSPUtil.getParameter(request, prefix	+ "etc_ut_rev_amt", length));
			String[] raOpfitActAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_act_amt", length));
			String[] spclCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cntr_tpsz_cd", length));
			String[] estmCmCostAmt = (JSPUtil.getParameter(request, prefix	+ "estm_cm_cost_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgRevDtlVO();
				if (fcgoTzHrs[i] != null)
					model.setFcgoTzHrs(fcgoTzHrs[i]);
				if (costRoutNo[i] != null)
					model.setCostRoutNo(costRoutNo[i]);
				if (scrChgRev[i] != null)
					model.setScrChgRev(scrChgRev[i]);
				if (mcgoTzDys[i] != null)
					model.setMcgoTzDys(mcgoTzDys[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (spclRcFlg[i] != null)
					model.setSpclRcFlg(spclRcFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rdFlg[i] != null)
					model.setRdFlg(rdFlg[i]);
				if (revActFlg[i] != null)
					model.setRevActFlg(revActFlg[i]);
				if (raCmCostAmt[i] != null)
					model.setRaCmCostAmt(raCmCostAmt[i]);
				if (raActCmAmt[i] != null)
					model.setRaActCmAmt(raActCmAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (estmOpfitCostAmt[i] != null)
					model.setEstmOpfitCostAmt(estmOpfitCostAmt[i]);
				if (shprCntrQty[i] != null)
					model.setShprCntrQty(shprCntrQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (actCmCostAmt[i] != null)
					model.setActCmCostAmt(actCmCostAmt[i]);
				if (bkgQty[i] != null)
					model.setBkgQty(bkgQty[i]);
				if (raOpfitCostAmt[i] != null)
					model.setRaOpfitCostAmt(raOpfitCostAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (spclDgCgoFlg[i] != null)
					model.setSpclDgCgoFlg(spclDgCgoFlg[i]);
				if (mcgoTzHrs[i] != null)
					model.setMcgoTzHrs(mcgoTzHrs[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (shprCntrTpszCd[i] != null)
					model.setShprCntrTpszCd(shprCntrTpszCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (actOpfitCostAmt[i] != null)
					model.setActOpfitCostAmt(actOpfitCostAmt[i]);
				if (bkgMiscRev[i] != null)
					model.setBkgMiscRev(bkgMiscRev[i]);
				if (bkgRev[i] != null)
					model.setBkgRev(bkgRev[i]);
				if (fcgoTzDys[i] != null)
					model.setFcgoTzDys(fcgoTzDys[i]);
				if (acclRtAmt[i] != null)
					model.setAcclRtAmt(acclRtAmt[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (bkgOftRev[i] != null)
					model.setBkgOftRev(bkgOftRev[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (spclBbCgoFlg[i] != null)
					model.setSpclBbCgoFlg(spclBbCgoFlg[i]);
				if (etcUtRevAmt[i] != null)
					model.setEtcUtRevAmt(etcUtRevAmt[i]);
				if (raOpfitActAmt[i] != null)
					model.setRaOpfitActAmt(raOpfitActAmt[i]);
				if (spclCntrTpszCd[i] != null)
					model.setSpclCntrTpszCd(spclCntrTpszCd[i]);
				if (estmCmCostAmt[i] != null)
					model.setEstmCmCostAmt(estmCmCostAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgRevDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgRevDtlVO[]
	 */
	public CoaBkgRevDtlVO[] getCoaBkgRevDtlVOs(){
		CoaBkgRevDtlVO[] vos = (CoaBkgRevDtlVO[])models.toArray(new CoaBkgRevDtlVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.fcgoTzHrs = this.fcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costRoutNo = this.costRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scrChgRev = this.scrChgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzDys = this.mcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRcFlg = this.spclRcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdFlg = this.rdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revActFlg = this.revActFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmCostAmt = this.raCmCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raActCmAmt = this.raActCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmOpfitCostAmt = this.estmOpfitCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntrQty = this.shprCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCmCostAmt = this.actCmCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgQty = this.bkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitCostAmt = this.raOpfitCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclDgCgoFlg = this.spclDgCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzHrs = this.mcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntrTpszCd = this.shprCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actOpfitCostAmt = this.actOpfitCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMiscRev = this.bkgMiscRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRev = this.bkgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzDys = this.fcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclRtAmt = this.acclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOftRev = this.bkgOftRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBbCgoFlg = this.spclBbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcUtRevAmt = this.etcUtRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitActAmt = this.raOpfitActAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCntrTpszCd = this.spclCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCmCostAmt = this.estmCmCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
