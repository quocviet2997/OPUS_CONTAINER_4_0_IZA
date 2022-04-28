/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaRgstBkgVO.java
*@FileTitle : CoaRgstBkgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaRgstBkgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaRgstBkgVO> models = new ArrayList<CoaRgstBkgVO>();
	
	/* Column Info */
	private String bkgDelYdCd = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String cneeCustSeq = null;
	/* Column Info */
	private String cltOfcCd = null;
	/* Column Info */
	private String n2ndPodCd = null;
	/* Column Info */
	private String actOfcCd = null;
	/* Column Info */
	private String cneeCntCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtHqOfcCd = null;
	/* Column Info */
	private String n2ndTrdCd = null;
	/* Column Info */
	private String bkgPodCd = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String spclDgCgoFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgOfcCd = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String vopCd = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String n4thRlaneCd = null;
	/* Column Info */
	private String ppdOfcCd = null;
	/* Column Info */
	private String bkgCgoWgt = null;
	/* Column Info */
	private String bkgWgtTpCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String n3rdRlaneCd = null;
	/* Column Info */
	private String spclBbCgoFlg = null;
	/* Column Info */
	private String n2ndIocContiCd = null;
	/* Column Info */
	private String ctrtSrepCd = null;
	/* Column Info */
	private String revPolCd = null;
	/* Column Info */
	private String n1stPolPodDys = null;
	/* Column Info */
	private String coaBatCd = null;
	/* Column Info */
	private String cntrRcvDt = null;
	/* Column Info */
	private String n2ndPolPodDys = null;
	/* Column Info */
	private String n3rdIocContiCd = null;
	/* Column Info */
	private String bkgStsCd = null;
	/* Column Info */
	private String agmtCustSeq = null;
	/* Column Info */
	private String rdFlg = null;
	/* Column Info */
	private String n4thIocContiCd = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String n3rdPolCd = null;
	/* Column Info */
	private String fincDirCd = null;
	/* Column Info */
	private String revPodCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String wrkVvdCd = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String n1stFincVvdCd = null;
	/* Column Info */
	private String agmtCustTpCd = null;
	/* Column Info */
	private String n4thPolCd = null;
	/* Column Info */
	private String ntfyNm = null;
	/* Column Info */
	private String autoRatDt = null;
	/* Column Info */
	private String n3rdPodCd = null;
	/* Column Info */
	private String cneeNm = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String n2ndPolCd = null;
	/* Column Info */
	private String agmtCntCd = null;
	/* Column Info */
	private String shprCustSeq = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String n3rdFincVvdCd = null;
	/* Column Info */
	private String coaBatSeq = null;
	/* Column Info */
	private String n1stPolCd = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String srepCd = null;
	/* Column Info */
	private String n4thPodCd = null;
	/* Column Info */
	private String blNoChk = null;
	/* Column Info */
	private String n4thTrdCd = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String blNoTp = null;
	/* Column Info */
	private String n1stRlaneCd = null;
	/* Column Info */
	private String n1stTrdCd = null;
	/* Column Info */
	private String n1stPodCd = null;
	/* Column Info */
	private String bkgPorCd = null;
	/* Column Info */
	private String n4thPolPodDys = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String custKeyAgmtMgrFlg = null;
	/* Column Info */
	private String usaBkgModCd = null;
	/* Column Info */
	private String agmtSgnOfcCd = null;
	/* Column Info */
	private String spclRcFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String n2ndRlaneCd = null;
	/* Column Info */
	private String n4thFincVvdCd = null;
	/* Column Info */
	private String coaBatDt = null;
	/* Column Info */
	private String rfaNo = null;
	/* Column Info */
	private String revDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgDelCd = null;
	/* Column Info */
	private String revContiCd = null;
	/* Column Info */
	private String n3rdPolPodDys = null;
	/* Column Info */
	private String n3rdTrdCd = null;
	/* Column Info */
	private String shprNm = null;
	/* Column Info */
	private String custTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String bkgPolCd = null;
	/* Column Info */
	private String ctrtRgnOfcCd = null;
	/* Column Info */
	private String n1stIocContiCd = null;
	/* Column Info */
	private String obrdDt = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String oftTpCd = null;
	/* Column Info */
	private String n2ndFincVvdCd = null;
	/* Column Info */
	private String bkgPorYdCd = null;
	/* Column Info */
	private String bkgDeTermCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaRgstBkgVO() {}

	public CoaRgstBkgVO(String ibflag, String pagerows, String bkgNo, String trdCd, String rlaneCd, String iocCd, String vslCd, String skdVoyNo, String dirCd, String revContiCd, String fincDirCd, String slanCd, String vopCd, String blNo, String blNoTp, String blNoChk, String rgnOfcCd, String rhqCd, String slsOfcCd, String actOfcCd, String usaBkgModCd, String bkgStsCd, String bkgCgoTpCd, String bkgPorCd, String bkgPorYdCd, String bkgPolCd, String bkgOfcCd, String bkgPodCd, String bkgDelCd, String bkgDelYdCd, String bkgRcvTermCd, String bkgDeTermCd, String repCmdtCd, String cmdtCd, String ppdOfcCd, String cltOfcCd, String n1stFincVvdCd, String n2ndFincVvdCd, String n3rdFincVvdCd, String n4thFincVvdCd, String n1stPolCd, String n2ndPolCd, String n3rdPolCd, String n4thPolCd, String n1stPodCd, String n2ndPodCd, String n3rdPodCd, String n4thPodCd, String n1stRlaneCd, String n2ndRlaneCd, String n3rdRlaneCd, String n4thRlaneCd, String n1stIocContiCd, String n2ndIocContiCd, String n3rdIocContiCd, String n4thIocContiCd, String n1stTrdCd, String n2ndTrdCd, String n3rdTrdCd, String n4thTrdCd, String n1stPolPodDys, String n2ndPolPodDys, String n3rdPolPodDys, String n4thPolPodDys, String shprCntCd, String shprCustSeq, String shprNm, String cneeNm, String ntfyNm, String scNo, String rfaNo, String custTpCd, String agmtCustTpCd, String agmtCntCd, String agmtCustSeq, String agmtSgnOfcCd, String custKeyAgmtMgrFlg, String oftTpCd, String obrdDt, String cntrRcvDt, String srepCd, String revPolCd, String revPodCd, String bkgCgoWgt, String bkgWgtTpCd, String autoRatDt, String spclRcFlg, String spclDgCgoFlg, String spclBbCgoFlg, String spclAwkCgoFlg, String rdFlg, String socFlg, String revDirCd, String wrkVvdCd, String ctrtOfcCd, String ctrtSrepCd, String coaBatCd, String coaBatDt, String ctrtHqOfcCd, String ctrtRgnOfcCd, String cneeCntCd, String cneeCustSeq, String coaBatSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.bkgDelYdCd = bkgDelYdCd;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.cneeCustSeq = cneeCustSeq;
		this.cltOfcCd = cltOfcCd;
		this.n2ndPodCd = n2ndPodCd;
		this.actOfcCd = actOfcCd;
		this.cneeCntCd = cneeCntCd;
		this.pagerows = pagerows;
		this.ctrtHqOfcCd = ctrtHqOfcCd;
		this.n2ndTrdCd = n2ndTrdCd;
		this.bkgPodCd = bkgPodCd;
		this.ctrtOfcCd = ctrtOfcCd;
		this.slsOfcCd = slsOfcCd;
		this.spclDgCgoFlg = spclDgCgoFlg;
		this.updUsrId = updUsrId;
		this.bkgOfcCd = bkgOfcCd;
		this.rhqCd = rhqCd;
		this.vopCd = vopCd;
		this.shprCntCd = shprCntCd;
		this.skdVoyNo = skdVoyNo;
		this.n4thRlaneCd = n4thRlaneCd;
		this.ppdOfcCd = ppdOfcCd;
		this.bkgCgoWgt = bkgCgoWgt;
		this.bkgWgtTpCd = bkgWgtTpCd;
		this.bkgNo = bkgNo;
		this.n3rdRlaneCd = n3rdRlaneCd;
		this.spclBbCgoFlg = spclBbCgoFlg;
		this.n2ndIocContiCd = n2ndIocContiCd;
		this.ctrtSrepCd = ctrtSrepCd;
		this.revPolCd = revPolCd;
		this.n1stPolPodDys = n1stPolPodDys;
		this.coaBatCd = coaBatCd;
		this.cntrRcvDt = cntrRcvDt;
		this.n2ndPolPodDys = n2ndPolPodDys;
		this.n3rdIocContiCd = n3rdIocContiCd;
		this.bkgStsCd = bkgStsCd;
		this.agmtCustSeq = agmtCustSeq;
		this.rdFlg = rdFlg;
		this.n4thIocContiCd = n4thIocContiCd;
		this.cmdtCd = cmdtCd;
		this.n3rdPolCd = n3rdPolCd;
		this.fincDirCd = fincDirCd;
		this.revPodCd = revPodCd;
		this.dirCd = dirCd;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.wrkVvdCd = wrkVvdCd;
		this.rgnOfcCd = rgnOfcCd;
		this.n1stFincVvdCd = n1stFincVvdCd;
		this.agmtCustTpCd = agmtCustTpCd;
		this.n4thPolCd = n4thPolCd;
		this.ntfyNm = ntfyNm;
		this.autoRatDt = autoRatDt;
		this.n3rdPodCd = n3rdPodCd;
		this.cneeNm = cneeNm;
		this.slanCd = slanCd;
		this.n2ndPolCd = n2ndPolCd;
		this.agmtCntCd = agmtCntCd;
		this.shprCustSeq = shprCustSeq;
		this.repCmdtCd = repCmdtCd;
		this.vslCd = vslCd;
		this.n3rdFincVvdCd = n3rdFincVvdCd;
		this.coaBatSeq = coaBatSeq;
		this.n1stPolCd = n1stPolCd;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.blNo = blNo;
		this.srepCd = srepCd;
		this.n4thPodCd = n4thPodCd;
		this.blNoChk = blNoChk;
		this.n4thTrdCd = n4thTrdCd;
		this.scNo = scNo;
		this.blNoTp = blNoTp;
		this.n1stRlaneCd = n1stRlaneCd;
		this.n1stTrdCd = n1stTrdCd;
		this.n1stPodCd = n1stPodCd;
		this.bkgPorCd = bkgPorCd;
		this.n4thPolPodDys = n4thPolPodDys;
		this.creUsrId = creUsrId;
		this.custKeyAgmtMgrFlg = custKeyAgmtMgrFlg;
		this.usaBkgModCd = usaBkgModCd;
		this.agmtSgnOfcCd = agmtSgnOfcCd;
		this.spclRcFlg = spclRcFlg;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.n2ndRlaneCd = n2ndRlaneCd;
		this.n4thFincVvdCd = n4thFincVvdCd;
		this.coaBatDt = coaBatDt;
		this.rfaNo = rfaNo;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.bkgDelCd = bkgDelCd;
		this.revContiCd = revContiCd;
		this.n3rdPolPodDys = n3rdPolPodDys;
		this.n3rdTrdCd = n3rdTrdCd;
		this.shprNm = shprNm;
		this.custTpCd = custTpCd;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.bkgPolCd = bkgPolCd;
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
		this.n1stIocContiCd = n1stIocContiCd;
		this.obrdDt = obrdDt;
		this.socFlg = socFlg;
		this.oftTpCd = oftTpCd;
		this.n2ndFincVvdCd = n2ndFincVvdCd;
		this.bkgPorYdCd = bkgPorYdCd;
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bkg_del_yd_cd", getBkgDelYdCd());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("cnee_cust_seq", getCneeCustSeq());
		this.hashColumns.put("clt_ofc_cd", getCltOfcCd());
		this.hashColumns.put("n2nd_pod_cd", getN2ndPodCd());
		this.hashColumns.put("act_ofc_cd", getActOfcCd());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_hq_ofc_cd", getCtrtHqOfcCd());
		this.hashColumns.put("n2nd_trd_cd", getN2ndTrdCd());
		this.hashColumns.put("bkg_pod_cd", getBkgPodCd());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("spcl_dg_cgo_flg", getSpclDgCgoFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("vop_cd", getVopCd());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("n4th_rlane_cd", getN4thRlaneCd());
		this.hashColumns.put("ppd_ofc_cd", getPpdOfcCd());
		this.hashColumns.put("bkg_cgo_wgt", getBkgCgoWgt());
		this.hashColumns.put("bkg_wgt_tp_cd", getBkgWgtTpCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("n3rd_rlane_cd", getN3rdRlaneCd());
		this.hashColumns.put("spcl_bb_cgo_flg", getSpclBbCgoFlg());
		this.hashColumns.put("n2nd_ioc_conti_cd", getN2ndIocContiCd());
		this.hashColumns.put("ctrt_srep_cd", getCtrtSrepCd());
		this.hashColumns.put("rev_pol_cd", getRevPolCd());
		this.hashColumns.put("n1st_pol_pod_dys", getN1stPolPodDys());
		this.hashColumns.put("coa_bat_cd", getCoaBatCd());
		this.hashColumns.put("cntr_rcv_dt", getCntrRcvDt());
		this.hashColumns.put("n2nd_pol_pod_dys", getN2ndPolPodDys());
		this.hashColumns.put("n3rd_ioc_conti_cd", getN3rdIocContiCd());
		this.hashColumns.put("bkg_sts_cd", getBkgStsCd());
		this.hashColumns.put("agmt_cust_seq", getAgmtCustSeq());
		this.hashColumns.put("rd_flg", getRdFlg());
		this.hashColumns.put("n4th_ioc_conti_cd", getN4thIocContiCd());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("n3rd_pol_cd", getN3rdPolCd());
		this.hashColumns.put("finc_dir_cd", getFincDirCd());
		this.hashColumns.put("rev_pod_cd", getRevPodCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("wrk_vvd_cd", getWrkVvdCd());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("n1st_finc_vvd_cd", getN1stFincVvdCd());
		this.hashColumns.put("agmt_cust_tp_cd", getAgmtCustTpCd());
		this.hashColumns.put("n4th_pol_cd", getN4thPolCd());
		this.hashColumns.put("ntfy_nm", getNtfyNm());
		this.hashColumns.put("auto_rat_dt", getAutoRatDt());
		this.hashColumns.put("n3rd_pod_cd", getN3rdPodCd());
		this.hashColumns.put("cnee_nm", getCneeNm());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("n2nd_pol_cd", getN2ndPolCd());
		this.hashColumns.put("agmt_cnt_cd", getAgmtCntCd());
		this.hashColumns.put("shpr_cust_seq", getShprCustSeq());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("n3rd_finc_vvd_cd", getN3rdFincVvdCd());
		this.hashColumns.put("coa_bat_seq", getCoaBatSeq());
		this.hashColumns.put("n1st_pol_cd", getN1stPolCd());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("n4th_pod_cd", getN4thPodCd());
		this.hashColumns.put("bl_no_chk", getBlNoChk());
		this.hashColumns.put("n4th_trd_cd", getN4thTrdCd());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("bl_no_tp", getBlNoTp());
		this.hashColumns.put("n1st_rlane_cd", getN1stRlaneCd());
		this.hashColumns.put("n1st_trd_cd", getN1stTrdCd());
		this.hashColumns.put("n1st_pod_cd", getN1stPodCd());
		this.hashColumns.put("bkg_por_cd", getBkgPorCd());
		this.hashColumns.put("n4th_pol_pod_dys", getN4thPolPodDys());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cust_key_agmt_mgr_flg", getCustKeyAgmtMgrFlg());
		this.hashColumns.put("usa_bkg_mod_cd", getUsaBkgModCd());
		this.hashColumns.put("agmt_sgn_ofc_cd", getAgmtSgnOfcCd());
		this.hashColumns.put("spcl_rc_flg", getSpclRcFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("n2nd_rlane_cd", getN2ndRlaneCd());
		this.hashColumns.put("n4th_finc_vvd_cd", getN4thFincVvdCd());
		this.hashColumns.put("coa_bat_dt", getCoaBatDt());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_del_cd", getBkgDelCd());
		this.hashColumns.put("rev_conti_cd", getRevContiCd());
		this.hashColumns.put("n3rd_pol_pod_dys", getN3rdPolPodDys());
		this.hashColumns.put("n3rd_trd_cd", getN3rdTrdCd());
		this.hashColumns.put("shpr_nm", getShprNm());
		this.hashColumns.put("cust_tp_cd", getCustTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("bkg_pol_cd", getBkgPolCd());
		this.hashColumns.put("ctrt_rgn_ofc_cd", getCtrtRgnOfcCd());
		this.hashColumns.put("n1st_ioc_conti_cd", getN1stIocContiCd());
		this.hashColumns.put("obrd_dt", getObrdDt());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("oft_tp_cd", getOftTpCd());
		this.hashColumns.put("n2nd_finc_vvd_cd", getN2ndFincVvdCd());
		this.hashColumns.put("bkg_por_yd_cd", getBkgPorYdCd());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bkg_del_yd_cd", "bkgDelYdCd");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("cnee_cust_seq", "cneeCustSeq");
		this.hashFields.put("clt_ofc_cd", "cltOfcCd");
		this.hashFields.put("n2nd_pod_cd", "n2ndPodCd");
		this.hashFields.put("act_ofc_cd", "actOfcCd");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_hq_ofc_cd", "ctrtHqOfcCd");
		this.hashFields.put("n2nd_trd_cd", "n2ndTrdCd");
		this.hashFields.put("bkg_pod_cd", "bkgPodCd");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("spcl_dg_cgo_flg", "spclDgCgoFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("vop_cd", "vopCd");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("n4th_rlane_cd", "n4thRlaneCd");
		this.hashFields.put("ppd_ofc_cd", "ppdOfcCd");
		this.hashFields.put("bkg_cgo_wgt", "bkgCgoWgt");
		this.hashFields.put("bkg_wgt_tp_cd", "bkgWgtTpCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("n3rd_rlane_cd", "n3rdRlaneCd");
		this.hashFields.put("spcl_bb_cgo_flg", "spclBbCgoFlg");
		this.hashFields.put("n2nd_ioc_conti_cd", "n2ndIocContiCd");
		this.hashFields.put("ctrt_srep_cd", "ctrtSrepCd");
		this.hashFields.put("rev_pol_cd", "revPolCd");
		this.hashFields.put("n1st_pol_pod_dys", "n1stPolPodDys");
		this.hashFields.put("coa_bat_cd", "coaBatCd");
		this.hashFields.put("cntr_rcv_dt", "cntrRcvDt");
		this.hashFields.put("n2nd_pol_pod_dys", "n2ndPolPodDys");
		this.hashFields.put("n3rd_ioc_conti_cd", "n3rdIocContiCd");
		this.hashFields.put("bkg_sts_cd", "bkgStsCd");
		this.hashFields.put("agmt_cust_seq", "agmtCustSeq");
		this.hashFields.put("rd_flg", "rdFlg");
		this.hashFields.put("n4th_ioc_conti_cd", "n4thIocContiCd");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("n3rd_pol_cd", "n3rdPolCd");
		this.hashFields.put("finc_dir_cd", "fincDirCd");
		this.hashFields.put("rev_pod_cd", "revPodCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("wrk_vvd_cd", "wrkVvdCd");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("n1st_finc_vvd_cd", "n1stFincVvdCd");
		this.hashFields.put("agmt_cust_tp_cd", "agmtCustTpCd");
		this.hashFields.put("n4th_pol_cd", "n4thPolCd");
		this.hashFields.put("ntfy_nm", "ntfyNm");
		this.hashFields.put("auto_rat_dt", "autoRatDt");
		this.hashFields.put("n3rd_pod_cd", "n3rdPodCd");
		this.hashFields.put("cnee_nm", "cneeNm");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("n2nd_pol_cd", "n2ndPolCd");
		this.hashFields.put("agmt_cnt_cd", "agmtCntCd");
		this.hashFields.put("shpr_cust_seq", "shprCustSeq");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("n3rd_finc_vvd_cd", "n3rdFincVvdCd");
		this.hashFields.put("coa_bat_seq", "coaBatSeq");
		this.hashFields.put("n1st_pol_cd", "n1stPolCd");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("n4th_pod_cd", "n4thPodCd");
		this.hashFields.put("bl_no_chk", "blNoChk");
		this.hashFields.put("n4th_trd_cd", "n4thTrdCd");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("bl_no_tp", "blNoTp");
		this.hashFields.put("n1st_rlane_cd", "n1stRlaneCd");
		this.hashFields.put("n1st_trd_cd", "n1stTrdCd");
		this.hashFields.put("n1st_pod_cd", "n1stPodCd");
		this.hashFields.put("bkg_por_cd", "bkgPorCd");
		this.hashFields.put("n4th_pol_pod_dys", "n4thPolPodDys");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cust_key_agmt_mgr_flg", "custKeyAgmtMgrFlg");
		this.hashFields.put("usa_bkg_mod_cd", "usaBkgModCd");
		this.hashFields.put("agmt_sgn_ofc_cd", "agmtSgnOfcCd");
		this.hashFields.put("spcl_rc_flg", "spclRcFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("n2nd_rlane_cd", "n2ndRlaneCd");
		this.hashFields.put("n4th_finc_vvd_cd", "n4thFincVvdCd");
		this.hashFields.put("coa_bat_dt", "coaBatDt");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_del_cd", "bkgDelCd");
		this.hashFields.put("rev_conti_cd", "revContiCd");
		this.hashFields.put("n3rd_pol_pod_dys", "n3rdPolPodDys");
		this.hashFields.put("n3rd_trd_cd", "n3rdTrdCd");
		this.hashFields.put("shpr_nm", "shprNm");
		this.hashFields.put("cust_tp_cd", "custTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("bkg_pol_cd", "bkgPolCd");
		this.hashFields.put("ctrt_rgn_ofc_cd", "ctrtRgnOfcCd");
		this.hashFields.put("n1st_ioc_conti_cd", "n1stIocContiCd");
		this.hashFields.put("obrd_dt", "obrdDt");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("oft_tp_cd", "oftTpCd");
		this.hashFields.put("n2nd_finc_vvd_cd", "n2ndFincVvdCd");
		this.hashFields.put("bkg_por_yd_cd", "bkgPorYdCd");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return bkgDelYdCd
	 */
	public String getBkgDelYdCd() {
		return this.bkgDelYdCd;
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
	 * @return cneeCustSeq
	 */
	public String getCneeCustSeq() {
		return this.cneeCustSeq;
	}
	
	/**
	 * Column Info
	 * @return cltOfcCd
	 */
	public String getCltOfcCd() {
		return this.cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodCd
	 */
	public String getN2ndPodCd() {
		return this.n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @return actOfcCd
	 */
	public String getActOfcCd() {
		return this.actOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cneeCntCd
	 */
	public String getCneeCntCd() {
		return this.cneeCntCd;
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
	 * @return ctrtHqOfcCd
	 */
	public String getCtrtHqOfcCd() {
		return this.ctrtHqOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndTrdCd
	 */
	public String getN2ndTrdCd() {
		return this.n2ndTrdCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPodCd
	 */
	public String getBkgPodCd() {
		return this.bkgPodCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtOfcCd
	 */
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return spclDgCgoFlg
	 */
	public String getSpclDgCgoFlg() {
		return this.spclDgCgoFlg;
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
	 * @return bkgOfcCd
	 */
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return vopCd
	 */
	public String getVopCd() {
		return this.vopCd;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
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
	 * @return n4thRlaneCd
	 */
	public String getN4thRlaneCd() {
		return this.n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return ppdOfcCd
	 */
	public String getPpdOfcCd() {
		return this.ppdOfcCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCgoWgt
	 */
	public String getBkgCgoWgt() {
		return this.bkgCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return bkgWgtTpCd
	 */
	public String getBkgWgtTpCd() {
		return this.bkgWgtTpCd;
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
	 * @return n3rdRlaneCd
	 */
	public String getN3rdRlaneCd() {
		return this.n3rdRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return spclBbCgoFlg
	 */
	public String getSpclBbCgoFlg() {
		return this.spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return n2ndIocContiCd
	 */
	public String getN2ndIocContiCd() {
		return this.n2ndIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtSrepCd
	 */
	public String getCtrtSrepCd() {
		return this.ctrtSrepCd;
	}
	
	/**
	 * Column Info
	 * @return revPolCd
	 */
	public String getRevPolCd() {
		return this.revPolCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPolPodDys
	 */
	public String getN1stPolPodDys() {
		return this.n1stPolPodDys;
	}
	
	/**
	 * Column Info
	 * @return coaBatCd
	 */
	public String getCoaBatCd() {
		return this.coaBatCd;
	}
	
	/**
	 * Column Info
	 * @return cntrRcvDt
	 */
	public String getCntrRcvDt() {
		return this.cntrRcvDt;
	}
	
	/**
	 * Column Info
	 * @return n2ndPolPodDys
	 */
	public String getN2ndPolPodDys() {
		return this.n2ndPolPodDys;
	}
	
	/**
	 * Column Info
	 * @return n3rdIocContiCd
	 */
	public String getN3rdIocContiCd() {
		return this.n3rdIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return bkgStsCd
	 */
	public String getBkgStsCd() {
		return this.bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @return agmtCustSeq
	 */
	public String getAgmtCustSeq() {
		return this.agmtCustSeq;
	}
	
	/**
	 * Column Info
	 * @return rdFlg
	 */
	public String getRdFlg() {
		return this.rdFlg;
	}
	
	/**
	 * Column Info
	 * @return n4thIocContiCd
	 */
	public String getN4thIocContiCd() {
		return this.n4thIocContiCd;
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
	 * @return n3rdPolCd
	 */
	public String getN3rdPolCd() {
		return this.n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @return fincDirCd
	 */
	public String getFincDirCd() {
		return this.fincDirCd;
	}
	
	/**
	 * Column Info
	 * @return revPodCd
	 */
	public String getRevPodCd() {
		return this.revPodCd;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return spclAwkCgoFlg
	 */
	public String getSpclAwkCgoFlg() {
		return this.spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return wrkVvdCd
	 */
	public String getWrkVvdCd() {
		return this.wrkVvdCd;
	}
	
	/**
	 * Column Info
	 * @return rgnOfcCd
	 */
	public String getRgnOfcCd() {
		return this.rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n1stFincVvdCd
	 */
	public String getN1stFincVvdCd() {
		return this.n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return agmtCustTpCd
	 */
	public String getAgmtCustTpCd() {
		return this.agmtCustTpCd;
	}
	
	/**
	 * Column Info
	 * @return n4thPolCd
	 */
	public String getN4thPolCd() {
		return this.n4thPolCd;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm
	 */
	public String getNtfyNm() {
		return this.ntfyNm;
	}
	
	/**
	 * Column Info
	 * @return autoRatDt
	 */
	public String getAutoRatDt() {
		return this.autoRatDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodCd
	 */
	public String getN3rdPodCd() {
		return this.n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @return cneeNm
	 */
	public String getCneeNm() {
		return this.cneeNm;
	}
	
	/**
	 * Column Info
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPolCd
	 */
	public String getN2ndPolCd() {
		return this.n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @return agmtCntCd
	 */
	public String getAgmtCntCd() {
		return this.agmtCntCd;
	}
	
	/**
	 * Column Info
	 * @return shprCustSeq
	 */
	public String getShprCustSeq() {
		return this.shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @return repCmdtCd
	 */
	public String getRepCmdtCd() {
		return this.repCmdtCd;
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
	 * @return n3rdFincVvdCd
	 */
	public String getN3rdFincVvdCd() {
		return this.n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return coaBatSeq
	 */
	public String getCoaBatSeq() {
		return this.coaBatSeq;
	}
	
	/**
	 * Column Info
	 * @return n1stPolCd
	 */
	public String getN1stPolCd() {
		return this.n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
	}
	
	/**
	 * Column Info
	 * @return n4thPodCd
	 */
	public String getN4thPodCd() {
		return this.n4thPodCd;
	}
	
	/**
	 * Column Info
	 * @return blNoChk
	 */
	public String getBlNoChk() {
		return this.blNoChk;
	}
	
	/**
	 * Column Info
	 * @return n4thTrdCd
	 */
	public String getN4thTrdCd() {
		return this.n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return blNoTp
	 */
	public String getBlNoTp() {
		return this.blNoTp;
	}
	
	/**
	 * Column Info
	 * @return n1stRlaneCd
	 */
	public String getN1stRlaneCd() {
		return this.n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return n1stTrdCd
	 */
	public String getN1stTrdCd() {
		return this.n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPodCd
	 */
	public String getN1stPodCd() {
		return this.n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPorCd
	 */
	public String getBkgPorCd() {
		return this.bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @return n4thPolPodDys
	 */
	public String getN4thPolPodDys() {
		return this.n4thPolPodDys;
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
	 * @return custKeyAgmtMgrFlg
	 */
	public String getCustKeyAgmtMgrFlg() {
		return this.custKeyAgmtMgrFlg;
	}
	
	/**
	 * Column Info
	 * @return usaBkgModCd
	 */
	public String getUsaBkgModCd() {
		return this.usaBkgModCd;
	}
	
	/**
	 * Column Info
	 * @return agmtSgnOfcCd
	 */
	public String getAgmtSgnOfcCd() {
		return this.agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return spclRcFlg
	 */
	public String getSpclRcFlg() {
		return this.spclRcFlg;
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
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndRlaneCd
	 */
	public String getN2ndRlaneCd() {
		return this.n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return n4thFincVvdCd
	 */
	public String getN4thFincVvdCd() {
		return this.n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return coaBatDt
	 */
	public String getCoaBatDt() {
		return this.coaBatDt;
	}
	
	/**
	 * Column Info
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
	}
	
	/**
	 * Column Info
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return bkgDelCd
	 */
	public String getBkgDelCd() {
		return this.bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @return revContiCd
	 */
	public String getRevContiCd() {
		return this.revContiCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolPodDys
	 */
	public String getN3rdPolPodDys() {
		return this.n3rdPolPodDys;
	}
	
	/**
	 * Column Info
	 * @return n3rdTrdCd
	 */
	public String getN3rdTrdCd() {
		return this.n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @return shprNm
	 */
	public String getShprNm() {
		return this.shprNm;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPolCd
	 */
	public String getBkgPolCd() {
		return this.bkgPolCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtRgnOfcCd
	 */
	public String getCtrtRgnOfcCd() {
		return this.ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n1stIocContiCd
	 */
	public String getN1stIocContiCd() {
		return this.n1stIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return obrdDt
	 */
	public String getObrdDt() {
		return this.obrdDt;
	}
	
	/**
	 * Column Info
	 * @return socFlg
	 */
	public String getSocFlg() {
		return this.socFlg;
	}
	
	/**
	 * Column Info
	 * @return oftTpCd
	 */
	public String getOftTpCd() {
		return this.oftTpCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndFincVvdCd
	 */
	public String getN2ndFincVvdCd() {
		return this.n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPorYdCd
	 */
	public String getBkgPorYdCd() {
		return this.bkgPorYdCd;
	}
	
	/**
	 * Column Info
	 * @return bkgDeTermCd
	 */
	public String getBkgDeTermCd() {
		return this.bkgDeTermCd;
	}
	

	/**
	 * Column Info
	 * @param bkgDelYdCd
	 */
	public void setBkgDelYdCd(String bkgDelYdCd) {
		this.bkgDelYdCd = bkgDelYdCd;
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
	 * @param cneeCustSeq
	 */
	public void setCneeCustSeq(String cneeCustSeq) {
		this.cneeCustSeq = cneeCustSeq;
	}
	
	/**
	 * Column Info
	 * @param cltOfcCd
	 */
	public void setCltOfcCd(String cltOfcCd) {
		this.cltOfcCd = cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodCd
	 */
	public void setN2ndPodCd(String n2ndPodCd) {
		this.n2ndPodCd = n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @param actOfcCd
	 */
	public void setActOfcCd(String actOfcCd) {
		this.actOfcCd = actOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cneeCntCd
	 */
	public void setCneeCntCd(String cneeCntCd) {
		this.cneeCntCd = cneeCntCd;
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
	 * @param ctrtHqOfcCd
	 */
	public void setCtrtHqOfcCd(String ctrtHqOfcCd) {
		this.ctrtHqOfcCd = ctrtHqOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndTrdCd
	 */
	public void setN2ndTrdCd(String n2ndTrdCd) {
		this.n2ndTrdCd = n2ndTrdCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPodCd
	 */
	public void setBkgPodCd(String bkgPodCd) {
		this.bkgPodCd = bkgPodCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtOfcCd
	 */
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param spclDgCgoFlg
	 */
	public void setSpclDgCgoFlg(String spclDgCgoFlg) {
		this.spclDgCgoFlg = spclDgCgoFlg;
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
	 * @param bkgOfcCd
	 */
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param vopCd
	 */
	public void setVopCd(String vopCd) {
		this.vopCd = vopCd;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
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
	 * @param n4thRlaneCd
	 */
	public void setN4thRlaneCd(String n4thRlaneCd) {
		this.n4thRlaneCd = n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param ppdOfcCd
	 */
	public void setPpdOfcCd(String ppdOfcCd) {
		this.ppdOfcCd = ppdOfcCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCgoWgt
	 */
	public void setBkgCgoWgt(String bkgCgoWgt) {
		this.bkgCgoWgt = bkgCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param bkgWgtTpCd
	 */
	public void setBkgWgtTpCd(String bkgWgtTpCd) {
		this.bkgWgtTpCd = bkgWgtTpCd;
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
	 * @param n3rdRlaneCd
	 */
	public void setN3rdRlaneCd(String n3rdRlaneCd) {
		this.n3rdRlaneCd = n3rdRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param spclBbCgoFlg
	 */
	public void setSpclBbCgoFlg(String spclBbCgoFlg) {
		this.spclBbCgoFlg = spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param n2ndIocContiCd
	 */
	public void setN2ndIocContiCd(String n2ndIocContiCd) {
		this.n2ndIocContiCd = n2ndIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtSrepCd
	 */
	public void setCtrtSrepCd(String ctrtSrepCd) {
		this.ctrtSrepCd = ctrtSrepCd;
	}
	
	/**
	 * Column Info
	 * @param revPolCd
	 */
	public void setRevPolCd(String revPolCd) {
		this.revPolCd = revPolCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPolPodDys
	 */
	public void setN1stPolPodDys(String n1stPolPodDys) {
		this.n1stPolPodDys = n1stPolPodDys;
	}
	
	/**
	 * Column Info
	 * @param coaBatCd
	 */
	public void setCoaBatCd(String coaBatCd) {
		this.coaBatCd = coaBatCd;
	}
	
	/**
	 * Column Info
	 * @param cntrRcvDt
	 */
	public void setCntrRcvDt(String cntrRcvDt) {
		this.cntrRcvDt = cntrRcvDt;
	}
	
	/**
	 * Column Info
	 * @param n2ndPolPodDys
	 */
	public void setN2ndPolPodDys(String n2ndPolPodDys) {
		this.n2ndPolPodDys = n2ndPolPodDys;
	}
	
	/**
	 * Column Info
	 * @param n3rdIocContiCd
	 */
	public void setN3rdIocContiCd(String n3rdIocContiCd) {
		this.n3rdIocContiCd = n3rdIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param bkgStsCd
	 */
	public void setBkgStsCd(String bkgStsCd) {
		this.bkgStsCd = bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @param agmtCustSeq
	 */
	public void setAgmtCustSeq(String agmtCustSeq) {
		this.agmtCustSeq = agmtCustSeq;
	}
	
	/**
	 * Column Info
	 * @param rdFlg
	 */
	public void setRdFlg(String rdFlg) {
		this.rdFlg = rdFlg;
	}
	
	/**
	 * Column Info
	 * @param n4thIocContiCd
	 */
	public void setN4thIocContiCd(String n4thIocContiCd) {
		this.n4thIocContiCd = n4thIocContiCd;
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
	 * @param n3rdPolCd
	 */
	public void setN3rdPolCd(String n3rdPolCd) {
		this.n3rdPolCd = n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @param fincDirCd
	 */
	public void setFincDirCd(String fincDirCd) {
		this.fincDirCd = fincDirCd;
	}
	
	/**
	 * Column Info
	 * @param revPodCd
	 */
	public void setRevPodCd(String revPodCd) {
		this.revPodCd = revPodCd;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param spclAwkCgoFlg
	 */
	public void setSpclAwkCgoFlg(String spclAwkCgoFlg) {
		this.spclAwkCgoFlg = spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param wrkVvdCd
	 */
	public void setWrkVvdCd(String wrkVvdCd) {
		this.wrkVvdCd = wrkVvdCd;
	}
	
	/**
	 * Column Info
	 * @param rgnOfcCd
	 */
	public void setRgnOfcCd(String rgnOfcCd) {
		this.rgnOfcCd = rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n1stFincVvdCd
	 */
	public void setN1stFincVvdCd(String n1stFincVvdCd) {
		this.n1stFincVvdCd = n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param agmtCustTpCd
	 */
	public void setAgmtCustTpCd(String agmtCustTpCd) {
		this.agmtCustTpCd = agmtCustTpCd;
	}
	
	/**
	 * Column Info
	 * @param n4thPolCd
	 */
	public void setN4thPolCd(String n4thPolCd) {
		this.n4thPolCd = n4thPolCd;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm
	 */
	public void setNtfyNm(String ntfyNm) {
		this.ntfyNm = ntfyNm;
	}
	
	/**
	 * Column Info
	 * @param autoRatDt
	 */
	public void setAutoRatDt(String autoRatDt) {
		this.autoRatDt = autoRatDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodCd
	 */
	public void setN3rdPodCd(String n3rdPodCd) {
		this.n3rdPodCd = n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @param cneeNm
	 */
	public void setCneeNm(String cneeNm) {
		this.cneeNm = cneeNm;
	}
	
	/**
	 * Column Info
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPolCd
	 */
	public void setN2ndPolCd(String n2ndPolCd) {
		this.n2ndPolCd = n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @param agmtCntCd
	 */
	public void setAgmtCntCd(String agmtCntCd) {
		this.agmtCntCd = agmtCntCd;
	}
	
	/**
	 * Column Info
	 * @param shprCustSeq
	 */
	public void setShprCustSeq(String shprCustSeq) {
		this.shprCustSeq = shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @param repCmdtCd
	 */
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
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
	 * @param n3rdFincVvdCd
	 */
	public void setN3rdFincVvdCd(String n3rdFincVvdCd) {
		this.n3rdFincVvdCd = n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param coaBatSeq
	 */
	public void setCoaBatSeq(String coaBatSeq) {
		this.coaBatSeq = coaBatSeq;
	}
	
	/**
	 * Column Info
	 * @param n1stPolCd
	 */
	public void setN1stPolCd(String n1stPolCd) {
		this.n1stPolCd = n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
	}
	
	/**
	 * Column Info
	 * @param n4thPodCd
	 */
	public void setN4thPodCd(String n4thPodCd) {
		this.n4thPodCd = n4thPodCd;
	}
	
	/**
	 * Column Info
	 * @param blNoChk
	 */
	public void setBlNoChk(String blNoChk) {
		this.blNoChk = blNoChk;
	}
	
	/**
	 * Column Info
	 * @param n4thTrdCd
	 */
	public void setN4thTrdCd(String n4thTrdCd) {
		this.n4thTrdCd = n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param blNoTp
	 */
	public void setBlNoTp(String blNoTp) {
		this.blNoTp = blNoTp;
	}
	
	/**
	 * Column Info
	 * @param n1stRlaneCd
	 */
	public void setN1stRlaneCd(String n1stRlaneCd) {
		this.n1stRlaneCd = n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param n1stTrdCd
	 */
	public void setN1stTrdCd(String n1stTrdCd) {
		this.n1stTrdCd = n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPodCd
	 */
	public void setN1stPodCd(String n1stPodCd) {
		this.n1stPodCd = n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPorCd
	 */
	public void setBkgPorCd(String bkgPorCd) {
		this.bkgPorCd = bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @param n4thPolPodDys
	 */
	public void setN4thPolPodDys(String n4thPolPodDys) {
		this.n4thPolPodDys = n4thPolPodDys;
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
	 * @param custKeyAgmtMgrFlg
	 */
	public void setCustKeyAgmtMgrFlg(String custKeyAgmtMgrFlg) {
		this.custKeyAgmtMgrFlg = custKeyAgmtMgrFlg;
	}
	
	/**
	 * Column Info
	 * @param usaBkgModCd
	 */
	public void setUsaBkgModCd(String usaBkgModCd) {
		this.usaBkgModCd = usaBkgModCd;
	}
	
	/**
	 * Column Info
	 * @param agmtSgnOfcCd
	 */
	public void setAgmtSgnOfcCd(String agmtSgnOfcCd) {
		this.agmtSgnOfcCd = agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param spclRcFlg
	 */
	public void setSpclRcFlg(String spclRcFlg) {
		this.spclRcFlg = spclRcFlg;
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
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndRlaneCd
	 */
	public void setN2ndRlaneCd(String n2ndRlaneCd) {
		this.n2ndRlaneCd = n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param n4thFincVvdCd
	 */
	public void setN4thFincVvdCd(String n4thFincVvdCd) {
		this.n4thFincVvdCd = n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param coaBatDt
	 */
	public void setCoaBatDt(String coaBatDt) {
		this.coaBatDt = coaBatDt;
	}
	
	/**
	 * Column Info
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
	}
	
	/**
	 * Column Info
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param bkgDelCd
	 */
	public void setBkgDelCd(String bkgDelCd) {
		this.bkgDelCd = bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @param revContiCd
	 */
	public void setRevContiCd(String revContiCd) {
		this.revContiCd = revContiCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolPodDys
	 */
	public void setN3rdPolPodDys(String n3rdPolPodDys) {
		this.n3rdPolPodDys = n3rdPolPodDys;
	}
	
	/**
	 * Column Info
	 * @param n3rdTrdCd
	 */
	public void setN3rdTrdCd(String n3rdTrdCd) {
		this.n3rdTrdCd = n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @param shprNm
	 */
	public void setShprNm(String shprNm) {
		this.shprNm = shprNm;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPolCd
	 */
	public void setBkgPolCd(String bkgPolCd) {
		this.bkgPolCd = bkgPolCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtRgnOfcCd
	 */
	public void setCtrtRgnOfcCd(String ctrtRgnOfcCd) {
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n1stIocContiCd
	 */
	public void setN1stIocContiCd(String n1stIocContiCd) {
		this.n1stIocContiCd = n1stIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param obrdDt
	 */
	public void setObrdDt(String obrdDt) {
		this.obrdDt = obrdDt;
	}
	
	/**
	 * Column Info
	 * @param socFlg
	 */
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
	}
	
	/**
	 * Column Info
	 * @param oftTpCd
	 */
	public void setOftTpCd(String oftTpCd) {
		this.oftTpCd = oftTpCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndFincVvdCd
	 */
	public void setN2ndFincVvdCd(String n2ndFincVvdCd) {
		this.n2ndFincVvdCd = n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPorYdCd
	 */
	public void setBkgPorYdCd(String bkgPorYdCd) {
		this.bkgPorYdCd = bkgPorYdCd;
	}
	
	/**
	 * Column Info
	 * @param bkgDeTermCd
	 */
	public void setBkgDeTermCd(String bkgDeTermCd) {
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBkgDelYdCd(JSPUtil.getParameter(request, "bkg_del_yd_cd", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
		setCneeCustSeq(JSPUtil.getParameter(request, "cnee_cust_seq", ""));
		setCltOfcCd(JSPUtil.getParameter(request, "clt_ofc_cd", ""));
		setN2ndPodCd(JSPUtil.getParameter(request, "n2nd_pod_cd", ""));
		setActOfcCd(JSPUtil.getParameter(request, "act_ofc_cd", ""));
		setCneeCntCd(JSPUtil.getParameter(request, "cnee_cnt_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtHqOfcCd(JSPUtil.getParameter(request, "ctrt_hq_ofc_cd", ""));
		setN2ndTrdCd(JSPUtil.getParameter(request, "n2nd_trd_cd", ""));
		setBkgPodCd(JSPUtil.getParameter(request, "bkg_pod_cd", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setSpclDgCgoFlg(JSPUtil.getParameter(request, "spcl_dg_cgo_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setVopCd(JSPUtil.getParameter(request, "vop_cd", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setN4thRlaneCd(JSPUtil.getParameter(request, "n4th_rlane_cd", ""));
		setPpdOfcCd(JSPUtil.getParameter(request, "ppd_ofc_cd", ""));
		setBkgCgoWgt(JSPUtil.getParameter(request, "bkg_cgo_wgt", ""));
		setBkgWgtTpCd(JSPUtil.getParameter(request, "bkg_wgt_tp_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setN3rdRlaneCd(JSPUtil.getParameter(request, "n3rd_rlane_cd", ""));
		setSpclBbCgoFlg(JSPUtil.getParameter(request, "spcl_bb_cgo_flg", ""));
		setN2ndIocContiCd(JSPUtil.getParameter(request, "n2nd_ioc_conti_cd", ""));
		setCtrtSrepCd(JSPUtil.getParameter(request, "ctrt_srep_cd", ""));
		setRevPolCd(JSPUtil.getParameter(request, "rev_pol_cd", ""));
		setN1stPolPodDys(JSPUtil.getParameter(request, "n1st_pol_pod_dys", ""));
		setCoaBatCd(JSPUtil.getParameter(request, "coa_bat_cd", ""));
		setCntrRcvDt(JSPUtil.getParameter(request, "cntr_rcv_dt", ""));
		setN2ndPolPodDys(JSPUtil.getParameter(request, "n2nd_pol_pod_dys", ""));
		setN3rdIocContiCd(JSPUtil.getParameter(request, "n3rd_ioc_conti_cd", ""));
		setBkgStsCd(JSPUtil.getParameter(request, "bkg_sts_cd", ""));
		setAgmtCustSeq(JSPUtil.getParameter(request, "agmt_cust_seq", ""));
		setRdFlg(JSPUtil.getParameter(request, "rd_flg", ""));
		setN4thIocContiCd(JSPUtil.getParameter(request, "n4th_ioc_conti_cd", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setN3rdPolCd(JSPUtil.getParameter(request, "n3rd_pol_cd", ""));
		setFincDirCd(JSPUtil.getParameter(request, "finc_dir_cd", ""));
		setRevPodCd(JSPUtil.getParameter(request, "rev_pod_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setWrkVvdCd(JSPUtil.getParameter(request, "wrk_vvd_cd", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
		setN1stFincVvdCd(JSPUtil.getParameter(request, "n1st_finc_vvd_cd", ""));
		setAgmtCustTpCd(JSPUtil.getParameter(request, "agmt_cust_tp_cd", ""));
		setN4thPolCd(JSPUtil.getParameter(request, "n4th_pol_cd", ""));
		setNtfyNm(JSPUtil.getParameter(request, "ntfy_nm", ""));
		setAutoRatDt(JSPUtil.getParameter(request, "auto_rat_dt", ""));
		setN3rdPodCd(JSPUtil.getParameter(request, "n3rd_pod_cd", ""));
		setCneeNm(JSPUtil.getParameter(request, "cnee_nm", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setN2ndPolCd(JSPUtil.getParameter(request, "n2nd_pol_cd", ""));
		setAgmtCntCd(JSPUtil.getParameter(request, "agmt_cnt_cd", ""));
		setShprCustSeq(JSPUtil.getParameter(request, "shpr_cust_seq", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setN3rdFincVvdCd(JSPUtil.getParameter(request, "n3rd_finc_vvd_cd", ""));
		setCoaBatSeq(JSPUtil.getParameter(request, "coa_bat_seq", ""));
		setN1stPolCd(JSPUtil.getParameter(request, "n1st_pol_cd", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setSrepCd(JSPUtil.getParameter(request, "srep_cd", ""));
		setN4thPodCd(JSPUtil.getParameter(request, "n4th_pod_cd", ""));
		setBlNoChk(JSPUtil.getParameter(request, "bl_no_chk", ""));
		setN4thTrdCd(JSPUtil.getParameter(request, "n4th_trd_cd", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
		setN1stRlaneCd(JSPUtil.getParameter(request, "n1st_rlane_cd", ""));
		setN1stTrdCd(JSPUtil.getParameter(request, "n1st_trd_cd", ""));
		setN1stPodCd(JSPUtil.getParameter(request, "n1st_pod_cd", ""));
		setBkgPorCd(JSPUtil.getParameter(request, "bkg_por_cd", ""));
		setN4thPolPodDys(JSPUtil.getParameter(request, "n4th_pol_pod_dys", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCustKeyAgmtMgrFlg(JSPUtil.getParameter(request, "cust_key_agmt_mgr_flg", ""));
		setUsaBkgModCd(JSPUtil.getParameter(request, "usa_bkg_mod_cd", ""));
		setAgmtSgnOfcCd(JSPUtil.getParameter(request, "agmt_sgn_ofc_cd", ""));
		setSpclRcFlg(JSPUtil.getParameter(request, "spcl_rc_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setN2ndRlaneCd(JSPUtil.getParameter(request, "n2nd_rlane_cd", ""));
		setN4thFincVvdCd(JSPUtil.getParameter(request, "n4th_finc_vvd_cd", ""));
		setCoaBatDt(JSPUtil.getParameter(request, "coa_bat_dt", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgDelCd(JSPUtil.getParameter(request, "bkg_del_cd", ""));
		setRevContiCd(JSPUtil.getParameter(request, "rev_conti_cd", ""));
		setN3rdPolPodDys(JSPUtil.getParameter(request, "n3rd_pol_pod_dys", ""));
		setN3rdTrdCd(JSPUtil.getParameter(request, "n3rd_trd_cd", ""));
		setShprNm(JSPUtil.getParameter(request, "shpr_nm", ""));
		setCustTpCd(JSPUtil.getParameter(request, "cust_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setBkgPolCd(JSPUtil.getParameter(request, "bkg_pol_cd", ""));
		setCtrtRgnOfcCd(JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd", ""));
		setN1stIocContiCd(JSPUtil.getParameter(request, "n1st_ioc_conti_cd", ""));
		setObrdDt(JSPUtil.getParameter(request, "obrd_dt", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setOftTpCd(JSPUtil.getParameter(request, "oft_tp_cd", ""));
		setN2ndFincVvdCd(JSPUtil.getParameter(request, "n2nd_finc_vvd_cd", ""));
		setBkgPorYdCd(JSPUtil.getParameter(request, "bkg_por_yd_cd", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaRgstBkgVO[]
	 */
	public CoaRgstBkgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaRgstBkgVO[]
	 */
	public CoaRgstBkgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaRgstBkgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgDelYdCd = (JSPUtil.getParameter(request, prefix	+ "bkg_del_yd_cd", length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] cneeCustSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_cust_seq", length));
			String[] cltOfcCd = (JSPUtil.getParameter(request, prefix	+ "clt_ofc_cd", length));
			String[] n2ndPodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_cd", length));
			String[] actOfcCd = (JSPUtil.getParameter(request, prefix	+ "act_ofc_cd", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ctrtHqOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_hq_ofc_cd", length));
			String[] n2ndTrdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_trd_cd", length));
			String[] bkgPodCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pod_cd", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] spclDgCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_dg_cgo_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] vopCd = (JSPUtil.getParameter(request, prefix	+ "vop_cd", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] n4thRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n4th_rlane_cd", length));
			String[] ppdOfcCd = (JSPUtil.getParameter(request, prefix	+ "ppd_ofc_cd", length));
			String[] bkgCgoWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_wgt", length));
			String[] bkgWgtTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt_tp_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] n3rdRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_rlane_cd", length));
			String[] spclBbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bb_cgo_flg", length));
			String[] n2ndIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_ioc_conti_cd", length));
			String[] ctrtSrepCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_srep_cd", length));
			String[] revPolCd = (JSPUtil.getParameter(request, prefix	+ "rev_pol_cd", length));
			String[] n1stPolPodDys = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_pod_dys", length));
			String[] coaBatCd = (JSPUtil.getParameter(request, prefix	+ "coa_bat_cd", length));
			String[] cntrRcvDt = (JSPUtil.getParameter(request, prefix	+ "cntr_rcv_dt", length));
			String[] n2ndPolPodDys = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_pod_dys", length));
			String[] n3rdIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_ioc_conti_cd", length));
			String[] bkgStsCd = (JSPUtil.getParameter(request, prefix	+ "bkg_sts_cd", length));
			String[] agmtCustSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_cust_seq", length));
			String[] rdFlg = (JSPUtil.getParameter(request, prefix	+ "rd_flg", length));
			String[] n4thIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n4th_ioc_conti_cd", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] n3rdPolCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_cd", length));
			String[] fincDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_dir_cd", length));
			String[] revPodCd = (JSPUtil.getParameter(request, prefix	+ "rev_pod_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] wrkVvdCd = (JSPUtil.getParameter(request, prefix	+ "wrk_vvd_cd", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] n1stFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_finc_vvd_cd", length));
			String[] agmtCustTpCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cust_tp_cd", length));
			String[] n4thPolCd = (JSPUtil.getParameter(request, prefix	+ "n4th_pol_cd", length));
			String[] ntfyNm = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm", length));
			String[] autoRatDt = (JSPUtil.getParameter(request, prefix	+ "auto_rat_dt", length));
			String[] n3rdPodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_cd", length));
			String[] cneeNm = (JSPUtil.getParameter(request, prefix	+ "cnee_nm", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] n2ndPolCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_cd", length));
			String[] agmtCntCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cnt_cd", length));
			String[] shprCustSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cust_seq", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] n3rdFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_finc_vvd_cd", length));
			String[] coaBatSeq = (JSPUtil.getParameter(request, prefix	+ "coa_bat_seq", length));
			String[] n1stPolCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_cd", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] srepCd = (JSPUtil.getParameter(request, prefix	+ "srep_cd", length));
			String[] n4thPodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_pod_cd", length));
			String[] blNoChk = (JSPUtil.getParameter(request, prefix	+ "bl_no_chk", length));
			String[] n4thTrdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_trd_cd", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] blNoTp = (JSPUtil.getParameter(request, prefix	+ "bl_no_tp", length));
			String[] n1stRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n1st_rlane_cd", length));
			String[] n1stTrdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_trd_cd", length));
			String[] n1stPodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_cd", length));
			String[] bkgPorCd = (JSPUtil.getParameter(request, prefix	+ "bkg_por_cd", length));
			String[] n4thPolPodDys = (JSPUtil.getParameter(request, prefix	+ "n4th_pol_pod_dys", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] custKeyAgmtMgrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_key_agmt_mgr_flg", length));
			String[] usaBkgModCd = (JSPUtil.getParameter(request, prefix	+ "usa_bkg_mod_cd", length));
			String[] agmtSgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_sgn_ofc_cd", length));
			String[] spclRcFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rc_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] n2ndRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_rlane_cd", length));
			String[] n4thFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_finc_vvd_cd", length));
			String[] coaBatDt = (JSPUtil.getParameter(request, prefix	+ "coa_bat_dt", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgDelCd = (JSPUtil.getParameter(request, prefix	+ "bkg_del_cd", length));
			String[] revContiCd = (JSPUtil.getParameter(request, prefix	+ "rev_conti_cd", length));
			String[] n3rdPolPodDys = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_pod_dys", length));
			String[] n3rdTrdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_trd_cd", length));
			String[] shprNm = (JSPUtil.getParameter(request, prefix	+ "shpr_nm", length));
			String[] custTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_tp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] bkgPolCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pol_cd", length));
			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rgn_ofc_cd", length));
			String[] n1stIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n1st_ioc_conti_cd", length));
			String[] obrdDt = (JSPUtil.getParameter(request, prefix	+ "obrd_dt", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] oftTpCd = (JSPUtil.getParameter(request, prefix	+ "oft_tp_cd", length));
			String[] n2ndFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_finc_vvd_cd", length));
			String[] bkgPorYdCd = (JSPUtil.getParameter(request, prefix	+ "bkg_por_yd_cd", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaRgstBkgVO();
				if (bkgDelYdCd[i] != null)
					model.setBkgDelYdCd(bkgDelYdCd[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (cneeCustSeq[i] != null)
					model.setCneeCustSeq(cneeCustSeq[i]);
				if (cltOfcCd[i] != null)
					model.setCltOfcCd(cltOfcCd[i]);
				if (n2ndPodCd[i] != null)
					model.setN2ndPodCd(n2ndPodCd[i]);
				if (actOfcCd[i] != null)
					model.setActOfcCd(actOfcCd[i]);
				if (cneeCntCd[i] != null)
					model.setCneeCntCd(cneeCntCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtHqOfcCd[i] != null)
					model.setCtrtHqOfcCd(ctrtHqOfcCd[i]);
				if (n2ndTrdCd[i] != null)
					model.setN2ndTrdCd(n2ndTrdCd[i]);
				if (bkgPodCd[i] != null)
					model.setBkgPodCd(bkgPodCd[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (spclDgCgoFlg[i] != null)
					model.setSpclDgCgoFlg(spclDgCgoFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (vopCd[i] != null)
					model.setVopCd(vopCd[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (n4thRlaneCd[i] != null)
					model.setN4thRlaneCd(n4thRlaneCd[i]);
				if (ppdOfcCd[i] != null)
					model.setPpdOfcCd(ppdOfcCd[i]);
				if (bkgCgoWgt[i] != null)
					model.setBkgCgoWgt(bkgCgoWgt[i]);
				if (bkgWgtTpCd[i] != null)
					model.setBkgWgtTpCd(bkgWgtTpCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (n3rdRlaneCd[i] != null)
					model.setN3rdRlaneCd(n3rdRlaneCd[i]);
				if (spclBbCgoFlg[i] != null)
					model.setSpclBbCgoFlg(spclBbCgoFlg[i]);
				if (n2ndIocContiCd[i] != null)
					model.setN2ndIocContiCd(n2ndIocContiCd[i]);
				if (ctrtSrepCd[i] != null)
					model.setCtrtSrepCd(ctrtSrepCd[i]);
				if (revPolCd[i] != null)
					model.setRevPolCd(revPolCd[i]);
				if (n1stPolPodDys[i] != null)
					model.setN1stPolPodDys(n1stPolPodDys[i]);
				if (coaBatCd[i] != null)
					model.setCoaBatCd(coaBatCd[i]);
				if (cntrRcvDt[i] != null)
					model.setCntrRcvDt(cntrRcvDt[i]);
				if (n2ndPolPodDys[i] != null)
					model.setN2ndPolPodDys(n2ndPolPodDys[i]);
				if (n3rdIocContiCd[i] != null)
					model.setN3rdIocContiCd(n3rdIocContiCd[i]);
				if (bkgStsCd[i] != null)
					model.setBkgStsCd(bkgStsCd[i]);
				if (agmtCustSeq[i] != null)
					model.setAgmtCustSeq(agmtCustSeq[i]);
				if (rdFlg[i] != null)
					model.setRdFlg(rdFlg[i]);
				if (n4thIocContiCd[i] != null)
					model.setN4thIocContiCd(n4thIocContiCd[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (n3rdPolCd[i] != null)
					model.setN3rdPolCd(n3rdPolCd[i]);
				if (fincDirCd[i] != null)
					model.setFincDirCd(fincDirCd[i]);
				if (revPodCd[i] != null)
					model.setRevPodCd(revPodCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (wrkVvdCd[i] != null)
					model.setWrkVvdCd(wrkVvdCd[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (n1stFincVvdCd[i] != null)
					model.setN1stFincVvdCd(n1stFincVvdCd[i]);
				if (agmtCustTpCd[i] != null)
					model.setAgmtCustTpCd(agmtCustTpCd[i]);
				if (n4thPolCd[i] != null)
					model.setN4thPolCd(n4thPolCd[i]);
				if (ntfyNm[i] != null)
					model.setNtfyNm(ntfyNm[i]);
				if (autoRatDt[i] != null)
					model.setAutoRatDt(autoRatDt[i]);
				if (n3rdPodCd[i] != null)
					model.setN3rdPodCd(n3rdPodCd[i]);
				if (cneeNm[i] != null)
					model.setCneeNm(cneeNm[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (n2ndPolCd[i] != null)
					model.setN2ndPolCd(n2ndPolCd[i]);
				if (agmtCntCd[i] != null)
					model.setAgmtCntCd(agmtCntCd[i]);
				if (shprCustSeq[i] != null)
					model.setShprCustSeq(shprCustSeq[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (n3rdFincVvdCd[i] != null)
					model.setN3rdFincVvdCd(n3rdFincVvdCd[i]);
				if (coaBatSeq[i] != null)
					model.setCoaBatSeq(coaBatSeq[i]);
				if (n1stPolCd[i] != null)
					model.setN1stPolCd(n1stPolCd[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (n4thPodCd[i] != null)
					model.setN4thPodCd(n4thPodCd[i]);
				if (blNoChk[i] != null)
					model.setBlNoChk(blNoChk[i]);
				if (n4thTrdCd[i] != null)
					model.setN4thTrdCd(n4thTrdCd[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (blNoTp[i] != null)
					model.setBlNoTp(blNoTp[i]);
				if (n1stRlaneCd[i] != null)
					model.setN1stRlaneCd(n1stRlaneCd[i]);
				if (n1stTrdCd[i] != null)
					model.setN1stTrdCd(n1stTrdCd[i]);
				if (n1stPodCd[i] != null)
					model.setN1stPodCd(n1stPodCd[i]);
				if (bkgPorCd[i] != null)
					model.setBkgPorCd(bkgPorCd[i]);
				if (n4thPolPodDys[i] != null)
					model.setN4thPolPodDys(n4thPolPodDys[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (custKeyAgmtMgrFlg[i] != null)
					model.setCustKeyAgmtMgrFlg(custKeyAgmtMgrFlg[i]);
				if (usaBkgModCd[i] != null)
					model.setUsaBkgModCd(usaBkgModCd[i]);
				if (agmtSgnOfcCd[i] != null)
					model.setAgmtSgnOfcCd(agmtSgnOfcCd[i]);
				if (spclRcFlg[i] != null)
					model.setSpclRcFlg(spclRcFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (n2ndRlaneCd[i] != null)
					model.setN2ndRlaneCd(n2ndRlaneCd[i]);
				if (n4thFincVvdCd[i] != null)
					model.setN4thFincVvdCd(n4thFincVvdCd[i]);
				if (coaBatDt[i] != null)
					model.setCoaBatDt(coaBatDt[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgDelCd[i] != null)
					model.setBkgDelCd(bkgDelCd[i]);
				if (revContiCd[i] != null)
					model.setRevContiCd(revContiCd[i]);
				if (n3rdPolPodDys[i] != null)
					model.setN3rdPolPodDys(n3rdPolPodDys[i]);
				if (n3rdTrdCd[i] != null)
					model.setN3rdTrdCd(n3rdTrdCd[i]);
				if (shprNm[i] != null)
					model.setShprNm(shprNm[i]);
				if (custTpCd[i] != null)
					model.setCustTpCd(custTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (bkgPolCd[i] != null)
					model.setBkgPolCd(bkgPolCd[i]);
				if (ctrtRgnOfcCd[i] != null)
					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
				if (n1stIocContiCd[i] != null)
					model.setN1stIocContiCd(n1stIocContiCd[i]);
				if (obrdDt[i] != null)
					model.setObrdDt(obrdDt[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (oftTpCd[i] != null)
					model.setOftTpCd(oftTpCd[i]);
				if (n2ndFincVvdCd[i] != null)
					model.setN2ndFincVvdCd(n2ndFincVvdCd[i]);
				if (bkgPorYdCd[i] != null)
					model.setBkgPorYdCd(bkgPorYdCd[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaRgstBkgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaRgstBkgVO[]
	 */
	public CoaRgstBkgVO[] getCoaRgstBkgVOs(){
		CoaRgstBkgVO[] vos = (CoaRgstBkgVO[])models.toArray(new CoaRgstBkgVO[models.size()]);
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
		this.bkgDelYdCd = this.bkgDelYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCustSeq = this.cneeCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltOfcCd = this.cltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodCd = this.n2ndPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actOfcCd = this.actOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtHqOfcCd = this.ctrtHqOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTrdCd = this.n2ndTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodCd = this.bkgPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclDgCgoFlg = this.spclDgCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcCd = this.bkgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopCd = this.vopCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thRlaneCd = this.n4thRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdOfcCd = this.ppdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoWgt = this.bkgCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgtTpCd = this.bkgWgtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdRlaneCd = this.n3rdRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBbCgoFlg = this.spclBbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndIocContiCd = this.n2ndIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtSrepCd = this.ctrtSrepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPolCd = this.revPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolPodDys = this.n1stPolPodDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatCd = this.coaBatCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRcvDt = this.cntrRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolPodDys = this.n2ndPolPodDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdIocContiCd = this.n3rdIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgStsCd = this.bkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCustSeq = this.agmtCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdFlg = this.rdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thIocContiCd = this.n4thIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolCd = this.n3rdPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincDirCd = this.fincDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPodCd = this.revPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrkVvdCd = this.wrkVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stFincVvdCd = this.n1stFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCustTpCd = this.agmtCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thPolCd = this.n4thPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm = this.ntfyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoRatDt = this.autoRatDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodCd = this.n3rdPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm = this.cneeNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolCd = this.n2ndPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCntCd = this.agmtCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCustSeq = this.shprCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdFincVvdCd = this.n3rdFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatSeq = this.coaBatSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolCd = this.n1stPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thPodCd = this.n4thPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoChk = this.blNoChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thTrdCd = this.n4thTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoTp = this.blNoTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stRlaneCd = this.n1stRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTrdCd = this.n1stTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodCd = this.n1stPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorCd = this.bkgPorCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thPolPodDys = this.n4thPolPodDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custKeyAgmtMgrFlg = this.custKeyAgmtMgrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaBkgModCd = this.usaBkgModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSgnOfcCd = this.agmtSgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRcFlg = this.spclRcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndRlaneCd = this.n2ndRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thFincVvdCd = this.n4thFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaBatDt = this.coaBatDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelCd = this.bkgDelCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revContiCd = this.revContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolPodDys = this.n3rdPolPodDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTrdCd = this.n3rdTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm = this.shprNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTpCd = this.custTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolCd = this.bkgPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRgnOfcCd = this.ctrtRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stIocContiCd = this.n1stIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obrdDt = this.obrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oftTpCd = this.oftTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndFincVvdCd = this.n2ndFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorYdCd = this.bkgPorYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
