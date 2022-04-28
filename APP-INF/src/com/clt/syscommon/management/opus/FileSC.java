/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileSC.java
*@FileTitle : File Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.syscommon.management.opus.file.basic.FileManagementBC;
import com.clt.syscommon.management.opus.file.basic.FileManagementBCImpl;
import com.clt.syscommon.management.opus.file.event.UiComFileuploadEvent;
import com.clt.syscommon.management.opus.file.integration.FileManagementDBDAO;


/**
 * NIS2010-File Business Logic ServiceCommand - NIS2010-File 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see FileManagementDBDAO
 * @since J2EE 1.4
 */

public class FileSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * File system 업무 시나리오 선행작업<br>
	 * UI_COM_fileupload업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	/**
	 * File system 업무 시나리오 마감작업<br>
	 * UI_COM_fileupload 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("FileSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-File system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("UiComFileuploadEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = getComUpldFile(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI02)) {
				eventResponse = deleteFileComUpldFile(e);
			}
			else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
				eventResponse = deleteComUpldFile(e);
			}
		}
		return eventResponse;
	}
	/**
	 * 조회 이벤트 처리<br>
	 * FileManagement의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse getComUpldFile(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UiComFileuploadEvent event = (UiComFileuploadEvent)e;
		FileManagementBC command = new FileManagementBCImpl();
		List<ComUpldFileVO> list = command.getComUpldFile(event.getComUpldFileVO());
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoList(list);
		return eventResponse;
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * FileManagement의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse deleteFileComUpldFile(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		UiComFileuploadEvent event = (UiComFileuploadEvent)e;
		FileManagementBC command = new FileManagementBCImpl();
		try{
			begin();
			command.deleteFileComUpldFile(event.getComUpldFileVOS(),account);
			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * FileManagement의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse deleteComUpldFile(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		UiComFileuploadEvent event = (UiComFileuploadEvent)e;
		FileManagementBC command = new FileManagementBCImpl();
		try{
			begin();
			command.deleteComUpldFile(event.getComUpldFileVOS(),account);
			eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}
}