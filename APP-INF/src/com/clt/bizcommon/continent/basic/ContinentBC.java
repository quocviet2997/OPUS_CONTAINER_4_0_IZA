/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentBC.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.continent.basic;

import java.util.List;

import com.clt.bizcommon.continent.vo.SearchContinentListVO;
import com.clt.bizcommon.state.event.ComEns0W1EventResponse;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0W1EventResponse 참조
 * @since J2EE 1.4
 */
public interface ContinentBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Continent화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return List<SearchContinentListVO>
	 * @exception EventException
	 */
	public List<SearchContinentListVO> searchContinentList() throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Continent화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SearchContinentListVO vo
	 * @return List<SearchContinentListVO>
	 * @exception EventException
	 */
	public List<SearchContinentListVO> searchContinentList(SearchContinentListVO vo) throws EventException;

}