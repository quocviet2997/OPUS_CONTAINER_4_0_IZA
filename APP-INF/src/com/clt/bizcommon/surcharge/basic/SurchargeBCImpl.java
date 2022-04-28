/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SurchargeBCImpl.java
*@FileTitle : Surcharge
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.surcharge.basic;

import com.clt.bizcommon.surcharge.event.ComEns0D1EventResponse;
import com.clt.bizcommon.surcharge.integration.SurchargeDBDAO;
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
 * @see COM_ENS_0D1EventResponse, SurchargeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class SurchargeBCImpl   extends BasicCommandSupport implements SurchargeBC {

	// Database Access Object
	private transient SurchargeDBDAO dbDao=null;

	/**
	 * CountryBCImpl 객체 생성<br>
	 * CountryDBDAO를 생성한다.<br>
	 */
	public SurchargeBCImpl(){
		dbDao = new SurchargeDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Country화면에 대한 조회 이벤트 처리<br>
	 * @param Event e
	 * @return response COM_ENS_0D1EventResponse
	 * @exception EventException
	 */
	public EventResponse searchSurchargeList(Event e) throws EventException {
		DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalSurcharge(e);
            rowSet = dbDao.searchSurchargeList(e);
            
            ComEns0D1EventResponse eventResponse = new ComEns0D1EventResponse(rowSet,"SUCCESS");
			eventResponse.setCnt(cnt);
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Surcharge업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}