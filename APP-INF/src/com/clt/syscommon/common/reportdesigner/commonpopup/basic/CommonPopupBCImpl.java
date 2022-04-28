/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CommonPopupBCImpl.java
*@FileTitle : COM_RD_COMMON_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.14
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.08.14 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.reportdesigner.commonpopup.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.reportdesigner.commonpopup.integration.CommonPopupDBDAO;
import com.clt.syscommon.common.table.ComBakEndJbVO;

/**
 * ALPS-ReportDesigner Business Logic Basic Command implementation<br>
 * - ALPS-ReportDesigner에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, Kim
 * @see COM_RD_COMMON_POPUPEventResponse,CommonPopupBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class CommonPopupBCImpl extends BasicCommandSupport implements CommonPopupBC {

	// Database Access Object
	private transient CommonPopupDBDAO dbDao = null;

	/**
	 * CommonPopupBCImpl 객체 생성<br>
	 * CommonPopupDBDAO를 생성한다.<br>
	 */
	public CommonPopupBCImpl() {
		dbDao = new CommonPopupDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComBakEndJbVO comBakEndJbVO
	 * @return List<ComBakEndJbVO>
	 * @exception EventException
	 */
	public List<ComBakEndJbVO> comBakEndJbVO(ComBakEndJbVO comBakEndJbVO) throws EventException {
		try {
			return dbDao.comBakEndJbVO(comBakEndJbVO);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		
	}
	
}