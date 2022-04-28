/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CurrencyBCImpl.java
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

import com.clt.bizcommon.currency.integration.CurrencyDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.MdmCurrencyVO;

/**
 * NIS2010-BizCommon Business Logic Basic Command implementation<br>
 * - NIS2010-BizCommon에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Eui-Su Park
 * @see UI_COM_ENS_N13EventResponse,CurrencyBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class CurrencyBCImpl extends BasicCommandSupport implements CurrencyBC {

	// Database Access Object
	private transient CurrencyDBDAO dbDao = null;

	/**
	 * CurrencyBCImpl 객체 생성<br>
	 * CurrencyDBDAO를 생성한다.<br>
	 */
	public CurrencyBCImpl() {
		dbDao = new CurrencyDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Currency화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param MdmCurrencyVO mdmcurrencyvo
	 * @return List<MdmCurrencyVO>
	 * @exception EventException
	 */
	public List<MdmCurrencyVO> searchCurrencyList(MdmCurrencyVO mdmcurrencyvo) throws EventException {
		try {
			return dbDao.searchCurrencyList(mdmcurrencyvo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
}