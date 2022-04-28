/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : REV_LANE.java
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
 */public final class REV_LANE implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            rln_lane_cd       = "";
    private String            rln_dir_cd        = "";
    private String            rln_ocean_cd      = "";
    private String            rln_lane_nm       = "";
    private String            rln_vsl_tp        = "";
    private String            rln_cargo_flag    = "";
    private String            rln_fr_trade_cd   = "";
    private String            rln_to_trade_cd   = "";
    private String            rln_sub_trade_cd  = "";
    private String            rln_trade_cd      = "";
    private String            rln_sln_cd        = "";
    private String            rln_sub_detail_cd = "";
    private String            rln_crt_id        = "";
    private String            rln_crt_dt        = "";
    private String            rln_udt_id        = "";
    private String            rln_udt_dt        = "";
    private String            rln_del_flag      = "";
    private String            rln_del_dt        = "";
    private String            rln_del_id        = "";
    private String            rln_event_dt      = "";

    public REV_LANE(){}

    public REV_LANE(
            String            ibflag           ,
            String            page_rows        ,
            String            rln_lane_cd      ,
            String            rln_dir_cd       ,
            String            rln_ocean_cd     ,
            String            rln_lane_nm      ,
            String            rln_vsl_tp       ,
            String            rln_cargo_flag   ,
            String            rln_fr_trade_cd  ,
            String            rln_to_trade_cd  ,
            String            rln_sub_trade_cd ,
            String            rln_trade_cd     ,
            String            rln_sln_cd       ,
            String            rln_sub_detail_cd,
            String            rln_crt_id       ,
            String            rln_crt_dt       ,
            String            rln_udt_id       ,
            String            rln_udt_dt       ,
            String            rln_del_flag     ,
            String            rln_del_dt       ,
            String            rln_del_id       ,
            String            rln_event_dt     ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.rln_lane_cd       = rln_lane_cd      ;
        this.rln_dir_cd        = rln_dir_cd       ;
        this.rln_ocean_cd      = rln_ocean_cd     ;
        this.rln_lane_nm       = rln_lane_nm      ;
        this.rln_vsl_tp        = rln_vsl_tp       ;
        this.rln_cargo_flag    = rln_cargo_flag   ;
        this.rln_fr_trade_cd   = rln_fr_trade_cd  ;
        this.rln_to_trade_cd   = rln_to_trade_cd  ;
        this.rln_sub_trade_cd  = rln_sub_trade_cd ;
        this.rln_trade_cd      = rln_trade_cd     ;
        this.rln_sln_cd        = rln_sln_cd       ;
        this.rln_sub_detail_cd = rln_sub_detail_cd;
        this.rln_crt_id        = rln_crt_id       ;
        this.rln_crt_dt        = rln_crt_dt       ;
        this.rln_udt_id        = rln_udt_id       ;
        this.rln_udt_dt        = rln_udt_dt       ;
        this.rln_del_flag      = rln_del_flag     ;
        this.rln_del_dt        = rln_del_dt       ;
        this.rln_del_id        = rln_del_id       ;
        this.rln_event_dt      = rln_event_dt     ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getRln_lane_cd      (){    return rln_lane_cd          ;    }
    public String            getRln_dir_cd       (){    return rln_dir_cd           ;    }
    public String            getRln_ocean_cd     (){    return rln_ocean_cd         ;    }
    public String            getRln_lane_nm      (){    return rln_lane_nm          ;    }
    public String            getRln_vsl_tp       (){    return rln_vsl_tp           ;    }
    public String            getRln_cargo_flag   (){    return rln_cargo_flag       ;    }
    public String            getRln_fr_trade_cd  (){    return rln_fr_trade_cd      ;    }
    public String            getRln_to_trade_cd  (){    return rln_to_trade_cd      ;    }
    public String            getRln_sub_trade_cd (){    return rln_sub_trade_cd     ;    }
    public String            getRln_trade_cd     (){    return rln_trade_cd         ;    }
    public String            getRln_sln_cd       (){    return rln_sln_cd           ;    }
    public String            getRln_sub_detail_cd(){    return rln_sub_detail_cd    ;    }
    public String            getRln_crt_id       (){    return rln_crt_id           ;    }
    public String            getRln_crt_dt       (){    return rln_crt_dt           ;    }
    public String            getRln_udt_id       (){    return rln_udt_id           ;    }
    public String            getRln_udt_dt       (){    return rln_udt_dt           ;    }
    public String            getRln_del_flag     (){    return rln_del_flag         ;    }
    public String            getRln_del_dt       (){    return rln_del_dt           ;    }
    public String            getRln_del_id       (){    return rln_del_id           ;    }
    public String            getRln_event_dt     (){    return rln_event_dt         ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setRln_lane_cd      ( String            rln_lane_cd       ){    this.rln_lane_cd       = rln_lane_cd          ;    }
    public void setRln_dir_cd       ( String            rln_dir_cd        ){    this.rln_dir_cd        = rln_dir_cd           ;    }
    public void setRln_ocean_cd     ( String            rln_ocean_cd      ){    this.rln_ocean_cd      = rln_ocean_cd         ;    }
    public void setRln_lane_nm      ( String            rln_lane_nm       ){    this.rln_lane_nm       = rln_lane_nm          ;    }
    public void setRln_vsl_tp       ( String            rln_vsl_tp        ){    this.rln_vsl_tp        = rln_vsl_tp           ;    }
    public void setRln_cargo_flag   ( String            rln_cargo_flag    ){    this.rln_cargo_flag    = rln_cargo_flag       ;    }
    public void setRln_fr_trade_cd  ( String            rln_fr_trade_cd   ){    this.rln_fr_trade_cd   = rln_fr_trade_cd      ;    }
    public void setRln_to_trade_cd  ( String            rln_to_trade_cd   ){    this.rln_to_trade_cd   = rln_to_trade_cd      ;    }
    public void setRln_sub_trade_cd ( String            rln_sub_trade_cd  ){    this.rln_sub_trade_cd  = rln_sub_trade_cd     ;    }
    public void setRln_trade_cd     ( String            rln_trade_cd      ){    this.rln_trade_cd      = rln_trade_cd         ;    }
    public void setRln_sln_cd       ( String            rln_sln_cd        ){    this.rln_sln_cd        = rln_sln_cd           ;    }
    public void setRln_sub_detail_cd( String            rln_sub_detail_cd ){    this.rln_sub_detail_cd = rln_sub_detail_cd    ;    }
    public void setRln_crt_id       ( String            rln_crt_id        ){    this.rln_crt_id        = rln_crt_id           ;    }
    public void setRln_crt_dt       ( String            rln_crt_dt        ){    this.rln_crt_dt        = rln_crt_dt           ;    }
    public void setRln_udt_id       ( String            rln_udt_id        ){    this.rln_udt_id        = rln_udt_id           ;    }
    public void setRln_udt_dt       ( String            rln_udt_dt        ){    this.rln_udt_dt        = rln_udt_dt           ;    }
    public void setRln_del_flag     ( String            rln_del_flag      ){    this.rln_del_flag      = rln_del_flag         ;    }
    public void setRln_del_dt       ( String            rln_del_dt        ){    this.rln_del_dt        = rln_del_dt           ;    }
    public void setRln_del_id       ( String            rln_del_id        ){    this.rln_del_id        = rln_del_id           ;    }
    public void setRln_event_dt     ( String            rln_event_dt      ){    this.rln_event_dt      = rln_event_dt         ;    }

    public static REV_LANE fromRequest(HttpServletRequest request) {
        REV_LANE model = new REV_LANE();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setRln_lane_cd          (JSPUtil.getParameter(request, "rln_lane_cd              ".trim(), ""));
            model.setRln_dir_cd           (JSPUtil.getParameter(request, "rln_dir_cd               ".trim(), ""));
            model.setRln_ocean_cd         (JSPUtil.getParameter(request, "rln_ocean_cd             ".trim(), ""));
            model.setRln_lane_nm          (JSPUtil.getParameter(request, "rln_lane_nm              ".trim(), ""));
            model.setRln_vsl_tp           (JSPUtil.getParameter(request, "rln_vsl_tp               ".trim(), ""));
            model.setRln_cargo_flag       (JSPUtil.getParameter(request, "rln_cargo_flag           ".trim(), ""));
            model.setRln_fr_trade_cd      (JSPUtil.getParameter(request, "rln_fr_trade_cd          ".trim(), ""));
            model.setRln_to_trade_cd      (JSPUtil.getParameter(request, "rln_to_trade_cd          ".trim(), ""));
            model.setRln_sub_trade_cd     (JSPUtil.getParameter(request, "rln_sub_trade_cd         ".trim(), ""));
            model.setRln_trade_cd         (JSPUtil.getParameter(request, "rln_trade_cd             ".trim(), ""));
            model.setRln_sln_cd           (JSPUtil.getParameter(request, "rln_sln_cd               ".trim(), ""));
            model.setRln_sub_detail_cd    (JSPUtil.getParameter(request, "rln_sub_detail_cd        ".trim(), ""));
            model.setRln_crt_id           (JSPUtil.getParameter(request, "rln_crt_id               ".trim(), ""));
            model.setRln_crt_dt           (JSPUtil.getParameter(request, "rln_crt_dt               ".trim(), ""));
            model.setRln_udt_id           (JSPUtil.getParameter(request, "rln_udt_id               ".trim(), ""));
            model.setRln_udt_dt           (JSPUtil.getParameter(request, "rln_udt_dt               ".trim(), ""));
            model.setRln_del_flag         (JSPUtil.getParameter(request, "rln_del_flag             ".trim(), ""));
            model.setRln_del_dt           (JSPUtil.getParameter(request, "rln_del_dt               ".trim(), ""));
            model.setRln_del_id           (JSPUtil.getParameter(request, "rln_del_id               ".trim(), ""));
            model.setRln_event_dt         (JSPUtil.getParameter(request, "rln_event_dt             ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        REV_LANE model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] rln_lane_cd       =  (JSPUtil.getParameter(request, "rln_lane_cd              ".trim(), length));
            String[] rln_dir_cd        =  (JSPUtil.getParameter(request, "rln_dir_cd               ".trim(), length));
            String[] rln_ocean_cd      =  (JSPUtil.getParameter(request, "rln_ocean_cd             ".trim(), length));
            String[] rln_lane_nm       =  (JSPUtil.getParameter(request, "rln_lane_nm              ".trim(), length));
            String[] rln_vsl_tp        =  (JSPUtil.getParameter(request, "rln_vsl_tp               ".trim(), length));
            String[] rln_cargo_flag    =  (JSPUtil.getParameter(request, "rln_cargo_flag           ".trim(), length));
            String[] rln_fr_trade_cd   =  (JSPUtil.getParameter(request, "rln_fr_trade_cd          ".trim(), length));
            String[] rln_to_trade_cd   =  (JSPUtil.getParameter(request, "rln_to_trade_cd          ".trim(), length));
            String[] rln_sub_trade_cd  =  (JSPUtil.getParameter(request, "rln_sub_trade_cd         ".trim(), length));
            String[] rln_trade_cd      =  (JSPUtil.getParameter(request, "rln_trade_cd             ".trim(), length));
            String[] rln_sln_cd        =  (JSPUtil.getParameter(request, "rln_sln_cd               ".trim(), length));
            String[] rln_sub_detail_cd =  (JSPUtil.getParameter(request, "rln_sub_detail_cd        ".trim(), length));
            String[] rln_crt_id        =  (JSPUtil.getParameter(request, "rln_crt_id               ".trim(), length));
            String[] rln_crt_dt        =  (JSPUtil.getParameter(request, "rln_crt_dt               ".trim(), length));
            String[] rln_udt_id        =  (JSPUtil.getParameter(request, "rln_udt_id               ".trim(), length));
            String[] rln_udt_dt        =  (JSPUtil.getParameter(request, "rln_udt_dt               ".trim(), length));
            String[] rln_del_flag      =  (JSPUtil.getParameter(request, "rln_del_flag             ".trim(), length));
            String[] rln_del_dt        =  (JSPUtil.getParameter(request, "rln_del_dt               ".trim(), length));
            String[] rln_del_id        =  (JSPUtil.getParameter(request, "rln_del_id               ".trim(), length));
            String[] rln_event_dt      =  (JSPUtil.getParameter(request, "rln_event_dt             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new REV_LANE();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setRln_lane_cd                (rln_lane_cd          [i]);
                model.setRln_dir_cd                 (rln_dir_cd           [i]);
                model.setRln_ocean_cd               (rln_ocean_cd         [i]);
                model.setRln_lane_nm                (rln_lane_nm          [i]);
                model.setRln_vsl_tp                 (rln_vsl_tp           [i]);
                model.setRln_cargo_flag             (rln_cargo_flag       [i]);
                model.setRln_fr_trade_cd            (rln_fr_trade_cd      [i]);
                model.setRln_to_trade_cd            (rln_to_trade_cd      [i]);
                model.setRln_sub_trade_cd           (rln_sub_trade_cd     [i]);
                model.setRln_trade_cd               (rln_trade_cd         [i]);
                model.setRln_sln_cd                 (rln_sln_cd           [i]);
                model.setRln_sub_detail_cd          (rln_sub_detail_cd    [i]);
                model.setRln_crt_id                 (rln_crt_id           [i]);
                model.setRln_crt_dt                 (rln_crt_dt           [i]);
                model.setRln_udt_id                 (rln_udt_id           [i]);
                model.setRln_udt_dt                 (rln_udt_dt           [i]);
                model.setRln_del_flag               (rln_del_flag         [i]);
                model.setRln_del_dt                 (rln_del_dt           [i]);
                model.setRln_del_id                 (rln_del_id           [i]);
                model.setRln_event_dt               (rln_event_dt         [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        REV_LANE model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] rln_lane_cd       =  (JSPUtil.getParameter(request, prefix + "rln_lane_cd              ".trim(), length));
            String[] rln_dir_cd        =  (JSPUtil.getParameter(request, prefix + "rln_dir_cd               ".trim(), length));
            String[] rln_ocean_cd      =  (JSPUtil.getParameter(request, prefix + "rln_ocean_cd             ".trim(), length));
            String[] rln_lane_nm       =  (JSPUtil.getParameter(request, prefix + "rln_lane_nm              ".trim(), length));
            String[] rln_vsl_tp        =  (JSPUtil.getParameter(request, prefix + "rln_vsl_tp               ".trim(), length));
            String[] rln_cargo_flag    =  (JSPUtil.getParameter(request, prefix + "rln_cargo_flag           ".trim(), length));
            String[] rln_fr_trade_cd   =  (JSPUtil.getParameter(request, prefix + "rln_fr_trade_cd          ".trim(), length));
            String[] rln_to_trade_cd   =  (JSPUtil.getParameter(request, prefix + "rln_to_trade_cd          ".trim(), length));
            String[] rln_sub_trade_cd  =  (JSPUtil.getParameter(request, prefix + "rln_sub_trade_cd         ".trim(), length));
            String[] rln_trade_cd      =  (JSPUtil.getParameter(request, prefix + "rln_trade_cd             ".trim(), length));
            String[] rln_sln_cd        =  (JSPUtil.getParameter(request, prefix + "rln_sln_cd               ".trim(), length));
            String[] rln_sub_detail_cd =  (JSPUtil.getParameter(request, prefix + "rln_sub_detail_cd        ".trim(), length));
            String[] rln_crt_id        =  (JSPUtil.getParameter(request, prefix + "rln_crt_id               ".trim(), length));
            String[] rln_crt_dt        =  (JSPUtil.getParameter(request, prefix + "rln_crt_dt               ".trim(), length));
            String[] rln_udt_id        =  (JSPUtil.getParameter(request, prefix + "rln_udt_id               ".trim(), length));
            String[] rln_udt_dt        =  (JSPUtil.getParameter(request, prefix + "rln_udt_dt               ".trim(), length));
            String[] rln_del_flag      =  (JSPUtil.getParameter(request, prefix + "rln_del_flag             ".trim(), length));
            String[] rln_del_dt        =  (JSPUtil.getParameter(request, prefix + "rln_del_dt               ".trim(), length));
            String[] rln_del_id        =  (JSPUtil.getParameter(request, prefix + "rln_del_id               ".trim(), length));
            String[] rln_event_dt      =  (JSPUtil.getParameter(request, prefix + "rln_event_dt             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new REV_LANE();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setRln_lane_cd                ( rln_lane_cd          [i]);
                model.setRln_dir_cd                 ( rln_dir_cd           [i]);
                model.setRln_ocean_cd               ( rln_ocean_cd         [i]);
                model.setRln_lane_nm                ( rln_lane_nm          [i]);
                model.setRln_vsl_tp                 ( rln_vsl_tp           [i]);
                model.setRln_cargo_flag             ( rln_cargo_flag       [i]);
                model.setRln_fr_trade_cd            ( rln_fr_trade_cd      [i]);
                model.setRln_to_trade_cd            ( rln_to_trade_cd      [i]);
                model.setRln_sub_trade_cd           ( rln_sub_trade_cd     [i]);
                model.setRln_trade_cd               ( rln_trade_cd         [i]);
                model.setRln_sln_cd                 ( rln_sln_cd           [i]);
                model.setRln_sub_detail_cd          ( rln_sub_detail_cd    [i]);
                model.setRln_crt_id                 ( rln_crt_id           [i]);
                model.setRln_crt_dt                 ( rln_crt_dt           [i]);
                model.setRln_udt_id                 ( rln_udt_id           [i]);
                model.setRln_udt_dt                 ( rln_udt_dt           [i]);
                model.setRln_del_flag               ( rln_del_flag         [i]);
                model.setRln_del_dt                 ( rln_del_dt           [i]);
                model.setRln_del_id                 ( rln_del_id           [i]);
                model.setRln_event_dt               ( rln_event_dt         [i]);
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
