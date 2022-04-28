package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * 1. 기능 : Table Value Ojbect
 * <p>
 * 2. 처리개요 :
 * <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)
 * <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object
 * <p>
 * 3. 주의사항 :
 * <p>
 * ===================================<br>
 * 4. 작성자/작성일 : jungsunyong/2006.06.28<br>
 * ===================================<br>
 * 5. 수정사항<p>
 * 5.1 요구사항 ID :<p>
 * - 수정자/수정일 :<p>
 * - 수정사유/내역 :<p>
 * ===================================<br>
 * <p/>
 * @author : jungsunyong
 * @version : v1.0.0
 */
public final class PRD_OCN_ROUT implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            org_loc_cd        = "";
    private String            dest_loc_cd       = "";
    private String            rout_seq          = "";
    private String            trnk_lane_cd      = "";
    private String            ts_ind_cd         = "";
    private String            prior_lvl         = "";
    private String            tztm_dys          = "";
    private String            tztm_hors         = "";
    private String            n1st_ts_port_cd   = "";
    private String            n1st_ts_lane_cd   = "";
    private String            n2nd_ts_port_cd   = "";
    private String            n2nd_ts_lane_cd   = "";
    private String            pf_ind_cd         = "";
    private String            n1st_tztm_dys     = "";
    private String            n1st_tztm_hors    = "";
    private String            n2nd_tztm_dys     = "";
    private String            n2nd_tztm_hors    = "";
    private String            n3rd_tztm_dys     = "";
    private String            n3rd_tztm_hors    = "";
    private String            n1st_stay_tm_dys  = "";
    private String            n1st_stay_tm_hors = "";
    private String            n2nd_stay_tm_dys  = "";
    private String            n2nd_stay_tm_hors = "";
    private String            fdr_used_flg      = "";
    private String            ocn_rout_rmk      = "";
    private String            cre_ofc_cd        = "";
    private String            cre_usr_id        = "";
    private String            cre_dt            = "";
    private String            upd_ind_cd        = "";
    private String            upd_ofc_cd        = "";
    private String            upd_usr_id        = "";
    private String            upd_dt            = "";

    public PRD_OCN_ROUT(){}

    public PRD_OCN_ROUT(
            String            ibflag           ,
            String            page_rows        ,
            String            org_loc_cd       ,
            String            dest_loc_cd      ,
            String            rout_seq         ,
            String            trnk_lane_cd     ,
            String            ts_ind_cd        ,
            String            prior_lvl        ,
            String            tztm_dys         ,
            String            tztm_hors        ,
            String            n1st_ts_port_cd  ,
            String            n1st_ts_lane_cd  ,
            String            n2nd_ts_port_cd  ,
            String            n2nd_ts_lane_cd  ,
            String            pf_ind_cd        ,
            String            n1st_tztm_dys    ,
            String            n1st_tztm_hors   ,
            String            n2nd_tztm_dys    ,
            String            n2nd_tztm_hors   ,
            String            n3rd_tztm_dys    ,
            String            n3rd_tztm_hors   ,
            String            n1st_stay_tm_dys ,
            String            n1st_stay_tm_hors,
            String            n2nd_stay_tm_dys ,
            String            n2nd_stay_tm_hors,
            String            fdr_used_flg     ,
            String            ocn_rout_rmk     ,
            String            cre_ofc_cd       ,
            String            cre_usr_id       ,
            String            cre_dt           ,
            String            upd_ind_cd       ,
            String            upd_ofc_cd       ,
            String            upd_usr_id       ,
            String            upd_dt           ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.org_loc_cd        = org_loc_cd       ;
        this.dest_loc_cd       = dest_loc_cd      ;
        this.rout_seq          = rout_seq         ;
        this.trnk_lane_cd      = trnk_lane_cd     ;
        this.ts_ind_cd         = ts_ind_cd        ;
        this.prior_lvl         = prior_lvl        ;
        this.tztm_dys          = tztm_dys         ;
        this.tztm_hors         = tztm_hors        ;
        this.n1st_ts_port_cd   = n1st_ts_port_cd  ;
        this.n1st_ts_lane_cd   = n1st_ts_lane_cd  ;
        this.n2nd_ts_port_cd   = n2nd_ts_port_cd  ;
        this.n2nd_ts_lane_cd   = n2nd_ts_lane_cd  ;
        this.pf_ind_cd         = pf_ind_cd        ;
        this.n1st_tztm_dys     = n1st_tztm_dys    ;
        this.n1st_tztm_hors    = n1st_tztm_hors   ;
        this.n2nd_tztm_dys     = n2nd_tztm_dys    ;
        this.n2nd_tztm_hors    = n2nd_tztm_hors   ;
        this.n3rd_tztm_dys     = n3rd_tztm_dys    ;
        this.n3rd_tztm_hors    = n3rd_tztm_hors   ;
        this.n1st_stay_tm_dys  = n1st_stay_tm_dys ;
        this.n1st_stay_tm_hors = n1st_stay_tm_hors;
        this.n2nd_stay_tm_dys  = n2nd_stay_tm_dys ;
        this.n2nd_stay_tm_hors = n2nd_stay_tm_hors;
        this.fdr_used_flg      = fdr_used_flg     ;
        this.ocn_rout_rmk      = ocn_rout_rmk     ;
        this.cre_ofc_cd        = cre_ofc_cd       ;
        this.cre_usr_id        = cre_usr_id       ;
        this.cre_dt            = cre_dt           ;
        this.upd_ind_cd        = upd_ind_cd       ;
        this.upd_ofc_cd        = upd_ofc_cd       ;
        this.upd_usr_id        = upd_usr_id       ;
        this.upd_dt            = upd_dt           ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getOrg_loc_cd       (){    return org_loc_cd           ;    }
    public String            getDest_loc_cd      (){    return dest_loc_cd          ;    }
    public String            getRout_seq         (){    return rout_seq             ;    }
    public String            getTrnk_lane_cd     (){    return trnk_lane_cd         ;    }
    public String            getTs_ind_cd        (){    return ts_ind_cd            ;    }
    public String            getPrior_lvl        (){    return prior_lvl            ;    }
    public String            getTztm_dys         (){    return tztm_dys             ;    }
    public String            getTztm_hors        (){    return tztm_hors            ;    }
    public String            getN1st_ts_port_cd  (){    return n1st_ts_port_cd      ;    }
    public String            getN1st_ts_lane_cd  (){    return n1st_ts_lane_cd      ;    }
    public String            getN2nd_ts_port_cd  (){    return n2nd_ts_port_cd      ;    }
    public String            getN2nd_ts_lane_cd  (){    return n2nd_ts_lane_cd      ;    }
    public String            getPf_ind_cd        (){    return pf_ind_cd            ;    }
    public String            getN1st_tztm_dys    (){    return n1st_tztm_dys        ;    }
    public String            getN1st_tztm_hors   (){    return n1st_tztm_hors       ;    }
    public String            getN2nd_tztm_dys    (){    return n2nd_tztm_dys        ;    }
    public String            getN2nd_tztm_hors   (){    return n2nd_tztm_hors       ;    }
    public String            getN3rd_tztm_dys    (){    return n3rd_tztm_dys        ;    }
    public String            getN3rd_tztm_hors   (){    return n3rd_tztm_hors       ;    }
    public String            getN1st_stay_tm_dys (){    return n1st_stay_tm_dys     ;    }
    public String            getN1st_stay_tm_hors(){    return n1st_stay_tm_hors    ;    }
    public String            getN2nd_stay_tm_dys (){    return n2nd_stay_tm_dys     ;    }
    public String            getN2nd_stay_tm_hors(){    return n2nd_stay_tm_hors    ;    }
    public String            getFdr_used_flg     (){    return fdr_used_flg         ;    }
    public String            getOcn_rout_rmk     (){    return ocn_rout_rmk         ;    }
    public String            getCre_ofc_cd       (){    return cre_ofc_cd           ;    }
    public String            getCre_usr_id       (){    return cre_usr_id           ;    }
    public String            getCre_dt           (){    return cre_dt               ;    }
    public String            getUpd_ind_cd       (){    return upd_ind_cd           ;    }
    public String            getUpd_ofc_cd       (){    return upd_ofc_cd           ;    }
    public String            getUpd_usr_id       (){    return upd_usr_id           ;    }
    public String            getUpd_dt           (){    return upd_dt               ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setOrg_loc_cd       ( String            org_loc_cd        ){    this.org_loc_cd        = org_loc_cd           ;    }
    public void setDest_loc_cd      ( String            dest_loc_cd       ){    this.dest_loc_cd       = dest_loc_cd          ;    }
    public void setRout_seq         ( String            rout_seq          ){    this.rout_seq          = rout_seq             ;    }
    public void setTrnk_lane_cd     ( String            trnk_lane_cd      ){    this.trnk_lane_cd      = trnk_lane_cd         ;    }
    public void setTs_ind_cd        ( String            ts_ind_cd         ){    this.ts_ind_cd         = ts_ind_cd            ;    }
    public void setPrior_lvl        ( String            prior_lvl         ){    this.prior_lvl         = prior_lvl            ;    }
    public void setTztm_dys         ( String            tztm_dys          ){    this.tztm_dys          = tztm_dys             ;    }
    public void setTztm_hors        ( String            tztm_hors         ){    this.tztm_hors         = tztm_hors            ;    }
    public void setN1st_ts_port_cd  ( String            n1st_ts_port_cd   ){    this.n1st_ts_port_cd   = n1st_ts_port_cd      ;    }
    public void setN1st_ts_lane_cd  ( String            n1st_ts_lane_cd   ){    this.n1st_ts_lane_cd   = n1st_ts_lane_cd      ;    }
    public void setN2nd_ts_port_cd  ( String            n2nd_ts_port_cd   ){    this.n2nd_ts_port_cd   = n2nd_ts_port_cd      ;    }
    public void setN2nd_ts_lane_cd  ( String            n2nd_ts_lane_cd   ){    this.n2nd_ts_lane_cd   = n2nd_ts_lane_cd      ;    }
    public void setPf_ind_cd        ( String            pf_ind_cd         ){    this.pf_ind_cd         = pf_ind_cd            ;    }
    public void setN1st_tztm_dys    ( String            n1st_tztm_dys     ){    this.n1st_tztm_dys     = n1st_tztm_dys        ;    }
    public void setN1st_tztm_hors   ( String            n1st_tztm_hors    ){    this.n1st_tztm_hors    = n1st_tztm_hors       ;    }
    public void setN2nd_tztm_dys    ( String            n2nd_tztm_dys     ){    this.n2nd_tztm_dys     = n2nd_tztm_dys        ;    }
    public void setN2nd_tztm_hors   ( String            n2nd_tztm_hors    ){    this.n2nd_tztm_hors    = n2nd_tztm_hors       ;    }
    public void setN3rd_tztm_dys    ( String            n3rd_tztm_dys     ){    this.n3rd_tztm_dys     = n3rd_tztm_dys        ;    }
    public void setN3rd_tztm_hors   ( String            n3rd_tztm_hors    ){    this.n3rd_tztm_hors    = n3rd_tztm_hors       ;    }
    public void setN1st_stay_tm_dys ( String            n1st_stay_tm_dys  ){    this.n1st_stay_tm_dys  = n1st_stay_tm_dys     ;    }
    public void setN1st_stay_tm_hors( String            n1st_stay_tm_hors ){    this.n1st_stay_tm_hors = n1st_stay_tm_hors    ;    }
    public void setN2nd_stay_tm_dys ( String            n2nd_stay_tm_dys  ){    this.n2nd_stay_tm_dys  = n2nd_stay_tm_dys     ;    }
    public void setN2nd_stay_tm_hors( String            n2nd_stay_tm_hors ){    this.n2nd_stay_tm_hors = n2nd_stay_tm_hors    ;    }
    public void setFdr_used_flg     ( String            fdr_used_flg      ){    this.fdr_used_flg      = fdr_used_flg         ;    }
    public void setOcn_rout_rmk     ( String            ocn_rout_rmk      ){    this.ocn_rout_rmk      = ocn_rout_rmk         ;    }
    public void setCre_ofc_cd       ( String            cre_ofc_cd        ){    this.cre_ofc_cd        = cre_ofc_cd           ;    }
    public void setCre_usr_id       ( String            cre_usr_id        ){    this.cre_usr_id        = cre_usr_id           ;    }
    public void setCre_dt           ( String            cre_dt            ){    this.cre_dt            = cre_dt               ;    }
    public void setUpd_ind_cd       ( String            upd_ind_cd        ){    this.upd_ind_cd        = upd_ind_cd           ;    }
    public void setUpd_ofc_cd       ( String            upd_ofc_cd        ){    this.upd_ofc_cd        = upd_ofc_cd           ;    }
    public void setUpd_usr_id       ( String            upd_usr_id        ){    this.upd_usr_id        = upd_usr_id           ;    }
    public void setUpd_dt           ( String            upd_dt            ){    this.upd_dt            = upd_dt               ;    }

    public static PRD_OCN_ROUT fromRequest(HttpServletRequest request) {
        PRD_OCN_ROUT model = new PRD_OCN_ROUT();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setOrg_loc_cd           (JSPUtil.getParameter(request, "org_loc_cd               ".trim(), ""));
            model.setDest_loc_cd          (JSPUtil.getParameter(request, "dest_loc_cd              ".trim(), ""));
            model.setRout_seq             (JSPUtil.getParameter(request, "rout_seq                 ".trim(), ""));
            model.setTrnk_lane_cd         (JSPUtil.getParameter(request, "trnk_lane_cd             ".trim(), ""));
            model.setTs_ind_cd            (JSPUtil.getParameter(request, "ts_ind_cd                ".trim(), ""));
            model.setPrior_lvl            (JSPUtil.getParameter(request, "prior_lvl                ".trim(), ""));
            model.setTztm_dys             (JSPUtil.getParameter(request, "tztm_dys                 ".trim(), ""));
            model.setTztm_hors            (JSPUtil.getParameter(request, "tztm_hors                ".trim(), ""));
            model.setN1st_ts_port_cd      (JSPUtil.getParameter(request, "n1st_ts_port_cd          ".trim(), ""));
            model.setN1st_ts_lane_cd      (JSPUtil.getParameter(request, "n1st_ts_lane_cd          ".trim(), ""));
            model.setN2nd_ts_port_cd      (JSPUtil.getParameter(request, "n2nd_ts_port_cd          ".trim(), ""));
            model.setN2nd_ts_lane_cd      (JSPUtil.getParameter(request, "n2nd_ts_lane_cd          ".trim(), ""));
            model.setPf_ind_cd            (JSPUtil.getParameter(request, "pf_ind_cd                ".trim(), ""));
            model.setN1st_tztm_dys        (JSPUtil.getParameter(request, "n1st_tztm_dys            ".trim(), ""));
            model.setN1st_tztm_hors       (JSPUtil.getParameter(request, "n1st_tztm_hors           ".trim(), ""));
            model.setN2nd_tztm_dys        (JSPUtil.getParameter(request, "n2nd_tztm_dys            ".trim(), ""));
            model.setN2nd_tztm_hors       (JSPUtil.getParameter(request, "n2nd_tztm_hors           ".trim(), ""));
            model.setN3rd_tztm_dys        (JSPUtil.getParameter(request, "n3rd_tztm_dys            ".trim(), ""));
            model.setN3rd_tztm_hors       (JSPUtil.getParameter(request, "n3rd_tztm_hors           ".trim(), ""));
            model.setN1st_stay_tm_dys     (JSPUtil.getParameter(request, "n1st_stay_tm_dys         ".trim(), ""));
            model.setN1st_stay_tm_hors    (JSPUtil.getParameter(request, "n1st_stay_tm_hors        ".trim(), ""));
            model.setN2nd_stay_tm_dys     (JSPUtil.getParameter(request, "n2nd_stay_tm_dys         ".trim(), ""));
            model.setN2nd_stay_tm_hors    (JSPUtil.getParameter(request, "n2nd_stay_tm_hors        ".trim(), ""));
            model.setFdr_used_flg         (JSPUtil.getParameter(request, "fdr_used_flg             ".trim(), ""));
            model.setOcn_rout_rmk         (JSPUtil.getParameter(request, "ocn_rout_rmk             ".trim(), ""));
            model.setCre_ofc_cd           (JSPUtil.getParameter(request, "cre_ofc_cd               ".trim(), ""));
            model.setCre_usr_id           (JSPUtil.getParameter(request, "cre_usr_id               ".trim(), ""));
            model.setCre_dt               (JSPUtil.getParameter(request, "cre_dt                   ".trim(), ""));
            model.setUpd_ind_cd           (JSPUtil.getParameter(request, "upd_ind_cd               ".trim(), ""));
            model.setUpd_ofc_cd           (JSPUtil.getParameter(request, "upd_ofc_cd               ".trim(), ""));
            model.setUpd_usr_id           (JSPUtil.getParameter(request, "upd_usr_id               ".trim(), ""));
            model.setUpd_dt               (JSPUtil.getParameter(request, "upd_dt                   ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_OCN_ROUT model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] org_loc_cd        =  (JSPUtil.getParameter(request, "org_loc_cd               ".trim(), length));
            String[] dest_loc_cd       =  (JSPUtil.getParameter(request, "dest_loc_cd              ".trim(), length));
            String[] rout_seq          =  (JSPUtil.getParameter(request, "rout_seq                 ".trim(), length));
            String[] trnk_lane_cd      =  (JSPUtil.getParameter(request, "trnk_lane_cd             ".trim(), length));
            String[] ts_ind_cd         =  (JSPUtil.getParameter(request, "ts_ind_cd                ".trim(), length));
            String[] prior_lvl         =  (JSPUtil.getParameter(request, "prior_lvl                ".trim(), length));
            String[] tztm_dys          =  (JSPUtil.getParameter(request, "tztm_dys                 ".trim(), length));
            String[] tztm_hors         =  (JSPUtil.getParameter(request, "tztm_hors                ".trim(), length));
            String[] n1st_ts_port_cd   =  (JSPUtil.getParameter(request, "n1st_ts_port_cd          ".trim(), length));
            String[] n1st_ts_lane_cd   =  (JSPUtil.getParameter(request, "n1st_ts_lane_cd          ".trim(), length));
            String[] n2nd_ts_port_cd   =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd          ".trim(), length));
            String[] n2nd_ts_lane_cd   =  (JSPUtil.getParameter(request, "n2nd_ts_lane_cd          ".trim(), length));
            String[] pf_ind_cd         =  (JSPUtil.getParameter(request, "pf_ind_cd                ".trim(), length));
            String[] n1st_tztm_dys     =  (JSPUtil.getParameter(request, "n1st_tztm_dys            ".trim(), length));
            String[] n1st_tztm_hors    =  (JSPUtil.getParameter(request, "n1st_tztm_hors           ".trim(), length));
            String[] n2nd_tztm_dys     =  (JSPUtil.getParameter(request, "n2nd_tztm_dys            ".trim(), length));
            String[] n2nd_tztm_hors    =  (JSPUtil.getParameter(request, "n2nd_tztm_hors           ".trim(), length));
            String[] n3rd_tztm_dys     =  (JSPUtil.getParameter(request, "n3rd_tztm_dys            ".trim(), length));
            String[] n3rd_tztm_hors    =  (JSPUtil.getParameter(request, "n3rd_tztm_hors           ".trim(), length));
            String[] n1st_stay_tm_dys  =  (JSPUtil.getParameter(request, "n1st_stay_tm_dys         ".trim(), length));
            String[] n1st_stay_tm_hors =  (JSPUtil.getParameter(request, "n1st_stay_tm_hors        ".trim(), length));
            String[] n2nd_stay_tm_dys  =  (JSPUtil.getParameter(request, "n2nd_stay_tm_dys         ".trim(), length));
            String[] n2nd_stay_tm_hors =  (JSPUtil.getParameter(request, "n2nd_stay_tm_hors        ".trim(), length));
            String[] fdr_used_flg      =  (JSPUtil.getParameter(request, "fdr_used_flg             ".trim(), length));
            String[] ocn_rout_rmk      =  (JSPUtil.getParameter(request, "ocn_rout_rmk             ".trim(), length));
            String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, "cre_ofc_cd               ".trim(), length));
            String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id               ".trim(), length));
            String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt                   ".trim(), length));
            String[] upd_ind_cd        =  (JSPUtil.getParameter(request, "upd_ind_cd               ".trim(), length));
            String[] upd_ofc_cd        =  (JSPUtil.getParameter(request, "upd_ofc_cd               ".trim(), length));
            String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id               ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_OCN_ROUT();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setOrg_loc_cd                 (org_loc_cd           [i]);
                model.setDest_loc_cd                (dest_loc_cd          [i]);
                model.setRout_seq                   (rout_seq             [i]);
                model.setTrnk_lane_cd               (trnk_lane_cd         [i]);
                model.setTs_ind_cd                  (ts_ind_cd            [i]);
                model.setPrior_lvl                  (prior_lvl            [i]);
                model.setTztm_dys                   (tztm_dys             [i]);
                model.setTztm_hors                  (tztm_hors            [i]);
                model.setN1st_ts_port_cd            (n1st_ts_port_cd      [i]);
                model.setN1st_ts_lane_cd            (n1st_ts_lane_cd      [i]);
                model.setN2nd_ts_port_cd            (n2nd_ts_port_cd      [i]);
                model.setN2nd_ts_lane_cd            (n2nd_ts_lane_cd      [i]);
                model.setPf_ind_cd                  (pf_ind_cd            [i]);
                model.setN1st_tztm_dys              (n1st_tztm_dys        [i]);
                model.setN1st_tztm_hors             (n1st_tztm_hors       [i]);
                model.setN2nd_tztm_dys              (n2nd_tztm_dys        [i]);
                model.setN2nd_tztm_hors             (n2nd_tztm_hors       [i]);
                model.setN3rd_tztm_dys              (n3rd_tztm_dys        [i]);
                model.setN3rd_tztm_hors             (n3rd_tztm_hors       [i]);
                model.setN1st_stay_tm_dys           (n1st_stay_tm_dys     [i]);
                model.setN1st_stay_tm_hors          (n1st_stay_tm_hors    [i]);
                model.setN2nd_stay_tm_dys           (n2nd_stay_tm_dys     [i]);
                model.setN2nd_stay_tm_hors          (n2nd_stay_tm_hors    [i]);
                model.setFdr_used_flg               (fdr_used_flg         [i]);
                model.setOcn_rout_rmk               (ocn_rout_rmk         [i]);
                model.setCre_ofc_cd                 (cre_ofc_cd           [i]);
                model.setCre_usr_id                 (cre_usr_id           [i]);
                model.setCre_dt                     (cre_dt               [i]);
                model.setUpd_ind_cd                 (upd_ind_cd           [i]);
                model.setUpd_ofc_cd                 (upd_ofc_cd           [i]);
                model.setUpd_usr_id                 (upd_usr_id           [i]);
                model.setUpd_dt                     (upd_dt               [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        PRD_OCN_ROUT model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] org_loc_cd        =  (JSPUtil.getParameter(request, "org_loc_cd               ".trim(), length));
            String[] dest_loc_cd       =  (JSPUtil.getParameter(request, "dest_loc_cd              ".trim(), length));
            String[] rout_seq          =  (JSPUtil.getParameter(request, "rout_seq                 ".trim(), length));
            String[] trnk_lane_cd      =  (JSPUtil.getParameter(request, "trnk_lane_cd             ".trim(), length));
            String[] ts_ind_cd         =  (JSPUtil.getParameter(request, "ts_ind_cd                ".trim(), length));
            String[] prior_lvl         =  (JSPUtil.getParameter(request, "prior_lvl                ".trim(), length));
            String[] tztm_dys          =  (JSPUtil.getParameter(request, "tztm_dys                 ".trim(), length));
            String[] tztm_hors         =  (JSPUtil.getParameter(request, "tztm_hors                ".trim(), length));
            String[] n1st_ts_port_cd   =  (JSPUtil.getParameter(request, "n1st_ts_port_cd          ".trim(), length));
            String[] n1st_ts_lane_cd   =  (JSPUtil.getParameter(request, "n1st_ts_lane_cd          ".trim(), length));
            String[] n2nd_ts_port_cd   =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd          ".trim(), length));
            String[] n2nd_ts_lane_cd   =  (JSPUtil.getParameter(request, "n2nd_ts_lane_cd          ".trim(), length));
            String[] pf_ind_cd         =  (JSPUtil.getParameter(request, "pf_ind_cd                ".trim(), length));
            String[] n1st_tztm_dys     =  (JSPUtil.getParameter(request, "n1st_tztm_dys            ".trim(), length));
            String[] n1st_tztm_hors    =  (JSPUtil.getParameter(request, "n1st_tztm_hors           ".trim(), length));
            String[] n2nd_tztm_dys     =  (JSPUtil.getParameter(request, "n2nd_tztm_dys            ".trim(), length));
            String[] n2nd_tztm_hors    =  (JSPUtil.getParameter(request, "n2nd_tztm_hors           ".trim(), length));
            String[] n3rd_tztm_dys     =  (JSPUtil.getParameter(request, "n3rd_tztm_dys            ".trim(), length));
            String[] n3rd_tztm_hors    =  (JSPUtil.getParameter(request, "n3rd_tztm_hors           ".trim(), length));
            String[] n1st_stay_tm_dys  =  (JSPUtil.getParameter(request, "n1st_stay_tm_dys         ".trim(), length));
            String[] n1st_stay_tm_hors =  (JSPUtil.getParameter(request, "n1st_stay_tm_hors        ".trim(), length));
            String[] n2nd_stay_tm_dys  =  (JSPUtil.getParameter(request, "n2nd_stay_tm_dys         ".trim(), length));
            String[] n2nd_stay_tm_hors =  (JSPUtil.getParameter(request, "n2nd_stay_tm_hors        ".trim(), length));
            String[] fdr_used_flg      =  (JSPUtil.getParameter(request, "fdr_used_flg             ".trim(), length));
            String[] ocn_rout_rmk      =  (JSPUtil.getParameter(request, "ocn_rout_rmk             ".trim(), length));
            String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, "cre_ofc_cd               ".trim(), length));
            String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id               ".trim(), length));
            String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt                   ".trim(), length));
            String[] upd_ind_cd        =  (JSPUtil.getParameter(request, "upd_ind_cd               ".trim(), length));
            String[] upd_ofc_cd        =  (JSPUtil.getParameter(request, "upd_ofc_cd               ".trim(), length));
            String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id               ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt                   ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_OCN_ROUT();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setOrg_loc_cd                 (org_loc_cd           [i]);
                model.setDest_loc_cd                (dest_loc_cd          [i]);
                model.setRout_seq                   (rout_seq             [i]);
                model.setTrnk_lane_cd               (trnk_lane_cd         [i]);
                model.setTs_ind_cd                  (ts_ind_cd            [i]);
                model.setPrior_lvl                  (prior_lvl            [i]);
                model.setTztm_dys                   (tztm_dys             [i]);
                model.setTztm_hors                  (tztm_hors            [i]);
                model.setN1st_ts_port_cd            (n1st_ts_port_cd      [i]);
                model.setN1st_ts_lane_cd            (n1st_ts_lane_cd      [i]);
                model.setN2nd_ts_port_cd            (n2nd_ts_port_cd      [i]);
                model.setN2nd_ts_lane_cd            (n2nd_ts_lane_cd      [i]);
                model.setPf_ind_cd                  (pf_ind_cd            [i]);
                model.setN1st_tztm_dys              (n1st_tztm_dys        [i]);
                model.setN1st_tztm_hors             (n1st_tztm_hors       [i]);
                model.setN2nd_tztm_dys              (n2nd_tztm_dys        [i]);
                model.setN2nd_tztm_hors             (n2nd_tztm_hors       [i]);
                model.setN3rd_tztm_dys              (n3rd_tztm_dys        [i]);
                model.setN3rd_tztm_hors             (n3rd_tztm_hors       [i]);
                model.setN1st_stay_tm_dys           (n1st_stay_tm_dys     [i]);
                model.setN1st_stay_tm_hors          (n1st_stay_tm_hors    [i]);
                model.setN2nd_stay_tm_dys           (n2nd_stay_tm_dys     [i]);
                model.setN2nd_stay_tm_hors          (n2nd_stay_tm_hors    [i]);
                model.setFdr_used_flg               (fdr_used_flg         [i]);
                model.setOcn_rout_rmk               (ocn_rout_rmk         [i]);
                model.setCre_ofc_cd                 (cre_ofc_cd           [i]);
                model.setCre_usr_id                 (cre_usr_id           [i]);
                model.setCre_dt                     (cre_dt               [i]);
                model.setUpd_ind_cd                 (upd_ind_cd           [i]);
                model.setUpd_ofc_cd                 (upd_ofc_cd           [i]);
                model.setUpd_usr_id                 (upd_usr_id           [i]);
                model.setUpd_dt                     (upd_dt               [i]);
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
