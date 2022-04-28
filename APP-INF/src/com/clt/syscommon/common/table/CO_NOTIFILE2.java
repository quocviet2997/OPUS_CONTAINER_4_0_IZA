package com.clt.syscommon.common.table;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 *  1. 기능 : Table Value Ojbect <p>
 *  2. 처리개요 : <p>
 *    - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p>
 *    - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p>
 *  3. 주의사항 : <p>
 *
 *  @author : 개발자
 *  @version : v1.0.0
 *  @see : 관련 Event , HTMLAction 참조
 *  @since : JDK 1.4 or EJB 2.0
 **/
public final class CO_NOTIFILE2 implements java.io.Serializable {

    private String      ibflag      = "";
    private String      noti_seqno  = "";
    private String      notf_seqno  = "";
    private String      file_name   = "";
    private String      file_rename = "";
    private String      file_path   = "";
    private File        attach_blob = null;
    private String        attach_clob = null;

    public CO_NOTIFILE2(){}

    public CO_NOTIFILE2(
            String      ibflag     ,
            String      noti_seqno ,
            String      notf_seqno ,
            String      file_name  ,
            String      file_rename,
            String      file_path  ,
    File      attach_blob,
            String      attach_clob){
        this.ibflag      = ibflag     ;
        this.noti_seqno  = noti_seqno ;
        this.notf_seqno  = notf_seqno ;
        this.file_name   = file_name  ;
        this.file_rename = file_rename;
        this.file_path   = file_path  ;
        this.attach_blob = attach_blob;
        this.attach_clob = attach_clob;
    }

    // getter method is proceeding ..
    public String      getIbflag     (){    return ibflag         ;    }
    public String      getNoti_seqno (){    return noti_seqno     ;    }
    public String      getNotf_seqno (){    return notf_seqno     ;    }
    public String      getFile_name  (){    return file_name      ;    }
    public String      getFile_rename(){    return file_rename    ;    }
    public String      getFile_path  (){    return file_path      ;    }
    public File      getAttach_blob(){    return attach_blob    ;    }
    public String      getAttach_clob(){    return attach_clob    ;    }

    // setter method is proceeding ..
    public void setIbflag     ( String      ibflag      ){    this.ibflag      = ibflag         ;    }
    public void setNoti_seqno ( String      noti_seqno  ){    this.noti_seqno  = noti_seqno     ;    }
    public void setNotf_seqno ( String      notf_seqno  ){    this.notf_seqno  = notf_seqno     ;    }
    public void setFile_name  ( String      file_name   ){    this.file_name   = file_name      ;    }
    public void setFile_rename( String      file_rename ){    this.file_rename = file_rename    ;    }
    public void setFile_path  ( String      file_path   ){    this.file_path   = file_path      ;    }
    public void setAttach_blob( File      attach_blob ){    this.attach_blob = attach_blob    ;    }
    public void setAttach_clob( String      attach_clob ){    this.attach_clob = attach_clob    ;    }

    public static CO_NOTIFILE2 fromRequest(HttpServletRequest request) {
        CO_NOTIFILE2 model = new CO_NOTIFILE2();
        try {
            model.setIbflag         (JSPUtil.getParameter(request, "ibflag             ".trim(), ""));
            model.setNoti_seqno     (JSPUtil.getParameter(request, "noti_seqno         ".trim(), ""));
            model.setNotf_seqno     (JSPUtil.getParameter(request, "notf_seqno         ".trim(), ""));
            model.setFile_name      (JSPUtil.getParameter(request, "file_name          ".trim(), ""));
            model.setFile_rename    (JSPUtil.getParameter(request, "file_rename        ".trim(), ""));
            model.setFile_path      (JSPUtil.getParameter(request, "file_path          ".trim(), ""));
           // model.setAttach_blob    (JSPUtil.getParameter(request, "attach_blob        ".trim(), ""));
            model.setAttach_clob    (JSPUtil.getParameter(request, "attach_clob        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        CO_NOTIFILE2 model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag             ".trim(), length));
            String[] noti_seqno  =  (JSPUtil.getParameter(request, "noti_seqno         ".trim(), length));
            String[] notf_seqno  =  (JSPUtil.getParameter(request, "notf_seqno         ".trim(), length));
            String[] file_name   =  (JSPUtil.getParameter(request, "file_name          ".trim(), length));
            String[] file_rename =  (JSPUtil.getParameter(request, "file_rename        ".trim(), length));
            String[] file_path   =  (JSPUtil.getParameter(request, "file_path          ".trim(), length));
            String[] attach_blob =  (JSPUtil.getParameter(request, "attach_blob        ".trim(), length));
            String[] attach_clob =  (JSPUtil.getParameter(request, "attach_clob        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CO_NOTIFILE2();
                model.setIbflag               (ibflag         [i]);
                model.setNoti_seqno           (noti_seqno     [i]);
                model.setNotf_seqno           (notf_seqno     [i]);
                model.setFile_name            (file_name      [i]);
                model.setFile_rename          (file_rename    [i]);
                model.setFile_path            (file_path      [i]);
              //  model.setAttach_blob          (attach_blob    [i]);
                model.setAttach_clob          (attach_clob    [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        CO_NOTIFILE2 model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag             ".trim(), length));
            String[] noti_seqno  =  (JSPUtil.getParameter(request, "noti_seqno         ".trim(), length));
            String[] notf_seqno  =  (JSPUtil.getParameter(request, "notf_seqno         ".trim(), length));
            String[] file_name   =  (JSPUtil.getParameter(request, "file_name          ".trim(), length));
            String[] file_rename =  (JSPUtil.getParameter(request, "file_rename        ".trim(), length));
            String[] file_path   =  (JSPUtil.getParameter(request, "file_path          ".trim(), length));
            String[] attach_blob =  (JSPUtil.getParameter(request, "attach_blob        ".trim(), length));
            String[] attach_clob =  (JSPUtil.getParameter(request, "attach_clob        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new CO_NOTIFILE2();
                model.setIbflag               (ibflag         [i]);
                model.setNoti_seqno           (noti_seqno     [i]);
                model.setNotf_seqno           (notf_seqno     [i]);
                model.setFile_name            (file_name      [i]);
                model.setFile_rename          (file_rename    [i]);
                model.setFile_path            (file_path      [i]);
            //    model.setAttach_blob          (attach_blob    [i]);
                model.setAttach_clob          (attach_clob    [i]);
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
