/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LogicsServiceProviderBC.java
*@FileTitle : LogicsServiceProvider
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.23
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.23 우경민
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.logicsserviceprovider.basic;

import java.util.List;

import com.clt.bizcommon.logicsserviceprovider.vo.RMdmVenderVO;
import com.clt.framework.core.layer.event.EventException;

/** 
 * NIS2010-Logicsserviceprovider Business Logic Command Interface<br>
 * - NIS2010-Logicsserviceprovider에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author KyungMin Woo
 * @see Ui_ctm_0435EventResponse 참조
 * @since J2EE 1.4
 */

public interface LogicsServiceProviderBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Logicsserviceprovider화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param RMdmVenderVO RMdmVenderVO
	 * @return List<RMdmVenderVO>
	 * @exception EventException
	 */
	public List<RMdmVenderVO> searchLogicsServiceProvider(RMdmVenderVO RMdmVenderVO) throws EventException;
}