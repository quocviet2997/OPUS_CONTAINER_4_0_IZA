/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryBCImpl.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.accesshistory.basic;

import java.util.HashMap;

import com.clt.framework.component.backend.core.BackEndJobManager;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * ALPS-AccessHistory Business Logic Command Interface<br>
 * - ALPS-AccessHistory에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author kyungbum kim
 * @since J2EE 1.6
 * @see AccessHistoryBC
 */
public class AccessHistoryBCImpl extends BasicCommandSupport implements AccessHistoryBC {

	/**
	 * AccessHistoryBCImpl 객체 생성<br>
	 * AccessHistoryDBDAO를 생성한다.<br>
	 */
	public AccessHistoryBCImpl() {
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<AccessHistoryVO>
	 * @exception EventException
	 */
	public String getAccessHistory(HashMap<String, String> param) throws EventException {
		String rtnKey = null;
		try {
			AccessHistoryBackEndJob backEndJob = new AccessHistoryBackEndJob();
			backEndJob.setParam(param);
			BackEndJobManager backEndJobManager = new BackEndJobManager();
			rtnKey = backEndJobManager.execute(backEndJob, "AccessHistory", "Access History select");
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return rtnKey;
		
	}

	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<AccessHistoryVO>
	 * @exception EventException
	 */
	public String getAccessHistoryExcel(HashMap<String, String> param) throws EventException {
		String rtnKey = null;
		try {
			AccessHistoryExcelBackEndJob backEndJob = new AccessHistoryExcelBackEndJob();
			backEndJob.setParam(param);
			BackEndJobManager backEndJobManager = new BackEndJobManager();
			rtnKey = backEndJobManager.execute(backEndJob, "AccessHistoryExcel", "Access History Excel select");
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return rtnKey;
	}

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return LString
	 * @exception EventException
	 */
	public String getLastLoginDate(HashMap<String, String> param) throws EventException {
		String rtnKey = null;
		try {
			LastLoginDateBackEndJob backEndJob = new LastLoginDateBackEndJob();
			backEndJob.setParam(param);
			BackEndJobManager backEndJobManager = new BackEndJobManager();
			rtnKey = backEndJobManager.execute(backEndJob, "LastLoginDate", "Last Login Date select");
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return rtnKey;
	}
	
}