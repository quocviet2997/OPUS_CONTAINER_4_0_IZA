/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : scheduleDBDAO.java
 *@FileTitle : schedule
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2008.12.23
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2008.12.23 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.superuser.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.util.UserRoleUtil;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;

/**
 * NIS2010-schedule Business Logic Basic Command implementation<br>
 * - NIS2010-schedule에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author In Sun Jung
 * @see scheduleBCImpl 참조
 * @since J2EE 1.4
 */
public class SuperUserDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7597203228200560750L;


	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return List<AccessHistoryVO>
	 * @exception DAOException
	 */
	public List<SuperUserVO> getSuperUser(HashMap<String, String> param) throws DAOException {
		DBRowSet dbRowset = null;
		List<SuperUserVO> list = null;

		try{
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new SuperUserDAOSuperUserRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SuperUserVO.class);
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
	 * searchSubSystemList<br>
	 * 
	 * @return String[]
	 * @Exception DAOException
	 */
	public String[] searchSubSystemList() throws DAOException {
		String[] list = null;
		try {
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new SuperUserDAOSubSystemRSQL(), null, null);
			list = new String[dbRowset.getRowCount()];
			int idx = 0;
			while(dbRowset.next()){
				list[idx++] = dbRowset.getString("sub_sys_cd");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * searchRhqList<br>
	 * 
	 * @return String[]
	 * @Exception DAOException
	 */
	public String[] searchRhqList() throws DAOException {
		String[] list = null;
		try {
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new SuperUserDAORhqRSQL(), null, null);
			list = new String[dbRowset.getRowCount()];
			int idx = 0;
			while(dbRowset.next()){
				list[idx++] = dbRowset.getString("rhq");
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 *  여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * @param SuperUserVO[] vos
	 * @param SignOnUserAccount account
	 * @see ErrorMessageDAOEvent
	 * @throws DAOException
	 * @throws Exception
	 */
	public void multiComSuperUserVO(SuperUserVO[] vos, SignOnUserAccount account) throws DAOException,Exception {
		
		ArrayList<SuperUserVO> insModels = new ArrayList<SuperUserVO>();
		ArrayList<SuperUserVO> updModels = new ArrayList<SuperUserVO>();
		ArrayList<SuperUserVO> delModels = new ArrayList<SuperUserVO>();
	
		List<SuperUserVO> list = null;
		HashMap<String, String> param = new HashMap<String, String>();

		try {
			SuperUserVO model = null;
			for (int i = 0; i < vos.length; i++) {
				model = vos[i];
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("I")) {
						insModels.add(model);
						// validate fail
						param.put("usr_id", model.getUsrId());
						param.put("opt", "C");
						list = getSuperUser(param);
						if ( !list.isEmpty() && !(list.get(0).getAdmin()).equals(model.getAdmin()) ) {
							throw new DAOException("Admin Flag Validate Fail!");
						}
					} else if (model.getIbflag().equals("U")) {
						updModels.add(model);
						// validate fail
						param.put("usr_id", model.getUsrId());
						param.put("opt", "C");
						list = getSuperUser(param);
						if ( !list.isEmpty() && !(list.get(0).getAdmin()).equals(model.getAdmin()) ) {
							throw new DAOException("Admin Flag Validate Fail!");
						}
					} else if (model.getIbflag().equals("D")) {
						delModels.add(model);
					}
					// 세션 정보 설정
					model.setCreUsrId(account.getUsr_id());
					model.setUpdUsrId(account.getUsr_id());
				}
			}
			int[] insCnt = null;
			int[] updCnt = null;
			int[] delCnt = null;
	
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPgmMtchUSQL(), updModels,null);
				for(int i=0;i<updCnt.length;i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPgmMtchDSQL(), delModels,null);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
				}
			}
			
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new UserDAOComUsrPgmMtchCSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
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

}
