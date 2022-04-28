/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizComDAO.java
*@FileTitle : 공통
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.clt.bizcommon.util.code.BizCodeInfo;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * 업무공통에서 사용하는 공통 코드 등을 구현<br>
 * @author Hyung Choon_Roh
 * @see 
 * @since J2EE 1.4
 */
public class BizComDAO extends DBDAOSupport {
 
    /**
     * 1. 기능 :CODE Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getCurrencyList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
                
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	CURR_CD as code, CURR_CD as name ");
		queryStr.append(" FROM MDM_CURRENCY ");
		queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
		if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
		
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();
        	
        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
  			
  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }
            
            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 :CODE Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getSubSysList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
                
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	PGM_SUB_SYS_CD as code, PGM_SUB_SYS_CD as name ");
		queryStr.append(" FROM COM_PGM_SUB_SYS ");
		queryStr.append(" WHERE PGM_APPL_CD = 'OPUS' ");
        
		if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
		
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();
        	
        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
  			
  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }
            
            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 :CODE Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getCntrTpList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	CNTR_TP_CD as code, CNTR_TP_DESC as name ");
		queryStr.append(" FROM MDM_CNTR_TP ");
		queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
		if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
		
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
        	
  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 :CODE Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getCntrSzList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	CNTR_SZ_CD as code, CNTR_SZ_DESC as name ");
		queryStr.append(" FROM MDM_CNTR_SZ ");
		queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
		if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
		
        if (sortKey > 0) {
        	queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

        	rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 :CODE Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getCntrTpSzList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	CNTR_TPSZ_CD as code, CNTR_TPSZ_DESC as name ");
		queryStr.append(" FROM MDM_CNTR_TP_SZ ");
		queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
		if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
		
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : Chassis Type Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getChassisList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	EQ_TPSZ_CD as code, DIFF_DESC as name ");
        queryStr.append(" FROM CGM_EQ_TP_SZ ");
        queryStr.append(" WHERE EQ_KND_CD = 'Z' ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : Genset Type Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getGensetList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	EQ_TPSZ_CD as code, DIFF_DESC as name ");
        queryStr.append(" FROM CGM_EQ_TP_SZ ");
        queryStr.append(" WHERE EQ_KND_CD = 'G' ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : Continent Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getContiList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	CONTI_CD as code, CONTI_NM as name ");
        queryStr.append(" FROM MDM_CONTINENT ");
        queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        queryStr.append(" 	AND CONTI_CD NOT IN ('X', 'Y') ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : Service Scope Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getSvcScopeList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	T1.SVC_SCP_CD as code, T1.SVC_SCP_CD as name ");
        queryStr.append(" FROM MDM_SVC_SCP_LMT T1, MDM_SVC_SCP_LMT T2  ");
        queryStr.append(" WHERE T1.ORG_DEST_CD = 'O' ");        
        queryStr.append(" AND   T2.ORG_DEST_CD = 'D' ");
        queryStr.append(" AND   T1.SVC_SCP_CD = T2.SVC_SCP_CD ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : Continent Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getSContiList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	SCONTI_CD as code, SCONTI_NM as name ");
        queryStr.append(" FROM MDM_SUBCONTINENT ");
        queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : State Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public Collection getSteList(String where, int sortKey) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	STE_CD as code, STE_NM as name ");
		queryStr.append(" FROM MDM_STATE ");
		queryStr.append(" WHERE NVL(DELT_FLG, 'N') <> 'Y' ");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
        	
  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }
    
    /**
     * 1. 기능 : State Table 의 정보를 가져온다.  <p>
     * @param String where
     * @param int sortKey
     * @return Collection
     * @throws DAOException
     */
    public String getCodeVal(String jobCode, String code) throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String codeVal = "";
        
        StringBuffer queryStr = new StringBuffer();
        
        if("CNT".equals(jobCode)) {
        	queryStr.append(" SELECT CNT_NM CODEVAL \n");
    		queryStr.append(" FROM MDM_COUNTRY \n");
    		queryStr.append(" WHERE CNT_CD = ? ");
        } else if("STE".equals(jobCode)) {
        	queryStr.append(" SELECT STE_NM CODEVAL \n");
    		queryStr.append(" FROM MDM_STATE \n");
    		queryStr.append(" WHERE STE_CD = ? ");
        } else if("LOC".equals(jobCode)) {
        	queryStr.append(" SELECT LOC_NM CODEVAL \n");
    		queryStr.append(" FROM MDM_LOCATION \n");
    		queryStr.append(" WHERE LOC_CD = ? ");
        } else if("STE_EXIST".equals(jobCode)) {
        	queryStr.append(" SELECT DECODE(NVL(COUNT(STE_CD), 0), 0, 'N', 'Y') CODEVAL \n");
    		queryStr.append(" FROM MDM_STATE \n");
    		queryStr.append(" WHERE CNT_CD = ? ");
        } else if("LOC_EXIST".equals(jobCode)) {
        	queryStr.append(" SELECT DECODE(NVL(COUNT(LOC_CD), 0), 0, 'N', 'Y') CODEVAL \n");
    		queryStr.append(" FROM MDM_LOCATION \n");
    		queryStr.append(" WHERE CNT_CD = ? ");
        } else if("STE_LOC".equals(jobCode)) {
        	queryStr.append(" SELECT STE_CD CODEVAL \n");
    		queryStr.append(" FROM MDM_LOCATION \n");
    		queryStr.append(" WHERE LOC_CD = ? ");
        } else if("CONTI_CNT".equals(jobCode)) {
        	queryStr.append(" SELECT C.CONTI_CD CODEVAL \n");
    		queryStr.append(" FROM MDM_COUNTRY A, MDM_SUBCONTINENT B, MDM_CONTINENT C \n");
    		queryStr.append(" WHERE A.CNT_CD = ? AND A.SCONTI_CD=B.SCONTI_CD AND B.CONTI_CD=C.CONTI_CD ");
        }
        
        try {
        	con = getConnection();

        	// Loggable Statement 사용에 의해 추가 
			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}
			
			ps.setString(1, code);
        	
			rs = ps.executeQuery();
			
            if (rs.next()) {
            	codeVal = rs.getString("CODEVAL");
            }

            return codeVal;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
    }

    
    
	/**
	 * @Method Name  : getComIntgCodeList
	 * @작성일   : 2012. 3. 23. 
	 * @작성자   : JUN SUNG, KIM ( 9011644 )
	 * @변경이력  :
	 * @Method 설명 : vessel pop up 페이지에 selectbox 추가 관련 해당 select box 추가.
	 * @param where
	 * @param sortKey
	 * @return
	 */
	public Collection getComIntgCodeList(String where, int sortKey) throws DAOException{
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        StringBuffer queryStr = new StringBuffer();
        
        queryStr.append(" SELECT (100000 + (rownum * 10) ) as sortKey , ");
        queryStr.append(" 	INTG_CD_VAL_CTNT as code, INTG_CD_VAL_DP_DESC as name ");
        queryStr.append(" FROM com_intg_cd_dtl ");
        queryStr.append(" WHERE INTG_CD_ID = 'CD00653'");
        
        if(!"".equals(where)) {
        	queryStr.append(" AND " + where);
        }
        
        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }
        
        try {
        	con = getConnection();

        	/** Loggable Statement 사용에 의해 추가 */ 
  			if(LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true") ){
  				ps = new LoggableStatement(con, queryStr.toString());
  			}else{
  				ps = con.prepareStatement(queryStr.toString());			
  			}

  			rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new BizCodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

            return codeList;

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		} finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
	}
}
