/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspUsaActCustDtlVO.java
*@FileTitle : TrsTrspUsaActCustDtlVO
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

public class TrsTrspUsaActCustDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspUsaActCustDtlVO> models = new ArrayList<TrsTrspUsaActCustDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dfltActCustFlg = null;
	/* Column Info */
	private String trspActCustNo = null;
	/* Column Info */
	private String actCustAddr = null;
	/* Column Info */
	private String actCustEml = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String deltOfcCd = null;
	/* Column Info */
	private String actCustZipCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deltDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspActCustSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String actCustFaxNo = null;
	/* Column Info */
	private String actCustNm = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String actCustRmk = null;
	/* Column Info */
	private String actCustPhnNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String deltUsrId = null;
	/* Column Info */
	private String actCustCntCd = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String actCustBndCd = null;
	/* Column Info */
	private String dorNodCd = null;
	/* Column Info */
	private String ifSysKndCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspUsaActCustDtlVO() {}

	public TrsTrspUsaActCustDtlVO(String ibflag, String pagerows, String trspActCustNo, String trspActCustSeq, String actCustNm, String actCustZipCd, String actCustAddr, String actCustPhnNo, String actCustFaxNo, String cntcPsonNm, 
							String actCustEml, String actCustRmk, String creOfcCd, String deltUsrId, String deltDt, String deltOfcCd, String deltFlg, String dfltActCustFlg, String creUsrId, String creDt, String updUsrId, String updDt,
							String actCustCntCd, String actCustSeq, String actCustBndCd, String dorNodCd, String ifSysKndCd) {
		this.updDt = updDt;
		this.dfltActCustFlg = dfltActCustFlg;
		this.trspActCustNo = trspActCustNo;
		this.actCustAddr = actCustAddr;
		this.actCustEml = actCustEml;
		this.deltFlg = deltFlg;
		this.deltOfcCd = deltOfcCd;
		this.actCustZipCd = actCustZipCd;
		this.creDt = creDt;
		this.deltDt = deltDt;
		this.pagerows = pagerows;
		this.trspActCustSeq = trspActCustSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.actCustFaxNo = actCustFaxNo;
		this.actCustNm = actCustNm;
		this.cntcPsonNm = cntcPsonNm;
		this.creOfcCd = creOfcCd;
		this.actCustRmk = actCustRmk;
		this.actCustPhnNo = actCustPhnNo;
		this.updUsrId = updUsrId;
		this.deltUsrId = deltUsrId;
		this.actCustCntCd = actCustCntCd;
		this.actCustSeq = actCustSeq;
		this.actCustBndCd = actCustBndCd;
		this.dorNodCd = dorNodCd;
		this.ifSysKndCd = ifSysKndCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dflt_act_cust_flg", getDfltActCustFlg());
		this.hashColumns.put("trsp_act_cust_no", getTrspActCustNo());
		this.hashColumns.put("act_cust_addr", getActCustAddr());
		this.hashColumns.put("act_cust_eml", getActCustEml());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("delt_ofc_cd", getDeltOfcCd());
		this.hashColumns.put("act_cust_zip_cd", getActCustZipCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_act_cust_seq", getTrspActCustSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("act_cust_fax_no", getActCustFaxNo());
		this.hashColumns.put("act_cust_nm", getActCustNm());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("act_cust_rmk", getActCustRmk());
		this.hashColumns.put("act_cust_phn_no", getActCustPhnNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("act_cust_bnd_cd", getActCustBndCd());
		this.hashColumns.put("dor_nod_cd", getDorNodCd());
		this.hashColumns.put("if_sys_knd_cd", getIfSysKndCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dflt_act_cust_flg", "dfltActCustFlg");
		this.hashFields.put("trsp_act_cust_no", "trspActCustNo");
		this.hashFields.put("act_cust_addr", "actCustAddr");
		this.hashFields.put("act_cust_eml", "actCustEml");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("delt_ofc_cd", "deltOfcCd");
		this.hashFields.put("act_cust_zip_cd", "actCustZipCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_act_cust_seq", "trspActCustSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("act_cust_fax_no", "actCustFaxNo");
		this.hashFields.put("act_cust_nm", "actCustNm");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("act_cust_rmk", "actCustRmk");
		this.hashFields.put("act_cust_phn_no", "actCustPhnNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("delt_usr_id", "deltUsrId");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("act_cust_bnd_cd", "actCustBndCd");
		this.hashFields.put("dor_nod_cd", "dorNodCd");
		this.hashFields.put("if_sys_knd_cd", "ifSysKndCd");
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
	 * @return dfltActCustFlg
	 */
	public String getDfltActCustFlg() {
		return this.dfltActCustFlg;
	}
	
	/**
	 * Column Info
	 * @return trspActCustNo
	 */
	public String getTrspActCustNo() {
		return this.trspActCustNo;
	}
	
	/**
	 * Column Info
	 * @return actCustAddr
	 */
	public String getActCustAddr() {
		return this.actCustAddr;
	}
	
	/**
	 * Column Info
	 * @return actCustEml
	 */
	public String getActCustEml() {
		return this.actCustEml;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return deltOfcCd
	 */
	public String getDeltOfcCd() {
		return this.deltOfcCd;
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
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
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
	 * @return trspActCustSeq
	 */
	public String getTrspActCustSeq() {
		return this.trspActCustSeq;
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
	 * @return actCustFaxNo
	 */
	public String getActCustFaxNo() {
		return this.actCustFaxNo;
	}
	
	/**
	 * Column Info
	 * @return actCustNm
	 */
	public String getActCustNm() {
		return this.actCustNm;
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
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return actCustRmk
	 */
	public String getActCustRmk() {
		return this.actCustRmk;
	}
	
	/**
	 * Column Info
	 * @return actCustPhnNo
	 */
	public String getActCustPhnNo() {
		return this.actCustPhnNo;
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
	 * @return deltUsrId
	 */
	public String getDeltUsrId() {
		return this.deltUsrId;
	}
	
	/**
	 * Column Info
	 * @return actCustCntCd
	 */
	public String getActCustCntCd() {
		return actCustCntCd;
	}

	/**
	 * Column Info
	 * @return actCustSeq
	 */
	public String getActCustSeq() {
		return actCustSeq;
	}
	
	/**
	 * Column Info
	 * @return actCustBndCd
	 */
	public String getActCustBndCd() {
		return actCustBndCd;
	}
	
	/**
	 * Column Info
	 * @return dorNodCd
	 */
	public String getDorNodCd() {
		return dorNodCd;
	}
	
	/**
	 * Column Info
	 * @return ifSysKndCd
	 */
	public String getIfSysKndCd() {
		return ifSysKndCd;
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
	 * @param dfltActCustFlg
	 */
	public void setDfltActCustFlg(String dfltActCustFlg) {
		this.dfltActCustFlg = dfltActCustFlg;
	}
	
	/**
	 * Column Info
	 * @param trspActCustNo
	 */
	public void setTrspActCustNo(String trspActCustNo) {
		this.trspActCustNo = trspActCustNo;
	}
	
	/**
	 * Column Info
	 * @param actCustAddr
	 */
	public void setActCustAddr(String actCustAddr) {
		this.actCustAddr = actCustAddr;
	}
	
	/**
	 * Column Info
	 * @param actCustEml
	 */
	public void setActCustEml(String actCustEml) {
		this.actCustEml = actCustEml;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param deltOfcCd
	 */
	public void setDeltOfcCd(String deltOfcCd) {
		this.deltOfcCd = deltOfcCd;
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
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
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
	 * @param trspActCustSeq
	 */
	public void setTrspActCustSeq(String trspActCustSeq) {
		this.trspActCustSeq = trspActCustSeq;
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
	 * @param actCustFaxNo
	 */
	public void setActCustFaxNo(String actCustFaxNo) {
		this.actCustFaxNo = actCustFaxNo;
	}
	
	/**
	 * Column Info
	 * @param actCustNm
	 */
	public void setActCustNm(String actCustNm) {
		this.actCustNm = actCustNm;
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
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param actCustRmk
	 */
	public void setActCustRmk(String actCustRmk) {
		this.actCustRmk = actCustRmk;
	}
	
	/**
	 * Column Info
	 * @param actCustPhnNo
	 */
	public void setActCustPhnNo(String actCustPhnNo) {
		this.actCustPhnNo = actCustPhnNo;
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
	 * @param deltUsrId
	 */
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
	}
	
	/**
	 * Column Info
	 * @param actCustCntCd
	 */
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
	}

	/**
	 * Column Info
	 * @param actCustSeq
	 */
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
	}

	/**
	 * Column Info
	 * @param actCustBndCd
	 */
	public void setActCustBndCd(String actCustBndCd) {
		this.actCustBndCd = actCustBndCd;
	}

	/**
	 * Column Info
	 * @param dorNodCd
	 */
	public void setDorNodCd(String dorNodCd) {
		this.dorNodCd = dorNodCd;
	}

	/**
	 * Column Info
	 * @param ifSysKndCd
	 */
	public void setIfSysKndCd(String ifSysKndCd) {
		this.ifSysKndCd = ifSysKndCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDfltActCustFlg(JSPUtil.getParameter(request, "dflt_act_cust_flg", ""));
		setTrspActCustNo(JSPUtil.getParameter(request, "trsp_act_cust_no", ""));
		setActCustAddr(JSPUtil.getParameter(request, "act_cust_addr", ""));
		setActCustEml(JSPUtil.getParameter(request, "act_cust_eml", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setDeltOfcCd(JSPUtil.getParameter(request, "delt_ofc_cd", ""));
		setActCustZipCd(JSPUtil.getParameter(request, "act_cust_zip_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTrspActCustSeq(JSPUtil.getParameter(request, "trsp_act_cust_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setActCustFaxNo(JSPUtil.getParameter(request, "act_cust_fax_no", ""));
		setActCustNm(JSPUtil.getParameter(request, "act_cust_nm", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setActCustRmk(JSPUtil.getParameter(request, "act_cust_rmk", ""));
		setActCustPhnNo(JSPUtil.getParameter(request, "act_cust_phn_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDeltUsrId(JSPUtil.getParameter(request, "delt_usr_id", ""));
		setActCustCntCd(JSPUtil.getParameter(request, "act_cust_cnt_cd", ""));
		setActCustSeq(JSPUtil.getParameter(request, "act_cust_seq", ""));
		setActCustBndCd(JSPUtil.getParameter(request, "act_cust_bnd_cd", ""));
		setDorNodCd(JSPUtil.getParameter(request, "dor_nod_cd", ""));
		setIfSysKndCd(JSPUtil.getParameter(request, "if_sys_knd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspUsaActCustDtlVO[]
	 */
	public TrsTrspUsaActCustDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspUsaActCustDtlVO[]
	 */
	public TrsTrspUsaActCustDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspUsaActCustDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dfltActCustFlg = (JSPUtil.getParameter(request, prefix	+ "dflt_act_cust_flg", length));
			String[] trspActCustNo = (JSPUtil.getParameter(request, prefix	+ "trsp_act_cust_no", length));
			String[] actCustAddr = (JSPUtil.getParameter(request, prefix	+ "act_cust_addr", length));
			String[] actCustEml = (JSPUtil.getParameter(request, prefix	+ "act_cust_eml", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] deltOfcCd = (JSPUtil.getParameter(request, prefix	+ "delt_ofc_cd", length));
			String[] actCustZipCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_zip_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspActCustSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_act_cust_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] actCustFaxNo = (JSPUtil.getParameter(request, prefix	+ "act_cust_fax_no", length));
			String[] actCustNm = (JSPUtil.getParameter(request, prefix	+ "act_cust_nm", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] actCustRmk = (JSPUtil.getParameter(request, prefix	+ "act_cust_rmk", length));
			String[] actCustPhnNo = (JSPUtil.getParameter(request, prefix	+ "act_cust_phn_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix	+ "delt_usr_id", length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd", length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq", length));
			String[] actCustBndCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_bnd_cd", length));
			String[] dorNodCd = (JSPUtil.getParameter(request, prefix	+ "dor_nod_cd", length));
			String[] ifSysKndCd = (JSPUtil.getParameter(request, prefix	+ "if_sys_knd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspUsaActCustDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dfltActCustFlg[i] != null)
					model.setDfltActCustFlg(dfltActCustFlg[i]);
				if (trspActCustNo[i] != null)
					model.setTrspActCustNo(trspActCustNo[i]);
				if (actCustAddr[i] != null)
					model.setActCustAddr(actCustAddr[i]);
				if (actCustEml[i] != null)
					model.setActCustEml(actCustEml[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (deltOfcCd[i] != null)
					model.setDeltOfcCd(deltOfcCd[i]);
				if (actCustZipCd[i] != null)
					model.setActCustZipCd(actCustZipCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspActCustSeq[i] != null)
					model.setTrspActCustSeq(trspActCustSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (actCustFaxNo[i] != null)
					model.setActCustFaxNo(actCustFaxNo[i]);
				if (actCustNm[i] != null)
					model.setActCustNm(actCustNm[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (actCustRmk[i] != null)
					model.setActCustRmk(actCustRmk[i]);
				if (actCustPhnNo[i] != null)
					model.setActCustPhnNo(actCustPhnNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (actCustBndCd[i] != null)
					model.setActCustBndCd(actCustBndCd[i]);
				if (dorNodCd[i] != null)
					model.setDorNodCd(dorNodCd[i]);
				if (ifSysKndCd[i] != null)
					model.setIfSysKndCd(ifSysKndCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspUsaActCustDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspUsaActCustDtlVO[]
	 */
	public TrsTrspUsaActCustDtlVO[] getTrsTrspUsaActCustDtlVOs(){
		TrsTrspUsaActCustDtlVO[] vos = (TrsTrspUsaActCustDtlVO[])models.toArray(new TrsTrspUsaActCustDtlVO[models.size()]);
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
		this.dfltActCustFlg = this.dfltActCustFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspActCustNo = this.trspActCustNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustAddr = this.actCustAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustEml = this.actCustEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltOfcCd = this.deltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustZipCd = this.actCustZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspActCustSeq = this.trspActCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustFaxNo = this.actCustFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustNm = this.actCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustRmk = this.actCustRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustPhnNo = this.actCustPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustBndCd = this.actCustBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodCd = this.dorNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSysKndCd = this.ifSysKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
