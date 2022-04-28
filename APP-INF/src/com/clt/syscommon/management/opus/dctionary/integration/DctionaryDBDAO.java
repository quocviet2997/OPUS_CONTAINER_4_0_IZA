/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DctionaryDBDAO.java
*@FileTitle : Dctionary
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.07
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.12.07 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.dctionary.integration;

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
import com.clt.syscommon.management.opus.dctionary.basic.DctionaryBCImpl;
import com.clt.syscommon.management.opus.dctionary.vo.DctionaryVO;

/**
 * NIS2010 DctionaryDBDAO <br>
 * - NIS2010-Dctionary system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Sun JungIn
 * @see DctionaryBCImpl 참조
 * @since J2EE 1.6
 */
public class DctionaryDBDAO extends DBDAOSupport {

	/**
	 * searchDctionary
	 * @param String abbr_cd
	 * @return List<DctionaryVO>
	 * @throws DAOException
	 */
	public List<DctionaryVO> searchDctionary(String abbr_cd) throws DAOException {
		DBRowSet dbRowset = null;
		List<DctionaryVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("abbr_cd", abbr_cd);
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new DctionaryDAOSearchRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, DctionaryVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}	
}
