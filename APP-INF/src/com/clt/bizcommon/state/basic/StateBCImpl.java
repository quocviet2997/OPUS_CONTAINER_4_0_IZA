/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentBCImpl.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.state.basic;

import com.clt.bizcommon.state.event.ComEns0X1EventResponse;
import com.clt.bizcommon.state.integration.StateDBDAO;
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
 * @see COM_ENS_0X1EventResponse,ContinentBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class StateBCImpl   extends BasicCommandSupport implements StateBC {

	// Database Access Object
	private transient StateDBDAO dbDao=null;

	/**
	 * StateBCImpl 객체 생성<br>
	 * StateDBDAO를 생성한다.<br>
	 */
	public StateBCImpl(){
		dbDao = new StateDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * State화면에 대한 조회 이벤트 처리<br>
	 * @param Event e
	 * @return response COM_ENS_0X1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchStateList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalState(e);
            rowSet = dbDao.searchStateList(e);
            
            ComEns0X1EventResponse eventResponse = new ComEns0X1EventResponse(rowSet,"SUCCESS");
			eventResponse.setCnt(cnt); 
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * State업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}