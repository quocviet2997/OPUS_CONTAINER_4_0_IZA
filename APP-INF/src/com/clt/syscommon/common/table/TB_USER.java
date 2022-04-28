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
 * 4. 작성자/작성일 : 윤병화/2006.06.07<br>
 * ===================================<br>
 * 5. 수정사항<br>
 * 5.1 요구사항 ID :<br>
 * - 수정자/수정일 :<br>
 * - 수정사유/내역 :<br>
 * ===================================<br>
 * <p/>
 * @author : 윤병화
 * @version : v1.0.0
 */
public final class TB_USER implements java.io.Serializable {

    private String    ibflag    = "";
    private String    page_rows = "";
    private String    empno     = "";
    private String    empnm     = "";
    private String    pwd       = "";
    private String    empssno   = "";
    private String    enono     = "";
    private String    cphnno    = "";
    private String    ohstno    = "";
    private String    blgbrcd   = "";
    private String    email     = "";
    private String    jobtnm    = "";
    private String    bnkdynm   = "";
    private String    jclnm     = "";
    private String    usgyn     = "";
    private String    rgdt      = "";
    private String    rgempno   = "";
    private String    bfblgbrcd = "";

    public TB_USER(){}

    public TB_USER(
            String    ibflag   ,
            String    page_rows,
            String    empno    ,
            String    empnm    ,
            String    pwd      ,
            String    empssno  ,
            String    enono    ,
            String    cphnno   ,
            String    ohstno   ,
            String    blgbrcd  ,
            String    email    ,
            String    jobtnm   ,
            String    bnkdynm  ,
            String    jclnm    ,
            String    usgyn    ,
            String    rgdt     ,
            String    rgempno  ,
            String    bfblgbrcd){
        this.ibflag    = ibflag   ;
        this.page_rows = page_rows;
        this.empno     = empno    ;
        this.empnm     = empnm    ;
        this.pwd       = pwd      ;
        this.empssno   = empssno  ;
        this.enono     = enono    ;
        this.cphnno    = cphnno   ;
        this.ohstno    = ohstno   ;
        this.blgbrcd   = blgbrcd  ;
        this.email     = email    ;
        this.jobtnm    = jobtnm   ;
        this.bnkdynm   = bnkdynm  ;
        this.jclnm     = jclnm    ;
        this.usgyn     = usgyn    ;
        this.rgdt      = rgdt     ;
        this.rgempno   = rgempno  ;
        this.bfblgbrcd = bfblgbrcd;
    }

    // getter method is proceeding ..
    public String    getIbflag   (){    return ibflag       ;    }
    public String    getPage_rows(){    return page_rows    ;    }
    public String    getEmpno    (){    return empno        ;    }
    public String    getEmpnm    (){    return empnm        ;    }
    public String    getPwd      (){    return pwd          ;    }
    public String    getEmpssno  (){    return empssno      ;    }
    public String    getEnono    (){    return enono        ;    }
    public String    getCphnno   (){    return cphnno       ;    }
    public String    getOhstno   (){    return ohstno       ;    }
    public String    getBlgbrcd  (){    return blgbrcd      ;    }
    public String    getEmail    (){    return email        ;    }
    public String    getJobtnm   (){    return jobtnm       ;    }
    public String    getBnkdynm  (){    return bnkdynm      ;    }
    public String    getJclnm    (){    return jclnm        ;    }
    public String    getUsgyn    (){    return usgyn        ;    }
    public String    getRgdt     (){    return rgdt         ;    }
    public String    getRgempno  (){    return rgempno      ;    }
    public String    getBfblgbrcd(){    return bfblgbrcd    ;    }

    // setter method is proceeding ..
    public void setIbflag   ( String    ibflag    ){    this.ibflag    = ibflag       ;    }
    public void setPage_rows( String    page_rows ){    this.page_rows = page_rows    ;    }
    public void setEmpno    ( String    empno     ){    this.empno     = empno        ;    }
    public void setEmpnm    ( String    empnm     ){    this.empnm     = empnm        ;    }
    public void setPwd      ( String    pwd       ){    this.pwd       = pwd          ;    }
    public void setEmpssno  ( String    empssno   ){    this.empssno   = empssno      ;    }
    public void setEnono    ( String    enono     ){    this.enono     = enono        ;    }
    public void setCphnno   ( String    cphnno    ){    this.cphnno    = cphnno       ;    }
    public void setOhstno   ( String    ohstno    ){    this.ohstno    = ohstno       ;    }
    public void setBlgbrcd  ( String    blgbrcd   ){    this.blgbrcd   = blgbrcd      ;    }
    public void setEmail    ( String    email     ){    this.email     = email        ;    }
    public void setJobtnm   ( String    jobtnm    ){    this.jobtnm    = jobtnm       ;    }
    public void setBnkdynm  ( String    bnkdynm   ){    this.bnkdynm   = bnkdynm      ;    }
    public void setJclnm    ( String    jclnm     ){    this.jclnm     = jclnm        ;    }
    public void setUsgyn    ( String    usgyn     ){    this.usgyn     = usgyn        ;    }
    public void setRgdt     ( String    rgdt      ){    this.rgdt      = rgdt         ;    }
    public void setRgempno  ( String    rgempno   ){    this.rgempno   = rgempno      ;    }
    public void setBfblgbrcd( String    bfblgbrcd ){    this.bfblgbrcd = bfblgbrcd    ;    }

    public static TB_USER fromRequest(HttpServletRequest request) {
        TB_USER model = new TB_USER();
        try {
            model.setIbflag       (JSPUtil.getParameter(request, "ibflag           ".trim(), ""));
            model.setPage_rows    (JSPUtil.getParameter(request, "page_rows        ".trim(), ""));
            model.setEmpno        (JSPUtil.getParameter(request, "empno            ".trim(), ""));
            model.setEmpnm        (JSPUtil.getParameter(request, "empnm            ".trim(), ""));
            model.setPwd          (JSPUtil.getParameter(request, "pwd              ".trim(), ""));
            model.setEmpssno      (JSPUtil.getParameter(request, "empssno          ".trim(), ""));
            model.setEnono        (JSPUtil.getParameter(request, "enono            ".trim(), ""));
            model.setCphnno       (JSPUtil.getParameter(request, "cphnno           ".trim(), ""));
            model.setOhstno       (JSPUtil.getParameter(request, "ohstno           ".trim(), ""));
            model.setBlgbrcd      (JSPUtil.getParameter(request, "blgbrcd          ".trim(), ""));
            model.setEmail        (JSPUtil.getParameter(request, "email            ".trim(), ""));
            model.setJobtnm       (JSPUtil.getParameter(request, "jobtnm           ".trim(), ""));
            model.setBnkdynm      (JSPUtil.getParameter(request, "bnkdynm          ".trim(), ""));
            model.setJclnm        (JSPUtil.getParameter(request, "jclnm            ".trim(), ""));
            model.setUsgyn        (JSPUtil.getParameter(request, "usgyn            ".trim(), ""));
            model.setRgdt         (JSPUtil.getParameter(request, "rgdt             ".trim(), ""));
            model.setRgempno      (JSPUtil.getParameter(request, "rgempno          ".trim(), ""));
            model.setBfblgbrcd    (JSPUtil.getParameter(request, "bfblgbrcd        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_USER model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] empno     =  (JSPUtil.getParameter(request, "empno            ".trim(), length));
            String[] empnm     =  (JSPUtil.getParameter(request, "empnm            ".trim(), length));
            String[] pwd       =  (JSPUtil.getParameter(request, "pwd              ".trim(), length));
            String[] empssno   =  (JSPUtil.getParameter(request, "empssno          ".trim(), length));
            String[] enono     =  (JSPUtil.getParameter(request, "enono            ".trim(), length));
            String[] cphnno    =  (JSPUtil.getParameter(request, "cphnno           ".trim(), length));
            String[] ohstno    =  (JSPUtil.getParameter(request, "ohstno           ".trim(), length));
            String[] blgbrcd   =  (JSPUtil.getParameter(request, "blgbrcd          ".trim(), length));
            String[] email     =  (JSPUtil.getParameter(request, "email            ".trim(), length));
            String[] jobtnm    =  (JSPUtil.getParameter(request, "jobtnm           ".trim(), length));
            String[] bnkdynm   =  (JSPUtil.getParameter(request, "bnkdynm          ".trim(), length));
            String[] jclnm     =  (JSPUtil.getParameter(request, "jclnm            ".trim(), length));
            String[] usgyn     =  (JSPUtil.getParameter(request, "usgyn            ".trim(), length));
            String[] rgdt      =  (JSPUtil.getParameter(request, "rgdt             ".trim(), length));
            String[] rgempno   =  (JSPUtil.getParameter(request, "rgempno          ".trim(), length));
            String[] bfblgbrcd =  (JSPUtil.getParameter(request, "bfblgbrcd        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_USER();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setEmpno              (empno        [i]);
                model.setEmpnm              (empnm        [i]);
                model.setPwd                (pwd          [i]);
                model.setEmpssno            (empssno      [i]);
                model.setEnono              (enono        [i]);
                model.setCphnno             (cphnno       [i]);
                model.setOhstno             (ohstno       [i]);
                model.setBlgbrcd            (blgbrcd      [i]);
                model.setEmail              (email        [i]);
                model.setJobtnm             (jobtnm       [i]);
                model.setBnkdynm            (bnkdynm      [i]);
                model.setJclnm              (jclnm        [i]);
                model.setUsgyn              (usgyn        [i]);
                model.setRgdt               (rgdt         [i]);
                model.setRgempno            (rgempno      [i]);
                model.setBfblgbrcd          (bfblgbrcd    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        TB_USER model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] empno     =  (JSPUtil.getParameter(request, "empno            ".trim(), length));
            String[] empnm     =  (JSPUtil.getParameter(request, "empnm            ".trim(), length));
            String[] pwd       =  (JSPUtil.getParameter(request, "pwd              ".trim(), length));
            String[] empssno   =  (JSPUtil.getParameter(request, "empssno          ".trim(), length));
            String[] enono     =  (JSPUtil.getParameter(request, "enono            ".trim(), length));
            String[] cphnno    =  (JSPUtil.getParameter(request, "cphnno           ".trim(), length));
            String[] ohstno    =  (JSPUtil.getParameter(request, "ohstno           ".trim(), length));
            String[] blgbrcd   =  (JSPUtil.getParameter(request, "blgbrcd          ".trim(), length));
            String[] email     =  (JSPUtil.getParameter(request, "email            ".trim(), length));
            String[] jobtnm    =  (JSPUtil.getParameter(request, "jobtnm           ".trim(), length));
            String[] bnkdynm   =  (JSPUtil.getParameter(request, "bnkdynm          ".trim(), length));
            String[] jclnm     =  (JSPUtil.getParameter(request, "jclnm            ".trim(), length));
            String[] usgyn     =  (JSPUtil.getParameter(request, "usgyn            ".trim(), length));
            String[] rgdt      =  (JSPUtil.getParameter(request, "rgdt             ".trim(), length));
            String[] rgempno   =  (JSPUtil.getParameter(request, "rgempno          ".trim(), length));
            String[] bfblgbrcd =  (JSPUtil.getParameter(request, "bfblgbrcd        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_USER();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setEmpno              (empno        [i]);
                model.setEmpnm              (empnm        [i]);
                model.setPwd                (pwd          [i]);
                model.setEmpssno            (empssno      [i]);
                model.setEnono              (enono        [i]);
                model.setCphnno             (cphnno       [i]);
                model.setOhstno             (ohstno       [i]);
                model.setBlgbrcd            (blgbrcd      [i]);
                model.setEmail              (email        [i]);
                model.setJobtnm             (jobtnm       [i]);
                model.setBnkdynm            (bnkdynm      [i]);
                model.setJclnm              (jclnm        [i]);
                model.setUsgyn              (usgyn        [i]);
                model.setRgdt               (rgdt         [i]);
                model.setRgempno            (rgempno      [i]);
                model.setBfblgbrcd          (bfblgbrcd    [i]);
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
