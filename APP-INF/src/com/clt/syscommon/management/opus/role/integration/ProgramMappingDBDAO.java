/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ProgramMappingDBDAO.java
*@FileTitle : 프로그램 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComPgmRoleVO;
import com.clt.syscommon.management.opus.role.event.ComSys009Event;
import com.clt.syscommon.management.opus.role.vo.SearchMdmOrganizationVO;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see ProgramMappingBCImpl 참조
 * @since J2EE 1.4
 */
public class ProgramMappingDBDAO extends DBDAOSupport {

	/**
	 * role의 모든 목록을 가져온다.<br>
	 * 
	 * @param String usrAuthTpCd
	 * @return SearchMdmOrganizationVO[]
	 * @throws DAOException
	 */
	
	public SearchMdmOrganizationVO[] searchOfficeList(String usrAuthTpCd) throws DAOException {
		SearchMdmOrganizationVO[] searchMdmOrganizationVOVOs = null;
		// PreparedStatement에 bind 변수를 넣을시 증가되는 변수
//		int i = 1;
		try {
			DBRowSet dRs = null;
			Map<String,Object> param = new HashMap<String,Object>();
			param.put("usr_auth_tp_cd", usrAuthTpCd);
			
			dRs = new SQLExecuter("SysComDB").executeQuery(new UserMappingDAOMdmOrganizationRSQL(), param, param);
			List<Object>   list = RowSetUtil.rowSetToVOs(dRs, SearchMdmOrganizationVO.class);
			
			searchMdmOrganizationVOVOs = (SearchMdmOrganizationVO[])list.toArray(new SearchMdmOrganizationVO[list.size()]);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return searchMdmOrganizationVOVOs;
	}
	
	/**
	 * 모든 Menu 목록을 가져온다.<br>
	 * 
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchMenuList() throws DAOException {
		
		DBRowSet dbRowSet = null;
		
		try{
			String prntPgmNo = SiteConfigFactory.get("COM.CLT.MENU.ROOT.PROGRAM.CODE");
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("prnt_pgm_no", prntPgmNo);
			dbRowSet = new SQLExecuter("SysComDB").executeQuery(new ProgramMappingDAOMENURSQL(),param,param);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		
		return dbRowSet;
		
	}

	/**
	 * role의 모든 목록을 가져온다.<br>
	 * 
	 * @param String pgmNoForm
	 * @param String roleCd
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchProgramList(String pgmNoForm, String roleCd) throws DAOException {
//		ProgramMappingDAOCOM_PROGRAMRSQL
//		pgm_no_form
//		getRoleCd

		DBRowSet dbRowSet = null;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pgm_no_form", pgmNoForm);
		params.put("role_cd", roleCd);
		
		
		try{
			dbRowSet = new SQLExecuter("SysComDB").executeQuery(new ProgramMappingDAOComProgramRSQL(),params,params);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		
		return dbRowSet;
	}

	/**
	 * role의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param models 여러 데이타 모델
	 * @param SignOnUserAccount account
	 * @see ComSys009Event
	 * @throws DAOException
	 */
	public void multiComPgmRoleVO(ComPgmRoleVO[] models, SignOnUserAccount account) throws DAOException {
		Collection<ComPgmRoleVO> insModels =new ArrayList<ComPgmRoleVO>();
		Collection<ComPgmRoleVO> delModels =new ArrayList<ComPgmRoleVO>();

		try {
			ComPgmRoleVO model = null;
			int cnt = models.length;
			for(int i=0;i<cnt;i++){
				model = (ComPgmRoleVO)models[i];
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("U")) {
						if(model.getCheckVal().equals("1")){
							insModels.add(model);
						}else{
							delModels.add(model);
						}
					}
				}
			}
			int[] insCnt = null;
			int[] delCnt = null;

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(insModels.size()>0){
				insCnt = sqlExe.executeBatch(new ProgramMappingDAOComPgmROLECSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new ProgramMappingDAOComPgmROLEDSQL(), delModels,null);
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
}