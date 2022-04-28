/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmPayInvVO.java
*@FileTitle : CgmPayInvVO
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

public class CgmPayInvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmPayInvVO> models = new ArrayList<CgmPayInvVO>();
	
	/* Column Info */
	private String invDt = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String revSkdDirCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String issOfcCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String poolMaxRtAmt = null;
	/* Column Info */
	private String invUsrId = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String revSkdVoyNo = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String chssMgstInvKndCd = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String poolMinRtAmt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String apIfFlg = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String payInvSeq = null;
	/* Column Info */
	private String invSmryAmt = null;
	/* Column Info */
	private String revDirCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String revVslCd = null;
	/* Column Info */
	private String chssMgstInvStsCd = null;
	/* Column Info */
	private String chgSmryAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String invTaxRt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invTaxCltTpCd = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmPayInvVO() {}

	public CgmPayInvVO(String ibflag, String pagerows, String payInvSeq, String invNo, String eqKndCd, String chssMgstInvKndCd, String chssMgstInvStsCd, String vndrSeq, String currCd, String costYrmon, String costOfcCd, String issOfcCd, String revVslCd, String revSkdVoyNo, String revSkdDirCd, String revDirCd, String chssPoolCd, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String poolMaxRtAmt, String poolMinRtAmt, String chgSmryAmt, String invTaxCltTpCd, String invTaxRt, String invSmryAmt, String invDt, String invUsrId, String diffRmk, String apIfFlg, String csrNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.invDt = invDt;
		this.costYrmon = costYrmon;
		this.agmtSeq = agmtSeq;
		this.csrNo = csrNo;
		this.revSkdDirCd = revSkdDirCd;
		this.invNo = invNo;
		this.issOfcCd = issOfcCd;
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.updDt = updDt;
		this.poolMaxRtAmt = poolMaxRtAmt;
		this.invUsrId = invUsrId;
		this.eqKndCd = eqKndCd;
		this.revSkdVoyNo = revSkdVoyNo;
		this.currCd = currCd;
		this.chssMgstInvKndCd = chssMgstInvKndCd;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.poolMinRtAmt = poolMinRtAmt;
		this.ibflag = ibflag;
		this.apIfFlg = apIfFlg;
		this.costOfcCd = costOfcCd;
		this.vndrSeq = vndrSeq;
		this.payInvSeq = payInvSeq;
		this.invSmryAmt = invSmryAmt;
		this.revDirCd = revDirCd;
		this.diffRmk = diffRmk;
		this.revVslCd = revVslCd;
		this.chssMgstInvStsCd = chssMgstInvStsCd;
		this.chgSmryAmt = chgSmryAmt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.invTaxRt = invTaxRt;
		this.pagerows = pagerows;
		this.invTaxCltTpCd = invTaxCltTpCd;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_dt", getInvDt());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("rev_skd_dir_cd", getRevSkdDirCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("iss_ofc_cd", getIssOfcCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pool_max_rt_amt", getPoolMaxRtAmt());
		this.hashColumns.put("inv_usr_id", getInvUsrId());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("rev_skd_voy_no", getRevSkdVoyNo());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("chss_mgst_inv_knd_cd", getChssMgstInvKndCd());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("pool_min_rt_amt", getPoolMinRtAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ap_if_flg", getApIfFlg());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("pay_inv_seq", getPayInvSeq());
		this.hashColumns.put("inv_smry_amt", getInvSmryAmt());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("rev_vsl_cd", getRevVslCd());
		this.hashColumns.put("chss_mgst_inv_sts_cd", getChssMgstInvStsCd());
		this.hashColumns.put("chg_smry_amt", getChgSmryAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("inv_tax_rt", getInvTaxRt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_tax_clt_tp_cd", getInvTaxCltTpCd());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_dt", "invDt");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("rev_skd_dir_cd", "revSkdDirCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("iss_ofc_cd", "issOfcCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pool_max_rt_amt", "poolMaxRtAmt");
		this.hashFields.put("inv_usr_id", "invUsrId");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("rev_skd_voy_no", "revSkdVoyNo");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("chss_mgst_inv_knd_cd", "chssMgstInvKndCd");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("pool_min_rt_amt", "poolMinRtAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ap_if_flg", "apIfFlg");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("pay_inv_seq", "payInvSeq");
		this.hashFields.put("inv_smry_amt", "invSmryAmt");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("rev_vsl_cd", "revVslCd");
		this.hashFields.put("chss_mgst_inv_sts_cd", "chssMgstInvStsCd");
		this.hashFields.put("chg_smry_amt", "chgSmryAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("inv_tax_rt", "invTaxRt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_tax_clt_tp_cd", "invTaxCltTpCd");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getInvDt() {
		return this.invDt;
	}
	public String getCostYrmon() {
		return this.costYrmon;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getCsrNo() {
		return this.csrNo;
	}
	public String getRevSkdDirCd() {
		return this.revSkdDirCd;
	}
	public String getInvNo() {
		return this.invNo;
	}
	public String getIssOfcCd() {
		return this.issOfcCd;
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
	public String getPoolMaxRtAmt() {
		return this.poolMaxRtAmt;
	}
	public String getInvUsrId() {
		return this.invUsrId;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getRevSkdVoyNo() {
		return this.revSkdVoyNo;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getChssMgstInvKndCd() {
		return this.chssMgstInvKndCd;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getPoolMinRtAmt() {
		return this.poolMinRtAmt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getApIfFlg() {
		return this.apIfFlg;
	}
	public String getCostOfcCd() {
		return this.costOfcCd;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getPayInvSeq() {
		return this.payInvSeq;
	}
	public String getInvSmryAmt() {
		return this.invSmryAmt;
	}
	public String getRevDirCd() {
		return this.revDirCd;
	}
	public String getDiffRmk() {
		return this.diffRmk;
	}
	public String getRevVslCd() {
		return this.revVslCd;
	}
	public String getChssMgstInvStsCd() {
		return this.chssMgstInvStsCd;
	}
	public String getChgSmryAmt() {
		return this.chgSmryAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getInvTaxRt() {
		return this.invTaxRt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getInvTaxCltTpCd() {
		return this.invTaxCltTpCd;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setInvDt(String invDt) {
		this.invDt = invDt;
		//this.invDt=true;
	}
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
		//this.costYrmon=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
		//this.csrNo=true;
	}
	public void setRevSkdDirCd(String revSkdDirCd) {
		this.revSkdDirCd = revSkdDirCd;
		//this.revSkdDirCd=true;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
		//this.invNo=true;
	}
	public void setIssOfcCd(String issOfcCd) {
		this.issOfcCd = issOfcCd;
		//this.issOfcCd=true;
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
	public void setPoolMaxRtAmt(String poolMaxRtAmt) {
		this.poolMaxRtAmt = poolMaxRtAmt;
		//this.poolMaxRtAmt=true;
	}
	public void setInvUsrId(String invUsrId) {
		this.invUsrId = invUsrId;
		//this.invUsrId=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setRevSkdVoyNo(String revSkdVoyNo) {
		this.revSkdVoyNo = revSkdVoyNo;
		//this.revSkdVoyNo=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setChssMgstInvKndCd(String chssMgstInvKndCd) {
		this.chssMgstInvKndCd = chssMgstInvKndCd;
		//this.chssMgstInvKndCd=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setPoolMinRtAmt(String poolMinRtAmt) {
		this.poolMinRtAmt = poolMinRtAmt;
		//this.poolMinRtAmt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setApIfFlg(String apIfFlg) {
		this.apIfFlg = apIfFlg;
		//this.apIfFlg=true;
	}
	public void setCostOfcCd(String costOfcCd) {
		this.costOfcCd = costOfcCd;
		//this.costOfcCd=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setPayInvSeq(String payInvSeq) {
		this.payInvSeq = payInvSeq;
		//this.payInvSeq=true;
	}
	public void setInvSmryAmt(String invSmryAmt) {
		this.invSmryAmt = invSmryAmt;
		//this.invSmryAmt=true;
	}
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
		//this.revDirCd=true;
	}
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
		//this.diffRmk=true;
	}
	public void setRevVslCd(String revVslCd) {
		this.revVslCd = revVslCd;
		//this.revVslCd=true;
	}
	public void setChssMgstInvStsCd(String chssMgstInvStsCd) {
		this.chssMgstInvStsCd = chssMgstInvStsCd;
		//this.chssMgstInvStsCd=true;
	}
	public void setChgSmryAmt(String chgSmryAmt) {
		this.chgSmryAmt = chgSmryAmt;
		//this.chgSmryAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setInvTaxRt(String invTaxRt) {
		this.invTaxRt = invTaxRt;
		//this.invTaxRt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setInvTaxCltTpCd(String invTaxCltTpCd) {
		this.invTaxCltTpCd = invTaxCltTpCd;
		//this.invTaxCltTpCd=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setInvDt(JSPUtil.getParameter(request, "inv_dt", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setRevSkdDirCd(JSPUtil.getParameter(request, "rev_skd_dir_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setIssOfcCd(JSPUtil.getParameter(request, "iss_ofc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPoolMaxRtAmt(JSPUtil.getParameter(request, "pool_max_rt_amt", ""));
		setInvUsrId(JSPUtil.getParameter(request, "inv_usr_id", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setRevSkdVoyNo(JSPUtil.getParameter(request, "rev_skd_voy_no", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setChssMgstInvKndCd(JSPUtil.getParameter(request, "chss_mgst_inv_knd_cd", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setPoolMinRtAmt(JSPUtil.getParameter(request, "pool_min_rt_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setApIfFlg(JSPUtil.getParameter(request, "ap_if_flg", ""));
		setCostOfcCd(JSPUtil.getParameter(request, "cost_ofc_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setPayInvSeq(JSPUtil.getParameter(request, "pay_inv_seq", ""));
		setInvSmryAmt(JSPUtil.getParameter(request, "inv_smry_amt", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setRevVslCd(JSPUtil.getParameter(request, "rev_vsl_cd", ""));
		setChssMgstInvStsCd(JSPUtil.getParameter(request, "chss_mgst_inv_sts_cd", ""));
		setChgSmryAmt(JSPUtil.getParameter(request, "chg_smry_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setInvTaxRt(JSPUtil.getParameter(request, "inv_tax_rt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvTaxCltTpCd(JSPUtil.getParameter(request, "inv_tax_clt_tp_cd", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmPayInvVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmPayInvVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmPayInvVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invDt = (JSPUtil.getParameter(request, prefix	+ "inv_dt".trim(), length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no".trim(), length));
			String[] revSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_skd_dir_cd".trim(), length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no".trim(), length));
			String[] issOfcCd = (JSPUtil.getParameter(request, prefix	+ "iss_ofc_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] poolMaxRtAmt = (JSPUtil.getParameter(request, prefix	+ "pool_max_rt_amt".trim(), length));
			String[] invUsrId = (JSPUtil.getParameter(request, prefix	+ "inv_usr_id".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] revSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "rev_skd_voy_no".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] chssMgstInvKndCd = (JSPUtil.getParameter(request, prefix	+ "chss_mgst_inv_knd_cd".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] poolMinRtAmt = (JSPUtil.getParameter(request, prefix	+ "pool_min_rt_amt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] apIfFlg = (JSPUtil.getParameter(request, prefix	+ "ap_if_flg".trim(), length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] payInvSeq = (JSPUtil.getParameter(request, prefix	+ "pay_inv_seq".trim(), length));
			String[] invSmryAmt = (JSPUtil.getParameter(request, prefix	+ "inv_smry_amt".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] revVslCd = (JSPUtil.getParameter(request, prefix	+ "rev_vsl_cd".trim(), length));
			String[] chssMgstInvStsCd = (JSPUtil.getParameter(request, prefix	+ "chss_mgst_inv_sts_cd".trim(), length));
			String[] chgSmryAmt = (JSPUtil.getParameter(request, prefix	+ "chg_smry_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] invTaxRt = (JSPUtil.getParameter(request, prefix	+ "inv_tax_rt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] invTaxCltTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_tax_clt_tp_cd".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmPayInvVO();
				if (invDt[i] != null)
					model.setInvDt(invDt[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (revSkdDirCd[i] != null)
					model.setRevSkdDirCd(revSkdDirCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (issOfcCd[i] != null)
					model.setIssOfcCd(issOfcCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (poolMaxRtAmt[i] != null)
					model.setPoolMaxRtAmt(poolMaxRtAmt[i]);
				if (invUsrId[i] != null)
					model.setInvUsrId(invUsrId[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (revSkdVoyNo[i] != null)
					model.setRevSkdVoyNo(revSkdVoyNo[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (chssMgstInvKndCd[i] != null)
					model.setChssMgstInvKndCd(chssMgstInvKndCd[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (poolMinRtAmt[i] != null)
					model.setPoolMinRtAmt(poolMinRtAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (apIfFlg[i] != null)
					model.setApIfFlg(apIfFlg[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (payInvSeq[i] != null)
					model.setPayInvSeq(payInvSeq[i]);
				if (invSmryAmt[i] != null)
					model.setInvSmryAmt(invSmryAmt[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (revVslCd[i] != null)
					model.setRevVslCd(revVslCd[i]);
				if (chssMgstInvStsCd[i] != null)
					model.setChssMgstInvStsCd(chssMgstInvStsCd[i]);
				if (chgSmryAmt[i] != null)
					model.setChgSmryAmt(chgSmryAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (invTaxRt[i] != null)
					model.setInvTaxRt(invTaxRt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invTaxCltTpCd[i] != null)
					model.setInvTaxCltTpCd(invTaxCltTpCd[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmPayInvVOs();
	}

	public CgmPayInvVO[] getCgmPayInvVOs(){
		CgmPayInvVO[] vos = (CgmPayInvVO[])models.toArray(new CgmPayInvVO[models.size()]);
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
		this.invDt = this.invDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdDirCd = this.revSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issOfcCd = this.issOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolMaxRtAmt = this.poolMaxRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invUsrId = this.invUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revSkdVoyNo = this.revSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMgstInvKndCd = this.chssMgstInvKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolMinRtAmt = this.poolMinRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apIfFlg = this.apIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payInvSeq = this.payInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSmryAmt = this.invSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revVslCd = this.revVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMgstInvStsCd = this.chssMgstInvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSmryAmt = this.chgSmryAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxRt = this.invTaxRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxCltTpCd = this.invTaxCltTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
