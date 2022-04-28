/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : countryBCImpl.java
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.calendar.basic;

import java.util.Collection;

import com.clt.bizcommon.calendar.event.ComEns0S1Event;
import com.clt.bizcommon.calendar.event.ComEns0S1EventResponse;
import com.clt.bizcommon.calendar.event.ComEns0S2Event;
import com.clt.bizcommon.calendar.event.ComEns0S2EventResponse;
import com.clt.bizcommon.calendar.event.ComEns0S3Event;
import com.clt.bizcommon.calendar.event.ComEns0S3EventResponse;
import com.clt.bizcommon.calendar.event.ComEns0S4EventResponse;
import com.clt.bizcommon.calendar.integration.CalendarDBDAO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0S1EventResponse,countryBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CalendarBCImpl   extends BasicCommandSupport implements CalendarBC {

	// Database Access Object
	private transient CalendarDBDAO dbDao=null;

	/**
	 * countryBCImpl 객체 생성<br>
	 * countryDBDAO를 생성한다.<br>
	 */
	public CalendarBCImpl(){
		dbDao = new CalendarDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * country화면에 대한 조회 이벤트 처리<br>
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchCntHolidayList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        
        try {
        	rowSet = dbDao.searchCntHolidayList(e);
            
        	ComEns0S1EventResponse eventResponse = new ComEns0S1EventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}	

	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse modifyCntHoliday(Event e) throws EventException {
		
		// PDTO(Data Transfer Object including Parameters)
		ComEns0S1Event event=(ComEns0S1Event)e;
		String userId = event.getSignOnUserAccount().getUsr_id();
		
        DBRowSet rowSet=new DBRowSet();
		
        try {
        	// MODIFY PRD HOLIDAY TABLE
        	dbDao.modifyCntHoliday(event, userId);
        	
            return new ComEns0S1EventResponse(rowSet,"SUCCESS");
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }		
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * country화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchSteHolidayList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        
        try {
        	rowSet = dbDao.searchSteHolidayList(e);
            
            ComEns0S2EventResponse eventResponse = new ComEns0S2EventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}	

	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse modifySteHoliday(Event e) throws EventException {
		
		// PDTO(Data Transfer Object including Parameters)
		ComEns0S2Event event=(ComEns0S2Event)e;
		String userId = event.getSignOnUserAccount().getUsr_id();
		
        DBRowSet rowSet=new DBRowSet();
		
        try {
        	// MODIFY PRD HOLIDAY TABLE
        	dbDao.modifySteHoliday(event, userId);
        	
            return new ComEns0S2EventResponse(rowSet,"SUCCESS");
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }		
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * country화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchLocHolidayList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        
        try {
        	rowSet = dbDao.searchLocHolidayList(e);
            
            ComEns0S3EventResponse eventResponse = new ComEns0S3EventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}	

	/**
	 * 수정 이벤트 처리<br>
	 * COM_ENS_0S1 에 대한 추가 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse modifyLocHoliday(Event e) throws EventException {
		
		// PDTO(Data Transfer Object including Parameters)
		ComEns0S3Event event=(ComEns0S3Event)e;
		String userId = event.getSignOnUserAccount().getUsr_id();
		
        DBRowSet rowSet=new DBRowSet();
		
        try {
        	// MODIFY PRD HOLIDAY TABLE
        	dbDao.modifyLocHoliday(event, userId);
        	
            return new ComEns0S3EventResponse(rowSet,"SUCCESS");
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }		
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Monthly Holiday(by Country)화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchMonthlyHolidayList(Event e) throws EventException {
		Collection col=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        
        try {
        	col = dbDao.searchMonthlyHolidayList(e);
            
            ComEns0S4EventResponse eventResponse = new ComEns0S4EventResponse(col,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * country업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}