/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : ProgramBCImpl.java
 *@FileTitle : Program Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.02.17
 *@LastModifier : 김경범
 *@LastVersion : 1.0
 * 2009.02.17 김경범
 * 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.superuser.basic;

import java.util.HashMap;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrPgmMtchVO;
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

public class SuperUserBCImpl extends BasicCommandSupport implements SuperUserBC {

	// Database Access Object
	private transient SuperUserDBDAO dbDao = null;

	/**
	 * $ProgramBCImpl 객체 생성<br>
	 * ProgramDBDAO를 생성한다.<br>
	 */
	public SuperUserBCImpl() {
		dbDao = new SuperUserDBDAO();
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
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String[]
	 * @exception EventException
	 */
	public String[] searchRhqList() throws EventException {

		try {
			return dbDao.searchRhqList();
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<SuperUserVO>
	 * @exception EventException
	 */
	public List<SuperUserVO> searchSuperUserList(HashMap<String, String> param) throws EventException {

		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
		List<SuperUserVO> list = null;
		try {
			list = dbDao.getSuperUser(param);
			
			return list;
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * In화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param SuperUserVO[] vos
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiComSuperUserVO(SuperUserVO[] vos, SignOnUserAccount account) throws EventException {
		try {
			dbDao.multiComSuperUserVO(vos, account);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}

}