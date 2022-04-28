/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsTmlCllVO.java
*@FileTitle : BkgCstmsTmlCllVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.15
*@LastModifier : 김승민
*@LastVersion : 1.0
* 2009.09.15 김승민 
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
 * @author 김승민
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsTmlCllVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsTmlCllVO> models = new ArrayList<BkgCstmsTmlCllVO>();
	
	/* Column Info */
	private String shprNm1 = null;
	/* Column Info */
	private String shprNm3 = null;
	/* Column Info */
	private String shprNm2 = null;
	/* Column Info */
	private String etaDt = null;
	/* Column Info */
	private String shprNm5 = null;
	/* Column Info */
	private String shprNm4 = null;
	/* Column Info */
	private String cntrVentRto = null;
	/* Column Info */
	private String ntfyNm5 = null;
	/* Column Info */
	private String ntfyNm4 = null;
	/* Column Info */
	private String ntfyNm3 = null;
	/* Column Info */
	private String ntfyNm2 = null;
	/* Column Info */
	private String ntfyNm1 = null;
	/* Column Info */
	private String cneeCntCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String grsWgtUtCd = null;
	/* Column Info */
	private String cntrMeasUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String repCmdtDesc = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cmdtDesc = null;
	/* Column Info */
	private String listRmk = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String ovrFwrdLen = null;
	/* Column Info */
	private String rdCgoFlg = null;
	/* Column Info */
	private String fltFileRefNo = null;
	/* Column Info */
	private String antfySeq = null;
	/* Column Info */
	private String ffCustSeq = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String tsPolCd = null;
	/* Column Info */
	private String ovrSdLen = null;
	/* Column Info */
	private String trnkVvdId = null;
	/* Column Info */
	private String fdoTemp = null;
	/* Column Info */
	private String etdDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String tsCgoCd = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String antfyNm1 = null;
	/* Column Info */
	private String antfyNm2 = null;
	/* Column Info */
	private String antfyNm3 = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String ovrHgt = null;
	/* Column Info */
	private String antfyNm4 = null;
	/* Column Info */
	private String antfyNm5 = null;
	/* Column Info */
	private String ovrPortLen = null;
	/* Column Info */
	private String ffNm5 = null;
	/* Column Info */
	private String ffNm4 = null;
	/* Column Info */
	private String ffNm3 = null;
	/* Column Info */
	private String ffNm2 = null;
	/* Column Info */
	private String ffNm1 = null;
	/* Column Info */
	private String teuCntrQty = null;
	/* Column Info */
	private String feuCntrQty = null;
	/* Column Info */
	private String ntfyCntCd = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String wgtTpCd = null;
	/* Column Info */
	private String tsVvdId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tsPodCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String ntfySeq = null;
	/* Column Info */
	private String creDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ediRcvStsCd = null;
	/* Column Info */
	private String blRmk = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String grsCntrWgt = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String dcgoFlg = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String ovrCntrWgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cneeNm1 = null;
	/* Column Info */
	private String cneeNm4 = null;
	/* Column Info */
	private String cneeNm5 = null;
	/* Column Info */
	private String cneeNm2 = null;
	/* Column Info */
	private String cneeNm3 = null;
	/* Column Info */
	private String cfmFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String blTpCd = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String tareCntrWgt = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String cneeSeq = null;
	/* Column Info */
	private String ovrWgtUtCd = null;
	/* Column Info */
	private String cdoTemp = null;
	/* Column Info */
	private String antfyCntCd = null;
	/* Column Info */
	private String cntrLodgNo = null;
	/* Column Info */
	private String ovrBkwdLen = null;
	/* Column Info */
	private String ffCntCd = null;
	/* Column Info */
	private String cntrSealNo = null;
	/* Column Info */
	private String vgmWgt = null;
	/* Column Info */
	private String vgmWgtUtCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsTmlCllVO() {}

	public BkgCstmsTmlCllVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String portCd, String bkgNo, String cntrNo, String cntrLodgNo, String etaDt, String etdDt, String blNo, String blTpCd, String sndDt, String porCd, String polCd, String podCd, String delCd, String shprCntCd, String shprSeq, String shprNm1, String shprNm2, String shprNm3, String shprNm4, String shprNm5, String cneeCntCd, String cneeSeq, String cneeNm1, String cneeNm2, String cneeNm3, String cneeNm4, String cneeNm5, String ntfyCntCd, String ntfySeq, String ntfyNm1, String ntfyNm2, String ntfyNm3, String ntfyNm4, String ntfyNm5, String antfyCntCd, String antfySeq, String antfyNm1, String antfyNm2, String antfyNm3, String antfyNm4, String antfyNm5, String ffCntCd, String ffCustSeq, String ffNm1, String ffNm2, String ffNm3, String ffNm4, String ffNm5, String cntrTpszCd, String socFlg, String fullMtyCd, String rcvTermCd, String deTermCd, String pckTpCd, String pckQty, String wgtTpCd, String cntrWgt, String grsWgtUtCd, String grsCntrWgt, String cntrMeasUtCd, String measQty, String ovrFwrdLen, String ovrBkwdLen, String ovrHgt, String ovrPortLen, String ovrSdLen, String ovrWgtUtCd, String ovrCntrWgt, String fdoTemp, String cdoTemp, String cntrVentRto, String cntrSealNo, String tsCgoCd, String tareCntrWgt, String tsVvdId, String tsPolCd, String tsPodCd, String cmdtCd, String cmdtDesc, String repCmdtCd, String repCmdtDesc, String trnkVvdId, String cfmFlg, String teuCntrQty, String feuCntrQty, String rcFlg, String dcgoFlg, String awkCgoFlg, String bbCgoFlg, String rdCgoFlg, String listRmk, String ediRcvStsCd, String blRmk, String fltFileRefNo, String creUsrId, String creDt, String updUsrId, String updDt, String vgmWgt, String vgmWgtUtCd) {
		this.shprNm1 = shprNm1;
		this.shprNm3 = shprNm3;
		this.shprNm2 = shprNm2;
		this.etaDt = etaDt;
		this.shprNm5 = shprNm5;
		this.shprNm4 = shprNm4;
		this.cntrVentRto = cntrVentRto;
		this.ntfyNm5 = ntfyNm5;
		this.ntfyNm4 = ntfyNm4;
		this.ntfyNm3 = ntfyNm3;
		this.ntfyNm2 = ntfyNm2;
		this.ntfyNm1 = ntfyNm1;
		this.cneeCntCd = cneeCntCd;
		this.pagerows = pagerows;
		this.cntrTpszCd = cntrTpszCd;
		this.grsWgtUtCd = grsWgtUtCd;
		this.cntrMeasUtCd = cntrMeasUtCd;
		this.updUsrId = updUsrId;
		this.cntrWgt = cntrWgt;
		this.repCmdtDesc = repCmdtDesc;
		this.shprCntCd = shprCntCd;
		this.skdVoyNo = skdVoyNo;
		this.podCd = podCd;
		this.bkgNo = bkgNo;
		this.cmdtDesc = cmdtDesc;
		this.listRmk = listRmk;
		this.fullMtyCd = fullMtyCd;
		this.shprSeq = shprSeq;
		this.rcFlg = rcFlg;
		this.ovrFwrdLen = ovrFwrdLen;
		this.rdCgoFlg = rdCgoFlg;
		this.fltFileRefNo = fltFileRefNo;
		this.antfySeq = antfySeq;
		this.ffCustSeq = ffCustSeq;
		this.cmdtCd = cmdtCd;
		this.pckTpCd = pckTpCd;
		this.tsPolCd = tsPolCd;
		this.ovrSdLen = ovrSdLen;
		this.trnkVvdId = trnkVvdId;
		this.fdoTemp = fdoTemp;
		this.etdDt = etdDt;
		this.cntrNo = cntrNo;
		this.repCmdtCd = repCmdtCd;
		this.vslCd = vslCd;
		this.tsCgoCd = tsCgoCd;
		this.sndDt = sndDt;
		this.blNo = blNo;
		this.antfyNm1 = antfyNm1;
		this.antfyNm2 = antfyNm2;
		this.antfyNm3 = antfyNm3;
		this.polCd = polCd;
		this.ovrHgt = ovrHgt;
		this.antfyNm4 = antfyNm4;
		this.antfyNm5 = antfyNm5;
		this.ovrPortLen = ovrPortLen;
		this.ffNm5 = ffNm5;
		this.ffNm4 = ffNm4;
		this.ffNm3 = ffNm3;
		this.ffNm2 = ffNm2;
		this.ffNm1 = ffNm1;
		this.teuCntrQty = teuCntrQty;
		this.feuCntrQty = feuCntrQty;
		this.ntfyCntCd = ntfyCntCd;
		this.awkCgoFlg = awkCgoFlg;
		this.delCd = delCd;
		this.wgtTpCd = wgtTpCd;
		this.tsVvdId = tsVvdId;
		this.creUsrId = creUsrId;
		this.tsPodCd = tsPodCd;
		this.porCd = porCd;
		this.ntfySeq = ntfySeq;
		this.creDt = creDt;
		this.ibflag = ibflag;
		this.ediRcvStsCd = ediRcvStsCd;
		this.blRmk = blRmk;
		this.bbCgoFlg = bbCgoFlg;
		this.grsCntrWgt = grsCntrWgt;
		this.measQty = measQty;
		this.dcgoFlg = dcgoFlg;
		this.pckQty = pckQty;
		this.portCd = portCd;
		this.rcvTermCd = rcvTermCd;
		this.ovrCntrWgt = ovrCntrWgt;
		this.updDt = updDt;
		this.cneeNm1 = cneeNm1;
		this.cneeNm4 = cneeNm4;
		this.cneeNm5 = cneeNm5;
		this.cneeNm2 = cneeNm2;
		this.cneeNm3 = cneeNm3;
		this.cfmFlg = cfmFlg;
		this.skdDirCd = skdDirCd;
		this.blTpCd = blTpCd;
		this.socFlg = socFlg;
		this.tareCntrWgt = tareCntrWgt;
		this.deTermCd = deTermCd;
		this.cneeSeq = cneeSeq;
		this.ovrWgtUtCd = ovrWgtUtCd;
		this.cdoTemp = cdoTemp;
		this.antfyCntCd = antfyCntCd;
		this.cntrLodgNo = cntrLodgNo;
		this.ovrBkwdLen = ovrBkwdLen;
		this.ffCntCd = ffCntCd;
		this.cntrSealNo = cntrSealNo;
		this.vgmWgt = vgmWgt;
		this.vgmWgtUtCd = vgmWgtUtCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("shpr_nm1", getShprNm1());
		this.hashColumns.put("shpr_nm3", getShprNm3());
		this.hashColumns.put("shpr_nm2", getShprNm2());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("shpr_nm5", getShprNm5());
		this.hashColumns.put("shpr_nm4", getShprNm4());
		this.hashColumns.put("cntr_vent_rto", getCntrVentRto());
		this.hashColumns.put("ntfy_nm5", getNtfyNm5());
		this.hashColumns.put("ntfy_nm4", getNtfyNm4());
		this.hashColumns.put("ntfy_nm3", getNtfyNm3());
		this.hashColumns.put("ntfy_nm2", getNtfyNm2());
		this.hashColumns.put("ntfy_nm1", getNtfyNm1());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("grs_wgt_ut_cd", getGrsWgtUtCd());
		this.hashColumns.put("cntr_meas_ut_cd", getCntrMeasUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("rep_cmdt_desc", getRepCmdtDesc());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cmdt_desc", getCmdtDesc());
		this.hashColumns.put("list_rmk", getListRmk());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("ovr_fwrd_len", getOvrFwrdLen());
		this.hashColumns.put("rd_cgo_flg", getRdCgoFlg());
		this.hashColumns.put("flt_file_ref_no", getFltFileRefNo());
		this.hashColumns.put("antfy_seq", getAntfySeq());
		this.hashColumns.put("ff_cust_seq", getFfCustSeq());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("ts_pol_cd", getTsPolCd());
		this.hashColumns.put("ovr_sd_len", getOvrSdLen());
		this.hashColumns.put("trnk_vvd_id", getTrnkVvdId());
		this.hashColumns.put("fdo_temp", getFdoTemp());
		this.hashColumns.put("etd_dt", getEtdDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ts_cgo_cd", getTsCgoCd());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("antfy_nm1", getAntfyNm1());
		this.hashColumns.put("antfy_nm2", getAntfyNm2());
		this.hashColumns.put("antfy_nm3", getAntfyNm3());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ovr_hgt", getOvrHgt());
		this.hashColumns.put("antfy_nm4", getAntfyNm4());
		this.hashColumns.put("antfy_nm5", getAntfyNm5());
		this.hashColumns.put("ovr_port_len", getOvrPortLen());
		this.hashColumns.put("ff_nm5", getFfNm5());
		this.hashColumns.put("ff_nm4", getFfNm4());
		this.hashColumns.put("ff_nm3", getFfNm3());
		this.hashColumns.put("ff_nm2", getFfNm2());
		this.hashColumns.put("ff_nm1", getFfNm1());
		this.hashColumns.put("teu_cntr_qty", getTeuCntrQty());
		this.hashColumns.put("feu_cntr_qty", getFeuCntrQty());
		this.hashColumns.put("ntfy_cnt_cd", getNtfyCntCd());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("wgt_tp_cd", getWgtTpCd());
		this.hashColumns.put("ts_vvd_id", getTsVvdId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ts_pod_cd", getTsPodCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("ntfy_seq", getNtfySeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edi_rcv_sts_cd", getEdiRcvStsCd());
		this.hashColumns.put("bl_rmk", getBlRmk());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("grs_cntr_wgt", getGrsCntrWgt());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("dcgo_flg", getDcgoFlg());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("ovr_cntr_wgt", getOvrCntrWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cnee_nm1", getCneeNm1());
		this.hashColumns.put("cnee_nm4", getCneeNm4());
		this.hashColumns.put("cnee_nm5", getCneeNm5());
		this.hashColumns.put("cnee_nm2", getCneeNm2());
		this.hashColumns.put("cnee_nm3", getCneeNm3());
		this.hashColumns.put("cfm_flg", getCfmFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("bl_tp_cd", getBlTpCd());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("tare_cntr_wgt", getTareCntrWgt());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cnee_seq", getCneeSeq());
		this.hashColumns.put("ovr_wgt_ut_cd", getOvrWgtUtCd());
		this.hashColumns.put("cdo_temp", getCdoTemp());
		this.hashColumns.put("antfy_cnt_cd", getAntfyCntCd());
		this.hashColumns.put("cntr_lodg_no", getCntrLodgNo());
		this.hashColumns.put("ovr_bkwd_len", getOvrBkwdLen());
		this.hashColumns.put("ff_cnt_cd", getFfCntCd());
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());
		this.hashColumns.put("vgm_wgt", getVgmWgt());
		this.hashColumns.put("vgm_wgt_ut_cd", getVgmWgtUtCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("shpr_nm1", "shprNm1");
		this.hashFields.put("shpr_nm3", "shprNm3");
		this.hashFields.put("shpr_nm2", "shprNm2");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("shpr_nm5", "shprNm5");
		this.hashFields.put("shpr_nm4", "shprNm4");
		this.hashFields.put("cntr_vent_rto", "cntrVentRto");
		this.hashFields.put("ntfy_nm5", "ntfyNm5");
		this.hashFields.put("ntfy_nm4", "ntfyNm4");
		this.hashFields.put("ntfy_nm3", "ntfyNm3");
		this.hashFields.put("ntfy_nm2", "ntfyNm2");
		this.hashFields.put("ntfy_nm1", "ntfyNm1");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("grs_wgt_ut_cd", "grsWgtUtCd");
		this.hashFields.put("cntr_meas_ut_cd", "cntrMeasUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("rep_cmdt_desc", "repCmdtDesc");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cmdt_desc", "cmdtDesc");
		this.hashFields.put("list_rmk", "listRmk");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("ovr_fwrd_len", "ovrFwrdLen");
		this.hashFields.put("rd_cgo_flg", "rdCgoFlg");
		this.hashFields.put("flt_file_ref_no", "fltFileRefNo");
		this.hashFields.put("antfy_seq", "antfySeq");
		this.hashFields.put("ff_cust_seq", "ffCustSeq");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("ts_pol_cd", "tsPolCd");
		this.hashFields.put("ovr_sd_len", "ovrSdLen");
		this.hashFields.put("trnk_vvd_id", "trnkVvdId");
		this.hashFields.put("fdo_temp", "fdoTemp");
		this.hashFields.put("etd_dt", "etdDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ts_cgo_cd", "tsCgoCd");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("antfy_nm1", "antfyNm1");
		this.hashFields.put("antfy_nm2", "antfyNm2");
		this.hashFields.put("antfy_nm3", "antfyNm3");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ovr_hgt", "ovrHgt");
		this.hashFields.put("antfy_nm4", "antfyNm4");
		this.hashFields.put("antfy_nm5", "antfyNm5");
		this.hashFields.put("ovr_port_len", "ovrPortLen");
		this.hashFields.put("ff_nm5", "ffNm5");
		this.hashFields.put("ff_nm4", "ffNm4");
		this.hashFields.put("ff_nm3", "ffNm3");
		this.hashFields.put("ff_nm2", "ffNm2");
		this.hashFields.put("ff_nm1", "ffNm1");
		this.hashFields.put("teu_cntr_qty", "teuCntrQty");
		this.hashFields.put("feu_cntr_qty", "feuCntrQty");
		this.hashFields.put("ntfy_cnt_cd", "ntfyCntCd");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("wgt_tp_cd", "wgtTpCd");
		this.hashFields.put("ts_vvd_id", "tsVvdId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ts_pod_cd", "tsPodCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("ntfy_seq", "ntfySeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edi_rcv_sts_cd", "ediRcvStsCd");
		this.hashFields.put("bl_rmk", "blRmk");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("grs_cntr_wgt", "grsCntrWgt");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("dcgo_flg", "dcgoFlg");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("ovr_cntr_wgt", "ovrCntrWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cnee_nm1", "cneeNm1");
		this.hashFields.put("cnee_nm4", "cneeNm4");
		this.hashFields.put("cnee_nm5", "cneeNm5");
		this.hashFields.put("cnee_nm2", "cneeNm2");
		this.hashFields.put("cnee_nm3", "cneeNm3");
		this.hashFields.put("cfm_flg", "cfmFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("bl_tp_cd", "blTpCd");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("tare_cntr_wgt", "tareCntrWgt");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cnee_seq", "cneeSeq");
		this.hashFields.put("ovr_wgt_ut_cd", "ovrWgtUtCd");
		this.hashFields.put("cdo_temp", "cdoTemp");
		this.hashFields.put("antfy_cnt_cd", "antfyCntCd");
		this.hashFields.put("cntr_lodg_no", "cntrLodgNo");
		this.hashFields.put("ovr_bkwd_len", "ovrBkwdLen");
		this.hashFields.put("ff_cnt_cd", "ffCntCd");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("vgm_wgt", "vgmWgt");
		this.hashFields.put("vgmWgtUtCd", "vgmWgtUtCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return shprNm1
	 */
	public String getShprNm1() {
		return this.shprNm1;
	}
	
	/**
	 * Column Info
	 * @return shprNm3
	 */
	public String getShprNm3() {
		return this.shprNm3;
	}
	
	/**
	 * Column Info
	 * @return shprNm2
	 */
	public String getShprNm2() {
		return this.shprNm2;
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
	 * @return shprNm5
	 */
	public String getShprNm5() {
		return this.shprNm5;
	}
	
	/**
	 * Column Info
	 * @return shprNm4
	 */
	public String getShprNm4() {
		return this.shprNm4;
	}
	
	/**
	 * Column Info
	 * @return cntrVentRto
	 */
	public String getCntrVentRto() {
		return this.cntrVentRto;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm5
	 */
	public String getNtfyNm5() {
		return this.ntfyNm5;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm4
	 */
	public String getNtfyNm4() {
		return this.ntfyNm4;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm3
	 */
	public String getNtfyNm3() {
		return this.ntfyNm3;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm2
	 */
	public String getNtfyNm2() {
		return this.ntfyNm2;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm1
	 */
	public String getNtfyNm1() {
		return this.ntfyNm1;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return grsWgtUtCd
	 */
	public String getGrsWgtUtCd() {
		return this.grsWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return cntrMeasUtCd
	 */
	public String getCntrMeasUtCd() {
		return this.cntrMeasUtCd;
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
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	
	/**
	 * Column Info
	 * @return repCmdtDesc
	 */
	public String getRepCmdtDesc() {
		return this.repCmdtDesc;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
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
	 * @return cmdtDesc
	 */
	public String getCmdtDesc() {
		return this.cmdtDesc;
	}
	
	/**
	 * Column Info
	 * @return listRmk
	 */
	public String getListRmk() {
		return this.listRmk;
	}
	
	/**
	 * Column Info
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return shprSeq
	 */
	public String getShprSeq() {
		return this.shprSeq;
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
	 * @return ovrFwrdLen
	 */
	public String getOvrFwrdLen() {
		return this.ovrFwrdLen;
	}
	
	/**
	 * Column Info
	 * @return rdCgoFlg
	 */
	public String getRdCgoFlg() {
		return this.rdCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return fltFileRefNo
	 */
	public String getFltFileRefNo() {
		return this.fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @return antfySeq
	 */
	public String getAntfySeq() {
		return this.antfySeq;
	}
	
	/**
	 * Column Info
	 * @return ffCustSeq
	 */
	public String getFfCustSeq() {
		return this.ffCustSeq;
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
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
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
	 * @return ovrSdLen
	 */
	public String getOvrSdLen() {
		return this.ovrSdLen;
	}
	
	/**
	 * Column Info
	 * @return trnkVvdId
	 */
	public String getTrnkVvdId() {
		return this.trnkVvdId;
	}
	
	/**
	 * Column Info
	 * @return fdoTemp
	 */
	public String getFdoTemp() {
		return this.fdoTemp;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
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
	 * @return tsCgoCd
	 */
	public String getTsCgoCd() {
		return this.tsCgoCd;
	}
	
	/**
	 * Column Info
	 * @return sndDt
	 */
	public String getSndDt() {
		return this.sndDt;
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
	 * @return antfyNm1
	 */
	public String getAntfyNm1() {
		return this.antfyNm1;
	}
	
	/**
	 * Column Info
	 * @return antfyNm2
	 */
	public String getAntfyNm2() {
		return this.antfyNm2;
	}
	
	/**
	 * Column Info
	 * @return antfyNm3
	 */
	public String getAntfyNm3() {
		return this.antfyNm3;
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
	 * @return ovrHgt
	 */
	public String getOvrHgt() {
		return this.ovrHgt;
	}
	
	/**
	 * Column Info
	 * @return antfyNm4
	 */
	public String getAntfyNm4() {
		return this.antfyNm4;
	}
	
	/**
	 * Column Info
	 * @return antfyNm5
	 */
	public String getAntfyNm5() {
		return this.antfyNm5;
	}
	
	/**
	 * Column Info
	 * @return ovrPortLen
	 */
	public String getOvrPortLen() {
		return this.ovrPortLen;
	}
	
	/**
	 * Column Info
	 * @return ffNm5
	 */
	public String getFfNm5() {
		return this.ffNm5;
	}
	
	/**
	 * Column Info
	 * @return ffNm4
	 */
	public String getFfNm4() {
		return this.ffNm4;
	}
	
	/**
	 * Column Info
	 * @return ffNm3
	 */
	public String getFfNm3() {
		return this.ffNm3;
	}
	
	/**
	 * Column Info
	 * @return ffNm2
	 */
	public String getFfNm2() {
		return this.ffNm2;
	}
	
	/**
	 * Column Info
	 * @return ffNm1
	 */
	public String getFfNm1() {
		return this.ffNm1;
	}
	
	/**
	 * Column Info
	 * @return teuCntrQty
	 */
	public String getTeuCntrQty() {
		return this.teuCntrQty;
	}
	
	/**
	 * Column Info
	 * @return feuCntrQty
	 */
	public String getFeuCntrQty() {
		return this.feuCntrQty;
	}
	
	/**
	 * Column Info
	 * @return ntfyCntCd
	 */
	public String getNtfyCntCd() {
		return this.ntfyCntCd;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return wgtTpCd
	 */
	public String getWgtTpCd() {
		return this.wgtTpCd;
	}
	
	/**
	 * Column Info
	 * @return tsVvdId
	 */
	public String getTsVvdId() {
		return this.tsVvdId;
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
	 * @return tsPodCd
	 */
	public String getTsPodCd() {
		return this.tsPodCd;
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
	 * @return ntfySeq
	 */
	public String getNtfySeq() {
		return this.ntfySeq;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return ediRcvStsCd
	 */
	public String getEdiRcvStsCd() {
		return this.ediRcvStsCd;
	}
	
	/**
	 * Column Info
	 * @return blRmk
	 */
	public String getBlRmk() {
		return this.blRmk;
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
	 * @return grsCntrWgt
	 */
	public String getGrsCntrWgt() {
		return this.grsCntrWgt;
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
	 * @return dcgoFlg
	 */
	public String getDcgoFlg() {
		return this.dcgoFlg;
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
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
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
	 * @return ovrCntrWgt
	 */
	public String getOvrCntrWgt() {
		return this.ovrCntrWgt;
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
	 * @return cneeNm1
	 */
	public String getCneeNm1() {
		return this.cneeNm1;
	}
	
	/**
	 * Column Info
	 * @return cneeNm4
	 */
	public String getCneeNm4() {
		return this.cneeNm4;
	}
	
	/**
	 * Column Info
	 * @return cneeNm5
	 */
	public String getCneeNm5() {
		return this.cneeNm5;
	}
	
	/**
	 * Column Info
	 * @return cneeNm2
	 */
	public String getCneeNm2() {
		return this.cneeNm2;
	}
	
	/**
	 * Column Info
	 * @return cneeNm3
	 */
	public String getCneeNm3() {
		return this.cneeNm3;
	}
	
	/**
	 * Column Info
	 * @return cfmFlg
	 */
	public String getCfmFlg() {
		return this.cfmFlg;
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
	 * @return blTpCd
	 */
	public String getBlTpCd() {
		return this.blTpCd;
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
	 * @return tareCntrWgt
	 */
	public String getTareCntrWgt() {
		return this.tareCntrWgt;
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
	 * @return cneeSeq
	 */
	public String getCneeSeq() {
		return this.cneeSeq;
	}
	
	/**
	 * Column Info
	 * @return ovrWgtUtCd
	 */
	public String getOvrWgtUtCd() {
		return this.ovrWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return cdoTemp
	 */
	public String getCdoTemp() {
		return this.cdoTemp;
	}
	
	/**
	 * Column Info
	 * @return antfyCntCd
	 */
	public String getAntfyCntCd() {
		return this.antfyCntCd;
	}
	
	/**
	 * Column Info
	 * @return cntrLodgNo
	 */
	public String getCntrLodgNo() {
		return this.cntrLodgNo;
	}
	
	/**
	 * Column Info
	 * @return ovrBkwdLen
	 */
	public String getOvrBkwdLen() {
		return this.ovrBkwdLen;
	}
	
	/**
	 * Column Info
	 * @return ffCntCd
	 */
	public String getFfCntCd() {
		return this.ffCntCd;
	}
	
	/**
	 * Column Info
	 * @return cntrSealNo
	 */
	public String getCntrSealNo() {
		return this.cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @return vgmWgt
	 */
	public String getVgmWgt() {
		return this.vgmWgt;
	}
	
	/**
	 * Column Info
	 * @return vgmWgtUtCd
	 */
	public String getVgmWgtUtCd() {
		return this.vgmWgtUtCd;
	}
	

	/**
	 * Column Info
	 * @param shprNm1
	 */
	public void setShprNm1(String shprNm1) {
		this.shprNm1 = shprNm1;
	}
	
	/**
	 * Column Info
	 * @param shprNm3
	 */
	public void setShprNm3(String shprNm3) {
		this.shprNm3 = shprNm3;
	}
	
	/**
	 * Column Info
	 * @param shprNm2
	 */
	public void setShprNm2(String shprNm2) {
		this.shprNm2 = shprNm2;
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
	 * @param shprNm5
	 */
	public void setShprNm5(String shprNm5) {
		this.shprNm5 = shprNm5;
	}
	
	/**
	 * Column Info
	 * @param shprNm4
	 */
	public void setShprNm4(String shprNm4) {
		this.shprNm4 = shprNm4;
	}
	
	/**
	 * Column Info
	 * @param cntrVentRto
	 */
	public void setCntrVentRto(String cntrVentRto) {
		this.cntrVentRto = cntrVentRto;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm5
	 */
	public void setNtfyNm5(String ntfyNm5) {
		this.ntfyNm5 = ntfyNm5;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm4
	 */
	public void setNtfyNm4(String ntfyNm4) {
		this.ntfyNm4 = ntfyNm4;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm3
	 */
	public void setNtfyNm3(String ntfyNm3) {
		this.ntfyNm3 = ntfyNm3;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm2
	 */
	public void setNtfyNm2(String ntfyNm2) {
		this.ntfyNm2 = ntfyNm2;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm1
	 */
	public void setNtfyNm1(String ntfyNm1) {
		this.ntfyNm1 = ntfyNm1;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param grsWgtUtCd
	 */
	public void setGrsWgtUtCd(String grsWgtUtCd) {
		this.grsWgtUtCd = grsWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param cntrMeasUtCd
	 */
	public void setCntrMeasUtCd(String cntrMeasUtCd) {
		this.cntrMeasUtCd = cntrMeasUtCd;
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
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
	}
	
	/**
	 * Column Info
	 * @param repCmdtDesc
	 */
	public void setRepCmdtDesc(String repCmdtDesc) {
		this.repCmdtDesc = repCmdtDesc;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
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
	 * @param cmdtDesc
	 */
	public void setCmdtDesc(String cmdtDesc) {
		this.cmdtDesc = cmdtDesc;
	}
	
	/**
	 * Column Info
	 * @param listRmk
	 */
	public void setListRmk(String listRmk) {
		this.listRmk = listRmk;
	}
	
	/**
	 * Column Info
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param shprSeq
	 */
	public void setShprSeq(String shprSeq) {
		this.shprSeq = shprSeq;
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
	 * @param ovrFwrdLen
	 */
	public void setOvrFwrdLen(String ovrFwrdLen) {
		this.ovrFwrdLen = ovrFwrdLen;
	}
	
	/**
	 * Column Info
	 * @param rdCgoFlg
	 */
	public void setRdCgoFlg(String rdCgoFlg) {
		this.rdCgoFlg = rdCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param fltFileRefNo
	 */
	public void setFltFileRefNo(String fltFileRefNo) {
		this.fltFileRefNo = fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @param antfySeq
	 */
	public void setAntfySeq(String antfySeq) {
		this.antfySeq = antfySeq;
	}
	
	/**
	 * Column Info
	 * @param ffCustSeq
	 */
	public void setFfCustSeq(String ffCustSeq) {
		this.ffCustSeq = ffCustSeq;
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
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
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
	 * @param ovrSdLen
	 */
	public void setOvrSdLen(String ovrSdLen) {
		this.ovrSdLen = ovrSdLen;
	}
	
	/**
	 * Column Info
	 * @param trnkVvdId
	 */
	public void setTrnkVvdId(String trnkVvdId) {
		this.trnkVvdId = trnkVvdId;
	}
	
	/**
	 * Column Info
	 * @param fdoTemp
	 */
	public void setFdoTemp(String fdoTemp) {
		this.fdoTemp = fdoTemp;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
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
	 * @param tsCgoCd
	 */
	public void setTsCgoCd(String tsCgoCd) {
		this.tsCgoCd = tsCgoCd;
	}
	
	/**
	 * Column Info
	 * @param sndDt
	 */
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
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
	 * @param antfyNm1
	 */
	public void setAntfyNm1(String antfyNm1) {
		this.antfyNm1 = antfyNm1;
	}
	
	/**
	 * Column Info
	 * @param antfyNm2
	 */
	public void setAntfyNm2(String antfyNm2) {
		this.antfyNm2 = antfyNm2;
	}
	
	/**
	 * Column Info
	 * @param antfyNm3
	 */
	public void setAntfyNm3(String antfyNm3) {
		this.antfyNm3 = antfyNm3;
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
	 * @param ovrHgt
	 */
	public void setOvrHgt(String ovrHgt) {
		this.ovrHgt = ovrHgt;
	}
	
	/**
	 * Column Info
	 * @param antfyNm4
	 */
	public void setAntfyNm4(String antfyNm4) {
		this.antfyNm4 = antfyNm4;
	}
	
	/**
	 * Column Info
	 * @param antfyNm5
	 */
	public void setAntfyNm5(String antfyNm5) {
		this.antfyNm5 = antfyNm5;
	}
	
	/**
	 * Column Info
	 * @param ovrPortLen
	 */
	public void setOvrPortLen(String ovrPortLen) {
		this.ovrPortLen = ovrPortLen;
	}
	
	/**
	 * Column Info
	 * @param ffNm5
	 */
	public void setFfNm5(String ffNm5) {
		this.ffNm5 = ffNm5;
	}
	
	/**
	 * Column Info
	 * @param ffNm4
	 */
	public void setFfNm4(String ffNm4) {
		this.ffNm4 = ffNm4;
	}
	
	/**
	 * Column Info
	 * @param ffNm3
	 */
	public void setFfNm3(String ffNm3) {
		this.ffNm3 = ffNm3;
	}
	
	/**
	 * Column Info
	 * @param ffNm2
	 */
	public void setFfNm2(String ffNm2) {
		this.ffNm2 = ffNm2;
	}
	
	/**
	 * Column Info
	 * @param ffNm1
	 */
	public void setFfNm1(String ffNm1) {
		this.ffNm1 = ffNm1;
	}
	
	/**
	 * Column Info
	 * @param teuCntrQty
	 */
	public void setTeuCntrQty(String teuCntrQty) {
		this.teuCntrQty = teuCntrQty;
	}
	
	/**
	 * Column Info
	 * @param feuCntrQty
	 */
	public void setFeuCntrQty(String feuCntrQty) {
		this.feuCntrQty = feuCntrQty;
	}
	
	/**
	 * Column Info
	 * @param ntfyCntCd
	 */
	public void setNtfyCntCd(String ntfyCntCd) {
		this.ntfyCntCd = ntfyCntCd;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param wgtTpCd
	 */
	public void setWgtTpCd(String wgtTpCd) {
		this.wgtTpCd = wgtTpCd;
	}
	
	/**
	 * Column Info
	 * @param tsVvdId
	 */
	public void setTsVvdId(String tsVvdId) {
		this.tsVvdId = tsVvdId;
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
	 * @param tsPodCd
	 */
	public void setTsPodCd(String tsPodCd) {
		this.tsPodCd = tsPodCd;
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
	 * @param ntfySeq
	 */
	public void setNtfySeq(String ntfySeq) {
		this.ntfySeq = ntfySeq;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param ediRcvStsCd
	 */
	public void setEdiRcvStsCd(String ediRcvStsCd) {
		this.ediRcvStsCd = ediRcvStsCd;
	}
	
	/**
	 * Column Info
	 * @param blRmk
	 */
	public void setBlRmk(String blRmk) {
		this.blRmk = blRmk;
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
	 * @param grsCntrWgt
	 */
	public void setGrsCntrWgt(String grsCntrWgt) {
		this.grsCntrWgt = grsCntrWgt;
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
	 * @param dcgoFlg
	 */
	public void setDcgoFlg(String dcgoFlg) {
		this.dcgoFlg = dcgoFlg;
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
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
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
	 * @param ovrCntrWgt
	 */
	public void setOvrCntrWgt(String ovrCntrWgt) {
		this.ovrCntrWgt = ovrCntrWgt;
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
	 * @param cneeNm1
	 */
	public void setCneeNm1(String cneeNm1) {
		this.cneeNm1 = cneeNm1;
	}
	
	/**
	 * Column Info
	 * @param cneeNm4
	 */
	public void setCneeNm4(String cneeNm4) {
		this.cneeNm4 = cneeNm4;
	}
	
	/**
	 * Column Info
	 * @param cneeNm5
	 */
	public void setCneeNm5(String cneeNm5) {
		this.cneeNm5 = cneeNm5;
	}
	
	/**
	 * Column Info
	 * @param cneeNm2
	 */
	public void setCneeNm2(String cneeNm2) {
		this.cneeNm2 = cneeNm2;
	}
	
	/**
	 * Column Info
	 * @param cneeNm3
	 */
	public void setCneeNm3(String cneeNm3) {
		this.cneeNm3 = cneeNm3;
	}
	
	/**
	 * Column Info
	 * @param cfmFlg
	 */
	public void setCfmFlg(String cfmFlg) {
		this.cfmFlg = cfmFlg;
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
	 * @param blTpCd
	 */
	public void setBlTpCd(String blTpCd) {
		this.blTpCd = blTpCd;
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
	 * @param tareCntrWgt
	 */
	public void setTareCntrWgt(String tareCntrWgt) {
		this.tareCntrWgt = tareCntrWgt;
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
	 * @param cneeSeq
	 */
	public void setCneeSeq(String cneeSeq) {
		this.cneeSeq = cneeSeq;
	}
	
	/**
	 * Column Info
	 * @param ovrWgtUtCd
	 */
	public void setOvrWgtUtCd(String ovrWgtUtCd) {
		this.ovrWgtUtCd = ovrWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param cdoTemp
	 */
	public void setCdoTemp(String cdoTemp) {
		this.cdoTemp = cdoTemp;
	}
	
	/**
	 * Column Info
	 * @param antfyCntCd
	 */
	public void setAntfyCntCd(String antfyCntCd) {
		this.antfyCntCd = antfyCntCd;
	}
	
	/**
	 * Column Info
	 * @param cntrLodgNo
	 */
	public void setCntrLodgNo(String cntrLodgNo) {
		this.cntrLodgNo = cntrLodgNo;
	}
	
	/**
	 * Column Info
	 * @param ovrBkwdLen
	 */
	public void setOvrBkwdLen(String ovrBkwdLen) {
		this.ovrBkwdLen = ovrBkwdLen;
	}
	
	/**
	 * Column Info
	 * @param ffCntCd
	 */
	public void setFfCntCd(String ffCntCd) {
		this.ffCntCd = ffCntCd;
	}
	
	/**
	 * Column Info
	 * @param cntrSealNo
	 */
	public void setCntrSealNo(String cntrSealNo) {
		this.cntrSealNo = cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @param vgmWgt
	 */
	public void setVgmWgt(String vgmWgt) {
		this.vgmWgt = vgmWgt;
	}
	
	/**
	 * Column Info
	 * @param vgmWgtUtCd
	 */
	public void setVgmWgtUtCd(String vgmWgtUtCd) {
		this.vgmWgtUtCd = vgmWgtUtCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setShprNm1(JSPUtil.getParameter(request, "shpr_nm1", ""));
		setShprNm3(JSPUtil.getParameter(request, "shpr_nm3", ""));
		setShprNm2(JSPUtil.getParameter(request, "shpr_nm2", ""));
		setEtaDt(JSPUtil.getParameter(request, "eta_dt", ""));
		setShprNm5(JSPUtil.getParameter(request, "shpr_nm5", ""));
		setShprNm4(JSPUtil.getParameter(request, "shpr_nm4", ""));
		setCntrVentRto(JSPUtil.getParameter(request, "cntr_vent_rto", ""));
		setNtfyNm5(JSPUtil.getParameter(request, "ntfy_nm5", ""));
		setNtfyNm4(JSPUtil.getParameter(request, "ntfy_nm4", ""));
		setNtfyNm3(JSPUtil.getParameter(request, "ntfy_nm3", ""));
		setNtfyNm2(JSPUtil.getParameter(request, "ntfy_nm2", ""));
		setNtfyNm1(JSPUtil.getParameter(request, "ntfy_nm1", ""));
		setCneeCntCd(JSPUtil.getParameter(request, "cnee_cnt_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setGrsWgtUtCd(JSPUtil.getParameter(request, "grs_wgt_ut_cd", ""));
		setCntrMeasUtCd(JSPUtil.getParameter(request, "cntr_meas_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setRepCmdtDesc(JSPUtil.getParameter(request, "rep_cmdt_desc", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCmdtDesc(JSPUtil.getParameter(request, "cmdt_desc", ""));
		setListRmk(JSPUtil.getParameter(request, "list_rmk", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setShprSeq(JSPUtil.getParameter(request, "shpr_seq", ""));
		setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
		setOvrFwrdLen(JSPUtil.getParameter(request, "ovr_fwrd_len", ""));
		setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
		setFltFileRefNo(JSPUtil.getParameter(request, "flt_file_ref_no", ""));
		setAntfySeq(JSPUtil.getParameter(request, "antfy_seq", ""));
		setFfCustSeq(JSPUtil.getParameter(request, "ff_cust_seq", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setTsPolCd(JSPUtil.getParameter(request, "ts_pol_cd", ""));
		setOvrSdLen(JSPUtil.getParameter(request, "ovr_sd_len", ""));
		setTrnkVvdId(JSPUtil.getParameter(request, "trnk_vvd_id", ""));
		setFdoTemp(JSPUtil.getParameter(request, "fdo_temp", ""));
		setEtdDt(JSPUtil.getParameter(request, "etd_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setTsCgoCd(JSPUtil.getParameter(request, "ts_cgo_cd", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setAntfyNm1(JSPUtil.getParameter(request, "antfy_nm1", ""));
		setAntfyNm2(JSPUtil.getParameter(request, "antfy_nm2", ""));
		setAntfyNm3(JSPUtil.getParameter(request, "antfy_nm3", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setOvrHgt(JSPUtil.getParameter(request, "ovr_hgt", ""));
		setAntfyNm4(JSPUtil.getParameter(request, "antfy_nm4", ""));
		setAntfyNm5(JSPUtil.getParameter(request, "antfy_nm5", ""));
		setOvrPortLen(JSPUtil.getParameter(request, "ovr_port_len", ""));
		setFfNm5(JSPUtil.getParameter(request, "ff_nm5", ""));
		setFfNm4(JSPUtil.getParameter(request, "ff_nm4", ""));
		setFfNm3(JSPUtil.getParameter(request, "ff_nm3", ""));
		setFfNm2(JSPUtil.getParameter(request, "ff_nm2", ""));
		setFfNm1(JSPUtil.getParameter(request, "ff_nm1", ""));
		setTeuCntrQty(JSPUtil.getParameter(request, "teu_cntr_qty", ""));
		setFeuCntrQty(JSPUtil.getParameter(request, "feu_cntr_qty", ""));
		setNtfyCntCd(JSPUtil.getParameter(request, "ntfy_cnt_cd", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setWgtTpCd(JSPUtil.getParameter(request, "wgt_tp_cd", ""));
		setTsVvdId(JSPUtil.getParameter(request, "ts_vvd_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTsPodCd(JSPUtil.getParameter(request, "ts_pod_cd", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setNtfySeq(JSPUtil.getParameter(request, "ntfy_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEdiRcvStsCd(JSPUtil.getParameter(request, "edi_rcv_sts_cd", ""));
		setBlRmk(JSPUtil.getParameter(request, "bl_rmk", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setGrsCntrWgt(JSPUtil.getParameter(request, "grs_cntr_wgt", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setOvrCntrWgt(JSPUtil.getParameter(request, "ovr_cntr_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCneeNm1(JSPUtil.getParameter(request, "cnee_nm1", ""));
		setCneeNm4(JSPUtil.getParameter(request, "cnee_nm4", ""));
		setCneeNm5(JSPUtil.getParameter(request, "cnee_nm5", ""));
		setCneeNm2(JSPUtil.getParameter(request, "cnee_nm2", ""));
		setCneeNm3(JSPUtil.getParameter(request, "cnee_nm3", ""));
		setCfmFlg(JSPUtil.getParameter(request, "cfm_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setTareCntrWgt(JSPUtil.getParameter(request, "tare_cntr_wgt", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCneeSeq(JSPUtil.getParameter(request, "cnee_seq", ""));
		setOvrWgtUtCd(JSPUtil.getParameter(request, "ovr_wgt_ut_cd", ""));
		setCdoTemp(JSPUtil.getParameter(request, "cdo_temp", ""));
		setAntfyCntCd(JSPUtil.getParameter(request, "antfy_cnt_cd", ""));
		setCntrLodgNo(JSPUtil.getParameter(request, "cntr_lodg_no", ""));
		setOvrBkwdLen(JSPUtil.getParameter(request, "ovr_bkwd_len", ""));
		setFfCntCd(JSPUtil.getParameter(request, "ff_cnt_cd", ""));
		setCntrSealNo(JSPUtil.getParameter(request, "cntr_seal_no", ""));
		setVgmWgt(JSPUtil.getParameter(request, "vgm_wgt", ""));
		setVgmWgtUtCd(JSPUtil.getParameter(request, "vgm_wgt_ut_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsTmlCllVO[]
	 */
	public BkgCstmsTmlCllVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsTmlCllVO[]
	 */
	public BkgCstmsTmlCllVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsTmlCllVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] shprNm1 = (JSPUtil.getParameter(request, prefix	+ "shpr_nm1", length));
			String[] shprNm3 = (JSPUtil.getParameter(request, prefix	+ "shpr_nm3", length));
			String[] shprNm2 = (JSPUtil.getParameter(request, prefix	+ "shpr_nm2", length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt", length));
			String[] shprNm5 = (JSPUtil.getParameter(request, prefix	+ "shpr_nm5", length));
			String[] shprNm4 = (JSPUtil.getParameter(request, prefix	+ "shpr_nm4", length));
			String[] cntrVentRto = (JSPUtil.getParameter(request, prefix	+ "cntr_vent_rto", length));
			String[] ntfyNm5 = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm5", length));
			String[] ntfyNm4 = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm4", length));
			String[] ntfyNm3 = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm3", length));
			String[] ntfyNm2 = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm2", length));
			String[] ntfyNm1 = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm1", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] grsWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "grs_wgt_ut_cd", length));
			String[] cntrMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "cntr_meas_ut_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] repCmdtDesc = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_desc", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] cmdtDesc = (JSPUtil.getParameter(request, prefix	+ "cmdt_desc", length));
			String[] listRmk = (JSPUtil.getParameter(request, prefix	+ "list_rmk", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] ovrFwrdLen = (JSPUtil.getParameter(request, prefix	+ "ovr_fwrd_len", length));
			String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix	+ "rd_cgo_flg", length));
			String[] fltFileRefNo = (JSPUtil.getParameter(request, prefix	+ "flt_file_ref_no", length));
			String[] antfySeq = (JSPUtil.getParameter(request, prefix	+ "antfy_seq", length));
			String[] ffCustSeq = (JSPUtil.getParameter(request, prefix	+ "ff_cust_seq", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] tsPolCd = (JSPUtil.getParameter(request, prefix	+ "ts_pol_cd", length));
			String[] ovrSdLen = (JSPUtil.getParameter(request, prefix	+ "ovr_sd_len", length));
			String[] trnkVvdId = (JSPUtil.getParameter(request, prefix	+ "trnk_vvd_id", length));
			String[] fdoTemp = (JSPUtil.getParameter(request, prefix	+ "fdo_temp", length));
			String[] etdDt = (JSPUtil.getParameter(request, prefix	+ "etd_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] tsCgoCd = (JSPUtil.getParameter(request, prefix	+ "ts_cgo_cd", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] antfyNm1 = (JSPUtil.getParameter(request, prefix	+ "antfy_nm1", length));
			String[] antfyNm2 = (JSPUtil.getParameter(request, prefix	+ "antfy_nm2", length));
			String[] antfyNm3 = (JSPUtil.getParameter(request, prefix	+ "antfy_nm3", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] ovrHgt = (JSPUtil.getParameter(request, prefix	+ "ovr_hgt", length));
			String[] antfyNm4 = (JSPUtil.getParameter(request, prefix	+ "antfy_nm4", length));
			String[] antfyNm5 = (JSPUtil.getParameter(request, prefix	+ "antfy_nm5", length));
			String[] ovrPortLen = (JSPUtil.getParameter(request, prefix	+ "ovr_port_len", length));
			String[] ffNm5 = (JSPUtil.getParameter(request, prefix	+ "ff_nm5", length));
			String[] ffNm4 = (JSPUtil.getParameter(request, prefix	+ "ff_nm4", length));
			String[] ffNm3 = (JSPUtil.getParameter(request, prefix	+ "ff_nm3", length));
			String[] ffNm2 = (JSPUtil.getParameter(request, prefix	+ "ff_nm2", length));
			String[] ffNm1 = (JSPUtil.getParameter(request, prefix	+ "ff_nm1", length));
			String[] teuCntrQty = (JSPUtil.getParameter(request, prefix	+ "teu_cntr_qty", length));
			String[] feuCntrQty = (JSPUtil.getParameter(request, prefix	+ "feu_cntr_qty", length));
			String[] ntfyCntCd = (JSPUtil.getParameter(request, prefix	+ "ntfy_cnt_cd", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] wgtTpCd = (JSPUtil.getParameter(request, prefix	+ "wgt_tp_cd", length));
			String[] tsVvdId = (JSPUtil.getParameter(request, prefix	+ "ts_vvd_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] tsPodCd = (JSPUtil.getParameter(request, prefix	+ "ts_pod_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] ntfySeq = (JSPUtil.getParameter(request, prefix	+ "ntfy_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ediRcvStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_sts_cd", length));
			String[] blRmk = (JSPUtil.getParameter(request, prefix	+ "bl_rmk", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] grsCntrWgt = (JSPUtil.getParameter(request, prefix	+ "grs_cntr_wgt", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] dcgoFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_flg", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] ovrCntrWgt = (JSPUtil.getParameter(request, prefix	+ "ovr_cntr_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cneeNm1 = (JSPUtil.getParameter(request, prefix	+ "cnee_nm1", length));
			String[] cneeNm4 = (JSPUtil.getParameter(request, prefix	+ "cnee_nm4", length));
			String[] cneeNm5 = (JSPUtil.getParameter(request, prefix	+ "cnee_nm5", length));
			String[] cneeNm2 = (JSPUtil.getParameter(request, prefix	+ "cnee_nm2", length));
			String[] cneeNm3 = (JSPUtil.getParameter(request, prefix	+ "cnee_nm3", length));
			String[] cfmFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] blTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_tp_cd", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] tareCntrWgt = (JSPUtil.getParameter(request, prefix	+ "tare_cntr_wgt", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] cneeSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_seq", length));
			String[] ovrWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "ovr_wgt_ut_cd", length));
			String[] cdoTemp = (JSPUtil.getParameter(request, prefix	+ "cdo_temp", length));
			String[] antfyCntCd = (JSPUtil.getParameter(request, prefix	+ "antfy_cnt_cd", length));
			String[] cntrLodgNo = (JSPUtil.getParameter(request, prefix	+ "cntr_lodg_no", length));
			String[] ovrBkwdLen = (JSPUtil.getParameter(request, prefix	+ "ovr_bkwd_len", length));
			String[] ffCntCd = (JSPUtil.getParameter(request, prefix	+ "ff_cnt_cd", length));
			String[] cntrSealNo = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_no", length));
			String[] vgmWgt = (JSPUtil.getParameter(request, prefix	+ "vgm_wgt", length));
			String[] vgmWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "vgm_wgt_ut_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsTmlCllVO();
				if (shprNm1[i] != null)
					model.setShprNm1(shprNm1[i]);
				if (shprNm3[i] != null)
					model.setShprNm3(shprNm3[i]);
				if (shprNm2[i] != null)
					model.setShprNm2(shprNm2[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (shprNm5[i] != null)
					model.setShprNm5(shprNm5[i]);
				if (shprNm4[i] != null)
					model.setShprNm4(shprNm4[i]);
				if (cntrVentRto[i] != null)
					model.setCntrVentRto(cntrVentRto[i]);
				if (ntfyNm5[i] != null)
					model.setNtfyNm5(ntfyNm5[i]);
				if (ntfyNm4[i] != null)
					model.setNtfyNm4(ntfyNm4[i]);
				if (ntfyNm3[i] != null)
					model.setNtfyNm3(ntfyNm3[i]);
				if (ntfyNm2[i] != null)
					model.setNtfyNm2(ntfyNm2[i]);
				if (ntfyNm1[i] != null)
					model.setNtfyNm1(ntfyNm1[i]);
				if (cneeCntCd[i] != null)
					model.setCneeCntCd(cneeCntCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (grsWgtUtCd[i] != null)
					model.setGrsWgtUtCd(grsWgtUtCd[i]);
				if (cntrMeasUtCd[i] != null)
					model.setCntrMeasUtCd(cntrMeasUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (repCmdtDesc[i] != null)
					model.setRepCmdtDesc(repCmdtDesc[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cmdtDesc[i] != null)
					model.setCmdtDesc(cmdtDesc[i]);
				if (listRmk[i] != null)
					model.setListRmk(listRmk[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (ovrFwrdLen[i] != null)
					model.setOvrFwrdLen(ovrFwrdLen[i]);
				if (rdCgoFlg[i] != null)
					model.setRdCgoFlg(rdCgoFlg[i]);
				if (fltFileRefNo[i] != null)
					model.setFltFileRefNo(fltFileRefNo[i]);
				if (antfySeq[i] != null)
					model.setAntfySeq(antfySeq[i]);
				if (ffCustSeq[i] != null)
					model.setFfCustSeq(ffCustSeq[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (tsPolCd[i] != null)
					model.setTsPolCd(tsPolCd[i]);
				if (ovrSdLen[i] != null)
					model.setOvrSdLen(ovrSdLen[i]);
				if (trnkVvdId[i] != null)
					model.setTrnkVvdId(trnkVvdId[i]);
				if (fdoTemp[i] != null)
					model.setFdoTemp(fdoTemp[i]);
				if (etdDt[i] != null)
					model.setEtdDt(etdDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (tsCgoCd[i] != null)
					model.setTsCgoCd(tsCgoCd[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (antfyNm1[i] != null)
					model.setAntfyNm1(antfyNm1[i]);
				if (antfyNm2[i] != null)
					model.setAntfyNm2(antfyNm2[i]);
				if (antfyNm3[i] != null)
					model.setAntfyNm3(antfyNm3[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ovrHgt[i] != null)
					model.setOvrHgt(ovrHgt[i]);
				if (antfyNm4[i] != null)
					model.setAntfyNm4(antfyNm4[i]);
				if (antfyNm5[i] != null)
					model.setAntfyNm5(antfyNm5[i]);
				if (ovrPortLen[i] != null)
					model.setOvrPortLen(ovrPortLen[i]);
				if (ffNm5[i] != null)
					model.setFfNm5(ffNm5[i]);
				if (ffNm4[i] != null)
					model.setFfNm4(ffNm4[i]);
				if (ffNm3[i] != null)
					model.setFfNm3(ffNm3[i]);
				if (ffNm2[i] != null)
					model.setFfNm2(ffNm2[i]);
				if (ffNm1[i] != null)
					model.setFfNm1(ffNm1[i]);
				if (teuCntrQty[i] != null)
					model.setTeuCntrQty(teuCntrQty[i]);
				if (feuCntrQty[i] != null)
					model.setFeuCntrQty(feuCntrQty[i]);
				if (ntfyCntCd[i] != null)
					model.setNtfyCntCd(ntfyCntCd[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (wgtTpCd[i] != null)
					model.setWgtTpCd(wgtTpCd[i]);
				if (tsVvdId[i] != null)
					model.setTsVvdId(tsVvdId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tsPodCd[i] != null)
					model.setTsPodCd(tsPodCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (ntfySeq[i] != null)
					model.setNtfySeq(ntfySeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ediRcvStsCd[i] != null)
					model.setEdiRcvStsCd(ediRcvStsCd[i]);
				if (blRmk[i] != null)
					model.setBlRmk(blRmk[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (grsCntrWgt[i] != null)
					model.setGrsCntrWgt(grsCntrWgt[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (dcgoFlg[i] != null)
					model.setDcgoFlg(dcgoFlg[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (ovrCntrWgt[i] != null)
					model.setOvrCntrWgt(ovrCntrWgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cneeNm1[i] != null)
					model.setCneeNm1(cneeNm1[i]);
				if (cneeNm4[i] != null)
					model.setCneeNm4(cneeNm4[i]);
				if (cneeNm5[i] != null)
					model.setCneeNm5(cneeNm5[i]);
				if (cneeNm2[i] != null)
					model.setCneeNm2(cneeNm2[i]);
				if (cneeNm3[i] != null)
					model.setCneeNm3(cneeNm3[i]);
				if (cfmFlg[i] != null)
					model.setCfmFlg(cfmFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (blTpCd[i] != null)
					model.setBlTpCd(blTpCd[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (tareCntrWgt[i] != null)
					model.setTareCntrWgt(tareCntrWgt[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (cneeSeq[i] != null)
					model.setCneeSeq(cneeSeq[i]);
				if (ovrWgtUtCd[i] != null)
					model.setOvrWgtUtCd(ovrWgtUtCd[i]);
				if (cdoTemp[i] != null)
					model.setCdoTemp(cdoTemp[i]);
				if (antfyCntCd[i] != null)
					model.setAntfyCntCd(antfyCntCd[i]);
				if (cntrLodgNo[i] != null)
					model.setCntrLodgNo(cntrLodgNo[i]);
				if (ovrBkwdLen[i] != null)
					model.setOvrBkwdLen(ovrBkwdLen[i]);
				if (ffCntCd[i] != null)
					model.setFfCntCd(ffCntCd[i]);
				if (cntrSealNo[i] != null)
					model.setCntrSealNo(cntrSealNo[i]);
				if (vgmWgt[i] != null)
					model.setVgmWgt(vgmWgt[i]);
				if (vgmWgtUtCd[i] != null)
					model.setVgmWgtUtCd(vgmWgtUtCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsTmlCllVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsTmlCllVO[]
	 */
	public BkgCstmsTmlCllVO[] getBkgCstmsTmlCllVOs(){
		BkgCstmsTmlCllVO[] vos = (BkgCstmsTmlCllVO[])models.toArray(new BkgCstmsTmlCllVO[models.size()]);
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
		this.shprNm1 = this.shprNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm3 = this.shprNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm2 = this.shprNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm5 = this.shprNm5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm4 = this.shprNm4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVentRto = this.cntrVentRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm5 = this.ntfyNm5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm4 = this.ntfyNm4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm3 = this.ntfyNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm2 = this.ntfyNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm1 = this.ntfyNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgtUtCd = this.grsWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMeasUtCd = this.cntrMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtDesc = this.repCmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtDesc = this.cmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.listRmk = this.listRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrFwrdLen = this.ovrFwrdLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdCgoFlg = this.rdCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileRefNo = this.fltFileRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfySeq = this.antfySeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffCustSeq = this.ffCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPolCd = this.tsPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrSdLen = this.ovrSdLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVvdId = this.trnkVvdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdoTemp = this.fdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etdDt = this.etdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsCgoCd = this.tsCgoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyNm1 = this.antfyNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyNm2 = this.antfyNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyNm3 = this.antfyNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrHgt = this.ovrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyNm4 = this.antfyNm4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyNm5 = this.antfyNm5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrPortLen = this.ovrPortLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffNm5 = this.ffNm5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffNm4 = this.ffNm4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffNm3 = this.ffNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffNm2 = this.ffNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffNm1 = this.ffNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.teuCntrQty = this.teuCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.feuCntrQty = this.feuCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCntCd = this.ntfyCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtTpCd = this.wgtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsVvdId = this.tsVvdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPodCd = this.tsPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfySeq = this.ntfySeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvStsCd = this.ediRcvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRmk = this.blRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsCntrWgt = this.grsCntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoFlg = this.dcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrCntrWgt = this.ovrCntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm1 = this.cneeNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm4 = this.cneeNm4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm5 = this.cneeNm5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm2 = this.cneeNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm3 = this.cneeNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmFlg = this.cfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blTpCd = this.blTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tareCntrWgt = this.tareCntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeSeq = this.cneeSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrWgtUtCd = this.ovrWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cdoTemp = this.cdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.antfyCntCd = this.antfyCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLodgNo = this.cntrLodgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrBkwdLen = this.ovrBkwdLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffCntCd = this.ffCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo = this.cntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vgmWgt = this.vgmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vgmWgtUtCd = this.vgmWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
