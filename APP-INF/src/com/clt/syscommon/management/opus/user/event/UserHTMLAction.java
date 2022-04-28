/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserHTMLAction.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.management.opus.user.vo.ComUserVO;
import com.clt.syscommon.management.opus.user.vo.ComUsrPgmMtchVO;

/**
 * HTTP Parser<br>  Target
 * - NIS2010.APP-INF.src.com.clt.syscommon.nis2010.management.usermanagement 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 UserManagementSC로 실행요청<br>
 * - UserManagementSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author KyungBum Kim
 * @see UserManagementEvent 참조
 * @since J2EE 1.4
 */

public class UserHTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * UserHTMLAction 객체를 생성
	 */
	public UserHTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 UserManagementEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		
		/**
         ibSheet 사용시 fromRequestGrid를 사용하는데 
         prefix는 주로 멀티 Sheet 처리시에 사용하게 된다. (  sheet ID 형태의 prefix 구분자 ) 
         String prefix = "" ;  
         COM_USER com_user = COM_USER.fromRequestGrid(request, prefix);
        */ 
    	FormCommand command = FormCommand.fromRequest(request);

		ComUserVO[] comuservos = null;

		ComUserVO comuservo = new ComUserVO();
        
		ComUsrPgmMtchVO[] comUsrPgmMtchVOs = null;
		
		String prefix = "";
		UserManagementEvent event = new UserManagementEvent();
		event.setAdminPage(JSPUtil.getParameter(request, "admin_page",""));
			 
		
		if(command.isCommand(FormCommand.MULTI)) {
			comuservos = comuservo.fromRequestGrid(request,prefix);
			event.setComuservos(comuservos);
		}else if(command.isCommand(FormCommand.MULTI01)) {
			comUsrPgmMtchVOs = (ComUsrPgmMtchVO[])getVOs(request, ComUsrPgmMtchVO.class);
			
			int cnt= comUsrPgmMtchVOs.length;
			String usrId = JSPUtil.getParameter(request, "usr_id", "");
			for(int i=0;i < cnt; i++){
				String checkbox = comUsrPgmMtchVOs[i].getCheckbox();
				String roleFlg = comUsrPgmMtchVOs[i].getRoleFlg();
				String addFlg = comUsrPgmMtchVOs[i].getAddFlg();
				String userFlg = comUsrPgmMtchVOs[i].getUserFlg();
				if ( checkbox.equals("1") ) {
					if ( roleFlg.equals("0") ) {
						comUsrPgmMtchVOs[i].setIbflag("I");
						comUsrPgmMtchVOs[i].setAddFlg("Y");
					} else {
						if ( userFlg.equals("1") && addFlg.equals("N") ) {
							comUsrPgmMtchVOs[i].setIbflag("D");
						}
					}
				} else {
					if ( roleFlg.equals("1") ) {
						comUsrPgmMtchVOs[i].setIbflag("I");
						comUsrPgmMtchVOs[i].setAddFlg("N");
					} else {
						if ( userFlg.equals("1") && addFlg.equals("Y") ) {
							comUsrPgmMtchVOs[i].setIbflag("D");
						}
					}
				}
				comUsrPgmMtchVOs[i].setUsrId(usrId);
			}
			
			event.setComUsrPgmMtchVOs(comUsrPgmMtchVOs);
		}else if(command.isCommand(FormCommand.SEARCH01)) {
			event.setVO("rhq", JSPUtil.getParameter(request, "rhq", ""));
		}else if(command.isCommand(FormCommand.SEARCH03)) {
			comuservo.setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
			comuservo.setUsrNm(JSPUtil.getParameter(request, "usr_nm", ""));
			comuservo.setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
			event.setVO("pgm_no", JSPUtil.getParameter(request, "pgm_no_form", ""));
			event.setComuservo(comuservo);
		}else if(command.isCommand(FormCommand.SEARCH04)) {
			comuservo.setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
			event.setComuservo(comuservo);
		}else if(command.isCommand(FormCommand.SEARCH05)) {
			comuservo.setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
			event.setComuservo(comuservo);
			
		// add 2014.11.03.
		}else if(command.isCommand(FormCommand.COMMAND01)) {
			
		comuservo.setIbflag("U");	
		comuservo.setUsrId(JSPUtil.getParameter(request, "user_id", ""));
		comuservo.setUsrPwd(JSPUtil.getParameter(request, "old_pwd", ""));
		comuservo.setUsrNewPwd(JSPUtil.getParameter(request, "new_pwd_1", ""));
		
		comuservos = new ComUserVO[1];		
		comuservos[0] =comuservo;
		event.setComuservos(comuservos);	
			
		}else {
			comuservo.setUsrId(JSPUtil.getParameter(request, "s_usr_id", ""));
			comuservo.setUsrNm(JSPUtil.getParameter(request, "s_usr_nm", ""));
			comuservo.setOfcCd(JSPUtil.getParameter(request, "s_ofc_cd", ""));
			comuservo.setUseFlg(JSPUtil.getParameter(request, "s_use_flg", ""));
			comuservo.setCreUsrId(JSPUtil.getParameter(request, "s_id_div", ""));
			comuservo.setUsrAuthTpCd(JSPUtil.getParameter(request, "s_usr_auth_tp_cd", ""));
			event.setComuservo(comuservo);
			event.setVO("rhq", JSPUtil.getParameter(request, "rhq", ""));
			event.setVO("arOfcCd", JSPUtil.getParameter(request, "arOfcCd", ""));
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