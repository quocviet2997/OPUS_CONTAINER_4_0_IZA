/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspInvWrkVO.java
*@FileTitle : TrsTrspInvWrkVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준  
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspInvWrkVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspInvWrkVO> models = new ArrayList<TrsTrspInvWrkVO>();
	
	/* Column Info */
	private String payDt = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String hjlInvTtlAmt = null;
	/* Column Info */
	private String chssPoolCd = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String invPayMzdCd = null;
	/* Column Info */
	private String hjlWoVndrSeq = null;
	/* Column Info */
	private String invIssDt = null;
	/* Column Info */
	private String hjlInvAudStsCd = null;
	/* Column Info */
	private String invRcvDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invHldFlg = null;
	/* Column Info */
	private String provUsrId = null;
	/* Column Info */
	private String hjlInvIssDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hjlInvBzcAmt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String dwUpdDt = null;
	/* Column Info */
	private String trspInvAudStsCd = null;
	/* Column Info */
	private String invWhldTaxAmt = null;
	/* Column Info */
	private String hjlInvVatAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hjlNo = null;
	/* Column Info */
	private String invChkTrnsNo = null;
	/* Column Info */
	private String invBzcAmt = null;
	/* Column Info */
	private String invRjctDt = null;
	/* Column Info */
	private String hjlInvWhldTaxAmt = null;
	/* Column Info */
	private String rgstNo = null;
	/* Column Info */
	private String invTtlAmt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String woVndrSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hjlInvVndrSeq = null;
	/* Column Info */
	private String hjlInvCurrCd = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String invRjctFlg = null;
	/* Column Info */
	private String provPhnNo = null;
	/* Column Info */
	private String poolChssCostYrmon = null;
	/* Column Info */
	private String invEffDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invVatAmt = null;
	/* Column Info */
	private String hjlInvNo = null;
	/* Column Info */
	private String genPayTermCd = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String hjlInvRcvDt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String ifSysKndCd = null;
	/* Column Info */
	private String bfInvHldFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspInvWrkVO() {}

	public TrsTrspInvWrkVO(String ibflag, String pagerows, String invNo, String invVndrSeq, String csrNo, String trspInvAudStsCd, String genPayTermCd, String invCfmDt, String woVndrSeq, String invCurrCd, String invBzcAmt, String invVatAmt, String invTtlAmt, String rgstNo, String invPayMzdCd, String invChkTrnsNo, String glDt, String payDt, String invRjctFlg, String invEffDt, String invRjctDt, String invRcvDt, String invIssDt, String ifSysKndCd, String invHldFlg, String provUsrId, String provPhnNo, String deltFlg, String deltDt, String creOfcCd, String invWhldTaxAmt, String hjlNo, String hjlInvNo, String hjlInvVndrSeq, String hjlInvCurrCd, String hjlInvBzcAmt, String hjlInvVatAmt, String hjlInvTtlAmt, String hjlWoVndrSeq, String hjlInvWhldTaxAmt, String hjlInvRcvDt, String hjlInvIssDt, String hjlInvAudStsCd, String poolChssCostYrmon, String chssPoolCd, String dwUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String bfInvHldFlg) {
		this.payDt = payDt;
		this.glDt = glDt;
		this.hjlInvTtlAmt = hjlInvTtlAmt;
		this.chssPoolCd = chssPoolCd;
		this.invVndrSeq = invVndrSeq;
		this.invPayMzdCd = invPayMzdCd;
		this.hjlWoVndrSeq = hjlWoVndrSeq;
		this.invIssDt = invIssDt;
		this.hjlInvAudStsCd = hjlInvAudStsCd;
		this.invRcvDt = invRcvDt;
		this.pagerows = pagerows;
		this.invHldFlg = invHldFlg;
		this.provUsrId = provUsrId;
		this.hjlInvIssDt = hjlInvIssDt;
		this.updUsrId = updUsrId;
		this.hjlInvBzcAmt = hjlInvBzcAmt;
		this.csrNo = csrNo;
		this.dwUpdDt = dwUpdDt;
		this.trspInvAudStsCd = trspInvAudStsCd;
		this.invWhldTaxAmt = invWhldTaxAmt;
		this.hjlInvVatAmt = hjlInvVatAmt;
		this.creUsrId = creUsrId;
		this.hjlNo = hjlNo;
		this.invChkTrnsNo = invChkTrnsNo;
		this.invBzcAmt = invBzcAmt;
		this.invRjctDt = invRjctDt;
		this.hjlInvWhldTaxAmt = hjlInvWhldTaxAmt;
		this.rgstNo = rgstNo;
		this.invTtlAmt = invTtlAmt;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.woVndrSeq = woVndrSeq;
		this.ibflag = ibflag;
		this.hjlInvVndrSeq = hjlInvVndrSeq;
		this.hjlInvCurrCd = hjlInvCurrCd;
		this.creOfcCd = creOfcCd;
		this.invRjctFlg = invRjctFlg;
		this.provPhnNo = provPhnNo;
		this.poolChssCostYrmon = poolChssCostYrmon;
		this.invEffDt = invEffDt;
		this.updDt = updDt;
		this.invVatAmt = invVatAmt;
		this.hjlInvNo = hjlInvNo;
		this.genPayTermCd = genPayTermCd;
		this.invCfmDt = invCfmDt;
		this.deltDt = deltDt;
		this.invCurrCd = invCurrCd;
		this.hjlInvRcvDt = hjlInvRcvDt;
		this.invNo = invNo;
		this.ifSysKndCd = ifSysKndCd;
		this.bfInvHldFlg = bfInvHldFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pay_dt", getPayDt());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("hjl_inv_ttl_amt", getHjlInvTtlAmt());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("inv_pay_mzd_cd", getInvPayMzdCd());
		this.hashColumns.put("hjl_wo_vndr_seq", getHjlWoVndrSeq());
		this.hashColumns.put("inv_iss_dt", getInvIssDt());
		this.hashColumns.put("hjl_inv_aud_sts_cd", getHjlInvAudStsCd());
		this.hashColumns.put("inv_rcv_dt", getInvRcvDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_hld_flg", getInvHldFlg());
		this.hashColumns.put("prov_usr_id", getProvUsrId());
		this.hashColumns.put("hjl_inv_iss_dt", getHjlInvIssDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hjl_inv_bzc_amt", getHjlInvBzcAmt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("dw_upd_dt", getDwUpdDt());
		this.hashColumns.put("trsp_inv_aud_sts_cd", getTrspInvAudStsCd());
		this.hashColumns.put("inv_whld_tax_amt", getInvWhldTaxAmt());
		this.hashColumns.put("hjl_inv_vat_amt", getHjlInvVatAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hjl_no", getHjlNo());
		this.hashColumns.put("inv_chk_trns_no", getInvChkTrnsNo());
		this.hashColumns.put("inv_bzc_amt", getInvBzcAmt());
		this.hashColumns.put("inv_rjct_dt", getInvRjctDt());
		this.hashColumns.put("hjl_inv_whld_tax_amt", getHjlInvWhldTaxAmt());
		this.hashColumns.put("rgst_no", getRgstNo());
		this.hashColumns.put("inv_ttl_amt", getInvTtlAmt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("wo_vndr_seq", getWoVndrSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("hjl_inv_vndr_seq", getHjlInvVndrSeq());
		this.hashColumns.put("hjl_inv_curr_cd", getHjlInvCurrCd());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("inv_rjct_flg", getInvRjctFlg());
		this.hashColumns.put("prov_phn_no", getProvPhnNo());
		this.hashColumns.put("pool_chss_cost_yrmon", getPoolChssCostYrmon());
		this.hashColumns.put("inv_eff_dt", getInvEffDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_vat_amt", getInvVatAmt());
		this.hashColumns.put("hjl_inv_no", getHjlInvNo());
		this.hashColumns.put("gen_pay_term_cd", getGenPayTermCd());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("hjl_inv_rcv_dt", getHjlInvRcvDt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("if_sys_knd_cd", getIfSysKndCd());
		this.hashColumns.put("bf_inv_hld_flg", getBfInvHldFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pay_dt", "payDt");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("hjl_inv_ttl_amt", "hjlInvTtlAmt");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("inv_pay_mzd_cd", "invPayMzdCd");
		this.hashFields.put("hjl_wo_vndr_seq", "hjlWoVndrSeq");
		this.hashFields.put("inv_iss_dt", "invIssDt");
		this.hashFields.put("hjl_inv_aud_sts_cd", "hjlInvAudStsCd");
		this.hashFields.put("inv_rcv_dt", "invRcvDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_hld_flg", "invHldFlg");
		this.hashFields.put("prov_usr_id", "provUsrId");
		this.hashFields.put("hjl_inv_iss_dt", "hjlInvIssDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hjl_inv_bzc_amt", "hjlInvBzcAmt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("dw_upd_dt", "dwUpdDt");
		this.hashFields.put("trsp_inv_aud_sts_cd", "trspInvAudStsCd");
		this.hashFields.put("inv_whld_tax_amt", "invWhldTaxAmt");
		this.hashFields.put("hjl_inv_vat_amt", "hjlInvVatAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hjl_no", "hjlNo");
		this.hashFields.put("inv_chk_trns_no", "invChkTrnsNo");
		this.hashFields.put("inv_bzc_amt", "invBzcAmt");
		this.hashFields.put("inv_rjct_dt", "invRjctDt");
		this.hashFields.put("hjl_inv_whld_tax_amt", "hjlInvWhldTaxAmt");
		this.hashFields.put("rgst_no", "rgstNo");
		this.hashFields.put("inv_ttl_amt", "invTtlAmt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("wo_vndr_seq", "woVndrSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("hjl_inv_vndr_seq", "hjlInvVndrSeq");
		this.hashFields.put("hjl_inv_curr_cd", "hjlInvCurrCd");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("inv_rjct_flg", "invRjctFlg");
		this.hashFields.put("prov_phn_no", "provPhnNo");
		this.hashFields.put("pool_chss_cost_yrmon", "poolChssCostYrmon");
		this.hashFields.put("inv_eff_dt", "invEffDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_vat_amt", "invVatAmt");
		this.hashFields.put("hjl_inv_no", "hjlInvNo");
		this.hashFields.put("gen_pay_term_cd", "genPayTermCd");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("hjl_inv_rcv_dt", "hjlInvRcvDt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("if_sys_knd_cd", "ifSysKndCd");
		this.hashFields.put("bf_inv_hld_flg", "bfInvHldFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return payDt
	 */
	public String getPayDt() {
		return this.payDt;
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
	 * @return hjlInvTtlAmt
	 */
	public String getHjlInvTtlAmt() {
		return this.hjlInvTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return chssPoolCd
	 */
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}
	
	/**
	 * Column Info
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return invPayMzdCd
	 */
	public String getInvPayMzdCd() {
		return this.invPayMzdCd;
	}
	
	/**
	 * Column Info
	 * @return hjlWoVndrSeq
	 */
	public String getHjlWoVndrSeq() {
		return this.hjlWoVndrSeq;
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
	 * @return hjlInvAudStsCd
	 */
	public String getHjlInvAudStsCd() {
		return this.hjlInvAudStsCd;
	}
	
	/**
	 * Column Info
	 * @return invRcvDt
	 */
	public String getInvRcvDt() {
		return this.invRcvDt;
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
	 * @return invHldFlg
	 */
	public String getInvHldFlg() {
		return this.invHldFlg;
	}
	
	/**
	 * Column Info
	 * @return provUsrId
	 */
	public String getProvUsrId() {
		return this.provUsrId;
	}
	
	/**
	 * Column Info
	 * @return hjlInvIssDt
	 */
	public String getHjlInvIssDt() {
		return this.hjlInvIssDt;
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
	 * @return hjlInvBzcAmt
	 */
	public String getHjlInvBzcAmt() {
		return this.hjlInvBzcAmt;
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
	 * @return dwUpdDt
	 */
	public String getDwUpdDt() {
		return this.dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return trspInvAudStsCd
	 */
	public String getTrspInvAudStsCd() {
		return this.trspInvAudStsCd;
	}
	
	/**
	 * Column Info
	 * @return invWhldTaxAmt
	 */
	public String getInvWhldTaxAmt() {
		return this.invWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return hjlInvVatAmt
	 */
	public String getHjlInvVatAmt() {
		return this.hjlInvVatAmt;
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
	 * @return hjlNo
	 */
	public String getHjlNo() {
		return this.hjlNo;
	}
	
	/**
	 * Column Info
	 * @return invChkTrnsNo
	 */
	public String getInvChkTrnsNo() {
		return this.invChkTrnsNo;
	}
	
	/**
	 * Column Info
	 * @return invBzcAmt
	 */
	public String getInvBzcAmt() {
		return this.invBzcAmt;
	}
	
	/**
	 * Column Info
	 * @return invRjctDt
	 */
	public String getInvRjctDt() {
		return this.invRjctDt;
	}
	
	/**
	 * Column Info
	 * @return hjlInvWhldTaxAmt
	 */
	public String getHjlInvWhldTaxAmt() {
		return this.hjlInvWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return rgstNo
	 */
	public String getRgstNo() {
		return this.rgstNo;
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
	 * @return woVndrSeq
	 */
	public String getWoVndrSeq() {
		return this.woVndrSeq;
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
	 * @return hjlInvVndrSeq
	 */
	public String getHjlInvVndrSeq() {
		return this.hjlInvVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return hjlInvCurrCd
	 */
	public String getHjlInvCurrCd() {
		return this.hjlInvCurrCd;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return invRjctFlg
	 */
	public String getInvRjctFlg() {
		return this.invRjctFlg;
	}
	
	/**
	 * Column Info
	 * @return provPhnNo
	 */
	public String getProvPhnNo() {
		return this.provPhnNo;
	}
	
	/**
	 * Column Info
	 * @return poolChssCostYrmon
	 */
	public String getPoolChssCostYrmon() {
		return this.poolChssCostYrmon;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
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
	 * @return hjlInvNo
	 */
	public String getHjlInvNo() {
		return this.hjlInvNo;
	}
	
	/**
	 * Column Info
	 * @return genPayTermCd
	 */
	public String getGenPayTermCd() {
		return this.genPayTermCd;
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
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
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
	 * @return hjlInvRcvDt
	 */
	public String getHjlInvRcvDt() {
		return this.hjlInvRcvDt;
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
	 * @return ifSysKndCd
	 */
	public String getIfSysKndCd() {
		return this.ifSysKndCd;
	}
	

	/**
	 * Column Info
	 * @param payDt
	 */
	public void setPayDt(String payDt) {
		this.payDt = payDt;
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
	 * @param hjlInvTtlAmt
	 */
	public void setHjlInvTtlAmt(String hjlInvTtlAmt) {
		this.hjlInvTtlAmt = hjlInvTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param chssPoolCd
	 */
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * Column Info
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param invPayMzdCd
	 */
	public void setInvPayMzdCd(String invPayMzdCd) {
		this.invPayMzdCd = invPayMzdCd;
	}
	
	/**
	 * Column Info
	 * @param hjlWoVndrSeq
	 */
	public void setHjlWoVndrSeq(String hjlWoVndrSeq) {
		this.hjlWoVndrSeq = hjlWoVndrSeq;
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
	 * @param hjlInvAudStsCd
	 */
	public void setHjlInvAudStsCd(String hjlInvAudStsCd) {
		this.hjlInvAudStsCd = hjlInvAudStsCd;
	}
	
	/**
	 * Column Info
	 * @param invRcvDt
	 */
	public void setInvRcvDt(String invRcvDt) {
		this.invRcvDt = invRcvDt;
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
	 * @param invHldFlg
	 */
	public void setInvHldFlg(String invHldFlg) {
		this.invHldFlg = invHldFlg;
	}
	
	/**
	 * Column Info
	 * @param provUsrId
	 */
	public void setProvUsrId(String provUsrId) {
		this.provUsrId = provUsrId;
	}
	
	/**
	 * Column Info
	 * @param hjlInvIssDt
	 */
	public void setHjlInvIssDt(String hjlInvIssDt) {
		this.hjlInvIssDt = hjlInvIssDt;
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
	 * @param hjlInvBzcAmt
	 */
	public void setHjlInvBzcAmt(String hjlInvBzcAmt) {
		this.hjlInvBzcAmt = hjlInvBzcAmt;
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
	 * @param dwUpdDt
	 */
	public void setDwUpdDt(String dwUpdDt) {
		this.dwUpdDt = dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param trspInvAudStsCd
	 */
	public void setTrspInvAudStsCd(String trspInvAudStsCd) {
		this.trspInvAudStsCd = trspInvAudStsCd;
	}
	
	/**
	 * Column Info
	 * @param invWhldTaxAmt
	 */
	public void setInvWhldTaxAmt(String invWhldTaxAmt) {
		this.invWhldTaxAmt = invWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param hjlInvVatAmt
	 */
	public void setHjlInvVatAmt(String hjlInvVatAmt) {
		this.hjlInvVatAmt = hjlInvVatAmt;
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
	 * @param hjlNo
	 */
	public void setHjlNo(String hjlNo) {
		this.hjlNo = hjlNo;
	}
	
	/**
	 * Column Info
	 * @param invChkTrnsNo
	 */
	public void setInvChkTrnsNo(String invChkTrnsNo) {
		this.invChkTrnsNo = invChkTrnsNo;
	}
	
	/**
	 * Column Info
	 * @param invBzcAmt
	 */
	public void setInvBzcAmt(String invBzcAmt) {
		this.invBzcAmt = invBzcAmt;
	}
	
	/**
	 * Column Info
	 * @param invRjctDt
	 */
	public void setInvRjctDt(String invRjctDt) {
		this.invRjctDt = invRjctDt;
	}
	
	/**
	 * Column Info
	 * @param hjlInvWhldTaxAmt
	 */
	public void setHjlInvWhldTaxAmt(String hjlInvWhldTaxAmt) {
		this.hjlInvWhldTaxAmt = hjlInvWhldTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param rgstNo
	 */
	public void setRgstNo(String rgstNo) {
		this.rgstNo = rgstNo;
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
	 * @param woVndrSeq
	 */
	public void setWoVndrSeq(String woVndrSeq) {
		this.woVndrSeq = woVndrSeq;
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
	 * @param hjlInvVndrSeq
	 */
	public void setHjlInvVndrSeq(String hjlInvVndrSeq) {
		this.hjlInvVndrSeq = hjlInvVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param hjlInvCurrCd
	 */
	public void setHjlInvCurrCd(String hjlInvCurrCd) {
		this.hjlInvCurrCd = hjlInvCurrCd;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param invRjctFlg
	 */
	public void setInvRjctFlg(String invRjctFlg) {
		this.invRjctFlg = invRjctFlg;
	}
	
	/**
	 * Column Info
	 * @param provPhnNo
	 */
	public void setProvPhnNo(String provPhnNo) {
		this.provPhnNo = provPhnNo;
	}
	
	/**
	 * Column Info
	 * @param poolChssCostYrmon
	 */
	public void setPoolChssCostYrmon(String poolChssCostYrmon) {
		this.poolChssCostYrmon = poolChssCostYrmon;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param hjlInvNo
	 */
	public void setHjlInvNo(String hjlInvNo) {
		this.hjlInvNo = hjlInvNo;
	}
	
	/**
	 * Column Info
	 * @param genPayTermCd
	 */
	public void setGenPayTermCd(String genPayTermCd) {
		this.genPayTermCd = genPayTermCd;
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
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
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
	 * @param hjlInvRcvDt
	 */
	public void setHjlInvRcvDt(String hjlInvRcvDt) {
		this.hjlInvRcvDt = hjlInvRcvDt;
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
	 * @param ifSysKndCd
	 */
	public void setIfSysKndCd(String ifSysKndCd) {
		this.ifSysKndCd = ifSysKndCd;
	}
	
	
	/**
	 * Column Info
	 * @return
	 */
	public String getBfInvHldFlg() {
		return bfInvHldFlg;
	}

	/**
	 *  Column Info
	 * @param bfInvHldFlg
	 */
	public void setBfInvHldFlg(String bfInvHldFlg) {
		this.bfInvHldFlg = bfInvHldFlg;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPayDt(JSPUtil.getParameter(request, "pay_dt", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setHjlInvTtlAmt(JSPUtil.getParameter(request, "hjl_inv_ttl_amt", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setInvPayMzdCd(JSPUtil.getParameter(request, "inv_pay_mzd_cd", ""));
		setHjlWoVndrSeq(JSPUtil.getParameter(request, "hjl_wo_vndr_seq", ""));
		setInvIssDt(JSPUtil.getParameter(request, "inv_iss_dt", ""));
		setHjlInvAudStsCd(JSPUtil.getParameter(request, "hjl_inv_aud_sts_cd", ""));
		setInvRcvDt(JSPUtil.getParameter(request, "inv_rcv_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvHldFlg(JSPUtil.getParameter(request, "inv_hld_flg", ""));
		setProvUsrId(JSPUtil.getParameter(request, "prov_usr_id", ""));
		setHjlInvIssDt(JSPUtil.getParameter(request, "hjl_inv_iss_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHjlInvBzcAmt(JSPUtil.getParameter(request, "hjl_inv_bzc_amt", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setDwUpdDt(JSPUtil.getParameter(request, "dw_upd_dt", ""));
		setTrspInvAudStsCd(JSPUtil.getParameter(request, "trsp_inv_aud_sts_cd", ""));
		setInvWhldTaxAmt(JSPUtil.getParameter(request, "inv_whld_tax_amt", ""));
		setHjlInvVatAmt(JSPUtil.getParameter(request, "hjl_inv_vat_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setHjlNo(JSPUtil.getParameter(request, "hjl_no", ""));
		setInvChkTrnsNo(JSPUtil.getParameter(request, "inv_chk_trns_no", ""));
		setInvBzcAmt(JSPUtil.getParameter(request, "inv_bzc_amt", ""));
		setInvRjctDt(JSPUtil.getParameter(request, "inv_rjct_dt", ""));
		setHjlInvWhldTaxAmt(JSPUtil.getParameter(request, "hjl_inv_whld_tax_amt", ""));
		setRgstNo(JSPUtil.getParameter(request, "rgst_no", ""));
		setInvTtlAmt(JSPUtil.getParameter(request, "inv_ttl_amt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setWoVndrSeq(JSPUtil.getParameter(request, "wo_vndr_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setHjlInvVndrSeq(JSPUtil.getParameter(request, "hjl_inv_vndr_seq", ""));
		setHjlInvCurrCd(JSPUtil.getParameter(request, "hjl_inv_curr_cd", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setInvRjctFlg(JSPUtil.getParameter(request, "inv_rjct_flg", ""));
		setProvPhnNo(JSPUtil.getParameter(request, "prov_phn_no", ""));
		setPoolChssCostYrmon(JSPUtil.getParameter(request, "pool_chss_cost_yrmon", ""));
		setInvEffDt(JSPUtil.getParameter(request, "inv_eff_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvVatAmt(JSPUtil.getParameter(request, "inv_vat_amt", ""));
		setHjlInvNo(JSPUtil.getParameter(request, "hjl_inv_no", ""));
		setGenPayTermCd(JSPUtil.getParameter(request, "gen_pay_term_cd", ""));
		setInvCfmDt(JSPUtil.getParameter(request, "inv_cfm_dt", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, "inv_curr_cd", ""));
		setHjlInvRcvDt(JSPUtil.getParameter(request, "hjl_inv_rcv_dt", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setIfSysKndCd(JSPUtil.getParameter(request, "if_sys_knd_cd", ""));
		setBfInvHldFlg(JSPUtil.getParameter(request, "bf_inv_hld_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspInvWrkVO[]
	 */
	public TrsTrspInvWrkVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspInvWrkVO[]
	 */
	public TrsTrspInvWrkVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspInvWrkVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] payDt = (JSPUtil.getParameter(request, prefix	+ "pay_dt", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] hjlInvTtlAmt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_ttl_amt", length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] invPayMzdCd = (JSPUtil.getParameter(request, prefix	+ "inv_pay_mzd_cd", length));
			String[] hjlWoVndrSeq = (JSPUtil.getParameter(request, prefix	+ "hjl_wo_vndr_seq", length));
			String[] invIssDt = (JSPUtil.getParameter(request, prefix	+ "inv_iss_dt", length));
			String[] hjlInvAudStsCd = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_aud_sts_cd", length));
			String[] invRcvDt = (JSPUtil.getParameter(request, prefix	+ "inv_rcv_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invHldFlg = (JSPUtil.getParameter(request, prefix	+ "inv_hld_flg", length));
			String[] provUsrId = (JSPUtil.getParameter(request, prefix	+ "prov_usr_id", length));
			String[] hjlInvIssDt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_iss_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] hjlInvBzcAmt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_bzc_amt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] dwUpdDt = (JSPUtil.getParameter(request, prefix	+ "dw_upd_dt", length));
			String[] trspInvAudStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_aud_sts_cd", length));
			String[] invWhldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "inv_whld_tax_amt", length));
			String[] hjlInvVatAmt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_vat_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hjlNo = (JSPUtil.getParameter(request, prefix	+ "hjl_no", length));
			String[] invChkTrnsNo = (JSPUtil.getParameter(request, prefix	+ "inv_chk_trns_no", length));
			String[] invBzcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_bzc_amt", length));
			String[] invRjctDt = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_dt", length));
			String[] hjlInvWhldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_whld_tax_amt", length));
			String[] rgstNo = (JSPUtil.getParameter(request, prefix	+ "rgst_no", length));
			String[] invTtlAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ttl_amt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] woVndrSeq = (JSPUtil.getParameter(request, prefix	+ "wo_vndr_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hjlInvVndrSeq = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_vndr_seq", length));
			String[] hjlInvCurrCd = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_curr_cd", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] invRjctFlg = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_flg", length));
			String[] provPhnNo = (JSPUtil.getParameter(request, prefix	+ "prov_phn_no", length));
			String[] poolChssCostYrmon = (JSPUtil.getParameter(request, prefix	+ "pool_chss_cost_yrmon", length));
			String[] invEffDt = (JSPUtil.getParameter(request, prefix	+ "inv_eff_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] invVatAmt = (JSPUtil.getParameter(request, prefix	+ "inv_vat_amt", length));
			String[] hjlInvNo = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_no", length));
			String[] genPayTermCd = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_cd", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] hjlInvRcvDt = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_rcv_dt", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ifSysKndCd = (JSPUtil.getParameter(request, prefix	+ "if_sys_knd_cd", length));
			String[] bfInvHldFlg = (JSPUtil.getParameter(request, prefix	+ "bf_inv_hld_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspInvWrkVO();
				if (payDt[i] != null)
					model.setPayDt(payDt[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (hjlInvTtlAmt[i] != null)
					model.setHjlInvTtlAmt(hjlInvTtlAmt[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (invPayMzdCd[i] != null)
					model.setInvPayMzdCd(invPayMzdCd[i]);
				if (hjlWoVndrSeq[i] != null)
					model.setHjlWoVndrSeq(hjlWoVndrSeq[i]);
				if (invIssDt[i] != null)
					model.setInvIssDt(invIssDt[i]);
				if (hjlInvAudStsCd[i] != null)
					model.setHjlInvAudStsCd(hjlInvAudStsCd[i]);
				if (invRcvDt[i] != null)
					model.setInvRcvDt(invRcvDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invHldFlg[i] != null)
					model.setInvHldFlg(invHldFlg[i]);
				if (provUsrId[i] != null)
					model.setProvUsrId(provUsrId[i]);
				if (hjlInvIssDt[i] != null)
					model.setHjlInvIssDt(hjlInvIssDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hjlInvBzcAmt[i] != null)
					model.setHjlInvBzcAmt(hjlInvBzcAmt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (dwUpdDt[i] != null)
					model.setDwUpdDt(dwUpdDt[i]);
				if (trspInvAudStsCd[i] != null)
					model.setTrspInvAudStsCd(trspInvAudStsCd[i]);
				if (invWhldTaxAmt[i] != null)
					model.setInvWhldTaxAmt(invWhldTaxAmt[i]);
				if (hjlInvVatAmt[i] != null)
					model.setHjlInvVatAmt(hjlInvVatAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hjlNo[i] != null)
					model.setHjlNo(hjlNo[i]);
				if (invChkTrnsNo[i] != null)
					model.setInvChkTrnsNo(invChkTrnsNo[i]);
				if (invBzcAmt[i] != null)
					model.setInvBzcAmt(invBzcAmt[i]);
				if (invRjctDt[i] != null)
					model.setInvRjctDt(invRjctDt[i]);
				if (hjlInvWhldTaxAmt[i] != null)
					model.setHjlInvWhldTaxAmt(hjlInvWhldTaxAmt[i]);
				if (rgstNo[i] != null)
					model.setRgstNo(rgstNo[i]);
				if (invTtlAmt[i] != null)
					model.setInvTtlAmt(invTtlAmt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (woVndrSeq[i] != null)
					model.setWoVndrSeq(woVndrSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hjlInvVndrSeq[i] != null)
					model.setHjlInvVndrSeq(hjlInvVndrSeq[i]);
				if (hjlInvCurrCd[i] != null)
					model.setHjlInvCurrCd(hjlInvCurrCd[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (invRjctFlg[i] != null)
					model.setInvRjctFlg(invRjctFlg[i]);
				if (provPhnNo[i] != null)
					model.setProvPhnNo(provPhnNo[i]);
				if (poolChssCostYrmon[i] != null)
					model.setPoolChssCostYrmon(poolChssCostYrmon[i]);
				if (invEffDt[i] != null)
					model.setInvEffDt(invEffDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invVatAmt[i] != null)
					model.setInvVatAmt(invVatAmt[i]);
				if (hjlInvNo[i] != null)
					model.setHjlInvNo(hjlInvNo[i]);
				if (genPayTermCd[i] != null)
					model.setGenPayTermCd(genPayTermCd[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (hjlInvRcvDt[i] != null)
					model.setHjlInvRcvDt(hjlInvRcvDt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ifSysKndCd[i] != null)
					model.setIfSysKndCd(ifSysKndCd[i]);
				if (bfInvHldFlg[i] != null)
					model.setBfInvHldFlg(bfInvHldFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspInvWrkVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspInvWrkVO[]
	 */
	public TrsTrspInvWrkVO[] getTrsTrspInvWrkVOs(){
		TrsTrspInvWrkVO[] vos = (TrsTrspInvWrkVO[])models.toArray(new TrsTrspInvWrkVO[models.size()]);
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
		this.payDt = this.payDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvTtlAmt = this.hjlInvTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invPayMzdCd = this.invPayMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlWoVndrSeq = this.hjlWoVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssDt = this.invIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvAudStsCd = this.hjlInvAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRcvDt = this.invRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invHldFlg = this.invHldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.provUsrId = this.provUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvIssDt = this.hjlInvIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvBzcAmt = this.hjlInvBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwUpdDt = this.dwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvAudStsCd = this.trspInvAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invWhldTaxAmt = this.invWhldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvVatAmt = this.hjlInvVatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlNo = this.hjlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invChkTrnsNo = this.invChkTrnsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBzcAmt = this.invBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctDt = this.invRjctDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvWhldTaxAmt = this.hjlInvWhldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstNo = this.rgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTtlAmt = this.invTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woVndrSeq = this.woVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvVndrSeq = this.hjlInvVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvCurrCd = this.hjlInvCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctFlg = this.invRjctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.provPhnNo = this.provPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolChssCostYrmon = this.poolChssCostYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEffDt = this.invEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVatAmt = this.invVatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvNo = this.hjlInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermCd = this.genPayTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvRcvDt = this.hjlInvRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSysKndCd = this.ifSysKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfInvHldFlg = this.bfInvHldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
