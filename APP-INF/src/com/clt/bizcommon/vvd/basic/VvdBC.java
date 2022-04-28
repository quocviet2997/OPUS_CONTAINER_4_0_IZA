/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_02BC.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvd.basic;

import java.util.List;

import com.clt.bizcommon.vvd.vo.SearchVvdListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyunsu, Ryu
 * @see ComEns0B2EventResponse 참조
 * @since J2EE 1.4
 */
public interface VvdBC  {
    
	/**
	 * 
	 * VVD 조회 <br>
	 * @param etDeta
	 * @param sdDate
	 * @param edDate
	 * @param vvdCd
	 * @param locCd
	 * @param laneCd
	 * @param oper
	 * @param iPage
	 * @return
	 * @throws EventException
	 */
	public List<SearchVvdListVO> searchVvdList(String etDeta, String sdDate, String edDate, String vvdCd, String locCd, String laneCd, String oper, int iPage) throws EventException;

}