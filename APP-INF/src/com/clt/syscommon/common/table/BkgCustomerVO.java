/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCustomerVO.java
*@FileTitle : BkgCustomerVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 김병규
*@LastVersion : 1.0
* 2009.06.25 김병규 
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
 * @author 김병규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCustomerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCustomerVO> models = new ArrayList<BkgCustomerVO>();
	
	/* Column Info */
	private String orgCustSeq = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String valNm = null;
	/* Column Info */
	private String valUsrId = null;
	/* Column Info */
	private String orgCustCntCd = null;
	/* Column Info */
	private String custCtyNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ibCustNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String addrPrnFlg = null;
	/* Column Info */
	private String custFaxNo = null;
	/* Column Info */
	private String bkgCustTpCd = null;
	/* Column Info */
	private String custTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ibCustAddr = null;
	/* Column Info */
	private String custSteCd = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String custZipId = null;
	/* Column Info */
	private String valCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String valDt = null;
	/* Column Info */
	private String cstmsDeclCntCd = null;
	/* Column Info */
	private String custAddr = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String custEml = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String valOfcCd = null;
	/* Column Info */
	private String valFaxNo = null;
	/* Column Info */
	private String anSndFlg = null;
	/* Column Info */
	private String refNo = null;
	/* Column Info */
	private String mtchFlg = null;
	/* Column Info */
	private String chgDpFlg = null;
	/* Column Info */
	private String eurCstmsStNm = null;
	/* Column Info */
	private String eoriNo = null;
	/* Column Info */
	private String krCstmsCustTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCustomerVO() {}

	public BkgCustomerVO(String ibflag, String pagerows, String bkgNo, String bkgCustTpCd, String custCntCd, String custSeq, String custNm, String custAddr, String custCtyNm, String custSteCd, String cstmsDeclCntCd, String custZipId, String custFaxNo, String custEml, String custTpCd, String refNo, String addrPrnFlg, String valNm, String valFaxNo, String valCd, String valUsrId, String valOfcCd, String valDt, String mtchFlg, String anSndFlg, String chgDpFlg, String orgCustCntCd, String orgCustSeq, String ibCustNm, String ibCustAddr, String creUsrId, String creDt, String updUsrId, String updDt, String eurCstmsStNm, String eoriNo, String krCstmsCustTpCd) {
		this.orgCustSeq = orgCustSeq;
		this.custNm = custNm;
		this.creDt = creDt;
		this.valNm = valNm;
		this.valUsrId = valUsrId;
		this.orgCustCntCd = orgCustCntCd;
		this.custCtyNm = custCtyNm;
		this.pagerows = pagerows;
		this.ibCustNm = ibCustNm;
		this.ibflag = ibflag;
		this.addrPrnFlg = addrPrnFlg;
		this.custFaxNo = custFaxNo;
		this.bkgCustTpCd = bkgCustTpCd;
		this.custTpCd = custTpCd;
		this.updUsrId = updUsrId;
		this.ibCustAddr = ibCustAddr;
		this.custSteCd = custSteCd;
		this.custCntCd = custCntCd;
		this.custZipId = custZipId;
		this.valCd = valCd;
		this.updDt = updDt;
		this.valDt = valDt;
		this.cstmsDeclCntCd = cstmsDeclCntCd;
		this.custAddr = custAddr;
		this.custSeq = custSeq;
		this.custEml = custEml;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.valOfcCd = valOfcCd;
		this.valFaxNo = valFaxNo;
		this.anSndFlg = anSndFlg;
		this.refNo = refNo;
		this.mtchFlg = mtchFlg;
		this.chgDpFlg = chgDpFlg;
		this.eurCstmsStNm = eurCstmsStNm;
		this.eoriNo = eoriNo;
		this.krCstmsCustTpCd = krCstmsCustTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("org_cust_seq", getOrgCustSeq());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("val_nm", getValNm());
		this.hashColumns.put("val_usr_id", getValUsrId());
		this.hashColumns.put("org_cust_cnt_cd", getOrgCustCntCd());
		this.hashColumns.put("cust_cty_nm", getCustCtyNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ib_cust_nm", getIbCustNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("addr_prn_flg", getAddrPrnFlg());
		this.hashColumns.put("cust_fax_no", getCustFaxNo());
		this.hashColumns.put("bkg_cust_tp_cd", getBkgCustTpCd());
		this.hashColumns.put("cust_tp_cd", getCustTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ib_cust_addr", getIbCustAddr());
		this.hashColumns.put("cust_ste_cd", getCustSteCd());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("cust_zip_id", getCustZipId());
		this.hashColumns.put("val_cd", getValCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("val_dt", getValDt());
		this.hashColumns.put("cstms_decl_cnt_cd", getCstmsDeclCntCd());
		this.hashColumns.put("cust_addr", getCustAddr());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("cust_eml", getCustEml());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("val_ofc_cd", getValOfcCd());
		this.hashColumns.put("val_fax_no", getValFaxNo());
		this.hashColumns.put("an_snd_flg", getAnSndFlg());
		this.hashColumns.put("ref_no", getRefNo());
		this.hashColumns.put("mtch_flg", getMtchFlg());
		this.hashColumns.put("chg_dp_flg", getChgDpFlg());
		this.hashColumns.put("eur_cstms_st_nm", getEurCstmsStNm());
		this.hashColumns.put("eori_no", getEoriNo());
		this.hashColumns.put("kr_cstms_cust_tp_cd", getKrCstmsCustTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("org_cust_seq", "orgCustSeq");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("val_nm", "valNm");
		this.hashFields.put("val_usr_id", "valUsrId");
		this.hashFields.put("org_cust_cnt_cd", "orgCustCntCd");
		this.hashFields.put("cust_cty_nm", "custCtyNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ib_cust_nm", "ibCustNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("addr_prn_flg", "addrPrnFlg");
		this.hashFields.put("cust_fax_no", "custFaxNo");
		this.hashFields.put("bkg_cust_tp_cd", "bkgCustTpCd");
		this.hashFields.put("cust_tp_cd", "custTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ib_cust_addr", "ibCustAddr");
		this.hashFields.put("cust_ste_cd", "custSteCd");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("cust_zip_id", "custZipId");
		this.hashFields.put("val_cd", "valCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("val_dt", "valDt");
		this.hashFields.put("cstms_decl_cnt_cd", "cstmsDeclCntCd");
		this.hashFields.put("cust_addr", "custAddr");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("cust_eml", "custEml");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("val_ofc_cd", "valOfcCd");
		this.hashFields.put("val_fax_no", "valFaxNo");
		this.hashFields.put("an_snd_flg", "anSndFlg");
		this.hashFields.put("ref_no", "refNo");
		this.hashFields.put("mtch_flg", "mtchFlg");
		this.hashFields.put("chg_dp_flg", "chgDpFlg");
		this.hashFields.put("eur_cstms_st_nm", "eurCstmsStNm");
		this.hashFields.put("eori_no", "eoriNo");
		this.hashFields.put("kr_cstms_cust_tp_cd", "krCstmsCustTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return orgCustSeq
	 */
	public String getOrgCustSeq() {
		return this.orgCustSeq;
	}
	
	/**
	 * Column Info
	 * @return custNm
	 */
	public String getCustNm() {
		return this.custNm;
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
	 * @return valNm
	 */
	public String getValNm() {
		return this.valNm;
	}
	
	/**
	 * Column Info
	 * @return valUsrId
	 */
	public String getValUsrId() {
		return this.valUsrId;
	}
	
	/**
	 * Column Info
	 * @return orgCustCntCd
	 */
	public String getOrgCustCntCd() {
		return this.orgCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return custCtyNm
	 */
	public String getCustCtyNm() {
		return this.custCtyNm;
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
	 * @return ibCustNm
	 */
	public String getIbCustNm() {
		return this.ibCustNm;
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
	 * @return addrPrnFlg
	 */
	public String getAddrPrnFlg() {
		return this.addrPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return custFaxNo
	 */
	public String getCustFaxNo() {
		return this.custFaxNo;
	}
	
	/**
	 * Column Info
	 * @return bkgCustTpCd
	 */
	public String getBkgCustTpCd() {
		return this.bkgCustTpCd;
	}
	
	/**
	 * Column Info
	 * @return custTpCd
	 */
	public String getCustTpCd() {
		return this.custTpCd;
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
	 * @return ibCustAddr
	 */
	public String getIbCustAddr() {
		return this.ibCustAddr;
	}
	
	/**
	 * Column Info
	 * @return custSteCd
	 */
	public String getCustSteCd() {
		return this.custSteCd;
	}
	
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return custZipId
	 */
	public String getCustZipId() {
		return this.custZipId;
	}
	
	/**
	 * Column Info
	 * @return valCd
	 */
	public String getValCd() {
		return this.valCd;
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
	 * @return valDt
	 */
	public String getValDt() {
		return this.valDt;
	}
	
	/**
	 * Column Info
	 * @return cstmsDeclCntCd
	 */
	public String getCstmsDeclCntCd() {
		return this.cstmsDeclCntCd;
	}
	
	/**
	 * Column Info
	 * @return custAddr
	 */
	public String getCustAddr() {
		return this.custAddr;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return custEml
	 */
	public String getCustEml() {
		return this.custEml;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return valOfcCd
	 */
	public String getValOfcCd() {
		return this.valOfcCd;
	}
	
	/**
	 * Column Info
	 * @return valFaxNo
	 */
	public String getValFaxNo() {
		return this.valFaxNo;
	}
	
	/**
	 * Column Info
	 * @return anSndFlg
	 */
	public String getAnSndFlg() {
		return this.anSndFlg;
	}
	
	/**
	 * Column Info
	 * @return refNo
	 */
	public String getRefNo() {
		return this.refNo;
	}
	
	/**
	 * Column Info
	 * @return mtchFlg
	 */
	public String getMtchFlg() {
		return this.mtchFlg;
	}
	
	/**
	 * Column Info
	 * @return chgDpFlg
	 */
	public String getChgDpFlg() {
		return this.chgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return eurCstmsStNm
	 */
	public String getEurCstmsStNm() {
		return this.eurCstmsStNm;
	}
	
	/**
	 * Column Info
	 * @return eoriNo
	 */
	public String getEoriNo() {
		return this.eoriNo;
	}
	
	/**
	 * Column Info
	 * @return eoriNo
	 */
	public String getKrCstmsCustTpCd() {
		return this.krCstmsCustTpCd;
	}
	
	

	/**
	 * Column Info
	 * @param orgCustSeq
	 */
	public void setOrgCustSeq(String orgCustSeq) {
		this.orgCustSeq = orgCustSeq;
	}
	
	/**
	 * Column Info
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
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
	 * @param valNm
	 */
	public void setValNm(String valNm) {
		this.valNm = valNm;
	}
	
	/**
	 * Column Info
	 * @param valUsrId
	 */
	public void setValUsrId(String valUsrId) {
		this.valUsrId = valUsrId;
	}
	
	/**
	 * Column Info
	 * @param orgCustCntCd
	 */
	public void setOrgCustCntCd(String orgCustCntCd) {
		this.orgCustCntCd = orgCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param custCtyNm
	 */
	public void setCustCtyNm(String custCtyNm) {
		this.custCtyNm = custCtyNm;
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
	 * @param ibCustNm
	 */
	public void setIbCustNm(String ibCustNm) {
		this.ibCustNm = ibCustNm;
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
	 * @param addrPrnFlg
	 */
	public void setAddrPrnFlg(String addrPrnFlg) {
		this.addrPrnFlg = addrPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param custFaxNo
	 */
	public void setCustFaxNo(String custFaxNo) {
		this.custFaxNo = custFaxNo;
	}
	
	/**
	 * Column Info
	 * @param bkgCustTpCd
	 */
	public void setBkgCustTpCd(String bkgCustTpCd) {
		this.bkgCustTpCd = bkgCustTpCd;
	}
	
	/**
	 * Column Info
	 * @param custTpCd
	 */
	public void setCustTpCd(String custTpCd) {
		this.custTpCd = custTpCd;
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
	 * @param ibCustAddr
	 */
	public void setIbCustAddr(String ibCustAddr) {
		this.ibCustAddr = ibCustAddr;
	}
	
	/**
	 * Column Info
	 * @param custSteCd
	 */
	public void setCustSteCd(String custSteCd) {
		this.custSteCd = custSteCd;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param custZipId
	 */
	public void setCustZipId(String custZipId) {
		this.custZipId = custZipId;
	}
	
	/**
	 * Column Info
	 * @param valCd
	 */
	public void setValCd(String valCd) {
		this.valCd = valCd;
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
	 * @param valDt
	 */
	public void setValDt(String valDt) {
		this.valDt = valDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsDeclCntCd
	 */
	public void setCstmsDeclCntCd(String cstmsDeclCntCd) {
		this.cstmsDeclCntCd = cstmsDeclCntCd;
	}
	
	/**
	 * Column Info
	 * @param custAddr
	 */
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param custEml
	 */
	public void setCustEml(String custEml) {
		this.custEml = custEml;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param valOfcCd
	 */
	public void setValOfcCd(String valOfcCd) {
		this.valOfcCd = valOfcCd;
	}
	
	/**
	 * Column Info
	 * @param valFaxNo
	 */
	public void setValFaxNo(String valFaxNo) {
		this.valFaxNo = valFaxNo;
	}
	
	/**
	 * Column Info
	 * @param anSndFlg
	 */
	public void setAnSndFlg(String anSndFlg) {
		this.anSndFlg = anSndFlg;
	}
	
	/**
	 * Column Info
	 * @param refNo
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
	/**
	 * Column Info
	 * @param mtchFlg
	 */
	public void setMtchFlg(String mtchFlg) {
		this.mtchFlg = mtchFlg;
	}
	
	/**
	 * Column Info
	 * @param chgDpFlg
	 */
	public void setChgDpFlg(String chgDpFlg) {
		this.chgDpFlg = chgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param eurCtmsStNm
	 */
	public void setEurCstmsStNm(String eurCstmsStNm) {
		this.eurCstmsStNm = eurCstmsStNm;
	}
		
	/**
	 * Column Info
	 * @param eoriNo
	 */
	public void setEoriNo(String eoriNo) {
		this.eoriNo = eoriNo;
	}
	
	/**
	 * Column Info
	 * @param eoriNo
	 */
	public void setKrCstmsCustTpCd(String krCstmsCustTpCd) {
		this.krCstmsCustTpCd = krCstmsCustTpCd;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setOrgCustSeq(JSPUtil.getParameter(request, "org_cust_seq", ""));
		setCustNm(JSPUtil.getParameter(request, "cust_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setValNm(JSPUtil.getParameter(request, "val_nm", ""));
		setValUsrId(JSPUtil.getParameter(request, "val_usr_id", ""));
		setOrgCustCntCd(JSPUtil.getParameter(request, "org_cust_cnt_cd", ""));
		setCustCtyNm(JSPUtil.getParameter(request, "cust_cty_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbCustNm(JSPUtil.getParameter(request, "ib_cust_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAddrPrnFlg(JSPUtil.getParameter(request, "addr_prn_flg", ""));
		setCustFaxNo(JSPUtil.getParameter(request, "cust_fax_no", ""));
		setBkgCustTpCd(JSPUtil.getParameter(request, "bkg_cust_tp_cd", ""));
		setCustTpCd(JSPUtil.getParameter(request, "cust_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIbCustAddr(JSPUtil.getParameter(request, "ib_cust_addr", ""));
		setCustSteCd(JSPUtil.getParameter(request, "cust_ste_cd", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setCustZipId(JSPUtil.getParameter(request, "cust_zip_id", ""));
		setValCd(JSPUtil.getParameter(request, "val_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setValDt(JSPUtil.getParameter(request, "val_dt", ""));
		setCstmsDeclCntCd(JSPUtil.getParameter(request, "cstms_decl_cnt_cd", ""));
		setCustAddr(JSPUtil.getParameter(request, "cust_addr", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setCustEml(JSPUtil.getParameter(request, "cust_eml", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setValOfcCd(JSPUtil.getParameter(request, "val_ofc_cd", ""));
		setValFaxNo(JSPUtil.getParameter(request, "val_fax_no", ""));
		setAnSndFlg(JSPUtil.getParameter(request, "an_snd_flg", ""));
		setRefNo(JSPUtil.getParameter(request, "ref_no", ""));
		setMtchFlg(JSPUtil.getParameter(request, "mtch_flg", ""));
		setChgDpFlg(JSPUtil.getParameter(request, "chg_dp_flg", ""));
		setEurCstmsStNm(JSPUtil.getParameter(request, "eur_cstms_st_nm", ""));
		setEoriNo(JSPUtil.getParameter(request, "eori_no", ""));
		setKrCstmsCustTpCd(JSPUtil.getParameter(request, "kr_cstms_cust_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCustomerVO[]
	 */
	public BkgCustomerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCustomerVO[]
	 */
	public BkgCustomerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCustomerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] orgCustSeq = (JSPUtil.getParameter(request, prefix	+ "org_cust_seq", length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] valNm = (JSPUtil.getParameter(request, prefix	+ "val_nm", length));
			String[] valUsrId = (JSPUtil.getParameter(request, prefix	+ "val_usr_id", length));
			String[] orgCustCntCd = (JSPUtil.getParameter(request, prefix	+ "org_cust_cnt_cd", length));
			String[] custCtyNm = (JSPUtil.getParameter(request, prefix	+ "cust_cty_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibCustNm = (JSPUtil.getParameter(request, prefix	+ "ib_cust_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] addrPrnFlg = (JSPUtil.getParameter(request, prefix	+ "addr_prn_flg", length));
			String[] custFaxNo = (JSPUtil.getParameter(request, prefix	+ "cust_fax_no", length));
			String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cust_tp_cd", length));
			String[] custTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ibCustAddr = (JSPUtil.getParameter(request, prefix	+ "ib_cust_addr", length));
			String[] custSteCd = (JSPUtil.getParameter(request, prefix	+ "cust_ste_cd", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] custZipId = (JSPUtil.getParameter(request, prefix	+ "cust_zip_id", length));
			String[] valCd = (JSPUtil.getParameter(request, prefix	+ "val_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] valDt = (JSPUtil.getParameter(request, prefix	+ "val_dt", length));
			String[] cstmsDeclCntCd = (JSPUtil.getParameter(request, prefix	+ "cstms_decl_cnt_cd", length));
			String[] custAddr = (JSPUtil.getParameter(request, prefix	+ "cust_addr", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] custEml = (JSPUtil.getParameter(request, prefix	+ "cust_eml", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] valOfcCd = (JSPUtil.getParameter(request, prefix	+ "val_ofc_cd", length));
			String[] valFaxNo = (JSPUtil.getParameter(request, prefix	+ "val_fax_no", length));
			String[] anSndFlg = (JSPUtil.getParameter(request, prefix	+ "an_snd_flg", length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no", length));
			String[] mtchFlg = (JSPUtil.getParameter(request, prefix	+ "mtch_flg", length));
			String[] chgDpFlg = (JSPUtil.getParameter(request, prefix	+ "chg_dp_flg", length));
			String[] eurCstmsStNm = (JSPUtil.getParameter(request, prefix	+ "eur_cstms_st_nm", length));
			String[] eoriNo = (JSPUtil.getParameter(request, prefix	+ "eori_no", length));
			String[] krCstmsCustTpCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_cust_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCustomerVO();
				if (orgCustSeq[i] != null)
					model.setOrgCustSeq(orgCustSeq[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (valNm[i] != null)
					model.setValNm(valNm[i]);
				if (valUsrId[i] != null)
					model.setValUsrId(valUsrId[i]);
				if (orgCustCntCd[i] != null)
					model.setOrgCustCntCd(orgCustCntCd[i]);
				if (custCtyNm[i] != null)
					model.setCustCtyNm(custCtyNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibCustNm[i] != null)
					model.setIbCustNm(ibCustNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (addrPrnFlg[i] != null)
					model.setAddrPrnFlg(addrPrnFlg[i]);
				if (custFaxNo[i] != null)
					model.setCustFaxNo(custFaxNo[i]);
				if (bkgCustTpCd[i] != null)
					model.setBkgCustTpCd(bkgCustTpCd[i]);
				if (custTpCd[i] != null)
					model.setCustTpCd(custTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibCustAddr[i] != null)
					model.setIbCustAddr(ibCustAddr[i]);
				if (custSteCd[i] != null)
					model.setCustSteCd(custSteCd[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (custZipId[i] != null)
					model.setCustZipId(custZipId[i]);
				if (valCd[i] != null)
					model.setValCd(valCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (valDt[i] != null)
					model.setValDt(valDt[i]);
				if (cstmsDeclCntCd[i] != null)
					model.setCstmsDeclCntCd(cstmsDeclCntCd[i]);
				if (custAddr[i] != null)
					model.setCustAddr(custAddr[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (custEml[i] != null)
					model.setCustEml(custEml[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (valOfcCd[i] != null)
					model.setValOfcCd(valOfcCd[i]);
				if (valFaxNo[i] != null)
					model.setValFaxNo(valFaxNo[i]);
				if (anSndFlg[i] != null)
					model.setAnSndFlg(anSndFlg[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (mtchFlg[i] != null)
					model.setMtchFlg(mtchFlg[i]);
				if (chgDpFlg[i] != null)
					model.setChgDpFlg(chgDpFlg[i]);
				if (eurCstmsStNm[i] != null)
					model.setEurCstmsStNm(eurCstmsStNm[i]);
				if (eoriNo[i] != null)
					model.setEoriNo(eoriNo[i]);
				if (krCstmsCustTpCd[i] != null)
					model.setKrCstmsCustTpCd(krCstmsCustTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCustomerVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCustomerVO[]
	 */
	public BkgCustomerVO[] getBkgCustomerVOs(){
		BkgCustomerVO[] vos = (BkgCustomerVO[])models.toArray(new BkgCustomerVO[models.size()]);
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
		this.orgCustSeq = this.orgCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valNm = this.valNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valUsrId = this.valUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCustCntCd = this.orgCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCtyNm = this.custCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibCustNm = this.ibCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrPrnFlg = this.addrPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custFaxNo = this.custFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCustTpCd = this.bkgCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTpCd = this.custTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibCustAddr = this.ibCustAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSteCd = this.custSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custZipId = this.custZipId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valCd = this.valCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valDt = this.valDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsDeclCntCd = this.cstmsDeclCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custAddr = this.custAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custEml = this.custEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valOfcCd = this.valOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.valFaxNo = this.valFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anSndFlg = this.anSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNo = this.refNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtchFlg = this.mtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgDpFlg = this.chgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eurCstmsStNm = this.eurCstmsStNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eoriNo = this.eoriNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsCustTpCd = this.krCstmsCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
