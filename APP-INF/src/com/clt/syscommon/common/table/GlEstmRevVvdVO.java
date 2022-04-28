/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : GlEstmRevVvdVO.java
 *@FileTitle : GlEstmRevVvdVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.08.07
 *@LastModifier : 추경원
 *@LastVersion : 1.0
 * 2009.08.07 추경원 
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
 * @author 추경원
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class GlEstmRevVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;

	private Collection<GlEstmRevVvdVO> models = new ArrayList<GlEstmRevVvdVO>();

	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String exeYrmon = null;
	/* Column Info */
	private String estmVvdHdrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String estmVvdTpCd = null;
	/* Column Info */
	private String vstDt = null;
	/* Column Info */
	private String revDirCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String estmBcDivCd = null;
	/* Column Info */
	private String vedDt = null;
	/* Column Info */
	private String estmIocDivCd = null;

	/* Generated Column */
	private String vslDirCd = null;
	/* Generated Column */
	private String lane = null;
	/* Generated Column */
	private String status = null;
	/* Generated Column */
	private String commAmt = null;
	/* Generated Column */
	private String acclCommAmt = null;
	/* Generated Column */
	private String actCommAmt = null;
	/* Generated Column */
	private String estmCommAmt = null;

	/* Column Info */
	private String creUsrId;
	/* Column Info */
	private String updDt;
	/* Column Info */
	private String updUsrId;

	/* 테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/* 테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();

	public GlEstmRevVvdVO() {
	}

	public GlEstmRevVvdVO(String ibflag, String pagerows, String exeYrmon, String revYrmon, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd,
			String estmVvdTpCd, String estmIocDivCd, String estmVvdHdrId, String estmBcDivCd, String creDt, String vstDt, String vedDt, String rlaneCd, String lineNo,
			String vslDirCd, String lane, String status, String commAmt, String acclCommAmt, String actCommAmt, String estmCommAmt, String creUsrId, String updDt,
			String updUsrId) {
		this.vslCd = vslCd;
		this.revYrmon = revYrmon;
		this.exeYrmon = exeYrmon;
		this.estmVvdHdrId = estmVvdHdrId;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.lineNo = lineNo;
		this.rlaneCd = rlaneCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.estmVvdTpCd = estmVvdTpCd;
		this.vstDt = vstDt;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.estmBcDivCd = estmBcDivCd;
		this.vedDt = vedDt;
		this.estmIocDivCd = estmIocDivCd;
		this.estmBcDivCd = estmBcDivCd;

		this.vslDirCd = vslDirCd;
		this.lane = lane;
		this.status = status;
		this.commAmt = commAmt;
		this.acclCommAmt = acclCommAmt;
		this.actCommAmt = actCommAmt;
		this.estmCommAmt = estmCommAmt;

		this.creUsrId = creUsrId;
		this.updDt = updDt;
		this.updUsrId = updUsrId;
	}

	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("exe_yrmon", getExeYrmon());
		this.hashColumns.put("estm_vvd_hdr_id", getEstmVvdHdrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("estm_vvd_tp_cd", getEstmVvdTpCd());
		this.hashColumns.put("vst_dt", getVstDt());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("estm_bc_div_cd", getEstmBcDivCd());
		this.hashColumns.put("ved_dt", getVedDt());
		this.hashColumns.put("estm_ioc_div_cd", getEstmIocDivCd());

		this.hashColumns.put("vsl_dir_cd", getVslDirCd());
		this.hashColumns.put("lane", getLane());
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("comm_amt", getCommAmt());
		this.hashColumns.put("accl_comm_amt", getAcclCommAmt());
		this.hashColumns.put("act_comm_amt", getActCommAmt());
		this.hashColumns.put("estm_comm_amt", getEstmCommAmt());

		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());

		return this.hashColumns;
	}

	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * 
	 * @return
	 */
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("estm_vvd_hdr_id", "estmVvdHdrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("estm_vvd_tp_cd", "estmVvdTpCd");
		this.hashFields.put("vst_dt", "vstDt");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("estm_bc_div_cd", "estmBcDivCd");
		this.hashFields.put("ved_dt", "vedDt");
		this.hashFields.put("estm_ioc_div_cd", "estmIocDivCd");

		this.hashFields.put("vsl_dir_cd", "vslDirCd");
		this.hashFields.put("lane", "lane");
		this.hashFields.put("status", "status");
		this.hashFields.put("comm_amt", "commAmt");
		this.hashFields.put("accl_comm_amt", "acclCommAmt");
		this.hashFields.put("act_comm_amt", "actCommAmt");
		this.hashFields.put("estm_comm_amt", "estmCommAmt");

		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("upd_usr_id", "updUsrId");

		return this.hashFields;
	}

	/**
	 * Column Info
	 * 
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}

	/**
	 * Column Info
	 * 
	 * @return revYrmon
	 */
	public String getRevYrmon() {
		return this.revYrmon;
	}

	/**
	 * Column Info
	 * 
	 * @return exeYrmon
	 */
	public String getExeYrmon() {
		return this.exeYrmon;
	}

	/**
	 * Column Info
	 * 
	 * @return estmVvdHdrId
	 */
	public String getEstmVvdHdrId() {
		return this.estmVvdHdrId;
	}

	/**
	 * Column Info
	 * 
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}

	/**
	 * Column Info
	 * 
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}

	/**
	 * Column Info
	 * 
	 * @return lineNo
	 */
	public String getLineNo() {
		return this.lineNo;
	}

	/**
	 * Column Info
	 * 
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}

	/**
	 * Column Info
	 * 
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}

	/**
	 * Page Number
	 * 
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @return estmVvdTpCd
	 */
	public String getEstmVvdTpCd() {
		return this.estmVvdTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return vstDt
	 */
	public String getVstDt() {
		return this.vstDt;
	}

	/**
	 * Column Info
	 * 
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
	}

	/**
	 * Status
	 * 
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @return estmBcDivCd
	 */
	public String getEstmBcDivCd() {
		return this.estmBcDivCd;
	}

	/**
	 * Column Info
	 * 
	 * @return vedDt
	 */
	public String getVedDt() {
		return this.vedDt;
	}

	/**
	 * Column Info
	 * 
	 * @return estmIocDivCd
	 */
	public String getEstmIocDivCd() {
		return this.estmIocDivCd;
	}

	/**
	 * Generated Column
	 * 
	 * @return vslDirCd
	 */
	public String getVslDirCd() {
		return this.vslDirCd;
	}

	/**
	 * Generated Column
	 * 
	 * @return lane
	 */
	public String getLane() {
		return this.lane;
	}

	/**
	 * Generated Column
	 * 
	 * @return status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Generated Column
	 * 
	 * @return commAmt
	 */
	public String getCommAmt() {
		return this.commAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @return acclCommAmt
	 */
	public String getAcclCommAmt() {
		return this.acclCommAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @return actCommAmt
	 */
	public String getActCommAmt() {
		return this.actCommAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @return estmCommAmt
	 */
	public String getEstmCommAmt() {
		return this.estmCommAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}

	/**
	 * Column Info
	 * 
	 * @param revYrmon
	 */
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
	}

	/**
	 * Column Info
	 * 
	 * @param exeYrmon
	 */
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
	}

	/**
	 * Column Info
	 * 
	 * @param estmVvdHdrId
	 */
	public void setEstmVvdHdrId(String estmVvdHdrId) {
		this.estmVvdHdrId = estmVvdHdrId;
	}

	/**
	 * Column Info
	 * 
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * Column Info
	 * 
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}

	/**
	 * Column Info
	 * 
	 * @param lineNo
	 */
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	/**
	 * Column Info
	 * 
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}

	/**
	 * Column Info
	 * 
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}

	/**
	 * Page Number
	 * 
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @param estmVvdTpCd
	 */
	public void setEstmVvdTpCd(String estmVvdTpCd) {
		this.estmVvdTpCd = estmVvdTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param vstDt
	 */
	public void setVstDt(String vstDt) {
		this.vstDt = vstDt;
	}

	/**
	 * Column Info
	 * 
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
	}

	/**
	 * Status
	 * 
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @param estmBcDivCd
	 */
	public void setEstmBcDivCd(String estmBcDivCd) {
		this.estmBcDivCd = estmBcDivCd;
	}

	/**
	 * Column Info
	 * 
	 * @param vedDt
	 */
	public void setVedDt(String vedDt) {
		this.vedDt = vedDt;
	}

	/**
	 * Column Info
	 * 
	 * @param estmIocDivCd
	 */
	public void setEstmIocDivCd(String estmIocDivCd) {
		this.estmIocDivCd = estmIocDivCd;
	}

	/**
	 * Generated Column
	 * 
	 * @return vslDirCd
	 */
	public void setVslDirCd(String vslDirCd) {
		this.vslDirCd = vslDirCd;
	}

	/**
	 * Generated Column
	 * 
	 * @lane
	 */
	public void setLane(String lane) {
		this.lane = lane;
	}

	/**
	 * Generated Column
	 * 
	 * @return status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Generated Column
	 * 
	 * @param commAmt
	 */
	public void setCommAmt(String commAmt) {
		this.commAmt = commAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @param acclCommAmt
	 */
	public void setAcclCommAmt(String acclCommAmt) {
		this.acclCommAmt = acclCommAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @param actCommAmt
	 */
	public void setActCommAmt(String actCommAmt) {
		this.actCommAmt = actCommAmt;
	}

	/**
	 * Generated Column
	 * 
	 * @param estmCommAmt
	 */
	public void setEstmCommAmt(String estmCommAmt) {
		this.estmCommAmt = estmCommAmt;
	}

	public Collection<GlEstmRevVvdVO> getModels() {
		return models;
	}

	public void setModels(Collection<GlEstmRevVvdVO> models) {
		this.models = models;
	}

	public String getCreUsrId() {
		return creUsrId;
	}

	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	public String getUpdDt() {
		return updDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	public String getUpdUsrId() {
		return updUsrId;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}

	public HashMap<String, String> getHashColumns() {
		return hashColumns;
	}

	public void setHashColumns(HashMap<String, String> hashColumns) {
		this.hashColumns = hashColumns;
	}

	public HashMap<String, String> getHashFields() {
		return hashFields;
	}

	public void setHashFields(HashMap<String, String> hashFields) {
		this.hashFields = hashFields;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setRevYrmon(JSPUtil.getParameter(request, "rev_yrmon", ""));
		setExeYrmon(JSPUtil.getParameter(request, "exe_yrmon", ""));
		setEstmVvdHdrId(JSPUtil.getParameter(request, "estm_vvd_hdr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setLineNo(JSPUtil.getParameter(request, "line_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEstmVvdTpCd(JSPUtil.getParameter(request, "estm_vvd_tp_cd", ""));
		setVstDt(JSPUtil.getParameter(request, "vst_dt", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEstmBcDivCd(JSPUtil.getParameter(request, "estm_bc_div_cd", ""));
		setVedDt(JSPUtil.getParameter(request, "ved_dt", ""));
		setEstmIocDivCd(JSPUtil.getParameter(request, "estm_ioc_div_cd", ""));

		setVslDirCd(JSPUtil.getParameter(request, "vsl_dir_cd", ""));
		setLane(JSPUtil.getParameter(request, "lane", ""));
		setStatus(JSPUtil.getParameter(request, "status", ""));
		setCommAmt(JSPUtil.getParameter(request, "comm_amt", ""));
		setAcclCommAmt(JSPUtil.getParameter(request, "accl_comm_amt", ""));
		setActCommAmt(JSPUtil.getParameter(request, "act_comm_amt", ""));
		setEstmCommAmt(JSPUtil.getParameter(request, "estm_comm_amt", ""));

	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * 
	 * @param request
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		GlEstmRevVvdVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp == null)
			return null;

		int length = request.getParameterValues(prefix + "ibflag").length;

		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix + "rev_yrmon", length));
			String[] exeYrmon = (JSPUtil.getParameter(request, prefix + "exe_yrmon", length));
			String[] estmVvdHdrId = (JSPUtil.getParameter(request, prefix + "estm_vvd_hdr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix + "line_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
			String[] estmVvdTpCd = (JSPUtil.getParameter(request, prefix + "estm_vvd_tp_cd", length));
			String[] vstDt = (JSPUtil.getParameter(request, prefix + "vst_dt", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix + "rev_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
			String[] estmBcDivCd = (JSPUtil.getParameter(request, prefix + "estm_bc_div_cd", length));
			String[] vedDt = (JSPUtil.getParameter(request, prefix + "ved_dt", length));
			String[] estmIocDivCd = (JSPUtil.getParameter(request, prefix + "estm_ioc_div_cd", length));

			String[] vslDirCd = (JSPUtil.getParameter(request, prefix + "vsl_dir_cd", length));
			String[] lane = (JSPUtil.getParameter(request, prefix + "lane", length));
			String[] status = (JSPUtil.getParameter(request, prefix + "status", length));
			String[] commAmt = (JSPUtil.getParameter(request, prefix + "comm_amt", length));
			String[] acclCommAmt = (JSPUtil.getParameter(request, prefix + "accl_comm_amt", length));
			String[] actCommAmt = (JSPUtil.getParameter(request, prefix + "act_comm_amt", length));
			String[] estmCommAmt = (JSPUtil.getParameter(request, prefix + "estm_comm_amt", length));

			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));

			for (int i = 0; i < length; i++) {
				model = new GlEstmRevVvdVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (exeYrmon[i] != null)
					model.setExeYrmon(exeYrmon[i]);
				if (estmVvdHdrId[i] != null)
					model.setEstmVvdHdrId(estmVvdHdrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (estmVvdTpCd[i] != null)
					model.setEstmVvdTpCd(estmVvdTpCd[i]);
				if (vstDt[i] != null)
					model.setVstDt(vstDt[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (estmBcDivCd[i] != null)
					model.setEstmBcDivCd(estmBcDivCd[i]);
				if (vedDt[i] != null)
					model.setVedDt(vedDt[i]);
				if (estmIocDivCd[i] != null)
					model.setEstmIocDivCd(estmIocDivCd[i]);

				if (vslDirCd[i] != null)
					model.setVslDirCd(vslDirCd[i]);
				if (lane[i] != null)
					model.setLane(lane[i]);
				if (status[i] != null)
					model.setStatus(status[i]);
				if (commAmt[i] != null)
					model.setCommAmt(commAmt[i]);
				if (acclCommAmt[i] != null)
					model.setAcclCommAmt(acclCommAmt[i]);
				if (actCommAmt[i] != null)
					model.setActCommAmt(actCommAmt[i]);
				if (estmCommAmt[i] != null)
					model.setEstmCommAmt(estmCommAmt[i]);

				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);

				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getGlEstmRevVvdVOs();
	}

	/**
	 * VO 배열을 반환
	 * 
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[] getGlEstmRevVvdVOs() {
		GlEstmRevVvdVO[] vos = (GlEstmRevVvdVO[]) models.toArray(new GlEstmRevVvdVO[models.size()]);
		return vos;
	}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr = null;
				arr = getField(field, i);
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
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
	 * 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try {
			arr = (String[]) field[i].get(this);
		} catch (Exception ex) {
			arr = null;
		}
		return arr;
	}

	/**
	 * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	 */
	public void unDataFormat() {
		this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon = this.exeYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdHdrId = this.estmVvdHdrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdTpCd = this.estmVvdTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vstDt = this.vstDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmBcDivCd = this.estmBcDivCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vedDt = this.vedDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmIocDivCd = this.estmIocDivCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");

		this.vslDirCd = this.vslDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lane = this.lane.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status = this.status.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commAmt = this.commAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclCommAmt = this.acclCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCommAmt = this.actCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCommAmt = this.estmCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");

		this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
