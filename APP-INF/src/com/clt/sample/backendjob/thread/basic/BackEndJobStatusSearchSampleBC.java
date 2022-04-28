/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UsingTimerBC.java
*@FileTitle : BackEndJob
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.backendjob.thread.basic;

import com.clt.framework.core.layer.event.EventException;

/**
 * ALPS-Backendjob Business Logic Command Interface<br>
 * - ALPS-Backendjob에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @since J2EE 1.6
 */

public interface BackEndJobStatusSearchSampleBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComBakEndJbVO	comBakEndJbVO
	 * @return List<ComBakEndJbVO>
	 * @exception EventException
	 */
	public String ComBakEndJbVO(String object) throws EventException;
}