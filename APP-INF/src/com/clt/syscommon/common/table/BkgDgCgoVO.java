/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgDgCgoVO.java
*@FileTitle : BkgDgCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.14
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.08.14 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgDgCgoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgDgCgoVO> models = new ArrayList<BkgDgCgoVO>();
	
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String psaNo = null;
	/* Column Info */
	private String awkCgoSeq = null;
	/* Column Info */
	private String dcgoSeq = null;
	/* Column Info */
	private String dcgoStsCd = null;
	/* Column Info */
	private String emerCntcPsonNm = null;
	/* Column Info */
	private String outImdgPckQty1 = null;
	/* Column Info */
	private String outImdgPckQty2 = null;
	/* Column Info */
	private String radaSkdNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String imdgCompGrpCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String mrnPolutFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hcdgFlg = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String inImdgPckCd1 = null;
	/* Column Info */
	private String inImdgPckCd2 = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String netWgt = null;
	/* Column Info */
	private String cntrCgoSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String aplyNo = null;
	/* Column Info */
	private String radaAmt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String netExploWgt = null;
	/* Column Info */
	private String cgoLclFlg = null;
	/* Column Info */
	private String bbCgoSeq = null;
	/* Column Info */
	private String emerRspnGidNo = null;
	/* Column Info */
	private String hzdDesc = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String cneeDtlDesc = null;
	/* Column Info */
	private String emerRspnGidChrNo = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String emerTempCtnt = null;
	/* Column Info */
	private String outImdgPckCd2 = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String outImdgPckCd1 = null;
	/* Column Info */
	private String rcSeq = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String emerCntcPhnNoCtnt = null;
	/* Column Info */
	private String imdgPckGrpCd = null;
	/* Column Info */
	private String flshPntCdoTemp = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String radaTrspNo = null;
	/* Column Info */
	private String radaUtCd = null;
	/* Column Info */
	private String maxInPckTpCd = null;
	/* Column Info */
	private String emsNo = null;
	/* Column Info */
	private String maxInPckQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String spclCgoAproCd = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String certiNo = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String imdgExptQtyFlg = null;
	/* Column Info */
	private String dgCntrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String clodFlg = null;
	/* Column Info */
	private String spclStwgRqstDesc = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String ctrlTempCtnt = null;
	/* Column Info */
	private String inImdgPckQty1 = null;
	/* Column Info */
	private String hcdgDpndQtyFlg = null;
	/* Column Info */
	private String imdgSubsRskLblCd2 = null;
	/* Column Info */
	private String inImdgPckQty2 = null;
	/* Column Info */
	private String imdgSubsRskLblCd1 = null;
	/* Column Info */
	private String prpShpNm = null;
	/* Column Info */
	private String imdgSubsRskLblCd4 = null;
	/* Column Info */
	private String imdgLmtQtyFlg = null;
	/* Column Info */
	private String imdgSubsRskLblCd3 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgDgCgoVO() {}

	public BkgDgCgoVO(String ibflag, String pagerows, String bkgNo, String dcgoSeq, String dgCntrSeq, String cntrCgoSeq, String cntrNo, String cntrTpszCd, String imdgUnNo, String imdgUnNoSeq, String imdgClssCd, String imdgSubsRskLblCd1, String imdgSubsRskLblCd2, String imdgSubsRskLblCd3, String imdgLmtQtyFlg, String imdgExptQtyFlg, String netWgt, String grsWgt, String wgtUtCd, String flshPntCdoTemp, String prpShpNm, String hzdDesc, String measQty, String measUtCd, String clodFlg, String spclStwgRqstDesc, String dcgoStsCd, String cgoLclFlg, String emerRspnGidNo, String emerRspnGidChrNo, String emerCntcPhnNoCtnt, String emerCntcPsonNm, String emerTempCtnt, String ctrlTempCtnt, String emsNo, String imdgPckGrpCd, String mrnPolutFlg, String psaNo, String certiNo, String inImdgPckQty1, String inImdgPckCd1, String inImdgPckQty2, String inImdgPckCd2, String outImdgPckQty1, String outImdgPckCd1, String outImdgPckQty2, String outImdgPckCd2, String maxInPckQty, String maxInPckTpCd, String cneeDtlDesc, String netExploWgt, String radaSkdNo, String radaAmt, String radaUtCd, String radaTrspNo, String rcFlg, String awkCgoFlg, String bbCgoFlg, String rcSeq, String awkCgoSeq, String bbCgoSeq, String hcdgFlg, String hcdgDpndQtyFlg, String rqstDt, String rqstUsrId, String aplyNo, String spclCgoAproCd, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String imdgCompGrpCd, String imdgSubsRskLblCd4, String cntrVolQty) {
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.psaNo = psaNo;
		this.awkCgoSeq = awkCgoSeq;
		this.dcgoSeq = dcgoSeq;
		this.dcgoStsCd = dcgoStsCd;
		this.emerCntcPsonNm = emerCntcPsonNm;
		this.outImdgPckQty1 = outImdgPckQty1;
		this.outImdgPckQty2 = outImdgPckQty2;
		this.radaSkdNo = radaSkdNo;
		this.pagerows = pagerows;
		this.imdgCompGrpCd = imdgCompGrpCd;
		this.wgtUtCd = wgtUtCd;
		this.cntrTpszCd = cntrTpszCd;
		this.mrnPolutFlg = mrnPolutFlg;
		this.updUsrId = updUsrId;
		this.hcdgFlg = hcdgFlg;
		this.imdgUnNo = imdgUnNo;
		this.inImdgPckCd1 = inImdgPckCd1;
		this.inImdgPckCd2 = inImdgPckCd2;
		this.awkCgoFlg = awkCgoFlg;
		this.netWgt = netWgt;
		this.cntrCgoSeq = cntrCgoSeq;
		this.creUsrId = creUsrId;
		this.aplyNo = aplyNo;
		this.radaAmt = radaAmt;
		this.bkgNo = bkgNo;
		this.netExploWgt = netExploWgt;
		this.cgoLclFlg = cgoLclFlg;
		this.bbCgoSeq = bbCgoSeq;
		this.emerRspnGidNo = emerRspnGidNo;
		this.hzdDesc = hzdDesc;
		this.rcFlg = rcFlg;
		this.cneeDtlDesc = cneeDtlDesc;
		this.emerRspnGidChrNo = emerRspnGidChrNo;
		this.cntrVolQty = cntrVolQty;
		this.emerTempCtnt = emerTempCtnt;
		this.outImdgPckCd2 = outImdgPckCd2;
		this.grsWgt = grsWgt;
		this.imdgClssCd = imdgClssCd;
		this.outImdgPckCd1 = outImdgPckCd1;
		this.rcSeq = rcSeq;
		this.rqstUsrId = rqstUsrId;
		this.emerCntcPhnNoCtnt = emerCntcPhnNoCtnt;
		this.imdgPckGrpCd = imdgPckGrpCd;
		this.flshPntCdoTemp = flshPntCdoTemp;
		this.creDt = creDt;
		this.radaTrspNo = radaTrspNo;
		this.radaUtCd = radaUtCd;
		this.maxInPckTpCd = maxInPckTpCd;
		this.emsNo = emsNo;
		this.maxInPckQty = maxInPckQty;
		this.ibflag = ibflag;
		this.spclCgoAproCd = spclCgoAproCd;
		this.bbCgoFlg = bbCgoFlg;
		this.certiNo = certiNo;
		this.measQty = measQty;
		this.measUtCd = measUtCd;
		this.imdgExptQtyFlg = imdgExptQtyFlg;
		this.dgCntrSeq = dgCntrSeq;
		this.updDt = updDt;
		this.rqstDt = rqstDt;
		this.clodFlg = clodFlg;
		this.spclStwgRqstDesc = spclStwgRqstDesc;
		this.diffRmk = diffRmk;
		this.cntrNo = cntrNo;
		this.ctrlTempCtnt = ctrlTempCtnt;
		this.inImdgPckQty1 = inImdgPckQty1;
		this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
		this.imdgSubsRskLblCd2 = imdgSubsRskLblCd2;
		this.inImdgPckQty2 = inImdgPckQty2;
		this.imdgSubsRskLblCd1 = imdgSubsRskLblCd1;
		this.prpShpNm = prpShpNm;
		this.imdgSubsRskLblCd4 = imdgSubsRskLblCd4;
		this.imdgLmtQtyFlg = imdgLmtQtyFlg;
		this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("psa_no", getPsaNo());
		this.hashColumns.put("awk_cgo_seq", getAwkCgoSeq());
		this.hashColumns.put("dcgo_seq", getDcgoSeq());
		this.hashColumns.put("dcgo_sts_cd", getDcgoStsCd());
		this.hashColumns.put("emer_cntc_pson_nm", getEmerCntcPsonNm());
		this.hashColumns.put("out_imdg_pck_qty1", getOutImdgPckQty1());
		this.hashColumns.put("out_imdg_pck_qty2", getOutImdgPckQty2());
		this.hashColumns.put("rada_skd_no", getRadaSkdNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("imdg_comp_grp_cd", getImdgCompGrpCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("mrn_polut_flg", getMrnPolutFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hcdg_flg", getHcdgFlg());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("in_imdg_pck_cd1", getInImdgPckCd1());
		this.hashColumns.put("in_imdg_pck_cd2", getInImdgPckCd2());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("net_wgt", getNetWgt());
		this.hashColumns.put("cntr_cgo_seq", getCntrCgoSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("aply_no", getAplyNo());
		this.hashColumns.put("rada_amt", getRadaAmt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("net_explo_wgt", getNetExploWgt());
		this.hashColumns.put("cgo_lcl_flg", getCgoLclFlg());
		this.hashColumns.put("bb_cgo_seq", getBbCgoSeq());
		this.hashColumns.put("emer_rspn_gid_no", getEmerRspnGidNo());
		this.hashColumns.put("hzd_desc", getHzdDesc());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("cnee_dtl_desc", getCneeDtlDesc());
		this.hashColumns.put("emer_rspn_gid_chr_no", getEmerRspnGidChrNo());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("emer_temp_ctnt", getEmerTempCtnt());
		this.hashColumns.put("out_imdg_pck_cd2", getOutImdgPckCd2());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("out_imdg_pck_cd1", getOutImdgPckCd1());
		this.hashColumns.put("rc_seq", getRcSeq());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("emer_cntc_phn_no_ctnt", getEmerCntcPhnNoCtnt());
		this.hashColumns.put("imdg_pck_grp_cd", getImdgPckGrpCd());
		this.hashColumns.put("flsh_pnt_cdo_temp", getFlshPntCdoTemp());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rada_trsp_no", getRadaTrspNo());
		this.hashColumns.put("rada_ut_cd", getRadaUtCd());
		this.hashColumns.put("max_in_pck_tp_cd", getMaxInPckTpCd());
		this.hashColumns.put("ems_no", getEmsNo());
		this.hashColumns.put("max_in_pck_qty", getMaxInPckQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("spcl_cgo_apro_cd", getSpclCgoAproCd());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("certi_no", getCertiNo());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("imdg_expt_qty_flg", getImdgExptQtyFlg());
		this.hashColumns.put("dg_cntr_seq", getDgCntrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("clod_flg", getClodFlg());
		this.hashColumns.put("spcl_stwg_rqst_desc", getSpclStwgRqstDesc());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("ctrl_temp_ctnt", getCtrlTempCtnt());
		this.hashColumns.put("in_imdg_pck_qty1", getInImdgPckQty1());
		this.hashColumns.put("hcdg_dpnd_qty_flg", getHcdgDpndQtyFlg());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd2", getImdgSubsRskLblCd2());
		this.hashColumns.put("in_imdg_pck_qty2", getInImdgPckQty2());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd1", getImdgSubsRskLblCd1());
		this.hashColumns.put("prp_shp_nm", getPrpShpNm());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd4", getImdgSubsRskLblCd4());
		this.hashColumns.put("imdg_lmt_qty_flg", getImdgLmtQtyFlg());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd3", getImdgSubsRskLblCd3());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("psa_no", "psaNo");
		this.hashFields.put("awk_cgo_seq", "awkCgoSeq");
		this.hashFields.put("dcgo_seq", "dcgoSeq");
		this.hashFields.put("dcgo_sts_cd", "dcgoStsCd");
		this.hashFields.put("emer_cntc_pson_nm", "emerCntcPsonNm");
		this.hashFields.put("out_imdg_pck_qty1", "outImdgPckQty1");
		this.hashFields.put("out_imdg_pck_qty2", "outImdgPckQty2");
		this.hashFields.put("rada_skd_no", "radaSkdNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("imdg_comp_grp_cd", "imdgCompGrpCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("mrn_polut_flg", "mrnPolutFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hcdg_flg", "hcdgFlg");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("in_imdg_pck_cd1", "inImdgPckCd1");
		this.hashFields.put("in_imdg_pck_cd2", "inImdgPckCd2");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("net_wgt", "netWgt");
		this.hashFields.put("cntr_cgo_seq", "cntrCgoSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("aply_no", "aplyNo");
		this.hashFields.put("rada_amt", "radaAmt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("net_explo_wgt", "netExploWgt");
		this.hashFields.put("cgo_lcl_flg", "cgoLclFlg");
		this.hashFields.put("bb_cgo_seq", "bbCgoSeq");
		this.hashFields.put("emer_rspn_gid_no", "emerRspnGidNo");
		this.hashFields.put("hzd_desc", "hzdDesc");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("cnee_dtl_desc", "cneeDtlDesc");
		this.hashFields.put("emer_rspn_gid_chr_no", "emerRspnGidChrNo");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("emer_temp_ctnt", "emerTempCtnt");
		this.hashFields.put("out_imdg_pck_cd2", "outImdgPckCd2");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("out_imdg_pck_cd1", "outImdgPckCd1");
		this.hashFields.put("rc_seq", "rcSeq");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("emer_cntc_phn_no_ctnt", "emerCntcPhnNoCtnt");
		this.hashFields.put("imdg_pck_grp_cd", "imdgPckGrpCd");
		this.hashFields.put("flsh_pnt_cdo_temp", "flshPntCdoTemp");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rada_trsp_no", "radaTrspNo");
		this.hashFields.put("rada_ut_cd", "radaUtCd");
		this.hashFields.put("max_in_pck_tp_cd", "maxInPckTpCd");
		this.hashFields.put("ems_no", "emsNo");
		this.hashFields.put("max_in_pck_qty", "maxInPckQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("spcl_cgo_apro_cd", "spclCgoAproCd");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("certi_no", "certiNo");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("imdg_expt_qty_flg", "imdgExptQtyFlg");
		this.hashFields.put("dg_cntr_seq", "dgCntrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("clod_flg", "clodFlg");
		this.hashFields.put("spcl_stwg_rqst_desc", "spclStwgRqstDesc");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("ctrl_temp_ctnt", "ctrlTempCtnt");
		this.hashFields.put("in_imdg_pck_qty1", "inImdgPckQty1");
		this.hashFields.put("hcdg_dpnd_qty_flg", "hcdgDpndQtyFlg");
		this.hashFields.put("imdg_subs_rsk_lbl_cd2", "imdgSubsRskLblCd2");
		this.hashFields.put("in_imdg_pck_qty2", "inImdgPckQty2");
		this.hashFields.put("imdg_subs_rsk_lbl_cd1", "imdgSubsRskLblCd1");
		this.hashFields.put("prp_shp_nm", "prpShpNm");
		this.hashFields.put("imdg_subs_rsk_lbl_cd4", "imdgSubsRskLblCd4");
		this.hashFields.put("imdg_lmt_qty_flg", "imdgLmtQtyFlg");
		this.hashFields.put("imdg_subs_rsk_lbl_cd3", "imdgSubsRskLblCd3");
		return this.hashFields;
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
	 * @return psaNo
	 */
	public String getPsaNo() {
		return this.psaNo;
	}
	
	/**
	 * Column Info
	 * @return awkCgoSeq
	 */
	public String getAwkCgoSeq() {
		return this.awkCgoSeq;
	}
	
	/**
	 * Column Info
	 * @return dcgoSeq
	 */
	public String getDcgoSeq() {
		return this.dcgoSeq;
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
	 * @return outImdgPckQty1
	 */
	public String getOutImdgPckQty1() {
		return this.outImdgPckQty1;
	}
	
	/**
	 * Column Info
	 * @return outImdgPckQty2
	 */
	public String getOutImdgPckQty2() {
		return this.outImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @return radaSkdNo
	 */
	public String getRadaSkdNo() {
		return this.radaSkdNo;
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
	 * @return imdgCompGrpCd
	 */
	public String getImdgCompGrpCd() {
		return this.imdgCompGrpCd;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return hcdgFlg
	 */
	public String getHcdgFlg() {
		return this.hcdgFlg;
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
	 * @return inImdgPckCd1
	 */
	public String getInImdgPckCd1() {
		return this.inImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @return inImdgPckCd2
	 */
	public String getInImdgPckCd2() {
		return this.inImdgPckCd2;
	}
	
	/**
	 * Column Info
	 * @return awkCgoFlg
	 */
	public String getAwkCgoFlg() {
		return this.awkCgoFlg;
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
	 * @return cntrCgoSeq
	 */
	public String getCntrCgoSeq() {
		return this.cntrCgoSeq;
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
	 * @return aplyNo
	 */
	public String getAplyNo() {
		return this.aplyNo;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return bbCgoSeq
	 */
	public String getBbCgoSeq() {
		return this.bbCgoSeq;
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
	 * @return rcFlg
	 */
	public String getRcFlg() {
		return this.rcFlg;
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
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
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
	 * @return outImdgPckCd2
	 */
	public String getOutImdgPckCd2() {
		return this.outImdgPckCd2;
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
	 * @return imdgClssCd
	 */
	public String getImdgClssCd() {
		return this.imdgClssCd;
	}
	
	/**
	 * Column Info
	 * @return outImdgPckCd1
	 */
	public String getOutImdgPckCd1() {
		return this.outImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @return rcSeq
	 */
	public String getRcSeq() {
		return this.rcSeq;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return emerCntcPhnNoCtnt
	 */
	public String getEmerCntcPhnNoCtnt() {
		return this.emerCntcPhnNoCtnt;
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
	 * @return spclCgoAproCd
	 */
	public String getSpclCgoAproCd() {
		return this.spclCgoAproCd;
	}
	
	/**
	 * Column Info
	 * @return bbCgoFlg
	 */
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
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
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
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
	 * @return dgCntrSeq
	 */
	public String getDgCntrSeq() {
		return this.dgCntrSeq;
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
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
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
	 * @return spclStwgRqstDesc
	 */
	public String getSpclStwgRqstDesc() {
		return this.spclStwgRqstDesc;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
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
	 * @return inImdgPckQty1
	 */
	public String getInImdgPckQty1() {
		return this.inImdgPckQty1;
	}
	
	/**
	 * Column Info
	 * @return hcdgDpndQtyFlg
	 */
	public String getHcdgDpndQtyFlg() {
		return this.hcdgDpndQtyFlg;
	}
	
	/**
	 * Column Info
	 * @return imdgSubsRskLblCd2
	 */
	public String getImdgSubsRskLblCd2() {
		return this.imdgSubsRskLblCd2;
	}
	
	/**
	 * Column Info
	 * @return inImdgPckQty2
	 */
	public String getInImdgPckQty2() {
		return this.inImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @return imdgSubsRskLblCd1
	 */
	public String getImdgSubsRskLblCd1() {
		return this.imdgSubsRskLblCd1;
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
	 * @return imdgSubsRskLblCd4
	 */
	public String getImdgSubsRskLblCd4() {
		return this.imdgSubsRskLblCd4;
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
	 * @return imdgSubsRskLblCd3
	 */
	public String getImdgSubsRskLblCd3() {
		return this.imdgSubsRskLblCd3;
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
	 * @param psaNo
	 */
	public void setPsaNo(String psaNo) {
		this.psaNo = psaNo;
	}
	
	/**
	 * Column Info
	 * @param awkCgoSeq
	 */
	public void setAwkCgoSeq(String awkCgoSeq) {
		this.awkCgoSeq = awkCgoSeq;
	}
	
	/**
	 * Column Info
	 * @param dcgoSeq
	 */
	public void setDcgoSeq(String dcgoSeq) {
		this.dcgoSeq = dcgoSeq;
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
	 * @param outImdgPckQty1
	 */
	public void setOutImdgPckQty1(String outImdgPckQty1) {
		this.outImdgPckQty1 = outImdgPckQty1;
	}
	
	/**
	 * Column Info
	 * @param outImdgPckQty2
	 */
	public void setOutImdgPckQty2(String outImdgPckQty2) {
		this.outImdgPckQty2 = outImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @param radaSkdNo
	 */
	public void setRadaSkdNo(String radaSkdNo) {
		this.radaSkdNo = radaSkdNo;
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
	 * @param imdgCompGrpCd
	 */
	public void setImdgCompGrpCd(String imdgCompGrpCd) {
		this.imdgCompGrpCd = imdgCompGrpCd;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param hcdgFlg
	 */
	public void setHcdgFlg(String hcdgFlg) {
		this.hcdgFlg = hcdgFlg;
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
	 * @param inImdgPckCd1
	 */
	public void setInImdgPckCd1(String inImdgPckCd1) {
		this.inImdgPckCd1 = inImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @param inImdgPckCd2
	 */
	public void setInImdgPckCd2(String inImdgPckCd2) {
		this.inImdgPckCd2 = inImdgPckCd2;
	}
	
	/**
	 * Column Info
	 * @param awkCgoFlg
	 */
	public void setAwkCgoFlg(String awkCgoFlg) {
		this.awkCgoFlg = awkCgoFlg;
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
	 * @param cntrCgoSeq
	 */
	public void setCntrCgoSeq(String cntrCgoSeq) {
		this.cntrCgoSeq = cntrCgoSeq;
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
	 * @param aplyNo
	 */
	public void setAplyNo(String aplyNo) {
		this.aplyNo = aplyNo;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param bbCgoSeq
	 */
	public void setBbCgoSeq(String bbCgoSeq) {
		this.bbCgoSeq = bbCgoSeq;
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
	 * @param rcFlg
	 */
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
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
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
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
	 * @param outImdgPckCd2
	 */
	public void setOutImdgPckCd2(String outImdgPckCd2) {
		this.outImdgPckCd2 = outImdgPckCd2;
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
	 * @param imdgClssCd
	 */
	public void setImdgClssCd(String imdgClssCd) {
		this.imdgClssCd = imdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param outImdgPckCd1
	 */
	public void setOutImdgPckCd1(String outImdgPckCd1) {
		this.outImdgPckCd1 = outImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @param rcSeq
	 */
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
	}
	
	/**
	 * Column Info
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param emerCntcPhnNoCtnt
	 */
	public void setEmerCntcPhnNoCtnt(String emerCntcPhnNoCtnt) {
		this.emerCntcPhnNoCtnt = emerCntcPhnNoCtnt;
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
	 * @param spclCgoAproCd
	 */
	public void setSpclCgoAproCd(String spclCgoAproCd) {
		this.spclCgoAproCd = spclCgoAproCd;
	}
	
	/**
	 * Column Info
	 * @param bbCgoFlg
	 */
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
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
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
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
	 * @param dgCntrSeq
	 */
	public void setDgCntrSeq(String dgCntrSeq) {
		this.dgCntrSeq = dgCntrSeq;
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
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
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
	 * @param spclStwgRqstDesc
	 */
	public void setSpclStwgRqstDesc(String spclStwgRqstDesc) {
		this.spclStwgRqstDesc = spclStwgRqstDesc;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
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
	 * @param inImdgPckQty1
	 */
	public void setInImdgPckQty1(String inImdgPckQty1) {
		this.inImdgPckQty1 = inImdgPckQty1;
	}
	
	/**
	 * Column Info
	 * @param hcdgDpndQtyFlg
	 */
	public void setHcdgDpndQtyFlg(String hcdgDpndQtyFlg) {
		this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgSubsRskLblCd2
	 */
	public void setImdgSubsRskLblCd2(String imdgSubsRskLblCd2) {
		this.imdgSubsRskLblCd2 = imdgSubsRskLblCd2;
	}
	
	/**
	 * Column Info
	 * @param inImdgPckQty2
	 */
	public void setInImdgPckQty2(String inImdgPckQty2) {
		this.inImdgPckQty2 = inImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @param imdgSubsRskLblCd1
	 */
	public void setImdgSubsRskLblCd1(String imdgSubsRskLblCd1) {
		this.imdgSubsRskLblCd1 = imdgSubsRskLblCd1;
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
	 * @param imdgSubsRskLblCd4
	 */
	public void setImdgSubsRskLblCd4(String imdgSubsRskLblCd4) {
		this.imdgSubsRskLblCd4 = imdgSubsRskLblCd4;
	}
	
	/**
	 * Column Info
	 * @param imdgLmtQtyFlg
	 */
	public void setImdgLmtQtyFlg(String imdgLmtQtyFlg) {
		this.imdgLmtQtyFlg = imdgLmtQtyFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgSubsRskLblCd3
	 */
	public void setImdgSubsRskLblCd3(String imdgSubsRskLblCd3) {
		this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setImdgUnNoSeq(JSPUtil.getParameter(request, "imdg_un_no_seq", ""));
		setPsaNo(JSPUtil.getParameter(request, "psa_no", ""));
		setAwkCgoSeq(JSPUtil.getParameter(request, "awk_cgo_seq", ""));
		setDcgoSeq(JSPUtil.getParameter(request, "dcgo_seq", ""));
		setDcgoStsCd(JSPUtil.getParameter(request, "dcgo_sts_cd", ""));
		setEmerCntcPsonNm(JSPUtil.getParameter(request, "emer_cntc_pson_nm", ""));
		setOutImdgPckQty1(JSPUtil.getParameter(request, "out_imdg_pck_qty1", ""));
		setOutImdgPckQty2(JSPUtil.getParameter(request, "out_imdg_pck_qty2", ""));
		setRadaSkdNo(JSPUtil.getParameter(request, "rada_skd_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setImdgCompGrpCd(JSPUtil.getParameter(request, "imdg_comp_grp_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setMrnPolutFlg(JSPUtil.getParameter(request, "mrn_polut_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHcdgFlg(JSPUtil.getParameter(request, "hcdg_flg", ""));
		setImdgUnNo(JSPUtil.getParameter(request, "imdg_un_no", ""));
		setInImdgPckCd1(JSPUtil.getParameter(request, "in_imdg_pck_cd1", ""));
		setInImdgPckCd2(JSPUtil.getParameter(request, "in_imdg_pck_cd2", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
		setNetWgt(JSPUtil.getParameter(request, "net_wgt", ""));
		setCntrCgoSeq(JSPUtil.getParameter(request, "cntr_cgo_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAplyNo(JSPUtil.getParameter(request, "aply_no", ""));
		setRadaAmt(JSPUtil.getParameter(request, "rada_amt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setNetExploWgt(JSPUtil.getParameter(request, "net_explo_wgt", ""));
		setCgoLclFlg(JSPUtil.getParameter(request, "cgo_lcl_flg", ""));
		setBbCgoSeq(JSPUtil.getParameter(request, "bb_cgo_seq", ""));
		setEmerRspnGidNo(JSPUtil.getParameter(request, "emer_rspn_gid_no", ""));
		setHzdDesc(JSPUtil.getParameter(request, "hzd_desc", ""));
		setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
		setCneeDtlDesc(JSPUtil.getParameter(request, "cnee_dtl_desc", ""));
		setEmerRspnGidChrNo(JSPUtil.getParameter(request, "emer_rspn_gid_chr_no", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setEmerTempCtnt(JSPUtil.getParameter(request, "emer_temp_ctnt", ""));
		setOutImdgPckCd2(JSPUtil.getParameter(request, "out_imdg_pck_cd2", ""));
		setGrsWgt(JSPUtil.getParameter(request, "grs_wgt", ""));
		setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
		setOutImdgPckCd1(JSPUtil.getParameter(request, "out_imdg_pck_cd1", ""));
		setRcSeq(JSPUtil.getParameter(request, "rc_seq", ""));
		setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
		setEmerCntcPhnNoCtnt(JSPUtil.getParameter(request, "emer_cntc_phn_no_ctnt", ""));
		setImdgPckGrpCd(JSPUtil.getParameter(request, "imdg_pck_grp_cd", ""));
		setFlshPntCdoTemp(JSPUtil.getParameter(request, "flsh_pnt_cdo_temp", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRadaTrspNo(JSPUtil.getParameter(request, "rada_trsp_no", ""));
		setRadaUtCd(JSPUtil.getParameter(request, "rada_ut_cd", ""));
		setMaxInPckTpCd(JSPUtil.getParameter(request, "max_in_pck_tp_cd", ""));
		setEmsNo(JSPUtil.getParameter(request, "ems_no", ""));
		setMaxInPckQty(JSPUtil.getParameter(request, "max_in_pck_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSpclCgoAproCd(JSPUtil.getParameter(request, "spcl_cgo_apro_cd", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setCertiNo(JSPUtil.getParameter(request, "certi_no", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setImdgExptQtyFlg(JSPUtil.getParameter(request, "imdg_expt_qty_flg", ""));
		setDgCntrSeq(JSPUtil.getParameter(request, "dg_cntr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
		setClodFlg(JSPUtil.getParameter(request, "clod_flg", ""));
		setSpclStwgRqstDesc(JSPUtil.getParameter(request, "spcl_stwg_rqst_desc", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCtrlTempCtnt(JSPUtil.getParameter(request, "ctrl_temp_ctnt", ""));
		setInImdgPckQty1(JSPUtil.getParameter(request, "in_imdg_pck_qty1", ""));
		setHcdgDpndQtyFlg(JSPUtil.getParameter(request, "hcdg_dpnd_qty_flg", ""));
		setImdgSubsRskLblCd2(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd2", ""));
		setInImdgPckQty2(JSPUtil.getParameter(request, "in_imdg_pck_qty2", ""));
		setImdgSubsRskLblCd1(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd1", ""));
		setPrpShpNm(JSPUtil.getParameter(request, "prp_shp_nm", ""));
		setImdgSubsRskLblCd4(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd4", ""));
		setImdgLmtQtyFlg(JSPUtil.getParameter(request, "imdg_lmt_qty_flg", ""));
		setImdgSubsRskLblCd3(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd3", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgDgCgoVO[]
	 */
	public BkgDgCgoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgDgCgoVO[]
	 */
	public BkgDgCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgDgCgoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq", length));
			String[] psaNo = (JSPUtil.getParameter(request, prefix	+ "psa_no", length));
			String[] awkCgoSeq = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_seq", length));
			String[] dcgoSeq = (JSPUtil.getParameter(request, prefix	+ "dcgo_seq", length));
			String[] dcgoStsCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_sts_cd", length));
			String[] emerCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_pson_nm", length));
			String[] outImdgPckQty1 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_qty1", length));
			String[] outImdgPckQty2 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_qty2", length));
			String[] radaSkdNo = (JSPUtil.getParameter(request, prefix	+ "rada_skd_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] imdgCompGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_comp_grp_cd", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] mrnPolutFlg = (JSPUtil.getParameter(request, prefix	+ "mrn_polut_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] hcdgFlg = (JSPUtil.getParameter(request, prefix	+ "hcdg_flg", length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no", length));
			String[] inImdgPckCd1 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_cd1", length));
			String[] inImdgPckCd2 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_cd2", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			String[] netWgt = (JSPUtil.getParameter(request, prefix	+ "net_wgt", length));
			String[] cntrCgoSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_cgo_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] aplyNo = (JSPUtil.getParameter(request, prefix	+ "aply_no", length));
			String[] radaAmt = (JSPUtil.getParameter(request, prefix	+ "rada_amt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] netExploWgt = (JSPUtil.getParameter(request, prefix	+ "net_explo_wgt", length));
			String[] cgoLclFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_lcl_flg", length));
			String[] bbCgoSeq = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_seq", length));
			String[] emerRspnGidNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_no", length));
			String[] hzdDesc = (JSPUtil.getParameter(request, prefix	+ "hzd_desc", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] cneeDtlDesc = (JSPUtil.getParameter(request, prefix	+ "cnee_dtl_desc", length));
			String[] emerRspnGidChrNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_chr_no", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] emerTempCtnt = (JSPUtil.getParameter(request, prefix	+ "emer_temp_ctnt", length));
			String[] outImdgPckCd2 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_cd2", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			String[] outImdgPckCd1 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_cd1", length));
			String[] rcSeq = (JSPUtil.getParameter(request, prefix	+ "rc_seq", length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] emerCntcPhnNoCtnt = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_phn_no_ctnt", length));
			String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_pck_grp_cd", length));
			String[] flshPntCdoTemp = (JSPUtil.getParameter(request, prefix	+ "flsh_pnt_cdo_temp", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] radaTrspNo = (JSPUtil.getParameter(request, prefix	+ "rada_trsp_no", length));
			String[] radaUtCd = (JSPUtil.getParameter(request, prefix	+ "rada_ut_cd", length));
			String[] maxInPckTpCd = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_tp_cd", length));
			String[] emsNo = (JSPUtil.getParameter(request, prefix	+ "ems_no", length));
			String[] maxInPckQty = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_qty", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] spclCgoAproCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_apro_cd", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] certiNo = (JSPUtil.getParameter(request, prefix	+ "certi_no", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] imdgExptQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_expt_qty_flg", length));
			String[] dgCntrSeq = (JSPUtil.getParameter(request, prefix	+ "dg_cntr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] clodFlg = (JSPUtil.getParameter(request, prefix	+ "clod_flg", length));
			String[] spclStwgRqstDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_stwg_rqst_desc", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] ctrlTempCtnt = (JSPUtil.getParameter(request, prefix	+ "ctrl_temp_ctnt", length));
			String[] inImdgPckQty1 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_qty1", length));
			String[] hcdgDpndQtyFlg = (JSPUtil.getParameter(request, prefix	+ "hcdg_dpnd_qty_flg", length));
			String[] imdgSubsRskLblCd2 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd2", length));
			String[] inImdgPckQty2 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_qty2", length));
			String[] imdgSubsRskLblCd1 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd1", length));
			String[] prpShpNm = (JSPUtil.getParameter(request, prefix	+ "prp_shp_nm", length));
			String[] imdgSubsRskLblCd4 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd4", length));
			String[] imdgLmtQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_lmt_qty_flg", length));
			String[] imdgSubsRskLblCd3 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd3", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgDgCgoVO();
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (psaNo[i] != null)
					model.setPsaNo(psaNo[i]);
				if (awkCgoSeq[i] != null)
					model.setAwkCgoSeq(awkCgoSeq[i]);
				if (dcgoSeq[i] != null)
					model.setDcgoSeq(dcgoSeq[i]);
				if (dcgoStsCd[i] != null)
					model.setDcgoStsCd(dcgoStsCd[i]);
				if (emerCntcPsonNm[i] != null)
					model.setEmerCntcPsonNm(emerCntcPsonNm[i]);
				if (outImdgPckQty1[i] != null)
					model.setOutImdgPckQty1(outImdgPckQty1[i]);
				if (outImdgPckQty2[i] != null)
					model.setOutImdgPckQty2(outImdgPckQty2[i]);
				if (radaSkdNo[i] != null)
					model.setRadaSkdNo(radaSkdNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (imdgCompGrpCd[i] != null)
					model.setImdgCompGrpCd(imdgCompGrpCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (mrnPolutFlg[i] != null)
					model.setMrnPolutFlg(mrnPolutFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hcdgFlg[i] != null)
					model.setHcdgFlg(hcdgFlg[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (inImdgPckCd1[i] != null)
					model.setInImdgPckCd1(inImdgPckCd1[i]);
				if (inImdgPckCd2[i] != null)
					model.setInImdgPckCd2(inImdgPckCd2[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (netWgt[i] != null)
					model.setNetWgt(netWgt[i]);
				if (cntrCgoSeq[i] != null)
					model.setCntrCgoSeq(cntrCgoSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (aplyNo[i] != null)
					model.setAplyNo(aplyNo[i]);
				if (radaAmt[i] != null)
					model.setRadaAmt(radaAmt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (netExploWgt[i] != null)
					model.setNetExploWgt(netExploWgt[i]);
				if (cgoLclFlg[i] != null)
					model.setCgoLclFlg(cgoLclFlg[i]);
				if (bbCgoSeq[i] != null)
					model.setBbCgoSeq(bbCgoSeq[i]);
				if (emerRspnGidNo[i] != null)
					model.setEmerRspnGidNo(emerRspnGidNo[i]);
				if (hzdDesc[i] != null)
					model.setHzdDesc(hzdDesc[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (cneeDtlDesc[i] != null)
					model.setCneeDtlDesc(cneeDtlDesc[i]);
				if (emerRspnGidChrNo[i] != null)
					model.setEmerRspnGidChrNo(emerRspnGidChrNo[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (emerTempCtnt[i] != null)
					model.setEmerTempCtnt(emerTempCtnt[i]);
				if (outImdgPckCd2[i] != null)
					model.setOutImdgPckCd2(outImdgPckCd2[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (outImdgPckCd1[i] != null)
					model.setOutImdgPckCd1(outImdgPckCd1[i]);
				if (rcSeq[i] != null)
					model.setRcSeq(rcSeq[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (emerCntcPhnNoCtnt[i] != null)
					model.setEmerCntcPhnNoCtnt(emerCntcPhnNoCtnt[i]);
				if (imdgPckGrpCd[i] != null)
					model.setImdgPckGrpCd(imdgPckGrpCd[i]);
				if (flshPntCdoTemp[i] != null)
					model.setFlshPntCdoTemp(flshPntCdoTemp[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (radaTrspNo[i] != null)
					model.setRadaTrspNo(radaTrspNo[i]);
				if (radaUtCd[i] != null)
					model.setRadaUtCd(radaUtCd[i]);
				if (maxInPckTpCd[i] != null)
					model.setMaxInPckTpCd(maxInPckTpCd[i]);
				if (emsNo[i] != null)
					model.setEmsNo(emsNo[i]);
				if (maxInPckQty[i] != null)
					model.setMaxInPckQty(maxInPckQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (spclCgoAproCd[i] != null)
					model.setSpclCgoAproCd(spclCgoAproCd[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (certiNo[i] != null)
					model.setCertiNo(certiNo[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (imdgExptQtyFlg[i] != null)
					model.setImdgExptQtyFlg(imdgExptQtyFlg[i]);
				if (dgCntrSeq[i] != null)
					model.setDgCntrSeq(dgCntrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (clodFlg[i] != null)
					model.setClodFlg(clodFlg[i]);
				if (spclStwgRqstDesc[i] != null)
					model.setSpclStwgRqstDesc(spclStwgRqstDesc[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (ctrlTempCtnt[i] != null)
					model.setCtrlTempCtnt(ctrlTempCtnt[i]);
				if (inImdgPckQty1[i] != null)
					model.setInImdgPckQty1(inImdgPckQty1[i]);
				if (hcdgDpndQtyFlg[i] != null)
					model.setHcdgDpndQtyFlg(hcdgDpndQtyFlg[i]);
				if (imdgSubsRskLblCd2[i] != null)
					model.setImdgSubsRskLblCd2(imdgSubsRskLblCd2[i]);
				if (inImdgPckQty2[i] != null)
					model.setInImdgPckQty2(inImdgPckQty2[i]);
				if (imdgSubsRskLblCd1[i] != null)
					model.setImdgSubsRskLblCd1(imdgSubsRskLblCd1[i]);
				if (prpShpNm[i] != null)
					model.setPrpShpNm(prpShpNm[i]);
				if (imdgSubsRskLblCd4[i] != null)
					model.setImdgSubsRskLblCd4(imdgSubsRskLblCd4[i]);
				if (imdgLmtQtyFlg[i] != null)
					model.setImdgLmtQtyFlg(imdgLmtQtyFlg[i]);
				if (imdgSubsRskLblCd3[i] != null)
					model.setImdgSubsRskLblCd3(imdgSubsRskLblCd3[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgDgCgoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgDgCgoVO[]
	 */
	public BkgDgCgoVO[] getBkgDgCgoVOs(){
		BkgDgCgoVO[] vos = (BkgDgCgoVO[])models.toArray(new BkgDgCgoVO[models.size()]);
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
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psaNo = this.psaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoSeq = this.awkCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoSeq = this.dcgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoStsCd = this.dcgoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPsonNm = this.emerCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckQty1 = this.outImdgPckQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckQty2 = this.outImdgPckQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaSkdNo = this.radaSkdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgCompGrpCd = this.imdgCompGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnPolutFlg = this.mrnPolutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hcdgFlg = this.hcdgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckCd1 = this.inImdgPckCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckCd2 = this.inImdgPckCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgt = this.netWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCgoSeq = this.cntrCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyNo = this.aplyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaAmt = this.radaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netExploWgt = this.netExploWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoLclFlg = this.cgoLclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoSeq = this.bbCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidNo = this.emerRspnGidNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdDesc = this.hzdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeDtlDesc = this.cneeDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidChrNo = this.emerRspnGidChrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerTempCtnt = this.emerTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckCd2 = this.outImdgPckCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckCd1 = this.outImdgPckCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcSeq = this.rcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPhnNoCtnt = this.emerCntcPhnNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPckGrpCd = this.imdgPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flshPntCdoTemp = this.flshPntCdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaTrspNo = this.radaTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaUtCd = this.radaUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckTpCd = this.maxInPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emsNo = this.emsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckQty = this.maxInPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAproCd = this.spclCgoAproCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.certiNo = this.certiNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgExptQtyFlg = this.imdgExptQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgCntrSeq = this.dgCntrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clodFlg = this.clodFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclStwgRqstDesc = this.spclStwgRqstDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlTempCtnt = this.ctrlTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckQty1 = this.inImdgPckQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hcdgDpndQtyFlg = this.hcdgDpndQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd2 = this.imdgSubsRskLblCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckQty2 = this.inImdgPckQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd1 = this.imdgSubsRskLblCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpShpNm = this.prpShpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd4 = this.imdgSubsRskLblCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgLmtQtyFlg = this.imdgLmtQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd3 = this.imdgSubsRskLblCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
