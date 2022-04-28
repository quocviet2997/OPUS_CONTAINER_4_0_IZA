/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmVslSvcLaneVO.java
*@FileTitle : MdmVslSvcLaneVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.07
*@LastModifier : 정진우
*@LastVersion : 1.0
* 2009.07.07 정진우 
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
 * @author 정진우
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmVslSvcLaneVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmVslSvcLaneVO> models = new ArrayList<MdmVslSvcLaneVO>();
	
	/* Column Info */
	private String vslSlanSkdTpCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vslTpCd = null;
	/* Column Info */
	private String cnlAgnVndrSeq = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pndlmFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vslSlanNm = null;
	/* Column Info */
	private String spclCgoRqstTgtLaneFlg = null;
	/* Column Info */
	private String actSkdTgtFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslSvcTpCd = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String tmlProdRptFlg = null;
	/* Column Info */
	private String stEffDt = null;
	/* Column Info */
	private String endEffDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fdrDivCd = null;
	/* Column Info */
	private String svcScpBndCd = null;
	/* Column Info */
	private String vskdFletGrpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmVslSvcLaneVO() {}

	public MdmVslSvcLaneVO(String ibflag, String pagerows, String vslSlanCd, String vslSlanNm, String vslSvcTpCd, String vslTpCd, String stEffDt, String endEffDt, String vslSlanSkdTpCd, String ofcCd, String coCd, String fdrDivCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String cnlAgnVndrSeq, String vskdFletGrpCd, String spclCgoRqstTgtLaneFlg, String tmlProdRptFlg, String pndlmFlg, String actSkdTgtFlg, String svcScpBndCd, String eaiIfId) {
		this.vslSlanSkdTpCd = vslSlanSkdTpCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.vslTpCd = vslTpCd;
		this.cnlAgnVndrSeq = cnlAgnVndrSeq;
		this.vslSlanCd = vslSlanCd;
		this.pagerows = pagerows;
		this.pndlmFlg = pndlmFlg;
		this.ibflag = ibflag;
		this.vslSlanNm = vslSlanNm;
		this.spclCgoRqstTgtLaneFlg = spclCgoRqstTgtLaneFlg;
		this.actSkdTgtFlg = actSkdTgtFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.vslSvcTpCd = vslSvcTpCd;
		this.coCd = coCd;
		this.tmlProdRptFlg = tmlProdRptFlg;
		this.stEffDt = stEffDt;
		this.endEffDt = endEffDt;
		this.eaiEvntDt = eaiEvntDt;
		this.eaiIfId = eaiIfId;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.fdrDivCd = fdrDivCd;
		this.svcScpBndCd = svcScpBndCd;
		this.vskdFletGrpCd = vskdFletGrpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_slan_skd_tp_cd", getVslSlanSkdTpCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vsl_tp_cd", getVslTpCd());
		this.hashColumns.put("cnl_agn_vndr_seq", getCnlAgnVndrSeq());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pndlm_flg", getPndlmFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_slan_nm", getVslSlanNm());
		this.hashColumns.put("spcl_cgo_rqst_tgt_lane_flg", getSpclCgoRqstTgtLaneFlg());
		this.hashColumns.put("act_skd_tgt_flg", getActSkdTgtFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_svc_tp_cd", getVslSvcTpCd());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("tml_prod_rpt_flg", getTmlProdRptFlg());
		this.hashColumns.put("st_eff_dt", getStEffDt());
		this.hashColumns.put("end_eff_dt", getEndEffDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fdr_div_cd", getFdrDivCd());
		this.hashColumns.put("svc_scp_bnd_cd", getSvcScpBndCd());
		this.hashColumns.put("vskd_flet_grp_cd", getVskdFletGrpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_slan_skd_tp_cd", "vslSlanSkdTpCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vsl_tp_cd", "vslTpCd");
		this.hashFields.put("cnl_agn_vndr_seq", "cnlAgnVndrSeq");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pndlm_flg", "pndlmFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_slan_nm", "vslSlanNm");
		this.hashFields.put("spcl_cgo_rqst_tgt_lane_flg", "spclCgoRqstTgtLaneFlg");
		this.hashFields.put("act_skd_tgt_flg", "actSkdTgtFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_svc_tp_cd", "vslSvcTpCd");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("tml_prod_rpt_flg", "tmlProdRptFlg");
		this.hashFields.put("st_eff_dt", "stEffDt");
		this.hashFields.put("end_eff_dt", "endEffDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fdr_div_cd", "fdrDivCd");
		this.hashFields.put("svc_scp_bnd_cd", "svcScpBndCd");
		this.hashFields.put("vskd_flet_grp_cd", "vskdFletGrpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslSlanSkdTpCd
	 */
	public String getVslSlanSkdTpCd() {
		return this.vslSlanSkdTpCd;
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
	 * @return vslTpCd
	 */
	public String getVslTpCd() {
		return this.vslTpCd;
	}
	
	/**
	 * Column Info
	 * @return cnlAgnVndrSeq
	 */
	public String getCnlAgnVndrSeq() {
		return this.cnlAgnVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
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
	 * @return pndlmFlg
	 */
	public String getPndlmFlg() {
		return this.pndlmFlg;
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
	 * @return vslSlanNm
	 */
	public String getVslSlanNm() {
		return this.vslSlanNm;
	}
	
	/**
	 * Column Info
	 * @return spclCgoRqstTgtLaneFlg
	 */
	public String getSpclCgoRqstTgtLaneFlg() {
		return this.spclCgoRqstTgtLaneFlg;
	}
	
	/**
	 * Column Info
	 * @return actSkdTgtFlg
	 */
	public String getActSkdTgtFlg() {
		return this.actSkdTgtFlg;
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
	 * @return vslSvcTpCd
	 */
	public String getVslSvcTpCd() {
		return this.vslSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return tmlProdRptFlg
	 */
	public String getTmlProdRptFlg() {
		return this.tmlProdRptFlg;
	}
	
	/**
	 * Column Info
	 * @return stEffDt
	 */
	public String getStEffDt() {
		return this.stEffDt;
	}
	
	/**
	 * Column Info
	 * @return endEffDt
	 */
	public String getEndEffDt() {
		return this.endEffDt;
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
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
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
	 * @return fdrDivCd
	 */
	public String getFdrDivCd() {
		return this.fdrDivCd;
	}
	
	/**
	 * Column Info
	 * @return svcScpBndCd
	 */
	public String getSvcScpBndCd() {
		return this.svcScpBndCd;
	}
	
	/**
	 * Column Info
	 * @return vskdFletGrpCd
	 */
	public String getVskdFletGrpCd() {
		return this.vskdFletGrpCd;
	}
	

	/**
	 * Column Info
	 * @param vslSlanSkdTpCd
	 */
	public void setVslSlanSkdTpCd(String vslSlanSkdTpCd) {
		this.vslSlanSkdTpCd = vslSlanSkdTpCd;
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
	 * @param vslTpCd
	 */
	public void setVslTpCd(String vslTpCd) {
		this.vslTpCd = vslTpCd;
	}
	
	/**
	 * Column Info
	 * @param cnlAgnVndrSeq
	 */
	public void setCnlAgnVndrSeq(String cnlAgnVndrSeq) {
		this.cnlAgnVndrSeq = cnlAgnVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
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
	 * @param pndlmFlg
	 */
	public void setPndlmFlg(String pndlmFlg) {
		this.pndlmFlg = pndlmFlg;
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
	 * @param vslSlanNm
	 */
	public void setVslSlanNm(String vslSlanNm) {
		this.vslSlanNm = vslSlanNm;
	}
	
	/**
	 * Column Info
	 * @param spclCgoRqstTgtLaneFlg
	 */
	public void setSpclCgoRqstTgtLaneFlg(String spclCgoRqstTgtLaneFlg) {
		this.spclCgoRqstTgtLaneFlg = spclCgoRqstTgtLaneFlg;
	}
	
	/**
	 * Column Info
	 * @param actSkdTgtFlg
	 */
	public void setActSkdTgtFlg(String actSkdTgtFlg) {
		this.actSkdTgtFlg = actSkdTgtFlg;
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
	 * @param vslSvcTpCd
	 */
	public void setVslSvcTpCd(String vslSvcTpCd) {
		this.vslSvcTpCd = vslSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param tmlProdRptFlg
	 */
	public void setTmlProdRptFlg(String tmlProdRptFlg) {
		this.tmlProdRptFlg = tmlProdRptFlg;
	}
	
	/**
	 * Column Info
	 * @param stEffDt
	 */
	public void setStEffDt(String stEffDt) {
		this.stEffDt = stEffDt;
	}
	
	/**
	 * Column Info
	 * @param endEffDt
	 */
	public void setEndEffDt(String endEffDt) {
		this.endEffDt = endEffDt;
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
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
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
	 * @param fdrDivCd
	 */
	public void setFdrDivCd(String fdrDivCd) {
		this.fdrDivCd = fdrDivCd;
	}
	
	/**
	 * Column Info
	 * @param svcScpBndCd
	 */
	public void setSvcScpBndCd(String svcScpBndCd) {
		this.svcScpBndCd = svcScpBndCd;
	}
	
	/**
	 * Column Info
	 * @param vskdFletGrpCd
	 */
	public void setVskdFletGrpCd(String vskdFletGrpCd) {
		this.vskdFletGrpCd = vskdFletGrpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslSlanSkdTpCd(JSPUtil.getParameter(request, "vsl_slan_skd_tp_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVslTpCd(JSPUtil.getParameter(request, "vsl_tp_cd", ""));
		setCnlAgnVndrSeq(JSPUtil.getParameter(request, "cnl_agn_vndr_seq", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPndlmFlg(JSPUtil.getParameter(request, "pndlm_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVslSlanNm(JSPUtil.getParameter(request, "vsl_slan_nm", ""));
		setSpclCgoRqstTgtLaneFlg(JSPUtil.getParameter(request, "spcl_cgo_rqst_tgt_lane_flg", ""));
		setActSkdTgtFlg(JSPUtil.getParameter(request, "act_skd_tgt_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslSvcTpCd(JSPUtil.getParameter(request, "vsl_svc_tp_cd", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setTmlProdRptFlg(JSPUtil.getParameter(request, "tml_prod_rpt_flg", ""));
		setStEffDt(JSPUtil.getParameter(request, "st_eff_dt", ""));
		setEndEffDt(JSPUtil.getParameter(request, "end_eff_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFdrDivCd(JSPUtil.getParameter(request, "fdr_div_cd", ""));
		setSvcScpBndCd(JSPUtil.getParameter(request, "svc_scp_bnd_cd", ""));
		setVskdFletGrpCd(JSPUtil.getParameter(request, "vskd_flet_grp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmVslSvcLaneVO[]
	 */
	public MdmVslSvcLaneVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmVslSvcLaneVO[]
	 */
	public MdmVslSvcLaneVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVslSvcLaneVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslSlanSkdTpCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_skd_tp_cd".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] vslTpCd = (JSPUtil.getParameter(request, prefix	+ "vsl_tp_cd".trim(), length));
			String[] cnlAgnVndrSeq = (JSPUtil.getParameter(request, prefix	+ "cnl_agn_vndr_seq".trim(), length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] pndlmFlg = (JSPUtil.getParameter(request, prefix	+ "pndlm_flg".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vslSlanNm = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_nm".trim(), length));
			String[] spclCgoRqstTgtLaneFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_rqst_tgt_lane_flg".trim(), length));
			String[] actSkdTgtFlg = (JSPUtil.getParameter(request, prefix	+ "act_skd_tgt_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "vsl_svc_tp_cd".trim(), length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd".trim(), length));
			String[] tmlProdRptFlg = (JSPUtil.getParameter(request, prefix	+ "tml_prod_rpt_flg".trim(), length));
			String[] stEffDt = (JSPUtil.getParameter(request, prefix	+ "st_eff_dt".trim(), length));
			String[] endEffDt = (JSPUtil.getParameter(request, prefix	+ "end_eff_dt".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] fdrDivCd = (JSPUtil.getParameter(request, prefix	+ "fdr_div_cd".trim(), length));
			String[] svcScpBndCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_bnd_cd".trim(), length));
			String[] vskdFletGrpCd = (JSPUtil.getParameter(request, prefix	+ "vskd_flet_grp_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmVslSvcLaneVO();
				if (vslSlanSkdTpCd[i] != null)
					model.setVslSlanSkdTpCd(vslSlanSkdTpCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslTpCd[i] != null)
					model.setVslTpCd(vslTpCd[i]);
				if (cnlAgnVndrSeq[i] != null)
					model.setCnlAgnVndrSeq(cnlAgnVndrSeq[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pndlmFlg[i] != null)
					model.setPndlmFlg(pndlmFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslSlanNm[i] != null)
					model.setVslSlanNm(vslSlanNm[i]);
				if (spclCgoRqstTgtLaneFlg[i] != null)
					model.setSpclCgoRqstTgtLaneFlg(spclCgoRqstTgtLaneFlg[i]);
				if (actSkdTgtFlg[i] != null)
					model.setActSkdTgtFlg(actSkdTgtFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslSvcTpCd[i] != null)
					model.setVslSvcTpCd(vslSvcTpCd[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (tmlProdRptFlg[i] != null)
					model.setTmlProdRptFlg(tmlProdRptFlg[i]);
				if (stEffDt[i] != null)
					model.setStEffDt(stEffDt[i]);
				if (endEffDt[i] != null)
					model.setEndEffDt(endEffDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fdrDivCd[i] != null)
					model.setFdrDivCd(fdrDivCd[i]);
				if (svcScpBndCd[i] != null)
					model.setSvcScpBndCd(svcScpBndCd[i]);
				if (vskdFletGrpCd[i] != null)
					model.setVskdFletGrpCd(vskdFletGrpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmVslSvcLaneVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmVslSvcLaneVO[]
	 */
	public MdmVslSvcLaneVO[] getMdmVslSvcLaneVOs(){
		MdmVslSvcLaneVO[] vos = (MdmVslSvcLaneVO[])models.toArray(new MdmVslSvcLaneVO[models.size()]);
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
		this.vslSlanSkdTpCd = this.vslSlanSkdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTpCd = this.vslTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnlAgnVndrSeq = this.cnlAgnVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pndlmFlg = this.pndlmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanNm = this.vslSlanNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoRqstTgtLaneFlg = this.spclCgoRqstTgtLaneFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actSkdTgtFlg = this.actSkdTgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSvcTpCd = this.vslSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdRptFlg = this.tmlProdRptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stEffDt = this.stEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.endEffDt = this.endEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrDivCd = this.fdrDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpBndCd = this.svcScpBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vskdFletGrpCd = this.vskdFletGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
