package com.clt.sample.lang.scriptmultylangaccess.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.view.signon.web.SignOnFilter;
import com.clt.sample.code.event.CodeEvent;
import com.clt.sample.lang.multylangaccess.event.MultyLangEvent;
import com.clt.syscommon.common.table.ComUserVO;

public class SCRIPTMULTYLANGACCESSHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SCRIPTMULTYLANGACCESSHTMLAction() {}
	
	@Override
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		String lang_tp_cd = (String) request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE);
		
//		String msgCdStr = "";
//		if("EN".equals(lang_tp_cd)){
//			msgCdStr = "JUN00001";
//		}else if("KR".equals(lang_tp_cd)){
//			msgCdStr = "JUN00002";
//		}else if("CH".equals(lang_tp_cd)){
//			msgCdStr = "JUN00003";
//		}else{
//			msgCdStr = "JUN00001";
//		}
//		new ErrorHandler(msgCdStr);
		CodeEvent event = new CodeEvent();
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
