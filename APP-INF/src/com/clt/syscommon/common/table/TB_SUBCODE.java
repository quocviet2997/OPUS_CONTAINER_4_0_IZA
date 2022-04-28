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
 * 4. 작성자/작성일 : Kildong_hong/2006.06.27<br>
 * ===================================<br>
 * 5. 수정사항<p>
 * 5.1 요구사항 ID :<p>
 * - 수정자/수정일 :<p>
 * - 수정사유/내역 :<p>
 * ===================================<br>
 * <p/>
 * @author : Kildong_hong
 * @version : v1.0.0
 */
public final class TB_SUBCODE implements java.io.Serializable {

    private String    ibflag    = "";
    private String    page_rows = "";
    private String    code      = "";
    private String    sub_code  = "";
    private String    name      = "";
    private String    memo      = "";
    private String    use_yn    = "";

    public TB_SUBCODE(){}

    public TB_SUBCODE(
            String    ibflag   ,
            String    page_rows,
            String    code     ,
            String    sub_code ,
            String    name     ,
            String    memo     ,
            String    use_yn   ){
        this.ibflag    = ibflag   ;
        this.page_rows = page_rows;
        this.code      = code     ;
        this.sub_code  = sub_code ;
        this.name      = name     ;
        this.memo      = memo     ;
        this.use_yn    = use_yn   ;
    }

    // getter method is proceeding ..
    public String    getIbflag   (){    return ibflag       ;    }
    public String    getPage_rows(){    return page_rows    ;    }
    public String    getCode     (){    return code         ;    }
    public String    getSub_code (){    return sub_code     ;    }
    public String    getName     (){    return name         ;    }
    public String    getMemo     (){    return memo         ;    }
    public String    getUse_yn   (){    return use_yn       ;    }

    // setter method is proceeding ..
    public void setIbflag   ( String    ibflag    ){    this.ibflag    = ibflag       ;    }
    public void setPage_rows( String    page_rows ){    this.page_rows = page_rows    ;    }
    public void setCode     ( String    code      ){    this.code      = code         ;    }
    public void setSub_code ( String    sub_code  ){    this.sub_code  = sub_code     ;    }
    public void setName     ( String    name      ){    this.name      = name         ;    }
    public void setMemo     ( String    memo      ){    this.memo      = memo         ;    }
    public void setUse_yn   ( String    use_yn    ){    this.use_yn    = use_yn       ;    }

    public static TB_SUBCODE fromRequest(HttpServletRequest request) {
        TB_SUBCODE model = new TB_SUBCODE();
        try {
            model.setIbflag       (JSPUtil.getParameter(request, "ibflag           ".trim(), ""));
            model.setPage_rows    (JSPUtil.getParameter(request, "page_rows        ".trim(), ""));
            model.setCode         (JSPUtil.getParameter(request, "code             ".trim(), ""));
            model.setSub_code     (JSPUtil.getParameter(request, "sub_code         ".trim(), ""));
            model.setName         (JSPUtil.getParameter(request, "name             ".trim(), ""));
            model.setMemo         (JSPUtil.getParameter(request, "memo             ".trim(), ""));
            model.setUse_yn       (JSPUtil.getParameter(request, "use_yn           ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_SUBCODE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] code      =  (JSPUtil.getParameter(request, "code             ".trim(), length));
            String[] sub_code  =  (JSPUtil.getParameter(request, "sub_code         ".trim(), length));
            String[] name      =  (JSPUtil.getParameter(request, "name             ".trim(), length));
            String[] memo      =  (JSPUtil.getParameter(request, "memo             ".trim(), length));
            String[] use_yn    =  (JSPUtil.getParameter(request, "use_yn           ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_SUBCODE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setCode               (code         [i]);
                model.setSub_code           (sub_code     [i]);
                model.setName               (name         [i]);
                model.setMemo               (memo         [i]);
                model.setUse_yn             (use_yn       [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        TB_SUBCODE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] code      =  (JSPUtil.getParameter(request, "code             ".trim(), length));
            String[] sub_code  =  (JSPUtil.getParameter(request, "sub_code         ".trim(), length));
            String[] name      =  (JSPUtil.getParameter(request, "name             ".trim(), length));
            String[] memo      =  (JSPUtil.getParameter(request, "memo             ".trim(), length));
            String[] use_yn    =  (JSPUtil.getParameter(request, "use_yn           ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_SUBCODE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setCode               (code         [i]);
                model.setSub_code           (sub_code     [i]);
                model.setName               (name         [i]);
                model.setMemo               (memo         [i]);
                model.setUse_yn             (use_yn       [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
    	if(prefix != null && !prefix.equals("") && !prefix.endsWith("_"))
    		prefix = prefix + "_";
        TB_SUBCODE model = null;
        Collection models = new ArrayList();
        try {
            int length = request.getParameterValues(prefix+"ibflag").length;
            String[] ibflag    =  (JSPUtil.getParameter(request, prefix+"ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, prefix+"page_rows        ".trim(), length));
            String[] code      =  (JSPUtil.getParameter(request, prefix+"code             ".trim(), length));
            String[] sub_code  =  (JSPUtil.getParameter(request, prefix+"sub_code         ".trim(), length));
            String[] name      =  (JSPUtil.getParameter(request, prefix+"name             ".trim(), length));
            String[] memo      =  (JSPUtil.getParameter(request, prefix+"memo             ".trim(), length));
            String[] use_yn    =  (JSPUtil.getParameter(request, prefix+"use_yn           ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_SUBCODE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setCode               (code         [i]);
                model.setSub_code           (sub_code     [i]);
                model.setName               (name         [i]);
                model.setMemo               (memo         [i]);
                model.setUse_yn             (use_yn       [i]);
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
