/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleBCImpl.java
*@FileTitle : 역할관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.basic;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.role.event.ComSys007Event;
import com.clt.syscommon.management.opus.role.integration.RoleDBDAO;
import com.clt.syscommon.management.opus.role.vo.ComUsrRoleConditionVO;
import com.clt.syscommon.management.opus.role.vo.SearchComUsrRoleVO;


/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_007EventResponse,RoleBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class RoleBCImpl   extends BasicCommandSupport implements RoleBC {

	// Database Access Object
	private transient RoleDBDAO dbDao=null;

	/**
	 * RoleBCImpl 객체 생성<br>
	 * RoleDBDAO를 생성한다.<br>
	 */
	public RoleBCImpl(){
		dbDao = new RoleDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComUsrRoleConditionVO comUsrRoleConditionVO
	 * @param SignOnUserAccount account
	 * @return SearchComUsrRoleVO[]
	 * @exception EventException
	 */
	public SearchComUsrRoleVO[] searchRoleList(ComUsrRoleConditionVO comUsrRoleConditionVO, SignOnUserAccount account) throws EventException {
//		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		SearchComUsrRoleVO[] searchComUsrRoleVOs=null;
		try {
			searchComUsrRoleVOs=dbDao.searchRoleList(comUsrRoleConditionVO,account);
			
			return searchComUsrRoleVOs;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse searchRole(ComUsrRoleConditionVO comUsrRoleConditionVO) throws EventException {
//		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
//		DBRowSet rowSet=null;
//		
//		try {
//			rowSet=dbDao.searchRole(comUsrRoleConditionVO);
//			return new UI_COM_SYS_007EventResponse(rowSet,"SUCCESS");
//		} catch (DAOException de) {
//			log.error("err "+de.toString(),de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 추가 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse addRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event=(UI_COM_SYS_007Event)e;
//
//		try {
//			dbDao.addCOM_USR_ROLE(event.ㅎㄷㅅ);
//			return null;
//		} catch (DAOException de) {
//			log.error("err "+de.toString(),de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 수정 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse modifyRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event=(UI_COM_SYS_007Event)e;
//
//		try {
//			dbDao.modifyCOM_USR_ROLE(event.getCOM_USR_ROLE());
//			return null;
//		} catch (DAOException de) {
//			log.error("err "+de.toString(),de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 삭제 이벤트 처리<br>
	 * UI_COM_SYS_007 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
//	public EventResponse removeRole(Event e) throws EventException {
//		// PDTO(Data Transfer Object including Parameters)
//		UI_COM_SYS_007Event event=(UI_COM_SYS_007Event)e;
//
//		try {
//			dbDao.removeCOM_USR_ROLE(event.getCOM_USR_ROLE());
//			return null;
//		} catch (DAOException de) {
//			log.error("err "+de.toString(),de);
//			throw new EventException(de.getMessage());
//		}
//	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_007 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_007Event
	 * @return EventResponse UI_COM_SYS_007EventResponse
	 * @exception EventException
	 */
	public EventResponse multiRole(Event e) throws EventException{
		// PDTO(Data Transfer Object including Parameters)
		ComSys007Event event=(ComSys007Event)e;
//log.debug("==========="+event.getComUsrRoles().size());
		try {
			dbDao.multiComUsrRoleVO(event.getComUsrRoles(), event.getSignOnUserAccount());
			return null;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}


	/**
	 * 조회 이벤트 처리<br>
	 * 부모Role 조회팝업 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return SearchComUsrRoleVO[]
	 * @exception EventException
	 */
	public SearchComUsrRoleVO[] searchUpperRoleList() throws EventException {
		SearchComUsrRoleVO[] searchComUsrRoleVOs=null;
		try {
			searchComUsrRoleVOs=dbDao.searchUpperRoleList();
			return searchComUsrRoleVOs;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}
	 
	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}

}