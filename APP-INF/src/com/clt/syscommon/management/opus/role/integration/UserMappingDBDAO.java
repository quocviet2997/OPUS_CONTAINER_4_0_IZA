/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleDBDAO.java
*@FileTitle : 사용자 매핑
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
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.opus.role.event.ComSys009Event;
import com.clt.syscommon.management.opus.role.vo.SearchMdmOrganizationVO;
import com.clt.syscommon.management.opus.role.vo.SearchUserMappingUsersVO;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see RoleBCImpl 참조
 * @since J2EE 1.4
 */
public class UserMappingDBDAO extends DBDAOSupport {

	/**
	 * Role의 모든 목록을 가져온다.<br>
	 * @param SignOnUserAccount account
	 * @return SearchMdmOrganizationVO[] DB 처리 결과
	 * @throws DAOException
	 */
	public SearchMdmOrganizationVO[] searchOfficeList(SignOnUserAccount account) throws DAOException {
		SearchMdmOrganizationVO[] searchMdmOrganizationVOVOs = null;
		// PreparedStatement에 bind 변수를 넣을시 증가되는 변수

		try {
			DBRowSet dRs = null;
			Map<String,Object> param = new HashMap<String,Object>();
			param.put("rhq_ofc_cd", account.getRhq_ofc_cd());
			param.put("usr_auth_tp_cd", account.getUsr_auth_tp_cd());
			
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
	 * Role의 모든 목록을 가져온다.<br>
	 * 
	 * @param SignOnUserAccount account
	 * @param String ofcCd
	 * @param String usrRoleCd
	 * @return SearchUserMappingUsersVO[] DB 처리 결과
	 * @throws DAOException
	 */

	public SearchUserMappingUsersVO[] searchUserList(SignOnUserAccount account, String ofcCd, String usrRoleCd) throws DAOException {
		SearchUserMappingUsersVO[] searchUserMappingUsersVOs = null;

		try {
			DBRowSet dRs = null;
			Map<String,Object> param = new HashMap<String,Object>();
			param.put("usr_role_cd", usrRoleCd);
			param.put("rhq_ofc_cd", account.getRhq_ofc_cd());
			param.put("usr_auth_tp_cd", account.getUsr_auth_tp_cd());
			param.put("ofc_cd", ofcCd);
			
			dRs = new SQLExecuter("SysComDB").executeQuery(new UserMappingDAOComUserRSQL(), param, param);
			List<Object>   list = RowSetUtil.rowSetToVOs(dRs, SearchUserMappingUsersVO.class);
			
			searchUserMappingUsersVOs = (SearchUserMappingUsersVO[])list.toArray(new SearchUserMappingUsersVO[list.size()]);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return searchUserMappingUsersVOs;
	}

	/**
	 * Role의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param ComUsrRoleMtchVO[] models
	 * @param SignOnUserAccount account
	 * @see ComSys009Event
	 * @throws DAOException
	 */
	public void multiComUsrRoleMtchVOS(ComUsrRoleMtchVO[] models, SignOnUserAccount account) throws DAOException {
		Collection<ComUsrRoleMtchVO> insModels =new ArrayList<ComUsrRoleMtchVO>();
		Collection<ComUsrRoleMtchVO> delModels =new ArrayList<ComUsrRoleMtchVO>();

		Map<String,Object> velParams = new HashMap<String,Object>();
		velParams.put("usr_role_adm_mtch", "N");
		
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

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(insModels.size()>0){
				insCnt = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchCSQL(), insModels, velParams);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new UserMappingDAOComUsrRoleMtchDSQL(), delModels, velParams);
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