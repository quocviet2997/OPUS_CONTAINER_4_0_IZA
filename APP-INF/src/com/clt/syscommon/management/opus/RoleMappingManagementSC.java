/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleMappingManagementSC.java
*@FileTitle : 역할 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;


import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.opus.role.basic.RoleMappingBC;
import com.clt.syscommon.management.opus.role.basic.RoleMappingBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys008Event;

/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_008EventResponse,RoleDBDAO 참조
 * @since J2EE 1.4
 */
public class RoleMappingManagementSC extends ServiceCommandSupport {
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
			log.error("RoleMappingManagementSC Error while preprocessing " + e.toString(), e);
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * Role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("RoleMappingManagementSC End");
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
		
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ComSys008Event")) {
			if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiUserRole(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchUserRoleList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchUserRoleHistoryList(e);
			}
		}

		if (e.getEventName().equalsIgnoreCase("ComSys011Event")) {
			if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiProgRole(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchProgRoleList(e);
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
	private EventResponse searchUserRoleList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
		ComSys008Event event = (ComSys008Event)e;
		DBRowSet rowSet = null;
		try {
			RoleMappingBC command = new RoleMappingBCImpl();
			rowSet = command.searchUserRoleList(event);
			eventResponse.setRsVo(rowSet);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}

	/**
	 * 삭제 이벤트 처리<br>
	 * Role의 event에 대한 삭제 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private EventResponse removeUserRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_008Event event = (UI_COM_SYS_008Event)e;
//
//		try {
//			begin();
//			RoleMappingBC command = new RoleMappingBCImpl();
//			command.removeUserRole(event);
//			commit();
//		} catch (EventException de) {
//			rollback();
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//		
//		return null;
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * Role의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiUserRole(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		//UI_COM_SYS_008Event event = (UI_COM_SYS_008Event)e;
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
		ComSys008Event event = (ComSys008Event)e;
		
		try {
			begin();
			RoleMappingBC command = new RoleMappingBCImpl();
			ComUsrRoleMtchVO[] models = event.getComUsrRoleMtchVOs();
			command.multiComUsrRoleMtchVO(models, account, event.getUsrRoleAdmMtch());
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
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
	private EventResponse searchProgRoleList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;
		
		try {
			RoleMappingBC command = new RoleMappingBCImpl();
			log.debug("---------------------"+e.getFormCommand().getCommand());
			eventResponse = command.searchProgRoleList(e);
		} catch (EventException de){
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}

	/**
	 * 삭제 이벤트 처리<br>
	 * Role의 event에 대한 삭제 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
//	private EventResponse removeProgRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_011Event event = (UI_COM_SYS_011Event)e;
//
//		try {
//			begin();
//			RoleMappingBC command = new RoleMappingBCImpl();
//			command.removeProgRole(event);
//			commit();
//		} catch (EventException de) {
//			rollback();
//			log.error("err " + de.toString(), de);
//			throw new EventException(de.getMessage());
//		}
//		
//		return this.searchProgRoleList(e);
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * Role의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiProgRole(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		try {
			begin();
			RoleMappingBC command = new RoleMappingBCImpl();
			command.multiProgRole(e);
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
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
	private EventResponse searchUserRoleHistoryList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
		ComSys008Event event = (ComSys008Event)e;
		DBRowSet rowSet = null;
		try {
			RoleMappingBC command = new RoleMappingBCImpl();
			rowSet = command.searchUserRoleHistoryList(event);
			eventResponse.setRsVo(rowSet);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}
}