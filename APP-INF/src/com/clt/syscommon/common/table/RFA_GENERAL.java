/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RFA_GENERAL.java
*@FileTitle : Contract No 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-11 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author sangyool pak
 * @since J2EE 1.4
 */public final class RFA_GENERAL implements java.io.Serializable {

    private String           ibflag           = "";
    private String           page_rows        = "";
    private String           qtn_ofc          = "";
    private String           qtn_seq          = "";
    private String           rfa_ofc          = "";
    private String           rfa_seq          = "";
    private String           rg_rfa_sts       = "";
    private String           sales_ofc        = "";
    private String           srep_cd          = "";
    private String           auth_ofc         = "";
    private String           auth_staff       = "";
    private String           sc_no            = "";
    private String           rg_cgo_tp        = "";
    private String           rg_dtl_ind       = "";
    private String           cmdt_cd          = "";
    private String           cmdt_tli_no      = "";
    private String           rg_cmdt_desc     = "";
    private String           rep_cmdt_cd      = "";
    private String           rg_conf_cmdt_cd  = "";
    private String           rg_dead_slt_20   = "";
    private String           rg_dead_slt_40   = "";
    private String           rg_ttl_wgt       = "";
    private String           rg_meas_unit     = "";
    private String           svc_scp_cd       = "";
    private String           rg_ttl_qty       = "";
    private String           rg_pymt_term     = "";
    private String           rg_eff_dt        = "";
    private String           rg_exp_dt        = "";
    private String           rg_ath_dt        = "";
    private String           rg_fil_dt        = "";
    private String           rg_cxl_dt        = "";
    private String           cxl_ind          = "";
    private String           rg_cr_dt         = "";
    private String           rg_up_dt         = "";
    private String           rg_usr_id        = "";
    private String           rg_rar_auth_no   = "";
    private String           rg_svr_id        = "";
    private String           rg_rep_ind       = "";
    private String           rg_trf_item_no   = "";
    private String           rg_trf_ln_itm_no = "";
    private String           rg_srep_nm       = "";
    private String           rg_no_dup_chk    = "";
    private String           rfa_auth_no      = "";
    private String           rg_qtn_mode      = "";
    private String           nis_event_dt     = "";
    private String           rg_bis_ind       = "";

    public RFA_GENERAL(){}

    public RFA_GENERAL(
            String           ibflag          ,
            String           page_rows       ,
            String           qtn_ofc         ,
            String           qtn_seq         ,
            String           rfa_ofc         ,
            String           rfa_seq         ,
            String           rg_rfa_sts      ,
            String           sales_ofc       ,
            String           srep_cd         ,
            String           auth_ofc        ,
            String           auth_staff      ,
            String           sc_no           ,
            String           rg_cgo_tp       ,
            String           rg_dtl_ind      ,
            String           cmdt_cd         ,
            String           cmdt_tli_no     ,
            String           rg_cmdt_desc    ,
            String           rep_cmdt_cd     ,
            String           rg_conf_cmdt_cd ,
            String           rg_dead_slt_20  ,
            String           rg_dead_slt_40  ,
            String           rg_ttl_wgt      ,
            String           rg_meas_unit    ,
            String           svc_scp_cd      ,
            String           rg_ttl_qty      ,
            String           rg_pymt_term    ,
            String           rg_eff_dt       ,
            String           rg_exp_dt       ,
            String           rg_ath_dt       ,
            String           rg_fil_dt       ,
            String           rg_cxl_dt       ,
            String           cxl_ind         ,
            String           rg_cr_dt        ,
            String           rg_up_dt        ,
            String           rg_usr_id       ,
            String           rg_rar_auth_no  ,
            String           rg_svr_id       ,
            String           rg_rep_ind      ,
            String           rg_trf_item_no  ,
            String           rg_trf_ln_itm_no,
            String           rg_srep_nm      ,
            String           rg_no_dup_chk   ,
            String           rfa_auth_no     ,
            String           rg_qtn_mode     ,
            String           nis_event_dt    ,
            String           rg_bis_ind      ){
        this.ibflag           = ibflag          ;
        this.page_rows        = page_rows       ;
        this.qtn_ofc          = qtn_ofc         ;
        this.qtn_seq          = qtn_seq         ;
        this.rfa_ofc          = rfa_ofc         ;
        this.rfa_seq          = rfa_seq         ;
        this.rg_rfa_sts       = rg_rfa_sts      ;
        this.sales_ofc        = sales_ofc       ;
        this.srep_cd          = srep_cd         ;
        this.auth_ofc         = auth_ofc        ;
        this.auth_staff       = auth_staff      ;
        this.sc_no            = sc_no           ;
        this.rg_cgo_tp        = rg_cgo_tp       ;
        this.rg_dtl_ind       = rg_dtl_ind      ;
        this.cmdt_cd          = cmdt_cd         ;
        this.cmdt_tli_no      = cmdt_tli_no     ;
        this.rg_cmdt_desc     = rg_cmdt_desc    ;
        this.rep_cmdt_cd      = rep_cmdt_cd     ;
        this.rg_conf_cmdt_cd  = rg_conf_cmdt_cd ;
        this.rg_dead_slt_20   = rg_dead_slt_20  ;
        this.rg_dead_slt_40   = rg_dead_slt_40  ;
        this.rg_ttl_wgt       = rg_ttl_wgt      ;
        this.rg_meas_unit     = rg_meas_unit    ;
        this.svc_scp_cd       = svc_scp_cd      ;
        this.rg_ttl_qty       = rg_ttl_qty      ;
        this.rg_pymt_term     = rg_pymt_term    ;
        this.rg_eff_dt        = rg_eff_dt       ;
        this.rg_exp_dt        = rg_exp_dt       ;
        this.rg_ath_dt        = rg_ath_dt       ;
        this.rg_fil_dt        = rg_fil_dt       ;
        this.rg_cxl_dt        = rg_cxl_dt       ;
        this.cxl_ind          = cxl_ind         ;
        this.rg_cr_dt         = rg_cr_dt        ;
        this.rg_up_dt         = rg_up_dt        ;
        this.rg_usr_id        = rg_usr_id       ;
        this.rg_rar_auth_no   = rg_rar_auth_no  ;
        this.rg_svr_id        = rg_svr_id       ;
        this.rg_rep_ind       = rg_rep_ind      ;
        this.rg_trf_item_no   = rg_trf_item_no  ;
        this.rg_trf_ln_itm_no = rg_trf_ln_itm_no;
        this.rg_srep_nm       = rg_srep_nm      ;
        this.rg_no_dup_chk    = rg_no_dup_chk   ;
        this.rfa_auth_no      = rfa_auth_no     ;
        this.rg_qtn_mode      = rg_qtn_mode     ;
        this.nis_event_dt     = nis_event_dt    ;
        this.rg_bis_ind       = rg_bis_ind      ;
    }

    // getter method is proceeding ..
    public String           getIbflag          (){    return ibflag              ;    }
    public String           getPage_rows       (){    return page_rows           ;    }
    public String           getQtn_ofc         (){    return qtn_ofc             ;    }
    public String           getQtn_seq         (){    return qtn_seq             ;    }
    public String           getRfa_ofc         (){    return rfa_ofc             ;    }
    public String           getRfa_seq         (){    return rfa_seq             ;    }
    public String           getRg_rfa_sts      (){    return rg_rfa_sts          ;    }
    public String           getSales_ofc       (){    return sales_ofc           ;    }
    public String           getSrep_cd         (){    return srep_cd             ;    }
    public String           getAuth_ofc        (){    return auth_ofc            ;    }
    public String           getAuth_staff      (){    return auth_staff          ;    }
    public String           getSc_no           (){    return sc_no               ;    }
    public String           getRg_cgo_tp       (){    return rg_cgo_tp           ;    }
    public String           getRg_dtl_ind      (){    return rg_dtl_ind          ;    }
    public String           getCmdt_cd         (){    return cmdt_cd             ;    }
    public String           getCmdt_tli_no     (){    return cmdt_tli_no         ;    }
    public String           getRg_cmdt_desc    (){    return rg_cmdt_desc        ;    }
    public String           getRep_cmdt_cd     (){    return rep_cmdt_cd         ;    }
    public String           getRg_conf_cmdt_cd (){    return rg_conf_cmdt_cd     ;    }
    public String           getRg_dead_slt_20  (){    return rg_dead_slt_20      ;    }
    public String           getRg_dead_slt_40  (){    return rg_dead_slt_40      ;    }
    public String           getRg_ttl_wgt      (){    return rg_ttl_wgt          ;    }
    public String           getRg_meas_unit    (){    return rg_meas_unit        ;    }
    public String           getSvc_scp_cd      (){    return svc_scp_cd          ;    }
    public String           getRg_ttl_qty      (){    return rg_ttl_qty          ;    }
    public String           getRg_pymt_term    (){    return rg_pymt_term        ;    }
    public String           getRg_eff_dt       (){    return rg_eff_dt           ;    }
    public String           getRg_exp_dt       (){    return rg_exp_dt           ;    }
    public String           getRg_ath_dt       (){    return rg_ath_dt           ;    }
    public String           getRg_fil_dt       (){    return rg_fil_dt           ;    }
    public String           getRg_cxl_dt       (){    return rg_cxl_dt           ;    }
    public String           getCxl_ind         (){    return cxl_ind             ;    }
    public String           getRg_cr_dt        (){    return rg_cr_dt            ;    }
    public String           getRg_up_dt        (){    return rg_up_dt            ;    }
    public String           getRg_usr_id       (){    return rg_usr_id           ;    }
    public String           getRg_rar_auth_no  (){    return rg_rar_auth_no      ;    }
    public String           getRg_svr_id       (){    return rg_svr_id           ;    }
    public String           getRg_rep_ind      (){    return rg_rep_ind          ;    }
    public String           getRg_trf_item_no  (){    return rg_trf_item_no      ;    }
    public String           getRg_trf_ln_itm_no(){    return rg_trf_ln_itm_no    ;    }
    public String           getRg_srep_nm      (){    return rg_srep_nm          ;    }
    public String           getRg_no_dup_chk   (){    return rg_no_dup_chk       ;    }
    public String           getRfa_auth_no     (){    return rfa_auth_no         ;    }
    public String           getRg_qtn_mode     (){    return rg_qtn_mode         ;    }
    public String           getNis_event_dt    (){    return nis_event_dt        ;    }
    public String           getRg_bis_ind      (){    return rg_bis_ind          ;    }

    // setter method is proceeding ..
    public void setIbflag          ( String           ibflag           ){    this.ibflag           = ibflag              ;    }
    public void setPage_rows       ( String           page_rows        ){    this.page_rows        = page_rows           ;    }
    public void setQtn_ofc         ( String           qtn_ofc          ){    this.qtn_ofc          = qtn_ofc             ;    }
    public void setQtn_seq         ( String           qtn_seq          ){    this.qtn_seq          = qtn_seq             ;    }
    public void setRfa_ofc         ( String           rfa_ofc          ){    this.rfa_ofc          = rfa_ofc             ;    }
    public void setRfa_seq         ( String           rfa_seq          ){    this.rfa_seq          = rfa_seq             ;    }
    public void setRg_rfa_sts      ( String           rg_rfa_sts       ){    this.rg_rfa_sts       = rg_rfa_sts          ;    }
    public void setSales_ofc       ( String           sales_ofc        ){    this.sales_ofc        = sales_ofc           ;    }
    public void setSrep_cd         ( String           srep_cd          ){    this.srep_cd          = srep_cd             ;    }
    public void setAuth_ofc        ( String           auth_ofc         ){    this.auth_ofc         = auth_ofc            ;    }
    public void setAuth_staff      ( String           auth_staff       ){    this.auth_staff       = auth_staff          ;    }
    public void setSc_no           ( String           sc_no            ){    this.sc_no            = sc_no               ;    }
    public void setRg_cgo_tp       ( String           rg_cgo_tp        ){    this.rg_cgo_tp        = rg_cgo_tp           ;    }
    public void setRg_dtl_ind      ( String           rg_dtl_ind       ){    this.rg_dtl_ind       = rg_dtl_ind          ;    }
    public void setCmdt_cd         ( String           cmdt_cd          ){    this.cmdt_cd          = cmdt_cd             ;    }
    public void setCmdt_tli_no     ( String           cmdt_tli_no      ){    this.cmdt_tli_no      = cmdt_tli_no         ;    }
    public void setRg_cmdt_desc    ( String           rg_cmdt_desc     ){    this.rg_cmdt_desc     = rg_cmdt_desc        ;    }
    public void setRep_cmdt_cd     ( String           rep_cmdt_cd      ){    this.rep_cmdt_cd      = rep_cmdt_cd         ;    }
    public void setRg_conf_cmdt_cd ( String           rg_conf_cmdt_cd  ){    this.rg_conf_cmdt_cd  = rg_conf_cmdt_cd     ;    }
    public void setRg_dead_slt_20  ( String           rg_dead_slt_20   ){    this.rg_dead_slt_20   = rg_dead_slt_20      ;    }
    public void setRg_dead_slt_40  ( String           rg_dead_slt_40   ){    this.rg_dead_slt_40   = rg_dead_slt_40      ;    }
    public void setRg_ttl_wgt      ( String           rg_ttl_wgt       ){    this.rg_ttl_wgt       = rg_ttl_wgt          ;    }
    public void setRg_meas_unit    ( String           rg_meas_unit     ){    this.rg_meas_unit     = rg_meas_unit        ;    }
    public void setSvc_scp_cd      ( String           svc_scp_cd       ){    this.svc_scp_cd       = svc_scp_cd          ;    }
    public void setRg_ttl_qty      ( String           rg_ttl_qty       ){    this.rg_ttl_qty       = rg_ttl_qty          ;    }
    public void setRg_pymt_term    ( String           rg_pymt_term     ){    this.rg_pymt_term     = rg_pymt_term        ;    }
    public void setRg_eff_dt       ( String           rg_eff_dt        ){    this.rg_eff_dt        = rg_eff_dt           ;    }
    public void setRg_exp_dt       ( String           rg_exp_dt        ){    this.rg_exp_dt        = rg_exp_dt           ;    }
    public void setRg_ath_dt       ( String           rg_ath_dt        ){    this.rg_ath_dt        = rg_ath_dt           ;    }
    public void setRg_fil_dt       ( String           rg_fil_dt        ){    this.rg_fil_dt        = rg_fil_dt           ;    }
    public void setRg_cxl_dt       ( String           rg_cxl_dt        ){    this.rg_cxl_dt        = rg_cxl_dt           ;    }
    public void setCxl_ind         ( String           cxl_ind          ){    this.cxl_ind          = cxl_ind             ;    }
    public void setRg_cr_dt        ( String           rg_cr_dt         ){    this.rg_cr_dt         = rg_cr_dt            ;    }
    public void setRg_up_dt        ( String           rg_up_dt         ){    this.rg_up_dt         = rg_up_dt            ;    }
    public void setRg_usr_id       ( String           rg_usr_id        ){    this.rg_usr_id        = rg_usr_id           ;    }
    public void setRg_rar_auth_no  ( String           rg_rar_auth_no   ){    this.rg_rar_auth_no   = rg_rar_auth_no      ;    }
    public void setRg_svr_id       ( String           rg_svr_id        ){    this.rg_svr_id        = rg_svr_id           ;    }
    public void setRg_rep_ind      ( String           rg_rep_ind       ){    this.rg_rep_ind       = rg_rep_ind          ;    }
    public void setRg_trf_item_no  ( String           rg_trf_item_no   ){    this.rg_trf_item_no   = rg_trf_item_no      ;    }
    public void setRg_trf_ln_itm_no( String           rg_trf_ln_itm_no ){    this.rg_trf_ln_itm_no = rg_trf_ln_itm_no    ;    }
    public void setRg_srep_nm      ( String           rg_srep_nm       ){    this.rg_srep_nm       = rg_srep_nm          ;    }
    public void setRg_no_dup_chk   ( String           rg_no_dup_chk    ){    this.rg_no_dup_chk    = rg_no_dup_chk       ;    }
    public void setRfa_auth_no     ( String           rfa_auth_no      ){    this.rfa_auth_no      = rfa_auth_no         ;    }
    public void setRg_qtn_mode     ( String           rg_qtn_mode      ){    this.rg_qtn_mode      = rg_qtn_mode         ;    }
    public void setNis_event_dt    ( String           nis_event_dt     ){    this.nis_event_dt     = nis_event_dt        ;    }
    public void setRg_bis_ind      ( String           rg_bis_ind       ){    this.rg_bis_ind       = rg_bis_ind          ;    }

    public static RFA_GENERAL fromRequest(HttpServletRequest request) {
        RFA_GENERAL model = new RFA_GENERAL();
        try {
            model.setIbflag              (JSPUtil.getParameter(request, "ibflag                  ".trim(), ""));
            model.setPage_rows           (JSPUtil.getParameter(request, "page_rows               ".trim(), ""));
            model.setQtn_ofc             (JSPUtil.getParameter(request, "qtn_ofc                 ".trim(), ""));
            model.setQtn_seq             (JSPUtil.getParameter(request, "qtn_seq                 ".trim(), ""));
            model.setRfa_ofc             (JSPUtil.getParameter(request, "rfa_ofc                 ".trim(), ""));
            model.setRfa_seq             (JSPUtil.getParameter(request, "rfa_seq                 ".trim(), ""));
            model.setRg_rfa_sts          (JSPUtil.getParameter(request, "rg_rfa_sts              ".trim(), ""));
            model.setSales_ofc           (JSPUtil.getParameter(request, "sales_ofc               ".trim(), ""));
            model.setSrep_cd             (JSPUtil.getParameter(request, "srep_cd                 ".trim(), ""));
            model.setAuth_ofc            (JSPUtil.getParameter(request, "auth_ofc                ".trim(), ""));
            model.setAuth_staff          (JSPUtil.getParameter(request, "auth_staff              ".trim(), ""));
            model.setSc_no               (JSPUtil.getParameter(request, "sc_no                   ".trim(), ""));
            model.setRg_cgo_tp           (JSPUtil.getParameter(request, "rg_cgo_tp               ".trim(), ""));
            model.setRg_dtl_ind          (JSPUtil.getParameter(request, "rg_dtl_ind              ".trim(), ""));
            model.setCmdt_cd             (JSPUtil.getParameter(request, "cmdt_cd                 ".trim(), ""));
            model.setCmdt_tli_no         (JSPUtil.getParameter(request, "cmdt_tli_no             ".trim(), ""));
            model.setRg_cmdt_desc        (JSPUtil.getParameter(request, "rg_cmdt_desc            ".trim(), ""));
            model.setRep_cmdt_cd         (JSPUtil.getParameter(request, "rep_cmdt_cd             ".trim(), ""));
            model.setRg_conf_cmdt_cd     (JSPUtil.getParameter(request, "rg_conf_cmdt_cd         ".trim(), ""));
            model.setRg_dead_slt_20      (JSPUtil.getParameter(request, "rg_dead_slt_20          ".trim(), ""));
            model.setRg_dead_slt_40      (JSPUtil.getParameter(request, "rg_dead_slt_40          ".trim(), ""));
            model.setRg_ttl_wgt          (JSPUtil.getParameter(request, "rg_ttl_wgt              ".trim(), ""));
            model.setRg_meas_unit        (JSPUtil.getParameter(request, "rg_meas_unit            ".trim(), ""));
            model.setSvc_scp_cd          (JSPUtil.getParameter(request, "svc_scp_cd              ".trim(), ""));
            model.setRg_ttl_qty          (JSPUtil.getParameter(request, "rg_ttl_qty              ".trim(), ""));
            model.setRg_pymt_term        (JSPUtil.getParameter(request, "rg_pymt_term            ".trim(), ""));
            model.setRg_eff_dt           (JSPUtil.getParameter(request, "rg_eff_dt               ".trim(), ""));
            model.setRg_exp_dt           (JSPUtil.getParameter(request, "rg_exp_dt               ".trim(), ""));
            model.setRg_ath_dt           (JSPUtil.getParameter(request, "rg_ath_dt               ".trim(), ""));
            model.setRg_fil_dt           (JSPUtil.getParameter(request, "rg_fil_dt               ".trim(), ""));
            model.setRg_cxl_dt           (JSPUtil.getParameter(request, "rg_cxl_dt               ".trim(), ""));
            model.setCxl_ind             (JSPUtil.getParameter(request, "cxl_ind                 ".trim(), ""));
            model.setRg_cr_dt            (JSPUtil.getParameter(request, "rg_cr_dt                ".trim(), ""));
            model.setRg_up_dt            (JSPUtil.getParameter(request, "rg_up_dt                ".trim(), ""));
            model.setRg_usr_id           (JSPUtil.getParameter(request, "rg_usr_id               ".trim(), ""));
            model.setRg_rar_auth_no      (JSPUtil.getParameter(request, "rg_rar_auth_no          ".trim(), ""));
            model.setRg_svr_id           (JSPUtil.getParameter(request, "rg_svr_id               ".trim(), ""));
            model.setRg_rep_ind          (JSPUtil.getParameter(request, "rg_rep_ind              ".trim(), ""));
            model.setRg_trf_item_no      (JSPUtil.getParameter(request, "rg_trf_item_no          ".trim(), ""));
            model.setRg_trf_ln_itm_no    (JSPUtil.getParameter(request, "rg_trf_ln_itm_no        ".trim(), ""));
            model.setRg_srep_nm          (JSPUtil.getParameter(request, "rg_srep_nm              ".trim(), ""));
            model.setRg_no_dup_chk       (JSPUtil.getParameter(request, "rg_no_dup_chk           ".trim(), ""));
            model.setRfa_auth_no         (JSPUtil.getParameter(request, "rfa_auth_no             ".trim(), ""));
            model.setRg_qtn_mode         (JSPUtil.getParameter(request, "rg_qtn_mode             ".trim(), ""));
            model.setNis_event_dt        (JSPUtil.getParameter(request, "nis_event_dt            ".trim(), ""));
            model.setRg_bis_ind          (JSPUtil.getParameter(request, "rg_bis_ind              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        RFA_GENERAL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows               ".trim(), length));
            String[] qtn_ofc          =  (JSPUtil.getParameter(request, "qtn_ofc                 ".trim(), length));
            String[] qtn_seq          =  (JSPUtil.getParameter(request, "qtn_seq                 ".trim(), length));
            String[] rfa_ofc          =  (JSPUtil.getParameter(request, "rfa_ofc                 ".trim(), length));
            String[] rfa_seq          =  (JSPUtil.getParameter(request, "rfa_seq                 ".trim(), length));
            String[] rg_rfa_sts       =  (JSPUtil.getParameter(request, "rg_rfa_sts              ".trim(), length));
            String[] sales_ofc        =  (JSPUtil.getParameter(request, "sales_ofc               ".trim(), length));
            String[] srep_cd          =  (JSPUtil.getParameter(request, "srep_cd                 ".trim(), length));
            String[] auth_ofc         =  (JSPUtil.getParameter(request, "auth_ofc                ".trim(), length));
            String[] auth_staff       =  (JSPUtil.getParameter(request, "auth_staff              ".trim(), length));
            String[] sc_no            =  (JSPUtil.getParameter(request, "sc_no                   ".trim(), length));
            String[] rg_cgo_tp        =  (JSPUtil.getParameter(request, "rg_cgo_tp               ".trim(), length));
            String[] rg_dtl_ind       =  (JSPUtil.getParameter(request, "rg_dtl_ind              ".trim(), length));
            String[] cmdt_cd          =  (JSPUtil.getParameter(request, "cmdt_cd                 ".trim(), length));
            String[] cmdt_tli_no      =  (JSPUtil.getParameter(request, "cmdt_tli_no             ".trim(), length));
            String[] rg_cmdt_desc     =  (JSPUtil.getParameter(request, "rg_cmdt_desc            ".trim(), length));
            String[] rep_cmdt_cd      =  (JSPUtil.getParameter(request, "rep_cmdt_cd             ".trim(), length));
            String[] rg_conf_cmdt_cd  =  (JSPUtil.getParameter(request, "rg_conf_cmdt_cd         ".trim(), length));
            String[] rg_dead_slt_20   =  (JSPUtil.getParameter(request, "rg_dead_slt_20          ".trim(), length));
            String[] rg_dead_slt_40   =  (JSPUtil.getParameter(request, "rg_dead_slt_40          ".trim(), length));
            String[] rg_ttl_wgt       =  (JSPUtil.getParameter(request, "rg_ttl_wgt              ".trim(), length));
            String[] rg_meas_unit     =  (JSPUtil.getParameter(request, "rg_meas_unit            ".trim(), length));
            String[] svc_scp_cd       =  (JSPUtil.getParameter(request, "svc_scp_cd              ".trim(), length));
            String[] rg_ttl_qty       =  (JSPUtil.getParameter(request, "rg_ttl_qty              ".trim(), length));
            String[] rg_pymt_term     =  (JSPUtil.getParameter(request, "rg_pymt_term            ".trim(), length));
            String[] rg_eff_dt        =  (JSPUtil.getParameter(request, "rg_eff_dt               ".trim(), length));
            String[] rg_exp_dt        =  (JSPUtil.getParameter(request, "rg_exp_dt               ".trim(), length));
            String[] rg_ath_dt        =  (JSPUtil.getParameter(request, "rg_ath_dt               ".trim(), length));
            String[] rg_fil_dt        =  (JSPUtil.getParameter(request, "rg_fil_dt               ".trim(), length));
            String[] rg_cxl_dt        =  (JSPUtil.getParameter(request, "rg_cxl_dt               ".trim(), length));
            String[] cxl_ind          =  (JSPUtil.getParameter(request, "cxl_ind                 ".trim(), length));
            String[] rg_cr_dt         =  (JSPUtil.getParameter(request, "rg_cr_dt                ".trim(), length));
            String[] rg_up_dt         =  (JSPUtil.getParameter(request, "rg_up_dt                ".trim(), length));
            String[] rg_usr_id        =  (JSPUtil.getParameter(request, "rg_usr_id               ".trim(), length));
            String[] rg_rar_auth_no   =  (JSPUtil.getParameter(request, "rg_rar_auth_no          ".trim(), length));
            String[] rg_svr_id        =  (JSPUtil.getParameter(request, "rg_svr_id               ".trim(), length));
            String[] rg_rep_ind       =  (JSPUtil.getParameter(request, "rg_rep_ind              ".trim(), length));
            String[] rg_trf_item_no   =  (JSPUtil.getParameter(request, "rg_trf_item_no          ".trim(), length));
            String[] rg_trf_ln_itm_no =  (JSPUtil.getParameter(request, "rg_trf_ln_itm_no        ".trim(), length));
            String[] rg_srep_nm       =  (JSPUtil.getParameter(request, "rg_srep_nm              ".trim(), length));
            String[] rg_no_dup_chk    =  (JSPUtil.getParameter(request, "rg_no_dup_chk           ".trim(), length));
            String[] rfa_auth_no      =  (JSPUtil.getParameter(request, "rfa_auth_no             ".trim(), length));
            String[] rg_qtn_mode      =  (JSPUtil.getParameter(request, "rg_qtn_mode             ".trim(), length));
            String[] nis_event_dt     =  (JSPUtil.getParameter(request, "nis_event_dt            ".trim(), length));
            String[] rg_bis_ind       =  (JSPUtil.getParameter(request, "rg_bis_ind              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new RFA_GENERAL();
                model.setIbflag                    (ibflag              [i]);
                model.setPage_rows                 (page_rows           [i]);
                model.setQtn_ofc                   (qtn_ofc             [i]);
                model.setQtn_seq                   (qtn_seq             [i]);
                model.setRfa_ofc                   (rfa_ofc             [i]);
                model.setRfa_seq                   (rfa_seq             [i]);
                model.setRg_rfa_sts                (rg_rfa_sts          [i]);
                model.setSales_ofc                 (sales_ofc           [i]);
                model.setSrep_cd                   (srep_cd             [i]);
                model.setAuth_ofc                  (auth_ofc            [i]);
                model.setAuth_staff                (auth_staff          [i]);
                model.setSc_no                     (sc_no               [i]);
                model.setRg_cgo_tp                 (rg_cgo_tp           [i]);
                model.setRg_dtl_ind                (rg_dtl_ind          [i]);
                model.setCmdt_cd                   (cmdt_cd             [i]);
                model.setCmdt_tli_no               (cmdt_tli_no         [i]);
                model.setRg_cmdt_desc              (rg_cmdt_desc        [i]);
                model.setRep_cmdt_cd               (rep_cmdt_cd         [i]);
                model.setRg_conf_cmdt_cd           (rg_conf_cmdt_cd     [i]);
                model.setRg_dead_slt_20            (rg_dead_slt_20      [i]);
                model.setRg_dead_slt_40            (rg_dead_slt_40      [i]);
                model.setRg_ttl_wgt                (rg_ttl_wgt          [i]);
                model.setRg_meas_unit              (rg_meas_unit        [i]);
                model.setSvc_scp_cd                (svc_scp_cd          [i]);
                model.setRg_ttl_qty                (rg_ttl_qty          [i]);
                model.setRg_pymt_term              (rg_pymt_term        [i]);
                model.setRg_eff_dt                 (rg_eff_dt           [i]);
                model.setRg_exp_dt                 (rg_exp_dt           [i]);
                model.setRg_ath_dt                 (rg_ath_dt           [i]);
                model.setRg_fil_dt                 (rg_fil_dt           [i]);
                model.setRg_cxl_dt                 (rg_cxl_dt           [i]);
                model.setCxl_ind                   (cxl_ind             [i]);
                model.setRg_cr_dt                  (rg_cr_dt            [i]);
                model.setRg_up_dt                  (rg_up_dt            [i]);
                model.setRg_usr_id                 (rg_usr_id           [i]);
                model.setRg_rar_auth_no            (rg_rar_auth_no      [i]);
                model.setRg_svr_id                 (rg_svr_id           [i]);
                model.setRg_rep_ind                (rg_rep_ind          [i]);
                model.setRg_trf_item_no            (rg_trf_item_no      [i]);
                model.setRg_trf_ln_itm_no          (rg_trf_ln_itm_no    [i]);
                model.setRg_srep_nm                (rg_srep_nm          [i]);
                model.setRg_no_dup_chk             (rg_no_dup_chk       [i]);
                model.setRfa_auth_no               (rfa_auth_no         [i]);
                model.setRg_qtn_mode               (rg_qtn_mode         [i]);
                model.setNis_event_dt              (nis_event_dt        [i]);
                model.setRg_bis_ind                (rg_bis_ind          [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        RFA_GENERAL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows               ".trim(), length));
            String[] qtn_ofc          =  (JSPUtil.getParameter(request, prefix + "qtn_ofc                 ".trim(), length));
            String[] qtn_seq          =  (JSPUtil.getParameter(request, prefix + "qtn_seq                 ".trim(), length));
            String[] rfa_ofc          =  (JSPUtil.getParameter(request, prefix + "rfa_ofc                 ".trim(), length));
            String[] rfa_seq          =  (JSPUtil.getParameter(request, prefix + "rfa_seq                 ".trim(), length));
            String[] rg_rfa_sts       =  (JSPUtil.getParameter(request, prefix + "rg_rfa_sts              ".trim(), length));
            String[] sales_ofc        =  (JSPUtil.getParameter(request, prefix + "sales_ofc               ".trim(), length));
            String[] srep_cd          =  (JSPUtil.getParameter(request, prefix + "srep_cd                 ".trim(), length));
            String[] auth_ofc         =  (JSPUtil.getParameter(request, prefix + "auth_ofc                ".trim(), length));
            String[] auth_staff       =  (JSPUtil.getParameter(request, prefix + "auth_staff              ".trim(), length));
            String[] sc_no            =  (JSPUtil.getParameter(request, prefix + "sc_no                   ".trim(), length));
            String[] rg_cgo_tp        =  (JSPUtil.getParameter(request, prefix + "rg_cgo_tp               ".trim(), length));
            String[] rg_dtl_ind       =  (JSPUtil.getParameter(request, prefix + "rg_dtl_ind              ".trim(), length));
            String[] cmdt_cd          =  (JSPUtil.getParameter(request, prefix + "cmdt_cd                 ".trim(), length));
            String[] cmdt_tli_no      =  (JSPUtil.getParameter(request, prefix + "cmdt_tli_no             ".trim(), length));
            String[] rg_cmdt_desc     =  (JSPUtil.getParameter(request, prefix + "rg_cmdt_desc            ".trim(), length));
            String[] rep_cmdt_cd      =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd             ".trim(), length));
            String[] rg_conf_cmdt_cd  =  (JSPUtil.getParameter(request, prefix + "rg_conf_cmdt_cd         ".trim(), length));
            String[] rg_dead_slt_20   =  (JSPUtil.getParameter(request, prefix + "rg_dead_slt_20          ".trim(), length));
            String[] rg_dead_slt_40   =  (JSPUtil.getParameter(request, prefix + "rg_dead_slt_40          ".trim(), length));
            String[] rg_ttl_wgt       =  (JSPUtil.getParameter(request, prefix + "rg_ttl_wgt              ".trim(), length));
            String[] rg_meas_unit     =  (JSPUtil.getParameter(request, prefix + "rg_meas_unit            ".trim(), length));
            String[] svc_scp_cd       =  (JSPUtil.getParameter(request, prefix + "svc_scp_cd              ".trim(), length));
            String[] rg_ttl_qty       =  (JSPUtil.getParameter(request, prefix + "rg_ttl_qty              ".trim(), length));
            String[] rg_pymt_term     =  (JSPUtil.getParameter(request, prefix + "rg_pymt_term            ".trim(), length));
            String[] rg_eff_dt        =  (JSPUtil.getParameter(request, prefix + "rg_eff_dt               ".trim(), length));
            String[] rg_exp_dt        =  (JSPUtil.getParameter(request, prefix + "rg_exp_dt               ".trim(), length));
            String[] rg_ath_dt        =  (JSPUtil.getParameter(request, prefix + "rg_ath_dt               ".trim(), length));
            String[] rg_fil_dt        =  (JSPUtil.getParameter(request, prefix + "rg_fil_dt               ".trim(), length));
            String[] rg_cxl_dt        =  (JSPUtil.getParameter(request, prefix + "rg_cxl_dt               ".trim(), length));
            String[] cxl_ind          =  (JSPUtil.getParameter(request, prefix + "cxl_ind                 ".trim(), length));
            String[] rg_cr_dt         =  (JSPUtil.getParameter(request, prefix + "rg_cr_dt                ".trim(), length));
            String[] rg_up_dt         =  (JSPUtil.getParameter(request, prefix + "rg_up_dt                ".trim(), length));
            String[] rg_usr_id        =  (JSPUtil.getParameter(request, prefix + "rg_usr_id               ".trim(), length));
            String[] rg_rar_auth_no   =  (JSPUtil.getParameter(request, prefix + "rg_rar_auth_no          ".trim(), length));
            String[] rg_svr_id        =  (JSPUtil.getParameter(request, prefix + "rg_svr_id               ".trim(), length));
            String[] rg_rep_ind       =  (JSPUtil.getParameter(request, prefix + "rg_rep_ind              ".trim(), length));
            String[] rg_trf_item_no   =  (JSPUtil.getParameter(request, prefix + "rg_trf_item_no          ".trim(), length));
            String[] rg_trf_ln_itm_no =  (JSPUtil.getParameter(request, prefix + "rg_trf_ln_itm_no        ".trim(), length));
            String[] rg_srep_nm       =  (JSPUtil.getParameter(request, prefix + "rg_srep_nm              ".trim(), length));
            String[] rg_no_dup_chk    =  (JSPUtil.getParameter(request, prefix + "rg_no_dup_chk           ".trim(), length));
            String[] rfa_auth_no      =  (JSPUtil.getParameter(request, prefix + "rfa_auth_no             ".trim(), length));
            String[] rg_qtn_mode      =  (JSPUtil.getParameter(request, prefix + "rg_qtn_mode             ".trim(), length));
            String[] nis_event_dt     =  (JSPUtil.getParameter(request, prefix + "nis_event_dt            ".trim(), length));
            String[] rg_bis_ind       =  (JSPUtil.getParameter(request, prefix + "rg_bis_ind              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new RFA_GENERAL();
                model.setIbflag                    ( ibflag              [i]);
                model.setPage_rows                 ( page_rows           [i]);
                model.setQtn_ofc                   ( qtn_ofc             [i]);
                model.setQtn_seq                   ( qtn_seq             [i]);
                model.setRfa_ofc                   ( rfa_ofc             [i]);
                model.setRfa_seq                   ( rfa_seq             [i]);
                model.setRg_rfa_sts                ( rg_rfa_sts          [i]);
                model.setSales_ofc                 ( sales_ofc           [i]);
                model.setSrep_cd                   ( srep_cd             [i]);
                model.setAuth_ofc                  ( auth_ofc            [i]);
                model.setAuth_staff                ( auth_staff          [i]);
                model.setSc_no                     ( sc_no               [i]);
                model.setRg_cgo_tp                 ( rg_cgo_tp           [i]);
                model.setRg_dtl_ind                ( rg_dtl_ind          [i]);
                model.setCmdt_cd                   ( cmdt_cd             [i]);
                model.setCmdt_tli_no               ( cmdt_tli_no         [i]);
                model.setRg_cmdt_desc              ( rg_cmdt_desc        [i]);
                model.setRep_cmdt_cd               ( rep_cmdt_cd         [i]);
                model.setRg_conf_cmdt_cd           ( rg_conf_cmdt_cd     [i]);
                model.setRg_dead_slt_20            ( rg_dead_slt_20      [i]);
                model.setRg_dead_slt_40            ( rg_dead_slt_40      [i]);
                model.setRg_ttl_wgt                ( rg_ttl_wgt          [i]);
                model.setRg_meas_unit              ( rg_meas_unit        [i]);
                model.setSvc_scp_cd                ( svc_scp_cd          [i]);
                model.setRg_ttl_qty                ( rg_ttl_qty          [i]);
                model.setRg_pymt_term              ( rg_pymt_term        [i]);
                model.setRg_eff_dt                 ( rg_eff_dt           [i]);
                model.setRg_exp_dt                 ( rg_exp_dt           [i]);
                model.setRg_ath_dt                 ( rg_ath_dt           [i]);
                model.setRg_fil_dt                 ( rg_fil_dt           [i]);
                model.setRg_cxl_dt                 ( rg_cxl_dt           [i]);
                model.setCxl_ind                   ( cxl_ind             [i]);
                model.setRg_cr_dt                  ( rg_cr_dt            [i]);
                model.setRg_up_dt                  ( rg_up_dt            [i]);
                model.setRg_usr_id                 ( rg_usr_id           [i]);
                model.setRg_rar_auth_no            ( rg_rar_auth_no      [i]);
                model.setRg_svr_id                 ( rg_svr_id           [i]);
                model.setRg_rep_ind                ( rg_rep_ind          [i]);
                model.setRg_trf_item_no            ( rg_trf_item_no      [i]);
                model.setRg_trf_ln_itm_no          ( rg_trf_ln_itm_no    [i]);
                model.setRg_srep_nm                ( rg_srep_nm          [i]);
                model.setRg_no_dup_chk             ( rg_no_dup_chk       [i]);
                model.setRfa_auth_no               ( rfa_auth_no         [i]);
                model.setRg_qtn_mode               ( rg_qtn_mode         [i]);
                model.setNis_event_dt              ( nis_event_dt        [i]);
                model.setRg_bis_ind                ( rg_bis_ind          [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }

    // toString() method is overriding ..
    public String toString() {
        StringBuffer ret = new StringBuffer();
        Field[] field = this.getClass().getDeclaredFields();
        String space="                              ";
        try {
            for (int i = 0; i < field.length; i++) {
                String[] arr=null;
                try {
                    arr = (String[]) field[i].get(this);
                }catch(Exception ex) {
                    arr=new String[1];
                    arr[0]=String.valueOf(field[i].get(this));
                }
                if (arr != null) {
                    for (int j = 0; j < arr.length; j++) {
                        ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
                    }
                } else {
                    ret.append(field[i].getName() + " =  null \n");
                }
            }
        } catch (Exception ex) {}
        return ret.toString();
    }

}
