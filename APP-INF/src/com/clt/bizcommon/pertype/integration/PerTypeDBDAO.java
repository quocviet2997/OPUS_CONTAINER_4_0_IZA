/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PerTypeDBDAO.java
*@FileTitle : PerType
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 박광석
*@LastVersion : 1.0
* 2009.04.08 박광석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.pertype.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.pertype.basic.PerTypeBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.PriRatUtVO;

/**
 * ALPS PerTypeDBDAO <br>
 * - ALPS-PerType system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Prak Kwang Seok
 * @see PerTypeBCImpl 참조
 * @since J2EE 1.4
 */
public class PerTypeDBDAO extends DBDAOSupport {

	/**
	 * PerTypeDBDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param PriRatUtVO pretypevo 데이타 모델
	 * @return List<PriRatUtVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
		public List<PriRatUtVO> searchPertypeList(PriRatUtVO pretypevo) throws DAOException {
			List<PriRatUtVO> list = null;
			DBRowSet dbRowset = null;
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				if(pretypevo != null){
					Map<String, String> mapVO = pretypevo.getColumnValues();
				
					param.putAll(mapVO);
					velParam.putAll(mapVO);
				}
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new PerTypeDBDAOPerTypeVORSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, PriRatUtVO.class);

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
