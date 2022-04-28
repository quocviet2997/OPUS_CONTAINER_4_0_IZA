/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : JooTaxVO.java
*@FileTitle : JooTaxVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.13
*@LastModifier : 박희동
*@LastVersion : 1.0
* 2010.05.13 박희동 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 박희동
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooTaxVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooTaxVO> models = new ArrayList<JooTaxVO>();
	
	/* Column Info */
	private String taxVatTpCd = null;
	/* Column Info */
	private String slpFuncCd = null;
	/* Column Info */
	private String splAddr = null;
	/* Column Info */
	private String bzctNm = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String bztpNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String splAmt = null;
	/* Column Info */
	private String ttlAmt = null;
	/* Column Info */
	private String taxDivCd = null;
	/* Column Info */
	private String blnkKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String issDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String taxAmt = null;
	/* Column Info */
	private String taxSerNo = null;
	/* Column Info */
	private String taxInvYrmon = null;
	/* Column Info */
	private String slpTpCd = null;
	/* Column Info */
	private String splRgstNo = null;
	/* Column Info */
	private String taxNaidFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String docEvidTpCd = null;
	/* Column Info */
	private String taxPlCd = null;
	/* Column Info */
	private String taxNslFlg = null;
	/* Column Info */
	private String coNm = null;
	/* Column Info */
	private String faFlg = null;
	/* Column Info */
	private String slpIssDt = null;
	/* Column Info */
	private String slpOfcCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String joXchRt = null;
	/* Column Info */
	private String ownrNm = null;
	/* Column Info */
	private String slpSerNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooTaxVO() {}

	public JooTaxVO(String ibflag, String pagerows, String taxInvYrmon, String ofcCd, String taxSerNo, String taxVatTpCd, String taxDivCd, String taxPlCd, String joXchRt, String splAmt, String taxAmt, String ttlAmt, String currCd, String vndrSeq, String splRgstNo, String ownrNm, String coNm, String splAddr, String bzctNm, String bztpNm, String blnkKnt, String faFlg, String taxNaidFlg, String taxNslFlg, String issDt, String slpTpCd, String slpFuncCd, String slpOfcCd, String slpIssDt, String slpSerNo, String creDt, String creUsrId, String updDt, String updUsrId, String docEvidTpCd) {
		this.taxVatTpCd = taxVatTpCd;
		this.slpFuncCd = slpFuncCd;
		this.splAddr = splAddr;
		this.bzctNm = bzctNm;
		this.currCd = currCd;
		this.bztpNm = bztpNm;
		this.creDt = creDt;
		this.splAmt = splAmt;
		this.ttlAmt = ttlAmt;
		this.taxDivCd = taxDivCd;
		this.blnkKnt = blnkKnt;
		this.pagerows = pagerows;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.taxAmt = taxAmt;
		this.taxSerNo = taxSerNo;
		this.taxInvYrmon = taxInvYrmon;
		this.slpTpCd = slpTpCd;
		this.splRgstNo = splRgstNo;
		this.taxNaidFlg = taxNaidFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.docEvidTpCd = docEvidTpCd;
		this.taxPlCd = taxPlCd;
		this.taxNslFlg = taxNslFlg;
		this.coNm = coNm;
		this.faFlg = faFlg;
		this.slpIssDt = slpIssDt;
		this.slpOfcCd = slpOfcCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.vndrSeq = vndrSeq;
		this.joXchRt = joXchRt;
		this.ownrNm = ownrNm;
		this.slpSerNo = slpSerNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("tax_vat_tp_cd", getTaxVatTpCd());
		this.hashColumns.put("slp_func_cd", getSlpFuncCd());
		this.hashColumns.put("spl_addr", getSplAddr());
		this.hashColumns.put("bzct_nm", getBzctNm());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("bztp_nm", getBztpNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("spl_amt", getSplAmt());
		this.hashColumns.put("ttl_amt", getTtlAmt());
		this.hashColumns.put("tax_div_cd", getTaxDivCd());
		this.hashColumns.put("blnk_knt", getBlnkKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tax_amt", getTaxAmt());
		this.hashColumns.put("tax_ser_no", getTaxSerNo());
		this.hashColumns.put("tax_inv_yrmon", getTaxInvYrmon());
		this.hashColumns.put("slp_tp_cd", getSlpTpCd());
		this.hashColumns.put("spl_rgst_no", getSplRgstNo());
		this.hashColumns.put("tax_naid_flg", getTaxNaidFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("doc_evid_tp_cd", getDocEvidTpCd());
		this.hashColumns.put("tax_pl_cd", getTaxPlCd());
		this.hashColumns.put("tax_nsl_flg", getTaxNslFlg());
		this.hashColumns.put("co_nm", getCoNm());
		this.hashColumns.put("fa_flg", getFaFlg());
		this.hashColumns.put("slp_iss_dt", getSlpIssDt());
		this.hashColumns.put("slp_ofc_cd", getSlpOfcCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("jo_xch_rt", getJoXchRt());
		this.hashColumns.put("ownr_nm", getOwnrNm());
		this.hashColumns.put("slp_ser_no", getSlpSerNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("tax_vat_tp_cd", "taxVatTpCd");
		this.hashFields.put("slp_func_cd", "slpFuncCd");
		this.hashFields.put("spl_addr", "splAddr");
		this.hashFields.put("bzct_nm", "bzctNm");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("bztp_nm", "bztpNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("spl_amt", "splAmt");
		this.hashFields.put("ttl_amt", "ttlAmt");
		this.hashFields.put("tax_div_cd", "taxDivCd");
		this.hashFields.put("blnk_knt", "blnkKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tax_amt", "taxAmt");
		this.hashFields.put("tax_ser_no", "taxSerNo");
		this.hashFields.put("tax_inv_yrmon", "taxInvYrmon");
		this.hashFields.put("slp_tp_cd", "slpTpCd");
		this.hashFields.put("spl_rgst_no", "splRgstNo");
		this.hashFields.put("tax_naid_flg", "taxNaidFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("doc_evid_tp_cd", "docEvidTpCd");
		this.hashFields.put("tax_pl_cd", "taxPlCd");
		this.hashFields.put("tax_nsl_flg", "taxNslFlg");
		this.hashFields.put("co_nm", "coNm");
		this.hashFields.put("fa_flg", "faFlg");
		this.hashFields.put("slp_iss_dt", "slpIssDt");
		this.hashFields.put("slp_ofc_cd", "slpOfcCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("jo_xch_rt", "joXchRt");
		this.hashFields.put("ownr_nm", "ownrNm");
		this.hashFields.put("slp_ser_no", "slpSerNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return taxVatTpCd
	 */
	public String getTaxVatTpCd() {
		return this.taxVatTpCd;
	}
	
	/**
	 * Column Info
	 * @return slpFuncCd
	 */
	public String getSlpFuncCd() {
		return this.slpFuncCd;
	}
	
	/**
	 * Column Info
	 * @return splAddr
	 */
	public String getSplAddr() {
		return this.splAddr;
	}
	
	/**
	 * Column Info
	 * @return bzctNm
	 */
	public String getBzctNm() {
		return this.bzctNm;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return bztpNm
	 */
	public String getBztpNm() {
		return this.bztpNm;
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
	 * @return splAmt
	 */
	public String getSplAmt() {
		return this.splAmt;
	}
	
	/**
	 * Column Info
	 * @return ttlAmt
	 */
	public String getTtlAmt() {
		return this.ttlAmt;
	}
	
	/**
	 * Column Info
	 * @return taxDivCd
	 */
	public String getTaxDivCd() {
		return this.taxDivCd;
	}
	
	/**
	 * Column Info
	 * @return blnkKnt
	 */
	public String getBlnkKnt() {
		return this.blnkKnt;
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
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
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
	 * @return taxAmt
	 */
	public String getTaxAmt() {
		return this.taxAmt;
	}
	
	/**
	 * Column Info
	 * @return taxSerNo
	 */
	public String getTaxSerNo() {
		return this.taxSerNo;
	}
	
	/**
	 * Column Info
	 * @return taxInvYrmon
	 */
	public String getTaxInvYrmon() {
		return this.taxInvYrmon;
	}
	
	/**
	 * Column Info
	 * @return slpTpCd
	 */
	public String getSlpTpCd() {
		return this.slpTpCd;
	}
	
	/**
	 * Column Info
	 * @return splRgstNo
	 */
	public String getSplRgstNo() {
		return this.splRgstNo;
	}
	
	/**
	 * Column Info
	 * @return taxNaidFlg
	 */
	public String getTaxNaidFlg() {
		return this.taxNaidFlg;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return docEvidTpCd
	 */
	public String getDocEvidTpCd() {
		return this.docEvidTpCd;
	}
	
	/**
	 * Column Info
	 * @return taxPlCd
	 */
	public String getTaxPlCd() {
		return this.taxPlCd;
	}
	
	/**
	 * Column Info
	 * @return taxNslFlg
	 */
	public String getTaxNslFlg() {
		return this.taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @return coNm
	 */
	public String getCoNm() {
		return this.coNm;
	}
	
	/**
	 * Column Info
	 * @return faFlg
	 */
	public String getFaFlg() {
		return this.faFlg;
	}
	
	/**
	 * Column Info
	 * @return slpIssDt
	 */
	public String getSlpIssDt() {
		return this.slpIssDt;
	}
	
	/**
	 * Column Info
	 * @return slpOfcCd
	 */
	public String getSlpOfcCd() {
		return this.slpOfcCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return joXchRt
	 */
	public String getJoXchRt() {
		return this.joXchRt;
	}
	
	/**
	 * Column Info
	 * @return ownrNm
	 */
	public String getOwnrNm() {
		return this.ownrNm;
	}
	
	/**
	 * Column Info
	 * @return slpSerNo
	 */
	public String getSlpSerNo() {
		return this.slpSerNo;
	}
	

	/**
	 * Column Info
	 * @param taxVatTpCd
	 */
	public void setTaxVatTpCd(String taxVatTpCd) {
		this.taxVatTpCd = taxVatTpCd;
	}
	
	/**
	 * Column Info
	 * @param slpFuncCd
	 */
	public void setSlpFuncCd(String slpFuncCd) {
		this.slpFuncCd = slpFuncCd;
	}
	
	/**
	 * Column Info
	 * @param splAddr
	 */
	public void setSplAddr(String splAddr) {
		this.splAddr = splAddr;
	}
	
	/**
	 * Column Info
	 * @param bzctNm
	 */
	public void setBzctNm(String bzctNm) {
		this.bzctNm = bzctNm;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param bztpNm
	 */
	public void setBztpNm(String bztpNm) {
		this.bztpNm = bztpNm;
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
	 * @param splAmt
	 */
	public void setSplAmt(String splAmt) {
		this.splAmt = splAmt;
	}
	
	/**
	 * Column Info
	 * @param ttlAmt
	 */
	public void setTtlAmt(String ttlAmt) {
		this.ttlAmt = ttlAmt;
	}
	
	/**
	 * Column Info
	 * @param taxDivCd
	 */
	public void setTaxDivCd(String taxDivCd) {
		this.taxDivCd = taxDivCd;
	}
	
	/**
	 * Column Info
	 * @param blnkKnt
	 */
	public void setBlnkKnt(String blnkKnt) {
		this.blnkKnt = blnkKnt;
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
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
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
	 * @param taxAmt
	 */
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}
	
	/**
	 * Column Info
	 * @param taxSerNo
	 */
	public void setTaxSerNo(String taxSerNo) {
		this.taxSerNo = taxSerNo;
	}
	
	/**
	 * Column Info
	 * @param taxInvYrmon
	 */
	public void setTaxInvYrmon(String taxInvYrmon) {
		this.taxInvYrmon = taxInvYrmon;
	}
	
	/**
	 * Column Info
	 * @param slpTpCd
	 */
	public void setSlpTpCd(String slpTpCd) {
		this.slpTpCd = slpTpCd;
	}
	
	/**
	 * Column Info
	 * @param splRgstNo
	 */
	public void setSplRgstNo(String splRgstNo) {
		this.splRgstNo = splRgstNo;
	}
	
	/**
	 * Column Info
	 * @param taxNaidFlg
	 */
	public void setTaxNaidFlg(String taxNaidFlg) {
		this.taxNaidFlg = taxNaidFlg;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param docEvidTpCd
	 */
	public void setDocEvidTpCd(String docEvidTpCd) {
		this.docEvidTpCd = docEvidTpCd;
	}
	
	/**
	 * Column Info
	 * @param taxPlCd
	 */
	public void setTaxPlCd(String taxPlCd) {
		this.taxPlCd = taxPlCd;
	}
	
	/**
	 * Column Info
	 * @param taxNslFlg
	 */
	public void setTaxNslFlg(String taxNslFlg) {
		this.taxNslFlg = taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @param coNm
	 */
	public void setCoNm(String coNm) {
		this.coNm = coNm;
	}
	
	/**
	 * Column Info
	 * @param faFlg
	 */
	public void setFaFlg(String faFlg) {
		this.faFlg = faFlg;
	}
	
	/**
	 * Column Info
	 * @param slpIssDt
	 */
	public void setSlpIssDt(String slpIssDt) {
		this.slpIssDt = slpIssDt;
	}
	
	/**
	 * Column Info
	 * @param slpOfcCd
	 */
	public void setSlpOfcCd(String slpOfcCd) {
		this.slpOfcCd = slpOfcCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param joXchRt
	 */
	public void setJoXchRt(String joXchRt) {
		this.joXchRt = joXchRt;
	}
	
	/**
	 * Column Info
	 * @param ownrNm
	 */
	public void setOwnrNm(String ownrNm) {
		this.ownrNm = ownrNm;
	}
	
	/**
	 * Column Info
	 * @param slpSerNo
	 */
	public void setSlpSerNo(String slpSerNo) {
		this.slpSerNo = slpSerNo;
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
		setTaxVatTpCd(JSPUtil.getParameter(request, prefix + "tax_vat_tp_cd", ""));
		setSlpFuncCd(JSPUtil.getParameter(request, prefix + "slp_func_cd", ""));
		setSplAddr(JSPUtil.getParameter(request, prefix + "spl_addr", ""));
		setBzctNm(JSPUtil.getParameter(request, prefix + "bzct_nm", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setBztpNm(JSPUtil.getParameter(request, prefix + "bztp_nm", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSplAmt(JSPUtil.getParameter(request, prefix + "spl_amt", ""));
		setTtlAmt(JSPUtil.getParameter(request, prefix + "ttl_amt", ""));
		setTaxDivCd(JSPUtil.getParameter(request, prefix + "tax_div_cd", ""));
		setBlnkKnt(JSPUtil.getParameter(request, prefix + "blnk_knt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setTaxAmt(JSPUtil.getParameter(request, prefix + "tax_amt", ""));
		setTaxSerNo(JSPUtil.getParameter(request, prefix + "tax_ser_no", ""));
		setTaxInvYrmon(JSPUtil.getParameter(request, prefix + "tax_inv_yrmon", ""));
		setSlpTpCd(JSPUtil.getParameter(request, prefix + "slp_tp_cd", ""));
		setSplRgstNo(JSPUtil.getParameter(request, prefix + "spl_rgst_no", ""));
		setTaxNaidFlg(JSPUtil.getParameter(request, prefix + "tax_naid_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDocEvidTpCd(JSPUtil.getParameter(request, prefix + "doc_evid_tp_cd", ""));
		setTaxPlCd(JSPUtil.getParameter(request, prefix + "tax_pl_cd", ""));
		setTaxNslFlg(JSPUtil.getParameter(request, prefix + "tax_nsl_flg", ""));
		setCoNm(JSPUtil.getParameter(request, prefix + "co_nm", ""));
		setFaFlg(JSPUtil.getParameter(request, prefix + "fa_flg", ""));
		setSlpIssDt(JSPUtil.getParameter(request, prefix + "slp_iss_dt", ""));
		setSlpOfcCd(JSPUtil.getParameter(request, prefix + "slp_ofc_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setJoXchRt(JSPUtil.getParameter(request, prefix + "jo_xch_rt", ""));
		setOwnrNm(JSPUtil.getParameter(request, prefix + "ownr_nm", ""));
		setSlpSerNo(JSPUtil.getParameter(request, prefix + "slp_ser_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooTaxVO[]
	 */
	public JooTaxVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooTaxVO[]
	 */
	public JooTaxVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooTaxVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] taxVatTpCd = (JSPUtil.getParameter(request, prefix	+ "tax_vat_tp_cd", length));
			String[] slpFuncCd = (JSPUtil.getParameter(request, prefix	+ "slp_func_cd", length));
			String[] splAddr = (JSPUtil.getParameter(request, prefix	+ "spl_addr", length));
			String[] bzctNm = (JSPUtil.getParameter(request, prefix	+ "bzct_nm", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] bztpNm = (JSPUtil.getParameter(request, prefix	+ "bztp_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] splAmt = (JSPUtil.getParameter(request, prefix	+ "spl_amt", length));
			String[] ttlAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_amt", length));
			String[] taxDivCd = (JSPUtil.getParameter(request, prefix	+ "tax_div_cd", length));
			String[] blnkKnt = (JSPUtil.getParameter(request, prefix	+ "blnk_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] taxAmt = (JSPUtil.getParameter(request, prefix	+ "tax_amt", length));
			String[] taxSerNo = (JSPUtil.getParameter(request, prefix	+ "tax_ser_no", length));
			String[] taxInvYrmon = (JSPUtil.getParameter(request, prefix	+ "tax_inv_yrmon", length));
			String[] slpTpCd = (JSPUtil.getParameter(request, prefix	+ "slp_tp_cd", length));
			String[] splRgstNo = (JSPUtil.getParameter(request, prefix	+ "spl_rgst_no", length));
			String[] taxNaidFlg = (JSPUtil.getParameter(request, prefix	+ "tax_naid_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] docEvidTpCd = (JSPUtil.getParameter(request, prefix	+ "doc_evid_tp_cd", length));
			String[] taxPlCd = (JSPUtil.getParameter(request, prefix	+ "tax_pl_cd", length));
			String[] taxNslFlg = (JSPUtil.getParameter(request, prefix	+ "tax_nsl_flg", length));
			String[] coNm = (JSPUtil.getParameter(request, prefix	+ "co_nm", length));
			String[] faFlg = (JSPUtil.getParameter(request, prefix	+ "fa_flg", length));
			String[] slpIssDt = (JSPUtil.getParameter(request, prefix	+ "slp_iss_dt", length));
			String[] slpOfcCd = (JSPUtil.getParameter(request, prefix	+ "slp_ofc_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] joXchRt = (JSPUtil.getParameter(request, prefix	+ "jo_xch_rt", length));
			String[] ownrNm = (JSPUtil.getParameter(request, prefix	+ "ownr_nm", length));
			String[] slpSerNo = (JSPUtil.getParameter(request, prefix	+ "slp_ser_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooTaxVO();
				if (taxVatTpCd[i] != null)
					model.setTaxVatTpCd(taxVatTpCd[i]);
				if (slpFuncCd[i] != null)
					model.setSlpFuncCd(slpFuncCd[i]);
				if (splAddr[i] != null)
					model.setSplAddr(splAddr[i]);
				if (bzctNm[i] != null)
					model.setBzctNm(bzctNm[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (bztpNm[i] != null)
					model.setBztpNm(bztpNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (splAmt[i] != null)
					model.setSplAmt(splAmt[i]);
				if (ttlAmt[i] != null)
					model.setTtlAmt(ttlAmt[i]);
				if (taxDivCd[i] != null)
					model.setTaxDivCd(taxDivCd[i]);
				if (blnkKnt[i] != null)
					model.setBlnkKnt(blnkKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (taxAmt[i] != null)
					model.setTaxAmt(taxAmt[i]);
				if (taxSerNo[i] != null)
					model.setTaxSerNo(taxSerNo[i]);
				if (taxInvYrmon[i] != null)
					model.setTaxInvYrmon(taxInvYrmon[i]);
				if (slpTpCd[i] != null)
					model.setSlpTpCd(slpTpCd[i]);
				if (splRgstNo[i] != null)
					model.setSplRgstNo(splRgstNo[i]);
				if (taxNaidFlg[i] != null)
					model.setTaxNaidFlg(taxNaidFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (docEvidTpCd[i] != null)
					model.setDocEvidTpCd(docEvidTpCd[i]);
				if (taxPlCd[i] != null)
					model.setTaxPlCd(taxPlCd[i]);
				if (taxNslFlg[i] != null)
					model.setTaxNslFlg(taxNslFlg[i]);
				if (coNm[i] != null)
					model.setCoNm(coNm[i]);
				if (faFlg[i] != null)
					model.setFaFlg(faFlg[i]);
				if (slpIssDt[i] != null)
					model.setSlpIssDt(slpIssDt[i]);
				if (slpOfcCd[i] != null)
					model.setSlpOfcCd(slpOfcCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (joXchRt[i] != null)
					model.setJoXchRt(joXchRt[i]);
				if (ownrNm[i] != null)
					model.setOwnrNm(ownrNm[i]);
				if (slpSerNo[i] != null)
					model.setSlpSerNo(slpSerNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooTaxVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooTaxVO[]
	 */
	public JooTaxVO[] getJooTaxVOs(){
		JooTaxVO[] vos = (JooTaxVO[])models.toArray(new JooTaxVO[models.size()]);
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
		this.taxVatTpCd = this.taxVatTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpFuncCd = this.slpFuncCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splAddr = this.splAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzctNm = this.bzctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bztpNm = this.bztpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splAmt = this.splAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlAmt = this.ttlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxDivCd = this.taxDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blnkKnt = this.blnkKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxAmt = this.taxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxSerNo = this.taxSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvYrmon = this.taxInvYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTpCd = this.slpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splRgstNo = this.splRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNaidFlg = this.taxNaidFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docEvidTpCd = this.docEvidTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxPlCd = this.taxPlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNslFlg = this.taxNslFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coNm = this.coNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faFlg = this.faFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpIssDt = this.slpIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpOfcCd = this.slpOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joXchRt = this.joXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrNm = this.ownrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpSerNo = this.slpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
