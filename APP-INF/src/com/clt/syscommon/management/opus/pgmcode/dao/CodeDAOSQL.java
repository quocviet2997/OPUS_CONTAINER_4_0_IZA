/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeDAO.java
*@FileTitle : 시스템코드 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-12-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.pgmcode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.pgmcode.CodeInfo;

/**
 *  클래스 개요    : 시스템코드 조회 <p><p>
 *  <p>
 *  작성일 : 2006.12.27.<p>
 * @see CodeInfo,CodeUtil 참조
 * @since J2EE 1.4
 * @version 1.0
 * @author  김성욱
 */
public class CodeDAOSQL extends DBDAOSupport {
 
    /**
     * 기능 :CODE Table 의 정보를 가져온다.  <p>
     *@return
     *@throws DAOException
     */
    public Collection getCodeList() throws DAOException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        
        String queryStr = " SELECT (100000 +(rownum * 10) ) as sortKey , pgm_appl_cd as code, pgm_appl_nm as name FROM com_pgm_appl";

        
        try {
        	log.debug(queryStr);
            con = getConnection("SysComDB");
//            con = getJdbcConnection();
            ps = con.prepareStatement(queryStr);
            //ps.setString(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new CodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage());
            throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException e) {
			log.error(e.getMessage(), e);
            throw new DAOException(new ErrorHandler(e).getMessage());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
            throw new DAOException(new ErrorHandler(e).getMessage());
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
		return codeList;
    }

    /**
     * 기능 : 조건이 있을때 즉, 서브코드일때 !  <p>
     *@param code
     *@param sortKey
     *@return
     *@throws DAOException
     */
    public Collection getCodeListForsSubCode(String code,  int sortKey) throws DAOException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Collection codeList = new ArrayList();
        StringBuffer queryStr = new StringBuffer();
        queryStr.append(" SELECT (100000 +(rownum * 10) ) as sortKey, \n")
                .append("		 pgm_sub_sys_cd as code,              \n")
           		.append("        pgm_sub_sys_cd as name,              \n")
           		.append("        pgm_sub_sys_nm,                      \n")
           		.append("        pgm_appl_cd                          \n")
                .append("   FROM com_pgm_sub_sys	                  \n")
                .append("  WHERE pgm_appl_cd = ?                      \n");

        if (sortKey > 0) {
            queryStr.append(" ORDER BY " + sortKey);
        }

        try {

        	log.debug(queryStr);
        	
            con = getConnection("SysComDB");
            ps = con.prepareStatement(queryStr.toString());

            ps.setString(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {
                codeList.add(new CodeInfo(rs.getString("sortkey"),
                						  rs.getString("code"),
                                          rs.getString("name")));
            }

        } catch (SQLException se) {
            log.error(this.getClass().getName() + ":err=" + se.getMessage());
            throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException e) {
			log.error(e.getMessage(), e);
            throw new DAOException(new ErrorHandler(e).getMessage());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
            throw new DAOException(new ErrorHandler(e).getMessage());
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
            closeConnection(con);
        }
		return codeList;
    }


}
