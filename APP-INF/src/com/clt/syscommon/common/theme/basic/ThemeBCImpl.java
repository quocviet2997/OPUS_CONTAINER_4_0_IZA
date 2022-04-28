/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : ThemeOneBCImpl.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 4. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.theme.basic;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.theme.integration.ThemeDBDAO;

/**
 * ThemeOneBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 4. 16.
 */
public class ThemeBCImpl extends BasicCommandSupport implements ThemeBC {
	// Database Access Object
	private transient ThemeDBDAO dbDao = null;
	public ThemeBCImpl() {
		dbDao = new ThemeDBDAO();
	}

	/**
	 * 
	 * updateThemeOne
	 * @author Jeong-Hoon, KIM
	 * @param userId
	 * @throws EventException void
	 */
	public void updateThemeOne(String userId) throws EventException {
		try {
			dbDao.updateThemeDelete(userId);
			dbDao.updateThemeUpdateOne(userId);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 
	 * updateThemeTwo
	 * @author Jeong-Hoon, KIM
	 * @param userId
	 * @throws EventException void
	 */
	public void updateThemeTwo(String userId) throws EventException {
		try {
			dbDao.updateThemeDelete(userId);
			dbDao.updateThemeUpdateTwo(userId);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

}

