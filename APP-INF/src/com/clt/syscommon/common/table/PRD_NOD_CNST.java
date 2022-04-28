/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_NOD_CNST.java
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
 */public final class PRD_NOD_CNST implements java.io.Serializable {

    private String             ibflag             = "";
    private String             page_rows          = "";
    private String             nod_cd             = "";
    private String             pctl_cnst_cate_cd  = "";
    private String             pctl_cnst_itm_cd   = "";
    private String             nod_cnst_val       = "";
    private String             nod_cnst_val_ut_cd = "";
    private String             eff_fm_dt          = "";
    private String             eff_to_dt          = "";
    private String             nod_cnst_rmk       = "";
    private String             delt_flg           = "";
    private String             cre_usr_id         = "";
    private String             cre_dt             = "";
    private String             upd_usr_id         = "";
    private String             upd_dt             = "";

    public PRD_NOD_CNST(){}

    public PRD_NOD_CNST(
            String             ibflag            ,
            String             page_rows         ,
            String             nod_cd            ,
            String             pctl_cnst_cate_cd ,
            String             pctl_cnst_itm_cd  ,
            String             nod_cnst_val      ,
            String             nod_cnst_val_ut_cd,
            String             eff_fm_dt         ,
            String             eff_to_dt         ,
            String             nod_cnst_rmk      ,
            String             delt_flg          ,
            String             cre_usr_id        ,
            String             cre_dt            ,
            String             upd_usr_id        ,
            String             upd_dt            ){
        this.ibflag             = ibflag            ;
        this.page_rows          = page_rows         ;
        this.nod_cd             = nod_cd            ;
        this.pctl_cnst_cate_cd  = pctl_cnst_cate_cd ;
        this.pctl_cnst_itm_cd   = pctl_cnst_itm_cd  ;
        this.nod_cnst_val       = nod_cnst_val      ;
        this.nod_cnst_val_ut_cd = nod_cnst_val_ut_cd;
        this.eff_fm_dt          = eff_fm_dt         ;
        this.eff_to_dt          = eff_to_dt         ;
        this.nod_cnst_rmk       = nod_cnst_rmk      ;
        this.delt_flg           = delt_flg          ;
        this.cre_usr_id         = cre_usr_id        ;
        this.cre_dt             = cre_dt            ;
        this.upd_usr_id         = upd_usr_id        ;
        this.upd_dt             = upd_dt            ;
    }

    // getter method is proceeding ..
    public String             getIbflag            (){    return ibflag                ;    }
    public String             getPage_rows         (){    return page_rows             ;    }
    public String             getNod_cd            (){    return nod_cd                ;    }
    public String             getPctl_cnst_cate_cd (){    return pctl_cnst_cate_cd     ;    }
    public String             getPctl_cnst_itm_cd  (){    return pctl_cnst_itm_cd      ;    }
    public String             getNod_cnst_val      (){    return nod_cnst_val          ;    }
    public String             getNod_cnst_val_ut_cd(){    return nod_cnst_val_ut_cd    ;    }
    public String             getEff_fm_dt         (){    return eff_fm_dt             ;    }
    public String             getEff_to_dt         (){    return eff_to_dt             ;    }
    public String             getNod_cnst_rmk      (){    return nod_cnst_rmk          ;    }
    public String             getDelt_flg          (){    return delt_flg              ;    }
    public String             getCre_usr_id        (){    return cre_usr_id            ;    }
    public String             getCre_dt            (){    return cre_dt                ;    }
    public String             getUpd_usr_id        (){    return upd_usr_id            ;    }
    public String             getUpd_dt            (){    return upd_dt                ;    }

    // setter method is proceeding ..
    public void setIbflag            ( String             ibflag             ){    this.ibflag             = ibflag                ;    }
    public void setPage_rows         ( String             page_rows          ){    this.page_rows          = page_rows             ;    }
    public void setNod_cd            ( String             nod_cd             ){    this.nod_cd             = nod_cd                ;    }
    public void setPctl_cnst_cate_cd ( String             pctl_cnst_cate_cd  ){    this.pctl_cnst_cate_cd  = pctl_cnst_cate_cd     ;    }
    public void setPctl_cnst_itm_cd  ( String             pctl_cnst_itm_cd   ){    this.pctl_cnst_itm_cd   = pctl_cnst_itm_cd      ;    }
    public void setNod_cnst_val      ( String             nod_cnst_val       ){    this.nod_cnst_val       = nod_cnst_val          ;    }
    public void setNod_cnst_val_ut_cd( String             nod_cnst_val_ut_cd ){    this.nod_cnst_val_ut_cd = nod_cnst_val_ut_cd    ;    }
    public void setEff_fm_dt         ( String             eff_fm_dt          ){    this.eff_fm_dt          = eff_fm_dt             ;    }
    public void setEff_to_dt         ( String             eff_to_dt          ){    this.eff_to_dt          = eff_to_dt             ;    }
    public void setNod_cnst_rmk      ( String             nod_cnst_rmk       ){    this.nod_cnst_rmk       = nod_cnst_rmk          ;    }
    public void setDelt_flg          ( String             delt_flg           ){    this.delt_flg           = delt_flg              ;    }
    public void setCre_usr_id        ( String             cre_usr_id         ){    this.cre_usr_id         = cre_usr_id            ;    }
    public void setCre_dt            ( String             cre_dt             ){    this.cre_dt             = cre_dt                ;    }
    public void setUpd_usr_id        ( String             upd_usr_id         ){    this.upd_usr_id         = upd_usr_id            ;    }
    public void setUpd_dt            ( String             upd_dt             ){    this.upd_dt             = upd_dt                ;    }

    public static PRD_NOD_CNST fromRequest(HttpServletRequest request) {
        PRD_NOD_CNST model = new PRD_NOD_CNST();
        try {
            model.setIbflag                (JSPUtil.getParameter(request, "ibflag                    ".trim(), ""));
            model.setPage_rows             (JSPUtil.getParameter(request, "page_rows                 ".trim(), ""));
            model.setNod_cd                (JSPUtil.getParameter(request, "nod_cd                    ".trim(), ""));
            model.setPctl_cnst_cate_cd     (JSPUtil.getParameter(request, "pctl_cnst_cate_cd         ".trim(), ""));
            model.setPctl_cnst_itm_cd      (JSPUtil.getParameter(request, "pctl_cnst_itm_cd          ".trim(), ""));
            model.setNod_cnst_val          (JSPUtil.getParameter(request, "nod_cnst_val              ".trim(), ""));
            model.setNod_cnst_val_ut_cd    (JSPUtil.getParameter(request, "nod_cnst_val_ut_cd        ".trim(), ""));
            model.setEff_fm_dt             (JSPUtil.getParameter(request, "eff_fm_dt                 ".trim(), ""));
            model.setEff_to_dt             (JSPUtil.getParameter(request, "eff_to_dt                 ".trim(), ""));
            model.setNod_cnst_rmk          (JSPUtil.getParameter(request, "nod_cnst_rmk              ".trim(), ""));
            model.setDelt_flg              (JSPUtil.getParameter(request, "delt_flg                  ".trim(), ""));
            model.setCre_usr_id            (JSPUtil.getParameter(request, "cre_usr_id                ".trim(), ""));
            model.setCre_dt                (JSPUtil.getParameter(request, "cre_dt                    ".trim(), ""));
            model.setUpd_usr_id            (JSPUtil.getParameter(request, "upd_usr_id                ".trim(), ""));
            model.setUpd_dt                (JSPUtil.getParameter(request, "upd_dt                    ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_NOD_CNST model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag                    ".trim(), length));
            String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows                 ".trim(), length));
            String[] nod_cd             =  (JSPUtil.getParameter(request, "nod_cd                    ".trim(), length));
            String[] pctl_cnst_cate_cd  =  (JSPUtil.getParameter(request, "pctl_cnst_cate_cd         ".trim(), length));
            String[] pctl_cnst_itm_cd   =  (JSPUtil.getParameter(request, "pctl_cnst_itm_cd          ".trim(), length));
            String[] nod_cnst_val       =  (JSPUtil.getParameter(request, "nod_cnst_val              ".trim(), length));
            String[] nod_cnst_val_ut_cd =  (JSPUtil.getParameter(request, "nod_cnst_val_ut_cd        ".trim(), length));
            String[] eff_fm_dt          =  (JSPUtil.getParameter(request, "eff_fm_dt                 ".trim(), length));
            String[] eff_to_dt          =  (JSPUtil.getParameter(request, "eff_to_dt                 ".trim(), length));
            String[] nod_cnst_rmk       =  (JSPUtil.getParameter(request, "nod_cnst_rmk              ".trim(), length));
            String[] delt_flg           =  (JSPUtil.getParameter(request, "delt_flg                  ".trim(), length));
            String[] cre_usr_id         =  (JSPUtil.getParameter(request, "cre_usr_id                ".trim(), length));
            String[] cre_dt             =  (JSPUtil.getParameter(request, "cre_dt                    ".trim(), length));
            String[] upd_usr_id         =  (JSPUtil.getParameter(request, "upd_usr_id                ".trim(), length));
            String[] upd_dt             =  (JSPUtil.getParameter(request, "upd_dt                    ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_NOD_CNST();
                model.setIbflag                      (ibflag                [i]);
                model.setPage_rows                   (page_rows             [i]);
                model.setNod_cd                      (nod_cd                [i]);
                model.setPctl_cnst_cate_cd           (pctl_cnst_cate_cd     [i]);
                model.setPctl_cnst_itm_cd            (pctl_cnst_itm_cd      [i]);
                model.setNod_cnst_val                (nod_cnst_val          [i]);
                model.setNod_cnst_val_ut_cd          (nod_cnst_val_ut_cd    [i]);
                model.setEff_fm_dt                   (eff_fm_dt             [i]);
                model.setEff_to_dt                   (eff_to_dt             [i]);
                model.setNod_cnst_rmk                (nod_cnst_rmk          [i]);
                model.setDelt_flg                    (delt_flg              [i]);
                model.setCre_usr_id                  (cre_usr_id            [i]);
                model.setCre_dt                      (cre_dt                [i]);
                model.setUpd_usr_id                  (upd_usr_id            [i]);
                model.setUpd_dt                      (upd_dt                [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        PRD_NOD_CNST model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag                    ".trim(), length));
            String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows                 ".trim(), length));
            String[] nod_cd             =  (JSPUtil.getParameter(request, prefix + "nod_cd                    ".trim(), length));
            String[] pctl_cnst_cate_cd  =  (JSPUtil.getParameter(request, prefix + "pctl_cnst_cate_cd         ".trim(), length));
            String[] pctl_cnst_itm_cd   =  (JSPUtil.getParameter(request, prefix + "pctl_cnst_itm_cd          ".trim(), length));
            String[] nod_cnst_val       =  (JSPUtil.getParameter(request, prefix + "nod_cnst_val              ".trim(), length));
            String[] nod_cnst_val_ut_cd =  (JSPUtil.getParameter(request, prefix + "nod_cnst_val_ut_cd        ".trim(), length));
            String[] eff_fm_dt          =  (JSPUtil.getParameter(request, prefix + "eff_fm_dt                 ".trim(), length));
            String[] eff_to_dt          =  (JSPUtil.getParameter(request, prefix + "eff_to_dt                 ".trim(), length));
            String[] nod_cnst_rmk       =  (JSPUtil.getParameter(request, prefix + "nod_cnst_rmk              ".trim(), length));
            String[] delt_flg           =  (JSPUtil.getParameter(request, prefix + "delt_flg                  ".trim(), length));
            String[] cre_usr_id         =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                ".trim(), length));
            String[] cre_dt             =  (JSPUtil.getParameter(request, prefix + "cre_dt                    ".trim(), length));
            String[] upd_usr_id         =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                ".trim(), length));
            String[] upd_dt             =  (JSPUtil.getParameter(request, prefix + "upd_dt                    ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_NOD_CNST();
                model.setIbflag                      ( ibflag                [i]);
                model.setPage_rows                   ( page_rows             [i]);
                model.setNod_cd                      ( nod_cd                [i]);
                model.setPctl_cnst_cate_cd           ( pctl_cnst_cate_cd     [i]);
                model.setPctl_cnst_itm_cd            ( pctl_cnst_itm_cd      [i]);
                model.setNod_cnst_val                ( nod_cnst_val          [i]);
                model.setNod_cnst_val_ut_cd          ( nod_cnst_val_ut_cd    [i]);
                model.setEff_fm_dt                   ( eff_fm_dt             [i]);
                model.setEff_to_dt                   ( eff_to_dt             [i]);
                model.setNod_cnst_rmk                ( nod_cnst_rmk          [i]);
                model.setDelt_flg                    ( delt_flg              [i]);
                model.setCre_usr_id                  ( cre_usr_id            [i]);
                model.setCre_dt                      ( cre_dt                [i]);
                model.setUpd_usr_id                  ( upd_usr_id            [i]);
                model.setUpd_dt                      ( upd_dt                [i]);
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
