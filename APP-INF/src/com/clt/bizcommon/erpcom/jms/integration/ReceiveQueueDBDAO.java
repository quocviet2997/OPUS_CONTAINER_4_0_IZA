/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueDBDAO.java
 *@FileTitle : ENIS Interface 연동결과 DB Access 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2007-03-05
 *@LastModifier : Jung-Hyung,Kim
 *@LastVersion : 1.0
 * 2007-03-05 Jung-Hyung,Kim
 * 1.0 최초 생성
 =========================================================*/
package com.clt.bizcommon.erpcom.jms.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.AP_INV_IF;

/**
 * JMS에서 받은 데이터 DB Logic 처리를 담당한다.<br>
 * 
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueBCImpl 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueDBDAO extends DBDAOSupport{

	/**
	 * AP Interface 결과를 AP_TEMP 테이블에 반영한다. 
	 * @param String div
	 * @param Object obj
	 * @return String
	 */
	public String modifyFNS008R003(String div, Object obj) throws DAOException {
		Connection con = null;					// Connection Interface   
		PreparedStatement selectPs1 = null;		// SELECT를 수행하기 위한 SQL Statement
		//PreparedStatement updatePs1 = null;		// UPDATE를 수행하기 위한 SQL Statement
		PreparedStatement updatePs2 = null;		// UPDATE를 수행하기 위한 SQL Statement
		//PreparedStatement updatePs3 = null;		// UPDATE를 수행하기 위한 SQL Statement
		PreparedStatement updatePs4 = null;		// UPDATE를 수행하기 위한 SQL Statement
		PreparedStatement updatePs5 = null;
		ResultSet rs = null;
		int i = 1;								// PreparedStatement에 bind 변수를 넣을시 증가되는 변수

		StringBuffer selectQuery1 = new StringBuffer() ;
		//StringBuffer updateQuery1 = new StringBuffer() ;
		StringBuffer updateQuery2 = new StringBuffer() ;
		//StringBuffer updateQuery3 = new StringBuffer() ;
		StringBuffer updateQuery4 = new StringBuffer() ;
		StringBuffer updateQuery5 = new StringBuffer() ;
        
		////GET AP_PGM_NO
		selectQuery1.append("\nSELECT DISTINCT ap_pgm_no ");
		selectQuery1.append("\n  FROM ap_inv_if ");
		selectQuery1.append("\n WHERE csr_no = ? "); //:csrNo
		selectQuery1.append("\n   AND ROWNUM = 1 ");
		/*
		////AP_INV_IF UPDATE(1)
		updateQuery1.append("\nUPDATE ap_inv_if ");
		updateQuery1.append("\n   SET hdr_if_flg = SUBSTR(?,0,1), "); //:ifFlag
		updateQuery1.append("\n       hdr_if_dt = TO_DATE(?,'YYYYMMDD HH24:MI:SS'), "); //:ifDate
		updateQuery1.append("\n       hdr_if_err_rsn = HJSEAI_PKG.h_decode(?,'ERP','BMS') "); //:ifErrRsn
		updateQuery1.append("\n WHERE csr_no = ? "); //:csrNo
		*/
		////AP_INV_HDR UPDATE(1)
		updateQuery2.append("\nUPDATE ap_inv_hdr ");
		updateQuery2.append("\n   SET if_flg = SUBSTR(?,0,1), "); //:ifFlag
		updateQuery2.append("\n       if_dt = TO_DATE(?,'YYYYMMDD HH24:MI:SS'), "); //:ifDate
		updateQuery2.append("\n       if_err_rsn = HJSEAI_PKG.h_decode(?,'ERP','BMS') "); //:ifErrRsn
		updateQuery2.append("\n WHERE csr_no = ? "); //:csrNo //AND NVL(IF_FLG,'N')<>'Y' "); //:csrNo
		/*
		////AP_INV_IF UPDATE(2)
		updateQuery3.append("\nUPDATE ap_inv_if ");
		updateQuery3.append("\n   SET hdr_rcv_err_flg = SUBSTR(?,0,1), "); //:ifFlag
		updateQuery3.append("\n       hdr_rcv_err_rsn = HJSEAI_PKG.h_decode(?,'ERP','BMS') "); //:ifErrRsn
		updateQuery3.append("\n WHERE csr_no = ? "); //:csrNo
		*/
		////AP_INV_HDR UPDATE(2)
		updateQuery4.append("\nUPDATE ap_inv_hdr ");
		updateQuery4.append("\n   SET rcv_err_flg = SUBSTR(?,0,1), "); //:ifFlag
		updateQuery4.append("\n       rcv_err_rsn = HJSEAI_PKG.h_decode(?,'ERP','BMS') "); //:ifErrRsn
		updateQuery4.append("\n WHERE csr_no = ? "); //:csrNo
		
		//AP_PAY_INV IF UPDATE
		updateQuery5.append(" UPDATE AP_PAY_INV    \n");
		updateQuery5.append("    SET AP_IF_DT  = TO_DATE(?,'YYYYMMDD HH24:MI:SS')  \n");
		updateQuery5.append("    	,INV_STS_CD = DECODE( SUBSTR(?,0,1), 'Y', 'P', 'E' )  \n");
		updateQuery5.append("  WHERE CSR_NO = ?    \n"); 
		
		try {
			con = getConnection();
			// Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				selectPs1 = new LoggableStatement(con, selectQuery1.toString());
				//updatePs1 = new LoggableStatement(con, updateQuery1.toString());
				updatePs2 = new LoggableStatement(con, updateQuery2.toString());
				//updatePs3 = new LoggableStatement(con, updateQuery3.toString());
				updatePs4 = new LoggableStatement(con, updateQuery4.toString());
				updatePs5 = new LoggableStatement(con, updateQuery5.toString());
			} else {
				selectPs1 = con.prepareStatement(selectQuery1.toString());
				//updatePs1 = con.prepareStatement(updateQuery1.toString());
				updatePs2 = con.prepareStatement(updateQuery2.toString());
				//updatePs3 = con.prepareStatement(updateQuery3.toString());
				updatePs4 = con.prepareStatement(updateQuery4.toString());
				updatePs5 = con.prepareStatement(updateQuery5.toString());
			}
			
			////변수값 구하기
			AP_INV_IF model = (AP_INV_IF)obj; 
			String csrNo = model.getHdr_csr_no();
			String ifDate = model.getHdr_if_dt();
			String ifFlag = model.getHdr_if_flg();
			String ifErrRsn = model.getHdr_if_err_rsn();
			String pgmId = "";
			
			////GET AP_PGM_NO
			i = 1;
			selectPs1.setString(i++, csrNo);
			
			//Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modifyAP_INV_IF]SQL1 :" + ((LoggableStatement)selectPs1).getQueryString());
			} else {
				log.info("\n [modifyAP_INV_IF]SQL1 :" + selectQuery1.toString());
			}
			rs = selectPs1.executeQuery();
			
			while(rs.next()){
				pgmId = rs.getString(1);
			}
			
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>> pgmId    : " + pgmId);
			log.debug(">>>>> csrNo    : " + csrNo);
			log.debug(">>>>> ifDate   : " + ifDate);
			log.debug(">>>>> ifFlag   : " + ifFlag);
			log.debug(">>>>> ifErrRsn : " + ifErrRsn);
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			if(div.equals("I")){	//EAI Interface Result
				/*
				////AP_INV_IF UPDATE(1)
				i = 1;
				updatePs1.setString(i++, ifFlag);
				updatePs1.setString(i++, ifDate);
				updatePs1.setString(i++, ifErrRsn);
				updatePs1.setString(i++, csrNo);
				
				//Loggable Statement 사용에 의해 추가
				if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
					log.info("\n [modifyAP_INV_IF]SQL1 :\n" + ((LoggableStatement)updatePs1).getQueryString());
				} else {
					log.info("\n [modifyAP_INV_IF]SQL1 :\n" + updateQuery1.toString());
				}
				updatePs1.addBatch();
				*/
				
				////AP_INV_HDR UPDATE(1)
				i = 1;
				updatePs2.setString(i++, ifFlag);
				updatePs2.setString(i++, ifDate);
				updatePs2.setString(i++, ifErrRsn);
				updatePs2.setString(i++, csrNo);
				
				//Loggable Statement 사용에 의해 추가
				if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
					log.info("\n [modifyAP_INV_IF]SQL2 :\n" + ((LoggableStatement)updatePs2).getQueryString());
				} else {
					log.info("\n [modifyAP_INV_IF]SQL2 :\n" + updateQuery2.toString());
				}
				updatePs2.addBatch();
				
				//AP_PAY_INV IF UPDATE
				i = 1;
				updatePs5.setString(i++, ifDate);
				updatePs5.setString(i++, ifFlag);
				updatePs5.setString(i++, csrNo);
				//Loggable Statement 사용에 의해 추가
				if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
					log.info("\n [modifyAP_INV_IF]SQL2 :\n" + ((LoggableStatement)updatePs5).getQueryString());
				} else {
					log.info("\n [modifyAP_INV_IF]SQL2 :\n" + updateQuery5.toString());
				}
				updatePs5.addBatch();

			}else{	//ERP Recept Result	
				/*
				////AP_INV_IF UPDATE(2)
				i = 1;
				updatePs3.setString(i++, ifFlag);
				updatePs3.setString(i++, ifErrRsn);
				updatePs3.setString(i++, csrNo);
				
				//Loggable Statement 사용에 의해 추가
				if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
					log.info("\n [modifyAP_INV_IF]SQL3 :\n" + ((LoggableStatement)updatePs3).getQueryString());
				} else {
					log.info("\n [modifyAP_INV_IF]SQL3 :\n" + updateQuery3.toString());
				}
				updatePs3.addBatch();
				*/
				
				////AP_INV_HDR UPDATE(2)
				i = 1;
				updatePs4.setString(i++, ifFlag);
				updatePs4.setString(i++, ifErrRsn);
				updatePs4.setString(i++, csrNo);
				
				//Loggable Statement 사용에 의해 추가
				if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
					log.info("\n [modifyAP_INV_IF]SQL4 :\n" + ((LoggableStatement)updatePs4).getQueryString());
				} else {
					log.info("\n [modifyAP_INV_IF]SQL4 :\n" + updateQuery4.toString());
				}
				updatePs4.addBatch(); 
			}//if(sts.equals("I")){
			
			if(div.equals("I")){
				//updatePs1.executeBatch();
				updatePs2.executeBatch();
				updatePs5.executeBatch();
			}else{
				//updatePs3.executeBatch();
				updatePs4.executeBatch();
			}//if(sts.equals("I")){
			
			////모듈분기를 위한 리턴값 세팅
			return pgmId;
			
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(),de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			closeResultSet(rs);
            closeStatement(selectPs1);
//			closeStatement(updatePs1);
			closeStatement(updatePs2);
//			closeStatement(updatePs3);
			closeStatement(updatePs4);
			closeStatement(updatePs5);
			closeConnection(con);
		}
	}
	
	/**
	 * PgmId 를 조회 리턴한다. 
	 * @param String div
	 * @param Object obj
	 * @return String
	 */
	public String getPgmId(String div, Object obj) throws DAOException {
		Connection con = null;					// Connection Interface   
		PreparedStatement selectPs1 = null;		// SELECT를 수행하기 위한 SQL Statement
		ResultSet rs = null;
		int i = 1;								// PreparedStatement에 bind 변수를 넣을시 증가되는 변수

		log.debug("div=" + div);
		StringBuffer selectQuery1 = new StringBuffer() ;
        
		////GET AP_PGM_NO
		selectQuery1.append("\nSELECT SRC_CTNT ");
		selectQuery1.append("\n  FROM AP_INV_HDR ");
		selectQuery1.append("\n WHERE CSR_NO = ? ");
		selectQuery1.append("\n   AND ROWNUM = 1 ");
		
		try {
			con = getConnection();
			
			// Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				selectPs1 = new LoggableStatement(con, selectQuery1.toString());
			} else {
				selectPs1 = con.prepareStatement(selectQuery1.toString());
			}
			
			
			////변수값 구하기
			AP_INV_IF model = (AP_INV_IF)obj; 
			String csrNo = model.getHdr_csr_no();
			String pgmId = "";
			
			////GET AP_PGM_NO
			i = 1;
			selectPs1.setString(i++, csrNo);
			
			//Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modifyAP_INV_IF]SQL1 :" + ((LoggableStatement)selectPs1).getQueryString());
			} else {
				log.info("\n [modifyAP_INV_IF]SQL1 :" + selectQuery1.toString());
			}
			rs = selectPs1.executeQuery();
			
			while(rs.next()){
				pgmId = rs.getString(1);
			}
			
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>> pgmId    : " + pgmId);
			log.debug(">>>>> csrNo    : " + csrNo);
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");			
			
			////모듈분기를 위한 리턴값 세팅
			return pgmId;
			
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(),de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			closeResultSet(rs);
            closeStatement(selectPs1);
			closeConnection(con);
		}
	}
	
	/**
	 * AP Interface 결과를 AP_TEMP 테이블에 반영한다. 
	 * @param Object o
	 * @return String
	 */
	public String modifyFNS0100002(Object o) throws DAOException {
		log.debug("\n\nDAO.modifyFNS0100002 *************************************1818181\n");
		Connection con = null;					// Connection Interface   
		PreparedStatement selectPs1 = null;		// SELECT를 수행하기 위한 SQL Statement
		PreparedStatement updatePs6 = null;		// UPDATE를 수행하기 위한 SQL Statement
		ResultSet rs = null;
		int i = 1;								// PreparedStatement에 bind 변수를 넣을시 증가되는 변수

		StringBuffer selectQuery1 = new StringBuffer() ;
		StringBuffer updateQuery6 = new StringBuffer() ;
        
		////GET AP_PGM_NO
		selectQuery1.append("\nSELECT SRC_CTNT ");
		selectQuery1.append("\n  FROM AP_INV_HDR ");
		selectQuery1.append("\n WHERE CSR_NO = ? ");
		selectQuery1.append("\n   AND ROWNUM = 1 ");

		////AP_INV_HDR UPDATE(3)
		updateQuery6.append(" UPDATE AP_INV_HDR                  				\n");
		updateQuery6.append(" SET PAY_AMT = ?, PAY_DT = SUBSTR(?,1,8), FTU_USE_CTNT1 = ?, PAY_MZD_LU_CD = ?     \n");
		updateQuery6.append(" WHERE CSR_NO = ?                   				\n"); 
		
		try {
			con = getConnection();
			// Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				selectPs1 = new LoggableStatement(con, selectQuery1.toString());
				//updatePs5 = new LoggableStatement(con, updateQuery5.toString());
				updatePs6 = new LoggableStatement(con, updateQuery6.toString()); 
			} else {
				selectPs1 = con.prepareStatement(selectQuery1.toString());
				//updatePs5 = con.prepareStatement(updateQuery5.toString());
				updatePs6 = con.prepareStatement(updateQuery6.toString()); 
			}
			////변수값 구하기
			AP_INV_IF model = (AP_INV_IF)o;  
			String csrNo = model.getHdr_csr_no();
			String pgmId = "";
			
			////GET AP_PGM_NO
			i = 1;
			selectPs1.setString(i++, csrNo);
			
			//Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modifyAP_INV_IF]SQL1 :" + ((LoggableStatement)selectPs1).getQueryString());
			} else {
				log.info("\n [modifyAP_INV_IF]SQL1 :" + selectQuery1.toString());
			}
			rs = selectPs1.executeQuery();
			
			while(rs.next()){
				pgmId = rs.getString(1);
			}
			
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>> pgmId    : " + pgmId);
			log.debug(">>>>> csrNo    : " + csrNo);
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
 
			////AP_INV_HDR UPDATE(3)
			i = 1;
			updatePs6.setString(i++, model.getHdr_pay_amt());			
			updatePs6.setString(i++, model.getHdr_pay_dt());
			updatePs6.setString(i++, model.getHdr_ftu_use_ctnt1());
			updatePs6.setString(i++, model.getHdr_pay_mzd_lu_cd());
			updatePs6.setString(i++, model.getHdr_csr_no());				
			
			//Loggable Statement 사용에 의해 추가
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modifyAP_INV_HDR]SQL3 :" + ((LoggableStatement)updatePs6).getQueryString());
			} else {
				log.info("\n [modifyAP_INV_HDR]SQL3 :" + updateQuery6.toString());
			}
			updatePs6.addBatch();
			updatePs6.executeBatch(); 
			////모듈분기를 위한 리턴값 세팅
			return pgmId!=null&&!pgmId.equals("")?pgmId:"";
			
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(),de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			closeResultSet(rs);
			closeStatement(selectPs1);
			closeStatement(updatePs6);
			closeConnection(con);
		}
	}
	
	/**
	 * AP Interface 결과를 TES SO HDR 테이블에 반영한다. 
	 * @param Object o
	 */
	public void modifyTESInvHdr(Object o) throws DAOException {
		Connection con = null;					   
		PreparedStatement updatePs = null;
		int i = 1;								

		StringBuffer updateQuery = new StringBuffer();
		updateQuery.append(" UPDATE TES_TML_SO_HDR              \n");
		updateQuery.append(" SET PAY_FLG = 'Y', PAY_DT = TO_DATE(SUBSTR(?,1,8),'YYYY-MM-DD'), TML_INV_STS_CD = 'D'      \n");
		updateQuery.append(" WHERE CSR_NO = ?                   \n");
		
		try {
			con = getConnection();
			
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				updatePs = new LoggableStatement(con, updateQuery.toString());
			} else {
				updatePs = con.prepareStatement(updateQuery.toString());				
			}
			
			AP_INV_IF model = (AP_INV_IF)o; 
			
			i = 1;
			updatePs.setString(i++, model.getHdr_pay_dt());
			updatePs.setString(i++, model.getHdr_csr_no());
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modify TES SO HDR]SQL1 :" + ((LoggableStatement)updatePs).getQueryString());
			} else {
				log.info("\n [modify TES SO HDR]SQL1 :" + updateQuery.toString());
			}
			updatePs.executeUpdate();

		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(),de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			closeStatement(updatePs);
			closeConnection(con);
		}
	}
	
	/**
	 * AP Interface 결과를 AP_PAY_INV 테이블에 반영한다. 
	 * @param Object o
	 */
	public void modifyCSRPayInv(Object o) throws DAOException {
		Connection con = null;					   
		PreparedStatement updatePs = null;
		int i = 1;								

		StringBuffer updateQuery = new StringBuffer(); 
		updateQuery.append(" UPDATE AP_PAY_INV                    \n");
		updateQuery.append(" SET AP_PAY_DT = to_date(?, 'YYYY-MM-DD HH24:MI:SS'), AP_PAY_AMT = ?, AP_PAY_FLG = 'Y', INV_STS_CD = 'D'   \n");
		updateQuery.append(" WHERE CSR_NO = ?                     \n");
		
		try {
			con = getConnection();
			
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				updatePs = new LoggableStatement(con, updateQuery.toString());
			} else {
				updatePs = con.prepareStatement(updateQuery.toString());				
			}
			
			AP_INV_IF model = (AP_INV_IF)o; 
			
			i = 1; 
			
			updatePs.setString(i++, model.getHdr_pay_dt());
			updatePs.setString(i++, model.getHdr_pay_amt());
			updatePs.setString(i++, model.getHdr_csr_no());
			if (LoggableStateFactory.get(LoggableStateFactory.SQL_DEBUG).equalsIgnoreCase("true")){
				log.info("\n [modify AP_PAY_INV]SQL1 :" + ((LoggableStatement)updatePs).getQueryString());
			} else {
				log.info("\n [modify AP_PAY_INV]SQL1 :" + updateQuery.toString());
			}
			updatePs.executeUpdate();

		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(),de);
			throw de;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new DAOException(e.getMessage());
		} finally {
			closeStatement(updatePs);
			closeConnection(con);
		}
	}
	
}