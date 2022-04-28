/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspDisHisVO.java
*@FileTitle : TrsTrspDisHisVO
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

public class TrsTrspDisHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspDisHisVO> models = new ArrayList<TrsTrspDisHisVO>();
	
	/* Column Info */
	private String disN2ndEml = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cgorCstmsAcptReIndFlg = null;
	/* Column Info */
	private String disN1stFaxRsltFlg = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String disN2ndFaxRsltFlg = null;
	/* Column Info */
	private String disN2ndFaxSndNo = null;
	/* Column Info */
	private String disN3rdEmlSndNo = null;
	/* Column Info */
	private String disN2ndEmlSndNo = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String trspCntrAvalSntDt = null;
	/* Column Info */
	private String disN3rdFaxNo = null;
	/* Column Info */
	private String disN3rdFaxSndNo = null;
	/* Column Info */
	private String disN1stEml = null;
	/* Column Info */
	private String lstFreeDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String disN2ndEmlRsltFlg = null;
	/* Column Info */
	private String disN1stFaxSndNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String disN1stEmlRsltFlg = null;
	/* Column Info */
	private String disN3rdEmlRsltFlg = null;
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String disN1stFaxNo = null;
	/* Column Info */
	private String trspDisRefNo = null;
	/* Column Info */
	private String disN1stEmlSndNo = null;
	/* Column Info */
	private String disN3rdFaxRsltFlg = null;
	/* Column Info */
	private String cgorOrgBlRcvrIndFlg = null;
	/* Column Info */
	private String cntrAvalNtcUpdFlg = null;
	/* Column Info */
	private String cntrPkupNo = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String disN3rdEml = null;
	/* Column Info */
	private String avalDt = null;
	/* Column Info */
	private String trspDisIssSeq = null;
	/* Column Info */
	private String cgorFrtPayIndFlg = null;
	/* Column Info */
	private String disN2ndFaxNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspDisHisVO() {}

	public TrsTrspDisHisVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String trspWoOfcCtyCd, String trspWoSeq, String trspDisRefNo, String trspDisIssSeq, String cgorFrtPayIndFlg, String cgorOrgBlRcvrIndFlg, String cgorCstmsAcptReIndFlg, String cntrPkupNo, String avalDt, String lstFreeDt, String trspCntrAvalSntDt, String cntrAvalNtcUpdFlg, String disN1stFaxNo, String disN2ndFaxNo, String disN3rdFaxNo, String disN1stFaxSndNo, String disN2ndFaxSndNo, String disN3rdFaxSndNo, String disN1stEmlSndNo, String disN2ndEmlSndNo, String disN3rdEmlSndNo, String disN1stFaxRsltFlg, String disN2ndFaxRsltFlg, String disN3rdFaxRsltFlg, String disN1stEml, String disN2ndEml, String disN3rdEml, String disN1stEmlRsltFlg, String disN2ndEmlRsltFlg, String disN3rdEmlRsltFlg, String creOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.disN2ndEml = disN2ndEml;
		this.trspSoSeq = trspSoSeq;
		this.creDt = creDt;
		this.cgorCstmsAcptReIndFlg = cgorCstmsAcptReIndFlg;
		this.disN1stFaxRsltFlg = disN1stFaxRsltFlg;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.disN2ndFaxRsltFlg = disN2ndFaxRsltFlg;
		this.disN2ndFaxSndNo = disN2ndFaxSndNo;
		this.disN3rdEmlSndNo = disN3rdEmlSndNo;
		this.disN2ndEmlSndNo = disN2ndEmlSndNo;
		this.creOfcCd = creOfcCd;
		this.trspCntrAvalSntDt = trspCntrAvalSntDt;
		this.disN3rdFaxNo = disN3rdFaxNo;
		this.disN3rdFaxSndNo = disN3rdFaxSndNo;
		this.disN1stEml = disN1stEml;
		this.lstFreeDt = lstFreeDt;
		this.updUsrId = updUsrId;
		this.disN2ndEmlRsltFlg = disN2ndEmlRsltFlg;
		this.disN1stFaxSndNo = disN1stFaxSndNo;
		this.updDt = updDt;
		this.disN1stEmlRsltFlg = disN1stEmlRsltFlg;
		this.disN3rdEmlRsltFlg = disN3rdEmlRsltFlg;
		this.trspWoSeq = trspWoSeq;
		this.disN1stFaxNo = disN1stFaxNo;
		this.trspDisRefNo = trspDisRefNo;
		this.disN1stEmlSndNo = disN1stEmlSndNo;
		this.disN3rdFaxRsltFlg = disN3rdFaxRsltFlg;
		this.cgorOrgBlRcvrIndFlg = cgorOrgBlRcvrIndFlg;
		this.cntrAvalNtcUpdFlg = cntrAvalNtcUpdFlg;
		this.cntrPkupNo = cntrPkupNo;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.creUsrId = creUsrId;
		this.disN3rdEml = disN3rdEml;
		this.avalDt = avalDt;
		this.trspDisIssSeq = trspDisIssSeq;
		this.cgorFrtPayIndFlg = cgorFrtPayIndFlg;
		this.disN2ndFaxNo = disN2ndFaxNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dis_n2nd_eml", getDisN2ndEml());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cgor_cstms_acpt_re_ind_flg", getCgorCstmsAcptReIndFlg());
		this.hashColumns.put("dis_n1st_fax_rslt_flg", getDisN1stFaxRsltFlg());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dis_n2nd_fax_rslt_flg", getDisN2ndFaxRsltFlg());
		this.hashColumns.put("dis_n2nd_fax_snd_no", getDisN2ndFaxSndNo());
		this.hashColumns.put("dis_n3rd_eml_snd_no", getDisN3rdEmlSndNo());
		this.hashColumns.put("dis_n2nd_eml_snd_no", getDisN2ndEmlSndNo());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("trsp_cntr_aval_snt_dt", getTrspCntrAvalSntDt());
		this.hashColumns.put("dis_n3rd_fax_no", getDisN3rdFaxNo());
		this.hashColumns.put("dis_n3rd_fax_snd_no", getDisN3rdFaxSndNo());
		this.hashColumns.put("dis_n1st_eml", getDisN1stEml());
		this.hashColumns.put("lst_free_dt", getLstFreeDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dis_n2nd_eml_rslt_flg", getDisN2ndEmlRsltFlg());
		this.hashColumns.put("dis_n1st_fax_snd_no", getDisN1stFaxSndNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dis_n1st_eml_rslt_flg", getDisN1stEmlRsltFlg());
		this.hashColumns.put("dis_n3rd_eml_rslt_flg", getDisN3rdEmlRsltFlg());
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("dis_n1st_fax_no", getDisN1stFaxNo());
		this.hashColumns.put("trsp_dis_ref_no", getTrspDisRefNo());
		this.hashColumns.put("dis_n1st_eml_snd_no", getDisN1stEmlSndNo());
		this.hashColumns.put("dis_n3rd_fax_rslt_flg", getDisN3rdFaxRsltFlg());
		this.hashColumns.put("cgor_org_bl_rcvr_ind_flg", getCgorOrgBlRcvrIndFlg());
		this.hashColumns.put("cntr_aval_ntc_upd_flg", getCntrAvalNtcUpdFlg());
		this.hashColumns.put("cntr_pkup_no", getCntrPkupNo());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dis_n3rd_eml", getDisN3rdEml());
		this.hashColumns.put("aval_dt", getAvalDt());
		this.hashColumns.put("trsp_dis_iss_seq", getTrspDisIssSeq());
		this.hashColumns.put("cgor_frt_pay_ind_flg", getCgorFrtPayIndFlg());
		this.hashColumns.put("dis_n2nd_fax_no", getDisN2ndFaxNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dis_n2nd_eml", "disN2ndEml");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cgor_cstms_acpt_re_ind_flg", "cgorCstmsAcptReIndFlg");
		this.hashFields.put("dis_n1st_fax_rslt_flg", "disN1stFaxRsltFlg");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dis_n2nd_fax_rslt_flg", "disN2ndFaxRsltFlg");
		this.hashFields.put("dis_n2nd_fax_snd_no", "disN2ndFaxSndNo");
		this.hashFields.put("dis_n3rd_eml_snd_no", "disN3rdEmlSndNo");
		this.hashFields.put("dis_n2nd_eml_snd_no", "disN2ndEmlSndNo");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("trsp_cntr_aval_snt_dt", "trspCntrAvalSntDt");
		this.hashFields.put("dis_n3rd_fax_no", "disN3rdFaxNo");
		this.hashFields.put("dis_n3rd_fax_snd_no", "disN3rdFaxSndNo");
		this.hashFields.put("dis_n1st_eml", "disN1stEml");
		this.hashFields.put("lst_free_dt", "lstFreeDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dis_n2nd_eml_rslt_flg", "disN2ndEmlRsltFlg");
		this.hashFields.put("dis_n1st_fax_snd_no", "disN1stFaxSndNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dis_n1st_eml_rslt_flg", "disN1stEmlRsltFlg");
		this.hashFields.put("dis_n3rd_eml_rslt_flg", "disN3rdEmlRsltFlg");
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("dis_n1st_fax_no", "disN1stFaxNo");
		this.hashFields.put("trsp_dis_ref_no", "trspDisRefNo");
		this.hashFields.put("dis_n1st_eml_snd_no", "disN1stEmlSndNo");
		this.hashFields.put("dis_n3rd_fax_rslt_flg", "disN3rdFaxRsltFlg");
		this.hashFields.put("cgor_org_bl_rcvr_ind_flg", "cgorOrgBlRcvrIndFlg");
		this.hashFields.put("cntr_aval_ntc_upd_flg", "cntrAvalNtcUpdFlg");
		this.hashFields.put("cntr_pkup_no", "cntrPkupNo");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dis_n3rd_eml", "disN3rdEml");
		this.hashFields.put("aval_dt", "avalDt");
		this.hashFields.put("trsp_dis_iss_seq", "trspDisIssSeq");
		this.hashFields.put("cgor_frt_pay_ind_flg", "cgorFrtPayIndFlg");
		this.hashFields.put("dis_n2nd_fax_no", "disN2ndFaxNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return disN2ndEml
	 */
	public String getDisN2ndEml() {
		return this.disN2ndEml;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
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
	 * @return cgorCstmsAcptReIndFlg
	 */
	public String getCgorCstmsAcptReIndFlg() {
		return this.cgorCstmsAcptReIndFlg;
	}
	
	/**
	 * Column Info
	 * @return disN1stFaxRsltFlg
	 */
	public String getDisN1stFaxRsltFlg() {
		return this.disN1stFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
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
	 * @return disN2ndFaxRsltFlg
	 */
	public String getDisN2ndFaxRsltFlg() {
		return this.disN2ndFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return disN2ndFaxSndNo
	 */
	public String getDisN2ndFaxSndNo() {
		return this.disN2ndFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @return disN3rdEmlSndNo
	 */
	public String getDisN3rdEmlSndNo() {
		return this.disN3rdEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return disN2ndEmlSndNo
	 */
	public String getDisN2ndEmlSndNo() {
		return this.disN2ndEmlSndNo;
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
	 * @return trspCntrAvalSntDt
	 */
	public String getTrspCntrAvalSntDt() {
		return this.trspCntrAvalSntDt;
	}
	
	/**
	 * Column Info
	 * @return disN3rdFaxNo
	 */
	public String getDisN3rdFaxNo() {
		return this.disN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @return disN3rdFaxSndNo
	 */
	public String getDisN3rdFaxSndNo() {
		return this.disN3rdFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @return disN1stEml
	 */
	public String getDisN1stEml() {
		return this.disN1stEml;
	}
	
	/**
	 * Column Info
	 * @return lstFreeDt
	 */
	public String getLstFreeDt() {
		return this.lstFreeDt;
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
	 * @return disN2ndEmlRsltFlg
	 */
	public String getDisN2ndEmlRsltFlg() {
		return this.disN2ndEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return disN1stFaxSndNo
	 */
	public String getDisN1stFaxSndNo() {
		return this.disN1stFaxSndNo;
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
	 * @return disN1stEmlRsltFlg
	 */
	public String getDisN1stEmlRsltFlg() {
		return this.disN1stEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return disN3rdEmlRsltFlg
	 */
	public String getDisN3rdEmlRsltFlg() {
		return this.disN3rdEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @return disN1stFaxNo
	 */
	public String getDisN1stFaxNo() {
		return this.disN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @return trspDisRefNo
	 */
	public String getTrspDisRefNo() {
		return this.trspDisRefNo;
	}
	
	/**
	 * Column Info
	 * @return disN1stEmlSndNo
	 */
	public String getDisN1stEmlSndNo() {
		return this.disN1stEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return disN3rdFaxRsltFlg
	 */
	public String getDisN3rdFaxRsltFlg() {
		return this.disN3rdFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return cgorOrgBlRcvrIndFlg
	 */
	public String getCgorOrgBlRcvrIndFlg() {
		return this.cgorOrgBlRcvrIndFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrAvalNtcUpdFlg
	 */
	public String getCntrAvalNtcUpdFlg() {
		return this.cntrAvalNtcUpdFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrPkupNo
	 */
	public String getCntrPkupNo() {
		return this.cntrPkupNo;
	}
	
	/**
	 * Column Info
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
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
	 * @return disN3rdEml
	 */
	public String getDisN3rdEml() {
		return this.disN3rdEml;
	}
	
	/**
	 * Column Info
	 * @return avalDt
	 */
	public String getAvalDt() {
		return this.avalDt;
	}
	
	/**
	 * Column Info
	 * @return trspDisIssSeq
	 */
	public String getTrspDisIssSeq() {
		return this.trspDisIssSeq;
	}
	
	/**
	 * Column Info
	 * @return cgorFrtPayIndFlg
	 */
	public String getCgorFrtPayIndFlg() {
		return this.cgorFrtPayIndFlg;
	}
	
	/**
	 * Column Info
	 * @return disN2ndFaxNo
	 */
	public String getDisN2ndFaxNo() {
		return this.disN2ndFaxNo;
	}
	

	/**
	 * Column Info
	 * @param disN2ndEml
	 */
	public void setDisN2ndEml(String disN2ndEml) {
		this.disN2ndEml = disN2ndEml;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
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
	 * @param cgorCstmsAcptReIndFlg
	 */
	public void setCgorCstmsAcptReIndFlg(String cgorCstmsAcptReIndFlg) {
		this.cgorCstmsAcptReIndFlg = cgorCstmsAcptReIndFlg;
	}
	
	/**
	 * Column Info
	 * @param disN1stFaxRsltFlg
	 */
	public void setDisN1stFaxRsltFlg(String disN1stFaxRsltFlg) {
		this.disN1stFaxRsltFlg = disN1stFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
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
	 * @param disN2ndFaxRsltFlg
	 */
	public void setDisN2ndFaxRsltFlg(String disN2ndFaxRsltFlg) {
		this.disN2ndFaxRsltFlg = disN2ndFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param disN2ndFaxSndNo
	 */
	public void setDisN2ndFaxSndNo(String disN2ndFaxSndNo) {
		this.disN2ndFaxSndNo = disN2ndFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @param disN3rdEmlSndNo
	 */
	public void setDisN3rdEmlSndNo(String disN3rdEmlSndNo) {
		this.disN3rdEmlSndNo = disN3rdEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param disN2ndEmlSndNo
	 */
	public void setDisN2ndEmlSndNo(String disN2ndEmlSndNo) {
		this.disN2ndEmlSndNo = disN2ndEmlSndNo;
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
	 * @param trspCntrAvalSntDt
	 */
	public void setTrspCntrAvalSntDt(String trspCntrAvalSntDt) {
		this.trspCntrAvalSntDt = trspCntrAvalSntDt;
	}
	
	/**
	 * Column Info
	 * @param disN3rdFaxNo
	 */
	public void setDisN3rdFaxNo(String disN3rdFaxNo) {
		this.disN3rdFaxNo = disN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @param disN3rdFaxSndNo
	 */
	public void setDisN3rdFaxSndNo(String disN3rdFaxSndNo) {
		this.disN3rdFaxSndNo = disN3rdFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @param disN1stEml
	 */
	public void setDisN1stEml(String disN1stEml) {
		this.disN1stEml = disN1stEml;
	}
	
	/**
	 * Column Info
	 * @param lstFreeDt
	 */
	public void setLstFreeDt(String lstFreeDt) {
		this.lstFreeDt = lstFreeDt;
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
	 * @param disN2ndEmlRsltFlg
	 */
	public void setDisN2ndEmlRsltFlg(String disN2ndEmlRsltFlg) {
		this.disN2ndEmlRsltFlg = disN2ndEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param disN1stFaxSndNo
	 */
	public void setDisN1stFaxSndNo(String disN1stFaxSndNo) {
		this.disN1stFaxSndNo = disN1stFaxSndNo;
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
	 * @param disN1stEmlRsltFlg
	 */
	public void setDisN1stEmlRsltFlg(String disN1stEmlRsltFlg) {
		this.disN1stEmlRsltFlg = disN1stEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param disN3rdEmlRsltFlg
	 */
	public void setDisN3rdEmlRsltFlg(String disN3rdEmlRsltFlg) {
		this.disN3rdEmlRsltFlg = disN3rdEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @param disN1stFaxNo
	 */
	public void setDisN1stFaxNo(String disN1stFaxNo) {
		this.disN1stFaxNo = disN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @param trspDisRefNo
	 */
	public void setTrspDisRefNo(String trspDisRefNo) {
		this.trspDisRefNo = trspDisRefNo;
	}
	
	/**
	 * Column Info
	 * @param disN1stEmlSndNo
	 */
	public void setDisN1stEmlSndNo(String disN1stEmlSndNo) {
		this.disN1stEmlSndNo = disN1stEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param disN3rdFaxRsltFlg
	 */
	public void setDisN3rdFaxRsltFlg(String disN3rdFaxRsltFlg) {
		this.disN3rdFaxRsltFlg = disN3rdFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param cgorOrgBlRcvrIndFlg
	 */
	public void setCgorOrgBlRcvrIndFlg(String cgorOrgBlRcvrIndFlg) {
		this.cgorOrgBlRcvrIndFlg = cgorOrgBlRcvrIndFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrAvalNtcUpdFlg
	 */
	public void setCntrAvalNtcUpdFlg(String cntrAvalNtcUpdFlg) {
		this.cntrAvalNtcUpdFlg = cntrAvalNtcUpdFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrPkupNo
	 */
	public void setCntrPkupNo(String cntrPkupNo) {
		this.cntrPkupNo = cntrPkupNo;
	}
	
	/**
	 * Column Info
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
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
	 * @param disN3rdEml
	 */
	public void setDisN3rdEml(String disN3rdEml) {
		this.disN3rdEml = disN3rdEml;
	}
	
	/**
	 * Column Info
	 * @param avalDt
	 */
	public void setAvalDt(String avalDt) {
		this.avalDt = avalDt;
	}
	
	/**
	 * Column Info
	 * @param trspDisIssSeq
	 */
	public void setTrspDisIssSeq(String trspDisIssSeq) {
		this.trspDisIssSeq = trspDisIssSeq;
	}
	
	/**
	 * Column Info
	 * @param cgorFrtPayIndFlg
	 */
	public void setCgorFrtPayIndFlg(String cgorFrtPayIndFlg) {
		this.cgorFrtPayIndFlg = cgorFrtPayIndFlg;
	}
	
	/**
	 * Column Info
	 * @param disN2ndFaxNo
	 */
	public void setDisN2ndFaxNo(String disN2ndFaxNo) {
		this.disN2ndFaxNo = disN2ndFaxNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDisN2ndEml(JSPUtil.getParameter(request, "dis_n2nd_eml", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCgorCstmsAcptReIndFlg(JSPUtil.getParameter(request, "cgor_cstms_acpt_re_ind_flg", ""));
		setDisN1stFaxRsltFlg(JSPUtil.getParameter(request, "dis_n1st_fax_rslt_flg", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDisN2ndFaxRsltFlg(JSPUtil.getParameter(request, "dis_n2nd_fax_rslt_flg", ""));
		setDisN2ndFaxSndNo(JSPUtil.getParameter(request, "dis_n2nd_fax_snd_no", ""));
		setDisN3rdEmlSndNo(JSPUtil.getParameter(request, "dis_n3rd_eml_snd_no", ""));
		setDisN2ndEmlSndNo(JSPUtil.getParameter(request, "dis_n2nd_eml_snd_no", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setTrspCntrAvalSntDt(JSPUtil.getParameter(request, "trsp_cntr_aval_snt_dt", ""));
		setDisN3rdFaxNo(JSPUtil.getParameter(request, "dis_n3rd_fax_no", ""));
		setDisN3rdFaxSndNo(JSPUtil.getParameter(request, "dis_n3rd_fax_snd_no", ""));
		setDisN1stEml(JSPUtil.getParameter(request, "dis_n1st_eml", ""));
		setLstFreeDt(JSPUtil.getParameter(request, "lst_free_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDisN2ndEmlRsltFlg(JSPUtil.getParameter(request, "dis_n2nd_eml_rslt_flg", ""));
		setDisN1stFaxSndNo(JSPUtil.getParameter(request, "dis_n1st_fax_snd_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDisN1stEmlRsltFlg(JSPUtil.getParameter(request, "dis_n1st_eml_rslt_flg", ""));
		setDisN3rdEmlRsltFlg(JSPUtil.getParameter(request, "dis_n3rd_eml_rslt_flg", ""));
		setTrspWoSeq(JSPUtil.getParameter(request, "trsp_wo_seq", ""));
		setDisN1stFaxNo(JSPUtil.getParameter(request, "dis_n1st_fax_no", ""));
		setTrspDisRefNo(JSPUtil.getParameter(request, "trsp_dis_ref_no", ""));
		setDisN1stEmlSndNo(JSPUtil.getParameter(request, "dis_n1st_eml_snd_no", ""));
		setDisN3rdFaxRsltFlg(JSPUtil.getParameter(request, "dis_n3rd_fax_rslt_flg", ""));
		setCgorOrgBlRcvrIndFlg(JSPUtil.getParameter(request, "cgor_org_bl_rcvr_ind_flg", ""));
		setCntrAvalNtcUpdFlg(JSPUtil.getParameter(request, "cntr_aval_ntc_upd_flg", ""));
		setCntrPkupNo(JSPUtil.getParameter(request, "cntr_pkup_no", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, "trsp_wo_ofc_cty_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDisN3rdEml(JSPUtil.getParameter(request, "dis_n3rd_eml", ""));
		setAvalDt(JSPUtil.getParameter(request, "aval_dt", ""));
		setTrspDisIssSeq(JSPUtil.getParameter(request, "trsp_dis_iss_seq", ""));
		setCgorFrtPayIndFlg(JSPUtil.getParameter(request, "cgor_frt_pay_ind_flg", ""));
		setDisN2ndFaxNo(JSPUtil.getParameter(request, "dis_n2nd_fax_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspDisHisVO[]
	 */
	public TrsTrspDisHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspDisHisVO[]
	 */
	public TrsTrspDisHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspDisHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] disN2ndEml = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_eml", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cgorCstmsAcptReIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_cstms_acpt_re_ind_flg", length));
			String[] disN1stFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_fax_rslt_flg", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] disN2ndFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_fax_rslt_flg", length));
			String[] disN2ndFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_fax_snd_no", length));
			String[] disN3rdEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_eml_snd_no", length));
			String[] disN2ndEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_eml_snd_no", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] trspCntrAvalSntDt = (JSPUtil.getParameter(request, prefix	+ "trsp_cntr_aval_snt_dt", length));
			String[] disN3rdFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_fax_no", length));
			String[] disN3rdFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_fax_snd_no", length));
			String[] disN1stEml = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_eml", length));
			String[] lstFreeDt = (JSPUtil.getParameter(request, prefix	+ "lst_free_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] disN2ndEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_eml_rslt_flg", length));
			String[] disN1stFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_fax_snd_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] disN1stEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_eml_rslt_flg", length));
			String[] disN3rdEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_eml_rslt_flg", length));
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_seq", length));
			String[] disN1stFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_fax_no", length));
			String[] trspDisRefNo = (JSPUtil.getParameter(request, prefix	+ "trsp_dis_ref_no", length));
			String[] disN1stEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_eml_snd_no", length));
			String[] disN3rdFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_fax_rslt_flg", length));
			String[] cgorOrgBlRcvrIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_org_bl_rcvr_ind_flg", length));
			String[] cntrAvalNtcUpdFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_aval_ntc_upd_flg", length));
			String[] cntrPkupNo = (JSPUtil.getParameter(request, prefix	+ "cntr_pkup_no", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_ofc_cty_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] disN3rdEml = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_eml", length));
			String[] avalDt = (JSPUtil.getParameter(request, prefix	+ "aval_dt", length));
			String[] trspDisIssSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_dis_iss_seq", length));
			String[] cgorFrtPayIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_frt_pay_ind_flg", length));
			String[] disN2ndFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_fax_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspDisHisVO();
				if (disN2ndEml[i] != null)
					model.setDisN2ndEml(disN2ndEml[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cgorCstmsAcptReIndFlg[i] != null)
					model.setCgorCstmsAcptReIndFlg(cgorCstmsAcptReIndFlg[i]);
				if (disN1stFaxRsltFlg[i] != null)
					model.setDisN1stFaxRsltFlg(disN1stFaxRsltFlg[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (disN2ndFaxRsltFlg[i] != null)
					model.setDisN2ndFaxRsltFlg(disN2ndFaxRsltFlg[i]);
				if (disN2ndFaxSndNo[i] != null)
					model.setDisN2ndFaxSndNo(disN2ndFaxSndNo[i]);
				if (disN3rdEmlSndNo[i] != null)
					model.setDisN3rdEmlSndNo(disN3rdEmlSndNo[i]);
				if (disN2ndEmlSndNo[i] != null)
					model.setDisN2ndEmlSndNo(disN2ndEmlSndNo[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (trspCntrAvalSntDt[i] != null)
					model.setTrspCntrAvalSntDt(trspCntrAvalSntDt[i]);
				if (disN3rdFaxNo[i] != null)
					model.setDisN3rdFaxNo(disN3rdFaxNo[i]);
				if (disN3rdFaxSndNo[i] != null)
					model.setDisN3rdFaxSndNo(disN3rdFaxSndNo[i]);
				if (disN1stEml[i] != null)
					model.setDisN1stEml(disN1stEml[i]);
				if (lstFreeDt[i] != null)
					model.setLstFreeDt(lstFreeDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (disN2ndEmlRsltFlg[i] != null)
					model.setDisN2ndEmlRsltFlg(disN2ndEmlRsltFlg[i]);
				if (disN1stFaxSndNo[i] != null)
					model.setDisN1stFaxSndNo(disN1stFaxSndNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (disN1stEmlRsltFlg[i] != null)
					model.setDisN1stEmlRsltFlg(disN1stEmlRsltFlg[i]);
				if (disN3rdEmlRsltFlg[i] != null)
					model.setDisN3rdEmlRsltFlg(disN3rdEmlRsltFlg[i]);
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (disN1stFaxNo[i] != null)
					model.setDisN1stFaxNo(disN1stFaxNo[i]);
				if (trspDisRefNo[i] != null)
					model.setTrspDisRefNo(trspDisRefNo[i]);
				if (disN1stEmlSndNo[i] != null)
					model.setDisN1stEmlSndNo(disN1stEmlSndNo[i]);
				if (disN3rdFaxRsltFlg[i] != null)
					model.setDisN3rdFaxRsltFlg(disN3rdFaxRsltFlg[i]);
				if (cgorOrgBlRcvrIndFlg[i] != null)
					model.setCgorOrgBlRcvrIndFlg(cgorOrgBlRcvrIndFlg[i]);
				if (cntrAvalNtcUpdFlg[i] != null)
					model.setCntrAvalNtcUpdFlg(cntrAvalNtcUpdFlg[i]);
				if (cntrPkupNo[i] != null)
					model.setCntrPkupNo(cntrPkupNo[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (disN3rdEml[i] != null)
					model.setDisN3rdEml(disN3rdEml[i]);
				if (avalDt[i] != null)
					model.setAvalDt(avalDt[i]);
				if (trspDisIssSeq[i] != null)
					model.setTrspDisIssSeq(trspDisIssSeq[i]);
				if (cgorFrtPayIndFlg[i] != null)
					model.setCgorFrtPayIndFlg(cgorFrtPayIndFlg[i]);
				if (disN2ndFaxNo[i] != null)
					model.setDisN2ndFaxNo(disN2ndFaxNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspDisHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspDisHisVO[]
	 */
	public TrsTrspDisHisVO[] getTrsTrspDisHisVOs(){
		TrsTrspDisHisVO[] vos = (TrsTrspDisHisVO[])models.toArray(new TrsTrspDisHisVO[models.size()]);
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
		this.disN2ndEml = this.disN2ndEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorCstmsAcptReIndFlg = this.cgorCstmsAcptReIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stFaxRsltFlg = this.disN1stFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndFaxRsltFlg = this.disN2ndFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndFaxSndNo = this.disN2ndFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdEmlSndNo = this.disN3rdEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndEmlSndNo = this.disN2ndEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCntrAvalSntDt = this.trspCntrAvalSntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdFaxNo = this.disN3rdFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdFaxSndNo = this.disN3rdFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stEml = this.disN1stEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstFreeDt = this.lstFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndEmlRsltFlg = this.disN2ndEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stFaxSndNo = this.disN1stFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stEmlRsltFlg = this.disN1stEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdEmlRsltFlg = this.disN3rdEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoSeq = this.trspWoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stFaxNo = this.disN1stFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDisRefNo = this.trspDisRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stEmlSndNo = this.disN1stEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdFaxRsltFlg = this.disN3rdFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorOrgBlRcvrIndFlg = this.cgorOrgBlRcvrIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAvalNtcUpdFlg = this.cntrAvalNtcUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPkupNo = this.cntrPkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdEml = this.disN3rdEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalDt = this.avalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDisIssSeq = this.trspDisIssSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorFrtPayIndFlg = this.cgorFrtPayIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndFaxNo = this.disN2ndFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
