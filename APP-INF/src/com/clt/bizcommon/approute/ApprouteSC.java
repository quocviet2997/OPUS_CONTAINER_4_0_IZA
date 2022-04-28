/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteSC.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2008-09-02
*@LastModifier : Jeong-Hoon KIM
*@LastVersion : 1.0
* 2008-09-03 Jeong-Hoon KIM
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approute;

import com.clt.bizcommon.approute.basic.ApprouteBC;
import com.clt.bizcommon.approute.basic.ApprouteBCImpl;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;

/**
 * Approval Route 수정 화면의 DBDAO.
 * @author Jeong-Hoon, KIM
 * @see
 * @since J2EE 1.4
 *
 * 2008. 09. 05
 */
public class ApprouteSC extends ServiceCommandSupport {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
     * ApprouteSC 업무 시나리오 선행작업<br>
     * 내부객체 생성<br>
     */
    public void doStart() {
    }

    /**
     * ApprouteSC 업무 시나리오 마감작업<br>
     *  내부객체 해제<br>
     */
    public void doEnd() {
        // command.doEnd();
        log.debug("ApprouteSC 종료");
    }
    
    /**
     * @param Event event
     * @return EventResponse
     */
	public EventResponse perform(Event event) throws EventException {
		EventResponse eventResponse = null;
    	if (event.getFormCommand().isCommand(FormCommand.SEARCH)) {
    		eventResponse = searchApprovalStaffList(event);
    	} else if (event.getFormCommand().isCommand(FormCommand.SEARCH01)) {
            eventResponse = searchApprovalDeptList();
        } else if (event.getFormCommand().isCommand(FormCommand.SEARCH02)) {
            eventResponse = searchApprovalRouteList(event);
        } else if(event.getFormCommand().isCommand(FormCommand.MULTI)) { // SAVE 버튼 클릭시
			eventResponse = saveApprovalRoute(event);
    	}
        return eventResponse;
	}
    
    /**
     * 
     * 조회 이벤트 처리<br>
     * Approval Staff 화면에 대한 조회 이벤트 처리<br>
     * @author Jeong-Hoon, KIM
     * @param Event e
	 * @return EventResponse
	 * @exception EventException
     * 2008. 09. 03
     */
    private EventResponse searchApprovalStaffList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	ApprouteBC command = new ApprouteBCImpl();
            eventResponse = command.searchStaffList(e);
        } catch (EventException de) {
            log.error("err " + de.toString(), de);
            throw new EventException(de.getMessage());
        }
        return eventResponse;
    }
    
    /**
     * 
     * 조회 이벤트 처리<br>
     * Approval Dept 화면에 대한 조회 이벤트 처리<br>
     * @author Jeong-Hoon, KIM
	 * @return EventResponse
	 * @exception EventException
     * 2008. 09. 03
     */
    private EventResponse searchApprovalDeptList() throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	ApprouteBC command = new ApprouteBCImpl();
            eventResponse = command.searchDeptList();
        } catch (EventException de) {
            log.error("err " + de.toString(), de);
            throw new EventException(de.getMessage());
        }
        return eventResponse;
    }
    
    /**
     * 
     * 조회 이벤트 처리<br>
     * Approval Dept 화면에 대한 조회 이벤트 처리<br>
     * @author Jeong-Hoon, KIM
     * @param Event e
	 * @return EventResponse
	 * @exception EventException
     * 2008. 09. 03
     */
    private EventResponse searchApprovalRouteList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	ApprouteBC command = new ApprouteBCImpl();
            eventResponse = command.searchApprovalRouteList(e);
        } catch (EventException de) {
            log.error("err " + de.toString(), de);
            throw new EventException(de.getMessage());
        }
        return eventResponse;
    }

	
	/**
	 * 
	 * Forecasted Vessel Residual Capacity 저장 <br>
	 * Forecasted Vessel Residual Capacity 저장 이벤트 처리<br>
	 * @author Jeong-Hoon, KIM
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 * 2008. 09. 03
	 */
	private EventResponse saveApprovalRoute(Event e) throws EventException {
		
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;           
		
		try {
			begin();			
			ApprouteBC command = new ApprouteBCImpl();
			eventResponse = command.saveApprovalRoute(e);			
			commit();			
			return (eventResponse); 
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}

 }
