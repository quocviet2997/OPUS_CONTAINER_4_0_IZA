/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackEndJobSC.java
*@FileTitle : BackEndJob
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.backendjob;

import com.clt.framework.component.backend.core.WorkOnLongTxRemoteServerManager;
import com.clt.framework.component.backend.support.BackEndJobException;
import com.clt.framework.component.backend.support.BackEndJobResult;
import com.clt.framework.component.backend.vo.WorkOnLongTxRemoteServerInfo;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.sample.backendjob.thread.basic.BackEndJobSearchSampleBC;
import com.clt.sample.backendjob.thread.basic.BackEndJobSearchSampleBCImpl;
import com.clt.sample.backendjob.thread.basic.BackEndJobStatusSearchSampleBC;
import com.clt.sample.backendjob.thread.basic.BackEndJobStatusSearchSampleBCImpl;
import com.clt.sample.backendjob.workonremotelongtxserver.basic.WorkOnRemoteLongTxServerSampleBC;
import com.clt.sample.backendjob.workonremotelongtxserver.basic.WorkOnRemoteLongTxServerSampleBCImpl;


/**
 * ALPS-BackEndJob Business Logic ServiceCommand - ALPS-BackEndJob 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author Jeong-Hoon, Kim
 * @see UsingTimerDBDAO
 * @since J2EE 1.6
 */

public class BackEndJobSampleSC extends ServiceCommandSupport {
	// Login User Information 
	private SignOnUserAccount account = null;

	/**
	 * BackEndJob system 업무 시나리오 선행작업<br>
	 * 업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		log.debug("BackEndJobSC 시작");
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * BackEndJob system 업무 시나리오 마감작업<br>
	 * 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("BackEndJobSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * ALPS-BackEndJob system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		System.out.println(">>  " + e.getEventName() );
		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("BackEndJobSampleEvent")) {
			
			if(e.getFormCommand().isCommand(FormCommand.COMMAND01)) {//It starts a job of backend. 1
				eventResponse = doBackEndJob(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {//It gets a status of backendjob. 2
				eventResponse = ComBakEndJbVO(e);
			}else if(e.getFormCommand().isCommand(FormCommand.SEARCHLIST)){//It returns a result. 3
				try {
					eventResponse = getResult(e);
				} catch (BackEndJobException e1) {
					throw new EventException(e1.getMessage());
				}
			}
			
		}else if (e.getEventName().equalsIgnoreCase("WorkOnRemoteLongTxServerSampleEvent")) {
			
			if(e.getFormCommand().isCommand(FormCommand.COMMAND01)) {//It starts a job of backend. 1
				eventResponse = doWorkOnRemoteLongTXServerJob(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {//It gets a status of backendjob. 2
				eventResponse = getRemoteLongTxJobStatus(e);
			}else if(e.getFormCommand().isCommand(FormCommand.SEARCHLIST)){//It returns a result. 3
				try {
					eventResponse = getRemoteLongTxResult(e);
				} catch (BackEndJobException e1) {
					throw new EventException(e1.getMessage());
				}
			}			
		}
		return eventResponse;
	}

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 */
	private EventResponse doBackEndJob(Event e) {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BackEndJobSearchSampleBC command = new BackEndJobSearchSampleBCImpl();
		eventResponse.setETCData("BackEndJobKey", command.doStart(account));
		return eventResponse;
	}


	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws BackEndJobException
	 */
	private EventResponse getResult(Event e) throws BackEndJobException {
		String key = (String)e.getAttribute("KEY");
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setETCData("RESULT",(String)BackEndJobResult.loadFromFile(key));
		return eventResponse;
	}
	
	/**
	 * BackEndJob : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse ComBakEndJbVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BackEndJobStatusSearchSampleBC command = new BackEndJobStatusSearchSampleBCImpl();
		
		String status = command.ComBakEndJbVO((String)e.getAttribute("KEY"));
		eventResponse.setETCData("jb_sts_flg", status);
		return eventResponse;
	}
	
	
	
	
	
	
	//WorkOnRemoteLongTXServerJobKey
	/**
	 * Remote Long Tx Server의 SC.method를 호출한다. 
	 * 
	 */
	private EventResponse doWorkOnRemoteLongTXServerJob(Event e) {

		GeneralEventResponse eventResponse = new GeneralEventResponse();
		WorkOnLongTxRemoteServerManager workOnRemoteLongTXServerJobManager = new WorkOnLongTxRemoteServerManager();
		
		WorkOnLongTxRemoteServerInfo info = new WorkOnLongTxRemoteServerInfo();
		info.setCallScName("com.clt.sample.backendjob.BackEndJobSampleSC");
		info.setCallMethodName("doRemoteLongTXServerWork");
		info.setEvent(e);
		info.setUserId(account.getUsr_id());
		info.setJobMessage("It's WorkOnLongTxRemoteServerManager Test");
		
		/*
		 * Options. 
		 */
		/*
			info.setJmsServerUrl(SiteConfigFactory.getWhenNullThrowException("COM.BACKEND.REMOTE.JMSSERVER.URL"));
		    info.setJmsServerFactory(SiteConfigFactory.getWhenNullThrowException("COM.BACKEND.REMOTE.JMSSERVER.FACTORY")); 
		    info.setJmsServerQueueName(SiteConfigFactory.getWhenNullThrowException("COM.BACKEND.REMOTE.JMSSERVER.QUEUE")); 
		    info.setResultDirectory(SiteConfigFactory.getWhenNullThrowException("COM.BACKEND.RESULT.DIRECTORY"));
		*/
		String tKey = workOnRemoteLongTXServerJobManager.execute(info);
		eventResponse.setETCData("WorkOnRemoteLongTXServerJobKey", tKey );
		return eventResponse;
	}
	
	/**
	 * Remote Server로 부터 Job을 호출 받는다. 
	 * @return EventResponse
	 * @throws EventException
	 */
	public EventResponse doRemoteLongTXServerWork(Event e) throws EventException
	{
		GeneralEventResponse eventResponse = null;
		try{
			eventResponse = new GeneralEventResponse();
			WorkOnRemoteLongTxServerSampleBC command = new WorkOnRemoteLongTxServerSampleBCImpl();
			eventResponse.setETCData("WorkOnRemoteLongTXServerJobResult", command.getBackEndjobWorkOnLongTxRemoteServerWork(e.getSignOnUserAccount().getUsr_id()));
		}catch(EventException ex){
			throw ex;
		}catch(Exception ex){
			throw new EventException(new ErrorHandler("PRI00340",new String[]{}).getMessage(), ex);
		}

		return eventResponse;
	}

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws BackEndJobException
	 */
	private EventResponse getRemoteLongTxResult(Event e) throws BackEndJobException {
		String key = (String)e.getAttribute("KEY");
		return (GeneralEventResponse)BackEndJobResult.loadFromFile(key);
	}
	
	/**
	 * BackEndJob : [이벤트]<br>
	 * [비즈니스대상]을 [행위]합니다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse getRemoteLongTxJobStatus(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		BackEndJobStatusSearchSampleBC command = new BackEndJobStatusSearchSampleBCImpl();
		
		String status = command.ComBakEndJbVO((String)e.getAttribute("KEY"));
		eventResponse.setETCData("jb_sts_flg", status);
		return eventResponse;
	}
	

	
}