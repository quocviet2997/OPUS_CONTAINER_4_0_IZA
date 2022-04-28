/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArMnVO.java
*@FileTitle : InvArMnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.23
*@LastModifier : 정휘택
*@LastVersion : 1.0
* 2009.06.23 정휘택 
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
 * @author 정휘택
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class InvArMnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArMnVO> models = new ArrayList<InvArMnVO>();
	
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String invCoaRevDirCd = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String usdXchRt = null;
	/* Column Info */
	private String whfDeclNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invCoaAcctCd = null;
	/* Column Info */
	private String invVvdCxlCd = null;
	/* Column Info */
	private String destTrnsSvcModCd = null;
	/* Column Info */
	private String xchRtUsdTpCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String mstBlNo = null;
	/* Column Info */
	private String invCoaRgnCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String znIocCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String invCoaCtrCd = null;
	/* Column Info */
	private String revVslCd = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String whfDeclVoyNo = null;
	/* Column Info */
	private String blInvCfmDt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String siRefNo = null;
	/* Column Info */
	private String erpIfGlDt = null;
	/* Column Info */
	private String acctXchRtYrmon = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String ediSndDt = null;
	/* Column Info */
	private String invTtlLoclAmt = null;
	/* Column Info */
	private String whfDeclOfcCd = null;
	/* Column Info */
	private String clrStsFlg = null;
	/* Column Info */
	private String bkgFeuQty = null;
	/* Column Info */
	private String erpIfOfcCd = null;
	/* Column Info */
	private String arIfNo = null;
	/* Column Info */
	private String whfDeclVslCd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String actCustCntCd = null;
	/* Column Info */
	private String dueDt = null;
	/* Column Info */
	private String cgoMeasQty = null;
	/* Column Info */
	private String crTermDys = null;
	/* Column Info */
	private String blInvIfDt = null;
	/* Column Info */
	private String blSrcNo = null;
	/* Column Info */
	private String revSkdDirCd = null;
	/* Column Info */
	private String whfMrnNo = null;
	/* Column Info */
	private String glEffDt = null;
	/* Column Info */
	private String invCoaSkdDirCd = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String revTpCd = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String invSplitCd = null;
	/* Column Info */
	private String invSrcNo = null;
	/* Column Info */
	private String apArOffstNo = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String invRmk = null;
	/* Column Info */
	private String clrDt = null;
	/* Column Info */
	private String invDeltDivCd = null;
	/* Column Info */
	private String frtFwrdCntCd = null;
	/* Column Info */
	private String xchRtDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String taxXchRt = null;
	/* Column Info */
	private String ifSeq = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String srepCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Column Info */
	private String invCoaCoCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String arCtyCd = null;
	/* Column Info */
	private String invCustCntCd = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String invOrgOfcCd = null;
	/* Column Info */
	private String vvdTrnsFlg = null;
	/* Column Info */
	private String invCoaVoyNo = null;
	/* Column Info */
	private String cgoWgt = null;
	/* Column Info */
	private String revSkdVoyNo = null;
	/* Column Info */
	private String bkgCorrNo = null;
	/* Column Info */
	private String xchRtN3rdTpCd = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String frtFwrdCustSeq = null;
	/* Column Info */
	private String hjsRefNo = null;
	/* Column Info */
	private String whfDeclDirCd = null;
	/* Column Info */
	private String custCrFlg = null;
	/* Column Info */
	private String sailDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgTeuQty = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String whfDeclCfmDt = null;
	/* Column Info */
	private String arTaxIndCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rfaNo = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Column Info */
	private String revDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String revSrcCd = null;
	/* Column Info */
	private String invCoaInterCoCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invCoaVslCd = null;
	/* Column Info */
	private String bkgCorrDt = null;
	/* Column Info */
	private String arInvSrcCd = null;
	/* Column Info */
	private String invRefNo = null;
	/* Column Info */
	private String invCustSeq = null;
	/* Column Info */
	private String slpNo = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String trspRqstOrdFlg = null;
	/* Column Info */
	private String blTpCd = null;
	/* Column Info */
	private String obrdDt = null;
	/* Column Info */
	private String bkgRefNo = null;
	/* Column Info */
	private String whfDeclApIfDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArMnVO() {}

	public InvArMnVO(String ibflag, String pagerows, String arIfNo, String blNo, String blTpCd, String blSrcNo, String invSrcNo, String bkgNo, String bkgCorrNo, String bkgCorrDt, String vvdTrnsFlg, String actCustCntCd, String actCustSeq, String arOfcCd, String revTpCd, String revSrcCd, String vslCd, String skdVoyNo, String skdDirCd, String loclCurrCd, String svcScpCd, String sailDt, String sailArrDt, String slanCd, String ioBndCd, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String porCd, String polCd, String podCd, String delCd, String custCrFlg, String invCustCntCd, String invCustSeq, String frtFwrdCntCd, String frtFwrdCustSeq, String cgoWgt, String cgoMeasQty, String bkgTeuQty, String bkgFeuQty, String scNo, String rfaNo, String srepCd, String mstBlNo, String cxlFlg, String dueDt, String blInvIfDt, String blInvCfmDt, String glEffDt, String invRmk, String invDeltDivCd, String bkgRefNo, String invRefNo, String siRefNo, String hjsRefNo, String invSplitCd, String invVvdCxlCd, String destTrnsSvcModCd, String acctXchRtYrmon, String whfDeclNo, String whfDeclCfmDt, String whfDeclVslCd, String whfDeclVoyNo, String whfDeclDirCd, String whfDeclOfcCd, String whfDeclApIfDt, String whfMrnNo, String usdXchRt, String xchRtUsdTpCd, String xchRtN3rdTpCd, String xchRtDt, String obrdDt, String invTtlLoclAmt, String trspRqstOrdFlg, String ediSndDt, String revVslCd, String revSkdVoyNo, String revSkdDirCd, String revDirCd, String rlaneCd, String znIocCd, String crTermDys, String arTaxIndCd, String arCtyCd, String slsOfcCd, String invOrgOfcCd, String slpNo, String apArOffstNo, String clrStsFlg, String clrDt, String acctCd, String arInvSrcCd, String ifSeq, String invCoaCoCd, String invCoaRgnCd, String invCoaCtrCd, String invCoaAcctCd, String invCoaInterCoCd, String invCoaVslCd, String invCoaVoyNo, String invCoaSkdDirCd, String invCoaRevDirCd, String taxXchRt, String erpIfGlDt, String erpIfOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.svcScpCd = svcScpCd;
		this.invCoaRevDirCd = invCoaRevDirCd;
		this.cxlFlg = cxlFlg;
		this.usdXchRt = usdXchRt;
		this.whfDeclNo = whfDeclNo;
		this.pagerows = pagerows;
		this.invCoaAcctCd = invCoaAcctCd;
		this.invVvdCxlCd = invVvdCxlCd;
		this.destTrnsSvcModCd = destTrnsSvcModCd;
		this.xchRtUsdTpCd = xchRtUsdTpCd;
		this.slsOfcCd = slsOfcCd;
		this.mstBlNo = mstBlNo;
		this.invCoaRgnCd = invCoaRgnCd;
		this.updUsrId = updUsrId;
		this.znIocCd = znIocCd;
		this.skdVoyNo = skdVoyNo;
		this.invCoaCtrCd = invCoaCtrCd;
		this.revVslCd = revVslCd;
		this.podCd = podCd;
		this.whfDeclVoyNo = whfDeclVoyNo;
		this.blInvCfmDt = blInvCfmDt;
		this.bkgNo = bkgNo;
		this.siRefNo = siRefNo;
		this.erpIfGlDt = erpIfGlDt;
		this.acctXchRtYrmon = acctXchRtYrmon;
		this.trnkVslCd = trnkVslCd;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.ediSndDt = ediSndDt;
		this.invTtlLoclAmt = invTtlLoclAmt;
		this.whfDeclOfcCd = whfDeclOfcCd;
		this.clrStsFlg = clrStsFlg;
		this.bkgFeuQty = bkgFeuQty;
		this.erpIfOfcCd = erpIfOfcCd;
		this.arIfNo = arIfNo;
		this.whfDeclVslCd = whfDeclVslCd;
		this.acctCd = acctCd;
		this.actCustCntCd = actCustCntCd;
		this.dueDt = dueDt;
		this.cgoMeasQty = cgoMeasQty;
		this.crTermDys = crTermDys;
		this.blInvIfDt = blInvIfDt;
		this.blSrcNo = blSrcNo;
		this.revSkdDirCd = revSkdDirCd;
		this.whfMrnNo = whfMrnNo;
		this.glEffDt = glEffDt;
		this.invCoaSkdDirCd = invCoaSkdDirCd;
		this.actCustSeq = actCustSeq;
		this.revTpCd = revTpCd;
		this.arOfcCd = arOfcCd;
		this.invSplitCd = invSplitCd;
		this.invSrcNo = invSrcNo;
		this.apArOffstNo = apArOffstNo;
		this.slanCd = slanCd;
		this.invRmk = invRmk;
		this.clrDt = clrDt;
		this.invDeltDivCd = invDeltDivCd;
		this.frtFwrdCntCd = frtFwrdCntCd;
		this.xchRtDt = xchRtDt;
		this.vslCd = vslCd;
		this.taxXchRt = taxXchRt;
		this.ifSeq = ifSeq;
		this.rlaneCd = rlaneCd;
		this.srepCd = srepCd;
		this.blNo = blNo;
		this.sailArrDt = sailArrDt;
		this.invCoaCoCd = invCoaCoCd;
		this.polCd = polCd;
		this.arCtyCd = arCtyCd;
		this.invCustCntCd = invCustCntCd;
		this.scNo = scNo;
		this.invOrgOfcCd = invOrgOfcCd;
		this.vvdTrnsFlg = vvdTrnsFlg;
		this.invCoaVoyNo = invCoaVoyNo;
		this.cgoWgt = cgoWgt;
		this.revSkdVoyNo = revSkdVoyNo;
		this.bkgCorrNo = bkgCorrNo;
		this.xchRtN3rdTpCd = xchRtN3rdTpCd;
		this.loclCurrCd = loclCurrCd;
		this.delCd = delCd;
		this.frtFwrdCustSeq = frtFwrdCustSeq;
		this.hjsRefNo = hjsRefNo;
		this.whfDeclDirCd = whfDeclDirCd;
		this.custCrFlg = custCrFlg;
		this.sailDt = sailDt;
		this.creUsrId = creUsrId;
		this.bkgTeuQty = bkgTeuQty;
		this.porCd = porCd;
		this.whfDeclCfmDt = whfDeclCfmDt;
		this.arTaxIndCd = arTaxIndCd;
		this.creDt = creDt;
		this.rfaNo = rfaNo;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.revSrcCd = revSrcCd;
		this.invCoaInterCoCd = invCoaInterCoCd;
		this.updDt = updDt;
		this.invCoaVslCd = invCoaVslCd;
		this.bkgCorrDt = bkgCorrDt;
		this.arInvSrcCd = arInvSrcCd;
		this.invRefNo = invRefNo;
		this.invCustSeq = invCustSeq;
		this.slpNo = slpNo;
		this.ioBndCd = ioBndCd;
		this.skdDirCd = skdDirCd;
		this.trspRqstOrdFlg = trspRqstOrdFlg;
		this.blTpCd = blTpCd;
		this.obrdDt = obrdDt;
		this.bkgRefNo = bkgRefNo;
		this.whfDeclApIfDt = whfDeclApIfDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("inv_coa_rev_dir_cd", getInvCoaRevDirCd());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("usd_xch_rt", getUsdXchRt());
		this.hashColumns.put("whf_decl_no", getWhfDeclNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_coa_acct_cd", getInvCoaAcctCd());
		this.hashColumns.put("inv_vvd_cxl_cd", getInvVvdCxlCd());
		this.hashColumns.put("dest_trns_svc_mod_cd", getDestTrnsSvcModCd());
		this.hashColumns.put("xch_rt_usd_tp_cd", getXchRtUsdTpCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("mst_bl_no", getMstBlNo());
		this.hashColumns.put("inv_coa_rgn_cd", getInvCoaRgnCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("zn_ioc_cd", getZnIocCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("inv_coa_ctr_cd", getInvCoaCtrCd());
		this.hashColumns.put("rev_vsl_cd", getRevVslCd());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("whf_decl_voy_no", getWhfDeclVoyNo());
		this.hashColumns.put("bl_inv_cfm_dt", getBlInvCfmDt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("si_ref_no", getSiRefNo());
		this.hashColumns.put("erp_if_gl_dt", getErpIfGlDt());
		this.hashColumns.put("acct_xch_rt_yrmon", getAcctXchRtYrmon());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		this.hashColumns.put("inv_ttl_locl_amt", getInvTtlLoclAmt());
		this.hashColumns.put("whf_decl_ofc_cd", getWhfDeclOfcCd());
		this.hashColumns.put("clr_sts_flg", getClrStsFlg());
		this.hashColumns.put("bkg_feu_qty", getBkgFeuQty());
		this.hashColumns.put("erp_if_ofc_cd", getErpIfOfcCd());
		this.hashColumns.put("ar_if_no", getArIfNo());
		this.hashColumns.put("whf_decl_vsl_cd", getWhfDeclVslCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("due_dt", getDueDt());
		this.hashColumns.put("cgo_meas_qty", getCgoMeasQty());
		this.hashColumns.put("cr_term_dys", getCrTermDys());
		this.hashColumns.put("bl_inv_if_dt", getBlInvIfDt());
		this.hashColumns.put("bl_src_no", getBlSrcNo());
		this.hashColumns.put("rev_skd_dir_cd", getRevSkdDirCd());
		this.hashColumns.put("whf_mrn_no", getWhfMrnNo());
		this.hashColumns.put("gl_eff_dt", getGlEffDt());
		this.hashColumns.put("inv_coa_skd_dir_cd", getInvCoaSkdDirCd());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("rev_tp_cd", getRevTpCd());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("inv_split_cd", getInvSplitCd());
		this.hashColumns.put("inv_src_no", getInvSrcNo());
		this.hashColumns.put("ap_ar_offst_no", getApArOffstNo());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("inv_rmk", getInvRmk());
		this.hashColumns.put("clr_dt", getClrDt());
		this.hashColumns.put("inv_delt_div_cd", getInvDeltDivCd());
		this.hashColumns.put("frt_fwrd_cnt_cd", getFrtFwrdCntCd());
		this.hashColumns.put("xch_rt_dt", getXchRtDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("tax_xch_rt", getTaxXchRt());
		this.hashColumns.put("if_seq", getIfSeq());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("inv_coa_co_cd", getInvCoaCoCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ar_cty_cd", getArCtyCd());
		this.hashColumns.put("inv_cust_cnt_cd", getInvCustCntCd());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("inv_org_ofc_cd", getInvOrgOfcCd());
		this.hashColumns.put("vvd_trns_flg", getVvdTrnsFlg());
		this.hashColumns.put("inv_coa_voy_no", getInvCoaVoyNo());
		this.hashColumns.put("cgo_wgt", getCgoWgt());
		this.hashColumns.put("rev_skd_voy_no", getRevSkdVoyNo());
		this.hashColumns.put("bkg_corr_no", getBkgCorrNo());
		this.hashColumns.put("xch_rt_n3rd_tp_cd", getXchRtN3rdTpCd());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("frt_fwrd_cust_seq", getFrtFwrdCustSeq());
		this.hashColumns.put("hjs_ref_no", getHjsRefNo());
		this.hashColumns.put("whf_decl_dir_cd", getWhfDeclDirCd());
		this.hashColumns.put("cust_cr_flg", getCustCrFlg());
		this.hashColumns.put("sail_dt", getSailDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_teu_qty", getBkgTeuQty());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("whf_decl_cfm_dt", getWhfDeclCfmDt());
		this.hashColumns.put("ar_tax_ind_cd", getArTaxIndCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rev_src_cd", getRevSrcCd());
		this.hashColumns.put("inv_coa_inter_co_cd", getInvCoaInterCoCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_coa_vsl_cd", getInvCoaVslCd());
		this.hashColumns.put("bkg_corr_dt", getBkgCorrDt());
		this.hashColumns.put("ar_inv_src_cd", getArInvSrcCd());
		this.hashColumns.put("inv_ref_no", getInvRefNo());
		this.hashColumns.put("inv_cust_seq", getInvCustSeq());
		this.hashColumns.put("slp_no", getSlpNo());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("trsp_rqst_ord_flg", getTrspRqstOrdFlg());
		this.hashColumns.put("bl_tp_cd", getBlTpCd());
		this.hashColumns.put("obrd_dt", getObrdDt());
		this.hashColumns.put("bkg_ref_no", getBkgRefNo());
		this.hashColumns.put("whf_decl_ap_if_dt", getWhfDeclApIfDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("inv_coa_rev_dir_cd", "invCoaRevDirCd");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("usd_xch_rt", "usdXchRt");
		this.hashFields.put("whf_decl_no", "whfDeclNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_coa_acct_cd", "invCoaAcctCd");
		this.hashFields.put("inv_vvd_cxl_cd", "invVvdCxlCd");
		this.hashFields.put("dest_trns_svc_mod_cd", "destTrnsSvcModCd");
		this.hashFields.put("xch_rt_usd_tp_cd", "xchRtUsdTpCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("mst_bl_no", "mstBlNo");
		this.hashFields.put("inv_coa_rgn_cd", "invCoaRgnCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("zn_ioc_cd", "znIocCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("inv_coa_ctr_cd", "invCoaCtrCd");
		this.hashFields.put("rev_vsl_cd", "revVslCd");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("whf_decl_voy_no", "whfDeclVoyNo");
		this.hashFields.put("bl_inv_cfm_dt", "blInvCfmDt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("si_ref_no", "siRefNo");
		this.hashFields.put("erp_if_gl_dt", "erpIfGlDt");
		this.hashFields.put("acct_xch_rt_yrmon", "acctXchRtYrmon");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		this.hashFields.put("inv_ttl_locl_amt", "invTtlLoclAmt");
		this.hashFields.put("whf_decl_ofc_cd", "whfDeclOfcCd");
		this.hashFields.put("clr_sts_flg", "clrStsFlg");
		this.hashFields.put("bkg_feu_qty", "bkgFeuQty");
		this.hashFields.put("erp_if_ofc_cd", "erpIfOfcCd");
		this.hashFields.put("ar_if_no", "arIfNo");
		this.hashFields.put("whf_decl_vsl_cd", "whfDeclVslCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("due_dt", "dueDt");
		this.hashFields.put("cgo_meas_qty", "cgoMeasQty");
		this.hashFields.put("cr_term_dys", "crTermDys");
		this.hashFields.put("bl_inv_if_dt", "blInvIfDt");
		this.hashFields.put("bl_src_no", "blSrcNo");
		this.hashFields.put("rev_skd_dir_cd", "revSkdDirCd");
		this.hashFields.put("whf_mrn_no", "whfMrnNo");
		this.hashFields.put("gl_eff_dt", "glEffDt");
		this.hashFields.put("inv_coa_skd_dir_cd", "invCoaSkdDirCd");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("rev_tp_cd", "revTpCd");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("inv_split_cd", "invSplitCd");
		this.hashFields.put("inv_src_no", "invSrcNo");
		this.hashFields.put("ap_ar_offst_no", "apArOffstNo");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("inv_rmk", "invRmk");
		this.hashFields.put("clr_dt", "clrDt");
		this.hashFields.put("inv_delt_div_cd", "invDeltDivCd");
		this.hashFields.put("frt_fwrd_cnt_cd", "frtFwrdCntCd");
		this.hashFields.put("xch_rt_dt", "xchRtDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("tax_xch_rt", "taxXchRt");
		this.hashFields.put("if_seq", "ifSeq");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("inv_coa_co_cd", "invCoaCoCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ar_cty_cd", "arCtyCd");
		this.hashFields.put("inv_cust_cnt_cd", "invCustCntCd");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("inv_org_ofc_cd", "invOrgOfcCd");
		this.hashFields.put("vvd_trns_flg", "vvdTrnsFlg");
		this.hashFields.put("inv_coa_voy_no", "invCoaVoyNo");
		this.hashFields.put("cgo_wgt", "cgoWgt");
		this.hashFields.put("rev_skd_voy_no", "revSkdVoyNo");
		this.hashFields.put("bkg_corr_no", "bkgCorrNo");
		this.hashFields.put("xch_rt_n3rd_tp_cd", "xchRtN3rdTpCd");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("frt_fwrd_cust_seq", "frtFwrdCustSeq");
		this.hashFields.put("hjs_ref_no", "hjsRefNo");
		this.hashFields.put("whf_decl_dir_cd", "whfDeclDirCd");
		this.hashFields.put("cust_cr_flg", "custCrFlg");
		this.hashFields.put("sail_dt", "sailDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_teu_qty", "bkgTeuQty");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("whf_decl_cfm_dt", "whfDeclCfmDt");
		this.hashFields.put("ar_tax_ind_cd", "arTaxIndCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rev_src_cd", "revSrcCd");
		this.hashFields.put("inv_coa_inter_co_cd", "invCoaInterCoCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_coa_vsl_cd", "invCoaVslCd");
		this.hashFields.put("bkg_corr_dt", "bkgCorrDt");
		this.hashFields.put("ar_inv_src_cd", "arInvSrcCd");
		this.hashFields.put("inv_ref_no", "invRefNo");
		this.hashFields.put("inv_cust_seq", "invCustSeq");
		this.hashFields.put("slp_no", "slpNo");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("trsp_rqst_ord_flg", "trspRqstOrdFlg");
		this.hashFields.put("bl_tp_cd", "blTpCd");
		this.hashFields.put("obrd_dt", "obrdDt");
		this.hashFields.put("bkg_ref_no", "bkgRefNo");
		this.hashFields.put("whf_decl_ap_if_dt", "whfDeclApIfDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaRevDirCd
	 */
	public String getInvCoaRevDirCd() {
		return this.invCoaRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return cxlFlg
	 */
	public String getCxlFlg() {
		return this.cxlFlg;
	}
	
	/**
	 * Column Info
	 * @return usdXchRt
	 */
	public String getUsdXchRt() {
		return this.usdXchRt;
	}
	
	/**
	 * Column Info
	 * @return whfDeclNo
	 */
	public String getWhfDeclNo() {
		return this.whfDeclNo;
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
	 * @return invCoaAcctCd
	 */
	public String getInvCoaAcctCd() {
		return this.invCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @return invVvdCxlCd
	 */
	public String getInvVvdCxlCd() {
		return this.invVvdCxlCd;
	}
	
	/**
	 * Column Info
	 * @return destTrnsSvcModCd
	 */
	public String getDestTrnsSvcModCd() {
		return this.destTrnsSvcModCd;
	}
	
	/**
	 * Column Info
	 * @return xchRtUsdTpCd
	 */
	public String getXchRtUsdTpCd() {
		return this.xchRtUsdTpCd;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return mstBlNo
	 */
	public String getMstBlNo() {
		return this.mstBlNo;
	}
	
	/**
	 * Column Info
	 * @return invCoaRgnCd
	 */
	public String getInvCoaRgnCd() {
		return this.invCoaRgnCd;
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
	 * @return znIocCd
	 */
	public String getZnIocCd() {
		return this.znIocCd;
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
	 * @return invCoaCtrCd
	 */
	public String getInvCoaCtrCd() {
		return this.invCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @return revVslCd
	 */
	public String getRevVslCd() {
		return this.revVslCd;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return whfDeclVoyNo
	 */
	public String getWhfDeclVoyNo() {
		return this.whfDeclVoyNo;
	}
	
	/**
	 * Column Info
	 * @return blInvCfmDt
	 */
	public String getBlInvCfmDt() {
		return this.blInvCfmDt;
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
	 * @return siRefNo
	 */
	public String getSiRefNo() {
		return this.siRefNo;
	}
	
	/**
	 * Column Info
	 * @return erpIfGlDt
	 */
	public String getErpIfGlDt() {
		return this.erpIfGlDt;
	}
	
	/**
	 * Column Info
	 * @return acctXchRtYrmon
	 */
	public String getAcctXchRtYrmon() {
		return this.acctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCd
	 */
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdVoyNo
	 */
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return ediSndDt
	 */
	public String getEdiSndDt() {
		return this.ediSndDt;
	}
	
	/**
	 * Column Info
	 * @return invTtlLoclAmt
	 */
	public String getInvTtlLoclAmt() {
		return this.invTtlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return whfDeclOfcCd
	 */
	public String getWhfDeclOfcCd() {
		return this.whfDeclOfcCd;
	}
	
	/**
	 * Column Info
	 * @return clrStsFlg
	 */
	public String getClrStsFlg() {
		return this.clrStsFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgFeuQty
	 */
	public String getBkgFeuQty() {
		return this.bkgFeuQty;
	}
	
	/**
	 * Column Info
	 * @return erpIfOfcCd
	 */
	public String getErpIfOfcCd() {
		return this.erpIfOfcCd;
	}
	
	/**
	 * Column Info
	 * @return arIfNo
	 */
	public String getArIfNo() {
		return this.arIfNo;
	}
	
	/**
	 * Column Info
	 * @return whfDeclVslCd
	 */
	public String getWhfDeclVslCd() {
		return this.whfDeclVslCd;
	}
	
	/**
	 * Column Info
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return actCustCntCd
	 */
	public String getActCustCntCd() {
		return this.actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return dueDt
	 */
	public String getDueDt() {
		return this.dueDt;
	}
	
	/**
	 * Column Info
	 * @return cgoMeasQty
	 */
	public String getCgoMeasQty() {
		return this.cgoMeasQty;
	}
	
	/**
	 * Column Info
	 * @return crTermDys
	 */
	public String getCrTermDys() {
		return this.crTermDys;
	}
	
	/**
	 * Column Info
	 * @return blInvIfDt
	 */
	public String getBlInvIfDt() {
		return this.blInvIfDt;
	}
	
	/**
	 * Column Info
	 * @return blSrcNo
	 */
	public String getBlSrcNo() {
		return this.blSrcNo;
	}
	
	/**
	 * Column Info
	 * @return revSkdDirCd
	 */
	public String getRevSkdDirCd() {
		return this.revSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return whfMrnNo
	 */
	public String getWhfMrnNo() {
		return this.whfMrnNo;
	}
	
	/**
	 * Column Info
	 * @return glEffDt
	 */
	public String getGlEffDt() {
		return this.glEffDt;
	}
	
	/**
	 * Column Info
	 * @return invCoaSkdDirCd
	 */
	public String getInvCoaSkdDirCd() {
		return this.invCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return actCustSeq
	 */
	public String getActCustSeq() {
		return this.actCustSeq;
	}
	
	/**
	 * Column Info
	 * @return revTpCd
	 */
	public String getRevTpCd() {
		return this.revTpCd;
	}
	
	/**
	 * Column Info
	 * @return arOfcCd
	 */
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	
	/**
	 * Column Info
	 * @return invSplitCd
	 */
	public String getInvSplitCd() {
		return this.invSplitCd;
	}
	
	/**
	 * Column Info
	 * @return invSrcNo
	 */
	public String getInvSrcNo() {
		return this.invSrcNo;
	}
	
	/**
	 * Column Info
	 * @return apArOffstNo
	 */
	public String getApArOffstNo() {
		return this.apArOffstNo;
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
	 * @return invRmk
	 */
	public String getInvRmk() {
		return this.invRmk;
	}
	
	/**
	 * Column Info
	 * @return clrDt
	 */
	public String getClrDt() {
		return this.clrDt;
	}
	
	/**
	 * Column Info
	 * @return invDeltDivCd
	 */
	public String getInvDeltDivCd() {
		return this.invDeltDivCd;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCntCd
	 */
	public String getFrtFwrdCntCd() {
		return this.frtFwrdCntCd;
	}
	
	/**
	 * Column Info
	 * @return xchRtDt
	 */
	public String getXchRtDt() {
		return this.xchRtDt;
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
	 * @return taxXchRt
	 */
	public String getTaxXchRt() {
		return this.taxXchRt;
	}
	
	/**
	 * Column Info
	 * @return ifSeq
	 */
	public String getIfSeq() {
		return this.ifSeq;
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
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return sailArrDt
	 */
	public String getSailArrDt() {
		return this.sailArrDt;
	}
	
	/**
	 * Column Info
	 * @return invCoaCoCd
	 */
	public String getInvCoaCoCd() {
		return this.invCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return arCtyCd
	 */
	public String getArCtyCd() {
		return this.arCtyCd;
	}
	
	/**
	 * Column Info
	 * @return invCustCntCd
	 */
	public String getInvCustCntCd() {
		return this.invCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return invOrgOfcCd
	 */
	public String getInvOrgOfcCd() {
		return this.invOrgOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vvdTrnsFlg
	 */
	public String getVvdTrnsFlg() {
		return this.vvdTrnsFlg;
	}
	
	/**
	 * Column Info
	 * @return invCoaVoyNo
	 */
	public String getInvCoaVoyNo() {
		return this.invCoaVoyNo;
	}
	
	/**
	 * Column Info
	 * @return cgoWgt
	 */
	public String getCgoWgt() {
		return this.cgoWgt;
	}
	
	/**
	 * Column Info
	 * @return revSkdVoyNo
	 */
	public String getRevSkdVoyNo() {
		return this.revSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return bkgCorrNo
	 */
	public String getBkgCorrNo() {
		return this.bkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @return xchRtN3rdTpCd
	 */
	public String getXchRtN3rdTpCd() {
		return this.xchRtN3rdTpCd;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return frtFwrdCustSeq
	 */
	public String getFrtFwrdCustSeq() {
		return this.frtFwrdCustSeq;
	}
	
	/**
	 * Column Info
	 * @return hjsRefNo
	 */
	public String getHjsRefNo() {
		return this.hjsRefNo;
	}
	
	/**
	 * Column Info
	 * @return whfDeclDirCd
	 */
	public String getWhfDeclDirCd() {
		return this.whfDeclDirCd;
	}
	
	/**
	 * Column Info
	 * @return custCrFlg
	 */
	public String getCustCrFlg() {
		return this.custCrFlg;
	}
	
	/**
	 * Column Info
	 * @return sailDt
	 */
	public String getSailDt() {
		return this.sailDt;
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
	 * @return bkgTeuQty
	 */
	public String getBkgTeuQty() {
		return this.bkgTeuQty;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return whfDeclCfmDt
	 */
	public String getWhfDeclCfmDt() {
		return this.whfDeclCfmDt;
	}
	
	/**
	 * Column Info
	 * @return arTaxIndCd
	 */
	public String getArTaxIndCd() {
		return this.arTaxIndCd;
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
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdDirCd
	 */
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return revSrcCd
	 */
	public String getRevSrcCd() {
		return this.revSrcCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaInterCoCd
	 */
	public String getInvCoaInterCoCd() {
		return this.invCoaInterCoCd;
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
	 * @return invCoaVslCd
	 */
	public String getInvCoaVslCd() {
		return this.invCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCorrDt
	 */
	public String getBkgCorrDt() {
		return this.bkgCorrDt;
	}
	
	/**
	 * Column Info
	 * @return arInvSrcCd
	 */
	public String getArInvSrcCd() {
		return this.arInvSrcCd;
	}
	
	/**
	 * Column Info
	 * @return invRefNo
	 */
	public String getInvRefNo() {
		return this.invRefNo;
	}
	
	/**
	 * Column Info
	 * @return invCustSeq
	 */
	public String getInvCustSeq() {
		return this.invCustSeq;
	}
	
	/**
	 * Column Info
	 * @return slpNo
	 */
	public String getSlpNo() {
		return this.slpNo;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
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
	 * @return trspRqstOrdFlg
	 */
	public String getTrspRqstOrdFlg() {
		return this.trspRqstOrdFlg;
	}
	
	/**
	 * Column Info
	 * @return blTpCd
	 */
	public String getBlTpCd() {
		return this.blTpCd;
	}
	
	/**
	 * Column Info
	 * @return obrdDt
	 */
	public String getObrdDt() {
		return this.obrdDt;
	}
	
	/**
	 * Column Info
	 * @return bkgRefNo
	 */
	public String getBkgRefNo() {
		return this.bkgRefNo;
	}
	
	/**
	 * Column Info
	 * @return whfDeclApIfDt
	 */
	public String getWhfDeclApIfDt() {
		return this.whfDeclApIfDt;
	}
	

	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaRevDirCd
	 */
	public void setInvCoaRevDirCd(String invCoaRevDirCd) {
		this.invCoaRevDirCd = invCoaRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param cxlFlg
	 */
	public void setCxlFlg(String cxlFlg) {
		this.cxlFlg = cxlFlg;
	}
	
	/**
	 * Column Info
	 * @param usdXchRt
	 */
	public void setUsdXchRt(String usdXchRt) {
		this.usdXchRt = usdXchRt;
	}
	
	/**
	 * Column Info
	 * @param whfDeclNo
	 */
	public void setWhfDeclNo(String whfDeclNo) {
		this.whfDeclNo = whfDeclNo;
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
	 * @param invCoaAcctCd
	 */
	public void setInvCoaAcctCd(String invCoaAcctCd) {
		this.invCoaAcctCd = invCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @param invVvdCxlCd
	 */
	public void setInvVvdCxlCd(String invVvdCxlCd) {
		this.invVvdCxlCd = invVvdCxlCd;
	}
	
	/**
	 * Column Info
	 * @param destTrnsSvcModCd
	 */
	public void setDestTrnsSvcModCd(String destTrnsSvcModCd) {
		this.destTrnsSvcModCd = destTrnsSvcModCd;
	}
	
	/**
	 * Column Info
	 * @param xchRtUsdTpCd
	 */
	public void setXchRtUsdTpCd(String xchRtUsdTpCd) {
		this.xchRtUsdTpCd = xchRtUsdTpCd;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param mstBlNo
	 */
	public void setMstBlNo(String mstBlNo) {
		this.mstBlNo = mstBlNo;
	}
	
	/**
	 * Column Info
	 * @param invCoaRgnCd
	 */
	public void setInvCoaRgnCd(String invCoaRgnCd) {
		this.invCoaRgnCd = invCoaRgnCd;
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
	 * @param znIocCd
	 */
	public void setZnIocCd(String znIocCd) {
		this.znIocCd = znIocCd;
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
	 * @param invCoaCtrCd
	 */
	public void setInvCoaCtrCd(String invCoaCtrCd) {
		this.invCoaCtrCd = invCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @param revVslCd
	 */
	public void setRevVslCd(String revVslCd) {
		this.revVslCd = revVslCd;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param whfDeclVoyNo
	 */
	public void setWhfDeclVoyNo(String whfDeclVoyNo) {
		this.whfDeclVoyNo = whfDeclVoyNo;
	}
	
	/**
	 * Column Info
	 * @param blInvCfmDt
	 */
	public void setBlInvCfmDt(String blInvCfmDt) {
		this.blInvCfmDt = blInvCfmDt;
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
	 * @param siRefNo
	 */
	public void setSiRefNo(String siRefNo) {
		this.siRefNo = siRefNo;
	}
	
	/**
	 * Column Info
	 * @param erpIfGlDt
	 */
	public void setErpIfGlDt(String erpIfGlDt) {
		this.erpIfGlDt = erpIfGlDt;
	}
	
	/**
	 * Column Info
	 * @param acctXchRtYrmon
	 */
	public void setAcctXchRtYrmon(String acctXchRtYrmon) {
		this.acctXchRtYrmon = acctXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCd
	 */
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdVoyNo
	 */
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param ediSndDt
	 */
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
	}
	
	/**
	 * Column Info
	 * @param invTtlLoclAmt
	 */
	public void setInvTtlLoclAmt(String invTtlLoclAmt) {
		this.invTtlLoclAmt = invTtlLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param whfDeclOfcCd
	 */
	public void setWhfDeclOfcCd(String whfDeclOfcCd) {
		this.whfDeclOfcCd = whfDeclOfcCd;
	}
	
	/**
	 * Column Info
	 * @param clrStsFlg
	 */
	public void setClrStsFlg(String clrStsFlg) {
		this.clrStsFlg = clrStsFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgFeuQty
	 */
	public void setBkgFeuQty(String bkgFeuQty) {
		this.bkgFeuQty = bkgFeuQty;
	}
	
	/**
	 * Column Info
	 * @param erpIfOfcCd
	 */
	public void setErpIfOfcCd(String erpIfOfcCd) {
		this.erpIfOfcCd = erpIfOfcCd;
	}
	
	/**
	 * Column Info
	 * @param arIfNo
	 */
	public void setArIfNo(String arIfNo) {
		this.arIfNo = arIfNo;
	}
	
	/**
	 * Column Info
	 * @param whfDeclVslCd
	 */
	public void setWhfDeclVslCd(String whfDeclVslCd) {
		this.whfDeclVslCd = whfDeclVslCd;
	}
	
	/**
	 * Column Info
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param actCustCntCd
	 */
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param dueDt
	 */
	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
	}
	
	/**
	 * Column Info
	 * @param cgoMeasQty
	 */
	public void setCgoMeasQty(String cgoMeasQty) {
		this.cgoMeasQty = cgoMeasQty;
	}
	
	/**
	 * Column Info
	 * @param crTermDys
	 */
	public void setCrTermDys(String crTermDys) {
		this.crTermDys = crTermDys;
	}
	
	/**
	 * Column Info
	 * @param blInvIfDt
	 */
	public void setBlInvIfDt(String blInvIfDt) {
		this.blInvIfDt = blInvIfDt;
	}
	
	/**
	 * Column Info
	 * @param blSrcNo
	 */
	public void setBlSrcNo(String blSrcNo) {
		this.blSrcNo = blSrcNo;
	}
	
	/**
	 * Column Info
	 * @param revSkdDirCd
	 */
	public void setRevSkdDirCd(String revSkdDirCd) {
		this.revSkdDirCd = revSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param whfMrnNo
	 */
	public void setWhfMrnNo(String whfMrnNo) {
		this.whfMrnNo = whfMrnNo;
	}
	
	/**
	 * Column Info
	 * @param glEffDt
	 */
	public void setGlEffDt(String glEffDt) {
		this.glEffDt = glEffDt;
	}
	
	/**
	 * Column Info
	 * @param invCoaSkdDirCd
	 */
	public void setInvCoaSkdDirCd(String invCoaSkdDirCd) {
		this.invCoaSkdDirCd = invCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param actCustSeq
	 */
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
	}
	
	/**
	 * Column Info
	 * @param revTpCd
	 */
	public void setRevTpCd(String revTpCd) {
		this.revTpCd = revTpCd;
	}
	
	/**
	 * Column Info
	 * @param arOfcCd
	 */
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
	}
	
	/**
	 * Column Info
	 * @param invSplitCd
	 */
	public void setInvSplitCd(String invSplitCd) {
		this.invSplitCd = invSplitCd;
	}
	
	/**
	 * Column Info
	 * @param invSrcNo
	 */
	public void setInvSrcNo(String invSrcNo) {
		this.invSrcNo = invSrcNo;
	}
	
	/**
	 * Column Info
	 * @param apArOffstNo
	 */
	public void setApArOffstNo(String apArOffstNo) {
		this.apArOffstNo = apArOffstNo;
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
	 * @param invRmk
	 */
	public void setInvRmk(String invRmk) {
		this.invRmk = invRmk;
	}
	
	/**
	 * Column Info
	 * @param clrDt
	 */
	public void setClrDt(String clrDt) {
		this.clrDt = clrDt;
	}
	
	/**
	 * Column Info
	 * @param invDeltDivCd
	 */
	public void setInvDeltDivCd(String invDeltDivCd) {
		this.invDeltDivCd = invDeltDivCd;
	}
	
	/**
	 * Column Info
	 * @param frtFwrdCntCd
	 */
	public void setFrtFwrdCntCd(String frtFwrdCntCd) {
		this.frtFwrdCntCd = frtFwrdCntCd;
	}
	
	/**
	 * Column Info
	 * @param xchRtDt
	 */
	public void setXchRtDt(String xchRtDt) {
		this.xchRtDt = xchRtDt;
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
	 * @param taxXchRt
	 */
	public void setTaxXchRt(String taxXchRt) {
		this.taxXchRt = taxXchRt;
	}
	
	/**
	 * Column Info
	 * @param ifSeq
	 */
	public void setIfSeq(String ifSeq) {
		this.ifSeq = ifSeq;
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
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param sailArrDt
	 */
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
	}
	
	/**
	 * Column Info
	 * @param invCoaCoCd
	 */
	public void setInvCoaCoCd(String invCoaCoCd) {
		this.invCoaCoCd = invCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param arCtyCd
	 */
	public void setArCtyCd(String arCtyCd) {
		this.arCtyCd = arCtyCd;
	}
	
	/**
	 * Column Info
	 * @param invCustCntCd
	 */
	public void setInvCustCntCd(String invCustCntCd) {
		this.invCustCntCd = invCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param invOrgOfcCd
	 */
	public void setInvOrgOfcCd(String invOrgOfcCd) {
		this.invOrgOfcCd = invOrgOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vvdTrnsFlg
	 */
	public void setVvdTrnsFlg(String vvdTrnsFlg) {
		this.vvdTrnsFlg = vvdTrnsFlg;
	}
	
	/**
	 * Column Info
	 * @param invCoaVoyNo
	 */
	public void setInvCoaVoyNo(String invCoaVoyNo) {
		this.invCoaVoyNo = invCoaVoyNo;
	}
	
	/**
	 * Column Info
	 * @param cgoWgt
	 */
	public void setCgoWgt(String cgoWgt) {
		this.cgoWgt = cgoWgt;
	}
	
	/**
	 * Column Info
	 * @param revSkdVoyNo
	 */
	public void setRevSkdVoyNo(String revSkdVoyNo) {
		this.revSkdVoyNo = revSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param bkgCorrNo
	 */
	public void setBkgCorrNo(String bkgCorrNo) {
		this.bkgCorrNo = bkgCorrNo;
	}
	
	/**
	 * Column Info
	 * @param xchRtN3rdTpCd
	 */
	public void setXchRtN3rdTpCd(String xchRtN3rdTpCd) {
		this.xchRtN3rdTpCd = xchRtN3rdTpCd;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param frtFwrdCustSeq
	 */
	public void setFrtFwrdCustSeq(String frtFwrdCustSeq) {
		this.frtFwrdCustSeq = frtFwrdCustSeq;
	}
	
	/**
	 * Column Info
	 * @param hjsRefNo
	 */
	public void setHjsRefNo(String hjsRefNo) {
		this.hjsRefNo = hjsRefNo;
	}
	
	/**
	 * Column Info
	 * @param whfDeclDirCd
	 */
	public void setWhfDeclDirCd(String whfDeclDirCd) {
		this.whfDeclDirCd = whfDeclDirCd;
	}
	
	/**
	 * Column Info
	 * @param custCrFlg
	 */
	public void setCustCrFlg(String custCrFlg) {
		this.custCrFlg = custCrFlg;
	}
	
	/**
	 * Column Info
	 * @param sailDt
	 */
	public void setSailDt(String sailDt) {
		this.sailDt = sailDt;
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
	 * @param bkgTeuQty
	 */
	public void setBkgTeuQty(String bkgTeuQty) {
		this.bkgTeuQty = bkgTeuQty;
	}
	
	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param whfDeclCfmDt
	 */
	public void setWhfDeclCfmDt(String whfDeclCfmDt) {
		this.whfDeclCfmDt = whfDeclCfmDt;
	}
	
	/**
	 * Column Info
	 * @param arTaxIndCd
	 */
	public void setArTaxIndCd(String arTaxIndCd) {
		this.arTaxIndCd = arTaxIndCd;
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
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdDirCd
	 */
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param revSrcCd
	 */
	public void setRevSrcCd(String revSrcCd) {
		this.revSrcCd = revSrcCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaInterCoCd
	 */
	public void setInvCoaInterCoCd(String invCoaInterCoCd) {
		this.invCoaInterCoCd = invCoaInterCoCd;
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
	 * @param invCoaVslCd
	 */
	public void setInvCoaVslCd(String invCoaVslCd) {
		this.invCoaVslCd = invCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCorrDt
	 */
	public void setBkgCorrDt(String bkgCorrDt) {
		this.bkgCorrDt = bkgCorrDt;
	}
	
	/**
	 * Column Info
	 * @param arInvSrcCd
	 */
	public void setArInvSrcCd(String arInvSrcCd) {
		this.arInvSrcCd = arInvSrcCd;
	}
	
	/**
	 * Column Info
	 * @param invRefNo
	 */
	public void setInvRefNo(String invRefNo) {
		this.invRefNo = invRefNo;
	}
	
	/**
	 * Column Info
	 * @param invCustSeq
	 */
	public void setInvCustSeq(String invCustSeq) {
		this.invCustSeq = invCustSeq;
	}
	
	/**
	 * Column Info
	 * @param slpNo
	 */
	public void setSlpNo(String slpNo) {
		this.slpNo = slpNo;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
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
	 * @param trspRqstOrdFlg
	 */
	public void setTrspRqstOrdFlg(String trspRqstOrdFlg) {
		this.trspRqstOrdFlg = trspRqstOrdFlg;
	}
	
	/**
	 * Column Info
	 * @param blTpCd
	 */
	public void setBlTpCd(String blTpCd) {
		this.blTpCd = blTpCd;
	}
	
	/**
	 * Column Info
	 * @param obrdDt
	 */
	public void setObrdDt(String obrdDt) {
		this.obrdDt = obrdDt;
	}
	
	/**
	 * Column Info
	 * @param bkgRefNo
	 */
	public void setBkgRefNo(String bkgRefNo) {
		this.bkgRefNo = bkgRefNo;
	}
	
	/**
	 * Column Info
	 * @param whfDeclApIfDt
	 */
	public void setWhfDeclApIfDt(String whfDeclApIfDt) {
		this.whfDeclApIfDt = whfDeclApIfDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setInvCoaRevDirCd(JSPUtil.getParameter(request, "inv_coa_rev_dir_cd", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setUsdXchRt(JSPUtil.getParameter(request, "usd_xch_rt", ""));
		setWhfDeclNo(JSPUtil.getParameter(request, "whf_decl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvCoaAcctCd(JSPUtil.getParameter(request, "inv_coa_acct_cd", ""));
		setInvVvdCxlCd(JSPUtil.getParameter(request, "inv_vvd_cxl_cd", ""));
		setDestTrnsSvcModCd(JSPUtil.getParameter(request, "dest_trns_svc_mod_cd", ""));
		setXchRtUsdTpCd(JSPUtil.getParameter(request, "xch_rt_usd_tp_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setMstBlNo(JSPUtil.getParameter(request, "mst_bl_no", ""));
		setInvCoaRgnCd(JSPUtil.getParameter(request, "inv_coa_rgn_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setZnIocCd(JSPUtil.getParameter(request, "zn_ioc_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setInvCoaCtrCd(JSPUtil.getParameter(request, "inv_coa_ctr_cd", ""));
		setRevVslCd(JSPUtil.getParameter(request, "rev_vsl_cd", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setWhfDeclVoyNo(JSPUtil.getParameter(request, "whf_decl_voy_no", ""));
		setBlInvCfmDt(JSPUtil.getParameter(request, "bl_inv_cfm_dt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setSiRefNo(JSPUtil.getParameter(request, "si_ref_no", ""));
		setErpIfGlDt(JSPUtil.getParameter(request, "erp_if_gl_dt", ""));
		setAcctXchRtYrmon(JSPUtil.getParameter(request, "acct_xch_rt_yrmon", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
		setEdiSndDt(JSPUtil.getParameter(request, "edi_snd_dt", ""));
		setInvTtlLoclAmt(JSPUtil.getParameter(request, "inv_ttl_locl_amt", ""));
		setWhfDeclOfcCd(JSPUtil.getParameter(request, "whf_decl_ofc_cd", ""));
		setClrStsFlg(JSPUtil.getParameter(request, "clr_sts_flg", ""));
		setBkgFeuQty(JSPUtil.getParameter(request, "bkg_feu_qty", ""));
		setErpIfOfcCd(JSPUtil.getParameter(request, "erp_if_ofc_cd", ""));
		setArIfNo(JSPUtil.getParameter(request, "ar_if_no", ""));
		setWhfDeclVslCd(JSPUtil.getParameter(request, "whf_decl_vsl_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setActCustCntCd(JSPUtil.getParameter(request, "act_cust_cnt_cd", ""));
		setDueDt(JSPUtil.getParameter(request, "due_dt", ""));
		setCgoMeasQty(JSPUtil.getParameter(request, "cgo_meas_qty", ""));
		setCrTermDys(JSPUtil.getParameter(request, "cr_term_dys", ""));
		setBlInvIfDt(JSPUtil.getParameter(request, "bl_inv_if_dt", ""));
		setBlSrcNo(JSPUtil.getParameter(request, "bl_src_no", ""));
		setRevSkdDirCd(JSPUtil.getParameter(request, "rev_skd_dir_cd", ""));
		setWhfMrnNo(JSPUtil.getParameter(request, "whf_mrn_no", ""));
		setGlEffDt(JSPUtil.getParameter(request, "gl_eff_dt", ""));
		setInvCoaSkdDirCd(JSPUtil.getParameter(request, "inv_coa_skd_dir_cd", ""));
		setActCustSeq(JSPUtil.getParameter(request, "act_cust_seq", ""));
		setRevTpCd(JSPUtil.getParameter(request, "rev_tp_cd", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setInvSplitCd(JSPUtil.getParameter(request, "inv_split_cd", ""));
		setInvSrcNo(JSPUtil.getParameter(request, "inv_src_no", ""));
		setApArOffstNo(JSPUtil.getParameter(request, "ap_ar_offst_no", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setInvRmk(JSPUtil.getParameter(request, "inv_rmk", ""));
		setClrDt(JSPUtil.getParameter(request, "clr_dt", ""));
		setInvDeltDivCd(JSPUtil.getParameter(request, "inv_delt_div_cd", ""));
		setFrtFwrdCntCd(JSPUtil.getParameter(request, "frt_fwrd_cnt_cd", ""));
		setXchRtDt(JSPUtil.getParameter(request, "xch_rt_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setTaxXchRt(JSPUtil.getParameter(request, "tax_xch_rt", ""));
		setIfSeq(JSPUtil.getParameter(request, "if_seq", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSrepCd(JSPUtil.getParameter(request, "srep_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setSailArrDt(JSPUtil.getParameter(request, "sail_arr_dt", ""));
		setInvCoaCoCd(JSPUtil.getParameter(request, "inv_coa_co_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setArCtyCd(JSPUtil.getParameter(request, "ar_cty_cd", ""));
		setInvCustCntCd(JSPUtil.getParameter(request, "inv_cust_cnt_cd", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setInvOrgOfcCd(JSPUtil.getParameter(request, "inv_org_ofc_cd", ""));
		setVvdTrnsFlg(JSPUtil.getParameter(request, "vvd_trns_flg", ""));
		setInvCoaVoyNo(JSPUtil.getParameter(request, "inv_coa_voy_no", ""));
		setCgoWgt(JSPUtil.getParameter(request, "cgo_wgt", ""));
		setRevSkdVoyNo(JSPUtil.getParameter(request, "rev_skd_voy_no", ""));
		setBkgCorrNo(JSPUtil.getParameter(request, "bkg_corr_no", ""));
		setXchRtN3rdTpCd(JSPUtil.getParameter(request, "xch_rt_n3rd_tp_cd", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setFrtFwrdCustSeq(JSPUtil.getParameter(request, "frt_fwrd_cust_seq", ""));
		setHjsRefNo(JSPUtil.getParameter(request, "hjs_ref_no", ""));
		setWhfDeclDirCd(JSPUtil.getParameter(request, "whf_decl_dir_cd", ""));
		setCustCrFlg(JSPUtil.getParameter(request, "cust_cr_flg", ""));
		setSailDt(JSPUtil.getParameter(request, "sail_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgTeuQty(JSPUtil.getParameter(request, "bkg_teu_qty", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setWhfDeclCfmDt(JSPUtil.getParameter(request, "whf_decl_cfm_dt", ""));
		setArTaxIndCd(JSPUtil.getParameter(request, "ar_tax_ind_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRevSrcCd(JSPUtil.getParameter(request, "rev_src_cd", ""));
		setInvCoaInterCoCd(JSPUtil.getParameter(request, "inv_coa_inter_co_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvCoaVslCd(JSPUtil.getParameter(request, "inv_coa_vsl_cd", ""));
		setBkgCorrDt(JSPUtil.getParameter(request, "bkg_corr_dt", ""));
		setArInvSrcCd(JSPUtil.getParameter(request, "ar_inv_src_cd", ""));
		setInvRefNo(JSPUtil.getParameter(request, "inv_ref_no", ""));
		setInvCustSeq(JSPUtil.getParameter(request, "inv_cust_seq", ""));
		setSlpNo(JSPUtil.getParameter(request, "slp_no", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setTrspRqstOrdFlg(JSPUtil.getParameter(request, "trsp_rqst_ord_flg", ""));
		setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
		setObrdDt(JSPUtil.getParameter(request, "obrd_dt", ""));
		setBkgRefNo(JSPUtil.getParameter(request, "bkg_ref_no", ""));
		setWhfDeclApIfDt(JSPUtil.getParameter(request, "whf_decl_ap_if_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InvArMnVO[]
	 */
	public InvArMnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InvArMnVO[]
	 */
	public InvArMnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArMnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd".trim(), length));
			String[] invCoaRevDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rev_dir_cd".trim(), length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg".trim(), length));
			String[] usdXchRt = (JSPUtil.getParameter(request, prefix	+ "usd_xch_rt".trim(), length));
			String[] whfDeclNo = (JSPUtil.getParameter(request, prefix	+ "whf_decl_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] invCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_acct_cd".trim(), length));
			String[] invVvdCxlCd = (JSPUtil.getParameter(request, prefix	+ "inv_vvd_cxl_cd".trim(), length));
			String[] destTrnsSvcModCd = (JSPUtil.getParameter(request, prefix	+ "dest_trns_svc_mod_cd".trim(), length));
			String[] xchRtUsdTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_usd_tp_cd".trim(), length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd".trim(), length));
			String[] mstBlNo = (JSPUtil.getParameter(request, prefix	+ "mst_bl_no".trim(), length));
			String[] invCoaRgnCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rgn_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] znIocCd = (JSPUtil.getParameter(request, prefix	+ "zn_ioc_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] invCoaCtrCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_ctr_cd".trim(), length));
			String[] revVslCd = (JSPUtil.getParameter(request, prefix	+ "rev_vsl_cd".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] whfDeclVoyNo = (JSPUtil.getParameter(request, prefix	+ "whf_decl_voy_no".trim(), length));
			String[] blInvCfmDt = (JSPUtil.getParameter(request, prefix	+ "bl_inv_cfm_dt".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] siRefNo = (JSPUtil.getParameter(request, prefix	+ "si_ref_no".trim(), length));
			String[] erpIfGlDt = (JSPUtil.getParameter(request, prefix	+ "erp_if_gl_dt".trim(), length));
			String[] acctXchRtYrmon = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt_yrmon".trim(), length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd".trim(), length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no".trim(), length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt".trim(), length));
			String[] invTtlLoclAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ttl_locl_amt".trim(), length));
			String[] whfDeclOfcCd = (JSPUtil.getParameter(request, prefix	+ "whf_decl_ofc_cd".trim(), length));
			String[] clrStsFlg = (JSPUtil.getParameter(request, prefix	+ "clr_sts_flg".trim(), length));
			String[] bkgFeuQty = (JSPUtil.getParameter(request, prefix	+ "bkg_feu_qty".trim(), length));
			String[] erpIfOfcCd = (JSPUtil.getParameter(request, prefix	+ "erp_if_ofc_cd".trim(), length));
			String[] arIfNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_no".trim(), length));
			String[] whfDeclVslCd = (JSPUtil.getParameter(request, prefix	+ "whf_decl_vsl_cd".trim(), length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd".trim(), length));
			String[] dueDt = (JSPUtil.getParameter(request, prefix	+ "due_dt".trim(), length));
			String[] cgoMeasQty = (JSPUtil.getParameter(request, prefix	+ "cgo_meas_qty".trim(), length));
			String[] crTermDys = (JSPUtil.getParameter(request, prefix	+ "cr_term_dys".trim(), length));
			String[] blInvIfDt = (JSPUtil.getParameter(request, prefix	+ "bl_inv_if_dt".trim(), length));
			String[] blSrcNo = (JSPUtil.getParameter(request, prefix	+ "bl_src_no".trim(), length));
			String[] revSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_skd_dir_cd".trim(), length));
			String[] whfMrnNo = (JSPUtil.getParameter(request, prefix	+ "whf_mrn_no".trim(), length));
			String[] glEffDt = (JSPUtil.getParameter(request, prefix	+ "gl_eff_dt".trim(), length));
			String[] invCoaSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_skd_dir_cd".trim(), length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq".trim(), length));
			String[] revTpCd = (JSPUtil.getParameter(request, prefix	+ "rev_tp_cd".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] invSplitCd = (JSPUtil.getParameter(request, prefix	+ "inv_split_cd".trim(), length));
			String[] invSrcNo = (JSPUtil.getParameter(request, prefix	+ "inv_src_no".trim(), length));
			String[] apArOffstNo = (JSPUtil.getParameter(request, prefix	+ "ap_ar_offst_no".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			String[] invRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rmk".trim(), length));
			String[] clrDt = (JSPUtil.getParameter(request, prefix	+ "clr_dt".trim(), length));
			String[] invDeltDivCd = (JSPUtil.getParameter(request, prefix	+ "inv_delt_div_cd".trim(), length));
			String[] frtFwrdCntCd = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cnt_cd".trim(), length));
			String[] xchRtDt = (JSPUtil.getParameter(request, prefix	+ "xch_rt_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] taxXchRt = (JSPUtil.getParameter(request, prefix	+ "tax_xch_rt".trim(), length));
			String[] ifSeq = (JSPUtil.getParameter(request, prefix	+ "if_seq".trim(), length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd".trim(), length));
			String[] srepCd = (JSPUtil.getParameter(request, prefix	+ "srep_cd".trim(), length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt".trim(), length));
			String[] invCoaCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_co_cd".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] arCtyCd = (JSPUtil.getParameter(request, prefix	+ "ar_cty_cd".trim(), length));
			String[] invCustCntCd = (JSPUtil.getParameter(request, prefix	+ "inv_cust_cnt_cd".trim(), length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no".trim(), length));
			String[] invOrgOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_org_ofc_cd".trim(), length));
			String[] vvdTrnsFlg = (JSPUtil.getParameter(request, prefix	+ "vvd_trns_flg".trim(), length));
			String[] invCoaVoyNo = (JSPUtil.getParameter(request, prefix	+ "inv_coa_voy_no".trim(), length));
			String[] cgoWgt = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt".trim(), length));
			String[] revSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "rev_skd_voy_no".trim(), length));
			String[] bkgCorrNo = (JSPUtil.getParameter(request, prefix	+ "bkg_corr_no".trim(), length));
			String[] xchRtN3rdTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_n3rd_tp_cd".trim(), length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd".trim(), length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd".trim(), length));
			String[] frtFwrdCustSeq = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cust_seq".trim(), length));
			String[] hjsRefNo = (JSPUtil.getParameter(request, prefix	+ "hjs_ref_no".trim(), length));
			String[] whfDeclDirCd = (JSPUtil.getParameter(request, prefix	+ "whf_decl_dir_cd".trim(), length));
			String[] custCrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_cr_flg".trim(), length));
			String[] sailDt = (JSPUtil.getParameter(request, prefix	+ "sail_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bkgTeuQty = (JSPUtil.getParameter(request, prefix	+ "bkg_teu_qty".trim(), length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd".trim(), length));
			String[] whfDeclCfmDt = (JSPUtil.getParameter(request, prefix	+ "whf_decl_cfm_dt".trim(), length));
			String[] arTaxIndCd = (JSPUtil.getParameter(request, prefix	+ "ar_tax_ind_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no".trim(), length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] revSrcCd = (JSPUtil.getParameter(request, prefix	+ "rev_src_cd".trim(), length));
			String[] invCoaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_inter_co_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] invCoaVslCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_vsl_cd".trim(), length));
			String[] bkgCorrDt = (JSPUtil.getParameter(request, prefix	+ "bkg_corr_dt".trim(), length));
			String[] arInvSrcCd = (JSPUtil.getParameter(request, prefix	+ "ar_inv_src_cd".trim(), length));
			String[] invRefNo = (JSPUtil.getParameter(request, prefix	+ "inv_ref_no".trim(), length));
			String[] invCustSeq = (JSPUtil.getParameter(request, prefix	+ "inv_cust_seq".trim(), length));
			String[] slpNo = (JSPUtil.getParameter(request, prefix	+ "slp_no".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] trspRqstOrdFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_rqst_ord_flg".trim(), length));
			String[] blTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_tp_cd".trim(), length));
			String[] obrdDt = (JSPUtil.getParameter(request, prefix	+ "obrd_dt".trim(), length));
			String[] bkgRefNo = (JSPUtil.getParameter(request, prefix	+ "bkg_ref_no".trim(), length));
			String[] whfDeclApIfDt = (JSPUtil.getParameter(request, prefix	+ "whf_decl_ap_if_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArMnVO();
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (invCoaRevDirCd[i] != null)
					model.setInvCoaRevDirCd(invCoaRevDirCd[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (usdXchRt[i] != null)
					model.setUsdXchRt(usdXchRt[i]);
				if (whfDeclNo[i] != null)
					model.setWhfDeclNo(whfDeclNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invCoaAcctCd[i] != null)
					model.setInvCoaAcctCd(invCoaAcctCd[i]);
				if (invVvdCxlCd[i] != null)
					model.setInvVvdCxlCd(invVvdCxlCd[i]);
				if (destTrnsSvcModCd[i] != null)
					model.setDestTrnsSvcModCd(destTrnsSvcModCd[i]);
				if (xchRtUsdTpCd[i] != null)
					model.setXchRtUsdTpCd(xchRtUsdTpCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (mstBlNo[i] != null)
					model.setMstBlNo(mstBlNo[i]);
				if (invCoaRgnCd[i] != null)
					model.setInvCoaRgnCd(invCoaRgnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (znIocCd[i] != null)
					model.setZnIocCd(znIocCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (invCoaCtrCd[i] != null)
					model.setInvCoaCtrCd(invCoaCtrCd[i]);
				if (revVslCd[i] != null)
					model.setRevVslCd(revVslCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (whfDeclVoyNo[i] != null)
					model.setWhfDeclVoyNo(whfDeclVoyNo[i]);
				if (blInvCfmDt[i] != null)
					model.setBlInvCfmDt(blInvCfmDt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (siRefNo[i] != null)
					model.setSiRefNo(siRefNo[i]);
				if (erpIfGlDt[i] != null)
					model.setErpIfGlDt(erpIfGlDt[i]);
				if (acctXchRtYrmon[i] != null)
					model.setAcctXchRtYrmon(acctXchRtYrmon[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				if (invTtlLoclAmt[i] != null)
					model.setInvTtlLoclAmt(invTtlLoclAmt[i]);
				if (whfDeclOfcCd[i] != null)
					model.setWhfDeclOfcCd(whfDeclOfcCd[i]);
				if (clrStsFlg[i] != null)
					model.setClrStsFlg(clrStsFlg[i]);
				if (bkgFeuQty[i] != null)
					model.setBkgFeuQty(bkgFeuQty[i]);
				if (erpIfOfcCd[i] != null)
					model.setErpIfOfcCd(erpIfOfcCd[i]);
				if (arIfNo[i] != null)
					model.setArIfNo(arIfNo[i]);
				if (whfDeclVslCd[i] != null)
					model.setWhfDeclVslCd(whfDeclVslCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (dueDt[i] != null)
					model.setDueDt(dueDt[i]);
				if (cgoMeasQty[i] != null)
					model.setCgoMeasQty(cgoMeasQty[i]);
				if (crTermDys[i] != null)
					model.setCrTermDys(crTermDys[i]);
				if (blInvIfDt[i] != null)
					model.setBlInvIfDt(blInvIfDt[i]);
				if (blSrcNo[i] != null)
					model.setBlSrcNo(blSrcNo[i]);
				if (revSkdDirCd[i] != null)
					model.setRevSkdDirCd(revSkdDirCd[i]);
				if (whfMrnNo[i] != null)
					model.setWhfMrnNo(whfMrnNo[i]);
				if (glEffDt[i] != null)
					model.setGlEffDt(glEffDt[i]);
				if (invCoaSkdDirCd[i] != null)
					model.setInvCoaSkdDirCd(invCoaSkdDirCd[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (revTpCd[i] != null)
					model.setRevTpCd(revTpCd[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (invSplitCd[i] != null)
					model.setInvSplitCd(invSplitCd[i]);
				if (invSrcNo[i] != null)
					model.setInvSrcNo(invSrcNo[i]);
				if (apArOffstNo[i] != null)
					model.setApArOffstNo(apArOffstNo[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (invRmk[i] != null)
					model.setInvRmk(invRmk[i]);
				if (clrDt[i] != null)
					model.setClrDt(clrDt[i]);
				if (invDeltDivCd[i] != null)
					model.setInvDeltDivCd(invDeltDivCd[i]);
				if (frtFwrdCntCd[i] != null)
					model.setFrtFwrdCntCd(frtFwrdCntCd[i]);
				if (xchRtDt[i] != null)
					model.setXchRtDt(xchRtDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (taxXchRt[i] != null)
					model.setTaxXchRt(taxXchRt[i]);
				if (ifSeq[i] != null)
					model.setIfSeq(ifSeq[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (invCoaCoCd[i] != null)
					model.setInvCoaCoCd(invCoaCoCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (arCtyCd[i] != null)
					model.setArCtyCd(arCtyCd[i]);
				if (invCustCntCd[i] != null)
					model.setInvCustCntCd(invCustCntCd[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (invOrgOfcCd[i] != null)
					model.setInvOrgOfcCd(invOrgOfcCd[i]);
				if (vvdTrnsFlg[i] != null)
					model.setVvdTrnsFlg(vvdTrnsFlg[i]);
				if (invCoaVoyNo[i] != null)
					model.setInvCoaVoyNo(invCoaVoyNo[i]);
				if (cgoWgt[i] != null)
					model.setCgoWgt(cgoWgt[i]);
				if (revSkdVoyNo[i] != null)
					model.setRevSkdVoyNo(revSkdVoyNo[i]);
				if (bkgCorrNo[i] != null)
					model.setBkgCorrNo(bkgCorrNo[i]);
				if (xchRtN3rdTpCd[i] != null)
					model.setXchRtN3rdTpCd(xchRtN3rdTpCd[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (frtFwrdCustSeq[i] != null)
					model.setFrtFwrdCustSeq(frtFwrdCustSeq[i]);
				if (hjsRefNo[i] != null)
					model.setHjsRefNo(hjsRefNo[i]);
				if (whfDeclDirCd[i] != null)
					model.setWhfDeclDirCd(whfDeclDirCd[i]);
				if (custCrFlg[i] != null)
					model.setCustCrFlg(custCrFlg[i]);
				if (sailDt[i] != null)
					model.setSailDt(sailDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgTeuQty[i] != null)
					model.setBkgTeuQty(bkgTeuQty[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (whfDeclCfmDt[i] != null)
					model.setWhfDeclCfmDt(whfDeclCfmDt[i]);
				if (arTaxIndCd[i] != null)
					model.setArTaxIndCd(arTaxIndCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (revSrcCd[i] != null)
					model.setRevSrcCd(revSrcCd[i]);
				if (invCoaInterCoCd[i] != null)
					model.setInvCoaInterCoCd(invCoaInterCoCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invCoaVslCd[i] != null)
					model.setInvCoaVslCd(invCoaVslCd[i]);
				if (bkgCorrDt[i] != null)
					model.setBkgCorrDt(bkgCorrDt[i]);
				if (arInvSrcCd[i] != null)
					model.setArInvSrcCd(arInvSrcCd[i]);
				if (invRefNo[i] != null)
					model.setInvRefNo(invRefNo[i]);
				if (invCustSeq[i] != null)
					model.setInvCustSeq(invCustSeq[i]);
				if (slpNo[i] != null)
					model.setSlpNo(slpNo[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (trspRqstOrdFlg[i] != null)
					model.setTrspRqstOrdFlg(trspRqstOrdFlg[i]);
				if (blTpCd[i] != null)
					model.setBlTpCd(blTpCd[i]);
				if (obrdDt[i] != null)
					model.setObrdDt(obrdDt[i]);
				if (bkgRefNo[i] != null)
					model.setBkgRefNo(bkgRefNo[i]);
				if (whfDeclApIfDt[i] != null)
					model.setWhfDeclApIfDt(whfDeclApIfDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInvArMnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InvArMnVO[]
	 */
	public InvArMnVO[] getInvArMnVOs(){
		InvArMnVO[] vos = (InvArMnVO[])models.toArray(new InvArMnVO[models.size()]);
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
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRevDirCd = this.invCoaRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdXchRt = this.usdXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclNo = this.whfDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaAcctCd = this.invCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVvdCxlCd = this.invVvdCxlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destTrnsSvcModCd = this.destTrnsSvcModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtUsdTpCd = this.xchRtUsdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mstBlNo = this.mstBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRgnCd = this.invCoaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znIocCd = this.znIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCtrCd = this.invCoaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revVslCd = this.revVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclVoyNo = this.whfDeclVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blInvCfmDt = this.blInvCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siRefNo = this.siRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfGlDt = this.erpIfGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRtYrmon = this.acctXchRtYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTtlLoclAmt = this.invTtlLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclOfcCd = this.whfDeclOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clrStsFlg = this.clrStsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgFeuQty = this.bkgFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfOfcCd = this.erpIfOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfNo = this.arIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclVslCd = this.whfDeclVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dueDt = this.dueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoMeasQty = this.cgoMeasQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crTermDys = this.crTermDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blInvIfDt = this.blInvIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blSrcNo = this.blSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdDirCd = this.revSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfMrnNo = this.whfMrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glEffDt = this.glEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaSkdDirCd = this.invCoaSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revTpCd = this.revTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSplitCd = this.invSplitCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSrcNo = this.invSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apArOffstNo = this.apArOffstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRmk = this.invRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clrDt = this.clrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDeltDivCd = this.invDeltDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCntCd = this.frtFwrdCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtDt = this.xchRtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxXchRt = this.taxXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSeq = this.ifSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCoCd = this.invCoaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arCtyCd = this.arCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCustCntCd = this.invCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOrgOfcCd = this.invOrgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdTrnsFlg = this.vvdTrnsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVoyNo = this.invCoaVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgt = this.cgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdVoyNo = this.revSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCorrNo = this.bkgCorrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtN3rdTpCd = this.xchRtN3rdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCustSeq = this.frtFwrdCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsRefNo = this.hjsRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclDirCd = this.whfDeclDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCrFlg = this.custCrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailDt = this.sailDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTeuQty = this.bkgTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclCfmDt = this.whfDeclCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arTaxIndCd = this.arTaxIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSrcCd = this.revSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaInterCoCd = this.invCoaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVslCd = this.invCoaVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCorrDt = this.bkgCorrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arInvSrcCd = this.arInvSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRefNo = this.invRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCustSeq = this.invCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpNo = this.slpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRqstOrdFlg = this.trspRqstOrdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blTpCd = this.blTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obrdDt = this.obrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRefNo = this.bkgRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclApIfDt = this.whfDeclApIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
