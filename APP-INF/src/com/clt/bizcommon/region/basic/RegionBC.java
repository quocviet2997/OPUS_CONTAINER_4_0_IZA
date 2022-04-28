/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RegionBC.java
*@FileTitle : Region
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.region.basic;

import java.util.List;

import com.clt.bizcommon.region.vo.SearchRegionListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0J1EventResponse 참조
 * @since J2EE 1.4
 */
public interface RegionBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * Region화면에 대한 조회 이벤트 처리<br>
	 * @param SearchRegionListVO searchRegionListVO
	 * @param int iPage
	 * @return List<SearchRegionListVO>
	 * @exception EventException
	 */
	public List<SearchRegionListVO> searchRegionList(SearchRegionListVO searchRegionListVO, int iPage) throws EventException;

}