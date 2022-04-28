/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaFxAmtDtrbVO.java
*@FileTitle : CoaFxAmtDtrbVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaFxAmtDtrbVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaFxAmtDtrbVO> models = new ArrayList<CoaFxAmtDtrbVO>();
	
	/* Column Info */
	private String toIocCd = null;
	/* Column Info */
	private String toTrdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tsUcAmt = null;
	/* Column Info */
	private String fmTrdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cmmtBseCostAmt = null;
	/* Column Info */
	private String fmVslCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String n4thFxCostDtrbAmt = null;
	/* Column Info */
	private String cmlBseCostAmt = null;
	/* Column Info */
	private String fmIocCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fxCostDtrbAmt = null;
	/* Column Info */
	private String fmSkdVoyNo = null;
	/* Column Info */
	private String toVslCd = null;
	/* Column Info */
	private String toRlaneCd = null;
	/* Column Info */
	private String tsCtrbBseCostAmt = null;
	/* Column Info */
	private String toSkdVoyNo = null;
	/* Column Info */
	private String bsaBseCostAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fmSkdDirCd = null;
	/* Column Info */
	private String fmRlaneCd = null;
	/* Column Info */
	private String cmmtQty = null;
	/* Column Info */
	private String cmmtBseCostRto = null;
	/* Column Info */
	private String toSkdDirCd = null;
	/* Column Info */
	private String loclTsStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaFxAmtDtrbVO() {}

	public CoaFxAmtDtrbVO(String ibflag, String pagerows, String fmTrdCd, String fmRlaneCd, String fmIocCd, String fmVslCd, String fmSkdVoyNo, String fmSkdDirCd, String toTrdCd, String toRlaneCd, String toIocCd, String toVslCd, String toSkdVoyNo, String toSkdDirCd, String stndCostCd, String fxCostDtrbAmt, String tsUcAmt, String loclTsStsCd, String cmlBseCostAmt, String bsaBseCostAmt, String tsCtrbBseCostAmt, String cmmtQty, String cmmtBseCostRto, String cmmtBseCostAmt, String creUsrId, String creDt, String updUsrId, String updDt, String n4thFxCostDtrbAmt) {
		this.toIocCd = toIocCd;
		this.toTrdCd = toTrdCd;
		this.creDt = creDt;
		this.tsUcAmt = tsUcAmt;
		this.fmTrdCd = fmTrdCd;
		this.pagerows = pagerows;
		this.cmmtBseCostAmt = cmmtBseCostAmt;
		this.fmVslCd = fmVslCd;
		this.ibflag = ibflag;
		this.n4thFxCostDtrbAmt = n4thFxCostDtrbAmt;
		this.cmlBseCostAmt = cmlBseCostAmt;
		this.fmIocCd = fmIocCd;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		this.updDt = updDt;
		this.fxCostDtrbAmt = fxCostDtrbAmt;
		this.fmSkdVoyNo = fmSkdVoyNo;
		this.toVslCd = toVslCd;
		this.toRlaneCd = toRlaneCd;
		this.tsCtrbBseCostAmt = tsCtrbBseCostAmt;
		this.toSkdVoyNo = toSkdVoyNo;
		this.bsaBseCostAmt = bsaBseCostAmt;
		this.creUsrId = creUsrId;
		this.fmSkdDirCd = fmSkdDirCd;
		this.fmRlaneCd = fmRlaneCd;
		this.cmmtQty = cmmtQty;
		this.cmmtBseCostRto = cmmtBseCostRto;
		this.toSkdDirCd = toSkdDirCd;
		this.loclTsStsCd = loclTsStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_ioc_cd", getToIocCd());
		this.hashColumns.put("to_trd_cd", getToTrdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ts_uc_amt", getTsUcAmt());
		this.hashColumns.put("fm_trd_cd", getFmTrdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cmmt_bse_cost_amt", getCmmtBseCostAmt());
		this.hashColumns.put("fm_vsl_cd", getFmVslCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("n4th_fx_cost_dtrb_amt", getN4thFxCostDtrbAmt());
		this.hashColumns.put("cml_bse_cost_amt", getCmlBseCostAmt());
		this.hashColumns.put("fm_ioc_cd", getFmIocCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fx_cost_dtrb_amt", getFxCostDtrbAmt());
		this.hashColumns.put("fm_skd_voy_no", getFmSkdVoyNo());
		this.hashColumns.put("to_vsl_cd", getToVslCd());
		this.hashColumns.put("to_rlane_cd", getToRlaneCd());
		this.hashColumns.put("ts_ctrb_bse_cost_amt", getTsCtrbBseCostAmt());
		this.hashColumns.put("to_skd_voy_no", getToSkdVoyNo());
		this.hashColumns.put("bsa_bse_cost_amt", getBsaBseCostAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fm_skd_dir_cd", getFmSkdDirCd());
		this.hashColumns.put("fm_rlane_cd", getFmRlaneCd());
		this.hashColumns.put("cmmt_qty", getCmmtQty());
		this.hashColumns.put("cmmt_bse_cost_rto", getCmmtBseCostRto());
		this.hashColumns.put("to_skd_dir_cd", getToSkdDirCd());
		this.hashColumns.put("locl_ts_sts_cd", getLoclTsStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_ioc_cd", "toIocCd");
		this.hashFields.put("to_trd_cd", "toTrdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ts_uc_amt", "tsUcAmt");
		this.hashFields.put("fm_trd_cd", "fmTrdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cmmt_bse_cost_amt", "cmmtBseCostAmt");
		this.hashFields.put("fm_vsl_cd", "fmVslCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("n4th_fx_cost_dtrb_amt", "n4thFxCostDtrbAmt");
		this.hashFields.put("cml_bse_cost_amt", "cmlBseCostAmt");
		this.hashFields.put("fm_ioc_cd", "fmIocCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fx_cost_dtrb_amt", "fxCostDtrbAmt");
		this.hashFields.put("fm_skd_voy_no", "fmSkdVoyNo");
		this.hashFields.put("to_vsl_cd", "toVslCd");
		this.hashFields.put("to_rlane_cd", "toRlaneCd");
		this.hashFields.put("ts_ctrb_bse_cost_amt", "tsCtrbBseCostAmt");
		this.hashFields.put("to_skd_voy_no", "toSkdVoyNo");
		this.hashFields.put("bsa_bse_cost_amt", "bsaBseCostAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fm_skd_dir_cd", "fmSkdDirCd");
		this.hashFields.put("fm_rlane_cd", "fmRlaneCd");
		this.hashFields.put("cmmt_qty", "cmmtQty");
		this.hashFields.put("cmmt_bse_cost_rto", "cmmtBseCostRto");
		this.hashFields.put("to_skd_dir_cd", "toSkdDirCd");
		this.hashFields.put("locl_ts_sts_cd", "loclTsStsCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return toIocCd
	 */
	public String getToIocCd() {
		return this.toIocCd;
	}
	
	/**
	 * Column Info
	 * @return toTrdCd
	 */
	public String getToTrdCd() {
		return this.toTrdCd;
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
	 * @return tsUcAmt
	 */
	public String getTsUcAmt() {
		return this.tsUcAmt;
	}
	
	/**
	 * Column Info
	 * @return fmTrdCd
	 */
	public String getFmTrdCd() {
		return this.fmTrdCd;
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
	 * @return cmmtBseCostAmt
	 */
	public String getCmmtBseCostAmt() {
		return this.cmmtBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @return fmVslCd
	 */
	public String getFmVslCd() {
		return this.fmVslCd;
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
	 * @return n4thFxCostDtrbAmt
	 */
	public String getN4thFxCostDtrbAmt() {
		return this.n4thFxCostDtrbAmt;
	}
	
	/**
	 * Column Info
	 * @return cmlBseCostAmt
	 */
	public String getCmlBseCostAmt() {
		return this.cmlBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @return fmIocCd
	 */
	public String getFmIocCd() {
		return this.fmIocCd;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
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
	 * @return fxCostDtrbAmt
	 */
	public String getFxCostDtrbAmt() {
		return this.fxCostDtrbAmt;
	}
	
	/**
	 * Column Info
	 * @return fmSkdVoyNo
	 */
	public String getFmSkdVoyNo() {
		return this.fmSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return toVslCd
	 */
	public String getToVslCd() {
		return this.toVslCd;
	}
	
	/**
	 * Column Info
	 * @return toRlaneCd
	 */
	public String getToRlaneCd() {
		return this.toRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return tsCtrbBseCostAmt
	 */
	public String getTsCtrbBseCostAmt() {
		return this.tsCtrbBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @return toSkdVoyNo
	 */
	public String getToSkdVoyNo() {
		return this.toSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return bsaBseCostAmt
	 */
	public String getBsaBseCostAmt() {
		return this.bsaBseCostAmt;
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
	 * @return fmSkdDirCd
	 */
	public String getFmSkdDirCd() {
		return this.fmSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return fmRlaneCd
	 */
	public String getFmRlaneCd() {
		return this.fmRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return cmmtQty
	 */
	public String getCmmtQty() {
		return this.cmmtQty;
	}
	
	/**
	 * Column Info
	 * @return cmmtBseCostRto
	 */
	public String getCmmtBseCostRto() {
		return this.cmmtBseCostRto;
	}
	
	/**
	 * Column Info
	 * @return toSkdDirCd
	 */
	public String getToSkdDirCd() {
		return this.toSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return loclTsStsCd
	 */
	public String getLoclTsStsCd() {
		return this.loclTsStsCd;
	}
	

	/**
	 * Column Info
	 * @param toIocCd
	 */
	public void setToIocCd(String toIocCd) {
		this.toIocCd = toIocCd;
	}
	
	/**
	 * Column Info
	 * @param toTrdCd
	 */
	public void setToTrdCd(String toTrdCd) {
		this.toTrdCd = toTrdCd;
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
	 * @param tsUcAmt
	 */
	public void setTsUcAmt(String tsUcAmt) {
		this.tsUcAmt = tsUcAmt;
	}
	
	/**
	 * Column Info
	 * @param fmTrdCd
	 */
	public void setFmTrdCd(String fmTrdCd) {
		this.fmTrdCd = fmTrdCd;
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
	 * @param cmmtBseCostAmt
	 */
	public void setCmmtBseCostAmt(String cmmtBseCostAmt) {
		this.cmmtBseCostAmt = cmmtBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @param fmVslCd
	 */
	public void setFmVslCd(String fmVslCd) {
		this.fmVslCd = fmVslCd;
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
	 * @param n4thFxCostDtrbAmt
	 */
	public void setN4thFxCostDtrbAmt(String n4thFxCostDtrbAmt) {
		this.n4thFxCostDtrbAmt = n4thFxCostDtrbAmt;
	}
	
	/**
	 * Column Info
	 * @param cmlBseCostAmt
	 */
	public void setCmlBseCostAmt(String cmlBseCostAmt) {
		this.cmlBseCostAmt = cmlBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @param fmIocCd
	 */
	public void setFmIocCd(String fmIocCd) {
		this.fmIocCd = fmIocCd;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
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
	 * @param fxCostDtrbAmt
	 */
	public void setFxCostDtrbAmt(String fxCostDtrbAmt) {
		this.fxCostDtrbAmt = fxCostDtrbAmt;
	}
	
	/**
	 * Column Info
	 * @param fmSkdVoyNo
	 */
	public void setFmSkdVoyNo(String fmSkdVoyNo) {
		this.fmSkdVoyNo = fmSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param toVslCd
	 */
	public void setToVslCd(String toVslCd) {
		this.toVslCd = toVslCd;
	}
	
	/**
	 * Column Info
	 * @param toRlaneCd
	 */
	public void setToRlaneCd(String toRlaneCd) {
		this.toRlaneCd = toRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param tsCtrbBseCostAmt
	 */
	public void setTsCtrbBseCostAmt(String tsCtrbBseCostAmt) {
		this.tsCtrbBseCostAmt = tsCtrbBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @param toSkdVoyNo
	 */
	public void setToSkdVoyNo(String toSkdVoyNo) {
		this.toSkdVoyNo = toSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param bsaBseCostAmt
	 */
	public void setBsaBseCostAmt(String bsaBseCostAmt) {
		this.bsaBseCostAmt = bsaBseCostAmt;
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
	 * @param fmSkdDirCd
	 */
	public void setFmSkdDirCd(String fmSkdDirCd) {
		this.fmSkdDirCd = fmSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param fmRlaneCd
	 */
	public void setFmRlaneCd(String fmRlaneCd) {
		this.fmRlaneCd = fmRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param cmmtQty
	 */
	public void setCmmtQty(String cmmtQty) {
		this.cmmtQty = cmmtQty;
	}
	
	/**
	 * Column Info
	 * @param cmmtBseCostRto
	 */
	public void setCmmtBseCostRto(String cmmtBseCostRto) {
		this.cmmtBseCostRto = cmmtBseCostRto;
	}
	
	/**
	 * Column Info
	 * @param toSkdDirCd
	 */
	public void setToSkdDirCd(String toSkdDirCd) {
		this.toSkdDirCd = toSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param loclTsStsCd
	 */
	public void setLoclTsStsCd(String loclTsStsCd) {
		this.loclTsStsCd = loclTsStsCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setToIocCd(JSPUtil.getParameter(request, "to_ioc_cd", ""));
		setToTrdCd(JSPUtil.getParameter(request, "to_trd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTsUcAmt(JSPUtil.getParameter(request, "ts_uc_amt", ""));
		setFmTrdCd(JSPUtil.getParameter(request, "fm_trd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCmmtBseCostAmt(JSPUtil.getParameter(request, "cmmt_bse_cost_amt", ""));
		setFmVslCd(JSPUtil.getParameter(request, "fm_vsl_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setN4thFxCostDtrbAmt(JSPUtil.getParameter(request, "n4th_fx_cost_dtrb_amt", ""));
		setCmlBseCostAmt(JSPUtil.getParameter(request, "cml_bse_cost_amt", ""));
		setFmIocCd(JSPUtil.getParameter(request, "fm_ioc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFxCostDtrbAmt(JSPUtil.getParameter(request, "fx_cost_dtrb_amt", ""));
		setFmSkdVoyNo(JSPUtil.getParameter(request, "fm_skd_voy_no", ""));
		setToVslCd(JSPUtil.getParameter(request, "to_vsl_cd", ""));
		setToRlaneCd(JSPUtil.getParameter(request, "to_rlane_cd", ""));
		setTsCtrbBseCostAmt(JSPUtil.getParameter(request, "ts_ctrb_bse_cost_amt", ""));
		setToSkdVoyNo(JSPUtil.getParameter(request, "to_skd_voy_no", ""));
		setBsaBseCostAmt(JSPUtil.getParameter(request, "bsa_bse_cost_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFmSkdDirCd(JSPUtil.getParameter(request, "fm_skd_dir_cd", ""));
		setFmRlaneCd(JSPUtil.getParameter(request, "fm_rlane_cd", ""));
		setCmmtQty(JSPUtil.getParameter(request, "cmmt_qty", ""));
		setCmmtBseCostRto(JSPUtil.getParameter(request, "cmmt_bse_cost_rto", ""));
		setToSkdDirCd(JSPUtil.getParameter(request, "to_skd_dir_cd", ""));
		setLoclTsStsCd(JSPUtil.getParameter(request, "locl_ts_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaFxAmtDtrbVO[]
	 */
	public CoaFxAmtDtrbVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaFxAmtDtrbVO[]
	 */
	public CoaFxAmtDtrbVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaFxAmtDtrbVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toIocCd = (JSPUtil.getParameter(request, prefix	+ "to_ioc_cd", length));
			String[] toTrdCd = (JSPUtil.getParameter(request, prefix	+ "to_trd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tsUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_uc_amt", length));
			String[] fmTrdCd = (JSPUtil.getParameter(request, prefix	+ "fm_trd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cmmtBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "cmmt_bse_cost_amt", length));
			String[] fmVslCd = (JSPUtil.getParameter(request, prefix	+ "fm_vsl_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] n4thFxCostDtrbAmt = (JSPUtil.getParameter(request, prefix	+ "n4th_fx_cost_dtrb_amt", length));
			String[] cmlBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "cml_bse_cost_amt", length));
			String[] fmIocCd = (JSPUtil.getParameter(request, prefix	+ "fm_ioc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fxCostDtrbAmt = (JSPUtil.getParameter(request, prefix	+ "fx_cost_dtrb_amt", length));
			String[] fmSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "fm_skd_voy_no", length));
			String[] toVslCd = (JSPUtil.getParameter(request, prefix	+ "to_vsl_cd", length));
			String[] toRlaneCd = (JSPUtil.getParameter(request, prefix	+ "to_rlane_cd", length));
			String[] tsCtrbBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "ts_ctrb_bse_cost_amt", length));
			String[] toSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "to_skd_voy_no", length));
			String[] bsaBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "bsa_bse_cost_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fmSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "fm_skd_dir_cd", length));
			String[] fmRlaneCd = (JSPUtil.getParameter(request, prefix	+ "fm_rlane_cd", length));
			String[] cmmtQty = (JSPUtil.getParameter(request, prefix	+ "cmmt_qty", length));
			String[] cmmtBseCostRto = (JSPUtil.getParameter(request, prefix	+ "cmmt_bse_cost_rto", length));
			String[] toSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "to_skd_dir_cd", length));
			String[] loclTsStsCd = (JSPUtil.getParameter(request, prefix	+ "locl_ts_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaFxAmtDtrbVO();
				if (toIocCd[i] != null)
					model.setToIocCd(toIocCd[i]);
				if (toTrdCd[i] != null)
					model.setToTrdCd(toTrdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tsUcAmt[i] != null)
					model.setTsUcAmt(tsUcAmt[i]);
				if (fmTrdCd[i] != null)
					model.setFmTrdCd(fmTrdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cmmtBseCostAmt[i] != null)
					model.setCmmtBseCostAmt(cmmtBseCostAmt[i]);
				if (fmVslCd[i] != null)
					model.setFmVslCd(fmVslCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (n4thFxCostDtrbAmt[i] != null)
					model.setN4thFxCostDtrbAmt(n4thFxCostDtrbAmt[i]);
				if (cmlBseCostAmt[i] != null)
					model.setCmlBseCostAmt(cmlBseCostAmt[i]);
				if (fmIocCd[i] != null)
					model.setFmIocCd(fmIocCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fxCostDtrbAmt[i] != null)
					model.setFxCostDtrbAmt(fxCostDtrbAmt[i]);
				if (fmSkdVoyNo[i] != null)
					model.setFmSkdVoyNo(fmSkdVoyNo[i]);
				if (toVslCd[i] != null)
					model.setToVslCd(toVslCd[i]);
				if (toRlaneCd[i] != null)
					model.setToRlaneCd(toRlaneCd[i]);
				if (tsCtrbBseCostAmt[i] != null)
					model.setTsCtrbBseCostAmt(tsCtrbBseCostAmt[i]);
				if (toSkdVoyNo[i] != null)
					model.setToSkdVoyNo(toSkdVoyNo[i]);
				if (bsaBseCostAmt[i] != null)
					model.setBsaBseCostAmt(bsaBseCostAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fmSkdDirCd[i] != null)
					model.setFmSkdDirCd(fmSkdDirCd[i]);
				if (fmRlaneCd[i] != null)
					model.setFmRlaneCd(fmRlaneCd[i]);
				if (cmmtQty[i] != null)
					model.setCmmtQty(cmmtQty[i]);
				if (cmmtBseCostRto[i] != null)
					model.setCmmtBseCostRto(cmmtBseCostRto[i]);
				if (toSkdDirCd[i] != null)
					model.setToSkdDirCd(toSkdDirCd[i]);
				if (loclTsStsCd[i] != null)
					model.setLoclTsStsCd(loclTsStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaFxAmtDtrbVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaFxAmtDtrbVO[]
	 */
	public CoaFxAmtDtrbVO[] getCoaFxAmtDtrbVOs(){
		CoaFxAmtDtrbVO[] vos = (CoaFxAmtDtrbVO[])models.toArray(new CoaFxAmtDtrbVO[models.size()]);
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
		this.toIocCd = this.toIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrdCd = this.toTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsUcAmt = this.tsUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrdCd = this.fmTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmmtBseCostAmt = this.cmmtBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmVslCd = this.fmVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thFxCostDtrbAmt = this.n4thFxCostDtrbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmlBseCostAmt = this.cmlBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmIocCd = this.fmIocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxCostDtrbAmt = this.fxCostDtrbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSkdVoyNo = this.fmSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toVslCd = this.toVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toRlaneCd = this.toRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsCtrbBseCostAmt = this.tsCtrbBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSkdVoyNo = this.toSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaBseCostAmt = this.bsaBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSkdDirCd = this.fmSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmRlaneCd = this.fmRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmmtQty = this.cmmtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmmtBseCostRto = this.cmmtBseCostRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSkdDirCd = this.toSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclTsStsCd = this.loclTsStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
