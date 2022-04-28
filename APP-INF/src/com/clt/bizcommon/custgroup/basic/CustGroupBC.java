/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CustGroupBC.java
*@FileTitle : CustGroup
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : sungho park
*@LastVersion : 1.0
* 2012-02-21 sungho park
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.custgroup.basic;

import java.util.List;

import com.clt.bizcommon.custgroup.vo.SearchCustGroupVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author sungho park
 * @see ComCom006EventResponse 참조
 * @since J2EE 1.4
 */
public interface CustGroupBC  {

	/**
	 * CustGroup List 조회<br>
	 * @param String custGrpId
	 * @param String custGrpNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String mdmYn
	 * @param String deltFlg
	 * @param String custGrpAbbrNm
	 * @return List<SearchCustGroupVO>
	 * @throws EventException
	 */
	public List<SearchCustGroupVO> searchCustGroupList(String custGrpId, String custGrpNm, String ofcCd, int iPage, String mdmYn, String deltFlg, String custGrpAbbrNm) throws EventException;

}