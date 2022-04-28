/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CUSTOMER.java
*@FileTitle : Customer
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-09 sangyool pak
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
 */public final class CUSTOMER implements java.io.Serializable {

    private String         ibflag         = "";
    private String         page_rows      = "";
    private String         cnt_cd         = "";
    private String         cust_cd        = "";
    private String         ofc_cd         = "";
    private String         loc_cd         = "";
    private String         cust_nm        = "";
    private String         cust_addr      = "";
    private String         cust_zip       = "";
    private String         cust_cpt_amt   = "";
    private String         cust_curr_cd1  = "";
    private String         cust_psn       = "";
    private String         cust_nwk       = "";
    private String         cust_fdg_dt    = "";
    private String         cust_tel       = "";
    private String         cust_fax       = "";
    private String         cust_ip_addr   = "";
    private String         cust_reg_no    = "";
    private String         cust_pts_cd    = "";
    private String         cust_pts_cnt   = "";
    private String         cust_cls       = "";
    private String         cust_rmk       = "";
    private String         cust_fnc_stt   = "";
    private String         cust_lst       = "";
    private String         cust_biz_pfm   = "";
    private String         cust_curr_cd2  = "";
    private String         cust_inv_style = "";
    private String         cust_inv_bal   = "";
    private String         cust_1st_dt    = "";
    private String         cust_1st_srep  = "";
    private String         bkg_no         = "";
    private String         bkg_no_split   = "";
    private String         cust_scac      = "";
    private String         cust_hancos    = "";
    private String         cust_kars      = "";
    private String         cust_eb        = "";
    private String         cust_wb        = "";
    private String         cust_del       = "";
    private String         cust_reg_tp    = "";
    private String         cust_crdt      = "";
    private String         cust_updt      = "";
    private String         nis_event_dt   = "";
    private String         bkg_fax        = "";
    private String         gacct_ind      = "";
    private String         cust_usr_id    = "";
    private String         bkg_alert_chk  = "";
    private String         alert_remark   = "";
    private String         alert_team     = "";
    private String         alert_updt     = "";
    private String         alert_userid   = "";
    private String         m_cust_cnt_cd  = "";
    private String         m_cust_seq     = "";

    public CUSTOMER(){}

    public CUSTOMER(
            String         ibflag        ,
            String         page_rows     ,
            String         cnt_cd        ,
            String         cust_cd       ,
            String         ofc_cd        ,
            String         loc_cd        ,
            String         cust_nm       ,
            String         cust_addr     ,
            String         cust_zip      ,
            String         cust_cpt_amt  ,
            String         cust_curr_cd1 ,
            String         cust_psn      ,
            String         cust_nwk      ,
            String         cust_fdg_dt   ,
            String         cust_tel      ,
            String         cust_fax      ,
            String         cust_ip_addr  ,
            String         cust_reg_no   ,
            String         cust_pts_cd   ,
            String         cust_pts_cnt  ,
            String         cust_cls      ,
            String         cust_rmk      ,
            String         cust_fnc_stt  ,
            String         cust_lst      ,
            String         cust_biz_pfm  ,
            String         cust_curr_cd2 ,
            String         cust_inv_style,
            String         cust_inv_bal  ,
            String         cust_1st_dt   ,
            String         cust_1st_srep ,
            String         bkg_no        ,
            String         bkg_no_split  ,
            String         cust_scac     ,
            String         cust_hancos   ,
            String         cust_kars     ,
            String         cust_eb       ,
            String         cust_wb       ,
            String         cust_del      ,
            String         cust_reg_tp   ,
            String         cust_crdt     ,
            String         cust_updt     ,
            String         nis_event_dt  ,
            String         bkg_fax       ,
            String         gacct_ind     ,
            String         cust_usr_id   ,
            String         bkg_alert_chk ,
            String         alert_remark  ,
            String         alert_team    ,
            String         alert_updt    ,
            String         alert_userid  ,
            String         m_cust_cnt_cd ,
            String         m_cust_seq    ){
        this.ibflag         = ibflag        ;
        this.page_rows      = page_rows     ;
        this.cnt_cd         = cnt_cd        ;
        this.cust_cd        = cust_cd       ;
        this.ofc_cd         = ofc_cd        ;
        this.loc_cd         = loc_cd        ;
        this.cust_nm        = cust_nm       ;
        this.cust_addr      = cust_addr     ;
        this.cust_zip       = cust_zip      ;
        this.cust_cpt_amt   = cust_cpt_amt  ;
        this.cust_curr_cd1  = cust_curr_cd1 ;
        this.cust_psn       = cust_psn      ;
        this.cust_nwk       = cust_nwk      ;
        this.cust_fdg_dt    = cust_fdg_dt   ;
        this.cust_tel       = cust_tel      ;
        this.cust_fax       = cust_fax      ;
        this.cust_ip_addr   = cust_ip_addr  ;
        this.cust_reg_no    = cust_reg_no   ;
        this.cust_pts_cd    = cust_pts_cd   ;
        this.cust_pts_cnt   = cust_pts_cnt  ;
        this.cust_cls       = cust_cls      ;
        this.cust_rmk       = cust_rmk      ;
        this.cust_fnc_stt   = cust_fnc_stt  ;
        this.cust_lst       = cust_lst      ;
        this.cust_biz_pfm   = cust_biz_pfm  ;
        this.cust_curr_cd2  = cust_curr_cd2 ;
        this.cust_inv_style = cust_inv_style;
        this.cust_inv_bal   = cust_inv_bal  ;
        this.cust_1st_dt    = cust_1st_dt   ;
        this.cust_1st_srep  = cust_1st_srep ;
        this.bkg_no         = bkg_no        ;
        this.bkg_no_split   = bkg_no_split  ;
        this.cust_scac      = cust_scac     ;
        this.cust_hancos    = cust_hancos   ;
        this.cust_kars      = cust_kars     ;
        this.cust_eb        = cust_eb       ;
        this.cust_wb        = cust_wb       ;
        this.cust_del       = cust_del      ;
        this.cust_reg_tp    = cust_reg_tp   ;
        this.cust_crdt      = cust_crdt     ;
        this.cust_updt      = cust_updt     ;
        this.nis_event_dt   = nis_event_dt  ;
        this.bkg_fax        = bkg_fax       ;
        this.gacct_ind      = gacct_ind     ;
        this.cust_usr_id    = cust_usr_id   ;
        this.bkg_alert_chk  = bkg_alert_chk ;
        this.alert_remark   = alert_remark  ;
        this.alert_team     = alert_team    ;
        this.alert_updt     = alert_updt    ;
        this.alert_userid   = alert_userid  ;
        this.m_cust_cnt_cd  = m_cust_cnt_cd ;
        this.m_cust_seq     = m_cust_seq    ;
    }

    // getter method is proceeding ..
    public String         getIbflag        (){    return ibflag            ;    }
    public String         getPage_rows     (){    return page_rows         ;    }
    public String         getCnt_cd        (){    return cnt_cd            ;    }
    public String         getCust_cd       (){    return cust_cd           ;    }
    public String         getOfc_cd        (){    return ofc_cd            ;    }
    public String         getLoc_cd        (){    return loc_cd            ;    }
    public String         getCust_nm       (){    return cust_nm           ;    }
    public String         getCust_addr     (){    return cust_addr         ;    }
    public String         getCust_zip      (){    return cust_zip          ;    }
    public String         getCust_cpt_amt  (){    return cust_cpt_amt      ;    }
    public String         getCust_curr_cd1 (){    return cust_curr_cd1     ;    }
    public String         getCust_psn      (){    return cust_psn          ;    }
    public String         getCust_nwk      (){    return cust_nwk          ;    }
    public String         getCust_fdg_dt   (){    return cust_fdg_dt       ;    }
    public String         getCust_tel      (){    return cust_tel          ;    }
    public String         getCust_fax      (){    return cust_fax          ;    }
    public String         getCust_ip_addr  (){    return cust_ip_addr      ;    }
    public String         getCust_reg_no   (){    return cust_reg_no       ;    }
    public String         getCust_pts_cd   (){    return cust_pts_cd       ;    }
    public String         getCust_pts_cnt  (){    return cust_pts_cnt      ;    }
    public String         getCust_cls      (){    return cust_cls          ;    }
    public String         getCust_rmk      (){    return cust_rmk          ;    }
    public String         getCust_fnc_stt  (){    return cust_fnc_stt      ;    }
    public String         getCust_lst      (){    return cust_lst          ;    }
    public String         getCust_biz_pfm  (){    return cust_biz_pfm      ;    }
    public String         getCust_curr_cd2 (){    return cust_curr_cd2     ;    }
    public String         getCust_inv_style(){    return cust_inv_style    ;    }
    public String         getCust_inv_bal  (){    return cust_inv_bal      ;    }
    public String         getCust_1st_dt   (){    return cust_1st_dt       ;    }
    public String         getCust_1st_srep (){    return cust_1st_srep     ;    }
    public String         getBkg_no        (){    return bkg_no            ;    }
    public String         getBkg_no_split  (){    return bkg_no_split      ;    }
    public String         getCust_scac     (){    return cust_scac         ;    }
    public String         getCust_hancos   (){    return cust_hancos       ;    }
    public String         getCust_kars     (){    return cust_kars         ;    }
    public String         getCust_eb       (){    return cust_eb           ;    }
    public String         getCust_wb       (){    return cust_wb           ;    }
    public String         getCust_del      (){    return cust_del          ;    }
    public String         getCust_reg_tp   (){    return cust_reg_tp       ;    }
    public String         getCust_crdt     (){    return cust_crdt         ;    }
    public String         getCust_updt     (){    return cust_updt         ;    }
    public String         getNis_event_dt  (){    return nis_event_dt      ;    }
    public String         getBkg_fax       (){    return bkg_fax           ;    }
    public String         getGacct_ind     (){    return gacct_ind         ;    }
    public String         getCust_usr_id   (){    return cust_usr_id       ;    }
    public String         getBkg_alert_chk (){    return bkg_alert_chk     ;    }
    public String         getAlert_remark  (){    return alert_remark      ;    }
    public String         getAlert_team    (){    return alert_team        ;    }
    public String         getAlert_updt    (){    return alert_updt        ;    }
    public String         getAlert_userid  (){    return alert_userid      ;    }
    public String         getM_cust_cnt_cd (){    return m_cust_cnt_cd     ;    }
    public String         getM_cust_seq    (){    return m_cust_seq        ;    }

    // setter method is proceeding ..
    public void setIbflag        ( String         ibflag         ){    this.ibflag         = ibflag            ;    }
    public void setPage_rows     ( String         page_rows      ){    this.page_rows      = page_rows         ;    }
    public void setCnt_cd        ( String         cnt_cd         ){    this.cnt_cd         = cnt_cd            ;    }
    public void setCust_cd       ( String         cust_cd        ){    this.cust_cd        = cust_cd           ;    }
    public void setOfc_cd        ( String         ofc_cd         ){    this.ofc_cd         = ofc_cd            ;    }
    public void setLoc_cd        ( String         loc_cd         ){    this.loc_cd         = loc_cd            ;    }
    public void setCust_nm       ( String         cust_nm        ){    this.cust_nm        = cust_nm           ;    }
    public void setCust_addr     ( String         cust_addr      ){    this.cust_addr      = cust_addr         ;    }
    public void setCust_zip      ( String         cust_zip       ){    this.cust_zip       = cust_zip          ;    }
    public void setCust_cpt_amt  ( String         cust_cpt_amt   ){    this.cust_cpt_amt   = cust_cpt_amt      ;    }
    public void setCust_curr_cd1 ( String         cust_curr_cd1  ){    this.cust_curr_cd1  = cust_curr_cd1     ;    }
    public void setCust_psn      ( String         cust_psn       ){    this.cust_psn       = cust_psn          ;    }
    public void setCust_nwk      ( String         cust_nwk       ){    this.cust_nwk       = cust_nwk          ;    }
    public void setCust_fdg_dt   ( String         cust_fdg_dt    ){    this.cust_fdg_dt    = cust_fdg_dt       ;    }
    public void setCust_tel      ( String         cust_tel       ){    this.cust_tel       = cust_tel          ;    }
    public void setCust_fax      ( String         cust_fax       ){    this.cust_fax       = cust_fax          ;    }
    public void setCust_ip_addr  ( String         cust_ip_addr   ){    this.cust_ip_addr   = cust_ip_addr      ;    }
    public void setCust_reg_no   ( String         cust_reg_no    ){    this.cust_reg_no    = cust_reg_no       ;    }
    public void setCust_pts_cd   ( String         cust_pts_cd    ){    this.cust_pts_cd    = cust_pts_cd       ;    }
    public void setCust_pts_cnt  ( String         cust_pts_cnt   ){    this.cust_pts_cnt   = cust_pts_cnt      ;    }
    public void setCust_cls      ( String         cust_cls       ){    this.cust_cls       = cust_cls          ;    }
    public void setCust_rmk      ( String         cust_rmk       ){    this.cust_rmk       = cust_rmk          ;    }
    public void setCust_fnc_stt  ( String         cust_fnc_stt   ){    this.cust_fnc_stt   = cust_fnc_stt      ;    }
    public void setCust_lst      ( String         cust_lst       ){    this.cust_lst       = cust_lst          ;    }
    public void setCust_biz_pfm  ( String         cust_biz_pfm   ){    this.cust_biz_pfm   = cust_biz_pfm      ;    }
    public void setCust_curr_cd2 ( String         cust_curr_cd2  ){    this.cust_curr_cd2  = cust_curr_cd2     ;    }
    public void setCust_inv_style( String         cust_inv_style ){    this.cust_inv_style = cust_inv_style    ;    }
    public void setCust_inv_bal  ( String         cust_inv_bal   ){    this.cust_inv_bal   = cust_inv_bal      ;    }
    public void setCust_1st_dt   ( String         cust_1st_dt    ){    this.cust_1st_dt    = cust_1st_dt       ;    }
    public void setCust_1st_srep ( String         cust_1st_srep  ){    this.cust_1st_srep  = cust_1st_srep     ;    }
    public void setBkg_no        ( String         bkg_no         ){    this.bkg_no         = bkg_no            ;    }
    public void setBkg_no_split  ( String         bkg_no_split   ){    this.bkg_no_split   = bkg_no_split      ;    }
    public void setCust_scac     ( String         cust_scac      ){    this.cust_scac      = cust_scac         ;    }
    public void setCust_hancos   ( String         cust_hancos    ){    this.cust_hancos    = cust_hancos       ;    }
    public void setCust_kars     ( String         cust_kars      ){    this.cust_kars      = cust_kars         ;    }
    public void setCust_eb       ( String         cust_eb        ){    this.cust_eb        = cust_eb           ;    }
    public void setCust_wb       ( String         cust_wb        ){    this.cust_wb        = cust_wb           ;    }
    public void setCust_del      ( String         cust_del       ){    this.cust_del       = cust_del          ;    }
    public void setCust_reg_tp   ( String         cust_reg_tp    ){    this.cust_reg_tp    = cust_reg_tp       ;    }
    public void setCust_crdt     ( String         cust_crdt      ){    this.cust_crdt      = cust_crdt         ;    }
    public void setCust_updt     ( String         cust_updt      ){    this.cust_updt      = cust_updt         ;    }
    public void setNis_event_dt  ( String         nis_event_dt   ){    this.nis_event_dt   = nis_event_dt      ;    }
    public void setBkg_fax       ( String         bkg_fax        ){    this.bkg_fax        = bkg_fax           ;    }
    public void setGacct_ind     ( String         gacct_ind      ){    this.gacct_ind      = gacct_ind         ;    }
    public void setCust_usr_id   ( String         cust_usr_id    ){    this.cust_usr_id    = cust_usr_id       ;    }
    public void setBkg_alert_chk ( String         bkg_alert_chk  ){    this.bkg_alert_chk  = bkg_alert_chk     ;    }
    public void setAlert_remark  ( String         alert_remark   ){    this.alert_remark   = alert_remark      ;    }
    public void setAlert_team    ( String         alert_team     ){    this.alert_team     = alert_team        ;    }
    public void setAlert_updt    ( String         alert_updt     ){    this.alert_updt     = alert_updt        ;    }
    public void setAlert_userid  ( String         alert_userid   ){    this.alert_userid   = alert_userid      ;    }
    public void setM_cust_cnt_cd ( String         m_cust_cnt_cd  ){    this.m_cust_cnt_cd  = m_cust_cnt_cd     ;    }
    public void setM_cust_seq    ( String         m_cust_seq     ){    this.m_cust_seq     = m_cust_seq        ;    }

    public static CUSTOMER fromRequest(HttpServletRequest request) {
        CUSTOMER model = new CUSTOMER();
        try {
            model.setIbflag            (JSPUtil.getParameter(request, "ibflag                ".trim(), ""));
            model.setPage_rows         (JSPUtil.getParameter(request, "page_rows             ".trim(), ""));
            model.setCnt_cd            (JSPUtil.getParameter(request, "cnt_cd                ".trim(), ""));
            model.setCust_cd           (JSPUtil.getParameter(request, "cust_cd               ".trim(), ""));
            model.setOfc_cd            (JSPUtil.getParameter(request, "ofc_cd                ".trim(), ""));
            model.setLoc_cd            (JSPUtil.getParameter(request, "loc_cd                ".trim(), ""));
            model.setCust_nm           (JSPUtil.getParameter(request, "cust_nm               ".trim(), ""));
            model.setCust_addr         (JSPUtil.getParameter(request, "cust_addr             ".trim(), ""));
            model.setCust_zip          (JSPUtil.getParameter(request, "cust_zip              ".trim(), ""));
            model.setCust_cpt_amt      (JSPUtil.getParameter(request, "cust_cpt_amt          ".trim(), ""));
            model.setCust_curr_cd1     (JSPUtil.getParameter(request, "cust_curr_cd1         ".trim(), ""));
            model.setCust_psn          (JSPUtil.getParameter(request, "cust_psn              ".trim(), ""));
            model.setCust_nwk          (JSPUtil.getParameter(request, "cust_nwk              ".trim(), ""));
            model.setCust_fdg_dt       (JSPUtil.getParameter(request, "cust_fdg_dt           ".trim(), ""));
            model.setCust_tel          (JSPUtil.getParameter(request, "cust_tel              ".trim(), ""));
            model.setCust_fax          (JSPUtil.getParameter(request, "cust_fax              ".trim(), ""));
            model.setCust_ip_addr      (JSPUtil.getParameter(request, "cust_ip_addr          ".trim(), ""));
            model.setCust_reg_no       (JSPUtil.getParameter(request, "cust_reg_no           ".trim(), ""));
            model.setCust_pts_cd       (JSPUtil.getParameter(request, "cust_pts_cd           ".trim(), ""));
            model.setCust_pts_cnt      (JSPUtil.getParameter(request, "cust_pts_cnt          ".trim(), ""));
            model.setCust_cls          (JSPUtil.getParameter(request, "cust_cls              ".trim(), ""));
            model.setCust_rmk          (JSPUtil.getParameter(request, "cust_rmk              ".trim(), ""));
            model.setCust_fnc_stt      (JSPUtil.getParameter(request, "cust_fnc_stt          ".trim(), ""));
            model.setCust_lst          (JSPUtil.getParameter(request, "cust_lst              ".trim(), ""));
            model.setCust_biz_pfm      (JSPUtil.getParameter(request, "cust_biz_pfm          ".trim(), ""));
            model.setCust_curr_cd2     (JSPUtil.getParameter(request, "cust_curr_cd2         ".trim(), ""));
            model.setCust_inv_style    (JSPUtil.getParameter(request, "cust_inv_style        ".trim(), ""));
            model.setCust_inv_bal      (JSPUtil.getParameter(request, "cust_inv_bal          ".trim(), ""));
            model.setCust_1st_dt       (JSPUtil.getParameter(request, "cust_1st_dt           ".trim(), ""));
            model.setCust_1st_srep     (JSPUtil.getParameter(request, "cust_1st_srep         ".trim(), ""));
            model.setBkg_no            (JSPUtil.getParameter(request, "bkg_no                ".trim(), ""));
            model.setBkg_no_split      (JSPUtil.getParameter(request, "bkg_no_split          ".trim(), ""));
            model.setCust_scac         (JSPUtil.getParameter(request, "cust_scac             ".trim(), ""));
            model.setCust_hancos       (JSPUtil.getParameter(request, "cust_hancos           ".trim(), ""));
            model.setCust_kars         (JSPUtil.getParameter(request, "cust_kars             ".trim(), ""));
            model.setCust_eb           (JSPUtil.getParameter(request, "cust_eb               ".trim(), ""));
            model.setCust_wb           (JSPUtil.getParameter(request, "cust_wb               ".trim(), ""));
            model.setCust_del          (JSPUtil.getParameter(request, "cust_del              ".trim(), ""));
            model.setCust_reg_tp       (JSPUtil.getParameter(request, "cust_reg_tp           ".trim(), ""));
            model.setCust_crdt         (JSPUtil.getParameter(request, "cust_crdt             ".trim(), ""));
            model.setCust_updt         (JSPUtil.getParameter(request, "cust_updt             ".trim(), ""));
            model.setNis_event_dt      (JSPUtil.getParameter(request, "nis_event_dt          ".trim(), ""));
            model.setBkg_fax           (JSPUtil.getParameter(request, "bkg_fax               ".trim(), ""));
            model.setGacct_ind         (JSPUtil.getParameter(request, "gacct_ind             ".trim(), ""));
            model.setCust_usr_id       (JSPUtil.getParameter(request, "cust_usr_id           ".trim(), ""));
            model.setBkg_alert_chk     (JSPUtil.getParameter(request, "bkg_alert_chk         ".trim(), ""));
            model.setAlert_remark      (JSPUtil.getParameter(request, "alert_remark          ".trim(), ""));
            model.setAlert_team        (JSPUtil.getParameter(request, "alert_team            ".trim(), ""));
            model.setAlert_updt        (JSPUtil.getParameter(request, "alert_updt            ".trim(), ""));
            model.setAlert_userid      (JSPUtil.getParameter(request, "alert_userid          ".trim(), ""));
            model.setM_cust_cnt_cd     (JSPUtil.getParameter(request, "m_cust_cnt_cd         ".trim(), ""));
            model.setM_cust_seq        (JSPUtil.getParameter(request, "m_cust_seq            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        CUSTOMER model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag                ".trim(), length));
            String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows             ".trim(), length));
            String[] cnt_cd         =  (JSPUtil.getParameter(request, "cnt_cd                ".trim(), length));
            String[] cust_cd        =  (JSPUtil.getParameter(request, "cust_cd               ".trim(), length));
            String[] ofc_cd         =  (JSPUtil.getParameter(request, "ofc_cd                ".trim(), length));
            String[] loc_cd         =  (JSPUtil.getParameter(request, "loc_cd                ".trim(), length));
            String[] cust_nm        =  (JSPUtil.getParameter(request, "cust_nm               ".trim(), length));
            String[] cust_addr      =  (JSPUtil.getParameter(request, "cust_addr             ".trim(), length));
            String[] cust_zip       =  (JSPUtil.getParameter(request, "cust_zip              ".trim(), length));
            String[] cust_cpt_amt   =  (JSPUtil.getParameter(request, "cust_cpt_amt          ".trim(), length));
            String[] cust_curr_cd1  =  (JSPUtil.getParameter(request, "cust_curr_cd1         ".trim(), length));
            String[] cust_psn       =  (JSPUtil.getParameter(request, "cust_psn              ".trim(), length));
            String[] cust_nwk       =  (JSPUtil.getParameter(request, "cust_nwk              ".trim(), length));
            String[] cust_fdg_dt    =  (JSPUtil.getParameter(request, "cust_fdg_dt           ".trim(), length));
            String[] cust_tel       =  (JSPUtil.getParameter(request, "cust_tel              ".trim(), length));
            String[] cust_fax       =  (JSPUtil.getParameter(request, "cust_fax              ".trim(), length));
            String[] cust_ip_addr   =  (JSPUtil.getParameter(request, "cust_ip_addr          ".trim(), length));
            String[] cust_reg_no    =  (JSPUtil.getParameter(request, "cust_reg_no           ".trim(), length));
            String[] cust_pts_cd    =  (JSPUtil.getParameter(request, "cust_pts_cd           ".trim(), length));
            String[] cust_pts_cnt   =  (JSPUtil.getParameter(request, "cust_pts_cnt          ".trim(), length));
            String[] cust_cls       =  (JSPUtil.getParameter(request, "cust_cls              ".trim(), length));
            String[] cust_rmk       =  (JSPUtil.getParameter(request, "cust_rmk              ".trim(), length));
            String[] cust_fnc_stt   =  (JSPUtil.getParameter(request, "cust_fnc_stt          ".trim(), length));
            String[] cust_lst       =  (JSPUtil.getParameter(request, "cust_lst              ".trim(), length));
            String[] cust_biz_pfm   =  (JSPUtil.getParameter(request, "cust_biz_pfm          ".trim(), length));
            String[] cust_curr_cd2  =  (JSPUtil.getParameter(request, "cust_curr_cd2         ".trim(), length));
            String[] cust_inv_style =  (JSPUtil.getParameter(request, "cust_inv_style        ".trim(), length));
            String[] cust_inv_bal   =  (JSPUtil.getParameter(request, "cust_inv_bal          ".trim(), length));
            String[] cust_1st_dt    =  (JSPUtil.getParameter(request, "cust_1st_dt           ".trim(), length));
            String[] cust_1st_srep  =  (JSPUtil.getParameter(request, "cust_1st_srep         ".trim(), length));
            String[] bkg_no         =  (JSPUtil.getParameter(request, "bkg_no                ".trim(), length));
            String[] bkg_no_split   =  (JSPUtil.getParameter(request, "bkg_no_split          ".trim(), length));
            String[] cust_scac      =  (JSPUtil.getParameter(request, "cust_scac             ".trim(), length));
            String[] cust_hancos    =  (JSPUtil.getParameter(request, "cust_hancos           ".trim(), length));
            String[] cust_kars      =  (JSPUtil.getParameter(request, "cust_kars             ".trim(), length));
            String[] cust_eb        =  (JSPUtil.getParameter(request, "cust_eb               ".trim(), length));
            String[] cust_wb        =  (JSPUtil.getParameter(request, "cust_wb               ".trim(), length));
            String[] cust_del       =  (JSPUtil.getParameter(request, "cust_del              ".trim(), length));
            String[] cust_reg_tp    =  (JSPUtil.getParameter(request, "cust_reg_tp           ".trim(), length));
            String[] cust_crdt      =  (JSPUtil.getParameter(request, "cust_crdt             ".trim(), length));
            String[] cust_updt      =  (JSPUtil.getParameter(request, "cust_updt             ".trim(), length));
            String[] nis_event_dt   =  (JSPUtil.getParameter(request, "nis_event_dt          ".trim(), length));
            String[] bkg_fax        =  (JSPUtil.getParameter(request, "bkg_fax               ".trim(), length));
            String[] gacct_ind      =  (JSPUtil.getParameter(request, "gacct_ind             ".trim(), length));
            String[] cust_usr_id    =  (JSPUtil.getParameter(request, "cust_usr_id           ".trim(), length));
            String[] bkg_alert_chk  =  (JSPUtil.getParameter(request, "bkg_alert_chk         ".trim(), length));
            String[] alert_remark   =  (JSPUtil.getParameter(request, "alert_remark          ".trim(), length));
            String[] alert_team     =  (JSPUtil.getParameter(request, "alert_team            ".trim(), length));
            String[] alert_updt     =  (JSPUtil.getParameter(request, "alert_updt            ".trim(), length));
            String[] alert_userid   =  (JSPUtil.getParameter(request, "alert_userid          ".trim(), length));
            String[] m_cust_cnt_cd  =  (JSPUtil.getParameter(request, "m_cust_cnt_cd         ".trim(), length));
            String[] m_cust_seq     =  (JSPUtil.getParameter(request, "m_cust_seq            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CUSTOMER();
                model.setIbflag                  (ibflag            [i]);
                model.setPage_rows               (page_rows         [i]);
                model.setCnt_cd                  (cnt_cd            [i]);
                model.setCust_cd                 (cust_cd           [i]);
                model.setOfc_cd                  (ofc_cd            [i]);
                model.setLoc_cd                  (loc_cd            [i]);
                model.setCust_nm                 (cust_nm           [i]);
                model.setCust_addr               (cust_addr         [i]);
                model.setCust_zip                (cust_zip          [i]);
                model.setCust_cpt_amt            (cust_cpt_amt      [i]);
                model.setCust_curr_cd1           (cust_curr_cd1     [i]);
                model.setCust_psn                (cust_psn          [i]);
                model.setCust_nwk                (cust_nwk          [i]);
                model.setCust_fdg_dt             (cust_fdg_dt       [i]);
                model.setCust_tel                (cust_tel          [i]);
                model.setCust_fax                (cust_fax          [i]);
                model.setCust_ip_addr            (cust_ip_addr      [i]);
                model.setCust_reg_no             (cust_reg_no       [i]);
                model.setCust_pts_cd             (cust_pts_cd       [i]);
                model.setCust_pts_cnt            (cust_pts_cnt      [i]);
                model.setCust_cls                (cust_cls          [i]);
                model.setCust_rmk                (cust_rmk          [i]);
                model.setCust_fnc_stt            (cust_fnc_stt      [i]);
                model.setCust_lst                (cust_lst          [i]);
                model.setCust_biz_pfm            (cust_biz_pfm      [i]);
                model.setCust_curr_cd2           (cust_curr_cd2     [i]);
                model.setCust_inv_style          (cust_inv_style    [i]);
                model.setCust_inv_bal            (cust_inv_bal      [i]);
                model.setCust_1st_dt             (cust_1st_dt       [i]);
                model.setCust_1st_srep           (cust_1st_srep     [i]);
                model.setBkg_no                  (bkg_no            [i]);
                model.setBkg_no_split            (bkg_no_split      [i]);
                model.setCust_scac               (cust_scac         [i]);
                model.setCust_hancos             (cust_hancos       [i]);
                model.setCust_kars               (cust_kars         [i]);
                model.setCust_eb                 (cust_eb           [i]);
                model.setCust_wb                 (cust_wb           [i]);
                model.setCust_del                (cust_del          [i]);
                model.setCust_reg_tp             (cust_reg_tp       [i]);
                model.setCust_crdt               (cust_crdt         [i]);
                model.setCust_updt               (cust_updt         [i]);
                model.setNis_event_dt            (nis_event_dt      [i]);
                model.setBkg_fax                 (bkg_fax           [i]);
                model.setGacct_ind               (gacct_ind         [i]);
                model.setCust_usr_id             (cust_usr_id       [i]);
                model.setBkg_alert_chk           (bkg_alert_chk     [i]);
                model.setAlert_remark            (alert_remark      [i]);
                model.setAlert_team              (alert_team        [i]);
                model.setAlert_updt              (alert_updt        [i]);
                model.setAlert_userid            (alert_userid      [i]);
                model.setM_cust_cnt_cd           (m_cust_cnt_cd     [i]);
                model.setM_cust_seq              (m_cust_seq        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        CUSTOMER model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag                ".trim(), length));
            String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows             ".trim(), length));
            String[] cnt_cd         =  (JSPUtil.getParameter(request, prefix + "cnt_cd                ".trim(), length));
            String[] cust_cd        =  (JSPUtil.getParameter(request, prefix + "cust_cd               ".trim(), length));
            String[] ofc_cd         =  (JSPUtil.getParameter(request, prefix + "ofc_cd                ".trim(), length));
            String[] loc_cd         =  (JSPUtil.getParameter(request, prefix + "loc_cd                ".trim(), length));
            String[] cust_nm        =  (JSPUtil.getParameter(request, prefix + "cust_nm               ".trim(), length));
            String[] cust_addr      =  (JSPUtil.getParameter(request, prefix + "cust_addr             ".trim(), length));
            String[] cust_zip       =  (JSPUtil.getParameter(request, prefix + "cust_zip              ".trim(), length));
            String[] cust_cpt_amt   =  (JSPUtil.getParameter(request, prefix + "cust_cpt_amt          ".trim(), length));
            String[] cust_curr_cd1  =  (JSPUtil.getParameter(request, prefix + "cust_curr_cd1         ".trim(), length));
            String[] cust_psn       =  (JSPUtil.getParameter(request, prefix + "cust_psn              ".trim(), length));
            String[] cust_nwk       =  (JSPUtil.getParameter(request, prefix + "cust_nwk              ".trim(), length));
            String[] cust_fdg_dt    =  (JSPUtil.getParameter(request, prefix + "cust_fdg_dt           ".trim(), length));
            String[] cust_tel       =  (JSPUtil.getParameter(request, prefix + "cust_tel              ".trim(), length));
            String[] cust_fax       =  (JSPUtil.getParameter(request, prefix + "cust_fax              ".trim(), length));
            String[] cust_ip_addr   =  (JSPUtil.getParameter(request, prefix + "cust_ip_addr          ".trim(), length));
            String[] cust_reg_no    =  (JSPUtil.getParameter(request, prefix + "cust_reg_no           ".trim(), length));
            String[] cust_pts_cd    =  (JSPUtil.getParameter(request, prefix + "cust_pts_cd           ".trim(), length));
            String[] cust_pts_cnt   =  (JSPUtil.getParameter(request, prefix + "cust_pts_cnt          ".trim(), length));
            String[] cust_cls       =  (JSPUtil.getParameter(request, prefix + "cust_cls              ".trim(), length));
            String[] cust_rmk       =  (JSPUtil.getParameter(request, prefix + "cust_rmk              ".trim(), length));
            String[] cust_fnc_stt   =  (JSPUtil.getParameter(request, prefix + "cust_fnc_stt          ".trim(), length));
            String[] cust_lst       =  (JSPUtil.getParameter(request, prefix + "cust_lst              ".trim(), length));
            String[] cust_biz_pfm   =  (JSPUtil.getParameter(request, prefix + "cust_biz_pfm          ".trim(), length));
            String[] cust_curr_cd2  =  (JSPUtil.getParameter(request, prefix + "cust_curr_cd2         ".trim(), length));
            String[] cust_inv_style =  (JSPUtil.getParameter(request, prefix + "cust_inv_style        ".trim(), length));
            String[] cust_inv_bal   =  (JSPUtil.getParameter(request, prefix + "cust_inv_bal          ".trim(), length));
            String[] cust_1st_dt    =  (JSPUtil.getParameter(request, prefix + "cust_1st_dt           ".trim(), length));
            String[] cust_1st_srep  =  (JSPUtil.getParameter(request, prefix + "cust_1st_srep         ".trim(), length));
            String[] bkg_no         =  (JSPUtil.getParameter(request, prefix + "bkg_no                ".trim(), length));
            String[] bkg_no_split   =  (JSPUtil.getParameter(request, prefix + "bkg_no_split          ".trim(), length));
            String[] cust_scac      =  (JSPUtil.getParameter(request, prefix + "cust_scac             ".trim(), length));
            String[] cust_hancos    =  (JSPUtil.getParameter(request, prefix + "cust_hancos           ".trim(), length));
            String[] cust_kars      =  (JSPUtil.getParameter(request, prefix + "cust_kars             ".trim(), length));
            String[] cust_eb        =  (JSPUtil.getParameter(request, prefix + "cust_eb               ".trim(), length));
            String[] cust_wb        =  (JSPUtil.getParameter(request, prefix + "cust_wb               ".trim(), length));
            String[] cust_del       =  (JSPUtil.getParameter(request, prefix + "cust_del              ".trim(), length));
            String[] cust_reg_tp    =  (JSPUtil.getParameter(request, prefix + "cust_reg_tp           ".trim(), length));
            String[] cust_crdt      =  (JSPUtil.getParameter(request, prefix + "cust_crdt             ".trim(), length));
            String[] cust_updt      =  (JSPUtil.getParameter(request, prefix + "cust_updt             ".trim(), length));
            String[] nis_event_dt   =  (JSPUtil.getParameter(request, prefix + "nis_event_dt          ".trim(), length));
            String[] bkg_fax        =  (JSPUtil.getParameter(request, prefix + "bkg_fax               ".trim(), length));
            String[] gacct_ind      =  (JSPUtil.getParameter(request, prefix + "gacct_ind             ".trim(), length));
            String[] cust_usr_id    =  (JSPUtil.getParameter(request, prefix + "cust_usr_id           ".trim(), length));
            String[] bkg_alert_chk  =  (JSPUtil.getParameter(request, prefix + "bkg_alert_chk         ".trim(), length));
            String[] alert_remark   =  (JSPUtil.getParameter(request, prefix + "alert_remark          ".trim(), length));
            String[] alert_team     =  (JSPUtil.getParameter(request, prefix + "alert_team            ".trim(), length));
            String[] alert_updt     =  (JSPUtil.getParameter(request, prefix + "alert_updt            ".trim(), length));
            String[] alert_userid   =  (JSPUtil.getParameter(request, prefix + "alert_userid          ".trim(), length));
            String[] m_cust_cnt_cd  =  (JSPUtil.getParameter(request, prefix + "m_cust_cnt_cd         ".trim(), length));
            String[] m_cust_seq     =  (JSPUtil.getParameter(request, prefix + "m_cust_seq            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CUSTOMER();
                model.setIbflag                  ( ibflag            [i]);
                model.setPage_rows               ( page_rows         [i]);
                model.setCnt_cd                  ( cnt_cd            [i]);
                model.setCust_cd                 ( cust_cd           [i]);
                model.setOfc_cd                  ( ofc_cd            [i]);
                model.setLoc_cd                  ( loc_cd            [i]);
                model.setCust_nm                 ( cust_nm           [i]);
                model.setCust_addr               ( cust_addr         [i]);
                model.setCust_zip                ( cust_zip          [i]);
                model.setCust_cpt_amt            ( cust_cpt_amt      [i]);
                model.setCust_curr_cd1           ( cust_curr_cd1     [i]);
                model.setCust_psn                ( cust_psn          [i]);
                model.setCust_nwk                ( cust_nwk          [i]);
                model.setCust_fdg_dt             ( cust_fdg_dt       [i]);
                model.setCust_tel                ( cust_tel          [i]);
                model.setCust_fax                ( cust_fax          [i]);
                model.setCust_ip_addr            ( cust_ip_addr      [i]);
                model.setCust_reg_no             ( cust_reg_no       [i]);
                model.setCust_pts_cd             ( cust_pts_cd       [i]);
                model.setCust_pts_cnt            ( cust_pts_cnt      [i]);
                model.setCust_cls                ( cust_cls          [i]);
                model.setCust_rmk                ( cust_rmk          [i]);
                model.setCust_fnc_stt            ( cust_fnc_stt      [i]);
                model.setCust_lst                ( cust_lst          [i]);
                model.setCust_biz_pfm            ( cust_biz_pfm      [i]);
                model.setCust_curr_cd2           ( cust_curr_cd2     [i]);
                model.setCust_inv_style          ( cust_inv_style    [i]);
                model.setCust_inv_bal            ( cust_inv_bal      [i]);
                model.setCust_1st_dt             ( cust_1st_dt       [i]);
                model.setCust_1st_srep           ( cust_1st_srep     [i]);
                model.setBkg_no                  ( bkg_no            [i]);
                model.setBkg_no_split            ( bkg_no_split      [i]);
                model.setCust_scac               ( cust_scac         [i]);
                model.setCust_hancos             ( cust_hancos       [i]);
                model.setCust_kars               ( cust_kars         [i]);
                model.setCust_eb                 ( cust_eb           [i]);
                model.setCust_wb                 ( cust_wb           [i]);
                model.setCust_del                ( cust_del          [i]);
                model.setCust_reg_tp             ( cust_reg_tp       [i]);
                model.setCust_crdt               ( cust_crdt         [i]);
                model.setCust_updt               ( cust_updt         [i]);
                model.setNis_event_dt            ( nis_event_dt      [i]);
                model.setBkg_fax                 ( bkg_fax           [i]);
                model.setGacct_ind               ( gacct_ind         [i]);
                model.setCust_usr_id             ( cust_usr_id       [i]);
                model.setBkg_alert_chk           ( bkg_alert_chk     [i]);
                model.setAlert_remark            ( alert_remark      [i]);
                model.setAlert_team              ( alert_team        [i]);
                model.setAlert_updt              ( alert_updt        [i]);
                model.setAlert_userid            ( alert_userid      [i]);
                model.setM_cust_cnt_cd           ( m_cust_cnt_cd     [i]);
                model.setM_cust_seq              ( m_cust_seq        [i]);
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
