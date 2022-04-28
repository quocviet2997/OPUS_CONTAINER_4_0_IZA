/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LOCATION.java
*@FileTitle : Location 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-03 Hyung Choon
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
 * @author Hyung Choon
 * @since J2EE 1.4
 */public final class LOCATION implements java.io.Serializable {

    private String           ibflag           = "";
    private String           page_rows        = "";
    private String           loc_cd           = "";
    private String           loc_ct           = "";
    private String           sconti_cd        = "";
    private String           loc_desc         = "";
    private String           conti_cd         = "";
    private String           cnt_cd           = "";
    private String           rgn_cd           = "";
    private String           loc_port_ind     = "";
    private String           loc_char         = "";
    private String           loc_lcc          = "";
    private String           loc_rcc          = "";
    private String           loc_hub_cd       = "";
    private String           loc_hub_tt       = "";
    private String           loc_grp          = "";
    private String           loc_sof          = "";
    private String           loc_hwy_wt_unit  = "";
    private String           loc_road_ht_unit = "";
    private String           loc_credt        = "";
    private String           loc_updt         = "";
    private String           loc_authid       = "";
    private String           loc_delind       = "";
    private String           loc_state        = "";
    private String           loc_grid         = "";
    private String           loc_customs      = "";
    private String           loc_gmt          = "";
    private String           loc_un_ind       = "";
    private String           loc_hancos       = "";
    private String           loc_call_ind     = "";
    private String           loc_scc          = "";
    private String           loc_amsport      = "";
    private String           loc_fin_ofc      = "";
    private String           loc_eq_ofc       = "";
    private String           loc_pu_yd        = "";
    private String           loc_latitude     = "";
    private String           loc_longitude    = "";
    private String           loc_japan        = "";
    private String           nis_event_dt     = "";
    private String           sen_loc_eq_ofc   = "";
    private String           loc_rtn_cy       = "";
    private String           loc_un_code      = "";
    private String           loc_fin_ind      = "";
    private String           loc_comm_zone    = "";

    public LOCATION(){}

    public LOCATION(
            String           ibflag          ,
            String           page_rows       ,
            String           loc_cd          ,
            String           loc_ct          ,
            String           sconti_cd       ,
            String           loc_desc        ,
            String           conti_cd        ,
            String           cnt_cd          ,
            String           rgn_cd          ,
            String           loc_port_ind    ,
            String           loc_char        ,
            String           loc_lcc         ,
            String           loc_rcc         ,
            String           loc_hub_cd      ,
            String           loc_hub_tt      ,
            String           loc_grp         ,
            String           loc_sof         ,
            String           loc_hwy_wt_unit ,
            String           loc_road_ht_unit,
            String           loc_credt       ,
            String           loc_updt        ,
            String           loc_authid      ,
            String           loc_delind      ,
            String           loc_state       ,
            String           loc_grid        ,
            String           loc_customs     ,
            String           loc_gmt         ,
            String           loc_un_ind      ,
            String           loc_hancos      ,
            String           loc_call_ind    ,
            String           loc_scc         ,
            String           loc_amsport     ,
            String           loc_fin_ofc     ,
            String           loc_eq_ofc      ,
            String           loc_pu_yd       ,
            String           loc_latitude    ,
            String           loc_longitude   ,
            String           loc_japan       ,
            String           nis_event_dt    ,
            String           sen_loc_eq_ofc  ,
            String           loc_rtn_cy      ,
            String           loc_un_code     ,
            String           loc_fin_ind     ,
            String           loc_comm_zone   ){
        this.ibflag           = ibflag          ;
        this.page_rows        = page_rows       ;
        this.loc_cd           = loc_cd          ;
        this.loc_ct           = loc_ct          ;
        this.sconti_cd        = sconti_cd       ;
        this.loc_desc         = loc_desc        ;
        this.conti_cd         = conti_cd        ;
        this.cnt_cd           = cnt_cd          ;
        this.rgn_cd           = rgn_cd          ;
        this.loc_port_ind     = loc_port_ind    ;
        this.loc_char         = loc_char        ;
        this.loc_lcc          = loc_lcc         ;
        this.loc_rcc          = loc_rcc         ;
        this.loc_hub_cd       = loc_hub_cd      ;
        this.loc_hub_tt       = loc_hub_tt      ;
        this.loc_grp          = loc_grp         ;
        this.loc_sof          = loc_sof         ;
        this.loc_hwy_wt_unit  = loc_hwy_wt_unit ;
        this.loc_road_ht_unit = loc_road_ht_unit;
        this.loc_credt        = loc_credt       ;
        this.loc_updt         = loc_updt        ;
        this.loc_authid       = loc_authid      ;
        this.loc_delind       = loc_delind      ;
        this.loc_state        = loc_state       ;
        this.loc_grid         = loc_grid        ;
        this.loc_customs      = loc_customs     ;
        this.loc_gmt          = loc_gmt         ;
        this.loc_un_ind       = loc_un_ind      ;
        this.loc_hancos       = loc_hancos      ;
        this.loc_call_ind     = loc_call_ind    ;
        this.loc_scc          = loc_scc         ;
        this.loc_amsport      = loc_amsport     ;
        this.loc_fin_ofc      = loc_fin_ofc     ;
        this.loc_eq_ofc       = loc_eq_ofc      ;
        this.loc_pu_yd        = loc_pu_yd       ;
        this.loc_latitude     = loc_latitude    ;
        this.loc_longitude    = loc_longitude   ;
        this.loc_japan        = loc_japan       ;
        this.nis_event_dt     = nis_event_dt    ;
        this.sen_loc_eq_ofc   = sen_loc_eq_ofc  ;
        this.loc_rtn_cy       = loc_rtn_cy      ;
        this.loc_un_code      = loc_un_code     ;
        this.loc_fin_ind      = loc_fin_ind     ;
        this.loc_comm_zone    = loc_comm_zone   ;
    }

    // getter method is proceeding ..
    public String           getIbflag          (){    return ibflag              ;    }
    public String           getPage_rows       (){    return page_rows           ;    }
    public String           getLoc_cd          (){    return loc_cd              ;    }
    public String           getLoc_ct          (){    return loc_ct              ;    }
    public String           getSconti_cd       (){    return sconti_cd           ;    }
    public String           getLoc_desc        (){    return loc_desc            ;    }
    public String           getConti_cd        (){    return conti_cd            ;    }
    public String           getCnt_cd          (){    return cnt_cd              ;    }
    public String           getRgn_cd          (){    return rgn_cd              ;    }
    public String           getLoc_port_ind    (){    return loc_port_ind        ;    }
    public String           getLoc_char        (){    return loc_char            ;    }
    public String           getLoc_lcc         (){    return loc_lcc             ;    }
    public String           getLoc_rcc         (){    return loc_rcc             ;    }
    public String           getLoc_hub_cd      (){    return loc_hub_cd          ;    }
    public String           getLoc_hub_tt      (){    return loc_hub_tt          ;    }
    public String           getLoc_grp         (){    return loc_grp             ;    }
    public String           getLoc_sof         (){    return loc_sof             ;    }
    public String           getLoc_hwy_wt_unit (){    return loc_hwy_wt_unit     ;    }
    public String           getLoc_road_ht_unit(){    return loc_road_ht_unit    ;    }
    public String           getLoc_credt       (){    return loc_credt           ;    }
    public String           getLoc_updt        (){    return loc_updt            ;    }
    public String           getLoc_authid      (){    return loc_authid          ;    }
    public String           getLoc_delind      (){    return loc_delind          ;    }
    public String           getLoc_state       (){    return loc_state           ;    }
    public String           getLoc_grid        (){    return loc_grid            ;    }
    public String           getLoc_customs     (){    return loc_customs         ;    }
    public String           getLoc_gmt         (){    return loc_gmt             ;    }
    public String           getLoc_un_ind      (){    return loc_un_ind          ;    }
    public String           getLoc_hancos      (){    return loc_hancos          ;    }
    public String           getLoc_call_ind    (){    return loc_call_ind        ;    }
    public String           getLoc_scc         (){    return loc_scc             ;    }
    public String           getLoc_amsport     (){    return loc_amsport         ;    }
    public String           getLoc_fin_ofc     (){    return loc_fin_ofc         ;    }
    public String           getLoc_eq_ofc      (){    return loc_eq_ofc          ;    }
    public String           getLoc_pu_yd       (){    return loc_pu_yd           ;    }
    public String           getLoc_latitude    (){    return loc_latitude        ;    }
    public String           getLoc_longitude   (){    return loc_longitude       ;    }
    public String           getLoc_japan       (){    return loc_japan           ;    }
    public String           getNis_event_dt    (){    return nis_event_dt        ;    }
    public String           getSen_loc_eq_ofc  (){    return sen_loc_eq_ofc      ;    }
    public String           getLoc_rtn_cy      (){    return loc_rtn_cy          ;    }
    public String           getLoc_un_code     (){    return loc_un_code         ;    }
    public String           getLoc_fin_ind     (){    return loc_fin_ind         ;    }
    public String           getLoc_comm_zone   (){    return loc_comm_zone       ;    }

    // setter method is proceeding ..
    public void setIbflag          ( String           ibflag           ){    this.ibflag           = ibflag              ;    }
    public void setPage_rows       ( String           page_rows        ){    this.page_rows        = page_rows           ;    }
    public void setLoc_cd          ( String           loc_cd           ){    this.loc_cd           = loc_cd              ;    }
    public void setLoc_ct          ( String           loc_ct           ){    this.loc_ct           = loc_ct              ;    }
    public void setSconti_cd       ( String           sconti_cd        ){    this.sconti_cd        = sconti_cd           ;    }
    public void setLoc_desc        ( String           loc_desc         ){    this.loc_desc         = loc_desc            ;    }
    public void setConti_cd        ( String           conti_cd         ){    this.conti_cd         = conti_cd            ;    }
    public void setCnt_cd          ( String           cnt_cd           ){    this.cnt_cd           = cnt_cd              ;    }
    public void setRgn_cd          ( String           rgn_cd           ){    this.rgn_cd           = rgn_cd              ;    }
    public void setLoc_port_ind    ( String           loc_port_ind     ){    this.loc_port_ind     = loc_port_ind        ;    }
    public void setLoc_char        ( String           loc_char         ){    this.loc_char         = loc_char            ;    }
    public void setLoc_lcc         ( String           loc_lcc          ){    this.loc_lcc          = loc_lcc             ;    }
    public void setLoc_rcc         ( String           loc_rcc          ){    this.loc_rcc          = loc_rcc             ;    }
    public void setLoc_hub_cd      ( String           loc_hub_cd       ){    this.loc_hub_cd       = loc_hub_cd          ;    }
    public void setLoc_hub_tt      ( String           loc_hub_tt       ){    this.loc_hub_tt       = loc_hub_tt          ;    }
    public void setLoc_grp         ( String           loc_grp          ){    this.loc_grp          = loc_grp             ;    }
    public void setLoc_sof         ( String           loc_sof          ){    this.loc_sof          = loc_sof             ;    }
    public void setLoc_hwy_wt_unit ( String           loc_hwy_wt_unit  ){    this.loc_hwy_wt_unit  = loc_hwy_wt_unit     ;    }
    public void setLoc_road_ht_unit( String           loc_road_ht_unit ){    this.loc_road_ht_unit = loc_road_ht_unit    ;    }
    public void setLoc_credt       ( String           loc_credt        ){    this.loc_credt        = loc_credt           ;    }
    public void setLoc_updt        ( String           loc_updt         ){    this.loc_updt         = loc_updt            ;    }
    public void setLoc_authid      ( String           loc_authid       ){    this.loc_authid       = loc_authid          ;    }
    public void setLoc_delind      ( String           loc_delind       ){    this.loc_delind       = loc_delind          ;    }
    public void setLoc_state       ( String           loc_state        ){    this.loc_state        = loc_state           ;    }
    public void setLoc_grid        ( String           loc_grid         ){    this.loc_grid         = loc_grid            ;    }
    public void setLoc_customs     ( String           loc_customs      ){    this.loc_customs      = loc_customs         ;    }
    public void setLoc_gmt         ( String           loc_gmt          ){    this.loc_gmt          = loc_gmt             ;    }
    public void setLoc_un_ind      ( String           loc_un_ind       ){    this.loc_un_ind       = loc_un_ind          ;    }
    public void setLoc_hancos      ( String           loc_hancos       ){    this.loc_hancos       = loc_hancos          ;    }
    public void setLoc_call_ind    ( String           loc_call_ind     ){    this.loc_call_ind     = loc_call_ind        ;    }
    public void setLoc_scc         ( String           loc_scc          ){    this.loc_scc          = loc_scc             ;    }
    public void setLoc_amsport     ( String           loc_amsport      ){    this.loc_amsport      = loc_amsport         ;    }
    public void setLoc_fin_ofc     ( String           loc_fin_ofc      ){    this.loc_fin_ofc      = loc_fin_ofc         ;    }
    public void setLoc_eq_ofc      ( String           loc_eq_ofc       ){    this.loc_eq_ofc       = loc_eq_ofc          ;    }
    public void setLoc_pu_yd       ( String           loc_pu_yd        ){    this.loc_pu_yd        = loc_pu_yd           ;    }
    public void setLoc_latitude    ( String           loc_latitude     ){    this.loc_latitude     = loc_latitude        ;    }
    public void setLoc_longitude   ( String           loc_longitude    ){    this.loc_longitude    = loc_longitude       ;    }
    public void setLoc_japan       ( String           loc_japan        ){    this.loc_japan        = loc_japan           ;    }
    public void setNis_event_dt    ( String           nis_event_dt     ){    this.nis_event_dt     = nis_event_dt        ;    }
    public void setSen_loc_eq_ofc  ( String           sen_loc_eq_ofc   ){    this.sen_loc_eq_ofc   = sen_loc_eq_ofc      ;    }
    public void setLoc_rtn_cy      ( String           loc_rtn_cy       ){    this.loc_rtn_cy       = loc_rtn_cy          ;    }
    public void setLoc_un_code     ( String           loc_un_code      ){    this.loc_un_code      = loc_un_code         ;    }
    public void setLoc_fin_ind     ( String           loc_fin_ind      ){    this.loc_fin_ind      = loc_fin_ind         ;    }
    public void setLoc_comm_zone   ( String           loc_comm_zone    ){    this.loc_comm_zone    = loc_comm_zone       ;    }

    public static LOCATION fromRequest(HttpServletRequest request) {
        LOCATION model = new LOCATION();
        try {
            model.setIbflag              (JSPUtil.getParameter(request, "ibflag                  ".trim(), ""));
            model.setPage_rows           (JSPUtil.getParameter(request, "page_rows               ".trim(), ""));
            model.setLoc_cd              (JSPUtil.getParameter(request, "loc_cd                  ".trim(), ""));
            model.setLoc_ct              (JSPUtil.getParameter(request, "loc_ct                  ".trim(), ""));
            model.setSconti_cd           (JSPUtil.getParameter(request, "sconti_cd               ".trim(), ""));
            model.setLoc_desc            (JSPUtil.getParameter(request, "loc_desc                ".trim(), ""));
            model.setConti_cd            (JSPUtil.getParameter(request, "conti_cd                ".trim(), ""));
            model.setCnt_cd              (JSPUtil.getParameter(request, "cnt_cd                  ".trim(), ""));
            model.setRgn_cd              (JSPUtil.getParameter(request, "rgn_cd                  ".trim(), ""));
            model.setLoc_port_ind        (JSPUtil.getParameter(request, "loc_port_ind            ".trim(), ""));
            model.setLoc_char            (JSPUtil.getParameter(request, "loc_char                ".trim(), ""));
            model.setLoc_lcc             (JSPUtil.getParameter(request, "loc_lcc                 ".trim(), ""));
            model.setLoc_rcc             (JSPUtil.getParameter(request, "loc_rcc                 ".trim(), ""));
            model.setLoc_hub_cd          (JSPUtil.getParameter(request, "loc_hub_cd              ".trim(), ""));
            model.setLoc_hub_tt          (JSPUtil.getParameter(request, "loc_hub_tt              ".trim(), ""));
            model.setLoc_grp             (JSPUtil.getParameter(request, "loc_grp                 ".trim(), ""));
            model.setLoc_sof             (JSPUtil.getParameter(request, "loc_sof                 ".trim(), ""));
            model.setLoc_hwy_wt_unit     (JSPUtil.getParameter(request, "loc_hwy_wt_unit         ".trim(), ""));
            model.setLoc_road_ht_unit    (JSPUtil.getParameter(request, "loc_road_ht_unit        ".trim(), ""));
            model.setLoc_credt           (JSPUtil.getParameter(request, "loc_credt               ".trim(), ""));
            model.setLoc_updt            (JSPUtil.getParameter(request, "loc_updt                ".trim(), ""));
            model.setLoc_authid          (JSPUtil.getParameter(request, "loc_authid              ".trim(), ""));
            model.setLoc_delind          (JSPUtil.getParameter(request, "loc_delind              ".trim(), ""));
            model.setLoc_state           (JSPUtil.getParameter(request, "loc_state               ".trim(), ""));
            model.setLoc_grid            (JSPUtil.getParameter(request, "loc_grid                ".trim(), ""));
            model.setLoc_customs         (JSPUtil.getParameter(request, "loc_customs             ".trim(), ""));
            model.setLoc_gmt             (JSPUtil.getParameter(request, "loc_gmt                 ".trim(), ""));
            model.setLoc_un_ind          (JSPUtil.getParameter(request, "loc_un_ind              ".trim(), ""));
            model.setLoc_hancos          (JSPUtil.getParameter(request, "loc_hancos              ".trim(), ""));
            model.setLoc_call_ind        (JSPUtil.getParameter(request, "loc_call_ind            ".trim(), ""));
            model.setLoc_scc             (JSPUtil.getParameter(request, "loc_scc                 ".trim(), ""));
            model.setLoc_amsport         (JSPUtil.getParameter(request, "loc_amsport             ".trim(), ""));
            model.setLoc_fin_ofc         (JSPUtil.getParameter(request, "loc_fin_ofc             ".trim(), ""));
            model.setLoc_eq_ofc          (JSPUtil.getParameter(request, "loc_eq_ofc              ".trim(), ""));
            model.setLoc_pu_yd           (JSPUtil.getParameter(request, "loc_pu_yd               ".trim(), ""));
            model.setLoc_latitude        (JSPUtil.getParameter(request, "loc_latitude            ".trim(), ""));
            model.setLoc_longitude       (JSPUtil.getParameter(request, "loc_longitude           ".trim(), ""));
            model.setLoc_japan           (JSPUtil.getParameter(request, "loc_japan               ".trim(), ""));
            model.setNis_event_dt        (JSPUtil.getParameter(request, "nis_event_dt            ".trim(), ""));
            model.setSen_loc_eq_ofc      (JSPUtil.getParameter(request, "sen_loc_eq_ofc          ".trim(), ""));
            model.setLoc_rtn_cy          (JSPUtil.getParameter(request, "loc_rtn_cy              ".trim(), ""));
            model.setLoc_un_code         (JSPUtil.getParameter(request, "loc_un_code             ".trim(), ""));
            model.setLoc_fin_ind         (JSPUtil.getParameter(request, "loc_fin_ind             ".trim(), ""));
            model.setLoc_comm_zone       (JSPUtil.getParameter(request, "loc_comm_zone           ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        LOCATION model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows               ".trim(), length));
            String[] loc_cd           =  (JSPUtil.getParameter(request, "loc_cd                  ".trim(), length));
            String[] loc_ct           =  (JSPUtil.getParameter(request, "loc_ct                  ".trim(), length));
            String[] sconti_cd        =  (JSPUtil.getParameter(request, "sconti_cd               ".trim(), length));
            String[] loc_desc         =  (JSPUtil.getParameter(request, "loc_desc                ".trim(), length));
            String[] conti_cd         =  (JSPUtil.getParameter(request, "conti_cd                ".trim(), length));
            String[] cnt_cd           =  (JSPUtil.getParameter(request, "cnt_cd                  ".trim(), length));
            String[] rgn_cd           =  (JSPUtil.getParameter(request, "rgn_cd                  ".trim(), length));
            String[] loc_port_ind     =  (JSPUtil.getParameter(request, "loc_port_ind            ".trim(), length));
            String[] loc_char         =  (JSPUtil.getParameter(request, "loc_char                ".trim(), length));
            String[] loc_lcc          =  (JSPUtil.getParameter(request, "loc_lcc                 ".trim(), length));
            String[] loc_rcc          =  (JSPUtil.getParameter(request, "loc_rcc                 ".trim(), length));
            String[] loc_hub_cd       =  (JSPUtil.getParameter(request, "loc_hub_cd              ".trim(), length));
            String[] loc_hub_tt       =  (JSPUtil.getParameter(request, "loc_hub_tt              ".trim(), length));
            String[] loc_grp          =  (JSPUtil.getParameter(request, "loc_grp                 ".trim(), length));
            String[] loc_sof          =  (JSPUtil.getParameter(request, "loc_sof                 ".trim(), length));
            String[] loc_hwy_wt_unit  =  (JSPUtil.getParameter(request, "loc_hwy_wt_unit         ".trim(), length));
            String[] loc_road_ht_unit =  (JSPUtil.getParameter(request, "loc_road_ht_unit        ".trim(), length));
            String[] loc_credt        =  (JSPUtil.getParameter(request, "loc_credt               ".trim(), length));
            String[] loc_updt         =  (JSPUtil.getParameter(request, "loc_updt                ".trim(), length));
            String[] loc_authid       =  (JSPUtil.getParameter(request, "loc_authid              ".trim(), length));
            String[] loc_delind       =  (JSPUtil.getParameter(request, "loc_delind              ".trim(), length));
            String[] loc_state        =  (JSPUtil.getParameter(request, "loc_state               ".trim(), length));
            String[] loc_grid         =  (JSPUtil.getParameter(request, "loc_grid                ".trim(), length));
            String[] loc_customs      =  (JSPUtil.getParameter(request, "loc_customs             ".trim(), length));
            String[] loc_gmt          =  (JSPUtil.getParameter(request, "loc_gmt                 ".trim(), length));
            String[] loc_un_ind       =  (JSPUtil.getParameter(request, "loc_un_ind              ".trim(), length));
            String[] loc_hancos       =  (JSPUtil.getParameter(request, "loc_hancos              ".trim(), length));
            String[] loc_call_ind     =  (JSPUtil.getParameter(request, "loc_call_ind            ".trim(), length));
            String[] loc_scc          =  (JSPUtil.getParameter(request, "loc_scc                 ".trim(), length));
            String[] loc_amsport      =  (JSPUtil.getParameter(request, "loc_amsport             ".trim(), length));
            String[] loc_fin_ofc      =  (JSPUtil.getParameter(request, "loc_fin_ofc             ".trim(), length));
            String[] loc_eq_ofc       =  (JSPUtil.getParameter(request, "loc_eq_ofc              ".trim(), length));
            String[] loc_pu_yd        =  (JSPUtil.getParameter(request, "loc_pu_yd               ".trim(), length));
            String[] loc_latitude     =  (JSPUtil.getParameter(request, "loc_latitude            ".trim(), length));
            String[] loc_longitude    =  (JSPUtil.getParameter(request, "loc_longitude           ".trim(), length));
            String[] loc_japan        =  (JSPUtil.getParameter(request, "loc_japan               ".trim(), length));
            String[] nis_event_dt     =  (JSPUtil.getParameter(request, "nis_event_dt            ".trim(), length));
            String[] sen_loc_eq_ofc   =  (JSPUtil.getParameter(request, "sen_loc_eq_ofc          ".trim(), length));
            String[] loc_rtn_cy       =  (JSPUtil.getParameter(request, "loc_rtn_cy              ".trim(), length));
            String[] loc_un_code      =  (JSPUtil.getParameter(request, "loc_un_code             ".trim(), length));
            String[] loc_fin_ind      =  (JSPUtil.getParameter(request, "loc_fin_ind             ".trim(), length));
            String[] loc_comm_zone    =  (JSPUtil.getParameter(request, "loc_comm_zone           ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new LOCATION();
                model.setIbflag                    (ibflag              [i]);
                model.setPage_rows                 (page_rows           [i]);
                model.setLoc_cd                    (loc_cd              [i]);
                model.setLoc_ct                    (loc_ct              [i]);
                model.setSconti_cd                 (sconti_cd           [i]);
                model.setLoc_desc                  (loc_desc            [i]);
                model.setConti_cd                  (conti_cd            [i]);
                model.setCnt_cd                    (cnt_cd              [i]);
                model.setRgn_cd                    (rgn_cd              [i]);
                model.setLoc_port_ind              (loc_port_ind        [i]);
                model.setLoc_char                  (loc_char            [i]);
                model.setLoc_lcc                   (loc_lcc             [i]);
                model.setLoc_rcc                   (loc_rcc             [i]);
                model.setLoc_hub_cd                (loc_hub_cd          [i]);
                model.setLoc_hub_tt                (loc_hub_tt          [i]);
                model.setLoc_grp                   (loc_grp             [i]);
                model.setLoc_sof                   (loc_sof             [i]);
                model.setLoc_hwy_wt_unit           (loc_hwy_wt_unit     [i]);
                model.setLoc_road_ht_unit          (loc_road_ht_unit    [i]);
                model.setLoc_credt                 (loc_credt           [i]);
                model.setLoc_updt                  (loc_updt            [i]);
                model.setLoc_authid                (loc_authid          [i]);
                model.setLoc_delind                (loc_delind          [i]);
                model.setLoc_state                 (loc_state           [i]);
                model.setLoc_grid                  (loc_grid            [i]);
                model.setLoc_customs               (loc_customs         [i]);
                model.setLoc_gmt                   (loc_gmt             [i]);
                model.setLoc_un_ind                (loc_un_ind          [i]);
                model.setLoc_hancos                (loc_hancos          [i]);
                model.setLoc_call_ind              (loc_call_ind        [i]);
                model.setLoc_scc                   (loc_scc             [i]);
                model.setLoc_amsport               (loc_amsport         [i]);
                model.setLoc_fin_ofc               (loc_fin_ofc         [i]);
                model.setLoc_eq_ofc                (loc_eq_ofc          [i]);
                model.setLoc_pu_yd                 (loc_pu_yd           [i]);
                model.setLoc_latitude              (loc_latitude        [i]);
                model.setLoc_longitude             (loc_longitude       [i]);
                model.setLoc_japan                 (loc_japan           [i]);
                model.setNis_event_dt              (nis_event_dt        [i]);
                model.setSen_loc_eq_ofc            (sen_loc_eq_ofc      [i]);
                model.setLoc_rtn_cy                (loc_rtn_cy          [i]);
                model.setLoc_un_code               (loc_un_code         [i]);
                model.setLoc_fin_ind               (loc_fin_ind         [i]);
                model.setLoc_comm_zone             (loc_comm_zone       [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        LOCATION model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows               ".trim(), length));
            String[] loc_cd           =  (JSPUtil.getParameter(request, prefix + "loc_cd                  ".trim(), length));
            String[] loc_ct           =  (JSPUtil.getParameter(request, prefix + "loc_ct                  ".trim(), length));
            String[] sconti_cd        =  (JSPUtil.getParameter(request, prefix + "sconti_cd               ".trim(), length));
            String[] loc_desc         =  (JSPUtil.getParameter(request, prefix + "loc_desc                ".trim(), length));
            String[] conti_cd         =  (JSPUtil.getParameter(request, prefix + "conti_cd                ".trim(), length));
            String[] cnt_cd           =  (JSPUtil.getParameter(request, prefix + "cnt_cd                  ".trim(), length));
            String[] rgn_cd           =  (JSPUtil.getParameter(request, prefix + "rgn_cd                  ".trim(), length));
            String[] loc_port_ind     =  (JSPUtil.getParameter(request, prefix + "loc_port_ind            ".trim(), length));
            String[] loc_char         =  (JSPUtil.getParameter(request, prefix + "loc_char                ".trim(), length));
            String[] loc_lcc          =  (JSPUtil.getParameter(request, prefix + "loc_lcc                 ".trim(), length));
            String[] loc_rcc          =  (JSPUtil.getParameter(request, prefix + "loc_rcc                 ".trim(), length));
            String[] loc_hub_cd       =  (JSPUtil.getParameter(request, prefix + "loc_hub_cd              ".trim(), length));
            String[] loc_hub_tt       =  (JSPUtil.getParameter(request, prefix + "loc_hub_tt              ".trim(), length));
            String[] loc_grp          =  (JSPUtil.getParameter(request, prefix + "loc_grp                 ".trim(), length));
            String[] loc_sof          =  (JSPUtil.getParameter(request, prefix + "loc_sof                 ".trim(), length));
            String[] loc_hwy_wt_unit  =  (JSPUtil.getParameter(request, prefix + "loc_hwy_wt_unit         ".trim(), length));
            String[] loc_road_ht_unit =  (JSPUtil.getParameter(request, prefix + "loc_road_ht_unit        ".trim(), length));
            String[] loc_credt        =  (JSPUtil.getParameter(request, prefix + "loc_credt               ".trim(), length));
            String[] loc_updt         =  (JSPUtil.getParameter(request, prefix + "loc_updt                ".trim(), length));
            String[] loc_authid       =  (JSPUtil.getParameter(request, prefix + "loc_authid              ".trim(), length));
            String[] loc_delind       =  (JSPUtil.getParameter(request, prefix + "loc_delind              ".trim(), length));
            String[] loc_state        =  (JSPUtil.getParameter(request, prefix + "loc_state               ".trim(), length));
            String[] loc_grid         =  (JSPUtil.getParameter(request, prefix + "loc_grid                ".trim(), length));
            String[] loc_customs      =  (JSPUtil.getParameter(request, prefix + "loc_customs             ".trim(), length));
            String[] loc_gmt          =  (JSPUtil.getParameter(request, prefix + "loc_gmt                 ".trim(), length));
            String[] loc_un_ind       =  (JSPUtil.getParameter(request, prefix + "loc_un_ind              ".trim(), length));
            String[] loc_hancos       =  (JSPUtil.getParameter(request, prefix + "loc_hancos              ".trim(), length));
            String[] loc_call_ind     =  (JSPUtil.getParameter(request, prefix + "loc_call_ind            ".trim(), length));
            String[] loc_scc          =  (JSPUtil.getParameter(request, prefix + "loc_scc                 ".trim(), length));
            String[] loc_amsport      =  (JSPUtil.getParameter(request, prefix + "loc_amsport             ".trim(), length));
            String[] loc_fin_ofc      =  (JSPUtil.getParameter(request, prefix + "loc_fin_ofc             ".trim(), length));
            String[] loc_eq_ofc       =  (JSPUtil.getParameter(request, prefix + "loc_eq_ofc              ".trim(), length));
            String[] loc_pu_yd        =  (JSPUtil.getParameter(request, prefix + "loc_pu_yd               ".trim(), length));
            String[] loc_latitude     =  (JSPUtil.getParameter(request, prefix + "loc_latitude            ".trim(), length));
            String[] loc_longitude    =  (JSPUtil.getParameter(request, prefix + "loc_longitude           ".trim(), length));
            String[] loc_japan        =  (JSPUtil.getParameter(request, prefix + "loc_japan               ".trim(), length));
            String[] nis_event_dt     =  (JSPUtil.getParameter(request, prefix + "nis_event_dt            ".trim(), length));
            String[] sen_loc_eq_ofc   =  (JSPUtil.getParameter(request, prefix + "sen_loc_eq_ofc          ".trim(), length));
            String[] loc_rtn_cy       =  (JSPUtil.getParameter(request, prefix + "loc_rtn_cy              ".trim(), length));
            String[] loc_un_code      =  (JSPUtil.getParameter(request, prefix + "loc_un_code             ".trim(), length));
            String[] loc_fin_ind      =  (JSPUtil.getParameter(request, prefix + "loc_fin_ind             ".trim(), length));
            String[] loc_comm_zone    =  (JSPUtil.getParameter(request, prefix + "loc_comm_zone           ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new LOCATION();
                model.setIbflag                    ( ibflag              [i]);
                model.setPage_rows                 ( page_rows           [i]);
                model.setLoc_cd                    ( loc_cd              [i]);
                model.setLoc_ct                    ( loc_ct              [i]);
                model.setSconti_cd                 ( sconti_cd           [i]);
                model.setLoc_desc                  ( loc_desc            [i]);
                model.setConti_cd                  ( conti_cd            [i]);
                model.setCnt_cd                    ( cnt_cd              [i]);
                model.setRgn_cd                    ( rgn_cd              [i]);
                model.setLoc_port_ind              ( loc_port_ind        [i]);
                model.setLoc_char                  ( loc_char            [i]);
                model.setLoc_lcc                   ( loc_lcc             [i]);
                model.setLoc_rcc                   ( loc_rcc             [i]);
                model.setLoc_hub_cd                ( loc_hub_cd          [i]);
                model.setLoc_hub_tt                ( loc_hub_tt          [i]);
                model.setLoc_grp                   ( loc_grp             [i]);
                model.setLoc_sof                   ( loc_sof             [i]);
                model.setLoc_hwy_wt_unit           ( loc_hwy_wt_unit     [i]);
                model.setLoc_road_ht_unit          ( loc_road_ht_unit    [i]);
                model.setLoc_credt                 ( loc_credt           [i]);
                model.setLoc_updt                  ( loc_updt            [i]);
                model.setLoc_authid                ( loc_authid          [i]);
                model.setLoc_delind                ( loc_delind          [i]);
                model.setLoc_state                 ( loc_state           [i]);
                model.setLoc_grid                  ( loc_grid            [i]);
                model.setLoc_customs               ( loc_customs         [i]);
                model.setLoc_gmt                   ( loc_gmt             [i]);
                model.setLoc_un_ind                ( loc_un_ind          [i]);
                model.setLoc_hancos                ( loc_hancos          [i]);
                model.setLoc_call_ind              ( loc_call_ind        [i]);
                model.setLoc_scc                   ( loc_scc             [i]);
                model.setLoc_amsport               ( loc_amsport         [i]);
                model.setLoc_fin_ofc               ( loc_fin_ofc         [i]);
                model.setLoc_eq_ofc                ( loc_eq_ofc          [i]);
                model.setLoc_pu_yd                 ( loc_pu_yd           [i]);
                model.setLoc_latitude              ( loc_latitude        [i]);
                model.setLoc_longitude             ( loc_longitude       [i]);
                model.setLoc_japan                 ( loc_japan           [i]);
                model.setNis_event_dt              ( nis_event_dt        [i]);
                model.setSen_loc_eq_ofc            ( sen_loc_eq_ofc      [i]);
                model.setLoc_rtn_cy                ( loc_rtn_cy          [i]);
                model.setLoc_un_code               ( loc_un_code         [i]);
                model.setLoc_fin_ind               ( loc_fin_ind         [i]);
                model.setLoc_comm_zone             ( loc_comm_zone       [i]);
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
