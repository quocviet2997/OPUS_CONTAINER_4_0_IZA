/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OFFICE.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
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
 */public final class OFFICE implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            ofc_cd            = "";
    private String            ofc_nm            = "";
    private String            ofc_addr          = "";
    private String            ofc_zip           = "";
    private String            ofc_kind1         = "";
    private String            ofc_kind2         = "";
    private String            cnt_cd            = "";
    private String            vndr_seq          = "";
    private String            ofc_mgr_cd        = "";
    private String            ofc_mgr_tit       = "";
    private String            ofc_mgr_nm        = "";
    private String            ofc_tel           = "";
    private String            ofc_fax           = "";
    private String            ofc_ip_addr       = "";
    private String            ofc_pts_cd        = "";
    private String            ofc_pts_lo        = "";
    private String            ofc_psn_qty       = "";
    private String            ofc_rmk           = "";
    private String            loc_cd            = "";
    private String            ofc_spc_qty_ind   = "";
    private String            ofc_spc_ptc_cd    = "";
    private String            ofc_spc_level     = "";
    private String            ofc_frgn          = "";
    private String            curr_cd1          = "";
    private String            curr_cd2          = "";
    private String            ofc_center        = "";
    private String            ofc_ho_acct       = "";
    private String            ofc_open_dt       = "";
    private String            ofc_close_dt      = "";
    private String            ofc_del_mark      = "";
    private String            ofc_reg_dt        = "";
    private String            ofc_updt_dt       = "";
    private String            ofc_user_id       = "";
    private String            ofc_ar_rev        = "";
    private String            ofc_ar_hq         = "";
    private String            ofc_ar_control    = "";
    private String            ofc_ap_ho_acct    = "";
    private String            ofc_fa_ho_acct    = "";
    private String            ofc_ib_crd_term   = "";
    private String            ofc_ob_crd_term   = "";
    private String            ofc_agt_mk        = "";
    private String            ofc_rep_cnt_cd    = "";
    private String            ofc_rep_cust_cd   = "";
    private String            ofc_inv_prefix    = "";
    private String            ofc_ap_fin_ofc    = "";
    private String            ofc_ap_fin_ctr    = "";
    private String            ofc_ap_ctrl_ofc   = "";
    private String            ofc_agent_mark    = "";
    private String            ofc_eur_lcl_rate  = "";
    private String            ofc_vat_rate      = "";
    private String            ofc_ap_eur_mark   = "";
    private String            ofc_ap_eur_rate   = "";
    private String            ofc_ems_ctr       = "";
    private String            ofc_ems_ctr_eng   = "";
    private String            dsen_control_ofc  = "";
    private String            dsen_credit_term  = "";
    private String            nis_event_dt      = "";
    private String            agt_so_mark       = "";
    private String            ofc_spc_sen_ind   = "";
    private String            ofc_spc_sen_ptcd  = "";
    private String            ofc_spc_sen_level = "";
    private String            ofc_ap_emu_mk     = "";
    private String            eur_org_cur       = "";
    private String            usa_bkg_no_chk    = "";
    private String            ofc_ap_pay_mk     = "";
    private String            ofc_ap_pay_div    = "";
    private String            ofc_sal_del       = "";
    private String            ofc_sal_div       = "";
    private String            ofc_ap_inv_div    = "";
    private String            ofc_ap_pay_curr   = "";
    private String            fax_ip_addr       = "";
    private String            ofc_rfa_sc        = "";
    private String            ofc_oprn          = "";
    private String            ofc_finan         = "";
    private String            m_ofc_cd          = "";
    private String            m_mst_ofc_id      = "";
    private String            m_ofc_knd_cd      = "";
    private String            m_agn_knd_cd      = "";

    public OFFICE(){}

    public OFFICE(
            String            ibflag           ,
            String            page_rows        ,
            String            ofc_cd           ,
            String            ofc_nm           ,
            String            ofc_addr         ,
            String            ofc_zip          ,
            String            ofc_kind1        ,
            String            ofc_kind2        ,
            String            cnt_cd           ,
            String            vndr_seq         ,
            String            ofc_mgr_cd       ,
            String            ofc_mgr_tit      ,
            String            ofc_mgr_nm       ,
            String            ofc_tel          ,
            String            ofc_fax          ,
            String            ofc_ip_addr      ,
            String            ofc_pts_cd       ,
            String            ofc_pts_lo       ,
            String            ofc_psn_qty      ,
            String            ofc_rmk          ,
            String            loc_cd           ,
            String            ofc_spc_qty_ind  ,
            String            ofc_spc_ptc_cd   ,
            String            ofc_spc_level    ,
            String            ofc_frgn         ,
            String            curr_cd1         ,
            String            curr_cd2         ,
            String            ofc_center       ,
            String            ofc_ho_acct      ,
            String            ofc_open_dt      ,
            String            ofc_close_dt     ,
            String            ofc_del_mark     ,
            String            ofc_reg_dt       ,
            String            ofc_updt_dt      ,
            String            ofc_user_id      ,
            String            ofc_ar_rev       ,
            String            ofc_ar_hq        ,
            String            ofc_ar_control   ,
            String            ofc_ap_ho_acct   ,
            String            ofc_fa_ho_acct   ,
            String            ofc_ib_crd_term  ,
            String            ofc_ob_crd_term  ,
            String            ofc_agt_mk       ,
            String            ofc_rep_cnt_cd   ,
            String            ofc_rep_cust_cd  ,
            String            ofc_inv_prefix   ,
            String            ofc_ap_fin_ofc   ,
            String            ofc_ap_fin_ctr   ,
            String            ofc_ap_ctrl_ofc  ,
            String            ofc_agent_mark   ,
            String            ofc_eur_lcl_rate ,
            String            ofc_vat_rate     ,
            String            ofc_ap_eur_mark  ,
            String            ofc_ap_eur_rate  ,
            String            ofc_ems_ctr      ,
            String            ofc_ems_ctr_eng  ,
            String            dsen_control_ofc ,
            String            dsen_credit_term ,
            String            nis_event_dt     ,
            String            agt_so_mark      ,
            String            ofc_spc_sen_ind  ,
            String            ofc_spc_sen_ptcd ,
            String            ofc_spc_sen_level,
            String            ofc_ap_emu_mk    ,
            String            eur_org_cur      ,
            String            usa_bkg_no_chk   ,
            String            ofc_ap_pay_mk    ,
            String            ofc_ap_pay_div   ,
            String            ofc_sal_del      ,
            String            ofc_sal_div      ,
            String            ofc_ap_inv_div   ,
            String            ofc_ap_pay_curr  ,
            String            fax_ip_addr      ,
            String            ofc_rfa_sc       ,
            String            ofc_oprn         ,
            String            ofc_finan        ,
            String            m_ofc_cd         ,
            String            m_mst_ofc_id     ,
            String            m_ofc_knd_cd     ,
            String            m_agn_knd_cd     ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.ofc_cd            = ofc_cd           ;
        this.ofc_nm            = ofc_nm           ;
        this.ofc_addr          = ofc_addr         ;
        this.ofc_zip           = ofc_zip          ;
        this.ofc_kind1         = ofc_kind1        ;
        this.ofc_kind2         = ofc_kind2        ;
        this.cnt_cd            = cnt_cd           ;
        this.vndr_seq          = vndr_seq         ;
        this.ofc_mgr_cd        = ofc_mgr_cd       ;
        this.ofc_mgr_tit       = ofc_mgr_tit      ;
        this.ofc_mgr_nm        = ofc_mgr_nm       ;
        this.ofc_tel           = ofc_tel          ;
        this.ofc_fax           = ofc_fax          ;
        this.ofc_ip_addr       = ofc_ip_addr      ;
        this.ofc_pts_cd        = ofc_pts_cd       ;
        this.ofc_pts_lo        = ofc_pts_lo       ;
        this.ofc_psn_qty       = ofc_psn_qty      ;
        this.ofc_rmk           = ofc_rmk          ;
        this.loc_cd            = loc_cd           ;
        this.ofc_spc_qty_ind   = ofc_spc_qty_ind  ;
        this.ofc_spc_ptc_cd    = ofc_spc_ptc_cd   ;
        this.ofc_spc_level     = ofc_spc_level    ;
        this.ofc_frgn          = ofc_frgn         ;
        this.curr_cd1          = curr_cd1         ;
        this.curr_cd2          = curr_cd2         ;
        this.ofc_center        = ofc_center       ;
        this.ofc_ho_acct       = ofc_ho_acct      ;
        this.ofc_open_dt       = ofc_open_dt      ;
        this.ofc_close_dt      = ofc_close_dt     ;
        this.ofc_del_mark      = ofc_del_mark     ;
        this.ofc_reg_dt        = ofc_reg_dt       ;
        this.ofc_updt_dt       = ofc_updt_dt      ;
        this.ofc_user_id       = ofc_user_id      ;
        this.ofc_ar_rev        = ofc_ar_rev       ;
        this.ofc_ar_hq         = ofc_ar_hq        ;
        this.ofc_ar_control    = ofc_ar_control   ;
        this.ofc_ap_ho_acct    = ofc_ap_ho_acct   ;
        this.ofc_fa_ho_acct    = ofc_fa_ho_acct   ;
        this.ofc_ib_crd_term   = ofc_ib_crd_term  ;
        this.ofc_ob_crd_term   = ofc_ob_crd_term  ;
        this.ofc_agt_mk        = ofc_agt_mk       ;
        this.ofc_rep_cnt_cd    = ofc_rep_cnt_cd   ;
        this.ofc_rep_cust_cd   = ofc_rep_cust_cd  ;
        this.ofc_inv_prefix    = ofc_inv_prefix   ;
        this.ofc_ap_fin_ofc    = ofc_ap_fin_ofc   ;
        this.ofc_ap_fin_ctr    = ofc_ap_fin_ctr   ;
        this.ofc_ap_ctrl_ofc   = ofc_ap_ctrl_ofc  ;
        this.ofc_agent_mark    = ofc_agent_mark   ;
        this.ofc_eur_lcl_rate  = ofc_eur_lcl_rate ;
        this.ofc_vat_rate      = ofc_vat_rate     ;
        this.ofc_ap_eur_mark   = ofc_ap_eur_mark  ;
        this.ofc_ap_eur_rate   = ofc_ap_eur_rate  ;
        this.ofc_ems_ctr       = ofc_ems_ctr      ;
        this.ofc_ems_ctr_eng   = ofc_ems_ctr_eng  ;
        this.dsen_control_ofc  = dsen_control_ofc ;
        this.dsen_credit_term  = dsen_credit_term ;
        this.nis_event_dt      = nis_event_dt     ;
        this.agt_so_mark       = agt_so_mark      ;
        this.ofc_spc_sen_ind   = ofc_spc_sen_ind  ;
        this.ofc_spc_sen_ptcd  = ofc_spc_sen_ptcd ;
        this.ofc_spc_sen_level = ofc_spc_sen_level;
        this.ofc_ap_emu_mk     = ofc_ap_emu_mk    ;
        this.eur_org_cur       = eur_org_cur      ;
        this.usa_bkg_no_chk    = usa_bkg_no_chk   ;
        this.ofc_ap_pay_mk     = ofc_ap_pay_mk    ;
        this.ofc_ap_pay_div    = ofc_ap_pay_div   ;
        this.ofc_sal_del       = ofc_sal_del      ;
        this.ofc_sal_div       = ofc_sal_div      ;
        this.ofc_ap_inv_div    = ofc_ap_inv_div   ;
        this.ofc_ap_pay_curr   = ofc_ap_pay_curr  ;
        this.fax_ip_addr       = fax_ip_addr      ;
        this.ofc_rfa_sc        = ofc_rfa_sc       ;
        this.ofc_oprn          = ofc_oprn         ;
        this.ofc_finan         = ofc_finan        ;
        this.m_ofc_cd          = m_ofc_cd         ;
        this.m_mst_ofc_id      = m_mst_ofc_id     ;
        this.m_ofc_knd_cd      = m_ofc_knd_cd     ;
        this.m_agn_knd_cd      = m_agn_knd_cd     ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getOfc_cd           (){    return ofc_cd               ;    }
    public String            getOfc_nm           (){    return ofc_nm               ;    }
    public String            getOfc_addr         (){    return ofc_addr             ;    }
    public String            getOfc_zip          (){    return ofc_zip              ;    }
    public String            getOfc_kind1        (){    return ofc_kind1            ;    }
    public String            getOfc_kind2        (){    return ofc_kind2            ;    }
    public String            getCnt_cd           (){    return cnt_cd               ;    }
    public String            getVndr_seq         (){    return vndr_seq             ;    }
    public String            getOfc_mgr_cd       (){    return ofc_mgr_cd           ;    }
    public String            getOfc_mgr_tit      (){    return ofc_mgr_tit          ;    }
    public String            getOfc_mgr_nm       (){    return ofc_mgr_nm           ;    }
    public String            getOfc_tel          (){    return ofc_tel              ;    }
    public String            getOfc_fax          (){    return ofc_fax              ;    }
    public String            getOfc_ip_addr      (){    return ofc_ip_addr          ;    }
    public String            getOfc_pts_cd       (){    return ofc_pts_cd           ;    }
    public String            getOfc_pts_lo       (){    return ofc_pts_lo           ;    }
    public String            getOfc_psn_qty      (){    return ofc_psn_qty          ;    }
    public String            getOfc_rmk          (){    return ofc_rmk              ;    }
    public String            getLoc_cd           (){    return loc_cd               ;    }
    public String            getOfc_spc_qty_ind  (){    return ofc_spc_qty_ind      ;    }
    public String            getOfc_spc_ptc_cd   (){    return ofc_spc_ptc_cd       ;    }
    public String            getOfc_spc_level    (){    return ofc_spc_level        ;    }
    public String            getOfc_frgn         (){    return ofc_frgn             ;    }
    public String            getCurr_cd1         (){    return curr_cd1             ;    }
    public String            getCurr_cd2         (){    return curr_cd2             ;    }
    public String            getOfc_center       (){    return ofc_center           ;    }
    public String            getOfc_ho_acct      (){    return ofc_ho_acct          ;    }
    public String            getOfc_open_dt      (){    return ofc_open_dt          ;    }
    public String            getOfc_close_dt     (){    return ofc_close_dt         ;    }
    public String            getOfc_del_mark     (){    return ofc_del_mark         ;    }
    public String            getOfc_reg_dt       (){    return ofc_reg_dt           ;    }
    public String            getOfc_updt_dt      (){    return ofc_updt_dt          ;    }
    public String            getOfc_user_id      (){    return ofc_user_id          ;    }
    public String            getOfc_ar_rev       (){    return ofc_ar_rev           ;    }
    public String            getOfc_ar_hq        (){    return ofc_ar_hq            ;    }
    public String            getOfc_ar_control   (){    return ofc_ar_control       ;    }
    public String            getOfc_ap_ho_acct   (){    return ofc_ap_ho_acct       ;    }
    public String            getOfc_fa_ho_acct   (){    return ofc_fa_ho_acct       ;    }
    public String            getOfc_ib_crd_term  (){    return ofc_ib_crd_term      ;    }
    public String            getOfc_ob_crd_term  (){    return ofc_ob_crd_term      ;    }
    public String            getOfc_agt_mk       (){    return ofc_agt_mk           ;    }
    public String            getOfc_rep_cnt_cd   (){    return ofc_rep_cnt_cd       ;    }
    public String            getOfc_rep_cust_cd  (){    return ofc_rep_cust_cd      ;    }
    public String            getOfc_inv_prefix   (){    return ofc_inv_prefix       ;    }
    public String            getOfc_ap_fin_ofc   (){    return ofc_ap_fin_ofc       ;    }
    public String            getOfc_ap_fin_ctr   (){    return ofc_ap_fin_ctr       ;    }
    public String            getOfc_ap_ctrl_ofc  (){    return ofc_ap_ctrl_ofc      ;    }
    public String            getOfc_agent_mark   (){    return ofc_agent_mark       ;    }
    public String            getOfc_eur_lcl_rate (){    return ofc_eur_lcl_rate     ;    }
    public String            getOfc_vat_rate     (){    return ofc_vat_rate         ;    }
    public String            getOfc_ap_eur_mark  (){    return ofc_ap_eur_mark      ;    }
    public String            getOfc_ap_eur_rate  (){    return ofc_ap_eur_rate      ;    }
    public String            getOfc_ems_ctr      (){    return ofc_ems_ctr          ;    }
    public String            getOfc_ems_ctr_eng  (){    return ofc_ems_ctr_eng      ;    }
    public String            getDsen_control_ofc (){    return dsen_control_ofc     ;    }
    public String            getDsen_credit_term (){    return dsen_credit_term     ;    }
    public String            getNis_event_dt     (){    return nis_event_dt         ;    }
    public String            getAgt_so_mark      (){    return agt_so_mark          ;    }
    public String            getOfc_spc_sen_ind  (){    return ofc_spc_sen_ind      ;    }
    public String            getOfc_spc_sen_ptcd (){    return ofc_spc_sen_ptcd     ;    }
    public String            getOfc_spc_sen_level(){    return ofc_spc_sen_level    ;    }
    public String            getOfc_ap_emu_mk    (){    return ofc_ap_emu_mk        ;    }
    public String            getEur_org_cur      (){    return eur_org_cur          ;    }
    public String            getUsa_bkg_no_chk   (){    return usa_bkg_no_chk       ;    }
    public String            getOfc_ap_pay_mk    (){    return ofc_ap_pay_mk        ;    }
    public String            getOfc_ap_pay_div   (){    return ofc_ap_pay_div       ;    }
    public String            getOfc_sal_del      (){    return ofc_sal_del          ;    }
    public String            getOfc_sal_div      (){    return ofc_sal_div          ;    }
    public String            getOfc_ap_inv_div   (){    return ofc_ap_inv_div       ;    }
    public String            getOfc_ap_pay_curr  (){    return ofc_ap_pay_curr      ;    }
    public String            getFax_ip_addr      (){    return fax_ip_addr          ;    }
    public String            getOfc_rfa_sc       (){    return ofc_rfa_sc           ;    }
    public String            getOfc_oprn         (){    return ofc_oprn             ;    }
    public String            getOfc_finan        (){    return ofc_finan            ;    }
    public String            getM_ofc_cd         (){    return m_ofc_cd             ;    }
    public String            getM_mst_ofc_id     (){    return m_mst_ofc_id         ;    }
    public String            getM_ofc_knd_cd     (){    return m_ofc_knd_cd         ;    }
    public String            getM_agn_knd_cd     (){    return m_agn_knd_cd         ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setOfc_cd           ( String            ofc_cd            ){    this.ofc_cd            = ofc_cd               ;    }
    public void setOfc_nm           ( String            ofc_nm            ){    this.ofc_nm            = ofc_nm               ;    }
    public void setOfc_addr         ( String            ofc_addr          ){    this.ofc_addr          = ofc_addr             ;    }
    public void setOfc_zip          ( String            ofc_zip           ){    this.ofc_zip           = ofc_zip              ;    }
    public void setOfc_kind1        ( String            ofc_kind1         ){    this.ofc_kind1         = ofc_kind1            ;    }
    public void setOfc_kind2        ( String            ofc_kind2         ){    this.ofc_kind2         = ofc_kind2            ;    }
    public void setCnt_cd           ( String            cnt_cd            ){    this.cnt_cd            = cnt_cd               ;    }
    public void setVndr_seq         ( String            vndr_seq          ){    this.vndr_seq          = vndr_seq             ;    }
    public void setOfc_mgr_cd       ( String            ofc_mgr_cd        ){    this.ofc_mgr_cd        = ofc_mgr_cd           ;    }
    public void setOfc_mgr_tit      ( String            ofc_mgr_tit       ){    this.ofc_mgr_tit       = ofc_mgr_tit          ;    }
    public void setOfc_mgr_nm       ( String            ofc_mgr_nm        ){    this.ofc_mgr_nm        = ofc_mgr_nm           ;    }
    public void setOfc_tel          ( String            ofc_tel           ){    this.ofc_tel           = ofc_tel              ;    }
    public void setOfc_fax          ( String            ofc_fax           ){    this.ofc_fax           = ofc_fax              ;    }
    public void setOfc_ip_addr      ( String            ofc_ip_addr       ){    this.ofc_ip_addr       = ofc_ip_addr          ;    }
    public void setOfc_pts_cd       ( String            ofc_pts_cd        ){    this.ofc_pts_cd        = ofc_pts_cd           ;    }
    public void setOfc_pts_lo       ( String            ofc_pts_lo        ){    this.ofc_pts_lo        = ofc_pts_lo           ;    }
    public void setOfc_psn_qty      ( String            ofc_psn_qty       ){    this.ofc_psn_qty       = ofc_psn_qty          ;    }
    public void setOfc_rmk          ( String            ofc_rmk           ){    this.ofc_rmk           = ofc_rmk              ;    }
    public void setLoc_cd           ( String            loc_cd            ){    this.loc_cd            = loc_cd               ;    }
    public void setOfc_spc_qty_ind  ( String            ofc_spc_qty_ind   ){    this.ofc_spc_qty_ind   = ofc_spc_qty_ind      ;    }
    public void setOfc_spc_ptc_cd   ( String            ofc_spc_ptc_cd    ){    this.ofc_spc_ptc_cd    = ofc_spc_ptc_cd       ;    }
    public void setOfc_spc_level    ( String            ofc_spc_level     ){    this.ofc_spc_level     = ofc_spc_level        ;    }
    public void setOfc_frgn         ( String            ofc_frgn          ){    this.ofc_frgn          = ofc_frgn             ;    }
    public void setCurr_cd1         ( String            curr_cd1          ){    this.curr_cd1          = curr_cd1             ;    }
    public void setCurr_cd2         ( String            curr_cd2          ){    this.curr_cd2          = curr_cd2             ;    }
    public void setOfc_center       ( String            ofc_center        ){    this.ofc_center        = ofc_center           ;    }
    public void setOfc_ho_acct      ( String            ofc_ho_acct       ){    this.ofc_ho_acct       = ofc_ho_acct          ;    }
    public void setOfc_open_dt      ( String            ofc_open_dt       ){    this.ofc_open_dt       = ofc_open_dt          ;    }
    public void setOfc_close_dt     ( String            ofc_close_dt      ){    this.ofc_close_dt      = ofc_close_dt         ;    }
    public void setOfc_del_mark     ( String            ofc_del_mark      ){    this.ofc_del_mark      = ofc_del_mark         ;    }
    public void setOfc_reg_dt       ( String            ofc_reg_dt        ){    this.ofc_reg_dt        = ofc_reg_dt           ;    }
    public void setOfc_updt_dt      ( String            ofc_updt_dt       ){    this.ofc_updt_dt       = ofc_updt_dt          ;    }
    public void setOfc_user_id      ( String            ofc_user_id       ){    this.ofc_user_id       = ofc_user_id          ;    }
    public void setOfc_ar_rev       ( String            ofc_ar_rev        ){    this.ofc_ar_rev        = ofc_ar_rev           ;    }
    public void setOfc_ar_hq        ( String            ofc_ar_hq         ){    this.ofc_ar_hq         = ofc_ar_hq            ;    }
    public void setOfc_ar_control   ( String            ofc_ar_control    ){    this.ofc_ar_control    = ofc_ar_control       ;    }
    public void setOfc_ap_ho_acct   ( String            ofc_ap_ho_acct    ){    this.ofc_ap_ho_acct    = ofc_ap_ho_acct       ;    }
    public void setOfc_fa_ho_acct   ( String            ofc_fa_ho_acct    ){    this.ofc_fa_ho_acct    = ofc_fa_ho_acct       ;    }
    public void setOfc_ib_crd_term  ( String            ofc_ib_crd_term   ){    this.ofc_ib_crd_term   = ofc_ib_crd_term      ;    }
    public void setOfc_ob_crd_term  ( String            ofc_ob_crd_term   ){    this.ofc_ob_crd_term   = ofc_ob_crd_term      ;    }
    public void setOfc_agt_mk       ( String            ofc_agt_mk        ){    this.ofc_agt_mk        = ofc_agt_mk           ;    }
    public void setOfc_rep_cnt_cd   ( String            ofc_rep_cnt_cd    ){    this.ofc_rep_cnt_cd    = ofc_rep_cnt_cd       ;    }
    public void setOfc_rep_cust_cd  ( String            ofc_rep_cust_cd   ){    this.ofc_rep_cust_cd   = ofc_rep_cust_cd      ;    }
    public void setOfc_inv_prefix   ( String            ofc_inv_prefix    ){    this.ofc_inv_prefix    = ofc_inv_prefix       ;    }
    public void setOfc_ap_fin_ofc   ( String            ofc_ap_fin_ofc    ){    this.ofc_ap_fin_ofc    = ofc_ap_fin_ofc       ;    }
    public void setOfc_ap_fin_ctr   ( String            ofc_ap_fin_ctr    ){    this.ofc_ap_fin_ctr    = ofc_ap_fin_ctr       ;    }
    public void setOfc_ap_ctrl_ofc  ( String            ofc_ap_ctrl_ofc   ){    this.ofc_ap_ctrl_ofc   = ofc_ap_ctrl_ofc      ;    }
    public void setOfc_agent_mark   ( String            ofc_agent_mark    ){    this.ofc_agent_mark    = ofc_agent_mark       ;    }
    public void setOfc_eur_lcl_rate ( String            ofc_eur_lcl_rate  ){    this.ofc_eur_lcl_rate  = ofc_eur_lcl_rate     ;    }
    public void setOfc_vat_rate     ( String            ofc_vat_rate      ){    this.ofc_vat_rate      = ofc_vat_rate         ;    }
    public void setOfc_ap_eur_mark  ( String            ofc_ap_eur_mark   ){    this.ofc_ap_eur_mark   = ofc_ap_eur_mark      ;    }
    public void setOfc_ap_eur_rate  ( String            ofc_ap_eur_rate   ){    this.ofc_ap_eur_rate   = ofc_ap_eur_rate      ;    }
    public void setOfc_ems_ctr      ( String            ofc_ems_ctr       ){    this.ofc_ems_ctr       = ofc_ems_ctr          ;    }
    public void setOfc_ems_ctr_eng  ( String            ofc_ems_ctr_eng   ){    this.ofc_ems_ctr_eng   = ofc_ems_ctr_eng      ;    }
    public void setDsen_control_ofc ( String            dsen_control_ofc  ){    this.dsen_control_ofc  = dsen_control_ofc     ;    }
    public void setDsen_credit_term ( String            dsen_credit_term  ){    this.dsen_credit_term  = dsen_credit_term     ;    }
    public void setNis_event_dt     ( String            nis_event_dt      ){    this.nis_event_dt      = nis_event_dt         ;    }
    public void setAgt_so_mark      ( String            agt_so_mark       ){    this.agt_so_mark       = agt_so_mark          ;    }
    public void setOfc_spc_sen_ind  ( String            ofc_spc_sen_ind   ){    this.ofc_spc_sen_ind   = ofc_spc_sen_ind      ;    }
    public void setOfc_spc_sen_ptcd ( String            ofc_spc_sen_ptcd  ){    this.ofc_spc_sen_ptcd  = ofc_spc_sen_ptcd     ;    }
    public void setOfc_spc_sen_level( String            ofc_spc_sen_level ){    this.ofc_spc_sen_level = ofc_spc_sen_level    ;    }
    public void setOfc_ap_emu_mk    ( String            ofc_ap_emu_mk     ){    this.ofc_ap_emu_mk     = ofc_ap_emu_mk        ;    }
    public void setEur_org_cur      ( String            eur_org_cur       ){    this.eur_org_cur       = eur_org_cur          ;    }
    public void setUsa_bkg_no_chk   ( String            usa_bkg_no_chk    ){    this.usa_bkg_no_chk    = usa_bkg_no_chk       ;    }
    public void setOfc_ap_pay_mk    ( String            ofc_ap_pay_mk     ){    this.ofc_ap_pay_mk     = ofc_ap_pay_mk        ;    }
    public void setOfc_ap_pay_div   ( String            ofc_ap_pay_div    ){    this.ofc_ap_pay_div    = ofc_ap_pay_div       ;    }
    public void setOfc_sal_del      ( String            ofc_sal_del       ){    this.ofc_sal_del       = ofc_sal_del          ;    }
    public void setOfc_sal_div      ( String            ofc_sal_div       ){    this.ofc_sal_div       = ofc_sal_div          ;    }
    public void setOfc_ap_inv_div   ( String            ofc_ap_inv_div    ){    this.ofc_ap_inv_div    = ofc_ap_inv_div       ;    }
    public void setOfc_ap_pay_curr  ( String            ofc_ap_pay_curr   ){    this.ofc_ap_pay_curr   = ofc_ap_pay_curr      ;    }
    public void setFax_ip_addr      ( String            fax_ip_addr       ){    this.fax_ip_addr       = fax_ip_addr          ;    }
    public void setOfc_rfa_sc       ( String            ofc_rfa_sc        ){    this.ofc_rfa_sc        = ofc_rfa_sc           ;    }
    public void setOfc_oprn         ( String            ofc_oprn          ){    this.ofc_oprn          = ofc_oprn             ;    }
    public void setOfc_finan        ( String            ofc_finan         ){    this.ofc_finan         = ofc_finan            ;    }
    public void setM_ofc_cd         ( String            m_ofc_cd          ){    this.m_ofc_cd          = m_ofc_cd             ;    }
    public void setM_mst_ofc_id     ( String            m_mst_ofc_id      ){    this.m_mst_ofc_id      = m_mst_ofc_id         ;    }
    public void setM_ofc_knd_cd     ( String            m_ofc_knd_cd      ){    this.m_ofc_knd_cd      = m_ofc_knd_cd         ;    }
    public void setM_agn_knd_cd     ( String            m_agn_knd_cd      ){    this.m_agn_knd_cd      = m_agn_knd_cd         ;    }

    public static OFFICE fromRequest(HttpServletRequest request) {
        OFFICE model = new OFFICE();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setOfc_cd               (JSPUtil.getParameter(request, "ofc_cd                   ".trim(), ""));
            model.setOfc_nm               (JSPUtil.getParameter(request, "ofc_nm                   ".trim(), ""));
            model.setOfc_addr             (JSPUtil.getParameter(request, "ofc_addr                 ".trim(), ""));
            model.setOfc_zip              (JSPUtil.getParameter(request, "ofc_zip                  ".trim(), ""));
            model.setOfc_kind1            (JSPUtil.getParameter(request, "ofc_kind1                ".trim(), ""));
            model.setOfc_kind2            (JSPUtil.getParameter(request, "ofc_kind2                ".trim(), ""));
            model.setCnt_cd               (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), ""));
            model.setVndr_seq             (JSPUtil.getParameter(request, "vndr_seq                 ".trim(), ""));
            model.setOfc_mgr_cd           (JSPUtil.getParameter(request, "ofc_mgr_cd               ".trim(), ""));
            model.setOfc_mgr_tit          (JSPUtil.getParameter(request, "ofc_mgr_tit              ".trim(), ""));
            model.setOfc_mgr_nm           (JSPUtil.getParameter(request, "ofc_mgr_nm               ".trim(), ""));
            model.setOfc_tel              (JSPUtil.getParameter(request, "ofc_tel                  ".trim(), ""));
            model.setOfc_fax              (JSPUtil.getParameter(request, "ofc_fax                  ".trim(), ""));
            model.setOfc_ip_addr          (JSPUtil.getParameter(request, "ofc_ip_addr              ".trim(), ""));
            model.setOfc_pts_cd           (JSPUtil.getParameter(request, "ofc_pts_cd               ".trim(), ""));
            model.setOfc_pts_lo           (JSPUtil.getParameter(request, "ofc_pts_lo               ".trim(), ""));
            model.setOfc_psn_qty          (JSPUtil.getParameter(request, "ofc_psn_qty              ".trim(), ""));
            model.setOfc_rmk              (JSPUtil.getParameter(request, "ofc_rmk                  ".trim(), ""));
            model.setLoc_cd               (JSPUtil.getParameter(request, "loc_cd                   ".trim(), ""));
            model.setOfc_spc_qty_ind      (JSPUtil.getParameter(request, "ofc_spc_qty_ind          ".trim(), ""));
            model.setOfc_spc_ptc_cd       (JSPUtil.getParameter(request, "ofc_spc_ptc_cd           ".trim(), ""));
            model.setOfc_spc_level        (JSPUtil.getParameter(request, "ofc_spc_level            ".trim(), ""));
            model.setOfc_frgn             (JSPUtil.getParameter(request, "ofc_frgn                 ".trim(), ""));
            model.setCurr_cd1             (JSPUtil.getParameter(request, "curr_cd1                 ".trim(), ""));
            model.setCurr_cd2             (JSPUtil.getParameter(request, "curr_cd2                 ".trim(), ""));
            model.setOfc_center           (JSPUtil.getParameter(request, "ofc_center               ".trim(), ""));
            model.setOfc_ho_acct          (JSPUtil.getParameter(request, "ofc_ho_acct              ".trim(), ""));
            model.setOfc_open_dt          (JSPUtil.getParameter(request, "ofc_open_dt              ".trim(), ""));
            model.setOfc_close_dt         (JSPUtil.getParameter(request, "ofc_close_dt             ".trim(), ""));
            model.setOfc_del_mark         (JSPUtil.getParameter(request, "ofc_del_mark             ".trim(), ""));
            model.setOfc_reg_dt           (JSPUtil.getParameter(request, "ofc_reg_dt               ".trim(), ""));
            model.setOfc_updt_dt          (JSPUtil.getParameter(request, "ofc_updt_dt              ".trim(), ""));
            model.setOfc_user_id          (JSPUtil.getParameter(request, "ofc_user_id              ".trim(), ""));
            model.setOfc_ar_rev           (JSPUtil.getParameter(request, "ofc_ar_rev               ".trim(), ""));
            model.setOfc_ar_hq            (JSPUtil.getParameter(request, "ofc_ar_hq                ".trim(), ""));
            model.setOfc_ar_control       (JSPUtil.getParameter(request, "ofc_ar_control           ".trim(), ""));
            model.setOfc_ap_ho_acct       (JSPUtil.getParameter(request, "ofc_ap_ho_acct           ".trim(), ""));
            model.setOfc_fa_ho_acct       (JSPUtil.getParameter(request, "ofc_fa_ho_acct           ".trim(), ""));
            model.setOfc_ib_crd_term      (JSPUtil.getParameter(request, "ofc_ib_crd_term          ".trim(), ""));
            model.setOfc_ob_crd_term      (JSPUtil.getParameter(request, "ofc_ob_crd_term          ".trim(), ""));
            model.setOfc_agt_mk           (JSPUtil.getParameter(request, "ofc_agt_mk               ".trim(), ""));
            model.setOfc_rep_cnt_cd       (JSPUtil.getParameter(request, "ofc_rep_cnt_cd           ".trim(), ""));
            model.setOfc_rep_cust_cd      (JSPUtil.getParameter(request, "ofc_rep_cust_cd          ".trim(), ""));
            model.setOfc_inv_prefix       (JSPUtil.getParameter(request, "ofc_inv_prefix           ".trim(), ""));
            model.setOfc_ap_fin_ofc       (JSPUtil.getParameter(request, "ofc_ap_fin_ofc           ".trim(), ""));
            model.setOfc_ap_fin_ctr       (JSPUtil.getParameter(request, "ofc_ap_fin_ctr           ".trim(), ""));
            model.setOfc_ap_ctrl_ofc      (JSPUtil.getParameter(request, "ofc_ap_ctrl_ofc          ".trim(), ""));
            model.setOfc_agent_mark       (JSPUtil.getParameter(request, "ofc_agent_mark           ".trim(), ""));
            model.setOfc_eur_lcl_rate     (JSPUtil.getParameter(request, "ofc_eur_lcl_rate         ".trim(), ""));
            model.setOfc_vat_rate         (JSPUtil.getParameter(request, "ofc_vat_rate             ".trim(), ""));
            model.setOfc_ap_eur_mark      (JSPUtil.getParameter(request, "ofc_ap_eur_mark          ".trim(), ""));
            model.setOfc_ap_eur_rate      (JSPUtil.getParameter(request, "ofc_ap_eur_rate          ".trim(), ""));
            model.setOfc_ems_ctr          (JSPUtil.getParameter(request, "ofc_ems_ctr              ".trim(), ""));
            model.setOfc_ems_ctr_eng      (JSPUtil.getParameter(request, "ofc_ems_ctr_eng          ".trim(), ""));
            model.setDsen_control_ofc     (JSPUtil.getParameter(request, "dsen_control_ofc         ".trim(), ""));
            model.setDsen_credit_term     (JSPUtil.getParameter(request, "dsen_credit_term         ".trim(), ""));
            model.setNis_event_dt         (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), ""));
            model.setAgt_so_mark          (JSPUtil.getParameter(request, "agt_so_mark              ".trim(), ""));
            model.setOfc_spc_sen_ind      (JSPUtil.getParameter(request, "ofc_spc_sen_ind          ".trim(), ""));
            model.setOfc_spc_sen_ptcd     (JSPUtil.getParameter(request, "ofc_spc_sen_ptcd         ".trim(), ""));
            model.setOfc_spc_sen_level    (JSPUtil.getParameter(request, "ofc_spc_sen_level        ".trim(), ""));
            model.setOfc_ap_emu_mk        (JSPUtil.getParameter(request, "ofc_ap_emu_mk            ".trim(), ""));
            model.setEur_org_cur          (JSPUtil.getParameter(request, "eur_org_cur              ".trim(), ""));
            model.setUsa_bkg_no_chk       (JSPUtil.getParameter(request, "usa_bkg_no_chk           ".trim(), ""));
            model.setOfc_ap_pay_mk        (JSPUtil.getParameter(request, "ofc_ap_pay_mk            ".trim(), ""));
            model.setOfc_ap_pay_div       (JSPUtil.getParameter(request, "ofc_ap_pay_div           ".trim(), ""));
            model.setOfc_sal_del          (JSPUtil.getParameter(request, "ofc_sal_del              ".trim(), ""));
            model.setOfc_sal_div          (JSPUtil.getParameter(request, "ofc_sal_div              ".trim(), ""));
            model.setOfc_ap_inv_div       (JSPUtil.getParameter(request, "ofc_ap_inv_div           ".trim(), ""));
            model.setOfc_ap_pay_curr      (JSPUtil.getParameter(request, "ofc_ap_pay_curr          ".trim(), ""));
            model.setFax_ip_addr          (JSPUtil.getParameter(request, "fax_ip_addr              ".trim(), ""));
            model.setOfc_rfa_sc           (JSPUtil.getParameter(request, "ofc_rfa_sc               ".trim(), ""));
            model.setOfc_oprn             (JSPUtil.getParameter(request, "ofc_oprn                 ".trim(), ""));
            model.setOfc_finan            (JSPUtil.getParameter(request, "ofc_finan                ".trim(), ""));
            model.setM_ofc_cd             (JSPUtil.getParameter(request, "m_ofc_cd                 ".trim(), ""));
            model.setM_mst_ofc_id         (JSPUtil.getParameter(request, "m_mst_ofc_id             ".trim(), ""));
            model.setM_ofc_knd_cd         (JSPUtil.getParameter(request, "m_ofc_knd_cd             ".trim(), ""));
            model.setM_agn_knd_cd         (JSPUtil.getParameter(request, "m_agn_knd_cd             ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        OFFICE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] ofc_cd            =  (JSPUtil.getParameter(request, "ofc_cd                   ".trim(), length));
            String[] ofc_nm            =  (JSPUtil.getParameter(request, "ofc_nm                   ".trim(), length));
            String[] ofc_addr          =  (JSPUtil.getParameter(request, "ofc_addr                 ".trim(), length));
            String[] ofc_zip           =  (JSPUtil.getParameter(request, "ofc_zip                  ".trim(), length));
            String[] ofc_kind1         =  (JSPUtil.getParameter(request, "ofc_kind1                ".trim(), length));
            String[] ofc_kind2         =  (JSPUtil.getParameter(request, "ofc_kind2                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), length));
            String[] vndr_seq          =  (JSPUtil.getParameter(request, "vndr_seq                 ".trim(), length));
            String[] ofc_mgr_cd        =  (JSPUtil.getParameter(request, "ofc_mgr_cd               ".trim(), length));
            String[] ofc_mgr_tit       =  (JSPUtil.getParameter(request, "ofc_mgr_tit              ".trim(), length));
            String[] ofc_mgr_nm        =  (JSPUtil.getParameter(request, "ofc_mgr_nm               ".trim(), length));
            String[] ofc_tel           =  (JSPUtil.getParameter(request, "ofc_tel                  ".trim(), length));
            String[] ofc_fax           =  (JSPUtil.getParameter(request, "ofc_fax                  ".trim(), length));
            String[] ofc_ip_addr       =  (JSPUtil.getParameter(request, "ofc_ip_addr              ".trim(), length));
            String[] ofc_pts_cd        =  (JSPUtil.getParameter(request, "ofc_pts_cd               ".trim(), length));
            String[] ofc_pts_lo        =  (JSPUtil.getParameter(request, "ofc_pts_lo               ".trim(), length));
            String[] ofc_psn_qty       =  (JSPUtil.getParameter(request, "ofc_psn_qty              ".trim(), length));
            String[] ofc_rmk           =  (JSPUtil.getParameter(request, "ofc_rmk                  ".trim(), length));
            String[] loc_cd            =  (JSPUtil.getParameter(request, "loc_cd                   ".trim(), length));
            String[] ofc_spc_qty_ind   =  (JSPUtil.getParameter(request, "ofc_spc_qty_ind          ".trim(), length));
            String[] ofc_spc_ptc_cd    =  (JSPUtil.getParameter(request, "ofc_spc_ptc_cd           ".trim(), length));
            String[] ofc_spc_level     =  (JSPUtil.getParameter(request, "ofc_spc_level            ".trim(), length));
            String[] ofc_frgn          =  (JSPUtil.getParameter(request, "ofc_frgn                 ".trim(), length));
            String[] curr_cd1          =  (JSPUtil.getParameter(request, "curr_cd1                 ".trim(), length));
            String[] curr_cd2          =  (JSPUtil.getParameter(request, "curr_cd2                 ".trim(), length));
            String[] ofc_center        =  (JSPUtil.getParameter(request, "ofc_center               ".trim(), length));
            String[] ofc_ho_acct       =  (JSPUtil.getParameter(request, "ofc_ho_acct              ".trim(), length));
            String[] ofc_open_dt       =  (JSPUtil.getParameter(request, "ofc_open_dt              ".trim(), length));
            String[] ofc_close_dt      =  (JSPUtil.getParameter(request, "ofc_close_dt             ".trim(), length));
            String[] ofc_del_mark      =  (JSPUtil.getParameter(request, "ofc_del_mark             ".trim(), length));
            String[] ofc_reg_dt        =  (JSPUtil.getParameter(request, "ofc_reg_dt               ".trim(), length));
            String[] ofc_updt_dt       =  (JSPUtil.getParameter(request, "ofc_updt_dt              ".trim(), length));
            String[] ofc_user_id       =  (JSPUtil.getParameter(request, "ofc_user_id              ".trim(), length));
            String[] ofc_ar_rev        =  (JSPUtil.getParameter(request, "ofc_ar_rev               ".trim(), length));
            String[] ofc_ar_hq         =  (JSPUtil.getParameter(request, "ofc_ar_hq                ".trim(), length));
            String[] ofc_ar_control    =  (JSPUtil.getParameter(request, "ofc_ar_control           ".trim(), length));
            String[] ofc_ap_ho_acct    =  (JSPUtil.getParameter(request, "ofc_ap_ho_acct           ".trim(), length));
            String[] ofc_fa_ho_acct    =  (JSPUtil.getParameter(request, "ofc_fa_ho_acct           ".trim(), length));
            String[] ofc_ib_crd_term   =  (JSPUtil.getParameter(request, "ofc_ib_crd_term          ".trim(), length));
            String[] ofc_ob_crd_term   =  (JSPUtil.getParameter(request, "ofc_ob_crd_term          ".trim(), length));
            String[] ofc_agt_mk        =  (JSPUtil.getParameter(request, "ofc_agt_mk               ".trim(), length));
            String[] ofc_rep_cnt_cd    =  (JSPUtil.getParameter(request, "ofc_rep_cnt_cd           ".trim(), length));
            String[] ofc_rep_cust_cd   =  (JSPUtil.getParameter(request, "ofc_rep_cust_cd          ".trim(), length));
            String[] ofc_inv_prefix    =  (JSPUtil.getParameter(request, "ofc_inv_prefix           ".trim(), length));
            String[] ofc_ap_fin_ofc    =  (JSPUtil.getParameter(request, "ofc_ap_fin_ofc           ".trim(), length));
            String[] ofc_ap_fin_ctr    =  (JSPUtil.getParameter(request, "ofc_ap_fin_ctr           ".trim(), length));
            String[] ofc_ap_ctrl_ofc   =  (JSPUtil.getParameter(request, "ofc_ap_ctrl_ofc          ".trim(), length));
            String[] ofc_agent_mark    =  (JSPUtil.getParameter(request, "ofc_agent_mark           ".trim(), length));
            String[] ofc_eur_lcl_rate  =  (JSPUtil.getParameter(request, "ofc_eur_lcl_rate         ".trim(), length));
            String[] ofc_vat_rate      =  (JSPUtil.getParameter(request, "ofc_vat_rate             ".trim(), length));
            String[] ofc_ap_eur_mark   =  (JSPUtil.getParameter(request, "ofc_ap_eur_mark          ".trim(), length));
            String[] ofc_ap_eur_rate   =  (JSPUtil.getParameter(request, "ofc_ap_eur_rate          ".trim(), length));
            String[] ofc_ems_ctr       =  (JSPUtil.getParameter(request, "ofc_ems_ctr              ".trim(), length));
            String[] ofc_ems_ctr_eng   =  (JSPUtil.getParameter(request, "ofc_ems_ctr_eng          ".trim(), length));
            String[] dsen_control_ofc  =  (JSPUtil.getParameter(request, "dsen_control_ofc         ".trim(), length));
            String[] dsen_credit_term  =  (JSPUtil.getParameter(request, "dsen_credit_term         ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), length));
            String[] agt_so_mark       =  (JSPUtil.getParameter(request, "agt_so_mark              ".trim(), length));
            String[] ofc_spc_sen_ind   =  (JSPUtil.getParameter(request, "ofc_spc_sen_ind          ".trim(), length));
            String[] ofc_spc_sen_ptcd  =  (JSPUtil.getParameter(request, "ofc_spc_sen_ptcd         ".trim(), length));
            String[] ofc_spc_sen_level =  (JSPUtil.getParameter(request, "ofc_spc_sen_level        ".trim(), length));
            String[] ofc_ap_emu_mk     =  (JSPUtil.getParameter(request, "ofc_ap_emu_mk            ".trim(), length));
            String[] eur_org_cur       =  (JSPUtil.getParameter(request, "eur_org_cur              ".trim(), length));
            String[] usa_bkg_no_chk    =  (JSPUtil.getParameter(request, "usa_bkg_no_chk           ".trim(), length));
            String[] ofc_ap_pay_mk     =  (JSPUtil.getParameter(request, "ofc_ap_pay_mk            ".trim(), length));
            String[] ofc_ap_pay_div    =  (JSPUtil.getParameter(request, "ofc_ap_pay_div           ".trim(), length));
            String[] ofc_sal_del       =  (JSPUtil.getParameter(request, "ofc_sal_del              ".trim(), length));
            String[] ofc_sal_div       =  (JSPUtil.getParameter(request, "ofc_sal_div              ".trim(), length));
            String[] ofc_ap_inv_div    =  (JSPUtil.getParameter(request, "ofc_ap_inv_div           ".trim(), length));
            String[] ofc_ap_pay_curr   =  (JSPUtil.getParameter(request, "ofc_ap_pay_curr          ".trim(), length));
            String[] fax_ip_addr       =  (JSPUtil.getParameter(request, "fax_ip_addr              ".trim(), length));
            String[] ofc_rfa_sc        =  (JSPUtil.getParameter(request, "ofc_rfa_sc               ".trim(), length));
            String[] ofc_oprn          =  (JSPUtil.getParameter(request, "ofc_oprn                 ".trim(), length));
            String[] ofc_finan         =  (JSPUtil.getParameter(request, "ofc_finan                ".trim(), length));
            String[] m_ofc_cd          =  (JSPUtil.getParameter(request, "m_ofc_cd                 ".trim(), length));
            String[] m_mst_ofc_id      =  (JSPUtil.getParameter(request, "m_mst_ofc_id             ".trim(), length));
            String[] m_ofc_knd_cd      =  (JSPUtil.getParameter(request, "m_ofc_knd_cd             ".trim(), length));
            String[] m_agn_knd_cd      =  (JSPUtil.getParameter(request, "m_agn_knd_cd             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new OFFICE();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setOfc_cd                     (ofc_cd               [i]);
                model.setOfc_nm                     (ofc_nm               [i]);
                model.setOfc_addr                   (ofc_addr             [i]);
                model.setOfc_zip                    (ofc_zip              [i]);
                model.setOfc_kind1                  (ofc_kind1            [i]);
                model.setOfc_kind2                  (ofc_kind2            [i]);
                model.setCnt_cd                     (cnt_cd               [i]);
                model.setVndr_seq                   (vndr_seq             [i]);
                model.setOfc_mgr_cd                 (ofc_mgr_cd           [i]);
                model.setOfc_mgr_tit                (ofc_mgr_tit          [i]);
                model.setOfc_mgr_nm                 (ofc_mgr_nm           [i]);
                model.setOfc_tel                    (ofc_tel              [i]);
                model.setOfc_fax                    (ofc_fax              [i]);
                model.setOfc_ip_addr                (ofc_ip_addr          [i]);
                model.setOfc_pts_cd                 (ofc_pts_cd           [i]);
                model.setOfc_pts_lo                 (ofc_pts_lo           [i]);
                model.setOfc_psn_qty                (ofc_psn_qty          [i]);
                model.setOfc_rmk                    (ofc_rmk              [i]);
                model.setLoc_cd                     (loc_cd               [i]);
                model.setOfc_spc_qty_ind            (ofc_spc_qty_ind      [i]);
                model.setOfc_spc_ptc_cd             (ofc_spc_ptc_cd       [i]);
                model.setOfc_spc_level              (ofc_spc_level        [i]);
                model.setOfc_frgn                   (ofc_frgn             [i]);
                model.setCurr_cd1                   (curr_cd1             [i]);
                model.setCurr_cd2                   (curr_cd2             [i]);
                model.setOfc_center                 (ofc_center           [i]);
                model.setOfc_ho_acct                (ofc_ho_acct          [i]);
                model.setOfc_open_dt                (ofc_open_dt          [i]);
                model.setOfc_close_dt               (ofc_close_dt         [i]);
                model.setOfc_del_mark               (ofc_del_mark         [i]);
                model.setOfc_reg_dt                 (ofc_reg_dt           [i]);
                model.setOfc_updt_dt                (ofc_updt_dt          [i]);
                model.setOfc_user_id                (ofc_user_id          [i]);
                model.setOfc_ar_rev                 (ofc_ar_rev           [i]);
                model.setOfc_ar_hq                  (ofc_ar_hq            [i]);
                model.setOfc_ar_control             (ofc_ar_control       [i]);
                model.setOfc_ap_ho_acct             (ofc_ap_ho_acct       [i]);
                model.setOfc_fa_ho_acct             (ofc_fa_ho_acct       [i]);
                model.setOfc_ib_crd_term            (ofc_ib_crd_term      [i]);
                model.setOfc_ob_crd_term            (ofc_ob_crd_term      [i]);
                model.setOfc_agt_mk                 (ofc_agt_mk           [i]);
                model.setOfc_rep_cnt_cd             (ofc_rep_cnt_cd       [i]);
                model.setOfc_rep_cust_cd            (ofc_rep_cust_cd      [i]);
                model.setOfc_inv_prefix             (ofc_inv_prefix       [i]);
                model.setOfc_ap_fin_ofc             (ofc_ap_fin_ofc       [i]);
                model.setOfc_ap_fin_ctr             (ofc_ap_fin_ctr       [i]);
                model.setOfc_ap_ctrl_ofc            (ofc_ap_ctrl_ofc      [i]);
                model.setOfc_agent_mark             (ofc_agent_mark       [i]);
                model.setOfc_eur_lcl_rate           (ofc_eur_lcl_rate     [i]);
                model.setOfc_vat_rate               (ofc_vat_rate         [i]);
                model.setOfc_ap_eur_mark            (ofc_ap_eur_mark      [i]);
                model.setOfc_ap_eur_rate            (ofc_ap_eur_rate      [i]);
                model.setOfc_ems_ctr                (ofc_ems_ctr          [i]);
                model.setOfc_ems_ctr_eng            (ofc_ems_ctr_eng      [i]);
                model.setDsen_control_ofc           (dsen_control_ofc     [i]);
                model.setDsen_credit_term           (dsen_credit_term     [i]);
                model.setNis_event_dt               (nis_event_dt         [i]);
                model.setAgt_so_mark                (agt_so_mark          [i]);
                model.setOfc_spc_sen_ind            (ofc_spc_sen_ind      [i]);
                model.setOfc_spc_sen_ptcd           (ofc_spc_sen_ptcd     [i]);
                model.setOfc_spc_sen_level          (ofc_spc_sen_level    [i]);
                model.setOfc_ap_emu_mk              (ofc_ap_emu_mk        [i]);
                model.setEur_org_cur                (eur_org_cur          [i]);
                model.setUsa_bkg_no_chk             (usa_bkg_no_chk       [i]);
                model.setOfc_ap_pay_mk              (ofc_ap_pay_mk        [i]);
                model.setOfc_ap_pay_div             (ofc_ap_pay_div       [i]);
                model.setOfc_sal_del                (ofc_sal_del          [i]);
                model.setOfc_sal_div                (ofc_sal_div          [i]);
                model.setOfc_ap_inv_div             (ofc_ap_inv_div       [i]);
                model.setOfc_ap_pay_curr            (ofc_ap_pay_curr      [i]);
                model.setFax_ip_addr                (fax_ip_addr          [i]);
                model.setOfc_rfa_sc                 (ofc_rfa_sc           [i]);
                model.setOfc_oprn                   (ofc_oprn             [i]);
                model.setOfc_finan                  (ofc_finan            [i]);
                model.setM_ofc_cd                   (m_ofc_cd             [i]);
                model.setM_mst_ofc_id               (m_mst_ofc_id         [i]);
                model.setM_ofc_knd_cd               (m_ofc_knd_cd         [i]);
                model.setM_agn_knd_cd               (m_agn_knd_cd         [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        OFFICE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] ofc_cd            =  (JSPUtil.getParameter(request, prefix + "ofc_cd                   ".trim(), length));
            String[] ofc_nm            =  (JSPUtil.getParameter(request, prefix + "ofc_nm                   ".trim(), length));
            String[] ofc_addr          =  (JSPUtil.getParameter(request, prefix + "ofc_addr                 ".trim(), length));
            String[] ofc_zip           =  (JSPUtil.getParameter(request, prefix + "ofc_zip                  ".trim(), length));
            String[] ofc_kind1         =  (JSPUtil.getParameter(request, prefix + "ofc_kind1                ".trim(), length));
            String[] ofc_kind2         =  (JSPUtil.getParameter(request, prefix + "ofc_kind2                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, prefix + "cnt_cd                   ".trim(), length));
            String[] vndr_seq          =  (JSPUtil.getParameter(request, prefix + "vndr_seq                 ".trim(), length));
            String[] ofc_mgr_cd        =  (JSPUtil.getParameter(request, prefix + "ofc_mgr_cd               ".trim(), length));
            String[] ofc_mgr_tit       =  (JSPUtil.getParameter(request, prefix + "ofc_mgr_tit              ".trim(), length));
            String[] ofc_mgr_nm        =  (JSPUtil.getParameter(request, prefix + "ofc_mgr_nm               ".trim(), length));
            String[] ofc_tel           =  (JSPUtil.getParameter(request, prefix + "ofc_tel                  ".trim(), length));
            String[] ofc_fax           =  (JSPUtil.getParameter(request, prefix + "ofc_fax                  ".trim(), length));
            String[] ofc_ip_addr       =  (JSPUtil.getParameter(request, prefix + "ofc_ip_addr              ".trim(), length));
            String[] ofc_pts_cd        =  (JSPUtil.getParameter(request, prefix + "ofc_pts_cd               ".trim(), length));
            String[] ofc_pts_lo        =  (JSPUtil.getParameter(request, prefix + "ofc_pts_lo               ".trim(), length));
            String[] ofc_psn_qty       =  (JSPUtil.getParameter(request, prefix + "ofc_psn_qty              ".trim(), length));
            String[] ofc_rmk           =  (JSPUtil.getParameter(request, prefix + "ofc_rmk                  ".trim(), length));
            String[] loc_cd            =  (JSPUtil.getParameter(request, prefix + "loc_cd                   ".trim(), length));
            String[] ofc_spc_qty_ind   =  (JSPUtil.getParameter(request, prefix + "ofc_spc_qty_ind          ".trim(), length));
            String[] ofc_spc_ptc_cd    =  (JSPUtil.getParameter(request, prefix + "ofc_spc_ptc_cd           ".trim(), length));
            String[] ofc_spc_level     =  (JSPUtil.getParameter(request, prefix + "ofc_spc_level            ".trim(), length));
            String[] ofc_frgn          =  (JSPUtil.getParameter(request, prefix + "ofc_frgn                 ".trim(), length));
            String[] curr_cd1          =  (JSPUtil.getParameter(request, prefix + "curr_cd1                 ".trim(), length));
            String[] curr_cd2          =  (JSPUtil.getParameter(request, prefix + "curr_cd2                 ".trim(), length));
            String[] ofc_center        =  (JSPUtil.getParameter(request, prefix + "ofc_center               ".trim(), length));
            String[] ofc_ho_acct       =  (JSPUtil.getParameter(request, prefix + "ofc_ho_acct              ".trim(), length));
            String[] ofc_open_dt       =  (JSPUtil.getParameter(request, prefix + "ofc_open_dt              ".trim(), length));
            String[] ofc_close_dt      =  (JSPUtil.getParameter(request, prefix + "ofc_close_dt             ".trim(), length));
            String[] ofc_del_mark      =  (JSPUtil.getParameter(request, prefix + "ofc_del_mark             ".trim(), length));
            String[] ofc_reg_dt        =  (JSPUtil.getParameter(request, prefix + "ofc_reg_dt               ".trim(), length));
            String[] ofc_updt_dt       =  (JSPUtil.getParameter(request, prefix + "ofc_updt_dt              ".trim(), length));
            String[] ofc_user_id       =  (JSPUtil.getParameter(request, prefix + "ofc_user_id              ".trim(), length));
            String[] ofc_ar_rev        =  (JSPUtil.getParameter(request, prefix + "ofc_ar_rev               ".trim(), length));
            String[] ofc_ar_hq         =  (JSPUtil.getParameter(request, prefix + "ofc_ar_hq                ".trim(), length));
            String[] ofc_ar_control    =  (JSPUtil.getParameter(request, prefix + "ofc_ar_control           ".trim(), length));
            String[] ofc_ap_ho_acct    =  (JSPUtil.getParameter(request, prefix + "ofc_ap_ho_acct           ".trim(), length));
            String[] ofc_fa_ho_acct    =  (JSPUtil.getParameter(request, prefix + "ofc_fa_ho_acct           ".trim(), length));
            String[] ofc_ib_crd_term   =  (JSPUtil.getParameter(request, prefix + "ofc_ib_crd_term          ".trim(), length));
            String[] ofc_ob_crd_term   =  (JSPUtil.getParameter(request, prefix + "ofc_ob_crd_term          ".trim(), length));
            String[] ofc_agt_mk        =  (JSPUtil.getParameter(request, prefix + "ofc_agt_mk               ".trim(), length));
            String[] ofc_rep_cnt_cd    =  (JSPUtil.getParameter(request, prefix + "ofc_rep_cnt_cd           ".trim(), length));
            String[] ofc_rep_cust_cd   =  (JSPUtil.getParameter(request, prefix + "ofc_rep_cust_cd          ".trim(), length));
            String[] ofc_inv_prefix    =  (JSPUtil.getParameter(request, prefix + "ofc_inv_prefix           ".trim(), length));
            String[] ofc_ap_fin_ofc    =  (JSPUtil.getParameter(request, prefix + "ofc_ap_fin_ofc           ".trim(), length));
            String[] ofc_ap_fin_ctr    =  (JSPUtil.getParameter(request, prefix + "ofc_ap_fin_ctr           ".trim(), length));
            String[] ofc_ap_ctrl_ofc   =  (JSPUtil.getParameter(request, prefix + "ofc_ap_ctrl_ofc          ".trim(), length));
            String[] ofc_agent_mark    =  (JSPUtil.getParameter(request, prefix + "ofc_agent_mark           ".trim(), length));
            String[] ofc_eur_lcl_rate  =  (JSPUtil.getParameter(request, prefix + "ofc_eur_lcl_rate         ".trim(), length));
            String[] ofc_vat_rate      =  (JSPUtil.getParameter(request, prefix + "ofc_vat_rate             ".trim(), length));
            String[] ofc_ap_eur_mark   =  (JSPUtil.getParameter(request, prefix + "ofc_ap_eur_mark          ".trim(), length));
            String[] ofc_ap_eur_rate   =  (JSPUtil.getParameter(request, prefix + "ofc_ap_eur_rate          ".trim(), length));
            String[] ofc_ems_ctr       =  (JSPUtil.getParameter(request, prefix + "ofc_ems_ctr              ".trim(), length));
            String[] ofc_ems_ctr_eng   =  (JSPUtil.getParameter(request, prefix + "ofc_ems_ctr_eng          ".trim(), length));
            String[] dsen_control_ofc  =  (JSPUtil.getParameter(request, prefix + "dsen_control_ofc         ".trim(), length));
            String[] dsen_credit_term  =  (JSPUtil.getParameter(request, prefix + "dsen_credit_term         ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, prefix + "nis_event_dt             ".trim(), length));
            String[] agt_so_mark       =  (JSPUtil.getParameter(request, prefix + "agt_so_mark              ".trim(), length));
            String[] ofc_spc_sen_ind   =  (JSPUtil.getParameter(request, prefix + "ofc_spc_sen_ind          ".trim(), length));
            String[] ofc_spc_sen_ptcd  =  (JSPUtil.getParameter(request, prefix + "ofc_spc_sen_ptcd         ".trim(), length));
            String[] ofc_spc_sen_level =  (JSPUtil.getParameter(request, prefix + "ofc_spc_sen_level        ".trim(), length));
            String[] ofc_ap_emu_mk     =  (JSPUtil.getParameter(request, prefix + "ofc_ap_emu_mk            ".trim(), length));
            String[] eur_org_cur       =  (JSPUtil.getParameter(request, prefix + "eur_org_cur              ".trim(), length));
            String[] usa_bkg_no_chk    =  (JSPUtil.getParameter(request, prefix + "usa_bkg_no_chk           ".trim(), length));
            String[] ofc_ap_pay_mk     =  (JSPUtil.getParameter(request, prefix + "ofc_ap_pay_mk            ".trim(), length));
            String[] ofc_ap_pay_div    =  (JSPUtil.getParameter(request, prefix + "ofc_ap_pay_div           ".trim(), length));
            String[] ofc_sal_del       =  (JSPUtil.getParameter(request, prefix + "ofc_sal_del              ".trim(), length));
            String[] ofc_sal_div       =  (JSPUtil.getParameter(request, prefix + "ofc_sal_div              ".trim(), length));
            String[] ofc_ap_inv_div    =  (JSPUtil.getParameter(request, prefix + "ofc_ap_inv_div           ".trim(), length));
            String[] ofc_ap_pay_curr   =  (JSPUtil.getParameter(request, prefix + "ofc_ap_pay_curr          ".trim(), length));
            String[] fax_ip_addr       =  (JSPUtil.getParameter(request, prefix + "fax_ip_addr              ".trim(), length));
            String[] ofc_rfa_sc        =  (JSPUtil.getParameter(request, prefix + "ofc_rfa_sc               ".trim(), length));
            String[] ofc_oprn          =  (JSPUtil.getParameter(request, prefix + "ofc_oprn                 ".trim(), length));
            String[] ofc_finan         =  (JSPUtil.getParameter(request, prefix + "ofc_finan                ".trim(), length));
            String[] m_ofc_cd          =  (JSPUtil.getParameter(request, prefix + "m_ofc_cd                 ".trim(), length));
            String[] m_mst_ofc_id      =  (JSPUtil.getParameter(request, prefix + "m_mst_ofc_id             ".trim(), length));
            String[] m_ofc_knd_cd      =  (JSPUtil.getParameter(request, prefix + "m_ofc_knd_cd             ".trim(), length));
            String[] m_agn_knd_cd      =  (JSPUtil.getParameter(request, prefix + "m_agn_knd_cd             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new OFFICE();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setOfc_cd                     ( ofc_cd               [i]);
                model.setOfc_nm                     ( ofc_nm               [i]);
                model.setOfc_addr                   ( ofc_addr             [i]);
                model.setOfc_zip                    ( ofc_zip              [i]);
                model.setOfc_kind1                  ( ofc_kind1            [i]);
                model.setOfc_kind2                  ( ofc_kind2            [i]);
                model.setCnt_cd                     ( cnt_cd               [i]);
                model.setVndr_seq                   ( vndr_seq             [i]);
                model.setOfc_mgr_cd                 ( ofc_mgr_cd           [i]);
                model.setOfc_mgr_tit                ( ofc_mgr_tit          [i]);
                model.setOfc_mgr_nm                 ( ofc_mgr_nm           [i]);
                model.setOfc_tel                    ( ofc_tel              [i]);
                model.setOfc_fax                    ( ofc_fax              [i]);
                model.setOfc_ip_addr                ( ofc_ip_addr          [i]);
                model.setOfc_pts_cd                 ( ofc_pts_cd           [i]);
                model.setOfc_pts_lo                 ( ofc_pts_lo           [i]);
                model.setOfc_psn_qty                ( ofc_psn_qty          [i]);
                model.setOfc_rmk                    ( ofc_rmk              [i]);
                model.setLoc_cd                     ( loc_cd               [i]);
                model.setOfc_spc_qty_ind            ( ofc_spc_qty_ind      [i]);
                model.setOfc_spc_ptc_cd             ( ofc_spc_ptc_cd       [i]);
                model.setOfc_spc_level              ( ofc_spc_level        [i]);
                model.setOfc_frgn                   ( ofc_frgn             [i]);
                model.setCurr_cd1                   ( curr_cd1             [i]);
                model.setCurr_cd2                   ( curr_cd2             [i]);
                model.setOfc_center                 ( ofc_center           [i]);
                model.setOfc_ho_acct                ( ofc_ho_acct          [i]);
                model.setOfc_open_dt                ( ofc_open_dt          [i]);
                model.setOfc_close_dt               ( ofc_close_dt         [i]);
                model.setOfc_del_mark               ( ofc_del_mark         [i]);
                model.setOfc_reg_dt                 ( ofc_reg_dt           [i]);
                model.setOfc_updt_dt                ( ofc_updt_dt          [i]);
                model.setOfc_user_id                ( ofc_user_id          [i]);
                model.setOfc_ar_rev                 ( ofc_ar_rev           [i]);
                model.setOfc_ar_hq                  ( ofc_ar_hq            [i]);
                model.setOfc_ar_control             ( ofc_ar_control       [i]);
                model.setOfc_ap_ho_acct             ( ofc_ap_ho_acct       [i]);
                model.setOfc_fa_ho_acct             ( ofc_fa_ho_acct       [i]);
                model.setOfc_ib_crd_term            ( ofc_ib_crd_term      [i]);
                model.setOfc_ob_crd_term            ( ofc_ob_crd_term      [i]);
                model.setOfc_agt_mk                 ( ofc_agt_mk           [i]);
                model.setOfc_rep_cnt_cd             ( ofc_rep_cnt_cd       [i]);
                model.setOfc_rep_cust_cd            ( ofc_rep_cust_cd      [i]);
                model.setOfc_inv_prefix             ( ofc_inv_prefix       [i]);
                model.setOfc_ap_fin_ofc             ( ofc_ap_fin_ofc       [i]);
                model.setOfc_ap_fin_ctr             ( ofc_ap_fin_ctr       [i]);
                model.setOfc_ap_ctrl_ofc            ( ofc_ap_ctrl_ofc      [i]);
                model.setOfc_agent_mark             ( ofc_agent_mark       [i]);
                model.setOfc_eur_lcl_rate           ( ofc_eur_lcl_rate     [i]);
                model.setOfc_vat_rate               ( ofc_vat_rate         [i]);
                model.setOfc_ap_eur_mark            ( ofc_ap_eur_mark      [i]);
                model.setOfc_ap_eur_rate            ( ofc_ap_eur_rate      [i]);
                model.setOfc_ems_ctr                ( ofc_ems_ctr          [i]);
                model.setOfc_ems_ctr_eng            ( ofc_ems_ctr_eng      [i]);
                model.setDsen_control_ofc           ( dsen_control_ofc     [i]);
                model.setDsen_credit_term           ( dsen_credit_term     [i]);
                model.setNis_event_dt               ( nis_event_dt         [i]);
                model.setAgt_so_mark                ( agt_so_mark          [i]);
                model.setOfc_spc_sen_ind            ( ofc_spc_sen_ind      [i]);
                model.setOfc_spc_sen_ptcd           ( ofc_spc_sen_ptcd     [i]);
                model.setOfc_spc_sen_level          ( ofc_spc_sen_level    [i]);
                model.setOfc_ap_emu_mk              ( ofc_ap_emu_mk        [i]);
                model.setEur_org_cur                ( eur_org_cur          [i]);
                model.setUsa_bkg_no_chk             ( usa_bkg_no_chk       [i]);
                model.setOfc_ap_pay_mk              ( ofc_ap_pay_mk        [i]);
                model.setOfc_ap_pay_div             ( ofc_ap_pay_div       [i]);
                model.setOfc_sal_del                ( ofc_sal_del          [i]);
                model.setOfc_sal_div                ( ofc_sal_div          [i]);
                model.setOfc_ap_inv_div             ( ofc_ap_inv_div       [i]);
                model.setOfc_ap_pay_curr            ( ofc_ap_pay_curr      [i]);
                model.setFax_ip_addr                ( fax_ip_addr          [i]);
                model.setOfc_rfa_sc                 ( ofc_rfa_sc           [i]);
                model.setOfc_oprn                   ( ofc_oprn             [i]);
                model.setOfc_finan                  ( ofc_finan            [i]);
                model.setM_ofc_cd                   ( m_ofc_cd             [i]);
                model.setM_mst_ofc_id               ( m_mst_ofc_id         [i]);
                model.setM_ofc_knd_cd               ( m_ofc_knd_cd         [i]);
                model.setM_agn_knd_cd               ( m_agn_knd_cd         [i]);
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
