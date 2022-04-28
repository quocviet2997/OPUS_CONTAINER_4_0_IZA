/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RepCommodityBC.java
*@FileTitle : RepCommodity
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.repcommodity.basic;

import java.util.List;

import com.clt.bizcommon.repcommodity.vo.SearchRepCommodityListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0K1EventResponse 참조
 * @since J2EE 1.4
 */
public interface RepCommodityBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * RepCommodity화면에 대한 조회 이벤트 처리<br>
	 * @param SearchRepCommodityListVO searchRepCommodityListVO
	 * @return List<SearchRepCommodityListVO>
	 * @exception EventException
	 */
	public List<SearchRepCommodityListVO> searchRepCommodityList(SearchRepCommodityListVO searchRepCommodityListVO) throws EventException;

}