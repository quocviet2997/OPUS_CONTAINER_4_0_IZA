/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : CsrListInputVO.java
*@FileTitle : CsrListInputVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.16
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.16  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

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

public class CsrListInputVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CsrListInputVO> models = new ArrayList<CsrListInputVO>();
	
	/* Column Info */
	private String invTtlAmt = null;
	/* Column Info */
	private String vndrTermNm = null;
	/* Column Info */
	private String invVatAmt = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String psoTrnsSlpCtnt = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String ppdNo = null;
	/* Column Info */
	private String invNetAmt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String whldTaxAmt = null;
	/* Column Info */
	private String ppayAplyFlg = null;
	/* Column Info */
	private String ppdDtrbNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String issDt = null;
	/* Column Info */
	private String invRjctStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String invStsCd = null;
	/* Column Info */
	private String ttlLssDivCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String payDueDt = null;
	/* Column Info */
	private String ppdGlDt = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String ppdAplyAmt = null;
	/* Column Info */
	private String invOfcCd = null;
	/* Column Info */
	private String invRgstNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public CsrListInputVO() {}

	public CsrListInputVO(String ibflag, String pagerows, String ppayAplyFlg, String ppdNo, String ppdDtrbNo, String ppdAplyAmt, String ppdGlDt, String invTtlAmt, String vndrTermNm, String invVatAmt, String costOfcCd, String psoTrnsSlpCtnt, String invCfmDt, String invNetAmt, String invCurrCd, String whldTaxAmt, String invNo, String issDt, String invRjctStsCd, String invStsCd, String ttlLssDivCd, String payDueDt, String rcvDt, String vndrSeq, String invSubSysCd, String invOfcCd, String invRgstNo) {
		this.invTtlAmt = invTtlAmt;
		this.vndrTermNm = vndrTermNm;
		this.invVatAmt = invVatAmt;
		this.costOfcCd = costOfcCd;
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
		this.invCfmDt = invCfmDt;
		this.ppdNo = ppdNo;
		this.invNetAmt = invNetAmt;
		this.invCurrCd = invCurrCd;
		this.whldTaxAmt = whldTaxAmt;
		this.ppayAplyFlg = ppayAplyFlg;
		this.ppdDtrbNo = ppdDtrbNo;
		this.pagerows = pagerows;
		this.invNo = invNo;
		this.issDt = issDt;
		this.invRjctStsCd = invRjctStsCd;
		this.ibflag = ibflag;
		this.invStsCd = invStsCd;
		this.ttlLssDivCd = ttlLssDivCd;
		this.vndrSeq = vndrSeq;
		this.rcvDt = rcvDt;
		this.payDueDt = payDueDt;
		this.ppdGlDt = ppdGlDt;
		this.invSubSysCd = invSubSysCd;
		this.ppdAplyAmt = ppdAplyAmt;
		this.invOfcCd = invOfcCd;
		this.invRgstNo = invRgstNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_ttl_amt", getInvTtlAmt());
		this.hashColumns.put("vndr_term_nm", getVndrTermNm());
		this.hashColumns.put("inv_vat_amt", getInvVatAmt());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("pso_trns_slp_ctnt", getPsoTrnsSlpCtnt());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("ppd_no", getPpdNo());
		this.hashColumns.put("inv_net_amt", getInvNetAmt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("whld_tax_amt", getWhldTaxAmt());
		this.hashColumns.put("ppay_aply_flg", getPpayAplyFlg());
		this.hashColumns.put("ppd_dtrb_no", getPpdDtrbNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("inv_rjct_sts_cd", getInvRjctStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_sts_cd", getInvStsCd());
		this.hashColumns.put("ttl_lss_div_cd", getTtlLssDivCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("pay_due_dt", getPayDueDt());
		this.hashColumns.put("ppd_gl_dt", getPpdGlDt());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("ppd_aply_amt", getPpdAplyAmt());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("inv_rgst_no", getInvRgstNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_ttl_amt", "invTtlAmt");
		this.hashFields.put("vndr_term_nm", "vndrTermNm");
		this.hashFields.put("inv_vat_amt", "invVatAmt");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("pso_trns_slp_ctnt", "psoTrnsSlpCtnt");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("ppd_no", "ppdNo");
		this.hashFields.put("inv_net_amt", "invNetAmt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("whld_tax_amt", "whldTaxAmt");
		this.hashFields.put("ppay_aply_flg", "ppayAplyFlg");
		this.hashFields.put("ppd_dtrb_no", "ppdDtrbNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("inv_rjct_sts_cd", "invRjctStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_sts_cd", "invStsCd");
		this.hashFields.put("ttl_lss_div_cd", "ttlLssDivCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("pay_due_dt", "payDueDt");
		this.hashFields.put("ppd_gl_dt", "ppdGlDt");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("ppd_aply_amt", "ppdAplyAmt");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("inv_rgst_no", "invRgstNo");
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
	 * @return psoTrnsSlpCtnt
	 */
	public String getPsoTrnsSlpCtnt() {
		return this.psoTrnsSlpCtnt;
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
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
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
	 * @return ppayAplyFlg
	 */
	public String getPpayAplyFlg() {
		return this.ppayAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return ppdDtrbNo
	 */
	public String getPpdDtrbNo() {
		return this.ppdDtrbNo;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
	}
	
	/**
	 * Column Info
	 * @return invRjctStsCd
	 */
	public String getInvRjctStsCd() {
		return this.invRjctStsCd;
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
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
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
	 * @return ppdGlDt
	 */
	public String getPpdGlDt() {
		return this.ppdGlDt;
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
	 * @return ppdAplyAmt
	 */
	public String getPpdAplyAmt() {
		return this.ppdAplyAmt;
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
	 * @param invTtlAmt
	 */
	public void setInvTtlAmt(String invTtlAmt) {
		this.invTtlAmt = invTtlAmt;
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
	 * @param psoTrnsSlpCtnt
	 */
	public void setPsoTrnsSlpCtnt(String psoTrnsSlpCtnt) {
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
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
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
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
	 * @param ppayAplyFlg
	 */
	public void setPpayAplyFlg(String ppayAplyFlg) {
		this.ppayAplyFlg = ppayAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param ppdDtrbNo
	 */
	public void setPpdDtrbNo(String ppdDtrbNo) {
		this.ppdDtrbNo = ppdDtrbNo;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
	}
	
	/**
	 * Column Info
	 * @param invRjctStsCd
	 */
	public void setInvRjctStsCd(String invRjctStsCd) {
		this.invRjctStsCd = invRjctStsCd;
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
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
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
	 * @param ppdGlDt
	 */
	public void setPpdGlDt(String ppdGlDt) {
		this.ppdGlDt = ppdGlDt;
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
	 * @param ppdAplyAmt
	 */
	public void setPpdAplyAmt(String ppdAplyAmt) {
		this.ppdAplyAmt = ppdAplyAmt;
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
		setVndrTermNm(JSPUtil.getParameter(request, prefix + "vndr_term_nm", ""));
		setInvVatAmt(JSPUtil.getParameter(request, prefix + "inv_vat_amt", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setPsoTrnsSlpCtnt(JSPUtil.getParameter(request, prefix + "pso_trns_slp_ctnt", ""));
		setInvCfmDt(JSPUtil.getParameter(request, prefix + "inv_cfm_dt", ""));
		setPpdNo(JSPUtil.getParameter(request, prefix + "ppd_no", ""));
		setInvNetAmt(JSPUtil.getParameter(request, prefix + "inv_net_amt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, prefix + "inv_curr_cd", ""));
		setWhldTaxAmt(JSPUtil.getParameter(request, prefix + "whld_tax_amt", ""));
		setPpayAplyFlg(JSPUtil.getParameter(request, prefix + "ppay_aply_flg", ""));
		setPpdDtrbNo(JSPUtil.getParameter(request, prefix + "ppd_dtrb_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
		setInvRjctStsCd(JSPUtil.getParameter(request, prefix + "inv_rjct_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setInvStsCd(JSPUtil.getParameter(request, prefix + "inv_sts_cd", ""));
		setTtlLssDivCd(JSPUtil.getParameter(request, prefix + "ttl_lss_div_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setRcvDt(JSPUtil.getParameter(request, prefix + "rcv_dt", ""));
		setPayDueDt(JSPUtil.getParameter(request, prefix + "pay_due_dt", ""));
		setPpdGlDt(JSPUtil.getParameter(request, prefix + "ppd_gl_dt", ""));
		setInvSubSysCd(JSPUtil.getParameter(request, prefix + "inv_sub_sys_cd", ""));
		setPpdAplyAmt(JSPUtil.getParameter(request, prefix + "ppd_aply_amt", ""));
		setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
		setInvRgstNo(JSPUtil.getParameter(request, prefix + "inv_rgst_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CsrListInputVO[]
	 */
	public CsrListInputVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CsrListInputVO[]
	 */
	public CsrListInputVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CsrListInputVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invTtlAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ttl_amt", length));
			String[] vndrTermNm = (JSPUtil.getParameter(request, prefix	+ "vndr_term_nm", length));
			String[] invVatAmt = (JSPUtil.getParameter(request, prefix	+ "inv_vat_amt", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] psoTrnsSlpCtnt = (JSPUtil.getParameter(request, prefix	+ "pso_trns_slp_ctnt", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] ppdNo = (JSPUtil.getParameter(request, prefix	+ "ppd_no", length));
			String[] invNetAmt = (JSPUtil.getParameter(request, prefix	+ "inv_net_amt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] whldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "whld_tax_amt", length));
			String[] ppayAplyFlg = (JSPUtil.getParameter(request, prefix	+ "ppay_aply_flg", length));
			String[] ppdDtrbNo = (JSPUtil.getParameter(request, prefix	+ "ppd_dtrb_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] invRjctStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_rjct_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] invStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_sts_cd", length));
			String[] ttlLssDivCd = (JSPUtil.getParameter(request, prefix	+ "ttl_lss_div_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] payDueDt = (JSPUtil.getParameter(request, prefix	+ "pay_due_dt", length));
			String[] ppdGlDt = (JSPUtil.getParameter(request, prefix	+ "ppd_gl_dt", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] ppdAplyAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_aply_amt", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] invRgstNo = (JSPUtil.getParameter(request, prefix	+ "inv_rgst_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new CsrListInputVO();
				if (invTtlAmt[i] != null)
					model.setInvTtlAmt(invTtlAmt[i]);
				if (vndrTermNm[i] != null)
					model.setVndrTermNm(vndrTermNm[i]);
				if (invVatAmt[i] != null)
					model.setInvVatAmt(invVatAmt[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (psoTrnsSlpCtnt[i] != null)
					model.setPsoTrnsSlpCtnt(psoTrnsSlpCtnt[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (ppdNo[i] != null)
					model.setPpdNo(ppdNo[i]);
				if (invNetAmt[i] != null)
					model.setInvNetAmt(invNetAmt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (whldTaxAmt[i] != null)
					model.setWhldTaxAmt(whldTaxAmt[i]);
				if (ppayAplyFlg[i] != null)
					model.setPpayAplyFlg(ppayAplyFlg[i]);
				if (ppdDtrbNo[i] != null)
					model.setPpdDtrbNo(ppdDtrbNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (invRjctStsCd[i] != null)
					model.setInvRjctStsCd(invRjctStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invStsCd[i] != null)
					model.setInvStsCd(invStsCd[i]);
				if (ttlLssDivCd[i] != null)
					model.setTtlLssDivCd(ttlLssDivCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (payDueDt[i] != null)
					model.setPayDueDt(payDueDt[i]);
				if (ppdGlDt[i] != null)
					model.setPpdGlDt(ppdGlDt[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (ppdAplyAmt[i] != null)
					model.setPpdAplyAmt(ppdAplyAmt[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (invRgstNo[i] != null)
					model.setInvRgstNo(invRgstNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCsrListInputVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CsrListInputVO[]
	 */
	public CsrListInputVO[] getCsrListInputVOs(){
		CsrListInputVO[] vos = (CsrListInputVO[])models.toArray(new CsrListInputVO[models.size()]);
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
		this.vndrTermNm = this.vndrTermNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVatAmt = this.invVatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoTrnsSlpCtnt = this.psoTrnsSlpCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdNo = this.ppdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNetAmt = this.invNetAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whldTaxAmt = this.whldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppayAplyFlg = this.ppayAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdDtrbNo = this.ppdDtrbNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRjctStsCd = this.invRjctStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStsCd = this.invStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlLssDivCd = this.ttlLssDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDueDt = this.payDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdGlDt = this.ppdGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdAplyAmt = this.ppdAplyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRgstNo = this.invRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
