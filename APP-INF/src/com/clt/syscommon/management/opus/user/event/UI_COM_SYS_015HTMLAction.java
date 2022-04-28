/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_015HTMLAction.java
*@FileTitle : 사용자관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-14
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-14 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.user.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.common.table.ComUsrOfcCngVO;


/**
 * HTTP Parser<br>
 * - com.clt.syscommon.management.enis 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 userManagementSC로 실행요청<br>
 * - userManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author SeongWook LEE
 * @see UiComSys015Event , UI_COM_SYS_015EventResponse 참조
 * @since J2EE 1.4
 */

public class UI_COM_SYS_015HTMLAction extends HTMLActionSupport {

	/**
	 * UI_COM_SYS_015HTMLAction 객체를 생성
	 */
	public UI_COM_SYS_015HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UI_COM_SYS_015Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
		String usr_id = JSPUtil.getParameter(request, "usr_id".trim(), "ALL");
        String usr_nm = JSPUtil.getParameter(request, "usr_nm".trim(), "ALL");
        String auth_type = JSPUtil.getParameter(request, "auth_type".trim(), "");
        String admin_page = JSPUtil.getParameter(request, "admin_page".trim(), "");
        String cng_ofc_cd = JSPUtil.getParameter(request, "cng_ofc_cd".trim(), "");
        String default_ofc_cd = JSPUtil.getParameter(request, "default_ofc_cd".trim(), "");
        String sRow = JSPUtil.getParameter(request, "row".trim(), "");        
        
		/* 
         ibSheet 사용시 fromRequestGrid를 사용하는데 
         prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
         String prefix = "" ;  
         COM_USER com_user = COM_USER.fromRequestGrid(request, prefix);
        */ 
        UiComSys015Event event = new UiComSys015Event();
        ComUsrOfcCngVO[] com_users = null;
		if(command.isCommand(FormCommand.MULTI)) {
			com_users = (ComUsrOfcCngVO[])getVOs(request, ComUsrOfcCngVO.class);
			event.setComUserVO(com_users);
		}
        event.setUsr_id(usr_id);
        event.setUsr_nm(usr_nm);
        event.setAuth_type(auth_type);
        event.setAdmin_page(admin_page);
        event.setCng_ofc_cd(cng_ofc_cd);
        event.setDefault_ofc_cd(default_ofc_cd);
        event.setSRow(sRow);
        
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