/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RevenueLaneBC.java
*@FileTitle : ZONE CODE 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : SEOK JIN
*@LastVersion : 1.0
* 2012-02-21 SEOK JIN
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.revenuelane.basic;

import java.util.List;

import com.clt.bizcommon.revenuelane.vo.SearchRevenueLaneListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon
 * @see ComEns081EventResponse 참조
 * @since J2EE 1.4
 */
public interface RevenueLaneBC  {
	
   /**
    * RevenueLane List 조회<br>
    * @param rlaneCd
    * @param rlaneNm
    * @param status
    * @return List<SearchRevenueLaneListVO>
    * @throws EventException
    */
    public List<SearchRevenueLaneListVO> searchRevenueLaneList(String rlaneCd, String rlaneNm, String status) throws EventException;

}