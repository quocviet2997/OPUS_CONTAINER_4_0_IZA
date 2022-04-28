/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Customer_02BCImpl.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.actualcustomer.basic;

import com.clt.bizcommon.actualcustomer.event.ComEns042EventResponse;
import com.clt.bizcommon.actualcustomer.integration.ActualCustomerDBDAO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_042EventResponse, 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ActualCustomerBCImpl extends BasicCommandSupport implements ActualCustomerBC {

    // Database Access Object
    private transient ActualCustomerDBDAO dbDao=null;

    /**
     * ActualCustomerBCImpl 객체 생성<br>
     * ActualCustomerDBDAO  객체 생성<br>
     */
    public ActualCustomerBCImpl(){
        dbDao = new ActualCustomerDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Actual Customer 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
	 * @return EventResponse
	 * @exception EventException
     */
    public EventResponse searchCustomerList(Event e) throws EventException {
        DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalCustomer_02(e);
            rowSet = dbDao.searchCustomer_02List(e);
            ComEns042EventResponse eventResponse = new ComEns042EventResponse(rowSet,"SUCCESS");
			eventResponse.setCnt(cnt);
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }     
    }
    
    
    
    /**
     * 조회 이벤트 처리<br>
     * Actual Customer 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
	 * @return EventResponse
	 * @exception EventException
     */
    public EventResponse searchActualCustomerList(Event e) throws EventException {
        DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalFactory(e);
            rowSet = dbDao.searchFactoryList(e);
            ComEns042EventResponse eventResponse = new ComEns042EventResponse(rowSet,"SUCCESS");
			eventResponse.setCnt(cnt);
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }     
    }



    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Customer_02업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}