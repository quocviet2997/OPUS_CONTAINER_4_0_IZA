/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FTP_SENDHTMLAction.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.CommonWebKeys;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComFtpSndInfoVO;

/**
 * HTTP Parser<br>
 * - com.clt.sample.ftp 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 FtpSC로 실행요청<br>
 * - FtpSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Jeong-Hoon, Kim
 * @see FtpEvent 참조
 * @since J2EE 1.6
 */

public class FTP_SENDHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * FTP_SENDHTMLAction 객체를 생성
	 */
	public FTP_SENDHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 FtpEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
    	FormCommand command = FormCommand.fromRequest(request);
		FtpSendEvent event = new FtpSendEvent();
		

		if(command.isCommand(FormCommand.SEARCH)) {
			event.setComFtpSndInfoVO((ComFtpSndInfoVO)getVO(request, ComFtpSndInfoVO .class));
		} else if(command.isCommand(FormCommand.COMMAND01)){
			
			ComFtpSndInfoVO comFtpSndInfoVO = new ComFtpSndInfoVO();
			SignOnUserAccount account = (SignOnUserAccount)request.getSession().getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);			
			comFtpSndInfoVO.setCreUsrId(account.getUsr_id());
			comFtpSndInfoVO.setFtpDirCtnt(request.getParameter("FtpDirCtnt"));
			comFtpSndInfoVO.setFtpFilePathUrlCtnt(request.getParameter("FtpFilePathUrlCtnt"));
			comFtpSndInfoVO.setFtpSvrIp(request.getParameter("FtpSvrIp"));
			comFtpSndInfoVO.setFtpUsrId(request.getParameter("FtpUsrId"));
			comFtpSndInfoVO.setFtpUsrPwd(request.getParameter("FtpUsrPwd"));
			comFtpSndInfoVO.setSubSysCd(request.getParameter("SubSysCd"));
			
			event.setComFtpSndInfoVO(comFtpSndInfoVO);
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