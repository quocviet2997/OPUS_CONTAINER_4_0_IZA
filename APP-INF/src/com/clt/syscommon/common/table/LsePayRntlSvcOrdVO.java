/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LsePayRntlSvcOrdVO.java
*@FileTitle : LsePayRntlSvcOrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.10
*@LastModifier : 노정용
*@LastVersion : 1.0
* 2009.09.10 노정용 
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
 * @author 노정용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LsePayRntlSvcOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LsePayRntlSvcOrdVO> models = new ArrayList<LsePayRntlSvcOrdVO>();
	
	/* Column Info */
	private String soCrCostAmt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String soConvCostAmt = null;
	/* Column Info */
	private String soSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String soConvCrAmt = null;
	/* Column Info */
	private String chgSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String soRgnHoCd = null;
	/* Column Info */
	private String soIssYrmon = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costCd = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String soConvCurrCd = null;
	/* Column Info */
	private String soConvRtAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String soCostOfcCd = null;
	/* Column Info */
	private String soIssOfcCd = null;
	/* Column Info */
	private String soOfcCtyCd = null;
	/* Column Info */
	private String soInvCostAmt = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String soTtlCostAmt = null;
	/* Column Info */
	private String soPayStsFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String woSeq = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String woOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LsePayRntlSvcOrdVO() {}

	public LsePayRntlSvcOrdVO(String ibflag, String pagerows, String agmtCtyCd, String agmtSeq, String chgSeq, String soOfcCtyCd, String soSeq, String soIssYrmon, String costCd, String soCostOfcCd, String soIssOfcCd, String woOfcCtyCd, String woSeq, String currCd, String vndrSeq, String soTtlCostAmt, String soRgnHoCd, String soInvCostAmt, String soPayStsFlg, String soCrCostAmt, String soConvCostAmt, String soConvCurrCd, String soConvRtAmt, String soConvCrAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.soCrCostAmt = soCrCostAmt;
		this.currCd = currCd;
		this.soConvCostAmt = soConvCostAmt;
		this.soSeq = soSeq;
		this.creDt = creDt;
		this.soConvCrAmt = soConvCrAmt;
		this.chgSeq = chgSeq;
		this.pagerows = pagerows;
		this.soRgnHoCd = soRgnHoCd;
		this.soIssYrmon = soIssYrmon;
		this.ibflag = ibflag;
		this.costCd = costCd;
		this.agmtCtyCd = agmtCtyCd;
		this.soConvCurrCd = soConvCurrCd;
		this.soConvRtAmt = soConvRtAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.soCostOfcCd = soCostOfcCd;
		this.soIssOfcCd = soIssOfcCd;
		this.soOfcCtyCd = soOfcCtyCd;
		this.soInvCostAmt = soInvCostAmt;
		this.agmtSeq = agmtSeq;
		this.soTtlCostAmt = soTtlCostAmt;
		this.soPayStsFlg = soPayStsFlg;
		this.creUsrId = creUsrId;
		this.woSeq = woSeq;
		this.vndrSeq = vndrSeq;
		this.woOfcCtyCd = woOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("so_cr_cost_amt", getSoCrCostAmt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("so_conv_cost_amt", getSoConvCostAmt());
		this.hashColumns.put("so_seq", getSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("so_conv_cr_amt", getSoConvCrAmt());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("so_rgn_ho_cd", getSoRgnHoCd());
		this.hashColumns.put("so_iss_yrmon", getSoIssYrmon());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_cd", getCostCd());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("so_conv_curr_cd", getSoConvCurrCd());
		this.hashColumns.put("so_conv_rt_amt", getSoConvRtAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("so_cost_ofc_cd", getSoCostOfcCd());
		this.hashColumns.put("so_iss_ofc_cd", getSoIssOfcCd());
		this.hashColumns.put("so_ofc_cty_cd", getSoOfcCtyCd());
		this.hashColumns.put("so_inv_cost_amt", getSoInvCostAmt());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("so_ttl_cost_amt", getSoTtlCostAmt());
		this.hashColumns.put("so_pay_sts_flg", getSoPayStsFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("wo_seq", getWoSeq());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("wo_ofc_cty_cd", getWoOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("so_cr_cost_amt", "soCrCostAmt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("so_conv_cost_amt", "soConvCostAmt");
		this.hashFields.put("so_seq", "soSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("so_conv_cr_amt", "soConvCrAmt");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("so_rgn_ho_cd", "soRgnHoCd");
		this.hashFields.put("so_iss_yrmon", "soIssYrmon");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_cd", "costCd");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("so_conv_curr_cd", "soConvCurrCd");
		this.hashFields.put("so_conv_rt_amt", "soConvRtAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("so_cost_ofc_cd", "soCostOfcCd");
		this.hashFields.put("so_iss_ofc_cd", "soIssOfcCd");
		this.hashFields.put("so_ofc_cty_cd", "soOfcCtyCd");
		this.hashFields.put("so_inv_cost_amt", "soInvCostAmt");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("so_ttl_cost_amt", "soTtlCostAmt");
		this.hashFields.put("so_pay_sts_flg", "soPayStsFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("wo_seq", "woSeq");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("wo_ofc_cty_cd", "woOfcCtyCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return soCrCostAmt
	 */
	public String getSoCrCostAmt() {
		return this.soCrCostAmt;
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
	 * @return soConvCostAmt
	 */
	public String getSoConvCostAmt() {
		return this.soConvCostAmt;
	}
	
	/**
	 * Column Info
	 * @return soSeq
	 */
	public String getSoSeq() {
		return this.soSeq;
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
	 * @return soConvCrAmt
	 */
	public String getSoConvCrAmt() {
		return this.soConvCrAmt;
	}
	
	/**
	 * Column Info
	 * @return chgSeq
	 */
	public String getChgSeq() {
		return this.chgSeq;
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
	 * @return soRgnHoCd
	 */
	public String getSoRgnHoCd() {
		return this.soRgnHoCd;
	}
	
	/**
	 * Column Info
	 * @return soIssYrmon
	 */
	public String getSoIssYrmon() {
		return this.soIssYrmon;
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
	 * @return costCd
	 */
	public String getCostCd() {
		return this.costCd;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return soConvCurrCd
	 */
	public String getSoConvCurrCd() {
		return this.soConvCurrCd;
	}
	
	/**
	 * Column Info
	 * @return soConvRtAmt
	 */
	public String getSoConvRtAmt() {
		return this.soConvRtAmt;
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
	 * @return soCostOfcCd
	 */
	public String getSoCostOfcCd() {
		return this.soCostOfcCd;
	}
	
	/**
	 * Column Info
	 * @return soIssOfcCd
	 */
	public String getSoIssOfcCd() {
		return this.soIssOfcCd;
	}
	
	/**
	 * Column Info
	 * @return soOfcCtyCd
	 */
	public String getSoOfcCtyCd() {
		return this.soOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return soInvCostAmt
	 */
	public String getSoInvCostAmt() {
		return this.soInvCostAmt;
	}
	
	/**
	 * Column Info
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	
	/**
	 * Column Info
	 * @return soTtlCostAmt
	 */
	public String getSoTtlCostAmt() {
		return this.soTtlCostAmt;
	}
	
	/**
	 * Column Info
	 * @return soPayStsFlg
	 */
	public String getSoPayStsFlg() {
		return this.soPayStsFlg;
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
	 * @return woSeq
	 */
	public String getWoSeq() {
		return this.woSeq;
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
	 * @return woOfcCtyCd
	 */
	public String getWoOfcCtyCd() {
		return this.woOfcCtyCd;
	}
	

	/**
	 * Column Info
	 * @param soCrCostAmt
	 */
	public void setSoCrCostAmt(String soCrCostAmt) {
		this.soCrCostAmt = soCrCostAmt;
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
	 * @param soConvCostAmt
	 */
	public void setSoConvCostAmt(String soConvCostAmt) {
		this.soConvCostAmt = soConvCostAmt;
	}
	
	/**
	 * Column Info
	 * @param soSeq
	 */
	public void setSoSeq(String soSeq) {
		this.soSeq = soSeq;
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
	 * @param soConvCrAmt
	 */
	public void setSoConvCrAmt(String soConvCrAmt) {
		this.soConvCrAmt = soConvCrAmt;
	}
	
	/**
	 * Column Info
	 * @param chgSeq
	 */
	public void setChgSeq(String chgSeq) {
		this.chgSeq = chgSeq;
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
	 * @param soRgnHoCd
	 */
	public void setSoRgnHoCd(String soRgnHoCd) {
		this.soRgnHoCd = soRgnHoCd;
	}
	
	/**
	 * Column Info
	 * @param soIssYrmon
	 */
	public void setSoIssYrmon(String soIssYrmon) {
		this.soIssYrmon = soIssYrmon;
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
	 * @param costCd
	 */
	public void setCostCd(String costCd) {
		this.costCd = costCd;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param soConvCurrCd
	 */
	public void setSoConvCurrCd(String soConvCurrCd) {
		this.soConvCurrCd = soConvCurrCd;
	}
	
	/**
	 * Column Info
	 * @param soConvRtAmt
	 */
	public void setSoConvRtAmt(String soConvRtAmt) {
		this.soConvRtAmt = soConvRtAmt;
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
	 * @param soCostOfcCd
	 */
	public void setSoCostOfcCd(String soCostOfcCd) {
		this.soCostOfcCd = soCostOfcCd;
	}
	
	/**
	 * Column Info
	 * @param soIssOfcCd
	 */
	public void setSoIssOfcCd(String soIssOfcCd) {
		this.soIssOfcCd = soIssOfcCd;
	}
	
	/**
	 * Column Info
	 * @param soOfcCtyCd
	 */
	public void setSoOfcCtyCd(String soOfcCtyCd) {
		this.soOfcCtyCd = soOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param soInvCostAmt
	 */
	public void setSoInvCostAmt(String soInvCostAmt) {
		this.soInvCostAmt = soInvCostAmt;
	}
	
	/**
	 * Column Info
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
	}
	
	/**
	 * Column Info
	 * @param soTtlCostAmt
	 */
	public void setSoTtlCostAmt(String soTtlCostAmt) {
		this.soTtlCostAmt = soTtlCostAmt;
	}
	
	/**
	 * Column Info
	 * @param soPayStsFlg
	 */
	public void setSoPayStsFlg(String soPayStsFlg) {
		this.soPayStsFlg = soPayStsFlg;
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
	 * @param woSeq
	 */
	public void setWoSeq(String woSeq) {
		this.woSeq = woSeq;
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
	 * @param woOfcCtyCd
	 */
	public void setWoOfcCtyCd(String woOfcCtyCd) {
		this.woOfcCtyCd = woOfcCtyCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setSoCrCostAmt(JSPUtil.getParameter(request, "so_cr_cost_amt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setSoConvCostAmt(JSPUtil.getParameter(request, "so_conv_cost_amt", ""));
		setSoSeq(JSPUtil.getParameter(request, "so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSoConvCrAmt(JSPUtil.getParameter(request, "so_conv_cr_amt", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSoRgnHoCd(JSPUtil.getParameter(request, "so_rgn_ho_cd", ""));
		setSoIssYrmon(JSPUtil.getParameter(request, "so_iss_yrmon", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostCd(JSPUtil.getParameter(request, "cost_cd", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setSoConvCurrCd(JSPUtil.getParameter(request, "so_conv_curr_cd", ""));
		setSoConvRtAmt(JSPUtil.getParameter(request, "so_conv_rt_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSoCostOfcCd(JSPUtil.getParameter(request, "so_cost_ofc_cd", ""));
		setSoIssOfcCd(JSPUtil.getParameter(request, "so_iss_ofc_cd", ""));
		setSoOfcCtyCd(JSPUtil.getParameter(request, "so_ofc_cty_cd", ""));
		setSoInvCostAmt(JSPUtil.getParameter(request, "so_inv_cost_amt", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setSoTtlCostAmt(JSPUtil.getParameter(request, "so_ttl_cost_amt", ""));
		setSoPayStsFlg(JSPUtil.getParameter(request, "so_pay_sts_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setWoSeq(JSPUtil.getParameter(request, "wo_seq", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setWoOfcCtyCd(JSPUtil.getParameter(request, "wo_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LsePayRntlSvcOrdVO[]
	 */
	public LsePayRntlSvcOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LsePayRntlSvcOrdVO[]
	 */
	public LsePayRntlSvcOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LsePayRntlSvcOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] soCrCostAmt = (JSPUtil.getParameter(request, prefix	+ "so_cr_cost_amt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] soConvCostAmt = (JSPUtil.getParameter(request, prefix	+ "so_conv_cost_amt", length));
			String[] soSeq = (JSPUtil.getParameter(request, prefix	+ "so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] soConvCrAmt = (JSPUtil.getParameter(request, prefix	+ "so_conv_cr_amt", length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] soRgnHoCd = (JSPUtil.getParameter(request, prefix	+ "so_rgn_ho_cd", length));
			String[] soIssYrmon = (JSPUtil.getParameter(request, prefix	+ "so_iss_yrmon", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costCd = (JSPUtil.getParameter(request, prefix	+ "cost_cd", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] soConvCurrCd = (JSPUtil.getParameter(request, prefix	+ "so_conv_curr_cd", length));
			String[] soConvRtAmt = (JSPUtil.getParameter(request, prefix	+ "so_conv_rt_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] soCostOfcCd = (JSPUtil.getParameter(request, prefix	+ "so_cost_ofc_cd", length));
			String[] soIssOfcCd = (JSPUtil.getParameter(request, prefix	+ "so_iss_ofc_cd", length));
			String[] soOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "so_ofc_cty_cd", length));
			String[] soInvCostAmt = (JSPUtil.getParameter(request, prefix	+ "so_inv_cost_amt", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] soTtlCostAmt = (JSPUtil.getParameter(request, prefix	+ "so_ttl_cost_amt", length));
			String[] soPayStsFlg = (JSPUtil.getParameter(request, prefix	+ "so_pay_sts_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] woSeq = (JSPUtil.getParameter(request, prefix	+ "wo_seq", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] woOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "wo_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LsePayRntlSvcOrdVO();
				if (soCrCostAmt[i] != null)
					model.setSoCrCostAmt(soCrCostAmt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (soConvCostAmt[i] != null)
					model.setSoConvCostAmt(soConvCostAmt[i]);
				if (soSeq[i] != null)
					model.setSoSeq(soSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (soConvCrAmt[i] != null)
					model.setSoConvCrAmt(soConvCrAmt[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (soRgnHoCd[i] != null)
					model.setSoRgnHoCd(soRgnHoCd[i]);
				if (soIssYrmon[i] != null)
					model.setSoIssYrmon(soIssYrmon[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costCd[i] != null)
					model.setCostCd(costCd[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (soConvCurrCd[i] != null)
					model.setSoConvCurrCd(soConvCurrCd[i]);
				if (soConvRtAmt[i] != null)
					model.setSoConvRtAmt(soConvRtAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (soCostOfcCd[i] != null)
					model.setSoCostOfcCd(soCostOfcCd[i]);
				if (soIssOfcCd[i] != null)
					model.setSoIssOfcCd(soIssOfcCd[i]);
				if (soOfcCtyCd[i] != null)
					model.setSoOfcCtyCd(soOfcCtyCd[i]);
				if (soInvCostAmt[i] != null)
					model.setSoInvCostAmt(soInvCostAmt[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (soTtlCostAmt[i] != null)
					model.setSoTtlCostAmt(soTtlCostAmt[i]);
				if (soPayStsFlg[i] != null)
					model.setSoPayStsFlg(soPayStsFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (woSeq[i] != null)
					model.setWoSeq(woSeq[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (woOfcCtyCd[i] != null)
					model.setWoOfcCtyCd(woOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLsePayRntlSvcOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LsePayRntlSvcOrdVO[]
	 */
	public LsePayRntlSvcOrdVO[] getLsePayRntlSvcOrdVOs(){
		LsePayRntlSvcOrdVO[] vos = (LsePayRntlSvcOrdVO[])models.toArray(new LsePayRntlSvcOrdVO[models.size()]);
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
		this.soCrCostAmt = this.soCrCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soConvCostAmt = this.soConvCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soSeq = this.soSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soConvCrAmt = this.soConvCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soRgnHoCd = this.soRgnHoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soIssYrmon = this.soIssYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCd = this.costCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soConvCurrCd = this.soConvCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soConvRtAmt = this.soConvRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soCostOfcCd = this.soCostOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soIssOfcCd = this.soIssOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soOfcCtyCd = this.soOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soInvCostAmt = this.soInvCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soTtlCostAmt = this.soTtlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soPayStsFlg = this.soPayStsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woSeq = this.woSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woOfcCtyCd = this.woOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
