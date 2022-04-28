/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgRprVO.java
*@FileTitle : OpfStvDmgRprVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.18
*@LastModifier : 장석현
*@LastVersion : 1.0
* 2009.11.18 장석현 
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
 * @author 장석현
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfStvDmgRprVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgRprVO> models = new ArrayList<OpfStvDmgRprVO>();
	
	/* Column Info */
	private String rprInvAtchKnt = null;
	/* Column Info */
	private String rprCurrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rprDocAtchKnt = null;
	/* Column Info */
	private String rprRsltRptAtchKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rprPortCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rprDocAtchFlg = null;
	/* Column Info */
	private String stvDmgRprSeq = null;
	/* Column Info */
	private String qttnLoclCurrCd = null;
	/* Column Info */
	private String rprCostUsdAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rprRsltRptAtchFlg = null;
	/* Column Info */
	private String qttnCostUsdAmt = null;
	/* Column Info */
	private String rprInvAtchFlg = null;
	/* Column Info */
	private String rprEmlSndNo = null;
	/* Column Info */
	private String ustlAcctNo = null;
	/* Column Info */
	private String qttnCostLoclAmt = null;
	/* Column Info */
	private String rprCostLoclAmt = null;
	/* Column Info */
	private String rprPictAtchKnt = null;
	/* Column Info */
	private String rprRmk = null;
	/* Column Info */
	private String rprVndrNm = null;
	/* Column Info */
	private String rprDt = null;
	/* Column Info */
	private String stvDmgRprProcStsCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String runRprAcctNo = null;
	/* Column Info */
	private String rprPictAtchFlg = null;
	/* Column Info */
	private String stvDmgNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgRprVO() {}

	public OpfStvDmgRprVO(String ibflag, String pagerows, String stvDmgNo, String stvDmgRprSeq, String stvDmgRprProcStsCd, String qttnLoclCurrCd, String qttnCostLoclAmt, String qttnCostUsdAmt, String rprPortCd, String rprDt, String rprVndrNm, String ustlAcctNo, String runRprAcctNo, String rprCurrCd, String rprCostLoclAmt, String rprCostUsdAmt, String rprRsltRptAtchFlg, String rprInvAtchFlg, String rprPictAtchFlg, String rprDocAtchFlg, String rprRmk, String rprEmlSndNo, String creUsrId, String creDt, String updUsrId, String updDt, String rprRsltRptAtchKnt, String rprInvAtchKnt, String rprPictAtchKnt, String rprDocAtchKnt) {
		this.rprInvAtchKnt = rprInvAtchKnt;
		this.rprCurrCd = rprCurrCd;
		this.creDt = creDt;
		this.rprDocAtchKnt = rprDocAtchKnt;
		this.rprRsltRptAtchKnt = rprRsltRptAtchKnt;
		this.pagerows = pagerows;
		this.rprPortCd = rprPortCd;
		this.ibflag = ibflag;
		this.rprDocAtchFlg = rprDocAtchFlg;
		this.stvDmgRprSeq = stvDmgRprSeq;
		this.qttnLoclCurrCd = qttnLoclCurrCd;
		this.rprCostUsdAmt = rprCostUsdAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.rprRsltRptAtchFlg = rprRsltRptAtchFlg;
		this.qttnCostUsdAmt = qttnCostUsdAmt;
		this.rprInvAtchFlg = rprInvAtchFlg;
		this.rprEmlSndNo = rprEmlSndNo;
		this.ustlAcctNo = ustlAcctNo;
		this.qttnCostLoclAmt = qttnCostLoclAmt;
		this.rprCostLoclAmt = rprCostLoclAmt;
		this.rprPictAtchKnt = rprPictAtchKnt;
		this.rprRmk = rprRmk;
		this.rprVndrNm = rprVndrNm;
		this.rprDt = rprDt;
		this.stvDmgRprProcStsCd = stvDmgRprProcStsCd;
		this.creUsrId = creUsrId;
		this.runRprAcctNo = runRprAcctNo;
		this.rprPictAtchFlg = rprPictAtchFlg;
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rpr_inv_atch_knt", getRprInvAtchKnt());
		this.hashColumns.put("rpr_curr_cd", getRprCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rpr_doc_atch_knt", getRprDocAtchKnt());
		this.hashColumns.put("rpr_rslt_rpt_atch_knt", getRprRsltRptAtchKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rpr_port_cd", getRprPortCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rpr_doc_atch_flg", getRprDocAtchFlg());
		this.hashColumns.put("stv_dmg_rpr_seq", getStvDmgRprSeq());
		this.hashColumns.put("qttn_locl_curr_cd", getQttnLoclCurrCd());
		this.hashColumns.put("rpr_cost_usd_amt", getRprCostUsdAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rpr_rslt_rpt_atch_flg", getRprRsltRptAtchFlg());
		this.hashColumns.put("qttn_cost_usd_amt", getQttnCostUsdAmt());
		this.hashColumns.put("rpr_inv_atch_flg", getRprInvAtchFlg());
		this.hashColumns.put("rpr_eml_snd_no", getRprEmlSndNo());
		this.hashColumns.put("ustl_acct_no", getUstlAcctNo());
		this.hashColumns.put("qttn_cost_locl_amt", getQttnCostLoclAmt());
		this.hashColumns.put("rpr_cost_locl_amt", getRprCostLoclAmt());
		this.hashColumns.put("rpr_pict_atch_knt", getRprPictAtchKnt());
		this.hashColumns.put("rpr_rmk", getRprRmk());
		this.hashColumns.put("rpr_vndr_nm", getRprVndrNm());
		this.hashColumns.put("rpr_dt", getRprDt());
		this.hashColumns.put("stv_dmg_rpr_proc_sts_cd", getStvDmgRprProcStsCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("run_rpr_acct_no", getRunRprAcctNo());
		this.hashColumns.put("rpr_pict_atch_flg", getRprPictAtchFlg());
		this.hashColumns.put("stv_dmg_no", getStvDmgNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rpr_inv_atch_knt", "rprInvAtchKnt");
		this.hashFields.put("rpr_curr_cd", "rprCurrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rpr_doc_atch_knt", "rprDocAtchKnt");
		this.hashFields.put("rpr_rslt_rpt_atch_knt", "rprRsltRptAtchKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rpr_port_cd", "rprPortCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rpr_doc_atch_flg", "rprDocAtchFlg");
		this.hashFields.put("stv_dmg_rpr_seq", "stvDmgRprSeq");
		this.hashFields.put("qttn_locl_curr_cd", "qttnLoclCurrCd");
		this.hashFields.put("rpr_cost_usd_amt", "rprCostUsdAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rpr_rslt_rpt_atch_flg", "rprRsltRptAtchFlg");
		this.hashFields.put("qttn_cost_usd_amt", "qttnCostUsdAmt");
		this.hashFields.put("rpr_inv_atch_flg", "rprInvAtchFlg");
		this.hashFields.put("rpr_eml_snd_no", "rprEmlSndNo");
		this.hashFields.put("ustl_acct_no", "ustlAcctNo");
		this.hashFields.put("qttn_cost_locl_amt", "qttnCostLoclAmt");
		this.hashFields.put("rpr_cost_locl_amt", "rprCostLoclAmt");
		this.hashFields.put("rpr_pict_atch_knt", "rprPictAtchKnt");
		this.hashFields.put("rpr_rmk", "rprRmk");
		this.hashFields.put("rpr_vndr_nm", "rprVndrNm");
		this.hashFields.put("rpr_dt", "rprDt");
		this.hashFields.put("stv_dmg_rpr_proc_sts_cd", "stvDmgRprProcStsCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("run_rpr_acct_no", "runRprAcctNo");
		this.hashFields.put("rpr_pict_atch_flg", "rprPictAtchFlg");
		this.hashFields.put("stv_dmg_no", "stvDmgNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rprInvAtchKnt
	 */
	public String getRprInvAtchKnt() {
		return this.rprInvAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return rprCurrCd
	 */
	public String getRprCurrCd() {
		return this.rprCurrCd;
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
	 * @return rprDocAtchKnt
	 */
	public String getRprDocAtchKnt() {
		return this.rprDocAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return rprRsltRptAtchKnt
	 */
	public String getRprRsltRptAtchKnt() {
		return this.rprRsltRptAtchKnt;
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
	 * @return rprPortCd
	 */
	public String getRprPortCd() {
		return this.rprPortCd;
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
	 * @return rprDocAtchFlg
	 */
	public String getRprDocAtchFlg() {
		return this.rprDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRprSeq
	 */
	public String getStvDmgRprSeq() {
		return this.stvDmgRprSeq;
	}
	
	/**
	 * Column Info
	 * @return qttnLoclCurrCd
	 */
	public String getQttnLoclCurrCd() {
		return this.qttnLoclCurrCd;
	}
	
	/**
	 * Column Info
	 * @return rprCostUsdAmt
	 */
	public String getRprCostUsdAmt() {
		return this.rprCostUsdAmt;
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
	 * @return rprRsltRptAtchFlg
	 */
	public String getRprRsltRptAtchFlg() {
		return this.rprRsltRptAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return qttnCostUsdAmt
	 */
	public String getQttnCostUsdAmt() {
		return this.qttnCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return rprInvAtchFlg
	 */
	public String getRprInvAtchFlg() {
		return this.rprInvAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return rprEmlSndNo
	 */
	public String getRprEmlSndNo() {
		return this.rprEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return ustlAcctNo
	 */
	public String getUstlAcctNo() {
		return this.ustlAcctNo;
	}
	
	/**
	 * Column Info
	 * @return qttnCostLoclAmt
	 */
	public String getQttnCostLoclAmt() {
		return this.qttnCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return rprCostLoclAmt
	 */
	public String getRprCostLoclAmt() {
		return this.rprCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return rprPictAtchKnt
	 */
	public String getRprPictAtchKnt() {
		return this.rprPictAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return rprRmk
	 */
	public String getRprRmk() {
		return this.rprRmk;
	}
	
	/**
	 * Column Info
	 * @return rprVndrNm
	 */
	public String getRprVndrNm() {
		return this.rprVndrNm;
	}
	
	/**
	 * Column Info
	 * @return rprDt
	 */
	public String getRprDt() {
		return this.rprDt;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRprProcStsCd
	 */
	public String getStvDmgRprProcStsCd() {
		return this.stvDmgRprProcStsCd;
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
	 * @return runRprAcctNo
	 */
	public String getRunRprAcctNo() {
		return this.runRprAcctNo;
	}
	
	/**
	 * Column Info
	 * @return rprPictAtchFlg
	 */
	public String getRprPictAtchFlg() {
		return this.rprPictAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stvDmgNo
	 */
	public String getStvDmgNo() {
		return this.stvDmgNo;
	}
	

	/**
	 * Column Info
	 * @param rprInvAtchKnt
	 */
	public void setRprInvAtchKnt(String rprInvAtchKnt) {
		this.rprInvAtchKnt = rprInvAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param rprCurrCd
	 */
	public void setRprCurrCd(String rprCurrCd) {
		this.rprCurrCd = rprCurrCd;
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
	 * @param rprDocAtchKnt
	 */
	public void setRprDocAtchKnt(String rprDocAtchKnt) {
		this.rprDocAtchKnt = rprDocAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param rprRsltRptAtchKnt
	 */
	public void setRprRsltRptAtchKnt(String rprRsltRptAtchKnt) {
		this.rprRsltRptAtchKnt = rprRsltRptAtchKnt;
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
	 * @param rprPortCd
	 */
	public void setRprPortCd(String rprPortCd) {
		this.rprPortCd = rprPortCd;
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
	 * @param rprDocAtchFlg
	 */
	public void setRprDocAtchFlg(String rprDocAtchFlg) {
		this.rprDocAtchFlg = rprDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRprSeq
	 */
	public void setStvDmgRprSeq(String stvDmgRprSeq) {
		this.stvDmgRprSeq = stvDmgRprSeq;
	}
	
	/**
	 * Column Info
	 * @param qttnLoclCurrCd
	 */
	public void setQttnLoclCurrCd(String qttnLoclCurrCd) {
		this.qttnLoclCurrCd = qttnLoclCurrCd;
	}
	
	/**
	 * Column Info
	 * @param rprCostUsdAmt
	 */
	public void setRprCostUsdAmt(String rprCostUsdAmt) {
		this.rprCostUsdAmt = rprCostUsdAmt;
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
	 * @param rprRsltRptAtchFlg
	 */
	public void setRprRsltRptAtchFlg(String rprRsltRptAtchFlg) {
		this.rprRsltRptAtchFlg = rprRsltRptAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param qttnCostUsdAmt
	 */
	public void setQttnCostUsdAmt(String qttnCostUsdAmt) {
		this.qttnCostUsdAmt = qttnCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param rprInvAtchFlg
	 */
	public void setRprInvAtchFlg(String rprInvAtchFlg) {
		this.rprInvAtchFlg = rprInvAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param rprEmlSndNo
	 */
	public void setRprEmlSndNo(String rprEmlSndNo) {
		this.rprEmlSndNo = rprEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param ustlAcctNo
	 */
	public void setUstlAcctNo(String ustlAcctNo) {
		this.ustlAcctNo = ustlAcctNo;
	}
	
	/**
	 * Column Info
	 * @param qttnCostLoclAmt
	 */
	public void setQttnCostLoclAmt(String qttnCostLoclAmt) {
		this.qttnCostLoclAmt = qttnCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param rprCostLoclAmt
	 */
	public void setRprCostLoclAmt(String rprCostLoclAmt) {
		this.rprCostLoclAmt = rprCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param rprPictAtchKnt
	 */
	public void setRprPictAtchKnt(String rprPictAtchKnt) {
		this.rprPictAtchKnt = rprPictAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param rprRmk
	 */
	public void setRprRmk(String rprRmk) {
		this.rprRmk = rprRmk;
	}
	
	/**
	 * Column Info
	 * @param rprVndrNm
	 */
	public void setRprVndrNm(String rprVndrNm) {
		this.rprVndrNm = rprVndrNm;
	}
	
	/**
	 * Column Info
	 * @param rprDt
	 */
	public void setRprDt(String rprDt) {
		this.rprDt = rprDt;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRprProcStsCd
	 */
	public void setStvDmgRprProcStsCd(String stvDmgRprProcStsCd) {
		this.stvDmgRprProcStsCd = stvDmgRprProcStsCd;
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
	 * @param runRprAcctNo
	 */
	public void setRunRprAcctNo(String runRprAcctNo) {
		this.runRprAcctNo = runRprAcctNo;
	}
	
	/**
	 * Column Info
	 * @param rprPictAtchFlg
	 */
	public void setRprPictAtchFlg(String rprPictAtchFlg) {
		this.rprPictAtchFlg = rprPictAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stvDmgNo
	 */
	public void setStvDmgNo(String stvDmgNo) {
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRprInvAtchKnt(JSPUtil.getParameter(request, "rpr_inv_atch_knt", ""));
		setRprCurrCd(JSPUtil.getParameter(request, "rpr_curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRprDocAtchKnt(JSPUtil.getParameter(request, "rpr_doc_atch_knt", ""));
		setRprRsltRptAtchKnt(JSPUtil.getParameter(request, "rpr_rslt_rpt_atch_knt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRprPortCd(JSPUtil.getParameter(request, "rpr_port_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRprDocAtchFlg(JSPUtil.getParameter(request, "rpr_doc_atch_flg", ""));
		setStvDmgRprSeq(JSPUtil.getParameter(request, "stv_dmg_rpr_seq", ""));
		setQttnLoclCurrCd(JSPUtil.getParameter(request, "qttn_locl_curr_cd", ""));
		setRprCostUsdAmt(JSPUtil.getParameter(request, "rpr_cost_usd_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRprRsltRptAtchFlg(JSPUtil.getParameter(request, "rpr_rslt_rpt_atch_flg", ""));
		setQttnCostUsdAmt(JSPUtil.getParameter(request, "qttn_cost_usd_amt", ""));
		setRprInvAtchFlg(JSPUtil.getParameter(request, "rpr_inv_atch_flg", ""));
		setRprEmlSndNo(JSPUtil.getParameter(request, "rpr_eml_snd_no", ""));
		setUstlAcctNo(JSPUtil.getParameter(request, "ustl_acct_no", ""));
		setQttnCostLoclAmt(JSPUtil.getParameter(request, "qttn_cost_locl_amt", ""));
		setRprCostLoclAmt(JSPUtil.getParameter(request, "rpr_cost_locl_amt", ""));
		setRprPictAtchKnt(JSPUtil.getParameter(request, "rpr_pict_atch_knt", ""));
		setRprRmk(JSPUtil.getParameter(request, "rpr_rmk", ""));
		setRprVndrNm(JSPUtil.getParameter(request, "rpr_vndr_nm", ""));
		setRprDt(JSPUtil.getParameter(request, "rpr_dt", ""));
		setStvDmgRprProcStsCd(JSPUtil.getParameter(request, "stv_dmg_rpr_proc_sts_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRunRprAcctNo(JSPUtil.getParameter(request, "run_rpr_acct_no", ""));
		setRprPictAtchFlg(JSPUtil.getParameter(request, "rpr_pict_atch_flg", ""));
		setStvDmgNo(JSPUtil.getParameter(request, "stv_dmg_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfStvDmgRprVO[]
	 */
	public OpfStvDmgRprVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgRprVO[]
	 */
	public OpfStvDmgRprVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgRprVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rprInvAtchKnt = (JSPUtil.getParameter(request, prefix	+ "rpr_inv_atch_knt", length));
			String[] rprCurrCd = (JSPUtil.getParameter(request, prefix	+ "rpr_curr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rprDocAtchKnt = (JSPUtil.getParameter(request, prefix	+ "rpr_doc_atch_knt", length));
			String[] rprRsltRptAtchKnt = (JSPUtil.getParameter(request, prefix	+ "rpr_rslt_rpt_atch_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rprPortCd = (JSPUtil.getParameter(request, prefix	+ "rpr_port_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rprDocAtchFlg = (JSPUtil.getParameter(request, prefix	+ "rpr_doc_atch_flg", length));
			String[] stvDmgRprSeq = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_rpr_seq", length));
			String[] qttnLoclCurrCd = (JSPUtil.getParameter(request, prefix	+ "qttn_locl_curr_cd", length));
			String[] rprCostUsdAmt = (JSPUtil.getParameter(request, prefix	+ "rpr_cost_usd_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rprRsltRptAtchFlg = (JSPUtil.getParameter(request, prefix	+ "rpr_rslt_rpt_atch_flg", length));
			String[] qttnCostUsdAmt = (JSPUtil.getParameter(request, prefix	+ "qttn_cost_usd_amt", length));
			String[] rprInvAtchFlg = (JSPUtil.getParameter(request, prefix	+ "rpr_inv_atch_flg", length));
			String[] rprEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "rpr_eml_snd_no", length));
			String[] ustlAcctNo = (JSPUtil.getParameter(request, prefix	+ "ustl_acct_no", length));
			String[] qttnCostLoclAmt = (JSPUtil.getParameter(request, prefix	+ "qttn_cost_locl_amt", length));
			String[] rprCostLoclAmt = (JSPUtil.getParameter(request, prefix	+ "rpr_cost_locl_amt", length));
			String[] rprPictAtchKnt = (JSPUtil.getParameter(request, prefix	+ "rpr_pict_atch_knt", length));
			String[] rprRmk = (JSPUtil.getParameter(request, prefix	+ "rpr_rmk", length));
			String[] rprVndrNm = (JSPUtil.getParameter(request, prefix	+ "rpr_vndr_nm", length));
			String[] rprDt = (JSPUtil.getParameter(request, prefix	+ "rpr_dt", length));
			String[] stvDmgRprProcStsCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_rpr_proc_sts_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] runRprAcctNo = (JSPUtil.getParameter(request, prefix	+ "run_rpr_acct_no", length));
			String[] rprPictAtchFlg = (JSPUtil.getParameter(request, prefix	+ "rpr_pict_atch_flg", length));
			String[] stvDmgNo = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgRprVO();
				if (rprInvAtchKnt[i] != null)
					model.setRprInvAtchKnt(rprInvAtchKnt[i]);
				if (rprCurrCd[i] != null)
					model.setRprCurrCd(rprCurrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rprDocAtchKnt[i] != null)
					model.setRprDocAtchKnt(rprDocAtchKnt[i]);
				if (rprRsltRptAtchKnt[i] != null)
					model.setRprRsltRptAtchKnt(rprRsltRptAtchKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rprPortCd[i] != null)
					model.setRprPortCd(rprPortCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rprDocAtchFlg[i] != null)
					model.setRprDocAtchFlg(rprDocAtchFlg[i]);
				if (stvDmgRprSeq[i] != null)
					model.setStvDmgRprSeq(stvDmgRprSeq[i]);
				if (qttnLoclCurrCd[i] != null)
					model.setQttnLoclCurrCd(qttnLoclCurrCd[i]);
				if (rprCostUsdAmt[i] != null)
					model.setRprCostUsdAmt(rprCostUsdAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rprRsltRptAtchFlg[i] != null)
					model.setRprRsltRptAtchFlg(rprRsltRptAtchFlg[i]);
				if (qttnCostUsdAmt[i] != null)
					model.setQttnCostUsdAmt(qttnCostUsdAmt[i]);
				if (rprInvAtchFlg[i] != null)
					model.setRprInvAtchFlg(rprInvAtchFlg[i]);
				if (rprEmlSndNo[i] != null)
					model.setRprEmlSndNo(rprEmlSndNo[i]);
				if (ustlAcctNo[i] != null)
					model.setUstlAcctNo(ustlAcctNo[i]);
				if (qttnCostLoclAmt[i] != null)
					model.setQttnCostLoclAmt(qttnCostLoclAmt[i]);
				if (rprCostLoclAmt[i] != null)
					model.setRprCostLoclAmt(rprCostLoclAmt[i]);
				if (rprPictAtchKnt[i] != null)
					model.setRprPictAtchKnt(rprPictAtchKnt[i]);
				if (rprRmk[i] != null)
					model.setRprRmk(rprRmk[i]);
				if (rprVndrNm[i] != null)
					model.setRprVndrNm(rprVndrNm[i]);
				if (rprDt[i] != null)
					model.setRprDt(rprDt[i]);
				if (stvDmgRprProcStsCd[i] != null)
					model.setStvDmgRprProcStsCd(stvDmgRprProcStsCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (runRprAcctNo[i] != null)
					model.setRunRprAcctNo(runRprAcctNo[i]);
				if (rprPictAtchFlg[i] != null)
					model.setRprPictAtchFlg(rprPictAtchFlg[i]);
				if (stvDmgNo[i] != null)
					model.setStvDmgNo(stvDmgNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgRprVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfStvDmgRprVO[]
	 */
	public OpfStvDmgRprVO[] getOpfStvDmgRprVOs(){
		OpfStvDmgRprVO[] vos = (OpfStvDmgRprVO[])models.toArray(new OpfStvDmgRprVO[models.size()]);
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
		this.rprInvAtchKnt = this.rprInvAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprCurrCd = this.rprCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprDocAtchKnt = this.rprDocAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprRsltRptAtchKnt = this.rprRsltRptAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprPortCd = this.rprPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprDocAtchFlg = this.rprDocAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRprSeq = this.stvDmgRprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qttnLoclCurrCd = this.qttnLoclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprCostUsdAmt = this.rprCostUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprRsltRptAtchFlg = this.rprRsltRptAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qttnCostUsdAmt = this.qttnCostUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprInvAtchFlg = this.rprInvAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprEmlSndNo = this.rprEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ustlAcctNo = this.ustlAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qttnCostLoclAmt = this.qttnCostLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprCostLoclAmt = this.rprCostLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprPictAtchKnt = this.rprPictAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprRmk = this.rprRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprVndrNm = this.rprVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprDt = this.rprDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRprProcStsCd = this.stvDmgRprProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runRprAcctNo = this.runRprAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rprPictAtchFlg = this.rprPictAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgNo = this.stvDmgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
