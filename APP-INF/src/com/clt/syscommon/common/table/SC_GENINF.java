/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SC_GENINF.java
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
 */public final class SC_GENINF implements java.io.Serializable {

    private String       ibflag       = "";
    private String       page_rows    = "";
    private String       sc_tp        = "";
    private String       sc_no        = "";
    private String       sc_svc_scp   = "";
    private String       sc_bnd       = "";
    private String       sc_seq       = "";
    private String       rep_cmdt_cd3 = "";
    private String       sc_cnt_cd    = "";
    private String       sc_cust_cd   = "";
    private String       sc_ofc_cd    = "";
    private String       sc_srep_cd   = "";
    private String       sc_cust_tp   = "";
    private String       sc_mqc_min   = "";
    private String       sc_min_tp    = "";
    private String       sc_mqc_max   = "";
    private String       sc_max_tp    = "";
    private String       sc_eff_dt    = "";
    private String       sc_exp_dt    = "";
    private String       sc_dead_frt  = "";
    private String       sc_svc_cmmt  = "";
    private String       sc_remark    = "";
    private String       sc_usrid     = "";
    private String       sc_crdt      = "";
    private String       sc_updt      = "";
    private String       rep_cmdt_cd1 = "";
    private String       rep_cmdt_cd2 = "";
    private String       sc_no_old    = "";
    private String       sc_comp_ind  = "";
    private String       nis_event_dt = "";

    public SC_GENINF(){}

    public SC_GENINF(
            String       ibflag      ,
            String       page_rows   ,
            String       sc_tp       ,
            String       sc_no       ,
            String       sc_svc_scp  ,
            String       sc_bnd      ,
            String       sc_seq      ,
            String       rep_cmdt_cd3,
            String       sc_cnt_cd   ,
            String       sc_cust_cd  ,
            String       sc_ofc_cd   ,
            String       sc_srep_cd  ,
            String       sc_cust_tp  ,
            String       sc_mqc_min  ,
            String       sc_min_tp   ,
            String       sc_mqc_max  ,
            String       sc_max_tp   ,
            String       sc_eff_dt   ,
            String       sc_exp_dt   ,
            String       sc_dead_frt ,
            String       sc_svc_cmmt ,
            String       sc_remark   ,
            String       sc_usrid    ,
            String       sc_crdt     ,
            String       sc_updt     ,
            String       rep_cmdt_cd1,
            String       rep_cmdt_cd2,
            String       sc_no_old   ,
            String       sc_comp_ind ,
            String       nis_event_dt){
        this.ibflag       = ibflag      ;
        this.page_rows    = page_rows   ;
        this.sc_tp        = sc_tp       ;
        this.sc_no        = sc_no       ;
        this.sc_svc_scp   = sc_svc_scp  ;
        this.sc_bnd       = sc_bnd      ;
        this.sc_seq       = sc_seq      ;
        this.rep_cmdt_cd3 = rep_cmdt_cd3;
        this.sc_cnt_cd    = sc_cnt_cd   ;
        this.sc_cust_cd   = sc_cust_cd  ;
        this.sc_ofc_cd    = sc_ofc_cd   ;
        this.sc_srep_cd   = sc_srep_cd  ;
        this.sc_cust_tp   = sc_cust_tp  ;
        this.sc_mqc_min   = sc_mqc_min  ;
        this.sc_min_tp    = sc_min_tp   ;
        this.sc_mqc_max   = sc_mqc_max  ;
        this.sc_max_tp    = sc_max_tp   ;
        this.sc_eff_dt    = sc_eff_dt   ;
        this.sc_exp_dt    = sc_exp_dt   ;
        this.sc_dead_frt  = sc_dead_frt ;
        this.sc_svc_cmmt  = sc_svc_cmmt ;
        this.sc_remark    = sc_remark   ;
        this.sc_usrid     = sc_usrid    ;
        this.sc_crdt      = sc_crdt     ;
        this.sc_updt      = sc_updt     ;
        this.rep_cmdt_cd1 = rep_cmdt_cd1;
        this.rep_cmdt_cd2 = rep_cmdt_cd2;
        this.sc_no_old    = sc_no_old   ;
        this.sc_comp_ind  = sc_comp_ind ;
        this.nis_event_dt = nis_event_dt;
    }

    // getter method is proceeding ..
    public String       getIbflag      (){    return ibflag          ;    }
    public String       getPage_rows   (){    return page_rows       ;    }
    public String       getSc_tp       (){    return sc_tp           ;    }
    public String       getSc_no       (){    return sc_no           ;    }
    public String       getSc_svc_scp  (){    return sc_svc_scp      ;    }
    public String       getSc_bnd      (){    return sc_bnd          ;    }
    public String       getSc_seq      (){    return sc_seq          ;    }
    public String       getRep_cmdt_cd3(){    return rep_cmdt_cd3    ;    }
    public String       getSc_cnt_cd   (){    return sc_cnt_cd       ;    }
    public String       getSc_cust_cd  (){    return sc_cust_cd      ;    }
    public String       getSc_ofc_cd   (){    return sc_ofc_cd       ;    }
    public String       getSc_srep_cd  (){    return sc_srep_cd      ;    }
    public String       getSc_cust_tp  (){    return sc_cust_tp      ;    }
    public String       getSc_mqc_min  (){    return sc_mqc_min      ;    }
    public String       getSc_min_tp   (){    return sc_min_tp       ;    }
    public String       getSc_mqc_max  (){    return sc_mqc_max      ;    }
    public String       getSc_max_tp   (){    return sc_max_tp       ;    }
    public String       getSc_eff_dt   (){    return sc_eff_dt       ;    }
    public String       getSc_exp_dt   (){    return sc_exp_dt       ;    }
    public String       getSc_dead_frt (){    return sc_dead_frt     ;    }
    public String       getSc_svc_cmmt (){    return sc_svc_cmmt     ;    }
    public String       getSc_remark   (){    return sc_remark       ;    }
    public String       getSc_usrid    (){    return sc_usrid        ;    }
    public String       getSc_crdt     (){    return sc_crdt         ;    }
    public String       getSc_updt     (){    return sc_updt         ;    }
    public String       getRep_cmdt_cd1(){    return rep_cmdt_cd1    ;    }
    public String       getRep_cmdt_cd2(){    return rep_cmdt_cd2    ;    }
    public String       getSc_no_old   (){    return sc_no_old       ;    }
    public String       getSc_comp_ind (){    return sc_comp_ind     ;    }
    public String       getNis_event_dt(){    return nis_event_dt    ;    }

    // setter method is proceeding ..
    public void setIbflag      ( String       ibflag       ){    this.ibflag       = ibflag          ;    }
    public void setPage_rows   ( String       page_rows    ){    this.page_rows    = page_rows       ;    }
    public void setSc_tp       ( String       sc_tp        ){    this.sc_tp        = sc_tp           ;    }
    public void setSc_no       ( String       sc_no        ){    this.sc_no        = sc_no           ;    }
    public void setSc_svc_scp  ( String       sc_svc_scp   ){    this.sc_svc_scp   = sc_svc_scp      ;    }
    public void setSc_bnd      ( String       sc_bnd       ){    this.sc_bnd       = sc_bnd          ;    }
    public void setSc_seq      ( String       sc_seq       ){    this.sc_seq       = sc_seq          ;    }
    public void setRep_cmdt_cd3( String       rep_cmdt_cd3 ){    this.rep_cmdt_cd3 = rep_cmdt_cd3    ;    }
    public void setSc_cnt_cd   ( String       sc_cnt_cd    ){    this.sc_cnt_cd    = sc_cnt_cd       ;    }
    public void setSc_cust_cd  ( String       sc_cust_cd   ){    this.sc_cust_cd   = sc_cust_cd      ;    }
    public void setSc_ofc_cd   ( String       sc_ofc_cd    ){    this.sc_ofc_cd    = sc_ofc_cd       ;    }
    public void setSc_srep_cd  ( String       sc_srep_cd   ){    this.sc_srep_cd   = sc_srep_cd      ;    }
    public void setSc_cust_tp  ( String       sc_cust_tp   ){    this.sc_cust_tp   = sc_cust_tp      ;    }
    public void setSc_mqc_min  ( String       sc_mqc_min   ){    this.sc_mqc_min   = sc_mqc_min      ;    }
    public void setSc_min_tp   ( String       sc_min_tp    ){    this.sc_min_tp    = sc_min_tp       ;    }
    public void setSc_mqc_max  ( String       sc_mqc_max   ){    this.sc_mqc_max   = sc_mqc_max      ;    }
    public void setSc_max_tp   ( String       sc_max_tp    ){    this.sc_max_tp    = sc_max_tp       ;    }
    public void setSc_eff_dt   ( String       sc_eff_dt    ){    this.sc_eff_dt    = sc_eff_dt       ;    }
    public void setSc_exp_dt   ( String       sc_exp_dt    ){    this.sc_exp_dt    = sc_exp_dt       ;    }
    public void setSc_dead_frt ( String       sc_dead_frt  ){    this.sc_dead_frt  = sc_dead_frt     ;    }
    public void setSc_svc_cmmt ( String       sc_svc_cmmt  ){    this.sc_svc_cmmt  = sc_svc_cmmt     ;    }
    public void setSc_remark   ( String       sc_remark    ){    this.sc_remark    = sc_remark       ;    }
    public void setSc_usrid    ( String       sc_usrid     ){    this.sc_usrid     = sc_usrid        ;    }
    public void setSc_crdt     ( String       sc_crdt      ){    this.sc_crdt      = sc_crdt         ;    }
    public void setSc_updt     ( String       sc_updt      ){    this.sc_updt      = sc_updt         ;    }
    public void setRep_cmdt_cd1( String       rep_cmdt_cd1 ){    this.rep_cmdt_cd1 = rep_cmdt_cd1    ;    }
    public void setRep_cmdt_cd2( String       rep_cmdt_cd2 ){    this.rep_cmdt_cd2 = rep_cmdt_cd2    ;    }
    public void setSc_no_old   ( String       sc_no_old    ){    this.sc_no_old    = sc_no_old       ;    }
    public void setSc_comp_ind ( String       sc_comp_ind  ){    this.sc_comp_ind  = sc_comp_ind     ;    }
    public void setNis_event_dt( String       nis_event_dt ){    this.nis_event_dt = nis_event_dt    ;    }

    public static SC_GENINF fromRequest(HttpServletRequest request) {
        SC_GENINF model = new SC_GENINF();
        try {
            model.setIbflag          (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
            model.setPage_rows       (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
            model.setSc_tp           (JSPUtil.getParameter(request, "sc_tp               ".trim(), ""));
            model.setSc_no           (JSPUtil.getParameter(request, "sc_no               ".trim(), ""));
            model.setSc_svc_scp      (JSPUtil.getParameter(request, "sc_svc_scp          ".trim(), ""));
            model.setSc_bnd          (JSPUtil.getParameter(request, "sc_bnd              ".trim(), ""));
            model.setSc_seq          (JSPUtil.getParameter(request, "sc_seq              ".trim(), ""));
            model.setRep_cmdt_cd3    (JSPUtil.getParameter(request, "rep_cmdt_cd3        ".trim(), ""));
            model.setSc_cnt_cd       (JSPUtil.getParameter(request, "sc_cnt_cd           ".trim(), ""));
            model.setSc_cust_cd      (JSPUtil.getParameter(request, "sc_cust_cd          ".trim(), ""));
            model.setSc_ofc_cd       (JSPUtil.getParameter(request, "sc_ofc_cd           ".trim(), ""));
            model.setSc_srep_cd      (JSPUtil.getParameter(request, "sc_srep_cd          ".trim(), ""));
            model.setSc_cust_tp      (JSPUtil.getParameter(request, "sc_cust_tp          ".trim(), ""));
            model.setSc_mqc_min      (JSPUtil.getParameter(request, "sc_mqc_min          ".trim(), ""));
            model.setSc_min_tp       (JSPUtil.getParameter(request, "sc_min_tp           ".trim(), ""));
            model.setSc_mqc_max      (JSPUtil.getParameter(request, "sc_mqc_max          ".trim(), ""));
            model.setSc_max_tp       (JSPUtil.getParameter(request, "sc_max_tp           ".trim(), ""));
            model.setSc_eff_dt       (JSPUtil.getParameter(request, "sc_eff_dt           ".trim(), ""));
            model.setSc_exp_dt       (JSPUtil.getParameter(request, "sc_exp_dt           ".trim(), ""));
            model.setSc_dead_frt     (JSPUtil.getParameter(request, "sc_dead_frt         ".trim(), ""));
            model.setSc_svc_cmmt     (JSPUtil.getParameter(request, "sc_svc_cmmt         ".trim(), ""));
            model.setSc_remark       (JSPUtil.getParameter(request, "sc_remark           ".trim(), ""));
            model.setSc_usrid        (JSPUtil.getParameter(request, "sc_usrid            ".trim(), ""));
            model.setSc_crdt         (JSPUtil.getParameter(request, "sc_crdt             ".trim(), ""));
            model.setSc_updt         (JSPUtil.getParameter(request, "sc_updt             ".trim(), ""));
            model.setRep_cmdt_cd1    (JSPUtil.getParameter(request, "rep_cmdt_cd1        ".trim(), ""));
            model.setRep_cmdt_cd2    (JSPUtil.getParameter(request, "rep_cmdt_cd2        ".trim(), ""));
            model.setSc_no_old       (JSPUtil.getParameter(request, "sc_no_old           ".trim(), ""));
            model.setSc_comp_ind     (JSPUtil.getParameter(request, "sc_comp_ind         ".trim(), ""));
            model.setNis_event_dt    (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SC_GENINF model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
            String[] sc_tp        =  (JSPUtil.getParameter(request, "sc_tp               ".trim(), length));
            String[] sc_no        =  (JSPUtil.getParameter(request, "sc_no               ".trim(), length));
            String[] sc_svc_scp   =  (JSPUtil.getParameter(request, "sc_svc_scp          ".trim(), length));
            String[] sc_bnd       =  (JSPUtil.getParameter(request, "sc_bnd              ".trim(), length));
            String[] sc_seq       =  (JSPUtil.getParameter(request, "sc_seq              ".trim(), length));
            String[] rep_cmdt_cd3 =  (JSPUtil.getParameter(request, "rep_cmdt_cd3        ".trim(), length));
            String[] sc_cnt_cd    =  (JSPUtil.getParameter(request, "sc_cnt_cd           ".trim(), length));
            String[] sc_cust_cd   =  (JSPUtil.getParameter(request, "sc_cust_cd          ".trim(), length));
            String[] sc_ofc_cd    =  (JSPUtil.getParameter(request, "sc_ofc_cd           ".trim(), length));
            String[] sc_srep_cd   =  (JSPUtil.getParameter(request, "sc_srep_cd          ".trim(), length));
            String[] sc_cust_tp   =  (JSPUtil.getParameter(request, "sc_cust_tp          ".trim(), length));
            String[] sc_mqc_min   =  (JSPUtil.getParameter(request, "sc_mqc_min          ".trim(), length));
            String[] sc_min_tp    =  (JSPUtil.getParameter(request, "sc_min_tp           ".trim(), length));
            String[] sc_mqc_max   =  (JSPUtil.getParameter(request, "sc_mqc_max          ".trim(), length));
            String[] sc_max_tp    =  (JSPUtil.getParameter(request, "sc_max_tp           ".trim(), length));
            String[] sc_eff_dt    =  (JSPUtil.getParameter(request, "sc_eff_dt           ".trim(), length));
            String[] sc_exp_dt    =  (JSPUtil.getParameter(request, "sc_exp_dt           ".trim(), length));
            String[] sc_dead_frt  =  (JSPUtil.getParameter(request, "sc_dead_frt         ".trim(), length));
            String[] sc_svc_cmmt  =  (JSPUtil.getParameter(request, "sc_svc_cmmt         ".trim(), length));
            String[] sc_remark    =  (JSPUtil.getParameter(request, "sc_remark           ".trim(), length));
            String[] sc_usrid     =  (JSPUtil.getParameter(request, "sc_usrid            ".trim(), length));
            String[] sc_crdt      =  (JSPUtil.getParameter(request, "sc_crdt             ".trim(), length));
            String[] sc_updt      =  (JSPUtil.getParameter(request, "sc_updt             ".trim(), length));
            String[] rep_cmdt_cd1 =  (JSPUtil.getParameter(request, "rep_cmdt_cd1        ".trim(), length));
            String[] rep_cmdt_cd2 =  (JSPUtil.getParameter(request, "rep_cmdt_cd2        ".trim(), length));
            String[] sc_no_old    =  (JSPUtil.getParameter(request, "sc_no_old           ".trim(), length));
            String[] sc_comp_ind  =  (JSPUtil.getParameter(request, "sc_comp_ind         ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SC_GENINF();
                model.setIbflag                (ibflag          [i]);
                model.setPage_rows             (page_rows       [i]);
                model.setSc_tp                 (sc_tp           [i]);
                model.setSc_no                 (sc_no           [i]);
                model.setSc_svc_scp            (sc_svc_scp      [i]);
                model.setSc_bnd                (sc_bnd          [i]);
                model.setSc_seq                (sc_seq          [i]);
                model.setRep_cmdt_cd3          (rep_cmdt_cd3    [i]);
                model.setSc_cnt_cd             (sc_cnt_cd       [i]);
                model.setSc_cust_cd            (sc_cust_cd      [i]);
                model.setSc_ofc_cd             (sc_ofc_cd       [i]);
                model.setSc_srep_cd            (sc_srep_cd      [i]);
                model.setSc_cust_tp            (sc_cust_tp      [i]);
                model.setSc_mqc_min            (sc_mqc_min      [i]);
                model.setSc_min_tp             (sc_min_tp       [i]);
                model.setSc_mqc_max            (sc_mqc_max      [i]);
                model.setSc_max_tp             (sc_max_tp       [i]);
                model.setSc_eff_dt             (sc_eff_dt       [i]);
                model.setSc_exp_dt             (sc_exp_dt       [i]);
                model.setSc_dead_frt           (sc_dead_frt     [i]);
                model.setSc_svc_cmmt           (sc_svc_cmmt     [i]);
                model.setSc_remark             (sc_remark       [i]);
                model.setSc_usrid              (sc_usrid        [i]);
                model.setSc_crdt               (sc_crdt         [i]);
                model.setSc_updt               (sc_updt         [i]);
                model.setRep_cmdt_cd1          (rep_cmdt_cd1    [i]);
                model.setRep_cmdt_cd2          (rep_cmdt_cd2    [i]);
                model.setSc_no_old             (sc_no_old       [i]);
                model.setSc_comp_ind           (sc_comp_ind     [i]);
                model.setNis_event_dt          (nis_event_dt    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        SC_GENINF model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
            String[] sc_tp        =  (JSPUtil.getParameter(request, prefix + "sc_tp               ".trim(), length));
            String[] sc_no        =  (JSPUtil.getParameter(request, prefix + "sc_no               ".trim(), length));
            String[] sc_svc_scp   =  (JSPUtil.getParameter(request, prefix + "sc_svc_scp          ".trim(), length));
            String[] sc_bnd       =  (JSPUtil.getParameter(request, prefix + "sc_bnd              ".trim(), length));
            String[] sc_seq       =  (JSPUtil.getParameter(request, prefix + "sc_seq              ".trim(), length));
            String[] rep_cmdt_cd3 =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd3        ".trim(), length));
            String[] sc_cnt_cd    =  (JSPUtil.getParameter(request, prefix + "sc_cnt_cd           ".trim(), length));
            String[] sc_cust_cd   =  (JSPUtil.getParameter(request, prefix + "sc_cust_cd          ".trim(), length));
            String[] sc_ofc_cd    =  (JSPUtil.getParameter(request, prefix + "sc_ofc_cd           ".trim(), length));
            String[] sc_srep_cd   =  (JSPUtil.getParameter(request, prefix + "sc_srep_cd          ".trim(), length));
            String[] sc_cust_tp   =  (JSPUtil.getParameter(request, prefix + "sc_cust_tp          ".trim(), length));
            String[] sc_mqc_min   =  (JSPUtil.getParameter(request, prefix + "sc_mqc_min          ".trim(), length));
            String[] sc_min_tp    =  (JSPUtil.getParameter(request, prefix + "sc_min_tp           ".trim(), length));
            String[] sc_mqc_max   =  (JSPUtil.getParameter(request, prefix + "sc_mqc_max          ".trim(), length));
            String[] sc_max_tp    =  (JSPUtil.getParameter(request, prefix + "sc_max_tp           ".trim(), length));
            String[] sc_eff_dt    =  (JSPUtil.getParameter(request, prefix + "sc_eff_dt           ".trim(), length));
            String[] sc_exp_dt    =  (JSPUtil.getParameter(request, prefix + "sc_exp_dt           ".trim(), length));
            String[] sc_dead_frt  =  (JSPUtil.getParameter(request, prefix + "sc_dead_frt         ".trim(), length));
            String[] sc_svc_cmmt  =  (JSPUtil.getParameter(request, prefix + "sc_svc_cmmt         ".trim(), length));
            String[] sc_remark    =  (JSPUtil.getParameter(request, prefix + "sc_remark           ".trim(), length));
            String[] sc_usrid     =  (JSPUtil.getParameter(request, prefix + "sc_usrid            ".trim(), length));
            String[] sc_crdt      =  (JSPUtil.getParameter(request, prefix + "sc_crdt             ".trim(), length));
            String[] sc_updt      =  (JSPUtil.getParameter(request, prefix + "sc_updt             ".trim(), length));
            String[] rep_cmdt_cd1 =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd1        ".trim(), length));
            String[] rep_cmdt_cd2 =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd2        ".trim(), length));
            String[] sc_no_old    =  (JSPUtil.getParameter(request, prefix + "sc_no_old           ".trim(), length));
            String[] sc_comp_ind  =  (JSPUtil.getParameter(request, prefix + "sc_comp_ind         ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, prefix + "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SC_GENINF();
                model.setIbflag                ( ibflag          [i]);
                model.setPage_rows             ( page_rows       [i]);
                model.setSc_tp                 ( sc_tp           [i]);
                model.setSc_no                 ( sc_no           [i]);
                model.setSc_svc_scp            ( sc_svc_scp      [i]);
                model.setSc_bnd                ( sc_bnd          [i]);
                model.setSc_seq                ( sc_seq          [i]);
                model.setRep_cmdt_cd3          ( rep_cmdt_cd3    [i]);
                model.setSc_cnt_cd             ( sc_cnt_cd       [i]);
                model.setSc_cust_cd            ( sc_cust_cd      [i]);
                model.setSc_ofc_cd             ( sc_ofc_cd       [i]);
                model.setSc_srep_cd            ( sc_srep_cd      [i]);
                model.setSc_cust_tp            ( sc_cust_tp      [i]);
                model.setSc_mqc_min            ( sc_mqc_min      [i]);
                model.setSc_min_tp             ( sc_min_tp       [i]);
                model.setSc_mqc_max            ( sc_mqc_max      [i]);
                model.setSc_max_tp             ( sc_max_tp       [i]);
                model.setSc_eff_dt             ( sc_eff_dt       [i]);
                model.setSc_exp_dt             ( sc_exp_dt       [i]);
                model.setSc_dead_frt           ( sc_dead_frt     [i]);
                model.setSc_svc_cmmt           ( sc_svc_cmmt     [i]);
                model.setSc_remark             ( sc_remark       [i]);
                model.setSc_usrid              ( sc_usrid        [i]);
                model.setSc_crdt               ( sc_crdt         [i]);
                model.setSc_updt               ( sc_updt         [i]);
                model.setRep_cmdt_cd1          ( rep_cmdt_cd1    [i]);
                model.setRep_cmdt_cd2          ( rep_cmdt_cd2    [i]);
                model.setSc_no_old             ( sc_no_old       [i]);
                model.setSc_comp_ind           ( sc_comp_ind     [i]);
                model.setNis_event_dt          ( nis_event_dt    [i]);
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
