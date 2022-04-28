/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UsingDoDBDAO.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.integration;

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
import com.clt.sample.rdweb.usingdo.basic.UsingDoBCImpl;


/**
 * NIS2010 UsingDoDBDAO <br>
 * - NIS2010-RdWeb system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author 
 * @see UsingDoBCImpl 참조
 * @since J2EE 1.4
 */
public class UsingDoDBDAO extends DBDAOSupport {

	/**
	 * UsingDoDBDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param model 데이타 모델
	 * @return DBRowSet
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<ComUpldFileVO> comUpldFileVO(ComUpldFileVO comUpldFileVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComUpldFileVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comUpldFileVO != null){
				Map<String, String> mapVO = comUpldFileVO .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new UsingDoDBDAOComUpldFileVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUpldFileVO .class);
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
