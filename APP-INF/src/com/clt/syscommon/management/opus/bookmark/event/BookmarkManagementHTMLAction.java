/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkmanagementHTMLAction.java
*@FileTitle : BookMark Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.09
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.09 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.CommonWebKeys;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComBookmarkVO;


/**
 * HTTP Parser<br>
 * - NIS2010.src.com.clt.syscommon.management.nis2010.bookmark 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BookmarkSC로 실행요청<br>
 * - BookmarkSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Jung_InSun
 * @see BookmarkManagementEvent  참조
 * @since J2EE 1.4
 */
public class BookmarkManagementHTMLAction extends HTMLActionSupport {

	/**
	 * BookmarkmanagementHTMLAction 객체를 생성
	 */
	public BookmarkManagementHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 BookmarkmanagementEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		/**
         ibSheet 사용시 fromRequestGrid를 사용하는데 
         prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
        */ 
    	FormCommand command = FormCommand.fromRequest(request);

    	ComBookmarkVO[] combookmarks = null;
        
		BookmarkManagementEvent event = new BookmarkManagementEvent();
	
		if(command.isCommand(FormCommand.MULTI)  || command.isCommand(FormCommand.ADD) || command.isCommand(FormCommand.REMOVE)) {
			combookmarks = (ComBookmarkVO[])getVOs(request, ComBookmarkVO.class,"");

			if(combookmarks!=null){
				if(combookmarks.length>0){
					int cnt = combookmarks.length;
					SignOnUserAccount account = (SignOnUserAccount)request.getSession().getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
					for(int i=0; i < cnt; i++){
						combookmarks[i].setUsrId(account.getUsr_id());
						combookmarks[i].setCreUsrId(account.getUsr_id());
					}
				}
			}
			event.setComBookmarkS(combookmarks);
		} else if (command.isCommand(FormCommand.SEARCH01)) {
			event.setAttribute("sel_pgm_no", request.getParameter("sel_pgm_no"));
			event.setAttribute("sel_dp_nm", request.getParameter("sel_dp_nm"));
			event.setAttribute("sel_prnt_pgm_no", request.getParameter("sel_prnt_pgm_no"));
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

}
