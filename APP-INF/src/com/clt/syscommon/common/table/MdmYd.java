/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_YD.java
*@FileTitle : Node 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-17
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-17 Hyung Choon
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
 */public final class MdmYd implements java.io.Serializable {

    private String                  ibflag                  = "";
    private String                  page_rows               = "";
    private String                  yd_cd                   = "";
    private String                  yd_nm                   = "";
    private String                  loc_cd                  = "";
    private String                  vndr_cnt_cd             = "";
    private String                  vndr_seq                = "";
    private String                  ofc_cd                  = "";
    private String                  mst_ofc_id              = "";
    private String                  hub_nod_flg             = "";
    private String                  avg_dwll_hrs            = "";
    private String                  min_dwll_hrs            = "";
    private String                  yd_chr_cd               = "";
    private String                  yd_fcty_tp_mrn_tml_flg  = "";
    private String                  yd_fcty_tp_cy_flg       = "";
    private String                  yd_fcty_tp_cfs_flg      = "";
    private String                  yd_fcty_tp_rail_rmp_flg = "";
    private String                  yd_oshp_cd              = "";
    private String                  bd_yd_flg               = "";
    private String                  onoff_hir_yd_flg        = "";
    private String                  yd_ft_hrs               = "";
    private String                  rep_zn_cd               = "";
    private String                  yd_bztp_nm              = "";
    private String                  yd_addr                 = "";
    private String                  zip_cd                  = "";
    private String                  intl_phn_no             = "";
    private String                  cty_area_phn_no         = "";
    private String                  phn_no                  = "";
    private String                  intl_fax_no             = "";
    private String                  cty_area_fax_no         = "";
    private String                  fax_no                  = "";
    private String                  yd_pic_nm               = "";
    private String                  yd_ceo_nm               = "";
    private String                  gate_opn_hr_mnt         = "";
    private String                  gate_clz_hr_mnt         = "";
    private String                  hol_gate_opn_hr_mnt     = "";
    private String                  hol_gate_clz_hr_mnt     = "";
    private String                  sun_gate_opn_hr_mnt     = "";
    private String                  sun_gate_clz_hr_mnt     = "";
    private String                  sat_gate_opn_hr_mnt     = "";
    private String                  sat_gate_clz_hr_mnt     = "";
    private String                  yd_cgo_clz_hr_mnt       = "";
    private String                  yd_rmk                  = "";
    private String                  brth_no                 = "";
    private String                  yd_brth_len             = "";
    private String                  yd_brth_alng_sd_desc    = "";
    private String                  yd_brth_dpth_chnl_knt   = "";
    private String                  brth_wdt                = "";
    private String                  yd_ttl_spc              = "";
    private String                  yd_act_spc              = "";
    private String                  yd_hjs_spc              = "";
    private String                  yd_hndl_capa            = "";
    private String                  yd_rf_rcpt_440v_knt     = "";
    private String                  yd_rf_rcpt_220v_knt     = "";
    private String                  yd_rf_rcpt_dul_knt      = "";
    private String                  yd_op_sys_cd            = "";
    private String                  yd_inr_rail_knt         = "";
    private String                  yd_cfs_spc              = "";
    private String                  mnr_shop_flg            = "";
    private String                  yd_cmpu_sys_desc        = "";
    private String                  yd_hndl_yr              = "";
    private String                  yd_ttl_vol_teu_knt      = "";
    private String                  yd_ttl_vol_bx_knt       = "";
    private String                  yd_hjs_vol_teu_knt      = "";
    private String                  yd_hjs_vol_bx_knt       = "";
    private String                  yd_pst_pnm_gcrn_knt     = "";
    private String                  yd_pnm_gcrn_knt         = "";
    private String                  trstr_knt               = "";
    private String                  frk_knt                 = "";
    private String                  yd_strdl_crrg_knt       = "";
    private String                  yd_trct_knt             = "";
    private String                  yd_top_lft_knt          = "";
    private String                  tml_chss_knt            = "";
    private String                  yd_usr_nm               = "";
    private String                  yd_opr_desc             = "";
    private String                  eir_svc_flg             = "";
    private String                  tml_prod_knt            = "";
    private String                  yd_cstms_no             = "";
    private String                  yd_irg_nm               = "";
    private String                  yd_fcty_tp_psdo_yd_flg  = "";
    private String                  yd_loc_ste_cd           = "";
    private String                  yd_eml                  = "";
    private String                  dem_ib_clt_flg          = "";
    private String                  dem_ob_clt_flg          = "";
    private String                  bkg_pod_yd_flg          = "";
    private String                  bfr_ofc_cd              = "";
    private String                  bfr_mst_ofc_id          = "";
    private String                  bfr_ofc_cng_dt          = "";
    private String                  cre_usr_id              = "";
    private String                  cre_dt                  = "";
    private String                  upd_usr_id              = "";
    private String                  upd_dt                  = "";
    private String                  delt_flg                = "";
    private String                  yd_tp_cd                = "";
    private String                  tml_vndr_seq            = "";
    private String                  stv_vndr_seq            = "";
    private String                  sec_vndr_seq            = "";

    public MdmYd(){}

    public MdmYd(
            String                  ibflag                 ,
            String                  page_rows              ,
            String                  yd_cd                  ,
            String                  yd_nm                  ,
            String                  loc_cd                 ,
            String                  vndr_cnt_cd            ,
            String                  vndr_seq               ,
            String                  ofc_cd                 ,
            String                  mst_ofc_id             ,
            String                  hub_nod_flg            ,
            String                  avg_dwll_hrs           ,
            String                  min_dwll_hrs           ,
            String                  yd_chr_cd              ,
            String                  yd_fcty_tp_mrn_tml_flg ,
            String                  yd_fcty_tp_cy_flg      ,
            String                  yd_fcty_tp_cfs_flg     ,
            String                  yd_fcty_tp_rail_rmp_flg,
            String                  yd_oshp_cd             ,
            String                  bd_yd_flg              ,
            String                  onoff_hir_yd_flg       ,
            String                  yd_ft_hrs              ,
            String                  rep_zn_cd              ,
            String                  yd_bztp_nm             ,
            String                  yd_addr                ,
            String                  zip_cd                 ,
            String                  intl_phn_no            ,
            String                  cty_area_phn_no        ,
            String                  phn_no                 ,
            String                  intl_fax_no            ,
            String                  cty_area_fax_no        ,
            String                  fax_no                 ,
            String                  yd_pic_nm              ,
            String                  yd_ceo_nm              ,
            String                  gate_opn_hr_mnt        ,
            String                  gate_clz_hr_mnt        ,
            String                  hol_gate_opn_hr_mnt    ,
            String                  hol_gate_clz_hr_mnt    ,
            String                  sun_gate_opn_hr_mnt    ,
            String                  sun_gate_clz_hr_mnt    ,
            String                  sat_gate_opn_hr_mnt    ,
            String                  sat_gate_clz_hr_mnt    ,
            String                  yd_cgo_clz_hr_mnt      ,
            String                  yd_rmk                 ,
            String                  brth_no                ,
            String                  yd_brth_len            ,
            String                  yd_brth_alng_sd_desc   ,
            String                  yd_brth_dpth_chnl_knt  ,
            String                  brth_wdt               ,
            String                  yd_ttl_spc             ,
            String                  yd_act_spc             ,
            String                  yd_hjs_spc             ,
            String                  yd_hndl_capa           ,
            String                  yd_rf_rcpt_440v_knt    ,
            String                  yd_rf_rcpt_220v_knt    ,
            String                  yd_rf_rcpt_dul_knt     ,
            String                  yd_op_sys_cd           ,
            String                  yd_inr_rail_knt        ,
            String                  yd_cfs_spc             ,
            String                  mnr_shop_flg           ,
            String                  yd_cmpu_sys_desc       ,
            String                  yd_hndl_yr             ,
            String                  yd_ttl_vol_teu_knt     ,
            String                  yd_ttl_vol_bx_knt      ,
            String                  yd_hjs_vol_teu_knt     ,
            String                  yd_hjs_vol_bx_knt      ,
            String                  yd_pst_pnm_gcrn_knt    ,
            String                  yd_pnm_gcrn_knt        ,
            String                  trstr_knt              ,
            String                  frk_knt                ,
            String                  yd_strdl_crrg_knt      ,
            String                  yd_trct_knt            ,
            String                  yd_top_lft_knt         ,
            String                  tml_chss_knt           ,
            String                  yd_usr_nm              ,
            String                  yd_opr_desc            ,
            String                  eir_svc_flg            ,
            String                  tml_prod_knt           ,
            String                  yd_cstms_no            ,
            String                  yd_irg_nm              ,
            String                  yd_fcty_tp_psdo_yd_flg ,
            String                  yd_loc_ste_cd          ,
            String                  yd_eml                 ,
            String                  dem_ib_clt_flg         ,
            String                  dem_ob_clt_flg         ,
            String                  bkg_pod_yd_flg         ,
            String                  bfr_ofc_cd             ,
            String                  bfr_mst_ofc_id         ,
            String                  bfr_ofc_cng_dt         ,
            String                  cre_usr_id             ,
            String                  cre_dt                 ,
            String                  upd_usr_id             ,
            String                  upd_dt                 ,
            String                  delt_flg               ,
            String                  yd_tp_cd               ,
            String                  tml_vndr_seq           ,
            String                  stv_vndr_seq           ,
            String                  sec_vndr_seq           ){
        this.ibflag                  = ibflag                 ;
        this.page_rows               = page_rows              ;
        this.yd_cd                   = yd_cd                  ;
        this.yd_nm                   = yd_nm                  ;
        this.loc_cd                  = loc_cd                 ;
        this.vndr_cnt_cd             = vndr_cnt_cd            ;
        this.vndr_seq                = vndr_seq               ;
        this.ofc_cd                  = ofc_cd                 ;
        this.mst_ofc_id              = mst_ofc_id             ;
        this.hub_nod_flg             = hub_nod_flg            ;
        this.avg_dwll_hrs            = avg_dwll_hrs           ;
        this.min_dwll_hrs            = min_dwll_hrs           ;
        this.yd_chr_cd               = yd_chr_cd              ;
        this.yd_fcty_tp_mrn_tml_flg  = yd_fcty_tp_mrn_tml_flg ;
        this.yd_fcty_tp_cy_flg       = yd_fcty_tp_cy_flg      ;
        this.yd_fcty_tp_cfs_flg      = yd_fcty_tp_cfs_flg     ;
        this.yd_fcty_tp_rail_rmp_flg = yd_fcty_tp_rail_rmp_flg;
        this.yd_oshp_cd              = yd_oshp_cd             ;
        this.bd_yd_flg               = bd_yd_flg              ;
        this.onoff_hir_yd_flg        = onoff_hir_yd_flg       ;
        this.yd_ft_hrs               = yd_ft_hrs              ;
        this.rep_zn_cd               = rep_zn_cd              ;
        this.yd_bztp_nm              = yd_bztp_nm             ;
        this.yd_addr                 = yd_addr                ;
        this.zip_cd                  = zip_cd                 ;
        this.intl_phn_no             = intl_phn_no            ;
        this.cty_area_phn_no         = cty_area_phn_no        ;
        this.phn_no                  = phn_no                 ;
        this.intl_fax_no             = intl_fax_no            ;
        this.cty_area_fax_no         = cty_area_fax_no        ;
        this.fax_no                  = fax_no                 ;
        this.yd_pic_nm               = yd_pic_nm              ;
        this.yd_ceo_nm               = yd_ceo_nm              ;
        this.gate_opn_hr_mnt         = gate_opn_hr_mnt        ;
        this.gate_clz_hr_mnt         = gate_clz_hr_mnt        ;
        this.hol_gate_opn_hr_mnt     = hol_gate_opn_hr_mnt    ;
        this.hol_gate_clz_hr_mnt     = hol_gate_clz_hr_mnt    ;
        this.sun_gate_opn_hr_mnt     = sun_gate_opn_hr_mnt    ;
        this.sun_gate_clz_hr_mnt     = sun_gate_clz_hr_mnt    ;
        this.sat_gate_opn_hr_mnt     = sat_gate_opn_hr_mnt    ;
        this.sat_gate_clz_hr_mnt     = sat_gate_clz_hr_mnt    ;
        this.yd_cgo_clz_hr_mnt       = yd_cgo_clz_hr_mnt      ;
        this.yd_rmk                  = yd_rmk                 ;
        this.brth_no                 = brth_no                ;
        this.yd_brth_len             = yd_brth_len            ;
        this.yd_brth_alng_sd_desc    = yd_brth_alng_sd_desc   ;
        this.yd_brth_dpth_chnl_knt   = yd_brth_dpth_chnl_knt  ;
        this.brth_wdt                = brth_wdt               ;
        this.yd_ttl_spc              = yd_ttl_spc             ;
        this.yd_act_spc              = yd_act_spc             ;
        this.yd_hjs_spc              = yd_hjs_spc             ;
        this.yd_hndl_capa            = yd_hndl_capa           ;
        this.yd_rf_rcpt_440v_knt     = yd_rf_rcpt_440v_knt    ;
        this.yd_rf_rcpt_220v_knt     = yd_rf_rcpt_220v_knt    ;
        this.yd_rf_rcpt_dul_knt      = yd_rf_rcpt_dul_knt     ;
        this.yd_op_sys_cd            = yd_op_sys_cd           ;
        this.yd_inr_rail_knt         = yd_inr_rail_knt        ;
        this.yd_cfs_spc              = yd_cfs_spc             ;
        this.mnr_shop_flg            = mnr_shop_flg           ;
        this.yd_cmpu_sys_desc        = yd_cmpu_sys_desc       ;
        this.yd_hndl_yr              = yd_hndl_yr             ;
        this.yd_ttl_vol_teu_knt      = yd_ttl_vol_teu_knt     ;
        this.yd_ttl_vol_bx_knt       = yd_ttl_vol_bx_knt      ;
        this.yd_hjs_vol_teu_knt      = yd_hjs_vol_teu_knt     ;
        this.yd_hjs_vol_bx_knt       = yd_hjs_vol_bx_knt      ;
        this.yd_pst_pnm_gcrn_knt     = yd_pst_pnm_gcrn_knt    ;
        this.yd_pnm_gcrn_knt         = yd_pnm_gcrn_knt        ;
        this.trstr_knt               = trstr_knt              ;
        this.frk_knt                 = frk_knt                ;
        this.yd_strdl_crrg_knt       = yd_strdl_crrg_knt      ;
        this.yd_trct_knt             = yd_trct_knt            ;
        this.yd_top_lft_knt          = yd_top_lft_knt         ;
        this.tml_chss_knt            = tml_chss_knt           ;
        this.yd_usr_nm               = yd_usr_nm              ;
        this.yd_opr_desc             = yd_opr_desc            ;
        this.eir_svc_flg             = eir_svc_flg            ;
        this.tml_prod_knt            = tml_prod_knt           ;
        this.yd_cstms_no             = yd_cstms_no            ;
        this.yd_irg_nm               = yd_irg_nm              ;
        this.yd_fcty_tp_psdo_yd_flg  = yd_fcty_tp_psdo_yd_flg ;
        this.yd_loc_ste_cd           = yd_loc_ste_cd          ;
        this.yd_eml                  = yd_eml                 ;
        this.dem_ib_clt_flg          = dem_ib_clt_flg         ;
        this.dem_ob_clt_flg          = dem_ob_clt_flg         ;
        this.bkg_pod_yd_flg          = bkg_pod_yd_flg         ;
        this.bfr_ofc_cd              = bfr_ofc_cd             ;
        this.bfr_mst_ofc_id          = bfr_mst_ofc_id         ;
        this.bfr_ofc_cng_dt          = bfr_ofc_cng_dt         ;
        this.cre_usr_id              = cre_usr_id             ;
        this.cre_dt                  = cre_dt                 ;
        this.upd_usr_id              = upd_usr_id             ;
        this.upd_dt                  = upd_dt                 ;
        this.delt_flg                = delt_flg               ;
        this.yd_tp_cd                = yd_tp_cd               ;
        this.tml_vndr_seq            = tml_vndr_seq           ;
        this.stv_vndr_seq            = stv_vndr_seq           ;
        this.sec_vndr_seq            = sec_vndr_seq           ;
    }

    // getter method is proceeding ..
    public String                  getIbflag                 (){    return ibflag                     ;    }
    public String                  getPage_rows              (){    return page_rows                  ;    }
    public String                  getYd_cd                  (){    return yd_cd                      ;    }
    public String                  getYd_nm                  (){    return yd_nm                      ;    }
    public String                  getLoc_cd                 (){    return loc_cd                     ;    }
    public String                  getVndr_cnt_cd            (){    return vndr_cnt_cd                ;    }
    public String                  getVndr_seq               (){    return vndr_seq                   ;    }
    public String                  getOfc_cd                 (){    return ofc_cd                     ;    }
    public String                  getMst_ofc_id             (){    return mst_ofc_id                 ;    }
    public String                  getHub_nod_flg            (){    return hub_nod_flg                ;    }
    public String                  getAvg_dwll_hrs           (){    return avg_dwll_hrs               ;    }
    public String                  getMin_dwll_hrs           (){    return min_dwll_hrs               ;    }
    public String                  getYd_chr_cd              (){    return yd_chr_cd                  ;    }
    public String                  getYd_fcty_tp_mrn_tml_flg (){    return yd_fcty_tp_mrn_tml_flg     ;    }
    public String                  getYd_fcty_tp_cy_flg      (){    return yd_fcty_tp_cy_flg          ;    }
    public String                  getYd_fcty_tp_cfs_flg     (){    return yd_fcty_tp_cfs_flg         ;    }
    public String                  getYd_fcty_tp_rail_rmp_flg(){    return yd_fcty_tp_rail_rmp_flg    ;    }
    public String                  getYd_oshp_cd             (){    return yd_oshp_cd                 ;    }
    public String                  getBd_yd_flg              (){    return bd_yd_flg                  ;    }
    public String                  getOnoff_hir_yd_flg       (){    return onoff_hir_yd_flg           ;    }
    public String                  getYd_ft_hrs              (){    return yd_ft_hrs                  ;    }
    public String                  getRep_zn_cd              (){    return rep_zn_cd                  ;    }
    public String                  getYd_bztp_nm             (){    return yd_bztp_nm                 ;    }
    public String                  getYd_addr                (){    return yd_addr                    ;    }
    public String                  getZip_cd                 (){    return zip_cd                     ;    }
    public String                  getIntl_phn_no            (){    return intl_phn_no                ;    }
    public String                  getCty_area_phn_no        (){    return cty_area_phn_no            ;    }
    public String                  getPhn_no                 (){    return phn_no                     ;    }
    public String                  getIntl_fax_no            (){    return intl_fax_no                ;    }
    public String                  getCty_area_fax_no        (){    return cty_area_fax_no            ;    }
    public String                  getFax_no                 (){    return fax_no                     ;    }
    public String                  getYd_pic_nm              (){    return yd_pic_nm                  ;    }
    public String                  getYd_ceo_nm              (){    return yd_ceo_nm                  ;    }
    public String                  getGate_opn_hr_mnt        (){    return gate_opn_hr_mnt            ;    }
    public String                  getGate_clz_hr_mnt        (){    return gate_clz_hr_mnt            ;    }
    public String                  getHol_gate_opn_hr_mnt    (){    return hol_gate_opn_hr_mnt        ;    }
    public String                  getHol_gate_clz_hr_mnt    (){    return hol_gate_clz_hr_mnt        ;    }
    public String                  getSun_gate_opn_hr_mnt    (){    return sun_gate_opn_hr_mnt        ;    }
    public String                  getSun_gate_clz_hr_mnt    (){    return sun_gate_clz_hr_mnt        ;    }
    public String                  getSat_gate_opn_hr_mnt    (){    return sat_gate_opn_hr_mnt        ;    }
    public String                  getSat_gate_clz_hr_mnt    (){    return sat_gate_clz_hr_mnt        ;    }
    public String                  getYd_cgo_clz_hr_mnt      (){    return yd_cgo_clz_hr_mnt          ;    }
    public String                  getYd_rmk                 (){    return yd_rmk                     ;    }
    public String                  getBrth_no                (){    return brth_no                    ;    }
    public String                  getYd_brth_len            (){    return yd_brth_len                ;    }
    public String                  getYd_brth_alng_sd_desc   (){    return yd_brth_alng_sd_desc       ;    }
    public String                  getYd_brth_dpth_chnl_knt  (){    return yd_brth_dpth_chnl_knt      ;    }
    public String                  getBrth_wdt               (){    return brth_wdt                   ;    }
    public String                  getYd_ttl_spc             (){    return yd_ttl_spc                 ;    }
    public String                  getYd_act_spc             (){    return yd_act_spc                 ;    }
    public String                  getYd_hjs_spc             (){    return yd_hjs_spc                 ;    }
    public String                  getYd_hndl_capa           (){    return yd_hndl_capa               ;    }
    public String                  getYd_rf_rcpt_440v_knt    (){    return yd_rf_rcpt_440v_knt        ;    }
    public String                  getYd_rf_rcpt_220v_knt    (){    return yd_rf_rcpt_220v_knt        ;    }
    public String                  getYd_rf_rcpt_dul_knt     (){    return yd_rf_rcpt_dul_knt         ;    }
    public String                  getYd_op_sys_cd           (){    return yd_op_sys_cd               ;    }
    public String                  getYd_inr_rail_knt        (){    return yd_inr_rail_knt            ;    }
    public String                  getYd_cfs_spc             (){    return yd_cfs_spc                 ;    }
    public String                  getMnr_shop_flg           (){    return mnr_shop_flg               ;    }
    public String                  getYd_cmpu_sys_desc       (){    return yd_cmpu_sys_desc           ;    }
    public String                  getYd_hndl_yr             (){    return yd_hndl_yr                 ;    }
    public String                  getYd_ttl_vol_teu_knt     (){    return yd_ttl_vol_teu_knt         ;    }
    public String                  getYd_ttl_vol_bx_knt      (){    return yd_ttl_vol_bx_knt          ;    }
    public String                  getYd_hjs_vol_teu_knt     (){    return yd_hjs_vol_teu_knt         ;    }
    public String                  getYd_hjs_vol_bx_knt      (){    return yd_hjs_vol_bx_knt          ;    }
    public String                  getYd_pst_pnm_gcrn_knt    (){    return yd_pst_pnm_gcrn_knt        ;    }
    public String                  getYd_pnm_gcrn_knt        (){    return yd_pnm_gcrn_knt            ;    }
    public String                  getTrstr_knt              (){    return trstr_knt                  ;    }
    public String                  getFrk_knt                (){    return frk_knt                    ;    }
    public String                  getYd_strdl_crrg_knt      (){    return yd_strdl_crrg_knt          ;    }
    public String                  getYd_trct_knt            (){    return yd_trct_knt                ;    }
    public String                  getYd_top_lft_knt         (){    return yd_top_lft_knt             ;    }
    public String                  getTml_chss_knt           (){    return tml_chss_knt               ;    }
    public String                  getYd_usr_nm              (){    return yd_usr_nm                  ;    }
    public String                  getYd_opr_desc            (){    return yd_opr_desc                ;    }
    public String                  getEir_svc_flg            (){    return eir_svc_flg                ;    }
    public String                  getTml_prod_knt           (){    return tml_prod_knt               ;    }
    public String                  getYd_cstms_no            (){    return yd_cstms_no                ;    }
    public String                  getYd_irg_nm              (){    return yd_irg_nm                  ;    }
    public String                  getYd_fcty_tp_psdo_yd_flg (){    return yd_fcty_tp_psdo_yd_flg     ;    }
    public String                  getYd_loc_ste_cd          (){    return yd_loc_ste_cd              ;    }
    public String                  getYd_eml                 (){    return yd_eml                     ;    }
    public String                  getDem_ib_clt_flg         (){    return dem_ib_clt_flg             ;    }
    public String                  getDem_ob_clt_flg         (){    return dem_ob_clt_flg             ;    }
    public String                  getBkg_pod_yd_flg         (){    return bkg_pod_yd_flg             ;    }
    public String                  getBfr_ofc_cd             (){    return bfr_ofc_cd                 ;    }
    public String                  getBfr_mst_ofc_id         (){    return bfr_mst_ofc_id             ;    }
    public String                  getBfr_ofc_cng_dt         (){    return bfr_ofc_cng_dt             ;    }
    public String                  getCre_usr_id             (){    return cre_usr_id                 ;    }
    public String                  getCre_dt                 (){    return cre_dt                     ;    }
    public String                  getUpd_usr_id             (){    return upd_usr_id                 ;    }
    public String                  getUpd_dt                 (){    return upd_dt                     ;    }
    public String                  getDelt_flg               (){    return delt_flg                   ;    }
    public String                  getYd_tp_cd               (){    return yd_tp_cd                   ;    }
    public String                  getTml_vndr_seq           (){    return tml_vndr_seq               ;    }
    public String                  getStv_vndr_seq           (){    return stv_vndr_seq               ;    }
    public String                  getSec_vndr_seq           (){    return sec_vndr_seq               ;    }

    // setter method is proceeding ..
    public void setIbflag                 ( String                  ibflag                  ){    this.ibflag                  = ibflag                     ;    }
    public void setPage_rows              ( String                  page_rows               ){    this.page_rows               = page_rows                  ;    }
    public void setYd_cd                  ( String                  yd_cd                   ){    this.yd_cd                   = yd_cd                      ;    }
    public void setYd_nm                  ( String                  yd_nm                   ){    this.yd_nm                   = yd_nm                      ;    }
    public void setLoc_cd                 ( String                  loc_cd                  ){    this.loc_cd                  = loc_cd                     ;    }
    public void setVndr_cnt_cd            ( String                  vndr_cnt_cd             ){    this.vndr_cnt_cd             = vndr_cnt_cd                ;    }
    public void setVndr_seq               ( String                  vndr_seq                ){    this.vndr_seq                = vndr_seq                   ;    }
    public void setOfc_cd                 ( String                  ofc_cd                  ){    this.ofc_cd                  = ofc_cd                     ;    }
    public void setMst_ofc_id             ( String                  mst_ofc_id              ){    this.mst_ofc_id              = mst_ofc_id                 ;    }
    public void setHub_nod_flg            ( String                  hub_nod_flg             ){    this.hub_nod_flg             = hub_nod_flg                ;    }
    public void setAvg_dwll_hrs           ( String                  avg_dwll_hrs            ){    this.avg_dwll_hrs            = avg_dwll_hrs               ;    }
    public void setMin_dwll_hrs           ( String                  min_dwll_hrs            ){    this.min_dwll_hrs            = min_dwll_hrs               ;    }
    public void setYd_chr_cd              ( String                  yd_chr_cd               ){    this.yd_chr_cd               = yd_chr_cd                  ;    }
    public void setYd_fcty_tp_mrn_tml_flg ( String                  yd_fcty_tp_mrn_tml_flg  ){    this.yd_fcty_tp_mrn_tml_flg  = yd_fcty_tp_mrn_tml_flg     ;    }
    public void setYd_fcty_tp_cy_flg      ( String                  yd_fcty_tp_cy_flg       ){    this.yd_fcty_tp_cy_flg       = yd_fcty_tp_cy_flg          ;    }
    public void setYd_fcty_tp_cfs_flg     ( String                  yd_fcty_tp_cfs_flg      ){    this.yd_fcty_tp_cfs_flg      = yd_fcty_tp_cfs_flg         ;    }
    public void setYd_fcty_tp_rail_rmp_flg( String                  yd_fcty_tp_rail_rmp_flg ){    this.yd_fcty_tp_rail_rmp_flg = yd_fcty_tp_rail_rmp_flg    ;    }
    public void setYd_oshp_cd             ( String                  yd_oshp_cd              ){    this.yd_oshp_cd              = yd_oshp_cd                 ;    }
    public void setBd_yd_flg              ( String                  bd_yd_flg               ){    this.bd_yd_flg               = bd_yd_flg                  ;    }
    public void setOnoff_hir_yd_flg       ( String                  onoff_hir_yd_flg        ){    this.onoff_hir_yd_flg        = onoff_hir_yd_flg           ;    }
    public void setYd_ft_hrs              ( String                  yd_ft_hrs               ){    this.yd_ft_hrs               = yd_ft_hrs                  ;    }
    public void setRep_zn_cd              ( String                  rep_zn_cd               ){    this.rep_zn_cd               = rep_zn_cd                  ;    }
    public void setYd_bztp_nm             ( String                  yd_bztp_nm              ){    this.yd_bztp_nm              = yd_bztp_nm                 ;    }
    public void setYd_addr                ( String                  yd_addr                 ){    this.yd_addr                 = yd_addr                    ;    }
    public void setZip_cd                 ( String                  zip_cd                  ){    this.zip_cd                  = zip_cd                     ;    }
    public void setIntl_phn_no            ( String                  intl_phn_no             ){    this.intl_phn_no             = intl_phn_no                ;    }
    public void setCty_area_phn_no        ( String                  cty_area_phn_no         ){    this.cty_area_phn_no         = cty_area_phn_no            ;    }
    public void setPhn_no                 ( String                  phn_no                  ){    this.phn_no                  = phn_no                     ;    }
    public void setIntl_fax_no            ( String                  intl_fax_no             ){    this.intl_fax_no             = intl_fax_no                ;    }
    public void setCty_area_fax_no        ( String                  cty_area_fax_no         ){    this.cty_area_fax_no         = cty_area_fax_no            ;    }
    public void setFax_no                 ( String                  fax_no                  ){    this.fax_no                  = fax_no                     ;    }
    public void setYd_pic_nm              ( String                  yd_pic_nm               ){    this.yd_pic_nm               = yd_pic_nm                  ;    }
    public void setYd_ceo_nm              ( String                  yd_ceo_nm               ){    this.yd_ceo_nm               = yd_ceo_nm                  ;    }
    public void setGate_opn_hr_mnt        ( String                  gate_opn_hr_mnt         ){    this.gate_opn_hr_mnt         = gate_opn_hr_mnt            ;    }
    public void setGate_clz_hr_mnt        ( String                  gate_clz_hr_mnt         ){    this.gate_clz_hr_mnt         = gate_clz_hr_mnt            ;    }
    public void setHol_gate_opn_hr_mnt    ( String                  hol_gate_opn_hr_mnt     ){    this.hol_gate_opn_hr_mnt     = hol_gate_opn_hr_mnt        ;    }
    public void setHol_gate_clz_hr_mnt    ( String                  hol_gate_clz_hr_mnt     ){    this.hol_gate_clz_hr_mnt     = hol_gate_clz_hr_mnt        ;    }
    public void setSun_gate_opn_hr_mnt    ( String                  sun_gate_opn_hr_mnt     ){    this.sun_gate_opn_hr_mnt     = sun_gate_opn_hr_mnt        ;    }
    public void setSun_gate_clz_hr_mnt    ( String                  sun_gate_clz_hr_mnt     ){    this.sun_gate_clz_hr_mnt     = sun_gate_clz_hr_mnt        ;    }
    public void setSat_gate_opn_hr_mnt    ( String                  sat_gate_opn_hr_mnt     ){    this.sat_gate_opn_hr_mnt     = sat_gate_opn_hr_mnt        ;    }
    public void setSat_gate_clz_hr_mnt    ( String                  sat_gate_clz_hr_mnt     ){    this.sat_gate_clz_hr_mnt     = sat_gate_clz_hr_mnt        ;    }
    public void setYd_cgo_clz_hr_mnt      ( String                  yd_cgo_clz_hr_mnt       ){    this.yd_cgo_clz_hr_mnt       = yd_cgo_clz_hr_mnt          ;    }
    public void setYd_rmk                 ( String                  yd_rmk                  ){    this.yd_rmk                  = yd_rmk                     ;    }
    public void setBrth_no                ( String                  brth_no                 ){    this.brth_no                 = brth_no                    ;    }
    public void setYd_brth_len            ( String                  yd_brth_len             ){    this.yd_brth_len             = yd_brth_len                ;    }
    public void setYd_brth_alng_sd_desc   ( String                  yd_brth_alng_sd_desc    ){    this.yd_brth_alng_sd_desc    = yd_brth_alng_sd_desc       ;    }
    public void setYd_brth_dpth_chnl_knt  ( String                  yd_brth_dpth_chnl_knt   ){    this.yd_brth_dpth_chnl_knt   = yd_brth_dpth_chnl_knt      ;    }
    public void setBrth_wdt               ( String                  brth_wdt                ){    this.brth_wdt                = brth_wdt                   ;    }
    public void setYd_ttl_spc             ( String                  yd_ttl_spc              ){    this.yd_ttl_spc              = yd_ttl_spc                 ;    }
    public void setYd_act_spc             ( String                  yd_act_spc              ){    this.yd_act_spc              = yd_act_spc                 ;    }
    public void setYd_hjs_spc             ( String                  yd_hjs_spc              ){    this.yd_hjs_spc              = yd_hjs_spc                 ;    }
    public void setYd_hndl_capa           ( String                  yd_hndl_capa            ){    this.yd_hndl_capa            = yd_hndl_capa               ;    }
    public void setYd_rf_rcpt_440v_knt    ( String                  yd_rf_rcpt_440v_knt     ){    this.yd_rf_rcpt_440v_knt     = yd_rf_rcpt_440v_knt        ;    }
    public void setYd_rf_rcpt_220v_knt    ( String                  yd_rf_rcpt_220v_knt     ){    this.yd_rf_rcpt_220v_knt     = yd_rf_rcpt_220v_knt        ;    }
    public void setYd_rf_rcpt_dul_knt     ( String                  yd_rf_rcpt_dul_knt      ){    this.yd_rf_rcpt_dul_knt      = yd_rf_rcpt_dul_knt         ;    }
    public void setYd_op_sys_cd           ( String                  yd_op_sys_cd            ){    this.yd_op_sys_cd            = yd_op_sys_cd               ;    }
    public void setYd_inr_rail_knt        ( String                  yd_inr_rail_knt         ){    this.yd_inr_rail_knt         = yd_inr_rail_knt            ;    }
    public void setYd_cfs_spc             ( String                  yd_cfs_spc              ){    this.yd_cfs_spc              = yd_cfs_spc                 ;    }
    public void setMnr_shop_flg           ( String                  mnr_shop_flg            ){    this.mnr_shop_flg            = mnr_shop_flg               ;    }
    public void setYd_cmpu_sys_desc       ( String                  yd_cmpu_sys_desc        ){    this.yd_cmpu_sys_desc        = yd_cmpu_sys_desc           ;    }
    public void setYd_hndl_yr             ( String                  yd_hndl_yr              ){    this.yd_hndl_yr              = yd_hndl_yr                 ;    }
    public void setYd_ttl_vol_teu_knt     ( String                  yd_ttl_vol_teu_knt      ){    this.yd_ttl_vol_teu_knt      = yd_ttl_vol_teu_knt         ;    }
    public void setYd_ttl_vol_bx_knt      ( String                  yd_ttl_vol_bx_knt       ){    this.yd_ttl_vol_bx_knt       = yd_ttl_vol_bx_knt          ;    }
    public void setYd_hjs_vol_teu_knt     ( String                  yd_hjs_vol_teu_knt      ){    this.yd_hjs_vol_teu_knt      = yd_hjs_vol_teu_knt         ;    }
    public void setYd_hjs_vol_bx_knt      ( String                  yd_hjs_vol_bx_knt       ){    this.yd_hjs_vol_bx_knt       = yd_hjs_vol_bx_knt          ;    }
    public void setYd_pst_pnm_gcrn_knt    ( String                  yd_pst_pnm_gcrn_knt     ){    this.yd_pst_pnm_gcrn_knt     = yd_pst_pnm_gcrn_knt        ;    }
    public void setYd_pnm_gcrn_knt        ( String                  yd_pnm_gcrn_knt         ){    this.yd_pnm_gcrn_knt         = yd_pnm_gcrn_knt            ;    }
    public void setTrstr_knt              ( String                  trstr_knt               ){    this.trstr_knt               = trstr_knt                  ;    }
    public void setFrk_knt                ( String                  frk_knt                 ){    this.frk_knt                 = frk_knt                    ;    }
    public void setYd_strdl_crrg_knt      ( String                  yd_strdl_crrg_knt       ){    this.yd_strdl_crrg_knt       = yd_strdl_crrg_knt          ;    }
    public void setYd_trct_knt            ( String                  yd_trct_knt             ){    this.yd_trct_knt             = yd_trct_knt                ;    }
    public void setYd_top_lft_knt         ( String                  yd_top_lft_knt          ){    this.yd_top_lft_knt          = yd_top_lft_knt             ;    }
    public void setTml_chss_knt           ( String                  tml_chss_knt            ){    this.tml_chss_knt            = tml_chss_knt               ;    }
    public void setYd_usr_nm              ( String                  yd_usr_nm               ){    this.yd_usr_nm               = yd_usr_nm                  ;    }
    public void setYd_opr_desc            ( String                  yd_opr_desc             ){    this.yd_opr_desc             = yd_opr_desc                ;    }
    public void setEir_svc_flg            ( String                  eir_svc_flg             ){    this.eir_svc_flg             = eir_svc_flg                ;    }
    public void setTml_prod_knt           ( String                  tml_prod_knt            ){    this.tml_prod_knt            = tml_prod_knt               ;    }
    public void setYd_cstms_no            ( String                  yd_cstms_no             ){    this.yd_cstms_no             = yd_cstms_no                ;    }
    public void setYd_irg_nm              ( String                  yd_irg_nm               ){    this.yd_irg_nm               = yd_irg_nm                  ;    }
    public void setYd_fcty_tp_psdo_yd_flg ( String                  yd_fcty_tp_psdo_yd_flg  ){    this.yd_fcty_tp_psdo_yd_flg  = yd_fcty_tp_psdo_yd_flg     ;    }
    public void setYd_loc_ste_cd          ( String                  yd_loc_ste_cd           ){    this.yd_loc_ste_cd           = yd_loc_ste_cd              ;    }
    public void setYd_eml                 ( String                  yd_eml                  ){    this.yd_eml                  = yd_eml                     ;    }
    public void setDem_ib_clt_flg         ( String                  dem_ib_clt_flg          ){    this.dem_ib_clt_flg          = dem_ib_clt_flg             ;    }
    public void setDem_ob_clt_flg         ( String                  dem_ob_clt_flg          ){    this.dem_ob_clt_flg          = dem_ob_clt_flg             ;    }
    public void setBkg_pod_yd_flg         ( String                  bkg_pod_yd_flg          ){    this.bkg_pod_yd_flg          = bkg_pod_yd_flg             ;    }
    public void setBfr_ofc_cd             ( String                  bfr_ofc_cd              ){    this.bfr_ofc_cd              = bfr_ofc_cd                 ;    }
    public void setBfr_mst_ofc_id         ( String                  bfr_mst_ofc_id          ){    this.bfr_mst_ofc_id          = bfr_mst_ofc_id             ;    }
    public void setBfr_ofc_cng_dt         ( String                  bfr_ofc_cng_dt          ){    this.bfr_ofc_cng_dt          = bfr_ofc_cng_dt             ;    }
    public void setCre_usr_id             ( String                  cre_usr_id              ){    this.cre_usr_id              = cre_usr_id                 ;    }
    public void setCre_dt                 ( String                  cre_dt                  ){    this.cre_dt                  = cre_dt                     ;    }
    public void setUpd_usr_id             ( String                  upd_usr_id              ){    this.upd_usr_id              = upd_usr_id                 ;    }
    public void setUpd_dt                 ( String                  upd_dt                  ){    this.upd_dt                  = upd_dt                     ;    }
    public void setDelt_flg               ( String                  delt_flg                ){    this.delt_flg                = delt_flg                   ;    }
    public void setYd_tp_cd               ( String                  yd_tp_cd                ){    this.yd_tp_cd                = yd_tp_cd                   ;    }
    public void setTml_vndr_seq           ( String                  tml_vndr_seq            ){    this.tml_vndr_seq            = tml_vndr_seq               ;    }
    public void setStv_vndr_seq           ( String                  stv_vndr_seq            ){    this.stv_vndr_seq            = stv_vndr_seq               ;    }
    public void setSec_vndr_seq           ( String                  sec_vndr_seq            ){    this.sec_vndr_seq            = sec_vndr_seq               ;    }

    public static MdmYd fromRequest(HttpServletRequest request) {
        MdmYd model = new MdmYd();
        try {
            model.setIbflag                     (JSPUtil.getParameter(request, "ibflag                         ".trim(), ""));
            model.setPage_rows                  (JSPUtil.getParameter(request, "page_rows                      ".trim(), ""));
            model.setYd_cd                      (JSPUtil.getParameter(request, "yd_cd                          ".trim(), ""));
            model.setYd_nm                      (JSPUtil.getParameter(request, "yd_nm                          ".trim(), ""));
            model.setLoc_cd                     (JSPUtil.getParameter(request, "loc_cd                         ".trim(), ""));
            model.setVndr_cnt_cd                (JSPUtil.getParameter(request, "vndr_cnt_cd                    ".trim(), ""));
            model.setVndr_seq                   (JSPUtil.getParameter(request, "vndr_seq                       ".trim(), ""));
            model.setOfc_cd                     (JSPUtil.getParameter(request, "ofc_cd                         ".trim(), ""));
            model.setMst_ofc_id                 (JSPUtil.getParameter(request, "mst_ofc_id                     ".trim(), ""));
            model.setHub_nod_flg                (JSPUtil.getParameter(request, "hub_nod_flg                    ".trim(), ""));
            model.setAvg_dwll_hrs               (JSPUtil.getParameter(request, "avg_dwll_hrs                   ".trim(), ""));
            model.setMin_dwll_hrs               (JSPUtil.getParameter(request, "min_dwll_hrs                   ".trim(), ""));
            model.setYd_chr_cd                  (JSPUtil.getParameter(request, "yd_chr_cd                      ".trim(), ""));
            model.setYd_fcty_tp_mrn_tml_flg     (JSPUtil.getParameter(request, "yd_fcty_tp_mrn_tml_flg         ".trim(), ""));
            model.setYd_fcty_tp_cy_flg          (JSPUtil.getParameter(request, "yd_fcty_tp_cy_flg              ".trim(), ""));
            model.setYd_fcty_tp_cfs_flg         (JSPUtil.getParameter(request, "yd_fcty_tp_cfs_flg             ".trim(), ""));
            model.setYd_fcty_tp_rail_rmp_flg    (JSPUtil.getParameter(request, "yd_fcty_tp_rail_rmp_flg        ".trim(), ""));
            model.setYd_oshp_cd                 (JSPUtil.getParameter(request, "yd_oshp_cd                     ".trim(), ""));
            model.setBd_yd_flg                  (JSPUtil.getParameter(request, "bd_yd_flg                      ".trim(), ""));
            model.setOnoff_hir_yd_flg           (JSPUtil.getParameter(request, "onoff_hir_yd_flg               ".trim(), ""));
            model.setYd_ft_hrs                  (JSPUtil.getParameter(request, "yd_ft_hrs                      ".trim(), ""));
            model.setRep_zn_cd                  (JSPUtil.getParameter(request, "rep_zn_cd                      ".trim(), ""));
            model.setYd_bztp_nm                 (JSPUtil.getParameter(request, "yd_bztp_nm                     ".trim(), ""));
            model.setYd_addr                    (JSPUtil.getParameter(request, "yd_addr                        ".trim(), ""));
            model.setZip_cd                     (JSPUtil.getParameter(request, "zip_cd                         ".trim(), ""));
            model.setIntl_phn_no                (JSPUtil.getParameter(request, "intl_phn_no                    ".trim(), ""));
            model.setCty_area_phn_no            (JSPUtil.getParameter(request, "cty_area_phn_no                ".trim(), ""));
            model.setPhn_no                     (JSPUtil.getParameter(request, "phn_no                         ".trim(), ""));
            model.setIntl_fax_no                (JSPUtil.getParameter(request, "intl_fax_no                    ".trim(), ""));
            model.setCty_area_fax_no            (JSPUtil.getParameter(request, "cty_area_fax_no                ".trim(), ""));
            model.setFax_no                     (JSPUtil.getParameter(request, "fax_no                         ".trim(), ""));
            model.setYd_pic_nm                  (JSPUtil.getParameter(request, "yd_pic_nm                      ".trim(), ""));
            model.setYd_ceo_nm                  (JSPUtil.getParameter(request, "yd_ceo_nm                      ".trim(), ""));
            model.setGate_opn_hr_mnt            (JSPUtil.getParameter(request, "gate_opn_hr_mnt                ".trim(), ""));
            model.setGate_clz_hr_mnt            (JSPUtil.getParameter(request, "gate_clz_hr_mnt                ".trim(), ""));
            model.setHol_gate_opn_hr_mnt        (JSPUtil.getParameter(request, "hol_gate_opn_hr_mnt            ".trim(), ""));
            model.setHol_gate_clz_hr_mnt        (JSPUtil.getParameter(request, "hol_gate_clz_hr_mnt            ".trim(), ""));
            model.setSun_gate_opn_hr_mnt        (JSPUtil.getParameter(request, "sun_gate_opn_hr_mnt            ".trim(), ""));
            model.setSun_gate_clz_hr_mnt        (JSPUtil.getParameter(request, "sun_gate_clz_hr_mnt            ".trim(), ""));
            model.setSat_gate_opn_hr_mnt        (JSPUtil.getParameter(request, "sat_gate_opn_hr_mnt            ".trim(), ""));
            model.setSat_gate_clz_hr_mnt        (JSPUtil.getParameter(request, "sat_gate_clz_hr_mnt            ".trim(), ""));
            model.setYd_cgo_clz_hr_mnt          (JSPUtil.getParameter(request, "yd_cgo_clz_hr_mnt              ".trim(), ""));
            model.setYd_rmk                     (JSPUtil.getParameter(request, "yd_rmk                         ".trim(), ""));
            model.setBrth_no                    (JSPUtil.getParameter(request, "brth_no                        ".trim(), ""));
            model.setYd_brth_len                (JSPUtil.getParameter(request, "yd_brth_len                    ".trim(), ""));
            model.setYd_brth_alng_sd_desc       (JSPUtil.getParameter(request, "yd_brth_alng_sd_desc           ".trim(), ""));
            model.setYd_brth_dpth_chnl_knt      (JSPUtil.getParameter(request, "yd_brth_dpth_chnl_knt          ".trim(), ""));
            model.setBrth_wdt                   (JSPUtil.getParameter(request, "brth_wdt                       ".trim(), ""));
            model.setYd_ttl_spc                 (JSPUtil.getParameter(request, "yd_ttl_spc                     ".trim(), ""));
            model.setYd_act_spc                 (JSPUtil.getParameter(request, "yd_act_spc                     ".trim(), ""));
            model.setYd_hjs_spc                 (JSPUtil.getParameter(request, "yd_hjs_spc                     ".trim(), ""));
            model.setYd_hndl_capa               (JSPUtil.getParameter(request, "yd_hndl_capa                   ".trim(), ""));
            model.setYd_rf_rcpt_440v_knt        (JSPUtil.getParameter(request, "yd_rf_rcpt_440v_knt            ".trim(), ""));
            model.setYd_rf_rcpt_220v_knt        (JSPUtil.getParameter(request, "yd_rf_rcpt_220v_knt            ".trim(), ""));
            model.setYd_rf_rcpt_dul_knt         (JSPUtil.getParameter(request, "yd_rf_rcpt_dul_knt             ".trim(), ""));
            model.setYd_op_sys_cd               (JSPUtil.getParameter(request, "yd_op_sys_cd                   ".trim(), ""));
            model.setYd_inr_rail_knt            (JSPUtil.getParameter(request, "yd_inr_rail_knt                ".trim(), ""));
            model.setYd_cfs_spc                 (JSPUtil.getParameter(request, "yd_cfs_spc                     ".trim(), ""));
            model.setMnr_shop_flg               (JSPUtil.getParameter(request, "mnr_shop_flg                   ".trim(), ""));
            model.setYd_cmpu_sys_desc           (JSPUtil.getParameter(request, "yd_cmpu_sys_desc               ".trim(), ""));
            model.setYd_hndl_yr                 (JSPUtil.getParameter(request, "yd_hndl_yr                     ".trim(), ""));
            model.setYd_ttl_vol_teu_knt         (JSPUtil.getParameter(request, "yd_ttl_vol_teu_knt             ".trim(), ""));
            model.setYd_ttl_vol_bx_knt          (JSPUtil.getParameter(request, "yd_ttl_vol_bx_knt              ".trim(), ""));
            model.setYd_hjs_vol_teu_knt         (JSPUtil.getParameter(request, "yd_hjs_vol_teu_knt             ".trim(), ""));
            model.setYd_hjs_vol_bx_knt          (JSPUtil.getParameter(request, "yd_hjs_vol_bx_knt              ".trim(), ""));
            model.setYd_pst_pnm_gcrn_knt        (JSPUtil.getParameter(request, "yd_pst_pnm_gcrn_knt            ".trim(), ""));
            model.setYd_pnm_gcrn_knt            (JSPUtil.getParameter(request, "yd_pnm_gcrn_knt                ".trim(), ""));
            model.setTrstr_knt                  (JSPUtil.getParameter(request, "trstr_knt                      ".trim(), ""));
            model.setFrk_knt                    (JSPUtil.getParameter(request, "frk_knt                        ".trim(), ""));
            model.setYd_strdl_crrg_knt          (JSPUtil.getParameter(request, "yd_strdl_crrg_knt              ".trim(), ""));
            model.setYd_trct_knt                (JSPUtil.getParameter(request, "yd_trct_knt                    ".trim(), ""));
            model.setYd_top_lft_knt             (JSPUtil.getParameter(request, "yd_top_lft_knt                 ".trim(), ""));
            model.setTml_chss_knt               (JSPUtil.getParameter(request, "tml_chss_knt                   ".trim(), ""));
            model.setYd_usr_nm                  (JSPUtil.getParameter(request, "yd_usr_nm                      ".trim(), ""));
            model.setYd_opr_desc                (JSPUtil.getParameter(request, "yd_opr_desc                    ".trim(), ""));
            model.setEir_svc_flg                (JSPUtil.getParameter(request, "eir_svc_flg                    ".trim(), ""));
            model.setTml_prod_knt               (JSPUtil.getParameter(request, "tml_prod_knt                   ".trim(), ""));
            model.setYd_cstms_no                (JSPUtil.getParameter(request, "yd_cstms_no                    ".trim(), ""));
            model.setYd_irg_nm                  (JSPUtil.getParameter(request, "yd_irg_nm                      ".trim(), ""));
            model.setYd_fcty_tp_psdo_yd_flg     (JSPUtil.getParameter(request, "yd_fcty_tp_psdo_yd_flg         ".trim(), ""));
            model.setYd_loc_ste_cd              (JSPUtil.getParameter(request, "yd_loc_ste_cd                  ".trim(), ""));
            model.setYd_eml                     (JSPUtil.getParameter(request, "yd_eml                         ".trim(), ""));
            model.setDem_ib_clt_flg             (JSPUtil.getParameter(request, "dem_ib_clt_flg                 ".trim(), ""));
            model.setDem_ob_clt_flg             (JSPUtil.getParameter(request, "dem_ob_clt_flg                 ".trim(), ""));
            model.setBkg_pod_yd_flg             (JSPUtil.getParameter(request, "bkg_pod_yd_flg                 ".trim(), ""));
            model.setBfr_ofc_cd                 (JSPUtil.getParameter(request, "bfr_ofc_cd                     ".trim(), ""));
            model.setBfr_mst_ofc_id             (JSPUtil.getParameter(request, "bfr_mst_ofc_id                 ".trim(), ""));
            model.setBfr_ofc_cng_dt             (JSPUtil.getParameter(request, "bfr_ofc_cng_dt                 ".trim(), ""));
            model.setCre_usr_id                 (JSPUtil.getParameter(request, "cre_usr_id                     ".trim(), ""));
            model.setCre_dt                     (JSPUtil.getParameter(request, "cre_dt                         ".trim(), ""));
            model.setUpd_usr_id                 (JSPUtil.getParameter(request, "upd_usr_id                     ".trim(), ""));
            model.setUpd_dt                     (JSPUtil.getParameter(request, "upd_dt                         ".trim(), ""));
            model.setDelt_flg                   (JSPUtil.getParameter(request, "delt_flg                       ".trim(), ""));
            model.setYd_tp_cd                   (JSPUtil.getParameter(request, "yd_tp_cd                       ".trim(), ""));
            model.setTml_vndr_seq               (JSPUtil.getParameter(request, "tml_vndr_seq                   ".trim(), ""));
            model.setStv_vndr_seq               (JSPUtil.getParameter(request, "stv_vndr_seq                   ".trim(), ""));
            model.setSec_vndr_seq               (JSPUtil.getParameter(request, "sec_vndr_seq                   ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        MdmYd model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                  =  (JSPUtil.getParameter(request, "ibflag                         ".trim(), length));
            String[] page_rows               =  (JSPUtil.getParameter(request, "page_rows                      ".trim(), length));
            String[] yd_cd                   =  (JSPUtil.getParameter(request, "yd_cd                          ".trim(), length));
            String[] yd_nm                   =  (JSPUtil.getParameter(request, "yd_nm                          ".trim(), length));
            String[] loc_cd                  =  (JSPUtil.getParameter(request, "loc_cd                         ".trim(), length));
            String[] vndr_cnt_cd             =  (JSPUtil.getParameter(request, "vndr_cnt_cd                    ".trim(), length));
            String[] vndr_seq                =  (JSPUtil.getParameter(request, "vndr_seq                       ".trim(), length));
            String[] ofc_cd                  =  (JSPUtil.getParameter(request, "ofc_cd                         ".trim(), length));
            String[] mst_ofc_id              =  (JSPUtil.getParameter(request, "mst_ofc_id                     ".trim(), length));
            String[] hub_nod_flg             =  (JSPUtil.getParameter(request, "hub_nod_flg                    ".trim(), length));
            String[] avg_dwll_hrs            =  (JSPUtil.getParameter(request, "avg_dwll_hrs                   ".trim(), length));
            String[] min_dwll_hrs            =  (JSPUtil.getParameter(request, "min_dwll_hrs                   ".trim(), length));
            String[] yd_chr_cd               =  (JSPUtil.getParameter(request, "yd_chr_cd                      ".trim(), length));
            String[] yd_fcty_tp_mrn_tml_flg  =  (JSPUtil.getParameter(request, "yd_fcty_tp_mrn_tml_flg         ".trim(), length));
            String[] yd_fcty_tp_cy_flg       =  (JSPUtil.getParameter(request, "yd_fcty_tp_cy_flg              ".trim(), length));
            String[] yd_fcty_tp_cfs_flg      =  (JSPUtil.getParameter(request, "yd_fcty_tp_cfs_flg             ".trim(), length));
            String[] yd_fcty_tp_rail_rmp_flg =  (JSPUtil.getParameter(request, "yd_fcty_tp_rail_rmp_flg        ".trim(), length));
            String[] yd_oshp_cd              =  (JSPUtil.getParameter(request, "yd_oshp_cd                     ".trim(), length));
            String[] bd_yd_flg               =  (JSPUtil.getParameter(request, "bd_yd_flg                      ".trim(), length));
            String[] onoff_hir_yd_flg        =  (JSPUtil.getParameter(request, "onoff_hir_yd_flg               ".trim(), length));
            String[] yd_ft_hrs               =  (JSPUtil.getParameter(request, "yd_ft_hrs                      ".trim(), length));
            String[] rep_zn_cd               =  (JSPUtil.getParameter(request, "rep_zn_cd                      ".trim(), length));
            String[] yd_bztp_nm              =  (JSPUtil.getParameter(request, "yd_bztp_nm                     ".trim(), length));
            String[] yd_addr                 =  (JSPUtil.getParameter(request, "yd_addr                        ".trim(), length));
            String[] zip_cd                  =  (JSPUtil.getParameter(request, "zip_cd                         ".trim(), length));
            String[] intl_phn_no             =  (JSPUtil.getParameter(request, "intl_phn_no                    ".trim(), length));
            String[] cty_area_phn_no         =  (JSPUtil.getParameter(request, "cty_area_phn_no                ".trim(), length));
            String[] phn_no                  =  (JSPUtil.getParameter(request, "phn_no                         ".trim(), length));
            String[] intl_fax_no             =  (JSPUtil.getParameter(request, "intl_fax_no                    ".trim(), length));
            String[] cty_area_fax_no         =  (JSPUtil.getParameter(request, "cty_area_fax_no                ".trim(), length));
            String[] fax_no                  =  (JSPUtil.getParameter(request, "fax_no                         ".trim(), length));
            String[] yd_pic_nm               =  (JSPUtil.getParameter(request, "yd_pic_nm                      ".trim(), length));
            String[] yd_ceo_nm               =  (JSPUtil.getParameter(request, "yd_ceo_nm                      ".trim(), length));
            String[] gate_opn_hr_mnt         =  (JSPUtil.getParameter(request, "gate_opn_hr_mnt                ".trim(), length));
            String[] gate_clz_hr_mnt         =  (JSPUtil.getParameter(request, "gate_clz_hr_mnt                ".trim(), length));
            String[] hol_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, "hol_gate_opn_hr_mnt            ".trim(), length));
            String[] hol_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, "hol_gate_clz_hr_mnt            ".trim(), length));
            String[] sun_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, "sun_gate_opn_hr_mnt            ".trim(), length));
            String[] sun_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, "sun_gate_clz_hr_mnt            ".trim(), length));
            String[] sat_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, "sat_gate_opn_hr_mnt            ".trim(), length));
            String[] sat_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, "sat_gate_clz_hr_mnt            ".trim(), length));
            String[] yd_cgo_clz_hr_mnt       =  (JSPUtil.getParameter(request, "yd_cgo_clz_hr_mnt              ".trim(), length));
            String[] yd_rmk                  =  (JSPUtil.getParameter(request, "yd_rmk                         ".trim(), length));
            String[] brth_no                 =  (JSPUtil.getParameter(request, "brth_no                        ".trim(), length));
            String[] yd_brth_len             =  (JSPUtil.getParameter(request, "yd_brth_len                    ".trim(), length));
            String[] yd_brth_alng_sd_desc    =  (JSPUtil.getParameter(request, "yd_brth_alng_sd_desc           ".trim(), length));
            String[] yd_brth_dpth_chnl_knt   =  (JSPUtil.getParameter(request, "yd_brth_dpth_chnl_knt          ".trim(), length));
            String[] brth_wdt                =  (JSPUtil.getParameter(request, "brth_wdt                       ".trim(), length));
            String[] yd_ttl_spc              =  (JSPUtil.getParameter(request, "yd_ttl_spc                     ".trim(), length));
            String[] yd_act_spc              =  (JSPUtil.getParameter(request, "yd_act_spc                     ".trim(), length));
            String[] yd_hjs_spc              =  (JSPUtil.getParameter(request, "yd_hjs_spc                     ".trim(), length));
            String[] yd_hndl_capa            =  (JSPUtil.getParameter(request, "yd_hndl_capa                   ".trim(), length));
            String[] yd_rf_rcpt_440v_knt     =  (JSPUtil.getParameter(request, "yd_rf_rcpt_440v_knt            ".trim(), length));
            String[] yd_rf_rcpt_220v_knt     =  (JSPUtil.getParameter(request, "yd_rf_rcpt_220v_knt            ".trim(), length));
            String[] yd_rf_rcpt_dul_knt      =  (JSPUtil.getParameter(request, "yd_rf_rcpt_dul_knt             ".trim(), length));
            String[] yd_op_sys_cd            =  (JSPUtil.getParameter(request, "yd_op_sys_cd                   ".trim(), length));
            String[] yd_inr_rail_knt         =  (JSPUtil.getParameter(request, "yd_inr_rail_knt                ".trim(), length));
            String[] yd_cfs_spc              =  (JSPUtil.getParameter(request, "yd_cfs_spc                     ".trim(), length));
            String[] mnr_shop_flg            =  (JSPUtil.getParameter(request, "mnr_shop_flg                   ".trim(), length));
            String[] yd_cmpu_sys_desc        =  (JSPUtil.getParameter(request, "yd_cmpu_sys_desc               ".trim(), length));
            String[] yd_hndl_yr              =  (JSPUtil.getParameter(request, "yd_hndl_yr                     ".trim(), length));
            String[] yd_ttl_vol_teu_knt      =  (JSPUtil.getParameter(request, "yd_ttl_vol_teu_knt             ".trim(), length));
            String[] yd_ttl_vol_bx_knt       =  (JSPUtil.getParameter(request, "yd_ttl_vol_bx_knt              ".trim(), length));
            String[] yd_hjs_vol_teu_knt      =  (JSPUtil.getParameter(request, "yd_hjs_vol_teu_knt             ".trim(), length));
            String[] yd_hjs_vol_bx_knt       =  (JSPUtil.getParameter(request, "yd_hjs_vol_bx_knt              ".trim(), length));
            String[] yd_pst_pnm_gcrn_knt     =  (JSPUtil.getParameter(request, "yd_pst_pnm_gcrn_knt            ".trim(), length));
            String[] yd_pnm_gcrn_knt         =  (JSPUtil.getParameter(request, "yd_pnm_gcrn_knt                ".trim(), length));
            String[] trstr_knt               =  (JSPUtil.getParameter(request, "trstr_knt                      ".trim(), length));
            String[] frk_knt                 =  (JSPUtil.getParameter(request, "frk_knt                        ".trim(), length));
            String[] yd_strdl_crrg_knt       =  (JSPUtil.getParameter(request, "yd_strdl_crrg_knt              ".trim(), length));
            String[] yd_trct_knt             =  (JSPUtil.getParameter(request, "yd_trct_knt                    ".trim(), length));
            String[] yd_top_lft_knt          =  (JSPUtil.getParameter(request, "yd_top_lft_knt                 ".trim(), length));
            String[] tml_chss_knt            =  (JSPUtil.getParameter(request, "tml_chss_knt                   ".trim(), length));
            String[] yd_usr_nm               =  (JSPUtil.getParameter(request, "yd_usr_nm                      ".trim(), length));
            String[] yd_opr_desc             =  (JSPUtil.getParameter(request, "yd_opr_desc                    ".trim(), length));
            String[] eir_svc_flg             =  (JSPUtil.getParameter(request, "eir_svc_flg                    ".trim(), length));
            String[] tml_prod_knt            =  (JSPUtil.getParameter(request, "tml_prod_knt                   ".trim(), length));
            String[] yd_cstms_no             =  (JSPUtil.getParameter(request, "yd_cstms_no                    ".trim(), length));
            String[] yd_irg_nm               =  (JSPUtil.getParameter(request, "yd_irg_nm                      ".trim(), length));
            String[] yd_fcty_tp_psdo_yd_flg  =  (JSPUtil.getParameter(request, "yd_fcty_tp_psdo_yd_flg         ".trim(), length));
            String[] yd_loc_ste_cd           =  (JSPUtil.getParameter(request, "yd_loc_ste_cd                  ".trim(), length));
            String[] yd_eml                  =  (JSPUtil.getParameter(request, "yd_eml                         ".trim(), length));
            String[] dem_ib_clt_flg          =  (JSPUtil.getParameter(request, "dem_ib_clt_flg                 ".trim(), length));
            String[] dem_ob_clt_flg          =  (JSPUtil.getParameter(request, "dem_ob_clt_flg                 ".trim(), length));
            String[] bkg_pod_yd_flg          =  (JSPUtil.getParameter(request, "bkg_pod_yd_flg                 ".trim(), length));
            String[] bfr_ofc_cd              =  (JSPUtil.getParameter(request, "bfr_ofc_cd                     ".trim(), length));
            String[] bfr_mst_ofc_id          =  (JSPUtil.getParameter(request, "bfr_mst_ofc_id                 ".trim(), length));
            String[] bfr_ofc_cng_dt          =  (JSPUtil.getParameter(request, "bfr_ofc_cng_dt                 ".trim(), length));
            String[] cre_usr_id              =  (JSPUtil.getParameter(request, "cre_usr_id                     ".trim(), length));
            String[] cre_dt                  =  (JSPUtil.getParameter(request, "cre_dt                         ".trim(), length));
            String[] upd_usr_id              =  (JSPUtil.getParameter(request, "upd_usr_id                     ".trim(), length));
            String[] upd_dt                  =  (JSPUtil.getParameter(request, "upd_dt                         ".trim(), length));
            String[] delt_flg                =  (JSPUtil.getParameter(request, "delt_flg                       ".trim(), length));
            String[] yd_tp_cd                =  (JSPUtil.getParameter(request, "yd_tp_cd                       ".trim(), length));
            String[] tml_vndr_seq            =  (JSPUtil.getParameter(request, "tml_vndr_seq                   ".trim(), length));
            String[] stv_vndr_seq            =  (JSPUtil.getParameter(request, "stv_vndr_seq                   ".trim(), length));
            String[] sec_vndr_seq            =  (JSPUtil.getParameter(request, "sec_vndr_seq                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new MdmYd();
                model.setIbflag                           (ibflag                     [i]);
                model.setPage_rows                        (page_rows                  [i]);
                model.setYd_cd                            (yd_cd                      [i]);
                model.setYd_nm                            (yd_nm                      [i]);
                model.setLoc_cd                           (loc_cd                     [i]);
                model.setVndr_cnt_cd                      (vndr_cnt_cd                [i]);
                model.setVndr_seq                         (vndr_seq                   [i]);
                model.setOfc_cd                           (ofc_cd                     [i]);
                model.setMst_ofc_id                       (mst_ofc_id                 [i]);
                model.setHub_nod_flg                      (hub_nod_flg                [i]);
                model.setAvg_dwll_hrs                     (avg_dwll_hrs               [i]);
                model.setMin_dwll_hrs                     (min_dwll_hrs               [i]);
                model.setYd_chr_cd                        (yd_chr_cd                  [i]);
                model.setYd_fcty_tp_mrn_tml_flg           (yd_fcty_tp_mrn_tml_flg     [i]);
                model.setYd_fcty_tp_cy_flg                (yd_fcty_tp_cy_flg          [i]);
                model.setYd_fcty_tp_cfs_flg               (yd_fcty_tp_cfs_flg         [i]);
                model.setYd_fcty_tp_rail_rmp_flg          (yd_fcty_tp_rail_rmp_flg    [i]);
                model.setYd_oshp_cd                       (yd_oshp_cd                 [i]);
                model.setBd_yd_flg                        (bd_yd_flg                  [i]);
                model.setOnoff_hir_yd_flg                 (onoff_hir_yd_flg           [i]);
                model.setYd_ft_hrs                        (yd_ft_hrs                  [i]);
                model.setRep_zn_cd                        (rep_zn_cd                  [i]);
                model.setYd_bztp_nm                       (yd_bztp_nm                 [i]);
                model.setYd_addr                          (yd_addr                    [i]);
                model.setZip_cd                           (zip_cd                     [i]);
                model.setIntl_phn_no                      (intl_phn_no                [i]);
                model.setCty_area_phn_no                  (cty_area_phn_no            [i]);
                model.setPhn_no                           (phn_no                     [i]);
                model.setIntl_fax_no                      (intl_fax_no                [i]);
                model.setCty_area_fax_no                  (cty_area_fax_no            [i]);
                model.setFax_no                           (fax_no                     [i]);
                model.setYd_pic_nm                        (yd_pic_nm                  [i]);
                model.setYd_ceo_nm                        (yd_ceo_nm                  [i]);
                model.setGate_opn_hr_mnt                  (gate_opn_hr_mnt            [i]);
                model.setGate_clz_hr_mnt                  (gate_clz_hr_mnt            [i]);
                model.setHol_gate_opn_hr_mnt              (hol_gate_opn_hr_mnt        [i]);
                model.setHol_gate_clz_hr_mnt              (hol_gate_clz_hr_mnt        [i]);
                model.setSun_gate_opn_hr_mnt              (sun_gate_opn_hr_mnt        [i]);
                model.setSun_gate_clz_hr_mnt              (sun_gate_clz_hr_mnt        [i]);
                model.setSat_gate_opn_hr_mnt              (sat_gate_opn_hr_mnt        [i]);
                model.setSat_gate_clz_hr_mnt              (sat_gate_clz_hr_mnt        [i]);
                model.setYd_cgo_clz_hr_mnt                (yd_cgo_clz_hr_mnt          [i]);
                model.setYd_rmk                           (yd_rmk                     [i]);
                model.setBrth_no                          (brth_no                    [i]);
                model.setYd_brth_len                      (yd_brth_len                [i]);
                model.setYd_brth_alng_sd_desc             (yd_brth_alng_sd_desc       [i]);
                model.setYd_brth_dpth_chnl_knt            (yd_brth_dpth_chnl_knt      [i]);
                model.setBrth_wdt                         (brth_wdt                   [i]);
                model.setYd_ttl_spc                       (yd_ttl_spc                 [i]);
                model.setYd_act_spc                       (yd_act_spc                 [i]);
                model.setYd_hjs_spc                       (yd_hjs_spc                 [i]);
                model.setYd_hndl_capa                     (yd_hndl_capa               [i]);
                model.setYd_rf_rcpt_440v_knt              (yd_rf_rcpt_440v_knt        [i]);
                model.setYd_rf_rcpt_220v_knt              (yd_rf_rcpt_220v_knt        [i]);
                model.setYd_rf_rcpt_dul_knt               (yd_rf_rcpt_dul_knt         [i]);
                model.setYd_op_sys_cd                     (yd_op_sys_cd               [i]);
                model.setYd_inr_rail_knt                  (yd_inr_rail_knt            [i]);
                model.setYd_cfs_spc                       (yd_cfs_spc                 [i]);
                model.setMnr_shop_flg                     (mnr_shop_flg               [i]);
                model.setYd_cmpu_sys_desc                 (yd_cmpu_sys_desc           [i]);
                model.setYd_hndl_yr                       (yd_hndl_yr                 [i]);
                model.setYd_ttl_vol_teu_knt               (yd_ttl_vol_teu_knt         [i]);
                model.setYd_ttl_vol_bx_knt                (yd_ttl_vol_bx_knt          [i]);
                model.setYd_hjs_vol_teu_knt               (yd_hjs_vol_teu_knt         [i]);
                model.setYd_hjs_vol_bx_knt                (yd_hjs_vol_bx_knt          [i]);
                model.setYd_pst_pnm_gcrn_knt              (yd_pst_pnm_gcrn_knt        [i]);
                model.setYd_pnm_gcrn_knt                  (yd_pnm_gcrn_knt            [i]);
                model.setTrstr_knt                        (trstr_knt                  [i]);
                model.setFrk_knt                          (frk_knt                    [i]);
                model.setYd_strdl_crrg_knt                (yd_strdl_crrg_knt          [i]);
                model.setYd_trct_knt                      (yd_trct_knt                [i]);
                model.setYd_top_lft_knt                   (yd_top_lft_knt             [i]);
                model.setTml_chss_knt                     (tml_chss_knt               [i]);
                model.setYd_usr_nm                        (yd_usr_nm                  [i]);
                model.setYd_opr_desc                      (yd_opr_desc                [i]);
                model.setEir_svc_flg                      (eir_svc_flg                [i]);
                model.setTml_prod_knt                     (tml_prod_knt               [i]);
                model.setYd_cstms_no                      (yd_cstms_no                [i]);
                model.setYd_irg_nm                        (yd_irg_nm                  [i]);
                model.setYd_fcty_tp_psdo_yd_flg           (yd_fcty_tp_psdo_yd_flg     [i]);
                model.setYd_loc_ste_cd                    (yd_loc_ste_cd              [i]);
                model.setYd_eml                           (yd_eml                     [i]);
                model.setDem_ib_clt_flg                   (dem_ib_clt_flg             [i]);
                model.setDem_ob_clt_flg                   (dem_ob_clt_flg             [i]);
                model.setBkg_pod_yd_flg                   (bkg_pod_yd_flg             [i]);
                model.setBfr_ofc_cd                       (bfr_ofc_cd                 [i]);
                model.setBfr_mst_ofc_id                   (bfr_mst_ofc_id             [i]);
                model.setBfr_ofc_cng_dt                   (bfr_ofc_cng_dt             [i]);
                model.setCre_usr_id                       (cre_usr_id                 [i]);
                model.setCre_dt                           (cre_dt                     [i]);
                model.setUpd_usr_id                       (upd_usr_id                 [i]);
                model.setUpd_dt                           (upd_dt                     [i]);
                model.setDelt_flg                         (delt_flg                   [i]);
                model.setYd_tp_cd                         (yd_tp_cd                   [i]);
                model.setTml_vndr_seq                     (tml_vndr_seq               [i]);
                model.setStv_vndr_seq                     (stv_vndr_seq               [i]);
                model.setSec_vndr_seq                     (sec_vndr_seq               [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        MdmYd model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                  =  (JSPUtil.getParameter(request, prefix + "ibflag                         ".trim(), length));
            String[] page_rows               =  (JSPUtil.getParameter(request, prefix + "page_rows                      ".trim(), length));
            String[] yd_cd                   =  (JSPUtil.getParameter(request, prefix + "yd_cd                          ".trim(), length));
            String[] yd_nm                   =  (JSPUtil.getParameter(request, prefix + "yd_nm                          ".trim(), length));
            String[] loc_cd                  =  (JSPUtil.getParameter(request, prefix + "loc_cd                         ".trim(), length));
            String[] vndr_cnt_cd             =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd                    ".trim(), length));
            String[] vndr_seq                =  (JSPUtil.getParameter(request, prefix + "vndr_seq                       ".trim(), length));
            String[] ofc_cd                  =  (JSPUtil.getParameter(request, prefix + "ofc_cd                         ".trim(), length));
            String[] mst_ofc_id              =  (JSPUtil.getParameter(request, prefix + "mst_ofc_id                     ".trim(), length));
            String[] hub_nod_flg             =  (JSPUtil.getParameter(request, prefix + "hub_nod_flg                    ".trim(), length));
            String[] avg_dwll_hrs            =  (JSPUtil.getParameter(request, prefix + "avg_dwll_hrs                   ".trim(), length));
            String[] min_dwll_hrs            =  (JSPUtil.getParameter(request, prefix + "min_dwll_hrs                   ".trim(), length));
            String[] yd_chr_cd               =  (JSPUtil.getParameter(request, prefix + "yd_chr_cd                      ".trim(), length));
            String[] yd_fcty_tp_mrn_tml_flg  =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_mrn_tml_flg         ".trim(), length));
            String[] yd_fcty_tp_cy_flg       =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cy_flg              ".trim(), length));
            String[] yd_fcty_tp_cfs_flg      =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cfs_flg             ".trim(), length));
            String[] yd_fcty_tp_rail_rmp_flg =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_rail_rmp_flg        ".trim(), length));
            String[] yd_oshp_cd              =  (JSPUtil.getParameter(request, prefix + "yd_oshp_cd                     ".trim(), length));
            String[] bd_yd_flg               =  (JSPUtil.getParameter(request, prefix + "bd_yd_flg                      ".trim(), length));
            String[] onoff_hir_yd_flg        =  (JSPUtil.getParameter(request, prefix + "onoff_hir_yd_flg               ".trim(), length));
            String[] yd_ft_hrs               =  (JSPUtil.getParameter(request, prefix + "yd_ft_hrs                      ".trim(), length));
            String[] rep_zn_cd               =  (JSPUtil.getParameter(request, prefix + "rep_zn_cd                      ".trim(), length));
            String[] yd_bztp_nm              =  (JSPUtil.getParameter(request, prefix + "yd_bztp_nm                     ".trim(), length));
            String[] yd_addr                 =  (JSPUtil.getParameter(request, prefix + "yd_addr                        ".trim(), length));
            String[] zip_cd                  =  (JSPUtil.getParameter(request, prefix + "zip_cd                         ".trim(), length));
            String[] intl_phn_no             =  (JSPUtil.getParameter(request, prefix + "intl_phn_no                    ".trim(), length));
            String[] cty_area_phn_no         =  (JSPUtil.getParameter(request, prefix + "cty_area_phn_no                ".trim(), length));
            String[] phn_no                  =  (JSPUtil.getParameter(request, prefix + "phn_no                         ".trim(), length));
            String[] intl_fax_no             =  (JSPUtil.getParameter(request, prefix + "intl_fax_no                    ".trim(), length));
            String[] cty_area_fax_no         =  (JSPUtil.getParameter(request, prefix + "cty_area_fax_no                ".trim(), length));
            String[] fax_no                  =  (JSPUtil.getParameter(request, prefix + "fax_no                         ".trim(), length));
            String[] yd_pic_nm               =  (JSPUtil.getParameter(request, prefix + "yd_pic_nm                      ".trim(), length));
            String[] yd_ceo_nm               =  (JSPUtil.getParameter(request, prefix + "yd_ceo_nm                      ".trim(), length));
            String[] gate_opn_hr_mnt         =  (JSPUtil.getParameter(request, prefix + "gate_opn_hr_mnt                ".trim(), length));
            String[] gate_clz_hr_mnt         =  (JSPUtil.getParameter(request, prefix + "gate_clz_hr_mnt                ".trim(), length));
            String[] hol_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "hol_gate_opn_hr_mnt            ".trim(), length));
            String[] hol_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "hol_gate_clz_hr_mnt            ".trim(), length));
            String[] sun_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "sun_gate_opn_hr_mnt            ".trim(), length));
            String[] sun_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "sun_gate_clz_hr_mnt            ".trim(), length));
            String[] sat_gate_opn_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "sat_gate_opn_hr_mnt            ".trim(), length));
            String[] sat_gate_clz_hr_mnt     =  (JSPUtil.getParameter(request, prefix + "sat_gate_clz_hr_mnt            ".trim(), length));
            String[] yd_cgo_clz_hr_mnt       =  (JSPUtil.getParameter(request, prefix + "yd_cgo_clz_hr_mnt              ".trim(), length));
            String[] yd_rmk                  =  (JSPUtil.getParameter(request, prefix + "yd_rmk                         ".trim(), length));
            String[] brth_no                 =  (JSPUtil.getParameter(request, prefix + "brth_no                        ".trim(), length));
            String[] yd_brth_len             =  (JSPUtil.getParameter(request, prefix + "yd_brth_len                    ".trim(), length));
            String[] yd_brth_alng_sd_desc    =  (JSPUtil.getParameter(request, prefix + "yd_brth_alng_sd_desc           ".trim(), length));
            String[] yd_brth_dpth_chnl_knt   =  (JSPUtil.getParameter(request, prefix + "yd_brth_dpth_chnl_knt          ".trim(), length));
            String[] brth_wdt                =  (JSPUtil.getParameter(request, prefix + "brth_wdt                       ".trim(), length));
            String[] yd_ttl_spc              =  (JSPUtil.getParameter(request, prefix + "yd_ttl_spc                     ".trim(), length));
            String[] yd_act_spc              =  (JSPUtil.getParameter(request, prefix + "yd_act_spc                     ".trim(), length));
            String[] yd_hjs_spc              =  (JSPUtil.getParameter(request, prefix + "yd_hjs_spc                     ".trim(), length));
            String[] yd_hndl_capa            =  (JSPUtil.getParameter(request, prefix + "yd_hndl_capa                   ".trim(), length));
            String[] yd_rf_rcpt_440v_knt     =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_440v_knt            ".trim(), length));
            String[] yd_rf_rcpt_220v_knt     =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_220v_knt            ".trim(), length));
            String[] yd_rf_rcpt_dul_knt      =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_dul_knt             ".trim(), length));
            String[] yd_op_sys_cd            =  (JSPUtil.getParameter(request, prefix + "yd_op_sys_cd                   ".trim(), length));
            String[] yd_inr_rail_knt         =  (JSPUtil.getParameter(request, prefix + "yd_inr_rail_knt                ".trim(), length));
            String[] yd_cfs_spc              =  (JSPUtil.getParameter(request, prefix + "yd_cfs_spc                     ".trim(), length));
            String[] mnr_shop_flg            =  (JSPUtil.getParameter(request, prefix + "mnr_shop_flg                   ".trim(), length));
            String[] yd_cmpu_sys_desc        =  (JSPUtil.getParameter(request, prefix + "yd_cmpu_sys_desc               ".trim(), length));
            String[] yd_hndl_yr              =  (JSPUtil.getParameter(request, prefix + "yd_hndl_yr                     ".trim(), length));
            String[] yd_ttl_vol_teu_knt      =  (JSPUtil.getParameter(request, prefix + "yd_ttl_vol_teu_knt             ".trim(), length));
            String[] yd_ttl_vol_bx_knt       =  (JSPUtil.getParameter(request, prefix + "yd_ttl_vol_bx_knt              ".trim(), length));
            String[] yd_hjs_vol_teu_knt      =  (JSPUtil.getParameter(request, prefix + "yd_hjs_vol_teu_knt             ".trim(), length));
            String[] yd_hjs_vol_bx_knt       =  (JSPUtil.getParameter(request, prefix + "yd_hjs_vol_bx_knt              ".trim(), length));
            String[] yd_pst_pnm_gcrn_knt     =  (JSPUtil.getParameter(request, prefix + "yd_pst_pnm_gcrn_knt            ".trim(), length));
            String[] yd_pnm_gcrn_knt         =  (JSPUtil.getParameter(request, prefix + "yd_pnm_gcrn_knt                ".trim(), length));
            String[] trstr_knt               =  (JSPUtil.getParameter(request, prefix + "trstr_knt                      ".trim(), length));
            String[] frk_knt                 =  (JSPUtil.getParameter(request, prefix + "frk_knt                        ".trim(), length));
            String[] yd_strdl_crrg_knt       =  (JSPUtil.getParameter(request, prefix + "yd_strdl_crrg_knt              ".trim(), length));
            String[] yd_trct_knt             =  (JSPUtil.getParameter(request, prefix + "yd_trct_knt                    ".trim(), length));
            String[] yd_top_lft_knt          =  (JSPUtil.getParameter(request, prefix + "yd_top_lft_knt                 ".trim(), length));
            String[] tml_chss_knt            =  (JSPUtil.getParameter(request, prefix + "tml_chss_knt                   ".trim(), length));
            String[] yd_usr_nm               =  (JSPUtil.getParameter(request, prefix + "yd_usr_nm                      ".trim(), length));
            String[] yd_opr_desc             =  (JSPUtil.getParameter(request, prefix + "yd_opr_desc                    ".trim(), length));
            String[] eir_svc_flg             =  (JSPUtil.getParameter(request, prefix + "eir_svc_flg                    ".trim(), length));
            String[] tml_prod_knt            =  (JSPUtil.getParameter(request, prefix + "tml_prod_knt                   ".trim(), length));
            String[] yd_cstms_no             =  (JSPUtil.getParameter(request, prefix + "yd_cstms_no                    ".trim(), length));
            String[] yd_irg_nm               =  (JSPUtil.getParameter(request, prefix + "yd_irg_nm                      ".trim(), length));
            String[] yd_fcty_tp_psdo_yd_flg  =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_psdo_yd_flg         ".trim(), length));
            String[] yd_loc_ste_cd           =  (JSPUtil.getParameter(request, prefix + "yd_loc_ste_cd                  ".trim(), length));
            String[] yd_eml                  =  (JSPUtil.getParameter(request, prefix + "yd_eml                         ".trim(), length));
            String[] dem_ib_clt_flg          =  (JSPUtil.getParameter(request, prefix + "dem_ib_clt_flg                 ".trim(), length));
            String[] dem_ob_clt_flg          =  (JSPUtil.getParameter(request, prefix + "dem_ob_clt_flg                 ".trim(), length));
            String[] bkg_pod_yd_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_pod_yd_flg                 ".trim(), length));
            String[] bfr_ofc_cd              =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cd                     ".trim(), length));
            String[] bfr_mst_ofc_id          =  (JSPUtil.getParameter(request, prefix + "bfr_mst_ofc_id                 ".trim(), length));
            String[] bfr_ofc_cng_dt          =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt                 ".trim(), length));
            String[] cre_usr_id              =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                     ".trim(), length));
            String[] cre_dt                  =  (JSPUtil.getParameter(request, prefix + "cre_dt                         ".trim(), length));
            String[] upd_usr_id              =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                     ".trim(), length));
            String[] upd_dt                  =  (JSPUtil.getParameter(request, prefix + "upd_dt                         ".trim(), length));
            String[] delt_flg                =  (JSPUtil.getParameter(request, prefix + "delt_flg                       ".trim(), length));
            String[] yd_tp_cd                =  (JSPUtil.getParameter(request, prefix + "yd_tp_cd                       ".trim(), length));
            String[] tml_vndr_seq            =  (JSPUtil.getParameter(request, prefix + "tml_vndr_seq                   ".trim(), length));
            String[] stv_vndr_seq            =  (JSPUtil.getParameter(request, prefix + "stv_vndr_seq                   ".trim(), length));
            String[] sec_vndr_seq            =  (JSPUtil.getParameter(request, prefix + "sec_vndr_seq                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new MdmYd();
                model.setIbflag                           ( ibflag                     [i]);
                model.setPage_rows                        ( page_rows                  [i]);
                model.setYd_cd                            ( yd_cd                      [i]);
                model.setYd_nm                            ( yd_nm                      [i]);
                model.setLoc_cd                           ( loc_cd                     [i]);
                model.setVndr_cnt_cd                      ( vndr_cnt_cd                [i]);
                model.setVndr_seq                         ( vndr_seq                   [i]);
                model.setOfc_cd                           ( ofc_cd                     [i]);
                model.setMst_ofc_id                       ( mst_ofc_id                 [i]);
                model.setHub_nod_flg                      ( hub_nod_flg                [i]);
                model.setAvg_dwll_hrs                     ( avg_dwll_hrs               [i]);
                model.setMin_dwll_hrs                     ( min_dwll_hrs               [i]);
                model.setYd_chr_cd                        ( yd_chr_cd                  [i]);
                model.setYd_fcty_tp_mrn_tml_flg           ( yd_fcty_tp_mrn_tml_flg     [i]);
                model.setYd_fcty_tp_cy_flg                ( yd_fcty_tp_cy_flg          [i]);
                model.setYd_fcty_tp_cfs_flg               ( yd_fcty_tp_cfs_flg         [i]);
                model.setYd_fcty_tp_rail_rmp_flg          ( yd_fcty_tp_rail_rmp_flg    [i]);
                model.setYd_oshp_cd                       ( yd_oshp_cd                 [i]);
                model.setBd_yd_flg                        ( bd_yd_flg                  [i]);
                model.setOnoff_hir_yd_flg                 ( onoff_hir_yd_flg           [i]);
                model.setYd_ft_hrs                        ( yd_ft_hrs                  [i]);
                model.setRep_zn_cd                        ( rep_zn_cd                  [i]);
                model.setYd_bztp_nm                       ( yd_bztp_nm                 [i]);
                model.setYd_addr                          ( yd_addr                    [i]);
                model.setZip_cd                           ( zip_cd                     [i]);
                model.setIntl_phn_no                      ( intl_phn_no                [i]);
                model.setCty_area_phn_no                  ( cty_area_phn_no            [i]);
                model.setPhn_no                           ( phn_no                     [i]);
                model.setIntl_fax_no                      ( intl_fax_no                [i]);
                model.setCty_area_fax_no                  ( cty_area_fax_no            [i]);
                model.setFax_no                           ( fax_no                     [i]);
                model.setYd_pic_nm                        ( yd_pic_nm                  [i]);
                model.setYd_ceo_nm                        ( yd_ceo_nm                  [i]);
                model.setGate_opn_hr_mnt                  ( gate_opn_hr_mnt            [i]);
                model.setGate_clz_hr_mnt                  ( gate_clz_hr_mnt            [i]);
                model.setHol_gate_opn_hr_mnt              ( hol_gate_opn_hr_mnt        [i]);
                model.setHol_gate_clz_hr_mnt              ( hol_gate_clz_hr_mnt        [i]);
                model.setSun_gate_opn_hr_mnt              ( sun_gate_opn_hr_mnt        [i]);
                model.setSun_gate_clz_hr_mnt              ( sun_gate_clz_hr_mnt        [i]);
                model.setSat_gate_opn_hr_mnt              ( sat_gate_opn_hr_mnt        [i]);
                model.setSat_gate_clz_hr_mnt              ( sat_gate_clz_hr_mnt        [i]);
                model.setYd_cgo_clz_hr_mnt                ( yd_cgo_clz_hr_mnt          [i]);
                model.setYd_rmk                           ( yd_rmk                     [i]);
                model.setBrth_no                          ( brth_no                    [i]);
                model.setYd_brth_len                      ( yd_brth_len                [i]);
                model.setYd_brth_alng_sd_desc             ( yd_brth_alng_sd_desc       [i]);
                model.setYd_brth_dpth_chnl_knt            ( yd_brth_dpth_chnl_knt      [i]);
                model.setBrth_wdt                         ( brth_wdt                   [i]);
                model.setYd_ttl_spc                       ( yd_ttl_spc                 [i]);
                model.setYd_act_spc                       ( yd_act_spc                 [i]);
                model.setYd_hjs_spc                       ( yd_hjs_spc                 [i]);
                model.setYd_hndl_capa                     ( yd_hndl_capa               [i]);
                model.setYd_rf_rcpt_440v_knt              ( yd_rf_rcpt_440v_knt        [i]);
                model.setYd_rf_rcpt_220v_knt              ( yd_rf_rcpt_220v_knt        [i]);
                model.setYd_rf_rcpt_dul_knt               ( yd_rf_rcpt_dul_knt         [i]);
                model.setYd_op_sys_cd                     ( yd_op_sys_cd               [i]);
                model.setYd_inr_rail_knt                  ( yd_inr_rail_knt            [i]);
                model.setYd_cfs_spc                       ( yd_cfs_spc                 [i]);
                model.setMnr_shop_flg                     ( mnr_shop_flg               [i]);
                model.setYd_cmpu_sys_desc                 ( yd_cmpu_sys_desc           [i]);
                model.setYd_hndl_yr                       ( yd_hndl_yr                 [i]);
                model.setYd_ttl_vol_teu_knt               ( yd_ttl_vol_teu_knt         [i]);
                model.setYd_ttl_vol_bx_knt                ( yd_ttl_vol_bx_knt          [i]);
                model.setYd_hjs_vol_teu_knt               ( yd_hjs_vol_teu_knt         [i]);
                model.setYd_hjs_vol_bx_knt                ( yd_hjs_vol_bx_knt          [i]);
                model.setYd_pst_pnm_gcrn_knt              ( yd_pst_pnm_gcrn_knt        [i]);
                model.setYd_pnm_gcrn_knt                  ( yd_pnm_gcrn_knt            [i]);
                model.setTrstr_knt                        ( trstr_knt                  [i]);
                model.setFrk_knt                          ( frk_knt                    [i]);
                model.setYd_strdl_crrg_knt                ( yd_strdl_crrg_knt          [i]);
                model.setYd_trct_knt                      ( yd_trct_knt                [i]);
                model.setYd_top_lft_knt                   ( yd_top_lft_knt             [i]);
                model.setTml_chss_knt                     ( tml_chss_knt               [i]);
                model.setYd_usr_nm                        ( yd_usr_nm                  [i]);
                model.setYd_opr_desc                      ( yd_opr_desc                [i]);
                model.setEir_svc_flg                      ( eir_svc_flg                [i]);
                model.setTml_prod_knt                     ( tml_prod_knt               [i]);
                model.setYd_cstms_no                      ( yd_cstms_no                [i]);
                model.setYd_irg_nm                        ( yd_irg_nm                  [i]);
                model.setYd_fcty_tp_psdo_yd_flg           ( yd_fcty_tp_psdo_yd_flg     [i]);
                model.setYd_loc_ste_cd                    ( yd_loc_ste_cd              [i]);
                model.setYd_eml                           ( yd_eml                     [i]);
                model.setDem_ib_clt_flg                   ( dem_ib_clt_flg             [i]);
                model.setDem_ob_clt_flg                   ( dem_ob_clt_flg             [i]);
                model.setBkg_pod_yd_flg                   ( bkg_pod_yd_flg             [i]);
                model.setBfr_ofc_cd                       ( bfr_ofc_cd                 [i]);
                model.setBfr_mst_ofc_id                   ( bfr_mst_ofc_id             [i]);
                model.setBfr_ofc_cng_dt                   ( bfr_ofc_cng_dt             [i]);
                model.setCre_usr_id                       ( cre_usr_id                 [i]);
                model.setCre_dt                           ( cre_dt                     [i]);
                model.setUpd_usr_id                       ( upd_usr_id                 [i]);
                model.setUpd_dt                           ( upd_dt                     [i]);
                model.setDelt_flg                         ( delt_flg                   [i]);
                model.setYd_tp_cd                         ( yd_tp_cd                   [i]);
                model.setTml_vndr_seq                     ( tml_vndr_seq               [i]);
                model.setStv_vndr_seq                     ( stv_vndr_seq               [i]);
                model.setSec_vndr_seq                     ( sec_vndr_seq               [i]);
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
