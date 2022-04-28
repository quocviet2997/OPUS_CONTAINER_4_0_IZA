package com.clt.syscommon.common.table;

import com.clt.framework.component.util.JSPUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 * 1. 기능 : Table Value Ojbect <p> 2. 처리개요 : <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p> 3. 주의사항 : <p>
 * @author  : 한성환
 * @version  : v1.0.0
 * @see  : 관련 Event , HTMLAction 참조
 * @since  : JDK 1.3 or EJB 1.1
 */
public final class SEARCHHELP implements java.io.Serializable {

    /**
	 * @uml.property  name="param01"
	 */
    private String  param01 = "";
    /**
	 * @uml.property  name="param02"
	 */
    private String  param02 = "";
    /**
	 * @uml.property  name="param03"
	 */
    private String  param03 = "";
    /**
	 * @uml.property  name="param04"
	 */
    private String  param04 = "";
    /**
	 * @uml.property  name="param05"
	 */
    private String  param05 = "";
    /**
	 * @uml.property  name="param06"
	 */
    private String  param06 = "";
    /**
	 * @uml.property  name="param07"
	 */
    private String  param07 = "";
    /**
	 * @uml.property  name="param08"
	 */
    private String  param08 = "";
    /**
	 * @uml.property  name="param09"
	 */
    private String  param09 = "";
    /**
	 * @uml.property  name="param10"
	 */
    private String  param10 = "";
    /**
	 * @uml.property  name="param11"
	 */
    private String  param11 = "";
    /**
	 * @uml.property  name="param12"
	 */
    private String  param12 = "";
    /**
	 * @uml.property  name="param13"
	 */
    private String  param13 = "";
    /**
	 * @uml.property  name="param14"
	 */
    private String  param14 = "";
    /**
	 * @uml.property  name="param15"
	 */
    private String  param15 = "";
    /**
	 * @uml.property  name="param16"
	 */
    private String  param16 = "";
    /**
	 * @uml.property  name="param17"
	 */
    private String  param17 = "";
    /**
	 * @uml.property  name="param18"
	 */
    private String  param18 = "";
    /**
	 * @uml.property  name="param19"
	 */
    private String  param19 = "";
    /**
	 * @uml.property  name="param20"
	 */
    private String  param20 = "";

    public SEARCHHELP(){}

    public SEARCHHELP(
            String  param01,
            String  param02,
            String  param03,
            String  param04,
            String  param05,
            String  param06,
            String  param07,
            String  param08,
            String  param09,
            String  param10,
            String  param11,
            String  param12,
            String  param13,
            String  param14,
            String  param15,
            String  param16,
            String  param17,
            String  param18,
            String  param19,
            String  param20){
        this.param01 = param01;
        this.param02 = param02;
        this.param03 = param03;
        this.param04 = param04;
        this.param05 = param05;
        this.param06 = param06;
        this.param07 = param07;
        this.param08 = param08;
        this.param09 = param09;
        this.param10 = param10;
        this.param11 = param11;
        this.param12 = param12;
        this.param13 = param13;
        this.param14 = param14;
        this.param15 = param15;
        this.param16 = param16;
        this.param17 = param17;
        this.param18 = param18;
        this.param19 = param19;
        this.param20 = param20;
    }

    // getter method is proceeding ..
    /**
	 * @return  Returns the param01.
	 * @uml.property  name="param01"
	 */
    public String  getParam01(){    return param01    ;    }
    /**
	 * @return  Returns the param02.
	 * @uml.property  name="param02"
	 */
    public String  getParam02(){    return param02    ;    }
    /**
	 * @return  Returns the param03.
	 * @uml.property  name="param03"
	 */
    public String  getParam03(){    return param03    ;    }
    /**
	 * @return  Returns the param04.
	 * @uml.property  name="param04"
	 */
    public String  getParam04(){    return param04    ;    }
    /**
	 * @return  Returns the param05.
	 * @uml.property  name="param05"
	 */
    public String  getParam05(){    return param05    ;    }
    /**
	 * @return  Returns the param06.
	 * @uml.property  name="param06"
	 */
    public String  getParam06(){    return param06    ;    }
    /**
	 * @return  Returns the param07.
	 * @uml.property  name="param07"
	 */
    public String  getParam07(){    return param07    ;    }
    /**
	 * @return  Returns the param08.
	 * @uml.property  name="param08"
	 */
    public String  getParam08(){    return param08    ;    }
    /**
	 * @return  Returns the param09.
	 * @uml.property  name="param09"
	 */
    public String  getParam09(){    return param09    ;    }
    /**
	 * @return  Returns the param10.
	 * @uml.property  name="param10"
	 */
    public String  getParam10(){    return param10    ;    }
    /**
	 * @return  Returns the param11.
	 * @uml.property  name="param11"
	 */
    public String  getParam11(){    return param11    ;    }
    /**
	 * @return  Returns the param12.
	 * @uml.property  name="param12"
	 */
    public String  getParam12(){    return param12    ;    }
    /**
	 * @return  Returns the param13.
	 * @uml.property  name="param13"
	 */
    public String  getParam13(){    return param13    ;    }
    /**
	 * @return  Returns the param14.
	 * @uml.property  name="param14"
	 */
    public String  getParam14(){    return param14    ;    }
    /**
	 * @return  Returns the param15.
	 * @uml.property  name="param15"
	 */
    public String  getParam15(){    return param15    ;    }
    /**
	 * @return  Returns the param16.
	 * @uml.property  name="param16"
	 */
    public String  getParam16(){    return param16    ;    }
    /**
	 * @return  Returns the param17.
	 * @uml.property  name="param17"
	 */
    public String  getParam17(){    return param17    ;    }
    /**
	 * @return  Returns the param18.
	 * @uml.property  name="param18"
	 */
    public String  getParam18(){    return param18    ;    }
    /**
	 * @return  Returns the param19.
	 * @uml.property  name="param19"
	 */
    public String  getParam19(){    return param19    ;    }
    /**
	 * @return  Returns the param20.
	 * @uml.property  name="param20"
	 */
    public String  getParam20(){    return param20    ;    }

    // setter method is proceeding ..
    /**
	 * @param param01  The param01 to set.
	 * @uml.property  name="param01"
	 */
    public void setParam01( String  param01 ){    this.param01 = param01    ;    }
    /**
	 * @param param02  The param02 to set.
	 * @uml.property  name="param02"
	 */
    public void setParam02( String  param02 ){    this.param02 = param02    ;    }
    /**
	 * @param param03  The param03 to set.
	 * @uml.property  name="param03"
	 */
    public void setParam03( String  param03 ){    this.param03 = param03    ;    }
    /**
	 * @param param04  The param04 to set.
	 * @uml.property  name="param04"
	 */
    public void setParam04( String  param04 ){    this.param04 = param04    ;    }
    /**
	 * @param param05  The param05 to set.
	 * @uml.property  name="param05"
	 */
    public void setParam05( String  param05 ){    this.param05 = param05    ;    }
    /**
	 * @param param06  The param06 to set.
	 * @uml.property  name="param06"
	 */
    public void setParam06( String  param06 ){    this.param06 = param06    ;    }
    /**
	 * @param param07  The param07 to set.
	 * @uml.property  name="param07"
	 */
    public void setParam07( String  param07 ){    this.param07 = param07    ;    }
    /**
	 * @param param08  The param08 to set.
	 * @uml.property  name="param08"
	 */
    public void setParam08( String  param08 ){    this.param08 = param08    ;    }
    /**
	 * @param param09  The param09 to set.
	 * @uml.property  name="param09"
	 */
    public void setParam09( String  param09 ){    this.param09 = param09    ;    }
    /**
	 * @param param10  The param10 to set.
	 * @uml.property  name="param10"
	 */
    public void setParam10( String  param10 ){    this.param10 = param10    ;    }
    /**
	 * @param param11  The param11 to set.
	 * @uml.property  name="param11"
	 */
    public void setParam11( String  param11 ){    this.param11 = param11    ;    }
    /**
	 * @param param12  The param12 to set.
	 * @uml.property  name="param12"
	 */
    public void setParam12( String  param12 ){    this.param12 = param12    ;    }
    /**
	 * @param param13  The param13 to set.
	 * @uml.property  name="param13"
	 */
    public void setParam13( String  param13 ){    this.param13 = param13    ;    }
    /**
	 * @param param14  The param14 to set.
	 * @uml.property  name="param14"
	 */
    public void setParam14( String  param14 ){    this.param14 = param14    ;    }
    /**
	 * @param param15  The param15 to set.
	 * @uml.property  name="param15"
	 */
    public void setParam15( String  param15 ){    this.param15 = param15    ;    }
    /**
	 * @param param16  The param16 to set.
	 * @uml.property  name="param16"
	 */
    public void setParam16( String  param16 ){    this.param16 = param16    ;    }
    /**
	 * @param param17  The param17 to set.
	 * @uml.property  name="param17"
	 */
    public void setParam17( String  param17 ){    this.param17 = param17    ;    }
    /**
	 * @param param18  The param18 to set.
	 * @uml.property  name="param18"
	 */
    public void setParam18( String  param18 ){    this.param18 = param18    ;    }
    /**
	 * @param param19  The param19 to set.
	 * @uml.property  name="param19"
	 */
    public void setParam19( String  param19 ){    this.param19 = param19    ;    }
    /**
	 * @param param20  The param20 to set.
	 * @uml.property  name="param20"
	 */
    public void setParam20( String  param20 ){    this.param20 = param20    ;    }

    public static SEARCHHELP fromRequest(HttpServletRequest request) {
        SEARCHHELP model = new SEARCHHELP();
        try {
            model.setParam01    (JSPUtil.getParameter(request, "param01        ".trim(), ""));
            model.setParam02    (JSPUtil.getParameter(request, "param02        ".trim(), ""));
            model.setParam03    (JSPUtil.getParameter(request, "param03        ".trim(), ""));
            model.setParam04    (JSPUtil.getParameter(request, "param04        ".trim(), ""));
            model.setParam05    (JSPUtil.getParameter(request, "param05        ".trim(), ""));
            model.setParam06    (JSPUtil.getParameter(request, "param06        ".trim(), ""));
            model.setParam07    (JSPUtil.getParameter(request, "param07        ".trim(), ""));
            model.setParam08    (JSPUtil.getParameter(request, "param08        ".trim(), ""));
            model.setParam09    (JSPUtil.getParameter(request, "param09        ".trim(), ""));
            model.setParam10    (JSPUtil.getParameter(request, "param10        ".trim(), ""));
            model.setParam11    (JSPUtil.getParameter(request, "param11        ".trim(), ""));
            model.setParam12    (JSPUtil.getParameter(request, "param12        ".trim(), ""));
            model.setParam13    (JSPUtil.getParameter(request, "param13        ".trim(), ""));
            model.setParam14    (JSPUtil.getParameter(request, "param14        ".trim(), ""));
            model.setParam15    (JSPUtil.getParameter(request, "param15        ".trim(), ""));
            model.setParam16    (JSPUtil.getParameter(request, "param16        ".trim(), ""));
            model.setParam17    (JSPUtil.getParameter(request, "param17        ".trim(), ""));
            model.setParam18    (JSPUtil.getParameter(request, "param18        ".trim(), ""));
            model.setParam19    (JSPUtil.getParameter(request, "param19        ".trim(), ""));
            model.setParam20    (JSPUtil.getParameter(request, "param20        ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        SEARCHHELP model = null;
        Collection models = new ArrayList();
        try {
            String[] param01 =  (JSPUtil.getParameter(request, "param01        ".trim(), length));
            String[] param02 =  (JSPUtil.getParameter(request, "param02        ".trim(), length));
            String[] param03 =  (JSPUtil.getParameter(request, "param03        ".trim(), length));
            String[] param04 =  (JSPUtil.getParameter(request, "param04        ".trim(), length));
            String[] param05 =  (JSPUtil.getParameter(request, "param05        ".trim(), length));
            String[] param06 =  (JSPUtil.getParameter(request, "param06        ".trim(), length));
            String[] param07 =  (JSPUtil.getParameter(request, "param07        ".trim(), length));
            String[] param08 =  (JSPUtil.getParameter(request, "param08        ".trim(), length));
            String[] param09 =  (JSPUtil.getParameter(request, "param09        ".trim(), length));
            String[] param10 =  (JSPUtil.getParameter(request, "param10        ".trim(), length));
            String[] param11 =  (JSPUtil.getParameter(request, "param11        ".trim(), length));
            String[] param12 =  (JSPUtil.getParameter(request, "param12        ".trim(), length));
            String[] param13 =  (JSPUtil.getParameter(request, "param13        ".trim(), length));
            String[] param14 =  (JSPUtil.getParameter(request, "param14        ".trim(), length));
            String[] param15 =  (JSPUtil.getParameter(request, "param15        ".trim(), length));
            String[] param16 =  (JSPUtil.getParameter(request, "param16        ".trim(), length));
            String[] param17 =  (JSPUtil.getParameter(request, "param17        ".trim(), length));
            String[] param18 =  (JSPUtil.getParameter(request, "param18        ".trim(), length));
            String[] param19 =  (JSPUtil.getParameter(request, "param19        ".trim(), length));
            String[] param20 =  (JSPUtil.getParameter(request, "param20        ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new SEARCHHELP();
                model.setParam01          (param01    [i]);
                model.setParam02          (param02    [i]);
                model.setParam03          (param03    [i]);
                model.setParam04          (param04    [i]);
                model.setParam05          (param05    [i]);
                model.setParam06          (param06    [i]);
                model.setParam07          (param07    [i]);
                model.setParam08          (param08    [i]);
                model.setParam09          (param09    [i]);
                model.setParam10          (param10    [i]);
                model.setParam11          (param11    [i]);
                model.setParam12          (param12    [i]);
                model.setParam13          (param13    [i]);
                model.setParam14          (param14    [i]);
                model.setParam15          (param15    [i]);
                model.setParam16          (param16    [i]);
                model.setParam17          (param17    [i]);
                model.setParam18          (param18    [i]);
                model.setParam19          (param19    [i]);
                model.setParam20          (param20    [i]);
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
