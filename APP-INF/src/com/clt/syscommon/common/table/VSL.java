/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSL.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
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
 */public final class VSL implements java.io.Serializable {

    private String             ibflag             = "";
    private String             page_rows          = "";
    private String             vsl_cd             = "";
    private String             vsl_eng_nm         = "";
    private String             vsl_type_cd        = "";
    private String             vsl_new_built_ind  = "";
    private String             vsl_owned_ind      = "";
    private String             car_cd             = "";
    private String             vsl_car_vsl_cd     = "";
    private String             vsl_svc_spd        = "";
    private String             vsl_max_spd        = "";
    private String             vsl_eco_spd        = "";
    private String             vsl_crew           = "";
    private String             vsl_cntr_capa_d    = "";
    private String             vsl_cntr_capa_o    = "";
    private String             vsl_cntr_capa_p    = "";
    private String             vsl_cgo_capa_grain = "";
    private String             vsl_cgo_capa_bail  = "";
    private String             vsl_cgo_capa_tank  = "";
    private String             vsl_teu_cd         = "";
    private String             vsl_rf_recept_qty  = "";
    private String             vsl_rf_recept_max  = "";
    private String             vsl_call_sign      = "";
    private String             vsl_offcl_no       = "";
    private String             vsl_immar_id1      = "";
    private String             vsl_immar_id2      = "";
    private String             vsl_immar_id3      = "";
    private String             vsl_regn_port      = "";
    private String             vsl_flag           = "";
    private String             vsl_class          = "";
    private String             vsl_class_no       = "";
    private String             vsl_builder        = "";
    private String             vsl_launched_dt    = "";
    private String             vsl_delevered_dt   = "";
    private String             vsl_kell_laid      = "";
    private String             vsl_close_dt       = "";
    private String             vsl_hull_no        = "";
    private String             vsl_loa            = "";
    private String             vsl_lbp            = "";
    private String             vsl_breadth        = "";
    private String             vsl_depth          = "";
    private String             vsl_draft          = "";
    private String             vsl_freeboard      = "";
    private String             vsl_displace       = "";
    private String             vsl_dead_wt        = "";
    private String             vsl_light_ship     = "";
    private String             vsl_grt            = "";
    private String             vsl_nrt            = "";
    private String             vsl_panama_grt     = "";
    private String             vsl_panama_nrt     = "";
    private String             vsl_suez_grt       = "";
    private String             vsl_suez_nrt       = "";
    private String             vsl_fo_capa        = "";
    private String             vsl_do_capa        = "";
    private String             vsl_fw_capa        = "";
    private String             vsl_ballas_capa    = "";
    private String             vsl_fo_consumpt    = "";
    private String             vsl_do_consumpt    = "";
    private String             vsl_fw_consumpt    = "";
    private String             vsl_main_maker     = "";
    private String             vsl_main_type      = "";
    private String             vsl_main_bhp       = "";
    private String             vsl_main_rpm       = "";
    private String             vsl_gen_maker      = "";
    private String             vsl_gen_type       = "";
    private String             vsl_gen_bhp        = "";
    private String             vsl_gen_rpm        = "";
    private String             vsl_bow_maker      = "";
    private String             vsl_bow_type       = "";
    private String             vsl_bow_bhp        = "";
    private String             vsl_bow_rpm        = "";
    private String             vsl_kor_nm         = "";
    private String             vsl_del_mk         = "";
    private String             vsl_fdr_ind        = "";
    private String             vsl_lane_cd        = "";
    private String             vsl_conv_div       = "";
    private String             vsl_pcall_cnt      = "";
    private String             vsl_bulk_type      = "";
    private String             vsl_del_dt         = "";
    private String             vsl_bulk_size      = "";
    private String             vsl_lloyd_no       = "";
    private String             vsl_height         = "";
    private String             vsl_regist_dt      = "";
    private String             vsl_radar_tp       = "";
    private String             vsl_spare_pro      = "";
    private String             vsl_spare_anc      = "";
    private String             vsl_hold_no        = "";
    private String             vsl_hatch_no       = "";
    private String             vsl_cgo_gear       = "";
    private String             vsl_edi_nm         = "";
    private String             vsl_comp_ind       = "";
    private String             vsl_crt_dt         = "";
    private String             vsl_crt_id         = "";
    private String             vsl_udt_dt         = "";
    private String             vsl_udt_id         = "";
    private String             vsl_sfc_dt         = "";
    private String             vsl_sfr_dt         = "";
    private String             vsl_sfe_dt         = "";
    private String             vsl_ll_dt          = "";
    private String             vsl_dr_dt          = "";
    private String             vsl_crt_ofc        = "";
    private String             vsl_del_ofc        = "";
    private String             nis_event_dt       = "";
    private String             vsl_pas_job        = "";
    private String             vsl_pas_vamt       = "";
    private String             vsl_pas_oc         = "";
    private String             vsl_pas_bulk_biz   = "";
    private String             vsl_pas_teu_cd     = "";
    private String             tre_rsn_cntr       = "";
    private String             vsl_tariff_size    = "";
    private String             vsl_oop_cd1        = "";
    private String             vsl_oop_cd2        = "";
    private String             vsl_oop_cd3        = "";
    private String             vsl_build_loc      = "";
    private String             vsl_nrt_itc        = "";

    public VSL(){}

    public VSL(
            String             ibflag            ,
            String             page_rows         ,
            String             vsl_cd            ,
            String             vsl_eng_nm        ,
            String             vsl_type_cd       ,
            String             vsl_new_built_ind ,
            String             vsl_owned_ind     ,
            String             car_cd            ,
            String             vsl_car_vsl_cd    ,
            String             vsl_svc_spd       ,
            String             vsl_max_spd       ,
            String             vsl_eco_spd       ,
            String             vsl_crew          ,
            String             vsl_cntr_capa_d   ,
            String             vsl_cntr_capa_o   ,
            String             vsl_cntr_capa_p   ,
            String             vsl_cgo_capa_grain,
            String             vsl_cgo_capa_bail ,
            String             vsl_cgo_capa_tank ,
            String             vsl_teu_cd        ,
            String             vsl_rf_recept_qty ,
            String             vsl_rf_recept_max ,
            String             vsl_call_sign     ,
            String             vsl_offcl_no      ,
            String             vsl_immar_id1     ,
            String             vsl_immar_id2     ,
            String             vsl_immar_id3     ,
            String             vsl_regn_port     ,
            String             vsl_flag          ,
            String             vsl_class         ,
            String             vsl_class_no      ,
            String             vsl_builder       ,
            String             vsl_launched_dt   ,
            String             vsl_delevered_dt  ,
            String             vsl_kell_laid     ,
            String             vsl_close_dt      ,
            String             vsl_hull_no       ,
            String             vsl_loa           ,
            String             vsl_lbp           ,
            String             vsl_breadth       ,
            String             vsl_depth         ,
            String             vsl_draft         ,
            String             vsl_freeboard     ,
            String             vsl_displace      ,
            String             vsl_dead_wt       ,
            String             vsl_light_ship    ,
            String             vsl_grt           ,
            String             vsl_nrt           ,
            String             vsl_panama_grt    ,
            String             vsl_panama_nrt    ,
            String             vsl_suez_grt      ,
            String             vsl_suez_nrt      ,
            String             vsl_fo_capa       ,
            String             vsl_do_capa       ,
            String             vsl_fw_capa       ,
            String             vsl_ballas_capa   ,
            String             vsl_fo_consumpt   ,
            String             vsl_do_consumpt   ,
            String             vsl_fw_consumpt   ,
            String             vsl_main_maker    ,
            String             vsl_main_type     ,
            String             vsl_main_bhp      ,
            String             vsl_main_rpm      ,
            String             vsl_gen_maker     ,
            String             vsl_gen_type      ,
            String             vsl_gen_bhp       ,
            String             vsl_gen_rpm       ,
            String             vsl_bow_maker     ,
            String             vsl_bow_type      ,
            String             vsl_bow_bhp       ,
            String             vsl_bow_rpm       ,
            String             vsl_kor_nm        ,
            String             vsl_del_mk        ,
            String             vsl_fdr_ind       ,
            String             vsl_lane_cd       ,
            String             vsl_conv_div      ,
            String             vsl_pcall_cnt     ,
            String             vsl_bulk_type     ,
            String             vsl_del_dt        ,
            String             vsl_bulk_size     ,
            String             vsl_lloyd_no      ,
            String             vsl_height        ,
            String             vsl_regist_dt     ,
            String             vsl_radar_tp      ,
            String             vsl_spare_pro     ,
            String             vsl_spare_anc     ,
            String             vsl_hold_no       ,
            String             vsl_hatch_no      ,
            String             vsl_cgo_gear      ,
            String             vsl_edi_nm        ,
            String             vsl_comp_ind      ,
            String             vsl_crt_dt        ,
            String             vsl_crt_id        ,
            String             vsl_udt_dt        ,
            String             vsl_udt_id        ,
            String             vsl_sfc_dt        ,
            String             vsl_sfr_dt        ,
            String             vsl_sfe_dt        ,
            String             vsl_ll_dt         ,
            String             vsl_dr_dt         ,
            String             vsl_crt_ofc       ,
            String             vsl_del_ofc       ,
            String             nis_event_dt      ,
            String             vsl_pas_job       ,
            String             vsl_pas_vamt      ,
            String             vsl_pas_oc        ,
            String             vsl_pas_bulk_biz  ,
            String             vsl_pas_teu_cd    ,
            String             tre_rsn_cntr      ,
            String             vsl_tariff_size   ,
            String             vsl_oop_cd1       ,
            String             vsl_oop_cd2       ,
            String             vsl_oop_cd3       ,
            String             vsl_build_loc     ,
            String             vsl_nrt_itc       ){
        this.ibflag             = ibflag            ;
        this.page_rows          = page_rows         ;
        this.vsl_cd             = vsl_cd            ;
        this.vsl_eng_nm         = vsl_eng_nm        ;
        this.vsl_type_cd        = vsl_type_cd       ;
        this.vsl_new_built_ind  = vsl_new_built_ind ;
        this.vsl_owned_ind      = vsl_owned_ind     ;
        this.car_cd             = car_cd            ;
        this.vsl_car_vsl_cd     = vsl_car_vsl_cd    ;
        this.vsl_svc_spd        = vsl_svc_spd       ;
        this.vsl_max_spd        = vsl_max_spd       ;
        this.vsl_eco_spd        = vsl_eco_spd       ;
        this.vsl_crew           = vsl_crew          ;
        this.vsl_cntr_capa_d    = vsl_cntr_capa_d   ;
        this.vsl_cntr_capa_o    = vsl_cntr_capa_o   ;
        this.vsl_cntr_capa_p    = vsl_cntr_capa_p   ;
        this.vsl_cgo_capa_grain = vsl_cgo_capa_grain;
        this.vsl_cgo_capa_bail  = vsl_cgo_capa_bail ;
        this.vsl_cgo_capa_tank  = vsl_cgo_capa_tank ;
        this.vsl_teu_cd         = vsl_teu_cd        ;
        this.vsl_rf_recept_qty  = vsl_rf_recept_qty ;
        this.vsl_rf_recept_max  = vsl_rf_recept_max ;
        this.vsl_call_sign      = vsl_call_sign     ;
        this.vsl_offcl_no       = vsl_offcl_no      ;
        this.vsl_immar_id1      = vsl_immar_id1     ;
        this.vsl_immar_id2      = vsl_immar_id2     ;
        this.vsl_immar_id3      = vsl_immar_id3     ;
        this.vsl_regn_port      = vsl_regn_port     ;
        this.vsl_flag           = vsl_flag          ;
        this.vsl_class          = vsl_class         ;
        this.vsl_class_no       = vsl_class_no      ;
        this.vsl_builder        = vsl_builder       ;
        this.vsl_launched_dt    = vsl_launched_dt   ;
        this.vsl_delevered_dt   = vsl_delevered_dt  ;
        this.vsl_kell_laid      = vsl_kell_laid     ;
        this.vsl_close_dt       = vsl_close_dt      ;
        this.vsl_hull_no        = vsl_hull_no       ;
        this.vsl_loa            = vsl_loa           ;
        this.vsl_lbp            = vsl_lbp           ;
        this.vsl_breadth        = vsl_breadth       ;
        this.vsl_depth          = vsl_depth         ;
        this.vsl_draft          = vsl_draft         ;
        this.vsl_freeboard      = vsl_freeboard     ;
        this.vsl_displace       = vsl_displace      ;
        this.vsl_dead_wt        = vsl_dead_wt       ;
        this.vsl_light_ship     = vsl_light_ship    ;
        this.vsl_grt            = vsl_grt           ;
        this.vsl_nrt            = vsl_nrt           ;
        this.vsl_panama_grt     = vsl_panama_grt    ;
        this.vsl_panama_nrt     = vsl_panama_nrt    ;
        this.vsl_suez_grt       = vsl_suez_grt      ;
        this.vsl_suez_nrt       = vsl_suez_nrt      ;
        this.vsl_fo_capa        = vsl_fo_capa       ;
        this.vsl_do_capa        = vsl_do_capa       ;
        this.vsl_fw_capa        = vsl_fw_capa       ;
        this.vsl_ballas_capa    = vsl_ballas_capa   ;
        this.vsl_fo_consumpt    = vsl_fo_consumpt   ;
        this.vsl_do_consumpt    = vsl_do_consumpt   ;
        this.vsl_fw_consumpt    = vsl_fw_consumpt   ;
        this.vsl_main_maker     = vsl_main_maker    ;
        this.vsl_main_type      = vsl_main_type     ;
        this.vsl_main_bhp       = vsl_main_bhp      ;
        this.vsl_main_rpm       = vsl_main_rpm      ;
        this.vsl_gen_maker      = vsl_gen_maker     ;
        this.vsl_gen_type       = vsl_gen_type      ;
        this.vsl_gen_bhp        = vsl_gen_bhp       ;
        this.vsl_gen_rpm        = vsl_gen_rpm       ;
        this.vsl_bow_maker      = vsl_bow_maker     ;
        this.vsl_bow_type       = vsl_bow_type      ;
        this.vsl_bow_bhp        = vsl_bow_bhp       ;
        this.vsl_bow_rpm        = vsl_bow_rpm       ;
        this.vsl_kor_nm         = vsl_kor_nm        ;
        this.vsl_del_mk         = vsl_del_mk        ;
        this.vsl_fdr_ind        = vsl_fdr_ind       ;
        this.vsl_lane_cd        = vsl_lane_cd       ;
        this.vsl_conv_div       = vsl_conv_div      ;
        this.vsl_pcall_cnt      = vsl_pcall_cnt     ;
        this.vsl_bulk_type      = vsl_bulk_type     ;
        this.vsl_del_dt         = vsl_del_dt        ;
        this.vsl_bulk_size      = vsl_bulk_size     ;
        this.vsl_lloyd_no       = vsl_lloyd_no      ;
        this.vsl_height         = vsl_height        ;
        this.vsl_regist_dt      = vsl_regist_dt     ;
        this.vsl_radar_tp       = vsl_radar_tp      ;
        this.vsl_spare_pro      = vsl_spare_pro     ;
        this.vsl_spare_anc      = vsl_spare_anc     ;
        this.vsl_hold_no        = vsl_hold_no       ;
        this.vsl_hatch_no       = vsl_hatch_no      ;
        this.vsl_cgo_gear       = vsl_cgo_gear      ;
        this.vsl_edi_nm         = vsl_edi_nm        ;
        this.vsl_comp_ind       = vsl_comp_ind      ;
        this.vsl_crt_dt         = vsl_crt_dt        ;
        this.vsl_crt_id         = vsl_crt_id        ;
        this.vsl_udt_dt         = vsl_udt_dt        ;
        this.vsl_udt_id         = vsl_udt_id        ;
        this.vsl_sfc_dt         = vsl_sfc_dt        ;
        this.vsl_sfr_dt         = vsl_sfr_dt        ;
        this.vsl_sfe_dt         = vsl_sfe_dt        ;
        this.vsl_ll_dt          = vsl_ll_dt         ;
        this.vsl_dr_dt          = vsl_dr_dt         ;
        this.vsl_crt_ofc        = vsl_crt_ofc       ;
        this.vsl_del_ofc        = vsl_del_ofc       ;
        this.nis_event_dt       = nis_event_dt      ;
        this.vsl_pas_job        = vsl_pas_job       ;
        this.vsl_pas_vamt       = vsl_pas_vamt      ;
        this.vsl_pas_oc         = vsl_pas_oc        ;
        this.vsl_pas_bulk_biz   = vsl_pas_bulk_biz  ;
        this.vsl_pas_teu_cd     = vsl_pas_teu_cd    ;
        this.tre_rsn_cntr       = tre_rsn_cntr      ;
        this.vsl_tariff_size    = vsl_tariff_size   ;
        this.vsl_oop_cd1        = vsl_oop_cd1       ;
        this.vsl_oop_cd2        = vsl_oop_cd2       ;
        this.vsl_oop_cd3        = vsl_oop_cd3       ;
        this.vsl_build_loc      = vsl_build_loc     ;
        this.vsl_nrt_itc        = vsl_nrt_itc       ;
    }

    // getter method is proceeding ..
    public String             getIbflag            (){    return ibflag                ;    }
    public String             getPage_rows         (){    return page_rows             ;    }
    public String             getVsl_cd            (){    return vsl_cd                ;    }
    public String             getVsl_eng_nm        (){    return vsl_eng_nm            ;    }
    public String             getVsl_type_cd       (){    return vsl_type_cd           ;    }
    public String             getVsl_new_built_ind (){    return vsl_new_built_ind     ;    }
    public String             getVsl_owned_ind     (){    return vsl_owned_ind         ;    }
    public String             getCar_cd            (){    return car_cd                ;    }
    public String             getVsl_car_vsl_cd    (){    return vsl_car_vsl_cd        ;    }
    public String             getVsl_svc_spd       (){    return vsl_svc_spd           ;    }
    public String             getVsl_max_spd       (){    return vsl_max_spd           ;    }
    public String             getVsl_eco_spd       (){    return vsl_eco_spd           ;    }
    public String             getVsl_crew          (){    return vsl_crew              ;    }
    public String             getVsl_cntr_capa_d   (){    return vsl_cntr_capa_d       ;    }
    public String             getVsl_cntr_capa_o   (){    return vsl_cntr_capa_o       ;    }
    public String             getVsl_cntr_capa_p   (){    return vsl_cntr_capa_p       ;    }
    public String             getVsl_cgo_capa_grain(){    return vsl_cgo_capa_grain    ;    }
    public String             getVsl_cgo_capa_bail (){    return vsl_cgo_capa_bail     ;    }
    public String             getVsl_cgo_capa_tank (){    return vsl_cgo_capa_tank     ;    }
    public String             getVsl_teu_cd        (){    return vsl_teu_cd            ;    }
    public String             getVsl_rf_recept_qty (){    return vsl_rf_recept_qty     ;    }
    public String             getVsl_rf_recept_max (){    return vsl_rf_recept_max     ;    }
    public String             getVsl_call_sign     (){    return vsl_call_sign         ;    }
    public String             getVsl_offcl_no      (){    return vsl_offcl_no          ;    }
    public String             getVsl_immar_id1     (){    return vsl_immar_id1         ;    }
    public String             getVsl_immar_id2     (){    return vsl_immar_id2         ;    }
    public String             getVsl_immar_id3     (){    return vsl_immar_id3         ;    }
    public String             getVsl_regn_port     (){    return vsl_regn_port         ;    }
    public String             getVsl_flag          (){    return vsl_flag              ;    }
    public String             getVsl_class         (){    return vsl_class             ;    }
    public String             getVsl_class_no      (){    return vsl_class_no          ;    }
    public String             getVsl_builder       (){    return vsl_builder           ;    }
    public String             getVsl_launched_dt   (){    return vsl_launched_dt       ;    }
    public String             getVsl_delevered_dt  (){    return vsl_delevered_dt      ;    }
    public String             getVsl_kell_laid     (){    return vsl_kell_laid         ;    }
    public String             getVsl_close_dt      (){    return vsl_close_dt          ;    }
    public String             getVsl_hull_no       (){    return vsl_hull_no           ;    }
    public String             getVsl_loa           (){    return vsl_loa               ;    }
    public String             getVsl_lbp           (){    return vsl_lbp               ;    }
    public String             getVsl_breadth       (){    return vsl_breadth           ;    }
    public String             getVsl_depth         (){    return vsl_depth             ;    }
    public String             getVsl_draft         (){    return vsl_draft             ;    }
    public String             getVsl_freeboard     (){    return vsl_freeboard         ;    }
    public String             getVsl_displace      (){    return vsl_displace          ;    }
    public String             getVsl_dead_wt       (){    return vsl_dead_wt           ;    }
    public String             getVsl_light_ship    (){    return vsl_light_ship        ;    }
    public String             getVsl_grt           (){    return vsl_grt               ;    }
    public String             getVsl_nrt           (){    return vsl_nrt               ;    }
    public String             getVsl_panama_grt    (){    return vsl_panama_grt        ;    }
    public String             getVsl_panama_nrt    (){    return vsl_panama_nrt        ;    }
    public String             getVsl_suez_grt      (){    return vsl_suez_grt          ;    }
    public String             getVsl_suez_nrt      (){    return vsl_suez_nrt          ;    }
    public String             getVsl_fo_capa       (){    return vsl_fo_capa           ;    }
    public String             getVsl_do_capa       (){    return vsl_do_capa           ;    }
    public String             getVsl_fw_capa       (){    return vsl_fw_capa           ;    }
    public String             getVsl_ballas_capa   (){    return vsl_ballas_capa       ;    }
    public String             getVsl_fo_consumpt   (){    return vsl_fo_consumpt       ;    }
    public String             getVsl_do_consumpt   (){    return vsl_do_consumpt       ;    }
    public String             getVsl_fw_consumpt   (){    return vsl_fw_consumpt       ;    }
    public String             getVsl_main_maker    (){    return vsl_main_maker        ;    }
    public String             getVsl_main_type     (){    return vsl_main_type         ;    }
    public String             getVsl_main_bhp      (){    return vsl_main_bhp          ;    }
    public String             getVsl_main_rpm      (){    return vsl_main_rpm          ;    }
    public String             getVsl_gen_maker     (){    return vsl_gen_maker         ;    }
    public String             getVsl_gen_type      (){    return vsl_gen_type          ;    }
    public String             getVsl_gen_bhp       (){    return vsl_gen_bhp           ;    }
    public String             getVsl_gen_rpm       (){    return vsl_gen_rpm           ;    }
    public String             getVsl_bow_maker     (){    return vsl_bow_maker         ;    }
    public String             getVsl_bow_type      (){    return vsl_bow_type          ;    }
    public String             getVsl_bow_bhp       (){    return vsl_bow_bhp           ;    }
    public String             getVsl_bow_rpm       (){    return vsl_bow_rpm           ;    }
    public String             getVsl_kor_nm        (){    return vsl_kor_nm            ;    }
    public String             getVsl_del_mk        (){    return vsl_del_mk            ;    }
    public String             getVsl_fdr_ind       (){    return vsl_fdr_ind           ;    }
    public String             getVsl_lane_cd       (){    return vsl_lane_cd           ;    }
    public String             getVsl_conv_div      (){    return vsl_conv_div          ;    }
    public String             getVsl_pcall_cnt     (){    return vsl_pcall_cnt         ;    }
    public String             getVsl_bulk_type     (){    return vsl_bulk_type         ;    }
    public String             getVsl_del_dt        (){    return vsl_del_dt            ;    }
    public String             getVsl_bulk_size     (){    return vsl_bulk_size         ;    }
    public String             getVsl_lloyd_no      (){    return vsl_lloyd_no          ;    }
    public String             getVsl_height        (){    return vsl_height            ;    }
    public String             getVsl_regist_dt     (){    return vsl_regist_dt         ;    }
    public String             getVsl_radar_tp      (){    return vsl_radar_tp          ;    }
    public String             getVsl_spare_pro     (){    return vsl_spare_pro         ;    }
    public String             getVsl_spare_anc     (){    return vsl_spare_anc         ;    }
    public String             getVsl_hold_no       (){    return vsl_hold_no           ;    }
    public String             getVsl_hatch_no      (){    return vsl_hatch_no          ;    }
    public String             getVsl_cgo_gear      (){    return vsl_cgo_gear          ;    }
    public String             getVsl_edi_nm        (){    return vsl_edi_nm            ;    }
    public String             getVsl_comp_ind      (){    return vsl_comp_ind          ;    }
    public String             getVsl_crt_dt        (){    return vsl_crt_dt            ;    }
    public String             getVsl_crt_id        (){    return vsl_crt_id            ;    }
    public String             getVsl_udt_dt        (){    return vsl_udt_dt            ;    }
    public String             getVsl_udt_id        (){    return vsl_udt_id            ;    }
    public String             getVsl_sfc_dt        (){    return vsl_sfc_dt            ;    }
    public String             getVsl_sfr_dt        (){    return vsl_sfr_dt            ;    }
    public String             getVsl_sfe_dt        (){    return vsl_sfe_dt            ;    }
    public String             getVsl_ll_dt         (){    return vsl_ll_dt             ;    }
    public String             getVsl_dr_dt         (){    return vsl_dr_dt             ;    }
    public String             getVsl_crt_ofc       (){    return vsl_crt_ofc           ;    }
    public String             getVsl_del_ofc       (){    return vsl_del_ofc           ;    }
    public String             getNis_event_dt      (){    return nis_event_dt          ;    }
    public String             getVsl_pas_job       (){    return vsl_pas_job           ;    }
    public String             getVsl_pas_vamt      (){    return vsl_pas_vamt          ;    }
    public String             getVsl_pas_oc        (){    return vsl_pas_oc            ;    }
    public String             getVsl_pas_bulk_biz  (){    return vsl_pas_bulk_biz      ;    }
    public String             getVsl_pas_teu_cd    (){    return vsl_pas_teu_cd        ;    }
    public String             getTre_rsn_cntr      (){    return tre_rsn_cntr          ;    }
    public String             getVsl_tariff_size   (){    return vsl_tariff_size       ;    }
    public String             getVsl_oop_cd1       (){    return vsl_oop_cd1           ;    }
    public String             getVsl_oop_cd2       (){    return vsl_oop_cd2           ;    }
    public String             getVsl_oop_cd3       (){    return vsl_oop_cd3           ;    }
    public String             getVsl_build_loc     (){    return vsl_build_loc         ;    }
    public String             getVsl_nrt_itc       (){    return vsl_nrt_itc           ;    }

    // setter method is proceeding ..
    public void setIbflag            ( String             ibflag             ){    this.ibflag             = ibflag                ;    }
    public void setPage_rows         ( String             page_rows          ){    this.page_rows          = page_rows             ;    }
    public void setVsl_cd            ( String             vsl_cd             ){    this.vsl_cd             = vsl_cd                ;    }
    public void setVsl_eng_nm        ( String             vsl_eng_nm         ){    this.vsl_eng_nm         = vsl_eng_nm            ;    }
    public void setVsl_type_cd       ( String             vsl_type_cd        ){    this.vsl_type_cd        = vsl_type_cd           ;    }
    public void setVsl_new_built_ind ( String             vsl_new_built_ind  ){    this.vsl_new_built_ind  = vsl_new_built_ind     ;    }
    public void setVsl_owned_ind     ( String             vsl_owned_ind      ){    this.vsl_owned_ind      = vsl_owned_ind         ;    }
    public void setCar_cd            ( String             car_cd             ){    this.car_cd             = car_cd                ;    }
    public void setVsl_car_vsl_cd    ( String             vsl_car_vsl_cd     ){    this.vsl_car_vsl_cd     = vsl_car_vsl_cd        ;    }
    public void setVsl_svc_spd       ( String             vsl_svc_spd        ){    this.vsl_svc_spd        = vsl_svc_spd           ;    }
    public void setVsl_max_spd       ( String             vsl_max_spd        ){    this.vsl_max_spd        = vsl_max_spd           ;    }
    public void setVsl_eco_spd       ( String             vsl_eco_spd        ){    this.vsl_eco_spd        = vsl_eco_spd           ;    }
    public void setVsl_crew          ( String             vsl_crew           ){    this.vsl_crew           = vsl_crew              ;    }
    public void setVsl_cntr_capa_d   ( String             vsl_cntr_capa_d    ){    this.vsl_cntr_capa_d    = vsl_cntr_capa_d       ;    }
    public void setVsl_cntr_capa_o   ( String             vsl_cntr_capa_o    ){    this.vsl_cntr_capa_o    = vsl_cntr_capa_o       ;    }
    public void setVsl_cntr_capa_p   ( String             vsl_cntr_capa_p    ){    this.vsl_cntr_capa_p    = vsl_cntr_capa_p       ;    }
    public void setVsl_cgo_capa_grain( String             vsl_cgo_capa_grain ){    this.vsl_cgo_capa_grain = vsl_cgo_capa_grain    ;    }
    public void setVsl_cgo_capa_bail ( String             vsl_cgo_capa_bail  ){    this.vsl_cgo_capa_bail  = vsl_cgo_capa_bail     ;    }
    public void setVsl_cgo_capa_tank ( String             vsl_cgo_capa_tank  ){    this.vsl_cgo_capa_tank  = vsl_cgo_capa_tank     ;    }
    public void setVsl_teu_cd        ( String             vsl_teu_cd         ){    this.vsl_teu_cd         = vsl_teu_cd            ;    }
    public void setVsl_rf_recept_qty ( String             vsl_rf_recept_qty  ){    this.vsl_rf_recept_qty  = vsl_rf_recept_qty     ;    }
    public void setVsl_rf_recept_max ( String             vsl_rf_recept_max  ){    this.vsl_rf_recept_max  = vsl_rf_recept_max     ;    }
    public void setVsl_call_sign     ( String             vsl_call_sign      ){    this.vsl_call_sign      = vsl_call_sign         ;    }
    public void setVsl_offcl_no      ( String             vsl_offcl_no       ){    this.vsl_offcl_no       = vsl_offcl_no          ;    }
    public void setVsl_immar_id1     ( String             vsl_immar_id1      ){    this.vsl_immar_id1      = vsl_immar_id1         ;    }
    public void setVsl_immar_id2     ( String             vsl_immar_id2      ){    this.vsl_immar_id2      = vsl_immar_id2         ;    }
    public void setVsl_immar_id3     ( String             vsl_immar_id3      ){    this.vsl_immar_id3      = vsl_immar_id3         ;    }
    public void setVsl_regn_port     ( String             vsl_regn_port      ){    this.vsl_regn_port      = vsl_regn_port         ;    }
    public void setVsl_flag          ( String             vsl_flag           ){    this.vsl_flag           = vsl_flag              ;    }
    public void setVsl_class         ( String             vsl_class          ){    this.vsl_class          = vsl_class             ;    }
    public void setVsl_class_no      ( String             vsl_class_no       ){    this.vsl_class_no       = vsl_class_no          ;    }
    public void setVsl_builder       ( String             vsl_builder        ){    this.vsl_builder        = vsl_builder           ;    }
    public void setVsl_launched_dt   ( String             vsl_launched_dt    ){    this.vsl_launched_dt    = vsl_launched_dt       ;    }
    public void setVsl_delevered_dt  ( String             vsl_delevered_dt   ){    this.vsl_delevered_dt   = vsl_delevered_dt      ;    }
    public void setVsl_kell_laid     ( String             vsl_kell_laid      ){    this.vsl_kell_laid      = vsl_kell_laid         ;    }
    public void setVsl_close_dt      ( String             vsl_close_dt       ){    this.vsl_close_dt       = vsl_close_dt          ;    }
    public void setVsl_hull_no       ( String             vsl_hull_no        ){    this.vsl_hull_no        = vsl_hull_no           ;    }
    public void setVsl_loa           ( String             vsl_loa            ){    this.vsl_loa            = vsl_loa               ;    }
    public void setVsl_lbp           ( String             vsl_lbp            ){    this.vsl_lbp            = vsl_lbp               ;    }
    public void setVsl_breadth       ( String             vsl_breadth        ){    this.vsl_breadth        = vsl_breadth           ;    }
    public void setVsl_depth         ( String             vsl_depth          ){    this.vsl_depth          = vsl_depth             ;    }
    public void setVsl_draft         ( String             vsl_draft          ){    this.vsl_draft          = vsl_draft             ;    }
    public void setVsl_freeboard     ( String             vsl_freeboard      ){    this.vsl_freeboard      = vsl_freeboard         ;    }
    public void setVsl_displace      ( String             vsl_displace       ){    this.vsl_displace       = vsl_displace          ;    }
    public void setVsl_dead_wt       ( String             vsl_dead_wt        ){    this.vsl_dead_wt        = vsl_dead_wt           ;    }
    public void setVsl_light_ship    ( String             vsl_light_ship     ){    this.vsl_light_ship     = vsl_light_ship        ;    }
    public void setVsl_grt           ( String             vsl_grt            ){    this.vsl_grt            = vsl_grt               ;    }
    public void setVsl_nrt           ( String             vsl_nrt            ){    this.vsl_nrt            = vsl_nrt               ;    }
    public void setVsl_panama_grt    ( String             vsl_panama_grt     ){    this.vsl_panama_grt     = vsl_panama_grt        ;    }
    public void setVsl_panama_nrt    ( String             vsl_panama_nrt     ){    this.vsl_panama_nrt     = vsl_panama_nrt        ;    }
    public void setVsl_suez_grt      ( String             vsl_suez_grt       ){    this.vsl_suez_grt       = vsl_suez_grt          ;    }
    public void setVsl_suez_nrt      ( String             vsl_suez_nrt       ){    this.vsl_suez_nrt       = vsl_suez_nrt          ;    }
    public void setVsl_fo_capa       ( String             vsl_fo_capa        ){    this.vsl_fo_capa        = vsl_fo_capa           ;    }
    public void setVsl_do_capa       ( String             vsl_do_capa        ){    this.vsl_do_capa        = vsl_do_capa           ;    }
    public void setVsl_fw_capa       ( String             vsl_fw_capa        ){    this.vsl_fw_capa        = vsl_fw_capa           ;    }
    public void setVsl_ballas_capa   ( String             vsl_ballas_capa    ){    this.vsl_ballas_capa    = vsl_ballas_capa       ;    }
    public void setVsl_fo_consumpt   ( String             vsl_fo_consumpt    ){    this.vsl_fo_consumpt    = vsl_fo_consumpt       ;    }
    public void setVsl_do_consumpt   ( String             vsl_do_consumpt    ){    this.vsl_do_consumpt    = vsl_do_consumpt       ;    }
    public void setVsl_fw_consumpt   ( String             vsl_fw_consumpt    ){    this.vsl_fw_consumpt    = vsl_fw_consumpt       ;    }
    public void setVsl_main_maker    ( String             vsl_main_maker     ){    this.vsl_main_maker     = vsl_main_maker        ;    }
    public void setVsl_main_type     ( String             vsl_main_type      ){    this.vsl_main_type      = vsl_main_type         ;    }
    public void setVsl_main_bhp      ( String             vsl_main_bhp       ){    this.vsl_main_bhp       = vsl_main_bhp          ;    }
    public void setVsl_main_rpm      ( String             vsl_main_rpm       ){    this.vsl_main_rpm       = vsl_main_rpm          ;    }
    public void setVsl_gen_maker     ( String             vsl_gen_maker      ){    this.vsl_gen_maker      = vsl_gen_maker         ;    }
    public void setVsl_gen_type      ( String             vsl_gen_type       ){    this.vsl_gen_type       = vsl_gen_type          ;    }
    public void setVsl_gen_bhp       ( String             vsl_gen_bhp        ){    this.vsl_gen_bhp        = vsl_gen_bhp           ;    }
    public void setVsl_gen_rpm       ( String             vsl_gen_rpm        ){    this.vsl_gen_rpm        = vsl_gen_rpm           ;    }
    public void setVsl_bow_maker     ( String             vsl_bow_maker      ){    this.vsl_bow_maker      = vsl_bow_maker         ;    }
    public void setVsl_bow_type      ( String             vsl_bow_type       ){    this.vsl_bow_type       = vsl_bow_type          ;    }
    public void setVsl_bow_bhp       ( String             vsl_bow_bhp        ){    this.vsl_bow_bhp        = vsl_bow_bhp           ;    }
    public void setVsl_bow_rpm       ( String             vsl_bow_rpm        ){    this.vsl_bow_rpm        = vsl_bow_rpm           ;    }
    public void setVsl_kor_nm        ( String             vsl_kor_nm         ){    this.vsl_kor_nm         = vsl_kor_nm            ;    }
    public void setVsl_del_mk        ( String             vsl_del_mk         ){    this.vsl_del_mk         = vsl_del_mk            ;    }
    public void setVsl_fdr_ind       ( String             vsl_fdr_ind        ){    this.vsl_fdr_ind        = vsl_fdr_ind           ;    }
    public void setVsl_lane_cd       ( String             vsl_lane_cd        ){    this.vsl_lane_cd        = vsl_lane_cd           ;    }
    public void setVsl_conv_div      ( String             vsl_conv_div       ){    this.vsl_conv_div       = vsl_conv_div          ;    }
    public void setVsl_pcall_cnt     ( String             vsl_pcall_cnt      ){    this.vsl_pcall_cnt      = vsl_pcall_cnt         ;    }
    public void setVsl_bulk_type     ( String             vsl_bulk_type      ){    this.vsl_bulk_type      = vsl_bulk_type         ;    }
    public void setVsl_del_dt        ( String             vsl_del_dt         ){    this.vsl_del_dt         = vsl_del_dt            ;    }
    public void setVsl_bulk_size     ( String             vsl_bulk_size      ){    this.vsl_bulk_size      = vsl_bulk_size         ;    }
    public void setVsl_lloyd_no      ( String             vsl_lloyd_no       ){    this.vsl_lloyd_no       = vsl_lloyd_no          ;    }
    public void setVsl_height        ( String             vsl_height         ){    this.vsl_height         = vsl_height            ;    }
    public void setVsl_regist_dt     ( String             vsl_regist_dt      ){    this.vsl_regist_dt      = vsl_regist_dt         ;    }
    public void setVsl_radar_tp      ( String             vsl_radar_tp       ){    this.vsl_radar_tp       = vsl_radar_tp          ;    }
    public void setVsl_spare_pro     ( String             vsl_spare_pro      ){    this.vsl_spare_pro      = vsl_spare_pro         ;    }
    public void setVsl_spare_anc     ( String             vsl_spare_anc      ){    this.vsl_spare_anc      = vsl_spare_anc         ;    }
    public void setVsl_hold_no       ( String             vsl_hold_no        ){    this.vsl_hold_no        = vsl_hold_no           ;    }
    public void setVsl_hatch_no      ( String             vsl_hatch_no       ){    this.vsl_hatch_no       = vsl_hatch_no          ;    }
    public void setVsl_cgo_gear      ( String             vsl_cgo_gear       ){    this.vsl_cgo_gear       = vsl_cgo_gear          ;    }
    public void setVsl_edi_nm        ( String             vsl_edi_nm         ){    this.vsl_edi_nm         = vsl_edi_nm            ;    }
    public void setVsl_comp_ind      ( String             vsl_comp_ind       ){    this.vsl_comp_ind       = vsl_comp_ind          ;    }
    public void setVsl_crt_dt        ( String             vsl_crt_dt         ){    this.vsl_crt_dt         = vsl_crt_dt            ;    }
    public void setVsl_crt_id        ( String             vsl_crt_id         ){    this.vsl_crt_id         = vsl_crt_id            ;    }
    public void setVsl_udt_dt        ( String             vsl_udt_dt         ){    this.vsl_udt_dt         = vsl_udt_dt            ;    }
    public void setVsl_udt_id        ( String             vsl_udt_id         ){    this.vsl_udt_id         = vsl_udt_id            ;    }
    public void setVsl_sfc_dt        ( String             vsl_sfc_dt         ){    this.vsl_sfc_dt         = vsl_sfc_dt            ;    }
    public void setVsl_sfr_dt        ( String             vsl_sfr_dt         ){    this.vsl_sfr_dt         = vsl_sfr_dt            ;    }
    public void setVsl_sfe_dt        ( String             vsl_sfe_dt         ){    this.vsl_sfe_dt         = vsl_sfe_dt            ;    }
    public void setVsl_ll_dt         ( String             vsl_ll_dt          ){    this.vsl_ll_dt          = vsl_ll_dt             ;    }
    public void setVsl_dr_dt         ( String             vsl_dr_dt          ){    this.vsl_dr_dt          = vsl_dr_dt             ;    }
    public void setVsl_crt_ofc       ( String             vsl_crt_ofc        ){    this.vsl_crt_ofc        = vsl_crt_ofc           ;    }
    public void setVsl_del_ofc       ( String             vsl_del_ofc        ){    this.vsl_del_ofc        = vsl_del_ofc           ;    }
    public void setNis_event_dt      ( String             nis_event_dt       ){    this.nis_event_dt       = nis_event_dt          ;    }
    public void setVsl_pas_job       ( String             vsl_pas_job        ){    this.vsl_pas_job        = vsl_pas_job           ;    }
    public void setVsl_pas_vamt      ( String             vsl_pas_vamt       ){    this.vsl_pas_vamt       = vsl_pas_vamt          ;    }
    public void setVsl_pas_oc        ( String             vsl_pas_oc         ){    this.vsl_pas_oc         = vsl_pas_oc            ;    }
    public void setVsl_pas_bulk_biz  ( String             vsl_pas_bulk_biz   ){    this.vsl_pas_bulk_biz   = vsl_pas_bulk_biz      ;    }
    public void setVsl_pas_teu_cd    ( String             vsl_pas_teu_cd     ){    this.vsl_pas_teu_cd     = vsl_pas_teu_cd        ;    }
    public void setTre_rsn_cntr      ( String             tre_rsn_cntr       ){    this.tre_rsn_cntr       = tre_rsn_cntr          ;    }
    public void setVsl_tariff_size   ( String             vsl_tariff_size    ){    this.vsl_tariff_size    = vsl_tariff_size       ;    }
    public void setVsl_oop_cd1       ( String             vsl_oop_cd1        ){    this.vsl_oop_cd1        = vsl_oop_cd1           ;    }
    public void setVsl_oop_cd2       ( String             vsl_oop_cd2        ){    this.vsl_oop_cd2        = vsl_oop_cd2           ;    }
    public void setVsl_oop_cd3       ( String             vsl_oop_cd3        ){    this.vsl_oop_cd3        = vsl_oop_cd3           ;    }
    public void setVsl_build_loc     ( String             vsl_build_loc      ){    this.vsl_build_loc      = vsl_build_loc         ;    }
    public void setVsl_nrt_itc       ( String             vsl_nrt_itc        ){    this.vsl_nrt_itc        = vsl_nrt_itc           ;    }

    public static VSL fromRequest(HttpServletRequest request) {
        VSL model = new VSL();
        try {
            model.setIbflag                (JSPUtil.getParameter(request, "ibflag                    ".trim(), ""));
            model.setPage_rows             (JSPUtil.getParameter(request, "page_rows                 ".trim(), ""));
            model.setVsl_cd                (JSPUtil.getParameter(request, "vsl_cd                    ".trim(), ""));
            model.setVsl_eng_nm            (JSPUtil.getParameter(request, "vsl_eng_nm                ".trim(), ""));
            model.setVsl_type_cd           (JSPUtil.getParameter(request, "vsl_type_cd               ".trim(), ""));
            model.setVsl_new_built_ind     (JSPUtil.getParameter(request, "vsl_new_built_ind         ".trim(), ""));
            model.setVsl_owned_ind         (JSPUtil.getParameter(request, "vsl_owned_ind             ".trim(), ""));
            model.setCar_cd                (JSPUtil.getParameter(request, "car_cd                    ".trim(), ""));
            model.setVsl_car_vsl_cd        (JSPUtil.getParameter(request, "vsl_car_vsl_cd            ".trim(), ""));
            model.setVsl_svc_spd           (JSPUtil.getParameter(request, "vsl_svc_spd               ".trim(), ""));
            model.setVsl_max_spd           (JSPUtil.getParameter(request, "vsl_max_spd               ".trim(), ""));
            model.setVsl_eco_spd           (JSPUtil.getParameter(request, "vsl_eco_spd               ".trim(), ""));
            model.setVsl_crew              (JSPUtil.getParameter(request, "vsl_crew                  ".trim(), ""));
            model.setVsl_cntr_capa_d       (JSPUtil.getParameter(request, "vsl_cntr_capa_d           ".trim(), ""));
            model.setVsl_cntr_capa_o       (JSPUtil.getParameter(request, "vsl_cntr_capa_o           ".trim(), ""));
            model.setVsl_cntr_capa_p       (JSPUtil.getParameter(request, "vsl_cntr_capa_p           ".trim(), ""));
            model.setVsl_cgo_capa_grain    (JSPUtil.getParameter(request, "vsl_cgo_capa_grain        ".trim(), ""));
            model.setVsl_cgo_capa_bail     (JSPUtil.getParameter(request, "vsl_cgo_capa_bail         ".trim(), ""));
            model.setVsl_cgo_capa_tank     (JSPUtil.getParameter(request, "vsl_cgo_capa_tank         ".trim(), ""));
            model.setVsl_teu_cd            (JSPUtil.getParameter(request, "vsl_teu_cd                ".trim(), ""));
            model.setVsl_rf_recept_qty     (JSPUtil.getParameter(request, "vsl_rf_recept_qty         ".trim(), ""));
            model.setVsl_rf_recept_max     (JSPUtil.getParameter(request, "vsl_rf_recept_max         ".trim(), ""));
            model.setVsl_call_sign         (JSPUtil.getParameter(request, "vsl_call_sign             ".trim(), ""));
            model.setVsl_offcl_no          (JSPUtil.getParameter(request, "vsl_offcl_no              ".trim(), ""));
            model.setVsl_immar_id1         (JSPUtil.getParameter(request, "vsl_immar_id1             ".trim(), ""));
            model.setVsl_immar_id2         (JSPUtil.getParameter(request, "vsl_immar_id2             ".trim(), ""));
            model.setVsl_immar_id3         (JSPUtil.getParameter(request, "vsl_immar_id3             ".trim(), ""));
            model.setVsl_regn_port         (JSPUtil.getParameter(request, "vsl_regn_port             ".trim(), ""));
            model.setVsl_flag              (JSPUtil.getParameter(request, "vsl_flag                  ".trim(), ""));
            model.setVsl_class             (JSPUtil.getParameter(request, "vsl_class                 ".trim(), ""));
            model.setVsl_class_no          (JSPUtil.getParameter(request, "vsl_class_no              ".trim(), ""));
            model.setVsl_builder           (JSPUtil.getParameter(request, "vsl_builder               ".trim(), ""));
            model.setVsl_launched_dt       (JSPUtil.getParameter(request, "vsl_launched_dt           ".trim(), ""));
            model.setVsl_delevered_dt      (JSPUtil.getParameter(request, "vsl_delevered_dt          ".trim(), ""));
            model.setVsl_kell_laid         (JSPUtil.getParameter(request, "vsl_kell_laid             ".trim(), ""));
            model.setVsl_close_dt          (JSPUtil.getParameter(request, "vsl_close_dt              ".trim(), ""));
            model.setVsl_hull_no           (JSPUtil.getParameter(request, "vsl_hull_no               ".trim(), ""));
            model.setVsl_loa               (JSPUtil.getParameter(request, "vsl_loa                   ".trim(), ""));
            model.setVsl_lbp               (JSPUtil.getParameter(request, "vsl_lbp                   ".trim(), ""));
            model.setVsl_breadth           (JSPUtil.getParameter(request, "vsl_breadth               ".trim(), ""));
            model.setVsl_depth             (JSPUtil.getParameter(request, "vsl_depth                 ".trim(), ""));
            model.setVsl_draft             (JSPUtil.getParameter(request, "vsl_draft                 ".trim(), ""));
            model.setVsl_freeboard         (JSPUtil.getParameter(request, "vsl_freeboard             ".trim(), ""));
            model.setVsl_displace          (JSPUtil.getParameter(request, "vsl_displace              ".trim(), ""));
            model.setVsl_dead_wt           (JSPUtil.getParameter(request, "vsl_dead_wt               ".trim(), ""));
            model.setVsl_light_ship        (JSPUtil.getParameter(request, "vsl_light_ship            ".trim(), ""));
            model.setVsl_grt               (JSPUtil.getParameter(request, "vsl_grt                   ".trim(), ""));
            model.setVsl_nrt               (JSPUtil.getParameter(request, "vsl_nrt                   ".trim(), ""));
            model.setVsl_panama_grt        (JSPUtil.getParameter(request, "vsl_panama_grt            ".trim(), ""));
            model.setVsl_panama_nrt        (JSPUtil.getParameter(request, "vsl_panama_nrt            ".trim(), ""));
            model.setVsl_suez_grt          (JSPUtil.getParameter(request, "vsl_suez_grt              ".trim(), ""));
            model.setVsl_suez_nrt          (JSPUtil.getParameter(request, "vsl_suez_nrt              ".trim(), ""));
            model.setVsl_fo_capa           (JSPUtil.getParameter(request, "vsl_fo_capa               ".trim(), ""));
            model.setVsl_do_capa           (JSPUtil.getParameter(request, "vsl_do_capa               ".trim(), ""));
            model.setVsl_fw_capa           (JSPUtil.getParameter(request, "vsl_fw_capa               ".trim(), ""));
            model.setVsl_ballas_capa       (JSPUtil.getParameter(request, "vsl_ballas_capa           ".trim(), ""));
            model.setVsl_fo_consumpt       (JSPUtil.getParameter(request, "vsl_fo_consumpt           ".trim(), ""));
            model.setVsl_do_consumpt       (JSPUtil.getParameter(request, "vsl_do_consumpt           ".trim(), ""));
            model.setVsl_fw_consumpt       (JSPUtil.getParameter(request, "vsl_fw_consumpt           ".trim(), ""));
            model.setVsl_main_maker        (JSPUtil.getParameter(request, "vsl_main_maker            ".trim(), ""));
            model.setVsl_main_type         (JSPUtil.getParameter(request, "vsl_main_type             ".trim(), ""));
            model.setVsl_main_bhp          (JSPUtil.getParameter(request, "vsl_main_bhp              ".trim(), ""));
            model.setVsl_main_rpm          (JSPUtil.getParameter(request, "vsl_main_rpm              ".trim(), ""));
            model.setVsl_gen_maker         (JSPUtil.getParameter(request, "vsl_gen_maker             ".trim(), ""));
            model.setVsl_gen_type          (JSPUtil.getParameter(request, "vsl_gen_type              ".trim(), ""));
            model.setVsl_gen_bhp           (JSPUtil.getParameter(request, "vsl_gen_bhp               ".trim(), ""));
            model.setVsl_gen_rpm           (JSPUtil.getParameter(request, "vsl_gen_rpm               ".trim(), ""));
            model.setVsl_bow_maker         (JSPUtil.getParameter(request, "vsl_bow_maker             ".trim(), ""));
            model.setVsl_bow_type          (JSPUtil.getParameter(request, "vsl_bow_type              ".trim(), ""));
            model.setVsl_bow_bhp           (JSPUtil.getParameter(request, "vsl_bow_bhp               ".trim(), ""));
            model.setVsl_bow_rpm           (JSPUtil.getParameter(request, "vsl_bow_rpm               ".trim(), ""));
            model.setVsl_kor_nm            (JSPUtil.getParameter(request, "vsl_kor_nm                ".trim(), ""));
            model.setVsl_del_mk            (JSPUtil.getParameter(request, "vsl_del_mk                ".trim(), ""));
            model.setVsl_fdr_ind           (JSPUtil.getParameter(request, "vsl_fdr_ind               ".trim(), ""));
            model.setVsl_lane_cd           (JSPUtil.getParameter(request, "vsl_lane_cd               ".trim(), ""));
            model.setVsl_conv_div          (JSPUtil.getParameter(request, "vsl_conv_div              ".trim(), ""));
            model.setVsl_pcall_cnt         (JSPUtil.getParameter(request, "vsl_pcall_cnt             ".trim(), ""));
            model.setVsl_bulk_type         (JSPUtil.getParameter(request, "vsl_bulk_type             ".trim(), ""));
            model.setVsl_del_dt            (JSPUtil.getParameter(request, "vsl_del_dt                ".trim(), ""));
            model.setVsl_bulk_size         (JSPUtil.getParameter(request, "vsl_bulk_size             ".trim(), ""));
            model.setVsl_lloyd_no          (JSPUtil.getParameter(request, "vsl_lloyd_no              ".trim(), ""));
            model.setVsl_height            (JSPUtil.getParameter(request, "vsl_height                ".trim(), ""));
            model.setVsl_regist_dt         (JSPUtil.getParameter(request, "vsl_regist_dt             ".trim(), ""));
            model.setVsl_radar_tp          (JSPUtil.getParameter(request, "vsl_radar_tp              ".trim(), ""));
            model.setVsl_spare_pro         (JSPUtil.getParameter(request, "vsl_spare_pro             ".trim(), ""));
            model.setVsl_spare_anc         (JSPUtil.getParameter(request, "vsl_spare_anc             ".trim(), ""));
            model.setVsl_hold_no           (JSPUtil.getParameter(request, "vsl_hold_no               ".trim(), ""));
            model.setVsl_hatch_no          (JSPUtil.getParameter(request, "vsl_hatch_no              ".trim(), ""));
            model.setVsl_cgo_gear          (JSPUtil.getParameter(request, "vsl_cgo_gear              ".trim(), ""));
            model.setVsl_edi_nm            (JSPUtil.getParameter(request, "vsl_edi_nm                ".trim(), ""));
            model.setVsl_comp_ind          (JSPUtil.getParameter(request, "vsl_comp_ind              ".trim(), ""));
            model.setVsl_crt_dt            (JSPUtil.getParameter(request, "vsl_crt_dt                ".trim(), ""));
            model.setVsl_crt_id            (JSPUtil.getParameter(request, "vsl_crt_id                ".trim(), ""));
            model.setVsl_udt_dt            (JSPUtil.getParameter(request, "vsl_udt_dt                ".trim(), ""));
            model.setVsl_udt_id            (JSPUtil.getParameter(request, "vsl_udt_id                ".trim(), ""));
            model.setVsl_sfc_dt            (JSPUtil.getParameter(request, "vsl_sfc_dt                ".trim(), ""));
            model.setVsl_sfr_dt            (JSPUtil.getParameter(request, "vsl_sfr_dt                ".trim(), ""));
            model.setVsl_sfe_dt            (JSPUtil.getParameter(request, "vsl_sfe_dt                ".trim(), ""));
            model.setVsl_ll_dt             (JSPUtil.getParameter(request, "vsl_ll_dt                 ".trim(), ""));
            model.setVsl_dr_dt             (JSPUtil.getParameter(request, "vsl_dr_dt                 ".trim(), ""));
            model.setVsl_crt_ofc           (JSPUtil.getParameter(request, "vsl_crt_ofc               ".trim(), ""));
            model.setVsl_del_ofc           (JSPUtil.getParameter(request, "vsl_del_ofc               ".trim(), ""));
            model.setNis_event_dt          (JSPUtil.getParameter(request, "nis_event_dt              ".trim(), ""));
            model.setVsl_pas_job           (JSPUtil.getParameter(request, "vsl_pas_job               ".trim(), ""));
            model.setVsl_pas_vamt          (JSPUtil.getParameter(request, "vsl_pas_vamt              ".trim(), ""));
            model.setVsl_pas_oc            (JSPUtil.getParameter(request, "vsl_pas_oc                ".trim(), ""));
            model.setVsl_pas_bulk_biz      (JSPUtil.getParameter(request, "vsl_pas_bulk_biz          ".trim(), ""));
            model.setVsl_pas_teu_cd        (JSPUtil.getParameter(request, "vsl_pas_teu_cd            ".trim(), ""));
            model.setTre_rsn_cntr          (JSPUtil.getParameter(request, "tre_rsn_cntr              ".trim(), ""));
            model.setVsl_tariff_size       (JSPUtil.getParameter(request, "vsl_tariff_size           ".trim(), ""));
            model.setVsl_oop_cd1           (JSPUtil.getParameter(request, "vsl_oop_cd1               ".trim(), ""));
            model.setVsl_oop_cd2           (JSPUtil.getParameter(request, "vsl_oop_cd2               ".trim(), ""));
            model.setVsl_oop_cd3           (JSPUtil.getParameter(request, "vsl_oop_cd3               ".trim(), ""));
            model.setVsl_build_loc         (JSPUtil.getParameter(request, "vsl_build_loc             ".trim(), ""));
            model.setVsl_nrt_itc           (JSPUtil.getParameter(request, "vsl_nrt_itc               ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        VSL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag                    ".trim(), length));
            String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows                 ".trim(), length));
            String[] vsl_cd             =  (JSPUtil.getParameter(request, "vsl_cd                    ".trim(), length));
            String[] vsl_eng_nm         =  (JSPUtil.getParameter(request, "vsl_eng_nm                ".trim(), length));
            String[] vsl_type_cd        =  (JSPUtil.getParameter(request, "vsl_type_cd               ".trim(), length));
            String[] vsl_new_built_ind  =  (JSPUtil.getParameter(request, "vsl_new_built_ind         ".trim(), length));
            String[] vsl_owned_ind      =  (JSPUtil.getParameter(request, "vsl_owned_ind             ".trim(), length));
            String[] car_cd             =  (JSPUtil.getParameter(request, "car_cd                    ".trim(), length));
            String[] vsl_car_vsl_cd     =  (JSPUtil.getParameter(request, "vsl_car_vsl_cd            ".trim(), length));
            String[] vsl_svc_spd        =  (JSPUtil.getParameter(request, "vsl_svc_spd               ".trim(), length));
            String[] vsl_max_spd        =  (JSPUtil.getParameter(request, "vsl_max_spd               ".trim(), length));
            String[] vsl_eco_spd        =  (JSPUtil.getParameter(request, "vsl_eco_spd               ".trim(), length));
            String[] vsl_crew           =  (JSPUtil.getParameter(request, "vsl_crew                  ".trim(), length));
            String[] vsl_cntr_capa_d    =  (JSPUtil.getParameter(request, "vsl_cntr_capa_d           ".trim(), length));
            String[] vsl_cntr_capa_o    =  (JSPUtil.getParameter(request, "vsl_cntr_capa_o           ".trim(), length));
            String[] vsl_cntr_capa_p    =  (JSPUtil.getParameter(request, "vsl_cntr_capa_p           ".trim(), length));
            String[] vsl_cgo_capa_grain =  (JSPUtil.getParameter(request, "vsl_cgo_capa_grain        ".trim(), length));
            String[] vsl_cgo_capa_bail  =  (JSPUtil.getParameter(request, "vsl_cgo_capa_bail         ".trim(), length));
            String[] vsl_cgo_capa_tank  =  (JSPUtil.getParameter(request, "vsl_cgo_capa_tank         ".trim(), length));
            String[] vsl_teu_cd         =  (JSPUtil.getParameter(request, "vsl_teu_cd                ".trim(), length));
            String[] vsl_rf_recept_qty  =  (JSPUtil.getParameter(request, "vsl_rf_recept_qty         ".trim(), length));
            String[] vsl_rf_recept_max  =  (JSPUtil.getParameter(request, "vsl_rf_recept_max         ".trim(), length));
            String[] vsl_call_sign      =  (JSPUtil.getParameter(request, "vsl_call_sign             ".trim(), length));
            String[] vsl_offcl_no       =  (JSPUtil.getParameter(request, "vsl_offcl_no              ".trim(), length));
            String[] vsl_immar_id1      =  (JSPUtil.getParameter(request, "vsl_immar_id1             ".trim(), length));
            String[] vsl_immar_id2      =  (JSPUtil.getParameter(request, "vsl_immar_id2             ".trim(), length));
            String[] vsl_immar_id3      =  (JSPUtil.getParameter(request, "vsl_immar_id3             ".trim(), length));
            String[] vsl_regn_port      =  (JSPUtil.getParameter(request, "vsl_regn_port             ".trim(), length));
            String[] vsl_flag           =  (JSPUtil.getParameter(request, "vsl_flag                  ".trim(), length));
            String[] vsl_class          =  (JSPUtil.getParameter(request, "vsl_class                 ".trim(), length));
            String[] vsl_class_no       =  (JSPUtil.getParameter(request, "vsl_class_no              ".trim(), length));
            String[] vsl_builder        =  (JSPUtil.getParameter(request, "vsl_builder               ".trim(), length));
            String[] vsl_launched_dt    =  (JSPUtil.getParameter(request, "vsl_launched_dt           ".trim(), length));
            String[] vsl_delevered_dt   =  (JSPUtil.getParameter(request, "vsl_delevered_dt          ".trim(), length));
            String[] vsl_kell_laid      =  (JSPUtil.getParameter(request, "vsl_kell_laid             ".trim(), length));
            String[] vsl_close_dt       =  (JSPUtil.getParameter(request, "vsl_close_dt              ".trim(), length));
            String[] vsl_hull_no        =  (JSPUtil.getParameter(request, "vsl_hull_no               ".trim(), length));
            String[] vsl_loa            =  (JSPUtil.getParameter(request, "vsl_loa                   ".trim(), length));
            String[] vsl_lbp            =  (JSPUtil.getParameter(request, "vsl_lbp                   ".trim(), length));
            String[] vsl_breadth        =  (JSPUtil.getParameter(request, "vsl_breadth               ".trim(), length));
            String[] vsl_depth          =  (JSPUtil.getParameter(request, "vsl_depth                 ".trim(), length));
            String[] vsl_draft          =  (JSPUtil.getParameter(request, "vsl_draft                 ".trim(), length));
            String[] vsl_freeboard      =  (JSPUtil.getParameter(request, "vsl_freeboard             ".trim(), length));
            String[] vsl_displace       =  (JSPUtil.getParameter(request, "vsl_displace              ".trim(), length));
            String[] vsl_dead_wt        =  (JSPUtil.getParameter(request, "vsl_dead_wt               ".trim(), length));
            String[] vsl_light_ship     =  (JSPUtil.getParameter(request, "vsl_light_ship            ".trim(), length));
            String[] vsl_grt            =  (JSPUtil.getParameter(request, "vsl_grt                   ".trim(), length));
            String[] vsl_nrt            =  (JSPUtil.getParameter(request, "vsl_nrt                   ".trim(), length));
            String[] vsl_panama_grt     =  (JSPUtil.getParameter(request, "vsl_panama_grt            ".trim(), length));
            String[] vsl_panama_nrt     =  (JSPUtil.getParameter(request, "vsl_panama_nrt            ".trim(), length));
            String[] vsl_suez_grt       =  (JSPUtil.getParameter(request, "vsl_suez_grt              ".trim(), length));
            String[] vsl_suez_nrt       =  (JSPUtil.getParameter(request, "vsl_suez_nrt              ".trim(), length));
            String[] vsl_fo_capa        =  (JSPUtil.getParameter(request, "vsl_fo_capa               ".trim(), length));
            String[] vsl_do_capa        =  (JSPUtil.getParameter(request, "vsl_do_capa               ".trim(), length));
            String[] vsl_fw_capa        =  (JSPUtil.getParameter(request, "vsl_fw_capa               ".trim(), length));
            String[] vsl_ballas_capa    =  (JSPUtil.getParameter(request, "vsl_ballas_capa           ".trim(), length));
            String[] vsl_fo_consumpt    =  (JSPUtil.getParameter(request, "vsl_fo_consumpt           ".trim(), length));
            String[] vsl_do_consumpt    =  (JSPUtil.getParameter(request, "vsl_do_consumpt           ".trim(), length));
            String[] vsl_fw_consumpt    =  (JSPUtil.getParameter(request, "vsl_fw_consumpt           ".trim(), length));
            String[] vsl_main_maker     =  (JSPUtil.getParameter(request, "vsl_main_maker            ".trim(), length));
            String[] vsl_main_type      =  (JSPUtil.getParameter(request, "vsl_main_type             ".trim(), length));
            String[] vsl_main_bhp       =  (JSPUtil.getParameter(request, "vsl_main_bhp              ".trim(), length));
            String[] vsl_main_rpm       =  (JSPUtil.getParameter(request, "vsl_main_rpm              ".trim(), length));
            String[] vsl_gen_maker      =  (JSPUtil.getParameter(request, "vsl_gen_maker             ".trim(), length));
            String[] vsl_gen_type       =  (JSPUtil.getParameter(request, "vsl_gen_type              ".trim(), length));
            String[] vsl_gen_bhp        =  (JSPUtil.getParameter(request, "vsl_gen_bhp               ".trim(), length));
            String[] vsl_gen_rpm        =  (JSPUtil.getParameter(request, "vsl_gen_rpm               ".trim(), length));
            String[] vsl_bow_maker      =  (JSPUtil.getParameter(request, "vsl_bow_maker             ".trim(), length));
            String[] vsl_bow_type       =  (JSPUtil.getParameter(request, "vsl_bow_type              ".trim(), length));
            String[] vsl_bow_bhp        =  (JSPUtil.getParameter(request, "vsl_bow_bhp               ".trim(), length));
            String[] vsl_bow_rpm        =  (JSPUtil.getParameter(request, "vsl_bow_rpm               ".trim(), length));
            String[] vsl_kor_nm         =  (JSPUtil.getParameter(request, "vsl_kor_nm                ".trim(), length));
            String[] vsl_del_mk         =  (JSPUtil.getParameter(request, "vsl_del_mk                ".trim(), length));
            String[] vsl_fdr_ind        =  (JSPUtil.getParameter(request, "vsl_fdr_ind               ".trim(), length));
            String[] vsl_lane_cd        =  (JSPUtil.getParameter(request, "vsl_lane_cd               ".trim(), length));
            String[] vsl_conv_div       =  (JSPUtil.getParameter(request, "vsl_conv_div              ".trim(), length));
            String[] vsl_pcall_cnt      =  (JSPUtil.getParameter(request, "vsl_pcall_cnt             ".trim(), length));
            String[] vsl_bulk_type      =  (JSPUtil.getParameter(request, "vsl_bulk_type             ".trim(), length));
            String[] vsl_del_dt         =  (JSPUtil.getParameter(request, "vsl_del_dt                ".trim(), length));
            String[] vsl_bulk_size      =  (JSPUtil.getParameter(request, "vsl_bulk_size             ".trim(), length));
            String[] vsl_lloyd_no       =  (JSPUtil.getParameter(request, "vsl_lloyd_no              ".trim(), length));
            String[] vsl_height         =  (JSPUtil.getParameter(request, "vsl_height                ".trim(), length));
            String[] vsl_regist_dt      =  (JSPUtil.getParameter(request, "vsl_regist_dt             ".trim(), length));
            String[] vsl_radar_tp       =  (JSPUtil.getParameter(request, "vsl_radar_tp              ".trim(), length));
            String[] vsl_spare_pro      =  (JSPUtil.getParameter(request, "vsl_spare_pro             ".trim(), length));
            String[] vsl_spare_anc      =  (JSPUtil.getParameter(request, "vsl_spare_anc             ".trim(), length));
            String[] vsl_hold_no        =  (JSPUtil.getParameter(request, "vsl_hold_no               ".trim(), length));
            String[] vsl_hatch_no       =  (JSPUtil.getParameter(request, "vsl_hatch_no              ".trim(), length));
            String[] vsl_cgo_gear       =  (JSPUtil.getParameter(request, "vsl_cgo_gear              ".trim(), length));
            String[] vsl_edi_nm         =  (JSPUtil.getParameter(request, "vsl_edi_nm                ".trim(), length));
            String[] vsl_comp_ind       =  (JSPUtil.getParameter(request, "vsl_comp_ind              ".trim(), length));
            String[] vsl_crt_dt         =  (JSPUtil.getParameter(request, "vsl_crt_dt                ".trim(), length));
            String[] vsl_crt_id         =  (JSPUtil.getParameter(request, "vsl_crt_id                ".trim(), length));
            String[] vsl_udt_dt         =  (JSPUtil.getParameter(request, "vsl_udt_dt                ".trim(), length));
            String[] vsl_udt_id         =  (JSPUtil.getParameter(request, "vsl_udt_id                ".trim(), length));
            String[] vsl_sfc_dt         =  (JSPUtil.getParameter(request, "vsl_sfc_dt                ".trim(), length));
            String[] vsl_sfr_dt         =  (JSPUtil.getParameter(request, "vsl_sfr_dt                ".trim(), length));
            String[] vsl_sfe_dt         =  (JSPUtil.getParameter(request, "vsl_sfe_dt                ".trim(), length));
            String[] vsl_ll_dt          =  (JSPUtil.getParameter(request, "vsl_ll_dt                 ".trim(), length));
            String[] vsl_dr_dt          =  (JSPUtil.getParameter(request, "vsl_dr_dt                 ".trim(), length));
            String[] vsl_crt_ofc        =  (JSPUtil.getParameter(request, "vsl_crt_ofc               ".trim(), length));
            String[] vsl_del_ofc        =  (JSPUtil.getParameter(request, "vsl_del_ofc               ".trim(), length));
            String[] nis_event_dt       =  (JSPUtil.getParameter(request, "nis_event_dt              ".trim(), length));
            String[] vsl_pas_job        =  (JSPUtil.getParameter(request, "vsl_pas_job               ".trim(), length));
            String[] vsl_pas_vamt       =  (JSPUtil.getParameter(request, "vsl_pas_vamt              ".trim(), length));
            String[] vsl_pas_oc         =  (JSPUtil.getParameter(request, "vsl_pas_oc                ".trim(), length));
            String[] vsl_pas_bulk_biz   =  (JSPUtil.getParameter(request, "vsl_pas_bulk_biz          ".trim(), length));
            String[] vsl_pas_teu_cd     =  (JSPUtil.getParameter(request, "vsl_pas_teu_cd            ".trim(), length));
            String[] tre_rsn_cntr       =  (JSPUtil.getParameter(request, "tre_rsn_cntr              ".trim(), length));
            String[] vsl_tariff_size    =  (JSPUtil.getParameter(request, "vsl_tariff_size           ".trim(), length));
            String[] vsl_oop_cd1        =  (JSPUtil.getParameter(request, "vsl_oop_cd1               ".trim(), length));
            String[] vsl_oop_cd2        =  (JSPUtil.getParameter(request, "vsl_oop_cd2               ".trim(), length));
            String[] vsl_oop_cd3        =  (JSPUtil.getParameter(request, "vsl_oop_cd3               ".trim(), length));
            String[] vsl_build_loc      =  (JSPUtil.getParameter(request, "vsl_build_loc             ".trim(), length));
            String[] vsl_nrt_itc        =  (JSPUtil.getParameter(request, "vsl_nrt_itc               ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL();
                model.setIbflag                      (ibflag                [i]);
                model.setPage_rows                   (page_rows             [i]);
                model.setVsl_cd                      (vsl_cd                [i]);
                model.setVsl_eng_nm                  (vsl_eng_nm            [i]);
                model.setVsl_type_cd                 (vsl_type_cd           [i]);
                model.setVsl_new_built_ind           (vsl_new_built_ind     [i]);
                model.setVsl_owned_ind               (vsl_owned_ind         [i]);
                model.setCar_cd                      (car_cd                [i]);
                model.setVsl_car_vsl_cd              (vsl_car_vsl_cd        [i]);
                model.setVsl_svc_spd                 (vsl_svc_spd           [i]);
                model.setVsl_max_spd                 (vsl_max_spd           [i]);
                model.setVsl_eco_spd                 (vsl_eco_spd           [i]);
                model.setVsl_crew                    (vsl_crew              [i]);
                model.setVsl_cntr_capa_d             (vsl_cntr_capa_d       [i]);
                model.setVsl_cntr_capa_o             (vsl_cntr_capa_o       [i]);
                model.setVsl_cntr_capa_p             (vsl_cntr_capa_p       [i]);
                model.setVsl_cgo_capa_grain          (vsl_cgo_capa_grain    [i]);
                model.setVsl_cgo_capa_bail           (vsl_cgo_capa_bail     [i]);
                model.setVsl_cgo_capa_tank           (vsl_cgo_capa_tank     [i]);
                model.setVsl_teu_cd                  (vsl_teu_cd            [i]);
                model.setVsl_rf_recept_qty           (vsl_rf_recept_qty     [i]);
                model.setVsl_rf_recept_max           (vsl_rf_recept_max     [i]);
                model.setVsl_call_sign               (vsl_call_sign         [i]);
                model.setVsl_offcl_no                (vsl_offcl_no          [i]);
                model.setVsl_immar_id1               (vsl_immar_id1         [i]);
                model.setVsl_immar_id2               (vsl_immar_id2         [i]);
                model.setVsl_immar_id3               (vsl_immar_id3         [i]);
                model.setVsl_regn_port               (vsl_regn_port         [i]);
                model.setVsl_flag                    (vsl_flag              [i]);
                model.setVsl_class                   (vsl_class             [i]);
                model.setVsl_class_no                (vsl_class_no          [i]);
                model.setVsl_builder                 (vsl_builder           [i]);
                model.setVsl_launched_dt             (vsl_launched_dt       [i]);
                model.setVsl_delevered_dt            (vsl_delevered_dt      [i]);
                model.setVsl_kell_laid               (vsl_kell_laid         [i]);
                model.setVsl_close_dt                (vsl_close_dt          [i]);
                model.setVsl_hull_no                 (vsl_hull_no           [i]);
                model.setVsl_loa                     (vsl_loa               [i]);
                model.setVsl_lbp                     (vsl_lbp               [i]);
                model.setVsl_breadth                 (vsl_breadth           [i]);
                model.setVsl_depth                   (vsl_depth             [i]);
                model.setVsl_draft                   (vsl_draft             [i]);
                model.setVsl_freeboard               (vsl_freeboard         [i]);
                model.setVsl_displace                (vsl_displace          [i]);
                model.setVsl_dead_wt                 (vsl_dead_wt           [i]);
                model.setVsl_light_ship              (vsl_light_ship        [i]);
                model.setVsl_grt                     (vsl_grt               [i]);
                model.setVsl_nrt                     (vsl_nrt               [i]);
                model.setVsl_panama_grt              (vsl_panama_grt        [i]);
                model.setVsl_panama_nrt              (vsl_panama_nrt        [i]);
                model.setVsl_suez_grt                (vsl_suez_grt          [i]);
                model.setVsl_suez_nrt                (vsl_suez_nrt          [i]);
                model.setVsl_fo_capa                 (vsl_fo_capa           [i]);
                model.setVsl_do_capa                 (vsl_do_capa           [i]);
                model.setVsl_fw_capa                 (vsl_fw_capa           [i]);
                model.setVsl_ballas_capa             (vsl_ballas_capa       [i]);
                model.setVsl_fo_consumpt             (vsl_fo_consumpt       [i]);
                model.setVsl_do_consumpt             (vsl_do_consumpt       [i]);
                model.setVsl_fw_consumpt             (vsl_fw_consumpt       [i]);
                model.setVsl_main_maker              (vsl_main_maker        [i]);
                model.setVsl_main_type               (vsl_main_type         [i]);
                model.setVsl_main_bhp                (vsl_main_bhp          [i]);
                model.setVsl_main_rpm                (vsl_main_rpm          [i]);
                model.setVsl_gen_maker               (vsl_gen_maker         [i]);
                model.setVsl_gen_type                (vsl_gen_type          [i]);
                model.setVsl_gen_bhp                 (vsl_gen_bhp           [i]);
                model.setVsl_gen_rpm                 (vsl_gen_rpm           [i]);
                model.setVsl_bow_maker               (vsl_bow_maker         [i]);
                model.setVsl_bow_type                (vsl_bow_type          [i]);
                model.setVsl_bow_bhp                 (vsl_bow_bhp           [i]);
                model.setVsl_bow_rpm                 (vsl_bow_rpm           [i]);
                model.setVsl_kor_nm                  (vsl_kor_nm            [i]);
                model.setVsl_del_mk                  (vsl_del_mk            [i]);
                model.setVsl_fdr_ind                 (vsl_fdr_ind           [i]);
                model.setVsl_lane_cd                 (vsl_lane_cd           [i]);
                model.setVsl_conv_div                (vsl_conv_div          [i]);
                model.setVsl_pcall_cnt               (vsl_pcall_cnt         [i]);
                model.setVsl_bulk_type               (vsl_bulk_type         [i]);
                model.setVsl_del_dt                  (vsl_del_dt            [i]);
                model.setVsl_bulk_size               (vsl_bulk_size         [i]);
                model.setVsl_lloyd_no                (vsl_lloyd_no          [i]);
                model.setVsl_height                  (vsl_height            [i]);
                model.setVsl_regist_dt               (vsl_regist_dt         [i]);
                model.setVsl_radar_tp                (vsl_radar_tp          [i]);
                model.setVsl_spare_pro               (vsl_spare_pro         [i]);
                model.setVsl_spare_anc               (vsl_spare_anc         [i]);
                model.setVsl_hold_no                 (vsl_hold_no           [i]);
                model.setVsl_hatch_no                (vsl_hatch_no          [i]);
                model.setVsl_cgo_gear                (vsl_cgo_gear          [i]);
                model.setVsl_edi_nm                  (vsl_edi_nm            [i]);
                model.setVsl_comp_ind                (vsl_comp_ind          [i]);
                model.setVsl_crt_dt                  (vsl_crt_dt            [i]);
                model.setVsl_crt_id                  (vsl_crt_id            [i]);
                model.setVsl_udt_dt                  (vsl_udt_dt            [i]);
                model.setVsl_udt_id                  (vsl_udt_id            [i]);
                model.setVsl_sfc_dt                  (vsl_sfc_dt            [i]);
                model.setVsl_sfr_dt                  (vsl_sfr_dt            [i]);
                model.setVsl_sfe_dt                  (vsl_sfe_dt            [i]);
                model.setVsl_ll_dt                   (vsl_ll_dt             [i]);
                model.setVsl_dr_dt                   (vsl_dr_dt             [i]);
                model.setVsl_crt_ofc                 (vsl_crt_ofc           [i]);
                model.setVsl_del_ofc                 (vsl_del_ofc           [i]);
                model.setNis_event_dt                (nis_event_dt          [i]);
                model.setVsl_pas_job                 (vsl_pas_job           [i]);
                model.setVsl_pas_vamt                (vsl_pas_vamt          [i]);
                model.setVsl_pas_oc                  (vsl_pas_oc            [i]);
                model.setVsl_pas_bulk_biz            (vsl_pas_bulk_biz      [i]);
                model.setVsl_pas_teu_cd              (vsl_pas_teu_cd        [i]);
                model.setTre_rsn_cntr                (tre_rsn_cntr          [i]);
                model.setVsl_tariff_size             (vsl_tariff_size       [i]);
                model.setVsl_oop_cd1                 (vsl_oop_cd1           [i]);
                model.setVsl_oop_cd2                 (vsl_oop_cd2           [i]);
                model.setVsl_oop_cd3                 (vsl_oop_cd3           [i]);
                model.setVsl_build_loc               (vsl_build_loc         [i]);
                model.setVsl_nrt_itc                 (vsl_nrt_itc           [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        VSL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag                    ".trim(), length));
            String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows                 ".trim(), length));
            String[] vsl_cd             =  (JSPUtil.getParameter(request, prefix + "vsl_cd                    ".trim(), length));
            String[] vsl_eng_nm         =  (JSPUtil.getParameter(request, prefix + "vsl_eng_nm                ".trim(), length));
            String[] vsl_type_cd        =  (JSPUtil.getParameter(request, prefix + "vsl_type_cd               ".trim(), length));
            String[] vsl_new_built_ind  =  (JSPUtil.getParameter(request, prefix + "vsl_new_built_ind         ".trim(), length));
            String[] vsl_owned_ind      =  (JSPUtil.getParameter(request, prefix + "vsl_owned_ind             ".trim(), length));
            String[] car_cd             =  (JSPUtil.getParameter(request, prefix + "car_cd                    ".trim(), length));
            String[] vsl_car_vsl_cd     =  (JSPUtil.getParameter(request, prefix + "vsl_car_vsl_cd            ".trim(), length));
            String[] vsl_svc_spd        =  (JSPUtil.getParameter(request, prefix + "vsl_svc_spd               ".trim(), length));
            String[] vsl_max_spd        =  (JSPUtil.getParameter(request, prefix + "vsl_max_spd               ".trim(), length));
            String[] vsl_eco_spd        =  (JSPUtil.getParameter(request, prefix + "vsl_eco_spd               ".trim(), length));
            String[] vsl_crew           =  (JSPUtil.getParameter(request, prefix + "vsl_crew                  ".trim(), length));
            String[] vsl_cntr_capa_d    =  (JSPUtil.getParameter(request, prefix + "vsl_cntr_capa_d           ".trim(), length));
            String[] vsl_cntr_capa_o    =  (JSPUtil.getParameter(request, prefix + "vsl_cntr_capa_o           ".trim(), length));
            String[] vsl_cntr_capa_p    =  (JSPUtil.getParameter(request, prefix + "vsl_cntr_capa_p           ".trim(), length));
            String[] vsl_cgo_capa_grain =  (JSPUtil.getParameter(request, prefix + "vsl_cgo_capa_grain        ".trim(), length));
            String[] vsl_cgo_capa_bail  =  (JSPUtil.getParameter(request, prefix + "vsl_cgo_capa_bail         ".trim(), length));
            String[] vsl_cgo_capa_tank  =  (JSPUtil.getParameter(request, prefix + "vsl_cgo_capa_tank         ".trim(), length));
            String[] vsl_teu_cd         =  (JSPUtil.getParameter(request, prefix + "vsl_teu_cd                ".trim(), length));
            String[] vsl_rf_recept_qty  =  (JSPUtil.getParameter(request, prefix + "vsl_rf_recept_qty         ".trim(), length));
            String[] vsl_rf_recept_max  =  (JSPUtil.getParameter(request, prefix + "vsl_rf_recept_max         ".trim(), length));
            String[] vsl_call_sign      =  (JSPUtil.getParameter(request, prefix + "vsl_call_sign             ".trim(), length));
            String[] vsl_offcl_no       =  (JSPUtil.getParameter(request, prefix + "vsl_offcl_no              ".trim(), length));
            String[] vsl_immar_id1      =  (JSPUtil.getParameter(request, prefix + "vsl_immar_id1             ".trim(), length));
            String[] vsl_immar_id2      =  (JSPUtil.getParameter(request, prefix + "vsl_immar_id2             ".trim(), length));
            String[] vsl_immar_id3      =  (JSPUtil.getParameter(request, prefix + "vsl_immar_id3             ".trim(), length));
            String[] vsl_regn_port      =  (JSPUtil.getParameter(request, prefix + "vsl_regn_port             ".trim(), length));
            String[] vsl_flag           =  (JSPUtil.getParameter(request, prefix + "vsl_flag                  ".trim(), length));
            String[] vsl_class          =  (JSPUtil.getParameter(request, prefix + "vsl_class                 ".trim(), length));
            String[] vsl_class_no       =  (JSPUtil.getParameter(request, prefix + "vsl_class_no              ".trim(), length));
            String[] vsl_builder        =  (JSPUtil.getParameter(request, prefix + "vsl_builder               ".trim(), length));
            String[] vsl_launched_dt    =  (JSPUtil.getParameter(request, prefix + "vsl_launched_dt           ".trim(), length));
            String[] vsl_delevered_dt   =  (JSPUtil.getParameter(request, prefix + "vsl_delevered_dt          ".trim(), length));
            String[] vsl_kell_laid      =  (JSPUtil.getParameter(request, prefix + "vsl_kell_laid             ".trim(), length));
            String[] vsl_close_dt       =  (JSPUtil.getParameter(request, prefix + "vsl_close_dt              ".trim(), length));
            String[] vsl_hull_no        =  (JSPUtil.getParameter(request, prefix + "vsl_hull_no               ".trim(), length));
            String[] vsl_loa            =  (JSPUtil.getParameter(request, prefix + "vsl_loa                   ".trim(), length));
            String[] vsl_lbp            =  (JSPUtil.getParameter(request, prefix + "vsl_lbp                   ".trim(), length));
            String[] vsl_breadth        =  (JSPUtil.getParameter(request, prefix + "vsl_breadth               ".trim(), length));
            String[] vsl_depth          =  (JSPUtil.getParameter(request, prefix + "vsl_depth                 ".trim(), length));
            String[] vsl_draft          =  (JSPUtil.getParameter(request, prefix + "vsl_draft                 ".trim(), length));
            String[] vsl_freeboard      =  (JSPUtil.getParameter(request, prefix + "vsl_freeboard             ".trim(), length));
            String[] vsl_displace       =  (JSPUtil.getParameter(request, prefix + "vsl_displace              ".trim(), length));
            String[] vsl_dead_wt        =  (JSPUtil.getParameter(request, prefix + "vsl_dead_wt               ".trim(), length));
            String[] vsl_light_ship     =  (JSPUtil.getParameter(request, prefix + "vsl_light_ship            ".trim(), length));
            String[] vsl_grt            =  (JSPUtil.getParameter(request, prefix + "vsl_grt                   ".trim(), length));
            String[] vsl_nrt            =  (JSPUtil.getParameter(request, prefix + "vsl_nrt                   ".trim(), length));
            String[] vsl_panama_grt     =  (JSPUtil.getParameter(request, prefix + "vsl_panama_grt            ".trim(), length));
            String[] vsl_panama_nrt     =  (JSPUtil.getParameter(request, prefix + "vsl_panama_nrt            ".trim(), length));
            String[] vsl_suez_grt       =  (JSPUtil.getParameter(request, prefix + "vsl_suez_grt              ".trim(), length));
            String[] vsl_suez_nrt       =  (JSPUtil.getParameter(request, prefix + "vsl_suez_nrt              ".trim(), length));
            String[] vsl_fo_capa        =  (JSPUtil.getParameter(request, prefix + "vsl_fo_capa               ".trim(), length));
            String[] vsl_do_capa        =  (JSPUtil.getParameter(request, prefix + "vsl_do_capa               ".trim(), length));
            String[] vsl_fw_capa        =  (JSPUtil.getParameter(request, prefix + "vsl_fw_capa               ".trim(), length));
            String[] vsl_ballas_capa    =  (JSPUtil.getParameter(request, prefix + "vsl_ballas_capa           ".trim(), length));
            String[] vsl_fo_consumpt    =  (JSPUtil.getParameter(request, prefix + "vsl_fo_consumpt           ".trim(), length));
            String[] vsl_do_consumpt    =  (JSPUtil.getParameter(request, prefix + "vsl_do_consumpt           ".trim(), length));
            String[] vsl_fw_consumpt    =  (JSPUtil.getParameter(request, prefix + "vsl_fw_consumpt           ".trim(), length));
            String[] vsl_main_maker     =  (JSPUtil.getParameter(request, prefix + "vsl_main_maker            ".trim(), length));
            String[] vsl_main_type      =  (JSPUtil.getParameter(request, prefix + "vsl_main_type             ".trim(), length));
            String[] vsl_main_bhp       =  (JSPUtil.getParameter(request, prefix + "vsl_main_bhp              ".trim(), length));
            String[] vsl_main_rpm       =  (JSPUtil.getParameter(request, prefix + "vsl_main_rpm              ".trim(), length));
            String[] vsl_gen_maker      =  (JSPUtil.getParameter(request, prefix + "vsl_gen_maker             ".trim(), length));
            String[] vsl_gen_type       =  (JSPUtil.getParameter(request, prefix + "vsl_gen_type              ".trim(), length));
            String[] vsl_gen_bhp        =  (JSPUtil.getParameter(request, prefix + "vsl_gen_bhp               ".trim(), length));
            String[] vsl_gen_rpm        =  (JSPUtil.getParameter(request, prefix + "vsl_gen_rpm               ".trim(), length));
            String[] vsl_bow_maker      =  (JSPUtil.getParameter(request, prefix + "vsl_bow_maker             ".trim(), length));
            String[] vsl_bow_type       =  (JSPUtil.getParameter(request, prefix + "vsl_bow_type              ".trim(), length));
            String[] vsl_bow_bhp        =  (JSPUtil.getParameter(request, prefix + "vsl_bow_bhp               ".trim(), length));
            String[] vsl_bow_rpm        =  (JSPUtil.getParameter(request, prefix + "vsl_bow_rpm               ".trim(), length));
            String[] vsl_kor_nm         =  (JSPUtil.getParameter(request, prefix + "vsl_kor_nm                ".trim(), length));
            String[] vsl_del_mk         =  (JSPUtil.getParameter(request, prefix + "vsl_del_mk                ".trim(), length));
            String[] vsl_fdr_ind        =  (JSPUtil.getParameter(request, prefix + "vsl_fdr_ind               ".trim(), length));
            String[] vsl_lane_cd        =  (JSPUtil.getParameter(request, prefix + "vsl_lane_cd               ".trim(), length));
            String[] vsl_conv_div       =  (JSPUtil.getParameter(request, prefix + "vsl_conv_div              ".trim(), length));
            String[] vsl_pcall_cnt      =  (JSPUtil.getParameter(request, prefix + "vsl_pcall_cnt             ".trim(), length));
            String[] vsl_bulk_type      =  (JSPUtil.getParameter(request, prefix + "vsl_bulk_type             ".trim(), length));
            String[] vsl_del_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_del_dt                ".trim(), length));
            String[] vsl_bulk_size      =  (JSPUtil.getParameter(request, prefix + "vsl_bulk_size             ".trim(), length));
            String[] vsl_lloyd_no       =  (JSPUtil.getParameter(request, prefix + "vsl_lloyd_no              ".trim(), length));
            String[] vsl_height         =  (JSPUtil.getParameter(request, prefix + "vsl_height                ".trim(), length));
            String[] vsl_regist_dt      =  (JSPUtil.getParameter(request, prefix + "vsl_regist_dt             ".trim(), length));
            String[] vsl_radar_tp       =  (JSPUtil.getParameter(request, prefix + "vsl_radar_tp              ".trim(), length));
            String[] vsl_spare_pro      =  (JSPUtil.getParameter(request, prefix + "vsl_spare_pro             ".trim(), length));
            String[] vsl_spare_anc      =  (JSPUtil.getParameter(request, prefix + "vsl_spare_anc             ".trim(), length));
            String[] vsl_hold_no        =  (JSPUtil.getParameter(request, prefix + "vsl_hold_no               ".trim(), length));
            String[] vsl_hatch_no       =  (JSPUtil.getParameter(request, prefix + "vsl_hatch_no              ".trim(), length));
            String[] vsl_cgo_gear       =  (JSPUtil.getParameter(request, prefix + "vsl_cgo_gear              ".trim(), length));
            String[] vsl_edi_nm         =  (JSPUtil.getParameter(request, prefix + "vsl_edi_nm                ".trim(), length));
            String[] vsl_comp_ind       =  (JSPUtil.getParameter(request, prefix + "vsl_comp_ind              ".trim(), length));
            String[] vsl_crt_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_crt_dt                ".trim(), length));
            String[] vsl_crt_id         =  (JSPUtil.getParameter(request, prefix + "vsl_crt_id                ".trim(), length));
            String[] vsl_udt_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_udt_dt                ".trim(), length));
            String[] vsl_udt_id         =  (JSPUtil.getParameter(request, prefix + "vsl_udt_id                ".trim(), length));
            String[] vsl_sfc_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_sfc_dt                ".trim(), length));
            String[] vsl_sfr_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_sfr_dt                ".trim(), length));
            String[] vsl_sfe_dt         =  (JSPUtil.getParameter(request, prefix + "vsl_sfe_dt                ".trim(), length));
            String[] vsl_ll_dt          =  (JSPUtil.getParameter(request, prefix + "vsl_ll_dt                 ".trim(), length));
            String[] vsl_dr_dt          =  (JSPUtil.getParameter(request, prefix + "vsl_dr_dt                 ".trim(), length));
            String[] vsl_crt_ofc        =  (JSPUtil.getParameter(request, prefix + "vsl_crt_ofc               ".trim(), length));
            String[] vsl_del_ofc        =  (JSPUtil.getParameter(request, prefix + "vsl_del_ofc               ".trim(), length));
            String[] nis_event_dt       =  (JSPUtil.getParameter(request, prefix + "nis_event_dt              ".trim(), length));
            String[] vsl_pas_job        =  (JSPUtil.getParameter(request, prefix + "vsl_pas_job               ".trim(), length));
            String[] vsl_pas_vamt       =  (JSPUtil.getParameter(request, prefix + "vsl_pas_vamt              ".trim(), length));
            String[] vsl_pas_oc         =  (JSPUtil.getParameter(request, prefix + "vsl_pas_oc                ".trim(), length));
            String[] vsl_pas_bulk_biz   =  (JSPUtil.getParameter(request, prefix + "vsl_pas_bulk_biz          ".trim(), length));
            String[] vsl_pas_teu_cd     =  (JSPUtil.getParameter(request, prefix + "vsl_pas_teu_cd            ".trim(), length));
            String[] tre_rsn_cntr       =  (JSPUtil.getParameter(request, prefix + "tre_rsn_cntr              ".trim(), length));
            String[] vsl_tariff_size    =  (JSPUtil.getParameter(request, prefix + "vsl_tariff_size           ".trim(), length));
            String[] vsl_oop_cd1        =  (JSPUtil.getParameter(request, prefix + "vsl_oop_cd1               ".trim(), length));
            String[] vsl_oop_cd2        =  (JSPUtil.getParameter(request, prefix + "vsl_oop_cd2               ".trim(), length));
            String[] vsl_oop_cd3        =  (JSPUtil.getParameter(request, prefix + "vsl_oop_cd3               ".trim(), length));
            String[] vsl_build_loc      =  (JSPUtil.getParameter(request, prefix + "vsl_build_loc             ".trim(), length));
            String[] vsl_nrt_itc        =  (JSPUtil.getParameter(request, prefix + "vsl_nrt_itc               ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VSL();
                model.setIbflag                      ( ibflag                [i]);
                model.setPage_rows                   ( page_rows             [i]);
                model.setVsl_cd                      ( vsl_cd                [i]);
                model.setVsl_eng_nm                  ( vsl_eng_nm            [i]);
                model.setVsl_type_cd                 ( vsl_type_cd           [i]);
                model.setVsl_new_built_ind           ( vsl_new_built_ind     [i]);
                model.setVsl_owned_ind               ( vsl_owned_ind         [i]);
                model.setCar_cd                      ( car_cd                [i]);
                model.setVsl_car_vsl_cd              ( vsl_car_vsl_cd        [i]);
                model.setVsl_svc_spd                 ( vsl_svc_spd           [i]);
                model.setVsl_max_spd                 ( vsl_max_spd           [i]);
                model.setVsl_eco_spd                 ( vsl_eco_spd           [i]);
                model.setVsl_crew                    ( vsl_crew              [i]);
                model.setVsl_cntr_capa_d             ( vsl_cntr_capa_d       [i]);
                model.setVsl_cntr_capa_o             ( vsl_cntr_capa_o       [i]);
                model.setVsl_cntr_capa_p             ( vsl_cntr_capa_p       [i]);
                model.setVsl_cgo_capa_grain          ( vsl_cgo_capa_grain    [i]);
                model.setVsl_cgo_capa_bail           ( vsl_cgo_capa_bail     [i]);
                model.setVsl_cgo_capa_tank           ( vsl_cgo_capa_tank     [i]);
                model.setVsl_teu_cd                  ( vsl_teu_cd            [i]);
                model.setVsl_rf_recept_qty           ( vsl_rf_recept_qty     [i]);
                model.setVsl_rf_recept_max           ( vsl_rf_recept_max     [i]);
                model.setVsl_call_sign               ( vsl_call_sign         [i]);
                model.setVsl_offcl_no                ( vsl_offcl_no          [i]);
                model.setVsl_immar_id1               ( vsl_immar_id1         [i]);
                model.setVsl_immar_id2               ( vsl_immar_id2         [i]);
                model.setVsl_immar_id3               ( vsl_immar_id3         [i]);
                model.setVsl_regn_port               ( vsl_regn_port         [i]);
                model.setVsl_flag                    ( vsl_flag              [i]);
                model.setVsl_class                   ( vsl_class             [i]);
                model.setVsl_class_no                ( vsl_class_no          [i]);
                model.setVsl_builder                 ( vsl_builder           [i]);
                model.setVsl_launched_dt             ( vsl_launched_dt       [i]);
                model.setVsl_delevered_dt            ( vsl_delevered_dt      [i]);
                model.setVsl_kell_laid               ( vsl_kell_laid         [i]);
                model.setVsl_close_dt                ( vsl_close_dt          [i]);
                model.setVsl_hull_no                 ( vsl_hull_no           [i]);
                model.setVsl_loa                     ( vsl_loa               [i]);
                model.setVsl_lbp                     ( vsl_lbp               [i]);
                model.setVsl_breadth                 ( vsl_breadth           [i]);
                model.setVsl_depth                   ( vsl_depth             [i]);
                model.setVsl_draft                   ( vsl_draft             [i]);
                model.setVsl_freeboard               ( vsl_freeboard         [i]);
                model.setVsl_displace                ( vsl_displace          [i]);
                model.setVsl_dead_wt                 ( vsl_dead_wt           [i]);
                model.setVsl_light_ship              ( vsl_light_ship        [i]);
                model.setVsl_grt                     ( vsl_grt               [i]);
                model.setVsl_nrt                     ( vsl_nrt               [i]);
                model.setVsl_panama_grt              ( vsl_panama_grt        [i]);
                model.setVsl_panama_nrt              ( vsl_panama_nrt        [i]);
                model.setVsl_suez_grt                ( vsl_suez_grt          [i]);
                model.setVsl_suez_nrt                ( vsl_suez_nrt          [i]);
                model.setVsl_fo_capa                 ( vsl_fo_capa           [i]);
                model.setVsl_do_capa                 ( vsl_do_capa           [i]);
                model.setVsl_fw_capa                 ( vsl_fw_capa           [i]);
                model.setVsl_ballas_capa             ( vsl_ballas_capa       [i]);
                model.setVsl_fo_consumpt             ( vsl_fo_consumpt       [i]);
                model.setVsl_do_consumpt             ( vsl_do_consumpt       [i]);
                model.setVsl_fw_consumpt             ( vsl_fw_consumpt       [i]);
                model.setVsl_main_maker              ( vsl_main_maker        [i]);
                model.setVsl_main_type               ( vsl_main_type         [i]);
                model.setVsl_main_bhp                ( vsl_main_bhp          [i]);
                model.setVsl_main_rpm                ( vsl_main_rpm          [i]);
                model.setVsl_gen_maker               ( vsl_gen_maker         [i]);
                model.setVsl_gen_type                ( vsl_gen_type          [i]);
                model.setVsl_gen_bhp                 ( vsl_gen_bhp           [i]);
                model.setVsl_gen_rpm                 ( vsl_gen_rpm           [i]);
                model.setVsl_bow_maker               ( vsl_bow_maker         [i]);
                model.setVsl_bow_type                ( vsl_bow_type          [i]);
                model.setVsl_bow_bhp                 ( vsl_bow_bhp           [i]);
                model.setVsl_bow_rpm                 ( vsl_bow_rpm           [i]);
                model.setVsl_kor_nm                  ( vsl_kor_nm            [i]);
                model.setVsl_del_mk                  ( vsl_del_mk            [i]);
                model.setVsl_fdr_ind                 ( vsl_fdr_ind           [i]);
                model.setVsl_lane_cd                 ( vsl_lane_cd           [i]);
                model.setVsl_conv_div                ( vsl_conv_div          [i]);
                model.setVsl_pcall_cnt               ( vsl_pcall_cnt         [i]);
                model.setVsl_bulk_type               ( vsl_bulk_type         [i]);
                model.setVsl_del_dt                  ( vsl_del_dt            [i]);
                model.setVsl_bulk_size               ( vsl_bulk_size         [i]);
                model.setVsl_lloyd_no                ( vsl_lloyd_no          [i]);
                model.setVsl_height                  ( vsl_height            [i]);
                model.setVsl_regist_dt               ( vsl_regist_dt         [i]);
                model.setVsl_radar_tp                ( vsl_radar_tp          [i]);
                model.setVsl_spare_pro               ( vsl_spare_pro         [i]);
                model.setVsl_spare_anc               ( vsl_spare_anc         [i]);
                model.setVsl_hold_no                 ( vsl_hold_no           [i]);
                model.setVsl_hatch_no                ( vsl_hatch_no          [i]);
                model.setVsl_cgo_gear                ( vsl_cgo_gear          [i]);
                model.setVsl_edi_nm                  ( vsl_edi_nm            [i]);
                model.setVsl_comp_ind                ( vsl_comp_ind          [i]);
                model.setVsl_crt_dt                  ( vsl_crt_dt            [i]);
                model.setVsl_crt_id                  ( vsl_crt_id            [i]);
                model.setVsl_udt_dt                  ( vsl_udt_dt            [i]);
                model.setVsl_udt_id                  ( vsl_udt_id            [i]);
                model.setVsl_sfc_dt                  ( vsl_sfc_dt            [i]);
                model.setVsl_sfr_dt                  ( vsl_sfr_dt            [i]);
                model.setVsl_sfe_dt                  ( vsl_sfe_dt            [i]);
                model.setVsl_ll_dt                   ( vsl_ll_dt             [i]);
                model.setVsl_dr_dt                   ( vsl_dr_dt             [i]);
                model.setVsl_crt_ofc                 ( vsl_crt_ofc           [i]);
                model.setVsl_del_ofc                 ( vsl_del_ofc           [i]);
                model.setNis_event_dt                ( nis_event_dt          [i]);
                model.setVsl_pas_job                 ( vsl_pas_job           [i]);
                model.setVsl_pas_vamt                ( vsl_pas_vamt          [i]);
                model.setVsl_pas_oc                  ( vsl_pas_oc            [i]);
                model.setVsl_pas_bulk_biz            ( vsl_pas_bulk_biz      [i]);
                model.setVsl_pas_teu_cd              ( vsl_pas_teu_cd        [i]);
                model.setTre_rsn_cntr                ( tre_rsn_cntr          [i]);
                model.setVsl_tariff_size             ( vsl_tariff_size       [i]);
                model.setVsl_oop_cd1                 ( vsl_oop_cd1           [i]);
                model.setVsl_oop_cd2                 ( vsl_oop_cd2           [i]);
                model.setVsl_oop_cd3                 ( vsl_oop_cd3           [i]);
                model.setVsl_build_loc               ( vsl_build_loc         [i]);
                model.setVsl_nrt_itc                 ( vsl_nrt_itc           [i]);
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
