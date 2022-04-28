/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaNodAvgStndCostVO.java
*@FileTitle : CoaNodAvgStndCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.31
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.07.31 임옥영 
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

public class CoaNodAvgStndCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaNodAvgStndCostVO> models = new ArrayList<CoaNodAvgStndCostVO>();
	
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String nodTtlAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String costVolCd = null;
	/* Column Info */
	private String costFxFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String loclRtAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String bizRuleFlg = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String toEffDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String usdRtAmt = null;
	/* Column Info */
	private String nodTtlQty = null;
	/* Column Info */
	private String nodCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String costLocGrpCd = null;
	/* Column Info */
	private String stndCostUsdAmt = null;
	/* Column Info */
	private String costCalcRmk = null;
	/* coa_cost_src_cd_v */
	private String coaCostSrcCdV = null;
	/* stnd_cost_cd */
	private String stndCostCd = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaNodAvgStndCostVO() {}

	public CoaNodAvgStndCostVO(String ibflag, String pagerows, String costYrmon, String fullMtyCd, String cntrTpszCd, String costLocGrpCd, String nodCd, String coaCostSrcCd, String trdCd, String loclCurrCd, String stndCostUsdAmt, String loclRtAmt, String slanCd, String skdDirCd, String usdRtAmt, String costAssBseCd, String bizRuleFlg, String fmEffDt, String toEffDt, String nodTtlQty, String nodTtlAmt, String costVolCd, String costCalcRmk, String costFxFlg, String creUsrId, String creDt, String updUsrId, String updDt, String coaCostSrcCdV, String stndCostCd) {
		this.coaCostSrcCd = coaCostSrcCd;
		this.nodTtlAmt = nodTtlAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.costVolCd = costVolCd;
		this.costFxFlg = costFxFlg;
		this.pagerows = pagerows;
		this.loclRtAmt = loclRtAmt;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.bizRuleFlg = bizRuleFlg;
		this.cntrTpszCd = cntrTpszCd;
		this.fmEffDt = fmEffDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.loclCurrCd = loclCurrCd;
		this.toEffDt = toEffDt;
		this.skdDirCd = skdDirCd;
		this.creUsrId = creUsrId;
		this.slanCd = slanCd;
		this.usdRtAmt = usdRtAmt;
		this.nodTtlQty = nodTtlQty;
		this.nodCd = nodCd;
		this.fullMtyCd = fullMtyCd;
		this.costLocGrpCd = costLocGrpCd;
		this.stndCostUsdAmt = stndCostUsdAmt;
		this.costCalcRmk = costCalcRmk;
		this.coaCostSrcCdV = coaCostSrcCdV;
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("nod_ttl_amt", getNodTtlAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("cost_vol_cd", getCostVolCd());
		this.hashColumns.put("cost_fx_flg", getCostFxFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("locl_rt_amt", getLoclRtAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("biz_rule_flg", getBizRuleFlg());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("usd_rt_amt", getUsdRtAmt());
		this.hashColumns.put("nod_ttl_qty", getNodTtlQty());
		this.hashColumns.put("nod_cd", getNodCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("cost_loc_grp_cd", getCostLocGrpCd());
		this.hashColumns.put("stnd_cost_usd_amt", getStndCostUsdAmt());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
		this.hashColumns.put("coa_cost_src_cd_v", getCoaCostSrcCdV());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("nod_ttl_amt", "nodTtlAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("cost_vol_cd", "costVolCd");
		this.hashFields.put("cost_fx_flg", "costFxFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("locl_rt_amt", "loclRtAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("biz_rule_flg", "bizRuleFlg");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("usd_rt_amt", "usdRtAmt");
		this.hashFields.put("nod_ttl_qty", "nodTtlQty");
		this.hashFields.put("nod_cd", "nodCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("cost_loc_grp_cd", "costLocGrpCd");
		this.hashFields.put("stnd_cost_usd_amt", "stndCostUsdAmt");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
		this.hashFields.put("coa_cost_src_cd_v", "coaCostSrcCdV");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		
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
	 * @return nodTtlAmt
	 */
	public String getNodTtlAmt() {
		return this.nodTtlAmt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return loclRtAmt
	 */
	public String getLoclRtAmt() {
		return this.loclRtAmt;
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
	 * @return bizRuleFlg
	 */
	public String getBizRuleFlg() {
		return this.bizRuleFlg;
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
	 * @return loclCurrCd
	 */
	public String getLoclCurrCd() {
		return this.loclCurrCd;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return usdRtAmt
	 */
	public String getUsdRtAmt() {
		return this.usdRtAmt;
	}
	
	/**
	 * Column Info
	 * @return nodTtlQty
	 */
	public String getNodTtlQty() {
		return this.nodTtlQty;
	}
	
	/**
	 * Column Info
	 * @return nodCd
	 */
	public String getNodCd() {
		return this.nodCd;
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
	 * @return costLocGrpCd
	 */
	public String getCostLocGrpCd() {
		return this.costLocGrpCd;
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
	 * @param nodTtlAmt
	 */
	public void setNodTtlAmt(String nodTtlAmt) {
		this.nodTtlAmt = nodTtlAmt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param loclRtAmt
	 */
	public void setLoclRtAmt(String loclRtAmt) {
		this.loclRtAmt = loclRtAmt;
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
	 * @param bizRuleFlg
	 */
	public void setBizRuleFlg(String bizRuleFlg) {
		this.bizRuleFlg = bizRuleFlg;
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
	 * @param loclCurrCd
	 */
	public void setLoclCurrCd(String loclCurrCd) {
		this.loclCurrCd = loclCurrCd;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param usdRtAmt
	 */
	public void setUsdRtAmt(String usdRtAmt) {
		this.usdRtAmt = usdRtAmt;
	}
	
	/**
	 * Column Info
	 * @param nodTtlQty
	 */
	public void setNodTtlQty(String nodTtlQty) {
		this.nodTtlQty = nodTtlQty;
	}
	
	/**
	 * Column Info
	 * @param nodCd
	 */
	public void setNodCd(String nodCd) {
		this.nodCd = nodCd;
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
	 * @param costLocGrpCd
	 */
	public void setCostLocGrpCd(String costLocGrpCd) {
		this.costLocGrpCd = costLocGrpCd;
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
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setNodTtlAmt(JSPUtil.getParameter(request, "nod_ttl_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setCostVolCd(JSPUtil.getParameter(request, "cost_vol_cd", ""));
		setCostFxFlg(JSPUtil.getParameter(request, "cost_fx_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLoclRtAmt(JSPUtil.getParameter(request, "locl_rt_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setBizRuleFlg(JSPUtil.getParameter(request, "biz_rule_flg", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setFmEffDt(JSPUtil.getParameter(request, "fm_eff_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setToEffDt(JSPUtil.getParameter(request, "to_eff_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setUsdRtAmt(JSPUtil.getParameter(request, "usd_rt_amt", ""));
		setNodTtlQty(JSPUtil.getParameter(request, "nod_ttl_qty", ""));
		setNodCd(JSPUtil.getParameter(request, "nod_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setCostLocGrpCd(JSPUtil.getParameter(request, "cost_loc_grp_cd", ""));
		setStndCostUsdAmt(JSPUtil.getParameter(request, "stnd_cost_usd_amt", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
		setCoaCostSrcCdV(JSPUtil.getParameter(request, "coa_cost_src_cd_v", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));

	}


	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaNodAvgStndCostVO[]
	 */
	public CoaNodAvgStndCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaNodAvgStndCostVO[]
	 */
	public CoaNodAvgStndCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaNodAvgStndCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] nodTtlAmt = (JSPUtil.getParameter(request, prefix	+ "nod_ttl_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] costVolCd = (JSPUtil.getParameter(request, prefix	+ "cost_vol_cd", length));
			String[] costFxFlg = (JSPUtil.getParameter(request, prefix	+ "cost_fx_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] loclRtAmt = (JSPUtil.getParameter(request, prefix	+ "locl_rt_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] bizRuleFlg = (JSPUtil.getParameter(request, prefix	+ "biz_rule_flg", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] usdRtAmt = (JSPUtil.getParameter(request, prefix	+ "usd_rt_amt", length));
			String[] nodTtlQty = (JSPUtil.getParameter(request, prefix	+ "nod_ttl_qty", length));
			String[] nodCd = (JSPUtil.getParameter(request, prefix	+ "nod_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] costLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_loc_grp_cd", length));
			String[] stndCostUsdAmt = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_usd_amt", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			String[] coaCostSrcCdV = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd_v", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaNodAvgStndCostVO();
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (nodTtlAmt[i] != null)
					model.setNodTtlAmt(nodTtlAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (costVolCd[i] != null)
					model.setCostVolCd(costVolCd[i]);
				if (costFxFlg[i] != null)
					model.setCostFxFlg(costFxFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (loclRtAmt[i] != null)
					model.setLoclRtAmt(loclRtAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (bizRuleFlg[i] != null)
					model.setBizRuleFlg(bizRuleFlg[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (usdRtAmt[i] != null)
					model.setUsdRtAmt(usdRtAmt[i]);
				if (nodTtlQty[i] != null)
					model.setNodTtlQty(nodTtlQty[i]);
				if (nodCd[i] != null)
					model.setNodCd(nodCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (costLocGrpCd[i] != null)
					model.setCostLocGrpCd(costLocGrpCd[i]);
				if (stndCostUsdAmt[i] != null)
					model.setStndCostUsdAmt(stndCostUsdAmt[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				if (coaCostSrcCdV[i] != null)
					model.setCoaCostSrcCdV(coaCostSrcCdV[i]);		
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaNodAvgStndCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaNodAvgStndCostVO[]
	 */
	public CoaNodAvgStndCostVO[] getCoaNodAvgStndCostVOs(){
		CoaNodAvgStndCostVO[] vos = (CoaNodAvgStndCostVO[])models.toArray(new CoaNodAvgStndCostVO[models.size()]);
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
		this.nodTtlAmt = this.nodTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costVolCd = this.costVolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costFxFlg = this.costFxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclRtAmt = this.loclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizRuleFlg = this.bizRuleFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdRtAmt = this.usdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodTtlQty = this.nodTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodCd = this.nodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costLocGrpCd = this.costLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostUsdAmt = this.stndCostUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCdV = this.coaCostSrcCdV .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
