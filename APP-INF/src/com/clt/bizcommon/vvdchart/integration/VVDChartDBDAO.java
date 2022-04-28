/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VVDChartDBDAO.java
*@FileTitle : VVDChart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-19
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-19 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvdchart.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.vvdchart.basic.VVDChartBCImpl;
import com.clt.bizcommon.vvdchart.vo.VVDChartListVO;
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
 * @see VVDChartBCImpl 참조
 * @since J2EE 1.4
 */
public class VVDChartDBDAO extends DBDAOSupport {
	
	/**
	 * VVDChart의 모든 목록을 가져온다.<br>
	 * @param String scnr_id
	 * @param String depth
	 * @param String chkDepth
	 * @return List<VVDChartListVO>
	 * @throws DAOException
	 */
	public List<VVDChartListVO> searchVVDChartList(String scnr_id, String depth, String chkDepth) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		//List
		List<VVDChartListVO> list = null; 
		
        try{
        	// 1:Trade, 2:LANE, 3:VVD
        	if(depth == null || depth.equals("")) {
        		velParam.put("depth", "3");
        	}else{
        		velParam.put("depth", depth);
        	}
        	if(!scnr_id.equals("")){
        		param.put("scnr_id", scnr_id);
				velParam.put("scnr_id", scnr_id);
        	}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VVDChartDBDAOVVDChartListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, VVDChartListVO.class);
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