/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmAgreementVO.java
*@FileTitle : CgmAgreementVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmAgreementVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmAgreementVO> models = new ArrayList<CgmAgreementVO>();
	
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String drpOffLmtQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String maxDpcRtAmt = null;
	/* Column Info */
	private String dppTpCd = null;
	/* Column Info */
	private String agmtLstmCd = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String drpOffLmtRto = null;
	/* Column Info */
	private String onhHndlRtAmt = null;
	/* Column Info */
	private String drpOffLmtPrdCd = null;
	/* Column Info */
	private String lstVerFlg = null;
	/* Column Info */
	private String agmtIssOfcCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String offhHndlRtAmt = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String lmsmAmt = null;
	/* Column Info */
	private String drpOffLmtTpCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String dppCvrgAmt = null;
	/* Column Info */
	private String effDt = null;
	/* Column Info */
	private String monDpcRtAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String payTermDys = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String initDpcRtAmt = null;
	/* Column Info */
	private String agmtRefNo = null;
	/* Column Info */
	private String dppRtAmt = null;
	/* Column Info */
	private String eqRntlTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmAgreementVO() {}

	public CgmAgreementVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String eqKndCd, String lstVerFlg, String agmtIssOfcCd, String agmtRefNo, String currCd, String effDt, String expDt, String vndrSeq, String payTermDys, String agmtLstmCd, String chssPoolCd, String eqRntlTpCd, String dppTpCd, String dppRtAmt, String dppCvrgAmt, String lmsmAmt, String onhHndlRtAmt, String offhHndlRtAmt, String drpOffLmtQty, String drpOffLmtTpCd, String drpOffLmtRto, String drpOffLmtPrdCd, String monDpcRtAmt, String maxDpcRtAmt, String initDpcRtAmt, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.agmtSeq = agmtSeq;
		this.drpOffLmtQty = drpOffLmtQty;
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.updDt = updDt;
		this.maxDpcRtAmt = maxDpcRtAmt;
		this.dppTpCd = dppTpCd;
		this.agmtLstmCd = agmtLstmCd;
		this.eqKndCd = eqKndCd;
		this.currCd = currCd;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.drpOffLmtRto = drpOffLmtRto;
		this.onhHndlRtAmt = onhHndlRtAmt;
		this.drpOffLmtPrdCd = drpOffLmtPrdCd;
		this.lstVerFlg = lstVerFlg;
		this.agmtIssOfcCd = agmtIssOfcCd;
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.offhHndlRtAmt = offhHndlRtAmt;
		this.expDt = expDt;
		this.lmsmAmt = lmsmAmt;
		this.drpOffLmtTpCd = drpOffLmtTpCd;
		this.diffRmk = diffRmk;
		this.dppCvrgAmt = dppCvrgAmt;
		this.effDt = effDt;
		this.monDpcRtAmt = monDpcRtAmt;
		this.creDt = creDt;
		this.payTermDys = payTermDys;
		this.creUsrId = creUsrId;
		this.initDpcRtAmt = initDpcRtAmt;
		this.agmtRefNo = agmtRefNo;
		this.dppRtAmt = dppRtAmt;
		this.eqRntlTpCd = eqRntlTpCd;
		this.pagerows = pagerows;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("drp_off_lmt_qty", getDrpOffLmtQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("max_dpc_rt_amt", getMaxDpcRtAmt());
		this.hashColumns.put("dpp_tp_cd", getDppTpCd());
		this.hashColumns.put("agmt_lstm_cd", getAgmtLstmCd());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("drp_off_lmt_rto", getDrpOffLmtRto());
		this.hashColumns.put("onh_hndl_rt_amt", getOnhHndlRtAmt());
		this.hashColumns.put("drp_off_lmt_prd_cd", getDrpOffLmtPrdCd());
		this.hashColumns.put("lst_ver_flg", getLstVerFlg());
		this.hashColumns.put("agmt_iss_ofc_cd", getAgmtIssOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("offh_hndl_rt_amt", getOffhHndlRtAmt());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("lmsm_amt", getLmsmAmt());
		this.hashColumns.put("drp_off_lmt_tp_cd", getDrpOffLmtTpCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("dpp_cvrg_amt", getDppCvrgAmt());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("mon_dpc_rt_amt", getMonDpcRtAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pay_term_dys", getPayTermDys());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("init_dpc_rt_amt", getInitDpcRtAmt());
		this.hashColumns.put("agmt_ref_no", getAgmtRefNo());
		this.hashColumns.put("dpp_rt_amt", getDppRtAmt());
		this.hashColumns.put("eq_rntl_tp_cd", getEqRntlTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("drp_off_lmt_qty", "drpOffLmtQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("max_dpc_rt_amt", "maxDpcRtAmt");
		this.hashFields.put("dpp_tp_cd", "dppTpCd");
		this.hashFields.put("agmt_lstm_cd", "agmtLstmCd");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("drp_off_lmt_rto", "drpOffLmtRto");
		this.hashFields.put("onh_hndl_rt_amt", "onhHndlRtAmt");
		this.hashFields.put("drp_off_lmt_prd_cd", "drpOffLmtPrdCd");
		this.hashFields.put("lst_ver_flg", "lstVerFlg");
		this.hashFields.put("agmt_iss_ofc_cd", "agmtIssOfcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("offh_hndl_rt_amt", "offhHndlRtAmt");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("lmsm_amt", "lmsmAmt");
		this.hashFields.put("drp_off_lmt_tp_cd", "drpOffLmtTpCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("dpp_cvrg_amt", "dppCvrgAmt");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("mon_dpc_rt_amt", "monDpcRtAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pay_term_dys", "payTermDys");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("init_dpc_rt_amt", "initDpcRtAmt");
		this.hashFields.put("agmt_ref_no", "agmtRefNo");
		this.hashFields.put("dpp_rt_amt", "dppRtAmt");
		this.hashFields.put("eq_rntl_tp_cd", "eqRntlTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getDrpOffLmtQty() {
		return this.drpOffLmtQty;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getMaxDpcRtAmt() {
		return this.maxDpcRtAmt;
	}
	public String getDppTpCd() {
		return this.dppTpCd;
	}
	public String getAgmtLstmCd() {
		return this.agmtLstmCd;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getDrpOffLmtRto() {
		return this.drpOffLmtRto;
	}
	public String getOnhHndlRtAmt() {
		return this.onhHndlRtAmt;
	}
	public String getDrpOffLmtPrdCd() {
		return this.drpOffLmtPrdCd;
	}
	public String getLstVerFlg() {
		return this.lstVerFlg;
	}
	public String getAgmtIssOfcCd() {
		return this.agmtIssOfcCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getOffhHndlRtAmt() {
		return this.offhHndlRtAmt;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getLmsmAmt() {
		return this.lmsmAmt;
	}
	public String getDrpOffLmtTpCd() {
		return this.drpOffLmtTpCd;
	}
	public String getDiffRmk() {
		return this.diffRmk;
	}
	public String getDppCvrgAmt() {
		return this.dppCvrgAmt;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getMonDpcRtAmt() {
		return this.monDpcRtAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getPayTermDys() {
		return this.payTermDys;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getInitDpcRtAmt() {
		return this.initDpcRtAmt;
	}
	public String getAgmtRefNo() {
		return this.agmtRefNo;
	}
	public String getDppRtAmt() {
		return this.dppRtAmt;
	}
	public String getEqRntlTpCd() {
		return this.eqRntlTpCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setDrpOffLmtQty(String drpOffLmtQty) {
		this.drpOffLmtQty = drpOffLmtQty;
		//this.drpOffLmtQty=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setMaxDpcRtAmt(String maxDpcRtAmt) {
		this.maxDpcRtAmt = maxDpcRtAmt;
		//this.maxDpcRtAmt=true;
	}
	public void setDppTpCd(String dppTpCd) {
		this.dppTpCd = dppTpCd;
		//this.dppTpCd=true;
	}
	public void setAgmtLstmCd(String agmtLstmCd) {
		this.agmtLstmCd = agmtLstmCd;
		//this.agmtLstmCd=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setDrpOffLmtRto(String drpOffLmtRto) {
		this.drpOffLmtRto = drpOffLmtRto;
		//this.drpOffLmtRto=true;
	}
	public void setOnhHndlRtAmt(String onhHndlRtAmt) {
		this.onhHndlRtAmt = onhHndlRtAmt;
		//this.onhHndlRtAmt=true;
	}
	public void setDrpOffLmtPrdCd(String drpOffLmtPrdCd) {
		this.drpOffLmtPrdCd = drpOffLmtPrdCd;
		//this.drpOffLmtPrdCd=true;
	}
	public void setLstVerFlg(String lstVerFlg) {
		this.lstVerFlg = lstVerFlg;
		//this.lstVerFlg=true;
	}
	public void setAgmtIssOfcCd(String agmtIssOfcCd) {
		this.agmtIssOfcCd = agmtIssOfcCd;
		//this.agmtIssOfcCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setOffhHndlRtAmt(String offhHndlRtAmt) {
		this.offhHndlRtAmt = offhHndlRtAmt;
		//this.offhHndlRtAmt=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setLmsmAmt(String lmsmAmt) {
		this.lmsmAmt = lmsmAmt;
		//this.lmsmAmt=true;
	}
	public void setDrpOffLmtTpCd(String drpOffLmtTpCd) {
		this.drpOffLmtTpCd = drpOffLmtTpCd;
		//this.drpOffLmtTpCd=true;
	}
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
		//this.diffRmk=true;
	}
	public void setDppCvrgAmt(String dppCvrgAmt) {
		this.dppCvrgAmt = dppCvrgAmt;
		//this.dppCvrgAmt=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setMonDpcRtAmt(String monDpcRtAmt) {
		this.monDpcRtAmt = monDpcRtAmt;
		//this.monDpcRtAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setPayTermDys(String payTermDys) {
		this.payTermDys = payTermDys;
		//this.payTermDys=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setInitDpcRtAmt(String initDpcRtAmt) {
		this.initDpcRtAmt = initDpcRtAmt;
		//this.initDpcRtAmt=true;
	}
	public void setAgmtRefNo(String agmtRefNo) {
		this.agmtRefNo = agmtRefNo;
		//this.agmtRefNo=true;
	}
	public void setDppRtAmt(String dppRtAmt) {
		this.dppRtAmt = dppRtAmt;
		//this.dppRtAmt=true;
	}
	public void setEqRntlTpCd(String eqRntlTpCd) {
		this.eqRntlTpCd = eqRntlTpCd;
		//this.eqRntlTpCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setDrpOffLmtQty(JSPUtil.getParameter(request, "drp_off_lmt_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMaxDpcRtAmt(JSPUtil.getParameter(request, "max_dpc_rt_amt", ""));
		setDppTpCd(JSPUtil.getParameter(request, "dpp_tp_cd", ""));
		setAgmtLstmCd(JSPUtil.getParameter(request, "agmt_lstm_cd", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setDrpOffLmtRto(JSPUtil.getParameter(request, "drp_off_lmt_rto", ""));
		setOnhHndlRtAmt(JSPUtil.getParameter(request, "onh_hndl_rt_amt", ""));
		setDrpOffLmtPrdCd(JSPUtil.getParameter(request, "drp_off_lmt_prd_cd", ""));
		setLstVerFlg(JSPUtil.getParameter(request, "lst_ver_flg", ""));
		setAgmtIssOfcCd(JSPUtil.getParameter(request, "agmt_iss_ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setOffhHndlRtAmt(JSPUtil.getParameter(request, "offh_hndl_rt_amt", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setLmsmAmt(JSPUtil.getParameter(request, "lmsm_amt", ""));
		setDrpOffLmtTpCd(JSPUtil.getParameter(request, "drp_off_lmt_tp_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setDppCvrgAmt(JSPUtil.getParameter(request, "dpp_cvrg_amt", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setMonDpcRtAmt(JSPUtil.getParameter(request, "mon_dpc_rt_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPayTermDys(JSPUtil.getParameter(request, "pay_term_dys", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setInitDpcRtAmt(JSPUtil.getParameter(request, "init_dpc_rt_amt", ""));
		setAgmtRefNo(JSPUtil.getParameter(request, "agmt_ref_no", ""));
		setDppRtAmt(JSPUtil.getParameter(request, "dpp_rt_amt", ""));
		setEqRntlTpCd(JSPUtil.getParameter(request, "eq_rntl_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmAgreementVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmAgreementVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmAgreementVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] drpOffLmtQty = (JSPUtil.getParameter(request, prefix	+ "drp_off_lmt_qty".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] maxDpcRtAmt = (JSPUtil.getParameter(request, prefix	+ "max_dpc_rt_amt".trim(), length));
			String[] dppTpCd = (JSPUtil.getParameter(request, prefix	+ "dpp_tp_cd".trim(), length));
			String[] agmtLstmCd = (JSPUtil.getParameter(request, prefix	+ "agmt_lstm_cd".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] drpOffLmtRto = (JSPUtil.getParameter(request, prefix	+ "drp_off_lmt_rto".trim(), length));
			String[] onhHndlRtAmt = (JSPUtil.getParameter(request, prefix	+ "onh_hndl_rt_amt".trim(), length));
			String[] drpOffLmtPrdCd = (JSPUtil.getParameter(request, prefix	+ "drp_off_lmt_prd_cd".trim(), length));
			String[] lstVerFlg = (JSPUtil.getParameter(request, prefix	+ "lst_ver_flg".trim(), length));
			String[] agmtIssOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_iss_ofc_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] offhHndlRtAmt = (JSPUtil.getParameter(request, prefix	+ "offh_hndl_rt_amt".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] lmsmAmt = (JSPUtil.getParameter(request, prefix	+ "lmsm_amt".trim(), length));
			String[] drpOffLmtTpCd = (JSPUtil.getParameter(request, prefix	+ "drp_off_lmt_tp_cd".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] dppCvrgAmt = (JSPUtil.getParameter(request, prefix	+ "dpp_cvrg_amt".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] monDpcRtAmt = (JSPUtil.getParameter(request, prefix	+ "mon_dpc_rt_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] payTermDys = (JSPUtil.getParameter(request, prefix	+ "pay_term_dys".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] initDpcRtAmt = (JSPUtil.getParameter(request, prefix	+ "init_dpc_rt_amt".trim(), length));
			String[] agmtRefNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ref_no".trim(), length));
			String[] dppRtAmt = (JSPUtil.getParameter(request, prefix	+ "dpp_rt_amt".trim(), length));
			String[] eqRntlTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_rntl_tp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmAgreementVO();
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (drpOffLmtQty[i] != null)
					model.setDrpOffLmtQty(drpOffLmtQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (maxDpcRtAmt[i] != null)
					model.setMaxDpcRtAmt(maxDpcRtAmt[i]);
				if (dppTpCd[i] != null)
					model.setDppTpCd(dppTpCd[i]);
				if (agmtLstmCd[i] != null)
					model.setAgmtLstmCd(agmtLstmCd[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (drpOffLmtRto[i] != null)
					model.setDrpOffLmtRto(drpOffLmtRto[i]);
				if (onhHndlRtAmt[i] != null)
					model.setOnhHndlRtAmt(onhHndlRtAmt[i]);
				if (drpOffLmtPrdCd[i] != null)
					model.setDrpOffLmtPrdCd(drpOffLmtPrdCd[i]);
				if (lstVerFlg[i] != null)
					model.setLstVerFlg(lstVerFlg[i]);
				if (agmtIssOfcCd[i] != null)
					model.setAgmtIssOfcCd(agmtIssOfcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (offhHndlRtAmt[i] != null)
					model.setOffhHndlRtAmt(offhHndlRtAmt[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (lmsmAmt[i] != null)
					model.setLmsmAmt(lmsmAmt[i]);
				if (drpOffLmtTpCd[i] != null)
					model.setDrpOffLmtTpCd(drpOffLmtTpCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (dppCvrgAmt[i] != null)
					model.setDppCvrgAmt(dppCvrgAmt[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (monDpcRtAmt[i] != null)
					model.setMonDpcRtAmt(monDpcRtAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (payTermDys[i] != null)
					model.setPayTermDys(payTermDys[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (initDpcRtAmt[i] != null)
					model.setInitDpcRtAmt(initDpcRtAmt[i]);
				if (agmtRefNo[i] != null)
					model.setAgmtRefNo(agmtRefNo[i]);
				if (dppRtAmt[i] != null)
					model.setDppRtAmt(dppRtAmt[i]);
				if (eqRntlTpCd[i] != null)
					model.setEqRntlTpCd(eqRntlTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmAgreementVOs();
	}

	public CgmAgreementVO[] getCgmAgreementVOs(){
		CgmAgreementVO[] vos = (CgmAgreementVO[])models.toArray(new CgmAgreementVO[models.size()]);
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
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpOffLmtQty = this.drpOffLmtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxDpcRtAmt = this.maxDpcRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppTpCd = this.dppTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtLstmCd = this.agmtLstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpOffLmtRto = this.drpOffLmtRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhHndlRtAmt = this.onhHndlRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpOffLmtPrdCd = this.drpOffLmtPrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstVerFlg = this.lstVerFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtIssOfcCd = this.agmtIssOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhHndlRtAmt = this.offhHndlRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lmsmAmt = this.lmsmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpOffLmtTpCd = this.drpOffLmtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppCvrgAmt = this.dppCvrgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.monDpcRtAmt = this.monDpcRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermDys = this.payTermDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initDpcRtAmt = this.initDpcRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRefNo = this.agmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppRtAmt = this.dppRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRntlTpCd = this.eqRntlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
