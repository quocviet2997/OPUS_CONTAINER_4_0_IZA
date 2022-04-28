/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentDBDAO.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.state.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.bizcommon.continent.basic.ContinentBCImpl;
import com.clt.bizcommon.state.event.ComEns0X1Event;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see ContinentBCImpl 참조
 * @since J2EE 1.4
 */
public class StateDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : State count<p>
     * 2. 처리개요 : State의 총 카운트를 조회한다.<p>
     * - totalState<p>
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
	 * @param et COM_ENS_0X1Event
     * @return int
     * @throws DAOException
     */
	public int totalState(Event et) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
		ComEns0X1Event event=(ComEns0X1Event)et;
		
    	// Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        
        String cnt_cd = event.getCnt_cd();
        String mdm_yn = event.getMdmYN();
        String delt_flg = event.getDeltFlg();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT COUNT(*)             				\n");
        queryStr.append(" FROM mdm_State                  			\n");                 
        queryStr.append(" WHERE 1 = 1 								\n");
        if(cnt_cd != null && !cnt_cd.equals("")) {
        	queryStr.append(" AND cnt_cd = '" + cnt_cd + "' ");
        }
		if("Y".equals(mdm_yn)){
			if("Y".equals(delt_flg)){
				queryStr.append(" AND NVL(DELT_FLG, 'N') = 'Y'");
			}else if(!"ALL".equals(delt_flg)){
				queryStr.append(" AND NVL(DELT_FLG, 'N') <> 'Y'");
			}
		}else{
			queryStr.append(" AND NVL(DELT_FLG, 'N') <> 'Y'");
		}
        
		try {
			con = getConnection();	
			
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());	
  			}			
  			
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString() );
      	  	}			
  				
  			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(), de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		} finally {
			closeResultSet(rs);
			closeStatement(ps);
			closeConnection(con);
		}
	}
	
	/**
	 * State의 모든 목록을 가져온다.<br>
	 * @param et COM_ENS_0X1Event
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchStateList(Event et) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
		ComEns0X1Event event=(ComEns0X1Event)et;
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dRs = null;
        
        String cnt_cd = event.getCnt_cd();
        String mdm_yn = event.getMdmYN();
        String delt_flg = event.getDeltFlg();
        
        StringBuffer queryStr = new StringBuffer();
       
		queryStr.append(" SELECT ste_cd,              	\n");
		queryStr.append("        ste_nm,          	 	\n");
		queryStr.append("        cnt_cd,          	 	\n");
		queryStr.append("        modi_ste_cd,      		\n");
		queryStr.append(" (CASE 							\n");
		queryStr.append(" 		WHEN 'Y' = delt_flg THEN 'Delete' \n");
		queryStr.append(" 		ELSE 'Active' 				\n");
		queryStr.append(" 	END) AS delt_flg				\n");
		queryStr.append(" FROM mdm_State             \n");
		queryStr.append(" WHERE 1 = 1 ");
		
		if(cnt_cd != null && !cnt_cd.equals("")) {
        	queryStr.append(" AND cnt_cd = '" + cnt_cd + "' ");
        }
		
		if("Y".equals(mdm_yn)){
			if("Y".equals(delt_flg)){
				queryStr.append(" AND NVL(DELT_FLG, 'N') = 'Y'");
			}else if(!"ALL".equals(delt_flg)){
				queryStr.append(" AND NVL(DELT_FLG, 'N') <> 'Y'");
			}
		}else{
			queryStr.append(" AND NVL(DELT_FLG, 'N') <> 'Y'");
		}
		queryStr.append("ORDER BY cnt_cd , ste_cd");
        try {
            con = getConnection();
            
            // Loggable Statement 사용에 의해 추가 
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());
  			}
            
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString());
      	  	}			
            
  			rs = ps.executeQuery();

            // 결과를 DBRowset에 담는다.
            dRs = new DBRowSet();
            dRs.populate(rs);
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (DAOException de) {
            log.error(de.getMessage(), de);
            throw de;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
        return dRs;
	}
}