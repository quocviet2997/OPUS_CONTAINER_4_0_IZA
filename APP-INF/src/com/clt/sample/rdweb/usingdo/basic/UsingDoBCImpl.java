/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UsingDoBCImpl.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.sample.rdweb.usingdo.integration.UsingDoDBDAO;

/**
 * NIS2010-RdWeb Business Logic Basic Command implementation<br>
 * - NIS2010-RdWeb에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author 
 * @see RdWebSampleEventResponse,UsingDoBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class UsingDoBCImpl extends BasicCommandSupport implements UsingDoBC {

	// Database Access Object
	private transient UsingDoDBDAO dbDao = null;

	/**
	 * UsingDoBCImpl 객체 생성<br>
	 * UsingDoDBDAO를 생성한다.<br>
	 */
	public UsingDoBCImpl() {
		dbDao = new UsingDoDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  UsingDo화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param comUpldFileVO   ComUpldFileVO
	 * @return List<ComUpldFileVO>
	 * @exception EventException
	 */
	public List<ComUpldFileVO> comUpldFileVO(ComUpldFileVO comUpldFileVO) throws EventException {
		try {
			return dbDao.comUpldFileVO(comUpldFileVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	
}