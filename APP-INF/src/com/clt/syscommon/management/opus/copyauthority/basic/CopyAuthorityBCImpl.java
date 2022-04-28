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
package com.clt.syscommon.management.opus.copyauthority.basic;

import java.util.HashMap;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.management.opus.copyauthority.integration.CopyAuthorityDBDAO;

/**
 * ALPS-AccessHistory Business Logic Command Interface<br>
 * - ALPS-AccessHistory에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author kyungbum kim
 * @since J2EE 1.6
 * @see CopyAuthorityBC
 */
public class CopyAuthorityBCImpl extends BasicCommandSupport implements CopyAuthorityBC {

	// Database Access Object
	private transient CopyAuthorityDBDAO dbDao = null;

	/**
	 * AccessHistoryBCImpl 객체 생성<br>
	 * AccessHistoryDBDAO를 생성한다.<br>
	 */
	public CopyAuthorityBCImpl() {
		dbDao = new CopyAuthorityDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @exception EventException
	 */
	public void copyAuthority(HashMap<String, String> param) throws EventException {
		try {
			dbDao.copyAuthority(param);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}

}