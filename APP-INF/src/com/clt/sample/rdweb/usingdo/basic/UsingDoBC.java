/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UsingDoBC.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.table.ComUpldFileVO;

/**
 * NIS2010-Rdweb Business Logic Command Interface<br>
 * - NIS2010-Rdweb에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author 
 * @see RdwebsampleEventResponse 참조
 * @since J2EE 1.4
 */

public interface UsingDoBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Usingdo화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e RdwebsampleEvent
	 * @return EventResponse RdwebsampleEventResponse
	 * @exception EventException
	 */
	public List<ComUpldFileVO> comUpldFileVO(ComUpldFileVO comUpldFileVO) throws EventException;
}