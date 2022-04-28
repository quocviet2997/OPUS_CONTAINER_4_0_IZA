/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ChargeBC.java
*@FileTitle : Charge
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-20
*@LastModifier : JunBum Lee
*@LastVersion : 1.0
* 2012-02-20 JunBum Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.daylightsavingtime.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.daylightsavingtime.vo.DaylightSavingTimeListVO;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0N1EventResponse 참조
 * @since J2EE 1.4
 */
public interface DaylightSavingTimeBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Charge화면에 대한 조회 이벤트 처리<br>
	 * @param DaylightSavingTimeListVO daylightSavingTimeListVO
	 * @param int iPage
	 * @return List<DaylightSavingTimeListVO>
	 * @exception EventException
	 */
	public List<DaylightSavingTimeListVO> searchDaylightSavingTimeList(DaylightSavingTimeListVO daylightSavingTimeListVO, int iPage) throws EventException;

}