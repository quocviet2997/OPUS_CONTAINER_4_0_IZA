/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgLgsSmryVO.java
*@FileTitle : CoaBkgLgsSmryVO
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

public class CoaBkgLgsSmryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgLgsSmryVO> models = new ArrayList<CoaBkgLgsSmryVO>();
	
	/* Column Info */
	private String void40ftQty = null;
	/* Column Info */
	private String fcntrTrspTrkDirAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fcntrTrspRailDirAmt = null;
	/* Column Info */
	private String costIoBndCd = null;
	/* Column Info */
	private String lgsKpiCd = null;
	/* Column Info */
	private String void20ftQty = null;
	/* Column Info */
	private String fcntrTrspWtrTrkAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String lgsKpiMnCd = null;
	/* Column Info */
	private String preCostActGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String miscCgoHndlAmt = null;
	/* Column Info */
	private String fcntrStvgTtlAmt = null;
	/* Column Info */
	private String bkgQty = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String costActGrpTpCd = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String fcntrStoAmt = null;
	/* Column Info */
	private String bzcStvgAmt = null;
	/* Column Info */
	private String fcntrTrspWtrDirAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fcntrTrspWtrRailAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fcntrTrspTtlAmt = null;
	/* Column Info */
	private String otrCyHndlAmt = null;
	/* Column Info */
	private String pstActGrpRcvTermCd = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String pstCostActGrpCd = null;
	/* Column Info */
	private String fcntrTrspRailTrkAmt = null;
	/* Column Info */
	private String tsStvgAmt = null;
	/* Column Info */
	private String n2ndNodCd = null;
	/* Column Info */
	private String cgoHndlAmt = null;
	/* Column Info */
	private String ctrlOfcCd = null;
	/* Column Info */
	private String dckCyHndlAmt = null;
	/* Column Info */
	private String preActGrpDeTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String n4thNodCd = null;
	/* Column Info */
	private String n1stNodCd = null;
	/* Column Info */
	private String tmlAmt = null;
	/* Column Info */
	private String miscFcntrTrspAmt = null;
	/* Column Info */
	private String n3rdNodCd = null;
	/* Column Info */
	private String sttlFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgLgsSmryVO() {}

	public CoaBkgLgsSmryVO(String ibflag, String pagerows, String bkgNo, String cntrTpszCd, String costActGrpCd, String sttlFlg, String n1stNodCd, String n2ndNodCd, String n3rdNodCd, String n4thNodCd, String ctrlOfcCd, String preCostActGrpCd, String pstCostActGrpCd, String preActGrpDeTermCd, String pstActGrpRcvTermCd, String rhqCd, String costActGrpTpCd, String costIoBndCd, String lgsKpiMnCd, String lgsKpiCd, String void20ftQty, String void40ftQty, String cntrQty, String bkgQty, String bzcStvgAmt, String otrCyHndlAmt, String tsStvgAmt, String dckCyHndlAmt, String cgoHndlAmt, String fcntrStoAmt, String miscCgoHndlAmt, String fcntrTrspRailDirAmt, String fcntrTrspRailTrkAmt, String fcntrTrspTrkDirAmt, String fcntrTrspWtrDirAmt, String fcntrTrspWtrRailAmt, String fcntrTrspWtrTrkAmt, String miscFcntrTrspAmt, String tmlAmt, String fcntrStvgTtlAmt, String fcntrTrspTtlAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.void40ftQty = void40ftQty;
		this.fcntrTrspTrkDirAmt = fcntrTrspTrkDirAmt;
		this.creDt = creDt;
		this.fcntrTrspRailDirAmt = fcntrTrspRailDirAmt;
		this.costIoBndCd = costIoBndCd;
		this.lgsKpiCd = lgsKpiCd;
		this.void20ftQty = void20ftQty;
		this.fcntrTrspWtrTrkAmt = fcntrTrspWtrTrkAmt;
		this.pagerows = pagerows;
		this.lgsKpiMnCd = lgsKpiMnCd;
		this.preCostActGrpCd = preCostActGrpCd;
		this.ibflag = ibflag;
		this.miscCgoHndlAmt = miscCgoHndlAmt;
		this.fcntrStvgTtlAmt = fcntrStvgTtlAmt;
		this.bkgQty = bkgQty;
		this.cntrTpszCd = cntrTpszCd;
		this.costActGrpTpCd = costActGrpTpCd;
		this.cntrQty = cntrQty;
		this.fcntrStoAmt = fcntrStoAmt;
		this.bzcStvgAmt = bzcStvgAmt;
		this.fcntrTrspWtrDirAmt = fcntrTrspWtrDirAmt;
		this.updUsrId = updUsrId;
		this.fcntrTrspWtrRailAmt = fcntrTrspWtrRailAmt;
		this.updDt = updDt;
		this.fcntrTrspTtlAmt = fcntrTrspTtlAmt;
		this.otrCyHndlAmt = otrCyHndlAmt;
		this.pstActGrpRcvTermCd = pstActGrpRcvTermCd;
		this.rhqCd = rhqCd;
		this.pstCostActGrpCd = pstCostActGrpCd;
		this.fcntrTrspRailTrkAmt = fcntrTrspRailTrkAmt;
		this.tsStvgAmt = tsStvgAmt;
		this.n2ndNodCd = n2ndNodCd;
		this.cgoHndlAmt = cgoHndlAmt;
		this.ctrlOfcCd = ctrlOfcCd;
		this.dckCyHndlAmt = dckCyHndlAmt;
		this.preActGrpDeTermCd = preActGrpDeTermCd;
		this.creUsrId = creUsrId;
		this.costActGrpCd = costActGrpCd;
		this.bkgNo = bkgNo;
		this.n4thNodCd = n4thNodCd;
		this.n1stNodCd = n1stNodCd;
		this.tmlAmt = tmlAmt;
		this.miscFcntrTrspAmt = miscFcntrTrspAmt;
		this.n3rdNodCd = n3rdNodCd;
		this.sttlFlg = sttlFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("void_40ft_qty", getVoid40ftQty());
		this.hashColumns.put("fcntr_trsp_trk_dir_amt", getFcntrTrspTrkDirAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fcntr_trsp_rail_dir_amt", getFcntrTrspRailDirAmt());
		this.hashColumns.put("cost_io_bnd_cd", getCostIoBndCd());
		this.hashColumns.put("lgs_kpi_cd", getLgsKpiCd());
		this.hashColumns.put("void_20ft_qty", getVoid20ftQty());
		this.hashColumns.put("fcntr_trsp_wtr_trk_amt", getFcntrTrspWtrTrkAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("lgs_kpi_mn_cd", getLgsKpiMnCd());
		this.hashColumns.put("pre_cost_act_grp_cd", getPreCostActGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("misc_cgo_hndl_amt", getMiscCgoHndlAmt());
		this.hashColumns.put("fcntr_stvg_ttl_amt", getFcntrStvgTtlAmt());
		this.hashColumns.put("bkg_qty", getBkgQty());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cost_act_grp_tp_cd", getCostActGrpTpCd());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("fcntr_sto_amt", getFcntrStoAmt());
		this.hashColumns.put("bzc_stvg_amt", getBzcStvgAmt());
		this.hashColumns.put("fcntr_trsp_wtr_dir_amt", getFcntrTrspWtrDirAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("fcntr_trsp_wtr_rail_amt", getFcntrTrspWtrRailAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fcntr_trsp_ttl_amt", getFcntrTrspTtlAmt());
		this.hashColumns.put("otr_cy_hndl_amt", getOtrCyHndlAmt());
		this.hashColumns.put("pst_act_grp_rcv_term_cd", getPstActGrpRcvTermCd());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("pst_cost_act_grp_cd", getPstCostActGrpCd());
		this.hashColumns.put("fcntr_trsp_rail_trk_amt", getFcntrTrspRailTrkAmt());
		this.hashColumns.put("ts_stvg_amt", getTsStvgAmt());
		this.hashColumns.put("n2nd_nod_cd", getN2ndNodCd());
		this.hashColumns.put("cgo_hndl_amt", getCgoHndlAmt());
		this.hashColumns.put("ctrl_ofc_cd", getCtrlOfcCd());
		this.hashColumns.put("dck_cy_hndl_amt", getDckCyHndlAmt());
		this.hashColumns.put("pre_act_grp_de_term_cd", getPreActGrpDeTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("n4th_nod_cd", getN4thNodCd());
		this.hashColumns.put("n1st_nod_cd", getN1stNodCd());
		this.hashColumns.put("tml_amt", getTmlAmt());
		this.hashColumns.put("misc_fcntr_trsp_amt", getMiscFcntrTrspAmt());
		this.hashColumns.put("n3rd_nod_cd", getN3rdNodCd());
		this.hashColumns.put("sttl_flg", getSttlFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("void_40ft_qty", "void40ftQty");
		this.hashFields.put("fcntr_trsp_trk_dir_amt", "fcntrTrspTrkDirAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fcntr_trsp_rail_dir_amt", "fcntrTrspRailDirAmt");
		this.hashFields.put("cost_io_bnd_cd", "costIoBndCd");
		this.hashFields.put("lgs_kpi_cd", "lgsKpiCd");
		this.hashFields.put("void_20ft_qty", "void20ftQty");
		this.hashFields.put("fcntr_trsp_wtr_trk_amt", "fcntrTrspWtrTrkAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("lgs_kpi_mn_cd", "lgsKpiMnCd");
		this.hashFields.put("pre_cost_act_grp_cd", "preCostActGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("misc_cgo_hndl_amt", "miscCgoHndlAmt");
		this.hashFields.put("fcntr_stvg_ttl_amt", "fcntrStvgTtlAmt");
		this.hashFields.put("bkg_qty", "bkgQty");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cost_act_grp_tp_cd", "costActGrpTpCd");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("fcntr_sto_amt", "fcntrStoAmt");
		this.hashFields.put("bzc_stvg_amt", "bzcStvgAmt");
		this.hashFields.put("fcntr_trsp_wtr_dir_amt", "fcntrTrspWtrDirAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("fcntr_trsp_wtr_rail_amt", "fcntrTrspWtrRailAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fcntr_trsp_ttl_amt", "fcntrTrspTtlAmt");
		this.hashFields.put("otr_cy_hndl_amt", "otrCyHndlAmt");
		this.hashFields.put("pst_act_grp_rcv_term_cd", "pstActGrpRcvTermCd");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("pst_cost_act_grp_cd", "pstCostActGrpCd");
		this.hashFields.put("fcntr_trsp_rail_trk_amt", "fcntrTrspRailTrkAmt");
		this.hashFields.put("ts_stvg_amt", "tsStvgAmt");
		this.hashFields.put("n2nd_nod_cd", "n2ndNodCd");
		this.hashFields.put("cgo_hndl_amt", "cgoHndlAmt");
		this.hashFields.put("ctrl_ofc_cd", "ctrlOfcCd");
		this.hashFields.put("dck_cy_hndl_amt", "dckCyHndlAmt");
		this.hashFields.put("pre_act_grp_de_term_cd", "preActGrpDeTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("n4th_nod_cd", "n4thNodCd");
		this.hashFields.put("n1st_nod_cd", "n1stNodCd");
		this.hashFields.put("tml_amt", "tmlAmt");
		this.hashFields.put("misc_fcntr_trsp_amt", "miscFcntrTrspAmt");
		this.hashFields.put("n3rd_nod_cd", "n3rdNodCd");
		this.hashFields.put("sttl_flg", "sttlFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return void40ftQty
	 */
	public String getVoid40ftQty() {
		return this.void40ftQty;
	}
	
	/**
	 * Column Info
	 * @return fcntrTrspTrkDirAmt
	 */
	public String getFcntrTrspTrkDirAmt() {
		return this.fcntrTrspTrkDirAmt;
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
	 * @return fcntrTrspRailDirAmt
	 */
	public String getFcntrTrspRailDirAmt() {
		return this.fcntrTrspRailDirAmt;
	}
	
	/**
	 * Column Info
	 * @return costIoBndCd
	 */
	public String getCostIoBndCd() {
		return this.costIoBndCd;
	}
	
	/**
	 * Column Info
	 * @return lgsKpiCd
	 */
	public String getLgsKpiCd() {
		return this.lgsKpiCd;
	}
	
	/**
	 * Column Info
	 * @return void20ftQty
	 */
	public String getVoid20ftQty() {
		return this.void20ftQty;
	}
	
	/**
	 * Column Info
	 * @return fcntrTrspWtrTrkAmt
	 */
	public String getFcntrTrspWtrTrkAmt() {
		return this.fcntrTrspWtrTrkAmt;
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
	 * @return lgsKpiMnCd
	 */
	public String getLgsKpiMnCd() {
		return this.lgsKpiMnCd;
	}
	
	/**
	 * Column Info
	 * @return preCostActGrpCd
	 */
	public String getPreCostActGrpCd() {
		return this.preCostActGrpCd;
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
	 * @return miscCgoHndlAmt
	 */
	public String getMiscCgoHndlAmt() {
		return this.miscCgoHndlAmt;
	}
	
	/**
	 * Column Info
	 * @return fcntrStvgTtlAmt
	 */
	public String getFcntrStvgTtlAmt() {
		return this.fcntrStvgTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgQty
	 */
	public String getBkgQty() {
		return this.bkgQty;
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
	 * @return costActGrpTpCd
	 */
	public String getCostActGrpTpCd() {
		return this.costActGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrQty
	 */
	public String getCntrQty() {
		return this.cntrQty;
	}
	
	/**
	 * Column Info
	 * @return fcntrStoAmt
	 */
	public String getFcntrStoAmt() {
		return this.fcntrStoAmt;
	}
	
	/**
	 * Column Info
	 * @return bzcStvgAmt
	 */
	public String getBzcStvgAmt() {
		return this.bzcStvgAmt;
	}
	
	/**
	 * Column Info
	 * @return fcntrTrspWtrDirAmt
	 */
	public String getFcntrTrspWtrDirAmt() {
		return this.fcntrTrspWtrDirAmt;
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
	 * @return fcntrTrspWtrRailAmt
	 */
	public String getFcntrTrspWtrRailAmt() {
		return this.fcntrTrspWtrRailAmt;
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
	 * @return fcntrTrspTtlAmt
	 */
	public String getFcntrTrspTtlAmt() {
		return this.fcntrTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return otrCyHndlAmt
	 */
	public String getOtrCyHndlAmt() {
		return this.otrCyHndlAmt;
	}
	
	/**
	 * Column Info
	 * @return pstActGrpRcvTermCd
	 */
	public String getPstActGrpRcvTermCd() {
		return this.pstActGrpRcvTermCd;
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
	 * @return pstCostActGrpCd
	 */
	public String getPstCostActGrpCd() {
		return this.pstCostActGrpCd;
	}
	
	/**
	 * Column Info
	 * @return fcntrTrspRailTrkAmt
	 */
	public String getFcntrTrspRailTrkAmt() {
		return this.fcntrTrspRailTrkAmt;
	}
	
	/**
	 * Column Info
	 * @return tsStvgAmt
	 */
	public String getTsStvgAmt() {
		return this.tsStvgAmt;
	}
	
	/**
	 * Column Info
	 * @return n2ndNodCd
	 */
	public String getN2ndNodCd() {
		return this.n2ndNodCd;
	}
	
	/**
	 * Column Info
	 * @return cgoHndlAmt
	 */
	public String getCgoHndlAmt() {
		return this.cgoHndlAmt;
	}
	
	/**
	 * Column Info
	 * @return ctrlOfcCd
	 */
	public String getCtrlOfcCd() {
		return this.ctrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return dckCyHndlAmt
	 */
	public String getDckCyHndlAmt() {
		return this.dckCyHndlAmt;
	}
	
	/**
	 * Column Info
	 * @return preActGrpDeTermCd
	 */
	public String getPreActGrpDeTermCd() {
		return this.preActGrpDeTermCd;
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
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return n4thNodCd
	 */
	public String getN4thNodCd() {
		return this.n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @return n1stNodCd
	 */
	public String getN1stNodCd() {
		return this.n1stNodCd;
	}
	
	/**
	 * Column Info
	 * @return tmlAmt
	 */
	public String getTmlAmt() {
		return this.tmlAmt;
	}
	
	/**
	 * Column Info
	 * @return miscFcntrTrspAmt
	 */
	public String getMiscFcntrTrspAmt() {
		return this.miscFcntrTrspAmt;
	}
	
	/**
	 * Column Info
	 * @return n3rdNodCd
	 */
	public String getN3rdNodCd() {
		return this.n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @return sttlFlg
	 */
	public String getSttlFlg() {
		return this.sttlFlg;
	}
	

	/**
	 * Column Info
	 * @param void40ftQty
	 */
	public void setVoid40ftQty(String void40ftQty) {
		this.void40ftQty = void40ftQty;
	}
	
	/**
	 * Column Info
	 * @param fcntrTrspTrkDirAmt
	 */
	public void setFcntrTrspTrkDirAmt(String fcntrTrspTrkDirAmt) {
		this.fcntrTrspTrkDirAmt = fcntrTrspTrkDirAmt;
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
	 * @param fcntrTrspRailDirAmt
	 */
	public void setFcntrTrspRailDirAmt(String fcntrTrspRailDirAmt) {
		this.fcntrTrspRailDirAmt = fcntrTrspRailDirAmt;
	}
	
	/**
	 * Column Info
	 * @param costIoBndCd
	 */
	public void setCostIoBndCd(String costIoBndCd) {
		this.costIoBndCd = costIoBndCd;
	}
	
	/**
	 * Column Info
	 * @param lgsKpiCd
	 */
	public void setLgsKpiCd(String lgsKpiCd) {
		this.lgsKpiCd = lgsKpiCd;
	}
	
	/**
	 * Column Info
	 * @param void20ftQty
	 */
	public void setVoid20ftQty(String void20ftQty) {
		this.void20ftQty = void20ftQty;
	}
	
	/**
	 * Column Info
	 * @param fcntrTrspWtrTrkAmt
	 */
	public void setFcntrTrspWtrTrkAmt(String fcntrTrspWtrTrkAmt) {
		this.fcntrTrspWtrTrkAmt = fcntrTrspWtrTrkAmt;
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
	 * @param lgsKpiMnCd
	 */
	public void setLgsKpiMnCd(String lgsKpiMnCd) {
		this.lgsKpiMnCd = lgsKpiMnCd;
	}
	
	/**
	 * Column Info
	 * @param preCostActGrpCd
	 */
	public void setPreCostActGrpCd(String preCostActGrpCd) {
		this.preCostActGrpCd = preCostActGrpCd;
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
	 * @param miscCgoHndlAmt
	 */
	public void setMiscCgoHndlAmt(String miscCgoHndlAmt) {
		this.miscCgoHndlAmt = miscCgoHndlAmt;
	}
	
	/**
	 * Column Info
	 * @param fcntrStvgTtlAmt
	 */
	public void setFcntrStvgTtlAmt(String fcntrStvgTtlAmt) {
		this.fcntrStvgTtlAmt = fcntrStvgTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgQty
	 */
	public void setBkgQty(String bkgQty) {
		this.bkgQty = bkgQty;
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
	 * @param costActGrpTpCd
	 */
	public void setCostActGrpTpCd(String costActGrpTpCd) {
		this.costActGrpTpCd = costActGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrQty
	 */
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
	}
	
	/**
	 * Column Info
	 * @param fcntrStoAmt
	 */
	public void setFcntrStoAmt(String fcntrStoAmt) {
		this.fcntrStoAmt = fcntrStoAmt;
	}
	
	/**
	 * Column Info
	 * @param bzcStvgAmt
	 */
	public void setBzcStvgAmt(String bzcStvgAmt) {
		this.bzcStvgAmt = bzcStvgAmt;
	}
	
	/**
	 * Column Info
	 * @param fcntrTrspWtrDirAmt
	 */
	public void setFcntrTrspWtrDirAmt(String fcntrTrspWtrDirAmt) {
		this.fcntrTrspWtrDirAmt = fcntrTrspWtrDirAmt;
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
	 * @param fcntrTrspWtrRailAmt
	 */
	public void setFcntrTrspWtrRailAmt(String fcntrTrspWtrRailAmt) {
		this.fcntrTrspWtrRailAmt = fcntrTrspWtrRailAmt;
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
	 * @param fcntrTrspTtlAmt
	 */
	public void setFcntrTrspTtlAmt(String fcntrTrspTtlAmt) {
		this.fcntrTrspTtlAmt = fcntrTrspTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param otrCyHndlAmt
	 */
	public void setOtrCyHndlAmt(String otrCyHndlAmt) {
		this.otrCyHndlAmt = otrCyHndlAmt;
	}
	
	/**
	 * Column Info
	 * @param pstActGrpRcvTermCd
	 */
	public void setPstActGrpRcvTermCd(String pstActGrpRcvTermCd) {
		this.pstActGrpRcvTermCd = pstActGrpRcvTermCd;
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
	 * @param pstCostActGrpCd
	 */
	public void setPstCostActGrpCd(String pstCostActGrpCd) {
		this.pstCostActGrpCd = pstCostActGrpCd;
	}
	
	/**
	 * Column Info
	 * @param fcntrTrspRailTrkAmt
	 */
	public void setFcntrTrspRailTrkAmt(String fcntrTrspRailTrkAmt) {
		this.fcntrTrspRailTrkAmt = fcntrTrspRailTrkAmt;
	}
	
	/**
	 * Column Info
	 * @param tsStvgAmt
	 */
	public void setTsStvgAmt(String tsStvgAmt) {
		this.tsStvgAmt = tsStvgAmt;
	}
	
	/**
	 * Column Info
	 * @param n2ndNodCd
	 */
	public void setN2ndNodCd(String n2ndNodCd) {
		this.n2ndNodCd = n2ndNodCd;
	}
	
	/**
	 * Column Info
	 * @param cgoHndlAmt
	 */
	public void setCgoHndlAmt(String cgoHndlAmt) {
		this.cgoHndlAmt = cgoHndlAmt;
	}
	
	/**
	 * Column Info
	 * @param ctrlOfcCd
	 */
	public void setCtrlOfcCd(String ctrlOfcCd) {
		this.ctrlOfcCd = ctrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param dckCyHndlAmt
	 */
	public void setDckCyHndlAmt(String dckCyHndlAmt) {
		this.dckCyHndlAmt = dckCyHndlAmt;
	}
	
	/**
	 * Column Info
	 * @param preActGrpDeTermCd
	 */
	public void setPreActGrpDeTermCd(String preActGrpDeTermCd) {
		this.preActGrpDeTermCd = preActGrpDeTermCd;
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
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param n4thNodCd
	 */
	public void setN4thNodCd(String n4thNodCd) {
		this.n4thNodCd = n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @param n1stNodCd
	 */
	public void setN1stNodCd(String n1stNodCd) {
		this.n1stNodCd = n1stNodCd;
	}
	
	/**
	 * Column Info
	 * @param tmlAmt
	 */
	public void setTmlAmt(String tmlAmt) {
		this.tmlAmt = tmlAmt;
	}
	
	/**
	 * Column Info
	 * @param miscFcntrTrspAmt
	 */
	public void setMiscFcntrTrspAmt(String miscFcntrTrspAmt) {
		this.miscFcntrTrspAmt = miscFcntrTrspAmt;
	}
	
	/**
	 * Column Info
	 * @param n3rdNodCd
	 */
	public void setN3rdNodCd(String n3rdNodCd) {
		this.n3rdNodCd = n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @param sttlFlg
	 */
	public void setSttlFlg(String sttlFlg) {
		this.sttlFlg = sttlFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVoid40ftQty(JSPUtil.getParameter(request, "void_40ft_qty", ""));
		setFcntrTrspTrkDirAmt(JSPUtil.getParameter(request, "fcntr_trsp_trk_dir_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFcntrTrspRailDirAmt(JSPUtil.getParameter(request, "fcntr_trsp_rail_dir_amt", ""));
		setCostIoBndCd(JSPUtil.getParameter(request, "cost_io_bnd_cd", ""));
		setLgsKpiCd(JSPUtil.getParameter(request, "lgs_kpi_cd", ""));
		setVoid20ftQty(JSPUtil.getParameter(request, "void_20ft_qty", ""));
		setFcntrTrspWtrTrkAmt(JSPUtil.getParameter(request, "fcntr_trsp_wtr_trk_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setLgsKpiMnCd(JSPUtil.getParameter(request, "lgs_kpi_mn_cd", ""));
		setPreCostActGrpCd(JSPUtil.getParameter(request, "pre_cost_act_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMiscCgoHndlAmt(JSPUtil.getParameter(request, "misc_cgo_hndl_amt", ""));
		setFcntrStvgTtlAmt(JSPUtil.getParameter(request, "fcntr_stvg_ttl_amt", ""));
		setBkgQty(JSPUtil.getParameter(request, "bkg_qty", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCostActGrpTpCd(JSPUtil.getParameter(request, "cost_act_grp_tp_cd", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setFcntrStoAmt(JSPUtil.getParameter(request, "fcntr_sto_amt", ""));
		setBzcStvgAmt(JSPUtil.getParameter(request, "bzc_stvg_amt", ""));
		setFcntrTrspWtrDirAmt(JSPUtil.getParameter(request, "fcntr_trsp_wtr_dir_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFcntrTrspWtrRailAmt(JSPUtil.getParameter(request, "fcntr_trsp_wtr_rail_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFcntrTrspTtlAmt(JSPUtil.getParameter(request, "fcntr_trsp_ttl_amt", ""));
		setOtrCyHndlAmt(JSPUtil.getParameter(request, "otr_cy_hndl_amt", ""));
		setPstActGrpRcvTermCd(JSPUtil.getParameter(request, "pst_act_grp_rcv_term_cd", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setPstCostActGrpCd(JSPUtil.getParameter(request, "pst_cost_act_grp_cd", ""));
		setFcntrTrspRailTrkAmt(JSPUtil.getParameter(request, "fcntr_trsp_rail_trk_amt", ""));
		setTsStvgAmt(JSPUtil.getParameter(request, "ts_stvg_amt", ""));
		setN2ndNodCd(JSPUtil.getParameter(request, "n2nd_nod_cd", ""));
		setCgoHndlAmt(JSPUtil.getParameter(request, "cgo_hndl_amt", ""));
		setCtrlOfcCd(JSPUtil.getParameter(request, "ctrl_ofc_cd", ""));
		setDckCyHndlAmt(JSPUtil.getParameter(request, "dck_cy_hndl_amt", ""));
		setPreActGrpDeTermCd(JSPUtil.getParameter(request, "pre_act_grp_de_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setN4thNodCd(JSPUtil.getParameter(request, "n4th_nod_cd", ""));
		setN1stNodCd(JSPUtil.getParameter(request, "n1st_nod_cd", ""));
		setTmlAmt(JSPUtil.getParameter(request, "tml_amt", ""));
		setMiscFcntrTrspAmt(JSPUtil.getParameter(request, "misc_fcntr_trsp_amt", ""));
		setN3rdNodCd(JSPUtil.getParameter(request, "n3rd_nod_cd", ""));
		setSttlFlg(JSPUtil.getParameter(request, "sttl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgLgsSmryVO[]
	 */
	public CoaBkgLgsSmryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgLgsSmryVO[]
	 */
	public CoaBkgLgsSmryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgLgsSmryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] void40ftQty = (JSPUtil.getParameter(request, prefix	+ "void_40ft_qty", length));
			String[] fcntrTrspTrkDirAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_trk_dir_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fcntrTrspRailDirAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_rail_dir_amt", length));
			String[] costIoBndCd = (JSPUtil.getParameter(request, prefix	+ "cost_io_bnd_cd", length));
			String[] lgsKpiCd = (JSPUtil.getParameter(request, prefix	+ "lgs_kpi_cd", length));
			String[] void20ftQty = (JSPUtil.getParameter(request, prefix	+ "void_20ft_qty", length));
			String[] fcntrTrspWtrTrkAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_wtr_trk_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] lgsKpiMnCd = (JSPUtil.getParameter(request, prefix	+ "lgs_kpi_mn_cd", length));
			String[] preCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pre_cost_act_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] miscCgoHndlAmt = (JSPUtil.getParameter(request, prefix	+ "misc_cgo_hndl_amt", length));
			String[] fcntrStvgTtlAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_stvg_ttl_amt", length));
			String[] bkgQty = (JSPUtil.getParameter(request, prefix	+ "bkg_qty", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] costActGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_tp_cd", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] fcntrStoAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_sto_amt", length));
			String[] bzcStvgAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_stvg_amt", length));
			String[] fcntrTrspWtrDirAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_wtr_dir_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fcntrTrspWtrRailAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_wtr_rail_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fcntrTrspTtlAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_ttl_amt", length));
			String[] otrCyHndlAmt = (JSPUtil.getParameter(request, prefix	+ "otr_cy_hndl_amt", length));
			String[] pstActGrpRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "pst_act_grp_rcv_term_cd", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] pstCostActGrpCd = (JSPUtil.getParameter(request, prefix	+ "pst_cost_act_grp_cd", length));
			String[] fcntrTrspRailTrkAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_trsp_rail_trk_amt", length));
			String[] tsStvgAmt = (JSPUtil.getParameter(request, prefix	+ "ts_stvg_amt", length));
			String[] n2ndNodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_nod_cd", length));
			String[] cgoHndlAmt = (JSPUtil.getParameter(request, prefix	+ "cgo_hndl_amt", length));
			String[] ctrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrl_ofc_cd", length));
			String[] dckCyHndlAmt = (JSPUtil.getParameter(request, prefix	+ "dck_cy_hndl_amt", length));
			String[] preActGrpDeTermCd = (JSPUtil.getParameter(request, prefix	+ "pre_act_grp_de_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] n4thNodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_nod_cd", length));
			String[] n1stNodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_cd", length));
			String[] tmlAmt = (JSPUtil.getParameter(request, prefix	+ "tml_amt", length));
			String[] miscFcntrTrspAmt = (JSPUtil.getParameter(request, prefix	+ "misc_fcntr_trsp_amt", length));
			String[] n3rdNodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_nod_cd", length));
			String[] sttlFlg = (JSPUtil.getParameter(request, prefix	+ "sttl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgLgsSmryVO();
				if (void40ftQty[i] != null)
					model.setVoid40ftQty(void40ftQty[i]);
				if (fcntrTrspTrkDirAmt[i] != null)
					model.setFcntrTrspTrkDirAmt(fcntrTrspTrkDirAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fcntrTrspRailDirAmt[i] != null)
					model.setFcntrTrspRailDirAmt(fcntrTrspRailDirAmt[i]);
				if (costIoBndCd[i] != null)
					model.setCostIoBndCd(costIoBndCd[i]);
				if (lgsKpiCd[i] != null)
					model.setLgsKpiCd(lgsKpiCd[i]);
				if (void20ftQty[i] != null)
					model.setVoid20ftQty(void20ftQty[i]);
				if (fcntrTrspWtrTrkAmt[i] != null)
					model.setFcntrTrspWtrTrkAmt(fcntrTrspWtrTrkAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (lgsKpiMnCd[i] != null)
					model.setLgsKpiMnCd(lgsKpiMnCd[i]);
				if (preCostActGrpCd[i] != null)
					model.setPreCostActGrpCd(preCostActGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (miscCgoHndlAmt[i] != null)
					model.setMiscCgoHndlAmt(miscCgoHndlAmt[i]);
				if (fcntrStvgTtlAmt[i] != null)
					model.setFcntrStvgTtlAmt(fcntrStvgTtlAmt[i]);
				if (bkgQty[i] != null)
					model.setBkgQty(bkgQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (costActGrpTpCd[i] != null)
					model.setCostActGrpTpCd(costActGrpTpCd[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (fcntrStoAmt[i] != null)
					model.setFcntrStoAmt(fcntrStoAmt[i]);
				if (bzcStvgAmt[i] != null)
					model.setBzcStvgAmt(bzcStvgAmt[i]);
				if (fcntrTrspWtrDirAmt[i] != null)
					model.setFcntrTrspWtrDirAmt(fcntrTrspWtrDirAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fcntrTrspWtrRailAmt[i] != null)
					model.setFcntrTrspWtrRailAmt(fcntrTrspWtrRailAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fcntrTrspTtlAmt[i] != null)
					model.setFcntrTrspTtlAmt(fcntrTrspTtlAmt[i]);
				if (otrCyHndlAmt[i] != null)
					model.setOtrCyHndlAmt(otrCyHndlAmt[i]);
				if (pstActGrpRcvTermCd[i] != null)
					model.setPstActGrpRcvTermCd(pstActGrpRcvTermCd[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (pstCostActGrpCd[i] != null)
					model.setPstCostActGrpCd(pstCostActGrpCd[i]);
				if (fcntrTrspRailTrkAmt[i] != null)
					model.setFcntrTrspRailTrkAmt(fcntrTrspRailTrkAmt[i]);
				if (tsStvgAmt[i] != null)
					model.setTsStvgAmt(tsStvgAmt[i]);
				if (n2ndNodCd[i] != null)
					model.setN2ndNodCd(n2ndNodCd[i]);
				if (cgoHndlAmt[i] != null)
					model.setCgoHndlAmt(cgoHndlAmt[i]);
				if (ctrlOfcCd[i] != null)
					model.setCtrlOfcCd(ctrlOfcCd[i]);
				if (dckCyHndlAmt[i] != null)
					model.setDckCyHndlAmt(dckCyHndlAmt[i]);
				if (preActGrpDeTermCd[i] != null)
					model.setPreActGrpDeTermCd(preActGrpDeTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (n4thNodCd[i] != null)
					model.setN4thNodCd(n4thNodCd[i]);
				if (n1stNodCd[i] != null)
					model.setN1stNodCd(n1stNodCd[i]);
				if (tmlAmt[i] != null)
					model.setTmlAmt(tmlAmt[i]);
				if (miscFcntrTrspAmt[i] != null)
					model.setMiscFcntrTrspAmt(miscFcntrTrspAmt[i]);
				if (n3rdNodCd[i] != null)
					model.setN3rdNodCd(n3rdNodCd[i]);
				if (sttlFlg[i] != null)
					model.setSttlFlg(sttlFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgLgsSmryVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgLgsSmryVO[]
	 */
	public CoaBkgLgsSmryVO[] getCoaBkgLgsSmryVOs(){
		CoaBkgLgsSmryVO[] vos = (CoaBkgLgsSmryVO[])models.toArray(new CoaBkgLgsSmryVO[models.size()]);
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
		this.void40ftQty = this.void40ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspTrkDirAmt = this.fcntrTrspTrkDirAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspRailDirAmt = this.fcntrTrspRailDirAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIoBndCd = this.costIoBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsKpiCd = this.lgsKpiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.void20ftQty = this.void20ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspWtrTrkAmt = this.fcntrTrspWtrTrkAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsKpiMnCd = this.lgsKpiMnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCostActGrpCd = this.preCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.miscCgoHndlAmt = this.miscCgoHndlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrStvgTtlAmt = this.fcntrStvgTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgQty = this.bkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpTpCd = this.costActGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrStoAmt = this.fcntrStoAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcStvgAmt = this.bzcStvgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspWtrDirAmt = this.fcntrTrspWtrDirAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspWtrRailAmt = this.fcntrTrspWtrRailAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspTtlAmt = this.fcntrTrspTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCyHndlAmt = this.otrCyHndlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstActGrpRcvTermCd = this.pstActGrpRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstCostActGrpCd = this.pstCostActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrTrspRailTrkAmt = this.fcntrTrspRailTrkAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsStvgAmt = this.tsStvgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNodCd = this.n2ndNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoHndlAmt = this.cgoHndlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlOfcCd = this.ctrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dckCyHndlAmt = this.dckCyHndlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preActGrpDeTermCd = this.preActGrpDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNodCd = this.n4thNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodCd = this.n1stNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAmt = this.tmlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.miscFcntrTrspAmt = this.miscFcntrTrspAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNodCd = this.n3rdNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sttlFlg = this.sttlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
