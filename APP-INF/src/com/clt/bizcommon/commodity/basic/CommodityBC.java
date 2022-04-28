/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommodityBC.java
*@FileTitle : Commodity정보조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-08-03 Kildong_hong
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.basic;

import java.util.List;

import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.bizcommon.commodity.vo.SearchCommodityListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @date	2006.08.03
 * @author	sungseok, choi
 * @see 	ComEns011EventResponse 참조
 * @since 	J2EE 1.4
 */
public interface CommodityBC  {

    /**
     * 조회 이벤트 처리<br>
     * Vessel화면에 대한 조회 이벤트 처리<br>
     * @param String cmdtCd
     * @param String repCmdtCd
     * @param String repImdgLvlCd
     * @param String cmdtNm
     * @param int iPage
     * @return List<SearchCommodityListVO>
     * @throws EventException
     */
    public List<SearchCommodityListVO> searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage) throws EventException;

    /**
     * 조회 이벤트 처리<br>
     * Vessel화면에 대한 조회 이벤트 처리<br>
     * @param String cmdtCd
     * @param String repCmdtCd
     * @param String repImdgLvlCd
     * @param String cmdtNm
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchCommodityListVO>
     * @throws EventException
     */
	public List searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage, String mdmYN, String deltFlg)  throws EventException;
    
    
	/**
	 * Commodity Code를 입력하기 위해 Code를 검색(Com_Ens_012)  <br>
	 *  
	 * @param SearchCmdtCdRepCmdtCdVO   vo
	 * @return List<SearchCmdtCdRepCmdtCdVO>
	 * @exception EventException
	 */
	public List<SearchCmdtCdRepCmdtCdVO> searchCmdtCdRepCmdtCd(	SearchCmdtCdRepCmdtCdVO vo	) throws EventException;
	
	/**
	 * Commodity Code를 존재 유무 검색 위해 Code를 검색(Com_Ens_012)  <br>
	 *  
	 * @param MoreInfoVO   MoreInfoVO
	 * @return List<MoreInfoVO>
	 * @exception EventException
	 */
//	public List<MoreInfoVO> checkCmdtCd(	MoreInfoVO moreInfoVO	) throws EventException;


	
}