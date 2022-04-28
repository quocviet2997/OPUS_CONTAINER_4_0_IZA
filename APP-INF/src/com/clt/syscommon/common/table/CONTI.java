/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CONTI.java
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
 */public final class CONTI implements java.io.Serializable {

    private String       ibflag       = "";
    private String       page_rows    = "";
    private String       conti_cd     = "";
    private String       conti_desc   = "";
    private String       conti_credt  = "";
    private String       conti_updt   = "";
    private String       conti_authid = "";
    private String       conti_delind = "";
    private String       nis_event_dt = "";

    public CONTI(){}

    public CONTI(
            String       ibflag      ,
            String       page_rows   ,
            String       conti_cd    ,
            String       conti_desc  ,
            String       conti_credt ,
            String       conti_updt  ,
            String       conti_authid,
            String       conti_delind,
            String       nis_event_dt){
        this.ibflag       = ibflag      ;
        this.page_rows    = page_rows   ;
        this.conti_cd     = conti_cd    ;
        this.conti_desc   = conti_desc  ;
        this.conti_credt  = conti_credt ;
        this.conti_updt   = conti_updt  ;
        this.conti_authid = conti_authid;
        this.conti_delind = conti_delind;
        this.nis_event_dt = nis_event_dt;
    }

    // getter method is proceeding ..
    public String       getIbflag      (){    return ibflag          ;    }
    public String       getPage_rows   (){    return page_rows       ;    }
    public String       getConti_cd    (){    return conti_cd        ;    }
    public String       getConti_desc  (){    return conti_desc      ;    }
    public String       getConti_credt (){    return conti_credt     ;    }
    public String       getConti_updt  (){    return conti_updt      ;    }
    public String       getConti_authid(){    return conti_authid    ;    }
    public String       getConti_delind(){    return conti_delind    ;    }
    public String       getNis_event_dt(){    return nis_event_dt    ;    }

    // setter method is proceeding ..
    public void setIbflag      ( String       ibflag       ){    this.ibflag       = ibflag          ;    }
    public void setPage_rows   ( String       page_rows    ){    this.page_rows    = page_rows       ;    }
    public void setConti_cd    ( String       conti_cd     ){    this.conti_cd     = conti_cd        ;    }
    public void setConti_desc  ( String       conti_desc   ){    this.conti_desc   = conti_desc      ;    }
    public void setConti_credt ( String       conti_credt  ){    this.conti_credt  = conti_credt     ;    }
    public void setConti_updt  ( String       conti_updt   ){    this.conti_updt   = conti_updt      ;    }
    public void setConti_authid( String       conti_authid ){    this.conti_authid = conti_authid    ;    }
    public void setConti_delind( String       conti_delind ){    this.conti_delind = conti_delind    ;    }
    public void setNis_event_dt( String       nis_event_dt ){    this.nis_event_dt = nis_event_dt    ;    }

    public static CONTI fromRequest(HttpServletRequest request) {
        CONTI model = new CONTI();
        try {
            model.setIbflag          (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
            model.setPage_rows       (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
            model.setConti_cd        (JSPUtil.getParameter(request, "conti_cd            ".trim(), ""));
            model.setConti_desc      (JSPUtil.getParameter(request, "conti_desc          ".trim(), ""));
            model.setConti_credt     (JSPUtil.getParameter(request, "conti_credt         ".trim(), ""));
            model.setConti_updt      (JSPUtil.getParameter(request, "conti_updt          ".trim(), ""));
            model.setConti_authid    (JSPUtil.getParameter(request, "conti_authid        ".trim(), ""));
            model.setConti_delind    (JSPUtil.getParameter(request, "conti_delind        ".trim(), ""));
            model.setNis_event_dt    (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        CONTI model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
            String[] conti_cd     =  (JSPUtil.getParameter(request, "conti_cd            ".trim(), length));
            String[] conti_desc   =  (JSPUtil.getParameter(request, "conti_desc          ".trim(), length));
            String[] conti_credt  =  (JSPUtil.getParameter(request, "conti_credt         ".trim(), length));
            String[] conti_updt   =  (JSPUtil.getParameter(request, "conti_updt          ".trim(), length));
            String[] conti_authid =  (JSPUtil.getParameter(request, "conti_authid        ".trim(), length));
            String[] conti_delind =  (JSPUtil.getParameter(request, "conti_delind        ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CONTI();
                model.setIbflag                (ibflag          [i]);
                model.setPage_rows             (page_rows       [i]);
                model.setConti_cd              (conti_cd        [i]);
                model.setConti_desc            (conti_desc      [i]);
                model.setConti_credt           (conti_credt     [i]);
                model.setConti_updt            (conti_updt      [i]);
                model.setConti_authid          (conti_authid    [i]);
                model.setConti_delind          (conti_delind    [i]);
                model.setNis_event_dt          (nis_event_dt    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        CONTI model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
            String[] conti_cd     =  (JSPUtil.getParameter(request, prefix + "conti_cd            ".trim(), length));
            String[] conti_desc   =  (JSPUtil.getParameter(request, prefix + "conti_desc          ".trim(), length));
            String[] conti_credt  =  (JSPUtil.getParameter(request, prefix + "conti_credt         ".trim(), length));
            String[] conti_updt   =  (JSPUtil.getParameter(request, prefix + "conti_updt          ".trim(), length));
            String[] conti_authid =  (JSPUtil.getParameter(request, prefix + "conti_authid        ".trim(), length));
            String[] conti_delind =  (JSPUtil.getParameter(request, prefix + "conti_delind        ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, prefix + "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CONTI();
                model.setIbflag                ( ibflag          [i]);
                model.setPage_rows             ( page_rows       [i]);
                model.setConti_cd              ( conti_cd        [i]);
                model.setConti_desc            ( conti_desc      [i]);
                model.setConti_credt           ( conti_credt     [i]);
                model.setConti_updt            ( conti_updt      [i]);
                model.setConti_authid          ( conti_authid    [i]);
                model.setConti_delind          ( conti_delind    [i]);
                model.setNis_event_dt          ( nis_event_dt    [i]);
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
