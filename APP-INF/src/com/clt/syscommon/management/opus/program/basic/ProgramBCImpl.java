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
package com.clt.syscommon.management.opus.program.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.program.integration.ProgramDAO;
import com.clt.syscommon.management.opus.program.vo.ComProgramSearchVO;

/**
 * NIS2010-ProgramManagement Business Logic Basic Command implementation<br>
 * - NIS2010-ProgramManagement에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author KyungBum Kim
 * @see ProgramManagementEventResponse,ProgramBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class ProgramBCImpl extends BasicCommandSupport implements ProgramBC {

	// Database Access Object
	private transient ProgramDAO dbDao = null;

	/**
	 * $ProgramBCImpl 객체 생성<br>
	 * ProgramDBDAO를 생성한다.<br>
	 */
	public ProgramBCImpl() {
		dbDao = new ProgramDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Program화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComProgramVO comprogramvo
	 * @return ComProgramSearchVO[]
	 * @exception EventException
	 */
	public ComProgramSearchVO[] searchProgramList(ComProgramVO comprogramvo) throws EventException {

		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
		DBRowSet rowSet = null;
		try {
			rowSet = dbDao.searchProgramList(comprogramvo);
			List<Object> list = RowSetUtil.rowSetToVOs(rowSet, ComProgramSearchVO.class);
			
			return list.toArray(new ComProgramSearchVO[list.size()]);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * In화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComProgramVO[] comprogramvos
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiComProgramVO(ComProgramVO[] comprogramvos, SignOnUserAccount account) throws EventException {
		try {
				dbDao.multiComProgramVO(comprogramvos, account);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
}