/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchGlEstimateRevenueVvdListVO.java
*@FileTitle : SearchGlEstimateRevenueVvdListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.08
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.08  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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

public class SearchGlEstimateRevenueVvdListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchGlEstimateRevenueVvdListVO> models = new ArrayList<SearchGlEstimateRevenueVvdListVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String hEstmVvdTpCd = null;
	/* Column Info */
	private String estmVvdHdrId = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String hVslCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String revDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hSkdVoyNo = null;
	/* Column Info */
	private String estmBcDivCd = null;
	/* Column Info */
	private String hEstmIocDivCd = null;
	/* Column Info */
	private String hRevYrmon = null;
	/* Column Info */
	private String hRevDirCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String exeYrmon = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String estmVvdTpCd = null;
	/* Column Info */
	private String vstDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hExeYrmon = null;
	/* Column Info */
	private String hSkdDirCd = null;
	/* Column Info */
	private String estmIocDivCd = null;
	/* Column Info */
	private String vedDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchGlEstimateRevenueVvdListVO() {}

	public SearchGlEstimateRevenueVvdListVO(String ibflag, String pagerows, String exeYrmon, String revYrmon, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String estmVvdTpCd, String estmIocDivCd, String hExeYrmon, String hRevYrmon, String hVslCd, String hSkdVoyNo, String hSkdDirCd, String hRevDirCd, String hEstmVvdTpCd, String hEstmIocDivCd, String estmVvdHdrId, String estmBcDivCd, String vstDt, String vedDt, String rlaneCd, String lineNo, String creUsrId, String updUsrId) {
		this.vslCd = vslCd;
		this.hEstmVvdTpCd = hEstmVvdTpCd;
		this.estmVvdHdrId = estmVvdHdrId;
		this.rlaneCd = rlaneCd;
		this.hVslCd = hVslCd;
		this.pagerows = pagerows;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.hSkdVoyNo = hSkdVoyNo;
		this.estmBcDivCd = estmBcDivCd;
		this.hEstmIocDivCd = hEstmIocDivCd;
		this.hRevYrmon = hRevYrmon;
		this.hRevDirCd = hRevDirCd;
		this.updUsrId = updUsrId;
		this.revYrmon = revYrmon;
		this.exeYrmon = exeYrmon;
		this.skdVoyNo = skdVoyNo;
		this.lineNo = lineNo;
		this.skdDirCd = skdDirCd;
		this.estmVvdTpCd = estmVvdTpCd;
		this.vstDt = vstDt;
		this.creUsrId = creUsrId;
		this.hExeYrmon = hExeYrmon;
		this.hSkdDirCd = hSkdDirCd;
		this.estmIocDivCd = estmIocDivCd;
		this.vedDt = vedDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("h_estm_vvd_tp_cd", getHEstmVvdTpCd());
		this.hashColumns.put("estm_vvd_hdr_id", getEstmVvdHdrId());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("h_vsl_cd", getHVslCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("h_skd_voy_no", getHSkdVoyNo());
		this.hashColumns.put("estm_bc_div_cd", getEstmBcDivCd());
		this.hashColumns.put("h_estm_ioc_div_cd", getHEstmIocDivCd());
		this.hashColumns.put("h_rev_yrmon", getHRevYrmon());
		this.hashColumns.put("h_rev_dir_cd", getHRevDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("exe_yrmon", getExeYrmon());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("estm_vvd_tp_cd", getEstmVvdTpCd());
		this.hashColumns.put("vst_dt", getVstDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("h_exe_yrmon", getHExeYrmon());
		this.hashColumns.put("h_skd_dir_cd", getHSkdDirCd());
		this.hashColumns.put("estm_ioc_div_cd", getEstmIocDivCd());
		this.hashColumns.put("ved_dt", getVedDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("h_estm_vvd_tp_cd", "hEstmVvdTpCd");
		this.hashFields.put("estm_vvd_hdr_id", "estmVvdHdrId");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("h_vsl_cd", "hVslCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("h_skd_voy_no", "hSkdVoyNo");
		this.hashFields.put("estm_bc_div_cd", "estmBcDivCd");
		this.hashFields.put("h_estm_ioc_div_cd", "hEstmIocDivCd");
		this.hashFields.put("h_rev_yrmon", "hRevYrmon");
		this.hashFields.put("h_rev_dir_cd", "hRevDirCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("estm_vvd_tp_cd", "estmVvdTpCd");
		this.hashFields.put("vst_dt", "vstDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("h_exe_yrmon", "hExeYrmon");
		this.hashFields.put("h_skd_dir_cd", "hSkdDirCd");
		this.hashFields.put("estm_ioc_div_cd", "estmIocDivCd");
		this.hashFields.put("ved_dt", "vedDt");
		return this.hashFields;
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
	 * @return hEstmVvdTpCd
	 */
	public String getHEstmVvdTpCd() {
		return this.hEstmVvdTpCd;
	}
	
	/**
	 * Column Info
	 * @return estmVvdHdrId
	 */
	public String getEstmVvdHdrId() {
		return this.estmVvdHdrId;
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
	 * @return hVslCd
	 */
	public String getHVslCd() {
		return this.hVslCd;
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
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return hSkdVoyNo
	 */
	public String getHSkdVoyNo() {
		return this.hSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return estmBcDivCd
	 */
	public String getEstmBcDivCd() {
		return this.estmBcDivCd;
	}
	
	/**
	 * Column Info
	 * @return hEstmIocDivCd
	 */
	public String getHEstmIocDivCd() {
		return this.hEstmIocDivCd;
	}
	
	/**
	 * Column Info
	 * @return hRevYrmon
	 */
	public String getHRevYrmon() {
		return this.hRevYrmon;
	}
	
	/**
	 * Column Info
	 * @return hRevDirCd
	 */
	public String getHRevDirCd() {
		return this.hRevDirCd;
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
	 * @return revYrmon
	 */
	public String getRevYrmon() {
		return this.revYrmon;
	}
	
	/**
	 * Column Info
	 * @return exeYrmon
	 */
	public String getExeYrmon() {
		return this.exeYrmon;
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
	 * @return lineNo
	 */
	public String getLineNo() {
		return this.lineNo;
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
	 * @return estmVvdTpCd
	 */
	public String getEstmVvdTpCd() {
		return this.estmVvdTpCd;
	}
	
	/**
	 * Column Info
	 * @return vstDt
	 */
	public String getVstDt() {
		return this.vstDt;
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
	 * @return hExeYrmon
	 */
	public String getHExeYrmon() {
		return this.hExeYrmon;
	}
	
	/**
	 * Column Info
	 * @return hSkdDirCd
	 */
	public String getHSkdDirCd() {
		return this.hSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return estmIocDivCd
	 */
	public String getEstmIocDivCd() {
		return this.estmIocDivCd;
	}
	
	/**
	 * Column Info
	 * @return vedDt
	 */
	public String getVedDt() {
		return this.vedDt;
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
	 * @param hEstmVvdTpCd
	 */
	public void setHEstmVvdTpCd(String hEstmVvdTpCd) {
		this.hEstmVvdTpCd = hEstmVvdTpCd;
	}
	
	/**
	 * Column Info
	 * @param estmVvdHdrId
	 */
	public void setEstmVvdHdrId(String estmVvdHdrId) {
		this.estmVvdHdrId = estmVvdHdrId;
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
	 * @param hVslCd
	 */
	public void setHVslCd(String hVslCd) {
		this.hVslCd = hVslCd;
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
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param hSkdVoyNo
	 */
	public void setHSkdVoyNo(String hSkdVoyNo) {
		this.hSkdVoyNo = hSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param estmBcDivCd
	 */
	public void setEstmBcDivCd(String estmBcDivCd) {
		this.estmBcDivCd = estmBcDivCd;
	}
	
	/**
	 * Column Info
	 * @param hEstmIocDivCd
	 */
	public void setHEstmIocDivCd(String hEstmIocDivCd) {
		this.hEstmIocDivCd = hEstmIocDivCd;
	}
	
	/**
	 * Column Info
	 * @param hRevYrmon
	 */
	public void setHRevYrmon(String hRevYrmon) {
		this.hRevYrmon = hRevYrmon;
	}
	
	/**
	 * Column Info
	 * @param hRevDirCd
	 */
	public void setHRevDirCd(String hRevDirCd) {
		this.hRevDirCd = hRevDirCd;
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
	 * @param revYrmon
	 */
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
	}
	
	/**
	 * Column Info
	 * @param exeYrmon
	 */
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
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
	 * @param lineNo
	 */
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
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
	 * @param estmVvdTpCd
	 */
	public void setEstmVvdTpCd(String estmVvdTpCd) {
		this.estmVvdTpCd = estmVvdTpCd;
	}
	
	/**
	 * Column Info
	 * @param vstDt
	 */
	public void setVstDt(String vstDt) {
		this.vstDt = vstDt;
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
	 * @param hExeYrmon
	 */
	public void setHExeYrmon(String hExeYrmon) {
		this.hExeYrmon = hExeYrmon;
	}
	
	/**
	 * Column Info
	 * @param hSkdDirCd
	 */
	public void setHSkdDirCd(String hSkdDirCd) {
		this.hSkdDirCd = hSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param estmIocDivCd
	 */
	public void setEstmIocDivCd(String estmIocDivCd) {
		this.estmIocDivCd = estmIocDivCd;
	}
	
	/**
	 * Column Info
	 * @param vedDt
	 */
	public void setVedDt(String vedDt) {
		this.vedDt = vedDt;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setHEstmVvdTpCd(JSPUtil.getParameter(request, prefix + "h_estm_vvd_tp_cd", ""));
		setEstmVvdHdrId(JSPUtil.getParameter(request, prefix + "estm_vvd_hdr_id", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setHVslCd(JSPUtil.getParameter(request, prefix + "h_vsl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRevDirCd(JSPUtil.getParameter(request, prefix + "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setHSkdVoyNo(JSPUtil.getParameter(request, prefix + "h_skd_voy_no", ""));
		setEstmBcDivCd(JSPUtil.getParameter(request, prefix + "estm_bc_div_cd", ""));
		setHEstmIocDivCd(JSPUtil.getParameter(request, prefix + "h_estm_ioc_div_cd", ""));
		setHRevYrmon(JSPUtil.getParameter(request, prefix + "h_rev_yrmon", ""));
		setHRevDirCd(JSPUtil.getParameter(request, prefix + "h_rev_dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setRevYrmon(JSPUtil.getParameter(request, prefix + "rev_yrmon", ""));
		setExeYrmon(JSPUtil.getParameter(request, prefix + "exe_yrmon", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setLineNo(JSPUtil.getParameter(request, prefix + "line_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setEstmVvdTpCd(JSPUtil.getParameter(request, prefix + "estm_vvd_tp_cd", ""));
		setVstDt(JSPUtil.getParameter(request, prefix + "vst_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setHExeYrmon(JSPUtil.getParameter(request, prefix + "h_exe_yrmon", ""));
		setHSkdDirCd(JSPUtil.getParameter(request, prefix + "h_skd_dir_cd", ""));
		setEstmIocDivCd(JSPUtil.getParameter(request, prefix + "estm_ioc_div_cd", ""));
		setVedDt(JSPUtil.getParameter(request, prefix + "ved_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchGlEstimateRevenueVvdListVO[]
	 */
	public SearchGlEstimateRevenueVvdListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchGlEstimateRevenueVvdListVO[]
	 */
	public SearchGlEstimateRevenueVvdListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchGlEstimateRevenueVvdListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] hEstmVvdTpCd = (JSPUtil.getParameter(request, prefix	+ "h_estm_vvd_tp_cd", length));
			String[] estmVvdHdrId = (JSPUtil.getParameter(request, prefix	+ "estm_vvd_hdr_id", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] hVslCd = (JSPUtil.getParameter(request, prefix	+ "h_vsl_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "h_skd_voy_no", length));
			String[] estmBcDivCd = (JSPUtil.getParameter(request, prefix	+ "estm_bc_div_cd", length));
			String[] hEstmIocDivCd = (JSPUtil.getParameter(request, prefix	+ "h_estm_ioc_div_cd", length));
			String[] hRevYrmon = (JSPUtil.getParameter(request, prefix	+ "h_rev_yrmon", length));
			String[] hRevDirCd = (JSPUtil.getParameter(request, prefix	+ "h_rev_dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix	+ "rev_yrmon", length));
			String[] exeYrmon = (JSPUtil.getParameter(request, prefix	+ "exe_yrmon", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix	+ "line_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] estmVvdTpCd = (JSPUtil.getParameter(request, prefix	+ "estm_vvd_tp_cd", length));
			String[] vstDt = (JSPUtil.getParameter(request, prefix	+ "vst_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hExeYrmon = (JSPUtil.getParameter(request, prefix	+ "h_exe_yrmon", length));
			String[] hSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "h_skd_dir_cd", length));
			String[] estmIocDivCd = (JSPUtil.getParameter(request, prefix	+ "estm_ioc_div_cd", length));
			String[] vedDt = (JSPUtil.getParameter(request, prefix	+ "ved_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchGlEstimateRevenueVvdListVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (hEstmVvdTpCd[i] != null)
					model.setHEstmVvdTpCd(hEstmVvdTpCd[i]);
				if (estmVvdHdrId[i] != null)
					model.setEstmVvdHdrId(estmVvdHdrId[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (hVslCd[i] != null)
					model.setHVslCd(hVslCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hSkdVoyNo[i] != null)
					model.setHSkdVoyNo(hSkdVoyNo[i]);
				if (estmBcDivCd[i] != null)
					model.setEstmBcDivCd(estmBcDivCd[i]);
				if (hEstmIocDivCd[i] != null)
					model.setHEstmIocDivCd(hEstmIocDivCd[i]);
				if (hRevYrmon[i] != null)
					model.setHRevYrmon(hRevYrmon[i]);
				if (hRevDirCd[i] != null)
					model.setHRevDirCd(hRevDirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (exeYrmon[i] != null)
					model.setExeYrmon(exeYrmon[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (estmVvdTpCd[i] != null)
					model.setEstmVvdTpCd(estmVvdTpCd[i]);
				if (vstDt[i] != null)
					model.setVstDt(vstDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hExeYrmon[i] != null)
					model.setHExeYrmon(hExeYrmon[i]);
				if (hSkdDirCd[i] != null)
					model.setHSkdDirCd(hSkdDirCd[i]);
				if (estmIocDivCd[i] != null)
					model.setEstmIocDivCd(estmIocDivCd[i]);
				if (vedDt[i] != null)
					model.setVedDt(vedDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchGlEstimateRevenueVvdListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchGlEstimateRevenueVvdListVO[]
	 */
	public SearchGlEstimateRevenueVvdListVO[] getSearchGlEstimateRevenueVvdListVOs(){
		SearchGlEstimateRevenueVvdListVO[] vos = (SearchGlEstimateRevenueVvdListVO[])models.toArray(new SearchGlEstimateRevenueVvdListVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hEstmVvdTpCd = this.hEstmVvdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdHdrId = this.estmVvdHdrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hVslCd = this.hVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hSkdVoyNo = this.hSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmBcDivCd = this.estmBcDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hEstmIocDivCd = this.hEstmIocDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hRevYrmon = this.hRevYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hRevDirCd = this.hRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon = this.exeYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdTpCd = this.estmVvdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vstDt = this.vstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hExeYrmon = this.hExeYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hSkdDirCd = this.hSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmIocDivCd = this.estmIocDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vedDt = this.vedDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
