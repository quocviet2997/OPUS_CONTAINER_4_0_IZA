/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_014HTMLAction.java
*@FileTitle : 부모역할 조회팝업
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-11
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2007-01-11 SeongWook Kim
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
import com.clt.syscommon.common.table.COM_USR_ROLE;



/**
 * HTTP Parser<br>
 * - com.clt.syscommon.management.bms 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 RoleManagementSC로 실행요청<br>
 * - RoleManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author SeongWook Kim
 * @see ComSys014Event , UI_COM_SYS_014EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_SYS_014HTMLAction extends HTMLActionSupport {

	/**
	 * UI_COM_SYS_014HTMLAction 객체를 생성
	 */
	public COM_SYS_014HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UI_COM_SYS_014Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
		String role_cd = JSPUtil.getParameter(request, "role_cd".trim(), "");
        String role_nm = JSPUtil.getParameter(request, "role_nm".trim(), "");

    	COM_USR_ROLE com_usr_role = COM_USR_ROLE.fromRequest(request);
        Collection com_usr_roles = null;

		if(command.isCommand(FormCommand.MULTI)) {
			com_usr_roles = COM_USR_ROLE.fromRequestGrid(request,"");
			log.error("========command is : "+command.getCommand()+" and counts is : "+com_usr_roles.size());
		}
		ComSys014Event event = new ComSys014Event();
		
		if(com_usr_roles != null){
			event.setCOM_USR_ROLES(com_usr_roles);
		}     
		event.setCOM_USR_ROLE(com_usr_role);
		event.setRole_cd(role_cd);
		event.setRole_nm(role_nm);
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