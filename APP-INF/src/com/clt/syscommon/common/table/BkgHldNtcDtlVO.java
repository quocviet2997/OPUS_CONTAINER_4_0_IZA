/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHldNtcDtlVO.java
*@FileTitle : BkgHldNtcDtlVO
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

public class BkgHldNtcDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHldNtcDtlVO> models = new ArrayList<BkgHldNtcDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hldEmlSndId = null;
	/* Column Info */
	private String hldEmlSndDt = null;
	/* Column Info */
	private String custCntcTpCd = null;
	/* Column Info */
	private String faxTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hldFaxSndId = null;
	/* Column Info */
	private String emlTpCd = null;
	/* Column Info */
	private String ntcSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String hldFaxSndDt = null;
	/* Column Info */
	private String hldEmlSndGdt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ntcEml = null;
	/* Column Info */
	private String hldFaxSndGdt = null;
	/* Column Info */
	private String hldFaxSndRsltCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String hldEmlSndUsrId = null;
	/* Column Info */
	private String hldFaxSndUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hldEmlSndRsltCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHldNtcDtlVO() {}

	public BkgHldNtcDtlVO(String ibflag, String pagerows, String bkgNo, String ntcSeq, String custCntcTpCd, String faxNo, String faxTpCd, String hldFaxSndDt, String hldFaxSndGdt, String hldFaxSndUsrId, String hldFaxSndId, String hldFaxSndRsltCd, String ntcEml, String emlTpCd, String hldEmlSndDt, String hldEmlSndGdt, String hldEmlSndUsrId, String hldEmlSndId, String hldEmlSndRsltCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.hldEmlSndId = hldEmlSndId;
		this.hldEmlSndDt = hldEmlSndDt;
		this.custCntcTpCd = custCntcTpCd;
		this.faxTpCd = faxTpCd;
		this.creDt = creDt;
		this.hldFaxSndId = hldFaxSndId;
		this.emlTpCd = emlTpCd;
		this.ntcSeq = ntcSeq;
		this.pagerows = pagerows;
		this.hldFaxSndDt = hldFaxSndDt;
		this.hldEmlSndGdt = hldEmlSndGdt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.ntcEml = ntcEml;
		this.hldFaxSndGdt = hldFaxSndGdt;
		this.hldFaxSndRsltCd = hldFaxSndRsltCd;
		this.faxNo = faxNo;
		this.hldEmlSndUsrId = hldEmlSndUsrId;
		this.hldFaxSndUsrId = hldFaxSndUsrId;
		this.updUsrId = updUsrId;
		this.hldEmlSndRsltCd = hldEmlSndRsltCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hld_eml_snd_id", getHldEmlSndId());
		this.hashColumns.put("hld_eml_snd_dt", getHldEmlSndDt());
		this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
		this.hashColumns.put("fax_tp_cd", getFaxTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("hld_fax_snd_id", getHldFaxSndId());
		this.hashColumns.put("eml_tp_cd", getEmlTpCd());
		this.hashColumns.put("ntc_seq", getNtcSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("hld_fax_snd_dt", getHldFaxSndDt());
		this.hashColumns.put("hld_eml_snd_gdt", getHldEmlSndGdt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ntc_eml", getNtcEml());
		this.hashColumns.put("hld_fax_snd_gdt", getHldFaxSndGdt());
		this.hashColumns.put("hld_fax_snd_rslt_cd", getHldFaxSndRsltCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("hld_eml_snd_usr_id", getHldEmlSndUsrId());
		this.hashColumns.put("hld_fax_snd_usr_id", getHldFaxSndUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hld_eml_snd_rslt_cd", getHldEmlSndRsltCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hld_eml_snd_id", "hldEmlSndId");
		this.hashFields.put("hld_eml_snd_dt", "hldEmlSndDt");
		this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
		this.hashFields.put("fax_tp_cd", "faxTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("hld_fax_snd_id", "hldFaxSndId");
		this.hashFields.put("eml_tp_cd", "emlTpCd");
		this.hashFields.put("ntc_seq", "ntcSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("hld_fax_snd_dt", "hldFaxSndDt");
		this.hashFields.put("hld_eml_snd_gdt", "hldEmlSndGdt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ntc_eml", "ntcEml");
		this.hashFields.put("hld_fax_snd_gdt", "hldFaxSndGdt");
		this.hashFields.put("hld_fax_snd_rslt_cd", "hldFaxSndRsltCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("hld_eml_snd_usr_id", "hldEmlSndUsrId");
		this.hashFields.put("hld_fax_snd_usr_id", "hldFaxSndUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hld_eml_snd_rslt_cd", "hldEmlSndRsltCd");
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
	 * @return hldEmlSndId
	 */
	public String getHldEmlSndId() {
		return this.hldEmlSndId;
	}
	
	/**
	 * Column Info
	 * @return hldEmlSndDt
	 */
	public String getHldEmlSndDt() {
		return this.hldEmlSndDt;
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
	 * @return hldFaxSndId
	 */
	public String getHldFaxSndId() {
		return this.hldFaxSndId;
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
	 * @return hldFaxSndDt
	 */
	public String getHldFaxSndDt() {
		return this.hldFaxSndDt;
	}
	
	/**
	 * Column Info
	 * @return hldEmlSndGdt
	 */
	public String getHldEmlSndGdt() {
		return this.hldEmlSndGdt;
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
	 * @return hldFaxSndGdt
	 */
	public String getHldFaxSndGdt() {
		return this.hldFaxSndGdt;
	}
	
	/**
	 * Column Info
	 * @return hldFaxSndRsltCd
	 */
	public String getHldFaxSndRsltCd() {
		return this.hldFaxSndRsltCd;
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
	 * @return hldEmlSndUsrId
	 */
	public String getHldEmlSndUsrId() {
		return this.hldEmlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return hldFaxSndUsrId
	 */
	public String getHldFaxSndUsrId() {
		return this.hldFaxSndUsrId;
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
	 * @return hldEmlSndRsltCd
	 */
	public String getHldEmlSndRsltCd() {
		return this.hldEmlSndRsltCd;
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
	 * @param hldEmlSndId
	 */
	public void setHldEmlSndId(String hldEmlSndId) {
		this.hldEmlSndId = hldEmlSndId;
	}
	
	/**
	 * Column Info
	 * @param hldEmlSndDt
	 */
	public void setHldEmlSndDt(String hldEmlSndDt) {
		this.hldEmlSndDt = hldEmlSndDt;
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
	 * @param hldFaxSndId
	 */
	public void setHldFaxSndId(String hldFaxSndId) {
		this.hldFaxSndId = hldFaxSndId;
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
	 * @param hldFaxSndDt
	 */
	public void setHldFaxSndDt(String hldFaxSndDt) {
		this.hldFaxSndDt = hldFaxSndDt;
	}
	
	/**
	 * Column Info
	 * @param hldEmlSndGdt
	 */
	public void setHldEmlSndGdt(String hldEmlSndGdt) {
		this.hldEmlSndGdt = hldEmlSndGdt;
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
	 * @param hldFaxSndGdt
	 */
	public void setHldFaxSndGdt(String hldFaxSndGdt) {
		this.hldFaxSndGdt = hldFaxSndGdt;
	}
	
	/**
	 * Column Info
	 * @param hldFaxSndRsltCd
	 */
	public void setHldFaxSndRsltCd(String hldFaxSndRsltCd) {
		this.hldFaxSndRsltCd = hldFaxSndRsltCd;
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
	 * @param hldEmlSndUsrId
	 */
	public void setHldEmlSndUsrId(String hldEmlSndUsrId) {
		this.hldEmlSndUsrId = hldEmlSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param hldFaxSndUsrId
	 */
	public void setHldFaxSndUsrId(String hldFaxSndUsrId) {
		this.hldFaxSndUsrId = hldFaxSndUsrId;
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
	 * @param hldEmlSndRsltCd
	 */
	public void setHldEmlSndRsltCd(String hldEmlSndRsltCd) {
		this.hldEmlSndRsltCd = hldEmlSndRsltCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHldEmlSndId(JSPUtil.getParameter(request, "hld_eml_snd_id", ""));
		setHldEmlSndDt(JSPUtil.getParameter(request, "hld_eml_snd_dt", ""));
		setCustCntcTpCd(JSPUtil.getParameter(request, "cust_cntc_tp_cd", ""));
		setFaxTpCd(JSPUtil.getParameter(request, "fax_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setHldFaxSndId(JSPUtil.getParameter(request, "hld_fax_snd_id", ""));
		setEmlTpCd(JSPUtil.getParameter(request, "eml_tp_cd", ""));
		setNtcSeq(JSPUtil.getParameter(request, "ntc_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setHldFaxSndDt(JSPUtil.getParameter(request, "hld_fax_snd_dt", ""));
		setHldEmlSndGdt(JSPUtil.getParameter(request, "hld_eml_snd_gdt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setNtcEml(JSPUtil.getParameter(request, "ntc_eml", ""));
		setHldFaxSndGdt(JSPUtil.getParameter(request, "hld_fax_snd_gdt", ""));
		setHldFaxSndRsltCd(JSPUtil.getParameter(request, "hld_fax_snd_rslt_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setHldEmlSndUsrId(JSPUtil.getParameter(request, "hld_eml_snd_usr_id", ""));
		setHldFaxSndUsrId(JSPUtil.getParameter(request, "hld_fax_snd_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHldEmlSndRsltCd(JSPUtil.getParameter(request, "hld_eml_snd_rslt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHldNtcDtlVO[]
	 */
	public BkgHldNtcDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHldNtcDtlVO[]
	 */
	public BkgHldNtcDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHldNtcDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hldEmlSndId = (JSPUtil.getParameter(request, prefix	+ "hld_eml_snd_id", length));
			String[] hldEmlSndDt = (JSPUtil.getParameter(request, prefix	+ "hld_eml_snd_dt", length));
			String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_cntc_tp_cd", length));
			String[] faxTpCd = (JSPUtil.getParameter(request, prefix	+ "fax_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] hldFaxSndId = (JSPUtil.getParameter(request, prefix	+ "hld_fax_snd_id", length));
			String[] emlTpCd = (JSPUtil.getParameter(request, prefix	+ "eml_tp_cd", length));
			String[] ntcSeq = (JSPUtil.getParameter(request, prefix	+ "ntc_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] hldFaxSndDt = (JSPUtil.getParameter(request, prefix	+ "hld_fax_snd_dt", length));
			String[] hldEmlSndGdt = (JSPUtil.getParameter(request, prefix	+ "hld_eml_snd_gdt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ntcEml = (JSPUtil.getParameter(request, prefix	+ "ntc_eml", length));
			String[] hldFaxSndGdt = (JSPUtil.getParameter(request, prefix	+ "hld_fax_snd_gdt", length));
			String[] hldFaxSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "hld_fax_snd_rslt_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] hldEmlSndUsrId = (JSPUtil.getParameter(request, prefix	+ "hld_eml_snd_usr_id", length));
			String[] hldFaxSndUsrId = (JSPUtil.getParameter(request, prefix	+ "hld_fax_snd_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] hldEmlSndRsltCd = (JSPUtil.getParameter(request, prefix	+ "hld_eml_snd_rslt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHldNtcDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hldEmlSndId[i] != null)
					model.setHldEmlSndId(hldEmlSndId[i]);
				if (hldEmlSndDt[i] != null)
					model.setHldEmlSndDt(hldEmlSndDt[i]);
				if (custCntcTpCd[i] != null)
					model.setCustCntcTpCd(custCntcTpCd[i]);
				if (faxTpCd[i] != null)
					model.setFaxTpCd(faxTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hldFaxSndId[i] != null)
					model.setHldFaxSndId(hldFaxSndId[i]);
				if (emlTpCd[i] != null)
					model.setEmlTpCd(emlTpCd[i]);
				if (ntcSeq[i] != null)
					model.setNtcSeq(ntcSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (hldFaxSndDt[i] != null)
					model.setHldFaxSndDt(hldFaxSndDt[i]);
				if (hldEmlSndGdt[i] != null)
					model.setHldEmlSndGdt(hldEmlSndGdt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ntcEml[i] != null)
					model.setNtcEml(ntcEml[i]);
				if (hldFaxSndGdt[i] != null)
					model.setHldFaxSndGdt(hldFaxSndGdt[i]);
				if (hldFaxSndRsltCd[i] != null)
					model.setHldFaxSndRsltCd(hldFaxSndRsltCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (hldEmlSndUsrId[i] != null)
					model.setHldEmlSndUsrId(hldEmlSndUsrId[i]);
				if (hldFaxSndUsrId[i] != null)
					model.setHldFaxSndUsrId(hldFaxSndUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hldEmlSndRsltCd[i] != null)
					model.setHldEmlSndRsltCd(hldEmlSndRsltCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHldNtcDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHldNtcDtlVO[]
	 */
	public BkgHldNtcDtlVO[] getBkgHldNtcDtlVOs(){
		BkgHldNtcDtlVO[] vos = (BkgHldNtcDtlVO[])models.toArray(new BkgHldNtcDtlVO[models.size()]);
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
		this.hldEmlSndId = this.hldEmlSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldEmlSndDt = this.hldEmlSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntcTpCd = this.custCntcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxTpCd = this.faxTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldFaxSndId = this.hldFaxSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTpCd = this.emlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcSeq = this.ntcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldFaxSndDt = this.hldFaxSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldEmlSndGdt = this.hldEmlSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEml = this.ntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldFaxSndGdt = this.hldFaxSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldFaxSndRsltCd = this.hldFaxSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldEmlSndUsrId = this.hldEmlSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldFaxSndUsrId = this.hldFaxSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldEmlSndRsltCd = this.hldEmlSndRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
