/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MovementBC.java
*@FileTitle : Movement Status Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2012.02.17 김종옥
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.activity.basic;

import java.util.List;

import com.clt.bizcommon.activity.vo.SearchMdmActivityVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.MdmMvmtStsVO;

/**
 * NIS2010-Bizcommon Business Logic Command Interface<br>
 * - NIS2010-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author KIM JONG OCK
 * @see COM_COM_0010EventResponse 참조
 * @since J2EE 1.4
 */

public interface ActivityBC {

	/**
	 * 조회 이벤트 처리<br>
	 * Movement화면에 대한 조회 이벤트 처리<br>
	 * @param SearchMdmActivityVO mdmactivityvo
	 * @return List<SearchMdmActivityVO>
	 * @throws EventException
	 */
	public List<SearchMdmActivityVO> searchActivityList(SearchMdmActivityVO mdmactivityvo) throws EventException;
}