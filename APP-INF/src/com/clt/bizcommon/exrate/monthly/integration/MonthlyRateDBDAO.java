/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MonthlyDBDAO.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.monthly.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.exrate.monthly.event.ComEns0E1Event;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see MonthlyBCImpl 참조
 * @since J2EE 1.4
 */
public class MonthlyRateDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Monthly Exchange Rate count<p>
     * 2. 처리개요 : Monthly Exchange Rate의 총 카운트를 조회한다.<p> 
     * - totalLocation<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.08.03<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param et COM_ENS_0E1Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalMonthlyRate(Event et) throws DAOException {
		
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	ComEns0E1Event event=(ComEns0E1Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		if(!event.getFrYearMon().equals("")) {
			param.put("fr_year_mon", event.getFrYearMon());
			velParam.put("fr_year_mon", event.getFrYearMon());
		}
		if(!event.getToYearMon().equals("")) {
			param.put("to_year_mon", event.getToYearMon());
			velParam.put("to_year_mon", event.getToYearMon());
		}
		if(!event.getCurr_cd().equals("")) {
			param.put("curr_cd", event.getCurr_cd());
			velParam.put("curr_cd", event.getCurr_cd());
		}
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ExchangeRateDAOMonthlyCountRSQL(), param, velParam);
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
	 * Monthly의 모든 목록을 가져온다.<br>
	 * @param et COM_ENS_0E1Event
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchMonthlyRateList(Event et) throws DAOException {
	   	DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	ComEns0E1Event event=(ComEns0E1Event)et;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
		if(!event.getFrYearMon().equals("")) {
			param.put("fr_year_mon", event.getFrYearMon());
			velParam.put("fr_year_mon", event.getFrYearMon());
		}
		if(!event.getToYearMon().equals("")) {
			param.put("to_year_mon", event.getToYearMon());
			velParam.put("to_year_mon", event.getToYearMon());
		}
		if(!event.getCurr_cd().equals("")) {
			param.put("curr_cd", event.getCurr_cd());
			velParam.put("curr_cd", event.getCurr_cd());
		}

		param.put("startpart", startPart);
		param.put("endpart", endPart);

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ExchangeRateDAOMonthlyListRSQL(), param, velParam);
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