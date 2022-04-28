/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ScheduleUtil.java
 *@FileTitle : ScheduleUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.06.30
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2009.06.30 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.ibsheet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * 
 * @author 정인선
 * @see IbSheetDBDAOSQL
 * @since J2EE 1.4
 */
public class IbSheetDBDAOSQL extends DBDAOSupport {
	
	/**
	 * IB시트 세팅 정보를 조회<br>
	 * @param usr_id
	 * @param scrn_id
	 * @param sh_id
	 * @return String
	 * @throws DAOException
	 */
	public String searchIbSetting(String usr_id, String scrn_id, String sh_id) throws DAOException {
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;        
        
        String sRtn = "";
        
        int i = 1 ;
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT hdr_desc \n ");
		queryStr.append(" FROM com_sh_hdr_info \n ");
		queryStr.append(" WHERE usr_id = ? AND scrn_id = ? AND sh_id = ? \n ");
		
        try {                                                                    
            con = getConnection();
            
            /** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
  			
  			ps.setString(i++, usr_id);
  			ps.setString(i++, scrn_id);
  			ps.setString(i++, sh_id);
			
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString() );
      	  	}			
            
  			rs = ps.executeQuery();
  			
  			if(rs.next()) {
  				sRtn = rs.getString("hdr_desc");
  			}

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
        return sRtn;
	}
	
	/**
	 * IB시트 세팅 정보를 조회<br>
	 * @param usr_id
	 * @param scrn_id
	 * @param sh_id
	 * @return boolean DB 처리 결과
	 * @throws DAOException
	 */
	public boolean chkExist(String usr_id, String scrn_id, String sh_id) throws DAOException {
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;        
        
        boolean bRtn = false;
        
        int i = 1 ;
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT hdr_desc \n ");
		queryStr.append(" FROM com_sh_hdr_info \n ");
		queryStr.append(" WHERE usr_id = ? AND scrn_id = ? AND sh_id = ? \n ");
		
        try {                                                                    
            con = getConnection();
            
            /** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
  			
  			ps.setString(i++, usr_id);
  			ps.setString(i++, scrn_id);
  			ps.setString(i++, sh_id);
			
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString() );
      	  	}			
            
  			rs = ps.executeQuery();
  			
  			if(rs.next()) {
  				bRtn = true;
  			}

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
        return bRtn;
	}
	
	/**
	 * IB시트 세팅 정보 저장<br>
	 * @param usr_id
	 * @param scrn_id
	 * @param sh_id
	 * @param hdr_desc
	 * @throws DAOException
	 */
	public void saveIbSetting(String usr_id, String scrn_id, String sh_id, String hdr_desc) throws DAOException {
		Connection con 				= null;	// Connection Interface 
        PreparedStatement headerInsertPs 	= null;	// INSERT 수행하기 위한 SQL Statement		
        
        int i 			 = 1; 				// PreparedStatement에 bind 변수를 넣을시 증가되는 변수 
        
        StringBuffer headerInsertQuery = new StringBuffer();
        headerInsertQuery.setLength(0);
        
        // ------------------------- INSERT QUERY -------------------------
        headerInsertQuery.append(" INSERT INTO com_sh_hdr_info		 ( 	\n");
        headerInsertQuery.append(" usr_id                 	\n");
        headerInsertQuery.append(",scrn_id              		\n");
        headerInsertQuery.append(",sh_id                 \n");
        headerInsertQuery.append(",hdr_desc )      			\n");
        headerInsertQuery.append(" VALUES (?, ?, ?, ?)  \n");

        try {
            con = getConnection();            
            
            // Loggable Statement 사용에 의해 추가
            if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
            	headerInsertPs = new LoggableStatement(con, headerInsertQuery.toString());
            }else {
            	headerInsertPs = con.prepareStatement(headerInsertQuery.toString());
            }
            
            
    		headerInsertPs.setString(i++, usr_id);
    		headerInsertPs.setString(i++, scrn_id);
    		headerInsertPs.setString(i++, sh_id);
    		headerInsertPs.setString(i++, hdr_desc);
    		
    		// Loggable Statement 사용에 의해 추가
            if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
                log.info("\n SQL :" + ((LoggableStatement)headerInsertPs).getQueryString());
            } else {
                log.info("\n SQL :" + headerInsertPs.toString() );
            }
            
    		headerInsertPs.execute();
    		
    	} catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new DAOException(e.getMessage());
        } finally {
            closeStatement(headerInsertPs);
            closeConnection(con);
        }
	}
	
	/**
	 * IB시트 세팅 정보 Update<br>
	 * @param usr_id
	 * @param scrn_id
	 * @param sh_id
	 * @param hdr_desc
	 * @throws DAOException
	 */
	public void updIbSetting(String usr_id, String scrn_id, String sh_id, String hdr_desc) throws DAOException {
		Connection con 				= null;	// Connection Interface 
        PreparedStatement headerUpdatePs 	= null;	// INSERT 수행하기 위한 SQL Statement		
        
        int i 			 = 1; 				// PreparedStatement에 bind 변수를 넣을시 증가되는 변수 
        
        StringBuffer headerUpdateQuery = new StringBuffer();
        headerUpdateQuery.setLength(0);
        
        // ------------------------- INSERT QUERY -------------------------
        headerUpdateQuery.append(" UPDATE com_sh_hdr_info		  	\n");
        headerUpdateQuery.append(" SET hdr_desc = ?      			\n");
        headerUpdateQuery.append(" WHERE usr_id=? AND scrn_id=? AND sh_id=?  \n");

        try {
            con = getConnection();            
            
            // Loggable Statement 사용에 의해 추가
            if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
            	headerUpdatePs = new LoggableStatement(con, headerUpdateQuery.toString());
            }else {
            	headerUpdatePs = con.prepareStatement(headerUpdateQuery.toString());
            }
            
            headerUpdatePs.setString(i++, hdr_desc);
            headerUpdatePs.setString(i++, usr_id);
            headerUpdatePs.setString(i++, scrn_id);
            headerUpdatePs.setString(i++, sh_id);
    		    		
    		// Loggable Statement 사용에 의해 추가
            if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
                log.info("\n SQL :" + ((LoggableStatement)headerUpdatePs).getQueryString());
            } else {
                log.info("\n SQL :" + headerUpdatePs.toString() );
            }
            
            headerUpdatePs.execute();
    		
    	} catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new DAOException(e.getMessage());
        } finally {
            closeStatement(headerUpdatePs);
            closeConnection(con);
        }
	}
	
	/**
	 * IB시트 세팅 정보 삭제<br>
	 * @param usr_id
	 * @param scrn_id
	 * @param sh_id
	 * @throws DAOException
	 */
	public void delIbSetting(String usr_id, String scrn_id, String sh_id) throws DAOException {
		Connection con 				= null;	// Connection Interface 
        PreparedStatement headerDeletePs 	= null;	// INSERT 수행하기 위한 SQL Statement		
        
        int i 			 = 1; 				// PreparedStatement에 bind 변수를 넣을시 증가되는 변수 
        
        StringBuffer headerDeleteQuery = new StringBuffer();
        headerDeleteQuery.setLength(0);
        
        // ------------------------- INSERT QUERY -------------------------
        headerDeleteQuery.append(" DELETE FROM com_sh_hdr_info		 ( 	\n");
        headerDeleteQuery.append(" WHERE usr_id=? AND scrn_id=? AND sh_id=?	\n");

        try {
            con = getConnection();            
            
            // Loggable Statement 사용에 의해 추가
            if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
            	headerDeletePs = new LoggableStatement(con, headerDeleteQuery.toString());
            }else {
            	headerDeletePs = con.prepareStatement(headerDeleteQuery.toString());
            }
            
            
            headerDeletePs.setString(i++, usr_id);
            headerDeletePs.setString(i++, scrn_id);
            headerDeletePs.setString(i++, sh_id);
    		
    		// Loggable Statement 사용에 의해 추가
            if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
                log.info("\n SQL :" + ((LoggableStatement)headerDeletePs).getQueryString());
            } else {
                log.info("\n SQL :" + headerDeletePs.toString() );
            }
            
            headerDeletePs.execute();
    		
    	} catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new DAOException(e.getMessage());
        } finally {
            closeStatement(headerDeletePs);
            closeConnection(con);
        }
	}
}
