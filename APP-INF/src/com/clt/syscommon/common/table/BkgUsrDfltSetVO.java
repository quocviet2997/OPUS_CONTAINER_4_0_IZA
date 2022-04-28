/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgUsrDfltSetVO.java
*@FileTitle : BkgUsrDfltSetVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.15
*@LastModifier : 김기종
*@LastVersion : 1.0
* 2009.05.15 김기종 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김기종
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class BkgUsrDfltSetVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgUsrDfltSetVO> models = new ArrayList<BkgUsrDfltSetVO>();
	
	/* Column Info */
	private String bkgNo = null;
	

	private String contiCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String docCctDpFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String xptCstmsCctDpFlg = null;
	/* Column Info */
	private String mtyPkupYdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String anRmk = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Column Info */
	private String polCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String preSkdVoyNo = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String prnBlTpCd = null;
	/* Column Info */
	private String drftBlCallSgnDpFlg = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dfltEml = null;
	/* Column Info */
	private String drftBlXchRtDpFlg = null;
	/* Column Info */
	private String drftBlRmk = null;
	/* Column Info */
	private String fullRtnYdCd = null;
	/* Column Info */
	private String dfltPhnNo = null;
	/* Column Info */
	private String drftBlMrnNoDpFlg = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String preSkdDirCd = null;
	/* Column Info */
	private String anPrnRtFlg = null;
	/* Column Info */
	private String railCctDpFlg = null;
	/* Column Info */
	private String dfltFaxNo = null;
	/* Column Info */
	private String oblIssKnt = null;
	/* Column Info */
	private String prnBlRidrKnt = null;
	/* Column Info */
	private String prnCntrTpCd = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String fwrdFlg = null;
	/* Column Info */
	private String dotPrnFlg = null;
	/* Column Info */
	private String prnChgTpCd = null;
	/* Column Info */
	private String prnBlFaceKnt = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String rtnCctDpFlg = null;
	/* Column Info */
	private String tmlCctDpFlg = null;
	/* Column Info */
	private String preVslCd = null;

	/* Column Info */
	private String blFacePrnDvcNm = null;
	/* Column Info */
	private String blRidrPrnDvcNm = null;
	/* Column Info */
	private String blPrnDvcNm = null;
	/* Column Info */
	private String blPrnSetup = null;
	/* Column Info */
	private String blTpCd = null;
	/* Column Info */
	private String oblIssFlg = null;
	/* Column Info */
	private String oblRiderFlg = null;
	/* Column Info */
	private String oblPrnFlg = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String blCpyKnt = null;
	/* Column Info */
	private String oblRlseFlg = null;
	
	/* Column Info */
	private String blNo = null;
	
	/* Column Info */
	private String autoEdiHldFlg = null;
	/* Column Info */
	private String printReleaseYn = null;
	
	/* Column Info */
	private String orgPpdRcvCd = null;
	private String orgN3ptyPpdCd = null;
	
	private String bkgRctNtcRcvFlg = null;
	private String mtyRlseOrdRcvFlg = null;
	private String troNtcRcvFlg = null;
	private String drftWblRcvFlg = null;
	private String srndNtcRcvFlg = null;
	private String anRcvFlg = null;
	
	private String eurCgorFlg = null;
	private String fcntrRlseFlg = null;
	
	private String wblPrnFlg = null;
	private String blCpyNo = null;
	private String blEsigFlg = null;
	private String blCpyEsigFlg = null;
	private String blKntFlg = null;
	private String blPrnChgTpCd = null;
	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgUsrDfltSetVO() {}

	public BkgUsrDfltSetVO(String ibflag, String pagerows, String usrId, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String bkgCgoTpCd, String rcvTermCd, String deTermCd,String bkgNo,String contiCd, String porCd, String polCd, String fullRtnYdCd, String mtyPkupYdCd, String wgtUtCd, String measUtCd, String cntrTpszCd, String preVslCd, String preSkdVoyNo, String preSkdDirCd, String fwrdFlg, String rtnCctDpFlg, String tmlCctDpFlg, String docCctDpFlg, String xptCstmsCctDpFlg, String railCctDpFlg, String prnBlTpCd, String prnChgTpCd, String prnCntrTpCd, String prnBlFaceKnt,String oblIssKnt, String prnBlRidrKnt, String dfltEml, String dfltPhnNo, String dfltFaxNo, String anPrnRtFlg, String anRmk, String dotPrnFlg, String drftBlXchRtDpFlg, String drftBlCallSgnDpFlg, String drftBlMrnNoDpFlg, String drftBlRmk, String creUsrId, String creDt, String updUsrId, String updDt,String blFacePrnDvcNm, String blRidrPrnDvcNm, String blPrnDvcNm, String blPrnSetup, String blTpCd, String oblIssFlg, String oblRiderFlg, String oblPrnFlg, String bbCgoFlg, String blCpyKnt, String oblRlseFlg, String blNo, String autoEdiHldFlg,String printReleaseYn, String orgPpdRcvCd, String orgN3ptyPpdCd,String bkgRctNtcRcvFlg,String mtyRlseOrdRcvFlg,String troNtcRcvFlg,String drftWblRcvFlg,String srndNtcRcvFlg,String anRcvFlg,String eurCgorFlg,String fcntrRlseFlg,String wblPrnFlg,String blCpyNo,String blEsigFlg, String blCpyEsigFlg, String blKntFlg, String blPrnChgTpCd) {
		this.bkgNo = bkgNo;
		this.contiCd = contiCd;
		this.porCd = porCd;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.docCctDpFlg = docCctDpFlg;
		this.creDt = creDt;
		this.xptCstmsCctDpFlg = xptCstmsCctDpFlg;
		this.mtyPkupYdCd = mtyPkupYdCd;
		this.pagerows = pagerows;
		this.anRmk = anRmk;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.polCd = polCd;
		this.ibflag = ibflag;
		this.preSkdVoyNo = preSkdVoyNo;
		this.usrId = usrId;
		this.wgtUtCd = wgtUtCd;
		this.cntrTpszCd = cntrTpszCd;
		this.prnBlTpCd = prnBlTpCd;
		this.drftBlCallSgnDpFlg = drftBlCallSgnDpFlg;
		this.rcvTermCd = rcvTermCd;
		this.measUtCd = measUtCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.dfltEml = dfltEml;
		this.drftBlXchRtDpFlg = drftBlXchRtDpFlg;
		this.drftBlRmk = drftBlRmk;
		this.fullRtnYdCd = fullRtnYdCd;
		this.dfltPhnNo = dfltPhnNo;
		this.drftBlMrnNoDpFlg = drftBlMrnNoDpFlg;
		this.deTermCd = deTermCd;
		this.creUsrId = creUsrId;
		this.preSkdDirCd = preSkdDirCd;
		this.anPrnRtFlg = anPrnRtFlg;
		this.railCctDpFlg = railCctDpFlg;
		this.dfltFaxNo = dfltFaxNo;
		this.oblIssKnt = oblIssKnt;
		this.prnBlRidrKnt = prnBlRidrKnt;
		this.prnCntrTpCd = prnCntrTpCd;
		this.trnkVslCd = trnkVslCd;
		this.fwrdFlg = fwrdFlg;
		this.dotPrnFlg = dotPrnFlg;
		this.prnChgTpCd = prnChgTpCd;
		this.prnBlFaceKnt = prnBlFaceKnt;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.rtnCctDpFlg = rtnCctDpFlg;
		this.tmlCctDpFlg = tmlCctDpFlg;
		this.preVslCd = preVslCd;
		this.blFacePrnDvcNm = blFacePrnDvcNm;
		this.blRidrPrnDvcNm = blRidrPrnDvcNm;
		this.blPrnDvcNm = blPrnDvcNm;
		this.blPrnSetup = blPrnSetup;
		this.blTpCd = blTpCd;
		this.oblIssFlg = oblIssFlg;
		this.oblRiderFlg = oblRiderFlg;
		this.oblPrnFlg = oblPrnFlg;
		this.bbCgoFlg = bbCgoFlg;
		this.blCpyKnt = blCpyKnt;
		this.oblRlseFlg = oblRlseFlg;
		this.blNo = blNo;
		this.autoEdiHldFlg = autoEdiHldFlg;
		this.printReleaseYn = printReleaseYn;
		this.orgPpdRcvCd = orgPpdRcvCd;
		this.orgN3ptyPpdCd = orgN3ptyPpdCd;
		
		this.bkgRctNtcRcvFlg = bkgRctNtcRcvFlg;
		this.mtyRlseOrdRcvFlg = mtyRlseOrdRcvFlg;
		this.troNtcRcvFlg = troNtcRcvFlg;
		this.drftWblRcvFlg = drftWblRcvFlg;
		this.srndNtcRcvFlg = srndNtcRcvFlg;
		this.anRcvFlg = anRcvFlg;
		this.eurCgorFlg = eurCgorFlg;
		this.fcntrRlseFlg = fcntrRlseFlg;
		this.wblPrnFlg = wblPrnFlg;
		this.blCpyNo = blCpyNo;
		this.blEsigFlg = blEsigFlg;
		this.blCpyEsigFlg = blCpyEsigFlg;
		this.blKntFlg = blKntFlg;
		this.blPrnChgTpCd = blPrnChgTpCd;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("conti_cd", getContiCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("doc_cct_dp_flg", getDocCctDpFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("xpt_cstms_cct_dp_flg", getXptCstmsCctDpFlg());
		this.hashColumns.put("mty_pkup_yd_cd", getMtyPkupYdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("an_rmk", getAnRmk());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pre_skd_voy_no", getPreSkdVoyNo());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("prn_bl_tp_cd", getPrnBlTpCd());
		this.hashColumns.put("drft_bl_call_sgn_dp_flg", getDrftBlCallSgnDpFlg());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dflt_eml", getDfltEml());
		this.hashColumns.put("drft_bl_xch_rt_dp_flg", getDrftBlXchRtDpFlg());
		this.hashColumns.put("drft_bl_rmk", getDrftBlRmk());
		this.hashColumns.put("full_rtn_yd_cd", getFullRtnYdCd());
		this.hashColumns.put("dflt_phn_no", getDfltPhnNo());
		this.hashColumns.put("drft_bl_mrn_no_dp_flg", getDrftBlMrnNoDpFlg());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pre_skd_dir_cd", getPreSkdDirCd());
		this.hashColumns.put("an_prn_rt_flg", getAnPrnRtFlg());
		this.hashColumns.put("rail_cct_dp_flg", getRailCctDpFlg());
		this.hashColumns.put("dflt_fax_no", getDfltFaxNo());
		this.hashColumns.put("obl_iss_knt", getOblIssKnt());
		this.hashColumns.put("prn_bl_ridr_knt", getPrnBlRidrKnt());
		this.hashColumns.put("prn_cntr_tp_cd", getPrnCntrTpCd());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("fwrd_flg", getFwrdFlg());
		this.hashColumns.put("dot_prn_flg", getDotPrnFlg());
		this.hashColumns.put("prn_chg_tp_cd", getPrnChgTpCd());
		this.hashColumns.put("prn_bl_face_knt", getPrnBlFaceKnt());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("rtn_cct_dp_flg", getRtnCctDpFlg());
		this.hashColumns.put("tml_cct_dp_flg", getTmlCctDpFlg());
		this.hashColumns.put("pre_vsl_cd", getPreVslCd());
		this.hashColumns.put("bl_face_prn_dvc_nm", getBlFacePrnDvcNm());
		this.hashColumns.put("bl_ridr_prn_dvc_nm", getBlRidrPrnDvcNm());
		this.hashColumns.put("bl_prn_dvc_nm", getBlPrnDvcNm());
		this.hashColumns.put("bl_prn_setup", getBlPrnSetup());
		this.hashColumns.put("bl_tp_cd", getBlTpCd());
		this.hashColumns.put("obl_iss_flg", getOblIssFlg());
		this.hashColumns.put("obl_rider_flg", getOblRiderFlg());
		this.hashColumns.put("obl_prn_flg", getOblPrnFlg());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("bl_cpy_knt", getBlCpyKnt());
		this.hashColumns.put("obl_rlse_flg", getOblRlseFlg());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("auto_edi_hld_flg", getAutoEdiHldFlg());
		this.hashColumns.put("print_release_yn", getPrintReleaseYn());
		this.hashColumns.put("org_ppd_rcv_cd", getOrgPpdRcvCd());
		this.hashColumns.put("org_n3pty_ppd_cd", getOrgN3ptyPpdCd());
		
		this.hashColumns.put("bkg_rct_ntc_rcv_flg", getBkgRctNtcRcvFlg());
		this.hashColumns.put("mty_rlse_ord_rcv_flg", getMtyRlseOrdRcvFlg());
		this.hashColumns.put("tro_ntc_rcv_flg", getTroNtcRcvFlg());
		this.hashColumns.put("drft_wbl_rcv_flg", getDrftWblRcvFlg());
		this.hashColumns.put("srnd_ntc_rcv_flg", getSrndNtcRcvFlg());
		this.hashColumns.put("an_rcv_flg", getAnRcvFlg());
		
		this.hashColumns.put("eur_cgor_flg", getEurCgorFlg());
		this.hashColumns.put("fcntr_rlse_flg", getFcntrRlseFlg());
		this.hashColumns.put("wbl_prn_flg", getWblPrnFlg());
		this.hashColumns.put("bl_cpy_no", getBlCpyNo());
		
		this.hashColumns.put("bl_esig_flg", getBlEsigFlg());
		this.hashColumns.put("bl_cpy_esig_flg", getBlCpyEsigFlg());
		this.hashColumns.put("bl_knt_flg", getBlKntFlg());
		this.hashColumns.put("bl_prn_chg_tp_cd", getBlPrnChgTpCd());
		
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("conti_cd", "contiCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("doc_cct_dp_flg", "docCctDpFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("xpt_cstms_cct_dp_flg", "xptCstmsCctDpFlg");
		this.hashFields.put("mty_pkup_yd_cd", "mtyPkupYdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("an_rmk", "anRmk");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pre_skd_voy_no", "preSkdVoyNo");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("prn_bl_tp_cd", "prnBlTpCd");
		this.hashFields.put("drft_bl_call_sgn_dp_flg", "drftBlCallSgnDpFlg");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dflt_eml", "dfltEml");
		this.hashFields.put("drft_bl_xch_rt_dp_flg", "drftBlXchRtDpFlg");
		this.hashFields.put("drft_bl_rmk", "drftBlRmk");
		this.hashFields.put("full_rtn_yd_cd", "fullRtnYdCd");
		this.hashFields.put("dflt_phn_no", "dfltPhnNo");
		this.hashFields.put("drft_bl_mrn_no_dp_flg", "drftBlMrnNoDpFlg");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pre_skd_dir_cd", "preSkdDirCd");
		this.hashFields.put("an_prn_rt_flg", "anPrnRtFlg");
		this.hashFields.put("rail_cct_dp_flg", "railCctDpFlg");
		this.hashFields.put("dflt_fax_no", "dfltFaxNo");
		this.hashFields.put("obl_iss_knt", "oblIssKnt");
		this.hashFields.put("prn_bl_ridr_knt", "prnBlRidrKnt");
		this.hashFields.put("prn_cntr_tp_cd", "prnCntrTpCd");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("fwrd_flg", "fwrdFlg");
		this.hashFields.put("dot_prn_flg", "dotPrnFlg");
		this.hashFields.put("prn_chg_tp_cd", "prnChgTpCd");
		this.hashFields.put("prn_bl_face_knt", "prnBlFaceKnt");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("rtn_cct_dp_flg", "rtnCctDpFlg");
		this.hashFields.put("tml_cct_dp_flg", "tmlCctDpFlg");
		this.hashFields.put("pre_vsl_cd", "preVslCd");
		this.hashFields.put("bl_face_prn_dvc_nm", "blFacePrnDvcNm");
		this.hashFields.put("bl_ridr_prn_dvc_nm", "blRidrPrnDvcNm");
		this.hashFields.put("bl_prn_dvc_nm", "blPrnDvcNm");		
		this.hashFields.put("bl_prn_setup", "blPrnSetup");		
		this.hashFields.put("bl_tp_cd", "blTpCd");
		this.hashFields.put("obl_iss_flg", "oblIssFlg");	
		this.hashFields.put("obl_rider_flg", "oblRiderFlg");	
		this.hashFields.put("obl_prn_flg", "oblPrnFlg");	
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");	
		this.hashFields.put("bl_cpy_knt", "blCpyKnt");	
		this.hashFields.put("obl_rlse_flg", "oblRlseFlg");	
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("auto_edi_hld_flg", "autoEdiHldFlg");
		this.hashFields.put("print_release_yn", "printReleaseYn");
		this.hashFields.put("org_ppd_rcv_cd", "orgPpdRcvCd");
		this.hashFields.put("org_n3pty_ppd_cd", "orgN3ptyPpdCd");
		
		this.hashFields.put("bkg_rct_ntc_rcv_flg", "bkgRctNtcRcvFlg");	
		this.hashFields.put("mty_rlse_ord_rcv_flg", "mtyRlseOrdRcvFlg");
		this.hashFields.put("tro_ntc_rcv_flg", "troNtcRcvFlg");
		this.hashFields.put("drft_wbl_rcv_flg", "drftWblRcvFlg");
		this.hashFields.put("srnd_ntc_rcv_flg", "srndNtcRcvFlg");
		this.hashFields.put("an_rcv_flg", "anRcvFlg");
		
		this.hashFields.put("eur_cgor_flg", "eurCgorFlg");
		this.hashFields.put("fcntr_rlse_flg", "fcntrRlseFlg");
		this.hashFields.put("wbl_prn_flg", "wblPrnFlg");
		this.hashFields.put("bl_cpy_no", "blCpyNo");
		
		this.hashFields.put("bl_esig_flg", "blEsigFlg");
		this.hashFields.put("bl_cpy_esig_flg", "blCpyEsigFlg");
		this.hashFields.put("bl_knt_flg", "blKntFlg");
		this.hashFields.put("bl_prn_chg_tp_cd", "blPrnChgTpCd");
		return this.hashFields;
	}
	
	public String getContiCd() {
		return contiCd;
	}

	public void setContiCd(String contiCd) {
		this.contiCd = contiCd;
	}
	
	/**
	 * Column Info
	 * @return blCpyKnt
	 */	
	public String getBlCpyKnt() {
		return blCpyKnt;
	}

	/**
	 * Column Info
	 * @param blCpyKnt
	 */	
	public void setBlCpyKnt(String blCpyKnt) {
		this.blCpyKnt = blCpyKnt;
	}

	

	/**
	 * Column Info
	 * @return blPrnSetup
	 */	
	public String getBlPrnSetup() {
		return blPrnSetup;
	}

	/**
	 * Column Info
	 * @param blPrnSetup
	 */
	public void setBlPrnSetup(String blPrnSetup) {
		this.blPrnSetup = blPrnSetup;
	}
	/**
	 * Column Info
	 * @return blTpCd
	 */	
	public String getBlTpCd() {
		return blTpCd;
	}
	/**
	 * Column Info
	 * @param blTpCd
	 */
	public void setBlTpCd(String blTpCd) {
		this.blTpCd= blTpCd;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */	
	public String getBkgNo() {
		return bkgNo;
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
	 * @return blFacePrnDvcNm
	 */	
	public String getBlFacePrnDvcNm() {
		return blFacePrnDvcNm;
	}

	/**
	 * Column Info
	 * @param blFacePrnDvcNm
	 */	
	public void setBlFacePrnDvcNm(String blFacePrnDvcNm) {
		this.blFacePrnDvcNm = blFacePrnDvcNm;
	}

	/**
	 * Column Info
	 * @return blRidrPrnDvcNm
	 */	
	public String getBlRidrPrnDvcNm() {
		return blRidrPrnDvcNm;
	}
	
	/**
	 * Column Info
	 * @param blRidrPrnDvcNm
	 */	
	public void setBlRidrPrnDvcNm(String blRidrPrnDvcNm) {
		this.blRidrPrnDvcNm = blRidrPrnDvcNm;
	}
	
	/**
	 * Column Info
	 * return blPrnDvcNm
	 */	
	public String getBlPrnDvcNm() {
		return blPrnDvcNm;
	}
	/**
	 * Column Info
	 * @param blPrnDvcNm
	 */	
	public void setBlPrnDvcNm(String blPrnDvcNm) {
		this.blPrnDvcNm = blPrnDvcNm;
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
	 * @return bkgCgoTpCd
	 */
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return docCctDpFlg
	 */
	public String getDocCctDpFlg() {
		return this.docCctDpFlg;
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
	 * @return xptCstmsCctDpFlg
	 */
	public String getXptCstmsCctDpFlg() {
		return this.xptCstmsCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @return mtyPkupYdCd
	 */
	public String getMtyPkupYdCd() {
		return this.mtyPkupYdCd;
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
	 * @return anRmk
	 */
	public String getAnRmk() {
		return this.anRmk;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdDirCd
	 */
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return preSkdVoyNo
	 */
	public String getPreSkdVoyNo() {
		return this.preSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
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
	 * @return prnBlTpCd
	 */
	public String getPrnBlTpCd() {
		return this.prnBlTpCd;
	}
	
	/**
	 * Column Info
	 * @return drftBlCallSgnDpFlg
	 */
	public String getDrftBlCallSgnDpFlg() {
		return this.drftBlCallSgnDpFlg;
	}
	
	/**
	 * Column Info
	 * @return rcvTermCd
	 */
	public String getRcvTermCd() {
		return this.rcvTermCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return dfltEml
	 */
	public String getDfltEml() {
		return this.dfltEml;
	}
	
	/**
	 * Column Info
	 * @return drftBlXchRtDpFlg
	 */
	public String getDrftBlXchRtDpFlg() {
		return this.drftBlXchRtDpFlg;
	}
	
	/**
	 * Column Info
	 * @return drftBlRmk
	 */
	public String getDrftBlRmk() {
		return this.drftBlRmk;
	}
	
	/**
	 * Column Info
	 * @return fullRtnYdCd
	 */
	public String getFullRtnYdCd() {
		return this.fullRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return dfltPhnNo
	 */
	public String getDfltPhnNo() {
		return this.dfltPhnNo;
	}
	
	/**
	 * Column Info
	 * @return drftBlMrnNoDpFlg
	 */
	public String getDrftBlMrnNoDpFlg() {
		return this.drftBlMrnNoDpFlg;
	}
	
	/**
	 * Column Info
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
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
	 * @return preSkdDirCd
	 */
	public String getPreSkdDirCd() {
		return this.preSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return anPrnRtFlg
	 */
	public String getAnPrnRtFlg() {
		return this.anPrnRtFlg;
	}
	
	/**
	 * Column Info
	 * @return railCctDpFlg
	 */
	public String getRailCctDpFlg() {
		return this.railCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @return dfltFaxNo
	 */
	public String getDfltFaxNo() {
		return this.dfltFaxNo;
	}
	
	
	/**
	 * Column Info
	 * @return dfltFaxNo
	 */
	public String getOblIssKnt() {
		return oblIssKnt;
	}


	/**
	 * Column Info
	 * @return prnBlRidrKnt
	 */
	public String getPrnBlRidrKnt() {
		return this.prnBlRidrKnt;
	}
	
	/**
	 * Column Info
	 * @return prnCntrTpCd
	 */
	public String getPrnCntrTpCd() {
		return this.prnCntrTpCd;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCd
	 */
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @return fwrdFlg
	 */
	public String getFwrdFlg() {
		return this.fwrdFlg;
	}
	
	/**
	 * Column Info
	 * @return dotPrnFlg
	 */
	public String getDotPrnFlg() {
		return this.dotPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return prnChgTpCd
	 */
	public String getPrnChgTpCd() {
		return this.prnChgTpCd;
	}
	
	/**
	 * Column Info
	 * @return prnBlFaceKnt
	 */
	public String getPrnBlFaceKnt() {
		return this.prnBlFaceKnt;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdVoyNo
	 */
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return rtnCctDpFlg
	 */
	public String getRtnCctDpFlg() {
		return this.rtnCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlCctDpFlg
	 */
	public String getTmlCctDpFlg() {
		return this.tmlCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @return preVslCd
	 */
	public String getPreVslCd() {
		return this.preVslCd;
	}
	

	/**
	 * @return the blCpyNo
	 */
	public String getBlCpyNo() {
		return blCpyNo;
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
	 * @param bkgCgoTpCd
	 */
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param docCctDpFlg
	 */
	public void setDocCctDpFlg(String docCctDpFlg) {
		this.docCctDpFlg = docCctDpFlg;
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
	 * @param xptCstmsCctDpFlg
	 */
	public void setXptCstmsCctDpFlg(String xptCstmsCctDpFlg) {
		this.xptCstmsCctDpFlg = xptCstmsCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @param mtyPkupYdCd
	 */
	public void setMtyPkupYdCd(String mtyPkupYdCd) {
		this.mtyPkupYdCd = mtyPkupYdCd;
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
	 * @param anRmk
	 */
	public void setAnRmk(String anRmk) {
		this.anRmk = anRmk;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdDirCd
	 */
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param oblIssKnt
	 */
	public void setOblIssKnt(String oblIssKnt) {
		this.oblIssKnt = oblIssKnt;
	}
	
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param preSkdVoyNo
	 */
	public void setPreSkdVoyNo(String preSkdVoyNo) {
		this.preSkdVoyNo = preSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
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
	 * @param prnBlTpCd
	 */
	public void setPrnBlTpCd(String prnBlTpCd) {
		this.prnBlTpCd = prnBlTpCd;
	}
	
	/**
	 * Column Info
	 * @param drftBlCallSgnDpFlg
	 */
	public void setDrftBlCallSgnDpFlg(String drftBlCallSgnDpFlg) {
		this.drftBlCallSgnDpFlg = drftBlCallSgnDpFlg;
	}
	
	/**
	 * Column Info
	 * @param rcvTermCd
	 */
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param dfltEml
	 */
	public void setDfltEml(String dfltEml) {
		this.dfltEml = dfltEml;
	}
	
	/**
	 * Column Info
	 * @param drftBlXchRtDpFlg
	 */
	public void setDrftBlXchRtDpFlg(String drftBlXchRtDpFlg) {
		this.drftBlXchRtDpFlg = drftBlXchRtDpFlg;
	}
	
	/**
	 * Column Info
	 * @param drftBlRmk
	 */
	public void setDrftBlRmk(String drftBlRmk) {
		this.drftBlRmk = drftBlRmk;
	}
	
	/**
	 * Column Info
	 * @param fullRtnYdCd
	 */
	public void setFullRtnYdCd(String fullRtnYdCd) {
		this.fullRtnYdCd = fullRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param dfltPhnNo
	 */
	public void setDfltPhnNo(String dfltPhnNo) {
		this.dfltPhnNo = dfltPhnNo;
	}
	
	/**
	 * Column Info
	 * @param drftBlMrnNoDpFlg
	 */
	public void setDrftBlMrnNoDpFlg(String drftBlMrnNoDpFlg) {
		this.drftBlMrnNoDpFlg = drftBlMrnNoDpFlg;
	}
	
	/**
	 * Column Info
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
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
	 * @param preSkdDirCd
	 */
	public void setPreSkdDirCd(String preSkdDirCd) {
		this.preSkdDirCd = preSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param anPrnRtFlg
	 */
	public void setAnPrnRtFlg(String anPrnRtFlg) {
		this.anPrnRtFlg = anPrnRtFlg;
	}
	
	/**
	 * Column Info
	 * @param railCctDpFlg
	 */
	public void setRailCctDpFlg(String railCctDpFlg) {
		this.railCctDpFlg = railCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @param dfltFaxNo
	 */
	public void setDfltFaxNo(String dfltFaxNo) {
		this.dfltFaxNo = dfltFaxNo;
	}
	
	/**
	 * Column Info
	 * @param prnBlRidrKnt
	 */
	public void setPrnBlRidrKnt(String prnBlRidrKnt) {
		this.prnBlRidrKnt = prnBlRidrKnt;
	}
	
	/**
	 * Column Info
	 * @param prnCntrTpCd
	 */
	public void setPrnCntrTpCd(String prnCntrTpCd) {
		this.prnCntrTpCd = prnCntrTpCd;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCd
	 */
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @param fwrdFlg
	 */
	public void setFwrdFlg(String fwrdFlg) {
		this.fwrdFlg = fwrdFlg;
	}
	
	/**
	 * Column Info
	 * @param dotPrnFlg
	 */
	public void setDotPrnFlg(String dotPrnFlg) {
		this.dotPrnFlg = dotPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param prnChgTpCd
	 */
	public void setPrnChgTpCd(String prnChgTpCd) {
		this.prnChgTpCd = prnChgTpCd;
	}
	
	/**
	 * Column Info
	 * @param prnBlFaceKnt
	 */
	public void setPrnBlFaceKnt(String prnBlFaceKnt) {
		this.prnBlFaceKnt = prnBlFaceKnt;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdVoyNo
	 */
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param rtnCctDpFlg
	 */
	public void setRtnCctDpFlg(String rtnCctDpFlg) {
		this.rtnCctDpFlg = rtnCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlCctDpFlg
	 */
	public void setTmlCctDpFlg(String tmlCctDpFlg) {
		this.tmlCctDpFlg = tmlCctDpFlg;
	}
	
	/**
	 * Column Info
	 * @param preVslCd
	 */
	public void setPreVslCd(String preVslCd) {
		this.preVslCd = preVslCd;
	}
	
	/**
	 * Column Info
	 * @return oblIssFlg
	 */
	public String getOblIssFlg() {
		return oblIssFlg;
	}
	/**
	 * Column Info
	 * @return oblIssFlg
	 */
	public String getOblRiderFlg() {
		return oblRiderFlg;
	}

	/**
	 * Column Info
	 * @param oblIssFlg
	 */
	public void setOblIssFlg(String oblIssFlg) {
		this.oblIssFlg = oblIssFlg;
	}
	/**
	 * Column Info
	 * @param oblIssFlg
	 */
	public void setOblRiderFlg(String oblRiderFlg) {
		this.oblRiderFlg = oblRiderFlg;
	}

	/**
	 * Column Info
	 * @return oblPrnFlg
	 */
	public String getOblPrnFlg() {
		return oblPrnFlg;
	}

	/**
	 * Column Info
	 * @param oblPrnFlg
	 */
	public void setOblPrnFlg(String oblPrnFlg) {
		this.oblPrnFlg = oblPrnFlg;
	}

	/**
	 * Column Info
	 * @return bbCgoFlg
	 */
	public String getBbCgoFlg() {
		return bbCgoFlg;
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
	 * @return oblRlseFlg
	 */
	public String getOblRlseFlg() {
		return oblRlseFlg;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return blNo;
	}

	
	/**
	 * Column Info
	 * @param oblRlseFlg
	 */
	public void setOblRlseFlg(String oblRlseFlg) {
		this.oblRlseFlg = oblRlseFlg;
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
	 * @return autoEdiHldFlg
	 */
	public String getAutoEdiHldFlg() {
		return this.autoEdiHldFlg;
	}
	
	
	
	
	public String getPrintReleaseYn() {
		return printReleaseYn;
	}

	public void setPrintReleaseYn(String printReleaseYn) {
		this.printReleaseYn = printReleaseYn;
	}

	/**
	 * Column Info
	 * @param autoEdiHldFlg
	 */
	public void setAutoEdiHldFlg(String autoEdiHldFlg) {
		this.autoEdiHldFlg = autoEdiHldFlg;
	}
	
	public String getOrgPpdRcvCd() {
		return orgPpdRcvCd;
	}

	public void setOrgPpdRcvCd(String orgPpdRcvCd) {
		this.orgPpdRcvCd = orgPpdRcvCd;
	}

	public String getOrgN3ptyPpdCd() {
		return orgN3ptyPpdCd;
	}

	public void setOrgN3ptyPpdCd(String orgN3ptyPpdCd) {
		this.orgN3ptyPpdCd = orgN3ptyPpdCd;
	}	
	
	
	public String getBkgRctNtcRcvFlg() {
		return bkgRctNtcRcvFlg;
	}

	public void setBkgRctNtcRcvFlg(String bkgRctNtcRcvFlg) {
		this.bkgRctNtcRcvFlg = bkgRctNtcRcvFlg;
	}

	public String getMtyRlseOrdRcvFlg() {
		return mtyRlseOrdRcvFlg;
	}

	public void setMtyRlseOrdRcvFlg(String mtyRlseOrdRcvFlg) {
		this.mtyRlseOrdRcvFlg = mtyRlseOrdRcvFlg;
	}

	public String getTroNtcRcvFlg() {
		return troNtcRcvFlg;
	}

	public void setTroNtcRcvFlg(String troNtcRcvFlg) {
		this.troNtcRcvFlg = troNtcRcvFlg;
	}

	public String getDrftWblRcvFlg() {
		return drftWblRcvFlg;
	}

	public void setDrftWblRcvFlg(String drftWblRcvFlg) {
		this.drftWblRcvFlg = drftWblRcvFlg;
	}

	public String getSrndNtcRcvFlg() {
		return srndNtcRcvFlg;
	}

	public void setSrndNtcRcvFlg(String srndNtcRcvFlg) {
		this.srndNtcRcvFlg = srndNtcRcvFlg;
	}

	public String getAnRcvFlg() {
		return anRcvFlg;
	}

	public void setAnRcvFlg(String anRcvFlg) {
		this.anRcvFlg = anRcvFlg;
	}

	
	public String getEurCgorFlg() {
		return eurCgorFlg;
	}

	public void setEurCgorFlg(String eurCgorFlg) {
		this.eurCgorFlg = eurCgorFlg;
	}

	public String getFcntrRlseFlg() {
		return fcntrRlseFlg;
	}

	public void setFcntrRlseFlg(String fcntrRlseFlg) {
		this.fcntrRlseFlg = fcntrRlseFlg;
	}
	
	public String getWblPrnFlg() {
		return wblPrnFlg;
	}

	public void setWblPrnFlg(String wblPrnFlg) {
		this.wblPrnFlg = wblPrnFlg;
	}

	/**
	 * @param blCpyNo the blCpyNo to set
	 */
	public void setBlCpyNo(String blCpyNo) {
		this.blCpyNo = blCpyNo;
	}
	
	/**
	 * @return the blEsigFlg
	 */
	public String getBlEsigFlg() {
		return this.blEsigFlg;
	}

	/**
	 * @return the blCpyEsigFlg
	 */
	public String getBlCpyEsigFlg() {
		return this.blCpyEsigFlg;
	}

	/**
	 * @return the blKntFlg
	 */
	public String getBlKntFlg() {
		return this.blKntFlg;
	}

	/**
	 * @param blEsigFlg the blEsigFlg to set
	 */
	public void setBlEsigFlg(String blEsigFlg) {
		this.blEsigFlg = blEsigFlg;
	}

	/**
	 * @param blCpyEsigFlg the blCpyEsigFlg to set
	 */
	public void setBlCpyEsigFlg(String blCpyEsigFlg) {
		this.blCpyEsigFlg = blCpyEsigFlg;
	}

	/**
	 * @param blKntFlg the blKntFlg to set
	 */
	public void setBlKntFlg(String blKntFlg) {
		this.blKntFlg = blKntFlg;
	}
	
	/**
	 * @return the blPrnChgTpCd
	 */
	public String getBlPrnChgTpCd() {
		return blPrnChgTpCd;
	}

	/**
	 * @param blPrnChgTpCd the blPrnChgTpCd to set
	 */
	public void setBlPrnChgTpCd(String blPrnChgTpCd) {
		this.blPrnChgTpCd = blPrnChgTpCd;
	}

	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setContiCd(JSPUtil.getParameter(request, "conti_cd", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
		setDocCctDpFlg(JSPUtil.getParameter(request, "doc_cct_dp_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setXptCstmsCctDpFlg(JSPUtil.getParameter(request, "xpt_cstms_cct_dp_flg", ""));
		setMtyPkupYdCd(JSPUtil.getParameter(request, "mty_pkup_yd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAnRmk(JSPUtil.getParameter(request, "an_rmk", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPreSkdVoyNo(JSPUtil.getParameter(request, "pre_skd_voy_no", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setPrnBlTpCd(JSPUtil.getParameter(request, "prn_bl_tp_cd", ""));
		setDrftBlCallSgnDpFlg(JSPUtil.getParameter(request, "drft_bl_call_sgn_dp_flg", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDfltEml(JSPUtil.getParameter(request, "dflt_eml", ""));
		setDrftBlXchRtDpFlg(JSPUtil.getParameter(request, "drft_bl_xch_rt_dp_flg", ""));
		setDrftBlRmk(JSPUtil.getParameter(request, "drft_bl_rmk", ""));
		setFullRtnYdCd(JSPUtil.getParameter(request, "full_rtn_yd_cd", ""));
		setDfltPhnNo(JSPUtil.getParameter(request, "dflt_phn_no", ""));
		setDrftBlMrnNoDpFlg(JSPUtil.getParameter(request, "drft_bl_mrn_no_dp_flg", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPreSkdDirCd(JSPUtil.getParameter(request, "pre_skd_dir_cd", ""));
		setAnPrnRtFlg(JSPUtil.getParameter(request, "an_prn_rt_flg", ""));
		setRailCctDpFlg(JSPUtil.getParameter(request, "rail_cct_dp_flg", ""));
		setDfltFaxNo(JSPUtil.getParameter(request, "dflt_fax_no", ""));
		setOblIssKnt(JSPUtil.getParameter(request, "obl_iss_knt", ""));
		setPrnBlRidrKnt(JSPUtil.getParameter(request, "prn_bl_ridr_knt", ""));
		setPrnCntrTpCd(JSPUtil.getParameter(request, "prn_cntr_tp_cd", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setFwrdFlg(JSPUtil.getParameter(request, "fwrd_flg", ""));
		setDotPrnFlg(JSPUtil.getParameter(request, "dot_prn_flg", ""));
		setPrnChgTpCd(JSPUtil.getParameter(request, "prn_chg_tp_cd", ""));
		setPrnBlFaceKnt(JSPUtil.getParameter(request, "prn_bl_face_knt", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
		setRtnCctDpFlg(JSPUtil.getParameter(request, "rtn_cct_dp_flg", ""));
		setTmlCctDpFlg(JSPUtil.getParameter(request, "tml_cct_dp_flg", ""));
		setPreVslCd(JSPUtil.getParameter(request, "pre_vsl_cd", ""));
		setBlFacePrnDvcNm(JSPUtil.getParameter(request, "bl_face_prn_dvc_nm", ""));
	    setBlRidrPrnDvcNm(JSPUtil.getParameter(request, "bl_ridr_prn_dvc_nm", ""));
		setBlPrnDvcNm(JSPUtil.getParameter(request, "bl_prn_dvc_nm", ""));		
		setBlPrnSetup(JSPUtil.getParameter(request, "bl_prn_setup", ""));		
		setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
		setOblIssFlg(JSPUtil.getParameter(request, "obl_iss_flg", ""));
		setOblRiderFlg(JSPUtil.getParameter(request, "obl_rider_flg", ""));
		setOblPrnFlg(JSPUtil.getParameter(request, "obl_prn_flg", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setBlCpyKnt(JSPUtil.getParameter(request, "bl_cpy_knt", ""));
		setOblRlseFlg(JSPUtil.getParameter(request, "obl_rlse_flg", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setAutoEdiHldFlg(JSPUtil.getParameter(request, "auto_edi_hld_flg", ""));
		setPrintReleaseYn(JSPUtil.getParameter(request, "print_release_yn", ""));
		setOrgPpdRcvCd(JSPUtil.getParameter(request, "org_ppd_rcv_cd", ""));
		setOrgN3ptyPpdCd(JSPUtil.getParameter(request, "org_n3pty_ppd_cd", ""));
		
		setBkgRctNtcRcvFlg(JSPUtil.getParameter(request, "bkg_rct_ntc_rcv_flg", ""));
		setMtyRlseOrdRcvFlg(JSPUtil.getParameter(request, "mty_rlse_ord_rcv_flg", ""));
		setTroNtcRcvFlg(JSPUtil.getParameter(request, "tro_ntc_rcv_flg", ""));
		setDrftWblRcvFlg(JSPUtil.getParameter(request, "drft_wbl_rcv_flg", ""));
		setSrndNtcRcvFlg(JSPUtil.getParameter(request, "srnd_ntc_rcv_flg", ""));
		setAnRcvFlg(JSPUtil.getParameter(request, "an_rcv_flg", ""));
		
		setEurCgorFlg(JSPUtil.getParameter(request, "eur_cgor_flg", ""));
		setFcntrRlseFlg(JSPUtil.getParameter(request, "fcntr_rlse_flg", ""));
		setWblPrnFlg(JSPUtil.getParameter(request, "wbl_prn_flg", ""));
		setBlCpyNo(JSPUtil.getParameter(request, "bl_cpy_no", ""));
		
		setBlEsigFlg(JSPUtil.getParameter(request, "bl_esig_flg", ""));
		setBlCpyEsigFlg(JSPUtil.getParameter(request, "bl_cpy_esig_flg", ""));
		setBlKntFlg(JSPUtil.getParameter(request, "bl_knt_flg", ""));
		setBlPrnChgTpCd(JSPUtil.getParameter(request, "bl_prn_chg_tp_cd", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return BkgUsrDfltSetVO[]
	 */
	public BkgUsrDfltSetVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgUsrDfltSetVO[]
	 */
	public BkgUsrDfltSetVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgUsrDfltSetVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] contiCd = (JSPUtil.getParameter(request, prefix	+ "conti_cd".trim(), length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd".trim(), length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd".trim(), length));
			String[] docCctDpFlg = (JSPUtil.getParameter(request, prefix	+ "doc_cct_dp_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] xptCstmsCctDpFlg = (JSPUtil.getParameter(request, prefix	+ "xpt_cstms_cct_dp_flg".trim(), length));
			String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] anRmk = (JSPUtil.getParameter(request, prefix	+ "an_rmk".trim(), length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] preSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "pre_skd_voy_no".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] prnBlTpCd = (JSPUtil.getParameter(request, prefix	+ "prn_bl_tp_cd".trim(), length));
			String[] drftBlCallSgnDpFlg = (JSPUtil.getParameter(request, prefix	+ "drft_bl_call_sgn_dp_flg".trim(), length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd".trim(), length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] dfltEml = (JSPUtil.getParameter(request, prefix	+ "dflt_eml".trim(), length));
			String[] drftBlXchRtDpFlg = (JSPUtil.getParameter(request, prefix	+ "drft_bl_xch_rt_dp_flg".trim(), length));
			String[] drftBlRmk = (JSPUtil.getParameter(request, prefix	+ "drft_bl_rmk".trim(), length));
			String[] fullRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "full_rtn_yd_cd".trim(), length));
			String[] dfltPhnNo = (JSPUtil.getParameter(request, prefix	+ "dflt_phn_no".trim(), length));
			String[] drftBlMrnNoDpFlg = (JSPUtil.getParameter(request, prefix	+ "drft_bl_mrn_no_dp_flg".trim(), length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] preSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "pre_skd_dir_cd".trim(), length));
			String[] anPrnRtFlg = (JSPUtil.getParameter(request, prefix	+ "an_prn_rt_flg".trim(), length));
			String[] railCctDpFlg = (JSPUtil.getParameter(request, prefix	+ "rail_cct_dp_flg".trim(), length));
			String[] dfltFaxNo = (JSPUtil.getParameter(request, prefix	+ "dflt_fax_no".trim(), length));
			String[] oblIssKnt = (JSPUtil.getParameter(request, prefix	+ "obl_iss_knt".trim(), length));
			String[] prnBlRidrKnt = (JSPUtil.getParameter(request, prefix	+ "prn_bl_ridr_knt".trim(), length));
			String[] prnCntrTpCd = (JSPUtil.getParameter(request, prefix	+ "prn_cntr_tp_cd".trim(), length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd".trim(), length));
			String[] fwrdFlg = (JSPUtil.getParameter(request, prefix	+ "fwrd_flg".trim(), length));
			String[] dotPrnFlg = (JSPUtil.getParameter(request, prefix	+ "dot_prn_flg".trim(), length));
			String[] prnChgTpCd = (JSPUtil.getParameter(request, prefix	+ "prn_chg_tp_cd".trim(), length));
			String[] prnBlFaceKnt = (JSPUtil.getParameter(request, prefix	+ "prn_bl_face_knt".trim(), length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no".trim(), length));
			String[] rtnCctDpFlg = (JSPUtil.getParameter(request, prefix	+ "rtn_cct_dp_flg".trim(), length));
			String[] tmlCctDpFlg = (JSPUtil.getParameter(request, prefix	+ "tml_cct_dp_flg".trim(), length));
			String[] preVslCd = (JSPUtil.getParameter(request, prefix	+ "pre_vsl_cd".trim(), length));
			String[] blFacePrnDvcNm = (JSPUtil.getParameter(request, prefix	+ "bl_face_prn_dvc_nm".trim(), length));
			String[] blRidrPrnDvcNm = (JSPUtil.getParameter(request, prefix	+ "bl_ridr_prn_dvc_nm".trim(), length));
			String[] blPrnDvcNm     = (JSPUtil.getParameter(request, prefix	+ "bl_prn_dvc_nm".trim(), length));
			String[] blPrnSetup     = (JSPUtil.getParameter(request, prefix	+ "bl_prn_setup".trim(), length));
			String[] blTpCd         = (JSPUtil.getParameter(request, prefix	+ "bl_tp_cd".trim(), length));
			String[] oblIssFlg         = (JSPUtil.getParameter(request, prefix	+ "obl_iss_flg".trim(), length));
			String[] oblRiderFlg         = (JSPUtil.getParameter(request, prefix	+ "obl_rider_flg".trim(), length));
			String[] oblPrnFlg         = (JSPUtil.getParameter(request, prefix	+ "obl_prn_flg".trim(), length));
			String[] bbCgoFlg         = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg".trim(), length));
			String[] blCpyKnt         = (JSPUtil.getParameter(request, prefix	+ "bl_cpy_knt".trim(), length));
			String[] oblRlseFlg         = (JSPUtil.getParameter(request, prefix	+ "obl_rlse_flg".trim(), length));
			String[] blNo         = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] autoEdiHldFlg = (JSPUtil.getParameter(request, prefix	+ "auto_edi_hld_flg", length));
			String[] printReleaseYn = (JSPUtil.getParameter(request, prefix	+ "print_release_yn", length));
			String[] orgPpdRcvCd = (JSPUtil.getParameter(request, prefix	+ "org_ppd_rcv_cd", length));
			String[] orgN3ptyPpdCd = (JSPUtil.getParameter(request, prefix	+ "org_n3pty_ppd_cd", length));
			
			String[] bkgRctNtcRcvFlg         = (JSPUtil.getParameter(request, prefix	+ "bkg_rct_ntc_rcv_flg".trim(), length));
			String[] mtyRlseOrdRcvFlg         = (JSPUtil.getParameter(request, prefix	+ "mty_rlse_ord_rcv_flg".trim(), length));
			String[] troNtcRcvFlg = (JSPUtil.getParameter(request, prefix	+ "tro_ntc_rcv_flg", length));
			String[] drftWblRcvFlg = (JSPUtil.getParameter(request, prefix	+ "drft_wbl_rcv_flg", length));
			String[] srndNtcRcvFlg = (JSPUtil.getParameter(request, prefix	+ "srnd_ntc_rcv_flg", length));
			String[] anRcvFlg = (JSPUtil.getParameter(request, prefix	+ "an_rcv_flg", length));
			
			String[] eurCgorFlg = (JSPUtil.getParameter(request, prefix	+ "eur_cgor_flg", length));
			String[] fcntrRlseFlg = (JSPUtil.getParameter(request, prefix	+ "fcntr_rlse_flg", length));
			String[] wblPrnFlg = (JSPUtil.getParameter(request, prefix	+ "wbl_prn_flg", length));
			String[] blCpyNo = (JSPUtil.getParameter(request, prefix	+ "bl_cpy_no", length));
			
			String[] blEsigFlg = (JSPUtil.getParameter(request, prefix	+ "bl_esig_flg", length));
			String[] blCpyEsigFlg = (JSPUtil.getParameter(request, prefix	+ "bl_cpy_esig_flg", length));
			String[] blKntFlg = (JSPUtil.getParameter(request, prefix	+ "bl_knt_flg", length));
			String[] blPrnChgTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_prn_chg_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgUsrDfltSetVO();
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (contiCd[i] != null)
					model.setContiCd(contiCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (docCctDpFlg[i] != null)
					model.setDocCctDpFlg(docCctDpFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (xptCstmsCctDpFlg[i] != null)
					model.setXptCstmsCctDpFlg(xptCstmsCctDpFlg[i]);
				if (mtyPkupYdCd[i] != null)
					model.setMtyPkupYdCd(mtyPkupYdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (anRmk[i] != null)
					model.setAnRmk(anRmk[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (preSkdVoyNo[i] != null)
					model.setPreSkdVoyNo(preSkdVoyNo[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (prnBlTpCd[i] != null)
					model.setPrnBlTpCd(prnBlTpCd[i]);
				if (drftBlCallSgnDpFlg[i] != null)
					model.setDrftBlCallSgnDpFlg(drftBlCallSgnDpFlg[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dfltEml[i] != null)
					model.setDfltEml(dfltEml[i]);
				if (drftBlXchRtDpFlg[i] != null)
					model.setDrftBlXchRtDpFlg(drftBlXchRtDpFlg[i]);
				if (drftBlRmk[i] != null)
					model.setDrftBlRmk(drftBlRmk[i]);
				if (fullRtnYdCd[i] != null)
					model.setFullRtnYdCd(fullRtnYdCd[i]);
				if (dfltPhnNo[i] != null)
					model.setDfltPhnNo(dfltPhnNo[i]);
				if (drftBlMrnNoDpFlg[i] != null)
					model.setDrftBlMrnNoDpFlg(drftBlMrnNoDpFlg[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (preSkdDirCd[i] != null)
					model.setPreSkdDirCd(preSkdDirCd[i]);
				if (anPrnRtFlg[i] != null)
					model.setAnPrnRtFlg(anPrnRtFlg[i]);
				if (railCctDpFlg[i] != null)
					model.setRailCctDpFlg(railCctDpFlg[i]);
				if (dfltFaxNo[i] != null)
					model.setDfltFaxNo(dfltFaxNo[i]);
				if (oblIssKnt[i] != null)
					model.setOblIssKnt(oblIssKnt[i]);
				if (prnBlRidrKnt[i] != null)
					model.setPrnBlRidrKnt(prnBlRidrKnt[i]);
				if (prnCntrTpCd[i] != null)
					model.setPrnCntrTpCd(prnCntrTpCd[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (fwrdFlg[i] != null)
					model.setFwrdFlg(fwrdFlg[i]);
				if (dotPrnFlg[i] != null)
					model.setDotPrnFlg(dotPrnFlg[i]);
				if (prnChgTpCd[i] != null)
					model.setPrnChgTpCd(prnChgTpCd[i]);
				if (prnBlFaceKnt[i] != null)
					model.setPrnBlFaceKnt(prnBlFaceKnt[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (rtnCctDpFlg[i] != null)
					model.setRtnCctDpFlg(rtnCctDpFlg[i]);
				if (tmlCctDpFlg[i] != null)
					model.setTmlCctDpFlg(tmlCctDpFlg[i]);
				if (preVslCd[i] != null)
					model.setPreVslCd(preVslCd[i]);
				
				if (blFacePrnDvcNm[i] != null)
					model.setBlFacePrnDvcNm(blFacePrnDvcNm[i]);
				if (blRidrPrnDvcNm[i] != null)
					model.setBlRidrPrnDvcNm(blRidrPrnDvcNm[i]);
				if (blPrnDvcNm[i] != null)
					model.setBlPrnDvcNm(blPrnDvcNm[i]);
				if (blPrnSetup[i] != null)
					model.setBlPrnSetup(blPrnSetup[i]);
				if (blTpCd[i] != null)
					model.setBlTpCd(blTpCd[i]);
				if (oblIssFlg[i] != null)
					model.setOblIssFlg(oblIssFlg[i]);
				if (oblRiderFlg[i] != null)
					model.setOblRiderFlg(oblRiderFlg[i]);
				if (oblPrnFlg[i] != null)
					model.setOblPrnFlg(oblPrnFlg[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (blCpyKnt[i] != null)
					model.setBlCpyKnt(blCpyKnt[i]);
				if (oblRlseFlg[i] != null)
					model.setOblRlseFlg(oblRlseFlg[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				
				if (autoEdiHldFlg[i] != null)
					model.setAutoEdiHldFlg(autoEdiHldFlg[i]);
				
				if (printReleaseYn[i] != null)
					model.setPrintReleaseYn(printReleaseYn[i]);
				
				if (orgPpdRcvCd[i] != null)
					model.setOrgPpdRcvCd(orgPpdRcvCd[i]);
				
				if (orgN3ptyPpdCd[i] != null)
					model.setOrgN3ptyPpdCd(orgN3ptyPpdCd[i]);
				
				
				if (bkgRctNtcRcvFlg[i] != null)
					model.setBkgRctNtcRcvFlg(bkgRctNtcRcvFlg[i]);
				if (mtyRlseOrdRcvFlg[i] != null)
					model.setMtyRlseOrdRcvFlg(mtyRlseOrdRcvFlg[i]);
				if (troNtcRcvFlg[i] != null)
					model.setTroNtcRcvFlg(troNtcRcvFlg[i]);
				if (drftWblRcvFlg[i] != null)
					model.setDrftWblRcvFlg(drftWblRcvFlg[i]);
				if (srndNtcRcvFlg[i] != null)
					model.setSrndNtcRcvFlg(srndNtcRcvFlg[i]);
				if (anRcvFlg[i] != null)
					model.setAnRcvFlg(anRcvFlg[i]);
				
				if (eurCgorFlg[i] != null)
					model.setEurCgorFlg(eurCgorFlg[i]);
				if (fcntrRlseFlg[i] != null)
					model.setFcntrRlseFlg(fcntrRlseFlg[i]);
				if (wblPrnFlg[i] != null)
					model.setWblPrnFlg(wblPrnFlg[i]);
				if (blCpyNo[i] != null)
					model.setBlCpyNo(blCpyNo[i]);

				if (blEsigFlg[i] != null)
					model.setBlEsigFlg(blEsigFlg[i]);
				if (blCpyEsigFlg[i] != null)
					model.setBlCpyEsigFlg(blCpyEsigFlg[i]);
				if (blKntFlg[i] != null)
					model.setBlKntFlg(blKntFlg[i]);
				if (blPrnChgTpCd[i] != null)
					model.setBlPrnChgTpCd(blPrnChgTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgUsrDfltSetVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return BkgUsrDfltSetVO[]
	 */
	public BkgUsrDfltSetVO[] getBkgUsrDfltSetVOs(){
		BkgUsrDfltSetVO[] vos = (BkgUsrDfltSetVO[])models.toArray(new BkgUsrDfltSetVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.contiCd = this.contiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docCctDpFlg = this.docCctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptCstmsCctDpFlg = this.xptCstmsCctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyPkupYdCd = this.mtyPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anRmk = this.anRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdVoyNo = this.preSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnBlTpCd = this.prnBlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBlCallSgnDpFlg = this.drftBlCallSgnDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltEml = this.dfltEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBlXchRtDpFlg = this.drftBlXchRtDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBlRmk = this.drftBlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullRtnYdCd = this.fullRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltPhnNo = this.dfltPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBlMrnNoDpFlg = this.drftBlMrnNoDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdDirCd = this.preSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anPrnRtFlg = this.anPrnRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCctDpFlg = this.railCctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltFaxNo = this.dfltFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssKnt = this.oblIssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnBlRidrKnt = this.prnBlRidrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnCntrTpCd = this.prnCntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdFlg = this.fwrdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dotPrnFlg = this.dotPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnChgTpCd = this.prnChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnBlFaceKnt = this.prnBlFaceKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnCctDpFlg = this.rtnCctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCctDpFlg = this.tmlCctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preVslCd = this.preVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blFacePrnDvcNm= this.blFacePrnDvcNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRidrPrnDvcNm= this.blRidrPrnDvcNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrnDvcNm= this.blPrnDvcNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrnSetup= this.blPrnSetup.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blTpCd= this.blTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssFlg= this.oblIssFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRiderFlg= this.oblRiderFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblPrnFlg= this.oblPrnFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg= this.bbCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCpyKnt= this.blCpyKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRlseFlg= this.oblRlseFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo= this.blNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoEdiHldFlg = this.autoEdiHldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.printReleaseYn = this.printReleaseYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPpdRcvCd = this.orgPpdRcvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgN3ptyPpdCd = this.orgN3ptyPpdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.bkgRctNtcRcvFlg= this.bkgRctNtcRcvFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRlseOrdRcvFlg= this.mtyRlseOrdRcvFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troNtcRcvFlg = this.troNtcRcvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftWblRcvFlg = this.drftWblRcvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srndNtcRcvFlg = this.srndNtcRcvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anRcvFlg = this.anRcvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.eurCgorFlg = this.eurCgorFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrRlseFlg = this.fcntrRlseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblPrnFlg = this.wblPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCpyNo = this.blCpyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.blEsigFlg = this.blEsigFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCpyEsigFlg = this.blCpyEsigFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blKntFlg = this.blKntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrnChgTpCd = this.blPrnChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
