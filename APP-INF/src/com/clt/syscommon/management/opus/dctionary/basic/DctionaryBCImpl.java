/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : Dctionarylmpl.java
*@FileTitle : Dctionary
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.07
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.12.07 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.dctionary.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.management.opus.dctionary.integration.DctionaryDBDAO;
import com.clt.syscommon.management.opus.dctionary.vo.DctionaryVO;

/**
 * ALPS-Dctionary Business Logic Basic Command implementation<br>
 * - ALPS-Dctionary에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Sun JungIn
 * @see DctionaryBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class DctionaryBCImpl extends BasicCommandSupport implements DctionaryBC {


	// Database Access Object
	private transient DctionaryDBDAO dbDao = null;

	/**
	 * DctionaryBClmpl 객체 생성<br>
	 * DctionaryDBDAO 생성한다.<br>
	 */
	public DctionaryBCImpl() {
		dbDao = new DctionaryDBDAO();

	}
	
	/**
	 * 	searchDctionary
	 * @param String abbreviation
	 * @return List<DctionaryVO>
	 * @throws EventException
	 */
	public List<DctionaryVO> searchDctionary(String abbreviation) throws EventException {
		try {
			return dbDao.searchDctionary(abbreviation);
	    } catch(DAOException ex) {
	    	log.error("err " + ex.toString(), ex);
	    	throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}	
	}

}
