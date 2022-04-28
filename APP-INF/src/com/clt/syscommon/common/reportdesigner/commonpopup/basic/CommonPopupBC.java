/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CommonPopupBC.java
*@FileTitle : COM_RD_COMMON_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.08.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.reportdesigner.commonpopup.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.ComBakEndJbVO;

/**
 * ALPS-Reportdesigner Business Logic Command Interface<br>
 * - ALPS-Reportdesigner에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Com_rd_common_popupEventResponse 참조
 * @since J2EE 1.6
 */

public interface CommonPopupBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComBakEndJbVO	comBakEndJbVO
	 * @return List<ComBakEndJbVO>
	 * @exception EventException
	 */
	public List<ComBakEndJbVO> comBakEndJbVO(ComBakEndJbVO comBakEndJbVO) throws EventException;
}