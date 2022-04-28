/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsInvDtlVO.java
*@FileTitle : FmsInvDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.20  
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
 * @author 
 * @since J2EE 1.5
 */

public class FmsInvDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsInvDtlVO> models = new ArrayList<FmsInvDtlVO>();
	
	/* Column Inpo */
	private String vslCd = null;
	/* Column Inpo */
	private String slpFuncCd = null;
	/* Column Inpo */
	private String currCd = null;
	/* Column Inpo */
	private String toIfNo = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String invSeq = null;
	/* Column Inpo */
	private String fletIssTpCd = null;
	/* Column Inpo */
	private String fletCurrChkCd = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String revDirCd = null;
	/* Column Inpo */
	private String effDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String invDesc = null;
	/* Column Inpo */
	private String slpTeamCd = null;
	/* Column Inpo */
	private String acctCd = null;
	/* Column Inpo */
	private String brogAcctFlg = null;
	/* Column Inpo */
	private String slpTpCd = null;
	/* Column Inpo */
	private String invAmt = null;
	/* Column Inpo */
	private String invUsdDys = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String chtrInvDt = null;
	/* Column Inpo */
	private String skdVoyNo = null;
	/* Column Inpo */
	private String slpIssDt = null;
	/* Column Inpo */
	private String skdDirCd = null;
	/* Column Inpo */
	private String acctItmSeq = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String toYrmon = null;
	/* Column Inpo */
	private String invDtlSeq = null;
	/* Column Inpo */
	private String toInvNo = null;
	/* Column Inpo */
	private String slpSerNo = null;
	/* Column Inpo */
	private String sdmsNo = null;
	
	/* Column Inpo */
	private String currCd2 = null;
	
	/* Column Inpo */
	private String invAmt2 = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsInvDtlVO() {}

	public FmsInvDtlVO(String ibflag, String pagerows, String fletCtrtNo, String fletIssTpCd, String invSeq, String invDtlSeq, String acctCd, String acctItmSeq, String effDt, String expDt, String invUsdDys, String currCd, String invAmt, String chtrInvDt, String invDesc, String toYrmon, String toInvNo, String toIfNo, String brogAcctFlg, String fletCurrChkCd, String sdmsNo, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String slpTpCd, String slpFuncCd, String slpTeamCd, String slpIssDt, String slpSerNo, String creUsrId, String creDt, String updUsrId, String updDt, String currCd2, String invAmt2) {
		this.vslCd = vslCd;
		this.slpFuncCd = slpFuncCd;
		this.currCd = currCd;
		this.toIfNo = toIfNo;
		this.creDt = creDt;
		this.invSeq = invSeq;
		this.fletIssTpCd = fletIssTpCd;
		this.fletCurrChkCd = fletCurrChkCd;
		this.fletCtrtNo = fletCtrtNo;
		this.pagerows = pagerows;
		this.revDirCd = revDirCd;
		this.effDt = effDt;
		this.ibflag = ibflag;
		this.invDesc = invDesc;
		this.slpTeamCd = slpTeamCd;
		this.acctCd = acctCd;
		this.brogAcctFlg = brogAcctFlg;
		this.slpTpCd = slpTpCd;
		this.invAmt = invAmt;
		this.invUsdDys = invUsdDys;
		this.expDt = expDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.chtrInvDt = chtrInvDt;
		this.skdVoyNo = skdVoyNo;
		this.slpIssDt = slpIssDt;
		this.skdDirCd = skdDirCd;
		this.acctItmSeq = acctItmSeq;
		this.creUsrId = creUsrId;
		this.toYrmon = toYrmon;
		this.invDtlSeq = invDtlSeq;
		this.toInvNo = toInvNo;
		this.slpSerNo = slpSerNo;
		this.sdmsNo = sdmsNo;
		
		this.currCd2 = currCd2;
		this.invAmt2 = invAmt2;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("slp_func_cd", getSlpFuncCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("to_if_no", getToIfNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_seq", getInvSeq());
		this.hashColumns.put("flet_iss_tp_cd", getFletIssTpCd());
		this.hashColumns.put("flet_curr_chk_cd", getFletCurrChkCd());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_desc", getInvDesc());
		this.hashColumns.put("slp_team_cd", getSlpTeamCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("brog_acct_flg", getBrogAcctFlg());
		this.hashColumns.put("slp_tp_cd", getSlpTpCd());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("inv_usd_dys", getInvUsdDys());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("chtr_inv_dt", getChtrInvDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("slp_iss_dt", getSlpIssDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("acct_itm_seq", getAcctItmSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("to_yrmon", getToYrmon());
		this.hashColumns.put("inv_dtl_seq", getInvDtlSeq());
		this.hashColumns.put("to_inv_no", getToInvNo());
		this.hashColumns.put("slp_ser_no", getSlpSerNo());
		this.hashColumns.put("sdms_no", getSdmsNo());
		
		this.hashColumns.put("curr_cd2", getCurrCd2());
		this.hashColumns.put("inv_amt2", getInvAmt2());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("slp_func_cd", "slpFuncCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("to_if_no", "toIfNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_seq", "invSeq");
		this.hashFields.put("flet_iss_tp_cd", "fletIssTpCd");
		this.hashFields.put("flet_curr_chk_cd", "fletCurrChkCd");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_desc", "invDesc");
		this.hashFields.put("slp_team_cd", "slpTeamCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("brog_acct_flg", "brogAcctFlg");
		this.hashFields.put("slp_tp_cd", "slpTpCd");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("inv_usd_dys", "invUsdDys");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("chtr_inv_dt", "chtrInvDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("slp_iss_dt", "slpIssDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("acct_itm_seq", "acctItmSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("to_yrmon", "toYrmon");
		this.hashFields.put("inv_dtl_seq", "invDtlSeq");
		this.hashFields.put("to_inv_no", "toInvNo");
		this.hashFields.put("slp_ser_no", "slpSerNo");
		this.hashFields.put("sdms_no", "sdmsNo");
		
		this.hashFields.put("curr_cd2", "currCd2");
		this.hashFields.put("inv_amt2", "invAmt2");
		
		return this.hashFields;
	}
	
	public String getVslCd() {
		return this.vslCd;
	}
	public String getSlpFuncCd() {
		return this.slpFuncCd;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getToIfNo() {
		return this.toIfNo;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getInvSeq() {
		return this.invSeq;
	}
	public String getFletIssTpCd() {
		return this.fletIssTpCd;
	}
	public String getFletCurrChkCd() {
		return this.fletCurrChkCd;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getRevDirCd() {
		return this.revDirCd;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getInvDesc() {
		return this.invDesc;
	}
	public String getSlpTeamCd() {
		return this.slpTeamCd;
	}
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getBrogAcctFlg() {
		return this.brogAcctFlg;
	}
	public String getSlpTpCd() {
		return this.slpTpCd;
	}
	public String getInvAmt() {
		return this.invAmt;
	}
	public String getInvUsdDys() {
		return this.invUsdDys;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getChtrInvDt() {
		return this.chtrInvDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getSlpIssDt() {
		return this.slpIssDt;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getAcctItmSeq() {
		return this.acctItmSeq;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getToYrmon() {
		return this.toYrmon;
	}
	public String getInvDtlSeq() {
		return this.invDtlSeq;
	}
	public String getToInvNo() {
		return this.toInvNo;
	}
	public String getSlpSerNo() {
		return this.slpSerNo;
	}
	public String getSdmsNo() {
		return this.sdmsNo;
	}
	
	public String getCurrCd2() {
		return this.currCd2;
	}
	
	public String getInvAmt2() {
		return this.invAmt2;
	}

	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setSlpFuncCd(String slpFuncCd) {
		this.slpFuncCd = slpFuncCd;
		//this.slpFuncCd=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setToIfNo(String toIfNo) {
		this.toIfNo = toIfNo;
		//this.toIfNo=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setInvSeq(String invSeq) {
		this.invSeq = invSeq;
		//this.invSeq=true;
	}
	public void setFletIssTpCd(String fletIssTpCd) {
		this.fletIssTpCd = fletIssTpCd;
		//this.fletIssTpCd=true;
	}
	public void setFletCurrChkCd(String fletCurrChkCd) {
		this.fletCurrChkCd = fletCurrChkCd;
		//this.fletCurrChkCd=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
		//this.revDirCd=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
		//this.invDesc=true;
	}
	public void setSlpTeamCd(String slpTeamCd) {
		this.slpTeamCd = slpTeamCd;
		//this.slpTeamCd=true;
	}
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setBrogAcctFlg(String brogAcctFlg) {
		this.brogAcctFlg = brogAcctFlg;
		//this.brogAcctFlg=true;
	}
	public void setSlpTpCd(String slpTpCd) {
		this.slpTpCd = slpTpCd;
		//this.slpTpCd=true;
	}
	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
		//this.invAmt=true;
	}
	public void setInvUsdDys(String invUsdDys) {
		this.invUsdDys = invUsdDys;
		//this.invUsdDys=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setChtrInvDt(String chtrInvDt) {
		this.chtrInvDt = chtrInvDt;
		//this.chtrInvDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setSlpIssDt(String slpIssDt) {
		this.slpIssDt = slpIssDt;
		//this.slpIssDt=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setAcctItmSeq(String acctItmSeq) {
		this.acctItmSeq = acctItmSeq;
		//this.acctItmSeq=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setToYrmon(String toYrmon) {
		this.toYrmon = toYrmon;
		//this.toYrmon=true;
	}
	public void setInvDtlSeq(String invDtlSeq) {
		this.invDtlSeq = invDtlSeq;
		//this.invDtlSeq=true;
	}
	public void setToInvNo(String toInvNo) {
		this.toInvNo = toInvNo;
		//this.toInvNo=true;
	}
	public void setSlpSerNo(String slpSerNo) {
		this.slpSerNo = slpSerNo;
		//this.slpSerNo=true;
	}
	public void setSdmsNo(String sdmsNo) {
		this.sdmsNo = sdmsNo;
		//this.sdmsNo=true;
	}
	
	public void setCurrCd2(String currCd2) {
		this.currCd2 = currCd2;
		//this.currCd=true;
	}
	
	public void setInvAmt2(String invAmt2) {
		this.invAmt2 = invAmt2;
		//this.invAmt=true;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setSlpFuncCd(JSPUtil.getParameter(request, "slp_func_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setToIfNo(JSPUtil.getParameter(request, "to_if_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvSeq(JSPUtil.getParameter(request, "inv_seq", ""));
		setFletIssTpCd(JSPUtil.getParameter(request, "flet_iss_tp_cd", ""));
		setFletCurrChkCd(JSPUtil.getParameter(request, "flet_curr_chk_cd", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInvDesc(JSPUtil.getParameter(request, "inv_desc", ""));
		setSlpTeamCd(JSPUtil.getParameter(request, "slp_team_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setBrogAcctFlg(JSPUtil.getParameter(request, "brog_acct_flg", ""));
		setSlpTpCd(JSPUtil.getParameter(request, "slp_tp_cd", ""));
		setInvAmt(JSPUtil.getParameter(request, "inv_amt", ""));
		setInvUsdDys(JSPUtil.getParameter(request, "inv_usd_dys", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setChtrInvDt(JSPUtil.getParameter(request, "chtr_inv_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setSlpIssDt(JSPUtil.getParameter(request, "slp_iss_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setAcctItmSeq(JSPUtil.getParameter(request, "acct_itm_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setToYrmon(JSPUtil.getParameter(request, "to_yrmon", ""));
		setInvDtlSeq(JSPUtil.getParameter(request, "inv_dtl_seq", ""));
		setToInvNo(JSPUtil.getParameter(request, "to_inv_no", ""));
		setSlpSerNo(JSPUtil.getParameter(request, "slp_ser_no", ""));
		setSdmsNo(JSPUtil.getParameter(request, "sdms_no", ""));
		
		setCurrCd2(JSPUtil.getParameter(request, "curr_cd2", ""));
		setInvAmt2(JSPUtil.getParameter(request, "inv_amt2", ""));
	}

	public FmsInvDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsInvDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsInvDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] slpFuncCd = (JSPUtil.getParameter(request, prefix	+ "slp_func_cd".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] toIfNo = (JSPUtil.getParameter(request, prefix	+ "to_if_no".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] invSeq = (JSPUtil.getParameter(request, prefix	+ "inv_seq".trim(), length));
			String[] fletIssTpCd = (JSPUtil.getParameter(request, prefix	+ "flet_iss_tp_cd".trim(), length));
			String[] fletCurrChkCd = (JSPUtil.getParameter(request, prefix	+ "flet_curr_chk_cd".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] invDesc = (JSPUtil.getParameter(request, prefix	+ "inv_desc".trim(), length));
			String[] slpTeamCd = (JSPUtil.getParameter(request, prefix	+ "slp_team_cd".trim(), length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] brogAcctFlg = (JSPUtil.getParameter(request, prefix	+ "brog_acct_flg".trim(), length));
			String[] slpTpCd = (JSPUtil.getParameter(request, prefix	+ "slp_tp_cd".trim(), length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt".trim(), length));
			String[] invUsdDys = (JSPUtil.getParameter(request, prefix	+ "inv_usd_dys".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] chtrInvDt = (JSPUtil.getParameter(request, prefix	+ "chtr_inv_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] slpIssDt = (JSPUtil.getParameter(request, prefix	+ "slp_iss_dt".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] acctItmSeq = (JSPUtil.getParameter(request, prefix	+ "acct_itm_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] toYrmon = (JSPUtil.getParameter(request, prefix	+ "to_yrmon".trim(), length));
			String[] invDtlSeq = (JSPUtil.getParameter(request, prefix	+ "inv_dtl_seq".trim(), length));
			String[] toInvNo = (JSPUtil.getParameter(request, prefix	+ "to_inv_no".trim(), length));
			String[] slpSerNo = (JSPUtil.getParameter(request, prefix	+ "slp_ser_no".trim(), length));
			String[] sdmsNo = (JSPUtil.getParameter(request, prefix	+ "sdms_no".trim(), length));
			
			String[] currCd2 = (JSPUtil.getParameter(request, prefix	+ "curr_cd2".trim(), length));
			String[] invAmt2 = (JSPUtil.getParameter(request, prefix	+ "inv_amt2".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsInvDtlVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (slpFuncCd[i] != null)
					model.setSlpFuncCd(slpFuncCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (toIfNo[i] != null)
					model.setToIfNo(toIfNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invSeq[i] != null)
					model.setInvSeq(invSeq[i]);
				if (fletIssTpCd[i] != null)
					model.setFletIssTpCd(fletIssTpCd[i]);
				if (fletCurrChkCd[i] != null)
					model.setFletCurrChkCd(fletCurrChkCd[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invDesc[i] != null)
					model.setInvDesc(invDesc[i]);
				if (slpTeamCd[i] != null)
					model.setSlpTeamCd(slpTeamCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (brogAcctFlg[i] != null)
					model.setBrogAcctFlg(brogAcctFlg[i]);
				if (slpTpCd[i] != null)
					model.setSlpTpCd(slpTpCd[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (invUsdDys[i] != null)
					model.setInvUsdDys(invUsdDys[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (chtrInvDt[i] != null)
					model.setChtrInvDt(chtrInvDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (slpIssDt[i] != null)
					model.setSlpIssDt(slpIssDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (acctItmSeq[i] != null)
					model.setAcctItmSeq(acctItmSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (toYrmon[i] != null)
					model.setToYrmon(toYrmon[i]);
				if (invDtlSeq[i] != null)
					model.setInvDtlSeq(invDtlSeq[i]);
				if (toInvNo[i] != null)
					model.setToInvNo(toInvNo[i]);
				if (slpSerNo[i] != null)
					model.setSlpSerNo(slpSerNo[i]);
				if (sdmsNo[i] != null)
					model.setSdmsNo(sdmsNo[i]);
				
				if (currCd2[i] != null)
					model.setCurrCd2(currCd2[i]);
				
				if (invAmt2[i] != null)
					model.setInvAmt2(invAmt2[i]);
				
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsInvDtlVOs();
	}

	public FmsInvDtlVO[] getFmsInvDtlVOs(){
		FmsInvDtlVO[] vos = (FmsInvDtlVO[])models.toArray(new FmsInvDtlVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpFuncCd = this.slpFuncCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toIfNo = this.toIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSeq = this.invSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletIssTpCd = this.fletIssTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletCurrChkCd = this.fletCurrChkCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletCtrtNo = this.fletCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDesc = this.invDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTeamCd = this.slpTeamCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogAcctFlg = this.brogAcctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTpCd = this.slpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invUsdDys = this.invUsdDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chtrInvDt = this.chtrInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpIssDt = this.slpIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctItmSeq = this.acctItmSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toYrmon = this.toYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDtlSeq = this.invDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toInvNo = this.toInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpSerNo = this.slpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sdmsNo = this.sdmsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
