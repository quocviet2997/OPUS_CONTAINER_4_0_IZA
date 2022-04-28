/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : StaffBC.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.staff.basic;

import java.util.List;

import com.clt.bizcommon.staff.vo.SearchDeptListVO;
import com.clt.bizcommon.staff.vo.SearchStaffListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns091EventResponse 참조
 * @since J2EE 1.4
 */
public interface StaffBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * @param ofcCd
	 * @param userCd
	 * @param userNm
	 * @return List<SearchStaffListVO>
	 * @throws DAOException
	 */
	public List<SearchStaffListVO> searchStaffList(String ofcCd, String userCd, String userNm) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * @param ofcCd
	 * @return List<SearchDeptListVO>
	 * @throws DAOException
	 */
	public List<SearchDeptListVO> searchDeptList(String ofcCd) throws EventException;

}