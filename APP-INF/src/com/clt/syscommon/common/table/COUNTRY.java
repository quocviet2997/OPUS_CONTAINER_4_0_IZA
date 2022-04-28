/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COUNTRY.java
*@FileTitle : Location 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-03 Hyung Choon
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
 */public final class COUNTRY implements java.io.Serializable {

    private String         ibflag         = "";
    private String         page_rows      = "";
    private String         cnt_cd         = "";
    private String         conti_cd       = "";
    private String         cnt_desc       = "";
    private String         sconti_cd      = "";
    private String         cnt_credt      = "";
    private String         cnt_updt       = "";
    private String         cnt_authid     = "";
    private String         cnt_delind     = "";
    private String         cnt_proh       = "";
    private String         cnt_appl_trans = "";
    private String         curr_cd        = "";
    private String         cnt_iso        = "";
    private String         nis_event_dt   = "";
    private String         frgn_vat       = "";

    public COUNTRY(){}

    public COUNTRY(
            String         ibflag        ,
            String         page_rows     ,
            String         cnt_cd        ,
            String         conti_cd      ,
            String         cnt_desc      ,
            String         sconti_cd     ,
            String         cnt_credt     ,
            String         cnt_updt      ,
            String         cnt_authid    ,
            String         cnt_delind    ,
            String         cnt_proh      ,
            String         cnt_appl_trans,
            String         curr_cd       ,
            String         cnt_iso       ,
            String         nis_event_dt  ,
            String         frgn_vat      ){
        this.ibflag         = ibflag        ;
        this.page_rows      = page_rows     ;
        this.cnt_cd         = cnt_cd        ;
        this.conti_cd       = conti_cd      ;
        this.cnt_desc       = cnt_desc      ;
        this.sconti_cd      = sconti_cd     ;
        this.cnt_credt      = cnt_credt     ;
        this.cnt_updt       = cnt_updt      ;
        this.cnt_authid     = cnt_authid    ;
        this.cnt_delind     = cnt_delind    ;
        this.cnt_proh       = cnt_proh      ;
        this.cnt_appl_trans = cnt_appl_trans;
        this.curr_cd        = curr_cd       ;
        this.cnt_iso        = cnt_iso       ;
        this.nis_event_dt   = nis_event_dt  ;
        this.frgn_vat       = frgn_vat      ;
    }

    // getter method is proceeding ..
    public String         getIbflag        (){    return ibflag            ;    }
    public String         getPage_rows     (){    return page_rows         ;    }
    public String         getCnt_cd        (){    return cnt_cd            ;    }
    public String         getConti_cd      (){    return conti_cd          ;    }
    public String         getCnt_desc      (){    return cnt_desc          ;    }
    public String         getSconti_cd     (){    return sconti_cd         ;    }
    public String         getCnt_credt     (){    return cnt_credt         ;    }
    public String         getCnt_updt      (){    return cnt_updt          ;    }
    public String         getCnt_authid    (){    return cnt_authid        ;    }
    public String         getCnt_delind    (){    return cnt_delind        ;    }
    public String         getCnt_proh      (){    return cnt_proh          ;    }
    public String         getCnt_appl_trans(){    return cnt_appl_trans    ;    }
    public String         getCurr_cd       (){    return curr_cd           ;    }
    public String         getCnt_iso       (){    return cnt_iso           ;    }
    public String         getNis_event_dt  (){    return nis_event_dt      ;    }
    public String         getFrgn_vat      (){    return frgn_vat          ;    }

    // setter method is proceeding ..
    public void setIbflag        ( String         ibflag         ){    this.ibflag         = ibflag            ;    }
    public void setPage_rows     ( String         page_rows      ){    this.page_rows      = page_rows         ;    }
    public void setCnt_cd        ( String         cnt_cd         ){    this.cnt_cd         = cnt_cd            ;    }
    public void setConti_cd      ( String         conti_cd       ){    this.conti_cd       = conti_cd          ;    }
    public void setCnt_desc      ( String         cnt_desc       ){    this.cnt_desc       = cnt_desc          ;    }
    public void setSconti_cd     ( String         sconti_cd      ){    this.sconti_cd      = sconti_cd         ;    }
    public void setCnt_credt     ( String         cnt_credt      ){    this.cnt_credt      = cnt_credt         ;    }
    public void setCnt_updt      ( String         cnt_updt       ){    this.cnt_updt       = cnt_updt          ;    }
    public void setCnt_authid    ( String         cnt_authid     ){    this.cnt_authid     = cnt_authid        ;    }
    public void setCnt_delind    ( String         cnt_delind     ){    this.cnt_delind     = cnt_delind        ;    }
    public void setCnt_proh      ( String         cnt_proh       ){    this.cnt_proh       = cnt_proh          ;    }
    public void setCnt_appl_trans( String         cnt_appl_trans ){    this.cnt_appl_trans = cnt_appl_trans    ;    }
    public void setCurr_cd       ( String         curr_cd        ){    this.curr_cd        = curr_cd           ;    }
    public void setCnt_iso       ( String         cnt_iso        ){    this.cnt_iso        = cnt_iso           ;    }
    public void setNis_event_dt  ( String         nis_event_dt   ){    this.nis_event_dt   = nis_event_dt      ;    }
    public void setFrgn_vat      ( String         frgn_vat       ){    this.frgn_vat       = frgn_vat          ;    }

    public static COUNTRY fromRequest(HttpServletRequest request) {
        COUNTRY model = new COUNTRY();
        try {
            model.setIbflag            (JSPUtil.getParameter(request, "ibflag                ".trim(), ""));
            model.setPage_rows         (JSPUtil.getParameter(request, "page_rows             ".trim(), ""));
            model.setCnt_cd            (JSPUtil.getParameter(request, "cnt_cd                ".trim(), ""));
            model.setConti_cd          (JSPUtil.getParameter(request, "conti_cd              ".trim(), ""));
            model.setCnt_desc          (JSPUtil.getParameter(request, "cnt_desc              ".trim(), ""));
            model.setSconti_cd         (JSPUtil.getParameter(request, "sconti_cd             ".trim(), ""));
            model.setCnt_credt         (JSPUtil.getParameter(request, "cnt_credt             ".trim(), ""));
            model.setCnt_updt          (JSPUtil.getParameter(request, "cnt_updt              ".trim(), ""));
            model.setCnt_authid        (JSPUtil.getParameter(request, "cnt_authid            ".trim(), ""));
            model.setCnt_delind        (JSPUtil.getParameter(request, "cnt_delind            ".trim(), ""));
            model.setCnt_proh          (JSPUtil.getParameter(request, "cnt_proh              ".trim(), ""));
            model.setCnt_appl_trans    (JSPUtil.getParameter(request, "cnt_appl_trans        ".trim(), ""));
            model.setCurr_cd           (JSPUtil.getParameter(request, "curr_cd               ".trim(), ""));
            model.setCnt_iso           (JSPUtil.getParameter(request, "cnt_iso               ".trim(), ""));
            model.setNis_event_dt      (JSPUtil.getParameter(request, "nis_event_dt          ".trim(), ""));
            model.setFrgn_vat          (JSPUtil.getParameter(request, "frgn_vat              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        COUNTRY model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag                ".trim(), length));
            String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows             ".trim(), length));
            String[] cnt_cd         =  (JSPUtil.getParameter(request, "cnt_cd                ".trim(), length));
            String[] conti_cd       =  (JSPUtil.getParameter(request, "conti_cd              ".trim(), length));
            String[] cnt_desc       =  (JSPUtil.getParameter(request, "cnt_desc              ".trim(), length));
            String[] sconti_cd      =  (JSPUtil.getParameter(request, "sconti_cd             ".trim(), length));
            String[] cnt_credt      =  (JSPUtil.getParameter(request, "cnt_credt             ".trim(), length));
            String[] cnt_updt       =  (JSPUtil.getParameter(request, "cnt_updt              ".trim(), length));
            String[] cnt_authid     =  (JSPUtil.getParameter(request, "cnt_authid            ".trim(), length));
            String[] cnt_delind     =  (JSPUtil.getParameter(request, "cnt_delind            ".trim(), length));
            String[] cnt_proh       =  (JSPUtil.getParameter(request, "cnt_proh              ".trim(), length));
            String[] cnt_appl_trans =  (JSPUtil.getParameter(request, "cnt_appl_trans        ".trim(), length));
            String[] curr_cd        =  (JSPUtil.getParameter(request, "curr_cd               ".trim(), length));
            String[] cnt_iso        =  (JSPUtil.getParameter(request, "cnt_iso               ".trim(), length));
            String[] nis_event_dt   =  (JSPUtil.getParameter(request, "nis_event_dt          ".trim(), length));
            String[] frgn_vat       =  (JSPUtil.getParameter(request, "frgn_vat              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new COUNTRY();
                model.setIbflag                  (ibflag            [i]);
                model.setPage_rows               (page_rows         [i]);
                model.setCnt_cd                  (cnt_cd            [i]);
                model.setConti_cd                (conti_cd          [i]);
                model.setCnt_desc                (cnt_desc          [i]);
                model.setSconti_cd               (sconti_cd         [i]);
                model.setCnt_credt               (cnt_credt         [i]);
                model.setCnt_updt                (cnt_updt          [i]);
                model.setCnt_authid              (cnt_authid        [i]);
                model.setCnt_delind              (cnt_delind        [i]);
                model.setCnt_proh                (cnt_proh          [i]);
                model.setCnt_appl_trans          (cnt_appl_trans    [i]);
                model.setCurr_cd                 (curr_cd           [i]);
                model.setCnt_iso                 (cnt_iso           [i]);
                model.setNis_event_dt            (nis_event_dt      [i]);
                model.setFrgn_vat                (frgn_vat          [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        COUNTRY model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag                ".trim(), length));
            String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows             ".trim(), length));
            String[] cnt_cd         =  (JSPUtil.getParameter(request, prefix + "cnt_cd                ".trim(), length));
            String[] conti_cd       =  (JSPUtil.getParameter(request, prefix + "conti_cd              ".trim(), length));
            String[] cnt_desc       =  (JSPUtil.getParameter(request, prefix + "cnt_desc              ".trim(), length));
            String[] sconti_cd      =  (JSPUtil.getParameter(request, prefix + "sconti_cd             ".trim(), length));
            String[] cnt_credt      =  (JSPUtil.getParameter(request, prefix + "cnt_credt             ".trim(), length));
            String[] cnt_updt       =  (JSPUtil.getParameter(request, prefix + "cnt_updt              ".trim(), length));
            String[] cnt_authid     =  (JSPUtil.getParameter(request, prefix + "cnt_authid            ".trim(), length));
            String[] cnt_delind     =  (JSPUtil.getParameter(request, prefix + "cnt_delind            ".trim(), length));
            String[] cnt_proh       =  (JSPUtil.getParameter(request, prefix + "cnt_proh              ".trim(), length));
            String[] cnt_appl_trans =  (JSPUtil.getParameter(request, prefix + "cnt_appl_trans        ".trim(), length));
            String[] curr_cd        =  (JSPUtil.getParameter(request, prefix + "curr_cd               ".trim(), length));
            String[] cnt_iso        =  (JSPUtil.getParameter(request, prefix + "cnt_iso               ".trim(), length));
            String[] nis_event_dt   =  (JSPUtil.getParameter(request, prefix + "nis_event_dt          ".trim(), length));
            String[] frgn_vat       =  (JSPUtil.getParameter(request, prefix + "frgn_vat              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new COUNTRY();
                model.setIbflag                  ( ibflag            [i]);
                model.setPage_rows               ( page_rows         [i]);
                model.setCnt_cd                  ( cnt_cd            [i]);
                model.setConti_cd                ( conti_cd          [i]);
                model.setCnt_desc                ( cnt_desc          [i]);
                model.setSconti_cd               ( sconti_cd         [i]);
                model.setCnt_credt               ( cnt_credt         [i]);
                model.setCnt_updt                ( cnt_updt          [i]);
                model.setCnt_authid              ( cnt_authid        [i]);
                model.setCnt_delind              ( cnt_delind        [i]);
                model.setCnt_proh                ( cnt_proh          [i]);
                model.setCnt_appl_trans          ( cnt_appl_trans    [i]);
                model.setCurr_cd                 ( curr_cd           [i]);
                model.setCnt_iso                 ( cnt_iso           [i]);
                model.setNis_event_dt            ( nis_event_dt      [i]);
                model.setFrgn_vat                ( frgn_vat          [i]);
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
