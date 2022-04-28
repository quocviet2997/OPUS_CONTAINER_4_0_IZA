/*=========================================================
*Copyright(c) 2007 CyberLogitec
*@FileName : NotifiedSubscriberHTMLAction.java
*@FileTitle : Notified Subscriber Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-01
*@LastModifier : JeongSeon An
*@LastVersion : 1.0
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.staff.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.hanjin.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BIZCOMMONSC로 실행요청<br>
 * - BIZCOMMONSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns092Event , COM_ENS_092EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_092HTMLAction extends HTMLActionSupport {

	/**
	 * NotifiedSubscriberHTMLAction 객체를 생성
	 */
	public COM_ENS_092HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 COM_ENS_092Event로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		// 메인화면에서 Country 팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우
    	String ofc_cd = JSPUtil.getParameter(request, "ofc_cd".trim(), "");
    	String user_cd = JSPUtil.getParameter(request, "usr_cd".trim(), "");
    	//String user_nm = JSPUtil.getParameter(request, "user_nm".trim(), "");
    	String user_nm = JSPUtil.getParameter(request, "usr_nm".trim());
    	
    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	ComEns092Event event = new ComEns092Event(ofc_cd, user_cd, user_nm, iPage);
                 
        event.setCommandClassName("BizCommonSC");
        event.setFormCommand(f_cmd);
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