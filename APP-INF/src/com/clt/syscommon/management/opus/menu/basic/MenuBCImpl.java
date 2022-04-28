/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuBCImpl.java
*@FileTitle : Menu Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComMnuCfgVO;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.menu.integration.MenuDAO;
import com.clt.syscommon.management.opus.menu.vo.ComMnuCfgSearchVO;
import com.clt.syscommon.management.opus.menu.vo.MnuCfgExcelVO;

/**
 * NIS2010-MenuManagement Business Logic Basic Command implementation<br>
 * - NIS2010-MenuManagement에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author KyungBum Kim
 * @see MenuManagementEventResponse,MenuBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class MenuBCImpl extends BasicCommandSupport implements MenuBC {

	// Database Access Object
	private transient MenuDAO dbDao = null;

	/**
	 * $MenuBCImpl 객체 생성<br>
	 * MenuDBDAO를 생성한다.<br>
	 */
	public MenuBCImpl() {
		dbDao = new MenuDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  Menu화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComProgramVO commnucfgvo
	 * @return List<ComMnuCfgSearchVO>
	 * @exception EventException
	 */
	public List<ComMnuCfgSearchVO> searchComMnuCfgVO(ComProgramVO commnucfgvo) throws EventException {
		try {
			return dbDao.searchComMnuCfgVO(commnucfgvo);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	/**
	 * Excel조회 이벤트 처리<br>
	 *  Menu화면에 대한 Excel조회 이벤트 처리<br>
	 * 
	 * @return List<MnuCfgExcelVO>
	 * @exception EventException
	 */
	public List<MnuCfgExcelVO> searchExcelData() throws EventException {
		try {
			return dbDao.searchExcelMenu();
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * In화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComMnuCfgVO[] commnucfgvo
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiComMnuCfgVO(ComMnuCfgVO[] commnucfgvo,SignOnUserAccount account) throws EventException{
		try {
			List<ComMnuCfgVO> insertVoList = new ArrayList<ComMnuCfgVO>();
			List<ComMnuCfgVO> updateVoList = new ArrayList<ComMnuCfgVO>();
			List<ComMnuCfgVO> deleteVoList = new ArrayList<ComMnuCfgVO>();
			for ( int i=0; i<commnucfgvo .length; i++ ) {
				if ( commnucfgvo[i].getIbflag().equals("I")){
					commnucfgvo[i].setCreUsrId(account.getUsr_id());
					commnucfgvo[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(commnucfgvo[i]);
				} else if ( commnucfgvo[i].getIbflag().equals("U")){
					commnucfgvo[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(commnucfgvo[i]);
				} else if ( commnucfgvo[i].getIbflag().equals("D")){
					deleteVoList.add(commnucfgvo[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addmultiComMnuCfgVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifymultiComMnuCfgVOS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removemultiComMnuCfgVOS(deleteVoList);
			}
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
}