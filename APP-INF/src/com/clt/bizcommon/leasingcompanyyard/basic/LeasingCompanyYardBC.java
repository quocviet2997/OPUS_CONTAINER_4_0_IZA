/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LeasingCompanyYardBC.java
*@FileTitle : LeasingCompanyYard
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier : Kim Min Soo
*@LastVersion : 1.0
* 2006-10-16 Kim Min Soo
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.leasingcompanyyard.basic;

import java.util.List;

import com.clt.bizcommon.leasingcompanyyard.vo.SearchLeasingCompanyYardListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0J1EventResponse 참조
 * @since J2EE 1.4
 */
public interface LeasingCompanyYardBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * LeasingCompanyYard화면에 대한 조회 이벤트 처리<br>
	 * @param SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO
	 * @return List<SearchLeasingCompanyYardListVO>
	 * @exception EventException
	 */
	public List<SearchLeasingCompanyYardListVO> searchLeasingCompanyYardList(SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO) throws EventException;

}