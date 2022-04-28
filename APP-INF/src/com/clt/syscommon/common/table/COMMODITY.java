/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COMMODITY.java
*@FileTitle : Commodity정보조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-08-03 Kildong_hong
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */public final class COMMODITY implements java.io.Serializable {

    private String       ibflag       = "";
    private String       page_rows    = "";
    private String       cmdt_cd      = "";
    private String       cmdt_tli_no  = "";
    private String       cmdt_desc    = "";
    private String       rep_cmdt_cd  = "";
    private String       rep_imdg_cls = "";
    private String       cxl_ind      = "";
    private String       cr_dt        = "";
    private String       up_dt        = "";
    private String       usr_id       = "";
    private String       cmdt_old_cd  = "";
    private String       nis_event_dt = "";

    public COMMODITY(){}

    public COMMODITY(
            String       ibflag      ,
            String       page_rows   ,
            String       cmdt_cd     ,
            String       cmdt_tli_no ,
            String       cmdt_desc   ,
            String       rep_cmdt_cd ,
            String       rep_imdg_cls,
            String       cxl_ind     ,
            String       cr_dt       ,
            String       up_dt       ,
            String       usr_id      ,
            String       cmdt_old_cd ,
            String       nis_event_dt){
        this.ibflag       = ibflag      ;
        this.page_rows    = page_rows   ;
        this.cmdt_cd      = cmdt_cd     ;
        this.cmdt_tli_no  = cmdt_tli_no ;
        this.cmdt_desc    = cmdt_desc   ;
        this.rep_cmdt_cd  = rep_cmdt_cd ;
        this.rep_imdg_cls = rep_imdg_cls;
        this.cxl_ind      = cxl_ind     ;
        this.cr_dt        = cr_dt       ;
        this.up_dt        = up_dt       ;
        this.usr_id       = usr_id      ;
        this.cmdt_old_cd  = cmdt_old_cd ;
        this.nis_event_dt = nis_event_dt;
    }

    // getter method is proceeding ..
    public String       getIbflag      (){    return ibflag          ;    }
    public String       getPage_rows   (){    return page_rows       ;    }
    public String       getCmdt_cd     (){    return cmdt_cd         ;    }
    public String       getCmdt_tli_no (){    return cmdt_tli_no     ;    }
    public String       getCmdt_desc   (){    return cmdt_desc       ;    }
    public String       getRep_cmdt_cd (){    return rep_cmdt_cd     ;    }
    public String       getRep_imdg_cls(){    return rep_imdg_cls    ;    }
    public String       getCxl_ind     (){    return cxl_ind         ;    }
    public String       getCr_dt       (){    return cr_dt           ;    }
    public String       getUp_dt       (){    return up_dt           ;    }
    public String       getUsr_id      (){    return usr_id          ;    }
    public String       getCmdt_old_cd (){    return cmdt_old_cd     ;    }
    public String       getNis_event_dt(){    return nis_event_dt    ;    }

    // setter method is proceeding ..
    public void setIbflag      ( String       ibflag       ){    this.ibflag       = ibflag          ;    }
    public void setPage_rows   ( String       page_rows    ){    this.page_rows    = page_rows       ;    }
    public void setCmdt_cd     ( String       cmdt_cd      ){    this.cmdt_cd      = cmdt_cd         ;    }
    public void setCmdt_tli_no ( String       cmdt_tli_no  ){    this.cmdt_tli_no  = cmdt_tli_no     ;    }
    public void setCmdt_desc   ( String       cmdt_desc    ){    this.cmdt_desc    = cmdt_desc       ;    }
    public void setRep_cmdt_cd ( String       rep_cmdt_cd  ){    this.rep_cmdt_cd  = rep_cmdt_cd     ;    }
    public void setRep_imdg_cls( String       rep_imdg_cls ){    this.rep_imdg_cls = rep_imdg_cls    ;    }
    public void setCxl_ind     ( String       cxl_ind      ){    this.cxl_ind      = cxl_ind         ;    }
    public void setCr_dt       ( String       cr_dt        ){    this.cr_dt        = cr_dt           ;    }
    public void setUp_dt       ( String       up_dt        ){    this.up_dt        = up_dt           ;    }
    public void setUsr_id      ( String       usr_id       ){    this.usr_id       = usr_id          ;    }
    public void setCmdt_old_cd ( String       cmdt_old_cd  ){    this.cmdt_old_cd  = cmdt_old_cd     ;    }
    public void setNis_event_dt( String       nis_event_dt ){    this.nis_event_dt = nis_event_dt    ;    }

    public static COMMODITY fromRequest(HttpServletRequest request) {
        COMMODITY model = new COMMODITY();
        try {
            model.setIbflag          (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
            model.setPage_rows       (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
            model.setCmdt_cd         (JSPUtil.getParameter(request, "cmdt_cd             ".trim(), ""));
            model.setCmdt_tli_no     (JSPUtil.getParameter(request, "cmdt_tli_no         ".trim(), ""));
            model.setCmdt_desc       (JSPUtil.getParameter(request, "cmdt_desc           ".trim(), ""));
            model.setRep_cmdt_cd     (JSPUtil.getParameter(request, "rep_cmdt_cd         ".trim(), ""));
            model.setRep_imdg_cls    (JSPUtil.getParameter(request, "rep_imdg_cls        ".trim(), ""));
            model.setCxl_ind         (JSPUtil.getParameter(request, "cxl_ind             ".trim(), ""));
            model.setCr_dt           (JSPUtil.getParameter(request, "cr_dt               ".trim(), ""));
            model.setUp_dt           (JSPUtil.getParameter(request, "up_dt               ".trim(), ""));
            model.setUsr_id          (JSPUtil.getParameter(request, "usr_id              ".trim(), ""));
            model.setCmdt_old_cd     (JSPUtil.getParameter(request, "cmdt_old_cd         ".trim(), ""));
            model.setNis_event_dt    (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        COMMODITY model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
            String[] cmdt_cd      =  (JSPUtil.getParameter(request, "cmdt_cd             ".trim(), length));
            String[] cmdt_tli_no  =  (JSPUtil.getParameter(request, "cmdt_tli_no         ".trim(), length));
            String[] cmdt_desc    =  (JSPUtil.getParameter(request, "cmdt_desc           ".trim(), length));
            String[] rep_cmdt_cd  =  (JSPUtil.getParameter(request, "rep_cmdt_cd         ".trim(), length));
            String[] rep_imdg_cls =  (JSPUtil.getParameter(request, "rep_imdg_cls        ".trim(), length));
            String[] cxl_ind      =  (JSPUtil.getParameter(request, "cxl_ind             ".trim(), length));
            String[] cr_dt        =  (JSPUtil.getParameter(request, "cr_dt               ".trim(), length));
            String[] up_dt        =  (JSPUtil.getParameter(request, "up_dt               ".trim(), length));
            String[] usr_id       =  (JSPUtil.getParameter(request, "usr_id              ".trim(), length));
            String[] cmdt_old_cd  =  (JSPUtil.getParameter(request, "cmdt_old_cd         ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new COMMODITY();
                model.setIbflag                (ibflag          [i]);
                model.setPage_rows             (page_rows       [i]);
                model.setCmdt_cd               (cmdt_cd         [i]);
                model.setCmdt_tli_no           (cmdt_tli_no     [i]);
                model.setCmdt_desc             (cmdt_desc       [i]);
                model.setRep_cmdt_cd           (rep_cmdt_cd     [i]);
                model.setRep_imdg_cls          (rep_imdg_cls    [i]);
                model.setCxl_ind               (cxl_ind         [i]);
                model.setCr_dt                 (cr_dt           [i]);
                model.setUp_dt                 (up_dt           [i]);
                model.setUsr_id                (usr_id          [i]);
                model.setCmdt_old_cd           (cmdt_old_cd     [i]);
                model.setNis_event_dt          (nis_event_dt    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        COMMODITY model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
            String[] cmdt_cd      =  (JSPUtil.getParameter(request, prefix + "cmdt_cd             ".trim(), length));
            String[] cmdt_tli_no  =  (JSPUtil.getParameter(request, prefix + "cmdt_tli_no         ".trim(), length));
            String[] cmdt_desc    =  (JSPUtil.getParameter(request, prefix + "cmdt_desc           ".trim(), length));
            String[] rep_cmdt_cd  =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd         ".trim(), length));
            String[] rep_imdg_cls =  (JSPUtil.getParameter(request, prefix + "rep_imdg_cls        ".trim(), length));
            String[] cxl_ind      =  (JSPUtil.getParameter(request, prefix + "cxl_ind             ".trim(), length));
            String[] cr_dt        =  (JSPUtil.getParameter(request, prefix + "cr_dt               ".trim(), length));
            String[] up_dt        =  (JSPUtil.getParameter(request, prefix + "up_dt               ".trim(), length));
            String[] usr_id       =  (JSPUtil.getParameter(request, prefix + "usr_id              ".trim(), length));
            String[] cmdt_old_cd  =  (JSPUtil.getParameter(request, prefix + "cmdt_old_cd         ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, prefix + "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new COMMODITY();
                model.setIbflag                ( ibflag          [i]);
                model.setPage_rows             ( page_rows       [i]);
                model.setCmdt_cd               ( cmdt_cd         [i]);
                model.setCmdt_tli_no           ( cmdt_tli_no     [i]);
                model.setCmdt_desc             ( cmdt_desc       [i]);
                model.setRep_cmdt_cd           ( rep_cmdt_cd     [i]);
                model.setRep_imdg_cls          ( rep_imdg_cls    [i]);
                model.setCxl_ind               ( cxl_ind         [i]);
                model.setCr_dt                 ( cr_dt           [i]);
                model.setUp_dt                 ( up_dt           [i]);
                model.setUsr_id                ( usr_id          [i]);
                model.setCmdt_old_cd           ( cmdt_old_cd     [i]);
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
