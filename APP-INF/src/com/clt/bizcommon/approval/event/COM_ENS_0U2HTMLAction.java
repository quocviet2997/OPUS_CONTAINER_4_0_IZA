/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0U2HTMLAction.java
*@FileTitle : Approval Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2017-07-03
*@LastModifier : Yo-Na Ha
*@LastVersion : 1.0
* 2017-07-03 Yo-Na Ha
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - COM_ENS_0U2 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 FLTCommonSC로 실행요청<br>
 * - ContractSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author YoNa Ha
 * @see ComEns0U2Event 참조
 * @since J2EE 1.4
 */

public class COM_ENS_0U2HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * ESM_FMS_0035HTMLAction 객체를 생성
	 */
	public COM_ENS_0U2HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ComEns0U2Event로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		ComEns0U2Event event = new ComEns0U2Event();
		
		if(command.isCommand(FormCommand.SEARCH)) {
	    	event.setApprovalStaffVO((ApprovalStaffVO)getVO(request, ApprovalStaffVO.class));
	    	String kind = request.getParameter("rdo_ofc_tp");
	    	if("C".endsWith(kind)) {
	    		event.setCOfcCd(request.getParameter("c_ofc_cd"));
	    	} else {
	    		event.setAOfcCd(request.getParameter("a_ofc_cd"));
	    	}
		} else if(command.isCommand(FormCommand.SEARCH02)) {
			event.setArHdQtrOfcCd(request.getParameter("v_rhq_ofc_cd"));
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