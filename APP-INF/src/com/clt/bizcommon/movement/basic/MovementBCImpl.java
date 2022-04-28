/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MovementBCImpl.java
*@FileTitle : Movement Code
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2012.02.17 김종옥
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.movement.basic;

import java.util.List;

import com.clt.bizcommon.movement.integration.MovementDBDAO;
import com.clt.bizcommon.movement.vo.SearchMdmMovementVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.MdmMvmtStsVO;


/**
 * NIS2010-BizCommon Business Logic Basic Command implementation<br>
 * - NIS2010-BizCommon에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author KIM JONG OCK
 * @see COM_COM_0010EventResponse,MovementBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class MovementBCImpl extends BasicCommandSupport implements MovementBC {

	// Database Access Object
	private transient MovementDBDAO dbDao = null;

	/**
	 * MovementBCImpl 객체 생성<br>
	 * MovementDBDAO를 생성한다.<br>
	 */
	public MovementBCImpl() {
		dbDao = new MovementDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Movement화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SearchMdmMovementVO mdmmovementvo
	 * @return List<MdmMvmtStsVO>
	 * @exception EventException
	 */
	public List<MdmMvmtStsVO> searchMovementList(SearchMdmMovementVO mdmmovementvo) throws EventException {
		try {
			return dbDao.searchMovementList(mdmmovementvo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		
	}
}