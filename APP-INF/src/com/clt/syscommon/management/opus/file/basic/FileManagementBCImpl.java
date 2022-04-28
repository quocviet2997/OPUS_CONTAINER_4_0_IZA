/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileManagementBCImpl.java
*@FileTitle : File Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.file.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.syscommon.management.opus.file.integration.FileManagementDBDAO;

/**
 * NIS2010-File Business Logic Basic Command implementation<br>
 * - NIS2010-File에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Jeong-Hoon, Kim
 * @see UI_COM_fileuploadEventResponse,FileManagementBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class FileManagementBCImpl extends BasicCommandSupport implements FileManagementBC {

	// Database Access Object
	private transient FileManagementDBDAO dbDao = null;

	/**
	 * FileManagementBCImpl 객체 생성<br>
	 * FileManagementDBDAO를 생성한다.<br>
	 */
	public FileManagementBCImpl() {
		dbDao = new FileManagementDBDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  FileManagement화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param comUpldFileVO   ComUpldFileVO
	 * @return List<ComUpldFileVO>
	 * @exception EventException
	 */
	public List<ComUpldFileVO> getComUpldFile(ComUpldFileVO comUpldFileVO) throws EventException {
		try {
			return dbDao.getComUpldFile(comUpldFileVO);
		} catch (DAOException ex) {
			log.error("[DAOException]"+ex.getMessage());
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * In화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param comUpldFileVO ComUpldFileVO[]
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void deleteFileComUpldFile(ComUpldFileVO[] comUpldFileVO, SignOnUserAccount account) throws EventException{
		try {
			List<ComUpldFileVO> insertVoList = new ArrayList<ComUpldFileVO>();
			List<ComUpldFileVO> updateVoList = new ArrayList<ComUpldFileVO>();
			List<ComUpldFileVO> deleteVoList = new ArrayList<ComUpldFileVO>();
			for ( int i=0; i<comUpldFileVO .length; i++ ) {
				if ( comUpldFileVO[i].getIbflag().equals("I")){
					comUpldFileVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(comUpldFileVO[i]);
				} else if ( comUpldFileVO[i].getIbflag().equals("U")){
					comUpldFileVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(comUpldFileVO[i]);
				} else if ( comUpldFileVO[i].getIbflag().equals("D")){
					deleteVoList.add(comUpldFileVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.adddeleteFileComUpldFileS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifydeleteFileComUpldFileS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removedeleteFileComUpldFileS(deleteVoList);
			}
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	/**
	 * 멀티 이벤트 처리<br>
	 * In화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param comUpldFileVO ComUpldFileVO[]
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void deleteComUpldFile(ComUpldFileVO[] comUpldFileVO, SignOnUserAccount account) throws EventException{
		try {
			List<ComUpldFileVO> insertVoList = new ArrayList<ComUpldFileVO>();
			List<ComUpldFileVO> updateVoList = new ArrayList<ComUpldFileVO>();
			List<ComUpldFileVO> deleteVoList = new ArrayList<ComUpldFileVO>();
			for ( int i=0; i<comUpldFileVO .length; i++ ) {
				if ( comUpldFileVO[i].getIbflag().equals("I")){
					comUpldFileVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(comUpldFileVO[i]);
				} else if ( comUpldFileVO[i].getIbflag().equals("U")){
					comUpldFileVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(comUpldFileVO[i]);
				} else if ( comUpldFileVO[i].getIbflag().equals("D")){
					deleteVoList.add(comUpldFileVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.adddeleteComUpldFileS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifydeleteComUpldFileS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removedeleteComUpldFileS(deleteVoList);
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