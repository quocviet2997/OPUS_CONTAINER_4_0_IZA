/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserRoleProgramManagementSC.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.AbstractSysCommonSC;
import com.clt.syscommon.management.opus.role.basic.UserRoleProgramBC;
import com.clt.syscommon.management.opus.role.basic.UserRoleProgramBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys006Event;

/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_006EventResponse,UserRoleProgramDBDAO 참조
 * @since J2EE 1.4
 */
public class UserRoleProgramManagementSC extends AbstractSysCommonSC {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * syscommon 업무 시나리오 선행작업<br>
	 * UserRoleProgram업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account=getSignOnUserAccount();
		} catch (Exception e) {
			log.error("UserRoleProgramManagementSC Error while preprocessing " + e.toString(), e);
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * UserRoleProgram업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("UserRoleProgramManagementSC End");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * syscommon-syscommon 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		//관리자권한체크
		isAdministrator(this.account);
		
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ComSys006Event")) {
//			if (e.getFormCommand().isCommand(FormCommand.ADD)) {
//				eventResponse = addUserRoleProgram(e);
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchUserRoleProgramList(e);
			}
		}
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * UserRoleProgram 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e 이벤트
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchUserRoleProgramList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;
		
		try {
			UserRoleProgramBC command = new UserRoleProgramBCImpl();
			eventResponse = command.searchUserRoleProgramList(e);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}


}