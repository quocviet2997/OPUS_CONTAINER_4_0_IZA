/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRSOlistVO.java
*@FileTitle : CSRSOlistVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.11
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.11.11 함대성 
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

public class CSRSOlistVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CSRSOlistVO> models = new ArrayList<CSRSOlistVO>();
	
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String aftActFlg = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String totalAmt = null;
	/* Column Info */
	private String whldTaxAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String issDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vatAmt = null;
	/* Column Info */
	private String invStsCd = null;
	/* Column Info */
	private String chk = null;
	/* Column Info */
	private String tmlInvRjctStsCd = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String ttlInvAmt = null;
	/* Column Info */
	private String invRgstNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CSRSOlistVO() {}

	public CSRSOlistVO(String ibflag, String pagerows, String aftActFlg, String chk, String tmlInvRjctStsCd, String invNo, String ttlInvAmt, String vatAmt, String whldTaxAmt, String totalAmt, String issDt, String rcvDt, String invCfmDt, String csrNo, String invRgstNo, String glDt, String invStsCd) {
		this.csrNo = csrNo;
		this.glDt = glDt;
		this.aftActFlg = aftActFlg;
		this.invCfmDt = invCfmDt;
		this.totalAmt = totalAmt;
		this.whldTaxAmt = whldTaxAmt;
		this.pagerows = pagerows;
		this.invNo = invNo;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.vatAmt = vatAmt;
		this.invStsCd = invStsCd;
		this.chk = chk;
		this.tmlInvRjctStsCd = tmlInvRjctStsCd;
		this.rcvDt = rcvDt;
		this.ttlInvAmt = ttlInvAmt;
		this.invRgstNo = invRgstNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("aft_act_flg", getAftActFlg());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("total_amt", getTotalAmt());
		this.hashColumns.put("whld_tax_amt", getWhldTaxAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vat_amt", getVatAmt());
		this.hashColumns.put("inv_sts_cd", getInvStsCd());
		this.hashColumns.put("chk", getChk());
		this.hashColumns.put("tml_inv_rjct_sts_cd", getTmlInvRjctStsCd());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("ttl_inv_amt", getTtlInvAmt());
		this.hashColumns.put("inv_rgst_no", getInvRgstNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("aft_act_flg", "aftActFlg");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("total_amt", "totalAmt");
		this.hashFields.put("whld_tax_amt", "whldTaxAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vat_amt", "vatAmt");
		this.hashFields.put("inv_sts_cd", "invStsCd");
		this.hashFields.put("chk", "chk");
		this.hashFields.put("tml_inv_rjct_sts_cd", "tmlInvRjctStsCd");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("ttl_inv_amt", "ttlInvAmt");
		this.hashFields.put("inv_rgst_no", "invRgstNo");
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
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
	}
	
	/**
	 * Column Info
	 * @return aftActFlg
	 */
	public String getAftActFlg() {
		return this.aftActFlg;
	}
	
	/**
	 * Column Info
	 * @return invCfmDt
	 */
	public String getInvCfmDt() {
		return this.invCfmDt;
	}
	
	/**
	 * Column Info
	 * @return totalAmt
	 */
	public String getTotalAmt() {
		return this.totalAmt;
	}
	
	/**
	 * Column Info
	 * @return whldTaxAmt
	 */
	public String getWhldTaxAmt() {
		return this.whldTaxAmt;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
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
	 * @return vatAmt
	 */
	public String getVatAmt() {
		return this.vatAmt;
	}
	
	/**
	 * Column Info
	 * @return invStsCd
	 */
	public String getInvStsCd() {
		return this.invStsCd;
	}
	
	/**
	 * Column Info
	 * @return chk
	 */
	public String getChk() {
		return this.chk;
	}
	
	/**
	 * Column Info
	 * @return tmlInvRjctStsCd
	 */
	public String getTmlInvRjctStsCd() {
		return this.tmlInvRjctStsCd;
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
	 * @return ttlInvAmt
	 */
	public String getTtlInvAmt() {
		return this.ttlInvAmt;
	}
	
	/**
	 * Column Info
	 * @return invRgstNo
	 */
	public String getInvRgstNo() {
		return this.invRgstNo;
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
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
	}
	
	/**
	 * Column Info
	 * @param aftActFlg
	 */
	public void setAftActFlg(String aftActFlg) {
		this.aftActFlg = aftActFlg;
	}
	
	/**
	 * Column Info
	 * @param invCfmDt
	 */
	public void setInvCfmDt(String invCfmDt) {
		this.invCfmDt = invCfmDt;
	}
	
	/**
	 * Column Info
	 * @param totalAmt
	 */
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	/**
	 * Column Info
	 * @param whldTaxAmt
	 */
	public void setWhldTaxAmt(String whldTaxAmt) {
		this.whldTaxAmt = whldTaxAmt;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
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
	 * @param vatAmt
	 */
	public void setVatAmt(String vatAmt) {
		this.vatAmt = vatAmt;
	}
	
	/**
	 * Column Info
	 * @param invStsCd
	 */
	public void setInvStsCd(String invStsCd) {
		this.invStsCd = invStsCd;
	}
	
	/**
	 * Column Info
	 * @param chk
	 */
	public void setChk(String chk) {
		this.chk = chk;
	}
	
	/**
	 * Column Info
	 * @param tmlInvRjctStsCd
	 */
	public void setTmlInvRjctStsCd(String tmlInvRjctStsCd) {
		this.tmlInvRjctStsCd = tmlInvRjctStsCd;
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
	 * @param ttlInvAmt
	 */
	public void setTtlInvAmt(String ttlInvAmt) {
		this.ttlInvAmt = ttlInvAmt;
	}
	
	/**
	 * Column Info
	 * @param invRgstNo
	 */
	public void setInvRgstNo(String invRgstNo) {
		this.invRgstNo = invRgstNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setAftActFlg(JSPUtil.getParameter(request, "aft_act_flg", ""));
		setInvCfmDt(JSPUtil.getParameter(request, "inv_cfm_dt", ""));
		setTotalAmt(JSPUtil.getParameter(request, "total_amt", ""));
		setWhldTaxAmt(JSPUtil.getParameter(request, "whld_tax_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVatAmt(JSPUtil.getParameter(request, "vat_amt", ""));
		setInvStsCd(JSPUtil.getParameter(request, "inv_sts_cd", ""));
		setChk(JSPUtil.getParameter(request, "chk", ""));
		setTmlInvRjctStsCd(JSPUtil.getParameter(request, "tml_inv_rjct_sts_cd", ""));
		setRcvDt(JSPUtil.getParameter(request, "rcv_dt", ""));
		setTtlInvAmt(JSPUtil.getParameter(request, "ttl_inv_amt", ""));
		setInvRgstNo(JSPUtil.getParameter(request, "inv_rgst_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CSRSOlistVO[]
	 */
	public CSRSOlistVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CSRSOlistVO[]
	 */
	public CSRSOlistVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CSRSOlistVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] aftActFlg = (JSPUtil.getParameter(request, prefix	+ "aft_act_flg", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] totalAmt = (JSPUtil.getParameter(request, prefix	+ "total_amt", length));
			String[] whldTaxAmt = (JSPUtil.getParameter(request, prefix	+ "whld_tax_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vatAmt = (JSPUtil.getParameter(request, prefix	+ "vat_amt", length));
			String[] invStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_sts_cd", length));
			String[] chk = (JSPUtil.getParameter(request, prefix	+ "chk", length));
			String[] tmlInvRjctStsCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_rjct_sts_cd", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] ttlInvAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_inv_amt", length));
			String[] invRgstNo = (JSPUtil.getParameter(request, prefix	+ "inv_rgst_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new CSRSOlistVO();
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (aftActFlg[i] != null)
					model.setAftActFlg(aftActFlg[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (totalAmt[i] != null)
					model.setTotalAmt(totalAmt[i]);
				if (whldTaxAmt[i] != null)
					model.setWhldTaxAmt(whldTaxAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vatAmt[i] != null)
					model.setVatAmt(vatAmt[i]);
				if (invStsCd[i] != null)
					model.setInvStsCd(invStsCd[i]);
				if (chk[i] != null)
					model.setChk(chk[i]);
				if (tmlInvRjctStsCd[i] != null)
					model.setTmlInvRjctStsCd(tmlInvRjctStsCd[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (ttlInvAmt[i] != null)
					model.setTtlInvAmt(ttlInvAmt[i]);
				if (invRgstNo[i] != null)
					model.setInvRgstNo(invRgstNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCSRSOlistVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CSRSOlistVO[]
	 */
	public CSRSOlistVO[] getCSRSOlistVOs(){
		CSRSOlistVO[] vos = (CSRSOlistVO[])models.toArray(new CSRSOlistVO[models.size()]);
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
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftActFlg = this.aftActFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.totalAmt = this.totalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whldTaxAmt = this.whldTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vatAmt = this.vatAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStsCd = this.invStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk = this.chk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvRjctStsCd = this.tmlInvRjctStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlInvAmt = this.ttlInvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRgstNo = this.invRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
