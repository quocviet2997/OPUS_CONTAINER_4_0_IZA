/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AccountDAO.java
*@FileTitle : Account Code
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.04.20 김석준
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.account.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.account.basic.AccountBCImpl;
import com.clt.bizcommon.account.vo.SearchMdmAccountVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.MdmAccountVO;



/**
 * NIS2010 AccountDAO <br>
 * - NIS2010-BizCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Suk Jun Kim
 * @see AccountBCImpl 참조
 * @since J2EE 1.4
 */
public class AccountDBDAO extends DBDAOSupport {

	/**
	 * AccountDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param SearchMdmAccountVO mdmaccountvo
	 * @return List<MdmAccountVO>
	 * @Exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<MdmAccountVO> searchAccountList(SearchMdmAccountVO mdmaccountvo) throws DAOException {
		DBRowSet dbRowset = null;
		List<MdmAccountVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(mdmaccountvo != null){
				Map<String, String> mapVO = mdmaccountvo .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new AccountDBDAOMdmAccountVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MdmAccountVO .class);
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
