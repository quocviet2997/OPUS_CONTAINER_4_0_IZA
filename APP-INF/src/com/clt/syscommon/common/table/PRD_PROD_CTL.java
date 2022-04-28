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
 * 4. 작성자/작성일 : jungsunyong/2006.07.05<br>
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
public final class PRD_PROD_CTL implements java.io.Serializable {

    private String                       ibflag                       = "";
    private String                       page_rows                    = "";
    private String                       prod_ctl_no                  = "";
    private String                       bkg_no                       = "";
    private String                       bkg_no_split                 = "";
    private String                       por_nod_cd                   = "";
    private String                       pol_cd                       = "";
    private String                       n1st_ts_port_cd              = "";
    private String                       n2nd_ts_port_cd              = "";
    private String                       n3rd_ts_port_cd              = "";
    private String                       pod_cd                       = "";
    private String                       del_nod_cd                   = "";
    private String                       ttl_tztm_dys                 = "";
    private String                       ttl_tztm_hors                = "";
    private String                       prod_rev                     = "";
    private String                       ttl_expn_amt                 = "";
    private String                       cm_amt                       = "";
    private String                       trnk_aval_teu_spc            = "";
    private String                       bkg_sel_flg                  = "";
    private String                       cop_created_flag             = "";
    private String                       container_count              = "";
    private String                       outbound_interchange_content = "";
    private String                       inbound_interchange_content  = "";
    private String                       cre_ofc_cd                   = "";
    private String                       cre_usr_id                   = "";
    private String                       cre_dt                       = "";
    private String                       upd_usr_id                   = "";
    private String                       upd_dt                       = "";
    private String                       cop_sel_flg                  = "";
    private String                       cntr_knt                     = "";
    private String                       ob_itchng_ctnt               = "";
    private String                       ib_itchng_ctnt               = "";

    public PRD_PROD_CTL(){}

    public PRD_PROD_CTL(
            String                       ibflag                      ,
            String                       page_rows                   ,
            String                       prod_ctl_no                 ,
            String                       bkg_no                      ,
            String                       bkg_no_split                ,
            String                       por_nod_cd                  ,
            String                       pol_cd                      ,
            String                       n1st_ts_port_cd             ,
            String                       n2nd_ts_port_cd             ,
            String                       n3rd_ts_port_cd             ,
            String                       pod_cd                      ,
            String                       del_nod_cd                  ,
            String                       ttl_tztm_dys                ,
            String                       ttl_tztm_hors               ,
            String                       prod_rev                    ,
            String                       ttl_expn_amt                ,
            String                       cm_amt                      ,
            String                       trnk_aval_teu_spc           ,
            String                       bkg_sel_flg                 ,
            String                       cop_created_flag            ,
            String                       container_count             ,
            String                       outbound_interchange_content,
            String                       inbound_interchange_content ,
            String                       cre_ofc_cd                  ,
            String                       cre_usr_id                  ,
            String                       cre_dt                      ,
            String                       upd_usr_id                  ,
            String                       upd_dt                      ,
            String                       cop_sel_flg                 ,
            String                       cntr_knt                    ,
            String                       ob_itchng_ctnt              ,
            String                       ib_itchng_ctnt              ){
        this.ibflag                       = ibflag                      ;
        this.page_rows                    = page_rows                   ;
        this.prod_ctl_no                  = prod_ctl_no                 ;
        this.bkg_no                       = bkg_no                      ;
        this.bkg_no_split                 = bkg_no_split                ;
        this.por_nod_cd                   = por_nod_cd                  ;
        this.pol_cd                       = pol_cd                      ;
        this.n1st_ts_port_cd              = n1st_ts_port_cd             ;
        this.n2nd_ts_port_cd              = n2nd_ts_port_cd             ;
        this.n3rd_ts_port_cd              = n3rd_ts_port_cd             ;
        this.pod_cd                       = pod_cd                      ;
        this.del_nod_cd                   = del_nod_cd                  ;
        this.ttl_tztm_dys                 = ttl_tztm_dys                ;
        this.ttl_tztm_hors                = ttl_tztm_hors               ;
        this.prod_rev                     = prod_rev                    ;
        this.ttl_expn_amt                 = ttl_expn_amt                ;
        this.cm_amt                       = cm_amt                      ;
        this.trnk_aval_teu_spc            = trnk_aval_teu_spc           ;
        this.bkg_sel_flg                  = bkg_sel_flg                 ;
        this.cop_created_flag             = cop_created_flag            ;
        this.container_count              = container_count             ;
        this.outbound_interchange_content = outbound_interchange_content;
        this.inbound_interchange_content  = inbound_interchange_content ;
        this.cre_ofc_cd                   = cre_ofc_cd                  ;
        this.cre_usr_id                   = cre_usr_id                  ;
        this.cre_dt                       = cre_dt                      ;
        this.upd_usr_id                   = upd_usr_id                  ;
        this.upd_dt                       = upd_dt                      ;
        this.cop_sel_flg                  = cop_sel_flg                 ;
        this.cntr_knt                     = cntr_knt                    ;
        this.ob_itchng_ctnt               = ob_itchng_ctnt              ;
        this.ib_itchng_ctnt               = ib_itchng_ctnt              ;
    }

    // getter method is proceeding ..
    public String                       getIbflag                      (){    return ibflag                          ;    }
    public String                       getPage_rows                   (){    return page_rows                       ;    }
    public String                       getProd_ctl_no                 (){    return prod_ctl_no                     ;    }
    public String                       getBkg_no                      (){    return bkg_no                          ;    }
    public String                       getBkg_no_split                (){    return bkg_no_split                    ;    }
    public String                       getPor_nod_cd                  (){    return por_nod_cd                      ;    }
    public String                       getPol_cd                      (){    return pol_cd                          ;    }
    public String                       getN1st_ts_port_cd             (){    return n1st_ts_port_cd                 ;    }
    public String                       getN2nd_ts_port_cd             (){    return n2nd_ts_port_cd                 ;    }
    public String                       getN3rd_ts_port_cd             (){    return n3rd_ts_port_cd                 ;    }
    public String                       getPod_cd                      (){    return pod_cd                          ;    }
    public String                       getDel_nod_cd                  (){    return del_nod_cd                      ;    }
    public String                       getTtl_tztm_dys                (){    return ttl_tztm_dys                    ;    }
    public String                       getTtl_tztm_hors               (){    return ttl_tztm_hors                   ;    }
    public String                       getProd_rev                    (){    return prod_rev                        ;    }
    public String                       getTtl_expn_amt                (){    return ttl_expn_amt                    ;    }
    public String                       getCm_amt                      (){    return cm_amt                          ;    }
    public String                       getTrnk_aval_teu_spc           (){    return trnk_aval_teu_spc               ;    }
    public String                       getBkg_sel_flg                 (){    return bkg_sel_flg                     ;    }
    public String                       getCop_created_flag            (){    return cop_created_flag                ;    }
    public String                       getContainer_count             (){    return container_count                 ;    }
    public String                       getOutbound_interchange_content(){    return outbound_interchange_content    ;    }
    public String                       getInbound_interchange_content (){    return inbound_interchange_content     ;    }
    public String                       getCre_ofc_cd                  (){    return cre_ofc_cd                      ;    }
    public String                       getCre_usr_id                  (){    return cre_usr_id                      ;    }
    public String                       getCre_dt                      (){    return cre_dt                          ;    }
    public String                       getUpd_usr_id                  (){    return upd_usr_id                      ;    }
    public String                       getUpd_dt                      (){    return upd_dt                          ;    }
    public String                       getCop_sel_flg                 (){    return cop_sel_flg                     ;    }
    public String                       getCntr_knt                    (){    return cntr_knt                        ;    }
    public String                       getOb_itchng_ctnt              (){    return ob_itchng_ctnt                  ;    }
    public String                       getIb_itchng_ctnt              (){    return ib_itchng_ctnt                  ;    }

    // setter method is proceeding ..
    public void setIbflag                      ( String                       ibflag                       ){    this.ibflag                       = ibflag                          ;    }
    public void setPage_rows                   ( String                       page_rows                    ){    this.page_rows                    = page_rows                       ;    }
    public void setProd_ctl_no                 ( String                       prod_ctl_no                  ){    this.prod_ctl_no                  = prod_ctl_no                     ;    }
    public void setBkg_no                      ( String                       bkg_no                       ){    this.bkg_no                       = bkg_no                          ;    }
    public void setBkg_no_split                ( String                       bkg_no_split                 ){    this.bkg_no_split                 = bkg_no_split                    ;    }
    public void setPor_nod_cd                  ( String                       por_nod_cd                   ){    this.por_nod_cd                   = por_nod_cd                      ;    }
    public void setPol_cd                      ( String                       pol_cd                       ){    this.pol_cd                       = pol_cd                          ;    }
    public void setN1st_ts_port_cd             ( String                       n1st_ts_port_cd              ){    this.n1st_ts_port_cd              = n1st_ts_port_cd                 ;    }
    public void setN2nd_ts_port_cd             ( String                       n2nd_ts_port_cd              ){    this.n2nd_ts_port_cd              = n2nd_ts_port_cd                 ;    }
    public void setN3rd_ts_port_cd             ( String                       n3rd_ts_port_cd              ){    this.n3rd_ts_port_cd              = n3rd_ts_port_cd                 ;    }
    public void setPod_cd                      ( String                       pod_cd                       ){    this.pod_cd                       = pod_cd                          ;    }
    public void setDel_nod_cd                  ( String                       del_nod_cd                   ){    this.del_nod_cd                   = del_nod_cd                      ;    }
    public void setTtl_tztm_dys                ( String                       ttl_tztm_dys                 ){    this.ttl_tztm_dys                 = ttl_tztm_dys                    ;    }
    public void setTtl_tztm_hors               ( String                       ttl_tztm_hors                ){    this.ttl_tztm_hors                = ttl_tztm_hors                   ;    }
    public void setProd_rev                    ( String                       prod_rev                     ){    this.prod_rev                     = prod_rev                        ;    }
    public void setTtl_expn_amt                ( String                       ttl_expn_amt                 ){    this.ttl_expn_amt                 = ttl_expn_amt                    ;    }
    public void setCm_amt                      ( String                       cm_amt                       ){    this.cm_amt                       = cm_amt                          ;    }
    public void setTrnk_aval_teu_spc           ( String                       trnk_aval_teu_spc            ){    this.trnk_aval_teu_spc            = trnk_aval_teu_spc               ;    }
    public void setBkg_sel_flg                 ( String                       bkg_sel_flg                  ){    this.bkg_sel_flg                  = bkg_sel_flg                     ;    }
    public void setCop_created_flag            ( String                       cop_created_flag             ){    this.cop_created_flag             = cop_created_flag                ;    }
    public void setContainer_count             ( String                       container_count              ){    this.container_count              = container_count                 ;    }
    public void setOutbound_interchange_content( String                       outbound_interchange_content ){    this.outbound_interchange_content = outbound_interchange_content    ;    }
    public void setInbound_interchange_content ( String                       inbound_interchange_content  ){    this.inbound_interchange_content  = inbound_interchange_content     ;    }
    public void setCre_ofc_cd                  ( String                       cre_ofc_cd                   ){    this.cre_ofc_cd                   = cre_ofc_cd                      ;    }
    public void setCre_usr_id                  ( String                       cre_usr_id                   ){    this.cre_usr_id                   = cre_usr_id                      ;    }
    public void setCre_dt                      ( String                       cre_dt                       ){    this.cre_dt                       = cre_dt                          ;    }
    public void setUpd_usr_id                  ( String                       upd_usr_id                   ){    this.upd_usr_id                   = upd_usr_id                      ;    }
    public void setUpd_dt                      ( String                       upd_dt                       ){    this.upd_dt                       = upd_dt                          ;    }
    public void setCop_sel_flg                 ( String                       cop_sel_flg                  ){    this.cop_sel_flg                  = cop_sel_flg                     ;    }
    public void setCntr_knt                    ( String                       cntr_knt                     ){    this.cntr_knt                     = cntr_knt                        ;    }
    public void setOb_itchng_ctnt              ( String                       ob_itchng_ctnt               ){    this.ob_itchng_ctnt               = ob_itchng_ctnt                  ;    }
    public void setIb_itchng_ctnt              ( String                       ib_itchng_ctnt               ){    this.ib_itchng_ctnt               = ib_itchng_ctnt                  ;    }

    public static PRD_PROD_CTL fromRequest(HttpServletRequest request) {
        PRD_PROD_CTL model = new PRD_PROD_CTL();
        try {
            model.setIbflag                          (JSPUtil.getParameter(request, "ibflag                              ".trim(), ""));
            model.setPage_rows                       (JSPUtil.getParameter(request, "page_rows                           ".trim(), ""));
            model.setProd_ctl_no                     (JSPUtil.getParameter(request, "prod_ctl_no                         ".trim(), ""));
            model.setBkg_no                          (JSPUtil.getParameter(request, "bkg_no                              ".trim(), ""));
            model.setBkg_no_split                    (JSPUtil.getParameter(request, "bkg_no_split                        ".trim(), ""));
            model.setPor_nod_cd                      (JSPUtil.getParameter(request, "por_nod_cd                          ".trim(), ""));
            model.setPol_cd                          (JSPUtil.getParameter(request, "pol_cd                              ".trim(), ""));
            model.setN1st_ts_port_cd                 (JSPUtil.getParameter(request, "n1st_ts_port_cd                     ".trim(), ""));
            model.setN2nd_ts_port_cd                 (JSPUtil.getParameter(request, "n2nd_ts_port_cd                     ".trim(), ""));
            model.setN3rd_ts_port_cd                 (JSPUtil.getParameter(request, "n3rd_ts_port_cd                     ".trim(), ""));
            model.setPod_cd                          (JSPUtil.getParameter(request, "pod_cd                              ".trim(), ""));
            model.setDel_nod_cd                      (JSPUtil.getParameter(request, "del_nod_cd                          ".trim(), ""));
            model.setTtl_tztm_dys                    (JSPUtil.getParameter(request, "ttl_tztm_dys                        ".trim(), ""));
            model.setTtl_tztm_hors                   (JSPUtil.getParameter(request, "ttl_tztm_hors                       ".trim(), ""));
            model.setProd_rev                        (JSPUtil.getParameter(request, "prod_rev                            ".trim(), ""));
            model.setTtl_expn_amt                    (JSPUtil.getParameter(request, "ttl_expn_amt                        ".trim(), ""));
            model.setCm_amt                          (JSPUtil.getParameter(request, "cm_amt                              ".trim(), ""));
            model.setTrnk_aval_teu_spc               (JSPUtil.getParameter(request, "trnk_aval_teu_spc                   ".trim(), ""));
            model.setBkg_sel_flg                     (JSPUtil.getParameter(request, "bkg_sel_flg                         ".trim(), ""));
            model.setCop_created_flag                (JSPUtil.getParameter(request, "cop_created_flag                    ".trim(), ""));
            model.setContainer_count                 (JSPUtil.getParameter(request, "container_count                     ".trim(), ""));
            model.setOutbound_interchange_content    (JSPUtil.getParameter(request, "outbound_interchange_content        ".trim(), ""));
            model.setInbound_interchange_content     (JSPUtil.getParameter(request, "inbound_interchange_content         ".trim(), ""));
            model.setCre_ofc_cd                      (JSPUtil.getParameter(request, "cre_ofc_cd                          ".trim(), ""));
            model.setCre_usr_id                      (JSPUtil.getParameter(request, "cre_usr_id                          ".trim(), ""));
            model.setCre_dt                          (JSPUtil.getParameter(request, "cre_dt                              ".trim(), ""));
            model.setUpd_usr_id                      (JSPUtil.getParameter(request, "upd_usr_id                          ".trim(), ""));
            model.setUpd_dt                          (JSPUtil.getParameter(request, "upd_dt                              ".trim(), ""));
            model.setCop_sel_flg                     (JSPUtil.getParameter(request, "cop_sel_flg                         ".trim(), ""));
            model.setCntr_knt                        (JSPUtil.getParameter(request, "cntr_knt                            ".trim(), ""));
            model.setOb_itchng_ctnt                  (JSPUtil.getParameter(request, "ob_itchng_ctnt                      ".trim(), ""));
            model.setIb_itchng_ctnt                  (JSPUtil.getParameter(request, "ib_itchng_ctnt                      ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_PROD_CTL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                       =  (JSPUtil.getParameter(request, "ibflag                              ".trim(), length));
            String[] page_rows                    =  (JSPUtil.getParameter(request, "page_rows                           ".trim(), length));
            String[] prod_ctl_no                  =  (JSPUtil.getParameter(request, "prod_ctl_no                         ".trim(), length));
            String[] bkg_no                       =  (JSPUtil.getParameter(request, "bkg_no                              ".trim(), length));
            String[] bkg_no_split                 =  (JSPUtil.getParameter(request, "bkg_no_split                        ".trim(), length));
            String[] por_nod_cd                   =  (JSPUtil.getParameter(request, "por_nod_cd                          ".trim(), length));
            String[] pol_cd                       =  (JSPUtil.getParameter(request, "pol_cd                              ".trim(), length));
            String[] n1st_ts_port_cd              =  (JSPUtil.getParameter(request, "n1st_ts_port_cd                     ".trim(), length));
            String[] n2nd_ts_port_cd              =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd                     ".trim(), length));
            String[] n3rd_ts_port_cd              =  (JSPUtil.getParameter(request, "n3rd_ts_port_cd                     ".trim(), length));
            String[] pod_cd                       =  (JSPUtil.getParameter(request, "pod_cd                              ".trim(), length));
            String[] del_nod_cd                   =  (JSPUtil.getParameter(request, "del_nod_cd                          ".trim(), length));
            String[] ttl_tztm_dys                 =  (JSPUtil.getParameter(request, "ttl_tztm_dys                        ".trim(), length));
            String[] ttl_tztm_hors                =  (JSPUtil.getParameter(request, "ttl_tztm_hors                       ".trim(), length));
            String[] prod_rev                     =  (JSPUtil.getParameter(request, "prod_rev                            ".trim(), length));
            String[] ttl_expn_amt                 =  (JSPUtil.getParameter(request, "ttl_expn_amt                        ".trim(), length));
            String[] cm_amt                       =  (JSPUtil.getParameter(request, "cm_amt                              ".trim(), length));
            String[] trnk_aval_teu_spc            =  (JSPUtil.getParameter(request, "trnk_aval_teu_spc                   ".trim(), length));
            String[] bkg_sel_flg                  =  (JSPUtil.getParameter(request, "bkg_sel_flg                         ".trim(), length));
            String[] cop_created_flag             =  (JSPUtil.getParameter(request, "cop_created_flag                    ".trim(), length));
            String[] container_count              =  (JSPUtil.getParameter(request, "container_count                     ".trim(), length));
            String[] outbound_interchange_content =  (JSPUtil.getParameter(request, "outbound_interchange_content        ".trim(), length));
            String[] inbound_interchange_content  =  (JSPUtil.getParameter(request, "inbound_interchange_content         ".trim(), length));
            String[] cre_ofc_cd                   =  (JSPUtil.getParameter(request, "cre_ofc_cd                          ".trim(), length));
            String[] cre_usr_id                   =  (JSPUtil.getParameter(request, "cre_usr_id                          ".trim(), length));
            String[] cre_dt                       =  (JSPUtil.getParameter(request, "cre_dt                              ".trim(), length));
            String[] upd_usr_id                   =  (JSPUtil.getParameter(request, "upd_usr_id                          ".trim(), length));
            String[] upd_dt                       =  (JSPUtil.getParameter(request, "upd_dt                              ".trim(), length));
            String[] cop_sel_flg                  =  (JSPUtil.getParameter(request, "cop_sel_flg                         ".trim(), length));
            String[] cntr_knt                     =  (JSPUtil.getParameter(request, "cntr_knt                            ".trim(), length));
            String[] ob_itchng_ctnt               =  (JSPUtil.getParameter(request, "ob_itchng_ctnt                      ".trim(), length));
            String[] ib_itchng_ctnt               =  (JSPUtil.getParameter(request, "ib_itchng_ctnt                      ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_PROD_CTL();
                model.setIbflag                                (ibflag                          [i]);
                model.setPage_rows                             (page_rows                       [i]);
                model.setProd_ctl_no                           (prod_ctl_no                     [i]);
                model.setBkg_no                                (bkg_no                          [i]);
                model.setBkg_no_split                          (bkg_no_split                    [i]);
                model.setPor_nod_cd                            (por_nod_cd                      [i]);
                model.setPol_cd                                (pol_cd                          [i]);
                model.setN1st_ts_port_cd                       (n1st_ts_port_cd                 [i]);
                model.setN2nd_ts_port_cd                       (n2nd_ts_port_cd                 [i]);
                model.setN3rd_ts_port_cd                       (n3rd_ts_port_cd                 [i]);
                model.setPod_cd                                (pod_cd                          [i]);
                model.setDel_nod_cd                            (del_nod_cd                      [i]);
                model.setTtl_tztm_dys                          (ttl_tztm_dys                    [i]);
                model.setTtl_tztm_hors                         (ttl_tztm_hors                   [i]);
                model.setProd_rev                              (prod_rev                        [i]);
                model.setTtl_expn_amt                          (ttl_expn_amt                    [i]);
                model.setCm_amt                                (cm_amt                          [i]);
                model.setTrnk_aval_teu_spc                     (trnk_aval_teu_spc               [i]);
                model.setBkg_sel_flg                           (bkg_sel_flg                     [i]);
                model.setCop_created_flag                      (cop_created_flag                [i]);
                model.setContainer_count                       (container_count                 [i]);
                model.setOutbound_interchange_content          (outbound_interchange_content    [i]);
                model.setInbound_interchange_content           (inbound_interchange_content     [i]);
                model.setCre_ofc_cd                            (cre_ofc_cd                      [i]);
                model.setCre_usr_id                            (cre_usr_id                      [i]);
                model.setCre_dt                                (cre_dt                          [i]);
                model.setUpd_usr_id                            (upd_usr_id                      [i]);
                model.setUpd_dt                                (upd_dt                          [i]);
                model.setCop_sel_flg                           (cop_sel_flg                     [i]);
                model.setCntr_knt                              (cntr_knt                        [i]);
                model.setOb_itchng_ctnt                        (ob_itchng_ctnt                  [i]);
                model.setIb_itchng_ctnt                        (ib_itchng_ctnt                  [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        PRD_PROD_CTL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                       =  (JSPUtil.getParameter(request, "ibflag                              ".trim(), length));
            String[] page_rows                    =  (JSPUtil.getParameter(request, "page_rows                           ".trim(), length));
            String[] prod_ctl_no                  =  (JSPUtil.getParameter(request, "prod_ctl_no                         ".trim(), length));
            String[] bkg_no                       =  (JSPUtil.getParameter(request, "bkg_no                              ".trim(), length));
            String[] bkg_no_split                 =  (JSPUtil.getParameter(request, "bkg_no_split                        ".trim(), length));
            String[] por_nod_cd                   =  (JSPUtil.getParameter(request, "por_nod_cd                          ".trim(), length));
            String[] pol_cd                       =  (JSPUtil.getParameter(request, "pol_cd                              ".trim(), length));
            String[] n1st_ts_port_cd              =  (JSPUtil.getParameter(request, "n1st_ts_port_cd                     ".trim(), length));
            String[] n2nd_ts_port_cd              =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd                     ".trim(), length));
            String[] n3rd_ts_port_cd              =  (JSPUtil.getParameter(request, "n3rd_ts_port_cd                     ".trim(), length));
            String[] pod_cd                       =  (JSPUtil.getParameter(request, "pod_cd                              ".trim(), length));
            String[] del_nod_cd                   =  (JSPUtil.getParameter(request, "del_nod_cd                          ".trim(), length));
            String[] ttl_tztm_dys                 =  (JSPUtil.getParameter(request, "ttl_tztm_dys                        ".trim(), length));
            String[] ttl_tztm_hors                =  (JSPUtil.getParameter(request, "ttl_tztm_hors                       ".trim(), length));
            String[] prod_rev                     =  (JSPUtil.getParameter(request, "prod_rev                            ".trim(), length));
            String[] ttl_expn_amt                 =  (JSPUtil.getParameter(request, "ttl_expn_amt                        ".trim(), length));
            String[] cm_amt                       =  (JSPUtil.getParameter(request, "cm_amt                              ".trim(), length));
            String[] trnk_aval_teu_spc            =  (JSPUtil.getParameter(request, "trnk_aval_teu_spc                   ".trim(), length));
            String[] bkg_sel_flg                  =  (JSPUtil.getParameter(request, "bkg_sel_flg                         ".trim(), length));
            String[] cop_created_flag             =  (JSPUtil.getParameter(request, "cop_created_flag                    ".trim(), length));
            String[] container_count              =  (JSPUtil.getParameter(request, "container_count                     ".trim(), length));
            String[] outbound_interchange_content =  (JSPUtil.getParameter(request, "outbound_interchange_content        ".trim(), length));
            String[] inbound_interchange_content  =  (JSPUtil.getParameter(request, "inbound_interchange_content         ".trim(), length));
            String[] cre_ofc_cd                   =  (JSPUtil.getParameter(request, "cre_ofc_cd                          ".trim(), length));
            String[] cre_usr_id                   =  (JSPUtil.getParameter(request, "cre_usr_id                          ".trim(), length));
            String[] cre_dt                       =  (JSPUtil.getParameter(request, "cre_dt                              ".trim(), length));
            String[] upd_usr_id                   =  (JSPUtil.getParameter(request, "upd_usr_id                          ".trim(), length));
            String[] upd_dt                       =  (JSPUtil.getParameter(request, "upd_dt                              ".trim(), length));
            String[] cop_sel_flg                  =  (JSPUtil.getParameter(request, "cop_sel_flg                         ".trim(), length));
            String[] cntr_knt                     =  (JSPUtil.getParameter(request, "cntr_knt                            ".trim(), length));
            String[] ob_itchng_ctnt               =  (JSPUtil.getParameter(request, "ob_itchng_ctnt                      ".trim(), length));
            String[] ib_itchng_ctnt               =  (JSPUtil.getParameter(request, "ib_itchng_ctnt                      ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_PROD_CTL();
                model.setIbflag                                (ibflag                          [i]);
                model.setPage_rows                             (page_rows                       [i]);
                model.setProd_ctl_no                           (prod_ctl_no                     [i]);
                model.setBkg_no                                (bkg_no                          [i]);
                model.setBkg_no_split                          (bkg_no_split                    [i]);
                model.setPor_nod_cd                            (por_nod_cd                      [i]);
                model.setPol_cd                                (pol_cd                          [i]);
                model.setN1st_ts_port_cd                       (n1st_ts_port_cd                 [i]);
                model.setN2nd_ts_port_cd                       (n2nd_ts_port_cd                 [i]);
                model.setN3rd_ts_port_cd                       (n3rd_ts_port_cd                 [i]);
                model.setPod_cd                                (pod_cd                          [i]);
                model.setDel_nod_cd                            (del_nod_cd                      [i]);
                model.setTtl_tztm_dys                          (ttl_tztm_dys                    [i]);
                model.setTtl_tztm_hors                         (ttl_tztm_hors                   [i]);
                model.setProd_rev                              (prod_rev                        [i]);
                model.setTtl_expn_amt                          (ttl_expn_amt                    [i]);
                model.setCm_amt                                (cm_amt                          [i]);
                model.setTrnk_aval_teu_spc                     (trnk_aval_teu_spc               [i]);
                model.setBkg_sel_flg                           (bkg_sel_flg                     [i]);
                model.setCop_created_flag                      (cop_created_flag                [i]);
                model.setContainer_count                       (container_count                 [i]);
                model.setOutbound_interchange_content          (outbound_interchange_content    [i]);
                model.setInbound_interchange_content           (inbound_interchange_content     [i]);
                model.setCre_ofc_cd                            (cre_ofc_cd                      [i]);
                model.setCre_usr_id                            (cre_usr_id                      [i]);
                model.setCre_dt                                (cre_dt                          [i]);
                model.setUpd_usr_id                            (upd_usr_id                      [i]);
                model.setUpd_dt                                (upd_dt                          [i]);
                model.setCop_sel_flg                           (cop_sel_flg                     [i]);
                model.setCntr_knt                              (cntr_knt                        [i]);
                model.setOb_itchng_ctnt                        (ob_itchng_ctnt                  [i]);
                model.setIb_itchng_ctnt                        (ib_itchng_ctnt                  [i]);
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
