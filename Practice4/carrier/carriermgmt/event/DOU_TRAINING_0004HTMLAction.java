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
	 * Parsing the HTML DOM object's Value as a Java variable<br>
	 * Parsing the information of HttpRequst as CarrierEvent and setting it in the request<br>
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event An object that implements the Event interface.
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
	 * Saving the value of the task scenario execution result in the attribute of HttpRequest<br>
	 * Setting the ResultSet that transmits the execution result from ServiceCommand to View (JSP) in the request<br>
	 *
	 * @param request HttpServletRequest HttpRequest
	 * @param eventResponse An object that implements the EventResponse interface.
	 */
	public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
		request.setAttribute("EventResponse", eventResponse);
	}

	/**
	 * Save HttpRequest parsing result value in HttpRequest attribute<br>
	 * HttpRequest parsing result value set in request<br>
	 *
	 * @param request HttpServletRequest HttpRequest
	 * @param event An object that implements the Event interface.
	 */
	public void doEnd(HttpServletRequest request, Event event) {
		request.setAttribute("Event", event);
	}
}