/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : LastLoginDateBackEndJob.java
*@FileTitle : LastLoginDateBackEndJob
*Open Issues :
*Change history :
*@LastModifyDate : 2010.08.09
*@LastModifier : 류현수
*@LastVersion : 1.0
* 2010.08.09 류현수  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.accesshistory.basic;

import java.util.HashMap;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.backend.BackEndCommandSupport;
import com.clt.syscommon.management.opus.accesshistory.integration.AccessHistoryDBDAO;

/**
 * Last Login Date Backendjob  <br>
 * Last Login Date Backend Job Class
 *
 * @author 류현수 
 * @since J2EE 1.6
 * @see BackEndCommandSupport
 */
public class LastLoginDateBackEndJob extends BackEndCommandSupport {

	/**
	 * Serial version id 
	 */
	private static final long serialVersionUID = 1845229362151552312L;
	// Database Access Object
	private AccessHistoryDBDAO dbDao = null;
	
	private HashMap<String, String> param = null;
	
	/**
	 * LastLoginDateBackEndJob 생성 
	 * AccessHistoryDBDAO의 초기화 
	 */
	public LastLoginDateBackEndJob() {
		dbDao = new AccessHistoryDBDAO();
	}

	/**
	 * Last Login Date  조회 시작 
	 * @see com.clt.framework.core.layer.backend.BackEndCommand#doStart()
	 * @return
	 * @throws Exception
	 */
	public Object doStart() throws Exception {
		try {
			return dbDao.getLastLoginDate(getParam());
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}

	/**
	 * Parameter setting 
	 */
	public void setParam(HashMap<String, String> param) {
		this.param = param;
	}

	/**
	 * Return parameter HashMap 
	 * @return HashMap<String, String>
	 */
	public HashMap<String, String> getParam() {
		return param;
	}

}
