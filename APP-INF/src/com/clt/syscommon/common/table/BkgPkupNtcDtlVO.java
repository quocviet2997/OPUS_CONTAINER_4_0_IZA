/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgPkupNtcDtlVO.java
*@FileTitle : BkgPkupNtcDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.08
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.10.08 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgPkupNtcDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgPkupNtcDtlVO> models = new ArrayList<BkgPkupNtcDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String emlSndDt = null;
	/* Column Info */
	private String faxSndGdt = null;
	/* Column Info */
	private String custCntcTpCd = null;
	/* Column Info */
	private String faxTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String emlSndGdt = null;
	/* Column Info */
	private String faxSndUsrId = null;
	/* Column Info */
	private String emlNtcSndId = null;
	/* Column Info */
	private String emlSndUsrId = null;
	/* Column Info */
	private String emlTpCd = null;
	/* Column Info */
	private String ntcSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ntcEml = null;
	/* Column Info */
	private String faxNtcSndRsltCd = null;
	/* Column Info */
	private String faxNtcSndId = null;
	/* Column Info */
	private String emlNtcSndRsltCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String faxSndDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String showPuFlg = null;	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgPkupNtcDtlVO() {}

	public BkgPkupNtcDtlVO(String ibflag, String pagerows, String bkgNo, String ntcSeq, String custCntcTpCd, String faxNo, String faxTpCd, String faxSndDt, String faxSndGdt, String faxSndUsrId, String faxNtcSndId, String faxNtcSndRsltCd, String ntcEml, String emlTpCd, String emlSndDt, String emlSndGdt, String emlSndUsrId, String emlNtcSndId, String emlNtcSndRsltCd, String creUsrId, String creDt, String updUsrId, String updDt, String showPuFlg) {
		this.updDt = updDt;
		this.emlSndDt = emlSndDt;
		this.faxSndGdt = faxSndGdt;
		this.custCntcTpCd = custCntcTpCd;
		this.faxTpCd = faxTpCd;
		this.creDt = creDt;
		this.emlSndGdt = emlSndGdt;
		this.faxSndUsrId = faxSndUsrId;
		this.emlNtcSndId = emlNtcSndId;
		this.emlSndUsrId = emlSndUsrId;
		this.emlTpCd = emlTpCd;
		this.ntcSeq = ntcSeq;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.ntcEml = ntcEml;
		this.faxNtcSndRsltCd = faxNtcSndRsltCd;
		this.faxNtcSndId = faxNtcSndId;
		this.emlNtcSndRsltCd = emlNtcSndRsltCd;
		this.faxNo = faxNo;
		this.faxSndDt = faxSndDt;
		this.updUsrId = updUsrId;
		this.showPuFlg = showPuFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("eml_snd_dt", getEmlSndDt());
		this.hashColumns.put("fax_snd_gdt", getFaxSndGdt());
		this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
		this.hashColumns.put("fax_tp_cd", getFaxTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eml_snd_gdt", getEmlSndGdt());
		this.hashColumns.put("fax_snd_usr_id", getFaxSndUsrId());
		this.hashColumns.put("eml_ntc_snd_id", getEmlNtcSndId());
		this.hashColumns.put("eml_snd_usr_id", getEmlSndUsrId());
		this.hashColumns.put("eml_tp_cd", getEmlTpCd());
		this.hashColumns.put("ntc_seq", getNtcSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ntc_eml", getNtcEml());
		this.hashColumns.put("fax_ntc_snd_rslt_cd", getFaxNtcSndRsltCd());
		this.hashColumns.put("fax_ntc_snd_id", getFaxNtcSndId());
		this.hashColumns.put("eml_ntc_snd_rslt_cd", getEmlNtcSndRsltCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("fax_snd_dt", getFaxSndDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("show_pu_flg", getShowPuFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("eml_snd_dt", "emlSndDt");
		this.hashFields.put("fax_snd_gdt", "faxSndGdt");
		this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
		this.hashFields.put("fax_tp_cd", "faxTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eml_snd_gdt", "emlSndGdt");
		this.hashFields.put("fax_snd_usr_id", "faxSndUsrId");
		this.hashFields.put("eml_ntc_snd_id", "emlNtcSndId");
		this.hashFields.put("eml_snd_usr_id", "emlSndUsrId");
		this.hashFields.put("eml_tp_cd", "emlTpCd");
		this.hashFields.put("ntc_seq", "ntcSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ntc_eml", "ntcEml");
		this.hashFields.put("fax_ntc_snd_rslt_cd", "faxNtcSndRsltCd");
		this.hashFields.put("fax_ntc_snd_id", "faxNtcSndId");
		this.hashFields.put("eml_ntc_snd_rslt_cd", "emlNtcSndRsltCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("fax_snd_dt", "faxSndDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("show_pu_flg", "showPuFlg");
		return this.hashFields;
	}

	/**
	 * Column Info
	 * @return showPuFlg
	 */
	public String getShowPuFlg() {
		return this.showPuFlg;
	}
	
	/**
	 * Column Info
	 * @param showPuFlg
	 */
	public void setShowPuFlg(String showPuFlg) {
		this.showPuFlg = showPuFlg;
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
	 * @return emlSndDt
	 */
	public String getEmlSndDt() {
		return this.emlSndDt;
	}
	
	/**
	 * Column Info
	 * @return faxSndGdt
	 */
	public String getFaxSndGdt() {
		return this.faxSndGdt;
	}
	
	/**
	 * Column Info
	 * @return custCntcTpCd
	 */
	public String getCustCntcTpCd() {
		return this.custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @return faxTpCd
	 */
	public String getFaxTpCd() {
		return this.faxTpCd;
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
	 * @return emlSndGdt
	 */
	public String getEmlSndGdt() {
		return this.emlSndGdt;
	}
	
	/**
	 * Column Info
	 * @return faxSndUsrId
	 */
	public String getFaxSndUsrId() {
		return this.faxSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return emlNtcSndId
	 */
	public String getEmlNtcSndId() {
		return this.emlNtcSndId;
	}
	
	/**
	 * Column Info
	 * @return emlSndUsrId
	 */
	public String getEmlSndUsrId() {
		return this.emlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return emlTpCd
	 */
	public String getEmlTpCd() {
		return this.emlTpCd;
	}
	
	/**
	 * Column Info
	 * @return ntcSeq
	 */
	public String getNtcSeq() {
		return this.ntcSeq;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return ntcEml
	 */
	public String getNtcEml() {
		return this.ntcEml;
	}
	
	/**
	 * Column Info
	 * @return faxNtcSndRsltCd
	 */
	public String getFaxNtcSndRsltCd() {
		return this.faxNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @return faxNtcSndId
	 */
	public String getFaxNtcSndId() {
		return this.faxNtcSndId;
	}
	
	/**
	 * Column Info
	 * @return emlNtcSndRsltCd
	 */
	public String getEmlNtcSndRsltCd() {
		return this.emlNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	
	/**
	 * Column Info
	 * @return faxSndDt
	 */
	public String getFaxSndDt() {
		return this.faxSndDt;
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
	 * @param emlSndDt
	 */
	public void setEmlSndDt(String emlSndDt) {
		this.emlSndDt = emlSndDt;
	}
	
	/**
	 * Column Info
	 * @param faxSndGdt
	 */
	public void setFaxSndGdt(String faxSndGdt) {
		this.faxSndGdt = faxSndGdt;
	}
	
	/**
	 * Column Info
	 * @param custCntcTpCd
	 */
	public void setCustCntcTpCd(String custCntcTpCd) {
		this.custCntcTpCd = custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @param faxTpCd
	 */
	public void setFaxTpCd(String faxTpCd) {
		this.faxTpCd = faxTpCd;
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
	 * @param emlSndGdt
	 */
	public void setEmlSndGdt(String emlSndGdt) {
		this.emlSndGdt = emlSndGdt;
	}
	
	/**
	 * Column Info
	 * @param faxSndUsrId
	 */
	public void setFaxSndUsrId(String faxSndUsrId) {
		this.faxSndUsrId = faxSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param emlNtcSndId
	 */
	public void setEmlNtcSndId(String emlNtcSndId) {
		this.emlNtcSndId = emlNtcSndId;
	}
	
	/**
	 * Column Info
	 * @param emlSndUsrId
	 */
	public void setEmlSndUsrId(String emlSndUsrId) {
		this.emlSndUsrId = emlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param emlTpCd
	 */
	public void setEmlTpCd(String emlTpCd) {
		this.emlTpCd = emlTpCd;
	}
	
	/**
	 * Column Info
	 * @param ntcSeq
	 */
	public void setNtcSeq(String ntcSeq) {
		this.ntcSeq = ntcSeq;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param ntcEml
	 */
	public void setNtcEml(String ntcEml) {
		this.ntcEml = ntcEml;
	}
	
	/**
	 * Column Info
	 * @param faxNtcSndRsltCd
	 */
	public void setFaxNtcSndRsltCd(String faxNtcSndRsltCd) {
		this.faxNtcSndRsltCd = faxNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @param faxNtcSndId
	 */
	public void setFaxNtcSndId(String faxNtcSndId) {
		this.faxNtcSndId = faxNtcSndId;
	}
	
	/**
	 * Column Info
	 * @param emlNtcSndRsltCd
	 */
	public void setEmlNtcSndRsltCd(String emlNtcSndRsltCd) {
		this.emlNtcSndRsltCd = emlNtcSndRsltCd;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Column Info
	 * @param faxSndDt
	 */
	public void setFaxSndDt(String faxSndDt) {
		this.faxSndDt = faxSndDt;
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
		setEmlSndDt(JSPUtil.getParameter(request, "eml_snd_dt", ""));
		setFaxSndGdt(JSPUtil.getParameter(request, "fax_snd_gdt", ""));
		setCustCntcTpCd(JSPUtil.getParameter(request, "cust_cntc_tp_cd", ""));
		setFaxTpCd(JSPUtil.getParameter(request, "fax_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEmlSndGdt(JSPUtil.getParameter(request, "eml_snd_gdt", ""));
		setFaxSndUsrId(JSPUtil.getParameter(request, "fax_snd_usr_id", ""));
		setEmlNtcSndId(JSPUtil.getParameter(request, "eml_ntc_snd_id", ""));
		setEmlSndUsrId(JSPUtil.getParameter(request, "eml_snd_usr_id", ""));
		setEmlTpCd(JSPUtil.getParameter(request, "eml_tp_cd", ""));
		setNtcSeq(JSPUtil.getParameter(request, "ntc_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setNtcEml(JSPUtil.getParameter(request, "ntc_eml", ""));
		setFaxNtcSndRsltCd(JSPUtil.getParameter(request, "fax_ntc_snd_rslt_cd", ""));
		setFaxNtcSndId(JSPUtil.getParameter(request, "fax_ntc_snd_id", ""));
		setEmlNtcSndRsltCd(JSPUtil.getParameter(request, "eml_ntc_snd_rslt_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setFaxSndDt(JSPUtil.getParameter(request, "fax_snd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setShowPuFlg(JSPUtil.getParameter(request, "show_pu_flg", ""));		
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgPkupNtcDtlVO[]
	 */
	public BkgPkupNtcDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgPkupNtcDtlVO[]
	 */
	public BkgPkupNtcDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgPkupNtcDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] emlSndDt = (JSPUtil.getParameter(request, prefix	+ "eml_snd_dt", length));
			String[] faxSndGdt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_gdt", length));
			String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_cntc_tp_cd", length));
			String[] faxTpCd = (JSPUtil.getParameter(request, prefix	+ "fax_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] emlSndGdt = (JSPUtil.getParameter(request, prefix	+ "eml_snd_gdt", length));
			String[] faxSndUsrId = (JSPUtil.getParameter(request, prefix	+ "fax_snd_usr_id", length));
			String[] emlNtcSndId = (JSPUtil.getParameter(request, prefix	+ "eml_ntc_snd_id", length));
			String[] emlSndUsrId = (JSPUtil.getParameter(request, prefix	+ "eml_snd_usr_id", length));
			String[] emlTpCd = (JSPUtil.getParameter(request, prefix	+ "eml_tp_cd", length));
			String[] ntcSeq = (JSPUtil.getParameter(request, prefix	+ "ntc_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ntcEml = (JSPUtil.getParameter(request, prefix	+ "ntc_eml", length));
			String[] faxNtcSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "fax_ntc_snd_rslt_cd", length));
			String[] faxNtcSndId = (JSPUtil.getParameter(request, prefix	+ "fax_ntc_snd_id", length));
			String[] emlNtcSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "eml_ntc_snd_rslt_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] faxSndDt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] showPuFlg = (JSPUtil.getParameter(request, prefix	+ "show_pu_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgPkupNtcDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (emlSndDt[i] != null)
					model.setEmlSndDt(emlSndDt[i]);
				if (faxSndGdt[i] != null)
					model.setFaxSndGdt(faxSndGdt[i]);
				if (custCntcTpCd[i] != null)
					model.setCustCntcTpCd(custCntcTpCd[i]);
				if (faxTpCd[i] != null)
					model.setFaxTpCd(faxTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (emlSndGdt[i] != null)
					model.setEmlSndGdt(emlSndGdt[i]);
				if (faxSndUsrId[i] != null)
					model.setFaxSndUsrId(faxSndUsrId[i]);
				if (emlNtcSndId[i] != null)
					model.setEmlNtcSndId(emlNtcSndId[i]);
				if (emlSndUsrId[i] != null)
					model.setEmlSndUsrId(emlSndUsrId[i]);
				if (emlTpCd[i] != null)
					model.setEmlTpCd(emlTpCd[i]);
				if (ntcSeq[i] != null)
					model.setNtcSeq(ntcSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ntcEml[i] != null)
					model.setNtcEml(ntcEml[i]);
				if (faxNtcSndRsltCd[i] != null)
					model.setFaxNtcSndRsltCd(faxNtcSndRsltCd[i]);
				if (faxNtcSndId[i] != null)
					model.setFaxNtcSndId(faxNtcSndId[i]);
				if (emlNtcSndRsltCd[i] != null)
					model.setEmlNtcSndRsltCd(emlNtcSndRsltCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (faxSndDt[i] != null)
					model.setFaxSndDt(faxSndDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (showPuFlg[i] != null)
					model.setShowPuFlg(showPuFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgPkupNtcDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgPkupNtcDtlVO[]
	 */
	public BkgPkupNtcDtlVO[] getBkgPkupNtcDtlVOs(){
		BkgPkupNtcDtlVO[] vos = (BkgPkupNtcDtlVO[])models.toArray(new BkgPkupNtcDtlVO[models.size()]);
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
		this.emlSndDt = this.emlSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndGdt = this.faxSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntcTpCd = this.custCntcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxTpCd = this.faxTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndGdt = this.emlSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndUsrId = this.faxSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlNtcSndId = this.emlNtcSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndUsrId = this.emlSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTpCd = this.emlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcSeq = this.ntcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEml = this.ntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNtcSndRsltCd = this.faxNtcSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNtcSndId = this.faxNtcSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlNtcSndRsltCd = this.emlNtcSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndDt = this.faxSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.showPuFlg = this.showPuFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
