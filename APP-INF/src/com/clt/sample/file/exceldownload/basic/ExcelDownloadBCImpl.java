/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadBCImpl.java
*@FileTitle : ExcelDownload
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownload.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.sample.file.exceldownload.integration.ExcelDownloadDBDAO;

/**
 * ALPS-File Business Logic Command Interface<br>
 * - ALPS-File에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @since J2EE 1.6
 */
public class ExcelDownloadBCImpl extends BasicCommandSupport implements ExcelDownloadBC {

	// Database Access Object
	private transient ExcelDownloadDBDAO dbDao = null;

	/**
	 * ExcelDownloadBCImpl 객체 생성<br>
	 * ExcelDownloadDBDAO를 생성한다.<br>
	 */
	public ExcelDownloadBCImpl() {
		dbDao = new ExcelDownloadDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComUpldFile comUpldFile
	 * @return List<ComUpldFile>
	 * @exception EventException
	 */
	public List<ComUpldFileVO> ComUpldFile(ComUpldFileVO comUpldFile) throws EventException {
		try {
			return dbDao.ComUpldFile(comUpldFile);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		
	}
	
}