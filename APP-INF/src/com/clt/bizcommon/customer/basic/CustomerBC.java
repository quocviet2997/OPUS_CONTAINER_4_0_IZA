/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CustomerBC.java
*@FileTitle : Customer
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-09 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.customer.basic;

import java.util.List;

import com.clt.bizcommon.customer.vo.SearchCustomerVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author sangyool pak
 * @see ComEns041EventResponse 참조
 * @since J2EE 1.4
 */
public interface CustomerBC  {

	/**
	 * Customer List 조회<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List<SearchCustomerVO>
	 * @throws EventException
	 */
	public List<SearchCustomerVO> searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws EventException;

	/**
	 * Customer List 조회<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String mdmYN
	 * @param String deltFlg
	 * @param String locCd
	 * @param String creditFlg
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List
	 * @throws EventException
	 */
	public List searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust, String mdmYN, String deltFlg, String locCd, String creditFlg, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws EventException;

}