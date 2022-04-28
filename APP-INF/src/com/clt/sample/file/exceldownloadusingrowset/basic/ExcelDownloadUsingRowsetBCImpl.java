/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadUsingRowsetBCImpl.java
*@FileTitle : ExcelDownloadUsingRowset
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.23
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.10.23 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownloadusingrowset.basic;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.sample.file.exceldownloadusingrowset.integration.ExcelDownloadUsingRowsetDBDAO;

/**
 * ALPS-File Business Logic Command Interface<br>
 * - ALPS-File에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @since J2EE 1.6
 */
public class ExcelDownloadUsingRowsetBCImpl extends BasicCommandSupport implements ExcelDownloadUsingRowsetBC {

	// Database Access Object
	private transient ExcelDownloadUsingRowsetDBDAO dbDao = new ExcelDownloadUsingRowsetDBDAO();

	@Override
	public DBRowSet getRowSet() throws EventException {
		try {
			return dbDao.ComUpldFile();
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	@Override
	public String[] getColumns() {
		// 컬럼헤더와 매핑되는 DB Column 명 정의
		String[] titleField = new String[2];
		titleField[0] = "COL1";
		titleField[1] = "COL2";
		return titleField;
	}

	@Override
	public String[] getTitle() {
		// 엑셀의 컬럼헤더 정의
		String[] title = new String[2];
		title[0] = "1";
		title[1] = "2";
		return title;
	}
}