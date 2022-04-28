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
 * ===================================
 * 4. 작성자/작성일 : 윤병화/2006.05.23
 * ===================================
 * 5. 수정사항
 * 5.1 요구사항 ID :
 * - 수정자/수정일 :
 * - 수정사유/내역 :
 * ===================================
 * <p/>
 * @author : 윤병화
 * @version : v1.0.0
 */
public final class CO_ZIPCODE implements java.io.Serializable {

    private String    ibflag    = "";
    private String    page_rows = "";
    private String    zipcode   = "";
    private String    sido      = "";
    private String    gugun     = "";
    private String    dong      = "";
    private String    bunji     = "";
    private String    seq       = "";
    private String    address       = "";
    

    public CO_ZIPCODE(){}

    public CO_ZIPCODE(
            String    ibflag   ,
            String    page_rows,
            String    zipcode  ,
            String    sido     ,
            String    gugun    ,
            String    dong     ,
            String    bunji    ,
            String    seq      ){
        this.ibflag    = ibflag   ;
        this.page_rows = page_rows;
        this.zipcode   = zipcode  ;
        this.sido      = sido     ;
        this.gugun     = gugun    ;
        this.dong      = dong     ;
        this.bunji     = bunji    ;
        this.seq       = seq      ;
    }

    // getter method is proceeding ..
    public String    getIbflag   (){    return ibflag       ;    }
    public String    getPage_rows(){    return page_rows    ;    }
    public String    getZipcode  (){    return zipcode      ;    }
    public String    getSido     (){    return sido         ;    }
    public String    getGugun    (){    return gugun        ;    }
    public String    getDong     (){    return dong         ;    }
    public String    getBunji    (){    return bunji        ;    }
    public String    getSeq      (){    return seq          ;    }
    public String    getAddress      (){    return address          ;    }

    // setter method is proceeding ..
    public void setIbflag   ( String    ibflag    ){    this.ibflag    = ibflag       ;    }
    public void setPage_rows( String    page_rows ){    this.page_rows = page_rows    ;    }
    public void setZipcode  ( String    zipcode   ){    this.zipcode   = zipcode      ;    }
    public void setSido     ( String    sido      ){    this.sido      = sido         ;    }
    public void setGugun    ( String    gugun     ){    this.gugun     = gugun        ;    }
    public void setDong     ( String    dong      ){    this.dong      = dong         ;    }
    public void setBunji    ( String    bunji     ){    this.bunji     = bunji        ;    }
    public void setSeq      ( String    seq       ){    this.seq       = seq          ;    }
    public void setAddress      ( String    address       ){    this.address       = address          ;    }
    
    public static CO_ZIPCODE fromRequest(HttpServletRequest request) {
        CO_ZIPCODE model = new CO_ZIPCODE();
        try {
            model.setIbflag       (JSPUtil.getParameter(request, "ibflag           ".trim(), ""));
            model.setPage_rows    (JSPUtil.getParameter(request, "page_rows        ".trim(), ""));
            model.setZipcode      (JSPUtil.getParameter(request, "zipcode          ".trim(), ""));
            model.setSido         (JSPUtil.getParameter(request, "sido             ".trim(), ""));
            model.setGugun        (JSPUtil.getParameter(request, "gugun            ".trim(), ""));
            model.setDong         (JSPUtil.getParameter(request, "dong             ".trim(), ""));
            model.setBunji        (JSPUtil.getParameter(request, "bunji            ".trim(), ""));
            model.setSeq          (JSPUtil.getParameter(request, "seq              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        CO_ZIPCODE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] zipcode   =  (JSPUtil.getParameter(request, "zipcode          ".trim(), length));
            String[] sido      =  (JSPUtil.getParameter(request, "sido             ".trim(), length));
            String[] gugun     =  (JSPUtil.getParameter(request, "gugun            ".trim(), length));
            String[] dong      =  (JSPUtil.getParameter(request, "dong             ".trim(), length));
            String[] bunji     =  (JSPUtil.getParameter(request, "bunji            ".trim(), length));
            String[] seq       =  (JSPUtil.getParameter(request, "seq              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CO_ZIPCODE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setZipcode            (zipcode      [i]);
                model.setSido               (sido         [i]);
                model.setGugun              (gugun        [i]);
                model.setDong               (dong         [i]);
                model.setBunji              (bunji        [i]);
                model.setSeq                (seq          [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        CO_ZIPCODE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] zipcode   =  (JSPUtil.getParameter(request, "zipcode          ".trim(), length));
            String[] sido      =  (JSPUtil.getParameter(request, "sido             ".trim(), length));
            String[] gugun     =  (JSPUtil.getParameter(request, "gugun            ".trim(), length));
            String[] dong      =  (JSPUtil.getParameter(request, "dong             ".trim(), length));
            String[] bunji     =  (JSPUtil.getParameter(request, "bunji            ".trim(), length));
            String[] seq       =  (JSPUtil.getParameter(request, "seq              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CO_ZIPCODE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setZipcode            (zipcode      [i]);
                model.setSido               (sido         [i]);
                model.setGugun              (gugun        [i]);
                model.setDong               (dong         [i]);
                model.setBunji              (bunji        [i]);
                model.setSeq                (seq          [i]);
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
