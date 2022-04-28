/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonQtaTrdVO.java
*@FileTitle : SaqMonQtaTrdVO
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

public class SaqMonQtaTrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonQtaTrdVO> models = new ArrayList<SaqMonQtaTrdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String sprtGrpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtRhqCd = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String mqtaStepCd = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String bsaGrpCd = null;
	/* Column Info */
	private String mqtaVerNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonQtaTrdVO() {}

	public SaqMonQtaTrdVO(String ibflag, String pagerows, String mqtaStepCd, String bseYr, String bseQtrCd, String trdCd, String dirCd, String mqtaVerNo, String rlaneCd, String sprtGrpCd, String bsaGrpCd, String ctrtRhqCd, String bseMon, String subTrdCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raOpfitUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.cmUcAmt = cmUcAmt;
		this.lodQty = lodQty;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.opfitUcAmt = opfitUcAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.bseYr = bseYr;
		this.rlaneCd = rlaneCd;
		this.sprtGrpCd = sprtGrpCd;
		this.pagerows = pagerows;
		this.ctrtRhqCd = ctrtRhqCd;
		this.bseQtrCd = bseQtrCd;
		this.bseMon = bseMon;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.raCmUcAmt = raCmUcAmt;
		this.mqtaStepCd = mqtaStepCd;
		this.grsRpbRev = grsRpbRev;
		this.dirCd = dirCd;
		this.bsaGrpCd = bsaGrpCd;
		this.mqtaVerNo = mqtaVerNo;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("sprt_grp_cd", getSprtGrpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_rhq_cd", getCtrtRhqCd());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("mqta_step_cd", getMqtaStepCd());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("bsa_grp_cd", getBsaGrpCd());
		this.hashColumns.put("mqta_ver_no", getMqtaVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("sprt_grp_cd", "sprtGrpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_rhq_cd", "ctrtRhqCd");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("mqta_step_cd", "mqtaStepCd");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("bsa_grp_cd", "bsaGrpCd");
		this.hashFields.put("mqta_ver_no", "mqtaVerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		return this.hashFields;
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
	 * @return cmUcAmt
	 */
	public String getCmUcAmt() {
		return this.cmUcAmt;
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
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return sprtGrpCd
	 */
	public String getSprtGrpCd() {
		return this.sprtGrpCd;
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
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
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
	 * @return raCmUcAmt
	 */
	public String getRaCmUcAmt() {
		return this.raCmUcAmt;
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
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
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
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
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
	 * @param cmUcAmt
	 */
	public void setCmUcAmt(String cmUcAmt) {
		this.cmUcAmt = cmUcAmt;
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
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param sprtGrpCd
	 */
	public void setSprtGrpCd(String sprtGrpCd) {
		this.sprtGrpCd = sprtGrpCd;
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
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
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
	 * @param raCmUcAmt
	 */
	public void setRaCmUcAmt(String raCmUcAmt) {
		this.raCmUcAmt = raCmUcAmt;
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
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSprtGrpCd(JSPUtil.getParameter(request, "sprt_grp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtRhqCd(JSPUtil.getParameter(request, "ctrt_rhq_cd", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setMqtaStepCd(JSPUtil.getParameter(request, "mqta_step_cd", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setBsaGrpCd(JSPUtil.getParameter(request, "bsa_grp_cd", ""));
		setMqtaVerNo(JSPUtil.getParameter(request, "mqta_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonQtaTrdVO[]
	 */
	public SaqMonQtaTrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaTrdVO[]
	 */
	public SaqMonQtaTrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonQtaTrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] sprtGrpCd = (JSPUtil.getParameter(request, prefix	+ "sprt_grp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ctrtRhqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rhq_cd", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] mqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "mqta_step_cd", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] bsaGrpCd = (JSPUtil.getParameter(request, prefix	+ "bsa_grp_cd", length));
			String[] mqtaVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonQtaTrdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (sprtGrpCd[i] != null)
					model.setSprtGrpCd(sprtGrpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtRhqCd[i] != null)
					model.setCtrtRhqCd(ctrtRhqCd[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (mqtaStepCd[i] != null)
					model.setMqtaStepCd(mqtaStepCd[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (bsaGrpCd[i] != null)
					model.setBsaGrpCd(bsaGrpCd[i]);
				if (mqtaVerNo[i] != null)
					model.setMqtaVerNo(mqtaVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonQtaTrdVOs();
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaTrdVO[]
	 */
//	public SaqMonQtaTrdVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonQtaTrdVO model = null;
//		
//		String bse_mon = "";
//		if (conVo.getTargetMonth().equals("") == false) {
//			bse_mon = conVo.getTargetMonth().substring(4);
//		}
//		
//		String[] tmp = request.getParameterValues("ibflag");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("ibflag").length;
//  
//		try {
//			
//			String[] updDt = (JSPUtil.getParameter(request, "upd_dt", length));
//			String[] cmUcAmt = (JSPUtil.getParameter(request, "cm_uc_amt", length));
//			String[] lodQty = (JSPUtil.getParameter(request, "lod_qty", length));
//			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, "ra_opfit_uc_amt", length));
//			String[] opfitUcAmt = (JSPUtil.getParameter(request, "opfit_uc_amt", length));
//			String[] creDt = (JSPUtil.getParameter(request, "cre_dt", length));
//			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd", length));
//			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr", length));
//			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd", length));
//			String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd", length));
//			String[] pagerows = (JSPUtil.getParameter(request, "pagerows", length));
//			String[] ctrtRhqCd = (JSPUtil.getParameter(request, "rhq_cd", length));
//			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd", length));
//			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon", length));
//			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id", length));
//			String[] ibflag = (JSPUtil.getParameter(request, "ibflag", length));
//			String[] raCmUcAmt = (JSPUtil.getParameter(request, "ra_cm_uc_amt", length));
//			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd", length));
//			String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev", length));
//			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd", length));
//			String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd", length));
//			String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no", length));
//			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id", length));
//			String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd", length));
//			
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonQtaTrdVO();
//				if (updDt[i] != null)
//					model.setUpdDt(updDt[i]);
//				if (cmUcAmt[i] != null)
//					model.setCmUcAmt(cmUcAmt[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (raOpfitUcAmt[i] != null)
//					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
//				if (opfitUcAmt[i] != null)
//					model.setOpfitUcAmt(opfitUcAmt[i]);
//				if (creDt[i] != null)
//					model.setCreDt(creDt[i]);
//				if (trdCd[i] != null)
//					model.setTrdCd(conVo.getTrade()); // 변수
//				if (bseYr[i] != null)
//					model.setBseYr(conVo.getYear()); // 변수
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (sprtGrpCd[i] != null)
//					model.setSprtGrpCd(sprtGrpCd[i]);
//				if (pagerows[i] != null)
//					model.setPagerows(pagerows[i]);
//				if (ctrtRhqCd[i] != null)
//					model.setCtrtRhqCd(ctrtRhqCd[i]);
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(conVo.getBse_quarter()); // 변수
//				if (bseMon[i] != null)
//					model.setBseMon(bse_mon); // 변수
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (raCmUcAmt[i] != null)
//					model.setRaCmUcAmt(raCmUcAmt[i]);
//				if (mqtaStepCd[i] != null)
//					model.setMqtaStepCd(conVo.getMQtaStepCd()); // 변수
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(conVo.getBound()); // 변수
//				if (bsaGrpCd[i] != null)
//					model.setBsaGrpCd(bsaGrpCd[i]);
//				if (mqtaVerNo[i] != null)
//					model.setMqtaVerNo(conVo.getMQtaVerNo()); // 변수
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaTrdVOs();
//	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param conVo
	 * @param chkVo
	 * @return SaqMonQtaTrdVO[]
	 */
//	public SaqMonQtaTrdVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo, String chkVo) {
//		SaqMonQtaTrdVO model = null;
//		
//		String[] tmp = request.getParameterValues("ibflag");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("ibflag").length;
//  
//		try {
//			
//			//Quarterly Quota > Adjustment > Trade Group Vs. Regional Group > excel upload popup
//			if("0176".equals(chkVo.trim())){
//				
//				String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd", length));
//				String[] laneGrp = (JSPUtil.getParameter(request, "lane_grp", length));
//				String[] ctrtRhqCd = (JSPUtil.getParameter(request, "rhq_cd", length));
//				String[] bseMon = (JSPUtil.getParameter(request, "bse_mon", length));
//				String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd", length));
//				String[] lodQty = (JSPUtil.getParameter(request, "lod_qty", length));
//				String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev", length));
//				String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id", length));
//				String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd", length));
//				String[] bseYr = (JSPUtil.getParameter(request, "bse_yr", length));
//				String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd", length));
//				String[] trdCd = (JSPUtil.getParameter(request, "trd_cd", length));
//				String[] dirCd = (JSPUtil.getParameter(request, "dir_cd", length));
//				String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no", length));
//				String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd", length));
//				String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd", length));
//				//--> not use..
//				String[] updDt = (JSPUtil.getParameter(request, "upd_dt", length));
//				String[] cmUcAmt = (JSPUtil.getParameter(request, "cm_uc_amt", length));
//				String[] raOpfitUcAmt = (JSPUtil.getParameter(request, "ra_opfit_uc_amt", length));
//				String[] opfitUcAmt = (JSPUtil.getParameter(request, "opfit_uc_amt", length));
//				String[] creDt = (JSPUtil.getParameter(request, "cre_dt", length));
//				String[] pagerows = (JSPUtil.getParameter(request, "pagerows", length));
//				String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id", length));
//				String[] ibflag = (JSPUtil.getParameter(request, "ibflag", length));
//				String[] raCmUcAmt = (JSPUtil.getParameter(request, "ra_cm_uc_amt", length));
//				
//				for (int i = 0; i < length; i++) {
//					model = new SaqMonQtaTrdVO();
//					if (mqtaStepCd[i] != null)
//						model.setMqtaStepCd(conVo.getMqta_step_cd()); // 변수
//					if (bseYr[i] != null)
//						model.setBseYr(conVo.getBse_yr()); // 변수
//					if (bseQtrCd[i] != null)
//						model.setBseQtrCd(conVo.getBse_qtr_cd()); // 변수
//					if (trdCd[i] != null)
//						model.setTrdCd(conVo.getTrd_cd()); // 변수
//					if (dirCd[i] != null)
//						model.setDirCd(conVo.getDir_cd()); // 변수
//					if (mqtaVerNo[i] != null)
//						model.setMqtaVerNo(conVo.getMqta_ver_no()); // 변수
//					if (rlaneCd[i] != null)
//						model.setRlaneCd(rlaneCd[i]);
//					if (sprtGrpCd[i] != null)
//						model.setSprtGrpCd(laneGrp[i].substring(0, 1));
//					if (bsaGrpCd[i] != null)
//						model.setBsaGrpCd(laneGrp[i].substring(1));
//					if (ctrtRhqCd[i] != null)
//						model.setCtrtRhqCd(ctrtRhqCd[i]);
//					if (bseMon[i] != null)
//						model.setBseMon(bseMon[i]);
//					if (subTrdCd[i] != null)
//						model.setSubTrdCd(subTrdCd[i]);
//					if (lodQty[i] != null)
//						model.setLodQty(lodQty[i]);
//					if (grsRpbRev[i] != null)
//						model.setGrsRpbRev(grsRpbRev[i]);
//					if (updUsrId[i] != null)
//						model.setUpdUsrId(updUsrId[i]);
//					if (updDt[i] != null)
//						model.setUpdDt(updDt[i]);
//					if (cmUcAmt[i] != null)
//						model.setCmUcAmt(cmUcAmt[i]);
//					if (raOpfitUcAmt[i] != null)
//						model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
//					if (opfitUcAmt[i] != null)
//						model.setOpfitUcAmt(opfitUcAmt[i]);
//					if (creDt[i] != null)
//						model.setCreDt(creDt[i]);
//					if (pagerows[i] != null)
//						model.setPagerows(pagerows[i]);
//					if (creUsrId[i] != null)
//						model.setCreUsrId(creUsrId[i]);
//					if (ibflag[i] != null)
//						model.setIbflag(ibflag[i]);
//					if (raCmUcAmt[i] != null)
//						model.setRaCmUcAmt(raCmUcAmt[i]);
//					
//					models.add(model);
//				}//end of for
//				
//			}else{
//				String[] updDt = (JSPUtil.getParameter(request, "upd_dt", length));
//				String[] cmUcAmt = (JSPUtil.getParameter(request, "cm_uc_amt", length));
//				String[] lodQty = (JSPUtil.getParameter(request, "lod_qty", length));
//				String[] raOpfitUcAmt = (JSPUtil.getParameter(request, "ra_opfit_uc_amt", length));
//				String[] opfitUcAmt = (JSPUtil.getParameter(request, "opfit_uc_amt", length));
//				String[] creDt = (JSPUtil.getParameter(request, "cre_dt", length));
//				String[] trdCd = (JSPUtil.getParameter(request, "trd_cd", length));
//				String[] bseYr = (JSPUtil.getParameter(request, "bse_yr", length));
//				String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd", length));
//				String[] sprtGrpCd = (JSPUtil.getParameter(request, "sprt_grp_cd", length));
//				String[] pagerows = (JSPUtil.getParameter(request, "pagerows", length));
//				String[] ctrtRhqCd = (JSPUtil.getParameter(request, "ctrt_rhq_cd", length));
//				String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd", length));
//				String[] bseMon = (JSPUtil.getParameter(request, "bse_mon", length));
//				String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id", length));
//				String[] ibflag = (JSPUtil.getParameter(request, "ibflag", length));
//				String[] raCmUcAmt = (JSPUtil.getParameter(request, "ra_cm_uc_amt", length));
//				String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd", length));
//				String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev", length));
//				String[] dirCd = (JSPUtil.getParameter(request, "dir_cd", length));
//				String[] bsaGrpCd = (JSPUtil.getParameter(request, "bsa_grp_cd", length));
//				String[] mqtaVerNo = (JSPUtil.getParameter(request, "mqta_ver_no", length));
//				String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id", length));
//				String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd", length));
//				String[] load2 = (JSPUtil.getParameter(request,  "load2".trim(), length));
//				String[] load3 = (JSPUtil.getParameter(request,  "load3".trim(), length));
//				String[] grpb2 = (JSPUtil.getParameter(request,  "g_rpb2".trim(), length));
//				String[] grpb3 = (JSPUtil.getParameter(request,  "g_rpb3".trim(), length));		
//				
//				for (int i = 0; i < length; i++) {
//					for	(int j = 0; j < 2; j++) {	
//						
//						// 11월 이후에 bse_mon증가 처리 
//						String month=null;
//						int tmp_mon = Integer.parseInt(conVo.getBse_qtr_cd().substring(0,1))*3-1+j;
//						month = tmp_mon > 9 ? String.valueOf(tmp_mon): "0"+String.valueOf(tmp_mon);
//						
//						model = new SaqMonQtaTrdVO();
//						if (mqtaStepCd[i] != null)
//							model.setMqtaStepCd(conVo.getMqta_step_cd()); // 변수
//						if (bseYr[i] != null)
//							model.setBseYr(conVo.getBse_yr()); // 변수
//						if (trdCd[i] != null)
//							model.setTrdCd(conVo.getTrd_cd()); // 변수
//						if (dirCd[i] != null)
//							model.setDirCd(conVo.getDir_cd()); // 변수
//						if (mqtaVerNo[i] != null)
//							model.setMqtaVerNo(conVo.getMqta_ver_no()); // 변수
//						if (bseQtrCd[i] != null)
//							model.setBseQtrCd(conVo.getBse_qtr_cd()); // 변수
//						if (ibflag[i] != null)
//							model.setIbflag(ibflag[i]);
//						if (rlaneCd[i] != null)
//							model.setRlaneCd(rlaneCd[i]);
//						if (sprtGrpCd[i] != null)
//							model.setSprtGrpCd(sprtGrpCd[i]);
//						if (bsaGrpCd[i] != null)
//							model.setBsaGrpCd(bsaGrpCd[i]);
//						if (ctrtRhqCd[i] != null)
//							model.setCtrtRhqCd(ctrtRhqCd[i]);
//						if (bseMon[i] != null)
//							model.setBseMon(month); // 변수
//						
//						if (j == 0){
//							//if (lodQty[i] != null)
//								model.setLodQty(load2[i]);
//							//if (grsRpbRev[i] != null)
//								model.setGrsRpbRev(grpb2[i]);
//						}else if (j == 1){
//							//if (lodQty[i] != null)
//								model.setLodQty(load3[i]);
//							//if (grsRpbRev[i] != null)
//								model.setGrsRpbRev(grpb3[i]);
//						}
//						
//						if (creUsrId[i] != null)
//							model.setCreUsrId(creUsrId[i]);
//						if (updUsrId[i] != null)
//							model.setUpdUsrId(updUsrId[i]);
//						if (updDt[i] != null)
//							model.setUpdDt(updDt[i]);
//						if (cmUcAmt[i] != null)
//							model.setCmUcAmt(cmUcAmt[i]);
//						if (raOpfitUcAmt[i] != null)
//							model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
//						if (opfitUcAmt[i] != null)
//							model.setOpfitUcAmt(opfitUcAmt[i]);
//						if (creDt[i] != null)
//							model.setCreDt(creDt[i]);
//						if (pagerows[i] != null)
//							model.setPagerows(pagerows[i]);
//						if (raCmUcAmt[i] != null)
//							model.setRaCmUcAmt(raCmUcAmt[i]);
//						if (subTrdCd[i] != null)
//							model.setSubTrdCd(subTrdCd[i]);
//						models.add(model);
//					}
//				}
//				
//			}//end of if chkVo
//			
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaTrdVOs();
//	}

	/**
	 * VO 배열을 반환
	 * @return SaqMonQtaTrdVO[]
	 */
	public SaqMonQtaTrdVO[] getSaqMonQtaTrdVOs(){
		SaqMonQtaTrdVO[] vos = (SaqMonQtaTrdVO[])models.toArray(new SaqMonQtaTrdVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sprtGrpCd = this.sprtGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRhqCd = this.ctrtRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaStepCd = this.mqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaGrpCd = this.bsaGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaVerNo = this.mqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
