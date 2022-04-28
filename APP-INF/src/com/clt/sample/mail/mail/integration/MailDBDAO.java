/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MailDBDAO.java
*@FileTitle : Mail Sample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.mail.mail.integration;

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
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.sample.mail.mail.basic.MailBCImpl;


/**
 * NIS2010 MailDBDAO <br>
 * - NIS2010-Mail system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jeong-Hoon, KIM
 * @see MailBCImpl 참조
 * @since J2EE 1.6
 */
public class MailDBDAO extends DBDAOSupport {

	/**
	 * MailDBDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param model 데이타 모델
	 * @return DBRowSet
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<ComEmlSndInfoVO> comEmlSndInfoVO(ComEmlSndInfoVO comEmlSndInfoVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComEmlSndInfoVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comEmlSndInfoVO != null){
				Map<String, String> mapVO = comEmlSndInfoVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new MailDBDAOComEmlSndInfoVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComEmlSndInfoVO .class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
}