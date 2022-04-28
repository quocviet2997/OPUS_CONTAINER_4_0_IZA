/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MUONSACHHTMLAction.java
*@FileTitle : Muon Sach
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.dou.muonsach.muonsach.vo.MuonSachVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.dou.muonsach 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 MuonSachSC로 실행요청<br>
 * - MuonSachSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Vi Nguyen
 * @see MuonSachEvent 참조
 * @since J2EE 1.6
 */

public class MUONSACHHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * MUONSACHHTMLAction 객체를 생성
	 */
	public MUONSACHHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 MuonSachEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		MuonsachEvent event = new MuonsachEvent();
		

		if(command.isCommand(FormCommand.SEARCH)) {
			event.setMuonSachVO((MuonSachVO)getVO(request, MuonSachVO .class));
			MuonSachVO muonSachVO = new MuonSachVO();
			muonSachVO.setSinhvienId(JSPUtil.getParameter(request, "sinhvien_id", ""));
			event.setMuonSachVO(muonSachVO);
		}

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