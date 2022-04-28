/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileSC.java
*@FileTitle : ExcelDownload
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.sample.file.exceldownload.basic.ExcelDataBC;
import com.clt.sample.file.exceldownload.basic.ExcelDataBCImpl;
import com.clt.sample.file.exceldownload.basic.ExcelDownloadBC;
import com.clt.sample.file.exceldownload.basic.ExcelDownloadBCImpl;
import com.clt.sample.file.exceldownload.event.ExceldownloadEvent;
import com.clt.sample.file.exceldownload.integration.ExcelDownloadDBDAO;
import com.clt.sample.file.exceldownloadusingrowset.basic.ExcelDownloadUsingRowsetBC;
import com.clt.sample.file.exceldownloadusingrowset.basic.ExcelDownloadUsingRowsetBCImpl;


/**
 * ALPS-File Business Logic ServiceCommand - ALPS-File 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see ExcelDownloadDBDAO
 * @since J2EE 1.6
 */

public class FileSC extends ServiceCommandSupport {

	/**
	 * File system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("FileSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * File system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("FileSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-File system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ExceldownloadEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = ComUpldFile(e);
			} else if (e.getFormCommand().isCommand(FormCommand.COMMAND01)) {
				eventResponse = excelDownload(e);
			}
		} else if(e.getEventName().equalsIgnoreCase("ExceldownloadusingrowsetEvent")){
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = ComUpldFile(e);
			} else if (e.getFormCommand().isCommand(FormCommand.COMMAND01)) {
				eventResponse = excelDownloadUsingRowset(e);
			} else if (e.getFormCommand().isCommand(FormCommand.COMMAND02)) {
				eventResponse = excelDownloadUsingRowsetWithTitle(e);
			}
		}
		return eventResponse;
	}
	
	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws EventException
	 */
	private EventResponse excelDownloadUsingRowsetWithTitle(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ExcelDownloadUsingRowsetBC command = new ExcelDownloadUsingRowsetBCImpl();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setCustomData("rowset", command.getRowSet());
		eventResponse.setCustomData("title", command.getTitle());
		eventResponse.setCustomData("columns", command.getColumns());
		eventResponse.setCustomData("fileName", "test.xls");
		eventResponse.setCustomData("isZip", false);
		return eventResponse;
	}

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws EventException
	 */
	private EventResponse excelDownloadUsingRowset(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ExcelDownloadUsingRowsetBC command = new ExcelDownloadUsingRowsetBCImpl();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setCustomData("rowset", command.getRowSet());
		eventResponse.setCustomData("fileName", "test.xls");
		eventResponse.setCustomData("isZip", false);
		return eventResponse;
	}

	/**
	 * This method does download.
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 */
	private EventResponse excelDownload(Event e) {
		// PDTO(Data Transfer Object including Parameters)
		ExcelDataBC command = new ExcelDataBCImpl();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setCustomData("vos", command.getVOs());
		eventResponse.setCustomData("title", command.getTitle());
		eventResponse.setCustomData("columns", command.getColumns());
		eventResponse.setCustomData("fileName", "test.xls");
		eventResponse.setCustomData("isZip", false);
		return eventResponse;
	}

	/**
	 * ExcelDownload : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse ComUpldFile(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ExceldownloadEvent event = (ExceldownloadEvent)e;
		ExcelDownloadBC command = new ExcelDownloadBCImpl();

		try{
			List<ComUpldFileVO> list = command.ComUpldFile(event.getComUpldFile());
			eventResponse.setRsVoList(list);
		}catch(EventException ex){
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}catch(Exception ex){
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}	
		return eventResponse;
	}
}