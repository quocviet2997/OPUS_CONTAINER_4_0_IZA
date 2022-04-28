/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskActPortSkdVO.java
*@FileTitle : VskActPortSkdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.28
*@LastModifier : 임창빈
*@LastVersion : 1.0
* 2010.04.28 임창빈
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 임창빈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskActPortSkdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskActPortSkdVO> models = new ArrayList<VskActPortSkdVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vslArrDlayRsnCd = null;
	/* Column Info */
	private String aftUnbrthAnkOffDt = null;
	/* Column Info */
	private String bfrBrthAnkDrpDt = null;
	/* Column Info */
	private String ttlGbgQty = null;
	/* Column Info */
	private String arrFoilWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String splFoilWgt = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String aftUnbrthAnkDrpDt = null;
	/* Column Info */
	private String lstEtbDt = null;
	/* Column Info */
	private String arrFrshWtrWgt = null;
	/* Column Info */
	private String portSkdStsCd = null;
	/* Column Info */
	private String lstEtaDt = null;
	/* Column Info */
	private String depBlstWgt = null;
	/* Column Info */
	private String actAtaInpUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String depTugBotKnt = null;
	/* Column Info */
	private String arrFwddrHgt = null;
	/* Column Info */
	private String depFoilWgt = null;
	/* Column Info */
	private String actAtbInpDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslBrthDlayRsnCd = null;
	/* Column Info */
	private String actAtdInpDt = null;
	/* Column Info */
	private String actAtaInpDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String depFwddrHgt = null;
	/* Column Info */
	private String depGmHgt = null;
	/* Column Info */
	private String vslDepDlayRsnCd = null;
	/* Column Info */
	private String pltLstUnldDt = null;
	/* Column Info */
	private String actAtdInpUsrId = null;
	/* Column Info */
	private String actBrthDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String arrLowSulpFoilWgt = null;
	/* Column Info */
	private String depFrshWtrWgt = null;
	/* Column Info */
	private String bfrBrthAnkOffDt = null;
	/* Column Info */
	private String splLowSulpDoilWgt = null;
	/* Column Info */
	private String actArrDt = null;
	/* Column Info */
	private String actAtbInpUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String arrDoilWgt = null;
	/* Column Info */
	private String arrBlstWgt = null;
	/* Column Info */
	private String depDoilWgt = null;
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
	private String lstEtdDt = null;
	/* Column Info */
	private String splLowSulpFoilWgt = null;
	/* Column Info */
	private String arrAftdrHgt = null;
	/* Column Info */
	private String arrGmHgt = null;
	/* Column Info */
	private String depLowSulpDoilWgt = null;
	/* Column Info */
	private String depAftdrHgt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String arrTugBotKnt = null;
	/* Column Info */
	private String actDepDt = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String depLowSulpFoilWgt = null;

	/* Column Info 2014.11.17 KJH */
	private String dchgCmplDt = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskActPortSkdVO() {}

	public VskActPortSkdVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String clptIndSeq, String portSkdStsCd, String lstEtaDt, String actArrDt, String vslArrDlayRsnCd, String actAtaInpDt, String actAtaInpUsrId, String lstEtbDt, String actBrthDt, String vslBrthDlayRsnCd, String actAtbInpDt, String actAtbInpUsrId, String lstEtdDt, String actDepDt, String vslDepDlayRsnCd, String actAtdInpDt, String actAtdInpUsrId, String arrFoilWgt, String arrLowSulpFoilWgt, String arrDoilWgt, String arrLowSulpDoilWgt, String arrFrshWtrWgt, String arrBlstWgt, String arrFwddrHgt, String arrAftdrHgt, String arrGmHgt, String arrTugBotKnt, String splFoilWgt, String splLowSulpFoilWgt, String splDoilWgt, String splLowSulpDoilWgt, String splFrshWtrWgt, String depLowSulpFoilWgt, String depFoilWgt, String depLowSulpDoilWgt, String depDoilWgt, String depFrshWtrWgt, String depBlstWgt, String depFwddrHgt, String depAftdrHgt, String depGmHgt, String depTugBotKnt, String diffRmk, String pltLstUnldDt, String bfrBrthAnkDrpDt, String bfrBrthAnkOffDt, String aftUnbrthAnkDrpDt, String aftUnbrthAnkOffDt, String ttlSlgWgt, String ttlGbgQty, String creUsrId, String creDt, String updUsrId, String updDt, String dchgCmplDt) {
		this.vslCd = vslCd;
		this.vslArrDlayRsnCd = vslArrDlayRsnCd;
		this.aftUnbrthAnkOffDt = aftUnbrthAnkOffDt;
		this.bfrBrthAnkDrpDt = bfrBrthAnkDrpDt;
		this.ttlGbgQty = ttlGbgQty;
		this.arrFoilWgt = arrFoilWgt;
		this.pagerows = pagerows;
		this.splFoilWgt = splFoilWgt;
		this.vpsPortCd = vpsPortCd;
		this.aftUnbrthAnkDrpDt = aftUnbrthAnkDrpDt;
		this.lstEtbDt = lstEtbDt;
		this.arrFrshWtrWgt = arrFrshWtrWgt;
		this.portSkdStsCd = portSkdStsCd;
		this.lstEtaDt = lstEtaDt;
		this.depBlstWgt = depBlstWgt;
		this.actAtaInpUsrId = actAtaInpUsrId;
		this.updUsrId = updUsrId;
		this.depTugBotKnt = depTugBotKnt;
		this.arrFwddrHgt = arrFwddrHgt;
		this.depFoilWgt = depFoilWgt;
		this.actAtbInpDt = actAtbInpDt;
		this.skdVoyNo = skdVoyNo;
		this.vslBrthDlayRsnCd = vslBrthDlayRsnCd;
		this.actAtdInpDt = actAtdInpDt;
		this.actAtaInpDt = actAtaInpDt;
		this.creUsrId = creUsrId;
		this.depFwddrHgt = depFwddrHgt;
		this.depGmHgt = depGmHgt;
		this.vslDepDlayRsnCd = vslDepDlayRsnCd;
		this.pltLstUnldDt = pltLstUnldDt;
		this.actAtdInpUsrId = actAtdInpUsrId;
		this.actBrthDt = actBrthDt;
		this.creDt = creDt;
		this.arrLowSulpFoilWgt = arrLowSulpFoilWgt;
		this.depFrshWtrWgt = depFrshWtrWgt;
		this.bfrBrthAnkOffDt = bfrBrthAnkOffDt;
		this.splLowSulpDoilWgt = splLowSulpDoilWgt;
		this.actArrDt = actArrDt;
		this.actAtbInpUsrId = actAtbInpUsrId;
		this.ibflag = ibflag;
		this.arrDoilWgt = arrDoilWgt;
		this.arrBlstWgt = arrBlstWgt;
		this.depDoilWgt = depDoilWgt;
		this.splDoilWgt = splDoilWgt;
		this.splFrshWtrWgt = splFrshWtrWgt;
		this.updDt = updDt;
		this.arrLowSulpDoilWgt = arrLowSulpDoilWgt;
		this.ttlSlgWgt = ttlSlgWgt;
		this.lstEtdDt = lstEtdDt;
		this.splLowSulpFoilWgt = splLowSulpFoilWgt;
		this.arrAftdrHgt = arrAftdrHgt;
		this.arrGmHgt = arrGmHgt;
		this.depLowSulpDoilWgt = depLowSulpDoilWgt;
		this.depAftdrHgt = depAftdrHgt;
		this.skdDirCd = skdDirCd;
		this.arrTugBotKnt = arrTugBotKnt;
		this.actDepDt = actDepDt;
		this.diffRmk = diffRmk;
		this.clptIndSeq = clptIndSeq;
		this.depLowSulpFoilWgt = depLowSulpFoilWgt;
		//2014.11.17 KJH 추가
		this.setDchgCmplDt(dchgCmplDt);
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vsl_arr_dlay_rsn_cd", getVslArrDlayRsnCd());
		this.hashColumns.put("aft_unbrth_ank_off_dt", getAftUnbrthAnkOffDt());
		this.hashColumns.put("bfr_brth_ank_drp_dt", getBfrBrthAnkDrpDt());
		this.hashColumns.put("ttl_gbg_qty", getTtlGbgQty());
		this.hashColumns.put("arr_foil_wgt", getArrFoilWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("spl_foil_wgt", getSplFoilWgt());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("aft_unbrth_ank_drp_dt", getAftUnbrthAnkDrpDt());
		this.hashColumns.put("lst_etb_dt", getLstEtbDt());
		this.hashColumns.put("arr_frsh_wtr_wgt", getArrFrshWtrWgt());
		this.hashColumns.put("port_skd_sts_cd", getPortSkdStsCd());
		this.hashColumns.put("lst_eta_dt", getLstEtaDt());
		this.hashColumns.put("dep_blst_wgt", getDepBlstWgt());
		this.hashColumns.put("act_ata_inp_usr_id", getActAtaInpUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dep_tug_bot_knt", getDepTugBotKnt());
		this.hashColumns.put("arr_fwddr_hgt", getArrFwddrHgt());
		this.hashColumns.put("dep_foil_wgt", getDepFoilWgt());
		this.hashColumns.put("act_atb_inp_dt", getActAtbInpDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_brth_dlay_rsn_cd", getVslBrthDlayRsnCd());
		this.hashColumns.put("act_atd_inp_dt", getActAtdInpDt());
		this.hashColumns.put("act_ata_inp_dt", getActAtaInpDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dep_fwddr_hgt", getDepFwddrHgt());
		this.hashColumns.put("dep_gm_hgt", getDepGmHgt());
		this.hashColumns.put("vsl_dep_dlay_rsn_cd", getVslDepDlayRsnCd());
		this.hashColumns.put("plt_lst_unld_dt", getPltLstUnldDt());
		this.hashColumns.put("act_atd_inp_usr_id", getActAtdInpUsrId());
		this.hashColumns.put("act_brth_dt", getActBrthDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("arr_low_sulp_foil_wgt", getArrLowSulpFoilWgt());
		this.hashColumns.put("dep_frsh_wtr_wgt", getDepFrshWtrWgt());
		this.hashColumns.put("bfr_brth_ank_off_dt", getBfrBrthAnkOffDt());
		this.hashColumns.put("spl_low_sulp_doil_wgt", getSplLowSulpDoilWgt());
		this.hashColumns.put("act_arr_dt", getActArrDt());
		this.hashColumns.put("act_atb_inp_usr_id", getActAtbInpUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("arr_doil_wgt", getArrDoilWgt());
		this.hashColumns.put("arr_blst_wgt", getArrBlstWgt());
		this.hashColumns.put("dep_doil_wgt", getDepDoilWgt());
		this.hashColumns.put("spl_doil_wgt", getSplDoilWgt());
		this.hashColumns.put("spl_frsh_wtr_wgt", getSplFrshWtrWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("arr_low_sulp_doil_wgt", getArrLowSulpDoilWgt());
		this.hashColumns.put("ttl_slg_wgt", getTtlSlgWgt());
		this.hashColumns.put("lst_etd_dt", getLstEtdDt());
		this.hashColumns.put("spl_low_sulp_foil_wgt", getSplLowSulpFoilWgt());
		this.hashColumns.put("arr_aftdr_hgt", getArrAftdrHgt());
		this.hashColumns.put("arr_gm_hgt", getArrGmHgt());
		this.hashColumns.put("dep_low_sulp_doil_wgt", getDepLowSulpDoilWgt());
		this.hashColumns.put("dep_aftdr_hgt", getDepAftdrHgt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("arr_tug_bot_knt", getArrTugBotKnt());
		this.hashColumns.put("act_dep_dt", getActDepDt());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("dep_low_sulp_foil_wgt", getDepLowSulpFoilWgt());
		//2014.11.17 KJH 추가
		this.hashColumns.put("dchg_cmplc_dt", getDchgCmplDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vsl_arr_dlay_rsn_cd", "vslArrDlayRsnCd");
		this.hashFields.put("aft_unbrth_ank_off_dt", "aftUnbrthAnkOffDt");
		this.hashFields.put("bfr_brth_ank_drp_dt", "bfrBrthAnkDrpDt");
		this.hashFields.put("ttl_gbg_qty", "ttlGbgQty");
		this.hashFields.put("arr_foil_wgt", "arrFoilWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("spl_foil_wgt", "splFoilWgt");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("aft_unbrth_ank_drp_dt", "aftUnbrthAnkDrpDt");
		this.hashFields.put("lst_etb_dt", "lstEtbDt");
		this.hashFields.put("arr_frsh_wtr_wgt", "arrFrshWtrWgt");
		this.hashFields.put("port_skd_sts_cd", "portSkdStsCd");
		this.hashFields.put("lst_eta_dt", "lstEtaDt");
		this.hashFields.put("dep_blst_wgt", "depBlstWgt");
		this.hashFields.put("act_ata_inp_usr_id", "actAtaInpUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dep_tug_bot_knt", "depTugBotKnt");
		this.hashFields.put("arr_fwddr_hgt", "arrFwddrHgt");
		this.hashFields.put("dep_foil_wgt", "depFoilWgt");
		this.hashFields.put("act_atb_inp_dt", "actAtbInpDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_brth_dlay_rsn_cd", "vslBrthDlayRsnCd");
		this.hashFields.put("act_atd_inp_dt", "actAtdInpDt");
		this.hashFields.put("act_ata_inp_dt", "actAtaInpDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dep_fwddr_hgt", "depFwddrHgt");
		this.hashFields.put("dep_gm_hgt", "depGmHgt");
		this.hashFields.put("vsl_dep_dlay_rsn_cd", "vslDepDlayRsnCd");
		this.hashFields.put("plt_lst_unld_dt", "pltLstUnldDt");
		this.hashFields.put("act_atd_inp_usr_id", "actAtdInpUsrId");
		this.hashFields.put("act_brth_dt", "actBrthDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("arr_low_sulp_foil_wgt", "arrLowSulpFoilWgt");
		this.hashFields.put("dep_frsh_wtr_wgt", "depFrshWtrWgt");
		this.hashFields.put("bfr_brth_ank_off_dt", "bfrBrthAnkOffDt");
		this.hashFields.put("spl_low_sulp_doil_wgt", "splLowSulpDoilWgt");
		this.hashFields.put("act_arr_dt", "actArrDt");
		this.hashFields.put("act_atb_inp_usr_id", "actAtbInpUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("arr_doil_wgt", "arrDoilWgt");
		this.hashFields.put("arr_blst_wgt", "arrBlstWgt");
		this.hashFields.put("dep_doil_wgt", "depDoilWgt");
		this.hashFields.put("spl_doil_wgt", "splDoilWgt");
		this.hashFields.put("spl_frsh_wtr_wgt", "splFrshWtrWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("arr_low_sulp_doil_wgt", "arrLowSulpDoilWgt");
		this.hashFields.put("ttl_slg_wgt", "ttlSlgWgt");
		this.hashFields.put("lst_etd_dt", "lstEtdDt");
		this.hashFields.put("spl_low_sulp_foil_wgt", "splLowSulpFoilWgt");
		this.hashFields.put("arr_aftdr_hgt", "arrAftdrHgt");
		this.hashFields.put("arr_gm_hgt", "arrGmHgt");
		this.hashFields.put("dep_low_sulp_doil_wgt", "depLowSulpDoilWgt");
		this.hashFields.put("dep_aftdr_hgt", "depAftdrHgt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("arr_tug_bot_knt", "arrTugBotKnt");
		this.hashFields.put("act_dep_dt", "actDepDt");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("dep_low_sulp_foil_wgt", "depLowSulpFoilWgt");
		//2014.11.17 KJH 추가
		this.hashFields.put("dchg_cmplc_dt", "dchgCmplDt" );
		return this.hashFields;
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
	 * @return vslArrDlayRsnCd
	 */
	public String getVslArrDlayRsnCd() {
		return this.vslArrDlayRsnCd;
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
	 * @return bfrBrthAnkDrpDt
	 */
	public String getBfrBrthAnkDrpDt() {
		return this.bfrBrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @return ttlGbgQty
	 */
	public String getTtlGbgQty() {
		return this.ttlGbgQty;
	}
	
	/**
	 * Column Info
	 * @return arrFoilWgt
	 */
	public String getArrFoilWgt() {
		return this.arrFoilWgt;
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
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
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
	 * @return lstEtbDt
	 */
	public String getLstEtbDt() {
		return this.lstEtbDt;
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
	 * @return portSkdStsCd
	 */
	public String getPortSkdStsCd() {
		return this.portSkdStsCd;
	}
	
	/**
	 * Column Info
	 * @return lstEtaDt
	 */
	public String getLstEtaDt() {
		return this.lstEtaDt;
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
	 * @return actAtaInpUsrId
	 */
	public String getActAtaInpUsrId() {
		return this.actAtaInpUsrId;
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
	 * @return depTugBotKnt
	 */
	public String getDepTugBotKnt() {
		return this.depTugBotKnt;
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
	 * @return actAtbInpDt
	 */
	public String getActAtbInpDt() {
		return this.actAtbInpDt;
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
	 * @return vslBrthDlayRsnCd
	 */
	public String getVslBrthDlayRsnCd() {
		return this.vslBrthDlayRsnCd;
	}
	
	/**
	 * Column Info
	 * @return actAtdInpDt
	 */
	public String getActAtdInpDt() {
		return this.actAtdInpDt;
	}
	
	/**
	 * Column Info
	 * @return actAtaInpDt
	 */
	public String getActAtaInpDt() {
		return this.actAtaInpDt;
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
	 * @return vslDepDlayRsnCd
	 */
	public String getVslDepDlayRsnCd() {
		return this.vslDepDlayRsnCd;
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
	 * @return actAtdInpUsrId
	 */
	public String getActAtdInpUsrId() {
		return this.actAtdInpUsrId;
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
	 * @return actAtbInpUsrId
	 */
	public String getActAtbInpUsrId() {
		return this.actAtbInpUsrId;
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
	 * @return lstEtdDt
	 */
	public String getLstEtdDt() {
		return this.lstEtdDt;
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
	 * @return arrAftdrHgt
	 */
	public String getArrAftdrHgt() {
		return this.arrAftdrHgt;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return arrTugBotKnt
	 */
	public String getArrTugBotKnt() {
		return this.arrTugBotKnt;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
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
	 * @return depLowSulpFoilWgt
	 */
	public String getDepLowSulpFoilWgt() {
		return this.depLowSulpFoilWgt;
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
	 * @param vslArrDlayRsnCd
	 */
	public void setVslArrDlayRsnCd(String vslArrDlayRsnCd) {
		this.vslArrDlayRsnCd = vslArrDlayRsnCd;
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
	 * @param bfrBrthAnkDrpDt
	 */
	public void setBfrBrthAnkDrpDt(String bfrBrthAnkDrpDt) {
		this.bfrBrthAnkDrpDt = bfrBrthAnkDrpDt;
	}
	
	/**
	 * Column Info
	 * @param ttlGbgQty
	 */
	public void setTtlGbgQty(String ttlGbgQty) {
		this.ttlGbgQty = ttlGbgQty;
	}
	
	/**
	 * Column Info
	 * @param arrFoilWgt
	 */
	public void setArrFoilWgt(String arrFoilWgt) {
		this.arrFoilWgt = arrFoilWgt;
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
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
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
	 * @param lstEtbDt
	 */
	public void setLstEtbDt(String lstEtbDt) {
		this.lstEtbDt = lstEtbDt;
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
	 * @param portSkdStsCd
	 */
	public void setPortSkdStsCd(String portSkdStsCd) {
		this.portSkdStsCd = portSkdStsCd;
	}
	
	/**
	 * Column Info
	 * @param lstEtaDt
	 */
	public void setLstEtaDt(String lstEtaDt) {
		this.lstEtaDt = lstEtaDt;
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
	 * @param actAtaInpUsrId
	 */
	public void setActAtaInpUsrId(String actAtaInpUsrId) {
		this.actAtaInpUsrId = actAtaInpUsrId;
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
	 * @param depTugBotKnt
	 */
	public void setDepTugBotKnt(String depTugBotKnt) {
		this.depTugBotKnt = depTugBotKnt;
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
	 * @param actAtbInpDt
	 */
	public void setActAtbInpDt(String actAtbInpDt) {
		this.actAtbInpDt = actAtbInpDt;
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
	 * @param vslBrthDlayRsnCd
	 */
	public void setVslBrthDlayRsnCd(String vslBrthDlayRsnCd) {
		this.vslBrthDlayRsnCd = vslBrthDlayRsnCd;
	}
	
	/**
	 * Column Info
	 * @param actAtdInpDt
	 */
	public void setActAtdInpDt(String actAtdInpDt) {
		this.actAtdInpDt = actAtdInpDt;
	}
	
	/**
	 * Column Info
	 * @param actAtaInpDt
	 */
	public void setActAtaInpDt(String actAtaInpDt) {
		this.actAtaInpDt = actAtaInpDt;
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
	 * @param vslDepDlayRsnCd
	 */
	public void setVslDepDlayRsnCd(String vslDepDlayRsnCd) {
		this.vslDepDlayRsnCd = vslDepDlayRsnCd;
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
	 * @param actAtdInpUsrId
	 */
	public void setActAtdInpUsrId(String actAtdInpUsrId) {
		this.actAtdInpUsrId = actAtdInpUsrId;
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
	 * @param actAtbInpUsrId
	 */
	public void setActAtbInpUsrId(String actAtbInpUsrId) {
		this.actAtbInpUsrId = actAtbInpUsrId;
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
	 * @param lstEtdDt
	 */
	public void setLstEtdDt(String lstEtdDt) {
		this.lstEtdDt = lstEtdDt;
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
	 * @param arrAftdrHgt
	 */
	public void setArrAftdrHgt(String arrAftdrHgt) {
		this.arrAftdrHgt = arrAftdrHgt;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param arrTugBotKnt
	 */
	public void setArrTugBotKnt(String arrTugBotKnt) {
		this.arrTugBotKnt = arrTugBotKnt;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setVslArrDlayRsnCd(JSPUtil.getParameter(request, prefix + "vsl_arr_dlay_rsn_cd", ""));
		setAftUnbrthAnkOffDt(JSPUtil.getParameter(request, prefix + "aft_unbrth_ank_off_dt", ""));
		setBfrBrthAnkDrpDt(JSPUtil.getParameter(request, prefix + "bfr_brth_ank_drp_dt", ""));
		setTtlGbgQty(JSPUtil.getParameter(request, prefix + "ttl_gbg_qty", ""));
		setArrFoilWgt(JSPUtil.getParameter(request, prefix + "arr_foil_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setSplFoilWgt(JSPUtil.getParameter(request, prefix + "spl_foil_wgt", ""));
		setVpsPortCd(JSPUtil.getParameter(request, prefix + "vps_port_cd", ""));
		setAftUnbrthAnkDrpDt(JSPUtil.getParameter(request, prefix + "aft_unbrth_ank_drp_dt", ""));
		setLstEtbDt(JSPUtil.getParameter(request, prefix + "lst_etb_dt", ""));
		setArrFrshWtrWgt(JSPUtil.getParameter(request, prefix + "arr_frsh_wtr_wgt", ""));
		setPortSkdStsCd(JSPUtil.getParameter(request, prefix + "port_skd_sts_cd", ""));
		setLstEtaDt(JSPUtil.getParameter(request, prefix + "lst_eta_dt", ""));
		setDepBlstWgt(JSPUtil.getParameter(request, prefix + "dep_blst_wgt", ""));
		setActAtaInpUsrId(JSPUtil.getParameter(request, prefix + "act_ata_inp_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setDepTugBotKnt(JSPUtil.getParameter(request, prefix + "dep_tug_bot_knt", ""));
		setArrFwddrHgt(JSPUtil.getParameter(request, prefix + "arr_fwddr_hgt", ""));
		setDepFoilWgt(JSPUtil.getParameter(request, prefix + "dep_foil_wgt", ""));
		setActAtbInpDt(JSPUtil.getParameter(request, prefix + "act_atb_inp_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setVslBrthDlayRsnCd(JSPUtil.getParameter(request, prefix + "vsl_brth_dlay_rsn_cd", ""));
		setActAtdInpDt(JSPUtil.getParameter(request, prefix + "act_atd_inp_dt", ""));
		setActAtaInpDt(JSPUtil.getParameter(request, prefix + "act_ata_inp_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setDepFwddrHgt(JSPUtil.getParameter(request, prefix + "dep_fwddr_hgt", ""));
		setDepGmHgt(JSPUtil.getParameter(request, prefix + "dep_gm_hgt", ""));
		setVslDepDlayRsnCd(JSPUtil.getParameter(request, prefix + "vsl_dep_dlay_rsn_cd", ""));
		setPltLstUnldDt(JSPUtil.getParameter(request, prefix + "plt_lst_unld_dt", ""));
		setActAtdInpUsrId(JSPUtil.getParameter(request, prefix + "act_atd_inp_usr_id", ""));
		setActBrthDt(JSPUtil.getParameter(request, prefix + "act_brth_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setArrLowSulpFoilWgt(JSPUtil.getParameter(request, prefix + "arr_low_sulp_foil_wgt", ""));
		setDepFrshWtrWgt(JSPUtil.getParameter(request, prefix + "dep_frsh_wtr_wgt", ""));
		setBfrBrthAnkOffDt(JSPUtil.getParameter(request, prefix + "bfr_brth_ank_off_dt", ""));
		setSplLowSulpDoilWgt(JSPUtil.getParameter(request, prefix + "spl_low_sulp_doil_wgt", ""));
		setActArrDt(JSPUtil.getParameter(request, prefix + "act_arr_dt", ""));
		setActAtbInpUsrId(JSPUtil.getParameter(request, prefix + "act_atb_inp_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setArrDoilWgt(JSPUtil.getParameter(request, prefix + "arr_doil_wgt", ""));
		setArrBlstWgt(JSPUtil.getParameter(request, prefix + "arr_blst_wgt", ""));
		setDepDoilWgt(JSPUtil.getParameter(request, prefix + "dep_doil_wgt", ""));
		setSplDoilWgt(JSPUtil.getParameter(request, prefix + "spl_doil_wgt", ""));
		setSplFrshWtrWgt(JSPUtil.getParameter(request, prefix + "spl_frsh_wtr_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setArrLowSulpDoilWgt(JSPUtil.getParameter(request, prefix + "arr_low_sulp_doil_wgt", ""));
		setTtlSlgWgt(JSPUtil.getParameter(request, prefix + "ttl_slg_wgt", ""));
		setLstEtdDt(JSPUtil.getParameter(request, prefix + "lst_etd_dt", ""));
		setSplLowSulpFoilWgt(JSPUtil.getParameter(request, prefix + "spl_low_sulp_foil_wgt", ""));
		setArrAftdrHgt(JSPUtil.getParameter(request, prefix + "arr_aftdr_hgt", ""));
		setArrGmHgt(JSPUtil.getParameter(request, prefix + "arr_gm_hgt", ""));
		setDepLowSulpDoilWgt(JSPUtil.getParameter(request, prefix + "dep_low_sulp_doil_wgt", ""));
		setDepAftdrHgt(JSPUtil.getParameter(request, prefix + "dep_aftdr_hgt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setArrTugBotKnt(JSPUtil.getParameter(request, prefix + "arr_tug_bot_knt", ""));
		setActDepDt(JSPUtil.getParameter(request, prefix + "act_dep_dt", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setClptIndSeq(JSPUtil.getParameter(request, prefix + "clpt_ind_seq", ""));
		setDepLowSulpFoilWgt(JSPUtil.getParameter(request, prefix + "dep_low_sulp_foil_wgt", ""));
		//2014.11.17 KJH 추가
		setDchgCmplDt(JSPUtil.getParameter(request,  prefix + "dchg_cmplc_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskActPortSkdVO[]
	 */
	public VskActPortSkdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskActPortSkdVO[]
	 */
	public VskActPortSkdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskActPortSkdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vslArrDlayRsnCd = (JSPUtil.getParameter(request, prefix	+ "vsl_arr_dlay_rsn_cd", length));
			String[] aftUnbrthAnkOffDt = (JSPUtil.getParameter(request, prefix	+ "aft_unbrth_ank_off_dt", length));
			String[] bfrBrthAnkDrpDt = (JSPUtil.getParameter(request, prefix	+ "bfr_brth_ank_drp_dt", length));
			String[] ttlGbgQty = (JSPUtil.getParameter(request, prefix	+ "ttl_gbg_qty", length));
			String[] arrFoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_foil_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] splFoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_foil_wgt", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] aftUnbrthAnkDrpDt = (JSPUtil.getParameter(request, prefix	+ "aft_unbrth_ank_drp_dt", length));
			String[] lstEtbDt = (JSPUtil.getParameter(request, prefix	+ "lst_etb_dt", length));
			String[] arrFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "arr_frsh_wtr_wgt", length));
			String[] portSkdStsCd = (JSPUtil.getParameter(request, prefix	+ "port_skd_sts_cd", length));
			String[] lstEtaDt = (JSPUtil.getParameter(request, prefix	+ "lst_eta_dt", length));
			String[] depBlstWgt = (JSPUtil.getParameter(request, prefix	+ "dep_blst_wgt", length));
			String[] actAtaInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_ata_inp_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] depTugBotKnt = (JSPUtil.getParameter(request, prefix	+ "dep_tug_bot_knt", length));
			String[] arrFwddrHgt = (JSPUtil.getParameter(request, prefix	+ "arr_fwddr_hgt", length));
			String[] depFoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_foil_wgt", length));
			String[] actAtbInpDt = (JSPUtil.getParameter(request, prefix	+ "act_atb_inp_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslBrthDlayRsnCd = (JSPUtil.getParameter(request, prefix	+ "vsl_brth_dlay_rsn_cd", length));
			String[] actAtdInpDt = (JSPUtil.getParameter(request, prefix	+ "act_atd_inp_dt", length));
			String[] actAtaInpDt = (JSPUtil.getParameter(request, prefix	+ "act_ata_inp_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] depFwddrHgt = (JSPUtil.getParameter(request, prefix	+ "dep_fwddr_hgt", length));
			String[] depGmHgt = (JSPUtil.getParameter(request, prefix	+ "dep_gm_hgt", length));
			String[] vslDepDlayRsnCd = (JSPUtil.getParameter(request, prefix	+ "vsl_dep_dlay_rsn_cd", length));
			String[] pltLstUnldDt = (JSPUtil.getParameter(request, prefix	+ "plt_lst_unld_dt", length));
			String[] actAtdInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_atd_inp_usr_id", length));
			String[] actBrthDt = (JSPUtil.getParameter(request, prefix	+ "act_brth_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] arrLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_low_sulp_foil_wgt", length));
			String[] depFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "dep_frsh_wtr_wgt", length));
			String[] bfrBrthAnkOffDt = (JSPUtil.getParameter(request, prefix	+ "bfr_brth_ank_off_dt", length));
			String[] splLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_low_sulp_doil_wgt", length));
			String[] actArrDt = (JSPUtil.getParameter(request, prefix	+ "act_arr_dt", length));
			String[] actAtbInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_atb_inp_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] arrDoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_doil_wgt", length));
			String[] arrBlstWgt = (JSPUtil.getParameter(request, prefix	+ "arr_blst_wgt", length));
			String[] depDoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_doil_wgt", length));
			String[] splDoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_doil_wgt", length));
			String[] splFrshWtrWgt = (JSPUtil.getParameter(request, prefix	+ "spl_frsh_wtr_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] arrLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "arr_low_sulp_doil_wgt", length));
			String[] ttlSlgWgt = (JSPUtil.getParameter(request, prefix	+ "ttl_slg_wgt", length));
			String[] lstEtdDt = (JSPUtil.getParameter(request, prefix	+ "lst_etd_dt", length));
			String[] splLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "spl_low_sulp_foil_wgt", length));
			String[] arrAftdrHgt = (JSPUtil.getParameter(request, prefix	+ "arr_aftdr_hgt", length));
			String[] arrGmHgt = (JSPUtil.getParameter(request, prefix	+ "arr_gm_hgt", length));
			String[] depLowSulpDoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_low_sulp_doil_wgt", length));
			String[] depAftdrHgt = (JSPUtil.getParameter(request, prefix	+ "dep_aftdr_hgt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] arrTugBotKnt = (JSPUtil.getParameter(request, prefix	+ "arr_tug_bot_knt", length));
			String[] actDepDt = (JSPUtil.getParameter(request, prefix	+ "act_dep_dt", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] depLowSulpFoilWgt = (JSPUtil.getParameter(request, prefix	+ "dep_low_sulp_foil_wgt", length));
			
			//2014.11.17 KJH 추가
			String[] dchgCmplDt = (JSPUtil.getParameter(request, prefix	+ "dchg_cmplc_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskActPortSkdVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vslArrDlayRsnCd[i] != null)
					model.setVslArrDlayRsnCd(vslArrDlayRsnCd[i]);
				if (aftUnbrthAnkOffDt[i] != null)
					model.setAftUnbrthAnkOffDt(aftUnbrthAnkOffDt[i]);
				if (bfrBrthAnkDrpDt[i] != null)
					model.setBfrBrthAnkDrpDt(bfrBrthAnkDrpDt[i]);
				if (ttlGbgQty[i] != null)
					model.setTtlGbgQty(ttlGbgQty[i]);
				if (arrFoilWgt[i] != null)
					model.setArrFoilWgt(arrFoilWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (splFoilWgt[i] != null)
					model.setSplFoilWgt(splFoilWgt[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (aftUnbrthAnkDrpDt[i] != null)
					model.setAftUnbrthAnkDrpDt(aftUnbrthAnkDrpDt[i]);
				if (lstEtbDt[i] != null)
					model.setLstEtbDt(lstEtbDt[i]);
				if (arrFrshWtrWgt[i] != null)
					model.setArrFrshWtrWgt(arrFrshWtrWgt[i]);
				if (portSkdStsCd[i] != null)
					model.setPortSkdStsCd(portSkdStsCd[i]);
				if (lstEtaDt[i] != null)
					model.setLstEtaDt(lstEtaDt[i]);
				if (depBlstWgt[i] != null)
					model.setDepBlstWgt(depBlstWgt[i]);
				if (actAtaInpUsrId[i] != null)
					model.setActAtaInpUsrId(actAtaInpUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (depTugBotKnt[i] != null)
					model.setDepTugBotKnt(depTugBotKnt[i]);
				if (arrFwddrHgt[i] != null)
					model.setArrFwddrHgt(arrFwddrHgt[i]);
				if (depFoilWgt[i] != null)
					model.setDepFoilWgt(depFoilWgt[i]);
				if (actAtbInpDt[i] != null)
					model.setActAtbInpDt(actAtbInpDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslBrthDlayRsnCd[i] != null)
					model.setVslBrthDlayRsnCd(vslBrthDlayRsnCd[i]);
				if (actAtdInpDt[i] != null)
					model.setActAtdInpDt(actAtdInpDt[i]);
				if (actAtaInpDt[i] != null)
					model.setActAtaInpDt(actAtaInpDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (depFwddrHgt[i] != null)
					model.setDepFwddrHgt(depFwddrHgt[i]);
				if (depGmHgt[i] != null)
					model.setDepGmHgt(depGmHgt[i]);
				if (vslDepDlayRsnCd[i] != null)
					model.setVslDepDlayRsnCd(vslDepDlayRsnCd[i]);
				if (pltLstUnldDt[i] != null)
					model.setPltLstUnldDt(pltLstUnldDt[i]);
				if (actAtdInpUsrId[i] != null)
					model.setActAtdInpUsrId(actAtdInpUsrId[i]);
				if (actBrthDt[i] != null)
					model.setActBrthDt(actBrthDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (arrLowSulpFoilWgt[i] != null)
					model.setArrLowSulpFoilWgt(arrLowSulpFoilWgt[i]);
				if (depFrshWtrWgt[i] != null)
					model.setDepFrshWtrWgt(depFrshWtrWgt[i]);
				if (bfrBrthAnkOffDt[i] != null)
					model.setBfrBrthAnkOffDt(bfrBrthAnkOffDt[i]);
				if (splLowSulpDoilWgt[i] != null)
					model.setSplLowSulpDoilWgt(splLowSulpDoilWgt[i]);
				if (actArrDt[i] != null)
					model.setActArrDt(actArrDt[i]);
				if (actAtbInpUsrId[i] != null)
					model.setActAtbInpUsrId(actAtbInpUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (arrDoilWgt[i] != null)
					model.setArrDoilWgt(arrDoilWgt[i]);
				if (arrBlstWgt[i] != null)
					model.setArrBlstWgt(arrBlstWgt[i]);
				if (depDoilWgt[i] != null)
					model.setDepDoilWgt(depDoilWgt[i]);
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
				if (lstEtdDt[i] != null)
					model.setLstEtdDt(lstEtdDt[i]);
				if (splLowSulpFoilWgt[i] != null)
					model.setSplLowSulpFoilWgt(splLowSulpFoilWgt[i]);
				if (arrAftdrHgt[i] != null)
					model.setArrAftdrHgt(arrAftdrHgt[i]);
				if (arrGmHgt[i] != null)
					model.setArrGmHgt(arrGmHgt[i]);
				if (depLowSulpDoilWgt[i] != null)
					model.setDepLowSulpDoilWgt(depLowSulpDoilWgt[i]);
				if (depAftdrHgt[i] != null)
					model.setDepAftdrHgt(depAftdrHgt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (arrTugBotKnt[i] != null)
					model.setArrTugBotKnt(arrTugBotKnt[i]);
				if (actDepDt[i] != null)
					model.setActDepDt(actDepDt[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (depLowSulpFoilWgt[i] != null)
					model.setDepLowSulpFoilWgt(depLowSulpFoilWgt[i]);
				if (dchgCmplDt[i] != null)
					model.setDchgCmplDt(dchgCmplDt[i]);
				
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskActPortSkdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskActPortSkdVO[]
	 */
	public VskActPortSkdVO[] getVskActPortSkdVOs(){
		VskActPortSkdVO[] vos = (VskActPortSkdVO[])models.toArray(new VskActPortSkdVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslArrDlayRsnCd = this.vslArrDlayRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftUnbrthAnkOffDt = this.aftUnbrthAnkOffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrBrthAnkDrpDt = this.bfrBrthAnkDrpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlGbgQty = this.ttlGbgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFoilWgt = this.arrFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splFoilWgt = this.splFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftUnbrthAnkDrpDt = this.aftUnbrthAnkDrpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstEtbDt = this.lstEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFrshWtrWgt = this.arrFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portSkdStsCd = this.portSkdStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstEtaDt = this.lstEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depBlstWgt = this.depBlstWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtaInpUsrId = this.actAtaInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depTugBotKnt = this.depTugBotKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFwddrHgt = this.arrFwddrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFoilWgt = this.depFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtbInpDt = this.actAtbInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBrthDlayRsnCd = this.vslBrthDlayRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtdInpDt = this.actAtdInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtaInpDt = this.actAtaInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFwddrHgt = this.depFwddrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depGmHgt = this.depGmHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDepDlayRsnCd = this.vslDepDlayRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pltLstUnldDt = this.pltLstUnldDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtdInpUsrId = this.actAtdInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBrthDt = this.actBrthDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrLowSulpFoilWgt = this.arrLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFrshWtrWgt = this.depFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrBrthAnkOffDt = this.bfrBrthAnkOffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splLowSulpDoilWgt = this.splLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actArrDt = this.actArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtbInpUsrId = this.actAtbInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDoilWgt = this.arrDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrBlstWgt = this.arrBlstWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDoilWgt = this.depDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splDoilWgt = this.splDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splFrshWtrWgt = this.splFrshWtrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrLowSulpDoilWgt = this.arrLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlSlgWgt = this.ttlSlgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstEtdDt = this.lstEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splLowSulpFoilWgt = this.splLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrAftdrHgt = this.arrAftdrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrGmHgt = this.arrGmHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depLowSulpDoilWgt = this.depLowSulpDoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depAftdrHgt = this.depAftdrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrTugBotKnt = this.arrTugBotKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDepDt = this.actDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depLowSulpFoilWgt = this.depLowSulpFoilWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");		
		//2014.11.17 KJH 추가
		this.dchgCmplDt = this.dchgCmplDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}

	public String getDchgCmplDt() {
		return dchgCmplDt;
	}

	public void setDchgCmplDt(String dchgCmplDt) {
		this.dchgCmplDt = dchgCmplDt;
	}
}
