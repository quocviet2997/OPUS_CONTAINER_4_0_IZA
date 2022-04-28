/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmChargeVO.java
*@FileTitle : MdmChargeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 정휘택
*@LastVersion : 1.0
* 2009.05.25 정휘택 
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
 * @author 정휘택
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmChargeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmChargeVO> models = new ArrayList<MdmChargeVO>();
	
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String repChgCd = null;
	/* Column Info */
	private String chgNm = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String useCoTpCd = null;
	/* Column Info */
	private String chgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tklTmlFlg = null;
	/* Column Info */
	private String cyRdTermFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cfsRdTermFlg = null;
	/* Column Info */
	private String chgRevTpCd = null;
	/* Column Info */
	private String dorRdTermFlg = null;
	/* Column Info */
	private String chgAplyTpCd = null;
	/* Column Info */
	private String autoRatFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String frtChgTpCd = null;
	/* Column Info */
	private String senChgAcctCd = null;
	/* Column Info */
	private String aplySvcModFlg = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String hjsChgAcctCd = null;
	/* Column Info */
	private String chgAplyAreaCd = null;
	/* Column Info */
	private String senGrpChgCd = null;
	/* Column Info */
	private String chgEdiCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String chgStsCd = null;
	/* Column Info */
	private String naRdTermFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmChargeVO() {}

	public MdmChargeVO(String ibflag, String pagerows, String chgCd, String chgNm, String frtChgTpCd, String senChgAcctCd, String hjsChgAcctCd, String repChgCd, String chgRevTpCd, String chgAplyTpCd, String chgAplyAreaCd, String cyRdTermFlg, String cfsRdTermFlg, String dorRdTermFlg, String naRdTermFlg, String tklTmlFlg, String aplySvcModFlg, String useCoTpCd, String autoRatFlg, String senGrpChgCd, String chgEdiCd, String dpSeq, String chgStsCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt) {
		this.dpSeq = dpSeq;
		this.repChgCd = repChgCd;
		this.chgNm = chgNm;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.useCoTpCd = useCoTpCd;
		this.chgCd = chgCd;
		this.pagerows = pagerows;
		this.tklTmlFlg = tklTmlFlg;
		this.cyRdTermFlg = cyRdTermFlg;
		this.ibflag = ibflag;
		this.cfsRdTermFlg = cfsRdTermFlg;
		this.chgRevTpCd = chgRevTpCd;
		this.dorRdTermFlg = dorRdTermFlg;
		this.chgAplyTpCd = chgAplyTpCd;
		this.autoRatFlg = autoRatFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.frtChgTpCd = frtChgTpCd;
		this.senChgAcctCd = senChgAcctCd;
		this.aplySvcModFlg = aplySvcModFlg;
		this.eaiEvntDt = eaiEvntDt;
		this.hjsChgAcctCd = hjsChgAcctCd;
		this.chgAplyAreaCd = chgAplyAreaCd;
		this.senGrpChgCd = senGrpChgCd;
		this.chgEdiCd = chgEdiCd;
		this.creUsrId = creUsrId;
		this.chgStsCd = chgStsCd;
		this.naRdTermFlg = naRdTermFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("rep_chg_cd", getRepChgCd());
		this.hashColumns.put("chg_nm", getChgNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("use_co_tp_cd", getUseCoTpCd());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tkl_tml_flg", getTklTmlFlg());
		this.hashColumns.put("cy_rd_term_flg", getCyRdTermFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cfs_rd_term_flg", getCfsRdTermFlg());
		this.hashColumns.put("chg_rev_tp_cd", getChgRevTpCd());
		this.hashColumns.put("dor_rd_term_flg", getDorRdTermFlg());
		this.hashColumns.put("chg_aply_tp_cd", getChgAplyTpCd());
		this.hashColumns.put("auto_rat_flg", getAutoRatFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("frt_chg_tp_cd", getFrtChgTpCd());
		this.hashColumns.put("sen_chg_acct_cd", getSenChgAcctCd());
		this.hashColumns.put("aply_svc_mod_flg", getAplySvcModFlg());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("hjs_chg_acct_cd", getHjsChgAcctCd());
		this.hashColumns.put("chg_aply_area_cd", getChgAplyAreaCd());
		this.hashColumns.put("sen_grp_chg_cd", getSenGrpChgCd());
		this.hashColumns.put("chg_edi_cd", getChgEdiCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("chg_sts_cd", getChgStsCd());
		this.hashColumns.put("na_rd_term_flg", getNaRdTermFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("rep_chg_cd", "repChgCd");
		this.hashFields.put("chg_nm", "chgNm");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("use_co_tp_cd", "useCoTpCd");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tkl_tml_flg", "tklTmlFlg");
		this.hashFields.put("cy_rd_term_flg", "cyRdTermFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cfs_rd_term_flg", "cfsRdTermFlg");
		this.hashFields.put("chg_rev_tp_cd", "chgRevTpCd");
		this.hashFields.put("dor_rd_term_flg", "dorRdTermFlg");
		this.hashFields.put("chg_aply_tp_cd", "chgAplyTpCd");
		this.hashFields.put("auto_rat_flg", "autoRatFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("frt_chg_tp_cd", "frtChgTpCd");
		this.hashFields.put("sen_chg_acct_cd", "senChgAcctCd");
		this.hashFields.put("aply_svc_mod_flg", "aplySvcModFlg");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("hjs_chg_acct_cd", "hjsChgAcctCd");
		this.hashFields.put("chg_aply_area_cd", "chgAplyAreaCd");
		this.hashFields.put("sen_grp_chg_cd", "senGrpChgCd");
		this.hashFields.put("chg_edi_cd", "chgEdiCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("chg_sts_cd", "chgStsCd");
		this.hashFields.put("na_rd_term_flg", "naRdTermFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
	}
	
	/**
	 * Column Info
	 * @return repChgCd
	 */
	public String getRepChgCd() {
		return this.repChgCd;
	}
	
	/**
	 * Column Info
	 * @return chgNm
	 */
	public String getChgNm() {
		return this.chgNm;
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
	 * @return useCoTpCd
	 */
	public String getUseCoTpCd() {
		return this.useCoTpCd;
	}
	
	/**
	 * Column Info
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
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
	 * @return tklTmlFlg
	 */
	public String getTklTmlFlg() {
		return this.tklTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return cyRdTermFlg
	 */
	public String getCyRdTermFlg() {
		return this.cyRdTermFlg;
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
	 * @return cfsRdTermFlg
	 */
	public String getCfsRdTermFlg() {
		return this.cfsRdTermFlg;
	}
	
	/**
	 * Column Info
	 * @return chgRevTpCd
	 */
	public String getChgRevTpCd() {
		return this.chgRevTpCd;
	}
	
	/**
	 * Column Info
	 * @return dorRdTermFlg
	 */
	public String getDorRdTermFlg() {
		return this.dorRdTermFlg;
	}
	
	/**
	 * Column Info
	 * @return chgAplyTpCd
	 */
	public String getChgAplyTpCd() {
		return this.chgAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @return autoRatFlg
	 */
	public String getAutoRatFlg() {
		return this.autoRatFlg;
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
	 * @return frtChgTpCd
	 */
	public String getFrtChgTpCd() {
		return this.frtChgTpCd;
	}
	
	/**
	 * Column Info
	 * @return senChgAcctCd
	 */
	public String getSenChgAcctCd() {
		return this.senChgAcctCd;
	}
	
	/**
	 * Column Info
	 * @return aplySvcModFlg
	 */
	public String getAplySvcModFlg() {
		return this.aplySvcModFlg;
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
	 * @return hjsChgAcctCd
	 */
	public String getHjsChgAcctCd() {
		return this.hjsChgAcctCd;
	}
	
	/**
	 * Column Info
	 * @return chgAplyAreaCd
	 */
	public String getChgAplyAreaCd() {
		return this.chgAplyAreaCd;
	}
	
	/**
	 * Column Info
	 * @return senGrpChgCd
	 */
	public String getSenGrpChgCd() {
		return this.senGrpChgCd;
	}
	
	/**
	 * Column Info
	 * @return chgEdiCd
	 */
	public String getChgEdiCd() {
		return this.chgEdiCd;
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
	 * @return chgStsCd
	 */
	public String getChgStsCd() {
		return this.chgStsCd;
	}
	
	/**
	 * Column Info
	 * @return naRdTermFlg
	 */
	public String getNaRdTermFlg() {
		return this.naRdTermFlg;
	}
	

	/**
	 * Column Info
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
	}
	
	/**
	 * Column Info
	 * @param repChgCd
	 */
	public void setRepChgCd(String repChgCd) {
		this.repChgCd = repChgCd;
	}
	
	/**
	 * Column Info
	 * @param chgNm
	 */
	public void setChgNm(String chgNm) {
		this.chgNm = chgNm;
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
	 * @param useCoTpCd
	 */
	public void setUseCoTpCd(String useCoTpCd) {
		this.useCoTpCd = useCoTpCd;
	}
	
	/**
	 * Column Info
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
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
	 * @param tklTmlFlg
	 */
	public void setTklTmlFlg(String tklTmlFlg) {
		this.tklTmlFlg = tklTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param cyRdTermFlg
	 */
	public void setCyRdTermFlg(String cyRdTermFlg) {
		this.cyRdTermFlg = cyRdTermFlg;
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
	 * @param cfsRdTermFlg
	 */
	public void setCfsRdTermFlg(String cfsRdTermFlg) {
		this.cfsRdTermFlg = cfsRdTermFlg;
	}
	
	/**
	 * Column Info
	 * @param chgRevTpCd
	 */
	public void setChgRevTpCd(String chgRevTpCd) {
		this.chgRevTpCd = chgRevTpCd;
	}
	
	/**
	 * Column Info
	 * @param dorRdTermFlg
	 */
	public void setDorRdTermFlg(String dorRdTermFlg) {
		this.dorRdTermFlg = dorRdTermFlg;
	}
	
	/**
	 * Column Info
	 * @param chgAplyTpCd
	 */
	public void setChgAplyTpCd(String chgAplyTpCd) {
		this.chgAplyTpCd = chgAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @param autoRatFlg
	 */
	public void setAutoRatFlg(String autoRatFlg) {
		this.autoRatFlg = autoRatFlg;
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
	 * @param frtChgTpCd
	 */
	public void setFrtChgTpCd(String frtChgTpCd) {
		this.frtChgTpCd = frtChgTpCd;
	}
	
	/**
	 * Column Info
	 * @param senChgAcctCd
	 */
	public void setSenChgAcctCd(String senChgAcctCd) {
		this.senChgAcctCd = senChgAcctCd;
	}
	
	/**
	 * Column Info
	 * @param aplySvcModFlg
	 */
	public void setAplySvcModFlg(String aplySvcModFlg) {
		this.aplySvcModFlg = aplySvcModFlg;
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
	 * @param hjsChgAcctCd
	 */
	public void setHjsChgAcctCd(String hjsChgAcctCd) {
		this.hjsChgAcctCd = hjsChgAcctCd;
	}
	
	/**
	 * Column Info
	 * @param chgAplyAreaCd
	 */
	public void setChgAplyAreaCd(String chgAplyAreaCd) {
		this.chgAplyAreaCd = chgAplyAreaCd;
	}
	
	/**
	 * Column Info
	 * @param senGrpChgCd
	 */
	public void setSenGrpChgCd(String senGrpChgCd) {
		this.senGrpChgCd = senGrpChgCd;
	}
	
	/**
	 * Column Info
	 * @param chgEdiCd
	 */
	public void setChgEdiCd(String chgEdiCd) {
		this.chgEdiCd = chgEdiCd;
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
	 * @param chgStsCd
	 */
	public void setChgStsCd(String chgStsCd) {
		this.chgStsCd = chgStsCd;
	}
	
	/**
	 * Column Info
	 * @param naRdTermFlg
	 */
	public void setNaRdTermFlg(String naRdTermFlg) {
		this.naRdTermFlg = naRdTermFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setRepChgCd(JSPUtil.getParameter(request, "rep_chg_cd", ""));
		setChgNm(JSPUtil.getParameter(request, "chg_nm", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUseCoTpCd(JSPUtil.getParameter(request, "use_co_tp_cd", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTklTmlFlg(JSPUtil.getParameter(request, "tkl_tml_flg", ""));
		setCyRdTermFlg(JSPUtil.getParameter(request, "cy_rd_term_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCfsRdTermFlg(JSPUtil.getParameter(request, "cfs_rd_term_flg", ""));
		setChgRevTpCd(JSPUtil.getParameter(request, "chg_rev_tp_cd", ""));
		setDorRdTermFlg(JSPUtil.getParameter(request, "dor_rd_term_flg", ""));
		setChgAplyTpCd(JSPUtil.getParameter(request, "chg_aply_tp_cd", ""));
		setAutoRatFlg(JSPUtil.getParameter(request, "auto_rat_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFrtChgTpCd(JSPUtil.getParameter(request, "frt_chg_tp_cd", ""));
		setSenChgAcctCd(JSPUtil.getParameter(request, "sen_chg_acct_cd", ""));
		setAplySvcModFlg(JSPUtil.getParameter(request, "aply_svc_mod_flg", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setHjsChgAcctCd(JSPUtil.getParameter(request, "hjs_chg_acct_cd", ""));
		setChgAplyAreaCd(JSPUtil.getParameter(request, "chg_aply_area_cd", ""));
		setSenGrpChgCd(JSPUtil.getParameter(request, "sen_grp_chg_cd", ""));
		setChgEdiCd(JSPUtil.getParameter(request, "chg_edi_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setChgStsCd(JSPUtil.getParameter(request, "chg_sts_cd", ""));
		setNaRdTermFlg(JSPUtil.getParameter(request, "na_rd_term_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmChargeVO[]
	 */
	public MdmChargeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmChargeVO[]
	 */
	public MdmChargeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmChargeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq".trim(), length));
			String[] repChgCd = (JSPUtil.getParameter(request, prefix	+ "rep_chg_cd".trim(), length));
			String[] chgNm = (JSPUtil.getParameter(request, prefix	+ "chg_nm".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] useCoTpCd = (JSPUtil.getParameter(request, prefix	+ "use_co_tp_cd".trim(), length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] tklTmlFlg = (JSPUtil.getParameter(request, prefix	+ "tkl_tml_flg".trim(), length));
			String[] cyRdTermFlg = (JSPUtil.getParameter(request, prefix	+ "cy_rd_term_flg".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cfsRdTermFlg = (JSPUtil.getParameter(request, prefix	+ "cfs_rd_term_flg".trim(), length));
			String[] chgRevTpCd = (JSPUtil.getParameter(request, prefix	+ "chg_rev_tp_cd".trim(), length));
			String[] dorRdTermFlg = (JSPUtil.getParameter(request, prefix	+ "dor_rd_term_flg".trim(), length));
			String[] chgAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "chg_aply_tp_cd".trim(), length));
			String[] autoRatFlg = (JSPUtil.getParameter(request, prefix	+ "auto_rat_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] frtChgTpCd = (JSPUtil.getParameter(request, prefix	+ "frt_chg_tp_cd".trim(), length));
			String[] senChgAcctCd = (JSPUtil.getParameter(request, prefix	+ "sen_chg_acct_cd".trim(), length));
			String[] aplySvcModFlg = (JSPUtil.getParameter(request, prefix	+ "aply_svc_mod_flg".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] hjsChgAcctCd = (JSPUtil.getParameter(request, prefix	+ "hjs_chg_acct_cd".trim(), length));
			String[] chgAplyAreaCd = (JSPUtil.getParameter(request, prefix	+ "chg_aply_area_cd".trim(), length));
			String[] senGrpChgCd = (JSPUtil.getParameter(request, prefix	+ "sen_grp_chg_cd".trim(), length));
			String[] chgEdiCd = (JSPUtil.getParameter(request, prefix	+ "chg_edi_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] chgStsCd = (JSPUtil.getParameter(request, prefix	+ "chg_sts_cd".trim(), length));
			String[] naRdTermFlg = (JSPUtil.getParameter(request, prefix	+ "na_rd_term_flg".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmChargeVO();
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (repChgCd[i] != null)
					model.setRepChgCd(repChgCd[i]);
				if (chgNm[i] != null)
					model.setChgNm(chgNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (useCoTpCd[i] != null)
					model.setUseCoTpCd(useCoTpCd[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tklTmlFlg[i] != null)
					model.setTklTmlFlg(tklTmlFlg[i]);
				if (cyRdTermFlg[i] != null)
					model.setCyRdTermFlg(cyRdTermFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cfsRdTermFlg[i] != null)
					model.setCfsRdTermFlg(cfsRdTermFlg[i]);
				if (chgRevTpCd[i] != null)
					model.setChgRevTpCd(chgRevTpCd[i]);
				if (dorRdTermFlg[i] != null)
					model.setDorRdTermFlg(dorRdTermFlg[i]);
				if (chgAplyTpCd[i] != null)
					model.setChgAplyTpCd(chgAplyTpCd[i]);
				if (autoRatFlg[i] != null)
					model.setAutoRatFlg(autoRatFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (frtChgTpCd[i] != null)
					model.setFrtChgTpCd(frtChgTpCd[i]);
				if (senChgAcctCd[i] != null)
					model.setSenChgAcctCd(senChgAcctCd[i]);
				if (aplySvcModFlg[i] != null)
					model.setAplySvcModFlg(aplySvcModFlg[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (hjsChgAcctCd[i] != null)
					model.setHjsChgAcctCd(hjsChgAcctCd[i]);
				if (chgAplyAreaCd[i] != null)
					model.setChgAplyAreaCd(chgAplyAreaCd[i]);
				if (senGrpChgCd[i] != null)
					model.setSenGrpChgCd(senGrpChgCd[i]);
				if (chgEdiCd[i] != null)
					model.setChgEdiCd(chgEdiCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (chgStsCd[i] != null)
					model.setChgStsCd(chgStsCd[i]);
				if (naRdTermFlg[i] != null)
					model.setNaRdTermFlg(naRdTermFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmChargeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmChargeVO[]
	 */
	public MdmChargeVO[] getMdmChargeVOs(){
		MdmChargeVO[] vos = (MdmChargeVO[])models.toArray(new MdmChargeVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repChgCd = this.repChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgNm = this.chgNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.useCoTpCd = this.useCoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tklTmlFlg = this.tklTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cyRdTermFlg = this.cyRdTermFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfsRdTermFlg = this.cfsRdTermFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgRevTpCd = this.chgRevTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorRdTermFlg = this.dorRdTermFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgAplyTpCd = this.chgAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoRatFlg = this.autoRatFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtChgTpCd = this.frtChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.senChgAcctCd = this.senChgAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplySvcModFlg = this.aplySvcModFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsChgAcctCd = this.hjsChgAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgAplyAreaCd = this.chgAplyAreaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.senGrpChgCd = this.senGrpChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgEdiCd = this.chgEdiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgStsCd = this.chgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.naRdTermFlg = this.naRdTermFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
