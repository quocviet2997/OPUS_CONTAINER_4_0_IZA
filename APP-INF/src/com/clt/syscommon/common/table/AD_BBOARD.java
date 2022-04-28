package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 *  1. 기능 : Table Value Ojbect <p>
 *  2. 처리개요 : <p>
 *    - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p>
 *    - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p>
 *  3. 주의사항 : <p>
 *
 *  @author : 개발자
 *  @version : v1.0.0
 *  @see : 관련 Event , HTMLAction 참조
 *  @since : JDK 1.4 or EJB 2.0
 **/
public final class AD_BBOARD implements java.io.Serializable {
    private String      ibflag      = "";
    private String      bb_no       = "";
    private String      subject     = "";
    private String      content     = "";
    private String      regno       = "";
    private String      rgstry_user = "";
    private String      rgstry_dt   = "";
    private String      update_user = "";
    private String      update_dt   = "";
    private String      search_num   = "";
    private String      grp         = "";
    private String      ref         = "";
    private String      step        = "";
    private String      del_flg     = "";

    public AD_BBOARD(){}

    public AD_BBOARD(
            String      ibflag     ,
            String      bb_no      ,
            String      subject    ,
            String      content    ,
            String      regno      ,
            String      rgstry_user,
            String      rgstry_dt  ,
            String      update_user,
            String      update_dt  ,
            String      search_num  ,
            String      grp        ,
            String      ref        ,
            String      step       ,
            String      del_flg    ){
        this.ibflag      = ibflag     ;
        this.bb_no       = bb_no      ;
        this.subject     = subject    ;
        this.content     = content    ;
        this.regno       = regno      ;
        this.rgstry_user = rgstry_user;
        this.rgstry_dt   = rgstry_dt  ;
        this.update_user = update_user;
        this.update_dt   = update_dt  ;
        this.search_num   = search_num  ;
        this.grp         = grp        ;
        this.ref         = ref        ;
        this.step        = step       ;
        this.del_flg     = del_flg    ;
    }

    // getter method is proceeding ..
    public String      getIbflag     (){    return ibflag         ;    }
    public String      getBb_no      (){    return bb_no          ;    }
    public String      getSubject    (){    return subject        ;    }
    public String      getContent    (){    return content        ;    }
    public String      getRegno      (){    return regno          ;    }
    public String      getRgstry_user(){    return rgstry_user    ;    }
    public String      getRgstry_dt  (){    return rgstry_dt      ;    }
    public String      getUpdate_user(){    return update_user    ;    }
    public String      getUpdate_dt  (){    return update_dt      ;    }
    public String      getSearch_num (){    return search_num     ;    }
    public String      getGrp        (){    return grp            ;    }
    public String      getRef        (){    return ref            ;    }
    public String      getStep       (){    return step           ;    }
    public String      getDel_flg    (){    return del_flg        ;    }

    // setter method is proceeding ..
    public void setIbflag     ( String      ibflag      ){    this.ibflag      = ibflag         ;    }
    public void setBb_no      ( String      bb_no       ){    this.bb_no       = bb_no          ;    }
    public void setSubject    ( String      subject     ){    this.subject     = subject        ;    }
    public void setContent    ( String      content     ){    this.content     = content        ;    }
    public void setRegno      ( String      regno       ){    this.regno       = regno          ;    }
    public void setRgstry_user( String      rgstry_user ){    this.rgstry_user = rgstry_user    ;    }
    public void setRgstry_dt  ( String      rgstry_dt   ){    this.rgstry_dt   = rgstry_dt      ;    }
    public void setUpdate_user( String      update_user ){    this.update_user = update_user    ;    }
    public void setUpdate_dt  ( String      update_dt   ){    this.update_dt   = update_dt      ;    }
    public void setSearch_num ( String      search_num  ){    this.search_num  = search_num     ;    }
    public void setGrp        ( String      grp         ){    this.grp         = grp            ;    }
    public void setRef        ( String      ref         ){    this.ref         = ref            ;    }
    public void setStep       ( String      step        ){    this.step        = step           ;    }
    public void setDel_flg    ( String      del_flg     ){    this.del_flg     = del_flg        ;    }

    public static AD_BBOARD fromRequest(HttpServletRequest request) {
        AD_BBOARD model = new AD_BBOARD();
        try {
            model.setIbflag         (JSPUtil.getParameter(request, "ibflag             ".trim(), ""));
            model.setBb_no          (JSPUtil.getParameter(request, "bb_no              ".trim(), ""));
            model.setSubject        (JSPUtil.getParameter(request, "subject            ".trim(), ""));
            model.setContent        (JSPUtil.getParameter(request, "content            ".trim(), ""));
            model.setRegno          (JSPUtil.getParameter(request, "regno              ".trim(), ""));
            model.setRgstry_user    (JSPUtil.getParameter(request, "rgstry_user        ".trim(), ""));
            model.setRgstry_dt      (JSPUtil.getParameter(request, "rgstry_dt          ".trim(), ""));
            model.setUpdate_user    (JSPUtil.getParameter(request, "update_user        ".trim(), ""));
            model.setUpdate_dt      (JSPUtil.getParameter(request, "update_dt          ".trim(), ""));
            model.setSearch_num     (JSPUtil.getParameter(request, "search_num         ".trim(), ""));
            model.setGrp            (JSPUtil.getParameter(request, "grp                ".trim(), ""));
            model.setRef            (JSPUtil.getParameter(request, "ref                ".trim(), ""));
            model.setStep           (JSPUtil.getParameter(request, "step               ".trim(), ""));
            model.setDel_flg        (JSPUtil.getParameter(request, "del_flg            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        AD_BBOARD model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag             ".trim(), length));
            String[] bb_no       =  (JSPUtil.getParameter(request, "bb_no              ".trim(), length));
            String[] subject     =  (JSPUtil.getParameter(request, "subject            ".trim(), length));
            String[] content     =  (JSPUtil.getParameter(request, "content            ".trim(), length));
            String[] regno       =  (JSPUtil.getParameter(request, "regno              ".trim(), length));
            String[] rgstry_user =  (JSPUtil.getParameter(request, "rgstry_user        ".trim(), length));
            String[] rgstry_dt   =  (JSPUtil.getParameter(request, "rgstry_dt          ".trim(), length));
            String[] update_user =  (JSPUtil.getParameter(request, "update_user        ".trim(), length));
            String[] update_dt   =  (JSPUtil.getParameter(request, "update_dt          ".trim(), length));
            String[] search_num  =  (JSPUtil.getParameter(request, "search_num         ".trim(), length));
            String[] grp         =  (JSPUtil.getParameter(request, "grp                ".trim(), length));
            String[] ref         =  (JSPUtil.getParameter(request, "ref                ".trim(), length));
            String[] step        =  (JSPUtil.getParameter(request, "step               ".trim(), length));
            String[] del_flg     =  (JSPUtil.getParameter(request, "del_flg            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new AD_BBOARD();
                model.setIbflag               (ibflag         [i]);
                model.setBb_no                (bb_no          [i]);
                model.setSubject              (subject        [i]);
                model.setContent              (content        [i]);
                model.setRegno                (regno          [i]);
                model.setRgstry_user          (rgstry_user    [i]);
                model.setRgstry_dt            (rgstry_dt      [i]);
                model.setUpdate_user          (update_user    [i]);
                model.setUpdate_dt            (update_dt      [i]);
                model.setSearch_num           (search_num     [i]);
                model.setGrp                  (grp            [i]);
                model.setRef                  (ref            [i]);
                model.setStep                 (step           [i]);
                model.setDel_flg              (del_flg        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        AD_BBOARD model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag             ".trim(), length));
            String[] bb_no       =  (JSPUtil.getParameter(request, "bb_no              ".trim(), length));
            String[] subject     =  (JSPUtil.getParameter(request, "subject            ".trim(), length));
            String[] content     =  (JSPUtil.getParameter(request, "content            ".trim(), length));
            String[] regno       =  (JSPUtil.getParameter(request, "regno              ".trim(), length));
            String[] rgstry_user =  (JSPUtil.getParameter(request, "rgstry_user        ".trim(), length));
            String[] rgstry_dt   =  (JSPUtil.getParameter(request, "rgstry_dt          ".trim(), length));
            String[] update_user =  (JSPUtil.getParameter(request, "update_user        ".trim(), length));
            String[] update_dt   =  (JSPUtil.getParameter(request, "update_dt          ".trim(), length));
            String[] search_num  =  (JSPUtil.getParameter(request, "search_num         ".trim(), length));
            String[] grp         =  (JSPUtil.getParameter(request, "grp                ".trim(), length));
            String[] ref         =  (JSPUtil.getParameter(request, "ref                ".trim(), length));
            String[] step        =  (JSPUtil.getParameter(request, "step               ".trim(), length));
            String[] del_flg     =  (JSPUtil.getParameter(request, "del_flg            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new AD_BBOARD();
                model.setIbflag               (ibflag         [i]);
                model.setBb_no                (bb_no          [i]);
                model.setSubject              (subject        [i]);
                model.setContent              (content        [i]);
                model.setRegno                (regno          [i]);
                model.setRgstry_user          (rgstry_user    [i]);
                model.setRgstry_dt            (rgstry_dt      [i]);
                model.setUpdate_user          (update_user    [i]);
                model.setUpdate_dt            (update_dt      [i]);
                model.setSearch_num           (search_num     [i]);
                model.setGrp                  (grp            [i]);
                model.setRef                  (ref            [i]);
                model.setStep                 (step           [i]);
                model.setDel_flg              (del_flg        [i]);
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
