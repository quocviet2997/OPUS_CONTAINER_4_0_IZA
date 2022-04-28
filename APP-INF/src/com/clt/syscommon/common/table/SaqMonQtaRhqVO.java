/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonQtaRhqVO.java
*@FileTitle : SaqMonQtaRhqVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonQtaRhqVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonQtaRhqVO> models = new ArrayList<SaqMonQtaRhqVO>();
	
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtRhqCd = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mqtaStepCd = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String bsaGrpCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String mqtaVerNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String ctrtAqCd = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String ofcAddFlg = null;
	/* Column Info */
	private String ctrtRgnOfcCd = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String sprtGrpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String podCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonQtaRhqVO() {}

	public SaqMonQtaRhqVO(String ibflag, String pagerows, String mqtaStepCd, String bseYr, String bseQtrCd, String trdCd, String dirCd, String mqtaVerNo, String rlaneCd, String sprtGrpCd, String bsaGrpCd, String ctrtRgnOfcCd, String bseMon, String subTrdCd, String ctrtRhqCd, String ctrtAqCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raOpfitUcAmt, String ofcAddFlg, String creUsrId, String creDt, String updUsrId, String updDt, String polCd, String podCd) {
		this.cmUcAmt = cmUcAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.pagerows = pagerows;
		this.ctrtRhqCd = ctrtRhqCd;
		this.bseMon = bseMon;
		this.bseQtrCd = bseQtrCd;
		this.ibflag = ibflag;
		this.mqtaStepCd = mqtaStepCd;
		this.grsRpbRev = grsRpbRev;
		this.bsaGrpCd = bsaGrpCd;
		this.dirCd = dirCd;
		this.mqtaVerNo = mqtaVerNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.lodQty = lodQty;
		this.ctrtAqCd = ctrtAqCd;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.opfitUcAmt = opfitUcAmt;
		this.ofcAddFlg = ofcAddFlg;
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
		this.bseYr = bseYr;
		this.sprtGrpCd = sprtGrpCd;
		this.creUsrId = creUsrId;
		this.raCmUcAmt = raCmUcAmt;
		this.subTrdCd = subTrdCd;
		this.polCd = polCd;
		this.podCd = podCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_rhq_cd", getCtrtRhqCd());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mqta_step_cd", getMqtaStepCd());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("bsa_grp_cd", getBsaGrpCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("mqta_ver_no", getMqtaVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("ctrt_aq_cd", getCtrtAqCd());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("ofc_add_flg", getOfcAddFlg());
		this.hashColumns.put("ctrt_rgn_ofc_cd", getCtrtRgnOfcCd());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("sprt_grp_cd", getSprtGrpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("pod_cd", getPodCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_rhq_cd", "ctrtRhqCd");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mqta_step_cd", "mqtaStepCd");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("bsa_grp_cd", "bsaGrpCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("mqta_ver_no", "mqtaVerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("ctrt_aq_cd", "ctrtAqCd");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("ofc_add_flg", "ofcAddFlg");
		this.hashFields.put("ctrt_rgn_ofc_cd", "ctrtRgnOfcCd");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("sprt_grp_cd", "sprtGrpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("pod_cd", "podCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cmUcAmt
	 */
	public String getCmUcAmt() {
		return this.cmUcAmt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
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
	 * @return ctrtRhqCd
	 */
	public String getCtrtRhqCd() {
		return this.ctrtRhqCd;
	}
	
	/**
	 * Column Info
	 * @return bseMon
	 */
	public String getBseMon() {
		return this.bseMon;
	}
	
	/**
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
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
	 * @return mqtaStepCd
	 */
	public String getMqtaStepCd() {
		return this.mqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @return grsRpbRev
	 */
	public String getGrsRpbRev() {
		return this.grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @return bsaGrpCd
	 */
	public String getBsaGrpCd() {
		return this.bsaGrpCd;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return mqtaVerNo
	 */
	public String getMqtaVerNo() {
		return this.mqtaVerNo;
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
	 * @return lodQty
	 */
	public String getLodQty() {
		return this.lodQty;
	}
	
	/**
	 * Column Info
	 * @return ctrtAqCd
	 */
	public String getCtrtAqCd() {
		return this.ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @return raOpfitUcAmt
	 */
	public String getRaOpfitUcAmt() {
		return this.raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return opfitUcAmt
	 */
	public String getOpfitUcAmt() {
		return this.opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return ofcAddFlg
	 */
	public String getOfcAddFlg() {
		return this.ofcAddFlg;
	}
	
	/**
	 * Column Info
	 * @return ctrtRgnOfcCd
	 */
	public String getCtrtRgnOfcCd() {
		return this.ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return sprtGrpCd
	 */
	public String getSprtGrpCd() {
		return this.sprtGrpCd;
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
	 * @return raCmUcAmt
	 */
	public String getRaCmUcAmt() {
		return this.raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return polCd;
	}

	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}

	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return podCd;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}

	/**
	 * Column Info
	 * @param cmUcAmt
	 */
	public void setCmUcAmt(String cmUcAmt) {
		this.cmUcAmt = cmUcAmt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
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
	 * @param ctrtRhqCd
	 */
	public void setCtrtRhqCd(String ctrtRhqCd) {
		this.ctrtRhqCd = ctrtRhqCd;
	}
	
	/**
	 * Column Info
	 * @param bseMon
	 */
	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
	}
	
	/**
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
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
	 * @param mqtaStepCd
	 */
	public void setMqtaStepCd(String mqtaStepCd) {
		this.mqtaStepCd = mqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @param grsRpbRev
	 */
	public void setGrsRpbRev(String grsRpbRev) {
		this.grsRpbRev = grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @param bsaGrpCd
	 */
	public void setBsaGrpCd(String bsaGrpCd) {
		this.bsaGrpCd = bsaGrpCd;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param mqtaVerNo
	 */
	public void setMqtaVerNo(String mqtaVerNo) {
		this.mqtaVerNo = mqtaVerNo;
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
	 * @param lodQty
	 */
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
	}
	
	/**
	 * Column Info
	 * @param ctrtAqCd
	 */
	public void setCtrtAqCd(String ctrtAqCd) {
		this.ctrtAqCd = ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @param raOpfitUcAmt
	 */
	public void setRaOpfitUcAmt(String raOpfitUcAmt) {
		this.raOpfitUcAmt = raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param opfitUcAmt
	 */
	public void setOpfitUcAmt(String opfitUcAmt) {
		this.opfitUcAmt = opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param ofcAddFlg
	 */
	public void setOfcAddFlg(String ofcAddFlg) {
		this.ofcAddFlg = ofcAddFlg;
	}
	
	/**
	 * Column Info
	 * @param ctrtRgnOfcCd
	 */
	public void setCtrtRgnOfcCd(String ctrtRgnOfcCd) {
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param sprtGrpCd
	 */
	public void setSprtGrpCd(String sprtGrpCd) {
		this.sprtGrpCd = sprtGrpCd;
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
	 * @param raCmUcAmt
	 */
	public void setRaCmUcAmt(String raCmUcAmt) {
		this.raCmUcAmt = raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtRhqCd(JSPUtil.getParameter(request, "ctrt_rhq_cd", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMqtaStepCd(JSPUtil.getParameter(request, "mqta_step_cd", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setBsaGrpCd(JSPUtil.getParameter(request, "bsa_grp_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setMqtaVerNo(JSPUtil.getParameter(request, "mqta_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setCtrtAqCd(JSPUtil.getParameter(request, "ctrt_aq_cd", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setOfcAddFlg(JSPUtil.getParameter(request, "ofc_add_flg", ""));
		setCtrtRgnOfcCd(JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setSprtGrpCd(JSPUtil.getParameter(request, "sprt_grp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonQtaRhqVO[]
	 */
	public SaqMonQtaRhqVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaRhqVO[]
	 */
	public SaqMonQtaRhqVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonQtaRhqVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cmUcAmt = (JSPUtil.getParameter(request, "cm_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, "pagerows", length));
			String[] ctrtRhqCd = (JSPUtil.getParameter(request, "ctrt_rhq_cd", length));
			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, "ibflag", length));
			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev", length));
			String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd", length));
			String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, "upd_dt", length));
			String[] lodQty = (JSPUtil.getParameter(request, "lod_qty", length));
			String[] ctrtAqCd = (JSPUtil.getParameter(request, "ctrt_aq_cd", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, "ra_opfit_uc_amt", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, "opfit_uc_amt", length));
			String[] ofcAddFlg = (JSPUtil.getParameter(request, "ofc_add_flg", length));
			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd", length));
			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr", length));
			String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, "ra_cm_uc_amt", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, "pol_cd", length));
			String[] podCd = (JSPUtil.getParameter(request, "pod_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonQtaRhqVO();
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtRhqCd[i] != null)
					model.setCtrtRhqCd(ctrtRhqCd[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mqtaStepCd[i] != null)
					model.setMqtaStepCd(mqtaStepCd[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (bsaGrpCd[i] != null)
					model.setBsaGrpCd(bsaGrpCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (mqtaVerNo[i] != null)
					model.setMqtaVerNo(mqtaVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (ctrtAqCd[i] != null)
					model.setCtrtAqCd(ctrtAqCd[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (ofcAddFlg[i] != null)
					model.setOfcAddFlg(ofcAddFlg[i]);
				if (ctrtRgnOfcCd[i] != null)
					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (sprtGrpCd[i] != null)
					model.setSprtGrpCd(sprtGrpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonQtaRhqVOs();
	}
	
	/**
	 * 월간 판매목표 조정 Excel Upload (ESM_SAQ_0161)에 사용한 Parameter 로 재구성.
	 * @param request
	 * @param conVo
	 * @return SaqMonQtaRhqVO[]
	 */
//	public SaqMonQtaRhqVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonQtaRhqVO model = null;
//		
//		String[] tmp = request.getParameterValues("rlane_cd");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("rlane_cd").length;
//  
//		try {
//
//			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] pagerows = (JSPUtil.getParameter(request, "pagerows".trim(), length));
//			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd".trim(), length));
//			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd".trim(), length));
//			String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev".trim(), length));
//			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no".trim(), length));
//			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id".trim(), length));
//			String[] lodQty = (JSPUtil.getParameter(request, "lod_qty".trim(), length));
//			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd".trim(), length));
//			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id".trim(), length));
//			String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd".trim(), length));
//			String[] ibflag = (JSPUtil.getParameter(request, "ibflag".trim(), length));
//			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] laneGrp = (JSPUtil.getParameter(request, "lane_grp".trim(), length));
//			String[] polCd = (JSPUtil.getParameter(request, "pol_cd".trim(), length));
//			String[] podCd = (JSPUtil.getParameter(request, "pod_cd".trim(), length));
//
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonQtaRhqVO();
//				
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (mqtaStepCd[i] != null)
//					model.setMqtaStepCd(mqtaStepCd[i]);
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (bseYr[i] != null)
//					model.setBseYr(bseYr[i]);
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(bseQtrCd[i]);
//				if (trdCd[i] != null)
//					model.setTrdCd(trdCd[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(dirCd[i]);
//				if (mqtaVerNo[i] != null)
//					model.setMqtaVerNo(mqtaVerNo[i]);
//				if (laneGrp[i] != null)
//					model.setSprtGrpCd(laneGrp[i].substring(0, 1));
//				if (laneGrp[i] != null)
//					model.setBsaGrpCd(laneGrp[i].substring(1));
//				if (ctrtRgnOfcCd[i] != null)
//					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
//				if (polCd[i] != null)
//					model.setPolCd(polCd[i]);
//				if (podCd[i] != null)
//					model.setPodCd(podCd[i]);
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (pagerows[i] != null)
//					model.setPagerows(pagerows[i]);
//				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaRhqVOs();
//	}

	/**
	 * 월간 판매목표 조정 RHQ (ESM_SAQ_0075)에 사용한 Parameter 로 재구성.
	 * @param request
	 * @param conVo
	 * @param chkCode
	 * @return SaqMonQtaRhqVO[]
	 */
//	public SaqMonQtaRhqVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo, String chkCode) {
//		SaqMonQtaRhqVO model = null;
//		
//		String[] tmp = request.getParameterValues("ibflag");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("ibflag").length;
//  
//  		String bse_mon = "";
//  		String target_month = JSPUtil.getParameter(request, "target_month", "");
//		if(target_month.equals("") == false) {
//			bse_mon = target_month.substring(4);
//		}
//		try {
//
//			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] pagerows = (JSPUtil.getParameter(request, "pagerows".trim(), length));
//			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd".trim(), length));
//			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd".trim(), length));
//			String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev".trim(), length));
//			String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd".trim(), length));
//			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no".trim(), length));
//			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id".trim(), length));
//			String[] lodQty = (JSPUtil.getParameter(request, "lod_qty".trim(), length));
//			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd".trim(), length));
//			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd".trim(), length));
//			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id".trim(), length));
//			String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd".trim(), length));
//			String[] ibflag = (JSPUtil.getParameter(request, "ibflag".trim(), length));
//			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] polCd = (JSPUtil.getParameter(request, "pol_cd".trim(), length));
//			String[] podCd = (JSPUtil.getParameter(request, "pod_cd".trim(), length));
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonQtaRhqVO();
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (mqtaStepCd[i] != null)
//					model.setMqtaStepCd(conVo.getMQtaStepCd()); //변수
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (bseYr[i] != null)
//					model.setBseYr(conVo.getYear()); //변수
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(conVo.getBse_quarter()); //변수
//				if (trdCd[i] != null)
//					model.setTrdCd(conVo.getTrade()); //변수
//				if (dirCd[i] != null)
//					model.setDirCd(conVo.getBound()); //변수
//				if (mqtaVerNo[i] != null)
//					model.setMqtaVerNo(conVo.getMQtaVerNo()); //변수
//				if (sprtGrpCd[i] != null)
//					model.setSprtGrpCd(sprtGrpCd[i]);
//				if (bsaGrpCd[i] != null)
//					model.setBsaGrpCd(bsaGrpCd[i]);
//				if (ctrtRgnOfcCd[i] != null)
//					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
//				if (polCd[i] != null)
//					model.setPolCd(polCd[i]);
//				if (podCd[i] != null)
//					model.setPodCd(podCd[i]);
//				if (bseMon[i] != null)
//					model.setBseMon(bse_mon); //변수
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (pagerows[i] != null)
//					model.setPagerows(pagerows[i]);
//				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaRhqVOs();
//	}
	
	/**
	 * HttpRequst의 정보를 ESM_SAQ_0149Event로 파싱하여 request에 셋팅<br>
	 * @param request
	 * @param conVo
	 * @param chkCode1
	 * @param chkCode2
	 * @return SaqMonQtaRhqVO[]
	 */
//	public SaqMonQtaRhqVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo, String chkCode1, String chkCode2) {
//		SaqMonQtaRhqVO model = null;
//		
//		String[] tmp = request.getParameterValues("ibflag");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("ibflag").length;
//  
//		try {
//			
//			String[] ibflag = (JSPUtil.getParameter(request,  "ibflag".trim(), length));
//			String[] pagerows = (JSPUtil.getParameter(request, "pagerows".trim(), length));
//			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd".trim(), length));
//			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no".trim(), length));
//			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd".trim(), length));
//			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd".trim(), length));
//			String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd".trim(), length));
//			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, "ofc_cd".trim(), length));
//			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id".trim(), length));
//			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id".trim(), length));
//			String[] load2 = (JSPUtil.getParameter(request,  "load2tmp".trim(), length));
//			String[] load3 = (JSPUtil.getParameter(request,  "load3tmp".trim(), length));
//			String[] grpb2 = (JSPUtil.getParameter(request,  "g_rpb2tmp".trim(), length));
//			String[] grpb3 = (JSPUtil.getParameter(request,  "g_rpb3tmp".trim(), length));	
//
//			
//			for (int i = 0; i < length; i++) {
//				
//				for	(int j = 0; j < 2; j++) {
//					
//					// 11월 이후에 bse_mon증가 처리 
//					String month = null;
//					int tmp_mon = Integer.parseInt(conVo.getBseQtrCd().substring(0,1))*3-1+j;
//					if(tmp_mon > 9){
//						month = ""+tmp_mon;
//					}else{
//						month = "0"+tmp_mon;
//					}
//
//					model = new SaqMonQtaRhqVO();
//				
//					if (ibflag[i] != null)
//						model.setIbflag(ibflag[i]);
//					if (pagerows[i] != null)
//						model.setPagerows(pagerows[i]);
//					if (mqtaStepCd[i] != null)
//						model.setMqtaStepCd(conVo.getMqta_step_cd()); //변수
//					if (bseYr[i] != null)
//						model.setBseYr(conVo.getBse_yr()); //변수
//					if (trdCd[i] != null)
//						model.setTrdCd(conVo.getTrd_cd()); //변수
//					if (dirCd[i] != null)
//						model.setDirCd(conVo.getDir_cd()); //변수
//					if (mqtaVerNo[i] != null)
//						model.setMqtaVerNo(conVo.getMqta_ver_no()); //변수
//					if (bseQtrCd[i] != null)
//						model.setBseQtrCd(conVo.getBse_qtr_cd()); //변수
//					if (bseMon[i] != null)
//						model.setBseMon(month); //변수
//					if (rlaneCd[i] != null)
//						model.setRlaneCd(rlaneCd[i]);
//					if (sprtGrpCd[i] != null)
//						model.setSprtGrpCd(sprtGrpCd[i]);
//					if (bsaGrpCd[i] != null)
//						model.setBsaGrpCd(bsaGrpCd[i]);
//					if (ctrtRgnOfcCd[i] != null)
//						model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
//					
//					if (j == 0){
//						//if (lodQty[i] != null)
//						model.setLodQty(load2[i]);
//						//if (grsRpbRev[i] != null)
//						model.setGrsRpbRev(grpb2[i]);
//					}else if (j == 1){
//						//if (lodQty[i] != null)
//						model.setLodQty(load3[i]);
//						//if (grsRpbRev[i] != null)
//						model.setGrsRpbRev(grpb3[i]);
//					}
//					
//					if (updUsrId[i] != null)
//						model.setUpdUsrId(updUsrId[i]);
//					if (creUsrId[i] != null)
//						model.setCreUsrId(creUsrId[i]);
//					models.add(model);
//				}
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaRhqVOs();
//	}

	/**
	 * VO 배열을 반환
	 * @return SaqMonQtaRhqVO[]
	 */
	public SaqMonQtaRhqVO[] getSaqMonQtaRhqVOs(){
		SaqMonQtaRhqVO[] vos = (SaqMonQtaRhqVO[])models.toArray(new SaqMonQtaRhqVO[models.size()]);
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
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRhqCd = this.ctrtRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaStepCd = this.mqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaGrpCd = this.bsaGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaVerNo = this.mqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtAqCd = this.ctrtAqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAddFlg = this.ofcAddFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRgnOfcCd = this.ctrtRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sprtGrpCd = this.sprtGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
