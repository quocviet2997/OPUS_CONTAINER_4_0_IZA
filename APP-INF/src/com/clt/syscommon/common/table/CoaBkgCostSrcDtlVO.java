/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgCostSrcDtlVO.java
*@FileTitle : CoaBkgCostSrcDtlVO
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

public class CoaBkgCostSrcDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgCostSrcDtlVO> models = new ArrayList<CoaBkgCostSrcDtlVO>();
	
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String costRoutNo = null;
	/* Column Info */
	private String n4thVndrSeq = null;
	/* Column Info */
	private String estmUsdUcAmt = null;
	/* Column Info */
	private String raAcctCd = null;
	/* Column Info */
	private String respbUsdUcAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String actGrpTmlFlg = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String spclDgCgoFlg = null;
	/* Column Info */
	private String aplyVndrSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String n2ndVndrSeq = null;
	/* Column Info */
	private String pstCostActGrpCd = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String n2ndNodCd = null;
	/* Column Info */
	private String ctrlOfcCd = null;
	/* Column Info */
	private String acclRtAmt = null;
	/* Column Info */
	private String trspSvcOfcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String spclBbCgoFlg = null;
	/* Column Info */
	private String n4thNodCd = null;
	/* Column Info */
	private String n1stNodCd = null;
	/* Column Info */
	private String estmUcAmt = null;
	/* Column Info */
	private String nodCd = null;
	/* Column Info */
	private String routTzModCd = null;
	/* Column Info */
	private String costCalcRmk = null;
	/* Column Info */
	private String n3rdNodCd = null;
	/* Column Info */
	private String railSvcTpCd = null;
	/* Column Info */
	private String estmUsdTtlAmt = null;
	/* Column Info */
	private String fcgoTzHrs = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String mcgoTzDys = null;
	/* Column Info */
	private String spclRcFlg = null;
	/* Column Info */
	private String estmUpdFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String respbUsdTtlAmt = null;
	/* Column Info */
	private String rdFlg = null;
	/* Column Info */
	private String costIoBndCd = null;
	/* Column Info */
	private String lgsCostCdChkFlg = null;
	/* Column Info */
	private String n1stNodTpCd = null;
	/* Column Info */
	private String costAmtExtdFlg = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String preCostActGrpCd = null;
	/* Column Info */
	private String estmTgtFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String raUcAmt = null;
	/* Column Info */
	private String wtrRcvTermCd = null;
	/* Column Info */
	private String ctrtRtnFlg = null;
	/* Column Info */
	private String n1stVndrSeq = null;
	/* Column Info */
	private String costActGrpTpCd = null;
	/* Column Info */
	private String mcgoTzHrs = null;
	/* Column Info */
	private String wtrDeTermCd = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String thrpRtFlg = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String n3rdVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String costCateCd = null;
	/* Column Info */
	private String plnUcAmt = null;
	/* Column Info */
	private String actUcAmt = null;
	/* Column Info */
	private String fcgoTzDys = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String custNomiTrkrFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgCostSrcDtlVO() {}

	public CoaBkgCostSrcDtlVO(String ibflag, String pagerows, String bkgNo, String cntrTpszCd, String costRoutNo, String costActGrpSeq, String coaCostSrcCd, String costAmtExtdFlg, String costActGrpCd, String nodCd, String toNodCd, String stndCostCd, String costCateCd, String raAcctCd, String n1stNodCd, String cntrQty, String n2ndNodCd, String n3rdNodCd, String n4thNodCd, String costAssBseCd, String actUcAmt, String plnUcAmt, String estmUcAmt, String raUcAmt, String acclRtAmt, String routTzModCd, String fcgoTzDys, String fcgoTzHrs, String mcgoTzDys, String mcgoTzHrs, String spclRcFlg, String spclDgCgoFlg, String spclAwkCgoFlg, String spclBbCgoFlg, String rdFlg, String socFlg, String estmUpdFlg, String ctrlOfcCd, String railSvcTpCd, String costActGrpTpCd, String vslSlanCd, String costIoBndCd, String n1stNodTpCd, String n1stVndrSeq, String n2ndVndrSeq, String n3rdVndrSeq, String n4thVndrSeq, String custNomiTrkrFlg, String trspSvcOfcCd, String lgsCostCdChkFlg, String thrpRtFlg, String actGrpTmlFlg, String aplyVndrSeq, String loclCurrCd, String estmUsdTtlAmt, String respbUsdTtlAmt, String estmTgtFlg, String estmUsdUcAmt, String respbUsdUcAmt, String deltFlg, String ctrtRtnFlg, String wtrRcvTermCd, String wtrDeTermCd, String costCalcRmk, String preCostActGrpCd, String pstCostActGrpCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.toNodCd = toNodCd;
		this.costRoutNo = costRoutNo;
		this.n4thVndrSeq = n4thVndrSeq;
		this.estmUsdUcAmt = estmUsdUcAmt;
		this.raAcctCd = raAcctCd;
		this.respbUsdUcAmt = respbUsdUcAmt;
		this.pagerows = pagerows;
		this.actGrpTmlFlg = actGrpTmlFlg;
		this.cntrTpszCd = cntrTpszCd;
		this.spclDgCgoFlg = spclDgCgoFlg;
		this.aplyVndrSeq = aplyVndrSeq;
		this.updUsrId = updUsrId;
		this.n2ndVndrSeq = n2ndVndrSeq;
		this.pstCostActGrpCd = pstCostActGrpCd;
		this.loclCurrCd = loclCurrCd;
		this.n2ndNodCd = n2ndNodCd;
		this.ctrlOfcCd = ctrlOfcCd;
		this.acclRtAmt = acclRtAmt;
		this.trspSvcOfcCd = trspSvcOfcCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.costActGrpCd = costActGrpCd;
		this.spclBbCgoFlg = spclBbCgoFlg;
		this.n4thNodCd = n4thNodCd;
		this.n1stNodCd = n1stNodCd;
		this.estmUcAmt = estmUcAmt;
		this.nodCd = nodCd;
		this.routTzModCd = routTzModCd;
		this.costCalcRmk = costCalcRmk;
		this.n3rdNodCd = n3rdNodCd;
		this.railSvcTpCd = railSvcTpCd;
		this.estmUsdTtlAmt = estmUsdTtlAmt;
		this.fcgoTzHrs = fcgoTzHrs;
		this.deltFlg = deltFlg;
		this.coaCostSrcCd = coaCostSrcCd;
		this.mcgoTzDys = mcgoTzDys;
		this.spclRcFlg = spclRcFlg;
		this.estmUpdFlg = estmUpdFlg;
		this.creDt = creDt;
		this.respbUsdTtlAmt = respbUsdTtlAmt;
		this.rdFlg = rdFlg;
		this.costIoBndCd = costIoBndCd;
		this.lgsCostCdChkFlg = lgsCostCdChkFlg;
		this.n1stNodTpCd = n1stNodTpCd;
		this.costAmtExtdFlg = costAmtExtdFlg;
		this.vslSlanCd = vslSlanCd;
		this.preCostActGrpCd = preCostActGrpCd;
		this.estmTgtFlg = estmTgtFlg;
		this.ibflag = ibflag;
		this.raUcAmt = raUcAmt;
		this.wtrRcvTermCd = wtrRcvTermCd;
		this.ctrtRtnFlg = ctrtRtnFlg;
		this.n1stVndrSeq = n1stVndrSeq;
		this.costActGrpTpCd = costActGrpTpCd;
		this.mcgoTzHrs = mcgoTzHrs;
		this.wtrDeTermCd = wtrDeTermCd;
		this.cntrQty = cntrQty;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.thrpRtFlg = thrpRtFlg;
		this.stndCostCd = stndCostCd;
		this.n3rdVndrSeq = n3rdVndrSeq;
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.costCateCd = costCateCd;
		this.plnUcAmt = plnUcAmt;
		this.actUcAmt = actUcAmt;
		this.fcgoTzDys = fcgoTzDys;
		this.socFlg = socFlg;
		this.costActGrpSeq = costActGrpSeq;
		this.custNomiTrkrFlg = custNomiTrkrFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("cost_rout_no", getCostRoutNo());
		this.hashColumns.put("n4th_vndr_seq", getN4thVndrSeq());
		this.hashColumns.put("estm_usd_uc_amt", getEstmUsdUcAmt());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("respb_usd_uc_amt", getRespbUsdUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("act_grp_tml_flg", getActGrpTmlFlg());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("spcl_dg_cgo_flg", getSpclDgCgoFlg());
		this.hashColumns.put("aply_vndr_seq", getAplyVndrSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("n2nd_vndr_seq", getN2ndVndrSeq());
		this.hashColumns.put("pst_cost_act_grp_cd", getPstCostActGrpCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("n2nd_nod_cd", getN2ndNodCd());
		this.hashColumns.put("ctrl_ofc_cd", getCtrlOfcCd());
		this.hashColumns.put("accl_rt_amt", getAcclRtAmt());
		this.hashColumns.put("trsp_svc_ofc_cd", getTrspSvcOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("spcl_bb_cgo_flg", getSpclBbCgoFlg());
		this.hashColumns.put("n4th_nod_cd", getN4thNodCd());
		this.hashColumns.put("n1st_nod_cd", getN1stNodCd());
		this.hashColumns.put("estm_uc_amt", getEstmUcAmt());
		this.hashColumns.put("nod_cd", getNodCd());
		this.hashColumns.put("rout_tz_mod_cd", getRoutTzModCd());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
		this.hashColumns.put("n3rd_nod_cd", getN3rdNodCd());
		this.hashColumns.put("rail_svc_tp_cd", getRailSvcTpCd());
		this.hashColumns.put("estm_usd_ttl_amt", getEstmUsdTtlAmt());
		this.hashColumns.put("fcgo_tz_hrs", getFcgoTzHrs());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("mcgo_tz_dys", getMcgoTzDys());
		this.hashColumns.put("spcl_rc_flg", getSpclRcFlg());
		this.hashColumns.put("estm_upd_flg", getEstmUpdFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("respb_usd_ttl_amt", getRespbUsdTtlAmt());
		this.hashColumns.put("rd_flg", getRdFlg());
		this.hashColumns.put("cost_io_bnd_cd", getCostIoBndCd());
		this.hashColumns.put("lgs_cost_cd_chk_flg", getLgsCostCdChkFlg());
		this.hashColumns.put("n1st_nod_tp_cd", getN1stNodTpCd());
		this.hashColumns.put("cost_amt_extd_flg", getCostAmtExtdFlg());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pre_cost_act_grp_cd", getPreCostActGrpCd());
		this.hashColumns.put("estm_tgt_flg", getEstmTgtFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ra_uc_amt", getRaUcAmt());
		this.hashColumns.put("wtr_rcv_term_cd", getWtrRcvTermCd());
		this.hashColumns.put("ctrt_rtn_flg", getCtrtRtnFlg());
		this.hashColumns.put("n1st_vndr_seq", getN1stVndrSeq());
		this.hashColumns.put("cost_act_grp_tp_cd", getCostActGrpTpCd());
		this.hashColumns.put("mcgo_tz_hrs", getMcgoTzHrs());
		this.hashColumns.put("wtr_de_term_cd", getWtrDeTermCd());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("thrp_rt_flg", getThrpRtFlg());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("n3rd_vndr_seq", getN3rdVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("cost_cate_cd", getCostCateCd());
		this.hashColumns.put("pln_uc_amt", getPlnUcAmt());
		this.hashColumns.put("act_uc_amt", getActUcAmt());
		this.hashColumns.put("fcgo_tz_dys", getFcgoTzDys());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("cust_nomi_trkr_flg", getCustNomiTrkrFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("cost_rout_no", "costRoutNo");
		this.hashFields.put("n4th_vndr_seq", "n4thVndrSeq");
		this.hashFields.put("estm_usd_uc_amt", "estmUsdUcAmt");
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("respb_usd_uc_amt", "respbUsdUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("act_grp_tml_flg", "actGrpTmlFlg");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("spcl_dg_cgo_flg", "spclDgCgoFlg");
		this.hashFields.put("aply_vndr_seq", "aplyVndrSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("n2nd_vndr_seq", "n2ndVndrSeq");
		this.hashFields.put("pst_cost_act_grp_cd", "pstCostActGrpCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("n2nd_nod_cd", "n2ndNodCd");
		this.hashFields.put("ctrl_ofc_cd", "ctrlOfcCd");
		this.hashFields.put("accl_rt_amt", "acclRtAmt");
		this.hashFields.put("trsp_svc_ofc_cd", "trspSvcOfcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("spcl_bb_cgo_flg", "spclBbCgoFlg");
		this.hashFields.put("n4th_nod_cd", "n4thNodCd");
		this.hashFields.put("n1st_nod_cd", "n1stNodCd");
		this.hashFields.put("estm_uc_amt", "estmUcAmt");
		this.hashFields.put("nod_cd", "nodCd");
		this.hashFields.put("rout_tz_mod_cd", "routTzModCd");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
		this.hashFields.put("n3rd_nod_cd", "n3rdNodCd");
		this.hashFields.put("rail_svc_tp_cd", "railSvcTpCd");
		this.hashFields.put("estm_usd_ttl_amt", "estmUsdTtlAmt");
		this.hashFields.put("fcgo_tz_hrs", "fcgoTzHrs");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("mcgo_tz_dys", "mcgoTzDys");
		this.hashFields.put("spcl_rc_flg", "spclRcFlg");
		this.hashFields.put("estm_upd_flg", "estmUpdFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("respb_usd_ttl_amt", "respbUsdTtlAmt");
		this.hashFields.put("rd_flg", "rdFlg");
		this.hashFields.put("cost_io_bnd_cd", "costIoBndCd");
		this.hashFields.put("lgs_cost_cd_chk_flg", "lgsCostCdChkFlg");
		this.hashFields.put("n1st_nod_tp_cd", "n1stNodTpCd");
		this.hashFields.put("cost_amt_extd_flg", "costAmtExtdFlg");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pre_cost_act_grp_cd", "preCostActGrpCd");
		this.hashFields.put("estm_tgt_flg", "estmTgtFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ra_uc_amt", "raUcAmt");
		this.hashFields.put("wtr_rcv_term_cd", "wtrRcvTermCd");
		this.hashFields.put("ctrt_rtn_flg", "ctrtRtnFlg");
		this.hashFields.put("n1st_vndr_seq", "n1stVndrSeq");
		this.hashFields.put("cost_act_grp_tp_cd", "costActGrpTpCd");
		this.hashFields.put("mcgo_tz_hrs", "mcgoTzHrs");
		this.hashFields.put("wtr_de_term_cd", "wtrDeTermCd");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("thrp_rt_flg", "thrpRtFlg");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("n3rd_vndr_seq", "n3rdVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("cost_cate_cd", "costCateCd");
		this.hashFields.put("pln_uc_amt", "plnUcAmt");
		this.hashFields.put("act_uc_amt", "actUcAmt");
		this.hashFields.put("fcgo_tz_dys", "fcgoTzDys");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("cust_nomi_trkr_flg", "custNomiTrkrFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
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
	 * @return n4thVndrSeq
	 */
	public String getN4thVndrSeq() {
		return this.n4thVndrSeq;
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
	 * @return raAcctCd
	 */
	public String getRaAcctCd() {
		return this.raAcctCd;
	}
	
	/**
	 * Column Info
	 * @return respbUsdUcAmt
	 */
	public String getRespbUsdUcAmt() {
		return this.respbUsdUcAmt;
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
	 * @return actGrpTmlFlg
	 */
	public String getActGrpTmlFlg() {
		return this.actGrpTmlFlg;
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
	 * @return aplyVndrSeq
	 */
	public String getAplyVndrSeq() {
		return this.aplyVndrSeq;
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
	 * @return n2ndVndrSeq
	 */
	public String getN2ndVndrSeq() {
		return this.n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return pstCostActGrpCd
	 */
	public String getPstCostActGrpCd() {
		return this.pstCostActGrpCd;
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
	 * @return n2ndNodCd
	 */
	public String getN2ndNodCd() {
		return this.n2ndNodCd;
	}
	
	/**
	 * Column Info
	 * @return ctrlOfcCd
	 */
	public String getCtrlOfcCd() {
		return this.ctrlOfcCd;
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
	 * @return trspSvcOfcCd
	 */
	public String getTrspSvcOfcCd() {
		return this.trspSvcOfcCd;
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
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return n4thNodCd
	 */
	public String getN4thNodCd() {
		return this.n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @return n1stNodCd
	 */
	public String getN1stNodCd() {
		return this.n1stNodCd;
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
	 * @return nodCd
	 */
	public String getNodCd() {
		return this.nodCd;
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
	 * @return costCalcRmk
	 */
	public String getCostCalcRmk() {
		return this.costCalcRmk;
	}
	
	/**
	 * Column Info
	 * @return n3rdNodCd
	 */
	public String getN3rdNodCd() {
		return this.n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @return railSvcTpCd
	 */
	public String getRailSvcTpCd() {
		return this.railSvcTpCd;
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
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
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
	 * @return estmUpdFlg
	 */
	public String getEstmUpdFlg() {
		return this.estmUpdFlg;
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
	 * @return respbUsdTtlAmt
	 */
	public String getRespbUsdTtlAmt() {
		return this.respbUsdTtlAmt;
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
	 * @return costIoBndCd
	 */
	public String getCostIoBndCd() {
		return this.costIoBndCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCdChkFlg
	 */
	public String getLgsCostCdChkFlg() {
		return this.lgsCostCdChkFlg;
	}
	
	/**
	 * Column Info
	 * @return n1stNodTpCd
	 */
	public String getN1stNodTpCd() {
		return this.n1stNodTpCd;
	}
	
	/**
	 * Column Info
	 * @return costAmtExtdFlg
	 */
	public String getCostAmtExtdFlg() {
		return this.costAmtExtdFlg;
	}
	
	/**
	 * Column Info
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @return preCostActGrpCd
	 */
	public String getPreCostActGrpCd() {
		return this.preCostActGrpCd;
	}
	
	/**
	 * Column Info
	 * @return estmTgtFlg
	 */
	public String getEstmTgtFlg() {
		return this.estmTgtFlg;
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
	 * @return raUcAmt
	 */
	public String getRaUcAmt() {
		return this.raUcAmt;
	}
	
	/**
	 * Column Info
	 * @return wtrRcvTermCd
	 */
	public String getWtrRcvTermCd() {
		return this.wtrRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtRtnFlg
	 */
	public String getCtrtRtnFlg() {
		return this.ctrtRtnFlg;
	}
	
	/**
	 * Column Info
	 * @return n1stVndrSeq
	 */
	public String getN1stVndrSeq() {
		return this.n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return costActGrpTpCd
	 */
	public String getCostActGrpTpCd() {
		return this.costActGrpTpCd;
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
	 * @return wtrDeTermCd
	 */
	public String getWtrDeTermCd() {
		return this.wtrDeTermCd;
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
	 * @return thrpRtFlg
	 */
	public String getThrpRtFlg() {
		return this.thrpRtFlg;
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
	 * @return n3rdVndrSeq
	 */
	public String getN3rdVndrSeq() {
		return this.n3rdVndrSeq;
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
	 * @return costCateCd
	 */
	public String getCostCateCd() {
		return this.costCateCd;
	}
	
	/**
	 * Column Info
	 * @return plnUcAmt
	 */
	public String getPlnUcAmt() {
		return this.plnUcAmt;
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
	 * @return costActGrpSeq
	 */
	public String getCostActGrpSeq() {
		return this.costActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @return custNomiTrkrFlg
	 */
	public String getCustNomiTrkrFlg() {
		return this.custNomiTrkrFlg;
	}
	

	/**
	 * Column Info
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
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
	 * @param n4thVndrSeq
	 */
	public void setN4thVndrSeq(String n4thVndrSeq) {
		this.n4thVndrSeq = n4thVndrSeq;
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
	 * @param raAcctCd
	 */
	public void setRaAcctCd(String raAcctCd) {
		this.raAcctCd = raAcctCd;
	}
	
	/**
	 * Column Info
	 * @param respbUsdUcAmt
	 */
	public void setRespbUsdUcAmt(String respbUsdUcAmt) {
		this.respbUsdUcAmt = respbUsdUcAmt;
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
	 * @param actGrpTmlFlg
	 */
	public void setActGrpTmlFlg(String actGrpTmlFlg) {
		this.actGrpTmlFlg = actGrpTmlFlg;
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
	 * @param aplyVndrSeq
	 */
	public void setAplyVndrSeq(String aplyVndrSeq) {
		this.aplyVndrSeq = aplyVndrSeq;
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
	 * @param n2ndVndrSeq
	 */
	public void setN2ndVndrSeq(String n2ndVndrSeq) {
		this.n2ndVndrSeq = n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param pstCostActGrpCd
	 */
	public void setPstCostActGrpCd(String pstCostActGrpCd) {
		this.pstCostActGrpCd = pstCostActGrpCd;
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
	 * @param n2ndNodCd
	 */
	public void setN2ndNodCd(String n2ndNodCd) {
		this.n2ndNodCd = n2ndNodCd;
	}
	
	/**
	 * Column Info
	 * @param ctrlOfcCd
	 */
	public void setCtrlOfcCd(String ctrlOfcCd) {
		this.ctrlOfcCd = ctrlOfcCd;
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
	 * @param trspSvcOfcCd
	 */
	public void setTrspSvcOfcCd(String trspSvcOfcCd) {
		this.trspSvcOfcCd = trspSvcOfcCd;
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
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param n4thNodCd
	 */
	public void setN4thNodCd(String n4thNodCd) {
		this.n4thNodCd = n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @param n1stNodCd
	 */
	public void setN1stNodCd(String n1stNodCd) {
		this.n1stNodCd = n1stNodCd;
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
	 * @param nodCd
	 */
	public void setNodCd(String nodCd) {
		this.nodCd = nodCd;
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
	 * @param costCalcRmk
	 */
	public void setCostCalcRmk(String costCalcRmk) {
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * Column Info
	 * @param n3rdNodCd
	 */
	public void setN3rdNodCd(String n3rdNodCd) {
		this.n3rdNodCd = n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @param railSvcTpCd
	 */
	public void setRailSvcTpCd(String railSvcTpCd) {
		this.railSvcTpCd = railSvcTpCd;
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
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
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
	 * @param estmUpdFlg
	 */
	public void setEstmUpdFlg(String estmUpdFlg) {
		this.estmUpdFlg = estmUpdFlg;
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
	 * @param respbUsdTtlAmt
	 */
	public void setRespbUsdTtlAmt(String respbUsdTtlAmt) {
		this.respbUsdTtlAmt = respbUsdTtlAmt;
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
	 * @param costIoBndCd
	 */
	public void setCostIoBndCd(String costIoBndCd) {
		this.costIoBndCd = costIoBndCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCdChkFlg
	 */
	public void setLgsCostCdChkFlg(String lgsCostCdChkFlg) {
		this.lgsCostCdChkFlg = lgsCostCdChkFlg;
	}
	
	/**
	 * Column Info
	 * @param n1stNodTpCd
	 */
	public void setN1stNodTpCd(String n1stNodTpCd) {
		this.n1stNodTpCd = n1stNodTpCd;
	}
	
	/**
	 * Column Info
	 * @param costAmtExtdFlg
	 */
	public void setCostAmtExtdFlg(String costAmtExtdFlg) {
		this.costAmtExtdFlg = costAmtExtdFlg;
	}
	
	/**
	 * Column Info
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @param preCostActGrpCd
	 */
	public void setPreCostActGrpCd(String preCostActGrpCd) {
		this.preCostActGrpCd = preCostActGrpCd;
	}
	
	/**
	 * Column Info
	 * @param estmTgtFlg
	 */
	public void setEstmTgtFlg(String estmTgtFlg) {
		this.estmTgtFlg = estmTgtFlg;
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
	 * @param raUcAmt
	 */
	public void setRaUcAmt(String raUcAmt) {
		this.raUcAmt = raUcAmt;
	}
	
	/**
	 * Column Info
	 * @param wtrRcvTermCd
	 */
	public void setWtrRcvTermCd(String wtrRcvTermCd) {
		this.wtrRcvTermCd = wtrRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtRtnFlg
	 */
	public void setCtrtRtnFlg(String ctrtRtnFlg) {
		this.ctrtRtnFlg = ctrtRtnFlg;
	}
	
	/**
	 * Column Info
	 * @param n1stVndrSeq
	 */
	public void setN1stVndrSeq(String n1stVndrSeq) {
		this.n1stVndrSeq = n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param costActGrpTpCd
	 */
	public void setCostActGrpTpCd(String costActGrpTpCd) {
		this.costActGrpTpCd = costActGrpTpCd;
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
	 * @param wtrDeTermCd
	 */
	public void setWtrDeTermCd(String wtrDeTermCd) {
		this.wtrDeTermCd = wtrDeTermCd;
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
	 * @param thrpRtFlg
	 */
	public void setThrpRtFlg(String thrpRtFlg) {
		this.thrpRtFlg = thrpRtFlg;
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
	 * @param n3rdVndrSeq
	 */
	public void setN3rdVndrSeq(String n3rdVndrSeq) {
		this.n3rdVndrSeq = n3rdVndrSeq;
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
	 * @param costCateCd
	 */
	public void setCostCateCd(String costCateCd) {
		this.costCateCd = costCateCd;
	}
	
	/**
	 * Column Info
	 * @param plnUcAmt
	 */
	public void setPlnUcAmt(String plnUcAmt) {
		this.plnUcAmt = plnUcAmt;
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
	 * @param costActGrpSeq
	 */
	public void setCostActGrpSeq(String costActGrpSeq) {
		this.costActGrpSeq = costActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @param custNomiTrkrFlg
	 */
	public void setCustNomiTrkrFlg(String custNomiTrkrFlg) {
		this.custNomiTrkrFlg = custNomiTrkrFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setCostRoutNo(JSPUtil.getParameter(request, "cost_rout_no", ""));
		setN4thVndrSeq(JSPUtil.getParameter(request, "n4th_vndr_seq", ""));
		setEstmUsdUcAmt(JSPUtil.getParameter(request, "estm_usd_uc_amt", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setRespbUsdUcAmt(JSPUtil.getParameter(request, "respb_usd_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setActGrpTmlFlg(JSPUtil.getParameter(request, "act_grp_tml_flg", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setSpclDgCgoFlg(JSPUtil.getParameter(request, "spcl_dg_cgo_flg", ""));
		setAplyVndrSeq(JSPUtil.getParameter(request, "aply_vndr_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setN2ndVndrSeq(JSPUtil.getParameter(request, "n2nd_vndr_seq", ""));
		setPstCostActGrpCd(JSPUtil.getParameter(request, "pst_cost_act_grp_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setN2ndNodCd(JSPUtil.getParameter(request, "n2nd_nod_cd", ""));
		setCtrlOfcCd(JSPUtil.getParameter(request, "ctrl_ofc_cd", ""));
		setAcclRtAmt(JSPUtil.getParameter(request, "accl_rt_amt", ""));
		setTrspSvcOfcCd(JSPUtil.getParameter(request, "trsp_svc_ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setSpclBbCgoFlg(JSPUtil.getParameter(request, "spcl_bb_cgo_flg", ""));
		setN4thNodCd(JSPUtil.getParameter(request, "n4th_nod_cd", ""));
		setN1stNodCd(JSPUtil.getParameter(request, "n1st_nod_cd", ""));
		setEstmUcAmt(JSPUtil.getParameter(request, "estm_uc_amt", ""));
		setNodCd(JSPUtil.getParameter(request, "nod_cd", ""));
		setRoutTzModCd(JSPUtil.getParameter(request, "rout_tz_mod_cd", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
		setN3rdNodCd(JSPUtil.getParameter(request, "n3rd_nod_cd", ""));
		setRailSvcTpCd(JSPUtil.getParameter(request, "rail_svc_tp_cd", ""));
		setEstmUsdTtlAmt(JSPUtil.getParameter(request, "estm_usd_ttl_amt", ""));
		setFcgoTzHrs(JSPUtil.getParameter(request, "fcgo_tz_hrs", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setMcgoTzDys(JSPUtil.getParameter(request, "mcgo_tz_dys", ""));
		setSpclRcFlg(JSPUtil.getParameter(request, "spcl_rc_flg", ""));
		setEstmUpdFlg(JSPUtil.getParameter(request, "estm_upd_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRespbUsdTtlAmt(JSPUtil.getParameter(request, "respb_usd_ttl_amt", ""));
		setRdFlg(JSPUtil.getParameter(request, "rd_flg", ""));
		setCostIoBndCd(JSPUtil.getParameter(request, "cost_io_bnd_cd", ""));
		setLgsCostCdChkFlg(JSPUtil.getParameter(request, "lgs_cost_cd_chk_flg", ""));
		setN1stNodTpCd(JSPUtil.getParameter(request, "n1st_nod_tp_cd", ""));
		setCostAmtExtdFlg(JSPUtil.getParameter(request, "cost_amt_extd_flg", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setPreCostActGrpCd(JSPUtil.getParameter(request, "pre_cost_act_grp_cd", ""));
		setEstmTgtFlg(JSPUtil.getParameter(request, "estm_tgt_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRaUcAmt(JSPUtil.getParameter(request, "ra_uc_amt", ""));
		setWtrRcvTermCd(JSPUtil.getParameter(request, "wtr_rcv_term_cd", ""));
		setCtrtRtnFlg(JSPUtil.getParameter(request, "ctrt_rtn_flg", ""));
		setN1stVndrSeq(JSPUtil.getParameter(request, "n1st_vndr_seq", ""));
		setCostActGrpTpCd(JSPUtil.getParameter(request, "cost_act_grp_tp_cd", ""));
		setMcgoTzHrs(JSPUtil.getParameter(request, "mcgo_tz_hrs", ""));
		setWtrDeTermCd(JSPUtil.getParameter(request, "wtr_de_term_cd", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setThrpRtFlg(JSPUtil.getParameter(request, "thrp_rt_flg", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setN3rdVndrSeq(JSPUtil.getParameter(request, "n3rd_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setCostCateCd(JSPUtil.getParameter(request, "cost_cate_cd", ""));
		setPlnUcAmt(JSPUtil.getParameter(request, "pln_uc_amt", ""));
		setActUcAmt(JSPUtil.getParameter(request, "act_uc_amt", ""));
		setFcgoTzDys(JSPUtil.getParameter(request, "fcgo_tz_dys", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, "cost_act_grp_seq", ""));
		setCustNomiTrkrFlg(JSPUtil.getParameter(request, "cust_nomi_trkr_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgCostSrcDtlVO[]
	 */
	public CoaBkgCostSrcDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgCostSrcDtlVO[]
	 */
	public CoaBkgCostSrcDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgCostSrcDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] costRoutNo = (JSPUtil.getParameter(request, prefix	+ "cost_rout_no", length));
			String[] n4thVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n4th_vndr_seq", length));
			String[] estmUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_uc_amt", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] respbUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] actGrpTmlFlg = (JSPUtil.getParameter(request, prefix	+ "act_grp_tml_flg", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] spclDgCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_dg_cgo_flg", length));
			String[] aplyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "aply_vndr_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] n2ndVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n2nd_vndr_seq", length));
			String[] pstCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pst_cost_act_grp_cd", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] n2ndNodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_nod_cd", length));
			String[] ctrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrl_ofc_cd", length));
			String[] acclRtAmt = (JSPUtil.getParameter(request, prefix	+ "accl_rt_amt", length));
			String[] trspSvcOfcCd = (JSPUtil.getParameter(request, prefix	+ "trsp_svc_ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] spclBbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bb_cgo_flg", length));
			String[] n4thNodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_nod_cd", length));
			String[] n1stNodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_cd", length));
			String[] estmUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_uc_amt", length));
			String[] nodCd = (JSPUtil.getParameter(request, prefix	+ "nod_cd", length));
			String[] routTzModCd = (JSPUtil.getParameter(request, prefix	+ "rout_tz_mod_cd", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			String[] n3rdNodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_nod_cd", length));
			String[] railSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "rail_svc_tp_cd", length));
			String[] estmUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_ttl_amt", length));
			String[] fcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_hrs", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] mcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_dys", length));
			String[] spclRcFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rc_flg", length));
			String[] estmUpdFlg = (JSPUtil.getParameter(request, prefix	+ "estm_upd_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] respbUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_ttl_amt", length));
			String[] rdFlg = (JSPUtil.getParameter(request, prefix	+ "rd_flg", length));
			String[] costIoBndCd = (JSPUtil.getParameter(request, prefix	+ "cost_io_bnd_cd", length));
			String[] lgsCostCdChkFlg = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd_chk_flg", length));
			String[] n1stNodTpCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_tp_cd", length));
			String[] costAmtExtdFlg = (JSPUtil.getParameter(request, prefix	+ "cost_amt_extd_flg", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] preCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pre_cost_act_grp_cd", length));
			String[] estmTgtFlg = (JSPUtil.getParameter(request, prefix	+ "estm_tgt_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] raUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_uc_amt", length));
			String[] wtrRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_rcv_term_cd", length));
			String[] ctrtRtnFlg = (JSPUtil.getParameter(request, prefix	+ "ctrt_rtn_flg", length));
			String[] n1stVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_vndr_seq", length));
			String[] costActGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_tp_cd", length));
			String[] mcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_hrs", length));
			String[] wtrDeTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_de_term_cd", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] thrpRtFlg = (JSPUtil.getParameter(request, prefix	+ "thrp_rt_flg", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] n3rdVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3rd_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] costCateCd = (JSPUtil.getParameter(request, prefix	+ "cost_cate_cd", length));
			String[] plnUcAmt = (JSPUtil.getParameter(request, prefix	+ "pln_uc_amt", length));
			String[] actUcAmt = (JSPUtil.getParameter(request, prefix	+ "act_uc_amt", length));
			String[] fcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_dys", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_seq", length));
			String[] custNomiTrkrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_nomi_trkr_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgCostSrcDtlVO();
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (costRoutNo[i] != null)
					model.setCostRoutNo(costRoutNo[i]);
				if (n4thVndrSeq[i] != null)
					model.setN4thVndrSeq(n4thVndrSeq[i]);
				if (estmUsdUcAmt[i] != null)
					model.setEstmUsdUcAmt(estmUsdUcAmt[i]);
				if (raAcctCd[i] != null)
					model.setRaAcctCd(raAcctCd[i]);
				if (respbUsdUcAmt[i] != null)
					model.setRespbUsdUcAmt(respbUsdUcAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (actGrpTmlFlg[i] != null)
					model.setActGrpTmlFlg(actGrpTmlFlg[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (spclDgCgoFlg[i] != null)
					model.setSpclDgCgoFlg(spclDgCgoFlg[i]);
				if (aplyVndrSeq[i] != null)
					model.setAplyVndrSeq(aplyVndrSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (n2ndVndrSeq[i] != null)
					model.setN2ndVndrSeq(n2ndVndrSeq[i]);
				if (pstCostActGrpCd[i] != null)
					model.setPstCostActGrpCd(pstCostActGrpCd[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (n2ndNodCd[i] != null)
					model.setN2ndNodCd(n2ndNodCd[i]);
				if (ctrlOfcCd[i] != null)
					model.setCtrlOfcCd(ctrlOfcCd[i]);
				if (acclRtAmt[i] != null)
					model.setAcclRtAmt(acclRtAmt[i]);
				if (trspSvcOfcCd[i] != null)
					model.setTrspSvcOfcCd(trspSvcOfcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (spclBbCgoFlg[i] != null)
					model.setSpclBbCgoFlg(spclBbCgoFlg[i]);
				if (n4thNodCd[i] != null)
					model.setN4thNodCd(n4thNodCd[i]);
				if (n1stNodCd[i] != null)
					model.setN1stNodCd(n1stNodCd[i]);
				if (estmUcAmt[i] != null)
					model.setEstmUcAmt(estmUcAmt[i]);
				if (nodCd[i] != null)
					model.setNodCd(nodCd[i]);
				if (routTzModCd[i] != null)
					model.setRoutTzModCd(routTzModCd[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				if (n3rdNodCd[i] != null)
					model.setN3rdNodCd(n3rdNodCd[i]);
				if (railSvcTpCd[i] != null)
					model.setRailSvcTpCd(railSvcTpCd[i]);
				if (estmUsdTtlAmt[i] != null)
					model.setEstmUsdTtlAmt(estmUsdTtlAmt[i]);
				if (fcgoTzHrs[i] != null)
					model.setFcgoTzHrs(fcgoTzHrs[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (mcgoTzDys[i] != null)
					model.setMcgoTzDys(mcgoTzDys[i]);
				if (spclRcFlg[i] != null)
					model.setSpclRcFlg(spclRcFlg[i]);
				if (estmUpdFlg[i] != null)
					model.setEstmUpdFlg(estmUpdFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (respbUsdTtlAmt[i] != null)
					model.setRespbUsdTtlAmt(respbUsdTtlAmt[i]);
				if (rdFlg[i] != null)
					model.setRdFlg(rdFlg[i]);
				if (costIoBndCd[i] != null)
					model.setCostIoBndCd(costIoBndCd[i]);
				if (lgsCostCdChkFlg[i] != null)
					model.setLgsCostCdChkFlg(lgsCostCdChkFlg[i]);
				if (n1stNodTpCd[i] != null)
					model.setN1stNodTpCd(n1stNodTpCd[i]);
				if (costAmtExtdFlg[i] != null)
					model.setCostAmtExtdFlg(costAmtExtdFlg[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (preCostActGrpCd[i] != null)
					model.setPreCostActGrpCd(preCostActGrpCd[i]);
				if (estmTgtFlg[i] != null)
					model.setEstmTgtFlg(estmTgtFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (raUcAmt[i] != null)
					model.setRaUcAmt(raUcAmt[i]);
				if (wtrRcvTermCd[i] != null)
					model.setWtrRcvTermCd(wtrRcvTermCd[i]);
				if (ctrtRtnFlg[i] != null)
					model.setCtrtRtnFlg(ctrtRtnFlg[i]);
				if (n1stVndrSeq[i] != null)
					model.setN1stVndrSeq(n1stVndrSeq[i]);
				if (costActGrpTpCd[i] != null)
					model.setCostActGrpTpCd(costActGrpTpCd[i]);
				if (mcgoTzHrs[i] != null)
					model.setMcgoTzHrs(mcgoTzHrs[i]);
				if (wtrDeTermCd[i] != null)
					model.setWtrDeTermCd(wtrDeTermCd[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (thrpRtFlg[i] != null)
					model.setThrpRtFlg(thrpRtFlg[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (n3rdVndrSeq[i] != null)
					model.setN3rdVndrSeq(n3rdVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (costCateCd[i] != null)
					model.setCostCateCd(costCateCd[i]);
				if (plnUcAmt[i] != null)
					model.setPlnUcAmt(plnUcAmt[i]);
				if (actUcAmt[i] != null)
					model.setActUcAmt(actUcAmt[i]);
				if (fcgoTzDys[i] != null)
					model.setFcgoTzDys(fcgoTzDys[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (custNomiTrkrFlg[i] != null)
					model.setCustNomiTrkrFlg(custNomiTrkrFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgCostSrcDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgCostSrcDtlVO[]
	 */
	public CoaBkgCostSrcDtlVO[] getCoaBkgCostSrcDtlVOs(){
		CoaBkgCostSrcDtlVO[] vos = (CoaBkgCostSrcDtlVO[])models.toArray(new CoaBkgCostSrcDtlVO[models.size()]);
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
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costRoutNo = this.costRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thVndrSeq = this.n4thVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdUcAmt = this.estmUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdUcAmt = this.respbUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actGrpTmlFlg = this.actGrpTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclDgCgoFlg = this.spclDgCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyVndrSeq = this.aplyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVndrSeq = this.n2ndVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstCostActGrpCd = this.pstCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNodCd = this.n2ndNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlOfcCd = this.ctrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclRtAmt = this.acclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSvcOfcCd = this.trspSvcOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBbCgoFlg = this.spclBbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNodCd = this.n4thNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodCd = this.n1stNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUcAmt = this.estmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodCd = this.nodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routTzModCd = this.routTzModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNodCd = this.n3rdNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railSvcTpCd = this.railSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdTtlAmt = this.estmUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzHrs = this.fcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzDys = this.mcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRcFlg = this.spclRcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUpdFlg = this.estmUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdTtlAmt = this.respbUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdFlg = this.rdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIoBndCd = this.costIoBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCdChkFlg = this.lgsCostCdChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodTpCd = this.n1stNodTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAmtExtdFlg = this.costAmtExtdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCostActGrpCd = this.preCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmTgtFlg = this.estmTgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raUcAmt = this.raUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrRcvTermCd = this.wtrRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRtnFlg = this.ctrtRtnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrSeq = this.n1stVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpTpCd = this.costActGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzHrs = this.mcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrDeTermCd = this.wtrDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpRtFlg = this.thrpRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVndrSeq = this.n3rdVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCateCd = this.costCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnUcAmt = this.plnUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actUcAmt = this.actUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzDys = this.fcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNomiTrkrFlg = this.custNomiTrkrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
