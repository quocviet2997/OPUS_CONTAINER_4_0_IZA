/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LsePayRntlChgVO.java
*@FileTitle : LsePayRntlChgVO
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

public class LsePayRntlChgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LsePayRntlChgVO> models = new ArrayList<LsePayRntlChgVO>();
	
	/* Column Info */
	private String convCurrCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String payLrCd = null;
	/* Column Info */
	private String pdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chgCostYrmon = null;
	/* Column Info */
	private String chgSeq = null;
	/* Column Info */
	private String aproOfcCd = null;
	/* Column Info */
	private String convTaxAmt = null;
	/* Column Info */
	private String wdpDys = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dppRtAmt = null;
	/* Column Info */
	private String wdpTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String effDt = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String dppFreeDys = null;
	/* Column Info */
	private String ifRgstNo = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String convRtAmt = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String crTtlAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pdCalcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String agmtRefNo = null;
	/* Column Info */
	private String lseInvApstsCd = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String lsePayRntlStsCd = null;
	/* Column Info */
	private String aproDt = null;
	/* Column Info */
	private String soCreDt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String ttlCostAmt = null;
	/* Column Info */
	private String payRntlCostAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String soCreUsrId = null;
	/* Column Info */
	private String soIssCostAmt = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String convCrCostAmt = null;
	/* Column Info */
	private String aproUsrId = null;
	/* Column Info */
	private String convCostAmt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String pstWdpRtTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LsePayRntlChgVO() {}

	public LsePayRntlChgVO(String ibflag, String pagerows, String agmtCtyCd, String agmtSeq, String chgSeq, String chgCostYrmon, String vndrSeq, String payLrCd, String lstmCd, String agmtRefNo, String currCd, String ttlCostAmt, String crTtlAmt, String payRntlCostAmt, String soIssCostAmt, String creOfcCd, String lsePayRntlStsCd, String diffRmk, String effDt, String expDt, String pdCd, String pdCalcCd, String dppFreeDys, String dppRtAmt, String pstWdpRtTpCd, String wdpDys, String wdpTpCd, String soCreDt, String soCreUsrId, String lseInvApstsCd, String invNo, String aproDt, String aproUsrId, String aproOfcCd, String convCostAmt, String convCurrCd, String convRtAmt, String convCrCostAmt, String convTaxAmt, String csrNo, String ifRgstNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.convCurrCd = convCurrCd;
		this.currCd = currCd;
		this.payLrCd = payLrCd;
		this.pdCd = pdCd;
		this.creDt = creDt;
		this.chgCostYrmon = chgCostYrmon;
		this.chgSeq = chgSeq;
		this.aproOfcCd = aproOfcCd;
		this.convTaxAmt = convTaxAmt;
		this.wdpDys = wdpDys;
		this.pagerows = pagerows;
		this.dppRtAmt = dppRtAmt;
		this.wdpTpCd = wdpTpCd;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.creOfcCd = creOfcCd;
		this.agmtCtyCd = agmtCtyCd;
		this.dppFreeDys = dppFreeDys;
		this.ifRgstNo = ifRgstNo;
		this.expDt = expDt;
		this.convRtAmt = convRtAmt;
		this.lstmCd = lstmCd;
		this.crTtlAmt = crTtlAmt;
		this.updUsrId = updUsrId;
		this.pdCalcCd = pdCalcCd;
		this.updDt = updDt;
		this.csrNo = csrNo;
		this.agmtRefNo = agmtRefNo;
		this.lseInvApstsCd = lseInvApstsCd;
		this.agmtSeq = agmtSeq;
		this.lsePayRntlStsCd = lsePayRntlStsCd;
		this.aproDt = aproDt;
		this.soCreDt = soCreDt;
		this.invNo = invNo;
		this.ttlCostAmt = ttlCostAmt;
		this.payRntlCostAmt = payRntlCostAmt;
		this.creUsrId = creUsrId;
		this.soCreUsrId = soCreUsrId;
		this.soIssCostAmt = soIssCostAmt;
		this.diffRmk = diffRmk;
		this.convCrCostAmt = convCrCostAmt;
		this.aproUsrId = aproUsrId;
		this.convCostAmt = convCostAmt;
		this.vndrSeq = vndrSeq;
		this.pstWdpRtTpCd = pstWdpRtTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("conv_curr_cd", getConvCurrCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("pay_lr_cd", getPayLrCd());
		this.hashColumns.put("pd_cd", getPdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chg_cost_yrmon", getChgCostYrmon());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("apro_ofc_cd", getAproOfcCd());
		this.hashColumns.put("conv_tax_amt", getConvTaxAmt());
		this.hashColumns.put("wdp_dys", getWdpDys());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dpp_rt_amt", getDppRtAmt());
		this.hashColumns.put("wdp_tp_cd", getWdpTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("dpp_free_dys", getDppFreeDys());
		this.hashColumns.put("if_rgst_no", getIfRgstNo());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("conv_rt_amt", getConvRtAmt());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("cr_ttl_amt", getCrTtlAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pd_calc_cd", getPdCalcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("agmt_ref_no", getAgmtRefNo());
		this.hashColumns.put("lse_inv_apsts_cd", getLseInvApstsCd());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("lse_pay_rntl_sts_cd", getLsePayRntlStsCd());
		this.hashColumns.put("apro_dt", getAproDt());
		this.hashColumns.put("so_cre_dt", getSoCreDt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("ttl_cost_amt", getTtlCostAmt());
		this.hashColumns.put("pay_rntl_cost_amt", getPayRntlCostAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("so_cre_usr_id", getSoCreUsrId());
		this.hashColumns.put("so_iss_cost_amt", getSoIssCostAmt());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("conv_cr_cost_amt", getConvCrCostAmt());
		this.hashColumns.put("apro_usr_id", getAproUsrId());
		this.hashColumns.put("conv_cost_amt", getConvCostAmt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("pst_wdp_rt_tp_cd", getPstWdpRtTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("conv_curr_cd", "convCurrCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("pay_lr_cd", "payLrCd");
		this.hashFields.put("pd_cd", "pdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chg_cost_yrmon", "chgCostYrmon");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("apro_ofc_cd", "aproOfcCd");
		this.hashFields.put("conv_tax_amt", "convTaxAmt");
		this.hashFields.put("wdp_dys", "wdpDys");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dpp_rt_amt", "dppRtAmt");
		this.hashFields.put("wdp_tp_cd", "wdpTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("dpp_free_dys", "dppFreeDys");
		this.hashFields.put("if_rgst_no", "ifRgstNo");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("conv_rt_amt", "convRtAmt");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("cr_ttl_amt", "crTtlAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pd_calc_cd", "pdCalcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("agmt_ref_no", "agmtRefNo");
		this.hashFields.put("lse_inv_apsts_cd", "lseInvApstsCd");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("lse_pay_rntl_sts_cd", "lsePayRntlStsCd");
		this.hashFields.put("apro_dt", "aproDt");
		this.hashFields.put("so_cre_dt", "soCreDt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("ttl_cost_amt", "ttlCostAmt");
		this.hashFields.put("pay_rntl_cost_amt", "payRntlCostAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("so_cre_usr_id", "soCreUsrId");
		this.hashFields.put("so_iss_cost_amt", "soIssCostAmt");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("conv_cr_cost_amt", "convCrCostAmt");
		this.hashFields.put("apro_usr_id", "aproUsrId");
		this.hashFields.put("conv_cost_amt", "convCostAmt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("pst_wdp_rt_tp_cd", "pstWdpRtTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return convCurrCd
	 */
	public String getConvCurrCd() {
		return this.convCurrCd;
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
	 * @return payLrCd
	 */
	public String getPayLrCd() {
		return this.payLrCd;
	}
	
	/**
	 * Column Info
	 * @return pdCd
	 */
	public String getPdCd() {
		return this.pdCd;
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
	 * @return chgCostYrmon
	 */
	public String getChgCostYrmon() {
		return this.chgCostYrmon;
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
	 * @return aproOfcCd
	 */
	public String getAproOfcCd() {
		return this.aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @return convTaxAmt
	 */
	public String getConvTaxAmt() {
		return this.convTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return wdpDys
	 */
	public String getWdpDys() {
		return this.wdpDys;
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
	 * @return dppRtAmt
	 */
	public String getDppRtAmt() {
		return this.dppRtAmt;
	}
	
	/**
	 * Column Info
	 * @return wdpTpCd
	 */
	public String getWdpTpCd() {
		return this.wdpTpCd;
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
	 * @return effDt
	 */
	public String getEffDt() {
		return this.effDt;
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
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return dppFreeDys
	 */
	public String getDppFreeDys() {
		return this.dppFreeDys;
	}
	
	/**
	 * Column Info
	 * @return ifRgstNo
	 */
	public String getIfRgstNo() {
		return this.ifRgstNo;
	}
	
	/**
	 * Column Info
	 * @return expDt
	 */
	public String getExpDt() {
		return this.expDt;
	}
	
	/**
	 * Column Info
	 * @return convRtAmt
	 */
	public String getConvRtAmt() {
		return this.convRtAmt;
	}
	
	/**
	 * Column Info
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
	}
	
	/**
	 * Column Info
	 * @return crTtlAmt
	 */
	public String getCrTtlAmt() {
		return this.crTtlAmt;
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
	 * @return pdCalcCd
	 */
	public String getPdCalcCd() {
		return this.pdCalcCd;
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
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return agmtRefNo
	 */
	public String getAgmtRefNo() {
		return this.agmtRefNo;
	}
	
	/**
	 * Column Info
	 * @return lseInvApstsCd
	 */
	public String getLseInvApstsCd() {
		return this.lseInvApstsCd;
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
	 * @return lsePayRntlStsCd
	 */
	public String getLsePayRntlStsCd() {
		return this.lsePayRntlStsCd;
	}
	
	/**
	 * Column Info
	 * @return aproDt
	 */
	public String getAproDt() {
		return this.aproDt;
	}
	
	/**
	 * Column Info
	 * @return soCreDt
	 */
	public String getSoCreDt() {
		return this.soCreDt;
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
	 * @return ttlCostAmt
	 */
	public String getTtlCostAmt() {
		return this.ttlCostAmt;
	}
	
	/**
	 * Column Info
	 * @return payRntlCostAmt
	 */
	public String getPayRntlCostAmt() {
		return this.payRntlCostAmt;
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
	 * @return soCreUsrId
	 */
	public String getSoCreUsrId() {
		return this.soCreUsrId;
	}
	
	/**
	 * Column Info
	 * @return soIssCostAmt
	 */
	public String getSoIssCostAmt() {
		return this.soIssCostAmt;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return convCrCostAmt
	 */
	public String getConvCrCostAmt() {
		return this.convCrCostAmt;
	}
	
	/**
	 * Column Info
	 * @return aproUsrId
	 */
	public String getAproUsrId() {
		return this.aproUsrId;
	}
	
	/**
	 * Column Info
	 * @return convCostAmt
	 */
	public String getConvCostAmt() {
		return this.convCostAmt;
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
	 * @return pstWdpRtTpCd
	 */
	public String getPstWdpRtTpCd() {
		return this.pstWdpRtTpCd;
	}
	

	/**
	 * Column Info
	 * @param convCurrCd
	 */
	public void setConvCurrCd(String convCurrCd) {
		this.convCurrCd = convCurrCd;
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
	 * @param payLrCd
	 */
	public void setPayLrCd(String payLrCd) {
		this.payLrCd = payLrCd;
	}
	
	/**
	 * Column Info
	 * @param pdCd
	 */
	public void setPdCd(String pdCd) {
		this.pdCd = pdCd;
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
	 * @param chgCostYrmon
	 */
	public void setChgCostYrmon(String chgCostYrmon) {
		this.chgCostYrmon = chgCostYrmon;
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
	 * @param aproOfcCd
	 */
	public void setAproOfcCd(String aproOfcCd) {
		this.aproOfcCd = aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @param convTaxAmt
	 */
	public void setConvTaxAmt(String convTaxAmt) {
		this.convTaxAmt = convTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param wdpDys
	 */
	public void setWdpDys(String wdpDys) {
		this.wdpDys = wdpDys;
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
	 * @param dppRtAmt
	 */
	public void setDppRtAmt(String dppRtAmt) {
		this.dppRtAmt = dppRtAmt;
	}
	
	/**
	 * Column Info
	 * @param wdpTpCd
	 */
	public void setWdpTpCd(String wdpTpCd) {
		this.wdpTpCd = wdpTpCd;
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
	 * @param effDt
	 */
	public void setEffDt(String effDt) {
		this.effDt = effDt;
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
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param dppFreeDys
	 */
	public void setDppFreeDys(String dppFreeDys) {
		this.dppFreeDys = dppFreeDys;
	}
	
	/**
	 * Column Info
	 * @param ifRgstNo
	 */
	public void setIfRgstNo(String ifRgstNo) {
		this.ifRgstNo = ifRgstNo;
	}
	
	/**
	 * Column Info
	 * @param expDt
	 */
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}
	
	/**
	 * Column Info
	 * @param convRtAmt
	 */
	public void setConvRtAmt(String convRtAmt) {
		this.convRtAmt = convRtAmt;
	}
	
	/**
	 * Column Info
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
	}
	
	/**
	 * Column Info
	 * @param crTtlAmt
	 */
	public void setCrTtlAmt(String crTtlAmt) {
		this.crTtlAmt = crTtlAmt;
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
	 * @param pdCalcCd
	 */
	public void setPdCalcCd(String pdCalcCd) {
		this.pdCalcCd = pdCalcCd;
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
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param agmtRefNo
	 */
	public void setAgmtRefNo(String agmtRefNo) {
		this.agmtRefNo = agmtRefNo;
	}
	
	/**
	 * Column Info
	 * @param lseInvApstsCd
	 */
	public void setLseInvApstsCd(String lseInvApstsCd) {
		this.lseInvApstsCd = lseInvApstsCd;
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
	 * @param lsePayRntlStsCd
	 */
	public void setLsePayRntlStsCd(String lsePayRntlStsCd) {
		this.lsePayRntlStsCd = lsePayRntlStsCd;
	}
	
	/**
	 * Column Info
	 * @param aproDt
	 */
	public void setAproDt(String aproDt) {
		this.aproDt = aproDt;
	}
	
	/**
	 * Column Info
	 * @param soCreDt
	 */
	public void setSoCreDt(String soCreDt) {
		this.soCreDt = soCreDt;
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
	 * @param ttlCostAmt
	 */
	public void setTtlCostAmt(String ttlCostAmt) {
		this.ttlCostAmt = ttlCostAmt;
	}
	
	/**
	 * Column Info
	 * @param payRntlCostAmt
	 */
	public void setPayRntlCostAmt(String payRntlCostAmt) {
		this.payRntlCostAmt = payRntlCostAmt;
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
	 * @param soCreUsrId
	 */
	public void setSoCreUsrId(String soCreUsrId) {
		this.soCreUsrId = soCreUsrId;
	}
	
	/**
	 * Column Info
	 * @param soIssCostAmt
	 */
	public void setSoIssCostAmt(String soIssCostAmt) {
		this.soIssCostAmt = soIssCostAmt;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param convCrCostAmt
	 */
	public void setConvCrCostAmt(String convCrCostAmt) {
		this.convCrCostAmt = convCrCostAmt;
	}
	
	/**
	 * Column Info
	 * @param aproUsrId
	 */
	public void setAproUsrId(String aproUsrId) {
		this.aproUsrId = aproUsrId;
	}
	
	/**
	 * Column Info
	 * @param convCostAmt
	 */
	public void setConvCostAmt(String convCostAmt) {
		this.convCostAmt = convCostAmt;
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
	 * @param pstWdpRtTpCd
	 */
	public void setPstWdpRtTpCd(String pstWdpRtTpCd) {
		this.pstWdpRtTpCd = pstWdpRtTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setConvCurrCd(JSPUtil.getParameter(request, "conv_curr_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setPayLrCd(JSPUtil.getParameter(request, "pay_lr_cd", ""));
		setPdCd(JSPUtil.getParameter(request, "pd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChgCostYrmon(JSPUtil.getParameter(request, "chg_cost_yrmon", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setAproOfcCd(JSPUtil.getParameter(request, "apro_ofc_cd", ""));
		setConvTaxAmt(JSPUtil.getParameter(request, "conv_tax_amt", ""));
		setWdpDys(JSPUtil.getParameter(request, "wdp_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDppRtAmt(JSPUtil.getParameter(request, "dpp_rt_amt", ""));
		setWdpTpCd(JSPUtil.getParameter(request, "wdp_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setDppFreeDys(JSPUtil.getParameter(request, "dpp_free_dys", ""));
		setIfRgstNo(JSPUtil.getParameter(request, "if_rgst_no", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setConvRtAmt(JSPUtil.getParameter(request, "conv_rt_amt", ""));
		setLstmCd(JSPUtil.getParameter(request, "lstm_cd", ""));
		setCrTtlAmt(JSPUtil.getParameter(request, "cr_ttl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPdCalcCd(JSPUtil.getParameter(request, "pd_calc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setAgmtRefNo(JSPUtil.getParameter(request, "agmt_ref_no", ""));
		setLseInvApstsCd(JSPUtil.getParameter(request, "lse_inv_apsts_cd", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setLsePayRntlStsCd(JSPUtil.getParameter(request, "lse_pay_rntl_sts_cd", ""));
		setAproDt(JSPUtil.getParameter(request, "apro_dt", ""));
		setSoCreDt(JSPUtil.getParameter(request, "so_cre_dt", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setTtlCostAmt(JSPUtil.getParameter(request, "ttl_cost_amt", ""));
		setPayRntlCostAmt(JSPUtil.getParameter(request, "pay_rntl_cost_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSoCreUsrId(JSPUtil.getParameter(request, "so_cre_usr_id", ""));
		setSoIssCostAmt(JSPUtil.getParameter(request, "so_iss_cost_amt", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setConvCrCostAmt(JSPUtil.getParameter(request, "conv_cr_cost_amt", ""));
		setAproUsrId(JSPUtil.getParameter(request, "apro_usr_id", ""));
		setConvCostAmt(JSPUtil.getParameter(request, "conv_cost_amt", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setPstWdpRtTpCd(JSPUtil.getParameter(request, "pst_wdp_rt_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LsePayRntlChgVO[]
	 */
	public LsePayRntlChgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LsePayRntlChgVO[]
	 */
	public LsePayRntlChgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LsePayRntlChgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] convCurrCd = (JSPUtil.getParameter(request, prefix	+ "conv_curr_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] payLrCd = (JSPUtil.getParameter(request, prefix	+ "pay_lr_cd", length));
			String[] pdCd = (JSPUtil.getParameter(request, prefix	+ "pd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] chgCostYrmon = (JSPUtil.getParameter(request, prefix	+ "chg_cost_yrmon", length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq", length));
			String[] aproOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_ofc_cd", length));
			String[] convTaxAmt = (JSPUtil.getParameter(request, prefix	+ "conv_tax_amt", length));
			String[] wdpDys = (JSPUtil.getParameter(request, prefix	+ "wdp_dys", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dppRtAmt = (JSPUtil.getParameter(request, prefix	+ "dpp_rt_amt", length));
			String[] wdpTpCd = (JSPUtil.getParameter(request, prefix	+ "wdp_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] dppFreeDys = (JSPUtil.getParameter(request, prefix	+ "dpp_free_dys", length));
			String[] ifRgstNo = (JSPUtil.getParameter(request, prefix	+ "if_rgst_no", length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt", length));
			String[] convRtAmt = (JSPUtil.getParameter(request, prefix	+ "conv_rt_amt", length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd", length));
			String[] crTtlAmt = (JSPUtil.getParameter(request, prefix	+ "cr_ttl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pdCalcCd = (JSPUtil.getParameter(request, prefix	+ "pd_calc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] agmtRefNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ref_no", length));
			String[] lseInvApstsCd = (JSPUtil.getParameter(request, prefix	+ "lse_inv_apsts_cd", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] lsePayRntlStsCd = (JSPUtil.getParameter(request, prefix	+ "lse_pay_rntl_sts_cd", length));
			String[] aproDt = (JSPUtil.getParameter(request, prefix	+ "apro_dt", length));
			String[] soCreDt = (JSPUtil.getParameter(request, prefix	+ "so_cre_dt", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ttlCostAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_cost_amt", length));
			String[] payRntlCostAmt = (JSPUtil.getParameter(request, prefix	+ "pay_rntl_cost_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] soCreUsrId = (JSPUtil.getParameter(request, prefix	+ "so_cre_usr_id", length));
			String[] soIssCostAmt = (JSPUtil.getParameter(request, prefix	+ "so_iss_cost_amt", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] convCrCostAmt = (JSPUtil.getParameter(request, prefix	+ "conv_cr_cost_amt", length));
			String[] aproUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_usr_id", length));
			String[] convCostAmt = (JSPUtil.getParameter(request, prefix	+ "conv_cost_amt", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] pstWdpRtTpCd = (JSPUtil.getParameter(request, prefix	+ "pst_wdp_rt_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LsePayRntlChgVO();
				if (convCurrCd[i] != null)
					model.setConvCurrCd(convCurrCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (payLrCd[i] != null)
					model.setPayLrCd(payLrCd[i]);
				if (pdCd[i] != null)
					model.setPdCd(pdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chgCostYrmon[i] != null)
					model.setChgCostYrmon(chgCostYrmon[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (aproOfcCd[i] != null)
					model.setAproOfcCd(aproOfcCd[i]);
				if (convTaxAmt[i] != null)
					model.setConvTaxAmt(convTaxAmt[i]);
				if (wdpDys[i] != null)
					model.setWdpDys(wdpDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dppRtAmt[i] != null)
					model.setDppRtAmt(dppRtAmt[i]);
				if (wdpTpCd[i] != null)
					model.setWdpTpCd(wdpTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (dppFreeDys[i] != null)
					model.setDppFreeDys(dppFreeDys[i]);
				if (ifRgstNo[i] != null)
					model.setIfRgstNo(ifRgstNo[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (convRtAmt[i] != null)
					model.setConvRtAmt(convRtAmt[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (crTtlAmt[i] != null)
					model.setCrTtlAmt(crTtlAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pdCalcCd[i] != null)
					model.setPdCalcCd(pdCalcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (agmtRefNo[i] != null)
					model.setAgmtRefNo(agmtRefNo[i]);
				if (lseInvApstsCd[i] != null)
					model.setLseInvApstsCd(lseInvApstsCd[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (lsePayRntlStsCd[i] != null)
					model.setLsePayRntlStsCd(lsePayRntlStsCd[i]);
				if (aproDt[i] != null)
					model.setAproDt(aproDt[i]);
				if (soCreDt[i] != null)
					model.setSoCreDt(soCreDt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ttlCostAmt[i] != null)
					model.setTtlCostAmt(ttlCostAmt[i]);
				if (payRntlCostAmt[i] != null)
					model.setPayRntlCostAmt(payRntlCostAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (soCreUsrId[i] != null)
					model.setSoCreUsrId(soCreUsrId[i]);
				if (soIssCostAmt[i] != null)
					model.setSoIssCostAmt(soIssCostAmt[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (convCrCostAmt[i] != null)
					model.setConvCrCostAmt(convCrCostAmt[i]);
				if (aproUsrId[i] != null)
					model.setAproUsrId(aproUsrId[i]);
				if (convCostAmt[i] != null)
					model.setConvCostAmt(convCostAmt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (pstWdpRtTpCd[i] != null)
					model.setPstWdpRtTpCd(pstWdpRtTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLsePayRntlChgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LsePayRntlChgVO[]
	 */
	public LsePayRntlChgVO[] getLsePayRntlChgVOs(){
		LsePayRntlChgVO[] vos = (LsePayRntlChgVO[])models.toArray(new LsePayRntlChgVO[models.size()]);
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
		this.convCurrCd = this.convCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLrCd = this.payLrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pdCd = this.pdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCostYrmon = this.chgCostYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproOfcCd = this.aproOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convTaxAmt = this.convTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wdpDys = this.wdpDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppRtAmt = this.dppRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wdpTpCd = this.wdpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppFreeDys = this.dppFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifRgstNo = this.ifRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convRtAmt = this.convRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crTtlAmt = this.crTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pdCalcCd = this.pdCalcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRefNo = this.agmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseInvApstsCd = this.lseInvApstsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePayRntlStsCd = this.lsePayRntlStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproDt = this.aproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soCreDt = this.soCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCostAmt = this.ttlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payRntlCostAmt = this.payRntlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soCreUsrId = this.soCreUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soIssCostAmt = this.soIssCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convCrCostAmt = this.convCrCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproUsrId = this.aproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convCostAmt = this.convCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstWdpRtTpCd = this.pstWdpRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
