/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AccountBCImpl.java
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

import com.clt.bizcommon.account.integration.AccountDBDAO;
import com.clt.bizcommon.account.vo.SearchMdmAccountVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.MdmAccountVO;


/**
 * NIS2010-BizCommon Business Logic Basic Command implementation<br>
 * - NIS2010-BizCommon에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Suk Jun Kim
 * @see COM_ENS_N11EventResponse,AccountBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class AccountBCImpl extends BasicCommandSupport implements AccountBC {

	// Database Access Object
	private transient AccountDBDAO dbDao = null;

	/**
	 * AccountBCImpl 객체 생성<br>
	 * AccountDBDAO를 생성한다.<br>
	 */
	public AccountBCImpl() {
		dbDao = new AccountDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Account화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SearchMdmAccountVO mdmaccountvo
	 * @return List<MdmAccountVO>
	 * @exception EventException
	 */
	public List<MdmAccountVO> searchAccountList(SearchMdmAccountVO mdmaccountvo) throws EventException {
		try {
			return dbDao.searchAccountList(mdmaccountvo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		
	}
}