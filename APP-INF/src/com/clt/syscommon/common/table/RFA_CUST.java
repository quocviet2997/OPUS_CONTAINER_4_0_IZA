/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RFA_CUST.java
*@FileTitle : Contract No 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-11 sangyool pak
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
 * @author sangyool pak
 * @since J2EE 1.4
 */public final class RFA_CUST implements java.io.Serializable {

    private String       ibflag       = "";
    private String       page_rows    = "";
    private String       qtn_ofc      = "";
    private String       qtn_seq      = "";
    private String       cnt_cd       = "";
    private String       cust_cd      = "";
    private String       rc_cust_role = "";
    private String       rc_dsp_ind   = "";
    private String       rc_cust_tp   = "";
    private String       loc_cd       = "";
    private String       rc_up_dt     = "";
    private String       rc_usr_id    = "";
    private String       rc_cust_nm   = "";
    private String       rc_prnt_flg  = "";
    private String       rc_cr_dt     = "";
    private String       nis_event_dt = "";

    public RFA_CUST(){}

    public RFA_CUST(
            String       ibflag      ,
            String       page_rows   ,
            String       qtn_ofc     ,
            String       qtn_seq     ,
            String       cnt_cd      ,
            String       cust_cd     ,
            String       rc_cust_role,
            String       rc_dsp_ind  ,
            String       rc_cust_tp  ,
            String       loc_cd      ,
            String       rc_up_dt    ,
            String       rc_usr_id   ,
            String       rc_cust_nm  ,
            String       rc_prnt_flg ,
            String       rc_cr_dt    ,
            String       nis_event_dt){
        this.ibflag       = ibflag      ;
        this.page_rows    = page_rows   ;
        this.qtn_ofc      = qtn_ofc     ;
        this.qtn_seq      = qtn_seq     ;
        this.cnt_cd       = cnt_cd      ;
        this.cust_cd      = cust_cd     ;
        this.rc_cust_role = rc_cust_role;
        this.rc_dsp_ind   = rc_dsp_ind  ;
        this.rc_cust_tp   = rc_cust_tp  ;
        this.loc_cd       = loc_cd      ;
        this.rc_up_dt     = rc_up_dt    ;
        this.rc_usr_id    = rc_usr_id   ;
        this.rc_cust_nm   = rc_cust_nm  ;
        this.rc_prnt_flg  = rc_prnt_flg ;
        this.rc_cr_dt     = rc_cr_dt    ;
        this.nis_event_dt = nis_event_dt;
    }

    // getter method is proceeding ..
    public String       getIbflag      (){    return ibflag          ;    }
    public String       getPage_rows   (){    return page_rows       ;    }
    public String       getQtn_ofc     (){    return qtn_ofc         ;    }
    public String       getQtn_seq     (){    return qtn_seq         ;    }
    public String       getCnt_cd      (){    return cnt_cd          ;    }
    public String       getCust_cd     (){    return cust_cd         ;    }
    public String       getRc_cust_role(){    return rc_cust_role    ;    }
    public String       getRc_dsp_ind  (){    return rc_dsp_ind      ;    }
    public String       getRc_cust_tp  (){    return rc_cust_tp      ;    }
    public String       getLoc_cd      (){    return loc_cd          ;    }
    public String       getRc_up_dt    (){    return rc_up_dt        ;    }
    public String       getRc_usr_id   (){    return rc_usr_id       ;    }
    public String       getRc_cust_nm  (){    return rc_cust_nm      ;    }
    public String       getRc_prnt_flg (){    return rc_prnt_flg     ;    }
    public String       getRc_cr_dt    (){    return rc_cr_dt        ;    }
    public String       getNis_event_dt(){    return nis_event_dt    ;    }

    // setter method is proceeding ..
    public void setIbflag      ( String       ibflag       ){    this.ibflag       = ibflag          ;    }
    public void setPage_rows   ( String       page_rows    ){    this.page_rows    = page_rows       ;    }
    public void setQtn_ofc     ( String       qtn_ofc      ){    this.qtn_ofc      = qtn_ofc         ;    }
    public void setQtn_seq     ( String       qtn_seq      ){    this.qtn_seq      = qtn_seq         ;    }
    public void setCnt_cd      ( String       cnt_cd       ){    this.cnt_cd       = cnt_cd          ;    }
    public void setCust_cd     ( String       cust_cd      ){    this.cust_cd      = cust_cd         ;    }
    public void setRc_cust_role( String       rc_cust_role ){    this.rc_cust_role = rc_cust_role    ;    }
    public void setRc_dsp_ind  ( String       rc_dsp_ind   ){    this.rc_dsp_ind   = rc_dsp_ind      ;    }
    public void setRc_cust_tp  ( String       rc_cust_tp   ){    this.rc_cust_tp   = rc_cust_tp      ;    }
    public void setLoc_cd      ( String       loc_cd       ){    this.loc_cd       = loc_cd          ;    }
    public void setRc_up_dt    ( String       rc_up_dt     ){    this.rc_up_dt     = rc_up_dt        ;    }
    public void setRc_usr_id   ( String       rc_usr_id    ){    this.rc_usr_id    = rc_usr_id       ;    }
    public void setRc_cust_nm  ( String       rc_cust_nm   ){    this.rc_cust_nm   = rc_cust_nm      ;    }
    public void setRc_prnt_flg ( String       rc_prnt_flg  ){    this.rc_prnt_flg  = rc_prnt_flg     ;    }
    public void setRc_cr_dt    ( String       rc_cr_dt     ){    this.rc_cr_dt     = rc_cr_dt        ;    }
    public void setNis_event_dt( String       nis_event_dt ){    this.nis_event_dt = nis_event_dt    ;    }

    public static RFA_CUST fromRequest(HttpServletRequest request) {
        RFA_CUST model = new RFA_CUST();
        try {
            model.setIbflag          (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
            model.setPage_rows       (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
            model.setQtn_ofc         (JSPUtil.getParameter(request, "qtn_ofc             ".trim(), ""));
            model.setQtn_seq         (JSPUtil.getParameter(request, "qtn_seq             ".trim(), ""));
            model.setCnt_cd          (JSPUtil.getParameter(request, "cnt_cd              ".trim(), ""));
            model.setCust_cd         (JSPUtil.getParameter(request, "cust_cd             ".trim(), ""));
            model.setRc_cust_role    (JSPUtil.getParameter(request, "rc_cust_role        ".trim(), ""));
            model.setRc_dsp_ind      (JSPUtil.getParameter(request, "rc_dsp_ind          ".trim(), ""));
            model.setRc_cust_tp      (JSPUtil.getParameter(request, "rc_cust_tp          ".trim(), ""));
            model.setLoc_cd          (JSPUtil.getParameter(request, "loc_cd              ".trim(), ""));
            model.setRc_up_dt        (JSPUtil.getParameter(request, "rc_up_dt            ".trim(), ""));
            model.setRc_usr_id       (JSPUtil.getParameter(request, "rc_usr_id           ".trim(), ""));
            model.setRc_cust_nm      (JSPUtil.getParameter(request, "rc_cust_nm          ".trim(), ""));
            model.setRc_prnt_flg     (JSPUtil.getParameter(request, "rc_prnt_flg         ".trim(), ""));
            model.setRc_cr_dt        (JSPUtil.getParameter(request, "rc_cr_dt            ".trim(), ""));
            model.setNis_event_dt    (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        RFA_CUST model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
            String[] qtn_ofc      =  (JSPUtil.getParameter(request, "qtn_ofc             ".trim(), length));
            String[] qtn_seq      =  (JSPUtil.getParameter(request, "qtn_seq             ".trim(), length));
            String[] cnt_cd       =  (JSPUtil.getParameter(request, "cnt_cd              ".trim(), length));
            String[] cust_cd      =  (JSPUtil.getParameter(request, "cust_cd             ".trim(), length));
            String[] rc_cust_role =  (JSPUtil.getParameter(request, "rc_cust_role        ".trim(), length));
            String[] rc_dsp_ind   =  (JSPUtil.getParameter(request, "rc_dsp_ind          ".trim(), length));
            String[] rc_cust_tp   =  (JSPUtil.getParameter(request, "rc_cust_tp          ".trim(), length));
            String[] loc_cd       =  (JSPUtil.getParameter(request, "loc_cd              ".trim(), length));
            String[] rc_up_dt     =  (JSPUtil.getParameter(request, "rc_up_dt            ".trim(), length));
            String[] rc_usr_id    =  (JSPUtil.getParameter(request, "rc_usr_id           ".trim(), length));
            String[] rc_cust_nm   =  (JSPUtil.getParameter(request, "rc_cust_nm          ".trim(), length));
            String[] rc_prnt_flg  =  (JSPUtil.getParameter(request, "rc_prnt_flg         ".trim(), length));
            String[] rc_cr_dt     =  (JSPUtil.getParameter(request, "rc_cr_dt            ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new RFA_CUST();
                model.setIbflag                (ibflag          [i]);
                model.setPage_rows             (page_rows       [i]);
                model.setQtn_ofc               (qtn_ofc         [i]);
                model.setQtn_seq               (qtn_seq         [i]);
                model.setCnt_cd                (cnt_cd          [i]);
                model.setCust_cd               (cust_cd         [i]);
                model.setRc_cust_role          (rc_cust_role    [i]);
                model.setRc_dsp_ind            (rc_dsp_ind      [i]);
                model.setRc_cust_tp            (rc_cust_tp      [i]);
                model.setLoc_cd                (loc_cd          [i]);
                model.setRc_up_dt              (rc_up_dt        [i]);
                model.setRc_usr_id             (rc_usr_id       [i]);
                model.setRc_cust_nm            (rc_cust_nm      [i]);
                model.setRc_prnt_flg           (rc_prnt_flg     [i]);
                model.setRc_cr_dt              (rc_cr_dt        [i]);
                model.setNis_event_dt          (nis_event_dt    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        RFA_CUST model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
            String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
            String[] qtn_ofc      =  (JSPUtil.getParameter(request, prefix + "qtn_ofc             ".trim(), length));
            String[] qtn_seq      =  (JSPUtil.getParameter(request, prefix + "qtn_seq             ".trim(), length));
            String[] cnt_cd       =  (JSPUtil.getParameter(request, prefix + "cnt_cd              ".trim(), length));
            String[] cust_cd      =  (JSPUtil.getParameter(request, prefix + "cust_cd             ".trim(), length));
            String[] rc_cust_role =  (JSPUtil.getParameter(request, prefix + "rc_cust_role        ".trim(), length));
            String[] rc_dsp_ind   =  (JSPUtil.getParameter(request, prefix + "rc_dsp_ind          ".trim(), length));
            String[] rc_cust_tp   =  (JSPUtil.getParameter(request, prefix + "rc_cust_tp          ".trim(), length));
            String[] loc_cd       =  (JSPUtil.getParameter(request, prefix + "loc_cd              ".trim(), length));
            String[] rc_up_dt     =  (JSPUtil.getParameter(request, prefix + "rc_up_dt            ".trim(), length));
            String[] rc_usr_id    =  (JSPUtil.getParameter(request, prefix + "rc_usr_id           ".trim(), length));
            String[] rc_cust_nm   =  (JSPUtil.getParameter(request, prefix + "rc_cust_nm          ".trim(), length));
            String[] rc_prnt_flg  =  (JSPUtil.getParameter(request, prefix + "rc_prnt_flg         ".trim(), length));
            String[] rc_cr_dt     =  (JSPUtil.getParameter(request, prefix + "rc_cr_dt            ".trim(), length));
            String[] nis_event_dt =  (JSPUtil.getParameter(request, prefix + "nis_event_dt        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new RFA_CUST();
                model.setIbflag                ( ibflag          [i]);
                model.setPage_rows             ( page_rows       [i]);
                model.setQtn_ofc               ( qtn_ofc         [i]);
                model.setQtn_seq               ( qtn_seq         [i]);
                model.setCnt_cd                ( cnt_cd          [i]);
                model.setCust_cd               ( cust_cd         [i]);
                model.setRc_cust_role          ( rc_cust_role    [i]);
                model.setRc_dsp_ind            ( rc_dsp_ind      [i]);
                model.setRc_cust_tp            ( rc_cust_tp      [i]);
                model.setLoc_cd                ( loc_cd          [i]);
                model.setRc_up_dt              ( rc_up_dt        [i]);
                model.setRc_usr_id             ( rc_usr_id       [i]);
                model.setRc_cust_nm            ( rc_cust_nm      [i]);
                model.setRc_prnt_flg           ( rc_prnt_flg     [i]);
                model.setRc_cr_dt              ( rc_cr_dt        [i]);
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
