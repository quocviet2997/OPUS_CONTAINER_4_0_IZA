/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MessageHTMLAction.java
*@FileTitle : Message
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.02 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.common.table.ComMsgRcvVO;
import com.clt.syscommon.common.table.ComMsgSndVO;

/**
 * HTTP Parser<br>
 * - NIS2010.src.com.clt.syscommon.management.nis2010 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 MessageSC로 실행요청<br>
 * - MessageSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Jung_InSun
 * @see MessageEvent , MessageEventResponse 참조
 * @since J2EE 1.4
 */

public class MessageHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = -6122299398559309665L;

	/**
	 * MessageHTMLAction 객체를 생성
	 */
	public MessageHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보 MessageEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {

    	FormCommand command = FormCommand.fromRequest(request);

		MessageEvent event = new MessageEvent();
		event.setRcvrId(request.getParameter("rcvrId"));
		event.setRcvrNm(request.getParameter("rcvrNm"));
		event.setMsgCtnt(request.getParameter("msgCtnt"));
		
		if(command.isCommand(FormCommand.SEARCH)) {
			;
		} else if(command.isCommand(FormCommand.ADD)) {
			event.setComMsgSnd((ComMsgSndVO)getVO(request, ComMsgSndVO.class));
			event.setComMsgRcv((ComMsgRcvVO)getVO(request, ComMsgRcvVO.class));
		}  else if(command.isCommand(FormCommand.MODIFY)) {
			event.setDiv(request.getParameter("div"));
			event.setDeltFlg(request.getParameter("deltFlg"));
			event.setKepFlg(request.getParameter("kepFlg"));
			event.setRcvDt(request.getParameter("rcvDt"));
			event.setMsgId(request.getParameter("msgId"));
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
