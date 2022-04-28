/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskSwapCstPortVO.java
*@FileTitle : VskSwapCstPortVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.24
*@LastModifier : 정진우
*@LastVersion : 1.0
* 2009.12.24 정진우 
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
 * @author 정진우
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class VskSwapCstPortVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<VskSwapCstPortVO> models = new ArrayList<VskSwapCstPortVO>();

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String ofcInpFlg = null;

    /* Column Info */
    private String ts20ftTtlQty = null;

    /* Column Info */
    private String lnkSpd = null;

    /* Column Info */
    private String seaBufHrs = null;

    /* Column Info */
    private String addBnkCsmQty = null;

    /* Column Info */
    private String plismVoyNo = null;

    /* Column Info */
    private String simNo = null;

    /* Column Info */
    private String portBufHrs = null;

    /* Column Info */
    private String turnSkdVoyNo = null;

    /* Column Info */
    private String tztmHrs = null;

    /* Column Info */
    private String initSkdInpFlg = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String ts40ftTtlAmt = null;

    /* Column Info */
    private String portWrkHrs = null;

    /* Column Info */
    private String turnPortIndCd = null;

    /* Column Info */
    private String peUsdTtlAmt = null;

    /* Column Info */
    private String vpsPortCd = null;

    /* Column Info */
    private String clptSeq = null;

    /* Column Info */
    private String skdBrthNo = null;

    /* Column Info */
    private String tmlHndl40ftTtlQty = null;

    /* Column Info */
    private String tmlHndl40ftTtlAmt = null;

    /* Column Info */
    private String noonRptInpFlg = null;

    /* Column Info */
    private String portSkdStsCd = null;

    /* Column Info */
    private String vslDlayRsnDesc = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String initEtaDt = null;

    /* Column Info */
    private String shpCallNoUpdUsrId = null;

    /* Column Info */
    private String lnkDist = null;

    /* Column Info */
    private String vpsEtdDt = null;

    /* Column Info */
    private String initEtbDt = null;

    /* Column Info */
    private String obCgoQty = null;

    /* Column Info */
    private String portSkpRsnCd = null;

    /* Column Info */
    private String plismYdCd = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String vpsLocCd = null;

    /* Column Info */
    private String tgtPortFlg = null;

    /* Column Info */
    private String tmlVslCd = null;

    /* Column Info */
    private String autoSkdCngFlg = null;

    /* Column Info */
    private String initEtdDt = null;

    /* Column Info */
    private String tmlHndl20ftTtlAmt = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String skdCngStsCd = null;

    /* Column Info */
    private String shpCallNoUpdDt = null;

    /* Column Info */
    private String usrHdnFlg = null;

    /* Column Info */
    private String turnClptIndSeq = null;

    /* Column Info */
    private String usdFlg = null;

    /* Column Info */
    private String mnvrOutHrs = null;

    /* Column Info */
    private String vpsEtbDt = null;

    /* Column Info */
    private String vpsRmk = null;

    /* Column Info */
    private String turnPortFlg = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String simDt = null;

    /* Column Info */
    private String phsIoRsnCd = null;

    /* Column Info */
    private String maxSpdEstmDepDt = null;

    /* Column Info */
    private String tmlProdQty = null;

    /* Column Info */
    private String tmlHndl20ftTtlQty = null;

    /* Column Info */
    private String vpsEtaDt = null;

    /* Column Info */
    private String turnSkdDirCd = null;

    /* Column Info */
    private String addBnkCostAmt = null;

    /* Column Info */
    private String portSkpTpCd = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String crnKnt = null;

    /* Column Info */
    private String tdHrs = null;

    /* Column Info */
    private String vslDlayRsnCd = null;

    /* Column Info */
    private String tmlVoyNo = null;

    /* Column Info */
    private String callYdIndSeq = null;

    /* Column Info */
    private String ts20ftTtlAmt = null;

    /* Column Info */
    private String plismVslCd = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String shpCallNo = null;

    /* Column Info */
    private String nxtSlanCd = null;

    /* Column Info */
    private String tsPortCd = null;

    /* Column Info */
    private String prtChkFlg = null;

    /* Column Info */
    private String pfEtdDt = null;

    /* Column Info */
    private String ttlDlayHrs = null;

    /* Column Info */
    private String ftDt = null;

    /* Column Info */
    private String maxSpdEstmBrthDt = null;

    /* Column Info */
    private String portSkpRsnOffrRmk = null;

    /* Column Info */
    private String pfEtaDt = null;

    /* Column Info */
    private String phsIoRmk = null;

    /* Column Info */
    private String pfEtbDt = null;

    /* Column Info */
    private String actInpFlg = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String mnvrInHrs = null;

    /* Column Info */
    private String slanCd = null;

    /* Column Info */
    private String ydCd = null;

    /* Column Info */
    private String ibCgoQty = null;

    /* Column Info */
    private String clptIndSeq = null;

    /* Column Info */
    private String depRptInpFlg = null;

    /* Column Info */
    private String ts40ftTtlQty = null;

    /* Column Info */
    private String oneWayDir = null;

    /* Column Info */
    private String mrgFlg = null;

    /* Column Info */
    private String vpsAddRmk = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public VskSwapCstPortVO() {
    }

    public VskSwapCstPortVO(String ibflag, String pagerows, String simDt, String simNo, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String clptIndSeq, String clptSeq, String slanCd, String portSkdStsCd, String ydCd, String callYdIndSeq, String pfEtaDt, String pfEtbDt, String pfEtdDt, String initEtaDt, String initEtbDt, String initEtdDt, String vpsEtaDt, String vpsEtbDt, String vpsEtdDt, String vslDlayRsnCd, String vslDlayRsnDesc, String vpsLocCd, String shpCallNo, String shpCallNoUpdUsrId, String shpCallNoUpdDt, String tmlVslCd, String tmlVoyNo, String ftDt, String plismYdCd, String plismVslCd, String plismVoyNo, String skdCngStsCd, String turnPortFlg, String turnPortIndCd, String turnSkdVoyNo, String turnSkdDirCd, String turnClptIndSeq, String ibCgoQty, String obCgoQty, String vpsRmk, String phsIoRsnCd, String phsIoRmk, String skdBrthNo, String initSkdInpFlg, String ofcInpFlg, String noonRptInpFlg, String depRptInpFlg, String actInpFlg, String prtChkFlg, String portSkpTpCd, String portSkpRsnCd, String portSkpRsnOffrRmk, String ttlDlayHrs, String tsPortCd, String usdFlg, String autoSkdCngFlg, String lnkDist, String lnkSpd, String tztmHrs, String tdHrs, String mnvrInHrs, String mnvrOutHrs, String tmlProdQty, String crnKnt, String portWrkHrs, String seaBufHrs, String portBufHrs, String addBnkCsmQty, String addBnkCostAmt, String ts20ftTtlQty, String ts40ftTtlQty, String ts20ftTtlAmt, String ts40ftTtlAmt, String tmlHndl20ftTtlQty, String tmlHndl40ftTtlQty, String tmlHndl20ftTtlAmt, String tmlHndl40ftTtlAmt, String peUsdTtlAmt, String tgtPortFlg, String nxtSlanCd, String maxSpdEstmBrthDt, String maxSpdEstmDepDt, String usrHdnFlg, String creUsrId, String creDt, String updUsrId, String updDt, String oneWayDir, String mrgFlg, String vpsAddRmk) {
        this.vslCd = vslCd;
        this.ofcInpFlg = ofcInpFlg;
        this.ts20ftTtlQty = ts20ftTtlQty;
        this.lnkSpd = lnkSpd;
        this.seaBufHrs = seaBufHrs;
        this.addBnkCsmQty = addBnkCsmQty;
        this.plismVoyNo = plismVoyNo;
        this.simNo = simNo;
        this.portBufHrs = portBufHrs;
        this.turnSkdVoyNo = turnSkdVoyNo;
        this.tztmHrs = tztmHrs;
        this.initSkdInpFlg = initSkdInpFlg;
        this.pagerows = pagerows;
        this.ts40ftTtlAmt = ts40ftTtlAmt;
        this.portWrkHrs = portWrkHrs;
        this.turnPortIndCd = turnPortIndCd;
        this.peUsdTtlAmt = peUsdTtlAmt;
        this.vpsPortCd = vpsPortCd;
        this.clptSeq = clptSeq;
        this.skdBrthNo = skdBrthNo;
        this.tmlHndl40ftTtlQty = tmlHndl40ftTtlQty;
        this.tmlHndl40ftTtlAmt = tmlHndl40ftTtlAmt;
        this.noonRptInpFlg = noonRptInpFlg;
        this.portSkdStsCd = portSkdStsCd;
        this.vslDlayRsnDesc = vslDlayRsnDesc;
        this.updUsrId = updUsrId;
        this.initEtaDt = initEtaDt;
        this.shpCallNoUpdUsrId = shpCallNoUpdUsrId;
        this.lnkDist = lnkDist;
        this.vpsEtdDt = vpsEtdDt;
        this.initEtbDt = initEtbDt;
        this.obCgoQty = obCgoQty;
        this.portSkpRsnCd = portSkpRsnCd;
        this.plismYdCd = plismYdCd;
        this.skdVoyNo = skdVoyNo;
        this.vpsLocCd = vpsLocCd;
        this.tgtPortFlg = tgtPortFlg;
        this.tmlVslCd = tmlVslCd;
        this.autoSkdCngFlg = autoSkdCngFlg;
        this.initEtdDt = initEtdDt;
        this.tmlHndl20ftTtlAmt = tmlHndl20ftTtlAmt;
        this.creUsrId = creUsrId;
        this.skdCngStsCd = skdCngStsCd;
        this.shpCallNoUpdDt = shpCallNoUpdDt;
        this.usrHdnFlg = usrHdnFlg;
        this.turnClptIndSeq = turnClptIndSeq;
        this.usdFlg = usdFlg;
        this.mnvrOutHrs = mnvrOutHrs;
        this.vpsEtbDt = vpsEtbDt;
        this.vpsRmk = vpsRmk;
        this.turnPortFlg = turnPortFlg;
        this.creDt = creDt;
        this.simDt = simDt;
        this.phsIoRsnCd = phsIoRsnCd;
        this.maxSpdEstmDepDt = maxSpdEstmDepDt;
        this.tmlProdQty = tmlProdQty;
        this.tmlHndl20ftTtlQty = tmlHndl20ftTtlQty;
        this.vpsEtaDt = vpsEtaDt;
        this.turnSkdDirCd = turnSkdDirCd;
        this.addBnkCostAmt = addBnkCostAmt;
        this.portSkpTpCd = portSkpTpCd;
        this.ibflag = ibflag;
        this.crnKnt = crnKnt;
        this.tdHrs = tdHrs;
        this.vslDlayRsnCd = vslDlayRsnCd;
        this.tmlVoyNo = tmlVoyNo;
        this.callYdIndSeq = callYdIndSeq;
        this.ts20ftTtlAmt = ts20ftTtlAmt;
        this.plismVslCd = plismVslCd;
        this.updDt = updDt;
        this.shpCallNo = shpCallNo;
        this.nxtSlanCd = nxtSlanCd;
        this.tsPortCd = tsPortCd;
        this.prtChkFlg = prtChkFlg;
        this.pfEtdDt = pfEtdDt;
        this.ttlDlayHrs = ttlDlayHrs;
        this.ftDt = ftDt;
        this.maxSpdEstmBrthDt = maxSpdEstmBrthDt;
        this.portSkpRsnOffrRmk = portSkpRsnOffrRmk;
        this.pfEtaDt = pfEtaDt;
        this.phsIoRmk = phsIoRmk;
        this.pfEtbDt = pfEtbDt;
        this.actInpFlg = actInpFlg;
        this.skdDirCd = skdDirCd;
        this.mnvrInHrs = mnvrInHrs;
        this.slanCd = slanCd;
        this.ydCd = ydCd;
        this.ibCgoQty = ibCgoQty;
        this.clptIndSeq = clptIndSeq;
        this.depRptInpFlg = depRptInpFlg;
        this.ts40ftTtlQty = ts40ftTtlQty;
        this.oneWayDir = oneWayDir;
        this.mrgFlg = mrgFlg;
        this.vpsAddRmk = vpsAddRmk;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("ofc_inp_flg", getOfcInpFlg());
        this.hashColumns.put("ts_20ft_ttl_qty", getTs20ftTtlQty());
        this.hashColumns.put("lnk_spd", getLnkSpd());
        this.hashColumns.put("sea_buf_hrs", getSeaBufHrs());
        this.hashColumns.put("add_bnk_csm_qty", getAddBnkCsmQty());
        this.hashColumns.put("plism_voy_no", getPlismVoyNo());
        this.hashColumns.put("sim_no", getSimNo());
        this.hashColumns.put("port_buf_hrs", getPortBufHrs());
        this.hashColumns.put("turn_skd_voy_no", getTurnSkdVoyNo());
        this.hashColumns.put("tztm_hrs", getTztmHrs());
        this.hashColumns.put("init_skd_inp_flg", getInitSkdInpFlg());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ts_40ft_ttl_amt", getTs40ftTtlAmt());
        this.hashColumns.put("port_wrk_hrs", getPortWrkHrs());
        this.hashColumns.put("turn_port_ind_cd", getTurnPortIndCd());
        this.hashColumns.put("pe_usd_ttl_amt", getPeUsdTtlAmt());
        this.hashColumns.put("vps_port_cd", getVpsPortCd());
        this.hashColumns.put("clpt_seq", getClptSeq());
        this.hashColumns.put("skd_brth_no", getSkdBrthNo());
        this.hashColumns.put("tml_hndl_40ft_ttl_qty", getTmlHndl40ftTtlQty());
        this.hashColumns.put("tml_hndl_40ft_ttl_amt", getTmlHndl40ftTtlAmt());
        this.hashColumns.put("noon_rpt_inp_flg", getNoonRptInpFlg());
        this.hashColumns.put("port_skd_sts_cd", getPortSkdStsCd());
        this.hashColumns.put("vsl_dlay_rsn_desc", getVslDlayRsnDesc());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("init_eta_dt", getInitEtaDt());
        this.hashColumns.put("shp_call_no_upd_usr_id", getShpCallNoUpdUsrId());
        this.hashColumns.put("lnk_dist", getLnkDist());
        this.hashColumns.put("vps_etd_dt", getVpsEtdDt());
        this.hashColumns.put("init_etb_dt", getInitEtbDt());
        this.hashColumns.put("ob_cgo_qty", getObCgoQty());
        this.hashColumns.put("port_skp_rsn_cd", getPortSkpRsnCd());
        this.hashColumns.put("plism_yd_cd", getPlismYdCd());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("vps_loc_cd", getVpsLocCd());
        this.hashColumns.put("tgt_port_flg", getTgtPortFlg());
        this.hashColumns.put("tml_vsl_cd", getTmlVslCd());
        this.hashColumns.put("auto_skd_cng_flg", getAutoSkdCngFlg());
        this.hashColumns.put("init_etd_dt", getInitEtdDt());
        this.hashColumns.put("tml_hndl_20ft_ttl_amt", getTmlHndl20ftTtlAmt());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("skd_cng_sts_cd", getSkdCngStsCd());
        this.hashColumns.put("shp_call_no_upd_dt", getShpCallNoUpdDt());
        this.hashColumns.put("usr_hdn_flg", getUsrHdnFlg());
        this.hashColumns.put("turn_clpt_ind_seq", getTurnClptIndSeq());
        this.hashColumns.put("usd_flg", getUsdFlg());
        this.hashColumns.put("mnvr_out_hrs", getMnvrOutHrs());
        this.hashColumns.put("vps_etb_dt", getVpsEtbDt());
        this.hashColumns.put("vps_rmk", getVpsRmk());
        this.hashColumns.put("turn_port_flg", getTurnPortFlg());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("sim_dt", getSimDt());
        this.hashColumns.put("phs_io_rsn_cd", getPhsIoRsnCd());
        this.hashColumns.put("max_spd_estm_dep_dt", getMaxSpdEstmDepDt());
        this.hashColumns.put("tml_prod_qty", getTmlProdQty());
        this.hashColumns.put("tml_hndl_20ft_ttl_qty", getTmlHndl20ftTtlQty());
        this.hashColumns.put("vps_eta_dt", getVpsEtaDt());
        this.hashColumns.put("turn_skd_dir_cd", getTurnSkdDirCd());
        this.hashColumns.put("add_bnk_cost_amt", getAddBnkCostAmt());
        this.hashColumns.put("port_skp_tp_cd", getPortSkpTpCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("crn_knt", getCrnKnt());
        this.hashColumns.put("td_hrs", getTdHrs());
        this.hashColumns.put("vsl_dlay_rsn_cd", getVslDlayRsnCd());
        this.hashColumns.put("tml_voy_no", getTmlVoyNo());
        this.hashColumns.put("call_yd_ind_seq", getCallYdIndSeq());
        this.hashColumns.put("ts_20ft_ttl_amt", getTs20ftTtlAmt());
        this.hashColumns.put("plism_vsl_cd", getPlismVslCd());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("shp_call_no", getShpCallNo());
        this.hashColumns.put("nxt_slan_cd", getNxtSlanCd());
        this.hashColumns.put("ts_port_cd", getTsPortCd());
        this.hashColumns.put("prt_chk_flg", getPrtChkFlg());
        this.hashColumns.put("pf_etd_dt", getPfEtdDt());
        this.hashColumns.put("ttl_dlay_hrs", getTtlDlayHrs());
        this.hashColumns.put("ft_dt", getFtDt());
        this.hashColumns.put("max_spd_estm_brth_dt", getMaxSpdEstmBrthDt());
        this.hashColumns.put("port_skp_rsn_offr_rmk", getPortSkpRsnOffrRmk());
        this.hashColumns.put("pf_eta_dt", getPfEtaDt());
        this.hashColumns.put("phs_io_rmk", getPhsIoRmk());
        this.hashColumns.put("pf_etb_dt", getPfEtbDt());
        this.hashColumns.put("act_inp_flg", getActInpFlg());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("mnvr_in_hrs", getMnvrInHrs());
        this.hashColumns.put("slan_cd", getSlanCd());
        this.hashColumns.put("yd_cd", getYdCd());
        this.hashColumns.put("ib_cgo_qty", getIbCgoQty());
        this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
        this.hashColumns.put("dep_rpt_inp_flg", getDepRptInpFlg());
        this.hashColumns.put("ts_40ft_ttl_qty", getTs40ftTtlQty());
        this.hashColumns.put("one_way_dir", getOneWayDir());
        this.hashColumns.put("mrg_flg", getMrgFlg());
        this.hashColumns.put("vps_add_rmk", getVpsAddRmk());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("ofc_inp_flg", "ofcInpFlg");
        this.hashFields.put("ts_20ft_ttl_qty", "ts20ftTtlQty");
        this.hashFields.put("lnk_spd", "lnkSpd");
        this.hashFields.put("sea_buf_hrs", "seaBufHrs");
        this.hashFields.put("add_bnk_csm_qty", "addBnkCsmQty");
        this.hashFields.put("plism_voy_no", "plismVoyNo");
        this.hashFields.put("sim_no", "simNo");
        this.hashFields.put("port_buf_hrs", "portBufHrs");
        this.hashFields.put("turn_skd_voy_no", "turnSkdVoyNo");
        this.hashFields.put("tztm_hrs", "tztmHrs");
        this.hashFields.put("init_skd_inp_flg", "initSkdInpFlg");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ts_40ft_ttl_amt", "ts40ftTtlAmt");
        this.hashFields.put("port_wrk_hrs", "portWrkHrs");
        this.hashFields.put("turn_port_ind_cd", "turnPortIndCd");
        this.hashFields.put("pe_usd_ttl_amt", "peUsdTtlAmt");
        this.hashFields.put("vps_port_cd", "vpsPortCd");
        this.hashFields.put("clpt_seq", "clptSeq");
        this.hashFields.put("skd_brth_no", "skdBrthNo");
        this.hashFields.put("tml_hndl_40ft_ttl_qty", "tmlHndl40ftTtlQty");
        this.hashFields.put("tml_hndl_40ft_ttl_amt", "tmlHndl40ftTtlAmt");
        this.hashFields.put("noon_rpt_inp_flg", "noonRptInpFlg");
        this.hashFields.put("port_skd_sts_cd", "portSkdStsCd");
        this.hashFields.put("vsl_dlay_rsn_desc", "vslDlayRsnDesc");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("init_eta_dt", "initEtaDt");
        this.hashFields.put("shp_call_no_upd_usr_id", "shpCallNoUpdUsrId");
        this.hashFields.put("lnk_dist", "lnkDist");
        this.hashFields.put("vps_etd_dt", "vpsEtdDt");
        this.hashFields.put("init_etb_dt", "initEtbDt");
        this.hashFields.put("ob_cgo_qty", "obCgoQty");
        this.hashFields.put("port_skp_rsn_cd", "portSkpRsnCd");
        this.hashFields.put("plism_yd_cd", "plismYdCd");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("vps_loc_cd", "vpsLocCd");
        this.hashFields.put("tgt_port_flg", "tgtPortFlg");
        this.hashFields.put("tml_vsl_cd", "tmlVslCd");
        this.hashFields.put("auto_skd_cng_flg", "autoSkdCngFlg");
        this.hashFields.put("init_etd_dt", "initEtdDt");
        this.hashFields.put("tml_hndl_20ft_ttl_amt", "tmlHndl20ftTtlAmt");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("skd_cng_sts_cd", "skdCngStsCd");
        this.hashFields.put("shp_call_no_upd_dt", "shpCallNoUpdDt");
        this.hashFields.put("usr_hdn_flg", "usrHdnFlg");
        this.hashFields.put("turn_clpt_ind_seq", "turnClptIndSeq");
        this.hashFields.put("usd_flg", "usdFlg");
        this.hashFields.put("mnvr_out_hrs", "mnvrOutHrs");
        this.hashFields.put("vps_etb_dt", "vpsEtbDt");
        this.hashFields.put("vps_rmk", "vpsRmk");
        this.hashFields.put("turn_port_flg", "turnPortFlg");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("sim_dt", "simDt");
        this.hashFields.put("phs_io_rsn_cd", "phsIoRsnCd");
        this.hashFields.put("max_spd_estm_dep_dt", "maxSpdEstmDepDt");
        this.hashFields.put("tml_prod_qty", "tmlProdQty");
        this.hashFields.put("tml_hndl_20ft_ttl_qty", "tmlHndl20ftTtlQty");
        this.hashFields.put("vps_eta_dt", "vpsEtaDt");
        this.hashFields.put("turn_skd_dir_cd", "turnSkdDirCd");
        this.hashFields.put("add_bnk_cost_amt", "addBnkCostAmt");
        this.hashFields.put("port_skp_tp_cd", "portSkpTpCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("crn_knt", "crnKnt");
        this.hashFields.put("td_hrs", "tdHrs");
        this.hashFields.put("vsl_dlay_rsn_cd", "vslDlayRsnCd");
        this.hashFields.put("tml_voy_no", "tmlVoyNo");
        this.hashFields.put("call_yd_ind_seq", "callYdIndSeq");
        this.hashFields.put("ts_20ft_ttl_amt", "ts20ftTtlAmt");
        this.hashFields.put("plism_vsl_cd", "plismVslCd");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("shp_call_no", "shpCallNo");
        this.hashFields.put("nxt_slan_cd", "nxtSlanCd");
        this.hashFields.put("ts_port_cd", "tsPortCd");
        this.hashFields.put("prt_chk_flg", "prtChkFlg");
        this.hashFields.put("pf_etd_dt", "pfEtdDt");
        this.hashFields.put("ttl_dlay_hrs", "ttlDlayHrs");
        this.hashFields.put("ft_dt", "ftDt");
        this.hashFields.put("max_spd_estm_brth_dt", "maxSpdEstmBrthDt");
        this.hashFields.put("port_skp_rsn_offr_rmk", "portSkpRsnOffrRmk");
        this.hashFields.put("pf_eta_dt", "pfEtaDt");
        this.hashFields.put("phs_io_rmk", "phsIoRmk");
        this.hashFields.put("pf_etb_dt", "pfEtbDt");
        this.hashFields.put("act_inp_flg", "actInpFlg");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("mnvr_in_hrs", "mnvrInHrs");
        this.hashFields.put("slan_cd", "slanCd");
        this.hashFields.put("yd_cd", "ydCd");
        this.hashFields.put("ib_cgo_qty", "ibCgoQty");
        this.hashFields.put("clpt_ind_seq", "clptIndSeq");
        this.hashFields.put("dep_rpt_inp_flg", "depRptInpFlg");
        this.hashFields.put("ts_40ft_ttl_qty", "ts40ftTtlQty");
        this.hashFields.put("one_way_dir", "oneWayDir");
        this.hashFields.put("mrg_flg", "mrgFlg");
        this.hashFields.put("vps_add_rmk", "vpsAddRmk");
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
	 * @return ofcInpFlg
	 */
    public String getOfcInpFlg() {
        return this.ofcInpFlg;
    }

    /**
	 * Column Info
	 * @return ts20ftTtlQty
	 */
    public String getTs20ftTtlQty() {
        return this.ts20ftTtlQty;
    }

    /**
	 * Column Info
	 * @return lnkSpd
	 */
    public String getLnkSpd() {
        return this.lnkSpd;
    }

    /**
	 * Column Info
	 * @return seaBufHrs
	 */
    public String getSeaBufHrs() {
        return this.seaBufHrs;
    }

    /**
	 * Column Info
	 * @return addBnkCsmQty
	 */
    public String getAddBnkCsmQty() {
        return this.addBnkCsmQty;
    }

    /**
	 * Column Info
	 * @return plismVoyNo
	 */
    public String getPlismVoyNo() {
        return this.plismVoyNo;
    }

    /**
	 * Column Info
	 * @return simNo
	 */
    public String getSimNo() {
        return this.simNo;
    }

    /**
	 * Column Info
	 * @return portBufHrs
	 */
    public String getPortBufHrs() {
        return this.portBufHrs;
    }

    /**
	 * Column Info
	 * @return turnSkdVoyNo
	 */
    public String getTurnSkdVoyNo() {
        return this.turnSkdVoyNo;
    }

    /**
	 * Column Info
	 * @return tztmHrs
	 */
    public String getTztmHrs() {
        return this.tztmHrs;
    }

    /**
	 * Column Info
	 * @return initSkdInpFlg
	 */
    public String getInitSkdInpFlg() {
        return this.initSkdInpFlg;
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
	 * @return ts40ftTtlAmt
	 */
    public String getTs40ftTtlAmt() {
        return this.ts40ftTtlAmt;
    }

    /**
	 * Column Info
	 * @return portWrkHrs
	 */
    public String getPortWrkHrs() {
        return this.portWrkHrs;
    }

    /**
	 * Column Info
	 * @return turnPortIndCd
	 */
    public String getTurnPortIndCd() {
        return this.turnPortIndCd;
    }

    /**
	 * Column Info
	 * @return peUsdTtlAmt
	 */
    public String getPeUsdTtlAmt() {
        return this.peUsdTtlAmt;
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
	 * @return clptSeq
	 */
    public String getClptSeq() {
        return this.clptSeq;
    }

    /**
	 * Column Info
	 * @return skdBrthNo
	 */
    public String getSkdBrthNo() {
        return this.skdBrthNo;
    }

    /**
	 * Column Info
	 * @return tmlHndl40ftTtlQty
	 */
    public String getTmlHndl40ftTtlQty() {
        return this.tmlHndl40ftTtlQty;
    }

    /**
	 * Column Info
	 * @return tmlHndl40ftTtlAmt
	 */
    public String getTmlHndl40ftTtlAmt() {
        return this.tmlHndl40ftTtlAmt;
    }

    /**
	 * Column Info
	 * @return noonRptInpFlg
	 */
    public String getNoonRptInpFlg() {
        return this.noonRptInpFlg;
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
	 * @return vslDlayRsnDesc
	 */
    public String getVslDlayRsnDesc() {
        return this.vslDlayRsnDesc;
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
	 * @return initEtaDt
	 */
    public String getInitEtaDt() {
        return this.initEtaDt;
    }

    /**
	 * Column Info
	 * @return shpCallNoUpdUsrId
	 */
    public String getShpCallNoUpdUsrId() {
        return this.shpCallNoUpdUsrId;
    }

    /**
	 * Column Info
	 * @return lnkDist
	 */
    public String getLnkDist() {
        return this.lnkDist;
    }

    /**
	 * Column Info
	 * @return vpsEtdDt
	 */
    public String getVpsEtdDt() {
        return this.vpsEtdDt;
    }

    /**
	 * Column Info
	 * @return initEtbDt
	 */
    public String getInitEtbDt() {
        return this.initEtbDt;
    }

    /**
	 * Column Info
	 * @return obCgoQty
	 */
    public String getObCgoQty() {
        return this.obCgoQty;
    }

    /**
	 * Column Info
	 * @return portSkpRsnCd
	 */
    public String getPortSkpRsnCd() {
        return this.portSkpRsnCd;
    }

    /**
	 * Column Info
	 * @return plismYdCd
	 */
    public String getPlismYdCd() {
        return this.plismYdCd;
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
	 * @return vpsLocCd
	 */
    public String getVpsLocCd() {
        return this.vpsLocCd;
    }

    /**
	 * Column Info
	 * @return tgtPortFlg
	 */
    public String getTgtPortFlg() {
        return this.tgtPortFlg;
    }

    /**
	 * Column Info
	 * @return tmlVslCd
	 */
    public String getTmlVslCd() {
        return this.tmlVslCd;
    }

    /**
	 * Column Info
	 * @return autoSkdCngFlg
	 */
    public String getAutoSkdCngFlg() {
        return this.autoSkdCngFlg;
    }

    /**
	 * Column Info
	 * @return initEtdDt
	 */
    public String getInitEtdDt() {
        return this.initEtdDt;
    }

    /**
	 * Column Info
	 * @return tmlHndl20ftTtlAmt
	 */
    public String getTmlHndl20ftTtlAmt() {
        return this.tmlHndl20ftTtlAmt;
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
	 * @return skdCngStsCd
	 */
    public String getSkdCngStsCd() {
        return this.skdCngStsCd;
    }

    /**
	 * Column Info
	 * @return shpCallNoUpdDt
	 */
    public String getShpCallNoUpdDt() {
        return this.shpCallNoUpdDt;
    }

    /**
	 * Column Info
	 * @return usrHdnFlg
	 */
    public String getUsrHdnFlg() {
        return this.usrHdnFlg;
    }

    /**
	 * Column Info
	 * @return turnClptIndSeq
	 */
    public String getTurnClptIndSeq() {
        return this.turnClptIndSeq;
    }

    /**
	 * Column Info
	 * @return usdFlg
	 */
    public String getUsdFlg() {
        return this.usdFlg;
    }

    /**
	 * Column Info
	 * @return mnvrOutHrs
	 */
    public String getMnvrOutHrs() {
        return this.mnvrOutHrs;
    }

    /**
	 * Column Info
	 * @return vpsEtbDt
	 */
    public String getVpsEtbDt() {
        return this.vpsEtbDt;
    }

    /**
	 * Column Info
	 * @return vpsRmk
	 */
    public String getVpsRmk() {
        return this.vpsRmk;
    }

    /**
	 * Column Info
	 * @return turnPortFlg
	 */
    public String getTurnPortFlg() {
        return this.turnPortFlg;
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
	 * @return simDt
	 */
    public String getSimDt() {
        return this.simDt;
    }

    /**
	 * Column Info
	 * @return phsIoRsnCd
	 */
    public String getPhsIoRsnCd() {
        return this.phsIoRsnCd;
    }

    /**
	 * Column Info
	 * @return maxSpdEstmDepDt
	 */
    public String getMaxSpdEstmDepDt() {
        return this.maxSpdEstmDepDt;
    }

    /**
	 * Column Info
	 * @return tmlProdQty
	 */
    public String getTmlProdQty() {
        return this.tmlProdQty;
    }

    /**
	 * Column Info
	 * @return tmlHndl20ftTtlQty
	 */
    public String getTmlHndl20ftTtlQty() {
        return this.tmlHndl20ftTtlQty;
    }

    /**
	 * Column Info
	 * @return vpsEtaDt
	 */
    public String getVpsEtaDt() {
        return this.vpsEtaDt;
    }

    /**
	 * Column Info
	 * @return turnSkdDirCd
	 */
    public String getTurnSkdDirCd() {
        return this.turnSkdDirCd;
    }

    /**
	 * Column Info
	 * @return addBnkCostAmt
	 */
    public String getAddBnkCostAmt() {
        return this.addBnkCostAmt;
    }

    /**
	 * Column Info
	 * @return portSkpTpCd
	 */
    public String getPortSkpTpCd() {
        return this.portSkpTpCd;
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
	 * @return crnKnt
	 */
    public String getCrnKnt() {
        return this.crnKnt;
    }

    /**
	 * Column Info
	 * @return tdHrs
	 */
    public String getTdHrs() {
        return this.tdHrs;
    }

    /**
	 * Column Info
	 * @return vslDlayRsnCd
	 */
    public String getVslDlayRsnCd() {
        return this.vslDlayRsnCd;
    }

    /**
	 * Column Info
	 * @return tmlVoyNo
	 */
    public String getTmlVoyNo() {
        return this.tmlVoyNo;
    }

    /**
	 * Column Info
	 * @return callYdIndSeq
	 */
    public String getCallYdIndSeq() {
        return this.callYdIndSeq;
    }

    /**
	 * Column Info
	 * @return ts20ftTtlAmt
	 */
    public String getTs20ftTtlAmt() {
        return this.ts20ftTtlAmt;
    }

    /**
	 * Column Info
	 * @return plismVslCd
	 */
    public String getPlismVslCd() {
        return this.plismVslCd;
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
	 * @return shpCallNo
	 */
    public String getShpCallNo() {
        return this.shpCallNo;
    }

    /**
	 * Column Info
	 * @return nxtSlanCd
	 */
    public String getNxtSlanCd() {
        return this.nxtSlanCd;
    }

    /**
	 * Column Info
	 * @return tsPortCd
	 */
    public String getTsPortCd() {
        return this.tsPortCd;
    }

    /**
	 * Column Info
	 * @return prtChkFlg
	 */
    public String getPrtChkFlg() {
        return this.prtChkFlg;
    }

    /**
	 * Column Info
	 * @return pfEtdDt
	 */
    public String getPfEtdDt() {
        return this.pfEtdDt;
    }

    /**
	 * Column Info
	 * @return ttlDlayHrs
	 */
    public String getTtlDlayHrs() {
        return this.ttlDlayHrs;
    }

    /**
	 * Column Info
	 * @return ftDt
	 */
    public String getFtDt() {
        return this.ftDt;
    }

    /**
	 * Column Info
	 * @return maxSpdEstmBrthDt
	 */
    public String getMaxSpdEstmBrthDt() {
        return this.maxSpdEstmBrthDt;
    }

    /**
	 * Column Info
	 * @return portSkpRsnOffrRmk
	 */
    public String getPortSkpRsnOffrRmk() {
        return this.portSkpRsnOffrRmk;
    }

    /**
	 * Column Info
	 * @return pfEtaDt
	 */
    public String getPfEtaDt() {
        return this.pfEtaDt;
    }

    /**
	 * Column Info
	 * @return phsIoRmk
	 */
    public String getPhsIoRmk() {
        return this.phsIoRmk;
    }

    /**
	 * Column Info
	 * @return pfEtbDt
	 */
    public String getPfEtbDt() {
        return this.pfEtbDt;
    }

    /**
	 * Column Info
	 * @return actInpFlg
	 */
    public String getActInpFlg() {
        return this.actInpFlg;
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
	 * @return mnvrInHrs
	 */
    public String getMnvrInHrs() {
        return this.mnvrInHrs;
    }

    /**
	 * Column Info
	 * @return slanCd
	 */
    public String getSlanCd() {
        return this.slanCd;
    }

    /**
	 * Column Info
	 * @return ydCd
	 */
    public String getYdCd() {
        return this.ydCd;
    }

    /**
	 * Column Info
	 * @return ibCgoQty
	 */
    public String getIbCgoQty() {
        return this.ibCgoQty;
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
	 * @return depRptInpFlg
	 */
    public String getDepRptInpFlg() {
        return this.depRptInpFlg;
    }

    /**
	 * Column Info
	 * @return ts40ftTtlQty
	 */
    public String getTs40ftTtlQty() {
        return this.ts40ftTtlQty;
    }

    /**
	 * Column Info
	 * @return oneWayDir
	 */
    public String getOneWayDir() {
        return this.oneWayDir;
    }

    /**
	 * Column Info
	 * @return mrgFlg
	 */
    public String getMrgFlg() {
        return this.mrgFlg;
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
	 * @param ofcInpFlg
	 */
    public void setOfcInpFlg(String ofcInpFlg) {
        this.ofcInpFlg = ofcInpFlg;
    }

    /**
	 * Column Info
	 * @param ts20ftTtlQty
	 */
    public void setTs20ftTtlQty(String ts20ftTtlQty) {
        this.ts20ftTtlQty = ts20ftTtlQty;
    }

    /**
	 * Column Info
	 * @param lnkSpd
	 */
    public void setLnkSpd(String lnkSpd) {
        this.lnkSpd = lnkSpd;
    }

    /**
	 * Column Info
	 * @param seaBufHrs
	 */
    public void setSeaBufHrs(String seaBufHrs) {
        this.seaBufHrs = seaBufHrs;
    }

    /**
	 * Column Info
	 * @param addBnkCsmQty
	 */
    public void setAddBnkCsmQty(String addBnkCsmQty) {
        this.addBnkCsmQty = addBnkCsmQty;
    }

    /**
	 * Column Info
	 * @param plismVoyNo
	 */
    public void setPlismVoyNo(String plismVoyNo) {
        this.plismVoyNo = plismVoyNo;
    }

    /**
	 * Column Info
	 * @param simNo
	 */
    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    /**
	 * Column Info
	 * @param portBufHrs
	 */
    public void setPortBufHrs(String portBufHrs) {
        this.portBufHrs = portBufHrs;
    }

    /**
	 * Column Info
	 * @param turnSkdVoyNo
	 */
    public void setTurnSkdVoyNo(String turnSkdVoyNo) {
        this.turnSkdVoyNo = turnSkdVoyNo;
    }

    /**
	 * Column Info
	 * @param tztmHrs
	 */
    public void setTztmHrs(String tztmHrs) {
        this.tztmHrs = tztmHrs;
    }

    /**
	 * Column Info
	 * @param initSkdInpFlg
	 */
    public void setInitSkdInpFlg(String initSkdInpFlg) {
        this.initSkdInpFlg = initSkdInpFlg;
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
	 * @param ts40ftTtlAmt
	 */
    public void setTs40ftTtlAmt(String ts40ftTtlAmt) {
        this.ts40ftTtlAmt = ts40ftTtlAmt;
    }

    /**
	 * Column Info
	 * @param portWrkHrs
	 */
    public void setPortWrkHrs(String portWrkHrs) {
        this.portWrkHrs = portWrkHrs;
    }

    /**
	 * Column Info
	 * @param turnPortIndCd
	 */
    public void setTurnPortIndCd(String turnPortIndCd) {
        this.turnPortIndCd = turnPortIndCd;
    }

    /**
	 * Column Info
	 * @param peUsdTtlAmt
	 */
    public void setPeUsdTtlAmt(String peUsdTtlAmt) {
        this.peUsdTtlAmt = peUsdTtlAmt;
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
	 * @param clptSeq
	 */
    public void setClptSeq(String clptSeq) {
        this.clptSeq = clptSeq;
    }

    /**
	 * Column Info
	 * @param skdBrthNo
	 */
    public void setSkdBrthNo(String skdBrthNo) {
        this.skdBrthNo = skdBrthNo;
    }

    /**
	 * Column Info
	 * @param tmlHndl40ftTtlQty
	 */
    public void setTmlHndl40ftTtlQty(String tmlHndl40ftTtlQty) {
        this.tmlHndl40ftTtlQty = tmlHndl40ftTtlQty;
    }

    /**
	 * Column Info
	 * @param tmlHndl40ftTtlAmt
	 */
    public void setTmlHndl40ftTtlAmt(String tmlHndl40ftTtlAmt) {
        this.tmlHndl40ftTtlAmt = tmlHndl40ftTtlAmt;
    }

    /**
	 * Column Info
	 * @param noonRptInpFlg
	 */
    public void setNoonRptInpFlg(String noonRptInpFlg) {
        this.noonRptInpFlg = noonRptInpFlg;
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
	 * @param vslDlayRsnDesc
	 */
    public void setVslDlayRsnDesc(String vslDlayRsnDesc) {
        this.vslDlayRsnDesc = vslDlayRsnDesc;
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
	 * @param initEtaDt
	 */
    public void setInitEtaDt(String initEtaDt) {
        this.initEtaDt = initEtaDt;
    }

    /**
	 * Column Info
	 * @param shpCallNoUpdUsrId
	 */
    public void setShpCallNoUpdUsrId(String shpCallNoUpdUsrId) {
        this.shpCallNoUpdUsrId = shpCallNoUpdUsrId;
    }

    /**
	 * Column Info
	 * @param lnkDist
	 */
    public void setLnkDist(String lnkDist) {
        this.lnkDist = lnkDist;
    }

    /**
	 * Column Info
	 * @param vpsEtdDt
	 */
    public void setVpsEtdDt(String vpsEtdDt) {
        this.vpsEtdDt = vpsEtdDt;
    }

    /**
	 * Column Info
	 * @param initEtbDt
	 */
    public void setInitEtbDt(String initEtbDt) {
        this.initEtbDt = initEtbDt;
    }

    /**
	 * Column Info
	 * @param obCgoQty
	 */
    public void setObCgoQty(String obCgoQty) {
        this.obCgoQty = obCgoQty;
    }

    /**
	 * Column Info
	 * @param portSkpRsnCd
	 */
    public void setPortSkpRsnCd(String portSkpRsnCd) {
        this.portSkpRsnCd = portSkpRsnCd;
    }

    /**
	 * Column Info
	 * @param plismYdCd
	 */
    public void setPlismYdCd(String plismYdCd) {
        this.plismYdCd = plismYdCd;
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
	 * @param vpsLocCd
	 */
    public void setVpsLocCd(String vpsLocCd) {
        this.vpsLocCd = vpsLocCd;
    }

    /**
	 * Column Info
	 * @param tgtPortFlg
	 */
    public void setTgtPortFlg(String tgtPortFlg) {
        this.tgtPortFlg = tgtPortFlg;
    }

    /**
	 * Column Info
	 * @param tmlVslCd
	 */
    public void setTmlVslCd(String tmlVslCd) {
        this.tmlVslCd = tmlVslCd;
    }

    /**
	 * Column Info
	 * @param autoSkdCngFlg
	 */
    public void setAutoSkdCngFlg(String autoSkdCngFlg) {
        this.autoSkdCngFlg = autoSkdCngFlg;
    }

    /**
	 * Column Info
	 * @param initEtdDt
	 */
    public void setInitEtdDt(String initEtdDt) {
        this.initEtdDt = initEtdDt;
    }

    /**
	 * Column Info
	 * @param tmlHndl20ftTtlAmt
	 */
    public void setTmlHndl20ftTtlAmt(String tmlHndl20ftTtlAmt) {
        this.tmlHndl20ftTtlAmt = tmlHndl20ftTtlAmt;
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
	 * @param skdCngStsCd
	 */
    public void setSkdCngStsCd(String skdCngStsCd) {
        this.skdCngStsCd = skdCngStsCd;
    }

    /**
	 * Column Info
	 * @param shpCallNoUpdDt
	 */
    public void setShpCallNoUpdDt(String shpCallNoUpdDt) {
        this.shpCallNoUpdDt = shpCallNoUpdDt;
    }

    /**
	 * Column Info
	 * @param usrHdnFlg
	 */
    public void setUsrHdnFlg(String usrHdnFlg) {
        this.usrHdnFlg = usrHdnFlg;
    }

    /**
	 * Column Info
	 * @param turnClptIndSeq
	 */
    public void setTurnClptIndSeq(String turnClptIndSeq) {
        this.turnClptIndSeq = turnClptIndSeq;
    }

    /**
	 * Column Info
	 * @param usdFlg
	 */
    public void setUsdFlg(String usdFlg) {
        this.usdFlg = usdFlg;
    }

    /**
	 * Column Info
	 * @param mnvrOutHrs
	 */
    public void setMnvrOutHrs(String mnvrOutHrs) {
        this.mnvrOutHrs = mnvrOutHrs;
    }

    /**
	 * Column Info
	 * @param vpsEtbDt
	 */
    public void setVpsEtbDt(String vpsEtbDt) {
        this.vpsEtbDt = vpsEtbDt;
    }

    /**
	 * Column Info
	 * @param vpsRmk
	 */
    public void setVpsRmk(String vpsRmk) {
        this.vpsRmk = vpsRmk;
    }

    /**
	 * Column Info
	 * @param turnPortFlg
	 */
    public void setTurnPortFlg(String turnPortFlg) {
        this.turnPortFlg = turnPortFlg;
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
	 * @param simDt
	 */
    public void setSimDt(String simDt) {
        this.simDt = simDt;
    }

    /**
	 * Column Info
	 * @param phsIoRsnCd
	 */
    public void setPhsIoRsnCd(String phsIoRsnCd) {
        this.phsIoRsnCd = phsIoRsnCd;
    }

    /**
	 * Column Info
	 * @param maxSpdEstmDepDt
	 */
    public void setMaxSpdEstmDepDt(String maxSpdEstmDepDt) {
        this.maxSpdEstmDepDt = maxSpdEstmDepDt;
    }

    /**
	 * Column Info
	 * @param tmlProdQty
	 */
    public void setTmlProdQty(String tmlProdQty) {
        this.tmlProdQty = tmlProdQty;
    }

    /**
	 * Column Info
	 * @param tmlHndl20ftTtlQty
	 */
    public void setTmlHndl20ftTtlQty(String tmlHndl20ftTtlQty) {
        this.tmlHndl20ftTtlQty = tmlHndl20ftTtlQty;
    }

    /**
	 * Column Info
	 * @param vpsEtaDt
	 */
    public void setVpsEtaDt(String vpsEtaDt) {
        this.vpsEtaDt = vpsEtaDt;
    }

    /**
	 * Column Info
	 * @param turnSkdDirCd
	 */
    public void setTurnSkdDirCd(String turnSkdDirCd) {
        this.turnSkdDirCd = turnSkdDirCd;
    }

    /**
	 * Column Info
	 * @param addBnkCostAmt
	 */
    public void setAddBnkCostAmt(String addBnkCostAmt) {
        this.addBnkCostAmt = addBnkCostAmt;
    }

    /**
	 * Column Info
	 * @param portSkpTpCd
	 */
    public void setPortSkpTpCd(String portSkpTpCd) {
        this.portSkpTpCd = portSkpTpCd;
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
	 * @param crnKnt
	 */
    public void setCrnKnt(String crnKnt) {
        this.crnKnt = crnKnt;
    }

    /**
	 * Column Info
	 * @param tdHrs
	 */
    public void setTdHrs(String tdHrs) {
        this.tdHrs = tdHrs;
    }

    /**
	 * Column Info
	 * @param vslDlayRsnCd
	 */
    public void setVslDlayRsnCd(String vslDlayRsnCd) {
        this.vslDlayRsnCd = vslDlayRsnCd;
    }

    /**
	 * Column Info
	 * @param tmlVoyNo
	 */
    public void setTmlVoyNo(String tmlVoyNo) {
        this.tmlVoyNo = tmlVoyNo;
    }

    /**
	 * Column Info
	 * @param callYdIndSeq
	 */
    public void setCallYdIndSeq(String callYdIndSeq) {
        this.callYdIndSeq = callYdIndSeq;
    }

    /**
	 * Column Info
	 * @param ts20ftTtlAmt
	 */
    public void setTs20ftTtlAmt(String ts20ftTtlAmt) {
        this.ts20ftTtlAmt = ts20ftTtlAmt;
    }

    /**
	 * Column Info
	 * @param plismVslCd
	 */
    public void setPlismVslCd(String plismVslCd) {
        this.plismVslCd = plismVslCd;
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
	 * @param shpCallNo
	 */
    public void setShpCallNo(String shpCallNo) {
        this.shpCallNo = shpCallNo;
    }

    /**
	 * Column Info
	 * @param nxtSlanCd
	 */
    public void setNxtSlanCd(String nxtSlanCd) {
        this.nxtSlanCd = nxtSlanCd;
    }

    /**
	 * Column Info
	 * @param tsPortCd
	 */
    public void setTsPortCd(String tsPortCd) {
        this.tsPortCd = tsPortCd;
    }

    /**
	 * Column Info
	 * @param prtChkFlg
	 */
    public void setPrtChkFlg(String prtChkFlg) {
        this.prtChkFlg = prtChkFlg;
    }

    /**
	 * Column Info
	 * @param pfEtdDt
	 */
    public void setPfEtdDt(String pfEtdDt) {
        this.pfEtdDt = pfEtdDt;
    }

    /**
	 * Column Info
	 * @param ttlDlayHrs
	 */
    public void setTtlDlayHrs(String ttlDlayHrs) {
        this.ttlDlayHrs = ttlDlayHrs;
    }

    /**
	 * Column Info
	 * @param ftDt
	 */
    public void setFtDt(String ftDt) {
        this.ftDt = ftDt;
    }

    /**
	 * Column Info
	 * @param maxSpdEstmBrthDt
	 */
    public void setMaxSpdEstmBrthDt(String maxSpdEstmBrthDt) {
        this.maxSpdEstmBrthDt = maxSpdEstmBrthDt;
    }

    /**
	 * Column Info
	 * @param portSkpRsnOffrRmk
	 */
    public void setPortSkpRsnOffrRmk(String portSkpRsnOffrRmk) {
        this.portSkpRsnOffrRmk = portSkpRsnOffrRmk;
    }

    /**
	 * Column Info
	 * @param pfEtaDt
	 */
    public void setPfEtaDt(String pfEtaDt) {
        this.pfEtaDt = pfEtaDt;
    }

    /**
	 * Column Info
	 * @param phsIoRmk
	 */
    public void setPhsIoRmk(String phsIoRmk) {
        this.phsIoRmk = phsIoRmk;
    }

    /**
	 * Column Info
	 * @param pfEtbDt
	 */
    public void setPfEtbDt(String pfEtbDt) {
        this.pfEtbDt = pfEtbDt;
    }

    /**
	 * Column Info
	 * @param actInpFlg
	 */
    public void setActInpFlg(String actInpFlg) {
        this.actInpFlg = actInpFlg;
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
	 * @param mnvrInHrs
	 */
    public void setMnvrInHrs(String mnvrInHrs) {
        this.mnvrInHrs = mnvrInHrs;
    }

    /**
	 * Column Info
	 * @param slanCd
	 */
    public void setSlanCd(String slanCd) {
        this.slanCd = slanCd;
    }

    /**
	 * Column Info
	 * @param ydCd
	 */
    public void setYdCd(String ydCd) {
        this.ydCd = ydCd;
    }

    /**
	 * Column Info
	 * @param ibCgoQty
	 */
    public void setIbCgoQty(String ibCgoQty) {
        this.ibCgoQty = ibCgoQty;
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
	 * @param depRptInpFlg
	 */
    public void setDepRptInpFlg(String depRptInpFlg) {
        this.depRptInpFlg = depRptInpFlg;
    }

    /**
	 * Column Info
	 * @param ts40ftTtlQty
	 */
    public void setTs40ftTtlQty(String ts40ftTtlQty) {
        this.ts40ftTtlQty = ts40ftTtlQty;
    }

    /**
	 * Column Info
	 * @param oneWayDir
	 */
    public void setOneWayDir(String oneWayDir) {
        this.oneWayDir = oneWayDir;
    }

    /**
	 * Column Info
	 * @param oneWayDir
	 */
    public void setMrgFlg(String mrgFlg) {
        this.mrgFlg = mrgFlg;
    }

    public void setVpsAddRmk(String vpsAddRmk) {
        this.vpsAddRmk = vpsAddRmk;
    }

    public String getVpsAddRmk() {
        return this.vpsAddRmk;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setOfcInpFlg(JSPUtil.getParameter(request, "ofc_inp_flg", ""));
        setTs20ftTtlQty(JSPUtil.getParameter(request, "ts_20ft_ttl_qty", ""));
        setLnkSpd(JSPUtil.getParameter(request, "lnk_spd", ""));
        setSeaBufHrs(JSPUtil.getParameter(request, "sea_buf_hrs", ""));
        setAddBnkCsmQty(JSPUtil.getParameter(request, "add_bnk_csm_qty", ""));
        setPlismVoyNo(JSPUtil.getParameter(request, "plism_voy_no", ""));
        setSimNo(JSPUtil.getParameter(request, "sim_no", ""));
        setPortBufHrs(JSPUtil.getParameter(request, "port_buf_hrs", ""));
        setTurnSkdVoyNo(JSPUtil.getParameter(request, "turn_skd_voy_no", ""));
        setTztmHrs(JSPUtil.getParameter(request, "tztm_hrs", ""));
        setInitSkdInpFlg(JSPUtil.getParameter(request, "init_skd_inp_flg", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setTs40ftTtlAmt(JSPUtil.getParameter(request, "ts_40ft_ttl_amt", ""));
        setPortWrkHrs(JSPUtil.getParameter(request, "port_wrk_hrs", ""));
        setTurnPortIndCd(JSPUtil.getParameter(request, "turn_port_ind_cd", ""));
        setPeUsdTtlAmt(JSPUtil.getParameter(request, "pe_usd_ttl_amt", ""));
        setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
        setClptSeq(JSPUtil.getParameter(request, "clpt_seq", ""));
        setSkdBrthNo(JSPUtil.getParameter(request, "skd_brth_no", ""));
        setTmlHndl40ftTtlQty(JSPUtil.getParameter(request, "tml_hndl_40ft_ttl_qty", ""));
        setTmlHndl40ftTtlAmt(JSPUtil.getParameter(request, "tml_hndl_40ft_ttl_amt", ""));
        setNoonRptInpFlg(JSPUtil.getParameter(request, "noon_rpt_inp_flg", ""));
        setPortSkdStsCd(JSPUtil.getParameter(request, "port_skd_sts_cd", ""));
        setVslDlayRsnDesc(JSPUtil.getParameter(request, "vsl_dlay_rsn_desc", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setInitEtaDt(JSPUtil.getParameter(request, "init_eta_dt", ""));
        setShpCallNoUpdUsrId(JSPUtil.getParameter(request, "shp_call_no_upd_usr_id", ""));
        setLnkDist(JSPUtil.getParameter(request, "lnk_dist", ""));
        setVpsEtdDt(JSPUtil.getParameter(request, "vps_etd_dt", ""));
        setInitEtbDt(JSPUtil.getParameter(request, "init_etb_dt", ""));
        setObCgoQty(JSPUtil.getParameter(request, "ob_cgo_qty", ""));
        setPortSkpRsnCd(JSPUtil.getParameter(request, "port_skp_rsn_cd", ""));
        setPlismYdCd(JSPUtil.getParameter(request, "plism_yd_cd", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setVpsLocCd(JSPUtil.getParameter(request, "vps_loc_cd", ""));
        setTgtPortFlg(JSPUtil.getParameter(request, "tgt_port_flg", ""));
        setTmlVslCd(JSPUtil.getParameter(request, "tml_vsl_cd", ""));
        setAutoSkdCngFlg(JSPUtil.getParameter(request, "auto_skd_cng_flg", ""));
        setInitEtdDt(JSPUtil.getParameter(request, "init_etd_dt", ""));
        setTmlHndl20ftTtlAmt(JSPUtil.getParameter(request, "tml_hndl_20ft_ttl_amt", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setSkdCngStsCd(JSPUtil.getParameter(request, "skd_cng_sts_cd", ""));
        setShpCallNoUpdDt(JSPUtil.getParameter(request, "shp_call_no_upd_dt", ""));
        setUsrHdnFlg(JSPUtil.getParameter(request, "usr_hdn_flg", ""));
        setTurnClptIndSeq(JSPUtil.getParameter(request, "turn_clpt_ind_seq", ""));
        setUsdFlg(JSPUtil.getParameter(request, "usd_flg", ""));
        setMnvrOutHrs(JSPUtil.getParameter(request, "mnvr_out_hrs", ""));
        setVpsEtbDt(JSPUtil.getParameter(request, "vps_etb_dt", ""));
        setVpsRmk(JSPUtil.getParameter(request, "vps_rmk", ""));
        setTurnPortFlg(JSPUtil.getParameter(request, "turn_port_flg", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setSimDt(JSPUtil.getParameter(request, "sim_dt", ""));
        setPhsIoRsnCd(JSPUtil.getParameter(request, "phs_io_rsn_cd", ""));
        setMaxSpdEstmDepDt(JSPUtil.getParameter(request, "max_spd_estm_dep_dt", ""));
        setTmlProdQty(JSPUtil.getParameter(request, "tml_prod_qty", ""));
        setTmlHndl20ftTtlQty(JSPUtil.getParameter(request, "tml_hndl_20ft_ttl_qty", ""));
        setVpsEtaDt(JSPUtil.getParameter(request, "vps_eta_dt", ""));
        setTurnSkdDirCd(JSPUtil.getParameter(request, "turn_skd_dir_cd", ""));
        setAddBnkCostAmt(JSPUtil.getParameter(request, "add_bnk_cost_amt", ""));
        setPortSkpTpCd(JSPUtil.getParameter(request, "port_skp_tp_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setCrnKnt(JSPUtil.getParameter(request, "crn_knt", ""));
        setTdHrs(JSPUtil.getParameter(request, "td_hrs", ""));
        setVslDlayRsnCd(JSPUtil.getParameter(request, "vsl_dlay_rsn_cd", ""));
        setTmlVoyNo(JSPUtil.getParameter(request, "tml_voy_no", ""));
        setCallYdIndSeq(JSPUtil.getParameter(request, "call_yd_ind_seq", ""));
        setTs20ftTtlAmt(JSPUtil.getParameter(request, "ts_20ft_ttl_amt", ""));
        setPlismVslCd(JSPUtil.getParameter(request, "plism_vsl_cd", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setShpCallNo(JSPUtil.getParameter(request, "shp_call_no", ""));
        setNxtSlanCd(JSPUtil.getParameter(request, "nxt_slan_cd", ""));
        setTsPortCd(JSPUtil.getParameter(request, "ts_port_cd", ""));
        setPrtChkFlg(JSPUtil.getParameter(request, "prt_chk_flg", ""));
        setPfEtdDt(JSPUtil.getParameter(request, "pf_etd_dt", ""));
        setTtlDlayHrs(JSPUtil.getParameter(request, "ttl_dlay_hrs", ""));
        setFtDt(JSPUtil.getParameter(request, "ft_dt", ""));
        setMaxSpdEstmBrthDt(JSPUtil.getParameter(request, "max_spd_estm_brth_dt", ""));
        setPortSkpRsnOffrRmk(JSPUtil.getParameter(request, "port_skp_rsn_offr_rmk", ""));
        setPfEtaDt(JSPUtil.getParameter(request, "pf_eta_dt", ""));
        setPhsIoRmk(JSPUtil.getParameter(request, "phs_io_rmk", ""));
        setPfEtbDt(JSPUtil.getParameter(request, "pf_etb_dt", ""));
        setActInpFlg(JSPUtil.getParameter(request, "act_inp_flg", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setMnvrInHrs(JSPUtil.getParameter(request, "mnvr_in_hrs", ""));
        setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
        setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
        setIbCgoQty(JSPUtil.getParameter(request, "ib_cgo_qty", ""));
        setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
        setDepRptInpFlg(JSPUtil.getParameter(request, "dep_rpt_inp_flg", ""));
        setTs40ftTtlQty(JSPUtil.getParameter(request, "ts_40ft_ttl_qty", ""));
        setOneWayDir(JSPUtil.getParameter(request, "one_way_dir", ""));
        setMrgFlg(JSPUtil.getParameter(request, "mrg_flg", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskSwapCstPortVO[]
	 */
    public VskSwapCstPortVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskSwapCstPortVO[]
	 */
    public VskSwapCstPortVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        VskSwapCstPortVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] ofcInpFlg = (JSPUtil.getParameter(request, prefix + "ofc_inp_flg", length));
            String[] ts20ftTtlQty = (JSPUtil.getParameter(request, prefix + "ts_20ft_ttl_qty", length));
            String[] lnkSpd = (JSPUtil.getParameter(request, prefix + "lnk_spd", length));
            String[] seaBufHrs = (JSPUtil.getParameter(request, prefix + "sea_buf_hrs", length));
            String[] addBnkCsmQty = (JSPUtil.getParameter(request, prefix + "add_bnk_csm_qty", length));
            String[] plismVoyNo = (JSPUtil.getParameter(request, prefix + "plism_voy_no", length));
            String[] simNo = (JSPUtil.getParameter(request, prefix + "sim_no", length));
            String[] portBufHrs = (JSPUtil.getParameter(request, prefix + "port_buf_hrs", length));
            String[] turnSkdVoyNo = (JSPUtil.getParameter(request, prefix + "turn_skd_voy_no", length));
            String[] tztmHrs = (JSPUtil.getParameter(request, prefix + "tztm_hrs", length));
            String[] initSkdInpFlg = (JSPUtil.getParameter(request, prefix + "init_skd_inp_flg", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] ts40ftTtlAmt = (JSPUtil.getParameter(request, prefix + "ts_40ft_ttl_amt", length));
            String[] portWrkHrs = (JSPUtil.getParameter(request, prefix + "port_wrk_hrs", length));
            String[] turnPortIndCd = (JSPUtil.getParameter(request, prefix + "turn_port_ind_cd", length));
            String[] peUsdTtlAmt = (JSPUtil.getParameter(request, prefix + "pe_usd_ttl_amt", length));
            String[] vpsPortCd = (JSPUtil.getParameter(request, prefix + "vps_port_cd", length));
            String[] clptSeq = (JSPUtil.getParameter(request, prefix + "clpt_seq", length));
            String[] skdBrthNo = (JSPUtil.getParameter(request, prefix + "skd_brth_no", length));
            String[] tmlHndl40ftTtlQty = (JSPUtil.getParameter(request, prefix + "tml_hndl_40ft_ttl_qty", length));
            String[] tmlHndl40ftTtlAmt = (JSPUtil.getParameter(request, prefix + "tml_hndl_40ft_ttl_amt", length));
            String[] noonRptInpFlg = (JSPUtil.getParameter(request, prefix + "noon_rpt_inp_flg", length));
            String[] portSkdStsCd = (JSPUtil.getParameter(request, prefix + "port_skd_sts_cd", length));
            String[] vslDlayRsnDesc = (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_desc", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] initEtaDt = (JSPUtil.getParameter(request, prefix + "init_eta_dt", length));
            String[] shpCallNoUpdUsrId = (JSPUtil.getParameter(request, prefix + "shp_call_no_upd_usr_id", length));
            String[] lnkDist = (JSPUtil.getParameter(request, prefix + "lnk_dist", length));
            String[] vpsEtdDt = (JSPUtil.getParameter(request, prefix + "vps_etd_dt", length));
            String[] initEtbDt = (JSPUtil.getParameter(request, prefix + "init_etb_dt", length));
            String[] obCgoQty = (JSPUtil.getParameter(request, prefix + "ob_cgo_qty", length));
            String[] portSkpRsnCd = (JSPUtil.getParameter(request, prefix + "port_skp_rsn_cd", length));
            String[] plismYdCd = (JSPUtil.getParameter(request, prefix + "plism_yd_cd", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] vpsLocCd = (JSPUtil.getParameter(request, prefix + "vps_loc_cd", length));
            String[] tgtPortFlg = (JSPUtil.getParameter(request, prefix + "tgt_port_flg", length));
            String[] tmlVslCd = (JSPUtil.getParameter(request, prefix + "tml_vsl_cd", length));
            String[] autoSkdCngFlg = (JSPUtil.getParameter(request, prefix + "auto_skd_cng_flg", length));
            String[] initEtdDt = (JSPUtil.getParameter(request, prefix + "init_etd_dt", length));
            String[] tmlHndl20ftTtlAmt = (JSPUtil.getParameter(request, prefix + "tml_hndl_20ft_ttl_amt", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] skdCngStsCd = (JSPUtil.getParameter(request, prefix + "skd_cng_sts_cd", length));
            String[] shpCallNoUpdDt = (JSPUtil.getParameter(request, prefix + "shp_call_no_upd_dt", length));
            String[] usrHdnFlg = (JSPUtil.getParameter(request, prefix + "usr_hdn_flg", length));
            String[] turnClptIndSeq = (JSPUtil.getParameter(request, prefix + "turn_clpt_ind_seq", length));
            String[] usdFlg = (JSPUtil.getParameter(request, prefix + "usd_flg", length));
            String[] mnvrOutHrs = (JSPUtil.getParameter(request, prefix + "mnvr_out_hrs", length));
            String[] vpsEtbDt = (JSPUtil.getParameter(request, prefix + "vps_etb_dt", length));
            String[] vpsRmk = (JSPUtil.getParameter(request, prefix + "vps_rmk", length));
            String[] turnPortFlg = (JSPUtil.getParameter(request, prefix + "turn_port_flg", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] simDt = (JSPUtil.getParameter(request, prefix + "sim_dt", length));
            String[] phsIoRsnCd = (JSPUtil.getParameter(request, prefix + "phs_io_rsn_cd", length));
            String[] maxSpdEstmDepDt = (JSPUtil.getParameter(request, prefix + "max_spd_estm_dep_dt", length));
            String[] tmlProdQty = (JSPUtil.getParameter(request, prefix + "tml_prod_qty", length));
            String[] tmlHndl20ftTtlQty = (JSPUtil.getParameter(request, prefix + "tml_hndl_20ft_ttl_qty", length));
            String[] vpsEtaDt = (JSPUtil.getParameter(request, prefix + "vps_eta_dt", length));
            String[] turnSkdDirCd = (JSPUtil.getParameter(request, prefix + "turn_skd_dir_cd", length));
            String[] addBnkCostAmt = (JSPUtil.getParameter(request, prefix + "add_bnk_cost_amt", length));
            String[] portSkpTpCd = (JSPUtil.getParameter(request, prefix + "port_skp_tp_cd", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] crnKnt = (JSPUtil.getParameter(request, prefix + "crn_knt", length));
            String[] tdHrs = (JSPUtil.getParameter(request, prefix + "td_hrs", length));
            String[] vslDlayRsnCd = (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_cd", length));
            String[] tmlVoyNo = (JSPUtil.getParameter(request, prefix + "tml_voy_no", length));
            String[] callYdIndSeq = (JSPUtil.getParameter(request, prefix + "call_yd_ind_seq", length));
            String[] ts20ftTtlAmt = (JSPUtil.getParameter(request, prefix + "ts_20ft_ttl_amt", length));
            String[] plismVslCd = (JSPUtil.getParameter(request, prefix + "plism_vsl_cd", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] shpCallNo = (JSPUtil.getParameter(request, prefix + "shp_call_no", length));
            String[] nxtSlanCd = (JSPUtil.getParameter(request, prefix + "nxt_slan_cd", length));
            String[] tsPortCd = (JSPUtil.getParameter(request, prefix + "ts_port_cd", length));
            String[] prtChkFlg = (JSPUtil.getParameter(request, prefix + "prt_chk_flg", length));
            String[] pfEtdDt = (JSPUtil.getParameter(request, prefix + "pf_etd_dt", length));
            String[] ttlDlayHrs = (JSPUtil.getParameter(request, prefix + "ttl_dlay_hrs", length));
            String[] ftDt = (JSPUtil.getParameter(request, prefix + "ft_dt", length));
            String[] maxSpdEstmBrthDt = (JSPUtil.getParameter(request, prefix + "max_spd_estm_brth_dt", length));
            String[] portSkpRsnOffrRmk = (JSPUtil.getParameter(request, prefix + "port_skp_rsn_offr_rmk", length));
            String[] pfEtaDt = (JSPUtil.getParameter(request, prefix + "pf_eta_dt", length));
            String[] phsIoRmk = (JSPUtil.getParameter(request, prefix + "phs_io_rmk", length));
            String[] pfEtbDt = (JSPUtil.getParameter(request, prefix + "pf_etb_dt", length));
            String[] actInpFlg = (JSPUtil.getParameter(request, prefix + "act_inp_flg", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] mnvrInHrs = (JSPUtil.getParameter(request, prefix + "mnvr_in_hrs", length));
            String[] slanCd = (JSPUtil.getParameter(request, prefix + "slan_cd", length));
            String[] ydCd = (JSPUtil.getParameter(request, prefix + "yd_cd", length));
            String[] ibCgoQty = (JSPUtil.getParameter(request, prefix + "ib_cgo_qty", length));
            String[] clptIndSeq = (JSPUtil.getParameter(request, prefix + "clpt_ind_seq", length));
            String[] depRptInpFlg = (JSPUtil.getParameter(request, prefix + "dep_rpt_inp_flg", length));
            String[] ts40ftTtlQty = (JSPUtil.getParameter(request, prefix + "ts_40ft_ttl_qty", length));
            String[] oneWayDir = (JSPUtil.getParameter(request, prefix + "one_way_dir", length));
            String[] mrgFlg = (JSPUtil.getParameter(request, prefix + "mrg_flg", length));
            String[] vpsAddRmk = (JSPUtil.getParameter(request, prefix + "vps_add_rmk", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new VskSwapCstPortVO();
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (ofcInpFlg[i] != null)
                    model.setOfcInpFlg(ofcInpFlg[i]);
                if (ts20ftTtlQty[i] != null)
                    model.setTs20ftTtlQty(ts20ftTtlQty[i]);
                if (lnkSpd[i] != null)
                    model.setLnkSpd(lnkSpd[i]);
                if (seaBufHrs[i] != null)
                    model.setSeaBufHrs(seaBufHrs[i]);
                if (addBnkCsmQty[i] != null)
                    model.setAddBnkCsmQty(addBnkCsmQty[i]);
                if (plismVoyNo[i] != null)
                    model.setPlismVoyNo(plismVoyNo[i]);
                if (simNo[i] != null)
                    model.setSimNo(simNo[i]);
                if (portBufHrs[i] != null)
                    model.setPortBufHrs(portBufHrs[i]);
                if (turnSkdVoyNo[i] != null)
                    model.setTurnSkdVoyNo(turnSkdVoyNo[i]);
                if (tztmHrs[i] != null)
                    model.setTztmHrs(tztmHrs[i]);
                if (initSkdInpFlg[i] != null)
                    model.setInitSkdInpFlg(initSkdInpFlg[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (ts40ftTtlAmt[i] != null)
                    model.setTs40ftTtlAmt(ts40ftTtlAmt[i]);
                if (portWrkHrs[i] != null)
                    model.setPortWrkHrs(portWrkHrs[i]);
                if (turnPortIndCd[i] != null)
                    model.setTurnPortIndCd(turnPortIndCd[i]);
                if (peUsdTtlAmt[i] != null)
                    model.setPeUsdTtlAmt(peUsdTtlAmt[i]);
                if (vpsPortCd[i] != null)
                    model.setVpsPortCd(vpsPortCd[i]);
                if (clptSeq[i] != null)
                    model.setClptSeq(clptSeq[i]);
                if (skdBrthNo[i] != null)
                    model.setSkdBrthNo(skdBrthNo[i]);
                if (tmlHndl40ftTtlQty[i] != null)
                    model.setTmlHndl40ftTtlQty(tmlHndl40ftTtlQty[i]);
                if (tmlHndl40ftTtlAmt[i] != null)
                    model.setTmlHndl40ftTtlAmt(tmlHndl40ftTtlAmt[i]);
                if (noonRptInpFlg[i] != null)
                    model.setNoonRptInpFlg(noonRptInpFlg[i]);
                if (portSkdStsCd[i] != null)
                    model.setPortSkdStsCd(portSkdStsCd[i]);
                if (vslDlayRsnDesc[i] != null)
                    model.setVslDlayRsnDesc(vslDlayRsnDesc[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (initEtaDt[i] != null)
                    model.setInitEtaDt(initEtaDt[i]);
                if (shpCallNoUpdUsrId[i] != null)
                    model.setShpCallNoUpdUsrId(shpCallNoUpdUsrId[i]);
                if (lnkDist[i] != null)
                    model.setLnkDist(lnkDist[i]);
                if (vpsEtdDt[i] != null)
                    model.setVpsEtdDt(vpsEtdDt[i]);
                if (initEtbDt[i] != null)
                    model.setInitEtbDt(initEtbDt[i]);
                if (obCgoQty[i] != null)
                    model.setObCgoQty(obCgoQty[i]);
                if (portSkpRsnCd[i] != null)
                    model.setPortSkpRsnCd(portSkpRsnCd[i]);
                if (plismYdCd[i] != null)
                    model.setPlismYdCd(plismYdCd[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (vpsLocCd[i] != null)
                    model.setVpsLocCd(vpsLocCd[i]);
                if (tgtPortFlg[i] != null)
                    model.setTgtPortFlg(tgtPortFlg[i]);
                if (tmlVslCd[i] != null)
                    model.setTmlVslCd(tmlVslCd[i]);
                if (autoSkdCngFlg[i] != null)
                    model.setAutoSkdCngFlg(autoSkdCngFlg[i]);
                if (initEtdDt[i] != null)
                    model.setInitEtdDt(initEtdDt[i]);
                if (tmlHndl20ftTtlAmt[i] != null)
                    model.setTmlHndl20ftTtlAmt(tmlHndl20ftTtlAmt[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (skdCngStsCd[i] != null)
                    model.setSkdCngStsCd(skdCngStsCd[i]);
                if (shpCallNoUpdDt[i] != null)
                    model.setShpCallNoUpdDt(shpCallNoUpdDt[i]);
                if (usrHdnFlg[i] != null)
                    model.setUsrHdnFlg(usrHdnFlg[i]);
                if (turnClptIndSeq[i] != null)
                    model.setTurnClptIndSeq(turnClptIndSeq[i]);
                if (usdFlg[i] != null)
                    model.setUsdFlg(usdFlg[i]);
                if (mnvrOutHrs[i] != null)
                    model.setMnvrOutHrs(mnvrOutHrs[i]);
                if (vpsEtbDt[i] != null)
                    model.setVpsEtbDt(vpsEtbDt[i]);
                if (vpsRmk[i] != null)
                    model.setVpsRmk(vpsRmk[i]);
                if (turnPortFlg[i] != null)
                    model.setTurnPortFlg(turnPortFlg[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (simDt[i] != null)
                    model.setSimDt(simDt[i]);
                if (phsIoRsnCd[i] != null)
                    model.setPhsIoRsnCd(phsIoRsnCd[i]);
                if (maxSpdEstmDepDt[i] != null)
                    model.setMaxSpdEstmDepDt(maxSpdEstmDepDt[i]);
                if (tmlProdQty[i] != null)
                    model.setTmlProdQty(tmlProdQty[i]);
                if (tmlHndl20ftTtlQty[i] != null)
                    model.setTmlHndl20ftTtlQty(tmlHndl20ftTtlQty[i]);
                if (vpsEtaDt[i] != null)
                    model.setVpsEtaDt(vpsEtaDt[i]);
                if (turnSkdDirCd[i] != null)
                    model.setTurnSkdDirCd(turnSkdDirCd[i]);
                if (addBnkCostAmt[i] != null)
                    model.setAddBnkCostAmt(addBnkCostAmt[i]);
                if (portSkpTpCd[i] != null)
                    model.setPortSkpTpCd(portSkpTpCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (crnKnt[i] != null)
                    model.setCrnKnt(crnKnt[i]);
                if (tdHrs[i] != null)
                    model.setTdHrs(tdHrs[i]);
                if (vslDlayRsnCd[i] != null)
                    model.setVslDlayRsnCd(vslDlayRsnCd[i]);
                if (tmlVoyNo[i] != null)
                    model.setTmlVoyNo(tmlVoyNo[i]);
                if (callYdIndSeq[i] != null)
                    model.setCallYdIndSeq(callYdIndSeq[i]);
                if (ts20ftTtlAmt[i] != null)
                    model.setTs20ftTtlAmt(ts20ftTtlAmt[i]);
                if (plismVslCd[i] != null)
                    model.setPlismVslCd(plismVslCd[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (shpCallNo[i] != null)
                    model.setShpCallNo(shpCallNo[i]);
                if (nxtSlanCd[i] != null)
                    model.setNxtSlanCd(nxtSlanCd[i]);
                if (tsPortCd[i] != null)
                    model.setTsPortCd(tsPortCd[i]);
                if (prtChkFlg[i] != null)
                    model.setPrtChkFlg(prtChkFlg[i]);
                if (pfEtdDt[i] != null)
                    model.setPfEtdDt(pfEtdDt[i]);
                if (ttlDlayHrs[i] != null)
                    model.setTtlDlayHrs(ttlDlayHrs[i]);
                if (ftDt[i] != null)
                    model.setFtDt(ftDt[i]);
                if (maxSpdEstmBrthDt[i] != null)
                    model.setMaxSpdEstmBrthDt(maxSpdEstmBrthDt[i]);
                if (portSkpRsnOffrRmk[i] != null)
                    model.setPortSkpRsnOffrRmk(portSkpRsnOffrRmk[i]);
                if (pfEtaDt[i] != null)
                    model.setPfEtaDt(pfEtaDt[i]);
                if (phsIoRmk[i] != null)
                    model.setPhsIoRmk(phsIoRmk[i]);
                if (pfEtbDt[i] != null)
                    model.setPfEtbDt(pfEtbDt[i]);
                if (actInpFlg[i] != null)
                    model.setActInpFlg(actInpFlg[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (mnvrInHrs[i] != null)
                    model.setMnvrInHrs(mnvrInHrs[i]);
                if (slanCd[i] != null)
                    model.setSlanCd(slanCd[i]);
                if (ydCd[i] != null)
                    model.setYdCd(ydCd[i]);
                if (ibCgoQty[i] != null)
                    model.setIbCgoQty(ibCgoQty[i]);
                if (clptIndSeq[i] != null)
                    model.setClptIndSeq(clptIndSeq[i]);
                if (depRptInpFlg[i] != null)
                    model.setDepRptInpFlg(depRptInpFlg[i]);
                if (ts40ftTtlQty[i] != null)
                    model.setTs40ftTtlQty(ts40ftTtlQty[i]);
                if (oneWayDir[i] != null)
                    model.setOneWayDir(oneWayDir[i]);
                if (mrgFlg[i] != null)
                    model.setMrgFlg(mrgFlg[i]);
                if (vpsAddRmk[i] != null) 
		    		model.setVpsAddRmk(vpsAddRmk[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getVskSwapCstPortVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return VskSwapCstPortVO[]
	 */
    public VskSwapCstPortVO[] getVskSwapCstPortVOs() {
        VskSwapCstPortVO[] vos = (VskSwapCstPortVO[]) models.toArray(new VskSwapCstPortVO[models.size()]);
        return vos;
    }

    /**
	 * VO Class의 내용을 String으로 변환
	 */
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
    public void unDataFormat() {
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ofcInpFlg = this.ofcInpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ts20ftTtlQty = this.ts20ftTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lnkSpd = this.lnkSpd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.seaBufHrs = this.seaBufHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.addBnkCsmQty = this.addBnkCsmQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.plismVoyNo = this.plismVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.simNo = this.simNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portBufHrs = this.portBufHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnSkdVoyNo = this.turnSkdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tztmHrs = this.tztmHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.initSkdInpFlg = this.initSkdInpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ts40ftTtlAmt = this.ts40ftTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portWrkHrs = this.portWrkHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnPortIndCd = this.turnPortIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.peUsdTtlAmt = this.peUsdTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsPortCd = this.vpsPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptSeq = this.clptSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdBrthNo = this.skdBrthNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlHndl40ftTtlQty = this.tmlHndl40ftTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlHndl40ftTtlAmt = this.tmlHndl40ftTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.noonRptInpFlg = this.noonRptInpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portSkdStsCd = this.portSkdStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslDlayRsnDesc = this.vslDlayRsnDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.initEtaDt = this.initEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.shpCallNoUpdUsrId = this.shpCallNoUpdUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lnkDist = this.lnkDist.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsEtdDt = this.vpsEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.initEtbDt = this.initEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.obCgoQty = this.obCgoQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portSkpRsnCd = this.portSkpRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.plismYdCd = this.plismYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsLocCd = this.vpsLocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tgtPortFlg = this.tgtPortFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlVslCd = this.tmlVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.autoSkdCngFlg = this.autoSkdCngFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.initEtdDt = this.initEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlHndl20ftTtlAmt = this.tmlHndl20ftTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdCngStsCd = this.skdCngStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.shpCallNoUpdDt = this.shpCallNoUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usrHdnFlg = this.usrHdnFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnClptIndSeq = this.turnClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usdFlg = this.usdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mnvrOutHrs = this.mnvrOutHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsEtbDt = this.vpsEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsRmk = this.vpsRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnPortFlg = this.turnPortFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.simDt = this.simDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.phsIoRsnCd = this.phsIoRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.maxSpdEstmDepDt = this.maxSpdEstmDepDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlProdQty = this.tmlProdQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlHndl20ftTtlQty = this.tmlHndl20ftTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsEtaDt = this.vpsEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.turnSkdDirCd = this.turnSkdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.addBnkCostAmt = this.addBnkCostAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portSkpTpCd = this.portSkpTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.crnKnt = this.crnKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tdHrs = this.tdHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslDlayRsnCd = this.vslDlayRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlVoyNo = this.tmlVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.callYdIndSeq = this.callYdIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ts20ftTtlAmt = this.ts20ftTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.plismVslCd = this.plismVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.shpCallNo = this.shpCallNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.nxtSlanCd = this.nxtSlanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tsPortCd = this.tsPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prtChkFlg = this.prtChkFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pfEtdDt = this.pfEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ttlDlayHrs = this.ttlDlayHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ftDt = this.ftDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.maxSpdEstmBrthDt = this.maxSpdEstmBrthDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portSkpRsnOffrRmk = this.portSkpRsnOffrRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pfEtaDt = this.pfEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.phsIoRmk = this.phsIoRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pfEtbDt = this.pfEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.actInpFlg = this.actInpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mnvrInHrs = this.mnvrInHrs.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slanCd = this.slanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ydCd = this.ydCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibCgoQty = this.ibCgoQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clptIndSeq = this.clptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.depRptInpFlg = this.depRptInpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ts40ftTtlQty = this.ts40ftTtlQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.oneWayDir = this.oneWayDir.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mrgFlg = this.mrgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vpsAddRmk = this.vpsAddRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
