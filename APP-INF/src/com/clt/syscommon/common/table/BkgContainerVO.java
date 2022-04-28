/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgContainerVO.java
*@FileTitle : BkgContainerVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.16
*@LastModifier : 김병규
*@LastVersion : 1.0
* 2009.12.16 김병규 
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
 * @author 김병규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgContainerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgContainerVO> models = new ArrayList<BkgContainerVO>();
	
	/* Column Info */
	private String cntrDpSeq = null;
	/* Column Info */
	private String cgoRcvGdt = null;
	/* Column Info */
	private String cntrWfgExptFlg = null;
	/* Column Info */
	private String destFmLocCd = null;
	/* Column Info */
	private String cstmsPrnFlg = null;
	/* Column Info */
	private String mcntrBdlNo = null;
	/* Column Info */
	private String destYdCd = null;
	/* Column Info */
	private String cgoRcvDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String obCyGenDt = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cstmsExpDt = null;
	/* Column Info */
	private String mfCfmFlg = null;
	/* Column Info */
	private String cgoRcvYdCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntrDeltFlg = null;
	/* Column Info */
	private String eqSubstTpszCd = null;
	/* Column Info */
	private String cntrPrtFlg = null;
	/* Column Info */
	private String bdlBtmFlg = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String orgFmLocCd = null;
	/* Column Info */
	private String cnmvFlg = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String cnmvEvntDt = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String poNo = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String cnmvCycNo = null;
	/* Column Info */
	private String rdCgoFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrPrtSeq = null;
	/* Column Info */
	private String advShtgCd = null;
	/* Column Info */
	private String eqSubstFlg = null;
	/* Column Info */
	private String obCyAutoGenFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String dcgoFlg = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String doNoSplit = null;
	/* Column Info */
	private String destToYdCd = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String cntrCfmFlg = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String polYdCd = null;
	/* Column Info */
	private String hngrFlg = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String orgToLocCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgContainerVO() {}

	public BkgContainerVO(String ibflag, String pagerows, String bkgNo, String cntrNo, String cntrTpszCd, String cnmvYr, String cnmvIdNo, String cnmvCycNo, String cnmvStsCd, String cntrDpSeq, String pckTpCd, String pckQty, String cntrWgt, String wgtUtCd, String measQty, String measUtCd, String rcvTermCd, String deTermCd, String orgFmLocCd, String orgToLocCd, String orgYdCd, String destFmLocCd, String destToYdCd, String destYdCd, String porNodCd, String polYdCd, String cntrPrtFlg, String cntrPrtSeq, String cntrVolQty, String advShtgCd, String cstmsPrnFlg, String cstmsExpDt, String dcgoFlg, String rcFlg, String bbCgoFlg, String awkCgoFlg, String rdCgoFlg, String hngrFlg, String socFlg, String eqSubstFlg, String eqSubstTpszCd, String cgoRcvDt, String cgoRcvYdCd, String obCyGenDt, String obCyAutoGenFlg, String cnmvFlg, String cnmvEvntDt, String poNo, String doNo, String doNoSplit, String diffRmk, String cntrCfmFlg, String mcntrBdlNo, String mfCfmFlg, String cntrDeltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String cntrWfgExptFlg, String cgoRcvGdt, String bdlBtmFlg) {
		this.cntrDpSeq = cntrDpSeq;
		this.cgoRcvGdt = cgoRcvGdt;
		this.cntrWfgExptFlg = cntrWfgExptFlg;
		this.destFmLocCd = destFmLocCd;
		this.cstmsPrnFlg = cstmsPrnFlg;
		this.mcntrBdlNo = mcntrBdlNo;
		this.destYdCd = destYdCd;
		this.cgoRcvDt = cgoRcvDt;
		this.pagerows = pagerows;
		this.obCyGenDt = obCyGenDt;
		this.wgtUtCd = wgtUtCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cstmsExpDt = cstmsExpDt;
		this.mfCfmFlg = mfCfmFlg;
		this.cgoRcvYdCd = cgoRcvYdCd;
		this.updUsrId = updUsrId;
		this.cntrDeltFlg = cntrDeltFlg;
		this.eqSubstTpszCd = eqSubstTpszCd;
		this.cntrPrtFlg = cntrPrtFlg;
		this.bdlBtmFlg = bdlBtmFlg;
		this.cntrWgt = cntrWgt;
		this.orgFmLocCd = orgFmLocCd;
		this.cnmvFlg = cnmvFlg;
		this.awkCgoFlg = awkCgoFlg;
		this.cnmvEvntDt = cnmvEvntDt;
		this.cnmvIdNo = cnmvIdNo;
		this.doNo = doNo;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.poNo = poNo;
		this.rcFlg = rcFlg;
		this.cntrVolQty = cntrVolQty;
		this.cnmvCycNo = cnmvCycNo;
		this.rdCgoFlg = rdCgoFlg;
		this.creDt = creDt;
		this.cntrPrtSeq = cntrPrtSeq;
		this.advShtgCd = advShtgCd;
		this.eqSubstFlg = eqSubstFlg;
		this.obCyAutoGenFlg = obCyAutoGenFlg;
		this.ibflag = ibflag;
		this.cnmvStsCd = cnmvStsCd;
		this.bbCgoFlg = bbCgoFlg;
		this.measQty = measQty;
		this.dcgoFlg = dcgoFlg;
		this.pckQty = pckQty;
		this.rcvTermCd = rcvTermCd;
		this.measUtCd = measUtCd;
		this.pckTpCd = pckTpCd;
		this.updDt = updDt;
		this.doNoSplit = doNoSplit;
		this.destToYdCd = destToYdCd;
		this.porNodCd = porNodCd;
		this.cntrCfmFlg = cntrCfmFlg;
		this.orgYdCd = orgYdCd;
		this.socFlg = socFlg;
		this.deTermCd = deTermCd;
		this.diffRmk = diffRmk;
		this.cntrNo = cntrNo;
		this.polYdCd = polYdCd;
		this.hngrFlg = hngrFlg;
		this.cnmvYr = cnmvYr;
		this.orgToLocCd = orgToLocCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_dp_seq", getCntrDpSeq());
		this.hashColumns.put("cgo_rcv_gdt", getCgoRcvGdt());
		this.hashColumns.put("cntr_wfg_expt_flg", getCntrWfgExptFlg());
		this.hashColumns.put("dest_fm_loc_cd", getDestFmLocCd());
		this.hashColumns.put("cstms_prn_flg", getCstmsPrnFlg());
		this.hashColumns.put("mcntr_bdl_no", getMcntrBdlNo());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		this.hashColumns.put("cgo_rcv_dt", getCgoRcvDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ob_cy_gen_dt", getObCyGenDt());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cstms_exp_dt", getCstmsExpDt());
		this.hashColumns.put("mf_cfm_flg", getMfCfmFlg());
		this.hashColumns.put("cgo_rcv_yd_cd", getCgoRcvYdCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_delt_flg", getCntrDeltFlg());
		this.hashColumns.put("eq_subst_tpsz_cd", getEqSubstTpszCd());
		this.hashColumns.put("cntr_prt_flg", getCntrPrtFlg());
		this.hashColumns.put("bdl_btm_flg", getBdlBtmFlg());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("org_fm_loc_cd", getOrgFmLocCd());
		this.hashColumns.put("cnmv_flg", getCnmvFlg());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("cnmv_evnt_dt", getCnmvEvntDt());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("po_no", getPoNo());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("cnmv_cyc_no", getCnmvCycNo());
		this.hashColumns.put("rd_cgo_flg", getRdCgoFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_prt_seq", getCntrPrtSeq());
		this.hashColumns.put("adv_shtg_cd", getAdvShtgCd());
		this.hashColumns.put("eq_subst_flg", getEqSubstFlg());
		this.hashColumns.put("ob_cy_auto_gen_flg", getObCyAutoGenFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("dcgo_flg", getDcgoFlg());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("do_no_split", getDoNoSplit());
		this.hashColumns.put("dest_to_yd_cd", getDestToYdCd());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("cntr_cfm_flg", getCntrCfmFlg());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("pol_yd_cd", getPolYdCd());
		this.hashColumns.put("hngr_flg", getHngrFlg());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("org_to_loc_cd", getOrgToLocCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_dp_seq", "cntrDpSeq");
		this.hashFields.put("cgo_rcv_gdt", "cgoRcvGdt");
		this.hashFields.put("cntr_wfg_expt_flg", "cntrWfgExptFlg");
		this.hashFields.put("dest_fm_loc_cd", "destFmLocCd");
		this.hashFields.put("cstms_prn_flg", "cstmsPrnFlg");
		this.hashFields.put("mcntr_bdl_no", "mcntrBdlNo");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		this.hashFields.put("cgo_rcv_dt", "cgoRcvDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ob_cy_gen_dt", "obCyGenDt");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cstms_exp_dt", "cstmsExpDt");
		this.hashFields.put("mf_cfm_flg", "mfCfmFlg");
		this.hashFields.put("cgo_rcv_yd_cd", "cgoRcvYdCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_delt_flg", "cntrDeltFlg");
		this.hashFields.put("eq_subst_tpsz_cd", "eqSubstTpszCd");
		this.hashFields.put("cntr_prt_flg", "cntrPrtFlg");
		this.hashFields.put("bdl_btm_flg", "bdlBtmFlg");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("org_fm_loc_cd", "orgFmLocCd");
		this.hashFields.put("cnmv_flg", "cnmvFlg");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("cnmv_evnt_dt", "cnmvEvntDt");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("po_no", "poNo");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("cnmv_cyc_no", "cnmvCycNo");
		this.hashFields.put("rd_cgo_flg", "rdCgoFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_prt_seq", "cntrPrtSeq");
		this.hashFields.put("adv_shtg_cd", "advShtgCd");
		this.hashFields.put("eq_subst_flg", "eqSubstFlg");
		this.hashFields.put("ob_cy_auto_gen_flg", "obCyAutoGenFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("dcgo_flg", "dcgoFlg");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("do_no_split", "doNoSplit");
		this.hashFields.put("dest_to_yd_cd", "destToYdCd");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("cntr_cfm_flg", "cntrCfmFlg");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("hngr_flg", "hngrFlg");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("org_to_loc_cd", "orgToLocCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntrDpSeq
	 */
	public String getCntrDpSeq() {
		return this.cntrDpSeq;
	}
	
	/**
	 * Column Info
	 * @return cgoRcvGdt
	 */
	public String getCgoRcvGdt() {
		return this.cgoRcvGdt;
	}
	
	/**
	 * Column Info
	 * @return cntrWfgExptFlg
	 */
	public String getCntrWfgExptFlg() {
		return this.cntrWfgExptFlg;
	}
	
	/**
	 * Column Info
	 * @return destFmLocCd
	 */
	public String getDestFmLocCd() {
		return this.destFmLocCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsPrnFlg
	 */
	public String getCstmsPrnFlg() {
		return this.cstmsPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return mcntrBdlNo
	 */
	public String getMcntrBdlNo() {
		return this.mcntrBdlNo;
	}
	
	/**
	 * Column Info
	 * @return destYdCd
	 */
	public String getDestYdCd() {
		return this.destYdCd;
	}
	
	/**
	 * Column Info
	 * @return cgoRcvDt
	 */
	public String getCgoRcvDt() {
		return this.cgoRcvDt;
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
	 * @return obCyGenDt
	 */
	public String getObCyGenDt() {
		return this.obCyGenDt;
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
	 * @return cstmsExpDt
	 */
	public String getCstmsExpDt() {
		return this.cstmsExpDt;
	}
	
	/**
	 * Column Info
	 * @return mfCfmFlg
	 */
	public String getMfCfmFlg() {
		return this.mfCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return cgoRcvYdCd
	 */
	public String getCgoRcvYdCd() {
		return this.cgoRcvYdCd;
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
	 * @return cntrDeltFlg
	 */
	public String getCntrDeltFlg() {
		return this.cntrDeltFlg;
	}
	
	/**
	 * Column Info
	 * @return eqSubstTpszCd
	 */
	public String getEqSubstTpszCd() {
		return this.eqSubstTpszCd;
	}
	
	/**
	 * Column Info
	 * @return cntrPrtFlg
	 */
	public String getCntrPrtFlg() {
		return this.cntrPrtFlg;
	}
	
	/**
	 * Column Info
	 * @return bdlBtmFlg
	 */
	public String getBdlBtmFlg() {
		return this.bdlBtmFlg;
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
	 * @return orgFmLocCd
	 */
	public String getOrgFmLocCd() {
		return this.orgFmLocCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvFlg
	 */
	public String getCnmvFlg() {
		return this.cnmvFlg;
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
	 * @return cnmvEvntDt
	 */
	public String getCnmvEvntDt() {
		return this.cnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @return cnmvIdNo
	 */
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @return doNo
	 */
	public String getDoNo() {
		return this.doNo;
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
	 * @return poNo
	 */
	public String getPoNo() {
		return this.poNo;
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
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @return cnmvCycNo
	 */
	public String getCnmvCycNo() {
		return this.cnmvCycNo;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return cntrPrtSeq
	 */
	public String getCntrPrtSeq() {
		return this.cntrPrtSeq;
	}
	
	/**
	 * Column Info
	 * @return advShtgCd
	 */
	public String getAdvShtgCd() {
		return this.advShtgCd;
	}
	
	/**
	 * Column Info
	 * @return eqSubstFlg
	 */
	public String getEqSubstFlg() {
		return this.eqSubstFlg;
	}
	
	/**
	 * Column Info
	 * @return obCyAutoGenFlg
	 */
	public String getObCyAutoGenFlg() {
		return this.obCyAutoGenFlg;
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
	 * @return cnmvStsCd
	 */
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
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
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
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
	 * @return doNoSplit
	 */
	public String getDoNoSplit() {
		return this.doNoSplit;
	}
	
	/**
	 * Column Info
	 * @return destToYdCd
	 */
	public String getDestToYdCd() {
		return this.destToYdCd;
	}
	
	/**
	 * Column Info
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return cntrCfmFlg
	 */
	public String getCntrCfmFlg() {
		return this.cntrCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return orgYdCd
	 */
	public String getOrgYdCd() {
		return this.orgYdCd;
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
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
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
	 * @return polYdCd
	 */
	public String getPolYdCd() {
		return this.polYdCd;
	}
	
	/**
	 * Column Info
	 * @return hngrFlg
	 */
	public String getHngrFlg() {
		return this.hngrFlg;
	}
	
	/**
	 * Column Info
	 * @return cnmvYr
	 */
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	
	/**
	 * Column Info
	 * @return orgToLocCd
	 */
	public String getOrgToLocCd() {
		return this.orgToLocCd;
	}
	

	/**
	 * Column Info
	 * @param cntrDpSeq
	 */
	public void setCntrDpSeq(String cntrDpSeq) {
		this.cntrDpSeq = cntrDpSeq;
	}
	
	/**
	 * Column Info
	 * @param cgoRcvGdt
	 */
	public void setCgoRcvGdt(String cgoRcvGdt) {
		this.cgoRcvGdt = cgoRcvGdt;
	}
	
	/**
	 * Column Info
	 * @param cntrWfgExptFlg
	 */
	public void setCntrWfgExptFlg(String cntrWfgExptFlg) {
		this.cntrWfgExptFlg = cntrWfgExptFlg;
	}
	
	/**
	 * Column Info
	 * @param destFmLocCd
	 */
	public void setDestFmLocCd(String destFmLocCd) {
		this.destFmLocCd = destFmLocCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsPrnFlg
	 */
	public void setCstmsPrnFlg(String cstmsPrnFlg) {
		this.cstmsPrnFlg = cstmsPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param mcntrBdlNo
	 */
	public void setMcntrBdlNo(String mcntrBdlNo) {
		this.mcntrBdlNo = mcntrBdlNo;
	}
	
	/**
	 * Column Info
	 * @param destYdCd
	 */
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
	}
	
	/**
	 * Column Info
	 * @param cgoRcvDt
	 */
	public void setCgoRcvDt(String cgoRcvDt) {
		this.cgoRcvDt = cgoRcvDt;
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
	 * @param obCyGenDt
	 */
	public void setObCyGenDt(String obCyGenDt) {
		this.obCyGenDt = obCyGenDt;
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
	 * @param cstmsExpDt
	 */
	public void setCstmsExpDt(String cstmsExpDt) {
		this.cstmsExpDt = cstmsExpDt;
	}
	
	/**
	 * Column Info
	 * @param mfCfmFlg
	 */
	public void setMfCfmFlg(String mfCfmFlg) {
		this.mfCfmFlg = mfCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param cgoRcvYdCd
	 */
	public void setCgoRcvYdCd(String cgoRcvYdCd) {
		this.cgoRcvYdCd = cgoRcvYdCd;
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
	 * @param cntrDeltFlg
	 */
	public void setCntrDeltFlg(String cntrDeltFlg) {
		this.cntrDeltFlg = cntrDeltFlg;
	}
	
	/**
	 * Column Info
	 * @param eqSubstTpszCd
	 */
	public void setEqSubstTpszCd(String eqSubstTpszCd) {
		this.eqSubstTpszCd = eqSubstTpszCd;
	}
	
	/**
	 * Column Info
	 * @param cntrPrtFlg
	 */
	public void setCntrPrtFlg(String cntrPrtFlg) {
		this.cntrPrtFlg = cntrPrtFlg;
	}
	
	/**
	 * Column Info
	 * @param bdlBtmFlg
	 */
	public void setBdlBtmFlg(String bdlBtmFlg) {
		this.bdlBtmFlg = bdlBtmFlg;
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
	 * @param orgFmLocCd
	 */
	public void setOrgFmLocCd(String orgFmLocCd) {
		this.orgFmLocCd = orgFmLocCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvFlg
	 */
	public void setCnmvFlg(String cnmvFlg) {
		this.cnmvFlg = cnmvFlg;
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
	 * @param cnmvEvntDt
	 */
	public void setCnmvEvntDt(String cnmvEvntDt) {
		this.cnmvEvntDt = cnmvEvntDt;
	}
	
	/**
	 * Column Info
	 * @param cnmvIdNo
	 */
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @param doNo
	 */
	public void setDoNo(String doNo) {
		this.doNo = doNo;
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
	 * @param poNo
	 */
	public void setPoNo(String poNo) {
		this.poNo = poNo;
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
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @param cnmvCycNo
	 */
	public void setCnmvCycNo(String cnmvCycNo) {
		this.cnmvCycNo = cnmvCycNo;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param cntrPrtSeq
	 */
	public void setCntrPrtSeq(String cntrPrtSeq) {
		this.cntrPrtSeq = cntrPrtSeq;
	}
	
	/**
	 * Column Info
	 * @param advShtgCd
	 */
	public void setAdvShtgCd(String advShtgCd) {
		this.advShtgCd = advShtgCd;
	}
	
	/**
	 * Column Info
	 * @param eqSubstFlg
	 */
	public void setEqSubstFlg(String eqSubstFlg) {
		this.eqSubstFlg = eqSubstFlg;
	}
	
	/**
	 * Column Info
	 * @param obCyAutoGenFlg
	 */
	public void setObCyAutoGenFlg(String obCyAutoGenFlg) {
		this.obCyAutoGenFlg = obCyAutoGenFlg;
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
	 * @param cnmvStsCd
	 */
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
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
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
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
	 * @param doNoSplit
	 */
	public void setDoNoSplit(String doNoSplit) {
		this.doNoSplit = doNoSplit;
	}
	
	/**
	 * Column Info
	 * @param destToYdCd
	 */
	public void setDestToYdCd(String destToYdCd) {
		this.destToYdCd = destToYdCd;
	}
	
	/**
	 * Column Info
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param cntrCfmFlg
	 */
	public void setCntrCfmFlg(String cntrCfmFlg) {
		this.cntrCfmFlg = cntrCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param orgYdCd
	 */
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
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
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
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
	 * @param polYdCd
	 */
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
	}
	
	/**
	 * Column Info
	 * @param hngrFlg
	 */
	public void setHngrFlg(String hngrFlg) {
		this.hngrFlg = hngrFlg;
	}
	
	/**
	 * Column Info
	 * @param cnmvYr
	 */
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
	}
	
	/**
	 * Column Info
	 * @param orgToLocCd
	 */
	public void setOrgToLocCd(String orgToLocCd) {
		this.orgToLocCd = orgToLocCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCntrDpSeq(JSPUtil.getParameter(request, "cntr_dp_seq", ""));
		setCgoRcvGdt(JSPUtil.getParameter(request, "cgo_rcv_gdt", ""));
		setCntrWfgExptFlg(JSPUtil.getParameter(request, "cntr_wfg_expt_flg", ""));
		setDestFmLocCd(JSPUtil.getParameter(request, "dest_fm_loc_cd", ""));
		setCstmsPrnFlg(JSPUtil.getParameter(request, "cstms_prn_flg", ""));
		setMcntrBdlNo(JSPUtil.getParameter(request, "mcntr_bdl_no", ""));
		setDestYdCd(JSPUtil.getParameter(request, "dest_yd_cd", ""));
		setCgoRcvDt(JSPUtil.getParameter(request, "cgo_rcv_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setObCyGenDt(JSPUtil.getParameter(request, "ob_cy_gen_dt", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCstmsExpDt(JSPUtil.getParameter(request, "cstms_exp_dt", ""));
		setMfCfmFlg(JSPUtil.getParameter(request, "mf_cfm_flg", ""));
		setCgoRcvYdCd(JSPUtil.getParameter(request, "cgo_rcv_yd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntrDeltFlg(JSPUtil.getParameter(request, "cntr_delt_flg", ""));
		setEqSubstTpszCd(JSPUtil.getParameter(request, "eq_subst_tpsz_cd", ""));
		setCntrPrtFlg(JSPUtil.getParameter(request, "cntr_prt_flg", ""));
		setBdlBtmFlg(JSPUtil.getParameter(request, "bdl_btm_flg", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setOrgFmLocCd(JSPUtil.getParameter(request, "org_fm_loc_cd", ""));
		setCnmvFlg(JSPUtil.getParameter(request, "cnmv_flg", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
		setCnmvEvntDt(JSPUtil.getParameter(request, "cnmv_evnt_dt", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setDoNo(JSPUtil.getParameter(request, "do_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setPoNo(JSPUtil.getParameter(request, "po_no", ""));
		setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setCnmvCycNo(JSPUtil.getParameter(request, "cnmv_cyc_no", ""));
		setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrPrtSeq(JSPUtil.getParameter(request, "cntr_prt_seq", ""));
		setAdvShtgCd(JSPUtil.getParameter(request, "adv_shtg_cd", ""));
		setEqSubstFlg(JSPUtil.getParameter(request, "eq_subst_flg", ""));
		setObCyAutoGenFlg(JSPUtil.getParameter(request, "ob_cy_auto_gen_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDoNoSplit(JSPUtil.getParameter(request, "do_no_split", ""));
		setDestToYdCd(JSPUtil.getParameter(request, "dest_to_yd_cd", ""));
		setPorNodCd(JSPUtil.getParameter(request, "por_nod_cd", ""));
		setCntrCfmFlg(JSPUtil.getParameter(request, "cntr_cfm_flg", ""));
		setOrgYdCd(JSPUtil.getParameter(request, "org_yd_cd", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setPolYdCd(JSPUtil.getParameter(request, "pol_yd_cd", ""));
		setHngrFlg(JSPUtil.getParameter(request, "hngr_flg", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setOrgToLocCd(JSPUtil.getParameter(request, "org_to_loc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgContainerVO[]
	 */
	public BkgContainerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgContainerVO[]
	 */
	public BkgContainerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgContainerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrDpSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_dp_seq", length));
			String[] cgoRcvGdt = (JSPUtil.getParameter(request, prefix	+ "cgo_rcv_gdt", length));
			String[] cntrWfgExptFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_wfg_expt_flg", length));
			String[] destFmLocCd = (JSPUtil.getParameter(request, prefix	+ "dest_fm_loc_cd", length));
			String[] cstmsPrnFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_prn_flg", length));
			String[] mcntrBdlNo = (JSPUtil.getParameter(request, prefix	+ "mcntr_bdl_no", length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd", length));
			String[] cgoRcvDt = (JSPUtil.getParameter(request, prefix	+ "cgo_rcv_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] obCyGenDt = (JSPUtil.getParameter(request, prefix	+ "ob_cy_gen_dt", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cstmsExpDt = (JSPUtil.getParameter(request, prefix	+ "cstms_exp_dt", length));
			String[] mfCfmFlg = (JSPUtil.getParameter(request, prefix	+ "mf_cfm_flg", length));
			String[] cgoRcvYdCd = (JSPUtil.getParameter(request, prefix	+ "cgo_rcv_yd_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cntrDeltFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_delt_flg", length));
			String[] eqSubstTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_subst_tpsz_cd", length));
			String[] cntrPrtFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_prt_flg", length));
			String[] bdlBtmFlg = (JSPUtil.getParameter(request, prefix	+ "bdl_btm_flg", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] orgFmLocCd = (JSPUtil.getParameter(request, prefix	+ "org_fm_loc_cd", length));
			String[] cnmvFlg = (JSPUtil.getParameter(request, prefix	+ "cnmv_flg", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			String[] cnmvEvntDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_evnt_dt", length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no", length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] poNo = (JSPUtil.getParameter(request, prefix	+ "po_no", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] cnmvCycNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_cyc_no", length));
			String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix	+ "rd_cgo_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrPrtSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_prt_seq", length));
			String[] advShtgCd = (JSPUtil.getParameter(request, prefix	+ "adv_shtg_cd", length));
			String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix	+ "eq_subst_flg", length));
			String[] obCyAutoGenFlg = (JSPUtil.getParameter(request, prefix	+ "ob_cy_auto_gen_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] dcgoFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_flg", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] doNoSplit = (JSPUtil.getParameter(request, prefix	+ "do_no_split", length));
			String[] destToYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_to_yd_cd", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] cntrCfmFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_cfm_flg", length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix	+ "org_yd_cd", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd", length));
			String[] hngrFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_flg", length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr", length));
			String[] orgToLocCd = (JSPUtil.getParameter(request, prefix	+ "org_to_loc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgContainerVO();
				if (cntrDpSeq[i] != null)
					model.setCntrDpSeq(cntrDpSeq[i]);
				if (cgoRcvGdt[i] != null)
					model.setCgoRcvGdt(cgoRcvGdt[i]);
				if (cntrWfgExptFlg[i] != null)
					model.setCntrWfgExptFlg(cntrWfgExptFlg[i]);
				if (destFmLocCd[i] != null)
					model.setDestFmLocCd(destFmLocCd[i]);
				if (cstmsPrnFlg[i] != null)
					model.setCstmsPrnFlg(cstmsPrnFlg[i]);
				if (mcntrBdlNo[i] != null)
					model.setMcntrBdlNo(mcntrBdlNo[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				if (cgoRcvDt[i] != null)
					model.setCgoRcvDt(cgoRcvDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (obCyGenDt[i] != null)
					model.setObCyGenDt(obCyGenDt[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cstmsExpDt[i] != null)
					model.setCstmsExpDt(cstmsExpDt[i]);
				if (mfCfmFlg[i] != null)
					model.setMfCfmFlg(mfCfmFlg[i]);
				if (cgoRcvYdCd[i] != null)
					model.setCgoRcvYdCd(cgoRcvYdCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntrDeltFlg[i] != null)
					model.setCntrDeltFlg(cntrDeltFlg[i]);
				if (eqSubstTpszCd[i] != null)
					model.setEqSubstTpszCd(eqSubstTpszCd[i]);
				if (cntrPrtFlg[i] != null)
					model.setCntrPrtFlg(cntrPrtFlg[i]);
				if (bdlBtmFlg[i] != null)
					model.setBdlBtmFlg(bdlBtmFlg[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (orgFmLocCd[i] != null)
					model.setOrgFmLocCd(orgFmLocCd[i]);
				if (cnmvFlg[i] != null)
					model.setCnmvFlg(cnmvFlg[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (cnmvEvntDt[i] != null)
					model.setCnmvEvntDt(cnmvEvntDt[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (poNo[i] != null)
					model.setPoNo(poNo[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (cnmvCycNo[i] != null)
					model.setCnmvCycNo(cnmvCycNo[i]);
				if (rdCgoFlg[i] != null)
					model.setRdCgoFlg(rdCgoFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrPrtSeq[i] != null)
					model.setCntrPrtSeq(cntrPrtSeq[i]);
				if (advShtgCd[i] != null)
					model.setAdvShtgCd(advShtgCd[i]);
				if (eqSubstFlg[i] != null)
					model.setEqSubstFlg(eqSubstFlg[i]);
				if (obCyAutoGenFlg[i] != null)
					model.setObCyAutoGenFlg(obCyAutoGenFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (dcgoFlg[i] != null)
					model.setDcgoFlg(dcgoFlg[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (doNoSplit[i] != null)
					model.setDoNoSplit(doNoSplit[i]);
				if (destToYdCd[i] != null)
					model.setDestToYdCd(destToYdCd[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (cntrCfmFlg[i] != null)
					model.setCntrCfmFlg(cntrCfmFlg[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (hngrFlg[i] != null)
					model.setHngrFlg(hngrFlg[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (orgToLocCd[i] != null)
					model.setOrgToLocCd(orgToLocCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgContainerVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgContainerVO[]
	 */
	public BkgContainerVO[] getBkgContainerVOs(){
		BkgContainerVO[] vos = (BkgContainerVO[])models.toArray(new BkgContainerVO[models.size()]);
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
		this.cntrDpSeq = this.cntrDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoRcvGdt = this.cgoRcvGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWfgExptFlg = this.cntrWfgExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destFmLocCd = this.destFmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPrnFlg = this.cstmsPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcntrBdlNo = this.mcntrBdlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoRcvDt = this.cgoRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obCyGenDt = this.obCyGenDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsExpDt = this.cstmsExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfCfmFlg = this.mfCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoRcvYdCd = this.cgoRcvYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDeltFlg = this.cntrDeltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstTpszCd = this.eqSubstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPrtFlg = this.cntrPrtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdlBtmFlg = this.bdlBtmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgFmLocCd = this.orgFmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvFlg = this.cnmvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvEvntDt = this.cnmvEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poNo = this.poNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCycNo = this.cnmvCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdCgoFlg = this.rdCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPrtSeq = this.cntrPrtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.advShtgCd = this.advShtgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstFlg = this.eqSubstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obCyAutoGenFlg = this.obCyAutoGenFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoFlg = this.dcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNoSplit = this.doNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destToYdCd = this.destToYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCfmFlg = this.cntrCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd = this.polYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrFlg = this.hngrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgToLocCd = this.orgToLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
