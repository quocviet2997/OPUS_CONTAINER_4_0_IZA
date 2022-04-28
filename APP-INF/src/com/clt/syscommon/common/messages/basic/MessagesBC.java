/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MessagesBC.java
*@FileTitle : Message
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.02 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.basic;

import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.messages.event.MessageEvent;
import com.clt.syscommon.common.messages.event.MessageEventResponse;


/**
 * NIS2010-Messages Business Logic Command Interface<br>
 * - NIS2010-Messages에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jung_InSun
 * @see MessageEventResponse 참조
 * @since J2EE 1.4
 */

public interface MessagesBC {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Messages 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SignOnUserAccount account
	 * @return List[]
	 * @exception EventException
	 */
	public List[] searchMessagesList(SignOnUserAccount account) throws EventException;
	
	/**
	 * check 이벤트 처리<br>
	 * 메인 화면의 메세지 확인 이벤트 처리<br>
	 * 
	 * @param userId String
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet checkMessagesList(String userId) throws EventException;
	
	/**
	 * 멀티 이벤트 처리<br>
	 * Messages 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @exception EventException
	 */
	public void addComMessages(Event e) throws EventException;

	/**
	 * 수정 이벤트 처리<br>
	 * Messages 화면에 대한 수정 이벤트 처리<br>
	 * 
	 * @param event MessageEvent
	 * @exception EventException
	 */
	public void modifyMessage(MessageEvent event) throws EventException;
}
