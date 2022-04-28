/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LeasingCompanyYardDBDAO.java
*@FileTitle : LeasingCompanyYard
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.leasingcompanyyard.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.leasingcompanyyard.vo.SearchLeasingCompanyYardListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see RegionBCImpl 참조
 * @since J2EE 1.4
 */
public class LeasingCompanyYardDBDAO extends DBDAOSupport {

	/**
	 * LeasingCompanyYard의 모든 목록을 가져온다.<br>
	 * @param SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO
	 * @return List<SearchLeasingCompanyYardListVO>
	 * @throws DAOException
	 */
	public List<SearchLeasingCompanyYardListVO> searchLeasingCompanyYardList(SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//List
		List<SearchLeasingCompanyYardListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try{
			if(searchLeasingCompanyYardListVO  != null){
				Map<String, String> mapVO = searchLeasingCompanyYardListVO  .getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LeasingCompanyYardDBDAOSearchLeasingCompanyYardListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLeasingCompanyYardListVO.class);
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