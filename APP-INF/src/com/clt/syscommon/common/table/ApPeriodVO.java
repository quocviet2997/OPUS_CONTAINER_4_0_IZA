/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApPeriodVO.java
*@FileTitle : ApPeriodVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.10
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2010.03.10 yOng hO lEE 
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

public class ApPeriodVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApPeriodVO> models = new ArrayList<ApPeriodVO>();
	
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String arApDivCd = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String sysDivCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String clzStsCd = null;
	/* Column Info */
	private String sysDesc = null;
	/* Column Info */
	private String effYrmon = null;
	/* Column Info */
	private String lstUpdDt = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApPeriodVO() {}

	public ApPeriodVO(String ibflag, String pagerows, String sysDivCd, String effYrmon, String ofcCd, String arApDivCd, String clzStsCd, String sysDesc, String rhqCd, String eaiEvntDt, String lstUpdDt) {
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.arApDivCd = arApDivCd;
		this.rhqCd = rhqCd;
		this.sysDivCd = sysDivCd;
		this.eaiEvntDt = eaiEvntDt;
		this.clzStsCd = clzStsCd;
		this.sysDesc = sysDesc;
		this.effYrmon = effYrmon;
		this.lstUpdDt = lstUpdDt;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ar_ap_div_cd", getArApDivCd());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("sys_div_cd", getSysDivCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("clz_sts_cd", getClzStsCd());
		this.hashColumns.put("sys_desc", getSysDesc());
		this.hashColumns.put("eff_yrmon", getEffYrmon());
		this.hashColumns.put("lst_upd_dt", getLstUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ar_ap_div_cd", "arApDivCd");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("sys_div_cd", "sysDivCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("clz_sts_cd", "clzStsCd");
		this.hashFields.put("sys_desc", "sysDesc");
		this.hashFields.put("eff_yrmon", "effYrmon");
		this.hashFields.put("lst_upd_dt", "lstUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return arApDivCd
	 */
	public String getArApDivCd() {
		return this.arApDivCd;
	}
	
	/**
	 * Column Info
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return sysDivCd
	 */
	public String getSysDivCd() {
		return this.sysDivCd;
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
	 * @return clzStsCd
	 */
	public String getClzStsCd() {
		return this.clzStsCd;
	}
	
	/**
	 * Column Info
	 * @return sysDesc
	 */
	public String getSysDesc() {
		return this.sysDesc;
	}
	
	/**
	 * Column Info
	 * @return effYrmon
	 */
	public String getEffYrmon() {
		return this.effYrmon;
	}
	
	/**
	 * Column Info
	 * @return lstUpdDt
	 */
	public String getLstUpdDt() {
		return this.lstUpdDt;
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
	 * @param arApDivCd
	 */
	public void setArApDivCd(String arApDivCd) {
		this.arApDivCd = arApDivCd;
	}
	
	/**
	 * Column Info
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param sysDivCd
	 */
	public void setSysDivCd(String sysDivCd) {
		this.sysDivCd = sysDivCd;
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
	 * @param clzStsCd
	 */
	public void setClzStsCd(String clzStsCd) {
		this.clzStsCd = clzStsCd;
	}
	
	/**
	 * Column Info
	 * @param sysDesc
	 */
	public void setSysDesc(String sysDesc) {
		this.sysDesc = sysDesc;
	}
	
	/**
	 * Column Info
	 * @param effYrmon
	 */
	public void setEffYrmon(String effYrmon) {
		this.effYrmon = effYrmon;
	}
	
	/**
	 * Column Info
	 * @param lstUpdDt
	 */
	public void setLstUpdDt(String lstUpdDt) {
		this.lstUpdDt = lstUpdDt;
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
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setArApDivCd(JSPUtil.getParameter(request, "ar_ap_div_cd", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setSysDivCd(JSPUtil.getParameter(request, "sys_div_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setClzStsCd(JSPUtil.getParameter(request, "clz_sts_cd", ""));
		setSysDesc(JSPUtil.getParameter(request, "sys_desc", ""));
		setEffYrmon(JSPUtil.getParameter(request, "eff_yrmon", ""));
		setLstUpdDt(JSPUtil.getParameter(request, "lst_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApPeriodVO[]
	 */
	public ApPeriodVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApPeriodVO[]
	 */
	public ApPeriodVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApPeriodVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] arApDivCd = (JSPUtil.getParameter(request, prefix	+ "ar_ap_div_cd", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] sysDivCd = (JSPUtil.getParameter(request, prefix	+ "sys_div_cd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] clzStsCd = (JSPUtil.getParameter(request, prefix	+ "clz_sts_cd", length));
			String[] sysDesc = (JSPUtil.getParameter(request, prefix	+ "sys_desc", length));
			String[] effYrmon = (JSPUtil.getParameter(request, prefix	+ "eff_yrmon", length));
			String[] lstUpdDt = (JSPUtil.getParameter(request, prefix	+ "lst_upd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApPeriodVO();
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (arApDivCd[i] != null)
					model.setArApDivCd(arApDivCd[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (sysDivCd[i] != null)
					model.setSysDivCd(sysDivCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (clzStsCd[i] != null)
					model.setClzStsCd(clzStsCd[i]);
				if (sysDesc[i] != null)
					model.setSysDesc(sysDesc[i]);
				if (effYrmon[i] != null)
					model.setEffYrmon(effYrmon[i]);
				if (lstUpdDt[i] != null)
					model.setLstUpdDt(lstUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApPeriodVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApPeriodVO[]
	 */
	public ApPeriodVO[] getApPeriodVOs(){
		ApPeriodVO[] vos = (ApPeriodVO[])models.toArray(new ApPeriodVO[models.size()]);
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
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arApDivCd = this.arApDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysDivCd = this.sysDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clzStsCd = this.clzStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysDesc = this.sysDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effYrmon = this.effYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstUpdDt = this.lstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
