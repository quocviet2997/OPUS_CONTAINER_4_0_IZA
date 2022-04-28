package com.clt.syscommon.common.table;

import com.clt.framework.component.util.JSPUtil;

import java.lang.reflect.Field;
import javax.servlet.http.HttpServletRequest;

/**
 * 1. 기능 : Table Value Ojbect <p> 2. 처리개요 : <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p> 3. 주의사항 : <p>
 * @author  : 한성환
 * @version  : v1.0.0
 * @see  : 관련 Event , HTMLAction 참조
 * @since  : JDK 1.3 or EJB 1.1
 */
public final class LISTHELP implements java.io.Serializable {

    /**
	 * @uml.property  name="pageDir"
	 */
    private int    pageDir   = 0;
    /**
	 * @uml.property  name="pageNo"
	 */
    private int    pageNo    = 0;
    /**
	 * @uml.property  name="lineNo"
	 */
    private int    lineNo    = 0;
    /**
	 * @uml.property  name="min"
	 */
    private int    min       = 0;
    /**
	 * @uml.property  name="max"
	 */
    private int    max       = 0;
    /**
	 * @uml.property  name="totCnt"
	 */
    private int    totCnt    = 0;
    /**
	 * @uml.property  name="srchCon1"
	 */
    private String    srchCon1  = "";
    /**
	 * @uml.property  name="srchCon2"
	 */
    private String    srchCon2  = "";
    /**
	 * @uml.property  name="srchCon3"
	 */
    private String    srchCon3  = "";
    /**
	 * @uml.property  name="srchCon4"
	 */
    private String    srchCon4  = "";
    /**
	 * @uml.property  name="srchText1"
	 */
    private String    srchText1 = "";
    /**
	 * @uml.property  name="srchText2"
	 */
    private String    srchText2 = "";
    /**
	 * @uml.property  name="srchText3"
	 */
    private String    srchText3 = "";
    /**
	 * @uml.property  name="srchText4"
	 */
    private String    srchText4 = "";

    public LISTHELP(){}

    public LISTHELP(
            int    pageDir  ,
            int    pageNo   ,
            int    lineNo   ,
            int    min      ,
            int    max      ,
            int    totCnt   ,
            String    srchCon1 ,
            String    srchCon2 ,
            String    srchCon3 ,
            String    srchCon4 ,
            String    srchText1,
            String    srchText2,
            String    srchText3,
            String    srchText4){
        this.pageDir   = pageDir  ;
        this.pageNo    = pageNo   ;
        this.lineNo    = lineNo   ;
        this.min       = min      ;
        this.max       = max      ;
        this.totCnt    = totCnt   ;
        this.srchCon1  = srchCon1 ;
        this.srchCon2  = srchCon2 ;
        this.srchCon3  = srchCon3 ;
        this.srchCon4  = srchCon4 ;
        this.srchText1 = srchText1;
        this.srchText2 = srchText2;
        this.srchText3 = srchText3;
        this.srchText4 = srchText4;
    }

    // getter method is proceeding ..
    /**
	 * @return  Returns the pageDir.
	 * @uml.property  name="pageDir"
	 */
    public int    getPageDir  (){    return pageDir      ;    }
    public int    getPageno   (){    return pageNo       ;    }
    public int    getLineno   (){    return lineNo       ;    }
    /**
	 * @return  Returns the min.
	 * @uml.property  name="min"
	 */
    public int    getMin      (){    return min          ;    }
    /**
	 * @return  Returns the max.
	 * @uml.property  name="max"
	 */
    public int    getMax      (){    return max          ;    }
    public int    getTotcnt   (){    return totCnt       ;    }
    public String    getSrchcon1 (){    return srchCon1     ;    }
    public String    getSrchcon2 (){    return srchCon2     ;    }
    public String    getSrchcon3 (){    return srchCon3     ;    }
    public String    getSrchcon4 (){    return srchCon4     ;    }
    public String    getSrchtext1(){    return srchText1    ;    }
    public String    getSrchtext2(){    return srchText2    ;    }
    public String    getSrchtext3(){    return srchText3    ;    }
    public String    getSrchtext4(){    return srchText4    ;    }

    // setter method is proceeding ..
    public void setPagedir  ( int    pageDir   ){    this.pageDir   = pageDir      ;    }
    public void setPageno   ( int    pageNo    ){    this.pageNo    = pageNo       ;    }
    public void setLineno   ( int    lineNo    ){    this.lineNo    = lineNo       ;    }
    /**
	 * @param min  The min to set.
	 * @uml.property  name="min"
	 */
    public void setMin      ( int    min       ){    this.min       = min          ;    }
    /**
	 * @param max  The max to set.
	 * @uml.property  name="max"
	 */
    public void setMax      ( int    max       ){    this.max       = max          ;    }
    public void setTotcnt   ( int    totCnt    ){    this.totCnt    = totCnt       ;    }
    public void setSrchcon1 ( String    srchCon1  ){    this.srchCon1  = srchCon1     ;    }
    public void setSrchcon2 ( String    srchCon2  ){    this.srchCon2  = srchCon2     ;    }
    public void setSrchcon3 ( String    srchCon3  ){    this.srchCon3  = srchCon3     ;    }
    public void setSrchcon4 ( String    srchCon4  ){    this.srchCon4  = srchCon4     ;    }
    public void setSrchtext1( String    srchText1 ){    this.srchText1 = srchText1    ;    }
    public void setSrchtext2( String    srchText2 ){    this.srchText2 = srchText2    ;    }
    public void setSrchtext3( String    srchText3 ){    this.srchText3 = srchText3    ;    }
    public void setSrchtext4( String    srchText4 ){    this.srchText4 = srchText4    ;    }

    public static LISTHELP fromRequest(HttpServletRequest request) {
        LISTHELP model = new LISTHELP();
        try {

            //현재 페이지당 10개의 자료를 보여주고 있음, 변경시 반영해야함
            int pageNo=Integer.parseInt(JSPUtil.getParameter(request,"pageNo","1"));
            int lineNo=Integer.parseInt(JSPUtil.getParameter(request,"lineNo",Integer.toString(JSPUtil.DEFAULT_TABLE_ROW)));
            model.setPagedir      (Integer.parseInt(JSPUtil.getParameter(request, "pageDir", "1")));
            model.setPageno       (pageNo);
            model.setLineno       (lineNo);
            if((pageNo!=0)&&(lineNo!=0)){
                 model.setMin((pageNo-1)*lineNo);
                 model.setMax(pageNo*lineNo);
            }
            //model.setTotcnt       (JSPUtil.getParameter(request, "totcnt", ""));
            model.setSrchcon1     (JSPUtil.getParameter(request, "srchCon1", ""));
            model.setSrchcon2     (JSPUtil.getParameter(request, "srchCon2", ""));
            model.setSrchcon3     (JSPUtil.getParameter(request, "srchCon3", ""));
            model.setSrchcon4     (JSPUtil.getParameter(request, "srchCon4", ""));
            model.setSrchtext1    (JSPUtil.getParameter(request, "srchText1", ""));
            model.setSrchtext2    (JSPUtil.getParameter(request, "srchText2", ""));
            model.setSrchtext3    (JSPUtil.getParameter(request, "srchText3", ""));
            model.setSrchtext4    (JSPUtil.getParameter(request, "srchText4", ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
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
