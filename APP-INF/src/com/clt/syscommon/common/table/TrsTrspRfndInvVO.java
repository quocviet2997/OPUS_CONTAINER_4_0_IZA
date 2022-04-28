/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspRfndInvVO.java
*@FileTitle : TrsTrspRfndInvVO
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

public class TrsTrspRfndInvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspRfndInvVO> models = new ArrayList<TrsTrspRfndInvVO>();
	
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String hjlTrspRfndQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String csrRfndCorrAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String hjlHndlPrdToDt = null;
	/* Column Info */
	private String hndlPrdFmDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hjlInvVndrSeq = null;
	/* Column Info */
	private String trspRfndInvAmt = null;
	/* Column Info */
	private String trspCostDtlModCd = null;
	/* Column Info */
	private String hjlTrspRfndUcRt = null;
	/* Column Info */
	private String hjlTrspRfndInvAmt = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String subInvSeq = null;
	/* Column Info */
	private String trspCrrModCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hndlPrdToDt = null;
	/* Column Info */
	private String trspRfndUcRt = null;
	/* Column Info */
	private String hjlHndlPrdFmDt = null;
	/* Column Info */
	private String trspRfndQty = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hjlNo = null;
	/* Column Info */
	private String csrRfndMonKnt = null;
	/* Column Info */
	private String invNegoAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspRfndInvVO() {}

	public TrsTrspRfndInvVO(String ibflag, String pagerows, String invNo, String invVndrSeq, String subInvSeq, String trspCostDtlModCd, String trspCrrModCd, String eqTpszCd, String trspRfndQty, String trspRfndInvAmt, String trspRfndUcRt, String hndlPrdFmDt, String hndlPrdToDt, String deltFlg, String creOfcCd, String csrRfndMonKnt, String csrRfndCorrAmt, String hjlNo, String hjlInvVndrSeq, String hjlTrspRfndQty, String hjlTrspRfndUcRt, String hjlTrspRfndInvAmt, String hjlHndlPrdFmDt, String hjlHndlPrdToDt, String creUsrId, String creDt, String updUsrId, String updDt, String invNegoAmt) {
		this.invVndrSeq = invVndrSeq;
		this.deltFlg = deltFlg;
		this.hjlTrspRfndQty = hjlTrspRfndQty;
		this.creDt = creDt;
		this.csrRfndCorrAmt = csrRfndCorrAmt;
		this.pagerows = pagerows;
		this.hjlHndlPrdToDt = hjlHndlPrdToDt;
		this.hndlPrdFmDt = hndlPrdFmDt;
		this.ibflag = ibflag;
		this.hjlInvVndrSeq = hjlInvVndrSeq;
		this.trspRfndInvAmt = trspRfndInvAmt;
		this.trspCostDtlModCd = trspCostDtlModCd;
		this.hjlTrspRfndUcRt = hjlTrspRfndUcRt;
		this.hjlTrspRfndInvAmt = hjlTrspRfndInvAmt;
		this.creOfcCd = creOfcCd;
		this.subInvSeq = subInvSeq;
		this.trspCrrModCd = trspCrrModCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.hndlPrdToDt = hndlPrdToDt;
		this.trspRfndUcRt = trspRfndUcRt;
		this.hjlHndlPrdFmDt = hjlHndlPrdFmDt;
		this.trspRfndQty = trspRfndQty;
		this.eqTpszCd = eqTpszCd;
		this.invNo = invNo;
		this.creUsrId = creUsrId;
		this.hjlNo = hjlNo;
		this.csrRfndMonKnt = csrRfndMonKnt;
		this.invNegoAmt = invNegoAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("hjl_trsp_rfnd_qty", getHjlTrspRfndQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("csr_rfnd_corr_amt", getCsrRfndCorrAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("hjl_hndl_prd_to_dt", getHjlHndlPrdToDt());
		this.hashColumns.put("hndl_prd_fm_dt", getHndlPrdFmDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("hjl_inv_vndr_seq", getHjlInvVndrSeq());
		this.hashColumns.put("trsp_rfnd_inv_amt", getTrspRfndInvAmt());
		this.hashColumns.put("trsp_cost_dtl_mod_cd", getTrspCostDtlModCd());
		this.hashColumns.put("hjl_trsp_rfnd_uc_rt", getHjlTrspRfndUcRt());
		this.hashColumns.put("hjl_trsp_rfnd_inv_amt", getHjlTrspRfndInvAmt());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("sub_inv_seq", getSubInvSeq());
		this.hashColumns.put("trsp_crr_mod_cd", getTrspCrrModCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hndl_prd_to_dt", getHndlPrdToDt());
		this.hashColumns.put("trsp_rfnd_uc_rt", getTrspRfndUcRt());
		this.hashColumns.put("hjl_hndl_prd_fm_dt", getHjlHndlPrdFmDt());
		this.hashColumns.put("trsp_rfnd_qty", getTrspRfndQty());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hjl_no", getHjlNo());
		this.hashColumns.put("csr_rfnd_mon_knt", getCsrRfndMonKnt());
		this.hashColumns.put("inv_nego_amt", getInvNegoAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("hjl_trsp_rfnd_qty", "hjlTrspRfndQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("csr_rfnd_corr_amt", "csrRfndCorrAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("hjl_hndl_prd_to_dt", "hjlHndlPrdToDt");
		this.hashFields.put("hndl_prd_fm_dt", "hndlPrdFmDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("hjl_inv_vndr_seq", "hjlInvVndrSeq");
		this.hashFields.put("trsp_rfnd_inv_amt", "trspRfndInvAmt");
		this.hashFields.put("trsp_cost_dtl_mod_cd", "trspCostDtlModCd");
		this.hashFields.put("hjl_trsp_rfnd_uc_rt", "hjlTrspRfndUcRt");
		this.hashFields.put("hjl_trsp_rfnd_inv_amt", "hjlTrspRfndInvAmt");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("sub_inv_seq", "subInvSeq");
		this.hashFields.put("trsp_crr_mod_cd", "trspCrrModCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hndl_prd_to_dt", "hndlPrdToDt");
		this.hashFields.put("trsp_rfnd_uc_rt", "trspRfndUcRt");
		this.hashFields.put("hjl_hndl_prd_fm_dt", "hjlHndlPrdFmDt");
		this.hashFields.put("trsp_rfnd_qty", "trspRfndQty");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hjl_no", "hjlNo");
		this.hashFields.put("csr_rfnd_mon_knt", "csrRfndMonKnt");
		this.hashFields.put("inv_nego_amt", "invNegoAmt");
		return this.hashFields;
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
	 * @return hjlTrspRfndQty
	 */
	public String getHjlTrspRfndQty() {
		return this.hjlTrspRfndQty;
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
	 * @return csrRfndCorrAmt
	 */
	public String getCsrRfndCorrAmt() {
		return this.csrRfndCorrAmt;
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
	 * @return hjlHndlPrdToDt
	 */
	public String getHjlHndlPrdToDt() {
		return this.hjlHndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @return hndlPrdFmDt
	 */
	public String getHndlPrdFmDt() {
		return this.hndlPrdFmDt;
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
	 * @return trspRfndInvAmt
	 */
	public String getTrspRfndInvAmt() {
		return this.trspRfndInvAmt;
	}
	
	/**
	 * Column Info
	 * @return trspCostDtlModCd
	 */
	public String getTrspCostDtlModCd() {
		return this.trspCostDtlModCd;
	}
	
	/**
	 * Column Info
	 * @return hjlTrspRfndUcRt
	 */
	public String getHjlTrspRfndUcRt() {
		return this.hjlTrspRfndUcRt;
	}
	
	/**
	 * Column Info
	 * @return hjlTrspRfndInvAmt
	 */
	public String getHjlTrspRfndInvAmt() {
		return this.hjlTrspRfndInvAmt;
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
	 * @return subInvSeq
	 */
	public String getSubInvSeq() {
		return this.subInvSeq;
	}
	
	/**
	 * Column Info
	 * @return trspCrrModCd
	 */
	public String getTrspCrrModCd() {
		return this.trspCrrModCd;
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
	 * @return hndlPrdToDt
	 */
	public String getHndlPrdToDt() {
		return this.hndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @return trspRfndUcRt
	 */
	public String getTrspRfndUcRt() {
		return this.trspRfndUcRt;
	}
	
	/**
	 * Column Info
	 * @return hjlHndlPrdFmDt
	 */
	public String getHjlHndlPrdFmDt() {
		return this.hjlHndlPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @return trspRfndQty
	 */
	public String getTrspRfndQty() {
		return this.trspRfndQty;
	}
	
	/**
	 * Column Info
	 * @return eqTpszCd
	 */
	public String getEqTpszCd() {
		return this.eqTpszCd;
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
	 * @return hjlNo
	 */
	public String getHjlNo() {
		return this.hjlNo;
	}
	
	/**
	 * Column Info
	 * @return csrRfndMonKnt
	 */
	public String getCsrRfndMonKnt() {
		return this.csrRfndMonKnt;
	}
	

	/**
	 * Column Info
	 * @return invNegoAmt
	 */
	public String getInvNegoAmt() {
		return invNegoAmt;
	}
	/**
	 * Column Info
	 * @param invNegoAmt
	 */
	public void setInvNegoAmt(String invNegoAmt) {
		this.invNegoAmt = invNegoAmt;
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
	 * @param hjlTrspRfndQty
	 */
	public void setHjlTrspRfndQty(String hjlTrspRfndQty) {
		this.hjlTrspRfndQty = hjlTrspRfndQty;
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
	 * @param csrRfndCorrAmt
	 */
	public void setCsrRfndCorrAmt(String csrRfndCorrAmt) {
		this.csrRfndCorrAmt = csrRfndCorrAmt;
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
	 * @param hjlHndlPrdToDt
	 */
	public void setHjlHndlPrdToDt(String hjlHndlPrdToDt) {
		this.hjlHndlPrdToDt = hjlHndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @param hndlPrdFmDt
	 */
	public void setHndlPrdFmDt(String hndlPrdFmDt) {
		this.hndlPrdFmDt = hndlPrdFmDt;
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
	 * @param trspRfndInvAmt
	 */
	public void setTrspRfndInvAmt(String trspRfndInvAmt) {
		this.trspRfndInvAmt = trspRfndInvAmt;
	}
	
	/**
	 * Column Info
	 * @param trspCostDtlModCd
	 */
	public void setTrspCostDtlModCd(String trspCostDtlModCd) {
		this.trspCostDtlModCd = trspCostDtlModCd;
	}
	
	/**
	 * Column Info
	 * @param hjlTrspRfndUcRt
	 */
	public void setHjlTrspRfndUcRt(String hjlTrspRfndUcRt) {
		this.hjlTrspRfndUcRt = hjlTrspRfndUcRt;
	}
	
	/**
	 * Column Info
	 * @param hjlTrspRfndInvAmt
	 */
	public void setHjlTrspRfndInvAmt(String hjlTrspRfndInvAmt) {
		this.hjlTrspRfndInvAmt = hjlTrspRfndInvAmt;
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
	 * @param subInvSeq
	 */
	public void setSubInvSeq(String subInvSeq) {
		this.subInvSeq = subInvSeq;
	}
	
	/**
	 * Column Info
	 * @param trspCrrModCd
	 */
	public void setTrspCrrModCd(String trspCrrModCd) {
		this.trspCrrModCd = trspCrrModCd;
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
	 * @param hndlPrdToDt
	 */
	public void setHndlPrdToDt(String hndlPrdToDt) {
		this.hndlPrdToDt = hndlPrdToDt;
	}
	
	/**
	 * Column Info
	 * @param trspRfndUcRt
	 */
	public void setTrspRfndUcRt(String trspRfndUcRt) {
		this.trspRfndUcRt = trspRfndUcRt;
	}
	
	/**
	 * Column Info
	 * @param hjlHndlPrdFmDt
	 */
	public void setHjlHndlPrdFmDt(String hjlHndlPrdFmDt) {
		this.hjlHndlPrdFmDt = hjlHndlPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @param trspRfndQty
	 */
	public void setTrspRfndQty(String trspRfndQty) {
		this.trspRfndQty = trspRfndQty;
	}
	
	/**
	 * Column Info
	 * @param eqTpszCd
	 */
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
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
	 * @param hjlNo
	 */
	public void setHjlNo(String hjlNo) {
		this.hjlNo = hjlNo;
	}
	
	/**
	 * Column Info
	 * @param csrRfndMonKnt
	 */
	public void setCsrRfndMonKnt(String csrRfndMonKnt) {
		this.csrRfndMonKnt = csrRfndMonKnt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setHjlTrspRfndQty(JSPUtil.getParameter(request, "hjl_trsp_rfnd_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCsrRfndCorrAmt(JSPUtil.getParameter(request, "csr_rfnd_corr_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setHjlHndlPrdToDt(JSPUtil.getParameter(request, "hjl_hndl_prd_to_dt", ""));
		setHndlPrdFmDt(JSPUtil.getParameter(request, "hndl_prd_fm_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setHjlInvVndrSeq(JSPUtil.getParameter(request, "hjl_inv_vndr_seq", ""));
		setTrspRfndInvAmt(JSPUtil.getParameter(request, "trsp_rfnd_inv_amt", ""));
		setTrspCostDtlModCd(JSPUtil.getParameter(request, "trsp_cost_dtl_mod_cd", ""));
		setHjlTrspRfndUcRt(JSPUtil.getParameter(request, "hjl_trsp_rfnd_uc_rt", ""));
		setHjlTrspRfndInvAmt(JSPUtil.getParameter(request, "hjl_trsp_rfnd_inv_amt", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setSubInvSeq(JSPUtil.getParameter(request, "sub_inv_seq", ""));
		setTrspCrrModCd(JSPUtil.getParameter(request, "trsp_crr_mod_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHndlPrdToDt(JSPUtil.getParameter(request, "hndl_prd_to_dt", ""));
		setTrspRfndUcRt(JSPUtil.getParameter(request, "trsp_rfnd_uc_rt", ""));
		setHjlHndlPrdFmDt(JSPUtil.getParameter(request, "hjl_hndl_prd_fm_dt", ""));
		setTrspRfndQty(JSPUtil.getParameter(request, "trsp_rfnd_qty", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setHjlNo(JSPUtil.getParameter(request, "hjl_no", ""));
		setCsrRfndMonKnt(JSPUtil.getParameter(request, "csr_rfnd_mon_knt", ""));
		setInvNegoAmt(JSPUtil.getParameter(request, "inv_nego_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspRfndInvVO[]
	 */
	public TrsTrspRfndInvVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspRfndInvVO[]
	 */
	public TrsTrspRfndInvVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRfndInvVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] hjlTrspRfndQty = (JSPUtil.getParameter(request, prefix	+ "hjl_trsp_rfnd_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] csrRfndCorrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_rfnd_corr_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] hjlHndlPrdToDt = (JSPUtil.getParameter(request, prefix	+ "hjl_hndl_prd_to_dt", length));
			String[] hndlPrdFmDt = (JSPUtil.getParameter(request, prefix	+ "hndl_prd_fm_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hjlInvVndrSeq = (JSPUtil.getParameter(request, prefix	+ "hjl_inv_vndr_seq", length));
			String[] trspRfndInvAmt = (JSPUtil.getParameter(request, prefix	+ "trsp_rfnd_inv_amt", length));
			String[] trspCostDtlModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_cost_dtl_mod_cd", length));
			String[] hjlTrspRfndUcRt = (JSPUtil.getParameter(request, prefix	+ "hjl_trsp_rfnd_uc_rt", length));
			String[] hjlTrspRfndInvAmt = (JSPUtil.getParameter(request, prefix	+ "hjl_trsp_rfnd_inv_amt", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] subInvSeq = (JSPUtil.getParameter(request, prefix	+ "sub_inv_seq", length));
			String[] trspCrrModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_crr_mod_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hndlPrdToDt = (JSPUtil.getParameter(request, prefix	+ "hndl_prd_to_dt", length));
			String[] trspRfndUcRt = (JSPUtil.getParameter(request, prefix	+ "trsp_rfnd_uc_rt", length));
			String[] hjlHndlPrdFmDt = (JSPUtil.getParameter(request, prefix	+ "hjl_hndl_prd_fm_dt", length));
			String[] trspRfndQty = (JSPUtil.getParameter(request, prefix	+ "trsp_rfnd_qty", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hjlNo = (JSPUtil.getParameter(request, prefix	+ "hjl_no", length));
			String[] csrRfndMonKnt = (JSPUtil.getParameter(request, prefix	+ "csr_rfnd_mon_knt", length));
			String[] invNegoAmt = (JSPUtil.getParameter(request, prefix	+ "inv_nego_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRfndInvVO();
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (hjlTrspRfndQty[i] != null)
					model.setHjlTrspRfndQty(hjlTrspRfndQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (csrRfndCorrAmt[i] != null)
					model.setCsrRfndCorrAmt(csrRfndCorrAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (hjlHndlPrdToDt[i] != null)
					model.setHjlHndlPrdToDt(hjlHndlPrdToDt[i]);
				if (hndlPrdFmDt[i] != null)
					model.setHndlPrdFmDt(hndlPrdFmDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hjlInvVndrSeq[i] != null)
					model.setHjlInvVndrSeq(hjlInvVndrSeq[i]);
				if (trspRfndInvAmt[i] != null)
					model.setTrspRfndInvAmt(trspRfndInvAmt[i]);
				if (trspCostDtlModCd[i] != null)
					model.setTrspCostDtlModCd(trspCostDtlModCd[i]);
				if (hjlTrspRfndUcRt[i] != null)
					model.setHjlTrspRfndUcRt(hjlTrspRfndUcRt[i]);
				if (hjlTrspRfndInvAmt[i] != null)
					model.setHjlTrspRfndInvAmt(hjlTrspRfndInvAmt[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (subInvSeq[i] != null)
					model.setSubInvSeq(subInvSeq[i]);
				if (trspCrrModCd[i] != null)
					model.setTrspCrrModCd(trspCrrModCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hndlPrdToDt[i] != null)
					model.setHndlPrdToDt(hndlPrdToDt[i]);
				if (trspRfndUcRt[i] != null)
					model.setTrspRfndUcRt(trspRfndUcRt[i]);
				if (hjlHndlPrdFmDt[i] != null)
					model.setHjlHndlPrdFmDt(hjlHndlPrdFmDt[i]);
				if (trspRfndQty[i] != null)
					model.setTrspRfndQty(trspRfndQty[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hjlNo[i] != null)
					model.setHjlNo(hjlNo[i]);
				if (csrRfndMonKnt[i] != null)
					model.setCsrRfndMonKnt(csrRfndMonKnt[i]);
				if (invNegoAmt[i] != null)
					model.setInvNegoAmt(invNegoAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspRfndInvVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspRfndInvVO[]
	 */
	public TrsTrspRfndInvVO[] getTrsTrspRfndInvVOs(){
		TrsTrspRfndInvVO[] vos = (TrsTrspRfndInvVO[])models.toArray(new TrsTrspRfndInvVO[models.size()]);
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
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlTrspRfndQty = this.hjlTrspRfndQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrRfndCorrAmt = this.csrRfndCorrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlHndlPrdToDt = this.hjlHndlPrdToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hndlPrdFmDt = this.hndlPrdFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlInvVndrSeq = this.hjlInvVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRfndInvAmt = this.trspRfndInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCostDtlModCd = this.trspCostDtlModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlTrspRfndUcRt = this.hjlTrspRfndUcRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlTrspRfndInvAmt = this.hjlTrspRfndInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subInvSeq = this.subInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCrrModCd = this.trspCrrModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hndlPrdToDt = this.hndlPrdToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRfndUcRt = this.trspRfndUcRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlHndlPrdFmDt = this.hjlHndlPrdFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRfndQty = this.trspRfndQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlNo = this.hjlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrRfndMonKnt = this.csrRfndMonKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNegoAmt = this.invNegoAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
