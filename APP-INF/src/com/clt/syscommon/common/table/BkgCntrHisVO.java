/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCntrHisVO.java
*@FileTitle : BkgCntrHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 김상수
*@LastVersion : 1.0
* 2009.05.11 김상수 
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
 * @author 김상수
 * @since J2EE 1.5
 * @see ..
 */

public class BkgCntrHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCntrHisVO> models = new ArrayList<BkgCntrHisVO>();
	
	/* Column Info */
	private String cnmvSeq = null;
	/* Column Info */
	private String eqSubstFlg = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hngrFlg = null;
	/* Column Info */
	private String cntrDpSeq = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrDeltFlg = null;
	/* Column Info */
	private String cntrPrtSeq = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String rdCgoFlg = null;
	/* Column Info */
	private String snapHisSeq = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String cntrTaxExptFlg = null;
	/* Column Info */
	private String rmkBlDpFlg = null;
	/* Column Info */
	private String cntrCfmFlg = null;
	/* Column Info */
	private String orgToLocCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String mcntrBdlNo = null;
	/* Column Info */
	private String dcgoFlg = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String cstmsExpDt = null;
	/* Column Info */
	private String cnmvFlg = null;
	/* Column Info */
	private String obCyGenTpCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String destFmLocCd = null;
	/* Column Info */
	private String cntrHlgFlg = null;
	/* Column Info */
	private String cstmsPrnFlg = null;
	/* Column Info */
	private String mfCfmFlg = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String cntrCdrDt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String cntrCycNo = null;
	/* Column Info */
	private String poNo = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String doNoSplit = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String cntrPrtFlg = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String snapDt = null;
	/* Column Info */
	private String obCyGenDt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String destToYdCd = null;
	/* Column Info */
	private String cnmvEvntDt = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String advShtgCd = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String eqSubstTpszCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrCdrYdCd = null;
	/* Column Info */
	private String orgFmLocCd = null;
	/* Column Info */
	private String destYdCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCntrHisVO() {}

	public BkgCntrHisVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String snapHisSeq, String cntrNo, String cntrTpszCd, String cnmvYr, String cnmvSeq, String cnmvIdNo, String cntrCycNo, String cnmvStsCd, String cntrDpSeq, String pckTpCd, String pckQty, String cntrWgt, String wgtUtCd, String measQty, String measUtCd, String rcvTermCd, String deTermCd, String orgFmLocCd, String orgToLocCd, String orgYdCd, String destFmLocCd, String destToYdCd, String destYdCd, String cntrPrtFlg, String cntrPrtSeq, String cntrVolQty, String advShtgCd, String cntrTaxExptFlg, String cstmsPrnFlg, String cstmsExpDt, String cntrHlgFlg, String dcgoFlg, String rcFlg, String bbCgoFlg, String awkCgoFlg, String rdCgoFlg, String hngrFlg, String socFlg, String eqSubstFlg, String eqSubstTpszCd, String cntrCdrDt, String cntrCdrYdCd, String obCyGenDt, String obCyGenTpCd, String cnmvFlg, String cnmvEvntDt, String poNo, String doNo, String doNoSplit, String diffRmk, String rmkBlDpFlg, String cntrCfmFlg, String mcntrBdlNo, String mfCfmFlg, String cntrDeltFlg, String snapDt, String expDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cnmvSeq = cnmvSeq;
		this.eqSubstFlg = eqSubstFlg;
		this.socFlg = socFlg;
		this.updUsrId = updUsrId;
		this.hngrFlg = hngrFlg;
		this.cntrDpSeq = cntrDpSeq;
		this.cntrVolQty = cntrVolQty;
		this.updDt = updDt;
		this.cntrDeltFlg = cntrDeltFlg;
		this.cntrPrtSeq = cntrPrtSeq;
		this.pckQty = pckQty;
		this.rdCgoFlg = rdCgoFlg;
		this.snapHisSeq = snapHisSeq;
		this.measQty = measQty;
		this.cntrWgt = cntrWgt;
		this.cntrTaxExptFlg = cntrTaxExptFlg;
		this.rmkBlDpFlg = rmkBlDpFlg;
		this.cntrCfmFlg = cntrCfmFlg;
		this.orgToLocCd = orgToLocCd;
		this.ibflag = ibflag;
		this.mcntrBdlNo = mcntrBdlNo;
		this.dcgoFlg = dcgoFlg;
		this.rcFlg = rcFlg;
		this.cstmsExpDt = cstmsExpDt;
		this.cnmvFlg = cnmvFlg;
		this.obCyGenTpCd = obCyGenTpCd;
		this.pckTpCd = pckTpCd;
		this.destFmLocCd = destFmLocCd;
		this.cntrHlgFlg = cntrHlgFlg;
		this.cstmsPrnFlg = cstmsPrnFlg;
		this.mfCfmFlg = mfCfmFlg;
		this.orgYdCd = orgYdCd;
		this.bkgNoSplit = bkgNoSplit;
		this.bbCgoFlg = bbCgoFlg;
		this.cntrCdrDt = cntrCdrDt;
		this.bkgNo = bkgNo;
		this.cnmvYr = cnmvYr;
		this.cntrCycNo = cntrCycNo;
		this.poNo = poNo;
		this.awkCgoFlg = awkCgoFlg;
		this.doNoSplit = doNoSplit;
		this.cntrNo = cntrNo;
		this.cnmvIdNo = cnmvIdNo;
		this.cntrPrtFlg = cntrPrtFlg;
		this.rcvTermCd = rcvTermCd;
		this.snapDt = snapDt;
		this.obCyGenDt = obCyGenDt;
		this.cntrTpszCd = cntrTpszCd;
		this.expDt = expDt;
		this.measUtCd = measUtCd;
		this.destToYdCd = destToYdCd;
		this.cnmvEvntDt = cnmvEvntDt;
		this.wgtUtCd = wgtUtCd;
		this.diffRmk = diffRmk;
		this.advShtgCd = advShtgCd;
		this.deTermCd = deTermCd;
		this.cnmvStsCd = cnmvStsCd;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.doNo = doNo;
		this.eqSubstTpszCd = eqSubstTpszCd;
		this.pagerows = pagerows;
		this.cntrCdrYdCd = cntrCdrYdCd;
		this.orgFmLocCd = orgFmLocCd;
		this.destYdCd = destYdCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnmv_seq", getCnmvSeq());
		this.hashColumns.put("eq_subst_flg", getEqSubstFlg());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hngr_flg", getHngrFlg());
		this.hashColumns.put("cntr_dp_seq", getCntrDpSeq());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_delt_flg", getCntrDeltFlg());
		this.hashColumns.put("cntr_prt_seq", getCntrPrtSeq());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("rd_cgo_flg", getRdCgoFlg());
		this.hashColumns.put("snap_his_seq", getSnapHisSeq());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("cntr_tax_expt_flg", getCntrTaxExptFlg());
		this.hashColumns.put("rmk_bl_dp_flg", getRmkBlDpFlg());
		this.hashColumns.put("cntr_cfm_flg", getCntrCfmFlg());
		this.hashColumns.put("org_to_loc_cd", getOrgToLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mcntr_bdl_no", getMcntrBdlNo());
		this.hashColumns.put("dcgo_flg", getDcgoFlg());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("cstms_exp_dt", getCstmsExpDt());
		this.hashColumns.put("cnmv_flg", getCnmvFlg());
		this.hashColumns.put("ob_cy_gen_tp_cd", getObCyGenTpCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("dest_fm_loc_cd", getDestFmLocCd());
		this.hashColumns.put("cntr_hlg_flg", getCntrHlgFlg());
		this.hashColumns.put("cstms_prn_flg", getCstmsPrnFlg());
		this.hashColumns.put("mf_cfm_flg", getMfCfmFlg());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("cntr_cdr_dt", getCntrCdrDt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("cntr_cyc_no", getCntrCycNo());
		this.hashColumns.put("po_no", getPoNo());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("do_no_split", getDoNoSplit());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("cntr_prt_flg", getCntrPrtFlg());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("snap_dt", getSnapDt());
		this.hashColumns.put("ob_cy_gen_dt", getObCyGenDt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("dest_to_yd_cd", getDestToYdCd());
		this.hashColumns.put("cnmv_evnt_dt", getCnmvEvntDt());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("adv_shtg_cd", getAdvShtgCd());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("eq_subst_tpsz_cd", getEqSubstTpszCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_cdr_yd_cd", getCntrCdrYdCd());
		this.hashColumns.put("org_fm_loc_cd", getOrgFmLocCd());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnmv_seq", "cnmvSeq");
		this.hashFields.put("eq_subst_flg", "eqSubstFlg");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hngr_flg", "hngrFlg");
		this.hashFields.put("cntr_dp_seq", "cntrDpSeq");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_delt_flg", "cntrDeltFlg");
		this.hashFields.put("cntr_prt_seq", "cntrPrtSeq");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("rd_cgo_flg", "rdCgoFlg");
		this.hashFields.put("snap_his_seq", "snapHisSeq");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("cntr_tax_expt_flg", "cntrTaxExptFlg");
		this.hashFields.put("rmk_bl_dp_flg", "rmkBlDpFlg");
		this.hashFields.put("cntr_cfm_flg", "cntrCfmFlg");
		this.hashFields.put("org_to_loc_cd", "orgToLocCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mcntr_bdl_no", "mcntrBdlNo");
		this.hashFields.put("dcgo_flg", "dcgoFlg");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("cstms_exp_dt", "cstmsExpDt");
		this.hashFields.put("cnmv_flg", "cnmvFlg");
		this.hashFields.put("ob_cy_gen_tp_cd", "obCyGenTpCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("dest_fm_loc_cd", "destFmLocCd");
		this.hashFields.put("cntr_hlg_flg", "cntrHlgFlg");
		this.hashFields.put("cstms_prn_flg", "cstmsPrnFlg");
		this.hashFields.put("mf_cfm_flg", "mfCfmFlg");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("cntr_cdr_dt", "cntrCdrDt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("cntr_cyc_no", "cntrCycNo");
		this.hashFields.put("po_no", "poNo");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("do_no_split", "doNoSplit");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("cntr_prt_flg", "cntrPrtFlg");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("snap_dt", "snapDt");
		this.hashFields.put("ob_cy_gen_dt", "obCyGenDt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("dest_to_yd_cd", "destToYdCd");
		this.hashFields.put("cnmv_evnt_dt", "cnmvEvntDt");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("adv_shtg_cd", "advShtgCd");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("eq_subst_tpsz_cd", "eqSubstTpszCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_cdr_yd_cd", "cntrCdrYdCd");
		this.hashFields.put("org_fm_loc_cd", "orgFmLocCd");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		return this.hashFields;
	}
	
	public String getCnmvSeq() {
		return this.cnmvSeq;
	}
	public String getEqSubstFlg() {
		return this.eqSubstFlg;
	}
	public String getSocFlg() {
		return this.socFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getHngrFlg() {
		return this.hngrFlg;
	}
	public String getCntrDpSeq() {
		return this.cntrDpSeq;
	}
	public String getCntrVolQty() {
		return this.cntrVolQty;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCntrDeltFlg() {
		return this.cntrDeltFlg;
	}
	public String getCntrPrtSeq() {
		return this.cntrPrtSeq;
	}
	public String getPckQty() {
		return this.pckQty;
	}
	public String getRdCgoFlg() {
		return this.rdCgoFlg;
	}
	public String getSnapHisSeq() {
		return this.snapHisSeq;
	}
	public String getMeasQty() {
		return this.measQty;
	}
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	public String getCntrTaxExptFlg() {
		return this.cntrTaxExptFlg;
	}
	public String getRmkBlDpFlg() {
		return this.rmkBlDpFlg;
	}
	public String getCntrCfmFlg() {
		return this.cntrCfmFlg;
	}
	public String getOrgToLocCd() {
		return this.orgToLocCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getMcntrBdlNo() {
		return this.mcntrBdlNo;
	}
	public String getDcgoFlg() {
		return this.dcgoFlg;
	}
	public String getRcFlg() {
		return this.rcFlg;
	}
	public String getCstmsExpDt() {
		return this.cstmsExpDt;
	}
	public String getCnmvFlg() {
		return this.cnmvFlg;
	}
	public String getObCyGenTpCd() {
		return this.obCyGenTpCd;
	}
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	public String getDestFmLocCd() {
		return this.destFmLocCd;
	}
	public String getCntrHlgFlg() {
		return this.cntrHlgFlg;
	}
	public String getCstmsPrnFlg() {
		return this.cstmsPrnFlg;
	}
	public String getMfCfmFlg() {
		return this.mfCfmFlg;
	}
	public String getOrgYdCd() {
		return this.orgYdCd;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
	}
	public String getCntrCdrDt() {
		return this.cntrCdrDt;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	public String getCntrCycNo() {
		return this.cntrCycNo;
	}
	public String getPoNo() {
		return this.poNo;
	}
	public String getAwkCgoFlg() {
		return this.awkCgoFlg;
	}
	public String getDoNoSplit() {
		return this.doNoSplit;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	public String getCntrPrtFlg() {
		return this.cntrPrtFlg;
	}
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	public String getSnapDt() {
		return this.snapDt;
	}
	public String getObCyGenDt() {
		return this.obCyGenDt;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getMeasUtCd() {
		return this.measUtCd;
	}
	public String getDestToYdCd() {
		return this.destToYdCd;
	}
	public String getCnmvEvntDt() {
		return this.cnmvEvntDt;
	}
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	public String getDiffRmk() {
		return this.diffRmk;
	}
	public String getAdvShtgCd() {
		return this.advShtgCd;
	}
	public String getDeTermCd() {
		return this.deTermCd;
	}
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getDoNo() {
		return this.doNo;
	}
	public String getEqSubstTpszCd() {
		return this.eqSubstTpszCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getCntrCdrYdCd() {
		return this.cntrCdrYdCd;
	}
	public String getOrgFmLocCd() {
		return this.orgFmLocCd;
	}
	public String getDestYdCd() {
		return this.destYdCd;
	}

	public void setCnmvSeq(String cnmvSeq) {
		this.cnmvSeq = cnmvSeq;
		//this.cnmvSeq=true;
	}
	public void setEqSubstFlg(String eqSubstFlg) {
		this.eqSubstFlg = eqSubstFlg;
		//this.eqSubstFlg=true;
	}
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
		//this.socFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setHngrFlg(String hngrFlg) {
		this.hngrFlg = hngrFlg;
		//this.hngrFlg=true;
	}
	public void setCntrDpSeq(String cntrDpSeq) {
		this.cntrDpSeq = cntrDpSeq;
		//this.cntrDpSeq=true;
	}
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
		//this.cntrVolQty=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCntrDeltFlg(String cntrDeltFlg) {
		this.cntrDeltFlg = cntrDeltFlg;
		//this.cntrDeltFlg=true;
	}
	public void setCntrPrtSeq(String cntrPrtSeq) {
		this.cntrPrtSeq = cntrPrtSeq;
		//this.cntrPrtSeq=true;
	}
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
		//this.pckQty=true;
	}
	public void setRdCgoFlg(String rdCgoFlg) {
		this.rdCgoFlg = rdCgoFlg;
		//this.rdCgoFlg=true;
	}
	public void setSnapHisSeq(String snapHisSeq) {
		this.snapHisSeq = snapHisSeq;
		//this.snapHisSeq=true;
	}
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
		//this.measQty=true;
	}
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
		//this.cntrWgt=true;
	}
	public void setCntrTaxExptFlg(String cntrTaxExptFlg) {
		this.cntrTaxExptFlg = cntrTaxExptFlg;
		//this.cntrTaxExptFlg=true;
	}
	public void setRmkBlDpFlg(String rmkBlDpFlg) {
		this.rmkBlDpFlg = rmkBlDpFlg;
		//this.rmkBlDpFlg=true;
	}
	public void setCntrCfmFlg(String cntrCfmFlg) {
		this.cntrCfmFlg = cntrCfmFlg;
		//this.cntrCfmFlg=true;
	}
	public void setOrgToLocCd(String orgToLocCd) {
		this.orgToLocCd = orgToLocCd;
		//this.orgToLocCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setMcntrBdlNo(String mcntrBdlNo) {
		this.mcntrBdlNo = mcntrBdlNo;
		//this.mcntrBdlNo=true;
	}
	public void setDcgoFlg(String dcgoFlg) {
		this.dcgoFlg = dcgoFlg;
		//this.dcgoFlg=true;
	}
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
		//this.rcFlg=true;
	}
	public void setCstmsExpDt(String cstmsExpDt) {
		this.cstmsExpDt = cstmsExpDt;
		//this.cstmsExpDt=true;
	}
	public void setCnmvFlg(String cnmvFlg) {
		this.cnmvFlg = cnmvFlg;
		//this.cnmvFlg=true;
	}
	public void setObCyGenTpCd(String obCyGenTpCd) {
		this.obCyGenTpCd = obCyGenTpCd;
		//this.obCyGenTpCd=true;
	}
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
		//this.pckTpCd=true;
	}
	public void setDestFmLocCd(String destFmLocCd) {
		this.destFmLocCd = destFmLocCd;
		//this.destFmLocCd=true;
	}
	public void setCntrHlgFlg(String cntrHlgFlg) {
		this.cntrHlgFlg = cntrHlgFlg;
		//this.cntrHlgFlg=true;
	}
	public void setCstmsPrnFlg(String cstmsPrnFlg) {
		this.cstmsPrnFlg = cstmsPrnFlg;
		//this.cstmsPrnFlg=true;
	}
	public void setMfCfmFlg(String mfCfmFlg) {
		this.mfCfmFlg = mfCfmFlg;
		//this.mfCfmFlg=true;
	}
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
		//this.orgYdCd=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
		//this.bbCgoFlg=true;
	}
	public void setCntrCdrDt(String cntrCdrDt) {
		this.cntrCdrDt = cntrCdrDt;
		//this.cntrCdrDt=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
		//this.cnmvYr=true;
	}
	public void setCntrCycNo(String cntrCycNo) {
		this.cntrCycNo = cntrCycNo;
		//this.cntrCycNo=true;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
		//this.poNo=true;
	}
	public void setAwkCgoFlg(String awkCgoFlg) {
		this.awkCgoFlg = awkCgoFlg;
		//this.awkCgoFlg=true;
	}
	public void setDoNoSplit(String doNoSplit) {
		this.doNoSplit = doNoSplit;
		//this.doNoSplit=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
		//this.cnmvIdNo=true;
	}
	public void setCntrPrtFlg(String cntrPrtFlg) {
		this.cntrPrtFlg = cntrPrtFlg;
		//this.cntrPrtFlg=true;
	}
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
		//this.rcvTermCd=true;
	}
	public void setSnapDt(String snapDt) {
		this.snapDt = snapDt;
		//this.snapDt=true;
	}
	public void setObCyGenDt(String obCyGenDt) {
		this.obCyGenDt = obCyGenDt;
		//this.obCyGenDt=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
		//this.measUtCd=true;
	}
	public void setDestToYdCd(String destToYdCd) {
		this.destToYdCd = destToYdCd;
		//this.destToYdCd=true;
	}
	public void setCnmvEvntDt(String cnmvEvntDt) {
		this.cnmvEvntDt = cnmvEvntDt;
		//this.cnmvEvntDt=true;
	}
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
		//this.wgtUtCd=true;
	}
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
		//this.diffRmk=true;
	}
	public void setAdvShtgCd(String advShtgCd) {
		this.advShtgCd = advShtgCd;
		//this.advShtgCd=true;
	}
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
		//this.deTermCd=true;
	}
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
		//this.cnmvStsCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setDoNo(String doNo) {
		this.doNo = doNo;
		//this.doNo=true;
	}
	public void setEqSubstTpszCd(String eqSubstTpszCd) {
		this.eqSubstTpszCd = eqSubstTpszCd;
		//this.eqSubstTpszCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setCntrCdrYdCd(String cntrCdrYdCd) {
		this.cntrCdrYdCd = cntrCdrYdCd;
		//this.cntrCdrYdCd=true;
	}
	public void setOrgFmLocCd(String orgFmLocCd) {
		this.orgFmLocCd = orgFmLocCd;
		//this.orgFmLocCd=true;
	}
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
		//this.destYdCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCnmvSeq(JSPUtil.getParameter(request, "cnmv_seq", ""));
		setEqSubstFlg(JSPUtil.getParameter(request, "eq_subst_flg", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHngrFlg(JSPUtil.getParameter(request, "hngr_flg", ""));
		setCntrDpSeq(JSPUtil.getParameter(request, "cntr_dp_seq", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrDeltFlg(JSPUtil.getParameter(request, "cntr_delt_flg", ""));
		setCntrPrtSeq(JSPUtil.getParameter(request, "cntr_prt_seq", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
		setSnapHisSeq(JSPUtil.getParameter(request, "snap_his_seq", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setCntrTaxExptFlg(JSPUtil.getParameter(request, "cntr_tax_expt_flg", ""));
		setRmkBlDpFlg(JSPUtil.getParameter(request, "rmk_bl_dp_flg", ""));
		setCntrCfmFlg(JSPUtil.getParameter(request, "cntr_cfm_flg", ""));
		setOrgToLocCd(JSPUtil.getParameter(request, "org_to_loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMcntrBdlNo(JSPUtil.getParameter(request, "mcntr_bdl_no", ""));
		setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
		setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
		setCstmsExpDt(JSPUtil.getParameter(request, "cstms_exp_dt", ""));
		setCnmvFlg(JSPUtil.getParameter(request, "cnmv_flg", ""));
		setObCyGenTpCd(JSPUtil.getParameter(request, "ob_cy_gen_tp_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setDestFmLocCd(JSPUtil.getParameter(request, "dest_fm_loc_cd", ""));
		setCntrHlgFlg(JSPUtil.getParameter(request, "cntr_hlg_flg", ""));
		setCstmsPrnFlg(JSPUtil.getParameter(request, "cstms_prn_flg", ""));
		setMfCfmFlg(JSPUtil.getParameter(request, "mf_cfm_flg", ""));
		setOrgYdCd(JSPUtil.getParameter(request, "org_yd_cd", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setCntrCdrDt(JSPUtil.getParameter(request, "cntr_cdr_dt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setCntrCycNo(JSPUtil.getParameter(request, "cntr_cyc_no", ""));
		setPoNo(JSPUtil.getParameter(request, "po_no", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
		setDoNoSplit(JSPUtil.getParameter(request, "do_no_split", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setCntrPrtFlg(JSPUtil.getParameter(request, "cntr_prt_flg", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setSnapDt(JSPUtil.getParameter(request, "snap_dt", ""));
		setObCyGenDt(JSPUtil.getParameter(request, "ob_cy_gen_dt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setDestToYdCd(JSPUtil.getParameter(request, "dest_to_yd_cd", ""));
		setCnmvEvntDt(JSPUtil.getParameter(request, "cnmv_evnt_dt", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setAdvShtgCd(JSPUtil.getParameter(request, "adv_shtg_cd", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDoNo(JSPUtil.getParameter(request, "do_no", ""));
		setEqSubstTpszCd(JSPUtil.getParameter(request, "eq_subst_tpsz_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrCdrYdCd(JSPUtil.getParameter(request, "cntr_cdr_yd_cd", ""));
		setOrgFmLocCd(JSPUtil.getParameter(request, "org_fm_loc_cd", ""));
		setDestYdCd(JSPUtil.getParameter(request, "dest_yd_cd", ""));
	}

	public BkgCntrHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCntrHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCntrHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cnmvSeq = (JSPUtil.getParameter(request, prefix	+ "cnmv_seq".trim(), length));
			String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix	+ "eq_subst_flg".trim(), length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] hngrFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_flg".trim(), length));
			String[] cntrDpSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_dp_seq".trim(), length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cntrDeltFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_delt_flg".trim(), length));
			String[] cntrPrtSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_prt_seq".trim(), length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty".trim(), length));
			String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix	+ "rd_cgo_flg".trim(), length));
			String[] snapHisSeq = (JSPUtil.getParameter(request, prefix	+ "snap_his_seq".trim(), length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty".trim(), length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt".trim(), length));
			String[] cntrTaxExptFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_tax_expt_flg".trim(), length));
			String[] rmkBlDpFlg = (JSPUtil.getParameter(request, prefix	+ "rmk_bl_dp_flg".trim(), length));
			String[] cntrCfmFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_cfm_flg".trim(), length));
			String[] orgToLocCd = (JSPUtil.getParameter(request, prefix	+ "org_to_loc_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] mcntrBdlNo = (JSPUtil.getParameter(request, prefix	+ "mcntr_bdl_no".trim(), length));
			String[] dcgoFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_flg".trim(), length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg".trim(), length));
			String[] cstmsExpDt = (JSPUtil.getParameter(request, prefix	+ "cstms_exp_dt".trim(), length));
			String[] cnmvFlg = (JSPUtil.getParameter(request, prefix	+ "cnmv_flg".trim(), length));
			String[] obCyGenTpCd = (JSPUtil.getParameter(request, prefix	+ "ob_cy_gen_tp_cd".trim(), length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd".trim(), length));
			String[] destFmLocCd = (JSPUtil.getParameter(request, prefix	+ "dest_fm_loc_cd".trim(), length));
			String[] cntrHlgFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_hlg_flg".trim(), length));
			String[] cstmsPrnFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_prn_flg".trim(), length));
			String[] mfCfmFlg = (JSPUtil.getParameter(request, prefix	+ "mf_cfm_flg".trim(), length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix	+ "org_yd_cd".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg".trim(), length));
			String[] cntrCdrDt = (JSPUtil.getParameter(request, prefix	+ "cntr_cdr_dt".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr".trim(), length));
			String[] cntrCycNo = (JSPUtil.getParameter(request, prefix	+ "cntr_cyc_no".trim(), length));
			String[] poNo = (JSPUtil.getParameter(request, prefix	+ "po_no".trim(), length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg".trim(), length));
			String[] doNoSplit = (JSPUtil.getParameter(request, prefix	+ "do_no_split".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no".trim(), length));
			String[] cntrPrtFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_prt_flg".trim(), length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd".trim(), length));
			String[] snapDt = (JSPUtil.getParameter(request, prefix	+ "snap_dt".trim(), length));
			String[] obCyGenDt = (JSPUtil.getParameter(request, prefix	+ "ob_cy_gen_dt".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd".trim(), length));
			String[] destToYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_to_yd_cd".trim(), length));
			String[] cnmvEvntDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_evnt_dt".trim(), length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] advShtgCd = (JSPUtil.getParameter(request, prefix	+ "adv_shtg_cd".trim(), length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd".trim(), length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no".trim(), length));
			String[] eqSubstTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_subst_tpsz_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] cntrCdrYdCd = (JSPUtil.getParameter(request, prefix	+ "cntr_cdr_yd_cd".trim(), length));
			String[] orgFmLocCd = (JSPUtil.getParameter(request, prefix	+ "org_fm_loc_cd".trim(), length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCntrHisVO();
				if (cnmvSeq[i] != null)
					model.setCnmvSeq(cnmvSeq[i]);
				if (eqSubstFlg[i] != null)
					model.setEqSubstFlg(eqSubstFlg[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hngrFlg[i] != null)
					model.setHngrFlg(hngrFlg[i]);
				if (cntrDpSeq[i] != null)
					model.setCntrDpSeq(cntrDpSeq[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrDeltFlg[i] != null)
					model.setCntrDeltFlg(cntrDeltFlg[i]);
				if (cntrPrtSeq[i] != null)
					model.setCntrPrtSeq(cntrPrtSeq[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (rdCgoFlg[i] != null)
					model.setRdCgoFlg(rdCgoFlg[i]);
				if (snapHisSeq[i] != null)
					model.setSnapHisSeq(snapHisSeq[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (cntrTaxExptFlg[i] != null)
					model.setCntrTaxExptFlg(cntrTaxExptFlg[i]);
				if (rmkBlDpFlg[i] != null)
					model.setRmkBlDpFlg(rmkBlDpFlg[i]);
				if (cntrCfmFlg[i] != null)
					model.setCntrCfmFlg(cntrCfmFlg[i]);
				if (orgToLocCd[i] != null)
					model.setOrgToLocCd(orgToLocCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mcntrBdlNo[i] != null)
					model.setMcntrBdlNo(mcntrBdlNo[i]);
				if (dcgoFlg[i] != null)
					model.setDcgoFlg(dcgoFlg[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (cstmsExpDt[i] != null)
					model.setCstmsExpDt(cstmsExpDt[i]);
				if (cnmvFlg[i] != null)
					model.setCnmvFlg(cnmvFlg[i]);
				if (obCyGenTpCd[i] != null)
					model.setObCyGenTpCd(obCyGenTpCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (destFmLocCd[i] != null)
					model.setDestFmLocCd(destFmLocCd[i]);
				if (cntrHlgFlg[i] != null)
					model.setCntrHlgFlg(cntrHlgFlg[i]);
				if (cstmsPrnFlg[i] != null)
					model.setCstmsPrnFlg(cstmsPrnFlg[i]);
				if (mfCfmFlg[i] != null)
					model.setMfCfmFlg(mfCfmFlg[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (cntrCdrDt[i] != null)
					model.setCntrCdrDt(cntrCdrDt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (cntrCycNo[i] != null)
					model.setCntrCycNo(cntrCycNo[i]);
				if (poNo[i] != null)
					model.setPoNo(poNo[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (doNoSplit[i] != null)
					model.setDoNoSplit(doNoSplit[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (cntrPrtFlg[i] != null)
					model.setCntrPrtFlg(cntrPrtFlg[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (snapDt[i] != null)
					model.setSnapDt(snapDt[i]);
				if (obCyGenDt[i] != null)
					model.setObCyGenDt(obCyGenDt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (destToYdCd[i] != null)
					model.setDestToYdCd(destToYdCd[i]);
				if (cnmvEvntDt[i] != null)
					model.setCnmvEvntDt(cnmvEvntDt[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (advShtgCd[i] != null)
					model.setAdvShtgCd(advShtgCd[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (eqSubstTpszCd[i] != null)
					model.setEqSubstTpszCd(eqSubstTpszCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrCdrYdCd[i] != null)
					model.setCntrCdrYdCd(cntrCdrYdCd[i]);
				if (orgFmLocCd[i] != null)
					model.setOrgFmLocCd(orgFmLocCd[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCntrHisVOs();
	}

	public BkgCntrHisVO[] getBkgCntrHisVOs(){
		BkgCntrHisVO[] vos = (BkgCntrHisVO[])models.toArray(new BkgCntrHisVO[models.size()]);
		return vos;
	}
	
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
	public void onDataFormat(){
		this.cnmvSeq = this.cnmvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstFlg = this.eqSubstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrFlg = this.hngrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDpSeq = this.cntrDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDeltFlg = this.cntrDeltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPrtSeq = this.cntrPrtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdCgoFlg = this.rdCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.snapHisSeq = this.snapHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTaxExptFlg = this.cntrTaxExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmkBlDpFlg = this.rmkBlDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCfmFlg = this.cntrCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgToLocCd = this.orgToLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcntrBdlNo = this.mcntrBdlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoFlg = this.dcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsExpDt = this.cstmsExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvFlg = this.cnmvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obCyGenTpCd = this.obCyGenTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destFmLocCd = this.destFmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHlgFlg = this.cntrHlgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPrnFlg = this.cstmsPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfCfmFlg = this.mfCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCdrDt = this.cntrCdrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCycNo = this.cntrCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poNo = this.poNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNoSplit = this.doNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPrtFlg = this.cntrPrtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.snapDt = this.snapDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obCyGenDt = this.obCyGenDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destToYdCd = this.destToYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvEvntDt = this.cnmvEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.advShtgCd = this.advShtgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstTpszCd = this.eqSubstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCdrYdCd = this.cntrCdrYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgFmLocCd = this.orgFmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
