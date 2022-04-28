/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LogicsServiceProviderBCImpl.java
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

import com.clt.bizcommon.logicsserviceprovider.integration.LogicsServiceProviderDBDAO;
import com.clt.bizcommon.logicsserviceprovider.vo.RMdmVenderVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * NIS2010-LogicsServiceProvider Business Logic Basic Command implementation<br>
 * - NIS2010-LogicsServiceProvider에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author KyungMin Woo
 * @see ui_ctm_0435EventResponse,LogicsServiceProviderBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class LogicsServiceProviderBCImpl extends BasicCommandSupport implements LogicsServiceProviderBC {

	// Database Access Object
	private transient LogicsServiceProviderDBDAO dbDao = null;

	/**
	 * LogicsServiceProviderBCImpl 객체 생성<br>
	 * LogicsServiceProviderDBDAO를 생성한다.<br>
	 */
	public LogicsServiceProviderBCImpl() {
		dbDao = new LogicsServiceProviderDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  LogicsServiceProvider화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param RMdmVenderVO RMdmVenderVO
	 * @return List<RMdmVenderVO>
	 * @exception EventException
	 */
	public List<RMdmVenderVO> searchLogicsServiceProvider(RMdmVenderVO RMdmVenderVO) throws EventException {
		try {
			return dbDao.searchLogicsServiceProvider(RMdmVenderVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
}