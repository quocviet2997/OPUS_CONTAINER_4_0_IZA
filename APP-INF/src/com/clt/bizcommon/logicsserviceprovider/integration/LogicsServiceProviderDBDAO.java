/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LogicsServiceProviderDAO.java
*@FileTitle : LogicsServiceProvider
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.23
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.23 우경민
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.logicsserviceprovider.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.logicsserviceprovider.vo.RMdmVenderVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * NIS2010 LogicsServiceProviderDAO <br>
 * - NIS2010-LogicsServiceProvider system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author KyungMin Woo
 * @see LogisServiceProviderBCImpl 참조
 * @since J2EE 1.4
 */
public class LogicsServiceProviderDBDAO extends DBDAOSupport {

	/**
	 * LogicsServiceProviderDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param RMdmVenderVO rMdmVender
	 * @return List<RMdmVenderVO>
	 * @Exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<RMdmVenderVO> searchLogicsServiceProvider(RMdmVenderVO rMdmVender) throws DAOException {
		DBRowSet dbRowset = null;
		List<RMdmVenderVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{ 
			if(rMdmVender != null){
				Map<String, String> mapVO = rMdmVender .getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new LogicsServiceProviderDBDAOTotalCntRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) cnt = dbRowset.getInt("cnt");

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LogicsServiceProviderDBDAORMdmVenderRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, RMdmVenderVO .class);
			if (list.size() > 0)
				list.get(0).setMaxRows(cnt);  
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
