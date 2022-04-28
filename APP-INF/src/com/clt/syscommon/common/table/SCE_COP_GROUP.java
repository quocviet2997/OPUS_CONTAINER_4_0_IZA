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
 * 4. 작성자/작성일 : 박세훈/2006.06.16<br>
 * ===================================<br>
 * 5. 수정사항<p>
 * 5.1 요구사항 ID :<p>
 * - 수정자/수정일 :<p>
 * - 수정사유/내역 :<p>
 * ===================================<br>
 * <p/>
 * @author : 박세훈
 * @version : v1.0.0
 */
public final class SCE_COP_GROUP implements java.io.Serializable {

    private String                         ibflag                         = "";
    private String                         page_rows                      = "";
    private String                         cop_group_sequence             = "";
    private String                         initial_planned_cost_amount    = "";
    private String                         estimated_cost_amount          = "";
    private String                         cop_number                     = "";
    private String                         final_planned_cost_amount      = "";
    private String                         cop_group_additional_sequence  = "";
    private String                         w_o_issue_date                 = "";
    private String                         cop_group_additional_sequence2 = "";
    private String                         s_o_number                     = "";
    private String                         s_o_status_code                = "";
    private String                         create_date                    = "";
    private String                         create_user_id                 = "";
    private String                         update_user_id                 = "";
    private String                         vendor_sequence                = "";
    private String                         update_date                    = "";
    private String                         bound_code                     = "";
    private String                         transportation_mode_code       = "";
    private String                         door_shuttle_code              = "";

    public SCE_COP_GROUP(){}

    public SCE_COP_GROUP(
            String                         ibflag                        ,
            String                         page_rows                     ,
            String                         cop_group_sequence            ,
            String                         initial_planned_cost_amount   ,
            String                         estimated_cost_amount         ,
            String                         cop_number                    ,
            String                         final_planned_cost_amount     ,
            String                         cop_group_additional_sequence ,
            String                         w_o_issue_date                ,
            String                         cop_group_additional_sequence2,
            String                         s_o_number                    ,
            String                         s_o_status_code               ,
            String                         create_date                   ,
            String                         create_user_id                ,
            String                         update_user_id                ,
            String                         vendor_sequence               ,
            String                         update_date                   ,
            String                         bound_code                    ,
            String                         transportation_mode_code      ,
            String                         door_shuttle_code             ){
        this.ibflag                         = ibflag                        ;
        this.page_rows                      = page_rows                     ;
        this.cop_group_sequence             = cop_group_sequence            ;
        this.initial_planned_cost_amount    = initial_planned_cost_amount   ;
        this.estimated_cost_amount          = estimated_cost_amount         ;
        this.cop_number                     = cop_number                    ;
        this.final_planned_cost_amount      = final_planned_cost_amount     ;
        this.cop_group_additional_sequence  = cop_group_additional_sequence ;
        this.w_o_issue_date                 = w_o_issue_date                ;
        this.cop_group_additional_sequence2 = cop_group_additional_sequence2;
        this.s_o_number                     = s_o_number                    ;
        this.s_o_status_code                = s_o_status_code               ;
        this.create_date                    = create_date                   ;
        this.create_user_id                 = create_user_id                ;
        this.update_user_id                 = update_user_id                ;
        this.vendor_sequence                = vendor_sequence               ;
        this.update_date                    = update_date                   ;
        this.bound_code                     = bound_code                    ;
        this.transportation_mode_code       = transportation_mode_code      ;
        this.door_shuttle_code              = door_shuttle_code             ;
    }

    // getter method is proceeding ..
    public String                         getIbflag                        (){    return ibflag                            ;    }
    public String                         getPage_rows                     (){    return page_rows                         ;    }
    public String                         getCop_group_sequence            (){    return cop_group_sequence                ;    }
    public String                         getInitial_planned_cost_amount   (){    return initial_planned_cost_amount       ;    }
    public String                         getEstimated_cost_amount         (){    return estimated_cost_amount             ;    }
    public String                         getCop_number                    (){    return cop_number                        ;    }
    public String                         getFinal_planned_cost_amount     (){    return final_planned_cost_amount         ;    }
    public String                         getCop_group_additional_sequence (){    return cop_group_additional_sequence     ;    }
    public String                         getW_o_issue_date                (){    return w_o_issue_date                    ;    }
    public String                         getCop_group_additional_sequence2(){    return cop_group_additional_sequence2    ;    }
    public String                         getS_o_number                    (){    return s_o_number                        ;    }
    public String                         getS_o_status_code               (){    return s_o_status_code                   ;    }
    public String                         getCreate_date                   (){    return create_date                       ;    }
    public String                         getCreate_user_id                (){    return create_user_id                    ;    }
    public String                         getUpdate_user_id                (){    return update_user_id                    ;    }
    public String                         getVendor_sequence               (){    return vendor_sequence                   ;    }
    public String                         getUpdate_date                   (){    return update_date                       ;    }
    public String                         getBound_code                    (){    return bound_code                        ;    }
    public String                         getTransportation_mode_code      (){    return transportation_mode_code          ;    }
    public String                         getDoor_shuttle_code             (){    return door_shuttle_code                 ;    }

    // setter method is proceeding ..
    public void setIbflag                        ( String                         ibflag                         ){    this.ibflag                         = ibflag                            ;    }
    public void setPage_rows                     ( String                         page_rows                      ){    this.page_rows                      = page_rows                         ;    }
    public void setCop_group_sequence            ( String                         cop_group_sequence             ){    this.cop_group_sequence             = cop_group_sequence                ;    }
    public void setInitial_planned_cost_amount   ( String                         initial_planned_cost_amount    ){    this.initial_planned_cost_amount    = initial_planned_cost_amount       ;    }
    public void setEstimated_cost_amount         ( String                         estimated_cost_amount          ){    this.estimated_cost_amount          = estimated_cost_amount             ;    }
    public void setCop_number                    ( String                         cop_number                     ){    this.cop_number                     = cop_number                        ;    }
    public void setFinal_planned_cost_amount     ( String                         final_planned_cost_amount      ){    this.final_planned_cost_amount      = final_planned_cost_amount         ;    }
    public void setCop_group_additional_sequence ( String                         cop_group_additional_sequence  ){    this.cop_group_additional_sequence  = cop_group_additional_sequence     ;    }
    public void setW_o_issue_date                ( String                         w_o_issue_date                 ){    this.w_o_issue_date                 = w_o_issue_date                    ;    }
    public void setCop_group_additional_sequence2( String                         cop_group_additional_sequence2 ){    this.cop_group_additional_sequence2 = cop_group_additional_sequence2    ;    }
    public void setS_o_number                    ( String                         s_o_number                     ){    this.s_o_number                     = s_o_number                        ;    }
    public void setS_o_status_code               ( String                         s_o_status_code                ){    this.s_o_status_code                = s_o_status_code                   ;    }
    public void setCreate_date                   ( String                         create_date                    ){    this.create_date                    = create_date                       ;    }
    public void setCreate_user_id                ( String                         create_user_id                 ){    this.create_user_id                 = create_user_id                    ;    }
    public void setUpdate_user_id                ( String                         update_user_id                 ){    this.update_user_id                 = update_user_id                    ;    }
    public void setVendor_sequence               ( String                         vendor_sequence                ){    this.vendor_sequence                = vendor_sequence                   ;    }
    public void setUpdate_date                   ( String                         update_date                    ){    this.update_date                    = update_date                       ;    }
    public void setBound_code                    ( String                         bound_code                     ){    this.bound_code                     = bound_code                        ;    }
    public void setTransportation_mode_code      ( String                         transportation_mode_code       ){    this.transportation_mode_code       = transportation_mode_code          ;    }
    public void setDoor_shuttle_code             ( String                         door_shuttle_code              ){    this.door_shuttle_code              = door_shuttle_code                 ;    }

    public static SCE_COP_GROUP fromRequest(HttpServletRequest request) {
        SCE_COP_GROUP model = new SCE_COP_GROUP();
        try {
            model.setIbflag                            (JSPUtil.getParameter(request, "ibflag                                ".trim(), ""));
            model.setPage_rows                         (JSPUtil.getParameter(request, "page_rows                             ".trim(), ""));
            model.setCop_group_sequence                (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), ""));
            model.setInitial_planned_cost_amount       (JSPUtil.getParameter(request, "initial_planned_cost_amount           ".trim(), ""));
            model.setEstimated_cost_amount             (JSPUtil.getParameter(request, "estimated_cost_amount                 ".trim(), ""));
            model.setCop_number                        (JSPUtil.getParameter(request, "cop_number                            ".trim(), ""));
            model.setFinal_planned_cost_amount         (JSPUtil.getParameter(request, "final_planned_cost_amount             ".trim(), ""));
            model.setCop_group_additional_sequence     (JSPUtil.getParameter(request, "cop_group_additional_sequence         ".trim(), ""));
            model.setW_o_issue_date                    (JSPUtil.getParameter(request, "w_o_issue_date                        ".trim(), ""));
            model.setCop_group_additional_sequence2    (JSPUtil.getParameter(request, "cop_group_additional_sequence2        ".trim(), ""));
            model.setS_o_number                        (JSPUtil.getParameter(request, "s_o_number                            ".trim(), ""));
            model.setS_o_status_code                   (JSPUtil.getParameter(request, "s_o_status_code                       ".trim(), ""));
            model.setCreate_date                       (JSPUtil.getParameter(request, "create_date                           ".trim(), ""));
            model.setCreate_user_id                    (JSPUtil.getParameter(request, "create_user_id                        ".trim(), ""));
            model.setUpdate_user_id                    (JSPUtil.getParameter(request, "update_user_id                        ".trim(), ""));
            model.setVendor_sequence                   (JSPUtil.getParameter(request, "vendor_sequence                       ".trim(), ""));
            model.setUpdate_date                       (JSPUtil.getParameter(request, "update_date                           ".trim(), ""));
            model.setBound_code                        (JSPUtil.getParameter(request, "bound_code                            ".trim(), ""));
            model.setTransportation_mode_code          (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), ""));
            model.setDoor_shuttle_code                 (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SCE_COP_GROUP model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                         =  (JSPUtil.getParameter(request, "ibflag                                ".trim(), length));
            String[] page_rows                      =  (JSPUtil.getParameter(request, "page_rows                             ".trim(), length));
            String[] cop_group_sequence             =  (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), length));
            String[] initial_planned_cost_amount    =  (JSPUtil.getParameter(request, "initial_planned_cost_amount           ".trim(), length));
            String[] estimated_cost_amount          =  (JSPUtil.getParameter(request, "estimated_cost_amount                 ".trim(), length));
            String[] cop_number                     =  (JSPUtil.getParameter(request, "cop_number                            ".trim(), length));
            String[] final_planned_cost_amount      =  (JSPUtil.getParameter(request, "final_planned_cost_amount             ".trim(), length));
            String[] cop_group_additional_sequence  =  (JSPUtil.getParameter(request, "cop_group_additional_sequence         ".trim(), length));
            String[] w_o_issue_date                 =  (JSPUtil.getParameter(request, "w_o_issue_date                        ".trim(), length));
            String[] cop_group_additional_sequence2 =  (JSPUtil.getParameter(request, "cop_group_additional_sequence2        ".trim(), length));
            String[] s_o_number                     =  (JSPUtil.getParameter(request, "s_o_number                            ".trim(), length));
            String[] s_o_status_code                =  (JSPUtil.getParameter(request, "s_o_status_code                       ".trim(), length));
            String[] create_date                    =  (JSPUtil.getParameter(request, "create_date                           ".trim(), length));
            String[] create_user_id                 =  (JSPUtil.getParameter(request, "create_user_id                        ".trim(), length));
            String[] update_user_id                 =  (JSPUtil.getParameter(request, "update_user_id                        ".trim(), length));
            String[] vendor_sequence                =  (JSPUtil.getParameter(request, "vendor_sequence                       ".trim(), length));
            String[] update_date                    =  (JSPUtil.getParameter(request, "update_date                           ".trim(), length));
            String[] bound_code                     =  (JSPUtil.getParameter(request, "bound_code                            ".trim(), length));
            String[] transportation_mode_code       =  (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), length));
            String[] door_shuttle_code              =  (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_GROUP();
                model.setIbflag                                  (ibflag                            [i]);
                model.setPage_rows                               (page_rows                         [i]);
                model.setCop_group_sequence                      (cop_group_sequence                [i]);
                model.setInitial_planned_cost_amount             (initial_planned_cost_amount       [i]);
                model.setEstimated_cost_amount                   (estimated_cost_amount             [i]);
                model.setCop_number                              (cop_number                        [i]);
                model.setFinal_planned_cost_amount               (final_planned_cost_amount         [i]);
                model.setCop_group_additional_sequence           (cop_group_additional_sequence     [i]);
                model.setW_o_issue_date                          (w_o_issue_date                    [i]);
                model.setCop_group_additional_sequence2          (cop_group_additional_sequence2    [i]);
                model.setS_o_number                              (s_o_number                        [i]);
                model.setS_o_status_code                         (s_o_status_code                   [i]);
                model.setCreate_date                             (create_date                       [i]);
                model.setCreate_user_id                          (create_user_id                    [i]);
                model.setUpdate_user_id                          (update_user_id                    [i]);
                model.setVendor_sequence                         (vendor_sequence                   [i]);
                model.setUpdate_date                             (update_date                       [i]);
                model.setBound_code                              (bound_code                        [i]);
                model.setTransportation_mode_code                (transportation_mode_code          [i]);
                model.setDoor_shuttle_code                       (door_shuttle_code                 [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        SCE_COP_GROUP model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                         =  (JSPUtil.getParameter(request, "ibflag                                ".trim(), length));
            String[] page_rows                      =  (JSPUtil.getParameter(request, "page_rows                             ".trim(), length));
            String[] cop_group_sequence             =  (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), length));
            String[] initial_planned_cost_amount    =  (JSPUtil.getParameter(request, "initial_planned_cost_amount           ".trim(), length));
            String[] estimated_cost_amount          =  (JSPUtil.getParameter(request, "estimated_cost_amount                 ".trim(), length));
            String[] cop_number                     =  (JSPUtil.getParameter(request, "cop_number                            ".trim(), length));
            String[] final_planned_cost_amount      =  (JSPUtil.getParameter(request, "final_planned_cost_amount             ".trim(), length));
            String[] cop_group_additional_sequence  =  (JSPUtil.getParameter(request, "cop_group_additional_sequence         ".trim(), length));
            String[] w_o_issue_date                 =  (JSPUtil.getParameter(request, "w_o_issue_date                        ".trim(), length));
            String[] cop_group_additional_sequence2 =  (JSPUtil.getParameter(request, "cop_group_additional_sequence2        ".trim(), length));
            String[] s_o_number                     =  (JSPUtil.getParameter(request, "s_o_number                            ".trim(), length));
            String[] s_o_status_code                =  (JSPUtil.getParameter(request, "s_o_status_code                       ".trim(), length));
            String[] create_date                    =  (JSPUtil.getParameter(request, "create_date                           ".trim(), length));
            String[] create_user_id                 =  (JSPUtil.getParameter(request, "create_user_id                        ".trim(), length));
            String[] update_user_id                 =  (JSPUtil.getParameter(request, "update_user_id                        ".trim(), length));
            String[] vendor_sequence                =  (JSPUtil.getParameter(request, "vendor_sequence                       ".trim(), length));
            String[] update_date                    =  (JSPUtil.getParameter(request, "update_date                           ".trim(), length));
            String[] bound_code                     =  (JSPUtil.getParameter(request, "bound_code                            ".trim(), length));
            String[] transportation_mode_code       =  (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), length));
            String[] door_shuttle_code              =  (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_GROUP();
                model.setIbflag                                  (ibflag                            [i]);
                model.setPage_rows                               (page_rows                         [i]);
                model.setCop_group_sequence                      (cop_group_sequence                [i]);
                model.setInitial_planned_cost_amount             (initial_planned_cost_amount       [i]);
                model.setEstimated_cost_amount                   (estimated_cost_amount             [i]);
                model.setCop_number                              (cop_number                        [i]);
                model.setFinal_planned_cost_amount               (final_planned_cost_amount         [i]);
                model.setCop_group_additional_sequence           (cop_group_additional_sequence     [i]);
                model.setW_o_issue_date                          (w_o_issue_date                    [i]);
                model.setCop_group_additional_sequence2          (cop_group_additional_sequence2    [i]);
                model.setS_o_number                              (s_o_number                        [i]);
                model.setS_o_status_code                         (s_o_status_code                   [i]);
                model.setCreate_date                             (create_date                       [i]);
                model.setCreate_user_id                          (create_user_id                    [i]);
                model.setUpdate_user_id                          (update_user_id                    [i]);
                model.setVendor_sequence                         (vendor_sequence                   [i]);
                model.setUpdate_date                             (update_date                       [i]);
                model.setBound_code                              (bound_code                        [i]);
                model.setTransportation_mode_code                (transportation_mode_code          [i]);
                model.setDoor_shuttle_code                       (door_shuttle_code                 [i]);
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
