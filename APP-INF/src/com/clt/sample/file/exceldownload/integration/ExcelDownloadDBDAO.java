/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadDBDAO.java
*@FileTitle : ExcelDownload
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownload.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.sample.file.exceldownload.basic.ExcelDownloadBCImpl;


/**
 * ALPS ExcelDownloadDBDAO <br>
 * - ALPS-File system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jeong-Hoon, Kim
 * @see ExcelDownloadBCImpl 참조
 * @since J2EE 1.6
 */
public class ExcelDownloadDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComUpldFile comUpldFile
	 * @return List<ComUpldFile>
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<ComUpldFileVO> ComUpldFile(ComUpldFileVO comUpldFile) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComUpldFileVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comUpldFile != null){
//				Map<String, String> mapVO = comUpldFile .getColumnValues();
//			
//				param.putAll(mapVO);
//				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ExcelDownloadDBDAOComUpldFileRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUpldFileVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
}