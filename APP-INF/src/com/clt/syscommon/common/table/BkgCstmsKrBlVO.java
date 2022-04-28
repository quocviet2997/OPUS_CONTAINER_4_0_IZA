/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : BkgCstmsKrBlVO.java
*@FileTitle : BkgCstmsKrBlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.11
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.11  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class BkgCstmsKrBlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrBlVO> models = new ArrayList<BkgCstmsKrBlVO>();
	
	/* Column Info */
	private String crsChkRsltFlg = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String dchgSndUsrId = null;
	/* Column Info */
	private String ibEtaDt = null;
	/* Column Info */
	private String etaDt = null;
	/* Column Info */
	private String crsChkRmk = null;
	/* Column Info */
	private String mfSndFlg = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String krBlAmdtStsCd = null;
	/* Column Info */
	private String dmstPortCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String evntYdCd = null;
	/* Column Info */
	private String cgoTrspCd = null;
	/* Column Info */
	private String krPortAuthCd = null;
	/* Column Info */
	private String cgoDesc2 = null;
	/* Column Info */
	private String krCstmsWhTpCd = null;
	/* Column Info */
	private String cgoDesc1 = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trnsSeq = null;
	/* Column Info */
	private String ibSkdVoyNo = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ibCstmsDeclTpCd = null;
	/* Column Info */
	private String ibMtyBlNo = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String blMeasUtCd = null;
	/* Column Info */
	private String krMeasUtCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cstmsFwrdId = null;
	/* Column Info */
	private String bizRgstNo = null;
	/* Column Info */
	private String ibTrnsSeq = null;
	/* Column Info */
	private String mstBlSeqNo = null;
	/* Column Info */
	private String cntrTtlWgt = null;
	/* Column Info */
	private String tsPodCd = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String ibSkdDirCd = null;
	/* Column Info */
	private String krCstmsDeptCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String krWhCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cstmsDeclTpCd = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String krCstmsBlTpCd = null;
	/* Column Info */
	private String mfSndDt = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String ibDmstPortCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String cstmsOfcCtyCd = null;
	/* Column Info */
	private String mfSndUsrId = null;
	/* Column Info */
	private String rspnRcvDt = null;
	/* Column Info */
	private String krCstmsBndCd = null;
	/* Column Info */
	private String tsPolCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dchgRptDt = null;
	/* Column Info */
	private String bbCgoMeasQty = null;
	/* Column Info */
	private String bbCgoWgt = null;
	/* Column Info */
	private String portTmlCd = null;
	/* Column Info */
	private String n2ndImdgClssCd = null;
	/* Column Info */
	private String etdDt = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String bdAreaCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String frtFwrdCd = null;
	/* Column Info */
	private String ibMtyBkgNo = null;
	/* Column Info */
	private String mfSndGdt = null;
	/* Column Info */
	private String mfSndRcvrId = null;
	/* Column Info */
	private String n3rdImdgClssCd = null;
	/* Column Info */
	private String cstmsBlNo = null;
	/* Column Info */
	private String mfDlDiffFlg = null;
	/* Column Info */
	private String ibVslCd = null;
	/* Column Info */
	private String deltGdt = null;
	/* Column Info */
	private String deltUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgCstmsKrBlVO() {}

	public BkgCstmsKrBlVO(String ibflag, String pagerows, String bkgNo, String cstmsDeclTpCd, String dmstPortCd, String trnsSeq, String cstmsBlNo, String vslCd, String skdVoyNo, String skdDirCd, String blNo, String porCd, String polCd, String podCd, String delCd, String mstBlSeqNo, String krCstmsBlTpCd, String tsPolCd, String tsPodCd, String pckQty, String pckTpCd, String cntrTtlWgt, String wgtUtCd, String measQty, String blMeasUtCd, String bdAreaCd, String imdgClssCd, String krCstmsWhTpCd, String krWhCd, String krBlAmdtStsCd, String cgoDesc1, String cgoDesc2, String frtFwrdCd, String bkgCgoTpCd, String krCstmsBndCd, String mfSndDt, String mfSndGdt, String mfSndUsrId, String rspnRcvDt, String dchgRptDt, String dchgSndUsrId, String deltFlg, String deltDt, String deltGdt, String deltUsrId, String cstmsOfcCtyCd, String krCstmsDeptCd, String cmdtCd, String krMeasUtCd, String bizRgstNo, String bbCgoWgt, String bbCgoMeasQty, String n2ndImdgClssCd, String n3rdImdgClssCd, String krPortAuthCd, String cstmsFwrdId, String cgoTrspCd, String portTmlCd, String etaDt, String etdDt, String ibMtyBkgNo, String ibMtyBlNo, String ibTrnsSeq, String ibCstmsDeclTpCd, String ibDmstPortCd, String ibVslCd, String ibSkdVoyNo, String ibSkdDirCd, String ibEtaDt, String creUsrId, String creDt, String updUsrId, String updDt, String mfSndRcvrId, String mfDlDiffFlg, String mfSndFlg, String crsChkRsltFlg, String crsChkRmk, String edwUpdDt, String evntYdCd) {
		this.crsChkRsltFlg = crsChkRsltFlg;
		this.vslCd = vslCd;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.dchgSndUsrId = dchgSndUsrId;
		this.ibEtaDt = ibEtaDt;
		this.etaDt = etaDt;
		this.crsChkRmk = crsChkRmk;
		this.mfSndFlg = mfSndFlg;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.krBlAmdtStsCd = krBlAmdtStsCd;
		this.dmstPortCd = dmstPortCd;
		this.polCd = polCd;
		this.evntYdCd = evntYdCd;
		this.cgoTrspCd = cgoTrspCd;
		this.krPortAuthCd = krPortAuthCd;
		this.cgoDesc2 = cgoDesc2;
		this.krCstmsWhTpCd = krCstmsWhTpCd;
		this.cgoDesc1 = cgoDesc1;
		this.wgtUtCd = wgtUtCd;
		this.updUsrId = updUsrId;
		this.trnsSeq = trnsSeq;
		this.ibSkdVoyNo = ibSkdVoyNo;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.ibCstmsDeclTpCd = ibCstmsDeclTpCd;
		this.ibMtyBlNo = ibMtyBlNo;
		this.podCd = podCd;
		this.blMeasUtCd = blMeasUtCd;
		this.krMeasUtCd = krMeasUtCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.cstmsFwrdId = cstmsFwrdId;
		this.bizRgstNo = bizRgstNo;
		this.ibTrnsSeq = ibTrnsSeq;
		this.mstBlSeqNo = mstBlSeqNo;
		this.cntrTtlWgt = cntrTtlWgt;
		this.tsPodCd = tsPodCd;
		this.imdgClssCd = imdgClssCd;
		this.porCd = porCd;
		this.ibSkdDirCd = ibSkdDirCd;
		this.krCstmsDeptCd = krCstmsDeptCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.krWhCd = krWhCd;
		this.ibflag = ibflag;
		this.cstmsDeclTpCd = cstmsDeclTpCd;
		this.cmdtCd = cmdtCd;
		this.krCstmsBlTpCd = krCstmsBlTpCd;
		this.mfSndDt = mfSndDt;
		this.measQty = measQty;
		this.pckQty = pckQty;
		this.ibDmstPortCd = ibDmstPortCd;
		this.pckTpCd = pckTpCd;
		this.cstmsOfcCtyCd = cstmsOfcCtyCd;
		this.mfSndUsrId = mfSndUsrId;
		this.rspnRcvDt = rspnRcvDt;
		this.krCstmsBndCd = krCstmsBndCd;
		this.tsPolCd = tsPolCd;
		this.updDt = updDt;
		this.dchgRptDt = dchgRptDt;
		this.bbCgoMeasQty = bbCgoMeasQty;
		this.bbCgoWgt = bbCgoWgt;
		this.portTmlCd = portTmlCd;
		this.n2ndImdgClssCd = n2ndImdgClssCd;
		this.etdDt = etdDt;
		this.deltDt = deltDt;
		this.bdAreaCd = bdAreaCd;
		this.skdDirCd = skdDirCd;
		this.frtFwrdCd = frtFwrdCd;
		this.ibMtyBkgNo = ibMtyBkgNo;
		this.mfSndGdt = mfSndGdt;
		this.mfSndRcvrId = mfSndRcvrId;
		this.n3rdImdgClssCd = n3rdImdgClssCd;
		this.cstmsBlNo = cstmsBlNo;
		this.mfDlDiffFlg = mfDlDiffFlg;
		this.ibVslCd = ibVslCd;
		this.deltGdt = deltGdt;
		this.deltUsrId = deltUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("crs_chk_rslt_flg", getCrsChkRsltFlg());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("dchg_snd_usr_id", getDchgSndUsrId());
		this.hashColumns.put("ib_eta_dt", getIbEtaDt());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("crs_chk_rmk", getCrsChkRmk());
		this.hashColumns.put("mf_snd_flg", getMfSndFlg());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("kr_bl_amdt_sts_cd", getKrBlAmdtStsCd());
		this.hashColumns.put("dmst_port_cd", getDmstPortCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("evnt_yd_cd", getEvntYdCd());
		this.hashColumns.put("cgo_trsp_cd", getCgoTrspCd());
		this.hashColumns.put("kr_port_auth_cd", getKrPortAuthCd());
		this.hashColumns.put("cgo_desc2", getCgoDesc2());
		this.hashColumns.put("kr_cstms_wh_tp_cd", getKrCstmsWhTpCd());
		this.hashColumns.put("cgo_desc1", getCgoDesc1());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trns_seq", getTrnsSeq());
		this.hashColumns.put("ib_skd_voy_no", getIbSkdVoyNo());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("ib_cstms_decl_tp_cd", getIbCstmsDeclTpCd());
		this.hashColumns.put("ib_mty_bl_no", getIbMtyBlNo());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("bl_meas_ut_cd", getBlMeasUtCd());
		this.hashColumns.put("kr_meas_ut_cd", getKrMeasUtCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cstms_fwrd_id", getCstmsFwrdId());
		this.hashColumns.put("biz_rgst_no", getBizRgstNo());
		this.hashColumns.put("ib_trns_seq", getIbTrnsSeq());
		this.hashColumns.put("mst_bl_seq_no", getMstBlSeqNo());
		this.hashColumns.put("cntr_ttl_wgt", getCntrTtlWgt());
		this.hashColumns.put("ts_pod_cd", getTsPodCd());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("ib_skd_dir_cd", getIbSkdDirCd());
		this.hashColumns.put("kr_cstms_dept_cd", getKrCstmsDeptCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("kr_wh_cd", getKrWhCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cstms_decl_tp_cd", getCstmsDeclTpCd());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("kr_cstms_bl_tp_cd", getKrCstmsBlTpCd());
		this.hashColumns.put("mf_snd_dt", getMfSndDt());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("ib_dmst_port_cd", getIbDmstPortCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("cstms_ofc_cty_cd", getCstmsOfcCtyCd());
		this.hashColumns.put("mf_snd_usr_id", getMfSndUsrId());
		this.hashColumns.put("rspn_rcv_dt", getRspnRcvDt());
		this.hashColumns.put("kr_cstms_bnd_cd", getKrCstmsBndCd());
		this.hashColumns.put("ts_pol_cd", getTsPolCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dchg_rpt_dt", getDchgRptDt());
		this.hashColumns.put("bb_cgo_meas_qty", getBbCgoMeasQty());
		this.hashColumns.put("bb_cgo_wgt", getBbCgoWgt());
		this.hashColumns.put("port_tml_cd", getPortTmlCd());
		this.hashColumns.put("n2nd_imdg_clss_cd", getN2ndImdgClssCd());
		this.hashColumns.put("etd_dt", getEtdDt());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("bd_area_cd", getBdAreaCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("frt_fwrd_cd", getFrtFwrdCd());
		this.hashColumns.put("ib_mty_bkg_no", getIbMtyBkgNo());
		this.hashColumns.put("mf_snd_gdt", getMfSndGdt());
		this.hashColumns.put("mf_snd_rcvr_id", getMfSndRcvrId());
		this.hashColumns.put("n3rd_imdg_clss_cd", getN3rdImdgClssCd());
		this.hashColumns.put("cstms_bl_no", getCstmsBlNo());
		this.hashColumns.put("mf_dl_diff_flg", getMfDlDiffFlg());
		this.hashColumns.put("ib_vsl_cd", getIbVslCd());
		this.hashColumns.put("delt_gdt", getDeltGdt());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("crs_chk_rslt_flg", "crsChkRsltFlg");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("dchg_snd_usr_id", "dchgSndUsrId");
		this.hashFields.put("ib_eta_dt", "ibEtaDt");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("crs_chk_rmk", "crsChkRmk");
		this.hashFields.put("mf_snd_flg", "mfSndFlg");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("kr_bl_amdt_sts_cd", "krBlAmdtStsCd");
		this.hashFields.put("dmst_port_cd", "dmstPortCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("evnt_yd_cd", "evntYdCd");
		this.hashFields.put("cgo_trsp_cd", "cgoTrspCd");
		this.hashFields.put("kr_port_auth_cd", "krPortAuthCd");
		this.hashFields.put("cgo_desc2", "cgoDesc2");
		this.hashFields.put("kr_cstms_wh_tp_cd", "krCstmsWhTpCd");
		this.hashFields.put("cgo_desc1", "cgoDesc1");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trns_seq", "trnsSeq");
		this.hashFields.put("ib_skd_voy_no", "ibSkdVoyNo");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("ib_cstms_decl_tp_cd", "ibCstmsDeclTpCd");
		this.hashFields.put("ib_mty_bl_no", "ibMtyBlNo");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("bl_meas_ut_cd", "blMeasUtCd");
		this.hashFields.put("kr_meas_ut_cd", "krMeasUtCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cstms_fwrd_id", "cstmsFwrdId");
		this.hashFields.put("biz_rgst_no", "bizRgstNo");
		this.hashFields.put("ib_trns_seq", "ibTrnsSeq");
		this.hashFields.put("mst_bl_seq_no", "mstBlSeqNo");
		this.hashFields.put("cntr_ttl_wgt", "cntrTtlWgt");
		this.hashFields.put("ts_pod_cd", "tsPodCd");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("ib_skd_dir_cd", "ibSkdDirCd");
		this.hashFields.put("kr_cstms_dept_cd", "krCstmsDeptCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("kr_wh_cd", "krWhCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cstms_decl_tp_cd", "cstmsDeclTpCd");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("kr_cstms_bl_tp_cd", "krCstmsBlTpCd");
		this.hashFields.put("mf_snd_dt", "mfSndDt");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("ib_dmst_port_cd", "ibDmstPortCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("cstms_ofc_cty_cd", "cstmsOfcCtyCd");
		this.hashFields.put("mf_snd_usr_id", "mfSndUsrId");
		this.hashFields.put("rspn_rcv_dt", "rspnRcvDt");
		this.hashFields.put("kr_cstms_bnd_cd", "krCstmsBndCd");
		this.hashFields.put("ts_pol_cd", "tsPolCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dchg_rpt_dt", "dchgRptDt");
		this.hashFields.put("bb_cgo_meas_qty", "bbCgoMeasQty");
		this.hashFields.put("bb_cgo_wgt", "bbCgoWgt");
		this.hashFields.put("port_tml_cd", "portTmlCd");
		this.hashFields.put("n2nd_imdg_clss_cd", "n2ndImdgClssCd");
		this.hashFields.put("etd_dt", "etdDt");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("bd_area_cd", "bdAreaCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("frt_fwrd_cd", "frtFwrdCd");
		this.hashFields.put("ib_mty_bkg_no", "ibMtyBkgNo");
		this.hashFields.put("mf_snd_gdt", "mfSndGdt");
		this.hashFields.put("mf_snd_rcvr_id", "mfSndRcvrId");
		this.hashFields.put("n3rd_imdg_clss_cd", "n3rdImdgClssCd");
		this.hashFields.put("cstms_bl_no", "cstmsBlNo");
		this.hashFields.put("mf_dl_diff_flg", "mfDlDiffFlg");
		this.hashFields.put("ib_vsl_cd", "ibVslCd");
		this.hashFields.put("delt_gdt", "deltGdt");
		this.hashFields.put("delt_usr_id", "deltUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return crsChkRsltFlg
	 */
	public String getCrsChkRsltFlg() {
		return this.crsChkRsltFlg;
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
	 * @return bkgCgoTpCd
	 */
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return dchgSndUsrId
	 */
	public String getDchgSndUsrId() {
		return this.dchgSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return ibEtaDt
	 */
	public String getIbEtaDt() {
		return this.ibEtaDt;
	}
	
	/**
	 * Column Info
	 * @return etaDt
	 */
	public String getEtaDt() {
		return this.etaDt;
	}
	
	/**
	 * Column Info
	 * @return crsChkRmk
	 */
	public String getCrsChkRmk() {
		return this.crsChkRmk;
	}
	
	/**
	 * Column Info
	 * @return mfSndFlg
	 */
	public String getMfSndFlg() {
		return this.mfSndFlg;
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
	 * @return krBlAmdtStsCd
	 */
	public String getKrBlAmdtStsCd() {
		return this.krBlAmdtStsCd;
	}
	
	/**
	 * Column Info
	 * @return dmstPortCd
	 */
	public String getDmstPortCd() {
		return this.dmstPortCd;
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
	 * @return evntYdCd
	 */
	public String getEvntYdCd() {
		return this.evntYdCd;
	}
	
	/**
	 * Column Info
	 * @return cgoTrspCd
	 */
	public String getCgoTrspCd() {
		return this.cgoTrspCd;
	}
	
	/**
	 * Column Info
	 * @return krPortAuthCd
	 */
	public String getKrPortAuthCd() {
		return this.krPortAuthCd;
	}
	
	/**
	 * Column Info
	 * @return cgoDesc2
	 */
	public String getCgoDesc2() {
		return this.cgoDesc2;
	}
	
	/**
	 * Column Info
	 * @return krCstmsWhTpCd
	 */
	public String getKrCstmsWhTpCd() {
		return this.krCstmsWhTpCd;
	}
	
	/**
	 * Column Info
	 * @return cgoDesc1
	 */
	public String getCgoDesc1() {
		return this.cgoDesc1;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return trnsSeq
	 */
	public String getTrnsSeq() {
		return this.trnsSeq;
	}
	
	/**
	 * Column Info
	 * @return ibSkdVoyNo
	 */
	public String getIbSkdVoyNo() {
		return this.ibSkdVoyNo;
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
	 * @return ibCstmsDeclTpCd
	 */
	public String getIbCstmsDeclTpCd() {
		return this.ibCstmsDeclTpCd;
	}
	
	/**
	 * Column Info
	 * @return ibMtyBlNo
	 */
	public String getIbMtyBlNo() {
		return this.ibMtyBlNo;
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
	 * @return blMeasUtCd
	 */
	public String getBlMeasUtCd() {
		return this.blMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return krMeasUtCd
	 */
	public String getKrMeasUtCd() {
		return this.krMeasUtCd;
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
	 * @return cstmsFwrdId
	 */
	public String getCstmsFwrdId() {
		return this.cstmsFwrdId;
	}
	
	/**
	 * Column Info
	 * @return bizRgstNo
	 */
	public String getBizRgstNo() {
		return this.bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @return ibTrnsSeq
	 */
	public String getIbTrnsSeq() {
		return this.ibTrnsSeq;
	}
	
	/**
	 * Column Info
	 * @return mstBlSeqNo
	 */
	public String getMstBlSeqNo() {
		return this.mstBlSeqNo;
	}
	
	/**
	 * Column Info
	 * @return cntrTtlWgt
	 */
	public String getCntrTtlWgt() {
		return this.cntrTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return tsPodCd
	 */
	public String getTsPodCd() {
		return this.tsPodCd;
	}
	
	/**
	 * Column Info
	 * @return imdgClssCd
	 */
	public String getImdgClssCd() {
		return this.imdgClssCd;
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
	 * @return ibSkdDirCd
	 */
	public String getIbSkdDirCd() {
		return this.ibSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return krCstmsDeptCd
	 */
	public String getKrCstmsDeptCd() {
		return this.krCstmsDeptCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return krWhCd
	 */
	public String getKrWhCd() {
		return this.krWhCd;
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
	 * @return cstmsDeclTpCd
	 */
	public String getCstmsDeclTpCd() {
		return this.cstmsDeclTpCd;
	}
	
	/**
	 * Column Info
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return krCstmsBlTpCd
	 */
	public String getKrCstmsBlTpCd() {
		return this.krCstmsBlTpCd;
	}
	
	/**
	 * Column Info
	 * @return mfSndDt
	 */
	public String getMfSndDt() {
		return this.mfSndDt;
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
	 * @return ibDmstPortCd
	 */
	public String getIbDmstPortCd() {
		return this.ibDmstPortCd;
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
	 * @return cstmsOfcCtyCd
	 */
	public String getCstmsOfcCtyCd() {
		return this.cstmsOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return mfSndUsrId
	 */
	public String getMfSndUsrId() {
		return this.mfSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return rspnRcvDt
	 */
	public String getRspnRcvDt() {
		return this.rspnRcvDt;
	}
	
	/**
	 * Column Info
	 * @return krCstmsBndCd
	 */
	public String getKrCstmsBndCd() {
		return this.krCstmsBndCd;
	}
	
	/**
	 * Column Info
	 * @return tsPolCd
	 */
	public String getTsPolCd() {
		return this.tsPolCd;
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
	 * @return dchgRptDt
	 */
	public String getDchgRptDt() {
		return this.dchgRptDt;
	}
	
	/**
	 * Column Info
	 * @return bbCgoMeasQty
	 */
	public String getBbCgoMeasQty() {
		return this.bbCgoMeasQty;
	}
	
	/**
	 * Column Info
	 * @return bbCgoWgt
	 */
	public String getBbCgoWgt() {
		return this.bbCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return portTmlCd
	 */
	public String getPortTmlCd() {
		return this.portTmlCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndImdgClssCd
	 */
	public String getN2ndImdgClssCd() {
		return this.n2ndImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @return etdDt
	 */
	public String getEtdDt() {
		return this.etdDt;
	}
	
	/**
	 * Column Info
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
	}
	
	/**
	 * Column Info
	 * @return bdAreaCd
	 */
	public String getBdAreaCd() {
		return this.bdAreaCd;
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
	 * @return frtFwrdCd
	 */
	public String getFrtFwrdCd() {
		return this.frtFwrdCd;
	}
	
	/**
	 * Column Info
	 * @return ibMtyBkgNo
	 */
	public String getIbMtyBkgNo() {
		return this.ibMtyBkgNo;
	}
	
	/**
	 * Column Info
	 * @return mfSndGdt
	 */
	public String getMfSndGdt() {
		return this.mfSndGdt;
	}
	
	/**
	 * Column Info
	 * @return mfSndRcvrId
	 */
	public String getMfSndRcvrId() {
		return this.mfSndRcvrId;
	}
	
	/**
	 * Column Info
	 * @return n3rdImdgClssCd
	 */
	public String getN3rdImdgClssCd() {
		return this.n3rdImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsBlNo
	 */
	public String getCstmsBlNo() {
		return this.cstmsBlNo;
	}
	
	/**
	 * Column Info
	 * @return mfDlDiffFlg
	 */
	public String getMfDlDiffFlg() {
		return this.mfDlDiffFlg;
	}
	
	/**
	 * Column Info
	 * @return ibVslCd
	 */
	public String getIbVslCd() {
		return this.ibVslCd;
	}
	
	/**
	 * Column Info
	 * @return deltGdt
	 */
	public String getDeltGdt() {
		return this.deltGdt;
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
	 * @param crsChkRsltFlg
	 */
	public void setCrsChkRsltFlg(String crsChkRsltFlg) {
		this.crsChkRsltFlg = crsChkRsltFlg;
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
	 * @param bkgCgoTpCd
	 */
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param dchgSndUsrId
	 */
	public void setDchgSndUsrId(String dchgSndUsrId) {
		this.dchgSndUsrId = dchgSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param ibEtaDt
	 */
	public void setIbEtaDt(String ibEtaDt) {
		this.ibEtaDt = ibEtaDt;
	}
	
	/**
	 * Column Info
	 * @param etaDt
	 */
	public void setEtaDt(String etaDt) {
		this.etaDt = etaDt;
	}
	
	/**
	 * Column Info
	 * @param crsChkRmk
	 */
	public void setCrsChkRmk(String crsChkRmk) {
		this.crsChkRmk = crsChkRmk;
	}
	
	/**
	 * Column Info
	 * @param mfSndFlg
	 */
	public void setMfSndFlg(String mfSndFlg) {
		this.mfSndFlg = mfSndFlg;
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
	 * @param krBlAmdtStsCd
	 */
	public void setKrBlAmdtStsCd(String krBlAmdtStsCd) {
		this.krBlAmdtStsCd = krBlAmdtStsCd;
	}
	
	/**
	 * Column Info
	 * @param dmstPortCd
	 */
	public void setDmstPortCd(String dmstPortCd) {
		this.dmstPortCd = dmstPortCd;
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
	 * @param evntYdCd
	 */
	public void setEvntYdCd(String evntYdCd) {
		this.evntYdCd = evntYdCd;
	}
	
	/**
	 * Column Info
	 * @param cgoTrspCd
	 */
	public void setCgoTrspCd(String cgoTrspCd) {
		this.cgoTrspCd = cgoTrspCd;
	}
	
	/**
	 * Column Info
	 * @param krPortAuthCd
	 */
	public void setKrPortAuthCd(String krPortAuthCd) {
		this.krPortAuthCd = krPortAuthCd;
	}
	
	/**
	 * Column Info
	 * @param cgoDesc2
	 */
	public void setCgoDesc2(String cgoDesc2) {
		this.cgoDesc2 = cgoDesc2;
	}
	
	/**
	 * Column Info
	 * @param krCstmsWhTpCd
	 */
	public void setKrCstmsWhTpCd(String krCstmsWhTpCd) {
		this.krCstmsWhTpCd = krCstmsWhTpCd;
	}
	
	/**
	 * Column Info
	 * @param cgoDesc1
	 */
	public void setCgoDesc1(String cgoDesc1) {
		this.cgoDesc1 = cgoDesc1;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param trnsSeq
	 */
	public void setTrnsSeq(String trnsSeq) {
		this.trnsSeq = trnsSeq;
	}
	
	/**
	 * Column Info
	 * @param ibSkdVoyNo
	 */
	public void setIbSkdVoyNo(String ibSkdVoyNo) {
		this.ibSkdVoyNo = ibSkdVoyNo;
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
	 * @param ibCstmsDeclTpCd
	 */
	public void setIbCstmsDeclTpCd(String ibCstmsDeclTpCd) {
		this.ibCstmsDeclTpCd = ibCstmsDeclTpCd;
	}
	
	/**
	 * Column Info
	 * @param ibMtyBlNo
	 */
	public void setIbMtyBlNo(String ibMtyBlNo) {
		this.ibMtyBlNo = ibMtyBlNo;
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
	 * @param blMeasUtCd
	 */
	public void setBlMeasUtCd(String blMeasUtCd) {
		this.blMeasUtCd = blMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param krMeasUtCd
	 */
	public void setKrMeasUtCd(String krMeasUtCd) {
		this.krMeasUtCd = krMeasUtCd;
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
	 * @param cstmsFwrdId
	 */
	public void setCstmsFwrdId(String cstmsFwrdId) {
		this.cstmsFwrdId = cstmsFwrdId;
	}
	
	/**
	 * Column Info
	 * @param bizRgstNo
	 */
	public void setBizRgstNo(String bizRgstNo) {
		this.bizRgstNo = bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @param ibTrnsSeq
	 */
	public void setIbTrnsSeq(String ibTrnsSeq) {
		this.ibTrnsSeq = ibTrnsSeq;
	}
	
	/**
	 * Column Info
	 * @param mstBlSeqNo
	 */
	public void setMstBlSeqNo(String mstBlSeqNo) {
		this.mstBlSeqNo = mstBlSeqNo;
	}
	
	/**
	 * Column Info
	 * @param cntrTtlWgt
	 */
	public void setCntrTtlWgt(String cntrTtlWgt) {
		this.cntrTtlWgt = cntrTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param tsPodCd
	 */
	public void setTsPodCd(String tsPodCd) {
		this.tsPodCd = tsPodCd;
	}
	
	/**
	 * Column Info
	 * @param imdgClssCd
	 */
	public void setImdgClssCd(String imdgClssCd) {
		this.imdgClssCd = imdgClssCd;
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
	 * @param ibSkdDirCd
	 */
	public void setIbSkdDirCd(String ibSkdDirCd) {
		this.ibSkdDirCd = ibSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param krCstmsDeptCd
	 */
	public void setKrCstmsDeptCd(String krCstmsDeptCd) {
		this.krCstmsDeptCd = krCstmsDeptCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param krWhCd
	 */
	public void setKrWhCd(String krWhCd) {
		this.krWhCd = krWhCd;
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
	 * @param cstmsDeclTpCd
	 */
	public void setCstmsDeclTpCd(String cstmsDeclTpCd) {
		this.cstmsDeclTpCd = cstmsDeclTpCd;
	}
	
	/**
	 * Column Info
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param krCstmsBlTpCd
	 */
	public void setKrCstmsBlTpCd(String krCstmsBlTpCd) {
		this.krCstmsBlTpCd = krCstmsBlTpCd;
	}
	
	/**
	 * Column Info
	 * @param mfSndDt
	 */
	public void setMfSndDt(String mfSndDt) {
		this.mfSndDt = mfSndDt;
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
	 * @param ibDmstPortCd
	 */
	public void setIbDmstPortCd(String ibDmstPortCd) {
		this.ibDmstPortCd = ibDmstPortCd;
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
	 * @param cstmsOfcCtyCd
	 */
	public void setCstmsOfcCtyCd(String cstmsOfcCtyCd) {
		this.cstmsOfcCtyCd = cstmsOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param mfSndUsrId
	 */
	public void setMfSndUsrId(String mfSndUsrId) {
		this.mfSndUsrId = mfSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param rspnRcvDt
	 */
	public void setRspnRcvDt(String rspnRcvDt) {
		this.rspnRcvDt = rspnRcvDt;
	}
	
	/**
	 * Column Info
	 * @param krCstmsBndCd
	 */
	public void setKrCstmsBndCd(String krCstmsBndCd) {
		this.krCstmsBndCd = krCstmsBndCd;
	}
	
	/**
	 * Column Info
	 * @param tsPolCd
	 */
	public void setTsPolCd(String tsPolCd) {
		this.tsPolCd = tsPolCd;
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
	 * @param dchgRptDt
	 */
	public void setDchgRptDt(String dchgRptDt) {
		this.dchgRptDt = dchgRptDt;
	}
	
	/**
	 * Column Info
	 * @param bbCgoMeasQty
	 */
	public void setBbCgoMeasQty(String bbCgoMeasQty) {
		this.bbCgoMeasQty = bbCgoMeasQty;
	}
	
	/**
	 * Column Info
	 * @param bbCgoWgt
	 */
	public void setBbCgoWgt(String bbCgoWgt) {
		this.bbCgoWgt = bbCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param portTmlCd
	 */
	public void setPortTmlCd(String portTmlCd) {
		this.portTmlCd = portTmlCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndImdgClssCd
	 */
	public void setN2ndImdgClssCd(String n2ndImdgClssCd) {
		this.n2ndImdgClssCd = n2ndImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param etdDt
	 */
	public void setEtdDt(String etdDt) {
		this.etdDt = etdDt;
	}
	
	/**
	 * Column Info
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
	}
	
	/**
	 * Column Info
	 * @param bdAreaCd
	 */
	public void setBdAreaCd(String bdAreaCd) {
		this.bdAreaCd = bdAreaCd;
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
	 * @param frtFwrdCd
	 */
	public void setFrtFwrdCd(String frtFwrdCd) {
		this.frtFwrdCd = frtFwrdCd;
	}
	
	/**
	 * Column Info
	 * @param ibMtyBkgNo
	 */
	public void setIbMtyBkgNo(String ibMtyBkgNo) {
		this.ibMtyBkgNo = ibMtyBkgNo;
	}
	
	/**
	 * Column Info
	 * @param mfSndGdt
	 */
	public void setMfSndGdt(String mfSndGdt) {
		this.mfSndGdt = mfSndGdt;
	}
	
	/**
	 * Column Info
	 * @param mfSndRcvrId
	 */
	public void setMfSndRcvrId(String mfSndRcvrId) {
		this.mfSndRcvrId = mfSndRcvrId;
	}
	
	/**
	 * Column Info
	 * @param n3rdImdgClssCd
	 */
	public void setN3rdImdgClssCd(String n3rdImdgClssCd) {
		this.n3rdImdgClssCd = n3rdImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsBlNo
	 */
	public void setCstmsBlNo(String cstmsBlNo) {
		this.cstmsBlNo = cstmsBlNo;
	}
	
	/**
	 * Column Info
	 * @param mfDlDiffFlg
	 */
	public void setMfDlDiffFlg(String mfDlDiffFlg) {
		this.mfDlDiffFlg = mfDlDiffFlg;
	}
	
	/**
	 * Column Info
	 * @param ibVslCd
	 */
	public void setIbVslCd(String ibVslCd) {
		this.ibVslCd = ibVslCd;
	}
	
	/**
	 * Column Info
	 * @param deltGdt
	 */
	public void setDeltGdt(String deltGdt) {
		this.deltGdt = deltGdt;
	}
	
	/**
	 * Column Info
	 * @param deltUsrId
	 */
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
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
		setCrsChkRsltFlg(JSPUtil.getParameter(request, prefix + "crs_chk_rslt_flg", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd", ""));
		setDchgSndUsrId(JSPUtil.getParameter(request, prefix + "dchg_snd_usr_id", ""));
		setIbEtaDt(JSPUtil.getParameter(request, prefix + "ib_eta_dt", ""));
		setEtaDt(JSPUtil.getParameter(request, prefix + "eta_dt", ""));
		setCrsChkRmk(JSPUtil.getParameter(request, prefix + "crs_chk_rmk", ""));
		setMfSndFlg(JSPUtil.getParameter(request, prefix + "mf_snd_flg", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setKrBlAmdtStsCd(JSPUtil.getParameter(request, prefix + "kr_bl_amdt_sts_cd", ""));
		setDmstPortCd(JSPUtil.getParameter(request, prefix + "dmst_port_cd", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setEvntYdCd(JSPUtil.getParameter(request, prefix + "evnt_yd_cd", ""));
		setCgoTrspCd(JSPUtil.getParameter(request, prefix + "cgo_trsp_cd", ""));
		setKrPortAuthCd(JSPUtil.getParameter(request, prefix + "kr_port_auth_cd", ""));
		setCgoDesc2(JSPUtil.getParameter(request, prefix + "cgo_desc2", ""));
		setKrCstmsWhTpCd(JSPUtil.getParameter(request, prefix + "kr_cstms_wh_tp_cd", ""));
		setCgoDesc1(JSPUtil.getParameter(request, prefix + "cgo_desc1", ""));
		setWgtUtCd(JSPUtil.getParameter(request, prefix + "wgt_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setTrnsSeq(JSPUtil.getParameter(request, prefix + "trns_seq", ""));
		setIbSkdVoyNo(JSPUtil.getParameter(request, prefix + "ib_skd_voy_no", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setIbCstmsDeclTpCd(JSPUtil.getParameter(request, prefix + "ib_cstms_decl_tp_cd", ""));
		setIbMtyBlNo(JSPUtil.getParameter(request, prefix + "ib_mty_bl_no", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setBlMeasUtCd(JSPUtil.getParameter(request, prefix + "bl_meas_ut_cd", ""));
		setKrMeasUtCd(JSPUtil.getParameter(request, prefix + "kr_meas_ut_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setCstmsFwrdId(JSPUtil.getParameter(request, prefix + "cstms_fwrd_id", ""));
		setBizRgstNo(JSPUtil.getParameter(request, prefix + "biz_rgst_no", ""));
		setIbTrnsSeq(JSPUtil.getParameter(request, prefix + "ib_trns_seq", ""));
		setMstBlSeqNo(JSPUtil.getParameter(request, prefix + "mst_bl_seq_no", ""));
		setCntrTtlWgt(JSPUtil.getParameter(request, prefix + "cntr_ttl_wgt", ""));
		setTsPodCd(JSPUtil.getParameter(request, prefix + "ts_pod_cd", ""));
		setImdgClssCd(JSPUtil.getParameter(request, prefix + "imdg_clss_cd", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setIbSkdDirCd(JSPUtil.getParameter(request, prefix + "ib_skd_dir_cd", ""));
		setKrCstmsDeptCd(JSPUtil.getParameter(request, prefix + "kr_cstms_dept_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setKrWhCd(JSPUtil.getParameter(request, prefix + "kr_wh_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCstmsDeclTpCd(JSPUtil.getParameter(request, prefix + "cstms_decl_tp_cd", ""));
		setCmdtCd(JSPUtil.getParameter(request, prefix + "cmdt_cd", ""));
		setKrCstmsBlTpCd(JSPUtil.getParameter(request, prefix + "kr_cstms_bl_tp_cd", ""));
		setMfSndDt(JSPUtil.getParameter(request, prefix + "mf_snd_dt", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setIbDmstPortCd(JSPUtil.getParameter(request, prefix + "ib_dmst_port_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, prefix + "pck_tp_cd", ""));
		setCstmsOfcCtyCd(JSPUtil.getParameter(request, prefix + "cstms_ofc_cty_cd", ""));
		setMfSndUsrId(JSPUtil.getParameter(request, prefix + "mf_snd_usr_id", ""));
		setRspnRcvDt(JSPUtil.getParameter(request, prefix + "rspn_rcv_dt", ""));
		setKrCstmsBndCd(JSPUtil.getParameter(request, prefix + "kr_cstms_bnd_cd", ""));
		setTsPolCd(JSPUtil.getParameter(request, prefix + "ts_pol_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDchgRptDt(JSPUtil.getParameter(request, prefix + "dchg_rpt_dt", ""));
		setBbCgoMeasQty(JSPUtil.getParameter(request, prefix + "bb_cgo_meas_qty", ""));
		setBbCgoWgt(JSPUtil.getParameter(request, prefix + "bb_cgo_wgt", ""));
		setPortTmlCd(JSPUtil.getParameter(request, prefix + "port_tml_cd", ""));
		setN2ndImdgClssCd(JSPUtil.getParameter(request, prefix + "n2nd_imdg_clss_cd", ""));
		setEtdDt(JSPUtil.getParameter(request, prefix + "etd_dt", ""));
		setDeltDt(JSPUtil.getParameter(request, prefix + "delt_dt", ""));
		setBdAreaCd(JSPUtil.getParameter(request, prefix + "bd_area_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setFrtFwrdCd(JSPUtil.getParameter(request, prefix + "frt_fwrd_cd", ""));
		setIbMtyBkgNo(JSPUtil.getParameter(request, prefix + "ib_mty_bkg_no", ""));
		setMfSndGdt(JSPUtil.getParameter(request, prefix + "mf_snd_gdt", ""));
		setMfSndRcvrId(JSPUtil.getParameter(request, prefix + "mf_snd_rcvr_id", ""));
		setN3rdImdgClssCd(JSPUtil.getParameter(request, prefix + "n3rd_imdg_clss_cd", ""));
		setCstmsBlNo(JSPUtil.getParameter(request, prefix + "cstms_bl_no", ""));
		setMfDlDiffFlg(JSPUtil.getParameter(request, prefix + "mf_dl_diff_flg", ""));
		setIbVslCd(JSPUtil.getParameter(request, prefix + "ib_vsl_cd", ""));
		setDeltGdt(JSPUtil.getParameter(request, prefix + "delt_gdt", ""));
		setDeltUsrId(JSPUtil.getParameter(request, prefix + "delt_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsKrBlVO[]
	 */
	public BkgCstmsKrBlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsKrBlVO[]
	 */
	public BkgCstmsKrBlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrBlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] crsChkRsltFlg = (JSPUtil.getParameter(request, prefix	+ "crs_chk_rslt_flg", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] dchgSndUsrId = (JSPUtil.getParameter(request, prefix	+ "dchg_snd_usr_id", length));
			String[] ibEtaDt = (JSPUtil.getParameter(request, prefix	+ "ib_eta_dt", length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt", length));
			String[] crsChkRmk = (JSPUtil.getParameter(request, prefix	+ "crs_chk_rmk", length));
			String[] mfSndFlg = (JSPUtil.getParameter(request, prefix	+ "mf_snd_flg", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] krBlAmdtStsCd = (JSPUtil.getParameter(request, prefix	+ "kr_bl_amdt_sts_cd", length));
			String[] dmstPortCd = (JSPUtil.getParameter(request, prefix	+ "dmst_port_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] evntYdCd = (JSPUtil.getParameter(request, prefix	+ "evnt_yd_cd", length));
			String[] cgoTrspCd = (JSPUtil.getParameter(request, prefix	+ "cgo_trsp_cd", length));
			String[] krPortAuthCd = (JSPUtil.getParameter(request, prefix	+ "kr_port_auth_cd", length));
			String[] cgoDesc2 = (JSPUtil.getParameter(request, prefix	+ "cgo_desc2", length));
			String[] krCstmsWhTpCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_wh_tp_cd", length));
			String[] cgoDesc1 = (JSPUtil.getParameter(request, prefix	+ "cgo_desc1", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trnsSeq = (JSPUtil.getParameter(request, prefix	+ "trns_seq", length));
			String[] ibSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "ib_skd_voy_no", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ibCstmsDeclTpCd = (JSPUtil.getParameter(request, prefix	+ "ib_cstms_decl_tp_cd", length));
			String[] ibMtyBlNo = (JSPUtil.getParameter(request, prefix	+ "ib_mty_bl_no", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] blMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "bl_meas_ut_cd", length));
			String[] krMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "kr_meas_ut_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] cstmsFwrdId = (JSPUtil.getParameter(request, prefix	+ "cstms_fwrd_id", length));
			String[] bizRgstNo = (JSPUtil.getParameter(request, prefix	+ "biz_rgst_no", length));
			String[] ibTrnsSeq = (JSPUtil.getParameter(request, prefix	+ "ib_trns_seq", length));
			String[] mstBlSeqNo = (JSPUtil.getParameter(request, prefix	+ "mst_bl_seq_no", length));
			String[] cntrTtlWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_ttl_wgt", length));
			String[] tsPodCd = (JSPUtil.getParameter(request, prefix	+ "ts_pod_cd", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] ibSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "ib_skd_dir_cd", length));
			String[] krCstmsDeptCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_dept_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] krWhCd = (JSPUtil.getParameter(request, prefix	+ "kr_wh_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cstmsDeclTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_decl_tp_cd", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] krCstmsBlTpCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_bl_tp_cd", length));
			String[] mfSndDt = (JSPUtil.getParameter(request, prefix	+ "mf_snd_dt", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] ibDmstPortCd = (JSPUtil.getParameter(request, prefix	+ "ib_dmst_port_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] cstmsOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "cstms_ofc_cty_cd", length));
			String[] mfSndUsrId = (JSPUtil.getParameter(request, prefix	+ "mf_snd_usr_id", length));
			String[] rspnRcvDt = (JSPUtil.getParameter(request, prefix	+ "rspn_rcv_dt", length));
			String[] krCstmsBndCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_bnd_cd", length));
			String[] tsPolCd = (JSPUtil.getParameter(request, prefix	+ "ts_pol_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dchgRptDt = (JSPUtil.getParameter(request, prefix	+ "dchg_rpt_dt", length));
			String[] bbCgoMeasQty = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_meas_qty", length));
			String[] bbCgoWgt = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_wgt", length));
			String[] portTmlCd = (JSPUtil.getParameter(request, prefix	+ "port_tml_cd", length));
			String[] n2ndImdgClssCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_imdg_clss_cd", length));
			String[] etdDt = (JSPUtil.getParameter(request, prefix	+ "etd_dt", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] bdAreaCd = (JSPUtil.getParameter(request, prefix	+ "bd_area_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] frtFwrdCd = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_cd", length));
			String[] ibMtyBkgNo = (JSPUtil.getParameter(request, prefix	+ "ib_mty_bkg_no", length));
			String[] mfSndGdt = (JSPUtil.getParameter(request, prefix	+ "mf_snd_gdt", length));
			String[] mfSndRcvrId = (JSPUtil.getParameter(request, prefix	+ "mf_snd_rcvr_id", length));
			String[] n3rdImdgClssCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_imdg_clss_cd", length));
			String[] cstmsBlNo = (JSPUtil.getParameter(request, prefix	+ "cstms_bl_no", length));
			String[] mfDlDiffFlg = (JSPUtil.getParameter(request, prefix	+ "mf_dl_diff_flg", length));
			String[] ibVslCd = (JSPUtil.getParameter(request, prefix	+ "ib_vsl_cd", length));
			String[] deltGdt = (JSPUtil.getParameter(request, prefix	+ "delt_gdt", length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix	+ "delt_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsKrBlVO();
				if (crsChkRsltFlg[i] != null)
					model.setCrsChkRsltFlg(crsChkRsltFlg[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (dchgSndUsrId[i] != null)
					model.setDchgSndUsrId(dchgSndUsrId[i]);
				if (ibEtaDt[i] != null)
					model.setIbEtaDt(ibEtaDt[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (crsChkRmk[i] != null)
					model.setCrsChkRmk(crsChkRmk[i]);
				if (mfSndFlg[i] != null)
					model.setMfSndFlg(mfSndFlg[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (krBlAmdtStsCd[i] != null)
					model.setKrBlAmdtStsCd(krBlAmdtStsCd[i]);
				if (dmstPortCd[i] != null)
					model.setDmstPortCd(dmstPortCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (evntYdCd[i] != null)
					model.setEvntYdCd(evntYdCd[i]);
				if (cgoTrspCd[i] != null)
					model.setCgoTrspCd(cgoTrspCd[i]);
				if (krPortAuthCd[i] != null)
					model.setKrPortAuthCd(krPortAuthCd[i]);
				if (cgoDesc2[i] != null)
					model.setCgoDesc2(cgoDesc2[i]);
				if (krCstmsWhTpCd[i] != null)
					model.setKrCstmsWhTpCd(krCstmsWhTpCd[i]);
				if (cgoDesc1[i] != null)
					model.setCgoDesc1(cgoDesc1[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trnsSeq[i] != null)
					model.setTrnsSeq(trnsSeq[i]);
				if (ibSkdVoyNo[i] != null)
					model.setIbSkdVoyNo(ibSkdVoyNo[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ibCstmsDeclTpCd[i] != null)
					model.setIbCstmsDeclTpCd(ibCstmsDeclTpCd[i]);
				if (ibMtyBlNo[i] != null)
					model.setIbMtyBlNo(ibMtyBlNo[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (blMeasUtCd[i] != null)
					model.setBlMeasUtCd(blMeasUtCd[i]);
				if (krMeasUtCd[i] != null)
					model.setKrMeasUtCd(krMeasUtCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cstmsFwrdId[i] != null)
					model.setCstmsFwrdId(cstmsFwrdId[i]);
				if (bizRgstNo[i] != null)
					model.setBizRgstNo(bizRgstNo[i]);
				if (ibTrnsSeq[i] != null)
					model.setIbTrnsSeq(ibTrnsSeq[i]);
				if (mstBlSeqNo[i] != null)
					model.setMstBlSeqNo(mstBlSeqNo[i]);
				if (cntrTtlWgt[i] != null)
					model.setCntrTtlWgt(cntrTtlWgt[i]);
				if (tsPodCd[i] != null)
					model.setTsPodCd(tsPodCd[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (ibSkdDirCd[i] != null)
					model.setIbSkdDirCd(ibSkdDirCd[i]);
				if (krCstmsDeptCd[i] != null)
					model.setKrCstmsDeptCd(krCstmsDeptCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (krWhCd[i] != null)
					model.setKrWhCd(krWhCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cstmsDeclTpCd[i] != null)
					model.setCstmsDeclTpCd(cstmsDeclTpCd[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (krCstmsBlTpCd[i] != null)
					model.setKrCstmsBlTpCd(krCstmsBlTpCd[i]);
				if (mfSndDt[i] != null)
					model.setMfSndDt(mfSndDt[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (ibDmstPortCd[i] != null)
					model.setIbDmstPortCd(ibDmstPortCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (cstmsOfcCtyCd[i] != null)
					model.setCstmsOfcCtyCd(cstmsOfcCtyCd[i]);
				if (mfSndUsrId[i] != null)
					model.setMfSndUsrId(mfSndUsrId[i]);
				if (rspnRcvDt[i] != null)
					model.setRspnRcvDt(rspnRcvDt[i]);
				if (krCstmsBndCd[i] != null)
					model.setKrCstmsBndCd(krCstmsBndCd[i]);
				if (tsPolCd[i] != null)
					model.setTsPolCd(tsPolCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dchgRptDt[i] != null)
					model.setDchgRptDt(dchgRptDt[i]);
				if (bbCgoMeasQty[i] != null)
					model.setBbCgoMeasQty(bbCgoMeasQty[i]);
				if (bbCgoWgt[i] != null)
					model.setBbCgoWgt(bbCgoWgt[i]);
				if (portTmlCd[i] != null)
					model.setPortTmlCd(portTmlCd[i]);
				if (n2ndImdgClssCd[i] != null)
					model.setN2ndImdgClssCd(n2ndImdgClssCd[i]);
				if (etdDt[i] != null)
					model.setEtdDt(etdDt[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (bdAreaCd[i] != null)
					model.setBdAreaCd(bdAreaCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (frtFwrdCd[i] != null)
					model.setFrtFwrdCd(frtFwrdCd[i]);
				if (ibMtyBkgNo[i] != null)
					model.setIbMtyBkgNo(ibMtyBkgNo[i]);
				if (mfSndGdt[i] != null)
					model.setMfSndGdt(mfSndGdt[i]);
				if (mfSndRcvrId[i] != null)
					model.setMfSndRcvrId(mfSndRcvrId[i]);
				if (n3rdImdgClssCd[i] != null)
					model.setN3rdImdgClssCd(n3rdImdgClssCd[i]);
				if (cstmsBlNo[i] != null)
					model.setCstmsBlNo(cstmsBlNo[i]);
				if (mfDlDiffFlg[i] != null)
					model.setMfDlDiffFlg(mfDlDiffFlg[i]);
				if (ibVslCd[i] != null)
					model.setIbVslCd(ibVslCd[i]);
				if (deltGdt[i] != null)
					model.setDeltGdt(deltGdt[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsKrBlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsKrBlVO[]
	 */
	public BkgCstmsKrBlVO[] getBkgCstmsKrBlVOs(){
		BkgCstmsKrBlVO[] vos = (BkgCstmsKrBlVO[])models.toArray(new BkgCstmsKrBlVO[models.size()]);
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
		this.crsChkRsltFlg = this.crsChkRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dchgSndUsrId = this.dchgSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibEtaDt = this.ibEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crsChkRmk = this.crsChkRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndFlg = this.mfSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krBlAmdtStsCd = this.krBlAmdtStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstPortCd = this.dmstPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntYdCd = this.evntYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTrspCd = this.cgoTrspCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krPortAuthCd = this.krPortAuthCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoDesc2 = this.cgoDesc2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsWhTpCd = this.krCstmsWhTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoDesc1 = this.cgoDesc1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsSeq = this.trnsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibSkdVoyNo = this.ibSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibCstmsDeclTpCd = this.ibCstmsDeclTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibMtyBlNo = this.ibMtyBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blMeasUtCd = this.blMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krMeasUtCd = this.krMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsFwrdId = this.cstmsFwrdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizRgstNo = this.bizRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTrnsSeq = this.ibTrnsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mstBlSeqNo = this.mstBlSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTtlWgt = this.cntrTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPodCd = this.tsPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibSkdDirCd = this.ibSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsDeptCd = this.krCstmsDeptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krWhCd = this.krWhCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsDeclTpCd = this.cstmsDeclTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsBlTpCd = this.krCstmsBlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndDt = this.mfSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibDmstPortCd = this.ibDmstPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsOfcCtyCd = this.cstmsOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndUsrId = this.mfSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rspnRcvDt = this.rspnRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsBndCd = this.krCstmsBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPolCd = this.tsPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dchgRptDt = this.dchgRptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoMeasQty = this.bbCgoMeasQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoWgt = this.bbCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portTmlCd = this.portTmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndImdgClssCd = this.n2ndImdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etdDt = this.etdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdAreaCd = this.bdAreaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtFwrdCd = this.frtFwrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibMtyBkgNo = this.ibMtyBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndGdt = this.mfSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndRcvrId = this.mfSndRcvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdImdgClssCd = this.n3rdImdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsBlNo = this.cstmsBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfDlDiffFlg = this.mfDlDiffFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibVslCd = this.ibVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltGdt = this.deltGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
