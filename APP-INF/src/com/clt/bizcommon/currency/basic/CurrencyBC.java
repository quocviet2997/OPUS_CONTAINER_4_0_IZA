/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CurrencyBC.java
*@FileTitle : Currency Code
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.22
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.04.22 박의수
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.currency.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.MdmCurrencyVO;

/**
 * NIS2010-Bizcommon Business Logic Command Interface<br>
 * - NIS2010-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Eui-Su Park
 * @see Ui_com_ens_n13EventResponse 참조
 * @since J2EE 1.4
 */

public interface CurrencyBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Currency화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param MdmCurrencyVO mdmcurrencyvo
	 * @return List<MdmCurrencyVO>
	 * @exception EventException
	 */
	public List<MdmCurrencyVO> searchCurrencyList(MdmCurrencyVO mdmcurrencyvo) throws EventException;
}