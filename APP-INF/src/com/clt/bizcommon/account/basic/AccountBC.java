/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AccountBC.java
*@FileTitle : Account Code
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.04.20 김석준
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.account.basic;

import java.util.List;

import com.clt.bizcommon.account.vo.SearchMdmAccountVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.MdmAccountVO;


/**
 * NIS2010-Bizcommon Business Logic Command Interface<br>
 * - NIS2010-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Suk Jun Kim
 * @see Com_ens_n11EventResponse 참조
 * @since J2EE 1.4
 */

public interface AccountBC {

	/**
	 * 조회 이벤트 처리<br>
	 * Account화면에 대한 조회 이벤트 처리<br>
	 * @param SearchMdmAccountVO mdmaccountvo
	 * @return List<MdmAccountVO>
	 * @throws EventException
	 */
	public List<MdmAccountVO> searchAccountList(SearchMdmAccountVO mdmaccountvo) throws EventException;
}