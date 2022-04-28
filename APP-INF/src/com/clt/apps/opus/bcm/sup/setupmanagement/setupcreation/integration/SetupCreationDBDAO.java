/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAO.java
*@FileTitle : EDI CROUP
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.28
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.28 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.basic.SetupCreationBCImpl;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForCustomerVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForUSReleaseVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiPrnrPortLaneListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiSubLnkMsgListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiTrdPrnrSubLnkListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCargoStandardStatusListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCustomerScheduleListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCargoListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCustomerListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchYardListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * OPUS_CNTR-SetupManagement <br>
 * - OPUS_CNTR-SetupManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Yoon-Tae, Jung
 * @see SetupCreationBCImpl 참조
 * @since J2EE 1.6
 */
public class SetupCreationDBDAO extends DBDAOSupport {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * EDI GROUP 정보를 가져온다<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param ediGrpDesc String
	 * @param custTrdPrnrId String
	 * @return List<SearchBunkerVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchGroupListVO> searchGroupList(String grpCd, String coDivCd, String ediGrpDesc, String custTrdPrnrId) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchGroupListVO> searchGroupListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("grp_cd", grpCd);
			param.put("co_div_cd", coDivCd);
			param.put("edi_grp_desc", ediGrpDesc);
			param.put("cust_trd_prnr_id", custTrdPrnrId);
			
			vparam.put("grp_cd", grpCd);
			vparam.put("co_div_cd", coDivCd);
			vparam.put("edi_grp_desc", ediGrpDesc);
			vparam.put("cust_trd_prnr_id", custTrdPrnrId);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchGroupListVORSQL(), param, vparam);
			searchGroupListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchGroupListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchGroupListVO;
	}

	/**
	 * EDI GROUP에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupGroup(String grpCd, String coDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("grp_cd", grpCd);
			param.put("co_div_cd", coDivCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupGroupRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
    
	/**
	 * EDI GROUP 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void addGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchGroupListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddGroupCSQL(), searchGroupListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void addBkgGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchGroupListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddBkgGroupCSQL(), searchGroupListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP 정보를 변경한다.<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void modifyGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchGroupListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyGroupUSQL(), searchGroupListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP 정보를 변경한다.<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void modifyBkgGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchGroupListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyBkgGroupUSQL(), searchGroupListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP 정보를 삭제한다.<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void removeGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchGroupListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveGroupDSQL(), searchGroupListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP 정보를 삭제한다.<br>
	 * 
	 * @param searchGroupListVO List<SearchGroupListVO>
	 * @throws DAOException
	 */
	public void removeBkgGroups(List<SearchGroupListVO> searchGroupListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchGroupListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveBkgGroupDSQL(), searchGroupListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI CARGO STANDARD STATUS 정보를 가져온다<br>
	 * 
	 * @param stndStsCd String
	 * @param coDivCd String
	 * @return List<SearchCargoStandardStatusListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchCargoStandardStatusListVO> searchCargoStandardStatusList(String stndStsCd, String coDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchCargoStandardStatusListVO> searchCargoStandardStatusListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("stnd_sts_cd", stndStsCd);
			param.put("co_div_cd", coDivCd);
			
			vparam.put("stnd_sts_cd", stndStsCd);
			vparam.put("co_div_cd", coDivCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchCargoStandardStatusListVORSQL(), param, vparam);
			
			searchCargoStandardStatusListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCargoStandardStatusListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchCargoStandardStatusListVO;
	}

	 /**
	  * EDI CARGO STANDARD STATUS에 중복데이타가 존재하는지 체크한다<br>
	  * 
	  * @param stndStsCd String
	  * @param coDivCd String
	  * @return int
	  * @throws DAOException
	  */
	 public int checkDupCargoStandardStatus(String stndStsCd, String coDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("stnd_sts_cd", stndStsCd);
			param.put("co_div_cd", coDivCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupCargoStandardStatusRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * EDI CARGO STANDARD STATUS 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param searchCargoStandardStatusListVO List<SearchCargoStandardStatusListVO>
	 * @throws DAOException
	 */
	public void addCargoStandardStatus(List<SearchCargoStandardStatusListVO> searchCargoStandardStatusListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchCargoStandardStatusListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddCargoStandardStatusCSQL(), searchCargoStandardStatusListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("FMS01201",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI CARGO STANDARD STATUS 정보를 변경한다.<br>
	 * 
	 * @param searchCargoStandardStatusListVO List<SearchCargoStandardStatusListVO>
	 * @throws DAOException
	 */
	public void modifyCargoStandardStatus(List<SearchCargoStandardStatusListVO> searchCargoStandardStatusListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchCargoStandardStatusListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyCargoStandardStatusUSQL(), searchCargoStandardStatusListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI CARGO STANDARD STATUS 정보를 삭제한다.<br>
	 * 
	 * @param searchCargoStandardStatusListVO List<SearchCargoStandardStatusListVO>
	 * @throws DAOException
	 */
	public void removeCargoStandardStatus(List<SearchCargoStandardStatusListVO> searchCargoStandardStatusListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchCargoStandardStatusListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveCargoStandardStatusDSQL(), searchCargoStandardStatusListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP CUSTOMER 정보를 가져온다<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param scNo String
	 * @param cgoTrcSvcFlg String
	 * @param custCd String
	 * @return List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchGroupCustomerListVO> searchGroupCustomerList(String grpCd, String coDivCd, String scNo, String cgoTrcSvcFlg, String custCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchGroupCustomerListVO> searchGroupCustomerListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("grp_cd", grpCd);
			param.put("co_div_cd", coDivCd);
			param.put("sc_no", scNo);
			param.put("cgo_trc_svc_flg", cgoTrcSvcFlg);
			param.put("cust_cd", custCd);
			
			vparam.put("grp_cd", grpCd);
			vparam.put("co_div_cd", coDivCd);
			vparam.put("sc_no", scNo);
			vparam.put("cgo_trc_svc_flg", cgoTrcSvcFlg);
			vparam.put("cust_cd", custCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchGroupCustomerListVORSQL(), param, vparam);
			
			searchGroupCustomerListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchGroupCustomerListVO.class);
			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchGroupCustomerListVO;
	}

	/**
	 * EDI GROUP CUSTOMER에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param custCntCd String
	 * @param custSeq String
	 * @param scNo String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupGroupCustomer(String grpCd, String coDivCd, String custCntCd, String custSeq, String scNo) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("grp_cd", grpCd);
			param.put("co_div_cd", coDivCd);
			param.put("cust_cnt_cd", custCntCd);
			param.put("cust_seq", custSeq);
			param.put("sc_no", scNo);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupGroupCustomerRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * EDI GROUP CUSTOMER 정보를 저장한다(입력)<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void addGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddGroupCustomerCSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP CUSTOMER 정보를 저장한다(입력)<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void addBkgGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddBkgGroupCustomerCSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP CUSTOMER 정보를 변경한다.<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void modifyGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyGroupCustomerUSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP CUSTOMER 정보를 변경한다.<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void modifyBkgGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyBkgGroupCustomerUSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP CUSTOMER 정보를 삭제한다.<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void removeGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveGroupCustomerDSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI GROUP CUSTOMER 정보를 삭제한다.<br>
	 * 
	 * @param searchGroupCustomerListVO List<SearchGroupCustomerListVO>
	 * @throws DAOException
	 */
	public void removeBkgGroupCustomers(List<SearchGroupCustomerListVO> searchGroupCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchGroupCustomerListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveBkgGroupCustomerDSQL(), searchGroupCustomerListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * EDI GROUP CARGO 정보를 가져온다<br>
	 * 
	 * @param grpCd String
	 * @param coDivCd String
	 * @param stndStsCd String
	 * @param custCd String
	 * @return List<SearchGroupCargoListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchGroupCargoListVO> searchGroupCargoList(String grpCd, String coDivCd, String stndStsCd, String custCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchGroupCargoListVO> searchGroupCargoListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("grp_cd", grpCd);
			param.put("co_div_cd", coDivCd);
			param.put("stnd_sts_cd", stndStsCd);
			param.put("cust_cd", custCd);
			
			vparam.put("grp_cd", grpCd);
			vparam.put("co_div_cd", coDivCd);
			vparam.put("stnd_sts_cd", stndStsCd);
			vparam.put("cust_cd", custCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchGroupCargoListVORSQL(), param, vparam);
			
			searchGroupCargoListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchGroupCargoListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchGroupCargoListVO;
	}

	/**
	 * Standard Status Code 정보를 가져온다<br>
	 * 
	 * @param stndStsCd String
	 * @return String
	 * @throws DAOException
	 */
	 
	public String checkStandardStatusCode(String stndStsCd) throws DAOException {
		return checkStandardStatusCode(stndStsCd, null);
	}

	/**
	 * Standard Status Code 정보를 가져온다<br>
	 * 
	 * @param ediStndStsCd String
	 * @param coDivCd String
	 * @return result String
	 * @throws DAOException
	 */
	 
	public String checkStandardStatusCode(String ediStndStsCd, String coDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("edi_stnd_std_cd", ediStndStsCd);
			param.put("co_div_cd", coDivCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckStandardStatusCodeRSQL(), param, param);
			if(dbRowset.next()) {
				result = dbRowset.getString("edi_stnd_sts_cd");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * Checking Edi Group Code<br>
	 * 
	 * @param ediGrpCd String
	 * @param coDivCd String
	 * @return result String
	 * @exception DAOException
	 */
	public String checkEdiGroupCode(String ediGrpCd, String coDivCd) throws DAOException {
		DBRowSet dbRowset = null;
		String result = null;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("edi_grp_cd", ediGrpCd);
			param.put("co_div_cd", coDivCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckEdiGroupCodeRSQL(), param, param);
			if(dbRowset.next()) {
				result = dbRowset.getString("edi_grp_cd");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}
	
	/**
	 * EDI GROUP CARGO 정보를 저장한다(입력)<br>
	 * 
	 * @param searchGroupCargoListVO List<SearchGroupCargoListVO>
	 * @throws DAOException
	 */
	public void addGroupCargos(List<SearchGroupCargoListVO> searchGroupCargoListVO) throws DAOException,Exception {
		try {			
			Map<String, Object> param = new HashMap<String, Object>();
			List<SearchGroupCargoListVO> model = searchGroupCargoListVO;
			int insCnt = 0;			
			if(model.size() > 0){
				for(int i = 0; i < model.size(); i++){
					param.put("edi_grp_cd", model.get(i).getEdiGrpCd());
					param.put("co_div_cd", model.get(i).getCoDivCd());
					param.put("edi_stnd_sts_cd", model.get(i).getEdiStndStsCd());
					param.put("cust_edi_sts_cd", model.get(i).getCustEdiStsCd());
					param.put("edi_evnt_cd", model.get(i).getEdiEvntCd());
					param.put("edi_snd_flg", model.get(i).getEdiSndFlg());
					param.put("edi_vsl_tp_cd", model.get(i).getEdiVslTpCd());
					param.put("edi_snd_itval_hrmnt", model.get(i).getEdiSndItvalHrmnt());
					param.put("edi_cntr_snd_tp_cd", model.get(i).getEdiCntrSndTpCd());
					param.put("org_conti_desc", model.get(i).getOrgContiDesc());
					param.put("org_dest_cnt_desc", model.get(i).getOrgDestCntDesc());
					param.put("dest_conti_desc", model.get(i).getDestContiDesc());
					param.put("dest_cnt_desc", model.get(i).getDestCntDesc());
					param.put("edi_cgo_rmk", model.get(i).getEdiCgoRmk());
					param.put("edi_auto_snd_flg", model.get(i).getEdiAutoSndFlg());
					param.put("cre_usr_id", model.get(i).getCreUsrId());
					param.put("upd_usr_id", model.get(i).getUpdUsrId());					
					insCnt = new SQLExecuter("DEFAULT").executeUpdate((ISQLTemplate) new SetupCreationDBDAOAddGroupCargoCSQL(), param, param);
				}
				if (insCnt == Statement.EXECUTE_FAILED) {
					throw new DAOException("Fail to update No" + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP CARGO 정보를 변경한다.<br>
	 * 
	 * @param searchGroupCargoListVO List<SearchGroupCargoListVO>
	 * @throws DAOException
	 */
	public void modifyGroupCargos(List<SearchGroupCargoListVO> searchGroupCargoListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchGroupCargoListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyGroupCargoUSQL(), searchGroupCargoListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI GROUP CARGO 정보를 삭제한다.<br>
	 * 
	 * @param searchGroupCargoListVO List<SearchGroupCargoListVO>
	 * @throws DAOException
	 */
	public void removeGroupCargos(List<SearchGroupCargoListVO> searchGroupCargoListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchGroupCargoListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveGroupCargoDSQL(), searchGroupCargoListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI SETUP LOGISTICS화면에서 EDI TRADE PARTNER SUB LINK 정보를 가져온다<br>
	 * 
	 * @param subLnkDivCd String
	 * @param subLnkCd String
	 * @param portCd String
	 * @return List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchBkgEdiTrdPrnrSubLnkListVO> searchSetupLogisticsMainList(String subLnkDivCd, String subLnkCd, String portCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchBkgEdiTrdPrnrSubLnkListVO> searchBkgEdiTrdPrnrSubLnkListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("prnr_sub_lnk_div_cd", subLnkDivCd);
			param.put("prnr_sub_lnk_cd", subLnkCd);
			param.put("prnr_port_cd", portCd);
			
			vparam.put("prnr_sub_lnk_div_cd", subLnkDivCd);
			vparam.put("prnr_sub_lnk_cd", subLnkCd);
			vparam.put("prnr_port_cd", portCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkListVORSQL(), param, vparam);
			
			searchBkgEdiTrdPrnrSubLnkListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchBkgEdiTrdPrnrSubLnkListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchBkgEdiTrdPrnrSubLnkListVO;
	}

	/**
	 * EDI SETUP LOGISTICS화면에서 BKG EDI SUB LNK MSG 정보를 가져온다<br>
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiSubLnkMsgListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchBkgEdiSubLnkMsgListVO> searchSubLinkMsgList(String trdPrnrSubLnkSeq) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			param.put("trd_prnr_sub_lnk_seq", trdPrnrSubLnkSeq);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchBkgEdiSubLnkMsgListVORSQL(), param, null);
			
			searchBkgEdiSubLnkMsgListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchBkgEdiSubLnkMsgListVO.class);
			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchBkgEdiSubLnkMsgListVO;
	}

	/**
	 * EDI SETUP LOGISTICS화면에서 EDI PARTNER PORT LANE 정보를 가져온다<br>
	 * 
	 * @param trdPrnrSubLnkSeq String
	 * @return List<SearchBkgEdiPrnrPortLaneListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchBkgEdiPrnrPortLaneListVO> searchPartnerPortLaneList(String trdPrnrSubLnkSeq) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			param.put("trd_prnr_sub_lnk_seq", trdPrnrSubLnkSeq);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchBkgEdiPrnrPortLaneListVORSQL(), param, null);
			
			searchBkgEdiPrnrPortLaneListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchBkgEdiPrnrPortLaneListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchBkgEdiPrnrPortLaneListVO;
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK SEQUENCE(MAX+1) 정보를 가져온다<br>
	 * 
	 * @return int
	 * @throws DAOException
	 */
	public int searchBkgEdiTrdPrnrSubLnkSeq() throws DAOException {
		DBRowSet dbRowset = null;
		int subLnkSeq = 0;
	
		try{
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkSeqRSQL(), null, null);
			if(dbRowset.next()) {
				subLnkSeq = dbRowset.getInt("trd_prnr_sub_lnk_seq");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return subLnkSeq;
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK 정보를 저장한다(입력)<br>
	 * 
	 * @param searchBkgEdiTrdPrnrSubLnkListVO List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @throws DAOException
	 */
	public void addTradePartnerSubLinks(List<SearchBkgEdiTrdPrnrSubLnkListVO> searchBkgEdiTrdPrnrSubLnkListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchBkgEdiTrdPrnrSubLnkListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddTradePartnerSubLinkCSQL(), searchBkgEdiTrdPrnrSubLnkListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK 정보를 변경한다.<br>
	 * 
	 * @param searchBkgEdiTrdPrnrSubLnkListVO List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @throws DAOException
	 */
	public void modifyTradePartnerSubLinks(List<SearchBkgEdiTrdPrnrSubLnkListVO> searchBkgEdiTrdPrnrSubLnkListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchBkgEdiTrdPrnrSubLnkListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyTradePartnerSubLinkUSQL(), searchBkgEdiTrdPrnrSubLnkListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK 정보를 삭제한다.<br>
	 * 
	 * @param searchBkgEdiTrdPrnrSubLnkListVO List<SearchBkgEdiTrdPrnrSubLnkListVO>
	 * @throws DAOException
	 */
	public void removeTradePartnerSubLinks(List<SearchBkgEdiTrdPrnrSubLnkListVO> searchBkgEdiTrdPrnrSubLnkListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchBkgEdiTrdPrnrSubLnkListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveTradePartnerSubLinkDSQL(), searchBkgEdiTrdPrnrSubLnkListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI SUB LNK MSG에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param subLnkSeq String
	 * @param msgTpId String
	 * @param msgIndCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupSubLinkMsg(String subLnkSeq, String msgTpId, String msgIndCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("trd_prnr_sub_lnk_seq", subLnkSeq);
			param.put("edi_msg_tp_id", msgTpId);
			param.put("edi_msg_ind_cd", msgIndCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupSubLinkMsgRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * BKG EDI SUB LNK MSG 정보를 저장한다(입력)<br>
	 * 
	 * @param searchBkgEdiSubLnkMsgListVO List<SearchBkgEdiSubLnkMsgListVO>
	 * @throws DAOException
	 */
	public void addSubLinkMsgs(List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchBkgEdiSubLnkMsgListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddSubLinkMsgCSQL(), searchBkgEdiSubLnkMsgListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI SUB LNK MSG 정보를 변경한다.<br>
	 * 
	 * @param searchBkgEdiSubLnkMsgListVO List<SearchBkgEdiSubLnkMsgListVO>
	 * @throws DAOException
	 */
	public void modifySubLinkMsgs(List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchBkgEdiSubLnkMsgListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifySubLinkMsgUSQL(), searchBkgEdiSubLnkMsgListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * BKG EDI SUB LNK MSG 정보를 삭제한다.<br>
	 * 
	 * @param searchBkgEdiSubLnkMsgListVO List<SearchBkgEdiSubLnkMsgListVO>
	 * @throws DAOException
	 */
	public void removeSubLinkMsgs(List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchBkgEdiSubLnkMsgListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveSubLinkMsgDSQL(), searchBkgEdiSubLnkMsgListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK 정보에 해당하는 BKG EDI SUB LNK MSG 정보 전체를 삭제한다.<br>
	 * 
	 * @param searchBkgEdiSubLnkMsgListVO List<SearchBkgEdiSubLnkMsgListVO>
	 * @throws DAOException
	 */
	public void removeAllSubLinkMsgs(List<SearchBkgEdiSubLnkMsgListVO> searchBkgEdiSubLnkMsgListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchBkgEdiSubLnkMsgListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveAllSubLinkMsgDSQL(), searchBkgEdiSubLnkMsgListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI PARTNER PORT LANE에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param subLnkSeq String
	 * @param slanCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupPartnerPortLane(String subLnkSeq, String slanCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("trd_prnr_sub_lnk_seq", subLnkSeq);
			param.put("slan_cd", slanCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupPartnerPortLaneRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * EDI PARTNER PORT LANE 정보를 저장한다(입력)<br>
	 * 
	 * @param searchBkgEdiPrnrPortLaneListVO List<SearchBkgEdiPrnrPortLaneListVO>
	 * @throws DAOException
	 */
	public void addPartnerPortLanes(List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchBkgEdiPrnrPortLaneListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddPartnerPortLaneCSQL(), searchBkgEdiPrnrPortLaneListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI PARTNER PORT LANE 정보를 변경한다.<br>
	 * 
	 * @param searchBkgEdiPrnrPortLaneListVO List<SearchBkgEdiPrnrPortLaneListVO>
	 * @throws DAOException
	 */
	public void modifyPartnerPortLanes(List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchBkgEdiPrnrPortLaneListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyPartnerPortLaneUSQL(), searchBkgEdiPrnrPortLaneListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI PARTNER PORT LANE 정보를 삭제한다.<br>
	 * 
	 * @param searchBkgEdiPrnrPortLaneListVO List<SearchBkgEdiPrnrPortLaneListVO>
	 * @throws DAOException
	 */
	public void removePartnerPortLanes(List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchBkgEdiPrnrPortLaneListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemovePartnerPortLaneDSQL(), searchBkgEdiPrnrPortLaneListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI TRADE PARTNER SUB LINK 정보에 해당하는 EDI PARTNER PORT LANE 정보 전체를 삭제한다.<br>
	 * 
	 * @param searchBkgEdiPrnrPortLaneListVO List<SearchBkgEdiPrnrPortLaneListVO>
	 * @throws DAOException
	 */
	public void removeAllPartnerPortLanes(List<SearchBkgEdiPrnrPortLaneListVO> searchBkgEdiPrnrPortLaneListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchBkgEdiPrnrPortLaneListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveAllPartnerPortLaneDSQL(), searchBkgEdiPrnrPortLaneListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI YARD 정보를 가져온다<br>
	 * 
	 * @param ydCd String
	 * @return List<SearchYardListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchYardListVO> searchYardList(String ydCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchYardListVO> searchYardListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("yd_cd", ydCd);
			vparam.put("yd_cd", ydCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchYardListVORSQL(), param, vparam);
			
			searchYardListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchYardListVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchYardListVO;
	}

	/**
	 * EDI YARD에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param ydCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupYard(String ydCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("yd_cd", ydCd);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupYardRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * EDI YARD 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param searchYardListVO List<SearchYardListVO>
	 * @throws DAOException
	 */
	public void addYards(List<SearchYardListVO> searchYardListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchYardListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddYardCSQL(), searchYardListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI YARD 정보를 변경한다.<br>
	 * 
	 * @param searchYardListVO List<SearchYardListVO>
	 * @throws DAOException
	 */
	public void modifyYards(List<SearchYardListVO> searchYardListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchYardListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyYardUSQL(), searchYardListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * EDI YARD 정보를 삭제한다.<br>
	 * 
	 * @param searchYardListVO List<SearchYardListVO>
	 * @throws DAOException
	 */
	public void removeYards(List<SearchYardListVO> searchYardListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchYardListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveYardDSQL(), searchYardListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * CUSTOMER SCHEDULE EDI SETUP 정보를 가져온다<br>
	 * 
	 * @param stupId String
	 * @param msgNm String
	 * @param svcTpNm String
	 * @return List<SearchCustomerScheduleListVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SearchCustomerScheduleListVO> searchCustomerScheduleList(String stupId, String msgNm, String svcTpNm) throws DAOException {
		DBRowSet dbRowset = null;
		List<SearchCustomerScheduleListVO> searchCustomerScheduleListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("edi_stup_id", stupId);
			param.put("edi_msg_nm", msgNm);
			param.put("edi_svc_tp_nm", svcTpNm);
			
			vparam.put("edi_stup_id", stupId);
			vparam.put("edi_msg_nm", msgNm);
			vparam.put("edi_svc_tp_nm", svcTpNm);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchCustomerScheduleListVORSQL(), param, vparam);
			
			searchCustomerScheduleListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchCustomerScheduleListVO.class);
			
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchCustomerScheduleListVO;
	}
	
	/**
	 * CUSTOMER SCHEDULE EDI SETUP 정보를 삭제한다.<br>
	 * 
	 * @param searchCustomerScheduleListVO List<SearchCustomerScheduleListVO>
	 * @throws DAOException
	 */
	public void removeCustomerSchedules(List<SearchCustomerScheduleListVO> searchCustomerScheduleListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchCustomerScheduleListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveCustomerScheduleDSQL(), searchCustomerScheduleListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * CUSTOMER SCHEDULE EDI SETUP에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param ediStupId String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupCustomerSchedule(String ediStupId) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("edi_stup_id", ediStupId);
	
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupCustomerScheduleRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * CUSTOMER SCHEDULE EDI SETUP 정보를 저장한다(입력 / 수정 / 삭제)<br>
	 * 
	 * @param searchCustomerScheduleListVO List<SearchCustomerScheduleListVO>
	 * @throws DAOException
	 */
	public void addCustomerSchedules(List<SearchCustomerScheduleListVO> searchCustomerScheduleListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchCustomerScheduleListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddCustomerScheduleCSQL(), searchCustomerScheduleListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * CUSTOMER SCHEDULE EDI SETUP 정보를 변경한다.<br>
	 * 
	 * @param searchCustomerScheduleListVO List<SearchCustomerScheduleListVO>
	 * @throws DAOException
	 */
	public void modifyCustomerSchedules(List<SearchCustomerScheduleListVO> searchCustomerScheduleListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchCustomerScheduleListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyCustomerScheduleUSQL(), searchCustomerScheduleListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for customer) 정보를 가져온다<br>
	 * 
	 * @param orgEdiStsCd String
	 * @param preEdiGrpCd String
	 * @param pstEdiGrpCd String
	 * @return List<CargoStatusForCustomerVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<CargoStatusForCustomerVO> searchCargoStatusForCustomerList(String orgEdiStsCd, String preEdiGrpCd, String pstEdiGrpCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<CargoStatusForCustomerVO> searchCargoStatusForCustomerListVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("org_edi_sts_cd", orgEdiStsCd);
			param.put("pre_edi_grp_cd", preEdiGrpCd);
			param.put("pst_edi_grp_cd", pstEdiGrpCd);
			
			vparam.put("org_edi_sts_cd", orgEdiStsCd);
			vparam.put("pre_edi_grp_cd", preEdiGrpCd);
			vparam.put("pst_edi_grp_cd", pstEdiGrpCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchCargoStatusForCustomerListRSQL(), param, vparam);
			searchCargoStatusForCustomerListVO = (List)RowSetUtil.rowSetToVOs(dbRowset, CargoStatusForCustomerVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return searchCargoStatusForCustomerListVO;
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for customer) 정보를 삭제한다.<br>
	 * 
	 * @param searchCargoStatusForCustomerListVO List<CargoStatusForCustomerVO>
	 * @throws DAOException
	 */
	public void removeCargoStatusForCustomer(List<CargoStatusForCustomerVO> searchCargoStatusForCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(searchCargoStatusForCustomerListVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveCargoStatusForCustomerDSQL(), searchCargoStatusForCustomerListVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for customer)에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param orgEdiStsCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupCargoStatusForCustomer(String orgEdiStsCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("org_edi_sts_cd", orgEdiStsCd);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupCargoStatusForCustomerRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for customer) 정보를 저장한다.<br>
	 * 
	 * @param searchCargoStatusForCustomerListVO List<CargoStatusForCustomerVO>
	 * @throws DAOException
	 */
	public void addCargoStatusForCustomer(List<CargoStatusForCustomerVO> searchCargoStatusForCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(searchCargoStatusForCustomerListVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddCargoStatusForCustomerCSQL(), searchCargoStatusForCustomerListVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for customer) 정보를 변경한다.<br>
	 * 
	 * @param searchCargoStatusForCustomerListVO List<CargoStatusForCustomerVO>
	 * @throws DAOException
	 */
	public void modifyCargoStatusForCustomer(List<CargoStatusForCustomerVO> searchCargoStatusForCustomerListVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(searchCargoStatusForCustomerListVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyCargoStatusForCustomerUSQL(), searchCargoStatusForCustomerListVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for US cargo release) 정보를 가져온다<br>
	 * 
	 * @param ediOrgStsCd String
	 * @return List<CargoStatusForUSReleaseVO>
	 * @throws DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<CargoStatusForUSReleaseVO> searchCargoStatusForUSReleaseList(String ediOrgStsCd) throws DAOException {
		DBRowSet dbRowset = null;
		List<CargoStatusForUSReleaseVO> cargoStatusForUSReleaseVO = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> vparam = new HashMap<String, Object>();

		try{
			param.put("edi_org_sts_cd", ediOrgStsCd);
			vparam.put("edi_org_sts_cd", ediOrgStsCd);
		
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOSearchCargoStatusForUSReleaseListRSQL(), param, vparam);
			cargoStatusForUSReleaseVO = (List)RowSetUtil.rowSetToVOs(dbRowset, CargoStatusForUSReleaseVO.class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		
		return cargoStatusForUSReleaseVO;
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for US cargo release) 정보를 삭제한다.<br>
	 * 
	 * @param cargoStatusForUSReleaseVO List<CargoStatusForUSReleaseVO>
	 * @throws DAOException
	 */
	public void removeCargoStatusForUSRelease(List<CargoStatusForUSReleaseVO> cargoStatusForUSReleaseVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int delCnt[] = null;
			if(cargoStatusForUSReleaseVO.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAORemoveCargoStatusForUSReleaseDSQL(), cargoStatusForUSReleaseVO, null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for US cargo release)에 중복데이타가 존재하는지 체크한다<br>
	 * 
	 * @param ediOrgStsCd String
	 * @param ediPreSntStsCd String
	 * @param ediEvntStsCd String
	 * @return int
	 * @throws DAOException
	 */
	public int checkDupCargoStatusForUSRelease(String ediOrgStsCd, String ediPreSntStsCd, String ediEvntStsCd) throws DAOException {
		DBRowSet dbRowset = null;
		int cnt = 0;
		Map<String, Object> param = new HashMap<String, Object>();
	
		try{
			param.put("edi_org_sts_cd", ediOrgStsCd);
			param.put("edi_pre_snt_sts_cd", ediPreSntStsCd);
			param.put("edi_evnt_sts_cd", ediEvntStsCd);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SetupCreationDBDAOCheckDupCargoStatusForUSReleaseRSQL(), param, null);
			if(dbRowset.next()) {
				cnt = dbRowset.getInt("CNT");
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return cnt;
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for US cargo release) 정보를 저장한다.<br>
	 * 
	 * @param cargoStatusForUSReleaseVO List<CargoStatusForUSReleaseVO>
	 * @throws DAOException
	 */
	public void addCargoStatusForUSRelease(List<CargoStatusForUSReleaseVO> cargoStatusForUSReleaseVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int insCnt[] = null;
			if(cargoStatusForUSReleaseVO.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOAddCargoStatusForUSReleaseCSQL(), cargoStatusForUSReleaseVO, null);
				for(int i = 0; i < insCnt.length; i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Cargo Tracking Info.(Non physical event for US cargo release) 정보를 변경한다.<br>
	 * 
	 * @param cargoStatusForUSReleaseVO List<CargoStatusForUSReleaseVO>
	 * @throws DAOException
	 */
	public void modifyCargoStatusForUSRelease(List<CargoStatusForUSReleaseVO> cargoStatusForUSReleaseVO) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("");
			int updCnt[] = null;
			if(cargoStatusForUSReleaseVO.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new SetupCreationDBDAOModifyCargoStatusForUSReleaseUSQL(), cargoStatusForUSReleaseVO, null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler("COM12244",new String[]{}).getUserMessage(), se);
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

}
