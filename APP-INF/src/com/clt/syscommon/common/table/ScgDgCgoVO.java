/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgDgCgoVO.java
*@FileTitle : ScgDgCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.06.04 이도형 
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
 * @author 이도형
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class ScgDgCgoVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<ScgDgCgoVO> models = new ArrayList<ScgDgCgoVO>();

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
    private String outImdgPckCd2 = null;

    /* Column Info */
    private String emerTempCtnt = null;

    /* Column Info */
    private String outImdgPckCd1 = null;

    /* Column Info */
    private String grsWgt = null;

    /* Column Info */
    private String imdgClssCd = null;

    /* Column Info */
    private String rcSeq = null;

    /* Column Info */
    private String rqstUsrId = null;

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
    private String pckQty = null;

    /* Column Info */
    private String spclCgoAproRqstSeq = null;

    /* Column Info */
    private String pckTpCd = null;

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
    private String bkgNoSplit = null;

    /* Column Info */
    private String imdgCoGrpCd = null;

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
    private String imdgSubsRskLblCd3 = null;

    /* Column Info */
    private String imdgSubsRskLblCd4 = null;

    /* Column Info */
    private String imdgLmtQtyFlg = null;

    /* Column Info */
    private String emerCntcPhnNoCtnt = null;

    /* Column Info */
    private String dotExpNo = null;

    /* Column Info */
    private String dotSpclAproNo = null;

    /* Column Info */
    private String dotAuthNo = null;

    /* Column Info */
    private String erapNo = null;

    /* Column Info */
    private String erapCntcNo = null;

    /* Column Info */
    private String erapAproRefNo = null;

    /* Column Info */
    private String imdgUnNoSpclProviCtnt = null;

    /* Column Info */
    private String imdgSegrGrpNo = null;

    /* Column Info */
    private String vslPrePstCd = null;

    /* Column Info */
    private String vslSeq = null;

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String vvdCd = null;

    /* Column Info */
    private String polCd = null;

    /* Column Info */
    private String polNodCd = null;

    /* Column Info */
    private String podCd = null;

    /* Column Info */
    private String podNodCd = null;

    /* Column Info */
    private String sadtTemp = null;

    /* Column Info */
    private String saptTemp = null;

    /* Column Info */
    private String trspTemp = null;

    /* Column Info */
    private String rsdFlg = null;

    /* Column Info */
    private String imdgSegrGrpN2ndNo = null;

    /* Column Info */
    private String imdgN2ndSegrGrpNo = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public ScgDgCgoVO() {
    }

    public ScgDgCgoVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String spclCgoAproRqstSeq, String dcgoSeq, String dgCntrSeq, String cntrCgoSeq, String cntrNo, String cntrTpszCd, String imdgUnNo, String imdgUnNoSeq, String imdgClssCd, String imdgCoGrpCd, String imdgLmtQtyFlg, String imdgSubsRskLblCd1, String imdgSubsRskLblCd2, String imdgSubsRskLblCd3, String imdgSubsRskLblCd4, String imdgExptQtyFlg, String netWgt, String grsWgt, String wgtUtCd, String flshPntCdoTemp, String prpShpNm, String hzdDesc, String measQty, String measTpCd, String pckQty, String pckTpCd, String clodFlg, String spclStwgRqstDesc, String dcgoStsCd, String cgoLclFlg, String emerRspnGidNo, String emerRspnGidChrNo, String emerCntcPhnNo, String emerCntcPsonNm, String emerTempCtnt, String ctrlTempCtnt, String emsNo, String imdgPckGrpCd, String mrnPolutFlg, String psaNo, String certiNo, String inImdgPckQty1, String inImdgPckCd1, String inImdgPckQty2, String inImdgPckCd2, String outImdgPckQty1, String outImdgPckCd1, String outImdgPckQty2, String outImdgPckCd2, String maxInPckQty, String maxInPckTpCd, String cneeDtlDesc, String netExploWgt, String radaSkdNo, String radaAmt, String radaUtCd, String radaTrspNo, String rcFlg, String awkCgoFlg, String bbCgoFlg, String rcSeq, String awkCgoSeq, String bbCgoSeq, String hcdgFlg, String hcdgDpndQtyFlg, String rqstDt, String rqstUsrId, String aplyNo, String spclCgoAproCd, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String emerCntcPhnNoCtnt, String dotExpNo, String dotSpclAproNo, String dotAuthNo, String erapNo, String erapCntcNo, String erapAproRefNo, String imdgUnNoSpclProviCtnt, String imdgSegrGrpNo, String vslPrePstCd, String vslSeq, String vslCd, String skdVoyNo, String skdDirCd, String vvdCd, String polCd, String polNodCd, String podCd, String podNodCd, String sadtTemp, String saptTemp, String trspTemp, String rsdFlg, String imdgSegrGrpN2ndNo, String imdgN2ndSegrGrpNo) {
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
        this.outImdgPckCd2 = outImdgPckCd2;
        this.emerTempCtnt = emerTempCtnt;
        this.outImdgPckCd1 = outImdgPckCd1;
        this.grsWgt = grsWgt;
        this.imdgClssCd = imdgClssCd;
        this.rcSeq = rcSeq;
        this.rqstUsrId = rqstUsrId;
        this.emerCntcPhnNo = emerCntcPhnNo;
        this.measTpCd = measTpCd;
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
        this.pckQty = pckQty;
        this.spclCgoAproRqstSeq = spclCgoAproRqstSeq;
        this.pckTpCd = pckTpCd;
        this.imdgExptQtyFlg = imdgExptQtyFlg;
        this.dgCntrSeq = dgCntrSeq;
        this.updDt = updDt;
        this.rqstDt = rqstDt;
        this.clodFlg = clodFlg;
        this.bkgNoSplit = bkgNoSplit;
        this.imdgCoGrpCd = imdgCoGrpCd;
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
        this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
        this.imdgSubsRskLblCd4 = imdgSubsRskLblCd4;
        this.imdgLmtQtyFlg = imdgLmtQtyFlg;
        this.emerCntcPhnNoCtnt = emerCntcPhnNoCtnt;
        this.dotExpNo = dotExpNo;
        this.dotSpclAproNo = dotSpclAproNo;
        this.dotAuthNo = dotAuthNo;
        this.erapNo = erapNo;
        this.erapCntcNo = erapCntcNo;
        this.erapAproRefNo = erapAproRefNo;
        this.imdgUnNoSpclProviCtnt = imdgUnNoSpclProviCtnt;
        this.imdgSegrGrpNo = imdgSegrGrpNo;
        this.vslPrePstCd = vslPrePstCd;
        this.vslSeq = vslSeq;
        this.vslCd = vslCd;
        this.skdVoyNo = skdVoyNo;
        this.skdDirCd = skdDirCd;
        this.vvdCd = vvdCd;
        this.polCd = polCd;
        this.polNodCd = polNodCd;
        this.podCd = podCd;
        this.podNodCd = podNodCd;
        this.sadtTemp = sadtTemp;
        this.saptTemp = saptTemp;
        this.trspTemp = trspTemp;
        this.rsdFlg = this.rsdFlg;
        this.imdgSegrGrpN2ndNo = imdgSegrGrpN2ndNo;
        this.imdgN2ndSegrGrpNo = imdgN2ndSegrGrpNo;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
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
        this.hashColumns.put("out_imdg_pck_cd2", getOutImdgPckCd2());
        this.hashColumns.put("emer_temp_ctnt", getEmerTempCtnt());
        this.hashColumns.put("out_imdg_pck_cd1", getOutImdgPckCd1());
        this.hashColumns.put("grs_wgt", getGrsWgt());
        this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
        this.hashColumns.put("rc_seq", getRcSeq());
        this.hashColumns.put("rqst_usr_id", getRqstUsrId());
        this.hashColumns.put("emer_cntc_phn_no", getEmerCntcPhnNo());
        this.hashColumns.put("meas_tp_cd", getMeasTpCd());
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
        this.hashColumns.put("pck_qty", getPckQty());
        this.hashColumns.put("spcl_cgo_apro_rqst_seq", getSpclCgoAproRqstSeq());
        this.hashColumns.put("pck_tp_cd", getPckTpCd());
        this.hashColumns.put("imdg_expt_qty_flg", getImdgExptQtyFlg());
        this.hashColumns.put("dg_cntr_seq", getDgCntrSeq());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("rqst_dt", getRqstDt());
        this.hashColumns.put("clod_flg", getClodFlg());
        this.hashColumns.put("bkg_no_split", getBkgNoSplit());
        this.hashColumns.put("imdg_co_grp_cd", getImdgCoGrpCd());
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
        this.hashColumns.put("imdg_subs_rsk_lbl_cd3", getImdgSubsRskLblCd3());
        this.hashColumns.put("imdg_subs_rsk_lbl_cd4", getImdgSubsRskLblCd4());
        this.hashColumns.put("imdg_lmt_qty_flg", getImdgLmtQtyFlg());
        this.hashColumns.put("emer_cntc_phn_no_ctnt", getEmerCntcPhnNoCtnt());
        this.hashColumns.put("dot_exp_no", getDotExpNo());
        this.hashColumns.put("dot_spcl_apro_no", getDotSpclAproNo());
        this.hashColumns.put("dot_auth_no", getDotAuthNo());
        this.hashColumns.put("erap_no", getErapNo());
        this.hashColumns.put("erap_cntc_no", getErapCntcNo());
        this.hashColumns.put("erap_apro_ref_no", getErapAproRefNo());
        this.hashColumns.put("imdg_un_no_spcl_provi_ctnt", getImdgUnNoSpclProviCtnt());
        this.hashColumns.put("imdg_segr_grp_no", getImdgSegrGrpNo());
        this.hashColumns.put("vsl_pre_pst_cd", getVslPrePstCd());
        this.hashColumns.put("vsl_seq", getVslSeq());
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("vvd_cd", getVvdCd());
        this.hashColumns.put("pol_cd", getPolCd());
        this.hashColumns.put("pol_nod_cd", getPolNodCd());
        this.hashColumns.put("pod_cd", getPodCd());
        this.hashColumns.put("pod_nod_cd", getPodNodCd());
        this.hashColumns.put("sadt_temp", getSadtTemp());
        this.hashColumns.put("sapt_temp", getSaptTemp());
        this.hashColumns.put("trsp_temp", getTrspTemp());
        this.hashColumns.put("rsd_flg", getRsdFlg());
        this.hashColumns.put("imdg_segr_grp_n2nd_no", getImdgSegrGrpN2ndNo());
        this.hashColumns.put("imdg_n2nd_segr_grp_no", getImdgN2ndSegrGrpNo());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
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
        this.hashFields.put("out_imdg_pck_cd2", "outImdgPckCd2");
        this.hashFields.put("emer_temp_ctnt", "emerTempCtnt");
        this.hashFields.put("out_imdg_pck_cd1", "outImdgPckCd1");
        this.hashFields.put("grs_wgt", "grsWgt");
        this.hashFields.put("imdg_clss_cd", "imdgClssCd");
        this.hashFields.put("rc_seq", "rcSeq");
        this.hashFields.put("rqst_usr_id", "rqstUsrId");
        this.hashFields.put("emer_cntc_phn_no", "emerCntcPhnNo");
        this.hashFields.put("meas_tp_cd", "measTpCd");
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
        this.hashFields.put("pck_qty", "pckQty");
        this.hashFields.put("spcl_cgo_apro_rqst_seq", "spclCgoAproRqstSeq");
        this.hashFields.put("pck_tp_cd", "pckTpCd");
        this.hashFields.put("imdg_expt_qty_flg", "imdgExptQtyFlg");
        this.hashFields.put("dg_cntr_seq", "dgCntrSeq");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("rqst_dt", "rqstDt");
        this.hashFields.put("clod_flg", "clodFlg");
        this.hashFields.put("bkg_no_split", "bkgNoSplit");
        this.hashFields.put("imdg_co_grp_cd", "imdgCoGrpCd");
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
        this.hashFields.put("imdg_subs_rsk_lbl_cd3", "imdgSubsRskLblCd3");
        this.hashFields.put("imdg_subs_rsk_lbl_cd4", "imdgSubsRskLblCd4");
        this.hashFields.put("imdg_lmt_qty_flg", "imdgLmtQtyFlg");
        this.hashFields.put("emer_cntc_phn_no_ctnt", "emerCntcPhnNoCtnt");
        this.hashFields.put("dot_exp_no", "dotExpNo");
        this.hashFields.put("dot_spcl_apro_no", "dotSpclAproNo");
        this.hashFields.put("dot_auth_no", "dotAuthNo");
        this.hashFields.put("erap_no", "erapNo");
        this.hashFields.put("erap_cntc_no", "erapCntcNo");
        this.hashFields.put("erap_apro_ref_no", "erapAproRefNo");
        this.hashFields.put("imdg_un_no_spcl_provi_ctnt", "imdgUnNoSpclProviCtnt");
        this.hashFields.put("imdg_segr_grp_no", "imdgSegrGrpNo");
        this.hashFields.put("vsl_pre_pst_cd", "vslPrePstCd");
        this.hashFields.put("vsl_seq", "vslSeq");
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("vvd_cd", "vvdCd");
        this.hashFields.put("pol_cd", "polCd");
        this.hashFields.put("pol_nod_cd", "polNodCd");
        this.hashFields.put("pod_cd", "podCd");
        this.hashFields.put("pod_nod_cd", "podNodCd");
        this.hashFields.put("sadt_temp", "sadtTemp");
        this.hashFields.put("sapt_temp", "saptTemp");
        this.hashFields.put("trsp_temp", "trspTemp");
        this.hashFields.put("rsd_flg", "rsdFlg");
        this.hashFields.put("imdg_segr_grp_n2nd_no", "imdgSegrGrpN2ndNo");
        this.hashFields.put("imdg_n2nd_segr_grp_no", "imdgN2ndSegrGrpNo");
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
	 * @return outImdgPckCd2
	 */
    public String getOutImdgPckCd2() {
        return this.outImdgPckCd2;
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
	 * @return outImdgPckCd1
	 */
    public String getOutImdgPckCd1() {
        return this.outImdgPckCd1;
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
	 * @return pckQty
	 */
    public String getPckQty() {
        return this.pckQty;
    }

    /**
	 * Column Info
	 * @return spclCgoAproRqstSeq
	 */
    public String getSpclCgoAproRqstSeq() {
        return this.spclCgoAproRqstSeq;
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
	 * @return bkgNoSplit
	 */
    public String getBkgNoSplit() {
        return this.bkgNoSplit;
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
	 * @return imdgSubsRskLblCd3
	 */
    public String getImdgSubsRskLblCd3() {
        return this.imdgSubsRskLblCd3;
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
	 * @return polCd
	 */
    public String getPolCd() {
        return this.polCd;
    }

    /**
	 * Column Info
	 * @return polNodCd
	 */
    public String getPolNodCd() {
        return this.polNodCd;
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
	 * @return podNodCd
	 */
    public String getPodNodCd() {
        return this.podNodCd;
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
	 * @return saptTemp
	 */
    public String getSaptTemp() {
        return this.saptTemp;
    }

    /**
	 * Column Info
	 * @return trspTemp
	 */
    public String getTrspTemp() {
        return this.trspTemp;
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
	 * @param outImdgPckCd2
	 */
    public void setOutImdgPckCd2(String outImdgPckCd2) {
        this.outImdgPckCd2 = outImdgPckCd2;
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
	 * @param outImdgPckCd1
	 */
    public void setOutImdgPckCd1(String outImdgPckCd1) {
        this.outImdgPckCd1 = outImdgPckCd1;
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
	 * @param pckQty
	 */
    public void setPckQty(String pckQty) {
        this.pckQty = pckQty;
    }

    /**
	 * Column Info
	 * @param spclCgoAproRqstSeq
	 */
    public void setSpclCgoAproRqstSeq(String spclCgoAproRqstSeq) {
        this.spclCgoAproRqstSeq = spclCgoAproRqstSeq;
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
	 * @param bkgNoSplit
	 */
    public void setBkgNoSplit(String bkgNoSplit) {
        this.bkgNoSplit = bkgNoSplit;
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
	 * @param imdgSubsRskLblCd3
	 */
    public void setImdgSubsRskLblCd3(String imdgSubsRskLblCd3) {
        this.imdgSubsRskLblCd3 = imdgSubsRskLblCd3;
    }

    /**
	 * Column Info
	 * @param imdgSubsRskLblCd4
	 */
    public void setImdgSubsRskLblCd4(String imdgSubsRskLblCd4) {
        this.imdgSubsRskLblCd3 = imdgSubsRskLblCd4;
    }

    /**
	 * Column Info
	 * @param imdgLmtQtyFlg
	 */
    public void setImdgLmtQtyFlg(String imdgLmtQtyFlg) {
        this.imdgLmtQtyFlg = imdgLmtQtyFlg;
    }

    public void setEmerCntcPhnNoCtnt(String emerCntcPhnNoCtnt) {
        this.emerCntcPhnNoCtnt = emerCntcPhnNoCtnt;
    }

    public String getEmerCntcPhnNoCtnt() {
        return this.emerCntcPhnNoCtnt;
    }

    public void setDotExpNo(String dotExpNo) {
        this.dotExpNo = dotExpNo;
    }

    public String getDotExpNo() {
        return this.dotExpNo;
    }

    public void setDotSpclAproNo(String dotSpclAproNo) {
        this.dotSpclAproNo = dotSpclAproNo;
    }

    public String getDotSpclAproNo() {
        return this.dotSpclAproNo;
    }

    public void setDotAuthNo(String dotAuthNo) {
        this.dotAuthNo = dotAuthNo;
    }

    public String getDotAuthNo() {
        return this.dotAuthNo;
    }

    public void setErapNo(String erapNo) {
        this.erapNo = erapNo;
    }

    public String getErapNo() {
        return this.erapNo;
    }

    public void setErapCntcNo(String erapCntcNo) {
        this.erapCntcNo = erapCntcNo;
    }

    public String getErapCntcNo() {
        return this.erapCntcNo;
    }

    public void setErapAproRefNo(String erapAproRefNo) {
        this.erapAproRefNo = erapAproRefNo;
    }

    public String getErapAproRefNo() {
        return this.erapAproRefNo;
    }

    public void setImdgUnNoSpclProviCtnt(String imdgUnNoSpclProviCtnt) {
        this.imdgUnNoSpclProviCtnt = imdgUnNoSpclProviCtnt;
    }

    public String getImdgUnNoSpclProviCtnt() {
        return this.imdgUnNoSpclProviCtnt;
    }

    public void setImdgSegrGrpNo(String imdgSegrGrpNo) {
        this.imdgSegrGrpNo = imdgSegrGrpNo;
    }

    public String getImdgSegrGrpNo() {
        return this.imdgSegrGrpNo;
    }

    public void setVslPrePstCd(String vslPrePstCd) {
        this.vslPrePstCd = vslPrePstCd;
    }

    public String getVslPrePstCd() {
        return this.vslPrePstCd;
    }

    public void setVslSeq(String vslSeq) {
        this.vslSeq = vslSeq;
    }

    public String getVslSeq() {
        return this.vslSeq;
    }

    public void setVslCd(String vslCd) {
        this.vslCd = vslCd;
    }

    public String getVslCd() {
        return this.vslCd;
    }

    public void setSkdVoyNo(String skdVoyNo) {
        this.skdVoyNo = skdVoyNo;
    }

    public String getSkdVoyNo() {
        return this.skdVoyNo;
    }

    public void setSkdDirCd(String skdDirCd) {
        this.skdDirCd = skdDirCd;
    }

    public String getSkdDirCd() {
        return this.skdDirCd;
    }

    public void setVvdCd(String vvdCd) {
        this.vvdCd = vvdCd;
    }

    public String getVvdCd() {
        return this.vvdCd;
    }

    /**
	 * Column Info
	 * @return polCd
	 */
    public void setPolCd(String polCd) {
        this.polCd = polCd;
    }

    /**
	 * Column Info
	 * @return polNodCd
	 */
    public void setPolNodCd(String polNodCd) {
        this.polNodCd = polNodCd;
    }

    /**
	 * Column Info
	 * @return podCd
	 */
    public void setPodCd(String podCd) {
        this.podCd = podCd;
    }

    /**
	 * Column Info
	 * @return podNodCd
	 */
    public void setPodNodCd(String podNodCd) {
        this.podNodCd = podNodCd;
    }

    /**
	 * Column Info
	 * @return sadtTemp
	 */
    public void setSadtTemp(String sadtTemp) {
        this.sadtTemp = sadtTemp;
    }

    /**
	 * Column Info
	 * @return saptTemp
	 */
    public void setSaptTemp(String saptTemp) {
        this.saptTemp = saptTemp;
    }

    /**
	 * Column Info
	 * @return trspTemp
	 */
    public void setTrspTemp(String trspTemp) {
        this.trspTemp = trspTemp;
    }

    /**
	 * Column Info
	 * @return rsdFlg
	 */
    public void setRsdFlg(String rsdFlg) {
        this.rsdFlg = rsdFlg;
    }

    public void setImdgSegrGrpN2ndNo(String imdgSegrGrpN2ndNo) {
        this.imdgSegrGrpN2ndNo = imdgSegrGrpN2ndNo;
    }

    public String getImdgSegrGrpN2ndNo() {
        return this.imdgSegrGrpN2ndNo;
    }

    public void setImdgN2ndSegrGrpNo(String imdgN2ndSegrGrpNo) {
        this.imdgN2ndSegrGrpNo = imdgN2ndSegrGrpNo;
    }

    public String getImdgN2ndSegrGrpNo() {
        return this.imdgN2ndSegrGrpNo;
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
        setOutImdgPckCd2(JSPUtil.getParameter(request, "out_imdg_pck_cd2", ""));
        setEmerTempCtnt(JSPUtil.getParameter(request, "emer_temp_ctnt", ""));
        setOutImdgPckCd1(JSPUtil.getParameter(request, "out_imdg_pck_cd1", ""));
        setGrsWgt(JSPUtil.getParameter(request, "grs_wgt", ""));
        setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
        setRcSeq(JSPUtil.getParameter(request, "rc_seq", ""));
        setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
        setEmerCntcPhnNo(JSPUtil.getParameter(request, "emer_cntc_phn_no", ""));
        setMeasTpCd(JSPUtil.getParameter(request, "meas_tp_cd", ""));
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
        setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
        setSpclCgoAproRqstSeq(JSPUtil.getParameter(request, "spcl_cgo_apro_rqst_seq", ""));
        setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
        setImdgExptQtyFlg(JSPUtil.getParameter(request, "imdg_expt_qty_flg", ""));
        setDgCntrSeq(JSPUtil.getParameter(request, "dg_cntr_seq", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
        setClodFlg(JSPUtil.getParameter(request, "clod_flg", ""));
        setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
        setImdgCoGrpCd(JSPUtil.getParameter(request, "imdg_co_grp_cd", ""));
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
        setImdgSubsRskLblCd3(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd3", ""));
        setImdgSubsRskLblCd4(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_cd4", ""));
        setImdgLmtQtyFlg(JSPUtil.getParameter(request, "imdg_lmt_qty_flg", ""));
        setEmerCntcPhnNoCtnt(JSPUtil.getParameter(request, "emer_cntc_phn_no_ctnt", ""));
        setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
        setVslPrePstCd(JSPUtil.getParameter(request, "vsl_pre_pst_cd", ""));
        setVslSeq(JSPUtil.getParameter(request, "vsl_seq", ""));
        setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
        setPolNodCd(JSPUtil.getParameter(request, "pol_nod_cd", ""));
        setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
        setPodNodCd(JSPUtil.getParameter(request, "pod_nod_cd", ""));
        setSadtTemp(JSPUtil.getParameter(request, "sadt_temp", ""));
        setSaptTemp(JSPUtil.getParameter(request, "sapt_temp", ""));
        setTrspTemp(JSPUtil.getParameter(request, "trsp_temp", ""));
        setRsdFlg(JSPUtil.getParameter(request, "rsd_flg", ""));
        setImdgSegrGrpNo(JSPUtil.getParameter(request, "rsd_flg", ""));
        setImdgSegrGrpN2ndNo(JSPUtil.getParameter(request, "imdg_segr_grp_n2nd_no", ""));
        setImdgN2ndSegrGrpNo(JSPUtil.getParameter(request, "imdg_n2nd_segr_grp_no", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgDgCgoVO[]
	 */
    public ScgDgCgoVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgDgCgoVO[]
	 */
    public ScgDgCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        ScgDgCgoVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix + "imdg_un_no_seq".trim(), length));
            String[] psaNo = (JSPUtil.getParameter(request, prefix + "psa_no".trim(), length));
            String[] awkCgoSeq = (JSPUtil.getParameter(request, prefix + "awk_cgo_seq".trim(), length));
            String[] dcgoSeq = (JSPUtil.getParameter(request, prefix + "dcgo_seq".trim(), length));
            String[] dcgoStsCd = (JSPUtil.getParameter(request, prefix + "dcgo_sts_cd".trim(), length));
            String[] emerCntcPsonNm = (JSPUtil.getParameter(request, prefix + "emer_cntc_pson_nm".trim(), length));
            String[] outImdgPckQty1 = (JSPUtil.getParameter(request, prefix + "out_imdg_pck_qty1".trim(), length));
            String[] outImdgPckQty2 = (JSPUtil.getParameter(request, prefix + "out_imdg_pck_qty2".trim(), length));
            String[] radaSkdNo = (JSPUtil.getParameter(request, prefix + "rada_skd_no".trim(), length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows".trim(), length));
            String[] wgtUtCd = (JSPUtil.getParameter(request, prefix + "wgt_ut_cd".trim(), length));
            String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd".trim(), length));
            String[] mrnPolutFlg = (JSPUtil.getParameter(request, prefix + "mrn_polut_flg".trim(), length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id".trim(), length));
            String[] hcdgFlg = (JSPUtil.getParameter(request, prefix + "hcdg_flg".trim(), length));
            String[] imdgUnNo = (JSPUtil.getParameter(request, prefix + "imdg_un_no".trim(), length));
            String[] inImdgPckCd1 = (JSPUtil.getParameter(request, prefix + "in_imdg_pck_cd1".trim(), length));
            String[] inImdgPckCd2 = (JSPUtil.getParameter(request, prefix + "in_imdg_pck_cd2".trim(), length));
            String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix + "awk_cgo_flg".trim(), length));
            String[] netWgt = (JSPUtil.getParameter(request, prefix + "net_wgt".trim(), length));
            String[] cntrCgoSeq = (JSPUtil.getParameter(request, prefix + "cntr_cgo_seq".trim(), length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id".trim(), length));
            String[] aplyNo = (JSPUtil.getParameter(request, prefix + "aply_no".trim(), length));
            String[] radaAmt = (JSPUtil.getParameter(request, prefix + "rada_amt".trim(), length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no".trim(), length));
            String[] netExploWgt = (JSPUtil.getParameter(request, prefix + "net_explo_wgt".trim(), length));
            String[] cgoLclFlg = (JSPUtil.getParameter(request, prefix + "cgo_lcl_flg".trim(), length));
            String[] bbCgoSeq = (JSPUtil.getParameter(request, prefix + "bb_cgo_seq".trim(), length));
            String[] emerRspnGidNo = (JSPUtil.getParameter(request, prefix + "emer_rspn_gid_no".trim(), length));
            String[] hzdDesc = (JSPUtil.getParameter(request, prefix + "hzd_desc".trim(), length));
            String[] rcFlg = (JSPUtil.getParameter(request, prefix + "rc_flg".trim(), length));
            String[] cneeDtlDesc = (JSPUtil.getParameter(request, prefix + "cnee_dtl_desc".trim(), length));
            String[] emerRspnGidChrNo = (JSPUtil.getParameter(request, prefix + "emer_rspn_gid_chr_no".trim(), length));
            String[] outImdgPckCd2 = (JSPUtil.getParameter(request, prefix + "out_imdg_pck_cd2".trim(), length));
            String[] emerTempCtnt = (JSPUtil.getParameter(request, prefix + "emer_temp_ctnt".trim(), length));
            String[] outImdgPckCd1 = (JSPUtil.getParameter(request, prefix + "out_imdg_pck_cd1".trim(), length));
            String[] grsWgt = (JSPUtil.getParameter(request, prefix + "grs_wgt".trim(), length));
            String[] imdgClssCd = (JSPUtil.getParameter(request, prefix + "imdg_clss_cd".trim(), length));
            String[] rcSeq = (JSPUtil.getParameter(request, prefix + "rc_seq".trim(), length));
            String[] rqstUsrId = (JSPUtil.getParameter(request, prefix + "rqst_usr_id".trim(), length));
            String[] emerCntcPhnNo = (JSPUtil.getParameter(request, prefix + "emer_cntc_phn_no".trim(), length));
            String[] measTpCd = (JSPUtil.getParameter(request, prefix + "meas_tp_cd".trim(), length));
            String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix + "imdg_pck_grp_cd".trim(), length));
            String[] flshPntCdoTemp = (JSPUtil.getParameter(request, prefix + "flsh_pnt_cdo_temp".trim(), length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt".trim(), length));
            String[] radaTrspNo = (JSPUtil.getParameter(request, prefix + "rada_trsp_no".trim(), length));
            String[] radaUtCd = (JSPUtil.getParameter(request, prefix + "rada_ut_cd".trim(), length));
            String[] maxInPckTpCd = (JSPUtil.getParameter(request, prefix + "max_in_pck_tp_cd".trim(), length));
            String[] emsNo = (JSPUtil.getParameter(request, prefix + "ems_no".trim(), length));
            String[] maxInPckQty = (JSPUtil.getParameter(request, prefix + "max_in_pck_qty".trim(), length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
            String[] spclCgoAproCd = (JSPUtil.getParameter(request, prefix + "spcl_cgo_apro_cd".trim(), length));
            String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix + "bb_cgo_flg".trim(), length));
            String[] certiNo = (JSPUtil.getParameter(request, prefix + "certi_no".trim(), length));
            String[] measQty = (JSPUtil.getParameter(request, prefix + "meas_qty".trim(), length));
            String[] pckQty = (JSPUtil.getParameter(request, prefix + "pck_qty".trim(), length));
            String[] spclCgoAproRqstSeq = (JSPUtil.getParameter(request, prefix + "spcl_cgo_apro_rqst_seq".trim(), length));
            String[] pckTpCd = (JSPUtil.getParameter(request, prefix + "pck_tp_cd".trim(), length));
            String[] imdgExptQtyFlg = (JSPUtil.getParameter(request, prefix + "imdg_expt_qty_flg".trim(), length));
            String[] dgCntrSeq = (JSPUtil.getParameter(request, prefix + "dg_cntr_seq".trim(), length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt".trim(), length));
            String[] rqstDt = (JSPUtil.getParameter(request, prefix + "rqst_dt".trim(), length));
            String[] clodFlg = (JSPUtil.getParameter(request, prefix + "clod_flg".trim(), length));
            String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix + "bkg_no_split".trim(), length));
            String[] imdgCoGrpCd = (JSPUtil.getParameter(request, prefix + "imdg_co_grp_cd".trim(), length));
            String[] spclStwgRqstDesc = (JSPUtil.getParameter(request, prefix + "spcl_stwg_rqst_desc".trim(), length));
            String[] diffRmk = (JSPUtil.getParameter(request, prefix + "diff_rmk".trim(), length));
            String[] cntrNo = (JSPUtil.getParameter(request, prefix + "cntr_no".trim(), length));
            String[] ctrlTempCtnt = (JSPUtil.getParameter(request, prefix + "ctrl_temp_ctnt".trim(), length));
            String[] inImdgPckQty1 = (JSPUtil.getParameter(request, prefix + "in_imdg_pck_qty1".trim(), length));
            String[] hcdgDpndQtyFlg = (JSPUtil.getParameter(request, prefix + "hcdg_dpnd_qty_flg".trim(), length));
            String[] imdgSubsRskLblCd2 = (JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd2".trim(), length));
            String[] inImdgPckQty2 = (JSPUtil.getParameter(request, prefix + "in_imdg_pck_qty2".trim(), length));
            String[] imdgSubsRskLblCd1 = (JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd1".trim(), length));
            String[] prpShpNm = (JSPUtil.getParameter(request, prefix + "prp_shp_nm".trim(), length));
            String[] imdgSubsRskLblCd3 = (JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd3".trim(), length));
            String[] imdgSubsRskLblCd4 = (JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_cd4".trim(), length));
            String[] imdgLmtQtyFlg = (JSPUtil.getParameter(request, prefix + "imdg_lmt_qty_flg".trim(), length));
            String[] emerCntcPhnNoCtnt = (JSPUtil.getParameter(request, prefix + "emer_cntc_phn_no_ctnt", length));
            String[] dotExpNo = (JSPUtil.getParameter(request, prefix + "dot_exp_no", length));
            String[] dotSpclAproNo = (JSPUtil.getParameter(request, prefix + "dot_spcl_apro_no", length));
            String[] dotAuthNo = (JSPUtil.getParameter(request, prefix + "dot_auth_no", length));
            String[] erapNo = (JSPUtil.getParameter(request, prefix + "erap_no", length));
            String[] erapCntcNo = (JSPUtil.getParameter(request, prefix + "erap_cntc_no", length));
            String[] erapAproRefNo = (JSPUtil.getParameter(request, prefix + "erap_apro_ref_no", length));
            String[] imdgUnNoSpclProviCtnt = (JSPUtil.getParameter(request, prefix + "imdg_un_no_spcl_provi_ctnt", length));
            String[] imdgSegrGrpNo = (JSPUtil.getParameter(request, prefix + "imdg_segr_grp_no", length));
            String[] vslPrePstCd = (JSPUtil.getParameter(request, prefix + "vsl_pre_pst_cd", length));
            String[] vslSeq = (JSPUtil.getParameter(request, prefix + "vsl_seq", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] vvdCd = (JSPUtil.getParameter(request, prefix + "vvd_cd", length));
            String[] polCd = (JSPUtil.getParameter(request, prefix + "pol_cd", length));
            String[] polNodCd = (JSPUtil.getParameter(request, prefix + "pol_nod_cd", length));
            String[] podCd = (JSPUtil.getParameter(request, prefix + "pod_cd", length));
            String[] podNodCd = (JSPUtil.getParameter(request, prefix + "pod_nod_cd", length));
            String[] sadtTemp = (JSPUtil.getParameter(request, prefix + "sadt_temp", length));
            String[] saptTemp = (JSPUtil.getParameter(request, prefix + "sapt_temp", length));
            String[] trspTemp = (JSPUtil.getParameter(request, prefix + "trsp_temp", length));
            String[] rsdFlg = (JSPUtil.getParameter(request, prefix + "rsd_flg", length));
            String[] imdgSegrGrpN2ndNo = (JSPUtil.getParameter(request, prefix + "imdg_segr_grp_n2nd_no", length));
            String[] imdgN2ndSegrGrpNo = (JSPUtil.getParameter(request, prefix + "imdg_n2nd_segr_grp_no", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new ScgDgCgoVO();
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
                if (outImdgPckCd2[i] != null)
                    model.setOutImdgPckCd2(outImdgPckCd2[i]);
                if (emerTempCtnt[i] != null)
                    model.setEmerTempCtnt(emerTempCtnt[i]);
                if (outImdgPckCd1[i] != null)
                    model.setOutImdgPckCd1(outImdgPckCd1[i]);
                if (grsWgt[i] != null)
                    model.setGrsWgt(grsWgt[i]);
                if (imdgClssCd[i] != null)
                    model.setImdgClssCd(imdgClssCd[i]);
                if (rcSeq[i] != null)
                    model.setRcSeq(rcSeq[i]);
                if (rqstUsrId[i] != null)
                    model.setRqstUsrId(rqstUsrId[i]);
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
                if (pckQty[i] != null)
                    model.setPckQty(pckQty[i]);
                if (spclCgoAproRqstSeq[i] != null)
                    model.setSpclCgoAproRqstSeq(spclCgoAproRqstSeq[i]);
                if (pckTpCd[i] != null)
                    model.setPckTpCd(pckTpCd[i]);
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
                if (bkgNoSplit[i] != null)
                    model.setBkgNoSplit(bkgNoSplit[i]);
                if (imdgCoGrpCd[i] != null)
                    model.setImdgCoGrpCd(imdgCoGrpCd[i]);
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
                if (imdgSubsRskLblCd3[i] != null)
                    model.setImdgSubsRskLblCd3(imdgSubsRskLblCd3[i]);
                if (imdgSubsRskLblCd4[i] != null)
                    model.setImdgSubsRskLblCd4(imdgSubsRskLblCd4[i]);
                if (imdgLmtQtyFlg[i] != null)
                    model.setImdgLmtQtyFlg(imdgLmtQtyFlg[i]);
                if (emerCntcPhnNoCtnt[i] != null)
                    model.setEmerCntcPhnNoCtnt(emerCntcPhnNoCtnt[i]);
                if (dotExpNo[i] != null)
                    model.setDotExpNo(dotExpNo[i]);
                if (dotSpclAproNo[i] != null)
                    model.setDotSpclAproNo(dotSpclAproNo[i]);
                if (dotAuthNo[i] != null)
                    model.setDotAuthNo(dotAuthNo[i]);
                if (erapNo[i] != null)
                    model.setErapNo(erapNo[i]);
                if (erapCntcNo[i] != null)
                    model.setErapCntcNo(erapCntcNo[i]);
                if (erapAproRefNo[i] != null)
                    model.setErapAproRefNo(erapAproRefNo[i]);
                if (imdgUnNoSpclProviCtnt[i] != null)
                    model.setImdgUnNoSpclProviCtnt(imdgUnNoSpclProviCtnt[i]);
                if (imdgSegrGrpNo[i] != null)
                    model.setImdgSegrGrpNo(imdgSegrGrpNo[i]);
                if (vslPrePstCd[i] != null)
                    model.setVslPrePstCd(vslPrePstCd[i]);
                if (vslSeq[i] != null)
                    model.setVslSeq(vslSeq[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (vvdCd[i] != null)
                    model.setVvdCd(vvdCd[i]);
                if (polCd[i] != null)
                    model.setPolCd(polCd[i]);
                if (polNodCd[i] != null)
                    model.setPolNodCd(polNodCd[i]);
                if (podCd[i] != null)
                    model.setPodCd(podCd[i]);
                if (podNodCd[i] != null)
                    model.setPodNodCd(podNodCd[i]);
                if (sadtTemp[i] != null)
                    model.setSadtTemp(sadtTemp[i]);
                if (saptTemp[i] != null)
                    model.setSaptTemp(saptTemp[i]);
                if (trspTemp[i] != null)
                    model.setTrspTemp(trspTemp[i]);
                if (rsdFlg[i] != null)
                    model.setRsdFlg(rsdFlg[i]);
                if (imdgSegrGrpN2ndNo[i] != null)
                    model.setImdgSegrGrpN2ndNo(imdgSegrGrpN2ndNo[i]);
                if (imdgN2ndSegrGrpNo[i] != null) 
		    		model.setImdgN2ndSegrGrpNo(imdgN2ndSegrGrpNo[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getScgDgCgoVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return ScgDgCgoVO[]
	 */
    public ScgDgCgoVO[] getScgDgCgoVOs() {
        ScgDgCgoVO[] vos = (ScgDgCgoVO[]) models.toArray(new ScgDgCgoVO[models.size()]);
        return vos;
    }

    /**
	 * VO Class의 내용을 String으로 변환
	 */
    public String toString() {
        StringBuffer ret = new StringBuffer();
        Field[] field = this.getClass().getDeclaredFields();
        String space = "";
        try {
            for (int i = 0; i < field.length; i++) {
                String[] arr = null;
                arr = getField(field, i);
                if (arr != null) {
                    for (int j = 0; j < arr.length; j++) {
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
        try {
            arr = (String[]) field[i].get(this);
        } catch (Exception ex) {
            arr = null;
        }
        return arr;
    }

    /**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
    public void unDataFormat() {
        this.imdgUnNoSeq = this.imdgUnNoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.psaNo = this.psaNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awkCgoSeq = this.awkCgoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dcgoSeq = this.dcgoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dcgoStsCd = this.dcgoStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerCntcPsonNm = this.emerCntcPsonNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.outImdgPckQty1 = this.outImdgPckQty1.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.outImdgPckQty2 = this.outImdgPckQty2.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.radaSkdNo = this.radaSkdNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.wgtUtCd = this.wgtUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrTpszCd = this.cntrTpszCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mrnPolutFlg = this.mrnPolutFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgFlg = this.hcdgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgUnNo = this.imdgUnNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.inImdgPckCd1 = this.inImdgPckCd1.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.inImdgPckCd2 = this.inImdgPckCd2.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awkCgoFlg = this.awkCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.netWgt = this.netWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrCgoSeq = this.cntrCgoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.aplyNo = this.aplyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.radaAmt = this.radaAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.netExploWgt = this.netExploWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgoLclFlg = this.cgoLclFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bbCgoSeq = this.bbCgoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerRspnGidNo = this.emerRspnGidNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hzdDesc = this.hzdDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcFlg = this.rcFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cneeDtlDesc = this.cneeDtlDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerRspnGidChrNo = this.emerRspnGidChrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.outImdgPckCd2 = this.outImdgPckCd2.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerTempCtnt = this.emerTempCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.outImdgPckCd1 = this.outImdgPckCd1.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.grsWgt = this.grsWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgClssCd = this.imdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcSeq = this.rcSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rqstUsrId = this.rqstUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerCntcPhnNo = this.emerCntcPhnNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.measTpCd = this.measTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgPckGrpCd = this.imdgPckGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.flshPntCdoTemp = this.flshPntCdoTemp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.radaTrspNo = this.radaTrspNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.radaUtCd = this.radaUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.maxInPckTpCd = this.maxInPckTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emsNo = this.emsNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.maxInPckQty = this.maxInPckQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.spclCgoAproCd = this.spclCgoAproCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bbCgoFlg = this.bbCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.certiNo = this.certiNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.measQty = this.measQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pckQty = this.pckQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.spclCgoAproRqstSeq = this.spclCgoAproRqstSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pckTpCd = this.pckTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgExptQtyFlg = this.imdgExptQtyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dgCntrSeq = this.dgCntrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rqstDt = this.rqstDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clodFlg = this.clodFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNoSplit = this.bkgNoSplit.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgCoGrpCd = this.imdgCoGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.spclStwgRqstDesc = this.spclStwgRqstDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.diffRmk = this.diffRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrNo = this.cntrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrlTempCtnt = this.ctrlTempCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.inImdgPckQty1 = this.inImdgPckQty1.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgDpndQtyFlg = this.hcdgDpndQtyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSubsRskLblCd2 = this.imdgSubsRskLblCd2.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.inImdgPckQty2 = this.inImdgPckQty2.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSubsRskLblCd1 = this.imdgSubsRskLblCd1.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prpShpNm = this.prpShpNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSubsRskLblCd3 = this.imdgSubsRskLblCd3.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSubsRskLblCd4 = this.imdgSubsRskLblCd4.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgLmtQtyFlg = this.imdgLmtQtyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerCntcPhnNoCtnt = this.emerCntcPhnNoCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dotExpNo = this.dotExpNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dotSpclAproNo = this.dotSpclAproNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dotAuthNo = this.dotAuthNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.erapNo = this.erapNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.erapCntcNo = this.erapCntcNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.erapAproRefNo = this.erapAproRefNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgUnNoSpclProviCtnt = this.imdgUnNoSpclProviCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSegrGrpNo = this.imdgSegrGrpNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslPrePstCd = this.vslPrePstCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslSeq = this.vslSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vvdCd = this.vvdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polCd = this.polCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polNodCd = this.polNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podCd = this.podCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podNodCd = this.podNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sadtTemp = this.sadtTemp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.saptTemp = this.saptTemp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trspTemp = this.trspTemp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rsdFlg = this.rsdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSegrGrpN2ndNo = this.imdgSegrGrpN2ndNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgN2ndSegrGrpNo = this.imdgN2ndSegrGrpNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
