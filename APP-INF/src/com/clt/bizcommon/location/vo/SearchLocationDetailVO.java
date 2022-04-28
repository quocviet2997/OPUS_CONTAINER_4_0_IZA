/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SearchLocationDetailVO.java
*@FileTitle : SearchLocationDetailVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 
*@LastVersion : 1.0
* 2010.07.05  
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.location.vo;

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

public class SearchLocationDetailVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchLocationDetailVO> models = new ArrayList<SearchLocationDetailVO>();
	
	/* Column Info */
	private String rgnCd = null;
	/* Column Info */
	private String unLocCd = null;
	/* Column Info */
	private String gmtHrs = null;
	/* Column Info */
	private String portInlndFlg = null;
	/* Column Info */
	private String eqCtrlOfcCd = null;
	/* Column Info */
	private String cstmsCd = null;
	/* Column Info */
	private String cmlZnFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String locCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locAmsPortCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String portLon = null;
	/* Column Info */
	private String locChrCd = null;
	/* Column Info */
	private String locState = null;
	/* Column Info */
	private String repZnCd = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String portLat = null;
	/* Column Info */
	private String callPortFlg = null;
	/* Column Info */
	private String locNm = null;
	/* Column Info */
	private String country = null;
	/* Column Info */
	private String lccCd = null;
	
	private String locLoclLangNm = null;
	private String mtyPkUpYdCd = null;
	/* Column Info */
	private String locGrdNo = null;
	/* Column Info */
	private String sccCd = null;
	/* Column Info */
	private String zipCd = null;
	/* Column Info */
	private String contiNm = null;
	/* Column Info */
	private String fincCtrlOfcCd = null;
	/* Column Info */
	private String hubLocCd = null;
	/* Column Info */
	private String scontiCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchLocationDetailVO() {}

	public SearchLocationDetailVO(String ibflag, String pagerows, String locCd, String locNm, String rgnCd, String sccCd, String lccCd, String eccCd, String slsOfcCd, String locState, String hubLocCd, String unLocCd, String locChrCd, String zipCd, String eqCtrlOfcCd, String fincCtrlOfcCd, String contiNm, String portInlndFlg, String callPortFlg, String locLoclLangNm ,String mtyPkUpYdCd,String repZnCd, String locGrdNo, String cmlZnFlg, String locAmsPortCd, String gmtHrs, String cstmsCd, String scontiCd, String country, String portLat, String portLon) {
		this.rgnCd = rgnCd;
		this.unLocCd = unLocCd;
		this.gmtHrs = gmtHrs;
		this.portInlndFlg = portInlndFlg;
		this.eqCtrlOfcCd = eqCtrlOfcCd;
		this.cstmsCd = cstmsCd;
		this.cmlZnFlg = cmlZnFlg;
		this.pagerows = pagerows;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.locAmsPortCd = locAmsPortCd;
		this.slsOfcCd = slsOfcCd;
		this.portLon = portLon;
		this.locChrCd = locChrCd;
		this.locState = locState;
		this.repZnCd = repZnCd;
		this.eccCd = eccCd;
		this.portLat = portLat;
		this.callPortFlg = callPortFlg;
		this.mtyPkUpYdCd = mtyPkUpYdCd;
		this.locLoclLangNm = locLoclLangNm;
		this.locNm = locNm;
		this.country = country;
		this.lccCd = lccCd;
		this.locGrdNo = locGrdNo;
		this.sccCd = sccCd;
		this.zipCd = zipCd;
		this.contiNm = contiNm;
		this.fincCtrlOfcCd = fincCtrlOfcCd;
		this.hubLocCd = hubLocCd;
		this.scontiCd = scontiCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rgn_cd", getRgnCd());
		this.hashColumns.put("un_loc_cd", getUnLocCd());
		this.hashColumns.put("gmt_hrs", getGmtHrs());
		this.hashColumns.put("port_inlnd_flg", getPortInlndFlg());
		this.hashColumns.put("eq_ctrl_ofc_cd", getEqCtrlOfcCd());
		this.hashColumns.put("cstms_cd", getCstmsCd());
		this.hashColumns.put("cml_zn_flg", getCmlZnFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("loc_locl_lang_nm", getLocLoclLangNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_ams_port_cd", getLocAmsPortCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("port_lon", getPortLon());
		this.hashColumns.put("loc_chr_cd", getLocChrCd());
		this.hashColumns.put("loc_state", getLocState());
		this.hashColumns.put("rep_zn_cd", getRepZnCd());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("port_lat", getPortLat());
		this.hashColumns.put("call_port_flg", getCallPortFlg());
		this.hashColumns.put("mty_pkup_yd_cd", getMtyPkUpYdCd());
		this.hashColumns.put("loc_nm", getLocNm());
		this.hashColumns.put("country", getCountry());
		this.hashColumns.put("lcc_cd", getLccCd());
		this.hashColumns.put("loc_grd_no", getLocGrdNo());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("zip_cd", getZipCd());
		this.hashColumns.put("conti_nm", getContiNm());
		this.hashColumns.put("finc_ctrl_ofc_cd", getFincCtrlOfcCd());
		this.hashColumns.put("hub_loc_cd", getHubLocCd());
		this.hashColumns.put("sconti_cd", getScontiCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rgn_cd", "rgnCd");
		this.hashFields.put("un_loc_cd", "unLocCd");
		this.hashFields.put("gmt_hrs", "gmtHrs");
		this.hashFields.put("port_inlnd_flg", "portInlndFlg");
		this.hashFields.put("eq_ctrl_ofc_cd", "eqCtrlOfcCd");
		this.hashFields.put("cstms_cd", "cstmsCd");
		this.hashFields.put("cml_zn_flg", "cmlZnFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_ams_port_cd", "locAmsPortCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("port_lon", "portLon");
		this.hashFields.put("loc_chr_cd", "locChrCd");
		this.hashFields.put("loc_state", "locState");
		this.hashFields.put("rep_zn_cd", "repZnCd");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("port_lat", "portLat");
		this.hashFields.put("call_port_flg", "callPortFlg");
		this.hashFields.put("mty_pkup_yd_cd", "mtyPkUpYdCd");
		this.hashFields.put("loc_nm", "locNm");
		this.hashFields.put("country", "country");
		this.hashFields.put("lcc_cd", "lccCd");
		this.hashFields.put("loc_locl_lang_nm", "locLoclLangNm");
		this.hashFields.put("loc_grd_no", "locGrdNo");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("zip_cd", "zipCd");
		this.hashFields.put("conti_nm", "contiNm");
		this.hashFields.put("finc_ctrl_ofc_cd", "fincCtrlOfcCd");
		this.hashFields.put("hub_loc_cd", "hubLocCd");
		this.hashFields.put("sconti_cd", "scontiCd");
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
	 * Column Info
	 * @return unLocCd
	 */
	public String getUnLocCd() {
		return this.unLocCd;
	}
	
	/**
	 * Column Info
	 * @return gmtHrs
	 */
	public String getGmtHrs() {
		return this.gmtHrs;
	}
	
	/**
	 * Column Info
	 * @return portInlndFlg
	 */
	public String getPortInlndFlg() {
		return portInlndFlg;
	}
	
	
	/**
	 * Column Info
	 * @return eqCtrlOfcCd
	 */
	public String getEqCtrlOfcCd() {
		return this.eqCtrlOfcCd;
	}
	

	/**
	 * Column Info
	 * @return cstmsCd
	 */
	public String getCstmsCd() {
		return this.cstmsCd;
	}
	
	/**
	 * Column Info
	 * @return cmlZnFlg
	 */
	public String getCmlZnFlg() {
		return this.cmlZnFlg;
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
	 * @return locAmsPortCd
	 */
	public String getLocAmsPortCd() {
		return this.locAmsPortCd;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return portLon
	 */
	public String getPortLon() {
		return this.portLon;
	}
	
	/**
	 * Column Info
	 * @return locChrCd
	 */
	public String getLocChrCd() {
		return this.locChrCd;
	}
	
	/**
	 * Column Info
	 * @return locState
	 */
	public String getLocState() {
		return this.locState;
	}
	
	/**
	 * Column Info
	 * @return repZnCd
	 */
	public String getRepZnCd() {
		return this.repZnCd;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return portLat
	 */
	public String getPortLat() {
		return this.portLat;
	}
	
	/**
	 * Column Info
	 * @return callPortFlg
	 */
	public String getCallPortFlg() {
		return this.callPortFlg;
	}
	
	public String getLocLoclLangNm() {
		return this.locLoclLangNm;
	}
	
	public String getMtyPkUpYdCd() {
		return this.mtyPkUpYdCd;
	}
	
	/**
	 * Column Info
	 * @return locNm
	 */
	public String getLocNm() {
		return this.locNm;
	}
	
	/**
	 * Column Info
	 * @return country
	 */
	public String getCountry() {
		return this.country;
	}
	
	/**
	 * Column Info
	 * @return lccCd
	 */
	public String getLccCd() {
		return this.lccCd;
	}
	
	/**
	 * Column Info
	 * @return locGrdNo
	 */
	public String getLocGrdNo() {
		return this.locGrdNo;
	}
	
	/**
	 * Column Info
	 * @return sccCd
	 */
	public String getSccCd() {
		return this.sccCd;
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
	 * @return contiNm
	 */
	public String getContiNm() {
		return this.contiNm;
	}
	
	/**
	 * Column Info
	 * @return fincCtrlOfcCd
	 */
	public String getFincCtrlOfcCd() {
		return this.fincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return hubLocCd
	 */
	public String getHubLocCd() {
		return this.hubLocCd;
	}
	
	/**
	 * Column Info
	 * @return scontiCd
	 */
	public String getScontiCd() {
		return this.scontiCd;
	}
	

	/**
	 * Column Info
	 * @param rgnCd
	 */
	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}
	
	/**
	 * Column Info
	 * @param unLocCd
	 */
	public void setUnLocCd(String unLocCd) {
		this.unLocCd = unLocCd;
	}
	
	/**
	 * Column Info
	 * @param gmtHrs
	 */
	public void setGmtHrs(String gmtHrs) {
		this.gmtHrs = gmtHrs;
	}
	
	/**
	 * Column Info
	 * @param portInlndCd
	 */
	public void setPortInlndFlg(String portInlndFlg) {
		this.portInlndFlg = portInlndFlg;
	}

	/**
	 * Column Info
	 * @param eqCtrlOfcCd
	 */
	public void setEqCtrlOfcCd(String eqCtrlOfcCd) {
		this.eqCtrlOfcCd = eqCtrlOfcCd;
	}
	

	/**
	 * Column Info
	 * @param cstmsCd
	 */
	public void setCstmsCd(String cstmsCd) {
		this.cstmsCd = cstmsCd;
	}
	
	/**
	 * Column Info
	 * @param cmlZnFlg
	 */
	public void setCmlZnFlg(String cmlZnFlg) {
		this.cmlZnFlg = cmlZnFlg;
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
	 * @param locAmsPortCd
	 */
	public void setLocAmsPortCd(String locAmsPortCd) {
		this.locAmsPortCd = locAmsPortCd;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param portLon
	 */
	public void setPortLon(String portLon) {
		this.portLon = portLon;
	}
	
	/**
	 * Column Info
	 * @param locChrCd
	 */
	public void setLocChrCd(String locChrCd) {
		this.locChrCd = locChrCd;
	}
	
	/**
	 * Column Info
	 * @param locState
	 */
	public void setLocState(String locState) {
		this.locState = locState;
	}
	
	/**
	 * Column Info
	 * @param repZnCd
	 */
	public void setRepZnCd(String repZnCd) {
		this.repZnCd = repZnCd;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param portLat
	 */
	public void setPortLat(String portLat) {
		this.portLat = portLat;
	}
	
	/**
	 * Column Info
	 * @param callPortFlg
	 */
	public void setCallPortFlg(String callPortFlg) {
		this.callPortFlg = callPortFlg;
	}
	

	
	public void setLocLoclLangNm(String locLoclLangNm) {
		this.locLoclLangNm = locLoclLangNm;
		
	}
	
	public void setMtyPkUpYdCd(String mtyPkUpYdCd) {
		this.mtyPkUpYdCd = mtyPkUpYdCd;
		
	}
	
	/**
	 * Column Info
	 * @param locNm
	 */
	public void setLocNm(String locNm) {
		this.locNm = locNm;
	}
	
	/**
	 * Column Info
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Column Info
	 * @param lccCd
	 */
	public void setLccCd(String lccCd) {
		this.lccCd = lccCd;
	}
	
	/**
	 * Column Info
	 * @param locGrdNo
	 */
	public void setLocGrdNo(String locGrdNo) {
		this.locGrdNo = locGrdNo;
	}
	
	/**
	 * Column Info
	 * @param sccCd
	 */
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
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
	 * @param contiNm
	 */
	public void setContiNm(String contiNm) {
		this.contiNm = contiNm;
	}
	
	/**
	 * Column Info
	 * @param fincCtrlOfcCd
	 */
	public void setFincCtrlOfcCd(String fincCtrlOfcCd) {
		this.fincCtrlOfcCd = fincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param hubLocCd
	 */
	public void setHubLocCd(String hubLocCd) {
		this.hubLocCd = hubLocCd;
	}
	
	/**
	 * Column Info
	 * @param scontiCd
	 */
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
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
		setUnLocCd(JSPUtil.getParameter(request, prefix + "un_loc_cd", ""));
		setGmtHrs(JSPUtil.getParameter(request, prefix + "gmt_hrs", ""));
		setPortInlndFlg(JSPUtil.getParameter(request, prefix + "port_inlnd_flg", ""));
		setEqCtrlOfcCd(JSPUtil.getParameter(request, prefix + "eq_ctrl_ofc_cd", ""));
		setCstmsCd(JSPUtil.getParameter(request, prefix + "cstms_cd", ""));
		setCmlZnFlg(JSPUtil.getParameter(request, prefix + "cml_zn_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLocAmsPortCd(JSPUtil.getParameter(request, prefix + "loc_ams_port_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, prefix + "sls_ofc_cd", ""));
		setPortLon(JSPUtil.getParameter(request, prefix + "port_lon", ""));
		setLocChrCd(JSPUtil.getParameter(request, prefix + "loc_chr_cd", ""));
		setLocState(JSPUtil.getParameter(request, prefix + "loc_state", ""));
		setRepZnCd(JSPUtil.getParameter(request, prefix + "rep_zn_cd", ""));
		setEccCd(JSPUtil.getParameter(request, prefix + "ecc_cd", ""));
		setPortLat(JSPUtil.getParameter(request, prefix + "port_lat", ""));
		setCallPortFlg(JSPUtil.getParameter(request, prefix + "call_port_flg", ""));
		setMtyPkUpYdCd(JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd", ""));
		setLocLoclLangNm(JSPUtil.getParameter(request, prefix + "loc_locl_lang_nm", ""));
		setLocNm(JSPUtil.getParameter(request, prefix + "loc_nm", ""));
		setCountry(JSPUtil.getParameter(request, prefix + "country", ""));
		setLccCd(JSPUtil.getParameter(request, prefix + "lcc_cd", ""));
		setLocGrdNo(JSPUtil.getParameter(request, prefix + "loc_grd_no", ""));
		setSccCd(JSPUtil.getParameter(request, prefix + "scc_cd", ""));
		setZipCd(JSPUtil.getParameter(request, prefix + "zip_cd", ""));
		setContiNm(JSPUtil.getParameter(request, prefix + "conti_nm", ""));
		setFincCtrlOfcCd(JSPUtil.getParameter(request, prefix + "finc_ctrl_ofc_cd", ""));
		setHubLocCd(JSPUtil.getParameter(request, prefix + "hub_loc_cd", ""));
		setScontiCd(JSPUtil.getParameter(request, prefix + "sconti_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchLocationDetailVO[]
	 */
	public SearchLocationDetailVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchLocationDetailVO[]
	 */
	public SearchLocationDetailVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchLocationDetailVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rgnCd = (JSPUtil.getParameter(request, prefix	+ "rgn_cd", length));
			String[] unLocCd = (JSPUtil.getParameter(request, prefix	+ "un_loc_cd", length));
			String[] gmtHrs = (JSPUtil.getParameter(request, prefix	+ "gmt_hrs", length));
			String[] portInlndFlg = (JSPUtil.getParameter(request, prefix	+ "port_inlnd_flg", length));
			String[] eqCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "eq_ctrl_ofc_cd", length));
			String[] cstmsCd = (JSPUtil.getParameter(request, prefix	+ "cstms_cd", length));
			String[] cmlZnFlg = (JSPUtil.getParameter(request, prefix	+ "cml_zn_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locAmsPortCd = (JSPUtil.getParameter(request, prefix	+ "loc_ams_port_cd", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] portLon = (JSPUtil.getParameter(request, prefix	+ "port_lon", length));
			String[] locChrCd = (JSPUtil.getParameter(request, prefix	+ "loc_chr_cd", length));
			String[] locState = (JSPUtil.getParameter(request, prefix	+ "loc_state", length));
			String[] repZnCd = (JSPUtil.getParameter(request, prefix	+ "rep_zn_cd", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] portLat = (JSPUtil.getParameter(request, prefix	+ "port_lat", length));
			String[] callPortFlg = (JSPUtil.getParameter(request, prefix	+ "call_port_flg", length));
			String[] mtyPkUpYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd", length));
			String[] locLoclLangNm = (JSPUtil.getParameter(request, prefix	+ "loc_locl_lang_nm", length));
			String[] locNm = (JSPUtil.getParameter(request, prefix	+ "loc_nm", length));
			String[] country = (JSPUtil.getParameter(request, prefix	+ "country", length));
			String[] lccCd = (JSPUtil.getParameter(request, prefix	+ "lcc_cd", length));
			String[] locGrdNo = (JSPUtil.getParameter(request, prefix	+ "loc_grd_no", length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd", length));
			String[] zipCd = (JSPUtil.getParameter(request, prefix	+ "zip_cd", length));
			String[] contiNm = (JSPUtil.getParameter(request, prefix	+ "conti_nm", length));
			String[] fincCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "finc_ctrl_ofc_cd", length));
			String[] hubLocCd = (JSPUtil.getParameter(request, prefix	+ "hub_loc_cd", length));
			String[] scontiCd = (JSPUtil.getParameter(request, prefix	+ "sconti_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchLocationDetailVO();
				if (rgnCd[i] != null)
					model.setRgnCd(rgnCd[i]);
				if (unLocCd[i] != null)
					model.setUnLocCd(unLocCd[i]);
				if (gmtHrs[i] != null)
					model.setGmtHrs(gmtHrs[i]);
				if (portInlndFlg[i] != null)
					model.setPortInlndFlg(portInlndFlg[i]);
				if (eqCtrlOfcCd[i] != null)
					model.setEqCtrlOfcCd(eqCtrlOfcCd[i]);
				if (cstmsCd[i] != null)
					model.setCstmsCd(cstmsCd[i]);
				if (cmlZnFlg[i] != null)
					model.setCmlZnFlg(cmlZnFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locAmsPortCd[i] != null)
					model.setLocAmsPortCd(locAmsPortCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (portLon[i] != null)
					model.setPortLon(portLon[i]);
				if (locChrCd[i] != null)
					model.setLocChrCd(locChrCd[i]);
				if (locState[i] != null)
					model.setLocState(locState[i]);
				if (repZnCd[i] != null)
					model.setRepZnCd(repZnCd[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (portLat[i] != null)
					model.setPortLat(portLat[i]);
				if (callPortFlg[i] != null)
					model.setCallPortFlg(callPortFlg[i]);
				if (mtyPkUpYdCd[i] != null)
					model.setMtyPkUpYdCd(mtyPkUpYdCd[i]);
				if (locLoclLangNm[i] != null)
					model.setLocLoclLangNm(locLoclLangNm[i]);
				
				if (locNm[i] != null)
					model.setLocNm(locNm[i]);
				if (country[i] != null)
					model.setCountry(country[i]);
				if (lccCd[i] != null)
					model.setLccCd(lccCd[i]);
				if (locGrdNo[i] != null)
					model.setLocGrdNo(locGrdNo[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (zipCd[i] != null)
					model.setZipCd(zipCd[i]);
				if (contiNm[i] != null)
					model.setContiNm(contiNm[i]);
				if (fincCtrlOfcCd[i] != null)
					model.setFincCtrlOfcCd(fincCtrlOfcCd[i]);
				if (hubLocCd[i] != null)
					model.setHubLocCd(hubLocCd[i]);
				if (scontiCd[i] != null)
					model.setScontiCd(scontiCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchLocationDetailVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchLocationDetailVO[]
	 */
	public SearchLocationDetailVO[] getSearchLocationDetailVOs(){
		SearchLocationDetailVO[] vos = (SearchLocationDetailVO[])models.toArray(new SearchLocationDetailVO[models.size()]);
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
		this.unLocCd = this.unLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmtHrs = this.gmtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portInlndFlg = this.portInlndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqCtrlOfcCd = this.eqCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsCd = this.cstmsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmlZnFlg = this.cmlZnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locAmsPortCd = this.locAmsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLon = this.portLon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locChrCd = this.locChrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locState = this.locState .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repZnCd = this.repZnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLat = this.portLat .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callPortFlg = this.callPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyPkUpYdCd = this.mtyPkUpYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locLoclLangNm = this.locLoclLangNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locNm = this.locNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.country = this.country .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locGrdNo = this.locGrdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.zipCd = this.zipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.contiNm = this.contiNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincCtrlOfcCd = this.fincCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hubLocCd = this.hubLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scontiCd = this.scontiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
