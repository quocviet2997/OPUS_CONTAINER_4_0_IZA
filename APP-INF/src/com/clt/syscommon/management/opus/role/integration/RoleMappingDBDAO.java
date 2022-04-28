/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleDBDAO.java
*@FileTitle : 역할 매핑
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
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.opus.role.basic.RoleBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys008Event;
import com.clt.syscommon.management.opus.role.event.ComSys011Event;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see RoleBCImpl 참조
 * @since J2EE 1.4
 */
public class RoleMappingDBDAO extends DBDAOSupport {

	/**
	 * role의 모든 목록을 가져온다.<br>
	 * 
	 * @param e 이벤트
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchUserRoleList(Event e) throws DAOException {
		DBRowSet dRs = null;
		ComSys008Event event = (ComSys008Event) e;
		try {
			Map<String,String> params = new HashMap<String,String>();
			params.put("usr_id", event.getUsrId());
			params.put("login_usr_id", event.getSignOnUserAccount().getUsr_id());
			
			Map<String,String> velParams = new HashMap<String,String>();
			velParams.put("search_flag", event.getSearchFlag());
			velParams.put("usr_role_adm_mtch", event.getUsrRoleAdmMtch());
			velParams.put("login_usr_auth_tp_cd", event.getSignOnUserAccount().getUsr_auth_tp_cd());

			dRs = new SQLExecuter("SysComDB").executeQuery(new RoleMappingDAOUSERROLERSQL(), params, velParams);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return dRs;
	}
	/**
	 * role의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param ComUsrRoleMtchVO[] models
	 * @param SignOnUserAccount account
	 * @param String adminFlag
	 * @see ComSys008Event
	 * @throws DAOException
	 */
	public void multiComUsrRoleMtchVO(ComUsrRoleMtchVO[] models, SignOnUserAccount account, String adminFlag) throws DAOException {
		Collection<ComUsrRoleMtchVO> insModels =new ArrayList<ComUsrRoleMtchVO>();
		Collection<ComUsrRoleMtchVO> delModels =new ArrayList<ComUsrRoleMtchVO>();

		Map<String,Object> velParams = new HashMap<String,Object>();
		velParams.put("usr_role_adm_mtch", adminFlag);

		try {
			ComUsrRoleMtchVO model = null;
			int cnt = models.length;
			for(int i=0;i<cnt;i++){
				model = (ComUsrRoleMtchVO)models[i];
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
			int[] insCnt1 = null;
			int[] delCnt1 = null;

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(insModels.size()>0){
				insCnt = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchCSQL(), insModels,velParams);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
				insCnt1 = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchHisCSQL(), insModels,velParams);
				for(int i=0;i<insCnt1.length;i++){
					if(insCnt1[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchDSQL(), delModels,velParams);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
				}
				delCnt1 = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchHisUSQL(), delModels,velParams);
				for(int i=0;i<delCnt1.length;i++){
					if(delCnt1[i]== Statement.EXECUTE_FAILED)
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
	 * role의 모든 목록을 가져온다.<br>
	 * 
	 * @param e 이벤트
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchProgRoleList(Event e) throws DAOException {
		ComSys011Event event=(ComSys011Event)e;
		DBRowSet dRs = null;
		String pgm_no = event.getProg_id();

		Map<String, Object> param = new HashMap<String, Object>();
		
		param.put("pgm_no", pgm_no);
		param.put("fcmd", "" + e.getFormCommand().getCommand());
		
		
		try {
			dRs = new SQLExecuter("SysComDB").executeQuery(new RoleMappingDAOSearchProgRoleListRSQL(), param,param);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return dRs;
	}
	
	/**
	 * User Role 이력을 가져온다.<br>
	 * 
	 * @param e 이벤트
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchUserRoleHistoryList(Event e) throws DAOException {
		DBRowSet dRs = null;
		ComSys008Event event = (ComSys008Event) e;
		try {
			Map<String,String> params = new HashMap<String,String>();
			params.put("usr_id", event.getUsrId());


			dRs = new SQLExecuter("SysComDB").executeQuery(new UserMappingDAOSearchComUsrRoleMtchHisRSQL(), params, null);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return dRs;
	}

}