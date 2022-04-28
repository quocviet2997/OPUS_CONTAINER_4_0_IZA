/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : UnApprovalCsrVO.java
*@FileTitle : UnApprovalCsrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.09.05
*@LastModifier : 
*@LastVersion : 1.0
* 2018.09.05  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.approval.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class UnApprovalCsrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<UnApprovalCsrVO> models = new ArrayList<UnApprovalCsrVO>();
	
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String subSysCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String crntAproSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String aproUsrNm = null;
	/* Column Info */
	private String aproOfcCd = null;
	/* Column Info */
	private String n1stAppredYn = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String upd1stAproStepYn = null;
	/* Column Info */
	private String rqstStDt = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String payDueDt = null;
	/* Column Info */
	private String invKnt = null;
	/* Column Info */
	private String invDt = null;
	/* Column Info */
	private String invEffDt = null;
	/* Column Info */
	private String aproRmk = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String arHdQtrOfcCd = null;
	/* Column Info */
	private String aproEvntDesc = null;
	/* Column Info */
	private String appyn = null;
	/* Column Info */
	private String ofcNm = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String aproRqstNo = null;
	/* Column Info */
	private String aproUsrId = null;
	/* Column Info */
	private String aproTtlAmt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String apstsCd = null;
	/* Column Info */
	private String n2ndAppredYn = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public UnApprovalCsrVO() {}

	public UnApprovalCsrVO(String ibflag, String pagerows, String appyn, String aproEvntDesc, String aproOfcCd, String aproRmk, String aproRqstNo, String aproTtlAmt, String aproUsrId, String aproUsrNm, String apstsCd, String arHdQtrOfcCd, String costOfcCd, String creDt, String creUsrId, String crntAproSeq, String csrNo, String currCd, String glDt, String invDt, String invEffDt, String invKnt, String n1stAppredYn, String n2ndAppredYn, String ofcCd, String ofcNm, String payDueDt, String rqstStDt, String subSysCd, String upd1stAproStepYn, String usrNm, String vndrSeq) {
		this.glDt = glDt;
		this.subSysCd = subSysCd;
		this.currCd = currCd;
		this.crntAproSeq = crntAproSeq;
		this.creDt = creDt;
		this.aproUsrNm = aproUsrNm;
		this.aproOfcCd = aproOfcCd;
		this.n1stAppredYn = n1stAppredYn;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.upd1stAproStepYn = upd1stAproStepYn;
		this.rqstStDt = rqstStDt;
		this.usrNm = usrNm;
		this.payDueDt = payDueDt;
		this.invKnt = invKnt;
		this.invDt = invDt;
		this.invEffDt = invEffDt;
		this.aproRmk = aproRmk;
		this.csrNo = csrNo;
		this.costOfcCd = costOfcCd;
		this.arHdQtrOfcCd = arHdQtrOfcCd;
		this.aproEvntDesc = aproEvntDesc;
		this.appyn = appyn;
		this.ofcNm = ofcNm;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.aproRqstNo = aproRqstNo;
		this.aproUsrId = aproUsrId;
		this.aproTtlAmt = aproTtlAmt;
		this.vndrSeq = vndrSeq;
		this.apstsCd = apstsCd;
		this.n2ndAppredYn = n2ndAppredYn;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("sub_sys_cd", getSubSysCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("crnt_apro_seq", getCrntAproSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("apro_usr_nm", getAproUsrNm());
		this.hashColumns.put("apro_ofc_cd", getAproOfcCd());
		this.hashColumns.put("n1st_appred_yn", getN1stAppredYn());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_1st_apro_step_yn", getUpd1stAproStepYn());
		this.hashColumns.put("rqst_st_dt", getRqstStDt());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("pay_due_dt", getPayDueDt());
		this.hashColumns.put("inv_knt", getInvKnt());
		this.hashColumns.put("inv_dt", getInvDt());
		this.hashColumns.put("inv_eff_dt", getInvEffDt());
		this.hashColumns.put("apro_rmk", getAproRmk());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("ar_hd_qtr_ofc_cd", getArHdQtrOfcCd());
		this.hashColumns.put("apro_evnt_desc", getAproEvntDesc());
		this.hashColumns.put("appyn", getAppyn());
		this.hashColumns.put("ofc_nm", getOfcNm());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("apro_rqst_no", getAproRqstNo());
		this.hashColumns.put("apro_usr_id", getAproUsrId());
		this.hashColumns.put("apro_ttl_amt", getAproTtlAmt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("apsts_cd", getApstsCd());
		this.hashColumns.put("n2nd_appred_yn", getN2ndAppredYn());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("sub_sys_cd", "subSysCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("crnt_apro_seq", "crntAproSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("apro_usr_nm", "aproUsrNm");
		this.hashFields.put("apro_ofc_cd", "aproOfcCd");
		this.hashFields.put("n1st_appred_yn", "n1stAppredYn");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_1st_apro_step_yn", "upd1stAproStepYn");
		this.hashFields.put("rqst_st_dt", "rqstStDt");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("pay_due_dt", "payDueDt");
		this.hashFields.put("inv_knt", "invKnt");
		this.hashFields.put("inv_dt", "invDt");
		this.hashFields.put("inv_eff_dt", "invEffDt");
		this.hashFields.put("apro_rmk", "aproRmk");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("ar_hd_qtr_ofc_cd", "arHdQtrOfcCd");
		this.hashFields.put("apro_evnt_desc", "aproEvntDesc");
		this.hashFields.put("appyn", "appyn");
		this.hashFields.put("ofc_nm", "ofcNm");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("apro_rqst_no", "aproRqstNo");
		this.hashFields.put("apro_usr_id", "aproUsrId");
		this.hashFields.put("apro_ttl_amt", "aproTtlAmt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("apsts_cd", "apstsCd");
		this.hashFields.put("n2nd_appred_yn", "n2ndAppredYn");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
	}
	
	/**
	 * Column Info
	 * @return subSysCd
	 */
	public String getSubSysCd() {
		return this.subSysCd;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return crntAproSeq
	 */
	public String getCrntAproSeq() {
		return this.crntAproSeq;
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
	 * @return aproUsrNm
	 */
	public String getAproUsrNm() {
		return this.aproUsrNm;
	}
	
	/**
	 * Column Info
	 * @return aproOfcCd
	 */
	public String getAproOfcCd() {
		return this.aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n1stAppredYn
	 */
	public String getN1stAppredYn() {
		return this.n1stAppredYn;
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
	 * @return upd1stAproStepYn
	 */
	public String getUpd1stAproStepYn() {
		return this.upd1stAproStepYn;
	}
	
	/**
	 * Column Info
	 * @return rqstStDt
	 */
	public String getRqstStDt() {
		return this.rqstStDt;
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
	 * @return payDueDt
	 */
	public String getPayDueDt() {
		return this.payDueDt;
	}
	
	/**
	 * Column Info
	 * @return invKnt
	 */
	public String getInvKnt() {
		return this.invKnt;
	}
	
	/**
	 * Column Info
	 * @return invDt
	 */
	public String getInvDt() {
		return this.invDt;
	}
	
	/**
	 * Column Info
	 * @return invEffDt
	 */
	public String getInvEffDt() {
		return this.invEffDt;
	}
	
	/**
	 * Column Info
	 * @return aproRmk
	 */
	public String getAproRmk() {
		return this.aproRmk;
	}
	
	/**
	 * Column Info
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return costOfcCd
	 */
	public String getCostOfcCd() {
		return this.costOfcCd;
	}
	
	/**
	 * Column Info
	 * @return arHdQtrOfcCd
	 */
	public String getArHdQtrOfcCd() {
		return this.arHdQtrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aproEvntDesc
	 */
	public String getAproEvntDesc() {
		return this.aproEvntDesc;
	}
	
	/**
	 * Column Info
	 * @return appyn
	 */
	public String getAppyn() {
		return this.appyn;
	}
	
	/**
	 * Column Info
	 * @return ofcNm
	 */
	public String getOfcNm() {
		return this.ofcNm;
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
	 * @return aproRqstNo
	 */
	public String getAproRqstNo() {
		return this.aproRqstNo;
	}
	
	/**
	 * Column Info
	 * @return aproUsrId
	 */
	public String getAproUsrId() {
		return this.aproUsrId;
	}
	
	/**
	 * Column Info
	 * @return aproTtlAmt
	 */
	public String getAproTtlAmt() {
		return this.aproTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return apstsCd
	 */
	public String getApstsCd() {
		return this.apstsCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndAppredYn
	 */
	public String getN2ndAppredYn() {
		return this.n2ndAppredYn;
	}
	

	/**
	 * Column Info
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
	}
	
	/**
	 * Column Info
	 * @param subSysCd
	 */
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param crntAproSeq
	 */
	public void setCrntAproSeq(String crntAproSeq) {
		this.crntAproSeq = crntAproSeq;
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
	 * @param aproUsrNm
	 */
	public void setAproUsrNm(String aproUsrNm) {
		this.aproUsrNm = aproUsrNm;
	}
	
	/**
	 * Column Info
	 * @param aproOfcCd
	 */
	public void setAproOfcCd(String aproOfcCd) {
		this.aproOfcCd = aproOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n1stAppredYn
	 */
	public void setN1stAppredYn(String n1stAppredYn) {
		this.n1stAppredYn = n1stAppredYn;
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
	 * @param upd1stAproStepYn
	 */
	public void setUpd1stAproStepYn(String upd1stAproStepYn) {
		this.upd1stAproStepYn = upd1stAproStepYn;
	}
	
	/**
	 * Column Info
	 * @param rqstStDt
	 */
	public void setRqstStDt(String rqstStDt) {
		this.rqstStDt = rqstStDt;
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
	 * @param payDueDt
	 */
	public void setPayDueDt(String payDueDt) {
		this.payDueDt = payDueDt;
	}
	
	/**
	 * Column Info
	 * @param invKnt
	 */
	public void setInvKnt(String invKnt) {
		this.invKnt = invKnt;
	}
	
	/**
	 * Column Info
	 * @param invDt
	 */
	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}
	
	/**
	 * Column Info
	 * @param invEffDt
	 */
	public void setInvEffDt(String invEffDt) {
		this.invEffDt = invEffDt;
	}
	
	/**
	 * Column Info
	 * @param aproRmk
	 */
	public void setAproRmk(String aproRmk) {
		this.aproRmk = aproRmk;
	}
	
	/**
	 * Column Info
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param costOfcCd
	 */
	public void setCostOfcCd(String costOfcCd) {
		this.costOfcCd = costOfcCd;
	}
	
	/**
	 * Column Info
	 * @param arHdQtrOfcCd
	 */
	public void setArHdQtrOfcCd(String arHdQtrOfcCd) {
		this.arHdQtrOfcCd = arHdQtrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aproEvntDesc
	 */
	public void setAproEvntDesc(String aproEvntDesc) {
		this.aproEvntDesc = aproEvntDesc;
	}
	
	/**
	 * Column Info
	 * @param appyn
	 */
	public void setAppyn(String appyn) {
		this.appyn = appyn;
	}
	
	/**
	 * Column Info
	 * @param ofcNm
	 */
	public void setOfcNm(String ofcNm) {
		this.ofcNm = ofcNm;
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
	 * @param aproRqstNo
	 */
	public void setAproRqstNo(String aproRqstNo) {
		this.aproRqstNo = aproRqstNo;
	}
	
	/**
	 * Column Info
	 * @param aproUsrId
	 */
	public void setAproUsrId(String aproUsrId) {
		this.aproUsrId = aproUsrId;
	}
	
	/**
	 * Column Info
	 * @param aproTtlAmt
	 */
	public void setAproTtlAmt(String aproTtlAmt) {
		this.aproTtlAmt = aproTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param apstsCd
	 */
	public void setApstsCd(String apstsCd) {
		this.apstsCd = apstsCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndAppredYn
	 */
	public void setN2ndAppredYn(String n2ndAppredYn) {
		this.n2ndAppredYn = n2ndAppredYn;
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
		setGlDt(JSPUtil.getParameter(request, prefix + "gl_dt", ""));
		setSubSysCd(JSPUtil.getParameter(request, prefix + "sub_sys_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setCrntAproSeq(JSPUtil.getParameter(request, prefix + "crnt_apro_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setAproUsrNm(JSPUtil.getParameter(request, prefix + "apro_usr_nm", ""));
		setAproOfcCd(JSPUtil.getParameter(request, prefix + "apro_ofc_cd", ""));
		setN1stAppredYn(JSPUtil.getParameter(request, prefix + "n1st_appred_yn", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setUpd1stAproStepYn(JSPUtil.getParameter(request, prefix + "upd_1st_apro_step_yn", ""));
		setRqstStDt(JSPUtil.getParameter(request, prefix + "rqst_st_dt", ""));
		setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
		setPayDueDt(JSPUtil.getParameter(request, prefix + "pay_due_dt", ""));
		setInvKnt(JSPUtil.getParameter(request, prefix + "inv_knt", ""));
		setInvDt(JSPUtil.getParameter(request, prefix + "inv_dt", ""));
		setInvEffDt(JSPUtil.getParameter(request, prefix + "inv_eff_dt", ""));
		setAproRmk(JSPUtil.getParameter(request, prefix + "apro_rmk", ""));
		setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setArHdQtrOfcCd(JSPUtil.getParameter(request, prefix + "ar_hd_qtr_ofc_cd", ""));
		setAproEvntDesc(JSPUtil.getParameter(request, prefix + "apro_evnt_desc", ""));
		setAppyn(JSPUtil.getParameter(request, prefix + "appyn", ""));
		setOfcNm(JSPUtil.getParameter(request, prefix + "ofc_nm", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setAproRqstNo(JSPUtil.getParameter(request, prefix + "apro_rqst_no", ""));
		setAproUsrId(JSPUtil.getParameter(request, prefix + "apro_usr_id", ""));
		setAproTtlAmt(JSPUtil.getParameter(request, prefix + "apro_ttl_amt", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setApstsCd(JSPUtil.getParameter(request, prefix + "apsts_cd", ""));
		setN2ndAppredYn(JSPUtil.getParameter(request, prefix + "n2nd_appred_yn", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return UnApprovalCsrVO[]
	 */
	public UnApprovalCsrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return UnApprovalCsrVO[]
	 */
	public UnApprovalCsrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		UnApprovalCsrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] subSysCd = (JSPUtil.getParameter(request, prefix	+ "sub_sys_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] crntAproSeq = (JSPUtil.getParameter(request, prefix	+ "crnt_apro_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] aproUsrNm = (JSPUtil.getParameter(request, prefix	+ "apro_usr_nm", length));
			String[] aproOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_ofc_cd", length));
			String[] n1stAppredYn = (JSPUtil.getParameter(request, prefix	+ "n1st_appred_yn", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] upd1stAproStepYn = (JSPUtil.getParameter(request, prefix	+ "upd_1st_apro_step_yn", length));
			String[] rqstStDt = (JSPUtil.getParameter(request, prefix	+ "rqst_st_dt", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] payDueDt = (JSPUtil.getParameter(request, prefix	+ "pay_due_dt", length));
			String[] invKnt = (JSPUtil.getParameter(request, prefix	+ "inv_knt", length));
			String[] invDt = (JSPUtil.getParameter(request, prefix	+ "inv_dt", length));
			String[] invEffDt = (JSPUtil.getParameter(request, prefix	+ "inv_eff_dt", length));
			String[] aproRmk = (JSPUtil.getParameter(request, prefix	+ "apro_rmk", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] arHdQtrOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_hd_qtr_ofc_cd", length));
			String[] aproEvntDesc = (JSPUtil.getParameter(request, prefix	+ "apro_evnt_desc", length));
			String[] appyn = (JSPUtil.getParameter(request, prefix	+ "appyn", length));
			String[] ofcNm = (JSPUtil.getParameter(request, prefix	+ "ofc_nm", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] aproRqstNo = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_no", length));
			String[] aproUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_usr_id", length));
			String[] aproTtlAmt = (JSPUtil.getParameter(request, prefix	+ "apro_ttl_amt", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] apstsCd = (JSPUtil.getParameter(request, prefix	+ "apsts_cd", length));
			String[] n2ndAppredYn = (JSPUtil.getParameter(request, prefix	+ "n2nd_appred_yn", length));
			
			for (int i = 0; i < length; i++) {
				model = new UnApprovalCsrVO();
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (subSysCd[i] != null)
					model.setSubSysCd(subSysCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (crntAproSeq[i] != null)
					model.setCrntAproSeq(crntAproSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (aproUsrNm[i] != null)
					model.setAproUsrNm(aproUsrNm[i]);
				if (aproOfcCd[i] != null)
					model.setAproOfcCd(aproOfcCd[i]);
				if (n1stAppredYn[i] != null)
					model.setN1stAppredYn(n1stAppredYn[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (upd1stAproStepYn[i] != null)
					model.setUpd1stAproStepYn(upd1stAproStepYn[i]);
				if (rqstStDt[i] != null)
					model.setRqstStDt(rqstStDt[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (payDueDt[i] != null)
					model.setPayDueDt(payDueDt[i]);
				if (invKnt[i] != null)
					model.setInvKnt(invKnt[i]);
				if (invDt[i] != null)
					model.setInvDt(invDt[i]);
				if (invEffDt[i] != null)
					model.setInvEffDt(invEffDt[i]);
				if (aproRmk[i] != null)
					model.setAproRmk(aproRmk[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (arHdQtrOfcCd[i] != null)
					model.setArHdQtrOfcCd(arHdQtrOfcCd[i]);
				if (aproEvntDesc[i] != null)
					model.setAproEvntDesc(aproEvntDesc[i]);
				if (appyn[i] != null)
					model.setAppyn(appyn[i]);
				if (ofcNm[i] != null)
					model.setOfcNm(ofcNm[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (aproRqstNo[i] != null)
					model.setAproRqstNo(aproRqstNo[i]);
				if (aproUsrId[i] != null)
					model.setAproUsrId(aproUsrId[i]);
				if (aproTtlAmt[i] != null)
					model.setAproTtlAmt(aproTtlAmt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (apstsCd[i] != null)
					model.setApstsCd(apstsCd[i]);
				if (n2ndAppredYn[i] != null)
					model.setN2ndAppredYn(n2ndAppredYn[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getUnApprovalCsrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return UnApprovalCsrVO[]
	 */
	public UnApprovalCsrVO[] getUnApprovalCsrVOs(){
		UnApprovalCsrVO[] vos = (UnApprovalCsrVO[])models.toArray(new UnApprovalCsrVO[models.size()]);
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
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subSysCd = this.subSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntAproSeq = this.crntAproSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproUsrNm = this.aproUsrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproOfcCd = this.aproOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stAppredYn = this.n1stAppredYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.upd1stAproStepYn = this.upd1stAproStepYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstStDt = this.rqstStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDueDt = this.payDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invKnt = this.invKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDt = this.invDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEffDt = this.invEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRmk = this.aproRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arHdQtrOfcCd = this.arHdQtrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproEvntDesc = this.aproEvntDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.appyn = this.appyn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcNm = this.ofcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstNo = this.aproRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproUsrId = this.aproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproTtlAmt = this.aproTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apstsCd = this.apstsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndAppredYn = this.n2ndAppredYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
