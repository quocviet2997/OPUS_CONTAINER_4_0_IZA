/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PEP_PORT_TRF_INFO.java
*@FileTitle : Port Tariff
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-19
*@LastModifier : choyoungjin
*@LastVersion : 1.0
* 2006-08-19 choyoungjin
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
 * @author choyoungjin
 * @since J2EE 1.4
 */public final class PEP_PORT_TRF_INFO implements java.io.Serializable {

    private String              ibflag              = "";
    private String              page_rows           = "";
    private String              port_cd             = "";
    private String              iss_dt              = "";
    private String              port_seq            = "";
    private String              port_nm             = "";
    private String              blk_biz_ut_cd       = "";
    private String              cnt_cd              = "";
    private String              cnt_nm              = "";
    private String              crr_tp_nm           = "";
    private String              vsl_sz_nm           = "";
    private String              port_trf_ctnt       = "";
    private String              port_trf_src_ctnt   = "";
    private String              port_trf_url        = "";
    private String              port_trf_dtl_ctnt   = "";
    private String              n1st_file_atch_nm   = "";
    private String              n2nd_file_atch_nm   = "";
    private String              n3rd_file_atch_nm   = "";
    private String              team_cd             = "";
    private String              inv_blk_team_div_cd = "";
    private String              blk_inv_tp_cd       = "";
    private String              inv_yr              = "";
    private String              inv_seq             = "";
    private String              vsl_cd              = "";
    private String              vsl_nm              = "";
    private String              cty_cd              = "";
    private String              cre_usr_id          = "";
    private String              cre_usr_nm          = "";
    private String              cre_dt              = "";
    private String              upd_usr_id          = "";
    private String              upd_dt              = "";

    public PEP_PORT_TRF_INFO(){}

    public PEP_PORT_TRF_INFO(
            String              ibflag             ,
            String              page_rows          ,
            String              port_cd            ,
            String              iss_dt             ,
            String              port_seq           ,
            String              port_nm            ,
            String              blk_biz_ut_cd      ,
            String              cnt_cd             ,
            String              cnt_nm             ,
            String              crr_tp_nm          ,
            String              vsl_sz_nm          ,
            String              port_trf_ctnt      ,
            String              port_trf_src_ctnt  ,
            String              port_trf_url       ,
            String              port_trf_dtl_ctnt  ,
            String              n1st_file_atch_nm  ,
            String              n2nd_file_atch_nm  ,
            String              n3rd_file_atch_nm  ,
            String              team_cd            ,
            String              inv_blk_team_div_cd,
            String              blk_inv_tp_cd      ,
            String              inv_yr             ,
            String              inv_seq            ,
            String              vsl_cd             ,
            String              vsl_nm             ,
            String              cty_cd             ,
            String              cre_usr_id         ,
            String              cre_usr_nm         ,
            String              cre_dt             ,
            String              upd_usr_id         ,
            String              upd_dt             ){
        this.ibflag              = ibflag             ;
        this.page_rows           = page_rows          ;
        this.port_cd             = port_cd            ;
        this.iss_dt              = iss_dt             ;
        this.port_seq            = port_seq           ;
        this.port_nm             = port_nm            ;
        this.blk_biz_ut_cd       = blk_biz_ut_cd      ;
        this.cnt_cd              = cnt_cd             ;
        this.cnt_nm              = cnt_nm             ;
        this.crr_tp_nm           = crr_tp_nm          ;
        this.vsl_sz_nm           = vsl_sz_nm          ;
        this.port_trf_ctnt       = port_trf_ctnt      ;
        this.port_trf_src_ctnt   = port_trf_src_ctnt  ;
        this.port_trf_url        = port_trf_url       ;
        this.port_trf_dtl_ctnt   = port_trf_dtl_ctnt  ;
        this.n1st_file_atch_nm   = n1st_file_atch_nm  ;
        this.n2nd_file_atch_nm   = n2nd_file_atch_nm  ;
        this.n3rd_file_atch_nm   = n3rd_file_atch_nm  ;
        this.team_cd             = team_cd            ;
        this.inv_blk_team_div_cd = inv_blk_team_div_cd;
        this.blk_inv_tp_cd       = blk_inv_tp_cd      ;
        this.inv_yr              = inv_yr             ;
        this.inv_seq             = inv_seq            ;
        this.vsl_cd              = vsl_cd             ;
        this.vsl_nm              = vsl_nm             ;
        this.cty_cd              = cty_cd             ;
        this.cre_usr_id          = cre_usr_id         ;
        this.cre_usr_nm          = cre_usr_nm         ;
        this.cre_dt              = cre_dt             ;
        this.upd_usr_id          = upd_usr_id         ;
        this.upd_dt              = upd_dt             ;
    }

    // getter method is proceeding ..
    public String              getIbflag             (){    return ibflag                 ;    }
    public String              getPage_rows          (){    return page_rows              ;    }
    public String              getPort_cd            (){    return port_cd                ;    }
    public String              getIss_dt             (){    return iss_dt                 ;    }
    public String              getPort_seq           (){    return port_seq               ;    }
    public String              getPort_nm            (){    return port_nm                ;    }
    public String              getBlk_biz_ut_cd      (){    return blk_biz_ut_cd          ;    }
    public String              getCnt_cd             (){    return cnt_cd                 ;    }
    public String              getCnt_nm             (){    return cnt_nm                 ;    }
    public String              getCrr_tp_nm          (){    return crr_tp_nm              ;    }
    public String              getVsl_sz_nm          (){    return vsl_sz_nm              ;    }
    public String              getPort_trf_ctnt      (){    return port_trf_ctnt          ;    }
    public String              getPort_trf_src_ctnt  (){    return port_trf_src_ctnt      ;    }
    public String              getPort_trf_url       (){    return port_trf_url           ;    }
    public String              getPort_trf_dtl_ctnt  (){    return port_trf_dtl_ctnt      ;    }
    public String              getN1st_file_atch_nm  (){    return n1st_file_atch_nm      ;    }
    public String              getN2nd_file_atch_nm  (){    return n2nd_file_atch_nm      ;    }
    public String              getN3rd_file_atch_nm  (){    return n3rd_file_atch_nm      ;    }
    public String              getTeam_cd            (){    return team_cd                ;    }
    public String              getInv_blk_team_div_cd(){    return inv_blk_team_div_cd    ;    }
    public String              getBlk_inv_tp_cd      (){    return blk_inv_tp_cd          ;    }
    public String              getInv_yr             (){    return inv_yr                 ;    }
    public String              getInv_seq            (){    return inv_seq                ;    }
    public String              getVsl_cd             (){    return vsl_cd                 ;    }
    public String              getVsl_nm             (){    return vsl_nm                 ;    }
    public String              getCty_cd             (){    return cty_cd                 ;    }
    public String              getCre_usr_id         (){    return cre_usr_id             ;    }
    public String              getCre_usr_nm         (){    return cre_usr_nm             ;    }
    public String              getCre_dt             (){    return cre_dt                 ;    }
    public String              getUpd_usr_id         (){    return upd_usr_id             ;    }
    public String              getUpd_dt             (){    return upd_dt                 ;    }

    // setter method is proceeding ..
    public void setIbflag             ( String              ibflag              ){    this.ibflag              = ibflag                 ;    }
    public void setPage_rows          ( String              page_rows           ){    this.page_rows           = page_rows              ;    }
    public void setPort_cd            ( String              port_cd             ){    this.port_cd             = port_cd                ;    }
    public void setIss_dt             ( String              iss_dt              ){    this.iss_dt              = iss_dt                 ;    }
    public void setPort_seq           ( String              port_seq            ){    this.port_seq            = port_seq               ;    }
    public void setPort_nm            ( String              port_nm             ){    this.port_nm             = port_nm                ;    }
    public void setBlk_biz_ut_cd      ( String              blk_biz_ut_cd       ){    this.blk_biz_ut_cd       = blk_biz_ut_cd          ;    }
    public void setCnt_cd             ( String              cnt_cd              ){    this.cnt_cd              = cnt_cd                 ;    }
    public void setCnt_nm             ( String              cnt_nm              ){    this.cnt_nm              = cnt_nm                 ;    }
    public void setCrr_tp_nm          ( String              crr_tp_nm           ){    this.crr_tp_nm           = crr_tp_nm              ;    }
    public void setVsl_sz_nm          ( String              vsl_sz_nm           ){    this.vsl_sz_nm           = vsl_sz_nm              ;    }
    public void setPort_trf_ctnt      ( String              port_trf_ctnt       ){    this.port_trf_ctnt       = port_trf_ctnt          ;    }
    public void setPort_trf_src_ctnt  ( String              port_trf_src_ctnt   ){    this.port_trf_src_ctnt   = port_trf_src_ctnt      ;    }
    public void setPort_trf_url       ( String              port_trf_url        ){    this.port_trf_url        = port_trf_url           ;    }
    public void setPort_trf_dtl_ctnt  ( String              port_trf_dtl_ctnt   ){    this.port_trf_dtl_ctnt   = port_trf_dtl_ctnt      ;    }
    public void setN1st_file_atch_nm  ( String              n1st_file_atch_nm   ){    this.n1st_file_atch_nm   = n1st_file_atch_nm      ;    }
    public void setN2nd_file_atch_nm  ( String              n2nd_file_atch_nm   ){    this.n2nd_file_atch_nm   = n2nd_file_atch_nm      ;    }
    public void setN3rd_file_atch_nm  ( String              n3rd_file_atch_nm   ){    this.n3rd_file_atch_nm   = n3rd_file_atch_nm      ;    }
    public void setTeam_cd            ( String              team_cd             ){    this.team_cd             = team_cd                ;    }
    public void setInv_blk_team_div_cd( String              inv_blk_team_div_cd ){    this.inv_blk_team_div_cd = inv_blk_team_div_cd    ;    }
    public void setBlk_inv_tp_cd      ( String              blk_inv_tp_cd       ){    this.blk_inv_tp_cd       = blk_inv_tp_cd          ;    }
    public void setInv_yr             ( String              inv_yr              ){    this.inv_yr              = inv_yr                 ;    }
    public void setInv_seq            ( String              inv_seq             ){    this.inv_seq             = inv_seq                ;    }
    public void setVsl_cd             ( String              vsl_cd              ){    this.vsl_cd              = vsl_cd                 ;    }
    public void setVsl_nm             ( String              vsl_nm              ){    this.vsl_nm              = vsl_nm                 ;    }
    public void setCty_cd             ( String              cty_cd              ){    this.cty_cd              = cty_cd                 ;    }
    public void setCre_usr_id         ( String              cre_usr_id          ){    this.cre_usr_id          = cre_usr_id             ;    }
    public void setCre_usr_nm         ( String              cre_usr_nm          ){    this.cre_usr_nm          = cre_usr_nm             ;    }
    public void setCre_dt             ( String              cre_dt              ){    this.cre_dt              = cre_dt                 ;    }
    public void setUpd_usr_id         ( String              upd_usr_id          ){    this.upd_usr_id          = upd_usr_id             ;    }
    public void setUpd_dt             ( String              upd_dt              ){    this.upd_dt              = upd_dt                 ;    }

    public static PEP_PORT_TRF_INFO fromRequest(HttpServletRequest request) {
        PEP_PORT_TRF_INFO model = new PEP_PORT_TRF_INFO();
        try {
            model.setIbflag                 (JSPUtil.getParameter(request, "ibflag                     ".trim(), ""));
            model.setPage_rows              (JSPUtil.getParameter(request, "page_rows                  ".trim(), ""));
            model.setPort_cd                (JSPUtil.getParameter(request, "port_cd                    ".trim(), ""));
            model.setIss_dt                 (JSPUtil.getParameter(request, "iss_dt                     ".trim(), ""));
            model.setPort_seq               (JSPUtil.getParameter(request, "port_seq                   ".trim(), ""));
            model.setPort_nm                (JSPUtil.getParameter(request, "port_nm                    ".trim(), ""));
            model.setBlk_biz_ut_cd          (JSPUtil.getParameter(request, "blk_biz_ut_cd              ".trim(), ""));
            model.setCnt_cd                 (JSPUtil.getParameter(request, "cnt_cd                     ".trim(), ""));
            model.setCnt_nm                 (JSPUtil.getParameter(request, "cnt_nm                     ".trim(), ""));
            model.setCrr_tp_nm              (JSPUtil.getParameter(request, "crr_tp_nm                  ".trim(), ""));
            model.setVsl_sz_nm              (JSPUtil.getParameter(request, "vsl_sz_nm                  ".trim(), ""));
            model.setPort_trf_ctnt          (JSPUtil.getParameter(request, "port_trf_ctnt              ".trim(), ""));
            model.setPort_trf_src_ctnt      (JSPUtil.getParameter(request, "port_trf_src_ctnt          ".trim(), ""));
            model.setPort_trf_url           (JSPUtil.getParameter(request, "port_trf_url               ".trim(), ""));
            model.setPort_trf_dtl_ctnt      (JSPUtil.getParameter(request, "port_trf_dtl_ctnt          ".trim(), ""));
            model.setN1st_file_atch_nm      (JSPUtil.getParameter(request, "n1st_file_atch_nm          ".trim(), ""));
            model.setN2nd_file_atch_nm      (JSPUtil.getParameter(request, "n2nd_file_atch_nm          ".trim(), ""));
            model.setN3rd_file_atch_nm      (JSPUtil.getParameter(request, "n3rd_file_atch_nm          ".trim(), ""));
            model.setTeam_cd                (JSPUtil.getParameter(request, "team_cd                    ".trim(), ""));
            model.setInv_blk_team_div_cd    (JSPUtil.getParameter(request, "inv_blk_team_div_cd        ".trim(), ""));
            model.setBlk_inv_tp_cd          (JSPUtil.getParameter(request, "blk_inv_tp_cd              ".trim(), ""));
            model.setInv_yr                 (JSPUtil.getParameter(request, "inv_yr                     ".trim(), ""));
            model.setInv_seq                (JSPUtil.getParameter(request, "inv_seq                    ".trim(), ""));
            model.setVsl_cd                 (JSPUtil.getParameter(request, "vsl_cd                     ".trim(), ""));
            model.setVsl_nm                 (JSPUtil.getParameter(request, "vsl_nm                     ".trim(), ""));
            model.setCty_cd                 (JSPUtil.getParameter(request, "cty_cd                     ".trim(), ""));
            model.setCre_usr_id             (JSPUtil.getParameter(request, "cre_usr_id                 ".trim(), ""));
            model.setCre_usr_nm             (JSPUtil.getParameter(request, "cre_usr_nm                 ".trim(), ""));
            model.setCre_dt                 (JSPUtil.getParameter(request, "cre_dt                     ".trim(), ""));
            model.setUpd_usr_id             (JSPUtil.getParameter(request, "upd_usr_id                 ".trim(), ""));
            model.setUpd_dt                 (JSPUtil.getParameter(request, "upd_dt                     ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PEP_PORT_TRF_INFO model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag              =  (JSPUtil.getParameter(request, "ibflag                     ".trim(), length));
            String[] page_rows           =  (JSPUtil.getParameter(request, "page_rows                  ".trim(), length));
            String[] port_cd             =  (JSPUtil.getParameter(request, "port_cd                    ".trim(), length));
            String[] iss_dt              =  (JSPUtil.getParameter(request, "iss_dt                     ".trim(), length));
            String[] port_seq            =  (JSPUtil.getParameter(request, "port_seq                   ".trim(), length));
            String[] port_nm             =  (JSPUtil.getParameter(request, "port_nm                    ".trim(), length));
            String[] blk_biz_ut_cd       =  (JSPUtil.getParameter(request, "blk_biz_ut_cd              ".trim(), length));
            String[] cnt_cd              =  (JSPUtil.getParameter(request, "cnt_cd                     ".trim(), length));
            String[] cnt_nm              =  (JSPUtil.getParameter(request, "cnt_nm                     ".trim(), length));
            String[] crr_tp_nm           =  (JSPUtil.getParameter(request, "crr_tp_nm                  ".trim(), length));
            String[] vsl_sz_nm           =  (JSPUtil.getParameter(request, "vsl_sz_nm                  ".trim(), length));
            String[] port_trf_ctnt       =  (JSPUtil.getParameter(request, "port_trf_ctnt              ".trim(), length));
            String[] port_trf_src_ctnt   =  (JSPUtil.getParameter(request, "port_trf_src_ctnt          ".trim(), length));
            String[] port_trf_url        =  (JSPUtil.getParameter(request, "port_trf_url               ".trim(), length));
            String[] port_trf_dtl_ctnt   =  (JSPUtil.getParameter(request, "port_trf_dtl_ctnt          ".trim(), length));
            String[] n1st_file_atch_nm   =  (JSPUtil.getParameter(request, "n1st_file_atch_nm          ".trim(), length));
            String[] n2nd_file_atch_nm   =  (JSPUtil.getParameter(request, "n2nd_file_atch_nm          ".trim(), length));
            String[] n3rd_file_atch_nm   =  (JSPUtil.getParameter(request, "n3rd_file_atch_nm          ".trim(), length));
            String[] team_cd             =  (JSPUtil.getParameter(request, "team_cd                    ".trim(), length));
            String[] inv_blk_team_div_cd =  (JSPUtil.getParameter(request, "inv_blk_team_div_cd        ".trim(), length));
            String[] blk_inv_tp_cd       =  (JSPUtil.getParameter(request, "blk_inv_tp_cd              ".trim(), length));
            String[] inv_yr              =  (JSPUtil.getParameter(request, "inv_yr                     ".trim(), length));
            String[] inv_seq             =  (JSPUtil.getParameter(request, "inv_seq                    ".trim(), length));
            String[] vsl_cd              =  (JSPUtil.getParameter(request, "vsl_cd                     ".trim(), length));
            String[] vsl_nm              =  (JSPUtil.getParameter(request, "vsl_nm                     ".trim(), length));
            String[] cty_cd              =  (JSPUtil.getParameter(request, "cty_cd                     ".trim(), length));
            String[] cre_usr_id          =  (JSPUtil.getParameter(request, "cre_usr_id                 ".trim(), length));
            String[] cre_usr_nm          =  (JSPUtil.getParameter(request, "cre_usr_nm                 ".trim(), length));
            String[] cre_dt              =  (JSPUtil.getParameter(request, "cre_dt                     ".trim(), length));
            String[] upd_usr_id          =  (JSPUtil.getParameter(request, "upd_usr_id                 ".trim(), length));
            String[] upd_dt              =  (JSPUtil.getParameter(request, "upd_dt                     ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PEP_PORT_TRF_INFO();
                model.setIbflag                       (ibflag                 [i]);
                model.setPage_rows                    (page_rows              [i]);
                model.setPort_cd                      (port_cd                [i]);
                model.setIss_dt                       (iss_dt                 [i]);
                model.setPort_seq                     (port_seq               [i]);
                model.setPort_nm                      (port_nm                [i]);
                model.setBlk_biz_ut_cd                (blk_biz_ut_cd          [i]);
                model.setCnt_cd                       (cnt_cd                 [i]);
                model.setCnt_nm                       (cnt_nm                 [i]);
                model.setCrr_tp_nm                    (crr_tp_nm              [i]);
                model.setVsl_sz_nm                    (vsl_sz_nm              [i]);
                model.setPort_trf_ctnt                (port_trf_ctnt          [i]);
                model.setPort_trf_src_ctnt            (port_trf_src_ctnt      [i]);
                model.setPort_trf_url                 (port_trf_url           [i]);
                model.setPort_trf_dtl_ctnt            (port_trf_dtl_ctnt      [i]);
                model.setN1st_file_atch_nm            (n1st_file_atch_nm      [i]);
                model.setN2nd_file_atch_nm            (n2nd_file_atch_nm      [i]);
                model.setN3rd_file_atch_nm            (n3rd_file_atch_nm      [i]);
                model.setTeam_cd                      (team_cd                [i]);
                model.setInv_blk_team_div_cd          (inv_blk_team_div_cd    [i]);
                model.setBlk_inv_tp_cd                (blk_inv_tp_cd          [i]);
                model.setInv_yr                       (inv_yr                 [i]);
                model.setInv_seq                      (inv_seq                [i]);
                model.setVsl_cd                       (vsl_cd                 [i]);
                model.setVsl_nm                       (vsl_nm                 [i]);
                model.setCty_cd                       (cty_cd                 [i]);
                model.setCre_usr_id                   (cre_usr_id             [i]);
                model.setCre_usr_nm                   (cre_usr_nm             [i]);
                model.setCre_dt                       (cre_dt                 [i]);
                model.setUpd_usr_id                   (upd_usr_id             [i]);
                model.setUpd_dt                       (upd_dt                 [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        PEP_PORT_TRF_INFO model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag                     ".trim(), length));
            String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows                  ".trim(), length));
            String[] port_cd             =  (JSPUtil.getParameter(request, prefix + "port_cd                    ".trim(), length));
            String[] iss_dt              =  (JSPUtil.getParameter(request, prefix + "iss_dt                     ".trim(), length));
            String[] port_seq            =  (JSPUtil.getParameter(request, prefix + "port_seq                   ".trim(), length));
            String[] port_nm             =  (JSPUtil.getParameter(request, prefix + "port_nm                    ".trim(), length));
            String[] blk_biz_ut_cd       =  (JSPUtil.getParameter(request, prefix + "blk_biz_ut_cd              ".trim(), length));
            String[] cnt_cd              =  (JSPUtil.getParameter(request, prefix + "cnt_cd                     ".trim(), length));
            String[] cnt_nm              =  (JSPUtil.getParameter(request, prefix + "cnt_nm                     ".trim(), length));
            String[] crr_tp_nm           =  (JSPUtil.getParameter(request, prefix + "crr_tp_nm                  ".trim(), length));
            String[] vsl_sz_nm           =  (JSPUtil.getParameter(request, prefix + "vsl_sz_nm                  ".trim(), length));
            String[] port_trf_ctnt       =  (JSPUtil.getParameter(request, prefix + "port_trf_ctnt              ".trim(), length));
            String[] port_trf_src_ctnt   =  (JSPUtil.getParameter(request, prefix + "port_trf_src_ctnt          ".trim(), length));
            String[] port_trf_url        =  (JSPUtil.getParameter(request, prefix + "port_trf_url               ".trim(), length));
            String[] port_trf_dtl_ctnt   =  (JSPUtil.getParameter(request, prefix + "port_trf_dtl_ctnt          ".trim(), length));
            String[] n1st_file_atch_nm   =  (JSPUtil.getParameter(request, prefix + "n1st_file_atch_nm          ".trim(), length));
            String[] n2nd_file_atch_nm   =  (JSPUtil.getParameter(request, prefix + "n2nd_file_atch_nm          ".trim(), length));
            String[] n3rd_file_atch_nm   =  (JSPUtil.getParameter(request, prefix + "n3rd_file_atch_nm          ".trim(), length));
            String[] team_cd             =  (JSPUtil.getParameter(request, prefix + "team_cd                    ".trim(), length));
            String[] inv_blk_team_div_cd =  (JSPUtil.getParameter(request, prefix + "inv_blk_team_div_cd        ".trim(), length));
            String[] blk_inv_tp_cd       =  (JSPUtil.getParameter(request, prefix + "blk_inv_tp_cd              ".trim(), length));
            String[] inv_yr              =  (JSPUtil.getParameter(request, prefix + "inv_yr                     ".trim(), length));
            String[] inv_seq             =  (JSPUtil.getParameter(request, prefix + "inv_seq                    ".trim(), length));
            String[] vsl_cd              =  (JSPUtil.getParameter(request, prefix + "vsl_cd                     ".trim(), length));
            String[] vsl_nm              =  (JSPUtil.getParameter(request, prefix + "vsl_nm                     ".trim(), length));
            String[] cty_cd              =  (JSPUtil.getParameter(request, prefix + "cty_cd                     ".trim(), length));
            String[] cre_usr_id          =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                 ".trim(), length));
            String[] cre_usr_nm          =  (JSPUtil.getParameter(request, prefix + "cre_usr_nm                 ".trim(), length));
            String[] cre_dt              =  (JSPUtil.getParameter(request, prefix + "cre_dt                     ".trim(), length));
            String[] upd_usr_id          =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                 ".trim(), length));
            String[] upd_dt              =  (JSPUtil.getParameter(request, prefix + "upd_dt                     ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PEP_PORT_TRF_INFO();
                model.setIbflag                       ( ibflag                 [i]);
                model.setPage_rows                    ( page_rows              [i]);
                model.setPort_cd                      ( port_cd                [i]);
                model.setIss_dt                       ( iss_dt                 [i]);
                model.setPort_seq                     ( port_seq               [i]);
                model.setPort_nm                      ( port_nm                [i]);
                model.setBlk_biz_ut_cd                ( blk_biz_ut_cd          [i]);
                model.setCnt_cd                       ( cnt_cd                 [i]);
                model.setCnt_nm                       ( cnt_nm                 [i]);
                model.setCrr_tp_nm                    ( crr_tp_nm              [i]);
                model.setVsl_sz_nm                    ( vsl_sz_nm              [i]);
                model.setPort_trf_ctnt                ( port_trf_ctnt          [i]);
                model.setPort_trf_src_ctnt            ( port_trf_src_ctnt      [i]);
                model.setPort_trf_url                 ( port_trf_url           [i]);
                model.setPort_trf_dtl_ctnt            ( port_trf_dtl_ctnt      [i]);
                model.setN1st_file_atch_nm            ( n1st_file_atch_nm      [i]);
                model.setN2nd_file_atch_nm            ( n2nd_file_atch_nm      [i]);
                model.setN3rd_file_atch_nm            ( n3rd_file_atch_nm      [i]);
                model.setTeam_cd                      ( team_cd                [i]);
                model.setInv_blk_team_div_cd          ( inv_blk_team_div_cd    [i]);
                model.setBlk_inv_tp_cd                ( blk_inv_tp_cd          [i]);
                model.setInv_yr                       ( inv_yr                 [i]);
                model.setInv_seq                      ( inv_seq                [i]);
                model.setVsl_cd                       ( vsl_cd                 [i]);
                model.setVsl_nm                       ( vsl_nm                 [i]);
                model.setCty_cd                       ( cty_cd                 [i]);
                model.setCre_usr_id                   ( cre_usr_id             [i]);
                model.setCre_usr_nm                   ( cre_usr_nm             [i]);
                model.setCre_dt                       ( cre_dt                 [i]);
                model.setUpd_usr_id                   ( upd_usr_id             [i]);
                model.setUpd_dt                       ( upd_dt                 [i]);
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
