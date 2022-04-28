/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSL_PORT_SKD.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
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
 */public final class VSL_PORT_SKD implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            vsl_cd            = "";
    private String            skd_voyage_no     = "";
    private String            skd_dir_cd        = "";
    private String            vps_loc_cd        = "";
    private String            vps_call_ind      = "";
    private String            vps_call_seq      = "";
    private String            vps_eta_dt        = "";
    private String            vps_etb_dt        = "";
    private String            vps_etd_dt        = "";
    private String            vps_cct_dt        = "";
    private String            vps_bct_dt        = "";
    private String            vps_skd_stat      = "";
    private String            vps_chang_ind     = "";
    private String            vps_next_loc_cd   = "";
    private String            vps_next_dir_cd   = "";
    private String            vps_next_call_ind = "";
    private String            vps_turn_ind      = "";
    private String            vps_turn_voyage   = "";
    private String            vps_turn_dir_cd   = "";
    private String            vps_turn_call_ind = "";
    private String            vps_bl_vd         = "";
    private String            vps_car_dir       = "";
    private String            vps_car_voy       = "";
    private String            vps_tml_nm        = "";
    private String            vps_rev_mk        = "";
    private String            vps_chg_loc_cd    = "";
    private String            vps_chg_call_ind  = "";
    private String            vps_udt_dt        = "";
    private String            vps_udt_id        = "";
    private String            vps_remark        = "";
    private String            vps_phaio_rsn     = "";
    private String            vps_phaio_rmk     = "";
    private String            vps_dock_in_dt    = "";
    private String            vps_dock_out_dt   = "";
    private String            vps_dock_nm       = "";
    private String            vps_dock_type     = "";
    private String            vps_dock_rmk      = "";
    private String            vps_next_lane_cd  = "";
    private String            vps_ex_rt         = "";
    private String            vps_ata_dt        = "";
    private String            vps_atb_dt        = "";
    private String            vps_atd_dt        = "";
    private String            vps_lane_cd       = "";
    private String            vps_bdr_ind       = "";
    private String            vps_cbf_ind       = "";
    private String            vps_hancos_vsl    = "";
    private String            vps_cgo_vol       = "";
    private String            vps_pire          = "";
    private String            vps_fin_dir       = "";
    private String            vps_cntr_ind      = "";
    private String            vps_act_dt        = "";
    private String            vps_tml_vsl       = "";
    private String            vps_tml_seq       = "";
    private String            vps_app_ind       = "";
    private String            vps_used_ind      = "";
    private String            nis_event_dt      = "";
    private String            vps_ib_vol        = "";
    private String            vps_ob_vol        = "";
    private String            vps_ts_vol        = "";
    private String            vps_tmnl_voy      = "";
    private String            vps_etl_dt        = "";
    private String            vps_tmnl_cd       = "";
    private String            vps_tmnl_cfm      = "";
    private String            vps_leta_dt       = "";
    private String            vps_letb_dt       = "";
    private String            vps_letd_dt       = "";
    private String            vps_ship_call_no  = "";
    private String            vps_pier          = "";
    private String            yd_cd             = "";
    private String            vsp_ship_call_id  = "";
    private String            vsp_ship_call_dt  = "";
    private String            tmnl_vsl_cd       = "";
    private String            free_tm_dt        = "";
    private String            vps_edi_cnt       = "";

    public VSL_PORT_SKD(){}

    public VSL_PORT_SKD(
            String            ibflag           ,
            String            page_rows        ,
            String            vsl_cd           ,
            String            skd_voyage_no    ,
            String            skd_dir_cd       ,
            String            vps_loc_cd       ,
            String            vps_call_ind     ,
            String            vps_call_seq     ,
            String            vps_eta_dt       ,
            String            vps_etb_dt       ,
            String            vps_etd_dt       ,
            String            vps_cct_dt       ,
            String            vps_bct_dt       ,
            String            vps_skd_stat     ,
            String            vps_chang_ind    ,
            String            vps_next_loc_cd  ,
            String            vps_next_dir_cd  ,
            String            vps_next_call_ind,
            String            vps_turn_ind     ,
            String            vps_turn_voyage  ,
            String            vps_turn_dir_cd  ,
            String            vps_turn_call_ind,
            String            vps_bl_vd        ,
            String            vps_car_dir      ,
            String            vps_car_voy      ,
            String            vps_tml_nm       ,
            String            vps_rev_mk       ,
            String            vps_chg_loc_cd   ,
            String            vps_chg_call_ind ,
            String            vps_udt_dt       ,
            String            vps_udt_id       ,
            String            vps_remark       ,
            String            vps_phaio_rsn    ,
            String            vps_phaio_rmk    ,
            String            vps_dock_in_dt   ,
            String            vps_dock_out_dt  ,
            String            vps_dock_nm      ,
            String            vps_dock_type    ,
            String            vps_dock_rmk     ,
            String            vps_next_lane_cd ,
            String            vps_ex_rt        ,
            String            vps_ata_dt       ,
            String            vps_atb_dt       ,
            String            vps_atd_dt       ,
            String            vps_lane_cd      ,
            String            vps_bdr_ind      ,
            String            vps_cbf_ind      ,
            String            vps_hancos_vsl   ,
            String            vps_cgo_vol      ,
            String            vps_pire         ,
            String            vps_fin_dir      ,
            String            vps_cntr_ind     ,
            String            vps_act_dt       ,
            String            vps_tml_vsl      ,
            String            vps_tml_seq      ,
            String            vps_app_ind      ,
            String            vps_used_ind     ,
            String            nis_event_dt     ,
            String            vps_ib_vol       ,
            String            vps_ob_vol       ,
            String            vps_ts_vol       ,
            String            vps_tmnl_voy     ,
            String            vps_etl_dt       ,
            String            vps_tmnl_cd      ,
            String            vps_tmnl_cfm     ,
            String            vps_leta_dt      ,
            String            vps_letb_dt      ,
            String            vps_letd_dt      ,
            String            vps_ship_call_no ,
            String            vps_pier         ,
            String            yd_cd            ,
            String            vsp_ship_call_id ,
            String            vsp_ship_call_dt ,
            String            tmnl_vsl_cd      ,
            String            free_tm_dt       ,
            String            vps_edi_cnt      ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.vsl_cd            = vsl_cd           ;
        this.skd_voyage_no     = skd_voyage_no    ;
        this.skd_dir_cd        = skd_dir_cd       ;
        this.vps_loc_cd        = vps_loc_cd       ;
        this.vps_call_ind      = vps_call_ind     ;
        this.vps_call_seq      = vps_call_seq     ;
        this.vps_eta_dt        = vps_eta_dt       ;
        this.vps_etb_dt        = vps_etb_dt       ;
        this.vps_etd_dt        = vps_etd_dt       ;
        this.vps_cct_dt        = vps_cct_dt       ;
        this.vps_bct_dt        = vps_bct_dt       ;
        this.vps_skd_stat      = vps_skd_stat     ;
        this.vps_chang_ind     = vps_chang_ind    ;
        this.vps_next_loc_cd   = vps_next_loc_cd  ;
        this.vps_next_dir_cd   = vps_next_dir_cd  ;
        this.vps_next_call_ind = vps_next_call_ind;
        this.vps_turn_ind      = vps_turn_ind     ;
        this.vps_turn_voyage   = vps_turn_voyage  ;
        this.vps_turn_dir_cd   = vps_turn_dir_cd  ;
        this.vps_turn_call_ind = vps_turn_call_ind;
        this.vps_bl_vd         = vps_bl_vd        ;
        this.vps_car_dir       = vps_car_dir      ;
        this.vps_car_voy       = vps_car_voy      ;
        this.vps_tml_nm        = vps_tml_nm       ;
        this.vps_rev_mk        = vps_rev_mk       ;
        this.vps_chg_loc_cd    = vps_chg_loc_cd   ;
        this.vps_chg_call_ind  = vps_chg_call_ind ;
        this.vps_udt_dt        = vps_udt_dt       ;
        this.vps_udt_id        = vps_udt_id       ;
        this.vps_remark        = vps_remark       ;
        this.vps_phaio_rsn     = vps_phaio_rsn    ;
        this.vps_phaio_rmk     = vps_phaio_rmk    ;
        this.vps_dock_in_dt    = vps_dock_in_dt   ;
        this.vps_dock_out_dt   = vps_dock_out_dt  ;
        this.vps_dock_nm       = vps_dock_nm      ;
        this.vps_dock_type     = vps_dock_type    ;
        this.vps_dock_rmk      = vps_dock_rmk     ;
        this.vps_next_lane_cd  = vps_next_lane_cd ;
        this.vps_ex_rt         = vps_ex_rt        ;
        this.vps_ata_dt        = vps_ata_dt       ;
        this.vps_atb_dt        = vps_atb_dt       ;
        this.vps_atd_dt        = vps_atd_dt       ;
        this.vps_lane_cd       = vps_lane_cd      ;
        this.vps_bdr_ind       = vps_bdr_ind      ;
        this.vps_cbf_ind       = vps_cbf_ind      ;
        this.vps_hancos_vsl    = vps_hancos_vsl   ;
        this.vps_cgo_vol       = vps_cgo_vol      ;
        this.vps_pire          = vps_pire         ;
        this.vps_fin_dir       = vps_fin_dir      ;
        this.vps_cntr_ind      = vps_cntr_ind     ;
        this.vps_act_dt        = vps_act_dt       ;
        this.vps_tml_vsl       = vps_tml_vsl      ;
        this.vps_tml_seq       = vps_tml_seq      ;
        this.vps_app_ind       = vps_app_ind      ;
        this.vps_used_ind      = vps_used_ind     ;
        this.nis_event_dt      = nis_event_dt     ;
        this.vps_ib_vol        = vps_ib_vol       ;
        this.vps_ob_vol        = vps_ob_vol       ;
        this.vps_ts_vol        = vps_ts_vol       ;
        this.vps_tmnl_voy      = vps_tmnl_voy     ;
        this.vps_etl_dt        = vps_etl_dt       ;
        this.vps_tmnl_cd       = vps_tmnl_cd      ;
        this.vps_tmnl_cfm      = vps_tmnl_cfm     ;
        this.vps_leta_dt       = vps_leta_dt      ;
        this.vps_letb_dt       = vps_letb_dt      ;
        this.vps_letd_dt       = vps_letd_dt      ;
        this.vps_ship_call_no  = vps_ship_call_no ;
        this.vps_pier          = vps_pier         ;
        this.yd_cd             = yd_cd            ;
        this.vsp_ship_call_id  = vsp_ship_call_id ;
        this.vsp_ship_call_dt  = vsp_ship_call_dt ;
        this.tmnl_vsl_cd       = tmnl_vsl_cd      ;
        this.free_tm_dt        = free_tm_dt       ;
        this.vps_edi_cnt       = vps_edi_cnt      ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getVsl_cd           (){    return vsl_cd               ;    }
    public String            getSkd_voyage_no    (){    return skd_voyage_no        ;    }
    public String            getSkd_dir_cd       (){    return skd_dir_cd           ;    }
    public String            getVps_loc_cd       (){    return vps_loc_cd           ;    }
    public String            getVps_call_ind     (){    return vps_call_ind         ;    }
    public String            getVps_call_seq     (){    return vps_call_seq         ;    }
    public String            getVps_eta_dt       (){    return vps_eta_dt           ;    }
    public String            getVps_etb_dt       (){    return vps_etb_dt           ;    }
    public String            getVps_etd_dt       (){    return vps_etd_dt           ;    }
    public String            getVps_cct_dt       (){    return vps_cct_dt           ;    }
    public String            getVps_bct_dt       (){    return vps_bct_dt           ;    }
    public String            getVps_skd_stat     (){    return vps_skd_stat         ;    }
    public String            getVps_chang_ind    (){    return vps_chang_ind        ;    }
    public String            getVps_next_loc_cd  (){    return vps_next_loc_cd      ;    }
    public String            getVps_next_dir_cd  (){    return vps_next_dir_cd      ;    }
    public String            getVps_next_call_ind(){    return vps_next_call_ind    ;    }
    public String            getVps_turn_ind     (){    return vps_turn_ind         ;    }
    public String            getVps_turn_voyage  (){    return vps_turn_voyage      ;    }
    public String            getVps_turn_dir_cd  (){    return vps_turn_dir_cd      ;    }
    public String            getVps_turn_call_ind(){    return vps_turn_call_ind    ;    }
    public String            getVps_bl_vd        (){    return vps_bl_vd            ;    }
    public String            getVps_car_dir      (){    return vps_car_dir          ;    }
    public String            getVps_car_voy      (){    return vps_car_voy          ;    }
    public String            getVps_tml_nm       (){    return vps_tml_nm           ;    }
    public String            getVps_rev_mk       (){    return vps_rev_mk           ;    }
    public String            getVps_chg_loc_cd   (){    return vps_chg_loc_cd       ;    }
    public String            getVps_chg_call_ind (){    return vps_chg_call_ind     ;    }
    public String            getVps_udt_dt       (){    return vps_udt_dt           ;    }
    public String            getVps_udt_id       (){    return vps_udt_id           ;    }
    public String            getVps_remark       (){    return vps_remark           ;    }
    public String            getVps_phaio_rsn    (){    return vps_phaio_rsn        ;    }
    public String            getVps_phaio_rmk    (){    return vps_phaio_rmk        ;    }
    public String            getVps_dock_in_dt   (){    return vps_dock_in_dt       ;    }
    public String            getVps_dock_out_dt  (){    return vps_dock_out_dt      ;    }
    public String            getVps_dock_nm      (){    return vps_dock_nm          ;    }
    public String            getVps_dock_type    (){    return vps_dock_type        ;    }
    public String            getVps_dock_rmk     (){    return vps_dock_rmk         ;    }
    public String            getVps_next_lane_cd (){    return vps_next_lane_cd     ;    }
    public String            getVps_ex_rt        (){    return vps_ex_rt            ;    }
    public String            getVps_ata_dt       (){    return vps_ata_dt           ;    }
    public String            getVps_atb_dt       (){    return vps_atb_dt           ;    }
    public String            getVps_atd_dt       (){    return vps_atd_dt           ;    }
    public String            getVps_lane_cd      (){    return vps_lane_cd          ;    }
    public String            getVps_bdr_ind      (){    return vps_bdr_ind          ;    }
    public String            getVps_cbf_ind      (){    return vps_cbf_ind          ;    }
    public String            getVps_hancos_vsl   (){    return vps_hancos_vsl       ;    }
    public String            getVps_cgo_vol      (){    return vps_cgo_vol          ;    }
    public String            getVps_pire         (){    return vps_pire             ;    }
    public String            getVps_fin_dir      (){    return vps_fin_dir          ;    }
    public String            getVps_cntr_ind     (){    return vps_cntr_ind         ;    }
    public String            getVps_act_dt       (){    return vps_act_dt           ;    }
    public String            getVps_tml_vsl      (){    return vps_tml_vsl          ;    }
    public String            getVps_tml_seq      (){    return vps_tml_seq          ;    }
    public String            getVps_app_ind      (){    return vps_app_ind          ;    }
    public String            getVps_used_ind     (){    return vps_used_ind         ;    }
    public String            getNis_event_dt     (){    return nis_event_dt         ;    }
    public String            getVps_ib_vol       (){    return vps_ib_vol           ;    }
    public String            getVps_ob_vol       (){    return vps_ob_vol           ;    }
    public String            getVps_ts_vol       (){    return vps_ts_vol           ;    }
    public String            getVps_tmnl_voy     (){    return vps_tmnl_voy         ;    }
    public String            getVps_etl_dt       (){    return vps_etl_dt           ;    }
    public String            getVps_tmnl_cd      (){    return vps_tmnl_cd          ;    }
    public String            getVps_tmnl_cfm     (){    return vps_tmnl_cfm         ;    }
    public String            getVps_leta_dt      (){    return vps_leta_dt          ;    }
    public String            getVps_letb_dt      (){    return vps_letb_dt          ;    }
    public String            getVps_letd_dt      (){    return vps_letd_dt          ;    }
    public String            getVps_ship_call_no (){    return vps_ship_call_no     ;    }
    public String            getVps_pier         (){    return vps_pier             ;    }
    public String            getYd_cd            (){    return yd_cd                ;    }
    public String            getVsp_ship_call_id (){    return vsp_ship_call_id     ;    }
    public String            getVsp_ship_call_dt (){    return vsp_ship_call_dt     ;    }
    public String            getTmnl_vsl_cd      (){    return tmnl_vsl_cd          ;    }
    public String            getFree_tm_dt       (){    return free_tm_dt           ;    }
    public String            getVps_edi_cnt      (){    return vps_edi_cnt          ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setVsl_cd           ( String            vsl_cd            ){    this.vsl_cd            = vsl_cd               ;    }
    public void setSkd_voyage_no    ( String            skd_voyage_no     ){    this.skd_voyage_no     = skd_voyage_no        ;    }
    public void setSkd_dir_cd       ( String            skd_dir_cd        ){    this.skd_dir_cd        = skd_dir_cd           ;    }
    public void setVps_loc_cd       ( String            vps_loc_cd        ){    this.vps_loc_cd        = vps_loc_cd           ;    }
    public void setVps_call_ind     ( String            vps_call_ind      ){    this.vps_call_ind      = vps_call_ind         ;    }
    public void setVps_call_seq     ( String            vps_call_seq      ){    this.vps_call_seq      = vps_call_seq         ;    }
    public void setVps_eta_dt       ( String            vps_eta_dt        ){    this.vps_eta_dt        = vps_eta_dt           ;    }
    public void setVps_etb_dt       ( String            vps_etb_dt        ){    this.vps_etb_dt        = vps_etb_dt           ;    }
    public void setVps_etd_dt       ( String            vps_etd_dt        ){    this.vps_etd_dt        = vps_etd_dt           ;    }
    public void setVps_cct_dt       ( String            vps_cct_dt        ){    this.vps_cct_dt        = vps_cct_dt           ;    }
    public void setVps_bct_dt       ( String            vps_bct_dt        ){    this.vps_bct_dt        = vps_bct_dt           ;    }
    public void setVps_skd_stat     ( String            vps_skd_stat      ){    this.vps_skd_stat      = vps_skd_stat         ;    }
    public void setVps_chang_ind    ( String            vps_chang_ind     ){    this.vps_chang_ind     = vps_chang_ind        ;    }
    public void setVps_next_loc_cd  ( String            vps_next_loc_cd   ){    this.vps_next_loc_cd   = vps_next_loc_cd      ;    }
    public void setVps_next_dir_cd  ( String            vps_next_dir_cd   ){    this.vps_next_dir_cd   = vps_next_dir_cd      ;    }
    public void setVps_next_call_ind( String            vps_next_call_ind ){    this.vps_next_call_ind = vps_next_call_ind    ;    }
    public void setVps_turn_ind     ( String            vps_turn_ind      ){    this.vps_turn_ind      = vps_turn_ind         ;    }
    public void setVps_turn_voyage  ( String            vps_turn_voyage   ){    this.vps_turn_voyage   = vps_turn_voyage      ;    }
    public void setVps_turn_dir_cd  ( String            vps_turn_dir_cd   ){    this.vps_turn_dir_cd   = vps_turn_dir_cd      ;    }
    public void setVps_turn_call_ind( String            vps_turn_call_ind ){    this.vps_turn_call_ind = vps_turn_call_ind    ;    }
    public void setVps_bl_vd        ( String            vps_bl_vd         ){    this.vps_bl_vd         = vps_bl_vd            ;    }
    public void setVps_car_dir      ( String            vps_car_dir       ){    this.vps_car_dir       = vps_car_dir          ;    }
    public void setVps_car_voy      ( String            vps_car_voy       ){    this.vps_car_voy       = vps_car_voy          ;    }
    public void setVps_tml_nm       ( String            vps_tml_nm        ){    this.vps_tml_nm        = vps_tml_nm           ;    }
    public void setVps_rev_mk       ( String            vps_rev_mk        ){    this.vps_rev_mk        = vps_rev_mk           ;    }
    public void setVps_chg_loc_cd   ( String            vps_chg_loc_cd    ){    this.vps_chg_loc_cd    = vps_chg_loc_cd       ;    }
    public void setVps_chg_call_ind ( String            vps_chg_call_ind  ){    this.vps_chg_call_ind  = vps_chg_call_ind     ;    }
    public void setVps_udt_dt       ( String            vps_udt_dt        ){    this.vps_udt_dt        = vps_udt_dt           ;    }
    public void setVps_udt_id       ( String            vps_udt_id        ){    this.vps_udt_id        = vps_udt_id           ;    }
    public void setVps_remark       ( String            vps_remark        ){    this.vps_remark        = vps_remark           ;    }
    public void setVps_phaio_rsn    ( String            vps_phaio_rsn     ){    this.vps_phaio_rsn     = vps_phaio_rsn        ;    }
    public void setVps_phaio_rmk    ( String            vps_phaio_rmk     ){    this.vps_phaio_rmk     = vps_phaio_rmk        ;    }
    public void setVps_dock_in_dt   ( String            vps_dock_in_dt    ){    this.vps_dock_in_dt    = vps_dock_in_dt       ;    }
    public void setVps_dock_out_dt  ( String            vps_dock_out_dt   ){    this.vps_dock_out_dt   = vps_dock_out_dt      ;    }
    public void setVps_dock_nm      ( String            vps_dock_nm       ){    this.vps_dock_nm       = vps_dock_nm          ;    }
    public void setVps_dock_type    ( String            vps_dock_type     ){    this.vps_dock_type     = vps_dock_type        ;    }
    public void setVps_dock_rmk     ( String            vps_dock_rmk      ){    this.vps_dock_rmk      = vps_dock_rmk         ;    }
    public void setVps_next_lane_cd ( String            vps_next_lane_cd  ){    this.vps_next_lane_cd  = vps_next_lane_cd     ;    }
    public void setVps_ex_rt        ( String            vps_ex_rt         ){    this.vps_ex_rt         = vps_ex_rt            ;    }
    public void setVps_ata_dt       ( String            vps_ata_dt        ){    this.vps_ata_dt        = vps_ata_dt           ;    }
    public void setVps_atb_dt       ( String            vps_atb_dt        ){    this.vps_atb_dt        = vps_atb_dt           ;    }
    public void setVps_atd_dt       ( String            vps_atd_dt        ){    this.vps_atd_dt        = vps_atd_dt           ;    }
    public void setVps_lane_cd      ( String            vps_lane_cd       ){    this.vps_lane_cd       = vps_lane_cd          ;    }
    public void setVps_bdr_ind      ( String            vps_bdr_ind       ){    this.vps_bdr_ind       = vps_bdr_ind          ;    }
    public void setVps_cbf_ind      ( String            vps_cbf_ind       ){    this.vps_cbf_ind       = vps_cbf_ind          ;    }
    public void setVps_hancos_vsl   ( String            vps_hancos_vsl    ){    this.vps_hancos_vsl    = vps_hancos_vsl       ;    }
    public void setVps_cgo_vol      ( String            vps_cgo_vol       ){    this.vps_cgo_vol       = vps_cgo_vol          ;    }
    public void setVps_pire         ( String            vps_pire          ){    this.vps_pire          = vps_pire             ;    }
    public void setVps_fin_dir      ( String            vps_fin_dir       ){    this.vps_fin_dir       = vps_fin_dir          ;    }
    public void setVps_cntr_ind     ( String            vps_cntr_ind      ){    this.vps_cntr_ind      = vps_cntr_ind         ;    }
    public void setVps_act_dt       ( String            vps_act_dt        ){    this.vps_act_dt        = vps_act_dt           ;    }
    public void setVps_tml_vsl      ( String            vps_tml_vsl       ){    this.vps_tml_vsl       = vps_tml_vsl          ;    }
    public void setVps_tml_seq      ( String            vps_tml_seq       ){    this.vps_tml_seq       = vps_tml_seq          ;    }
    public void setVps_app_ind      ( String            vps_app_ind       ){    this.vps_app_ind       = vps_app_ind          ;    }
    public void setVps_used_ind     ( String            vps_used_ind      ){    this.vps_used_ind      = vps_used_ind         ;    }
    public void setNis_event_dt     ( String            nis_event_dt      ){    this.nis_event_dt      = nis_event_dt         ;    }
    public void setVps_ib_vol       ( String            vps_ib_vol        ){    this.vps_ib_vol        = vps_ib_vol           ;    }
    public void setVps_ob_vol       ( String            vps_ob_vol        ){    this.vps_ob_vol        = vps_ob_vol           ;    }
    public void setVps_ts_vol       ( String            vps_ts_vol        ){    this.vps_ts_vol        = vps_ts_vol           ;    }
    public void setVps_tmnl_voy     ( String            vps_tmnl_voy      ){    this.vps_tmnl_voy      = vps_tmnl_voy         ;    }
    public void setVps_etl_dt       ( String            vps_etl_dt        ){    this.vps_etl_dt        = vps_etl_dt           ;    }
    public void setVps_tmnl_cd      ( String            vps_tmnl_cd       ){    this.vps_tmnl_cd       = vps_tmnl_cd          ;    }
    public void setVps_tmnl_cfm     ( String            vps_tmnl_cfm      ){    this.vps_tmnl_cfm      = vps_tmnl_cfm         ;    }
    public void setVps_leta_dt      ( String            vps_leta_dt       ){    this.vps_leta_dt       = vps_leta_dt          ;    }
    public void setVps_letb_dt      ( String            vps_letb_dt       ){    this.vps_letb_dt       = vps_letb_dt          ;    }
    public void setVps_letd_dt      ( String            vps_letd_dt       ){    this.vps_letd_dt       = vps_letd_dt          ;    }
    public void setVps_ship_call_no ( String            vps_ship_call_no  ){    this.vps_ship_call_no  = vps_ship_call_no     ;    }
    public void setVps_pier         ( String            vps_pier          ){    this.vps_pier          = vps_pier             ;    }
    public void setYd_cd            ( String            yd_cd             ){    this.yd_cd             = yd_cd                ;    }
    public void setVsp_ship_call_id ( String            vsp_ship_call_id  ){    this.vsp_ship_call_id  = vsp_ship_call_id     ;    }
    public void setVsp_ship_call_dt ( String            vsp_ship_call_dt  ){    this.vsp_ship_call_dt  = vsp_ship_call_dt     ;    }
    public void setTmnl_vsl_cd      ( String            tmnl_vsl_cd       ){    this.tmnl_vsl_cd       = tmnl_vsl_cd          ;    }
    public void setFree_tm_dt       ( String            free_tm_dt        ){    this.free_tm_dt        = free_tm_dt           ;    }
    public void setVps_edi_cnt      ( String            vps_edi_cnt       ){    this.vps_edi_cnt       = vps_edi_cnt          ;    }

    public static VSL_PORT_SKD fromRequest(HttpServletRequest request) {
        VSL_PORT_SKD model = new VSL_PORT_SKD();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setVsl_cd               (JSPUtil.getParameter(request, "vsl_cd                   ".trim(), ""));
            model.setSkd_voyage_no        (JSPUtil.getParameter(request, "skd_voyage_no            ".trim(), ""));
            model.setSkd_dir_cd           (JSPUtil.getParameter(request, "skd_dir_cd               ".trim(), ""));
            model.setVps_loc_cd           (JSPUtil.getParameter(request, "vps_loc_cd               ".trim(), ""));
            model.setVps_call_ind         (JSPUtil.getParameter(request, "vps_call_ind             ".trim(), ""));
            model.setVps_call_seq         (JSPUtil.getParameter(request, "vps_call_seq             ".trim(), ""));
            model.setVps_eta_dt           (JSPUtil.getParameter(request, "vps_eta_dt               ".trim(), ""));
            model.setVps_etb_dt           (JSPUtil.getParameter(request, "vps_etb_dt               ".trim(), ""));
            model.setVps_etd_dt           (JSPUtil.getParameter(request, "vps_etd_dt               ".trim(), ""));
            model.setVps_cct_dt           (JSPUtil.getParameter(request, "vps_cct_dt               ".trim(), ""));
            model.setVps_bct_dt           (JSPUtil.getParameter(request, "vps_bct_dt               ".trim(), ""));
            model.setVps_skd_stat         (JSPUtil.getParameter(request, "vps_skd_stat             ".trim(), ""));
            model.setVps_chang_ind        (JSPUtil.getParameter(request, "vps_chang_ind            ".trim(), ""));
            model.setVps_next_loc_cd      (JSPUtil.getParameter(request, "vps_next_loc_cd          ".trim(), ""));
            model.setVps_next_dir_cd      (JSPUtil.getParameter(request, "vps_next_dir_cd          ".trim(), ""));
            model.setVps_next_call_ind    (JSPUtil.getParameter(request, "vps_next_call_ind        ".trim(), ""));
            model.setVps_turn_ind         (JSPUtil.getParameter(request, "vps_turn_ind             ".trim(), ""));
            model.setVps_turn_voyage      (JSPUtil.getParameter(request, "vps_turn_voyage          ".trim(), ""));
            model.setVps_turn_dir_cd      (JSPUtil.getParameter(request, "vps_turn_dir_cd          ".trim(), ""));
            model.setVps_turn_call_ind    (JSPUtil.getParameter(request, "vps_turn_call_ind        ".trim(), ""));
            model.setVps_bl_vd            (JSPUtil.getParameter(request, "vps_bl_vd                ".trim(), ""));
            model.setVps_car_dir          (JSPUtil.getParameter(request, "vps_car_dir              ".trim(), ""));
            model.setVps_car_voy          (JSPUtil.getParameter(request, "vps_car_voy              ".trim(), ""));
            model.setVps_tml_nm           (JSPUtil.getParameter(request, "vps_tml_nm               ".trim(), ""));
            model.setVps_rev_mk           (JSPUtil.getParameter(request, "vps_rev_mk               ".trim(), ""));
            model.setVps_chg_loc_cd       (JSPUtil.getParameter(request, "vps_chg_loc_cd           ".trim(), ""));
            model.setVps_chg_call_ind     (JSPUtil.getParameter(request, "vps_chg_call_ind         ".trim(), ""));
            model.setVps_udt_dt           (JSPUtil.getParameter(request, "vps_udt_dt               ".trim(), ""));
            model.setVps_udt_id           (JSPUtil.getParameter(request, "vps_udt_id               ".trim(), ""));
            model.setVps_remark           (JSPUtil.getParameter(request, "vps_remark               ".trim(), ""));
            model.setVps_phaio_rsn        (JSPUtil.getParameter(request, "vps_phaio_rsn            ".trim(), ""));
            model.setVps_phaio_rmk        (JSPUtil.getParameter(request, "vps_phaio_rmk            ".trim(), ""));
            model.setVps_dock_in_dt       (JSPUtil.getParameter(request, "vps_dock_in_dt           ".trim(), ""));
            model.setVps_dock_out_dt      (JSPUtil.getParameter(request, "vps_dock_out_dt          ".trim(), ""));
            model.setVps_dock_nm          (JSPUtil.getParameter(request, "vps_dock_nm              ".trim(), ""));
            model.setVps_dock_type        (JSPUtil.getParameter(request, "vps_dock_type            ".trim(), ""));
            model.setVps_dock_rmk         (JSPUtil.getParameter(request, "vps_dock_rmk             ".trim(), ""));
            model.setVps_next_lane_cd     (JSPUtil.getParameter(request, "vps_next_lane_cd         ".trim(), ""));
            model.setVps_ex_rt            (JSPUtil.getParameter(request, "vps_ex_rt                ".trim(), ""));
            model.setVps_ata_dt           (JSPUtil.getParameter(request, "vps_ata_dt               ".trim(), ""));
            model.setVps_atb_dt           (JSPUtil.getParameter(request, "vps_atb_dt               ".trim(), ""));
            model.setVps_atd_dt           (JSPUtil.getParameter(request, "vps_atd_dt               ".trim(), ""));
            model.setVps_lane_cd          (JSPUtil.getParameter(request, "vps_lane_cd              ".trim(), ""));
            model.setVps_bdr_ind          (JSPUtil.getParameter(request, "vps_bdr_ind              ".trim(), ""));
            model.setVps_cbf_ind          (JSPUtil.getParameter(request, "vps_cbf_ind              ".trim(), ""));
            model.setVps_hancos_vsl       (JSPUtil.getParameter(request, "vps_hancos_vsl           ".trim(), ""));
            model.setVps_cgo_vol          (JSPUtil.getParameter(request, "vps_cgo_vol              ".trim(), ""));
            model.setVps_pire             (JSPUtil.getParameter(request, "vps_pire                 ".trim(), ""));
            model.setVps_fin_dir          (JSPUtil.getParameter(request, "vps_fin_dir              ".trim(), ""));
            model.setVps_cntr_ind         (JSPUtil.getParameter(request, "vps_cntr_ind             ".trim(), ""));
            model.setVps_act_dt           (JSPUtil.getParameter(request, "vps_act_dt               ".trim(), ""));
            model.setVps_tml_vsl          (JSPUtil.getParameter(request, "vps_tml_vsl              ".trim(), ""));
            model.setVps_tml_seq          (JSPUtil.getParameter(request, "vps_tml_seq              ".trim(), ""));
            model.setVps_app_ind          (JSPUtil.getParameter(request, "vps_app_ind              ".trim(), ""));
            model.setVps_used_ind         (JSPUtil.getParameter(request, "vps_used_ind             ".trim(), ""));
            model.setNis_event_dt         (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), ""));
            model.setVps_ib_vol           (JSPUtil.getParameter(request, "vps_ib_vol               ".trim(), ""));
            model.setVps_ob_vol           (JSPUtil.getParameter(request, "vps_ob_vol               ".trim(), ""));
            model.setVps_ts_vol           (JSPUtil.getParameter(request, "vps_ts_vol               ".trim(), ""));
            model.setVps_tmnl_voy         (JSPUtil.getParameter(request, "vps_tmnl_voy             ".trim(), ""));
            model.setVps_etl_dt           (JSPUtil.getParameter(request, "vps_etl_dt               ".trim(), ""));
            model.setVps_tmnl_cd          (JSPUtil.getParameter(request, "vps_tmnl_cd              ".trim(), ""));
            model.setVps_tmnl_cfm         (JSPUtil.getParameter(request, "vps_tmnl_cfm             ".trim(), ""));
            model.setVps_leta_dt          (JSPUtil.getParameter(request, "vps_leta_dt              ".trim(), ""));
            model.setVps_letb_dt          (JSPUtil.getParameter(request, "vps_letb_dt              ".trim(), ""));
            model.setVps_letd_dt          (JSPUtil.getParameter(request, "vps_letd_dt              ".trim(), ""));
            model.setVps_ship_call_no     (JSPUtil.getParameter(request, "vps_ship_call_no         ".trim(), ""));
            model.setVps_pier             (JSPUtil.getParameter(request, "vps_pier                 ".trim(), ""));
            model.setYd_cd                (JSPUtil.getParameter(request, "yd_cd                    ".trim(), ""));
            model.setVsp_ship_call_id     (JSPUtil.getParameter(request, "vsp_ship_call_id         ".trim(), ""));
            model.setVsp_ship_call_dt     (JSPUtil.getParameter(request, "vsp_ship_call_dt         ".trim(), ""));
            model.setTmnl_vsl_cd          (JSPUtil.getParameter(request, "tmnl_vsl_cd              ".trim(), ""));
            model.setFree_tm_dt           (JSPUtil.getParameter(request, "free_tm_dt               ".trim(), ""));
            model.setVps_edi_cnt          (JSPUtil.getParameter(request, "vps_edi_cnt              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        VSL_PORT_SKD model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] vsl_cd            =  (JSPUtil.getParameter(request, "vsl_cd                   ".trim(), length));
            String[] skd_voyage_no     =  (JSPUtil.getParameter(request, "skd_voyage_no            ".trim(), length));
            String[] skd_dir_cd        =  (JSPUtil.getParameter(request, "skd_dir_cd               ".trim(), length));
            String[] vps_loc_cd        =  (JSPUtil.getParameter(request, "vps_loc_cd               ".trim(), length));
            String[] vps_call_ind      =  (JSPUtil.getParameter(request, "vps_call_ind             ".trim(), length));
            String[] vps_call_seq      =  (JSPUtil.getParameter(request, "vps_call_seq             ".trim(), length));
            String[] vps_eta_dt        =  (JSPUtil.getParameter(request, "vps_eta_dt               ".trim(), length));
            String[] vps_etb_dt        =  (JSPUtil.getParameter(request, "vps_etb_dt               ".trim(), length));
            String[] vps_etd_dt        =  (JSPUtil.getParameter(request, "vps_etd_dt               ".trim(), length));
            String[] vps_cct_dt        =  (JSPUtil.getParameter(request, "vps_cct_dt               ".trim(), length));
            String[] vps_bct_dt        =  (JSPUtil.getParameter(request, "vps_bct_dt               ".trim(), length));
            String[] vps_skd_stat      =  (JSPUtil.getParameter(request, "vps_skd_stat             ".trim(), length));
            String[] vps_chang_ind     =  (JSPUtil.getParameter(request, "vps_chang_ind            ".trim(), length));
            String[] vps_next_loc_cd   =  (JSPUtil.getParameter(request, "vps_next_loc_cd          ".trim(), length));
            String[] vps_next_dir_cd   =  (JSPUtil.getParameter(request, "vps_next_dir_cd          ".trim(), length));
            String[] vps_next_call_ind =  (JSPUtil.getParameter(request, "vps_next_call_ind        ".trim(), length));
            String[] vps_turn_ind      =  (JSPUtil.getParameter(request, "vps_turn_ind             ".trim(), length));
            String[] vps_turn_voyage   =  (JSPUtil.getParameter(request, "vps_turn_voyage          ".trim(), length));
            String[] vps_turn_dir_cd   =  (JSPUtil.getParameter(request, "vps_turn_dir_cd          ".trim(), length));
            String[] vps_turn_call_ind =  (JSPUtil.getParameter(request, "vps_turn_call_ind        ".trim(), length));
            String[] vps_bl_vd         =  (JSPUtil.getParameter(request, "vps_bl_vd                ".trim(), length));
            String[] vps_car_dir       =  (JSPUtil.getParameter(request, "vps_car_dir              ".trim(), length));
            String[] vps_car_voy       =  (JSPUtil.getParameter(request, "vps_car_voy              ".trim(), length));
            String[] vps_tml_nm        =  (JSPUtil.getParameter(request, "vps_tml_nm               ".trim(), length));
            String[] vps_rev_mk        =  (JSPUtil.getParameter(request, "vps_rev_mk               ".trim(), length));
            String[] vps_chg_loc_cd    =  (JSPUtil.getParameter(request, "vps_chg_loc_cd           ".trim(), length));
            String[] vps_chg_call_ind  =  (JSPUtil.getParameter(request, "vps_chg_call_ind         ".trim(), length));
            String[] vps_udt_dt        =  (JSPUtil.getParameter(request, "vps_udt_dt               ".trim(), length));
            String[] vps_udt_id        =  (JSPUtil.getParameter(request, "vps_udt_id               ".trim(), length));
            String[] vps_remark        =  (JSPUtil.getParameter(request, "vps_remark               ".trim(), length));
            String[] vps_phaio_rsn     =  (JSPUtil.getParameter(request, "vps_phaio_rsn            ".trim(), length));
            String[] vps_phaio_rmk     =  (JSPUtil.getParameter(request, "vps_phaio_rmk            ".trim(), length));
            String[] vps_dock_in_dt    =  (JSPUtil.getParameter(request, "vps_dock_in_dt           ".trim(), length));
            String[] vps_dock_out_dt   =  (JSPUtil.getParameter(request, "vps_dock_out_dt          ".trim(), length));
            String[] vps_dock_nm       =  (JSPUtil.getParameter(request, "vps_dock_nm              ".trim(), length));
            String[] vps_dock_type     =  (JSPUtil.getParameter(request, "vps_dock_type            ".trim(), length));
            String[] vps_dock_rmk      =  (JSPUtil.getParameter(request, "vps_dock_rmk             ".trim(), length));
            String[] vps_next_lane_cd  =  (JSPUtil.getParameter(request, "vps_next_lane_cd         ".trim(), length));
            String[] vps_ex_rt         =  (JSPUtil.getParameter(request, "vps_ex_rt                ".trim(), length));
            String[] vps_ata_dt        =  (JSPUtil.getParameter(request, "vps_ata_dt               ".trim(), length));
            String[] vps_atb_dt        =  (JSPUtil.getParameter(request, "vps_atb_dt               ".trim(), length));
            String[] vps_atd_dt        =  (JSPUtil.getParameter(request, "vps_atd_dt               ".trim(), length));
            String[] vps_lane_cd       =  (JSPUtil.getParameter(request, "vps_lane_cd              ".trim(), length));
            String[] vps_bdr_ind       =  (JSPUtil.getParameter(request, "vps_bdr_ind              ".trim(), length));
            String[] vps_cbf_ind       =  (JSPUtil.getParameter(request, "vps_cbf_ind              ".trim(), length));
            String[] vps_hancos_vsl    =  (JSPUtil.getParameter(request, "vps_hancos_vsl           ".trim(), length));
            String[] vps_cgo_vol       =  (JSPUtil.getParameter(request, "vps_cgo_vol              ".trim(), length));
            String[] vps_pire          =  (JSPUtil.getParameter(request, "vps_pire                 ".trim(), length));
            String[] vps_fin_dir       =  (JSPUtil.getParameter(request, "vps_fin_dir              ".trim(), length));
            String[] vps_cntr_ind      =  (JSPUtil.getParameter(request, "vps_cntr_ind             ".trim(), length));
            String[] vps_act_dt        =  (JSPUtil.getParameter(request, "vps_act_dt               ".trim(), length));
            String[] vps_tml_vsl       =  (JSPUtil.getParameter(request, "vps_tml_vsl              ".trim(), length));
            String[] vps_tml_seq       =  (JSPUtil.getParameter(request, "vps_tml_seq              ".trim(), length));
            String[] vps_app_ind       =  (JSPUtil.getParameter(request, "vps_app_ind              ".trim(), length));
            String[] vps_used_ind      =  (JSPUtil.getParameter(request, "vps_used_ind             ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), length));
            String[] vps_ib_vol        =  (JSPUtil.getParameter(request, "vps_ib_vol               ".trim(), length));
            String[] vps_ob_vol        =  (JSPUtil.getParameter(request, "vps_ob_vol               ".trim(), length));
            String[] vps_ts_vol        =  (JSPUtil.getParameter(request, "vps_ts_vol               ".trim(), length));
            String[] vps_tmnl_voy      =  (JSPUtil.getParameter(request, "vps_tmnl_voy             ".trim(), length));
            String[] vps_etl_dt        =  (JSPUtil.getParameter(request, "vps_etl_dt               ".trim(), length));
            String[] vps_tmnl_cd       =  (JSPUtil.getParameter(request, "vps_tmnl_cd              ".trim(), length));
            String[] vps_tmnl_cfm      =  (JSPUtil.getParameter(request, "vps_tmnl_cfm             ".trim(), length));
            String[] vps_leta_dt       =  (JSPUtil.getParameter(request, "vps_leta_dt              ".trim(), length));
            String[] vps_letb_dt       =  (JSPUtil.getParameter(request, "vps_letb_dt              ".trim(), length));
            String[] vps_letd_dt       =  (JSPUtil.getParameter(request, "vps_letd_dt              ".trim(), length));
            String[] vps_ship_call_no  =  (JSPUtil.getParameter(request, "vps_ship_call_no         ".trim(), length));
            String[] vps_pier          =  (JSPUtil.getParameter(request, "vps_pier                 ".trim(), length));
            String[] yd_cd             =  (JSPUtil.getParameter(request, "yd_cd                    ".trim(), length));
            String[] vsp_ship_call_id  =  (JSPUtil.getParameter(request, "vsp_ship_call_id         ".trim(), length));
            String[] vsp_ship_call_dt  =  (JSPUtil.getParameter(request, "vsp_ship_call_dt         ".trim(), length));
            String[] tmnl_vsl_cd       =  (JSPUtil.getParameter(request, "tmnl_vsl_cd              ".trim(), length));
            String[] free_tm_dt        =  (JSPUtil.getParameter(request, "free_tm_dt               ".trim(), length));
            String[] vps_edi_cnt       =  (JSPUtil.getParameter(request, "vps_edi_cnt              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL_PORT_SKD();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setVsl_cd                     (vsl_cd               [i]);
                model.setSkd_voyage_no              (skd_voyage_no        [i]);
                model.setSkd_dir_cd                 (skd_dir_cd           [i]);
                model.setVps_loc_cd                 (vps_loc_cd           [i]);
                model.setVps_call_ind               (vps_call_ind         [i]);
                model.setVps_call_seq               (vps_call_seq         [i]);
                model.setVps_eta_dt                 (vps_eta_dt           [i]);
                model.setVps_etb_dt                 (vps_etb_dt           [i]);
                model.setVps_etd_dt                 (vps_etd_dt           [i]);
                model.setVps_cct_dt                 (vps_cct_dt           [i]);
                model.setVps_bct_dt                 (vps_bct_dt           [i]);
                model.setVps_skd_stat               (vps_skd_stat         [i]);
                model.setVps_chang_ind              (vps_chang_ind        [i]);
                model.setVps_next_loc_cd            (vps_next_loc_cd      [i]);
                model.setVps_next_dir_cd            (vps_next_dir_cd      [i]);
                model.setVps_next_call_ind          (vps_next_call_ind    [i]);
                model.setVps_turn_ind               (vps_turn_ind         [i]);
                model.setVps_turn_voyage            (vps_turn_voyage      [i]);
                model.setVps_turn_dir_cd            (vps_turn_dir_cd      [i]);
                model.setVps_turn_call_ind          (vps_turn_call_ind    [i]);
                model.setVps_bl_vd                  (vps_bl_vd            [i]);
                model.setVps_car_dir                (vps_car_dir          [i]);
                model.setVps_car_voy                (vps_car_voy          [i]);
                model.setVps_tml_nm                 (vps_tml_nm           [i]);
                model.setVps_rev_mk                 (vps_rev_mk           [i]);
                model.setVps_chg_loc_cd             (vps_chg_loc_cd       [i]);
                model.setVps_chg_call_ind           (vps_chg_call_ind     [i]);
                model.setVps_udt_dt                 (vps_udt_dt           [i]);
                model.setVps_udt_id                 (vps_udt_id           [i]);
                model.setVps_remark                 (vps_remark           [i]);
                model.setVps_phaio_rsn              (vps_phaio_rsn        [i]);
                model.setVps_phaio_rmk              (vps_phaio_rmk        [i]);
                model.setVps_dock_in_dt             (vps_dock_in_dt       [i]);
                model.setVps_dock_out_dt            (vps_dock_out_dt      [i]);
                model.setVps_dock_nm                (vps_dock_nm          [i]);
                model.setVps_dock_type              (vps_dock_type        [i]);
                model.setVps_dock_rmk               (vps_dock_rmk         [i]);
                model.setVps_next_lane_cd           (vps_next_lane_cd     [i]);
                model.setVps_ex_rt                  (vps_ex_rt            [i]);
                model.setVps_ata_dt                 (vps_ata_dt           [i]);
                model.setVps_atb_dt                 (vps_atb_dt           [i]);
                model.setVps_atd_dt                 (vps_atd_dt           [i]);
                model.setVps_lane_cd                (vps_lane_cd          [i]);
                model.setVps_bdr_ind                (vps_bdr_ind          [i]);
                model.setVps_cbf_ind                (vps_cbf_ind          [i]);
                model.setVps_hancos_vsl             (vps_hancos_vsl       [i]);
                model.setVps_cgo_vol                (vps_cgo_vol          [i]);
                model.setVps_pire                   (vps_pire             [i]);
                model.setVps_fin_dir                (vps_fin_dir          [i]);
                model.setVps_cntr_ind               (vps_cntr_ind         [i]);
                model.setVps_act_dt                 (vps_act_dt           [i]);
                model.setVps_tml_vsl                (vps_tml_vsl          [i]);
                model.setVps_tml_seq                (vps_tml_seq          [i]);
                model.setVps_app_ind                (vps_app_ind          [i]);
                model.setVps_used_ind               (vps_used_ind         [i]);
                model.setNis_event_dt               (nis_event_dt         [i]);
                model.setVps_ib_vol                 (vps_ib_vol           [i]);
                model.setVps_ob_vol                 (vps_ob_vol           [i]);
                model.setVps_ts_vol                 (vps_ts_vol           [i]);
                model.setVps_tmnl_voy               (vps_tmnl_voy         [i]);
                model.setVps_etl_dt                 (vps_etl_dt           [i]);
                model.setVps_tmnl_cd                (vps_tmnl_cd          [i]);
                model.setVps_tmnl_cfm               (vps_tmnl_cfm         [i]);
                model.setVps_leta_dt                (vps_leta_dt          [i]);
                model.setVps_letb_dt                (vps_letb_dt          [i]);
                model.setVps_letd_dt                (vps_letd_dt          [i]);
                model.setVps_ship_call_no           (vps_ship_call_no     [i]);
                model.setVps_pier                   (vps_pier             [i]);
                model.setYd_cd                      (yd_cd                [i]);
                model.setVsp_ship_call_id           (vsp_ship_call_id     [i]);
                model.setVsp_ship_call_dt           (vsp_ship_call_dt     [i]);
                model.setTmnl_vsl_cd                (tmnl_vsl_cd          [i]);
                model.setFree_tm_dt                 (free_tm_dt           [i]);
                model.setVps_edi_cnt                (vps_edi_cnt          [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        VSL_PORT_SKD model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] vsl_cd            =  (JSPUtil.getParameter(request, prefix + "vsl_cd                   ".trim(), length));
            String[] skd_voyage_no     =  (JSPUtil.getParameter(request, prefix + "skd_voyage_no            ".trim(), length));
            String[] skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd               ".trim(), length));
            String[] vps_loc_cd        =  (JSPUtil.getParameter(request, prefix + "vps_loc_cd               ".trim(), length));
            String[] vps_call_ind      =  (JSPUtil.getParameter(request, prefix + "vps_call_ind             ".trim(), length));
            String[] vps_call_seq      =  (JSPUtil.getParameter(request, prefix + "vps_call_seq             ".trim(), length));
            String[] vps_eta_dt        =  (JSPUtil.getParameter(request, prefix + "vps_eta_dt               ".trim(), length));
            String[] vps_etb_dt        =  (JSPUtil.getParameter(request, prefix + "vps_etb_dt               ".trim(), length));
            String[] vps_etd_dt        =  (JSPUtil.getParameter(request, prefix + "vps_etd_dt               ".trim(), length));
            String[] vps_cct_dt        =  (JSPUtil.getParameter(request, prefix + "vps_cct_dt               ".trim(), length));
            String[] vps_bct_dt        =  (JSPUtil.getParameter(request, prefix + "vps_bct_dt               ".trim(), length));
            String[] vps_skd_stat      =  (JSPUtil.getParameter(request, prefix + "vps_skd_stat             ".trim(), length));
            String[] vps_chang_ind     =  (JSPUtil.getParameter(request, prefix + "vps_chang_ind            ".trim(), length));
            String[] vps_next_loc_cd   =  (JSPUtil.getParameter(request, prefix + "vps_next_loc_cd          ".trim(), length));
            String[] vps_next_dir_cd   =  (JSPUtil.getParameter(request, prefix + "vps_next_dir_cd          ".trim(), length));
            String[] vps_next_call_ind =  (JSPUtil.getParameter(request, prefix + "vps_next_call_ind        ".trim(), length));
            String[] vps_turn_ind      =  (JSPUtil.getParameter(request, prefix + "vps_turn_ind             ".trim(), length));
            String[] vps_turn_voyage   =  (JSPUtil.getParameter(request, prefix + "vps_turn_voyage          ".trim(), length));
            String[] vps_turn_dir_cd   =  (JSPUtil.getParameter(request, prefix + "vps_turn_dir_cd          ".trim(), length));
            String[] vps_turn_call_ind =  (JSPUtil.getParameter(request, prefix + "vps_turn_call_ind        ".trim(), length));
            String[] vps_bl_vd         =  (JSPUtil.getParameter(request, prefix + "vps_bl_vd                ".trim(), length));
            String[] vps_car_dir       =  (JSPUtil.getParameter(request, prefix + "vps_car_dir              ".trim(), length));
            String[] vps_car_voy       =  (JSPUtil.getParameter(request, prefix + "vps_car_voy              ".trim(), length));
            String[] vps_tml_nm        =  (JSPUtil.getParameter(request, prefix + "vps_tml_nm               ".trim(), length));
            String[] vps_rev_mk        =  (JSPUtil.getParameter(request, prefix + "vps_rev_mk               ".trim(), length));
            String[] vps_chg_loc_cd    =  (JSPUtil.getParameter(request, prefix + "vps_chg_loc_cd           ".trim(), length));
            String[] vps_chg_call_ind  =  (JSPUtil.getParameter(request, prefix + "vps_chg_call_ind         ".trim(), length));
            String[] vps_udt_dt        =  (JSPUtil.getParameter(request, prefix + "vps_udt_dt               ".trim(), length));
            String[] vps_udt_id        =  (JSPUtil.getParameter(request, prefix + "vps_udt_id               ".trim(), length));
            String[] vps_remark        =  (JSPUtil.getParameter(request, prefix + "vps_remark               ".trim(), length));
            String[] vps_phaio_rsn     =  (JSPUtil.getParameter(request, prefix + "vps_phaio_rsn            ".trim(), length));
            String[] vps_phaio_rmk     =  (JSPUtil.getParameter(request, prefix + "vps_phaio_rmk            ".trim(), length));
            String[] vps_dock_in_dt    =  (JSPUtil.getParameter(request, prefix + "vps_dock_in_dt           ".trim(), length));
            String[] vps_dock_out_dt   =  (JSPUtil.getParameter(request, prefix + "vps_dock_out_dt          ".trim(), length));
            String[] vps_dock_nm       =  (JSPUtil.getParameter(request, prefix + "vps_dock_nm              ".trim(), length));
            String[] vps_dock_type     =  (JSPUtil.getParameter(request, prefix + "vps_dock_type            ".trim(), length));
            String[] vps_dock_rmk      =  (JSPUtil.getParameter(request, prefix + "vps_dock_rmk             ".trim(), length));
            String[] vps_next_lane_cd  =  (JSPUtil.getParameter(request, prefix + "vps_next_lane_cd         ".trim(), length));
            String[] vps_ex_rt         =  (JSPUtil.getParameter(request, prefix + "vps_ex_rt                ".trim(), length));
            String[] vps_ata_dt        =  (JSPUtil.getParameter(request, prefix + "vps_ata_dt               ".trim(), length));
            String[] vps_atb_dt        =  (JSPUtil.getParameter(request, prefix + "vps_atb_dt               ".trim(), length));
            String[] vps_atd_dt        =  (JSPUtil.getParameter(request, prefix + "vps_atd_dt               ".trim(), length));
            String[] vps_lane_cd       =  (JSPUtil.getParameter(request, prefix + "vps_lane_cd              ".trim(), length));
            String[] vps_bdr_ind       =  (JSPUtil.getParameter(request, prefix + "vps_bdr_ind              ".trim(), length));
            String[] vps_cbf_ind       =  (JSPUtil.getParameter(request, prefix + "vps_cbf_ind              ".trim(), length));
            String[] vps_hancos_vsl    =  (JSPUtil.getParameter(request, prefix + "vps_hancos_vsl           ".trim(), length));
            String[] vps_cgo_vol       =  (JSPUtil.getParameter(request, prefix + "vps_cgo_vol              ".trim(), length));
            String[] vps_pire          =  (JSPUtil.getParameter(request, prefix + "vps_pire                 ".trim(), length));
            String[] vps_fin_dir       =  (JSPUtil.getParameter(request, prefix + "vps_fin_dir              ".trim(), length));
            String[] vps_cntr_ind      =  (JSPUtil.getParameter(request, prefix + "vps_cntr_ind             ".trim(), length));
            String[] vps_act_dt        =  (JSPUtil.getParameter(request, prefix + "vps_act_dt               ".trim(), length));
            String[] vps_tml_vsl       =  (JSPUtil.getParameter(request, prefix + "vps_tml_vsl              ".trim(), length));
            String[] vps_tml_seq       =  (JSPUtil.getParameter(request, prefix + "vps_tml_seq              ".trim(), length));
            String[] vps_app_ind       =  (JSPUtil.getParameter(request, prefix + "vps_app_ind              ".trim(), length));
            String[] vps_used_ind      =  (JSPUtil.getParameter(request, prefix + "vps_used_ind             ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, prefix + "nis_event_dt             ".trim(), length));
            String[] vps_ib_vol        =  (JSPUtil.getParameter(request, prefix + "vps_ib_vol               ".trim(), length));
            String[] vps_ob_vol        =  (JSPUtil.getParameter(request, prefix + "vps_ob_vol               ".trim(), length));
            String[] vps_ts_vol        =  (JSPUtil.getParameter(request, prefix + "vps_ts_vol               ".trim(), length));
            String[] vps_tmnl_voy      =  (JSPUtil.getParameter(request, prefix + "vps_tmnl_voy             ".trim(), length));
            String[] vps_etl_dt        =  (JSPUtil.getParameter(request, prefix + "vps_etl_dt               ".trim(), length));
            String[] vps_tmnl_cd       =  (JSPUtil.getParameter(request, prefix + "vps_tmnl_cd              ".trim(), length));
            String[] vps_tmnl_cfm      =  (JSPUtil.getParameter(request, prefix + "vps_tmnl_cfm             ".trim(), length));
            String[] vps_leta_dt       =  (JSPUtil.getParameter(request, prefix + "vps_leta_dt              ".trim(), length));
            String[] vps_letb_dt       =  (JSPUtil.getParameter(request, prefix + "vps_letb_dt              ".trim(), length));
            String[] vps_letd_dt       =  (JSPUtil.getParameter(request, prefix + "vps_letd_dt              ".trim(), length));
            String[] vps_ship_call_no  =  (JSPUtil.getParameter(request, prefix + "vps_ship_call_no         ".trim(), length));
            String[] vps_pier          =  (JSPUtil.getParameter(request, prefix + "vps_pier                 ".trim(), length));
            String[] yd_cd             =  (JSPUtil.getParameter(request, prefix + "yd_cd                    ".trim(), length));
            String[] vsp_ship_call_id  =  (JSPUtil.getParameter(request, prefix + "vsp_ship_call_id         ".trim(), length));
            String[] vsp_ship_call_dt  =  (JSPUtil.getParameter(request, prefix + "vsp_ship_call_dt         ".trim(), length));
            String[] tmnl_vsl_cd       =  (JSPUtil.getParameter(request, prefix + "tmnl_vsl_cd              ".trim(), length));
            String[] free_tm_dt        =  (JSPUtil.getParameter(request, prefix + "free_tm_dt               ".trim(), length));
            String[] vps_edi_cnt       =  (JSPUtil.getParameter(request, prefix + "vps_edi_cnt              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL_PORT_SKD();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setVsl_cd                     ( vsl_cd               [i]);
                model.setSkd_voyage_no              ( skd_voyage_no        [i]);
                model.setSkd_dir_cd                 ( skd_dir_cd           [i]);
                model.setVps_loc_cd                 ( vps_loc_cd           [i]);
                model.setVps_call_ind               ( vps_call_ind         [i]);
                model.setVps_call_seq               ( vps_call_seq         [i]);
                model.setVps_eta_dt                 ( vps_eta_dt           [i]);
                model.setVps_etb_dt                 ( vps_etb_dt           [i]);
                model.setVps_etd_dt                 ( vps_etd_dt           [i]);
                model.setVps_cct_dt                 ( vps_cct_dt           [i]);
                model.setVps_bct_dt                 ( vps_bct_dt           [i]);
                model.setVps_skd_stat               ( vps_skd_stat         [i]);
                model.setVps_chang_ind              ( vps_chang_ind        [i]);
                model.setVps_next_loc_cd            ( vps_next_loc_cd      [i]);
                model.setVps_next_dir_cd            ( vps_next_dir_cd      [i]);
                model.setVps_next_call_ind          ( vps_next_call_ind    [i]);
                model.setVps_turn_ind               ( vps_turn_ind         [i]);
                model.setVps_turn_voyage            ( vps_turn_voyage      [i]);
                model.setVps_turn_dir_cd            ( vps_turn_dir_cd      [i]);
                model.setVps_turn_call_ind          ( vps_turn_call_ind    [i]);
                model.setVps_bl_vd                  ( vps_bl_vd            [i]);
                model.setVps_car_dir                ( vps_car_dir          [i]);
                model.setVps_car_voy                ( vps_car_voy          [i]);
                model.setVps_tml_nm                 ( vps_tml_nm           [i]);
                model.setVps_rev_mk                 ( vps_rev_mk           [i]);
                model.setVps_chg_loc_cd             ( vps_chg_loc_cd       [i]);
                model.setVps_chg_call_ind           ( vps_chg_call_ind     [i]);
                model.setVps_udt_dt                 ( vps_udt_dt           [i]);
                model.setVps_udt_id                 ( vps_udt_id           [i]);
                model.setVps_remark                 ( vps_remark           [i]);
                model.setVps_phaio_rsn              ( vps_phaio_rsn        [i]);
                model.setVps_phaio_rmk              ( vps_phaio_rmk        [i]);
                model.setVps_dock_in_dt             ( vps_dock_in_dt       [i]);
                model.setVps_dock_out_dt            ( vps_dock_out_dt      [i]);
                model.setVps_dock_nm                ( vps_dock_nm          [i]);
                model.setVps_dock_type              ( vps_dock_type        [i]);
                model.setVps_dock_rmk               ( vps_dock_rmk         [i]);
                model.setVps_next_lane_cd           ( vps_next_lane_cd     [i]);
                model.setVps_ex_rt                  ( vps_ex_rt            [i]);
                model.setVps_ata_dt                 ( vps_ata_dt           [i]);
                model.setVps_atb_dt                 ( vps_atb_dt           [i]);
                model.setVps_atd_dt                 ( vps_atd_dt           [i]);
                model.setVps_lane_cd                ( vps_lane_cd          [i]);
                model.setVps_bdr_ind                ( vps_bdr_ind          [i]);
                model.setVps_cbf_ind                ( vps_cbf_ind          [i]);
                model.setVps_hancos_vsl             ( vps_hancos_vsl       [i]);
                model.setVps_cgo_vol                ( vps_cgo_vol          [i]);
                model.setVps_pire                   ( vps_pire             [i]);
                model.setVps_fin_dir                ( vps_fin_dir          [i]);
                model.setVps_cntr_ind               ( vps_cntr_ind         [i]);
                model.setVps_act_dt                 ( vps_act_dt           [i]);
                model.setVps_tml_vsl                ( vps_tml_vsl          [i]);
                model.setVps_tml_seq                ( vps_tml_seq          [i]);
                model.setVps_app_ind                ( vps_app_ind          [i]);
                model.setVps_used_ind               ( vps_used_ind         [i]);
                model.setNis_event_dt               ( nis_event_dt         [i]);
                model.setVps_ib_vol                 ( vps_ib_vol           [i]);
                model.setVps_ob_vol                 ( vps_ob_vol           [i]);
                model.setVps_ts_vol                 ( vps_ts_vol           [i]);
                model.setVps_tmnl_voy               ( vps_tmnl_voy         [i]);
                model.setVps_etl_dt                 ( vps_etl_dt           [i]);
                model.setVps_tmnl_cd                ( vps_tmnl_cd          [i]);
                model.setVps_tmnl_cfm               ( vps_tmnl_cfm         [i]);
                model.setVps_leta_dt                ( vps_leta_dt          [i]);
                model.setVps_letb_dt                ( vps_letb_dt          [i]);
                model.setVps_letd_dt                ( vps_letd_dt          [i]);
                model.setVps_ship_call_no           ( vps_ship_call_no     [i]);
                model.setVps_pier                   ( vps_pier             [i]);
                model.setYd_cd                      ( yd_cd                [i]);
                model.setVsp_ship_call_id           ( vsp_ship_call_id     [i]);
                model.setVsp_ship_call_dt           ( vsp_ship_call_dt     [i]);
                model.setTmnl_vsl_cd                ( tmnl_vsl_cd          [i]);
                model.setFree_tm_dt                 ( free_tm_dt           [i]);
                model.setVps_edi_cnt                ( vps_edi_cnt          [i]);
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
