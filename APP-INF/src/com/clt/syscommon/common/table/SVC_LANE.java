/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SVC_LANE.java
*@FileTitle : Lane 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-09 Hyung Choon
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
 */public final class SVC_LANE implements java.io.Serializable {

    private String        ibflag        = "";
    private String        page_rows     = "";
    private String        sln_lane_cd   = "";
    private String        sln_lane_nm   = "";
    private String        svc_tp_cd     = "";
    private String        sln_crt_dt    = "";
    private String        sln_del_mk    = "";
    private String        sln_del_dt    = "";
    private String        sln_skd_tp    = "";
    private String        sln_crt_id    = "";
    private String        sln_com_cd    = "";
    private String        sln_cb_ind    = "";
    private String        sln_comp_ind  = "";
    private String        sln_udt_dt    = "";
    private String        sln_udt_id    = "";
    private String        sln_res_use   = "";
    private String        nis_event_dt  = "";
    private String        sln_trget_ind = "";
    private String        sln_tpr_ind   = "";
    private String        sln_tax_ind   = "";

    public SVC_LANE(){}

    public SVC_LANE(
            String        ibflag       ,
            String        page_rows    ,
            String        sln_lane_cd  ,
            String        sln_lane_nm  ,
            String        svc_tp_cd    ,
            String        sln_crt_dt   ,
            String        sln_del_mk   ,
            String        sln_del_dt   ,
            String        sln_skd_tp   ,
            String        sln_crt_id   ,
            String        sln_com_cd   ,
            String        sln_cb_ind   ,
            String        sln_comp_ind ,
            String        sln_udt_dt   ,
            String        sln_udt_id   ,
            String        sln_res_use  ,
            String        nis_event_dt ,
            String        sln_trget_ind,
            String        sln_tpr_ind  ,
            String        sln_tax_ind  ){
        this.ibflag        = ibflag       ;
        this.page_rows     = page_rows    ;
        this.sln_lane_cd   = sln_lane_cd  ;
        this.sln_lane_nm   = sln_lane_nm  ;
        this.svc_tp_cd     = svc_tp_cd    ;
        this.sln_crt_dt    = sln_crt_dt   ;
        this.sln_del_mk    = sln_del_mk   ;
        this.sln_del_dt    = sln_del_dt   ;
        this.sln_skd_tp    = sln_skd_tp   ;
        this.sln_crt_id    = sln_crt_id   ;
        this.sln_com_cd    = sln_com_cd   ;
        this.sln_cb_ind    = sln_cb_ind   ;
        this.sln_comp_ind  = sln_comp_ind ;
        this.sln_udt_dt    = sln_udt_dt   ;
        this.sln_udt_id    = sln_udt_id   ;
        this.sln_res_use   = sln_res_use  ;
        this.nis_event_dt  = nis_event_dt ;
        this.sln_trget_ind = sln_trget_ind;
        this.sln_tpr_ind   = sln_tpr_ind  ;
        this.sln_tax_ind   = sln_tax_ind  ;
    }

    // getter method is proceeding ..
    public String        getIbflag       (){    return ibflag           ;    }
    public String        getPage_rows    (){    return page_rows        ;    }
    public String        getSln_lane_cd  (){    return sln_lane_cd      ;    }
    public String        getSln_lane_nm  (){    return sln_lane_nm      ;    }
    public String        getSvc_tp_cd    (){    return svc_tp_cd        ;    }
    public String        getSln_crt_dt   (){    return sln_crt_dt       ;    }
    public String        getSln_del_mk   (){    return sln_del_mk       ;    }
    public String        getSln_del_dt   (){    return sln_del_dt       ;    }
    public String        getSln_skd_tp   (){    return sln_skd_tp       ;    }
    public String        getSln_crt_id   (){    return sln_crt_id       ;    }
    public String        getSln_com_cd   (){    return sln_com_cd       ;    }
    public String        getSln_cb_ind   (){    return sln_cb_ind       ;    }
    public String        getSln_comp_ind (){    return sln_comp_ind     ;    }
    public String        getSln_udt_dt   (){    return sln_udt_dt       ;    }
    public String        getSln_udt_id   (){    return sln_udt_id       ;    }
    public String        getSln_res_use  (){    return sln_res_use      ;    }
    public String        getNis_event_dt (){    return nis_event_dt     ;    }
    public String        getSln_trget_ind(){    return sln_trget_ind    ;    }
    public String        getSln_tpr_ind  (){    return sln_tpr_ind      ;    }
    public String        getSln_tax_ind  (){    return sln_tax_ind      ;    }

    // setter method is proceeding ..
    public void setIbflag       ( String        ibflag        ){    this.ibflag        = ibflag           ;    }
    public void setPage_rows    ( String        page_rows     ){    this.page_rows     = page_rows        ;    }
    public void setSln_lane_cd  ( String        sln_lane_cd   ){    this.sln_lane_cd   = sln_lane_cd      ;    }
    public void setSln_lane_nm  ( String        sln_lane_nm   ){    this.sln_lane_nm   = sln_lane_nm      ;    }
    public void setSvc_tp_cd    ( String        svc_tp_cd     ){    this.svc_tp_cd     = svc_tp_cd        ;    }
    public void setSln_crt_dt   ( String        sln_crt_dt    ){    this.sln_crt_dt    = sln_crt_dt       ;    }
    public void setSln_del_mk   ( String        sln_del_mk    ){    this.sln_del_mk    = sln_del_mk       ;    }
    public void setSln_del_dt   ( String        sln_del_dt    ){    this.sln_del_dt    = sln_del_dt       ;    }
    public void setSln_skd_tp   ( String        sln_skd_tp    ){    this.sln_skd_tp    = sln_skd_tp       ;    }
    public void setSln_crt_id   ( String        sln_crt_id    ){    this.sln_crt_id    = sln_crt_id       ;    }
    public void setSln_com_cd   ( String        sln_com_cd    ){    this.sln_com_cd    = sln_com_cd       ;    }
    public void setSln_cb_ind   ( String        sln_cb_ind    ){    this.sln_cb_ind    = sln_cb_ind       ;    }
    public void setSln_comp_ind ( String        sln_comp_ind  ){    this.sln_comp_ind  = sln_comp_ind     ;    }
    public void setSln_udt_dt   ( String        sln_udt_dt    ){    this.sln_udt_dt    = sln_udt_dt       ;    }
    public void setSln_udt_id   ( String        sln_udt_id    ){    this.sln_udt_id    = sln_udt_id       ;    }
    public void setSln_res_use  ( String        sln_res_use   ){    this.sln_res_use   = sln_res_use      ;    }
    public void setNis_event_dt ( String        nis_event_dt  ){    this.nis_event_dt  = nis_event_dt     ;    }
    public void setSln_trget_ind( String        sln_trget_ind ){    this.sln_trget_ind = sln_trget_ind    ;    }
    public void setSln_tpr_ind  ( String        sln_tpr_ind   ){    this.sln_tpr_ind   = sln_tpr_ind      ;    }
    public void setSln_tax_ind  ( String        sln_tax_ind   ){    this.sln_tax_ind   = sln_tax_ind      ;    }

    public static SVC_LANE fromRequest(HttpServletRequest request) {
        SVC_LANE model = new SVC_LANE();
        try {
            model.setIbflag           (JSPUtil.getParameter(request, "ibflag               ".trim(), ""));
            model.setPage_rows        (JSPUtil.getParameter(request, "page_rows            ".trim(), ""));
            model.setSln_lane_cd      (JSPUtil.getParameter(request, "sln_lane_cd          ".trim(), ""));
            model.setSln_lane_nm      (JSPUtil.getParameter(request, "sln_lane_nm          ".trim(), ""));
            model.setSvc_tp_cd        (JSPUtil.getParameter(request, "svc_tp_cd            ".trim(), ""));
            model.setSln_crt_dt       (JSPUtil.getParameter(request, "sln_crt_dt           ".trim(), ""));
            model.setSln_del_mk       (JSPUtil.getParameter(request, "sln_del_mk           ".trim(), ""));
            model.setSln_del_dt       (JSPUtil.getParameter(request, "sln_del_dt           ".trim(), ""));
            model.setSln_skd_tp       (JSPUtil.getParameter(request, "sln_skd_tp           ".trim(), ""));
            model.setSln_crt_id       (JSPUtil.getParameter(request, "sln_crt_id           ".trim(), ""));
            model.setSln_com_cd       (JSPUtil.getParameter(request, "sln_com_cd           ".trim(), ""));
            model.setSln_cb_ind       (JSPUtil.getParameter(request, "sln_cb_ind           ".trim(), ""));
            model.setSln_comp_ind     (JSPUtil.getParameter(request, "sln_comp_ind         ".trim(), ""));
            model.setSln_udt_dt       (JSPUtil.getParameter(request, "sln_udt_dt           ".trim(), ""));
            model.setSln_udt_id       (JSPUtil.getParameter(request, "sln_udt_id           ".trim(), ""));
            model.setSln_res_use      (JSPUtil.getParameter(request, "sln_res_use          ".trim(), ""));
            model.setNis_event_dt     (JSPUtil.getParameter(request, "nis_event_dt         ".trim(), ""));
            model.setSln_trget_ind    (JSPUtil.getParameter(request, "sln_trget_ind        ".trim(), ""));
            model.setSln_tpr_ind      (JSPUtil.getParameter(request, "sln_tpr_ind          ".trim(), ""));
            model.setSln_tax_ind      (JSPUtil.getParameter(request, "sln_tax_ind          ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SVC_LANE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows            ".trim(), length));
            String[] sln_lane_cd   =  (JSPUtil.getParameter(request, "sln_lane_cd          ".trim(), length));
            String[] sln_lane_nm   =  (JSPUtil.getParameter(request, "sln_lane_nm          ".trim(), length));
            String[] svc_tp_cd     =  (JSPUtil.getParameter(request, "svc_tp_cd            ".trim(), length));
            String[] sln_crt_dt    =  (JSPUtil.getParameter(request, "sln_crt_dt           ".trim(), length));
            String[] sln_del_mk    =  (JSPUtil.getParameter(request, "sln_del_mk           ".trim(), length));
            String[] sln_del_dt    =  (JSPUtil.getParameter(request, "sln_del_dt           ".trim(), length));
            String[] sln_skd_tp    =  (JSPUtil.getParameter(request, "sln_skd_tp           ".trim(), length));
            String[] sln_crt_id    =  (JSPUtil.getParameter(request, "sln_crt_id           ".trim(), length));
            String[] sln_com_cd    =  (JSPUtil.getParameter(request, "sln_com_cd           ".trim(), length));
            String[] sln_cb_ind    =  (JSPUtil.getParameter(request, "sln_cb_ind           ".trim(), length));
            String[] sln_comp_ind  =  (JSPUtil.getParameter(request, "sln_comp_ind         ".trim(), length));
            String[] sln_udt_dt    =  (JSPUtil.getParameter(request, "sln_udt_dt           ".trim(), length));
            String[] sln_udt_id    =  (JSPUtil.getParameter(request, "sln_udt_id           ".trim(), length));
            String[] sln_res_use   =  (JSPUtil.getParameter(request, "sln_res_use          ".trim(), length));
            String[] nis_event_dt  =  (JSPUtil.getParameter(request, "nis_event_dt         ".trim(), length));
            String[] sln_trget_ind =  (JSPUtil.getParameter(request, "sln_trget_ind        ".trim(), length));
            String[] sln_tpr_ind   =  (JSPUtil.getParameter(request, "sln_tpr_ind          ".trim(), length));
            String[] sln_tax_ind   =  (JSPUtil.getParameter(request, "sln_tax_ind          ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SVC_LANE();
                model.setIbflag                 (ibflag           [i]);
                model.setPage_rows              (page_rows        [i]);
                model.setSln_lane_cd            (sln_lane_cd      [i]);
                model.setSln_lane_nm            (sln_lane_nm      [i]);
                model.setSvc_tp_cd              (svc_tp_cd        [i]);
                model.setSln_crt_dt             (sln_crt_dt       [i]);
                model.setSln_del_mk             (sln_del_mk       [i]);
                model.setSln_del_dt             (sln_del_dt       [i]);
                model.setSln_skd_tp             (sln_skd_tp       [i]);
                model.setSln_crt_id             (sln_crt_id       [i]);
                model.setSln_com_cd             (sln_com_cd       [i]);
                model.setSln_cb_ind             (sln_cb_ind       [i]);
                model.setSln_comp_ind           (sln_comp_ind     [i]);
                model.setSln_udt_dt             (sln_udt_dt       [i]);
                model.setSln_udt_id             (sln_udt_id       [i]);
                model.setSln_res_use            (sln_res_use      [i]);
                model.setNis_event_dt           (nis_event_dt     [i]);
                model.setSln_trget_ind          (sln_trget_ind    [i]);
                model.setSln_tpr_ind            (sln_tpr_ind      [i]);
                model.setSln_tax_ind            (sln_tax_ind      [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        SVC_LANE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag               ".trim(), length));
            String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows            ".trim(), length));
            String[] sln_lane_cd   =  (JSPUtil.getParameter(request, prefix + "sln_lane_cd          ".trim(), length));
            String[] sln_lane_nm   =  (JSPUtil.getParameter(request, prefix + "sln_lane_nm          ".trim(), length));
            String[] svc_tp_cd     =  (JSPUtil.getParameter(request, prefix + "svc_tp_cd            ".trim(), length));
            String[] sln_crt_dt    =  (JSPUtil.getParameter(request, prefix + "sln_crt_dt           ".trim(), length));
            String[] sln_del_mk    =  (JSPUtil.getParameter(request, prefix + "sln_del_mk           ".trim(), length));
            String[] sln_del_dt    =  (JSPUtil.getParameter(request, prefix + "sln_del_dt           ".trim(), length));
            String[] sln_skd_tp    =  (JSPUtil.getParameter(request, prefix + "sln_skd_tp           ".trim(), length));
            String[] sln_crt_id    =  (JSPUtil.getParameter(request, prefix + "sln_crt_id           ".trim(), length));
            String[] sln_com_cd    =  (JSPUtil.getParameter(request, prefix + "sln_com_cd           ".trim(), length));
            String[] sln_cb_ind    =  (JSPUtil.getParameter(request, prefix + "sln_cb_ind           ".trim(), length));
            String[] sln_comp_ind  =  (JSPUtil.getParameter(request, prefix + "sln_comp_ind         ".trim(), length));
            String[] sln_udt_dt    =  (JSPUtil.getParameter(request, prefix + "sln_udt_dt           ".trim(), length));
            String[] sln_udt_id    =  (JSPUtil.getParameter(request, prefix + "sln_udt_id           ".trim(), length));
            String[] sln_res_use   =  (JSPUtil.getParameter(request, prefix + "sln_res_use          ".trim(), length));
            String[] nis_event_dt  =  (JSPUtil.getParameter(request, prefix + "nis_event_dt         ".trim(), length));
            String[] sln_trget_ind =  (JSPUtil.getParameter(request, prefix + "sln_trget_ind        ".trim(), length));
            String[] sln_tpr_ind   =  (JSPUtil.getParameter(request, prefix + "sln_tpr_ind          ".trim(), length));
            String[] sln_tax_ind   =  (JSPUtil.getParameter(request, prefix + "sln_tax_ind          ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SVC_LANE();
                model.setIbflag                 ( ibflag           [i]);
                model.setPage_rows              ( page_rows        [i]);
                model.setSln_lane_cd            ( sln_lane_cd      [i]);
                model.setSln_lane_nm            ( sln_lane_nm      [i]);
                model.setSvc_tp_cd              ( svc_tp_cd        [i]);
                model.setSln_crt_dt             ( sln_crt_dt       [i]);
                model.setSln_del_mk             ( sln_del_mk       [i]);
                model.setSln_del_dt             ( sln_del_dt       [i]);
                model.setSln_skd_tp             ( sln_skd_tp       [i]);
                model.setSln_crt_id             ( sln_crt_id       [i]);
                model.setSln_com_cd             ( sln_com_cd       [i]);
                model.setSln_cb_ind             ( sln_cb_ind       [i]);
                model.setSln_comp_ind           ( sln_comp_ind     [i]);
                model.setSln_udt_dt             ( sln_udt_dt       [i]);
                model.setSln_udt_id             ( sln_udt_id       [i]);
                model.setSln_res_use            ( sln_res_use      [i]);
                model.setNis_event_dt           ( nis_event_dt     [i]);
                model.setSln_trget_ind          ( sln_trget_ind    [i]);
                model.setSln_tpr_ind            ( sln_tpr_ind      [i]);
                model.setSln_tax_ind            ( sln_tax_ind      [i]);
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
