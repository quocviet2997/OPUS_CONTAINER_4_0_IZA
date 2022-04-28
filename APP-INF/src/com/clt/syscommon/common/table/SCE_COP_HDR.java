/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SCE_COP_HDR.java
*@FileTitle : COPManage
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : Se-Hoon PARK
*@LastVersion : 1.0
* 2006-09-13 Se-Hoon PARK
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
 * @author Se-Hoon PARK
 * @since J2EE 1.4
 */public final class SCE_COP_HDR implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            cop_no            = "";
    private String            bkg_no            = "";
    private String            bkg_no_split      = "";
    private String            cntr_no           = "";
    private String            cnmv_yr           = "";
    private String            cnmv_seq          = "";
    private String            cop_sts_cd        = "";
    private String            pctl_no           = "";
    private String            cntr_tpsz_cd      = "";
    private String            por_nod_cd        = "";
    private String            pol_cd            = "";
    private String            n1st_ts_port_cd   = "";
    private String            n2nd_ts_port_cd   = "";
    private String            n3rd_ts_port_cd   = "";
    private String            pod_cd            = "";
    private String            del_nod_cd        = "";
    private String            ttl_tztm_hrs      = "";
    private String            prod_rev          = "";
    private String            ttl_expn_amt      = "";
    private String            cm_amt            = "";
    private String            trnk_aval_teu_spc = "";
    private String            ob_itchg_ctnt     = "";
    private String            ib_itchg_ctnt     = "";
    private String            cre_ofc_cd        = "";
    private String            cre_usr_id        = "";
    private String            cre_dt            = "";
    private String            upd_usr_id        = "";
    private String            upd_dt            = "";

    public SCE_COP_HDR(){}

    public SCE_COP_HDR(
            String            ibflag           ,
            String            page_rows        ,
            String            cop_no           ,
            String            bkg_no           ,
            String            bkg_no_split     ,
            String            cntr_no          ,
            String            cnmv_yr          ,
            String            cnmv_seq         ,
            String            cop_sts_cd       ,
            String            pctl_no          ,
            String            cntr_tpsz_cd     ,
            String            por_nod_cd       ,
            String            pol_cd           ,
            String            n1st_ts_port_cd  ,
            String            n2nd_ts_port_cd  ,
            String            n3rd_ts_port_cd  ,
            String            pod_cd           ,
            String            del_nod_cd       ,
            String            ttl_tztm_hrs     ,
            String            prod_rev         ,
            String            ttl_expn_amt     ,
            String            cm_amt           ,
            String            trnk_aval_teu_spc,
            String            ob_itchg_ctnt    ,
            String            ib_itchg_ctnt    ,
            String            cre_ofc_cd       ,
            String            cre_usr_id       ,
            String            cre_dt           ,
            String            upd_usr_id       ,
            String            upd_dt           ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.cop_no            = cop_no           ;
        this.bkg_no            = bkg_no           ;
        this.bkg_no_split      = bkg_no_split     ;
        this.cntr_no           = cntr_no          ;
        this.cnmv_yr           = cnmv_yr          ;
        this.cnmv_seq          = cnmv_seq         ;
        this.cop_sts_cd        = cop_sts_cd       ;
        this.pctl_no           = pctl_no          ;
        this.cntr_tpsz_cd      = cntr_tpsz_cd     ;
        this.por_nod_cd        = por_nod_cd       ;
        this.pol_cd            = pol_cd           ;
        this.n1st_ts_port_cd   = n1st_ts_port_cd  ;
        this.n2nd_ts_port_cd   = n2nd_ts_port_cd  ;
        this.n3rd_ts_port_cd   = n3rd_ts_port_cd  ;
        this.pod_cd            = pod_cd           ;
        this.del_nod_cd        = del_nod_cd       ;
        this.ttl_tztm_hrs      = ttl_tztm_hrs     ;
        this.prod_rev          = prod_rev         ;
        this.ttl_expn_amt      = ttl_expn_amt     ;
        this.cm_amt            = cm_amt           ;
        this.trnk_aval_teu_spc = trnk_aval_teu_spc;
        this.ob_itchg_ctnt     = ob_itchg_ctnt    ;
        this.ib_itchg_ctnt     = ib_itchg_ctnt    ;
        this.cre_ofc_cd        = cre_ofc_cd       ;
        this.cre_usr_id        = cre_usr_id       ;
        this.cre_dt            = cre_dt           ;
        this.upd_usr_id        = upd_usr_id       ;
        this.upd_dt            = upd_dt           ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getCop_no           (){    return cop_no               ;    }
    public String            getBkg_no           (){    return bkg_no               ;    }
    public String            getBkg_no_split     (){    return bkg_no_split         ;    }
    public String            getCntr_no          (){    return cntr_no              ;    }
    public String            getCnmv_yr          (){    return cnmv_yr              ;    }
    public String            getCnmv_seq         (){    return cnmv_seq             ;    }
    public String            getCop_sts_cd       (){    return cop_sts_cd           ;    }
    public String            getPctl_no          (){    return pctl_no              ;    }
    public String            getCntr_tpsz_cd     (){    return cntr_tpsz_cd         ;    }
    public String            getPor_nod_cd       (){    return por_nod_cd           ;    }
    public String            getPol_cd           (){    return pol_cd               ;    }
    public String            getN1st_ts_port_cd  (){    return n1st_ts_port_cd      ;    }
    public String            getN2nd_ts_port_cd  (){    return n2nd_ts_port_cd      ;    }
    public String            getN3rd_ts_port_cd  (){    return n3rd_ts_port_cd      ;    }
    public String            getPod_cd           (){    return pod_cd               ;    }
    public String            getDel_nod_cd       (){    return del_nod_cd           ;    }
    public String            getTtl_tztm_hrs     (){    return ttl_tztm_hrs         ;    }
    public String            getProd_rev         (){    return prod_rev             ;    }
    public String            getTtl_expn_amt     (){    return ttl_expn_amt         ;    }
    public String            getCm_amt           (){    return cm_amt               ;    }
    public String            getTrnk_aval_teu_spc(){    return trnk_aval_teu_spc    ;    }
    public String            getOb_itchg_ctnt    (){    return ob_itchg_ctnt        ;    }
    public String            getIb_itchg_ctnt    (){    return ib_itchg_ctnt        ;    }
    public String            getCre_ofc_cd       (){    return cre_ofc_cd           ;    }
    public String            getCre_usr_id       (){    return cre_usr_id           ;    }
    public String            getCre_dt           (){    return cre_dt               ;    }
    public String            getUpd_usr_id       (){    return upd_usr_id           ;    }
    public String            getUpd_dt           (){    return upd_dt               ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setCop_no           ( String            cop_no            ){    this.cop_no            = cop_no               ;    }
    public void setBkg_no           ( String            bkg_no            ){    this.bkg_no            = bkg_no               ;    }
    public void setBkg_no_split     ( String            bkg_no_split      ){    this.bkg_no_split      = bkg_no_split         ;    }
    public void setCntr_no          ( String            cntr_no           ){    this.cntr_no           = cntr_no              ;    }
    public void setCnmv_yr          ( String            cnmv_yr           ){    this.cnmv_yr           = cnmv_yr              ;    }
    public void setCnmv_seq         ( String            cnmv_seq          ){    this.cnmv_seq          = cnmv_seq             ;    }
    public void setCop_sts_cd       ( String            cop_sts_cd        ){    this.cop_sts_cd        = cop_sts_cd           ;    }
    public void setPctl_no          ( String            pctl_no           ){    this.pctl_no           = pctl_no              ;    }
    public void setCntr_tpsz_cd     ( String            cntr_tpsz_cd      ){    this.cntr_tpsz_cd      = cntr_tpsz_cd         ;    }
    public void setPor_nod_cd       ( String            por_nod_cd        ){    this.por_nod_cd        = por_nod_cd           ;    }
    public void setPol_cd           ( String            pol_cd            ){    this.pol_cd            = pol_cd               ;    }
    public void setN1st_ts_port_cd  ( String            n1st_ts_port_cd   ){    this.n1st_ts_port_cd   = n1st_ts_port_cd      ;    }
    public void setN2nd_ts_port_cd  ( String            n2nd_ts_port_cd   ){    this.n2nd_ts_port_cd   = n2nd_ts_port_cd      ;    }
    public void setN3rd_ts_port_cd  ( String            n3rd_ts_port_cd   ){    this.n3rd_ts_port_cd   = n3rd_ts_port_cd      ;    }
    public void setPod_cd           ( String            pod_cd            ){    this.pod_cd            = pod_cd               ;    }
    public void setDel_nod_cd       ( String            del_nod_cd        ){    this.del_nod_cd        = del_nod_cd           ;    }
    public void setTtl_tztm_hrs     ( String            ttl_tztm_hrs      ){    this.ttl_tztm_hrs      = ttl_tztm_hrs         ;    }
    public void setProd_rev         ( String            prod_rev          ){    this.prod_rev          = prod_rev             ;    }
    public void setTtl_expn_amt     ( String            ttl_expn_amt      ){    this.ttl_expn_amt      = ttl_expn_amt         ;    }
    public void setCm_amt           ( String            cm_amt            ){    this.cm_amt            = cm_amt               ;    }
    public void setTrnk_aval_teu_spc( String            trnk_aval_teu_spc ){    this.trnk_aval_teu_spc = trnk_aval_teu_spc    ;    }
    public void setOb_itchg_ctnt    ( String            ob_itchg_ctnt     ){    this.ob_itchg_ctnt     = ob_itchg_ctnt        ;    }
    public void setIb_itchg_ctnt    ( String            ib_itchg_ctnt     ){    this.ib_itchg_ctnt     = ib_itchg_ctnt        ;    }
    public void setCre_ofc_cd       ( String            cre_ofc_cd        ){    this.cre_ofc_cd        = cre_ofc_cd           ;    }
    public void setCre_usr_id       ( String            cre_usr_id        ){    this.cre_usr_id        = cre_usr_id           ;    }
    public void setCre_dt           ( String            cre_dt            ){    this.cre_dt            = cre_dt               ;    }
    public void setUpd_usr_id       ( String            upd_usr_id        ){    this.upd_usr_id        = upd_usr_id           ;    }
    public void setUpd_dt           ( String            upd_dt            ){    this.upd_dt            = upd_dt               ;    }

    public static SCE_COP_HDR fromRequest(HttpServletRequest request) {
        SCE_COP_HDR model = new SCE_COP_HDR();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setCop_no               (JSPUtil.getParameter(request, "cop_no                   ".trim(), ""));
            model.setBkg_no               (JSPUtil.getParameter(request, "bkg_no                   ".trim(), ""));
            model.setBkg_no_split         (JSPUtil.getParameter(request, "bkg_no_split             ".trim(), ""));
            model.setCntr_no              (JSPUtil.getParameter(request, "cntr_no                  ".trim(), ""));
            model.setCnmv_yr              (JSPUtil.getParameter(request, "cnmv_yr                  ".trim(), ""));
            model.setCnmv_seq             (JSPUtil.getParameter(request, "cnmv_seq                 ".trim(), ""));
            model.setCop_sts_cd           (JSPUtil.getParameter(request, "cop_sts_cd               ".trim(), ""));
            model.setPctl_no              (JSPUtil.getParameter(request, "pctl_no                  ".trim(), ""));
            model.setCntr_tpsz_cd         (JSPUtil.getParameter(request, "cntr_tpsz_cd             ".trim(), ""));
            model.setPor_nod_cd           (JSPUtil.getParameter(request, "por_nod_cd               ".trim(), ""));
            model.setPol_cd               (JSPUtil.getParameter(request, "pol_cd                   ".trim(), ""));
            model.setN1st_ts_port_cd      (JSPUtil.getParameter(request, "n1st_ts_port_cd          ".trim(), ""));
            model.setN2nd_ts_port_cd      (JSPUtil.getParameter(request, "n2nd_ts_port_cd          ".trim(), ""));
            model.setN3rd_ts_port_cd      (JSPUtil.getParameter(request, "n3rd_ts_port_cd          ".trim(), ""));
            model.setPod_cd               (JSPUtil.getParameter(request, "pod_cd                   ".trim(), ""));
            model.setDel_nod_cd           (JSPUtil.getParameter(request, "del_nod_cd               ".trim(), ""));
            model.setTtl_tztm_hrs         (JSPUtil.getParameter(request, "ttl_tztm_hrs             ".trim(), ""));
            model.setProd_rev             (JSPUtil.getParameter(request, "prod_rev                 ".trim(), ""));
            model.setTtl_expn_amt         (JSPUtil.getParameter(request, "ttl_expn_amt             ".trim(), ""));
            model.setCm_amt               (JSPUtil.getParameter(request, "cm_amt                   ".trim(), ""));
            model.setTrnk_aval_teu_spc    (JSPUtil.getParameter(request, "trnk_aval_teu_spc        ".trim(), ""));
            model.setOb_itchg_ctnt        (JSPUtil.getParameter(request, "ob_itchg_ctnt            ".trim(), ""));
            model.setIb_itchg_ctnt        (JSPUtil.getParameter(request, "ib_itchg_ctnt            ".trim(), ""));
            model.setCre_ofc_cd           (JSPUtil.getParameter(request, "cre_ofc_cd               ".trim(), ""));
            model.setCre_usr_id           (JSPUtil.getParameter(request, "cre_usr_id               ".trim(), ""));
            model.setCre_dt               (JSPUtil.getParameter(request, "cre_dt                   ".trim(), ""));
            model.setUpd_usr_id           (JSPUtil.getParameter(request, "upd_usr_id               ".trim(), ""));
            model.setUpd_dt               (JSPUtil.getParameter(request, "upd_dt                   ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SCE_COP_HDR model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] cop_no            =  (JSPUtil.getParameter(request, "cop_no                   ".trim(), length));
            String[] bkg_no            =  (JSPUtil.getParameter(request, "bkg_no                   ".trim(), length));
            String[] bkg_no_split      =  (JSPUtil.getParameter(request, "bkg_no_split             ".trim(), length));
            String[] cntr_no           =  (JSPUtil.getParameter(request, "cntr_no                  ".trim(), length));
            String[] cnmv_yr           =  (JSPUtil.getParameter(request, "cnmv_yr                  ".trim(), length));
            String[] cnmv_seq          =  (JSPUtil.getParameter(request, "cnmv_seq                 ".trim(), length));
            String[] cop_sts_cd        =  (JSPUtil.getParameter(request, "cop_sts_cd               ".trim(), length));
            String[] pctl_no           =  (JSPUtil.getParameter(request, "pctl_no                  ".trim(), length));
            String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "cntr_tpsz_cd             ".trim(), length));
            String[] por_nod_cd        =  (JSPUtil.getParameter(request, "por_nod_cd               ".trim(), length));
            String[] pol_cd            =  (JSPUtil.getParameter(request, "pol_cd                   ".trim(), length));
            String[] n1st_ts_port_cd   =  (JSPUtil.getParameter(request, "n1st_ts_port_cd          ".trim(), length));
            String[] n2nd_ts_port_cd   =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd          ".trim(), length));
            String[] n3rd_ts_port_cd   =  (JSPUtil.getParameter(request, "n3rd_ts_port_cd          ".trim(), length));
            String[] pod_cd            =  (JSPUtil.getParameter(request, "pod_cd                   ".trim(), length));
            String[] del_nod_cd        =  (JSPUtil.getParameter(request, "del_nod_cd               ".trim(), length));
            String[] ttl_tztm_hrs      =  (JSPUtil.getParameter(request, "ttl_tztm_hrs             ".trim(), length));
            String[] prod_rev          =  (JSPUtil.getParameter(request, "prod_rev                 ".trim(), length));
            String[] ttl_expn_amt      =  (JSPUtil.getParameter(request, "ttl_expn_amt             ".trim(), length));
            String[] cm_amt            =  (JSPUtil.getParameter(request, "cm_amt                   ".trim(), length));
            String[] trnk_aval_teu_spc =  (JSPUtil.getParameter(request, "trnk_aval_teu_spc        ".trim(), length));
            String[] ob_itchg_ctnt     =  (JSPUtil.getParameter(request, "ob_itchg_ctnt            ".trim(), length));
            String[] ib_itchg_ctnt     =  (JSPUtil.getParameter(request, "ib_itchg_ctnt            ".trim(), length));
            String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, "cre_ofc_cd               ".trim(), length));
            String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id               ".trim(), length));
            String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt                   ".trim(), length));
            String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id               ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_HDR();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setCop_no                     (cop_no               [i]);
                model.setBkg_no                     (bkg_no               [i]);
                model.setBkg_no_split               (bkg_no_split         [i]);
                model.setCntr_no                    (cntr_no              [i]);
                model.setCnmv_yr                    (cnmv_yr              [i]);
                model.setCnmv_seq                   (cnmv_seq             [i]);
                model.setCop_sts_cd                 (cop_sts_cd           [i]);
                model.setPctl_no                    (pctl_no              [i]);
                model.setCntr_tpsz_cd               (cntr_tpsz_cd         [i]);
                model.setPor_nod_cd                 (por_nod_cd           [i]);
                model.setPol_cd                     (pol_cd               [i]);
                model.setN1st_ts_port_cd            (n1st_ts_port_cd      [i]);
                model.setN2nd_ts_port_cd            (n2nd_ts_port_cd      [i]);
                model.setN3rd_ts_port_cd            (n3rd_ts_port_cd      [i]);
                model.setPod_cd                     (pod_cd               [i]);
                model.setDel_nod_cd                 (del_nod_cd           [i]);
                model.setTtl_tztm_hrs               (ttl_tztm_hrs         [i]);
                model.setProd_rev                   (prod_rev             [i]);
                model.setTtl_expn_amt               (ttl_expn_amt         [i]);
                model.setCm_amt                     (cm_amt               [i]);
                model.setTrnk_aval_teu_spc          (trnk_aval_teu_spc    [i]);
                model.setOb_itchg_ctnt              (ob_itchg_ctnt        [i]);
                model.setIb_itchg_ctnt              (ib_itchg_ctnt        [i]);
                model.setCre_ofc_cd                 (cre_ofc_cd           [i]);
                model.setCre_usr_id                 (cre_usr_id           [i]);
                model.setCre_dt                     (cre_dt               [i]);
                model.setUpd_usr_id                 (upd_usr_id           [i]);
                model.setUpd_dt                     (upd_dt               [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        SCE_COP_HDR model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] cop_no            =  (JSPUtil.getParameter(request, prefix + "cop_no                   ".trim(), length));
            String[] bkg_no            =  (JSPUtil.getParameter(request, prefix + "bkg_no                   ".trim(), length));
            String[] bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bkg_no_split             ".trim(), length));
            String[] cntr_no           =  (JSPUtil.getParameter(request, prefix + "cntr_no                  ".trim(), length));
            String[] cnmv_yr           =  (JSPUtil.getParameter(request, prefix + "cnmv_yr                  ".trim(), length));
            String[] cnmv_seq          =  (JSPUtil.getParameter(request, prefix + "cnmv_seq                 ".trim(), length));
            String[] cop_sts_cd        =  (JSPUtil.getParameter(request, prefix + "cop_sts_cd               ".trim(), length));
            String[] pctl_no           =  (JSPUtil.getParameter(request, prefix + "pctl_no                  ".trim(), length));
            String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd             ".trim(), length));
            String[] por_nod_cd        =  (JSPUtil.getParameter(request, prefix + "por_nod_cd               ".trim(), length));
            String[] pol_cd            =  (JSPUtil.getParameter(request, prefix + "pol_cd                   ".trim(), length));
            String[] n1st_ts_port_cd   =  (JSPUtil.getParameter(request, prefix + "n1st_ts_port_cd          ".trim(), length));
            String[] n2nd_ts_port_cd   =  (JSPUtil.getParameter(request, prefix + "n2nd_ts_port_cd          ".trim(), length));
            String[] n3rd_ts_port_cd   =  (JSPUtil.getParameter(request, prefix + "n3rd_ts_port_cd          ".trim(), length));
            String[] pod_cd            =  (JSPUtil.getParameter(request, prefix + "pod_cd                   ".trim(), length));
            String[] del_nod_cd        =  (JSPUtil.getParameter(request, prefix + "del_nod_cd               ".trim(), length));
            String[] ttl_tztm_hrs      =  (JSPUtil.getParameter(request, prefix + "ttl_tztm_hrs             ".trim(), length));
            String[] prod_rev          =  (JSPUtil.getParameter(request, prefix + "prod_rev                 ".trim(), length));
            String[] ttl_expn_amt      =  (JSPUtil.getParameter(request, prefix + "ttl_expn_amt             ".trim(), length));
            String[] cm_amt            =  (JSPUtil.getParameter(request, prefix + "cm_amt                   ".trim(), length));
            String[] trnk_aval_teu_spc =  (JSPUtil.getParameter(request, prefix + "trnk_aval_teu_spc        ".trim(), length));
            String[] ob_itchg_ctnt     =  (JSPUtil.getParameter(request, prefix + "ob_itchg_ctnt            ".trim(), length));
            String[] ib_itchg_ctnt     =  (JSPUtil.getParameter(request, prefix + "ib_itchg_ctnt            ".trim(), length));
            String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd               ".trim(), length));
            String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id               ".trim(), length));
            String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt                   ".trim(), length));
            String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id               ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_HDR();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setCop_no                     ( cop_no               [i]);
                model.setBkg_no                     ( bkg_no               [i]);
                model.setBkg_no_split               ( bkg_no_split         [i]);
                model.setCntr_no                    ( cntr_no              [i]);
                model.setCnmv_yr                    ( cnmv_yr              [i]);
                model.setCnmv_seq                   ( cnmv_seq             [i]);
                model.setCop_sts_cd                 ( cop_sts_cd           [i]);
                model.setPctl_no                    ( pctl_no              [i]);
                model.setCntr_tpsz_cd               ( cntr_tpsz_cd         [i]);
                model.setPor_nod_cd                 ( por_nod_cd           [i]);
                model.setPol_cd                     ( pol_cd               [i]);
                model.setN1st_ts_port_cd            ( n1st_ts_port_cd      [i]);
                model.setN2nd_ts_port_cd            ( n2nd_ts_port_cd      [i]);
                model.setN3rd_ts_port_cd            ( n3rd_ts_port_cd      [i]);
                model.setPod_cd                     ( pod_cd               [i]);
                model.setDel_nod_cd                 ( del_nod_cd           [i]);
                model.setTtl_tztm_hrs               ( ttl_tztm_hrs         [i]);
                model.setProd_rev                   ( prod_rev             [i]);
                model.setTtl_expn_amt               ( ttl_expn_amt         [i]);
                model.setCm_amt                     ( cm_amt               [i]);
                model.setTrnk_aval_teu_spc          ( trnk_aval_teu_spc    [i]);
                model.setOb_itchg_ctnt              ( ob_itchg_ctnt        [i]);
                model.setIb_itchg_ctnt              ( ib_itchg_ctnt        [i]);
                model.setCre_ofc_cd                 ( cre_ofc_cd           [i]);
                model.setCre_usr_id                 ( cre_usr_id           [i]);
                model.setCre_dt                     ( cre_dt               [i]);
                model.setUpd_usr_id                 ( upd_usr_id           [i]);
                model.setUpd_dt                     ( upd_dt               [i]);
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
