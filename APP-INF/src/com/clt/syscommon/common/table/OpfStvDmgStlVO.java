/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgStlVO.java
*@FileTitle : OpfStvDmgStlVO
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

public class OpfStvDmgStlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgStlVO> models = new ArrayList<OpfStvDmgStlVO>();
	
	/* Column Info */
	private String payDt = null;
	/* Column Info */
	private String stlDocAtchFlg = null;
	/* Column Info */
	private String stlDocAtchKnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bilInvNo = null;
	/* Column Info */
	private String payAcctNo = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String payLoclAmt = null;
	/* Column Info */
	private String stlAproUsrId = null;
	/* Column Info */
	private String shpOwnrCoNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String payUsdAmt = null;
	/* Column Info */
	private String stlRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String stlEmlSndNo = null;
	/* Column Info */
	private String stlInvAtchFlg = null;
	/* Column Info */
	private String stlAproDt = null;
	/* Column Info */
	private String ustlAcctNo = null;
	/* Column Info */
	private String stvDmgStlProcStsCd = null;
	/* Column Info */
	private String stlInvAtchKnt = null;
	/* Column Info */
	private String payCurrCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String runRprAcctNo = null;
	/* Column Info */
	private String stlAproFlg = null;
	/* Column Info */
	private String stvDmgNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgStlVO() {}

	public OpfStvDmgStlVO(String ibflag, String pagerows, String stvDmgNo, String stvDmgStlProcStsCd, String shpOwnrCoNm, String ustlAcctNo, String runRprAcctNo, String bilInvNo, String payDt, String payCurrCd, String payLoclAmt, String payUsdAmt, String payAcctNo, String stlInvAtchFlg, String stlDocAtchFlg, String stlRmk, String stlAproDt, String stlAproFlg, String stlAproUsrId, String stlEmlSndNo, String creUsrId, String creDt, String updUsrId, String updDt, String stlInvAtchKnt, String stlDocAtchKnt) {
		this.payDt = payDt;
		this.stlDocAtchFlg = stlDocAtchFlg;
		this.stlDocAtchKnt = stlDocAtchKnt;
		this.creDt = creDt;
		this.bilInvNo = bilInvNo;
		this.payAcctNo = payAcctNo;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.payLoclAmt = payLoclAmt;
		this.stlAproUsrId = stlAproUsrId;
		this.shpOwnrCoNm = shpOwnrCoNm;
		this.updUsrId = updUsrId;
		this.payUsdAmt = payUsdAmt;
		this.stlRmk = stlRmk;
		this.updDt = updDt;
		this.stlEmlSndNo = stlEmlSndNo;
		this.stlInvAtchFlg = stlInvAtchFlg;
		this.stlAproDt = stlAproDt;
		this.ustlAcctNo = ustlAcctNo;
		this.stvDmgStlProcStsCd = stvDmgStlProcStsCd;
		this.stlInvAtchKnt = stlInvAtchKnt;
		this.payCurrCd = payCurrCd;
		this.creUsrId = creUsrId;
		this.runRprAcctNo = runRprAcctNo;
		this.stlAproFlg = stlAproFlg;
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pay_dt", getPayDt());
		this.hashColumns.put("stl_doc_atch_flg", getStlDocAtchFlg());
		this.hashColumns.put("stl_doc_atch_knt", getStlDocAtchKnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bil_inv_no", getBilInvNo());
		this.hashColumns.put("pay_acct_no", getPayAcctNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pay_locl_amt", getPayLoclAmt());
		this.hashColumns.put("stl_apro_usr_id", getStlAproUsrId());
		this.hashColumns.put("shp_ownr_co_nm", getShpOwnrCoNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pay_usd_amt", getPayUsdAmt());
		this.hashColumns.put("stl_rmk", getStlRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("stl_eml_snd_no", getStlEmlSndNo());
		this.hashColumns.put("stl_inv_atch_flg", getStlInvAtchFlg());
		this.hashColumns.put("stl_apro_dt", getStlAproDt());
		this.hashColumns.put("ustl_acct_no", getUstlAcctNo());
		this.hashColumns.put("stv_dmg_stl_proc_sts_cd", getStvDmgStlProcStsCd());
		this.hashColumns.put("stl_inv_atch_knt", getStlInvAtchKnt());
		this.hashColumns.put("pay_curr_cd", getPayCurrCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("run_rpr_acct_no", getRunRprAcctNo());
		this.hashColumns.put("stl_apro_flg", getStlAproFlg());
		this.hashColumns.put("stv_dmg_no", getStvDmgNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pay_dt", "payDt");
		this.hashFields.put("stl_doc_atch_flg", "stlDocAtchFlg");
		this.hashFields.put("stl_doc_atch_knt", "stlDocAtchKnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bil_inv_no", "bilInvNo");
		this.hashFields.put("pay_acct_no", "payAcctNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pay_locl_amt", "payLoclAmt");
		this.hashFields.put("stl_apro_usr_id", "stlAproUsrId");
		this.hashFields.put("shp_ownr_co_nm", "shpOwnrCoNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pay_usd_amt", "payUsdAmt");
		this.hashFields.put("stl_rmk", "stlRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("stl_eml_snd_no", "stlEmlSndNo");
		this.hashFields.put("stl_inv_atch_flg", "stlInvAtchFlg");
		this.hashFields.put("stl_apro_dt", "stlAproDt");
		this.hashFields.put("ustl_acct_no", "ustlAcctNo");
		this.hashFields.put("stv_dmg_stl_proc_sts_cd", "stvDmgStlProcStsCd");
		this.hashFields.put("stl_inv_atch_knt", "stlInvAtchKnt");
		this.hashFields.put("pay_curr_cd", "payCurrCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("run_rpr_acct_no", "runRprAcctNo");
		this.hashFields.put("stl_apro_flg", "stlAproFlg");
		this.hashFields.put("stv_dmg_no", "stvDmgNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return payDt
	 */
	public String getPayDt() {
		return this.payDt;
	}
	
	/**
	 * Column Info
	 * @return stlDocAtchFlg
	 */
	public String getStlDocAtchFlg() {
		return this.stlDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stlDocAtchKnt
	 */
	public String getStlDocAtchKnt() {
		return this.stlDocAtchKnt;
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
	 * @return bilInvNo
	 */
	public String getBilInvNo() {
		return this.bilInvNo;
	}
	
	/**
	 * Column Info
	 * @return payAcctNo
	 */
	public String getPayAcctNo() {
		return this.payAcctNo;
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
	 * @return payLoclAmt
	 */
	public String getPayLoclAmt() {
		return this.payLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return stlAproUsrId
	 */
	public String getStlAproUsrId() {
		return this.stlAproUsrId;
	}
	
	/**
	 * Column Info
	 * @return shpOwnrCoNm
	 */
	public String getShpOwnrCoNm() {
		return this.shpOwnrCoNm;
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
	 * @return payUsdAmt
	 */
	public String getPayUsdAmt() {
		return this.payUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return stlRmk
	 */
	public String getStlRmk() {
		return this.stlRmk;
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
	 * @return stlEmlSndNo
	 */
	public String getStlEmlSndNo() {
		return this.stlEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return stlInvAtchFlg
	 */
	public String getStlInvAtchFlg() {
		return this.stlInvAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stlAproDt
	 */
	public String getStlAproDt() {
		return this.stlAproDt;
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
	 * @return stvDmgStlProcStsCd
	 */
	public String getStvDmgStlProcStsCd() {
		return this.stvDmgStlProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return stlInvAtchKnt
	 */
	public String getStlInvAtchKnt() {
		return this.stlInvAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return payCurrCd
	 */
	public String getPayCurrCd() {
		return this.payCurrCd;
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
	 * @return stlAproFlg
	 */
	public String getStlAproFlg() {
		return this.stlAproFlg;
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
	 * @param payDt
	 */
	public void setPayDt(String payDt) {
		this.payDt = payDt;
	}
	
	/**
	 * Column Info
	 * @param stlDocAtchFlg
	 */
	public void setStlDocAtchFlg(String stlDocAtchFlg) {
		this.stlDocAtchFlg = stlDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stlDocAtchKnt
	 */
	public void setStlDocAtchKnt(String stlDocAtchKnt) {
		this.stlDocAtchKnt = stlDocAtchKnt;
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
	 * @param bilInvNo
	 */
	public void setBilInvNo(String bilInvNo) {
		this.bilInvNo = bilInvNo;
	}
	
	/**
	 * Column Info
	 * @param payAcctNo
	 */
	public void setPayAcctNo(String payAcctNo) {
		this.payAcctNo = payAcctNo;
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
	 * @param payLoclAmt
	 */
	public void setPayLoclAmt(String payLoclAmt) {
		this.payLoclAmt = payLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param stlAproUsrId
	 */
	public void setStlAproUsrId(String stlAproUsrId) {
		this.stlAproUsrId = stlAproUsrId;
	}
	
	/**
	 * Column Info
	 * @param shpOwnrCoNm
	 */
	public void setShpOwnrCoNm(String shpOwnrCoNm) {
		this.shpOwnrCoNm = shpOwnrCoNm;
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
	 * @param payUsdAmt
	 */
	public void setPayUsdAmt(String payUsdAmt) {
		this.payUsdAmt = payUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param stlRmk
	 */
	public void setStlRmk(String stlRmk) {
		this.stlRmk = stlRmk;
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
	 * @param stlEmlSndNo
	 */
	public void setStlEmlSndNo(String stlEmlSndNo) {
		this.stlEmlSndNo = stlEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param stlInvAtchFlg
	 */
	public void setStlInvAtchFlg(String stlInvAtchFlg) {
		this.stlInvAtchFlg = stlInvAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stlAproDt
	 */
	public void setStlAproDt(String stlAproDt) {
		this.stlAproDt = stlAproDt;
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
	 * @param stvDmgStlProcStsCd
	 */
	public void setStvDmgStlProcStsCd(String stvDmgStlProcStsCd) {
		this.stvDmgStlProcStsCd = stvDmgStlProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param stlInvAtchKnt
	 */
	public void setStlInvAtchKnt(String stlInvAtchKnt) {
		this.stlInvAtchKnt = stlInvAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param payCurrCd
	 */
	public void setPayCurrCd(String payCurrCd) {
		this.payCurrCd = payCurrCd;
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
	 * @param stlAproFlg
	 */
	public void setStlAproFlg(String stlAproFlg) {
		this.stlAproFlg = stlAproFlg;
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
		setPayDt(JSPUtil.getParameter(request, "pay_dt", ""));
		setStlDocAtchFlg(JSPUtil.getParameter(request, "stl_doc_atch_flg", ""));
		setStlDocAtchKnt(JSPUtil.getParameter(request, "stl_doc_atch_knt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBilInvNo(JSPUtil.getParameter(request, "bil_inv_no", ""));
		setPayAcctNo(JSPUtil.getParameter(request, "pay_acct_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPayLoclAmt(JSPUtil.getParameter(request, "pay_locl_amt", ""));
		setStlAproUsrId(JSPUtil.getParameter(request, "stl_apro_usr_id", ""));
		setShpOwnrCoNm(JSPUtil.getParameter(request, "shp_ownr_co_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPayUsdAmt(JSPUtil.getParameter(request, "pay_usd_amt", ""));
		setStlRmk(JSPUtil.getParameter(request, "stl_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setStlEmlSndNo(JSPUtil.getParameter(request, "stl_eml_snd_no", ""));
		setStlInvAtchFlg(JSPUtil.getParameter(request, "stl_inv_atch_flg", ""));
		setStlAproDt(JSPUtil.getParameter(request, "stl_apro_dt", ""));
		setUstlAcctNo(JSPUtil.getParameter(request, "ustl_acct_no", ""));
		setStvDmgStlProcStsCd(JSPUtil.getParameter(request, "stv_dmg_stl_proc_sts_cd", ""));
		setStlInvAtchKnt(JSPUtil.getParameter(request, "stl_inv_atch_knt", ""));
		setPayCurrCd(JSPUtil.getParameter(request, "pay_curr_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRunRprAcctNo(JSPUtil.getParameter(request, "run_rpr_acct_no", ""));
		setStlAproFlg(JSPUtil.getParameter(request, "stl_apro_flg", ""));
		setStvDmgNo(JSPUtil.getParameter(request, "stv_dmg_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfStvDmgStlVO[]
	 */
	public OpfStvDmgStlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgStlVO[]
	 */
	public OpfStvDmgStlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgStlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] payDt = (JSPUtil.getParameter(request, prefix	+ "pay_dt", length));
			String[] stlDocAtchFlg = (JSPUtil.getParameter(request, prefix	+ "stl_doc_atch_flg", length));
			String[] stlDocAtchKnt = (JSPUtil.getParameter(request, prefix	+ "stl_doc_atch_knt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bilInvNo = (JSPUtil.getParameter(request, prefix	+ "bil_inv_no", length));
			String[] payAcctNo = (JSPUtil.getParameter(request, prefix	+ "pay_acct_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] payLoclAmt = (JSPUtil.getParameter(request, prefix	+ "pay_locl_amt", length));
			String[] stlAproUsrId = (JSPUtil.getParameter(request, prefix	+ "stl_apro_usr_id", length));
			String[] shpOwnrCoNm = (JSPUtil.getParameter(request, prefix	+ "shp_ownr_co_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] payUsdAmt = (JSPUtil.getParameter(request, prefix	+ "pay_usd_amt", length));
			String[] stlRmk = (JSPUtil.getParameter(request, prefix	+ "stl_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] stlEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "stl_eml_snd_no", length));
			String[] stlInvAtchFlg = (JSPUtil.getParameter(request, prefix	+ "stl_inv_atch_flg", length));
			String[] stlAproDt = (JSPUtil.getParameter(request, prefix	+ "stl_apro_dt", length));
			String[] ustlAcctNo = (JSPUtil.getParameter(request, prefix	+ "ustl_acct_no", length));
			String[] stvDmgStlProcStsCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_stl_proc_sts_cd", length));
			String[] stlInvAtchKnt = (JSPUtil.getParameter(request, prefix	+ "stl_inv_atch_knt", length));
			String[] payCurrCd = (JSPUtil.getParameter(request, prefix	+ "pay_curr_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] runRprAcctNo = (JSPUtil.getParameter(request, prefix	+ "run_rpr_acct_no", length));
			String[] stlAproFlg = (JSPUtil.getParameter(request, prefix	+ "stl_apro_flg", length));
			String[] stvDmgNo = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgStlVO();
				if (payDt[i] != null)
					model.setPayDt(payDt[i]);
				if (stlDocAtchFlg[i] != null)
					model.setStlDocAtchFlg(stlDocAtchFlg[i]);
				if (stlDocAtchKnt[i] != null)
					model.setStlDocAtchKnt(stlDocAtchKnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bilInvNo[i] != null)
					model.setBilInvNo(bilInvNo[i]);
				if (payAcctNo[i] != null)
					model.setPayAcctNo(payAcctNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (payLoclAmt[i] != null)
					model.setPayLoclAmt(payLoclAmt[i]);
				if (stlAproUsrId[i] != null)
					model.setStlAproUsrId(stlAproUsrId[i]);
				if (shpOwnrCoNm[i] != null)
					model.setShpOwnrCoNm(shpOwnrCoNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (payUsdAmt[i] != null)
					model.setPayUsdAmt(payUsdAmt[i]);
				if (stlRmk[i] != null)
					model.setStlRmk(stlRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (stlEmlSndNo[i] != null)
					model.setStlEmlSndNo(stlEmlSndNo[i]);
				if (stlInvAtchFlg[i] != null)
					model.setStlInvAtchFlg(stlInvAtchFlg[i]);
				if (stlAproDt[i] != null)
					model.setStlAproDt(stlAproDt[i]);
				if (ustlAcctNo[i] != null)
					model.setUstlAcctNo(ustlAcctNo[i]);
				if (stvDmgStlProcStsCd[i] != null)
					model.setStvDmgStlProcStsCd(stvDmgStlProcStsCd[i]);
				if (stlInvAtchKnt[i] != null)
					model.setStlInvAtchKnt(stlInvAtchKnt[i]);
				if (payCurrCd[i] != null)
					model.setPayCurrCd(payCurrCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (runRprAcctNo[i] != null)
					model.setRunRprAcctNo(runRprAcctNo[i]);
				if (stlAproFlg[i] != null)
					model.setStlAproFlg(stlAproFlg[i]);
				if (stvDmgNo[i] != null)
					model.setStvDmgNo(stvDmgNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgStlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfStvDmgStlVO[]
	 */
	public OpfStvDmgStlVO[] getOpfStvDmgStlVOs(){
		OpfStvDmgStlVO[] vos = (OpfStvDmgStlVO[])models.toArray(new OpfStvDmgStlVO[models.size()]);
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
		this.payDt = this.payDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlDocAtchFlg = this.stlDocAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlDocAtchKnt = this.stlDocAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilInvNo = this.bilInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payAcctNo = this.payAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payLoclAmt = this.payLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlAproUsrId = this.stlAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shpOwnrCoNm = this.shpOwnrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payUsdAmt = this.payUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlRmk = this.stlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlEmlSndNo = this.stlEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlInvAtchFlg = this.stlInvAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlAproDt = this.stlAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ustlAcctNo = this.ustlAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgStlProcStsCd = this.stvDmgStlProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlInvAtchKnt = this.stlInvAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payCurrCd = this.payCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runRprAcctNo = this.runRprAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlAproFlg = this.stlAproFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgNo = this.stvDmgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
