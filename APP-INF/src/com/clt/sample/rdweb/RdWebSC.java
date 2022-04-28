/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RdWebSC.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb;

import java.util.List;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.sample.rdweb.usingdo.basic.UsingDoBC;
import com.clt.sample.rdweb.usingdo.basic.UsingDoBCImpl;
import com.clt.sample.rdweb.usingdo.event.RdwebsampleEvent;
import com.clt.sample.rdweb.usingdo.integration.UsingDoDBDAO;


/**
 * NIS2010-RdWeb Business Logic ServiceCommand - NIS2010-RdWeb 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author 
 * @see UsingDoDBDAO
 * @since J2EE 1.4
 */

public class RdWebSC extends ServiceCommandSupport {
	// Login User Information

	/**
	 * RdWeb system 업무 시나리오 선행작업<br>
	 * RdWebSample업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
	}

	/**
	 * RdWeb system 업무 시나리오 마감작업<br>
	 * RdWebSample 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("RdWebSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-RdWeb system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("RdwebsampleEvent")) {
//			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = comUpldFileVO(e);
//			}
		}
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * UsingDo의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse comUpldFileVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		RdwebsampleEvent event = (RdwebsampleEvent)e;
		UsingDoBC command = new UsingDoBCImpl();
		List<ComUpldFileVO> list = command.comUpldFileVO(event.getComUpldFileVO());
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setCustomData("RD",list);
		return eventResponse;
	}
}