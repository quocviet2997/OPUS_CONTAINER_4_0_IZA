/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgCostSmryVO.java
*@FileTitle : CoaBkgCostSmryVO
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

public class CoaBkgCostSmryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgCostSmryVO> models = new ArrayList<CoaBkgCostSmryVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String costRoutNo = null;
	/* Column Info */
	private String pastEstmPlAmt = null;
	/* Column Info */
	private String raAcctCd = null;
	/* Column Info */
	private String estmUsdUcAmt = null;
	/* Column Info */
	private String respbUsdUcAmt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String pastFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String spclDgCgoFlg = null;
	/* Column Info */
	private String costCondCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pastVslCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String acclRtAmt = null;
	/* Column Info */
	private String pastAcclRtAmt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String spclBbCgoFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String estmUcAmt = null;
	/* Column Info */
	private String estmUsdTtlAmt = null;
	/* Column Info */
	private String fcgoTzHrs = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String mcgoTzDys = null;
	/* Column Info */
	private String spclRcFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sgrpCostCd = null;
	/* Column Info */
	private String rdFlg = null;
	/* Column Info */
	private String respbUsdTtlAmt = null;
	/* Column Info */
	private String pastSkdDirCd = null;
	/* Column Info */
	private String pastSkdVoyNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pastRlaneCd = null;
	/* Column Info */
	private String raUcAmt = null;
	/* Column Info */
	private String mcgoTzHrs = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String pastRaPlAmt = null;
	/* Column Info */
	private String pastActPlAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String raDiffAmt = null;
	/* Column Info */
	private String actUcAmt = null;
	/* Column Info */
	private String actDiffAmt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String acclDiffAmt = null;
	/* Column Info */
	private String pastIocCd = null;
	/* Column Info */
	private String fcgoTzDys = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String estmDiffAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgCostSmryVO() {}

	public CoaBkgCostSmryVO(String ibflag, String pagerows, String bkgNo, String stndCostCd, String costRoutNo, String cntrTpszCd, String sgrpCostCd, String cntrQty, String raAcctCd, String estmUcAmt, String raUcAmt, String actUcAmt, String pastFlg, String acclRtAmt, String rlaneCd, String iocCd, String vslCd, String skdVoyNo, String skdDirCd, String costCondCd, String estmDiffAmt, String raDiffAmt, String actDiffAmt, String acclDiffAmt, String pastRlaneCd, String pastVslCd, String pastIocCd, String pastSkdVoyNo, String pastSkdDirCd, String pastEstmPlAmt, String pastRaPlAmt, String pastActPlAmt, String pastAcclRtAmt, String spclRcFlg, String spclDgCgoFlg, String spclBbCgoFlg, String spclAwkCgoFlg, String rdFlg, String socFlg, String estmUsdTtlAmt, String respbUsdTtlAmt, String estmUsdUcAmt, String respbUsdUcAmt, String deltFlg, String fcgoTzDys, String fcgoTzHrs, String mcgoTzDys, String mcgoTzHrs, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.costRoutNo = costRoutNo;
		this.pastEstmPlAmt = pastEstmPlAmt;
		this.raAcctCd = raAcctCd;
		this.estmUsdUcAmt = estmUsdUcAmt;
		this.respbUsdUcAmt = respbUsdUcAmt;
		this.rlaneCd = rlaneCd;
		this.pastFlg = pastFlg;
		this.pagerows = pagerows;
		this.cntrTpszCd = cntrTpszCd;
		this.spclDgCgoFlg = spclDgCgoFlg;
		this.costCondCd = costCondCd;
		this.updUsrId = updUsrId;
		this.pastVslCd = pastVslCd;
		this.skdVoyNo = skdVoyNo;
		this.acclRtAmt = acclRtAmt;
		this.pastAcclRtAmt = pastAcclRtAmt;
		this.bkgNo = bkgNo;
		this.spclBbCgoFlg = spclBbCgoFlg;
		this.creUsrId = creUsrId;
		this.estmUcAmt = estmUcAmt;
		this.estmUsdTtlAmt = estmUsdTtlAmt;
		this.fcgoTzHrs = fcgoTzHrs;
		this.deltFlg = deltFlg;
		this.mcgoTzDys = mcgoTzDys;
		this.spclRcFlg = spclRcFlg;
		this.creDt = creDt;
		this.sgrpCostCd = sgrpCostCd;
		this.rdFlg = rdFlg;
		this.respbUsdTtlAmt = respbUsdTtlAmt;
		this.pastSkdDirCd = pastSkdDirCd;
		this.pastSkdVoyNo = pastSkdVoyNo;
		this.ibflag = ibflag;
		this.pastRlaneCd = pastRlaneCd;
		this.raUcAmt = raUcAmt;
		this.mcgoTzHrs = mcgoTzHrs;
		this.cntrQty = cntrQty;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.stndCostCd = stndCostCd;
		this.pastRaPlAmt = pastRaPlAmt;
		this.pastActPlAmt = pastActPlAmt;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.raDiffAmt = raDiffAmt;
		this.actUcAmt = actUcAmt;
		this.actDiffAmt = actDiffAmt;
		this.skdDirCd = skdDirCd;
		this.acclDiffAmt = acclDiffAmt;
		this.pastIocCd = pastIocCd;
		this.fcgoTzDys = fcgoTzDys;
		this.socFlg = socFlg;
		this.estmDiffAmt = estmDiffAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cost_rout_no", getCostRoutNo());
		this.hashColumns.put("past_estm_pl_amt", getPastEstmPlAmt());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("estm_usd_uc_amt", getEstmUsdUcAmt());
		this.hashColumns.put("respb_usd_uc_amt", getRespbUsdUcAmt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("past_flg", getPastFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("spcl_dg_cgo_flg", getSpclDgCgoFlg());
		this.hashColumns.put("cost_cond_cd", getCostCondCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("past_vsl_cd", getPastVslCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("accl_rt_amt", getAcclRtAmt());
		this.hashColumns.put("past_accl_rt_amt", getPastAcclRtAmt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("spcl_bb_cgo_flg", getSpclBbCgoFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("estm_uc_amt", getEstmUcAmt());
		this.hashColumns.put("estm_usd_ttl_amt", getEstmUsdTtlAmt());
		this.hashColumns.put("fcgo_tz_hrs", getFcgoTzHrs());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("mcgo_tz_dys", getMcgoTzDys());
		this.hashColumns.put("spcl_rc_flg", getSpclRcFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sgrp_cost_cd", getSgrpCostCd());
		this.hashColumns.put("rd_flg", getRdFlg());
		this.hashColumns.put("respb_usd_ttl_amt", getRespbUsdTtlAmt());
		this.hashColumns.put("past_skd_dir_cd", getPastSkdDirCd());
		this.hashColumns.put("past_skd_voy_no", getPastSkdVoyNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("past_rlane_cd", getPastRlaneCd());
		this.hashColumns.put("ra_uc_amt", getRaUcAmt());
		this.hashColumns.put("mcgo_tz_hrs", getMcgoTzHrs());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("past_ra_pl_amt", getPastRaPlAmt());
		this.hashColumns.put("past_act_pl_amt", getPastActPlAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("ra_diff_amt", getRaDiffAmt());
		this.hashColumns.put("act_uc_amt", getActUcAmt());
		this.hashColumns.put("act_diff_amt", getActDiffAmt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("accl_diff_amt", getAcclDiffAmt());
		this.hashColumns.put("past_ioc_cd", getPastIocCd());
		this.hashColumns.put("fcgo_tz_dys", getFcgoTzDys());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("estm_diff_amt", getEstmDiffAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cost_rout_no", "costRoutNo");
		this.hashFields.put("past_estm_pl_amt", "pastEstmPlAmt");
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("estm_usd_uc_amt", "estmUsdUcAmt");
		this.hashFields.put("respb_usd_uc_amt", "respbUsdUcAmt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("past_flg", "pastFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("spcl_dg_cgo_flg", "spclDgCgoFlg");
		this.hashFields.put("cost_cond_cd", "costCondCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("past_vsl_cd", "pastVslCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("accl_rt_amt", "acclRtAmt");
		this.hashFields.put("past_accl_rt_amt", "pastAcclRtAmt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("spcl_bb_cgo_flg", "spclBbCgoFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("estm_uc_amt", "estmUcAmt");
		this.hashFields.put("estm_usd_ttl_amt", "estmUsdTtlAmt");
		this.hashFields.put("fcgo_tz_hrs", "fcgoTzHrs");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("mcgo_tz_dys", "mcgoTzDys");
		this.hashFields.put("spcl_rc_flg", "spclRcFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sgrp_cost_cd", "sgrpCostCd");
		this.hashFields.put("rd_flg", "rdFlg");
		this.hashFields.put("respb_usd_ttl_amt", "respbUsdTtlAmt");
		this.hashFields.put("past_skd_dir_cd", "pastSkdDirCd");
		this.hashFields.put("past_skd_voy_no", "pastSkdVoyNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("past_rlane_cd", "pastRlaneCd");
		this.hashFields.put("ra_uc_amt", "raUcAmt");
		this.hashFields.put("mcgo_tz_hrs", "mcgoTzHrs");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("past_ra_pl_amt", "pastRaPlAmt");
		this.hashFields.put("past_act_pl_amt", "pastActPlAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("ra_diff_amt", "raDiffAmt");
		this.hashFields.put("act_uc_amt", "actUcAmt");
		this.hashFields.put("act_diff_amt", "actDiffAmt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("accl_diff_amt", "acclDiffAmt");
		this.hashFields.put("past_ioc_cd", "pastIocCd");
		this.hashFields.put("fcgo_tz_dys", "fcgoTzDys");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("estm_diff_amt", "estmDiffAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
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
	 * @return pastEstmPlAmt
	 */
	public String getPastEstmPlAmt() {
		return this.pastEstmPlAmt;
	}
	
	/**
	 * Column Info
	 * @return raAcctCd
	 */
	public String getRaAcctCd() {
		return this.raAcctCd;
	}
	
	/**
	 * Column Info
	 * @return estmUsdUcAmt
	 */
	public String getEstmUsdUcAmt() {
		return this.estmUsdUcAmt;
	}
	
	/**
	 * Column Info
	 * @return respbUsdUcAmt
	 */
	public String getRespbUsdUcAmt() {
		return this.respbUsdUcAmt;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return pastFlg
	 */
	public String getPastFlg() {
		return this.pastFlg;
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
	 * @return costCondCd
	 */
	public String getCostCondCd() {
		return this.costCondCd;
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
	 * @return pastVslCd
	 */
	public String getPastVslCd() {
		return this.pastVslCd;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
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
	 * @return pastAcclRtAmt
	 */
	public String getPastAcclRtAmt() {
		return this.pastAcclRtAmt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return estmUcAmt
	 */
	public String getEstmUcAmt() {
		return this.estmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return estmUsdTtlAmt
	 */
	public String getEstmUsdTtlAmt() {
		return this.estmUsdTtlAmt;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return sgrpCostCd
	 */
	public String getSgrpCostCd() {
		return this.sgrpCostCd;
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
	 * @return respbUsdTtlAmt
	 */
	public String getRespbUsdTtlAmt() {
		return this.respbUsdTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return pastSkdDirCd
	 */
	public String getPastSkdDirCd() {
		return this.pastSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return pastSkdVoyNo
	 */
	public String getPastSkdVoyNo() {
		return this.pastSkdVoyNo;
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
	 * @return pastRlaneCd
	 */
	public String getPastRlaneCd() {
		return this.pastRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return raUcAmt
	 */
	public String getRaUcAmt() {
		return this.raUcAmt;
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
	 * @return cntrQty
	 */
	public String getCntrQty() {
		return this.cntrQty;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
	}
	
	/**
	 * Column Info
	 * @return pastRaPlAmt
	 */
	public String getPastRaPlAmt() {
		return this.pastRaPlAmt;
	}
	
	/**
	 * Column Info
	 * @return pastActPlAmt
	 */
	public String getPastActPlAmt() {
		return this.pastActPlAmt;
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
	}
	
	/**
	 * Column Info
	 * @return raDiffAmt
	 */
	public String getRaDiffAmt() {
		return this.raDiffAmt;
	}
	
	/**
	 * Column Info
	 * @return actUcAmt
	 */
	public String getActUcAmt() {
		return this.actUcAmt;
	}
	
	/**
	 * Column Info
	 * @return actDiffAmt
	 */
	public String getActDiffAmt() {
		return this.actDiffAmt;
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
	 * @return acclDiffAmt
	 */
	public String getAcclDiffAmt() {
		return this.acclDiffAmt;
	}
	
	/**
	 * Column Info
	 * @return pastIocCd
	 */
	public String getPastIocCd() {
		return this.pastIocCd;
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
	 * @return socFlg
	 */
	public String getSocFlg() {
		return this.socFlg;
	}
	
	/**
	 * Column Info
	 * @return estmDiffAmt
	 */
	public String getEstmDiffAmt() {
		return this.estmDiffAmt;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
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
	 * @param pastEstmPlAmt
	 */
	public void setPastEstmPlAmt(String pastEstmPlAmt) {
		this.pastEstmPlAmt = pastEstmPlAmt;
	}
	
	/**
	 * Column Info
	 * @param raAcctCd
	 */
	public void setRaAcctCd(String raAcctCd) {
		this.raAcctCd = raAcctCd;
	}
	
	/**
	 * Column Info
	 * @param estmUsdUcAmt
	 */
	public void setEstmUsdUcAmt(String estmUsdUcAmt) {
		this.estmUsdUcAmt = estmUsdUcAmt;
	}
	
	/**
	 * Column Info
	 * @param respbUsdUcAmt
	 */
	public void setRespbUsdUcAmt(String respbUsdUcAmt) {
		this.respbUsdUcAmt = respbUsdUcAmt;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param pastFlg
	 */
	public void setPastFlg(String pastFlg) {
		this.pastFlg = pastFlg;
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
	 * @param costCondCd
	 */
	public void setCostCondCd(String costCondCd) {
		this.costCondCd = costCondCd;
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
	 * @param pastVslCd
	 */
	public void setPastVslCd(String pastVslCd) {
		this.pastVslCd = pastVslCd;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
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
	 * @param pastAcclRtAmt
	 */
	public void setPastAcclRtAmt(String pastAcclRtAmt) {
		this.pastAcclRtAmt = pastAcclRtAmt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param estmUcAmt
	 */
	public void setEstmUcAmt(String estmUcAmt) {
		this.estmUcAmt = estmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param estmUsdTtlAmt
	 */
	public void setEstmUsdTtlAmt(String estmUsdTtlAmt) {
		this.estmUsdTtlAmt = estmUsdTtlAmt;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param sgrpCostCd
	 */
	public void setSgrpCostCd(String sgrpCostCd) {
		this.sgrpCostCd = sgrpCostCd;
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
	 * @param respbUsdTtlAmt
	 */
	public void setRespbUsdTtlAmt(String respbUsdTtlAmt) {
		this.respbUsdTtlAmt = respbUsdTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param pastSkdDirCd
	 */
	public void setPastSkdDirCd(String pastSkdDirCd) {
		this.pastSkdDirCd = pastSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param pastSkdVoyNo
	 */
	public void setPastSkdVoyNo(String pastSkdVoyNo) {
		this.pastSkdVoyNo = pastSkdVoyNo;
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
	 * @param pastRlaneCd
	 */
	public void setPastRlaneCd(String pastRlaneCd) {
		this.pastRlaneCd = pastRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param raUcAmt
	 */
	public void setRaUcAmt(String raUcAmt) {
		this.raUcAmt = raUcAmt;
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
	 * @param cntrQty
	 */
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Column Info
	 * @param pastRaPlAmt
	 */
	public void setPastRaPlAmt(String pastRaPlAmt) {
		this.pastRaPlAmt = pastRaPlAmt;
	}
	
	/**
	 * Column Info
	 * @param pastActPlAmt
	 */
	public void setPastActPlAmt(String pastActPlAmt) {
		this.pastActPlAmt = pastActPlAmt;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}
	
	/**
	 * Column Info
	 * @param raDiffAmt
	 */
	public void setRaDiffAmt(String raDiffAmt) {
		this.raDiffAmt = raDiffAmt;
	}
	
	/**
	 * Column Info
	 * @param actUcAmt
	 */
	public void setActUcAmt(String actUcAmt) {
		this.actUcAmt = actUcAmt;
	}
	
	/**
	 * Column Info
	 * @param actDiffAmt
	 */
	public void setActDiffAmt(String actDiffAmt) {
		this.actDiffAmt = actDiffAmt;
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
	 * @param acclDiffAmt
	 */
	public void setAcclDiffAmt(String acclDiffAmt) {
		this.acclDiffAmt = acclDiffAmt;
	}
	
	/**
	 * Column Info
	 * @param pastIocCd
	 */
	public void setPastIocCd(String pastIocCd) {
		this.pastIocCd = pastIocCd;
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
	 * @param socFlg
	 */
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
	}
	
	/**
	 * Column Info
	 * @param estmDiffAmt
	 */
	public void setEstmDiffAmt(String estmDiffAmt) {
		this.estmDiffAmt = estmDiffAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCostRoutNo(JSPUtil.getParameter(request, "cost_rout_no", ""));
		setPastEstmPlAmt(JSPUtil.getParameter(request, "past_estm_pl_amt", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setEstmUsdUcAmt(JSPUtil.getParameter(request, "estm_usd_uc_amt", ""));
		setRespbUsdUcAmt(JSPUtil.getParameter(request, "respb_usd_uc_amt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setPastFlg(JSPUtil.getParameter(request, "past_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setSpclDgCgoFlg(JSPUtil.getParameter(request, "spcl_dg_cgo_flg", ""));
		setCostCondCd(JSPUtil.getParameter(request, "cost_cond_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPastVslCd(JSPUtil.getParameter(request, "past_vsl_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setAcclRtAmt(JSPUtil.getParameter(request, "accl_rt_amt", ""));
		setPastAcclRtAmt(JSPUtil.getParameter(request, "past_accl_rt_amt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setSpclBbCgoFlg(JSPUtil.getParameter(request, "spcl_bb_cgo_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEstmUcAmt(JSPUtil.getParameter(request, "estm_uc_amt", ""));
		setEstmUsdTtlAmt(JSPUtil.getParameter(request, "estm_usd_ttl_amt", ""));
		setFcgoTzHrs(JSPUtil.getParameter(request, "fcgo_tz_hrs", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setMcgoTzDys(JSPUtil.getParameter(request, "mcgo_tz_dys", ""));
		setSpclRcFlg(JSPUtil.getParameter(request, "spcl_rc_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSgrpCostCd(JSPUtil.getParameter(request, "sgrp_cost_cd", ""));
		setRdFlg(JSPUtil.getParameter(request, "rd_flg", ""));
		setRespbUsdTtlAmt(JSPUtil.getParameter(request, "respb_usd_ttl_amt", ""));
		setPastSkdDirCd(JSPUtil.getParameter(request, "past_skd_dir_cd", ""));
		setPastSkdVoyNo(JSPUtil.getParameter(request, "past_skd_voy_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPastRlaneCd(JSPUtil.getParameter(request, "past_rlane_cd", ""));
		setRaUcAmt(JSPUtil.getParameter(request, "ra_uc_amt", ""));
		setMcgoTzHrs(JSPUtil.getParameter(request, "mcgo_tz_hrs", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setPastRaPlAmt(JSPUtil.getParameter(request, "past_ra_pl_amt", ""));
		setPastActPlAmt(JSPUtil.getParameter(request, "past_act_pl_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setRaDiffAmt(JSPUtil.getParameter(request, "ra_diff_amt", ""));
		setActUcAmt(JSPUtil.getParameter(request, "act_uc_amt", ""));
		setActDiffAmt(JSPUtil.getParameter(request, "act_diff_amt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setAcclDiffAmt(JSPUtil.getParameter(request, "accl_diff_amt", ""));
		setPastIocCd(JSPUtil.getParameter(request, "past_ioc_cd", ""));
		setFcgoTzDys(JSPUtil.getParameter(request, "fcgo_tz_dys", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setEstmDiffAmt(JSPUtil.getParameter(request, "estm_diff_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgCostSmryVO[]
	 */
	public CoaBkgCostSmryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgCostSmryVO[]
	 */
	public CoaBkgCostSmryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgCostSmryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] costRoutNo = (JSPUtil.getParameter(request, prefix	+ "cost_rout_no", length));
			String[] pastEstmPlAmt = (JSPUtil.getParameter(request, prefix	+ "past_estm_pl_amt", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] estmUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_uc_amt", length));
			String[] respbUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_uc_amt", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] pastFlg = (JSPUtil.getParameter(request, prefix	+ "past_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] spclDgCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_dg_cgo_flg", length));
			String[] costCondCd = (JSPUtil.getParameter(request, prefix	+ "cost_cond_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pastVslCd = (JSPUtil.getParameter(request, prefix	+ "past_vsl_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] acclRtAmt = (JSPUtil.getParameter(request, prefix	+ "accl_rt_amt", length));
			String[] pastAcclRtAmt = (JSPUtil.getParameter(request, prefix	+ "past_accl_rt_amt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] spclBbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bb_cgo_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] estmUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_uc_amt", length));
			String[] estmUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_ttl_amt", length));
			String[] fcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_hrs", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] mcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_dys", length));
			String[] spclRcFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rc_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "sgrp_cost_cd", length));
			String[] rdFlg = (JSPUtil.getParameter(request, prefix	+ "rd_flg", length));
			String[] respbUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_ttl_amt", length));
			String[] pastSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "past_skd_dir_cd", length));
			String[] pastSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "past_skd_voy_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pastRlaneCd = (JSPUtil.getParameter(request, prefix	+ "past_rlane_cd", length));
			String[] raUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_uc_amt", length));
			String[] mcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_hrs", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] pastRaPlAmt = (JSPUtil.getParameter(request, prefix	+ "past_ra_pl_amt", length));
			String[] pastActPlAmt = (JSPUtil.getParameter(request, prefix	+ "past_act_pl_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] raDiffAmt = (JSPUtil.getParameter(request, prefix	+ "ra_diff_amt", length));
			String[] actUcAmt = (JSPUtil.getParameter(request, prefix	+ "act_uc_amt", length));
			String[] actDiffAmt = (JSPUtil.getParameter(request, prefix	+ "act_diff_amt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] acclDiffAmt = (JSPUtil.getParameter(request, prefix	+ "accl_diff_amt", length));
			String[] pastIocCd = (JSPUtil.getParameter(request, prefix	+ "past_ioc_cd", length));
			String[] fcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_dys", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] estmDiffAmt = (JSPUtil.getParameter(request, prefix	+ "estm_diff_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgCostSmryVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (costRoutNo[i] != null)
					model.setCostRoutNo(costRoutNo[i]);
				if (pastEstmPlAmt[i] != null)
					model.setPastEstmPlAmt(pastEstmPlAmt[i]);
				if (raAcctCd[i] != null)
					model.setRaAcctCd(raAcctCd[i]);
				if (estmUsdUcAmt[i] != null)
					model.setEstmUsdUcAmt(estmUsdUcAmt[i]);
				if (respbUsdUcAmt[i] != null)
					model.setRespbUsdUcAmt(respbUsdUcAmt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pastFlg[i] != null)
					model.setPastFlg(pastFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (spclDgCgoFlg[i] != null)
					model.setSpclDgCgoFlg(spclDgCgoFlg[i]);
				if (costCondCd[i] != null)
					model.setCostCondCd(costCondCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pastVslCd[i] != null)
					model.setPastVslCd(pastVslCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (acclRtAmt[i] != null)
					model.setAcclRtAmt(acclRtAmt[i]);
				if (pastAcclRtAmt[i] != null)
					model.setPastAcclRtAmt(pastAcclRtAmt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (spclBbCgoFlg[i] != null)
					model.setSpclBbCgoFlg(spclBbCgoFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (estmUcAmt[i] != null)
					model.setEstmUcAmt(estmUcAmt[i]);
				if (estmUsdTtlAmt[i] != null)
					model.setEstmUsdTtlAmt(estmUsdTtlAmt[i]);
				if (fcgoTzHrs[i] != null)
					model.setFcgoTzHrs(fcgoTzHrs[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (mcgoTzDys[i] != null)
					model.setMcgoTzDys(mcgoTzDys[i]);
				if (spclRcFlg[i] != null)
					model.setSpclRcFlg(spclRcFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sgrpCostCd[i] != null)
					model.setSgrpCostCd(sgrpCostCd[i]);
				if (rdFlg[i] != null)
					model.setRdFlg(rdFlg[i]);
				if (respbUsdTtlAmt[i] != null)
					model.setRespbUsdTtlAmt(respbUsdTtlAmt[i]);
				if (pastSkdDirCd[i] != null)
					model.setPastSkdDirCd(pastSkdDirCd[i]);
				if (pastSkdVoyNo[i] != null)
					model.setPastSkdVoyNo(pastSkdVoyNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pastRlaneCd[i] != null)
					model.setPastRlaneCd(pastRlaneCd[i]);
				if (raUcAmt[i] != null)
					model.setRaUcAmt(raUcAmt[i]);
				if (mcgoTzHrs[i] != null)
					model.setMcgoTzHrs(mcgoTzHrs[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (pastRaPlAmt[i] != null)
					model.setPastRaPlAmt(pastRaPlAmt[i]);
				if (pastActPlAmt[i] != null)
					model.setPastActPlAmt(pastActPlAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (raDiffAmt[i] != null)
					model.setRaDiffAmt(raDiffAmt[i]);
				if (actUcAmt[i] != null)
					model.setActUcAmt(actUcAmt[i]);
				if (actDiffAmt[i] != null)
					model.setActDiffAmt(actDiffAmt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (acclDiffAmt[i] != null)
					model.setAcclDiffAmt(acclDiffAmt[i]);
				if (pastIocCd[i] != null)
					model.setPastIocCd(pastIocCd[i]);
				if (fcgoTzDys[i] != null)
					model.setFcgoTzDys(fcgoTzDys[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (estmDiffAmt[i] != null)
					model.setEstmDiffAmt(estmDiffAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgCostSmryVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgCostSmryVO[]
	 */
	public CoaBkgCostSmryVO[] getCoaBkgCostSmryVOs(){
		CoaBkgCostSmryVO[] vos = (CoaBkgCostSmryVO[])models.toArray(new CoaBkgCostSmryVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costRoutNo = this.costRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastEstmPlAmt = this.pastEstmPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdUcAmt = this.estmUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdUcAmt = this.respbUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastFlg = this.pastFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclDgCgoFlg = this.spclDgCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCondCd = this.costCondCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastVslCd = this.pastVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclRtAmt = this.acclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastAcclRtAmt = this.pastAcclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBbCgoFlg = this.spclBbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUcAmt = this.estmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdTtlAmt = this.estmUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzHrs = this.fcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzDys = this.mcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRcFlg = this.spclRcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpCostCd = this.sgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdFlg = this.rdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdTtlAmt = this.respbUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastSkdDirCd = this.pastSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastSkdVoyNo = this.pastSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastRlaneCd = this.pastRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raUcAmt = this.raUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzHrs = this.mcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastRaPlAmt = this.pastRaPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastActPlAmt = this.pastActPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raDiffAmt = this.raDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actUcAmt = this.actUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDiffAmt = this.actDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclDiffAmt = this.acclDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastIocCd = this.pastIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzDys = this.fcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmDiffAmt = this.estmDiffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
