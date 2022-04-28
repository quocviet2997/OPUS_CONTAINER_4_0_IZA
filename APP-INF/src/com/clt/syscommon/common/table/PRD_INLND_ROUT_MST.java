/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_INLND_ROUT_MST.java
*@FileTitle : Inland Route 정보관리화면
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-04
*@LastModifier : jungsunyong
*@LastVersion : 1.0
* 2006-09-04 jungsunyong
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
 * @author jungsunyong
 * @since J2EE 1.4
 */public final class PRD_INLND_ROUT_MST implements java.io.Serializable {

    private String                     ibflag                     = "";
    private String                     page_rows                  = "";
    private String                     rout_org_nod_cd            = "";
    private String                     rout_dest_nod_cd           = "";
    private String                     rout_seq                   = "";
    private String                     prio_seq                   = "";
    private String                     inlnd_rout_inv_bil_patt_cd = "";
    private String                     rout_pln_cd                = "";
    private String                     web_rail_sys_flg           = "";
    private String                     mty_cntr_rout_flg          = "";
    private String                     inlnd_rout_rmk             = "";
    private String                     delt_flg                   = "";
    private String                     cre_ofc_cd                 = "";
    private String                     cre_usr_id                 = "";
    private String                     cre_dt                     = "";
    private String                     upd_usr_id                 = "";
    private String                     upd_dt                     = "";

    public PRD_INLND_ROUT_MST(){}

    public PRD_INLND_ROUT_MST(
            String                     ibflag                    ,
            String                     page_rows                 ,
            String                     rout_org_nod_cd           ,
            String                     rout_dest_nod_cd          ,
            String                     rout_seq                  ,
            String                     prio_seq                  ,
            String                     inlnd_rout_inv_bil_patt_cd,
            String                     rout_pln_cd               ,
            String                     web_rail_sys_flg          ,
            String                     mty_cntr_rout_flg         ,
            String                     inlnd_rout_rmk            ,
            String                     delt_flg                  ,
            String                     cre_ofc_cd                ,
            String                     cre_usr_id                ,
            String                     cre_dt                    ,
            String                     upd_usr_id                ,
            String                     upd_dt                    ){
        this.ibflag                     = ibflag                    ;
        this.page_rows                  = page_rows                 ;
        this.rout_org_nod_cd            = rout_org_nod_cd           ;
        this.rout_dest_nod_cd           = rout_dest_nod_cd          ;
        this.rout_seq                   = rout_seq                  ;
        this.prio_seq                   = prio_seq                  ;
        this.inlnd_rout_inv_bil_patt_cd = inlnd_rout_inv_bil_patt_cd;
        this.rout_pln_cd                = rout_pln_cd               ;
        this.web_rail_sys_flg           = web_rail_sys_flg          ;
        this.mty_cntr_rout_flg          = mty_cntr_rout_flg         ;
        this.inlnd_rout_rmk             = inlnd_rout_rmk            ;
        this.delt_flg                   = delt_flg                  ;
        this.cre_ofc_cd                 = cre_ofc_cd                ;
        this.cre_usr_id                 = cre_usr_id                ;
        this.cre_dt                     = cre_dt                    ;
        this.upd_usr_id                 = upd_usr_id                ;
        this.upd_dt                     = upd_dt                    ;
    }

    // getter method is proceeding ..
    public String                     getIbflag                    (){    return ibflag                        ;    }
    public String                     getPage_rows                 (){    return page_rows                     ;    }
    public String                     getRout_org_nod_cd           (){    return rout_org_nod_cd               ;    }
    public String                     getRout_dest_nod_cd          (){    return rout_dest_nod_cd              ;    }
    public String                     getRout_seq                  (){    return rout_seq                      ;    }
    public String                     getPrio_seq                  (){    return prio_seq                      ;    }
    public String                     getInlnd_rout_inv_bil_patt_cd(){    return inlnd_rout_inv_bil_patt_cd    ;    }
    public String                     getRout_pln_cd               (){    return rout_pln_cd                   ;    }
    public String                     getWeb_rail_sys_flg          (){    return web_rail_sys_flg              ;    }
    public String                     getMty_cntr_rout_flg         (){    return mty_cntr_rout_flg             ;    }
    public String                     getInlnd_rout_rmk            (){    return inlnd_rout_rmk                ;    }
    public String                     getDelt_flg                  (){    return delt_flg                      ;    }
    public String                     getCre_ofc_cd                (){    return cre_ofc_cd                    ;    }
    public String                     getCre_usr_id                (){    return cre_usr_id                    ;    }
    public String                     getCre_dt                    (){    return cre_dt                        ;    }
    public String                     getUpd_usr_id                (){    return upd_usr_id                    ;    }
    public String                     getUpd_dt                    (){    return upd_dt                        ;    }

    // setter method is proceeding ..
    public void setIbflag                    ( String                     ibflag                     ){    this.ibflag                     = ibflag                        ;    }
    public void setPage_rows                 ( String                     page_rows                  ){    this.page_rows                  = page_rows                     ;    }
    public void setRout_org_nod_cd           ( String                     rout_org_nod_cd            ){    this.rout_org_nod_cd            = rout_org_nod_cd               ;    }
    public void setRout_dest_nod_cd          ( String                     rout_dest_nod_cd           ){    this.rout_dest_nod_cd           = rout_dest_nod_cd              ;    }
    public void setRout_seq                  ( String                     rout_seq                   ){    this.rout_seq                   = rout_seq                      ;    }
    public void setPrio_seq                  ( String                     prio_seq                   ){    this.prio_seq                   = prio_seq                      ;    }
    public void setInlnd_rout_inv_bil_patt_cd( String                     inlnd_rout_inv_bil_patt_cd ){    this.inlnd_rout_inv_bil_patt_cd = inlnd_rout_inv_bil_patt_cd    ;    }
    public void setRout_pln_cd               ( String                     rout_pln_cd                ){    this.rout_pln_cd                = rout_pln_cd                   ;    }
    public void setWeb_rail_sys_flg          ( String                     web_rail_sys_flg           ){    this.web_rail_sys_flg           = web_rail_sys_flg              ;    }
    public void setMty_cntr_rout_flg         ( String                     mty_cntr_rout_flg          ){    this.mty_cntr_rout_flg          = mty_cntr_rout_flg             ;    }
    public void setInlnd_rout_rmk            ( String                     inlnd_rout_rmk             ){    this.inlnd_rout_rmk             = inlnd_rout_rmk                ;    }
    public void setDelt_flg                  ( String                     delt_flg                   ){    this.delt_flg                   = delt_flg                      ;    }
    public void setCre_ofc_cd                ( String                     cre_ofc_cd                 ){    this.cre_ofc_cd                 = cre_ofc_cd                    ;    }
    public void setCre_usr_id                ( String                     cre_usr_id                 ){    this.cre_usr_id                 = cre_usr_id                    ;    }
    public void setCre_dt                    ( String                     cre_dt                     ){    this.cre_dt                     = cre_dt                        ;    }
    public void setUpd_usr_id                ( String                     upd_usr_id                 ){    this.upd_usr_id                 = upd_usr_id                    ;    }
    public void setUpd_dt                    ( String                     upd_dt                     ){    this.upd_dt                     = upd_dt                        ;    }

    public static PRD_INLND_ROUT_MST fromRequest(HttpServletRequest request) {
        PRD_INLND_ROUT_MST model = new PRD_INLND_ROUT_MST();
        try {
            model.setIbflag                        (JSPUtil.getParameter(request, "ibflag                            ".trim(), ""));
            model.setPage_rows                     (JSPUtil.getParameter(request, "page_rows                         ".trim(), ""));
            model.setRout_org_nod_cd               (JSPUtil.getParameter(request, "rout_org_nod_cd                   ".trim(), ""));
            model.setRout_dest_nod_cd              (JSPUtil.getParameter(request, "rout_dest_nod_cd                  ".trim(), ""));
            model.setRout_seq                      (JSPUtil.getParameter(request, "rout_seq                          ".trim(), ""));
            model.setPrio_seq                      (JSPUtil.getParameter(request, "prio_seq                          ".trim(), ""));
            model.setInlnd_rout_inv_bil_patt_cd    (JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd        ".trim(), ""));
            model.setRout_pln_cd                   (JSPUtil.getParameter(request, "rout_pln_cd                       ".trim(), ""));
            model.setWeb_rail_sys_flg              (JSPUtil.getParameter(request, "web_rail_sys_flg                  ".trim(), ""));
            model.setMty_cntr_rout_flg             (JSPUtil.getParameter(request, "mty_cntr_rout_flg                 ".trim(), ""));
            model.setInlnd_rout_rmk                (JSPUtil.getParameter(request, "inlnd_rout_rmk                    ".trim(), ""));
            model.setDelt_flg                      (JSPUtil.getParameter(request, "delt_flg                          ".trim(), ""));
            model.setCre_ofc_cd                    (JSPUtil.getParameter(request, "cre_ofc_cd                        ".trim(), ""));
            model.setCre_usr_id                    (JSPUtil.getParameter(request, "cre_usr_id                        ".trim(), ""));
            model.setCre_dt                        (JSPUtil.getParameter(request, "cre_dt                            ".trim(), ""));
            model.setUpd_usr_id                    (JSPUtil.getParameter(request, "upd_usr_id                        ".trim(), ""));
            model.setUpd_dt                        (JSPUtil.getParameter(request, "upd_dt                            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_INLND_ROUT_MST model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                     =  (JSPUtil.getParameter(request, "ibflag                            ".trim(), length));
            String[] page_rows                  =  (JSPUtil.getParameter(request, "page_rows                         ".trim(), length));
            String[] rout_org_nod_cd            =  (JSPUtil.getParameter(request, "rout_org_nod_cd                   ".trim(), length));
            String[] rout_dest_nod_cd           =  (JSPUtil.getParameter(request, "rout_dest_nod_cd                  ".trim(), length));
            String[] rout_seq                   =  (JSPUtil.getParameter(request, "rout_seq                          ".trim(), length));
            String[] prio_seq                   =  (JSPUtil.getParameter(request, "prio_seq                          ".trim(), length));
            String[] inlnd_rout_inv_bil_patt_cd =  (JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd        ".trim(), length));
            String[] rout_pln_cd                =  (JSPUtil.getParameter(request, "rout_pln_cd                       ".trim(), length));
            String[] web_rail_sys_flg           =  (JSPUtil.getParameter(request, "web_rail_sys_flg                  ".trim(), length));
            String[] mty_cntr_rout_flg          =  (JSPUtil.getParameter(request, "mty_cntr_rout_flg                 ".trim(), length));
            String[] inlnd_rout_rmk             =  (JSPUtil.getParameter(request, "inlnd_rout_rmk                    ".trim(), length));
            String[] delt_flg                   =  (JSPUtil.getParameter(request, "delt_flg                          ".trim(), length));
            String[] cre_ofc_cd                 =  (JSPUtil.getParameter(request, "cre_ofc_cd                        ".trim(), length));
            String[] cre_usr_id                 =  (JSPUtil.getParameter(request, "cre_usr_id                        ".trim(), length));
            String[] cre_dt                     =  (JSPUtil.getParameter(request, "cre_dt                            ".trim(), length));
            String[] upd_usr_id                 =  (JSPUtil.getParameter(request, "upd_usr_id                        ".trim(), length));
            String[] upd_dt                     =  (JSPUtil.getParameter(request, "upd_dt                            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_INLND_ROUT_MST();
                model.setIbflag                              (ibflag                        [i]);
                model.setPage_rows                           (page_rows                     [i]);
                model.setRout_org_nod_cd                     (rout_org_nod_cd               [i]);
                model.setRout_dest_nod_cd                    (rout_dest_nod_cd              [i]);
                model.setRout_seq                            (rout_seq                      [i]);
                model.setPrio_seq                            (prio_seq                      [i]);
                model.setInlnd_rout_inv_bil_patt_cd          (inlnd_rout_inv_bil_patt_cd    [i]);
                model.setRout_pln_cd                         (rout_pln_cd                   [i]);
                model.setWeb_rail_sys_flg                    (web_rail_sys_flg              [i]);
                model.setMty_cntr_rout_flg                   (mty_cntr_rout_flg             [i]);
                model.setInlnd_rout_rmk                      (inlnd_rout_rmk                [i]);
                model.setDelt_flg                            (delt_flg                      [i]);
                model.setCre_ofc_cd                          (cre_ofc_cd                    [i]);
                model.setCre_usr_id                          (cre_usr_id                    [i]);
                model.setCre_dt                              (cre_dt                        [i]);
                model.setUpd_usr_id                          (upd_usr_id                    [i]);
                model.setUpd_dt                              (upd_dt                        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        PRD_INLND_ROUT_MST model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                     =  (JSPUtil.getParameter(request, prefix + "ibflag                            ".trim(), length));
            String[] page_rows                  =  (JSPUtil.getParameter(request, prefix + "page_rows                         ".trim(), length));
            String[] rout_org_nod_cd            =  (JSPUtil.getParameter(request, prefix + "rout_org_nod_cd                   ".trim(), length));
            String[] rout_dest_nod_cd           =  (JSPUtil.getParameter(request, prefix + "rout_dest_nod_cd                  ".trim(), length));
            String[] rout_seq                   =  (JSPUtil.getParameter(request, prefix + "rout_seq                          ".trim(), length));
            String[] prio_seq                   =  (JSPUtil.getParameter(request, prefix + "prio_seq                          ".trim(), length));
            String[] inlnd_rout_inv_bil_patt_cd =  (JSPUtil.getParameter(request, prefix + "inlnd_rout_inv_bil_patt_cd        ".trim(), length));
            String[] rout_pln_cd                =  (JSPUtil.getParameter(request, prefix + "rout_pln_cd                       ".trim(), length));
            String[] web_rail_sys_flg           =  (JSPUtil.getParameter(request, prefix + "web_rail_sys_flg                  ".trim(), length));
            String[] mty_cntr_rout_flg          =  (JSPUtil.getParameter(request, prefix + "mty_cntr_rout_flg                 ".trim(), length));
            String[] inlnd_rout_rmk             =  (JSPUtil.getParameter(request, prefix + "inlnd_rout_rmk                    ".trim(), length));
            String[] delt_flg                   =  (JSPUtil.getParameter(request, prefix + "delt_flg                          ".trim(), length));
            String[] cre_ofc_cd                 =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd                        ".trim(), length));
            String[] cre_usr_id                 =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                        ".trim(), length));
            String[] cre_dt                     =  (JSPUtil.getParameter(request, prefix + "cre_dt                            ".trim(), length));
            String[] upd_usr_id                 =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                        ".trim(), length));
            String[] upd_dt                     =  (JSPUtil.getParameter(request, prefix + "upd_dt                            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_INLND_ROUT_MST();
                model.setIbflag                              ( ibflag                        [i]);
                model.setPage_rows                           ( page_rows                     [i]);
                model.setRout_org_nod_cd                     ( rout_org_nod_cd               [i]);
                model.setRout_dest_nod_cd                    ( rout_dest_nod_cd              [i]);
                model.setRout_seq                            ( rout_seq                      [i]);
                model.setPrio_seq                            ( prio_seq                      [i]);
                model.setInlnd_rout_inv_bil_patt_cd          ( inlnd_rout_inv_bil_patt_cd    [i]);
                model.setRout_pln_cd                         ( rout_pln_cd                   [i]);
                model.setWeb_rail_sys_flg                    ( web_rail_sys_flg              [i]);
                model.setMty_cntr_rout_flg                   ( mty_cntr_rout_flg             [i]);
                model.setInlnd_rout_rmk                      ( inlnd_rout_rmk                [i]);
                model.setDelt_flg                            ( delt_flg                      [i]);
                model.setCre_ofc_cd                          ( cre_ofc_cd                    [i]);
                model.setCre_usr_id                          ( cre_usr_id                    [i]);
                model.setCre_dt                              ( cre_dt                        [i]);
                model.setUpd_usr_id                          ( upd_usr_id                    [i]);
                model.setUpd_dt                              ( upd_dt                        [i]);
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
