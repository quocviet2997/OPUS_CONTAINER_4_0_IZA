/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RDWEBSAMPLEHTMLAction.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.table.ComUpldFileVO;

/**
 * HTTP Parser<br>
 * - com.clt.sample.rdweb 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 RdWebSC로 실행요청<br>
 * - RdWebSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author 
 * @see RdWebEvent 참조
 * @since J2EE 1.4
 */

public class RDWEBSAMPLEHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * RDWEBSAMPLEHTMLAction 객체를 생성
	 */
	public RDWEBSAMPLEHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 RdWebEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		RdwebsampleEvent event = new RdwebsampleEvent();
		

//		if(command.isCommand(FormCommand.SEARCH)) {
			event.setComUpldFileVO((ComUpldFileVO)getVO(request, ComUpldFileVO .class));
//		}

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