/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : FIN_COM_HTMLAction.java
*@FileTitle : Financial Common
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.fincommon.fincommon.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - OPUS_CNTR.APP-INF.src.com.clt.apps.opus.bcm.fin.fincommon.fincommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 FINCommonSC로 실행요청<br>
 * - FINCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Seung Joon Lee
 * @see FinComEvent 참조
 * @since J2EE 1.6
 */
public class FIN_COM_HTMLAction  extends HTMLActionSupport{
	private static final long serialVersionUID = 1L;
	/**
	 * FIN_COM_HTMLAction 객체를 생성
	 */
	public FIN_COM_HTMLAction() {}
	
	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 FinComEvent로 파싱하여 request에 셋팅<br>
	 * @param HttpServletRequest request
	 * @return Event
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		FormCommand command = FormCommand.fromRequest(request);
		
		FinComEvent event = new FinComEvent();
		
		if(command.isCommand(FormCommand.SEARCH01)) {
			event.setSlanCd(request.getParameter("slan_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH02)) {
			event.setScontiCd(request.getParameter("sconti_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH03)) {
			event.setRlaneCd(request.getParameter("rlane_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH04)) {
			event.setVslCd(request.getParameter("vsl_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH05)) {
			event.setRevPortCd(request.getParameter("rev_port_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH06)) {
			event.setCurrCd(request.getParameter("curr_cd"));
			
		} else if (command.isCommand(FormCommand.SEARCH07)) {
			event.setComCdId(request.getParameter("cd_id"));
			event.setComCode(request.getParameter("com_code"));
			event.setComText(request.getParameter("com_text"));
			
		} else if (command.isCommand(FormCommand.SEARCH08)) {
			event.setVvd(request.getParameter("s_vvd"));
			
		} else if (command.isCommand(FormCommand.SEARCH09)) {
			event.setCheckInvoiceNoVO((CheckInvoiceNoVO)getVO(request, CheckInvoiceNoVO.class));
		}
		
		request.setAttribute("Event", event);
		
		return event;
	}
	

	/**
	 * HttpRequest의 attribute에 업무시나리오 수행결과 값 저장<br>
	 * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
	 * 
	 * @param HttpServletRequest request
	 * @param EventResponse eventResponse
	 */
	public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
		request.setAttribute("EventResponse", eventResponse);
	}

	/**
	 * HttpRequest의 attribute에 HttpRequest 파싱 수행결과 값 저장<br>
	 * HttpRequest 파싱 수행결과 값 request에 셋팅<br>
	 * 
	 * @param HttpServletRequest request
	 * @param Event event
	 */
	public void doEnd(HttpServletRequest request, Event event) {
		request.setAttribute("Event", event);
	}	
}
