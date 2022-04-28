/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : GroupwarePopupBCImpl.java
*@FileTitle : GROUPWARE_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.groupwarepopup.groupwarepopup.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.sample.groupwarepopup.groupwarepopup.integration.GroupwarePopupDBDAO;
import com.clt.syscommon.common.table.ComEmlSndInfoVO;

/**
 * NIS2010-GroupwarePopup Business Logic Basic Command implementation<br>
 * - NIS2010-GroupwarePopup에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, Kim
 * @see GROUPWARE_POPUPEventResponse,GroupwarePopupBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class GroupwarePopupBCImpl extends BasicCommandSupport implements GroupwarePopupBC {

	// Database Access Object
	private transient GroupwarePopupDBDAO dbDao = null;

	/**
	 * GroupwarePopupBCImpl 객체 생성<br>
	 * GroupwarePopupDBDAO를 생성한다.<br>
	 */
	public GroupwarePopupBCImpl() {
		dbDao = new GroupwarePopupDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  GroupwarePopup화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param comEmlSndInfoVO   ComEmlSndInfoVO
	 * @return List<ComEmlSndInfoVO>
	 * @exception EventException
	 */
	public List<ComEmlSndInfoVO> comEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException {
		try {
			return dbDao.comEmlSndInfoVO(comEmlSndInfoVO);
		} catch (DAOException ex) {
			throw new EventException(ex.getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(ex.getMessage(),ex);
		}
	}
	
}