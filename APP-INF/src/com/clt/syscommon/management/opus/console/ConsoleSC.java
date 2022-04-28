/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsoleSC.java
*@FileTitle : COM_BACKENDJOB
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.console;

import java.util.List;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComBakEndJbVO;
import com.clt.syscommon.management.opus.console.backendjob.basic.BackEndJobBC;
import com.clt.syscommon.management.opus.console.backendjob.event.ComBackendjobEvent;


/**
 * ALPS-Console Business Logic ServiceCommand - ALPS-Console 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see BackEndJobDBDAO
 * @since J2EE 1.6
 */

public class ConsoleSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Console system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("ConsoleSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Console system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("ConsoleSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-Console system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		return eventResponse;
	}
}