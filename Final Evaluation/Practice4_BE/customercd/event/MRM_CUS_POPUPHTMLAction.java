/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : MRM_CUS_POPUPHTMLAction.java
*@FileTitle : Customer List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.20
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.05.19 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.customercd.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CustomerListVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.fns.joo.training.joocarriermgmt.vo.JooCarrierVO;

/**
 * HTTP Parser<br>
 * - Parsing the Value of the HTML DOM object sent to the server through the com.clt.apps.opus.esm.clv.carrier screen as a Java variable<br>
 * - Parsing information is converted into Event, put in request and executed by CarrierSC<br>
 * - Set EventResponse to request to send execution result from CarrierSC to View (JSP)<br>
 * 
 * @author Viet Tran
 * @see CarrierEvent
 * @since J2EE 1.6
 */

public class MRM_CUS_POPUPHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0004HTMLAction constructor
	 */
	public MRM_CUS_POPUPHTMLAction() {}

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
		MrmCusPopupEvent event = new MrmCusPopupEvent();
		if(command.isCommand(FormCommand.SEARCH)) {
			CustomerListVO customerVO = new CustomerListVO();
			customerVO.setCustCntCd(JSPUtil.getParameter(request, "s_cust_cnt_cd", ""));
			customerVO.setCustSeq(JSPUtil.getParameter(request, "s_cust_seq", ""));
			event.setCustomerListVO(customerVO);
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