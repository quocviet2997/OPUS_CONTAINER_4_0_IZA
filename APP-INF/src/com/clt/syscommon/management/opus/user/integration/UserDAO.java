/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserDAO.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.CryptUtil;
import com.clt.framework.component.util.DateTime;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.user.basic.UserBCImpl;
import com.clt.syscommon.management.opus.user.vo.ComUserInfoVO;
import com.clt.syscommon.management.opus.user.vo.ComUserVO;
import com.clt.syscommon.management.opus.user.vo.ComUsrPgmMtchVO;


/**
 * NIS2010 UserDAO <br>
 * - NIS2010-UserManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author KyungBum Kim
 * @see UserBCImpl 참조
 * @since J2EE 1.4
 */
public class UserDAO extends DBDAOSupport {

	private static transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(UserDAO.class);
	
	/**
	 * UserDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param ComUserVO comuservo 데이타 모델
	 * @param SignOnUserAccount account
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet searchComUserVO(ComUserVO comuservo, SignOnUserAccount account) throws DAOException {
		DBRowSet dbRowset = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(comuservo != null){
				String rHQ = searchUserHeadQuarterInfo(account.getUsr_id());
				Map<String, String> mapVO = comuservo .getColumnValues();
			
				param.putAll(mapVO);
				param.put("s_usr_id", account.getUsr_id());
				param.put("id_div", comuservo.getCreUsrId());
				param.put("RHQ", rHQ);
				velParam.putAll(mapVO);
				velParam.put("id_div", comuservo.getCreUsrId());
				velParam.put("auth_cd", account.getUsr_auth_tp_cd());
				velParam.put("RHQ", rHQ);

				dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOComUserVORSQL(), param, velParam);
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	/**
	 * UserDAO의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param ComUsrPgmMtchVO[] comUsrPgmMtchVOs
	 * @param SignOnUserAccount account
	 * @see UserDAOEvent
	 * @throws DAOException
	 */
	public void multiComUsrPgmMtch(ComUsrPgmMtchVO[] comUsrPgmMtchVOs, SignOnUserAccount account) throws DAOException,Exception {
		Collection<ComUsrPgmMtchVO> insModels =new ArrayList<ComUsrPgmMtchVO>();
		Collection<ComUsrPgmMtchVO> delModels =new ArrayList<ComUsrPgmMtchVO>();

		try {
			ComUsrPgmMtchVO model = null;
			int cnt = comUsrPgmMtchVOs.length;
			for(int i=0;i<cnt;i++){
				model = (ComUsrPgmMtchVO)comUsrPgmMtchVOs[i];
				// 세션 정보 설정
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("I")) {
						insModels.add(model);
					}else{
						delModels.add(model);
					}
				}
			}
			int[] insCnt = null;
			int[] delCnt = null;
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(insModels.size()>0){
				insCnt = sqlExe.executeBatch(new UserDAOComUsrPgmMtchCSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new UserDAOComUsrPgmMtchDSQL(), delModels,null);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
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
	 * main 화면에 대한 update 이벤트 처리<br>
	 * 
	 * @param ComUserVO comuservo
	 * @param SignOnUserAccount account
	 * @exception DAOException,Exception
	 */
	public void updateComUsrMain(ComUserVO comuservo, SignOnUserAccount account) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			comuservo.setUsrId(account.getUsr_id());
			comuservo.setUpdUsrId(account.getUsr_id());
			sqlExe.executeUpdate((ISQLTemplate)new UserDAOComUsrMainUSQL(), comuservo.getColumnValues(), null);
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * user 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @exception DAOException, Exception
	 */
public void multiComUserVO(ComUserVO[] comuservo, SignOnUserAccount account) throws DAOException,Exception {
		
		ArrayList<ComUserVO> insModels = new ArrayList<ComUserVO>();
		ArrayList<ComUserVO> updModels = new ArrayList<ComUserVO>();
		ArrayList<ComUserVO> delModels = new ArrayList<ComUserVO>();

		ArrayList<ComUserVO> updModelsBypasswordChange = new ArrayList<ComUserVO>();
		
		try {
			ComUserVO model = null;
			ComUserVO hisUserModel = null;
			
			String newPassword ="";
			String oldPassword ="";
			
			for (int i = 0; i < comuservo .length; i++) {
				model = comuservo[i];
				// 세션 정보 설정
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
								
				// add 2014.10.28.
				newPassword =model.getUsrPwd();
				oldPassword =model.getUsrOldPwd();				
				if( "Y".equalsIgnoreCase(model.getUsrPwdChgFlg()) ){
					model.setUsrPwd(CryptUtil.encryptString(newPassword) );
				}
							
				if (model.getIbflag().length() > 0) {
					if ("I".equalsIgnoreCase(model.getIbflag())) {
						model.setUsrPwdCreDt(DateTime.getFormatDate(new Date (), "yyyyMMddHHmmss"));
						model.setIfMnplCd("I");
						insModels.add(model);	
						
					} else if ("U".equalsIgnoreCase(model.getIbflag())) {
						
						// Case 1. Pass가  변경된 경우
						if( "Y".equalsIgnoreCase(model.getUsrPwdChgFlg()) ){							
							
							// Step 1.  정부 수정	
							model.setUsrPwdCreDt(DateTime.getFormatDate(new Date (), "yyyyMMddHHmmss"));
							model.setUsrLckDt("");
							model.setUsrLginFaldKnt("-1");
							model.setIfMnplCd("U");
							updModels.add(model);
							
							// Step 2. Pass의  Log 저장
							hisUserModel = (ComUserVO) model.clone() ;
							hisUserModel.setHisCount( getHisCount() );
							hisUserModel.setUsrPwd( oldPassword );						 	
							updModelsBypasswordChange.add(hisUserModel);							
							
						}else{
							// Case 2. Pass외 변경	
							model.setIfMnplCd("U");
							updModels.add(model);
						}			
																		
					} else if ("D".equalsIgnoreCase(model.getIbflag())) {
						model.setUseFlg("N");
						model.setIfMnplCd("D");
						delModels.add(model);
					}
				}
			}
			int[] insCnt = null;
			int[] updCnt = null;
			int[] delCnt = null;

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserVOUSQL(), updModels,null);
				for(int i=0;i<updCnt.length;i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
				updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserIbisIfCSQL(), updModels,null);
			}
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserVOUSQL(), delModels,null);
				//delCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserVODSQL(), delModels,null);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
				}
				delCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserIbisIfCSQL(), delModels,null);
			}
			
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserVOCSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
				insCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserIbisIfCSQL(), insModels,null);
			}
			
			
			if(updModelsBypasswordChange.size() > 0){
							
			    // Step 1. Delete
				delCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPwdHisByHisCountDSQL(), updModelsBypasswordChange,null);
			    
			   // Step 2. Insert
			   insCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPwdHisCSQL(), updModelsBypasswordChange,null);
					for(int i=0;i<insCnt.length;i++){
							if(insCnt[i]== Statement.EXECUTE_FAILED)
								throw new DAOException("Fail to update No"+ i + " SQL");
						}
			}
			

		} catch (SQLException se) {
			if(se.getErrorCode() == 1){
				throw new DAOException(new ErrorHandler("COM12247").getMessage());
			}
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	

	/**
	 * Office 리스트 조회 <br>
	 * 
	 * @param SignOnUserAccount account
	 * @param String rhq
	 * @param String arOfcCd
	 * @return DBRowSet
	 * @exception DAOException
	 */
	public DBRowSet searchMdmOrganization(SignOnUserAccount account, String rhq, String arOfcCd) throws DAOException {
		DBRowSet dbRowset = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			param.put("ofc_cd",account.getOfc_cd());
			param.put("usr_auth_tp_cd", account.getUsr_auth_tp_cd());
			param.put("rhq", rhq);
			param.put("ar_ofc_cd", arOfcCd);
			
			//Dynamic query 테스트하기 위해 일부러 column list를 동적으로 생성함.
			List<String> cols  = new ArrayList<String>();
			cols.add("level");
			cols.add("ofc_cd");
			cols.add("ofc_eng_nm");
			cols.add("ofc_krn_nm");
			cols.add("prnt_ofc_cd");
			
			param.put("allcols", cols);
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOMdmOrganizationRSQL(), param, param);

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * User Program 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @param String ofcCd
	 * @param String pgmNo
	 * @param String loginUsrId
	 * @return DBRowSet
	 * @exception DAOException
	 */
	public DBRowSet searchUserProgramMapping(String usrId, String ofcCd, String pgmNo, String loginUsrId) throws DAOException {
		DBRowSet dbRowset = null;
		
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			param.put("usr_id",usrId);
			param.put("pgm_no",pgmNo);
			param.put("ofc_cd", ofcCd);
			param.put("login_usr_id", loginUsrId);
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOComUsrPgmMtchRSQL(), param, param);

		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
	
	/**
	 * 유저의 조직정보 중 지역본부코드를 가져온다.<br>
	 * 
	 * @param String usrId
	 * @return String headQuarterCd
	 * @exception DAOException
	 */
	public String searchUserHeadQuarterInfo(String usrId) throws DAOException {
		String headQuarterCd = null;
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("usr_id", usrId);
		try {
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new MdmOrganizationDAOGetHeadQuarterCodeRSQL(), param, null);
			if ( dbRowset.next() ) headQuarterCd = dbRowset.getString("RHQ");
		} catch (SQLException e) {
			log.error(e.getMessage(),e);
			throw new DAOException(new ErrorHandler(e).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return headQuarterCd;
	}
	
	/**
	 * User Info의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param String usrId
	 * @return List<ComUserInfoVO>
	 * @throws DAOException
	 */
	public List<ComUserInfoVO> getComUsrInfo(String userId) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComUserInfoVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		try{
			param.put("usr_id", userId);
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDBDAOInfoRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUserInfoVO.class);
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
	 * 유저의 조직정보 중 지역본부코드를 가져온다.<br>
	 * 
	 * @param String ofcCd
	 * @return String
	 * @exception DAOException
	 */
	public String searchUserHeadQuarterInfoByOfcCd(String ofcCd) throws DAOException {
		String headQuarterCd = null;
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("ofc_cd", ofcCd);
		try {
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new MdmOrganizationDAOHeadQuarterCodeByOfcCdRSQL(), param, null);
			if ( dbRowset.next() ) headQuarterCd = dbRowset.getString("RHQ");
		} catch (SQLException e) {
			log.error(e.getMessage(),e);
			throw new DAOException(new ErrorHandler(e).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return headQuarterCd;
	}
	
	/**
	 * 유저의 조직정보 중 지역본부코드를 가져온다.<br>
	 * 
	 * @param String usrId
	 * @return String 
	 * @exception DAOException
	 */
	public String searchUserParentOffice(String usrId) throws DAOException {
		String headQuarterCd = null;
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("usr_id", usrId);
		try {
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOParentOfficeRSQL(), param, null);
			if ( dbRowset.next() ) headQuarterCd = dbRowset.getString("PRNT_OFC_CD");
		} catch (SQLException e) {
			log.error(e.getMessage(),e);
			throw new DAOException(new ErrorHandler(e).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return headQuarterCd;
	}
	
	
	/**
	 * 멀티 이벤트 처리<br>
	 * user 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @exception DAOException
	 */
	public void multiComUserPassHis(ComUserVO[] comuservo, SignOnUserAccount account) throws DAOException {
			
		ArrayList<ComUserVO> updModelsBypasswordChange = new ArrayList<ComUserVO>();
		
		try {
			ComUserVO model = null;
			String oldPasaword ="";
			
			for (int i = 0; i < comuservo .length; i++) {
				model = comuservo[i];
				// 세션 정보 설정
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
				
				oldPasaword=model.getUsrPwd();
			
				if (model.getIbflag().length() > 0) {
						// Step 2. Pass의  Log 저장
						if( model.getUsrNewPwd() != null && model.getUsrNewPwd().length() > 0 ){
							model.setUsrPwd( CryptUtil.encryptString(oldPasaword));
							model.setHisCount( getHisCount());
						    updModelsBypasswordChange.add(model);
						}						
					
				}
			}
			
			
			int[] dltCnt = null;
			int[] updCnt = null;
				
			if(updModelsBypasswordChange.size() > 0){				
				SQLExecuter sqlExe = new SQLExecuter("SysComDB");	
							
			     // Step 1. Delete
			    dltCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPwdHisByHisCountDSQL(), updModelsBypasswordChange,null);
			    				
				// Step 2. Insert
				updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPwdHisCSQL(), updModelsBypasswordChange,null);
					for(int i=0;i<updCnt.length;i++){
							if(updCnt[i]== Statement.EXECUTE_FAILED)
								throw new DAOException("Fail to update No"+ i + " SQL");
						}
					
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	
	/**
	 * User Info의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param String usrId
	 * @return List<ComUserVO>
	 * @throws DAOException
	 */
	public List<ComUserVO> getComUserPassHis(String userId) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComUserVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		try{
			
			param.put("usr_id",    userId);
			param.put("his_count", getHisCount() );
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOComUsrPwdHisRSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUserVO.class);
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
	 * 
	 * modifyUserPasswordInfo
	 * 
	 * @param comuservo
	 * @param account
	 * @throws DAOException
	 */
	 @SuppressWarnings("unchecked")
	public void modifyUserPasswordInfo(ComUserVO[] comuservo , SignOnUserAccount account) throws DAOException {
		try {
			ArrayList<ComUserVO> updModelsBypasswordChange = new ArrayList<ComUserVO>();
			ComUserVO model = comuservo[0];
			// 세션 정보 설정
			model.setUpdUsrId(account.getUsr_id());
			model.setUsrPwd(CryptUtil.encryptString( comuservo[0].getUsrNewPwd() ));
			model.setHisCount( getHisCount());
			updModelsBypasswordChange.add(model);		
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");	
			int[] updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOModifyUserPasswordInfoUSQL(), updModelsBypasswordChange,null);
			for(int i=0;i<updCnt.length;i++){
				if(updCnt[i]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No"+ i + " SQL");
			}
				
			DBRowSet dbRowset = null;
			List<ComUserVO> list = null;
			
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();
			
			param.put("usr_id", comuservo[0].getUsrId());
			param.put("auth_cd", "A");
			velParam.put("usr_id", comuservo[0].getUsrId());
			velParam.put("auth_cd", "A");
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOComUserVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComUserVO.class);
			
			for(int i=0; i < list.size(); i++){
				list.get(i).setIfMnplCd("U");
				list.get(i).setUsrPwd(CryptUtil.encryptString( comuservo[0].getUsrNewPwd() ));
				list.get(i).setCreUsrId(account.getUsr_id());
				list.get(i).setUpdUsrId(account.getUsr_id());
			}
			
			updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUserIbisIfCSQL(), list,null);
			
			for(int i=0;i<updCnt.length;i++){
				if(updCnt[i]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No"+ i + " SQL");
			}
		}
		catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}	
	
	 
	 

	 
	 /**
	 * User Info의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @return String
	 */
	public String getHisCount()  {
		String hisCount="5";
		 if(! "NULL".equals(SiteConfigFactory.get("COM.CLT.PASSWORD.HIS.COUNT", "NULL")))
			    hisCount = SiteConfigFactory.get("COM.CLT.PASSWORD.HIS.COUNT", "NULL");
		 
		return hisCount;
	}
		
	/**
	 * 
	 * searchMdmOrganizationOfcCd
	 * @param toBeValidatedOffcieCode
	 * @return String
	 * @throws DAOException 
	 */
	public String searchMdmOrganizationOfcCd(String toBeValidatedOffcieCode) throws DAOException {
		DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();
		try{			
			param.put("ofc_cd",    toBeValidatedOffcieCode);
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOMdmOrganizationOfcCdRSQL(), param, null);
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
	 * 
	 * searchUserValidation
	 * @param toBeValidatedUserId
	 * @return String
	 * @throws DAOException
	 */
	public String searchUserValidation(String toBeValidatedUserId) throws DAOException {
		DBRowSet dbRowset = null;
		Map<String, Object> param = new HashMap<String, Object>();
		try{			
			param.put("usr_id",    toBeValidatedUserId);
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new UserDAOUserValidationRSQL(), param, null);
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
		
}
