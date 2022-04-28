/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeManagementBCImpl.java
*@FileTitle : Office
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.07.02 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.officemanagement.basic;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.common.table.ComPgmRoleVO;
import com.clt.syscommon.management.opus.officemanagement.integration.OfficeManagementDBDAO;
import com.clt.syscommon.management.opus.officemanagement.vo.OfficListVO;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDAOComPgmROLECSQL;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDAOComPgmROLEDSQL;

/**
 * ALPS-ProgramManagement Business Logic Basic Command implementation<br>
 * - ALPS-ProgramManagement에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jung In Sun
 * @see Office_ManagementEventResponse,OfficeManagementBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class OfficeManagementBCImpl extends BasicCommandSupport implements OfficeManagementBC {

	// Database Access Object
	private transient OfficeManagementDBDAO dbDao = null;

	/**
	 * OfficeManagementBCImpl 객체 생성<br>
	 * OfficeManagementDBDAO를 생성한다.<br>
	 */
	public OfficeManagementBCImpl() {
		dbDao = new OfficeManagementDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param OfficListVO	officListVO
	 * @param String pgm_no
	 * @return List<OfficListVO>
	 * @exception EventException
	 */
	public List<OfficListVO> comOfcPgmMtchSearch(OfficListVO officListVO, String pgm_no) throws EventException {
		try {
			return dbDao.comOfcPgmMtchSearch(officListVO,pgm_no);
		} catch (DAOException ex) {
			throw new EventException(ex.getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(ex.getMessage(),ex);
		}
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComOfcPgmMtchVO[] comOfcPgmMtchVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void comOfcPgmMtchs(ComOfcPgmMtchVO[] comOfcPgmMtchVO, SignOnUserAccount account) throws EventException{
		try {
			dbDao.multiOfcPgmMtchs(comOfcPgmMtchVO, account);
		} catch (DAOException ex) {
			throw new EventException(ex.getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(ex.getMessage(),ex);
		}
	}
	
	
	
}