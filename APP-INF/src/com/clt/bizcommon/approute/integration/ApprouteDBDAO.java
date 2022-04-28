/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ModifyDBDAO.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2008-08-29
*@LastModifier : Jeong-Hoon Kim
*@LastVersion : 1.1
* 2006-10-31 Jeong-Hoon KIM
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approute.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.bizcommon.approute.event.ApprouteEvent;
import com.clt.bizcommon.approval.basic.ApprovalBCImpl;
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
 * @author Jeong-Hoon, KIM
 * @see ApprovalBCImpl 참조
 * @since J2EE 1.4
 */
public class ApprouteDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * StaffList를 찾는다.
	 * @author Jeong-Hoon, KIM
	 * @param et
	 * @return
	 * @throws DAOException
	 * 2008. 09. 03
	 */
	public DBRowSet searchStaffList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
    	ApprouteEvent event=(ApprouteEvent)et;
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dRs = null;
        // PreparedStatement에 bind 변수를 넣을시 증가되는 변수
        int i = 1;

        StringBuffer queryStr = new StringBuffer();
        StringBuffer whereStr = new StringBuffer();
        
        String ofc_cd_deptsrch = event.getOfc_cd_deptsrch();
        
        // 페이징 처리
		//int currentPage = event.getIPage();
		
		//int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		//int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
        if(!ofc_cd_deptsrch.equals("")) {
			whereStr.append(" AND ofc_cd like ? \n");
		}
        
		queryStr.append(" SELECT   	\n");
		queryStr.append("                usr_nm,              \n");
		queryStr.append("                ofc_cd,          	 \n");
		queryStr.append("                psn_eng_nm,          	 \n");
		queryStr.append("                usr_id          	 \n");
		queryStr.append(" FROM com_user    									\n");
		queryStr.append(" WHERE 1 = 1 AND NVL(USE_FLG, 'Y') <> 'N'				\n" + whereStr + "	\n");
		queryStr.append(" ORDER BY psn_eng_nm, usr_nm");
		//queryStr.append("         ) a	                     \n");
		//queryStr.append(" WHERE no BETWEEN ? AND ? ");
	
        try {                                                                    
            con = getConnection();
            
            // Loggable Statement 사용에 의해 추가 
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
            
  			if(!ofc_cd_deptsrch.equals("")) {
  				ps.setString(i++, "%" + ofc_cd_deptsrch + "%");
  			}
  			
			//ps.setInt(i++, startPart);
			//ps.setInt(i++, endPart);
			
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString() );
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
	
	/**
	 * Department를 찾는다.
	 * @author Jeong-Hoon, KIM
	 * @return
	 * @throws DAOException
	 * 2008. 09. 03
	 */
	public DBRowSet searchDeptList() throws DAOException {
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dRs = null;
        
        StringBuffer queryStr = new StringBuffer();
        
        // 아래 쿼리는 향후 MDM_ORGANIZATION 테이블 데이터가 정비되면 수정되어야 함
		queryStr.append(" select level, ofc_cd \n ");
		queryStr.append(" from mdm_organization \n ");
		queryStr.append(" where nvl(delt_flg, 'N') <> 'Y' \n ");
		queryStr.append(" connect by nocycle prior ofc_cd = prnt_ofc_cd \n ");
		queryStr.append(" start with ofc_cd='SELHO' \n ");
		queryStr.append(" order SIBLINGS BY ofc_cd  ");
		
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
	
	/**
	 * ApprovalRoute List를 찾는다.
	 * @author Jeong-Hoon, KIM
	 * @param et
	 * @return
	 * @throws DAOException
	 * 2008. 09. 03
	 */
	public DBRowSet searchApprovalRouteList(Event et) throws DAOException {
		ApprouteEvent event=(ApprouteEvent)et;
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dRs = null;
        
        // PreparedStatement에 bind 변수를 넣을시 증가되는 변수
        int i = 1;
        
        String crsNo = event.getCsrNo();
        
        StringBuffer queryStringBuffer = new StringBuffer();
        
        try {                                                                    
            con = getConnection();
            
            if(crsNo != null && !crsNo.equals("")) {
            	
            	queryStringBuffer.append("SELECT");
            	queryStringBuffer.append("  ROUT.APRO_RQST_SEQ");
            	queryStringBuffer.append(" ,ROUT.APRO_USR_ID \n");
            	queryStringBuffer.append(" ,ROUT.APRO_USR_NM \n");
            	queryStringBuffer.append(" ,ROUT.APRO_OFC_CD \n");
            	queryStringBuffer.append(" ,ROUT.APRO_USR_JB_TIT_NM \n");
            	queryStringBuffer.append(" ,(CASE WHEN ROUT.APSTS_CD = 'C' THEN 'Approved' END) AS APSTS_CD \n");
            	queryStringBuffer.append(" FROM \n");
            	queryStringBuffer.append(" COM_APRO_RQST_ROUT ROUT \n");
            	queryStringBuffer.append(" ,COM_APRO_CSR_DTL CSR \n");
            	queryStringBuffer.append(" ,COM_APRO_RQST_HDR HDR \n");
            	queryStringBuffer.append(" WHERE \n");
            	queryStringBuffer.append(" HDR.APRO_RQST_NO = ROUT.APRO_RQST_NO \n");
            	queryStringBuffer.append(" AND HDR.APRO_RQST_NO = CSR.APRO_RQST_NO \n");
            	queryStringBuffer.append(" AND CSR.CSR_NO = ? \n");
            	queryStringBuffer.append(" AND (ROUT.APSTS_CD <> 'D' OR ROUT.APSTS_CD IS NULL) \n");
            	queryStringBuffer.append(" ORDER BY ROUT.APRO_RQST_SEQ DESC ");
            	
            	String query =queryStringBuffer.toString();
	    		
	            /** Loggable Statement 사용에 의해 추가 */ 
	  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
	  				ps = new LoggableStatement(con, query);
	  			}else{
	  				ps = con.prepareStatement(query);			
	  			}
	  			
	  			ps.setString(i++, crsNo);
	  			
				/** Loggable Statement 사용에 의해 추가 */ 
	  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
	  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
	      	  	}else{
	      	  		log.info("\n SQL :" + query );
	      	  	}
	            
	  			rs = ps.executeQuery();
	  			// 결과를 DBRowset에 담는다.
	            dRs = new DBRowSet();
	            dRs.populate(rs);
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
        return dRs;
	}
	
	/**
	 * Approval Route 정보를 저장한다.<br>
	 * @param et 
	 * @param user_id 
	 * @see EES_EQR_0T2Event
	 * @throws DAOException
	 */
	public void saveApprovalRoute(Event et, String user_id) throws DAOException {
		ApprouteEvent event=(ApprouteEvent)et;   	
        Connection con 				= null;	// Connection Interface 	
		PreparedStatement approvalInsertPs 	= null;	// INSERT 수행하기 위한 SQL Statement 
		PreparedStatement approvalDeletePs 	= null;	// INSERT 수행하기 위한 SQL Statement
//		PreparedStatement approvalUpdatePs 	= null;	// INSERT 수행하기 위한 SQL Statement
		
        int i 			 = 1; 				// PreparedStatement에 bind 변수를 넣을시 증가되는 변수 
        
        StringBuffer approvalInsertQuery = new StringBuffer();
        approvalInsertQuery.setLength(0);
        StringBuffer approvalUpdateQuery = new StringBuffer();
        approvalUpdateQuery.setLength(0); 
        StringBuffer approvalDeleteQuery = new StringBuffer();
        approvalDeleteQuery.setLength(0);
 
        // ------------------------- INSERT QUERY -------------------------
        
        approvalInsertQuery.append(" INSERT INTO COM_APRO_RQST_ROUT	 ( 	\n");
        approvalInsertQuery.append(" APRO_RQST_NO                 	\n");
        approvalInsertQuery.append(",APRO_RQST_SEQ                 	\n");
        approvalInsertQuery.append(",APRO_USR_ID                 \n");
        approvalInsertQuery.append(",APRO_USR_NM             		\n");
        approvalInsertQuery.append(",APRO_OFC_CD             		\n");
        approvalInsertQuery.append(",APRO_USR_JB_TIT_NM             		\n");
        approvalInsertQuery.append(",CRE_USR_ID                  	\n");
        approvalInsertQuery.append(",CRE_DT              		\n");
        approvalInsertQuery.append(",UPD_USR_ID              	\n");
        approvalInsertQuery.append(",DELT_FLG       			\n");
        approvalInsertQuery.append(",APSTS_CD )      			\n");
        approvalInsertQuery.append(" VALUES (?,?, ?, ?, ?, ?, ?, sysdate, ?, 'N',?)  \n");
        
        // ------------------------- DELETE QUERY -------------------------        
        approvalDeleteQuery.append(" DELETE FROM COM_APRO_RQST_ROUT    									\n");
        approvalDeleteQuery.append(" WHERE APRO_RQST_NO    = ?                                   	\n");
        
        String csrNo = event.getCsrNo();
        
        try {
            con = getConnection();            
            
            // Loggable Statement 사용에 의해 추가
            if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
            	approvalInsertPs = new LoggableStatement(con, approvalInsertQuery.toString());
            	approvalDeletePs = new LoggableStatement(con, approvalDeleteQuery.toString());
            }else {
            	approvalInsertPs = con.prepareStatement(approvalInsertQuery.toString());
            	approvalDeletePs = con.prepareStatement(approvalDeleteQuery.toString());
            }

            String apro_rqst_no = getApro_rqst_no(csrNo);
            if(!"".equals(apro_rqst_no)){            	
            	i = 1;
            	approvalDeletePs.setString(i++, apro_rqst_no);    
            	
            	// Loggable Statement 사용에 의해 추가
                if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
                    log.info("\n SQL :" + ((LoggableStatement)approvalDeletePs).getQueryString());
                } else {
                    log.info("\n SQL :" + approvalDeletePs.toString() );
                }
                
                approvalDeletePs.execute();
            }
            
            // 화면 Sheet1에서 입력된 정보 받기  
            String[] arr_apro_seq         	= (String[])event.getObject("apro_seq");          
            String[] arr_usr_id         	= (String[])event.getObject("apro_usr_id");       
            String[] arr_usr_nm             = (String[])event.getObject("apro_usr_nm");           
            String[] arr_ofc_cd 	       	= (String[])event.getObject("apro_ofc_cd");      
            String[] arr_title        		= (String[])event.getObject("apro_usr_jb_tit_nm");       
            String[] arr_apspo_cd        	= (String[])event.getObject("apspo_cd");           
            
			int rowCount = (arr_apro_seq==null) ? 0 : arr_apro_seq.length;
			i = 1;

            
            for(int k=0; k<rowCount; k++) {
            	i = setApprovalPs(user_id, approvalInsertPs, i, apro_rqst_no,
						arr_apro_seq, arr_usr_id, arr_usr_nm, arr_ofc_cd,
						arr_title, arr_apspo_cd, k);
            }
            // Loggable Statement 사용에 의해 추가
            if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
                log.info("\n SQL :" + ((LoggableStatement)approvalInsertPs).getQueryString());
            } else {
                log.info("\n SQL :" + approvalInsertPs.toString() );
            }
    		
            approvalInsertPs.executeBatch();
            
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new DAOException(e.getMessage());
        } finally {
//            closeStatement(approvalUpdatePs);
            closeStatement(approvalDeletePs);
            closeStatement(approvalInsertPs);
            closeConnection(con);
        }
	}

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param user_id
	 * @param approvalInsertPs
	 * @param i
	 * @param apro_rqst_no
	 * @param arr_apro_seq
	 * @param arr_usr_id
	 * @param arr_usr_nm
	 * @param arr_ofc_cd
	 * @param arr_title
	 * @param arr_apspo_cd
	 * @param k
	 * @return
	 * @throws SQLException
	 */
	private int setApprovalPs(String user_id,
			PreparedStatement approvalInsertPs, int i, String apro_rqst_no,
			String[] arr_apro_seq, String[] arr_usr_id, String[] arr_usr_nm,
			String[] arr_ofc_cd, String[] arr_title, String[] arr_apspo_cd,
			int k) throws SQLException {
		// insert area 
		approvalInsertPs.setString(i++, apro_rqst_no ); 
		approvalInsertPs.setString(i++, arr_apro_seq[k] );         
		approvalInsertPs.setString(i++, arr_usr_id[k]);                
		approvalInsertPs.setString(i++, arr_usr_nm[k]); 		
		approvalInsertPs.setString(i++, arr_ofc_cd[k]);    		
		approvalInsertPs.setString(i++, arr_title[k]);
		approvalInsertPs.setString(i++, user_id);
		approvalInsertPs.setString(i++, user_id);
		String spspo_cd = "Approved".equals(arr_apspo_cd[k]) ? "C" : null;
		approvalInsertPs.setString(i++, spspo_cd);
		              
		i = 1;      	
		approvalInsertPs.addBatch();
		return i;
	}

	private String getApro_rqst_no(String csrNo) throws DAOException {
		String sRtn = "";
		
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
		
        StringBuffer queryStr = new StringBuffer();
        queryStr.append(" SELECT CSR.APRO_RQST_NO \n");
        queryStr.append(" FROM COM_APRO_CSR_DTL CSR \n");
        queryStr.append(" ,COM_APRO_RQST_HDR HDR \n");
        queryStr.append(" ,COM_APRO_RQST_ROUT ROUT \n");
        queryStr.append(" WHERE HDR.APRO_RQST_NO = CSR.APRO_RQST_NO \n");
        queryStr.append(" AND HDR.APRO_RQST_NO = ROUT.APRO_RQST_NO \n");
        queryStr.append(" AND CSR.CSR_NO = ? \n");
        queryStr.append(" AND (ROUT.APSTS_CD <> 'D' OR ROUT.APSTS_CD IS NULL) \n");
		
		try {
			con = getConnection();	
			
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}  		  			
  			
  			int i = 1;
  			ps.setString(i++, csrNo);
  			
  			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
      	  	}else{
      	  		log.info("\n SQL :" + queryStr.toString() );
      	  	}	
						
			rs = ps.executeQuery();

			if (rs.next()) {
				sRtn = rs.getString("APRO_RQST_NO");
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
}
