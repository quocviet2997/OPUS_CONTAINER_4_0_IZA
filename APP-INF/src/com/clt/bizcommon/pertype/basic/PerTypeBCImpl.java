/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PerTypeBCImpl.java
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

import com.clt.bizcommon.pertype.integration.PerTypeDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.PriRatUtVO;

/**
 * ALPS-Per Type Business Logic Basic Command implementation<br>
 * - ALPS-Per Type에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Prak Kwang Seok
 * @see UI_PRI_4002EventResponse,PerTypeBC 각 DAO 클래스 참조
 * @since J2EE 1.4 
 */

public class PerTypeBCImpl extends BasicCommandSupport implements PerTypeBC {

	// Database Access Object
	private transient PerTypeDBDAO dbDao = null;

	/**
	 * PerTypeImpl 객체 생성<br>
	 * PerTypeDBDAO를 생성한다.<br>
	 */
	public PerTypeBCImpl() {
		dbDao = new PerTypeDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  PerType화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param pretypevo   PerTypeVO
	 * @return List<PertypeVO>
	 * @exception EventException
	 */
	public List<PriRatUtVO> searchPertypeList(PriRatUtVO pretypevo) throws EventException {
		try {

			return dbDao.searchPertypeList(pretypevo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	 

		
	 
	
 
}