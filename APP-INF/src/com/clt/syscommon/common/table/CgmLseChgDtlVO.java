/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmLseChgDtlVO.java
*@FileTitle : CgmLseChgDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmLseChgDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmLseChgDtlVO> models = new ArrayList<CgmLseChgDtlVO>();
	
	/* Column Info */
	private String lseChgAmt = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String invTaxAmt = null;
	/* Column Info */
	private String lseUseDys = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String payTaxAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String payChgAudRmk = null;
	/* Column Info */
	private String invEqOnhLocCd = null;
	/* Column Info */
	private String payLseChgStsCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String crAmt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String audUmchEqStsEvntDt = null;
	/* Column Info */
	private String eqOffhLocCd = null;
	/* Column Info */
	private String invBilEndDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String invEqOnhDt = null;
	/* Column Info */
	private String invRefNo = null;
	/* Column Info */
	private String payCrAmt = null;
	/* Column Info */
	private String payLseRtAmt = null;
	/* Column Info */
	private String eqOnhLocCd = null;
	/* Column Info */
	private String audUmchEqAsetStsCd = null;
	/* Column Info */
	private String costCd = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String eqOnhDt = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String lseChgAudRsltRsnDesc = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String lseChgAudRsltRsnCd = null;
	/* Column Info */
	private String payLseChgAmt = null;
	/* Column Info */
	private String eqBilEndDt = null;
	/* Column Info */
	private String eqBilStDt = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String eqOffhDt = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String invEqNo = null;
	/* Column Info */
	private String payLseUseDys = null;
	/* Column Info */
	private String invLseUseDys = null;
	/* Column Info */
	private String audUmchEqStsEvntYdCd = null;
	/* Column Info */
	private String invCustEqNo = null;
	/* Column Info */
	private String payInvSeq = null;
	/* Column Info */
	private String invLseChgAmt = null;
	/* Column Info */
	private String lseTaxAmt = null;
	/* Column Info */
	private String chgSeq = null;
	/* Column Info */
	private String invBilStDt = null;
	/* Column Info */
	private String lseRtAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String invEqOffhDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lseChgAudStsCd = null;
	/* Column Info */
	private String chgCd = null;
	/* Column Info */
	private String invLseRtAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invEqOffhLocCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmLseChgDtlVO() {}

	public CgmLseChgDtlVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String costYrmon, String eqNo, String chgCd, String chgSeq, String eqKndCd, String lseChgAudStsCd, String lseChgAudRsltRsnCd, String lseChgAudRsltRsnDesc, String lseUseDys, String lseRtAmt, String lseChgAmt, String lseTaxAmt, String crAmt, String eqOnhDt, String eqOnhLocCd, String eqOffhDt, String eqOffhLocCd, String eqBilStDt, String eqBilEndDt, String invNo, String invRefNo, String invEqNo, String invCustEqNo, String invEqOnhDt, String invEqOnhLocCd, String invEqOffhDt, String invEqOffhLocCd, String invBilStDt, String invBilEndDt, String invLseUseDys, String invLseRtAmt, String invLseChgAmt, String invTaxAmt, String audUmchEqStsEvntYdCd, String audUmchEqAsetStsCd, String audUmchEqStsEvntDt, String payLseChgStsCd, String payLseUseDys, String payLseRtAmt, String payLseChgAmt, String payCrAmt, String payTaxAmt, String payInvSeq, String costCd, String acctCd, String payChgAudRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.lseChgAmt = lseChgAmt;
		this.acctCd = acctCd;
		this.invTaxAmt = invTaxAmt;
		this.lseUseDys = lseUseDys;
		this.agmtSeq = agmtSeq;
		this.payTaxAmt = payTaxAmt;
		this.updUsrId = updUsrId;
		this.payChgAudRmk = payChgAudRmk;
		this.invEqOnhLocCd = invEqOnhLocCd;
		this.payLseChgStsCd = payLseChgStsCd;
		this.updDt = updDt;
		this.crAmt = crAmt;
		this.eqKndCd = eqKndCd;
		this.audUmchEqStsEvntDt = audUmchEqStsEvntDt;
		this.eqOffhLocCd = eqOffhLocCd;
		this.invBilEndDt = invBilEndDt;
		this.ibflag = ibflag;
		this.invEqOnhDt = invEqOnhDt;
		this.invRefNo = invRefNo;
		this.payCrAmt = payCrAmt;
		this.payLseRtAmt = payLseRtAmt;
		this.eqOnhLocCd = eqOnhLocCd;
		this.audUmchEqAsetStsCd = audUmchEqAsetStsCd;
		this.costCd = costCd;
		this.eqNo = eqNo;
		this.eqOnhDt = eqOnhDt;
		this.costYrmon = costYrmon;
		this.lseChgAudRsltRsnDesc = lseChgAudRsltRsnDesc;
		this.invNo = invNo;
		this.lseChgAudRsltRsnCd = lseChgAudRsltRsnCd;
		this.payLseChgAmt = payLseChgAmt;
		this.eqBilEndDt = eqBilEndDt;
		this.eqBilStDt = eqBilStDt;
		this.agmtVerNo = agmtVerNo;
		this.eqOffhDt = eqOffhDt;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.invEqNo = invEqNo;
		this.payLseUseDys = payLseUseDys;
		this.invLseUseDys = invLseUseDys;
		this.audUmchEqStsEvntYdCd = audUmchEqStsEvntYdCd;
		this.invCustEqNo = invCustEqNo;
		this.payInvSeq = payInvSeq;
		this.invLseChgAmt = invLseChgAmt;
		this.lseTaxAmt = lseTaxAmt;
		this.chgSeq = chgSeq;
		this.invBilStDt = invBilStDt;
		this.lseRtAmt = lseRtAmt;
		this.creDt = creDt;
		this.invEqOffhDt = invEqOffhDt;
		this.creUsrId = creUsrId;
		this.lseChgAudStsCd = lseChgAudStsCd;
		this.chgCd = chgCd;
		this.invLseRtAmt = invLseRtAmt;
		this.pagerows = pagerows;
		this.invEqOffhLocCd = invEqOffhLocCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lse_chg_amt", getLseChgAmt());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("inv_tax_amt", getInvTaxAmt());
		this.hashColumns.put("lse_use_dys", getLseUseDys());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("pay_tax_amt", getPayTaxAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pay_chg_aud_rmk", getPayChgAudRmk());
		this.hashColumns.put("inv_eq_onh_loc_cd", getInvEqOnhLocCd());
		this.hashColumns.put("pay_lse_chg_sts_cd", getPayLseChgStsCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cr_amt", getCrAmt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("aud_umch_eq_sts_evnt_dt", getAudUmchEqStsEvntDt());
		this.hashColumns.put("eq_offh_loc_cd", getEqOffhLocCd());
		this.hashColumns.put("inv_bil_end_dt", getInvBilEndDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_eq_onh_dt", getInvEqOnhDt());
		this.hashColumns.put("inv_ref_no", getInvRefNo());
		this.hashColumns.put("pay_cr_amt", getPayCrAmt());
		this.hashColumns.put("pay_lse_rt_amt", getPayLseRtAmt());
		this.hashColumns.put("eq_onh_loc_cd", getEqOnhLocCd());
		this.hashColumns.put("aud_umch_eq_aset_sts_cd", getAudUmchEqAsetStsCd());
		this.hashColumns.put("cost_cd", getCostCd());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("eq_onh_dt", getEqOnhDt());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("lse_chg_aud_rslt_rsn_desc", getLseChgAudRsltRsnDesc());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("lse_chg_aud_rslt_rsn_cd", getLseChgAudRsltRsnCd());
		this.hashColumns.put("pay_lse_chg_amt", getPayLseChgAmt());
		this.hashColumns.put("eq_bil_end_dt", getEqBilEndDt());
		this.hashColumns.put("eq_bil_st_dt", getEqBilStDt());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("eq_offh_dt", getEqOffhDt());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("inv_eq_no", getInvEqNo());
		this.hashColumns.put("pay_lse_use_dys", getPayLseUseDys());
		this.hashColumns.put("inv_lse_use_dys", getInvLseUseDys());
		this.hashColumns.put("aud_umch_eq_sts_evnt_yd_cd", getAudUmchEqStsEvntYdCd());
		this.hashColumns.put("inv_cust_eq_no", getInvCustEqNo());
		this.hashColumns.put("pay_inv_seq", getPayInvSeq());
		this.hashColumns.put("inv_lse_chg_amt", getInvLseChgAmt());
		this.hashColumns.put("lse_tax_amt", getLseTaxAmt());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("inv_bil_st_dt", getInvBilStDt());
		this.hashColumns.put("lse_rt_amt", getLseRtAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_eq_offh_dt", getInvEqOffhDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lse_chg_aud_sts_cd", getLseChgAudStsCd());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("inv_lse_rt_amt", getInvLseRtAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_eq_offh_loc_cd", getInvEqOffhLocCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lse_chg_amt", "lseChgAmt");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("inv_tax_amt", "invTaxAmt");
		this.hashFields.put("lse_use_dys", "lseUseDys");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("pay_tax_amt", "payTaxAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pay_chg_aud_rmk", "payChgAudRmk");
		this.hashFields.put("inv_eq_onh_loc_cd", "invEqOnhLocCd");
		this.hashFields.put("pay_lse_chg_sts_cd", "payLseChgStsCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cr_amt", "crAmt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("aud_umch_eq_sts_evnt_dt", "audUmchEqStsEvntDt");
		this.hashFields.put("eq_offh_loc_cd", "eqOffhLocCd");
		this.hashFields.put("inv_bil_end_dt", "invBilEndDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_eq_onh_dt", "invEqOnhDt");
		this.hashFields.put("inv_ref_no", "invRefNo");
		this.hashFields.put("pay_cr_amt", "payCrAmt");
		this.hashFields.put("pay_lse_rt_amt", "payLseRtAmt");
		this.hashFields.put("eq_onh_loc_cd", "eqOnhLocCd");
		this.hashFields.put("aud_umch_eq_aset_sts_cd", "audUmchEqAsetStsCd");
		this.hashFields.put("cost_cd", "costCd");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("eq_onh_dt", "eqOnhDt");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("lse_chg_aud_rslt_rsn_desc", "lseChgAudRsltRsnDesc");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("lse_chg_aud_rslt_rsn_cd", "lseChgAudRsltRsnCd");
		this.hashFields.put("pay_lse_chg_amt", "payLseChgAmt");
		this.hashFields.put("eq_bil_end_dt", "eqBilEndDt");
		this.hashFields.put("eq_bil_st_dt", "eqBilStDt");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("eq_offh_dt", "eqOffhDt");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("inv_eq_no", "invEqNo");
		this.hashFields.put("pay_lse_use_dys", "payLseUseDys");
		this.hashFields.put("inv_lse_use_dys", "invLseUseDys");
		this.hashFields.put("aud_umch_eq_sts_evnt_yd_cd", "audUmchEqStsEvntYdCd");
		this.hashFields.put("inv_cust_eq_no", "invCustEqNo");
		this.hashFields.put("pay_inv_seq", "payInvSeq");
		this.hashFields.put("inv_lse_chg_amt", "invLseChgAmt");
		this.hashFields.put("lse_tax_amt", "lseTaxAmt");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("inv_bil_st_dt", "invBilStDt");
		this.hashFields.put("lse_rt_amt", "lseRtAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_eq_offh_dt", "invEqOffhDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lse_chg_aud_sts_cd", "lseChgAudStsCd");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("inv_lse_rt_amt", "invLseRtAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_eq_offh_loc_cd", "invEqOffhLocCd");
		return this.hashFields;
	}
	
	public String getLseChgAmt() {
		return this.lseChgAmt;
	}
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getInvTaxAmt() {
		return this.invTaxAmt;
	}
	public String getLseUseDys() {
		return this.lseUseDys;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getPayTaxAmt() {
		return this.payTaxAmt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPayChgAudRmk() {
		return this.payChgAudRmk;
	}
	public String getInvEqOnhLocCd() {
		return this.invEqOnhLocCd;
	}
	public String getPayLseChgStsCd() {
		return this.payLseChgStsCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCrAmt() {
		return this.crAmt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getAudUmchEqStsEvntDt() {
		return this.audUmchEqStsEvntDt;
	}
	public String getEqOffhLocCd() {
		return this.eqOffhLocCd;
	}
	public String getInvBilEndDt() {
		return this.invBilEndDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getInvEqOnhDt() {
		return this.invEqOnhDt;
	}
	public String getInvRefNo() {
		return this.invRefNo;
	}
	public String getPayCrAmt() {
		return this.payCrAmt;
	}
	public String getPayLseRtAmt() {
		return this.payLseRtAmt;
	}
	public String getEqOnhLocCd() {
		return this.eqOnhLocCd;
	}
	public String getAudUmchEqAsetStsCd() {
		return this.audUmchEqAsetStsCd;
	}
	public String getCostCd() {
		return this.costCd;
	}
	public String getEqNo() {
		return this.eqNo;
	}
	public String getEqOnhDt() {
		return this.eqOnhDt;
	}
	public String getCostYrmon() {
		return this.costYrmon;
	}
	public String getLseChgAudRsltRsnDesc() {
		return this.lseChgAudRsltRsnDesc;
	}
	public String getInvNo() {
		return this.invNo;
	}
	public String getLseChgAudRsltRsnCd() {
		return this.lseChgAudRsltRsnCd;
	}
	public String getPayLseChgAmt() {
		return this.payLseChgAmt;
	}
	public String getEqBilEndDt() {
		return this.eqBilEndDt;
	}
	public String getEqBilStDt() {
		return this.eqBilStDt;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getEqOffhDt() {
		return this.eqOffhDt;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getInvEqNo() {
		return this.invEqNo;
	}
	public String getPayLseUseDys() {
		return this.payLseUseDys;
	}
	public String getInvLseUseDys() {
		return this.invLseUseDys;
	}
	public String getAudUmchEqStsEvntYdCd() {
		return this.audUmchEqStsEvntYdCd;
	}
	public String getInvCustEqNo() {
		return this.invCustEqNo;
	}
	public String getPayInvSeq() {
		return this.payInvSeq;
	}
	public String getInvLseChgAmt() {
		return this.invLseChgAmt;
	}
	public String getLseTaxAmt() {
		return this.lseTaxAmt;
	}
	public String getChgSeq() {
		return this.chgSeq;
	}
	public String getInvBilStDt() {
		return this.invBilStDt;
	}
	public String getLseRtAmt() {
		return this.lseRtAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getInvEqOffhDt() {
		return this.invEqOffhDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getLseChgAudStsCd() {
		return this.lseChgAudStsCd;
	}
	public String getChgCd() {
		return this.chgCd;
	}
	public String getInvLseRtAmt() {
		return this.invLseRtAmt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getInvEqOffhLocCd() {
		return this.invEqOffhLocCd;
	}

	public void setLseChgAmt(String lseChgAmt) {
		this.lseChgAmt = lseChgAmt;
		//this.lseChgAmt=true;
	}
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setInvTaxAmt(String invTaxAmt) {
		this.invTaxAmt = invTaxAmt;
		//this.invTaxAmt=true;
	}
	public void setLseUseDys(String lseUseDys) {
		this.lseUseDys = lseUseDys;
		//this.lseUseDys=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setPayTaxAmt(String payTaxAmt) {
		this.payTaxAmt = payTaxAmt;
		//this.payTaxAmt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPayChgAudRmk(String payChgAudRmk) {
		this.payChgAudRmk = payChgAudRmk;
		//this.payChgAudRmk=true;
	}
	public void setInvEqOnhLocCd(String invEqOnhLocCd) {
		this.invEqOnhLocCd = invEqOnhLocCd;
		//this.invEqOnhLocCd=true;
	}
	public void setPayLseChgStsCd(String payLseChgStsCd) {
		this.payLseChgStsCd = payLseChgStsCd;
		//this.payLseChgStsCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCrAmt(String crAmt) {
		this.crAmt = crAmt;
		//this.crAmt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setAudUmchEqStsEvntDt(String audUmchEqStsEvntDt) {
		this.audUmchEqStsEvntDt = audUmchEqStsEvntDt;
		//this.audUmchEqStsEvntDt=true;
	}
	public void setEqOffhLocCd(String eqOffhLocCd) {
		this.eqOffhLocCd = eqOffhLocCd;
		//this.eqOffhLocCd=true;
	}
	public void setInvBilEndDt(String invBilEndDt) {
		this.invBilEndDt = invBilEndDt;
		//this.invBilEndDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setInvEqOnhDt(String invEqOnhDt) {
		this.invEqOnhDt = invEqOnhDt;
		//this.invEqOnhDt=true;
	}
	public void setInvRefNo(String invRefNo) {
		this.invRefNo = invRefNo;
		//this.invRefNo=true;
	}
	public void setPayCrAmt(String payCrAmt) {
		this.payCrAmt = payCrAmt;
		//this.payCrAmt=true;
	}
	public void setPayLseRtAmt(String payLseRtAmt) {
		this.payLseRtAmt = payLseRtAmt;
		//this.payLseRtAmt=true;
	}
	public void setEqOnhLocCd(String eqOnhLocCd) {
		this.eqOnhLocCd = eqOnhLocCd;
		//this.eqOnhLocCd=true;
	}
	public void setAudUmchEqAsetStsCd(String audUmchEqAsetStsCd) {
		this.audUmchEqAsetStsCd = audUmchEqAsetStsCd;
		//this.audUmchEqAsetStsCd=true;
	}
	public void setCostCd(String costCd) {
		this.costCd = costCd;
		//this.costCd=true;
	}
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
		//this.eqNo=true;
	}
	public void setEqOnhDt(String eqOnhDt) {
		this.eqOnhDt = eqOnhDt;
		//this.eqOnhDt=true;
	}
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
		//this.costYrmon=true;
	}
	public void setLseChgAudRsltRsnDesc(String lseChgAudRsltRsnDesc) {
		this.lseChgAudRsltRsnDesc = lseChgAudRsltRsnDesc;
		//this.lseChgAudRsltRsnDesc=true;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
		//this.invNo=true;
	}
	public void setLseChgAudRsltRsnCd(String lseChgAudRsltRsnCd) {
		this.lseChgAudRsltRsnCd = lseChgAudRsltRsnCd;
		//this.lseChgAudRsltRsnCd=true;
	}
	public void setPayLseChgAmt(String payLseChgAmt) {
		this.payLseChgAmt = payLseChgAmt;
		//this.payLseChgAmt=true;
	}
	public void setEqBilEndDt(String eqBilEndDt) {
		this.eqBilEndDt = eqBilEndDt;
		//this.eqBilEndDt=true;
	}
	public void setEqBilStDt(String eqBilStDt) {
		this.eqBilStDt = eqBilStDt;
		//this.eqBilStDt=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setEqOffhDt(String eqOffhDt) {
		this.eqOffhDt = eqOffhDt;
		//this.eqOffhDt=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setInvEqNo(String invEqNo) {
		this.invEqNo = invEqNo;
		//this.invEqNo=true;
	}
	public void setPayLseUseDys(String payLseUseDys) {
		this.payLseUseDys = payLseUseDys;
		//this.payLseUseDys=true;
	}
	public void setInvLseUseDys(String invLseUseDys) {
		this.invLseUseDys = invLseUseDys;
		//this.invLseUseDys=true;
	}
	public void setAudUmchEqStsEvntYdCd(String audUmchEqStsEvntYdCd) {
		this.audUmchEqStsEvntYdCd = audUmchEqStsEvntYdCd;
		//this.audUmchEqStsEvntYdCd=true;
	}
	public void setInvCustEqNo(String invCustEqNo) {
		this.invCustEqNo = invCustEqNo;
		//this.invCustEqNo=true;
	}
	public void setPayInvSeq(String payInvSeq) {
		this.payInvSeq = payInvSeq;
		//this.payInvSeq=true;
	}
	public void setInvLseChgAmt(String invLseChgAmt) {
		this.invLseChgAmt = invLseChgAmt;
		//this.invLseChgAmt=true;
	}
	public void setLseTaxAmt(String lseTaxAmt) {
		this.lseTaxAmt = lseTaxAmt;
		//this.lseTaxAmt=true;
	}
	public void setChgSeq(String chgSeq) {
		this.chgSeq = chgSeq;
		//this.chgSeq=true;
	}
	public void setInvBilStDt(String invBilStDt) {
		this.invBilStDt = invBilStDt;
		//this.invBilStDt=true;
	}
	public void setLseRtAmt(String lseRtAmt) {
		this.lseRtAmt = lseRtAmt;
		//this.lseRtAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setInvEqOffhDt(String invEqOffhDt) {
		this.invEqOffhDt = invEqOffhDt;
		//this.invEqOffhDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setLseChgAudStsCd(String lseChgAudStsCd) {
		this.lseChgAudStsCd = lseChgAudStsCd;
		//this.lseChgAudStsCd=true;
	}
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
		//this.chgCd=true;
	}
	public void setInvLseRtAmt(String invLseRtAmt) {
		this.invLseRtAmt = invLseRtAmt;
		//this.invLseRtAmt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setInvEqOffhLocCd(String invEqOffhLocCd) {
		this.invEqOffhLocCd = invEqOffhLocCd;
		//this.invEqOffhLocCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setLseChgAmt(JSPUtil.getParameter(request, "lse_chg_amt", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setInvTaxAmt(JSPUtil.getParameter(request, "inv_tax_amt", ""));
		setLseUseDys(JSPUtil.getParameter(request, "lse_use_dys", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setPayTaxAmt(JSPUtil.getParameter(request, "pay_tax_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPayChgAudRmk(JSPUtil.getParameter(request, "pay_chg_aud_rmk", ""));
		setInvEqOnhLocCd(JSPUtil.getParameter(request, "inv_eq_onh_loc_cd", ""));
		setPayLseChgStsCd(JSPUtil.getParameter(request, "pay_lse_chg_sts_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCrAmt(JSPUtil.getParameter(request, "cr_amt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setAudUmchEqStsEvntDt(JSPUtil.getParameter(request, "aud_umch_eq_sts_evnt_dt", ""));
		setEqOffhLocCd(JSPUtil.getParameter(request, "eq_offh_loc_cd", ""));
		setInvBilEndDt(JSPUtil.getParameter(request, "inv_bil_end_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInvEqOnhDt(JSPUtil.getParameter(request, "inv_eq_onh_dt", ""));
		setInvRefNo(JSPUtil.getParameter(request, "inv_ref_no", ""));
		setPayCrAmt(JSPUtil.getParameter(request, "pay_cr_amt", ""));
		setPayLseRtAmt(JSPUtil.getParameter(request, "pay_lse_rt_amt", ""));
		setEqOnhLocCd(JSPUtil.getParameter(request, "eq_onh_loc_cd", ""));
		setAudUmchEqAsetStsCd(JSPUtil.getParameter(request, "aud_umch_eq_aset_sts_cd", ""));
		setCostCd(JSPUtil.getParameter(request, "cost_cd", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setEqOnhDt(JSPUtil.getParameter(request, "eq_onh_dt", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setLseChgAudRsltRsnDesc(JSPUtil.getParameter(request, "lse_chg_aud_rslt_rsn_desc", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setLseChgAudRsltRsnCd(JSPUtil.getParameter(request, "lse_chg_aud_rslt_rsn_cd", ""));
		setPayLseChgAmt(JSPUtil.getParameter(request, "pay_lse_chg_amt", ""));
		setEqBilEndDt(JSPUtil.getParameter(request, "eq_bil_end_dt", ""));
		setEqBilStDt(JSPUtil.getParameter(request, "eq_bil_st_dt", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setEqOffhDt(JSPUtil.getParameter(request, "eq_offh_dt", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setInvEqNo(JSPUtil.getParameter(request, "inv_eq_no", ""));
		setPayLseUseDys(JSPUtil.getParameter(request, "pay_lse_use_dys", ""));
		setInvLseUseDys(JSPUtil.getParameter(request, "inv_lse_use_dys", ""));
		setAudUmchEqStsEvntYdCd(JSPUtil.getParameter(request, "aud_umch_eq_sts_evnt_yd_cd", ""));
		setInvCustEqNo(JSPUtil.getParameter(request, "inv_cust_eq_no", ""));
		setPayInvSeq(JSPUtil.getParameter(request, "pay_inv_seq", ""));
		setInvLseChgAmt(JSPUtil.getParameter(request, "inv_lse_chg_amt", ""));
		setLseTaxAmt(JSPUtil.getParameter(request, "lse_tax_amt", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setInvBilStDt(JSPUtil.getParameter(request, "inv_bil_st_dt", ""));
		setLseRtAmt(JSPUtil.getParameter(request, "lse_rt_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvEqOffhDt(JSPUtil.getParameter(request, "inv_eq_offh_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLseChgAudStsCd(JSPUtil.getParameter(request, "lse_chg_aud_sts_cd", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setInvLseRtAmt(JSPUtil.getParameter(request, "inv_lse_rt_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvEqOffhLocCd(JSPUtil.getParameter(request, "inv_eq_offh_loc_cd", ""));
	}

	public CgmLseChgDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmLseChgDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmLseChgDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lseChgAmt = (JSPUtil.getParameter(request, prefix	+ "lse_chg_amt".trim(), length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] invTaxAmt = (JSPUtil.getParameter(request, prefix	+ "inv_tax_amt".trim(), length));
			String[] lseUseDys = (JSPUtil.getParameter(request, prefix	+ "lse_use_dys".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] payTaxAmt = (JSPUtil.getParameter(request, prefix	+ "pay_tax_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] payChgAudRmk = (JSPUtil.getParameter(request, prefix	+ "pay_chg_aud_rmk".trim(), length));
			String[] invEqOnhLocCd = (JSPUtil.getParameter(request, prefix	+ "inv_eq_onh_loc_cd".trim(), length));
			String[] payLseChgStsCd = (JSPUtil.getParameter(request, prefix	+ "pay_lse_chg_sts_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] crAmt = (JSPUtil.getParameter(request, prefix	+ "cr_amt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] audUmchEqStsEvntDt = (JSPUtil.getParameter(request, prefix	+ "aud_umch_eq_sts_evnt_dt".trim(), length));
			String[] eqOffhLocCd = (JSPUtil.getParameter(request, prefix	+ "eq_offh_loc_cd".trim(), length));
			String[] invBilEndDt = (JSPUtil.getParameter(request, prefix	+ "inv_bil_end_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] invEqOnhDt = (JSPUtil.getParameter(request, prefix	+ "inv_eq_onh_dt".trim(), length));
			String[] invRefNo = (JSPUtil.getParameter(request, prefix	+ "inv_ref_no".trim(), length));
			String[] payCrAmt = (JSPUtil.getParameter(request, prefix	+ "pay_cr_amt".trim(), length));
			String[] payLseRtAmt = (JSPUtil.getParameter(request, prefix	+ "pay_lse_rt_amt".trim(), length));
			String[] eqOnhLocCd = (JSPUtil.getParameter(request, prefix	+ "eq_onh_loc_cd".trim(), length));
			String[] audUmchEqAsetStsCd = (JSPUtil.getParameter(request, prefix	+ "aud_umch_eq_aset_sts_cd".trim(), length));
			String[] costCd = (JSPUtil.getParameter(request, prefix	+ "cost_cd".trim(), length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no".trim(), length));
			String[] eqOnhDt = (JSPUtil.getParameter(request, prefix	+ "eq_onh_dt".trim(), length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon".trim(), length));
			String[] lseChgAudRsltRsnDesc = (JSPUtil.getParameter(request, prefix	+ "lse_chg_aud_rslt_rsn_desc".trim(), length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no".trim(), length));
			String[] lseChgAudRsltRsnCd = (JSPUtil.getParameter(request, prefix	+ "lse_chg_aud_rslt_rsn_cd".trim(), length));
			String[] payLseChgAmt = (JSPUtil.getParameter(request, prefix	+ "pay_lse_chg_amt".trim(), length));
			String[] eqBilEndDt = (JSPUtil.getParameter(request, prefix	+ "eq_bil_end_dt".trim(), length));
			String[] eqBilStDt = (JSPUtil.getParameter(request, prefix	+ "eq_bil_st_dt".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] eqOffhDt = (JSPUtil.getParameter(request, prefix	+ "eq_offh_dt".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] invEqNo = (JSPUtil.getParameter(request, prefix	+ "inv_eq_no".trim(), length));
			String[] payLseUseDys = (JSPUtil.getParameter(request, prefix	+ "pay_lse_use_dys".trim(), length));
			String[] invLseUseDys = (JSPUtil.getParameter(request, prefix	+ "inv_lse_use_dys".trim(), length));
			String[] audUmchEqStsEvntYdCd = (JSPUtil.getParameter(request, prefix	+ "aud_umch_eq_sts_evnt_yd_cd".trim(), length));
			String[] invCustEqNo = (JSPUtil.getParameter(request, prefix	+ "inv_cust_eq_no".trim(), length));
			String[] payInvSeq = (JSPUtil.getParameter(request, prefix	+ "pay_inv_seq".trim(), length));
			String[] invLseChgAmt = (JSPUtil.getParameter(request, prefix	+ "inv_lse_chg_amt".trim(), length));
			String[] lseTaxAmt = (JSPUtil.getParameter(request, prefix	+ "lse_tax_amt".trim(), length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq".trim(), length));
			String[] invBilStDt = (JSPUtil.getParameter(request, prefix	+ "inv_bil_st_dt".trim(), length));
			String[] lseRtAmt = (JSPUtil.getParameter(request, prefix	+ "lse_rt_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] invEqOffhDt = (JSPUtil.getParameter(request, prefix	+ "inv_eq_offh_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] lseChgAudStsCd = (JSPUtil.getParameter(request, prefix	+ "lse_chg_aud_sts_cd".trim(), length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd".trim(), length));
			String[] invLseRtAmt = (JSPUtil.getParameter(request, prefix	+ "inv_lse_rt_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] invEqOffhLocCd = (JSPUtil.getParameter(request, prefix	+ "inv_eq_offh_loc_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmLseChgDtlVO();
				if (lseChgAmt[i] != null)
					model.setLseChgAmt(lseChgAmt[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (invTaxAmt[i] != null)
					model.setInvTaxAmt(invTaxAmt[i]);
				if (lseUseDys[i] != null)
					model.setLseUseDys(lseUseDys[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (payTaxAmt[i] != null)
					model.setPayTaxAmt(payTaxAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (payChgAudRmk[i] != null)
					model.setPayChgAudRmk(payChgAudRmk[i]);
				if (invEqOnhLocCd[i] != null)
					model.setInvEqOnhLocCd(invEqOnhLocCd[i]);
				if (payLseChgStsCd[i] != null)
					model.setPayLseChgStsCd(payLseChgStsCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (crAmt[i] != null)
					model.setCrAmt(crAmt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (audUmchEqStsEvntDt[i] != null)
					model.setAudUmchEqStsEvntDt(audUmchEqStsEvntDt[i]);
				if (eqOffhLocCd[i] != null)
					model.setEqOffhLocCd(eqOffhLocCd[i]);
				if (invBilEndDt[i] != null)
					model.setInvBilEndDt(invBilEndDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invEqOnhDt[i] != null)
					model.setInvEqOnhDt(invEqOnhDt[i]);
				if (invRefNo[i] != null)
					model.setInvRefNo(invRefNo[i]);
				if (payCrAmt[i] != null)
					model.setPayCrAmt(payCrAmt[i]);
				if (payLseRtAmt[i] != null)
					model.setPayLseRtAmt(payLseRtAmt[i]);
				if (eqOnhLocCd[i] != null)
					model.setEqOnhLocCd(eqOnhLocCd[i]);
				if (audUmchEqAsetStsCd[i] != null)
					model.setAudUmchEqAsetStsCd(audUmchEqAsetStsCd[i]);
				if (costCd[i] != null)
					model.setCostCd(costCd[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (eqOnhDt[i] != null)
					model.setEqOnhDt(eqOnhDt[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (lseChgAudRsltRsnDesc[i] != null)
					model.setLseChgAudRsltRsnDesc(lseChgAudRsltRsnDesc[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (lseChgAudRsltRsnCd[i] != null)
					model.setLseChgAudRsltRsnCd(lseChgAudRsltRsnCd[i]);
				if (payLseChgAmt[i] != null)
					model.setPayLseChgAmt(payLseChgAmt[i]);
				if (eqBilEndDt[i] != null)
					model.setEqBilEndDt(eqBilEndDt[i]);
				if (eqBilStDt[i] != null)
					model.setEqBilStDt(eqBilStDt[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (eqOffhDt[i] != null)
					model.setEqOffhDt(eqOffhDt[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (invEqNo[i] != null)
					model.setInvEqNo(invEqNo[i]);
				if (payLseUseDys[i] != null)
					model.setPayLseUseDys(payLseUseDys[i]);
				if (invLseUseDys[i] != null)
					model.setInvLseUseDys(invLseUseDys[i]);
				if (audUmchEqStsEvntYdCd[i] != null)
					model.setAudUmchEqStsEvntYdCd(audUmchEqStsEvntYdCd[i]);
				if (invCustEqNo[i] != null)
					model.setInvCustEqNo(invCustEqNo[i]);
				if (payInvSeq[i] != null)
					model.setPayInvSeq(payInvSeq[i]);
				if (invLseChgAmt[i] != null)
					model.setInvLseChgAmt(invLseChgAmt[i]);
				if (lseTaxAmt[i] != null)
					model.setLseTaxAmt(lseTaxAmt[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (invBilStDt[i] != null)
					model.setInvBilStDt(invBilStDt[i]);
				if (lseRtAmt[i] != null)
					model.setLseRtAmt(lseRtAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invEqOffhDt[i] != null)
					model.setInvEqOffhDt(invEqOffhDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lseChgAudStsCd[i] != null)
					model.setLseChgAudStsCd(lseChgAudStsCd[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (invLseRtAmt[i] != null)
					model.setInvLseRtAmt(invLseRtAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invEqOffhLocCd[i] != null)
					model.setInvEqOffhLocCd(invEqOffhLocCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmLseChgDtlVOs();
	}

	public CgmLseChgDtlVO[] getCgmLseChgDtlVOs(){
		CgmLseChgDtlVO[] vos = (CgmLseChgDtlVO[])models.toArray(new CgmLseChgDtlVO[models.size()]);
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
		this.lseChgAmt = this.lseChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxAmt = this.invTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseUseDys = this.lseUseDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTaxAmt = this.payTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payChgAudRmk = this.payChgAudRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEqOnhLocCd = this.invEqOnhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLseChgStsCd = this.payLseChgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crAmt = this.crAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.audUmchEqStsEvntDt = this.audUmchEqStsEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqOffhLocCd = this.eqOffhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilEndDt = this.invBilEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEqOnhDt = this.invEqOnhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRefNo = this.invRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payCrAmt = this.payCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLseRtAmt = this.payLseRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqOnhLocCd = this.eqOnhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.audUmchEqAsetStsCd = this.audUmchEqAsetStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCd = this.costCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqOnhDt = this.eqOnhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseChgAudRsltRsnDesc = this.lseChgAudRsltRsnDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseChgAudRsltRsnCd = this.lseChgAudRsltRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLseChgAmt = this.payLseChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqBilEndDt = this.eqBilEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqBilStDt = this.eqBilStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqOffhDt = this.eqOffhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEqNo = this.invEqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLseUseDys = this.payLseUseDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invLseUseDys = this.invLseUseDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.audUmchEqStsEvntYdCd = this.audUmchEqStsEvntYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCustEqNo = this.invCustEqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payInvSeq = this.payInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invLseChgAmt = this.invLseChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseTaxAmt = this.lseTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilStDt = this.invBilStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseRtAmt = this.lseRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEqOffhDt = this.invEqOffhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseChgAudStsCd = this.lseChgAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invLseRtAmt = this.invLseRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEqOffhLocCd = this.invEqOffhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
