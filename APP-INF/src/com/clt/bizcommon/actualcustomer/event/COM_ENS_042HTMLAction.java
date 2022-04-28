/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_042HTMLAction.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.actualcustomer.event;

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
 * @author sangyool pak
 * @see ComEns042Event , COM_ENS_042EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_042HTMLAction extends HTMLActionSupport {

    /**
     * COM_ENS_042HTMLAction 객체를 생성
     */
    public COM_ENS_042HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_042Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
        
    	// Retrieve 버튼 클릭시
    	String loc_cd  = JSPUtil.getParameter(request, "loc_cd".trim(), "");
    	String cust_cd = JSPUtil.getParameter(request, "cust_cd".trim(), "");
    	String cust_nm = JSPUtil.getParameter(request, "cust_nm".trim(), "");
    	int iPage        = JSPUtil.getParameterAsInt(request, "iPage", 1);
    	
    	   	    	
    	FormCommand f_cmd = FormCommand.fromRequest(request); 
        ComEns042Event event = new ComEns042Event();
        
        // Retrieve 버튼 클릭시
		if (f_cmd.isCommand(FormCommand.SEARCH)) {
			event = new ComEns042Event(loc_cd, cust_cd, cust_nm, iPage);
		}
		
    	// Retrieve 버튼 클릭시
		if (f_cmd.isCommand(FormCommand.SEARCH01)) {
	        event = new ComEns042Event(cust_cd, iPage);
		} 
        
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