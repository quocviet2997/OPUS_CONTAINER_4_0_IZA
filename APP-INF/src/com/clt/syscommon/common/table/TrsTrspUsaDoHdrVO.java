/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspUsaDoHdrVO.java
*@FileTitle : TrsTrspUsaDoHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspUsaDoHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspUsaDoHdrVO> models = new ArrayList<TrsTrspUsaDoHdrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String usrPhnNo = null;
	/* Column Info */
	private String actCustCtyNm = null;
	/* Column Info */
	private String actCustZipCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String actCustN1stAddr = null;
	/* Column Info */
	private String actCustSteNm = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String cntcPsonPhnNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntcPsonFaxNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fctryNm = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String actCustN2ndAddr = null;
	/* Column Info */
	private String usrEml = null;
	/* Column Info */
	private String ifSysKndCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspUsaDoHdrVO() {}

	public TrsTrspUsaDoHdrVO(String ibflag, String pagerows, String blNo, String ifSysKndCd, String fctryNm, String actCustN1stAddr, String actCustN2ndAddr, String actCustCtyNm, String actCustSteNm, String actCustZipCd, String cntcPsonNm, String cntcPsonPhnNo, String cntcPsonFaxNo, String usrEml, String usrPhnNo, String creOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.usrPhnNo = usrPhnNo;
		this.actCustCtyNm = actCustCtyNm;
		this.actCustZipCd = actCustZipCd;
		this.creDt = creDt;
		this.actCustN1stAddr = actCustN1stAddr;
		this.actCustSteNm = actCustSteNm;
		this.blNo = blNo;
		this.cntcPsonPhnNo = cntcPsonPhnNo;
		this.pagerows = pagerows;
		this.cntcPsonFaxNo = cntcPsonFaxNo;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fctryNm = fctryNm;
		this.creOfcCd = creOfcCd;
		this.cntcPsonNm = cntcPsonNm;
		this.actCustN2ndAddr = actCustN2ndAddr;
		this.usrEml = usrEml;
		this.ifSysKndCd = ifSysKndCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("usr_phn_no", getUsrPhnNo());
		this.hashColumns.put("act_cust_cty_nm", getActCustCtyNm());
		this.hashColumns.put("act_cust_zip_cd", getActCustZipCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("act_cust_n1st_addr", getActCustN1stAddr());
		this.hashColumns.put("act_cust_ste_nm", getActCustSteNm());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("cntc_pson_phn_no", getCntcPsonPhnNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntc_pson_fax_no", getCntcPsonFaxNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fctry_nm", getFctryNm());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("act_cust_n2nd_addr", getActCustN2ndAddr());
		this.hashColumns.put("usr_eml", getUsrEml());
		this.hashColumns.put("if_sys_knd_cd", getIfSysKndCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("usr_phn_no", "usrPhnNo");
		this.hashFields.put("act_cust_cty_nm", "actCustCtyNm");
		this.hashFields.put("act_cust_zip_cd", "actCustZipCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("act_cust_n1st_addr", "actCustN1stAddr");
		this.hashFields.put("act_cust_ste_nm", "actCustSteNm");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("cntc_pson_phn_no", "cntcPsonPhnNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntc_pson_fax_no", "cntcPsonFaxNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fctry_nm", "fctryNm");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("act_cust_n2nd_addr", "actCustN2ndAddr");
		this.hashFields.put("usr_eml", "usrEml");
		this.hashFields.put("if_sys_knd_cd", "ifSysKndCd");
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
	 * @return usrPhnNo
	 */
	public String getUsrPhnNo() {
		return this.usrPhnNo;
	}
	
	/**
	 * Column Info
	 * @return actCustCtyNm
	 */
	public String getActCustCtyNm() {
		return this.actCustCtyNm;
	}
	
	/**
	 * Column Info
	 * @return actCustZipCd
	 */
	public String getActCustZipCd() {
		return this.actCustZipCd;
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
	 * @return actCustN1stAddr
	 */
	public String getActCustN1stAddr() {
		return this.actCustN1stAddr;
	}
	
	/**
	 * Column Info
	 * @return actCustSteNm
	 */
	public String getActCustSteNm() {
		return this.actCustSteNm;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonPhnNo
	 */
	public String getCntcPsonPhnNo() {
		return this.cntcPsonPhnNo;
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
	 * @return cntcPsonFaxNo
	 */
	public String getCntcPsonFaxNo() {
		return this.cntcPsonFaxNo;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return fctryNm
	 */
	public String getFctryNm() {
		return this.fctryNm;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonNm
	 */
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return actCustN2ndAddr
	 */
	public String getActCustN2ndAddr() {
		return this.actCustN2ndAddr;
	}
	
	/**
	 * Column Info
	 * @return usrEml
	 */
	public String getUsrEml() {
		return this.usrEml;
	}
	
	/**
	 * Column Info
	 * @return ifSysKndCd
	 */
	public String getIfSysKndCd() {
		return this.ifSysKndCd;
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
	 * @param usrPhnNo
	 */
	public void setUsrPhnNo(String usrPhnNo) {
		this.usrPhnNo = usrPhnNo;
	}
	
	/**
	 * Column Info
	 * @param actCustCtyNm
	 */
	public void setActCustCtyNm(String actCustCtyNm) {
		this.actCustCtyNm = actCustCtyNm;
	}
	
	/**
	 * Column Info
	 * @param actCustZipCd
	 */
	public void setActCustZipCd(String actCustZipCd) {
		this.actCustZipCd = actCustZipCd;
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
	 * @param actCustN1stAddr
	 */
	public void setActCustN1stAddr(String actCustN1stAddr) {
		this.actCustN1stAddr = actCustN1stAddr;
	}
	
	/**
	 * Column Info
	 * @param actCustSteNm
	 */
	public void setActCustSteNm(String actCustSteNm) {
		this.actCustSteNm = actCustSteNm;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonPhnNo
	 */
	public void setCntcPsonPhnNo(String cntcPsonPhnNo) {
		this.cntcPsonPhnNo = cntcPsonPhnNo;
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
	 * @param cntcPsonFaxNo
	 */
	public void setCntcPsonFaxNo(String cntcPsonFaxNo) {
		this.cntcPsonFaxNo = cntcPsonFaxNo;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param fctryNm
	 */
	public void setFctryNm(String fctryNm) {
		this.fctryNm = fctryNm;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonNm
	 */
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param actCustN2ndAddr
	 */
	public void setActCustN2ndAddr(String actCustN2ndAddr) {
		this.actCustN2ndAddr = actCustN2ndAddr;
	}
	
	/**
	 * Column Info
	 * @param usrEml
	 */
	public void setUsrEml(String usrEml) {
		this.usrEml = usrEml;
	}
	
	/**
	 * Column Info
	 * @param ifSysKndCd
	 */
	public void setIfSysKndCd(String ifSysKndCd) {
		this.ifSysKndCd = ifSysKndCd;
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
		setUsrPhnNo(JSPUtil.getParameter(request, "usr_phn_no", ""));
		setActCustCtyNm(JSPUtil.getParameter(request, "act_cust_cty_nm", ""));
		setActCustZipCd(JSPUtil.getParameter(request, "act_cust_zip_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setActCustN1stAddr(JSPUtil.getParameter(request, "act_cust_n1st_addr", ""));
		setActCustSteNm(JSPUtil.getParameter(request, "act_cust_ste_nm", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setCntcPsonPhnNo(JSPUtil.getParameter(request, "cntc_pson_phn_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntcPsonFaxNo(JSPUtil.getParameter(request, "cntc_pson_fax_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFctryNm(JSPUtil.getParameter(request, "fctry_nm", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setActCustN2ndAddr(JSPUtil.getParameter(request, "act_cust_n2nd_addr", ""));
		setUsrEml(JSPUtil.getParameter(request, "usr_eml", ""));
		setIfSysKndCd(JSPUtil.getParameter(request, "if_sys_knd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspUsaDoHdrVO[]
	 */
	public TrsTrspUsaDoHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspUsaDoHdrVO[]
	 */
	public TrsTrspUsaDoHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspUsaDoHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] usrPhnNo = (JSPUtil.getParameter(request, prefix	+ "usr_phn_no", length));
			String[] actCustCtyNm = (JSPUtil.getParameter(request, prefix	+ "act_cust_cty_nm", length));
			String[] actCustZipCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_zip_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] actCustN1stAddr = (JSPUtil.getParameter(request, prefix	+ "act_cust_n1st_addr", length));
			String[] actCustSteNm = (JSPUtil.getParameter(request, prefix	+ "act_cust_ste_nm", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] cntcPsonPhnNo = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_phn_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntcPsonFaxNo = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_fax_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fctryNm = (JSPUtil.getParameter(request, prefix	+ "fctry_nm", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm", length));
			String[] actCustN2ndAddr = (JSPUtil.getParameter(request, prefix	+ "act_cust_n2nd_addr", length));
			String[] usrEml = (JSPUtil.getParameter(request, prefix	+ "usr_eml", length));
			String[] ifSysKndCd = (JSPUtil.getParameter(request, prefix	+ "if_sys_knd_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspUsaDoHdrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (usrPhnNo[i] != null)
					model.setUsrPhnNo(usrPhnNo[i]);
				if (actCustCtyNm[i] != null)
					model.setActCustCtyNm(actCustCtyNm[i]);
				if (actCustZipCd[i] != null)
					model.setActCustZipCd(actCustZipCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actCustN1stAddr[i] != null)
					model.setActCustN1stAddr(actCustN1stAddr[i]);
				if (actCustSteNm[i] != null)
					model.setActCustSteNm(actCustSteNm[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (cntcPsonPhnNo[i] != null)
					model.setCntcPsonPhnNo(cntcPsonPhnNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntcPsonFaxNo[i] != null)
					model.setCntcPsonFaxNo(cntcPsonFaxNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fctryNm[i] != null)
					model.setFctryNm(fctryNm[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (actCustN2ndAddr[i] != null)
					model.setActCustN2ndAddr(actCustN2ndAddr[i]);
				if (usrEml[i] != null)
					model.setUsrEml(usrEml[i]);
				if (ifSysKndCd[i] != null)
					model.setIfSysKndCd(ifSysKndCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspUsaDoHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspUsaDoHdrVO[]
	 */
	public TrsTrspUsaDoHdrVO[] getTrsTrspUsaDoHdrVOs(){
		TrsTrspUsaDoHdrVO[] vos = (TrsTrspUsaDoHdrVO[])models.toArray(new TrsTrspUsaDoHdrVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrPhnNo = this.usrPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCtyNm = this.actCustCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustZipCd = this.actCustZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustN1stAddr = this.actCustN1stAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSteNm = this.actCustSteNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonPhnNo = this.cntcPsonPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonFaxNo = this.cntcPsonFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fctryNm = this.fctryNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustN2ndAddr = this.actCustN2ndAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrEml = this.usrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSysKndCd = this.ifSysKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
