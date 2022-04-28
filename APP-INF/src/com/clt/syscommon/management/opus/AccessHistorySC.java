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

import java.util.Arrays;
import java.util.List;

import com.clt.framework.component.backend.support.BackEndJobMetaDataSelector;
import com.clt.framework.component.backend.support.BackEndJobResult;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.util.OrganizationUtil;
import com.clt.syscommon.management.opus.accesshistory.basic.AccessHistoryBC;
import com.clt.syscommon.management.opus.accesshistory.basic.AccessHistoryBCImpl;
import com.clt.syscommon.management.opus.accesshistory.event.AccesshistoryEvent;
import com.clt.syscommon.management.opus.accesshistory.event.LastLoginDateEvent;
import com.clt.syscommon.management.opus.accesshistory.integration.AccessHistoryDBDAO;
import com.clt.syscommon.management.opus.accesshistory.vo.AccessHistoryVO;
import com.clt.syscommon.management.opus.accesshistory.vo.LastLoginDateVO;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBC;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBCImpl;

/**
 * ALPS-AccessHistory Business Logic ServiceCommand - ALPS-AccessHistory 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author kyungbum kim
 * @see AccessHistoryDBDAO
 * @since J2EE 1.6
 */

public class AccessHistorySC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * AccessHistory system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("AccessHistorySC 시작");
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
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("AccesshistoryEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				AccesshistoryEvent event = (AccesshistoryEvent)e;
				String rHQ = (new OrganizationUtil()).getHeadQuaterCodeByOfcCd(event.getParam().get("ofc_cd"));
				if ( rHQ != null && !"".equals(event.getParam().get("rhq")) && !rHQ.equals(event.getParam().get("rhq")) ) {
					eventResponse = new GeneralEventResponse();
					eventResponse.setUserMessage("office code invalid !!!");
					return eventResponse;
				}
				eventResponse = getAccessHistoryKey(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = getAccessHistoryExcelKey(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = getAccessHistory(e);
			} else {
				eventResponse = getSystemCode(e);
			}
		}
		if (e.getEventName().equalsIgnoreCase("LastLoginDateEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				LastLoginDateEvent event = (LastLoginDateEvent)e;
				String rHQ = (new OrganizationUtil()).getHeadQuaterCodeByOfcCd(event.getParam().get("ofc_cd"));
				if ( rHQ != null && !"".equals(event.getParam().get("rhq")) && !rHQ.equals(event.getParam().get("rhq")) ) {
					eventResponse = new GeneralEventResponse();
					eventResponse.setUserMessage("office code invalid !!!");
					return eventResponse;
				}
				eventResponse = getLastLoginDateKey(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = getLastLoginDate(e);
			} else {
				eventResponse = getSystemCode(e);
			}
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
	private EventResponse getAccessHistoryKey(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		AccesshistoryEvent event = (AccesshistoryEvent)e;
		AccessHistoryBC command = new AccessHistoryBCImpl();

		try{
			String key = command.getAccessHistory(event.getParam());
			eventResponse.setETCData("key", key);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
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
	private EventResponse getAccessHistoryExcelKey(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		AccesshistoryEvent event = (AccesshistoryEvent)e;
		AccessHistoryBC command = new AccessHistoryBCImpl();

		try{
			String key = command.getAccessHistoryExcel(event.getParam());
			eventResponse.setETCData("key", key);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
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
	@SuppressWarnings("unchecked")
	private EventResponse getAccessHistory(Event e) throws EventException {
		String flag = "";
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		AccesshistoryEvent event = (AccesshistoryEvent)e;
		DBRowSet rowSet = null;
		String key = event.getParam().get("key");
		try{
			rowSet = (new BackEndJobMetaDataSelector(key)).getDbRowset();
			if ( rowSet.next() ) flag = rowSet.getString("jb_sts_flg");
			if ( flag.equals("3") ) {
				eventResponse.setRsVoList((List<AccessHistoryVO>)BackEndJobResult.loadFromFile(key));
			} else if ( flag.equals("4") ) {
				eventResponse.setUserMessage("Access History Search Fail!!");
			} else {
				eventResponse.setETCData("key", key);
			}
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
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
	private EventResponse getLastLoginDateKey(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		LastLoginDateEvent event = (LastLoginDateEvent)e;
		AccessHistoryBC command = new AccessHistoryBCImpl();

		try{
			String key = command.getLastLoginDate(event.getParam());
			eventResponse.setETCData("key", key);
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
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
	@SuppressWarnings("unchecked")
	private EventResponse getLastLoginDate(Event e) throws EventException {
		String flag = "";
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		LastLoginDateEvent event = (LastLoginDateEvent)e;
		DBRowSet rowSet = null;
		String key = event.getParam().get("key");
		try{
			rowSet = (new BackEndJobMetaDataSelector(key)).getDbRowset();
			if ( rowSet.next() ) flag = rowSet.getString("jb_sts_flg");
			if ( flag.equals("3") ) {
				eventResponse.setRsVoList((List<LastLoginDateVO>)BackEndJobResult.loadFromFile(key));
			} else if ( flag.equals("4") ) {
				eventResponse.setUserMessage("Last Login Date Search Fail!!");
			} else {
				eventResponse.setETCData("key", key);
			}
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
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
	private EventResponse getSystemCode(Event e) throws EventException {
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		SuperUserBC command = new SuperUserBCImpl();

		try{
			String[] list = command.searchSubSystemList();
			Arrays.sort(list);
			eventResponse.setETCData("sub_sys_cd", Arrays.toString(list));

			String[] rhqList = command.searchRhqList();
			Arrays.sort(rhqList);
			eventResponse.setETCData("rhq", Arrays.toString(rhqList));
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}

}