/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRSOhdrVO.java
*@FileTitle : CSRSOhdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.06
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.11.06 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CSRSOhdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CSRSOhdrVO> models = new ArrayList<CSRSOhdrVO>();
	
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String apOfcCd = null;
	/* Column Info */
	private String vndrTermNm = null;
	/* Column Info */
	private String fincRgnCd = null;
	/* Column Info */
	private String count = null;
	/* Column Info */
	private String csrCurrCd = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String noOfInv = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String attrCtnt1 = null;
	/* Column Info */
	private String issDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vndrNo = null;
	/* Column Info */
	private String invDesc = null;
	/* Column Info */
	private String attrCtnt2 = null;
	/* Column Info */
	private String dtrbCoaVvdCd = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String csrAmt = null;
	/* Column Info */
	private String apCtrCd = null;
	/* Column Info */
	private String dueDt = null;
	/* Column Info */
	private String soIfCd = null;
	/* Column Info */
	private String dtrbCoaAcctCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CSRSOhdrVO() {}

	public CSRSOhdrVO(String ibflag, String pagerows, String vndrNo, String invDesc, String noOfInv, String csrCurrCd, String csrAmt, String attrCtnt2, String issDt, String rcvDt, String vndrTermNm, String dueDt, String csrNo, String soIfCd, String count, String apOfcCd, String fincRgnCd, String apCtrCd, String attrCtnt1, String dtrbCoaAcctCd, String dtrbCoaVvdCd, String lineNo, String invSubSysCd, String ofcCd) {
		this.csrNo = csrNo;
		this.apOfcCd = apOfcCd;
		this.vndrTermNm = vndrTermNm;
		this.fincRgnCd = fincRgnCd;
		this.count = count;
		this.csrCurrCd = csrCurrCd;
		this.lineNo = lineNo;
		this.noOfInv = noOfInv;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.attrCtnt1 = attrCtnt1;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.vndrNo = vndrNo;
		this.invDesc = invDesc;
		this.attrCtnt2 = attrCtnt2;
		this.dtrbCoaVvdCd = dtrbCoaVvdCd;
		this.rcvDt = rcvDt;
		this.invSubSysCd = invSubSysCd;
		this.csrAmt = csrAmt;
		this.apCtrCd = apCtrCd;
		this.dueDt = dueDt;
		this.soIfCd = soIfCd;
		this.dtrbCoaAcctCd = dtrbCoaAcctCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("ap_ofc_cd", getApOfcCd());
		this.hashColumns.put("vndr_term_nm", getVndrTermNm());
		this.hashColumns.put("finc_rgn_cd", getFincRgnCd());
		this.hashColumns.put("count", getCount());
		this.hashColumns.put("csr_curr_cd", getCsrCurrCd());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("no_of_inv", getNoOfInv());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("attr_ctnt1", getAttrCtnt1());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_no", getVndrNo());
		this.hashColumns.put("inv_desc", getInvDesc());
		this.hashColumns.put("attr_ctnt2", getAttrCtnt2());
		this.hashColumns.put("dtrb_coa_vvd_cd", getDtrbCoaVvdCd());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("csr_amt", getCsrAmt());
		this.hashColumns.put("ap_ctr_cd", getApCtrCd());
		this.hashColumns.put("due_dt", getDueDt());
		this.hashColumns.put("so_if_cd", getSoIfCd());
		this.hashColumns.put("dtrb_coa_acct_cd", getDtrbCoaAcctCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("ap_ofc_cd", "apOfcCd");
		this.hashFields.put("vndr_term_nm", "vndrTermNm");
		this.hashFields.put("finc_rgn_cd", "fincRgnCd");
		this.hashFields.put("count", "count");
		this.hashFields.put("csr_curr_cd", "csrCurrCd");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("no_of_inv", "noOfInv");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("attr_ctnt1", "attrCtnt1");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_no", "vndrNo");
		this.hashFields.put("inv_desc", "invDesc");
		this.hashFields.put("attr_ctnt2", "attrCtnt2");
		this.hashFields.put("dtrb_coa_vvd_cd", "dtrbCoaVvdCd");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("csr_amt", "csrAmt");
		this.hashFields.put("ap_ctr_cd", "apCtrCd");
		this.hashFields.put("due_dt", "dueDt");
		this.hashFields.put("so_if_cd", "soIfCd");
		this.hashFields.put("dtrb_coa_acct_cd", "dtrbCoaAcctCd");
		return this.hashFields;
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
	 * @return apOfcCd
	 */
	public String getApOfcCd() {
		return this.apOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vndrTermNm
	 */
	public String getVndrTermNm() {
		return this.vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @return fincRgnCd
	 */
	public String getFincRgnCd() {
		return this.fincRgnCd;
	}
	
	/**
	 * Column Info
	 * @return count
	 */
	public String getCount() {
		return this.count;
	}
	
	/**
	 * Column Info
	 * @return csrCurrCd
	 */
	public String getCsrCurrCd() {
		return this.csrCurrCd;
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
	 * @return noOfInv
	 */
	public String getNoOfInv() {
		return this.noOfInv;
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
	 * Column Info
	 * @return attrCtnt1
	 */
	public String getAttrCtnt1() {
		return this.attrCtnt1;
	}
	
	/**
	 * Column Info
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
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
	 * @return vndrNo
	 */
	public String getVndrNo() {
		return this.vndrNo;
	}
	
	/**
	 * Column Info
	 * @return invDesc
	 */
	public String getInvDesc() {
		return this.invDesc;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt2
	 */
	public String getAttrCtnt2() {
		return this.attrCtnt2;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaVvdCd
	 */
	public String getDtrbCoaVvdCd() {
		return this.dtrbCoaVvdCd;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
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
	 * @return csrAmt
	 */
	public String getCsrAmt() {
		return this.csrAmt;
	}
	
	/**
	 * Column Info
	 * @return apCtrCd
	 */
	public String getApCtrCd() {
		return this.apCtrCd;
	}
	
	/**
	 * Column Info
	 * @return dueDt
	 */
	public String getDueDt() {
		return this.dueDt;
	}
	
	/**
	 * Column Info
	 * @return soIfCd
	 */
	public String getSoIfCd() {
		return this.soIfCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaAcctCd
	 */
	public String getDtrbCoaAcctCd() {
		return this.dtrbCoaAcctCd;
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
	 * @param apOfcCd
	 */
	public void setApOfcCd(String apOfcCd) {
		this.apOfcCd = apOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vndrTermNm
	 */
	public void setVndrTermNm(String vndrTermNm) {
		this.vndrTermNm = vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @param fincRgnCd
	 */
	public void setFincRgnCd(String fincRgnCd) {
		this.fincRgnCd = fincRgnCd;
	}
	
	/**
	 * Column Info
	 * @param count
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	/**
	 * Column Info
	 * @param csrCurrCd
	 */
	public void setCsrCurrCd(String csrCurrCd) {
		this.csrCurrCd = csrCurrCd;
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
	 * @param noOfInv
	 */
	public void setNoOfInv(String noOfInv) {
		this.noOfInv = noOfInv;
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
	 * Column Info
	 * @param attrCtnt1
	 */
	public void setAttrCtnt1(String attrCtnt1) {
		this.attrCtnt1 = attrCtnt1;
	}
	
	/**
	 * Column Info
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
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
	 * @param vndrNo
	 */
	public void setVndrNo(String vndrNo) {
		this.vndrNo = vndrNo;
	}
	
	/**
	 * Column Info
	 * @param invDesc
	 */
	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt2
	 */
	public void setAttrCtnt2(String attrCtnt2) {
		this.attrCtnt2 = attrCtnt2;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaVvdCd
	 */
	public void setDtrbCoaVvdCd(String dtrbCoaVvdCd) {
		this.dtrbCoaVvdCd = dtrbCoaVvdCd;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
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
	 * @param csrAmt
	 */
	public void setCsrAmt(String csrAmt) {
		this.csrAmt = csrAmt;
	}
	
	/**
	 * Column Info
	 * @param apCtrCd
	 */
	public void setApCtrCd(String apCtrCd) {
		this.apCtrCd = apCtrCd;
	}
	
	/**
	 * Column Info
	 * @param dueDt
	 */
	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
	}
	
	/**
	 * Column Info
	 * @param soIfCd
	 */
	public void setSoIfCd(String soIfCd) {
		this.soIfCd = soIfCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaAcctCd
	 */
	public void setDtrbCoaAcctCd(String dtrbCoaAcctCd) {
		this.dtrbCoaAcctCd = dtrbCoaAcctCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setApOfcCd(JSPUtil.getParameter(request, "ap_ofc_cd", ""));
		setVndrTermNm(JSPUtil.getParameter(request, "vndr_term_nm", ""));
		setFincRgnCd(JSPUtil.getParameter(request, "finc_rgn_cd", ""));
		setCount(JSPUtil.getParameter(request, "count", ""));
		setCsrCurrCd(JSPUtil.getParameter(request, "csr_curr_cd", ""));
		setLineNo(JSPUtil.getParameter(request, "line_no", ""));
		setNoOfInv(JSPUtil.getParameter(request, "no_of_inv", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setAttrCtnt1(JSPUtil.getParameter(request, "attr_ctnt1", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrNo(JSPUtil.getParameter(request, "vndr_no", ""));
		setInvDesc(JSPUtil.getParameter(request, "inv_desc", ""));
		setAttrCtnt2(JSPUtil.getParameter(request, "attr_ctnt2", ""));
		setDtrbCoaVvdCd(JSPUtil.getParameter(request, "dtrb_coa_vvd_cd", ""));
		setRcvDt(JSPUtil.getParameter(request, "rcv_dt", ""));
		setInvSubSysCd(JSPUtil.getParameter(request, "inv_sub_sys_cd", ""));
		setCsrAmt(JSPUtil.getParameter(request, "csr_amt", ""));
		setApCtrCd(JSPUtil.getParameter(request, "ap_ctr_cd", ""));
		setDueDt(JSPUtil.getParameter(request, "due_dt", ""));
		setSoIfCd(JSPUtil.getParameter(request, "so_if_cd", ""));
		setDtrbCoaAcctCd(JSPUtil.getParameter(request, "dtrb_coa_acct_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CSRSOhdrVO[]
	 */
	public CSRSOhdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CSRSOhdrVO[]
	 */
	public CSRSOhdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CSRSOhdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] apOfcCd = (JSPUtil.getParameter(request, prefix	+ "ap_ofc_cd", length));
			String[] vndrTermNm = (JSPUtil.getParameter(request, prefix	+ "vndr_term_nm", length));
			String[] fincRgnCd = (JSPUtil.getParameter(request, prefix	+ "finc_rgn_cd", length));
			String[] count = (JSPUtil.getParameter(request, prefix	+ "count", length));
			String[] csrCurrCd = (JSPUtil.getParameter(request, prefix	+ "csr_curr_cd", length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix	+ "line_no", length));
			String[] noOfInv = (JSPUtil.getParameter(request, prefix	+ "no_of_inv", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] attrCtnt1 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt1", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vndrNo = (JSPUtil.getParameter(request, prefix	+ "vndr_no", length));
			String[] invDesc = (JSPUtil.getParameter(request, prefix	+ "inv_desc", length));
			String[] attrCtnt2 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt2", length));
			String[] dtrbCoaVvdCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_vvd_cd", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] csrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_amt", length));
			String[] apCtrCd = (JSPUtil.getParameter(request, prefix	+ "ap_ctr_cd", length));
			String[] dueDt = (JSPUtil.getParameter(request, prefix	+ "due_dt", length));
			String[] soIfCd = (JSPUtil.getParameter(request, prefix	+ "so_if_cd", length));
			String[] dtrbCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_acct_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CSRSOhdrVO();
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (apOfcCd[i] != null)
					model.setApOfcCd(apOfcCd[i]);
				if (vndrTermNm[i] != null)
					model.setVndrTermNm(vndrTermNm[i]);
				if (fincRgnCd[i] != null)
					model.setFincRgnCd(fincRgnCd[i]);
				if (count[i] != null)
					model.setCount(count[i]);
				if (csrCurrCd[i] != null)
					model.setCsrCurrCd(csrCurrCd[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (noOfInv[i] != null)
					model.setNoOfInv(noOfInv[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (attrCtnt1[i] != null)
					model.setAttrCtnt1(attrCtnt1[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrNo[i] != null)
					model.setVndrNo(vndrNo[i]);
				if (invDesc[i] != null)
					model.setInvDesc(invDesc[i]);
				if (attrCtnt2[i] != null)
					model.setAttrCtnt2(attrCtnt2[i]);
				if (dtrbCoaVvdCd[i] != null)
					model.setDtrbCoaVvdCd(dtrbCoaVvdCd[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (csrAmt[i] != null)
					model.setCsrAmt(csrAmt[i]);
				if (apCtrCd[i] != null)
					model.setApCtrCd(apCtrCd[i]);
				if (dueDt[i] != null)
					model.setDueDt(dueDt[i]);
				if (soIfCd[i] != null)
					model.setSoIfCd(soIfCd[i]);
				if (dtrbCoaAcctCd[i] != null)
					model.setDtrbCoaAcctCd(dtrbCoaAcctCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCSRSOhdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CSRSOhdrVO[]
	 */
	public CSRSOhdrVO[] getCSRSOhdrVOs(){
		CSRSOhdrVO[] vos = (CSRSOhdrVO[])models.toArray(new CSRSOhdrVO[models.size()]);
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
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apOfcCd = this.apOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrTermNm = this.vndrTermNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincRgnCd = this.fincRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.count = this.count .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrCurrCd = this.csrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noOfInv = this.noOfInv .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt1 = this.attrCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNo = this.vndrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDesc = this.invDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt2 = this.attrCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaVvdCd = this.dtrbCoaVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrAmt = this.csrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apCtrCd = this.apCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dueDt = this.dueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soIfCd = this.soIfCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaAcctCd = this.dtrbCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
