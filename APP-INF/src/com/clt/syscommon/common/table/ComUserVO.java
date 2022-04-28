/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ComUserVO.java
*@FileTitle : ComUserVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.30
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.07.30 김민정 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComUserVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUserVO> models = new ArrayList<ComUserVO>();
	
	/* Column Info */
	private String langTpCd = null;
	/* Column Info */
	private String xtnPhnNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mphnNo = null;
	/* Column Info */
	private String usrAuthTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String usrLoclNm = null;
	/* Column Info */
	private String lstLginOfcCd = null;
	/* Column Info */
	private String cntNoFmtCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String usrEml = null;
	/* Column Info */
	private String jbEngNm = null;
	/* Column Info */
	private String cntDtFmtCd = null;
	/* Column Info */
	private String psnEngNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dfltEml = null;
	/* Column Info */
	private String useFlg = null;
	/* Column Info */
	private String usrPwd = null;
	/* Column Info */
	private String epId = null;
	/* Column Info */
	private String gmtTmznCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String grdEngNm = null;
	/* Column Info */
	private String faxNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUserVO() {}

	public ComUserVO(String ibflag, String pagerows, String usrId, String usrNm, String usrPwd, String useFlg, String mphnNo, String usrEml, String cntCd, String langTpCd, String gmtTmznCd, String cntDtFmtCd, String cntNoFmtCd, String xtnPhnNo, String jbEngNm, String psnEngNm, String grdEngNm, String faxNo, String ofcCd, String dfltEml, String usrAuthTpCd, String usrLoclNm, String epId, String creUsrId, String creDt, String updUsrId, String updDt, String lstLginOfcCd) {
		this.langTpCd = langTpCd;
		this.xtnPhnNo = xtnPhnNo;
		this.creDt = creDt;
		this.mphnNo = mphnNo;
		this.usrAuthTpCd = usrAuthTpCd;
		this.pagerows = pagerows;
		this.usrLoclNm = usrLoclNm;
		this.lstLginOfcCd = lstLginOfcCd;
		this.cntNoFmtCd = cntNoFmtCd;
		this.ibflag = ibflag;
		this.usrNm = usrNm;
		this.usrId = usrId;
		this.cntCd = cntCd;
		this.usrEml = usrEml;
		this.jbEngNm = jbEngNm;
		this.cntDtFmtCd = cntDtFmtCd;
		this.psnEngNm = psnEngNm;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.dfltEml = dfltEml;
		this.useFlg = useFlg;
		this.usrPwd = usrPwd;
		this.epId = epId;
		this.gmtTmznCd = gmtTmznCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.grdEngNm = grdEngNm;
		this.faxNo = faxNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lang_tp_cd", getLangTpCd());
		this.hashColumns.put("xtn_phn_no", getXtnPhnNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mphn_no", getMphnNo());
		this.hashColumns.put("usr_auth_tp_cd", getUsrAuthTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("usr_locl_nm", getUsrLoclNm());
		this.hashColumns.put("lst_lgin_ofc_cd", getLstLginOfcCd());
		this.hashColumns.put("cnt_no_fmt_cd", getCntNoFmtCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("usr_eml", getUsrEml());
		this.hashColumns.put("jb_eng_nm", getJbEngNm());
		this.hashColumns.put("cnt_dt_fmt_cd", getCntDtFmtCd());
		this.hashColumns.put("psn_eng_nm", getPsnEngNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dflt_eml", getDfltEml());
		this.hashColumns.put("use_flg", getUseFlg());
		this.hashColumns.put("usr_pwd", getUsrPwd());
		this.hashColumns.put("ep_id", getEpId());
		this.hashColumns.put("gmt_tmzn_cd", getGmtTmznCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("grd_eng_nm", getGrdEngNm());
		this.hashColumns.put("fax_no", getFaxNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lang_tp_cd", "langTpCd");
		this.hashFields.put("xtn_phn_no", "xtnPhnNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mphn_no", "mphnNo");
		this.hashFields.put("usr_auth_tp_cd", "usrAuthTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("usr_locl_nm", "usrLoclNm");
		this.hashFields.put("lst_lgin_ofc_cd", "lstLginOfcCd");
		this.hashFields.put("cnt_no_fmt_cd", "cntNoFmtCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("usr_eml", "usrEml");
		this.hashFields.put("jb_eng_nm", "jbEngNm");
		this.hashFields.put("cnt_dt_fmt_cd", "cntDtFmtCd");
		this.hashFields.put("psn_eng_nm", "psnEngNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dflt_eml", "dfltEml");
		this.hashFields.put("use_flg", "useFlg");
		this.hashFields.put("usr_pwd", "usrPwd");
		this.hashFields.put("ep_id", "epId");
		this.hashFields.put("gmt_tmzn_cd", "gmtTmznCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("grd_eng_nm", "grdEngNm");
		this.hashFields.put("fax_no", "faxNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return langTpCd
	 */
	public String getLangTpCd() {
		return this.langTpCd;
	}
	
	/**
	 * Column Info
	 * @return xtnPhnNo
	 */
	public String getXtnPhnNo() {
		return this.xtnPhnNo;
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
	 * @return mphnNo
	 */
	public String getMphnNo() {
		return this.mphnNo;
	}
	
	/**
	 * Column Info
	 * @return usrAuthTpCd
	 */
	public String getUsrAuthTpCd() {
		return this.usrAuthTpCd;
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
	 * @return usrLoclNm
	 */
	public String getUsrLoclNm() {
		return this.usrLoclNm;
	}
	
	/**
	 * Column Info
	 * @return lstLginOfcCd
	 */
	public String getLstLginOfcCd() {
		return this.lstLginOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cntNoFmtCd
	 */
	public String getCntNoFmtCd() {
		return this.cntNoFmtCd;
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
	 * @return usrNm
	 */
	public String getUsrNm() {
		return this.usrNm;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return usrEml
	 */
	public String getUsrEml() {
		return this.usrEml;
	}
	
	/**
	 * Column Info
	 * @return jbEngNm
	 */
	public String getJbEngNm() {
		return this.jbEngNm;
	}
	
	/**
	 * Column Info
	 * @return cntDtFmtCd
	 */
	public String getCntDtFmtCd() {
		return this.cntDtFmtCd;
	}
	
	/**
	 * Column Info
	 * @return psnEngNm
	 */
	public String getPsnEngNm() {
		return this.psnEngNm;
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
	 * @return dfltEml
	 */
	public String getDfltEml() {
		return this.dfltEml;
	}
	
	/**
	 * Column Info
	 * @return useFlg
	 */
	public String getUseFlg() {
		return this.useFlg;
	}
	
	/**
	 * Column Info
	 * @return usrPwd
	 */
	public String getUsrPwd() {
		return this.usrPwd;
	}
	
	/**
	 * Column Info
	 * @return epId
	 */
	public String getEpId() {
		return this.epId;
	}
	
	/**
	 * Column Info
	 * @return gmtTmznCd
	 */
	public String getGmtTmznCd() {
		return this.gmtTmznCd;
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
	 * @return grdEngNm
	 */
	public String getGrdEngNm() {
		return this.grdEngNm;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	

	/**
	 * Column Info
	 * @param langTpCd
	 */
	public void setLangTpCd(String langTpCd) {
		this.langTpCd = langTpCd;
	}
	
	/**
	 * Column Info
	 * @param xtnPhnNo
	 */
	public void setXtnPhnNo(String xtnPhnNo) {
		this.xtnPhnNo = xtnPhnNo;
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
	 * @param mphnNo
	 */
	public void setMphnNo(String mphnNo) {
		this.mphnNo = mphnNo;
	}
	
	/**
	 * Column Info
	 * @param usrAuthTpCd
	 */
	public void setUsrAuthTpCd(String usrAuthTpCd) {
		this.usrAuthTpCd = usrAuthTpCd;
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
	 * @param usrLoclNm
	 */
	public void setUsrLoclNm(String usrLoclNm) {
		this.usrLoclNm = usrLoclNm;
	}
	
	/**
	 * Column Info
	 * @param lstLginOfcCd
	 */
	public void setLstLginOfcCd(String lstLginOfcCd) {
		this.lstLginOfcCd = lstLginOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cntNoFmtCd
	 */
	public void setCntNoFmtCd(String cntNoFmtCd) {
		this.cntNoFmtCd = cntNoFmtCd;
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
	 * @param usrNm
	 */
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param usrEml
	 */
	public void setUsrEml(String usrEml) {
		this.usrEml = usrEml;
	}
	
	/**
	 * Column Info
	 * @param jbEngNm
	 */
	public void setJbEngNm(String jbEngNm) {
		this.jbEngNm = jbEngNm;
	}
	
	/**
	 * Column Info
	 * @param cntDtFmtCd
	 */
	public void setCntDtFmtCd(String cntDtFmtCd) {
		this.cntDtFmtCd = cntDtFmtCd;
	}
	
	/**
	 * Column Info
	 * @param psnEngNm
	 */
	public void setPsnEngNm(String psnEngNm) {
		this.psnEngNm = psnEngNm;
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
	 * @param dfltEml
	 */
	public void setDfltEml(String dfltEml) {
		this.dfltEml = dfltEml;
	}
	
	/**
	 * Column Info
	 * @param useFlg
	 */
	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
	}
	
	/**
	 * Column Info
	 * @param usrPwd
	 */
	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}
	
	/**
	 * Column Info
	 * @param epId
	 */
	public void setEpId(String epId) {
		this.epId = epId;
	}
	
	/**
	 * Column Info
	 * @param gmtTmznCd
	 */
	public void setGmtTmznCd(String gmtTmznCd) {
		this.gmtTmznCd = gmtTmznCd;
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
	 * @param grdEngNm
	 */
	public void setGrdEngNm(String grdEngNm) {
		this.grdEngNm = grdEngNm;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
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
		setLangTpCd(JSPUtil.getParameter(request, prefix + "lang_tp_cd", ""));
		setXtnPhnNo(JSPUtil.getParameter(request, prefix + "xtn_phn_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setMphnNo(JSPUtil.getParameter(request, prefix + "mphn_no", ""));
		setUsrAuthTpCd(JSPUtil.getParameter(request, prefix + "usr_auth_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setUsrLoclNm(JSPUtil.getParameter(request, prefix + "usr_locl_nm", ""));
		setLstLginOfcCd(JSPUtil.getParameter(request, prefix + "lst_lgin_ofc_cd", ""));
		setCntNoFmtCd(JSPUtil.getParameter(request, prefix + "cnt_no_fmt_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
		setUsrId(JSPUtil.getParameter(request, prefix + "usr_id", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setUsrEml(JSPUtil.getParameter(request, prefix + "usr_eml", ""));
		setJbEngNm(JSPUtil.getParameter(request, prefix + "jb_eng_nm", ""));
		setCntDtFmtCd(JSPUtil.getParameter(request, prefix + "cnt_dt_fmt_cd", ""));
		setPsnEngNm(JSPUtil.getParameter(request, prefix + "psn_eng_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDfltEml(JSPUtil.getParameter(request, prefix + "dflt_eml", ""));
		setUseFlg(JSPUtil.getParameter(request, prefix + "use_flg", ""));
		setUsrPwd(JSPUtil.getParameter(request, prefix + "usr_pwd", ""));
		setEpId(JSPUtil.getParameter(request, prefix + "ep_id", ""));
		setGmtTmznCd(JSPUtil.getParameter(request, prefix + "gmt_tmzn_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setGrdEngNm(JSPUtil.getParameter(request, prefix + "grd_eng_nm", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComUserVO[]
	 */
	public ComUserVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComUserVO[]
	 */
	public ComUserVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUserVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] langTpCd = (JSPUtil.getParameter(request, prefix	+ "lang_tp_cd", length));
			String[] xtnPhnNo = (JSPUtil.getParameter(request, prefix	+ "xtn_phn_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mphnNo = (JSPUtil.getParameter(request, prefix	+ "mphn_no", length));
			String[] usrAuthTpCd = (JSPUtil.getParameter(request, prefix	+ "usr_auth_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] usrLoclNm = (JSPUtil.getParameter(request, prefix	+ "usr_locl_nm", length));
			String[] lstLginOfcCd = (JSPUtil.getParameter(request, prefix	+ "lst_lgin_ofc_cd", length));
			String[] cntNoFmtCd = (JSPUtil.getParameter(request, prefix	+ "cnt_no_fmt_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] usrEml = (JSPUtil.getParameter(request, prefix	+ "usr_eml", length));
			String[] jbEngNm = (JSPUtil.getParameter(request, prefix	+ "jb_eng_nm", length));
			String[] cntDtFmtCd = (JSPUtil.getParameter(request, prefix	+ "cnt_dt_fmt_cd", length));
			String[] psnEngNm = (JSPUtil.getParameter(request, prefix	+ "psn_eng_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dfltEml = (JSPUtil.getParameter(request, prefix	+ "dflt_eml", length));
			String[] useFlg = (JSPUtil.getParameter(request, prefix	+ "use_flg", length));
			String[] usrPwd = (JSPUtil.getParameter(request, prefix	+ "usr_pwd", length));
			String[] epId = (JSPUtil.getParameter(request, prefix	+ "ep_id", length));
			String[] gmtTmznCd = (JSPUtil.getParameter(request, prefix	+ "gmt_tmzn_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] grdEngNm = (JSPUtil.getParameter(request, prefix	+ "grd_eng_nm", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUserVO();
				if (langTpCd[i] != null)
					model.setLangTpCd(langTpCd[i]);
				if (xtnPhnNo[i] != null)
					model.setXtnPhnNo(xtnPhnNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mphnNo[i] != null)
					model.setMphnNo(mphnNo[i]);
				if (usrAuthTpCd[i] != null)
					model.setUsrAuthTpCd(usrAuthTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (usrLoclNm[i] != null)
					model.setUsrLoclNm(usrLoclNm[i]);
				if (lstLginOfcCd[i] != null)
					model.setLstLginOfcCd(lstLginOfcCd[i]);
				if (cntNoFmtCd[i] != null)
					model.setCntNoFmtCd(cntNoFmtCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (usrEml[i] != null)
					model.setUsrEml(usrEml[i]);
				if (jbEngNm[i] != null)
					model.setJbEngNm(jbEngNm[i]);
				if (cntDtFmtCd[i] != null)
					model.setCntDtFmtCd(cntDtFmtCd[i]);
				if (psnEngNm[i] != null)
					model.setPsnEngNm(psnEngNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dfltEml[i] != null)
					model.setDfltEml(dfltEml[i]);
				if (useFlg[i] != null)
					model.setUseFlg(useFlg[i]);
				if (usrPwd[i] != null)
					model.setUsrPwd(usrPwd[i]);
				if (epId[i] != null)
					model.setEpId(epId[i]);
				if (gmtTmznCd[i] != null)
					model.setGmtTmznCd(gmtTmznCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (grdEngNm[i] != null)
					model.setGrdEngNm(grdEngNm[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComUserVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComUserVO[]
	 */
	public ComUserVO[] getComUserVOs(){
		ComUserVO[] vos = (ComUserVO[])models.toArray(new ComUserVO[models.size()]);
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
		this.langTpCd = this.langTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtnPhnNo = this.xtnPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mphnNo = this.mphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrAuthTpCd = this.usrAuthTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrLoclNm = this.usrLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstLginOfcCd = this.lstLginOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntNoFmtCd = this.cntNoFmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrEml = this.usrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbEngNm = this.jbEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntDtFmtCd = this.cntDtFmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psnEngNm = this.psnEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltEml = this.dfltEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.useFlg = this.useFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrPwd = this.usrPwd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.epId = this.epId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmtTmznCd = this.gmtTmznCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grdEngNm = this.grdEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
