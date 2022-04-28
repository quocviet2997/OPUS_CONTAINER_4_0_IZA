/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleDBDAO.java
*@FileTitle : 역할관리
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

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleVO;
import com.clt.syscommon.management.opus.role.basic.RoleBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys007Event;
import com.clt.syscommon.management.opus.role.vo.ComUsrRoleConditionVO;
import com.clt.syscommon.management.opus.role.vo.SearchComUsrRoleVO;


/**
 * syscommon-syscommon에 대한 DB 처리를 담당<br>
 * - syscommon-syscommon Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SeongWook Kim
 * @see RoleBCImpl 참조
 * @since J2EE 1.4
 */
public class RoleDBDAO extends DBDAOSupport {

	/**
	 * role의 모든 목록을 가져온다.<br>
	 * @param comUsrRoleConditionVO ComUsrRoleConditionVO 조회조건 
	 * @param SignOnUserAccount account
	 * @return SearchComUsrRoleVO[] DB 처리 결과
	 * @throws DAOException
	 */
	public SearchComUsrRoleVO[] searchRoleList(ComUsrRoleConditionVO comUsrRoleConditionVO, SignOnUserAccount account) throws DAOException {
	
		SearchComUsrRoleVO[] searchComUsrRoleVOs = null;
		try {
			Map<String,String> params = comUsrRoleConditionVO.getColumnValues();
			params.put("usr_id", account.getUsr_id());
			List<AbstractValueObject> voList = new SQLExecuter("SysComDB").executeQuery(new RoleDAOComUsrRoleRSQL(), params, params,SearchComUsrRoleVO.class);
			searchComUsrRoleVOs = (SearchComUsrRoleVO[])voList.toArray(new SearchComUsrRoleVO[voList.size()]);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return searchComUsrRoleVOs;
	}

	/**
	 * role의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param models 여러 데이타 모델
	 * @param SignOnUserAccount account
	 * @see ComSys007Event
	 * @throws DAOException
	 */
	public void multiComUsrRoleVO(ComUsrRoleVO[] models, SignOnUserAccount account) throws DAOException {
		Collection<ComUsrRoleVO> insModels =new ArrayList<ComUsrRoleVO>();
		Collection<ComUsrRoleVO> updModels =new ArrayList<ComUsrRoleVO>();
		Collection<ComUsrRoleVO> delModels =new ArrayList<ComUsrRoleVO>();

		try {
			ComUsrRoleVO model = null;
			int cnt = models.length;
			for(int i=0;i<cnt;i++){
				model = (ComUsrRoleVO)models[i];
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("U")) {
						updModels.add(model);
					} else if (model.getIbflag().equals("D")) {
						delModels.add(model);
					} else if (model.getIbflag().equals("I")) {
						insModels.add(model);
					}
				}
			}
			int[] insCnt = null;
			int[] updCnt = null;
			int[] delCnt = null;

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(insModels.size()>0){
				insCnt = sqlExe.executeBatch(new RoleDAOComUsrRoleCSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(updModels.size()>0){
				updCnt = sqlExe.executeBatch(new RoleDAOComUsrRoleUSQL(), updModels,null);
				for(int i=0;i<updCnt.length;i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new RoleDAOComUsrRoleDSQL(), delModels,null);
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
	 * 부모Role 조회팝업 화면에 대한 모든 목록을 가져온다.<br>
	 * 
	 * @return SearchComUsrRoleVO[] DB 처리 결과
	 * @throws DAOException
	 */
	public SearchComUsrRoleVO[] searchUpperRoleList() throws DAOException {
		SearchComUsrRoleVO[] searchComUsrRoleVOs = null;
		try {
			DBRowSet dRs = null;
			dRs = new SQLExecuter("SysComDB").executeQuery(new RoleDAOComUsrRolePopupRSQL(), null, null);
			List   list = RowSetUtil.rowSetToVOs(dRs, SearchComUsrRoleVO.class);
			
			searchComUsrRoleVOs = (SearchComUsrRoleVO[])list.toArray(new SearchComUsrRoleVO[list.size()]);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return searchComUsrRoleVOs;
	}
	
	/**
	 * user에 해당하는 role의 모든 목록을 가져온다.<br>
	 * @param userId String 유저 아이디
	 * @return ComUsrRoleVO[] DB 처리 결과
	 * @throws DAOException
	 */
	public ComUsrRoleVO[] searchUserRoleList(String userId) throws DAOException {
	
		ComUsrRoleVO[] searchComUsrRoleVOs = null;
		try {
			Map<String,String> params = new HashMap<String, String>();
			params.put("usr_id", userId);
			List<AbstractValueObject> voList = new SQLExecuter("SysComDB").executeQuery(new UserRoleDAOComUsrRoleUtilRSQL(), params, params, ComUsrRoleVO.class);
			searchComUsrRoleVOs = (ComUsrRoleVO[])voList.toArray(new ComUsrRoleVO[voList.size()]);
			
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		return searchComUsrRoleVOs;
	}	
}