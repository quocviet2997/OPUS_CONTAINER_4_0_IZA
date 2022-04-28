/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LocationBC.java
*@FileTitle : Location조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : HyungChoonRoh
*@LastVersion : 1.0
* 2006-08-03 HyungChoonRoh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.location.basic;

import java.util.List;

import com.clt.bizcommon.location.event.ComEns051Event;
import com.clt.bizcommon.location.vo.SearchLocationDetailVO;
import com.clt.bizcommon.location.vo.SearchLocationListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author HyungChoonRoh
 * @see ComEns051EventResponse 참조
 * @since J2EE 1.4
 */
public interface LocationBC  {
	
	/**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage) throws EventException;
    
    /**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg)throws EventException;
    
    /**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @param String sccFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg, String sccFlg)throws EventException;
    
    /**
     * 
     * @param locCd
     * @return List<SearchLocationDetailVO>
     * @Exception EventException
     */
    public List<SearchLocationDetailVO> searchLocationDetail(String locCd) throws EventException;

    /**
     * 
     * @param ComEns051Event event
     * @return List<SearchLocationDetailVO>
     * @Exception EventException
     */
	public List<SearchLocationDetailVO> searchLocationDetail( ComEns051Event event)throws EventException;

	

	/**
	 * RCC, LCC <br>
	 * 
	 * @param String loc_grp_cd
	 * @param String loc_cd
	 * @return CommonRsVO
	 * @exception EventException
	 */	
//	public CommonRsVO searchRccLccCd(String loc_grp_cd, String loc_cd) throws EventException;
    
}