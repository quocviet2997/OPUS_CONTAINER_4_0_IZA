/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CUSTOMER_ADDRESS.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
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
 */public final class CUSTOMER_ADDRESS implements java.io.Serializable {

    private String            ibflag            = "";
    private String            page_rows         = "";
    private String            cnt_cd            = "";
    private String            cust_cd           = "";
    private String            addr_tp_cd        = "";
    private String            addr_seq          = "";
    private String            pri_chk_flag      = "";
    private String            biz_entity_cnt_cd = "";
    private String            biz_entity_seq    = "";
    private String            biz_entity_nm     = "";
    private String            biz_entity_addr   = "";
    private String            city_nm           = "";
    private String            state_cd          = "";
    private String            zip_cd            = "";
    private String            contact_email     = "";
    private String            contact_person    = "";
    private String            biz_entity_remark = "";
    private String            inter_phone_no    = "";
    private String            city_phone_no     = "";
    private String            phone_no          = "";
    private String            full_phone_no     = "";
    private String            inter_fax_no      = "";
    private String            city_fax_no       = "";
    private String            fax_no            = "";
    private String            full_fax_no       = "";
    private String            crt_user_id       = "";
    private String            crt_dt            = "";
    private String            upd_user_id       = "";
    private String            upd_dt            = "";
    private String            del_user_id       = "";
    private String            del_dt            = "";
    private String            last_event_dt     = "";
    private String            city_addr         = "";
    private String            telexo            = "";
    private String            loc_cd            = "";
    private String            eng_addr1         = "";
    private String            eng_addr2         = "";
    private String            loc_addr1         = "";
    private String            loc_addr2         = "";

    public CUSTOMER_ADDRESS(){}

    public CUSTOMER_ADDRESS(
            String            ibflag           ,
            String            page_rows        ,
            String            cnt_cd           ,
            String            cust_cd          ,
            String            addr_tp_cd       ,
            String            addr_seq         ,
            String            pri_chk_flag     ,
            String            biz_entity_cnt_cd,
            String            biz_entity_seq   ,
            String            biz_entity_nm    ,
            String            biz_entity_addr  ,
            String            city_nm          ,
            String            state_cd         ,
            String            zip_cd           ,
            String            contact_email    ,
            String            contact_person   ,
            String            biz_entity_remark,
            String            inter_phone_no   ,
            String            city_phone_no    ,
            String            phone_no         ,
            String            full_phone_no    ,
            String            inter_fax_no     ,
            String            city_fax_no      ,
            String            fax_no           ,
            String            full_fax_no      ,
            String            crt_user_id      ,
            String            crt_dt           ,
            String            upd_user_id      ,
            String            upd_dt           ,
            String            del_user_id      ,
            String            del_dt           ,
            String            last_event_dt    ,
            String            city_addr        ,
            String            telexo           ,
            String            loc_cd           ,
            String            eng_addr1        ,
            String            eng_addr2        ,
            String            loc_addr1        ,
            String            loc_addr2        ){
        this.ibflag            = ibflag           ;
        this.page_rows         = page_rows        ;
        this.cnt_cd            = cnt_cd           ;
        this.cust_cd           = cust_cd          ;
        this.addr_tp_cd        = addr_tp_cd       ;
        this.addr_seq          = addr_seq         ;
        this.pri_chk_flag      = pri_chk_flag     ;
        this.biz_entity_cnt_cd = biz_entity_cnt_cd;
        this.biz_entity_seq    = biz_entity_seq   ;
        this.biz_entity_nm     = biz_entity_nm    ;
        this.biz_entity_addr   = biz_entity_addr  ;
        this.city_nm           = city_nm          ;
        this.state_cd          = state_cd         ;
        this.zip_cd            = zip_cd           ;
        this.contact_email     = contact_email    ;
        this.contact_person    = contact_person   ;
        this.biz_entity_remark = biz_entity_remark;
        this.inter_phone_no    = inter_phone_no   ;
        this.city_phone_no     = city_phone_no    ;
        this.phone_no          = phone_no         ;
        this.full_phone_no     = full_phone_no    ;
        this.inter_fax_no      = inter_fax_no     ;
        this.city_fax_no       = city_fax_no      ;
        this.fax_no            = fax_no           ;
        this.full_fax_no       = full_fax_no      ;
        this.crt_user_id       = crt_user_id      ;
        this.crt_dt            = crt_dt           ;
        this.upd_user_id       = upd_user_id      ;
        this.upd_dt            = upd_dt           ;
        this.del_user_id       = del_user_id      ;
        this.del_dt            = del_dt           ;
        this.last_event_dt     = last_event_dt    ;
        this.city_addr         = city_addr        ;
        this.telexo            = telexo           ;
        this.loc_cd            = loc_cd           ;
        this.eng_addr1         = eng_addr1        ;
        this.eng_addr2         = eng_addr2        ;
        this.loc_addr1         = loc_addr1        ;
        this.loc_addr2         = loc_addr2        ;
    }

    // getter method is proceeding ..
    public String            getIbflag           (){    return ibflag               ;    }
    public String            getPage_rows        (){    return page_rows            ;    }
    public String            getCnt_cd           (){    return cnt_cd               ;    }
    public String            getCust_cd          (){    return cust_cd              ;    }
    public String            getAddr_tp_cd       (){    return addr_tp_cd           ;    }
    public String            getAddr_seq         (){    return addr_seq             ;    }
    public String            getPri_chk_flag     (){    return pri_chk_flag         ;    }
    public String            getBiz_entity_cnt_cd(){    return biz_entity_cnt_cd    ;    }
    public String            getBiz_entity_seq   (){    return biz_entity_seq       ;    }
    public String            getBiz_entity_nm    (){    return biz_entity_nm        ;    }
    public String            getBiz_entity_addr  (){    return biz_entity_addr      ;    }
    public String            getCity_nm          (){    return city_nm              ;    }
    public String            getState_cd         (){    return state_cd             ;    }
    public String            getZip_cd           (){    return zip_cd               ;    }
    public String            getContact_email    (){    return contact_email        ;    }
    public String            getContact_person   (){    return contact_person       ;    }
    public String            getBiz_entity_remark(){    return biz_entity_remark    ;    }
    public String            getInter_phone_no   (){    return inter_phone_no       ;    }
    public String            getCity_phone_no    (){    return city_phone_no        ;    }
    public String            getPhone_no         (){    return phone_no             ;    }
    public String            getFull_phone_no    (){    return full_phone_no        ;    }
    public String            getInter_fax_no     (){    return inter_fax_no         ;    }
    public String            getCity_fax_no      (){    return city_fax_no          ;    }
    public String            getFax_no           (){    return fax_no               ;    }
    public String            getFull_fax_no      (){    return full_fax_no          ;    }
    public String            getCrt_user_id      (){    return crt_user_id          ;    }
    public String            getCrt_dt           (){    return crt_dt               ;    }
    public String            getUpd_user_id      (){    return upd_user_id          ;    }
    public String            getUpd_dt           (){    return upd_dt               ;    }
    public String            getDel_user_id      (){    return del_user_id          ;    }
    public String            getDel_dt           (){    return del_dt               ;    }
    public String            getLast_event_dt    (){    return last_event_dt        ;    }
    public String            getCity_addr        (){    return city_addr            ;    }
    public String            getTelexo           (){    return telexo               ;    }
    public String            getLoc_cd           (){    return loc_cd               ;    }
    public String            getEng_addr1        (){    return eng_addr1            ;    }
    public String            getEng_addr2        (){    return eng_addr2            ;    }
    public String            getLoc_addr1        (){    return loc_addr1            ;    }
    public String            getLoc_addr2        (){    return loc_addr2            ;    }

    // setter method is proceeding ..
    public void setIbflag           ( String            ibflag            ){    this.ibflag            = ibflag               ;    }
    public void setPage_rows        ( String            page_rows         ){    this.page_rows         = page_rows            ;    }
    public void setCnt_cd           ( String            cnt_cd            ){    this.cnt_cd            = cnt_cd               ;    }
    public void setCust_cd          ( String            cust_cd           ){    this.cust_cd           = cust_cd              ;    }
    public void setAddr_tp_cd       ( String            addr_tp_cd        ){    this.addr_tp_cd        = addr_tp_cd           ;    }
    public void setAddr_seq         ( String            addr_seq          ){    this.addr_seq          = addr_seq             ;    }
    public void setPri_chk_flag     ( String            pri_chk_flag      ){    this.pri_chk_flag      = pri_chk_flag         ;    }
    public void setBiz_entity_cnt_cd( String            biz_entity_cnt_cd ){    this.biz_entity_cnt_cd = biz_entity_cnt_cd    ;    }
    public void setBiz_entity_seq   ( String            biz_entity_seq    ){    this.biz_entity_seq    = biz_entity_seq       ;    }
    public void setBiz_entity_nm    ( String            biz_entity_nm     ){    this.biz_entity_nm     = biz_entity_nm        ;    }
    public void setBiz_entity_addr  ( String            biz_entity_addr   ){    this.biz_entity_addr   = biz_entity_addr      ;    }
    public void setCity_nm          ( String            city_nm           ){    this.city_nm           = city_nm              ;    }
    public void setState_cd         ( String            state_cd          ){    this.state_cd          = state_cd             ;    }
    public void setZip_cd           ( String            zip_cd            ){    this.zip_cd            = zip_cd               ;    }
    public void setContact_email    ( String            contact_email     ){    this.contact_email     = contact_email        ;    }
    public void setContact_person   ( String            contact_person    ){    this.contact_person    = contact_person       ;    }
    public void setBiz_entity_remark( String            biz_entity_remark ){    this.biz_entity_remark = biz_entity_remark    ;    }
    public void setInter_phone_no   ( String            inter_phone_no    ){    this.inter_phone_no    = inter_phone_no       ;    }
    public void setCity_phone_no    ( String            city_phone_no     ){    this.city_phone_no     = city_phone_no        ;    }
    public void setPhone_no         ( String            phone_no          ){    this.phone_no          = phone_no             ;    }
    public void setFull_phone_no    ( String            full_phone_no     ){    this.full_phone_no     = full_phone_no        ;    }
    public void setInter_fax_no     ( String            inter_fax_no      ){    this.inter_fax_no      = inter_fax_no         ;    }
    public void setCity_fax_no      ( String            city_fax_no       ){    this.city_fax_no       = city_fax_no          ;    }
    public void setFax_no           ( String            fax_no            ){    this.fax_no            = fax_no               ;    }
    public void setFull_fax_no      ( String            full_fax_no       ){    this.full_fax_no       = full_fax_no          ;    }
    public void setCrt_user_id      ( String            crt_user_id       ){    this.crt_user_id       = crt_user_id          ;    }
    public void setCrt_dt           ( String            crt_dt            ){    this.crt_dt            = crt_dt               ;    }
    public void setUpd_user_id      ( String            upd_user_id       ){    this.upd_user_id       = upd_user_id          ;    }
    public void setUpd_dt           ( String            upd_dt            ){    this.upd_dt            = upd_dt               ;    }
    public void setDel_user_id      ( String            del_user_id       ){    this.del_user_id       = del_user_id          ;    }
    public void setDel_dt           ( String            del_dt            ){    this.del_dt            = del_dt               ;    }
    public void setLast_event_dt    ( String            last_event_dt     ){    this.last_event_dt     = last_event_dt        ;    }
    public void setCity_addr        ( String            city_addr         ){    this.city_addr         = city_addr            ;    }
    public void setTelexo           ( String            telexo            ){    this.telexo            = telexo               ;    }
    public void setLoc_cd           ( String            loc_cd            ){    this.loc_cd            = loc_cd               ;    }
    public void setEng_addr1        ( String            eng_addr1         ){    this.eng_addr1         = eng_addr1            ;    }
    public void setEng_addr2        ( String            eng_addr2         ){    this.eng_addr2         = eng_addr2            ;    }
    public void setLoc_addr1        ( String            loc_addr1         ){    this.loc_addr1         = loc_addr1            ;    }
    public void setLoc_addr2        ( String            loc_addr2         ){    this.loc_addr2         = loc_addr2            ;    }

    public static CUSTOMER_ADDRESS fromRequest(HttpServletRequest request) {
        CUSTOMER_ADDRESS model = new CUSTOMER_ADDRESS();
        try {
            model.setIbflag               (JSPUtil.getParameter(request, "ibflag                   ".trim(), ""));
            model.setPage_rows            (JSPUtil.getParameter(request, "page_rows                ".trim(), ""));
            model.setCnt_cd               (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), ""));
            model.setCust_cd              (JSPUtil.getParameter(request, "cust_cd                  ".trim(), ""));
            model.setAddr_tp_cd           (JSPUtil.getParameter(request, "addr_tp_cd               ".trim(), ""));
            model.setAddr_seq             (JSPUtil.getParameter(request, "addr_seq                 ".trim(), ""));
            model.setPri_chk_flag         (JSPUtil.getParameter(request, "pri_chk_flag             ".trim(), ""));
            model.setBiz_entity_cnt_cd    (JSPUtil.getParameter(request, "biz_entity_cnt_cd        ".trim(), ""));
            model.setBiz_entity_seq       (JSPUtil.getParameter(request, "biz_entity_seq           ".trim(), ""));
            model.setBiz_entity_nm        (JSPUtil.getParameter(request, "biz_entity_nm            ".trim(), ""));
            model.setBiz_entity_addr      (JSPUtil.getParameter(request, "biz_entity_addr          ".trim(), ""));
            model.setCity_nm              (JSPUtil.getParameter(request, "city_nm                  ".trim(), ""));
            model.setState_cd             (JSPUtil.getParameter(request, "state_cd                 ".trim(), ""));
            model.setZip_cd               (JSPUtil.getParameter(request, "zip_cd                   ".trim(), ""));
            model.setContact_email        (JSPUtil.getParameter(request, "contact_email            ".trim(), ""));
            model.setContact_person       (JSPUtil.getParameter(request, "contact_person           ".trim(), ""));
            model.setBiz_entity_remark    (JSPUtil.getParameter(request, "biz_entity_remark        ".trim(), ""));
            model.setInter_phone_no       (JSPUtil.getParameter(request, "inter_phone_no           ".trim(), ""));
            model.setCity_phone_no        (JSPUtil.getParameter(request, "city_phone_no            ".trim(), ""));
            model.setPhone_no             (JSPUtil.getParameter(request, "phone_no                 ".trim(), ""));
            model.setFull_phone_no        (JSPUtil.getParameter(request, "full_phone_no            ".trim(), ""));
            model.setInter_fax_no         (JSPUtil.getParameter(request, "inter_fax_no             ".trim(), ""));
            model.setCity_fax_no          (JSPUtil.getParameter(request, "city_fax_no              ".trim(), ""));
            model.setFax_no               (JSPUtil.getParameter(request, "fax_no                   ".trim(), ""));
            model.setFull_fax_no          (JSPUtil.getParameter(request, "full_fax_no              ".trim(), ""));
            model.setCrt_user_id          (JSPUtil.getParameter(request, "crt_user_id              ".trim(), ""));
            model.setCrt_dt               (JSPUtil.getParameter(request, "crt_dt                   ".trim(), ""));
            model.setUpd_user_id          (JSPUtil.getParameter(request, "upd_user_id              ".trim(), ""));
            model.setUpd_dt               (JSPUtil.getParameter(request, "upd_dt                   ".trim(), ""));
            model.setDel_user_id          (JSPUtil.getParameter(request, "del_user_id              ".trim(), ""));
            model.setDel_dt               (JSPUtil.getParameter(request, "del_dt                   ".trim(), ""));
            model.setLast_event_dt        (JSPUtil.getParameter(request, "last_event_dt            ".trim(), ""));
            model.setCity_addr            (JSPUtil.getParameter(request, "city_addr                ".trim(), ""));
            model.setTelexo               (JSPUtil.getParameter(request, "telexo                   ".trim(), ""));
            model.setLoc_cd               (JSPUtil.getParameter(request, "loc_cd                   ".trim(), ""));
            model.setEng_addr1            (JSPUtil.getParameter(request, "eng_addr1                ".trim(), ""));
            model.setEng_addr2            (JSPUtil.getParameter(request, "eng_addr2                ".trim(), ""));
            model.setLoc_addr1            (JSPUtil.getParameter(request, "loc_addr1                ".trim(), ""));
            model.setLoc_addr2            (JSPUtil.getParameter(request, "loc_addr2                ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        CUSTOMER_ADDRESS model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, "cnt_cd                   ".trim(), length));
            String[] cust_cd           =  (JSPUtil.getParameter(request, "cust_cd                  ".trim(), length));
            String[] addr_tp_cd        =  (JSPUtil.getParameter(request, "addr_tp_cd               ".trim(), length));
            String[] addr_seq          =  (JSPUtil.getParameter(request, "addr_seq                 ".trim(), length));
            String[] pri_chk_flag      =  (JSPUtil.getParameter(request, "pri_chk_flag             ".trim(), length));
            String[] biz_entity_cnt_cd =  (JSPUtil.getParameter(request, "biz_entity_cnt_cd        ".trim(), length));
            String[] biz_entity_seq    =  (JSPUtil.getParameter(request, "biz_entity_seq           ".trim(), length));
            String[] biz_entity_nm     =  (JSPUtil.getParameter(request, "biz_entity_nm            ".trim(), length));
            String[] biz_entity_addr   =  (JSPUtil.getParameter(request, "biz_entity_addr          ".trim(), length));
            String[] city_nm           =  (JSPUtil.getParameter(request, "city_nm                  ".trim(), length));
            String[] state_cd          =  (JSPUtil.getParameter(request, "state_cd                 ".trim(), length));
            String[] zip_cd            =  (JSPUtil.getParameter(request, "zip_cd                   ".trim(), length));
            String[] contact_email     =  (JSPUtil.getParameter(request, "contact_email            ".trim(), length));
            String[] contact_person    =  (JSPUtil.getParameter(request, "contact_person           ".trim(), length));
            String[] biz_entity_remark =  (JSPUtil.getParameter(request, "biz_entity_remark        ".trim(), length));
            String[] inter_phone_no    =  (JSPUtil.getParameter(request, "inter_phone_no           ".trim(), length));
            String[] city_phone_no     =  (JSPUtil.getParameter(request, "city_phone_no            ".trim(), length));
            String[] phone_no          =  (JSPUtil.getParameter(request, "phone_no                 ".trim(), length));
            String[] full_phone_no     =  (JSPUtil.getParameter(request, "full_phone_no            ".trim(), length));
            String[] inter_fax_no      =  (JSPUtil.getParameter(request, "inter_fax_no             ".trim(), length));
            String[] city_fax_no       =  (JSPUtil.getParameter(request, "city_fax_no              ".trim(), length));
            String[] fax_no            =  (JSPUtil.getParameter(request, "fax_no                   ".trim(), length));
            String[] full_fax_no       =  (JSPUtil.getParameter(request, "full_fax_no              ".trim(), length));
            String[] crt_user_id       =  (JSPUtil.getParameter(request, "crt_user_id              ".trim(), length));
            String[] crt_dt            =  (JSPUtil.getParameter(request, "crt_dt                   ".trim(), length));
            String[] upd_user_id       =  (JSPUtil.getParameter(request, "upd_user_id              ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt                   ".trim(), length));
            String[] del_user_id       =  (JSPUtil.getParameter(request, "del_user_id              ".trim(), length));
            String[] del_dt            =  (JSPUtil.getParameter(request, "del_dt                   ".trim(), length));
            String[] last_event_dt     =  (JSPUtil.getParameter(request, "last_event_dt            ".trim(), length));
            String[] city_addr         =  (JSPUtil.getParameter(request, "city_addr                ".trim(), length));
            String[] telexo            =  (JSPUtil.getParameter(request, "telexo                   ".trim(), length));
            String[] loc_cd            =  (JSPUtil.getParameter(request, "loc_cd                   ".trim(), length));
            String[] eng_addr1         =  (JSPUtil.getParameter(request, "eng_addr1                ".trim(), length));
            String[] eng_addr2         =  (JSPUtil.getParameter(request, "eng_addr2                ".trim(), length));
            String[] loc_addr1         =  (JSPUtil.getParameter(request, "loc_addr1                ".trim(), length));
            String[] loc_addr2         =  (JSPUtil.getParameter(request, "loc_addr2                ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CUSTOMER_ADDRESS();
                model.setIbflag                     (ibflag               [i]);
                model.setPage_rows                  (page_rows            [i]);
                model.setCnt_cd                     (cnt_cd               [i]);
                model.setCust_cd                    (cust_cd              [i]);
                model.setAddr_tp_cd                 (addr_tp_cd           [i]);
                model.setAddr_seq                   (addr_seq             [i]);
                model.setPri_chk_flag               (pri_chk_flag         [i]);
                model.setBiz_entity_cnt_cd          (biz_entity_cnt_cd    [i]);
                model.setBiz_entity_seq             (biz_entity_seq       [i]);
                model.setBiz_entity_nm              (biz_entity_nm        [i]);
                model.setBiz_entity_addr            (biz_entity_addr      [i]);
                model.setCity_nm                    (city_nm              [i]);
                model.setState_cd                   (state_cd             [i]);
                model.setZip_cd                     (zip_cd               [i]);
                model.setContact_email              (contact_email        [i]);
                model.setContact_person             (contact_person       [i]);
                model.setBiz_entity_remark          (biz_entity_remark    [i]);
                model.setInter_phone_no             (inter_phone_no       [i]);
                model.setCity_phone_no              (city_phone_no        [i]);
                model.setPhone_no                   (phone_no             [i]);
                model.setFull_phone_no              (full_phone_no        [i]);
                model.setInter_fax_no               (inter_fax_no         [i]);
                model.setCity_fax_no                (city_fax_no          [i]);
                model.setFax_no                     (fax_no               [i]);
                model.setFull_fax_no                (full_fax_no          [i]);
                model.setCrt_user_id                (crt_user_id          [i]);
                model.setCrt_dt                     (crt_dt               [i]);
                model.setUpd_user_id                (upd_user_id          [i]);
                model.setUpd_dt                     (upd_dt               [i]);
                model.setDel_user_id                (del_user_id          [i]);
                model.setDel_dt                     (del_dt               [i]);
                model.setLast_event_dt              (last_event_dt        [i]);
                model.setCity_addr                  (city_addr            [i]);
                model.setTelexo                     (telexo               [i]);
                model.setLoc_cd                     (loc_cd               [i]);
                model.setEng_addr1                  (eng_addr1            [i]);
                model.setEng_addr2                  (eng_addr2            [i]);
                model.setLoc_addr1                  (loc_addr1            [i]);
                model.setLoc_addr2                  (loc_addr2            [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
        CUSTOMER_ADDRESS model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag                   ".trim(), length));
            String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows                ".trim(), length));
            String[] cnt_cd            =  (JSPUtil.getParameter(request, prefix + "cnt_cd                   ".trim(), length));
            String[] cust_cd           =  (JSPUtil.getParameter(request, prefix + "cust_cd                  ".trim(), length));
            String[] addr_tp_cd        =  (JSPUtil.getParameter(request, prefix + "addr_tp_cd               ".trim(), length));
            String[] addr_seq          =  (JSPUtil.getParameter(request, prefix + "addr_seq                 ".trim(), length));
            String[] pri_chk_flag      =  (JSPUtil.getParameter(request, prefix + "pri_chk_flag             ".trim(), length));
            String[] biz_entity_cnt_cd =  (JSPUtil.getParameter(request, prefix + "biz_entity_cnt_cd        ".trim(), length));
            String[] biz_entity_seq    =  (JSPUtil.getParameter(request, prefix + "biz_entity_seq           ".trim(), length));
            String[] biz_entity_nm     =  (JSPUtil.getParameter(request, prefix + "biz_entity_nm            ".trim(), length));
            String[] biz_entity_addr   =  (JSPUtil.getParameter(request, prefix + "biz_entity_addr          ".trim(), length));
            String[] city_nm           =  (JSPUtil.getParameter(request, prefix + "city_nm                  ".trim(), length));
            String[] state_cd          =  (JSPUtil.getParameter(request, prefix + "state_cd                 ".trim(), length));
            String[] zip_cd            =  (JSPUtil.getParameter(request, prefix + "zip_cd                   ".trim(), length));
            String[] contact_email     =  (JSPUtil.getParameter(request, prefix + "contact_email            ".trim(), length));
            String[] contact_person    =  (JSPUtil.getParameter(request, prefix + "contact_person           ".trim(), length));
            String[] biz_entity_remark =  (JSPUtil.getParameter(request, prefix + "biz_entity_remark        ".trim(), length));
            String[] inter_phone_no    =  (JSPUtil.getParameter(request, prefix + "inter_phone_no           ".trim(), length));
            String[] city_phone_no     =  (JSPUtil.getParameter(request, prefix + "city_phone_no            ".trim(), length));
            String[] phone_no          =  (JSPUtil.getParameter(request, prefix + "phone_no                 ".trim(), length));
            String[] full_phone_no     =  (JSPUtil.getParameter(request, prefix + "full_phone_no            ".trim(), length));
            String[] inter_fax_no      =  (JSPUtil.getParameter(request, prefix + "inter_fax_no             ".trim(), length));
            String[] city_fax_no       =  (JSPUtil.getParameter(request, prefix + "city_fax_no              ".trim(), length));
            String[] fax_no            =  (JSPUtil.getParameter(request, prefix + "fax_no                   ".trim(), length));
            String[] full_fax_no       =  (JSPUtil.getParameter(request, prefix + "full_fax_no              ".trim(), length));
            String[] crt_user_id       =  (JSPUtil.getParameter(request, prefix + "crt_user_id              ".trim(), length));
            String[] crt_dt            =  (JSPUtil.getParameter(request, prefix + "crt_dt                   ".trim(), length));
            String[] upd_user_id       =  (JSPUtil.getParameter(request, prefix + "upd_user_id              ".trim(), length));
            String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt                   ".trim(), length));
            String[] del_user_id       =  (JSPUtil.getParameter(request, prefix + "del_user_id              ".trim(), length));
            String[] del_dt            =  (JSPUtil.getParameter(request, prefix + "del_dt                   ".trim(), length));
            String[] last_event_dt     =  (JSPUtil.getParameter(request, prefix + "last_event_dt            ".trim(), length));
            String[] city_addr         =  (JSPUtil.getParameter(request, prefix + "city_addr                ".trim(), length));
            String[] telexo            =  (JSPUtil.getParameter(request, prefix + "telexo                   ".trim(), length));
            String[] loc_cd            =  (JSPUtil.getParameter(request, prefix + "loc_cd                   ".trim(), length));
            String[] eng_addr1         =  (JSPUtil.getParameter(request, prefix + "eng_addr1                ".trim(), length));
            String[] eng_addr2         =  (JSPUtil.getParameter(request, prefix + "eng_addr2                ".trim(), length));
            String[] loc_addr1         =  (JSPUtil.getParameter(request, prefix + "loc_addr1                ".trim(), length));
            String[] loc_addr2         =  (JSPUtil.getParameter(request, prefix + "loc_addr2                ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CUSTOMER_ADDRESS();
                model.setIbflag                     ( ibflag               [i]);
                model.setPage_rows                  ( page_rows            [i]);
                model.setCnt_cd                     ( cnt_cd               [i]);
                model.setCust_cd                    ( cust_cd              [i]);
                model.setAddr_tp_cd                 ( addr_tp_cd           [i]);
                model.setAddr_seq                   ( addr_seq             [i]);
                model.setPri_chk_flag               ( pri_chk_flag         [i]);
                model.setBiz_entity_cnt_cd          ( biz_entity_cnt_cd    [i]);
                model.setBiz_entity_seq             ( biz_entity_seq       [i]);
                model.setBiz_entity_nm              ( biz_entity_nm        [i]);
                model.setBiz_entity_addr            ( biz_entity_addr      [i]);
                model.setCity_nm                    ( city_nm              [i]);
                model.setState_cd                   ( state_cd             [i]);
                model.setZip_cd                     ( zip_cd               [i]);
                model.setContact_email              ( contact_email        [i]);
                model.setContact_person             ( contact_person       [i]);
                model.setBiz_entity_remark          ( biz_entity_remark    [i]);
                model.setInter_phone_no             ( inter_phone_no       [i]);
                model.setCity_phone_no              ( city_phone_no        [i]);
                model.setPhone_no                   ( phone_no             [i]);
                model.setFull_phone_no              ( full_phone_no        [i]);
                model.setInter_fax_no               ( inter_fax_no         [i]);
                model.setCity_fax_no                ( city_fax_no          [i]);
                model.setFax_no                     ( fax_no               [i]);
                model.setFull_fax_no                ( full_fax_no          [i]);
                model.setCrt_user_id                ( crt_user_id          [i]);
                model.setCrt_dt                     ( crt_dt               [i]);
                model.setUpd_user_id                ( upd_user_id          [i]);
                model.setUpd_dt                     ( upd_dt               [i]);
                model.setDel_user_id                ( del_user_id          [i]);
                model.setDel_dt                     ( del_dt               [i]);
                model.setLast_event_dt              ( last_event_dt        [i]);
                model.setCity_addr                  ( city_addr            [i]);
                model.setTelexo                     ( telexo               [i]);
                model.setLoc_cd                     ( loc_cd               [i]);
                model.setEng_addr1                  ( eng_addr1            [i]);
                model.setEng_addr2                  ( eng_addr2            [i]);
                model.setLoc_addr1                  ( loc_addr1            [i]);
                model.setLoc_addr2                  ( loc_addr2            [i]);
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
