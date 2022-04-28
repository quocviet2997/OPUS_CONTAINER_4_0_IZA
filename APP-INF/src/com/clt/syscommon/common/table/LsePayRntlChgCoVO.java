/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LsePayRntlChgCoVO.java
*@FileTitle : LsePayRntlChgCoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.19
*@LastModifier : 노정용
*@LastVersion : 1.0
* 2009.11.19 노정용 
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
 * @author 노정용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LsePayRntlChgCoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LsePayRntlChgCoVO> models = new ArrayList<LsePayRntlChgCoVO>();
	
	/* Column Info */
	private String offhLocCd = null;
	/* Column Info */
	private String pdRtAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lsePayChgTpCd = null;
	/* Column Info */
	private String onhDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lseCtrtNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String crAmt = null;
	/* Column Info */
	private String crNo = null;
	/* Column Info */
	private String bilDys = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String costDys = null;
	/* Column Info */
	private String offhDt = null;
	/* Column Info */
	private String dtlSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String onhLocCd = null;
	/* Column Info */
	private String ttlCostAmt = null;
	/* Column Info */
	private String coCostYrmon = null;
	/* Column Info */
	private String payImpSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String lsePayChgTpNm = null;
	/* Column Info */
	private String chgFreeDys = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LsePayRntlChgCoVO() {}

	public LsePayRntlChgCoVO(String ibflag, String pagerows, String payImpSeq, String cntrNo, String lsePayChgTpCd, String dtlSeq, String agmtCtyCd, String agmtSeq, String lseCtrtNo, String coCostYrmon, String invNo, String cntrTpszCd, String onhDt, String offhDt, String onhLocCd, String offhLocCd, String chgFreeDys, String pdRtAmt, String ttlCostAmt, String crAmt, String crNo, String costDys, String bilDys, String creUsrId, String creDt, String updUsrId, String updDt, String lsePayChgTpNm) {
		this.offhLocCd = offhLocCd;
		this.pdRtAmt = pdRtAmt;
		this.creDt = creDt;
		this.lsePayChgTpCd = lsePayChgTpCd;
		this.onhDt = onhDt;
		this.pagerows = pagerows;
		this.lseCtrtNo = lseCtrtNo;
		this.ibflag = ibflag;
		this.crAmt = crAmt;
		this.crNo = crNo;
		this.bilDys = bilDys;
		this.cntrTpszCd = cntrTpszCd;
		this.agmtCtyCd = agmtCtyCd;
		this.costDys = costDys;
		this.offhDt = offhDt;
		this.dtlSeq = dtlSeq;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.agmtSeq = agmtSeq;
		this.invNo = invNo;
		this.onhLocCd = onhLocCd;
		this.ttlCostAmt = ttlCostAmt;
		this.coCostYrmon = coCostYrmon;
		this.payImpSeq = payImpSeq;
		this.creUsrId = creUsrId;
		this.cntrNo = cntrNo;
		this.lsePayChgTpNm = lsePayChgTpNm;
		this.chgFreeDys = chgFreeDys;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("offh_loc_cd", getOffhLocCd());
		this.hashColumns.put("pd_rt_amt", getPdRtAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lse_pay_chg_tp_cd", getLsePayChgTpCd());
		this.hashColumns.put("onh_dt", getOnhDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lse_ctrt_no", getLseCtrtNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cr_amt", getCrAmt());
		this.hashColumns.put("cr_no", getCrNo());
		this.hashColumns.put("bil_dys", getBilDys());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("cost_dys", getCostDys());
		this.hashColumns.put("offh_dt", getOffhDt());
		this.hashColumns.put("dtl_seq", getDtlSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("onh_loc_cd", getOnhLocCd());
		this.hashColumns.put("ttl_cost_amt", getTtlCostAmt());
		this.hashColumns.put("co_cost_yrmon", getCoCostYrmon());
		this.hashColumns.put("pay_imp_seq", getPayImpSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("lse_pay_chg_tp_nm", getLsePayChgTpNm());
		this.hashColumns.put("chg_free_dys", getChgFreeDys());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("offh_loc_cd", "offhLocCd");
		this.hashFields.put("pd_rt_amt", "pdRtAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lse_pay_chg_tp_cd", "lsePayChgTpCd");
		this.hashFields.put("onh_dt", "onhDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lse_ctrt_no", "lseCtrtNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cr_amt", "crAmt");
		this.hashFields.put("cr_no", "crNo");
		this.hashFields.put("bil_dys", "bilDys");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("cost_dys", "costDys");
		this.hashFields.put("offh_dt", "offhDt");
		this.hashFields.put("dtl_seq", "dtlSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("onh_loc_cd", "onhLocCd");
		this.hashFields.put("ttl_cost_amt", "ttlCostAmt");
		this.hashFields.put("co_cost_yrmon", "coCostYrmon");
		this.hashFields.put("pay_imp_seq", "payImpSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("lse_pay_chg_tp_nm", "lsePayChgTpNm");
		this.hashFields.put("chg_free_dys", "chgFreeDys");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return offhLocCd
	 */
	public String getOffhLocCd() {
		return this.offhLocCd;
	}
	
	/**
	 * Column Info
	 * @return pdRtAmt
	 */
	public String getPdRtAmt() {
		return this.pdRtAmt;
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
	 * @return lsePayChgTpCd
	 */
	public String getLsePayChgTpCd() {
		return this.lsePayChgTpCd;
	}
	
	/**
	 * Column Info
	 * @return onhDt
	 */
	public String getOnhDt() {
		return this.onhDt;
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
	 * @return lseCtrtNo
	 */
	public String getLseCtrtNo() {
		return this.lseCtrtNo;
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
	 * @return crAmt
	 */
	public String getCrAmt() {
		return this.crAmt;
	}
	
	/**
	 * Column Info
	 * @return crNo
	 */
	public String getCrNo() {
		return this.crNo;
	}
	
	/**
	 * Column Info
	 * @return bilDys
	 */
	public String getBilDys() {
		return this.bilDys;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return costDys
	 */
	public String getCostDys() {
		return this.costDys;
	}
	
	/**
	 * Column Info
	 * @return offhDt
	 */
	public String getOffhDt() {
		return this.offhDt;
	}
	
	/**
	 * Column Info
	 * @return dtlSeq
	 */
	public String getDtlSeq() {
		return this.dtlSeq;
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
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
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
	 * @return onhLocCd
	 */
	public String getOnhLocCd() {
		return this.onhLocCd;
	}
	
	/**
	 * Column Info
	 * @return ttlCostAmt
	 */
	public String getTtlCostAmt() {
		return this.ttlCostAmt;
	}
	
	/**
	 * Column Info
	 * @return coCostYrmon
	 */
	public String getCoCostYrmon() {
		return this.coCostYrmon;
	}
	
	/**
	 * Column Info
	 * @return payImpSeq
	 */
	public String getPayImpSeq() {
		return this.payImpSeq;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return lsePayChgTpNm
	 */
	public String getLsePayChgTpNm() {
		return this.lsePayChgTpNm;
	}
	
	/**
	 * Column Info
	 * @return chgFreeDys
	 */
	public String getChgFreeDys() {
		return this.chgFreeDys;
	}
	

	/**
	 * Column Info
	 * @param offhLocCd
	 */
	public void setOffhLocCd(String offhLocCd) {
		this.offhLocCd = offhLocCd;
	}
	
	/**
	 * Column Info
	 * @param pdRtAmt
	 */
	public void setPdRtAmt(String pdRtAmt) {
		this.pdRtAmt = pdRtAmt;
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
	 * @param lsePayChgTpCd
	 */
	public void setLsePayChgTpCd(String lsePayChgTpCd) {
		this.lsePayChgTpCd = lsePayChgTpCd;
	}
	
	/**
	 * Column Info
	 * @param onhDt
	 */
	public void setOnhDt(String onhDt) {
		this.onhDt = onhDt;
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
	 * @param lseCtrtNo
	 */
	public void setLseCtrtNo(String lseCtrtNo) {
		this.lseCtrtNo = lseCtrtNo;
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
	 * @param crAmt
	 */
	public void setCrAmt(String crAmt) {
		this.crAmt = crAmt;
	}
	
	/**
	 * Column Info
	 * @param crNo
	 */
	public void setCrNo(String crNo) {
		this.crNo = crNo;
	}
	
	/**
	 * Column Info
	 * @param bilDys
	 */
	public void setBilDys(String bilDys) {
		this.bilDys = bilDys;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param costDys
	 */
	public void setCostDys(String costDys) {
		this.costDys = costDys;
	}
	
	/**
	 * Column Info
	 * @param offhDt
	 */
	public void setOffhDt(String offhDt) {
		this.offhDt = offhDt;
	}
	
	/**
	 * Column Info
	 * @param dtlSeq
	 */
	public void setDtlSeq(String dtlSeq) {
		this.dtlSeq = dtlSeq;
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
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
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
	 * @param onhLocCd
	 */
	public void setOnhLocCd(String onhLocCd) {
		this.onhLocCd = onhLocCd;
	}
	
	/**
	 * Column Info
	 * @param ttlCostAmt
	 */
	public void setTtlCostAmt(String ttlCostAmt) {
		this.ttlCostAmt = ttlCostAmt;
	}
	
	/**
	 * Column Info
	 * @param coCostYrmon
	 */
	public void setCoCostYrmon(String coCostYrmon) {
		this.coCostYrmon = coCostYrmon;
	}
	
	/**
	 * Column Info
	 * @param payImpSeq
	 */
	public void setPayImpSeq(String payImpSeq) {
		this.payImpSeq = payImpSeq;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param lsePayChgTpNm
	 */
	public void setLsePayChgTpNm(String lsePayChgTpNm) {
		this.lsePayChgTpNm = lsePayChgTpNm;
	}
	
	/**
	 * Column Info
	 * @param chgFreeDys
	 */
	public void setChgFreeDys(String chgFreeDys) {
		this.chgFreeDys = chgFreeDys;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setOffhLocCd(JSPUtil.getParameter(request, "offh_loc_cd", ""));
		setPdRtAmt(JSPUtil.getParameter(request, "pd_rt_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLsePayChgTpCd(JSPUtil.getParameter(request, "lse_pay_chg_tp_cd", ""));
		setOnhDt(JSPUtil.getParameter(request, "onh_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLseCtrtNo(JSPUtil.getParameter(request, "lse_ctrt_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCrAmt(JSPUtil.getParameter(request, "cr_amt", ""));
		setCrNo(JSPUtil.getParameter(request, "cr_no", ""));
		setBilDys(JSPUtil.getParameter(request, "bil_dys", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setCostDys(JSPUtil.getParameter(request, "cost_dys", ""));
		setOffhDt(JSPUtil.getParameter(request, "offh_dt", ""));
		setDtlSeq(JSPUtil.getParameter(request, "dtl_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setOnhLocCd(JSPUtil.getParameter(request, "onh_loc_cd", ""));
		setTtlCostAmt(JSPUtil.getParameter(request, "ttl_cost_amt", ""));
		setCoCostYrmon(JSPUtil.getParameter(request, "co_cost_yrmon", ""));
		setPayImpSeq(JSPUtil.getParameter(request, "pay_imp_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setLsePayChgTpNm(JSPUtil.getParameter(request, "lse_pay_chg_tp_nm", ""));
		setChgFreeDys(JSPUtil.getParameter(request, "chg_free_dys", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LsePayRntlChgCoVO[]
	 */
	public LsePayRntlChgCoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LsePayRntlChgCoVO[]
	 */
	public LsePayRntlChgCoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LsePayRntlChgCoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] offhLocCd = (JSPUtil.getParameter(request, prefix	+ "offh_loc_cd", length));
			String[] pdRtAmt = (JSPUtil.getParameter(request, prefix	+ "pd_rt_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] lsePayChgTpCd = (JSPUtil.getParameter(request, prefix	+ "lse_pay_chg_tp_cd", length));
			String[] onhDt = (JSPUtil.getParameter(request, prefix	+ "onh_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lseCtrtNo = (JSPUtil.getParameter(request, prefix	+ "lse_ctrt_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] crAmt = (JSPUtil.getParameter(request, prefix	+ "cr_amt", length));
			String[] crNo = (JSPUtil.getParameter(request, prefix	+ "cr_no", length));
			String[] bilDys = (JSPUtil.getParameter(request, prefix	+ "bil_dys", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] costDys = (JSPUtil.getParameter(request, prefix	+ "cost_dys", length));
			String[] offhDt = (JSPUtil.getParameter(request, prefix	+ "offh_dt", length));
			String[] dtlSeq = (JSPUtil.getParameter(request, prefix	+ "dtl_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] onhLocCd = (JSPUtil.getParameter(request, prefix	+ "onh_loc_cd", length));
			String[] ttlCostAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_cost_amt", length));
			String[] coCostYrmon = (JSPUtil.getParameter(request, prefix	+ "co_cost_yrmon", length));
			String[] payImpSeq = (JSPUtil.getParameter(request, prefix	+ "pay_imp_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] lsePayChgTpNm = (JSPUtil.getParameter(request, prefix	+ "lse_pay_chg_tp_nm", length));
			String[] chgFreeDys = (JSPUtil.getParameter(request, prefix	+ "chg_free_dys", length));
			
			for (int i = 0; i < length; i++) {
				model = new LsePayRntlChgCoVO();
				if (offhLocCd[i] != null)
					model.setOffhLocCd(offhLocCd[i]);
				if (pdRtAmt[i] != null)
					model.setPdRtAmt(pdRtAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lsePayChgTpCd[i] != null)
					model.setLsePayChgTpCd(lsePayChgTpCd[i]);
				if (onhDt[i] != null)
					model.setOnhDt(onhDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lseCtrtNo[i] != null)
					model.setLseCtrtNo(lseCtrtNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (crAmt[i] != null)
					model.setCrAmt(crAmt[i]);
				if (crNo[i] != null)
					model.setCrNo(crNo[i]);
				if (bilDys[i] != null)
					model.setBilDys(bilDys[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (costDys[i] != null)
					model.setCostDys(costDys[i]);
				if (offhDt[i] != null)
					model.setOffhDt(offhDt[i]);
				if (dtlSeq[i] != null)
					model.setDtlSeq(dtlSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (onhLocCd[i] != null)
					model.setOnhLocCd(onhLocCd[i]);
				if (ttlCostAmt[i] != null)
					model.setTtlCostAmt(ttlCostAmt[i]);
				if (coCostYrmon[i] != null)
					model.setCoCostYrmon(coCostYrmon[i]);
				if (payImpSeq[i] != null)
					model.setPayImpSeq(payImpSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (lsePayChgTpNm[i] != null)
					model.setLsePayChgTpNm(lsePayChgTpNm[i]);
				if (chgFreeDys[i] != null)
					model.setChgFreeDys(chgFreeDys[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLsePayRntlChgCoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LsePayRntlChgCoVO[]
	 */
	public LsePayRntlChgCoVO[] getLsePayRntlChgCoVOs(){
		LsePayRntlChgCoVO[] vos = (LsePayRntlChgCoVO[])models.toArray(new LsePayRntlChgCoVO[models.size()]);
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
		this.offhLocCd = this.offhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pdRtAmt = this.pdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePayChgTpCd = this.lsePayChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhDt = this.onhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCtrtNo = this.lseCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crAmt = this.crAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crNo = this.crNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilDys = this.bilDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costDys = this.costDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhDt = this.offhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtlSeq = this.dtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhLocCd = this.onhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCostAmt = this.ttlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCostYrmon = this.coCostYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payImpSeq = this.payImpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePayChgTpNm = this.lsePayChgTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgFreeDys = this.chgFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
