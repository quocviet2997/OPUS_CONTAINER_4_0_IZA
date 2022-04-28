/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SCE_COP_DTL.java
*@FileTitle : COPManage
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : Se-Hoon PARK
*@LastVersion : 1.0
* 2006-09-13 Se-Hoon PARK
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
 * @author Se-Hoon PARK
 * @since J2EE 1.4
 */public final class SCE_COP_DTL implements java.io.Serializable {

    private String           ibflag           = "";
    private String           page_rows        = "";
    private String           cop_no           = "";
    private String           cop_grp_seq      = "";
    private String           cop_dtl_seq      = "";
    private String           act_cd           = "";
    private String           cop_dtl_add_seq1 = "";
    private String           cop_dtl_add_seq2 = "";
    private String           pln_dt           = "";
    private String           estm_dt          = "";
    private String           act_dt           = "";
    private String           nod_cd           = "";
    private String           act_sts_cd       = "";
    private String           cop_expt_his_cd  = "";
    private String           expt_tol_val     = "";
    private String           expt_tol_ut_cd   = "";
    private String           act_rcv_tp_cd    = "";
    private String           cre_usr_id       = "";
    private String           cre_dt           = "";
    private String           upd_usr_id       = "";
    private String           upd_dt           = "";

    public SCE_COP_DTL(){}

    public SCE_COP_DTL(
            String           ibflag          ,
            String           page_rows       ,
            String           cop_no          ,
            String           cop_grp_seq     ,
            String           cop_dtl_seq     ,
            String           act_cd          ,
            String           cop_dtl_add_seq1,
            String           cop_dtl_add_seq2,
            String           pln_dt          ,
            String           estm_dt         ,
            String           act_dt          ,
            String           nod_cd          ,
            String           act_sts_cd      ,
            String           cop_expt_his_cd ,
            String           expt_tol_val    ,
            String           expt_tol_ut_cd  ,
            String           act_rcv_tp_cd   ,
            String           cre_usr_id      ,
            String           cre_dt          ,
            String           upd_usr_id      ,
            String           upd_dt          ){
        this.ibflag           = ibflag          ;
        this.page_rows        = page_rows       ;
        this.cop_no           = cop_no          ;
        this.cop_grp_seq      = cop_grp_seq     ;
        this.cop_dtl_seq      = cop_dtl_seq     ;
        this.act_cd           = act_cd          ;
        this.cop_dtl_add_seq1 = cop_dtl_add_seq1;
        this.cop_dtl_add_seq2 = cop_dtl_add_seq2;
        this.pln_dt           = pln_dt          ;
        this.estm_dt          = estm_dt         ;
        this.act_dt           = act_dt          ;
        this.nod_cd           = nod_cd          ;
        this.act_sts_cd       = act_sts_cd      ;
        this.cop_expt_his_cd  = cop_expt_his_cd ;
        this.expt_tol_val     = expt_tol_val    ;
        this.expt_tol_ut_cd   = expt_tol_ut_cd  ;
        this.act_rcv_tp_cd    = act_rcv_tp_cd   ;
        this.cre_usr_id       = cre_usr_id      ;
        this.cre_dt           = cre_dt          ;
        this.upd_usr_id       = upd_usr_id      ;
        this.upd_dt           = upd_dt          ;
    }

    // getter method is proceeding ..
    public String           getIbflag          (){    return ibflag              ;    }
    public String           getPage_rows       (){    return page_rows           ;    }
    public String           getCop_no          (){    return cop_no              ;    }
    public String           getCop_grp_seq     (){    return cop_grp_seq         ;    }
    public String           getCop_dtl_seq     (){    return cop_dtl_seq         ;    }
    public String           getAct_cd          (){    return act_cd              ;    }
    public String           getCop_dtl_add_seq1(){    return cop_dtl_add_seq1    ;    }
    public String           getCop_dtl_add_seq2(){    return cop_dtl_add_seq2    ;    }
    public String           getPln_dt          (){    return pln_dt              ;    }
    public String           getEstm_dt         (){    return estm_dt             ;    }
    public String           getAct_dt          (){    return act_dt              ;    }
    public String           getNod_cd          (){    return nod_cd              ;    }
    public String           getAct_sts_cd      (){    return act_sts_cd          ;    }
    public String           getCop_expt_his_cd (){    return cop_expt_his_cd     ;    }
    public String           getExpt_tol_val    (){    return expt_tol_val        ;    }
    public String           getExpt_tol_ut_cd  (){    return expt_tol_ut_cd      ;    }
    public String           getAct_rcv_tp_cd   (){    return act_rcv_tp_cd       ;    }
    public String           getCre_usr_id      (){    return cre_usr_id          ;    }
    public String           getCre_dt          (){    return cre_dt              ;    }
    public String           getUpd_usr_id      (){    return upd_usr_id          ;    }
    public String           getUpd_dt          (){    return upd_dt              ;    }

    // setter method is proceeding ..
    public void setIbflag          ( String           ibflag           ){    this.ibflag           = ibflag              ;    }
    public void setPage_rows       ( String           page_rows        ){    this.page_rows        = page_rows           ;    }
    public void setCop_no          ( String           cop_no           ){    this.cop_no           = cop_no              ;    }
    public void setCop_grp_seq     ( String           cop_grp_seq      ){    this.cop_grp_seq      = cop_grp_seq         ;    }
    public void setCop_dtl_seq     ( String           cop_dtl_seq      ){    this.cop_dtl_seq      = cop_dtl_seq         ;    }
    public void setAct_cd          ( String           act_cd           ){    this.act_cd           = act_cd              ;    }
    public void setCop_dtl_add_seq1( String           cop_dtl_add_seq1 ){    this.cop_dtl_add_seq1 = cop_dtl_add_seq1    ;    }
    public void setCop_dtl_add_seq2( String           cop_dtl_add_seq2 ){    this.cop_dtl_add_seq2 = cop_dtl_add_seq2    ;    }
    public void setPln_dt          ( String           pln_dt           ){    this.pln_dt           = pln_dt              ;    }
    public void setEstm_dt         ( String           estm_dt          ){    this.estm_dt          = estm_dt             ;    }
    public void setAct_dt          ( String           act_dt           ){    this.act_dt           = act_dt              ;    }
    public void setNod_cd          ( String           nod_cd           ){    this.nod_cd           = nod_cd              ;    }
    public void setAct_sts_cd      ( String           act_sts_cd       ){    this.act_sts_cd       = act_sts_cd          ;    }
    public void setCop_expt_his_cd ( String           cop_expt_his_cd  ){    this.cop_expt_his_cd  = cop_expt_his_cd     ;    }
    public void setExpt_tol_val    ( String           expt_tol_val     ){    this.expt_tol_val     = expt_tol_val        ;    }
    public void setExpt_tol_ut_cd  ( String           expt_tol_ut_cd   ){    this.expt_tol_ut_cd   = expt_tol_ut_cd      ;    }
    public void setAct_rcv_tp_cd   ( String           act_rcv_tp_cd    ){    this.act_rcv_tp_cd    = act_rcv_tp_cd       ;    }
    public void setCre_usr_id      ( String           cre_usr_id       ){    this.cre_usr_id       = cre_usr_id          ;    }
    public void setCre_dt          ( String           cre_dt           ){    this.cre_dt           = cre_dt              ;    }
    public void setUpd_usr_id      ( String           upd_usr_id       ){    this.upd_usr_id       = upd_usr_id          ;    }
    public void setUpd_dt          ( String           upd_dt           ){    this.upd_dt           = upd_dt              ;    }

    public static SCE_COP_DTL fromRequest(HttpServletRequest request) {
        SCE_COP_DTL model = new SCE_COP_DTL();
        try {
            model.setIbflag              (JSPUtil.getParameter(request, "ibflag                  ".trim(), ""));
            model.setPage_rows           (JSPUtil.getParameter(request, "page_rows               ".trim(), ""));
            model.setCop_no              (JSPUtil.getParameter(request, "cop_no                  ".trim(), ""));
            model.setCop_grp_seq         (JSPUtil.getParameter(request, "cop_grp_seq             ".trim(), ""));
            model.setCop_dtl_seq         (JSPUtil.getParameter(request, "cop_dtl_seq             ".trim(), ""));
            model.setAct_cd              (JSPUtil.getParameter(request, "act_cd                  ".trim(), ""));
            model.setCop_dtl_add_seq1    (JSPUtil.getParameter(request, "cop_dtl_add_seq1        ".trim(), ""));
            model.setCop_dtl_add_seq2    (JSPUtil.getParameter(request, "cop_dtl_add_seq2        ".trim(), ""));
            model.setPln_dt              (JSPUtil.getParameter(request, "pln_dt                  ".trim(), ""));
            model.setEstm_dt             (JSPUtil.getParameter(request, "estm_dt                 ".trim(), ""));
            model.setAct_dt              (JSPUtil.getParameter(request, "act_dt                  ".trim(), ""));
            model.setNod_cd              (JSPUtil.getParameter(request, "nod_cd                  ".trim(), ""));
            model.setAct_sts_cd          (JSPUtil.getParameter(request, "act_sts_cd              ".trim(), ""));
            model.setCop_expt_his_cd     (JSPUtil.getParameter(request, "cop_expt_his_cd         ".trim(), ""));
            model.setExpt_tol_val        (JSPUtil.getParameter(request, "expt_tol_val            ".trim(), ""));
            model.setExpt_tol_ut_cd      (JSPUtil.getParameter(request, "expt_tol_ut_cd          ".trim(), ""));
            model.setAct_rcv_tp_cd       (JSPUtil.getParameter(request, "act_rcv_tp_cd           ".trim(), ""));
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
        SCE_COP_DTL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows               ".trim(), length));
            String[] cop_no           =  (JSPUtil.getParameter(request, "cop_no                  ".trim(), length));
            String[] cop_grp_seq      =  (JSPUtil.getParameter(request, "cop_grp_seq             ".trim(), length));
            String[] cop_dtl_seq      =  (JSPUtil.getParameter(request, "cop_dtl_seq             ".trim(), length));
            String[] act_cd           =  (JSPUtil.getParameter(request, "act_cd                  ".trim(), length));
            String[] cop_dtl_add_seq1 =  (JSPUtil.getParameter(request, "cop_dtl_add_seq1        ".trim(), length));
            String[] cop_dtl_add_seq2 =  (JSPUtil.getParameter(request, "cop_dtl_add_seq2        ".trim(), length));
            String[] pln_dt           =  (JSPUtil.getParameter(request, "pln_dt                  ".trim(), length));
            String[] estm_dt          =  (JSPUtil.getParameter(request, "estm_dt                 ".trim(), length));
            String[] act_dt           =  (JSPUtil.getParameter(request, "act_dt                  ".trim(), length));
            String[] nod_cd           =  (JSPUtil.getParameter(request, "nod_cd                  ".trim(), length));
            String[] act_sts_cd       =  (JSPUtil.getParameter(request, "act_sts_cd              ".trim(), length));
            String[] cop_expt_his_cd  =  (JSPUtil.getParameter(request, "cop_expt_his_cd         ".trim(), length));
            String[] expt_tol_val     =  (JSPUtil.getParameter(request, "expt_tol_val            ".trim(), length));
            String[] expt_tol_ut_cd   =  (JSPUtil.getParameter(request, "expt_tol_ut_cd          ".trim(), length));
            String[] act_rcv_tp_cd    =  (JSPUtil.getParameter(request, "act_rcv_tp_cd           ".trim(), length));
            String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id              ".trim(), length));
            String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt                  ".trim(), length));
            String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id              ".trim(), length));
            String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt                  ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_DTL();
                model.setIbflag                    (ibflag              [i]);
                model.setPage_rows                 (page_rows           [i]);
                model.setCop_no                    (cop_no              [i]);
                model.setCop_grp_seq               (cop_grp_seq         [i]);
                model.setCop_dtl_seq               (cop_dtl_seq         [i]);
                model.setAct_cd                    (act_cd              [i]);
                model.setCop_dtl_add_seq1          (cop_dtl_add_seq1    [i]);
                model.setCop_dtl_add_seq2          (cop_dtl_add_seq2    [i]);
                model.setPln_dt                    (pln_dt              [i]);
                model.setEstm_dt                   (estm_dt             [i]);
                model.setAct_dt                    (act_dt              [i]);
                model.setNod_cd                    (nod_cd              [i]);
                model.setAct_sts_cd                (act_sts_cd          [i]);
                model.setCop_expt_his_cd           (cop_expt_his_cd     [i]);
                model.setExpt_tol_val              (expt_tol_val        [i]);
                model.setExpt_tol_ut_cd            (expt_tol_ut_cd      [i]);
                model.setAct_rcv_tp_cd             (act_rcv_tp_cd       [i]);
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
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        SCE_COP_DTL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag                  ".trim(), length));
            String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows               ".trim(), length));
            String[] cop_no           =  (JSPUtil.getParameter(request, prefix + "cop_no                  ".trim(), length));
            String[] cop_grp_seq      =  (JSPUtil.getParameter(request, prefix + "cop_grp_seq             ".trim(), length));
            String[] cop_dtl_seq      =  (JSPUtil.getParameter(request, prefix + "cop_dtl_seq             ".trim(), length));
            String[] act_cd           =  (JSPUtil.getParameter(request, prefix + "act_cd                  ".trim(), length));
            String[] cop_dtl_add_seq1 =  (JSPUtil.getParameter(request, prefix + "cop_dtl_add_seq1        ".trim(), length));
            String[] cop_dtl_add_seq2 =  (JSPUtil.getParameter(request, prefix + "cop_dtl_add_seq2        ".trim(), length));
            String[] pln_dt           =  (JSPUtil.getParameter(request, prefix + "pln_dt                  ".trim(), length));
            String[] estm_dt          =  (JSPUtil.getParameter(request, prefix + "estm_dt                 ".trim(), length));
            String[] act_dt           =  (JSPUtil.getParameter(request, prefix + "act_dt                  ".trim(), length));
            String[] nod_cd           =  (JSPUtil.getParameter(request, prefix + "nod_cd                  ".trim(), length));
            String[] act_sts_cd       =  (JSPUtil.getParameter(request, prefix + "act_sts_cd              ".trim(), length));
            String[] cop_expt_his_cd  =  (JSPUtil.getParameter(request, prefix + "cop_expt_his_cd         ".trim(), length));
            String[] expt_tol_val     =  (JSPUtil.getParameter(request, prefix + "expt_tol_val            ".trim(), length));
            String[] expt_tol_ut_cd   =  (JSPUtil.getParameter(request, prefix + "expt_tol_ut_cd          ".trim(), length));
            String[] act_rcv_tp_cd    =  (JSPUtil.getParameter(request, prefix + "act_rcv_tp_cd           ".trim(), length));
            String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id              ".trim(), length));
            String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt                  ".trim(), length));
            String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id              ".trim(), length));
            String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt                  ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_DTL();
                model.setIbflag                    ( ibflag              [i]);
                model.setPage_rows                 ( page_rows           [i]);
                model.setCop_no                    ( cop_no              [i]);
                model.setCop_grp_seq               ( cop_grp_seq         [i]);
                model.setCop_dtl_seq               ( cop_dtl_seq         [i]);
                model.setAct_cd                    ( act_cd              [i]);
                model.setCop_dtl_add_seq1          ( cop_dtl_add_seq1    [i]);
                model.setCop_dtl_add_seq2          ( cop_dtl_add_seq2    [i]);
                model.setPln_dt                    ( pln_dt              [i]);
                model.setEstm_dt                   ( estm_dt             [i]);
                model.setAct_dt                    ( act_dt              [i]);
                model.setNod_cd                    ( nod_cd              [i]);
                model.setAct_sts_cd                ( act_sts_cd          [i]);
                model.setCop_expt_his_cd           ( cop_expt_his_cd     [i]);
                model.setExpt_tol_val              ( expt_tol_val        [i]);
                model.setExpt_tol_ut_cd            ( expt_tol_ut_cd      [i]);
                model.setAct_rcv_tp_cd             ( act_rcv_tp_cd       [i]);
                model.setCre_usr_id                ( cre_usr_id          [i]);
                model.setCre_dt                    ( cre_dt              [i]);
                model.setUpd_usr_id                ( upd_usr_id          [i]);
                model.setUpd_dt                    ( upd_dt              [i]);
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
