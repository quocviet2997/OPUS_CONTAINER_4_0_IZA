/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PerTypeBC.java
*@FileTitle : PerType
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 박광석
*@LastVersion : 1.0
* 2009.04.08 박광석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.pertype.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.PriRatUtVO;

/**
 * ALPS-Per Type Business Logic Command Interface<br>
 * - ALPS-Per Type에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Prak Kwang Seok
 * @see Ui_fms_0006EventResponse 참조
 * @since J2EE 1.4
 */

public interface PerTypeBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Per Type 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param PriRatUtVO pretypevo
	 * @return List<PriRatUtVO>
	 * @exception EventException
	 */
	public List<PriRatUtVO> searchPertypeList(PriRatUtVO pretypevo) throws EventException;

}