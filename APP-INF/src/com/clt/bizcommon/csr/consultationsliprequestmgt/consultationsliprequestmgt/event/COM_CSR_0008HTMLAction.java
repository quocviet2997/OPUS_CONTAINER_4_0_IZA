/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : COM_CSR_0008HTMLAction.java
*@FileTitle : CSR Interface Status
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.16
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.16 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;

/**
 * HTTP Parser<br>
 * - com.clt.bizcommon.csr.consultationsliprequestmgt 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 ConsultationSlipRequestMgtSC로 실행요청<br>
 * - ConsultationSlipRequestMgtSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author HAM DAE SUNG
 * @see ConsultationSlipRequestMgtEvent 참조
 * @since J2EE 1.6
 */

public class COM_CSR_0008HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * COM_CSR_0008HTMLAction 객체를 생성
	 */
	public COM_CSR_0008HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ConsultationSlipRequestMgtEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		ComCsr0008Event event = new ComCsr0008Event();
		

		if(command.isCommand(FormCommand.SEARCHLIST) || command.isCommand(FormCommand.SEARCH01) || command.isCommand(FormCommand.MULTI)) {
			event.setIfCsrListInputVO((IfCsrListInputVO)getVO(request, IfCsrListInputVO .class));
		} else if(command.isCommand(FormCommand.SEARCH02)){
			/* 
	        ibSheet 사용시 fromRequestGrid를 사용하는데 
	        prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
	        String prefix = "" ;  
	        ApPayInvVO apPayInvVO = ApPayInvVO.fromRequestGrid(request, prefix);
	       */
			PayInvVO payInvVO =PayInvVO.fromRequest(request);
			Collection payInvs = null;
			payInvs = PayInvVO.fromRequestGrid(request, "");
			CsrParmVO csrParmVO = CsrParmVO.fromRequest(request, "");
			
			int codeLength = 0;
			
			String[] chks = request.getParameterValues("chk");
			for (int i=0; chks!=null && i<chks.length; i++){
				log.debug("\n - chks["+i+"]:"+chks[i]);
			}
			log.debug("\n - chks.length:"+(chks!=null?chks.length:0)+"\n------------------------------------------------------------\n");
			
			codeLength = request.getParameterValues("ibflag")!=null?request.getParameterValues("ibflag").length:0;
			payInvs	= PayInvVO.fromRequest(request,codeLength);
	       
			 event = new ComCsr0008Event(
	               payInvVO,
	               payInvs,
	               csrParmVO); // table value object
			
			request.setAttribute("Event", event);
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