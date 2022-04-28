/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ItemControlManagementDBDAO.java
 *@FileTitle : Item Control Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2013.06.28
 *@LastModifier : 寃쎌쥌��
 *@LastVersion : 1.0
 * 2013.06.28 寃쎌쥌��
 * 1.0 理쒖큹 �앹꽦
=========================================================*/
package com.clt.syscommon.management.opus.itemcontrolmanagement.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;
import com.clt.syscommon.management.opus.superuser.integration.SuperUserDAOSubSystemRSQL;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;

/**
 * NIS2010-schedule Business Logic Basic Command implementation<br>
 * - NIS2010-schedule����븳 鍮꾩��덉뒪 濡쒖쭅��泥섎━�쒕떎.<br>
 * 
 * @author In Sun Jung
 * @see scheduleBCImpl 李몄“
 * @since J2EE 1.4
 */
public class ItemControlManagementDBDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7597203228200560750L;


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
	 * searchItemControlList<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @Exception DAOException
	 */
	public List<ItemControlManagementVO> searchItemControlList(ItemControlManagementVO itemControlManagementVO) throws DAOException {

		DBRowSet dbRowset = null;
		List<ItemControlManagementVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try {
			
			if (itemControlManagementVO != null){
				Map<String, String> mapVO = itemControlManagementVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ItemControlManagementDBDAOsearchItemControlListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ItemControlManagementVO.class);			
			
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
	 * searchItemControlList<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @Exception DAOException
	 */
	public List<ItemControlManagementVO> searchUiSetUpInfo(ItemControlManagementVO itemControlManagementVO) throws DAOException {

		DBRowSet dbRowset = null;
		List<ItemControlManagementVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try {
			
			if (itemControlManagementVO != null){
				Map<String, String> mapVO = itemControlManagementVO.getColumnValues();
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ItemControlManagementDBDAOsearchUiSetUpInfoRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ItemControlManagementVO.class);			
			
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
	 * 
	 * manageItemControlList
	 * @author In Sun Jung
	 * @param vos
	 * @param account
	 * @throws DAOException
	 * @throws Exception void
	 */
	public void manageItemControlList(ItemControlManagementVO[] vos, SignOnUserAccount account) throws DAOException,Exception {
		
		ArrayList<ItemControlManagementVO> insModels = new ArrayList<ItemControlManagementVO>();
		ArrayList<ItemControlManagementVO> updModels = new ArrayList<ItemControlManagementVO>();
		ArrayList<ItemControlManagementVO> delModels = new ArrayList<ItemControlManagementVO>();
	
		try {
			ItemControlManagementVO model = null;
			for (int i = 0; i < vos.length; i++) {
				model = vos[i];
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("I")) {
						insModels.add(model);
						
					} else if (model.getIbflag().equals("U")) {
						updModels.add(model);
						
					} else if (model.getIbflag().equals("D")) {
						delModels.add(model);
					}
					// �몄뀡 �뺣낫 �ㅼ젙
					model.setCreUsrId(account.getUsr_id());
					model.setUpdUsrId(account.getUsr_id());
				}
			}
			int[] insCnt = null;
			int[] updCnt = null;
			int[] delCnt = null;
	
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new ItemControlManagementDBDAOremoveItemControlListDSQL(), delModels,null);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
				}
			}
			
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new ItemControlManagementDBDAOupdateItemControlListUSQL(), updModels,null);
				for(int i=0;i<updCnt.length;i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
			
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ItemControlManagementDBDAOaddItemControlListCSQL(), insModels,null);
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
