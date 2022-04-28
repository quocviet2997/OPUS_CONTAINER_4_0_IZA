/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : TesTmlSoCntrListVO.java
*@FileTitle : TesTmlSoCntrListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.15
*@LastModifier : 
*@LastVersion : 1.0
* 2015.04.15  
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

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
public class TesTmlSoCntrListVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<TesTmlSoCntrListVO> models = new ArrayList<TesTmlSoCntrListVO>();

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String vrfyRsltIndCd = null;

    /* Column Info */
    private String stvRvisIndFlg = null;

    /* Column Info */
    private String invGateInDt = null;

    /* Column Info */
    private String cgoRvisIndFlg = null;

    /* Column Info */
    private String blNo = null;

    /* Column Info */
    private String fincVslCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String tmlSoCntrListSeq = null;

    /* Column Info */
    private String cntrTpszCd = null;

    /* Column Info */
    private String tsMtyFlg = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String awkCgoFlg = null;

    /* Column Info */
    private String dcgoClssCd = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String dscrIndCd = null;

    /* Column Info */
    private String mvmtGateOutDt = null;

    /* Column Info */
    private String preYdCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String bkgNo = null;

    /* Column Info */
    private String loclTsIndCd = null;

    /* Column Info */
    private String hndlRsltRmk = null;

    /* Column Info */
    private String tmlRvisIndFlg = null;

    /* Column Info */
    private String railBilDt = null;

    /* Column Info */
    private String rvisGateInFlg = null;

    /* Column Info */
    private String tmlSoSeq = null;

    /* Column Info */
    private String loclUpdDt = null;

    /* Column Info */
    private String rcFlg = null;

    /* Column Info */
    private String mvmtStayDys = null;

    /* Column Info */
    private String subTrdCd = null;

    /* Column Info */
    private String dscrDtlIndCd = null;

    /* Column Info */
    private String laneCd = null;

    /* Column Info */
    private String mvmtGateInDt = null;

    /* Column Info */
    private String invStayDys = null;

    /* Column Info */
    private String tmlTrnsModCd = null;

    /* Column Info */
    private String modiFlg = null;

    /* Column Info */
    private String fincSkdDirCd = null;

    /* Column Info */
    private String gateOutTdDys = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String tmlIfSeq = null;

    /* Column Info */
    private String dscrRsn = null;

    /* Column Info */
    private String edwUpdDt = null;

    /* Column Info */
    private String rcvdeTermIndCd = null;

    /* Column Info */
    private String rvisIndFlg = null;

    /* Column Info */
    private String atbDt = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String gateInTdDys = null;

    /* Column Info */
    private String stoRvisIndFlg = null;

    /* Column Info */
    private String bbCgoFlg = null;

    /* Column Info */
    private String wrkDt = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String iocCd = null;

    /* Column Info */
    private String fincSkdVoyNo = null;

    /* Column Info */
    private String samLoclTsIndCd = null;

    /* Column Info */
    private String loclCreDt = null;

    /* Column Info */
    private String rvisGateOutFlg = null;

    /* Column Info */
    private String clmDt = null;

    /* Column Info */
    private String ioBndCd = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String invGateOutDt = null;

    /* Column Info */
    private String stayDiffDys = null;

    /* Column Info */
    private String cntrStyCd = null;

    /* Column Info */
    private String cntrNo = null;

    /* Column Info */
    private String cntrRmk = null;

    /* Column Info */
    private String tmlSoOfcCtyCd = null;

    /* Column Info */
    private String scrScgRvisIndFlg = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

    public TesTmlSoCntrListVO() {
    }

    public TesTmlSoCntrListVO(String ibflag, String pagerows, String tmlSoOfcCtyCd, String tmlSoSeq, String tmlSoCntrListSeq, String vrfyRsltIndCd, String modiFlg, String dscrIndCd, String dscrDtlIndCd, String rvisIndFlg, String tmlRvisIndFlg, String stoRvisIndFlg, String stvRvisIndFlg, String cgoRvisIndFlg, String rvisGateInFlg, String rvisGateOutFlg, String tmlIfSeq, String vslCd, String skdVoyNo, String skdDirCd, String fincVslCd, String fincSkdVoyNo, String fincSkdDirCd, String ioBndCd, String iocCd, String laneCd, String tmlTrnsModCd, String atbDt, String cntrNo, String cntrTpszCd, String cntrStyCd, String loclTsIndCd, String samLoclTsIndCd, String rcvdeTermIndCd, String preYdCd, String mvmtGateInDt, String invGateInDt, String gateInTdDys, String mvmtGateOutDt, String invGateOutDt, String gateOutTdDys, String mvmtStayDys, String invStayDys, String stayDiffDys, String dcgoClssCd, String bbCgoFlg, String awkCgoFlg, String rcFlg, String wrkDt, String clmDt, String railBilDt, String bkgNo, String blNo, String dscrRsn, String hndlRsltRmk, String cntrRmk, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String subTrdCd, String tsMtyFlg, String edwUpdDt, String scrScgRvisIndFlg) {
        this.vslCd = vslCd;
        this.vrfyRsltIndCd = vrfyRsltIndCd;
        this.stvRvisIndFlg = stvRvisIndFlg;
        this.invGateInDt = invGateInDt;
        this.cgoRvisIndFlg = cgoRvisIndFlg;
        this.blNo = blNo;
        this.fincVslCd = fincVslCd;
        this.pagerows = pagerows;
        this.tmlSoCntrListSeq = tmlSoCntrListSeq;
        this.cntrTpszCd = cntrTpszCd;
        this.tsMtyFlg = tsMtyFlg;
        this.updUsrId = updUsrId;
        this.awkCgoFlg = awkCgoFlg;
        this.dcgoClssCd = dcgoClssCd;
        this.skdVoyNo = skdVoyNo;
        this.dscrIndCd = dscrIndCd;
        this.mvmtGateOutDt = mvmtGateOutDt;
        this.preYdCd = preYdCd;
        this.creUsrId = creUsrId;
        this.bkgNo = bkgNo;
        this.loclTsIndCd = loclTsIndCd;
        this.hndlRsltRmk = hndlRsltRmk;
        this.tmlRvisIndFlg = tmlRvisIndFlg;
        this.railBilDt = railBilDt;
        this.rvisGateInFlg = rvisGateInFlg;
        this.tmlSoSeq = tmlSoSeq;
        this.loclUpdDt = loclUpdDt;
        this.rcFlg = rcFlg;
        this.mvmtStayDys = mvmtStayDys;
        this.subTrdCd = subTrdCd;
        this.dscrDtlIndCd = dscrDtlIndCd;
        this.laneCd = laneCd;
        this.mvmtGateInDt = mvmtGateInDt;
        this.invStayDys = invStayDys;
        this.tmlTrnsModCd = tmlTrnsModCd;
        this.modiFlg = modiFlg;
        this.fincSkdDirCd = fincSkdDirCd;
        this.gateOutTdDys = gateOutTdDys;
        this.creDt = creDt;
        this.tmlIfSeq = tmlIfSeq;
        this.dscrRsn = dscrRsn;
        this.edwUpdDt = edwUpdDt;
        this.rcvdeTermIndCd = rcvdeTermIndCd;
        this.rvisIndFlg = rvisIndFlg;
        this.atbDt = atbDt;
        this.ibflag = ibflag;
        this.gateInTdDys = gateInTdDys;
        this.stoRvisIndFlg = stoRvisIndFlg;
        this.bbCgoFlg = bbCgoFlg;
        this.wrkDt = wrkDt;
        this.updDt = updDt;
        this.iocCd = iocCd;
        this.fincSkdVoyNo = fincSkdVoyNo;
        this.samLoclTsIndCd = samLoclTsIndCd;
        this.loclCreDt = loclCreDt;
        this.rvisGateOutFlg = rvisGateOutFlg;
        this.clmDt = clmDt;
        this.ioBndCd = ioBndCd;
        this.skdDirCd = skdDirCd;
        this.invGateOutDt = invGateOutDt;
        this.stayDiffDys = stayDiffDys;
        this.cntrStyCd = cntrStyCd;
        this.cntrNo = cntrNo;
        this.cntrRmk = cntrRmk;
        this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
        this.scrScgRvisIndFlg = scrScgRvisIndFlg;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("vrfy_rslt_ind_cd", getVrfyRsltIndCd());
        this.hashColumns.put("stv_rvis_ind_flg", getStvRvisIndFlg());
        this.hashColumns.put("inv_gate_in_dt", getInvGateInDt());
        this.hashColumns.put("cgo_rvis_ind_flg", getCgoRvisIndFlg());
        this.hashColumns.put("bl_no", getBlNo());
        this.hashColumns.put("finc_vsl_cd", getFincVslCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("tml_so_cntr_list_seq", getTmlSoCntrListSeq());
        this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
        this.hashColumns.put("ts_mty_flg", getTsMtyFlg());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
        this.hashColumns.put("dcgo_clss_cd", getDcgoClssCd());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("dscr_ind_cd", getDscrIndCd());
        this.hashColumns.put("mvmt_gate_out_dt", getMvmtGateOutDt());
        this.hashColumns.put("pre_yd_cd", getPreYdCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("bkg_no", getBkgNo());
        this.hashColumns.put("locl_ts_ind_cd", getLoclTsIndCd());
        this.hashColumns.put("hndl_rslt_rmk", getHndlRsltRmk());
        this.hashColumns.put("tml_rvis_ind_flg", getTmlRvisIndFlg());
        this.hashColumns.put("rail_bil_dt", getRailBilDt());
        this.hashColumns.put("rvis_gate_in_flg", getRvisGateInFlg());
        this.hashColumns.put("tml_so_seq", getTmlSoSeq());
        this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
        this.hashColumns.put("rc_flg", getRcFlg());
        this.hashColumns.put("mvmt_stay_dys", getMvmtStayDys());
        this.hashColumns.put("sub_trd_cd", getSubTrdCd());
        this.hashColumns.put("dscr_dtl_ind_cd", getDscrDtlIndCd());
        this.hashColumns.put("lane_cd", getLaneCd());
        this.hashColumns.put("mvmt_gate_in_dt", getMvmtGateInDt());
        this.hashColumns.put("inv_stay_dys", getInvStayDys());
        this.hashColumns.put("tml_trns_mod_cd", getTmlTrnsModCd());
        this.hashColumns.put("modi_flg", getModiFlg());
        this.hashColumns.put("finc_skd_dir_cd", getFincSkdDirCd());
        this.hashColumns.put("gate_out_td_dys", getGateOutTdDys());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("tml_if_seq", getTmlIfSeq());
        this.hashColumns.put("dscr_rsn", getDscrRsn());
        this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
        this.hashColumns.put("rcvde_term_ind_cd", getRcvdeTermIndCd());
        this.hashColumns.put("rvis_ind_flg", getRvisIndFlg());
        this.hashColumns.put("atb_dt", getAtbDt());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("gate_in_td_dys", getGateInTdDys());
        this.hashColumns.put("sto_rvis_ind_flg", getStoRvisIndFlg());
        this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
        this.hashColumns.put("wrk_dt", getWrkDt());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("ioc_cd", getIocCd());
        this.hashColumns.put("finc_skd_voy_no", getFincSkdVoyNo());
        this.hashColumns.put("sam_locl_ts_ind_cd", getSamLoclTsIndCd());
        this.hashColumns.put("locl_cre_dt", getLoclCreDt());
        this.hashColumns.put("rvis_gate_out_flg", getRvisGateOutFlg());
        this.hashColumns.put("clm_dt", getClmDt());
        this.hashColumns.put("io_bnd_cd", getIoBndCd());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("inv_gate_out_dt", getInvGateOutDt());
        this.hashColumns.put("stay_diff_dys", getStayDiffDys());
        this.hashColumns.put("cntr_sty_cd", getCntrStyCd());
        this.hashColumns.put("cntr_no", getCntrNo());
        this.hashColumns.put("cntr_rmk", getCntrRmk());
        this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
        this.hashColumns.put("scr_scg_rvis_ind_flg", getScrScgRvisIndFlg());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("vrfy_rslt_ind_cd", "vrfyRsltIndCd");
        this.hashFields.put("stv_rvis_ind_flg", "stvRvisIndFlg");
        this.hashFields.put("inv_gate_in_dt", "invGateInDt");
        this.hashFields.put("cgo_rvis_ind_flg", "cgoRvisIndFlg");
        this.hashFields.put("bl_no", "blNo");
        this.hashFields.put("finc_vsl_cd", "fincVslCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("tml_so_cntr_list_seq", "tmlSoCntrListSeq");
        this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
        this.hashFields.put("ts_mty_flg", "tsMtyFlg");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
        this.hashFields.put("dcgo_clss_cd", "dcgoClssCd");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("dscr_ind_cd", "dscrIndCd");
        this.hashFields.put("mvmt_gate_out_dt", "mvmtGateOutDt");
        this.hashFields.put("pre_yd_cd", "preYdCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("bkg_no", "bkgNo");
        this.hashFields.put("locl_ts_ind_cd", "loclTsIndCd");
        this.hashFields.put("hndl_rslt_rmk", "hndlRsltRmk");
        this.hashFields.put("tml_rvis_ind_flg", "tmlRvisIndFlg");
        this.hashFields.put("rail_bil_dt", "railBilDt");
        this.hashFields.put("rvis_gate_in_flg", "rvisGateInFlg");
        this.hashFields.put("tml_so_seq", "tmlSoSeq");
        this.hashFields.put("locl_upd_dt", "loclUpdDt");
        this.hashFields.put("rc_flg", "rcFlg");
        this.hashFields.put("mvmt_stay_dys", "mvmtStayDys");
        this.hashFields.put("sub_trd_cd", "subTrdCd");
        this.hashFields.put("dscr_dtl_ind_cd", "dscrDtlIndCd");
        this.hashFields.put("lane_cd", "laneCd");
        this.hashFields.put("mvmt_gate_in_dt", "mvmtGateInDt");
        this.hashFields.put("inv_stay_dys", "invStayDys");
        this.hashFields.put("tml_trns_mod_cd", "tmlTrnsModCd");
        this.hashFields.put("modi_flg", "modiFlg");
        this.hashFields.put("finc_skd_dir_cd", "fincSkdDirCd");
        this.hashFields.put("gate_out_td_dys", "gateOutTdDys");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("tml_if_seq", "tmlIfSeq");
        this.hashFields.put("dscr_rsn", "dscrRsn");
        this.hashFields.put("edw_upd_dt", "edwUpdDt");
        this.hashFields.put("rcvde_term_ind_cd", "rcvdeTermIndCd");
        this.hashFields.put("rvis_ind_flg", "rvisIndFlg");
        this.hashFields.put("atb_dt", "atbDt");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("gate_in_td_dys", "gateInTdDys");
        this.hashFields.put("sto_rvis_ind_flg", "stoRvisIndFlg");
        this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
        this.hashFields.put("wrk_dt", "wrkDt");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("ioc_cd", "iocCd");
        this.hashFields.put("finc_skd_voy_no", "fincSkdVoyNo");
        this.hashFields.put("sam_locl_ts_ind_cd", "samLoclTsIndCd");
        this.hashFields.put("locl_cre_dt", "loclCreDt");
        this.hashFields.put("rvis_gate_out_flg", "rvisGateOutFlg");
        this.hashFields.put("clm_dt", "clmDt");
        this.hashFields.put("io_bnd_cd", "ioBndCd");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("inv_gate_out_dt", "invGateOutDt");
        this.hashFields.put("stay_diff_dys", "stayDiffDys");
        this.hashFields.put("cntr_sty_cd", "cntrStyCd");
        this.hashFields.put("cntr_no", "cntrNo");
        this.hashFields.put("cntr_rmk", "cntrRmk");
        this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
        this.hashFields.put("scr_scg_rvis_ind_flg", "scrScgRvisIndFlg");
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
	 * @return vrfyRsltIndCd
	 */
    public String getVrfyRsltIndCd() {
        return this.vrfyRsltIndCd;
    }

    /**
	 * Column Info
	 * @return stvRvisIndFlg
	 */
    public String getStvRvisIndFlg() {
        return this.stvRvisIndFlg;
    }

    /**
	 * Column Info
	 * @return invGateInDt
	 */
    public String getInvGateInDt() {
        return this.invGateInDt;
    }

    /**
	 * Column Info
	 * @return cgoRvisIndFlg
	 */
    public String getCgoRvisIndFlg() {
        return this.cgoRvisIndFlg;
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
	 * @return fincVslCd
	 */
    public String getFincVslCd() {
        return this.fincVslCd;
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
	 * @return tmlSoCntrListSeq
	 */
    public String getTmlSoCntrListSeq() {
        return this.tmlSoCntrListSeq;
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
	 * @return tsMtyFlg
	 */
    public String getTsMtyFlg() {
        return this.tsMtyFlg;
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
	 * @return awkCgoFlg
	 */
    public String getAwkCgoFlg() {
        return this.awkCgoFlg;
    }

    /**
	 * Column Info
	 * @return dcgoClssCd
	 */
    public String getDcgoClssCd() {
        return this.dcgoClssCd;
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
	 * @return dscrIndCd
	 */
    public String getDscrIndCd() {
        return this.dscrIndCd;
    }

    /**
	 * Column Info
	 * @return mvmtGateOutDt
	 */
    public String getMvmtGateOutDt() {
        return this.mvmtGateOutDt;
    }

    /**
	 * Column Info
	 * @return preYdCd
	 */
    public String getPreYdCd() {
        return this.preYdCd;
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
	 * @return loclTsIndCd
	 */
    public String getLoclTsIndCd() {
        return this.loclTsIndCd;
    }

    /**
	 * Column Info
	 * @return hndlRsltRmk
	 */
    public String getHndlRsltRmk() {
        return this.hndlRsltRmk;
    }

    /**
	 * Column Info
	 * @return tmlRvisIndFlg
	 */
    public String getTmlRvisIndFlg() {
        return this.tmlRvisIndFlg;
    }

    /**
	 * Column Info
	 * @return railBilDt
	 */
    public String getRailBilDt() {
        return this.railBilDt;
    }

    /**
	 * Column Info
	 * @return rvisGateInFlg
	 */
    public String getRvisGateInFlg() {
        return this.rvisGateInFlg;
    }

    /**
	 * Column Info
	 * @return tmlSoSeq
	 */
    public String getTmlSoSeq() {
        return this.tmlSoSeq;
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
	 * @return rcFlg
	 */
    public String getRcFlg() {
        return this.rcFlg;
    }

    /**
	 * Column Info
	 * @return mvmtStayDys
	 */
    public String getMvmtStayDys() {
        return this.mvmtStayDys;
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
	 * @return dscrDtlIndCd
	 */
    public String getDscrDtlIndCd() {
        return this.dscrDtlIndCd;
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
	 * @return mvmtGateInDt
	 */
    public String getMvmtGateInDt() {
        return this.mvmtGateInDt;
    }

    /**
	 * Column Info
	 * @return invStayDys
	 */
    public String getInvStayDys() {
        return this.invStayDys;
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
	 * @return modiFlg
	 */
    public String getModiFlg() {
        return this.modiFlg;
    }

    /**
	 * Column Info
	 * @return fincSkdDirCd
	 */
    public String getFincSkdDirCd() {
        return this.fincSkdDirCd;
    }

    /**
	 * Column Info
	 * @return gateOutTdDys
	 */
    public String getGateOutTdDys() {
        return this.gateOutTdDys;
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
	 * @return tmlIfSeq
	 */
    public String getTmlIfSeq() {
        return this.tmlIfSeq;
    }

    /**
	 * Column Info
	 * @return dscrRsn
	 */
    public String getDscrRsn() {
        return this.dscrRsn;
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
	 * @return rcvdeTermIndCd
	 */
    public String getRcvdeTermIndCd() {
        return this.rcvdeTermIndCd;
    }

    /**
	 * Column Info
	 * @return rvisIndFlg
	 */
    public String getRvisIndFlg() {
        return this.rvisIndFlg;
    }

    /**
	 * Column Info
	 * @return atbDt
	 */
    public String getAtbDt() {
        return this.atbDt;
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
	 * @return gateInTdDys
	 */
    public String getGateInTdDys() {
        return this.gateInTdDys;
    }

    /**
	 * Column Info
	 * @return stoRvisIndFlg
	 */
    public String getStoRvisIndFlg() {
        return this.stoRvisIndFlg;
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
	 * @return wrkDt
	 */
    public String getWrkDt() {
        return this.wrkDt;
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
	 * @return fincSkdVoyNo
	 */
    public String getFincSkdVoyNo() {
        return this.fincSkdVoyNo;
    }

    /**
	 * Column Info
	 * @return samLoclTsIndCd
	 */
    public String getSamLoclTsIndCd() {
        return this.samLoclTsIndCd;
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
	 * @return rvisGateOutFlg
	 */
    public String getRvisGateOutFlg() {
        return this.rvisGateOutFlg;
    }

    /**
	 * Column Info
	 * @return clmDt
	 */
    public String getClmDt() {
        return this.clmDt;
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
	 * @return skdDirCd
	 */
    public String getSkdDirCd() {
        return this.skdDirCd;
    }

    /**
	 * Column Info
	 * @return invGateOutDt
	 */
    public String getInvGateOutDt() {
        return this.invGateOutDt;
    }

    /**
	 * Column Info
	 * @return stayDiffDys
	 */
    public String getStayDiffDys() {
        return this.stayDiffDys;
    }

    /**
	 * Column Info
	 * @return cntrStyCd
	 */
    public String getCntrStyCd() {
        return this.cntrStyCd;
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
	 * @return cntrRmk
	 */
    public String getCntrRmk() {
        return this.cntrRmk;
    }

    /**
	 * Column Info
	 * @return tmlSoOfcCtyCd
	 */
    public String getTmlSoOfcCtyCd() {
        return this.tmlSoOfcCtyCd;
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
	 * @param vrfyRsltIndCd
	 */
    public void setVrfyRsltIndCd(String vrfyRsltIndCd) {
        this.vrfyRsltIndCd = vrfyRsltIndCd;
    }

    /**
	 * Column Info
	 * @param stvRvisIndFlg
	 */
    public void setStvRvisIndFlg(String stvRvisIndFlg) {
        this.stvRvisIndFlg = stvRvisIndFlg;
    }

    /**
	 * Column Info
	 * @param invGateInDt
	 */
    public void setInvGateInDt(String invGateInDt) {
        this.invGateInDt = invGateInDt;
    }

    /**
	 * Column Info
	 * @param cgoRvisIndFlg
	 */
    public void setCgoRvisIndFlg(String cgoRvisIndFlg) {
        this.cgoRvisIndFlg = cgoRvisIndFlg;
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
	 * @param fincVslCd
	 */
    public void setFincVslCd(String fincVslCd) {
        this.fincVslCd = fincVslCd;
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
	 * @param tmlSoCntrListSeq
	 */
    public void setTmlSoCntrListSeq(String tmlSoCntrListSeq) {
        this.tmlSoCntrListSeq = tmlSoCntrListSeq;
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
	 * @param tsMtyFlg
	 */
    public void setTsMtyFlg(String tsMtyFlg) {
        this.tsMtyFlg = tsMtyFlg;
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
	 * @param awkCgoFlg
	 */
    public void setAwkCgoFlg(String awkCgoFlg) {
        this.awkCgoFlg = awkCgoFlg;
    }

    /**
	 * Column Info
	 * @param dcgoClssCd
	 */
    public void setDcgoClssCd(String dcgoClssCd) {
        this.dcgoClssCd = dcgoClssCd;
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
	 * @param dscrIndCd
	 */
    public void setDscrIndCd(String dscrIndCd) {
        this.dscrIndCd = dscrIndCd;
    }

    /**
	 * Column Info
	 * @param mvmtGateOutDt
	 */
    public void setMvmtGateOutDt(String mvmtGateOutDt) {
        this.mvmtGateOutDt = mvmtGateOutDt;
    }

    /**
	 * Column Info
	 * @param preYdCd
	 */
    public void setPreYdCd(String preYdCd) {
        this.preYdCd = preYdCd;
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
	 * @param loclTsIndCd
	 */
    public void setLoclTsIndCd(String loclTsIndCd) {
        this.loclTsIndCd = loclTsIndCd;
    }

    /**
	 * Column Info
	 * @param hndlRsltRmk
	 */
    public void setHndlRsltRmk(String hndlRsltRmk) {
        this.hndlRsltRmk = hndlRsltRmk;
    }

    /**
	 * Column Info
	 * @param tmlRvisIndFlg
	 */
    public void setTmlRvisIndFlg(String tmlRvisIndFlg) {
        this.tmlRvisIndFlg = tmlRvisIndFlg;
    }

    /**
	 * Column Info
	 * @param railBilDt
	 */
    public void setRailBilDt(String railBilDt) {
        this.railBilDt = railBilDt;
    }

    /**
	 * Column Info
	 * @param rvisGateInFlg
	 */
    public void setRvisGateInFlg(String rvisGateInFlg) {
        this.rvisGateInFlg = rvisGateInFlg;
    }

    /**
	 * Column Info
	 * @param tmlSoSeq
	 */
    public void setTmlSoSeq(String tmlSoSeq) {
        this.tmlSoSeq = tmlSoSeq;
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
	 * @param rcFlg
	 */
    public void setRcFlg(String rcFlg) {
        this.rcFlg = rcFlg;
    }

    /**
	 * Column Info
	 * @param mvmtStayDys
	 */
    public void setMvmtStayDys(String mvmtStayDys) {
        this.mvmtStayDys = mvmtStayDys;
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
	 * @param dscrDtlIndCd
	 */
    public void setDscrDtlIndCd(String dscrDtlIndCd) {
        this.dscrDtlIndCd = dscrDtlIndCd;
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
	 * @param mvmtGateInDt
	 */
    public void setMvmtGateInDt(String mvmtGateInDt) {
        this.mvmtGateInDt = mvmtGateInDt;
    }

    /**
	 * Column Info
	 * @param invStayDys
	 */
    public void setInvStayDys(String invStayDys) {
        this.invStayDys = invStayDys;
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
	 * @param modiFlg
	 */
    public void setModiFlg(String modiFlg) {
        this.modiFlg = modiFlg;
    }

    /**
	 * Column Info
	 * @param fincSkdDirCd
	 */
    public void setFincSkdDirCd(String fincSkdDirCd) {
        this.fincSkdDirCd = fincSkdDirCd;
    }

    /**
	 * Column Info
	 * @param gateOutTdDys
	 */
    public void setGateOutTdDys(String gateOutTdDys) {
        this.gateOutTdDys = gateOutTdDys;
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
	 * @param tmlIfSeq
	 */
    public void setTmlIfSeq(String tmlIfSeq) {
        this.tmlIfSeq = tmlIfSeq;
    }

    /**
	 * Column Info
	 * @param dscrRsn
	 */
    public void setDscrRsn(String dscrRsn) {
        this.dscrRsn = dscrRsn;
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
	 * @param rcvdeTermIndCd
	 */
    public void setRcvdeTermIndCd(String rcvdeTermIndCd) {
        this.rcvdeTermIndCd = rcvdeTermIndCd;
    }

    /**
	 * Column Info
	 * @param rvisIndFlg
	 */
    public void setRvisIndFlg(String rvisIndFlg) {
        this.rvisIndFlg = rvisIndFlg;
    }

    /**
	 * Column Info
	 * @param atbDt
	 */
    public void setAtbDt(String atbDt) {
        this.atbDt = atbDt;
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
	 * @param gateInTdDys
	 */
    public void setGateInTdDys(String gateInTdDys) {
        this.gateInTdDys = gateInTdDys;
    }

    /**
	 * Column Info
	 * @param stoRvisIndFlg
	 */
    public void setStoRvisIndFlg(String stoRvisIndFlg) {
        this.stoRvisIndFlg = stoRvisIndFlg;
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
	 * @param wrkDt
	 */
    public void setWrkDt(String wrkDt) {
        this.wrkDt = wrkDt;
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
	 * @param fincSkdVoyNo
	 */
    public void setFincSkdVoyNo(String fincSkdVoyNo) {
        this.fincSkdVoyNo = fincSkdVoyNo;
    }

    /**
	 * Column Info
	 * @param samLoclTsIndCd
	 */
    public void setSamLoclTsIndCd(String samLoclTsIndCd) {
        this.samLoclTsIndCd = samLoclTsIndCd;
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
	 * @param rvisGateOutFlg
	 */
    public void setRvisGateOutFlg(String rvisGateOutFlg) {
        this.rvisGateOutFlg = rvisGateOutFlg;
    }

    /**
	 * Column Info
	 * @param clmDt
	 */
    public void setClmDt(String clmDt) {
        this.clmDt = clmDt;
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
	 * @param skdDirCd
	 */
    public void setSkdDirCd(String skdDirCd) {
        this.skdDirCd = skdDirCd;
    }

    /**
	 * Column Info
	 * @param invGateOutDt
	 */
    public void setInvGateOutDt(String invGateOutDt) {
        this.invGateOutDt = invGateOutDt;
    }

    /**
	 * Column Info
	 * @param stayDiffDys
	 */
    public void setStayDiffDys(String stayDiffDys) {
        this.stayDiffDys = stayDiffDys;
    }

    /**
	 * Column Info
	 * @param cntrStyCd
	 */
    public void setCntrStyCd(String cntrStyCd) {
        this.cntrStyCd = cntrStyCd;
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
	 * @param cntrRmk
	 */
    public void setCntrRmk(String cntrRmk) {
        this.cntrRmk = cntrRmk;
    }

    /**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
    public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
        this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
    }

    public void setScrScgRvisIndFlg(String scrScgRvisIndFlg) {
        this.scrScgRvisIndFlg = scrScgRvisIndFlg;
    }

    public String getScrScgRvisIndFlg() {
        return this.scrScgRvisIndFlg;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        fromRequest(request, "");
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request, String prefix) {
        setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
        setVrfyRsltIndCd(JSPUtil.getParameter(request, prefix + "vrfy_rslt_ind_cd", ""));
        setStvRvisIndFlg(JSPUtil.getParameter(request, prefix + "stv_rvis_ind_flg", ""));
        setInvGateInDt(JSPUtil.getParameter(request, prefix + "inv_gate_in_dt", ""));
        setCgoRvisIndFlg(JSPUtil.getParameter(request, prefix + "cgo_rvis_ind_flg", ""));
        setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
        setFincVslCd(JSPUtil.getParameter(request, prefix + "finc_vsl_cd", ""));
        setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
        setTmlSoCntrListSeq(JSPUtil.getParameter(request, prefix + "tml_so_cntr_list_seq", ""));
        setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
        setTsMtyFlg(JSPUtil.getParameter(request, prefix + "ts_mty_flg", ""));
        setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
        setAwkCgoFlg(JSPUtil.getParameter(request, prefix + "awk_cgo_flg", ""));
        setDcgoClssCd(JSPUtil.getParameter(request, prefix + "dcgo_clss_cd", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
        setDscrIndCd(JSPUtil.getParameter(request, prefix + "dscr_ind_cd", ""));
        setMvmtGateOutDt(JSPUtil.getParameter(request, prefix + "mvmt_gate_out_dt", ""));
        setPreYdCd(JSPUtil.getParameter(request, prefix + "pre_yd_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
        setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
        setLoclTsIndCd(JSPUtil.getParameter(request, prefix + "locl_ts_ind_cd", ""));
        setHndlRsltRmk(JSPUtil.getParameter(request, prefix + "hndl_rslt_rmk", ""));
        setTmlRvisIndFlg(JSPUtil.getParameter(request, prefix + "tml_rvis_ind_flg", ""));
        setRailBilDt(JSPUtil.getParameter(request, prefix + "rail_bil_dt", ""));
        setRvisGateInFlg(JSPUtil.getParameter(request, prefix + "rvis_gate_in_flg", ""));
        setTmlSoSeq(JSPUtil.getParameter(request, prefix + "tml_so_seq", ""));
        setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
        setRcFlg(JSPUtil.getParameter(request, prefix + "rc_flg", ""));
        setMvmtStayDys(JSPUtil.getParameter(request, prefix + "mvmt_stay_dys", ""));
        setSubTrdCd(JSPUtil.getParameter(request, prefix + "sub_trd_cd", ""));
        setDscrDtlIndCd(JSPUtil.getParameter(request, prefix + "dscr_dtl_ind_cd", ""));
        setLaneCd(JSPUtil.getParameter(request, prefix + "lane_cd", ""));
        setMvmtGateInDt(JSPUtil.getParameter(request, prefix + "mvmt_gate_in_dt", ""));
        setInvStayDys(JSPUtil.getParameter(request, prefix + "inv_stay_dys", ""));
        setTmlTrnsModCd(JSPUtil.getParameter(request, prefix + "tml_trns_mod_cd", ""));
        setModiFlg(JSPUtil.getParameter(request, prefix + "modi_flg", ""));
        setFincSkdDirCd(JSPUtil.getParameter(request, prefix + "finc_skd_dir_cd", ""));
        setGateOutTdDys(JSPUtil.getParameter(request, prefix + "gate_out_td_dys", ""));
        setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
        setTmlIfSeq(JSPUtil.getParameter(request, prefix + "tml_if_seq", ""));
        setDscrRsn(JSPUtil.getParameter(request, prefix + "dscr_rsn", ""));
        setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
        setRcvdeTermIndCd(JSPUtil.getParameter(request, prefix + "rcvde_term_ind_cd", ""));
        setRvisIndFlg(JSPUtil.getParameter(request, prefix + "rvis_ind_flg", ""));
        setAtbDt(JSPUtil.getParameter(request, prefix + "atb_dt", ""));
        setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
        setGateInTdDys(JSPUtil.getParameter(request, prefix + "gate_in_td_dys", ""));
        setStoRvisIndFlg(JSPUtil.getParameter(request, prefix + "sto_rvis_ind_flg", ""));
        setBbCgoFlg(JSPUtil.getParameter(request, prefix + "bb_cgo_flg", ""));
        setWrkDt(JSPUtil.getParameter(request, prefix + "wrk_dt", ""));
        setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
        setIocCd(JSPUtil.getParameter(request, prefix + "ioc_cd", ""));
        setFincSkdVoyNo(JSPUtil.getParameter(request, prefix + "finc_skd_voy_no", ""));
        setSamLoclTsIndCd(JSPUtil.getParameter(request, prefix + "sam_locl_ts_ind_cd", ""));
        setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
        setRvisGateOutFlg(JSPUtil.getParameter(request, prefix + "rvis_gate_out_flg", ""));
        setClmDt(JSPUtil.getParameter(request, prefix + "clm_dt", ""));
        setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
        setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
        setInvGateOutDt(JSPUtil.getParameter(request, prefix + "inv_gate_out_dt", ""));
        setStayDiffDys(JSPUtil.getParameter(request, prefix + "stay_diff_dys", ""));
        setCntrStyCd(JSPUtil.getParameter(request, prefix + "cntr_sty_cd", ""));
        setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
        setCntrRmk(JSPUtil.getParameter(request, prefix + "cntr_rmk", ""));
        setTmlSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", ""));
        setScrScgRvisIndFlg(JSPUtil.getParameter(request, prefix + "scr_scg_rvis_ind_flg", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlSoCntrListVO[]
	 */
    public TesTmlSoCntrListVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlSoCntrListVO[]
	 */
    public TesTmlSoCntrListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        TesTmlSoCntrListVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] vrfyRsltIndCd = (JSPUtil.getParameter(request, prefix + "vrfy_rslt_ind_cd", length));
            String[] stvRvisIndFlg = (JSPUtil.getParameter(request, prefix + "stv_rvis_ind_flg", length));
            String[] invGateInDt = (JSPUtil.getParameter(request, prefix + "inv_gate_in_dt", length));
            String[] cgoRvisIndFlg = (JSPUtil.getParameter(request, prefix + "cgo_rvis_ind_flg", length));
            String[] blNo = (JSPUtil.getParameter(request, prefix + "bl_no", length));
            String[] fincVslCd = (JSPUtil.getParameter(request, prefix + "finc_vsl_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] tmlSoCntrListSeq = (JSPUtil.getParameter(request, prefix + "tml_so_cntr_list_seq", length));
            String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", length));
            String[] tsMtyFlg = (JSPUtil.getParameter(request, prefix + "ts_mty_flg", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix + "awk_cgo_flg", length));
            String[] dcgoClssCd = (JSPUtil.getParameter(request, prefix + "dcgo_clss_cd", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] dscrIndCd = (JSPUtil.getParameter(request, prefix + "dscr_ind_cd", length));
            String[] mvmtGateOutDt = (JSPUtil.getParameter(request, prefix + "mvmt_gate_out_dt", length));
            String[] preYdCd = (JSPUtil.getParameter(request, prefix + "pre_yd_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no", length));
            String[] loclTsIndCd = (JSPUtil.getParameter(request, prefix + "locl_ts_ind_cd", length));
            String[] hndlRsltRmk = (JSPUtil.getParameter(request, prefix + "hndl_rslt_rmk", length));
            String[] tmlRvisIndFlg = (JSPUtil.getParameter(request, prefix + "tml_rvis_ind_flg", length));
            String[] railBilDt = (JSPUtil.getParameter(request, prefix + "rail_bil_dt", length));
            String[] rvisGateInFlg = (JSPUtil.getParameter(request, prefix + "rvis_gate_in_flg", length));
            String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix + "tml_so_seq", length));
            String[] loclUpdDt = (JSPUtil.getParameter(request, prefix + "locl_upd_dt", length));
            String[] rcFlg = (JSPUtil.getParameter(request, prefix + "rc_flg", length));
            String[] mvmtStayDys = (JSPUtil.getParameter(request, prefix + "mvmt_stay_dys", length));
            String[] subTrdCd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd", length));
            String[] dscrDtlIndCd = (JSPUtil.getParameter(request, prefix + "dscr_dtl_ind_cd", length));
            String[] laneCd = (JSPUtil.getParameter(request, prefix + "lane_cd", length));
            String[] mvmtGateInDt = (JSPUtil.getParameter(request, prefix + "mvmt_gate_in_dt", length));
            String[] invStayDys = (JSPUtil.getParameter(request, prefix + "inv_stay_dys", length));
            String[] tmlTrnsModCd = (JSPUtil.getParameter(request, prefix + "tml_trns_mod_cd", length));
            String[] modiFlg = (JSPUtil.getParameter(request, prefix + "modi_flg", length));
            String[] fincSkdDirCd = (JSPUtil.getParameter(request, prefix + "finc_skd_dir_cd", length));
            String[] gateOutTdDys = (JSPUtil.getParameter(request, prefix + "gate_out_td_dys", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] tmlIfSeq = (JSPUtil.getParameter(request, prefix + "tml_if_seq", length));
            String[] dscrRsn = (JSPUtil.getParameter(request, prefix + "dscr_rsn", length));
            String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
            String[] rcvdeTermIndCd = (JSPUtil.getParameter(request, prefix + "rcvde_term_ind_cd", length));
            String[] rvisIndFlg = (JSPUtil.getParameter(request, prefix + "rvis_ind_flg", length));
            String[] atbDt = (JSPUtil.getParameter(request, prefix + "atb_dt", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] gateInTdDys = (JSPUtil.getParameter(request, prefix + "gate_in_td_dys", length));
            String[] stoRvisIndFlg = (JSPUtil.getParameter(request, prefix + "sto_rvis_ind_flg", length));
            String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix + "bb_cgo_flg", length));
            String[] wrkDt = (JSPUtil.getParameter(request, prefix + "wrk_dt", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] iocCd = (JSPUtil.getParameter(request, prefix + "ioc_cd", length));
            String[] fincSkdVoyNo = (JSPUtil.getParameter(request, prefix + "finc_skd_voy_no", length));
            String[] samLoclTsIndCd = (JSPUtil.getParameter(request, prefix + "sam_locl_ts_ind_cd", length));
            String[] loclCreDt = (JSPUtil.getParameter(request, prefix + "locl_cre_dt", length));
            String[] rvisGateOutFlg = (JSPUtil.getParameter(request, prefix + "rvis_gate_out_flg", length));
            String[] clmDt = (JSPUtil.getParameter(request, prefix + "clm_dt", length));
            String[] ioBndCd = (JSPUtil.getParameter(request, prefix + "io_bnd_cd", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] invGateOutDt = (JSPUtil.getParameter(request, prefix + "inv_gate_out_dt", length));
            String[] stayDiffDys = (JSPUtil.getParameter(request, prefix + "stay_diff_dys", length));
            String[] cntrStyCd = (JSPUtil.getParameter(request, prefix + "cntr_sty_cd", length));
            String[] cntrNo = (JSPUtil.getParameter(request, prefix + "cntr_no", length));
            String[] cntrRmk = (JSPUtil.getParameter(request, prefix + "cntr_rmk", length));
            String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", length));
            String[] scrScgRvisIndFlg = (JSPUtil.getParameter(request, prefix + "scr_scg_rvis_ind_flg", length));
            for (int i = 0; i < length; i++) {
                model = new TesTmlSoCntrListVO();
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (vrfyRsltIndCd[i] != null)
                    model.setVrfyRsltIndCd(vrfyRsltIndCd[i]);
                if (stvRvisIndFlg[i] != null)
                    model.setStvRvisIndFlg(stvRvisIndFlg[i]);
                if (invGateInDt[i] != null)
                    model.setInvGateInDt(invGateInDt[i]);
                if (cgoRvisIndFlg[i] != null)
                    model.setCgoRvisIndFlg(cgoRvisIndFlg[i]);
                if (blNo[i] != null)
                    model.setBlNo(blNo[i]);
                if (fincVslCd[i] != null)
                    model.setFincVslCd(fincVslCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (tmlSoCntrListSeq[i] != null)
                    model.setTmlSoCntrListSeq(tmlSoCntrListSeq[i]);
                if (cntrTpszCd[i] != null)
                    model.setCntrTpszCd(cntrTpszCd[i]);
                if (tsMtyFlg[i] != null)
                    model.setTsMtyFlg(tsMtyFlg[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (awkCgoFlg[i] != null)
                    model.setAwkCgoFlg(awkCgoFlg[i]);
                if (dcgoClssCd[i] != null)
                    model.setDcgoClssCd(dcgoClssCd[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (dscrIndCd[i] != null)
                    model.setDscrIndCd(dscrIndCd[i]);
                if (mvmtGateOutDt[i] != null)
                    model.setMvmtGateOutDt(mvmtGateOutDt[i]);
                if (preYdCd[i] != null)
                    model.setPreYdCd(preYdCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (bkgNo[i] != null)
                    model.setBkgNo(bkgNo[i]);
                if (loclTsIndCd[i] != null)
                    model.setLoclTsIndCd(loclTsIndCd[i]);
                if (hndlRsltRmk[i] != null)
                    model.setHndlRsltRmk(hndlRsltRmk[i]);
                if (tmlRvisIndFlg[i] != null)
                    model.setTmlRvisIndFlg(tmlRvisIndFlg[i]);
                if (railBilDt[i] != null)
                    model.setRailBilDt(railBilDt[i]);
                if (rvisGateInFlg[i] != null)
                    model.setRvisGateInFlg(rvisGateInFlg[i]);
                if (tmlSoSeq[i] != null)
                    model.setTmlSoSeq(tmlSoSeq[i]);
                if (loclUpdDt[i] != null)
                    model.setLoclUpdDt(loclUpdDt[i]);
                if (rcFlg[i] != null)
                    model.setRcFlg(rcFlg[i]);
                if (mvmtStayDys[i] != null)
                    model.setMvmtStayDys(mvmtStayDys[i]);
                if (subTrdCd[i] != null)
                    model.setSubTrdCd(subTrdCd[i]);
                if (dscrDtlIndCd[i] != null)
                    model.setDscrDtlIndCd(dscrDtlIndCd[i]);
                if (laneCd[i] != null)
                    model.setLaneCd(laneCd[i]);
                if (mvmtGateInDt[i] != null)
                    model.setMvmtGateInDt(mvmtGateInDt[i]);
                if (invStayDys[i] != null)
                    model.setInvStayDys(invStayDys[i]);
                if (tmlTrnsModCd[i] != null)
                    model.setTmlTrnsModCd(tmlTrnsModCd[i]);
                if (modiFlg[i] != null)
                    model.setModiFlg(modiFlg[i]);
                if (fincSkdDirCd[i] != null)
                    model.setFincSkdDirCd(fincSkdDirCd[i]);
                if (gateOutTdDys[i] != null)
                    model.setGateOutTdDys(gateOutTdDys[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (tmlIfSeq[i] != null)
                    model.setTmlIfSeq(tmlIfSeq[i]);
                if (dscrRsn[i] != null)
                    model.setDscrRsn(dscrRsn[i]);
                if (edwUpdDt[i] != null)
                    model.setEdwUpdDt(edwUpdDt[i]);
                if (rcvdeTermIndCd[i] != null)
                    model.setRcvdeTermIndCd(rcvdeTermIndCd[i]);
                if (rvisIndFlg[i] != null)
                    model.setRvisIndFlg(rvisIndFlg[i]);
                if (atbDt[i] != null)
                    model.setAtbDt(atbDt[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (gateInTdDys[i] != null)
                    model.setGateInTdDys(gateInTdDys[i]);
                if (stoRvisIndFlg[i] != null)
                    model.setStoRvisIndFlg(stoRvisIndFlg[i]);
                if (bbCgoFlg[i] != null)
                    model.setBbCgoFlg(bbCgoFlg[i]);
                if (wrkDt[i] != null)
                    model.setWrkDt(wrkDt[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (iocCd[i] != null)
                    model.setIocCd(iocCd[i]);
                if (fincSkdVoyNo[i] != null)
                    model.setFincSkdVoyNo(fincSkdVoyNo[i]);
                if (samLoclTsIndCd[i] != null)
                    model.setSamLoclTsIndCd(samLoclTsIndCd[i]);
                if (loclCreDt[i] != null)
                    model.setLoclCreDt(loclCreDt[i]);
                if (rvisGateOutFlg[i] != null)
                    model.setRvisGateOutFlg(rvisGateOutFlg[i]);
                if (clmDt[i] != null)
                    model.setClmDt(clmDt[i]);
                if (ioBndCd[i] != null)
                    model.setIoBndCd(ioBndCd[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (invGateOutDt[i] != null)
                    model.setInvGateOutDt(invGateOutDt[i]);
                if (stayDiffDys[i] != null)
                    model.setStayDiffDys(stayDiffDys[i]);
                if (cntrStyCd[i] != null)
                    model.setCntrStyCd(cntrStyCd[i]);
                if (cntrNo[i] != null)
                    model.setCntrNo(cntrNo[i]);
                if (cntrRmk[i] != null)
                    model.setCntrRmk(cntrRmk[i]);
                if (tmlSoOfcCtyCd[i] != null)
                    model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
                if (scrScgRvisIndFlg[i] != null)
                	model.setScrScgRvisIndFlg(scrScgRvisIndFlg[i]);
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getTesTmlSoCntrListVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return TesTmlSoCntrListVO[]
	 */
    public TesTmlSoCntrListVO[] getTesTmlSoCntrListVOs() {
        TesTmlSoCntrListVO[] vos = (TesTmlSoCntrListVO[]) models.toArray(new TesTmlSoCntrListVO[models.size()]);
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
        this.vrfyRsltIndCd = this.vrfyRsltIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stvRvisIndFlg = this.stvRvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invGateInDt = this.invGateInDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cgoRvisIndFlg = this.cgoRvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blNo = this.blNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fincVslCd = this.fincVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlSoCntrListSeq = this.tmlSoCntrListSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrTpszCd = this.cntrTpszCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tsMtyFlg = this.tsMtyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awkCgoFlg = this.awkCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dcgoClssCd = this.dcgoClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dscrIndCd = this.dscrIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mvmtGateOutDt = this.mvmtGateOutDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.preYdCd = this.preYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclTsIndCd = this.loclTsIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hndlRsltRmk = this.hndlRsltRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlRvisIndFlg = this.tmlRvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.railBilDt = this.railBilDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rvisGateInFlg = this.rvisGateInFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlSoSeq = this.tmlSoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclUpdDt = this.loclUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcFlg = this.rcFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mvmtStayDys = this.mvmtStayDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.subTrdCd = this.subTrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dscrDtlIndCd = this.dscrDtlIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.laneCd = this.laneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mvmtGateInDt = this.mvmtGateInDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invStayDys = this.invStayDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlTrnsModCd = this.tmlTrnsModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.modiFlg = this.modiFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fincSkdDirCd = this.fincSkdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.gateOutTdDys = this.gateOutTdDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlIfSeq = this.tmlIfSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dscrRsn = this.dscrRsn.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcvdeTermIndCd = this.rcvdeTermIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rvisIndFlg = this.rvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.atbDt = this.atbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.gateInTdDys = this.gateInTdDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stoRvisIndFlg = this.stoRvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bbCgoFlg = this.bbCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.wrkDt = this.wrkDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.iocCd = this.iocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fincSkdVoyNo = this.fincSkdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.samLoclTsIndCd = this.samLoclTsIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.loclCreDt = this.loclCreDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rvisGateOutFlg = this.rvisGateOutFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clmDt = this.clmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ioBndCd = this.ioBndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.invGateOutDt = this.invGateOutDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stayDiffDys = this.stayDiffDys.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrStyCd = this.cntrStyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrNo = this.cntrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cntrRmk = this.cntrRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.scrScgRvisIndFlg = this.scrScgRvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
