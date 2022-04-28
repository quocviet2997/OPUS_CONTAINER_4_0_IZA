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
public final class PRD_FDR_LNK implements java.io.Serializable {

    private String          ibflag          = "";
    private String          page_rows       = "";
    private String          lnk_org_loc_cd  = "";
    private String          lnk_dest_loc_cd = "";
    private String          tztm_dys        = "";
    private String          tztm_hors       = "";
    private String          fdr_freq_knt    = "";
    private String          vndr_seq        = "";
    private String          io_bnd_cd       = "";
    private String          cre_ofc_cd      = "";
    private String          lnk_rmk         = "";
    private String          cre_usr_id      = "";
    private String          cre_dt          = "";
    private String          upd_usr_id      = "";
    private String          upd_dt          = "";

    public PRD_FDR_LNK(){}

    public PRD_FDR_LNK(
            String          ibflag         ,
            String          page_rows      ,
            String          lnk_org_loc_cd ,
            String          lnk_dest_loc_cd,
            String          tztm_dys       ,
            String          tztm_hors      ,
            String          fdr_freq_knt   ,
            String          vndr_seq       ,
            String          io_bnd_cd      ,
            String          cre_ofc_cd     ,
            String          lnk_rmk        ,
            String          cre_usr_id     ,
            String          cre_dt         ,
            String          upd_usr_id     ,
            String          upd_dt         ){
        this.ibflag          = ibflag         ;
        this.page_rows       = page_rows      ;
        this.lnk_org_loc_cd  = lnk_org_loc_cd ;
        this.lnk_dest_loc_cd = lnk_dest_loc_cd;
        this.tztm_dys        = tztm_dys       ;
        this.tztm_hors       = tztm_hors      ;
        this.fdr_freq_knt    = fdr_freq_knt   ;
        this.vndr_seq        = vndr_seq       ;
        this.io_bnd_cd       = io_bnd_cd      ;
        this.cre_ofc_cd      = cre_ofc_cd     ;
        this.lnk_rmk         = lnk_rmk        ;
        this.cre_usr_id      = cre_usr_id     ;
        this.cre_dt          = cre_dt         ;
        this.upd_usr_id      = upd_usr_id     ;
        this.upd_dt          = upd_dt         ;
    }

    // getter method is proceeding ..
    public String          getIbflag         (){    return ibflag             ;    }
    public String          getPage_rows      (){    return page_rows          ;    }
    public String          getLnk_org_loc_cd (){    return lnk_org_loc_cd     ;    }
    public String          getLnk_dest_loc_cd(){    return lnk_dest_loc_cd    ;    }
    public String          getTztm_dys       (){    return tztm_dys           ;    }
    public String          getTztm_hors      (){    return tztm_hors          ;    }
    public String          getFdr_freq_knt   (){    return fdr_freq_knt       ;    }
    public String          getVndr_seq       (){    return vndr_seq           ;    }
    public String          getIo_bnd_cd      (){    return io_bnd_cd          ;    }
    public String          getCre_ofc_cd     (){    return cre_ofc_cd         ;    }
    public String          getLnk_rmk        (){    return lnk_rmk            ;    }
    public String          getCre_usr_id     (){    return cre_usr_id         ;    }
    public String          getCre_dt         (){    return cre_dt             ;    }
    public String          getUpd_usr_id     (){    return upd_usr_id         ;    }
    public String          getUpd_dt         (){    return upd_dt             ;    }

    // setter method is proceeding ..
    public void setIbflag         ( String          ibflag          ){    this.ibflag          = ibflag             ;    }
    public void setPage_rows      ( String          page_rows       ){    this.page_rows       = page_rows          ;    }
    public void setLnk_org_loc_cd ( String          lnk_org_loc_cd  ){    this.lnk_org_loc_cd  = lnk_org_loc_cd     ;    }
    public void setLnk_dest_loc_cd( String          lnk_dest_loc_cd ){    this.lnk_dest_loc_cd = lnk_dest_loc_cd    ;    }
    public void setTztm_dys       ( String          tztm_dys        ){    this.tztm_dys        = tztm_dys           ;    }
    public void setTztm_hors      ( String          tztm_hors       ){    this.tztm_hors       = tztm_hors          ;    }
    public void setFdr_freq_knt   ( String          fdr_freq_knt    ){    this.fdr_freq_knt    = fdr_freq_knt       ;    }
    public void setVndr_seq       ( String          vndr_seq        ){    this.vndr_seq        = vndr_seq           ;    }
    public void setIo_bnd_cd      ( String          io_bnd_cd       ){    this.io_bnd_cd       = io_bnd_cd          ;    }
    public void setCre_ofc_cd     ( String          cre_ofc_cd      ){    this.cre_ofc_cd      = cre_ofc_cd         ;    }
    public void setLnk_rmk        ( String          lnk_rmk         ){    this.lnk_rmk         = lnk_rmk            ;    }
    public void setCre_usr_id     ( String          cre_usr_id      ){    this.cre_usr_id      = cre_usr_id         ;    }
    public void setCre_dt         ( String          cre_dt          ){    this.cre_dt          = cre_dt             ;    }
    public void setUpd_usr_id     ( String          upd_usr_id      ){    this.upd_usr_id      = upd_usr_id         ;    }
    public void setUpd_dt         ( String          upd_dt          ){    this.upd_dt          = upd_dt             ;    }

    public static PRD_FDR_LNK fromRequest(HttpServletRequest request) {
        PRD_FDR_LNK model = new PRD_FDR_LNK();
        try {
            model.setIbflag             (JSPUtil.getParameter(request, "ibflag                 ".trim(), ""));
            model.setPage_rows          (JSPUtil.getParameter(request, "page_rows              ".trim(), ""));
            model.setLnk_org_loc_cd     (JSPUtil.getParameter(request, "lnk_org_loc_cd         ".trim(), ""));
            model.setLnk_dest_loc_cd    (JSPUtil.getParameter(request, "lnk_dest_loc_cd        ".trim(), ""));
            model.setTztm_dys           (JSPUtil.getParameter(request, "tztm_dys               ".trim(), ""));
            model.setTztm_hors          (JSPUtil.getParameter(request, "tztm_hors              ".trim(), ""));
            model.setFdr_freq_knt       (JSPUtil.getParameter(request, "fdr_freq_knt           ".trim(), ""));
            model.setVndr_seq           (JSPUtil.getParameter(request, "vndr_seq               ".trim(), ""));
            model.setIo_bnd_cd          (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), ""));
            model.setCre_ofc_cd         (JSPUtil.getParameter(request, "cre_ofc_cd             ".trim(), ""));
            model.setLnk_rmk            (JSPUtil.getParameter(request, "lnk_rmk                ".trim(), ""));
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
        PRD_FDR_LNK model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag                 ".trim(), length));
            String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows              ".trim(), length));
            String[] lnk_org_loc_cd  =  (JSPUtil.getParameter(request, "lnk_org_loc_cd         ".trim(), length));
            String[] lnk_dest_loc_cd =  (JSPUtil.getParameter(request, "lnk_dest_loc_cd        ".trim(), length));
            String[] tztm_dys        =  (JSPUtil.getParameter(request, "tztm_dys               ".trim(), length));
            String[] tztm_hors       =  (JSPUtil.getParameter(request, "tztm_hors              ".trim(), length));
            String[] fdr_freq_knt    =  (JSPUtil.getParameter(request, "fdr_freq_knt           ".trim(), length));
            String[] vndr_seq        =  (JSPUtil.getParameter(request, "vndr_seq               ".trim(), length));
            String[] io_bnd_cd       =  (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), length));
            String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, "cre_ofc_cd             ".trim(), length));
            String[] lnk_rmk         =  (JSPUtil.getParameter(request, "lnk_rmk                ".trim(), length));
            String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id             ".trim(), length));
            String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt                 ".trim(), length));
            String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id             ".trim(), length));
            String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt                 ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_FDR_LNK();
                model.setIbflag                   (ibflag             [i]);
                model.setPage_rows                (page_rows          [i]);
                model.setLnk_org_loc_cd           (lnk_org_loc_cd     [i]);
                model.setLnk_dest_loc_cd          (lnk_dest_loc_cd    [i]);
                model.setTztm_dys                 (tztm_dys           [i]);
                model.setTztm_hors                (tztm_hors          [i]);
                model.setFdr_freq_knt             (fdr_freq_knt       [i]);
                model.setVndr_seq                 (vndr_seq           [i]);
                model.setIo_bnd_cd                (io_bnd_cd          [i]);
                model.setCre_ofc_cd               (cre_ofc_cd         [i]);
                model.setLnk_rmk                  (lnk_rmk            [i]);
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
        PRD_FDR_LNK model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag                 ".trim(), length));
            String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows              ".trim(), length));
            String[] lnk_org_loc_cd  =  (JSPUtil.getParameter(request, "lnk_org_loc_cd         ".trim(), length));
            String[] lnk_dest_loc_cd =  (JSPUtil.getParameter(request, "lnk_dest_loc_cd        ".trim(), length));
            String[] tztm_dys        =  (JSPUtil.getParameter(request, "tztm_dys               ".trim(), length));
            String[] tztm_hors       =  (JSPUtil.getParameter(request, "tztm_hors              ".trim(), length));
            String[] fdr_freq_knt    =  (JSPUtil.getParameter(request, "fdr_freq_knt           ".trim(), length));
            String[] vndr_seq        =  (JSPUtil.getParameter(request, "vndr_seq               ".trim(), length));
            String[] io_bnd_cd       =  (JSPUtil.getParameter(request, "io_bnd_cd              ".trim(), length));
            String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, "cre_ofc_cd             ".trim(), length));
            String[] lnk_rmk         =  (JSPUtil.getParameter(request, "lnk_rmk                ".trim(), length));
            String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id             ".trim(), length));
            String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt                 ".trim(), length));
            String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id             ".trim(), length));
            String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt                 ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new PRD_FDR_LNK();
                model.setIbflag                   (ibflag             [i]);
                model.setPage_rows                (page_rows          [i]);
                model.setLnk_org_loc_cd           (lnk_org_loc_cd     [i]);
                model.setLnk_dest_loc_cd          (lnk_dest_loc_cd    [i]);
                model.setTztm_dys                 (tztm_dys           [i]);
                model.setTztm_hors                (tztm_hors          [i]);
                model.setFdr_freq_knt             (fdr_freq_knt       [i]);
                model.setVndr_seq                 (vndr_seq           [i]);
                model.setIo_bnd_cd                (io_bnd_cd          [i]);
                model.setCre_ofc_cd               (cre_ofc_cd         [i]);
                model.setLnk_rmk                  (lnk_rmk            [i]);
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
