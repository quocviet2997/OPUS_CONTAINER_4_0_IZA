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
public final class SCE_COP_HEADER implements java.io.Serializable {

    private String               ibflag               = "";
    private String               page_rows            = "";
    private String               cop_number           = "";
    private String               create_user_id       = "";
    private String               booking_number       = "";
    private String               create_date          = "";
    private String               booking_split_number = "";
    private String               container_year       = "";
    private String               container_sequence   = "";
    private String               b_l_number           = "";
    private String               update_user_id       = "";
    private String               container_number     = "";
    private String               update_date          = "";
    private String               cop_status_code      = "";

    public SCE_COP_HEADER(){}

    public SCE_COP_HEADER(
            String               ibflag              ,
            String               page_rows           ,
            String               cop_number          ,
            String               create_user_id      ,
            String               booking_number      ,
            String               create_date         ,
            String               booking_split_number,
            String               container_year      ,
            String               container_sequence  ,
            String               b_l_number          ,
            String               update_user_id      ,
            String               container_number    ,
            String               update_date         ,
            String               cop_status_code     ){
        this.ibflag               = ibflag              ;
        this.page_rows            = page_rows           ;
        this.cop_number           = cop_number          ;
        this.create_user_id       = create_user_id      ;
        this.booking_number       = booking_number      ;
        this.create_date          = create_date         ;
        this.booking_split_number = booking_split_number;
        this.container_year       = container_year      ;
        this.container_sequence   = container_sequence  ;
        this.b_l_number           = b_l_number          ;
        this.update_user_id       = update_user_id      ;
        this.container_number     = container_number    ;
        this.update_date          = update_date         ;
        this.cop_status_code      = cop_status_code     ;
    }

    // getter method is proceeding ..
    public String               getIbflag              (){    return ibflag                  ;    }
    public String               getPage_rows           (){    return page_rows               ;    }
    public String               getCop_number          (){    return cop_number              ;    }
    public String               getCreate_user_id      (){    return create_user_id          ;    }
    public String               getBooking_number      (){    return booking_number          ;    }
    public String               getCreate_date         (){    return create_date             ;    }
    public String               getBooking_split_number(){    return booking_split_number    ;    }
    public String               getContainer_year      (){    return container_year          ;    }
    public String               getContainer_sequence  (){    return container_sequence      ;    }
    public String               getB_l_number          (){    return b_l_number              ;    }
    public String               getUpdate_user_id      (){    return update_user_id          ;    }
    public String               getContainer_number    (){    return container_number        ;    }
    public String               getUpdate_date         (){    return update_date             ;    }
    public String               getCop_status_code     (){    return cop_status_code         ;    }

    // setter method is proceeding ..
    public void setIbflag              ( String               ibflag               ){    this.ibflag               = ibflag                  ;    }
    public void setPage_rows           ( String               page_rows            ){    this.page_rows            = page_rows               ;    }
    public void setCop_number          ( String               cop_number           ){    this.cop_number           = cop_number              ;    }
    public void setCreate_user_id      ( String               create_user_id       ){    this.create_user_id       = create_user_id          ;    }
    public void setBooking_number      ( String               booking_number       ){    this.booking_number       = booking_number          ;    }
    public void setCreate_date         ( String               create_date          ){    this.create_date          = create_date             ;    }
    public void setBooking_split_number( String               booking_split_number ){    this.booking_split_number = booking_split_number    ;    }
    public void setContainer_year      ( String               container_year       ){    this.container_year       = container_year          ;    }
    public void setContainer_sequence  ( String               container_sequence   ){    this.container_sequence   = container_sequence      ;    }
    public void setB_l_number          ( String               b_l_number           ){    this.b_l_number           = b_l_number              ;    }
    public void setUpdate_user_id      ( String               update_user_id       ){    this.update_user_id       = update_user_id          ;    }
    public void setContainer_number    ( String               container_number     ){    this.container_number     = container_number        ;    }
    public void setUpdate_date         ( String               update_date          ){    this.update_date          = update_date             ;    }
    public void setCop_status_code     ( String               cop_status_code      ){    this.cop_status_code      = cop_status_code         ;    }

    public static SCE_COP_HEADER fromRequest(HttpServletRequest request) {
        SCE_COP_HEADER model = new SCE_COP_HEADER();
        try {
            model.setIbflag                  (JSPUtil.getParameter(request, "ibflag                      ".trim(), ""));
            model.setPage_rows               (JSPUtil.getParameter(request, "page_rows                   ".trim(), ""));
            model.setCop_number              (JSPUtil.getParameter(request, "cop_number                  ".trim(), ""));
            model.setCreate_user_id          (JSPUtil.getParameter(request, "create_user_id              ".trim(), ""));
            model.setBooking_number          (JSPUtil.getParameter(request, "booking_number              ".trim(), ""));
            model.setCreate_date             (JSPUtil.getParameter(request, "create_date                 ".trim(), ""));
            model.setBooking_split_number    (JSPUtil.getParameter(request, "booking_split_number        ".trim(), ""));
            model.setContainer_year          (JSPUtil.getParameter(request, "container_year              ".trim(), ""));
            model.setContainer_sequence      (JSPUtil.getParameter(request, "container_sequence          ".trim(), ""));
            model.setB_l_number              (JSPUtil.getParameter(request, "b_l_number                  ".trim(), ""));
            model.setUpdate_user_id          (JSPUtil.getParameter(request, "update_user_id              ".trim(), ""));
            model.setContainer_number        (JSPUtil.getParameter(request, "container_number            ".trim(), ""));
            model.setUpdate_date             (JSPUtil.getParameter(request, "update_date                 ".trim(), ""));
            model.setCop_status_code         (JSPUtil.getParameter(request, "cop_status_code             ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SCE_COP_HEADER model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag                      ".trim(), length));
            String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows                   ".trim(), length));
            String[] cop_number           =  (JSPUtil.getParameter(request, "cop_number                  ".trim(), length));
            String[] create_user_id       =  (JSPUtil.getParameter(request, "create_user_id              ".trim(), length));
            String[] booking_number       =  (JSPUtil.getParameter(request, "booking_number              ".trim(), length));
            String[] create_date          =  (JSPUtil.getParameter(request, "create_date                 ".trim(), length));
            String[] booking_split_number =  (JSPUtil.getParameter(request, "booking_split_number        ".trim(), length));
            String[] container_year       =  (JSPUtil.getParameter(request, "container_year              ".trim(), length));
            String[] container_sequence   =  (JSPUtil.getParameter(request, "container_sequence          ".trim(), length));
            String[] b_l_number           =  (JSPUtil.getParameter(request, "b_l_number                  ".trim(), length));
            String[] update_user_id       =  (JSPUtil.getParameter(request, "update_user_id              ".trim(), length));
            String[] container_number     =  (JSPUtil.getParameter(request, "container_number            ".trim(), length));
            String[] update_date          =  (JSPUtil.getParameter(request, "update_date                 ".trim(), length));
            String[] cop_status_code      =  (JSPUtil.getParameter(request, "cop_status_code             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_HEADER();
                model.setIbflag                        (ibflag                  [i]);
                model.setPage_rows                     (page_rows               [i]);
                model.setCop_number                    (cop_number              [i]);
                model.setCreate_user_id                (create_user_id          [i]);
                model.setBooking_number                (booking_number          [i]);
                model.setCreate_date                   (create_date             [i]);
                model.setBooking_split_number          (booking_split_number    [i]);
                model.setContainer_year                (container_year          [i]);
                model.setContainer_sequence            (container_sequence      [i]);
                model.setB_l_number                    (b_l_number              [i]);
                model.setUpdate_user_id                (update_user_id          [i]);
                model.setContainer_number              (container_number        [i]);
                model.setUpdate_date                   (update_date             [i]);
                model.setCop_status_code               (cop_status_code         [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        SCE_COP_HEADER model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag                      ".trim(), length));
            String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows                   ".trim(), length));
            String[] cop_number           =  (JSPUtil.getParameter(request, "cop_number                  ".trim(), length));
            String[] create_user_id       =  (JSPUtil.getParameter(request, "create_user_id              ".trim(), length));
            String[] booking_number       =  (JSPUtil.getParameter(request, "booking_number              ".trim(), length));
            String[] create_date          =  (JSPUtil.getParameter(request, "create_date                 ".trim(), length));
            String[] booking_split_number =  (JSPUtil.getParameter(request, "booking_split_number        ".trim(), length));
            String[] container_year       =  (JSPUtil.getParameter(request, "container_year              ".trim(), length));
            String[] container_sequence   =  (JSPUtil.getParameter(request, "container_sequence          ".trim(), length));
            String[] b_l_number           =  (JSPUtil.getParameter(request, "b_l_number                  ".trim(), length));
            String[] update_user_id       =  (JSPUtil.getParameter(request, "update_user_id              ".trim(), length));
            String[] container_number     =  (JSPUtil.getParameter(request, "container_number            ".trim(), length));
            String[] update_date          =  (JSPUtil.getParameter(request, "update_date                 ".trim(), length));
            String[] cop_status_code      =  (JSPUtil.getParameter(request, "cop_status_code             ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SCE_COP_HEADER();
                model.setIbflag                        (ibflag                  [i]);
                model.setPage_rows                     (page_rows               [i]);
                model.setCop_number                    (cop_number              [i]);
                model.setCreate_user_id                (create_user_id          [i]);
                model.setBooking_number                (booking_number          [i]);
                model.setCreate_date                   (create_date             [i]);
                model.setBooking_split_number          (booking_split_number    [i]);
                model.setContainer_year                (container_year          [i]);
                model.setContainer_sequence            (container_sequence      [i]);
                model.setB_l_number                    (b_l_number              [i]);
                model.setUpdate_user_id                (update_user_id          [i]);
                model.setContainer_number              (container_number        [i]);
                model.setUpdate_date                   (update_date             [i]);
                model.setCop_status_code               (cop_status_code         [i]);
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
