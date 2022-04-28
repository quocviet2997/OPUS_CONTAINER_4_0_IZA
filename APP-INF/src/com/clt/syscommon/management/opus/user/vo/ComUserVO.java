/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ComUserVO.java
*@FileTitle : ComUserVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.05
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.03.05 김경범 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.user.vo;

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
 * @author 김경범
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComUserVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUserVO> models = new ArrayList<ComUserVO>();
	
	/* Column Info */
	private String cngOfcCd = null;
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
	/* Column Info */
	private String srepCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String usrLoclNm = null;
	/* Column Info */
	private String cntNoFmtCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pgmAssign = null;
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
	private String psnEngNm = null;
	/* Column Info */
	private String cntDtFmtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String superRoleAssign = null;
	/* Column Info */
	private String dfltEml = null;
	/* Column Info */
	private String useFlg = null;
	/* Column Info */
	private String usrPwd = null;
	/* Column Info */
	private String gmtTmznCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String roleAssign = null;
	/* Column Info */
	private String grdEngNm = null;
	/* Column Info */
	private String faxNo = null;

	/* Column Info */
	private String usrNewPwd = null;
	
	/* Column Info */
	private String usrOldPwd = null;

	/* Column Info */
	private String usrPwdCreDt = null;
	
	/* Column Info */
	private String usrPwdChgFlg = null;
	
	/* Column Info */
	private String usrLckDt = null;
	
	/* Column Info */
	private String usrLginFaldKnt = null;
	
	/* Column Info */
	private String hisCount = null;
	/* Column Info */
	private String lckChk = null;
	/* Column Info */
	private String ifMnplCd = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUserVO() {}

	public ComUserVO(String ibflag, String pagerows, String usrId, String usrPwd, String usrNm, String usrLoclNm, String ofcCd, String cngOfcCd, String usrAuthTpCd, String useFlg, String mphnNo, String roleAssign, String superRoleAssign, String pgmAssign, String xtnPhnNo, String usrEml, String jbEngNm, String psnEngNm, String grdEngNm, String cntCd, String langTpCd, String gmtTmznCd, String cntDtFmtCd, String cntNoFmtCd, String faxNo, String dfltEml, String srepCd, String creUsrId, String creDt, String updUsrId, String updDt, String ifMnplCd) {
		this.cngOfcCd = cngOfcCd;
		this.langTpCd = langTpCd;
		this.xtnPhnNo = xtnPhnNo;
		this.creDt = creDt;
		this.mphnNo = mphnNo;
		this.usrAuthTpCd = usrAuthTpCd;
		this.srepCd = srepCd;
		this.pagerows = pagerows;
		this.usrLoclNm = usrLoclNm;
		this.cntNoFmtCd = cntNoFmtCd;
		this.ibflag = ibflag;
		this.pgmAssign = pgmAssign;
		this.usrNm = usrNm;
		this.usrId = usrId;
		this.cntCd = cntCd;
		this.usrEml = usrEml;
		this.jbEngNm = jbEngNm;
		this.psnEngNm = psnEngNm;
		this.cntDtFmtCd = cntDtFmtCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.superRoleAssign = superRoleAssign;
		this.dfltEml = dfltEml;
		this.useFlg = useFlg;
		this.usrPwd = usrPwd;
		this.gmtTmznCd = gmtTmznCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.roleAssign = roleAssign;
		this.grdEngNm = grdEngNm;
		this.faxNo = faxNo;
		this.ifMnplCd = ifMnplCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cng_ofc_cd", getCngOfcCd());
		this.hashColumns.put("lang_tp_cd", getLangTpCd());
		this.hashColumns.put("xtn_phn_no", getXtnPhnNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mphn_no", getMphnNo());
		this.hashColumns.put("usr_auth_tp_cd", getUsrAuthTpCd());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("usr_locl_nm", getUsrLoclNm());
		this.hashColumns.put("cnt_no_fmt_cd", getCntNoFmtCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pgm_assign", getPgmAssign());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("usr_eml", getUsrEml());
		this.hashColumns.put("jb_eng_nm", getJbEngNm());
		this.hashColumns.put("psn_eng_nm", getPsnEngNm());
		this.hashColumns.put("cnt_dt_fmt_cd", getCntDtFmtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("super_role_assign", getSuperRoleAssign());
		this.hashColumns.put("dflt_eml", getDfltEml());
		this.hashColumns.put("use_flg", getUseFlg());
		this.hashColumns.put("usr_pwd", getUsrPwd());
		this.hashColumns.put("gmt_tmzn_cd", getGmtTmznCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("role_assign", getRoleAssign());
		this.hashColumns.put("grd_eng_nm", getGrdEngNm());
		this.hashColumns.put("fax_no", getFaxNo());
		
		this.hashColumns.put("usr_old_pwd", 		getUsrOldPwd() );
		this.hashColumns.put("usr_pwd_cre_dt", 		getUsrPwdCreDt());
		this.hashColumns.put("usr_pwd_chg_flg", 		getUsrPwdChgFlg());
		this.hashColumns.put("usr_lck_dt", 		getUsrLckDt() );
		this.hashColumns.put("usr_lgin_fald_knt", 	getUsrLginFaldKnt() );
		this.hashColumns.put("his_count", 			getHisCount() );
		this.hashColumns.put("lck_chk", 			getLckChk() );
		this.hashColumns.put("if_mnpl_cd", 			getIfMnplCd() );
		return this.hashColumns;
	}
	
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cng_ofc_cd", "cngOfcCd");
		this.hashFields.put("lang_tp_cd", "langTpCd");
		this.hashFields.put("xtn_phn_no", "xtnPhnNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mphn_no", "mphnNo");
		this.hashFields.put("usr_auth_tp_cd", "usrAuthTpCd");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("usr_locl_nm", "usrLoclNm");
		this.hashFields.put("cnt_no_fmt_cd", "cntNoFmtCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pgm_assign", "pgmAssign");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("usr_eml", "usrEml");
		this.hashFields.put("jb_eng_nm", "jbEngNm");
		this.hashFields.put("psn_eng_nm", "psnEngNm");
		this.hashFields.put("cnt_dt_fmt_cd", "cntDtFmtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("super_role_assign", "superRoleAssign");
		this.hashFields.put("dflt_eml", "dfltEml");
		this.hashFields.put("use_flg", "useFlg");
		this.hashFields.put("usr_pwd", "usrPwd");
		this.hashFields.put("gmt_tmzn_cd", "gmtTmznCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("role_assign", "roleAssign");
		this.hashFields.put("grd_eng_nm", "grdEngNm");
		this.hashFields.put("fax_no", "faxNo");
		
		this.hashFields.put("usr_old_pwd", 		    "usrOldPwd");
		this.hashFields.put("usr_pwd_cre_dt", 		"usrPwdCreDt");
		this.hashFields.put("usr_pwd_chg_flg", 		"usrPwdChgFlg");
		this.hashFields.put("usr_lck_dt", 			"usrLckDt");
		this.hashFields.put("usr_lgin_fald_knt", 	"usrLginFaldKnt");
		this.hashFields.put("his_count", 			"hisCount");
		this.hashFields.put("lck_chk", 			"lckChk");
		this.hashFields.put("if_mnpl_cd", 			"ifMnplCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cngOfcCd
	 */
	public String getCngOfcCd() {
		return this.cngOfcCd;
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
	 * Column Info
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
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
	 * @return pgmAssign
	 */
	public String getPgmAssign() {
		return this.pgmAssign;
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
	 * @return psnEngNm
	 */
	public String getPsnEngNm() {
		return this.psnEngNm;
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
	 * @return superRoleAssign
	 */
	public String getSuperRoleAssign() {
		return this.superRoleAssign;
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
	 * @return roleAssign
	 */
	public String getRoleAssign() {
		return this.roleAssign;
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
	 * @param cngOfcCd
	 */
	public void setCngOfcCd(String cngOfcCd) {
		this.cngOfcCd = cngOfcCd;
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
	 * Column Info
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
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
	 * @param pgmAssign
	 */
	public void setPgmAssign(String pgmAssign) {
		this.pgmAssign = pgmAssign;
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
	 * @param psnEngNm
	 */
	public void setPsnEngNm(String psnEngNm) {
		this.psnEngNm = psnEngNm;
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
	 * @param superRoleAssign
	 */
	public void setSuperRoleAssign(String superRoleAssign) {
		this.superRoleAssign = superRoleAssign;
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
	 * @param roleAssign
	 */
	public void setRoleAssign(String roleAssign) {
		this.roleAssign = roleAssign;
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
	 * Column Info
	 * @param usrNewPwd
	 */
	public String getUsrNewPwd() {
		return usrNewPwd;
	}

	/**
	 * Column Info
	 * @param usrNewPwd
	 */
	public void setUsrNewPwd(String usrNewPwd) {
		this.usrNewPwd = usrNewPwd;
	}
	
	
	/**
	 * Column Info
	 * @param usrOldPwd
	 */
	public String getUsrOldPwd() {
		return usrOldPwd;
	}

	/**
	 * Column Info
	 * @param usrOldPwd
	 */
	public void setUsrOldPwd(String usrOldPwd) {
		this.usrOldPwd = usrOldPwd;
	}
	
	/**
	 * Column Info
	 * @param usrLckDt
	 */
	public String getUsrLckDt() {
		return usrLckDt;
	}

	/**
	 * Column Info
	 * @param usrLckDt
	 */
	public void setUsrLckDt(String usrLckDt) {
		this.usrLckDt = usrLckDt;
	}
	
	/**
	 * Column Info
	 * @param usrPwdCreDt
	 */
	public String getUsrPwdCreDt() {
		return usrPwdCreDt;
	}

	/**
	 * Column Info
	 * @param usrPwdCreDt
	 */
	public void setUsrPwdCreDt(String usrPwdCreDt) {
		this.usrPwdCreDt = usrPwdCreDt;
	}
	
	/**
	 * Column Info
	 * @param usrPwdChgFlg
	 */
	public String getUsrPwdChgFlg() {
		return usrPwdChgFlg;
	}
	
	/**
	 * Column Info
	 * @param usrPwdChgFlg
	 */
	public void setUsrPwdChgFlg(String usrPwdChgFlg) {
		this.usrPwdChgFlg = usrPwdChgFlg;
	}

	/**
	 * Column Info
	 * @param usrLginFaldKnt
	 */
	public String getUsrLginFaldKnt() {
		return usrLginFaldKnt;
	}

	
	/**
	 * Column Info
	 * @param /**
	 * Column Info
	 * @param usrOldPwd
	 */
	public void setUsrLginFaldKnt(String usrLginFaldKnt) {
		this.usrLginFaldKnt = usrLginFaldKnt;
	}


	/**
	 * Column Info
	 * @param /**
	 * Column Info
	 * @param hisCount
	 */
	public String getHisCount() {
		return hisCount;
	}
	
	/**
	 * Column Info
	 * @param /**
	 * Column Info
	 * @param hisCount
	 */
	public void setHisCount(String hisCount) {
		this.hisCount = hisCount;
	}
	
	public String getIfMnplCd() {
		return ifMnplCd;
	}

	public void setIfMnplCd(String ifMnplCd) {
		this.ifMnplCd = ifMnplCd;
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
		setCngOfcCd(JSPUtil.getParameter(request, prefix + "cng_ofc_cd", ""));
		setLangTpCd(JSPUtil.getParameter(request, prefix + "lang_tp_cd", ""));
		setXtnPhnNo(JSPUtil.getParameter(request, prefix + "xtn_phn_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setMphnNo(JSPUtil.getParameter(request, prefix + "mphn_no", ""));
		setUsrAuthTpCd(JSPUtil.getParameter(request, prefix + "usr_auth_tp_cd", ""));
		setSrepCd(JSPUtil.getParameter(request, prefix + "srep_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setUsrLoclNm(JSPUtil.getParameter(request, prefix + "usr_locl_nm", ""));
		setCntNoFmtCd(JSPUtil.getParameter(request, prefix + "cnt_no_fmt_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPgmAssign(JSPUtil.getParameter(request, prefix + "pgm_assign", ""));
		setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
		setUsrId(JSPUtil.getParameter(request, prefix + "usr_id", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setUsrEml(JSPUtil.getParameter(request, prefix + "usr_eml", ""));
		setJbEngNm(JSPUtil.getParameter(request, prefix + "jb_eng_nm", ""));
		setPsnEngNm(JSPUtil.getParameter(request, prefix + "psn_eng_nm", ""));
		setCntDtFmtCd(JSPUtil.getParameter(request, prefix + "cnt_dt_fmt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setSuperRoleAssign(JSPUtil.getParameter(request, prefix + "super_role_assign", ""));
		setDfltEml(JSPUtil.getParameter(request, prefix + "dflt_eml", ""));
		setUseFlg(JSPUtil.getParameter(request, prefix + "use_flg", ""));
		setUsrPwd(JSPUtil.getParameter(request, prefix + "usr_pwd", ""));
		setGmtTmznCd(JSPUtil.getParameter(request, prefix + "gmt_tmzn_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setRoleAssign(JSPUtil.getParameter(request, prefix + "role_assign", ""));
		setGrdEngNm(JSPUtil.getParameter(request, prefix + "grd_eng_nm", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		
			
		setUsrOldPwd(JSPUtil.getParameter(request, 			prefix + "usr_old_pwd", ""));
		setUsrPwdCreDt(JSPUtil.getParameter(request, 		prefix + "usr_pwd_cre_dt", ""));
		setUsrPwdChgFlg(JSPUtil.getParameter(request, 		prefix + "usr_pwd_chg_flg", ""));
		setUsrLckDt(JSPUtil.getParameter(request, 			prefix + "usr_lck_dt", ""));
		setUsrLginFaldKnt(JSPUtil.getParameter(request, 	prefix + "usr_lgin_fald_knt", ""));
		setLckChk(JSPUtil.getParameter(request, 	prefix + "lck_chk", ""));
		setIfMnplCd(JSPUtil.getParameter(request, 	prefix + "if_mnpl_cd", ""));
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
			String[] cngOfcCd = (JSPUtil.getParameter(request, prefix	+ "cng_ofc_cd", length));
			String[] langTpCd = (JSPUtil.getParameter(request, prefix	+ "lang_tp_cd", length));
			String[] xtnPhnNo = (JSPUtil.getParameter(request, prefix	+ "xtn_phn_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mphnNo = (JSPUtil.getParameter(request, prefix	+ "mphn_no", length));
			String[] usrAuthTpCd = (JSPUtil.getParameter(request, prefix	+ "usr_auth_tp_cd", length));
			String[] srepCd = (JSPUtil.getParameter(request, prefix	+ "srep_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] usrLoclNm = (JSPUtil.getParameter(request, prefix	+ "usr_locl_nm", length));
			String[] cntNoFmtCd = (JSPUtil.getParameter(request, prefix	+ "cnt_no_fmt_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pgmAssign = (JSPUtil.getParameter(request, prefix	+ "pgm_assign", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] usrEml = (JSPUtil.getParameter(request, prefix	+ "usr_eml", length));
			String[] jbEngNm = (JSPUtil.getParameter(request, prefix	+ "jb_eng_nm", length));
			String[] psnEngNm = (JSPUtil.getParameter(request, prefix	+ "psn_eng_nm", length));
			String[] cntDtFmtCd = (JSPUtil.getParameter(request, prefix	+ "cnt_dt_fmt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] superRoleAssign = (JSPUtil.getParameter(request, prefix	+ "super_role_assign", length));
			String[] dfltEml = (JSPUtil.getParameter(request, prefix	+ "dflt_eml", length));
			String[] useFlg = (JSPUtil.getParameter(request, prefix	+ "use_flg", length));
			String[] usrPwd = (JSPUtil.getParameter(request, prefix	+ "usr_pwd", length));
			String[] gmtTmznCd = (JSPUtil.getParameter(request, prefix	+ "gmt_tmzn_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] roleAssign = (JSPUtil.getParameter(request, prefix	+ "role_assign", length));
			String[] grdEngNm = (JSPUtil.getParameter(request, prefix	+ "grd_eng_nm", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			
			String[] usrOldPwd  	= (JSPUtil.getParameter(request, prefix	+ "usr_old_pwd", length));
			String[] usrPwdCreDt 	= (JSPUtil.getParameter(request, prefix	+ "usr_pwd_cre_dt", length));
			String[] usrPwdChgFlg 	= (JSPUtil.getParameter(request, prefix	+ "usr_pwd_chg_flg", length));
			String[] usrLckDt 		= (JSPUtil.getParameter(request, prefix	+ "usr_lck_dt", length));
			String[] usrLginFaldKnt = (JSPUtil.getParameter(request, prefix	+ "usr_lgin_fald_knt", length));
			String[] lckChk = (JSPUtil.getParameter(request, prefix	+ "lck_chk", length));
			String[] ifMnplCd = (JSPUtil.getParameter(request, prefix	+ "if_mnpl_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUserVO();
				if (cngOfcCd[i] != null)
					model.setCngOfcCd(cngOfcCd[i]);
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
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (usrLoclNm[i] != null)
					model.setUsrLoclNm(usrLoclNm[i]);
				if (cntNoFmtCd[i] != null)
					model.setCntNoFmtCd(cntNoFmtCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pgmAssign[i] != null)
					model.setPgmAssign(pgmAssign[i]);
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
				if (psnEngNm[i] != null)
					model.setPsnEngNm(psnEngNm[i]);
				if (cntDtFmtCd[i] != null)
					model.setCntDtFmtCd(cntDtFmtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (superRoleAssign[i] != null)
					model.setSuperRoleAssign(superRoleAssign[i]);
				if (dfltEml[i] != null)
					model.setDfltEml(dfltEml[i]);
				if (useFlg[i] != null)
					model.setUseFlg(useFlg[i]);
				if (usrPwd[i] != null)
					model.setUsrPwd(usrPwd[i]);
				if (gmtTmznCd[i] != null)
					model.setGmtTmznCd(gmtTmznCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (roleAssign[i] != null)
					model.setRoleAssign(roleAssign[i]);
				if (grdEngNm[i] != null)
					model.setGrdEngNm(grdEngNm[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				
				if (usrOldPwd[i] != null)
					model.setUsrOldPwd(usrOldPwd[i]);				
				if (usrPwdCreDt[i] != null)
					model.setUsrPwdCreDt(usrPwdCreDt[i]);
				if (usrPwdChgFlg[i] != null)
					model.setUsrPwdChgFlg(usrPwdChgFlg[i]);
				if (usrLckDt[i] != null)
					model.setUsrLckDt(usrLckDt[i]);				
				if (usrLginFaldKnt[i] != null)
					model.setUsrLginFaldKnt(usrLginFaldKnt[i]);
				if (lckChk[i] != null)
					model.setLckChk(lckChk[i]);
				if (ifMnplCd[i] != null)
					model.setIfMnplCd(ifMnplCd[i]);
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
		this.cngOfcCd = this.cngOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.langTpCd = this.langTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtnPhnNo = this.xtnPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mphnNo = this.mphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrAuthTpCd = this.usrAuthTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrLoclNm = this.usrLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntNoFmtCd = this.cntNoFmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmAssign = this.pgmAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrEml = this.usrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbEngNm = this.jbEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psnEngNm = this.psnEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntDtFmtCd = this.cntDtFmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.superRoleAssign = this.superRoleAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltEml = this.dfltEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.useFlg = this.useFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrPwd = this.usrPwd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmtTmznCd = this.gmtTmznCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.roleAssign = this.roleAssign .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grdEngNm = this.grdEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.usrOldPwd = this.usrOldPwd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrLckDt = this.usrLckDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lckChk = this.lckChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifMnplCd = this.ifMnplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}

	/**
	 * 
	 * getLckChk
	 * @author Jeong-Hoon, KIM
	 * @return String
	 */
	public String getLckChk() {
		return lckChk;
	}

	/**
	 * 
	 * setLckChk
	 * @author Jeong-Hoon, KIM
	 * @param lckChk void
	 */
	public void setLckChk(String lckChk) {
		this.lckChk = lckChk;
	}
	
	

}
