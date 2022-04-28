/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : scheduleBCImpl.java
 *@FileTitle : schedule
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2008.12.23
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2008.12.23 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.management.opus.schedule.event.ScheduleLogEvent;
import com.clt.syscommon.management.opus.schedule.integration.ScheduleDBDAO;

/**
 * NIS2010-schedule Business Logic Basic Command implementation<br>
 * - NIS2010-schedule에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author In Sun Jung
 * @see scheduleEventResponse,scheduleBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class ScheduleBCImpl extends BasicCommandSupport implements ScheduleBC {

	// Database Access Object
	private transient ScheduleDBDAO dbDao = null;

	/**
	 * scheduleBCImpl 객체 생성<br>
	 * scheduleDBDAO를 생성한다.<br>
	 */
	public ScheduleBCImpl() {
		dbDao = new ScheduleDBDAO();
	}


	/**
	 * 조회 이벤트 처리<br>
	 * schedule log 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ScheduleLogEvent ev
	 * @return EventResponse scheduleEventResponse
	 * @exception EventException
	 */
	public EventResponse searchscheduleLogList(ScheduleLogEvent ev) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ScheduleLogEvent event = (ScheduleLogEvent) ev;

		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
		DBRowSet rowSet = null;

		try {

			rowSet = dbDao.searchscheduleLogList(event);
			GeneralEventResponse response = new GeneralEventResponse();
			List<DBRowSet> rsVoList = new ArrayList<DBRowSet>();
			rsVoList.add(rowSet);
			response.setRsVoList(rsVoList);
			
			return response;
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

}
