/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsAnrVvdVO.java
*@FileTitle : BkgCstmsAnrVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 정재엽
*@LastVersion : 1.0
* 2009.05.25 정재엽 
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
 * @author 정재엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAnrVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAnrVvdVO> models = new ArrayList<BkgCstmsAnrVvdVO>();
	
	/* Column Info */
	private String genDt = null;
	/* Column Info */
	private String svcRqstNo = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String demFreeDt = null;
	/* Column Info */
	private String etaDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String anrMsgStsCd = null;
	/* Column Info */
	private String vvdNm = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String depLocCd = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String brthDesc = null;
	/* Column Info */
	private String vslCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updOfcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rgstUsrId = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String datCreFlg = null;
	/* Column Info */
	private String genOfcCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String lstSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String lloydNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String lloydTpCd = null;

	private String rcv = null;
	
	private String anrDeclNo = null;
	
	private String refSeq = null;
	
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAnrVvdVO() {}

	public BkgCstmsAnrVvdVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String svcRqstNo, String lloydTpCd, String lloydNo, String vslCntCd, String vvdNm, String etaDt, String slanCd, String depLocCd, String brthDesc, String demFreeDt, String diffRmk, String datCreFlg, String genOfcCd, String genDt, String anrMsgStsCd, String lstSeq, String rgstUsrId, String creOfcCd, String updOfcCd, String creUsrId, String creDt, String updUsrId, String updDt, String rcv, String anrDeclNo, String refSeq) {
		this.genDt = genDt;
		this.svcRqstNo = svcRqstNo;
		this.vslCd = vslCd;
		this.demFreeDt = demFreeDt;
		this.etaDt = etaDt;
		this.creDt = creDt;
		this.anrMsgStsCd = anrMsgStsCd;
		this.vvdNm = vvdNm;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.depLocCd = depLocCd;
		this.creOfcCd = creOfcCd;
		this.brthDesc = brthDesc;
		this.vslCntCd = vslCntCd;
		this.updUsrId = updUsrId;
		this.updOfcCd = updOfcCd;
		this.updDt = updDt;
		this.rgstUsrId = rgstUsrId;
		this.skdVoyNo = skdVoyNo;
		this.datCreFlg = datCreFlg;
		this.genOfcCd = genOfcCd;
		this.skdDirCd = skdDirCd;
		this.lstSeq = lstSeq;
		this.creUsrId = creUsrId;
		this.slanCd = slanCd;
		this.lloydNo = lloydNo;
		this.diffRmk = diffRmk;
		this.lloydTpCd = lloydTpCd;
		this.rcv = rcv;
		this.anrDeclNo = anrDeclNo;
		this.refSeq = refSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("gen_dt", getGenDt());
		this.hashColumns.put("svc_rqst_no", getSvcRqstNo());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("dem_free_dt", getDemFreeDt());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("anr_msg_sts_cd", getAnrMsgStsCd());
		this.hashColumns.put("vvd_nm", getVvdNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dep_loc_cd", getDepLocCd());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("brth_desc", getBrthDesc());
		this.hashColumns.put("vsl_cnt_cd", getVslCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_ofc_cd", getUpdOfcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rgst_usr_id", getRgstUsrId());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("dat_cre_flg", getDatCreFlg());
		this.hashColumns.put("gen_ofc_cd", getGenOfcCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("lst_seq", getLstSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("lloyd_no", getLloydNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("lloyd_tp_cd", getLloydTpCd());
		this.hashColumns.put("rcv", getRcv());
		this.hashColumns.put("anr_decl_no", getAnrDeclNo());
		this.hashColumns.put("ref_seq", getRefSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("gen_dt", "genDt");
		this.hashFields.put("svc_rqst_no", "svcRqstNo");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("dem_free_dt", "demFreeDt");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("anr_msg_sts_cd", "anrMsgStsCd");
		this.hashFields.put("vvd_nm", "vvdNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dep_loc_cd", "depLocCd");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("brth_desc", "brthDesc");
		this.hashFields.put("vsl_cnt_cd", "vslCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_ofc_cd", "updOfcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rgst_usr_id", "rgstUsrId");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("dat_cre_flg", "datCreFlg");
		this.hashFields.put("gen_ofc_cd", "genOfcCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("lst_seq", "lstSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("lloyd_no", "lloydNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("lloyd_tp_cd", "lloydTpCd");
		this.hashFields.put("rcv", "rcv");
		this.hashFields.put("anr_decl_no", "anrDeclNo");
		this.hashFields.put("ref_seq", "refSeq");
		return this.hashFields;
	}
	
	
	
	public String getRefSeq() {
		return refSeq;
	}

	public void setRefSeq(String refSeq) {
		this.refSeq = refSeq;
	}

	public String getAnrDeclNo() {
		return anrDeclNo;
	}

	public void setAnrDeclNo(String anrDeclNo) {
		this.anrDeclNo = anrDeclNo;
	}

	public String getRcv() {
		return rcv;
	}

	public void setRcv(String rcv) {
		this.rcv = rcv;
	}

	/**
	 * Column Info
	 * @return genDt
	 */
	public String getGenDt() {
		return this.genDt;
	}
	
	/**
	 * Column Info
	 * @return svcRqstNo
	 */
	public String getSvcRqstNo() {
		return this.svcRqstNo;
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
	 * @return demFreeDt
	 */
	public String getDemFreeDt() {
		return this.demFreeDt;
	}
	
	/**
	 * Column Info
	 * @return etaDt
	 */
	public String getEtaDt() {
		return this.etaDt;
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
	 * @return anrMsgStsCd
	 */
	public String getAnrMsgStsCd() {
		return this.anrMsgStsCd;
	}
	
	/**
	 * Column Info
	 * @return vvdNm
	 */
	public String getVvdNm() {
		return this.vvdNm;
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
	 * @return depLocCd
	 */
	public String getDepLocCd() {
		return this.depLocCd;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return brthDesc
	 */
	public String getBrthDesc() {
		return this.brthDesc;
	}
	
	/**
	 * Column Info
	 * @return vslCntCd
	 */
	public String getVslCntCd() {
		return this.vslCntCd;
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
	 * @return updOfcCd
	 */
	public String getUpdOfcCd() {
		return this.updOfcCd;
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
	 * @return rgstUsrId
	 */
	public String getRgstUsrId() {
		return this.rgstUsrId;
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
	 * @return datCreFlg
	 */
	public String getDatCreFlg() {
		return this.datCreFlg;
	}
	
	/**
	 * Column Info
	 * @return genOfcCd
	 */
	public String getGenOfcCd() {
		return this.genOfcCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return lstSeq
	 */
	public String getLstSeq() {
		return this.lstSeq;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return lloydNo
	 */
	public String getLloydNo() {
		return this.lloydNo;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return lloydTpCd
	 */
	public String getLloydTpCd() {
		return this.lloydTpCd;
	}
	

	/**
	 * Column Info
	 * @param genDt
	 */
	public void setGenDt(String genDt) {
		this.genDt = genDt;
	}
	
	/**
	 * Column Info
	 * @param svcRqstNo
	 */
	public void setSvcRqstNo(String svcRqstNo) {
		this.svcRqstNo = svcRqstNo;
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
	 * @param demFreeDt
	 */
	public void setDemFreeDt(String demFreeDt) {
		this.demFreeDt = demFreeDt;
	}
	
	/**
	 * Column Info
	 * @param etaDt
	 */
	public void setEtaDt(String etaDt) {
		this.etaDt = etaDt;
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
	 * @param anrMsgStsCd
	 */
	public void setAnrMsgStsCd(String anrMsgStsCd) {
		this.anrMsgStsCd = anrMsgStsCd;
	}
	
	/**
	 * Column Info
	 * @param vvdNm
	 */
	public void setVvdNm(String vvdNm) {
		this.vvdNm = vvdNm;
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
	 * @param depLocCd
	 */
	public void setDepLocCd(String depLocCd) {
		this.depLocCd = depLocCd;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param brthDesc
	 */
	public void setBrthDesc(String brthDesc) {
		this.brthDesc = brthDesc;
	}
	
	/**
	 * Column Info
	 * @param vslCntCd
	 */
	public void setVslCntCd(String vslCntCd) {
		this.vslCntCd = vslCntCd;
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
	 * @param updOfcCd
	 */
	public void setUpdOfcCd(String updOfcCd) {
		this.updOfcCd = updOfcCd;
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
	 * @param rgstUsrId
	 */
	public void setRgstUsrId(String rgstUsrId) {
		this.rgstUsrId = rgstUsrId;
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
	 * @param datCreFlg
	 */
	public void setDatCreFlg(String datCreFlg) {
		this.datCreFlg = datCreFlg;
	}
	
	/**
	 * Column Info
	 * @param genOfcCd
	 */
	public void setGenOfcCd(String genOfcCd) {
		this.genOfcCd = genOfcCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param lstSeq
	 */
	public void setLstSeq(String lstSeq) {
		this.lstSeq = lstSeq;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param lloydNo
	 */
	public void setLloydNo(String lloydNo) {
		this.lloydNo = lloydNo;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param lloydTpCd
	 */
	public void setLloydTpCd(String lloydTpCd) {
		this.lloydTpCd = lloydTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setGenDt(JSPUtil.getParameter(request, "gen_dt", ""));
		setSvcRqstNo(JSPUtil.getParameter(request, "svc_rqst_no", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setDemFreeDt(JSPUtil.getParameter(request, "dem_free_dt", ""));
		setEtaDt(JSPUtil.getParameter(request, "eta_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAnrMsgStsCd(JSPUtil.getParameter(request, "anr_msg_sts_cd", ""));
		setVvdNm(JSPUtil.getParameter(request, "vvd_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDepLocCd(JSPUtil.getParameter(request, "dep_loc_cd", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setBrthDesc(JSPUtil.getParameter(request, "brth_desc", ""));
		setVslCntCd(JSPUtil.getParameter(request, "vsl_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdOfcCd(JSPUtil.getParameter(request, "upd_ofc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRgstUsrId(JSPUtil.getParameter(request, "rgst_usr_id", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setDatCreFlg(JSPUtil.getParameter(request, "dat_cre_flg", ""));
		setGenOfcCd(JSPUtil.getParameter(request, "gen_ofc_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setLstSeq(JSPUtil.getParameter(request, "lst_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setLloydNo(JSPUtil.getParameter(request, "lloyd_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setLloydTpCd(JSPUtil.getParameter(request, "lloyd_tp_cd", ""));
		setRcv(JSPUtil.getParameter(request, "rcv", ""));
		setAnrDeclNo(JSPUtil.getParameter(request, "anr_decl_no", ""));
		setRefSeq(JSPUtil.getParameter(request, "ref_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAnrVvdVO[]
	 */
	public BkgCstmsAnrVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAnrVvdVO[]
	 */
	public BkgCstmsAnrVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAnrVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] genDt = (JSPUtil.getParameter(request, prefix	+ "gen_dt".trim(), length));
			String[] svcRqstNo = (JSPUtil.getParameter(request, prefix	+ "svc_rqst_no".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] demFreeDt = (JSPUtil.getParameter(request, prefix	+ "dem_free_dt".trim(), length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] anrMsgStsCd = (JSPUtil.getParameter(request, prefix	+ "anr_msg_sts_cd".trim(), length));
			String[] vvdNm = (JSPUtil.getParameter(request, prefix	+ "vvd_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] depLocCd = (JSPUtil.getParameter(request, prefix	+ "dep_loc_cd".trim(), length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd".trim(), length));
			String[] brthDesc = (JSPUtil.getParameter(request, prefix	+ "brth_desc".trim(), length));
			String[] vslCntCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cnt_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updOfcCd = (JSPUtil.getParameter(request, prefix	+ "upd_ofc_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rgstUsrId = (JSPUtil.getParameter(request, prefix	+ "rgst_usr_id".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] datCreFlg = (JSPUtil.getParameter(request, prefix	+ "dat_cre_flg".trim(), length));
			String[] genOfcCd = (JSPUtil.getParameter(request, prefix	+ "gen_ofc_cd".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] lstSeq = (JSPUtil.getParameter(request, prefix	+ "lst_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			String[] lloydNo = (JSPUtil.getParameter(request, prefix	+ "lloyd_no".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] lloydTpCd = (JSPUtil.getParameter(request, prefix	+ "lloyd_tp_cd".trim(), length));
			String[] rcv = (JSPUtil.getParameter(request, prefix	+ "rcv".trim(), length));
			String[] anrDeclNo = (JSPUtil.getParameter(request, prefix	+ "anr_decl_no".trim(), length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAnrVvdVO();
				if (genDt[i] != null)
					model.setGenDt(genDt[i]);
				if (svcRqstNo[i] != null)
					model.setSvcRqstNo(svcRqstNo[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (demFreeDt[i] != null)
					model.setDemFreeDt(demFreeDt[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (anrMsgStsCd[i] != null)
					model.setAnrMsgStsCd(anrMsgStsCd[i]);
				if (vvdNm[i] != null)
					model.setVvdNm(vvdNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (depLocCd[i] != null)
					model.setDepLocCd(depLocCd[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (brthDesc[i] != null)
					model.setBrthDesc(brthDesc[i]);
				if (vslCntCd[i] != null)
					model.setVslCntCd(vslCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updOfcCd[i] != null)
					model.setUpdOfcCd(updOfcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rgstUsrId[i] != null)
					model.setRgstUsrId(rgstUsrId[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (datCreFlg[i] != null)
					model.setDatCreFlg(datCreFlg[i]);
				if (genOfcCd[i] != null)
					model.setGenOfcCd(genOfcCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (lstSeq[i] != null)
					model.setLstSeq(lstSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (lloydNo[i] != null)
					model.setLloydNo(lloydNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (lloydTpCd[i] != null)
					model.setLloydTpCd(lloydTpCd[i]);
				if (rcv[i] != null)
					model.setRcv(rcv[i]);
				if (anrDeclNo[i] != null)
					model.setAnrDeclNo(anrDeclNo[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAnrVvdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAnrVvdVO[]
	 */
	public BkgCstmsAnrVvdVO[] getBkgCstmsAnrVvdVOs(){
		BkgCstmsAnrVvdVO[] vos = (BkgCstmsAnrVvdVO[])models.toArray(new BkgCstmsAnrVvdVO[models.size()]);
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
		this.genDt = this.genDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcRqstNo = this.svcRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.demFreeDt = this.demFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anrMsgStsCd = this.anrMsgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdNm = this.vvdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depLocCd = this.depLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthDesc = this.brthDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCntCd = this.vslCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updOfcCd = this.updOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstUsrId = this.rgstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.datCreFlg = this.datCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genOfcCd = this.genOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstSeq = this.lstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydNo = this.lloydNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydTpCd = this.lloydTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcv = this.rcv .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anrDeclNo = this.anrDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
