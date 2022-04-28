/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePopDBDAO.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.code.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.code.basic.CommonCodePopBCImpl;
import com.clt.syscommon.common.table.COM_INTG_CD_DTL;

/**
 * NIS-System Common에 대한 DB 처리를 담당<br>
 * - NIS-System Common Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author HOESOO_JANG
 * @see CommonCodePopBCImpl 참조
 * @since J2EE 1.4
 */
public class CommonCodePopDBDAOSQL extends DBDAOSupport {


	/**
	 * CommonCodePop의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param model 데이타 모델
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet searchCommonCodePop(COM_INTG_CD_DTL model) throws DAOException {
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

		String queryStr =
			"select                                          \n" +
			"   intg_cd_id          ,                         \n" +
			"   intg_cd_val_ctnt    ,                         \n" +
			"   intg_cd_val_dp_desc ,                         \n" +
//			"   intg_cd_val_desc    ,                         \n" +
			"   intg_cd_val_desc                            \n" +
			" from com_intg_cd_dtl                            \n" +
			" where INTG_CD_ID =     ?                       \n" +
			" order by INTG_CD_VAL_DP_SEQ                     \n" ;


		try {
			con = getConnection("SysComDB");

			// Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
				ps = new LoggableStatement(con, queryStr);
			} else {
				ps = con.prepareStatement(queryStr);
			}

			// 쿼리에 변수 세팅.
			//ps.setString(i++, model.getIntg_cd_id());                 //intg_cd_id
			ps.setString(i++, model.getIntg_cd_id());

			// Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")) {
				log.info("\n SQL :" + ((LoggableStatement)ps).getQueryString());
			} else {
				log.info("\n SQL :" + queryStr );
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
