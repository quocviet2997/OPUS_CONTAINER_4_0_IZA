/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleBCImpl.java
*@FileTitle : 역할 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.opus.role.event.ComSys011Event;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDBDAO;
import com.clt.syscommon.management.opus.role.integration.RoleMappingDBDAO;



/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_008EventResponse,RoleBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class RoleMappingBCImpl   extends BasicCommandSupport implements RoleMappingBC {

	// Database Access Object
	private transient RoleMappingDBDAO dbDao=null;

	/**
	 * RoleBCImpl 객체 생성<br>
	 * RoleDBDAO를 생성한다.<br>
	 */
	public RoleMappingBCImpl(){
		dbDao = new RoleMappingDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserRoleList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchUserRoleList(e);
			return rowSet;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_008 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeUserRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_008Event event=(UI_COM_SYS_008Event)e;
//
//		try {
//			dbDao.removeCOM_USR_ROLE_MTCH(event);
//			return null;
//		} catch (DAOException de) {
//			log.error("err "+de.toString(),de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_008 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUsrRoleMtchVO[] models
	 * @param SignOnUserAccount account
	 * @param String adminFlag
	 * @exception EventException
	 */
	public void multiComUsrRoleMtchVO(ComUsrRoleMtchVO[] models, SignOnUserAccount account, String adminFlag) throws EventException{
		try {
			dbDao.multiComUsrRoleMtchVO(models, account, adminFlag);
//			return null;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
	public EventResponse searchProgRoleList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchProgRoleList(e);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVo(rowSet);
			return eventResponse;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_008 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeProgRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
////		UI_COM_SYS_011Event event=(UI_COM_SYS_011Event)e;
////
////		try {
////			dbDao.removeCOM_PGM_ROLE(event);
////			return null;
////		} catch (DAOException de) {
////			log.error("err "+de.toString(),de);
////			throw new EventException(de.getMessage());
////		}
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_008 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_008Event
	 * @return EventResponse UI_COM_SYS_008EventResponse
	 * @exception EventException
	 */
	public EventResponse multiProgRole(Event e) throws EventException{
		log.debug(e.toString());
		ComSys011Event event = (ComSys011Event)e;
		try {
			ProgramMappingDBDAO pgmDao = new ProgramMappingDBDAO();
			pgmDao.multiComPgmRoleVO(event.getComPgmRoleVOS(), event.getSignOnUserAccount());

		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
		return null;
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}

	/**
	 * Program과 Role 매핑정보를 삭제한다.<br>
	 * 
	 * @param e Event
	 * @return EventResponse 
	 * @exception EventException
	 */
	public EventResponse removeProgRole(Event e) throws EventException {
		// TODO Auto-generated method stub
		log.debug(e.toString());
		return null;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserRoleHistoryList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchUserRoleHistoryList(e);
			return rowSet;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}
}