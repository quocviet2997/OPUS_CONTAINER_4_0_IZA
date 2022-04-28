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
public final class SCE_COP_DETAIL implements java.io.Serializable {

    private String                         ibflag                         = "";
    private String                         page_rows                      = "";
    private String                         cop_detail_sequence            = "";
    private String                         cop_detail_additional_sequence = "";
    private String                         planned_date                   = "";
    private String                         estimated_date                 = "";
    private String                         actual_date                    = "";
    private String                         cop_number                     = "";
    private String                         cop_group_sequence             = "";
    private String                         exception_flag                 = "";
    private String                         activity_type_code             = "";
    private String                         activity_status_code           = "";
    private String                         update_date                    = "";
    private String                         create_user_id                 = "";
    private String                         update_user_id                 = "";
    private String                         create_date                    = "";
    private String                         vessel_code                    = "";
    private String                         voyage_number                  = "";
    private String                         direction_code                 = "";
    private String                         transportation_mode_code       = "";
    private String                         door_shuttle_code              = "";
    private String                         container_full_empty_code      = "";
    private String                         event_code                     = "";
    private String                         bound_code                     = "";

    public SCE_COP_DETAIL(){}

    public SCE_COP_DETAIL(
            String                         ibflag                        ,
            String                         page_rows                     ,
            String                         cop_detail_sequence           ,
            String                         cop_detail_additional_sequence,
            String                         planned_date                  ,
            String                         estimated_date                ,
            String                         actual_date                   ,
            String                         cop_number                    ,
            String                         cop_group_sequence            ,
            String                         exception_flag                ,
            String                         activity_type_code            ,
            String                         activity_status_code          ,
            String                         update_date                   ,
            String                         create_user_id                ,
            String                         update_user_id                ,
            String                         create_date                   ,
            String                         vessel_code                   ,
            String                         voyage_number                 ,
            String                         direction_code                ,
            String                         transportation_mode_code      ,
            String                         door_shuttle_code             ,
            String                         container_full_empty_code     ,
            String                         event_code                    ,
            String                         bound_code                    ){
        this.ibflag                         = ibflag                        ;
        this.page_rows                      = page_rows                     ;
        this.cop_detail_sequence            = cop_detail_sequence           ;
        this.cop_detail_additional_sequence = cop_detail_additional_sequence;
        this.planned_date                   = planned_date                  ;
        this.estimated_date                 = estimated_date                ;
        this.actual_date                    = actual_date                   ;
        this.cop_number                     = cop_number                    ;
        this.cop_group_sequence             = cop_group_sequence            ;
        this.exception_flag                 = exception_flag                ;
        this.activity_type_code             = activity_type_code            ;
        this.activity_status_code           = activity_status_code          ;
        this.update_date                    = update_date                   ;
        this.create_user_id                 = create_user_id                ;
        this.update_user_id                 = update_user_id                ;
        this.create_date                    = create_date                   ;
        this.vessel_code                    = vessel_code                   ;
        this.voyage_number                  = voyage_number                 ;
        this.direction_code                 = direction_code                ;
        this.transportation_mode_code       = transportation_mode_code      ;
        this.door_shuttle_code              = door_shuttle_code             ;
        this.container_full_empty_code      = container_full_empty_code     ;
        this.event_code                     = event_code                    ;
        this.bound_code                     = bound_code                    ;
    }

    // getter method is proceeding ..
    public String                         getIbflag                        (){    return ibflag                            ;    }
    public String                         getPage_rows                     (){    return page_rows                         ;    }
    public String                         getCop_detail_sequence           (){    return cop_detail_sequence               ;    }
    public String                         getCop_detail_additional_sequence(){    return cop_detail_additional_sequence    ;    }
    public String                         getPlanned_date                  (){    return planned_date                      ;    }
    public String                         getEstimated_date                (){    return estimated_date                    ;    }
    public String                         getActual_date                   (){    return actual_date                       ;    }
    public String                         getCop_number                    (){    return cop_number                        ;    }
    public String                         getCop_group_sequence            (){    return cop_group_sequence                ;    }
    public String                         getException_flag                (){    return exception_flag                    ;    }
    public String                         getActivity_type_code            (){    return activity_type_code                ;    }
    public String                         getActivity_status_code          (){    return activity_status_code              ;    }
    public String                         getUpdate_date                   (){    return update_date                       ;    }
    public String                         getCreate_user_id                (){    return create_user_id                    ;    }
    public String                         getUpdate_user_id                (){    return update_user_id                    ;    }
    public String                         getCreate_date                   (){    return create_date                       ;    }
    public String                         getVessel_code                   (){    return vessel_code                       ;    }
    public String                         getVoyage_number                 (){    return voyage_number                     ;    }
    public String                         getDirection_code                (){    return direction_code                    ;    }
    public String                         getTransportation_mode_code      (){    return transportation_mode_code          ;    }
    public String                         getDoor_shuttle_code             (){    return door_shuttle_code                 ;    }
    public String                         getContainer_full_empty_code     (){    return container_full_empty_code         ;    }
    public String                         getEvent_code                    (){    return event_code                        ;    }
    public String                         getBound_code                    (){    return bound_code                        ;    }

    // setter method is proceeding ..
    public void setIbflag                        ( String                         ibflag                         ){    this.ibflag                         = ibflag                            ;    }
    public void setPage_rows                     ( String                         page_rows                      ){    this.page_rows                      = page_rows                         ;    }
    public void setCop_detail_sequence           ( String                         cop_detail_sequence            ){    this.cop_detail_sequence            = cop_detail_sequence               ;    }
    public void setCop_detail_additional_sequence( String                         cop_detail_additional_sequence ){    this.cop_detail_additional_sequence = cop_detail_additional_sequence    ;    }
    public void setPlanned_date                  ( String                         planned_date                   ){    this.planned_date                   = planned_date                      ;    }
    public void setEstimated_date                ( String                         estimated_date                 ){    this.estimated_date                 = estimated_date                    ;    }
    public void setActual_date                   ( String                         actual_date                    ){    this.actual_date                    = actual_date                       ;    }
    public void setCop_number                    ( String                         cop_number                     ){    this.cop_number                     = cop_number                        ;    }
    public void setCop_group_sequence            ( String                         cop_group_sequence             ){    this.cop_group_sequence             = cop_group_sequence                ;    }
    public void setException_flag                ( String                         exception_flag                 ){    this.exception_flag                 = exception_flag                    ;    }
    public void setActivity_type_code            ( String                         activity_type_code             ){    this.activity_type_code             = activity_type_code                ;    }
    public void setActivity_status_code          ( String                         activity_status_code           ){    this.activity_status_code           = activity_status_code              ;    }
    public void setUpdate_date                   ( String                         update_date                    ){    this.update_date                    = update_date                       ;    }
    public void setCreate_user_id                ( String                         create_user_id                 ){    this.create_user_id                 = create_user_id                    ;    }
    public void setUpdate_user_id                ( String                         update_user_id                 ){    this.update_user_id                 = update_user_id                    ;    }
    public void setCreate_date                   ( String                         create_date                    ){    this.create_date                    = create_date                       ;    }
    public void setVessel_code                   ( String                         vessel_code                    ){    this.vessel_code                    = vessel_code                       ;    }
    public void setVoyage_number                 ( String                         voyage_number                  ){    this.voyage_number                  = voyage_number                     ;    }
    public void setDirection_code                ( String                         direction_code                 ){    this.direction_code                 = direction_code                    ;    }
    public void setTransportation_mode_code      ( String                         transportation_mode_code       ){    this.transportation_mode_code       = transportation_mode_code          ;    }
    public void setDoor_shuttle_code             ( String                         door_shuttle_code              ){    this.door_shuttle_code              = door_shuttle_code                 ;    }
    public void setContainer_full_empty_code     ( String                         container_full_empty_code      ){    this.container_full_empty_code      = container_full_empty_code         ;    }
    public void setEvent_code                    ( String                         event_code                     ){    this.event_code                     = event_code                        ;    }
    public void setBound_code                    ( String                         bound_code                     ){    this.bound_code                     = bound_code                        ;    }

    public static SCE_COP_DETAIL fromRequest(HttpServletRequest request) {
        SCE_COP_DETAIL model = new SCE_COP_DETAIL();
        try {
            model.setIbflag                            (JSPUtil.getParameter(request, "ibflag                                ".trim(), ""));
            model.setPage_rows                         (JSPUtil.getParameter(request, "page_rows                             ".trim(), ""));
            model.setCop_detail_sequence               (JSPUtil.getParameter(request, "cop_detail_sequence                   ".trim(), ""));
            model.setCop_detail_additional_sequence    (JSPUtil.getParameter(request, "cop_detail_additional_sequence        ".trim(), ""));
            model.setPlanned_date                      (JSPUtil.getParameter(request, "planned_date                          ".trim(), ""));
            model.setEstimated_date                    (JSPUtil.getParameter(request, "estimated_date                        ".trim(), ""));
            model.setActual_date                       (JSPUtil.getParameter(request, "actual_date                           ".trim(), ""));
            model.setCop_number                        (JSPUtil.getParameter(request, "cop_number                            ".trim(), ""));
            model.setCop_group_sequence                (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), ""));
            model.setException_flag                    (JSPUtil.getParameter(request, "exception_flag                        ".trim(), ""));
            model.setActivity_type_code                (JSPUtil.getParameter(request, "activity_type_code                    ".trim(), ""));
            model.setActivity_status_code              (JSPUtil.getParameter(request, "activity_status_code                  ".trim(), ""));
            model.setUpdate_date                       (JSPUtil.getParameter(request, "update_date                           ".trim(), ""));
            model.setCreate_user_id                    (JSPUtil.getParameter(request, "create_user_id                        ".trim(), ""));
            model.setUpdate_user_id                    (JSPUtil.getParameter(request, "update_user_id                        ".trim(), ""));
            model.setCreate_date                       (JSPUtil.getParameter(request, "create_date                           ".trim(), ""));
            model.setVessel_code                       (JSPUtil.getParameter(request, "vessel_code                           ".trim(), ""));
            model.setVoyage_number                     (JSPUtil.getParameter(request, "voyage_number                         ".trim(), ""));
            model.setDirection_code                    (JSPUtil.getParameter(request, "direction_code                        ".trim(), ""));
            model.setTransportation_mode_code          (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), ""));
            model.setDoor_shuttle_code                 (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), ""));
            model.setContainer_full_empty_code         (JSPUtil.getParameter(request, "container_full_empty_code             ".trim(), ""));
            model.setEvent_code                        (JSPUtil.getParameter(request, "event_code                            ".trim(), ""));
            model.setBound_code                        (JSPUtil.getParameter(request, "bound_code                            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SCE_COP_DETAIL model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                         =  (JSPUtil.getParameter(request, "ibflag                                ".trim(), length));
            String[] page_rows                      =  (JSPUtil.getParameter(request, "page_rows                             ".trim(), length));
            String[] cop_detail_sequence            =  (JSPUtil.getParameter(request, "cop_detail_sequence                   ".trim(), length));
            String[] cop_detail_additional_sequence =  (JSPUtil.getParameter(request, "cop_detail_additional_sequence        ".trim(), length));
            String[] planned_date                   =  (JSPUtil.getParameter(request, "planned_date                          ".trim(), length));
            String[] estimated_date                 =  (JSPUtil.getParameter(request, "estimated_date                        ".trim(), length));
            String[] actual_date                    =  (JSPUtil.getParameter(request, "actual_date                           ".trim(), length));
            String[] cop_number                     =  (JSPUtil.getParameter(request, "cop_number                            ".trim(), length));
            String[] cop_group_sequence             =  (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), length));
            String[] exception_flag                 =  (JSPUtil.getParameter(request, "exception_flag                        ".trim(), length));
            String[] activity_type_code             =  (JSPUtil.getParameter(request, "activity_type_code                    ".trim(), length));
            String[] activity_status_code           =  (JSPUtil.getParameter(request, "activity_status_code                  ".trim(), length));
            String[] update_date                    =  (JSPUtil.getParameter(request, "update_date                           ".trim(), length));
            String[] create_user_id                 =  (JSPUtil.getParameter(request, "create_user_id                        ".trim(), length));
            String[] update_user_id                 =  (JSPUtil.getParameter(request, "update_user_id                        ".trim(), length));
            String[] create_date                    =  (JSPUtil.getParameter(request, "create_date                           ".trim(), length));
            String[] vessel_code                    =  (JSPUtil.getParameter(request, "vessel_code                           ".trim(), length));
            String[] voyage_number                  =  (JSPUtil.getParameter(request, "voyage_number                         ".trim(), length));
            String[] direction_code                 =  (JSPUtil.getParameter(request, "direction_code                        ".trim(), length));
            String[] transportation_mode_code       =  (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), length));
            String[] door_shuttle_code              =  (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), length));
            String[] container_full_empty_code      =  (JSPUtil.getParameter(request, "container_full_empty_code             ".trim(), length));
            String[] event_code                     =  (JSPUtil.getParameter(request, "event_code                            ".trim(), length));
            String[] bound_code                     =  (JSPUtil.getParameter(request, "bound_code                            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_DETAIL();
                model.setIbflag                                  (ibflag                            [i]);
                model.setPage_rows                               (page_rows                         [i]);
                model.setCop_detail_sequence                     (cop_detail_sequence               [i]);
                model.setCop_detail_additional_sequence          (cop_detail_additional_sequence    [i]);
                model.setPlanned_date                            (planned_date                      [i]);
                model.setEstimated_date                          (estimated_date                    [i]);
                model.setActual_date                             (actual_date                       [i]);
                model.setCop_number                              (cop_number                        [i]);
                model.setCop_group_sequence                      (cop_group_sequence                [i]);
                model.setException_flag                          (exception_flag                    [i]);
                model.setActivity_type_code                      (activity_type_code                [i]);
                model.setActivity_status_code                    (activity_status_code              [i]);
                model.setUpdate_date                             (update_date                       [i]);
                model.setCreate_user_id                          (create_user_id                    [i]);
                model.setUpdate_user_id                          (update_user_id                    [i]);
                model.setCreate_date                             (create_date                       [i]);
                model.setVessel_code                             (vessel_code                       [i]);
                model.setVoyage_number                           (voyage_number                     [i]);
                model.setDirection_code                          (direction_code                    [i]);
                model.setTransportation_mode_code                (transportation_mode_code          [i]);
                model.setDoor_shuttle_code                       (door_shuttle_code                 [i]);
                model.setContainer_full_empty_code               (container_full_empty_code         [i]);
                model.setEvent_code                              (event_code                        [i]);
                model.setBound_code                              (bound_code                        [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        SCE_COP_DETAIL model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                         =  (JSPUtil.getParameter(request, "ibflag                                ".trim(), length));
            String[] page_rows                      =  (JSPUtil.getParameter(request, "page_rows                             ".trim(), length));
            String[] cop_detail_sequence            =  (JSPUtil.getParameter(request, "cop_detail_sequence                   ".trim(), length));
            String[] cop_detail_additional_sequence =  (JSPUtil.getParameter(request, "cop_detail_additional_sequence        ".trim(), length));
            String[] planned_date                   =  (JSPUtil.getParameter(request, "planned_date                          ".trim(), length));
            String[] estimated_date                 =  (JSPUtil.getParameter(request, "estimated_date                        ".trim(), length));
            String[] actual_date                    =  (JSPUtil.getParameter(request, "actual_date                           ".trim(), length));
            String[] cop_number                     =  (JSPUtil.getParameter(request, "cop_number                            ".trim(), length));
            String[] cop_group_sequence             =  (JSPUtil.getParameter(request, "cop_group_sequence                    ".trim(), length));
            String[] exception_flag                 =  (JSPUtil.getParameter(request, "exception_flag                        ".trim(), length));
            String[] activity_type_code             =  (JSPUtil.getParameter(request, "activity_type_code                    ".trim(), length));
            String[] activity_status_code           =  (JSPUtil.getParameter(request, "activity_status_code                  ".trim(), length));
            String[] update_date                    =  (JSPUtil.getParameter(request, "update_date                           ".trim(), length));
            String[] create_user_id                 =  (JSPUtil.getParameter(request, "create_user_id                        ".trim(), length));
            String[] update_user_id                 =  (JSPUtil.getParameter(request, "update_user_id                        ".trim(), length));
            String[] create_date                    =  (JSPUtil.getParameter(request, "create_date                           ".trim(), length));
            String[] vessel_code                    =  (JSPUtil.getParameter(request, "vessel_code                           ".trim(), length));
            String[] voyage_number                  =  (JSPUtil.getParameter(request, "voyage_number                         ".trim(), length));
            String[] direction_code                 =  (JSPUtil.getParameter(request, "direction_code                        ".trim(), length));
            String[] transportation_mode_code       =  (JSPUtil.getParameter(request, "transportation_mode_code              ".trim(), length));
            String[] door_shuttle_code              =  (JSPUtil.getParameter(request, "door_shuttle_code                     ".trim(), length));
            String[] container_full_empty_code      =  (JSPUtil.getParameter(request, "container_full_empty_code             ".trim(), length));
            String[] event_code                     =  (JSPUtil.getParameter(request, "event_code                            ".trim(), length));
            String[] bound_code                     =  (JSPUtil.getParameter(request, "bound_code                            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_DETAIL();
                model.setIbflag                                  (ibflag                            [i]);
                model.setPage_rows                               (page_rows                         [i]);
                model.setCop_detail_sequence                     (cop_detail_sequence               [i]);
                model.setCop_detail_additional_sequence          (cop_detail_additional_sequence    [i]);
                model.setPlanned_date                            (planned_date                      [i]);
                model.setEstimated_date                          (estimated_date                    [i]);
                model.setActual_date                             (actual_date                       [i]);
                model.setCop_number                              (cop_number                        [i]);
                model.setCop_group_sequence                      (cop_group_sequence                [i]);
                model.setException_flag                          (exception_flag                    [i]);
                model.setActivity_type_code                      (activity_type_code                [i]);
                model.setActivity_status_code                    (activity_status_code              [i]);
                model.setUpdate_date                             (update_date                       [i]);
                model.setCreate_user_id                          (create_user_id                    [i]);
                model.setUpdate_user_id                          (update_user_id                    [i]);
                model.setCreate_date                             (create_date                       [i]);
                model.setVessel_code                             (vessel_code                       [i]);
                model.setVoyage_number                           (voyage_number                     [i]);
                model.setDirection_code                          (direction_code                    [i]);
                model.setTransportation_mode_code                (transportation_mode_code          [i]);
                model.setDoor_shuttle_code                       (door_shuttle_code                 [i]);
                model.setContainer_full_empty_code               (container_full_empty_code         [i]);
                model.setEvent_code                              (event_code                        [i]);
                model.setBound_code                              (bound_code                        [i]);
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
