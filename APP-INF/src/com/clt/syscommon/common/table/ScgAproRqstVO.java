/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgAproRqstVO.java
*@FileTitle : ScgAproRqstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.11
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.09.11 이도형 
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
 * @author 이도형
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgAproRqstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgAproRqstVO> models = new ArrayList<ScgAproRqstVO>();
	
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String spclCgoRqstSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dcgoQty = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String awkCgoQty = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String spclCgoCateCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String spclBkgRqstFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lstRqstDatFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String rcQty = null;
	/* Column Info */
	private String bbCgoQty = null;
	/* Column Info */
	private String rqstOfcCd = null;
	/* Column Info */
	private String spclCgoAproRqstSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String orgBkgForSplit = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgAproRqstVO() {}

	public ScgAproRqstVO(String ibflag, String pagerows, String bkgNo, String spclCgoAproRqstSeq, String awkCgoQty, String bbCgoQty, String dcgoQty, String rcQty, String lstRqstDatFlg, String bkgRcvTermCd, String bkgDeTermCd, String rqstUsrId, String rqstOfcCd, String rqstDt, String creUsrId, String creDt, String updUsrId, String updDt, String spclBkgRqstFlg, String emlSndNo, String spclCgoCateCd, String spclCgoRqstSeq, String porCd, String delCd, String orgBkgForSplit) {
		this.porCd = porCd;
		this.spclCgoRqstSeq = spclCgoRqstSeq;
		this.updDt = updDt;
		this.dcgoQty = dcgoQty;
		this.rqstDt = rqstDt;
		this.rqstUsrId = rqstUsrId;
		this.awkCgoQty = awkCgoQty;
		this.delCd = delCd;
		this.spclCgoCateCd = spclCgoCateCd;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.emlSndNo = emlSndNo;
		this.spclBkgRqstFlg = spclBkgRqstFlg;
		this.pagerows = pagerows;
		this.lstRqstDatFlg = lstRqstDatFlg;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.rcQty = rcQty;
		this.bbCgoQty = bbCgoQty;
		this.rqstOfcCd = rqstOfcCd;
		this.spclCgoAproRqstSeq = spclCgoAproRqstSeq;
		this.updUsrId = updUsrId;
		this.bkgDeTermCd = bkgDeTermCd;
		this.orgBkgForSplit = orgBkgForSplit;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("spcl_cgo_rqst_seq", getSpclCgoRqstSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dcgo_qty", getDcgoQty());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("awk_cgo_qty", getAwkCgoQty());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("spcl_cgo_cate_cd", getSpclCgoCateCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("spcl_bkg_rqst_flg", getSpclBkgRqstFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lst_rqst_dat_flg", getLstRqstDatFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("rc_qty", getRcQty());
		this.hashColumns.put("bb_cgo_qty", getBbCgoQty());
		this.hashColumns.put("rqst_ofc_cd", getRqstOfcCd());
		this.hashColumns.put("spcl_cgo_apro_rqst_seq", getSpclCgoAproRqstSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("org_bkg_for_split", getOrgBkgForSplit());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("spcl_cgo_rqst_seq", "spclCgoRqstSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dcgo_qty", "dcgoQty");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("awk_cgo_qty", "awkCgoQty");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("spcl_cgo_cate_cd", "spclCgoCateCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("spcl_bkg_rqst_flg", "spclBkgRqstFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lst_rqst_dat_flg", "lstRqstDatFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("rc_qty", "rcQty");
		this.hashFields.put("bb_cgo_qty", "bbCgoQty");
		this.hashFields.put("rqst_ofc_cd", "rqstOfcCd");
		this.hashFields.put("spcl_cgo_apro_rqst_seq", "spclCgoAproRqstSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("org_bkg_for_split", "orgBkgForSplit");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return spclCgoRqstSeq
	 */
	public String getSpclCgoRqstSeq() {
		return this.spclCgoRqstSeq;
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
	 * @return dcgoQty
	 */
	public String getDcgoQty() {
		return this.dcgoQty;
	}
	
	/**
	 * Column Info
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return awkCgoQty
	 */
	public String getAwkCgoQty() {
		return this.awkCgoQty;
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
	 * @return spclCgoCateCd
	 */
	public String getSpclCgoCateCd() {
		return this.spclCgoCateCd;
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
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return emlSndNo
	 */
	public String getEmlSndNo() {
		return this.emlSndNo;
	}
	
	/**
	 * Column Info
	 * @return spclBkgRqstFlg
	 */
	public String getSpclBkgRqstFlg() {
		return this.spclBkgRqstFlg;
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
	 * @return lstRqstDatFlg
	 */
	public String getLstRqstDatFlg() {
		return this.lstRqstDatFlg;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return rcQty
	 */
	public String getRcQty() {
		return this.rcQty;
	}
	
	/**
	 * Column Info
	 * @return bbCgoQty
	 */
	public String getBbCgoQty() {
		return this.bbCgoQty;
	}
	
	/**
	 * Column Info
	 * @return rqstOfcCd
	 */
	public String getRqstOfcCd() {
		return this.rqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @return spclCgoAproRqstSeq
	 */
	public String getSpclCgoAproRqstSeq() {
		return this.spclCgoAproRqstSeq;
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
	 * @return bkgDeTermCd
	 */
	public String getBkgDeTermCd() {
		return this.bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return orgBkgForSplit
	 */
	public String getOrgBkgForSplit() {
		return this.orgBkgForSplit;
	}

	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param spclCgoRqstSeq
	 */
	public void setSpclCgoRqstSeq(String spclCgoRqstSeq) {
		this.spclCgoRqstSeq = spclCgoRqstSeq;
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
	 * @param dcgoQty
	 */
	public void setDcgoQty(String dcgoQty) {
		this.dcgoQty = dcgoQty;
	}
	
	/**
	 * Column Info
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param awkCgoQty
	 */
	public void setAwkCgoQty(String awkCgoQty) {
		this.awkCgoQty = awkCgoQty;
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
	 * @param spclCgoCateCd
	 */
	public void setSpclCgoCateCd(String spclCgoCateCd) {
		this.spclCgoCateCd = spclCgoCateCd;
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
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param emlSndNo
	 */
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
	}
	
	/**
	 * Column Info
	 * @param spclBkgRqstFlg
	 */
	public void setSpclBkgRqstFlg(String spclBkgRqstFlg) {
		this.spclBkgRqstFlg = spclBkgRqstFlg;
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
	 * @param lstRqstDatFlg
	 */
	public void setLstRqstDatFlg(String lstRqstDatFlg) {
		this.lstRqstDatFlg = lstRqstDatFlg;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param rcQty
	 */
	public void setRcQty(String rcQty) {
		this.rcQty = rcQty;
	}
	
	/**
	 * Column Info
	 * @param bbCgoQty
	 */
	public void setBbCgoQty(String bbCgoQty) {
		this.bbCgoQty = bbCgoQty;
	}
	
	/**
	 * Column Info
	 * @param rqstOfcCd
	 */
	public void setRqstOfcCd(String rqstOfcCd) {
		this.rqstOfcCd = rqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @param spclCgoAproRqstSeq
	 */
	public void setSpclCgoAproRqstSeq(String spclCgoAproRqstSeq) {
		this.spclCgoAproRqstSeq = spclCgoAproRqstSeq;
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
	 * @param bkgDeTermCd
	 */
	public void setBkgDeTermCd(String bkgDeTermCd) {
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return orgBkgForSplit
	 */
	public String setOrgBkgForSplit(String orgBkgForSplit) {
		return this.orgBkgForSplit = orgBkgForSplit;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setSpclCgoRqstSeq(JSPUtil.getParameter(request, "spcl_cgo_rqst_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDcgoQty(JSPUtil.getParameter(request, "dcgo_qty", ""));
		setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
		setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
		setAwkCgoQty(JSPUtil.getParameter(request, "awk_cgo_qty", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSpclCgoCateCd(JSPUtil.getParameter(request, "spcl_cgo_cate_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setEmlSndNo(JSPUtil.getParameter(request, "eml_snd_no", ""));
		setSpclBkgRqstFlg(JSPUtil.getParameter(request, "spcl_bkg_rqst_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLstRqstDatFlg(JSPUtil.getParameter(request, "lst_rqst_dat_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRcQty(JSPUtil.getParameter(request, "rc_qty", ""));
		setBbCgoQty(JSPUtil.getParameter(request, "bb_cgo_qty", ""));
		setRqstOfcCd(JSPUtil.getParameter(request, "rqst_ofc_cd", ""));
		setSpclCgoAproRqstSeq(JSPUtil.getParameter(request, "spcl_cgo_apro_rqst_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
		setOrgBkgForSplit(JSPUtil.getParameter(request, "org_bkg_for_split", ""));
	}
	
	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgAproRqstVO[]
	 */
	public ScgAproRqstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgAproRqstVO[]
	 */
	public ScgAproRqstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgAproRqstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] spclCgoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_rqst_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dcgoQty = (JSPUtil.getParameter(request, prefix	+ "dcgo_qty", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] awkCgoQty = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_qty", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] spclCgoCateCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_cate_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no", length));
			String[] spclBkgRqstFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bkg_rqst_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lstRqstDatFlg = (JSPUtil.getParameter(request, prefix	+ "lst_rqst_dat_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] rcQty = (JSPUtil.getParameter(request, prefix	+ "rc_qty", length));
			String[] bbCgoQty = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_qty", length));
			String[] rqstOfcCd = (JSPUtil.getParameter(request, prefix	+ "rqst_ofc_cd", length));
			String[] spclCgoAproRqstSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_apro_rqst_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] orgBkgForSplit = (JSPUtil.getParameter(request, prefix	+ "org_bkg_for_split", length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgAproRqstVO();
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (spclCgoRqstSeq[i] != null)
					model.setSpclCgoRqstSeq(spclCgoRqstSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dcgoQty[i] != null)
					model.setDcgoQty(dcgoQty[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (awkCgoQty[i] != null)
					model.setAwkCgoQty(awkCgoQty[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (spclCgoCateCd[i] != null)
					model.setSpclCgoCateCd(spclCgoCateCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (spclBkgRqstFlg[i] != null)
					model.setSpclBkgRqstFlg(spclBkgRqstFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lstRqstDatFlg[i] != null)
					model.setLstRqstDatFlg(lstRqstDatFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (rcQty[i] != null)
					model.setRcQty(rcQty[i]);
				if (bbCgoQty[i] != null)
					model.setBbCgoQty(bbCgoQty[i]);
				if (rqstOfcCd[i] != null)
					model.setRqstOfcCd(rqstOfcCd[i]);
				if (spclCgoAproRqstSeq[i] != null)
					model.setSpclCgoAproRqstSeq(spclCgoAproRqstSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				if (orgBkgForSplit[i] != null)
					model.setOrgBkgForSplit(orgBkgForSplit[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgAproRqstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgAproRqstVO[]
	 */
	public ScgAproRqstVO[] getScgAproRqstVOs(){
		ScgAproRqstVO[] vos = (ScgAproRqstVO[])models.toArray(new ScgAproRqstVO[models.size()]);
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
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoRqstSeq = this.spclCgoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoQty = this.dcgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoQty = this.awkCgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCateCd = this.spclCgoCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBkgRqstFlg = this.spclBkgRqstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstRqstDatFlg = this.lstRqstDatFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcQty = this.rcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoQty = this.bbCgoQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstOfcCd = this.rqstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAproRqstSeq = this.spclCgoAproRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgBkgForSplit = this.orgBkgForSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
