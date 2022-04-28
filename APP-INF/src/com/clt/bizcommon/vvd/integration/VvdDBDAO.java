/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_02DBDAO.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvd.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.vvd.basic.VvdBCImpl;
import com.clt.bizcommon.vvd.vo.SearchVvdListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyunsu, Ryu
 * @see VvdBCImpl 참조
 * @since J2EE 1.4
 */
public class VvdDBDAO extends DBDAOSupport {
	
    /**
     * Vessel의 모든 목록을 가져온다.<br>
     * @param etDeta
     * @param sdDate
     * @param edDate
     * @param vvdCd
     * @param locCd
     * @param laneCd
     * @param oper
     * @param iPage
     * @return List<SearchVesselListVO>
     * @throws DAOException
     */
    public List<SearchVvdListVO> searchVvdList(String etDeta, String sdDate, String edDate, String vvdCd, String locCd, String laneCd, String oper, int iPage) throws DAOException {
    	
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchVvdListVO> list = null;
		DBRowSet dbRowset = null;

        Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		// 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;  
		
		if(!edDate.equals("")) {
			param.put("edate", edDate);
			velParam.put("edate", edDate);
		}
		if(!sdDate.equals("")) {
			param.put("sdate", sdDate);
			velParam.put("sdate", sdDate);
		}
		if(!vvdCd.equals("")) {
			param.put("vvd_cd", vvdCd);
			velParam.put("vvd_cd", vvdCd);
		}
		if(!locCd.equals("")) {
			param.put("loc_cd", locCd);
			velParam.put("loc_cd", locCd);
		}
		if(!laneCd.equals("")) {
			param.put("lane_cd", laneCd);
			velParam.put("lane_cd", laneCd);
		}

        if(etDeta != null && etDeta.equals("D")) {
        	velParam.put("table", "D");
        } else {
        	velParam.put("table", "A");
        }
        param.put("startpart", startPart);
		param.put("endpart", endPart);
		try {
			dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new VvdDBDAOTotalVvdRSQL(), param, velParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VvdDBDAOSearchVvdListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchVvdListVO.class);
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