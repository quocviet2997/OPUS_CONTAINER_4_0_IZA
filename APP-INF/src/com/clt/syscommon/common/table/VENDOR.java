/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VENDOR.java
*@FileTitle : ServiceProvider정보조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-08-07 Kildong_hong
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */public final class VENDOR implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            cnt_cd            = "";
    private String            vndr_seq          = "";
    private String            vndr_loc          = "";
    private String            ofc_cd            = "";
    private String            vndr_ceo          = "";
    private String            vndr_owner        = "";
    private String            vndr_regist_no    = "";
    private String            vndr_nm_ab        = "";
    private String            vndr_nm_eng       = "";
    private String            vndr_nm_kor       = "";
    private String            vndr_pts_cnt      = "";
    private String            vndr_pts_seq      = "";
    private String            vndr_addr_eng     = "";
    private String            vndr_addr_kor     = "";
    private String            vndr_zip          = "";
    private String            vndr_tel          = "";
    private String            vndr_fax          = "";
    private String            vndr_pic          = "";
    private String            vndr_facility     = "";
    private String            vndr_svc_scope    = "";
    private String            vndr_svc_frq      = "";
    private String            vndr_svc_frq_text = "";
    private String            vndr_rmk          = "";
    private String            vndr_wo_iss_tp    = "";
    private String            vndr_agt          = "";
    private String            vndr_fp_div       = "";
    private String            vndr_pay_sty      = "";
    private String            vndr_co_tp        = "";
    private String            vndr_b_cat        = "";
    private String            vndr_b_tp         = "";
    private String            vndr_bnk_nm       = "";
    private String            vndr_bnk_brn_nm   = "";
    private String            vndr_bnk_addr     = "";
    private String            vndr_bf_ac        = "";
    private String            vndr_dpstr        = "";
    private String            vndr_fst_ctrt_dt  = "";
    private String            vndr_gen_pay_term = "";
    private String            vndr_del_mk       = "";
    private String            vndr_rgst_dt      = "";
    private String            vndr_updt_dt      = "";
    private String            vndr_userid       = "";
    private String            vndr_scac         = "";
    private String            vndr_ceo_kor      = "";
    private String            vndr_addr_kor2    = "";
    private String            ap_pymt_mth       = "";
    private String            ap_cnt_cd         = "";
    private String            ap_vndr_seq       = "";
    private String            nis_event_dt      = "";
    private String            email_addr        = "";
    private String            vndr_div          = "";
    private String            hanfis_vndr_cd    = "";
    private String            wo_attch_file     = "";

    public VENDOR(){}

    public VENDOR(
            String            ibflag           ,
            String            page_rows        ,
            String            cnt_cd           ,
            String            vndr_seq         ,
            String            vndr_loc         ,
            String            ofc_cd           ,
            String            vndr_ceo         ,
            String            vndr_owner       ,
            String            vndr_regist_no   ,
            String            vndr_nm_ab       ,
            String            vndr_nm_eng      ,
            String            vndr_nm_kor      ,
            String            vndr_pts_cnt     ,
            String            vndr_pts_seq     ,
            String            vndr_addr_eng    ,
            String            vndr_addr_kor    ,
            String            vndr_zip         ,
            String            vndr_tel         ,
            String            vndr_fax         ,
            String            vndr_pic         ,
            String            vndr_facility    ,
            String            vndr_svc_scope   ,
            String            vndr_svc_frq     ,
            String            vndr_svc_frq_text,
            String            vndr_rmk         ,
            String            vndr_wo_iss_tp   ,
            String            vndr_agt         ,
            String            vndr_fp_div      ,
            String            vndr_pay_sty     ,
            String            vndr_co_tp       ,
            String            vndr_b_cat       ,
            String            vndr_b_tp        ,
            String            vndr_bnk_nm      ,
            String            vndr_bnk_brn_nm  ,
            String            vndr_bnk_addr    ,
            String            vndr_bf_ac       ,
            String            vndr_dpstr       ,
            String            vndr_fst_ctrt_dt ,
            String            vndr_gen_pay_term,
            String            vndr_del_mk      ,
            String            vndr_rgst_dt     ,
            String            vndr_updt_dt     ,
            String            vndr_userid      ,
            String            vndr_scac        ,
            String            vndr_ceo_kor     ,
            String            vndr_addr_kor2   ,
            String            ap_pymt_mth      ,
            String            ap_cnt_cd        ,
            String            ap_vndr_seq      ,
            String            nis_event_dt     ,
            String            email_addr       ,
            String            vndr_div         ,
            String            hanfis_vndr_cd   ,
            String            wo_attch_file    ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.cnt_cd            = cnt_cd           ;
        this.vndr_seq          = vndr_seq         ;
        this.vndr_loc          = vndr_loc         ;
        this.ofc_cd            = ofc_cd           ;
        this.vndr_ceo          = vndr_ceo         ;
        this.vndr_owner        = vndr_owner       ;
        this.vndr_regist_no    = vndr_regist_no   ;
        this.vndr_nm_ab        = vndr_nm_ab       ;
        this.vndr_nm_eng       = vndr_nm_eng      ;
        this.vndr_nm_kor       = vndr_nm_kor      ;
        this.vndr_pts_cnt      = vndr_pts_cnt     ;
        this.vndr_pts_seq      = vndr_pts_seq     ;
        this.vndr_addr_eng     = vndr_addr_eng    ;
        this.vndr_addr_kor     = vndr_addr_kor    ;
        this.vndr_zip          = vndr_zip         ;
        this.vndr_tel          = vndr_tel         ;
        this.vndr_fax          = vndr_fax         ;
        this.vndr_pic          = vndr_pic         ;
        this.vndr_facility     = vndr_facility    ;
        this.vndr_svc_scope    = vndr_svc_scope   ;
        this.vndr_svc_frq      = vndr_svc_frq     ;
        this.vndr_svc_frq_text = vndr_svc_frq_text;
        this.vndr_rmk          = vndr_rmk         ;
        this.vndr_wo_iss_tp    = vndr_wo_iss_tp   ;
        this.vndr_agt          = vndr_agt         ;
        this.vndr_fp_div       = vndr_fp_div      ;
        this.vndr_pay_sty      = vndr_pay_sty     ;
        this.vndr_co_tp        = vndr_co_tp       ;
        this.vndr_b_cat        = vndr_b_cat       ;
        this.vndr_b_tp         = vndr_b_tp        ;
        this.vndr_bnk_nm       = vndr_bnk_nm      ;
        this.vndr_bnk_brn_nm   = vndr_bnk_brn_nm  ;
        this.vndr_bnk_addr     = vndr_bnk_addr    ;
        this.vndr_bf_ac        = vndr_bf_ac       ;
        this.vndr_dpstr        = vndr_dpstr       ;
        this.vndr_fst_ctrt_dt  = vndr_fst_ctrt_dt ;
        this.vndr_gen_pay_term = vndr_gen_pay_term;
        this.vndr_del_mk       = vndr_del_mk      ;
        this.vndr_rgst_dt      = vndr_rgst_dt     ;
        this.vndr_updt_dt      = vndr_updt_dt     ;
        this.vndr_userid       = vndr_userid      ;
        this.vndr_scac         = vndr_scac        ;
        this.vndr_ceo_kor      = vndr_ceo_kor     ;
        this.vndr_addr_kor2    = vndr_addr_kor2   ;
        this.ap_pymt_mth       = ap_pymt_mth      ;
        this.ap_cnt_cd         = ap_cnt_cd        ;
        this.ap_vndr_seq       = ap_vndr_seq      ;
        this.nis_event_dt      = nis_event_dt     ;
        this.email_addr        = email_addr       ;
        this.vndr_div          = vndr_div         ;
        this.hanfis_vndr_cd    = hanfis_vndr_cd   ;
        this.wo_attch_file     = wo_attch_file    ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getCnt_cd           (){    return cnt_cd               ;    }
    public String            getVndr_seq         (){    return vndr_seq             ;    }
    public String            getVndr_loc         (){    return vndr_loc             ;    }
    public String            getOfc_cd           (){    return ofc_cd               ;    }
    public String            getVndr_ceo         (){    return vndr_ceo             ;    }
    public String            getVndr_owner       (){    return vndr_owner           ;    }
    public String            getVndr_regist_no   (){    return vndr_regist_no       ;    }
    public String            getVndr_nm_ab       (){    return vndr_nm_ab           ;    }
    public String            getVndr_nm_eng      (){    return vndr_nm_eng          ;    }
    public String            getVndr_nm_kor      (){    return vndr_nm_kor          ;    }
    public String            getVndr_pts_cnt     (){    return vndr_pts_cnt         ;    }
    public String            getVndr_pts_seq     (){    return vndr_pts_seq         ;    }
    public String            getVndr_addr_eng    (){    return vndr_addr_eng        ;    }
    public String            getVndr_addr_kor    (){    return vndr_addr_kor        ;    }
    public String            getVndr_zip         (){    return vndr_zip             ;    }
    public String            getVndr_tel         (){    return vndr_tel             ;    }
    public String            getVndr_fax         (){    return vndr_fax             ;    }
    public String            getVndr_pic         (){    return vndr_pic             ;    }
    public String            getVndr_facility    (){    return vndr_facility        ;    }
    public String            getVndr_svc_scope   (){    return vndr_svc_scope       ;    }
    public String            getVndr_svc_frq     (){    return vndr_svc_frq         ;    }
    public String            getVndr_svc_frq_text(){    return vndr_svc_frq_text    ;    }
    public String            getVndr_rmk         (){    return vndr_rmk             ;    }
    public String            getVndr_wo_iss_tp   (){    return vndr_wo_iss_tp       ;    }
    public String            getVndr_agt         (){    return vndr_agt             ;    }
    public String            getVndr_fp_div      (){    return vndr_fp_div          ;    }
    public String            getVndr_pay_sty     (){    return vndr_pay_sty         ;    }
    public String            getVndr_co_tp       (){    return vndr_co_tp           ;    }
    public String            getVndr_b_cat       (){    return vndr_b_cat           ;    }
    public String            getVndr_b_tp        (){    return vndr_b_tp            ;    }
    public String            getVndr_bnk_nm      (){    return vndr_bnk_nm          ;    }
    public String            getVndr_bnk_brn_nm  (){    return vndr_bnk_brn_nm      ;    }
    public String            getVndr_bnk_addr    (){    return vndr_bnk_addr        ;    }
    public String            getVndr_bf_ac       (){    return vndr_bf_ac           ;    }
    public String            getVndr_dpstr       (){    return vndr_dpstr           ;    }
    public String            getVndr_fst_ctrt_dt (){    return vndr_fst_ctrt_dt     ;    }
    public String            getVndr_gen_pay_term(){    return vndr_gen_pay_term    ;    }
    public String            getVndr_del_mk      (){    return vndr_del_mk          ;    }
    public String            getVndr_rgst_dt     (){    return vndr_rgst_dt         ;    }
    public String            getVndr_updt_dt     (){    return vndr_updt_dt         ;    }
    public String            getVndr_userid      (){    return vndr_userid          ;    }
    public String            getVndr_scac        (){    return vndr_scac            ;    }
    public String            getVndr_ceo_kor     (){    return vndr_ceo_kor         ;    }
    public String            getVndr_addr_kor2   (){    return vndr_addr_kor2       ;    }
    public String            getAp_pymt_mth      (){    return ap_pymt_mth          ;    }
    public String            getAp_cnt_cd        (){    return ap_cnt_cd            ;    }
    public String            getAp_vndr_seq      (){    return ap_vndr_seq          ;    }
    public String            getNis_event_dt     (){    return nis_event_dt         ;    }
    public String            getEmail_addr       (){    return email_addr           ;    }
    public String            getVndr_div         (){    return vndr_div             ;    }
    public String            getHanfis_vndr_cd   (){    return hanfis_vndr_cd       ;    }
    public String            getWo_attch_file    (){    return wo_attch_file        ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setCnt_cd           ( String            cnt_cd            ){    this.cnt_cd            = cnt_cd               ;    }
    public void setVndr_seq         ( String            vndr_seq          ){    this.vndr_seq          = vndr_seq             ;    }
    public void setVndr_loc         ( String            vndr_loc          ){    this.vndr_loc          = vndr_loc             ;    }
    public void setOfc_cd           ( String            ofc_cd            ){    this.ofc_cd            = ofc_cd               ;    }
    public void setVndr_ceo         ( String            vndr_ceo          ){    this.vndr_ceo          = vndr_ceo             ;    }
    public void setVndr_owner       ( String            vndr_owner        ){    this.vndr_owner        = vndr_owner           ;    }
    public void setVndr_regist_no   ( String            vndr_regist_no    ){    this.vndr_regist_no    = vndr_regist_no       ;    }
    public void setVndr_nm_ab       ( String            vndr_nm_ab        ){    this.vndr_nm_ab        = vndr_nm_ab           ;    }
    public void setVndr_nm_eng      ( String            vndr_nm_eng       ){    this.vndr_nm_eng       = vndr_nm_eng          ;    }
    public void setVndr_nm_kor      ( String            vndr_nm_kor       ){    this.vndr_nm_kor       = vndr_nm_kor          ;    }
    public void setVndr_pts_cnt     ( String            vndr_pts_cnt      ){    this.vndr_pts_cnt      = vndr_pts_cnt         ;    }
    public void setVndr_pts_seq     ( String            vndr_pts_seq      ){    this.vndr_pts_seq      = vndr_pts_seq         ;    }
    public void setVndr_addr_eng    ( String            vndr_addr_eng     ){    this.vndr_addr_eng     = vndr_addr_eng        ;    }
    public void setVndr_addr_kor    ( String            vndr_addr_kor     ){    this.vndr_addr_kor     = vndr_addr_kor        ;    }
    public void setVndr_zip         ( String            vndr_zip          ){    this.vndr_zip          = vndr_zip             ;    }
    public void setVndr_tel         ( String            vndr_tel          ){    this.vndr_tel          = vndr_tel             ;    }
    public void setVndr_fax         ( String            vndr_fax          ){    this.vndr_fax          = vndr_fax             ;    }
    public void setVndr_pic         ( String            vndr_pic          ){    this.vndr_pic          = vndr_pic             ;    }
    public void setVndr_facility    ( String            vndr_facility     ){    this.vndr_facility     = vndr_facility        ;    }
    public void setVndr_svc_scope   ( String            vndr_svc_scope    ){    this.vndr_svc_scope    = vndr_svc_scope       ;    }
    public void setVndr_svc_frq     ( String            vndr_svc_frq      ){    this.vndr_svc_frq      = vndr_svc_frq         ;    }
    public void setVndr_svc_frq_text( String            vndr_svc_frq_text ){    this.vndr_svc_frq_text = vndr_svc_frq_text    ;    }
    public void setVndr_rmk         ( String            vndr_rmk          ){    this.vndr_rmk          = vndr_rmk             ;    }
    public void setVndr_wo_iss_tp   ( String            vndr_wo_iss_tp    ){    this.vndr_wo_iss_tp    = vndr_wo_iss_tp       ;    }
    public void setVndr_agt         ( String            vndr_agt          ){    this.vndr_agt          = vndr_agt             ;    }
    public void setVndr_fp_div      ( String            vndr_fp_div       ){    this.vndr_fp_div       = vndr_fp_div          ;    }
    public void setVndr_pay_sty     ( String            vndr_pay_sty      ){    this.vndr_pay_sty      = vndr_pay_sty         ;    }
    public void setVndr_co_tp       ( String            vndr_co_tp        ){    this.vndr_co_tp        = vndr_co_tp           ;    }
    public void setVndr_b_cat       ( String            vndr_b_cat        ){    this.vndr_b_cat        = vndr_b_cat           ;    }
    public void setVndr_b_tp        ( String            vndr_b_tp         ){    this.vndr_b_tp         = vndr_b_tp            ;    }
    public void setVndr_bnk_nm      ( String            vndr_bnk_nm       ){    this.vndr_bnk_nm       = vndr_bnk_nm          ;    }
    public void setVndr_bnk_brn_nm  ( String            vndr_bnk_brn_nm   ){    this.vndr_bnk_brn_nm   = vndr_bnk_brn_nm      ;    }
    public void setVndr_bnk_addr    ( String            vndr_bnk_addr     ){    this.vndr_bnk_addr     = vndr_bnk_addr        ;    }
    public void setVndr_bf_ac       ( String            vndr_bf_ac        ){    this.vndr_bf_ac        = vndr_bf_ac           ;    }
    public void setVndr_dpstr       ( String            vndr_dpstr        ){    this.vndr_dpstr        = vndr_dpstr           ;    }
    public void setVndr_fst_ctrt_dt ( String            vndr_fst_ctrt_dt  ){    this.vndr_fst_ctrt_dt  = vndr_fst_ctrt_dt     ;    }
    public void setVndr_gen_pay_term( String            vndr_gen_pay_term ){    this.vndr_gen_pay_term = vndr_gen_pay_term    ;    }
    public void setVndr_del_mk      ( String            vndr_del_mk       ){    this.vndr_del_mk       = vndr_del_mk          ;    }
    public void setVndr_rgst_dt     ( String            vndr_rgst_dt      ){    this.vndr_rgst_dt      = vndr_rgst_dt         ;    }
    public void setVndr_updt_dt     ( String            vndr_updt_dt      ){    this.vndr_updt_dt      = vndr_updt_dt         ;    }
    public void setVndr_userid      ( String            vndr_userid       ){    this.vndr_userid       = vndr_userid          ;    }
    public void setVndr_scac        ( String            vndr_scac         ){    this.vndr_scac         = vndr_scac            ;    }
    public void setVndr_ceo_kor     ( String            vndr_ceo_kor      ){    this.vndr_ceo_kor      = vndr_ceo_kor         ;    }
    public void setVndr_addr_kor2   ( String            vndr_addr_kor2    ){    this.vndr_addr_kor2    = vndr_addr_kor2       ;    }
    public void setAp_pymt_mth      ( String            ap_pymt_mth       ){    this.ap_pymt_mth       = ap_pymt_mth          ;    }
    public void setAp_cnt_cd        ( String            ap_cnt_cd         ){    this.ap_cnt_cd         = ap_cnt_cd            ;    }
    public void setAp_vndr_seq      ( String            ap_vndr_seq       ){    this.ap_vndr_seq       = ap_vndr_seq          ;    }
    public void setNis_event_dt     ( String            nis_event_dt      ){    this.nis_event_dt      = nis_event_dt         ;    }
    public void setEmail_addr       ( String            email_addr        ){    this.email_addr        = email_addr           ;    }
    public void setVndr_div         ( String            vndr_div          ){    this.vndr_div          = vndr_div             ;    }
    public void setHanfis_vndr_cd   ( String            hanfis_vndr_cd    ){    this.hanfis_vndr_cd    = hanfis_vndr_cd       ;    }
    public void setWo_attch_file    ( String            wo_attch_file     ){    this.wo_attch_file     = wo_attch_file        ;    }

    public static VENDOR fromRequest(HttpServletRequest request) {
        VENDOR model = new VENDOR();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setCnt_cd               (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), ""));
            model.setVndr_seq             (JSPUtil.getParameter(request, "vndr_seq                 ".trim(), ""));
            model.setVndr_loc             (JSPUtil.getParameter(request, "vndr_loc                 ".trim(), ""));
            model.setOfc_cd               (JSPUtil.getParameter(request, "ofc_cd                   ".trim(), ""));
            model.setVndr_ceo             (JSPUtil.getParameter(request, "vndr_ceo                 ".trim(), ""));
            model.setVndr_owner           (JSPUtil.getParameter(request, "vndr_owner               ".trim(), ""));
            model.setVndr_regist_no       (JSPUtil.getParameter(request, "vndr_regist_no           ".trim(), ""));
            model.setVndr_nm_ab           (JSPUtil.getParameter(request, "vndr_nm_ab               ".trim(), ""));
            model.setVndr_nm_eng          (JSPUtil.getParameter(request, "vndr_nm_eng              ".trim(), ""));
            model.setVndr_nm_kor          (JSPUtil.getParameter(request, "vndr_nm_kor              ".trim(), ""));
            model.setVndr_pts_cnt         (JSPUtil.getParameter(request, "vndr_pts_cnt             ".trim(), ""));
            model.setVndr_pts_seq         (JSPUtil.getParameter(request, "vndr_pts_seq             ".trim(), ""));
            model.setVndr_addr_eng        (JSPUtil.getParameter(request, "vndr_addr_eng            ".trim(), ""));
            model.setVndr_addr_kor        (JSPUtil.getParameter(request, "vndr_addr_kor            ".trim(), ""));
            model.setVndr_zip             (JSPUtil.getParameter(request, "vndr_zip                 ".trim(), ""));
            model.setVndr_tel             (JSPUtil.getParameter(request, "vndr_tel                 ".trim(), ""));
            model.setVndr_fax             (JSPUtil.getParameter(request, "vndr_fax                 ".trim(), ""));
            model.setVndr_pic             (JSPUtil.getParameter(request, "vndr_pic                 ".trim(), ""));
            model.setVndr_facility        (JSPUtil.getParameter(request, "vndr_facility            ".trim(), ""));
            model.setVndr_svc_scope       (JSPUtil.getParameter(request, "vndr_svc_scope           ".trim(), ""));
            model.setVndr_svc_frq         (JSPUtil.getParameter(request, "vndr_svc_frq             ".trim(), ""));
            model.setVndr_svc_frq_text    (JSPUtil.getParameter(request, "vndr_svc_frq_text        ".trim(), ""));
            model.setVndr_rmk             (JSPUtil.getParameter(request, "vndr_rmk                 ".trim(), ""));
            model.setVndr_wo_iss_tp       (JSPUtil.getParameter(request, "vndr_wo_iss_tp           ".trim(), ""));
            model.setVndr_agt             (JSPUtil.getParameter(request, "vndr_agt                 ".trim(), ""));
            model.setVndr_fp_div          (JSPUtil.getParameter(request, "vndr_fp_div              ".trim(), ""));
            model.setVndr_pay_sty         (JSPUtil.getParameter(request, "vndr_pay_sty             ".trim(), ""));
            model.setVndr_co_tp           (JSPUtil.getParameter(request, "vndr_co_tp               ".trim(), ""));
            model.setVndr_b_cat           (JSPUtil.getParameter(request, "vndr_b_cat               ".trim(), ""));
            model.setVndr_b_tp            (JSPUtil.getParameter(request, "vndr_b_tp                ".trim(), ""));
            model.setVndr_bnk_nm          (JSPUtil.getParameter(request, "vndr_bnk_nm              ".trim(), ""));
            model.setVndr_bnk_brn_nm      (JSPUtil.getParameter(request, "vndr_bnk_brn_nm          ".trim(), ""));
            model.setVndr_bnk_addr        (JSPUtil.getParameter(request, "vndr_bnk_addr            ".trim(), ""));
            model.setVndr_bf_ac           (JSPUtil.getParameter(request, "vndr_bf_ac               ".trim(), ""));
            model.setVndr_dpstr           (JSPUtil.getParameter(request, "vndr_dpstr               ".trim(), ""));
            model.setVndr_fst_ctrt_dt     (JSPUtil.getParameter(request, "vndr_fst_ctrt_dt         ".trim(), ""));
            model.setVndr_gen_pay_term    (JSPUtil.getParameter(request, "vndr_gen_pay_term        ".trim(), ""));
            model.setVndr_del_mk          (JSPUtil.getParameter(request, "vndr_del_mk              ".trim(), ""));
            model.setVndr_rgst_dt         (JSPUtil.getParameter(request, "vndr_rgst_dt             ".trim(), ""));
            model.setVndr_updt_dt         (JSPUtil.getParameter(request, "vndr_updt_dt             ".trim(), ""));
            model.setVndr_userid          (JSPUtil.getParameter(request, "vndr_userid              ".trim(), ""));
            model.setVndr_scac            (JSPUtil.getParameter(request, "vndr_scac                ".trim(), ""));
            model.setVndr_ceo_kor         (JSPUtil.getParameter(request, "vndr_ceo_kor             ".trim(), ""));
            model.setVndr_addr_kor2       (JSPUtil.getParameter(request, "vndr_addr_kor2           ".trim(), ""));
            model.setAp_pymt_mth          (JSPUtil.getParameter(request, "ap_pymt_mth              ".trim(), ""));
            model.setAp_cnt_cd            (JSPUtil.getParameter(request, "ap_cnt_cd                ".trim(), ""));
            model.setAp_vndr_seq          (JSPUtil.getParameter(request, "ap_vndr_seq              ".trim(), ""));
            model.setNis_event_dt         (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), ""));
            model.setEmail_addr           (JSPUtil.getParameter(request, "email_addr               ".trim(), ""));
            model.setVndr_div             (JSPUtil.getParameter(request, "vndr_div                 ".trim(), ""));
            model.setHanfis_vndr_cd       (JSPUtil.getParameter(request, "hanfis_vndr_cd           ".trim(), ""));
            model.setWo_attch_file        (JSPUtil.getParameter(request, "wo_attch_file            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        VENDOR model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), length));
            String[] vndr_seq          =  (JSPUtil.getParameter(request, "vndr_seq                 ".trim(), length));
            String[] vndr_loc          =  (JSPUtil.getParameter(request, "vndr_loc                 ".trim(), length));
            String[] ofc_cd            =  (JSPUtil.getParameter(request, "ofc_cd                   ".trim(), length));
            String[] vndr_ceo          =  (JSPUtil.getParameter(request, "vndr_ceo                 ".trim(), length));
            String[] vndr_owner        =  (JSPUtil.getParameter(request, "vndr_owner               ".trim(), length));
            String[] vndr_regist_no    =  (JSPUtil.getParameter(request, "vndr_regist_no           ".trim(), length));
            String[] vndr_nm_ab        =  (JSPUtil.getParameter(request, "vndr_nm_ab               ".trim(), length));
            String[] vndr_nm_eng       =  (JSPUtil.getParameter(request, "vndr_nm_eng              ".trim(), length));
            String[] vndr_nm_kor       =  (JSPUtil.getParameter(request, "vndr_nm_kor              ".trim(), length));
            String[] vndr_pts_cnt      =  (JSPUtil.getParameter(request, "vndr_pts_cnt             ".trim(), length));
            String[] vndr_pts_seq      =  (JSPUtil.getParameter(request, "vndr_pts_seq             ".trim(), length));
            String[] vndr_addr_eng     =  (JSPUtil.getParameter(request, "vndr_addr_eng            ".trim(), length));
            String[] vndr_addr_kor     =  (JSPUtil.getParameter(request, "vndr_addr_kor            ".trim(), length));
            String[] vndr_zip          =  (JSPUtil.getParameter(request, "vndr_zip                 ".trim(), length));
            String[] vndr_tel          =  (JSPUtil.getParameter(request, "vndr_tel                 ".trim(), length));
            String[] vndr_fax          =  (JSPUtil.getParameter(request, "vndr_fax                 ".trim(), length));
            String[] vndr_pic          =  (JSPUtil.getParameter(request, "vndr_pic                 ".trim(), length));
            String[] vndr_facility     =  (JSPUtil.getParameter(request, "vndr_facility            ".trim(), length));
            String[] vndr_svc_scope    =  (JSPUtil.getParameter(request, "vndr_svc_scope           ".trim(), length));
            String[] vndr_svc_frq      =  (JSPUtil.getParameter(request, "vndr_svc_frq             ".trim(), length));
            String[] vndr_svc_frq_text =  (JSPUtil.getParameter(request, "vndr_svc_frq_text        ".trim(), length));
            String[] vndr_rmk          =  (JSPUtil.getParameter(request, "vndr_rmk                 ".trim(), length));
            String[] vndr_wo_iss_tp    =  (JSPUtil.getParameter(request, "vndr_wo_iss_tp           ".trim(), length));
            String[] vndr_agt          =  (JSPUtil.getParameter(request, "vndr_agt                 ".trim(), length));
            String[] vndr_fp_div       =  (JSPUtil.getParameter(request, "vndr_fp_div              ".trim(), length));
            String[] vndr_pay_sty      =  (JSPUtil.getParameter(request, "vndr_pay_sty             ".trim(), length));
            String[] vndr_co_tp        =  (JSPUtil.getParameter(request, "vndr_co_tp               ".trim(), length));
            String[] vndr_b_cat        =  (JSPUtil.getParameter(request, "vndr_b_cat               ".trim(), length));
            String[] vndr_b_tp         =  (JSPUtil.getParameter(request, "vndr_b_tp                ".trim(), length));
            String[] vndr_bnk_nm       =  (JSPUtil.getParameter(request, "vndr_bnk_nm              ".trim(), length));
            String[] vndr_bnk_brn_nm   =  (JSPUtil.getParameter(request, "vndr_bnk_brn_nm          ".trim(), length));
            String[] vndr_bnk_addr     =  (JSPUtil.getParameter(request, "vndr_bnk_addr            ".trim(), length));
            String[] vndr_bf_ac        =  (JSPUtil.getParameter(request, "vndr_bf_ac               ".trim(), length));
            String[] vndr_dpstr        =  (JSPUtil.getParameter(request, "vndr_dpstr               ".trim(), length));
            String[] vndr_fst_ctrt_dt  =  (JSPUtil.getParameter(request, "vndr_fst_ctrt_dt         ".trim(), length));
            String[] vndr_gen_pay_term =  (JSPUtil.getParameter(request, "vndr_gen_pay_term        ".trim(), length));
            String[] vndr_del_mk       =  (JSPUtil.getParameter(request, "vndr_del_mk              ".trim(), length));
            String[] vndr_rgst_dt      =  (JSPUtil.getParameter(request, "vndr_rgst_dt             ".trim(), length));
            String[] vndr_updt_dt      =  (JSPUtil.getParameter(request, "vndr_updt_dt             ".trim(), length));
            String[] vndr_userid       =  (JSPUtil.getParameter(request, "vndr_userid              ".trim(), length));
            String[] vndr_scac         =  (JSPUtil.getParameter(request, "vndr_scac                ".trim(), length));
            String[] vndr_ceo_kor      =  (JSPUtil.getParameter(request, "vndr_ceo_kor             ".trim(), length));
            String[] vndr_addr_kor2    =  (JSPUtil.getParameter(request, "vndr_addr_kor2           ".trim(), length));
            String[] ap_pymt_mth       =  (JSPUtil.getParameter(request, "ap_pymt_mth              ".trim(), length));
            String[] ap_cnt_cd         =  (JSPUtil.getParameter(request, "ap_cnt_cd                ".trim(), length));
            String[] ap_vndr_seq       =  (JSPUtil.getParameter(request, "ap_vndr_seq              ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, "nis_event_dt             ".trim(), length));
            String[] email_addr        =  (JSPUtil.getParameter(request, "email_addr               ".trim(), length));
            String[] vndr_div          =  (JSPUtil.getParameter(request, "vndr_div                 ".trim(), length));
            String[] hanfis_vndr_cd    =  (JSPUtil.getParameter(request, "hanfis_vndr_cd           ".trim(), length));
            String[] wo_attch_file     =  (JSPUtil.getParameter(request, "wo_attch_file            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VENDOR();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setCnt_cd                     (cnt_cd               [i]);
                model.setVndr_seq                   (vndr_seq             [i]);
                model.setVndr_loc                   (vndr_loc             [i]);
                model.setOfc_cd                     (ofc_cd               [i]);
                model.setVndr_ceo                   (vndr_ceo             [i]);
                model.setVndr_owner                 (vndr_owner           [i]);
                model.setVndr_regist_no             (vndr_regist_no       [i]);
                model.setVndr_nm_ab                 (vndr_nm_ab           [i]);
                model.setVndr_nm_eng                (vndr_nm_eng          [i]);
                model.setVndr_nm_kor                (vndr_nm_kor          [i]);
                model.setVndr_pts_cnt               (vndr_pts_cnt         [i]);
                model.setVndr_pts_seq               (vndr_pts_seq         [i]);
                model.setVndr_addr_eng              (vndr_addr_eng        [i]);
                model.setVndr_addr_kor              (vndr_addr_kor        [i]);
                model.setVndr_zip                   (vndr_zip             [i]);
                model.setVndr_tel                   (vndr_tel             [i]);
                model.setVndr_fax                   (vndr_fax             [i]);
                model.setVndr_pic                   (vndr_pic             [i]);
                model.setVndr_facility              (vndr_facility        [i]);
                model.setVndr_svc_scope             (vndr_svc_scope       [i]);
                model.setVndr_svc_frq               (vndr_svc_frq         [i]);
                model.setVndr_svc_frq_text          (vndr_svc_frq_text    [i]);
                model.setVndr_rmk                   (vndr_rmk             [i]);
                model.setVndr_wo_iss_tp             (vndr_wo_iss_tp       [i]);
                model.setVndr_agt                   (vndr_agt             [i]);
                model.setVndr_fp_div                (vndr_fp_div          [i]);
                model.setVndr_pay_sty               (vndr_pay_sty         [i]);
                model.setVndr_co_tp                 (vndr_co_tp           [i]);
                model.setVndr_b_cat                 (vndr_b_cat           [i]);
                model.setVndr_b_tp                  (vndr_b_tp            [i]);
                model.setVndr_bnk_nm                (vndr_bnk_nm          [i]);
                model.setVndr_bnk_brn_nm            (vndr_bnk_brn_nm      [i]);
                model.setVndr_bnk_addr              (vndr_bnk_addr        [i]);
                model.setVndr_bf_ac                 (vndr_bf_ac           [i]);
                model.setVndr_dpstr                 (vndr_dpstr           [i]);
                model.setVndr_fst_ctrt_dt           (vndr_fst_ctrt_dt     [i]);
                model.setVndr_gen_pay_term          (vndr_gen_pay_term    [i]);
                model.setVndr_del_mk                (vndr_del_mk          [i]);
                model.setVndr_rgst_dt               (vndr_rgst_dt         [i]);
                model.setVndr_updt_dt               (vndr_updt_dt         [i]);
                model.setVndr_userid                (vndr_userid          [i]);
                model.setVndr_scac                  (vndr_scac            [i]);
                model.setVndr_ceo_kor               (vndr_ceo_kor         [i]);
                model.setVndr_addr_kor2             (vndr_addr_kor2       [i]);
                model.setAp_pymt_mth                (ap_pymt_mth          [i]);
                model.setAp_cnt_cd                  (ap_cnt_cd            [i]);
                model.setAp_vndr_seq                (ap_vndr_seq          [i]);
                model.setNis_event_dt               (nis_event_dt         [i]);
                model.setEmail_addr                 (email_addr           [i]);
                model.setVndr_div                   (vndr_div             [i]);
                model.setHanfis_vndr_cd             (hanfis_vndr_cd       [i]);
                model.setWo_attch_file              (wo_attch_file        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        VENDOR model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, prefix + "cnt_cd                   ".trim(), length));
            String[] vndr_seq          =  (JSPUtil.getParameter(request, prefix + "vndr_seq                 ".trim(), length));
            String[] vndr_loc          =  (JSPUtil.getParameter(request, prefix + "vndr_loc                 ".trim(), length));
            String[] ofc_cd            =  (JSPUtil.getParameter(request, prefix + "ofc_cd                   ".trim(), length));
            String[] vndr_ceo          =  (JSPUtil.getParameter(request, prefix + "vndr_ceo                 ".trim(), length));
            String[] vndr_owner        =  (JSPUtil.getParameter(request, prefix + "vndr_owner               ".trim(), length));
            String[] vndr_regist_no    =  (JSPUtil.getParameter(request, prefix + "vndr_regist_no           ".trim(), length));
            String[] vndr_nm_ab        =  (JSPUtil.getParameter(request, prefix + "vndr_nm_ab               ".trim(), length));
            String[] vndr_nm_eng       =  (JSPUtil.getParameter(request, prefix + "vndr_nm_eng              ".trim(), length));
            String[] vndr_nm_kor       =  (JSPUtil.getParameter(request, prefix + "vndr_nm_kor              ".trim(), length));
            String[] vndr_pts_cnt      =  (JSPUtil.getParameter(request, prefix + "vndr_pts_cnt             ".trim(), length));
            String[] vndr_pts_seq      =  (JSPUtil.getParameter(request, prefix + "vndr_pts_seq             ".trim(), length));
            String[] vndr_addr_eng     =  (JSPUtil.getParameter(request, prefix + "vndr_addr_eng            ".trim(), length));
            String[] vndr_addr_kor     =  (JSPUtil.getParameter(request, prefix + "vndr_addr_kor            ".trim(), length));
            String[] vndr_zip          =  (JSPUtil.getParameter(request, prefix + "vndr_zip                 ".trim(), length));
            String[] vndr_tel          =  (JSPUtil.getParameter(request, prefix + "vndr_tel                 ".trim(), length));
            String[] vndr_fax          =  (JSPUtil.getParameter(request, prefix + "vndr_fax                 ".trim(), length));
            String[] vndr_pic          =  (JSPUtil.getParameter(request, prefix + "vndr_pic                 ".trim(), length));
            String[] vndr_facility     =  (JSPUtil.getParameter(request, prefix + "vndr_facility            ".trim(), length));
            String[] vndr_svc_scope    =  (JSPUtil.getParameter(request, prefix + "vndr_svc_scope           ".trim(), length));
            String[] vndr_svc_frq      =  (JSPUtil.getParameter(request, prefix + "vndr_svc_frq             ".trim(), length));
            String[] vndr_svc_frq_text =  (JSPUtil.getParameter(request, prefix + "vndr_svc_frq_text        ".trim(), length));
            String[] vndr_rmk          =  (JSPUtil.getParameter(request, prefix + "vndr_rmk                 ".trim(), length));
            String[] vndr_wo_iss_tp    =  (JSPUtil.getParameter(request, prefix + "vndr_wo_iss_tp           ".trim(), length));
            String[] vndr_agt          =  (JSPUtil.getParameter(request, prefix + "vndr_agt                 ".trim(), length));
            String[] vndr_fp_div       =  (JSPUtil.getParameter(request, prefix + "vndr_fp_div              ".trim(), length));
            String[] vndr_pay_sty      =  (JSPUtil.getParameter(request, prefix + "vndr_pay_sty             ".trim(), length));
            String[] vndr_co_tp        =  (JSPUtil.getParameter(request, prefix + "vndr_co_tp               ".trim(), length));
            String[] vndr_b_cat        =  (JSPUtil.getParameter(request, prefix + "vndr_b_cat               ".trim(), length));
            String[] vndr_b_tp         =  (JSPUtil.getParameter(request, prefix + "vndr_b_tp                ".trim(), length));
            String[] vndr_bnk_nm       =  (JSPUtil.getParameter(request, prefix + "vndr_bnk_nm              ".trim(), length));
            String[] vndr_bnk_brn_nm   =  (JSPUtil.getParameter(request, prefix + "vndr_bnk_brn_nm          ".trim(), length));
            String[] vndr_bnk_addr     =  (JSPUtil.getParameter(request, prefix + "vndr_bnk_addr            ".trim(), length));
            String[] vndr_bf_ac        =  (JSPUtil.getParameter(request, prefix + "vndr_bf_ac               ".trim(), length));
            String[] vndr_dpstr        =  (JSPUtil.getParameter(request, prefix + "vndr_dpstr               ".trim(), length));
            String[] vndr_fst_ctrt_dt  =  (JSPUtil.getParameter(request, prefix + "vndr_fst_ctrt_dt         ".trim(), length));
            String[] vndr_gen_pay_term =  (JSPUtil.getParameter(request, prefix + "vndr_gen_pay_term        ".trim(), length));
            String[] vndr_del_mk       =  (JSPUtil.getParameter(request, prefix + "vndr_del_mk              ".trim(), length));
            String[] vndr_rgst_dt      =  (JSPUtil.getParameter(request, prefix + "vndr_rgst_dt             ".trim(), length));
            String[] vndr_updt_dt      =  (JSPUtil.getParameter(request, prefix + "vndr_updt_dt             ".trim(), length));
            String[] vndr_userid       =  (JSPUtil.getParameter(request, prefix + "vndr_userid              ".trim(), length));
            String[] vndr_scac         =  (JSPUtil.getParameter(request, prefix + "vndr_scac                ".trim(), length));
            String[] vndr_ceo_kor      =  (JSPUtil.getParameter(request, prefix + "vndr_ceo_kor             ".trim(), length));
            String[] vndr_addr_kor2    =  (JSPUtil.getParameter(request, prefix + "vndr_addr_kor2           ".trim(), length));
            String[] ap_pymt_mth       =  (JSPUtil.getParameter(request, prefix + "ap_pymt_mth              ".trim(), length));
            String[] ap_cnt_cd         =  (JSPUtil.getParameter(request, prefix + "ap_cnt_cd                ".trim(), length));
            String[] ap_vndr_seq       =  (JSPUtil.getParameter(request, prefix + "ap_vndr_seq              ".trim(), length));
            String[] nis_event_dt      =  (JSPUtil.getParameter(request, prefix + "nis_event_dt             ".trim(), length));
            String[] email_addr        =  (JSPUtil.getParameter(request, prefix + "email_addr               ".trim(), length));
            String[] vndr_div          =  (JSPUtil.getParameter(request, prefix + "vndr_div                 ".trim(), length));
            String[] hanfis_vndr_cd    =  (JSPUtil.getParameter(request, prefix + "hanfis_vndr_cd           ".trim(), length));
            String[] wo_attch_file     =  (JSPUtil.getParameter(request, prefix + "wo_attch_file            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new VENDOR();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setCnt_cd                     ( cnt_cd               [i]);
                model.setVndr_seq                   ( vndr_seq             [i]);
                model.setVndr_loc                   ( vndr_loc             [i]);
                model.setOfc_cd                     ( ofc_cd               [i]);
                model.setVndr_ceo                   ( vndr_ceo             [i]);
                model.setVndr_owner                 ( vndr_owner           [i]);
                model.setVndr_regist_no             ( vndr_regist_no       [i]);
                model.setVndr_nm_ab                 ( vndr_nm_ab           [i]);
                model.setVndr_nm_eng                ( vndr_nm_eng          [i]);
                model.setVndr_nm_kor                ( vndr_nm_kor          [i]);
                model.setVndr_pts_cnt               ( vndr_pts_cnt         [i]);
                model.setVndr_pts_seq               ( vndr_pts_seq         [i]);
                model.setVndr_addr_eng              ( vndr_addr_eng        [i]);
                model.setVndr_addr_kor              ( vndr_addr_kor        [i]);
                model.setVndr_zip                   ( vndr_zip             [i]);
                model.setVndr_tel                   ( vndr_tel             [i]);
                model.setVndr_fax                   ( vndr_fax             [i]);
                model.setVndr_pic                   ( vndr_pic             [i]);
                model.setVndr_facility              ( vndr_facility        [i]);
                model.setVndr_svc_scope             ( vndr_svc_scope       [i]);
                model.setVndr_svc_frq               ( vndr_svc_frq         [i]);
                model.setVndr_svc_frq_text          ( vndr_svc_frq_text    [i]);
                model.setVndr_rmk                   ( vndr_rmk             [i]);
                model.setVndr_wo_iss_tp             ( vndr_wo_iss_tp       [i]);
                model.setVndr_agt                   ( vndr_agt             [i]);
                model.setVndr_fp_div                ( vndr_fp_div          [i]);
                model.setVndr_pay_sty               ( vndr_pay_sty         [i]);
                model.setVndr_co_tp                 ( vndr_co_tp           [i]);
                model.setVndr_b_cat                 ( vndr_b_cat           [i]);
                model.setVndr_b_tp                  ( vndr_b_tp            [i]);
                model.setVndr_bnk_nm                ( vndr_bnk_nm          [i]);
                model.setVndr_bnk_brn_nm            ( vndr_bnk_brn_nm      [i]);
                model.setVndr_bnk_addr              ( vndr_bnk_addr        [i]);
                model.setVndr_bf_ac                 ( vndr_bf_ac           [i]);
                model.setVndr_dpstr                 ( vndr_dpstr           [i]);
                model.setVndr_fst_ctrt_dt           ( vndr_fst_ctrt_dt     [i]);
                model.setVndr_gen_pay_term          ( vndr_gen_pay_term    [i]);
                model.setVndr_del_mk                ( vndr_del_mk          [i]);
                model.setVndr_rgst_dt               ( vndr_rgst_dt         [i]);
                model.setVndr_updt_dt               ( vndr_updt_dt         [i]);
                model.setVndr_userid                ( vndr_userid          [i]);
                model.setVndr_scac                  ( vndr_scac            [i]);
                model.setVndr_ceo_kor               ( vndr_ceo_kor         [i]);
                model.setVndr_addr_kor2             ( vndr_addr_kor2       [i]);
                model.setAp_pymt_mth                ( ap_pymt_mth          [i]);
                model.setAp_cnt_cd                  ( ap_cnt_cd            [i]);
                model.setAp_vndr_seq                ( ap_vndr_seq          [i]);
                model.setNis_event_dt               ( nis_event_dt         [i]);
                model.setEmail_addr                 ( email_addr           [i]);
                model.setVndr_div                   ( vndr_div             [i]);
                model.setHanfis_vndr_cd             ( hanfis_vndr_cd       [i]);
                model.setWo_attch_file              ( wo_attch_file        [i]);
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
