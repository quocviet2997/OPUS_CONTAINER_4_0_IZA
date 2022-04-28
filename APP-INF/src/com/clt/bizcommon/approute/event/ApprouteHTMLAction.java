/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteHTMLAction.java
*@FileTitle : Approval Route PopUp
*Open Issues :
*Change history :
*@LastModifyDate : 2008-09-01
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2008-08-29 Jeong-Hoon, KIM
* 1.0 최초 생성
=========================================================*/ 
package com.clt.bizcommon.approute.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.approute.event.ApprouteEvent;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BIZCOMMONSC로 실행요청<br>
 * - BIZCOMMONSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Jeong-Hoon, KIM
 * @see ApprouteEvent , ApprouteEventResponse 참조
 * @since J2EE 1.4
 */
public class ApprouteHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ApprouteHTMLAction 객체를 생성
	 */
	public ApprouteHTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ApprouteEvent로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		String ofc_cd_deptsrch = JSPUtil.getParameter(request, "ofc_cd_deptsrch".trim(), "");
    	String ofc_cd = JSPUtil.getParameter(request, "ofc_cd".trim(), "");
    	String sub_sys_cd = JSPUtil.getParameter(request, "sub_sys_cd".trim(), "");
    	String mode = JSPUtil.getParameter(request, "mode".trim(), "");
    	String csr_no = JSPUtil.getParameter(request, "csr_no".trim(),"");
    	
    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	ApprouteEvent event = new ApprouteEvent(ofc_cd_deptsrch, ofc_cd, sub_sys_cd, mode, iPage, csr_no); 
    	if (f_cmd.isCommand(FormCommand.MULTI)) {
			event.putValue("ibflag", 		request.getParameterValues("ibflag"));
			event.putValue("apro_seq",  	request.getParameterValues("apro_seq"));
			event.putValue("apro_usr_id",       	request.getParameterValues("apro_usr_id"));
			event.putValue("apro_usr_nm", 		request.getParameterValues("apro_usr_nm"));
			event.putValue("apro_ofc_cd",    	request.getParameterValues("apro_ofc_cd"));
			event.putValue("apro_usr_jb_tit_nm",    		request.getParameterValues("apro_usr_jb_tit_nm"));
			event.putValue("apspo_cd",    		request.getParameterValues("apspo_cd"));
    	}
                 
        event.setCommandClassName("ApprouteSC");
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