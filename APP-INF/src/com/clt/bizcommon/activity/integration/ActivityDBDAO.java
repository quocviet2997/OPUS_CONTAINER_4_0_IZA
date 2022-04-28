/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MovementDAO.java
*@FileTitle : Movement Code
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2012.02.17 김종옥
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.activity.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.activity.basic.ActivityBCImpl;
import com.clt.bizcommon.activity.vo.SearchMdmActivityVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.MdmMvmtStsVO;


/**
 * NIS2010 ActivityDAO <br>
 * - NIS2010-BizCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author KIM JONG OCK
 * @see AcitivityBCImpl 참조
 * @since J2EE 1.4
 */
public class ActivityDBDAO extends DBDAOSupport {

	/**
	 * MovementDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param SearchMdmActivityVO mdmactivityvo
	 * @return List<SearchMdmActivityVO>
	 * @Exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<SearchMdmActivityVO> searchActivityList(SearchMdmActivityVO mdmactivityvo) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchMdmActivityVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(mdmactivityvo != null){
				Map<String, String> mapVO = mdmactivityvo .getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ActivityDBDAOSearchMdmActivityRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchMdmActivityVO .class);
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
