/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RevenuevvdBC.java
*@FileTitle : Revenue VVD Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.28
*@LastModifier : 서창열
*@LastVersion : 1.0
* 2009.04.28 서창열
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.revenuevvd.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.ArMstRevVvdVO;

/**
 * NIS2010-Bizcommon Business Logic Command Interface<br>
 * - NIS2010-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SEO CHANG YUL
 * @see Ui_com_ens_n12EventResponse 참조
 * @since J2EE 1.4
 */

public interface RevenuevvdBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Revenuevvd화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ArMstRevVvdVO armstrevvvdvo
	 * @return List<ArMstRevVvdVO>
	 * @exception EventException
	 */
	public List<ArMstRevVvdVO> searchRevenueVVDList(ArMstRevVvdVO armstrevvvdvo) throws EventException;
}