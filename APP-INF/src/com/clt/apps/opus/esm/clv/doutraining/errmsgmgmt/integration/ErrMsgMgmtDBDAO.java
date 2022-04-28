/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : ErrMsgMgmtDBDAO.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.basic.ErrMsgMgmtBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;


/**
 * ALPS ErrMsgMgmtDBDAO <br>
 * - ALPS-DouTraining system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Viet Tran
 * @see ErrMsgMgmtBCImpl 참조
 * @since J2EE 1.6
 */
public class ErrMsgMgmtDBDAO extends DBDAOSupport {

	/**
	 * [searchErrMsg] get a list of ErrMsgVO.<br>
	 * 
	 * @param ErrMsgVO errMsgVO
	 * @return List<ErrMsgVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<ErrMsgVO> searchErrMsg(ErrMsgVO errMsgVO) throws DAOException {
		// define a null DBRowSet to store query result.
		DBRowSet dbRowset = null;
		// define a list to store list ErrMsgVO.
		List<ErrMsgVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(errMsgVO != null){
				// get map of grid column savename, some orther param value from jsp and store their value.
				Map<String, String> mapVO = errMsgVO .getColumnValues();
				
				// put values in mapVO into param
				param.putAll(mapVO);
				// put values in mapVO into velParam
				velParam.putAll(mapVO);
			}
			// execute queries in ErrMsgMgmtDBDAOErrMsgVORSQL with param and velParam
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ErrMsgMgmtDBDAOErrMsgVORSQL(), param, velParam);
			// turn dbRowset into a list of ErrMsgVO
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ErrMsgVO .class);
		} catch(SQLException se) {
			// show an error log in console with error message
			log.error(se.getMessage(),se);
			// throw an EventException
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			// show an error log in console with error message
			log.error(ex.getMessage(),ex);
			// throw an EventException
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * [addErrMsgVOS] insert a list of ErrMsgVO into database.<br>
	 * 
	 * @param List<ErrMsgVO> errMsgVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addErrMsgVOS(List<ErrMsgVO> errMsgVO) throws DAOException,Exception {
		// define an array to store value of boolean whether the result of running queries for each item from errMsgVO is committed
		int insCnt[] = null;
		try {
			// define a SQLExecuter variable to execute query
			SQLExecuter sqlExe = new SQLExecuter("");
			// if list exist any item in it, it will run query to save insert changes in database
			if(errMsgVO .size() > 0){
				// insCnt store value of boolean whether the result of running queries for each item from errMsgVO is committed
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ErrMsgMgmtDBDAOErrMsgVOCSQL(), errMsgVO,null);
				// go through array insCnt to find whether a query of an ErrMsgVO item can't commit
					// if that one exists throw a DAOException
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			// show an error log in console with error message
			log.error(se.getMessage(),se);
			// throw an EventException
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			// show an error log in console with error message
			log.error(ex.getMessage(),ex);
			// throw an EventException
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return insCnt;
	}
	/**
	 * [modifyErrMsgVOS] update a list of ErrMsgVO into database.<br>
	 * 
	 * @param List<ErrMsgVO> errMsgVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifyErrMsgVOS(List<ErrMsgVO> errMsgVO) throws DAOException,Exception {
		// define an array to store value of boolean whether the result of running queries for each item from errMsgVO is committed
		int updCnt[] = null;
		try {
			// define a SQLExecuter variable to execute query
			SQLExecuter sqlExe = new SQLExecuter("");
			// if list exist any item in it, it will run query to save update changes in database
			if(errMsgVO .size() > 0){
				// updCnt store value of boolean whether the result of running queries for each item from errMsgVO is committed
				updCnt = sqlExe.executeBatch((ISQLTemplate)new ErrMsgMgmtDBDAOErrMsgVOUSQL(), errMsgVO,null);
				// go through array updCnt to find whether a query of an ErrMsgVO item can't commit
					// if that one exists throw a DAOException
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			// show an error log in console with error message
			log.error(se.getMessage(),se);
			// throw an EventException
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			// show an error log in console with error message
			log.error(ex.getMessage(),ex);
			// throw an EventException
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return updCnt;
	}
	
	/**
	 * [removeErrMsgVOS] remove a list of ErrMsgVO into database.<br>
	 * 
	 * @param List<ErrMsgVO> errMsgVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removeErrMsgVOS(List<ErrMsgVO> errMsgVO) throws DAOException,Exception {
		// define an array to store value of boolean whether the result of running queries for each item from errMsgVO is committed.
		int delCnt[] = null;
		try {
			// define a SQLExecuter variable to execute query
			SQLExecuter sqlExe = new SQLExecuter("");
			// if list exist any item in it, it will run query to save delete changes in database
			if(errMsgVO .size() > 0){
				// delCnt store value of boolean whether the result of running queries for each item from errMsgVO is committed
				delCnt = sqlExe.executeBatch((ISQLTemplate)new ErrMsgMgmtDBDAOErrMsgVODSQL(), errMsgVO,null);
				// go through array updCnt to find whether a query of an ErrMsgVO item can't commit
					// if that one exists throw a DAOException
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			// show an error log in console with error message
			log.error(se.getMessage(),se);
			// throw an EventException
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			// show an error log in console with error message
			log.error(ex.getMessage(),ex);
			// throw an EventException
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return delCnt;
	}
	
}