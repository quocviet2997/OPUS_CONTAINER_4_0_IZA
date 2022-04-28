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
 * 4. 작성자/작성일 : jungsunyong/2006.07.05<br>
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
public final class PRD_PROD_CTL_DTL implements java.io.Serializable {

    private String          ibflag          = "";
    private String          page_rows       = "";
    private String          prod_ctl_no     = "";
    private String          prod_ctl_seq    = "";
    private String          org_nod_cd      = "";
    private String          dest_nod_cd     = "";
    private String          nod_lnk_ind_cd  = "";
    private String          io_bnd_cd       = "";
    private String          trsp_mod_cd     = "";
    private String          org_nod_tp_cd   = "";
    private String          dest_nod_tp_cd  = "";
    private String          tz_dwll_tm_dys  = "";
    private String          tz_dwll_tm_hors = "";
    private String          prf_vndr_seq    = "";
    private String          arr_strt_dt     = "";
    private String          dep_fsh_dt      = "";
    private String          vsl_cd          = "";
    private String          skd_voy_no      = "";
    private String          skd_dir_cd      = "";
    private String          aval_teu_spc    = "";
    private String          curr_cd         = "";
    private String          sect_expn_amt   = "";
    private String          cre_usr_id      = "";
    private String          cre_dt          = "";
    private String          upd_usr_id      = "";
    private String          upd_dt          = "";

    public PRD_PROD_CTL_DTL(){}

    public PRD_PROD_CTL_DTL(
            String          ibflag         ,
            String          page_rows      ,
            String          prod_ctl_no    ,
            String          prod_ctl_seq   ,
            String          org_nod_cd     ,
            String          dest_nod_cd    ,
            String          nod_lnk_ind_cd ,
            String          io_bnd_cd      ,
            String          trsp_mod_cd    ,
            String          org_nod_tp_cd  ,
            String          dest_nod_tp_cd ,
            String          tz_dwll_tm_dys ,
            String          tz_dwll_tm_hors,
            String          prf_vndr_seq   ,
            String          arr_strt_dt    ,
            String          dep_fsh_dt     ,
            String          vsl_cd         ,
            String          skd_voy_no     ,
            String          skd_dir_cd     ,
            String          aval_teu_spc   ,
            String          curr_cd        ,
            String          sect_expn_amt  ,
            String          cre_usr_id     ,
            String          cre_dt         ,
            String          upd_usr_id     ,
            String          upd_dt         ){
        this.ibflag          = ibflag         ;
        this.page_rows       = page_rows      ;
        this.prod_ctl_no     = prod_ctl_no    ;
        this.prod_ctl_seq    = prod_ctl_seq   ;
        this.org_nod_cd      = org_nod_cd     ;
        this.dest_nod_cd     = dest_nod_cd    ;
        this.nod_lnk_ind_cd  = nod_lnk_ind_cd ;
        this.io_bnd_cd       = io_bnd_cd      ;
        this.trsp_mod_cd     = trsp_mod_cd    ;
        this.org_nod_tp_cd   = org_nod_tp_cd  ;
        this.dest_nod_tp_cd  = dest_nod_tp_cd ;
        this.tz_dwll_tm_dys  = tz_dwll_tm_dys ;
        this.tz_dwll_tm_hors = tz_dwll_tm_hors;
        this.prf_vndr_seq    = prf_vndr_seq   ;
        this.arr_strt_dt     = arr_strt_dt    ;
        this.dep_fsh_dt      = dep_fsh_dt     ;
        this.vsl_cd          = vsl_cd         ;
        this.skd_voy_no      = skd_voy_no     ;
        this.skd_dir_cd      = skd_dir_cd     ;
        this.aval_teu_spc    = aval_teu_spc   ;
        this.curr_cd         = curr_cd        ;
        this.sect_expn_amt   = sect_expn_amt  ;
        this.cre_usr_id      = cre_usr_id     ;
        this.cre_dt          = cre_dt         ;
        this.upd_usr_id      = upd_usr_id     ;
        this.upd_dt          = upd_dt         ;
    }

    // getter method is proceeding ..
    public String          getIbflag         (){    return ibflag             ;    }
    public String          getPage_rows      (){    return page_rows          ;    }
    public String          getProd_ctl_no    (){    return prod_ctl_no        ;    }
    public String          getProd_ctl_seq   (){    return prod_ctl_seq       ;    }
    public String          getOrg_nod_cd     (){    return org_nod_cd         ;    }
    public String          getDest_nod_cd    (){    return dest_nod_cd        ;    }
    public String          getNod_lnk_ind_cd (){    return nod_lnk_ind_cd     ;    }
    public String          getIo_bnd_cd      (){    return io_bnd_cd          ;    }
    public String          getTrsp_mod_cd    (){    return trsp_mod_cd        ;    }
    public String          getOrg_nod_tp_cd  (){    return org_nod_tp_cd      ;    }
    public String          getDest_nod_tp_cd (){    return dest_nod_tp_cd     ;    }
    public String          getTz_dwll_tm_dys (){    return tz_dwll_tm_dys     ;    }
    public String          getTz_dwll_tm_hors(){    return tz_dwll_tm_hors    ;    }
    public String          getPrf_vndr_seq   (){    return prf_vndr_seq       ;    }
    public String          getArr_strt_dt    (){    return arr_strt_dt        ;    }
    public String          getDep_fsh_dt     (){    return dep_fsh_dt         ;    }
    public String          getVsl_cd         (){    return vsl_cd             ;    }
    public String          getSkd_voy_no     (){    return skd_voy_no         ;    }
    public String          getSkd_dir_cd     (){    return skd_dir_cd         ;    }
    public String          getAval_teu_spc   (){    return aval_teu_spc       ;    }
    public String          getCurr_cd        (){    return curr_cd            ;    }
    public String          getSect_expn_amt  (){    return sect_expn_amt      ;    }
    public String          getCre_usr_id     (){    return cre_usr_id         ;    }
    public String          getCre_dt         (){    return cre_dt             ;    }
    public String          getUpd_usr_id     (){    return upd_usr_id         ;    }
    public String          getUpd_dt         (){    return upd_dt             ;    }

    // setter method is proceeding ..
    public void setIbflag         ( String          ibflag          ){    this.ibflag          = ibflag             ;    }
    public void setPage_rows      ( String          page_rows       ){    this.page_rows       = page_rows          ;    }
    public void setProd_ctl_no    ( String          prod_ctl_no     ){    this.prod_ctl_no     = prod_ctl_no        ;    }
    public void setProd_ctl_seq   ( String          prod_ctl_seq    ){    this.prod_ctl_seq    = prod_ctl_seq       ;    }
    public void setOrg_nod_cd     ( String          org_nod_cd      ){    this.org_nod_cd      = org_nod_cd         ;    }
    public void setDest_nod_cd    ( String          dest_nod_cd     ){    this.dest_nod_cd     = dest_nod_cd        ;    }
    public void setNod_lnk_ind_cd ( String          nod_lnk_ind_cd  ){    this.nod_lnk_ind_cd  = nod_lnk_ind_cd     ;    }
    public void setIo_bnd_cd      ( String          io_bnd_cd       ){    this.io_bnd_cd       = io_bnd_cd          ;    }
    public void setTrsp_mod_cd    ( String          trsp_mod_cd     ){    this.trsp_mod_cd     = trsp_mod_cd        ;    }
    public void setOrg_nod_tp_cd  ( String          org_nod_tp_cd   ){    this.org_nod_tp_cd   = org_nod_tp_cd      ;    }
    public void setDest_nod_tp_cd ( String          dest_nod_tp_cd  ){    this.dest_nod_tp_cd  = dest_nod_tp_cd     ;    }
    public void setTz_dwll_tm_dys ( String          tz_dwll_tm_dys  ){    this.tz_dwll_tm_dys  = tz_dwll_tm_dys     ;    }
    public void setTz_dwll_tm_hors( String          tz_dwll_tm_hors ){    this.tz_dwll_tm_hors = tz_dwll_tm_hors    ;    }
    public void setPrf_vndr_seq   ( String          prf_vndr_seq    ){    this.prf_vndr_seq    = prf_vndr_seq       ;    }
    public void setArr_strt_dt    ( String          arr_strt_dt     ){    this.arr_strt_dt     = arr_strt_dt        ;    }
    public void setDep_fsh_dt     ( String          dep_fsh_dt      ){    this.dep_fsh_dt      = dep_fsh_dt         ;    }
    public void setVsl_cd         ( String          vsl_cd          ){    this.vsl_cd          = vsl_cd             ;    }
    public void setSkd_voy_no     ( String          skd_voy_no      ){    this.skd_voy_no      = skd_voy_no         ;    }
    public void setSkd_dir_cd     ( String          skd_dir_cd      ){    this.skd_dir_cd      = skd_dir_cd         ;    }
    public void setAval_teu_spc   ( String          aval_teu_spc    ){    this.aval_teu_spc    = aval_teu_spc       ;    }
    public void setCurr_cd        ( String          curr_cd         ){    this.curr_cd         = curr_cd            ;    }
    public void setSect_expn_amt  ( String          sect_expn_amt   ){    this.sect_expn_amt   = sect_expn_amt      ;    }
    public void setCre_usr_id     ( String          cre_usr_id      ){    this.cre_usr_id      = cre_usr_id         ;    }
    public void setCre_dt         ( String          cre_dt          ){    this.cre_dt          = cre_dt             ;    }
    public void setUpd_usr_id     ( String          upd_usr_id      ){    this.upd_usr_id      = upd_usr_id         ;    }
    public void setUpd_dt         ( String          upd_dt          ){    this.upd_dt          = upd_dt             ;    }

    public static PRD_PROD_CTL_DTL fromRequest(HttpServletRequest request) {
        PRD_PROD_CTL_DTL model = new PRD_PROD_CTL_DTL();
        try {
            model.setIbflag             (JSPUtil.getParameter(request, "ibflag                 ".trim(), ""));
            model.setPage_rows          (JSPUtil.getParameter(request, "page_rows              ".trim(), ""));
            model.setProd_ctl_no        (JSPUtil.getParameter(request, "prod_ctl_no            ".trim(), ""));
            model.setProd_ctl_seq       (JSPUtil.getParameter(request, "prod_ctl_seq           ".trim(), ""));
            model.setOrg_nod_cd         (JSPUtil.getParameter(request, "org_nod_cd             ".trim(), ""));
            model.setDest_nod_cd        (JSPUtil.getParameter(request, "dest_nod_cd            ".trim(), ""));
            model.setNod_lnk_ind_cd     (JSPUtil.getParameter(request, "nod_lnk_ind_cd         ".trim(), ""));
            model.setIo_bnd_cd          (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), ""));
            model.setTrsp_mod_cd        (JSPUtil.getParameter(request, "trsp_mod_cd            ".trim(), ""));
            model.setOrg_nod_tp_cd      (JSPUtil.getParameter(request, "org_nod_tp_cd          ".trim(), ""));
            model.setDest_nod_tp_cd     (JSPUtil.getParameter(request, "dest_nod_tp_cd         ".trim(), ""));
            model.setTz_dwll_tm_dys     (JSPUtil.getParameter(request, "tz_dwll_tm_dys         ".trim(), ""));
            model.setTz_dwll_tm_hors    (JSPUtil.getParameter(request, "tz_dwll_tm_hors        ".trim(), ""));
            model.setPrf_vndr_seq       (JSPUtil.getParameter(request, "prf_vndr_seq           ".trim(), ""));
            model.setArr_strt_dt        (JSPUtil.getParameter(request, "arr_strt_dt            ".trim(), ""));
            model.setDep_fsh_dt         (JSPUtil.getParameter(request, "dep_fsh_dt             ".trim(), ""));
            model.setVsl_cd             (JSPUtil.getParameter(request, "vsl_cd                 ".trim(), ""));
            model.setSkd_voy_no         (JSPUtil.getParameter(request, "skd_voy_no             ".trim(), ""));
            model.setSkd_dir_cd         (JSPUtil.getParameter(request, "skd_dir_cd             ".trim(), ""));
            model.setAval_teu_spc       (JSPUtil.getParameter(request, "aval_teu_spc           ".trim(), ""));
            model.setCurr_cd            (JSPUtil.getParameter(request, "curr_cd                ".trim(), ""));
            model.setSect_expn_amt      (JSPUtil.getParameter(request, "sect_expn_amt          ".trim(), ""));
            model.setCre_usr_id         (JSPUtil.getParameter(request, "cre_usr_id             ".trim(), ""));
            model.setCre_dt             (JSPUtil.getParameter(request, "cre_dt                 ".trim(), ""));
            model.setUpd_usr_id         (JSPUtil.getParameter(request, "upd_usr_id             ".trim(), ""));
            model.setUpd_dt             (JSPUtil.getParameter(request, "upd_dt                 ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        PRD_PROD_CTL_DTL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag                 ".trim(), length));
            String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows              ".trim(), length));
            String[] prod_ctl_no     =  (JSPUtil.getParameter(request, "prod_ctl_no            ".trim(), length));
            String[] prod_ctl_seq    =  (JSPUtil.getParameter(request, "prod_ctl_seq           ".trim(), length));
            String[] org_nod_cd      =  (JSPUtil.getParameter(request, "org_nod_cd             ".trim(), length));
            String[] dest_nod_cd     =  (JSPUtil.getParameter(request, "dest_nod_cd            ".trim(), length));
            String[] nod_lnk_ind_cd  =  (JSPUtil.getParameter(request, "nod_lnk_ind_cd         ".trim(), length));
            String[] io_bnd_cd       =  (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), length));
            String[] trsp_mod_cd     =  (JSPUtil.getParameter(request, "trsp_mod_cd            ".trim(), length));
            String[] org_nod_tp_cd   =  (JSPUtil.getParameter(request, "org_nod_tp_cd          ".trim(), length));
            String[] dest_nod_tp_cd  =  (JSPUtil.getParameter(request, "dest_nod_tp_cd         ".trim(), length));
            String[] tz_dwll_tm_dys  =  (JSPUtil.getParameter(request, "tz_dwll_tm_dys         ".trim(), length));
            String[] tz_dwll_tm_hors =  (JSPUtil.getParameter(request, "tz_dwll_tm_hors        ".trim(), length));
            String[] prf_vndr_seq    =  (JSPUtil.getParameter(request, "prf_vndr_seq           ".trim(), length));
            String[] arr_strt_dt     =  (JSPUtil.getParameter(request, "arr_strt_dt            ".trim(), length));
            String[] dep_fsh_dt      =  (JSPUtil.getParameter(request, "dep_fsh_dt             ".trim(), length));
            String[] vsl_cd          =  (JSPUtil.getParameter(request, "vsl_cd                 ".trim(), length));
            String[] skd_voy_no      =  (JSPUtil.getParameter(request, "skd_voy_no             ".trim(), length));
            String[] skd_dir_cd      =  (JSPUtil.getParameter(request, "skd_dir_cd             ".trim(), length));
            String[] aval_teu_spc    =  (JSPUtil.getParameter(request, "aval_teu_spc           ".trim(), length));
            String[] curr_cd         =  (JSPUtil.getParameter(request, "curr_cd                ".trim(), length));
            String[] sect_expn_amt   =  (JSPUtil.getParameter(request, "sect_expn_amt          ".trim(), length));
            String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id             ".trim(), length));
            String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt                 ".trim(), length));
            String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id             ".trim(), length));
            String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt                 ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_PROD_CTL_DTL();
                model.setIbflag                   (ibflag             [i]);
                model.setPage_rows                (page_rows          [i]);
                model.setProd_ctl_no              (prod_ctl_no        [i]);
                model.setProd_ctl_seq             (prod_ctl_seq       [i]);
                model.setOrg_nod_cd               (org_nod_cd         [i]);
                model.setDest_nod_cd              (dest_nod_cd        [i]);
                model.setNod_lnk_ind_cd           (nod_lnk_ind_cd     [i]);
                model.setIo_bnd_cd                (io_bnd_cd          [i]);
                model.setTrsp_mod_cd              (trsp_mod_cd        [i]);
                model.setOrg_nod_tp_cd            (org_nod_tp_cd      [i]);
                model.setDest_nod_tp_cd           (dest_nod_tp_cd     [i]);
                model.setTz_dwll_tm_dys           (tz_dwll_tm_dys     [i]);
                model.setTz_dwll_tm_hors          (tz_dwll_tm_hors    [i]);
                model.setPrf_vndr_seq             (prf_vndr_seq       [i]);
                model.setArr_strt_dt              (arr_strt_dt        [i]);
                model.setDep_fsh_dt               (dep_fsh_dt         [i]);
                model.setVsl_cd                   (vsl_cd             [i]);
                model.setSkd_voy_no               (skd_voy_no         [i]);
                model.setSkd_dir_cd               (skd_dir_cd         [i]);
                model.setAval_teu_spc             (aval_teu_spc       [i]);
                model.setCurr_cd                  (curr_cd            [i]);
                model.setSect_expn_amt            (sect_expn_amt      [i]);
                model.setCre_usr_id               (cre_usr_id         [i]);
                model.setCre_dt                   (cre_dt             [i]);
                model.setUpd_usr_id               (upd_usr_id         [i]);
                model.setUpd_dt                   (upd_dt             [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        PRD_PROD_CTL_DTL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag                 ".trim(), length));
            String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows              ".trim(), length));
            String[] prod_ctl_no     =  (JSPUtil.getParameter(request, "prod_ctl_no            ".trim(), length));
            String[] prod_ctl_seq    =  (JSPUtil.getParameter(request, "prod_ctl_seq           ".trim(), length));
            String[] org_nod_cd      =  (JSPUtil.getParameter(request, "org_nod_cd             ".trim(), length));
            String[] dest_nod_cd     =  (JSPUtil.getParameter(request, "dest_nod_cd            ".trim(), length));
            String[] nod_lnk_ind_cd  =  (JSPUtil.getParameter(request, "nod_lnk_ind_cd         ".trim(), length));
            String[] io_bnd_cd       =  (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), length));
            String[] trsp_mod_cd     =  (JSPUtil.getParameter(request, "trsp_mod_cd            ".trim(), length));
            String[] org_nod_tp_cd   =  (JSPUtil.getParameter(request, "org_nod_tp_cd          ".trim(), length));
            String[] dest_nod_tp_cd  =  (JSPUtil.getParameter(request, "dest_nod_tp_cd         ".trim(), length));
            String[] tz_dwll_tm_dys  =  (JSPUtil.getParameter(request, "tz_dwll_tm_dys         ".trim(), length));
            String[] tz_dwll_tm_hors =  (JSPUtil.getParameter(request, "tz_dwll_tm_hors        ".trim(), length));
            String[] prf_vndr_seq    =  (JSPUtil.getParameter(request, "prf_vndr_seq           ".trim(), length));
            String[] arr_strt_dt     =  (JSPUtil.getParameter(request, "arr_strt_dt            ".trim(), length));
            String[] dep_fsh_dt      =  (JSPUtil.getParameter(request, "dep_fsh_dt             ".trim(), length));
            String[] vsl_cd          =  (JSPUtil.getParameter(request, "vsl_cd                 ".trim(), length));
            String[] skd_voy_no      =  (JSPUtil.getParameter(request, "skd_voy_no             ".trim(), length));
            String[] skd_dir_cd      =  (JSPUtil.getParameter(request, "skd_dir_cd             ".trim(), length));
            String[] aval_teu_spc    =  (JSPUtil.getParameter(request, "aval_teu_spc           ".trim(), length));
            String[] curr_cd         =  (JSPUtil.getParameter(request, "curr_cd                ".trim(), length));
            String[] sect_expn_amt   =  (JSPUtil.getParameter(request, "sect_expn_amt          ".trim(), length));
            String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id             ".trim(), length));
            String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt                 ".trim(), length));
            String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id             ".trim(), length));
            String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt                 ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_PROD_CTL_DTL();
                model.setIbflag                   (ibflag             [i]);
                model.setPage_rows                (page_rows          [i]);
                model.setProd_ctl_no              (prod_ctl_no        [i]);
                model.setProd_ctl_seq             (prod_ctl_seq       [i]);
                model.setOrg_nod_cd               (org_nod_cd         [i]);
                model.setDest_nod_cd              (dest_nod_cd        [i]);
                model.setNod_lnk_ind_cd           (nod_lnk_ind_cd     [i]);
                model.setIo_bnd_cd                (io_bnd_cd          [i]);
                model.setTrsp_mod_cd              (trsp_mod_cd        [i]);
                model.setOrg_nod_tp_cd            (org_nod_tp_cd      [i]);
                model.setDest_nod_tp_cd           (dest_nod_tp_cd     [i]);
                model.setTz_dwll_tm_dys           (tz_dwll_tm_dys     [i]);
                model.setTz_dwll_tm_hors          (tz_dwll_tm_hors    [i]);
                model.setPrf_vndr_seq             (prf_vndr_seq       [i]);
                model.setArr_strt_dt              (arr_strt_dt        [i]);
                model.setDep_fsh_dt               (dep_fsh_dt         [i]);
                model.setVsl_cd                   (vsl_cd             [i]);
                model.setSkd_voy_no               (skd_voy_no         [i]);
                model.setSkd_dir_cd               (skd_dir_cd         [i]);
                model.setAval_teu_spc             (aval_teu_spc       [i]);
                model.setCurr_cd                  (curr_cd            [i]);
                model.setSect_expn_amt            (sect_expn_amt      [i]);
                model.setCre_usr_id               (cre_usr_id         [i]);
                model.setCre_dt                   (cre_dt             [i]);
                model.setUpd_usr_id               (upd_usr_id         [i]);
                model.setUpd_dt                   (upd_dt             [i]);
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
