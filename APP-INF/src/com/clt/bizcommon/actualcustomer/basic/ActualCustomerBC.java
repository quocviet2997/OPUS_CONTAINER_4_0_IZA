/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Customer_02BC.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.actualcustomer.basic;

import com.clt.bizcommon.actualcustomer.event.ComEns042EventResponse;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author sangyool pak
 * @see ComEns042EventResponse 참조
 * @since J2EE 1.4
 */
public interface ActualCustomerBC  {

    /**
     * @param e COM_ENS_042Event
     * @return EventResponse COM_ENS_042EventResponse
     * @throws EventException
     */
    public EventResponse searchCustomerList(Event e) throws EventException;
    
    /**
     * @param e COM_ENS_042Event
     * @return EventResponse COM_ENS_042EventResponse
     * @throws EventException
     */
    public EventResponse searchActualCustomerList(Event e) throws EventException;

}