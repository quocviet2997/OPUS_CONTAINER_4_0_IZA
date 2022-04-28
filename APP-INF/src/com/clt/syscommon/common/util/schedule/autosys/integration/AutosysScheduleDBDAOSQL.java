/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : TIS
*@FileName       : ThemeHTMLAction.java
*@FileTitle      	 : 
*@Author           : Kyung-bum, Kim
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 1. 7.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.util.schedule.autosys.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
/**
 * 
 * AutosysScheduleDBDAO.java
 * @author Kyung-bum, Kim
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public class AutosysScheduleDBDAOSQL extends DBDAOSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7057490234075247629L;

	/**
	 * 
	 * getJobStatus
	 * @author Kyung-bum, Kim
	 * @param jobName
	 * @return
	 * @throws DAOException int
	 */
	public int getJobStatus(String jobName) throws DAOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		StringBuilder query = new StringBuilder();
		query.append("SELECT status").append("\n");
		query.append("FROM ujo_job_status ").append("\n");
		query.append("WHERE joid = ").append("\n");
		query.append("  (SELECT joid FROM ujo_job WHERE job_name = ? and is_active = '1')").append("\n");
		
		
		int status = 0;
		
		try {
			DataSource ds = getAutosysDataSource();
			con = ds.getConnection();
			ps = con.prepareStatement(query.toString());
			ps.setString(1, jobName);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				status = rs.getInt("STATUS");
			}
			
		} catch (SQLException e) {
			log.error(e.getMessage(), e);
			throw new DAOException(new ErrorHandler(e).getMessage());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(new ErrorHandler(e).getMessage());
		} finally {
			close(rs);
			close(ps);
			close(con);
		}
		
		return status;
	}

	/**
	 * 
	 * close
	 * @author Jeong-Hoon, KIM
	 * @param con void
	 */
	private void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				log.error(e.getMessage());
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}

	/**
	 * 
	 * close
	 * @author Jeong-Hoon, KIM
	 * @param ps void
	 */
	private void close(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				log.error(e.getMessage());
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}

	/**
	 * 
	 * close
	 * @author Jeong-Hoon, KIM
	 * @param rs void
	 */
	private void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				log.error(e.getMessage());
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}
	
	/**
	 * 
	 * getAutosysDataSource
	 * @author Kyung-bum, Kim
	 * @return
	 * @throws Exception DataSource
	 */
	private DataSource getAutosysDataSource() throws Exception {
		DataSource ds = null;
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("jdbc/AUTOSYS");
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
		return ds;
	}

}
