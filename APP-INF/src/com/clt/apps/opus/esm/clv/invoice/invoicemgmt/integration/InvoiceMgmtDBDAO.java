/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : InvoiceMgmtDBDAO.java
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.basic.InvoiceMgmtBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.InvoiceDtlVO;
import com.clt.apps.opus.esm.clv.invoice.invoicemgmt.vo.SearchTradeVO;


/**
 * ALPS InvoiceMgmtDBDAO <br>
 * - ALPS-Invoice system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Viet Tran
 * @see InvoiceMgmtBCImpl 참조
 * @since J2EE 1.6
 */
public class InvoiceMgmtDBDAO extends DBDAOSupport {

	/**
	 * [InvoiceVO] return a list of invoice master through query.<br>
	 * 
	 * @param InvoiceVO invoiceVO
	 * @return List<InvoiceVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<InvoiceVO> InvoiceVO(InvoiceVO invoiceVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<InvoiceVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(invoiceVO != null){
				Map<String, String> mapVO = invoiceVO .getColumnValues();
			
				List<String> jo_crr_cd_list = new ArrayList<>();

				if (invoiceVO.getJoCrrCd() != null) {
					String[] listInvoice = invoiceVO.getJoCrrCd().split(",");
					for (int i = 0; i < listInvoice.length; i++) {
						jo_crr_cd_list.add(listInvoice[i]);
					}
				}
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);

				param.put("jo_crr_cd_list", jo_crr_cd_list);
				velParam.put("jo_crr_cd_list", jo_crr_cd_list);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new InvoiceMgmtDBDAOSearchInvoiceRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, InvoiceVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

		/**
		 * [searchPartner] return a list of partner through query.<br>
		 * 
		 * @param InvoiceVO invoiceVO
		 * @return List<InvoiceVO>
		 * @exception DAOException
		 */
		 @SuppressWarnings("unchecked")
		public List<InvoiceVO> searchPartner(InvoiceVO invoiceVO) throws DAOException {
			DBRowSet dbRowset = null;
			List<InvoiceVO> list = null;
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				if(invoiceVO != null){
					Map<String, String> mapVO = invoiceVO .getColumnValues();
				
					param.putAll(mapVO);
					velParam.putAll(mapVO);
				}
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new InvoiceMgmtDBDAOSearchPartnerRSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, InvoiceVO .class);
			} catch(SQLException se) {
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			} catch(Exception ex) {
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}
		 

		/**
		 * [searchLane] return a list of lane through query.<br>
		 * 
		 * @param InvoiceVO invoiceVO
		 * @return List<InvoiceVO>
		 * @exception DAOException
		 */
		 @SuppressWarnings("unchecked")
		public List<InvoiceVO> searchLane(InvoiceVO invoiceVO) throws DAOException {
			DBRowSet dbRowset = null;
			List<InvoiceVO> list = null;
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				if(invoiceVO != null){
					Map<String, String> mapVO = invoiceVO .getColumnValues();
				
					List<String> invoice_list = new ArrayList<>();
					
					if(invoiceVO.getJoCrrCd() != null){
						String[] listInvoice = invoiceVO.getJoCrrCd().split(",");
						for(int i=0; i< listInvoice.length; i++){
							invoice_list.add(listInvoice[i]);
						}
					}
				
					param.putAll(mapVO);
					param.put("invoice_list", invoice_list);
					velParam.putAll(mapVO);
					velParam.put("invoice_list", invoice_list);
				}
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new InvoiceMgmtDBDAOSearchLaneRSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, InvoiceVO .class);
			} catch(SQLException se) {
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			} catch(Exception ex) {
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}

		/**
		 * [searchTrade] return a list of trade through query.<br>
		 * 
		 * @param SearchTradeVO searchTradeVO
		 * @return List<SearchTradeVO>
		 * @exception DAOException
		 */
		 @SuppressWarnings("unchecked")
		public List<SearchTradeVO> searchTrade(SearchTradeVO searchTradeVO) throws DAOException {
			DBRowSet dbRowset = null;
			List<SearchTradeVO> list = null;
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				if(searchTradeVO != null){
					Map<String, String> mapVO = searchTradeVO .getColumnValues();

					List<String> invoice_list = new ArrayList<>();
	
					if (searchTradeVO.getJoCrrCd() != null) {
						String[] listInvoice = searchTradeVO.getJoCrrCd().split(",");
						for (int i = 0; i < listInvoice.length; i++) {
							invoice_list.add(listInvoice[i]);
						}
					}
				
					param.putAll(mapVO);
					param.put("invoice_list", invoice_list);
					velParam.putAll(mapVO);
					velParam.put("invoice_list", invoice_list);
				}
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new InvoiceMgmtDBDAOSearchTradeRSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchTradeVO .class);
			} catch(SQLException se) {
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			} catch(Exception ex) {
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}
	 
	/**
	 * [InvoiceDtlVO] return a list of invoice detail through query.<br>
	 * 
	 * @param InvoiceDtlVO invoiceDtlVO
	 * @return List<InvoiceDtlVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<InvoiceDtlVO> InvoiceDtlVO(InvoiceDtlVO invoiceDtlVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<InvoiceDtlVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(invoiceDtlVO != null){
				Map<String, String> mapVO = invoiceDtlVO .getColumnValues();
			

				List<String> jo_crr_cd_list = new ArrayList<>();

				if (invoiceDtlVO.getJoCrrCd() != null) {
					String[] listInvoice = invoiceDtlVO.getJoCrrCd().split(",");
					for (int i = 0; i < listInvoice.length; i++) {
						jo_crr_cd_list.add(listInvoice[i]);
					}
				}
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);

				param.put("jo_crr_cd_list", jo_crr_cd_list);
				velParam.put("jo_crr_cd_list", jo_crr_cd_list);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new InvoiceMgmtDBDAOSearchInvoiceDetailRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, InvoiceDtlVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
	

	/**
	 * [addInvoiceVOS] insert multi invoice master records into db.<br>
	 * 
	 * @param List<InvoiceVO> invoiceVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] addInvoiceVOS(List<InvoiceVO> invoiceVO) throws DAOException,Exception {
		int insCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(invoiceVO .size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new InvoiceMgmtDBDAOInsertInvoiceCSQL(), invoiceVO,null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return insCnt;
	}
	
	/**
	 * [modifyInvoiceVOS] update multi invoice master records into db.<br>
	 * 
	 * @param List<InvoiceVO> invoiceVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] modifyInvoiceVOS(List<InvoiceVO> invoiceVO) throws DAOException,Exception {
		int updCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(invoiceVO .size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new InvoiceMgmtDBDAOUpdateInvoiceUSQL(), invoiceVO,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return updCnt;
	}
	
	/**
	 * [removeInvoiceVOS] delete multi invoice master records into db.<br>
	 * 
	 * @param List<InvoiceVO> invoiceVO
	 * @return int[]
	 * @exception DAOException
	 * @exception Exception
	 */
	public int[] removeInvoiceVOS(List<InvoiceVO> invoiceVO) throws DAOException,Exception {
		int delCnt[] = null;
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			if(invoiceVO .size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new InvoiceMgmtDBDAODeleteInvoiceDSQL(), invoiceVO,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return delCnt;
	}
}