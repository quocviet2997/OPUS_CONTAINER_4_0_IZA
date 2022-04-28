/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : 
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.01
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2016.06.01 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.fileopen.basic;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.fileopen.integration.FileOpenDBDAO;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenBCImpl implements FileOpenBC{

	// Database Access Object
	private transient FileOpenDBDAO dbDao = null;

	/**
	 * CommonCodeBCImpl 객체 생성<br>
	 * CommonCodeDBDAO를 생성한다.<br>
	 */
	public FileOpenBCImpl() {
		dbDao = new FileOpenDBDAO();
	}
		
	/**
	 * 
	 * @param bkgNo
	 * @param seq
	 * @return
	 * @throws EventException
	 */
	@Override
	public Object searchOblPrintFlg(String bkgNo, String seq) throws EventException {
		Object oblPrnDt = null;
		try {
			oblPrnDt = dbDao.searchOblPrintFlg(bkgNo, seq);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		return oblPrnDt;
	}

	/**
	 * 
	 * @param bkgNo
	 * @param seq
	 * @return
	 * @throws EventException
	 */
	@Override
	public int updateOblPrintFlg(String bkgNo, String seq) throws EventException {
		try {
			return dbDao.updateOblPrintFlg(bkgNo, seq);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}

}
