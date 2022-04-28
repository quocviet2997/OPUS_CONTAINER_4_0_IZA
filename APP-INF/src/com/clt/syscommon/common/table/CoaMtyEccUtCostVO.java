/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaMtyEccUtCostVO.java
*@FileTitle : CoaMtyEccUtCostVO
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

public class CoaMtyEccUtCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaMtyEccUtCostVO> models = new ArrayList<CoaMtyEccUtCostVO>();
	
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String imbalRto = null;
	/* Column Info */
	private String mtyTrspUcAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String fullTzHrs = null;
	/* Column Info */
	private String mtyUsaCostCd = null;
	/* Column Info */
	private String mtyStvgUcAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String mtyTzHrs = null;
	/* Column Info */
	private String mnusCrTrspUcAmt = null;
	/* Column Info */
	private String mcntrQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String simTzDys = null;
	/* Column Info */
	private String mtyTzDys = null;
	/* Column Info */
	private String cntrIoVolStsCd = null;
	/* Column Info */
	private String simCntrQty = null;
	/* Column Info */
	private String fullTrspUcAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mnusCrCntrQty = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String fcntrQty = null;
	/* Column Info */
	private String simStvgUcAmt = null;
	/* Column Info */
	private String simTrspUcAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String simTzHrs = null;
	/* Column Info */
	private String cntrOrgDestCd = null;
	/* Column Info */
	private String costLocGrpCd = null;
	/* Column Info */
	private String fullStvgUcAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaMtyEccUtCostVO() {}

	public CoaMtyEccUtCostVO(String ibflag, String pagerows, String costYrmon, String costLocGrpCd, String eccCd, String cntrTpszCd, String cntrOrgDestCd, String cntrIoVolStsCd, String imbalRto, String mcntrQty, String mtyStvgUcAmt, String mtyTrspUcAmt, String mtyTzDys, String mtyTzHrs, String simCntrQty, String simStvgUcAmt, String simTrspUcAmt, String simTzDys, String simTzHrs, String fcntrQty, String fullStvgUcAmt, String fullTrspUcAmt, String fullTzHrs, String mnusCrCntrQty, String mnusCrTrspUcAmt, String mtyUsaCostCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.creDt = creDt;
		this.imbalRto = imbalRto;
		this.mtyTrspUcAmt = mtyTrspUcAmt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.fullTzHrs = fullTzHrs;
		this.mtyUsaCostCd = mtyUsaCostCd;
		this.mtyStvgUcAmt = mtyStvgUcAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.mtyTzHrs = mtyTzHrs;
		this.mnusCrTrspUcAmt = mnusCrTrspUcAmt;
		this.mcntrQty = mcntrQty;
		this.updUsrId = updUsrId;
		this.simTzDys = simTzDys;
		this.mtyTzDys = mtyTzDys;
		this.cntrIoVolStsCd = cntrIoVolStsCd;
		this.simCntrQty = simCntrQty;
		this.fullTrspUcAmt = fullTrspUcAmt;
		this.updDt = updDt;
		this.mnusCrCntrQty = mnusCrCntrQty;
		this.eccCd = eccCd;
		this.fcntrQty = fcntrQty;
		this.simStvgUcAmt = simStvgUcAmt;
		this.simTrspUcAmt = simTrspUcAmt;
		this.creUsrId = creUsrId;
		this.simTzHrs = simTzHrs;
		this.cntrOrgDestCd = cntrOrgDestCd;
		this.costLocGrpCd = costLocGrpCd;
		this.fullStvgUcAmt = fullStvgUcAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("imbal_rto", getImbalRto());
		this.hashColumns.put("mty_trsp_uc_amt", getMtyTrspUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("full_tz_hrs", getFullTzHrs());
		this.hashColumns.put("mty_usa_cost_cd", getMtyUsaCostCd());
		this.hashColumns.put("mty_stvg_uc_amt", getMtyStvgUcAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("mty_tz_hrs", getMtyTzHrs());
		this.hashColumns.put("mnus_cr_trsp_uc_amt", getMnusCrTrspUcAmt());
		this.hashColumns.put("mcntr_qty", getMcntrQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sim_tz_dys", getSimTzDys());
		this.hashColumns.put("mty_tz_dys", getMtyTzDys());
		this.hashColumns.put("cntr_io_vol_sts_cd", getCntrIoVolStsCd());
		this.hashColumns.put("sim_cntr_qty", getSimCntrQty());
		this.hashColumns.put("full_trsp_uc_amt", getFullTrspUcAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mnus_cr_cntr_qty", getMnusCrCntrQty());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("fcntr_qty", getFcntrQty());
		this.hashColumns.put("sim_stvg_uc_amt", getSimStvgUcAmt());
		this.hashColumns.put("sim_trsp_uc_amt", getSimTrspUcAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sim_tz_hrs", getSimTzHrs());
		this.hashColumns.put("cntr_org_dest_cd", getCntrOrgDestCd());
		this.hashColumns.put("cost_loc_grp_cd", getCostLocGrpCd());
		this.hashColumns.put("full_stvg_uc_amt", getFullStvgUcAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("imbal_rto", "imbalRto");
		this.hashFields.put("mty_trsp_uc_amt", "mtyTrspUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("full_tz_hrs", "fullTzHrs");
		this.hashFields.put("mty_usa_cost_cd", "mtyUsaCostCd");
		this.hashFields.put("mty_stvg_uc_amt", "mtyStvgUcAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("mty_tz_hrs", "mtyTzHrs");
		this.hashFields.put("mnus_cr_trsp_uc_amt", "mnusCrTrspUcAmt");
		this.hashFields.put("mcntr_qty", "mcntrQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sim_tz_dys", "simTzDys");
		this.hashFields.put("mty_tz_dys", "mtyTzDys");
		this.hashFields.put("cntr_io_vol_sts_cd", "cntrIoVolStsCd");
		this.hashFields.put("sim_cntr_qty", "simCntrQty");
		this.hashFields.put("full_trsp_uc_amt", "fullTrspUcAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mnus_cr_cntr_qty", "mnusCrCntrQty");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("fcntr_qty", "fcntrQty");
		this.hashFields.put("sim_stvg_uc_amt", "simStvgUcAmt");
		this.hashFields.put("sim_trsp_uc_amt", "simTrspUcAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sim_tz_hrs", "simTzHrs");
		this.hashFields.put("cntr_org_dest_cd", "cntrOrgDestCd");
		this.hashFields.put("cost_loc_grp_cd", "costLocGrpCd");
		this.hashFields.put("full_stvg_uc_amt", "fullStvgUcAmt");
		return this.hashFields;
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
	 * @return imbalRto
	 */
	public String getImbalRto() {
		return this.imbalRto;
	}
	
	/**
	 * Column Info
	 * @return mtyTrspUcAmt
	 */
	public String getMtyTrspUcAmt() {
		return this.mtyTrspUcAmt;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return fullTzHrs
	 */
	public String getFullTzHrs() {
		return this.fullTzHrs;
	}
	
	/**
	 * Column Info
	 * @return mtyUsaCostCd
	 */
	public String getMtyUsaCostCd() {
		return this.mtyUsaCostCd;
	}
	
	/**
	 * Column Info
	 * @return mtyStvgUcAmt
	 */
	public String getMtyStvgUcAmt() {
		return this.mtyStvgUcAmt;
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
	 * @return mtyTzHrs
	 */
	public String getMtyTzHrs() {
		return this.mtyTzHrs;
	}
	
	/**
	 * Column Info
	 * @return mnusCrTrspUcAmt
	 */
	public String getMnusCrTrspUcAmt() {
		return this.mnusCrTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @return mcntrQty
	 */
	public String getMcntrQty() {
		return this.mcntrQty;
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
	 * @return simTzDys
	 */
	public String getSimTzDys() {
		return this.simTzDys;
	}
	
	/**
	 * Column Info
	 * @return mtyTzDys
	 */
	public String getMtyTzDys() {
		return this.mtyTzDys;
	}
	
	/**
	 * Column Info
	 * @return cntrIoVolStsCd
	 */
	public String getCntrIoVolStsCd() {
		return this.cntrIoVolStsCd;
	}
	
	/**
	 * Column Info
	 * @return simCntrQty
	 */
	public String getSimCntrQty() {
		return this.simCntrQty;
	}
	
	/**
	 * Column Info
	 * @return fullTrspUcAmt
	 */
	public String getFullTrspUcAmt() {
		return this.fullTrspUcAmt;
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
	 * @return mnusCrCntrQty
	 */
	public String getMnusCrCntrQty() {
		return this.mnusCrCntrQty;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return fcntrQty
	 */
	public String getFcntrQty() {
		return this.fcntrQty;
	}
	
	/**
	 * Column Info
	 * @return simStvgUcAmt
	 */
	public String getSimStvgUcAmt() {
		return this.simStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @return simTrspUcAmt
	 */
	public String getSimTrspUcAmt() {
		return this.simTrspUcAmt;
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
	 * @return simTzHrs
	 */
	public String getSimTzHrs() {
		return this.simTzHrs;
	}
	
	/**
	 * Column Info
	 * @return cntrOrgDestCd
	 */
	public String getCntrOrgDestCd() {
		return this.cntrOrgDestCd;
	}
	
	/**
	 * Column Info
	 * @return costLocGrpCd
	 */
	public String getCostLocGrpCd() {
		return this.costLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @return fullStvgUcAmt
	 */
	public String getFullStvgUcAmt() {
		return this.fullStvgUcAmt;
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
	 * @param imbalRto
	 */
	public void setImbalRto(String imbalRto) {
		this.imbalRto = imbalRto;
	}
	
	/**
	 * Column Info
	 * @param mtyTrspUcAmt
	 */
	public void setMtyTrspUcAmt(String mtyTrspUcAmt) {
		this.mtyTrspUcAmt = mtyTrspUcAmt;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param fullTzHrs
	 */
	public void setFullTzHrs(String fullTzHrs) {
		this.fullTzHrs = fullTzHrs;
	}
	
	/**
	 * Column Info
	 * @param mtyUsaCostCd
	 */
	public void setMtyUsaCostCd(String mtyUsaCostCd) {
		this.mtyUsaCostCd = mtyUsaCostCd;
	}
	
	/**
	 * Column Info
	 * @param mtyStvgUcAmt
	 */
	public void setMtyStvgUcAmt(String mtyStvgUcAmt) {
		this.mtyStvgUcAmt = mtyStvgUcAmt;
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
	 * @param mtyTzHrs
	 */
	public void setMtyTzHrs(String mtyTzHrs) {
		this.mtyTzHrs = mtyTzHrs;
	}
	
	/**
	 * Column Info
	 * @param mnusCrTrspUcAmt
	 */
	public void setMnusCrTrspUcAmt(String mnusCrTrspUcAmt) {
		this.mnusCrTrspUcAmt = mnusCrTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @param mcntrQty
	 */
	public void setMcntrQty(String mcntrQty) {
		this.mcntrQty = mcntrQty;
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
	 * @param simTzDys
	 */
	public void setSimTzDys(String simTzDys) {
		this.simTzDys = simTzDys;
	}
	
	/**
	 * Column Info
	 * @param mtyTzDys
	 */
	public void setMtyTzDys(String mtyTzDys) {
		this.mtyTzDys = mtyTzDys;
	}
	
	/**
	 * Column Info
	 * @param cntrIoVolStsCd
	 */
	public void setCntrIoVolStsCd(String cntrIoVolStsCd) {
		this.cntrIoVolStsCd = cntrIoVolStsCd;
	}
	
	/**
	 * Column Info
	 * @param simCntrQty
	 */
	public void setSimCntrQty(String simCntrQty) {
		this.simCntrQty = simCntrQty;
	}
	
	/**
	 * Column Info
	 * @param fullTrspUcAmt
	 */
	public void setFullTrspUcAmt(String fullTrspUcAmt) {
		this.fullTrspUcAmt = fullTrspUcAmt;
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
	 * @param mnusCrCntrQty
	 */
	public void setMnusCrCntrQty(String mnusCrCntrQty) {
		this.mnusCrCntrQty = mnusCrCntrQty;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param fcntrQty
	 */
	public void setFcntrQty(String fcntrQty) {
		this.fcntrQty = fcntrQty;
	}
	
	/**
	 * Column Info
	 * @param simStvgUcAmt
	 */
	public void setSimStvgUcAmt(String simStvgUcAmt) {
		this.simStvgUcAmt = simStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @param simTrspUcAmt
	 */
	public void setSimTrspUcAmt(String simTrspUcAmt) {
		this.simTrspUcAmt = simTrspUcAmt;
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
	 * @param simTzHrs
	 */
	public void setSimTzHrs(String simTzHrs) {
		this.simTzHrs = simTzHrs;
	}
	
	/**
	 * Column Info
	 * @param cntrOrgDestCd
	 */
	public void setCntrOrgDestCd(String cntrOrgDestCd) {
		this.cntrOrgDestCd = cntrOrgDestCd;
	}
	
	/**
	 * Column Info
	 * @param costLocGrpCd
	 */
	public void setCostLocGrpCd(String costLocGrpCd) {
		this.costLocGrpCd = costLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @param fullStvgUcAmt
	 */
	public void setFullStvgUcAmt(String fullStvgUcAmt) {
		this.fullStvgUcAmt = fullStvgUcAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setImbalRto(JSPUtil.getParameter(request, "imbal_rto", ""));
		setMtyTrspUcAmt(JSPUtil.getParameter(request, "mty_trsp_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setFullTzHrs(JSPUtil.getParameter(request, "full_tz_hrs", ""));
		setMtyUsaCostCd(JSPUtil.getParameter(request, "mty_usa_cost_cd", ""));
		setMtyStvgUcAmt(JSPUtil.getParameter(request, "mty_stvg_uc_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setMtyTzHrs(JSPUtil.getParameter(request, "mty_tz_hrs", ""));
		setMnusCrTrspUcAmt(JSPUtil.getParameter(request, "mnus_cr_trsp_uc_amt", ""));
		setMcntrQty(JSPUtil.getParameter(request, "mcntr_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSimTzDys(JSPUtil.getParameter(request, "sim_tz_dys", ""));
		setMtyTzDys(JSPUtil.getParameter(request, "mty_tz_dys", ""));
		setCntrIoVolStsCd(JSPUtil.getParameter(request, "cntr_io_vol_sts_cd", ""));
		setSimCntrQty(JSPUtil.getParameter(request, "sim_cntr_qty", ""));
		setFullTrspUcAmt(JSPUtil.getParameter(request, "full_trsp_uc_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMnusCrCntrQty(JSPUtil.getParameter(request, "mnus_cr_cntr_qty", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setFcntrQty(JSPUtil.getParameter(request, "fcntr_qty", ""));
		setSimStvgUcAmt(JSPUtil.getParameter(request, "sim_stvg_uc_amt", ""));
		setSimTrspUcAmt(JSPUtil.getParameter(request, "sim_trsp_uc_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSimTzHrs(JSPUtil.getParameter(request, "sim_tz_hrs", ""));
		setCntrOrgDestCd(JSPUtil.getParameter(request, "cntr_org_dest_cd", ""));
		setCostLocGrpCd(JSPUtil.getParameter(request, "cost_loc_grp_cd", ""));
		setFullStvgUcAmt(JSPUtil.getParameter(request, "full_stvg_uc_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaMtyEccUtCostVO[]
	 */
	public CoaMtyEccUtCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaMtyEccUtCostVO[]
	 */
	public CoaMtyEccUtCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaMtyEccUtCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] imbalRto = (JSPUtil.getParameter(request, prefix	+ "imbal_rto", length));
			String[] mtyTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] fullTzHrs = (JSPUtil.getParameter(request, prefix	+ "full_tz_hrs", length));
			String[] mtyUsaCostCd = (JSPUtil.getParameter(request, prefix	+ "mty_usa_cost_cd", length));
			String[] mtyStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_uc_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] mtyTzHrs = (JSPUtil.getParameter(request, prefix	+ "mty_tz_hrs", length));
			String[] mnusCrTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mnus_cr_trsp_uc_amt", length));
			String[] mcntrQty = (JSPUtil.getParameter(request, prefix	+ "mcntr_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] simTzDys = (JSPUtil.getParameter(request, prefix	+ "sim_tz_dys", length));
			String[] mtyTzDys = (JSPUtil.getParameter(request, prefix	+ "mty_tz_dys", length));
			String[] cntrIoVolStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_io_vol_sts_cd", length));
			String[] simCntrQty = (JSPUtil.getParameter(request, prefix	+ "sim_cntr_qty", length));
			String[] fullTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_trsp_uc_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mnusCrCntrQty = (JSPUtil.getParameter(request, prefix	+ "mnus_cr_cntr_qty", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] fcntrQty = (JSPUtil.getParameter(request, prefix	+ "fcntr_qty", length));
			String[] simStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "sim_stvg_uc_amt", length));
			String[] simTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "sim_trsp_uc_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] simTzHrs = (JSPUtil.getParameter(request, prefix	+ "sim_tz_hrs", length));
			String[] cntrOrgDestCd = (JSPUtil.getParameter(request, prefix	+ "cntr_org_dest_cd", length));
			String[] costLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_loc_grp_cd", length));
			String[] fullStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_stvg_uc_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaMtyEccUtCostVO();
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (imbalRto[i] != null)
					model.setImbalRto(imbalRto[i]);
				if (mtyTrspUcAmt[i] != null)
					model.setMtyTrspUcAmt(mtyTrspUcAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (fullTzHrs[i] != null)
					model.setFullTzHrs(fullTzHrs[i]);
				if (mtyUsaCostCd[i] != null)
					model.setMtyUsaCostCd(mtyUsaCostCd[i]);
				if (mtyStvgUcAmt[i] != null)
					model.setMtyStvgUcAmt(mtyStvgUcAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (mtyTzHrs[i] != null)
					model.setMtyTzHrs(mtyTzHrs[i]);
				if (mnusCrTrspUcAmt[i] != null)
					model.setMnusCrTrspUcAmt(mnusCrTrspUcAmt[i]);
				if (mcntrQty[i] != null)
					model.setMcntrQty(mcntrQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (simTzDys[i] != null)
					model.setSimTzDys(simTzDys[i]);
				if (mtyTzDys[i] != null)
					model.setMtyTzDys(mtyTzDys[i]);
				if (cntrIoVolStsCd[i] != null)
					model.setCntrIoVolStsCd(cntrIoVolStsCd[i]);
				if (simCntrQty[i] != null)
					model.setSimCntrQty(simCntrQty[i]);
				if (fullTrspUcAmt[i] != null)
					model.setFullTrspUcAmt(fullTrspUcAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mnusCrCntrQty[i] != null)
					model.setMnusCrCntrQty(mnusCrCntrQty[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (fcntrQty[i] != null)
					model.setFcntrQty(fcntrQty[i]);
				if (simStvgUcAmt[i] != null)
					model.setSimStvgUcAmt(simStvgUcAmt[i]);
				if (simTrspUcAmt[i] != null)
					model.setSimTrspUcAmt(simTrspUcAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (simTzHrs[i] != null)
					model.setSimTzHrs(simTzHrs[i]);
				if (cntrOrgDestCd[i] != null)
					model.setCntrOrgDestCd(cntrOrgDestCd[i]);
				if (costLocGrpCd[i] != null)
					model.setCostLocGrpCd(costLocGrpCd[i]);
				if (fullStvgUcAmt[i] != null)
					model.setFullStvgUcAmt(fullStvgUcAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaMtyEccUtCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaMtyEccUtCostVO[]
	 */
	public CoaMtyEccUtCostVO[] getCoaMtyEccUtCostVOs(){
		CoaMtyEccUtCostVO[] vos = (CoaMtyEccUtCostVO[])models.toArray(new CoaMtyEccUtCostVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalRto = this.imbalRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspUcAmt = this.mtyTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTzHrs = this.fullTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyUsaCostCd = this.mtyUsaCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgUcAmt = this.mtyStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTzHrs = this.mtyTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnusCrTrspUcAmt = this.mnusCrTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcntrQty = this.mcntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simTzDys = this.simTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTzDys = this.mtyTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrIoVolStsCd = this.cntrIoVolStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simCntrQty = this.simCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrspUcAmt = this.fullTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnusCrCntrQty = this.mnusCrCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrQty = this.fcntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simStvgUcAmt = this.simStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simTrspUcAmt = this.simTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simTzHrs = this.simTzHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOrgDestCd = this.cntrOrgDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costLocGrpCd = this.costLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullStvgUcAmt = this.fullStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
