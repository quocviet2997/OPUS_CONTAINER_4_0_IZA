/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SalesRepBC.java
*@FileTitle : SalesRep
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : Kim Yong Jin
*@LastVersion : 1.0
* 2012-02-21 Kim Yong Jin
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.salesrep.basic;

import java.util.List;

import com.clt.bizcommon.salesrep.vo.SalesRepListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Kim Yong Jin
 * @see ComEns0M1EventResponse 참조
 * @since J2EE 1.4
 */
public interface SalesRepBC  {

	
	/**
	 * 조회 이벤트 처리<br>
	 * Country화면에 대한 조회 이벤트 처리<br>
	 * @param SalesRepListVO salesRepListVO
	 * @return List<SalesRepListVO>
	 * @exception EventException
	 */
	public List<SalesRepListVO> searchSalesRepList(SalesRepListVO salesRepListVO) throws EventException;

}