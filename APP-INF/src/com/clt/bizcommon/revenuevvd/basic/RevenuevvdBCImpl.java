/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RevenuevvdBCImpl.java
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

import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.revenuevvd.integration.RevenueVvdDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ArMstRevVvdVO;
import com.clt.syscommon.common.table.PackageTypeVO;

/**
 * NIS2010-BizCommon Business Logic Basic Command implementation<br>
 * - NIS2010-BizCommon에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author SEO CHANG YUL
 * @see UI_COM_ENS_N12EventResponse,RevenuevvdBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class RevenuevvdBCImpl extends BasicCommandSupport implements RevenuevvdBC {

	// Database Access Object
	private transient RevenueVvdDBDAO dbDao = null;

	/**
	 * RevenuevvdBCImpl 객체 생성<br>
	 * RevenuevvdDBDAO를 생성한다.<br>
	 */
	public RevenuevvdBCImpl() {
		dbDao = new RevenueVvdDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Revenuevvd화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ArMstRevVvdVO armstrevvvdvo
	 * @return List<ArMstRevVvdVO>
	 * @exception EventException
	 */
	public List<ArMstRevVvdVO> searchRevenueVVDList(ArMstRevVvdVO arMstRevVvdVO) throws EventException {
		try {
			return dbDao.searchRevenueVVDList(arMstRevVvdVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
}