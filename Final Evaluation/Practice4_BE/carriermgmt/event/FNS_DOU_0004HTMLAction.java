/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004HTMLAction.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : Viet Tran
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
 * - Parsing the Value of the HTML DOM object sent to the server through the com.clt.apps.opus.esm.clv.carrier screen as a Java variable<br>
 * - Parsing information is converted into Event, put in request and executed by CarrierSC<br>
 * - Set EventResponse to request to send execution result from CarrierSC to View (JSP)<br>
 * @author Viet Tran
 * @see CarrierEvent
 * @since J2EE 1.6
 */

public class FNS_DOU_0004HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0004HTMLAction constructor
	 */
	public FNS_DOU_0004HTMLAction() {}

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
		FnsDou0004Event event = new FnsDou0004Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setCarrierListVOS((CarrierListVO[])getVOs(request, CarrierListVO .class,""));
		}
		else if(command.isCommand(FormCommand.SEARCH)) {
			CarrierListVO carrierVO = new CarrierListVO();
			carrierVO.setJoCrrCd(JSPUtil.getParameter(request, "s_jo_crr_cd", ""));
			carrierVO.setVndrSeq(JSPUtil.getParameter(request, "s_vndr_seq", ""));
			carrierVO.setCreDtFm(JSPUtil.getParameter(request, "s_cre_dt_fm", ""));
			carrierVO.setCreDtTo(JSPUtil.getParameter(request, "s_cre_dt_to", ""));
			event.setCarrierListVO(carrierVO);
		}
		else if(command.isCommand(FormCommand.COMMAND01)) {//check duplicate data
			event.setCarrierListVO((CarrierListVO)getVO(request, CarrierListVO .class,""));
		}
		else if(command.isCommand(FormCommand.COMMAND02)
			  ||command.isCommand(FormCommand.COMMAND03)
			  ||command.isCommand(FormCommand.COMMAND04)
			  ||command.isCommand(FormCommand.COMMAND05)){
			event.setCarrierListVO((CarrierListVO)getVO(request, CarrierListVO .class,""));
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