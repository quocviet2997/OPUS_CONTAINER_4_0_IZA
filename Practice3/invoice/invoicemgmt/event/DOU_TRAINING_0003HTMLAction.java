/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0003HTMLAction.java
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceDtlVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.SearchTradeVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.esm.clv.invoice 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 InvoiceSC로 실행요청<br>
 * - InvoiceSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Viet Tran
 * @see InvoiceEvent 참조
 * @since J2EE 1.6
 */

public class DOU_TRAINING_0003HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0003HTMLAction 객체를 생성
	 */
	public DOU_TRAINING_0003HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 InvoiceEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		DouTraining0003Event event = new DouTraining0003Event();
		
		if(command.isCommand(FormCommand.MULTI)) {
			event.setInvoiceVOS((InvoiceVO[])getVOs(request, InvoiceVO .class,""));
		}
		else if(command.isCommand(FormCommand.SEARCH01)) {
			InvoiceVO invoiceVO = new InvoiceVO();
			invoiceVO.setJoCrrCd(JSPUtil.getParameter(request, "partner", ""));
			invoiceVO.setRlaneCd(JSPUtil.getParameter(request, "lane", ""));
			invoiceVO.setTrdCd(JSPUtil.getParameter(request, "trade", ""));
			invoiceVO.setCreDtFm(JSPUtil.getParameter(request, "cre_dt_fm", ""));
			invoiceVO.setCreDtTo(JSPUtil.getParameter(request, "cre_dt_to", ""));
			event.setInvoiceVO(invoiceVO);
		}
		else if(command.isCommand(FormCommand.SEARCH02)) {
			InvoiceDtlVO invoiceDtlVO = new InvoiceDtlVO();
			invoiceDtlVO.setJoCrrCd(JSPUtil.getParameter(request, "partner", ""));
			invoiceDtlVO.setRlaneCd(JSPUtil.getParameter(request, "lane", ""));
			invoiceDtlVO.setTrdCd(JSPUtil.getParameter(request, "trade", ""));
			invoiceDtlVO.setCreDtFm(JSPUtil.getParameter(request, "cre_dt_fm", ""));
			invoiceDtlVO.setCreDtTo(JSPUtil.getParameter(request, "cre_dt_to", ""));
			event.setInvoiceDtlVO(invoiceDtlVO);
		}
		else if(command.isCommand(FormCommand.SEARCH03)) {
			InvoiceVO invoiceVO = new InvoiceVO();
			invoiceVO.setJoCrrCd(JSPUtil.getParameter(request, "partner", ""));
			event.setInvoiceVO(invoiceVO);
		}
		else if(command.isCommand(FormCommand.SEARCH04)) {
			SearchTradeVO searchTradeVO = new SearchTradeVO();
			searchTradeVO.setJoCrrCd(JSPUtil.getParameter(request, "partner", ""));
			searchTradeVO.setRlaneCd(JSPUtil.getParameter(request, "lane", ""));
			event.setSearchTradeVO(searchTradeVO);
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