/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0001HTMLAction.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.esm.clv.doutraining 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 DouTrainingSC로 실행요청<br>
 * - DouTrainingSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Viet Tran
 * @see DouTrainingEvent 참조
 * @since J2EE 1.6
 */

public class DOU_TRAINING_0001HTMLAction extends HTMLActionSupport {
	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0001HTMLAction 객체를 생성
	 */
	public DOU_TRAINING_0001HTMLAction() {}

	/**
	 * [perform] fire a suitable event base on request command.<br>
	 * 
	 * @param request 	HttpServletRequest 	HttpRequest
	 * @return Event	An object that implements the Event interface
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		//??
    	FormCommand command = FormCommand.fromRequest(request);
    	// define a new variable of DouTraining0001Event to handle VO classes and list VO classes
		DouTraining0001Event event = new DouTraining0001Event();
		
		// if the valuation of command from the request is MULTI, set it in list ErrMsgVO
		// else if the valuation of command from the request is SEARCH, set it in ErrMsgVO
		if(command.isCommand(FormCommand.MULTI)) {
			event.setErrMsgVOS((ErrMsgVO[])getVOs(request, ErrMsgVO .class,""));
		}
		else if(command.isCommand(FormCommand.SEARCH)) {
			// define a new errMsgVO variable contains parameters
			ErrMsgVO errMsgVO  = new ErrMsgVO();
			errMsgVO.setErrMsgCd(JSPUtil.getParameter(request, "msg_cd", ""));
			errMsgVO.setErrMsg(JSPUtil.getParameter(request, "msg", ""));
			// set errMsgVO in ErrMsgVO which is in event
			event.setErrMsgVO(errMsgVO);
		}

		return  event;
	}

	/**
	 * [doEnd] ...<br>
	 * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
	 * 
	 * @param request			HttpServletRequest	HttpRequest
	 * @param eventResponse		EventResponse		An object that implements the EventResponse interface.
	 */
	public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
		// set an attribute eventResponse with the name EventResponse to a servlet request
		// request is the implicit object in JSP and it can be used directly to set an attribute using setAttribute method whereas
		request.setAttribute("EventResponse", eventResponse);
	}

	/**
	 * [doEnd] ...<br>
	 * 
	 * @param request 			HttpServletRequest 	HttpRequest
	 * @param event 			Event				An object that implements the Event interface.
	 */
	public void doEnd(HttpServletRequest request, Event event) {
		// set an attribute event with the name Event to a servlet request
		request.setAttribute("Event", event);
	}
}