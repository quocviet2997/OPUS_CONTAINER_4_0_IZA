/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VVDChartBC.java
*@FileTitle : VVDChart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-19
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-19 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvdchart.basic;

import java.util.List;
 
import com.clt.bizcommon.vvdchart.vo.VVDChartListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0P1EventResponse 참조
 * @since J2EE 1.4
 */
public interface VVDChartBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * VVDChart화면에 대한 조회 이벤트 처리<br>
	 * @param String scnr_id
	 * @param String depth
	 * @param String chkDepth
	 * @return List<VVDChartListVO>
	 * @exception EventException
	 */
	public List<VVDChartListVO> searchVVDChartList(String scnr_id, String depth, String chkDepth) throws EventException;

}