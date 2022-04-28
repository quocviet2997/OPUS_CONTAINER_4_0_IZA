/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ServiceScopeBC.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.servicescope.basic;

import java.util.List;

import com.clt.bizcommon.servicescope.vo.SearchServiceScopeListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0L1EventResponse 참조
 * @since J2EE 1.4
 */
public interface ServiceScopeBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * ServiceScope화면에 대한 조회 이벤트 처리<br>
	 * @param SearchServiceScopeListVO searchServiceScopeListVO
	 * @param int iPage
	 * @return List<SearchServiceScopeListVO>
	 * @exception EventException
	 */
	public List<SearchServiceScopeListVO> searchServiceScopeList(SearchServiceScopeListVO searchServiceScopeListVO, int iPage) throws EventException;

}