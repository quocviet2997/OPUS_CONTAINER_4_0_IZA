/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ItemControlManagementDBDAO.java
 *@FileTitle : Item Control Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2013.06.28
 *@LastModifier : 경종윤
 *@LastVersion : 1.0
 * 2013.06.28 경종윤 
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.itemcontrolmanagement.basic;

import java.util.HashMap;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrPgmMtchVO;
import com.clt.syscommon.management.opus.itemcontrolmanagement.integration.ItemControlManagementDBDAO;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;
import com.clt.syscommon.management.opus.superuser.integration.SuperUserDBDAO;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;

/**
 * NIS2010-ProgramManagement Business Logic Basic Command implementation<br>
 * - NIS2010-ProgramManagement에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author KyungBum Kim
 * @see ProgramManagementEventResponse,ProgramBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class ItemControlManagementBCImpl  extends BasicCommandSupport implements ItemControlManagementBC{

	// Database Access Object
	private transient ItemControlManagementDBDAO dbDao = null;

	/**
	 * $ProgramBCImpl 객체 생성<br>
	 * ProgramDBDAO를 생성한다.<br>
	 */
	public ItemControlManagementBCImpl() {
		dbDao = new ItemControlManagementDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String[]
	 * @exception EventException
	 */
	public String[] searchSubSystemList() throws EventException {

		try {
			return dbDao.searchSubSystemList();
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * manageItemControlList
	 * @author Jeong-Hoon, KIM
	 * @param vos
	 * @param account
	 * @throws EventException void
	 */
	public void manageItemControlList(ItemControlManagementVO[] vos, SignOnUserAccount account) throws EventException {
		try {
			dbDao.manageItemControlList(vos, account);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * Item Control Management 화면 리스트 조회<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @exception EventException
	 */
	public List<ItemControlManagementVO> searchItemControlList(ItemControlManagementVO itemControlManagementVO)
			throws EventException {
		
		List<ItemControlManagementVO> list = null;
		
		try {
			list = dbDao.searchItemControlList(itemControlManagementVO);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return list;
	}

	/**
	 * searchUiSetUpInfo  조회<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @exception EventException
	 */
	public List<ItemControlManagementVO> searchUiSetUpInfo(ItemControlManagementVO itemControlManagementVO)
			throws EventException {
		
		List<ItemControlManagementVO> list = null;
		
		try {
			list = dbDao.searchUiSetUpInfo(itemControlManagementVO);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return list;
	}

}