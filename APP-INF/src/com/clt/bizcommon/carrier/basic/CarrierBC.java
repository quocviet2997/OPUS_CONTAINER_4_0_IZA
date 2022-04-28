/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CarrierBC.java
*@FileTitle : Carrier
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.carrier.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.carrier.vo.CarrierListVO;
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
public interface CarrierBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Carrier화면에 대한 조회 이벤트 처리<br>
	 * @param CarrierListVO carrierListVO
	 * @param int iPage
	 * @return List<CarrierListVO>
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierList(CarrierListVO carrierListVO, int iPage) throws EventException;
	
	/**
	 * 
	 * @param Event e
	 * @return ArrayList<String>
	 * @throws EventException
	 */
	public ArrayList<String> setDefaultComboData(Event e) throws EventException;
	

}