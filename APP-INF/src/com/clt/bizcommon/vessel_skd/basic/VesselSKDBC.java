/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_01BC.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-07 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel_skd.basic;

import com.clt.bizcommon.vessel_skd.event.ComEns0B1EventResponse;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyunsu, Ryu
 * @see ComEns0B1EventResponse 참조
 * @since J2EE 1.4
 */
public interface VesselSKDBC  {
    
	/**
	 * Vessel Schedule List 조회
     * @param Event e
     * @return DBRowSet
     * @exception EventException
	 */
	public DBRowSet searchVessel_SKDList( Event e ) throws EventException;

}