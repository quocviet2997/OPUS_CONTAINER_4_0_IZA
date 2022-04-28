/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_006HTMLAction.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;



/**
 * HTTP Parser<br>
 * - com.clt.syscommon.management.enis 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 RoleManagementSC로 실행요청<br>
 * - RoleManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author SeongWook Kim
 * @see ComSys006Event , UI_COM_SYS_006EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_SYS_006HTMLAction extends HTMLActionSupport {

	/**
	 * UI_COM_SYS_006HTMLAction 객체를 생성
	 */
	public COM_SYS_006HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UI_COM_SYS_006Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		String usr_id  = JSPUtil.getParameter(request, "usr_id ".trim(), "ALL");
		String usr_nm  = JSPUtil.getParameter(request, "usr_nm ".trim(), "ALL");
        String usr_role_cd = JSPUtil.getParameter(request, "usr_role_cd".trim(), "ALL");
        String usr_role_nm = JSPUtil.getParameter(request, "usr_role_nm".trim(), "ALL");
        String pgm_no  = JSPUtil.getParameter(request, "pgm_no ".trim(), "ALL");
        String pgm_nm  = JSPUtil.getParameter(request, "pgm_nm ".trim(), "ALL");
        
		
		ComSys006Event event = new ComSys006Event(
                usr_nm ,  // form tag name
                usr_role_nm,  // form tag name
                pgm_nm ); // form tag name
        
		event.setUsrId(usr_id);
		event.setRoleCd(usr_role_cd);
		event.setPgmNo(pgm_no);
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