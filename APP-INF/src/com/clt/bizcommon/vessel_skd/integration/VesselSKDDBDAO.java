/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_01DBDAO.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-07 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel_skd.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.vessel_skd.basic.VesselSKDBCImpl;
import com.clt.bizcommon.vessel_skd.event.ComEns0B1Event;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyunsu, Ryu
 * @see VesselSKDBCImpl 참조
 * @since J2EE 1.4
 */
public class VesselSKDDBDAO extends DBDAOSupport {
	
    /**
     * 1. 기능 : Search SKD of VVD<p>
     * 2. 처리개요 : VVD에 따른 스케줄의 총 카운트를 조회한다.<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : Hyunsu Ryu/2006.06.29<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
     * @param et COM_ENS_0B1Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalVessel_SKD_01(Event et) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	ComEns0B1Event event=(ComEns0B1Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		if(!event.getVvd_cd().equals("")) {
			param.put("vvd_cd", event.getVvd_cd());
			velParam.put("vvd_cd", event.getVvd_cd());
		}
		
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VesselSKDDBDAOTotalVesselSKDRSQL(), param, velParam);
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
     * Vessel_SKD_01의 모든 목록을 가져온다.<br>
     * @param et COM_ENS_0B1Event
     * @return DBRowSet DB 처리 결과
     * @throws DAOException
     */
    public DBRowSet searchVessel_SKD_01List(Event et) throws DAOException {
    	DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	ComEns0B1Event event=(ComEns0B1Event)et;
    	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		if(!event.getVvd_cd().equals("")) {
			param.put("vvd_cd", event.getVvd_cd());
			velParam.put("vvd_cd", event.getVvd_cd());
		}
		param.put("startpart", startPart);
		param.put("endpart", endPart);

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new VesselSKDDBDAOVesselSKDListRSQL(), param, velParam);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
   }
}