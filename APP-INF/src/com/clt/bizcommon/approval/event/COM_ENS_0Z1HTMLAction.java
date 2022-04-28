/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0Z1HTMLAction.java
*@FileTitle : CSR amount limitation setup
*Open Issues :
*Change history :
*@LastModifyDate : 2017-10-11
*@LastModifier : Yo-Na Ha
*@LastVersion : 1.0
* 2017-10-11 Yo-Na Ha
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - COM_ENS_0Z1 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 FLTCommonSC로 실행요청<br>
 * - FLTCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author YoNa Ha
 * @see ComEns0Z1Event 참조
 * @since J2EE 1.4
 */

public class COM_ENS_0Z1HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * COM_ENS_0Z1HTMLAction 객체를 생성
	 */
	public COM_ENS_0Z1HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ComEns0Z1Event로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		ComEns0Z1Event event = new ComEns0Z1Event();
		
		if(command.isCommand(FormCommand.SEARCH)) {
			event.setRhqOfcCd(request.getParameter("rhq_ofc_cd"));
			event.setOfcCdList(request.getParameter("ofc_cd"));
			event.setSubSysCd(request.getParameter("sub_sys_cd"));
		} else if(command.isCommand(FormCommand.MULTI)) {
			event.setApprovalCsrAmountLimitVOS((ApprovalCsrAmountLimitVO[])getVOs(request, ApprovalCsrAmountLimitVO.class, ""));
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