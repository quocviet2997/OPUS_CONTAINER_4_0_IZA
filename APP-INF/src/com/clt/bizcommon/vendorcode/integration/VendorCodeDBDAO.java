/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : VendorCodeDBDAO.java
*@FileTitle : Vendor Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.22
*@LastModifier : 김종호
*@LastVersion : 1.0
* 2012.02.22 김종호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.charge.integration.ChargeDBDAOTotalChargeRSQL;
import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.vendorcode.basic.VendorCodeBCImpl;
import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * ALPS VendorCodeDBDAO <br>
 * - ALPS-BizCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jong-Ho Kim
 * @see VendorCodeBCImpl 참조
 * @since J2EE 1.6
 */
public class VendorCodeDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * [COM_COM_0007]을 [SEARCH] 합니다.<br>
	 * 
	 * @param SearchVendorCodeVO searchVendorCodeVO
	 * @param iPage
	 * @return List<SearchVendorCodeVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<SearchVendorCodeVO> searchVendorCode(SearchVendorCodeVO searchVendorCodeVO, int iPage) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchVendorCodeVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_100 * 2 * (currentPage - 1) + 1; // 2015.03.04 set default page size 200
		int endPart     = Constants.PAGE_SIZE_100 * 2 * currentPage;

		try{
			if(searchVendorCodeVO != null){
				Map<String, String> mapVO = searchVendorCodeVO.getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
				param.put("startpart", startPart);
				param.put("endpart", endPart);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VendorCodeDBDAOTotalVendorCodeRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VendorCodeDBDAOSearchVendorCodeRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchVendorCodeVO .class);
			if (list.size() > 0)
				list.get(0).setMaxRows(cnt);  
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