/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApPayInvVO.java
*@FileTitle : ApPayInvVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.12.11
*@LastModifier : 
*@LastVersion : 1.0
* 2018.12.11  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApPayInvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApPayInvVO> models = new ArrayList<ApPayInvVO>(); 
	
	/* Column Info */
	private String invTtlAmt = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String psoTrnsSlpCtnt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ppdNo = null;
	/* Column Info */
	private String invNetAmt = null;
	/* Column Info */
	private String invIssDt = null;
	/* Column Info */
	private String apRvsAmt = null;
	/* Column Info */
	private String ppdDtrbNo = null;
	/* Column Info */
	private String apPayDt = null;
	/* Column Info */
	private String invRcvDt = null;
	/* Column Info */
	private String apPayFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String invStsCd = null;
	/* Column Info */
	private String apIfDt = null;
	/* Column Info */
	private String centGoveGdsSvcTaxAmt = null;
	/* Column Info */
	private String ppdGlDt = null;
	/* Column Info */
	private String payDueDt = null;
	/* Column Info */
	private String cessAmt = null;
	/* Column Info */
	private String ppdAplyAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invOfcCd = null;
	/* Column Info */
	private String invRgstNo = null;
	/* Column Info */
	private String invEffDt = null;
	/* Column Info */
	private String intgGoveGdsSvcTaxAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String vndrTermNm = null;
	/* Column Info */
	private String invVatAmt = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String svcAcctgCd = null;
	/* Column Info */
	private String apCxlDt = null;
	/* Column Info */
	private String idaWhldTaxAmt = null;
	/* Column Info */
	private String apPayAmt = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String steGoveGdsSvcTaxAmt = null;
	/* Column Info */
	private String whldTaxAmt = null;
	/* Column Info */
	private String errCsrNo = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String idaGstTaxDdctSrcAmt = null;
	/* Column Info */
	private String ttlLssDivCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String invRmk = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String eqTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public ApPayInvVO() {}

	public ApPayInvVO(String ibflag, String pagerows, String apRvsAmt, String invTtlAmt, String glDt, String psoTrnsSlpCtnt, String deltFlg, String creDt, String ppdNo, String invIssDt, String invNetAmt, String ppdDtrbNo, String apPayDt, String invRcvDt, String apPayFlg, String invStsCd, String apIfDt, String centGoveGdsSvcTaxAmt, String ppdGlDt, String payDueDt, String cessAmt, String ppdAplyAmt, String updUsrId, String invOfcCd, String intgGoveGdsSvcTaxAmt, String invEffDt, String invRgstNo, String updDt, String csrNo, String invVatAmt, String vndrTermNm, String svcAcctgCd, String costOfcCd, String apCxlDt, String idaWhldTaxAmt, String invCfmDt, String apPayAmt, String steGoveGdsSvcTaxAmt, String invCurrCd, String whldTaxAmt, String errCsrNo, String invNo, String idaGstTaxDdctSrcAmt, String creUsrId, String ttlLssDivCd, String invRmk, String vndrSeq, String invSubSysCd, String eqTpCd) {
		this.invTtlAmt = invTtlAmt;
		this.glDt = glDt;
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.ppdNo = ppdNo;
		this.invNetAmt = invNetAmt;
		this.invIssDt = invIssDt;
		this.apRvsAmt = apRvsAmt;
		this.ppdDtrbNo = ppdDtrbNo;
		this.apPayDt = apPayDt;
		this.invRcvDt = invRcvDt;
		this.apPayFlg = apPayFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.invStsCd = invStsCd;
		this.apIfDt = apIfDt;
		this.centGoveGdsSvcTaxAmt = centGoveGdsSvcTaxAmt;
		this.ppdGlDt = ppdGlDt;
		this.payDueDt = payDueDt;
		this.cessAmt = cessAmt;
		this.ppdAplyAmt = ppdAplyAmt;
		this.updUsrId = updUsrId;
		this.invOfcCd = invOfcCd;
		this.invRgstNo = invRgstNo;
		this.invEffDt = invEffDt;
		this.intgGoveGdsSvcTaxAmt = intgGoveGdsSvcTaxAmt;
		this.updDt = updDt;
		this.csrNo = csrNo;
		this.vndrTermNm = vndrTermNm;
		this.invVatAmt = invVatAmt;
		this.costOfcCd = costOfcCd;
		this.svcAcctgCd = svcAcctgCd;
		this.apCxlDt = apCxlDt;
		this.idaWhldTaxAmt = idaWhldTaxAmt;
		this.apPayAmt = apPayAmt;
		this.invCfmDt = invCfmDt;
		this.invCurrCd = invCurrCd;
		this.steGoveGdsSvcTaxAmt = steGoveGdsSvcTaxAmt;
		this.whldTaxAmt = whldTaxAmt;
		this.errCsrNo = errCsrNo;
		this.invNo = invNo;
		this.creUsrId = creUsrId;
		this.idaGstTaxDdctSrcAmt = idaGstTaxDdctSrcAmt;
		this.ttlLssDivCd = ttlLssDivCd;
		this.vndrSeq = vndrSeq;
		this.invRmk = invRmk;
		this.invSubSysCd = invSubSysCd;
		this.eqTpCd = eqTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_ttl_amt", getInvTtlAmt());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("pso_trns_slp_ctnt", getPsoTrnsSlpCtnt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ppd_no", getPpdNo());
		this.hashColumns.put("inv_net_amt", getInvNetAmt());
		this.hashColumns.put("inv_iss_dt", getInvIssDt());
		this.hashColumns.put("ap_rvs_amt", getApRvsAmt());
		this.hashColumns.put("ppd_dtrb_no", getPpdDtrbNo());
		this.hashColumns.put("ap_pay_dt", getApPayDt());
		this.hashColumns.put("inv_rcv_dt", getInvRcvDt());
		this.hashColumns.put("ap_pay_flg", getApPayFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_sts_cd", getInvStsCd());
		this.hashColumns.put("ap_if_dt", getApIfDt());
		this.hashColumns.put("cent_gove_gds_svc_tax_amt", getCentGoveGdsSvcTaxAmt());
		this.hashColumns.put("ppd_gl_dt", getPpdGlDt());
		this.hashColumns.put("pay_due_dt", getPayDueDt());
		this.hashColumns.put("cess_amt", getCessAmt());
		this.hashColumns.put("ppd_aply_amt", getPpdAplyAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("inv_rgst_no", getInvRgstNo());
		this.hashColumns.put("inv_eff_dt", getInvEffDt());
		this.hashColumns.put("intg_gove_gds_svc_tax_amt", getIntgGoveGdsSvcTaxAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("vndr_term_nm", getVndrTermNm());
		this.hashColumns.put("inv_vat_amt", getInvVatAmt());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("svc_acctg_cd", getSvcAcctgCd());
		this.hashColumns.put("ap_cxl_dt", getApCxlDt());
		this.hashColumns.put("ida_whld_tax_amt", getIdaWhldTaxAmt());
		this.hashColumns.put("ap_pay_amt", getApPayAmt());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("ste_gove_gds_svc_tax_amt", getSteGoveGdsSvcTaxAmt());
		this.hashColumns.put("whld_tax_amt", getWhldTaxAmt());
		this.hashColumns.put("err_csr_no", getErrCsrNo());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ida_gst_tax_ddct_src_amt", getIdaGstTaxDdctSrcAmt());
		this.hashColumns.put("ttl_lss_div_cd", getTtlLssDivCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("inv_rmk", getInvRmk());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("eq_tp_cd", getEqTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_ttl_amt", "invTtlAmt");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("pso_trns_slp_ctnt", "psoTrnsSlpCtnt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ppd_no", "ppdNo");
		this.hashFields.put("inv_net_amt", "invNetAmt");
		this.hashFields.put("inv_iss_dt", "invIssDt");
		this.hashFields.put("ap_rvs_amt", "apRvsAmt");
		this.hashFields.put("ppd_dtrb_no", "ppdDtrbNo");
		this.hashFields.put("ap_pay_dt", "apPayDt");
		this.hashFields.put("inv_rcv_dt", "invRcvDt");
		this.hashFields.put("ap_pay_flg", "apPayFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_sts_cd", "invStsCd");
		this.hashFields.put("ap_if_dt", "apIfDt");
		this.hashFields.put("cent_gove_gds_svc_tax_amt", "centGoveGdsSvcTaxAmt");
		this.hashFields.put("ppd_gl_dt", "ppdGlDt");
		this.hashFields.put("pay_due_dt", "payDueDt");
		this.hashFields.put("cess_amt", "cessAmt");
		this.hashFields.put("ppd_aply_amt", "ppdAplyAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("inv_rgst_no", "invRgstNo");
		this.hashFields.put("inv_eff_dt", "invEffDt");
		this.hashFields.put("intg_gove_gds_svc_tax_amt", "intgGoveGdsSvcTaxAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("vndr_term_nm", "vndrTermNm");
		this.hashFields.put("inv_vat_amt", "invVatAmt");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("svc_acctg_cd", "svcAcctgCd");
		this.hashFields.put("ap_cxl_dt", "apCxlDt");
		this.hashFields.put("ida_whld_tax_amt", "idaWhldTaxAmt");
		this.hashFields.put("ap_pay_amt", "apPayAmt");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("ste_gove_gds_svc_tax_amt", "steGoveGdsSvcTaxAmt");
		this.hashFields.put("whld_tax_amt", "whldTaxAmt");
		this.hashFields.put("err_csr_no", "errCsrNo");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ida_gst_tax_ddct_src_amt", "idaGstTaxDdctSrcAmt");
		this.hashFields.put("ttl_lss_div_cd", "ttlLssDivCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("inv_rmk", "invRmk");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("eq_tp_cd", "eqTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return invTtlAmt
	 */
	public String getInvTtlAmt() {
		return this.invTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
	}
	
	/**
	 * Column Info
	 * @return psoTrnsSlpCtnt
	 */
	public String getPsoTrnsSlpCtnt() {
		return this.psoTrnsSlpCtnt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return ppdNo
	 */
	public String getPpdNo() {
		return this.ppdNo;
	}
	
	/**
	 * Column Info
	 * @return invNetAmt
	 */
	public String getInvNetAmt() {
		return this.invNetAmt;
	}
	
	/**
	 * Column Info
	 * @return invIssDt
	 */
	public String getInvIssDt() {
		return this.invIssDt;
	}
	
	/**
	 * Column Info
	 * @return apRvsAmt
	 */
	public String getApRvsAmt() {
		return this.apRvsAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdDtrbNo
	 */
	public String getPpdDtrbNo() {
		return this.ppdDtrbNo;
	}
	
	/**
	 * Column Info
	 * @return apPayDt
	 */
	public String getApPayDt() {
		return this.apPayDt;
	}
	
	/**
	 * Column Info
	 * @return invRcvDt
	 */
	public String getInvRcvDt() {
		return this.invRcvDt;
	}
	
	/**
	 * Column Info
	 * @return apPayFlg
	 */
	public String getApPayFlg() {
		return this.apPayFlg;
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
	 * @return invStsCd
	 */
	public String getInvStsCd() {
		return this.invStsCd;
	}
	
	/**
	 * Column Info
	 * @return apIfDt
	 */
	public String getApIfDt() {
		return this.apIfDt;
	}
	
	/**
	 * Column Info
	 * @return centGoveGdsSvcTaxAmt
	 */
	public String getCentGoveGdsSvcTaxAmt() {
		return this.centGoveGdsSvcTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdGlDt
	 */
	public String getPpdGlDt() {
		return this.ppdGlDt;
	}
	
	/**
	 * Column Info
	 * @return payDueDt
	 */
	public String getPayDueDt() {
		return this.payDueDt;
	}
	
	/**
	 * Column Info
	 * @return cessAmt
	 */
	public String getCessAmt() {
		return this.cessAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdAplyAmt
	 */
	public String getPpdAplyAmt() {
		return this.ppdAplyAmt;
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
	 * @return invOfcCd
	 */
	public String getInvOfcCd() {
		return this.invOfcCd;
	}
	
	/**
	 * Column Info
	 * @return invRgstNo
	 */
	public String getInvRgstNo() {
		return this.invRgstNo;
	}
	
	/**
	 * Column Info
	 * @return invEffDt
	 */
	public String getInvEffDt() {
		return this.invEffDt;
	}
	
	/**
	 * Column Info
	 * @return intgGoveGdsSvcTaxAmt
	 */
	public String getIntgGoveGdsSvcTaxAmt() {
		return this.intgGoveGdsSvcTaxAmt;
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
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return vndrTermNm
	 */
	public String getVndrTermNm() {
		return this.vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @return invVatAmt
	 */
	public String getInvVatAmt() {
		return this.invVatAmt;
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
	 * @return svcAcctgCd
	 */
	public String getSvcAcctgCd() {
		return this.svcAcctgCd;
	}
	
	/**
	 * Column Info
	 * @return apCxlDt
	 */
	public String getApCxlDt() {
		return this.apCxlDt;
	}
	
	/**
	 * Column Info
	 * @return idaWhldTaxAmt
	 */
	public String getIdaWhldTaxAmt() {
		return this.idaWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return apPayAmt
	 */
	public String getApPayAmt() {
		return this.apPayAmt;
	}
	
	/**
	 * Column Info
	 * @return invCfmDt
	 */
	public String getInvCfmDt() {
		return this.invCfmDt;
	}
	
	/**
	 * Column Info
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
	}
	
	/**
	 * Column Info
	 * @return steGoveGdsSvcTaxAmt
	 */
	public String getSteGoveGdsSvcTaxAmt() {
		return this.steGoveGdsSvcTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return whldTaxAmt
	 */
	public String getWhldTaxAmt() {
		return this.whldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return errCsrNo
	 */
	public String getErrCsrNo() {
		return this.errCsrNo;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
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
	 * @return idaGstTaxDdctSrcAmt
	 */
	public String getIdaGstTaxDdctSrcAmt() {
		return this.idaGstTaxDdctSrcAmt;
	}
	
	/**
	 * Column Info
	 * @return ttlLssDivCd
	 */
	public String getTtlLssDivCd() {
		return this.ttlLssDivCd;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
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
	 * @return invSubSysCd
	 */
	public String getInvSubSysCd() {
		return this.invSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return eqTpCd
	 */
	public String getEqTpCd() {
		return this.eqTpCd;
	}
	

	/**
	 * Column Info
	 * @param invTtlAmt
	 */
	public void setInvTtlAmt(String invTtlAmt) {
		this.invTtlAmt = invTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
	}
	
	/**
	 * Column Info
	 * @param psoTrnsSlpCtnt
	 */
	public void setPsoTrnsSlpCtnt(String psoTrnsSlpCtnt) {
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param ppdNo
	 */
	public void setPpdNo(String ppdNo) {
		this.ppdNo = ppdNo;
	}
	
	/**
	 * Column Info
	 * @param invNetAmt
	 */
	public void setInvNetAmt(String invNetAmt) {
		this.invNetAmt = invNetAmt;
	}
	
	/**
	 * Column Info
	 * @param invIssDt
	 */
	public void setInvIssDt(String invIssDt) {
		this.invIssDt = invIssDt;
	}
	
	/**
	 * Column Info
	 * @param apRvsAmt
	 */
	public void setApRvsAmt(String apRvsAmt) {
		this.apRvsAmt = apRvsAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdDtrbNo
	 */
	public void setPpdDtrbNo(String ppdDtrbNo) {
		this.ppdDtrbNo = ppdDtrbNo;
	}
	
	/**
	 * Column Info
	 * @param apPayDt
	 */
	public void setApPayDt(String apPayDt) {
		this.apPayDt = apPayDt;
	}
	
	/**
	 * Column Info
	 * @param invRcvDt
	 */
	public void setInvRcvDt(String invRcvDt) {
		this.invRcvDt = invRcvDt;
	}
	
	/**
	 * Column Info
	 * @param apPayFlg
	 */
	public void setApPayFlg(String apPayFlg) {
		this.apPayFlg = apPayFlg;
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
	 * @param invStsCd
	 */
	public void setInvStsCd(String invStsCd) {
		this.invStsCd = invStsCd;
	}
	
	/**
	 * Column Info
	 * @param apIfDt
	 */
	public void setApIfDt(String apIfDt) {
		this.apIfDt = apIfDt;
	}
	
	/**
	 * Column Info
	 * @param centGoveGdsSvcTaxAmt
	 */
	public void setCentGoveGdsSvcTaxAmt(String centGoveGdsSvcTaxAmt) {
		this.centGoveGdsSvcTaxAmt = centGoveGdsSvcTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdGlDt
	 */
	public void setPpdGlDt(String ppdGlDt) {
		this.ppdGlDt = ppdGlDt;
	}
	
	/**
	 * Column Info
	 * @param payDueDt
	 */
	public void setPayDueDt(String payDueDt) {
		this.payDueDt = payDueDt;
	}
	
	/**
	 * Column Info
	 * @param cessAmt
	 */
	public void setCessAmt(String cessAmt) {
		this.cessAmt = cessAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdAplyAmt
	 */
	public void setPpdAplyAmt(String ppdAplyAmt) {
		this.ppdAplyAmt = ppdAplyAmt;
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
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * Column Info
	 * @param invRgstNo
	 */
	public void setInvRgstNo(String invRgstNo) {
		this.invRgstNo = invRgstNo;
	}
	
	/**
	 * Column Info
	 * @param invEffDt
	 */
	public void setInvEffDt(String invEffDt) {
		this.invEffDt = invEffDt;
	}
	
	/**
	 * Column Info
	 * @param intgGoveGdsSvcTaxAmt
	 */
	public void setIntgGoveGdsSvcTaxAmt(String intgGoveGdsSvcTaxAmt) {
		this.intgGoveGdsSvcTaxAmt = intgGoveGdsSvcTaxAmt;
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
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param vndrTermNm
	 */
	public void setVndrTermNm(String vndrTermNm) {
		this.vndrTermNm = vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @param invVatAmt
	 */
	public void setInvVatAmt(String invVatAmt) {
		this.invVatAmt = invVatAmt;
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
	 * @param svcAcctgCd
	 */
	public void setSvcAcctgCd(String svcAcctgCd) {
		this.svcAcctgCd = svcAcctgCd;
	}
	
	/**
	 * Column Info
	 * @param apCxlDt
	 */
	public void setApCxlDt(String apCxlDt) {
		this.apCxlDt = apCxlDt;
	}
	
	/**
	 * Column Info
	 * @param idaWhldTaxAmt
	 */
	public void setIdaWhldTaxAmt(String idaWhldTaxAmt) {
		this.idaWhldTaxAmt = idaWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param apPayAmt
	 */
	public void setApPayAmt(String apPayAmt) {
		this.apPayAmt = apPayAmt;
	}
	
	/**
	 * Column Info
	 * @param invCfmDt
	 */
	public void setInvCfmDt(String invCfmDt) {
		this.invCfmDt = invCfmDt;
	}
	
	/**
	 * Column Info
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
	}
	
	/**
	 * Column Info
	 * @param steGoveGdsSvcTaxAmt
	 */
	public void setSteGoveGdsSvcTaxAmt(String steGoveGdsSvcTaxAmt) {
		this.steGoveGdsSvcTaxAmt = steGoveGdsSvcTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param whldTaxAmt
	 */
	public void setWhldTaxAmt(String whldTaxAmt) {
		this.whldTaxAmt = whldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param errCsrNo
	 */
	public void setErrCsrNo(String errCsrNo) {
		this.errCsrNo = errCsrNo;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
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
	 * @param idaGstTaxDdctSrcAmt
	 */
	public void setIdaGstTaxDdctSrcAmt(String idaGstTaxDdctSrcAmt) {
		this.idaGstTaxDdctSrcAmt = idaGstTaxDdctSrcAmt;
	}
	
	/**
	 * Column Info
	 * @param ttlLssDivCd
	 */
	public void setTtlLssDivCd(String ttlLssDivCd) {
		this.ttlLssDivCd = ttlLssDivCd;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
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
	 * @param invSubSysCd
	 */
	public void setInvSubSysCd(String invSubSysCd) {
		this.invSubSysCd = invSubSysCd;
	}
	
	/**
	 * Column Info
	 * @param eqTpCd
	 */
	public void setEqTpCd(String eqTpCd) {
		this.eqTpCd = eqTpCd;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setInvTtlAmt(JSPUtil.getParameter(request, prefix + "inv_ttl_amt", ""));
		setGlDt(JSPUtil.getParameter(request, prefix + "gl_dt", ""));
		setPsoTrnsSlpCtnt(JSPUtil.getParameter(request, prefix + "pso_trns_slp_ctnt", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPpdNo(JSPUtil.getParameter(request, prefix + "ppd_no", ""));
		setInvNetAmt(JSPUtil.getParameter(request, prefix + "inv_net_amt", ""));
		setInvIssDt(JSPUtil.getParameter(request, prefix + "inv_iss_dt", ""));
		setApRvsAmt(JSPUtil.getParameter(request, prefix + "ap_rvs_amt", ""));
		setPpdDtrbNo(JSPUtil.getParameter(request, prefix + "ppd_dtrb_no", ""));
		setApPayDt(JSPUtil.getParameter(request, prefix + "ap_pay_dt", ""));
		setInvRcvDt(JSPUtil.getParameter(request, prefix + "inv_rcv_dt", ""));
		setApPayFlg(JSPUtil.getParameter(request, prefix + "ap_pay_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setInvStsCd(JSPUtil.getParameter(request, prefix + "inv_sts_cd", ""));
		setApIfDt(JSPUtil.getParameter(request, prefix + "ap_if_dt", ""));
		setCentGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "cent_gove_gds_svc_tax_amt", ""));
		setPpdGlDt(JSPUtil.getParameter(request, prefix + "ppd_gl_dt", ""));
		setPayDueDt(JSPUtil.getParameter(request, prefix + "pay_due_dt", ""));
		setCessAmt(JSPUtil.getParameter(request, prefix + "cess_amt", ""));
		setPpdAplyAmt(JSPUtil.getParameter(request, prefix + "ppd_aply_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
		setInvRgstNo(JSPUtil.getParameter(request, prefix + "inv_rgst_no", ""));
		setInvEffDt(JSPUtil.getParameter(request, prefix + "inv_eff_dt", ""));
		setIntgGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "intg_gove_gds_svc_tax_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
		setVndrTermNm(JSPUtil.getParameter(request, prefix + "vndr_term_nm", ""));
		setInvVatAmt(JSPUtil.getParameter(request, prefix + "inv_vat_amt", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setSvcAcctgCd(JSPUtil.getParameter(request, prefix + "svc_acctg_cd", ""));
		setApCxlDt(JSPUtil.getParameter(request, prefix + "ap_cxl_dt", ""));
		setIdaWhldTaxAmt(JSPUtil.getParameter(request, prefix + "ida_whld_tax_amt", ""));
		setApPayAmt(JSPUtil.getParameter(request, prefix + "ap_pay_amt", ""));
		setInvCfmDt(JSPUtil.getParameter(request, prefix + "inv_cfm_dt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, prefix + "inv_curr_cd", ""));
		setSteGoveGdsSvcTaxAmt(JSPUtil.getParameter(request, prefix + "ste_gove_gds_svc_tax_amt", ""));
		setWhldTaxAmt(JSPUtil.getParameter(request, prefix + "whld_tax_amt", ""));
		setErrCsrNo(JSPUtil.getParameter(request, prefix + "err_csr_no", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIdaGstTaxDdctSrcAmt(JSPUtil.getParameter(request, prefix + "ida_gst_tax_ddct_src_amt", ""));
		setTtlLssDivCd(JSPUtil.getParameter(request, prefix + "ttl_lss_div_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setInvRmk(JSPUtil.getParameter(request, prefix + "inv_rmk", ""));
		setInvSubSysCd(JSPUtil.getParameter(request, prefix + "inv_sub_sys_cd", ""));
		setEqTpCd(JSPUtil.getParameter(request, prefix + "eq_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApPayInvVO[]
	 */
	public ApPayInvVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApPayInvVO[]
	 */
	public ApPayInvVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApPayInvVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invTtlAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ttl_amt", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] psoTrnsSlpCtnt = (JSPUtil.getParameter(request, prefix	+ "pso_trns_slp_ctnt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ppdNo = (JSPUtil.getParameter(request, prefix	+ "ppd_no", length));
			String[] invNetAmt = (JSPUtil.getParameter(request, prefix	+ "inv_net_amt", length));
			String[] invIssDt = (JSPUtil.getParameter(request, prefix	+ "inv_iss_dt", length));
			String[] apRvsAmt = (JSPUtil.getParameter(request, prefix	+ "ap_rvs_amt", length));
			String[] ppdDtrbNo = (JSPUtil.getParameter(request, prefix	+ "ppd_dtrb_no", length));
			String[] apPayDt = (JSPUtil.getParameter(request, prefix	+ "ap_pay_dt", length));
			String[] invRcvDt = (JSPUtil.getParameter(request, prefix	+ "inv_rcv_dt", length));
			String[] apPayFlg = (JSPUtil.getParameter(request, prefix	+ "ap_pay_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] invStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_sts_cd", length));
			String[] apIfDt = (JSPUtil.getParameter(request, prefix	+ "ap_if_dt", length));
			String[] centGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix	+ "cent_gove_gds_svc_tax_amt", length));
			String[] ppdGlDt = (JSPUtil.getParameter(request, prefix	+ "ppd_gl_dt", length));
			String[] payDueDt = (JSPUtil.getParameter(request, prefix	+ "pay_due_dt", length));
			String[] cessAmt = (JSPUtil.getParameter(request, prefix	+ "cess_amt", length));
			String[] ppdAplyAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_aply_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] invRgstNo = (JSPUtil.getParameter(request, prefix	+ "inv_rgst_no", length));
			String[] invEffDt = (JSPUtil.getParameter(request, prefix	+ "inv_eff_dt", length));
			String[] intgGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix	+ "intg_gove_gds_svc_tax_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] vndrTermNm = (JSPUtil.getParameter(request, prefix	+ "vndr_term_nm", length));
			String[] invVatAmt = (JSPUtil.getParameter(request, prefix	+ "inv_vat_amt", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] svcAcctgCd = (JSPUtil.getParameter(request, prefix	+ "svc_acctg_cd", length));
			String[] apCxlDt = (JSPUtil.getParameter(request, prefix	+ "ap_cxl_dt", length));
			String[] idaWhldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "ida_whld_tax_amt", length));
			String[] apPayAmt = (JSPUtil.getParameter(request, prefix	+ "ap_pay_amt", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] steGoveGdsSvcTaxAmt = (JSPUtil.getParameter(request, prefix	+ "ste_gove_gds_svc_tax_amt", length));
			String[] whldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "whld_tax_amt", length));
			String[] errCsrNo = (JSPUtil.getParameter(request, prefix	+ "err_csr_no", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] idaGstTaxDdctSrcAmt = (JSPUtil.getParameter(request, prefix	+ "ida_gst_tax_ddct_src_amt", length));
			String[] ttlLssDivCd = (JSPUtil.getParameter(request, prefix	+ "ttl_lss_div_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] invRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rmk", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] eqTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApPayInvVO();
				if (invTtlAmt[i] != null)
					model.setInvTtlAmt(invTtlAmt[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (psoTrnsSlpCtnt[i] != null)
					model.setPsoTrnsSlpCtnt(psoTrnsSlpCtnt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ppdNo[i] != null)
					model.setPpdNo(ppdNo[i]);
				if (invNetAmt[i] != null)
					model.setInvNetAmt(invNetAmt[i]);
				if (invIssDt[i] != null)
					model.setInvIssDt(invIssDt[i]);
				if (apRvsAmt[i] != null)
					model.setApRvsAmt(apRvsAmt[i]);
				if (ppdDtrbNo[i] != null)
					model.setPpdDtrbNo(ppdDtrbNo[i]);
				if (apPayDt[i] != null)
					model.setApPayDt(apPayDt[i]);
				if (invRcvDt[i] != null)
					model.setInvRcvDt(invRcvDt[i]);
				if (apPayFlg[i] != null)
					model.setApPayFlg(apPayFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invStsCd[i] != null)
					model.setInvStsCd(invStsCd[i]);
				if (apIfDt[i] != null)
					model.setApIfDt(apIfDt[i]);
				if (centGoveGdsSvcTaxAmt[i] != null)
					model.setCentGoveGdsSvcTaxAmt(centGoveGdsSvcTaxAmt[i]);
				if (ppdGlDt[i] != null)
					model.setPpdGlDt(ppdGlDt[i]);
				if (payDueDt[i] != null)
					model.setPayDueDt(payDueDt[i]);
				if (cessAmt[i] != null)
					model.setCessAmt(cessAmt[i]);
				if (ppdAplyAmt[i] != null)
					model.setPpdAplyAmt(ppdAplyAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (invRgstNo[i] != null)
					model.setInvRgstNo(invRgstNo[i]);
				if (invEffDt[i] != null)
					model.setInvEffDt(invEffDt[i]);
				if (intgGoveGdsSvcTaxAmt[i] != null)
					model.setIntgGoveGdsSvcTaxAmt(intgGoveGdsSvcTaxAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (vndrTermNm[i] != null)
					model.setVndrTermNm(vndrTermNm[i]);
				if (invVatAmt[i] != null)
					model.setInvVatAmt(invVatAmt[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (svcAcctgCd[i] != null)
					model.setSvcAcctgCd(svcAcctgCd[i]);
				if (apCxlDt[i] != null)
					model.setApCxlDt(apCxlDt[i]);
				if (idaWhldTaxAmt[i] != null)
					model.setIdaWhldTaxAmt(idaWhldTaxAmt[i]);
				if (apPayAmt[i] != null)
					model.setApPayAmt(apPayAmt[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (steGoveGdsSvcTaxAmt[i] != null)
					model.setSteGoveGdsSvcTaxAmt(steGoveGdsSvcTaxAmt[i]);
				if (whldTaxAmt[i] != null)
					model.setWhldTaxAmt(whldTaxAmt[i]);
				if (errCsrNo[i] != null)
					model.setErrCsrNo(errCsrNo[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (idaGstTaxDdctSrcAmt[i] != null)
					model.setIdaGstTaxDdctSrcAmt(idaGstTaxDdctSrcAmt[i]);
				if (ttlLssDivCd[i] != null)
					model.setTtlLssDivCd(ttlLssDivCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (invRmk[i] != null)
					model.setInvRmk(invRmk[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (eqTpCd[i] != null)
					model.setEqTpCd(eqTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApPayInvVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApPayInvVO[]
	 */
	public ApPayInvVO[] getApPayInvVOs(){
		ApPayInvVO[] vos = (ApPayInvVO[])models.toArray(new ApPayInvVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.invTtlAmt = this.invTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoTrnsSlpCtnt = this.psoTrnsSlpCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdNo = this.ppdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNetAmt = this.invNetAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssDt = this.invIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apRvsAmt = this.apRvsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdDtrbNo = this.ppdDtrbNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apPayDt = this.apPayDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRcvDt = this.invRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apPayFlg = this.apPayFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStsCd = this.invStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apIfDt = this.apIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.centGoveGdsSvcTaxAmt = this.centGoveGdsSvcTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdGlDt = this.ppdGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDueDt = this.payDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cessAmt = this.cessAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdAplyAmt = this.ppdAplyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRgstNo = this.invRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEffDt = this.invEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgGoveGdsSvcTaxAmt = this.intgGoveGdsSvcTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrTermNm = this.vndrTermNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVatAmt = this.invVatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcAcctgCd = this.svcAcctgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCxlDt = this.apCxlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaWhldTaxAmt = this.idaWhldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apPayAmt = this.apPayAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.steGoveGdsSvcTaxAmt = this.steGoveGdsSvcTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whldTaxAmt = this.whldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errCsrNo = this.errCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaGstTaxDdctSrcAmt = this.idaGstTaxDdctSrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlLssDivCd = this.ttlLssDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRmk = this.invRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpCd = this.eqTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
