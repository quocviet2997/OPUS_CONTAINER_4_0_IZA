/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SINHVIENHTMLAction.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.khoahoc.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.dou.sinhvien.sinhvien.vo.SinhVienVO;
import com.clt.apps.opus.fns.joo.training.joocarriermgmt.vo.JooCarrierVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.dou.sinhvien 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 SinhVienSC로 실행요청<br>
 * - SinhVienSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Vi Nguyen
 * @see KhoaHocEvent 참조
 * @since J2EE 1.6
 */

public class KHOAHOCHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * SINHVIENHTMLAction 객체를 생성
	 */
	public KHOAHOCHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 SinhVienEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
    	KhoaHocEvent event = new KhoaHocEvent();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setSinhVienVOS((SinhVienVO[])getVOs(request, SinhVienVO .class,""));
		}
		else if(command.isCommand(FormCommand.SEARCH)) {
			SinhVienVO sinhVienVO = new SinhVienVO();
			sinhVienVO.setKhoahoc(JSPUtil.getParameter(request, "s_khoahoc", ""));
			event.setSinhVienVO(sinhVienVO);
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