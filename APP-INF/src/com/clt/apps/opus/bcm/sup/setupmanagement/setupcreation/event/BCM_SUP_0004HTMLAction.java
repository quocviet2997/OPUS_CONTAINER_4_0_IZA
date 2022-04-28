/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BCM_SUP_0004HTMLAction.java
*@FileTitle : EDI CARGO STANDARD STATUS
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCargoStandardStatusListVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - OPUS_CNTR.APP-INF.src.com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 SetupManagementSC로 실행요청<br>
 * - SetupManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Jung Yoon Tae
 * @see BcmSup0004Event 참조
 * @since J2EE 1.6
 */

public class BCM_SUP_0004HTMLAction extends HTMLActionSupport {
	
	private static final long serialVersionUID = 1L;
	/**
	 * BCM_SUP_0004HTMLAction 객체를 생성
	 */
	public BCM_SUP_0004HTMLAction() {}
	
	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 TimeCharterInOutAccountingEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface 를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
    	BcmSup0004Event event = new BcmSup0004Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setSearchCargoStandardStatusListVOS((SearchCargoStandardStatusListVO[])getVOs(request, SearchCargoStandardStatusListVO.class,""));

			event.setStndStsCd(request.getParameter("s_stnd_sts_cd"));
			event.setCoDivCd(request.getParameter("s_co_div_cd"));
			
		} else if(command.isCommand(FormCommand.SEARCH)) {
			event.setStndStsCd(request.getParameter("s_stnd_sts_cd"));
			event.setCoDivCd(request.getParameter("s_co_div_cd"));
			
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