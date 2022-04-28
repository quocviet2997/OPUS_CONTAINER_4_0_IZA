/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : TesTmlAgmtDtlVO.java
*@FileTitle : TesTmlAgmtDtlVO
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

public class TesTmlAgmtDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlAgmtDtlVO> models = new ArrayList<TesTmlAgmtDtlVO>();
	
	/* Column Info */
	private String tmlAgmtVolUtCd = null;
	/* Column Info */
	private String laneCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String thrpCostCdFlg = null;
	/* Column Info */
	private String tmlTrnsModCd = null;
	/* Column Info */
	private String agmtDtlRmk = null;
	/* Column Info */
	private String tmlDysAplyTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fmTrDys = null;
	/* Column Info */
	private String tmlCntrStyCd = null;
	/* Column Info */
	private String dcgoAplyTpCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String tmlDyAplyTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String toTrVolVal = null;
	/* Column Info */
	private String tmlAgmtVerNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String thrpLgsCostCd = null;
	/* Column Info */
	private String fpCalcPrdCd = null;
	/* Column Info */
	private String cmncHrmnt = null;
	/* Column Info */
	private String tmlAgmtDtlSeq = null;
	/* Column Info */
	private String toTrDys = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmlStoAgmtTpCd = null;
	/* Column Info */
	private String thcTpCd = null;
	/* Column Info */
	private String tmlFreeDysTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String tmlAgmtTpCd = null;
	/* Column Info */
	private String tmlAgmtOfcCtyCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String fmTrVolVal = null;
	/* Column Info */
	private String tmlVolAplyTpCd = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String tmlOvtShftCd = null;
	/* Column Info */
	private String xcldDyAplyTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fpTeuQty = null;
	/* Column Info */
	private String ftDys = null;
	/* Column Info */
	private String tmpSavFlg = null;
	/* Column Info */
	private String agmtUtRt = null;
	/* Column Info */
	private String tmlAgmtSeq = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String autoCalcFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TesTmlAgmtDtlVO() {}

	public TesTmlAgmtDtlVO(String ibflag, String pagerows, String tmlAgmtOfcCtyCd, String tmlAgmtSeq, String tmlAgmtVerNo, String tmlAgmtDtlSeq, String tmlAgmtTpCd, String lgsCostCd, String autoCalcFlg, String thrpCostCdFlg, String tmlAgmtVolUtCd, String currCd, String ioBndCd, String tmlTrnsModCd, String tmlDyAplyTpCd, String laneCd, String dcgoAplyTpCd, String tmlStoAgmtTpCd, String tmlVolAplyTpCd, String fmTrVolVal, String toTrVolVal, String tmlFreeDysTpCd, String tmlDysAplyTpCd, String fmTrDys, String toTrDys, String xcldDyAplyTpCd, String cmncHrmnt, String tmlOvtShftCd, String thcTpCd, String iocCd, String agmtUtRt, String fpCalcPrdCd, String ftDys, String fpTeuQty, String agmtDtlRmk, String thrpLgsCostCd, String tmpSavFlg, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String subTrdCd, String tmlCntrStyCd) {
		this.tmlAgmtVolUtCd = tmlAgmtVolUtCd;
		this.laneCd = laneCd;
		this.currCd = currCd;
		this.thrpCostCdFlg = thrpCostCdFlg;
		this.tmlTrnsModCd = tmlTrnsModCd;
		this.agmtDtlRmk = agmtDtlRmk;
		this.tmlDysAplyTpCd = tmlDysAplyTpCd;
		this.creDt = creDt;
		this.fmTrDys = fmTrDys;
		this.tmlCntrStyCd = tmlCntrStyCd;
		this.dcgoAplyTpCd = dcgoAplyTpCd;
		this.edwUpdDt = edwUpdDt;
		this.tmlDyAplyTpCd = tmlDyAplyTpCd;
		this.pagerows = pagerows;
		this.toTrVolVal = toTrVolVal;
		this.tmlAgmtVerNo = tmlAgmtVerNo;
		this.ibflag = ibflag;
		this.thrpLgsCostCd = thrpLgsCostCd;
		this.fpCalcPrdCd = fpCalcPrdCd;
		this.cmncHrmnt = cmncHrmnt;
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
		this.toTrDys = toTrDys;
		this.updUsrId = updUsrId;
		this.tmlStoAgmtTpCd = tmlStoAgmtTpCd;
		this.thcTpCd = thcTpCd;
		this.tmlFreeDysTpCd = tmlFreeDysTpCd;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.tmlAgmtTpCd = tmlAgmtTpCd;
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
		this.loclCreDt = loclCreDt;
		this.fmTrVolVal = fmTrVolVal;
		this.tmlVolAplyTpCd = tmlVolAplyTpCd;
		this.ioBndCd = ioBndCd;
		this.tmlOvtShftCd = tmlOvtShftCd;
		this.xcldDyAplyTpCd = xcldDyAplyTpCd;
		this.creUsrId = creUsrId;
		this.fpTeuQty = fpTeuQty;
		this.ftDys = ftDys;
		this.tmpSavFlg = tmpSavFlg;
		this.agmtUtRt = agmtUtRt;
		this.tmlAgmtSeq = tmlAgmtSeq;
		this.lgsCostCd = lgsCostCd;
		this.loclUpdDt = loclUpdDt;
		this.subTrdCd = subTrdCd;
		this.autoCalcFlg = autoCalcFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("tml_agmt_vol_ut_cd", getTmlAgmtVolUtCd());
		this.hashColumns.put("lane_cd", getLaneCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("thrp_cost_cd_flg", getThrpCostCdFlg());
		this.hashColumns.put("tml_trns_mod_cd", getTmlTrnsModCd());
		this.hashColumns.put("agmt_dtl_rmk", getAgmtDtlRmk());
		this.hashColumns.put("tml_dys_aply_tp_cd", getTmlDysAplyTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fm_tr_dys", getFmTrDys());
		this.hashColumns.put("tml_cntr_sty_cd", getTmlCntrStyCd());
		this.hashColumns.put("dcgo_aply_tp_cd", getDcgoAplyTpCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("tml_dy_aply_tp_cd", getTmlDyAplyTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("to_tr_vol_val", getToTrVolVal());
		this.hashColumns.put("tml_agmt_ver_no", getTmlAgmtVerNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("thrp_lgs_cost_cd", getThrpLgsCostCd());
		this.hashColumns.put("fp_calc_prd_cd", getFpCalcPrdCd());
		this.hashColumns.put("cmnc_hrmnt", getCmncHrmnt());
		this.hashColumns.put("tml_agmt_dtl_seq", getTmlAgmtDtlSeq());
		this.hashColumns.put("to_tr_dys", getToTrDys());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tml_sto_agmt_tp_cd", getTmlStoAgmtTpCd());
		this.hashColumns.put("thc_tp_cd", getThcTpCd());
		this.hashColumns.put("tml_free_dys_tp_cd", getTmlFreeDysTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("tml_agmt_tp_cd", getTmlAgmtTpCd());
		this.hashColumns.put("tml_agmt_ofc_cty_cd", getTmlAgmtOfcCtyCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("fm_tr_vol_val", getFmTrVolVal());
		this.hashColumns.put("tml_vol_aply_tp_cd", getTmlVolAplyTpCd());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("tml_ovt_shft_cd", getTmlOvtShftCd());
		this.hashColumns.put("xcld_dy_aply_tp_cd", getXcldDyAplyTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fp_teu_qty", getFpTeuQty());
		this.hashColumns.put("ft_dys", getFtDys());
		this.hashColumns.put("tmp_sav_flg", getTmpSavFlg());
		this.hashColumns.put("agmt_ut_rt", getAgmtUtRt());
		this.hashColumns.put("tml_agmt_seq", getTmlAgmtSeq());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("auto_calc_flg", getAutoCalcFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("tml_agmt_vol_ut_cd", "tmlAgmtVolUtCd");
		this.hashFields.put("lane_cd", "laneCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("thrp_cost_cd_flg", "thrpCostCdFlg");
		this.hashFields.put("tml_trns_mod_cd", "tmlTrnsModCd");
		this.hashFields.put("agmt_dtl_rmk", "agmtDtlRmk");
		this.hashFields.put("tml_dys_aply_tp_cd", "tmlDysAplyTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fm_tr_dys", "fmTrDys");
		this.hashFields.put("tml_cntr_sty_cd", "tmlCntrStyCd");
		this.hashFields.put("dcgo_aply_tp_cd", "dcgoAplyTpCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("tml_dy_aply_tp_cd", "tmlDyAplyTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("to_tr_vol_val", "toTrVolVal");
		this.hashFields.put("tml_agmt_ver_no", "tmlAgmtVerNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("thrp_lgs_cost_cd", "thrpLgsCostCd");
		this.hashFields.put("fp_calc_prd_cd", "fpCalcPrdCd");
		this.hashFields.put("cmnc_hrmnt", "cmncHrmnt");
		this.hashFields.put("tml_agmt_dtl_seq", "tmlAgmtDtlSeq");
		this.hashFields.put("to_tr_dys", "toTrDys");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tml_sto_agmt_tp_cd", "tmlStoAgmtTpCd");
		this.hashFields.put("thc_tp_cd", "thcTpCd");
		this.hashFields.put("tml_free_dys_tp_cd", "tmlFreeDysTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("tml_agmt_tp_cd", "tmlAgmtTpCd");
		this.hashFields.put("tml_agmt_ofc_cty_cd", "tmlAgmtOfcCtyCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("fm_tr_vol_val", "fmTrVolVal");
		this.hashFields.put("tml_vol_aply_tp_cd", "tmlVolAplyTpCd");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("tml_ovt_shft_cd", "tmlOvtShftCd");
		this.hashFields.put("xcld_dy_aply_tp_cd", "xcldDyAplyTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fp_teu_qty", "fpTeuQty");
		this.hashFields.put("ft_dys", "ftDys");
		this.hashFields.put("tmp_sav_flg", "tmpSavFlg");
		this.hashFields.put("agmt_ut_rt", "agmtUtRt");
		this.hashFields.put("tml_agmt_seq", "tmlAgmtSeq");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("auto_calc_flg", "autoCalcFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtVolUtCd
	 */
	public String getTmlAgmtVolUtCd() {
		return this.tmlAgmtVolUtCd;
	}
	
	/**
	 * Column Info
	 * @return laneCd
	 */
	public String getLaneCd() {
		return this.laneCd;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return thrpCostCdFlg
	 */
	public String getThrpCostCdFlg() {
		return this.thrpCostCdFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlTrnsModCd
	 */
	public String getTmlTrnsModCd() {
		return this.tmlTrnsModCd;
	}
	
	/**
	 * Column Info
	 * @return agmtDtlRmk
	 */
	public String getAgmtDtlRmk() {
		return this.agmtDtlRmk;
	}
	
	/**
	 * Column Info
	 * @return tmlDysAplyTpCd
	 */
	public String getTmlDysAplyTpCd() {
		return this.tmlDysAplyTpCd;
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
	 * @return fmTrDys
	 */
	public String getFmTrDys() {
		return this.fmTrDys;
	}
	
	/**
	 * Column Info
	 * @return tmlCntrStyCd
	 */
	public String getTmlCntrStyCd() {
		return this.tmlCntrStyCd;
	}
	
	/**
	 * Column Info
	 * @return dcgoAplyTpCd
	 */
	public String getDcgoAplyTpCd() {
		return this.dcgoAplyTpCd;
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
	 * @return tmlDyAplyTpCd
	 */
	public String getTmlDyAplyTpCd() {
		return this.tmlDyAplyTpCd;
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
	 * @return toTrVolVal
	 */
	public String getToTrVolVal() {
		return this.toTrVolVal;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtVerNo
	 */
	public String getTmlAgmtVerNo() {
		return this.tmlAgmtVerNo;
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
	 * @return thrpLgsCostCd
	 */
	public String getThrpLgsCostCd() {
		return this.thrpLgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return fpCalcPrdCd
	 */
	public String getFpCalcPrdCd() {
		return this.fpCalcPrdCd;
	}
	
	/**
	 * Column Info
	 * @return cmncHrmnt
	 */
	public String getCmncHrmnt() {
		return this.cmncHrmnt;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtDtlSeq
	 */
	public String getTmlAgmtDtlSeq() {
		return this.tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return toTrDys
	 */
	public String getToTrDys() {
		return this.toTrDys;
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
	 * @return tmlStoAgmtTpCd
	 */
	public String getTmlStoAgmtTpCd() {
		return this.tmlStoAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @return thcTpCd
	 */
	public String getThcTpCd() {
		return this.thcTpCd;
	}
	
	/**
	 * Column Info
	 * @return tmlFreeDysTpCd
	 */
	public String getTmlFreeDysTpCd() {
		return this.tmlFreeDysTpCd;
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
	 * @return tmlAgmtTpCd
	 */
	public String getTmlAgmtTpCd() {
		return this.tmlAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtOfcCtyCd
	 */
	public String getTmlAgmtOfcCtyCd() {
		return this.tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}
	
	/**
	 * Column Info
	 * @return fmTrVolVal
	 */
	public String getFmTrVolVal() {
		return this.fmTrVolVal;
	}
	
	/**
	 * Column Info
	 * @return tmlVolAplyTpCd
	 */
	public String getTmlVolAplyTpCd() {
		return this.tmlVolAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return tmlOvtShftCd
	 */
	public String getTmlOvtShftCd() {
		return this.tmlOvtShftCd;
	}
	
	/**
	 * Column Info
	 * @return xcldDyAplyTpCd
	 */
	public String getXcldDyAplyTpCd() {
		return this.xcldDyAplyTpCd;
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
	 * @return fpTeuQty
	 */
	public String getFpTeuQty() {
		return this.fpTeuQty;
	}
	
	/**
	 * Column Info
	 * @return ftDys
	 */
	public String getFtDys() {
		return this.ftDys;
	}
	
	/**
	 * Column Info
	 * @return tmpSavFlg
	 */
	public String getTmpSavFlg() {
		return this.tmpSavFlg;
	}
	
	/**
	 * Column Info
	 * @return agmtUtRt
	 */
	public String getAgmtUtRt() {
		return this.agmtUtRt;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtSeq
	 */
	public String getTmlAgmtSeq() {
		return this.tmlAgmtSeq;
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
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return autoCalcFlg
	 */
	public String getAutoCalcFlg() {
		return this.autoCalcFlg;
	}
	

	/**
	 * Column Info
	 * @param tmlAgmtVolUtCd
	 */
	public void setTmlAgmtVolUtCd(String tmlAgmtVolUtCd) {
		this.tmlAgmtVolUtCd = tmlAgmtVolUtCd;
	}
	
	/**
	 * Column Info
	 * @param laneCd
	 */
	public void setLaneCd(String laneCd) {
		this.laneCd = laneCd;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param thrpCostCdFlg
	 */
	public void setThrpCostCdFlg(String thrpCostCdFlg) {
		this.thrpCostCdFlg = thrpCostCdFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlTrnsModCd
	 */
	public void setTmlTrnsModCd(String tmlTrnsModCd) {
		this.tmlTrnsModCd = tmlTrnsModCd;
	}
	
	/**
	 * Column Info
	 * @param agmtDtlRmk
	 */
	public void setAgmtDtlRmk(String agmtDtlRmk) {
		this.agmtDtlRmk = agmtDtlRmk;
	}
	
	/**
	 * Column Info
	 * @param tmlDysAplyTpCd
	 */
	public void setTmlDysAplyTpCd(String tmlDysAplyTpCd) {
		this.tmlDysAplyTpCd = tmlDysAplyTpCd;
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
	 * @param fmTrDys
	 */
	public void setFmTrDys(String fmTrDys) {
		this.fmTrDys = fmTrDys;
	}
	
	/**
	 * Column Info
	 * @param tmlCntrStyCd
	 */
	public void setTmlCntrStyCd(String tmlCntrStyCd) {
		this.tmlCntrStyCd = tmlCntrStyCd;
	}
	
	/**
	 * Column Info
	 * @param dcgoAplyTpCd
	 */
	public void setDcgoAplyTpCd(String dcgoAplyTpCd) {
		this.dcgoAplyTpCd = dcgoAplyTpCd;
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
	 * @param tmlDyAplyTpCd
	 */
	public void setTmlDyAplyTpCd(String tmlDyAplyTpCd) {
		this.tmlDyAplyTpCd = tmlDyAplyTpCd;
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
	 * @param toTrVolVal
	 */
	public void setToTrVolVal(String toTrVolVal) {
		this.toTrVolVal = toTrVolVal;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtVerNo
	 */
	public void setTmlAgmtVerNo(String tmlAgmtVerNo) {
		this.tmlAgmtVerNo = tmlAgmtVerNo;
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
	 * @param thrpLgsCostCd
	 */
	public void setThrpLgsCostCd(String thrpLgsCostCd) {
		this.thrpLgsCostCd = thrpLgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param fpCalcPrdCd
	 */
	public void setFpCalcPrdCd(String fpCalcPrdCd) {
		this.fpCalcPrdCd = fpCalcPrdCd;
	}
	
	/**
	 * Column Info
	 * @param cmncHrmnt
	 */
	public void setCmncHrmnt(String cmncHrmnt) {
		this.cmncHrmnt = cmncHrmnt;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtDtlSeq
	 */
	public void setTmlAgmtDtlSeq(String tmlAgmtDtlSeq) {
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param toTrDys
	 */
	public void setToTrDys(String toTrDys) {
		this.toTrDys = toTrDys;
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
	 * @param tmlStoAgmtTpCd
	 */
	public void setTmlStoAgmtTpCd(String tmlStoAgmtTpCd) {
		this.tmlStoAgmtTpCd = tmlStoAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @param thcTpCd
	 */
	public void setThcTpCd(String thcTpCd) {
		this.thcTpCd = thcTpCd;
	}
	
	/**
	 * Column Info
	 * @param tmlFreeDysTpCd
	 */
	public void setTmlFreeDysTpCd(String tmlFreeDysTpCd) {
		this.tmlFreeDysTpCd = tmlFreeDysTpCd;
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
	 * @param tmlAgmtTpCd
	 */
	public void setTmlAgmtTpCd(String tmlAgmtTpCd) {
		this.tmlAgmtTpCd = tmlAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtOfcCtyCd
	 */
	public void setTmlAgmtOfcCtyCd(String tmlAgmtOfcCtyCd) {
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}
	
	/**
	 * Column Info
	 * @param fmTrVolVal
	 */
	public void setFmTrVolVal(String fmTrVolVal) {
		this.fmTrVolVal = fmTrVolVal;
	}
	
	/**
	 * Column Info
	 * @param tmlVolAplyTpCd
	 */
	public void setTmlVolAplyTpCd(String tmlVolAplyTpCd) {
		this.tmlVolAplyTpCd = tmlVolAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param tmlOvtShftCd
	 */
	public void setTmlOvtShftCd(String tmlOvtShftCd) {
		this.tmlOvtShftCd = tmlOvtShftCd;
	}
	
	/**
	 * Column Info
	 * @param xcldDyAplyTpCd
	 */
	public void setXcldDyAplyTpCd(String xcldDyAplyTpCd) {
		this.xcldDyAplyTpCd = xcldDyAplyTpCd;
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
	 * @param fpTeuQty
	 */
	public void setFpTeuQty(String fpTeuQty) {
		this.fpTeuQty = fpTeuQty;
	}
	
	/**
	 * Column Info
	 * @param ftDys
	 */
	public void setFtDys(String ftDys) {
		this.ftDys = ftDys;
	}
	
	/**
	 * Column Info
	 * @param tmpSavFlg
	 */
	public void setTmpSavFlg(String tmpSavFlg) {
		this.tmpSavFlg = tmpSavFlg;
	}
	
	/**
	 * Column Info
	 * @param agmtUtRt
	 */
	public void setAgmtUtRt(String agmtUtRt) {
		this.agmtUtRt = agmtUtRt;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtSeq
	 */
	public void setTmlAgmtSeq(String tmlAgmtSeq) {
		this.tmlAgmtSeq = tmlAgmtSeq;
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
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Column Info
	 * @param autoCalcFlg
	 */
	public void setAutoCalcFlg(String autoCalcFlg) {
		this.autoCalcFlg = autoCalcFlg;
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
		setTmlAgmtVolUtCd(JSPUtil.getParameter(request, prefix + "tml_agmt_vol_ut_cd", ""));
		setLaneCd(JSPUtil.getParameter(request, prefix + "lane_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setThrpCostCdFlg(JSPUtil.getParameter(request, prefix + "thrp_cost_cd_flg", ""));
		setTmlTrnsModCd(JSPUtil.getParameter(request, prefix + "tml_trns_mod_cd", ""));
		setAgmtDtlRmk(JSPUtil.getParameter(request, prefix + "agmt_dtl_rmk", ""));
		setTmlDysAplyTpCd(JSPUtil.getParameter(request, prefix + "tml_dys_aply_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFmTrDys(JSPUtil.getParameter(request, prefix + "fm_tr_dys", ""));
		setTmlCntrStyCd(JSPUtil.getParameter(request, prefix + "tml_cntr_sty_cd", ""));
		setDcgoAplyTpCd(JSPUtil.getParameter(request, prefix + "dcgo_aply_tp_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setTmlDyAplyTpCd(JSPUtil.getParameter(request, prefix + "tml_dy_aply_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setToTrVolVal(JSPUtil.getParameter(request, prefix + "to_tr_vol_val", ""));
		setTmlAgmtVerNo(JSPUtil.getParameter(request, prefix + "tml_agmt_ver_no", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setThrpLgsCostCd(JSPUtil.getParameter(request, prefix + "thrp_lgs_cost_cd", ""));
		setFpCalcPrdCd(JSPUtil.getParameter(request, prefix + "fp_calc_prd_cd", ""));
		setCmncHrmnt(JSPUtil.getParameter(request, prefix + "cmnc_hrmnt", ""));
		setTmlAgmtDtlSeq(JSPUtil.getParameter(request, prefix + "tml_agmt_dtl_seq", ""));
		setToTrDys(JSPUtil.getParameter(request, prefix + "to_tr_dys", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setTmlStoAgmtTpCd(JSPUtil.getParameter(request, prefix + "tml_sto_agmt_tp_cd", ""));
		setThcTpCd(JSPUtil.getParameter(request, prefix + "thc_tp_cd", ""));
		setTmlFreeDysTpCd(JSPUtil.getParameter(request, prefix + "tml_free_dys_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, prefix + "ioc_cd", ""));
		setTmlAgmtTpCd(JSPUtil.getParameter(request, prefix + "tml_agmt_tp_cd", ""));
		setTmlAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_agmt_ofc_cty_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setFmTrVolVal(JSPUtil.getParameter(request, prefix + "fm_tr_vol_val", ""));
		setTmlVolAplyTpCd(JSPUtil.getParameter(request, prefix + "tml_vol_aply_tp_cd", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setTmlOvtShftCd(JSPUtil.getParameter(request, prefix + "tml_ovt_shft_cd", ""));
		setXcldDyAplyTpCd(JSPUtil.getParameter(request, prefix + "xcld_dy_aply_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setFpTeuQty(JSPUtil.getParameter(request, prefix + "fp_teu_qty", ""));
		setFtDys(JSPUtil.getParameter(request, prefix + "ft_dys", ""));
		setTmpSavFlg(JSPUtil.getParameter(request, prefix + "tmp_sav_flg", ""));
		setAgmtUtRt(JSPUtil.getParameter(request, prefix + "agmt_ut_rt", ""));
		setTmlAgmtSeq(JSPUtil.getParameter(request, prefix + "tml_agmt_seq", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setSubTrdCd(JSPUtil.getParameter(request, prefix + "sub_trd_cd", ""));
		setAutoCalcFlg(JSPUtil.getParameter(request, prefix + "auto_calc_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlAgmtDtlVO[]
	 */
	public TesTmlAgmtDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlAgmtDtlVO[]
	 */
	public TesTmlAgmtDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlAgmtDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] tmlAgmtVolUtCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_vol_ut_cd", length));
			String[] laneCd = (JSPUtil.getParameter(request, prefix	+ "lane_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] thrpCostCdFlg = (JSPUtil.getParameter(request, prefix	+ "thrp_cost_cd_flg", length));
			String[] tmlTrnsModCd = (JSPUtil.getParameter(request, prefix	+ "tml_trns_mod_cd", length));
			String[] agmtDtlRmk = (JSPUtil.getParameter(request, prefix	+ "agmt_dtl_rmk", length));
			String[] tmlDysAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_dys_aply_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fmTrDys = (JSPUtil.getParameter(request, prefix	+ "fm_tr_dys", length));
			String[] tmlCntrStyCd = (JSPUtil.getParameter(request, prefix	+ "tml_cntr_sty_cd", length));
			String[] dcgoAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_aply_tp_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] tmlDyAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_dy_aply_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] toTrVolVal = (JSPUtil.getParameter(request, prefix	+ "to_tr_vol_val", length));
			String[] tmlAgmtVerNo = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ver_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] thrpLgsCostCd = (JSPUtil.getParameter(request, prefix	+ "thrp_lgs_cost_cd", length));
			String[] fpCalcPrdCd = (JSPUtil.getParameter(request, prefix	+ "fp_calc_prd_cd", length));
			String[] cmncHrmnt = (JSPUtil.getParameter(request, prefix	+ "cmnc_hrmnt", length));
			String[] tmlAgmtDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_dtl_seq", length));
			String[] toTrDys = (JSPUtil.getParameter(request, prefix	+ "to_tr_dys", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tmlStoAgmtTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_sto_agmt_tp_cd", length));
			String[] thcTpCd = (JSPUtil.getParameter(request, prefix	+ "thc_tp_cd", length));
			String[] tmlFreeDysTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_free_dys_tp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] tmlAgmtTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_tp_cd", length));
			String[] tmlAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ofc_cty_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] fmTrVolVal = (JSPUtil.getParameter(request, prefix	+ "fm_tr_vol_val", length));
			String[] tmlVolAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_vol_aply_tp_cd", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] tmlOvtShftCd = (JSPUtil.getParameter(request, prefix	+ "tml_ovt_shft_cd", length));
			String[] xcldDyAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "xcld_dy_aply_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fpTeuQty = (JSPUtil.getParameter(request, prefix	+ "fp_teu_qty", length));
			String[] ftDys = (JSPUtil.getParameter(request, prefix	+ "ft_dys", length));
			String[] tmpSavFlg = (JSPUtil.getParameter(request, prefix	+ "tmp_sav_flg", length));
			String[] agmtUtRt = (JSPUtil.getParameter(request, prefix	+ "agmt_ut_rt", length));
			String[] tmlAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_seq", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] autoCalcFlg = (JSPUtil.getParameter(request, prefix	+ "auto_calc_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlAgmtDtlVO();
				if (tmlAgmtVolUtCd[i] != null)
					model.setTmlAgmtVolUtCd(tmlAgmtVolUtCd[i]);
				if (laneCd[i] != null)
					model.setLaneCd(laneCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (thrpCostCdFlg[i] != null)
					model.setThrpCostCdFlg(thrpCostCdFlg[i]);
				if (tmlTrnsModCd[i] != null)
					model.setTmlTrnsModCd(tmlTrnsModCd[i]);
				if (agmtDtlRmk[i] != null)
					model.setAgmtDtlRmk(agmtDtlRmk[i]);
				if (tmlDysAplyTpCd[i] != null)
					model.setTmlDysAplyTpCd(tmlDysAplyTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fmTrDys[i] != null)
					model.setFmTrDys(fmTrDys[i]);
				if (tmlCntrStyCd[i] != null)
					model.setTmlCntrStyCd(tmlCntrStyCd[i]);
				if (dcgoAplyTpCd[i] != null)
					model.setDcgoAplyTpCd(dcgoAplyTpCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (tmlDyAplyTpCd[i] != null)
					model.setTmlDyAplyTpCd(tmlDyAplyTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (toTrVolVal[i] != null)
					model.setToTrVolVal(toTrVolVal[i]);
				if (tmlAgmtVerNo[i] != null)
					model.setTmlAgmtVerNo(tmlAgmtVerNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (thrpLgsCostCd[i] != null)
					model.setThrpLgsCostCd(thrpLgsCostCd[i]);
				if (fpCalcPrdCd[i] != null)
					model.setFpCalcPrdCd(fpCalcPrdCd[i]);
				if (cmncHrmnt[i] != null)
					model.setCmncHrmnt(cmncHrmnt[i]);
				if (tmlAgmtDtlSeq[i] != null)
					model.setTmlAgmtDtlSeq(tmlAgmtDtlSeq[i]);
				if (toTrDys[i] != null)
					model.setToTrDys(toTrDys[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmlStoAgmtTpCd[i] != null)
					model.setTmlStoAgmtTpCd(tmlStoAgmtTpCd[i]);
				if (thcTpCd[i] != null)
					model.setThcTpCd(thcTpCd[i]);
				if (tmlFreeDysTpCd[i] != null)
					model.setTmlFreeDysTpCd(tmlFreeDysTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (tmlAgmtTpCd[i] != null)
					model.setTmlAgmtTpCd(tmlAgmtTpCd[i]);
				if (tmlAgmtOfcCtyCd[i] != null)
					model.setTmlAgmtOfcCtyCd(tmlAgmtOfcCtyCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (fmTrVolVal[i] != null)
					model.setFmTrVolVal(fmTrVolVal[i]);
				if (tmlVolAplyTpCd[i] != null)
					model.setTmlVolAplyTpCd(tmlVolAplyTpCd[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (tmlOvtShftCd[i] != null)
					model.setTmlOvtShftCd(tmlOvtShftCd[i]);
				if (xcldDyAplyTpCd[i] != null)
					model.setXcldDyAplyTpCd(xcldDyAplyTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fpTeuQty[i] != null)
					model.setFpTeuQty(fpTeuQty[i]);
				if (ftDys[i] != null)
					model.setFtDys(ftDys[i]);
				if (tmpSavFlg[i] != null)
					model.setTmpSavFlg(tmpSavFlg[i]);
				if (agmtUtRt[i] != null)
					model.setAgmtUtRt(agmtUtRt[i]);
				if (tmlAgmtSeq[i] != null)
					model.setTmlAgmtSeq(tmlAgmtSeq[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (autoCalcFlg[i] != null)
					model.setAutoCalcFlg(autoCalcFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlAgmtDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlAgmtDtlVO[]
	 */
	public TesTmlAgmtDtlVO[] getTesTmlAgmtDtlVOs(){
		TesTmlAgmtDtlVO[] vos = (TesTmlAgmtDtlVO[])models.toArray(new TesTmlAgmtDtlVO[models.size()]);
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
		this.tmlAgmtVolUtCd = this.tmlAgmtVolUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneCd = this.laneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpCostCdFlg = this.thrpCostCdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrnsModCd = this.tmlTrnsModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtDtlRmk = this.agmtDtlRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlDysAplyTpCd = this.tmlDysAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrDys = this.fmTrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCntrStyCd = this.tmlCntrStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoAplyTpCd = this.dcgoAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlDyAplyTpCd = this.tmlDyAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrVolVal = this.toTrVolVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtVerNo = this.tmlAgmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpLgsCostCd = this.thrpLgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpCalcPrdCd = this.fpCalcPrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmncHrmnt = this.cmncHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtDtlSeq = this.tmlAgmtDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrDys = this.toTrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlStoAgmtTpCd = this.tmlStoAgmtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thcTpCd = this.thcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlFreeDysTpCd = this.tmlFreeDysTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtTpCd = this.tmlAgmtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtOfcCtyCd = this.tmlAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrVolVal = this.fmTrVolVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlVolAplyTpCd = this.tmlVolAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlOvtShftCd = this.tmlOvtShftCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldDyAplyTpCd = this.xcldDyAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpTeuQty = this.fpTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftDys = this.ftDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpSavFlg = this.tmpSavFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtUtRt = this.agmtUtRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtSeq = this.tmlAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoCalcFlg = this.autoCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
