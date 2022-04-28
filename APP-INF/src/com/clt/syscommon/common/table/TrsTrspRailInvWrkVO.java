/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspRailInvWrkVO.java
*@FileTitle : TrsTrspRailInvWrkVO
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

public class TrsTrspRailInvWrkVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspRailInvWrkVO> models = new ArrayList<TrsTrspRailInvWrkVO>();
	
	/* Column Info */
	private String invCrntProcAmt = null;
	/* Column Info */
	private String invTtlAmt = null;
	/* Column Info */
	private String payDt = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String invPayMzdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String nonBilInvAmt = null;
	/* Column Info */
	private String invIssDt = null;
	/* Column Info */
	private String woVndrSeq = null;
	/* Column Info */
	private String invRcvDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invHldFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String invRjctFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invEffDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dwUpdDt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String trspInvAudStsCd = null;
	/* Column Info */
	private String invVatAmt = null;
	/* Column Info */
	private String genPayTermCd = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String invCfmAmt = null;
	/* Column Info */
	private String invChkTrnsNo = null;
	/* Column Info */
	private String invBzcAmt = null;
	/* Column Info */
	private String invRjctDt = null;
	/* Column Info */
	private String rgstNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspRailInvWrkVO() {}

	public TrsTrspRailInvWrkVO(String ibflag, String pagerows, String invNo, String invVndrSeq, String trspInvAudStsCd, String genPayTermCd, String invCfmDt, String woVndrSeq, String invRcvDt, String invIssDt, String invEffDt, String invCurrCd, String invBzcAmt, String invVatAmt, String invTtlAmt, String nonBilInvAmt, String invCrntProcAmt, String invCfmAmt, String rgstNo, String csrNo, String glDt, String payDt, String invRjctFlg, String invRjctDt, String deltFlg, String deltDt, String creOfcCd, String invPayMzdCd, String invChkTrnsNo, String invHldFlg, String dwUpdDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.invCrntProcAmt = invCrntProcAmt;
		this.invTtlAmt = invTtlAmt;
		this.payDt = payDt;
		this.glDt = glDt;
		this.invVndrSeq = invVndrSeq;
		this.deltFlg = deltFlg;
		this.invPayMzdCd = invPayMzdCd;
		this.creDt = creDt;
		this.nonBilInvAmt = nonBilInvAmt;
		this.invIssDt = invIssDt;
		this.woVndrSeq = woVndrSeq;
		this.invRcvDt = invRcvDt;
		this.pagerows = pagerows;
		this.invHldFlg = invHldFlg;
		this.ibflag = ibflag;
		this.creOfcCd = creOfcCd;
		this.invRjctFlg = invRjctFlg;
		this.updUsrId = updUsrId;
		this.invEffDt = invEffDt;
		this.updDt = updDt;
		this.dwUpdDt = dwUpdDt;
		this.csrNo = csrNo;
		this.trspInvAudStsCd = trspInvAudStsCd;
		this.invVatAmt = invVatAmt;
		this.genPayTermCd = genPayTermCd;
		this.invCfmDt = invCfmDt;
		this.deltDt = deltDt;
		this.invCurrCd = invCurrCd;
		this.invNo = invNo;
		this.creUsrId = creUsrId;
		this.invCfmAmt = invCfmAmt;
		this.invChkTrnsNo = invChkTrnsNo;
		this.invBzcAmt = invBzcAmt;
		this.invRjctDt = invRjctDt;
		this.rgstNo = rgstNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_crnt_proc_amt", getInvCrntProcAmt());
		this.hashColumns.put("inv_ttl_amt", getInvTtlAmt());
		this.hashColumns.put("pay_dt", getPayDt());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("inv_pay_mzd_cd", getInvPayMzdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("non_bil_inv_amt", getNonBilInvAmt());
		this.hashColumns.put("inv_iss_dt", getInvIssDt());
		this.hashColumns.put("wo_vndr_seq", getWoVndrSeq());
		this.hashColumns.put("inv_rcv_dt", getInvRcvDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_hld_flg", getInvHldFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("inv_rjct_flg", getInvRjctFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_eff_dt", getInvEffDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dw_upd_dt", getDwUpdDt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("trsp_inv_aud_sts_cd", getTrspInvAudStsCd());
		this.hashColumns.put("inv_vat_amt", getInvVatAmt());
		this.hashColumns.put("gen_pay_term_cd", getGenPayTermCd());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("inv_cfm_amt", getInvCfmAmt());
		this.hashColumns.put("inv_chk_trns_no", getInvChkTrnsNo());
		this.hashColumns.put("inv_bzc_amt", getInvBzcAmt());
		this.hashColumns.put("inv_rjct_dt", getInvRjctDt());
		this.hashColumns.put("rgst_no", getRgstNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_crnt_proc_amt", "invCrntProcAmt");
		this.hashFields.put("inv_ttl_amt", "invTtlAmt");
		this.hashFields.put("pay_dt", "payDt");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("inv_pay_mzd_cd", "invPayMzdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("non_bil_inv_amt", "nonBilInvAmt");
		this.hashFields.put("inv_iss_dt", "invIssDt");
		this.hashFields.put("wo_vndr_seq", "woVndrSeq");
		this.hashFields.put("inv_rcv_dt", "invRcvDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_hld_flg", "invHldFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("inv_rjct_flg", "invRjctFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_eff_dt", "invEffDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dw_upd_dt", "dwUpdDt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("trsp_inv_aud_sts_cd", "trspInvAudStsCd");
		this.hashFields.put("inv_vat_amt", "invVatAmt");
		this.hashFields.put("gen_pay_term_cd", "genPayTermCd");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("inv_cfm_amt", "invCfmAmt");
		this.hashFields.put("inv_chk_trns_no", "invChkTrnsNo");
		this.hashFields.put("inv_bzc_amt", "invBzcAmt");
		this.hashFields.put("inv_rjct_dt", "invRjctDt");
		this.hashFields.put("rgst_no", "rgstNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return invCrntProcAmt
	 */
	public String getInvCrntProcAmt() {
		return this.invCrntProcAmt;
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
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
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
	 * @return invPayMzdCd
	 */
	public String getInvPayMzdCd() {
		return this.invPayMzdCd;
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
	 * @return nonBilInvAmt
	 */
	public String getNonBilInvAmt() {
		return this.nonBilInvAmt;
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
	 * @return woVndrSeq
	 */
	public String getWoVndrSeq() {
		return this.woVndrSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return dwUpdDt
	 */
	public String getDwUpdDt() {
		return this.dwUpdDt;
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
	 * @return trspInvAudStsCd
	 */
	public String getTrspInvAudStsCd() {
		return this.trspInvAudStsCd;
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
	 * @return invCfmAmt
	 */
	public String getInvCfmAmt() {
		return this.invCfmAmt;
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
	 * @return rgstNo
	 */
	public String getRgstNo() {
		return this.rgstNo;
	}
	

	/**
	 * Column Info
	 * @param invCrntProcAmt
	 */
	public void setInvCrntProcAmt(String invCrntProcAmt) {
		this.invCrntProcAmt = invCrntProcAmt;
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
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
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
	 * @param invPayMzdCd
	 */
	public void setInvPayMzdCd(String invPayMzdCd) {
		this.invPayMzdCd = invPayMzdCd;
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
	 * @param nonBilInvAmt
	 */
	public void setNonBilInvAmt(String nonBilInvAmt) {
		this.nonBilInvAmt = nonBilInvAmt;
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
	 * @param woVndrSeq
	 */
	public void setWoVndrSeq(String woVndrSeq) {
		this.woVndrSeq = woVndrSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param dwUpdDt
	 */
	public void setDwUpdDt(String dwUpdDt) {
		this.dwUpdDt = dwUpdDt;
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
	 * @param trspInvAudStsCd
	 */
	public void setTrspInvAudStsCd(String trspInvAudStsCd) {
		this.trspInvAudStsCd = trspInvAudStsCd;
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
	 * @param invCfmAmt
	 */
	public void setInvCfmAmt(String invCfmAmt) {
		this.invCfmAmt = invCfmAmt;
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
	 * @param rgstNo
	 */
	public void setRgstNo(String rgstNo) {
		this.rgstNo = rgstNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setInvCrntProcAmt(JSPUtil.getParameter(request, "inv_crnt_proc_amt", ""));
		setInvTtlAmt(JSPUtil.getParameter(request, "inv_ttl_amt", ""));
		setPayDt(JSPUtil.getParameter(request, "pay_dt", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setInvPayMzdCd(JSPUtil.getParameter(request, "inv_pay_mzd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setNonBilInvAmt(JSPUtil.getParameter(request, "non_bil_inv_amt", ""));
		setInvIssDt(JSPUtil.getParameter(request, "inv_iss_dt", ""));
		setWoVndrSeq(JSPUtil.getParameter(request, "wo_vndr_seq", ""));
		setInvRcvDt(JSPUtil.getParameter(request, "inv_rcv_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvHldFlg(JSPUtil.getParameter(request, "inv_hld_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setInvRjctFlg(JSPUtil.getParameter(request, "inv_rjct_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvEffDt(JSPUtil.getParameter(request, "inv_eff_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDwUpdDt(JSPUtil.getParameter(request, "dw_upd_dt", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setTrspInvAudStsCd(JSPUtil.getParameter(request, "trsp_inv_aud_sts_cd", ""));
		setInvVatAmt(JSPUtil.getParameter(request, "inv_vat_amt", ""));
		setGenPayTermCd(JSPUtil.getParameter(request, "gen_pay_term_cd", ""));
		setInvCfmDt(JSPUtil.getParameter(request, "inv_cfm_dt", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, "inv_curr_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setInvCfmAmt(JSPUtil.getParameter(request, "inv_cfm_amt", ""));
		setInvChkTrnsNo(JSPUtil.getParameter(request, "inv_chk_trns_no", ""));
		setInvBzcAmt(JSPUtil.getParameter(request, "inv_bzc_amt", ""));
		setInvRjctDt(JSPUtil.getParameter(request, "inv_rjct_dt", ""));
		setRgstNo(JSPUtil.getParameter(request, "rgst_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspRailInvWrkVO[]
	 */
	public TrsTrspRailInvWrkVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspRailInvWrkVO[]
	 */
	public TrsTrspRailInvWrkVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRailInvWrkVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invCrntProcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_crnt_proc_amt", length));
			String[] invTtlAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ttl_amt", length));
			String[] payDt = (JSPUtil.getParameter(request, prefix	+ "pay_dt", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] invPayMzdCd = (JSPUtil.getParameter(request, prefix	+ "inv_pay_mzd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] nonBilInvAmt = (JSPUtil.getParameter(request, prefix	+ "non_bil_inv_amt", length));
			String[] invIssDt = (JSPUtil.getParameter(request, prefix	+ "inv_iss_dt", length));
			String[] woVndrSeq = (JSPUtil.getParameter(request, prefix	+ "wo_vndr_seq", length));
			String[] invRcvDt = (JSPUtil.getParameter(request, prefix	+ "inv_rcv_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invHldFlg = (JSPUtil.getParameter(request, prefix	+ "inv_hld_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] invRjctFlg = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invEffDt = (JSPUtil.getParameter(request, prefix	+ "inv_eff_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dwUpdDt = (JSPUtil.getParameter(request, prefix	+ "dw_upd_dt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] trspInvAudStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_aud_sts_cd", length));
			String[] invVatAmt = (JSPUtil.getParameter(request, prefix	+ "inv_vat_amt", length));
			String[] genPayTermCd = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_cd", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] invCfmAmt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_amt", length));
			String[] invChkTrnsNo = (JSPUtil.getParameter(request, prefix	+ "inv_chk_trns_no", length));
			String[] invBzcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_bzc_amt", length));
			String[] invRjctDt = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_dt", length));
			String[] rgstNo = (JSPUtil.getParameter(request, prefix	+ "rgst_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRailInvWrkVO();
				if (invCrntProcAmt[i] != null)
					model.setInvCrntProcAmt(invCrntProcAmt[i]);
				if (invTtlAmt[i] != null)
					model.setInvTtlAmt(invTtlAmt[i]);
				if (payDt[i] != null)
					model.setPayDt(payDt[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (invPayMzdCd[i] != null)
					model.setInvPayMzdCd(invPayMzdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (nonBilInvAmt[i] != null)
					model.setNonBilInvAmt(nonBilInvAmt[i]);
				if (invIssDt[i] != null)
					model.setInvIssDt(invIssDt[i]);
				if (woVndrSeq[i] != null)
					model.setWoVndrSeq(woVndrSeq[i]);
				if (invRcvDt[i] != null)
					model.setInvRcvDt(invRcvDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invHldFlg[i] != null)
					model.setInvHldFlg(invHldFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (invRjctFlg[i] != null)
					model.setInvRjctFlg(invRjctFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invEffDt[i] != null)
					model.setInvEffDt(invEffDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dwUpdDt[i] != null)
					model.setDwUpdDt(dwUpdDt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (trspInvAudStsCd[i] != null)
					model.setTrspInvAudStsCd(trspInvAudStsCd[i]);
				if (invVatAmt[i] != null)
					model.setInvVatAmt(invVatAmt[i]);
				if (genPayTermCd[i] != null)
					model.setGenPayTermCd(genPayTermCd[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (invCfmAmt[i] != null)
					model.setInvCfmAmt(invCfmAmt[i]);
				if (invChkTrnsNo[i] != null)
					model.setInvChkTrnsNo(invChkTrnsNo[i]);
				if (invBzcAmt[i] != null)
					model.setInvBzcAmt(invBzcAmt[i]);
				if (invRjctDt[i] != null)
					model.setInvRjctDt(invRjctDt[i]);
				if (rgstNo[i] != null)
					model.setRgstNo(rgstNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspRailInvWrkVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspRailInvWrkVO[]
	 */
	public TrsTrspRailInvWrkVO[] getTrsTrspRailInvWrkVOs(){
		TrsTrspRailInvWrkVO[] vos = (TrsTrspRailInvWrkVO[])models.toArray(new TrsTrspRailInvWrkVO[models.size()]);
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
		this.invCrntProcAmt = this.invCrntProcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTtlAmt = this.invTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDt = this.payDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invPayMzdCd = this.invPayMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nonBilInvAmt = this.nonBilInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssDt = this.invIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woVndrSeq = this.woVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRcvDt = this.invRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invHldFlg = this.invHldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctFlg = this.invRjctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEffDt = this.invEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwUpdDt = this.dwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvAudStsCd = this.trspInvAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVatAmt = this.invVatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermCd = this.genPayTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmAmt = this.invCfmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invChkTrnsNo = this.invChkTrnsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBzcAmt = this.invBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctDt = this.invRjctDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstNo = this.rgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
