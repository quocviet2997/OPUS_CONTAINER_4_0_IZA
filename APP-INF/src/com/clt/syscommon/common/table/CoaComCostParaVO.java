/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaComCostParaVO.java
*@FileTitle : CoaComCostParaVO
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

public class CoaComCostParaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaComCostParaVO> models = new ArrayList<CoaComCostParaVO>();
	
	/* Column Info */
	private String lgsCostAutoCdFlg = null;
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
	private String pctlNo = null;
	/* Column Info */
	private String costSrcSysCd = null;
	/* Column Info */
	private String n1stAgmtRefNo = null;
	/* Column Info */
	private String actGrpTmlFlg = null;
	/* Column Info */
	private String n3rdRailCrrTpCd = null;
	/* Column Info */
	private String n1stRailCrrTpCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String n1stEstmDt = null;
	/* Column Info */
	private String n3rdTrspAgmtOfcCtyCd = null;
	/* Column Info */
	private String aplyVndrSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String paraFmSccCd = null;
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
	private String n3rdDistUtCd = null;
	/* Column Info */
	private String trspSvcOfcCd = null;
	/* Column Info */
	private String pstNodCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String n4thNodCd = null;
	/* Column Info */
	private String n1stNodCd = null;
	/* Column Info */
	private String estmUcAmt = null;
	/* Column Info */
	private String routTzModCd = null;
	/* Column Info */
	private String costCalcRmk = null;
	/* Column Info */
	private String n3rdNodCd = null;
	/* Column Info */
	private String n3rdAgmtRefNo = null;
	/* Column Info */
	private String paraToEccCd = null;
	/* Column Info */
	private String paraFmEccCd = null;
	/* Column Info */
	private String railSvcTpCd = null;
	/* Column Info */
	private String estmUsdTtlAmt = null;
	/* Column Info */
	private String fcgoTzHrs = null;
	/* Column Info */
	private String pstLnkVndrSeq = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String mcgoTzDys = null;
	/* Column Info */
	private String preNodCd = null;
	/* Column Info */
	private String preLnkVndrSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String respbUsdTtlAmt = null;
	/* Column Info */
	private String costIoBndCd = null;
	/* Column Info */
	private String lgsCostCdChkFlg = null;
	/* Column Info */
	private String n1stNodTpCd = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String preCostActGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String inlndRoutInclSttlFlg = null;
	/* Column Info */
	private String wtrRcvTermCd = null;
	/* Column Info */
	private String ctrtRtnFlg = null;
	/* Column Info */
	private String n1stVndrSeq = null;
	/* Column Info */
	private String costActGrpTpCd = null;
	/* Column Info */
	private String n3rdPolPodDist = null;
	/* Column Info */
	private String mcgoTzHrs = null;
	/* Column Info */
	private String wtrDeTermCd = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String n2ndTrspAgmtOfcCtyCd = null;
	/* Column Info */
	private String thrpRtFlg = null;
	/* Column Info */
	private String n2ndPolPodDist = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String n3rdVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n2ndAgmtRefNo = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String n1stDistUtCd = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String costCateCd = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String n3rdTrspAgmtSeq = null;
	/* Column Info */
	private String n2ndRailCrrTpCd = null;
	/* Column Info */
	private String costAsgnCalcFlg = null;
	/* Column Info */
	private String costUtAmtCd = null;
	/* Column Info */
	private String respbUcAmt = null;
	/* Column Info */
	private String fcgoTzDys = null;
	/* Column Info */
	private String n2ndTrspAgmtSeq = null;
	/* Column Info */
	private String n1stTrspAgmtOfcCtyCd = null;
	/* Column Info */
	private String sccCd = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String n1stPolPodDist = null;
	/* Column Info */
	private String paraToSccCd = null;
	/* Column Info */
	private String n1stTrspAgmtSeq = null;
	/* Column Info */
	private String n2ndDistUtCd = null;
	/* Column Info */
	private String custNomiTrkrFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaComCostParaVO() {}

	public CoaComCostParaVO(String ibflag, String pagerows, String pctlNo, String costActGrpSeq, String cntrTpszCd, String coaCostSrcCd, String stndCostCd, String raAcctCd, String costUtAmtCd, String costSrcSysCd, String costAssBseCd, String railSvcTpCd, String costActGrpCd, String costActGrpTpCd, String vslSlanCd, String ctrlOfcCd, String costOfcCd, String costIoBndCd, String n1stNodCd, String n1stNodTpCd, String n1stEstmDt, String n2ndNodCd, String n3rdNodCd, String n4thNodCd, String routTzModCd, String n1stPolPodDist, String n1stDistUtCd, String n2ndPolPodDist, String n2ndDistUtCd, String n3rdPolPodDist, String n3rdDistUtCd, String n1stVndrSeq, String n2ndVndrSeq, String n3rdVndrSeq, String n4thVndrSeq, String custNomiTrkrFlg, String preNodCd, String pstNodCd, String preLnkVndrSeq, String pstLnkVndrSeq, String fcgoTzDys, String fcgoTzHrs, String mcgoTzDys, String mcgoTzHrs, String cntrQty, String costCateCd, String estmUcAmt, String respbUcAmt, String loclCurrCd, String trspSvcOfcCd, String costAsgnCalcFlg, String lgsCostCdChkFlg, String thrpRtFlg, String actGrpTmlFlg, String lgsCostAutoCdFlg, String iocCd, String preCostActGrpCd, String pstCostActGrpCd, String ctrtRtnFlg, String aplyVndrSeq, String sccCd, String eccCd, String paraFmSccCd, String paraToSccCd, String paraFmEccCd, String paraToEccCd, String n1stRailCrrTpCd, String n2ndRailCrrTpCd, String n3rdRailCrrTpCd, String estmUsdUcAmt, String respbUsdUcAmt, String estmUsdTtlAmt, String respbUsdTtlAmt, String wtrDeTermCd, String wtrRcvTermCd, String inlndRoutInclSttlFlg, String n1stTrspAgmtSeq, String n2ndTrspAgmtSeq, String n3rdTrspAgmtSeq, String n1stTrspAgmtOfcCtyCd, String n1stAgmtRefNo, String n2ndTrspAgmtOfcCtyCd, String n2ndAgmtRefNo, String n3rdTrspAgmtOfcCtyCd, String n3rdAgmtRefNo, String creUsrId, String creDt, String updUsrId, String updDt, String costCalcRmk) {
		this.lgsCostAutoCdFlg = lgsCostAutoCdFlg;
		this.n4thVndrSeq = n4thVndrSeq;
		this.estmUsdUcAmt = estmUsdUcAmt;
		this.raAcctCd = raAcctCd;
		this.respbUsdUcAmt = respbUsdUcAmt;
		this.pagerows = pagerows;
		this.pctlNo = pctlNo;
		this.costSrcSysCd = costSrcSysCd;
		this.n1stAgmtRefNo = n1stAgmtRefNo;
		this.actGrpTmlFlg = actGrpTmlFlg;
		this.n3rdRailCrrTpCd = n3rdRailCrrTpCd;
		this.n1stRailCrrTpCd = n1stRailCrrTpCd;
		this.cntrTpszCd = cntrTpszCd;
		this.n1stEstmDt = n1stEstmDt;
		this.n3rdTrspAgmtOfcCtyCd = n3rdTrspAgmtOfcCtyCd;
		this.aplyVndrSeq = aplyVndrSeq;
		this.updUsrId = updUsrId;
		this.paraFmSccCd = paraFmSccCd;
		this.n2ndVndrSeq = n2ndVndrSeq;
		this.pstCostActGrpCd = pstCostActGrpCd;
		this.loclCurrCd = loclCurrCd;
		this.n2ndNodCd = n2ndNodCd;
		this.ctrlOfcCd = ctrlOfcCd;
		this.n3rdDistUtCd = n3rdDistUtCd;
		this.trspSvcOfcCd = trspSvcOfcCd;
		this.pstNodCd = pstNodCd;
		this.creUsrId = creUsrId;
		this.costActGrpCd = costActGrpCd;
		this.n4thNodCd = n4thNodCd;
		this.n1stNodCd = n1stNodCd;
		this.estmUcAmt = estmUcAmt;
		this.routTzModCd = routTzModCd;
		this.costCalcRmk = costCalcRmk;
		this.n3rdNodCd = n3rdNodCd;
		this.n3rdAgmtRefNo = n3rdAgmtRefNo;
		this.paraToEccCd = paraToEccCd;
		this.paraFmEccCd = paraFmEccCd;
		this.railSvcTpCd = railSvcTpCd;
		this.estmUsdTtlAmt = estmUsdTtlAmt;
		this.fcgoTzHrs = fcgoTzHrs;
		this.pstLnkVndrSeq = pstLnkVndrSeq;
		this.coaCostSrcCd = coaCostSrcCd;
		this.mcgoTzDys = mcgoTzDys;
		this.preNodCd = preNodCd;
		this.preLnkVndrSeq = preLnkVndrSeq;
		this.creDt = creDt;
		this.respbUsdTtlAmt = respbUsdTtlAmt;
		this.costIoBndCd = costIoBndCd;
		this.lgsCostCdChkFlg = lgsCostCdChkFlg;
		this.n1stNodTpCd = n1stNodTpCd;
		this.vslSlanCd = vslSlanCd;
		this.preCostActGrpCd = preCostActGrpCd;
		this.ibflag = ibflag;
		this.inlndRoutInclSttlFlg = inlndRoutInclSttlFlg;
		this.wtrRcvTermCd = wtrRcvTermCd;
		this.ctrtRtnFlg = ctrtRtnFlg;
		this.n1stVndrSeq = n1stVndrSeq;
		this.costActGrpTpCd = costActGrpTpCd;
		this.n3rdPolPodDist = n3rdPolPodDist;
		this.mcgoTzHrs = mcgoTzHrs;
		this.wtrDeTermCd = wtrDeTermCd;
		this.cntrQty = cntrQty;
		this.n2ndTrspAgmtOfcCtyCd = n2ndTrspAgmtOfcCtyCd;
		this.thrpRtFlg = thrpRtFlg;
		this.n2ndPolPodDist = n2ndPolPodDist;
		this.stndCostCd = stndCostCd;
		this.n3rdVndrSeq = n3rdVndrSeq;
		this.updDt = updDt;
		this.n2ndAgmtRefNo = n2ndAgmtRefNo;
		this.iocCd = iocCd;
		this.n1stDistUtCd = n1stDistUtCd;
		this.costAssBseCd = costAssBseCd;
		this.costOfcCd = costOfcCd;
		this.costCateCd = costCateCd;
		this.eccCd = eccCd;
		this.n3rdTrspAgmtSeq = n3rdTrspAgmtSeq;
		this.n2ndRailCrrTpCd = n2ndRailCrrTpCd;
		this.costAsgnCalcFlg = costAsgnCalcFlg;
		this.costUtAmtCd = costUtAmtCd;
		this.respbUcAmt = respbUcAmt;
		this.fcgoTzDys = fcgoTzDys;
		this.n2ndTrspAgmtSeq = n2ndTrspAgmtSeq;
		this.n1stTrspAgmtOfcCtyCd = n1stTrspAgmtOfcCtyCd;
		this.sccCd = sccCd;
		this.costActGrpSeq = costActGrpSeq;
		this.n1stPolPodDist = n1stPolPodDist;
		this.paraToSccCd = paraToSccCd;
		this.n1stTrspAgmtSeq = n1stTrspAgmtSeq;
		this.n2ndDistUtCd = n2ndDistUtCd;
		this.custNomiTrkrFlg = custNomiTrkrFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lgs_cost_auto_cd_flg", getLgsCostAutoCdFlg());
		this.hashColumns.put("n4th_vndr_seq", getN4thVndrSeq());
		this.hashColumns.put("estm_usd_uc_amt", getEstmUsdUcAmt());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("respb_usd_uc_amt", getRespbUsdUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("cost_src_sys_cd", getCostSrcSysCd());
		this.hashColumns.put("n1st_agmt_ref_no", getN1stAgmtRefNo());
		this.hashColumns.put("act_grp_tml_flg", getActGrpTmlFlg());
		this.hashColumns.put("n3rd_rail_crr_tp_cd", getN3rdRailCrrTpCd());
		this.hashColumns.put("n1st_rail_crr_tp_cd", getN1stRailCrrTpCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("n1st_estm_dt", getN1stEstmDt());
		this.hashColumns.put("n3rd_trsp_agmt_ofc_cty_cd", getN3rdTrspAgmtOfcCtyCd());
		this.hashColumns.put("aply_vndr_seq", getAplyVndrSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("para_fm_scc_cd", getParaFmSccCd());
		this.hashColumns.put("n2nd_vndr_seq", getN2ndVndrSeq());
		this.hashColumns.put("pst_cost_act_grp_cd", getPstCostActGrpCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("n2nd_nod_cd", getN2ndNodCd());
		this.hashColumns.put("ctrl_ofc_cd", getCtrlOfcCd());
		this.hashColumns.put("n3rd_dist_ut_cd", getN3rdDistUtCd());
		this.hashColumns.put("trsp_svc_ofc_cd", getTrspSvcOfcCd());
		this.hashColumns.put("pst_nod_cd", getPstNodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("n4th_nod_cd", getN4thNodCd());
		this.hashColumns.put("n1st_nod_cd", getN1stNodCd());
		this.hashColumns.put("estm_uc_amt", getEstmUcAmt());
		this.hashColumns.put("rout_tz_mod_cd", getRoutTzModCd());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
		this.hashColumns.put("n3rd_nod_cd", getN3rdNodCd());
		this.hashColumns.put("n3rd_agmt_ref_no", getN3rdAgmtRefNo());
		this.hashColumns.put("para_to_ecc_cd", getParaToEccCd());
		this.hashColumns.put("para_fm_ecc_cd", getParaFmEccCd());
		this.hashColumns.put("rail_svc_tp_cd", getRailSvcTpCd());
		this.hashColumns.put("estm_usd_ttl_amt", getEstmUsdTtlAmt());
		this.hashColumns.put("fcgo_tz_hrs", getFcgoTzHrs());
		this.hashColumns.put("pst_lnk_vndr_seq", getPstLnkVndrSeq());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("mcgo_tz_dys", getMcgoTzDys());
		this.hashColumns.put("pre_nod_cd", getPreNodCd());
		this.hashColumns.put("pre_lnk_vndr_seq", getPreLnkVndrSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("respb_usd_ttl_amt", getRespbUsdTtlAmt());
		this.hashColumns.put("cost_io_bnd_cd", getCostIoBndCd());
		this.hashColumns.put("lgs_cost_cd_chk_flg", getLgsCostCdChkFlg());
		this.hashColumns.put("n1st_nod_tp_cd", getN1stNodTpCd());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pre_cost_act_grp_cd", getPreCostActGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inlnd_rout_incl_sttl_flg", getInlndRoutInclSttlFlg());
		this.hashColumns.put("wtr_rcv_term_cd", getWtrRcvTermCd());
		this.hashColumns.put("ctrt_rtn_flg", getCtrtRtnFlg());
		this.hashColumns.put("n1st_vndr_seq", getN1stVndrSeq());
		this.hashColumns.put("cost_act_grp_tp_cd", getCostActGrpTpCd());
		this.hashColumns.put("n3rd_pol_pod_dist", getN3rdPolPodDist());
		this.hashColumns.put("mcgo_tz_hrs", getMcgoTzHrs());
		this.hashColumns.put("wtr_de_term_cd", getWtrDeTermCd());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("n2nd_trsp_agmt_ofc_cty_cd", getN2ndTrspAgmtOfcCtyCd());
		this.hashColumns.put("thrp_rt_flg", getThrpRtFlg());
		this.hashColumns.put("n2nd_pol_pod_dist", getN2ndPolPodDist());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("n3rd_vndr_seq", getN3rdVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n2nd_agmt_ref_no", getN2ndAgmtRefNo());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("n1st_dist_ut_cd", getN1stDistUtCd());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("cost_cate_cd", getCostCateCd());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("n3rd_trsp_agmt_seq", getN3rdTrspAgmtSeq());
		this.hashColumns.put("n2nd_rail_crr_tp_cd", getN2ndRailCrrTpCd());
		this.hashColumns.put("cost_asgn_calc_flg", getCostAsgnCalcFlg());
		this.hashColumns.put("cost_ut_amt_cd", getCostUtAmtCd());
		this.hashColumns.put("respb_uc_amt", getRespbUcAmt());
		this.hashColumns.put("fcgo_tz_dys", getFcgoTzDys());
		this.hashColumns.put("n2nd_trsp_agmt_seq", getN2ndTrspAgmtSeq());
		this.hashColumns.put("n1st_trsp_agmt_ofc_cty_cd", getN1stTrspAgmtOfcCtyCd());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("n1st_pol_pod_dist", getN1stPolPodDist());
		this.hashColumns.put("para_to_scc_cd", getParaToSccCd());
		this.hashColumns.put("n1st_trsp_agmt_seq", getN1stTrspAgmtSeq());
		this.hashColumns.put("n2nd_dist_ut_cd", getN2ndDistUtCd());
		this.hashColumns.put("cust_nomi_trkr_flg", getCustNomiTrkrFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lgs_cost_auto_cd_flg", "lgsCostAutoCdFlg");
		this.hashFields.put("n4th_vndr_seq", "n4thVndrSeq");
		this.hashFields.put("estm_usd_uc_amt", "estmUsdUcAmt");
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("respb_usd_uc_amt", "respbUsdUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("cost_src_sys_cd", "costSrcSysCd");
		this.hashFields.put("n1st_agmt_ref_no", "n1stAgmtRefNo");
		this.hashFields.put("act_grp_tml_flg", "actGrpTmlFlg");
		this.hashFields.put("n3rd_rail_crr_tp_cd", "n3rdRailCrrTpCd");
		this.hashFields.put("n1st_rail_crr_tp_cd", "n1stRailCrrTpCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("n1st_estm_dt", "n1stEstmDt");
		this.hashFields.put("n3rd_trsp_agmt_ofc_cty_cd", "n3rdTrspAgmtOfcCtyCd");
		this.hashFields.put("aply_vndr_seq", "aplyVndrSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("para_fm_scc_cd", "paraFmSccCd");
		this.hashFields.put("n2nd_vndr_seq", "n2ndVndrSeq");
		this.hashFields.put("pst_cost_act_grp_cd", "pstCostActGrpCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("n2nd_nod_cd", "n2ndNodCd");
		this.hashFields.put("ctrl_ofc_cd", "ctrlOfcCd");
		this.hashFields.put("n3rd_dist_ut_cd", "n3rdDistUtCd");
		this.hashFields.put("trsp_svc_ofc_cd", "trspSvcOfcCd");
		this.hashFields.put("pst_nod_cd", "pstNodCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("n4th_nod_cd", "n4thNodCd");
		this.hashFields.put("n1st_nod_cd", "n1stNodCd");
		this.hashFields.put("estm_uc_amt", "estmUcAmt");
		this.hashFields.put("rout_tz_mod_cd", "routTzModCd");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
		this.hashFields.put("n3rd_nod_cd", "n3rdNodCd");
		this.hashFields.put("n3rd_agmt_ref_no", "n3rdAgmtRefNo");
		this.hashFields.put("para_to_ecc_cd", "paraToEccCd");
		this.hashFields.put("para_fm_ecc_cd", "paraFmEccCd");
		this.hashFields.put("rail_svc_tp_cd", "railSvcTpCd");
		this.hashFields.put("estm_usd_ttl_amt", "estmUsdTtlAmt");
		this.hashFields.put("fcgo_tz_hrs", "fcgoTzHrs");
		this.hashFields.put("pst_lnk_vndr_seq", "pstLnkVndrSeq");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("mcgo_tz_dys", "mcgoTzDys");
		this.hashFields.put("pre_nod_cd", "preNodCd");
		this.hashFields.put("pre_lnk_vndr_seq", "preLnkVndrSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("respb_usd_ttl_amt", "respbUsdTtlAmt");
		this.hashFields.put("cost_io_bnd_cd", "costIoBndCd");
		this.hashFields.put("lgs_cost_cd_chk_flg", "lgsCostCdChkFlg");
		this.hashFields.put("n1st_nod_tp_cd", "n1stNodTpCd");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pre_cost_act_grp_cd", "preCostActGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inlnd_rout_incl_sttl_flg", "inlndRoutInclSttlFlg");
		this.hashFields.put("wtr_rcv_term_cd", "wtrRcvTermCd");
		this.hashFields.put("ctrt_rtn_flg", "ctrtRtnFlg");
		this.hashFields.put("n1st_vndr_seq", "n1stVndrSeq");
		this.hashFields.put("cost_act_grp_tp_cd", "costActGrpTpCd");
		this.hashFields.put("n3rd_pol_pod_dist", "n3rdPolPodDist");
		this.hashFields.put("mcgo_tz_hrs", "mcgoTzHrs");
		this.hashFields.put("wtr_de_term_cd", "wtrDeTermCd");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("n2nd_trsp_agmt_ofc_cty_cd", "n2ndTrspAgmtOfcCtyCd");
		this.hashFields.put("thrp_rt_flg", "thrpRtFlg");
		this.hashFields.put("n2nd_pol_pod_dist", "n2ndPolPodDist");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("n3rd_vndr_seq", "n3rdVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n2nd_agmt_ref_no", "n2ndAgmtRefNo");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("n1st_dist_ut_cd", "n1stDistUtCd");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("cost_cate_cd", "costCateCd");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("n3rd_trsp_agmt_seq", "n3rdTrspAgmtSeq");
		this.hashFields.put("n2nd_rail_crr_tp_cd", "n2ndRailCrrTpCd");
		this.hashFields.put("cost_asgn_calc_flg", "costAsgnCalcFlg");
		this.hashFields.put("cost_ut_amt_cd", "costUtAmtCd");
		this.hashFields.put("respb_uc_amt", "respbUcAmt");
		this.hashFields.put("fcgo_tz_dys", "fcgoTzDys");
		this.hashFields.put("n2nd_trsp_agmt_seq", "n2ndTrspAgmtSeq");
		this.hashFields.put("n1st_trsp_agmt_ofc_cty_cd", "n1stTrspAgmtOfcCtyCd");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("n1st_pol_pod_dist", "n1stPolPodDist");
		this.hashFields.put("para_to_scc_cd", "paraToSccCd");
		this.hashFields.put("n1st_trsp_agmt_seq", "n1stTrspAgmtSeq");
		this.hashFields.put("n2nd_dist_ut_cd", "n2ndDistUtCd");
		this.hashFields.put("cust_nomi_trkr_flg", "custNomiTrkrFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return lgsCostAutoCdFlg
	 */
	public String getLgsCostAutoCdFlg() {
		return this.lgsCostAutoCdFlg;
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
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
	}
	
	/**
	 * Column Info
	 * @return costSrcSysCd
	 */
	public String getCostSrcSysCd() {
		return this.costSrcSysCd;
	}
	
	/**
	 * Column Info
	 * @return n1stAgmtRefNo
	 */
	public String getN1stAgmtRefNo() {
		return this.n1stAgmtRefNo;
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
	 * @return n3rdRailCrrTpCd
	 */
	public String getN3rdRailCrrTpCd() {
		return this.n3rdRailCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @return n1stRailCrrTpCd
	 */
	public String getN1stRailCrrTpCd() {
		return this.n1stRailCrrTpCd;
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
	 * @return n1stEstmDt
	 */
	public String getN1stEstmDt() {
		return this.n1stEstmDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdTrspAgmtOfcCtyCd
	 */
	public String getN3rdTrspAgmtOfcCtyCd() {
		return this.n3rdTrspAgmtOfcCtyCd;
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
	 * @return paraFmSccCd
	 */
	public String getParaFmSccCd() {
		return this.paraFmSccCd;
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
	 * @return n3rdDistUtCd
	 */
	public String getN3rdDistUtCd() {
		return this.n3rdDistUtCd;
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
	 * @return pstNodCd
	 */
	public String getPstNodCd() {
		return this.pstNodCd;
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
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return n3rdAgmtRefNo
	 */
	public String getN3rdAgmtRefNo() {
		return this.n3rdAgmtRefNo;
	}
	
	/**
	 * Column Info
	 * @return paraToEccCd
	 */
	public String getParaToEccCd() {
		return this.paraToEccCd;
	}
	
	/**
	 * Column Info
	 * @return paraFmEccCd
	 */
	public String getParaFmEccCd() {
		return this.paraFmEccCd;
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
	 * @return pstLnkVndrSeq
	 */
	public String getPstLnkVndrSeq() {
		return this.pstLnkVndrSeq;
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
	 * @return preNodCd
	 */
	public String getPreNodCd() {
		return this.preNodCd;
	}
	
	/**
	 * Column Info
	 * @return preLnkVndrSeq
	 */
	public String getPreLnkVndrSeq() {
		return this.preLnkVndrSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return inlndRoutInclSttlFlg
	 */
	public String getInlndRoutInclSttlFlg() {
		return this.inlndRoutInclSttlFlg;
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
	 * @return n3rdPolPodDist
	 */
	public String getN3rdPolPodDist() {
		return this.n3rdPolPodDist;
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
	 * @return n2ndTrspAgmtOfcCtyCd
	 */
	public String getN2ndTrspAgmtOfcCtyCd() {
		return this.n2ndTrspAgmtOfcCtyCd;
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
	 * @return n2ndPolPodDist
	 */
	public String getN2ndPolPodDist() {
		return this.n2ndPolPodDist;
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
	 * @return n2ndAgmtRefNo
	 */
	public String getN2ndAgmtRefNo() {
		return this.n2ndAgmtRefNo;
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
	 * @return n1stDistUtCd
	 */
	public String getN1stDistUtCd() {
		return this.n1stDistUtCd;
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
	 * @return costOfcCd
	 */
	public String getCostOfcCd() {
		return this.costOfcCd;
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
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdTrspAgmtSeq
	 */
	public String getN3rdTrspAgmtSeq() {
		return this.n3rdTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return n2ndRailCrrTpCd
	 */
	public String getN2ndRailCrrTpCd() {
		return this.n2ndRailCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @return costAsgnCalcFlg
	 */
	public String getCostAsgnCalcFlg() {
		return this.costAsgnCalcFlg;
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
	 * @return respbUcAmt
	 */
	public String getRespbUcAmt() {
		return this.respbUcAmt;
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
	 * @return n2ndTrspAgmtSeq
	 */
	public String getN2ndTrspAgmtSeq() {
		return this.n2ndTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return n1stTrspAgmtOfcCtyCd
	 */
	public String getN1stTrspAgmtOfcCtyCd() {
		return this.n1stTrspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return sccCd
	 */
	public String getSccCd() {
		return this.sccCd;
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
	 * @return n1stPolPodDist
	 */
	public String getN1stPolPodDist() {
		return this.n1stPolPodDist;
	}
	
	/**
	 * Column Info
	 * @return paraToSccCd
	 */
	public String getParaToSccCd() {
		return this.paraToSccCd;
	}
	
	/**
	 * Column Info
	 * @return n1stTrspAgmtSeq
	 */
	public String getN1stTrspAgmtSeq() {
		return this.n1stTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return n2ndDistUtCd
	 */
	public String getN2ndDistUtCd() {
		return this.n2ndDistUtCd;
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
	 * @param lgsCostAutoCdFlg
	 */
	public void setLgsCostAutoCdFlg(String lgsCostAutoCdFlg) {
		this.lgsCostAutoCdFlg = lgsCostAutoCdFlg;
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
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
	}
	
	/**
	 * Column Info
	 * @param costSrcSysCd
	 */
	public void setCostSrcSysCd(String costSrcSysCd) {
		this.costSrcSysCd = costSrcSysCd;
	}
	
	/**
	 * Column Info
	 * @param n1stAgmtRefNo
	 */
	public void setN1stAgmtRefNo(String n1stAgmtRefNo) {
		this.n1stAgmtRefNo = n1stAgmtRefNo;
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
	 * @param n3rdRailCrrTpCd
	 */
	public void setN3rdRailCrrTpCd(String n3rdRailCrrTpCd) {
		this.n3rdRailCrrTpCd = n3rdRailCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @param n1stRailCrrTpCd
	 */
	public void setN1stRailCrrTpCd(String n1stRailCrrTpCd) {
		this.n1stRailCrrTpCd = n1stRailCrrTpCd;
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
	 * @param n1stEstmDt
	 */
	public void setN1stEstmDt(String n1stEstmDt) {
		this.n1stEstmDt = n1stEstmDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdTrspAgmtOfcCtyCd
	 */
	public void setN3rdTrspAgmtOfcCtyCd(String n3rdTrspAgmtOfcCtyCd) {
		this.n3rdTrspAgmtOfcCtyCd = n3rdTrspAgmtOfcCtyCd;
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
	 * @param paraFmSccCd
	 */
	public void setParaFmSccCd(String paraFmSccCd) {
		this.paraFmSccCd = paraFmSccCd;
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
	 * @param n3rdDistUtCd
	 */
	public void setN3rdDistUtCd(String n3rdDistUtCd) {
		this.n3rdDistUtCd = n3rdDistUtCd;
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
	 * @param pstNodCd
	 */
	public void setPstNodCd(String pstNodCd) {
		this.pstNodCd = pstNodCd;
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
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param n3rdAgmtRefNo
	 */
	public void setN3rdAgmtRefNo(String n3rdAgmtRefNo) {
		this.n3rdAgmtRefNo = n3rdAgmtRefNo;
	}
	
	/**
	 * Column Info
	 * @param paraToEccCd
	 */
	public void setParaToEccCd(String paraToEccCd) {
		this.paraToEccCd = paraToEccCd;
	}
	
	/**
	 * Column Info
	 * @param paraFmEccCd
	 */
	public void setParaFmEccCd(String paraFmEccCd) {
		this.paraFmEccCd = paraFmEccCd;
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
	 * @param pstLnkVndrSeq
	 */
	public void setPstLnkVndrSeq(String pstLnkVndrSeq) {
		this.pstLnkVndrSeq = pstLnkVndrSeq;
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
	 * @param preNodCd
	 */
	public void setPreNodCd(String preNodCd) {
		this.preNodCd = preNodCd;
	}
	
	/**
	 * Column Info
	 * @param preLnkVndrSeq
	 */
	public void setPreLnkVndrSeq(String preLnkVndrSeq) {
		this.preLnkVndrSeq = preLnkVndrSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param inlndRoutInclSttlFlg
	 */
	public void setInlndRoutInclSttlFlg(String inlndRoutInclSttlFlg) {
		this.inlndRoutInclSttlFlg = inlndRoutInclSttlFlg;
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
	 * @param n3rdPolPodDist
	 */
	public void setN3rdPolPodDist(String n3rdPolPodDist) {
		this.n3rdPolPodDist = n3rdPolPodDist;
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
	 * @param n2ndTrspAgmtOfcCtyCd
	 */
	public void setN2ndTrspAgmtOfcCtyCd(String n2ndTrspAgmtOfcCtyCd) {
		this.n2ndTrspAgmtOfcCtyCd = n2ndTrspAgmtOfcCtyCd;
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
	 * @param n2ndPolPodDist
	 */
	public void setN2ndPolPodDist(String n2ndPolPodDist) {
		this.n2ndPolPodDist = n2ndPolPodDist;
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
	 * @param n2ndAgmtRefNo
	 */
	public void setN2ndAgmtRefNo(String n2ndAgmtRefNo) {
		this.n2ndAgmtRefNo = n2ndAgmtRefNo;
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
	 * @param n1stDistUtCd
	 */
	public void setN1stDistUtCd(String n1stDistUtCd) {
		this.n1stDistUtCd = n1stDistUtCd;
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
	 * @param costOfcCd
	 */
	public void setCostOfcCd(String costOfcCd) {
		this.costOfcCd = costOfcCd;
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
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdTrspAgmtSeq
	 */
	public void setN3rdTrspAgmtSeq(String n3rdTrspAgmtSeq) {
		this.n3rdTrspAgmtSeq = n3rdTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param n2ndRailCrrTpCd
	 */
	public void setN2ndRailCrrTpCd(String n2ndRailCrrTpCd) {
		this.n2ndRailCrrTpCd = n2ndRailCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @param costAsgnCalcFlg
	 */
	public void setCostAsgnCalcFlg(String costAsgnCalcFlg) {
		this.costAsgnCalcFlg = costAsgnCalcFlg;
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
	 * @param respbUcAmt
	 */
	public void setRespbUcAmt(String respbUcAmt) {
		this.respbUcAmt = respbUcAmt;
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
	 * @param n2ndTrspAgmtSeq
	 */
	public void setN2ndTrspAgmtSeq(String n2ndTrspAgmtSeq) {
		this.n2ndTrspAgmtSeq = n2ndTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param n1stTrspAgmtOfcCtyCd
	 */
	public void setN1stTrspAgmtOfcCtyCd(String n1stTrspAgmtOfcCtyCd) {
		this.n1stTrspAgmtOfcCtyCd = n1stTrspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param sccCd
	 */
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
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
	 * @param n1stPolPodDist
	 */
	public void setN1stPolPodDist(String n1stPolPodDist) {
		this.n1stPolPodDist = n1stPolPodDist;
	}
	
	/**
	 * Column Info
	 * @param paraToSccCd
	 */
	public void setParaToSccCd(String paraToSccCd) {
		this.paraToSccCd = paraToSccCd;
	}
	
	/**
	 * Column Info
	 * @param n1stTrspAgmtSeq
	 */
	public void setN1stTrspAgmtSeq(String n1stTrspAgmtSeq) {
		this.n1stTrspAgmtSeq = n1stTrspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param n2ndDistUtCd
	 */
	public void setN2ndDistUtCd(String n2ndDistUtCd) {
		this.n2ndDistUtCd = n2ndDistUtCd;
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
		setLgsCostAutoCdFlg(JSPUtil.getParameter(request, "lgs_cost_auto_cd_flg", ""));
		setN4thVndrSeq(JSPUtil.getParameter(request, "n4th_vndr_seq", ""));
		setEstmUsdUcAmt(JSPUtil.getParameter(request, "estm_usd_uc_amt", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setRespbUsdUcAmt(JSPUtil.getParameter(request, "respb_usd_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setCostSrcSysCd(JSPUtil.getParameter(request, "cost_src_sys_cd", ""));
		setN1stAgmtRefNo(JSPUtil.getParameter(request, "n1st_agmt_ref_no", ""));
		setActGrpTmlFlg(JSPUtil.getParameter(request, "act_grp_tml_flg", ""));
		setN3rdRailCrrTpCd(JSPUtil.getParameter(request, "n3rd_rail_crr_tp_cd", ""));
		setN1stRailCrrTpCd(JSPUtil.getParameter(request, "n1st_rail_crr_tp_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setN1stEstmDt(JSPUtil.getParameter(request, "n1st_estm_dt", ""));
		setN3rdTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, "n3rd_trsp_agmt_ofc_cty_cd", ""));
		setAplyVndrSeq(JSPUtil.getParameter(request, "aply_vndr_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setParaFmSccCd(JSPUtil.getParameter(request, "para_fm_scc_cd", ""));
		setN2ndVndrSeq(JSPUtil.getParameter(request, "n2nd_vndr_seq", ""));
		setPstCostActGrpCd(JSPUtil.getParameter(request, "pst_cost_act_grp_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setN2ndNodCd(JSPUtil.getParameter(request, "n2nd_nod_cd", ""));
		setCtrlOfcCd(JSPUtil.getParameter(request, "ctrl_ofc_cd", ""));
		setN3rdDistUtCd(JSPUtil.getParameter(request, "n3rd_dist_ut_cd", ""));
		setTrspSvcOfcCd(JSPUtil.getParameter(request, "trsp_svc_ofc_cd", ""));
		setPstNodCd(JSPUtil.getParameter(request, "pst_nod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setN4thNodCd(JSPUtil.getParameter(request, "n4th_nod_cd", ""));
		setN1stNodCd(JSPUtil.getParameter(request, "n1st_nod_cd", ""));
		setEstmUcAmt(JSPUtil.getParameter(request, "estm_uc_amt", ""));
		setRoutTzModCd(JSPUtil.getParameter(request, "rout_tz_mod_cd", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
		setN3rdNodCd(JSPUtil.getParameter(request, "n3rd_nod_cd", ""));
		setN3rdAgmtRefNo(JSPUtil.getParameter(request, "n3rd_agmt_ref_no", ""));
		setParaToEccCd(JSPUtil.getParameter(request, "para_to_ecc_cd", ""));
		setParaFmEccCd(JSPUtil.getParameter(request, "para_fm_ecc_cd", ""));
		setRailSvcTpCd(JSPUtil.getParameter(request, "rail_svc_tp_cd", ""));
		setEstmUsdTtlAmt(JSPUtil.getParameter(request, "estm_usd_ttl_amt", ""));
		setFcgoTzHrs(JSPUtil.getParameter(request, "fcgo_tz_hrs", ""));
		setPstLnkVndrSeq(JSPUtil.getParameter(request, "pst_lnk_vndr_seq", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setMcgoTzDys(JSPUtil.getParameter(request, "mcgo_tz_dys", ""));
		setPreNodCd(JSPUtil.getParameter(request, "pre_nod_cd", ""));
		setPreLnkVndrSeq(JSPUtil.getParameter(request, "pre_lnk_vndr_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRespbUsdTtlAmt(JSPUtil.getParameter(request, "respb_usd_ttl_amt", ""));
		setCostIoBndCd(JSPUtil.getParameter(request, "cost_io_bnd_cd", ""));
		setLgsCostCdChkFlg(JSPUtil.getParameter(request, "lgs_cost_cd_chk_flg", ""));
		setN1stNodTpCd(JSPUtil.getParameter(request, "n1st_nod_tp_cd", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setPreCostActGrpCd(JSPUtil.getParameter(request, "pre_cost_act_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInlndRoutInclSttlFlg(JSPUtil.getParameter(request, "inlnd_rout_incl_sttl_flg", ""));
		setWtrRcvTermCd(JSPUtil.getParameter(request, "wtr_rcv_term_cd", ""));
		setCtrtRtnFlg(JSPUtil.getParameter(request, "ctrt_rtn_flg", ""));
		setN1stVndrSeq(JSPUtil.getParameter(request, "n1st_vndr_seq", ""));
		setCostActGrpTpCd(JSPUtil.getParameter(request, "cost_act_grp_tp_cd", ""));
		setN3rdPolPodDist(JSPUtil.getParameter(request, "n3rd_pol_pod_dist", ""));
		setMcgoTzHrs(JSPUtil.getParameter(request, "mcgo_tz_hrs", ""));
		setWtrDeTermCd(JSPUtil.getParameter(request, "wtr_de_term_cd", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setN2ndTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, "n2nd_trsp_agmt_ofc_cty_cd", ""));
		setThrpRtFlg(JSPUtil.getParameter(request, "thrp_rt_flg", ""));
		setN2ndPolPodDist(JSPUtil.getParameter(request, "n2nd_pol_pod_dist", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setN3rdVndrSeq(JSPUtil.getParameter(request, "n3rd_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN2ndAgmtRefNo(JSPUtil.getParameter(request, "n2nd_agmt_ref_no", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setN1stDistUtCd(JSPUtil.getParameter(request, "n1st_dist_ut_cd", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setCostOfcCd(JSPUtil.getParameter(request, "cost_ofc_cd", ""));
		setCostCateCd(JSPUtil.getParameter(request, "cost_cate_cd", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setN3rdTrspAgmtSeq(JSPUtil.getParameter(request, "n3rd_trsp_agmt_seq", ""));
		setN2ndRailCrrTpCd(JSPUtil.getParameter(request, "n2nd_rail_crr_tp_cd", ""));
		setCostAsgnCalcFlg(JSPUtil.getParameter(request, "cost_asgn_calc_flg", ""));
		setCostUtAmtCd(JSPUtil.getParameter(request, "cost_ut_amt_cd", ""));
		setRespbUcAmt(JSPUtil.getParameter(request, "respb_uc_amt", ""));
		setFcgoTzDys(JSPUtil.getParameter(request, "fcgo_tz_dys", ""));
		setN2ndTrspAgmtSeq(JSPUtil.getParameter(request, "n2nd_trsp_agmt_seq", ""));
		setN1stTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, "n1st_trsp_agmt_ofc_cty_cd", ""));
		setSccCd(JSPUtil.getParameter(request, "scc_cd", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, "cost_act_grp_seq", ""));
		setN1stPolPodDist(JSPUtil.getParameter(request, "n1st_pol_pod_dist", ""));
		setParaToSccCd(JSPUtil.getParameter(request, "para_to_scc_cd", ""));
		setN1stTrspAgmtSeq(JSPUtil.getParameter(request, "n1st_trsp_agmt_seq", ""));
		setN2ndDistUtCd(JSPUtil.getParameter(request, "n2nd_dist_ut_cd", ""));
		setCustNomiTrkrFlg(JSPUtil.getParameter(request, "cust_nomi_trkr_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaComCostParaVO[]
	 */
	public CoaComCostParaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaComCostParaVO[]
	 */
	public CoaComCostParaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaComCostParaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lgsCostAutoCdFlg = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_auto_cd_flg", length));
			String[] n4thVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n4th_vndr_seq", length));
			String[] estmUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_uc_amt", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] respbUsdUcAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] costSrcSysCd = (JSPUtil.getParameter(request, prefix	+ "cost_src_sys_cd", length));
			String[] n1stAgmtRefNo = (JSPUtil.getParameter(request, prefix	+ "n1st_agmt_ref_no", length));
			String[] actGrpTmlFlg = (JSPUtil.getParameter(request, prefix	+ "act_grp_tml_flg", length));
			String[] n3rdRailCrrTpCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_rail_crr_tp_cd", length));
			String[] n1stRailCrrTpCd = (JSPUtil.getParameter(request, prefix	+ "n1st_rail_crr_tp_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] n1stEstmDt = (JSPUtil.getParameter(request, prefix	+ "n1st_estm_dt", length));
			String[] n3rdTrspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_trsp_agmt_ofc_cty_cd", length));
			String[] aplyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "aply_vndr_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] paraFmSccCd = (JSPUtil.getParameter(request, prefix	+ "para_fm_scc_cd", length));
			String[] n2ndVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n2nd_vndr_seq", length));
			String[] pstCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pst_cost_act_grp_cd", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] n2ndNodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_nod_cd", length));
			String[] ctrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrl_ofc_cd", length));
			String[] n3rdDistUtCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_dist_ut_cd", length));
			String[] trspSvcOfcCd = (JSPUtil.getParameter(request, prefix	+ "trsp_svc_ofc_cd", length));
			String[] pstNodCd = (JSPUtil.getParameter(request, prefix	+ "pst_nod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] n4thNodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_nod_cd", length));
			String[] n1stNodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_cd", length));
			String[] estmUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_uc_amt", length));
			String[] routTzModCd = (JSPUtil.getParameter(request, prefix	+ "rout_tz_mod_cd", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			String[] n3rdNodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_nod_cd", length));
			String[] n3rdAgmtRefNo = (JSPUtil.getParameter(request, prefix	+ "n3rd_agmt_ref_no", length));
			String[] paraToEccCd = (JSPUtil.getParameter(request, prefix	+ "para_to_ecc_cd", length));
			String[] paraFmEccCd = (JSPUtil.getParameter(request, prefix	+ "para_fm_ecc_cd", length));
			String[] railSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "rail_svc_tp_cd", length));
			String[] estmUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "estm_usd_ttl_amt", length));
			String[] fcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_hrs", length));
			String[] pstLnkVndrSeq = (JSPUtil.getParameter(request, prefix	+ "pst_lnk_vndr_seq", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] mcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_dys", length));
			String[] preNodCd = (JSPUtil.getParameter(request, prefix	+ "pre_nod_cd", length));
			String[] preLnkVndrSeq = (JSPUtil.getParameter(request, prefix	+ "pre_lnk_vndr_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] respbUsdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "respb_usd_ttl_amt", length));
			String[] costIoBndCd = (JSPUtil.getParameter(request, prefix	+ "cost_io_bnd_cd", length));
			String[] lgsCostCdChkFlg = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd_chk_flg", length));
			String[] n1stNodTpCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_tp_cd", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] preCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pre_cost_act_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] inlndRoutInclSttlFlg = (JSPUtil.getParameter(request, prefix	+ "inlnd_rout_incl_sttl_flg", length));
			String[] wtrRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_rcv_term_cd", length));
			String[] ctrtRtnFlg = (JSPUtil.getParameter(request, prefix	+ "ctrt_rtn_flg", length));
			String[] n1stVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_vndr_seq", length));
			String[] costActGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_tp_cd", length));
			String[] n3rdPolPodDist = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_pod_dist", length));
			String[] mcgoTzHrs = (JSPUtil.getParameter(request, prefix	+ "mcgo_tz_hrs", length));
			String[] wtrDeTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_de_term_cd", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] n2ndTrspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_trsp_agmt_ofc_cty_cd", length));
			String[] thrpRtFlg = (JSPUtil.getParameter(request, prefix	+ "thrp_rt_flg", length));
			String[] n2ndPolPodDist = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_pod_dist", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] n3rdVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3rd_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] n2ndAgmtRefNo = (JSPUtil.getParameter(request, prefix	+ "n2nd_agmt_ref_no", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] n1stDistUtCd = (JSPUtil.getParameter(request, prefix	+ "n1st_dist_ut_cd", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] costCateCd = (JSPUtil.getParameter(request, prefix	+ "cost_cate_cd", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] n3rdTrspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "n3rd_trsp_agmt_seq", length));
			String[] n2ndRailCrrTpCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_rail_crr_tp_cd", length));
			String[] costAsgnCalcFlg = (JSPUtil.getParameter(request, prefix	+ "cost_asgn_calc_flg", length));
			String[] costUtAmtCd = (JSPUtil.getParameter(request, prefix	+ "cost_ut_amt_cd", length));
			String[] respbUcAmt = (JSPUtil.getParameter(request, prefix	+ "respb_uc_amt", length));
			String[] fcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "fcgo_tz_dys", length));
			String[] n2ndTrspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "n2nd_trsp_agmt_seq", length));
			String[] n1stTrspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "n1st_trsp_agmt_ofc_cty_cd", length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_seq", length));
			String[] n1stPolPodDist = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_pod_dist", length));
			String[] paraToSccCd = (JSPUtil.getParameter(request, prefix	+ "para_to_scc_cd", length));
			String[] n1stTrspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_trsp_agmt_seq", length));
			String[] n2ndDistUtCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_dist_ut_cd", length));
			String[] custNomiTrkrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_nomi_trkr_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaComCostParaVO();
				if (lgsCostAutoCdFlg[i] != null)
					model.setLgsCostAutoCdFlg(lgsCostAutoCdFlg[i]);
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
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (costSrcSysCd[i] != null)
					model.setCostSrcSysCd(costSrcSysCd[i]);
				if (n1stAgmtRefNo[i] != null)
					model.setN1stAgmtRefNo(n1stAgmtRefNo[i]);
				if (actGrpTmlFlg[i] != null)
					model.setActGrpTmlFlg(actGrpTmlFlg[i]);
				if (n3rdRailCrrTpCd[i] != null)
					model.setN3rdRailCrrTpCd(n3rdRailCrrTpCd[i]);
				if (n1stRailCrrTpCd[i] != null)
					model.setN1stRailCrrTpCd(n1stRailCrrTpCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (n1stEstmDt[i] != null)
					model.setN1stEstmDt(n1stEstmDt[i]);
				if (n3rdTrspAgmtOfcCtyCd[i] != null)
					model.setN3rdTrspAgmtOfcCtyCd(n3rdTrspAgmtOfcCtyCd[i]);
				if (aplyVndrSeq[i] != null)
					model.setAplyVndrSeq(aplyVndrSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (paraFmSccCd[i] != null)
					model.setParaFmSccCd(paraFmSccCd[i]);
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
				if (n3rdDistUtCd[i] != null)
					model.setN3rdDistUtCd(n3rdDistUtCd[i]);
				if (trspSvcOfcCd[i] != null)
					model.setTrspSvcOfcCd(trspSvcOfcCd[i]);
				if (pstNodCd[i] != null)
					model.setPstNodCd(pstNodCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (n4thNodCd[i] != null)
					model.setN4thNodCd(n4thNodCd[i]);
				if (n1stNodCd[i] != null)
					model.setN1stNodCd(n1stNodCd[i]);
				if (estmUcAmt[i] != null)
					model.setEstmUcAmt(estmUcAmt[i]);
				if (routTzModCd[i] != null)
					model.setRoutTzModCd(routTzModCd[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				if (n3rdNodCd[i] != null)
					model.setN3rdNodCd(n3rdNodCd[i]);
				if (n3rdAgmtRefNo[i] != null)
					model.setN3rdAgmtRefNo(n3rdAgmtRefNo[i]);
				if (paraToEccCd[i] != null)
					model.setParaToEccCd(paraToEccCd[i]);
				if (paraFmEccCd[i] != null)
					model.setParaFmEccCd(paraFmEccCd[i]);
				if (railSvcTpCd[i] != null)
					model.setRailSvcTpCd(railSvcTpCd[i]);
				if (estmUsdTtlAmt[i] != null)
					model.setEstmUsdTtlAmt(estmUsdTtlAmt[i]);
				if (fcgoTzHrs[i] != null)
					model.setFcgoTzHrs(fcgoTzHrs[i]);
				if (pstLnkVndrSeq[i] != null)
					model.setPstLnkVndrSeq(pstLnkVndrSeq[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (mcgoTzDys[i] != null)
					model.setMcgoTzDys(mcgoTzDys[i]);
				if (preNodCd[i] != null)
					model.setPreNodCd(preNodCd[i]);
				if (preLnkVndrSeq[i] != null)
					model.setPreLnkVndrSeq(preLnkVndrSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (respbUsdTtlAmt[i] != null)
					model.setRespbUsdTtlAmt(respbUsdTtlAmt[i]);
				if (costIoBndCd[i] != null)
					model.setCostIoBndCd(costIoBndCd[i]);
				if (lgsCostCdChkFlg[i] != null)
					model.setLgsCostCdChkFlg(lgsCostCdChkFlg[i]);
				if (n1stNodTpCd[i] != null)
					model.setN1stNodTpCd(n1stNodTpCd[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (preCostActGrpCd[i] != null)
					model.setPreCostActGrpCd(preCostActGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (inlndRoutInclSttlFlg[i] != null)
					model.setInlndRoutInclSttlFlg(inlndRoutInclSttlFlg[i]);
				if (wtrRcvTermCd[i] != null)
					model.setWtrRcvTermCd(wtrRcvTermCd[i]);
				if (ctrtRtnFlg[i] != null)
					model.setCtrtRtnFlg(ctrtRtnFlg[i]);
				if (n1stVndrSeq[i] != null)
					model.setN1stVndrSeq(n1stVndrSeq[i]);
				if (costActGrpTpCd[i] != null)
					model.setCostActGrpTpCd(costActGrpTpCd[i]);
				if (n3rdPolPodDist[i] != null)
					model.setN3rdPolPodDist(n3rdPolPodDist[i]);
				if (mcgoTzHrs[i] != null)
					model.setMcgoTzHrs(mcgoTzHrs[i]);
				if (wtrDeTermCd[i] != null)
					model.setWtrDeTermCd(wtrDeTermCd[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (n2ndTrspAgmtOfcCtyCd[i] != null)
					model.setN2ndTrspAgmtOfcCtyCd(n2ndTrspAgmtOfcCtyCd[i]);
				if (thrpRtFlg[i] != null)
					model.setThrpRtFlg(thrpRtFlg[i]);
				if (n2ndPolPodDist[i] != null)
					model.setN2ndPolPodDist(n2ndPolPodDist[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (n3rdVndrSeq[i] != null)
					model.setN3rdVndrSeq(n3rdVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n2ndAgmtRefNo[i] != null)
					model.setN2ndAgmtRefNo(n2ndAgmtRefNo[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (n1stDistUtCd[i] != null)
					model.setN1stDistUtCd(n1stDistUtCd[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (costCateCd[i] != null)
					model.setCostCateCd(costCateCd[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (n3rdTrspAgmtSeq[i] != null)
					model.setN3rdTrspAgmtSeq(n3rdTrspAgmtSeq[i]);
				if (n2ndRailCrrTpCd[i] != null)
					model.setN2ndRailCrrTpCd(n2ndRailCrrTpCd[i]);
				if (costAsgnCalcFlg[i] != null)
					model.setCostAsgnCalcFlg(costAsgnCalcFlg[i]);
				if (costUtAmtCd[i] != null)
					model.setCostUtAmtCd(costUtAmtCd[i]);
				if (respbUcAmt[i] != null)
					model.setRespbUcAmt(respbUcAmt[i]);
				if (fcgoTzDys[i] != null)
					model.setFcgoTzDys(fcgoTzDys[i]);
				if (n2ndTrspAgmtSeq[i] != null)
					model.setN2ndTrspAgmtSeq(n2ndTrspAgmtSeq[i]);
				if (n1stTrspAgmtOfcCtyCd[i] != null)
					model.setN1stTrspAgmtOfcCtyCd(n1stTrspAgmtOfcCtyCd[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (n1stPolPodDist[i] != null)
					model.setN1stPolPodDist(n1stPolPodDist[i]);
				if (paraToSccCd[i] != null)
					model.setParaToSccCd(paraToSccCd[i]);
				if (n1stTrspAgmtSeq[i] != null)
					model.setN1stTrspAgmtSeq(n1stTrspAgmtSeq[i]);
				if (n2ndDistUtCd[i] != null)
					model.setN2ndDistUtCd(n2ndDistUtCd[i]);
				if (custNomiTrkrFlg[i] != null)
					model.setCustNomiTrkrFlg(custNomiTrkrFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaComCostParaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaComCostParaVO[]
	 */
	public CoaComCostParaVO[] getCoaComCostParaVOs(){
		CoaComCostParaVO[] vos = (CoaComCostParaVO[])models.toArray(new CoaComCostParaVO[models.size()]);
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
		this.lgsCostAutoCdFlg = this.lgsCostAutoCdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thVndrSeq = this.n4thVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdUcAmt = this.estmUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdUcAmt = this.respbUsdUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costSrcSysCd = this.costSrcSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stAgmtRefNo = this.n1stAgmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actGrpTmlFlg = this.actGrpTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdRailCrrTpCd = this.n3rdRailCrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stRailCrrTpCd = this.n1stRailCrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stEstmDt = this.n1stEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTrspAgmtOfcCtyCd = this.n3rdTrspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyVndrSeq = this.aplyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraFmSccCd = this.paraFmSccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVndrSeq = this.n2ndVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstCostActGrpCd = this.pstCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNodCd = this.n2ndNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlOfcCd = this.ctrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdDistUtCd = this.n3rdDistUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSvcOfcCd = this.trspSvcOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstNodCd = this.pstNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNodCd = this.n4thNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodCd = this.n1stNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUcAmt = this.estmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routTzModCd = this.routTzModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNodCd = this.n3rdNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdAgmtRefNo = this.n3rdAgmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraToEccCd = this.paraToEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraFmEccCd = this.paraFmEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railSvcTpCd = this.railSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUsdTtlAmt = this.estmUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzHrs = this.fcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstLnkVndrSeq = this.pstLnkVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzDys = this.mcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preNodCd = this.preNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preLnkVndrSeq = this.preLnkVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUsdTtlAmt = this.respbUsdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIoBndCd = this.costIoBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCdChkFlg = this.lgsCostCdChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodTpCd = this.n1stNodTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCostActGrpCd = this.preCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRoutInclSttlFlg = this.inlndRoutInclSttlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrRcvTermCd = this.wtrRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRtnFlg = this.ctrtRtnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrSeq = this.n1stVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpTpCd = this.costActGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolPodDist = this.n3rdPolPodDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcgoTzHrs = this.mcgoTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrDeTermCd = this.wtrDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTrspAgmtOfcCtyCd = this.n2ndTrspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpRtFlg = this.thrpRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolPodDist = this.n2ndPolPodDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVndrSeq = this.n3rdVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndAgmtRefNo = this.n2ndAgmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stDistUtCd = this.n1stDistUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCateCd = this.costCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTrspAgmtSeq = this.n3rdTrspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndRailCrrTpCd = this.n2ndRailCrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAsgnCalcFlg = this.costAsgnCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costUtAmtCd = this.costUtAmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbUcAmt = this.respbUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcgoTzDys = this.fcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTrspAgmtSeq = this.n2ndTrspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTrspAgmtOfcCtyCd = this.n1stTrspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolPodDist = this.n1stPolPodDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraToSccCd = this.paraToSccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTrspAgmtSeq = this.n1stTrspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndDistUtCd = this.n2ndDistUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNomiTrkrFlg = this.custNomiTrkrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
