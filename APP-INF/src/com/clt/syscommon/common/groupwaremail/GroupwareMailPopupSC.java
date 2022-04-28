/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : WebServiceSC.java
*@FileTitle : Groupware_Mail_Popup
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.26 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.groupwaremail;

import java.sql.SQLException;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.groupwaremail.basic.GroupwareMailPopupExecuteBC;
import com.clt.syscommon.common.groupwaremail.basic.GroupwareMailPopupExecuteBCImpl;
import com.clt.syscommon.common.groupwaremail.event.GroupwareMailPopupEvent;


/**
 * NIS2010-WebService Business Logic ServiceCommand - NIS2010-WebService 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see GroupwareMailPopupDBDAO
 * @since J2EE 1.6
 */

public class GroupwareMailPopupSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * WebService system 업무 시나리오 선행작업<br>
	 * Groupware_Mail_Popup업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("WebServiceSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * WebService system 업무 시나리오 마감작업<br>
	 * Groupware_Mail_Popup 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("WebServiceSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-WebService system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;
		eventResponse = popGroupwareWindow(e);		
		return eventResponse;
	}
	
	/**
	 * This method opens a window of groupware's mail.
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws EventException 
	 */
	private EventResponse popGroupwareWindow(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		GroupwareMailPopupEvent event = (GroupwareMailPopupEvent)e;
		GroupwareMailPopupExecuteBC command = new GroupwareMailPopupExecuteBCImpl();

		try{
			eventResponse.setETCData("GroupwarePopupURL", command.popGroupwareWindow(event.getGwSubject(),event.getGwContents(),this.account));
		}catch(EventException ex){
			throw ex;
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (SQLException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		return eventResponse;
	}
}