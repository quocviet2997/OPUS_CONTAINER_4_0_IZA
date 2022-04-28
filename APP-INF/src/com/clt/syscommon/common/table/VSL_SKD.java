/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSL_SKD.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-07 Hyunsu, Ryu
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
 * @author Hyunsu, Ryu
 * @since J2EE 1.4
 */public final class VSL_SKD implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            vsl_cd            = "";
    private String            skd_voyage_no     = "";
    private String            skd_dir_cd        = "";
    private String            sln_lane_cd       = "";
    private String            skd_skd_stat      = "";
    private String            skd_crt_dt        = "";
    private String            skd_udt_ind       = "";
    private String            skd_udt_per       = "";
    private String            skd_udt_dt        = "";
    private String            skd_next_loc_cd   = "";
    private String            skd_next_dir_cd   = "";
    private String            skd_next_call_ind = "";
    private String            skd_crt_ind       = "";
    private String            skd_remark        = "";
    private String            skd_voy_tp        = "";
    private String            skd_load_qty      = "";
    private String            skd_rev_port      = "";
    private String            skd_rev_dt        = "";
    private String            skd_pt_chk        = "";
    private String            skd_vvd_comn_div  = "";
    private String            skd_vvd_comn_cd   = "";
    private String            skd_car_cd        = "";
    private String            skd_spc_qty       = "";
    private String            skd_canal_cd      = "";
    private String            skd_sail_tot      = "";
    private String            skd_sail_day      = "";
    private String            skd_start_dt      = "";
    private String            skd_fdr_ind       = "";
    private String            skd_spc_nctl      = "";
    private String            skd_pln_port      = "";
    private String            skd_pln_mon       = "";
    private String            skd_start_port    = "";
    private String            skd_off_bnd       = "";
    private String            skd_ar_dt         = "";
    private String            skd_vsl_mon       = "";
    private String            skd_tml_vvd       = "";
    private String            skd_spc_rqty      = "";
    private String            skd_spc_wqty      = "";
    private String            skd_spc_nctl_rf   = "";
    private String            skd_spc_nctl_wt   = "";
    private String            skd_cntr_ind      = "";
    private String            skd_pseudo_vvd    = "";
    private String            skd_comp_ind      = "";
    private String            skd_crt_per       = "";
    private String            skd_used_ind      = "";
    private String            nis_event_dt      = "";

    public VSL_SKD(){}

    public VSL_SKD(
            String            ibflag           ,
            String            page_rows        ,
            String            vsl_cd           ,
            String            skd_voyage_no    ,
            String            skd_dir_cd       ,
            String            sln_lane_cd      ,
            String            skd_skd_stat     ,
            String            skd_crt_dt       ,
            String            skd_udt_ind      ,
            String            skd_udt_per      ,
            String            skd_udt_dt       ,
            String            skd_next_loc_cd  ,
            String            skd_next_dir_cd  ,
            String            skd_next_call_ind,
            String            skd_crt_ind      ,
            String            skd_remark       ,
            String            skd_voy_tp       ,
            String            skd_load_qty     ,
            String            skd_rev_port     ,
            String            skd_rev_dt       ,
            String            skd_pt_chk       ,
            String            skd_vvd_comn_div ,
            String            skd_vvd_comn_cd  ,
            String            skd_car_cd       ,
            String            skd_spc_qty      ,
            String            skd_canal_cd     ,
            String            skd_sail_tot     ,
            String            skd_sail_day     ,
            String            skd_start_dt     ,
            String            skd_fdr_ind      ,
            String            skd_spc_nctl     ,
            String            skd_pln_port     ,
            String            skd_pln_mon      ,
            String            skd_start_port   ,
            String            skd_off_bnd      ,
            String            skd_ar_dt        ,
            String            skd_vsl_mon      ,
            String            skd_tml_vvd      ,
            String            skd_spc_rqty     ,
            String            skd_spc_wqty     ,
            String            skd_spc_nctl_rf  ,
            String            skd_spc_nctl_wt  ,
            String            skd_cntr_ind     ,
            String            skd_pseudo_vvd   ,
            String            skd_comp_ind     ,
            String            skd_crt_per      ,
            String            skd_used_ind     ,
            String            nis_event_dt     ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.vsl_cd            = vsl_cd           ;
        this.skd_voyage_no     = skd_voyage_no    ;
        this.skd_dir_cd        = skd_dir_cd       ;
        this.sln_lane_cd       = sln_lane_cd      ;
        this.skd_skd_stat      = skd_skd_stat     ;
        this.skd_crt_dt        = skd_crt_dt       ;
        this.skd_udt_ind       = skd_udt_ind      ;
        this.skd_udt_per       = skd_udt_per      ;
        this.skd_udt_dt        = skd_udt_dt       ;
        this.skd_next_loc_cd   = skd_next_loc_cd  ;
        this.skd_next_dir_cd   = skd_next_dir_cd  ;
        this.skd_next_call_ind = skd_next_call_ind;
        this.skd_crt_ind       = skd_crt_ind      ;
        this.skd_remark        = skd_remark       ;
        this.skd_voy_tp        = skd_voy_tp       ;
        this.skd_load_qty      = skd_load_qty     ;
        this.skd_rev_port      = skd_rev_port     ;
        this.skd_rev_dt        = skd_rev_dt       ;
        this.skd_pt_chk        = skd_pt_chk       ;
        this.skd_vvd_comn_div  = skd_vvd_comn_div ;
        this.skd_vvd_comn_cd   = skd_vvd_comn_cd  ;
        this.skd_car_cd        = skd_car_cd       ;
        this.skd_spc_qty       = skd_spc_qty      ;
        this.skd_canal_cd      = skd_canal_cd     ;
        this.skd_sail_tot      = skd_sail_tot     ;
        this.skd_sail_day      = skd_sail_day     ;
        this.skd_start_dt      = skd_start_dt     ;
        this.skd_fdr_ind       = skd_fdr_ind      ;
        this.skd_spc_nctl      = skd_spc_nctl     ;
        this.skd_pln_port      = skd_pln_port     ;
        this.skd_pln_mon       = skd_pln_mon      ;
        this.skd_start_port    = skd_start_port   ;
        this.skd_off_bnd       = skd_off_bnd      ;
        this.skd_ar_dt         = skd_ar_dt        ;
        this.skd_vsl_mon       = skd_vsl_mon      ;
        this.skd_tml_vvd       = skd_tml_vvd      ;
        this.skd_spc_rqty      = skd_spc_rqty     ;
        this.skd_spc_wqty      = skd_spc_wqty     ;
        this.skd_spc_nctl_rf   = skd_spc_nctl_rf  ;
        this.skd_spc_nctl_wt   = skd_spc_nctl_wt  ;
        this.skd_cntr_ind      = skd_cntr_ind     ;
        this.skd_pseudo_vvd    = skd_pseudo_vvd   ;
        this.skd_comp_ind      = skd_comp_ind     ;
        this.skd_crt_per       = skd_crt_per      ;
        this.skd_used_ind      = skd_used_ind     ;
        this.nis_event_dt      = nis_event_dt     ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getVsl_cd           (){    return vsl_cd               ;    }
    public String            getSkd_voyage_no    (){    return skd_voyage_no        ;    }
    public String            getSkd_dir_cd       (){    return skd_dir_cd           ;    }
    public String            getSln_lane_cd      (){    return sln_lane_cd          ;    }
    public String            getSkd_skd_stat     (){    return skd_skd_stat         ;    }
    public String            getSkd_crt_dt       (){    return skd_crt_dt           ;    }
    public String            getSkd_udt_ind      (){    return skd_udt_ind          ;    }
    public String            getSkd_udt_per      (){    return skd_udt_per          ;    }
    public String            getSkd_udt_dt       (){    return skd_udt_dt           ;    }
    public String            getSkd_next_loc_cd  (){    return skd_next_loc_cd      ;    }
    public String            getSkd_next_dir_cd  (){    return skd_next_dir_cd      ;    }
    public String            getSkd_next_call_ind(){    return skd_next_call_ind    ;    }
    public String            getSkd_crt_ind      (){    return skd_crt_ind          ;    }
    public String            getSkd_remark       (){    return skd_remark           ;    }
    public String            getSkd_voy_tp       (){    return skd_voy_tp           ;    }
    public String            getSkd_load_qty     (){    return skd_load_qty         ;    }
    public String            getSkd_rev_port     (){    return skd_rev_port         ;    }
    public String            getSkd_rev_dt       (){    return skd_rev_dt           ;    }
    public String            getSkd_pt_chk       (){    return skd_pt_chk           ;    }
    public String            getSkd_vvd_comn_div (){    return skd_vvd_comn_div     ;    }
    public String            getSkd_vvd_comn_cd  (){    return skd_vvd_comn_cd      ;    }
    public String            getSkd_car_cd       (){    return skd_car_cd           ;    }
    public String            getSkd_spc_qty      (){    return skd_spc_qty          ;    }
    public String            getSkd_canal_cd     (){    return skd_canal_cd         ;    }
    public String            getSkd_sail_tot     (){    return skd_sail_tot         ;    }
    public String            getSkd_sail_day     (){    return skd_sail_day         ;    }
    public String            getSkd_start_dt     (){    return skd_start_dt         ;    }
    public String            getSkd_fdr_ind      (){    return skd_fdr_ind          ;    }
    public String            getSkd_spc_nctl     (){    return skd_spc_nctl         ;    }
    public String            getSkd_pln_port     (){    return skd_pln_port         ;    }
    public String            getSkd_pln_mon      (){    return skd_pln_mon          ;    }
    public String            getSkd_start_port   (){    return skd_start_port       ;    }
    public String            getSkd_off_bnd      (){    return skd_off_bnd          ;    }
    public String            getSkd_ar_dt        (){    return skd_ar_dt            ;    }
    public String            getSkd_vsl_mon      (){    return skd_vsl_mon          ;    }
    public String            getSkd_tml_vvd      (){    return skd_tml_vvd          ;    }
    public String            getSkd_spc_rqty     (){    return skd_spc_rqty         ;    }
    public String            getSkd_spc_wqty     (){    return skd_spc_wqty         ;    }
    public String            getSkd_spc_nctl_rf  (){    return skd_spc_nctl_rf      ;    }
    public String            getSkd_spc_nctl_wt  (){    return skd_spc_nctl_wt      ;    }
    public String            getSkd_cntr_ind     (){    return skd_cntr_ind         ;    }
    public String            getSkd_pseudo_vvd   (){    return skd_pseudo_vvd       ;    }
    public String            getSkd_comp_ind     (){    return skd_comp_ind         ;    }
    public String            getSkd_crt_per      (){    return skd_crt_per          ;    }
    public String            getSkd_used_ind     (){    return skd_used_ind         ;    }
    public String            getNis_event_dt     (){    return nis_event_dt         ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setVsl_cd           ( String            vsl_cd            ){    this.vsl_cd            = vsl_cd               ;    }
    public void setSkd_voyage_no    ( String            skd_voyage_no     ){    this.skd_voyage_no     = skd_voyage_no        ;    }
    public void setSkd_dir_cd       ( String            skd_dir_cd        ){    this.skd_dir_cd        = skd_dir_cd           ;    }
    public void setSln_lane_cd      ( String            sln_lane_cd       ){    this.sln_lane_cd       = sln_lane_cd          ;    }
    public void setSkd_skd_stat     ( String            skd_skd_stat      ){    this.skd_skd_stat      = skd_skd_stat         ;    }
    public void setSkd_crt_dt       ( String            skd_crt_dt        ){    this.skd_crt_dt        = skd_crt_dt           ;    }
    public void setSkd_udt_ind      ( String            skd_udt_ind       ){    this.skd_udt_ind       = skd_udt_ind          ;    }
    public void setSkd_udt_per      ( String            skd_udt_per       ){    this.skd_udt_per       = skd_udt_per          ;    }
    public void setSkd_udt_dt       ( String            skd_udt_dt        ){    this.skd_udt_dt        = skd_udt_dt           ;    }
    public void setSkd_next_loc_cd  ( String            skd_next_loc_cd   ){    this.skd_next_loc_cd   = skd_next_loc_cd      ;    }
    public void setSkd_next_dir_cd  ( String            skd_next_dir_cd   ){    this.skd_next_dir_cd   = skd_next_dir_cd      ;    }
    public void setSkd_next_call_ind( String            skd_next_call_ind ){    this.skd_next_call_ind = skd_next_call_ind    ;    }
    public void setSkd_crt_ind      ( String            skd_crt_ind       ){    this.skd_crt_ind       = skd_crt_ind          ;    }
    public void setSkd_remark       ( String            skd_remark        ){    this.skd_remark        = skd_remark           ;    }
    public void setSkd_voy_tp       ( String            skd_voy_tp        ){    this.skd_voy_tp        = skd_voy_tp           ;    }
    public void setSkd_load_qty     ( String            skd_load_qty      ){    this.skd_load_qty      = skd_load_qty         ;    }
    public void setSkd_rev_port     ( String            skd_rev_port      ){    this.skd_rev_port      = skd_rev_port         ;    }
    public void setSkd_rev_dt       ( String            skd_rev_dt        ){    this.skd_rev_dt        = skd_rev_dt           ;    }
    public void setSkd_pt_chk       ( String            skd_pt_chk        ){    this.skd_pt_chk        = skd_pt_chk           ;    }
    public void setSkd_vvd_comn_div ( String            skd_vvd_comn_div  ){    this.skd_vvd_comn_div  = skd_vvd_comn_div     ;    }
    public void setSkd_vvd_comn_cd  ( String            skd_vvd_comn_cd   ){    this.skd_vvd_comn_cd   = skd_vvd_comn_cd      ;    }
    public void setSkd_car_cd       ( String            skd_car_cd        ){    this.skd_car_cd        = skd_car_cd           ;    }
    public void setSkd_spc_qty      ( String            skd_spc_qty       ){    this.skd_spc_qty       = skd_spc_qty          ;    }
    public void setSkd_canal_cd     ( String            skd_canal_cd      ){    this.skd_canal_cd      = skd_canal_cd         ;    }
    public void setSkd_sail_tot     ( String            skd_sail_tot      ){    this.skd_sail_tot      = skd_sail_tot         ;    }
    public void setSkd_sail_day     ( String            skd_sail_day      ){    this.skd_sail_day      = skd_sail_day         ;    }
    public void setSkd_start_dt     ( String            skd_start_dt      ){    this.skd_start_dt      = skd_start_dt         ;    }
    public void setSkd_fdr_ind      ( String            skd_fdr_ind       ){    this.skd_fdr_ind       = skd_fdr_ind          ;    }
    public void setSkd_spc_nctl     ( String            skd_spc_nctl      ){    this.skd_spc_nctl      = skd_spc_nctl         ;    }
    public void setSkd_pln_port     ( String            skd_pln_port      ){    this.skd_pln_port      = skd_pln_port         ;    }
    public void setSkd_pln_mon      ( String            skd_pln_mon       ){    this.skd_pln_mon       = skd_pln_mon          ;    }
    public void setSkd_start_port   ( String            skd_start_port    ){    this.skd_start_port    = skd_start_port       ;    }
    public void setSkd_off_bnd      ( String            skd_off_bnd       ){    this.skd_off_bnd       = skd_off_bnd          ;    }
    public void setSkd_ar_dt        ( String            skd_ar_dt         ){    this.skd_ar_dt         = skd_ar_dt            ;    }
    public void setSkd_vsl_mon      ( String            skd_vsl_mon       ){    this.skd_vsl_mon       = skd_vsl_mon          ;    }
    public void setSkd_tml_vvd      ( String            skd_tml_vvd       ){    this.skd_tml_vvd       = skd_tml_vvd          ;    }
    public void setSkd_spc_rqty     ( String            skd_spc_rqty      ){    this.skd_spc_rqty      = skd_spc_rqty         ;    }
    public void setSkd_spc_wqty     ( String            skd_spc_wqty      ){    this.skd_spc_wqty      = skd_spc_wqty         ;    }
    public void setSkd_spc_nctl_rf  ( String            skd_spc_nctl_rf   ){    this.skd_spc_nctl_rf   = skd_spc_nctl_rf      ;    }
    public void setSkd_spc_nctl_wt  ( String            skd_spc_nctl_wt   ){    this.skd_spc_nctl_wt   = skd_spc_nctl_wt      ;    }
    public void setSkd_cntr_ind     ( String            skd_cntr_ind      ){    this.skd_cntr_ind      = skd_cntr_ind         ;    }
    public void setSkd_pseudo_vvd   ( String            skd_pseudo_vvd    ){    this.skd_pseudo_vvd    = skd_pseudo_vvd       ;    }
    public void setSkd_comp_ind     ( String            skd_comp_ind      ){    this.skd_comp_ind      = skd_comp_ind         ;    }
    public void setSkd_crt_per      ( String            skd_crt_per       ){    this.skd_crt_per       = skd_crt_per          ;    }
    public void setSkd_used_ind     ( String            skd_used_ind      ){    this.skd_used_ind      = skd_used_ind         ;    }
    public void setNis_event_dt     ( String            nis_event_dt      ){    this.nis_event_dt      = nis_event_dt         ;    }

    public static VSL_SKD fromRequest(HttpServletRequest request) {
        VSL_SKD model = new VSL_SKD();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setVsl_cd               (JSPUtil.getParameter(request, "vsl_cd                   ".trim(), ""));
            model.setSkd_voyage_no        (JSPUtil.getParameter(request, "skd_voyage_no            ".trim(), ""));
            model.setSkd_dir_cd           (JSPUtil.getParameter(request, "skd_dir_cd               ".trim(), ""));
            model.setSln_lane_cd          (JSPUtil.getParameter(request, "sln_lane_cd              ".trim(), ""));
            model.setSkd_skd_stat         (JSPUtil.getParameter(request, "skd_skd_stat             ".trim(), ""));
            model.setSkd_crt_dt           (JSPUtil.getParameter(request, "skd_crt_dt               ".trim(), ""));
            model.setSkd_udt_ind          (JSPUtil.getParameter(request, "skd_udt_ind              ".trim(), ""));
            model.setSkd_udt_per          (JSPUtil.getParameter(request, "skd_udt_per              ".trim(), ""));
            model.setSkd_udt_dt           (JSPUtil.getParameter(request, "skd_udt_dt               ".trim(), ""));
            model.setSkd_next_loc_cd      (JSPUtil.getParameter(request, "skd_next_loc_cd          ".trim(), ""));
            model.setSkd_next_dir_cd      (JSPUtil.getParameter(request, "skd_next_dir_cd          ".trim(), ""));
            model.setSkd_next_call_ind    (JSPUtil.getParameter(request, "skd_next_call_ind        ".trim(), ""));
            model.setSkd_crt_ind          (JSPUtil.getParameter(request, "skd_crt_ind              ".trim(), ""));
            model.setSkd_remark           (JSPUtil.getParameter(request, "skd_remark               ".trim(), ""));
            model.setSkd_voy_tp           (JSPUtil.getParameter(request, "skd_voy_tp               ".trim(), ""));
            model.setSkd_load_qty         (JSPUtil.getParameter(request, "skd_load_qty             ".trim(), ""));
            model.setSkd_rev_port         (JSPUtil.getParameter(request, "skd_rev_port             ".trim(), ""));
            model.setSkd_rev_dt           (JSPUtil.getParameter(request, "skd_rev_dt               ".trim(), ""));
            model.setSkd_pt_chk           (JSPUtil.getParameter(request, "skd_pt_chk               ".trim(), ""));
            model.setSkd_vvd_comn_div     (JSPUtil.getParameter(request, "skd_vvd_comn_div         ".trim(), ""));
            model.setSkd_vvd_comn_cd      (JSPUtil.getParameter(request, "skd_vvd_comn_cd          ".trim(), ""));
            model.setSkd_car_cd           (JSPUtil.getParameter(request, "skd_car_cd               ".trim(), ""));
            model.setSkd_spc_qty          (JSPUtil.getParameter(request, "skd_spc_qty              ".trim(), ""));
            model.setSkd_canal_cd         (JSPUtil.getParameter(request, "skd_canal_cd             ".trim(), ""));
            model.setSkd_sail_tot         (JSPUtil.getParameter(request, "skd_sail_tot             ".trim(), ""));
            model.setSkd_sail_day         (JSPUtil.getParameter(request, "skd_sail_day             ".trim(), ""));
            model.setSkd_start_dt         (JSPUtil.getParameter(request, "skd_start_dt             ".trim(), ""));
            model.setSkd_fdr_ind          (JSPUtil.getParameter(request, "skd_fdr_ind              ".trim(), ""));
            model.setSkd_spc_nctl         (JSPUtil.getParameter(request, "skd_spc_nctl             ".trim(), ""));
            model.setSkd_pln_port         (JSPUtil.getParameter(request, "skd_pln_port             ".trim(), ""));
            model.setSkd_pln_mon          (JSPUtil.getParameter(request, "skd_pln_mon              ".trim(), ""));
            model.setSkd_start_port       (JSPUtil.getParameter(request, "skd_start_port           ".trim(), ""));
            model.setSkd_off_bnd          (JSPUtil.getParameter(request, "skd_off_bnd              ".trim(), ""));
            model.setSkd_ar_dt            (JSPUtil.getParameter(request, "skd_ar_dt                ".trim(), ""));
            model.setSkd_vsl_mon          (JSPUtil.getParameter(request, "skd_vsl_mon              ".trim(), ""));
            model.setSkd_tml_vvd          (JSPUtil.getParameter(request, "skd_tml_vvd              ".trim(), ""));
            model.setSkd_spc_rqty         (JSPUtil.getParameter(request, "skd_spc_rqty             ".trim(), ""));
            model.setSkd_spc_wqty         (JSPUtil.getParameter(request, "skd_spc_wqty             ".trim(), ""));
            model.setSkd_spc_nctl_rf      (JSPUtil.getParameter(request, "skd_spc_nctl_rf          ".trim(), ""));
            model.setSkd_spc_nctl_wt      (JSPUtil.getParameter(request, "skd_spc_nctl_wt          ".trim(), ""));
            model.setSkd_cntr_ind         (JSPUtil.getParameter(request, "skd_cntr_ind             ".trim(), ""));
            model.setSkd_pseudo_vvd       (JSPUtil.getParameter(request, "skd_pseudo_vvd           ".trim(), ""));
            model.setSkd_comp_ind         (JSPUtil.getParameter(request, "skd_comp_ind             ".trim(), ""));
            model.setSkd_crt_per          (JSPUtil.getParameter(request, "skd_crt_per              ".trim(), ""));
            model.setSkd_used_ind         (JSPUtil.getParameter(request, "skd_used_ind             ".trim(), ""));
            model.setNis_event_dt         (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        VSL_SKD model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] vsl_cd            =  (JSPUtil.getParameter(request, "vsl_cd                   ".trim(), length));
            String[] skd_voyage_no     =  (JSPUtil.getParameter(request, "skd_voyage_no            ".trim(), length));
            String[] skd_dir_cd        =  (JSPUtil.getParameter(request, "skd_dir_cd               ".trim(), length));
            String[] sln_lane_cd       =  (JSPUtil.getParameter(request, "sln_lane_cd              ".trim(), length));
            String[] skd_skd_stat      =  (JSPUtil.getParameter(request, "skd_skd_stat             ".trim(), length));
            String[] skd_crt_dt        =  (JSPUtil.getParameter(request, "skd_crt_dt               ".trim(), length));
            String[] skd_udt_ind       =  (JSPUtil.getParameter(request, "skd_udt_ind              ".trim(), length));
            String[] skd_udt_per       =  (JSPUtil.getParameter(request, "skd_udt_per              ".trim(), length));
            String[] skd_udt_dt        =  (JSPUtil.getParameter(request, "skd_udt_dt               ".trim(), length));
            String[] skd_next_loc_cd   =  (JSPUtil.getParameter(request, "skd_next_loc_cd          ".trim(), length));
            String[] skd_next_dir_cd   =  (JSPUtil.getParameter(request, "skd_next_dir_cd          ".trim(), length));
            String[] skd_next_call_ind =  (JSPUtil.getParameter(request, "skd_next_call_ind        ".trim(), length));
            String[] skd_crt_ind       =  (JSPUtil.getParameter(request, "skd_crt_ind              ".trim(), length));
            String[] skd_remark        =  (JSPUtil.getParameter(request, "skd_remark               ".trim(), length));
            String[] skd_voy_tp        =  (JSPUtil.getParameter(request, "skd_voy_tp               ".trim(), length));
            String[] skd_load_qty      =  (JSPUtil.getParameter(request, "skd_load_qty             ".trim(), length));
            String[] skd_rev_port      =  (JSPUtil.getParameter(request, "skd_rev_port             ".trim(), length));
            String[] skd_rev_dt        =  (JSPUtil.getParameter(request, "skd_rev_dt               ".trim(), length));
            String[] skd_pt_chk        =  (JSPUtil.getParameter(request, "skd_pt_chk               ".trim(), length));
            String[] skd_vvd_comn_div  =  (JSPUtil.getParameter(request, "skd_vvd_comn_div         ".trim(), length));
            String[] skd_vvd_comn_cd   =  (JSPUtil.getParameter(request, "skd_vvd_comn_cd          ".trim(), length));
            String[] skd_car_cd        =  (JSPUtil.getParameter(request, "skd_car_cd               ".trim(), length));
            String[] skd_spc_qty       =  (JSPUtil.getParameter(request, "skd_spc_qty              ".trim(), length));
            String[] skd_canal_cd      =  (JSPUtil.getParameter(request, "skd_canal_cd             ".trim(), length));
            String[] skd_sail_tot      =  (JSPUtil.getParameter(request, "skd_sail_tot             ".trim(), length));
            String[] skd_sail_day      =  (JSPUtil.getParameter(request, "skd_sail_day             ".trim(), length));
            String[] skd_start_dt      =  (JSPUtil.getParameter(request, "skd_start_dt             ".trim(), length));
            String[] skd_fdr_ind       =  (JSPUtil.getParameter(request, "skd_fdr_ind              ".trim(), length));
            String[] skd_spc_nctl      =  (JSPUtil.getParameter(request, "skd_spc_nctl             ".trim(), length));
            String[] skd_pln_port      =  (JSPUtil.getParameter(request, "skd_pln_port             ".trim(), length));
            String[] skd_pln_mon       =  (JSPUtil.getParameter(request, "skd_pln_mon              ".trim(), length));
            String[] skd_start_port    =  (JSPUtil.getParameter(request, "skd_start_port           ".trim(), length));
            String[] skd_off_bnd       =  (JSPUtil.getParameter(request, "skd_off_bnd              ".trim(), length));
            String[] skd_ar_dt         =  (JSPUtil.getParameter(request, "skd_ar_dt                ".trim(), length));
            String[] skd_vsl_mon       =  (JSPUtil.getParameter(request, "skd_vsl_mon              ".trim(), length));
            String[] skd_tml_vvd       =  (JSPUtil.getParameter(request, "skd_tml_vvd              ".trim(), length));
            String[] skd_spc_rqty      =  (JSPUtil.getParameter(request, "skd_spc_rqty             ".trim(), length));
            String[] skd_spc_wqty      =  (JSPUtil.getParameter(request, "skd_spc_wqty             ".trim(), length));
            String[] skd_spc_nctl_rf   =  (JSPUtil.getParameter(request, "skd_spc_nctl_rf          ".trim(), length));
            String[] skd_spc_nctl_wt   =  (JSPUtil.getParameter(request, "skd_spc_nctl_wt          ".trim(), length));
            String[] skd_cntr_ind      =  (JSPUtil.getParameter(request, "skd_cntr_ind             ".trim(), length));
            String[] skd_pseudo_vvd    =  (JSPUtil.getParameter(request, "skd_pseudo_vvd           ".trim(), length));
            String[] skd_comp_ind      =  (JSPUtil.getParameter(request, "skd_comp_ind             ".trim(), length));
            String[] skd_crt_per       =  (JSPUtil.getParameter(request, "skd_crt_per              ".trim(), length));
            String[] skd_used_ind      =  (JSPUtil.getParameter(request, "skd_used_ind             ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL_SKD();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setVsl_cd                     (vsl_cd               [i]);
                model.setSkd_voyage_no              (skd_voyage_no        [i]);
                model.setSkd_dir_cd                 (skd_dir_cd           [i]);
                model.setSln_lane_cd                (sln_lane_cd          [i]);
                model.setSkd_skd_stat               (skd_skd_stat         [i]);
                model.setSkd_crt_dt                 (skd_crt_dt           [i]);
                model.setSkd_udt_ind                (skd_udt_ind          [i]);
                model.setSkd_udt_per                (skd_udt_per          [i]);
                model.setSkd_udt_dt                 (skd_udt_dt           [i]);
                model.setSkd_next_loc_cd            (skd_next_loc_cd      [i]);
                model.setSkd_next_dir_cd            (skd_next_dir_cd      [i]);
                model.setSkd_next_call_ind          (skd_next_call_ind    [i]);
                model.setSkd_crt_ind                (skd_crt_ind          [i]);
                model.setSkd_remark                 (skd_remark           [i]);
                model.setSkd_voy_tp                 (skd_voy_tp           [i]);
                model.setSkd_load_qty               (skd_load_qty         [i]);
                model.setSkd_rev_port               (skd_rev_port         [i]);
                model.setSkd_rev_dt                 (skd_rev_dt           [i]);
                model.setSkd_pt_chk                 (skd_pt_chk           [i]);
                model.setSkd_vvd_comn_div           (skd_vvd_comn_div     [i]);
                model.setSkd_vvd_comn_cd            (skd_vvd_comn_cd      [i]);
                model.setSkd_car_cd                 (skd_car_cd           [i]);
                model.setSkd_spc_qty                (skd_spc_qty          [i]);
                model.setSkd_canal_cd               (skd_canal_cd         [i]);
                model.setSkd_sail_tot               (skd_sail_tot         [i]);
                model.setSkd_sail_day               (skd_sail_day         [i]);
                model.setSkd_start_dt               (skd_start_dt         [i]);
                model.setSkd_fdr_ind                (skd_fdr_ind          [i]);
                model.setSkd_spc_nctl               (skd_spc_nctl         [i]);
                model.setSkd_pln_port               (skd_pln_port         [i]);
                model.setSkd_pln_mon                (skd_pln_mon          [i]);
                model.setSkd_start_port             (skd_start_port       [i]);
                model.setSkd_off_bnd                (skd_off_bnd          [i]);
                model.setSkd_ar_dt                  (skd_ar_dt            [i]);
                model.setSkd_vsl_mon                (skd_vsl_mon          [i]);
                model.setSkd_tml_vvd                (skd_tml_vvd          [i]);
                model.setSkd_spc_rqty               (skd_spc_rqty         [i]);
                model.setSkd_spc_wqty               (skd_spc_wqty         [i]);
                model.setSkd_spc_nctl_rf            (skd_spc_nctl_rf      [i]);
                model.setSkd_spc_nctl_wt            (skd_spc_nctl_wt      [i]);
                model.setSkd_cntr_ind               (skd_cntr_ind         [i]);
                model.setSkd_pseudo_vvd             (skd_pseudo_vvd       [i]);
                model.setSkd_comp_ind               (skd_comp_ind         [i]);
                model.setSkd_crt_per                (skd_crt_per          [i]);
                model.setSkd_used_ind               (skd_used_ind         [i]);
                model.setNis_event_dt               (nis_event_dt         [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        VSL_SKD model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] vsl_cd            =  (JSPUtil.getParameter(request, prefix + "vsl_cd                   ".trim(), length));
            String[] skd_voyage_no     =  (JSPUtil.getParameter(request, prefix + "skd_voyage_no            ".trim(), length));
            String[] skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd               ".trim(), length));
            String[] sln_lane_cd       =  (JSPUtil.getParameter(request, prefix + "sln_lane_cd              ".trim(), length));
            String[] skd_skd_stat      =  (JSPUtil.getParameter(request, prefix + "skd_skd_stat             ".trim(), length));
            String[] skd_crt_dt        =  (JSPUtil.getParameter(request, prefix + "skd_crt_dt               ".trim(), length));
            String[] skd_udt_ind       =  (JSPUtil.getParameter(request, prefix + "skd_udt_ind              ".trim(), length));
            String[] skd_udt_per       =  (JSPUtil.getParameter(request, prefix + "skd_udt_per              ".trim(), length));
            String[] skd_udt_dt        =  (JSPUtil.getParameter(request, prefix + "skd_udt_dt               ".trim(), length));
            String[] skd_next_loc_cd   =  (JSPUtil.getParameter(request, prefix + "skd_next_loc_cd          ".trim(), length));
            String[] skd_next_dir_cd   =  (JSPUtil.getParameter(request, prefix + "skd_next_dir_cd          ".trim(), length));
            String[] skd_next_call_ind =  (JSPUtil.getParameter(request, prefix + "skd_next_call_ind        ".trim(), length));
            String[] skd_crt_ind       =  (JSPUtil.getParameter(request, prefix + "skd_crt_ind              ".trim(), length));
            String[] skd_remark        =  (JSPUtil.getParameter(request, prefix + "skd_remark               ".trim(), length));
            String[] skd_voy_tp        =  (JSPUtil.getParameter(request, prefix + "skd_voy_tp               ".trim(), length));
            String[] skd_load_qty      =  (JSPUtil.getParameter(request, prefix + "skd_load_qty             ".trim(), length));
            String[] skd_rev_port      =  (JSPUtil.getParameter(request, prefix + "skd_rev_port             ".trim(), length));
            String[] skd_rev_dt        =  (JSPUtil.getParameter(request, prefix + "skd_rev_dt               ".trim(), length));
            String[] skd_pt_chk        =  (JSPUtil.getParameter(request, prefix + "skd_pt_chk               ".trim(), length));
            String[] skd_vvd_comn_div  =  (JSPUtil.getParameter(request, prefix + "skd_vvd_comn_div         ".trim(), length));
            String[] skd_vvd_comn_cd   =  (JSPUtil.getParameter(request, prefix + "skd_vvd_comn_cd          ".trim(), length));
            String[] skd_car_cd        =  (JSPUtil.getParameter(request, prefix + "skd_car_cd               ".trim(), length));
            String[] skd_spc_qty       =  (JSPUtil.getParameter(request, prefix + "skd_spc_qty              ".trim(), length));
            String[] skd_canal_cd      =  (JSPUtil.getParameter(request, prefix + "skd_canal_cd             ".trim(), length));
            String[] skd_sail_tot      =  (JSPUtil.getParameter(request, prefix + "skd_sail_tot             ".trim(), length));
            String[] skd_sail_day      =  (JSPUtil.getParameter(request, prefix + "skd_sail_day             ".trim(), length));
            String[] skd_start_dt      =  (JSPUtil.getParameter(request, prefix + "skd_start_dt             ".trim(), length));
            String[] skd_fdr_ind       =  (JSPUtil.getParameter(request, prefix + "skd_fdr_ind              ".trim(), length));
            String[] skd_spc_nctl      =  (JSPUtil.getParameter(request, prefix + "skd_spc_nctl             ".trim(), length));
            String[] skd_pln_port      =  (JSPUtil.getParameter(request, prefix + "skd_pln_port             ".trim(), length));
            String[] skd_pln_mon       =  (JSPUtil.getParameter(request, prefix + "skd_pln_mon              ".trim(), length));
            String[] skd_start_port    =  (JSPUtil.getParameter(request, prefix + "skd_start_port           ".trim(), length));
            String[] skd_off_bnd       =  (JSPUtil.getParameter(request, prefix + "skd_off_bnd              ".trim(), length));
            String[] skd_ar_dt         =  (JSPUtil.getParameter(request, prefix + "skd_ar_dt                ".trim(), length));
            String[] skd_vsl_mon       =  (JSPUtil.getParameter(request, prefix + "skd_vsl_mon              ".trim(), length));
            String[] skd_tml_vvd       =  (JSPUtil.getParameter(request, prefix + "skd_tml_vvd              ".trim(), length));
            String[] skd_spc_rqty      =  (JSPUtil.getParameter(request, prefix + "skd_spc_rqty             ".trim(), length));
            String[] skd_spc_wqty      =  (JSPUtil.getParameter(request, prefix + "skd_spc_wqty             ".trim(), length));
            String[] skd_spc_nctl_rf   =  (JSPUtil.getParameter(request, prefix + "skd_spc_nctl_rf          ".trim(), length));
            String[] skd_spc_nctl_wt   =  (JSPUtil.getParameter(request, prefix + "skd_spc_nctl_wt          ".trim(), length));
            String[] skd_cntr_ind      =  (JSPUtil.getParameter(request, prefix + "skd_cntr_ind             ".trim(), length));
            String[] skd_pseudo_vvd    =  (JSPUtil.getParameter(request, prefix + "skd_pseudo_vvd           ".trim(), length));
            String[] skd_comp_ind      =  (JSPUtil.getParameter(request, prefix + "skd_comp_ind             ".trim(), length));
            String[] skd_crt_per       =  (JSPUtil.getParameter(request, prefix + "skd_crt_per              ".trim(), length));
            String[] skd_used_ind      =  (JSPUtil.getParameter(request, prefix + "skd_used_ind             ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, prefix + "nis_event_dt             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL_SKD();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setVsl_cd                     ( vsl_cd               [i]);
                model.setSkd_voyage_no              ( skd_voyage_no        [i]);
                model.setSkd_dir_cd                 ( skd_dir_cd           [i]);
                model.setSln_lane_cd                ( sln_lane_cd          [i]);
                model.setSkd_skd_stat               ( skd_skd_stat         [i]);
                model.setSkd_crt_dt                 ( skd_crt_dt           [i]);
                model.setSkd_udt_ind                ( skd_udt_ind          [i]);
                model.setSkd_udt_per                ( skd_udt_per          [i]);
                model.setSkd_udt_dt                 ( skd_udt_dt           [i]);
                model.setSkd_next_loc_cd            ( skd_next_loc_cd      [i]);
                model.setSkd_next_dir_cd            ( skd_next_dir_cd      [i]);
                model.setSkd_next_call_ind          ( skd_next_call_ind    [i]);
                model.setSkd_crt_ind                ( skd_crt_ind          [i]);
                model.setSkd_remark                 ( skd_remark           [i]);
                model.setSkd_voy_tp                 ( skd_voy_tp           [i]);
                model.setSkd_load_qty               ( skd_load_qty         [i]);
                model.setSkd_rev_port               ( skd_rev_port         [i]);
                model.setSkd_rev_dt                 ( skd_rev_dt           [i]);
                model.setSkd_pt_chk                 ( skd_pt_chk           [i]);
                model.setSkd_vvd_comn_div           ( skd_vvd_comn_div     [i]);
                model.setSkd_vvd_comn_cd            ( skd_vvd_comn_cd      [i]);
                model.setSkd_car_cd                 ( skd_car_cd           [i]);
                model.setSkd_spc_qty                ( skd_spc_qty          [i]);
                model.setSkd_canal_cd               ( skd_canal_cd         [i]);
                model.setSkd_sail_tot               ( skd_sail_tot         [i]);
                model.setSkd_sail_day               ( skd_sail_day         [i]);
                model.setSkd_start_dt               ( skd_start_dt         [i]);
                model.setSkd_fdr_ind                ( skd_fdr_ind          [i]);
                model.setSkd_spc_nctl               ( skd_spc_nctl         [i]);
                model.setSkd_pln_port               ( skd_pln_port         [i]);
                model.setSkd_pln_mon                ( skd_pln_mon          [i]);
                model.setSkd_start_port             ( skd_start_port       [i]);
                model.setSkd_off_bnd                ( skd_off_bnd          [i]);
                model.setSkd_ar_dt                  ( skd_ar_dt            [i]);
                model.setSkd_vsl_mon                ( skd_vsl_mon          [i]);
                model.setSkd_tml_vvd                ( skd_tml_vvd          [i]);
                model.setSkd_spc_rqty               ( skd_spc_rqty         [i]);
                model.setSkd_spc_wqty               ( skd_spc_wqty         [i]);
                model.setSkd_spc_nctl_rf            ( skd_spc_nctl_rf      [i]);
                model.setSkd_spc_nctl_wt            ( skd_spc_nctl_wt      [i]);
                model.setSkd_cntr_ind               ( skd_cntr_ind         [i]);
                model.setSkd_pseudo_vvd             ( skd_pseudo_vvd       [i]);
                model.setSkd_comp_ind               ( skd_comp_ind         [i]);
                model.setSkd_crt_per                ( skd_crt_per          [i]);
                model.setSkd_used_ind               ( skd_used_ind         [i]);
                model.setNis_event_dt               ( nis_event_dt         [i]);
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
