/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0T1HTMLAction.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BIZCOMMONSC로 실행요청<br>
 * - BIZCOMMONSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0T1Event , COM_ENS_0T1EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_0T1HTMLAction extends HTMLActionSupport {

	/**
	 * COM_ENS_0T1HTMLAction 객체를 생성
	 */
	public COM_ENS_0T1HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 COM_ENS_0T1Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		FormCommand command = FormCommand.fromRequest(request);
		ComEns0T1Event event = new ComEns0T1Event();
		if(command.isCommand(FormCommand.SEARCH04)) {
			ApprovalStaffVO staff = new ApprovalStaffVO();
			staff.setOfcCd(request.getParameter("ofc_cd"));
			event.setApprovalStaffVO(staff);
		} else {
    	event.setApprovalStaffVO((ApprovalStaffVO)getVO(request, ApprovalStaffVO.class));
    	event.setApprovalCsrVO((ApprovalCsrVO)getVO(request, ApprovalCsrVO.class));
    	event.setApprovalRouteVOS((ApprovalRouteVO[])getVOs(request, ApprovalRouteVO.class, ""));
		}
        event.setCommandClassName("BizCommonSC");
        event.setFormCommand(command);
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