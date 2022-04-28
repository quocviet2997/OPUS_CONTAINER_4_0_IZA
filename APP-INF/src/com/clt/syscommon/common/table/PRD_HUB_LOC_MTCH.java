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
 * 4. 작성자/작성일 : jungsunyong/2006.06.28<br>
 * ===================================<br>
 * 5. 수정사항<p>
 * 5.1 요구사항 ID :<p>
 * - 수정자/수정일 :<p>
 * - 수정사유/내역 :<p>
 * ===================================<br>
 * <p/>
 * @author : jungsunyong
 * @version : v1.0.0
 */
public final class PRD_HUB_LOC_MTCH implements java.io.Serializable {

    private String           ibflag           = "";
    private String           page_rows        = "";
    private String           port_cd          = "";
    private String           loc_cd           = "";
    private String           hub_loc_cd       = "";
    private String           trsp_mod_cd      = "";
    private String           hub_loc_mtch_rmk = "";
    private String           cre_ofc_cd       = "";
    private String           cre_usr_id       = "";
    private String           cre_dt           = "";
    private String           upd_usr_id       = "";
    private String           upd_dt           = "";

    public PRD_HUB_LOC_MTCH(){}

    public PRD_HUB_LOC_MTCH(
            String           ibflag          ,
            String           page_rows       ,
            String           port_cd         ,
            String           loc_cd          ,
            String           hub_loc_cd      ,
            String           trsp_mod_cd     ,
            String           hub_loc_mtch_rmk,
            String           cre_ofc_cd      ,
            String           cre_usr_id      ,
            String           cre_dt          ,
            String           upd_usr_id      ,
            String           upd_dt          ){
        this.ibflag           = ibflag          ;
        this.page_rows        = page_rows       ;
        this.port_cd          = port_cd         ;
        this.loc_cd           = loc_cd          ;
        this.hub_loc_cd       = hub_loc_cd      ;
        this.trsp_mod_cd      = trsp_mod_cd     ;
        this.hub_loc_mtch_rmk = hub_loc_mtch_rmk;
        this.cre_ofc_cd       = cre_ofc_cd      ;
        this.cre_usr_id       = cre_usr_id      ;
        this.cre_dt           = cre_dt          ;
        this.upd_usr_id       = upd_usr_id      ;
        this.upd_dt           = upd_dt          ;
    }

    // getter method is proceeding ..
    public String           getIbflag          (){    return ibflag              ;    }
    public String           getPage_rows       (){    return page_rows           ;    }
    public String           getPort_cd         (){    return port_cd             ;    }
    public String           getLoc_cd          (){    return loc_cd              ;    }
    public String           getHub_loc_cd      (){    return hub_loc_cd          ;    }
    public String           getTrsp_mod_cd     (){    return trsp_mod_cd         ;    }
    public String           getHub_loc_mtch_rmk(){    return hub_loc_mtch_rmk    ;    }
    public String           getCre_ofc_cd      (){    return cre_ofc_cd          ;    }
    public String           getCre_usr_id      (){    return cre_usr_id          ;    }
    public String           getCre_dt          (){    return cre_dt              ;    }
    public String           getUpd_usr_id      (){    return upd_usr_id          ;    }
    public String           getUpd_dt          (){    return upd_dt              ;    }

    // setter method is proceeding ..
    public void setIbflag          ( String           ibflag           ){    this.ibflag           = ibflag              ;    }
    public void setPage_rows       ( String           page_rows        ){    this.page_rows        = page_rows           ;    }
    public void setPort_cd         ( String           port_cd          ){    this.port_cd          = port_cd             ;    }
    public void setLoc_cd          ( String           loc_cd           ){    this.loc_cd           = loc_cd              ;    }
    public void setHub_loc_cd      ( String           hub_loc_cd       ){    this.hub_loc_cd       = hub_loc_cd          ;    }
    public void setTrsp_mod_cd     ( String           trsp_mod_cd      ){    this.trsp_mod_cd      = trsp_mod_cd         ;    }
    public void setHub_loc_mtch_rmk( String           hub_loc_mtch_rmk ){    this.hub_loc_mtch_rmk = hub_loc_mtch_rmk    ;    }
    public void setCre_ofc_cd      ( String           cre_ofc_cd       ){    this.cre_ofc_cd       = cre_ofc_cd          ;    }
    public void setCre_usr_id      ( String           cre_usr_id       ){    this.cre_usr_id       = cre_usr_id          ;    }
    public void setCre_dt          ( String           cre_dt           ){    this.cre_dt           = cre_dt              ;    }
    public void setUpd_usr_id      ( String           upd_usr_id       ){    this.upd_usr_id       = upd_usr_id          ;    }
    public void setUpd_dt          ( String           upd_dt           ){    this.upd_dt           = upd_dt              ;    }

    public static PRD_HUB_LOC_MTCH fromRequest(HttpServletRequest request) {
        PRD_HUB_LOC_MTCH model = new PRD_HUB_LOC_MTCH();
        try {
            model.setIbflag              (JSPUtil.getParameter(request, "ibflag                  ".trim(), ""));
            model.setPage_rows           (JSPUtil.getParameter(request, "page_rows               ".trim(), ""));
            model.setPort_cd             (JSPUtil.getParameter(request, "port_cd                 ".trim(), ""));
            model.setLoc_cd              (JSPUtil.getParameter(request, "loc_cd                  ".trim(), ""));
            model.setHub_loc_cd          (JSPUtil.getParameter(request, "hub_loc_cd              ".trim(), ""));
            model.setTrsp_mod_cd         (JSPUtil.getParameter(request, "trsp_mod_cd             ".trim(), ""));
            model.setHub_loc_mtch_rmk    (JSPUtil.getParameter(request, "hub_loc_mtch_rmk        ".trim(), ""));
            model.setCre_ofc_cd          (JSPUtil.getParameter(request, "cre_ofc_cd              ".trim(), ""));
            model.setCre_usr_id          (JSPUtil.getParameter(request, "cre_usr_id              ".trim(), ""));
            model.setCre_dt              (JSPUtil.getParameter(request, "cre_dt                  ".trim(), ""));
            model.setUpd_usr_id          (JSPUtil.getParameter(request, "upd_usr_id              ".trim(), ""));
            model.setUpd_dt              (JSPUtil.getParameter(request, "upd_dt                  ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_HUB_LOC_MTCH model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows               ".trim(), length));
            String[] port_cd          =  (JSPUtil.getParameter(request, "port_cd                 ".trim(), length));
            String[] loc_cd           =  (JSPUtil.getParameter(request, "loc_cd                  ".trim(), length));
            String[] hub_loc_cd       =  (JSPUtil.getParameter(request, "hub_loc_cd              ".trim(), length));
            String[] trsp_mod_cd      =  (JSPUtil.getParameter(request, "trsp_mod_cd             ".trim(), length));
            String[] hub_loc_mtch_rmk =  (JSPUtil.getParameter(request, "hub_loc_mtch_rmk        ".trim(), length));
            String[] cre_ofc_cd       =  (JSPUtil.getParameter(request, "cre_ofc_cd              ".trim(), length));
            String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id              ".trim(), length));
            String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt                  ".trim(), length));
            String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id              ".trim(), length));
            String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt                  ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_HUB_LOC_MTCH();
                model.setIbflag                    (ibflag              [i]);
                model.setPage_rows                 (page_rows           [i]);
                model.setPort_cd                   (port_cd             [i]);
                model.setLoc_cd                    (loc_cd              [i]);
                model.setHub_loc_cd                (hub_loc_cd          [i]);
                model.setTrsp_mod_cd               (trsp_mod_cd         [i]);
                model.setHub_loc_mtch_rmk          (hub_loc_mtch_rmk    [i]);
                model.setCre_ofc_cd                (cre_ofc_cd          [i]);
                model.setCre_usr_id                (cre_usr_id          [i]);
                model.setCre_dt                    (cre_dt              [i]);
                model.setUpd_usr_id                (upd_usr_id          [i]);
                model.setUpd_dt                    (upd_dt              [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        PRD_HUB_LOC_MTCH model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows               ".trim(), length));
            String[] port_cd          =  (JSPUtil.getParameter(request, "port_cd                 ".trim(), length));
            String[] loc_cd           =  (JSPUtil.getParameter(request, "loc_cd                  ".trim(), length));
            String[] hub_loc_cd       =  (JSPUtil.getParameter(request, "hub_loc_cd              ".trim(), length));
            String[] trsp_mod_cd      =  (JSPUtil.getParameter(request, "trsp_mod_cd             ".trim(), length));
            String[] hub_loc_mtch_rmk =  (JSPUtil.getParameter(request, "hub_loc_mtch_rmk        ".trim(), length));
            String[] cre_ofc_cd       =  (JSPUtil.getParameter(request, "cre_ofc_cd              ".trim(), length));
            String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id              ".trim(), length));
            String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt                  ".trim(), length));
            String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id              ".trim(), length));
            String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt                  ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_HUB_LOC_MTCH();
                model.setIbflag                    (ibflag              [i]);
                model.setPage_rows                 (page_rows           [i]);
                model.setPort_cd                   (port_cd             [i]);
                model.setLoc_cd                    (loc_cd              [i]);
                model.setHub_loc_cd                (hub_loc_cd          [i]);
                model.setTrsp_mod_cd               (trsp_mod_cd         [i]);
                model.setHub_loc_mtch_rmk          (hub_loc_mtch_rmk    [i]);
                model.setCre_ofc_cd                (cre_ofc_cd          [i]);
                model.setCre_usr_id                (cre_usr_id          [i]);
                model.setCre_dt                    (cre_dt              [i]);
                model.setUpd_usr_id                (upd_usr_id          [i]);
                model.setUpd_dt                    (upd_dt              [i]);
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
