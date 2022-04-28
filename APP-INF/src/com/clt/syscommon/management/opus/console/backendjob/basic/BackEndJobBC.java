/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackEndJobBC.java
*@FileTitle : COM_BACKENDJOB
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.console.backendjob.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.ComBakEndJbVO;

/**
 * ALPS-Console Business Logic Command Interface<br>
 * - ALPS-Console에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Com_backendjobEventResponse 참조
 * @since J2EE 1.6
 */

public interface BackEndJobBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComBakEndJbVO	comBakEndJbVO
	 * @return List<ComBakEndJbVO>
	 * @exception EventException
	 */
	public List<ComBakEndJbVO> comBakEndJbVO(ComBakEndJbVO comBakEndJbVO) throws EventException;

	/**
	 * This method kills a thread
	 * @author Jeong-Hoon, KIM
	 * @param toDelComBakEndJbVOs
	 * @return List<ComBakEndJbVO>
	 * @throws EventException
	 */
	public List<ComBakEndJbVO> threadKill(ComBakEndJbVO[] toDelComBakEndJbVOs) throws EventException;
}