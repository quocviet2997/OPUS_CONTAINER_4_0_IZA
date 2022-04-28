/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SearchRegionListVO.java
*@FileTitle : SearchRegionListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.06
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.07.06 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.region.vo;

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

public class SearchRegionListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchRegionListVO> models = new ArrayList<SearchRegionListVO>();
	
	/* Column Info */
	private String rgnCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String rgnNm = null;
	/* Column Info */
	private String scontiCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Continent Code */
	private String contiCd = null;
	
	/*
	 *  20120209 added by JUN SUNG, KIM
	 *  mdm yn 관련 추가 param
	 */
	private String mdmYN = null;
	public String getContiCd() {
		return contiCd;
	}

	public void setContiCd(String contiCd) {
		this.contiCd = contiCd;
	}

	private String deltFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchRegionListVO() {}

	public SearchRegionListVO(String ibflag, String pagerows, String rgnCd, String rgnNm, String cntCd, String scontiCd) {
		this.rgnCd = rgnCd;
		this.ibflag = ibflag;
		this.cntCd = cntCd;
		this.rgnNm = rgnNm;
		this.scontiCd = scontiCd;
		this.pagerows = pagerows;
	}
	
	public SearchRegionListVO(String ibflag, String pagerows, String rgnCd, String rgnNm, String cntCd, String scontiCd, String mdmYN, String deltFlg) {
		this.rgnCd = rgnCd;
		this.ibflag = ibflag;
		this.cntCd = cntCd;
		this.rgnNm = rgnNm;
		this.scontiCd = scontiCd;
		this.pagerows = pagerows;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
	}
	
	public SearchRegionListVO(String ibflag, String pagerows, String rgnCd, String rgnNm, String cntCd, String scontiCd, String mdmYN, String deltFlg, String contiCd) {
		this.rgnCd = rgnCd;
		this.ibflag = ibflag;
		this.cntCd = cntCd;
		this.rgnNm = rgnNm;
		this.scontiCd = scontiCd;
		this.pagerows = pagerows;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
		this.contiCd = contiCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rgn_cd", getRgnCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("rgn_nm", getRgnNm());
		this.hashColumns.put("sconti_cd", getScontiCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("conti_cd", getContiCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rgn_cd", "rgnCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("rgn_nm", "rgnNm");
		this.hashFields.put("sconti_cd", "scontiCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("conti_cd", "contiCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rgnCd
	 */
	public String getRgnCd() {
		return this.rgnCd;
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
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return rgnNm
	 */
	public String getRgnNm() {
		return this.rgnNm;
	}
	
	/**
	 * Column Info
	 * @return scontiCd
	 */
	public String getScontiCd() {
		return this.scontiCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	

	public String getMdmYN() {
		return mdmYN;
	}

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public String getDeltFlg() {
		return deltFlg;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * Column Info
	 * @param rgnCd
	 */
	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
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
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param rgnNm
	 */
	public void setRgnNm(String rgnNm) {
		this.rgnNm = rgnNm;
	}
	
	/**
	 * Column Info
	 * @param scontiCd
	 */
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setRgnCd(JSPUtil.getParameter(request, prefix + "rgn_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setRgnNm(JSPUtil.getParameter(request, prefix + "rgn_nm", ""));
		setScontiCd(JSPUtil.getParameter(request, prefix + "sconti_cd", ""));
		setMdmYN(JSPUtil.getParameter(request, prefix + "mdm_yn", ""));
		if("Y".equals(this.mdmYN)){
			setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", "N"));
		}else{
			setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		}
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setContiCd(JSPUtil.getParameter(request, prefix + "conti_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchRegionListVO[]
	 */
	public SearchRegionListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchRegionListVO[]
	 */
	public SearchRegionListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchRegionListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rgnCd = (JSPUtil.getParameter(request, prefix	+ "rgn_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] rgnNm = (JSPUtil.getParameter(request, prefix	+ "rgn_nm", length));
			String[] scontiCd = (JSPUtil.getParameter(request, prefix	+ "sconti_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchRegionListVO();
				if (rgnCd[i] != null)
					model.setRgnCd(rgnCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (rgnNm[i] != null)
					model.setRgnNm(rgnNm[i]);
				if (scontiCd[i] != null)
					model.setScontiCd(scontiCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchRegionListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchRegionListVO[]
	 */
	public SearchRegionListVO[] getSearchRegionListVOs(){
		SearchRegionListVO[] vos = (SearchRegionListVO[])models.toArray(new SearchRegionListVO[models.size()]);
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
		this.rgnCd = this.rgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnNm = this.rgnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scontiCd = this.scontiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
