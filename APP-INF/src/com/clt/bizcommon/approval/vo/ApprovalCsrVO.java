/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalCsrVO.java
*@FileTitle : ApprovalCsrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.07
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2010.07.07 김현욱 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.approval.vo;

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
 * @author 김현욱
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApprovalCsrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApprovalCsrVO> models = new ArrayList<ApprovalCsrVO>();
	
	/* Column Info */
	private String aproStep = null;
	/* Column Info */
	private String aproRmk = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String subSysCd = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String aproRqstSeq = null;
	/* Column Info */
	private String crntAproSeq = null;
	/* Column Info */
	private String aproSeqKey = null;
	/* Column Info */
	private String appyn = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String aproRqstNo = null;
	/* Column Info */
	private String rqstStDt = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String aproTtlAmt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String payDueDt = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String apstsCd = null;
	/* Column Info */
	private String invKnt = null;
	/* Column Info */
	private String frstAproUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApprovalCsrVO() {}

	public ApprovalCsrVO(String ibflag, String pagerows, String aproRqstNo, String crntAproSeq, String apstsCd, String subSysCd, String rqstStDt, String costOfcCd, String csrNo, String invKnt, String vndrSeq, String payDueDt, String currCd, String aproTtlAmt, String aproRmk, String appyn, String frstAproUsrId, String aproStep, String aproSeqKey, String usrId, String usrNm, String ofcCd, String aproRqstSeq, String invSubSysCd) {
		this.aproStep = aproStep;
		this.aproRmk = aproRmk;
		this.csrNo = csrNo;
		this.subSysCd = subSysCd;
		this.costOfcCd = costOfcCd;
		this.currCd = currCd;
		this.aproRqstSeq = aproRqstSeq;
		this.crntAproSeq = crntAproSeq;
		this.aproSeqKey = aproSeqKey;
		this.appyn = appyn;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.aproRqstNo = aproRqstNo;
		this.rqstStDt = rqstStDt;
		this.usrNm = usrNm;
		this.usrId = usrId;
		this.aproTtlAmt = aproTtlAmt;
		this.vndrSeq = vndrSeq;
		this.payDueDt = payDueDt;
		this.invSubSysCd = invSubSysCd;
		this.apstsCd = apstsCd;
		this.invKnt = invKnt;
		this.frstAproUsrId = frstAproUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("apro_step", getAproStep());
		this.hashColumns.put("apro_rmk", getAproRmk());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("sub_sys_cd", getSubSysCd());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("apro_rqst_seq", getAproRqstSeq());
		this.hashColumns.put("crnt_apro_seq", getCrntAproSeq());
		this.hashColumns.put("apro_seq_key", getAproSeqKey());
		this.hashColumns.put("appyn", getAppyn());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("apro_rqst_no", getAproRqstNo());
		this.hashColumns.put("rqst_st_dt", getRqstStDt());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("apro_ttl_amt", getAproTtlAmt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("pay_due_dt", getPayDueDt());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("apsts_cd", getApstsCd());
		this.hashColumns.put("inv_knt", getInvKnt());
		this.hashColumns.put("frst_apro_usr_id", getFrstAproUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("apro_step", "aproStep");
		this.hashFields.put("apro_rmk", "aproRmk");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("sub_sys_cd", "subSysCd");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("apro_rqst_seq", "aproRqstSeq");
		this.hashFields.put("crnt_apro_seq", "crntAproSeq");
		this.hashFields.put("apro_seq_key", "aproSeqKey");
		this.hashFields.put("appyn", "appyn");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("apro_rqst_no", "aproRqstNo");
		this.hashFields.put("rqst_st_dt", "rqstStDt");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("apro_ttl_amt", "aproTtlAmt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("pay_due_dt", "payDueDt");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("apsts_cd", "apstsCd");
		this.hashFields.put("inv_knt", "invKnt");
		this.hashFields.put("frst_apro_usr_id", "frstAproUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return aproStep
	 */
	public String getAproStep() {
		return this.aproStep;
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
	 * @return subSysCd
	 */
	public String getSubSysCd() {
		return this.subSysCd;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return aproRqstSeq
	 */
	public String getAproRqstSeq() {
		return this.aproRqstSeq;
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
	 * @return aproSeqKey
	 */
	public String getAproSeqKey() {
		return this.aproSeqKey;
	}
	
	/**
	 * Column Info
	 * @return appyn
	 */
	public String getAppyn() {
		return this.appyn;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return aproRqstNo
	 */
	public String getAproRqstNo() {
		return this.aproRqstNo;
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
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
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
	 * @return payDueDt
	 */
	public String getPayDueDt() {
		return this.payDueDt;
	}
	
	/**
	 * Column Info
	 * @return invSubSysCd
	 */
	public String getInvSubSysCd() {
		return this.invSubSysCd;
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
	 * @return invKnt
	 */
	public String getInvKnt() {
		return this.invKnt;
	}
	
	/**
	 * Column Info
	 * @return frstAproUsrId
	 */
	public String getFrstAproUsrId() {
		return this.frstAproUsrId;
	}
	

	/**
	 * Column Info
	 * @param aproStep
	 */
	public void setAproStep(String aproStep) {
		this.aproStep = aproStep;
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
	 * @param subSysCd
	 */
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param aproRqstSeq
	 */
	public void setAproRqstSeq(String aproRqstSeq) {
		this.aproRqstSeq = aproRqstSeq;
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
	 * @param aproSeqKey
	 */
	public void setAproSeqKey(String aproSeqKey) {
		this.aproSeqKey = aproSeqKey;
	}
	
	/**
	 * Column Info
	 * @param appyn
	 */
	public void setAppyn(String appyn) {
		this.appyn = appyn;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param aproRqstNo
	 */
	public void setAproRqstNo(String aproRqstNo) {
		this.aproRqstNo = aproRqstNo;
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
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
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
	 * @param payDueDt
	 */
	public void setPayDueDt(String payDueDt) {
		this.payDueDt = payDueDt;
	}
	
	/**
	 * Column Info
	 * @param invSubSysCd
	 */
	public void setInvSubSysCd(String invSubSysCd) {
		this.invSubSysCd = invSubSysCd;
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
	 * @param invKnt
	 */
	public void setInvKnt(String invKnt) {
		this.invKnt = invKnt;
	}
	
	/**
	 * Column Info
	 * @param frstAproUsrId
	 */
	public void setFrstAproUsrId(String frstAproUsrId) {
		this.frstAproUsrId = frstAproUsrId;
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
		setAproStep(JSPUtil.getParameter(request, prefix + "apro_step", ""));
		setAproRmk(JSPUtil.getParameter(request, prefix + "apro_rmk", ""));
		setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
		setSubSysCd(JSPUtil.getParameter(request, prefix + "sub_sys_cd", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setAproRqstSeq(JSPUtil.getParameter(request, prefix + "apro_rqst_seq", ""));
		setCrntAproSeq(JSPUtil.getParameter(request, prefix + "crnt_apro_seq", ""));
		setAproSeqKey(JSPUtil.getParameter(request, prefix + "apro_seq_key", ""));
		setAppyn(JSPUtil.getParameter(request, prefix + "appyn", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAproRqstNo(JSPUtil.getParameter(request, prefix + "apro_rqst_no", ""));
		setRqstStDt(JSPUtil.getParameter(request, prefix + "rqst_st_dt", ""));
		setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
		setUsrId(JSPUtil.getParameter(request, prefix + "usr_id", ""));
		setAproTtlAmt(JSPUtil.getParameter(request, prefix + "apro_ttl_amt", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setPayDueDt(JSPUtil.getParameter(request, prefix + "pay_due_dt", ""));
		setInvSubSysCd(JSPUtil.getParameter(request, prefix + "inv_sub_sys_cd", ""));
		setApstsCd(JSPUtil.getParameter(request, prefix + "apsts_cd", ""));
		setInvKnt(JSPUtil.getParameter(request, prefix + "inv_knt", ""));
		setFrstAproUsrId(JSPUtil.getParameter(request, prefix + "frst_apro_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApprovalCsrVO[]
	 */
	public ApprovalCsrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApprovalCsrVO[]
	 */
	public ApprovalCsrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApprovalCsrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] aproStep = (JSPUtil.getParameter(request, prefix	+ "apro_step", length));
			String[] aproRmk = (JSPUtil.getParameter(request, prefix	+ "apro_rmk", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] subSysCd = (JSPUtil.getParameter(request, prefix	+ "sub_sys_cd", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] aproRqstSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_seq", length));
			String[] crntAproSeq = (JSPUtil.getParameter(request, prefix	+ "crnt_apro_seq", length));
			String[] aproSeqKey = (JSPUtil.getParameter(request, prefix	+ "apro_seq_key", length));
			String[] appyn = (JSPUtil.getParameter(request, prefix	+ "appyn", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] aproRqstNo = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_no", length));
			String[] rqstStDt = (JSPUtil.getParameter(request, prefix	+ "rqst_st_dt", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] aproTtlAmt = (JSPUtil.getParameter(request, prefix	+ "apro_ttl_amt", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] payDueDt = (JSPUtil.getParameter(request, prefix	+ "pay_due_dt", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] apstsCd = (JSPUtil.getParameter(request, prefix	+ "apsts_cd", length));
			String[] invKnt = (JSPUtil.getParameter(request, prefix	+ "inv_knt", length));
			String[] frstAproUsrId = (JSPUtil.getParameter(request, prefix	+ "frst_apro_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApprovalCsrVO();
				if (aproStep[i] != null)
					model.setAproStep(aproStep[i]);
				if (aproRmk[i] != null)
					model.setAproRmk(aproRmk[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (subSysCd[i] != null)
					model.setSubSysCd(subSysCd[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (aproRqstSeq[i] != null)
					model.setAproRqstSeq(aproRqstSeq[i]);
				if (crntAproSeq[i] != null)
					model.setCrntAproSeq(crntAproSeq[i]);
				if (aproSeqKey[i] != null)
					model.setAproSeqKey(aproSeqKey[i]);
				if (appyn[i] != null)
					model.setAppyn(appyn[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (aproRqstNo[i] != null)
					model.setAproRqstNo(aproRqstNo[i]);
				if (rqstStDt[i] != null)
					model.setRqstStDt(rqstStDt[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (aproTtlAmt[i] != null)
					model.setAproTtlAmt(aproTtlAmt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (payDueDt[i] != null)
					model.setPayDueDt(payDueDt[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (apstsCd[i] != null)
					model.setApstsCd(apstsCd[i]);
				if (invKnt[i] != null)
					model.setInvKnt(invKnt[i]);
				if (frstAproUsrId[i] != null)
					model.setFrstAproUsrId(frstAproUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApprovalCsrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApprovalCsrVO[]
	 */
	public ApprovalCsrVO[] getApprovalCsrVOs(){
		ApprovalCsrVO[] vos = (ApprovalCsrVO[])models.toArray(new ApprovalCsrVO[models.size()]);
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
		this.aproStep = this.aproStep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRmk = this.aproRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subSysCd = this.subSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstSeq = this.aproRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntAproSeq = this.crntAproSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproSeqKey = this.aproSeqKey .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.appyn = this.appyn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstNo = this.aproRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstStDt = this.rqstStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproTtlAmt = this.aproTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDueDt = this.payDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apstsCd = this.apstsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invKnt = this.invKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frstAproUsrId = this.frstAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
