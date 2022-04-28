/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArTaxMnVO.java
*@FileTitle : InvArTaxMnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.04.27 김세일 
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
 * @author 김세일
 * @since J2EE 1.5
 */

public class InvArTaxMnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArTaxMnVO> models = new ArrayList<InvArTaxMnVO>();
	
	/* Column Info */
	private String custLoclLangNm = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String bankAcctNo = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String taxInvNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String taxInvCxlFlg = null;
	/* Column Info */
	private String taxRgstNo = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Column Info */
	private String issUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String issDt = null;
	/* Column Info */
	private String deptNm = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String prnKnt = null;
	/* Column Info */
	private String bankNm = null;
	/* Column Info */
	private String ttlLoclCurrAmt = null;
	/* Column Info */
	private String actCustCntCd = null;
	/* Column Info */
	private String vvdPrnFlg = null;
	/* Column Info */
	private String loclNmPrnFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invXchRt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String blSrcNo = null;
	/* Column Info */
	private String portPrnFlg = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String sailArrPrnFlg = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String taxInvCxlRmk = null;
	/* Column Info */
	private String coNm = null;
	/* Column Info */
	private String taxInvRmk = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String issCurrCd = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String taxInvCxlDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String bizRgstNo = null;
	/* Column Info */
	private String taxInvSeq = null;
	/* Column Info */
	private String taxInvCxlUsrId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArTaxMnVO() {}

	public InvArTaxMnVO(String ibflag, String pagerows, String taxInvNo, String taxInvSeq, String blSrcNo, String bkgNo, String bkgNoSplit, String arOfcCd, String actCustCntCd, String actCustSeq, String custLoclLangNm, String loclNmPrnFlg, String vslCd, String skdVoyNo, String skdDirCd, String vvdPrnFlg, String sailArrDt, String sailArrPrnFlg, String porCd, String polCd, String podCd, String delCd, String portPrnFlg, String ioBndCd, String bankNm, String bankAcctNo, String deptNm, String coNm, String bizRgstNo, String taxRgstNo, String issCurrCd, String issDt, String issUsrId, String invXchRt, String ttlLoclCurrAmt, String prnKnt, String taxInvRmk, String taxInvCxlFlg, String taxInvCxlDt, String taxInvCxlUsrId, String taxInvCxlRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.custLoclLangNm = custLoclLangNm;
		this.porCd = porCd;
		this.bankAcctNo = bankAcctNo;
		this.vslCd = vslCd;
		this.taxInvNo = taxInvNo;
		this.creDt = creDt;
		this.taxInvCxlFlg = taxInvCxlFlg;
		this.taxRgstNo = taxRgstNo;
		this.sailArrDt = sailArrDt;
		this.issUsrId = issUsrId;
		this.pagerows = pagerows;
		this.issDt = issDt;
		this.deptNm = deptNm;
		this.ibflag = ibflag;
		this.polCd = polCd;
		this.prnKnt = prnKnt;
		this.bankNm = bankNm;
		this.ttlLoclCurrAmt = ttlLoclCurrAmt;
		this.actCustCntCd = actCustCntCd;
		this.vvdPrnFlg = vvdPrnFlg;
		this.loclNmPrnFlg = loclNmPrnFlg;
		this.updUsrId = updUsrId;
		this.invXchRt = invXchRt;
		this.updDt = updDt;
		this.blSrcNo = blSrcNo;
		this.portPrnFlg = portPrnFlg;
		this.bkgNoSplit = bkgNoSplit;
		this.actCustSeq = actCustSeq;
		this.sailArrPrnFlg = sailArrPrnFlg;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.taxInvCxlRmk = taxInvCxlRmk;
		this.coNm = coNm;
		this.taxInvRmk = taxInvRmk;
		this.ioBndCd = ioBndCd;
		this.arOfcCd = arOfcCd;
		this.skdDirCd = skdDirCd;
		this.issCurrCd = issCurrCd;
		this.podCd = podCd;
		this.taxInvCxlDt = taxInvCxlDt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.bizRgstNo = bizRgstNo;
		this.taxInvSeq = taxInvSeq;
		this.taxInvCxlUsrId = taxInvCxlUsrId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cust_locl_lang_nm", getCustLoclLangNm());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("bank_acct_no", getBankAcctNo());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("tax_inv_no", getTaxInvNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tax_inv_cxl_flg", getTaxInvCxlFlg());
		this.hashColumns.put("tax_rgst_no", getTaxRgstNo());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("iss_usr_id", getIssUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("dept_nm", getDeptNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("prn_knt", getPrnKnt());
		this.hashColumns.put("bank_nm", getBankNm());
		this.hashColumns.put("ttl_locl_curr_amt", getTtlLoclCurrAmt());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("vvd_prn_flg", getVvdPrnFlg());
		this.hashColumns.put("locl_nm_prn_flg", getLoclNmPrnFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_xch_rt", getInvXchRt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bl_src_no", getBlSrcNo());
		this.hashColumns.put("port_prn_flg", getPortPrnFlg());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("sail_arr_prn_flg", getSailArrPrnFlg());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("tax_inv_cxl_rmk", getTaxInvCxlRmk());
		this.hashColumns.put("co_nm", getCoNm());
		this.hashColumns.put("tax_inv_rmk", getTaxInvRmk());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("iss_curr_cd", getIssCurrCd());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("tax_inv_cxl_dt", getTaxInvCxlDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("biz_rgst_no", getBizRgstNo());
		this.hashColumns.put("tax_inv_seq", getTaxInvSeq());
		this.hashColumns.put("tax_inv_cxl_usr_id", getTaxInvCxlUsrId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cust_locl_lang_nm", "custLoclLangNm");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("bank_acct_no", "bankAcctNo");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("tax_inv_no", "taxInvNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tax_inv_cxl_flg", "taxInvCxlFlg");
		this.hashFields.put("tax_rgst_no", "taxRgstNo");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("iss_usr_id", "issUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("dept_nm", "deptNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("prn_knt", "prnKnt");
		this.hashFields.put("bank_nm", "bankNm");
		this.hashFields.put("ttl_locl_curr_amt", "ttlLoclCurrAmt");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("vvd_prn_flg", "vvdPrnFlg");
		this.hashFields.put("locl_nm_prn_flg", "loclNmPrnFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_xch_rt", "invXchRt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bl_src_no", "blSrcNo");
		this.hashFields.put("port_prn_flg", "portPrnFlg");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("sail_arr_prn_flg", "sailArrPrnFlg");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("tax_inv_cxl_rmk", "taxInvCxlRmk");
		this.hashFields.put("co_nm", "coNm");
		this.hashFields.put("tax_inv_rmk", "taxInvRmk");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("iss_curr_cd", "issCurrCd");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("tax_inv_cxl_dt", "taxInvCxlDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("biz_rgst_no", "bizRgstNo");
		this.hashFields.put("tax_inv_seq", "taxInvSeq");
		this.hashFields.put("tax_inv_cxl_usr_id", "taxInvCxlUsrId");
		return this.hashFields;
	}
	
	public String getCustLoclLangNm() {
		return this.custLoclLangNm;
	}
	public String getPorCd() {
		return this.porCd;
	}
	public String getBankAcctNo() {
		return this.bankAcctNo;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getTaxInvNo() {
		return this.taxInvNo;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getTaxInvCxlFlg() {
		return this.taxInvCxlFlg;
	}
	public String getTaxRgstNo() {
		return this.taxRgstNo;
	}
	public String getSailArrDt() {
		return this.sailArrDt;
	}
	public String getIssUsrId() {
		return this.issUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getDeptNm() {
		return this.deptNm;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getPrnKnt() {
		return this.prnKnt;
	}
	public String getBankNm() {
		return this.bankNm;
	}
	public String getTtlLoclCurrAmt() {
		return this.ttlLoclCurrAmt;
	}
	public String getActCustCntCd() {
		return this.actCustCntCd;
	}
	public String getVvdPrnFlg() {
		return this.vvdPrnFlg;
	}
	public String getLoclNmPrnFlg() {
		return this.loclNmPrnFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getInvXchRt() {
		return this.invXchRt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getBlSrcNo() {
		return this.blSrcNo;
	}
	public String getPortPrnFlg() {
		return this.portPrnFlg;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getActCustSeq() {
		return this.actCustSeq;
	}
	public String getSailArrPrnFlg() {
		return this.sailArrPrnFlg;
	}
	public String getDelCd() {
		return this.delCd;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getTaxInvCxlRmk() {
		return this.taxInvCxlRmk;
	}
	public String getCoNm() {
		return this.coNm;
	}
	public String getTaxInvRmk() {
		return this.taxInvRmk;
	}
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getIssCurrCd() {
		return this.issCurrCd;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getTaxInvCxlDt() {
		return this.taxInvCxlDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getBizRgstNo() {
		return this.bizRgstNo;
	}
	public String getTaxInvSeq() {
		return this.taxInvSeq;
	}
	public String getTaxInvCxlUsrId() {
		return this.taxInvCxlUsrId;
	}

	public void setCustLoclLangNm(String custLoclLangNm) {
		this.custLoclLangNm = custLoclLangNm;
		//this.custLoclLangNm=true;
	}
	public void setPorCd(String porCd) {
		this.porCd = porCd;
		//this.porCd=true;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
		//this.bankAcctNo=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setTaxInvNo(String taxInvNo) {
		this.taxInvNo = taxInvNo;
		//this.taxInvNo=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setTaxInvCxlFlg(String taxInvCxlFlg) {
		this.taxInvCxlFlg = taxInvCxlFlg;
		//this.taxInvCxlFlg=true;
	}
	public void setTaxRgstNo(String taxRgstNo) {
		this.taxRgstNo = taxRgstNo;
		//this.taxRgstNo=true;
	}
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
		//this.sailArrDt=true;
	}
	public void setIssUsrId(String issUsrId) {
		this.issUsrId = issUsrId;
		//this.issUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
		//this.deptNm=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setPrnKnt(String prnKnt) {
		this.prnKnt = prnKnt;
		//this.prnKnt=true;
	}
	public void setBankNm(String bankNm) {
		this.bankNm = bankNm;
		//this.bankNm=true;
	}
	public void setTtlLoclCurrAmt(String ttlLoclCurrAmt) {
		this.ttlLoclCurrAmt = ttlLoclCurrAmt;
		//this.ttlLoclCurrAmt=true;
	}
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
		//this.actCustCntCd=true;
	}
	public void setVvdPrnFlg(String vvdPrnFlg) {
		this.vvdPrnFlg = vvdPrnFlg;
		//this.vvdPrnFlg=true;
	}
	public void setLoclNmPrnFlg(String loclNmPrnFlg) {
		this.loclNmPrnFlg = loclNmPrnFlg;
		//this.loclNmPrnFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setInvXchRt(String invXchRt) {
		this.invXchRt = invXchRt;
		//this.invXchRt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setBlSrcNo(String blSrcNo) {
		this.blSrcNo = blSrcNo;
		//this.blSrcNo=true;
	}
	public void setPortPrnFlg(String portPrnFlg) {
		this.portPrnFlg = portPrnFlg;
		//this.portPrnFlg=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
		//this.actCustSeq=true;
	}
	public void setSailArrPrnFlg(String sailArrPrnFlg) {
		this.sailArrPrnFlg = sailArrPrnFlg;
		//this.sailArrPrnFlg=true;
	}
	public void setDelCd(String delCd) {
		this.delCd = delCd;
		//this.delCd=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setTaxInvCxlRmk(String taxInvCxlRmk) {
		this.taxInvCxlRmk = taxInvCxlRmk;
		//this.taxInvCxlRmk=true;
	}
	public void setCoNm(String coNm) {
		this.coNm = coNm;
		//this.coNm=true;
	}
	public void setTaxInvRmk(String taxInvRmk) {
		this.taxInvRmk = taxInvRmk;
		//this.taxInvRmk=true;
	}
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
		//this.ioBndCd=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setIssCurrCd(String issCurrCd) {
		this.issCurrCd = issCurrCd;
		//this.issCurrCd=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setTaxInvCxlDt(String taxInvCxlDt) {
		this.taxInvCxlDt = taxInvCxlDt;
		//this.taxInvCxlDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setBizRgstNo(String bizRgstNo) {
		this.bizRgstNo = bizRgstNo;
		//this.bizRgstNo=true;
	}
	public void setTaxInvSeq(String taxInvSeq) {
		this.taxInvSeq = taxInvSeq;
		//this.taxInvSeq=true;
	}
	public void setTaxInvCxlUsrId(String taxInvCxlUsrId) {
		this.taxInvCxlUsrId = taxInvCxlUsrId;
		//this.taxInvCxlUsrId=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCustLoclLangNm(JSPUtil.getParameter(request, "cust_locl_lang_nm", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setBankAcctNo(JSPUtil.getParameter(request, "bank_acct_no", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setTaxInvNo(JSPUtil.getParameter(request, "tax_inv_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTaxInvCxlFlg(JSPUtil.getParameter(request, "tax_inv_cxl_flg", ""));
		setTaxRgstNo(JSPUtil.getParameter(request, "tax_rgst_no", ""));
		setSailArrDt(JSPUtil.getParameter(request, "sail_arr_dt", ""));
		setIssUsrId(JSPUtil.getParameter(request, "iss_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setDeptNm(JSPUtil.getParameter(request, "dept_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setPrnKnt(JSPUtil.getParameter(request, "prn_knt", ""));
		setBankNm(JSPUtil.getParameter(request, "bank_nm", ""));
		setTtlLoclCurrAmt(JSPUtil.getParameter(request, "ttl_locl_curr_amt", ""));
		setActCustCntCd(JSPUtil.getParameter(request, "act_cust_cnt_cd", ""));
		setVvdPrnFlg(JSPUtil.getParameter(request, "vvd_prn_flg", ""));
		setLoclNmPrnFlg(JSPUtil.getParameter(request, "locl_nm_prn_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvXchRt(JSPUtil.getParameter(request, "inv_xch_rt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBlSrcNo(JSPUtil.getParameter(request, "bl_src_no", ""));
		setPortPrnFlg(JSPUtil.getParameter(request, "port_prn_flg", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setActCustSeq(JSPUtil.getParameter(request, "act_cust_seq", ""));
		setSailArrPrnFlg(JSPUtil.getParameter(request, "sail_arr_prn_flg", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setTaxInvCxlRmk(JSPUtil.getParameter(request, "tax_inv_cxl_rmk", ""));
		setCoNm(JSPUtil.getParameter(request, "co_nm", ""));
		setTaxInvRmk(JSPUtil.getParameter(request, "tax_inv_rmk", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setIssCurrCd(JSPUtil.getParameter(request, "iss_curr_cd", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setTaxInvCxlDt(JSPUtil.getParameter(request, "tax_inv_cxl_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setBizRgstNo(JSPUtil.getParameter(request, "biz_rgst_no", ""));
		setTaxInvSeq(JSPUtil.getParameter(request, "tax_inv_seq", ""));
		setTaxInvCxlUsrId(JSPUtil.getParameter(request, "tax_inv_cxl_usr_id", ""));
	}

	public InvArTaxMnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArTaxMnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArTaxMnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] custLoclLangNm = (JSPUtil.getParameter(request, prefix	+ "cust_locl_lang_nm".trim(), length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd".trim(), length));
			String[] bankAcctNo = (JSPUtil.getParameter(request, prefix	+ "bank_acct_no".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] taxInvNo = (JSPUtil.getParameter(request, prefix	+ "tax_inv_no".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] taxInvCxlFlg = (JSPUtil.getParameter(request, prefix	+ "tax_inv_cxl_flg".trim(), length));
			String[] taxRgstNo = (JSPUtil.getParameter(request, prefix	+ "tax_rgst_no".trim(), length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt".trim(), length));
			String[] issUsrId = (JSPUtil.getParameter(request, prefix	+ "iss_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] deptNm = (JSPUtil.getParameter(request, prefix	+ "dept_nm".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] prnKnt = (JSPUtil.getParameter(request, prefix	+ "prn_knt".trim(), length));
			String[] bankNm = (JSPUtil.getParameter(request, prefix	+ "bank_nm".trim(), length));
			String[] ttlLoclCurrAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_locl_curr_amt".trim(), length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd".trim(), length));
			String[] vvdPrnFlg = (JSPUtil.getParameter(request, prefix	+ "vvd_prn_flg".trim(), length));
			String[] loclNmPrnFlg = (JSPUtil.getParameter(request, prefix	+ "locl_nm_prn_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] invXchRt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] blSrcNo = (JSPUtil.getParameter(request, prefix	+ "bl_src_no".trim(), length));
			String[] portPrnFlg = (JSPUtil.getParameter(request, prefix	+ "port_prn_flg".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq".trim(), length));
			String[] sailArrPrnFlg = (JSPUtil.getParameter(request, prefix	+ "sail_arr_prn_flg".trim(), length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] taxInvCxlRmk = (JSPUtil.getParameter(request, prefix	+ "tax_inv_cxl_rmk".trim(), length));
			String[] coNm = (JSPUtil.getParameter(request, prefix	+ "co_nm".trim(), length));
			String[] taxInvRmk = (JSPUtil.getParameter(request, prefix	+ "tax_inv_rmk".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] issCurrCd = (JSPUtil.getParameter(request, prefix	+ "iss_curr_cd".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] taxInvCxlDt = (JSPUtil.getParameter(request, prefix	+ "tax_inv_cxl_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] bizRgstNo = (JSPUtil.getParameter(request, prefix	+ "biz_rgst_no".trim(), length));
			String[] taxInvSeq = (JSPUtil.getParameter(request, prefix	+ "tax_inv_seq".trim(), length));
			String[] taxInvCxlUsrId = (JSPUtil.getParameter(request, prefix	+ "tax_inv_cxl_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArTaxMnVO();
				if (custLoclLangNm[i] != null)
					model.setCustLoclLangNm(custLoclLangNm[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (bankAcctNo[i] != null)
					model.setBankAcctNo(bankAcctNo[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (taxInvNo[i] != null)
					model.setTaxInvNo(taxInvNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (taxInvCxlFlg[i] != null)
					model.setTaxInvCxlFlg(taxInvCxlFlg[i]);
				if (taxRgstNo[i] != null)
					model.setTaxRgstNo(taxRgstNo[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (issUsrId[i] != null)
					model.setIssUsrId(issUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (deptNm[i] != null)
					model.setDeptNm(deptNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (prnKnt[i] != null)
					model.setPrnKnt(prnKnt[i]);
				if (bankNm[i] != null)
					model.setBankNm(bankNm[i]);
				if (ttlLoclCurrAmt[i] != null)
					model.setTtlLoclCurrAmt(ttlLoclCurrAmt[i]);
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (vvdPrnFlg[i] != null)
					model.setVvdPrnFlg(vvdPrnFlg[i]);
				if (loclNmPrnFlg[i] != null)
					model.setLoclNmPrnFlg(loclNmPrnFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invXchRt[i] != null)
					model.setInvXchRt(invXchRt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (blSrcNo[i] != null)
					model.setBlSrcNo(blSrcNo[i]);
				if (portPrnFlg[i] != null)
					model.setPortPrnFlg(portPrnFlg[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (sailArrPrnFlg[i] != null)
					model.setSailArrPrnFlg(sailArrPrnFlg[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (taxInvCxlRmk[i] != null)
					model.setTaxInvCxlRmk(taxInvCxlRmk[i]);
				if (coNm[i] != null)
					model.setCoNm(coNm[i]);
				if (taxInvRmk[i] != null)
					model.setTaxInvRmk(taxInvRmk[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (issCurrCd[i] != null)
					model.setIssCurrCd(issCurrCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (taxInvCxlDt[i] != null)
					model.setTaxInvCxlDt(taxInvCxlDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (bizRgstNo[i] != null)
					model.setBizRgstNo(bizRgstNo[i]);
				if (taxInvSeq[i] != null)
					model.setTaxInvSeq(taxInvSeq[i]);
				if (taxInvCxlUsrId[i] != null)
					model.setTaxInvCxlUsrId(taxInvCxlUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArTaxMnVOs();
	}

	public InvArTaxMnVO[] getInvArTaxMnVOs(){
		InvArTaxMnVO[] vos = (InvArTaxMnVO[])models.toArray(new InvArTaxMnVO[models.size()]);
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
		this.custLoclLangNm = this.custLoclLangNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankAcctNo = this.bankAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvNo = this.taxInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvCxlFlg = this.taxInvCxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxRgstNo = this.taxRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issUsrId = this.issUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deptNm = this.deptNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnKnt = this.prnKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankNm = this.bankNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlLoclCurrAmt = this.ttlLoclCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdPrnFlg = this.vvdPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclNmPrnFlg = this.loclNmPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRt = this.invXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blSrcNo = this.blSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portPrnFlg = this.portPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrPrnFlg = this.sailArrPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvCxlRmk = this.taxInvCxlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coNm = this.coNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvRmk = this.taxInvRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issCurrCd = this.issCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvCxlDt = this.taxInvCxlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizRgstNo = this.bizRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvSeq = this.taxInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvCxlUsrId = this.taxInvCxlUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
