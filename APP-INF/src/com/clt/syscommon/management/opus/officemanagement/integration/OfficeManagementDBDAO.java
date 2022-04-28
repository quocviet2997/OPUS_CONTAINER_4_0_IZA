/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeManagementDBDAO.java
*@FileTitle : Office
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.07.02 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.officemanagement.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officemanagement.basic.OfficeManagementBCImpl;
import com.clt.syscommon.management.opus.officemanagement.vo.OfficListVO;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDAOComPgmROLECSQL;
import com.clt.syscommon.management.opus.role.integration.ProgramMappingDAOComPgmROLEDSQL;


/**
 * ALPS OfficeManagementDBDAO <br>
 * - ALPS-ProgramManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jung In Sun
 * @see OfficeManagementBCImpl 참조
 * @since J2EE 1.6
 */
public class OfficeManagementDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	* @param OfficListVO	officListVO
	 * @param String pgm_no
	 * @return List<OfficListVO>
	 * @exception EventException
	 */
	 @SuppressWarnings("unchecked")
	public List<OfficListVO> comOfcPgmMtchSearch(OfficListVO officListVO,String pgm_no) throws DAOException {
		DBRowSet dbRowset = null;
		List<OfficListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try{
			param.put("pgm_no",pgm_no);

			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new OfficeManagementDBDAOOfficListVORSQL(), param, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, OfficListVO .class);
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
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComOfcPgmMtchVO vo
	 * @Exception DAOException
	 * @Exception Exception
	 */
	public void addcomOfcPgmMtchs(ComOfcPgmMtchVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		try {
			Map<String, String> mapVO = vo.getColumnValues();
			param.putAll(mapVO);
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int result = sqlExe.executeUpdate((ISQLTemplate)new OfficeManagementDBDAOComOfcPgmMtchVOCSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComOfcPgmMtchVO vo
	 * @return int
	 * @Exception DAOException
	 * @Exception Exception
	 */
	public int removecomOfcPgmMtchs(ComOfcPgmMtchVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();

		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			param.putAll(mapVO);
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new OfficeManagementDBDAOComOfcPgmMtchVODSQL(), param, null);
			if(result == Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert SQL");
		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return result;
	}

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param ComOfcPgmMtchVO[] comOfcPgmMtchVO
	 * @param SignOnUserAccount account
	 * @Exception DAOException
	 */
	public void multiOfcPgmMtchs(ComOfcPgmMtchVO[] comOfcPgmMtchVO, SignOnUserAccount account) throws DAOException {
		Collection<ComOfcPgmMtchVO> insModels =new ArrayList<ComOfcPgmMtchVO>();
		Collection<ComOfcPgmMtchVO> delModels =new ArrayList<ComOfcPgmMtchVO>();

		try {
			ComOfcPgmMtchVO model = null;
			int cnt = comOfcPgmMtchVO.length;
			for(int i=0;i<cnt;i++){
				model = (ComOfcPgmMtchVO)comOfcPgmMtchVO[i];
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
				insCnt = sqlExe.executeBatch(new OfficeManagementDBDAOComOfcPgmMtchVOCSQL(), insModels,null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}

			if(delModels.size()>0){
				delCnt = sqlExe.executeBatch(new OfficeManagementDBDAOComOfcPgmMtchVODSQL(), delModels,null);
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