/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SurchargeDBDAO.java
*@FileTitle : Surcharge
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.surcharge.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.country.basic.CountryBCImpl;
import com.clt.bizcommon.country.event.ComEns0M1Event;
import com.clt.bizcommon.country.vo.CountryListVO;
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
 * @see CountryBCImpl 참조
 * @since J2EE 1.4
 */
public class SurchargeDBDAO extends DBDAOSupport {
	
	/**
     * 1. 기능 : Surcharge count<p>
     * 2. 처리개요 : Surcharge의 총 카운트를 조회한다.<p> 
     * - totalSurcharge<p>
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
	 * @param et COM_ENS_0D1Event
     * @return int
     * @throws DAOException
     */
	public int totalSurcharge(Event et) throws DAOException {
		
    	// PDTO(Data Transfer Object including Parameters)
		ComEns0M1Event event=(ComEns0M1Event)et;
		CountryListVO	countryListVO = event.getCountryListVO();
        // Connection Interface
        Connection con = null;
        // 정적파싱을 지원하는 SQL Statement
        PreparedStatement ps = null;
        // DB ResultSet
        ResultSet rs = null;
        // PreparedStatement에 bind 변수를 넣을시 증가되는 변수
        int i = 1;		
		
        StringBuffer queryStr = new StringBuffer();
        StringBuffer whereStr = new StringBuffer();
        
        String conti_cd     = countryListVO.getContiCd(); //event.getConti_cd();
        String sconti_cd     = countryListVO.getScontiCd(); //event.getSconti_cd();
        String cnt_cd     = countryListVO.getCntCd(); // event.getCnt_cd();
        String cnt_nm     = countryListVO.getCntNm();  //event.getCnt_nm();
        
        if(!conti_cd.equals("")) {
			whereStr.append(" AND B.conti_cd like ? \n");
		}
        
        if(!sconti_cd.equals("")) {
			whereStr.append(" AND A.sconti_cd like ? \n");
		}
        
        if(!cnt_cd.equals("")) {
			whereStr.append(" AND A.cnt_cd like ? \n");
		}
        
        if(!cnt_nm.equals("")) {
			whereStr.append(" AND A.cnt_nm like ? \n");
		}
        
		queryStr.append(" SELECT COUNT(*)             				\n");
		queryStr.append(" FROM mdm_country A, mdm_subcontinent B, mdm_continent C  			\n");                   
		queryStr.append(" WHERE 1 = 1 AND A.sconti_cd = B.sconti_cd AND B.conti_cd=C.conti_cd \n");
		queryStr.append("   AND nvl(A.delt_flg,'N') <> 'Y' \n");
		queryStr.append("   AND nvl(B.delt_flg,'N') <> 'Y' \n");
		queryStr.append("   AND nvl(C.delt_flg,'N') <> 'Y' \n" + whereStr); 

		try {
			con = getConnection();	
			
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}			
  			
  			if(!conti_cd.equals("")) {
  				ps.setString(i++, "%" + conti_cd + "%");
  			}
  			
  			if(!sconti_cd.equals("")) {
  				ps.setString(i++, "%" + sconti_cd + "%");
  			}
  			
  			if(!cnt_cd.equals("")) {
  				ps.setString(i++, "%" + cnt_cd + "%");
  			}
  			
  			if(!cnt_nm.equals("")) {
  				ps.setString(i++, "%" + cnt_nm + "%");
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
		} /*catch (DAOException de) {
			log.error(de.getMessage(), de);
			throw de;
		}*/ catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		} finally {
			closeResultSet(rs);
			closeStatement(ps);
			closeConnection(con);
		}
	}
	
	
	/**
	 * Surcharge의 모든 목록을 가져온다.<br>
	 * @param et COM_ENS_0D1Event
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchSurchargeList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
		ComEns0M1Event event=(ComEns0M1Event)et;
		CountryListVO	countryListVO = event.getCountryListVO();
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
        
        String conti_cd     = countryListVO.getContiCd(); //event.getConti_cd();
        String sconti_cd     = countryListVO.getScontiCd(); //event.getSconti_cd();
        String cnt_cd     = countryListVO.getCntCd(); // event.getCnt_cd();
        String cnt_nm     = countryListVO.getCntNm();  //event.getCnt_nm();
        
        // 페이징 처리
		int currentPage = event.getIPage();
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		
        if(!conti_cd.equals("")) {
			whereStr.append(" AND B.conti_cd like ? \n");
		}
        
        if(!sconti_cd.equals("")) {
			whereStr.append(" AND A.sconti_cd like ? \n");
		}
        
        if(!cnt_cd.equals("")) {
			whereStr.append(" AND A.cnt_cd like ? \n");
		}
        
        if(!cnt_nm.equals("")) {
			whereStr.append(" AND A.cnt_nm like ? \n");
		}
		
		queryStr.append(" SELECT cnt_cd,      	\n");
		queryStr.append("        cnt_nm,  		\n");
		queryStr.append("        conti_cd,  		\n");
		queryStr.append("        conti_nm,  		\n");
		queryStr.append("        sconti_cd,  		\n");
		queryStr.append("        sconti_nm  		\n");
		queryStr.append("   FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.cnt_cd ASC) no,  \n");
		queryStr.append("                A.cnt_cd,              \n");
		queryStr.append("                A.cnt_nm,          	 \n");
		queryStr.append("                C.conti_cd,          	 \n");
		queryStr.append("                C.conti_nm,          	 \n");
		queryStr.append("                B.sconti_cd,          	 \n");
		queryStr.append("                B.sconti_nm          	 \n");
		queryStr.append("			FROM mdm_country A, mdm_subcontinent B, mdm_continent C    \n");
		queryStr.append(" 		  WHERE 1 = 1 AND A.sconti_cd=B.sconti_cd AND B.conti_cd=C.conti_cd \n");
		queryStr.append("   			AND nvl(A.delt_flg,'N') <> 'Y' \n");
		queryStr.append("   			AND nvl(B.delt_flg,'N') <> 'Y' \n");
		queryStr.append("   			AND nvl(C.delt_flg,'N') <> 'Y' \n" + whereStr + "\n"); 		           
		queryStr.append("         ) a	                     \n");
		queryStr.append(" WHERE no BETWEEN ? AND ? ");

        try {                                                                    
            con = getConnection();
            
            // Loggable Statement 사용에 의해 추가 
			/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
            
  			if(!conti_cd.equals("")) {
  				ps.setString(i++, "%" + conti_cd + "%");
  			}
  			
  			if(!sconti_cd.equals("")) {
  				ps.setString(i++, "%" + sconti_cd + "%");
  			}
  			
  			if(!cnt_cd.equals("")) {
  				ps.setString(i++, "%" + cnt_cd + "%");
  			}
  			
  			if(!cnt_nm.equals("")) {
  				ps.setString(i++, "%" + cnt_nm + "%");
  			}
            
			ps.setInt(i++, startPart);
			ps.setInt(i++, endPart);
			
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
}