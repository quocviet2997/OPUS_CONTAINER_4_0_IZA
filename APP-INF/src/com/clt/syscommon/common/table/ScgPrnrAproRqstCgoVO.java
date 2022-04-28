/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgPrnrAproRqstCgoVO.java
*@FileTitle : ScgPrnrAproRqstCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.15
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2009.07.15 김현욱 
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
 * @author 김현욱
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgPrnrAproRqstCgoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgPrnrAproRqstCgoVO> models = new ArrayList<ScgPrnrAproRqstCgoVO>();
	
	/* Column Info */
	private String spclCgoRqstSeq = null;
	/* Column Info */
	private String n3rdImdgSubsRskLblCd = null;
	/* Column Info */
	private String ttlDimWdt = null;
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String inN2ndImdgPckQty = null;
	/* Column Info */
	private String psaNo = null;
	/* Column Info */
	private String dcgoStsCd = null;
	/* Column Info */
	private String emerCntcPsonNm = null;
	/* Column Info */
	private String radaSkdNo = null;
	/* Column Info */
	private String outN2ndImdgPckCd = null;
	/* Column Info */
	private String crrCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lfSdOvrDimLen = null;
	/* Column Info */
	private String inN2ndImdgPckCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String fwrdOvrDimLen = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String inN1stImdgPckQty = null;
	/* Column Info */
	private String mrnPolutFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String cntrRefNo = null;
	/* Column Info */
	private String authOfcCd = null;
	/* Column Info */
	private String authDt = null;
	/* Column Info */
	private String netWgt = null;
	/* Column Info */
	private String spclCgoCateCd = null;
	/* Column Info */
	private String spclCntrSeq = null;
	/* Column Info */
	private String ttlDimHgt = null;
	/* Column Info */
	private String voidSltQty = null;
	/* Column Info */
	private String hgtOvrDimLen = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String radaAmt = null;
	/* Column Info */
	private String netExploWgt = null;
	/* Column Info */
	private String cgoLclFlg = null;
	/* Column Info */
	private String cmdtDesc = null;
	/* Column Info */
	private String emerRspnGidNo = null;
	/* Column Info */
	private String hzdDesc = null;
	/* Column Info */
	private String ttlDimLen = null;
	/* Column Info */
	private String cgoRqstDt = null;
	/* Column Info */
	private String authUsrId = null;
	/* Column Info */
	private String cneeDtlDesc = null;
	/* Column Info */
	private String emerRspnGidChrNo = null;
	/* Column Info */
	private String aproRefNo = null;
	/* Column Info */
	private String emerTempCtnt = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String rtSdOvrDimLen = null;
	/* Column Info */
	private String spclCgoSeq = null;
	/* Column Info */
	private String emerCntcPhnNo = null;
	/* Column Info */
	private String measTpCd = null;
	/* Column Info */
	private String imdgPckGrpCd = null;
	/* Column Info */
	private String flshPntCdoTemp = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String radaTrspNo = null;
	/* Column Info */
	private String n1stImdgSubsRskLblCd = null;
	/* Column Info */
	private String radaUtCd = null;
	/* Column Info */
	private String maxInPckTpCd = null;
	/* Column Info */
	private String inN1stImdgPckCd = null;
	/* Column Info */
	private String outN2ndImdgPckQty = null;
	/* Column Info */
	private String emsNo = null;
	/* Column Info */
	private String maxInPckQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String certiNo = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String outN1stImdgPckQty = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String imdgExptQtyFlg = null;
	/* Column Info */
	private String n2ndImdgSubsRskLblCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String clodFlg = null;
	/* Column Info */
	private String bkwdOvrDimLen = null;
	/* Column Info */
	private String imdgCoGrpCd = null;
	/* Column Info */
	private String bkgRefNo = null;
	/* Column Info */
	private String spclStwgRqstDesc = null;
	/* Column Info */
	private String cgoOprCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String ctrlTempCtnt = null;
	/* Column Info */
	private String prpShpNm = null;
	/* Column Info */
	private String authStsCd = null;
	/* Column Info */
	private String outN1stImdgPckCd = null;
	/* Column Info */
	private String imdgLmtQtyFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgPrnrAproRqstCgoVO() {}

	public ScgPrnrAproRqstCgoVO(String ibflag, String pagerows, String crrCd, String bkgRefNo, String spclCgoRqstSeq, String spclCntrSeq, String spclCgoSeq, String imdgUnNo, String imdgUnNoSeq, String imdgClssCd, String n1stImdgSubsRskLblCd, String n2ndImdgSubsRskLblCd, String n3rdImdgSubsRskLblCd, String imdgCoGrpCd, String imdgPckGrpCd, String imdgLmtQtyFlg, String imdgExptQtyFlg, String mrnPolutFlg, String flshPntCdoTemp, String prpShpNm, String hzdDesc, String dcgoStsCd, String measQty, String measTpCd, String pckQty, String pckTpCd, String clodFlg, String spclStwgRqstDesc, String cgoLclFlg, String emerRspnGidNo, String emerRspnGidChrNo, String emerCntcPhnNo, String emerCntcPsonNm, String emerTempCtnt, String ctrlTempCtnt, String emsNo, String cmdtDesc, String ttlDimLen, String ttlDimWdt, String ttlDimHgt, String fwrdOvrDimLen, String bkwdOvrDimLen, String hgtOvrDimLen, String lfSdOvrDimLen, String rtSdOvrDimLen, String voidSltQty, String netWgt, String grsWgt, String wgtUtCd, String psaNo, String certiNo, String inN1stImdgPckQty, String inN1stImdgPckCd, String inN2ndImdgPckQty, String inN2ndImdgPckCd, String outN1stImdgPckQty, String outN1stImdgPckCd, String outN2ndImdgPckQty, String outN2ndImdgPckCd, String maxInPckQty, String maxInPckTpCd, String cneeDtlDesc, String netExploWgt, String radaSkdNo, String radaAmt, String radaUtCd, String radaTrspNo, String diffRmk, String cgoRqstDt, String creUsrId, String creDt, String updUsrId, String updDt, String spclCgoCateCd, String cntrRefNo, String cntrTpszCd, String authDt, String authOfcCd, String authUsrId, String authStsCd, String aproRefNo, String cgoOprCd) {
		this.spclCgoRqstSeq = spclCgoRqstSeq;
		this.n3rdImdgSubsRskLblCd = n3rdImdgSubsRskLblCd;
		this.ttlDimWdt = ttlDimWdt;
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.inN2ndImdgPckQty = inN2ndImdgPckQty;
		this.psaNo = psaNo;
		this.dcgoStsCd = dcgoStsCd;
		this.emerCntcPsonNm = emerCntcPsonNm;
		this.radaSkdNo = radaSkdNo;
		this.outN2ndImdgPckCd = outN2ndImdgPckCd;
		this.crrCd = crrCd;
		this.pagerows = pagerows;
		this.lfSdOvrDimLen = lfSdOvrDimLen;
		this.inN2ndImdgPckCd = inN2ndImdgPckCd;
		this.cntrTpszCd = cntrTpszCd;
		this.fwrdOvrDimLen = fwrdOvrDimLen;
		this.wgtUtCd = wgtUtCd;
		this.inN1stImdgPckQty = inN1stImdgPckQty;
		this.mrnPolutFlg = mrnPolutFlg;
		this.updUsrId = updUsrId;
		this.imdgUnNo = imdgUnNo;
		this.cntrRefNo = cntrRefNo;
		this.authOfcCd = authOfcCd;
		this.authDt = authDt;
		this.netWgt = netWgt;
		this.spclCgoCateCd = spclCgoCateCd;
		this.spclCntrSeq = spclCntrSeq;
		this.ttlDimHgt = ttlDimHgt;
		this.voidSltQty = voidSltQty;
		this.hgtOvrDimLen = hgtOvrDimLen;
		this.creUsrId = creUsrId;
		this.radaAmt = radaAmt;
		this.netExploWgt = netExploWgt;
		this.cgoLclFlg = cgoLclFlg;
		this.cmdtDesc = cmdtDesc;
		this.emerRspnGidNo = emerRspnGidNo;
		this.hzdDesc = hzdDesc;
		this.ttlDimLen = ttlDimLen;
		this.cgoRqstDt = cgoRqstDt;
		this.authUsrId = authUsrId;
		this.cneeDtlDesc = cneeDtlDesc;
		this.emerRspnGidChrNo = emerRspnGidChrNo;
		this.aproRefNo = aproRefNo;
		this.emerTempCtnt = emerTempCtnt;
		this.imdgClssCd = imdgClssCd;
		this.grsWgt = grsWgt;
		this.rtSdOvrDimLen = rtSdOvrDimLen;
		this.spclCgoSeq = spclCgoSeq;
		this.emerCntcPhnNo = emerCntcPhnNo;
		this.measTpCd = measTpCd;
		this.imdgPckGrpCd = imdgPckGrpCd;
		this.flshPntCdoTemp = flshPntCdoTemp;
		this.creDt = creDt;
		this.radaTrspNo = radaTrspNo;
		this.n1stImdgSubsRskLblCd = n1stImdgSubsRskLblCd;
		this.radaUtCd = radaUtCd;
		this.maxInPckTpCd = maxInPckTpCd;
		this.inN1stImdgPckCd = inN1stImdgPckCd;
		this.outN2ndImdgPckQty = outN2ndImdgPckQty;
		this.emsNo = emsNo;
		this.maxInPckQty = maxInPckQty;
		this.ibflag = ibflag;
		this.certiNo = certiNo;
		this.measQty = measQty;
		this.pckQty = pckQty;
		this.outN1stImdgPckQty = outN1stImdgPckQty;
		this.pckTpCd = pckTpCd;
		this.imdgExptQtyFlg = imdgExptQtyFlg;
		this.n2ndImdgSubsRskLblCd = n2ndImdgSubsRskLblCd;
		this.updDt = updDt;
		this.clodFlg = clodFlg;
		this.bkwdOvrDimLen = bkwdOvrDimLen;
		this.imdgCoGrpCd = imdgCoGrpCd;
		this.bkgRefNo = bkgRefNo;
		this.spclStwgRqstDesc = spclStwgRqstDesc;
		this.cgoOprCd = cgoOprCd;
		this.diffRmk = diffRmk;
		this.ctrlTempCtnt = ctrlTempCtnt;
		this.prpShpNm = prpShpNm;
		this.authStsCd = authStsCd;
		this.outN1stImdgPckCd = outN1stImdgPckCd;
		this.imdgLmtQtyFlg = imdgLmtQtyFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("spcl_cgo_rqst_seq", getSpclCgoRqstSeq());
		this.hashColumns.put("n3rd_imdg_subs_rsk_lbl_cd", getN3rdImdgSubsRskLblCd());
		this.hashColumns.put("ttl_dim_wdt", getTtlDimWdt());
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("in_n2nd_imdg_pck_qty", getInN2ndImdgPckQty());
		this.hashColumns.put("psa_no", getPsaNo());
		this.hashColumns.put("dcgo_sts_cd", getDcgoStsCd());
		this.hashColumns.put("emer_cntc_pson_nm", getEmerCntcPsonNm());
		this.hashColumns.put("rada_skd_no", getRadaSkdNo());
		this.hashColumns.put("out_n2nd_imdg_pck_cd", getOutN2ndImdgPckCd());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lf_sd_ovr_dim_len", getLfSdOvrDimLen());
		this.hashColumns.put("in_n2nd_imdg_pck_cd", getInN2ndImdgPckCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("fwrd_ovr_dim_len", getFwrdOvrDimLen());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("in_n1st_imdg_pck_qty", getInN1stImdgPckQty());
		this.hashColumns.put("mrn_polut_flg", getMrnPolutFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("cntr_ref_no", getCntrRefNo());
		this.hashColumns.put("auth_ofc_cd", getAuthOfcCd());
		this.hashColumns.put("auth_dt", getAuthDt());
		this.hashColumns.put("net_wgt", getNetWgt());
		this.hashColumns.put("spcl_cgo_cate_cd", getSpclCgoCateCd());
		this.hashColumns.put("spcl_cntr_seq", getSpclCntrSeq());
		this.hashColumns.put("ttl_dim_hgt", getTtlDimHgt());
		this.hashColumns.put("void_slt_qty", getVoidSltQty());
		this.hashColumns.put("hgt_ovr_dim_len", getHgtOvrDimLen());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rada_amt", getRadaAmt());
		this.hashColumns.put("net_explo_wgt", getNetExploWgt());
		this.hashColumns.put("cgo_lcl_flg", getCgoLclFlg());
		this.hashColumns.put("cmdt_desc", getCmdtDesc());
		this.hashColumns.put("emer_rspn_gid_no", getEmerRspnGidNo());
		this.hashColumns.put("hzd_desc", getHzdDesc());
		this.hashColumns.put("ttl_dim_len", getTtlDimLen());
		this.hashColumns.put("cgo_rqst_dt", getCgoRqstDt());
		this.hashColumns.put("auth_usr_id", getAuthUsrId());
		this.hashColumns.put("cnee_dtl_desc", getCneeDtlDesc());
		this.hashColumns.put("emer_rspn_gid_chr_no", getEmerRspnGidChrNo());
		this.hashColumns.put("apro_ref_no", getAproRefNo());
		this.hashColumns.put("emer_temp_ctnt", getEmerTempCtnt());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("rt_sd_ovr_dim_len", getRtSdOvrDimLen());
		this.hashColumns.put("spcl_cgo_seq", getSpclCgoSeq());
		this.hashColumns.put("emer_cntc_phn_no", getEmerCntcPhnNo());
		this.hashColumns.put("meas_tp_cd", getMeasTpCd());
		this.hashColumns.put("imdg_pck_grp_cd", getImdgPckGrpCd());
		this.hashColumns.put("flsh_pnt_cdo_temp", getFlshPntCdoTemp());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rada_trsp_no", getRadaTrspNo());
		this.hashColumns.put("n1st_imdg_subs_rsk_lbl_cd", getN1stImdgSubsRskLblCd());
		this.hashColumns.put("rada_ut_cd", getRadaUtCd());
		this.hashColumns.put("max_in_pck_tp_cd", getMaxInPckTpCd());
		this.hashColumns.put("in_n1st_imdg_pck_cd", getInN1stImdgPckCd());
		this.hashColumns.put("out_n2nd_imdg_pck_qty", getOutN2ndImdgPckQty());
		this.hashColumns.put("ems_no", getEmsNo());
		this.hashColumns.put("max_in_pck_qty", getMaxInPckQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("certi_no", getCertiNo());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("out_n1st_imdg_pck_qty", getOutN1stImdgPckQty());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("imdg_expt_qty_flg", getImdgExptQtyFlg());
		this.hashColumns.put("n2nd_imdg_subs_rsk_lbl_cd", getN2ndImdgSubsRskLblCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("clod_flg", getClodFlg());
		this.hashColumns.put("bkwd_ovr_dim_len", getBkwdOvrDimLen());
		this.hashColumns.put("imdg_co_grp_cd", getImdgCoGrpCd());
		this.hashColumns.put("bkg_ref_no", getBkgRefNo());
		this.hashColumns.put("spcl_stwg_rqst_desc", getSpclStwgRqstDesc());
		this.hashColumns.put("cgo_opr_cd", getCgoOprCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("ctrl_temp_ctnt", getCtrlTempCtnt());
		this.hashColumns.put("prp_shp_nm", getPrpShpNm());
		this.hashColumns.put("auth_sts_cd", getAuthStsCd());
		this.hashColumns.put("out_n1st_imdg_pck_cd", getOutN1stImdgPckCd());
		this.hashColumns.put("imdg_lmt_qty_flg", getImdgLmtQtyFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("spcl_cgo_rqst_seq", "spclCgoRqstSeq");
		this.hashFields.put("n3rd_imdg_subs_rsk_lbl_cd", "n3rdImdgSubsRskLblCd");
		this.hashFields.put("ttl_dim_wdt", "ttlDimWdt");
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("in_n2nd_imdg_pck_qty", "inN2ndImdgPckQty");
		this.hashFields.put("psa_no", "psaNo");
		this.hashFields.put("dcgo_sts_cd", "dcgoStsCd");
		this.hashFields.put("emer_cntc_pson_nm", "emerCntcPsonNm");
		this.hashFields.put("rada_skd_no", "radaSkdNo");
		this.hashFields.put("out_n2nd_imdg_pck_cd", "outN2ndImdgPckCd");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lf_sd_ovr_dim_len", "lfSdOvrDimLen");
		this.hashFields.put("in_n2nd_imdg_pck_cd", "inN2ndImdgPckCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("fwrd_ovr_dim_len", "fwrdOvrDimLen");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("in_n1st_imdg_pck_qty", "inN1stImdgPckQty");
		this.hashFields.put("mrn_polut_flg", "mrnPolutFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("cntr_ref_no", "cntrRefNo");
		this.hashFields.put("auth_ofc_cd", "authOfcCd");
		this.hashFields.put("auth_dt", "authDt");
		this.hashFields.put("net_wgt", "netWgt");
		this.hashFields.put("spcl_cgo_cate_cd", "spclCgoCateCd");
		this.hashFields.put("spcl_cntr_seq", "spclCntrSeq");
		this.hashFields.put("ttl_dim_hgt", "ttlDimHgt");
		this.hashFields.put("void_slt_qty", "voidSltQty");
		this.hashFields.put("hgt_ovr_dim_len", "hgtOvrDimLen");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rada_amt", "radaAmt");
		this.hashFields.put("net_explo_wgt", "netExploWgt");
		this.hashFields.put("cgo_lcl_flg", "cgoLclFlg");
		this.hashFields.put("cmdt_desc", "cmdtDesc");
		this.hashFields.put("emer_rspn_gid_no", "emerRspnGidNo");
		this.hashFields.put("hzd_desc", "hzdDesc");
		this.hashFields.put("ttl_dim_len", "ttlDimLen");
		this.hashFields.put("cgo_rqst_dt", "cgoRqstDt");
		this.hashFields.put("auth_usr_id", "authUsrId");
		this.hashFields.put("cnee_dtl_desc", "cneeDtlDesc");
		this.hashFields.put("emer_rspn_gid_chr_no", "emerRspnGidChrNo");
		this.hashFields.put("apro_ref_no", "aproRefNo");
		this.hashFields.put("emer_temp_ctnt", "emerTempCtnt");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("rt_sd_ovr_dim_len", "rtSdOvrDimLen");
		this.hashFields.put("spcl_cgo_seq", "spclCgoSeq");
		this.hashFields.put("emer_cntc_phn_no", "emerCntcPhnNo");
		this.hashFields.put("meas_tp_cd", "measTpCd");
		this.hashFields.put("imdg_pck_grp_cd", "imdgPckGrpCd");
		this.hashFields.put("flsh_pnt_cdo_temp", "flshPntCdoTemp");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rada_trsp_no", "radaTrspNo");
		this.hashFields.put("n1st_imdg_subs_rsk_lbl_cd", "n1stImdgSubsRskLblCd");
		this.hashFields.put("rada_ut_cd", "radaUtCd");
		this.hashFields.put("max_in_pck_tp_cd", "maxInPckTpCd");
		this.hashFields.put("in_n1st_imdg_pck_cd", "inN1stImdgPckCd");
		this.hashFields.put("out_n2nd_imdg_pck_qty", "outN2ndImdgPckQty");
		this.hashFields.put("ems_no", "emsNo");
		this.hashFields.put("max_in_pck_qty", "maxInPckQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("certi_no", "certiNo");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("out_n1st_imdg_pck_qty", "outN1stImdgPckQty");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("imdg_expt_qty_flg", "imdgExptQtyFlg");
		this.hashFields.put("n2nd_imdg_subs_rsk_lbl_cd", "n2ndImdgSubsRskLblCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("clod_flg", "clodFlg");
		this.hashFields.put("bkwd_ovr_dim_len", "bkwdOvrDimLen");
		this.hashFields.put("imdg_co_grp_cd", "imdgCoGrpCd");
		this.hashFields.put("bkg_ref_no", "bkgRefNo");
		this.hashFields.put("spcl_stwg_rqst_desc", "spclStwgRqstDesc");
		this.hashFields.put("cgo_opr_cd", "cgoOprCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("ctrl_temp_ctnt", "ctrlTempCtnt");
		this.hashFields.put("prp_shp_nm", "prpShpNm");
		this.hashFields.put("auth_sts_cd", "authStsCd");
		this.hashFields.put("out_n1st_imdg_pck_cd", "outN1stImdgPckCd");
		this.hashFields.put("imdg_lmt_qty_flg", "imdgLmtQtyFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return spclCgoRqstSeq
	 */
	public String getSpclCgoRqstSeq() {
		return this.spclCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return n3rdImdgSubsRskLblCd
	 */
	public String getN3rdImdgSubsRskLblCd() {
		return this.n3rdImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @return ttlDimWdt
	 */
	public String getTtlDimWdt() {
		return this.ttlDimWdt;
	}
	
	/**
	 * Column Info
	 * @return imdgUnNoSeq
	 */
	public String getImdgUnNoSeq() {
		return this.imdgUnNoSeq;
	}
	
	/**
	 * Column Info
	 * @return inN2ndImdgPckQty
	 */
	public String getInN2ndImdgPckQty() {
		return this.inN2ndImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @return psaNo
	 */
	public String getPsaNo() {
		return this.psaNo;
	}
	
	/**
	 * Column Info
	 * @return dcgoStsCd
	 */
	public String getDcgoStsCd() {
		return this.dcgoStsCd;
	}
	
	/**
	 * Column Info
	 * @return emerCntcPsonNm
	 */
	public String getEmerCntcPsonNm() {
		return this.emerCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return radaSkdNo
	 */
	public String getRadaSkdNo() {
		return this.radaSkdNo;
	}
	
	/**
	 * Column Info
	 * @return outN2ndImdgPckCd
	 */
	public String getOutN2ndImdgPckCd() {
		return this.outN2ndImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
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
	 * @return lfSdOvrDimLen
	 */
	public String getLfSdOvrDimLen() {
		return this.lfSdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @return inN2ndImdgPckCd
	 */
	public String getInN2ndImdgPckCd() {
		return this.inN2ndImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return fwrdOvrDimLen
	 */
	public String getFwrdOvrDimLen() {
		return this.fwrdOvrDimLen;
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
	 * @return inN1stImdgPckQty
	 */
	public String getInN1stImdgPckQty() {
		return this.inN1stImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @return mrnPolutFlg
	 */
	public String getMrnPolutFlg() {
		return this.mrnPolutFlg;
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
	 * @return imdgUnNo
	 */
	public String getImdgUnNo() {
		return this.imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @return cntrRefNo
	 */
	public String getCntrRefNo() {
		return this.cntrRefNo;
	}
	
	/**
	 * Column Info
	 * @return authOfcCd
	 */
	public String getAuthOfcCd() {
		return this.authOfcCd;
	}
	
	/**
	 * Column Info
	 * @return authDt
	 */
	public String getAuthDt() {
		return this.authDt;
	}
	
	/**
	 * Column Info
	 * @return netWgt
	 */
	public String getNetWgt() {
		return this.netWgt;
	}
	
	/**
	 * Column Info
	 * @return spclCgoCateCd
	 */
	public String getSpclCgoCateCd() {
		return this.spclCgoCateCd;
	}
	
	/**
	 * Column Info
	 * @return spclCntrSeq
	 */
	public String getSpclCntrSeq() {
		return this.spclCntrSeq;
	}
	
	/**
	 * Column Info
	 * @return ttlDimHgt
	 */
	public String getTtlDimHgt() {
		return this.ttlDimHgt;
	}
	
	/**
	 * Column Info
	 * @return voidSltQty
	 */
	public String getVoidSltQty() {
		return this.voidSltQty;
	}
	
	/**
	 * Column Info
	 * @return hgtOvrDimLen
	 */
	public String getHgtOvrDimLen() {
		return this.hgtOvrDimLen;
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
	 * @return radaAmt
	 */
	public String getRadaAmt() {
		return this.radaAmt;
	}
	
	/**
	 * Column Info
	 * @return netExploWgt
	 */
	public String getNetExploWgt() {
		return this.netExploWgt;
	}
	
	/**
	 * Column Info
	 * @return cgoLclFlg
	 */
	public String getCgoLclFlg() {
		return this.cgoLclFlg;
	}
	
	/**
	 * Column Info
	 * @return cmdtDesc
	 */
	public String getCmdtDesc() {
		return this.cmdtDesc;
	}
	
	/**
	 * Column Info
	 * @return emerRspnGidNo
	 */
	public String getEmerRspnGidNo() {
		return this.emerRspnGidNo;
	}
	
	/**
	 * Column Info
	 * @return hzdDesc
	 */
	public String getHzdDesc() {
		return this.hzdDesc;
	}
	
	/**
	 * Column Info
	 * @return ttlDimLen
	 */
	public String getTtlDimLen() {
		return this.ttlDimLen;
	}
	
	/**
	 * Column Info
	 * @return cgoRqstDt
	 */
	public String getCgoRqstDt() {
		return this.cgoRqstDt;
	}
	
	/**
	 * Column Info
	 * @return authUsrId
	 */
	public String getAuthUsrId() {
		return this.authUsrId;
	}
	
	/**
	 * Column Info
	 * @return cneeDtlDesc
	 */
	public String getCneeDtlDesc() {
		return this.cneeDtlDesc;
	}
	
	/**
	 * Column Info
	 * @return emerRspnGidChrNo
	 */
	public String getEmerRspnGidChrNo() {
		return this.emerRspnGidChrNo;
	}
	
	/**
	 * Column Info
	 * @return aproRefNo
	 */
	public String getAproRefNo() {
		return this.aproRefNo;
	}
	
	/**
	 * Column Info
	 * @return emerTempCtnt
	 */
	public String getEmerTempCtnt() {
		return this.emerTempCtnt;
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
	 * @return grsWgt
	 */
	public String getGrsWgt() {
		return this.grsWgt;
	}
	
	/**
	 * Column Info
	 * @return rtSdOvrDimLen
	 */
	public String getRtSdOvrDimLen() {
		return this.rtSdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @return spclCgoSeq
	 */
	public String getSpclCgoSeq() {
		return this.spclCgoSeq;
	}
	
	/**
	 * Column Info
	 * @return emerCntcPhnNo
	 */
	public String getEmerCntcPhnNo() {
		return this.emerCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @return measTpCd
	 */
	public String getMeasTpCd() {
		return this.measTpCd;
	}
	
	/**
	 * Column Info
	 * @return imdgPckGrpCd
	 */
	public String getImdgPckGrpCd() {
		return this.imdgPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @return flshPntCdoTemp
	 */
	public String getFlshPntCdoTemp() {
		return this.flshPntCdoTemp;
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
	 * @return radaTrspNo
	 */
	public String getRadaTrspNo() {
		return this.radaTrspNo;
	}
	
	/**
	 * Column Info
	 * @return n1stImdgSubsRskLblCd
	 */
	public String getN1stImdgSubsRskLblCd() {
		return this.n1stImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @return radaUtCd
	 */
	public String getRadaUtCd() {
		return this.radaUtCd;
	}
	
	/**
	 * Column Info
	 * @return maxInPckTpCd
	 */
	public String getMaxInPckTpCd() {
		return this.maxInPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return inN1stImdgPckCd
	 */
	public String getInN1stImdgPckCd() {
		return this.inN1stImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @return outN2ndImdgPckQty
	 */
	public String getOutN2ndImdgPckQty() {
		return this.outN2ndImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @return emsNo
	 */
	public String getEmsNo() {
		return this.emsNo;
	}
	
	/**
	 * Column Info
	 * @return maxInPckQty
	 */
	public String getMaxInPckQty() {
		return this.maxInPckQty;
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
	 * @return certiNo
	 */
	public String getCertiNo() {
		return this.certiNo;
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
	 * @return outN1stImdgPckQty
	 */
	public String getOutN1stImdgPckQty() {
		return this.outN1stImdgPckQty;
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
	 * @return imdgExptQtyFlg
	 */
	public String getImdgExptQtyFlg() {
		return this.imdgExptQtyFlg;
	}
	
	/**
	 * Column Info
	 * @return n2ndImdgSubsRskLblCd
	 */
	public String getN2ndImdgSubsRskLblCd() {
		return this.n2ndImdgSubsRskLblCd;
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
	 * @return clodFlg
	 */
	public String getClodFlg() {
		return this.clodFlg;
	}
	
	/**
	 * Column Info
	 * @return bkwdOvrDimLen
	 */
	public String getBkwdOvrDimLen() {
		return this.bkwdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @return imdgCoGrpCd
	 */
	public String getImdgCoGrpCd() {
		return this.imdgCoGrpCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRefNo
	 */
	public String getBkgRefNo() {
		return this.bkgRefNo;
	}
	
	/**
	 * Column Info
	 * @return spclStwgRqstDesc
	 */
	public String getSpclStwgRqstDesc() {
		return this.spclStwgRqstDesc;
	}
	
	/**
	 * Column Info
	 * @return cgoOprCd
	 */
	public String getCgoOprCd() {
		return this.cgoOprCd;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return ctrlTempCtnt
	 */
	public String getCtrlTempCtnt() {
		return this.ctrlTempCtnt;
	}
	
	/**
	 * Column Info
	 * @return prpShpNm
	 */
	public String getPrpShpNm() {
		return this.prpShpNm;
	}
	
	/**
	 * Column Info
	 * @return authStsCd
	 */
	public String getAuthStsCd() {
		return this.authStsCd;
	}
	
	/**
	 * Column Info
	 * @return outN1stImdgPckCd
	 */
	public String getOutN1stImdgPckCd() {
		return this.outN1stImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @return imdgLmtQtyFlg
	 */
	public String getImdgLmtQtyFlg() {
		return this.imdgLmtQtyFlg;
	}
	

	/**
	 * Column Info
	 * @param spclCgoRqstSeq
	 */
	public void setSpclCgoRqstSeq(String spclCgoRqstSeq) {
		this.spclCgoRqstSeq = spclCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param n3rdImdgSubsRskLblCd
	 */
	public void setN3rdImdgSubsRskLblCd(String n3rdImdgSubsRskLblCd) {
		this.n3rdImdgSubsRskLblCd = n3rdImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @param ttlDimWdt
	 */
	public void setTtlDimWdt(String ttlDimWdt) {
		this.ttlDimWdt = ttlDimWdt;
	}
	
	/**
	 * Column Info
	 * @param imdgUnNoSeq
	 */
	public void setImdgUnNoSeq(String imdgUnNoSeq) {
		this.imdgUnNoSeq = imdgUnNoSeq;
	}
	
	/**
	 * Column Info
	 * @param inN2ndImdgPckQty
	 */
	public void setInN2ndImdgPckQty(String inN2ndImdgPckQty) {
		this.inN2ndImdgPckQty = inN2ndImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @param psaNo
	 */
	public void setPsaNo(String psaNo) {
		this.psaNo = psaNo;
	}
	
	/**
	 * Column Info
	 * @param dcgoStsCd
	 */
	public void setDcgoStsCd(String dcgoStsCd) {
		this.dcgoStsCd = dcgoStsCd;
	}
	
	/**
	 * Column Info
	 * @param emerCntcPsonNm
	 */
	public void setEmerCntcPsonNm(String emerCntcPsonNm) {
		this.emerCntcPsonNm = emerCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param radaSkdNo
	 */
	public void setRadaSkdNo(String radaSkdNo) {
		this.radaSkdNo = radaSkdNo;
	}
	
	/**
	 * Column Info
	 * @param outN2ndImdgPckCd
	 */
	public void setOutN2ndImdgPckCd(String outN2ndImdgPckCd) {
		this.outN2ndImdgPckCd = outN2ndImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
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
	 * @param lfSdOvrDimLen
	 */
	public void setLfSdOvrDimLen(String lfSdOvrDimLen) {
		this.lfSdOvrDimLen = lfSdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @param inN2ndImdgPckCd
	 */
	public void setInN2ndImdgPckCd(String inN2ndImdgPckCd) {
		this.inN2ndImdgPckCd = inN2ndImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param fwrdOvrDimLen
	 */
	public void setFwrdOvrDimLen(String fwrdOvrDimLen) {
		this.fwrdOvrDimLen = fwrdOvrDimLen;
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
	 * @param inN1stImdgPckQty
	 */
	public void setInN1stImdgPckQty(String inN1stImdgPckQty) {
		this.inN1stImdgPckQty = inN1stImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @param mrnPolutFlg
	 */
	public void setMrnPolutFlg(String mrnPolutFlg) {
		this.mrnPolutFlg = mrnPolutFlg;
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
	 * @param imdgUnNo
	 */
	public void setImdgUnNo(String imdgUnNo) {
		this.imdgUnNo = imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @param cntrRefNo
	 */
	public void setCntrRefNo(String cntrRefNo) {
		this.cntrRefNo = cntrRefNo;
	}
	
	/**
	 * Column Info
	 * @param authOfcCd
	 */
	public void setAuthOfcCd(String authOfcCd) {
		this.authOfcCd = authOfcCd;
	}
	
	/**
	 * Column Info
	 * @param authDt
	 */
	public void setAuthDt(String authDt) {
		this.authDt = authDt;
	}
	
	/**
	 * Column Info
	 * @param netWgt
	 */
	public void setNetWgt(String netWgt) {
		this.netWgt = netWgt;
	}
	
	/**
	 * Column Info
	 * @param spclCgoCateCd
	 */
	public void setSpclCgoCateCd(String spclCgoCateCd) {
		this.spclCgoCateCd = spclCgoCateCd;
	}
	
	/**
	 * Column Info
	 * @param spclCntrSeq
	 */
	public void setSpclCntrSeq(String spclCntrSeq) {
		this.spclCntrSeq = spclCntrSeq;
	}
	
	/**
	 * Column Info
	 * @param ttlDimHgt
	 */
	public void setTtlDimHgt(String ttlDimHgt) {
		this.ttlDimHgt = ttlDimHgt;
	}
	
	/**
	 * Column Info
	 * @param voidSltQty
	 */
	public void setVoidSltQty(String voidSltQty) {
		this.voidSltQty = voidSltQty;
	}
	
	/**
	 * Column Info
	 * @param hgtOvrDimLen
	 */
	public void setHgtOvrDimLen(String hgtOvrDimLen) {
		this.hgtOvrDimLen = hgtOvrDimLen;
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
	 * @param radaAmt
	 */
	public void setRadaAmt(String radaAmt) {
		this.radaAmt = radaAmt;
	}
	
	/**
	 * Column Info
	 * @param netExploWgt
	 */
	public void setNetExploWgt(String netExploWgt) {
		this.netExploWgt = netExploWgt;
	}
	
	/**
	 * Column Info
	 * @param cgoLclFlg
	 */
	public void setCgoLclFlg(String cgoLclFlg) {
		this.cgoLclFlg = cgoLclFlg;
	}
	
	/**
	 * Column Info
	 * @param cmdtDesc
	 */
	public void setCmdtDesc(String cmdtDesc) {
		this.cmdtDesc = cmdtDesc;
	}
	
	/**
	 * Column Info
	 * @param emerRspnGidNo
	 */
	public void setEmerRspnGidNo(String emerRspnGidNo) {
		this.emerRspnGidNo = emerRspnGidNo;
	}
	
	/**
	 * Column Info
	 * @param hzdDesc
	 */
	public void setHzdDesc(String hzdDesc) {
		this.hzdDesc = hzdDesc;
	}
	
	/**
	 * Column Info
	 * @param ttlDimLen
	 */
	public void setTtlDimLen(String ttlDimLen) {
		this.ttlDimLen = ttlDimLen;
	}
	
	/**
	 * Column Info
	 * @param cgoRqstDt
	 */
	public void setCgoRqstDt(String cgoRqstDt) {
		this.cgoRqstDt = cgoRqstDt;
	}
	
	/**
	 * Column Info
	 * @param authUsrId
	 */
	public void setAuthUsrId(String authUsrId) {
		this.authUsrId = authUsrId;
	}
	
	/**
	 * Column Info
	 * @param cneeDtlDesc
	 */
	public void setCneeDtlDesc(String cneeDtlDesc) {
		this.cneeDtlDesc = cneeDtlDesc;
	}
	
	/**
	 * Column Info
	 * @param emerRspnGidChrNo
	 */
	public void setEmerRspnGidChrNo(String emerRspnGidChrNo) {
		this.emerRspnGidChrNo = emerRspnGidChrNo;
	}
	
	/**
	 * Column Info
	 * @param aproRefNo
	 */
	public void setAproRefNo(String aproRefNo) {
		this.aproRefNo = aproRefNo;
	}
	
	/**
	 * Column Info
	 * @param emerTempCtnt
	 */
	public void setEmerTempCtnt(String emerTempCtnt) {
		this.emerTempCtnt = emerTempCtnt;
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
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
	}
	
	/**
	 * Column Info
	 * @param rtSdOvrDimLen
	 */
	public void setRtSdOvrDimLen(String rtSdOvrDimLen) {
		this.rtSdOvrDimLen = rtSdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @param spclCgoSeq
	 */
	public void setSpclCgoSeq(String spclCgoSeq) {
		this.spclCgoSeq = spclCgoSeq;
	}
	
	/**
	 * Column Info
	 * @param emerCntcPhnNo
	 */
	public void setEmerCntcPhnNo(String emerCntcPhnNo) {
		this.emerCntcPhnNo = emerCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @param measTpCd
	 */
	public void setMeasTpCd(String measTpCd) {
		this.measTpCd = measTpCd;
	}
	
	/**
	 * Column Info
	 * @param imdgPckGrpCd
	 */
	public void setImdgPckGrpCd(String imdgPckGrpCd) {
		this.imdgPckGrpCd = imdgPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @param flshPntCdoTemp
	 */
	public void setFlshPntCdoTemp(String flshPntCdoTemp) {
		this.flshPntCdoTemp = flshPntCdoTemp;
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
	 * @param radaTrspNo
	 */
	public void setRadaTrspNo(String radaTrspNo) {
		this.radaTrspNo = radaTrspNo;
	}
	
	/**
	 * Column Info
	 * @param n1stImdgSubsRskLblCd
	 */
	public void setN1stImdgSubsRskLblCd(String n1stImdgSubsRskLblCd) {
		this.n1stImdgSubsRskLblCd = n1stImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @param radaUtCd
	 */
	public void setRadaUtCd(String radaUtCd) {
		this.radaUtCd = radaUtCd;
	}
	
	/**
	 * Column Info
	 * @param maxInPckTpCd
	 */
	public void setMaxInPckTpCd(String maxInPckTpCd) {
		this.maxInPckTpCd = maxInPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param inN1stImdgPckCd
	 */
	public void setInN1stImdgPckCd(String inN1stImdgPckCd) {
		this.inN1stImdgPckCd = inN1stImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @param outN2ndImdgPckQty
	 */
	public void setOutN2ndImdgPckQty(String outN2ndImdgPckQty) {
		this.outN2ndImdgPckQty = outN2ndImdgPckQty;
	}
	
	/**
	 * Column Info
	 * @param emsNo
	 */
	public void setEmsNo(String emsNo) {
		this.emsNo = emsNo;
	}
	
	/**
	 * Column Info
	 * @param maxInPckQty
	 */
	public void setMaxInPckQty(String maxInPckQty) {
		this.maxInPckQty = maxInPckQty;
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
	 * @param certiNo
	 */
	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
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
	 * @param outN1stImdgPckQty
	 */
	public void setOutN1stImdgPckQty(String outN1stImdgPckQty) {
		this.outN1stImdgPckQty = outN1stImdgPckQty;
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
	 * @param imdgExptQtyFlg
	 */
	public void setImdgExptQtyFlg(String imdgExptQtyFlg) {
		this.imdgExptQtyFlg = imdgExptQtyFlg;
	}
	
	/**
	 * Column Info
	 * @param n2ndImdgSubsRskLblCd
	 */
	public void setN2ndImdgSubsRskLblCd(String n2ndImdgSubsRskLblCd) {
		this.n2ndImdgSubsRskLblCd = n2ndImdgSubsRskLblCd;
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
	 * @param clodFlg
	 */
	public void setClodFlg(String clodFlg) {
		this.clodFlg = clodFlg;
	}
	
	/**
	 * Column Info
	 * @param bkwdOvrDimLen
	 */
	public void setBkwdOvrDimLen(String bkwdOvrDimLen) {
		this.bkwdOvrDimLen = bkwdOvrDimLen;
	}
	
	/**
	 * Column Info
	 * @param imdgCoGrpCd
	 */
	public void setImdgCoGrpCd(String imdgCoGrpCd) {
		this.imdgCoGrpCd = imdgCoGrpCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRefNo
	 */
	public void setBkgRefNo(String bkgRefNo) {
		this.bkgRefNo = bkgRefNo;
	}
	
	/**
	 * Column Info
	 * @param spclStwgRqstDesc
	 */
	public void setSpclStwgRqstDesc(String spclStwgRqstDesc) {
		this.spclStwgRqstDesc = spclStwgRqstDesc;
	}
	
	/**
	 * Column Info
	 * @param cgoOprCd
	 */
	public void setCgoOprCd(String cgoOprCd) {
		this.cgoOprCd = cgoOprCd;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param ctrlTempCtnt
	 */
	public void setCtrlTempCtnt(String ctrlTempCtnt) {
		this.ctrlTempCtnt = ctrlTempCtnt;
	}
	
	/**
	 * Column Info
	 * @param prpShpNm
	 */
	public void setPrpShpNm(String prpShpNm) {
		this.prpShpNm = prpShpNm;
	}
	
	/**
	 * Column Info
	 * @param authStsCd
	 */
	public void setAuthStsCd(String authStsCd) {
		this.authStsCd = authStsCd;
	}
	
	/**
	 * Column Info
	 * @param outN1stImdgPckCd
	 */
	public void setOutN1stImdgPckCd(String outN1stImdgPckCd) {
		this.outN1stImdgPckCd = outN1stImdgPckCd;
	}
	
	/**
	 * Column Info
	 * @param imdgLmtQtyFlg
	 */
	public void setImdgLmtQtyFlg(String imdgLmtQtyFlg) {
		this.imdgLmtQtyFlg = imdgLmtQtyFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setSpclCgoRqstSeq(JSPUtil.getParameter(request, "spcl_cgo_rqst_seq", ""));
		setN3rdImdgSubsRskLblCd(JSPUtil.getParameter(request, "n3rd_imdg_subs_rsk_lbl_cd", ""));
		setTtlDimWdt(JSPUtil.getParameter(request, "ttl_dim_wdt", ""));
		setImdgUnNoSeq(JSPUtil.getParameter(request, "imdg_un_no_seq", ""));
		setInN2ndImdgPckQty(JSPUtil.getParameter(request, "in_n2nd_imdg_pck_qty", ""));
		setPsaNo(JSPUtil.getParameter(request, "psa_no", ""));
		setDcgoStsCd(JSPUtil.getParameter(request, "dcgo_sts_cd", ""));
		setEmerCntcPsonNm(JSPUtil.getParameter(request, "emer_cntc_pson_nm", ""));
		setRadaSkdNo(JSPUtil.getParameter(request, "rada_skd_no", ""));
		setOutN2ndImdgPckCd(JSPUtil.getParameter(request, "out_n2nd_imdg_pck_cd", ""));
		setCrrCd(JSPUtil.getParameter(request, "crr_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLfSdOvrDimLen(JSPUtil.getParameter(request, "lf_sd_ovr_dim_len", ""));
		setInN2ndImdgPckCd(JSPUtil.getParameter(request, "in_n2nd_imdg_pck_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setFwrdOvrDimLen(JSPUtil.getParameter(request, "fwrd_ovr_dim_len", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setInN1stImdgPckQty(JSPUtil.getParameter(request, "in_n1st_imdg_pck_qty", ""));
		setMrnPolutFlg(JSPUtil.getParameter(request, "mrn_polut_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setImdgUnNo(JSPUtil.getParameter(request, "imdg_un_no", ""));
		setCntrRefNo(JSPUtil.getParameter(request, "cntr_ref_no", ""));
		setAuthOfcCd(JSPUtil.getParameter(request, "auth_ofc_cd", ""));
		setAuthDt(JSPUtil.getParameter(request, "auth_dt", ""));
		setNetWgt(JSPUtil.getParameter(request, "net_wgt", ""));
		setSpclCgoCateCd(JSPUtil.getParameter(request, "spcl_cgo_cate_cd", ""));
		setSpclCntrSeq(JSPUtil.getParameter(request, "spcl_cntr_seq", ""));
		setTtlDimHgt(JSPUtil.getParameter(request, "ttl_dim_hgt", ""));
		setVoidSltQty(JSPUtil.getParameter(request, "void_slt_qty", ""));
		setHgtOvrDimLen(JSPUtil.getParameter(request, "hgt_ovr_dim_len", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRadaAmt(JSPUtil.getParameter(request, "rada_amt", ""));
		setNetExploWgt(JSPUtil.getParameter(request, "net_explo_wgt", ""));
		setCgoLclFlg(JSPUtil.getParameter(request, "cgo_lcl_flg", ""));
		setCmdtDesc(JSPUtil.getParameter(request, "cmdt_desc", ""));
		setEmerRspnGidNo(JSPUtil.getParameter(request, "emer_rspn_gid_no", ""));
		setHzdDesc(JSPUtil.getParameter(request, "hzd_desc", ""));
		setTtlDimLen(JSPUtil.getParameter(request, "ttl_dim_len", ""));
		setCgoRqstDt(JSPUtil.getParameter(request, "cgo_rqst_dt", ""));
		setAuthUsrId(JSPUtil.getParameter(request, "auth_usr_id", ""));
		setCneeDtlDesc(JSPUtil.getParameter(request, "cnee_dtl_desc", ""));
		setEmerRspnGidChrNo(JSPUtil.getParameter(request, "emer_rspn_gid_chr_no", ""));
		setAproRefNo(JSPUtil.getParameter(request, "apro_ref_no", ""));
		setEmerTempCtnt(JSPUtil.getParameter(request, "emer_temp_ctnt", ""));
		setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
		setGrsWgt(JSPUtil.getParameter(request, "grs_wgt", ""));
		setRtSdOvrDimLen(JSPUtil.getParameter(request, "rt_sd_ovr_dim_len", ""));
		setSpclCgoSeq(JSPUtil.getParameter(request, "spcl_cgo_seq", ""));
		setEmerCntcPhnNo(JSPUtil.getParameter(request, "emer_cntc_phn_no", ""));
		setMeasTpCd(JSPUtil.getParameter(request, "meas_tp_cd", ""));
		setImdgPckGrpCd(JSPUtil.getParameter(request, "imdg_pck_grp_cd", ""));
		setFlshPntCdoTemp(JSPUtil.getParameter(request, "flsh_pnt_cdo_temp", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRadaTrspNo(JSPUtil.getParameter(request, "rada_trsp_no", ""));
		setN1stImdgSubsRskLblCd(JSPUtil.getParameter(request, "n1st_imdg_subs_rsk_lbl_cd", ""));
		setRadaUtCd(JSPUtil.getParameter(request, "rada_ut_cd", ""));
		setMaxInPckTpCd(JSPUtil.getParameter(request, "max_in_pck_tp_cd", ""));
		setInN1stImdgPckCd(JSPUtil.getParameter(request, "in_n1st_imdg_pck_cd", ""));
		setOutN2ndImdgPckQty(JSPUtil.getParameter(request, "out_n2nd_imdg_pck_qty", ""));
		setEmsNo(JSPUtil.getParameter(request, "ems_no", ""));
		setMaxInPckQty(JSPUtil.getParameter(request, "max_in_pck_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCertiNo(JSPUtil.getParameter(request, "certi_no", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setOutN1stImdgPckQty(JSPUtil.getParameter(request, "out_n1st_imdg_pck_qty", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setImdgExptQtyFlg(JSPUtil.getParameter(request, "imdg_expt_qty_flg", ""));
		setN2ndImdgSubsRskLblCd(JSPUtil.getParameter(request, "n2nd_imdg_subs_rsk_lbl_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setClodFlg(JSPUtil.getParameter(request, "clod_flg", ""));
		setBkwdOvrDimLen(JSPUtil.getParameter(request, "bkwd_ovr_dim_len", ""));
		setImdgCoGrpCd(JSPUtil.getParameter(request, "imdg_co_grp_cd", ""));
		setBkgRefNo(JSPUtil.getParameter(request, "bkg_ref_no", ""));
		setSpclStwgRqstDesc(JSPUtil.getParameter(request, "spcl_stwg_rqst_desc", ""));
		setCgoOprCd(JSPUtil.getParameter(request, "cgo_opr_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setCtrlTempCtnt(JSPUtil.getParameter(request, "ctrl_temp_ctnt", ""));
		setPrpShpNm(JSPUtil.getParameter(request, "prp_shp_nm", ""));
		setAuthStsCd(JSPUtil.getParameter(request, "auth_sts_cd", ""));
		setOutN1stImdgPckCd(JSPUtil.getParameter(request, "out_n1st_imdg_pck_cd", ""));
		setImdgLmtQtyFlg(JSPUtil.getParameter(request, "imdg_lmt_qty_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgPrnrAproRqstCgoVO[]
	 */
	public ScgPrnrAproRqstCgoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgPrnrAproRqstCgoVO[]
	 */
	public ScgPrnrAproRqstCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgPrnrAproRqstCgoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] spclCgoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_rqst_seq", length));
			String[] n3rdImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_imdg_subs_rsk_lbl_cd", length));
			String[] ttlDimWdt = (JSPUtil.getParameter(request, prefix	+ "ttl_dim_wdt", length));
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq", length));
			String[] inN2ndImdgPckQty = (JSPUtil.getParameter(request, prefix	+ "in_n2nd_imdg_pck_qty", length));
			String[] psaNo = (JSPUtil.getParameter(request, prefix	+ "psa_no", length));
			String[] dcgoStsCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_sts_cd", length));
			String[] emerCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_pson_nm", length));
			String[] radaSkdNo = (JSPUtil.getParameter(request, prefix	+ "rada_skd_no", length));
			String[] outN2ndImdgPckCd = (JSPUtil.getParameter(request, prefix	+ "out_n2nd_imdg_pck_cd", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lfSdOvrDimLen = (JSPUtil.getParameter(request, prefix	+ "lf_sd_ovr_dim_len", length));
			String[] inN2ndImdgPckCd = (JSPUtil.getParameter(request, prefix	+ "in_n2nd_imdg_pck_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] fwrdOvrDimLen = (JSPUtil.getParameter(request, prefix	+ "fwrd_ovr_dim_len", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] inN1stImdgPckQty = (JSPUtil.getParameter(request, prefix	+ "in_n1st_imdg_pck_qty", length));
			String[] mrnPolutFlg = (JSPUtil.getParameter(request, prefix	+ "mrn_polut_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no", length));
			String[] cntrRefNo = (JSPUtil.getParameter(request, prefix	+ "cntr_ref_no", length));
			String[] authOfcCd = (JSPUtil.getParameter(request, prefix	+ "auth_ofc_cd", length));
			String[] authDt = (JSPUtil.getParameter(request, prefix	+ "auth_dt", length));
			String[] netWgt = (JSPUtil.getParameter(request, prefix	+ "net_wgt", length));
			String[] spclCgoCateCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_cate_cd", length));
			String[] spclCntrSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cntr_seq", length));
			String[] ttlDimHgt = (JSPUtil.getParameter(request, prefix	+ "ttl_dim_hgt", length));
			String[] voidSltQty = (JSPUtil.getParameter(request, prefix	+ "void_slt_qty", length));
			String[] hgtOvrDimLen = (JSPUtil.getParameter(request, prefix	+ "hgt_ovr_dim_len", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] radaAmt = (JSPUtil.getParameter(request, prefix	+ "rada_amt", length));
			String[] netExploWgt = (JSPUtil.getParameter(request, prefix	+ "net_explo_wgt", length));
			String[] cgoLclFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_lcl_flg", length));
			String[] cmdtDesc = (JSPUtil.getParameter(request, prefix	+ "cmdt_desc", length));
			String[] emerRspnGidNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_no", length));
			String[] hzdDesc = (JSPUtil.getParameter(request, prefix	+ "hzd_desc", length));
			String[] ttlDimLen = (JSPUtil.getParameter(request, prefix	+ "ttl_dim_len", length));
			String[] cgoRqstDt = (JSPUtil.getParameter(request, prefix	+ "cgo_rqst_dt", length));
			String[] authUsrId = (JSPUtil.getParameter(request, prefix	+ "auth_usr_id", length));
			String[] cneeDtlDesc = (JSPUtil.getParameter(request, prefix	+ "cnee_dtl_desc", length));
			String[] emerRspnGidChrNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_chr_no", length));
			String[] aproRefNo = (JSPUtil.getParameter(request, prefix	+ "apro_ref_no", length));
			String[] emerTempCtnt = (JSPUtil.getParameter(request, prefix	+ "emer_temp_ctnt", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] rtSdOvrDimLen = (JSPUtil.getParameter(request, prefix	+ "rt_sd_ovr_dim_len", length));
			String[] spclCgoSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_seq", length));
			String[] emerCntcPhnNo = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_phn_no", length));
			String[] measTpCd = (JSPUtil.getParameter(request, prefix	+ "meas_tp_cd", length));
			String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_pck_grp_cd", length));
			String[] flshPntCdoTemp = (JSPUtil.getParameter(request, prefix	+ "flsh_pnt_cdo_temp", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] radaTrspNo = (JSPUtil.getParameter(request, prefix	+ "rada_trsp_no", length));
			String[] n1stImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n1st_imdg_subs_rsk_lbl_cd", length));
			String[] radaUtCd = (JSPUtil.getParameter(request, prefix	+ "rada_ut_cd", length));
			String[] maxInPckTpCd = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_tp_cd", length));
			String[] inN1stImdgPckCd = (JSPUtil.getParameter(request, prefix	+ "in_n1st_imdg_pck_cd", length));
			String[] outN2ndImdgPckQty = (JSPUtil.getParameter(request, prefix	+ "out_n2nd_imdg_pck_qty", length));
			String[] emsNo = (JSPUtil.getParameter(request, prefix	+ "ems_no", length));
			String[] maxInPckQty = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_qty", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] certiNo = (JSPUtil.getParameter(request, prefix	+ "certi_no", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] outN1stImdgPckQty = (JSPUtil.getParameter(request, prefix	+ "out_n1st_imdg_pck_qty", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] imdgExptQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_expt_qty_flg", length));
			String[] n2ndImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_imdg_subs_rsk_lbl_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] clodFlg = (JSPUtil.getParameter(request, prefix	+ "clod_flg", length));
			String[] bkwdOvrDimLen = (JSPUtil.getParameter(request, prefix	+ "bkwd_ovr_dim_len", length));
			String[] imdgCoGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_co_grp_cd", length));
			String[] bkgRefNo = (JSPUtil.getParameter(request, prefix	+ "bkg_ref_no", length));
			String[] spclStwgRqstDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_stwg_rqst_desc", length));
			String[] cgoOprCd = (JSPUtil.getParameter(request, prefix	+ "cgo_opr_cd", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] ctrlTempCtnt = (JSPUtil.getParameter(request, prefix	+ "ctrl_temp_ctnt", length));
			String[] prpShpNm = (JSPUtil.getParameter(request, prefix	+ "prp_shp_nm", length));
			String[] authStsCd = (JSPUtil.getParameter(request, prefix	+ "auth_sts_cd", length));
			String[] outN1stImdgPckCd = (JSPUtil.getParameter(request, prefix	+ "out_n1st_imdg_pck_cd", length));
			String[] imdgLmtQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_lmt_qty_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgPrnrAproRqstCgoVO();
				if (spclCgoRqstSeq[i] != null)
					model.setSpclCgoRqstSeq(spclCgoRqstSeq[i]);
				if (n3rdImdgSubsRskLblCd[i] != null)
					model.setN3rdImdgSubsRskLblCd(n3rdImdgSubsRskLblCd[i]);
				if (ttlDimWdt[i] != null)
					model.setTtlDimWdt(ttlDimWdt[i]);
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (inN2ndImdgPckQty[i] != null)
					model.setInN2ndImdgPckQty(inN2ndImdgPckQty[i]);
				if (psaNo[i] != null)
					model.setPsaNo(psaNo[i]);
				if (dcgoStsCd[i] != null)
					model.setDcgoStsCd(dcgoStsCd[i]);
				if (emerCntcPsonNm[i] != null)
					model.setEmerCntcPsonNm(emerCntcPsonNm[i]);
				if (radaSkdNo[i] != null)
					model.setRadaSkdNo(radaSkdNo[i]);
				if (outN2ndImdgPckCd[i] != null)
					model.setOutN2ndImdgPckCd(outN2ndImdgPckCd[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lfSdOvrDimLen[i] != null)
					model.setLfSdOvrDimLen(lfSdOvrDimLen[i]);
				if (inN2ndImdgPckCd[i] != null)
					model.setInN2ndImdgPckCd(inN2ndImdgPckCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (fwrdOvrDimLen[i] != null)
					model.setFwrdOvrDimLen(fwrdOvrDimLen[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (inN1stImdgPckQty[i] != null)
					model.setInN1stImdgPckQty(inN1stImdgPckQty[i]);
				if (mrnPolutFlg[i] != null)
					model.setMrnPolutFlg(mrnPolutFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (cntrRefNo[i] != null)
					model.setCntrRefNo(cntrRefNo[i]);
				if (authOfcCd[i] != null)
					model.setAuthOfcCd(authOfcCd[i]);
				if (authDt[i] != null)
					model.setAuthDt(authDt[i]);
				if (netWgt[i] != null)
					model.setNetWgt(netWgt[i]);
				if (spclCgoCateCd[i] != null)
					model.setSpclCgoCateCd(spclCgoCateCd[i]);
				if (spclCntrSeq[i] != null)
					model.setSpclCntrSeq(spclCntrSeq[i]);
				if (ttlDimHgt[i] != null)
					model.setTtlDimHgt(ttlDimHgt[i]);
				if (voidSltQty[i] != null)
					model.setVoidSltQty(voidSltQty[i]);
				if (hgtOvrDimLen[i] != null)
					model.setHgtOvrDimLen(hgtOvrDimLen[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (radaAmt[i] != null)
					model.setRadaAmt(radaAmt[i]);
				if (netExploWgt[i] != null)
					model.setNetExploWgt(netExploWgt[i]);
				if (cgoLclFlg[i] != null)
					model.setCgoLclFlg(cgoLclFlg[i]);
				if (cmdtDesc[i] != null)
					model.setCmdtDesc(cmdtDesc[i]);
				if (emerRspnGidNo[i] != null)
					model.setEmerRspnGidNo(emerRspnGidNo[i]);
				if (hzdDesc[i] != null)
					model.setHzdDesc(hzdDesc[i]);
				if (ttlDimLen[i] != null)
					model.setTtlDimLen(ttlDimLen[i]);
				if (cgoRqstDt[i] != null)
					model.setCgoRqstDt(cgoRqstDt[i]);
				if (authUsrId[i] != null)
					model.setAuthUsrId(authUsrId[i]);
				if (cneeDtlDesc[i] != null)
					model.setCneeDtlDesc(cneeDtlDesc[i]);
				if (emerRspnGidChrNo[i] != null)
					model.setEmerRspnGidChrNo(emerRspnGidChrNo[i]);
				if (aproRefNo[i] != null)
					model.setAproRefNo(aproRefNo[i]);
				if (emerTempCtnt[i] != null)
					model.setEmerTempCtnt(emerTempCtnt[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (rtSdOvrDimLen[i] != null)
					model.setRtSdOvrDimLen(rtSdOvrDimLen[i]);
				if (spclCgoSeq[i] != null)
					model.setSpclCgoSeq(spclCgoSeq[i]);
				if (emerCntcPhnNo[i] != null)
					model.setEmerCntcPhnNo(emerCntcPhnNo[i]);
				if (measTpCd[i] != null)
					model.setMeasTpCd(measTpCd[i]);
				if (imdgPckGrpCd[i] != null)
					model.setImdgPckGrpCd(imdgPckGrpCd[i]);
				if (flshPntCdoTemp[i] != null)
					model.setFlshPntCdoTemp(flshPntCdoTemp[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (radaTrspNo[i] != null)
					model.setRadaTrspNo(radaTrspNo[i]);
				if (n1stImdgSubsRskLblCd[i] != null)
					model.setN1stImdgSubsRskLblCd(n1stImdgSubsRskLblCd[i]);
				if (radaUtCd[i] != null)
					model.setRadaUtCd(radaUtCd[i]);
				if (maxInPckTpCd[i] != null)
					model.setMaxInPckTpCd(maxInPckTpCd[i]);
				if (inN1stImdgPckCd[i] != null)
					model.setInN1stImdgPckCd(inN1stImdgPckCd[i]);
				if (outN2ndImdgPckQty[i] != null)
					model.setOutN2ndImdgPckQty(outN2ndImdgPckQty[i]);
				if (emsNo[i] != null)
					model.setEmsNo(emsNo[i]);
				if (maxInPckQty[i] != null)
					model.setMaxInPckQty(maxInPckQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (certiNo[i] != null)
					model.setCertiNo(certiNo[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (outN1stImdgPckQty[i] != null)
					model.setOutN1stImdgPckQty(outN1stImdgPckQty[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (imdgExptQtyFlg[i] != null)
					model.setImdgExptQtyFlg(imdgExptQtyFlg[i]);
				if (n2ndImdgSubsRskLblCd[i] != null)
					model.setN2ndImdgSubsRskLblCd(n2ndImdgSubsRskLblCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (clodFlg[i] != null)
					model.setClodFlg(clodFlg[i]);
				if (bkwdOvrDimLen[i] != null)
					model.setBkwdOvrDimLen(bkwdOvrDimLen[i]);
				if (imdgCoGrpCd[i] != null)
					model.setImdgCoGrpCd(imdgCoGrpCd[i]);
				if (bkgRefNo[i] != null)
					model.setBkgRefNo(bkgRefNo[i]);
				if (spclStwgRqstDesc[i] != null)
					model.setSpclStwgRqstDesc(spclStwgRqstDesc[i]);
				if (cgoOprCd[i] != null)
					model.setCgoOprCd(cgoOprCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (ctrlTempCtnt[i] != null)
					model.setCtrlTempCtnt(ctrlTempCtnt[i]);
				if (prpShpNm[i] != null)
					model.setPrpShpNm(prpShpNm[i]);
				if (authStsCd[i] != null)
					model.setAuthStsCd(authStsCd[i]);
				if (outN1stImdgPckCd[i] != null)
					model.setOutN1stImdgPckCd(outN1stImdgPckCd[i]);
				if (imdgLmtQtyFlg[i] != null)
					model.setImdgLmtQtyFlg(imdgLmtQtyFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgPrnrAproRqstCgoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgPrnrAproRqstCgoVO[]
	 */
	public ScgPrnrAproRqstCgoVO[] getScgPrnrAproRqstCgoVOs(){
		ScgPrnrAproRqstCgoVO[] vos = (ScgPrnrAproRqstCgoVO[])models.toArray(new ScgPrnrAproRqstCgoVO[models.size()]);
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
		this.spclCgoRqstSeq = this.spclCgoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdImdgSubsRskLblCd = this.n3rdImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlDimWdt = this.ttlDimWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inN2ndImdgPckQty = this.inN2ndImdgPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psaNo = this.psaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoStsCd = this.dcgoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPsonNm = this.emerCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaSkdNo = this.radaSkdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outN2ndImdgPckCd = this.outN2ndImdgPckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lfSdOvrDimLen = this.lfSdOvrDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inN2ndImdgPckCd = this.inN2ndImdgPckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdOvrDimLen = this.fwrdOvrDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inN1stImdgPckQty = this.inN1stImdgPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnPolutFlg = this.mrnPolutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRefNo = this.cntrRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authOfcCd = this.authOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authDt = this.authDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgt = this.netWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCateCd = this.spclCgoCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCntrSeq = this.spclCntrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlDimHgt = this.ttlDimHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voidSltQty = this.voidSltQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hgtOvrDimLen = this.hgtOvrDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaAmt = this.radaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netExploWgt = this.netExploWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoLclFlg = this.cgoLclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtDesc = this.cmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidNo = this.emerRspnGidNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdDesc = this.hzdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlDimLen = this.ttlDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoRqstDt = this.cgoRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authUsrId = this.authUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeDtlDesc = this.cneeDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidChrNo = this.emerRspnGidChrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRefNo = this.aproRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerTempCtnt = this.emerTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtSdOvrDimLen = this.rtSdOvrDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoSeq = this.spclCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPhnNo = this.emerCntcPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measTpCd = this.measTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPckGrpCd = this.imdgPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flshPntCdoTemp = this.flshPntCdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaTrspNo = this.radaTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stImdgSubsRskLblCd = this.n1stImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaUtCd = this.radaUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckTpCd = this.maxInPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inN1stImdgPckCd = this.inN1stImdgPckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outN2ndImdgPckQty = this.outN2ndImdgPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emsNo = this.emsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckQty = this.maxInPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.certiNo = this.certiNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outN1stImdgPckQty = this.outN1stImdgPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgExptQtyFlg = this.imdgExptQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndImdgSubsRskLblCd = this.n2ndImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clodFlg = this.clodFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkwdOvrDimLen = this.bkwdOvrDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgCoGrpCd = this.imdgCoGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRefNo = this.bkgRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclStwgRqstDesc = this.spclStwgRqstDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoOprCd = this.cgoOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlTempCtnt = this.ctrlTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpShpNm = this.prpShpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authStsCd = this.authStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outN1stImdgPckCd = this.outN1stImdgPckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgLmtQtyFlg = this.imdgLmtQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
