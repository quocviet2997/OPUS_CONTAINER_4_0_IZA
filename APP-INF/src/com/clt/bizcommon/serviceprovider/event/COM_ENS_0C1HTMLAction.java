/*=========================================================
*	Copyright(c) 2006 CyberLogitec
*	@FileName : COM_ENS_0C1HTMLAction.java
*	@FileTitle : ServiceProvider정보조회(공통 Popup)
*	Open Issues :
*	Change history :
*	@LastModifyDate : 2006-08-07
*	@LastModifier : sungseok, choi
*	@LastVersion : 1.0
* 	2006-08-07 sungseok, choi
* 	1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.serviceprovider.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.serviceprovider.vo.SpListVO;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;



/**
 *	HTTP Parser<br>
 *	com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 *	Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 *	BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * 	@author sungseok, choi
 * 	@see ComEns0C1Event , COM_ENS_0C1EventResponse 참조
 * 	@since J2EE 1.4
 */
public class COM_ENS_0C1HTMLAction extends HTMLActionSupport {

    /**
     * @title		: COM_ENS_OC1HTMLAction Obejct Creation<br>
     * @return		: .....................................<br>
     * @author		: sungseok, choi<br>
     * @date		: Add-on 2006.08.07<br>
     * 				: Modify ..........<br>
     */
    public COM_ENS_0C1HTMLAction() {
    }
    /**
     * COM_ENS_0C1HTMLAction 객체를 생성
	 
	 * @param HttpServletRequest request
     * @return Event
     * @exception HTMLActionException
	 */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
   	
	int iPage           	= JSPUtil.getParameterAsInt(request, "iPage", 1);  
	
	FormCommand f_cmd 		= FormCommand.fromRequest(request);
	
	ComEns0C1Event event = new ComEns0C1Event();
	
	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
	
	event = new ComEns0C1Event(iPage);
    
	event.setSpListVO((SpListVO)getVO(request, SpListVO .class));
	
    event.setCommandClassName("BizCommonSC");
    event.setFormCommand(f_cmd);
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
