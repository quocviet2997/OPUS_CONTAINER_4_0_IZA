/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PackageTypeBC.java
*@FileTitle : Package Table
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.16
*@LastModifier : 우지석
*@LastVersion : 1.0
* 2009.04.16 우지석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.packagetype.basic;

import java.util.List;

import com.clt.bizcommon.packagetype.vo.PackageTypeVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * NIS2010-Bizcommon Business Logic Command Interface<br>
 * - NIS2010-Bizcommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Ji Seok Woo
 * @see Ui_bkg_0696EventResponse 참조
 * @since J2EE 1.4
 */

public interface PackageTypeBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Packagetype화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param PackageTypeVO packagetypevo
	 * @return List<PackageTypeVO>
	 * @exception EventException
	 */
	public List<PackageTypeVO> searchPackageTypeList(PackageTypeVO packagetypevo) throws EventException;
}