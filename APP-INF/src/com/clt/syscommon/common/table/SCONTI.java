/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SCONTI.java
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
 */public final class SCONTI implements java.io.Serializable {

    private String        ibflag        = "";
    private String        page_rows     = "";
    private String        sconti_cd     = "";
    private String        conti_cd      = "";
    private String        sconti_updt   = "";
    private String        sconti_desc   = "";
    private String        sconti_credt  = "";
    private String        sconti_authid = "";
    private String        sconti_delind = "";
    private String        nis_event_dt  = "";

    public SCONTI(){}

    public SCONTI(
            String        ibflag       ,
            String        page_rows    ,
            String        sconti_cd    ,
            String        conti_cd     ,
            String        sconti_updt  ,
            String        sconti_desc  ,
            String        sconti_credt ,
            String        sconti_authid,
            String        sconti_delind,
            String        nis_event_dt ){
        this.ibflag        = ibflag       ;
        this.page_rows     = page_rows    ;
        this.sconti_cd     = sconti_cd    ;
        this.conti_cd      = conti_cd     ;
        this.sconti_updt   = sconti_updt  ;
        this.sconti_desc   = sconti_desc  ;
        this.sconti_credt  = sconti_credt ;
        this.sconti_authid = sconti_authid;
        this.sconti_delind = sconti_delind;
        this.nis_event_dt  = nis_event_dt ;
    }

    // getter method is proceeding ..
    public String        getIbflag       (){    return ibflag           ;    }
    public String        getPage_rows    (){    return page_rows        ;    }
    public String        getSconti_cd    (){    return sconti_cd        ;    }
    public String        getConti_cd     (){    return conti_cd         ;    }
    public String        getSconti_updt  (){    return sconti_updt      ;    }
    public String        getSconti_desc  (){    return sconti_desc      ;    }
    public String        getSconti_credt (){    return sconti_credt     ;    }
    public String        getSconti_authid(){    return sconti_authid    ;    }
    public String        getSconti_delind(){    return sconti_delind    ;    }
    public String        getNis_event_dt (){    return nis_event_dt     ;    }

    // setter method is proceeding ..
    public void setIbflag       ( String        ibflag        ){    this.ibflag        = ibflag           ;    }
    public void setPage_rows    ( String        page_rows     ){    this.page_rows     = page_rows        ;    }
    public void setSconti_cd    ( String        sconti_cd     ){    this.sconti_cd     = sconti_cd        ;    }
    public void setConti_cd     ( String        conti_cd      ){    this.conti_cd      = conti_cd         ;    }
    public void setSconti_updt  ( String        sconti_updt   ){    this.sconti_updt   = sconti_updt      ;    }
    public void setSconti_desc  ( String        sconti_desc   ){    this.sconti_desc   = sconti_desc      ;    }
    public void setSconti_credt ( String        sconti_credt  ){    this.sconti_credt  = sconti_credt     ;    }
    public void setSconti_authid( String        sconti_authid ){    this.sconti_authid = sconti_authid    ;    }
    public void setSconti_delind( String        sconti_delind ){    this.sconti_delind = sconti_delind    ;    }
    public void setNis_event_dt ( String        nis_event_dt  ){    this.nis_event_dt  = nis_event_dt     ;    }

    public static SCONTI fromRequest(HttpServletRequest request) {
        SCONTI model = new SCONTI();
        try {
            model.setIbflag           (JSPUtil.getParameter(request, "ibflag               ".trim(), ""));
            model.setPage_rows        (JSPUtil.getParameter(request, "page_rows            ".trim(), ""));
            model.setSconti_cd        (JSPUtil.getParameter(request, "sconti_cd            ".trim(), ""));
            model.setConti_cd         (JSPUtil.getParameter(request, "conti_cd             ".trim(), ""));
            model.setSconti_updt      (JSPUtil.getParameter(request, "sconti_updt          ".trim(), ""));
            model.setSconti_desc      (JSPUtil.getParameter(request, "sconti_desc          ".trim(), ""));
            model.setSconti_credt     (JSPUtil.getParameter(request, "sconti_credt         ".trim(), ""));
            model.setSconti_authid    (JSPUtil.getParameter(request, "sconti_authid        ".trim(), ""));
            model.setSconti_delind    (JSPUtil.getParameter(request, "sconti_delind        ".trim(), ""));
            model.setNis_event_dt     (JSPUtil.getParameter(request, "nis_event_dt         ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SCONTI model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows            ".trim(), length));
            String[] sconti_cd     =  (JSPUtil.getParameter(request, "sconti_cd            ".trim(), length));
            String[] conti_cd      =  (JSPUtil.getParameter(request, "conti_cd             ".trim(), length));
            String[] sconti_updt   =  (JSPUtil.getParameter(request, "sconti_updt          ".trim(), length));
            String[] sconti_desc   =  (JSPUtil.getParameter(request, "sconti_desc          ".trim(), length));
            String[] sconti_credt  =  (JSPUtil.getParameter(request, "sconti_credt         ".trim(), length));
            String[] sconti_authid =  (JSPUtil.getParameter(request, "sconti_authid        ".trim(), length));
            String[] sconti_delind =  (JSPUtil.getParameter(request, "sconti_delind        ".trim(), length));
            String[] nis_event_dt  =  (JSPUtil.getParameter(request, "nis_event_dt         ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCONTI();
                model.setIbflag                 (ibflag           [i]);
                model.setPage_rows              (page_rows        [i]);
                model.setSconti_cd              (sconti_cd        [i]);
                model.setConti_cd               (conti_cd         [i]);
                model.setSconti_updt            (sconti_updt      [i]);
                model.setSconti_desc            (sconti_desc      [i]);
                model.setSconti_credt           (sconti_credt     [i]);
                model.setSconti_authid          (sconti_authid    [i]);
                model.setSconti_delind          (sconti_delind    [i]);
                model.setNis_event_dt           (nis_event_dt     [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        SCONTI model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows            ".trim(), length));
            String[] sconti_cd     =  (JSPUtil.getParameter(request, prefix + "sconti_cd            ".trim(), length));
            String[] conti_cd      =  (JSPUtil.getParameter(request, prefix + "conti_cd             ".trim(), length));
            String[] sconti_updt   =  (JSPUtil.getParameter(request, prefix + "sconti_updt          ".trim(), length));
            String[] sconti_desc   =  (JSPUtil.getParameter(request, prefix + "sconti_desc          ".trim(), length));
            String[] sconti_credt  =  (JSPUtil.getParameter(request, prefix + "sconti_credt         ".trim(), length));
            String[] sconti_authid =  (JSPUtil.getParameter(request, prefix + "sconti_authid        ".trim(), length));
            String[] sconti_delind =  (JSPUtil.getParameter(request, prefix + "sconti_delind        ".trim(), length));
            String[] nis_event_dt  =  (JSPUtil.getParameter(request, prefix + "nis_event_dt         ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCONTI();
                model.setIbflag                 ( ibflag           [i]);
                model.setPage_rows              ( page_rows        [i]);
                model.setSconti_cd              ( sconti_cd        [i]);
                model.setConti_cd               ( conti_cd         [i]);
                model.setSconti_updt            ( sconti_updt      [i]);
                model.setSconti_desc            ( sconti_desc      [i]);
                model.setSconti_credt           ( sconti_credt     [i]);
                model.setSconti_authid          ( sconti_authid    [i]);
                model.setSconti_delind          ( sconti_delind    [i]);
                model.setNis_event_dt           ( nis_event_dt     [i]);
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
