/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0002HTMLAction.java
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02.codemanagement.event;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtDtlVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.esm.clv.training02 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 Training02SC로 실행요청<br>
 * - Training02SC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Viet Tran
 * @see Training02Event 참조
 * @since J2EE 1.6
 */

public class DOU_TRAINING_0002HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * DOU_TRAINING_0002HTMLAction 객체를 생성
	 */
	public DOU_TRAINING_0002HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 Training02Event로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		DouTraining0002Event event = new DouTraining0002Event();
		
		if(command.isCommand(FormCommand.MULTI01)) {
			event.setCodeMgmtVOS((CodeMgmtVO[])getVOs(request, CodeMgmtVO .class,""));
		}
		else if(command.isCommand(FormCommand.MULTI02)) {			
			CodeMgmtDtlVO[] codeMgmtDtlVOS = (CodeMgmtDtlVO[])getVOs(request, CodeMgmtDtlVO .class,"");
			for(CodeMgmtDtlVO item: codeMgmtDtlVOS){
				item.setIntgCdId(JSPUtil.getParameter(request, "cd_id", ""));
			}
			event.setCodeMgmtDtlVOS(codeMgmtDtlVOS);
		}
		else if(command.isCommand(FormCommand.SEARCH01)) {
			event.setCodeMgmtVO((CodeMgmtVO)getVO(request, CodeMgmtVO .class));
		}
		else if(command.isCommand(FormCommand.SEARCH02)) {			
			CodeMgmtDtlVO codeMgmtDtlVO = (CodeMgmtDtlVO)getVO(request, CodeMgmtDtlVO .class);
			codeMgmtDtlVO.setIntgCdId(JSPUtil.getParameter(request, "cd_id", ""));
			event.setCodeMgmtDtlVO(codeMgmtDtlVO);
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