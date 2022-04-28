/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004HTMLAction.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;
import com.clt.apps.opus.fns.joo.training.joocarriermgmt.vo.JooCarrierVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.esm.clv.carrier 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 CarrierSC로 실행요청<br>
 * - CarrierSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Viet Tran
 * @see CarrierEvent 참조
 * @since J2EE 1.6
 */

public class DOU_TRAINING_0004HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0004HTMLAction 객체를 생성
	 */
	public DOU_TRAINING_0004HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 CarrierEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		DouTraining0004Event event = new DouTraining0004Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setCarrierListVOS((CarrierListVO[])getVOs(request, CarrierListVO .class,""));
		}
		else if(command.isCommand(FormCommand.SEARCH)) {

			CarrierListVO carrierVO = new CarrierListVO();
			carrierVO.setJoCrrCd(JSPUtil.getParameter(request, "jo_crr_cd", ""));
			carrierVO.setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
			carrierVO.setCreDtFm(JSPUtil.getParameter(request, "cre_dt_fm", ""));
			carrierVO.setCreDtTo(JSPUtil.getParameter(request, "cre_dt_to", ""));
			event.setCarrierListVO(carrierVO);
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