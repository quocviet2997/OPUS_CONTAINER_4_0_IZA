/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ScheduleLogHTMLAction.java
*@FileTitle : ScheduleLogHTMLAction
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.29 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.event;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.common.table.ComScheduleLog;

/**
 * HTTP Parser<br>
 * - NIS2010.src.com.clt.syscommon.management.nis2010 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 nis2010SC로 실행요청<br>
 * - nis2010SC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author In Sun Jung
 * @see ScheduleLogEvent , ScheduleLogEventResponse 참조
 * @since J2EE 1.4
 */

public class ScheduleLogHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2968714532337951196L;

	/**
	 * ScheduleLogHTMLAction 객체를 생성
	 */
	public ScheduleLogHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ScheduleLogEvent로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
	/**
         ibSheet 사용시 fromRequestGrid를 사용하는데 
         prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
         String prefix = "" ;  
         COM_USER com_user = COM_USER.fromRequestGrid(request, prefix);
        */ 
    	FormCommand command = FormCommand.fromRequest(request);

		Collection<ComScheduleLog> comschedules = null;
        
		String prefix = "";
		ScheduleLogEvent event = new ScheduleLogEvent();
		if(command.isCommand(FormCommand.MULTI)) {
			comschedules = ComScheduleLog.fromRequestGrid(request, prefix);
		}

		if(command.isCommand(FormCommand.SEARCH)) {
			if(comschedules != null){
				event = new ScheduleLogEvent(null, comschedules); // table value object
			}
			/*
			  Parameter 설정
			*/
			event.setFrom_dt(request.getParameter("dateFrom")+request.getParameter("hourFrom"));
			event.setTo_dt(request.getParameter("dateTo")+request.getParameter("hourTo"));
			event.setSkd_id(request.getParameter("skd_id"));
			event.setSkd_tp_cd(request.getParameter("skd_tp_cd"));
			event.setSts_cd(request.getParameter("sts_cd"));
			event.setPgm_no(request.getParameter("pgm_no"));
			event.setMachine(request.getParameter("machine"));
		}
	
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
