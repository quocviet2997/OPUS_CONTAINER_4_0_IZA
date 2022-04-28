/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BCM_FIN_0001HTMLAction.java
*@FileTitle : AP PERIOD
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchApPeriodListVO;
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
 * @author Jung Yoon Tae
 * @see BcmFin0001Event 참조
 * @since J2EE 1.6
 */

public class BCM_FIN_0001HTMLAction extends HTMLActionSupport {
	
	private static final long serialVersionUID = 1L;
	/**
	 * BCM_FIN_0001HTMLAction 객체를 생성
	 */
	public BCM_FIN_0001HTMLAction() {}
	
	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 BcmFin0001Event로 파싱하여 request에 셋팅<br>
	 * @param HttpServletRequest request
	 * @return Event
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
    	BcmFin0001Event event = new BcmFin0001Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setSearchApPeriodListVOS((SearchApPeriodListVO[])getVOs(request, SearchApPeriodListVO.class,""));

			event.setSysDivCd(request.getParameter("s_sys_div_cd"));
			event.setEffYrmon(request.getParameter("s_eff_yrmon"));
			event.setOfcCd(request.getParameter("s_ofc_cd"));
			event.setArApDivCd(request.getParameter("s_ar_ap_div_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH)) {
			event.setSysDivCd(request.getParameter("s_sys_div_cd"));
			event.setEffYrmon(request.getParameter("s_eff_yrmon"));
			event.setOfcCd(request.getParameter("s_ofc_cd"));
			event.setArApDivCd(request.getParameter("s_ar_ap_div_cd"));
			
		} else if(command.isCommand(FormCommand.MULTI01)) {
			event.setEffYrmon(request.getParameter("s_eff_yrmon"));
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
