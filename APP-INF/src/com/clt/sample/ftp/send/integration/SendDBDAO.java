/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendDBDAO.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.integration;

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
import com.clt.framework.table.ComFtpSndInfoVO;
import com.clt.sample.ftp.send.basic.SendBCImpl;


/**
 * ALPS SendDBDAO <br>
 * - ALPS-Ftp system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jeong-Hoon, Kim
 * @see SendBCImpl 참조
 * @since J2EE 1.6
 */
public class SendDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComFtpSndInfoVO comFtpSndInfoVO
	 * @return List<ComFtpSndInfoVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<ComFtpSndInfoVO> retrieveFtp(ComFtpSndInfoVO comFtpSndInfoVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComFtpSndInfoVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comFtpSndInfoVO != null){
				Map<String, String> mapVO = comFtpSndInfoVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SendDBDAOComFtpSndInfoVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComFtpSndInfoVO .class);
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