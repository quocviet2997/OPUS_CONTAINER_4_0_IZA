/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PackageTypeBCImpl.java
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

import com.clt.bizcommon.packagetype.integration.PackageTypeDBDAO;
import com.clt.bizcommon.packagetype.vo.PackageTypeVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * NIS2010-BizCommon Business Logic Basic Command implementation<br>
 * - NIS2010-BizCommon에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Ji Seok Woo
 * @see UI_BKG_0696EventResponse,PackageTypeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class PackageTypeBCImpl extends BasicCommandSupport implements PackageTypeBC {

	// Database Access Object
	private transient PackageTypeDBDAO dbDao = null;

	/**
	 * PackageTypeBCImpl 객체 생성<br>
	 * PackageTypeDBDAO를 생성한다.<br>
	 */
	public PackageTypeBCImpl() {
		dbDao = new PackageTypeDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  PackageType화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param packagetypevo   PackageTypeVO
	 * @return List<PackageTypeVO>
	 * @exception EventException
	 */
	public List<PackageTypeVO> searchPackageTypeList(PackageTypeVO packagetypevo) throws EventException {
		try {
            log.debug("Packages Table 조회 PackageTypeBCImpl searchPackageTypeList");
			return dbDao.searchPackageTypeList(packagetypevo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
}