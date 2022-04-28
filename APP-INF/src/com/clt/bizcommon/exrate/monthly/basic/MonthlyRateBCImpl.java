/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MonthlyBCImpl.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.monthly.basic;

import com.clt.bizcommon.exrate.monthly.event.ComEns0E1EventResponse;
import com.clt.bizcommon.exrate.monthly.integration.MonthlyRateDBDAO;
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
 * @see COM_ENS_0E1EventResponse,MonthlyBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class MonthlyRateBCImpl   extends BasicCommandSupport implements MonthlyRateBC {

	// Database Access Object
	private transient MonthlyRateDBDAO dbDao=null;

	/**
	 * MonthlyBCImpl 객체 생성<br>
	 * MonthlyDBDAO를 생성한다.<br>
	 */
	public MonthlyRateBCImpl(){
		dbDao = new MonthlyRateDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Monthly화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchMonthlyRateList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalMonthlyRate(e);
            rowSet = dbDao.searchMonthlyRateList(e);
            
            ComEns0E1EventResponse eventResponse = new ComEns0E1EventResponse(rowSet,"SUCCESS");
			eventResponse.setCnt(cnt);
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Monthly업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}