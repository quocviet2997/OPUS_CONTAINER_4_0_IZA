/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CtmMvmtIrrVO.java
*@FileTitle : CtmMvmtIrrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.30
*@LastModifier : 
*@LastVersion : 1.0
* 2009.06.30  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CtmMvmtIrrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CtmMvmtIrrVO> models = new ArrayList<CtmMvmtIrrVO>();
	
	/* Column Info */
	private String preCnmvIdNo = null;
	/* Column Info */
	private String cnmvCycNo = null;
	/* Column Info */
	private String preOrgYdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String preCnmvYr = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrBkgAtchCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mvmtIrrSeq = null;
	/* Column Info */
	private String preCnmvEvntDt = null;
	/* Column Info */
	private String preCnmvStsCd = null;
	/* Column Info */
	private String cnmvEvntDt = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String cnmvIrrStlFlg = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String preBkgNo = null;
	/* Column Info */
	private String preDestYdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CtmMvmtIrrVO() {}

	public CtmMvmtIrrVO(String ibflag, String pagerows, String cntrNo, String cnmvYr, String cnmvIdNo, String cntrBkgAtchCd, String cnmvCycNo, String mvmtIrrSeq, String cntrTpszCd, String cnmvStsCd, String cnmvEvntDt, String orgYdCd, String bkgNo, String preCnmvYr, String preCnmvIdNo, String preCnmvStsCd, String preCnmvEvntDt, String preOrgYdCd, String preDestYdCd, String preBkgNo, String cnmvIrrStlFlg, String ofcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.preCnmvIdNo = preCnmvIdNo;
		this.cnmvCycNo = cnmvCycNo;
		this.preOrgYdCd = preOrgYdCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.preCnmvYr = preCnmvYr;
		this.cnmvStsCd = cnmvStsCd;
		this.ibflag = ibflag;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrBkgAtchCd = cntrBkgAtchCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.mvmtIrrSeq = mvmtIrrSeq;
		this.preCnmvEvntDt = preCnmvEvntDt;
		this.preCnmvStsCd = preCnmvStsCd;
		this.cnmvEvntDt = cnmvEvntDt;
		this.orgYdCd = orgYdCd;
		this.cnmvIrrStlFlg = cnmvIrrStlFlg;
		this.cnmvIdNo = cnmvIdNo;
		this.ofcCd = ofcCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.cntrNo = cntrNo;
		this.cnmvYr = cnmvYr;
		this.preBkgNo = preBkgNo;
		this.preDestYdCd = preDestYdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pre_cnmv_id_no", getPreCnmvIdNo());
		this.hashColumns.put("cnmv_cyc_no", getCnmvCycNo());
		this.hashColumns.put("pre_org_yd_cd", getPreOrgYdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pre_cnmv_yr", getPreCnmvYr());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_bkg_atch_cd", getCntrBkgAtchCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mvmt_irr_seq", getMvmtIrrSeq());
		this.hashColumns.put("pre_cnmv_evnt_dt", getPreCnmvEvntDt());
		this.hashColumns.put("pre_cnmv_sts_cd", getPreCnmvStsCd());
		this.hashColumns.put("cnmv_evnt_dt", getCnmvEvntDt());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("cnmv_irr_stl_flg", getCnmvIrrStlFlg());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("pre_bkg_no", getPreBkgNo());
		this.hashColumns.put("pre_dest_yd_cd", getPreDestYdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pre_cnmv_id_no", "preCnmvIdNo");
		this.hashFields.put("cnmv_cyc_no", "cnmvCycNo");
		this.hashFields.put("pre_org_yd_cd", "preOrgYdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pre_cnmv_yr", "preCnmvYr");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_bkg_atch_cd", "cntrBkgAtchCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mvmt_irr_seq", "mvmtIrrSeq");
		this.hashFields.put("pre_cnmv_evnt_dt", "preCnmvEvntDt");
		this.hashFields.put("pre_cnmv_sts_cd", "preCnmvStsCd");
		this.hashFields.put("cnmv_evnt_dt", "cnmvEvntDt");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("cnmv_irr_stl_flg", "cnmvIrrStlFlg");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("pre_bkg_no", "preBkgNo");
		this.hashFields.put("pre_dest_yd_cd", "preDestYdCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return preCnmvIdNo
	 */
	public String getPreCnmvIdNo() {
		return this.preCnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvCycNo
	 */
	public String getCnmvCycNo() {
		return this.cnmvCycNo;
	}
	
	/**
	 * Column Info
	 * @return preOrgYdCd
	 */
	public String getPreOrgYdCd() {
		return this.preOrgYdCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return preCnmvYr
	 */
	public String getPreCnmvYr() {
		return this.preCnmvYr;
	}
	
	/**
	 * Column Info
	 * @return cnmvStsCd
	 */
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return cntrBkgAtchCd
	 */
	public String getCntrBkgAtchCd() {
		return this.cntrBkgAtchCd;
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
	 * @return mvmtIrrSeq
	 */
	public String getMvmtIrrSeq() {
		return this.mvmtIrrSeq;
	}
	
	/**
	 * Column Info
	 * @return preCnmvEvntDt
	 */
	public String getPreCnmvEvntDt() {
		return this.preCnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @return preCnmvStsCd
	 */
	public String getPreCnmvStsCd() {
		return this.preCnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvEvntDt
	 */
	public String getCnmvEvntDt() {
		return this.cnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @return orgYdCd
	 */
	public String getOrgYdCd() {
		return this.orgYdCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvIrrStlFlg
	 */
	public String getCnmvIrrStlFlg() {
		return this.cnmvIrrStlFlg;
	}
	
	/**
	 * Column Info
	 * @return cnmvIdNo
	 */
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvYr
	 */
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	
	/**
	 * Column Info
	 * @return preBkgNo
	 */
	public String getPreBkgNo() {
		return this.preBkgNo;
	}
	
	/**
	 * Column Info
	 * @return preDestYdCd
	 */
	public String getPreDestYdCd() {
		return this.preDestYdCd;
	}
	

	/**
	 * Column Info
	 * @param preCnmvIdNo
	 */
	public void setPreCnmvIdNo(String preCnmvIdNo) {
		this.preCnmvIdNo = preCnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvCycNo
	 */
	public void setCnmvCycNo(String cnmvCycNo) {
		this.cnmvCycNo = cnmvCycNo;
	}
	
	/**
	 * Column Info
	 * @param preOrgYdCd
	 */
	public void setPreOrgYdCd(String preOrgYdCd) {
		this.preOrgYdCd = preOrgYdCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param preCnmvYr
	 */
	public void setPreCnmvYr(String preCnmvYr) {
		this.preCnmvYr = preCnmvYr;
	}
	
	/**
	 * Column Info
	 * @param cnmvStsCd
	 */
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param cntrBkgAtchCd
	 */
	public void setCntrBkgAtchCd(String cntrBkgAtchCd) {
		this.cntrBkgAtchCd = cntrBkgAtchCd;
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
	 * @param mvmtIrrSeq
	 */
	public void setMvmtIrrSeq(String mvmtIrrSeq) {
		this.mvmtIrrSeq = mvmtIrrSeq;
	}
	
	/**
	 * Column Info
	 * @param preCnmvEvntDt
	 */
	public void setPreCnmvEvntDt(String preCnmvEvntDt) {
		this.preCnmvEvntDt = preCnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @param preCnmvStsCd
	 */
	public void setPreCnmvStsCd(String preCnmvStsCd) {
		this.preCnmvStsCd = preCnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvEvntDt
	 */
	public void setCnmvEvntDt(String cnmvEvntDt) {
		this.cnmvEvntDt = cnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @param orgYdCd
	 */
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvIrrStlFlg
	 */
	public void setCnmvIrrStlFlg(String cnmvIrrStlFlg) {
		this.cnmvIrrStlFlg = cnmvIrrStlFlg;
	}
	
	/**
	 * Column Info
	 * @param cnmvIdNo
	 */
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvYr
	 */
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
	}
	
	/**
	 * Column Info
	 * @param preBkgNo
	 */
	public void setPreBkgNo(String preBkgNo) {
		this.preBkgNo = preBkgNo;
	}
	
	/**
	 * Column Info
	 * @param preDestYdCd
	 */
	public void setPreDestYdCd(String preDestYdCd) {
		this.preDestYdCd = preDestYdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPreCnmvIdNo(JSPUtil.getParameter(request, "pre_cnmv_id_no", ""));
		setCnmvCycNo(JSPUtil.getParameter(request, "cnmv_cyc_no", ""));
		setPreOrgYdCd(JSPUtil.getParameter(request, "pre_org_yd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPreCnmvYr(JSPUtil.getParameter(request, "pre_cnmv_yr", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrBkgAtchCd(JSPUtil.getParameter(request, "cntr_bkg_atch_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMvmtIrrSeq(JSPUtil.getParameter(request, "mvmt_irr_seq", ""));
		setPreCnmvEvntDt(JSPUtil.getParameter(request, "pre_cnmv_evnt_dt", ""));
		setPreCnmvStsCd(JSPUtil.getParameter(request, "pre_cnmv_sts_cd", ""));
		setCnmvEvntDt(JSPUtil.getParameter(request, "cnmv_evnt_dt", ""));
		setOrgYdCd(JSPUtil.getParameter(request, "org_yd_cd", ""));
		setCnmvIrrStlFlg(JSPUtil.getParameter(request, "cnmv_irr_stl_flg", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setPreBkgNo(JSPUtil.getParameter(request, "pre_bkg_no", ""));
		setPreDestYdCd(JSPUtil.getParameter(request, "pre_dest_yd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CtmMvmtIrrVO[]
	 */
	public CtmMvmtIrrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CtmMvmtIrrVO[]
	 */
	public CtmMvmtIrrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CtmMvmtIrrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] preCnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "pre_cnmv_id_no", length));
			String[] cnmvCycNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_cyc_no", length));
			String[] preOrgYdCd = (JSPUtil.getParameter(request, prefix	+ "pre_org_yd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] preCnmvYr = (JSPUtil.getParameter(request, prefix	+ "pre_cnmv_yr", length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrBkgAtchCd = (JSPUtil.getParameter(request, prefix	+ "cntr_bkg_atch_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mvmtIrrSeq = (JSPUtil.getParameter(request, prefix	+ "mvmt_irr_seq", length));
			String[] preCnmvEvntDt = (JSPUtil.getParameter(request, prefix	+ "pre_cnmv_evnt_dt", length));
			String[] preCnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "pre_cnmv_sts_cd", length));
			String[] cnmvEvntDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_evnt_dt", length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix	+ "org_yd_cd", length));
			String[] cnmvIrrStlFlg = (JSPUtil.getParameter(request, prefix	+ "cnmv_irr_stl_flg", length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr", length));
			String[] preBkgNo = (JSPUtil.getParameter(request, prefix	+ "pre_bkg_no", length));
			String[] preDestYdCd = (JSPUtil.getParameter(request, prefix	+ "pre_dest_yd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CtmMvmtIrrVO();
				if (preCnmvIdNo[i] != null)
					model.setPreCnmvIdNo(preCnmvIdNo[i]);
				if (cnmvCycNo[i] != null)
					model.setCnmvCycNo(cnmvCycNo[i]);
				if (preOrgYdCd[i] != null)
					model.setPreOrgYdCd(preOrgYdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (preCnmvYr[i] != null)
					model.setPreCnmvYr(preCnmvYr[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrBkgAtchCd[i] != null)
					model.setCntrBkgAtchCd(cntrBkgAtchCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mvmtIrrSeq[i] != null)
					model.setMvmtIrrSeq(mvmtIrrSeq[i]);
				if (preCnmvEvntDt[i] != null)
					model.setPreCnmvEvntDt(preCnmvEvntDt[i]);
				if (preCnmvStsCd[i] != null)
					model.setPreCnmvStsCd(preCnmvStsCd[i]);
				if (cnmvEvntDt[i] != null)
					model.setCnmvEvntDt(cnmvEvntDt[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (cnmvIrrStlFlg[i] != null)
					model.setCnmvIrrStlFlg(cnmvIrrStlFlg[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (preBkgNo[i] != null)
					model.setPreBkgNo(preBkgNo[i]);
				if (preDestYdCd[i] != null)
					model.setPreDestYdCd(preDestYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCtmMvmtIrrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CtmMvmtIrrVO[]
	 */
	public CtmMvmtIrrVO[] getCtmMvmtIrrVOs(){
		CtmMvmtIrrVO[] vos = (CtmMvmtIrrVO[])models.toArray(new CtmMvmtIrrVO[models.size()]);
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
		this.preCnmvIdNo = this.preCnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCycNo = this.cnmvCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preOrgYdCd = this.preOrgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCnmvYr = this.preCnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrBkgAtchCd = this.cntrBkgAtchCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtIrrSeq = this.mvmtIrrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCnmvEvntDt = this.preCnmvEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCnmvStsCd = this.preCnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvEvntDt = this.cnmvEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIrrStlFlg = this.cnmvIrrStlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preBkgNo = this.preBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDestYdCd = this.preDestYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
