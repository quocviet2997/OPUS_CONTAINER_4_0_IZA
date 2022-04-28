/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleManagementSC.java
*@FileTitle : 역할관리
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
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.AbstractSysCommonSC;
import com.clt.syscommon.management.opus.role.basic.RoleBC;
import com.clt.syscommon.management.opus.role.basic.RoleBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys007Event;
import com.clt.syscommon.management.opus.role.vo.SearchComUsrRoleVO;

/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_007EventResponse,RoleDBDAO 참조
 * @since J2EE 1.4
 */
public class RoleManagementSC extends AbstractSysCommonSC {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * syscommon 업무 시나리오 선행작업<br>
	 * Role업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account=getSignOnUserAccount();
		} catch (Exception e) {
			log.error("RoleManagementSC Error while preprocessing " + e.toString(), e);
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * Role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("RoleManagementSC End");
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
		EventResponse eventResponse = new GeneralEventResponse();

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ComSys007Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				SearchComUsrRoleVO[]  searchComUsrRoleVOs = searchRoleList(e);
				eventResponse.setRsVoArray(searchComUsrRoleVOs);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				multiRole(e);
			} else {
				eventResponse = null;
			}
		} else if (e.getEventName().equalsIgnoreCase("ComSys014Event")) {	//Search Upper role
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				SearchComUsrRoleVO[]  searchComUsrRoleVOs = searchUpperRoleList();
				eventResponse.setRsVoArray(searchComUsrRoleVOs);
			} else {
				eventResponse = null;
			}
		}
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e 이벤트
	 * @return response EventResponse
	 * @exception EventException
	 */
	private SearchComUsrRoleVO[] searchRoleList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		SearchComUsrRoleVO[]  searchComUsrRoleVOs= null;
		try {
			RoleBC command = new RoleBCImpl();
			ComSys007Event event  = (ComSys007Event)e;
			searchComUsrRoleVOs= command.searchRoleList(event.getComUsrRoleConditionVO(),account);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return searchComUsrRoleVOs;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private EventResponse searchRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event = (UI_COM_SYS_007Event)e;
//		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
//		EventResponse eventResponse = null;
//		
//		try {
//			RoleBC command = new RoleBCImpl();
//			eventResponse = command.searchRole(event);
//		} catch (EventException de) {
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//		return eventResponse;
//	}

	/**
	 * 추가 이벤트 처리<br>
	 * Role의 event에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private void addRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event = (UI_COM_SYS_007Event)e;
//
//		try {
//			begin();
//			RoleBC command = new RoleBCImpl();
//			command.addRole(event);
//			commit();
//		} catch (EventException de) {
//			rollback();
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 수정 이벤트 처리<br>
	 * Role의 event에 대한 수정 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private void modifyRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event = (UI_COM_SYS_007Event)e;
//
//		try {
//			begin();
//			RoleBC command = new RoleBCImpl();
//			command.modifyRole(event);
//			commit();
//		} catch (EventException de) {
//			rollback();
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 삭제 이벤트 처리<br>
	 * Role의 event에 대한 삭제 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private void removeRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event = (UI_COM_SYS_007Event)e;
//
//		try {
//			begin();
//			RoleBC command = new RoleBCImpl();
//			command.removeRole(event);
//			commit();
//		} catch (EventException de) {
//			rollback();
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * Role의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @exception EventException
	 */
	public void multiRole(Event e) throws EventException {
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		//EventResponse eventResponse = null;

		try {
			begin();
			RoleBC command = new RoleBCImpl();
			command.multiRole(e);
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
//		return this.searchRoleList(e);
	}


	/**
	 * 조회 이벤트 처리<br>
	 * 부모Role 조회팝업 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return SearchComUsrRoleVO[]
	 * @exception EventException
	 */
	private SearchComUsrRoleVO[]  searchUpperRoleList() throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		SearchComUsrRoleVO[]  searchComUsrRoleVOs= null;
		try {
			RoleBC command = new RoleBCImpl();
			searchComUsrRoleVOs = command.searchUpperRoleList();
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return searchComUsrRoleVOs;
	}
}