/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistorySC.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.HashMap;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.accesshistory.integration.AccessHistoryDBDAO;
import com.clt.syscommon.management.opus.copyauthority.basic.CopyAuthorityBC;
import com.clt.syscommon.management.opus.copyauthority.basic.CopyAuthorityBCImpl;
import com.clt.syscommon.management.opus.copyauthority.event.CopyAuthorityEvent;

/**
 * ALPS-AccessHistory Business Logic ServiceCommand - ALPS-AccessHistory 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author kyungbum kim
 * @see AccessHistoryDBDAO
 * @since J2EE 1.6
 */

public class CopyAuthoritySC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * AccessHistory system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("AccessHistorySC start");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * AccessHistory system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("AccessHistorySC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-AccessHistory system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {

		EventResponse eventResponse = null;
		if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
			eventResponse = multiCopyAuthority(e);
		}

		return eventResponse;
	}
	/**
	 * AccessHistory : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse multiCopyAuthority(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		CopyAuthorityBC command = new CopyAuthorityBCImpl();
		CopyAuthorityEvent event = (CopyAuthorityEvent)e;
		HashMap<String, String> hm = event.getParam();
		String[] toUsrId = hm.get("to_usr_id").split("!@@!"); 
		try{
			begin();
			for ( int i= 0 ; i < toUsrId.length ; i++ ) {
				hm.put("to_usr_id", toUsrId[i]);
				command.copyAuthority(hm);
			}
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}

}