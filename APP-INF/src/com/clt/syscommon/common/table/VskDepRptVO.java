/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskDepRptVO.java
*@FileTitle : VskDepRptVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.02
*@LastModifier : 정명훈
*@LastVersion : 1.0
* 2009.09.02 정명훈 
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
 * @author 정명훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskDepRptVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskDepRptVO> models = new ArrayList<VskDepRptVO>();
	
	/* Column Info */
	private String seaMnDzlCsmWgt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String aftUnbrthAnkOffDt = null;
	/* Column Info */
	private String crnWrkCmplDt = null;
	/* Column Info */
	private String bfrBrthAnkDrpDt = null;
	/* Column Info */
	private String arrFoilWgt = null;
	/* Column Info */
	private String nxtPortCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String splFoilWgt = null;
	/* Column Info */
	private String portGnrDzlCsmWgt = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String arrFrshWtrWgt = null;
	/* Column Info */
	private String aftUnbrthAnkDrpDt = null;
	/* Column Info */
	private String portMnDzlCsmWgt = null;
	/* Column Info */
	private String seaGnrLowSulpFuelCsmWgt = null;
	/* Column Info */
	private String mnvrOutMlDist = null;
	/* Column Info */
	private String depBlstWgt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String crnWrkCmncDt = null;
	/* Column Info */
	private String seaGnrLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String arrMidDrftHgt = null;
	/* Column Info */
	private String arrFwddrHgt = null;
	/* Column Info */
	private String depFoilWgt = null;
	/* Column Info */
	private String avgRpmPwr = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rmnDist = null;
	/* Column Info */
	private String engMlDist = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String depFwddrHgt = null;
	/* Column Info */
	private String depGmHgt = null;
	/* Column Info */
	private String seaBlrLowSulpFuelCsmWgt = null;
	/* Column Info */
	private String pltLstUnldDt = null;
	/* Column Info */
	private String portBlrFuelCsmWgt = null;
	/* Column Info */
	private String nxtPortEtaDt = null;
	/* Column Info */
	private String actBrthDt = null;
	/* Column Info */
	private String portMnLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String arrLowSulpFoilWgt = null;
	/* Column Info */
	private String depFrshWtrWgt = null;
	/* Column Info */
	private String portBlrLowSulpFuelCsmWgt = null;
	/* Column Info */
	private String bfrBrthAnkOffDt = null;
	/* Column Info */
	private String splLowSulpDoilWgt = null;
	/* Column Info */
	private String actArrDt = null;
	/* Column Info */
	private String rmnAvgSpd = null;
	/* Column Info */
	private String portGnrLowSulpFuelCsmWgt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String arrDoilWgt = null;
	/* Column Info */
	private String portMnLowSulpFuelCsmWgt = null;
	/* Column Info */
	private String arrBlstWgt = null;
	/* Column Info */
	private String depDoilWgt = null;
	/* Column Info */
	private String mnvrInMlDist = null;
	/* Column Info */
	private String seaGnrDzlCsmWgt = null;
	/* Column Info */
	private String seaGnrFuelCsmWgt = null;
	/* Column Info */
	private String splDoilWgt = null;
	/* Column Info */
	private String splFrshWtrWgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String arrLowSulpDoilWgt = null;
	/* Column Info */
	private String ttlSlgWgt = null;
	/* Column Info */
	private String seaMnFuelCsmWgt = null;
	/* Column Info */
	private String splLowSulpFoilWgt = null;
	/* Column Info */
	private String portGnrFuelCsmWgt = null;
	/* Column Info */
	private String arrGmHgt = null;
	/* Column Info */
	private String arrAftdrHgt = null;
	/* Column Info */
	private String seaBlrLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String depLowSulpDoilWgt = null;
	/* Column Info */
	private String depAftdrHgt = null;
	/* Column Info */
	private String seaMnLowSulpFuelCsmWgt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String portMnFuelCsmWgt = null;
	/* Column Info */
	private String seaBlrFuelCsmWgt = null;
	/* Column Info */
	private String actDepDt = null;
	/* Column Info */
	private String seaBlrDzlCsmWgt = null;
	/* Column Info */
	private String portBlrDzlCsmWgt = null;
	/* Column Info */
	private String depMidDrftHgt = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String portGnrLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String seaMnLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String nvgtDist = null;
	/* Column Info */
	private String avgSpd = null;
	/* Column Info */
	private String portBlrLowSulpDzlCsmWgt = null;
	/* Column Info */
	private String depLowSulpFoilWgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskDepRptVO() {}

	public VskDepRptVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String clptIndSeq, String nxtPortCd, String nxtPortEtaDt, String rmnDist, String rmnAvgSpd, String arrFwddrHgt, String arrMidDrftHgt, String arrAftdrHgt, String arrGmHgt, String arrFoilWgt, String arrDoilWgt, String arrFrshWtrWgt, String arrBlstWgt, String arrLowSulpFoilWgt, String arrLowSulpDoilWgt, String depFwddrHgt, String depMidDrftHgt, String depAftdrHgt, String depGmHgt, String depFoilWgt, String depDoilWgt, String depFrshWtrWgt, String depBlstWgt, String depLowSulpFoilWgt, String depLowSulpDoilWgt, String splFoilWgt, String splDoilWgt, String splFrshWtrWgt, String splLowSulpFoilWgt, String splLowSulpDoilWgt, String nvgtDist, String engMlDist, String avgSpd, String avgRpmPwr, String actBrthDt, String crnWrkCmncDt, String crnWrkCmplDt, String actDepDt, String mnvrInMlDist, String mnvrOutMlDist, String bfrBrthAnkDrpDt, String bfrBrthAnkOffDt, String aftUnbrthAnkDrpDt, String aftUnbrthAnkOffDt, String seaMnFuelCsmWgt, String seaGnrFuelCsmWgt, String seaBlrFuelCsmWgt, String seaMnDzlCsmWgt, String seaGnrDzlCsmWgt, String seaBlrDzlCsmWgt, String seaMnLowSulpFuelCsmWgt, String seaGnrLowSulpFuelCsmWgt, String seaBlrLowSulpFuelCsmWgt, String seaMnLowSulpDzlCsmWgt, String seaGnrLowSulpDzlCsmWgt, String seaBlrLowSulpDzlCsmWgt, String portMnFuelCsmWgt, String portGnrFuelCsmWgt, String portBlrFuelCsmWgt, String portMnDzlCsmWgt, String portGnrDzlCsmWgt, String portBlrDzlCsmWgt, String portMnLowSulpFuelCsmWgt, String portGnrLowSulpFuelCsmWgt, String portBlrLowSulpFuelCsmWgt, String portMnLowSulpDzlCsmWgt, String portGnrLowSulpDzlCsmWgt, String portBlrLowSulpDzlCsmWgt, String creUsrId, String creDt, String updUsrId, String updDt, String actArrDt, String pltLstUnldDt, String ttlSlgWgt) {
		this.seaMnDzlCsmWgt = seaMnDzlCsmWgt;
		this.vslCd = vslCd;
		this.aftUnbrthAnkOffDt = aftUnbrthAnkOffDt;
		this.crnWrkCmplDt = crnWrkCmplDt;
		this.bfrBrthAnkDrpDt = bfrBrthAnkDrpDt;
		this.arrFoilWgt = arrFoilWgt;
		this.nxtPortCd = nxtPortCd;
		this.pagerows = pagerows;
		this.splFoilWgt = splFoilWgt;
		this.portGnrDzlCsmWgt = portGnrDzlCsmWgt;
		this.vpsPortCd = vpsPortCd;
		this.arrFrshWtrWgt = arrFrshWtrWgt;
		this.aftUnbrthAnkDrpDt = aftUnbrthAnkDrpDt;
		this.portMnDzlCsmWgt = portMnDzlCsmWgt;
		this.seaGnrLowSulpFuelCsmWgt = seaGnrLowSulpFuelCsmWgt;
		this.mnvrOutMlDist = mnvrOutMlDist;
		this.depBlstWgt = depBlstWgt;
		this.updUsrId = updUsrId;
		this.crnWrkCmncDt = crnWrkCmncDt;
		this.seaGnrLowSulpDzlCsmWgt = seaGnrLowSulpDzlCsmWgt;
		this.arrMidDrftHgt = arrMidDrftHgt;
		this.arrFwddrHgt = arrFwddrHgt;
		this.depFoilWgt = depFoilWgt;
		this.avgRpmPwr = avgRpmPwr;
		this.skdVoyNo = skdVoyNo;
		this.rmnDist = rmnDist;
		this.engMlDist = engMlDist;
		this.creUsrId = creUsrId;
		this.depFwddrHgt = depFwddrHgt;
		this.depGmHgt = depGmHgt;
		this.seaBlrLowSulpFuelCsmWgt = seaBlrLowSulpFuelCsmWgt;
		this.pltLstUnldDt = pltLstUnldDt;
		this.portBlrFuelCsmWgt = portBlrFuelCsmWgt;
		this.nxtPortEtaDt = nxtPortEtaDt;
		this.actBrthDt = actBrthDt;
		this.portMnLowSulpDzlCsmWgt = portMnLowSulpDzlCsmWgt;
		this.creDt = creDt;
		this.arrLowSulpFoilWgt = arrLowSulpFoilWgt;
		this.depFrshWtrWgt = depFrshWtrWgt;
		this.portBlrLowSulpFuelCsmWgt = portBlrLowSulpFuelCsmWgt;
		this.bfrBrthAnkOffDt = bfrBrthAnkOffDt;
		this.splLowSulpDoilWgt = splLowSulpDoilWgt;
		this.actArrDt = actArrDt;
		this.rmnAvgSpd = rmnAvgSpd;
		this.portGnrLowSulpFuelCsmWgt = portGnrLowSulpFuelCsmWgt;
		this.ibflag = ibflag;
		this.arrDoilWgt = arrDoilWgt;
		this.portMnLowSulpFuelCsmWgt = portMnLowSulpFuelCsmWgt;
		this.arrBlstWgt = arrBlstWgt;
		this.depDoilWgt = depDoilWgt;
		this.mnvrInMlDist = mnvrInMlDist;
		this.seaGnrDzlCsmWgt = seaGnrDzlCsmWgt;
		this.seaGnrFuelCsmWgt = seaGnrFuelCsmWgt;
		this.splDoilWgt = splDoilWgt;
		this.splFrshWtrWgt = splFrshWtrWgt;
		this.updDt = updDt;
		this.arrLowSulpDoilWgt = arrLowSulpDoilWgt;
		this.ttlSlgWgt = ttlSlgWgt;
		this.seaMnFuelCsmWgt = seaMnFuelCsmWgt;
		this.splLowSulpFoilWgt = splLowSulpFoilWgt;
		this.portGnrFuelCsmWgt = portGnrFuelCsmWgt;
		this.arrGmHgt = arrGmHgt;
		this.arrAftdrHgt = arrAftdrHgt;
		this.seaBlrLowSulpDzlCsmWgt = seaBlrLowSulpDzlCsmWgt;
		this.depLowSulpDoilWgt = depLowSulpDoilWgt;
		this.depAftdrHgt = depAftdrHgt;
		this.seaMnLowSulpFuelCsmWgt = seaMnLowSulpFuelCsmWgt;
		this.skdDirCd = skdDirCd;
		this.portMnFuelCsmWgt = portMnFuelCsmWgt;
		this.seaBlrFuelCsmWgt = seaBlrFuelCsmWgt;
		this.actDepDt = actDepDt;
		this.seaBlrDzlCsmWgt = seaBlrDzlCsmWgt;
		this.portBlrDzlCsmWgt = portBlrDzlCsmWgt;
		this.depMidDrftHgt = depMidDrftHgt;
		this.clptIndSeq = clptIndSeq;
		this.portGnrLowSulpDzlCsmWgt = portGnrLowSulpDzlCsmWgt;
		this.seaMnLowSulpDzlCsmWgt = seaMnLowSulpDzlCsmWgt;
		this.nvgtDist = nvgtDist;
		this.avgSpd = avgSpd;
		this.portBlrLowSulpDzlCsmWgt = portBlrLowSulpDzlCsmWgt;
		this.depLowSulpFoilWgt = depLowSulpFoilWgt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sea_mn_dzl_csm_wgt", getSeaMnDzlCsmWgt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("aft_unbrth_ank_off_dt", getAftUnbrthAnkOffDt());
		this.hashColumns.put("crn_wrk_cmpl_dt", getCrnWrkCmplDt());
		this.hashColumns.put("bfr_brth_ank_drp_dt", getBfrBrthAnkDrpDt());
		this.hashColumns.put("arr_foil_wgt", getArrFoilWgt());
		this.hashColumns.put("nxt_port_cd", getNxtPortCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("spl_foil_wgt", getSplFoilWgt());
		this.hashColumns.put("port_gnr_dzl_csm_wgt", getPortGnrDzlCsmWgt());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("arr_frsh_wtr_wgt", getArrFrshWtrWgt());
		this.hashColumns.put("aft_unbrth_ank_drp_dt", getAftUnbrthAnkDrpDt());
		this.hashColumns.put("port_mn_dzl_csm_wgt", getPortMnDzlCsmWgt());
		this.hashColumns.put("sea_gnr_low_sulp_fuel_csm_wgt", getSeaGnrLowSulpFuelCsmWgt());
		this.hashColumns.put("mnvr_out_ml_dist", getMnvrOutMlDist());
		this.hashColumns.put("dep_blst_wgt", getDepBlstWgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("crn_wrk_cmnc_dt", getCrnWrkCmncDt());
		this.hashColumns.put("sea_gnr_low_sulp_dzl_csm_wgt", getSeaGnrLowSulpDzlCsmWgt());
		this.hashColumns.put("arr_mid_drft_hgt", getArrMidDrftHgt());
		this.hashColumns.put("arr_fwddr_hgt", getArrFwddrHgt());
		this.hashColumns.put("dep_foil_wgt", getDepFoilWgt());
		this.hashColumns.put("avg_rpm_pwr", getAvgRpmPwr());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rmn_dist", getRmnDist());
		this.hashColumns.put("eng_ml_dist", getEngMlDist());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dep_fwddr_hgt", getDepFwddrHgt());
		this.hashColumns.put("dep_gm_hgt", getDepGmHgt());
		this.hashColumns.put("sea_blr_low_sulp_fuel_csm_wgt", getSeaBlrLowSulpFuelCsmWgt());
		this.hashColumns.put("plt_lst_unld_dt", getPltLstUnldDt());
		this.hashColumns.put("port_blr_fuel_csm_wgt", getPortBlrFuelCsmWgt());
		this.hashColumns.put("nxt_port_eta_dt", getNxtPortEtaDt());
		this.hashColumns.put("act_brth_dt", getActBrthDt());
		this.hashColumns.put("port_mn_low_sulp_dzl_csm_wgt", getPortMnLowSulpDzlCsmWgt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("arr_low_sulp_foil_wgt", getArrLowSulpFoilWgt());
		this.hashColumns.put("dep_frsh_wtr_wgt", getDepFrshWtrWgt());
		this.hashColumns.put("port_blr_low_sulp_fuel_csm_wgt", getPortBlrLowSulpFuelCsmWgt());
		this.hashColumns.put("bfr_brth_ank_off_dt", getBfrBrthAnkOffDt());
		this.hashColumns.put("spl_low_sulp_doil_wgt", getSplLowSulpDoilWgt());
		this.hashColumns.put("act_arr_dt", getActArrDt());
		this.hashColumns.put("rmn_avg_spd", getRmnAvgSpd());
		this.hashColumns.put("port_gnr_low_sulp_fuel_csm_wgt", getPortGnrLowSulpFuelCsmWgt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("arr_doil_wgt", getArrDoilWgt());
		this.hashColumns.put("port_mn_low_sulp_fuel_csm_wgt", getPortMnLowSulpFuelCsmWgt());
		this.hashColumns.put("arr_blst_wgt", getArrBlstWgt());
		this.hashColumns.put("dep_doil_wgt", getDepDoilWgt());
		this.hashColumns.put("mnvr_in_ml_dist", getMnvrInMlDist());
		this.hashColumns.put("sea_gnr_dzl_csm_wgt", getSeaGnrDzlCsmWgt());
		this.hashColumns.put("sea_gnr_fuel_csm_wgt", getSeaGnrFuelCsmWgt());
		this.hashColumns.put("spl_doil_wgt", getSplDoilWgt());
		this.hashColumns.put("spl_frsh_wtr_wgt", getSplFrshWtrWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("arr_low_sulp_doil_wgt", getArrLowSulpDoilWgt());
		this.hashColumns.put("ttl_slg_wgt", getTtlSlgWgt());
		this.hashColumns.put("sea_mn_fuel_csm_wgt", getSeaMnFuelCsmWgt());
		this.hashColumns.put("spl_low_sulp_foil_wgt", getSplLowSulpFoilWgt());
		this.hashColumns.put("port_gnr_fuel_csm_wgt", getPortGnrFuelCsmWgt());
		this.hashColumns.put("arr_gm_hgt", getArrGmHgt());
		this.hashColumns.put("arr_aftdr_hgt", getArrAftdrHgt());
		this.hashColumns.put("sea_blr_low_sulp_dzl_csm_wgt", getSeaBlrLowSulpDzlCsmWgt());
		this.hashColumns.put("dep_low_sulp_doil_wgt", getDepLowSulpDoilWgt());
		this.hashColumns.put("dep_aftdr_hgt", getDepAftdrHgt());
		this.hashColumns.put("sea_mn_low_sulp_fuel_csm_wgt", getSeaMnLowSulpFuelCsmWgt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("port_mn_fuel_csm_wgt", getPortMnFuelCsmWgt());
		this.hashColumns.put("sea_blr_fuel_csm_wgt", getSeaBlrFuelCsmWgt());
		this.hashColumns.put("act_dep_dt", getActDepDt());
		this.hashColumns.put("sea_blr_dzl_csm_wgt", getSeaBlrDzlCsmWgt());
		this.hashColumns.put("port_blr_dzl_csm_wgt", getPortBlrDzlCsmWgt());
		this.hashColumns.put("dep_mid_drft_hgt", getDepMidDrftHgt());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("port_gnr_low_sulp_dzl_csm_wgt", getPortGnrLowSulpDzlCsmWgt());
		this.hashColumns.put("sea_mn_low_sulp_dzl_csm_wgt", getSeaMnLowSulpDzlCsmWgt());
		this.hashColumns.put("nvgt_dist", getNvgtDist());
		this.hashColumns.put("avg_spd", getAvgSpd());
		this.hashColumns.put("port_blr_low_sulp_dzl_csm_wgt", getPortBlrLowSulpDzlCsmWgt());
		this.hashColumns.put("dep_low_sulp_foil_wgt", getDepLowSulpFoilWgt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sea_mn_dzl_csm_wgt", "seaMnDzlCsmWgt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("aft_unbrth_ank_off_dt", "aftUnbrthAnkOffDt");
		this.hashFields.put("crn_wrk_cmpl_dt", "crnWrkCmplDt");
		this.hashFields.put("bfr_brth_ank_drp_dt", "bfrBrthAnkDrpDt");
		this.hashFields.put("arr_foil_wgt", "arrFoilWgt");
		this.hashFields.put("nxt_port_cd", "nxtPortCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("spl_foil_wgt", "splFoilWgt");
		this.hashFields.put("port_gnr_dzl_csm_wgt", "portGnrDzlCsmWgt");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("arr_frsh_wtr_wgt", "arrFrshWtrWgt");
		this.hashFields.put("aft_unbrth_ank_drp_dt", "aftUnbrthAnkDrpDt");
		this.hashFields.put("port_mn_dzl_csm_wgt", "portMnDzlCsmWgt");
		this.hashFields.put("sea_gnr_low_sulp_fuel_csm_wgt", "seaGnrLowSulpFuelCsmWgt");
		this.hashFields.put("mnvr_out_ml_dist", "mnvrOutMlDist");
		this.hashFields.put("dep_blst_wgt", "depBlstWgt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("crn_wrk_cmnc_dt", "crnWrkCmncDt");
		this.hashFields.put("sea_gnr_low_sulp_dzl_csm_wgt", "seaGnrLowSulpDzlCsmWgt");
		this.hashFields.put("arr_mid_drft_hgt", "arrMidDrftHgt");
		this.hashFields.put("arr_fwddr_hgt", "arrFwddrHgt");
		this.hashFields.put("dep_foil_wgt", "depFoilWgt");
		this.hashFields.put("avg_rpm_pwr", "avgRpmPwr");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rmn_dist", "rmnDist");
		this.hashFields.put("eng_ml_dist", "engMlDist");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dep_fwddr_hgt", "depFwddrHgt");
		this.hashFields.put("dep_gm_hgt", "depGmHgt");
		this.hashFields.put("sea_blr_low_sulp_fuel_csm_wgt", "seaBlrLowSulpFuelCsmWgt");
		this.hashFields.put("plt_lst_unld_dt", "pltLstUnldDt");
		this.hashFields.put("port_blr_fuel_csm_wgt", "portBlrFuelCsmWgt");
		this.hashFields.put("nxt_port_eta_dt", "nxtPortEtaDt");
		this.hashFields.put("act_brth_dt", "actBrthDt");
		this.hashFields.put("port_mn_low_sulp_dzl_csm_wgt", "portMnLowSulpDzlCsmWgt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("arr_low_sulp_foil_wgt", "arrLowSulpFoilWgt");
		this.hashFields.put("dep_frsh_wtr_wgt", "depFrshWtrWgt");
		this.hashFields.put("port_blr_low_sulp_fuel_csm_wgt", "portBlrLowSulpFuelCsmWgt");
		this.hashFields.put("bfr_brth_ank_off_dt", "bfrBrthAnkOffDt");
		this.hashFields.put("spl_low_sulp_doil_wgt", "splLowSulpDoilWgt");
		this.hashFields.put("act_arr_dt", "actArrDt");
		this.hashFields.put("rmn_avg_spd", "rmnAvgSpd");
		this.hashFields.put("port_gnr_low_sulp_fuel_csm_wgt", "portGnrLowSulpFuelCsmWgt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("arr_doil_wgt", "arrDoilWgt");
		this.hashFields.put("port_mn_low_sulp_fuel_csm_wgt", "portMnLowSulpFuelCsmWgt");
		this.hashFields.put("arr_blst_wgt", "arrBlstWgt");
		this.hashFields.put("dep_doil_wgt", "depDoilWgt");
		this.hashFields.put("mnvr_in_ml_dist", "mnvrInMlDist");
		this.hashFields.put("sea_gnr_dzl_csm_wgt", "seaGnrDzlCsmWgt");
		this.hashFields.put("sea_gnr_fuel_csm_wgt", "seaGnrFuelCsmWgt");
		this.hashFields.put("spl_doil_wgt", "splDoilWgt");
		this.hashFields.put("spl_frsh_wtr_wgt", "splFrshWtrWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("arr_low_sulp_doil_wgt", "arrLowSulpDoilWgt");
		this.hashFields.put("ttl_slg_wgt", "ttlSlgWgt");
		this.hashFields.put("sea_mn_fuel_csm_wgt", "seaMnFuelCsmWgt");
		this.hashFields.put("spl_low_sulp_foil_wgt", "splLowSulpFoilWgt");
		this.hashFields.put("port_gnr_fuel_csm_wgt", "portGnrFuelCsmWgt");
		this.hashFields.put("arr_gm_hgt", "arrGmHgt");
		this.hashFields.put("arr_aftdr_hgt", "arrAftdrHgt");
		this.hashFields.put("sea_blr_low_sulp_dzl_csm_wgt", "seaBlrLowSulpDzlCsmWgt");
		this.hashFields.put("dep_low_sulp_doil_wgt", "depLowSulpDoilWgt");
		this.hashFields.put("dep_aftdr_hgt", "depAftdrHgt");
		this.hashFields.put("sea_mn_low_sulp_fuel_csm_wgt", "seaMnLowSulpFuelCsmWgt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("port_mn_fuel_csm_wgt", "portMnFuelCsmWgt");
		this.hashFields.put("sea_blr_fuel_csm_wgt", "seaBlrFuelCsmWgt");
		this.hashFields.put("act_dep_dt", "actDepDt");
		this.hashFields.put("sea_blr_dzl_csm_wgt", "seaBlrDzlCsmWgt");
		this.hashFields.put("port_blr_dzl_csm_wgt", "portBlrDzlCsmWgt");
		this.hashFields.put("dep_mid_drft_hgt", "depMidDrftHgt");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("port_gnr_low_sulp_dzl_csm_wgt", "portGnrLowSulpDzlCsmWgt");
		this.hashFields.put("sea_mn_low_sulp_dzl_csm_wgt", "seaMnLowSulpDzlCsmWgt");
		this.hashFields.put("nvgt_dist", "nvgtDist");
		this.hashFields.put("avg_spd", "avgSpd");
		this.hashFields.put("port_blr_low_sulp_dzl_csm_wgt", "portBlrLowSulpDzlCsmWgt");
		this.hashFields.put("dep_low_sulp_foil_wgt", "depLowSulpFoilWgt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return seaMnDzlCsmWgt
	 */
	public String getSeaMnDzlCsmWgt() {
		return this.seaMnDzlCsmWgt;
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
	 * @return aftUnbrthAnkOffDt
	 */
	public String getAftUnbrthAnkOffDt() {
		return this.aftUnbrthAnkOffDt;
	}
	
	/**
	 * Column Info
	 * @return crnWrkCmplDt
	 */
	public String getCrnWrkCmplDt() {
		return this.crnWrkCmplDt;
	}
	
	/**
	 * Column Info
	 * @return bfrBrthAnkDrpDt
	 */
	public String getBfrBrthAnkDrpDt() {
		return this.bfrBrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @return arrFoilWgt
	 */
	public String getArrFoilWgt() {
		return this.arrFoilWgt;
	}
	
	/**
	 * Column Info
	 * @return nxtPortCd
	 */
	public String getNxtPortCd() {
		return this.nxtPortCd;
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
	 * @return splFoilWgt
	 */
	public String getSplFoilWgt() {
		return this.splFoilWgt;
	}
	
	/**
	 * Column Info
	 * @return portGnrDzlCsmWgt
	 */
	public String getPortGnrDzlCsmWgt() {
		return this.portGnrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @return arrFrshWtrWgt
	 */
	public String getArrFrshWtrWgt() {
		return this.arrFrshWtrWgt;
	}
	
	/**
	 * Column Info
	 * @return aftUnbrthAnkDrpDt
	 */
	public String getAftUnbrthAnkDrpDt() {
		return this.aftUnbrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @return portMnDzlCsmWgt
	 */
	public String getPortMnDzlCsmWgt() {
		return this.portMnDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return seaGnrLowSulpFuelCsmWgt
	 */
	public String getSeaGnrLowSulpFuelCsmWgt() {
		return this.seaGnrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return mnvrOutMlDist
	 */
	public String getMnvrOutMlDist() {
		return this.mnvrOutMlDist;
	}
	
	/**
	 * Column Info
	 * @return depBlstWgt
	 */
	public String getDepBlstWgt() {
		return this.depBlstWgt;
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
	 * @return crnWrkCmncDt
	 */
	public String getCrnWrkCmncDt() {
		return this.crnWrkCmncDt;
	}
	
	/**
	 * Column Info
	 * @return seaGnrLowSulpDzlCsmWgt
	 */
	public String getSeaGnrLowSulpDzlCsmWgt() {
		return this.seaGnrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return arrMidDrftHgt
	 */
	public String getArrMidDrftHgt() {
		return this.arrMidDrftHgt;
	}
	
	/**
	 * Column Info
	 * @return arrFwddrHgt
	 */
	public String getArrFwddrHgt() {
		return this.arrFwddrHgt;
	}
	
	/**
	 * Column Info
	 * @return depFoilWgt
	 */
	public String getDepFoilWgt() {
		return this.depFoilWgt;
	}
	
	/**
	 * Column Info
	 * @return avgRpmPwr
	 */
	public String getAvgRpmPwr() {
		return this.avgRpmPwr;
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
	 * @return rmnDist
	 */
	public String getRmnDist() {
		return this.rmnDist;
	}
	
	/**
	 * Column Info
	 * @return engMlDist
	 */
	public String getEngMlDist() {
		return this.engMlDist;
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
	 * @return depFwddrHgt
	 */
	public String getDepFwddrHgt() {
		return this.depFwddrHgt;
	}
	
	/**
	 * Column Info
	 * @return depGmHgt
	 */
	public String getDepGmHgt() {
		return this.depGmHgt;
	}
	
	/**
	 * Column Info
	 * @return seaBlrLowSulpFuelCsmWgt
	 */
	public String getSeaBlrLowSulpFuelCsmWgt() {
		return this.seaBlrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return pltLstUnldDt
	 */
	public String getPltLstUnldDt() {
		return this.pltLstUnldDt;
	}
	
	/**
	 * Column Info
	 * @return portBlrFuelCsmWgt
	 */
	public String getPortBlrFuelCsmWgt() {
		return this.portBlrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return nxtPortEtaDt
	 */
	public String getNxtPortEtaDt() {
		return this.nxtPortEtaDt;
	}
	
	/**
	 * Column Info
	 * @return actBrthDt
	 */
	public String getActBrthDt() {
		return this.actBrthDt;
	}
	
	/**
	 * Column Info
	 * @return portMnLowSulpDzlCsmWgt
	 */
	public String getPortMnLowSulpDzlCsmWgt() {
		return this.portMnLowSulpDzlCsmWgt;
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
	 * @return arrLowSulpFoilWgt
	 */
	public String getArrLowSulpFoilWgt() {
		return this.arrLowSulpFoilWgt;
	}
	
	/**
	 * Column Info
	 * @return depFrshWtrWgt
	 */
	public String getDepFrshWtrWgt() {
		return this.depFrshWtrWgt;
	}
	
	/**
	 * Column Info
	 * @return portBlrLowSulpFuelCsmWgt
	 */
	public String getPortBlrLowSulpFuelCsmWgt() {
		return this.portBlrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return bfrBrthAnkOffDt
	 */
	public String getBfrBrthAnkOffDt() {
		return this.bfrBrthAnkOffDt;
	}
	
	/**
	 * Column Info
	 * @return splLowSulpDoilWgt
	 */
	public String getSplLowSulpDoilWgt() {
		return this.splLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return actArrDt
	 */
	public String getActArrDt() {
		return this.actArrDt;
	}
	
	/**
	 * Column Info
	 * @return rmnAvgSpd
	 */
	public String getRmnAvgSpd() {
		return this.rmnAvgSpd;
	}
	
	/**
	 * Column Info
	 * @return portGnrLowSulpFuelCsmWgt
	 */
	public String getPortGnrLowSulpFuelCsmWgt() {
		return this.portGnrLowSulpFuelCsmWgt;
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
	 * @return arrDoilWgt
	 */
	public String getArrDoilWgt() {
		return this.arrDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return portMnLowSulpFuelCsmWgt
	 */
	public String getPortMnLowSulpFuelCsmWgt() {
		return this.portMnLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return arrBlstWgt
	 */
	public String getArrBlstWgt() {
		return this.arrBlstWgt;
	}
	
	/**
	 * Column Info
	 * @return depDoilWgt
	 */
	public String getDepDoilWgt() {
		return this.depDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return mnvrInMlDist
	 */
	public String getMnvrInMlDist() {
		return this.mnvrInMlDist;
	}
	
	/**
	 * Column Info
	 * @return seaGnrDzlCsmWgt
	 */
	public String getSeaGnrDzlCsmWgt() {
		return this.seaGnrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return seaGnrFuelCsmWgt
	 */
	public String getSeaGnrFuelCsmWgt() {
		return this.seaGnrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return splDoilWgt
	 */
	public String getSplDoilWgt() {
		return this.splDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return splFrshWtrWgt
	 */
	public String getSplFrshWtrWgt() {
		return this.splFrshWtrWgt;
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
	 * @return arrLowSulpDoilWgt
	 */
	public String getArrLowSulpDoilWgt() {
		return this.arrLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return ttlSlgWgt
	 */
	public String getTtlSlgWgt() {
		return this.ttlSlgWgt;
	}
	
	/**
	 * Column Info
	 * @return seaMnFuelCsmWgt
	 */
	public String getSeaMnFuelCsmWgt() {
		return this.seaMnFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return splLowSulpFoilWgt
	 */
	public String getSplLowSulpFoilWgt() {
		return this.splLowSulpFoilWgt;
	}
	
	/**
	 * Column Info
	 * @return portGnrFuelCsmWgt
	 */
	public String getPortGnrFuelCsmWgt() {
		return this.portGnrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return arrGmHgt
	 */
	public String getArrGmHgt() {
		return this.arrGmHgt;
	}
	
	/**
	 * Column Info
	 * @return arrAftdrHgt
	 */
	public String getArrAftdrHgt() {
		return this.arrAftdrHgt;
	}
	
	/**
	 * Column Info
	 * @return seaBlrLowSulpDzlCsmWgt
	 */
	public String getSeaBlrLowSulpDzlCsmWgt() {
		return this.seaBlrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return depLowSulpDoilWgt
	 */
	public String getDepLowSulpDoilWgt() {
		return this.depLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @return depAftdrHgt
	 */
	public String getDepAftdrHgt() {
		return this.depAftdrHgt;
	}
	
	/**
	 * Column Info
	 * @return seaMnLowSulpFuelCsmWgt
	 */
	public String getSeaMnLowSulpFuelCsmWgt() {
		return this.seaMnLowSulpFuelCsmWgt;
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
	 * @return portMnFuelCsmWgt
	 */
	public String getPortMnFuelCsmWgt() {
		return this.portMnFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return seaBlrFuelCsmWgt
	 */
	public String getSeaBlrFuelCsmWgt() {
		return this.seaBlrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return actDepDt
	 */
	public String getActDepDt() {
		return this.actDepDt;
	}
	
	/**
	 * Column Info
	 * @return seaBlrDzlCsmWgt
	 */
	public String getSeaBlrDzlCsmWgt() {
		return this.seaBlrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return portBlrDzlCsmWgt
	 */
	public String getPortBlrDzlCsmWgt() {
		return this.portBlrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return depMidDrftHgt
	 */
	public String getDepMidDrftHgt() {
		return this.depMidDrftHgt;
	}
	
	/**
	 * Column Info
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return portGnrLowSulpDzlCsmWgt
	 */
	public String getPortGnrLowSulpDzlCsmWgt() {
		return this.portGnrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return seaMnLowSulpDzlCsmWgt
	 */
	public String getSeaMnLowSulpDzlCsmWgt() {
		return this.seaMnLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return nvgtDist
	 */
	public String getNvgtDist() {
		return this.nvgtDist;
	}
	
	/**
	 * Column Info
	 * @return avgSpd
	 */
	public String getAvgSpd() {
		return this.avgSpd;
	}
	
	/**
	 * Column Info
	 * @return portBlrLowSulpDzlCsmWgt
	 */
	public String getPortBlrLowSulpDzlCsmWgt() {
		return this.portBlrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return depLowSulpFoilWgt
	 */
	public String getDepLowSulpFoilWgt() {
		return this.depLowSulpFoilWgt;
	}
	

	/**
	 * Column Info
	 * @param seaMnDzlCsmWgt
	 */
	public void setSeaMnDzlCsmWgt(String seaMnDzlCsmWgt) {
		this.seaMnDzlCsmWgt = seaMnDzlCsmWgt;
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
	 * @param aftUnbrthAnkOffDt
	 */
	public void setAftUnbrthAnkOffDt(String aftUnbrthAnkOffDt) {
		this.aftUnbrthAnkOffDt = aftUnbrthAnkOffDt;
	}
	
	/**
	 * Column Info
	 * @param crnWrkCmplDt
	 */
	public void setCrnWrkCmplDt(String crnWrkCmplDt) {
		this.crnWrkCmplDt = crnWrkCmplDt;
	}
	
	/**
	 * Column Info
	 * @param bfrBrthAnkDrpDt
	 */
	public void setBfrBrthAnkDrpDt(String bfrBrthAnkDrpDt) {
		this.bfrBrthAnkDrpDt = bfrBrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @param arrFoilWgt
	 */
	public void setArrFoilWgt(String arrFoilWgt) {
		this.arrFoilWgt = arrFoilWgt;
	}
	
	/**
	 * Column Info
	 * @param nxtPortCd
	 */
	public void setNxtPortCd(String nxtPortCd) {
		this.nxtPortCd = nxtPortCd;
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
	 * @param splFoilWgt
	 */
	public void setSplFoilWgt(String splFoilWgt) {
		this.splFoilWgt = splFoilWgt;
	}
	
	/**
	 * Column Info
	 * @param portGnrDzlCsmWgt
	 */
	public void setPortGnrDzlCsmWgt(String portGnrDzlCsmWgt) {
		this.portGnrDzlCsmWgt = portGnrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @param arrFrshWtrWgt
	 */
	public void setArrFrshWtrWgt(String arrFrshWtrWgt) {
		this.arrFrshWtrWgt = arrFrshWtrWgt;
	}
	
	/**
	 * Column Info
	 * @param aftUnbrthAnkDrpDt
	 */
	public void setAftUnbrthAnkDrpDt(String aftUnbrthAnkDrpDt) {
		this.aftUnbrthAnkDrpDt = aftUnbrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @param portMnDzlCsmWgt
	 */
	public void setPortMnDzlCsmWgt(String portMnDzlCsmWgt) {
		this.portMnDzlCsmWgt = portMnDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param seaGnrLowSulpFuelCsmWgt
	 */
	public void setSeaGnrLowSulpFuelCsmWgt(String seaGnrLowSulpFuelCsmWgt) {
		this.seaGnrLowSulpFuelCsmWgt = seaGnrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param mnvrOutMlDist
	 */
	public void setMnvrOutMlDist(String mnvrOutMlDist) {
		this.mnvrOutMlDist = mnvrOutMlDist;
	}
	
	/**
	 * Column Info
	 * @param depBlstWgt
	 */
	public void setDepBlstWgt(String depBlstWgt) {
		this.depBlstWgt = depBlstWgt;
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
	 * @param crnWrkCmncDt
	 */
	public void setCrnWrkCmncDt(String crnWrkCmncDt) {
		this.crnWrkCmncDt = crnWrkCmncDt;
	}
	
	/**
	 * Column Info
	 * @param seaGnrLowSulpDzlCsmWgt
	 */
	public void setSeaGnrLowSulpDzlCsmWgt(String seaGnrLowSulpDzlCsmWgt) {
		this.seaGnrLowSulpDzlCsmWgt = seaGnrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param arrMidDrftHgt
	 */
	public void setArrMidDrftHgt(String arrMidDrftHgt) {
		this.arrMidDrftHgt = arrMidDrftHgt;
	}
	
	/**
	 * Column Info
	 * @param arrFwddrHgt
	 */
	public void setArrFwddrHgt(String arrFwddrHgt) {
		this.arrFwddrHgt = arrFwddrHgt;
	}
	
	/**
	 * Column Info
	 * @param depFoilWgt
	 */
	public void setDepFoilWgt(String depFoilWgt) {
		this.depFoilWgt = depFoilWgt;
	}
	
	/**
	 * Column Info
	 * @param avgRpmPwr
	 */
	public void setAvgRpmPwr(String avgRpmPwr) {
		this.avgRpmPwr = avgRpmPwr;
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
	 * @param rmnDist
	 */
	public void setRmnDist(String rmnDist) {
		this.rmnDist = rmnDist;
	}
	
	/**
	 * Column Info
	 * @param engMlDist
	 */
	public void setEngMlDist(String engMlDist) {
		this.engMlDist = engMlDist;
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
	 * @param depFwddrHgt
	 */
	public void setDepFwddrHgt(String depFwddrHgt) {
		this.depFwddrHgt = depFwddrHgt;
	}
	
	/**
	 * Column Info
	 * @param depGmHgt
	 */
	public void setDepGmHgt(String depGmHgt) {
		this.depGmHgt = depGmHgt;
	}
	
	/**
	 * Column Info
	 * @param seaBlrLowSulpFuelCsmWgt
	 */
	public void setSeaBlrLowSulpFuelCsmWgt(String seaBlrLowSulpFuelCsmWgt) {
		this.seaBlrLowSulpFuelCsmWgt = seaBlrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param pltLstUnldDt
	 */
	public void setPltLstUnldDt(String pltLstUnldDt) {
		this.pltLstUnldDt = pltLstUnldDt;
	}
	
	/**
	 * Column Info
	 * @param portBlrFuelCsmWgt
	 */
	public void setPortBlrFuelCsmWgt(String portBlrFuelCsmWgt) {
		this.portBlrFuelCsmWgt = portBlrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param nxtPortEtaDt
	 */
	public void setNxtPortEtaDt(String nxtPortEtaDt) {
		this.nxtPortEtaDt = nxtPortEtaDt;
	}
	
	/**
	 * Column Info
	 * @param actBrthDt
	 */
	public void setActBrthDt(String actBrthDt) {
		this.actBrthDt = actBrthDt;
	}
	
	/**
	 * Column Info
	 * @param portMnLowSulpDzlCsmWgt
	 */
	public void setPortMnLowSulpDzlCsmWgt(String portMnLowSulpDzlCsmWgt) {
		this.portMnLowSulpDzlCsmWgt = portMnLowSulpDzlCsmWgt;
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
	 * @param arrLowSulpFoilWgt
	 */
	public void setArrLowSulpFoilWgt(String arrLowSulpFoilWgt) {
		this.arrLowSulpFoilWgt = arrLowSulpFoilWgt;
	}
	
	/**
	 * Column Info
	 * @param depFrshWtrWgt
	 */
	public void setDepFrshWtrWgt(String depFrshWtrWgt) {
		this.depFrshWtrWgt = depFrshWtrWgt;
	}
	
	/**
	 * Column Info
	 * @param portBlrLowSulpFuelCsmWgt
	 */
	public void setPortBlrLowSulpFuelCsmWgt(String portBlrLowSulpFuelCsmWgt) {
		this.portBlrLowSulpFuelCsmWgt = portBlrLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param bfrBrthAnkOffDt
	 */
	public void setBfrBrthAnkOffDt(String bfrBrthAnkOffDt) {
		this.bfrBrthAnkOffDt = bfrBrthAnkOffDt;
	}
	
	/**
	 * Column Info
	 * @param splLowSulpDoilWgt
	 */
	public void setSplLowSulpDoilWgt(String splLowSulpDoilWgt) {
		this.splLowSulpDoilWgt = splLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param actArrDt
	 */
	public void setActArrDt(String actArrDt) {
		this.actArrDt = actArrDt;
	}
	
	/**
	 * Column Info
	 * @param rmnAvgSpd
	 */
	public void setRmnAvgSpd(String rmnAvgSpd) {
		this.rmnAvgSpd = rmnAvgSpd;
	}
	
	/**
	 * Column Info
	 * @param portGnrLowSulpFuelCsmWgt
	 */
	public void setPortGnrLowSulpFuelCsmWgt(String portGnrLowSulpFuelCsmWgt) {
		this.portGnrLowSulpFuelCsmWgt = portGnrLowSulpFuelCsmWgt;
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
	 * @param arrDoilWgt
	 */
	public void setArrDoilWgt(String arrDoilWgt) {
		this.arrDoilWgt = arrDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param portMnLowSulpFuelCsmWgt
	 */
	public void setPortMnLowSulpFuelCsmWgt(String portMnLowSulpFuelCsmWgt) {
		this.portMnLowSulpFuelCsmWgt = portMnLowSulpFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param arrBlstWgt
	 */
	public void setArrBlstWgt(String arrBlstWgt) {
		this.arrBlstWgt = arrBlstWgt;
	}
	
	/**
	 * Column Info
	 * @param depDoilWgt
	 */
	public void setDepDoilWgt(String depDoilWgt) {
		this.depDoilWgt = depDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param mnvrInMlDist
	 */
	public void setMnvrInMlDist(String mnvrInMlDist) {
		this.mnvrInMlDist = mnvrInMlDist;
	}
	
	/**
	 * Column Info
	 * @param seaGnrDzlCsmWgt
	 */
	public void setSeaGnrDzlCsmWgt(String seaGnrDzlCsmWgt) {
		this.seaGnrDzlCsmWgt = seaGnrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param seaGnrFuelCsmWgt
	 */
	public void setSeaGnrFuelCsmWgt(String seaGnrFuelCsmWgt) {
		this.seaGnrFuelCsmWgt = seaGnrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param splDoilWgt
	 */
	public void setSplDoilWgt(String splDoilWgt) {
		this.splDoilWgt = splDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param splFrshWtrWgt
	 */
	public void setSplFrshWtrWgt(String splFrshWtrWgt) {
		this.splFrshWtrWgt = splFrshWtrWgt;
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
	 * @param arrLowSulpDoilWgt
	 */
	public void setArrLowSulpDoilWgt(String arrLowSulpDoilWgt) {
		this.arrLowSulpDoilWgt = arrLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param ttlSlgWgt
	 */
	public void setTtlSlgWgt(String ttlSlgWgt) {
		this.ttlSlgWgt = ttlSlgWgt;
	}
	
	/**
	 * Column Info
	 * @param seaMnFuelCsmWgt
	 */
	public void setSeaMnFuelCsmWgt(String seaMnFuelCsmWgt) {
		this.seaMnFuelCsmWgt = seaMnFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param splLowSulpFoilWgt
	 */
	public void setSplLowSulpFoilWgt(String splLowSulpFoilWgt) {
		this.splLowSulpFoilWgt = splLowSulpFoilWgt;
	}
	
	/**
	 * Column Info
	 * @param portGnrFuelCsmWgt
	 */
	public void setPortGnrFuelCsmWgt(String portGnrFuelCsmWgt) {
		this.portGnrFuelCsmWgt = portGnrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param arrGmHgt
	 */
	public void setArrGmHgt(String arrGmHgt) {
		this.arrGmHgt = arrGmHgt;
	}
	
	/**
	 * Column Info
	 * @param arrAftdrHgt
	 */
	public void setArrAftdrHgt(String arrAftdrHgt) {
		this.arrAftdrHgt = arrAftdrHgt;
	}
	
	/**
	 * Column Info
	 * @param seaBlrLowSulpDzlCsmWgt
	 */
	public void setSeaBlrLowSulpDzlCsmWgt(String seaBlrLowSulpDzlCsmWgt) {
		this.seaBlrLowSulpDzlCsmWgt = seaBlrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param depLowSulpDoilWgt
	 */
	public void setDepLowSulpDoilWgt(String depLowSulpDoilWgt) {
		this.depLowSulpDoilWgt = depLowSulpDoilWgt;
	}
	
	/**
	 * Column Info
	 * @param depAftdrHgt
	 */
	public void setDepAftdrHgt(String depAftdrHgt) {
		this.depAftdrHgt = depAftdrHgt;
	}
	
	/**
	 * Column Info
	 * @param seaMnLowSulpFuelCsmWgt
	 */
	public void setSeaMnLowSulpFuelCsmWgt(String seaMnLowSulpFuelCsmWgt) {
		this.seaMnLowSulpFuelCsmWgt = seaMnLowSulpFuelCsmWgt;
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
	 * @param portMnFuelCsmWgt
	 */
	public void setPortMnFuelCsmWgt(String portMnFuelCsmWgt) {
		this.portMnFuelCsmWgt = portMnFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param seaBlrFuelCsmWgt
	 */
	public void setSeaBlrFuelCsmWgt(String seaBlrFuelCsmWgt) {
		this.seaBlrFuelCsmWgt = seaBlrFuelCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param actDepDt
	 */
	public void setActDepDt(String actDepDt) {
		this.actDepDt = actDepDt;
	}
	
	/**
	 * Column Info
	 * @param seaBlrDzlCsmWgt
	 */
	public void setSeaBlrDzlCsmWgt(String seaBlrDzlCsmWgt) {
		this.seaBlrDzlCsmWgt = seaBlrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param portBlrDzlCsmWgt
	 */
	public void setPortBlrDzlCsmWgt(String portBlrDzlCsmWgt) {
		this.portBlrDzlCsmWgt = portBlrDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param depMidDrftHgt
	 */
	public void setDepMidDrftHgt(String depMidDrftHgt) {
		this.depMidDrftHgt = depMidDrftHgt;
	}
	
	/**
	 * Column Info
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param portGnrLowSulpDzlCsmWgt
	 */
	public void setPortGnrLowSulpDzlCsmWgt(String portGnrLowSulpDzlCsmWgt) {
		this.portGnrLowSulpDzlCsmWgt = portGnrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param seaMnLowSulpDzlCsmWgt
	 */
	public void setSeaMnLowSulpDzlCsmWgt(String seaMnLowSulpDzlCsmWgt) {
		this.seaMnLowSulpDzlCsmWgt = seaMnLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param nvgtDist
	 */
	public void setNvgtDist(String nvgtDist) {
		this.nvgtDist = nvgtDist;
	}
	
	/**
	 * Column Info
	 * @param avgSpd
	 */
	public void setAvgSpd(String avgSpd) {
		this.avgSpd = avgSpd;
	}
	
	/**
	 * Column Info
	 * @param portBlrLowSulpDzlCsmWgt
	 */
	public void setPortBlrLowSulpDzlCsmWgt(String portBlrLowSulpDzlCsmWgt) {
		this.portBlrLowSulpDzlCsmWgt = portBlrLowSulpDzlCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param depLowSulpFoilWgt
	 */
	public void setDepLowSulpFoilWgt(String depLowSulpFoilWgt) {
		this.depLowSulpFoilWgt = depLowSulpFoilWgt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setSeaMnDzlCsmWgt(JSPUtil.getParameter(request, "sea_mn_dzl_csm_wgt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAftUnbrthAnkOffDt(JSPUtil.getParameter(request, "aft_unbrth_ank_off_dt", ""));
		setCrnWrkCmplDt(JSPUtil.getParameter(request, "crn_wrk_cmpl_dt", ""));
		setBfrBrthAnkDrpDt(JSPUtil.getParameter(request, "bfr_brth_ank_drp_dt", ""));
		setArrFoilWgt(JSPUtil.getParameter(request, "arr_foil_wgt", ""));
		setNxtPortCd(JSPUtil.getParameter(request, "nxt_port_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSplFoilWgt(JSPUtil.getParameter(request, "spl_foil_wgt", ""));
		setPortGnrDzlCsmWgt(JSPUtil.getParameter(request, "port_gnr_dzl_csm_wgt", ""));
		setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
		setArrFrshWtrWgt(JSPUtil.getParameter(request, "arr_frsh_wtr_wgt", ""));
		setAftUnbrthAnkDrpDt(JSPUtil.getParameter(request, "aft_unbrth_ank_drp_dt", ""));
		setPortMnDzlCsmWgt(JSPUtil.getParameter(request, "port_mn_dzl_csm_wgt", ""));
		setSeaGnrLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "sea_gnr_low_sulp_fuel_csm_wgt", ""));
		setMnvrOutMlDist(JSPUtil.getParameter(request, "mnvr_out_ml_dist", ""));
		setDepBlstWgt(JSPUtil.getParameter(request, "dep_blst_wgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCrnWrkCmncDt(JSPUtil.getParameter(request, "crn_wrk_cmnc_dt", ""));
		setSeaGnrLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "sea_gnr_low_sulp_dzl_csm_wgt", ""));
		setArrMidDrftHgt(JSPUtil.getParameter(request, "arr_mid_drft_hgt", ""));
		setArrFwddrHgt(JSPUtil.getParameter(request, "arr_fwddr_hgt", ""));
		setDepFoilWgt(JSPUtil.getParameter(request, "dep_foil_wgt", ""));
		setAvgRpmPwr(JSPUtil.getParameter(request, "avg_rpm_pwr", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRmnDist(JSPUtil.getParameter(request, "rmn_dist", ""));
		setEngMlDist(JSPUtil.getParameter(request, "eng_ml_dist", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDepFwddrHgt(JSPUtil.getParameter(request, "dep_fwddr_hgt", ""));
		setDepGmHgt(JSPUtil.getParameter(request, "dep_gm_hgt", ""));
		setSeaBlrLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "sea_blr_low_sulp_fuel_csm_wgt", ""));
		setPltLstUnldDt(JSPUtil.getParameter(request, "plt_lst_unld_dt", ""));
		setPortBlrFuelCsmWgt(JSPUtil.getParameter(request, "port_blr_fuel_csm_wgt", ""));
		setNxtPortEtaDt(JSPUtil.getParameter(request, "nxt_port_eta_dt", ""));
		setActBrthDt(JSPUtil.getParameter(request, "act_brth_dt", ""));
		setPortMnLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "port_mn_low_sulp_dzl_csm_wgt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setArrLowSulpFoilWgt(JSPUtil.getParameter(request, "arr_low_sulp_foil_wgt", ""));
		setDepFrshWtrWgt(JSPUtil.getParameter(request, "dep_frsh_wtr_wgt", ""));
		setPortBlrLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "port_blr_low_sulp_fuel_csm_wgt", ""));
		setBfrBrthAnkOffDt(JSPUtil.getParameter(request, "bfr_brth_ank_off_dt", ""));
		setSplLowSulpDoilWgt(JSPUtil.getParameter(request, "spl_low_sulp_doil_wgt", ""));
		setActArrDt(JSPUtil.getParameter(request, "act_arr_dt", ""));
		setRmnAvgSpd(JSPUtil.getParameter(request, "rmn_avg_spd", ""));
		setPortGnrLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "port_gnr_low_sulp_fuel_csm_wgt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setArrDoilWgt(JSPUtil.getParameter(request, "arr_doil_wgt", ""));
		setPortMnLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "port_mn_low_sulp_fuel_csm_wgt", ""));
		setArrBlstWgt(JSPUtil.getParameter(request, "arr_blst_wgt", ""));
		setDepDoilWgt(JSPUtil.getParameter(request, "dep_doil_wgt", ""));
		setMnvrInMlDist(JSPUtil.getParameter(request, "mnvr_in_ml_dist", ""));
		setSeaGnrDzlCsmWgt(JSPUtil.getParameter(request, "sea_gnr_dzl_csm_wgt", ""));
		setSeaGnrFuelCsmWgt(JSPUtil.getParameter(request, "sea_gnr_fuel_csm_wgt", ""));
		setSplDoilWgt(JSPUtil.getParameter(request, "spl_doil_wgt", ""));
		setSplFrshWtrWgt(JSPUtil.getParameter(request, "spl_frsh_wtr_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setArrLowSulpDoilWgt(JSPUtil.getParameter(request, "arr_low_sulp_doil_wgt", ""));
		setTtlSlgWgt(JSPUtil.getParameter(request, "ttl_slg_wgt", ""));
		setSeaMnFuelCsmWgt(JSPUtil.getParameter(request, "sea_mn_fuel_csm_wgt", ""));
		setSplLowSulpFoilWgt(JSPUtil.getParameter(request, "spl_low_sulp_foil_wgt", ""));
		setPortGnrFuelCsmWgt(JSPUtil.getParameter(request, "port_gnr_fuel_csm_wgt", ""));
		setArrGmHgt(JSPUtil.getParameter(request, "arr_gm_hgt", ""));
		setArrAftdrHgt(JSPUtil.getParameter(request, "arr_aftdr_hgt", ""));
		setSeaBlrLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "sea_blr_low_sulp_dzl_csm_wgt", ""));
		setDepLowSulpDoilWgt(JSPUtil.getParameter(request, "dep_low_sulp_doil_wgt", ""));
		setDepAftdrHgt(JSPUtil.getParameter(request, "dep_aftdr_hgt", ""));
		setSeaMnLowSulpFuelCsmWgt(JSPUtil.getParameter(request, "sea_mn_low_sulp_fuel_csm_wgt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPortMnFuelCsmWgt(JSPUtil.getParameter(request, "port_mn_fuel_csm_wgt", ""));
		setSeaBlrFuelCsmWgt(JSPUtil.getParameter(request, "sea_blr_fuel_csm_wgt", ""));
		setActDepDt(JSPUtil.getParameter(request, "act_dep_dt", ""));
		setSeaBlrDzlCsmWgt(JSPUtil.getParameter(request, "sea_blr_dzl_csm_wgt", ""));
		setPortBlrDzlCsmWgt(JSPUtil.getParameter(request, "port_blr_dzl_csm_wgt", ""));
		setDepMidDrftHgt(JSPUtil.getParameter(request, "dep_mid_drft_hgt", ""));
		setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
		setPortGnrLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "port_gnr_low_sulp_dzl_csm_wgt", ""));
		setSeaMnLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "sea_mn_low_sulp_dzl_csm_wgt", ""));
		setNvgtDist(JSPUtil.getParameter(request, "nvgt_dist", ""));
		setAvgSpd(JSPUtil.getParameter(request, "avg_spd", ""));
		setPortBlrLowSulpDzlCsmWgt(JSPUtil.getParameter(request, "port_blr_low_sulp_dzl_csm_wgt", ""));
		setDepLowSulpFoilWgt(JSPUtil.getParameter(request, "dep_low_sulp_foil_wgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskDepRptVO[]
	 */
	public VskDepRptVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskDepRptVO[]
	 */
	public VskDepRptVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskDepRptVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] seaMnDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_mn_dzl_csm_wgt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] aftUnbrthAnkOffDt = (JSPUtil.getParameter(request, prefix	+ "aft_unbrth_ank_off_dt", length));
			String[] crnWrkCmplDt = (JSPUtil.getParameter(request, prefix	+ "crn_wrk_cmpl_dt", length));
			String[] bfrBrthAnkDrpDt = (JSPUtil.getParameter(request, prefix	+ "bfr_brth_ank_drp_dt", length));
			String[] arrFoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_foil_wgt", length));
			String[] nxtPortCd = (JSPUtil.getParameter(request, prefix	+ "nxt_port_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] splFoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_foil_wgt", length));
			String[] portGnrDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_gnr_dzl_csm_wgt", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] arrFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "arr_frsh_wtr_wgt", length));
			String[] aftUnbrthAnkDrpDt = (JSPUtil.getParameter(request, prefix	+ "aft_unbrth_ank_drp_dt", length));
			String[] portMnDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_mn_dzl_csm_wgt", length));
			String[] seaGnrLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_gnr_low_sulp_fuel_csm_wgt", length));
			String[] mnvrOutMlDist = (JSPUtil.getParameter(request, prefix	+ "mnvr_out_ml_dist", length));
			String[] depBlstWgt = (JSPUtil.getParameter(request, prefix	+ "dep_blst_wgt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] crnWrkCmncDt = (JSPUtil.getParameter(request, prefix	+ "crn_wrk_cmnc_dt", length));
			String[] seaGnrLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_gnr_low_sulp_dzl_csm_wgt", length));
			String[] arrMidDrftHgt = (JSPUtil.getParameter(request, prefix	+ "arr_mid_drft_hgt", length));
			String[] arrFwddrHgt = (JSPUtil.getParameter(request, prefix	+ "arr_fwddr_hgt", length));
			String[] depFoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_foil_wgt", length));
			String[] avgRpmPwr = (JSPUtil.getParameter(request, prefix	+ "avg_rpm_pwr", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rmnDist = (JSPUtil.getParameter(request, prefix	+ "rmn_dist", length));
			String[] engMlDist = (JSPUtil.getParameter(request, prefix	+ "eng_ml_dist", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] depFwddrHgt = (JSPUtil.getParameter(request, prefix	+ "dep_fwddr_hgt", length));
			String[] depGmHgt = (JSPUtil.getParameter(request, prefix	+ "dep_gm_hgt", length));
			String[] seaBlrLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_blr_low_sulp_fuel_csm_wgt", length));
			String[] pltLstUnldDt = (JSPUtil.getParameter(request, prefix	+ "plt_lst_unld_dt", length));
			String[] portBlrFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_blr_fuel_csm_wgt", length));
			String[] nxtPortEtaDt = (JSPUtil.getParameter(request, prefix	+ "nxt_port_eta_dt", length));
			String[] actBrthDt = (JSPUtil.getParameter(request, prefix	+ "act_brth_dt", length));
			String[] portMnLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_mn_low_sulp_dzl_csm_wgt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] arrLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_low_sulp_foil_wgt", length));
			String[] depFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "dep_frsh_wtr_wgt", length));
			String[] portBlrLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_blr_low_sulp_fuel_csm_wgt", length));
			String[] bfrBrthAnkOffDt = (JSPUtil.getParameter(request, prefix	+ "bfr_brth_ank_off_dt", length));
			String[] splLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_low_sulp_doil_wgt", length));
			String[] actArrDt = (JSPUtil.getParameter(request, prefix	+ "act_arr_dt", length));
			String[] rmnAvgSpd = (JSPUtil.getParameter(request, prefix	+ "rmn_avg_spd", length));
			String[] portGnrLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_gnr_low_sulp_fuel_csm_wgt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] arrDoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_doil_wgt", length));
			String[] portMnLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_mn_low_sulp_fuel_csm_wgt", length));
			String[] arrBlstWgt = (JSPUtil.getParameter(request, prefix	+ "arr_blst_wgt", length));
			String[] depDoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_doil_wgt", length));
			String[] mnvrInMlDist = (JSPUtil.getParameter(request, prefix	+ "mnvr_in_ml_dist", length));
			String[] seaGnrDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_gnr_dzl_csm_wgt", length));
			String[] seaGnrFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_gnr_fuel_csm_wgt", length));
			String[] splDoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_doil_wgt", length));
			String[] splFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "spl_frsh_wtr_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] arrLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_low_sulp_doil_wgt", length));
			String[] ttlSlgWgt = (JSPUtil.getParameter(request, prefix	+ "ttl_slg_wgt", length));
			String[] seaMnFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_mn_fuel_csm_wgt", length));
			String[] splLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_low_sulp_foil_wgt", length));
			String[] portGnrFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_gnr_fuel_csm_wgt", length));
			String[] arrGmHgt = (JSPUtil.getParameter(request, prefix	+ "arr_gm_hgt", length));
			String[] arrAftdrHgt = (JSPUtil.getParameter(request, prefix	+ "arr_aftdr_hgt", length));
			String[] seaBlrLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_blr_low_sulp_dzl_csm_wgt", length));
			String[] depLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_low_sulp_doil_wgt", length));
			String[] depAftdrHgt = (JSPUtil.getParameter(request, prefix	+ "dep_aftdr_hgt", length));
			String[] seaMnLowSulpFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_mn_low_sulp_fuel_csm_wgt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] portMnFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_mn_fuel_csm_wgt", length));
			String[] seaBlrFuelCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_blr_fuel_csm_wgt", length));
			String[] actDepDt = (JSPUtil.getParameter(request, prefix	+ "act_dep_dt", length));
			String[] seaBlrDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_blr_dzl_csm_wgt", length));
			String[] portBlrDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_blr_dzl_csm_wgt", length));
			String[] depMidDrftHgt = (JSPUtil.getParameter(request, prefix	+ "dep_mid_drft_hgt", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] portGnrLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_gnr_low_sulp_dzl_csm_wgt", length));
			String[] seaMnLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "sea_mn_low_sulp_dzl_csm_wgt", length));
			String[] nvgtDist = (JSPUtil.getParameter(request, prefix	+ "nvgt_dist", length));
			String[] avgSpd = (JSPUtil.getParameter(request, prefix	+ "avg_spd", length));
			String[] portBlrLowSulpDzlCsmWgt = (JSPUtil.getParameter(request, prefix	+ "port_blr_low_sulp_dzl_csm_wgt", length));
			String[] depLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_low_sulp_foil_wgt", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskDepRptVO();
				if (seaMnDzlCsmWgt[i] != null)
					model.setSeaMnDzlCsmWgt(seaMnDzlCsmWgt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (aftUnbrthAnkOffDt[i] != null)
					model.setAftUnbrthAnkOffDt(aftUnbrthAnkOffDt[i]);
				if (crnWrkCmplDt[i] != null)
					model.setCrnWrkCmplDt(crnWrkCmplDt[i]);
				if (bfrBrthAnkDrpDt[i] != null)
					model.setBfrBrthAnkDrpDt(bfrBrthAnkDrpDt[i]);
				if (arrFoilWgt[i] != null)
					model.setArrFoilWgt(arrFoilWgt[i]);
				if (nxtPortCd[i] != null)
					model.setNxtPortCd(nxtPortCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (splFoilWgt[i] != null)
					model.setSplFoilWgt(splFoilWgt[i]);
				if (portGnrDzlCsmWgt[i] != null)
					model.setPortGnrDzlCsmWgt(portGnrDzlCsmWgt[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (arrFrshWtrWgt[i] != null)
					model.setArrFrshWtrWgt(arrFrshWtrWgt[i]);
				if (aftUnbrthAnkDrpDt[i] != null)
					model.setAftUnbrthAnkDrpDt(aftUnbrthAnkDrpDt[i]);
				if (portMnDzlCsmWgt[i] != null)
					model.setPortMnDzlCsmWgt(portMnDzlCsmWgt[i]);
				if (seaGnrLowSulpFuelCsmWgt[i] != null)
					model.setSeaGnrLowSulpFuelCsmWgt(seaGnrLowSulpFuelCsmWgt[i]);
				if (mnvrOutMlDist[i] != null)
					model.setMnvrOutMlDist(mnvrOutMlDist[i]);
				if (depBlstWgt[i] != null)
					model.setDepBlstWgt(depBlstWgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (crnWrkCmncDt[i] != null)
					model.setCrnWrkCmncDt(crnWrkCmncDt[i]);
				if (seaGnrLowSulpDzlCsmWgt[i] != null)
					model.setSeaGnrLowSulpDzlCsmWgt(seaGnrLowSulpDzlCsmWgt[i]);
				if (arrMidDrftHgt[i] != null)
					model.setArrMidDrftHgt(arrMidDrftHgt[i]);
				if (arrFwddrHgt[i] != null)
					model.setArrFwddrHgt(arrFwddrHgt[i]);
				if (depFoilWgt[i] != null)
					model.setDepFoilWgt(depFoilWgt[i]);
				if (avgRpmPwr[i] != null)
					model.setAvgRpmPwr(avgRpmPwr[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rmnDist[i] != null)
					model.setRmnDist(rmnDist[i]);
				if (engMlDist[i] != null)
					model.setEngMlDist(engMlDist[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (depFwddrHgt[i] != null)
					model.setDepFwddrHgt(depFwddrHgt[i]);
				if (depGmHgt[i] != null)
					model.setDepGmHgt(depGmHgt[i]);
				if (seaBlrLowSulpFuelCsmWgt[i] != null)
					model.setSeaBlrLowSulpFuelCsmWgt(seaBlrLowSulpFuelCsmWgt[i]);
				if (pltLstUnldDt[i] != null)
					model.setPltLstUnldDt(pltLstUnldDt[i]);
				if (portBlrFuelCsmWgt[i] != null)
					model.setPortBlrFuelCsmWgt(portBlrFuelCsmWgt[i]);
				if (nxtPortEtaDt[i] != null)
					model.setNxtPortEtaDt(nxtPortEtaDt[i]);
				if (actBrthDt[i] != null)
					model.setActBrthDt(actBrthDt[i]);
				if (portMnLowSulpDzlCsmWgt[i] != null)
					model.setPortMnLowSulpDzlCsmWgt(portMnLowSulpDzlCsmWgt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (arrLowSulpFoilWgt[i] != null)
					model.setArrLowSulpFoilWgt(arrLowSulpFoilWgt[i]);
				if (depFrshWtrWgt[i] != null)
					model.setDepFrshWtrWgt(depFrshWtrWgt[i]);
				if (portBlrLowSulpFuelCsmWgt[i] != null)
					model.setPortBlrLowSulpFuelCsmWgt(portBlrLowSulpFuelCsmWgt[i]);
				if (bfrBrthAnkOffDt[i] != null)
					model.setBfrBrthAnkOffDt(bfrBrthAnkOffDt[i]);
				if (splLowSulpDoilWgt[i] != null)
					model.setSplLowSulpDoilWgt(splLowSulpDoilWgt[i]);
				if (actArrDt[i] != null)
					model.setActArrDt(actArrDt[i]);
				if (rmnAvgSpd[i] != null)
					model.setRmnAvgSpd(rmnAvgSpd[i]);
				if (portGnrLowSulpFuelCsmWgt[i] != null)
					model.setPortGnrLowSulpFuelCsmWgt(portGnrLowSulpFuelCsmWgt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (arrDoilWgt[i] != null)
					model.setArrDoilWgt(arrDoilWgt[i]);
				if (portMnLowSulpFuelCsmWgt[i] != null)
					model.setPortMnLowSulpFuelCsmWgt(portMnLowSulpFuelCsmWgt[i]);
				if (arrBlstWgt[i] != null)
					model.setArrBlstWgt(arrBlstWgt[i]);
				if (depDoilWgt[i] != null)
					model.setDepDoilWgt(depDoilWgt[i]);
				if (mnvrInMlDist[i] != null)
					model.setMnvrInMlDist(mnvrInMlDist[i]);
				if (seaGnrDzlCsmWgt[i] != null)
					model.setSeaGnrDzlCsmWgt(seaGnrDzlCsmWgt[i]);
				if (seaGnrFuelCsmWgt[i] != null)
					model.setSeaGnrFuelCsmWgt(seaGnrFuelCsmWgt[i]);
				if (splDoilWgt[i] != null)
					model.setSplDoilWgt(splDoilWgt[i]);
				if (splFrshWtrWgt[i] != null)
					model.setSplFrshWtrWgt(splFrshWtrWgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (arrLowSulpDoilWgt[i] != null)
					model.setArrLowSulpDoilWgt(arrLowSulpDoilWgt[i]);
				if (ttlSlgWgt[i] != null)
					model.setTtlSlgWgt(ttlSlgWgt[i]);
				if (seaMnFuelCsmWgt[i] != null)
					model.setSeaMnFuelCsmWgt(seaMnFuelCsmWgt[i]);
				if (splLowSulpFoilWgt[i] != null)
					model.setSplLowSulpFoilWgt(splLowSulpFoilWgt[i]);
				if (portGnrFuelCsmWgt[i] != null)
					model.setPortGnrFuelCsmWgt(portGnrFuelCsmWgt[i]);
				if (arrGmHgt[i] != null)
					model.setArrGmHgt(arrGmHgt[i]);
				if (arrAftdrHgt[i] != null)
					model.setArrAftdrHgt(arrAftdrHgt[i]);
				if (seaBlrLowSulpDzlCsmWgt[i] != null)
					model.setSeaBlrLowSulpDzlCsmWgt(seaBlrLowSulpDzlCsmWgt[i]);
				if (depLowSulpDoilWgt[i] != null)
					model.setDepLowSulpDoilWgt(depLowSulpDoilWgt[i]);
				if (depAftdrHgt[i] != null)
					model.setDepAftdrHgt(depAftdrHgt[i]);
				if (seaMnLowSulpFuelCsmWgt[i] != null)
					model.setSeaMnLowSulpFuelCsmWgt(seaMnLowSulpFuelCsmWgt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (portMnFuelCsmWgt[i] != null)
					model.setPortMnFuelCsmWgt(portMnFuelCsmWgt[i]);
				if (seaBlrFuelCsmWgt[i] != null)
					model.setSeaBlrFuelCsmWgt(seaBlrFuelCsmWgt[i]);
				if (actDepDt[i] != null)
					model.setActDepDt(actDepDt[i]);
				if (seaBlrDzlCsmWgt[i] != null)
					model.setSeaBlrDzlCsmWgt(seaBlrDzlCsmWgt[i]);
				if (portBlrDzlCsmWgt[i] != null)
					model.setPortBlrDzlCsmWgt(portBlrDzlCsmWgt[i]);
				if (depMidDrftHgt[i] != null)
					model.setDepMidDrftHgt(depMidDrftHgt[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (portGnrLowSulpDzlCsmWgt[i] != null)
					model.setPortGnrLowSulpDzlCsmWgt(portGnrLowSulpDzlCsmWgt[i]);
				if (seaMnLowSulpDzlCsmWgt[i] != null)
					model.setSeaMnLowSulpDzlCsmWgt(seaMnLowSulpDzlCsmWgt[i]);
				if (nvgtDist[i] != null)
					model.setNvgtDist(nvgtDist[i]);
				if (avgSpd[i] != null)
					model.setAvgSpd(avgSpd[i]);
				if (portBlrLowSulpDzlCsmWgt[i] != null)
					model.setPortBlrLowSulpDzlCsmWgt(portBlrLowSulpDzlCsmWgt[i]);
				if (depLowSulpFoilWgt[i] != null)
					model.setDepLowSulpFoilWgt(depLowSulpFoilWgt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskDepRptVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskDepRptVO[]
	 */
	public VskDepRptVO[] getVskDepRptVOs(){
		VskDepRptVO[] vos = (VskDepRptVO[])models.toArray(new VskDepRptVO[models.size()]);
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
		this.seaMnDzlCsmWgt = this.seaMnDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftUnbrthAnkOffDt = this.aftUnbrthAnkOffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnWrkCmplDt = this.crnWrkCmplDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrBrthAnkDrpDt = this.bfrBrthAnkDrpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFoilWgt = this.arrFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtPortCd = this.nxtPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splFoilWgt = this.splFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portGnrDzlCsmWgt = this.portGnrDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFrshWtrWgt = this.arrFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftUnbrthAnkDrpDt = this.aftUnbrthAnkDrpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portMnDzlCsmWgt = this.portMnDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaGnrLowSulpFuelCsmWgt = this.seaGnrLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnvrOutMlDist = this.mnvrOutMlDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depBlstWgt = this.depBlstWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnWrkCmncDt = this.crnWrkCmncDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaGnrLowSulpDzlCsmWgt = this.seaGnrLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrMidDrftHgt = this.arrMidDrftHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFwddrHgt = this.arrFwddrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFoilWgt = this.depFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avgRpmPwr = this.avgRpmPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnDist = this.rmnDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engMlDist = this.engMlDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFwddrHgt = this.depFwddrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depGmHgt = this.depGmHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaBlrLowSulpFuelCsmWgt = this.seaBlrLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pltLstUnldDt = this.pltLstUnldDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portBlrFuelCsmWgt = this.portBlrFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtPortEtaDt = this.nxtPortEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBrthDt = this.actBrthDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portMnLowSulpDzlCsmWgt = this.portMnLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrLowSulpFoilWgt = this.arrLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFrshWtrWgt = this.depFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portBlrLowSulpFuelCsmWgt = this.portBlrLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrBrthAnkOffDt = this.bfrBrthAnkOffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splLowSulpDoilWgt = this.splLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actArrDt = this.actArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnAvgSpd = this.rmnAvgSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portGnrLowSulpFuelCsmWgt = this.portGnrLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDoilWgt = this.arrDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portMnLowSulpFuelCsmWgt = this.portMnLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrBlstWgt = this.arrBlstWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDoilWgt = this.depDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnvrInMlDist = this.mnvrInMlDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaGnrDzlCsmWgt = this.seaGnrDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaGnrFuelCsmWgt = this.seaGnrFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splDoilWgt = this.splDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splFrshWtrWgt = this.splFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrLowSulpDoilWgt = this.arrLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlSlgWgt = this.ttlSlgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaMnFuelCsmWgt = this.seaMnFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splLowSulpFoilWgt = this.splLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portGnrFuelCsmWgt = this.portGnrFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrGmHgt = this.arrGmHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrAftdrHgt = this.arrAftdrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaBlrLowSulpDzlCsmWgt = this.seaBlrLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depLowSulpDoilWgt = this.depLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depAftdrHgt = this.depAftdrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaMnLowSulpFuelCsmWgt = this.seaMnLowSulpFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portMnFuelCsmWgt = this.portMnFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaBlrFuelCsmWgt = this.seaBlrFuelCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDepDt = this.actDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaBlrDzlCsmWgt = this.seaBlrDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portBlrDzlCsmWgt = this.portBlrDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depMidDrftHgt = this.depMidDrftHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portGnrLowSulpDzlCsmWgt = this.portGnrLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaMnLowSulpDzlCsmWgt = this.seaMnLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nvgtDist = this.nvgtDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avgSpd = this.avgSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portBlrLowSulpDzlCsmWgt = this.portBlrLowSulpDzlCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depLowSulpFoilWgt = this.depLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
