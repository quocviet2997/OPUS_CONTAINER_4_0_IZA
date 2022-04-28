/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EdiUsaIbCgoRlseVO.java
*@FileTitle : EdiUsaIbCgoRlseVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.15
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.15  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EdiUsaIbCgoRlseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EdiUsaIbCgoRlseVO> models = new ArrayList<EdiUsaIbCgoRlseVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cstmsAcptFlg = null;
	/* Column Info */
	private String ibdIpiLoclIndCd = null;
	/* Column Info */
	private String ibdBkgStsCd = null;
	/* Column Info */
	private String cndLocGdsCd = null;
	/* Column Info */
	private String ibdCstmsClrIndCd = null;
	/* Column Info */
	private String ibdIssDt = null;
	/* Column Info */
	private String cgorCustEdiFlg = null;
	/* Column Info */
	private String trspEvntTms = null;
	/* Column Info */
	private String cgorCstmsAcptReIndFlg = null;
	/* Column Info */
	private String cgorOrgBlUpdDt = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cgorArUpdDt = null;
	/* Column Info */
	private String ediCgoRmk = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cgorFrtUpdDt = null;
	/* Column Info */
	private String ibdCstmsClrLocCd = null;
	/* Column Info */
	private String ibTrnsNo = null;
	/* Column Info */
	private String ibdTrspHubCtyCd = null;
	/* Column Info */
	private String cndMrnNo = null;
	/* Column Info */
	private String amsUpdDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String cgorOrgBlRcvrIndFlg = null;
	/* Column Info */
	private String amsInsDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String vslDchgPortCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String ibdTpCd = null;
	/* Column Info */
	private String ibdNonVslOpCrrFtrCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cgorFrtPayIndFlg = null;
	/* Column Info */
	private String cndIbdNo = null;
	/* Column Info */
	private String ibdNo = null;
	/* Column Info */
	private String cgorCustEdiDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EdiUsaIbCgoRlseVO() {}

	public EdiUsaIbCgoRlseVO(String ibflag, String pagerows, String blNo, String bkgNo, String ibdBkgStsCd, String vslCd, String skdVoyNo, String skdDirCd, String vslDchgPortCd, String delCd, String ibdTrspHubCtyCd, String ibdCstmsClrLocCd, String ibdTpCd, String ibdNo, String ibdIssDt, String ibdCstmsClrIndCd, String ibdIpiLoclIndCd, String ibdNonVslOpCrrFtrCd, String cgorFrtPayIndFlg, String cgorOrgBlRcvrIndFlg, String cgorFrtUpdDt, String cgorCstmsAcptReIndFlg, String cgorArUpdDt, String cgorOrgBlUpdDt, String cgorCustEdiFlg, String cgorCustEdiDt, String cstmsAcptFlg, String ibTrnsNo, String cndLocGdsCd, String cndIbdNo, String cndMrnNo, String amsInsDt, String amsUpdDt, String eaiEvntDt, String trspEvntTms, String ediCgoRmk) {
		this.vslCd = vslCd;
		this.cstmsAcptFlg = cstmsAcptFlg;
		this.ibdIpiLoclIndCd = ibdIpiLoclIndCd;
		this.ibdBkgStsCd = ibdBkgStsCd;
		this.cndLocGdsCd = cndLocGdsCd;
		this.ibdCstmsClrIndCd = ibdCstmsClrIndCd;
		this.ibdIssDt = ibdIssDt;
		this.cgorCustEdiFlg = cgorCustEdiFlg;
		this.trspEvntTms = trspEvntTms;
		this.cgorCstmsAcptReIndFlg = cgorCstmsAcptReIndFlg;
		this.cgorOrgBlUpdDt = cgorOrgBlUpdDt;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.cgorArUpdDt = cgorArUpdDt;
		this.ediCgoRmk = ediCgoRmk;
		this.ibflag = ibflag;
		this.cgorFrtUpdDt = cgorFrtUpdDt;
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
		this.ibTrnsNo = ibTrnsNo;
		this.ibdTrspHubCtyCd = ibdTrspHubCtyCd;
		this.cndMrnNo = cndMrnNo;
		this.amsUpdDt = amsUpdDt;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.cgorOrgBlRcvrIndFlg = cgorOrgBlRcvrIndFlg;
		this.amsInsDt = amsInsDt;
		this.eaiEvntDt = eaiEvntDt;
		this.vslDchgPortCd = vslDchgPortCd;
		this.skdDirCd = skdDirCd;
		this.ibdTpCd = ibdTpCd;
		this.ibdNonVslOpCrrFtrCd = ibdNonVslOpCrrFtrCd;
		this.bkgNo = bkgNo;
		this.cgorFrtPayIndFlg = cgorFrtPayIndFlg;
		this.cndIbdNo = cndIbdNo;
		this.ibdNo = ibdNo;
		this.cgorCustEdiDt = cgorCustEdiDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cstms_acpt_flg", getCstmsAcptFlg());
		this.hashColumns.put("ibd_ipi_locl_ind_cd", getIbdIpiLoclIndCd());
		this.hashColumns.put("ibd_bkg_sts_cd", getIbdBkgStsCd());
		this.hashColumns.put("cnd_loc_gds_cd", getCndLocGdsCd());
		this.hashColumns.put("ibd_cstms_clr_ind_cd", getIbdCstmsClrIndCd());
		this.hashColumns.put("ibd_iss_dt", getIbdIssDt());
		this.hashColumns.put("cgor_cust_edi_flg", getCgorCustEdiFlg());
		this.hashColumns.put("trsp_evnt_tms", getTrspEvntTms());
		this.hashColumns.put("cgor_cstms_acpt_re_ind_flg", getCgorCstmsAcptReIndFlg());
		this.hashColumns.put("cgor_org_bl_upd_dt", getCgorOrgBlUpdDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cgor_ar_upd_dt", getCgorArUpdDt());
		this.hashColumns.put("edi_cgo_rmk", getEdiCgoRmk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cgor_frt_upd_dt", getCgorFrtUpdDt());
		this.hashColumns.put("ibd_cstms_clr_loc_cd", getIbdCstmsClrLocCd());
		this.hashColumns.put("ib_trns_no", getIbTrnsNo());
		this.hashColumns.put("ibd_trsp_hub_cty_cd", getIbdTrspHubCtyCd());
		this.hashColumns.put("cnd_mrn_no", getCndMrnNo());
		this.hashColumns.put("ams_upd_dt", getAmsUpdDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cgor_org_bl_rcvr_ind_flg", getCgorOrgBlRcvrIndFlg());
		this.hashColumns.put("ams_ins_dt", getAmsInsDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("vsl_dchg_port_cd", getVslDchgPortCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ibd_tp_cd", getIbdTpCd());
		this.hashColumns.put("ibd_non_vsl_op_crr_ftr_cd", getIbdNonVslOpCrrFtrCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cgor_frt_pay_ind_flg", getCgorFrtPayIndFlg());
		this.hashColumns.put("cnd_ibd_no", getCndIbdNo());
		this.hashColumns.put("ibd_no", getIbdNo());
		this.hashColumns.put("cgor_cust_edi_dt", getCgorCustEdiDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cstms_acpt_flg", "cstmsAcptFlg");
		this.hashFields.put("ibd_ipi_locl_ind_cd", "ibdIpiLoclIndCd");
		this.hashFields.put("ibd_bkg_sts_cd", "ibdBkgStsCd");
		this.hashFields.put("cnd_loc_gds_cd", "cndLocGdsCd");
		this.hashFields.put("ibd_cstms_clr_ind_cd", "ibdCstmsClrIndCd");
		this.hashFields.put("ibd_iss_dt", "ibdIssDt");
		this.hashFields.put("cgor_cust_edi_flg", "cgorCustEdiFlg");
		this.hashFields.put("trsp_evnt_tms", "trspEvntTms");
		this.hashFields.put("cgor_cstms_acpt_re_ind_flg", "cgorCstmsAcptReIndFlg");
		this.hashFields.put("cgor_org_bl_upd_dt", "cgorOrgBlUpdDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cgor_ar_upd_dt", "cgorArUpdDt");
		this.hashFields.put("edi_cgo_rmk", "ediCgoRmk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cgor_frt_upd_dt", "cgorFrtUpdDt");
		this.hashFields.put("ibd_cstms_clr_loc_cd", "ibdCstmsClrLocCd");
		this.hashFields.put("ib_trns_no", "ibTrnsNo");
		this.hashFields.put("ibd_trsp_hub_cty_cd", "ibdTrspHubCtyCd");
		this.hashFields.put("cnd_mrn_no", "cndMrnNo");
		this.hashFields.put("ams_upd_dt", "amsUpdDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cgor_org_bl_rcvr_ind_flg", "cgorOrgBlRcvrIndFlg");
		this.hashFields.put("ams_ins_dt", "amsInsDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("vsl_dchg_port_cd", "vslDchgPortCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ibd_tp_cd", "ibdTpCd");
		this.hashFields.put("ibd_non_vsl_op_crr_ftr_cd", "ibdNonVslOpCrrFtrCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cgor_frt_pay_ind_flg", "cgorFrtPayIndFlg");
		this.hashFields.put("cnd_ibd_no", "cndIbdNo");
		this.hashFields.put("ibd_no", "ibdNo");
		this.hashFields.put("cgor_cust_edi_dt", "cgorCustEdiDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsAcptFlg
	 */
	public String getCstmsAcptFlg() {
		return this.cstmsAcptFlg;
	}
	
	/**
	 * Column Info
	 * @return ibdIpiLoclIndCd
	 */
	public String getIbdIpiLoclIndCd() {
		return this.ibdIpiLoclIndCd;
	}
	
	/**
	 * Column Info
	 * @return ibdBkgStsCd
	 */
	public String getIbdBkgStsCd() {
		return this.ibdBkgStsCd;
	}
	
	/**
	 * Column Info
	 * @return cndLocGdsCd
	 */
	public String getCndLocGdsCd() {
		return this.cndLocGdsCd;
	}
	
	/**
	 * Column Info
	 * @return ibdCstmsClrIndCd
	 */
	public String getIbdCstmsClrIndCd() {
		return this.ibdCstmsClrIndCd;
	}
	
	/**
	 * Column Info
	 * @return ibdIssDt
	 */
	public String getIbdIssDt() {
		return this.ibdIssDt;
	}
	
	/**
	 * Column Info
	 * @return cgorCustEdiFlg
	 */
	public String getCgorCustEdiFlg() {
		return this.cgorCustEdiFlg;
	}
	
	/**
	 * Column Info
	 * @return trspEvntTms
	 */
	public String getTrspEvntTms() {
		return this.trspEvntTms;
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
	 * @return cgorOrgBlUpdDt
	 */
	public String getCgorOrgBlUpdDt() {
		return this.cgorOrgBlUpdDt;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return cgorArUpdDt
	 */
	public String getCgorArUpdDt() {
		return this.cgorArUpdDt;
	}
	
	/**
	 * Column Info
	 * @return ediCgoRmk
	 */
	public String getEdiCgoRmk() {
		return this.ediCgoRmk;
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
	 * @return cgorFrtUpdDt
	 */
	public String getCgorFrtUpdDt() {
		return this.cgorFrtUpdDt;
	}
	
	/**
	 * Column Info
	 * @return ibdCstmsClrLocCd
	 */
	public String getIbdCstmsClrLocCd() {
		return this.ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @return ibTrnsNo
	 */
	public String getIbTrnsNo() {
		return this.ibTrnsNo;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspHubCtyCd
	 */
	public String getIbdTrspHubCtyCd() {
		return this.ibdTrspHubCtyCd;
	}
	
	/**
	 * Column Info
	 * @return cndMrnNo
	 */
	public String getCndMrnNo() {
		return this.cndMrnNo;
	}
	
	/**
	 * Column Info
	 * @return amsUpdDt
	 */
	public String getAmsUpdDt() {
		return this.amsUpdDt;
	}
	
	/**
	 * Column Info
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
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
	 * @return amsInsDt
	 */
	public String getAmsInsDt() {
		return this.amsInsDt;
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
	 * @return vslDchgPortCd
	 */
	public String getVslDchgPortCd() {
		return this.vslDchgPortCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return ibdTpCd
	 */
	public String getIbdTpCd() {
		return this.ibdTpCd;
	}
	
	/**
	 * Column Info
	 * @return ibdNonVslOpCrrFtrCd
	 */
	public String getIbdNonVslOpCrrFtrCd() {
		return this.ibdNonVslOpCrrFtrCd;
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
	 * @return cgorFrtPayIndFlg
	 */
	public String getCgorFrtPayIndFlg() {
		return this.cgorFrtPayIndFlg;
	}
	
	/**
	 * Column Info
	 * @return cndIbdNo
	 */
	public String getCndIbdNo() {
		return this.cndIbdNo;
	}
	
	/**
	 * Column Info
	 * @return ibdNo
	 */
	public String getIbdNo() {
		return this.ibdNo;
	}
	
	/**
	 * Column Info
	 * @return cgorCustEdiDt
	 */
	public String getCgorCustEdiDt() {
		return this.cgorCustEdiDt;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsAcptFlg
	 */
	public void setCstmsAcptFlg(String cstmsAcptFlg) {
		this.cstmsAcptFlg = cstmsAcptFlg;
	}
	
	/**
	 * Column Info
	 * @param ibdIpiLoclIndCd
	 */
	public void setIbdIpiLoclIndCd(String ibdIpiLoclIndCd) {
		this.ibdIpiLoclIndCd = ibdIpiLoclIndCd;
	}
	
	/**
	 * Column Info
	 * @param ibdBkgStsCd
	 */
	public void setIbdBkgStsCd(String ibdBkgStsCd) {
		this.ibdBkgStsCd = ibdBkgStsCd;
	}
	
	/**
	 * Column Info
	 * @param cndLocGdsCd
	 */
	public void setCndLocGdsCd(String cndLocGdsCd) {
		this.cndLocGdsCd = cndLocGdsCd;
	}
	
	/**
	 * Column Info
	 * @param ibdCstmsClrIndCd
	 */
	public void setIbdCstmsClrIndCd(String ibdCstmsClrIndCd) {
		this.ibdCstmsClrIndCd = ibdCstmsClrIndCd;
	}
	
	/**
	 * Column Info
	 * @param ibdIssDt
	 */
	public void setIbdIssDt(String ibdIssDt) {
		this.ibdIssDt = ibdIssDt;
	}
	
	/**
	 * Column Info
	 * @param cgorCustEdiFlg
	 */
	public void setCgorCustEdiFlg(String cgorCustEdiFlg) {
		this.cgorCustEdiFlg = cgorCustEdiFlg;
	}
	
	/**
	 * Column Info
	 * @param trspEvntTms
	 */
	public void setTrspEvntTms(String trspEvntTms) {
		this.trspEvntTms = trspEvntTms;
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
	 * @param cgorOrgBlUpdDt
	 */
	public void setCgorOrgBlUpdDt(String cgorOrgBlUpdDt) {
		this.cgorOrgBlUpdDt = cgorOrgBlUpdDt;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param cgorArUpdDt
	 */
	public void setCgorArUpdDt(String cgorArUpdDt) {
		this.cgorArUpdDt = cgorArUpdDt;
	}
	
	/**
	 * Column Info
	 * @param ediCgoRmk
	 */
	public void setEdiCgoRmk(String ediCgoRmk) {
		this.ediCgoRmk = ediCgoRmk;
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
	 * @param cgorFrtUpdDt
	 */
	public void setCgorFrtUpdDt(String cgorFrtUpdDt) {
		this.cgorFrtUpdDt = cgorFrtUpdDt;
	}
	
	/**
	 * Column Info
	 * @param ibdCstmsClrLocCd
	 */
	public void setIbdCstmsClrLocCd(String ibdCstmsClrLocCd) {
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @param ibTrnsNo
	 */
	public void setIbTrnsNo(String ibTrnsNo) {
		this.ibTrnsNo = ibTrnsNo;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspHubCtyCd
	 */
	public void setIbdTrspHubCtyCd(String ibdTrspHubCtyCd) {
		this.ibdTrspHubCtyCd = ibdTrspHubCtyCd;
	}
	
	/**
	 * Column Info
	 * @param cndMrnNo
	 */
	public void setCndMrnNo(String cndMrnNo) {
		this.cndMrnNo = cndMrnNo;
	}
	
	/**
	 * Column Info
	 * @param amsUpdDt
	 */
	public void setAmsUpdDt(String amsUpdDt) {
		this.amsUpdDt = amsUpdDt;
	}
	
	/**
	 * Column Info
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
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
	 * @param amsInsDt
	 */
	public void setAmsInsDt(String amsInsDt) {
		this.amsInsDt = amsInsDt;
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
	 * @param vslDchgPortCd
	 */
	public void setVslDchgPortCd(String vslDchgPortCd) {
		this.vslDchgPortCd = vslDchgPortCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param ibdTpCd
	 */
	public void setIbdTpCd(String ibdTpCd) {
		this.ibdTpCd = ibdTpCd;
	}
	
	/**
	 * Column Info
	 * @param ibdNonVslOpCrrFtrCd
	 */
	public void setIbdNonVslOpCrrFtrCd(String ibdNonVslOpCrrFtrCd) {
		this.ibdNonVslOpCrrFtrCd = ibdNonVslOpCrrFtrCd;
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
	 * @param cgorFrtPayIndFlg
	 */
	public void setCgorFrtPayIndFlg(String cgorFrtPayIndFlg) {
		this.cgorFrtPayIndFlg = cgorFrtPayIndFlg;
	}
	
	/**
	 * Column Info
	 * @param cndIbdNo
	 */
	public void setCndIbdNo(String cndIbdNo) {
		this.cndIbdNo = cndIbdNo;
	}
	
	/**
	 * Column Info
	 * @param ibdNo
	 */
	public void setIbdNo(String ibdNo) {
		this.ibdNo = ibdNo;
	}
	
	/**
	 * Column Info
	 * @param cgorCustEdiDt
	 */
	public void setCgorCustEdiDt(String cgorCustEdiDt) {
		this.cgorCustEdiDt = cgorCustEdiDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCstmsAcptFlg(JSPUtil.getParameter(request, "cstms_acpt_flg", ""));
		setIbdIpiLoclIndCd(JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd", ""));
		setIbdBkgStsCd(JSPUtil.getParameter(request, "ibd_bkg_sts_cd", ""));
		setCndLocGdsCd(JSPUtil.getParameter(request, "cnd_loc_gds_cd", ""));
		setIbdCstmsClrIndCd(JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd", ""));
		setIbdIssDt(JSPUtil.getParameter(request, "ibd_iss_dt", ""));
		setCgorCustEdiFlg(JSPUtil.getParameter(request, "cgor_cust_edi_flg", ""));
		setTrspEvntTms(JSPUtil.getParameter(request, "trsp_evnt_tms", ""));
		setCgorCstmsAcptReIndFlg(JSPUtil.getParameter(request, "cgor_cstms_acpt_re_ind_flg", ""));
		setCgorOrgBlUpdDt(JSPUtil.getParameter(request, "cgor_org_bl_upd_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCgorArUpdDt(JSPUtil.getParameter(request, "cgor_ar_upd_dt", ""));
		setEdiCgoRmk(JSPUtil.getParameter(request, "edi_cgo_rmk", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCgorFrtUpdDt(JSPUtil.getParameter(request, "cgor_frt_upd_dt", ""));
		setIbdCstmsClrLocCd(JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd", ""));
		setIbTrnsNo(JSPUtil.getParameter(request, "ib_trns_no", ""));
		setIbdTrspHubCtyCd(JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd", ""));
		setCndMrnNo(JSPUtil.getParameter(request, "cnd_mrn_no", ""));
		setAmsUpdDt(JSPUtil.getParameter(request, "ams_upd_dt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setCgorOrgBlRcvrIndFlg(JSPUtil.getParameter(request, "cgor_org_bl_rcvr_ind_flg", ""));
		setAmsInsDt(JSPUtil.getParameter(request, "ams_ins_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setVslDchgPortCd(JSPUtil.getParameter(request, "vsl_dchg_port_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setIbdTpCd(JSPUtil.getParameter(request, "ibd_tp_cd", ""));
		setIbdNonVslOpCrrFtrCd(JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCgorFrtPayIndFlg(JSPUtil.getParameter(request, "cgor_frt_pay_ind_flg", ""));
		setCndIbdNo(JSPUtil.getParameter(request, "cnd_ibd_no", ""));
		setIbdNo(JSPUtil.getParameter(request, "ibd_no", ""));
		setCgorCustEdiDt(JSPUtil.getParameter(request, "cgor_cust_edi_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EdiUsaIbCgoRlseVO[]
	 */
	public EdiUsaIbCgoRlseVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EdiUsaIbCgoRlseVO[]
	 */
	public EdiUsaIbCgoRlseVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EdiUsaIbCgoRlseVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cstmsAcptFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_acpt_flg", length));
			String[] ibdIpiLoclIndCd = (JSPUtil.getParameter(request, prefix	+ "ibd_ipi_locl_ind_cd", length));
			String[] ibdBkgStsCd = (JSPUtil.getParameter(request, prefix	+ "ibd_bkg_sts_cd", length));
			String[] cndLocGdsCd = (JSPUtil.getParameter(request, prefix	+ "cnd_loc_gds_cd", length));
			String[] ibdCstmsClrIndCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_ind_cd", length));
			String[] ibdIssDt = (JSPUtil.getParameter(request, prefix	+ "ibd_iss_dt", length));
			String[] cgorCustEdiFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_cust_edi_flg", length));
			String[] trspEvntTms = (JSPUtil.getParameter(request, prefix	+ "trsp_evnt_tms", length));
			String[] cgorCstmsAcptReIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_cstms_acpt_re_ind_flg", length));
			String[] cgorOrgBlUpdDt = (JSPUtil.getParameter(request, prefix	+ "cgor_org_bl_upd_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cgorArUpdDt = (JSPUtil.getParameter(request, prefix	+ "cgor_ar_upd_dt", length));
			String[] ediCgoRmk = (JSPUtil.getParameter(request, prefix	+ "edi_cgo_rmk", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cgorFrtUpdDt = (JSPUtil.getParameter(request, prefix	+ "cgor_frt_upd_dt", length));
			String[] ibdCstmsClrLocCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_loc_cd", length));
			String[] ibTrnsNo = (JSPUtil.getParameter(request, prefix	+ "ib_trns_no", length));
			String[] ibdTrspHubCtyCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_hub_cty_cd", length));
			String[] cndMrnNo = (JSPUtil.getParameter(request, prefix	+ "cnd_mrn_no", length));
			String[] amsUpdDt = (JSPUtil.getParameter(request, prefix	+ "ams_upd_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] cgorOrgBlRcvrIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_org_bl_rcvr_ind_flg", length));
			String[] amsInsDt = (JSPUtil.getParameter(request, prefix	+ "ams_ins_dt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] vslDchgPortCd = (JSPUtil.getParameter(request, prefix	+ "vsl_dchg_port_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] ibdTpCd = (JSPUtil.getParameter(request, prefix	+ "ibd_tp_cd", length));
			String[] ibdNonVslOpCrrFtrCd = (JSPUtil.getParameter(request, prefix	+ "ibd_non_vsl_op_crr_ftr_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] cgorFrtPayIndFlg = (JSPUtil.getParameter(request, prefix	+ "cgor_frt_pay_ind_flg", length));
			String[] cndIbdNo = (JSPUtil.getParameter(request, prefix	+ "cnd_ibd_no", length));
			String[] ibdNo = (JSPUtil.getParameter(request, prefix	+ "ibd_no", length));
			String[] cgorCustEdiDt = (JSPUtil.getParameter(request, prefix	+ "cgor_cust_edi_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new EdiUsaIbCgoRlseVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cstmsAcptFlg[i] != null)
					model.setCstmsAcptFlg(cstmsAcptFlg[i]);
				if (ibdIpiLoclIndCd[i] != null)
					model.setIbdIpiLoclIndCd(ibdIpiLoclIndCd[i]);
				if (ibdBkgStsCd[i] != null)
					model.setIbdBkgStsCd(ibdBkgStsCd[i]);
				if (cndLocGdsCd[i] != null)
					model.setCndLocGdsCd(cndLocGdsCd[i]);
				if (ibdCstmsClrIndCd[i] != null)
					model.setIbdCstmsClrIndCd(ibdCstmsClrIndCd[i]);
				if (ibdIssDt[i] != null)
					model.setIbdIssDt(ibdIssDt[i]);
				if (cgorCustEdiFlg[i] != null)
					model.setCgorCustEdiFlg(cgorCustEdiFlg[i]);
				if (trspEvntTms[i] != null)
					model.setTrspEvntTms(trspEvntTms[i]);
				if (cgorCstmsAcptReIndFlg[i] != null)
					model.setCgorCstmsAcptReIndFlg(cgorCstmsAcptReIndFlg[i]);
				if (cgorOrgBlUpdDt[i] != null)
					model.setCgorOrgBlUpdDt(cgorOrgBlUpdDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cgorArUpdDt[i] != null)
					model.setCgorArUpdDt(cgorArUpdDt[i]);
				if (ediCgoRmk[i] != null)
					model.setEdiCgoRmk(ediCgoRmk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cgorFrtUpdDt[i] != null)
					model.setCgorFrtUpdDt(cgorFrtUpdDt[i]);
				if (ibdCstmsClrLocCd[i] != null)
					model.setIbdCstmsClrLocCd(ibdCstmsClrLocCd[i]);
				if (ibTrnsNo[i] != null)
					model.setIbTrnsNo(ibTrnsNo[i]);
				if (ibdTrspHubCtyCd[i] != null)
					model.setIbdTrspHubCtyCd(ibdTrspHubCtyCd[i]);
				if (cndMrnNo[i] != null)
					model.setCndMrnNo(cndMrnNo[i]);
				if (amsUpdDt[i] != null)
					model.setAmsUpdDt(amsUpdDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (cgorOrgBlRcvrIndFlg[i] != null)
					model.setCgorOrgBlRcvrIndFlg(cgorOrgBlRcvrIndFlg[i]);
				if (amsInsDt[i] != null)
					model.setAmsInsDt(amsInsDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (vslDchgPortCd[i] != null)
					model.setVslDchgPortCd(vslDchgPortCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (ibdTpCd[i] != null)
					model.setIbdTpCd(ibdTpCd[i]);
				if (ibdNonVslOpCrrFtrCd[i] != null)
					model.setIbdNonVslOpCrrFtrCd(ibdNonVslOpCrrFtrCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cgorFrtPayIndFlg[i] != null)
					model.setCgorFrtPayIndFlg(cgorFrtPayIndFlg[i]);
				if (cndIbdNo[i] != null)
					model.setCndIbdNo(cndIbdNo[i]);
				if (ibdNo[i] != null)
					model.setIbdNo(ibdNo[i]);
				if (cgorCustEdiDt[i] != null)
					model.setCgorCustEdiDt(cgorCustEdiDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEdiUsaIbCgoRlseVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EdiUsaIbCgoRlseVO[]
	 */
	public EdiUsaIbCgoRlseVO[] getEdiUsaIbCgoRlseVOs(){
		EdiUsaIbCgoRlseVO[] vos = (EdiUsaIbCgoRlseVO[])models.toArray(new EdiUsaIbCgoRlseVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAcptFlg = this.cstmsAcptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdIpiLoclIndCd = this.ibdIpiLoclIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdBkgStsCd = this.ibdBkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndLocGdsCd = this.cndLocGdsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrIndCd = this.ibdCstmsClrIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdIssDt = this.ibdIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorCustEdiFlg = this.cgorCustEdiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspEvntTms = this.trspEvntTms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorCstmsAcptReIndFlg = this.cgorCstmsAcptReIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorOrgBlUpdDt = this.cgorOrgBlUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorArUpdDt = this.cgorArUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediCgoRmk = this.ediCgoRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorFrtUpdDt = this.cgorFrtUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrLocCd = this.ibdCstmsClrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTrnsNo = this.ibTrnsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspHubCtyCd = this.ibdTrspHubCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndMrnNo = this.cndMrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsUpdDt = this.amsUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorOrgBlRcvrIndFlg = this.cgorOrgBlRcvrIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsInsDt = this.amsInsDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDchgPortCd = this.vslDchgPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTpCd = this.ibdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNonVslOpCrrFtrCd = this.ibdNonVslOpCrrFtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorFrtPayIndFlg = this.cgorFrtPayIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndIbdNo = this.cndIbdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNo = this.ibdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorCustEdiDt = this.cgorCustEdiDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
