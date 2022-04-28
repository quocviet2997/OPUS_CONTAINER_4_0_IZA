/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LsePayRntlChgDtlVO.java
*@FileTitle : LsePayRntlChgDtlVO
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

public class LsePayRntlChgDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LsePayRntlChgDtlVO> models = new ArrayList<LsePayRntlChgDtlVO>();
	
	/* Column Info */
	private String offhLocCd = null;
	/* Column Info */
	private String pdRtAmt = null;
	/* Column Info */
	private String dscrRtAmt = null;
	/* Column Info */
	private String dscrOnhDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chgSeq = null;
	/* Column Info */
	private String lsePayChgTpCd = null;
	/* Column Info */
	private String onhDt = null;
	/* Column Info */
	private String dscrCostAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrAudStsCd = null;
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
	private String onhLocCd = null;
	/* Column Info */
	private String ttlCostAmt = null;
	/* Column Info */
	private String dscrRtOffhDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dscrOffhLocCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String dscrOnhLocCd = null;
	/* Column Info */
	private String chgFreeDys = null;
	
	private String prntOpCoCd = null;
	private String crntOpCoCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LsePayRntlChgDtlVO() {}

	public LsePayRntlChgDtlVO(String ibflag, String pagerows, String chgSeq, String cntrNo, String lsePayChgTpCd, String dtlSeq, String agmtCtyCd, String agmtSeq, String cntrTpszCd, String onhDt, String offhDt, String onhLocCd, String offhLocCd, String chgFreeDys, String pdRtAmt, String ttlCostAmt, String crAmt, String crNo, String cntrAudStsCd, String costDys, String bilDys, String dscrRtAmt, String dscrCostAmt, String dscrOnhDt, String dscrRtOffhDt, String dscrOnhLocCd, String dscrOffhLocCd, String creUsrId, String creDt, String updUsrId, String updDt, String prntOpCoCd, String crntOpCoCd) {
		this.offhLocCd = offhLocCd;
		this.pdRtAmt = pdRtAmt;
		this.dscrRtAmt = dscrRtAmt;
		this.dscrOnhDt = dscrOnhDt;
		this.creDt = creDt;
		this.chgSeq = chgSeq;
		this.lsePayChgTpCd = lsePayChgTpCd;
		this.onhDt = onhDt;
		this.dscrCostAmt = dscrCostAmt;
		this.pagerows = pagerows;
		this.cntrAudStsCd = cntrAudStsCd;
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
		this.onhLocCd = onhLocCd;
		this.ttlCostAmt = ttlCostAmt;
		this.dscrRtOffhDt = dscrRtOffhDt;
		this.creUsrId = creUsrId;
		this.dscrOffhLocCd = dscrOffhLocCd;
		this.cntrNo = cntrNo;
		this.dscrOnhLocCd = dscrOnhLocCd;
		this.chgFreeDys = chgFreeDys;
		this.prntOpCoCd = prntOpCoCd;
		this.crntOpCoCd = crntOpCoCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("offh_loc_cd", getOffhLocCd());
		this.hashColumns.put("pd_rt_amt", getPdRtAmt());
		this.hashColumns.put("dscr_rt_amt", getDscrRtAmt());
		this.hashColumns.put("dscr_onh_dt", getDscrOnhDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("lse_pay_chg_tp_cd", getLsePayChgTpCd());
		this.hashColumns.put("onh_dt", getOnhDt());
		this.hashColumns.put("dscr_cost_amt", getDscrCostAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_aud_sts_cd", getCntrAudStsCd());
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
		this.hashColumns.put("onh_loc_cd", getOnhLocCd());
		this.hashColumns.put("ttl_cost_amt", getTtlCostAmt());
		this.hashColumns.put("dscr_rt_offh_dt", getDscrRtOffhDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dscr_offh_loc_cd", getDscrOffhLocCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("dscr_onh_loc_cd", getDscrOnhLocCd());
		this.hashColumns.put("chg_free_dys", getChgFreeDys());
		this.hashColumns.put("prnt_op_co_cd", getPrntOpCoCd());
		this.hashColumns.put("crnt_op_co_cd", getCrntOpCoCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("offh_loc_cd", "offhLocCd");
		this.hashFields.put("pd_rt_amt", "pdRtAmt");
		this.hashFields.put("dscr_rt_amt", "dscrRtAmt");
		this.hashFields.put("dscr_onh_dt", "dscrOnhDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("lse_pay_chg_tp_cd", "lsePayChgTpCd");
		this.hashFields.put("onh_dt", "onhDt");
		this.hashFields.put("dscr_cost_amt", "dscrCostAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_aud_sts_cd", "cntrAudStsCd");
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
		this.hashFields.put("onh_loc_cd", "onhLocCd");
		this.hashFields.put("ttl_cost_amt", "ttlCostAmt");
		this.hashFields.put("dscr_rt_offh_dt", "dscrRtOffhDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dscr_offh_loc_cd", "dscrOffhLocCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("dscr_onh_loc_cd", "dscrOnhLocCd");
		this.hashFields.put("chg_free_dys", "chgFreeDys");
		this.hashFields.put("prnt_op_co_cd", "prntOpCoCd");
		this.hashFields.put("crnt_op_co_cd", "crntOpCoCd");
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
	 * @return dscrRtAmt
	 */
	public String getDscrRtAmt() {
		return this.dscrRtAmt;
	}
	
	/**
	 * Column Info
	 * @return dscrOnhDt
	 */
	public String getDscrOnhDt() {
		return this.dscrOnhDt;
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
	 * @return chgSeq
	 */
	public String getChgSeq() {
		return this.chgSeq;
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
	 * Column Info
	 * @return dscrCostAmt
	 */
	public String getDscrCostAmt() {
		return this.dscrCostAmt;
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
	 * @return cntrAudStsCd
	 */
	public String getCntrAudStsCd() {
		return this.cntrAudStsCd;
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
	 * @return dscrRtOffhDt
	 */
	public String getDscrRtOffhDt() {
		return this.dscrRtOffhDt;
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
	 * @return dscrOffhLocCd
	 */
	public String getDscrOffhLocCd() {
		return this.dscrOffhLocCd;
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
	 * @return dscrOnhLocCd
	 */
	public String getDscrOnhLocCd() {
		return this.dscrOnhLocCd;
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
	 * @param dscrRtAmt
	 */
	public void setDscrRtAmt(String dscrRtAmt) {
		this.dscrRtAmt = dscrRtAmt;
	}
	
	/**
	 * Column Info
	 * @param dscrOnhDt
	 */
	public void setDscrOnhDt(String dscrOnhDt) {
		this.dscrOnhDt = dscrOnhDt;
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
	 * @param chgSeq
	 */
	public void setChgSeq(String chgSeq) {
		this.chgSeq = chgSeq;
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
	 * Column Info
	 * @param dscrCostAmt
	 */
	public void setDscrCostAmt(String dscrCostAmt) {
		this.dscrCostAmt = dscrCostAmt;
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
	 * @param cntrAudStsCd
	 */
	public void setCntrAudStsCd(String cntrAudStsCd) {
		this.cntrAudStsCd = cntrAudStsCd;
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
	 * @param dscrRtOffhDt
	 */
	public void setDscrRtOffhDt(String dscrRtOffhDt) {
		this.dscrRtOffhDt = dscrRtOffhDt;
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
	 * @param dscrOffhLocCd
	 */
	public void setDscrOffhLocCd(String dscrOffhLocCd) {
		this.dscrOffhLocCd = dscrOffhLocCd;
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
	 * @param dscrOnhLocCd
	 */
	public void setDscrOnhLocCd(String dscrOnhLocCd) {
		this.dscrOnhLocCd = dscrOnhLocCd;
	}
	
	/**
	 * Column Info
	 * @param chgFreeDys
	 */
	public void setChgFreeDys(String chgFreeDys) {
		this.chgFreeDys = chgFreeDys;
	}
	
	public String getPrntOpCoCd() {
		return prntOpCoCd;
	}

	public void setPrntOpCoCd(String prntOpCoCd) {
		this.prntOpCoCd = prntOpCoCd;
	}

	public String getCrntOpCoCd() {
		return crntOpCoCd;
	}

	public void setCrntOpCoCd(String crntOpCoCd) {
		this.crntOpCoCd = crntOpCoCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setOffhLocCd(JSPUtil.getParameter(request, "offh_loc_cd", ""));
		setPdRtAmt(JSPUtil.getParameter(request, "pd_rt_amt", ""));
		setDscrRtAmt(JSPUtil.getParameter(request, "dscr_rt_amt", ""));
		setDscrOnhDt(JSPUtil.getParameter(request, "dscr_onh_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setLsePayChgTpCd(JSPUtil.getParameter(request, "lse_pay_chg_tp_cd", ""));
		setOnhDt(JSPUtil.getParameter(request, "onh_dt", ""));
		setDscrCostAmt(JSPUtil.getParameter(request, "dscr_cost_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrAudStsCd(JSPUtil.getParameter(request, "cntr_aud_sts_cd", ""));
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
		setOnhLocCd(JSPUtil.getParameter(request, "onh_loc_cd", ""));
		setTtlCostAmt(JSPUtil.getParameter(request, "ttl_cost_amt", ""));
		setDscrRtOffhDt(JSPUtil.getParameter(request, "dscr_rt_offh_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDscrOffhLocCd(JSPUtil.getParameter(request, "dscr_offh_loc_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setDscrOnhLocCd(JSPUtil.getParameter(request, "dscr_onh_loc_cd", ""));
		setChgFreeDys(JSPUtil.getParameter(request, "chg_free_dys", ""));
		setPrntOpCoCd(JSPUtil.getParameter(request, "prnt_op_co_cd", ""));
		setCrntOpCoCd(JSPUtil.getParameter(request, "crnt_op_co_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LsePayRntlChgDtlVO[]
	 */
	public LsePayRntlChgDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LsePayRntlChgDtlVO[]
	 */
	public LsePayRntlChgDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LsePayRntlChgDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] offhLocCd = (JSPUtil.getParameter(request, prefix	+ "offh_loc_cd", length));
			String[] pdRtAmt = (JSPUtil.getParameter(request, prefix	+ "pd_rt_amt", length));
			String[] dscrRtAmt = (JSPUtil.getParameter(request, prefix	+ "dscr_rt_amt", length));
			String[] dscrOnhDt = (JSPUtil.getParameter(request, prefix	+ "dscr_onh_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq", length));
			String[] lsePayChgTpCd = (JSPUtil.getParameter(request, prefix	+ "lse_pay_chg_tp_cd", length));
			String[] onhDt = (JSPUtil.getParameter(request, prefix	+ "onh_dt", length));
			String[] dscrCostAmt = (JSPUtil.getParameter(request, prefix	+ "dscr_cost_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrAudStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_aud_sts_cd", length));
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
			String[] onhLocCd = (JSPUtil.getParameter(request, prefix	+ "onh_loc_cd", length));
			String[] ttlCostAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_cost_amt", length));
			String[] dscrRtOffhDt = (JSPUtil.getParameter(request, prefix	+ "dscr_rt_offh_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dscrOffhLocCd = (JSPUtil.getParameter(request, prefix	+ "dscr_offh_loc_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] dscrOnhLocCd = (JSPUtil.getParameter(request, prefix	+ "dscr_onh_loc_cd", length));
			String[] chgFreeDys = (JSPUtil.getParameter(request, prefix	+ "chg_free_dys", length));
			String[] prntOpCoCd = (JSPUtil.getParameter(request, prefix	+ "prnt_op_co_cd", length));
			String[] crntOpCoCd = (JSPUtil.getParameter(request, prefix	+ "crnt_op_co_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LsePayRntlChgDtlVO();
				if (offhLocCd[i] != null)
					model.setOffhLocCd(offhLocCd[i]);
				if (pdRtAmt[i] != null)
					model.setPdRtAmt(pdRtAmt[i]);
				if (dscrRtAmt[i] != null)
					model.setDscrRtAmt(dscrRtAmt[i]);
				if (dscrOnhDt[i] != null)
					model.setDscrOnhDt(dscrOnhDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (lsePayChgTpCd[i] != null)
					model.setLsePayChgTpCd(lsePayChgTpCd[i]);
				if (onhDt[i] != null)
					model.setOnhDt(onhDt[i]);
				if (dscrCostAmt[i] != null)
					model.setDscrCostAmt(dscrCostAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrAudStsCd[i] != null)
					model.setCntrAudStsCd(cntrAudStsCd[i]);
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
				if (onhLocCd[i] != null)
					model.setOnhLocCd(onhLocCd[i]);
				if (ttlCostAmt[i] != null)
					model.setTtlCostAmt(ttlCostAmt[i]);
				if (dscrRtOffhDt[i] != null)
					model.setDscrRtOffhDt(dscrRtOffhDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dscrOffhLocCd[i] != null)
					model.setDscrOffhLocCd(dscrOffhLocCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (dscrOnhLocCd[i] != null)
					model.setDscrOnhLocCd(dscrOnhLocCd[i]);
				if (chgFreeDys[i] != null)
					model.setChgFreeDys(chgFreeDys[i]);
				if (prntOpCoCd[i] != null)
					model.setPrntOpCoCd(prntOpCoCd[i]);
				if (crntOpCoCd[i] != null)
					model.setCrntOpCoCd(crntOpCoCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLsePayRntlChgDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LsePayRntlChgDtlVO[]
	 */
	public LsePayRntlChgDtlVO[] getLsePayRntlChgDtlVOs(){
		LsePayRntlChgDtlVO[] vos = (LsePayRntlChgDtlVO[])models.toArray(new LsePayRntlChgDtlVO[models.size()]);
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
		this.offhLocCd = this.offhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pdRtAmt = this.pdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrRtAmt = this.dscrRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrOnhDt = this.dscrOnhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePayChgTpCd = this.lsePayChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhDt = this.onhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrCostAmt = this.dscrCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAudStsCd = this.cntrAudStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
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
		this.onhLocCd = this.onhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCostAmt = this.ttlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrRtOffhDt = this.dscrRtOffhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrOffhLocCd = this.dscrOffhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dscrOnhLocCd = this.dscrOnhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgFreeDys = this.chgFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntOpCoCd = this.prntOpCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntOpCoCd = this.crntOpCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
