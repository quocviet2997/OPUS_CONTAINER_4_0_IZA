/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaLnkAvgStndCostVO.java
*@FileTitle : CoaLnkAvgStndCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
* 1.0 Creation
* HISTORY
* 2009.09.25 임옥영 UI 개발을 위해 coaCostSrcCdV, stndCostCd, mtyUcAmt 추가
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

public class CoaLnkAvgStndCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaLnkAvgStndCostVO> models = new ArrayList<CoaLnkAvgStndCostVO>();
	
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String costVolCd = null;
	/* Column Info */
	private String costFxFlg = null;
	/* Column Info */
	private String lnkFmNodCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String lnkTtlAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String lnkToNodCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String lnkLoclRtAmt = null;
	/* Column Info */
	private String toEffDt = null;
	/* Column Info */
	private String lnkUsdRtAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String routTzModCd = null;
	/* Column Info */
	private String costLocGrpCd = null;
	/* Column Info */
	private String lnkTtlQty = null;
	/* Column Info */
	private String stndCostUsdAmt = null;
	/* Column Info */
	private String costCalcRmk = null;
	/* coa_cost_src_cd_v */
	private String coaCostSrcCdV = null;
	/* stnd_cost_cd */
	private String stndCostCd = null;
	/* mty_uc_amt */
	private String mtyUcAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaLnkAvgStndCostVO() {}

	public CoaLnkAvgStndCostVO(String ibflag, String pagerows, String costYrmon, String lnkFmNodCd, String lnkToNodCd, String coCd, String cntrTpszCd, String fullMtyCd, String coaCostSrcCd, String costLocGrpCd, String loclCurrCd, String stndCostUsdAmt, String lnkLoclRtAmt, String lnkUsdRtAmt, String costAssBseCd, String routTzModCd, String fmEffDt, String toEffDt, String lnkTtlQty, String lnkTtlAmt, String costVolCd, String costCalcRmk, String costFxFlg, String creUsrId, String creDt, String updUsrId, String updDt, String coaCostSrcCdV, String stndCostCd, String mtyUcAmt) {
		this.coaCostSrcCd = coaCostSrcCd;
		this.creDt = creDt;
		this.costVolCd = costVolCd;
		this.costFxFlg = costFxFlg;
		this.lnkFmNodCd = lnkFmNodCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.lnkTtlAmt = lnkTtlAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.fmEffDt = fmEffDt;
		this.updUsrId = updUsrId;
		this.lnkToNodCd = lnkToNodCd;
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.coCd = coCd;
		this.loclCurrCd = loclCurrCd;
		this.lnkLoclRtAmt = lnkLoclRtAmt;
		this.toEffDt = toEffDt;
		this.lnkUsdRtAmt = lnkUsdRtAmt;
		this.creUsrId = creUsrId;
		this.fullMtyCd = fullMtyCd;
		this.routTzModCd = routTzModCd;
		this.costLocGrpCd = costLocGrpCd;
		this.lnkTtlQty = lnkTtlQty;
		this.stndCostUsdAmt = stndCostUsdAmt;
		this.costCalcRmk = costCalcRmk;
		this.coaCostSrcCdV = coaCostSrcCdV;
		this.stndCostCd = stndCostCd;
		this.mtyUcAmt = mtyUcAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cost_vol_cd", getCostVolCd());
		this.hashColumns.put("cost_fx_flg", getCostFxFlg());
		this.hashColumns.put("lnk_fm_nod_cd", getLnkFmNodCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("lnk_ttl_amt", getLnkTtlAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("lnk_to_nod_cd", getLnkToNodCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("lnk_locl_rt_amt", getLnkLoclRtAmt());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("lnk_usd_rt_amt", getLnkUsdRtAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("rout_tz_mod_cd", getRoutTzModCd());
		this.hashColumns.put("cost_loc_grp_cd", getCostLocGrpCd());
		this.hashColumns.put("lnk_ttl_qty", getLnkTtlQty());
		this.hashColumns.put("stnd_cost_usd_amt", getStndCostUsdAmt());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
		this.hashColumns.put("coa_cost_src_cd_v", getCoaCostSrcCdV());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("mty_uc_amt", getMtyUcAmt());
		
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cost_vol_cd", "costVolCd");
		this.hashFields.put("cost_fx_flg", "costFxFlg");
		this.hashFields.put("lnk_fm_nod_cd", "lnkFmNodCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("lnk_ttl_amt", "lnkTtlAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("lnk_to_nod_cd", "lnkToNodCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("lnk_locl_rt_amt", "lnkLoclRtAmt");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("lnk_usd_rt_amt", "lnkUsdRtAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("rout_tz_mod_cd", "routTzModCd");
		this.hashFields.put("cost_loc_grp_cd", "costLocGrpCd");
		this.hashFields.put("lnk_ttl_qty", "lnkTtlQty");
		this.hashFields.put("stnd_cost_usd_amt", "stndCostUsdAmt");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
		this.hashFields.put("coa_cost_src_cd_v", "coaCostSrcCdV");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("mty_uc_amt", "mtyUcAmt");

		return this.hashFields;
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
	 * @return costVolCd
	 */
	public String getCostVolCd() {
		return this.costVolCd;
	}
	
	/**
	 * Column Info
	 * @return costFxFlg
	 */
	public String getCostFxFlg() {
		return this.costFxFlg;
	}
	
	/**
	 * Column Info
	 * @return lnkFmNodCd
	 */
	public String getLnkFmNodCd() {
		return this.lnkFmNodCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return lnkTtlAmt
	 */
	public String getLnkTtlAmt() {
		return this.lnkTtlAmt;
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
	 * @return fmEffDt
	 */
	public String getFmEffDt() {
		return this.fmEffDt;
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
	 * @return lnkToNodCd
	 */
	public String getLnkToNodCd() {
		return this.lnkToNodCd;
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
	 * @return costAssBseCd
	 */
	public String getCostAssBseCd() {
		return this.costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return loclCurrCd
	 */
	public String getLoclCurrCd() {
		return this.loclCurrCd;
	}
	
	/**
	 * Column Info
	 * @return lnkLoclRtAmt
	 */
	public String getLnkLoclRtAmt() {
		return this.lnkLoclRtAmt;
	}
	
	/**
	 * Column Info
	 * @return toEffDt
	 */
	public String getToEffDt() {
		return this.toEffDt;
	}
	
	/**
	 * Column Info
	 * @return lnkUsdRtAmt
	 */
	public String getLnkUsdRtAmt() {
		return this.lnkUsdRtAmt;
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
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return routTzModCd
	 */
	public String getRoutTzModCd() {
		return this.routTzModCd;
	}
	
	/**
	 * Column Info
	 * @return costLocGrpCd
	 */
	public String getCostLocGrpCd() {
		return this.costLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @return lnkTtlQty
	 */
	public String getLnkTtlQty() {
		return this.lnkTtlQty;
	}
	
	/**
	 * Column Info
	 * @return stndCostUsdAmt
	 */
	public String getStndCostUsdAmt() {
		return this.stndCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return costCalcRmk
	 */
	public String getCostCalcRmk() {
		return this.costCalcRmk;
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
	 * @param costVolCd
	 */
	public void setCostVolCd(String costVolCd) {
		this.costVolCd = costVolCd;
	}
	
	/**
	 * Column Info
	 * @param costFxFlg
	 */
	public void setCostFxFlg(String costFxFlg) {
		this.costFxFlg = costFxFlg;
	}
	
	/**
	 * Column Info
	 * @param lnkFmNodCd
	 */
	public void setLnkFmNodCd(String lnkFmNodCd) {
		this.lnkFmNodCd = lnkFmNodCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param lnkTtlAmt
	 */
	public void setLnkTtlAmt(String lnkTtlAmt) {
		this.lnkTtlAmt = lnkTtlAmt;
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
	 * @param fmEffDt
	 */
	public void setFmEffDt(String fmEffDt) {
		this.fmEffDt = fmEffDt;
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
	 * @param lnkToNodCd
	 */
	public void setLnkToNodCd(String lnkToNodCd) {
		this.lnkToNodCd = lnkToNodCd;
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
	 * @param costAssBseCd
	 */
	public void setCostAssBseCd(String costAssBseCd) {
		this.costAssBseCd = costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param loclCurrCd
	 */
	public void setLoclCurrCd(String loclCurrCd) {
		this.loclCurrCd = loclCurrCd;
	}
	
	/**
	 * Column Info
	 * @param lnkLoclRtAmt
	 */
	public void setLnkLoclRtAmt(String lnkLoclRtAmt) {
		this.lnkLoclRtAmt = lnkLoclRtAmt;
	}
	
	/**
	 * Column Info
	 * @param toEffDt
	 */
	public void setToEffDt(String toEffDt) {
		this.toEffDt = toEffDt;
	}
	
	/**
	 * Column Info
	 * @param lnkUsdRtAmt
	 */
	public void setLnkUsdRtAmt(String lnkUsdRtAmt) {
		this.lnkUsdRtAmt = lnkUsdRtAmt;
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
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param routTzModCd
	 */
	public void setRoutTzModCd(String routTzModCd) {
		this.routTzModCd = routTzModCd;
	}
	
	/**
	 * Column Info
	 * @param costLocGrpCd
	 */
	public void setCostLocGrpCd(String costLocGrpCd) {
		this.costLocGrpCd = costLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @param lnkTtlQty
	 */
	public void setLnkTtlQty(String lnkTtlQty) {
		this.lnkTtlQty = lnkTtlQty;
	}
	
	/**
	 * Column Info
	 * @param stndCostUsdAmt
	 */
	public void setStndCostUsdAmt(String stndCostUsdAmt) {
		this.stndCostUsdAmt = stndCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param costCalcRmk
	 */
	public void setCostCalcRmk(String costCalcRmk) {
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCdV
	 */
	public String getCoaCostSrcCdV() {
		return coaCostSrcCdV;
	}
	/**
	 * Column Info
	 * @param coaCostSrcCdV
	 */
	public void setCoaCostSrcCdV(String coaCostSrcCdV) {
		this.coaCostSrcCdV = coaCostSrcCdV;
	}
	/**
	 * Column Info
	 * @return coaCostSrcCdV
	 */
	public String getStndCostCd() {
		return stndCostCd;
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
	 * @return mtyUcAmt
	 */
	public String getMtyUcAmt() {
		return mtyUcAmt;
	}
	/**
	 * Column Info
	 * @param mtyUcAmt
	 */
	public void setMtyUcAmt(String mtyUcAmt) {
		this.mtyUcAmt = mtyUcAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCostVolCd(JSPUtil.getParameter(request, "cost_vol_cd", ""));
		setCostFxFlg(JSPUtil.getParameter(request, "cost_fx_flg", ""));
		setLnkFmNodCd(JSPUtil.getParameter(request, "lnk_fm_nod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setLnkTtlAmt(JSPUtil.getParameter(request, "lnk_ttl_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setFmEffDt(JSPUtil.getParameter(request, "fm_eff_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setLnkToNodCd(JSPUtil.getParameter(request, "lnk_to_nod_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setLnkLoclRtAmt(JSPUtil.getParameter(request, "lnk_locl_rt_amt", ""));
		setToEffDt(JSPUtil.getParameter(request, "to_eff_dt", ""));
		setLnkUsdRtAmt(JSPUtil.getParameter(request, "lnk_usd_rt_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setRoutTzModCd(JSPUtil.getParameter(request, "rout_tz_mod_cd", ""));
		setCostLocGrpCd(JSPUtil.getParameter(request, "cost_loc_grp_cd", ""));
		setLnkTtlQty(JSPUtil.getParameter(request, "lnk_ttl_qty", ""));
		setStndCostUsdAmt(JSPUtil.getParameter(request, "stnd_cost_usd_amt", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
		setCoaCostSrcCdV(JSPUtil.getParameter(request, "coa_cost_src_cd_v", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setCoaCostSrcCdV(JSPUtil.getParameter(request, "coa_cost_src_cd_v", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setMtyUcAmt(JSPUtil.getParameter(request, "mty_uc_amt", "")); //mty_uc_amt, mtyUcAmt, getMtyUcAmt, setMtyUcAmt
	}



	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaLnkAvgStndCostVO[]
	 */
	public CoaLnkAvgStndCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaLnkAvgStndCostVO[]
	 */
	public CoaLnkAvgStndCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaLnkAvgStndCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] costVolCd = (JSPUtil.getParameter(request, prefix	+ "cost_vol_cd", length));
			String[] costFxFlg = (JSPUtil.getParameter(request, prefix	+ "cost_fx_flg", length));
			String[] lnkFmNodCd = (JSPUtil.getParameter(request, prefix	+ "lnk_fm_nod_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] lnkTtlAmt = (JSPUtil.getParameter(request, prefix	+ "lnk_ttl_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] lnkToNodCd = (JSPUtil.getParameter(request, prefix	+ "lnk_to_nod_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] lnkLoclRtAmt = (JSPUtil.getParameter(request, prefix	+ "lnk_locl_rt_amt", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] lnkUsdRtAmt = (JSPUtil.getParameter(request, prefix	+ "lnk_usd_rt_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] routTzModCd = (JSPUtil.getParameter(request, prefix	+ "rout_tz_mod_cd", length));
			String[] costLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_loc_grp_cd", length));
			String[] lnkTtlQty = (JSPUtil.getParameter(request, prefix	+ "lnk_ttl_qty", length));
			String[] stndCostUsdAmt = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_usd_amt", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			String[] coaCostSrcCdV = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd_v", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] mtyUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_uc_amt", length)); //mty_uc_amt, mtyUcAmt, getMtyUcAmt, setMtyUcAmt
			
			for (int i = 0; i < length; i++) {
				model = new CoaLnkAvgStndCostVO();
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (costVolCd[i] != null)
					model.setCostVolCd(costVolCd[i]);
				if (costFxFlg[i] != null)
					model.setCostFxFlg(costFxFlg[i]);
				if (lnkFmNodCd[i] != null)
					model.setLnkFmNodCd(lnkFmNodCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (lnkTtlAmt[i] != null)
					model.setLnkTtlAmt(lnkTtlAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (lnkToNodCd[i] != null)
					model.setLnkToNodCd(lnkToNodCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (lnkLoclRtAmt[i] != null)
					model.setLnkLoclRtAmt(lnkLoclRtAmt[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (lnkUsdRtAmt[i] != null)
					model.setLnkUsdRtAmt(lnkUsdRtAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (routTzModCd[i] != null)
					model.setRoutTzModCd(routTzModCd[i]);
				if (costLocGrpCd[i] != null)
					model.setCostLocGrpCd(costLocGrpCd[i]);
				if (lnkTtlQty[i] != null)
					model.setLnkTtlQty(lnkTtlQty[i]);
				if (stndCostUsdAmt[i] != null)
					model.setStndCostUsdAmt(stndCostUsdAmt[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				if (coaCostSrcCdV[i] != null)
					model.setCoaCostSrcCdV(coaCostSrcCdV[i]);		
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (mtyUcAmt[i] != null)
					model.setMtyUcAmt(mtyUcAmt[i]);//mty_uc_amt, mtyUcAmt, getMtyUcAmt, setMtyUcAmt
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaLnkAvgStndCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaLnkAvgStndCostVO[]
	 */
	public CoaLnkAvgStndCostVO[] getCoaLnkAvgStndCostVOs(){
		CoaLnkAvgStndCostVO[] vos = (CoaLnkAvgStndCostVO[])models.toArray(new CoaLnkAvgStndCostVO[models.size()]);
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
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costVolCd = this.costVolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costFxFlg = this.costFxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkFmNodCd = this.lnkFmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkTtlAmt = this.lnkTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkToNodCd = this.lnkToNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkLoclRtAmt = this.lnkLoclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkUsdRtAmt = this.lnkUsdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routTzModCd = this.routTzModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costLocGrpCd = this.costLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lnkTtlQty = this.lnkTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostUsdAmt = this.stndCostUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCdV = this.coaCostSrcCdV .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyUcAmt = this.mtyUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");//mty_uc_amt, mtyUcAmt, getMtyUcAmt, setMtyUcAmt
	}
}
