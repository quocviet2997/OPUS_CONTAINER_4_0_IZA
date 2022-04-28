/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_011HTMLAction.java
*@FileTitle : 프로그램별 역할매핑 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-10
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-11-10 Kildong_hong
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.common.table.ComPgmRoleVO;



/**
 * HTTP Parser<br>
 * - com.clt.syscommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 RoleMappingManagementSCSC로 실행요청<br>
 * - RoleMappingManagementSCSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Kildong_hong
 * @see ComSys011Event , UI_COM_SYS_011EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_SYS_011HTMLAction extends HTMLActionSupport {

	/**
	 * UI_COM_SYS_011HTMLAction 객체를 생성
	 */
	public COM_SYS_011HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UI_COM_SYS_011Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
		String pgm_no = JSPUtil.getParameter(request, "pgm_no".trim(), "");
		String pgm_nm = JSPUtil.getParameter(request, "pgm_nm".trim(), "");

		ComPgmRoleVO[] comPgmRoles = null;

		if(command.isCommand(FormCommand.MULTI)) {
			comPgmRoles = (ComPgmRoleVO[])getVOs(request, ComPgmRoleVO.class);
			for(int i=1;i<comPgmRoles.length;i++){
				comPgmRoles[i].setPgmNo(comPgmRoles[0].getPgmNo());
			}
			log.error("========command is : "+command.getCommand()+" and counts is : "+comPgmRoles.length);
		}
		ComSys011Event event = new ComSys011Event();
        if(comPgmRoles != null){
        	event.setComPgmRoleVOS(comPgmRoles);
        }
        event.setProg_id(pgm_no);
        event.setProg_nm(pgm_nm);
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