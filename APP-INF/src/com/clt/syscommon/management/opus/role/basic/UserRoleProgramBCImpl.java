/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserRoleProgramBCImpl.java
*@FileTitle : 사용자, 역할, 프로그램
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
import com.clt.syscommon.management.opus.role.integration.UserRoleProgramDBDAO;



/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_006EventResponse,UserRoleProgramBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class UserRoleProgramBCImpl   extends BasicCommandSupport implements UserRoleProgramBC {

	// Database Access Object
	private transient UserRoleProgramDBDAO dbDao=null;

	/**
	 * UserRoleProgramBCImpl 객체 생성<br>
	 * UserRoleProgramDBDAO를 생성한다.<br>
	 */
	public UserRoleProgramBCImpl(){
		dbDao = new UserRoleProgramDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * UserRoleProgram화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return response UI_COM_SYS_006EventResponse
	 * @exception EventException
	 */
	public EventResponse searchUserRoleProgramList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
		try {
			rowSet=dbDao.searchUserRoleProgramList(e);
			GeneralEventResponse response = new GeneralEventResponse();
			response.setRsVo(rowSet);
			return response;

		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * UserRoleProgram업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}