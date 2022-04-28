/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgChgRtVO.java
*@FileTitle : BkgChgRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.05
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.08.05 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgChgRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgChgRtVO> models = new ArrayList<BkgChgRtVO>();
	
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n3ptyCustSeq = null;
	/* Column Info */
	private String chgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String aplyXchRto = null;
	/* Column Info */
	private String invStsCd = null;
	/* Column Info */
	private String cgoCateCd = null;
	/* Column Info */
	private String bkgQty = null;
	/* Column Info */
	private String chgAmt = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String n3ptyCustCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String prnHdnFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String chgUtAmt = null;
	/* Column Info */
	private String autoRatCd = null;
	/* Column Info */
	private String n3ptyRcvOfcCd = null;
	/* Column Info */
	private String frtTermCd = null;
	/* Column Info */
	private String ratUtCd = null;
	/* Column Info */
	private String inclOftFlg = null; // 
	/* Column Info */
	private String trfItmNo = null;
	/* Column Info */
	private String rtSeq = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String agmtRatUtCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ratAsQty = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String frtInclXcldDivCd = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgChgRtVO() {}

	public BkgChgRtVO(String ibflag, String pagerows, String bkgNo, String rtSeq, String dpSeq, String frtTermCd, String trfItmNo, String cgoCateCd, String imdgClssCd, String chgCd, String currCd, String ratUtCd, String bkgQty, String ratAsQty, String chgUtAmt, String chgAmt, String rcvTermCd, String deTermCd, String n3ptyRcvOfcCd, String n3ptyCustCntCd, String n3ptyCustSeq, String inclOftFlg, String invStsCd, String prnHdnFlg, String autoRatCd, String aplyXchRto, String agmtRatUtCd, String creUsrId, String creDt, String updUsrId, String updDt, String frtInclXcldDivCd) {
		this.dpSeq = dpSeq;
		this.currCd = currCd;
		this.creDt = creDt;
		this.n3ptyCustSeq = n3ptyCustSeq;
		this.chgCd = chgCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.aplyXchRto = aplyXchRto;
		this.invStsCd = invStsCd;
		this.cgoCateCd = cgoCateCd;
		this.bkgQty = bkgQty;
		this.chgAmt = chgAmt;
		this.rcvTermCd = rcvTermCd;
		this.n3ptyCustCntCd = n3ptyCustCntCd;
		this.updUsrId = updUsrId;
		this.prnHdnFlg = prnHdnFlg;
		this.updDt = updDt;
		this.chgUtAmt = chgUtAmt;
		this.autoRatCd = autoRatCd;
		this.n3ptyRcvOfcCd = n3ptyRcvOfcCd;
		this.frtTermCd = frtTermCd;
		this.ratUtCd = ratUtCd;
		this.inclOftFlg = inclOftFlg;
		this.trfItmNo = trfItmNo;
		this.rtSeq = rtSeq;
		this.deTermCd = deTermCd;
		this.creUsrId = creUsrId;
		this.agmtRatUtCd = agmtRatUtCd;
		this.bkgNo = bkgNo;
		this.ratAsQty = ratAsQty;
		this.imdgClssCd = imdgClssCd;
		this.frtInclXcldDivCd = frtInclXcldDivCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n3pty_cust_seq", getN3ptyCustSeq());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("aply_xch_rto", getAplyXchRto());
		this.hashColumns.put("inv_sts_cd", getInvStsCd());
		this.hashColumns.put("cgo_cate_cd", getCgoCateCd());
		this.hashColumns.put("bkg_qty", getBkgQty());
		this.hashColumns.put("chg_amt", getChgAmt());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("n3pty_cust_cnt_cd", getN3ptyCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prn_hdn_flg", getPrnHdnFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("chg_ut_amt", getChgUtAmt());
		this.hashColumns.put("auto_rat_cd", getAutoRatCd());
		this.hashColumns.put("n3pty_rcv_ofc_cd", getN3ptyRcvOfcCd());
		this.hashColumns.put("frt_term_cd", getFrtTermCd());
		this.hashColumns.put("rat_ut_cd", getRatUtCd());
		this.hashColumns.put("incl_oft_flg", getInclOftFlg());
		this.hashColumns.put("trf_itm_no", getTrfItmNo());
		this.hashColumns.put("rt_seq", getRtSeq());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_rat_ut_cd", getAgmtRatUtCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("rat_as_qty", getRatAsQty());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("frt_incl_xcld_div_cd", getFrtInclXcldDivCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n3pty_cust_seq", "n3ptyCustSeq");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("aply_xch_rto", "aplyXchRto");
		this.hashFields.put("inv_sts_cd", "invStsCd");
		this.hashFields.put("cgo_cate_cd", "cgoCateCd");
		this.hashFields.put("bkg_qty", "bkgQty");
		this.hashFields.put("chg_amt", "chgAmt");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("n3pty_cust_cnt_cd", "n3ptyCustCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prn_hdn_flg", "prnHdnFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("chg_ut_amt", "chgUtAmt");
		this.hashFields.put("auto_rat_cd", "autoRatCd");
		this.hashFields.put("n3pty_rcv_ofc_cd", "n3ptyRcvOfcCd");
		this.hashFields.put("frt_term_cd", "frtTermCd");
		this.hashFields.put("rat_ut_cd", "ratUtCd");
		this.hashFields.put("incl_oft_flg", "inclOftFlg");
		this.hashFields.put("trf_itm_no", "trfItmNo");
		this.hashFields.put("rt_seq", "rtSeq");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_rat_ut_cd", "agmtRatUtCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("rat_as_qty", "ratAsQty");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("frt_incl_xcld_div_cd", "frtInclXcldDivCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCustSeq
	 */
	public String getN3ptyCustSeq() {
		return this.n3ptyCustSeq;
	}
	
	/**
	 * Column Info
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
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
	 * @return aplyXchRto
	 */
	public String getAplyXchRto() {
		return this.aplyXchRto;
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
	 * @return cgoCateCd
	 */
	public String getCgoCateCd() {
		return this.cgoCateCd;
	}
	
	/**
	 * Column Info
	 * @return bkgQty
	 */
	public String getBkgQty() {
		return this.bkgQty;
	}
	
	/**
	 * Column Info
	 * @return chgAmt
	 */
	public String getChgAmt() {
		return this.chgAmt;
	}
	
	/**
	 * Column Info
	 * @return rcvTermCd
	 */
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCustCntCd
	 */
	public String getN3ptyCustCntCd() {
		return this.n3ptyCustCntCd;
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
	 * @return prnHdnFlg
	 */
	public String getPrnHdnFlg() {
		return this.prnHdnFlg;
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
	 * @return chgUtAmt
	 */
	public String getChgUtAmt() {
		return this.chgUtAmt;
	}
	
	/**
	 * Column Info
	 * @return autoRatCd
	 */
	public String getAutoRatCd() {
		return this.autoRatCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyRcvOfcCd
	 */
	public String getN3ptyRcvOfcCd() {
		return this.n3ptyRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @return frtTermCd
	 */
	public String getFrtTermCd() {
		return this.frtTermCd;
	}
	
	/**
	 * Column Info
	 * @return ratUtCd
	 */
	public String getRatUtCd() {
		return this.ratUtCd;
	}
	
	/**
	 * Column Info
	 * @return inclOftFlg
	 */
	public String getInclOftFlg() {
		return this.inclOftFlg;
	}
	
	/**
	 * Column Info
	 * @return trfItmNo
	 */
	public String getTrfItmNo() {
		return this.trfItmNo;
	}
	
	/**
	 * Column Info
	 * @return rtSeq
	 */
	public String getRtSeq() {
		return this.rtSeq;
	}
	
	/**
	 * Column Info
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
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
	 * @return agmtRatUtCd
	 */
	public String getAgmtRatUtCd() {
		return this.agmtRatUtCd;
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
	 * @return ratAsQty
	 */
	public String getRatAsQty() {
		return this.ratAsQty;
	}
	
	/**
	 * Column Info
	 * @return imdgClssCd
	 */
	public String getImdgClssCd() {
		return this.imdgClssCd;
	}
	
	/**
	 * Column Info
	 * @return frtInclXcldDivCd
	 */
	public String getFrtInclXcldDivCd() {
		return this.frtInclXcldDivCd;
	}
	
	/**
	 * Column Info
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCustSeq
	 */
	public void setN3ptyCustSeq(String n3ptyCustSeq) {
		this.n3ptyCustSeq = n3ptyCustSeq;
	}
	
	/**
	 * Column Info
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
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
	 * @param aplyXchRto
	 */
	public void setAplyXchRto(String aplyXchRto) {
		this.aplyXchRto = aplyXchRto;
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
	 * @param cgoCateCd
	 */
	public void setCgoCateCd(String cgoCateCd) {
		this.cgoCateCd = cgoCateCd;
	}
	
	/**
	 * Column Info
	 * @param bkgQty
	 */
	public void setBkgQty(String bkgQty) {
		this.bkgQty = bkgQty;
	}
	
	/**
	 * Column Info
	 * @param chgAmt
	 */
	public void setChgAmt(String chgAmt) {
		this.chgAmt = chgAmt;
	}
	
	/**
	 * Column Info
	 * @param rcvTermCd
	 */
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCustCntCd
	 */
	public void setN3ptyCustCntCd(String n3ptyCustCntCd) {
		this.n3ptyCustCntCd = n3ptyCustCntCd;
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
	 * @param prnHdnFlg
	 */
	public void setPrnHdnFlg(String prnHdnFlg) {
		this.prnHdnFlg = prnHdnFlg;
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
	 * @param chgUtAmt
	 */
	public void setChgUtAmt(String chgUtAmt) {
		this.chgUtAmt = chgUtAmt;
	}
	
	/**
	 * Column Info
	 * @param autoRatCd
	 */
	public void setAutoRatCd(String autoRatCd) {
		this.autoRatCd = autoRatCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyRcvOfcCd
	 */
	public void setN3ptyRcvOfcCd(String n3ptyRcvOfcCd) {
		this.n3ptyRcvOfcCd = n3ptyRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @param frtTermCd
	 */
	public void setFrtTermCd(String frtTermCd) {
		this.frtTermCd = frtTermCd;
	}
	
	/**
	 * Column Info
	 * @param ratUtCd
	 */
	public void setRatUtCd(String ratUtCd) {
		this.ratUtCd = ratUtCd;
	}
	
	/**
	 * Column Info
	 * @param inclOftFlg
	 */
	public void setInclOftFlg(String inclOftFlg) {
		this.inclOftFlg = inclOftFlg;
	}
	
	/**
	 * Column Info
	 * @param trfItmNo
	 */
	public void setTrfItmNo(String trfItmNo) {
		this.trfItmNo = trfItmNo;
	}
	
	/**
	 * Column Info
	 * @param rtSeq
	 */
	public void setRtSeq(String rtSeq) {
		this.rtSeq = rtSeq;
	}
	
	/**
	 * Column Info
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
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
	 * @param agmtRatUtCd
	 */
	public void setAgmtRatUtCd(String agmtRatUtCd) {
		this.agmtRatUtCd = agmtRatUtCd;
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
	 * @param ratAsQty
	 */
	public void setRatAsQty(String ratAsQty) {
		this.ratAsQty = ratAsQty;
	}
	
	/**
	 * Column Info
	 * @param imdgClssCd
	 */
	public void setImdgClssCd(String imdgClssCd) {
		this.imdgClssCd = imdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param frtInclXcldDivCd
	 */
	public void setFrtInclXcldDivCd(String frtInclXcldDivCd) {
		this.frtInclXcldDivCd = frtInclXcldDivCd;
	}
	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN3ptyCustSeq(JSPUtil.getParameter(request, "n3pty_cust_seq", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAplyXchRto(JSPUtil.getParameter(request, "aply_xch_rto", ""));
		setInvStsCd(JSPUtil.getParameter(request, "inv_sts_cd", ""));
		setCgoCateCd(JSPUtil.getParameter(request, "cgo_cate_cd", ""));
		setBkgQty(JSPUtil.getParameter(request, "bkg_qty", ""));
		setChgAmt(JSPUtil.getParameter(request, "chg_amt", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setN3ptyCustCntCd(JSPUtil.getParameter(request, "n3pty_cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPrnHdnFlg(JSPUtil.getParameter(request, "prn_hdn_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setChgUtAmt(JSPUtil.getParameter(request, "chg_ut_amt", ""));
		setAutoRatCd(JSPUtil.getParameter(request, "auto_rat_cd", ""));
		setN3ptyRcvOfcCd(JSPUtil.getParameter(request, "n3pty_rcv_ofc_cd", ""));
		setFrtTermCd(JSPUtil.getParameter(request, "frt_term_cd", ""));
		setRatUtCd(JSPUtil.getParameter(request, "rat_ut_cd", ""));
		setInclOftFlg(JSPUtil.getParameter(request, "incl_oft_flg", ""));
		setTrfItmNo(JSPUtil.getParameter(request, "trf_itm_no", ""));
		setRtSeq(JSPUtil.getParameter(request, "rt_seq", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtRatUtCd(JSPUtil.getParameter(request, "agmt_rat_ut_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRatAsQty(JSPUtil.getParameter(request, "rat_as_qty", ""));
		setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
		setFrtInclXcldDivCd(JSPUtil.getParameter(request, "frt_incl_xcld_div_cd", ""));
		
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgChgRtVO[]
	 */
	public BkgChgRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgChgRtVO[]
	 */
	public BkgChgRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgChgRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n3ptyCustSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_cust_seq", length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] aplyXchRto = (JSPUtil.getParameter(request, prefix	+ "aply_xch_rto", length));
			String[] invStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_sts_cd", length));
			String[] cgoCateCd = (JSPUtil.getParameter(request, prefix	+ "cgo_cate_cd", length));
			String[] bkgQty = (JSPUtil.getParameter(request, prefix	+ "bkg_qty", length));
			String[] chgAmt = (JSPUtil.getParameter(request, prefix	+ "chg_amt", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] n3ptyCustCntCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] prnHdnFlg = (JSPUtil.getParameter(request, prefix	+ "prn_hdn_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] chgUtAmt = (JSPUtil.getParameter(request, prefix	+ "chg_ut_amt", length));
			String[] autoRatCd = (JSPUtil.getParameter(request, prefix	+ "auto_rat_cd", length));
			String[] n3ptyRcvOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_rcv_ofc_cd", length));
			String[] frtTermCd = (JSPUtil.getParameter(request, prefix	+ "frt_term_cd", length));
			String[] ratUtCd = (JSPUtil.getParameter(request, prefix	+ "rat_ut_cd", length));
			String[] inclOftFlg = (JSPUtil.getParameter(request, prefix	+ "incl_oft_flg", length));
			String[] trfItmNo = (JSPUtil.getParameter(request, prefix	+ "trf_itm_no", length));
			String[] rtSeq = (JSPUtil.getParameter(request, prefix	+ "rt_seq", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] agmtRatUtCd = (JSPUtil.getParameter(request, prefix	+ "agmt_rat_ut_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ratAsQty = (JSPUtil.getParameter(request, prefix	+ "rat_as_qty", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			String[] frtInclXcldDivCd = (JSPUtil.getParameter(request, prefix	+ "frt_incl_xcld_div_cd", length));
			
			
			for (int i = 0; i < length; i++) {
				model = new BkgChgRtVO();
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n3ptyCustSeq[i] != null)
					model.setN3ptyCustSeq(n3ptyCustSeq[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (aplyXchRto[i] != null)
					model.setAplyXchRto(aplyXchRto[i]);
				if (invStsCd[i] != null)
					model.setInvStsCd(invStsCd[i]);
				if (cgoCateCd[i] != null)
					model.setCgoCateCd(cgoCateCd[i]);
				if (bkgQty[i] != null)
					model.setBkgQty(bkgQty[i]);
				if (chgAmt[i] != null)
					model.setChgAmt(chgAmt[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (n3ptyCustCntCd[i] != null)
					model.setN3ptyCustCntCd(n3ptyCustCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (prnHdnFlg[i] != null)
					model.setPrnHdnFlg(prnHdnFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (chgUtAmt[i] != null)
					model.setChgUtAmt(chgUtAmt[i]);
				if (autoRatCd[i] != null)
					model.setAutoRatCd(autoRatCd[i]);
				if (n3ptyRcvOfcCd[i] != null)
					model.setN3ptyRcvOfcCd(n3ptyRcvOfcCd[i]);
				if (frtTermCd[i] != null)
					model.setFrtTermCd(frtTermCd[i]);
				if (ratUtCd[i] != null)
					model.setRatUtCd(ratUtCd[i]);
				if (inclOftFlg[i] != null)
					model.setInclOftFlg(inclOftFlg[i]);
				if (trfItmNo[i] != null)
					model.setTrfItmNo(trfItmNo[i]);
				if (rtSeq[i] != null)
					model.setRtSeq(rtSeq[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtRatUtCd[i] != null)
					model.setAgmtRatUtCd(agmtRatUtCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ratAsQty[i] != null)
					model.setRatAsQty(ratAsQty[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (frtInclXcldDivCd[i] != null)
					model.setFrtInclXcldDivCd(frtInclXcldDivCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgChgRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgChgRtVO[]
	 */
	public BkgChgRtVO[] getBkgChgRtVOs(){
		BkgChgRtVO[] vos = (BkgChgRtVO[])models.toArray(new BkgChgRtVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustSeq = this.n3ptyCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyXchRto = this.aplyXchRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStsCd = this.invStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoCateCd = this.cgoCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgQty = this.bkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgAmt = this.chgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustCntCd = this.n3ptyCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnHdnFlg = this.prnHdnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgUtAmt = this.chgUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoRatCd = this.autoRatCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyRcvOfcCd = this.n3ptyRcvOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtTermCd = this.frtTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtCd = this.ratUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclOftFlg = this.inclOftFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfItmNo = this.trfItmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtSeq = this.rtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRatUtCd = this.agmtRatUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratAsQty = this.ratAsQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtInclXcldDivCd = this.frtInclXcldDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
	}
}

