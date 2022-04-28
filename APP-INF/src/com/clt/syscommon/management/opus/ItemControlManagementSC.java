/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ItemControlManagementDBDAO.java
 *@FileTitle : Item Control Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2013.06.28
 *@LastModifier : 경종윤
 *@LastVersion : 1.0
 * 2013.06.28 경종윤 
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.util.OrganizationUtil;
import com.clt.syscommon.management.opus.accesshistory.integration.AccessHistoryDBDAO;
import com.clt.syscommon.management.opus.itemcontrolmanagement.basic.ItemControlManagementBC;
import com.clt.syscommon.management.opus.itemcontrolmanagement.basic.ItemControlManagementBCImpl;
import com.clt.syscommon.management.opus.itemcontrolmanagement.event.ItemControlManagementEvent;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBC;
import com.clt.syscommon.management.opus.superuser.basic.SuperUserBCImpl;
import com.clt.syscommon.management.opus.superuser.event.SuperUserEvent;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;

/**
 * ALPS-AccessHistory Business Logic ServiceCommand - ALPS-AccessHistory 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author kyungbum kim
 * @see AccessHistoryDBDAO
 * @since J2EE 1.6
 */

public class ItemControlManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * AccessHistory system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("SuperUserSC 시작");
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
		log.debug("SuperUserSC 종료");
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
		if (e.getEventName().equalsIgnoreCase("ItemControlManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01) || e.getFormCommand().isCommand(FormCommand.SEARCH11)) {

				eventResponse = searchItemControlList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageItemControlList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.DEFAULT)) {
				eventResponse = getSystemCode(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH40)) {
				eventResponse = searchUiSetUpInfo(e);
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
	private EventResponse getSystemCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		SuperUserBC command = new SuperUserBCImpl();

		try{
			String[] list = command.searchSubSystemList();
			Arrays.sort(list);
			eventResponse.setETCData("sub_sys_cd", Arrays.toString(list));
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}
	/**
	 * searchItemControlList : [이벤트]<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchItemControlList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ItemControlManagementEvent event = (ItemControlManagementEvent)e;
		ItemControlManagementBC command = new ItemControlManagementBCImpl();

		try{
			List<ItemControlManagementVO> list = command.searchItemControlList(event.getItemControlManagementVO());
			
			if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse.setRsVoList(list);
			} else if(e.getFormCommand().isCommand(FormCommand.SEARCH11)) {
				eventResponse.setETCData("retVal", (list.size() > 0) ? "Y" : "N");
			}
			
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}	
	
	/**
	 * searchItemControlList : [이벤트]<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchUiSetUpInfo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ItemControlManagementEvent event = (ItemControlManagementEvent)e;
		ItemControlManagementBC command = new ItemControlManagementBCImpl();

		try{
			List<ItemControlManagementVO> list = command.searchUiSetUpInfo(event.getItemControlManagementVO());
			eventResponse.setRsVoList(list);
			
		}catch(EventException ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}catch(Exception ex){
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}	
		return eventResponse;
	}		
	
	/**
	 * 멀티 이벤트 처리<br>
	 * event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse manageItemControlList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ItemControlManagementEvent event = (ItemControlManagementEvent)e;
		ItemControlManagementBC command = new ItemControlManagementBCImpl();
		try{
			begin();
			command.manageItemControlList(event.getItemControlManagementVOs(), event.getSignOnUserAccount());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}

}