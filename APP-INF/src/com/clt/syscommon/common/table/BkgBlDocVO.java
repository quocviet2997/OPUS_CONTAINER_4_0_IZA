/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgBlDocVO.java
*@FileTitle : BkgBlDocVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.27
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.11.27 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgBlDocVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgBlDocVO> models = new ArrayList<BkgBlDocVO>();
	
	/* Column Info */
	private String corrRmk = null;
	/* Column Info */
	private String mkDescCfmFlg = null;
	/* Column Info */
	private String corrDt = null;
	/* Column Info */
	private String spclCgoAuthKnt = null;
	/* Column Info */
	private String polNm = null;
	/* Column Info */
	private String hblTtlKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String blMvTpNm = null;
	/* Column Info */
	private String mstCvrdBlNo = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String fnlDestNm = null;
	/* Column Info */
	private String bisSysFlg = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String blObrdTpCd = null;
	/* Column Info */
	private String ttlPckDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cobizAuthNo = null;
	/* Column Info */
	private String blCvrdTpCd = null;
	/* Column Info */
	private String bdrCngFlg = null;
	/* Column Info */
	private String orgCntNm = null;
	/* Column Info */
	private String preVslNm = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String corrUsrId = null;
	/* Column Info */
	private String corrN1stDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String porNm = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String blObrdDt = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String ibMfCfmFlg = null;
	/* Column Info */
	private String audErrCtnt = null;
	/* Column Info */
	private String bdrFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgClzCngFlg = null;
	/* Column Info */
	private String bkgClzFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String actWgtPrnFlg = null;
	/* Column Info */
	private String cstmsDesc = null;
	/* Column Info */
	private String cntrCmdtDesc = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String bdrDt = null;
	/* Column Info */
	private String bkgClzCngCfmFlg = null;
	/* Column Info */
	private String corrGdt = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String corrOfcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String podNm = null;
	/* Column Info */
	private String delNm = null;
	/* Column Info */
	private String corrNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String bdrGdt = null;
	/* Column Info */
	private String actWgt = null;
	/* Column Info */
	private String pckCmdtDesc = null;
	/* Column Info */
	private String measQtyPrnFlg = null;
	/* Column Info */
	private String cntrWgtPrnFlg = null;
	/* Column Info */
	private String cntrMeasPrnFlg = null;
	/* Column Info */
	private String mkDescPrnFlg = null;
	/* Column Info */
	private String mfDescPrnFlg = null;
	/* Column Info */
	private String frtPayOfcPrnFlg = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgBlDocVO() {}

	public BkgBlDocVO(String ibflag, String pagerows, String bkgNo, String pckQty, String pckTpCd, String measQty, String measUtCd, String actWgt, String wgtUtCd, String actWgtPrnFlg, String hblTtlKnt, String spclCgoAuthKnt, String blObrdTpCd, String blObrdDt, String audErrCtnt, String ibMfCfmFlg, String bisSysFlg, String orgCntNm, String porCd, String porNm, String polCd, String polNm, String podCd, String podNm, String delCd, String delNm, String blMvTpNm, String fnlDestNm, String vslNm, String preVslNm, String blCvrdTpCd, String mstCvrdBlNo, String bdrFlg, String bdrDt, String bdrCngFlg, String corrNo, String corrUsrId, String corrOfcCd, String corrN1stDt, String corrDt, String corrRmk, String bkgClzFlg, String bkgClzCngFlg, String bkgClzCngCfmFlg, String ttlPckDesc, String cstmsDesc, String mkDescCfmFlg, String pckCmdtDesc, String cntrCmdtDesc, String creUsrId, String creDt, String updUsrId, String updDt, String bdrGdt, String corrGdt, String cobizAuthNo, String measQtyPrnFlg, String cntrWgtPrnFlg, String cntrMeasPrnFlg, String mkDescPrnFlg, String mfDescPrnFlg, String frtPayOfcPrnFlg) {
		this.corrRmk = corrRmk;
		this.mkDescCfmFlg = mkDescCfmFlg;
		this.corrDt = corrDt;
		this.spclCgoAuthKnt = spclCgoAuthKnt;
		this.polNm = polNm;
		this.hblTtlKnt = hblTtlKnt;
		this.pagerows = pagerows;
		this.blMvTpNm = blMvTpNm;
		this.mstCvrdBlNo = mstCvrdBlNo;
		this.polCd = polCd;
		this.fnlDestNm = fnlDestNm;
		this.bisSysFlg = bisSysFlg;
		this.wgtUtCd = wgtUtCd;
		this.blObrdTpCd = blObrdTpCd;
		this.ttlPckDesc = ttlPckDesc;
		this.updUsrId = updUsrId;
		this.cobizAuthNo = cobizAuthNo;
		this.blCvrdTpCd = blCvrdTpCd;
		this.bdrCngFlg = bdrCngFlg;
		this.orgCntNm = orgCntNm;
		this.preVslNm = preVslNm;
		this.delCd = delCd;
		this.corrUsrId = corrUsrId;
		this.corrN1stDt = corrN1stDt;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.porNm = porNm;
		this.bkgNo = bkgNo;
		this.blObrdDt = blObrdDt;
		this.porCd = porCd;
		this.ibMfCfmFlg = ibMfCfmFlg;
		this.audErrCtnt = audErrCtnt;
		this.bdrFlg = bdrFlg;
		this.creDt = creDt;
		this.bkgClzCngFlg = bkgClzCngFlg;
		this.bkgClzFlg = bkgClzFlg;
		this.ibflag = ibflag;
		this.actWgtPrnFlg = actWgtPrnFlg;
		this.cstmsDesc = cstmsDesc;
		this.cntrCmdtDesc = cntrCmdtDesc;
		this.measQty = measQty;
		this.pckQty = pckQty;
		this.bdrDt = bdrDt;
		this.bkgClzCngCfmFlg = bkgClzCngCfmFlg;
		this.corrGdt = corrGdt;
		this.pckTpCd = pckTpCd;
		this.measUtCd = measUtCd;
		this.corrOfcCd = corrOfcCd;
		this.updDt = updDt;
		this.podNm = podNm;
		this.delNm = delNm;
		this.corrNo = corrNo;
		this.vslNm = vslNm;
		this.bdrGdt = bdrGdt;
		this.actWgt = actWgt;
		this.pckCmdtDesc = pckCmdtDesc;
		this.measQtyPrnFlg = measQtyPrnFlg;
		this.cntrWgtPrnFlg = cntrWgtPrnFlg;
		this.cntrMeasPrnFlg = cntrMeasPrnFlg;
		this.mkDescPrnFlg = mkDescPrnFlg;
		this.mfDescPrnFlg = mfDescPrnFlg;
		this.frtPayOfcPrnFlg = frtPayOfcPrnFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("corr_rmk", getCorrRmk());
		this.hashColumns.put("mk_desc_cfm_flg", getMkDescCfmFlg());
		this.hashColumns.put("corr_dt", getCorrDt());
		this.hashColumns.put("spcl_cgo_auth_knt", getSpclCgoAuthKnt());
		this.hashColumns.put("pol_nm", getPolNm());
		this.hashColumns.put("hbl_ttl_knt", getHblTtlKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bl_mv_tp_nm", getBlMvTpNm());
		this.hashColumns.put("mst_cvrd_bl_no", getMstCvrdBlNo());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("fnl_dest_nm", getFnlDestNm());
		this.hashColumns.put("bis_sys_flg", getBisSysFlg());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("bl_obrd_tp_cd", getBlObrdTpCd());
		this.hashColumns.put("ttl_pck_desc", getTtlPckDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cobiz_auth_no", getCobizAuthNo());
		this.hashColumns.put("bl_cvrd_tp_cd", getBlCvrdTpCd());
		this.hashColumns.put("bdr_cng_flg", getBdrCngFlg());
		this.hashColumns.put("org_cnt_nm", getOrgCntNm());
		this.hashColumns.put("pre_vsl_nm", getPreVslNm());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("corr_usr_id", getCorrUsrId());
		this.hashColumns.put("corr_n1st_dt", getCorrN1stDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("por_nm", getPorNm());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("bl_obrd_dt", getBlObrdDt());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("ib_mf_cfm_flg", getIbMfCfmFlg());
		this.hashColumns.put("aud_err_ctnt", getAudErrCtnt());
		this.hashColumns.put("bdr_flg", getBdrFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_clz_cng_flg", getBkgClzCngFlg());
		this.hashColumns.put("bkg_clz_flg", getBkgClzFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("act_wgt_prn_flg", getActWgtPrnFlg());
		this.hashColumns.put("cstms_desc", getCstmsDesc());
		this.hashColumns.put("cntr_cmdt_desc", getCntrCmdtDesc());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("bdr_dt", getBdrDt());
		this.hashColumns.put("bkg_clz_cng_cfm_flg", getBkgClzCngCfmFlg());
		this.hashColumns.put("corr_gdt", getCorrGdt());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("corr_ofc_cd", getCorrOfcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pod_nm", getPodNm());
		this.hashColumns.put("del_nm", getDelNm());
		this.hashColumns.put("corr_no", getCorrNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("bdr_gdt", getBdrGdt());
		this.hashColumns.put("act_wgt", getActWgt());
		this.hashColumns.put("pck_cmdt_desc", getPckCmdtDesc());
		this.hashColumns.put("meas_qty_prn_flg", getMeasQtyPrnFlg());
		this.hashColumns.put("cntr_wgt_prn_flg", getCntrWgtPrnFlg());
		this.hashColumns.put("cntr_meas_prn_flg", getCntrMeasPrnFlg());
		this.hashColumns.put("mk_desc_prn_flg", getMkDescPrnFlg());
		this.hashColumns.put("mf_desc_prn_flg", getMfDescPrnFlg());
		this.hashColumns.put("frt_pay_ofc_prn_flg", getFrtPayOfcPrnFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("corr_rmk", "corrRmk");
		this.hashFields.put("mk_desc_cfm_flg", "mkDescCfmFlg");
		this.hashFields.put("corr_dt", "corrDt");
		this.hashFields.put("spcl_cgo_auth_knt", "spclCgoAuthKnt");
		this.hashFields.put("pol_nm", "polNm");
		this.hashFields.put("hbl_ttl_knt", "hblTtlKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bl_mv_tp_nm", "blMvTpNm");
		this.hashFields.put("mst_cvrd_bl_no", "mstCvrdBlNo");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("fnl_dest_nm", "fnlDestNm");
		this.hashFields.put("bis_sys_flg", "bisSysFlg");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("bl_obrd_tp_cd", "blObrdTpCd");
		this.hashFields.put("ttl_pck_desc", "ttlPckDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cobiz_auth_no", "cobizAuthNo");
		this.hashFields.put("bl_cvrd_tp_cd", "blCvrdTpCd");
		this.hashFields.put("bdr_cng_flg", "bdrCngFlg");
		this.hashFields.put("org_cnt_nm", "orgCntNm");
		this.hashFields.put("pre_vsl_nm", "preVslNm");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("corr_usr_id", "corrUsrId");
		this.hashFields.put("corr_n1st_dt", "corrN1stDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("por_nm", "porNm");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("bl_obrd_dt", "blObrdDt");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("ib_mf_cfm_flg", "ibMfCfmFlg");
		this.hashFields.put("aud_err_ctnt", "audErrCtnt");
		this.hashFields.put("bdr_flg", "bdrFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_clz_cng_flg", "bkgClzCngFlg");
		this.hashFields.put("bkg_clz_flg", "bkgClzFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("act_wgt_prn_flg", "actWgtPrnFlg");
		this.hashFields.put("cstms_desc", "cstmsDesc");
		this.hashFields.put("cntr_cmdt_desc", "cntrCmdtDesc");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("bdr_dt", "bdrDt");
		this.hashFields.put("bkg_clz_cng_cfm_flg", "bkgClzCngCfmFlg");
		this.hashFields.put("corr_gdt", "corrGdt");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("corr_ofc_cd", "corrOfcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pod_nm", "podNm");
		this.hashFields.put("del_nm", "delNm");
		this.hashFields.put("corr_no", "corrNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("bdr_gdt", "bdrGdt");
		this.hashFields.put("act_wgt", "actWgt");
		this.hashFields.put("pck_cmdt_desc", "pckCmdtDesc");
		this.hashFields.put("meas_qty_prn_flg", "measQtyPrnFlg");
		this.hashFields.put("cntr_wgt_prn_flg", "cntrWgtPrnFlg");
		this.hashFields.put("cntr_meas_prn_flg", "cntrMeasPrnFlg");
		this.hashFields.put("mk_desc_prn_flg", "mkDescPrnFlg");
		this.hashFields.put("mf_desc_prn_flg", "mfDescPrnFlg");
		this.hashFields.put("frt_pay_ofc_prn_flg", "frtPayOfcPrnFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return corrRmk
	 */
	public String getCorrRmk() {
		return this.corrRmk;
	}
	
	/**
	 * Column Info
	 * @return mkDescCfmFlg
	 */
	public String getMkDescCfmFlg() {
		return this.mkDescCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return corrDt
	 */
	public String getCorrDt() {
		return this.corrDt;
	}
	
	/**
	 * Column Info
	 * @return spclCgoAuthKnt
	 */
	public String getSpclCgoAuthKnt() {
		return this.spclCgoAuthKnt;
	}
	
	/**
	 * Column Info
	 * @return polNm
	 */
	public String getPolNm() {
		return this.polNm;
	}
	
	/**
	 * Column Info
	 * @return hblTtlKnt
	 */
	public String getHblTtlKnt() {
		return this.hblTtlKnt;
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
	 * @return blMvTpNm
	 */
	public String getBlMvTpNm() {
		return this.blMvTpNm;
	}
	
	/**
	 * Column Info
	 * @return mstCvrdBlNo
	 */
	public String getMstCvrdBlNo() {
		return this.mstCvrdBlNo;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return fnlDestNm
	 */
	public String getFnlDestNm() {
		return this.fnlDestNm;
	}
	
	/**
	 * Column Info
	 * @return bisSysFlg
	 */
	public String getBisSysFlg() {
		return this.bisSysFlg;
	}
	
	/**
	 * Column Info
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return blObrdTpCd
	 */
	public String getBlObrdTpCd() {
		return this.blObrdTpCd;
	}
	
	/**
	 * Column Info
	 * @return ttlPckDesc
	 */
	public String getTtlPckDesc() {
		return this.ttlPckDesc;
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
	 * @return cobizAuthNo
	 */
	public String getCobizAuthNo() {
		return this.cobizAuthNo;
	}
	
	/**
	 * Column Info
	 * @return blCvrdTpCd
	 */
	public String getBlCvrdTpCd() {
		return this.blCvrdTpCd;
	}
	
	/**
	 * Column Info
	 * @return bdrCngFlg
	 */
	public String getBdrCngFlg() {
		return this.bdrCngFlg;
	}
	
	/**
	 * Column Info
	 * @return orgCntNm
	 */
	public String getOrgCntNm() {
		return this.orgCntNm;
	}
	
	/**
	 * Column Info
	 * @return preVslNm
	 */
	public String getPreVslNm() {
		return this.preVslNm;
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
	 * @return corrUsrId
	 */
	public String getCorrUsrId() {
		return this.corrUsrId;
	}
	
	/**
	 * Column Info
	 * @return corrN1stDt
	 */
	public String getCorrN1stDt() {
		return this.corrN1stDt;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
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
	 * @return porNm
	 */
	public String getPorNm() {
		return this.porNm;
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
	 * @return blObrdDt
	 */
	public String getBlObrdDt() {
		return this.blObrdDt;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return ibMfCfmFlg
	 */
	public String getIbMfCfmFlg() {
		return this.ibMfCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return audErrCtnt
	 */
	public String getAudErrCtnt() {
		return this.audErrCtnt;
	}
	
	/**
	 * Column Info
	 * @return bdrFlg
	 */
	public String getBdrFlg() {
		return this.bdrFlg;
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
	 * @return bkgClzCngFlg
	 */
	public String getBkgClzCngFlg() {
		return this.bkgClzCngFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgClzFlg
	 */
	public String getBkgClzFlg() {
		return this.bkgClzFlg;
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
	 * @return actWgtPrnFlg
	 */
	public String getActWgtPrnFlg() {
		return this.actWgtPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return cstmsDesc
	 */
	public String getCstmsDesc() {
		return this.cstmsDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrCmdtDesc
	 */
	public String getCntrCmdtDesc() {
		return this.cntrCmdtDesc;
	}
	
	/**
	 * Column Info
	 * @return measQty
	 */
	public String getMeasQty() {
		return this.measQty;
	}
	
	/**
	 * Column Info
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
	}
	
	/**
	 * Column Info
	 * @return bdrDt
	 */
	public String getBdrDt() {
		return this.bdrDt;
	}
	
	/**
	 * Column Info
	 * @return bkgClzCngCfmFlg
	 */
	public String getBkgClzCngCfmFlg() {
		return this.bkgClzCngCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return corrGdt
	 */
	public String getCorrGdt() {
		return this.corrGdt;
	}
	
	/**
	 * Column Info
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	
	/**
	 * Column Info
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
	}
	
	/**
	 * Column Info
	 * @return corrOfcCd
	 */
	public String getCorrOfcCd() {
		return this.corrOfcCd;
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
	 * @return podNm
	 */
	public String getPodNm() {
		return this.podNm;
	}
	
	/**
	 * Column Info
	 * @return delNm
	 */
	public String getDelNm() {
		return this.delNm;
	}
	
	/**
	 * Column Info
	 * @return corrNo
	 */
	public String getCorrNo() {
		return this.corrNo;
	}
	
	/**
	 * Column Info
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
	}
	
	/**
	 * Column Info
	 * @return bdrGdt
	 */
	public String getBdrGdt() {
		return this.bdrGdt;
	}
	
	/**
	 * Column Info
	 * @return actWgt
	 */
	public String getActWgt() {
		return this.actWgt;
	}
	
	/**
	 * Column Info
	 * @return pckCmdtDesc
	 */
	public String getPckCmdtDesc() {
		return this.pckCmdtDesc;
	}
	

	/**
	 * Column Info
	 * @param corrRmk
	 */
	public void setCorrRmk(String corrRmk) {
		this.corrRmk = corrRmk;
	}
	
	/**
	 * Column Info
	 * @param mkDescCfmFlg
	 */
	public void setMkDescCfmFlg(String mkDescCfmFlg) {
		this.mkDescCfmFlg = mkDescCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param corrDt
	 */
	public void setCorrDt(String corrDt) {
		this.corrDt = corrDt;
	}
	
	/**
	 * Column Info
	 * @param spclCgoAuthKnt
	 */
	public void setSpclCgoAuthKnt(String spclCgoAuthKnt) {
		this.spclCgoAuthKnt = spclCgoAuthKnt;
	}
	
	/**
	 * Column Info
	 * @param polNm
	 */
	public void setPolNm(String polNm) {
		this.polNm = polNm;
	}
	
	/**
	 * Column Info
	 * @param hblTtlKnt
	 */
	public void setHblTtlKnt(String hblTtlKnt) {
		this.hblTtlKnt = hblTtlKnt;
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
	 * @param blMvTpNm
	 */
	public void setBlMvTpNm(String blMvTpNm) {
		this.blMvTpNm = blMvTpNm;
	}
	
	/**
	 * Column Info
	 * @param mstCvrdBlNo
	 */
	public void setMstCvrdBlNo(String mstCvrdBlNo) {
		this.mstCvrdBlNo = mstCvrdBlNo;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param fnlDestNm
	 */
	public void setFnlDestNm(String fnlDestNm) {
		this.fnlDestNm = fnlDestNm;
	}
	
	/**
	 * Column Info
	 * @param bisSysFlg
	 */
	public void setBisSysFlg(String bisSysFlg) {
		this.bisSysFlg = bisSysFlg;
	}
	
	/**
	 * Column Info
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param blObrdTpCd
	 */
	public void setBlObrdTpCd(String blObrdTpCd) {
		this.blObrdTpCd = blObrdTpCd;
	}
	
	/**
	 * Column Info
	 * @param ttlPckDesc
	 */
	public void setTtlPckDesc(String ttlPckDesc) {
		this.ttlPckDesc = ttlPckDesc;
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
	 * @param cobizAuthNo
	 */
	public void setCobizAuthNo(String cobizAuthNo) {
		this.cobizAuthNo = cobizAuthNo;
	}
	
	/**
	 * Column Info
	 * @param blCvrdTpCd
	 */
	public void setBlCvrdTpCd(String blCvrdTpCd) {
		this.blCvrdTpCd = blCvrdTpCd;
	}
	
	/**
	 * Column Info
	 * @param bdrCngFlg
	 */
	public void setBdrCngFlg(String bdrCngFlg) {
		this.bdrCngFlg = bdrCngFlg;
	}
	
	/**
	 * Column Info
	 * @param orgCntNm
	 */
	public void setOrgCntNm(String orgCntNm) {
		this.orgCntNm = orgCntNm;
	}
	
	/**
	 * Column Info
	 * @param preVslNm
	 */
	public void setPreVslNm(String preVslNm) {
		this.preVslNm = preVslNm;
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
	 * @param corrUsrId
	 */
	public void setCorrUsrId(String corrUsrId) {
		this.corrUsrId = corrUsrId;
	}
	
	/**
	 * Column Info
	 * @param corrN1stDt
	 */
	public void setCorrN1stDt(String corrN1stDt) {
		this.corrN1stDt = corrN1stDt;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
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
	 * @param porNm
	 */
	public void setPorNm(String porNm) {
		this.porNm = porNm;
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
	 * @param blObrdDt
	 */
	public void setBlObrdDt(String blObrdDt) {
		this.blObrdDt = blObrdDt;
	}
	
	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param ibMfCfmFlg
	 */
	public void setIbMfCfmFlg(String ibMfCfmFlg) {
		this.ibMfCfmFlg = ibMfCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param audErrCtnt
	 */
	public void setAudErrCtnt(String audErrCtnt) {
		this.audErrCtnt = audErrCtnt;
	}
	
	/**
	 * Column Info
	 * @param bdrFlg
	 */
	public void setBdrFlg(String bdrFlg) {
		this.bdrFlg = bdrFlg;
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
	 * @param bkgClzCngFlg
	 */
	public void setBkgClzCngFlg(String bkgClzCngFlg) {
		this.bkgClzCngFlg = bkgClzCngFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgClzFlg
	 */
	public void setBkgClzFlg(String bkgClzFlg) {
		this.bkgClzFlg = bkgClzFlg;
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
	 * @param actWgtPrnFlg
	 */
	public void setActWgtPrnFlg(String actWgtPrnFlg) {
		this.actWgtPrnFlg = actWgtPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param cstmsDesc
	 */
	public void setCstmsDesc(String cstmsDesc) {
		this.cstmsDesc = cstmsDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrCmdtDesc
	 */
	public void setCntrCmdtDesc(String cntrCmdtDesc) {
		this.cntrCmdtDesc = cntrCmdtDesc;
	}
	
	/**
	 * Column Info
	 * @param measQty
	 */
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
	}
	
	/**
	 * Column Info
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
	}
	
	/**
	 * Column Info
	 * @param bdrDt
	 */
	public void setBdrDt(String bdrDt) {
		this.bdrDt = bdrDt;
	}
	
	/**
	 * Column Info
	 * @param bkgClzCngCfmFlg
	 */
	public void setBkgClzCngCfmFlg(String bkgClzCngCfmFlg) {
		this.bkgClzCngCfmFlg = bkgClzCngCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param corrGdt
	 */
	public void setCorrGdt(String corrGdt) {
		this.corrGdt = corrGdt;
	}
	
	/**
	 * Column Info
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
	}
	
	/**
	 * Column Info
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
	}
	
	/**
	 * Column Info
	 * @param corrOfcCd
	 */
	public void setCorrOfcCd(String corrOfcCd) {
		this.corrOfcCd = corrOfcCd;
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
	 * @param podNm
	 */
	public void setPodNm(String podNm) {
		this.podNm = podNm;
	}
	
	/**
	 * Column Info
	 * @param delNm
	 */
	public void setDelNm(String delNm) {
		this.delNm = delNm;
	}
	
	/**
	 * Column Info
	 * @param corrNo
	 */
	public void setCorrNo(String corrNo) {
		this.corrNo = corrNo;
	}
	
	/**
	 * Column Info
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
	}
	
	/**
	 * Column Info
	 * @param bdrGdt
	 */
	public void setBdrGdt(String bdrGdt) {
		this.bdrGdt = bdrGdt;
	}
	
	/**
	 * Column Info
	 * @param actWgt
	 */
	public void setActWgt(String actWgt) {
		this.actWgt = actWgt;
	}
	
	/**
	 * Column Info
	 * @param pckCmdtDesc
	 */
	public void setPckCmdtDesc(String pckCmdtDesc) {
		this.pckCmdtDesc = pckCmdtDesc;
	}
	
	/**
	 * @return the measQtyPrnFlg
	 */
	public String getMeasQtyPrnFlg() {
		return measQtyPrnFlg;
	}

	/**
	 * @param measQtyPrnFlg the measQtyPrnFlg to set
	 */
	public void setMeasQtyPrnFlg(String measQtyPrnFlg) {
		this.measQtyPrnFlg = measQtyPrnFlg;
	}
	
	/**
	 * @return the cntrWgtPrnFlg
	 */
	public String getCntrWgtPrnFlg() {
		return cntrWgtPrnFlg;
	}

	/**
	 * @param cntrWgtPrnFlg the cntrWgtPrnFlg to set
	 */
	public void setCntrWgtPrnFlg(String cntrWgtPrnFlg) {
		this.cntrWgtPrnFlg = cntrWgtPrnFlg;
	}

	/**
	 * @return the cntrMeasPrnFlg
	 */
	public String getCntrMeasPrnFlg() {
		return cntrMeasPrnFlg;
	}
	
	/**
	 * @return the mkDescPrnFlg
	 */
	public String getMkDescPrnFlg() {
		return mkDescPrnFlg;
	}

	/**
	 * @param mkDescPrnFlg the mkDescPrnFlg to set
	 */
	public void setMkDescPrnFlg(String mkDescPrnFlg) {
		this.mkDescPrnFlg = mkDescPrnFlg;
	}
	
	/**
	 * @return the mfDescPrnFlg
	 */
	public String getMfDescPrnFlg() {
		return mfDescPrnFlg;
	}

	/**
	 * @param mfDescPrnFlg the mfDescPrnFlg to set
	 */
	public void setMfDescPrnFlg(String mfDescPrnFlg) {
		this.mfDescPrnFlg = mfDescPrnFlg;
	}
	/**
	 * @param cntrMeasPrnFlg the cntrMeasPrnFlg to set
	 */
	public void setCntrMeasPrnFlg(String cntrMeasPrnFlg) {
		this.cntrMeasPrnFlg = cntrMeasPrnFlg;
	}
	/**
	 * @return the frtPayOfcPrnFlg
	 */
	public String getFrtPayOfcPrnFlg() {
		return frtPayOfcPrnFlg;
	}

	/**
	 * @param frtPayOfcPrnFlg the frtPayOfcPrnFlg to set
	 */
	public void setFrtPayOfcPrnFlg(String frtPayOfcPrnFlg) {
		this.frtPayOfcPrnFlg = frtPayOfcPrnFlg;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCorrRmk(JSPUtil.getParameter(request, "corr_rmk", ""));
		setMkDescCfmFlg(JSPUtil.getParameter(request, "mk_desc_cfm_flg", ""));
		setCorrDt(JSPUtil.getParameter(request, "corr_dt", ""));
		setSpclCgoAuthKnt(JSPUtil.getParameter(request, "spcl_cgo_auth_knt", ""));
		setPolNm(JSPUtil.getParameter(request, "pol_nm", ""));
		setHblTtlKnt(JSPUtil.getParameter(request, "hbl_ttl_knt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBlMvTpNm(JSPUtil.getParameter(request, "bl_mv_tp_nm", ""));
		setMstCvrdBlNo(JSPUtil.getParameter(request, "mst_cvrd_bl_no", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setFnlDestNm(JSPUtil.getParameter(request, "fnl_dest_nm", ""));
		setBisSysFlg(JSPUtil.getParameter(request, "bis_sys_flg", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setBlObrdTpCd(JSPUtil.getParameter(request, "bl_obrd_tp_cd", ""));
		setTtlPckDesc(JSPUtil.getParameter(request, "ttl_pck_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCobizAuthNo(JSPUtil.getParameter(request, "cobiz_auth_no", ""));
		setBlCvrdTpCd(JSPUtil.getParameter(request, "bl_cvrd_tp_cd", ""));
		setBdrCngFlg(JSPUtil.getParameter(request, "bdr_cng_flg", ""));
		setOrgCntNm(JSPUtil.getParameter(request, "org_cnt_nm", ""));
		setPreVslNm(JSPUtil.getParameter(request, "pre_vsl_nm", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setCorrUsrId(JSPUtil.getParameter(request, "corr_usr_id", ""));
		setCorrN1stDt(JSPUtil.getParameter(request, "corr_n1st_dt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPorNm(JSPUtil.getParameter(request, "por_nm", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setBlObrdDt(JSPUtil.getParameter(request, "bl_obrd_dt", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setIbMfCfmFlg(JSPUtil.getParameter(request, "ib_mf_cfm_flg", ""));
		setAudErrCtnt(JSPUtil.getParameter(request, "aud_err_ctnt", ""));
		setBdrFlg(JSPUtil.getParameter(request, "bdr_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgClzCngFlg(JSPUtil.getParameter(request, "bkg_clz_cng_flg", ""));
		setBkgClzFlg(JSPUtil.getParameter(request, "bkg_clz_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setActWgtPrnFlg(JSPUtil.getParameter(request, "act_wgt_prn_flg", ""));
		setCstmsDesc(JSPUtil.getParameter(request, "cstms_desc", ""));
		setCntrCmdtDesc(JSPUtil.getParameter(request, "cntr_cmdt_desc", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setBdrDt(JSPUtil.getParameter(request, "bdr_dt", ""));
		setBkgClzCngCfmFlg(JSPUtil.getParameter(request, "bkg_clz_cng_cfm_flg", ""));
		setCorrGdt(JSPUtil.getParameter(request, "corr_gdt", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setCorrOfcCd(JSPUtil.getParameter(request, "corr_ofc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPodNm(JSPUtil.getParameter(request, "pod_nm", ""));
		setDelNm(JSPUtil.getParameter(request, "del_nm", ""));
		setCorrNo(JSPUtil.getParameter(request, "corr_no", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setBdrGdt(JSPUtil.getParameter(request, "bdr_gdt", ""));
		setActWgt(JSPUtil.getParameter(request, "act_wgt", ""));
		setPckCmdtDesc(JSPUtil.getParameter(request, "pck_cmdt_desc", ""));
		setMeasQtyPrnFlg(JSPUtil.getParameter(request, "meas_qty_prn_flg", ""));
		setCntrWgtPrnFlg(JSPUtil.getParameter(request, "cntr_wgt_prn_flg", ""));
		setCntrMeasPrnFlg(JSPUtil.getParameter(request, "cntr_meas_prn_flg", ""));
		setMkDescPrnFlg(JSPUtil.getParameter(request, "mk_desc_prn_flg", ""));
		setMfDescPrnFlg(JSPUtil.getParameter(request, "mf_desc_prn_flg", ""));
		setFrtPayOfcPrnFlg(JSPUtil.getParameter(request, "frt_pay_ofc_prn_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgBlDocVO[]
	 */
	public BkgBlDocVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgBlDocVO[]
	 */
	public BkgBlDocVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgBlDocVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] corrRmk = (JSPUtil.getParameter(request, prefix	+ "corr_rmk", length));
			String[] mkDescCfmFlg = (JSPUtil.getParameter(request, prefix	+ "mk_desc_cfm_flg", length));
			String[] corrDt = (JSPUtil.getParameter(request, prefix	+ "corr_dt", length));
			String[] spclCgoAuthKnt = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_auth_knt", length));
			String[] polNm = (JSPUtil.getParameter(request, prefix	+ "pol_nm", length));
			String[] hblTtlKnt = (JSPUtil.getParameter(request, prefix	+ "hbl_ttl_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] blMvTpNm = (JSPUtil.getParameter(request, prefix	+ "bl_mv_tp_nm", length));
			String[] mstCvrdBlNo = (JSPUtil.getParameter(request, prefix	+ "mst_cvrd_bl_no", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] fnlDestNm = (JSPUtil.getParameter(request, prefix	+ "fnl_dest_nm", length));
			String[] bisSysFlg = (JSPUtil.getParameter(request, prefix	+ "bis_sys_flg", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] blObrdTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_obrd_tp_cd", length));
			String[] ttlPckDesc = (JSPUtil.getParameter(request, prefix	+ "ttl_pck_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cobizAuthNo = (JSPUtil.getParameter(request, prefix	+ "cobiz_auth_no", length));
			String[] blCvrdTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_cvrd_tp_cd", length));
			String[] bdrCngFlg = (JSPUtil.getParameter(request, prefix	+ "bdr_cng_flg", length));
			String[] orgCntNm = (JSPUtil.getParameter(request, prefix	+ "org_cnt_nm", length));
			String[] preVslNm = (JSPUtil.getParameter(request, prefix	+ "pre_vsl_nm", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] corrUsrId = (JSPUtil.getParameter(request, prefix	+ "corr_usr_id", length));
			String[] corrN1stDt = (JSPUtil.getParameter(request, prefix	+ "corr_n1st_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] porNm = (JSPUtil.getParameter(request, prefix	+ "por_nm", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] blObrdDt = (JSPUtil.getParameter(request, prefix	+ "bl_obrd_dt", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] ibMfCfmFlg = (JSPUtil.getParameter(request, prefix	+ "ib_mf_cfm_flg", length));
			String[] audErrCtnt = (JSPUtil.getParameter(request, prefix	+ "aud_err_ctnt", length));
			String[] bdrFlg = (JSPUtil.getParameter(request, prefix	+ "bdr_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgClzCngFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_clz_cng_flg", length));
			String[] bkgClzFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_clz_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] actWgtPrnFlg = (JSPUtil.getParameter(request, prefix	+ "act_wgt_prn_flg", length));
			String[] cstmsDesc = (JSPUtil.getParameter(request, prefix	+ "cstms_desc", length));
			String[] cntrCmdtDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_cmdt_desc", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] bdrDt = (JSPUtil.getParameter(request, prefix	+ "bdr_dt", length));
			String[] bkgClzCngCfmFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_clz_cng_cfm_flg", length));
			String[] corrGdt = (JSPUtil.getParameter(request, prefix	+ "corr_gdt", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] corrOfcCd = (JSPUtil.getParameter(request, prefix	+ "corr_ofc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] podNm = (JSPUtil.getParameter(request, prefix	+ "pod_nm", length));
			String[] delNm = (JSPUtil.getParameter(request, prefix	+ "del_nm", length));
			String[] corrNo = (JSPUtil.getParameter(request, prefix	+ "corr_no", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] bdrGdt = (JSPUtil.getParameter(request, prefix	+ "bdr_gdt", length));
			String[] actWgt = (JSPUtil.getParameter(request, prefix	+ "act_wgt", length));
			String[] pckCmdtDesc = (JSPUtil.getParameter(request, prefix	+ "pck_cmdt_desc", length));
			String[] measQtyPrnFlg = (JSPUtil.getParameter(request, prefix	+ "meas_qty_prn_flg", length));
			String[] cntrWgtPrnFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt_prn_flg", length));
			String[] cntrMeasPrnFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_meas_prn_flg", length));
			String[] mkDescPrnFlg = (JSPUtil.getParameter(request, prefix	+ "mk_desc_prn_flg", length));
			String[] mfDescPrnFlg = (JSPUtil.getParameter(request, prefix	+ "mf_desc_prn_flg", length));
			String[] frtPayOfcPrnFlg = (JSPUtil.getParameter(request, prefix	+ "frt_pay_ofc_prn_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgBlDocVO();
				if (corrRmk[i] != null)
					model.setCorrRmk(corrRmk[i]);
				if (mkDescCfmFlg[i] != null)
					model.setMkDescCfmFlg(mkDescCfmFlg[i]);
				if (corrDt[i] != null)
					model.setCorrDt(corrDt[i]);
				if (spclCgoAuthKnt[i] != null)
					model.setSpclCgoAuthKnt(spclCgoAuthKnt[i]);
				if (polNm[i] != null)
					model.setPolNm(polNm[i]);
				if (hblTtlKnt[i] != null)
					model.setHblTtlKnt(hblTtlKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (blMvTpNm[i] != null)
					model.setBlMvTpNm(blMvTpNm[i]);
				if (mstCvrdBlNo[i] != null)
					model.setMstCvrdBlNo(mstCvrdBlNo[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (fnlDestNm[i] != null)
					model.setFnlDestNm(fnlDestNm[i]);
				if (bisSysFlg[i] != null)
					model.setBisSysFlg(bisSysFlg[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (blObrdTpCd[i] != null)
					model.setBlObrdTpCd(blObrdTpCd[i]);
				if (ttlPckDesc[i] != null)
					model.setTtlPckDesc(ttlPckDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cobizAuthNo[i] != null)
					model.setCobizAuthNo(cobizAuthNo[i]);
				if (blCvrdTpCd[i] != null)
					model.setBlCvrdTpCd(blCvrdTpCd[i]);
				if (bdrCngFlg[i] != null)
					model.setBdrCngFlg(bdrCngFlg[i]);
				if (orgCntNm[i] != null)
					model.setOrgCntNm(orgCntNm[i]);
				if (preVslNm[i] != null)
					model.setPreVslNm(preVslNm[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (corrUsrId[i] != null)
					model.setCorrUsrId(corrUsrId[i]);
				if (corrN1stDt[i] != null)
					model.setCorrN1stDt(corrN1stDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (porNm[i] != null)
					model.setPorNm(porNm[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (blObrdDt[i] != null)
					model.setBlObrdDt(blObrdDt[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (ibMfCfmFlg[i] != null)
					model.setIbMfCfmFlg(ibMfCfmFlg[i]);
				if (audErrCtnt[i] != null)
					model.setAudErrCtnt(audErrCtnt[i]);
				if (bdrFlg[i] != null)
					model.setBdrFlg(bdrFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgClzCngFlg[i] != null)
					model.setBkgClzCngFlg(bkgClzCngFlg[i]);
				if (bkgClzFlg[i] != null)
					model.setBkgClzFlg(bkgClzFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (actWgtPrnFlg[i] != null)
					model.setActWgtPrnFlg(actWgtPrnFlg[i]);
				if (cstmsDesc[i] != null)
					model.setCstmsDesc(cstmsDesc[i]);
				if (cntrCmdtDesc[i] != null)
					model.setCntrCmdtDesc(cntrCmdtDesc[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (bdrDt[i] != null)
					model.setBdrDt(bdrDt[i]);
				if (bkgClzCngCfmFlg[i] != null)
					model.setBkgClzCngCfmFlg(bkgClzCngCfmFlg[i]);
				if (corrGdt[i] != null)
					model.setCorrGdt(corrGdt[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (corrOfcCd[i] != null)
					model.setCorrOfcCd(corrOfcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (podNm[i] != null)
					model.setPodNm(podNm[i]);
				if (delNm[i] != null)
					model.setDelNm(delNm[i]);
				if (corrNo[i] != null)
					model.setCorrNo(corrNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (bdrGdt[i] != null)
					model.setBdrGdt(bdrGdt[i]);
				if (actWgt[i] != null)
					model.setActWgt(actWgt[i]);
				if (pckCmdtDesc[i] != null)
					model.setPckCmdtDesc(pckCmdtDesc[i]);
				if (measQtyPrnFlg[i] != null)
					model.setMeasQtyPrnFlg(measQtyPrnFlg[i]);
				if (cntrWgtPrnFlg[i] != null)
					model.setCntrWgtPrnFlg(cntrWgtPrnFlg[i]);
				if (cntrMeasPrnFlg[i] != null)
					model.setCntrMeasPrnFlg(cntrMeasPrnFlg[i]);
				if (mkDescPrnFlg[i] != null)
					model.setMkDescPrnFlg(mkDescPrnFlg[i]);
				if (mfDescPrnFlg[i] != null)
					model.setMfDescPrnFlg(mfDescPrnFlg[i]);
				if (frtPayOfcPrnFlg[i] != null)
					model.setFrtPayOfcPrnFlg(frtPayOfcPrnFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgBlDocVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgBlDocVO[]
	 */
	public BkgBlDocVO[] getBkgBlDocVOs(){
		BkgBlDocVO[] vos = (BkgBlDocVO[])models.toArray(new BkgBlDocVO[models.size()]);
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
		this.corrRmk = this.corrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mkDescCfmFlg = this.mkDescCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrDt = this.corrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAuthKnt = this.spclCgoAuthKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polNm = this.polNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblTtlKnt = this.hblTtlKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blMvTpNm = this.blMvTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mstCvrdBlNo = this.mstCvrdBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlDestNm = this.fnlDestNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bisSysFlg = this.bisSysFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blObrdTpCd = this.blObrdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlPckDesc = this.ttlPckDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cobizAuthNo = this.cobizAuthNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCvrdTpCd = this.blCvrdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrCngFlg = this.bdrCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCntNm = this.orgCntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preVslNm = this.preVslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrUsrId = this.corrUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrN1stDt = this.corrN1stDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNm = this.porNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blObrdDt = this.blObrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibMfCfmFlg = this.ibMfCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.audErrCtnt = this.audErrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrFlg = this.bdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgClzCngFlg = this.bkgClzCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgClzFlg = this.bkgClzFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actWgtPrnFlg = this.actWgtPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsDesc = this.cstmsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCmdtDesc = this.cntrCmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrDt = this.bdrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgClzCngCfmFlg = this.bkgClzCngCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrGdt = this.corrGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrOfcCd = this.corrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNm = this.podNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNm = this.delNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNo = this.corrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrGdt = this.bdrGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actWgt = this.actWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckCmdtDesc = this.pckCmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQtyPrnFlg = this.measQtyPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgtPrnFlg = this.cntrWgtPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMeasPrnFlg = this.cntrMeasPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mkDescPrnFlg = this.mkDescPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfDescPrnFlg = this.mfDescPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtPayOfcPrnFlg = this.frtPayOfcPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
