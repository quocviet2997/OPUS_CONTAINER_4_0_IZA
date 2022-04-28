/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EQOrgChartBC.java
*@FileTitle : EQ Organization Chart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-11
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-11 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.eqorgchart.basic;

import java.util.List;

import com.clt.bizcommon.eqorgchart.vo.EQQrgChartListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0O1EventResponse 참조
 * @since J2EE 1.4
 */
public interface EQOrgChartBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * EQOrgChart화면에 대한 조회 이벤트 처리<br>
	 * @param String depth
	 * @param String chkDepth
	 * @param String sccFlag
	 * @return List<EQQrgChartListVO>
	 * @exception EventException
	 */
	public List<EQQrgChartListVO> searchEQOrgChartList(String depth, String chkDepth, String sccFlag) throws EventException;

}