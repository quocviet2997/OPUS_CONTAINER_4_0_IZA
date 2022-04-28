/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserManagementSC.java
*@FileTitle : 사용자관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-14
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-14 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.sql.SQLException;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.AbstractSysCommonSC;
import com.clt.syscommon.management.opus.user.basic.UserOfcCngBC;
import com.clt.syscommon.management.opus.user.basic.UserOfcCngBCImpl;
import com.clt.syscommon.management.opus.user.event.UiComSys015Event;


/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_015EventResponse,UserDBDAO 참조
 * @since J2EE 1.4
 */

public class UserManagementOfcCngSC extends AbstractSysCommonSC {
	// Login User Information
	private SignOnUserAccount account = null;

	
	/**
	 * syscommon 업무 시나리오 선행작업<br>
	 * User업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account=getSignOnUserAccount();
		} catch (Exception e) {
			log.error("UserManagementSC Error while preprocessing " + e.toString(), e);
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * User업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("UserManagementOfcCngSC End");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * syscommon-syscommon 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param Event e
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		//관리자권한체크
		//isAdministrator(this.account);
		
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("UiComSys015Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchUserList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.REMOVE)) {
				eventResponse = multiUser(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiUser(e);
			} else if(e.getFormCommand().isCommand(FormCommand.MODIFY)) {	// Office Change
				eventResponse = changeOffice(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {	// Office Change
				eventResponse = getUserBasicInfo(e);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH02)) {	// Office Change				
				eventResponse = getUserRhqInfo(e);
			} else {
				eventResponse = searchUserListMain(e); //화면에 사용자권한 조회조건값 설정
			}
		}
		
		return eventResponse;
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse getUserRhqInfo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event = (UiComSys015Event)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		try {
			UserOfcCngBC command = (UserOfcCngBC) new UserOfcCngBCImpl();
			DBRowSet db = command.getUserRhqInfo(event);
			if(db.getRowCount() > 0){
				db.next();
				eventResponse.setETCData("total", Integer.toString(db.getRowCount()));
				eventResponse.setETCData("rhq", db.getString("rhq"));
			}
		} catch (SQLException e1) {
			log.error("err " + e1.toString(), e1);
			throw new EventException(e1.getMessage());
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception ee) {
			log.error("err "+ ee.toString(), ee);
			throw new EventException(ee.getMessage());
		}
		
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * User 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e 이벤트
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchUserListMain(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse response = new GeneralEventResponse();
		response.setETCData("authTypes", getAuthTypes(e));
		return response;
	}
	
	/**
	 * 
	 * @param Event e
	 * @return String
	 * @exception EventException
	 */
	private String getAuthTypes(Event e) throws EventException {
		String authTypes = null;
		try{
			UiComSys015Event event = (UiComSys015Event)e;
			if(event.getSignOnUserAccount().getUsr_auth_tp_cd().equalsIgnoreCase("S")){
				authTypes = "Super User|Regular:S|R";
			}else{
				authTypes = "Almighty|Super User|Regular:A|S|R";
			}
		} catch (EventException de) {
			log.error("err "+de.toString(),de);
			throw de;
		}
		return authTypes;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * User 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e 이벤트
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchUserList(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		try {
			UserOfcCngBC command = new UserOfcCngBCImpl();
			eventResponse.setRs(command.searchUserList(e)) ;
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}
	
	/**
	 * 추가 이벤트 처리<br>
	 * User의 event에 대한 추가 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse changeOffice(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event = (UiComSys015Event)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		try {
			begin();
			UserOfcCngBC command = (UserOfcCngBC) new UserOfcCngBCImpl();
			command.changeOffice(event);
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return eventResponse;
	}
	
	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse getUserBasicInfo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event = (UiComSys015Event)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		try {
			UserOfcCngBC command = (UserOfcCngBC) new UserOfcCngBCImpl();
			DBRowSet db = command.getUserBasicInfo(event);
			if(db.getRowCount() > 0){
					db.next();
					eventResponse.setETCData("total", Integer.toString(db.getRowCount()));
					eventResponse.setETCData("usr_nm", db.getString("usr_nm"));
					eventResponse.setETCData("usr_locl_nm", db.getString("usr_locl_nm"));
					eventResponse.setETCData("ofc_cd", db.getString("ofc_cd"));
					eventResponse.setETCData("cng_ofc_cd", db.getString("cng_ofc_cd"));
					eventResponse.setETCData("rhq", db.getString("rhq"));
					eventResponse.setETCData("cng_ofc_fm_dt", db.getString("cng_ofc_fm_dt"));
			}else{
				eventResponse.setETCData("total", "0");
			}
		} catch (SQLException e1) {
			log.error("err " + e1.toString(), e1);
			throw new EventException(e1.getMessage());
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception ee) {
			log.error("err "+ ee.toString(), ee);
			throw new EventException(ee.getMessage());
		}
		return eventResponse;
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * User의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiUser(Event e) throws EventException {
		try {
			begin();
			UserOfcCngBC command = (UserOfcCngBC) new UserOfcCngBCImpl();
			command.multiUser(e,account);
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}

		return this.searchUserList(e);
	}

}