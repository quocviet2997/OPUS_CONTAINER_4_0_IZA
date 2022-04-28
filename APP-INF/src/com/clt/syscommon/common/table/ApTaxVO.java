/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ApTaxVO.java
*@FileTitle : ApTaxVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.20
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.10.20 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApTaxVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApTaxVO> models = new ArrayList<ApTaxVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String avalFlg = null;
	/* Column Info */
	private String apTaxNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String taxNslFlg = null;
	/* Column Info */
	private String taxRt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String faFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String taxNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String taxNaidFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApTaxVO() {}

	public ApTaxVO(String ibflag, String pagerows, String apTaxNm, String taxNo, String taxRt, String taxNaidFlg, String faFlg, String taxNslFlg, String creDt, String creUsrId, String updDt, String updUsrId, String eaiEvntDt, String avalFlg) {
		this.updDt = updDt;
		this.avalFlg = avalFlg;
		this.apTaxNm = apTaxNm;
		this.creDt = creDt;
		this.taxNslFlg = taxNslFlg;
		this.taxRt = taxRt;
		this.eaiEvntDt = eaiEvntDt;
		this.faFlg = faFlg;
		this.pagerows = pagerows;
		this.taxNo = taxNo;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.taxNaidFlg = taxNaidFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("aval_flg", getAvalFlg());
		this.hashColumns.put("ap_tax_nm", getApTaxNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tax_nsl_flg", getTaxNslFlg());
		this.hashColumns.put("tax_rt", getTaxRt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("fa_flg", getFaFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tax_no", getTaxNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("tax_naid_flg", getTaxNaidFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("aval_flg", "avalFlg");
		this.hashFields.put("ap_tax_nm", "apTaxNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tax_nsl_flg", "taxNslFlg");
		this.hashFields.put("tax_rt", "taxRt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("fa_flg", "faFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tax_no", "taxNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("tax_naid_flg", "taxNaidFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
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
	 * @return avalFlg
	 */
	public String getAvalFlg() {
		return this.avalFlg;
	}
	
	/**
	 * Column Info
	 * @return apTaxNm
	 */
	public String getApTaxNm() {
		return this.apTaxNm;
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
	 * @return taxNslFlg
	 */
	public String getTaxNslFlg() {
		return this.taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @return taxRt
	 */
	public String getTaxRt() {
		return this.taxRt;
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
	 * @return faFlg
	 */
	public String getFaFlg() {
		return this.faFlg;
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
	 * @return taxNo
	 */
	public String getTaxNo() {
		return this.taxNo;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return taxNaidFlg
	 */
	public String getTaxNaidFlg() {
		return this.taxNaidFlg;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param avalFlg
	 */
	public void setAvalFlg(String avalFlg) {
		this.avalFlg = avalFlg;
	}
	
	/**
	 * Column Info
	 * @param apTaxNm
	 */
	public void setApTaxNm(String apTaxNm) {
		this.apTaxNm = apTaxNm;
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
	 * @param taxNslFlg
	 */
	public void setTaxNslFlg(String taxNslFlg) {
		this.taxNslFlg = taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @param taxRt
	 */
	public void setTaxRt(String taxRt) {
		this.taxRt = taxRt;
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
	 * @param faFlg
	 */
	public void setFaFlg(String faFlg) {
		this.faFlg = faFlg;
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
	 * @param taxNo
	 */
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param taxNaidFlg
	 */
	public void setTaxNaidFlg(String taxNaidFlg) {
		this.taxNaidFlg = taxNaidFlg;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAvalFlg(JSPUtil.getParameter(request, "aval_flg", ""));
		setApTaxNm(JSPUtil.getParameter(request, "ap_tax_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTaxNslFlg(JSPUtil.getParameter(request, "tax_nsl_flg", ""));
		setTaxRt(JSPUtil.getParameter(request, "tax_rt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setFaFlg(JSPUtil.getParameter(request, "fa_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTaxNo(JSPUtil.getParameter(request, "tax_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTaxNaidFlg(JSPUtil.getParameter(request, "tax_naid_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApTaxVO[]
	 */
	public ApTaxVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApTaxVO[]
	 */
	public ApTaxVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApTaxVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] avalFlg = (JSPUtil.getParameter(request, prefix	+ "aval_flg", length));
			String[] apTaxNm = (JSPUtil.getParameter(request, prefix	+ "ap_tax_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] taxNslFlg = (JSPUtil.getParameter(request, prefix	+ "tax_nsl_flg", length));
			String[] taxRt = (JSPUtil.getParameter(request, prefix	+ "tax_rt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] faFlg = (JSPUtil.getParameter(request, prefix	+ "fa_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] taxNo = (JSPUtil.getParameter(request, prefix	+ "tax_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] taxNaidFlg = (JSPUtil.getParameter(request, prefix	+ "tax_naid_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApTaxVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (avalFlg[i] != null)
					model.setAvalFlg(avalFlg[i]);
				if (apTaxNm[i] != null)
					model.setApTaxNm(apTaxNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (taxNslFlg[i] != null)
					model.setTaxNslFlg(taxNslFlg[i]);
				if (taxRt[i] != null)
					model.setTaxRt(taxRt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (faFlg[i] != null)
					model.setFaFlg(faFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (taxNo[i] != null)
					model.setTaxNo(taxNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (taxNaidFlg[i] != null)
					model.setTaxNaidFlg(taxNaidFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApTaxVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApTaxVO[]
	 */
	public ApTaxVO[] getApTaxVOs(){
		ApTaxVO[] vos = (ApTaxVO[])models.toArray(new ApTaxVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalFlg = this.avalFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apTaxNm = this.apTaxNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNslFlg = this.taxNslFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxRt = this.taxRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faFlg = this.faFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNo = this.taxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNaidFlg = this.taxNaidFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
