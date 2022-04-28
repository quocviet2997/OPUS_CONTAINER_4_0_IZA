/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0B2HTMLAction.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvd.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * - BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Hyunsu, Ryu
 * @see ComEns0B2Event , COM_ENS_0B2EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_0B2HTMLAction extends HTMLActionSupport {

    /**
     * COM_ENS_0B2HTMLAction 객체를 생성
     */
    public COM_ENS_0B2HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_0B2Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
        
        /* 
        ibSheet 사용시 fromRequestGrid를 사용하는데 
        prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
        String prefix = "" ;  
        VSL_SKD vsl_skd = VSL_SKD.fromRequestGrid(request, prefix);
       */ 
    
       // 메인화면에서 Vessel팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우
       String etdeta      = JSPUtil.getParameter(request, "etdeta".trim(), "");
       String sdate	  = JSPUtil.getParameter(request, "sdate".trim(), "");
       String edate	  = JSPUtil.getParameter(request, "edate".trim(), "");
       String vvd_cd 	  = JSPUtil.getParameter(request, "vvd_cd".trim(), "");
       String loc_cd 	  = JSPUtil.getParameter(request, "loc_cd".trim(), "");
       String lane_cd 	  = JSPUtil.getParameter(request, "lane_cd".trim(), "");
       String oper 		  = JSPUtil.getParameter(request, "oper".trim(), "");
   	
       int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);  
   	
       FormCommand f_cmd = FormCommand.fromRequest(request);
       log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
   	
       ComEns0B2Event event = new ComEns0B2Event(
    		etdeta,
    	    sdate,
    	    edate,
    	    vvd_cd,
    	    loc_cd,
    	    lane_cd,
    	    oper,
    	    iPage
       ); // table value object
       event.setCommandClassName("BizCommonSC");
       event.setFormCommand(f_cmd);
       request.setAttribute("Event", event);


        return  event;
    }

    /**
     * HttpRequest의 attribute에 업무시나리오 수행결과 값 저장<br>
     * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param eventResponse EventResponse interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
        request.setAttribute("EventResponse", eventResponse);
    }

    /**
     * HttpRequest의 attribute에 HttpRequest 파싱 수행결과 값 저장<br>
     * HttpRequest 파싱 수행결과 값 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param event Event interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, Event event) {
        request.setAttribute("Event", event);
    }

}