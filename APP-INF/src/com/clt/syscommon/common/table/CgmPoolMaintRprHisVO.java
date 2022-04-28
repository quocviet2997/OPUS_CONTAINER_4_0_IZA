/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmPoolMaintRprHisVO.java
*@FileTitle : CgmPoolMaintRprHisVO
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

public class CgmPoolMaintRprHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmPoolMaintRprHisVO> models = new ArrayList<CgmPoolMaintRprHisVO>();
	
	/* Column Info */
	private String rprHrs = null;
	/* Column Info */
	private String chssAsptNm = null;
	/* Column Info */
	private String invCreDt = null;
	/* Column Info */
	private String dmgDesc = null;
	/* Column Info */
	private String mtrlCostAmt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String chssUseCoNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String sysSeq = null;
	/* Column Info */
	private String vndrLocNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rprCmpoQty = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String respbPtyNm = null;
	/* Column Info */
	private String issOfcNm = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String rprCmplDt = null;
	/* Column Info */
	private String invRefNo = null;
	/* Column Info */
	private String taxAmt = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String chssCmpoNm = null;
	/* Column Info */
	private String poolMgmtCoCd = null;
	/* Column Info */
	private String lbrCostAmt = null;
	/* Column Info */
	private String splCmpoTpCd = null;
	/* Column Info */
	private String rprRqstDt = null;
	/* Column Info */
	private String invAproDt = null;
	/* Column Info */
	private String chssLocNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rprDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rprInspTpDesc = null;
	/* Column Info */
	private String chssOwnrCoNm = null;
	/* Column Info */
	private String vndrNm = null;
	/* Column Info */
	private String costTtlAmt = null;
	/* Column Info */
	private String splCmpoQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmPoolMaintRprHisVO() {}

	public CgmPoolMaintRprHisVO(String ibflag, String pagerows, String chssNo, String sysSeq, String poolMgmtCoCd, String chssPoolCd, String vndrNm, String vndrLocNm, String invNo, String chssAsptNm, String chssCmpoNm, String chssLocNm, String dmgDesc, String rprDesc, String rprCmpoQty, String rprHrs, String rprInspTpDesc, String lbrCostAmt, String mtrlCostAmt, String taxAmt, String costTtlAmt, String invCreDt, String invAproDt, String rprRqstDt, String rprCmplDt, String cntrNo, String chssUseCoNm, String issOfcNm, String chssOwnrCoNm, String respbPtyNm, String invRefNo, String splCmpoTpCd, String splCmpoQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rprHrs = rprHrs;
		this.chssAsptNm = chssAsptNm;
		this.invCreDt = invCreDt;
		this.dmgDesc = dmgDesc;
		this.mtrlCostAmt = mtrlCostAmt;
		this.invNo = invNo;
		this.chssUseCoNm = chssUseCoNm;
		this.updUsrId = updUsrId;
		this.sysSeq = sysSeq;
		this.vndrLocNm = vndrLocNm;
		this.updDt = updDt;
		this.rprCmpoQty = rprCmpoQty;
		this.cntrNo = cntrNo;
		this.respbPtyNm = respbPtyNm;
		this.issOfcNm = issOfcNm;
		this.ibflag = ibflag;
		this.rprCmplDt = rprCmplDt;
		this.invRefNo = invRefNo;
		this.taxAmt = taxAmt;
		this.chssNo = chssNo;
		this.chssCmpoNm = chssCmpoNm;
		this.poolMgmtCoCd = poolMgmtCoCd;
		this.lbrCostAmt = lbrCostAmt;
		this.splCmpoTpCd = splCmpoTpCd;
		this.rprRqstDt = rprRqstDt;
		this.invAproDt = invAproDt;
		this.chssLocNm = chssLocNm;
		this.creDt = creDt;
		this.rprDesc = rprDesc;
		this.creUsrId = creUsrId;
		this.rprInspTpDesc = rprInspTpDesc;
		this.chssOwnrCoNm = chssOwnrCoNm;
		this.vndrNm = vndrNm;
		this.costTtlAmt = costTtlAmt;
		this.splCmpoQty = splCmpoQty;
		this.pagerows = pagerows;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rpr_hrs", getRprHrs());
		this.hashColumns.put("chss_aspt_nm", getChssAsptNm());
		this.hashColumns.put("inv_cre_dt", getInvCreDt());
		this.hashColumns.put("dmg_desc", getDmgDesc());
		this.hashColumns.put("mtrl_cost_amt", getMtrlCostAmt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("chss_use_co_nm", getChssUseCoNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sys_seq", getSysSeq());
		this.hashColumns.put("vndr_loc_nm", getVndrLocNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rpr_cmpo_qty", getRprCmpoQty());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("respb_pty_nm", getRespbPtyNm());
		this.hashColumns.put("iss_ofc_nm", getIssOfcNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rpr_cmpl_dt", getRprCmplDt());
		this.hashColumns.put("inv_ref_no", getInvRefNo());
		this.hashColumns.put("tax_amt", getTaxAmt());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("chss_cmpo_nm", getChssCmpoNm());
		this.hashColumns.put("pool_mgmt_co_cd", getPoolMgmtCoCd());
		this.hashColumns.put("lbr_cost_amt", getLbrCostAmt());
		this.hashColumns.put("spl_cmpo_tp_cd", getSplCmpoTpCd());
		this.hashColumns.put("rpr_rqst_dt", getRprRqstDt());
		this.hashColumns.put("inv_apro_dt", getInvAproDt());
		this.hashColumns.put("chss_loc_nm", getChssLocNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rpr_desc", getRprDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rpr_insp_tp_desc", getRprInspTpDesc());
		this.hashColumns.put("chss_ownr_co_nm", getChssOwnrCoNm());
		this.hashColumns.put("vndr_nm", getVndrNm());
		this.hashColumns.put("cost_ttl_amt", getCostTtlAmt());
		this.hashColumns.put("spl_cmpo_qty", getSplCmpoQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rpr_hrs", "rprHrs");
		this.hashFields.put("chss_aspt_nm", "chssAsptNm");
		this.hashFields.put("inv_cre_dt", "invCreDt");
		this.hashFields.put("dmg_desc", "dmgDesc");
		this.hashFields.put("mtrl_cost_amt", "mtrlCostAmt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("chss_use_co_nm", "chssUseCoNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sys_seq", "sysSeq");
		this.hashFields.put("vndr_loc_nm", "vndrLocNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rpr_cmpo_qty", "rprCmpoQty");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("respb_pty_nm", "respbPtyNm");
		this.hashFields.put("iss_ofc_nm", "issOfcNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rpr_cmpl_dt", "rprCmplDt");
		this.hashFields.put("inv_ref_no", "invRefNo");
		this.hashFields.put("tax_amt", "taxAmt");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("chss_cmpo_nm", "chssCmpoNm");
		this.hashFields.put("pool_mgmt_co_cd", "poolMgmtCoCd");
		this.hashFields.put("lbr_cost_amt", "lbrCostAmt");
		this.hashFields.put("spl_cmpo_tp_cd", "splCmpoTpCd");
		this.hashFields.put("rpr_rqst_dt", "rprRqstDt");
		this.hashFields.put("inv_apro_dt", "invAproDt");
		this.hashFields.put("chss_loc_nm", "chssLocNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rpr_desc", "rprDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rpr_insp_tp_desc", "rprInspTpDesc");
		this.hashFields.put("chss_ownr_co_nm", "chssOwnrCoNm");
		this.hashFields.put("vndr_nm", "vndrNm");
		this.hashFields.put("cost_ttl_amt", "costTtlAmt");
		this.hashFields.put("spl_cmpo_qty", "splCmpoQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getRprHrs() {
		return this.rprHrs;
	}
	public String getChssAsptNm() {
		return this.chssAsptNm;
	}
	public String getInvCreDt() {
		return this.invCreDt;
	}
	public String getDmgDesc() {
		return this.dmgDesc;
	}
	public String getMtrlCostAmt() {
		return this.mtrlCostAmt;
	}
	public String getInvNo() {
		return this.invNo;
	}
	public String getChssUseCoNm() {
		return this.chssUseCoNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getSysSeq() {
		return this.sysSeq;
	}
	public String getVndrLocNm() {
		return this.vndrLocNm;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getRprCmpoQty() {
		return this.rprCmpoQty;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getRespbPtyNm() {
		return this.respbPtyNm;
	}
	public String getIssOfcNm() {
		return this.issOfcNm;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getRprCmplDt() {
		return this.rprCmplDt;
	}
	public String getInvRefNo() {
		return this.invRefNo;
	}
	public String getTaxAmt() {
		return this.taxAmt;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getChssCmpoNm() {
		return this.chssCmpoNm;
	}
	public String getPoolMgmtCoCd() {
		return this.poolMgmtCoCd;
	}
	public String getLbrCostAmt() {
		return this.lbrCostAmt;
	}
	public String getSplCmpoTpCd() {
		return this.splCmpoTpCd;
	}
	public String getRprRqstDt() {
		return this.rprRqstDt;
	}
	public String getInvAproDt() {
		return this.invAproDt;
	}
	public String getChssLocNm() {
		return this.chssLocNm;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getRprDesc() {
		return this.rprDesc;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getRprInspTpDesc() {
		return this.rprInspTpDesc;
	}
	public String getChssOwnrCoNm() {
		return this.chssOwnrCoNm;
	}
	public String getVndrNm() {
		return this.vndrNm;
	}
	public String getCostTtlAmt() {
		return this.costTtlAmt;
	}
	public String getSplCmpoQty() {
		return this.splCmpoQty;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setRprHrs(String rprHrs) {
		this.rprHrs = rprHrs;
		//this.rprHrs=true;
	}
	public void setChssAsptNm(String chssAsptNm) {
		this.chssAsptNm = chssAsptNm;
		//this.chssAsptNm=true;
	}
	public void setInvCreDt(String invCreDt) {
		this.invCreDt = invCreDt;
		//this.invCreDt=true;
	}
	public void setDmgDesc(String dmgDesc) {
		this.dmgDesc = dmgDesc;
		//this.dmgDesc=true;
	}
	public void setMtrlCostAmt(String mtrlCostAmt) {
		this.mtrlCostAmt = mtrlCostAmt;
		//this.mtrlCostAmt=true;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
		//this.invNo=true;
	}
	public void setChssUseCoNm(String chssUseCoNm) {
		this.chssUseCoNm = chssUseCoNm;
		//this.chssUseCoNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setSysSeq(String sysSeq) {
		this.sysSeq = sysSeq;
		//this.sysSeq=true;
	}
	public void setVndrLocNm(String vndrLocNm) {
		this.vndrLocNm = vndrLocNm;
		//this.vndrLocNm=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setRprCmpoQty(String rprCmpoQty) {
		this.rprCmpoQty = rprCmpoQty;
		//this.rprCmpoQty=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setRespbPtyNm(String respbPtyNm) {
		this.respbPtyNm = respbPtyNm;
		//this.respbPtyNm=true;
	}
	public void setIssOfcNm(String issOfcNm) {
		this.issOfcNm = issOfcNm;
		//this.issOfcNm=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setRprCmplDt(String rprCmplDt) {
		this.rprCmplDt = rprCmplDt;
		//this.rprCmplDt=true;
	}
	public void setInvRefNo(String invRefNo) {
		this.invRefNo = invRefNo;
		//this.invRefNo=true;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
		//this.taxAmt=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setChssCmpoNm(String chssCmpoNm) {
		this.chssCmpoNm = chssCmpoNm;
		//this.chssCmpoNm=true;
	}
	public void setPoolMgmtCoCd(String poolMgmtCoCd) {
		this.poolMgmtCoCd = poolMgmtCoCd;
		//this.poolMgmtCoCd=true;
	}
	public void setLbrCostAmt(String lbrCostAmt) {
		this.lbrCostAmt = lbrCostAmt;
		//this.lbrCostAmt=true;
	}
	public void setSplCmpoTpCd(String splCmpoTpCd) {
		this.splCmpoTpCd = splCmpoTpCd;
		//this.splCmpoTpCd=true;
	}
	public void setRprRqstDt(String rprRqstDt) {
		this.rprRqstDt = rprRqstDt;
		//this.rprRqstDt=true;
	}
	public void setInvAproDt(String invAproDt) {
		this.invAproDt = invAproDt;
		//this.invAproDt=true;
	}
	public void setChssLocNm(String chssLocNm) {
		this.chssLocNm = chssLocNm;
		//this.chssLocNm=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setRprDesc(String rprDesc) {
		this.rprDesc = rprDesc;
		//this.rprDesc=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setRprInspTpDesc(String rprInspTpDesc) {
		this.rprInspTpDesc = rprInspTpDesc;
		//this.rprInspTpDesc=true;
	}
	public void setChssOwnrCoNm(String chssOwnrCoNm) {
		this.chssOwnrCoNm = chssOwnrCoNm;
		//this.chssOwnrCoNm=true;
	}
	public void setVndrNm(String vndrNm) {
		this.vndrNm = vndrNm;
		//this.vndrNm=true;
	}
	public void setCostTtlAmt(String costTtlAmt) {
		this.costTtlAmt = costTtlAmt;
		//this.costTtlAmt=true;
	}
	public void setSplCmpoQty(String splCmpoQty) {
		this.splCmpoQty = splCmpoQty;
		//this.splCmpoQty=true;
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
		setRprHrs(JSPUtil.getParameter(request, "rpr_hrs", ""));
		setChssAsptNm(JSPUtil.getParameter(request, "chss_aspt_nm", ""));
		setInvCreDt(JSPUtil.getParameter(request, "inv_cre_dt", ""));
		setDmgDesc(JSPUtil.getParameter(request, "dmg_desc", ""));
		setMtrlCostAmt(JSPUtil.getParameter(request, "mtrl_cost_amt", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setChssUseCoNm(JSPUtil.getParameter(request, "chss_use_co_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSysSeq(JSPUtil.getParameter(request, "sys_seq", ""));
		setVndrLocNm(JSPUtil.getParameter(request, "vndr_loc_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRprCmpoQty(JSPUtil.getParameter(request, "rpr_cmpo_qty", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setRespbPtyNm(JSPUtil.getParameter(request, "respb_pty_nm", ""));
		setIssOfcNm(JSPUtil.getParameter(request, "iss_ofc_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRprCmplDt(JSPUtil.getParameter(request, "rpr_cmpl_dt", ""));
		setInvRefNo(JSPUtil.getParameter(request, "inv_ref_no", ""));
		setTaxAmt(JSPUtil.getParameter(request, "tax_amt", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setChssCmpoNm(JSPUtil.getParameter(request, "chss_cmpo_nm", ""));
		setPoolMgmtCoCd(JSPUtil.getParameter(request, "pool_mgmt_co_cd", ""));
		setLbrCostAmt(JSPUtil.getParameter(request, "lbr_cost_amt", ""));
		setSplCmpoTpCd(JSPUtil.getParameter(request, "spl_cmpo_tp_cd", ""));
		setRprRqstDt(JSPUtil.getParameter(request, "rpr_rqst_dt", ""));
		setInvAproDt(JSPUtil.getParameter(request, "inv_apro_dt", ""));
		setChssLocNm(JSPUtil.getParameter(request, "chss_loc_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRprDesc(JSPUtil.getParameter(request, "rpr_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRprInspTpDesc(JSPUtil.getParameter(request, "rpr_insp_tp_desc", ""));
		setChssOwnrCoNm(JSPUtil.getParameter(request, "chss_ownr_co_nm", ""));
		setVndrNm(JSPUtil.getParameter(request, "vndr_nm", ""));
		setCostTtlAmt(JSPUtil.getParameter(request, "cost_ttl_amt", ""));
		setSplCmpoQty(JSPUtil.getParameter(request, "spl_cmpo_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmPoolMaintRprHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmPoolMaintRprHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmPoolMaintRprHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rprHrs = (JSPUtil.getParameter(request, prefix	+ "rpr_hrs".trim(), length));
			String[] chssAsptNm = (JSPUtil.getParameter(request, prefix	+ "chss_aspt_nm".trim(), length));
			String[] invCreDt = (JSPUtil.getParameter(request, prefix	+ "inv_cre_dt".trim(), length));
			String[] dmgDesc = (JSPUtil.getParameter(request, prefix	+ "dmg_desc".trim(), length));
			String[] mtrlCostAmt = (JSPUtil.getParameter(request, prefix	+ "mtrl_cost_amt".trim(), length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no".trim(), length));
			String[] chssUseCoNm = (JSPUtil.getParameter(request, prefix	+ "chss_use_co_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] sysSeq = (JSPUtil.getParameter(request, prefix	+ "sys_seq".trim(), length));
			String[] vndrLocNm = (JSPUtil.getParameter(request, prefix	+ "vndr_loc_nm".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rprCmpoQty = (JSPUtil.getParameter(request, prefix	+ "rpr_cmpo_qty".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] respbPtyNm = (JSPUtil.getParameter(request, prefix	+ "respb_pty_nm".trim(), length));
			String[] issOfcNm = (JSPUtil.getParameter(request, prefix	+ "iss_ofc_nm".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] rprCmplDt = (JSPUtil.getParameter(request, prefix	+ "rpr_cmpl_dt".trim(), length));
			String[] invRefNo = (JSPUtil.getParameter(request, prefix	+ "inv_ref_no".trim(), length));
			String[] taxAmt = (JSPUtil.getParameter(request, prefix	+ "tax_amt".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] chssCmpoNm = (JSPUtil.getParameter(request, prefix	+ "chss_cmpo_nm".trim(), length));
			String[] poolMgmtCoCd = (JSPUtil.getParameter(request, prefix	+ "pool_mgmt_co_cd".trim(), length));
			String[] lbrCostAmt = (JSPUtil.getParameter(request, prefix	+ "lbr_cost_amt".trim(), length));
			String[] splCmpoTpCd = (JSPUtil.getParameter(request, prefix	+ "spl_cmpo_tp_cd".trim(), length));
			String[] rprRqstDt = (JSPUtil.getParameter(request, prefix	+ "rpr_rqst_dt".trim(), length));
			String[] invAproDt = (JSPUtil.getParameter(request, prefix	+ "inv_apro_dt".trim(), length));
			String[] chssLocNm = (JSPUtil.getParameter(request, prefix	+ "chss_loc_nm".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] rprDesc = (JSPUtil.getParameter(request, prefix	+ "rpr_desc".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] rprInspTpDesc = (JSPUtil.getParameter(request, prefix	+ "rpr_insp_tp_desc".trim(), length));
			String[] chssOwnrCoNm = (JSPUtil.getParameter(request, prefix	+ "chss_ownr_co_nm".trim(), length));
			String[] vndrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_nm".trim(), length));
			String[] costTtlAmt = (JSPUtil.getParameter(request, prefix	+ "cost_ttl_amt".trim(), length));
			String[] splCmpoQty = (JSPUtil.getParameter(request, prefix	+ "spl_cmpo_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmPoolMaintRprHisVO();
				if (rprHrs[i] != null)
					model.setRprHrs(rprHrs[i]);
				if (chssAsptNm[i] != null)
					model.setChssAsptNm(chssAsptNm[i]);
				if (invCreDt[i] != null)
					model.setInvCreDt(invCreDt[i]);
				if (dmgDesc[i] != null)
					model.setDmgDesc(dmgDesc[i]);
				if (mtrlCostAmt[i] != null)
					model.setMtrlCostAmt(mtrlCostAmt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (chssUseCoNm[i] != null)
					model.setChssUseCoNm(chssUseCoNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (sysSeq[i] != null)
					model.setSysSeq(sysSeq[i]);
				if (vndrLocNm[i] != null)
					model.setVndrLocNm(vndrLocNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rprCmpoQty[i] != null)
					model.setRprCmpoQty(rprCmpoQty[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (respbPtyNm[i] != null)
					model.setRespbPtyNm(respbPtyNm[i]);
				if (issOfcNm[i] != null)
					model.setIssOfcNm(issOfcNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rprCmplDt[i] != null)
					model.setRprCmplDt(rprCmplDt[i]);
				if (invRefNo[i] != null)
					model.setInvRefNo(invRefNo[i]);
				if (taxAmt[i] != null)
					model.setTaxAmt(taxAmt[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (chssCmpoNm[i] != null)
					model.setChssCmpoNm(chssCmpoNm[i]);
				if (poolMgmtCoCd[i] != null)
					model.setPoolMgmtCoCd(poolMgmtCoCd[i]);
				if (lbrCostAmt[i] != null)
					model.setLbrCostAmt(lbrCostAmt[i]);
				if (splCmpoTpCd[i] != null)
					model.setSplCmpoTpCd(splCmpoTpCd[i]);
				if (rprRqstDt[i] != null)
					model.setRprRqstDt(rprRqstDt[i]);
				if (invAproDt[i] != null)
					model.setInvAproDt(invAproDt[i]);
				if (chssLocNm[i] != null)
					model.setChssLocNm(chssLocNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rprDesc[i] != null)
					model.setRprDesc(rprDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rprInspTpDesc[i] != null)
					model.setRprInspTpDesc(rprInspTpDesc[i]);
				if (chssOwnrCoNm[i] != null)
					model.setChssOwnrCoNm(chssOwnrCoNm[i]);
				if (vndrNm[i] != null)
					model.setVndrNm(vndrNm[i]);
				if (costTtlAmt[i] != null)
					model.setCostTtlAmt(costTtlAmt[i]);
				if (splCmpoQty[i] != null)
					model.setSplCmpoQty(splCmpoQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmPoolMaintRprHisVOs();
	}

	public CgmPoolMaintRprHisVO[] getCgmPoolMaintRprHisVOs(){
		CgmPoolMaintRprHisVO[] vos = (CgmPoolMaintRprHisVO[])models.toArray(new CgmPoolMaintRprHisVO[models.size()]);
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
		this.rprHrs = this.rprHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssAsptNm = this.chssAsptNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCreDt = this.invCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmgDesc = this.dmgDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtrlCostAmt = this.mtrlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssUseCoNm = this.chssUseCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysSeq = this.sysSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLocNm = this.vndrLocNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprCmpoQty = this.rprCmpoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbPtyNm = this.respbPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issOfcNm = this.issOfcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprCmplDt = this.rprCmplDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRefNo = this.invRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxAmt = this.taxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssCmpoNm = this.chssCmpoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolMgmtCoCd = this.poolMgmtCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lbrCostAmt = this.lbrCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splCmpoTpCd = this.splCmpoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprRqstDt = this.rprRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAproDt = this.invAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssLocNm = this.chssLocNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprDesc = this.rprDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprInspTpDesc = this.rprInspTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssOwnrCoNm = this.chssOwnrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNm = this.vndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costTtlAmt = this.costTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splCmpoQty = this.splCmpoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
