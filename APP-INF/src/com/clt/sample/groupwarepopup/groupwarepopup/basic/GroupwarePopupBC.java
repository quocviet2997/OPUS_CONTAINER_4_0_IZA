/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : GroupwarePopupBC.java
*@FileTitle : GROUPWARE_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.groupwarepopup.groupwarepopup.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComEmlSndInfoVO;

/**
 * NIS2010-Groupwarepopup Business Logic Command Interface<br>
 * - NIS2010-Groupwarepopup에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Groupware_popupEventResponse 참조
 * @since J2EE 1.6
 */

public interface GroupwarePopupBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Groupwarepopup화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e Groupware_popupEvent
	 * @return EventResponse Groupware_popupEventResponse
	 * @exception EventException
	 */
	public List<ComEmlSndInfoVO> comEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException;
}