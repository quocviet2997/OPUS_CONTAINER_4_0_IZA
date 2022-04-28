/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CountryBC.java
*@FileTitle : Country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.country.basic;

import java.util.List;

import com.clt.bizcommon.country.vo.CountryListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0M1EventResponse 참조
 * @since J2EE 1.4
 */
public interface CountryBC  {

	
	/**
	 * 조회 이벤트 처리<br>
	 * Country화면에 대한 조회 이벤트 처리<br>
	 * @param CountryListVO countryListVO
	 * @param int iPage
	 * @return List<CountryListVO>
	 * @exception EventException
	 */
	public List<CountryListVO> searchCountryList(CountryListVO countryListVO, int iPage) throws EventException;

}