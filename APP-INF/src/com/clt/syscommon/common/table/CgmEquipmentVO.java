/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmEquipmentVO.java
*@FileTitle : CgmEquipmentVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.30
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.04.30 박의수 
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
 * @author 박의수
 * @since J2EE 1.5
 */

public class CgmEquipmentVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmEquipmentVO> models = new ArrayList<CgmEquipmentVO>();
	
	/* Column Inpo */
	private String dispFlg = null;
	/* Column Inpo */
	private String chssMvmtStsCd = null;
	/* Column Inpo */
	private String agmtSeq = null;
	/* Column Inpo */
	private String onhYdCd = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String agmtLstmCd = null;
	/* Column Inpo */
	private String eqKndCd = null;
	/* Column Inpo */
	private String chssMvmtDestYdCd = null;
	/* Column Inpo */
	private String chssRgstPrdCd = null;
	/* Column Inpo */
	private String crntLocCd = null;
	/* Column Inpo */
	private String onhDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String chssRgstExpDt = null;
	/* Column Inpo */
	private String onhOfcCd = null;
	/* Column Inpo */
	private String eqLotNo = null;
	/* Column Inpo */
	private String mgstFuelCapa = null;
	/* Column Inpo */
	private String mgstVltgCapa = null;
	/* Column Inpo */
	private String crntYdCd = null;
	/* Column Inpo */
	private String actOnhDt = null;
	/* Column Inpo */
	private String chssTmlUseFlg = null;
	/* Column Inpo */
	private String mftDt = null;
	/* Column Inpo */
	private String mgstWarrEndDt = null;
	/* Column Inpo */
	private String eqNo = null;
	/* Column Inpo */
	private String chssOwnrCoCd = null;
	/* Column Inpo */
	private String chssRgstYr = null;
	/* Column Inpo */
	private String chssTareWgt = null;
	/* Column Inpo */
	private String faIfErrMsg = null;
	/* Column Inpo */
	private String chssGateIoFlg = null;
	/* Column Inpo */
	private String mgstRunHrsUpdDt = null;
	/* Column Inpo */
	private String dmgFlg = null;
	/* Column Inpo */
	private String faIfDt = null;
	/* Column Inpo */
	private String mgstRunHrs = null;
	/* Column Inpo */
	private String chssTitNo = null;
	/* Column Inpo */
	private String agmtVerNo = null;
	/* Column Inpo */
	private String ifSeq = null;
	/* Column Inpo */
	private String chssRgstSteCd = null;
	/* Column Inpo */
	private String chssRgstUpdOfcCd = null;
	/* Column Inpo */
	private String faIfTpCd = null;
	/* Column Inpo */
	private String chssAlsNo = null;
	/* Column Inpo */
	private String agmtOfcCtyCd = null;
	/* Column Inpo */
	private String ifTtlRowKnt = null;
	/* Column Inpo */
	private String chssRgstCntCd = null;
	/* Column Inpo */
	private String chssRgstLicNo = null;
	/* Column Inpo */
	private String eqTpszCd = null;
	/* Column Inpo */
	private String chssRgstUpdDt = null;
	/* Column Inpo */
	private String retAproNo = null;
	/* Column Inpo */
	private String atchMgstNo = null;
	/* Column Inpo */
	private String aciacDivCd = null;
	/* Column Inpo */
	private String faIfStsCd = null;
	/* Column Inpo */
	private String chssRgstUpdId = null;
	/* Column Inpo */
	private String eqSpecNo = null;
	/* Column Inpo */
	private String mgstMchnSerNo = null;
	/* Column Inpo */
	private String eaiIfNo = null;
	/* Column Inpo */
	private String lstUseCoCd = null;
	/* Column Inpo */
	private String chssMvmtDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String faEqNo = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String chssVehIdNo = null;
	/* Column Inpo */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmEquipmentVO() {}

	public CgmEquipmentVO(String ibflag, String pagerows, String eqNo, String eqKndCd, String eqTpszCd, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String agmtLstmCd, String aciacDivCd, String eqSpecNo, String eqLotNo, String mftDt, String onhOfcCd, String onhDt, String onhYdCd, String crntYdCd, String crntLocCd, String chssMvmtDestYdCd, String chssMvmtStsCd, String chssMvmtDt, String chssGateIoFlg, String atchMgstNo, String dmgFlg, String dispFlg, String chssOwnrCoCd, String lstUseCoCd, String actOnhDt, String chssPoolCd, String chssVehIdNo, String chssAlsNo, String chssTitNo, String chssTareWgt, String chssTmlUseFlg, String chssRgstCntCd, String chssRgstSteCd, String chssRgstLicNo, String chssRgstYr, String chssRgstPrdCd, String chssRgstExpDt, String chssRgstUpdOfcCd, String chssRgstUpdId, String chssRgstUpdDt, String mgstMchnSerNo, String mgstRunHrs, String mgstRunHrsUpdDt, String mgstWarrEndDt, String mgstVltgCapa, String mgstFuelCapa, String eaiIfNo, String ifTtlRowKnt, String ifSeq, String faIfTpCd, String faIfStsCd, String faIfErrMsg, String faIfDt, String faEqNo, String retAproNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.dispFlg = dispFlg;
		this.chssMvmtStsCd = chssMvmtStsCd;
		this.agmtSeq = agmtSeq;
		this.onhYdCd = onhYdCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.agmtLstmCd = agmtLstmCd;
		this.eqKndCd = eqKndCd;
		this.chssMvmtDestYdCd = chssMvmtDestYdCd;
		this.chssRgstPrdCd = chssRgstPrdCd;
		this.crntLocCd = crntLocCd;
		this.onhDt = onhDt;
		this.ibflag = ibflag;
		this.chssRgstExpDt = chssRgstExpDt;
		this.onhOfcCd = onhOfcCd;
		this.eqLotNo = eqLotNo;
		this.mgstFuelCapa = mgstFuelCapa;
		this.mgstVltgCapa = mgstVltgCapa;
		this.crntYdCd = crntYdCd;
		this.actOnhDt = actOnhDt;
		this.chssTmlUseFlg = chssTmlUseFlg;
		this.mftDt = mftDt;
		this.mgstWarrEndDt = mgstWarrEndDt;
		this.eqNo = eqNo;
		this.chssOwnrCoCd = chssOwnrCoCd;
		this.chssRgstYr = chssRgstYr;
		this.chssTareWgt = chssTareWgt;
		this.faIfErrMsg = faIfErrMsg;
		this.chssGateIoFlg = chssGateIoFlg;
		this.mgstRunHrsUpdDt = mgstRunHrsUpdDt;
		this.dmgFlg = dmgFlg;
		this.faIfDt = faIfDt;
		this.mgstRunHrs = mgstRunHrs;
		this.chssTitNo = chssTitNo;
		this.agmtVerNo = agmtVerNo;
		this.ifSeq = ifSeq;
		this.chssRgstSteCd = chssRgstSteCd;
		this.chssRgstUpdOfcCd = chssRgstUpdOfcCd;
		this.faIfTpCd = faIfTpCd;
		this.chssAlsNo = chssAlsNo;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.ifTtlRowKnt = ifTtlRowKnt;
		this.chssRgstCntCd = chssRgstCntCd;
		this.chssRgstLicNo = chssRgstLicNo;
		this.eqTpszCd = eqTpszCd;
		this.chssRgstUpdDt = chssRgstUpdDt;
		this.retAproNo = retAproNo;
		this.atchMgstNo = atchMgstNo;
		this.aciacDivCd = aciacDivCd;
		this.faIfStsCd = faIfStsCd;
		this.chssRgstUpdId = chssRgstUpdId;
		this.eqSpecNo = eqSpecNo;
		this.mgstMchnSerNo = mgstMchnSerNo;
		this.eaiIfNo = eaiIfNo;
		this.lstUseCoCd = lstUseCoCd;
		this.chssMvmtDt = chssMvmtDt;
		this.creDt = creDt;
		this.faEqNo = faEqNo;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
		this.chssVehIdNo = chssVehIdNo;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("disp_flg", getDispFlg());
		this.hashColumns.put("chss_mvmt_sts_cd", getChssMvmtStsCd());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("onh_yd_cd", getOnhYdCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_lstm_cd", getAgmtLstmCd());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("chss_mvmt_dest_yd_cd", getChssMvmtDestYdCd());
		this.hashColumns.put("chss_rgst_prd_cd", getChssRgstPrdCd());
		this.hashColumns.put("crnt_loc_cd", getCrntLocCd());
		this.hashColumns.put("onh_dt", getOnhDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("chss_rgst_exp_dt", getChssRgstExpDt());
		this.hashColumns.put("onh_ofc_cd", getOnhOfcCd());
		this.hashColumns.put("eq_lot_no", getEqLotNo());
		this.hashColumns.put("mgst_fuel_capa", getMgstFuelCapa());
		this.hashColumns.put("mgst_vltg_capa", getMgstVltgCapa());
		this.hashColumns.put("crnt_yd_cd", getCrntYdCd());
		this.hashColumns.put("act_onh_dt", getActOnhDt());
		this.hashColumns.put("chss_tml_use_flg", getChssTmlUseFlg());
		this.hashColumns.put("mft_dt", getMftDt());
		this.hashColumns.put("mgst_warr_end_dt", getMgstWarrEndDt());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("chss_ownr_co_cd", getChssOwnrCoCd());
		this.hashColumns.put("chss_rgst_yr", getChssRgstYr());
		this.hashColumns.put("chss_tare_wgt", getChssTareWgt());
		this.hashColumns.put("fa_if_err_msg", getFaIfErrMsg());
		this.hashColumns.put("chss_gate_io_flg", getChssGateIoFlg());
		this.hashColumns.put("mgst_run_hrs_upd_dt", getMgstRunHrsUpdDt());
		this.hashColumns.put("dmg_flg", getDmgFlg());
		this.hashColumns.put("fa_if_dt", getFaIfDt());
		this.hashColumns.put("mgst_run_hrs", getMgstRunHrs());
		this.hashColumns.put("chss_tit_no", getChssTitNo());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("if_seq", getIfSeq());
		this.hashColumns.put("chss_rgst_ste_cd", getChssRgstSteCd());
		this.hashColumns.put("chss_rgst_upd_ofc_cd", getChssRgstUpdOfcCd());
		this.hashColumns.put("fa_if_tp_cd", getFaIfTpCd());
		this.hashColumns.put("chss_als_no", getChssAlsNo());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("if_ttl_row_knt", getIfTtlRowKnt());
		this.hashColumns.put("chss_rgst_cnt_cd", getChssRgstCntCd());
		this.hashColumns.put("chss_rgst_lic_no", getChssRgstLicNo());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("chss_rgst_upd_dt", getChssRgstUpdDt());
		this.hashColumns.put("ret_apro_no", getRetAproNo());
		this.hashColumns.put("atch_mgst_no", getAtchMgstNo());
		this.hashColumns.put("aciac_div_cd", getAciacDivCd());
		this.hashColumns.put("fa_if_sts_cd", getFaIfStsCd());
		this.hashColumns.put("chss_rgst_upd_id", getChssRgstUpdId());
		this.hashColumns.put("eq_spec_no", getEqSpecNo());
		this.hashColumns.put("mgst_mchn_ser_no", getMgstMchnSerNo());
		this.hashColumns.put("eai_if_no", getEaiIfNo());
		this.hashColumns.put("lst_use_co_cd", getLstUseCoCd());
		this.hashColumns.put("chss_mvmt_dt", getChssMvmtDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fa_eq_no", getFaEqNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_veh_id_no", getChssVehIdNo());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("disp_flg", "dispFlg");
		this.hashFields.put("chss_mvmt_sts_cd", "chssMvmtStsCd");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("onh_yd_cd", "onhYdCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_lstm_cd", "agmtLstmCd");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("chss_mvmt_dest_yd_cd", "chssMvmtDestYdCd");
		this.hashFields.put("chss_rgst_prd_cd", "chssRgstPrdCd");
		this.hashFields.put("crnt_loc_cd", "crntLocCd");
		this.hashFields.put("onh_dt", "onhDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("chss_rgst_exp_dt", "chssRgstExpDt");
		this.hashFields.put("onh_ofc_cd", "onhOfcCd");
		this.hashFields.put("eq_lot_no", "eqLotNo");
		this.hashFields.put("mgst_fuel_capa", "mgstFuelCapa");
		this.hashFields.put("mgst_vltg_capa", "mgstVltgCapa");
		this.hashFields.put("crnt_yd_cd", "crntYdCd");
		this.hashFields.put("act_onh_dt", "actOnhDt");
		this.hashFields.put("chss_tml_use_flg", "chssTmlUseFlg");
		this.hashFields.put("mft_dt", "mftDt");
		this.hashFields.put("mgst_warr_end_dt", "mgstWarrEndDt");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("chss_ownr_co_cd", "chssOwnrCoCd");
		this.hashFields.put("chss_rgst_yr", "chssRgstYr");
		this.hashFields.put("chss_tare_wgt", "chssTareWgt");
		this.hashFields.put("fa_if_err_msg", "faIfErrMsg");
		this.hashFields.put("chss_gate_io_flg", "chssGateIoFlg");
		this.hashFields.put("mgst_run_hrs_upd_dt", "mgstRunHrsUpdDt");
		this.hashFields.put("dmg_flg", "dmgFlg");
		this.hashFields.put("fa_if_dt", "faIfDt");
		this.hashFields.put("mgst_run_hrs", "mgstRunHrs");
		this.hashFields.put("chss_tit_no", "chssTitNo");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("if_seq", "ifSeq");
		this.hashFields.put("chss_rgst_ste_cd", "chssRgstSteCd");
		this.hashFields.put("chss_rgst_upd_ofc_cd", "chssRgstUpdOfcCd");
		this.hashFields.put("fa_if_tp_cd", "faIfTpCd");
		this.hashFields.put("chss_als_no", "chssAlsNo");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("if_ttl_row_knt", "ifTtlRowKnt");
		this.hashFields.put("chss_rgst_cnt_cd", "chssRgstCntCd");
		this.hashFields.put("chss_rgst_lic_no", "chssRgstLicNo");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("chss_rgst_upd_dt", "chssRgstUpdDt");
		this.hashFields.put("ret_apro_no", "retAproNo");
		this.hashFields.put("atch_mgst_no", "atchMgstNo");
		this.hashFields.put("aciac_div_cd", "aciacDivCd");
		this.hashFields.put("fa_if_sts_cd", "faIfStsCd");
		this.hashFields.put("chss_rgst_upd_id", "chssRgstUpdId");
		this.hashFields.put("eq_spec_no", "eqSpecNo");
		this.hashFields.put("mgst_mchn_ser_no", "mgstMchnSerNo");
		this.hashFields.put("eai_if_no", "eaiIfNo");
		this.hashFields.put("lst_use_co_cd", "lstUseCoCd");
		this.hashFields.put("chss_mvmt_dt", "chssMvmtDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fa_eq_no", "faEqNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_veh_id_no", "chssVehIdNo");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getDispFlg() {
		return this.dispFlg;
	}
	public String getChssMvmtStsCd() {
		return this.chssMvmtStsCd;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getOnhYdCd() {
		return this.onhYdCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getAgmtLstmCd() {
		return this.agmtLstmCd;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getChssMvmtDestYdCd() {
		return this.chssMvmtDestYdCd;
	}
	public String getChssRgstPrdCd() {
		return this.chssRgstPrdCd;
	}
	public String getCrntLocCd() {
		return this.crntLocCd;
	}
	public String getOnhDt() {
		return this.onhDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getChssRgstExpDt() {
		return this.chssRgstExpDt;
	}
	public String getOnhOfcCd() {
		return this.onhOfcCd;
	}
	public String getEqLotNo() {
		return this.eqLotNo;
	}
	public String getMgstFuelCapa() {
		return this.mgstFuelCapa;
	}
	public String getMgstVltgCapa() {
		return this.mgstVltgCapa;
	}
	public String getCrntYdCd() {
		return this.crntYdCd;
	}
	public String getActOnhDt() {
		return this.actOnhDt;
	}
	public String getChssTmlUseFlg() {
		return this.chssTmlUseFlg;
	}
	public String getMftDt() {
		return this.mftDt;
	}
	public String getMgstWarrEndDt() {
		return this.mgstWarrEndDt;
	}
	public String getEqNo() {
		return this.eqNo;
	}
	public String getChssOwnrCoCd() {
		return this.chssOwnrCoCd;
	}
	public String getChssRgstYr() {
		return this.chssRgstYr;
	}
	public String getChssTareWgt() {
		return this.chssTareWgt;
	}
	public String getFaIfErrMsg() {
		return this.faIfErrMsg;
	}
	public String getChssGateIoFlg() {
		return this.chssGateIoFlg;
	}
	public String getMgstRunHrsUpdDt() {
		return this.mgstRunHrsUpdDt;
	}
	public String getDmgFlg() {
		return this.dmgFlg;
	}
	public String getFaIfDt() {
		return this.faIfDt;
	}
	public String getMgstRunHrs() {
		return this.mgstRunHrs;
	}
	public String getChssTitNo() {
		return this.chssTitNo;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getIfSeq() {
		return this.ifSeq;
	}
	public String getChssRgstSteCd() {
		return this.chssRgstSteCd;
	}
	public String getChssRgstUpdOfcCd() {
		return this.chssRgstUpdOfcCd;
	}
	public String getFaIfTpCd() {
		return this.faIfTpCd;
	}
	public String getChssAlsNo() {
		return this.chssAlsNo;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getIfTtlRowKnt() {
		return this.ifTtlRowKnt;
	}
	public String getChssRgstCntCd() {
		return this.chssRgstCntCd;
	}
	public String getChssRgstLicNo() {
		return this.chssRgstLicNo;
	}
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	public String getChssRgstUpdDt() {
		return this.chssRgstUpdDt;
	}
	public String getRetAproNo() {
		return this.retAproNo;
	}
	public String getAtchMgstNo() {
		return this.atchMgstNo;
	}
	public String getAciacDivCd() {
		return this.aciacDivCd;
	}
	public String getFaIfStsCd() {
		return this.faIfStsCd;
	}
	public String getChssRgstUpdId() {
		return this.chssRgstUpdId;
	}
	public String getEqSpecNo() {
		return this.eqSpecNo;
	}
	public String getMgstMchnSerNo() {
		return this.mgstMchnSerNo;
	}
	public String getEaiIfNo() {
		return this.eaiIfNo;
	}
	public String getLstUseCoCd() {
		return this.lstUseCoCd;
	}
	public String getChssMvmtDt() {
		return this.chssMvmtDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getFaEqNo() {
		return this.faEqNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssVehIdNo() {
		return this.chssVehIdNo;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setDispFlg(String dispFlg) {
		this.dispFlg = dispFlg;
		//this.dispFlg=true;
	}
	public void setChssMvmtStsCd(String chssMvmtStsCd) {
		this.chssMvmtStsCd = chssMvmtStsCd;
		//this.chssMvmtStsCd=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setOnhYdCd(String onhYdCd) {
		this.onhYdCd = onhYdCd;
		//this.onhYdCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setAgmtLstmCd(String agmtLstmCd) {
		this.agmtLstmCd = agmtLstmCd;
		//this.agmtLstmCd=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setChssMvmtDestYdCd(String chssMvmtDestYdCd) {
		this.chssMvmtDestYdCd = chssMvmtDestYdCd;
		//this.chssMvmtDestYdCd=true;
	}
	public void setChssRgstPrdCd(String chssRgstPrdCd) {
		this.chssRgstPrdCd = chssRgstPrdCd;
		//this.chssRgstPrdCd=true;
	}
	public void setCrntLocCd(String crntLocCd) {
		this.crntLocCd = crntLocCd;
		//this.crntLocCd=true;
	}
	public void setOnhDt(String onhDt) {
		this.onhDt = onhDt;
		//this.onhDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setChssRgstExpDt(String chssRgstExpDt) {
		this.chssRgstExpDt = chssRgstExpDt;
		//this.chssRgstExpDt=true;
	}
	public void setOnhOfcCd(String onhOfcCd) {
		this.onhOfcCd = onhOfcCd;
		//this.onhOfcCd=true;
	}
	public void setEqLotNo(String eqLotNo) {
		this.eqLotNo = eqLotNo;
		//this.eqLotNo=true;
	}
	public void setMgstFuelCapa(String mgstFuelCapa) {
		this.mgstFuelCapa = mgstFuelCapa;
		//this.mgstFuelCapa=true;
	}
	public void setMgstVltgCapa(String mgstVltgCapa) {
		this.mgstVltgCapa = mgstVltgCapa;
		//this.mgstVltgCapa=true;
	}
	public void setCrntYdCd(String crntYdCd) {
		this.crntYdCd = crntYdCd;
		//this.crntYdCd=true;
	}
	public void setActOnhDt(String actOnhDt) {
		this.actOnhDt = actOnhDt;
		//this.actOnhDt=true;
	}
	public void setChssTmlUseFlg(String chssTmlUseFlg) {
		this.chssTmlUseFlg = chssTmlUseFlg;
		//this.chssTmlUseFlg=true;
	}
	public void setMftDt(String mftDt) {
		this.mftDt = mftDt;
		//this.mftDt=true;
	}
	public void setMgstWarrEndDt(String mgstWarrEndDt) {
		this.mgstWarrEndDt = mgstWarrEndDt;
		//this.mgstWarrEndDt=true;
	}
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
		//this.eqNo=true;
	}
	public void setChssOwnrCoCd(String chssOwnrCoCd) {
		this.chssOwnrCoCd = chssOwnrCoCd;
		//this.chssOwnrCoCd=true;
	}
	public void setChssRgstYr(String chssRgstYr) {
		this.chssRgstYr = chssRgstYr;
		//this.chssRgstYr=true;
	}
	public void setChssTareWgt(String chssTareWgt) {
		this.chssTareWgt = chssTareWgt;
		//this.chssTareWgt=true;
	}
	public void setFaIfErrMsg(String faIfErrMsg) {
		this.faIfErrMsg = faIfErrMsg;
		//this.faIfErrMsg=true;
	}
	public void setChssGateIoFlg(String chssGateIoFlg) {
		this.chssGateIoFlg = chssGateIoFlg;
		//this.chssGateIoFlg=true;
	}
	public void setMgstRunHrsUpdDt(String mgstRunHrsUpdDt) {
		this.mgstRunHrsUpdDt = mgstRunHrsUpdDt;
		//this.mgstRunHrsUpdDt=true;
	}
	public void setDmgFlg(String dmgFlg) {
		this.dmgFlg = dmgFlg;
		//this.dmgFlg=true;
	}
	public void setFaIfDt(String faIfDt) {
		this.faIfDt = faIfDt;
		//this.faIfDt=true;
	}
	public void setMgstRunHrs(String mgstRunHrs) {
		this.mgstRunHrs = mgstRunHrs;
		//this.mgstRunHrs=true;
	}
	public void setChssTitNo(String chssTitNo) {
		this.chssTitNo = chssTitNo;
		//this.chssTitNo=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setIfSeq(String ifSeq) {
		this.ifSeq = ifSeq;
		//this.ifSeq=true;
	}
	public void setChssRgstSteCd(String chssRgstSteCd) {
		this.chssRgstSteCd = chssRgstSteCd;
		//this.chssRgstSteCd=true;
	}
	public void setChssRgstUpdOfcCd(String chssRgstUpdOfcCd) {
		this.chssRgstUpdOfcCd = chssRgstUpdOfcCd;
		//this.chssRgstUpdOfcCd=true;
	}
	public void setFaIfTpCd(String faIfTpCd) {
		this.faIfTpCd = faIfTpCd;
		//this.faIfTpCd=true;
	}
	public void setChssAlsNo(String chssAlsNo) {
		this.chssAlsNo = chssAlsNo;
		//this.chssAlsNo=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setIfTtlRowKnt(String ifTtlRowKnt) {
		this.ifTtlRowKnt = ifTtlRowKnt;
		//this.ifTtlRowKnt=true;
	}
	public void setChssRgstCntCd(String chssRgstCntCd) {
		this.chssRgstCntCd = chssRgstCntCd;
		//this.chssRgstCntCd=true;
	}
	public void setChssRgstLicNo(String chssRgstLicNo) {
		this.chssRgstLicNo = chssRgstLicNo;
		//this.chssRgstLicNo=true;
	}
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
		//this.eqTpszCd=true;
	}
	public void setChssRgstUpdDt(String chssRgstUpdDt) {
		this.chssRgstUpdDt = chssRgstUpdDt;
		//this.chssRgstUpdDt=true;
	}
	public void setRetAproNo(String retAproNo) {
		this.retAproNo = retAproNo;
		//this.retAproNo=true;
	}
	public void setAtchMgstNo(String atchMgstNo) {
		this.atchMgstNo = atchMgstNo;
		//this.atchMgstNo=true;
	}
	public void setAciacDivCd(String aciacDivCd) {
		this.aciacDivCd = aciacDivCd;
		//this.aciacDivCd=true;
	}
	public void setFaIfStsCd(String faIfStsCd) {
		this.faIfStsCd = faIfStsCd;
		//this.faIfStsCd=true;
	}
	public void setChssRgstUpdId(String chssRgstUpdId) {
		this.chssRgstUpdId = chssRgstUpdId;
		//this.chssRgstUpdId=true;
	}
	public void setEqSpecNo(String eqSpecNo) {
		this.eqSpecNo = eqSpecNo;
		//this.eqSpecNo=true;
	}
	public void setMgstMchnSerNo(String mgstMchnSerNo) {
		this.mgstMchnSerNo = mgstMchnSerNo;
		//this.mgstMchnSerNo=true;
	}
	public void setEaiIfNo(String eaiIfNo) {
		this.eaiIfNo = eaiIfNo;
		//this.eaiIfNo=true;
	}
	public void setLstUseCoCd(String lstUseCoCd) {
		this.lstUseCoCd = lstUseCoCd;
		//this.lstUseCoCd=true;
	}
	public void setChssMvmtDt(String chssMvmtDt) {
		this.chssMvmtDt = chssMvmtDt;
		//this.chssMvmtDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setFaEqNo(String faEqNo) {
		this.faEqNo = faEqNo;
		//this.faEqNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssVehIdNo(String chssVehIdNo) {
		this.chssVehIdNo = chssVehIdNo;
		//this.chssVehIdNo=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setDispFlg(JSPUtil.getParameter(request, "disp_flg", ""));
		setChssMvmtStsCd(JSPUtil.getParameter(request, "chss_mvmt_sts_cd", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setOnhYdCd(JSPUtil.getParameter(request, "onh_yd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAgmtLstmCd(JSPUtil.getParameter(request, "agmt_lstm_cd", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setChssMvmtDestYdCd(JSPUtil.getParameter(request, "chss_mvmt_dest_yd_cd", ""));
		setChssRgstPrdCd(JSPUtil.getParameter(request, "chss_rgst_prd_cd", ""));
		setCrntLocCd(JSPUtil.getParameter(request, "crnt_loc_cd", ""));
		setOnhDt(JSPUtil.getParameter(request, "onh_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setChssRgstExpDt(JSPUtil.getParameter(request, "chss_rgst_exp_dt", ""));
		setOnhOfcCd(JSPUtil.getParameter(request, "onh_ofc_cd", ""));
		setEqLotNo(JSPUtil.getParameter(request, "eq_lot_no", ""));
		setMgstFuelCapa(JSPUtil.getParameter(request, "mgst_fuel_capa", ""));
		setMgstVltgCapa(JSPUtil.getParameter(request, "mgst_vltg_capa", ""));
		setCrntYdCd(JSPUtil.getParameter(request, "crnt_yd_cd", ""));
		setActOnhDt(JSPUtil.getParameter(request, "act_onh_dt", ""));
		setChssTmlUseFlg(JSPUtil.getParameter(request, "chss_tml_use_flg", ""));
		setMftDt(JSPUtil.getParameter(request, "mft_dt", ""));
		setMgstWarrEndDt(JSPUtil.getParameter(request, "mgst_warr_end_dt", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setChssOwnrCoCd(JSPUtil.getParameter(request, "chss_ownr_co_cd", ""));
		setChssRgstYr(JSPUtil.getParameter(request, "chss_rgst_yr", ""));
		setChssTareWgt(JSPUtil.getParameter(request, "chss_tare_wgt", ""));
		setFaIfErrMsg(JSPUtil.getParameter(request, "fa_if_err_msg", ""));
		setChssGateIoFlg(JSPUtil.getParameter(request, "chss_gate_io_flg", ""));
		setMgstRunHrsUpdDt(JSPUtil.getParameter(request, "mgst_run_hrs_upd_dt", ""));
		setDmgFlg(JSPUtil.getParameter(request, "dmg_flg", ""));
		setFaIfDt(JSPUtil.getParameter(request, "fa_if_dt", ""));
		setMgstRunHrs(JSPUtil.getParameter(request, "mgst_run_hrs", ""));
		setChssTitNo(JSPUtil.getParameter(request, "chss_tit_no", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setIfSeq(JSPUtil.getParameter(request, "if_seq", ""));
		setChssRgstSteCd(JSPUtil.getParameter(request, "chss_rgst_ste_cd", ""));
		setChssRgstUpdOfcCd(JSPUtil.getParameter(request, "chss_rgst_upd_ofc_cd", ""));
		setFaIfTpCd(JSPUtil.getParameter(request, "fa_if_tp_cd", ""));
		setChssAlsNo(JSPUtil.getParameter(request, "chss_als_no", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setIfTtlRowKnt(JSPUtil.getParameter(request, "if_ttl_row_knt", ""));
		setChssRgstCntCd(JSPUtil.getParameter(request, "chss_rgst_cnt_cd", ""));
		setChssRgstLicNo(JSPUtil.getParameter(request, "chss_rgst_lic_no", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setChssRgstUpdDt(JSPUtil.getParameter(request, "chss_rgst_upd_dt", ""));
		setRetAproNo(JSPUtil.getParameter(request, "ret_apro_no", ""));
		setAtchMgstNo(JSPUtil.getParameter(request, "atch_mgst_no", ""));
		setAciacDivCd(JSPUtil.getParameter(request, "aciac_div_cd", ""));
		setFaIfStsCd(JSPUtil.getParameter(request, "fa_if_sts_cd", ""));
		setChssRgstUpdId(JSPUtil.getParameter(request, "chss_rgst_upd_id", ""));
		setEqSpecNo(JSPUtil.getParameter(request, "eq_spec_no", ""));
		setMgstMchnSerNo(JSPUtil.getParameter(request, "mgst_mchn_ser_no", ""));
		setEaiIfNo(JSPUtil.getParameter(request, "eai_if_no", ""));
		setLstUseCoCd(JSPUtil.getParameter(request, "lst_use_co_cd", ""));
		setChssMvmtDt(JSPUtil.getParameter(request, "chss_mvmt_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFaEqNo(JSPUtil.getParameter(request, "fa_eq_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssVehIdNo(JSPUtil.getParameter(request, "chss_veh_id_no", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmEquipmentVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmEquipmentVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmEquipmentVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dispFlg = (JSPUtil.getParameter(request, prefix	+ "disp_flg".trim(), length));
			String[] chssMvmtStsCd = (JSPUtil.getParameter(request, prefix	+ "chss_mvmt_sts_cd".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] onhYdCd = (JSPUtil.getParameter(request, prefix	+ "onh_yd_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] agmtLstmCd = (JSPUtil.getParameter(request, prefix	+ "agmt_lstm_cd".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] chssMvmtDestYdCd = (JSPUtil.getParameter(request, prefix	+ "chss_mvmt_dest_yd_cd".trim(), length));
			String[] chssRgstPrdCd = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_prd_cd".trim(), length));
			String[] crntLocCd = (JSPUtil.getParameter(request, prefix	+ "crnt_loc_cd".trim(), length));
			String[] onhDt = (JSPUtil.getParameter(request, prefix	+ "onh_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] chssRgstExpDt = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_exp_dt".trim(), length));
			String[] onhOfcCd = (JSPUtil.getParameter(request, prefix	+ "onh_ofc_cd".trim(), length));
			String[] eqLotNo = (JSPUtil.getParameter(request, prefix	+ "eq_lot_no".trim(), length));
			String[] mgstFuelCapa = (JSPUtil.getParameter(request, prefix	+ "mgst_fuel_capa".trim(), length));
			String[] mgstVltgCapa = (JSPUtil.getParameter(request, prefix	+ "mgst_vltg_capa".trim(), length));
			String[] crntYdCd = (JSPUtil.getParameter(request, prefix	+ "crnt_yd_cd".trim(), length));
			String[] actOnhDt = (JSPUtil.getParameter(request, prefix	+ "act_onh_dt".trim(), length));
			String[] chssTmlUseFlg = (JSPUtil.getParameter(request, prefix	+ "chss_tml_use_flg".trim(), length));
			String[] mftDt = (JSPUtil.getParameter(request, prefix	+ "mft_dt".trim(), length));
			String[] mgstWarrEndDt = (JSPUtil.getParameter(request, prefix	+ "mgst_warr_end_dt".trim(), length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no".trim(), length));
			String[] chssOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "chss_ownr_co_cd".trim(), length));
			String[] chssRgstYr = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_yr".trim(), length));
			String[] chssTareWgt = (JSPUtil.getParameter(request, prefix	+ "chss_tare_wgt".trim(), length));
			String[] faIfErrMsg = (JSPUtil.getParameter(request, prefix	+ "fa_if_err_msg".trim(), length));
			String[] chssGateIoFlg = (JSPUtil.getParameter(request, prefix	+ "chss_gate_io_flg".trim(), length));
			String[] mgstRunHrsUpdDt = (JSPUtil.getParameter(request, prefix	+ "mgst_run_hrs_upd_dt".trim(), length));
			String[] dmgFlg = (JSPUtil.getParameter(request, prefix	+ "dmg_flg".trim(), length));
			String[] faIfDt = (JSPUtil.getParameter(request, prefix	+ "fa_if_dt".trim(), length));
			String[] mgstRunHrs = (JSPUtil.getParameter(request, prefix	+ "mgst_run_hrs".trim(), length));
			String[] chssTitNo = (JSPUtil.getParameter(request, prefix	+ "chss_tit_no".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] ifSeq = (JSPUtil.getParameter(request, prefix	+ "if_seq".trim(), length));
			String[] chssRgstSteCd = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_ste_cd".trim(), length));
			String[] chssRgstUpdOfcCd = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_upd_ofc_cd".trim(), length));
			String[] faIfTpCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_tp_cd".trim(), length));
			String[] chssAlsNo = (JSPUtil.getParameter(request, prefix	+ "chss_als_no".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] ifTtlRowKnt = (JSPUtil.getParameter(request, prefix	+ "if_ttl_row_knt".trim(), length));
			String[] chssRgstCntCd = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_cnt_cd".trim(), length));
			String[] chssRgstLicNo = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_lic_no".trim(), length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd".trim(), length));
			String[] chssRgstUpdDt = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_upd_dt".trim(), length));
			String[] retAproNo = (JSPUtil.getParameter(request, prefix	+ "ret_apro_no".trim(), length));
			String[] atchMgstNo = (JSPUtil.getParameter(request, prefix	+ "atch_mgst_no".trim(), length));
			String[] aciacDivCd = (JSPUtil.getParameter(request, prefix	+ "aciac_div_cd".trim(), length));
			String[] faIfStsCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_sts_cd".trim(), length));
			String[] chssRgstUpdId = (JSPUtil.getParameter(request, prefix	+ "chss_rgst_upd_id".trim(), length));
			String[] eqSpecNo = (JSPUtil.getParameter(request, prefix	+ "eq_spec_no".trim(), length));
			String[] mgstMchnSerNo = (JSPUtil.getParameter(request, prefix	+ "mgst_mchn_ser_no".trim(), length));
			String[] eaiIfNo = (JSPUtil.getParameter(request, prefix	+ "eai_if_no".trim(), length));
			String[] lstUseCoCd = (JSPUtil.getParameter(request, prefix	+ "lst_use_co_cd".trim(), length));
			String[] chssMvmtDt = (JSPUtil.getParameter(request, prefix	+ "chss_mvmt_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] faEqNo = (JSPUtil.getParameter(request, prefix	+ "fa_eq_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssVehIdNo = (JSPUtil.getParameter(request, prefix	+ "chss_veh_id_no".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmEquipmentVO();
				if (dispFlg[i] != null)
					model.setDispFlg(dispFlg[i]);
				if (chssMvmtStsCd[i] != null)
					model.setChssMvmtStsCd(chssMvmtStsCd[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (onhYdCd[i] != null)
					model.setOnhYdCd(onhYdCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtLstmCd[i] != null)
					model.setAgmtLstmCd(agmtLstmCd[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (chssMvmtDestYdCd[i] != null)
					model.setChssMvmtDestYdCd(chssMvmtDestYdCd[i]);
				if (chssRgstPrdCd[i] != null)
					model.setChssRgstPrdCd(chssRgstPrdCd[i]);
				if (crntLocCd[i] != null)
					model.setCrntLocCd(crntLocCd[i]);
				if (onhDt[i] != null)
					model.setOnhDt(onhDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (chssRgstExpDt[i] != null)
					model.setChssRgstExpDt(chssRgstExpDt[i]);
				if (onhOfcCd[i] != null)
					model.setOnhOfcCd(onhOfcCd[i]);
				if (eqLotNo[i] != null)
					model.setEqLotNo(eqLotNo[i]);
				if (mgstFuelCapa[i] != null)
					model.setMgstFuelCapa(mgstFuelCapa[i]);
				if (mgstVltgCapa[i] != null)
					model.setMgstVltgCapa(mgstVltgCapa[i]);
				if (crntYdCd[i] != null)
					model.setCrntYdCd(crntYdCd[i]);
				if (actOnhDt[i] != null)
					model.setActOnhDt(actOnhDt[i]);
				if (chssTmlUseFlg[i] != null)
					model.setChssTmlUseFlg(chssTmlUseFlg[i]);
				if (mftDt[i] != null)
					model.setMftDt(mftDt[i]);
				if (mgstWarrEndDt[i] != null)
					model.setMgstWarrEndDt(mgstWarrEndDt[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (chssOwnrCoCd[i] != null)
					model.setChssOwnrCoCd(chssOwnrCoCd[i]);
				if (chssRgstYr[i] != null)
					model.setChssRgstYr(chssRgstYr[i]);
				if (chssTareWgt[i] != null)
					model.setChssTareWgt(chssTareWgt[i]);
				if (faIfErrMsg[i] != null)
					model.setFaIfErrMsg(faIfErrMsg[i]);
				if (chssGateIoFlg[i] != null)
					model.setChssGateIoFlg(chssGateIoFlg[i]);
				if (mgstRunHrsUpdDt[i] != null)
					model.setMgstRunHrsUpdDt(mgstRunHrsUpdDt[i]);
				if (dmgFlg[i] != null)
					model.setDmgFlg(dmgFlg[i]);
				if (faIfDt[i] != null)
					model.setFaIfDt(faIfDt[i]);
				if (mgstRunHrs[i] != null)
					model.setMgstRunHrs(mgstRunHrs[i]);
				if (chssTitNo[i] != null)
					model.setChssTitNo(chssTitNo[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (ifSeq[i] != null)
					model.setIfSeq(ifSeq[i]);
				if (chssRgstSteCd[i] != null)
					model.setChssRgstSteCd(chssRgstSteCd[i]);
				if (chssRgstUpdOfcCd[i] != null)
					model.setChssRgstUpdOfcCd(chssRgstUpdOfcCd[i]);
				if (faIfTpCd[i] != null)
					model.setFaIfTpCd(faIfTpCd[i]);
				if (chssAlsNo[i] != null)
					model.setChssAlsNo(chssAlsNo[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (ifTtlRowKnt[i] != null)
					model.setIfTtlRowKnt(ifTtlRowKnt[i]);
				if (chssRgstCntCd[i] != null)
					model.setChssRgstCntCd(chssRgstCntCd[i]);
				if (chssRgstLicNo[i] != null)
					model.setChssRgstLicNo(chssRgstLicNo[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (chssRgstUpdDt[i] != null)
					model.setChssRgstUpdDt(chssRgstUpdDt[i]);
				if (retAproNo[i] != null)
					model.setRetAproNo(retAproNo[i]);
				if (atchMgstNo[i] != null)
					model.setAtchMgstNo(atchMgstNo[i]);
				if (aciacDivCd[i] != null)
					model.setAciacDivCd(aciacDivCd[i]);
				if (faIfStsCd[i] != null)
					model.setFaIfStsCd(faIfStsCd[i]);
				if (chssRgstUpdId[i] != null)
					model.setChssRgstUpdId(chssRgstUpdId[i]);
				if (eqSpecNo[i] != null)
					model.setEqSpecNo(eqSpecNo[i]);
				if (mgstMchnSerNo[i] != null)
					model.setMgstMchnSerNo(mgstMchnSerNo[i]);
				if (eaiIfNo[i] != null)
					model.setEaiIfNo(eaiIfNo[i]);
				if (lstUseCoCd[i] != null)
					model.setLstUseCoCd(lstUseCoCd[i]);
				if (chssMvmtDt[i] != null)
					model.setChssMvmtDt(chssMvmtDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (faEqNo[i] != null)
					model.setFaEqNo(faEqNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssVehIdNo[i] != null)
					model.setChssVehIdNo(chssVehIdNo[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmEquipmentVOs();
	}

	public CgmEquipmentVO[] getCgmEquipmentVOs(){
		CgmEquipmentVO[] vos = (CgmEquipmentVO[])models.toArray(new CgmEquipmentVO[models.size()]);
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.dispFlg = this.dispFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMvmtStsCd = this.chssMvmtStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhYdCd = this.onhYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtLstmCd = this.agmtLstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMvmtDestYdCd = this.chssMvmtDestYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstPrdCd = this.chssRgstPrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntLocCd = this.crntLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhDt = this.onhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstExpDt = this.chssRgstExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhOfcCd = this.onhOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqLotNo = this.eqLotNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstFuelCapa = this.mgstFuelCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstVltgCapa = this.mgstVltgCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntYdCd = this.crntYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actOnhDt = this.actOnhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTmlUseFlg = this.chssTmlUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftDt = this.mftDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstWarrEndDt = this.mgstWarrEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssOwnrCoCd = this.chssOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstYr = this.chssRgstYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTareWgt = this.chssTareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfErrMsg = this.faIfErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssGateIoFlg = this.chssGateIoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstRunHrsUpdDt = this.mgstRunHrsUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmgFlg = this.dmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfDt = this.faIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstRunHrs = this.mgstRunHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTitNo = this.chssTitNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSeq = this.ifSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstSteCd = this.chssRgstSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstUpdOfcCd = this.chssRgstUpdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfTpCd = this.faIfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssAlsNo = this.chssAlsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifTtlRowKnt = this.ifTtlRowKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstCntCd = this.chssRgstCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstLicNo = this.chssRgstLicNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstUpdDt = this.chssRgstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.retAproNo = this.retAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atchMgstNo = this.atchMgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aciacDivCd = this.aciacDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfStsCd = this.faIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssRgstUpdId = this.chssRgstUpdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSpecNo = this.eqSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstMchnSerNo = this.mgstMchnSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfNo = this.eaiIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstUseCoCd = this.lstUseCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMvmtDt = this.chssMvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faEqNo = this.faEqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssVehIdNo = this.chssVehIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
