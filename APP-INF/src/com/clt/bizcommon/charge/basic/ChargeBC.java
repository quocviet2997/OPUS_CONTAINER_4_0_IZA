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
package com.clt.bizcommon.charge.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.charge.vo.ChargeListVO;
import com.clt.bizcommon.charge.vo.RepChargeVO;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0N1EventResponse 참조
 * @since J2EE 1.4
 */
public interface ChargeBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Charge화면에 대한 조회 이벤트 처리<br>
	 * @param ChargeListVO chargeListVO
	 * @param int iPage
	 * @return List<ChargeListVO>
	 * @exception EventException
	 */
	public List<ChargeListVO> searchChargeList(ChargeListVO chargeListVO, int iPage) throws EventException;
	
	/**
	 * Rep.Charge의 모든 목록을 가져온다.<br>
	 * @return List<RepChargeVO>
	 * @throws DAOException
	 */
	public List<RepChargeVO> searchRepChgCd() throws EventException;

}