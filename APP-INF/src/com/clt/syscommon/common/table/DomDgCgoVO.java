/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : DomDgCgoVO.java
*@FileTitle : DomDgCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.11.20
*@LastModifier : 
*@LastVersion : 1.0
* 2017.11.20  
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

public class DomDgCgoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<DomDgCgoVO> models = new ArrayList<DomDgCgoVO>();
	
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String dcgoSeq = null;
	/* Column Info */
	private String awkCgoSeq = null;
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
	private String cntrTpszCd = null;
	/* Column Info */
	private String cfrPsnInhHzdZnCd = null;
	/* Column Info */
	private String intmdImdgPckQty1 = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String hcdgFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String intmdImdgPckQty2 = null;
	/* Column Info */
	private String rsdFlg = null;
	/* Column Info */
	private String saptTemp = null;
	/* Column Info */
	private String capaQty = null;
	/* Column Info */
	private String radaAmt = null;
	/* Column Info */
	private String hzdCtnt = null;
	/* Column Info */
	private String spclRqstDesc = null;
	/* Column Info */
	private String imdgSegrGrpNo = null;
	/* Column Info */
	private String netExploWgt = null;
	/* Column Info */
	private String emerRspnGidNo = null;
	/* Column Info */
	private String cneeDtlDesc = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String spclRqstFlg = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String rcSeq = null;
	/* Column Info */
	private String dotAuthNo = null;
	/* Column Info */
	private String emerCntcPhnNoCtnt = null;
	/* Column Info */
	private String imdgPckGrpCd = null;
	/* Column Info */
	private String cstmsExptFlg = null;
	/* Column Info */
	private String flshPntCdoTemp = null;
	/* Column Info */
	private String imdgAmdtNo = null;
	/* Column Info */
	private String emsNo = null;
	/* Column Info */
	private String sevrMrnPolutFlg = null;
	/* Column Info */
	private String maxInPckQty = null;
	/* Column Info */
	private String n1stPreVvdCd = null;
	/* Column Info */
	private String spclCgoAproCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String dgCntrSeq = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String stwgTempCtnt = null;
	/* Column Info */
	private String spclStwgRqstDesc = null;
	/* Column Info */
	private String dotExpNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String inImdgPckQty1 = null;
	/* Column Info */
	private String inImdgPckQty2 = null;
	/* Column Info */
	private String dcgoRefNo = null;
	/* Column Info */
	private String imdgUnNoSpclProviCtnt = null;
	/* Column Info */
	private String psaNo = null;
	/* Column Info */
	private String emerCntcPsonNm = null;
	/* Column Info */
	private String dcgoStsCd = null;
	/* Column Info */
	private String sadtTemp = null;
	/* Column Info */
	private String dcgoRqstGrpEml2 = null;
	/* Column Info */
	private String cfrRptQtyFlg = null;
	/* Column Info */
	private String erapNo = null;
	/* Column Info */
	private String dcgoRqstGrpEml1 = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String cfrFlg = null;
	/* Column Info */
	private String mrnPolutFlg = null;
	/* Column Info */
	private String inImdgPckCd1 = null;
	/* Column Info */
	private String inImdgPckCd2 = null;
	/* Column Info */
	private String erapAproRefNo = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String netWgt = null;
	/* Column Info */
	private String dotSpclAproNo = null;
	/* Column Info */
	private String cntrCgoSeq = null;
	/* Column Info */
	private String aplyNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cgoLclFlg = null;
	/* Column Info */
	private String bbCgoSeq = null;
	/* Column Info */
	private String hzdDesc = null;
	/* Column Info */
	private String emerRspnGidChrNo = null;
	/* Column Info */
	private String emerTempCtnt = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String outImdgPckCd2 = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String outImdgPckCd1 = null;
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String dmstBkgNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String radaTrspNo = null;
	/* Column Info */
	private String maxInPckTpCd = null;
	/* Column Info */
	private String radaUtCd = null;
	/* Column Info */
	private String rqstGdt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String certiNo = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String imdgExptQtyFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String grsCapaQty = null;
	/* Column Info */
	private String clodFlg = null;
	/* Column Info */
	private String intmdImdgPckCd1 = null;
	/* Column Info */
	private String intmdImdgPckCd2 = null;
	/* Column Info */
	private String erapCntcNo = null;
	/* Column Info */
	private String ctrlTempCtnt = null;
	/* Column Info */
	private String imdgSubsRskLblCd2 = null;
	/* Column Info */
	private String hcdgDpndQtyFlg = null;
	/* Column Info */
	private String imdgSubsRskLblCd1 = null;
	/* Column Info */
	private String prpShpNm = null;
	/* Column Info */
	private String imdgSubsRskLblCd4 = null;
	/* Column Info */
	private String imdgSubsRskLblCd3 = null;
	/* Column Info */
	private String imdgLmtQtyFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public DomDgCgoVO() {}

	public DomDgCgoVO(String ibflag, String pagerows, String dmstBkgNo, String dcgoSeq, String dgCntrSeq, String cntrCgoSeq, String cntrNo, String cntrVolQty, String cntrTpszCd, String imdgUnNo, String imdgUnNoSeq, String imdgClssCd, String imdgCompGrpCd, String imdgSubsRskLblCd1, String imdgSubsRskLblCd2, String imdgSubsRskLblCd3, String imdgSubsRskLblCd4, String imdgLmtQtyFlg, String imdgExptQtyFlg, String netWgt, String grsWgt, String wgtUtCd, String flshPntCdoTemp, String prpShpNm, String hzdDesc, String measQty, String measUtCd, String clodFlg, String spclStwgRqstDesc, String dcgoStsCd, String cgoLclFlg, String emerRspnGidNo, String emerRspnGidChrNo, String emerCntcPhnNoCtnt, String emerCntcPsonNm, String emerTempCtnt, String ctrlTempCtnt, String emsNo, String imdgPckGrpCd, String mrnPolutFlg, String psaNo, String certiNo, String inImdgPckQty1, String inImdgPckCd1, String inImdgPckQty2, String inImdgPckCd2, String intmdImdgPckQty1, String intmdImdgPckCd1, String intmdImdgPckQty2, String intmdImdgPckCd2, String outImdgPckQty1, String outImdgPckCd1, String outImdgPckQty2, String outImdgPckCd2, String maxInPckQty, String maxInPckTpCd, String cneeDtlDesc, String netExploWgt, String radaSkdNo, String radaAmt, String radaUtCd, String radaTrspNo, String rcFlg, String awkCgoFlg, String bbCgoFlg, String rcSeq, String awkCgoSeq, String bbCgoSeq, String hcdgFlg, String hcdgDpndQtyFlg, String rqstDt, String rqstGdt, String rqstUsrId, String aplyNo, String spclCgoAproCd, String spclRqstFlg, String spclRqstDesc, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String hzdCtnt, String stwgTempCtnt, String grsCapaQty, String dcgoRqstGrpEml1, String dcgoRqstGrpEml2, String cfrFlg, String rsdFlg, String imdgSegrGrpNo, String sevrMrnPolutFlg, String dcgoRefNo, String imdgAmdtNo, String imdgUnNoSpclProviCtnt, String erapNo, String erapCntcNo, String erapAproRefNo, String dotExpNo, String dotSpclAproNo, String dotAuthNo, String cstmsExptFlg, String n1stPreVvdCd, String edwUpdDt, String capaQty, String cfrRptQtyFlg, String cfrPsnInhHzdZnCd, String sadtTemp, String saptTemp) {
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.dcgoSeq = dcgoSeq;
		this.awkCgoSeq = awkCgoSeq;
		this.outImdgPckQty1 = outImdgPckQty1;
		this.outImdgPckQty2 = outImdgPckQty2;
		this.radaSkdNo = radaSkdNo;
		this.pagerows = pagerows;
		this.imdgCompGrpCd = imdgCompGrpCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cfrPsnInhHzdZnCd = cfrPsnInhHzdZnCd;
		this.intmdImdgPckQty1 = intmdImdgPckQty1;
		this.imdgUnNo = imdgUnNo;
		this.hcdgFlg = hcdgFlg;
		this.updUsrId = updUsrId;
		this.intmdImdgPckQty2 = intmdImdgPckQty2;
		this.rsdFlg = rsdFlg;
		this.saptTemp = saptTemp;
		this.capaQty = capaQty;
		this.radaAmt = radaAmt;
		this.hzdCtnt = hzdCtnt;
		this.spclRqstDesc = spclRqstDesc;
		this.imdgSegrGrpNo = imdgSegrGrpNo;
		this.netExploWgt = netExploWgt;
		this.emerRspnGidNo = emerRspnGidNo;
		this.cneeDtlDesc = cneeDtlDesc;
		this.rcFlg = rcFlg;
		this.spclRqstFlg = spclRqstFlg;
		this.imdgClssCd = imdgClssCd;
		this.rcSeq = rcSeq;
		this.dotAuthNo = dotAuthNo;
		this.emerCntcPhnNoCtnt = emerCntcPhnNoCtnt;
		this.imdgPckGrpCd = imdgPckGrpCd;
		this.cstmsExptFlg = cstmsExptFlg;
		this.flshPntCdoTemp = flshPntCdoTemp;
		this.imdgAmdtNo = imdgAmdtNo;
		this.emsNo = emsNo;
		this.sevrMrnPolutFlg = sevrMrnPolutFlg;
		this.maxInPckQty = maxInPckQty;
		this.n1stPreVvdCd = n1stPreVvdCd;
		this.spclCgoAproCd = spclCgoAproCd;
		this.measUtCd = measUtCd;
		this.dgCntrSeq = dgCntrSeq;
		this.rqstDt = rqstDt;
		this.stwgTempCtnt = stwgTempCtnt;
		this.spclStwgRqstDesc = spclStwgRqstDesc;
		this.dotExpNo = dotExpNo;
		this.diffRmk = diffRmk;
		this.cntrNo = cntrNo;
		this.inImdgPckQty1 = inImdgPckQty1;
		this.inImdgPckQty2 = inImdgPckQty2;
		this.dcgoRefNo = dcgoRefNo;
		this.imdgUnNoSpclProviCtnt = imdgUnNoSpclProviCtnt;
		this.psaNo = psaNo;
		this.emerCntcPsonNm = emerCntcPsonNm;
		this.dcgoStsCd = dcgoStsCd;
		this.sadtTemp = sadtTemp;
		this.dcgoRqstGrpEml2 = dcgoRqstGrpEml2;
		this.cfrRptQtyFlg = cfrRptQtyFlg;
		this.erapNo = erapNo;
		this.dcgoRqstGrpEml1 = dcgoRqstGrpEml1;
		this.wgtUtCd = wgtUtCd;
		this.cfrFlg = cfrFlg;
		this.mrnPolutFlg = mrnPolutFlg;
		this.inImdgPckCd1 = inImdgPckCd1;
		this.inImdgPckCd2 = inImdgPckCd2;
		this.erapAproRefNo = erapAproRefNo;
		this.awkCgoFlg = awkCgoFlg;
		this.netWgt = netWgt;
		this.dotSpclAproNo = dotSpclAproNo;
		this.cntrCgoSeq = cntrCgoSeq;
		this.aplyNo = aplyNo;
		this.creUsrId = creUsrId;
		this.cgoLclFlg = cgoLclFlg;
		this.bbCgoSeq = bbCgoSeq;
		this.hzdDesc = hzdDesc;
		this.emerRspnGidChrNo = emerRspnGidChrNo;
		this.emerTempCtnt = emerTempCtnt;
		this.cntrVolQty = cntrVolQty;
		this.outImdgPckCd2 = outImdgPckCd2;
		this.grsWgt = grsWgt;
		this.outImdgPckCd1 = outImdgPckCd1;
		this.rqstUsrId = rqstUsrId;
		this.dmstBkgNo = dmstBkgNo;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.radaTrspNo = radaTrspNo;
		this.maxInPckTpCd = maxInPckTpCd;
		this.radaUtCd = radaUtCd;
		this.rqstGdt = rqstGdt;
		this.ibflag = ibflag;
		this.certiNo = certiNo;
		this.bbCgoFlg = bbCgoFlg;
		this.measQty = measQty;
		this.imdgExptQtyFlg = imdgExptQtyFlg;
		this.updDt = updDt;
		this.grsCapaQty = grsCapaQty;
		this.clodFlg = clodFlg;
		this.intmdImdgPckCd1 = intmdImdgPckCd1;
		this.intmdImdgPckCd2 = intmdImdgPckCd2;
		this.erapCntcNo = erapCntcNo;
		this.ctrlTempCtnt = ctrlTempCtnt;
		this.imdgSubsRskLblCd2 = imdgSubsRskLblCd2;
		this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
		this.imdgSubsRskLblCd1 = imdgSubsRskLblCd1;
		this.prpShpNm = prpShpNm;
		this.imdgSubsRskLblCd4 = imdgSubsRskLblCd4;
		this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
		this.imdgLmtQtyFlg = imdgLmtQtyFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("dcgo_seq", getDcgoSeq());
		this.hashColumns.put("awk_cgo_seq", getAwkCgoSeq());
		this.hashColumns.put("out_imdg_pck_qty1", getOutImdgPckQty1());
		this.hashColumns.put("out_imdg_pck_qty2", getOutImdgPckQty2());
		this.hashColumns.put("rada_skd_no", getRadaSkdNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("imdg_comp_grp_cd", getImdgCompGrpCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cfr_psn_inh_hzd_zn_cd", getCfrPsnInhHzdZnCd());
		this.hashColumns.put("intmd_imdg_pck_qty1", getIntmdImdgPckQty1());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("hcdg_flg", getHcdgFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("intmd_imdg_pck_qty2", getIntmdImdgPckQty2());
		this.hashColumns.put("rsd_flg", getRsdFlg());
		this.hashColumns.put("sapt_temp", getSaptTemp());
		this.hashColumns.put("capa_qty", getCapaQty());
		this.hashColumns.put("rada_amt", getRadaAmt());
		this.hashColumns.put("hzd_ctnt", getHzdCtnt());
		this.hashColumns.put("spcl_rqst_desc", getSpclRqstDesc());
		this.hashColumns.put("imdg_segr_grp_no", getImdgSegrGrpNo());
		this.hashColumns.put("net_explo_wgt", getNetExploWgt());
		this.hashColumns.put("emer_rspn_gid_no", getEmerRspnGidNo());
		this.hashColumns.put("cnee_dtl_desc", getCneeDtlDesc());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("spcl_rqst_flg", getSpclRqstFlg());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("rc_seq", getRcSeq());
		this.hashColumns.put("dot_auth_no", getDotAuthNo());
		this.hashColumns.put("emer_cntc_phn_no_ctnt", getEmerCntcPhnNoCtnt());
		this.hashColumns.put("imdg_pck_grp_cd", getImdgPckGrpCd());
		this.hashColumns.put("cstms_expt_flg", getCstmsExptFlg());
		this.hashColumns.put("flsh_pnt_cdo_temp", getFlshPntCdoTemp());
		this.hashColumns.put("imdg_amdt_no", getImdgAmdtNo());
		this.hashColumns.put("ems_no", getEmsNo());
		this.hashColumns.put("sevr_mrn_polut_flg", getSevrMrnPolutFlg());
		this.hashColumns.put("max_in_pck_qty", getMaxInPckQty());
		this.hashColumns.put("n1st_pre_vvd_cd", getN1stPreVvdCd());
		this.hashColumns.put("spcl_cgo_apro_cd", getSpclCgoAproCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("dg_cntr_seq", getDgCntrSeq());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("stwg_temp_ctnt", getStwgTempCtnt());
		this.hashColumns.put("spcl_stwg_rqst_desc", getSpclStwgRqstDesc());
		this.hashColumns.put("dot_exp_no", getDotExpNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("in_imdg_pck_qty1", getInImdgPckQty1());
		this.hashColumns.put("in_imdg_pck_qty2", getInImdgPckQty2());
		this.hashColumns.put("dcgo_ref_no", getDcgoRefNo());
		this.hashColumns.put("imdg_un_no_spcl_provi_ctnt", getImdgUnNoSpclProviCtnt());
		this.hashColumns.put("psa_no", getPsaNo());
		this.hashColumns.put("emer_cntc_pson_nm", getEmerCntcPsonNm());
		this.hashColumns.put("dcgo_sts_cd", getDcgoStsCd());
		this.hashColumns.put("sadt_temp", getSadtTemp());
		this.hashColumns.put("dcgo_rqst_grp_eml2", getDcgoRqstGrpEml2());
		this.hashColumns.put("cfr_rpt_qty_flg", getCfrRptQtyFlg());
		this.hashColumns.put("erap_no", getErapNo());
		this.hashColumns.put("dcgo_rqst_grp_eml1", getDcgoRqstGrpEml1());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("cfr_flg", getCfrFlg());
		this.hashColumns.put("mrn_polut_flg", getMrnPolutFlg());
		this.hashColumns.put("in_imdg_pck_cd1", getInImdgPckCd1());
		this.hashColumns.put("in_imdg_pck_cd2", getInImdgPckCd2());
		this.hashColumns.put("erap_apro_ref_no", getErapAproRefNo());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("net_wgt", getNetWgt());
		this.hashColumns.put("dot_spcl_apro_no", getDotSpclAproNo());
		this.hashColumns.put("cntr_cgo_seq", getCntrCgoSeq());
		this.hashColumns.put("aply_no", getAplyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cgo_lcl_flg", getCgoLclFlg());
		this.hashColumns.put("bb_cgo_seq", getBbCgoSeq());
		this.hashColumns.put("hzd_desc", getHzdDesc());
		this.hashColumns.put("emer_rspn_gid_chr_no", getEmerRspnGidChrNo());
		this.hashColumns.put("emer_temp_ctnt", getEmerTempCtnt());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("out_imdg_pck_cd2", getOutImdgPckCd2());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("out_imdg_pck_cd1", getOutImdgPckCd1());
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("dmst_bkg_no", getDmstBkgNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("rada_trsp_no", getRadaTrspNo());
		this.hashColumns.put("max_in_pck_tp_cd", getMaxInPckTpCd());
		this.hashColumns.put("rada_ut_cd", getRadaUtCd());
		this.hashColumns.put("rqst_gdt", getRqstGdt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("certi_no", getCertiNo());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("imdg_expt_qty_flg", getImdgExptQtyFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("grs_capa_qty", getGrsCapaQty());
		this.hashColumns.put("clod_flg", getClodFlg());
		this.hashColumns.put("intmd_imdg_pck_cd1", getIntmdImdgPckCd1());
		this.hashColumns.put("intmd_imdg_pck_cd2", getIntmdImdgPckCd2());
		this.hashColumns.put("erap_cntc_no", getErapCntcNo());
		this.hashColumns.put("ctrl_temp_ctnt", getCtrlTempCtnt());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd2", getImdgSubsRskLblCd2());
		this.hashColumns.put("hcdg_dpnd_qty_flg", getHcdgDpndQtyFlg());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd1", getImdgSubsRskLblCd1());
		this.hashColumns.put("prp_shp_nm", getPrpShpNm());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd4", getImdgSubsRskLblCd4());
		this.hashColumns.put("imdg_subs_rsk_lbl_cd3", getImdgSubsRskLblCd3());
		this.hashColumns.put("imdg_lmt_qty_flg", getImdgLmtQtyFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("dcgo_seq", "dcgoSeq");
		this.hashFields.put("awk_cgo_seq", "awkCgoSeq");
		this.hashFields.put("out_imdg_pck_qty1", "outImdgPckQty1");
		this.hashFields.put("out_imdg_pck_qty2", "outImdgPckQty2");
		this.hashFields.put("rada_skd_no", "radaSkdNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("imdg_comp_grp_cd", "imdgCompGrpCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cfr_psn_inh_hzd_zn_cd", "cfrPsnInhHzdZnCd");
		this.hashFields.put("intmd_imdg_pck_qty1", "intmdImdgPckQty1");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("hcdg_flg", "hcdgFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("intmd_imdg_pck_qty2", "intmdImdgPckQty2");
		this.hashFields.put("rsd_flg", "rsdFlg");
		this.hashFields.put("sapt_temp", "saptTemp");
		this.hashFields.put("capa_qty", "capaQty");
		this.hashFields.put("rada_amt", "radaAmt");
		this.hashFields.put("hzd_ctnt", "hzdCtnt");
		this.hashFields.put("spcl_rqst_desc", "spclRqstDesc");
		this.hashFields.put("imdg_segr_grp_no", "imdgSegrGrpNo");
		this.hashFields.put("net_explo_wgt", "netExploWgt");
		this.hashFields.put("emer_rspn_gid_no", "emerRspnGidNo");
		this.hashFields.put("cnee_dtl_desc", "cneeDtlDesc");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("spcl_rqst_flg", "spclRqstFlg");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("rc_seq", "rcSeq");
		this.hashFields.put("dot_auth_no", "dotAuthNo");
		this.hashFields.put("emer_cntc_phn_no_ctnt", "emerCntcPhnNoCtnt");
		this.hashFields.put("imdg_pck_grp_cd", "imdgPckGrpCd");
		this.hashFields.put("cstms_expt_flg", "cstmsExptFlg");
		this.hashFields.put("flsh_pnt_cdo_temp", "flshPntCdoTemp");
		this.hashFields.put("imdg_amdt_no", "imdgAmdtNo");
		this.hashFields.put("ems_no", "emsNo");
		this.hashFields.put("sevr_mrn_polut_flg", "sevrMrnPolutFlg");
		this.hashFields.put("max_in_pck_qty", "maxInPckQty");
		this.hashFields.put("n1st_pre_vvd_cd", "n1stPreVvdCd");
		this.hashFields.put("spcl_cgo_apro_cd", "spclCgoAproCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("dg_cntr_seq", "dgCntrSeq");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("stwg_temp_ctnt", "stwgTempCtnt");
		this.hashFields.put("spcl_stwg_rqst_desc", "spclStwgRqstDesc");
		this.hashFields.put("dot_exp_no", "dotExpNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("in_imdg_pck_qty1", "inImdgPckQty1");
		this.hashFields.put("in_imdg_pck_qty2", "inImdgPckQty2");
		this.hashFields.put("dcgo_ref_no", "dcgoRefNo");
		this.hashFields.put("imdg_un_no_spcl_provi_ctnt", "imdgUnNoSpclProviCtnt");
		this.hashFields.put("psa_no", "psaNo");
		this.hashFields.put("emer_cntc_pson_nm", "emerCntcPsonNm");
		this.hashFields.put("dcgo_sts_cd", "dcgoStsCd");
		this.hashFields.put("sadt_temp", "sadtTemp");
		this.hashFields.put("dcgo_rqst_grp_eml2", "dcgoRqstGrpEml2");
		this.hashFields.put("cfr_rpt_qty_flg", "cfrRptQtyFlg");
		this.hashFields.put("erap_no", "erapNo");
		this.hashFields.put("dcgo_rqst_grp_eml1", "dcgoRqstGrpEml1");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("cfr_flg", "cfrFlg");
		this.hashFields.put("mrn_polut_flg", "mrnPolutFlg");
		this.hashFields.put("in_imdg_pck_cd1", "inImdgPckCd1");
		this.hashFields.put("in_imdg_pck_cd2", "inImdgPckCd2");
		this.hashFields.put("erap_apro_ref_no", "erapAproRefNo");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("net_wgt", "netWgt");
		this.hashFields.put("dot_spcl_apro_no", "dotSpclAproNo");
		this.hashFields.put("cntr_cgo_seq", "cntrCgoSeq");
		this.hashFields.put("aply_no", "aplyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cgo_lcl_flg", "cgoLclFlg");
		this.hashFields.put("bb_cgo_seq", "bbCgoSeq");
		this.hashFields.put("hzd_desc", "hzdDesc");
		this.hashFields.put("emer_rspn_gid_chr_no", "emerRspnGidChrNo");
		this.hashFields.put("emer_temp_ctnt", "emerTempCtnt");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("out_imdg_pck_cd2", "outImdgPckCd2");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("out_imdg_pck_cd1", "outImdgPckCd1");
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("dmst_bkg_no", "dmstBkgNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("rada_trsp_no", "radaTrspNo");
		this.hashFields.put("max_in_pck_tp_cd", "maxInPckTpCd");
		this.hashFields.put("rada_ut_cd", "radaUtCd");
		this.hashFields.put("rqst_gdt", "rqstGdt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("certi_no", "certiNo");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("imdg_expt_qty_flg", "imdgExptQtyFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("grs_capa_qty", "grsCapaQty");
		this.hashFields.put("clod_flg", "clodFlg");
		this.hashFields.put("intmd_imdg_pck_cd1", "intmdImdgPckCd1");
		this.hashFields.put("intmd_imdg_pck_cd2", "intmdImdgPckCd2");
		this.hashFields.put("erap_cntc_no", "erapCntcNo");
		this.hashFields.put("ctrl_temp_ctnt", "ctrlTempCtnt");
		this.hashFields.put("imdg_subs_rsk_lbl_cd2", "imdgSubsRskLblCd2");
		this.hashFields.put("hcdg_dpnd_qty_flg", "hcdgDpndQtyFlg");
		this.hashFields.put("imdg_subs_rsk_lbl_cd1", "imdgSubsRskLblCd1");
		this.hashFields.put("prp_shp_nm", "prpShpNm");
		this.hashFields.put("imdg_subs_rsk_lbl_cd4", "imdgSubsRskLblCd4");
		this.hashFields.put("imdg_subs_rsk_lbl_cd3", "imdgSubsRskLblCd3");
		this.hashFields.put("imdg_lmt_qty_flg", "imdgLmtQtyFlg");
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
	 * @return dcgoSeq
	 */
	public String getDcgoSeq() {
		return this.dcgoSeq;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return cfrPsnInhHzdZnCd
	 */
	public String getCfrPsnInhHzdZnCd() {
		return this.cfrPsnInhHzdZnCd;
	}
	
	/**
	 * Column Info
	 * @return intmdImdgPckQty1
	 */
	public String getIntmdImdgPckQty1() {
		return this.intmdImdgPckQty1;
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
	 * @return hcdgFlg
	 */
	public String getHcdgFlg() {
		return this.hcdgFlg;
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
	 * @return intmdImdgPckQty2
	 */
	public String getIntmdImdgPckQty2() {
		return this.intmdImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @return rsdFlg
	 */
	public String getRsdFlg() {
		return this.rsdFlg;
	}
	
	/**
	 * Column Info
	 * @return saptTemp
	 */
	public String getSaptTemp() {
		return this.saptTemp;
	}
	
	/**
	 * Column Info
	 * @return capaQty
	 */
	public String getCapaQty() {
		return this.capaQty;
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
	 * @return hzdCtnt
	 */
	public String getHzdCtnt() {
		return this.hzdCtnt;
	}
	
	/**
	 * Column Info
	 * @return spclRqstDesc
	 */
	public String getSpclRqstDesc() {
		return this.spclRqstDesc;
	}
	
	/**
	 * Column Info
	 * @return imdgSegrGrpNo
	 */
	public String getImdgSegrGrpNo() {
		return this.imdgSegrGrpNo;
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
	 * @return emerRspnGidNo
	 */
	public String getEmerRspnGidNo() {
		return this.emerRspnGidNo;
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
	 * @return rcFlg
	 */
	public String getRcFlg() {
		return this.rcFlg;
	}
	
	/**
	 * Column Info
	 * @return spclRqstFlg
	 */
	public String getSpclRqstFlg() {
		return this.spclRqstFlg;
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
	 * @return rcSeq
	 */
	public String getRcSeq() {
		return this.rcSeq;
	}
	
	/**
	 * Column Info
	 * @return dotAuthNo
	 */
	public String getDotAuthNo() {
		return this.dotAuthNo;
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
	 * @return cstmsExptFlg
	 */
	public String getCstmsExptFlg() {
		return this.cstmsExptFlg;
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
	 * @return imdgAmdtNo
	 */
	public String getImdgAmdtNo() {
		return this.imdgAmdtNo;
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
	 * @return sevrMrnPolutFlg
	 */
	public String getSevrMrnPolutFlg() {
		return this.sevrMrnPolutFlg;
	}
	
	/**
	 * Column Info
	 * @return maxInPckQty
	 */
	public String getMaxInPckQty() {
		return this.maxInPckQty;
	}
	
	/**
	 * Column Info
	 * @return n1stPreVvdCd
	 */
	public String getN1stPreVvdCd() {
		return this.n1stPreVvdCd;
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
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
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
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return stwgTempCtnt
	 */
	public String getStwgTempCtnt() {
		return this.stwgTempCtnt;
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
	 * @return dotExpNo
	 */
	public String getDotExpNo() {
		return this.dotExpNo;
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
	 * @return inImdgPckQty1
	 */
	public String getInImdgPckQty1() {
		return this.inImdgPckQty1;
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
	 * @return dcgoRefNo
	 */
	public String getDcgoRefNo() {
		return this.dcgoRefNo;
	}
	
	/**
	 * Column Info
	 * @return imdgUnNoSpclProviCtnt
	 */
	public String getImdgUnNoSpclProviCtnt() {
		return this.imdgUnNoSpclProviCtnt;
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
	 * @return emerCntcPsonNm
	 */
	public String getEmerCntcPsonNm() {
		return this.emerCntcPsonNm;
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
	 * @return sadtTemp
	 */
	public String getSadtTemp() {
		return this.sadtTemp;
	}
	
	/**
	 * Column Info
	 * @return dcgoRqstGrpEml2
	 */
	public String getDcgoRqstGrpEml2() {
		return this.dcgoRqstGrpEml2;
	}
	
	/**
	 * Column Info
	 * @return cfrRptQtyFlg
	 */
	public String getCfrRptQtyFlg() {
		return this.cfrRptQtyFlg;
	}
	
	/**
	 * Column Info
	 * @return erapNo
	 */
	public String getErapNo() {
		return this.erapNo;
	}
	
	/**
	 * Column Info
	 * @return dcgoRqstGrpEml1
	 */
	public String getDcgoRqstGrpEml1() {
		return this.dcgoRqstGrpEml1;
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
	 * @return cfrFlg
	 */
	public String getCfrFlg() {
		return this.cfrFlg;
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
	 * @return erapAproRefNo
	 */
	public String getErapAproRefNo() {
		return this.erapAproRefNo;
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
	 * @return dotSpclAproNo
	 */
	public String getDotSpclAproNo() {
		return this.dotSpclAproNo;
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
	 * @return aplyNo
	 */
	public String getAplyNo() {
		return this.aplyNo;
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
	 * @return hzdDesc
	 */
	public String getHzdDesc() {
		return this.hzdDesc;
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
	 * @return emerTempCtnt
	 */
	public String getEmerTempCtnt() {
		return this.emerTempCtnt;
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
	 * @return outImdgPckCd1
	 */
	public String getOutImdgPckCd1() {
		return this.outImdgPckCd1;
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
	 * @return dmstBkgNo
	 */
	public String getDmstBkgNo() {
		return this.dmstBkgNo;
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
	 * @return radaTrspNo
	 */
	public String getRadaTrspNo() {
		return this.radaTrspNo;
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
	 * @return radaUtCd
	 */
	public String getRadaUtCd() {
		return this.radaUtCd;
	}
	
	/**
	 * Column Info
	 * @return rqstGdt
	 */
	public String getRqstGdt() {
		return this.rqstGdt;
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
	 * @return bbCgoFlg
	 */
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
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
	 * @return imdgExptQtyFlg
	 */
	public String getImdgExptQtyFlg() {
		return this.imdgExptQtyFlg;
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
	 * @return grsCapaQty
	 */
	public String getGrsCapaQty() {
		return this.grsCapaQty;
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
	 * @return intmdImdgPckCd1
	 */
	public String getIntmdImdgPckCd1() {
		return this.intmdImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @return intmdImdgPckCd2
	 */
	public String getIntmdImdgPckCd2() {
		return this.intmdImdgPckCd2;
	}
	
	/**
	 * Column Info
	 * @return erapCntcNo
	 */
	public String getErapCntcNo() {
		return this.erapCntcNo;
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
	 * @return imdgSubsRskLblCd2
	 */
	public String getImdgSubsRskLblCd2() {
		return this.imdgSubsRskLblCd2;
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
	 * @return imdgSubsRskLblCd3
	 */
	public String getImdgSubsRskLblCd3() {
		return this.imdgSubsRskLblCd3;
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
	 * @param imdgUnNoSeq
	 */
	public void setImdgUnNoSeq(String imdgUnNoSeq) {
		this.imdgUnNoSeq = imdgUnNoSeq;
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
	 * @param awkCgoSeq
	 */
	public void setAwkCgoSeq(String awkCgoSeq) {
		this.awkCgoSeq = awkCgoSeq;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param cfrPsnInhHzdZnCd
	 */
	public void setCfrPsnInhHzdZnCd(String cfrPsnInhHzdZnCd) {
		this.cfrPsnInhHzdZnCd = cfrPsnInhHzdZnCd;
	}
	
	/**
	 * Column Info
	 * @param intmdImdgPckQty1
	 */
	public void setIntmdImdgPckQty1(String intmdImdgPckQty1) {
		this.intmdImdgPckQty1 = intmdImdgPckQty1;
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
	 * @param hcdgFlg
	 */
	public void setHcdgFlg(String hcdgFlg) {
		this.hcdgFlg = hcdgFlg;
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
	 * @param intmdImdgPckQty2
	 */
	public void setIntmdImdgPckQty2(String intmdImdgPckQty2) {
		this.intmdImdgPckQty2 = intmdImdgPckQty2;
	}
	
	/**
	 * Column Info
	 * @param rsdFlg
	 */
	public void setRsdFlg(String rsdFlg) {
		this.rsdFlg = rsdFlg;
	}
	
	/**
	 * Column Info
	 * @param saptTemp
	 */
	public void setSaptTemp(String saptTemp) {
		this.saptTemp = saptTemp;
	}
	
	/**
	 * Column Info
	 * @param capaQty
	 */
	public void setCapaQty(String capaQty) {
		this.capaQty = capaQty;
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
	 * @param hzdCtnt
	 */
	public void setHzdCtnt(String hzdCtnt) {
		this.hzdCtnt = hzdCtnt;
	}
	
	/**
	 * Column Info
	 * @param spclRqstDesc
	 */
	public void setSpclRqstDesc(String spclRqstDesc) {
		this.spclRqstDesc = spclRqstDesc;
	}
	
	/**
	 * Column Info
	 * @param imdgSegrGrpNo
	 */
	public void setImdgSegrGrpNo(String imdgSegrGrpNo) {
		this.imdgSegrGrpNo = imdgSegrGrpNo;
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
	 * @param emerRspnGidNo
	 */
	public void setEmerRspnGidNo(String emerRspnGidNo) {
		this.emerRspnGidNo = emerRspnGidNo;
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
	 * @param rcFlg
	 */
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
	}
	
	/**
	 * Column Info
	 * @param spclRqstFlg
	 */
	public void setSpclRqstFlg(String spclRqstFlg) {
		this.spclRqstFlg = spclRqstFlg;
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
	 * @param rcSeq
	 */
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
	}
	
	/**
	 * Column Info
	 * @param dotAuthNo
	 */
	public void setDotAuthNo(String dotAuthNo) {
		this.dotAuthNo = dotAuthNo;
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
	 * @param cstmsExptFlg
	 */
	public void setCstmsExptFlg(String cstmsExptFlg) {
		this.cstmsExptFlg = cstmsExptFlg;
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
	 * @param imdgAmdtNo
	 */
	public void setImdgAmdtNo(String imdgAmdtNo) {
		this.imdgAmdtNo = imdgAmdtNo;
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
	 * @param sevrMrnPolutFlg
	 */
	public void setSevrMrnPolutFlg(String sevrMrnPolutFlg) {
		this.sevrMrnPolutFlg = sevrMrnPolutFlg;
	}
	
	/**
	 * Column Info
	 * @param maxInPckQty
	 */
	public void setMaxInPckQty(String maxInPckQty) {
		this.maxInPckQty = maxInPckQty;
	}
	
	/**
	 * Column Info
	 * @param n1stPreVvdCd
	 */
	public void setN1stPreVvdCd(String n1stPreVvdCd) {
		this.n1stPreVvdCd = n1stPreVvdCd;
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
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
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
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param stwgTempCtnt
	 */
	public void setStwgTempCtnt(String stwgTempCtnt) {
		this.stwgTempCtnt = stwgTempCtnt;
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
	 * @param dotExpNo
	 */
	public void setDotExpNo(String dotExpNo) {
		this.dotExpNo = dotExpNo;
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
	 * @param inImdgPckQty1
	 */
	public void setInImdgPckQty1(String inImdgPckQty1) {
		this.inImdgPckQty1 = inImdgPckQty1;
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
	 * @param dcgoRefNo
	 */
	public void setDcgoRefNo(String dcgoRefNo) {
		this.dcgoRefNo = dcgoRefNo;
	}
	
	/**
	 * Column Info
	 * @param imdgUnNoSpclProviCtnt
	 */
	public void setImdgUnNoSpclProviCtnt(String imdgUnNoSpclProviCtnt) {
		this.imdgUnNoSpclProviCtnt = imdgUnNoSpclProviCtnt;
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
	 * @param emerCntcPsonNm
	 */
	public void setEmerCntcPsonNm(String emerCntcPsonNm) {
		this.emerCntcPsonNm = emerCntcPsonNm;
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
	 * @param sadtTemp
	 */
	public void setSadtTemp(String sadtTemp) {
		this.sadtTemp = sadtTemp;
	}
	
	/**
	 * Column Info
	 * @param dcgoRqstGrpEml2
	 */
	public void setDcgoRqstGrpEml2(String dcgoRqstGrpEml2) {
		this.dcgoRqstGrpEml2 = dcgoRqstGrpEml2;
	}
	
	/**
	 * Column Info
	 * @param cfrRptQtyFlg
	 */
	public void setCfrRptQtyFlg(String cfrRptQtyFlg) {
		this.cfrRptQtyFlg = cfrRptQtyFlg;
	}
	
	/**
	 * Column Info
	 * @param erapNo
	 */
	public void setErapNo(String erapNo) {
		this.erapNo = erapNo;
	}
	
	/**
	 * Column Info
	 * @param dcgoRqstGrpEml1
	 */
	public void setDcgoRqstGrpEml1(String dcgoRqstGrpEml1) {
		this.dcgoRqstGrpEml1 = dcgoRqstGrpEml1;
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
	 * @param cfrFlg
	 */
	public void setCfrFlg(String cfrFlg) {
		this.cfrFlg = cfrFlg;
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
	 * @param erapAproRefNo
	 */
	public void setErapAproRefNo(String erapAproRefNo) {
		this.erapAproRefNo = erapAproRefNo;
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
	 * @param dotSpclAproNo
	 */
	public void setDotSpclAproNo(String dotSpclAproNo) {
		this.dotSpclAproNo = dotSpclAproNo;
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
	 * @param aplyNo
	 */
	public void setAplyNo(String aplyNo) {
		this.aplyNo = aplyNo;
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
	 * @param hzdDesc
	 */
	public void setHzdDesc(String hzdDesc) {
		this.hzdDesc = hzdDesc;
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
	 * @param emerTempCtnt
	 */
	public void setEmerTempCtnt(String emerTempCtnt) {
		this.emerTempCtnt = emerTempCtnt;
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
	 * @param outImdgPckCd1
	 */
	public void setOutImdgPckCd1(String outImdgPckCd1) {
		this.outImdgPckCd1 = outImdgPckCd1;
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
	 * @param dmstBkgNo
	 */
	public void setDmstBkgNo(String dmstBkgNo) {
		this.dmstBkgNo = dmstBkgNo;
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
	 * @param radaTrspNo
	 */
	public void setRadaTrspNo(String radaTrspNo) {
		this.radaTrspNo = radaTrspNo;
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
	 * @param radaUtCd
	 */
	public void setRadaUtCd(String radaUtCd) {
		this.radaUtCd = radaUtCd;
	}
	
	/**
	 * Column Info
	 * @param rqstGdt
	 */
	public void setRqstGdt(String rqstGdt) {
		this.rqstGdt = rqstGdt;
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
	 * @param bbCgoFlg
	 */
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
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
	 * @param imdgExptQtyFlg
	 */
	public void setImdgExptQtyFlg(String imdgExptQtyFlg) {
		this.imdgExptQtyFlg = imdgExptQtyFlg;
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
	 * @param grsCapaQty
	 */
	public void setGrsCapaQty(String grsCapaQty) {
		this.grsCapaQty = grsCapaQty;
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
	 * @param intmdImdgPckCd1
	 */
	public void setIntmdImdgPckCd1(String intmdImdgPckCd1) {
		this.intmdImdgPckCd1 = intmdImdgPckCd1;
	}
	
	/**
	 * Column Info
	 * @param intmdImdgPckCd2
	 */
	public void setIntmdImdgPckCd2(String intmdImdgPckCd2) {
		this.intmdImdgPckCd2 = intmdImdgPckCd2;
	}
	
	/**
	 * Column Info
	 * @param erapCntcNo
	 */
	public void setErapCntcNo(String erapCntcNo) {
		this.erapCntcNo = erapCntcNo;
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
	 * @param imdgSubsRskLblCd2
	 */
	public void setImdgSubsRskLblCd2(String imdgSubsRskLblCd2) {
		this.imdgSubsRskLblCd2 = imdgSubsRskLblCd2;
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
	 * @param imdgSubsRskLblCd3
	 */
	public void setImdgSubsRskLblCd3(String imdgSubsRskLblCd3) {
		this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setImdgUnNoSeq(JSPUtil.getParameter(request, prefix + "imdg_un_no_seq", ""));
		setDcgoSeq(JSPUtil.getParameter(request, prefix + "dcgo_seq", ""));
		setAwkCgoSeq(JSPUtil.getParameter(request, prefix + "awk_cgo_seq", ""));
		setOutImdgPckQty1(JSPUtil.getParameter(request, prefix + "out_imdg_pck_qty1", ""));
		setOutImdgPckQty2(JSPUtil.getParameter(request, prefix + "out_imdg_pck_qty2", ""));
		setRadaSkdNo(JSPUtil.getParameter(request, prefix + "rada_skd_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setImdgCompGrpCd(JSPUtil.getParameter(request, prefix + "imdg_comp_grp_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setCfrPsnInhHzdZnCd(JSPUtil.getParameter(request, prefix + "cfr_psn_inh_hzd_zn_cd", ""));
		setIntmdImdgPckQty1(JSPUtil.getParameter(request, prefix + "intmd_imdg_pck_qty1", ""));
		setImdgUnNo(JSPUtil.getParameter(request, prefix + "imdg_un_no", ""));
		setHcdgFlg(JSPUtil.getParameter(request, prefix + "hcdg_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setIntmdImdgPckQty2(JSPUtil.getParameter(request, prefix + "intmd_imdg_pck_qty2", ""));
		setRsdFlg(JSPUtil.getParameter(request, prefix + "rsd_flg", ""));
		setSaptTemp(JSPUtil.getParameter(request, prefix + "sapt_temp", ""));
		setCapaQty(JSPUtil.getParameter(request, prefix + "capa_qty", ""));
		setRadaAmt(JSPUtil.getParameter(request, prefix + "rada_amt", ""));
		setHzdCtnt(JSPUtil.getParameter(request, prefix + "hzd_ctnt", ""));
		setSpclRqstDesc(JSPUtil.getParameter(request, prefix + "spcl_rqst_desc", ""));
		setImdgSegrGrpNo(JSPUtil.getParameter(request, prefix + "imdg_segr_grp_no", ""));
		setNetExploWgt(JSPUtil.getParameter(request, prefix + "net_explo_wgt", ""));
		setEmerRspnGidNo(JSPUtil.getParameter(request, prefix + "emer_rspn_gid_no", ""));
		setCneeDtlDesc(JSPUtil.getParameter(request, prefix + "cnee_dtl_desc", ""));
		setRcFlg(JSPUtil.getParameter(request, prefix + "rc_flg", ""));
		setSpclRqstFlg(JSPUtil.getParameter(request, prefix + "spcl_rqst_flg", ""));
		setImdgClssCd(JSPUtil.getParameter(request, prefix + "imdg_clss_cd", ""));
		setRcSeq(JSPUtil.getParameter(request, prefix + "rc_seq", ""));
		setDotAuthNo(JSPUtil.getParameter(request, prefix + "dot_auth_no", ""));
		setEmerCntcPhnNoCtnt(JSPUtil.getParameter(request, prefix + "emer_cntc_phn_no_ctnt", ""));
		setImdgPckGrpCd(JSPUtil.getParameter(request, prefix + "imdg_pck_grp_cd", ""));
		setCstmsExptFlg(JSPUtil.getParameter(request, prefix + "cstms_expt_flg", ""));
		setFlshPntCdoTemp(JSPUtil.getParameter(request, prefix + "flsh_pnt_cdo_temp", ""));
		setImdgAmdtNo(JSPUtil.getParameter(request, prefix + "imdg_amdt_no", ""));
		setEmsNo(JSPUtil.getParameter(request, prefix + "ems_no", ""));
		setSevrMrnPolutFlg(JSPUtil.getParameter(request, prefix + "sevr_mrn_polut_flg", ""));
		setMaxInPckQty(JSPUtil.getParameter(request, prefix + "max_in_pck_qty", ""));
		setN1stPreVvdCd(JSPUtil.getParameter(request, prefix + "n1st_pre_vvd_cd", ""));
		setSpclCgoAproCd(JSPUtil.getParameter(request, prefix + "spcl_cgo_apro_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, prefix + "meas_ut_cd", ""));
		setDgCntrSeq(JSPUtil.getParameter(request, prefix + "dg_cntr_seq", ""));
		setRqstDt(JSPUtil.getParameter(request, prefix + "rqst_dt", ""));
		setStwgTempCtnt(JSPUtil.getParameter(request, prefix + "stwg_temp_ctnt", ""));
		setSpclStwgRqstDesc(JSPUtil.getParameter(request, prefix + "spcl_stwg_rqst_desc", ""));
		setDotExpNo(JSPUtil.getParameter(request, prefix + "dot_exp_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setInImdgPckQty1(JSPUtil.getParameter(request, prefix + "in_imdg_pck_qty1", ""));
		setInImdgPckQty2(JSPUtil.getParameter(request, prefix + "in_imdg_pck_qty2", ""));
		setDcgoRefNo(JSPUtil.getParameter(request, prefix + "dcgo_ref_no", ""));
		setImdgUnNoSpclProviCtnt(JSPUtil.getParameter(request, prefix + "imdg_un_no_spcl_provi_ctnt", ""));
		setPsaNo(JSPUtil.getParameter(request, prefix + "psa_no", ""));
		setEmerCntcPsonNm(JSPUtil.getParameter(request, prefix + "emer_cntc_pson_nm", ""));
		setDcgoStsCd(JSPUtil.getParameter(request, prefix + "dcgo_sts_cd", ""));
		setSadtTemp(JSPUtil.getParameter(request, prefix + "sadt_temp", ""));
		setDcgoRqstGrpEml2(JSPUtil.getParameter(request, prefix + "dcgo_rqst_grp_eml2", ""));
		setCfrRptQtyFlg(JSPUtil.getParameter(request, prefix + "cfr_rpt_qty_flg", ""));
		setErapNo(JSPUtil.getParameter(request, prefix + "erap_no", ""));
		setDcgoRqstGrpEml1(JSPUtil.getParameter(request, prefix + "dcgo_rqst_grp_eml1", ""));
		setWgtUtCd(JSPUtil.getParameter(request, prefix + "wgt_ut_cd", ""));
		setCfrFlg(JSPUtil.getParameter(request, prefix + "cfr_flg", ""));
		setMrnPolutFlg(JSPUtil.getParameter(request, prefix + "mrn_polut_flg", ""));
		setInImdgPckCd1(JSPUtil.getParameter(request, prefix + "in_imdg_pck_cd1", ""));
		setInImdgPckCd2(JSPUtil.getParameter(request, prefix + "in_imdg_pck_cd2", ""));
		setErapAproRefNo(JSPUtil.getParameter(request, prefix + "erap_apro_ref_no", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, prefix + "awk_cgo_flg", ""));
		setNetWgt(JSPUtil.getParameter(request, prefix + "net_wgt", ""));
		setDotSpclAproNo(JSPUtil.getParameter(request, prefix + "dot_spcl_apro_no", ""));
		setCntrCgoSeq(JSPUtil.getParameter(request, prefix + "cntr_cgo_seq", ""));
		setAplyNo(JSPUtil.getParameter(request, prefix + "aply_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCgoLclFlg(JSPUtil.getParameter(request, prefix + "cgo_lcl_flg", ""));
		setBbCgoSeq(JSPUtil.getParameter(request, prefix + "bb_cgo_seq", ""));
		setHzdDesc(JSPUtil.getParameter(request, prefix + "hzd_desc", ""));
		setEmerRspnGidChrNo(JSPUtil.getParameter(request, prefix + "emer_rspn_gid_chr_no", ""));
		setEmerTempCtnt(JSPUtil.getParameter(request, prefix + "emer_temp_ctnt", ""));
		setCntrVolQty(JSPUtil.getParameter(request, prefix + "cntr_vol_qty", ""));
		setOutImdgPckCd2(JSPUtil.getParameter(request, prefix + "out_imdg_pck_cd2", ""));
		setGrsWgt(JSPUtil.getParameter(request, prefix + "grs_wgt", ""));
		setOutImdgPckCd1(JSPUtil.getParameter(request, prefix + "out_imdg_pck_cd1", ""));
		setRqstUsrId(JSPUtil.getParameter(request, prefix + "rqst_usr_id", ""));
		setDmstBkgNo(JSPUtil.getParameter(request, prefix + "dmst_bkg_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setRadaTrspNo(JSPUtil.getParameter(request, prefix + "rada_trsp_no", ""));
		setMaxInPckTpCd(JSPUtil.getParameter(request, prefix + "max_in_pck_tp_cd", ""));
		setRadaUtCd(JSPUtil.getParameter(request, prefix + "rada_ut_cd", ""));
		setRqstGdt(JSPUtil.getParameter(request, prefix + "rqst_gdt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCertiNo(JSPUtil.getParameter(request, prefix + "certi_no", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, prefix + "bb_cgo_flg", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setImdgExptQtyFlg(JSPUtil.getParameter(request, prefix + "imdg_expt_qty_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setGrsCapaQty(JSPUtil.getParameter(request, prefix + "grs_capa_qty", ""));
		setClodFlg(JSPUtil.getParameter(request, prefix + "clod_flg", ""));
		setIntmdImdgPckCd1(JSPUtil.getParameter(request, prefix + "intmd_imdg_pck_cd1", ""));
		setIntmdImdgPckCd2(JSPUtil.getParameter(request, prefix + "intmd_imdg_pck_cd2", ""));
		setErapCntcNo(JSPUtil.getParameter(request, prefix + "erap_cntc_no", ""));
		setCtrlTempCtnt(JSPUtil.getParameter(request, prefix + "ctrl_temp_ctnt", ""));
		setImdgSubsRskLblCd2(JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd2", ""));
		setHcdgDpndQtyFlg(JSPUtil.getParameter(request, prefix + "hcdg_dpnd_qty_flg", ""));
		setImdgSubsRskLblCd1(JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd1", ""));
		setPrpShpNm(JSPUtil.getParameter(request, prefix + "prp_shp_nm", ""));
		setImdgSubsRskLblCd4(JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd4", ""));
		setImdgSubsRskLblCd3(JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd3", ""));
		setImdgLmtQtyFlg(JSPUtil.getParameter(request, prefix + "imdg_lmt_qty_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return DomDgCgoVO[]
	 */
	public DomDgCgoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return DomDgCgoVO[]
	 */
	public DomDgCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DomDgCgoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq", length));
			String[] dcgoSeq = (JSPUtil.getParameter(request, prefix	+ "dcgo_seq", length));
			String[] awkCgoSeq = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_seq", length));
			String[] outImdgPckQty1 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_qty1", length));
			String[] outImdgPckQty2 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_qty2", length));
			String[] radaSkdNo = (JSPUtil.getParameter(request, prefix	+ "rada_skd_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] imdgCompGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_comp_grp_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cfrPsnInhHzdZnCd = (JSPUtil.getParameter(request, prefix	+ "cfr_psn_inh_hzd_zn_cd", length));
			String[] intmdImdgPckQty1 = (JSPUtil.getParameter(request, prefix	+ "intmd_imdg_pck_qty1", length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no", length));
			String[] hcdgFlg = (JSPUtil.getParameter(request, prefix	+ "hcdg_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] intmdImdgPckQty2 = (JSPUtil.getParameter(request, prefix	+ "intmd_imdg_pck_qty2", length));
			String[] rsdFlg = (JSPUtil.getParameter(request, prefix	+ "rsd_flg", length));
			String[] saptTemp = (JSPUtil.getParameter(request, prefix	+ "sapt_temp", length));
			String[] capaQty = (JSPUtil.getParameter(request, prefix	+ "capa_qty", length));
			String[] radaAmt = (JSPUtil.getParameter(request, prefix	+ "rada_amt", length));
			String[] hzdCtnt = (JSPUtil.getParameter(request, prefix	+ "hzd_ctnt", length));
			String[] spclRqstDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_rqst_desc", length));
			String[] imdgSegrGrpNo = (JSPUtil.getParameter(request, prefix	+ "imdg_segr_grp_no", length));
			String[] netExploWgt = (JSPUtil.getParameter(request, prefix	+ "net_explo_wgt", length));
			String[] emerRspnGidNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_no", length));
			String[] cneeDtlDesc = (JSPUtil.getParameter(request, prefix	+ "cnee_dtl_desc", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] spclRqstFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rqst_flg", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			String[] rcSeq = (JSPUtil.getParameter(request, prefix	+ "rc_seq", length));
			String[] dotAuthNo = (JSPUtil.getParameter(request, prefix	+ "dot_auth_no", length));
			String[] emerCntcPhnNoCtnt = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_phn_no_ctnt", length));
			String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_pck_grp_cd", length));
			String[] cstmsExptFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_expt_flg", length));
			String[] flshPntCdoTemp = (JSPUtil.getParameter(request, prefix	+ "flsh_pnt_cdo_temp", length));
			String[] imdgAmdtNo = (JSPUtil.getParameter(request, prefix	+ "imdg_amdt_no", length));
			String[] emsNo = (JSPUtil.getParameter(request, prefix	+ "ems_no", length));
			String[] sevrMrnPolutFlg = (JSPUtil.getParameter(request, prefix	+ "sevr_mrn_polut_flg", length));
			String[] maxInPckQty = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_qty", length));
			String[] n1stPreVvdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pre_vvd_cd", length));
			String[] spclCgoAproCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_apro_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] dgCntrSeq = (JSPUtil.getParameter(request, prefix	+ "dg_cntr_seq", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] stwgTempCtnt = (JSPUtil.getParameter(request, prefix	+ "stwg_temp_ctnt", length));
			String[] spclStwgRqstDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_stwg_rqst_desc", length));
			String[] dotExpNo = (JSPUtil.getParameter(request, prefix	+ "dot_exp_no", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] inImdgPckQty1 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_qty1", length));
			String[] inImdgPckQty2 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_qty2", length));
			String[] dcgoRefNo = (JSPUtil.getParameter(request, prefix	+ "dcgo_ref_no", length));
			String[] imdgUnNoSpclProviCtnt = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_spcl_provi_ctnt", length));
			String[] psaNo = (JSPUtil.getParameter(request, prefix	+ "psa_no", length));
			String[] emerCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_pson_nm", length));
			String[] dcgoStsCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_sts_cd", length));
			String[] sadtTemp = (JSPUtil.getParameter(request, prefix	+ "sadt_temp", length));
			String[] dcgoRqstGrpEml2 = (JSPUtil.getParameter(request, prefix	+ "dcgo_rqst_grp_eml2", length));
			String[] cfrRptQtyFlg = (JSPUtil.getParameter(request, prefix	+ "cfr_rpt_qty_flg", length));
			String[] erapNo = (JSPUtil.getParameter(request, prefix	+ "erap_no", length));
			String[] dcgoRqstGrpEml1 = (JSPUtil.getParameter(request, prefix	+ "dcgo_rqst_grp_eml1", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] cfrFlg = (JSPUtil.getParameter(request, prefix	+ "cfr_flg", length));
			String[] mrnPolutFlg = (JSPUtil.getParameter(request, prefix	+ "mrn_polut_flg", length));
			String[] inImdgPckCd1 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_cd1", length));
			String[] inImdgPckCd2 = (JSPUtil.getParameter(request, prefix	+ "in_imdg_pck_cd2", length));
			String[] erapAproRefNo = (JSPUtil.getParameter(request, prefix	+ "erap_apro_ref_no", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			String[] netWgt = (JSPUtil.getParameter(request, prefix	+ "net_wgt", length));
			String[] dotSpclAproNo = (JSPUtil.getParameter(request, prefix	+ "dot_spcl_apro_no", length));
			String[] cntrCgoSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_cgo_seq", length));
			String[] aplyNo = (JSPUtil.getParameter(request, prefix	+ "aply_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cgoLclFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_lcl_flg", length));
			String[] bbCgoSeq = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_seq", length));
			String[] hzdDesc = (JSPUtil.getParameter(request, prefix	+ "hzd_desc", length));
			String[] emerRspnGidChrNo = (JSPUtil.getParameter(request, prefix	+ "emer_rspn_gid_chr_no", length));
			String[] emerTempCtnt = (JSPUtil.getParameter(request, prefix	+ "emer_temp_ctnt", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] outImdgPckCd2 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_cd2", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] outImdgPckCd1 = (JSPUtil.getParameter(request, prefix	+ "out_imdg_pck_cd1", length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] dmstBkgNo = (JSPUtil.getParameter(request, prefix	+ "dmst_bkg_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] radaTrspNo = (JSPUtil.getParameter(request, prefix	+ "rada_trsp_no", length));
			String[] maxInPckTpCd = (JSPUtil.getParameter(request, prefix	+ "max_in_pck_tp_cd", length));
			String[] radaUtCd = (JSPUtil.getParameter(request, prefix	+ "rada_ut_cd", length));
			String[] rqstGdt = (JSPUtil.getParameter(request, prefix	+ "rqst_gdt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] certiNo = (JSPUtil.getParameter(request, prefix	+ "certi_no", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] imdgExptQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_expt_qty_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] grsCapaQty = (JSPUtil.getParameter(request, prefix	+ "grs_capa_qty", length));
			String[] clodFlg = (JSPUtil.getParameter(request, prefix	+ "clod_flg", length));
			String[] intmdImdgPckCd1 = (JSPUtil.getParameter(request, prefix	+ "intmd_imdg_pck_cd1", length));
			String[] intmdImdgPckCd2 = (JSPUtil.getParameter(request, prefix	+ "intmd_imdg_pck_cd2", length));
			String[] erapCntcNo = (JSPUtil.getParameter(request, prefix	+ "erap_cntc_no", length));
			String[] ctrlTempCtnt = (JSPUtil.getParameter(request, prefix	+ "ctrl_temp_ctnt", length));
			String[] imdgSubsRskLblCd2 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd2", length));
			String[] hcdgDpndQtyFlg = (JSPUtil.getParameter(request, prefix	+ "hcdg_dpnd_qty_flg", length));
			String[] imdgSubsRskLblCd1 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd1", length));
			String[] prpShpNm = (JSPUtil.getParameter(request, prefix	+ "prp_shp_nm", length));
			String[] imdgSubsRskLblCd4 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd4", length));
			String[] imdgSubsRskLblCd3 = (JSPUtil.getParameter(request, prefix	+ "imdg_subs_rsk_lbl_cd3", length));
			String[] imdgLmtQtyFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_lmt_qty_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new DomDgCgoVO();
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (dcgoSeq[i] != null)
					model.setDcgoSeq(dcgoSeq[i]);
				if (awkCgoSeq[i] != null)
					model.setAwkCgoSeq(awkCgoSeq[i]);
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
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cfrPsnInhHzdZnCd[i] != null)
					model.setCfrPsnInhHzdZnCd(cfrPsnInhHzdZnCd[i]);
				if (intmdImdgPckQty1[i] != null)
					model.setIntmdImdgPckQty1(intmdImdgPckQty1[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (hcdgFlg[i] != null)
					model.setHcdgFlg(hcdgFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (intmdImdgPckQty2[i] != null)
					model.setIntmdImdgPckQty2(intmdImdgPckQty2[i]);
				if (rsdFlg[i] != null)
					model.setRsdFlg(rsdFlg[i]);
				if (saptTemp[i] != null)
					model.setSaptTemp(saptTemp[i]);
				if (capaQty[i] != null)
					model.setCapaQty(capaQty[i]);
				if (radaAmt[i] != null)
					model.setRadaAmt(radaAmt[i]);
				if (hzdCtnt[i] != null)
					model.setHzdCtnt(hzdCtnt[i]);
				if (spclRqstDesc[i] != null)
					model.setSpclRqstDesc(spclRqstDesc[i]);
				if (imdgSegrGrpNo[i] != null)
					model.setImdgSegrGrpNo(imdgSegrGrpNo[i]);
				if (netExploWgt[i] != null)
					model.setNetExploWgt(netExploWgt[i]);
				if (emerRspnGidNo[i] != null)
					model.setEmerRspnGidNo(emerRspnGidNo[i]);
				if (cneeDtlDesc[i] != null)
					model.setCneeDtlDesc(cneeDtlDesc[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (spclRqstFlg[i] != null)
					model.setSpclRqstFlg(spclRqstFlg[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (rcSeq[i] != null)
					model.setRcSeq(rcSeq[i]);
				if (dotAuthNo[i] != null)
					model.setDotAuthNo(dotAuthNo[i]);
				if (emerCntcPhnNoCtnt[i] != null)
					model.setEmerCntcPhnNoCtnt(emerCntcPhnNoCtnt[i]);
				if (imdgPckGrpCd[i] != null)
					model.setImdgPckGrpCd(imdgPckGrpCd[i]);
				if (cstmsExptFlg[i] != null)
					model.setCstmsExptFlg(cstmsExptFlg[i]);
				if (flshPntCdoTemp[i] != null)
					model.setFlshPntCdoTemp(flshPntCdoTemp[i]);
				if (imdgAmdtNo[i] != null)
					model.setImdgAmdtNo(imdgAmdtNo[i]);
				if (emsNo[i] != null)
					model.setEmsNo(emsNo[i]);
				if (sevrMrnPolutFlg[i] != null)
					model.setSevrMrnPolutFlg(sevrMrnPolutFlg[i]);
				if (maxInPckQty[i] != null)
					model.setMaxInPckQty(maxInPckQty[i]);
				if (n1stPreVvdCd[i] != null)
					model.setN1stPreVvdCd(n1stPreVvdCd[i]);
				if (spclCgoAproCd[i] != null)
					model.setSpclCgoAproCd(spclCgoAproCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (dgCntrSeq[i] != null)
					model.setDgCntrSeq(dgCntrSeq[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (stwgTempCtnt[i] != null)
					model.setStwgTempCtnt(stwgTempCtnt[i]);
				if (spclStwgRqstDesc[i] != null)
					model.setSpclStwgRqstDesc(spclStwgRqstDesc[i]);
				if (dotExpNo[i] != null)
					model.setDotExpNo(dotExpNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (inImdgPckQty1[i] != null)
					model.setInImdgPckQty1(inImdgPckQty1[i]);
				if (inImdgPckQty2[i] != null)
					model.setInImdgPckQty2(inImdgPckQty2[i]);
				if (dcgoRefNo[i] != null)
					model.setDcgoRefNo(dcgoRefNo[i]);
				if (imdgUnNoSpclProviCtnt[i] != null)
					model.setImdgUnNoSpclProviCtnt(imdgUnNoSpclProviCtnt[i]);
				if (psaNo[i] != null)
					model.setPsaNo(psaNo[i]);
				if (emerCntcPsonNm[i] != null)
					model.setEmerCntcPsonNm(emerCntcPsonNm[i]);
				if (dcgoStsCd[i] != null)
					model.setDcgoStsCd(dcgoStsCd[i]);
				if (sadtTemp[i] != null)
					model.setSadtTemp(sadtTemp[i]);
				if (dcgoRqstGrpEml2[i] != null)
					model.setDcgoRqstGrpEml2(dcgoRqstGrpEml2[i]);
				if (cfrRptQtyFlg[i] != null)
					model.setCfrRptQtyFlg(cfrRptQtyFlg[i]);
				if (erapNo[i] != null)
					model.setErapNo(erapNo[i]);
				if (dcgoRqstGrpEml1[i] != null)
					model.setDcgoRqstGrpEml1(dcgoRqstGrpEml1[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (cfrFlg[i] != null)
					model.setCfrFlg(cfrFlg[i]);
				if (mrnPolutFlg[i] != null)
					model.setMrnPolutFlg(mrnPolutFlg[i]);
				if (inImdgPckCd1[i] != null)
					model.setInImdgPckCd1(inImdgPckCd1[i]);
				if (inImdgPckCd2[i] != null)
					model.setInImdgPckCd2(inImdgPckCd2[i]);
				if (erapAproRefNo[i] != null)
					model.setErapAproRefNo(erapAproRefNo[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (netWgt[i] != null)
					model.setNetWgt(netWgt[i]);
				if (dotSpclAproNo[i] != null)
					model.setDotSpclAproNo(dotSpclAproNo[i]);
				if (cntrCgoSeq[i] != null)
					model.setCntrCgoSeq(cntrCgoSeq[i]);
				if (aplyNo[i] != null)
					model.setAplyNo(aplyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cgoLclFlg[i] != null)
					model.setCgoLclFlg(cgoLclFlg[i]);
				if (bbCgoSeq[i] != null)
					model.setBbCgoSeq(bbCgoSeq[i]);
				if (hzdDesc[i] != null)
					model.setHzdDesc(hzdDesc[i]);
				if (emerRspnGidChrNo[i] != null)
					model.setEmerRspnGidChrNo(emerRspnGidChrNo[i]);
				if (emerTempCtnt[i] != null)
					model.setEmerTempCtnt(emerTempCtnt[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (outImdgPckCd2[i] != null)
					model.setOutImdgPckCd2(outImdgPckCd2[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (outImdgPckCd1[i] != null)
					model.setOutImdgPckCd1(outImdgPckCd1[i]);
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (dmstBkgNo[i] != null)
					model.setDmstBkgNo(dmstBkgNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (radaTrspNo[i] != null)
					model.setRadaTrspNo(radaTrspNo[i]);
				if (maxInPckTpCd[i] != null)
					model.setMaxInPckTpCd(maxInPckTpCd[i]);
				if (radaUtCd[i] != null)
					model.setRadaUtCd(radaUtCd[i]);
				if (rqstGdt[i] != null)
					model.setRqstGdt(rqstGdt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (certiNo[i] != null)
					model.setCertiNo(certiNo[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (imdgExptQtyFlg[i] != null)
					model.setImdgExptQtyFlg(imdgExptQtyFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (grsCapaQty[i] != null)
					model.setGrsCapaQty(grsCapaQty[i]);
				if (clodFlg[i] != null)
					model.setClodFlg(clodFlg[i]);
				if (intmdImdgPckCd1[i] != null)
					model.setIntmdImdgPckCd1(intmdImdgPckCd1[i]);
				if (intmdImdgPckCd2[i] != null)
					model.setIntmdImdgPckCd2(intmdImdgPckCd2[i]);
				if (erapCntcNo[i] != null)
					model.setErapCntcNo(erapCntcNo[i]);
				if (ctrlTempCtnt[i] != null)
					model.setCtrlTempCtnt(ctrlTempCtnt[i]);
				if (imdgSubsRskLblCd2[i] != null)
					model.setImdgSubsRskLblCd2(imdgSubsRskLblCd2[i]);
				if (hcdgDpndQtyFlg[i] != null)
					model.setHcdgDpndQtyFlg(hcdgDpndQtyFlg[i]);
				if (imdgSubsRskLblCd1[i] != null)
					model.setImdgSubsRskLblCd1(imdgSubsRskLblCd1[i]);
				if (prpShpNm[i] != null)
					model.setPrpShpNm(prpShpNm[i]);
				if (imdgSubsRskLblCd4[i] != null)
					model.setImdgSubsRskLblCd4(imdgSubsRskLblCd4[i]);
				if (imdgSubsRskLblCd3[i] != null)
					model.setImdgSubsRskLblCd3(imdgSubsRskLblCd3[i]);
				if (imdgLmtQtyFlg[i] != null)
					model.setImdgLmtQtyFlg(imdgLmtQtyFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDomDgCgoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return DomDgCgoVO[]
	 */
	public DomDgCgoVO[] getDomDgCgoVOs(){
		DomDgCgoVO[] vos = (DomDgCgoVO[])models.toArray(new DomDgCgoVO[models.size()]);
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
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoSeq = this.dcgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoSeq = this.awkCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckQty1 = this.outImdgPckQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckQty2 = this.outImdgPckQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaSkdNo = this.radaSkdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgCompGrpCd = this.imdgCompGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrPsnInhHzdZnCd = this.cfrPsnInhHzdZnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intmdImdgPckQty1 = this.intmdImdgPckQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hcdgFlg = this.hcdgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intmdImdgPckQty2 = this.intmdImdgPckQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsdFlg = this.rsdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saptTemp = this.saptTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.capaQty = this.capaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaAmt = this.radaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdCtnt = this.hzdCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRqstDesc = this.spclRqstDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSegrGrpNo = this.imdgSegrGrpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netExploWgt = this.netExploWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidNo = this.emerRspnGidNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeDtlDesc = this.cneeDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRqstFlg = this.spclRqstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcSeq = this.rcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dotAuthNo = this.dotAuthNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPhnNoCtnt = this.emerCntcPhnNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPckGrpCd = this.imdgPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsExptFlg = this.cstmsExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flshPntCdoTemp = this.flshPntCdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgAmdtNo = this.imdgAmdtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emsNo = this.emsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sevrMrnPolutFlg = this.sevrMrnPolutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckQty = this.maxInPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPreVvdCd = this.n1stPreVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAproCd = this.spclCgoAproCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgCntrSeq = this.dgCntrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stwgTempCtnt = this.stwgTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclStwgRqstDesc = this.spclStwgRqstDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dotExpNo = this.dotExpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckQty1 = this.inImdgPckQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckQty2 = this.inImdgPckQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoRefNo = this.dcgoRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSpclProviCtnt = this.imdgUnNoSpclProviCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psaNo = this.psaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPsonNm = this.emerCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoStsCd = this.dcgoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sadtTemp = this.sadtTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoRqstGrpEml2 = this.dcgoRqstGrpEml2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrRptQtyFlg = this.cfrRptQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erapNo = this.erapNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoRqstGrpEml1 = this.dcgoRqstGrpEml1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrFlg = this.cfrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnPolutFlg = this.mrnPolutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckCd1 = this.inImdgPckCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inImdgPckCd2 = this.inImdgPckCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erapAproRefNo = this.erapAproRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgt = this.netWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dotSpclAproNo = this.dotSpclAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCgoSeq = this.cntrCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyNo = this.aplyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoLclFlg = this.cgoLclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoSeq = this.bbCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdDesc = this.hzdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerRspnGidChrNo = this.emerRspnGidChrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerTempCtnt = this.emerTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckCd2 = this.outImdgPckCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outImdgPckCd1 = this.outImdgPckCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstBkgNo = this.dmstBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaTrspNo = this.radaTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxInPckTpCd = this.maxInPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.radaUtCd = this.radaUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstGdt = this.rqstGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.certiNo = this.certiNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgExptQtyFlg = this.imdgExptQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsCapaQty = this.grsCapaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clodFlg = this.clodFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intmdImdgPckCd1 = this.intmdImdgPckCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intmdImdgPckCd2 = this.intmdImdgPckCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erapCntcNo = this.erapCntcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlTempCtnt = this.ctrlTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd2 = this.imdgSubsRskLblCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hcdgDpndQtyFlg = this.hcdgDpndQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd1 = this.imdgSubsRskLblCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpShpNm = this.prpShpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd4 = this.imdgSubsRskLblCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSubsRskLblCd3 = this.imdgSubsRskLblCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgLmtQtyFlg = this.imdgLmtQtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
