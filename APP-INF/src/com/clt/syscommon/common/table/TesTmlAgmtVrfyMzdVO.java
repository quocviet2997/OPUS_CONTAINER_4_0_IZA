/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : TesTmlAgmtVrfyMzdVO.java
*@FileTitle : TesTmlAgmtVrfyMzdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.07
*@LastModifier : 
*@LastVersion : 1.0
* 2015.04.07  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
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

public class TesTmlAgmtVrfyMzdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlAgmtVrfyMzdVO> models = new ArrayList<TesTmlAgmtVrfyMzdVO>();
	
	/* Column Info */
	private String stoCntrFullMtyFlg = null;
	/* Column Info */
	private String tmlDcgoAplyFlg = null;
	/* Column Info */
	private String tmlLaneFlg = null;
	/* Column Info */
	private String tmlIoBndFlg = null;
	/* Column Info */
	private String stoFpCalcPrdFlg = null;
	/* Column Info */
	private String stoFreeDyTrDyFlg = null;
	/* Column Info */
	private String rtTeuFlg = null;
	/* Column Info */
	private String tmlThrpCostCdFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String stoFreeDyIoBndFlg = null;
	/* Column Info */
	private String stoFreeDyDcgoRtFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String freeDyCntrTpszFlg = null;
	/* Column Info */
	private String stoFreeDyXcldDtFlg = null;
	/* Column Info */
	private String tmlCntrFullMtyFlg = null;
	/* Column Info */
	private String tmlAplyDtFlg = null;
	/* Column Info */
	private String rtMvFlg = null;
	/* Column Info */
	private String tmlTrnsModFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rtBxFlg = null;
	/* Column Info */
	private String stoComAgmtTpFlg = null;
	/* Column Info */
	private String stoFreeDyFlg = null;
	/* Column Info */
	private String tmlIocFlg = null;
	/* Column Info */
	private String tmlOvtShftFlg = null;
	/* Column Info */
	private String stoFreeDyDcgoTmFlg = null;
	/* Column Info */
	private String tmlThcFlg = null;
	/* Column Info */
	private String rtCntrTpszFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String stoFpTeuFlg = null;
	/* Column Info */
	private String tmlAgmtDivFlg = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String comAutoCalcFlg = null;
	/* Column Info */
	private String tmlTrVolFlg = null;
	/* Column Info */
	private String stoComCmncTmFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TesTmlAgmtVrfyMzdVO() {}

	public TesTmlAgmtVrfyMzdVO(String ibflag, String pagerows, String lgsCostCd, String comAutoCalcFlg, String tmlThrpCostCdFlg, String tmlIoBndFlg, String tmlIocFlg, String tmlAplyDtFlg, String tmlLaneFlg, String tmlDcgoAplyFlg, String tmlTrVolFlg, String tmlOvtShftFlg, String tmlThcFlg, String stoComAgmtTpFlg, String stoComCmncTmFlg, String stoFreeDyIoBndFlg, String stoFreeDyFlg, String stoFreeDyDcgoTmFlg, String stoFreeDyXcldDtFlg, String stoFreeDyDcgoRtFlg, String stoFreeDyTrDyFlg, String stoFpCalcPrdFlg, String stoFpTeuFlg, String rtCntrTpszFlg, String rtTeuFlg, String rtBxFlg, String rtMvFlg, String freeDyCntrTpszFlg, String tmlTrnsModFlg, String tmlAgmtDivFlg, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String tmlCntrFullMtyFlg, String stoCntrFullMtyFlg) {
		this.stoCntrFullMtyFlg = stoCntrFullMtyFlg;
		this.tmlDcgoAplyFlg = tmlDcgoAplyFlg;
		this.tmlLaneFlg = tmlLaneFlg;
		this.tmlIoBndFlg = tmlIoBndFlg;
		this.stoFpCalcPrdFlg = stoFpCalcPrdFlg;
		this.stoFreeDyTrDyFlg = stoFreeDyTrDyFlg;
		this.rtTeuFlg = rtTeuFlg;
		this.tmlThrpCostCdFlg = tmlThrpCostCdFlg;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.stoFreeDyIoBndFlg = stoFreeDyIoBndFlg;
		this.stoFreeDyDcgoRtFlg = stoFreeDyDcgoRtFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.freeDyCntrTpszFlg = freeDyCntrTpszFlg;
		this.stoFreeDyXcldDtFlg = stoFreeDyXcldDtFlg;
		this.tmlCntrFullMtyFlg = tmlCntrFullMtyFlg;
		this.tmlAplyDtFlg = tmlAplyDtFlg;
		this.rtMvFlg = rtMvFlg;
		this.tmlTrnsModFlg = tmlTrnsModFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.rtBxFlg = rtBxFlg;
		this.stoComAgmtTpFlg = stoComAgmtTpFlg;
		this.stoFreeDyFlg = stoFreeDyFlg;
		this.tmlIocFlg = tmlIocFlg;
		this.tmlOvtShftFlg = tmlOvtShftFlg;
		this.stoFreeDyDcgoTmFlg = stoFreeDyDcgoTmFlg;
		this.tmlThcFlg = tmlThcFlg;
		this.rtCntrTpszFlg = rtCntrTpszFlg;
		this.creUsrId = creUsrId;
		this.stoFpTeuFlg = stoFpTeuFlg;
		this.tmlAgmtDivFlg = tmlAgmtDivFlg;
		this.lgsCostCd = lgsCostCd;
		this.comAutoCalcFlg = comAutoCalcFlg;
		this.tmlTrVolFlg = tmlTrVolFlg;
		this.stoComCmncTmFlg = stoComCmncTmFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sto_cntr_full_mty_flg", getStoCntrFullMtyFlg());
		this.hashColumns.put("tml_dcgo_aply_flg", getTmlDcgoAplyFlg());
		this.hashColumns.put("tml_lane_flg", getTmlLaneFlg());
		this.hashColumns.put("tml_io_bnd_flg", getTmlIoBndFlg());
		this.hashColumns.put("sto_fp_calc_prd_flg", getStoFpCalcPrdFlg());
		this.hashColumns.put("sto_free_dy_tr_dy_flg", getStoFreeDyTrDyFlg());
		this.hashColumns.put("rt_teu_flg", getRtTeuFlg());
		this.hashColumns.put("tml_thrp_cost_cd_flg", getTmlThrpCostCdFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("sto_free_dy_io_bnd_flg", getStoFreeDyIoBndFlg());
		this.hashColumns.put("sto_free_dy_dcgo_rt_flg", getStoFreeDyDcgoRtFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("free_dy_cntr_tpsz_flg", getFreeDyCntrTpszFlg());
		this.hashColumns.put("sto_free_dy_xcld_dt_flg", getStoFreeDyXcldDtFlg());
		this.hashColumns.put("tml_cntr_full_mty_flg", getTmlCntrFullMtyFlg());
		this.hashColumns.put("tml_aply_dt_flg", getTmlAplyDtFlg());
		this.hashColumns.put("rt_mv_flg", getRtMvFlg());
		this.hashColumns.put("tml_trns_mod_flg", getTmlTrnsModFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rt_bx_flg", getRtBxFlg());
		this.hashColumns.put("sto_com_agmt_tp_flg", getStoComAgmtTpFlg());
		this.hashColumns.put("sto_free_dy_flg", getStoFreeDyFlg());
		this.hashColumns.put("tml_ioc_flg", getTmlIocFlg());
		this.hashColumns.put("tml_ovt_shft_flg", getTmlOvtShftFlg());
		this.hashColumns.put("sto_free_dy_dcgo_tm_flg", getStoFreeDyDcgoTmFlg());
		this.hashColumns.put("tml_thc_flg", getTmlThcFlg());
		this.hashColumns.put("rt_cntr_tpsz_flg", getRtCntrTpszFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sto_fp_teu_flg", getStoFpTeuFlg());
		this.hashColumns.put("tml_agmt_div_flg", getTmlAgmtDivFlg());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("com_auto_calc_flg", getComAutoCalcFlg());
		this.hashColumns.put("tml_tr_vol_flg", getTmlTrVolFlg());
		this.hashColumns.put("sto_com_cmnc_tm_flg", getStoComCmncTmFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sto_cntr_full_mty_flg", "stoCntrFullMtyFlg");
		this.hashFields.put("tml_dcgo_aply_flg", "tmlDcgoAplyFlg");
		this.hashFields.put("tml_lane_flg", "tmlLaneFlg");
		this.hashFields.put("tml_io_bnd_flg", "tmlIoBndFlg");
		this.hashFields.put("sto_fp_calc_prd_flg", "stoFpCalcPrdFlg");
		this.hashFields.put("sto_free_dy_tr_dy_flg", "stoFreeDyTrDyFlg");
		this.hashFields.put("rt_teu_flg", "rtTeuFlg");
		this.hashFields.put("tml_thrp_cost_cd_flg", "tmlThrpCostCdFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("sto_free_dy_io_bnd_flg", "stoFreeDyIoBndFlg");
		this.hashFields.put("sto_free_dy_dcgo_rt_flg", "stoFreeDyDcgoRtFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("free_dy_cntr_tpsz_flg", "freeDyCntrTpszFlg");
		this.hashFields.put("sto_free_dy_xcld_dt_flg", "stoFreeDyXcldDtFlg");
		this.hashFields.put("tml_cntr_full_mty_flg", "tmlCntrFullMtyFlg");
		this.hashFields.put("tml_aply_dt_flg", "tmlAplyDtFlg");
		this.hashFields.put("rt_mv_flg", "rtMvFlg");
		this.hashFields.put("tml_trns_mod_flg", "tmlTrnsModFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rt_bx_flg", "rtBxFlg");
		this.hashFields.put("sto_com_agmt_tp_flg", "stoComAgmtTpFlg");
		this.hashFields.put("sto_free_dy_flg", "stoFreeDyFlg");
		this.hashFields.put("tml_ioc_flg", "tmlIocFlg");
		this.hashFields.put("tml_ovt_shft_flg", "tmlOvtShftFlg");
		this.hashFields.put("sto_free_dy_dcgo_tm_flg", "stoFreeDyDcgoTmFlg");
		this.hashFields.put("tml_thc_flg", "tmlThcFlg");
		this.hashFields.put("rt_cntr_tpsz_flg", "rtCntrTpszFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sto_fp_teu_flg", "stoFpTeuFlg");
		this.hashFields.put("tml_agmt_div_flg", "tmlAgmtDivFlg");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("com_auto_calc_flg", "comAutoCalcFlg");
		this.hashFields.put("tml_tr_vol_flg", "tmlTrVolFlg");
		this.hashFields.put("sto_com_cmnc_tm_flg", "stoComCmncTmFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return stoCntrFullMtyFlg
	 */
	public String getStoCntrFullMtyFlg() {
		return this.stoCntrFullMtyFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlDcgoAplyFlg
	 */
	public String getTmlDcgoAplyFlg() {
		return this.tmlDcgoAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlLaneFlg
	 */
	public String getTmlLaneFlg() {
		return this.tmlLaneFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlIoBndFlg
	 */
	public String getTmlIoBndFlg() {
		return this.tmlIoBndFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFpCalcPrdFlg
	 */
	public String getStoFpCalcPrdFlg() {
		return this.stoFpCalcPrdFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFreeDyTrDyFlg
	 */
	public String getStoFreeDyTrDyFlg() {
		return this.stoFreeDyTrDyFlg;
	}
	
	/**
	 * Column Info
	 * @return rtTeuFlg
	 */
	public String getRtTeuFlg() {
		return this.rtTeuFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlThrpCostCdFlg
	 */
	public String getTmlThrpCostCdFlg() {
		return this.tmlThrpCostCdFlg;
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
	 * @return stoFreeDyIoBndFlg
	 */
	public String getStoFreeDyIoBndFlg() {
		return this.stoFreeDyIoBndFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFreeDyDcgoRtFlg
	 */
	public String getStoFreeDyDcgoRtFlg() {
		return this.stoFreeDyDcgoRtFlg;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return freeDyCntrTpszFlg
	 */
	public String getFreeDyCntrTpszFlg() {
		return this.freeDyCntrTpszFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFreeDyXcldDtFlg
	 */
	public String getStoFreeDyXcldDtFlg() {
		return this.stoFreeDyXcldDtFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlCntrFullMtyFlg
	 */
	public String getTmlCntrFullMtyFlg() {
		return this.tmlCntrFullMtyFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlAplyDtFlg
	 */
	public String getTmlAplyDtFlg() {
		return this.tmlAplyDtFlg;
	}
	
	/**
	 * Column Info
	 * @return rtMvFlg
	 */
	public String getRtMvFlg() {
		return this.rtMvFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlTrnsModFlg
	 */
	public String getTmlTrnsModFlg() {
		return this.tmlTrnsModFlg;
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
	 * @return rtBxFlg
	 */
	public String getRtBxFlg() {
		return this.rtBxFlg;
	}
	
	/**
	 * Column Info
	 * @return stoComAgmtTpFlg
	 */
	public String getStoComAgmtTpFlg() {
		return this.stoComAgmtTpFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFreeDyFlg
	 */
	public String getStoFreeDyFlg() {
		return this.stoFreeDyFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlIocFlg
	 */
	public String getTmlIocFlg() {
		return this.tmlIocFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlOvtShftFlg
	 */
	public String getTmlOvtShftFlg() {
		return this.tmlOvtShftFlg;
	}
	
	/**
	 * Column Info
	 * @return stoFreeDyDcgoTmFlg
	 */
	public String getStoFreeDyDcgoTmFlg() {
		return this.stoFreeDyDcgoTmFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlThcFlg
	 */
	public String getTmlThcFlg() {
		return this.tmlThcFlg;
	}
	
	/**
	 * Column Info
	 * @return rtCntrTpszFlg
	 */
	public String getRtCntrTpszFlg() {
		return this.rtCntrTpszFlg;
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
	 * @return stoFpTeuFlg
	 */
	public String getStoFpTeuFlg() {
		return this.stoFpTeuFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtDivFlg
	 */
	public String getTmlAgmtDivFlg() {
		return this.tmlAgmtDivFlg;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return comAutoCalcFlg
	 */
	public String getComAutoCalcFlg() {
		return this.comAutoCalcFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlTrVolFlg
	 */
	public String getTmlTrVolFlg() {
		return this.tmlTrVolFlg;
	}
	
	/**
	 * Column Info
	 * @return stoComCmncTmFlg
	 */
	public String getStoComCmncTmFlg() {
		return this.stoComCmncTmFlg;
	}
	

	/**
	 * Column Info
	 * @param stoCntrFullMtyFlg
	 */
	public void setStoCntrFullMtyFlg(String stoCntrFullMtyFlg) {
		this.stoCntrFullMtyFlg = stoCntrFullMtyFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlDcgoAplyFlg
	 */
	public void setTmlDcgoAplyFlg(String tmlDcgoAplyFlg) {
		this.tmlDcgoAplyFlg = tmlDcgoAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlLaneFlg
	 */
	public void setTmlLaneFlg(String tmlLaneFlg) {
		this.tmlLaneFlg = tmlLaneFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlIoBndFlg
	 */
	public void setTmlIoBndFlg(String tmlIoBndFlg) {
		this.tmlIoBndFlg = tmlIoBndFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFpCalcPrdFlg
	 */
	public void setStoFpCalcPrdFlg(String stoFpCalcPrdFlg) {
		this.stoFpCalcPrdFlg = stoFpCalcPrdFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFreeDyTrDyFlg
	 */
	public void setStoFreeDyTrDyFlg(String stoFreeDyTrDyFlg) {
		this.stoFreeDyTrDyFlg = stoFreeDyTrDyFlg;
	}
	
	/**
	 * Column Info
	 * @param rtTeuFlg
	 */
	public void setRtTeuFlg(String rtTeuFlg) {
		this.rtTeuFlg = rtTeuFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlThrpCostCdFlg
	 */
	public void setTmlThrpCostCdFlg(String tmlThrpCostCdFlg) {
		this.tmlThrpCostCdFlg = tmlThrpCostCdFlg;
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
	 * @param stoFreeDyIoBndFlg
	 */
	public void setStoFreeDyIoBndFlg(String stoFreeDyIoBndFlg) {
		this.stoFreeDyIoBndFlg = stoFreeDyIoBndFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFreeDyDcgoRtFlg
	 */
	public void setStoFreeDyDcgoRtFlg(String stoFreeDyDcgoRtFlg) {
		this.stoFreeDyDcgoRtFlg = stoFreeDyDcgoRtFlg;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param freeDyCntrTpszFlg
	 */
	public void setFreeDyCntrTpszFlg(String freeDyCntrTpszFlg) {
		this.freeDyCntrTpszFlg = freeDyCntrTpszFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFreeDyXcldDtFlg
	 */
	public void setStoFreeDyXcldDtFlg(String stoFreeDyXcldDtFlg) {
		this.stoFreeDyXcldDtFlg = stoFreeDyXcldDtFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlCntrFullMtyFlg
	 */
	public void setTmlCntrFullMtyFlg(String tmlCntrFullMtyFlg) {
		this.tmlCntrFullMtyFlg = tmlCntrFullMtyFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlAplyDtFlg
	 */
	public void setTmlAplyDtFlg(String tmlAplyDtFlg) {
		this.tmlAplyDtFlg = tmlAplyDtFlg;
	}
	
	/**
	 * Column Info
	 * @param rtMvFlg
	 */
	public void setRtMvFlg(String rtMvFlg) {
		this.rtMvFlg = rtMvFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlTrnsModFlg
	 */
	public void setTmlTrnsModFlg(String tmlTrnsModFlg) {
		this.tmlTrnsModFlg = tmlTrnsModFlg;
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
	 * @param rtBxFlg
	 */
	public void setRtBxFlg(String rtBxFlg) {
		this.rtBxFlg = rtBxFlg;
	}
	
	/**
	 * Column Info
	 * @param stoComAgmtTpFlg
	 */
	public void setStoComAgmtTpFlg(String stoComAgmtTpFlg) {
		this.stoComAgmtTpFlg = stoComAgmtTpFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFreeDyFlg
	 */
	public void setStoFreeDyFlg(String stoFreeDyFlg) {
		this.stoFreeDyFlg = stoFreeDyFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlIocFlg
	 */
	public void setTmlIocFlg(String tmlIocFlg) {
		this.tmlIocFlg = tmlIocFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlOvtShftFlg
	 */
	public void setTmlOvtShftFlg(String tmlOvtShftFlg) {
		this.tmlOvtShftFlg = tmlOvtShftFlg;
	}
	
	/**
	 * Column Info
	 * @param stoFreeDyDcgoTmFlg
	 */
	public void setStoFreeDyDcgoTmFlg(String stoFreeDyDcgoTmFlg) {
		this.stoFreeDyDcgoTmFlg = stoFreeDyDcgoTmFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlThcFlg
	 */
	public void setTmlThcFlg(String tmlThcFlg) {
		this.tmlThcFlg = tmlThcFlg;
	}
	
	/**
	 * Column Info
	 * @param rtCntrTpszFlg
	 */
	public void setRtCntrTpszFlg(String rtCntrTpszFlg) {
		this.rtCntrTpszFlg = rtCntrTpszFlg;
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
	 * @param stoFpTeuFlg
	 */
	public void setStoFpTeuFlg(String stoFpTeuFlg) {
		this.stoFpTeuFlg = stoFpTeuFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtDivFlg
	 */
	public void setTmlAgmtDivFlg(String tmlAgmtDivFlg) {
		this.tmlAgmtDivFlg = tmlAgmtDivFlg;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param comAutoCalcFlg
	 */
	public void setComAutoCalcFlg(String comAutoCalcFlg) {
		this.comAutoCalcFlg = comAutoCalcFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlTrVolFlg
	 */
	public void setTmlTrVolFlg(String tmlTrVolFlg) {
		this.tmlTrVolFlg = tmlTrVolFlg;
	}
	
	/**
	 * Column Info
	 * @param stoComCmncTmFlg
	 */
	public void setStoComCmncTmFlg(String stoComCmncTmFlg) {
		this.stoComCmncTmFlg = stoComCmncTmFlg;
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
		setStoCntrFullMtyFlg(JSPUtil.getParameter(request, prefix + "sto_cntr_full_mty_flg", ""));
		setTmlDcgoAplyFlg(JSPUtil.getParameter(request, prefix + "tml_dcgo_aply_flg", ""));
		setTmlLaneFlg(JSPUtil.getParameter(request, prefix + "tml_lane_flg", ""));
		setTmlIoBndFlg(JSPUtil.getParameter(request, prefix + "tml_io_bnd_flg", ""));
		setStoFpCalcPrdFlg(JSPUtil.getParameter(request, prefix + "sto_fp_calc_prd_flg", ""));
		setStoFreeDyTrDyFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_tr_dy_flg", ""));
		setRtTeuFlg(JSPUtil.getParameter(request, prefix + "rt_teu_flg", ""));
		setTmlThrpCostCdFlg(JSPUtil.getParameter(request, prefix + "tml_thrp_cost_cd_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setStoFreeDyIoBndFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_io_bnd_flg", ""));
		setStoFreeDyDcgoRtFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_dcgo_rt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setFreeDyCntrTpszFlg(JSPUtil.getParameter(request, prefix + "free_dy_cntr_tpsz_flg", ""));
		setStoFreeDyXcldDtFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_xcld_dt_flg", ""));
		setTmlCntrFullMtyFlg(JSPUtil.getParameter(request, prefix + "tml_cntr_full_mty_flg", ""));
		setTmlAplyDtFlg(JSPUtil.getParameter(request, prefix + "tml_aply_dt_flg", ""));
		setRtMvFlg(JSPUtil.getParameter(request, prefix + "rt_mv_flg", ""));
		setTmlTrnsModFlg(JSPUtil.getParameter(request, prefix + "tml_trns_mod_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setRtBxFlg(JSPUtil.getParameter(request, prefix + "rt_bx_flg", ""));
		setStoComAgmtTpFlg(JSPUtil.getParameter(request, prefix + "sto_com_agmt_tp_flg", ""));
		setStoFreeDyFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_flg", ""));
		setTmlIocFlg(JSPUtil.getParameter(request, prefix + "tml_ioc_flg", ""));
		setTmlOvtShftFlg(JSPUtil.getParameter(request, prefix + "tml_ovt_shft_flg", ""));
		setStoFreeDyDcgoTmFlg(JSPUtil.getParameter(request, prefix + "sto_free_dy_dcgo_tm_flg", ""));
		setTmlThcFlg(JSPUtil.getParameter(request, prefix + "tml_thc_flg", ""));
		setRtCntrTpszFlg(JSPUtil.getParameter(request, prefix + "rt_cntr_tpsz_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setStoFpTeuFlg(JSPUtil.getParameter(request, prefix + "sto_fp_teu_flg", ""));
		setTmlAgmtDivFlg(JSPUtil.getParameter(request, prefix + "tml_agmt_div_flg", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setComAutoCalcFlg(JSPUtil.getParameter(request, prefix + "com_auto_calc_flg", ""));
		setTmlTrVolFlg(JSPUtil.getParameter(request, prefix + "tml_tr_vol_flg", ""));
		setStoComCmncTmFlg(JSPUtil.getParameter(request, prefix + "sto_com_cmnc_tm_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlAgmtVrfyMzdVO[]
	 */
	public TesTmlAgmtVrfyMzdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlAgmtVrfyMzdVO[]
	 */
	public TesTmlAgmtVrfyMzdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlAgmtVrfyMzdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] stoCntrFullMtyFlg = (JSPUtil.getParameter(request, prefix	+ "sto_cntr_full_mty_flg", length));
			String[] tmlDcgoAplyFlg = (JSPUtil.getParameter(request, prefix	+ "tml_dcgo_aply_flg", length));
			String[] tmlLaneFlg = (JSPUtil.getParameter(request, prefix	+ "tml_lane_flg", length));
			String[] tmlIoBndFlg = (JSPUtil.getParameter(request, prefix	+ "tml_io_bnd_flg", length));
			String[] stoFpCalcPrdFlg = (JSPUtil.getParameter(request, prefix	+ "sto_fp_calc_prd_flg", length));
			String[] stoFreeDyTrDyFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_tr_dy_flg", length));
			String[] rtTeuFlg = (JSPUtil.getParameter(request, prefix	+ "rt_teu_flg", length));
			String[] tmlThrpCostCdFlg = (JSPUtil.getParameter(request, prefix	+ "tml_thrp_cost_cd_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] stoFreeDyIoBndFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_io_bnd_flg", length));
			String[] stoFreeDyDcgoRtFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_dcgo_rt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] freeDyCntrTpszFlg = (JSPUtil.getParameter(request, prefix	+ "free_dy_cntr_tpsz_flg", length));
			String[] stoFreeDyXcldDtFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_xcld_dt_flg", length));
			String[] tmlCntrFullMtyFlg = (JSPUtil.getParameter(request, prefix	+ "tml_cntr_full_mty_flg", length));
			String[] tmlAplyDtFlg = (JSPUtil.getParameter(request, prefix	+ "tml_aply_dt_flg", length));
			String[] rtMvFlg = (JSPUtil.getParameter(request, prefix	+ "rt_mv_flg", length));
			String[] tmlTrnsModFlg = (JSPUtil.getParameter(request, prefix	+ "tml_trns_mod_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rtBxFlg = (JSPUtil.getParameter(request, prefix	+ "rt_bx_flg", length));
			String[] stoComAgmtTpFlg = (JSPUtil.getParameter(request, prefix	+ "sto_com_agmt_tp_flg", length));
			String[] stoFreeDyFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_flg", length));
			String[] tmlIocFlg = (JSPUtil.getParameter(request, prefix	+ "tml_ioc_flg", length));
			String[] tmlOvtShftFlg = (JSPUtil.getParameter(request, prefix	+ "tml_ovt_shft_flg", length));
			String[] stoFreeDyDcgoTmFlg = (JSPUtil.getParameter(request, prefix	+ "sto_free_dy_dcgo_tm_flg", length));
			String[] tmlThcFlg = (JSPUtil.getParameter(request, prefix	+ "tml_thc_flg", length));
			String[] rtCntrTpszFlg = (JSPUtil.getParameter(request, prefix	+ "rt_cntr_tpsz_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] stoFpTeuFlg = (JSPUtil.getParameter(request, prefix	+ "sto_fp_teu_flg", length));
			String[] tmlAgmtDivFlg = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_div_flg", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] comAutoCalcFlg = (JSPUtil.getParameter(request, prefix	+ "com_auto_calc_flg", length));
			String[] tmlTrVolFlg = (JSPUtil.getParameter(request, prefix	+ "tml_tr_vol_flg", length));
			String[] stoComCmncTmFlg = (JSPUtil.getParameter(request, prefix	+ "sto_com_cmnc_tm_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlAgmtVrfyMzdVO();
				if (stoCntrFullMtyFlg[i] != null)
					model.setStoCntrFullMtyFlg(stoCntrFullMtyFlg[i]);
				if (tmlDcgoAplyFlg[i] != null)
					model.setTmlDcgoAplyFlg(tmlDcgoAplyFlg[i]);
				if (tmlLaneFlg[i] != null)
					model.setTmlLaneFlg(tmlLaneFlg[i]);
				if (tmlIoBndFlg[i] != null)
					model.setTmlIoBndFlg(tmlIoBndFlg[i]);
				if (stoFpCalcPrdFlg[i] != null)
					model.setStoFpCalcPrdFlg(stoFpCalcPrdFlg[i]);
				if (stoFreeDyTrDyFlg[i] != null)
					model.setStoFreeDyTrDyFlg(stoFreeDyTrDyFlg[i]);
				if (rtTeuFlg[i] != null)
					model.setRtTeuFlg(rtTeuFlg[i]);
				if (tmlThrpCostCdFlg[i] != null)
					model.setTmlThrpCostCdFlg(tmlThrpCostCdFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (stoFreeDyIoBndFlg[i] != null)
					model.setStoFreeDyIoBndFlg(stoFreeDyIoBndFlg[i]);
				if (stoFreeDyDcgoRtFlg[i] != null)
					model.setStoFreeDyDcgoRtFlg(stoFreeDyDcgoRtFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (freeDyCntrTpszFlg[i] != null)
					model.setFreeDyCntrTpszFlg(freeDyCntrTpszFlg[i]);
				if (stoFreeDyXcldDtFlg[i] != null)
					model.setStoFreeDyXcldDtFlg(stoFreeDyXcldDtFlg[i]);
				if (tmlCntrFullMtyFlg[i] != null)
					model.setTmlCntrFullMtyFlg(tmlCntrFullMtyFlg[i]);
				if (tmlAplyDtFlg[i] != null)
					model.setTmlAplyDtFlg(tmlAplyDtFlg[i]);
				if (rtMvFlg[i] != null)
					model.setRtMvFlg(rtMvFlg[i]);
				if (tmlTrnsModFlg[i] != null)
					model.setTmlTrnsModFlg(tmlTrnsModFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rtBxFlg[i] != null)
					model.setRtBxFlg(rtBxFlg[i]);
				if (stoComAgmtTpFlg[i] != null)
					model.setStoComAgmtTpFlg(stoComAgmtTpFlg[i]);
				if (stoFreeDyFlg[i] != null)
					model.setStoFreeDyFlg(stoFreeDyFlg[i]);
				if (tmlIocFlg[i] != null)
					model.setTmlIocFlg(tmlIocFlg[i]);
				if (tmlOvtShftFlg[i] != null)
					model.setTmlOvtShftFlg(tmlOvtShftFlg[i]);
				if (stoFreeDyDcgoTmFlg[i] != null)
					model.setStoFreeDyDcgoTmFlg(stoFreeDyDcgoTmFlg[i]);
				if (tmlThcFlg[i] != null)
					model.setTmlThcFlg(tmlThcFlg[i]);
				if (rtCntrTpszFlg[i] != null)
					model.setRtCntrTpszFlg(rtCntrTpszFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (stoFpTeuFlg[i] != null)
					model.setStoFpTeuFlg(stoFpTeuFlg[i]);
				if (tmlAgmtDivFlg[i] != null)
					model.setTmlAgmtDivFlg(tmlAgmtDivFlg[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (comAutoCalcFlg[i] != null)
					model.setComAutoCalcFlg(comAutoCalcFlg[i]);
				if (tmlTrVolFlg[i] != null)
					model.setTmlTrVolFlg(tmlTrVolFlg[i]);
				if (stoComCmncTmFlg[i] != null)
					model.setStoComCmncTmFlg(stoComCmncTmFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlAgmtVrfyMzdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlAgmtVrfyMzdVO[]
	 */
	public TesTmlAgmtVrfyMzdVO[] getTesTmlAgmtVrfyMzdVOs(){
		TesTmlAgmtVrfyMzdVO[] vos = (TesTmlAgmtVrfyMzdVO[])models.toArray(new TesTmlAgmtVrfyMzdVO[models.size()]);
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
		this.stoCntrFullMtyFlg = this.stoCntrFullMtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlDcgoAplyFlg = this.tmlDcgoAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlLaneFlg = this.tmlLaneFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlIoBndFlg = this.tmlIoBndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFpCalcPrdFlg = this.stoFpCalcPrdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyTrDyFlg = this.stoFreeDyTrDyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtTeuFlg = this.rtTeuFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlThrpCostCdFlg = this.tmlThrpCostCdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyIoBndFlg = this.stoFreeDyIoBndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyDcgoRtFlg = this.stoFreeDyDcgoRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDyCntrTpszFlg = this.freeDyCntrTpszFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyXcldDtFlg = this.stoFreeDyXcldDtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCntrFullMtyFlg = this.tmlCntrFullMtyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAplyDtFlg = this.tmlAplyDtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtMvFlg = this.rtMvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrnsModFlg = this.tmlTrnsModFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtBxFlg = this.rtBxFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoComAgmtTpFlg = this.stoComAgmtTpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyFlg = this.stoFreeDyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlIocFlg = this.tmlIocFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlOvtShftFlg = this.tmlOvtShftFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFreeDyDcgoTmFlg = this.stoFreeDyDcgoTmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlThcFlg = this.tmlThcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtCntrTpszFlg = this.rtCntrTpszFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoFpTeuFlg = this.stoFpTeuFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtDivFlg = this.tmlAgmtDivFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comAutoCalcFlg = this.comAutoCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrVolFlg = this.tmlTrVolFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoComCmncTmFlg = this.stoComCmncTmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
