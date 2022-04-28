/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : UsingTimerBCImpl.java
 *@FileTitle : BackEndJob
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.09.14
 *@LastModifier : 김정훈
 *@LastVersion : 1.0
 * 2009.09.14 김정훈
 * 1.0 Creation
=========================================================*/
package com.clt.sample.backendjob.thread.basic;

import java.sql.SQLException;

import com.clt.framework.component.backend.support.BackEndJobMetaDataSelector;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * ALPS-BackEndJob Business Logic Command Interface<br>
 * - ALPS-BackEndJob에 대한 비지니스 로직에 대한 인터페이스<br>
 * 
 * @author Jeong-Hoon, Kim
 * @since J2EE 1.6
 */
public class BackEndJobStatusSearchSampleBCImpl extends BasicCommandSupport implements BackEndJobStatusSearchSampleBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComBakEndJbVO
	 *            comBakEndJbVO
	 * @return List<ComBakEndJbVO>
	 * @exception EventException
	 */
	public String ComBakEndJbVO(String key) throws EventException {

		DBRowSet rowSet;
		try {
			rowSet = new BackEndJobMetaDataSelector(key).getDbRowset();
			rowSet.next();
			Thread.sleep(1000);
			return (String) rowSet.getObject("jb_sts_flg");
		} catch (SQLException e) {
			throw new EventException(e.getMessage());
		} catch (InterruptedException e) {
			throw new EventException(e.getMessage());
		} catch(Exception e){
			throw new EventException(e.getMessage());
		}

	}

}