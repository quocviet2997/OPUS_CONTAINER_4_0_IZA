/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ApprovalDBDAO.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2008-08-29
*@LastModifier : Jeong-Hoon Kim
*@LastVersion : 1.1
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.clt.bizcommon.approval.basic.ApprovalBCImpl;
import com.clt.bizcommon.approval.util.CsrCommlUtil;
import com.clt.bizcommon.approval.vo.ApPayInvVO;
import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalDeptVO;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.bizcommon.approval.vo.ApprovalStepVO;
import com.clt.bizcommon.approval.vo.SearchApprovalVO;
import com.clt.bizcommon.approval.vo.UnApprovalCsrVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComAproCsrDtlVO;
import com.clt.syscommon.common.table.ComAproRqstHdrVO;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;

/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see ApprovalBCImpl 참조
 * @since J2EE 1.4
 */
public class ApprovalDBDAO extends DBDAOSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * 생성된 CSR의 VNDR_NO에 해당하는 MDM정보에서 PAYMENT METHOD 유형에 따라 BANK ACCT FLG의 유효성 확인
	 * @param csrNo
	 * @return String
	 * @throws DAOException
	 */
	public String checkValidBankAcctFlg(String csrNo) throws DAOException {
		
		DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();
		
		try {
			param.put("csr_no", csrNo);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ApprovalDBDAOcheckValidBankAcctFlgRSQL(), param, null);
			dbRowset.next();
			return dbRowset.getString(1);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Staff의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<ApprovalStaffVO>
	 * @throws DAOException
	 */
	public List<ApprovalStaffVO> searchStaffList(ApprovalStaffVO approvalStaffVO) throws DAOException {		
		DBRowSet dbRowset = null;
		List<ApprovalStaffVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(approvalStaffVO != null) {
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
			
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalStaffVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalStaffVO.class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return list;
	}
	
	/**
	 * Organization의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<SearchDeptListVO>
	 * @throws DAOException
	 */
	public List<ApprovalDeptVO> searchDeptList(ApprovalStaffVO approvalStaffVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalDeptVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalDeptVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalDeptVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * Route의 Sequence를 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return String
	 * @Exception DAOException
	 */
	public String searchApprovalRouteSeq(ApprovalStaffVO approvalStaffVO) throws DAOException {		
		DBRowSet dbRowset = null;
		String sRtn = "";
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
		try {
			if(approvalStaffVO != null) {
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalRouteSeqRSQL(), param, null);
			while (dbRowset.next()) {
				sRtn = dbRowset.getString("APRO_ROUT_SEQ");
			}
		}catch(SQLException se){
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return sRtn;
	}
	
	/**
	 * Route의 Sequence를 생성합니다.<br>
	 * 
	 * @return String
	 * @Exception DAOException
	 */
	public String createApprovalRouteSeq() throws DAOException {
		DBRowSet dbRowset = null;
		String sRtn = "";
		
		try {			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalRouteSeqCSQL(), null, null);
			while (dbRowset.next()) {
				sRtn = dbRowset.getString("newseq");
			}
		}catch(SQLException se){
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return sRtn;
	}
	
	/**
	 * Route의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalRouteVO aprovalRouteVO
	 * @return List<ApprovalRouteVO>
	 * @throws DAOException
	 */
	public List<ApprovalRouteVO> searchApprovalRouteList(ApprovalRouteVO aprovalRouteVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalRouteVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(aprovalRouteVO != null){
				Map<String, String> mapVO = aprovalRouteVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalRouteVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalRouteVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * Route의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalRouteVO aprovalRouteVO
	 * @return List<ApprovalRouteVO>
	 * @throws DAOException
	 */
	public List<ApprovalRouteVO> searchApprovalRouteUtilList(ApprovalRouteVO aprovalRouteVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalRouteVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(aprovalRouteVO != null){
				Map<String, String> mapVO = aprovalRouteVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalRouteUtil02RSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalRouteVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * 기설정된 module별/office별 default결재권자 목록을 가져온다.
	 * @param approvalStaffVO
	 * @return List<ApprovalRouteVO>
	 * @throws DAOException
	 */
	public List<ApprovalRouteVO> searchApprovalRouteUtilList2(ApprovalStaffVO approvalStaffVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalRouteVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(approvalStaffVO != null) {
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			
				if("".equals(approvalStaffVO.getCsrNo())) {
					dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOsearchApprovalRouteUtilList2RSQL(), param, velParam);
				} else {
					dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOsearchApprovalRouteUtilList3RSQL(), param, velParam);
				}
			
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalRouteVO.class);
        	}
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}	
	
	/**
	 * Approval Route 의 정보를 수정합니다. <br>
	 * 
	 * @param ApprovalRouteVO aprovalRouteVO
	 * @throws DAOException
	 */
	public void modifyApprovalRoute(ApprovalRouteVO aprovalRouteVO) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(aprovalRouteVO != null){
				Map<String, String> mapVO = aprovalRouteVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOsaveApprovalRouteUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyApprovalRoute SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Approval Route 의 정보를 삭제합니다. <br>
	 * 
	 * @param ApprovalRouteVO aprovalRouteVO
	 * @throws DAOException
	 */
	public void removeApprovalRoute(ApprovalRouteVO aprovalRouteVO) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(aprovalRouteVO != null){
				Map<String, String> mapVO = aprovalRouteVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOdetailDSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to removeApprovalRoute SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Approval Route 의 정보를 생성합니다. <br>
	 * 
	 * @param String aproRoutSeq
	 * @param ApprovalStaffVO approvalStaffVO
	 * @throws DAOException
	 */
	public void addApprovalRoute(String aproRoutSeq, ApprovalStaffVO approvalStaffVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				mapVO.put("apro_rout_seq", aproRoutSeq);
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOsaveApprovalRouteCSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to addApprovalRoute SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Approval Route 의 Detail 정보를 생성합니다. <br>
	 * 
	 * @param List<ApprovalRouteVO> approvalRouteVOs
	 * @throws DAOException
	 */
	public void addApprovalRouteDetail(List<ApprovalRouteVO> approvalRouteVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(approvalRouteVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOdetailCSQL(), approvalRouteVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}	
	
	/**
	 * Approval Request Number를 조회합니다. <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return String
	 * @Exception DAOException
	 */
	public String searchAproRqstNo(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		String sRtn = "";
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
		if(approvalCsrVO != null){
			Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			param.putAll(mapVO);	
		}
		
		try {			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalReqNoRSQL(), param, null);
			while (dbRowset.next()) {
				sRtn = dbRowset.getString("APRO_RQST_NO");
			}
		}catch(SQLException se){
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return sRtn;
	}
	
	/**
	 * COM_APRO_RQST_HDR 결제정보를 수정한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyApprovalReqHdr(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalReqHdrUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyApprovalReqHdr SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * Approval Route 정보를 삭제한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */
	public void removeApprovalReqRoute(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalReqRouteDSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to removeApprovalReqRoute SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * Approval Route 정보를 생성합니다. <br>
	 * 
	 * @param List<ComAproRqstRoutVO> comAproRqstRoutVOs
	 * @throws DAOException
	 */
	public void addApprovalReqRoute(List<ComAproRqstRoutVO> comAproRqstRoutVOs) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(comAproRqstRoutVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApprovalReqRouteCSQL(), comAproRqstRoutVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP_INV_HDR 결제정보를 수정한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyApInvHdr(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApInvHdrUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyApInvHdr SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * Approval 목록을 조회합니다. <br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<SearchApprovalVO>
	 * @throws DAOException
	 */
	public List<SearchApprovalVO> searchApprovalByCsrNo(ApprovalStaffVO approvalStaffVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchApprovalVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchApprovalByCsrNoRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchApprovalVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * 부서모듈 사용자별 기본결재라인(COM_APRO_ROUT_DFLT_DTL) 목록을 조회합니다. <br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<SearchApprovalVO>
	 * @throws DAOException
	 */
	public List<SearchApprovalVO> searchApprovalByAproRouteSeq(ApprovalStaffVO approvalStaffVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchApprovalVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchApprovalByAproRoutSeqRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchApprovalVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * Csr의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet searchApprovalCsrList(ApprovalStaffVO approvalStaffVO) throws DAOException {
		DBRowSet dbRowset = null;

		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
				param.put("csr_no", CsrCommlUtil.seperationParameter(approvalStaffVO.getCsrNo(),","));
				velParam.put("csr_no", CsrCommlUtil.seperationParameter(approvalStaffVO.getCsrNo(),","));
			}
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalCsrVORSQL(), param, velParam);
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return dbRowset;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 현 결재자 정보를 조회한다. <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return ComAproRqstRoutVO
	 * @Exception DAOException
	 */
	public ComAproRqstRoutVO searchApprovalCurCsrRoute(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComAproRqstRoutVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalCurCsrRouteRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComAproRqstRoutVO .class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return list.size()==0?new ComAproRqstRoutVO():list.get(0);
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 최종 결재 여부를 체크한다 - 최종 결재시에만 CSR AP전송  <br>
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return boolean
	 * @Exception DAOException
	 */
	public boolean searchLastApprovalRoute(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		boolean isReqNo = false;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchLastApprovalRouteRSQL(), param, null);
			if(dbRowset.next()) {
				if(dbRowset.getInt(1) > 0) isReqNo = true;
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return isReqNo;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 기결재 완료 여부 파악 - 중복 결재 피하기 위함<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return boolean
	 * @Exception DAOException
	 */
	public boolean searchApprovalCompletion(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		boolean isCmlt = true;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchApprovalCompletionRSQL(), param, null);
			if(dbRowset.next()) {
				if("P".equals(dbRowset.getString("apsts_cd"))) isCmlt = false;
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return isCmlt;
	}
	
	/**
	 * 결재상신 엔티티 라우트테이블의 해당 결재권자 결재상태를 완료처리한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param String usrId
	 * @param String usrNm
	 * @Exception DAOException
	 */ 
	public void modifyConfirmRqstRout(ApprovalCsrVO approvalCsrVO, String usrId, String usrNm) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				mapVO.put("apro_usr_id", usrId);
				mapVO.put("apro_usr_nm", usrNm);
				param.putAll(mapVO);	
			}
			
			//APRO_RQST_SEQ의 조건이 있으면 결재자가 다수인경우 처리안됨
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmRqstRoutUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyConfirmRqstRout SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}  
	
	/**
	 * Approval Completion 정보를 조회합니다. <br>
	 *  
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return boolean
	 * @Exception DAOException
	 */
	public boolean searchApprovalCompleteCount(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		boolean isCt = true;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalCompleteCountRSQL(), param, null);
			if(dbRowset.next()) {
				if(dbRowset.getInt("CNT") > 0) isCt = false;
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return isCt;
	}
	
	/**
	 * COM_APRO_RQST_HDR 승인정보를 완료로 수정한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyConfirmRqstHdrC(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmRqstHdrCUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyConfirmRqstHdrC SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * COM_APRO_RQST_HDR 승인정보를 진행으로 수정한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyConfirmRqstHdrP(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmRqstHdrPUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyConfirmRqstHdrP SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * AP_PAY_INV 승인정보를 수정한다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyConfirmApPayInv(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmApPayInvUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyConfirmApPayInv SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * 결재상신 엔티티 라우트테이블(COM_APRO_RQST_ROUT)의 해당 결재권자 결재상태를 반려처리한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param String usrId
	 * @param String usrNm
	 * @Exception DAOException
	 */ 
	public void modifyRejectAproRqstRout(ApprovalCsrVO approvalCsrVO, String usrId, String usrNm) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				mapVO.put("apro_usr_id", usrId);
				mapVO.put("apro_usr_nm", usrNm);
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAORejectAproRqstRoutUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyRejectAproRqstRout SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * 헤더테이블(COM_APRO_RQST_HDR)의 결재상태를 반려처리한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyRejectAproRqstHdr(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAORejectAproRqstHdrUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyRejectAproRqstHdr SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	} 
	
	/**
	 * 승인권자가 Reject 할 경우 CSR 중간테이블(AP_PAY_INV)의 INVOICE 진행상태를 반려로 업데이트한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void modifyRejectApPayInv(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);	
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAORejectApPayInvUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyRejectApPayInv SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP_PAY_INV의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return List<ApPayInvVO>
	 * @Exception DAOException
	 */
	public List<ApPayInvVO> searchSO(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApPayInvVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
        try {
        	if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApPayInvVORSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApPayInvVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * CLZ_STS_CD, GL_DT, NEW_GL_DT 의 실시간 데이타를 구해온다 <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return ApPayInvVO
	 * @Exception DAOException
	 */
	public ApPayInvVO checkUpdateRevVVD(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApPayInvVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
			
				param.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOCheckUpdateRevVVDRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApPayInvVO.class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return list.size()==0?new ApPayInvVO():list.get(0);
	}
	
	/**
	 * AP_INV_DTRB의 VVD 정보를 수정한다.<br>
	 * 
	 * @param String csrNo
	 * @param String newGlDt
	 * @Exception DAOException
	 */ 
	public void modifyUpdateRevVVDDtrb(String csrNo, String newGlDt) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(csrNo != null){
				Map<String, String> mapVO =  new HashMap<String, String>();
				 
				mapVO.put("csr_no"   , csrNo);
				mapVO.put("new_gl_dt", newGlDt);
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOUpdateRevVVDDtrbUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyUpdateRevVVDDtrb SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP_PAY_INV_DTL의 VVD 정보를 수정한다.<br>
	 * 
	 * @param String csrNo
	 * @param String newGlDt
	 * @Exception DAOException
	 */ 
	public void modifyUpdateRevVVDDtl(String csrNo, String newGlDt) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(csrNo != null){
				Map<String, String> mapVO =  new HashMap<String, String>();
				 
				mapVO.put("csr_no"   , csrNo);
				mapVO.put("new_gl_dt", newGlDt);
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOUpdateRevVVDDtlUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyUpdateRevVVDDtl SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 최종 승인자 정보 및 GL_DT 정보를 CSR AP전송을 위한 테이블(AP_INV_HDR)로 업데이트한다 <br>
	 * 
	 * @param String titleName
	 * @param String csrNo
	 * @param String newGlDt
	 * @Exception DAOException
	 */ 
	public void modifyApprovalStep(String titleName, String csrNo, String newGlDt) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(csrNo != null){
				Map<String, String> mapVO =  new HashMap<String, String>();
				 
				mapVO.put("title_name", titleName);
				mapVO.put("csr_no"    , csrNo);
				mapVO.put("new_gl_dt" , newGlDt);
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalStepUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyApprovalStep SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * CSR 상태를 정의하고있는 중간테이블(AP_PAY_INV) 의 상태를 P(A/P Interfaced) 로 업데이트 한다<br>
	 * 
	 * @param List<ApPayInvVO> apPayInvVOs
	 * @Exception DAOException
	 */
	public void modifyStsCdPayInv(List<ApPayInvVO> apPayInvVOs) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(apPayInvVOs.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApPayInvVOUSQL(), apPayInvVOs, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
     * COM_CSR_0008 View Approval Step 버튼 -> COM_ENS_0W1 팝업 조회 이벤트 처리<br>
     * Approval Step 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @return List<ApprovalStepVO>
	 * @Exception DAOException
	 */
	public List<ApprovalStepVO> searchApprovalStepList(ApprovalCsrVO approvalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalStepVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
        try {
        	if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalStepRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalStepVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * AP_INV_HDR 의 최종 승인자 정보를 업데이트 합니다. <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void confirmApprovalRemark(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmApprovalRemarkUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to confirmApprovalRemark SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * COM_APRO_RQST_ROUT의 Approval Result 정보를 업데이트 합니다. <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @Exception DAOException
	 */ 
	public void confirmApprovalResultRemark(ApprovalCsrVO approvalCsrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(approvalCsrVO != null){
				Map<String, String> mapVO = approvalCsrVO.getColumnValues();
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOConfirmApprovalResultRemarkUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to confirmApprovalRemark SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * New Approval Request Number를 생성한다. <br>
	 * 
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public String searchNewAproRqstNo() throws DAOException {
		DBRowSet dbRowset = null;
		String newAproNo = "";

		try{			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchNewAproRqstNoRSQL(), null, null);
			if(dbRowset.next()) {
				newAproNo = dbRowset.getString("APRO_RQST_NO");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return newAproNo;
	}
	
	/**
	 * 결재요청 헤더 정보를 생성합니다. <br>
	 * 
	 * @param ComAproRqstHdrVO comAproRqstHdrVO
	 * @Exception DAOException
	 */ 
	public void addApprovalHeader(ComAproRqstHdrVO comAproRqstHdrVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(comAproRqstHdrVO != null){
				Map<String, String> mapVO = comAproRqstHdrVO.getColumnValues();
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalHeaderCSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to addApprovalHeader SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 결재요청 결재권자 정보를 생성합니다. <br>
	 * 
	 * @param ComAproRqstRoutVO comAproRqstRoutVO
	 * @Exception DAOException
	 */ 
	public void addApprovalRoute(ComAproRqstRoutVO comAproRqstRoutVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(comAproRqstRoutVO != null){
				Map<String, String> mapVO = comAproRqstRoutVO.getColumnValues();
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalRouteCSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to addApprovalRoute SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 결재요청 결재권자 정보를 생성합니다. <br>
	 * 
	 * @param List<ComAproRqstRoutVO> comAproRqstRoutVOs
	 * @Exception DAOException
	 */ 
	public void addApprovalRoute(List<ComAproRqstRoutVO> comAproRqstRoutVOs) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(comAproRqstRoutVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApprovalRouteCSQL(), comAproRqstRoutVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * COM_APRO_CSR_DTL 정보를 생성합니다. <br>
	 * 
	 * @param ComAproCsrDtlVO comAproCsrDtlVO
	 * @Exception DAOException
	 */ 
	public void addApprovalCsr(ComAproCsrDtlVO comAproCsrDtlVO) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(comAproCsrDtlVO != null){
				Map<String, String> mapVO = comAproCsrDtlVO.getColumnValues();
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOApprovalCsrCSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to addApprovalCsr SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP_INV_HDR 의 최종 승인자 정보를 업데이트 합니다. <br>
	 * 
	 * @param String csrNo
	 * @Exception DAOException
	 */ 
	public void cancelApproval(String csrNo) throws DAOException {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			
			if(csrNo != null){
				Map<String, String> mapVO =  new HashMap<String, String>();
				 
				mapVO.put("csr_no"    , csrNo);
				param.putAll(mapVO);
			}
			
			int result = sqlExe.executeUpdate((ISQLTemplate)new ApprovalDBDAOCancelApprovalUSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED) throw new DAOException("Fail to modifyApprovalStep SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
    /**
     * CSR 번호로 Approval Step조회한다. (JOO)
     * @param String csrNo
     * @return List<ApprovalRouteVO>
     * @throws DAOException
     */
	public List<ApprovalRouteVO> searchApprovalRouteListByCsrNo(String csrNo) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApprovalRouteVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
        try {
			Map<String, String> mapVO =  new HashMap<String, String>();
			 
			mapVO.put("csr_no"   , csrNo);
			param.putAll(mapVO);
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalRouteUtilRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApprovalRouteVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	/**
	 * MDM_ORGANIGATION에서 RHQ(AR_HD_QTR_OFC_CD)에 해당하는 Office code의 list를 구해온다.<br>
	 * 
	 * @author ds ham
	 * @return List<String>
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<String> searchARRHQOfficeList() throws DAOException {
		DBRowSet dbRowset = null;

		List list = new ArrayList();
		String arOfcCd = "";
		
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			Map<String, String> mapVO = new HashMap<String, String>();
			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ApprovalDBDAOSearchARRHQOfficeListRSQL(), param, velParam);

			while (dbRowset.next()) {
				arOfcCd = dbRowset.getString("ar_ofc_cd");

				list.add(arOfcCd);
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}
	
	/**
	 * Office code의 list를 조회한다.<br>
	 * 
	 * @param String rhqOfcCd
	 * @return List<String>
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<String> searchSelOfficeList(String rhqOfcCd) throws DAOException {
		DBRowSet dbRowset = null;

		List list = new ArrayList();
		
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("ar_hd_qtr_ofc_cd", rhqOfcCd);
			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ApprovalDBDAOSearchOfficeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, UnApprovalCsrVO .class);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}
	
	/**
	 * ESD_SCE_0125 : 조회를 위한 토크나이져 스트링가져오기 
	 * @param ExceptionalRouteVO exceptionalRouteVO
	 * @return List<ExceptionalRouteVO>
	 * @throws DAOException
	 */
	private String setParams(StringBuffer sbuf, StringTokenizer token, int max) throws SQLException { 
	    for ( int i = 0; i < max; i++ )
	    { 
    	  if(i==0){
    		 sbuf.append ( "" ).append ( token.nextToken ( ) ).append ( "" );
    		 if(max > 1){
    			 sbuf.append("',");
    		 }
    	  }else{
		      if ( i != max - 1 ){
		    	 sbuf.append ( "'" ).append ( token.nextToken ( ) ).append ( "'," );
		      }else{
		         sbuf.append ( "'" ).append ( token.nextToken ( ) ).append ( "" );
		      }
    	  }
	    }
		return sbuf.toString();
	}
	
	/**
	 * CSR의 결재권자가 미승인된 내역을 조회한다.<br>
	 * 
	 * @param UnApprovalCsrVO unApprovalCsrVO
	 * @return List<UnApprovalCsrVO>
	 * @Exception DAOException
	 */
	public List<UnApprovalCsrVO> searchUnApprovalCsrList(UnApprovalCsrVO unApprovalCsrVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<UnApprovalCsrVO> list = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if(unApprovalCsrVO != null){
				Map<String, String> mapVO = unApprovalCsrVO.getColumnValues();
				
			    StringBuffer sbuf = new StringBuffer ( );
			    sbuf.setLength ( 0 ); 

			    StringTokenizer ofc_cd_token = new StringTokenizer ( (String)mapVO.get("ofc_cd"), "," );
			    
			    String ofcs = setParams(sbuf, ofc_cd_token, ofc_cd_token.countTokens ( ));
				
				param.putAll(mapVO);
				//velParam.putAll(mapVO);
				List<String> ofcvec = new ArrayList();
				if(!ofcs.equals("") && !ofcs.equals("ALL")){
					ofcvec.add(ofcs);
					velParam.put("ofc_cd", 	ofcvec);
				}else{
					velParam.put("ofc_cd", 	"");
				}
				
				velParam.put("ar_hd_qtr_ofc_cd", mapVO.get("ar_hd_qtr_ofc_cd"));
				velParam.put("inv_eff_dt", mapVO.get("inv_eff_dt"));
				velParam.put("sub_sys_cd", mapVO.get("sub_sys_cd"));
				velParam.put("csr_no", mapVO.get("csr_no"));
			}
        	
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOUnApprovalCsrRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, UnApprovalCsrVO.class);        	
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	
	
	/**
	 *  OFC_CD로 RHQ_OFC_CD를 조회한다.<br>
	 * 
	 * @param String ofcCd
	 * @return String
	 * @Exception DAOException
	 */
	public String searchRhqOfcCdByOfcCd(String ofcCd) throws DAOException {		
		DBRowSet dbRowset = null;
		String sRtn = "";
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		
		try {
			param.put("ofc_cd", ofcCd);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchRhqOfcCodeByOfcCodeRSQL(), param, null);
			while (dbRowset.next()) {
				sRtn = dbRowset.getString("RHQ_OFC_CD");
			}
		}catch(SQLException se){
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return sRtn;
	}

	/**
	 * MDM_ORGANIGATION에서 RHQ(HD_QTR_OFC_CD)에 해당하는 Office code의 list를 조회한다.<br>
	 * 
	 * @return List<String>
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public List<String> searchRHQOfficeList() throws DAOException {
		DBRowSet dbRowset = null;

		List list = new ArrayList();
		String arOfcCd = "";
		
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			Map<String, String> mapVO = new HashMap<String, String>();
			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ApprovalDBDAOSearchRHQOfficeListRSQL(), param, velParam);

			while (dbRowset.next()) {
				arOfcCd = dbRowset.getString("rhq_cd");

				list.add(arOfcCd);
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}
	
	/**
	 * Ar Heder Office code를 조회한다.<br>
	 * 
	 * @param String ofcCd
	 * @return String
	 * @exception DAOException
	 */
	@SuppressWarnings("unchecked")
	public String searchRHQOffice(String ofcCd) throws DAOException {
		DBRowSet dbRowset = null;

		String rhqOfcCd = "";
		
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("ofc_cd", ofcCd);
			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ApprovalDBDAOSearchRHQOfficeRSQL(), param, velParam);

			while (dbRowset.next()) {
				rhqOfcCd = dbRowset.getString("rhq_ofc_cd");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return rhqOfcCd;
	}
	
	/**
	 * Appoval의 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param String[] searchCondOfc
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet searchApprovalList(ApprovalStaffVO approvalStaffVO, String[] searchCondOfc) throws DAOException {
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        try {
        	if(approvalStaffVO != null){
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
				List<String> lstCOfcCd = new ArrayList();
				String cOfcCd = searchCondOfc[0];
				// cost office
				if(cOfcCd!=null && !cOfcCd.equals("")) {
					String[] arrCOfcCd = cOfcCd.split(",");  
		            for(int i = 0; i <arrCOfcCd.length; i++) {   
		            	lstCOfcCd.add(arrCOfcCd[i]);
		            }
		            velParam.put("c_ofc_cd_list", lstCOfcCd);
				} else {
					velParam.put("c_ofc_cd_list", "");
				}

	            // approval office
	            List<String> aLstOfcCd = new ArrayList();
				String aOfcCd = searchCondOfc[1];
				if(aOfcCd!=null && !aOfcCd.equals("")) {
					String[] arrAOfcCd = aOfcCd.split(",");  
		            for(int i = 0; i <arrAOfcCd.length; i++) {   
		            	aLstOfcCd.add(arrAOfcCd[i]);
		            }
		            velParam.put("a_ofc_cd_list", aLstOfcCd);
				} else {
					velParam.put("a_ofc_cd_list", "");
				}
				
				param.put("csr_no", CsrCommlUtil.seperationParameter(approvalStaffVO.getCsrNo(),","));
				velParam.put("csr_no", CsrCommlUtil.seperationParameter(approvalStaffVO.getCsrNo(),","));
			}
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOApprovalListRSQL(), param, velParam);
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        return dbRowset;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 중복 결재 Check<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
	 * @return String
	 * @Exception DAOException
	 */
	public String checkApprovalDuplication(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws DAOException {
		DBRowSet dbRowset = null;
		String chkValue = "N";
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			if(approvalCsrVO != null){
				Map<String, String> mapVO = new HashMap<String, String>();
				mapVO.put("login_usr_id", account.getUsr_id());
				mapVO.put("csr_no", approvalCsrVO.getCsrNo());
				param.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOCheckApprovalDuplicationRSQL(), param, null);
			if(dbRowset.next()) {
				chkValue = dbRowset.getString("chk_curr_apro_usr");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return chkValue;
	}
	
	/**
	 * CheckOfcCd
	 * @param String ofcCd
	 * @return String
	 * @throws DAOException String
	 */
	public String checkOfficeCode(String ofcCd) throws DAOException {
		DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();
		try{			
			param.put("ofc_cd", ofcCd);
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ApprovalDBDAOCheckOfficeCodeRSQL(), param, null);
			dbRowset.next();
			return dbRowset.getString(1);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * CSR amount limitation setup 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet searchCsrAmountLimitList(ApprovalCsrAmountLimitVO vo) throws DAOException {
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        try {
        	if(vo != null){
				Map<String, String> mapVO = vo.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
				if(!"".equals(vo.getOfcCd())) {
					String[] arrAOfcCd = vo.getOfcCd().split(",");  
					List<String> aLstOfcCd = new ArrayList();
		            for(int i = 0; i <arrAOfcCd.length; i++) {   
		            	aLstOfcCd.add(arrAOfcCd[i]);
		            }
					velParam.put("ofc_cd_list", aLstOfcCd);
				}
			}
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchCsrAmountLimitListRSQL(), param, velParam);
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        return dbRowset;
	}
	
	/**
	 * CSR amount limitation의 정보를 등록합니다. <br>
	 * 
	 * @param List<ApprovalCsrAmountLimitVO> inVOs
	 * @throws DAOException
	 */
	public void createCsrAmountLimitList(List<ApprovalCsrAmountLimitVO> inVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(inVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApprovalCsrAmountLimitCSQL(), inVOs,null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * CSR amount limitation의 정보를 수정합니다. <br>
	 * 
	 * @param List<ApprovalCsrAmountLimitVO> inVOs
	 * @throws DAOException
	 */
	public void modifyCsrAmountLimitList(List<ApprovalCsrAmountLimitVO> inVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(inVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApprovalCsrAmountLimitUSQL(), inVOs,null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * CSR amount limitation setup History 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
	 * @return DBRowSet
	 * @Exception DAOException
	 */
	public DBRowSet searchCsrAmountLimitHistoryList(ApprovalCsrAmountLimitVO vo) throws DAOException {
		DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        try {
        	if(vo != null){
				Map<String, String> mapVO = vo.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
        	dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOSearchCsrAmountLimitHistListRSQL(), param, velParam);
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        return dbRowset;
	}
	
	/**
	 * CSR amount limitation의 History정보를 등록합니다. <br>
	 * 
	 * @param List<ApprovalCsrAmountLimitVO> inVOs
	 * @throws DAOException
	 */
	public void createCsrAmountLimitHistoryList(List<ApprovalCsrAmountLimitVO> inVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(inVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOApprovalCsrAmountLimitHistCSQL(), inVOs,null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	
	/**
	 * 미결 CSR을 조회한다 - 결재자 정보를 최신으로 update할 대상들
	 * @param approvalStaffVO
	 * @param chk_cmpl_unapro
	 * @param apro_evnt_desc
	 * @return List<UnApprovalCsrVO>
	 * @throws DAOException
	 */
	public List<UnApprovalCsrVO> searchCompletelyUnapprovedCSRList(ApprovalStaffVO approvalStaffVO, String chk_cmpl_unapro, String apro_evnt_desc) throws DAOException {
		
		DBRowSet dbRowset = null;
		List<UnApprovalCsrVO> list = null;
		
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
        	if (approvalStaffVO != null) {
				Map<String, String> mapVO = approvalStaffVO.getColumnValues();
				mapVO.put("chk_cmpl_unapro",chk_cmpl_unapro);
				mapVO.put("apro_evnt_desc",apro_evnt_desc);
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOsearchCompletelyUnapprovedCSRListRSQL(), param, velParam);
			
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, UnApprovalCsrVO.class);
        	}
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return list;
	}
	

	/**
	 * 미결 CSR의 기존 결재자 정보를 삭제한다.
	 * @param unapprdCsrListVOs
	 * @throws DAOException
	 * @throws Exception
	 */
	public void deleteCurrentApproversForUnapprovedCsr(List<UnApprovalCsrVO> unapprdCsrListVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (unapprdCsrListVOs != null && unapprdCsrListVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOdeleteCurrentApproversForUnapprovedCsrDSQL(), unapprdCsrListVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	
	/**
	 * 미결 CSR의 기존 결재자 정보를 삭제한다.
	 * @param unapprdCsrListVOs
	 * @throws DAOException
	 * @throws Exception
	 */
	public void updateCurrentApprovalSeqForUnapprovedCsr(List<UnApprovalCsrVO> unapprdCsrListVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (unapprdCsrListVOs != null && unapprdCsrListVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOupdateCurrentApprovalSeqForUnapprovedCsrUSQL(), unapprdCsrListVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * n1st approved rout -> unapproved
	 * @param unapprdCsrListVOs
	 * @throws DAOException
	 * @throws Exception
	 */
	public void updateN1stApprovedRoutToUnapproved(List<UnApprovalCsrVO> unapprdCsrListVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (unapprdCsrListVOs != null && unapprdCsrListVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOupdateN1stApprovedRoutToUnapprovedUSQL(), unapprdCsrListVOs, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	
	/**
	 * 미결 CSR의 결재자 정보에 최신 결재자 정보를 입력한다.
	 * @param unapprdCsrListVOs
	 * @throws DAOException
	 * @throws Exception
	 */
	public void insertNewApproversForUnapprovedCsr(List<UnApprovalCsrVO> unapprdCsrListVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (unapprdCsrListVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOinsertNewApproversForUnapprovedCsrCSQL(), unapprdCsrListVOs, null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	
	/**
	 * approver 변경시 기준 시간 조회용
	 * @return String
	 * @throws DAOException
	 */
	public String searchAproEvntDesc() throws DAOException {
		
		DBRowSet dbRowset = null;
		String retval = "";
		
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
        try {
			Map<String, String> mapVO = new HashMap<String, String>();
			param.putAll(mapVO);
			velParam.putAll(mapVO);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ApprovalDBDAOsearchAproEvntDescRSQL(), param, velParam);
		
			if (dbRowset.next()) {
				retval = dbRowset.getString("apro_evnt_desc");
			}
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        
        return retval;
	}
	
	/**
	 * 미결 CSR의 결재자 정보에 최신 결재자 정보를 입력한다.
	 * @param unapprdCsrListVOs
	 * @throws DAOException
	 * @throws Exception
	 */
	public void insertAproRqstRoutHis(List<UnApprovalCsrVO> unapprdCsrListVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if (unapprdCsrListVOs.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ApprovalDBDAOinsertAproRqstRoutHisCSQL(), unapprdCsrListVOs, null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
}
