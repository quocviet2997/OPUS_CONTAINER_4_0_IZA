/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : SarAsaDtlVO.java
*@FileTitle : SarAsaDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2014.05.12
*@LastModifier : 
*@LastVersion : 1.0
* 2014.05.12  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class SarAsaDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SarAsaDtlVO> models = new ArrayList<SarAsaDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String asaDtlTpCd = null;
	/* Column Info */
	private String asaDtlSeq = null;
	/* Column Info */
	private String asaDtlDesc = null;
	/* Column Info */
	private String orgIdNo = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String effDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String asaNo = null;
	/* Column Info */
	private String sobIdNo = null;
	/* Column Info */
	private String asaDrAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String asaCrAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SarAsaDtlVO() {}

	public SarAsaDtlVO(String ibflag, String pagerows, String asaNo, String asaDtlSeq, String asaDtlDesc, String asaDrAmt, String asaCrAmt, String effDt, String asaDtlTpCd, String orgIdNo, String sobIdNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.asaDtlTpCd = asaDtlTpCd;
		this.asaDtlSeq = asaDtlSeq;
		this.asaDtlDesc = asaDtlDesc;
		this.orgIdNo = orgIdNo;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.creUsrId = creUsrId;
		this.asaNo = asaNo;
		this.sobIdNo = sobIdNo;
		this.asaDrAmt = asaDrAmt;
		this.updUsrId = updUsrId;
		this.asaCrAmt = asaCrAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("asa_dtl_tp_cd", getAsaDtlTpCd());
		this.hashColumns.put("asa_dtl_seq", getAsaDtlSeq());
		this.hashColumns.put("asa_dtl_desc", getAsaDtlDesc());
		this.hashColumns.put("org_id_no", getOrgIdNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("asa_no", getAsaNo());
		this.hashColumns.put("sob_id_no", getSobIdNo());
		this.hashColumns.put("asa_dr_amt", getAsaDrAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("asa_cr_amt", getAsaCrAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("asa_dtl_tp_cd", "asaDtlTpCd");
		this.hashFields.put("asa_dtl_seq", "asaDtlSeq");
		this.hashFields.put("asa_dtl_desc", "asaDtlDesc");
		this.hashFields.put("org_id_no", "orgIdNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("asa_no", "asaNo");
		this.hashFields.put("sob_id_no", "sobIdNo");
		this.hashFields.put("asa_dr_amt", "asaDrAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("asa_cr_amt", "asaCrAmt");
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
	 * @return asaDtlTpCd
	 */
	public String getAsaDtlTpCd() {
		return this.asaDtlTpCd;
	}
	
	/**
	 * Column Info
	 * @return asaDtlSeq
	 */
	public String getAsaDtlSeq() {
		return this.asaDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return asaDtlDesc
	 */
	public String getAsaDtlDesc() {
		return this.asaDtlDesc;
	}
	
	/**
	 * Column Info
	 * @return orgIdNo
	 */
	public String getOrgIdNo() {
		return this.orgIdNo;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return effDt
	 */
	public String getEffDt() {
		return this.effDt;
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
	 * @return asaNo
	 */
	public String getAsaNo() {
		return this.asaNo;
	}
	
	/**
	 * Column Info
	 * @return sobIdNo
	 */
	public String getSobIdNo() {
		return this.sobIdNo;
	}
	
	/**
	 * Column Info
	 * @return asaDrAmt
	 */
	public String getAsaDrAmt() {
		return this.asaDrAmt;
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
	 * @return asaCrAmt
	 */
	public String getAsaCrAmt() {
		return this.asaCrAmt;
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
	 * @param asaDtlTpCd
	 */
	public void setAsaDtlTpCd(String asaDtlTpCd) {
		this.asaDtlTpCd = asaDtlTpCd;
	}
	
	/**
	 * Column Info
	 * @param asaDtlSeq
	 */
	public void setAsaDtlSeq(String asaDtlSeq) {
		this.asaDtlSeq = asaDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param asaDtlDesc
	 */
	public void setAsaDtlDesc(String asaDtlDesc) {
		this.asaDtlDesc = asaDtlDesc;
	}
	
	/**
	 * Column Info
	 * @param orgIdNo
	 */
	public void setOrgIdNo(String orgIdNo) {
		this.orgIdNo = orgIdNo;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param effDt
	 */
	public void setEffDt(String effDt) {
		this.effDt = effDt;
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
	 * @param asaNo
	 */
	public void setAsaNo(String asaNo) {
		this.asaNo = asaNo;
	}
	
	/**
	 * Column Info
	 * @param sobIdNo
	 */
	public void setSobIdNo(String sobIdNo) {
		this.sobIdNo = sobIdNo;
	}
	
	/**
	 * Column Info
	 * @param asaDrAmt
	 */
	public void setAsaDrAmt(String asaDrAmt) {
		this.asaDrAmt = asaDrAmt;
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
	 * @param asaCrAmt
	 */
	public void setAsaCrAmt(String asaCrAmt) {
		this.asaCrAmt = asaCrAmt;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setAsaDtlTpCd(JSPUtil.getParameter(request, prefix + "asa_dtl_tp_cd", ""));
		setAsaDtlSeq(JSPUtil.getParameter(request, prefix + "asa_dtl_seq", ""));
		setAsaDtlDesc(JSPUtil.getParameter(request, prefix + "asa_dtl_desc", ""));
		setOrgIdNo(JSPUtil.getParameter(request, prefix + "org_id_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, prefix + "eff_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setAsaNo(JSPUtil.getParameter(request, prefix + "asa_no", ""));
		setSobIdNo(JSPUtil.getParameter(request, prefix + "sob_id_no", ""));
		setAsaDrAmt(JSPUtil.getParameter(request, prefix + "asa_dr_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAsaCrAmt(JSPUtil.getParameter(request, prefix + "asa_cr_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SarAsaDtlVO[]
	 */
	public SarAsaDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SarAsaDtlVO[]
	 */
	public SarAsaDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SarAsaDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] asaDtlTpCd = (JSPUtil.getParameter(request, prefix	+ "asa_dtl_tp_cd", length));
			String[] asaDtlSeq = (JSPUtil.getParameter(request, prefix	+ "asa_dtl_seq", length));
			String[] asaDtlDesc = (JSPUtil.getParameter(request, prefix	+ "asa_dtl_desc", length));
			String[] orgIdNo = (JSPUtil.getParameter(request, prefix	+ "org_id_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] asaNo = (JSPUtil.getParameter(request, prefix	+ "asa_no", length));
			String[] sobIdNo = (JSPUtil.getParameter(request, prefix	+ "sob_id_no", length));
			String[] asaDrAmt = (JSPUtil.getParameter(request, prefix	+ "asa_dr_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] asaCrAmt = (JSPUtil.getParameter(request, prefix	+ "asa_cr_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SarAsaDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (asaDtlTpCd[i] != null)
					model.setAsaDtlTpCd(asaDtlTpCd[i]);
				if (asaDtlSeq[i] != null)
					model.setAsaDtlSeq(asaDtlSeq[i]);
				if (asaDtlDesc[i] != null)
					model.setAsaDtlDesc(asaDtlDesc[i]);
				if (orgIdNo[i] != null)
					model.setOrgIdNo(orgIdNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (asaNo[i] != null)
					model.setAsaNo(asaNo[i]);
				if (sobIdNo[i] != null)
					model.setSobIdNo(sobIdNo[i]);
				if (asaDrAmt[i] != null)
					model.setAsaDrAmt(asaDrAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (asaCrAmt[i] != null)
					model.setAsaCrAmt(asaCrAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSarAsaDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SarAsaDtlVO[]
	 */
	public SarAsaDtlVO[] getSarAsaDtlVOs(){
		SarAsaDtlVO[] vos = (SarAsaDtlVO[])models.toArray(new SarAsaDtlVO[models.size()]);
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
		this.asaDtlTpCd = this.asaDtlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaDtlSeq = this.asaDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaDtlDesc = this.asaDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgIdNo = this.orgIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNo = this.asaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sobIdNo = this.sobIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaDrAmt = this.asaDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaCrAmt = this.asaCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
