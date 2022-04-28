/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SearchNodeZoneListVO.java
*@FileTitle : SearchNodeZoneListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 
*@LastVersion : 1.0
* 2010.07.05  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.node.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchNodeZoneListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchNodeZoneListVO> models = new ArrayList<SearchNodeZoneListVO>();
	
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String locCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String address = null;
	/* Column Info */
	private String zipCd = null;
	/* Column Info */
	private String znNm = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String znCd = null;
	/* Column Info */
	private String strtNm = null;
	/* Column Info */
	private String dstrNm = null;
	/* Page Number */
	private String pagerows = null;
	
	private String deltFlg = null;
	private String mdmYN = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchNodeZoneListVO() {}

	public SearchNodeZoneListVO(String ibflag, String pagerows, String znCd, String znNm, String ofcCd, String zipCd, String dstrNm, String strtNm, String address, String cntCd, String locCd) {
		this.ofcCd = ofcCd;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.address = address;
		this.zipCd = zipCd;
		this.znNm = znNm;
		this.cntCd = cntCd;
		this.znCd = znCd;
		this.strtNm = strtNm;
		this.dstrNm = dstrNm;
		this.pagerows = pagerows;
	}
	
	public SearchNodeZoneListVO(String ibflag, String pagerows, String znCd, String znNm, String ofcCd, String zipCd, String dstrNm, String strtNm, String address, String cntCd, String locCd, String mdmYN, String deltFlg) {
		this.ofcCd = ofcCd;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.address = address;
		this.zipCd = zipCd;
		this.znNm = znNm;
		this.cntCd = cntCd;
		this.znCd = znCd;
		this.strtNm = strtNm;
		this.dstrNm = dstrNm;
		this.pagerows = pagerows;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("address", getAddress());
		this.hashColumns.put("zip_cd", getZipCd());
		this.hashColumns.put("zn_nm", getZnNm());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("zn_cd", getZnCd());
		this.hashColumns.put("strt_nm", getStrtNm());
		this.hashColumns.put("dstr_nm", getDstrNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("address", "address");
		this.hashFields.put("zip_cd", "zipCd");
		this.hashFields.put("zn_nm", "znNm");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("zn_cd", "znCd");
		this.hashFields.put("strt_nm", "strtNm");
		this.hashFields.put("dstr_nm", "dstrNm");
		this.hashFields.put("delt_flg", "deltFlg");
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
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Column Info
	 * @return zipCd
	 */
	public String getZipCd() {
		return this.zipCd;
	}
	
	/**
	 * Column Info
	 * @return znNm
	 */
	public String getZnNm() {
		return this.znNm;
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
	 * @return znCd
	 */
	public String getZnCd() {
		return this.znCd;
	}
	
	/**
	 * Column Info
	 * @return strtNm
	 */
	public String getStrtNm() {
		return this.strtNm;
	}
	
	/**
	 * Column Info
	 * @return dstrNm
	 */
	public String getDstrNm() {
		return this.dstrNm;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	public String getDeltFlg() {
		return deltFlg;
	}

	
	public String getMdmYN() {
		return mdmYN;
	}

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Column Info
	 * @param zipCd
	 */
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	
	/**
	 * Column Info
	 * @param znNm
	 */
	public void setZnNm(String znNm) {
		this.znNm = znNm;
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
	 * @param znCd
	 */
	public void setZnCd(String znCd) {
		this.znCd = znCd;
	}
	
	/**
	 * Column Info
	 * @param strtNm
	 */
	public void setStrtNm(String strtNm) {
		this.strtNm = strtNm;
	}
	
	/**
	 * Column Info
	 * @param dstrNm
	 */
	public void setDstrNm(String dstrNm) {
		this.dstrNm = dstrNm;
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
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAddress(JSPUtil.getParameter(request, prefix + "address", ""));
		setZipCd(JSPUtil.getParameter(request, prefix + "zip_cd", ""));
		setZnNm(JSPUtil.getParameter(request, prefix + "zn_nm", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setZnCd(JSPUtil.getParameter(request, prefix + "zn_cd", ""));
		setStrtNm(JSPUtil.getParameter(request, prefix + "strt_nm", ""));
		setDstrNm(JSPUtil.getParameter(request, prefix + "dstr_nm", ""));
		setMdmYN(JSPUtil.getParameter(request, prefix + "mdm_yn", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchNodeZoneListVO[]
	 */
	public SearchNodeZoneListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchNodeZoneListVO[]
	 */
	public SearchNodeZoneListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchNodeZoneListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] address = (JSPUtil.getParameter(request, prefix	+ "address", length));
			String[] zipCd = (JSPUtil.getParameter(request, prefix	+ "zip_cd", length));
			String[] znNm = (JSPUtil.getParameter(request, prefix	+ "zn_nm", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] znCd = (JSPUtil.getParameter(request, prefix	+ "zn_cd", length));
			String[] strtNm = (JSPUtil.getParameter(request, prefix	+ "strt_nm", length));
			String[] dstrNm = (JSPUtil.getParameter(request, prefix	+ "dstr_nm", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchNodeZoneListVO();
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (address[i] != null)
					model.setAddress(address[i]);
				if (zipCd[i] != null)
					model.setZipCd(zipCd[i]);
				if (znNm[i] != null)
					model.setZnNm(znNm[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (znCd[i] != null)
					model.setZnCd(znCd[i]);
				if (strtNm[i] != null)
					model.setStrtNm(strtNm[i]);
				if (dstrNm[i] != null)
					model.setDstrNm(dstrNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchNodeZoneListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchNodeZoneListVO[]
	 */
	public SearchNodeZoneListVO[] getSearchNodeZoneListVOs(){
		SearchNodeZoneListVO[] vos = (SearchNodeZoneListVO[])models.toArray(new SearchNodeZoneListVO[models.size()]);
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
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.address = this.address .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.zipCd = this.zipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znNm = this.znNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znCd = this.znCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.strtNm = this.strtNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dstrNm = this.dstrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
