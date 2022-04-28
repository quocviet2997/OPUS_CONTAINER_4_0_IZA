/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgIrregularVO.java
*@FileTitle : ScgIrregularVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2009.05.29 김현욱 
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
 * @author 김현욱
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgIrregularVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgIrregularVO> models = new ArrayList<ScgIrregularVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String irrSmryRmk = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String spclCgoCateCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String spclCgoIrrTpCd = null;
	/* Column Info */
	private String irrRsnRmk = null;
	/* Column Info */
	private String cmsrDesc = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String irrSubjNm = null;
	/* Column Info */
	private String bkgRefNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cgoOprCd = null;
	/* Column Info */
	private String spclCgoIrrSeq = null;
	/* Column Info */
	private String irrOccrDt = null;
	/* Column Info */
	private String vslOprTpCd = null;
	/* Column Info */
	private String spclCgoIrrPlcCd = null;
	/* Column Info */
	private String irrPlcDesc = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgIrregularVO() {}

	public ScgIrregularVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String spclCgoIrrSeq, String spclCgoIrrTpCd, String spclCgoCateCd, String irrOccrDt, String vslOprTpCd, String cgoOprCd, String irrSubjNm, String spclCgoIrrPlcCd, String irrPlcDesc, String bkgNo, String bkgNoSplit, String bkgRefNo, String irrSmryRmk, String irrRsnRmk, String cmsrDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.irrSmryRmk = irrSmryRmk;
		this.bkgNoSplit = bkgNoSplit;
		this.creDt = creDt;
		this.spclCgoCateCd = spclCgoCateCd;
		this.skdVoyNo = skdVoyNo;
		this.spclCgoIrrTpCd = spclCgoIrrTpCd;
		this.irrRsnRmk = irrRsnRmk;
		this.cmsrDesc = cmsrDesc;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.irrSubjNm = irrSubjNm;
		this.bkgRefNo = bkgRefNo;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.ibflag = ibflag;
		this.cgoOprCd = cgoOprCd;
		this.spclCgoIrrSeq = spclCgoIrrSeq;
		this.irrOccrDt = irrOccrDt;
		this.vslOprTpCd = vslOprTpCd;
		this.spclCgoIrrPlcCd = spclCgoIrrPlcCd;
		this.irrPlcDesc = irrPlcDesc;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("irr_smry_rmk", getIrrSmryRmk());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("spcl_cgo_cate_cd", getSpclCgoCateCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("spcl_cgo_irr_tp_cd", getSpclCgoIrrTpCd());
		this.hashColumns.put("irr_rsn_rmk", getIrrRsnRmk());
		this.hashColumns.put("cmsr_desc", getCmsrDesc());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("irr_subj_nm", getIrrSubjNm());
		this.hashColumns.put("bkg_ref_no", getBkgRefNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cgo_opr_cd", getCgoOprCd());
		this.hashColumns.put("spcl_cgo_irr_seq", getSpclCgoIrrSeq());
		this.hashColumns.put("irr_occr_dt", getIrrOccrDt());
		this.hashColumns.put("vsl_opr_tp_cd", getVslOprTpCd());
		this.hashColumns.put("spcl_cgo_irr_plc_cd", getSpclCgoIrrPlcCd());
		this.hashColumns.put("irr_plc_desc", getIrrPlcDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("irr_smry_rmk", "irrSmryRmk");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("spcl_cgo_cate_cd", "spclCgoCateCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("spcl_cgo_irr_tp_cd", "spclCgoIrrTpCd");
		this.hashFields.put("irr_rsn_rmk", "irrRsnRmk");
		this.hashFields.put("cmsr_desc", "cmsrDesc");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("irr_subj_nm", "irrSubjNm");
		this.hashFields.put("bkg_ref_no", "bkgRefNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cgo_opr_cd", "cgoOprCd");
		this.hashFields.put("spcl_cgo_irr_seq", "spclCgoIrrSeq");
		this.hashFields.put("irr_occr_dt", "irrOccrDt");
		this.hashFields.put("vsl_opr_tp_cd", "vslOprTpCd");
		this.hashFields.put("spcl_cgo_irr_plc_cd", "spclCgoIrrPlcCd");
		this.hashFields.put("irr_plc_desc", "irrPlcDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return irrSmryRmk
	 */
	public String getIrrSmryRmk() {
		return this.irrSmryRmk;
	}
	
	/**
	 * Column Info
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
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
	 * @return spclCgoCateCd
	 */
	public String getSpclCgoCateCd() {
		return this.spclCgoCateCd;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return spclCgoIrrTpCd
	 */
	public String getSpclCgoIrrTpCd() {
		return this.spclCgoIrrTpCd;
	}
	
	/**
	 * Column Info
	 * @return irrRsnRmk
	 */
	public String getIrrRsnRmk() {
		return this.irrRsnRmk;
	}
	
	/**
	 * Column Info
	 * @return cmsrDesc
	 */
	public String getCmsrDesc() {
		return this.cmsrDesc;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return irrSubjNm
	 */
	public String getIrrSubjNm() {
		return this.irrSubjNm;
	}
	
	/**
	 * Column Info
	 * @return bkgRefNo
	 */
	public String getBkgRefNo() {
		return this.bkgRefNo;
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
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return cgoOprCd
	 */
	public String getCgoOprCd() {
		return this.cgoOprCd;
	}
	
	/**
	 * Column Info
	 * @return spclCgoIrrSeq
	 */
	public String getSpclCgoIrrSeq() {
		return this.spclCgoIrrSeq;
	}
	
	/**
	 * Column Info
	 * @return irrOccrDt
	 */
	public String getIrrOccrDt() {
		return this.irrOccrDt;
	}
	
	/**
	 * Column Info
	 * @return vslOprTpCd
	 */
	public String getVslOprTpCd() {
		return this.vslOprTpCd;
	}
	
	/**
	 * Column Info
	 * @return spclCgoIrrPlcCd
	 */
	public String getSpclCgoIrrPlcCd() {
		return this.spclCgoIrrPlcCd;
	}
	
	/**
	 * Column Info
	 * @return irrPlcDesc
	 */
	public String getIrrPlcDesc() {
		return this.irrPlcDesc;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param irrSmryRmk
	 */
	public void setIrrSmryRmk(String irrSmryRmk) {
		this.irrSmryRmk = irrSmryRmk;
	}
	
	/**
	 * Column Info
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
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
	 * @param spclCgoCateCd
	 */
	public void setSpclCgoCateCd(String spclCgoCateCd) {
		this.spclCgoCateCd = spclCgoCateCd;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param spclCgoIrrTpCd
	 */
	public void setSpclCgoIrrTpCd(String spclCgoIrrTpCd) {
		this.spclCgoIrrTpCd = spclCgoIrrTpCd;
	}
	
	/**
	 * Column Info
	 * @param irrRsnRmk
	 */
	public void setIrrRsnRmk(String irrRsnRmk) {
		this.irrRsnRmk = irrRsnRmk;
	}
	
	/**
	 * Column Info
	 * @param cmsrDesc
	 */
	public void setCmsrDesc(String cmsrDesc) {
		this.cmsrDesc = cmsrDesc;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param irrSubjNm
	 */
	public void setIrrSubjNm(String irrSubjNm) {
		this.irrSubjNm = irrSubjNm;
	}
	
	/**
	 * Column Info
	 * @param bkgRefNo
	 */
	public void setBkgRefNo(String bkgRefNo) {
		this.bkgRefNo = bkgRefNo;
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
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param cgoOprCd
	 */
	public void setCgoOprCd(String cgoOprCd) {
		this.cgoOprCd = cgoOprCd;
	}
	
	/**
	 * Column Info
	 * @param spclCgoIrrSeq
	 */
	public void setSpclCgoIrrSeq(String spclCgoIrrSeq) {
		this.spclCgoIrrSeq = spclCgoIrrSeq;
	}
	
	/**
	 * Column Info
	 * @param irrOccrDt
	 */
	public void setIrrOccrDt(String irrOccrDt) {
		this.irrOccrDt = irrOccrDt;
	}
	
	/**
	 * Column Info
	 * @param vslOprTpCd
	 */
	public void setVslOprTpCd(String vslOprTpCd) {
		this.vslOprTpCd = vslOprTpCd;
	}
	
	/**
	 * Column Info
	 * @param spclCgoIrrPlcCd
	 */
	public void setSpclCgoIrrPlcCd(String spclCgoIrrPlcCd) {
		this.spclCgoIrrPlcCd = spclCgoIrrPlcCd;
	}
	
	/**
	 * Column Info
	 * @param irrPlcDesc
	 */
	public void setIrrPlcDesc(String irrPlcDesc) {
		this.irrPlcDesc = irrPlcDesc;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setIrrSmryRmk(JSPUtil.getParameter(request, "irr_smry_rmk", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSpclCgoCateCd(JSPUtil.getParameter(request, "spcl_cgo_cate_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setSpclCgoIrrTpCd(JSPUtil.getParameter(request, "spcl_cgo_irr_tp_cd", ""));
		setIrrRsnRmk(JSPUtil.getParameter(request, "irr_rsn_rmk", ""));
		setCmsrDesc(JSPUtil.getParameter(request, "cmsr_desc", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIrrSubjNm(JSPUtil.getParameter(request, "irr_subj_nm", ""));
		setBkgRefNo(JSPUtil.getParameter(request, "bkg_ref_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCgoOprCd(JSPUtil.getParameter(request, "cgo_opr_cd", ""));
		setSpclCgoIrrSeq(JSPUtil.getParameter(request, "spcl_cgo_irr_seq", ""));
		setIrrOccrDt(JSPUtil.getParameter(request, "irr_occr_dt", ""));
		setVslOprTpCd(JSPUtil.getParameter(request, "vsl_opr_tp_cd", ""));
		setSpclCgoIrrPlcCd(JSPUtil.getParameter(request, "spcl_cgo_irr_plc_cd", ""));
		setIrrPlcDesc(JSPUtil.getParameter(request, "irr_plc_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgIrregularVO[]
	 */
	public ScgIrregularVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgIrregularVO[]
	 */
	public ScgIrregularVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgIrregularVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] irrSmryRmk = (JSPUtil.getParameter(request, prefix	+ "irr_smry_rmk".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] spclCgoCateCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_cate_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] spclCgoIrrTpCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_tp_cd".trim(), length));
			String[] irrRsnRmk = (JSPUtil.getParameter(request, prefix	+ "irr_rsn_rmk".trim(), length));
			String[] cmsrDesc = (JSPUtil.getParameter(request, prefix	+ "cmsr_desc".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] irrSubjNm = (JSPUtil.getParameter(request, prefix	+ "irr_subj_nm".trim(), length));
			String[] bkgRefNo = (JSPUtil.getParameter(request, prefix	+ "bkg_ref_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cgoOprCd = (JSPUtil.getParameter(request, prefix	+ "cgo_opr_cd".trim(), length));
			String[] spclCgoIrrSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_seq".trim(), length));
			String[] irrOccrDt = (JSPUtil.getParameter(request, prefix	+ "irr_occr_dt".trim(), length));
			String[] vslOprTpCd = (JSPUtil.getParameter(request, prefix	+ "vsl_opr_tp_cd".trim(), length));
			String[] spclCgoIrrPlcCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_plc_cd".trim(), length));
			String[] irrPlcDesc = (JSPUtil.getParameter(request, prefix	+ "irr_plc_desc".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgIrregularVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (irrSmryRmk[i] != null)
					model.setIrrSmryRmk(irrSmryRmk[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (spclCgoCateCd[i] != null)
					model.setSpclCgoCateCd(spclCgoCateCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (spclCgoIrrTpCd[i] != null)
					model.setSpclCgoIrrTpCd(spclCgoIrrTpCd[i]);
				if (irrRsnRmk[i] != null)
					model.setIrrRsnRmk(irrRsnRmk[i]);
				if (cmsrDesc[i] != null)
					model.setCmsrDesc(cmsrDesc[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (irrSubjNm[i] != null)
					model.setIrrSubjNm(irrSubjNm[i]);
				if (bkgRefNo[i] != null)
					model.setBkgRefNo(bkgRefNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cgoOprCd[i] != null)
					model.setCgoOprCd(cgoOprCd[i]);
				if (spclCgoIrrSeq[i] != null)
					model.setSpclCgoIrrSeq(spclCgoIrrSeq[i]);
				if (irrOccrDt[i] != null)
					model.setIrrOccrDt(irrOccrDt[i]);
				if (vslOprTpCd[i] != null)
					model.setVslOprTpCd(vslOprTpCd[i]);
				if (spclCgoIrrPlcCd[i] != null)
					model.setSpclCgoIrrPlcCd(spclCgoIrrPlcCd[i]);
				if (irrPlcDesc[i] != null)
					model.setIrrPlcDesc(irrPlcDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgIrregularVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgIrregularVO[]
	 */
	public ScgIrregularVO[] getScgIrregularVOs(){
		ScgIrregularVO[] vos = (ScgIrregularVO[])models.toArray(new ScgIrregularVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrSmryRmk = this.irrSmryRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCateCd = this.spclCgoCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrTpCd = this.spclCgoIrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrRsnRmk = this.irrRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmsrDesc = this.cmsrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrSubjNm = this.irrSubjNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRefNo = this.bkgRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoOprCd = this.cgoOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrSeq = this.spclCgoIrrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrOccrDt = this.irrOccrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslOprTpCd = this.vslOprTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrPlcCd = this.spclCgoIrrPlcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrPlcDesc = this.irrPlcDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
