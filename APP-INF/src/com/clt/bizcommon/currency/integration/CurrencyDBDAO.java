/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CurrencyDAO.java
*@FileTitle : Currency Code
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.22
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.04.22 박의수
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.currency.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.currency.basic.CurrencyBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.MdmCurrencyVO;


/**
 * NIS2010 CurrencyDAO <br>
 * - NIS2010-BizCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Eui-Su Park
 * @see CurrencyBCImpl 참조
 * @since J2EE 1.4
 */
public class CurrencyDBDAO extends DBDAOSupport {

	/**
	 * CurrencyDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param MdmCurrencyVO mdmcurrencyvo 데이타 모델
	 * @return List<MdmCurrencyVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<MdmCurrencyVO> searchCurrencyList(MdmCurrencyVO mdmcurrencyvo) throws DAOException {
		DBRowSet dbRowset = null;
		List<MdmCurrencyVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(mdmcurrencyvo != null){
				Map<String, String> mapVO = mdmcurrencyvo .getColumnValues();
				if(!"".equals(mdmcurrencyvo.getMdmYN())){
					param.put("mdm_yn", mdmcurrencyvo.getMdmYN());
					velParam.put("mdm_yn", mdmcurrencyvo.getMdmYN());
				}
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CurrencyDBDAOMdmCurrencyVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MdmCurrencyVO .class);
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
