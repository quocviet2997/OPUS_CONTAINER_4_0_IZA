/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : VendorCodeBC.java
*@FileTitle : Vendor Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.22
*@LastModifier : 김종호
*@LastVersion : 1.0
* 2012.02.22 김종호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.basic;

import java.util.List;

import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ALPS-Bizcommon Business Logic Command Interface<br>
 * - ALPS-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Kim Yong Jin
 * @see ComCom0007EventResponse 참조
 * @since J2EE 1.4
 */

public interface VendorCodeBC {

	/**
	 * [COM_COM_0007]을 [SEARCH] 합니다.<br>
	 * 
	 * @param SearchVendorCodeVO searchVendorCodeVO
	 * @param int iPage
	 * @return List<SearchVendorCodeVO>
	 * @exception EventException
	 */
	public List<SearchVendorCodeVO> searchVendorCode(SearchVendorCodeVO searchVendorCodeVO, int iPage) throws EventException;
}