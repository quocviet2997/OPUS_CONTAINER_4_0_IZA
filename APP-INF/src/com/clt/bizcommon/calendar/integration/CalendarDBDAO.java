/*=========================================================*Copyright(c) 2006 CyberLogitec
*@FileName : countryDBDAO.java
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.calendar.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.calendar.event.ComEns0S1Event;
import com.clt.bizcommon.calendar.event.ComEns0S2Event;
import com.clt.bizcommon.calendar.event.ComEns0S3Event;
import com.clt.bizcommon.calendar.event.ComEns0S4Event;
import com.clt.bizcommon.comm.Constants;
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
 * @see countryBCImpl 참조
 * @since J2EE 1.4
 */
public class CalendarDBDAO extends DBDAOSupport {

	/**
	 * country의 모든 목록을 가져온다.<br>
	 * @param et 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchCntHolidayList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
		ComEns0S1Event event = (ComEns0S1Event)et;
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
			if(!event.getCnt_cd().equals("")) {
				param.put("cnt_cd", event.getCnt_cd());
				velParam.put("cnt_cd", event.getCnt_cd());
			}
			if(!event.getFrDate().equals("")) {
				param.put("frdate_cnt", event.getFrDate());
				velParam.put("frdate_cnt", event.getFrDate());
			}
			if(!event.getToDate().equals("")) {
				param.put("todate_cnt", event.getToDate());
				velParam.put("todate_cnt", event.getToDate());
			}
			param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CalenderDBDAOCntHolidayRSQL(), param, velParam);
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
	 * VslResidualSpaceManage의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * @param et 
	 * @param user_id 
	 * @see EES_EQR_0S2Event
	 * @throws DAOException
	 */
	public void modifyCntHoliday(Event et, String user_id) throws DAOException {
		ComEns0S1Event event=(ComEns0S1Event)et;   	
		SQLExecuter sqlExe = new SQLExecuter("");
        try {
            // 화면 Sheet1에서 입력된 정보 받기  
            String[] ibflag 			= (String[])event.getObject("ibflag");	
			String[] hol_id         	= (String[])event.getObject("hol_id");          
            String[] hol_nm         	= (String[])event.getObject("hol_nm");       
            String[] cnt_cd             = (String[])event.getObject("cnt_cd");           
            String[] frDate 	       	= (String[])event.getObject("frDate");      
            String[] toDate        		= (String[])event.getObject("toDate");           
            
			int rowCount = (ibflag==null) ? 0 : ibflag.length;
			int result = 0;
            for(int k=0; k<rowCount; k++) {
            	//query parameter
        		Map<String, Object> param = new HashMap<String, Object>();
            	if(ibflag[k].equals("I")) {            	    			    	
                	param.put("hol_id", "C" + frDate[k].substring(0,4));
                	param.put("hol_nm", hol_nm[k]);
                	param.put("cnt_cd", cnt_cd[k]);
                	param.put("hol_fm_dt", frDate[k]);
                	param.put("hol_to_dt", toDate[k]);
                	param.put("cre_usr_id", user_id);
                	
        			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOCntHolidayCSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to insert SQL");	  
                	
            	}else if(ibflag[k].equals("U")) {
                	param.put("hol_id", hol_id[k]);
                	param.put("hol_nm", hol_nm[k]);
                	param.put("cnt_cd", cnt_cd[k]);
                	param.put("hol_fm_dt", frDate[k]);
                	param.put("hol_fm_dt", toDate[k]);
                	param.put("upd_usr_id", user_id);                 	
               		
        			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOCntHolidayUSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to update SQL");	
    
            	}else if(ibflag[k].equals("D")) {
                	param.put("hol_id", hol_id[k]);
                	param.put("upd_usr_id", user_id);  
                	
        			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOCntHolidayDSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to delete SQL");
            	}                	
            }                    
    	}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * country의 모든 목록을 가져온다.<br>
	 * @param et 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchSteHolidayList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
    	ComEns0S2Event event=(ComEns0S2Event)et;
    	
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
	        // 페이징 처리
			int currentPage = event.getIPage();		
			int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
			int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
	        if(!event.getCnt_cd().equals("")) {
	        	param.put("cnt_cd", event.getCnt_cd());
			}
	        if(!event.getSte_cd().equals("")) {
	        	param.put("ste_cd", event.getSte_cd());
			}
	        if(!event.getFrDate().equals("") && !event.getToDate().equals("")) {
	        	param.put("hol_fm_dt", event.getFrDate());
	        	param.put("hol_to_dt", event.getToDate());
			}
        
        	param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CalenderDBDAOSteHolidayRSQL(), param, velParam);
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
	 * VslResidualSpaceManage의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * @param et 
	 * @param user_id 
	 * @see EES_EQR_0S2Event
	 * @throws DAOException
	 */
	public void modifySteHoliday(Event et, String user_id) throws DAOException {
		ComEns0S2Event event=(ComEns0S2Event)et;   	
		SQLExecuter sqlExe = new SQLExecuter("");
        try {
            // 화면 Sheet1에서 입력된 정보 받기  
            String[] ibflag 			= (String[])event.getObject("ibflag");	
			String[] hol_id         	= (String[])event.getObject("hol_id");          
            String[] hol_nm         	= (String[])event.getObject("hol_nm");       
            String[] cnt_cd             = (String[])event.getObject("cnt_cd");
            String[] ste_cd             = (String[])event.getObject("ste_cd");
            String[] frDate 	       	= (String[])event.getObject("frDate");      
            String[] toDate        		= (String[])event.getObject("toDate");           
            String[] hol_knd_cd        	= (String[])event.getObject("hol_knd_cd");
            
			int rowCount = (ibflag == null) ? 0 : ibflag.length;
			int result = 0;
            for(int k=0; k<rowCount; k++) {
            	//query parameter
        		Map<String, Object> param = new HashMap<String, Object>();
            	if(ibflag[k].equals("I")) {
                	// insert area
                	if(ste_cd[k] == null || ste_cd[k].equals("")){ 
                		param.put("hol_id", "C" + frDate[k].substring(0,4));
                	}else{
                		param.put("hol_id", "S" + frDate[k].substring(0,4));
                	}
                	param.put("hol_nm", hol_nm[k]);
                	if(ste_cd[k] == null || ste_cd[k].equals("")){
                		param.put("hol_knd_cd", "C");
                	}else{
                		param.put("hol_knd_cd", "S");
                	}
                	param.put("cnt_cd", cnt_cd[k]);
                	param.put("ste_cd", ste_cd[k]);
                	param.put("hol_fm_dt", frDate[k]);
                	param.put("toDate", toDate[k]);
                	param.put("cre_usr_id", user_id);
                	
        			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayCSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to insert SQL");
        			
            	}else if(ibflag[k].equals("U")) { 
            		param.put("hol_nm", hol_nm[k]);
                	param.put("cnt_cd", cnt_cd[k]);
                	param.put("ste_cd", ste_cd[k]);
                	param.put("hol_fm_dt", frDate[k]);
                	param.put("hol_to_dt", toDate[k]);
                	param.put("upd_usr_id", hol_id[k]);
                	param.put("hol_id", user_id);
                	
        			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayUSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to update SQL");
        			
            	}else if(ibflag[k].equals("D")) {
                	if("S".equals(hol_knd_cd[k])) {
                		// 1. PRD_HOLIDAY UPDATE
                		param.put("hol_id", hol_id[k]);
                    	param.put("upd_usr_id", user_id);
                    	
            			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayUDSQL(), param, null);
            			if(result == Statement.EXECUTE_FAILED)
            					throw new DAOException("Fail to delete U SQL");
                	} else {
                		// 주(State)가 없는 국가 Holiday인 경우, PRD_HOLIDAY 업데이트 처리함
                		if(event.getSte_cd() == null || event.getSte_cd().equals("")) {
                    		// 1. PRD_HOLIDAY UPDATE
                			param.put("hol_id", hol_id[k]);
                        	param.put("upd_usr_id", user_id);
                        	
                			result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayUDSQL(), param, null);
                			if(result == Statement.EXECUTE_FAILED)
                					throw new DAOException("Fail to delete U SQL");
                		} else {
                    		// 2. PRD_HOLIDAY_DELT INSERT
                			param.put("hol_id", hol_id[k]);
                			param.put("cnt_cd", cnt_cd[k]);
                			param.put("ste_cd", event.getSte_cd());
                        	param.put("upd_usr_id", user_id);
                        	
                        	result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayIDSQL(), param, null);
                			if(result == Statement.EXECUTE_FAILED)
                					throw new DAOException("Fail to delete I SQL");
                		}
                	}
            	}                	
            }                    
        }catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * country의 모든 목록을 가져온다.<br>
	 * @param et 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchLocHolidayList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
    	ComEns0S3Event event=(ComEns0S3Event)et;
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
	        if(!event.getCnt_cd().equals("")) {
	        	param.put("cnt_cd", event.getCnt_cd());
	        	velParam.put("cnt_cd", event.getCnt_cd());
	        }
	        if(!event.getSte_cd().equals("")) {
	        	param.put("ste_cd", event.getSte_cd());
	        	velParam.put("ste_cd", event.getSte_cd());
			}
	        if(!event.getLoc_cd().equals("")) {
	        	param.put("loc_cd", event.getLoc_cd());
	        	velParam.put("loc_cd", event.getLoc_cd());
			}
	        if(!event.getFrDate().equals("") && !event.getToDate().equals("")) {
	        	param.put("hol_fm_dt", event.getFrDate());
	        	velParam.put("hol_fm_dt", event.getFrDate());
	        	param.put("hol_to_dt", event.getToDate());
	        	velParam.put("hol_to_dt", event.getToDate());
			}
	        param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CalenderDBDAOLocHolidayRSQL(), param, velParam);
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
	 * VslResidualSpaceManage의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * @param et 
	 * @param user_id 
	 * @see EES_EQR_0S2Event
	 * @throws DAOException
	 */
	public void modifyLocHoliday(Event et, String user_id) throws DAOException {
		ComEns0S3Event event=(ComEns0S3Event)et;   	
		SQLExecuter sqlExe = new SQLExecuter("");
        try {
                       
            // 화면 Sheet1에서 입력된 정보 받기  
            String[] ibflag 			= (String[])event.getObject("ibflag");	
			String[] hol_id         	= (String[])event.getObject("hol_id");          
            String[] hol_nm         	= (String[])event.getObject("hol_nm");       
            String[] cnt_cd             = (String[])event.getObject("cnt_cd");
            String[] ste_cd             = (String[])event.getObject("ste_cd");
            String[] loc_cd             = (String[])event.getObject("loc_cd");
            String[] frDate 	       	= (String[])event.getObject("frDate");      
            String[] toDate        		= (String[])event.getObject("toDate");           
            String[] hol_knd_cd        	= (String[])event.getObject("hol_knd_cd");
            
			int rowCount = (ibflag==null) ? 0 : ibflag.length;
			int result = 0;          	
            for(int k=0; k<rowCount; k++) {
            	//query parameter
        		Map<String, Object> param = new HashMap<String, Object>();
            	if(ibflag[k].equals("I")) {
                	// insert area
                	if(loc_cd[k] == null || loc_cd[k].equals("")){
                		param.put("hol_id", "C" + frDate[k].substring(0,4));
                	}else{
                		param.put("hol_id", "L" + frDate[k].substring(0,4));
                	}
                	param.put("hol_nm", hol_nm[k]);
                	
                	if(loc_cd[k] == null || loc_cd[k].equals("")){
                		param.put("hol_knd_cd", "C");
                	}else{	
                		param.put("hol_knd_cd", "L");
                	}
                	param.put("cnt_cd", cnt_cd[k]);                
                	param.put("ste_cd", ste_cd[k]);
                	param.put("loc_cd", loc_cd[k]);
                	param.put("hol_fm_dt", frDate[k]); 		
                	param.put("hol_to_dt", toDate[k]);    		
                	param.put("cre_usr_id", user_id);
                	result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayCSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to insert SQL");        
            	}else if(ibflag[k].equals("U")) {            	    			    	
                 	// update area                  		
            		param.put("hol_nm", hol_nm[k]);          	       
            		param.put("cnt_cd", cnt_cd[k]);
            		param.put("ste_cd", ste_cd[k]);
            		param.put("loc_cd", loc_cd[k]);
            		param.put("hol_fm_dt", frDate[k]);    
            		param.put("hol_to_dt", toDate[k]);    
            		param.put("upd_usr_id", user_id);      
               		// check area 
            		param.put("hol_id", hol_id[k]); 
            		result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayUSQL(), param, null);
        			if(result == Statement.EXECUTE_FAILED)
        					throw new DAOException("Fail to updata SQL");
            	}else if(ibflag[k].equals("D")) {
                	if("L".equals(hol_knd_cd[k])) {
                		// 1. PRD_HOLIDAY UPDATE
                		param.put("upd_usr_id", user_id); 
                		param.put("hol_id", hol_id[k]);
                		result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayUDSQL(), param, null);
            			if(result == Statement.EXECUTE_FAILED)
            					throw new DAOException("Fail to delete U SQL");
                	} else {
                		// 2. PRD_HOLIDAY_DELT INSERT
                		param.put("hol_id", hol_id[k]);
                		param.put("cnt_cd", cnt_cd[k]);
                		param.put("ste_cd", (ste_cd[k] == null || "".equals(ste_cd[k])) ? " " : ste_cd[k]);
                		param.put("loc_cd", event.getLoc_cd());
                		param.put("delt_usr_id", user_id);
                    	result = sqlExe.executeUpdate((ISQLTemplate)new CalenderDBDAOSteHolidayIDSQL(), param, null);
            			if(result == Statement.EXECUTE_FAILED)
            					throw new DAOException("Fail to delete I SQL");
            		}
            	}
        	}                	                  
	    }catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Monthly Holiday(by Country) 목록을 가져온다.<br>
	 * @param et COM_ENS_0S4Event
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public Collection searchMonthlyHolidayList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
		ComEns0S4Event event=(ComEns0S4Event)et;
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		// 최종 데이터를 저장할 Collection객체
        Collection collection = new ArrayList();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
	        if(!event.getCnt_cd().equals("")){
	        	param.put("cnt_cd", event.getCnt_cd());
	        	velParam.put("cnt_cd", event.getCnt_cd());
	        }
	        if(!event.getYear().equals("")){
	        	param.put("year", event.getYear());
	        	velParam.put("year", event.getYear());
	        }
	        String[] counts = {"01","02","03","04","05","06","07","08","09","10","11","12"};
	        velParam.put("counts", counts);
	        param.put("startpart", startPart);
			param.put("endpart", endPart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CalenderDBDAOMonthlyHolidayRSQL(), param, velParam);

            // DBRowset을 Collection 객체로 변환
		    while(dbRowset.next()) {
			    String cnt_nm = dbRowset.getString("cnt_nm");
			    String month = dbRowset.getString("month");
			    String frDay = dbRowset.getString("frDay");
			    String toDay = dbRowset.getString("toDay");
			    String hol_nm = dbRowset.getString("hol_nm");
			    int monthly_seq = dbRowset.getInt("monthly_seq");
			   
			    ArrayList arrRow = new ArrayList();
			    int monthly_seq_tmp = 0;
			    for(int j=1; j<=12; j++) {
				    if(j == 1) {
					    arrRow.add(cnt_nm);
				    }
				    if(j == Integer.parseInt(month)) {
					    arrRow.add(frDay);
					    arrRow.add(toDay);
					    arrRow.add(hol_nm);
				    } else {
					    arrRow.add("");
					    arrRow.add("");
					    arrRow.add("");
					   
					    if(j > Integer.parseInt(month)) {
						    if(dbRowset.next()) {
						    	monthly_seq_tmp = dbRowset.getInt("monthly_seq");
						    	if(monthly_seq != monthly_seq_tmp) {
						    		dbRowset.previous();
						    	} else {
								    month = dbRowset.getString("month");
								    frDay = dbRowset.getString("frDay");
								    toDay = dbRowset.getString("toDay");
								    hol_nm = dbRowset.getString("hol_nm");
						    	}						    
						    }
					    }
				    }
			    }
			    collection.add(arrRow);
		    }
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
        return collection;
	}
}