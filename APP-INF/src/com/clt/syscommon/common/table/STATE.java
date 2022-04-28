/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : STATE.java
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
 */public final class STATE implements java.io.Serializable {

    private String       ibflag       = "";
    private String       page_rows    = "";
    private String       cnt_cd       = "";
    private String       state_cd     = "";
    private String       state_nm     = "";
    private String       state_delind = "";
    private String       state_credt  = "";
    private String       state_updt   = "";
    private String       nis_event_dt = "";

    public STATE(){}

    public STATE(
            String       ibflag      ,
            String       page_rows   ,
            String       cnt_cd      ,
            String       state_cd    ,
            String       state_nm    ,
            String       state_delind,
            String       state_credt ,
            String       state_updt  ,
            String       nis_event_dt){
        this.ibflag       = ibflag      ;
        this.page_rows    = page_rows   ;
        this.cnt_cd       = cnt_cd      ;
        this.state_cd     = state_cd    ;
        this.state_nm     = state_nm    ;
        this.state_delind = state_delind;
        this.state_credt  = state_credt ;
        this.state_updt   = state_updt  ;
        this.nis_event_dt = nis_event_dt;
    }

    // getter method is proceeding ..
    public String       getIbflag      (){    return ibflag          ;    }
    public String       getPage_rows   (){    return page_rows       ;    }
    public String       getCnt_cd      (){    return cnt_cd          ;    }
    public String       getState_cd    (){    return state_cd        ;    }
    public String       getState_nm    (){    return state_nm        ;    }
    public String       getState_delind(){    return state_delind    ;    }
    public String       getState_credt (){    return state_credt     ;    }
    public String       getState_updt  (){    return state_updt      ;    }
    public String       getNis_event_dt(){    return nis_event_dt    ;    }

    // setter method is proceeding ..
    public void setIbflag      ( String       ibflag       ){    this.ibflag       = ibflag          ;    }
    public void setPage_rows   ( String       page_rows    ){    this.page_rows    = page_rows       ;    }
    public void setCnt_cd      ( String       cnt_cd       ){    this.cnt_cd       = cnt_cd          ;    }
    public void setState_cd    ( String       state_cd     ){    this.state_cd     = state_cd        ;    }
    public void setState_nm    ( String       state_nm     ){    this.state_nm     = state_nm        ;    }
    public void setState_delind( String       state_delind ){    this.state_delind = state_delind    ;    }
    public void setState_credt ( String       state_credt  ){    this.state_credt  = state_credt     ;    }
    public void setState_updt  ( String       state_updt   ){    this.state_updt   = state_updt      ;    }
    public void setNis_event_dt( String       nis_event_dt ){    this.nis_event_dt = nis_event_dt    ;    }

    public static STATE fromRequest(HttpServletRequest request) {
        STATE model = new STATE();
        try {
            model.setIbflag          (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
            model.setPage_rows       (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
            model.setCnt_cd          (JSPUtil.getParameter(request, "cnt_cd              ".trim(), ""));
            model.setState_cd        (JSPUtil.getParameter(request, "state_cd            ".trim(), ""));
            model.setState_nm        (JSPUtil.getParameter(request, "state_nm            ".trim(), ""));
            model.setState_delind    (JSPUtil.getParameter(request, "state_delind        ".trim(), ""));
            model.setState_credt     (JSPUtil.getParameter(request, "state_credt         ".trim(), ""));
            model.setState_updt      (JSPUtil.getParameter(request, "state_updt          ".trim(), ""));
            model.setNis_event_dt    (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        STATE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
            String[] cnt_cd       =  (JSPUtil.getParameter(request, "cnt_cd              ".trim(), length));
            String[] state_cd     =  (JSPUtil.getParameter(request, "state_cd            ".trim(), length));
            String[] state_nm     =  (JSPUtil.getParameter(request, "state_nm            ".trim(), length));
            String[] state_delind =  (JSPUtil.getParameter(request, "state_delind        ".trim(), length));
            String[] state_credt  =  (JSPUtil.getParameter(request, "state_credt         ".trim(), length));
            String[] state_updt   =  (JSPUtil.getParameter(request, "state_updt          ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new STATE();
                model.setIbflag                (ibflag          [i]);
                model.setPage_rows             (page_rows       [i]);
                model.setCnt_cd                (cnt_cd          [i]);
                model.setState_cd              (state_cd        [i]);
                model.setState_nm              (state_nm        [i]);
                model.setState_delind          (state_delind    [i]);
                model.setState_credt           (state_credt     [i]);
                model.setState_updt            (state_updt      [i]);
                model.setNis_event_dt          (nis_event_dt    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        STATE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
            String[] cnt_cd       =  (JSPUtil.getParameter(request, prefix + "cnt_cd              ".trim(), length));
            String[] state_cd     =  (JSPUtil.getParameter(request, prefix + "state_cd            ".trim(), length));
            String[] state_nm     =  (JSPUtil.getParameter(request, prefix + "state_nm            ".trim(), length));
            String[] state_delind =  (JSPUtil.getParameter(request, prefix + "state_delind        ".trim(), length));
            String[] state_credt  =  (JSPUtil.getParameter(request, prefix + "state_credt         ".trim(), length));
            String[] state_updt   =  (JSPUtil.getParameter(request, prefix + "state_updt          ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, prefix + "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new STATE();
                model.setIbflag                ( ibflag          [i]);
                model.setPage_rows             ( page_rows       [i]);
                model.setCnt_cd                ( cnt_cd          [i]);
                model.setState_cd              ( state_cd        [i]);
                model.setState_nm              ( state_nm        [i]);
                model.setState_delind          ( state_delind    [i]);
                model.setState_credt           ( state_credt     [i]);
                model.setState_updt            ( state_updt      [i]);
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
