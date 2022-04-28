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
 *
 * @author : 장회수
 * @version : v1.0.0
 */
public final class TB_PROTOTYPE implements java.io.Serializable {

    private String    ibflag    = "";
    private String    page_rows = "";
    private String    aaaaa     = "";
    private String    bbbbb     = "";
    private String    ccccc     = "";
    private String    ddddd     = "";
    private String    eeeee     = "";
    private String    fffff     = "";
    private String    ggggg     = "";
    private String    hhhhh     = "";
    private String    iiiii     = "";
    private String    jjjjj     = "";
    private String    kkkkk     = "";

    public TB_PROTOTYPE(){}

    public TB_PROTOTYPE(
            String    ibflag   ,
            String    page_rows,
            String    aaaaa    ,
            String    bbbbb    ,
            String    ccccc    ,
            String    ddddd    ,
            String    eeeee    ,
            String    fffff    ,
            String    ggggg    ,
            String    hhhhh    ,
            String    iiiii    ,
            String    jjjjj    ,
            String    kkkkk    ){
        this.ibflag    = ibflag   ;
        this.page_rows = page_rows;
        this.aaaaa     = aaaaa    ;
        this.bbbbb     = bbbbb    ;
        this.ccccc     = ccccc    ;
        this.ddddd     = ddddd    ;
        this.eeeee     = eeeee    ;
        this.fffff     = fffff    ;
        this.ggggg     = ggggg    ;
        this.hhhhh     = hhhhh    ;
        this.iiiii     = iiiii    ;
        this.jjjjj     = jjjjj    ;
        this.kkkkk     = kkkkk    ;
    }

    // getter method is proceeding ..
    public String    getIbflag   (){    return ibflag       ;    }
    public String    getPage_rows(){    return page_rows    ;    }
    public String    getAaaaa    (){    return aaaaa        ;    }
    public String    getBbbbb    (){    return bbbbb        ;    }
    public String    getCcccc    (){    return ccccc        ;    }
    public String    getDdddd    (){    return ddddd        ;    }
    public String    getEeeee    (){    return eeeee        ;    }
    public String    getFffff    (){    return fffff        ;    }
    public String    getGgggg    (){    return ggggg        ;    }
    public String    getHhhhh    (){    return hhhhh        ;    }
    public String    getIiiii    (){    return iiiii        ;    }
    public String    getJjjjj    (){    return jjjjj        ;    }
    public String    getKkkkk    (){    return kkkkk        ;    }

    // setter method is proceeding ..
    public void setIbflag   ( String    ibflag    ){    this.ibflag    = ibflag       ;    }
    public void setPage_rows( String    page_rows ){    this.page_rows = page_rows    ;    }
    public void setAaaaa    ( String    aaaaa     ){    this.aaaaa     = aaaaa        ;    }
    public void setBbbbb    ( String    bbbbb     ){    this.bbbbb     = bbbbb        ;    }
    public void setCcccc    ( String    ccccc     ){    this.ccccc     = ccccc        ;    }
    public void setDdddd    ( String    ddddd     ){    this.ddddd     = ddddd        ;    }
    public void setEeeee    ( String    eeeee     ){    this.eeeee     = eeeee        ;    }
    public void setFffff    ( String    fffff     ){    this.fffff     = fffff        ;    }
    public void setGgggg    ( String    ggggg     ){    this.ggggg     = ggggg        ;    }
    public void setHhhhh    ( String    hhhhh     ){    this.hhhhh     = hhhhh        ;    }
    public void setIiiii    ( String    iiiii     ){    this.iiiii     = iiiii        ;    }
    public void setJjjjj    ( String    jjjjj     ){    this.jjjjj     = jjjjj        ;    }
    public void setKkkkk    ( String    kkkkk     ){    this.kkkkk     = kkkkk        ;    }

    public static TB_PROTOTYPE fromRequest(HttpServletRequest request) {
        TB_PROTOTYPE model = new TB_PROTOTYPE();
        try {
            model.setIbflag       (JSPUtil.getParameter(request, "ibflag           ".trim(), ""));
            model.setPage_rows    (JSPUtil.getParameter(request, "page_rows        ".trim(), ""));
            model.setAaaaa        (JSPUtil.getParameter(request, "aaaaa            ".trim(), ""));
            model.setBbbbb        (JSPUtil.getParameter(request, "bbbbb            ".trim(), ""));
            model.setCcccc        (JSPUtil.getParameter(request, "ccccc            ".trim(), ""));
            model.setDdddd        (JSPUtil.getParameter(request, "ddddd            ".trim(), ""));
            model.setEeeee        (JSPUtil.getParameter(request, "eeeee            ".trim(), ""));
            model.setFffff        (JSPUtil.getParameter(request, "fffff            ".trim(), ""));
            model.setGgggg        (JSPUtil.getParameter(request, "ggggg            ".trim(), ""));
            model.setHhhhh        (JSPUtil.getParameter(request, "hhhhh            ".trim(), ""));
            model.setIiiii        (JSPUtil.getParameter(request, "iiiii            ".trim(), ""));
            model.setJjjjj        (JSPUtil.getParameter(request, "jjjjj            ".trim(), ""));
            model.setKkkkk        (JSPUtil.getParameter(request, "kkkkk            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_PROTOTYPE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] aaaaa     =  (JSPUtil.getParameter(request, "aaaaa            ".trim(), length));
            String[] bbbbb     =  (JSPUtil.getParameter(request, "bbbbb            ".trim(), length));
            String[] ccccc     =  (JSPUtil.getParameter(request, "ccccc            ".trim(), length));
            String[] ddddd     =  (JSPUtil.getParameter(request, "ddddd            ".trim(), length));
            String[] eeeee     =  (JSPUtil.getParameter(request, "eeeee            ".trim(), length));
            String[] fffff     =  (JSPUtil.getParameter(request, "fffff            ".trim(), length));
            String[] ggggg     =  (JSPUtil.getParameter(request, "ggggg            ".trim(), length));
            String[] hhhhh     =  (JSPUtil.getParameter(request, "hhhhh            ".trim(), length));
            String[] iiiii     =  (JSPUtil.getParameter(request, "iiiii            ".trim(), length));
            String[] jjjjj     =  (JSPUtil.getParameter(request, "jjjjj            ".trim(), length));
            String[] kkkkk     =  (JSPUtil.getParameter(request, "kkkkk            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_PROTOTYPE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setAaaaa              (aaaaa        [i]);
                model.setBbbbb              (bbbbb        [i]);
                model.setCcccc              (ccccc        [i]);
                model.setDdddd              (ddddd        [i]);
                model.setEeeee              (eeeee        [i]);
                model.setFffff              (fffff        [i]);
                model.setGgggg              (ggggg        [i]);
                model.setHhhhh              (hhhhh        [i]);
                model.setIiiii              (iiiii        [i]);
                model.setJjjjj              (jjjjj        [i]);
                model.setKkkkk              (kkkkk        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        TB_PROTOTYPE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag           ".trim(), length));
            String[] page_rows =  (JSPUtil.getParameter(request, "page_rows        ".trim(), length));
            String[] aaaaa     =  (JSPUtil.getParameter(request, "aaaaa            ".trim(), length));
            String[] bbbbb     =  (JSPUtil.getParameter(request, "bbbbb            ".trim(), length));
            String[] ccccc     =  (JSPUtil.getParameter(request, "ccccc            ".trim(), length));
            String[] ddddd     =  (JSPUtil.getParameter(request, "ddddd            ".trim(), length));
            String[] eeeee     =  (JSPUtil.getParameter(request, "eeeee            ".trim(), length));
            String[] fffff     =  (JSPUtil.getParameter(request, "fffff            ".trim(), length));
            String[] ggggg     =  (JSPUtil.getParameter(request, "ggggg            ".trim(), length));
            String[] hhhhh     =  (JSPUtil.getParameter(request, "hhhhh            ".trim(), length));
            String[] iiiii     =  (JSPUtil.getParameter(request, "iiiii            ".trim(), length));
            String[] jjjjj     =  (JSPUtil.getParameter(request, "jjjjj            ".trim(), length));
            String[] kkkkk     =  (JSPUtil.getParameter(request, "kkkkk            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_PROTOTYPE();
                model.setIbflag             (ibflag       [i]);
                model.setPage_rows          (page_rows    [i]);
                model.setAaaaa              (aaaaa        [i]);
                model.setBbbbb              (bbbbb        [i]);
                model.setCcccc              (ccccc        [i]);
                model.setDdddd              (ddddd        [i]);
                model.setEeeee              (eeeee        [i]);
                model.setFffff              (fffff        [i]);
                model.setGgggg              (ggggg        [i]);
                model.setHhhhh              (hhhhh        [i]);
                model.setIiiii              (iiiii        [i]);
                model.setJjjjj              (jjjjj        [i]);
                model.setKkkkk              (kkkkk        [i]);
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
