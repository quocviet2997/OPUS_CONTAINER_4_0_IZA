/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserBCImpl.java
*@FileTitle : 사용자관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-14
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-14 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.user.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrOfcCngVO;
import com.clt.syscommon.management.opus.user.event.UiComSys015Event;
import com.clt.syscommon.management.opus.user.integration.User2DBOfcCngDAO;


/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_015EventResponse,UserBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class UserOfcCngBCImpl extends BasicCommandSupport implements UserOfcCngBC {

	// Database Access Object
	private transient User2DBOfcCngDAO dbDao=null;

	/**
	 * UserBCImpl 객체 생성<br>
	 * UserDBDAO를 생성한다.<br>
	 */
	public UserOfcCngBCImpl(){
		dbDao = new User2DBOfcCngDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * user화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserList(Event e) throws EventException {
		try {
			return dbDao.searchUserList(e);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}
	
	/**
	 * 추가 이벤트 처리<br>
	 * UI_COM_SYS_015 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return EventResponse UI_COM_SYS_015EventResponse
	 * @exception EventException
	 */
	public EventResponse changeOffice(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event=(UiComSys015Event)e;
		
		try {			
			dbDao.changeOffice(event);			
			return null;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_015 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiUser(Event e, SignOnUserAccount account) throws EventException{
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event = (UiComSys015Event)e;
		ComUsrOfcCngVO[] comUserVO = event.getComUserVO();
		try {
			List<ComUsrOfcCngVO> insertVoList = new ArrayList<ComUsrOfcCngVO>();
			List<ComUsrOfcCngVO> updateVoList = new ArrayList<ComUsrOfcCngVO>();
			List<ComUsrOfcCngVO> deleteVoList = new ArrayList<ComUsrOfcCngVO>();
			for ( int i=0; i < comUserVO.length; i++ ) {
				if ( comUserVO[i].getIbflag().equals("I")){
					comUserVO[i].setCreUsrId(account.getUsr_id());
					comUserVO[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(comUserVO[i]);
				} else if ( comUserVO[i].getIbflag().equals("U")){
					comUserVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(comUserVO[i]);
				} else if ( comUserVO[i].getIbflag().equals("D")){
					deleteVoList.add(comUserVO[i]);
				}
			}
			for (int i = 0; i < insertVoList.size(); i++) {
				dbDao.addComUser(insertVoList.get(i));
			}
			for (int i = 0; i < updateVoList.size(); i++) {
				dbDao.modifyComUser(updateVoList.get(i));
			}
			for (int i = 0; i < deleteVoList.size(); i++) {
				dbDao.removeComUser(deleteVoList.get(i));
			}
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	
	/**
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet getUserBasicInfo(Event e) throws EventException{
		// PDTO(Data Transfer Object including Parameters)
		DBRowSet rowSet = null;
		UiComSys015Event event=(UiComSys015Event)e;

		try {
			rowSet = dbDao.userBasicInfo(event);
//			System.out.println("getRowCount : " + rowSet.getRowCount());
			return rowSet;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}
	
	/**
	 * 
	 * @param e UI_COM_SYS_015Event
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet getUserRhqInfo(Event e) throws EventException{
		// PDTO(Data Transfer Object including Parameters)
		UiComSys015Event event=(UiComSys015Event)e;
		try {
			return dbDao.userRhqInfo(event);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * user업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}

}