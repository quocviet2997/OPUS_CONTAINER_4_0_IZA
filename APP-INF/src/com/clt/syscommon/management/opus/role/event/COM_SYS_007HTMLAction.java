/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_007HTMLAction.java
*@FileTitle : 역할관리
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
import javax.servlet.http.HttpSession;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.CommonWebKeys;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.COM_USR_ROLE;
import com.clt.syscommon.common.table.ComUsrRoleVO;
import com.clt.syscommon.management.opus.role.vo.ComUsrRoleConditionVO;



/**
 * HTTP Parser<br>
 * - com.clt.syscommon.management.enis 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 RoleManagementSC로 실행요청<br>
 * - RoleManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author SeongWook Kim
 * @see ComSys007Event , UI_COM_SYS_007EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_SYS_007HTMLAction extends HTMLActionSupport {

	/**
	 * UI_COM_SYS_007HTMLAction 객체를 생성
	 */
	public COM_SYS_007HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UI_COM_SYS_007Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
		String role_cd = JSPUtil.getParameter(request, "usr_role_cd".trim(), "ALL").toUpperCase();
        String role_nm = JSPUtil.getParameter(request, "usr_role_nm".trim(), "ALL");
        
		/* 
         ibSheet 사용시 fromRequestGrid를 사용하는데 
         prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
         String prefix = "" ;  
         COM_ROLE com_role = COM_ROLE.fromRequestGrid(request, prefix);
        */ 
        ComUsrRoleVO[] comUsrRoles = null;
        ComSys007Event event = new ComSys007Event();  // table value object
        
		if(command.isCommand(FormCommand.MULTI)) {
			comUsrRoles = (ComUsrRoleVO[])getVOs(request, ComUsrRoleVO.class,"sheet1_");
			event.setComUsrRoles(comUsrRoles);
		}
        
		HttpSession session = request.getSession();
		SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);

		ComUsrRoleConditionVO conditionVO = new ComUsrRoleConditionVO();
		conditionVO.setUsrRoleCd(role_cd);
		conditionVO.setUsrRoleNm(role_nm);
		conditionVO.setUsrAuthTpCd(account.getUsr_auth_tp_cd());
		event.setComUsrRoleConditionVO(conditionVO);
		
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