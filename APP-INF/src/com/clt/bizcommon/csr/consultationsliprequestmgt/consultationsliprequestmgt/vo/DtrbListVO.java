/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DtrbListVO.java
*@FileTitle : DtrbListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.09
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.11.09 함대성 
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

public class DtrbListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<DtrbListVO> models = new ArrayList<DtrbListVO>();
	
	/* Column Info */
	private String preDebit = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String preDebit2 = null;
	/* Column Info */
	private String preCity = null;
	/* Column Info */
	private String preInvNo = null;
	/* Column Info */
	private String preAccountName = null;
	/* Column Info */
	private String preChartOfAccount = null;
	/* Column Info */
	private String preCredit2 = null;
	/* Column Info */
	private String preCredit = null;
	/* Column Info */
	private String preDesc = null;
	/* Column Info */
	private String preGlDate = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public DtrbListVO() {}

	public DtrbListVO(String ibflag, String pagerows, String preChartOfAccount, String preAccountName, String preGlDate, String preCity, String preInvNo, String preDesc, String preDebit, String preCredit, String preDebit2, String preCredit2) {
		this.preDebit = preDebit;
		this.ibflag = ibflag;
		this.preDebit2 = preDebit2;
		this.preCity = preCity;
		this.preInvNo = preInvNo;
		this.preAccountName = preAccountName;
		this.preChartOfAccount = preChartOfAccount;
		this.preCredit2 = preCredit2;
		this.preCredit = preCredit;
		this.preDesc = preDesc;
		this.preGlDate = preGlDate;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pre_debit", getPreDebit());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pre_debit2", getPreDebit2());
		this.hashColumns.put("pre_city", getPreCity());
		this.hashColumns.put("pre_inv_no", getPreInvNo());
		this.hashColumns.put("pre_account_name", getPreAccountName());
		this.hashColumns.put("pre_chart_of_account", getPreChartOfAccount());
		this.hashColumns.put("pre_credit2", getPreCredit2());
		this.hashColumns.put("pre_credit", getPreCredit());
		this.hashColumns.put("pre_desc", getPreDesc());
		this.hashColumns.put("pre_gl_date", getPreGlDate());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pre_debit", "preDebit");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pre_debit2", "preDebit2");
		this.hashFields.put("pre_city", "preCity");
		this.hashFields.put("pre_inv_no", "preInvNo");
		this.hashFields.put("pre_account_name", "preAccountName");
		this.hashFields.put("pre_chart_of_account", "preChartOfAccount");
		this.hashFields.put("pre_credit2", "preCredit2");
		this.hashFields.put("pre_credit", "preCredit");
		this.hashFields.put("pre_desc", "preDesc");
		this.hashFields.put("pre_gl_date", "preGlDate");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return preDebit
	 */
	public String getPreDebit() {
		return this.preDebit;
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
	 * @return preDebit2
	 */
	public String getPreDebit2() {
		return this.preDebit2;
	}
	
	/**
	 * Column Info
	 * @return preCity
	 */
	public String getPreCity() {
		return this.preCity;
	}
	
	/**
	 * Column Info
	 * @return preInvNo
	 */
	public String getPreInvNo() {
		return this.preInvNo;
	}
	
	/**
	 * Column Info
	 * @return preAccountName
	 */
	public String getPreAccountName() {
		return this.preAccountName;
	}
	
	/**
	 * Column Info
	 * @return preChartOfAccount
	 */
	public String getPreChartOfAccount() {
		return this.preChartOfAccount;
	}
	
	/**
	 * Column Info
	 * @return preCredit2
	 */
	public String getPreCredit2() {
		return this.preCredit2;
	}
	
	/**
	 * Column Info
	 * @return preCredit
	 */
	public String getPreCredit() {
		return this.preCredit;
	}
	
	/**
	 * Column Info
	 * @return preDesc
	 */
	public String getPreDesc() {
		return this.preDesc;
	}
	
	/**
	 * Column Info
	 * @return preGlDate
	 */
	public String getPreGlDate() {
		return this.preGlDate;
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
	 * @param preDebit
	 */
	public void setPreDebit(String preDebit) {
		this.preDebit = preDebit;
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
	 * @param preDebit2
	 */
	public void setPreDebit2(String preDebit2) {
		this.preDebit2 = preDebit2;
	}
	
	/**
	 * Column Info
	 * @param preCity
	 */
	public void setPreCity(String preCity) {
		this.preCity = preCity;
	}
	
	/**
	 * Column Info
	 * @param preInvNo
	 */
	public void setPreInvNo(String preInvNo) {
		this.preInvNo = preInvNo;
	}
	
	/**
	 * Column Info
	 * @param preAccountName
	 */
	public void setPreAccountName(String preAccountName) {
		this.preAccountName = preAccountName;
	}
	
	/**
	 * Column Info
	 * @param preChartOfAccount
	 */
	public void setPreChartOfAccount(String preChartOfAccount) {
		this.preChartOfAccount = preChartOfAccount;
	}
	
	/**
	 * Column Info
	 * @param preCredit2
	 */
	public void setPreCredit2(String preCredit2) {
		this.preCredit2 = preCredit2;
	}
	
	/**
	 * Column Info
	 * @param preCredit
	 */
	public void setPreCredit(String preCredit) {
		this.preCredit = preCredit;
	}
	
	/**
	 * Column Info
	 * @param preDesc
	 */
	public void setPreDesc(String preDesc) {
		this.preDesc = preDesc;
	}
	
	/**
	 * Column Info
	 * @param preGlDate
	 */
	public void setPreGlDate(String preGlDate) {
		this.preGlDate = preGlDate;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPreDebit(JSPUtil.getParameter(request, "pre_debit", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPreDebit2(JSPUtil.getParameter(request, "pre_debit2", ""));
		setPreCity(JSPUtil.getParameter(request, "pre_city", ""));
		setPreInvNo(JSPUtil.getParameter(request, "pre_inv_no", ""));
		setPreAccountName(JSPUtil.getParameter(request, "pre_account_name", ""));
		setPreChartOfAccount(JSPUtil.getParameter(request, "pre_chart_of_account", ""));
		setPreCredit2(JSPUtil.getParameter(request, "pre_credit2", ""));
		setPreCredit(JSPUtil.getParameter(request, "pre_credit", ""));
		setPreDesc(JSPUtil.getParameter(request, "pre_desc", ""));
		setPreGlDate(JSPUtil.getParameter(request, "pre_gl_date", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return DtrbListVO[]
	 */
	public DtrbListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return DtrbListVO[]
	 */
	public DtrbListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DtrbListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] preDebit = (JSPUtil.getParameter(request, prefix	+ "pre_debit", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] preDebit2 = (JSPUtil.getParameter(request, prefix	+ "pre_debit2", length));
			String[] preCity = (JSPUtil.getParameter(request, prefix	+ "pre_city", length));
			String[] preInvNo = (JSPUtil.getParameter(request, prefix	+ "pre_inv_no", length));
			String[] preAccountName = (JSPUtil.getParameter(request, prefix	+ "pre_account_name", length));
			String[] preChartOfAccount = (JSPUtil.getParameter(request, prefix	+ "pre_chart_of_account", length));
			String[] preCredit2 = (JSPUtil.getParameter(request, prefix	+ "pre_credit2", length));
			String[] preCredit = (JSPUtil.getParameter(request, prefix	+ "pre_credit", length));
			String[] preDesc = (JSPUtil.getParameter(request, prefix	+ "pre_desc", length));
			String[] preGlDate = (JSPUtil.getParameter(request, prefix	+ "pre_gl_date", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new DtrbListVO();
				if (preDebit[i] != null)
					model.setPreDebit(preDebit[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (preDebit2[i] != null)
					model.setPreDebit2(preDebit2[i]);
				if (preCity[i] != null)
					model.setPreCity(preCity[i]);
				if (preInvNo[i] != null)
					model.setPreInvNo(preInvNo[i]);
				if (preAccountName[i] != null)
					model.setPreAccountName(preAccountName[i]);
				if (preChartOfAccount[i] != null)
					model.setPreChartOfAccount(preChartOfAccount[i]);
				if (preCredit2[i] != null)
					model.setPreCredit2(preCredit2[i]);
				if (preCredit[i] != null)
					model.setPreCredit(preCredit[i]);
				if (preDesc[i] != null)
					model.setPreDesc(preDesc[i]);
				if (preGlDate[i] != null)
					model.setPreGlDate(preGlDate[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDtrbListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return DtrbListVO[]
	 */
	public DtrbListVO[] getDtrbListVOs(){
		DtrbListVO[] vos = (DtrbListVO[])models.toArray(new DtrbListVO[models.size()]);
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
		this.preDebit = this.preDebit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDebit2 = this.preDebit2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCity = this.preCity .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preInvNo = this.preInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preAccountName = this.preAccountName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preChartOfAccount = this.preChartOfAccount .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCredit2 = this.preCredit2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCredit = this.preCredit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDesc = this.preDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preGlDate = this.preGlDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
