/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspSoPkupCntrHisVO.java
*@FileTitle : TrsTrspSoPkupCntrHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspSoPkupCntrHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspSoPkupCntrHisVO> models = new ArrayList<TrsTrspSoPkupCntrHisVO>();
	
	/* Column Info */
	private String pkupDeltDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String freeDt = null;
	/* Column Info */
	private String railDestLocCd = null;
	/* Column Info */
	private String rtnNodCd = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pkupDeltRsn = null;
	/* Column Info */
	private String pkupCreUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pkupNodCd = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String pkupDeltUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String avalDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String pkupDt = null;
	/* Column Info */
	private String pkupCreDt = null;
	/* Column Info */
	private String ibdTrspCd = null;
	/* Column Info */
	private String pkupNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspSoPkupCntrHisVO() {}

	public TrsTrspSoPkupCntrHisVO(String ibflag, String pagerows, String pkupDt, String bkgNo, String cntrNo, String ofcCd, String blNo, String deTermCd, String vvdCd, String pkupNo, String podCd, String railDestLocCd, String ibdTrspCd, String delCd, String pkupNodCd, String rtnNodCd, String avalDt, String freeDt, String pkupCreDt, String pkupCreUsrId, String deltFlg, String pkupDeltDt, String pkupDeltUsrId, String pkupDeltRsn, String eaiEvntDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pkupDeltDt = pkupDeltDt;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.freeDt = freeDt;
		this.railDestLocCd = railDestLocCd;
		this.rtnNodCd = rtnNodCd;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.pkupDeltRsn = pkupDeltRsn;
		this.pkupCreUsrId = pkupCreUsrId;
		this.ibflag = ibflag;
		this.pkupNodCd = pkupNodCd;
		this.vvdCd = vvdCd;
		this.pkupDeltUsrId = pkupDeltUsrId;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.delCd = delCd;
		this.eaiEvntDt = eaiEvntDt;
		this.podCd = podCd;
		this.deTermCd = deTermCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.avalDt = avalDt;
		this.cntrNo = cntrNo;
		this.pkupDt = pkupDt;
		this.pkupCreDt = pkupCreDt;
		this.ibdTrspCd = ibdTrspCd;
		this.pkupNo = pkupNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pkup_delt_dt", getPkupDeltDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("free_dt", getFreeDt());
		this.hashColumns.put("rail_dest_loc_cd", getRailDestLocCd());
		this.hashColumns.put("rtn_nod_cd", getRtnNodCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pkup_delt_rsn", getPkupDeltRsn());
		this.hashColumns.put("pkup_cre_usr_id", getPkupCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pkup_nod_cd", getPkupNodCd());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("pkup_delt_usr_id", getPkupDeltUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("aval_dt", getAvalDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("pkup_dt", getPkupDt());
		this.hashColumns.put("pkup_cre_dt", getPkupCreDt());
		this.hashColumns.put("ibd_trsp_cd", getIbdTrspCd());
		this.hashColumns.put("pkup_no", getPkupNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pkup_delt_dt", "pkupDeltDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("free_dt", "freeDt");
		this.hashFields.put("rail_dest_loc_cd", "railDestLocCd");
		this.hashFields.put("rtn_nod_cd", "rtnNodCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pkup_delt_rsn", "pkupDeltRsn");
		this.hashFields.put("pkup_cre_usr_id", "pkupCreUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pkup_nod_cd", "pkupNodCd");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("pkup_delt_usr_id", "pkupDeltUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("aval_dt", "avalDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("pkup_dt", "pkupDt");
		this.hashFields.put("pkup_cre_dt", "pkupCreDt");
		this.hashFields.put("ibd_trsp_cd", "ibdTrspCd");
		this.hashFields.put("pkup_no", "pkupNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return pkupDeltDt
	 */
	public String getPkupDeltDt() {
		return this.pkupDeltDt;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return freeDt
	 */
	public String getFreeDt() {
		return this.freeDt;
	}
	
	/**
	 * Column Info
	 * @return railDestLocCd
	 */
	public String getRailDestLocCd() {
		return this.railDestLocCd;
	}
	
	/**
	 * Column Info
	 * @return rtnNodCd
	 */
	public String getRtnNodCd() {
		return this.rtnNodCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return pkupDeltRsn
	 */
	public String getPkupDeltRsn() {
		return this.pkupDeltRsn;
	}
	
	/**
	 * Column Info
	 * @return pkupCreUsrId
	 */
	public String getPkupCreUsrId() {
		return this.pkupCreUsrId;
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
	 * @return pkupNodCd
	 */
	public String getPkupNodCd() {
		return this.pkupNodCd;
	}
	
	/**
	 * Column Info
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return pkupDeltUsrId
	 */
	public String getPkupDeltUsrId() {
		return this.pkupDeltUsrId;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return avalDt
	 */
	public String getAvalDt() {
		return this.avalDt;
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
	 * @return pkupDt
	 */
	public String getPkupDt() {
		return this.pkupDt;
	}
	
	/**
	 * Column Info
	 * @return pkupCreDt
	 */
	public String getPkupCreDt() {
		return this.pkupCreDt;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspCd
	 */
	public String getIbdTrspCd() {
		return this.ibdTrspCd;
	}
	
	/**
	 * Column Info
	 * @return pkupNo
	 */
	public String getPkupNo() {
		return this.pkupNo;
	}
	

	/**
	 * Column Info
	 * @param pkupDeltDt
	 */
	public void setPkupDeltDt(String pkupDeltDt) {
		this.pkupDeltDt = pkupDeltDt;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param freeDt
	 */
	public void setFreeDt(String freeDt) {
		this.freeDt = freeDt;
	}
	
	/**
	 * Column Info
	 * @param railDestLocCd
	 */
	public void setRailDestLocCd(String railDestLocCd) {
		this.railDestLocCd = railDestLocCd;
	}
	
	/**
	 * Column Info
	 * @param rtnNodCd
	 */
	public void setRtnNodCd(String rtnNodCd) {
		this.rtnNodCd = rtnNodCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param pkupDeltRsn
	 */
	public void setPkupDeltRsn(String pkupDeltRsn) {
		this.pkupDeltRsn = pkupDeltRsn;
	}
	
	/**
	 * Column Info
	 * @param pkupCreUsrId
	 */
	public void setPkupCreUsrId(String pkupCreUsrId) {
		this.pkupCreUsrId = pkupCreUsrId;
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
	 * @param pkupNodCd
	 */
	public void setPkupNodCd(String pkupNodCd) {
		this.pkupNodCd = pkupNodCd;
	}
	
	/**
	 * Column Info
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param pkupDeltUsrId
	 */
	public void setPkupDeltUsrId(String pkupDeltUsrId) {
		this.pkupDeltUsrId = pkupDeltUsrId;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
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
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param avalDt
	 */
	public void setAvalDt(String avalDt) {
		this.avalDt = avalDt;
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
	 * @param pkupDt
	 */
	public void setPkupDt(String pkupDt) {
		this.pkupDt = pkupDt;
	}
	
	/**
	 * Column Info
	 * @param pkupCreDt
	 */
	public void setPkupCreDt(String pkupCreDt) {
		this.pkupCreDt = pkupCreDt;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspCd
	 */
	public void setIbdTrspCd(String ibdTrspCd) {
		this.ibdTrspCd = ibdTrspCd;
	}
	
	/**
	 * Column Info
	 * @param pkupNo
	 */
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPkupDeltDt(JSPUtil.getParameter(request, "pkup_delt_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFreeDt(JSPUtil.getParameter(request, "free_dt", ""));
		setRailDestLocCd(JSPUtil.getParameter(request, "rail_dest_loc_cd", ""));
		setRtnNodCd(JSPUtil.getParameter(request, "rtn_nod_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPkupDeltRsn(JSPUtil.getParameter(request, "pkup_delt_rsn", ""));
		setPkupCreUsrId(JSPUtil.getParameter(request, "pkup_cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPkupNodCd(JSPUtil.getParameter(request, "pkup_nod_cd", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setPkupDeltUsrId(JSPUtil.getParameter(request, "pkup_delt_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setAvalDt(JSPUtil.getParameter(request, "aval_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setPkupDt(JSPUtil.getParameter(request, "pkup_dt", ""));
		setPkupCreDt(JSPUtil.getParameter(request, "pkup_cre_dt", ""));
		setIbdTrspCd(JSPUtil.getParameter(request, "ibd_trsp_cd", ""));
		setPkupNo(JSPUtil.getParameter(request, "pkup_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspSoPkupCntrHisVO[]
	 */
	public TrsTrspSoPkupCntrHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspSoPkupCntrHisVO[]
	 */
	public TrsTrspSoPkupCntrHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspSoPkupCntrHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pkupDeltDt = (JSPUtil.getParameter(request, prefix	+ "pkup_delt_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] freeDt = (JSPUtil.getParameter(request, prefix	+ "free_dt", length));
			String[] railDestLocCd = (JSPUtil.getParameter(request, prefix	+ "rail_dest_loc_cd", length));
			String[] rtnNodCd = (JSPUtil.getParameter(request, prefix	+ "rtn_nod_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pkupDeltRsn = (JSPUtil.getParameter(request, prefix	+ "pkup_delt_rsn", length));
			String[] pkupCreUsrId = (JSPUtil.getParameter(request, prefix	+ "pkup_cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pkupNodCd = (JSPUtil.getParameter(request, prefix	+ "pkup_nod_cd", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] pkupDeltUsrId = (JSPUtil.getParameter(request, prefix	+ "pkup_delt_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] avalDt = (JSPUtil.getParameter(request, prefix	+ "aval_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] pkupDt = (JSPUtil.getParameter(request, prefix	+ "pkup_dt", length));
			String[] pkupCreDt = (JSPUtil.getParameter(request, prefix	+ "pkup_cre_dt", length));
			String[] ibdTrspCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_cd", length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspSoPkupCntrHisVO();
				if (pkupDeltDt[i] != null)
					model.setPkupDeltDt(pkupDeltDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (freeDt[i] != null)
					model.setFreeDt(freeDt[i]);
				if (railDestLocCd[i] != null)
					model.setRailDestLocCd(railDestLocCd[i]);
				if (rtnNodCd[i] != null)
					model.setRtnNodCd(rtnNodCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pkupDeltRsn[i] != null)
					model.setPkupDeltRsn(pkupDeltRsn[i]);
				if (pkupCreUsrId[i] != null)
					model.setPkupCreUsrId(pkupCreUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pkupNodCd[i] != null)
					model.setPkupNodCd(pkupNodCd[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (pkupDeltUsrId[i] != null)
					model.setPkupDeltUsrId(pkupDeltUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (avalDt[i] != null)
					model.setAvalDt(avalDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (pkupDt[i] != null)
					model.setPkupDt(pkupDt[i]);
				if (pkupCreDt[i] != null)
					model.setPkupCreDt(pkupCreDt[i]);
				if (ibdTrspCd[i] != null)
					model.setIbdTrspCd(ibdTrspCd[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspSoPkupCntrHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspSoPkupCntrHisVO[]
	 */
	public TrsTrspSoPkupCntrHisVO[] getTrsTrspSoPkupCntrHisVOs(){
		TrsTrspSoPkupCntrHisVO[] vos = (TrsTrspSoPkupCntrHisVO[])models.toArray(new TrsTrspSoPkupCntrHisVO[models.size()]);
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
		this.pkupDeltDt = this.pkupDeltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDt = this.freeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railDestLocCd = this.railDestLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnNodCd = this.rtnNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDeltRsn = this.pkupDeltRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupCreUsrId = this.pkupCreUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNodCd = this.pkupNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDeltUsrId = this.pkupDeltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalDt = this.avalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDt = this.pkupDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupCreDt = this.pkupCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspCd = this.ibdTrspCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
