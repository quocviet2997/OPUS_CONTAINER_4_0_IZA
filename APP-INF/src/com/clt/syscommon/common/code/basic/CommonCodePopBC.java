/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePopBC.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.code.basic;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * NIS-System Common Business Logic Command Interface<br>
 * - NIS-System Common에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author HOESOO_JANG
 * @see CommonCodePopEventResponse 참조
 * @since J2EE 1.4
 */
public interface CommonCodePopBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * CommonCodePop화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e CommonCodePopEvent
	 * @return EventResponse CommonCodePopEventResponse
	 * @exception EventException
	 */
	public EventResponse searchCommonCodePop(Event e) throws EventException;


}