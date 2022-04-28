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
package com.clt.syscommon.fileopen.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenDBDAO extends DBDAOSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5121510062478357735L;
	
	/**
	 * OBL 프린트 사용권한 체크
	 * @param bkgNo
	 * @param seq
	 * @return
	 * @throws DAOException
	 * @throws Exception
	 */
	public Object searchOblPrintFlg(String bkgNo, String seq) throws DAOException, Exception {
		DBRowSet dbRowSet = null;
		Map<String, Object> param = new HashMap<String, Object>();
		try {
			param.put("bkg_no", bkgNo);
			param.put("info_seq", seq);
			dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate) new OBLPrintDBDAOsearchOblPrintFlgRSQL(), param, null);
			if(dbRowSet.next())
				return dbRowSet.getObject("OBL_INET_PRN_DT");
				
		} catch( SQLException se ) {
			log.error( se.getMessage(), se );
			throw new DAOException( new ErrorHandler( se ).getMessage() );
		} catch( Exception ex ) {
			log.error( ex.getMessage(), ex );
			throw new DAOException( new ErrorHandler( ex ).getMessage() );
		}
		return null;
	}
	
	/**
	 * 
	 * @param bkgNo
	 * @param seq
	 * @return int
	 * @throws DAOException
	 * @throws Exception
	 */
	public int updateOblPrintFlg(String bkgNo, String seq) throws DAOException,Exception {
		Map<String, Object> param = new HashMap<String, Object>();
		int result = -1;
		try {
			param.put("bkg_no", bkgNo);
			param.put("info_seq", seq);
			result = new SQLExecuter("").executeUpdate((ISQLTemplate) new OBLPrintDBDAOupdateOblPrintFlgUSQL(), param, null);
		} catch( SQLException se ) {
			log.error(se);
			throw new DAOException( new ErrorHandler( se ).getMessage() );
		} catch( Exception ex ) {
			log.error(ex);
			throw new DAOException( new ErrorHandler( ex ).getMessage() );
		}
		
		return result;
	}
}
