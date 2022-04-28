/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : COM_ENS_011HTMLAction.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author sungseok, choi
 * @see ComEns011Event , COM_ENS_011EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_012HTMLAction extends HTMLActionSupport {
    /**
     * Add Title	: COM_ENS_011HTMLAction Object Creation 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     * @return
     */
    public COM_ENS_012HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_011Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     * @author sungseok, choi
     * @date 2006.08.03
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
       	
 	
    	FormCommand command = FormCommand.fromRequest(request);
    	ComEns012Event event = new ComEns012Event();
    	
		if(command.isCommand(FormCommand.SEARCH)) {
			event.setSearchCmdtCdRepCmdtCdVO((SearchCmdtCdRepCmdtCdVO)getVO(request, SearchCmdtCdRepCmdtCdVO .class));
		}
		
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