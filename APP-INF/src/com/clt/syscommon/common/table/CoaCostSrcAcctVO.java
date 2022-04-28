/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCostSrcAcctVO.java
*@FileTitle : CoaCostSrcAcctVO
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

public class CoaCostSrcAcctVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCostSrcAcctVO> models = new ArrayList<CoaCostSrcAcctVO>();
	
	/* Column Info */
	private String coaCostSrcCdNm = null;
	/* Column Info */
	private String spclCgoAwkFlg = null;
	/* Column Info */
	private String spclCgoOtrFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sgrpCostCd = null;
	/* Column Info */
	private String costVolCd = null;
	/* Column Info */
	private String costSrcSysCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String costSrcMon = null;
	/* Column Info */
	private String costVolCd1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String spclCgoDgFlg = null;
	/* Column Info */
	private String spclCgoRfFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bkgFullSocCgoFlg = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String bkgMcgoFlg = null;
	/* Column Info */
	private String coaCostSrcPrtCd = null;
	/* Column Info */
	private String costUtAmtCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgRevMcgoFlg = null;
	/* Column Info */
	private String spclCgoBbFlg = null;
	/* Column Info */
	private String raSgrpCostCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String bkgFullOwnCgoFlg = null;
	/* Column Info */
	private String raCostTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCostSrcAcctVO() {}

	public CoaCostSrcAcctVO(String ibflag, String pagerows, String coaCostSrcCd, String costAssBseCd, String stndCostCd, String sgrpCostCd, String raSgrpCostCd, String coaCostSrcPrtCd, String costSrcSysCd, String costVolCd, String costVolCd1, String fullMtyCd, String costSrcMon, String coaCostSrcCdNm, String costUtAmtCd, String bkgFullOwnCgoFlg, String bkgFullSocCgoFlg, String bkgMcgoFlg, String bkgRevMcgoFlg, String raCostTpCd, String spclCgoDgFlg, String spclCgoBbFlg, String spclCgoAwkFlg, String spclCgoRfFlg, String spclCgoOtrFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.coaCostSrcCdNm = coaCostSrcCdNm;
		this.spclCgoAwkFlg = spclCgoAwkFlg;
		this.spclCgoOtrFlg = spclCgoOtrFlg;
		this.deltFlg = deltFlg;
		this.coaCostSrcCd = coaCostSrcCd;
		this.creDt = creDt;
		this.sgrpCostCd = sgrpCostCd;
		this.costVolCd = costVolCd;
		this.costSrcSysCd = costSrcSysCd;
		this.pagerows = pagerows;
		this.costSrcMon = costSrcMon;
		this.costVolCd1 = costVolCd1;
		this.ibflag = ibflag;
		this.spclCgoDgFlg = spclCgoDgFlg;
		this.spclCgoRfFlg = spclCgoRfFlg;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		this.updDt = updDt;
		this.bkgFullSocCgoFlg = bkgFullSocCgoFlg;
		this.costAssBseCd = costAssBseCd;
		this.bkgMcgoFlg = bkgMcgoFlg;
		this.coaCostSrcPrtCd = coaCostSrcPrtCd;
		this.costUtAmtCd = costUtAmtCd;
		this.creUsrId = creUsrId;
		this.bkgRevMcgoFlg = bkgRevMcgoFlg;
		this.spclCgoBbFlg = spclCgoBbFlg;
		this.raSgrpCostCd = raSgrpCostCd;
		this.fullMtyCd = fullMtyCd;
		this.bkgFullOwnCgoFlg = bkgFullOwnCgoFlg;
		this.raCostTpCd = raCostTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("coa_cost_src_cd_nm", getCoaCostSrcCdNm());
		this.hashColumns.put("spcl_cgo_awk_flg", getSpclCgoAwkFlg());
		this.hashColumns.put("spcl_cgo_otr_flg", getSpclCgoOtrFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sgrp_cost_cd", getSgrpCostCd());
		this.hashColumns.put("cost_vol_cd", getCostVolCd());
		this.hashColumns.put("cost_src_sys_cd", getCostSrcSysCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cost_src_mon", getCostSrcMon());
		this.hashColumns.put("cost_vol_cd1", getCostVolCd1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("spcl_cgo_dg_flg", getSpclCgoDgFlg());
		this.hashColumns.put("spcl_cgo_rf_flg", getSpclCgoRfFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bkg_full_soc_cgo_flg", getBkgFullSocCgoFlg());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("bkg_mcgo_flg", getBkgMcgoFlg());
		this.hashColumns.put("coa_cost_src_prt_cd", getCoaCostSrcPrtCd());
		this.hashColumns.put("cost_ut_amt_cd", getCostUtAmtCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_rev_mcgo_flg", getBkgRevMcgoFlg());
		this.hashColumns.put("spcl_cgo_bb_flg", getSpclCgoBbFlg());
		this.hashColumns.put("ra_sgrp_cost_cd", getRaSgrpCostCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("bkg_full_own_cgo_flg", getBkgFullOwnCgoFlg());
		this.hashColumns.put("ra_cost_tp_cd", getRaCostTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("coa_cost_src_cd_nm", "coaCostSrcCdNm");
		this.hashFields.put("spcl_cgo_awk_flg", "spclCgoAwkFlg");
		this.hashFields.put("spcl_cgo_otr_flg", "spclCgoOtrFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sgrp_cost_cd", "sgrpCostCd");
		this.hashFields.put("cost_vol_cd", "costVolCd");
		this.hashFields.put("cost_src_sys_cd", "costSrcSysCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cost_src_mon", "costSrcMon");
		this.hashFields.put("cost_vol_cd1", "costVolCd1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("spcl_cgo_dg_flg", "spclCgoDgFlg");
		this.hashFields.put("spcl_cgo_rf_flg", "spclCgoRfFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bkg_full_soc_cgo_flg", "bkgFullSocCgoFlg");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("bkg_mcgo_flg", "bkgMcgoFlg");
		this.hashFields.put("coa_cost_src_prt_cd", "coaCostSrcPrtCd");
		this.hashFields.put("cost_ut_amt_cd", "costUtAmtCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_rev_mcgo_flg", "bkgRevMcgoFlg");
		this.hashFields.put("spcl_cgo_bb_flg", "spclCgoBbFlg");
		this.hashFields.put("ra_sgrp_cost_cd", "raSgrpCostCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("bkg_full_own_cgo_flg", "bkgFullOwnCgoFlg");
		this.hashFields.put("ra_cost_tp_cd", "raCostTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCdNm
	 */
	public String getCoaCostSrcCdNm() {
		return this.coaCostSrcCdNm;
	}
	
	/**
	 * Column Info
	 * @return spclCgoAwkFlg
	 */
	public String getSpclCgoAwkFlg() {
		return this.spclCgoAwkFlg;
	}
	
	/**
	 * Column Info
	 * @return spclCgoOtrFlg
	 */
	public String getSpclCgoOtrFlg() {
		return this.spclCgoOtrFlg;
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
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
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
	 * @return sgrpCostCd
	 */
	public String getSgrpCostCd() {
		return this.sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @return costVolCd
	 */
	public String getCostVolCd() {
		return this.costVolCd;
	}
	
	/**
	 * Column Info
	 * @return costSrcSysCd
	 */
	public String getCostSrcSysCd() {
		return this.costSrcSysCd;
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
	 * @return costSrcMon
	 */
	public String getCostSrcMon() {
		return this.costSrcMon;
	}
	
	/**
	 * Column Info
	 * @return costVolCd1
	 */
	public String getCostVolCd1() {
		return this.costVolCd1;
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
	 * @return spclCgoDgFlg
	 */
	public String getSpclCgoDgFlg() {
		return this.spclCgoDgFlg;
	}
	
	/**
	 * Column Info
	 * @return spclCgoRfFlg
	 */
	public String getSpclCgoRfFlg() {
		return this.spclCgoRfFlg;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
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
	 * @return bkgFullSocCgoFlg
	 */
	public String getBkgFullSocCgoFlg() {
		return this.bkgFullSocCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return costAssBseCd
	 */
	public String getCostAssBseCd() {
		return this.costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @return bkgMcgoFlg
	 */
	public String getBkgMcgoFlg() {
		return this.bkgMcgoFlg;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcPrtCd
	 */
	public String getCoaCostSrcPrtCd() {
		return this.coaCostSrcPrtCd;
	}
	
	/**
	 * Column Info
	 * @return costUtAmtCd
	 */
	public String getCostUtAmtCd() {
		return this.costUtAmtCd;
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
	 * @return bkgRevMcgoFlg
	 */
	public String getBkgRevMcgoFlg() {
		return this.bkgRevMcgoFlg;
	}
	
	/**
	 * Column Info
	 * @return spclCgoBbFlg
	 */
	public String getSpclCgoBbFlg() {
		return this.spclCgoBbFlg;
	}
	
	/**
	 * Column Info
	 * @return raSgrpCostCd
	 */
	public String getRaSgrpCostCd() {
		return this.raSgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return bkgFullOwnCgoFlg
	 */
	public String getBkgFullOwnCgoFlg() {
		return this.bkgFullOwnCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return raCostTpCd
	 */
	public String getRaCostTpCd() {
		return this.raCostTpCd;
	}
	

	/**
	 * Column Info
	 * @param coaCostSrcCdNm
	 */
	public void setCoaCostSrcCdNm(String coaCostSrcCdNm) {
		this.coaCostSrcCdNm = coaCostSrcCdNm;
	}
	
	/**
	 * Column Info
	 * @param spclCgoAwkFlg
	 */
	public void setSpclCgoAwkFlg(String spclCgoAwkFlg) {
		this.spclCgoAwkFlg = spclCgoAwkFlg;
	}
	
	/**
	 * Column Info
	 * @param spclCgoOtrFlg
	 */
	public void setSpclCgoOtrFlg(String spclCgoOtrFlg) {
		this.spclCgoOtrFlg = spclCgoOtrFlg;
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
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
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
	 * @param sgrpCostCd
	 */
	public void setSgrpCostCd(String sgrpCostCd) {
		this.sgrpCostCd = sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @param costVolCd
	 */
	public void setCostVolCd(String costVolCd) {
		this.costVolCd = costVolCd;
	}
	
	/**
	 * Column Info
	 * @param costSrcSysCd
	 */
	public void setCostSrcSysCd(String costSrcSysCd) {
		this.costSrcSysCd = costSrcSysCd;
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
	 * @param costSrcMon
	 */
	public void setCostSrcMon(String costSrcMon) {
		this.costSrcMon = costSrcMon;
	}
	
	/**
	 * Column Info
	 * @param costVolCd1
	 */
	public void setCostVolCd1(String costVolCd1) {
		this.costVolCd1 = costVolCd1;
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
	 * @param spclCgoDgFlg
	 */
	public void setSpclCgoDgFlg(String spclCgoDgFlg) {
		this.spclCgoDgFlg = spclCgoDgFlg;
	}
	
	/**
	 * Column Info
	 * @param spclCgoRfFlg
	 */
	public void setSpclCgoRfFlg(String spclCgoRfFlg) {
		this.spclCgoRfFlg = spclCgoRfFlg;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
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
	 * @param bkgFullSocCgoFlg
	 */
	public void setBkgFullSocCgoFlg(String bkgFullSocCgoFlg) {
		this.bkgFullSocCgoFlg = bkgFullSocCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param costAssBseCd
	 */
	public void setCostAssBseCd(String costAssBseCd) {
		this.costAssBseCd = costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @param bkgMcgoFlg
	 */
	public void setBkgMcgoFlg(String bkgMcgoFlg) {
		this.bkgMcgoFlg = bkgMcgoFlg;
	}
	
	/**
	 * Column Info
	 * @param coaCostSrcPrtCd
	 */
	public void setCoaCostSrcPrtCd(String coaCostSrcPrtCd) {
		this.coaCostSrcPrtCd = coaCostSrcPrtCd;
	}
	
	/**
	 * Column Info
	 * @param costUtAmtCd
	 */
	public void setCostUtAmtCd(String costUtAmtCd) {
		this.costUtAmtCd = costUtAmtCd;
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
	 * @param bkgRevMcgoFlg
	 */
	public void setBkgRevMcgoFlg(String bkgRevMcgoFlg) {
		this.bkgRevMcgoFlg = bkgRevMcgoFlg;
	}
	
	/**
	 * Column Info
	 * @param spclCgoBbFlg
	 */
	public void setSpclCgoBbFlg(String spclCgoBbFlg) {
		this.spclCgoBbFlg = spclCgoBbFlg;
	}
	
	/**
	 * Column Info
	 * @param raSgrpCostCd
	 */
	public void setRaSgrpCostCd(String raSgrpCostCd) {
		this.raSgrpCostCd = raSgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param bkgFullOwnCgoFlg
	 */
	public void setBkgFullOwnCgoFlg(String bkgFullOwnCgoFlg) {
		this.bkgFullOwnCgoFlg = bkgFullOwnCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param raCostTpCd
	 */
	public void setRaCostTpCd(String raCostTpCd) {
		this.raCostTpCd = raCostTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCoaCostSrcCdNm(JSPUtil.getParameter(request, "coa_cost_src_cd_nm", ""));
		setSpclCgoAwkFlg(JSPUtil.getParameter(request, "spcl_cgo_awk_flg", ""));
		setSpclCgoOtrFlg(JSPUtil.getParameter(request, "spcl_cgo_otr_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSgrpCostCd(JSPUtil.getParameter(request, "sgrp_cost_cd", ""));
		setCostVolCd(JSPUtil.getParameter(request, "cost_vol_cd", ""));
		setCostSrcSysCd(JSPUtil.getParameter(request, "cost_src_sys_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCostSrcMon(JSPUtil.getParameter(request, "cost_src_mon", ""));
		setCostVolCd1(JSPUtil.getParameter(request, "cost_vol_cd1", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSpclCgoDgFlg(JSPUtil.getParameter(request, "spcl_cgo_dg_flg", ""));
		setSpclCgoRfFlg(JSPUtil.getParameter(request, "spcl_cgo_rf_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBkgFullSocCgoFlg(JSPUtil.getParameter(request, "bkg_full_soc_cgo_flg", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setBkgMcgoFlg(JSPUtil.getParameter(request, "bkg_mcgo_flg", ""));
		setCoaCostSrcPrtCd(JSPUtil.getParameter(request, "coa_cost_src_prt_cd", ""));
		setCostUtAmtCd(JSPUtil.getParameter(request, "cost_ut_amt_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgRevMcgoFlg(JSPUtil.getParameter(request, "bkg_rev_mcgo_flg", ""));
		setSpclCgoBbFlg(JSPUtil.getParameter(request, "spcl_cgo_bb_flg", ""));
		setRaSgrpCostCd(JSPUtil.getParameter(request, "ra_sgrp_cost_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setBkgFullOwnCgoFlg(JSPUtil.getParameter(request, "bkg_full_own_cgo_flg", ""));
		setRaCostTpCd(JSPUtil.getParameter(request, "ra_cost_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCostSrcAcctVO[]
	 */
	public CoaCostSrcAcctVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCostSrcAcctVO[]
	 */
	public CoaCostSrcAcctVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCostSrcAcctVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] coaCostSrcCdNm = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd_nm", length));
			String[] spclCgoAwkFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_awk_flg", length));
			String[] spclCgoOtrFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_otr_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "sgrp_cost_cd", length));
			String[] costVolCd = (JSPUtil.getParameter(request, prefix	+ "cost_vol_cd", length));
			String[] costSrcSysCd = (JSPUtil.getParameter(request, prefix	+ "cost_src_sys_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] costSrcMon = (JSPUtil.getParameter(request, prefix	+ "cost_src_mon", length));
			String[] costVolCd1 = (JSPUtil.getParameter(request, prefix	+ "cost_vol_cd1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] spclCgoDgFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_dg_flg", length));
			String[] spclCgoRfFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_rf_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bkgFullSocCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_full_soc_cgo_flg", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] bkgMcgoFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_mcgo_flg", length));
			String[] coaCostSrcPrtCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_prt_cd", length));
			String[] costUtAmtCd = (JSPUtil.getParameter(request, prefix	+ "cost_ut_amt_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgRevMcgoFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_rev_mcgo_flg", length));
			String[] spclCgoBbFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_bb_flg", length));
			String[] raSgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "ra_sgrp_cost_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] bkgFullOwnCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_full_own_cgo_flg", length));
			String[] raCostTpCd = (JSPUtil.getParameter(request, prefix	+ "ra_cost_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCostSrcAcctVO();
				if (coaCostSrcCdNm[i] != null)
					model.setCoaCostSrcCdNm(coaCostSrcCdNm[i]);
				if (spclCgoAwkFlg[i] != null)
					model.setSpclCgoAwkFlg(spclCgoAwkFlg[i]);
				if (spclCgoOtrFlg[i] != null)
					model.setSpclCgoOtrFlg(spclCgoOtrFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sgrpCostCd[i] != null)
					model.setSgrpCostCd(sgrpCostCd[i]);
				if (costVolCd[i] != null)
					model.setCostVolCd(costVolCd[i]);
				if (costSrcSysCd[i] != null)
					model.setCostSrcSysCd(costSrcSysCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (costSrcMon[i] != null)
					model.setCostSrcMon(costSrcMon[i]);
				if (costVolCd1[i] != null)
					model.setCostVolCd1(costVolCd1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (spclCgoDgFlg[i] != null)
					model.setSpclCgoDgFlg(spclCgoDgFlg[i]);
				if (spclCgoRfFlg[i] != null)
					model.setSpclCgoRfFlg(spclCgoRfFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bkgFullSocCgoFlg[i] != null)
					model.setBkgFullSocCgoFlg(bkgFullSocCgoFlg[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (bkgMcgoFlg[i] != null)
					model.setBkgMcgoFlg(bkgMcgoFlg[i]);
				if (coaCostSrcPrtCd[i] != null)
					model.setCoaCostSrcPrtCd(coaCostSrcPrtCd[i]);
				if (costUtAmtCd[i] != null)
					model.setCostUtAmtCd(costUtAmtCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgRevMcgoFlg[i] != null)
					model.setBkgRevMcgoFlg(bkgRevMcgoFlg[i]);
				if (spclCgoBbFlg[i] != null)
					model.setSpclCgoBbFlg(spclCgoBbFlg[i]);
				if (raSgrpCostCd[i] != null)
					model.setRaSgrpCostCd(raSgrpCostCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (bkgFullOwnCgoFlg[i] != null)
					model.setBkgFullOwnCgoFlg(bkgFullOwnCgoFlg[i]);
				if (raCostTpCd[i] != null)
					model.setRaCostTpCd(raCostTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCostSrcAcctVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCostSrcAcctVO[]
	 */
	public CoaCostSrcAcctVO[] getCoaCostSrcAcctVOs(){
		CoaCostSrcAcctVO[] vos = (CoaCostSrcAcctVO[])models.toArray(new CoaCostSrcAcctVO[models.size()]);
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
		this.coaCostSrcCdNm = this.coaCostSrcCdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAwkFlg = this.spclCgoAwkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoOtrFlg = this.spclCgoOtrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpCostCd = this.sgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costVolCd = this.costVolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costSrcSysCd = this.costSrcSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costSrcMon = this.costSrcMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costVolCd1 = this.costVolCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoDgFlg = this.spclCgoDgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoRfFlg = this.spclCgoRfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgFullSocCgoFlg = this.bkgFullSocCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMcgoFlg = this.bkgMcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcPrtCd = this.coaCostSrcPrtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costUtAmtCd = this.costUtAmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRevMcgoFlg = this.bkgRevMcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoBbFlg = this.spclCgoBbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raSgrpCostCd = this.raSgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgFullOwnCgoFlg = this.bkgFullOwnCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCostTpCd = this.raCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
