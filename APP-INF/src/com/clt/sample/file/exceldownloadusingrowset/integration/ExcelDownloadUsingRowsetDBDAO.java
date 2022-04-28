/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadUsingRowsetDBDAO.java
*@FileTitle : ExcelDownloadUsingRowset
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.23
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.10.23 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownloadusingrowset.integration;

import java.sql.SQLException;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.sample.file.exceldownloadusingrowset.basic.ExcelDownloadUsingRowsetBCImpl;


/**
 * ALPS ExcelDownloadUsingRowsetDBDAO <br>
 * - ALPS-File system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jeong-Hoon, Kim
 * @see ExcelDownloadUsingRowsetBCImpl 참조
 * @since J2EE 1.6
 */
public class ExcelDownloadUsingRowsetDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComUpldFile comUpldFile
	 * @return List<ComUpldFile>
	 * @throws DAOException
	 */
	public DBRowSet ComUpldFile() throws DAOException {
		DBRowSet dbRowset = null;

		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ExcelDownloadUsingRowsetDBDAOComUpldFileRSQL(), null, null);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
}