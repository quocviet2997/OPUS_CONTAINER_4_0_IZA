/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ApprovalSC.java
*@FileTitle : ApprovalSC
*Open Issues :
*Change history :
*@LastModifyDate : 2017-11-03
*@LastModifier : yona ha
*@LastVersion : 1.0
* 2006-08-02 yona ha
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval;

import com.clt.bizcommon.approval.basic.ApprovalBC;
import com.clt.bizcommon.approval.basic.ApprovalBCImpl;
import com.clt.bizcommon.approval.event.ComEns0Z1Event;
import com.clt.bizcommon.approval.event.ComEns0Z2Event;
import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;


/**
 * ENIS-Approval Business Logic ServiceCommand<br>
 * - ENIS-Approval에 1대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_0A1EventResponse,VesselDBDAO 참조
 * @since J2EE 1.4
 */
public class ApprovalSC extends ServiceCommandSupport {
	// Login User Information
    private SignOnUserAccount account = null;

    /**
     * Approval 업무 시나리오 선행작업<br>
     * Vessel업무 시나리오 호출시 관련 내부객체 생성<br>
     */
    public void doStart() {
        try {
            // 일단 comment --> 로그인 체크 부분
            account=getSignOnUserAccount();            
        } catch (Exception e) {
            log.error("ApprovalSC 선행 작업 시 오류 " + e.toString(), e);
        }
    }

    /**
     * Approval 업무 시나리오 마감작업<br>
     * Vessel업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        // command.doEnd();
        log.debug("ApprovalSC 종료");
    }

    /**
     * 각 이벤트에 해당하는 업무 시나리오 수행<br>
     * ENIS-Approval 업무에서 발생하는 모든 이벤트의 분기처리<br>
     * 
     * @param e Event
     * @return response EventResponse
     * @exception EventException
     */
    public EventResponse perform(Event e) throws EventException {
        // RDTO(Data Transfer Object including Parameters)
        EventResponse eventResponse = null;
        
        /*
         * ApprovalSC에 사용법
         * 1. 각각의 업무에 를 통합하는 SC로써 각 업무에 대한 로직은 아래와 같이 작성한다.
         * 2. BC에 대한 각 업무단 BC를 참조하여야 한다. 
         * */
        // CSR amount limitation setup
        if (e.getEventName().equalsIgnoreCase("ComEns0Z1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchCsrAmountLimitList(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
        		eventResponse = multiCsrAmountLimitList(e);
        	}
        }
        
        // CSR amount limitation setup history
        if (e.getEventName().equalsIgnoreCase("ComEns0Z2Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchCsrAmountLimitHistoryList(e);
        	} 
        }
        return eventResponse;
    }
    
//approval-[--------------------------------------------------------------------------------------------------------------

    /**
     * 조회 이벤트 처리<br>
     * CSR amount limitation setup 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchCsrAmountLimitList(Event e) throws EventException {
    	EventResponse eventResponse = null;
    	ComEns0Z1Event event = (ComEns0Z1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
        try {
        	ApprovalCsrAmountLimitVO vo = new ApprovalCsrAmountLimitVO();
        	vo.setLoginOfcCd(account.getOfc_cd());
        	vo.setArHdQtrOfcCd(event.getRhqOfcCd());
        	vo.setOfcCd(event.getOfcCdList());
        	vo.setSubSysCd(event.getSubSysCd());
        	eventResponse = command.searchCsrAmountLimitList(vo);
        } catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval CSR amount limitation setup list"}).getMessage(), ex);
		}
        return eventResponse;
    }
    
	/**
	 * COM_ENS_0Z1: SAVE <br>
	 * CSR amount limitation save
	 *  
	 * @param     Event e 
	 * @return    EventResponse response
	 * @exception EventException
	 */
	private EventResponse multiCsrAmountLimitList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComEns0Z1Event event = (ComEns0Z1Event)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ApprovalBC command = new ApprovalBCImpl();
		try{
			ApprovalCsrAmountLimitVO[] vos = event.getApprovalCsrAmountLimitVOS();
			begin();
			command.multiCsrAmountLimitList(vos, account); 
			commit();
			return eventResponse;
        } catch (EventException ex) {
            log.error("error:"+ex.toString(), ex);
            rollback();
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
            rollback();
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Approval CSR amount limitation setup save"}).getMessage(), ex);
        }
	}
	
    /**
     * 조회 이벤트 처리<br>
     * CSR amount limitation setup history 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchCsrAmountLimitHistoryList(Event e) throws EventException {
    	EventResponse eventResponse = null;
    	ComEns0Z2Event event = (ComEns0Z2Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
        try {
        	ApprovalCsrAmountLimitVO vo = new ApprovalCsrAmountLimitVO();
        	vo.setLoginOfcCd(account.getOfc_cd());
        	vo.setArHdQtrOfcCd(event.getRhqOfcCd());
        	vo.setOfcCd(event.getOfcCdList());
        	vo.setSubSysCd(event.getSubSysCd());
        	eventResponse = command.searchCsrAmountLimitHistoryList(vo);
        } catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval CSR amount limitation setup history list"}).getMessage(), ex);
		}
        return eventResponse;
    }
}
