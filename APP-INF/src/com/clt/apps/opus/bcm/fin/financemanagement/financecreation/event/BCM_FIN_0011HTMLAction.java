/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : BCM_FIN_0011HTMLAction.java
*@FileTitle : Revenue Month per Common & Charter VVD
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.RevenueMonthVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArMasterRevenueVvdListVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - OPUS_CNTR.APP-INF.src.com.clt.apps.opus.bcm.fin.financemanagement.financecreation 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 FinanceManagementSC로 실행요청<br>
 * - FinanceManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Seung Joon Lee
 * @see BcmFin0011Event 참조
 * @since J2EE 1.6
 */
public class BCM_FIN_0011HTMLAction  extends HTMLActionSupport{
	private static final long serialVersionUID = 1L;
	/**
	 * BCM_FIN_0011HTMLAction 객체를 생성
	 */
	public BCM_FIN_0011HTMLAction(){}
	
	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 BcmFin0007Event로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface 를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	FormCommand command = FormCommand.fromRequest(request);
    	
    	BcmFin0011Event event = new BcmFin0011Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setRevenueMonthVvdVOs((RevenueMonthVvdVO[])getVOs(request, RevenueMonthVvdVO.class,""));
			event.setTarYrmon(request.getParameter("tar_yrmon"));
			
		}else if(command.isCommand(FormCommand.SEARCH)) {
			event.setTarYrmon(request.getParameter("tar_yrmon"));
		}
		
		request.setAttribute("Event", event);
		
		return event;
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
