/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_RAIL_SKD.java
*@FileTitle : Rail Schedule 정보관리화면
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-18
*@LastModifier : jungsunyong
*@LastVersion : 1.0
* 2006-09-18 jungsunyong
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
 */public final class PRD_RAIL_SKD implements java.io.Serializable {

    private String        ibflag        = "";
    private String        page_rows     = "";
    private String        org_nod_cd    = "";
    private String        dest_nod_cd   = "";
    private String        vndr_seq      = "";
    private String        rail_skd_seq  = "";
    private String        cut_off_dy_cd = "";
    private String        cut_off_hrmnt = "";
    private String        arr_dy_cd     = "";
    private String        arr_hrmnt     = "";
    private String        ctrl_ofc_cd   = "";
    private String        rail_skd_rmk  = "";
    private String        delt_flg      = "";
    private String        cre_usr_id    = "";
    private String        cre_dt        = "";
    private String        upd_usr_id    = "";
    private String        upd_dt        = "";

    public PRD_RAIL_SKD(){}

    public PRD_RAIL_SKD(
            String        ibflag       ,
            String        page_rows    ,
            String        org_nod_cd   ,
            String        dest_nod_cd  ,
            String        vndr_seq     ,
            String        rail_skd_seq ,
            String        cut_off_dy_cd,
            String        cut_off_hrmnt,
            String        arr_dy_cd    ,
            String        arr_hrmnt    ,
            String        ctrl_ofc_cd  ,
            String        rail_skd_rmk ,
            String        delt_flg     ,
            String        cre_usr_id   ,
            String        cre_dt       ,
            String        upd_usr_id   ,
            String        upd_dt       ){
        this.ibflag        = ibflag       ;
        this.page_rows     = page_rows    ;
        this.org_nod_cd    = org_nod_cd   ;
        this.dest_nod_cd   = dest_nod_cd  ;
        this.vndr_seq      = vndr_seq     ;
        this.rail_skd_seq  = rail_skd_seq ;
        this.cut_off_dy_cd = cut_off_dy_cd;
        this.cut_off_hrmnt = cut_off_hrmnt;
        this.arr_dy_cd     = arr_dy_cd    ;
        this.arr_hrmnt     = arr_hrmnt    ;
        this.ctrl_ofc_cd   = ctrl_ofc_cd  ;
        this.rail_skd_rmk  = rail_skd_rmk ;
        this.delt_flg      = delt_flg     ;
        this.cre_usr_id    = cre_usr_id   ;
        this.cre_dt        = cre_dt       ;
        this.upd_usr_id    = upd_usr_id   ;
        this.upd_dt        = upd_dt       ;
    }

    // getter method is proceeding ..
    public String        getIbflag       (){    return ibflag           ;    }
    public String        getPage_rows    (){    return page_rows        ;    }
    public String        getOrg_nod_cd   (){    return org_nod_cd       ;    }
    public String        getDest_nod_cd  (){    return dest_nod_cd      ;    }
    public String        getVndr_seq     (){    return vndr_seq         ;    }
    public String        getRail_skd_seq (){    return rail_skd_seq     ;    }
    public String        getCut_off_dy_cd(){    return cut_off_dy_cd    ;    }
    public String        getCut_off_hrmnt(){    return cut_off_hrmnt    ;    }
    public String        getArr_dy_cd    (){    return arr_dy_cd        ;    }
    public String        getArr_hrmnt    (){    return arr_hrmnt        ;    }
    public String        getCtrl_ofc_cd  (){    return ctrl_ofc_cd      ;    }
    public String        getRail_skd_rmk (){    return rail_skd_rmk     ;    }
    public String        getDelt_flg     (){    return delt_flg         ;    }
    public String        getCre_usr_id   (){    return cre_usr_id       ;    }
    public String        getCre_dt       (){    return cre_dt           ;    }
    public String        getUpd_usr_id   (){    return upd_usr_id       ;    }
    public String        getUpd_dt       (){    return upd_dt           ;    }

    // setter method is proceeding ..
    public void setIbflag       ( String        ibflag        ){    this.ibflag        = ibflag           ;    }
    public void setPage_rows    ( String        page_rows     ){    this.page_rows     = page_rows        ;    }
    public void setOrg_nod_cd   ( String        org_nod_cd    ){    this.org_nod_cd    = org_nod_cd       ;    }
    public void setDest_nod_cd  ( String        dest_nod_cd   ){    this.dest_nod_cd   = dest_nod_cd      ;    }
    public void setVndr_seq     ( String        vndr_seq      ){    this.vndr_seq      = vndr_seq         ;    }
    public void setRail_skd_seq ( String        rail_skd_seq  ){    this.rail_skd_seq  = rail_skd_seq     ;    }
    public void setCut_off_dy_cd( String        cut_off_dy_cd ){    this.cut_off_dy_cd = cut_off_dy_cd    ;    }
    public void setCut_off_hrmnt( String        cut_off_hrmnt ){    this.cut_off_hrmnt = cut_off_hrmnt    ;    }
    public void setArr_dy_cd    ( String        arr_dy_cd     ){    this.arr_dy_cd     = arr_dy_cd        ;    }
    public void setArr_hrmnt    ( String        arr_hrmnt     ){    this.arr_hrmnt     = arr_hrmnt        ;    }
    public void setCtrl_ofc_cd  ( String        ctrl_ofc_cd   ){    this.ctrl_ofc_cd   = ctrl_ofc_cd      ;    }
    public void setRail_skd_rmk ( String        rail_skd_rmk  ){    this.rail_skd_rmk  = rail_skd_rmk     ;    }
    public void setDelt_flg     ( String        delt_flg      ){    this.delt_flg      = delt_flg         ;    }
    public void setCre_usr_id   ( String        cre_usr_id    ){    this.cre_usr_id    = cre_usr_id       ;    }
    public void setCre_dt       ( String        cre_dt        ){    this.cre_dt        = cre_dt           ;    }
    public void setUpd_usr_id   ( String        upd_usr_id    ){    this.upd_usr_id    = upd_usr_id       ;    }
    public void setUpd_dt       ( String        upd_dt        ){    this.upd_dt        = upd_dt           ;    }

    public static PRD_RAIL_SKD fromRequest(HttpServletRequest request) {
        PRD_RAIL_SKD model = new PRD_RAIL_SKD();
        try {
            model.setIbflag           (JSPUtil.getParameter(request, "ibflag               ".trim(), ""));
            model.setPage_rows        (JSPUtil.getParameter(request, "page_rows            ".trim(), ""));
            model.setOrg_nod_cd       (JSPUtil.getParameter(request, "org_nod_cd           ".trim(), ""));
            model.setDest_nod_cd      (JSPUtil.getParameter(request, "dest_nod_cd          ".trim(), ""));
            model.setVndr_seq         (JSPUtil.getParameter(request, "vndr_seq             ".trim(), ""));
            model.setRail_skd_seq     (JSPUtil.getParameter(request, "rail_skd_seq         ".trim(), ""));
            model.setCut_off_dy_cd    (JSPUtil.getParameter(request, "cut_off_dy_cd        ".trim(), ""));
            model.setCut_off_hrmnt    (JSPUtil.getParameter(request, "cut_off_hrmnt        ".trim(), ""));
            model.setArr_dy_cd        (JSPUtil.getParameter(request, "arr_dy_cd            ".trim(), ""));
            model.setArr_hrmnt        (JSPUtil.getParameter(request, "arr_hrmnt            ".trim(), ""));
            model.setCtrl_ofc_cd      (JSPUtil.getParameter(request, "ctrl_ofc_cd          ".trim(), ""));
            model.setRail_skd_rmk     (JSPUtil.getParameter(request, "rail_skd_rmk         ".trim(), ""));
            model.setDelt_flg         (JSPUtil.getParameter(request, "delt_flg             ".trim(), ""));
            model.setCre_usr_id       (JSPUtil.getParameter(request, "cre_usr_id           ".trim(), ""));
            model.setCre_dt           (JSPUtil.getParameter(request, "cre_dt               ".trim(), ""));
            model.setUpd_usr_id       (JSPUtil.getParameter(request, "upd_usr_id           ".trim(), ""));
            model.setUpd_dt           (JSPUtil.getParameter(request, "upd_dt               ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_RAIL_SKD model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows            ".trim(), length));
            String[] org_nod_cd    =  (JSPUtil.getParameter(request, "org_nod_cd           ".trim(), length));
            String[] dest_nod_cd   =  (JSPUtil.getParameter(request, "dest_nod_cd          ".trim(), length));
            String[] vndr_seq      =  (JSPUtil.getParameter(request, "vndr_seq             ".trim(), length));
            String[] rail_skd_seq  =  (JSPUtil.getParameter(request, "rail_skd_seq         ".trim(), length));
            String[] cut_off_dy_cd =  (JSPUtil.getParameter(request, "cut_off_dy_cd        ".trim(), length));
            String[] cut_off_hrmnt =  (JSPUtil.getParameter(request, "cut_off_hrmnt        ".trim(), length));
            String[] arr_dy_cd     =  (JSPUtil.getParameter(request, "arr_dy_cd            ".trim(), length));
            String[] arr_hrmnt     =  (JSPUtil.getParameter(request, "arr_hrmnt            ".trim(), length));
            String[] ctrl_ofc_cd   =  (JSPUtil.getParameter(request, "ctrl_ofc_cd          ".trim(), length));
            String[] rail_skd_rmk  =  (JSPUtil.getParameter(request, "rail_skd_rmk         ".trim(), length));
            String[] delt_flg      =  (JSPUtil.getParameter(request, "delt_flg             ".trim(), length));
            String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id           ".trim(), length));
            String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt               ".trim(), length));
            String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id           ".trim(), length));
            String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt               ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_RAIL_SKD();
                model.setIbflag                 (ibflag           [i]);
                model.setPage_rows              (page_rows        [i]);
                model.setOrg_nod_cd             (org_nod_cd       [i]);
                model.setDest_nod_cd            (dest_nod_cd      [i]);
                model.setVndr_seq               (vndr_seq         [i]);
                model.setRail_skd_seq           (rail_skd_seq     [i]);
                model.setCut_off_dy_cd          (cut_off_dy_cd    [i]);
                model.setCut_off_hrmnt          (cut_off_hrmnt    [i]);
                model.setArr_dy_cd              (arr_dy_cd        [i]);
                model.setArr_hrmnt              (arr_hrmnt        [i]);
                model.setCtrl_ofc_cd            (ctrl_ofc_cd      [i]);
                model.setRail_skd_rmk           (rail_skd_rmk     [i]);
                model.setDelt_flg               (delt_flg         [i]);
                model.setCre_usr_id             (cre_usr_id       [i]);
                model.setCre_dt                 (cre_dt           [i]);
                model.setUpd_usr_id             (upd_usr_id       [i]);
                model.setUpd_dt                 (upd_dt           [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        PRD_RAIL_SKD model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows            ".trim(), length));
            String[] org_nod_cd    =  (JSPUtil.getParameter(request, prefix + "org_nod_cd           ".trim(), length));
            String[] dest_nod_cd   =  (JSPUtil.getParameter(request, prefix + "dest_nod_cd          ".trim(), length));
            String[] vndr_seq      =  (JSPUtil.getParameter(request, prefix + "vndr_seq             ".trim(), length));
            String[] rail_skd_seq  =  (JSPUtil.getParameter(request, prefix + "rail_skd_seq         ".trim(), length));
            String[] cut_off_dy_cd =  (JSPUtil.getParameter(request, prefix + "cut_off_dy_cd        ".trim(), length));
            String[] cut_off_hrmnt =  (JSPUtil.getParameter(request, prefix + "cut_off_hrmnt        ".trim(), length));
            String[] arr_dy_cd     =  (JSPUtil.getParameter(request, prefix + "arr_dy_cd            ".trim(), length));
            String[] arr_hrmnt     =  (JSPUtil.getParameter(request, prefix + "arr_hrmnt            ".trim(), length));
            String[] ctrl_ofc_cd   =  (JSPUtil.getParameter(request, prefix + "ctrl_ofc_cd          ".trim(), length));
            String[] rail_skd_rmk  =  (JSPUtil.getParameter(request, prefix + "rail_skd_rmk         ".trim(), length));
            String[] delt_flg      =  (JSPUtil.getParameter(request, prefix + "delt_flg             ".trim(), length));
            String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           ".trim(), length));
            String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt               ".trim(), length));
            String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           ".trim(), length));
            String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt               ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_RAIL_SKD();
                model.setIbflag                 ( ibflag           [i]);
                model.setPage_rows              ( page_rows        [i]);
                model.setOrg_nod_cd             ( org_nod_cd       [i]);
                model.setDest_nod_cd            ( dest_nod_cd      [i]);
                model.setVndr_seq               ( vndr_seq         [i]);
                model.setRail_skd_seq           ( rail_skd_seq     [i]);
                model.setCut_off_dy_cd          ( cut_off_dy_cd    [i]);
                model.setCut_off_hrmnt          ( cut_off_hrmnt    [i]);
                model.setArr_dy_cd              ( arr_dy_cd        [i]);
                model.setArr_hrmnt              ( arr_hrmnt        [i]);
                model.setCtrl_ofc_cd            ( ctrl_ofc_cd      [i]);
                model.setRail_skd_rmk           ( rail_skd_rmk     [i]);
                model.setDelt_flg               ( delt_flg         [i]);
                model.setCre_usr_id             ( cre_usr_id       [i]);
                model.setCre_dt                 ( cre_dt           [i]);
                model.setUpd_usr_id             ( upd_usr_id       [i]);
                model.setUpd_dt                 ( upd_dt           [i]);
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
