/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooArMnVO.java
*@FileTitle : JooArMnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.19
*@LastModifier : 박희동
*@LastVersion : 1.0
* 2009.05.19 박희동 
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
 * @author 박희동
 * @since J2EE 1.5
 */

public class JooArMnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooArMnVO> models = new ArrayList<JooArMnVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String invCoaRevDirCd = null;
	/* Column Info */
	private String taxXchRt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String invCtrtNo = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String invCoaCoCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invCoaAcctCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String invCustCntCd = null;
	/* Column Info */
	private String slsCtyCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String invCoaRgnCd = null;
	/* Column Info */
	private String invCoaVoyNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String znIocCd = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String revSkdVoyNo = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String invCoaCtrCd = null;
	/* Column Info */
	private String revVslCd = null;
	/* Column Info */
	private String custCrFlg = null;
	/* Column Info */
	private String sailDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String errMsg = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String arIfSerNo = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String xchRtTpCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String arTaxIndCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String logUpdDt = null;
	/* Column Info */
	private String issDt = null;
	/* Column Info */
	private String revDirCd = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String arIfNo = null;
	/* Column Info */
	private String actCustCntCd = null;
	/* Column Info */
	private String erpIfFlg = null;
	/* Column Info */
	private String invCoaInterCoCd = null;
	/* Column Info */
	private String dueDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invCoaVslCd = null;
	/* Column Info */
	private String crTermDys = null;
	/* Column Info */
	private String revSkdDirCd = null;
	/* Column Info */
	private String invCustSeq = null;
	/* Column Info */
	private String invCoaSkdDirCd = null;
	/* Column Info */
	private String arSrcCd = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String loclAmt = null;
	/* Column Info */
	private String slpNo = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String erpIfDt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String usdAmt = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String invRmk = null;
	/* Column Info */
	private String csrOffstNo = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooArMnVO() {}

	public JooArMnVO(String ibflag, String pagerows, String arIfNo, String arIfSerNo, String blNo, String arSrcCd, String invNo, String rhqCd, String arOfcCd, String actCustCntCd, String actCustSeq, String invCustCntCd, String invCustSeq, String vslCd, String skdVoyNo, String skdDirCd, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String revVslCd, String revSkdVoyNo, String revSkdDirCd, String revDirCd, String sailArrDt, String porCd, String polCd, String podCd, String delCd, String slanCd, String ioBndCd, String custCrFlg, String dueDt, String usdAmt, String loclAmt, String znIocCd, String erpIfFlg, String erpIfDt, String errMsg, String rlaneCd, String invCtrtNo, String crTermDys, String sailDt, String xchRtTpCd, String arTaxIndCd, String slsOfcCd, String invRmk, String invCoaCoCd, String invCoaRgnCd, String invCoaCtrCd, String invCoaAcctCd, String invCoaInterCoCd, String invCoaVslCd, String invCoaVoyNo, String invCoaSkdDirCd, String invCoaRevDirCd, String glDt, String taxXchRt, String slsCtyCd, String currCd, String usrId, String logUpdDt, String issDt, String slpNo, String csrOffstNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.glDt = glDt;
		this.invCoaRevDirCd = invCoaRevDirCd;
		this.taxXchRt = taxXchRt;
		this.rlaneCd = rlaneCd;
		this.invCtrtNo = invCtrtNo;
		this.sailArrDt = sailArrDt;
		this.blNo = blNo;
		this.invCoaCoCd = invCoaCoCd;
		this.pagerows = pagerows;
		this.invCoaAcctCd = invCoaAcctCd;
		this.polCd = polCd;
		this.invCustCntCd = invCustCntCd;
		this.slsCtyCd = slsCtyCd;
		this.slsOfcCd = slsOfcCd;
		this.invCoaRgnCd = invCoaRgnCd;
		this.invCoaVoyNo = invCoaVoyNo;
		this.updUsrId = updUsrId;
		this.znIocCd = znIocCd;
		this.rhqCd = rhqCd;
		this.revSkdVoyNo = revSkdVoyNo;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.invCoaCtrCd = invCoaCtrCd;
		this.revVslCd = revVslCd;
		this.custCrFlg = custCrFlg;
		this.sailDt = sailDt;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.errMsg = errMsg;
		this.trnkVslCd = trnkVslCd;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.arIfSerNo = arIfSerNo;
		this.porCd = porCd;
		this.xchRtTpCd = xchRtTpCd;
		this.currCd = currCd;
		this.arTaxIndCd = arTaxIndCd;
		this.creDt = creDt;
		this.logUpdDt = logUpdDt;
		this.issDt = issDt;
		this.revDirCd = revDirCd;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.ibflag = ibflag;
		this.usrId = usrId;
		this.arIfNo = arIfNo;
		this.actCustCntCd = actCustCntCd;
		this.erpIfFlg = erpIfFlg;
		this.invCoaInterCoCd = invCoaInterCoCd;
		this.dueDt = dueDt;
		this.updDt = updDt;
		this.invCoaVslCd = invCoaVslCd;
		this.crTermDys = crTermDys;
		this.revSkdDirCd = revSkdDirCd;
		this.invCustSeq = invCustSeq;
		this.invCoaSkdDirCd = invCoaSkdDirCd;
		this.arSrcCd = arSrcCd;
		this.actCustSeq = actCustSeq;
		this.loclAmt = loclAmt;
		this.slpNo = slpNo;
		this.ioBndCd = ioBndCd;
		this.skdDirCd = skdDirCd;
		this.arOfcCd = arOfcCd;
		this.erpIfDt = erpIfDt;
		this.invNo = invNo;
		this.usdAmt = usdAmt;
		this.slanCd = slanCd;
		this.invRmk = invRmk;
		this.csrOffstNo = csrOffstNo;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("inv_coa_rev_dir_cd", getInvCoaRevDirCd());
		this.hashColumns.put("tax_xch_rt", getTaxXchRt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("inv_ctrt_no", getInvCtrtNo());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("inv_coa_co_cd", getInvCoaCoCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_coa_acct_cd", getInvCoaAcctCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("inv_cust_cnt_cd", getInvCustCntCd());
		this.hashColumns.put("sls_cty_cd", getSlsCtyCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("inv_coa_rgn_cd", getInvCoaRgnCd());
		this.hashColumns.put("inv_coa_voy_no", getInvCoaVoyNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("zn_ioc_cd", getZnIocCd());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("rev_skd_voy_no", getRevSkdVoyNo());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("inv_coa_ctr_cd", getInvCoaCtrCd());
		this.hashColumns.put("rev_vsl_cd", getRevVslCd());
		this.hashColumns.put("cust_cr_flg", getCustCrFlg());
		this.hashColumns.put("sail_dt", getSailDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("err_msg", getErrMsg());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("ar_if_ser_no", getArIfSerNo());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("xch_rt_tp_cd", getXchRtTpCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ar_tax_ind_cd", getArTaxIndCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("log_upd_dt", getLogUpdDt());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("ar_if_no", getArIfNo());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("erp_if_flg", getErpIfFlg());
		this.hashColumns.put("inv_coa_inter_co_cd", getInvCoaInterCoCd());
		this.hashColumns.put("due_dt", getDueDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_coa_vsl_cd", getInvCoaVslCd());
		this.hashColumns.put("cr_term_dys", getCrTermDys());
		this.hashColumns.put("rev_skd_dir_cd", getRevSkdDirCd());
		this.hashColumns.put("inv_cust_seq", getInvCustSeq());
		this.hashColumns.put("inv_coa_skd_dir_cd", getInvCoaSkdDirCd());
		this.hashColumns.put("ar_src_cd", getArSrcCd());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("locl_amt", getLoclAmt());
		this.hashColumns.put("slp_no", getSlpNo());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("erp_if_dt", getErpIfDt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("usd_amt", getUsdAmt());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("inv_rmk", getInvRmk());
		this.hashColumns.put("csr_offst_no", getCsrOffstNo());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("inv_coa_rev_dir_cd", "invCoaRevDirCd");
		this.hashFields.put("tax_xch_rt", "taxXchRt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("inv_ctrt_no", "invCtrtNo");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("inv_coa_co_cd", "invCoaCoCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_coa_acct_cd", "invCoaAcctCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("inv_cust_cnt_cd", "invCustCntCd");
		this.hashFields.put("sls_cty_cd", "slsCtyCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("inv_coa_rgn_cd", "invCoaRgnCd");
		this.hashFields.put("inv_coa_voy_no", "invCoaVoyNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("zn_ioc_cd", "znIocCd");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("rev_skd_voy_no", "revSkdVoyNo");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("inv_coa_ctr_cd", "invCoaCtrCd");
		this.hashFields.put("rev_vsl_cd", "revVslCd");
		this.hashFields.put("cust_cr_flg", "custCrFlg");
		this.hashFields.put("sail_dt", "sailDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("err_msg", "errMsg");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("ar_if_ser_no", "arIfSerNo");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("xch_rt_tp_cd", "xchRtTpCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ar_tax_ind_cd", "arTaxIndCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("log_upd_dt", "logUpdDt");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("ar_if_no", "arIfNo");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("erp_if_flg", "erpIfFlg");
		this.hashFields.put("inv_coa_inter_co_cd", "invCoaInterCoCd");
		this.hashFields.put("due_dt", "dueDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_coa_vsl_cd", "invCoaVslCd");
		this.hashFields.put("cr_term_dys", "crTermDys");
		this.hashFields.put("rev_skd_dir_cd", "revSkdDirCd");
		this.hashFields.put("inv_cust_seq", "invCustSeq");
		this.hashFields.put("inv_coa_skd_dir_cd", "invCoaSkdDirCd");
		this.hashFields.put("ar_src_cd", "arSrcCd");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("locl_amt", "loclAmt");
		this.hashFields.put("slp_no", "slpNo");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("erp_if_dt", "erpIfDt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("usd_amt", "usdAmt");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("inv_rmk", "invRmk");
		this.hashFields.put("csr_offst_no", "csrOffstNo");
		return this.hashFields;
	}
	
	public String getVslCd() {
		return this.vslCd;
	}
	public String getGlDt() {
		return this.glDt;
	}
	public String getInvCoaRevDirCd() {
		return this.invCoaRevDirCd;
	}
	public String getTaxXchRt() {
		return this.taxXchRt;
	}
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	public String getInvCtrtNo() {
		return this.invCtrtNo;
	}
	public String getSailArrDt() {
		return this.sailArrDt;
	}
	public String getBlNo() {
		return this.blNo;
	}
	public String getInvCoaCoCd() {
		return this.invCoaCoCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getInvCoaAcctCd() {
		return this.invCoaAcctCd;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getInvCustCntCd() {
		return this.invCustCntCd;
	}
	public String getSlsCtyCd() {
		return this.slsCtyCd;
	}
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	public String getInvCoaRgnCd() {
		return this.invCoaRgnCd;
	}
	public String getInvCoaVoyNo() {
		return this.invCoaVoyNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getZnIocCd() {
		return this.znIocCd;
	}
	public String getRhqCd() {
		return this.rhqCd;
	}
	public String getRevSkdVoyNo() {
		return this.revSkdVoyNo;
	}
	public String getDelCd() {
		return this.delCd;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getInvCoaCtrCd() {
		return this.invCoaCtrCd;
	}
	public String getRevVslCd() {
		return this.revVslCd;
	}
	public String getCustCrFlg() {
		return this.custCrFlg;
	}
	public String getSailDt() {
		return this.sailDt;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getErrMsg() {
		return this.errMsg;
	}
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	public String getArIfSerNo() {
		return this.arIfSerNo;
	}
	public String getPorCd() {
		return this.porCd;
	}
	public String getXchRtTpCd() {
		return this.xchRtTpCd;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getArTaxIndCd() {
		return this.arTaxIndCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getLogUpdDt() {
		return this.logUpdDt;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getRevDirCd() {
		return this.revDirCd;
	}
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public String getArIfNo() {
		return this.arIfNo;
	}
	public String getActCustCntCd() {
		return this.actCustCntCd;
	}
	public String getErpIfFlg() {
		return this.erpIfFlg;
	}
	public String getInvCoaInterCoCd() {
		return this.invCoaInterCoCd;
	}
	public String getDueDt() {
		return this.dueDt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getInvCoaVslCd() {
		return this.invCoaVslCd;
	}
	public String getCrTermDys() {
		return this.crTermDys;
	}
	public String getRevSkdDirCd() {
		return this.revSkdDirCd;
	}
	public String getInvCustSeq() {
		return this.invCustSeq;
	}
	public String getInvCoaSkdDirCd() {
		return this.invCoaSkdDirCd;
	}
	public String getArSrcCd() {
		return this.arSrcCd;
	}
	public String getActCustSeq() {
		return this.actCustSeq;
	}
	public String getLoclAmt() {
		return this.loclAmt;
	}
	public String getSlpNo() {
		return this.slpNo;
	}
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getErpIfDt() {
		return this.erpIfDt;
	}
	public String getInvNo() {
		return this.invNo;
	}
	public String getUsdAmt() {
		return this.usdAmt;
	}
	public String getSlanCd() {
		return this.slanCd;
	}
	public String getInvRmk() {
		return this.invRmk;
	}
	public String getCsrOffstNo() {
		return this.csrOffstNo;
	}

	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setGlDt(String glDt) {
		this.glDt = glDt;
		//this.glDt=true;
	}
	public void setInvCoaRevDirCd(String invCoaRevDirCd) {
		this.invCoaRevDirCd = invCoaRevDirCd;
		//this.invCoaRevDirCd=true;
	}
	public void setTaxXchRt(String taxXchRt) {
		this.taxXchRt = taxXchRt;
		//this.taxXchRt=true;
	}
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
		//this.rlaneCd=true;
	}
	public void setInvCtrtNo(String invCtrtNo) {
		this.invCtrtNo = invCtrtNo;
		//this.invCtrtNo=true;
	}
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
		//this.sailArrDt=true;
	}
	public void setBlNo(String blNo) {
		this.blNo = blNo;
		//this.blNo=true;
	}
	public void setInvCoaCoCd(String invCoaCoCd) {
		this.invCoaCoCd = invCoaCoCd;
		//this.invCoaCoCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setInvCoaAcctCd(String invCoaAcctCd) {
		this.invCoaAcctCd = invCoaAcctCd;
		//this.invCoaAcctCd=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setInvCustCntCd(String invCustCntCd) {
		this.invCustCntCd = invCustCntCd;
		//this.invCustCntCd=true;
	}
	public void setSlsCtyCd(String slsCtyCd) {
		this.slsCtyCd = slsCtyCd;
		//this.slsCtyCd=true;
	}
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
		//this.slsOfcCd=true;
	}
	public void setInvCoaRgnCd(String invCoaRgnCd) {
		this.invCoaRgnCd = invCoaRgnCd;
		//this.invCoaRgnCd=true;
	}
	public void setInvCoaVoyNo(String invCoaVoyNo) {
		this.invCoaVoyNo = invCoaVoyNo;
		//this.invCoaVoyNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setZnIocCd(String znIocCd) {
		this.znIocCd = znIocCd;
		//this.znIocCd=true;
	}
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
		//this.rhqCd=true;
	}
	public void setRevSkdVoyNo(String revSkdVoyNo) {
		this.revSkdVoyNo = revSkdVoyNo;
		//this.revSkdVoyNo=true;
	}
	public void setDelCd(String delCd) {
		this.delCd = delCd;
		//this.delCd=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setInvCoaCtrCd(String invCoaCtrCd) {
		this.invCoaCtrCd = invCoaCtrCd;
		//this.invCoaCtrCd=true;
	}
	public void setRevVslCd(String revVslCd) {
		this.revVslCd = revVslCd;
		//this.revVslCd=true;
	}
	public void setCustCrFlg(String custCrFlg) {
		this.custCrFlg = custCrFlg;
		//this.custCrFlg=true;
	}
	public void setSailDt(String sailDt) {
		this.sailDt = sailDt;
		//this.sailDt=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
		//this.errMsg=true;
	}
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
		//this.trnkVslCd=true;
	}
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		//this.trnkSkdVoyNo=true;
	}
	public void setArIfSerNo(String arIfSerNo) {
		this.arIfSerNo = arIfSerNo;
		//this.arIfSerNo=true;
	}
	public void setPorCd(String porCd) {
		this.porCd = porCd;
		//this.porCd=true;
	}
	public void setXchRtTpCd(String xchRtTpCd) {
		this.xchRtTpCd = xchRtTpCd;
		//this.xchRtTpCd=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setArTaxIndCd(String arTaxIndCd) {
		this.arTaxIndCd = arTaxIndCd;
		//this.arTaxIndCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setLogUpdDt(String logUpdDt) {
		this.logUpdDt = logUpdDt;
		//this.logUpdDt=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
		//this.revDirCd=true;
	}
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
		//this.trnkSkdDirCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
		//this.usrId=true;
	}
	public void setArIfNo(String arIfNo) {
		this.arIfNo = arIfNo;
		//this.arIfNo=true;
	}
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
		//this.actCustCntCd=true;
	}
	public void setErpIfFlg(String erpIfFlg) {
		this.erpIfFlg = erpIfFlg;
		//this.erpIfFlg=true;
	}
	public void setInvCoaInterCoCd(String invCoaInterCoCd) {
		this.invCoaInterCoCd = invCoaInterCoCd;
		//this.invCoaInterCoCd=true;
	}
	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
		//this.dueDt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setInvCoaVslCd(String invCoaVslCd) {
		this.invCoaVslCd = invCoaVslCd;
		//this.invCoaVslCd=true;
	}
	public void setCrTermDys(String crTermDys) {
		this.crTermDys = crTermDys;
		//this.crTermDys=true;
	}
	public void setRevSkdDirCd(String revSkdDirCd) {
		this.revSkdDirCd = revSkdDirCd;
		//this.revSkdDirCd=true;
	}
	public void setInvCustSeq(String invCustSeq) {
		this.invCustSeq = invCustSeq;
		//this.invCustSeq=true;
	}
	public void setInvCoaSkdDirCd(String invCoaSkdDirCd) {
		this.invCoaSkdDirCd = invCoaSkdDirCd;
		//this.invCoaSkdDirCd=true;
	}
	public void setArSrcCd(String arSrcCd) {
		this.arSrcCd = arSrcCd;
		//this.arSrcCd=true;
	}
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
		//this.actCustSeq=true;
	}
	public void setLoclAmt(String loclAmt) {
		this.loclAmt = loclAmt;
		//this.loclAmt=true;
	}
	public void setSlpNo(String slpNo) {
		this.slpNo = slpNo;
		//this.slpNo=true;
	}
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
		//this.ioBndCd=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setErpIfDt(String erpIfDt) {
		this.erpIfDt = erpIfDt;
		//this.erpIfDt=true;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
		//this.invNo=true;
	}
	public void setUsdAmt(String usdAmt) {
		this.usdAmt = usdAmt;
		//this.usdAmt=true;
	}
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
		//this.slanCd=true;
	}
	public void setInvRmk(String invRmk) {
		this.invRmk = invRmk;
		//this.invRmk=true;
	}
	public void setCsrOffstNo(String csrOffstNo) {
		this.csrOffstNo = csrOffstNo;
		//this.csrOffstNo=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setInvCoaRevDirCd(JSPUtil.getParameter(request, "inv_coa_rev_dir_cd", ""));
		setTaxXchRt(JSPUtil.getParameter(request, "tax_xch_rt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setInvCtrtNo(JSPUtil.getParameter(request, "inv_ctrt_no", ""));
		setSailArrDt(JSPUtil.getParameter(request, "sail_arr_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setInvCoaCoCd(JSPUtil.getParameter(request, "inv_coa_co_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvCoaAcctCd(JSPUtil.getParameter(request, "inv_coa_acct_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setInvCustCntCd(JSPUtil.getParameter(request, "inv_cust_cnt_cd", ""));
		setSlsCtyCd(JSPUtil.getParameter(request, "sls_cty_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setInvCoaRgnCd(JSPUtil.getParameter(request, "inv_coa_rgn_cd", ""));
		setInvCoaVoyNo(JSPUtil.getParameter(request, "inv_coa_voy_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setZnIocCd(JSPUtil.getParameter(request, "zn_ioc_cd", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setRevSkdVoyNo(JSPUtil.getParameter(request, "rev_skd_voy_no", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setInvCoaCtrCd(JSPUtil.getParameter(request, "inv_coa_ctr_cd", ""));
		setRevVslCd(JSPUtil.getParameter(request, "rev_vsl_cd", ""));
		setCustCrFlg(JSPUtil.getParameter(request, "cust_cr_flg", ""));
		setSailDt(JSPUtil.getParameter(request, "sail_dt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setErrMsg(JSPUtil.getParameter(request, "err_msg", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
		setArIfSerNo(JSPUtil.getParameter(request, "ar_if_ser_no", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setXchRtTpCd(JSPUtil.getParameter(request, "xch_rt_tp_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setArTaxIndCd(JSPUtil.getParameter(request, "ar_tax_ind_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLogUpdDt(JSPUtil.getParameter(request, "log_upd_dt", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setArIfNo(JSPUtil.getParameter(request, "ar_if_no", ""));
		setActCustCntCd(JSPUtil.getParameter(request, "act_cust_cnt_cd", ""));
		setErpIfFlg(JSPUtil.getParameter(request, "erp_if_flg", ""));
		setInvCoaInterCoCd(JSPUtil.getParameter(request, "inv_coa_inter_co_cd", ""));
		setDueDt(JSPUtil.getParameter(request, "due_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvCoaVslCd(JSPUtil.getParameter(request, "inv_coa_vsl_cd", ""));
		setCrTermDys(JSPUtil.getParameter(request, "cr_term_dys", ""));
		setRevSkdDirCd(JSPUtil.getParameter(request, "rev_skd_dir_cd", ""));
		setInvCustSeq(JSPUtil.getParameter(request, "inv_cust_seq", ""));
		setInvCoaSkdDirCd(JSPUtil.getParameter(request, "inv_coa_skd_dir_cd", ""));
		setArSrcCd(JSPUtil.getParameter(request, "ar_src_cd", ""));
		setActCustSeq(JSPUtil.getParameter(request, "act_cust_seq", ""));
		setLoclAmt(JSPUtil.getParameter(request, "locl_amt", ""));
		setSlpNo(JSPUtil.getParameter(request, "slp_no", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setErpIfDt(JSPUtil.getParameter(request, "erp_if_dt", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setUsdAmt(JSPUtil.getParameter(request, "usd_amt", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setInvRmk(JSPUtil.getParameter(request, "inv_rmk", ""));
		setCsrOffstNo(JSPUtil.getParameter(request, "csr_offst_no", ""));
	}

	public JooArMnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public JooArMnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooArMnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt".trim(), length));
			String[] invCoaRevDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rev_dir_cd".trim(), length));
			String[] taxXchRt = (JSPUtil.getParameter(request, prefix	+ "tax_xch_rt".trim(), length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd".trim(), length));
			String[] invCtrtNo = (JSPUtil.getParameter(request, prefix	+ "inv_ctrt_no".trim(), length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt".trim(), length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] invCoaCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_co_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] invCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_acct_cd".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] invCustCntCd = (JSPUtil.getParameter(request, prefix	+ "inv_cust_cnt_cd".trim(), length));
			String[] slsCtyCd = (JSPUtil.getParameter(request, prefix	+ "sls_cty_cd".trim(), length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd".trim(), length));
			String[] invCoaRgnCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rgn_cd".trim(), length));
			String[] invCoaVoyNo = (JSPUtil.getParameter(request, prefix	+ "inv_coa_voy_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] znIocCd = (JSPUtil.getParameter(request, prefix	+ "zn_ioc_cd".trim(), length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd".trim(), length));
			String[] revSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "rev_skd_voy_no".trim(), length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] invCoaCtrCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_ctr_cd".trim(), length));
			String[] revVslCd = (JSPUtil.getParameter(request, prefix	+ "rev_vsl_cd".trim(), length));
			String[] custCrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_cr_flg".trim(), length));
			String[] sailDt = (JSPUtil.getParameter(request, prefix	+ "sail_dt".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] errMsg = (JSPUtil.getParameter(request, prefix	+ "err_msg".trim(), length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd".trim(), length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no".trim(), length));
			String[] arIfSerNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_ser_no".trim(), length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd".trim(), length));
			String[] xchRtTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_tp_cd".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] arTaxIndCd = (JSPUtil.getParameter(request, prefix	+ "ar_tax_ind_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] logUpdDt = (JSPUtil.getParameter(request, prefix	+ "log_upd_dt".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] arIfNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_no".trim(), length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd".trim(), length));
			String[] erpIfFlg = (JSPUtil.getParameter(request, prefix	+ "erp_if_flg".trim(), length));
			String[] invCoaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_inter_co_cd".trim(), length));
			String[] dueDt = (JSPUtil.getParameter(request, prefix	+ "due_dt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] invCoaVslCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_vsl_cd".trim(), length));
			String[] crTermDys = (JSPUtil.getParameter(request, prefix	+ "cr_term_dys".trim(), length));
			String[] revSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_skd_dir_cd".trim(), length));
			String[] invCustSeq = (JSPUtil.getParameter(request, prefix	+ "inv_cust_seq".trim(), length));
			String[] invCoaSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_skd_dir_cd".trim(), length));
			String[] arSrcCd = (JSPUtil.getParameter(request, prefix	+ "ar_src_cd".trim(), length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq".trim(), length));
			String[] loclAmt = (JSPUtil.getParameter(request, prefix	+ "locl_amt".trim(), length));
			String[] slpNo = (JSPUtil.getParameter(request, prefix	+ "slp_no".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] erpIfDt = (JSPUtil.getParameter(request, prefix	+ "erp_if_dt".trim(), length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no".trim(), length));
			String[] usdAmt = (JSPUtil.getParameter(request, prefix	+ "usd_amt".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			String[] invRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rmk".trim(), length));
			String[] csrOffstNo = (JSPUtil.getParameter(request, prefix	+ "csr_offst_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new JooArMnVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (invCoaRevDirCd[i] != null)
					model.setInvCoaRevDirCd(invCoaRevDirCd[i]);
				if (taxXchRt[i] != null)
					model.setTaxXchRt(taxXchRt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (invCtrtNo[i] != null)
					model.setInvCtrtNo(invCtrtNo[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (invCoaCoCd[i] != null)
					model.setInvCoaCoCd(invCoaCoCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invCoaAcctCd[i] != null)
					model.setInvCoaAcctCd(invCoaAcctCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (invCustCntCd[i] != null)
					model.setInvCustCntCd(invCustCntCd[i]);
				if (slsCtyCd[i] != null)
					model.setSlsCtyCd(slsCtyCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (invCoaRgnCd[i] != null)
					model.setInvCoaRgnCd(invCoaRgnCd[i]);
				if (invCoaVoyNo[i] != null)
					model.setInvCoaVoyNo(invCoaVoyNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (znIocCd[i] != null)
					model.setZnIocCd(znIocCd[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (revSkdVoyNo[i] != null)
					model.setRevSkdVoyNo(revSkdVoyNo[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (invCoaCtrCd[i] != null)
					model.setInvCoaCtrCd(invCoaCtrCd[i]);
				if (revVslCd[i] != null)
					model.setRevVslCd(revVslCd[i]);
				if (custCrFlg[i] != null)
					model.setCustCrFlg(custCrFlg[i]);
				if (sailDt[i] != null)
					model.setSailDt(sailDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (errMsg[i] != null)
					model.setErrMsg(errMsg[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (arIfSerNo[i] != null)
					model.setArIfSerNo(arIfSerNo[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (xchRtTpCd[i] != null)
					model.setXchRtTpCd(xchRtTpCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (arTaxIndCd[i] != null)
					model.setArTaxIndCd(arTaxIndCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (logUpdDt[i] != null)
					model.setLogUpdDt(logUpdDt[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (arIfNo[i] != null)
					model.setArIfNo(arIfNo[i]);
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (erpIfFlg[i] != null)
					model.setErpIfFlg(erpIfFlg[i]);
				if (invCoaInterCoCd[i] != null)
					model.setInvCoaInterCoCd(invCoaInterCoCd[i]);
				if (dueDt[i] != null)
					model.setDueDt(dueDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invCoaVslCd[i] != null)
					model.setInvCoaVslCd(invCoaVslCd[i]);
				if (crTermDys[i] != null)
					model.setCrTermDys(crTermDys[i]);
				if (revSkdDirCd[i] != null)
					model.setRevSkdDirCd(revSkdDirCd[i]);
				if (invCustSeq[i] != null)
					model.setInvCustSeq(invCustSeq[i]);
				if (invCoaSkdDirCd[i] != null)
					model.setInvCoaSkdDirCd(invCoaSkdDirCd[i]);
				if (arSrcCd[i] != null)
					model.setArSrcCd(arSrcCd[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (loclAmt[i] != null)
					model.setLoclAmt(loclAmt[i]);
				if (slpNo[i] != null)
					model.setSlpNo(slpNo[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (erpIfDt[i] != null)
					model.setErpIfDt(erpIfDt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (usdAmt[i] != null)
					model.setUsdAmt(usdAmt[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (invRmk[i] != null)
					model.setInvRmk(invRmk[i]);
				if (csrOffstNo[i] != null)
					model.setCsrOffstNo(csrOffstNo[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getJooArMnVOs();
	}

	public JooArMnVO[] getJooArMnVOs(){
		JooArMnVO[] vos = (JooArMnVO[])models.toArray(new JooArMnVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRevDirCd = this.invCoaRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxXchRt = this.taxXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCtrtNo = this.invCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCoCd = this.invCoaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaAcctCd = this.invCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCustCntCd = this.invCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsCtyCd = this.slsCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRgnCd = this.invCoaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVoyNo = this.invCoaVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znIocCd = this.znIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdVoyNo = this.revSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCtrCd = this.invCoaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revVslCd = this.revVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCrFlg = this.custCrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailDt = this.sailDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errMsg = this.errMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfSerNo = this.arIfSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtTpCd = this.xchRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arTaxIndCd = this.arTaxIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logUpdDt = this.logUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfNo = this.arIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfFlg = this.erpIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaInterCoCd = this.invCoaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dueDt = this.dueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVslCd = this.invCoaVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crTermDys = this.crTermDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdDirCd = this.revSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCustSeq = this.invCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaSkdDirCd = this.invCoaSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arSrcCd = this.arSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclAmt = this.loclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpNo = this.slpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfDt = this.erpIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdAmt = this.usdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRmk = this.invRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrOffstNo = this.csrOffstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
