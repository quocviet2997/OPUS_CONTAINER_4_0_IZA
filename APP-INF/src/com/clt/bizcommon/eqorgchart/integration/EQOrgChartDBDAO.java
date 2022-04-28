/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EQOrgChartDBDAO.java
*@FileTitle : EQ Organization Chart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-11
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-11 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.eqorgchart.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.eqorgchart.basic.EQOrgChartBCImpl;
import com.clt.bizcommon.eqorgchart.vo.EQQrgChartListVO;
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
 * @see EQOrgChartBCImpl 참조
 * @since J2EE 1.4
 */
public class EQOrgChartDBDAO extends DBDAOSupport {
	
	/**
     * 1. 기능 : EQ Organization count<p>
     * 2. 처리개요 : EQ Organization 의 총 카운트를 조회한다.<p>
     * - totalEQOrgChartList<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.10.12<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param String depth
	 * @param String chkDepth
     * @return int
     * @throws DAOException
     *
     */
	public int totalEQOrgChartList(String depth, String chkDepth, String sccFlag) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
	        int iDepth		 = 0;        
	        if(depth != null && !depth.equals("")) {
	        	iDepth = Integer.parseInt(depth);        		
	        }
	        
	        if(iDepth < 4){
	        	velParam.put("idepth", iDepth);
	        }
	        
	        velParam.put("sccFlag", sccFlag);
	        dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new EQOrganizationDBDAOTotalListRSQL(), param, velParam);
			if (dbRowset.next()) {
				return dbRowset.getInt(1);
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return 0;
	}
	
	/**
	 * EQOrgChart의 모든 목록을 가져온다.<br>
	 * @param String depth
	 * @param String chkDepth
	 * @param String sccFlag
	 * @return List<EQQrgChartListVO>
	 * @throws DAOException
	 */
	public List<EQQrgChartListVO> searchEQOrgChartList(String depth, String chkDepth, String sccFlag) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		//List
		List<EQQrgChartListVO> list = null; 
		try {
	        
	        int iDepth		 = 0;        
	        if(depth != null && !depth.equals("")) {
	        	iDepth = Integer.parseInt(depth);
	        }
	        
	        if(iDepth < 4){
	        	velParam.put("idepth", iDepth);
	        }
	        velParam.put("sccFlag", sccFlag);
	        dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new EQQrgChartDBDAOEQQrgChartListRSQL(), param, velParam);
	        list = (List)RowSetUtil.rowSetToVOs(dbRowset, EQQrgChartListVO.class);
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