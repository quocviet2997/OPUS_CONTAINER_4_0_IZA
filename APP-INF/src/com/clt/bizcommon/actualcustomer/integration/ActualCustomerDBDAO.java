/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Customer_02DBDAO.java
*@FileTitle : Customer_02
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-10
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-10 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.actualcustomer.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.actualcustomer.basic.ActualCustomerBCImpl;
import com.clt.bizcommon.actualcustomer.event.ComEns042Event;
import com.clt.bizcommon.comm.Constants;
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
 * @author sangyool pak
 * @see ActualCustomerBCImpl 참조
 * @since J2EE 1.4
 */
public class ActualCustomerDBDAO extends DBDAOSupport {
	
    /**
     * 1. 기능 : CntrRepoPlanManage<p>
     * 2. 처리개요 : CustomerA의 총 카운트를 조회한다.<p>
     * - CntrRepoPlanManage<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : paksangyool/2006.06.29<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
     * @param et COM_ENS_042Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalCustomer_02(Event et) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
		ComEns042Event event=(ComEns042Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
    	// PDTO(Data Transfer Object including Parameters)
        try {
			if(!event.getLoc_cd().equals("")) {
				param.put("loc_cd", event.getLoc_cd());
				velParam.put("loc_cd", event.getLoc_cd());
			}             
	        
			if(!event.getCust_cd().equals("")) {
				param.put("cust_cd", event.getCust_cd());
				velParam.put("cust_cd", event.getCust_cd());
			}      
			
			if(!event.getCust_nm().equals("")) {
				param.put("cust_nm", event.getCust_nm());
				velParam.put("cust_nm", event.getCust_nm());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ActualCustomerDBDAOTotalCustomerRSQL(), param, velParam);
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
     * Customer_02의 모든 목록을 가져온다.<br>
     * @param et COM_ENS_042Event
     * @return DBRowSet DB 처리 결과
     * @throws DAOException
     */
    public DBRowSet searchCustomer_02List(Event et) throws DAOException {
    	DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
		ComEns042Event event=(ComEns042Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        try {
	        // 페이징 처리
			int currentPage = event.getIPage();
			int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
			int endPart     = Constants.PAGE_SIZE_50 * currentPage;
	
			if(!event.getLoc_cd().equals("")) {
				param.put("loc_cd", event.getLoc_cd());
				velParam.put("loc_cd", event.getLoc_cd());
			}             
	        
			if(!event.getCust_cd().equals("")) {
				param.put("cust_cd", event.getCust_cd());
				velParam.put("cust_cd", event.getCust_cd());
			}      
			
			if(!event.getCust_nm().equals("")) {
				param.put("cust_nm", event.getCust_nm());
				velParam.put("cust_nm", event.getCust_nm());
			}
			param.put("endpart", endPart);
			param.put("startpart", startPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ActualCustomerDBDAOSearchCustomerRSQL(), param, velParam);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
    }

    /**
     * 1. 기능 : CntrRepoPlanManage<p>
     * 2. 처리개요 : CustomerA의 총 카운트를 조회한다.<p>
     * - CntrRepoPlanManage<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : paksangyool/2006.06.29<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
     * @param et COM_ENS_042Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalFactory(Event et) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
		ComEns042Event event=(ComEns042Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
    	// PDTO(Data Transfer Object including Parameters)
        try {
	 		if(!event.getCust_cd().equals("")) {
	 			param.put("cust_cd", event.getCust_cd());
				velParam.put("cust_cd", event.getCust_cd());
			} 
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ActualCustomerDBDAOTotalFactoryRSQL(), param, velParam);
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
     * Customer_02의 모든 목록을 가져온다.<br>
     * @param et COM_ENS_042Event
     * @return DBRowSet DB 처리 결과
     * @throws DAOException
     */
    public DBRowSet searchFactoryList(Event et) throws DAOException {
    	DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
		ComEns042Event event=(ComEns042Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        try {
	        // 페이징 처리
			int currentPage = event.getIPage();
			int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
			int endPart     = Constants.PAGE_SIZE_50 * currentPage;

			if(!event.getCust_cd().equals("")) {
				param.put("cust_cd", event.getCust_cd());
				velParam.put("cust_cd", event.getCust_cd());
			}
			param.put("endpart", endPart);
			param.put("startpart", startPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ActualCustomerDBDAOSearchFactoryRSQL(), param, velParam);
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