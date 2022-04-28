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
public final class TB_USER_RELATIVE implements java.io.Serializable {

    private String    ibflag    = "";
    private String    page_rows = "";
    private String    empno     = "";
    private String    fmlno     = "";
    private String    fmlname   = "";
    private String    relative  = "";

    public TB_USER_RELATIVE(){}

    public TB_USER_RELATIVE(
            String    ibflag   ,
            String    page_rows,
            String    empno    ,
            String    fmlno    ,
            String    fmlname  ,
            String    relative ){
        this.ibflag    = ibflag   ;
        this.page_rows = page_rows;
        this.empno     = empno    ;
        this.fmlno     = fmlno    ;
        this.fmlname   = fmlname  ;
        this.relative  = relative ;
    }

    // getter method is proceeding ..
    public String    getIbflag   (){    return ibflag       ;    }
    public String    getPage_rows(){    return page_rows    ;    }
    public String    getEmpno    (){    return empno        ;    }
    public String    getFmlno    (){    return fmlno        ;    }
    public String    getFmlname  (){    return fmlname      ;    }
    public String    getRelative (){    return relative     ;    }

    // setter method is proceeding ..
    public void setIbflag   ( String    ibflag    ){    this.ibflag    = ibflag       ;    }
    public void setPage_rows( String    page_rows ){    this.page_rows = page_rows    ;    }
    public void setEmpno    ( String    empno     ){    this.empno     = empno        ;    }
    public void setFmlno    ( String    fmlno     ){    this.fmlno     = fmlno        ;    }
    public void setFmlname  ( String    fmlname   ){    this.fmlname   = fmlname      ;    }
    public void setRelative ( String    relative  ){    this.relative  = relative     ;    }

    public static TB_USER_RELATIVE fromRequest(HttpServletRequest request) {
        TB_USER_RELATIVE model = new TB_USER_RELATIVE();
        try {
            model.setIbflag       (JSPUtil.getParameter(request, "ibflag           ".trim(), ""));
            model.setPage_rows    (JSPUtil.getParameter(request, "page_rows        ".trim(), ""));
            model.setEmpno        (JSPUtil.getParameter(request, "empno            ".trim(), ""));
            model.setFmlno        (JSPUtil.getParameter(request, "fmlno            ".trim(), ""));
            model.setFmlname      (JSPUtil.getParameter(request, "fmlname          ".trim(), ""));
            model.setRelative     (JSPUtil.getParameter(request, "relative         ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_USER_RELATIVE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] empno     =  (JSPUtil.getParameter(request, "empno            ".trim(), length));
            String[] fmlno     =  (JSPUtil.getParameter(request, "fmlno            ".trim(), length));
            String[] fmlname   =  (JSPUtil.getParameter(request, "fmlname          ".trim(), length));
            String[] relative  =  (JSPUtil.getParameter(request, "relative         ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_USER_RELATIVE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setEmpno              (empno        [i]);
                model.setFmlno              (fmlno        [i]);
                model.setFmlname            (fmlname      [i]);
                model.setRelative           (relative     [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        TB_USER_RELATIVE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] empno     =  (JSPUtil.getParameter(request, "empno            ".trim(), length));
            String[] fmlno     =  (JSPUtil.getParameter(request, "fmlno            ".trim(), length));
            String[] fmlname   =  (JSPUtil.getParameter(request, "fmlname          ".trim(), length));
            String[] relative  =  (JSPUtil.getParameter(request, "relative         ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_USER_RELATIVE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setEmpno              (empno        [i]);
                model.setFmlno              (fmlno        [i]);
                model.setFmlname            (fmlname      [i]);
                model.setRelative           (relative     [i]);
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
