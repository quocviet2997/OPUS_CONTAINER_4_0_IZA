/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteBCImpl.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2008-09-03
*@LastModifier : Jeong-Hoon KIM
*@LastVersion : 1.0
* 2008-09-03 Jeong-Hoon KIM
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approute.basic;

import com.clt.bizcommon.approute.event.ApprouteEvent;
import com.clt.bizcommon.approute.event.ApprouteEventResponse;
import com.clt.bizcommon.approute.integration.ApprouteDBDAO;
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
 * @author Jeong-Hoon KIM
 * @see ApprouteEventResponse,ApprouteEvent 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ApprouteBCImpl   extends BasicCommandSupport implements ApprouteBC {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient ApprouteDBDAO dbDao=null;

	/**
	 * StaffBCImpl 객체 생성<br>
	 * StaffDBDAO를 생성한다.<br>
	 */
	public ApprouteBCImpl(){
		dbDao = new ApprouteDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchStaffList(Event e) throws EventException {
		DBRowSet rowSet=null; 
        
        try {
        	rowSet = dbDao.searchStaffList(e);
            
            ApprouteEventResponse eventResponse = new ApprouteEventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchDeptList() throws EventException {
		DBRowSet rowSet=null;
        
        try {
        	rowSet = dbDao.searchDeptList();
            
            ApprouteEventResponse eventResponse = new ApprouteEventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse searchApprovalRouteList(Event e) throws EventException {
		DBRowSet rowSet=null; 
        
        try {
        	rowSet = dbDao.searchApprovalRouteList(e);
            
            ApprouteEventResponse eventResponse = new ApprouteEventResponse(rowSet,"SUCCESS");
			return eventResponse;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse saveApprovalRoute(Event e) throws EventException {
		
		ApprouteEvent event=(ApprouteEvent)e;
		String userId = event.getSignOnUserAccount().getUsr_id();
		
        DBRowSet rowSet= new DBRowSet();
		
        try {
        	dbDao.saveApprovalRoute(event, userId);
        	
            return new ApprouteEventResponse(rowSet,"SUCCESS");
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }		
	}
}
