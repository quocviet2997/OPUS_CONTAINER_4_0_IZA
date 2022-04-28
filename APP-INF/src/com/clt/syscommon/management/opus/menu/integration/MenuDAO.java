/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuDAO.java
*@FileTitle : Menu Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.ComMnuCfgVO;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.menu.basic.MenuBCImpl;
import com.clt.syscommon.management.opus.menu.vo.ComMnuCfgSearchVO;
import com.clt.syscommon.management.opus.menu.vo.MnuCfgExcelVO;


/**
 * NIS2010 MenuDAO <br>
 * - NIS2010-MenuManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author KyungBum Kim
 * @see MenuBCImpl 참조
 * @since J2EE 1.4
 */
public class MenuDAO extends DBDAOSupport {

	/**
	 * MenuDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param ComProgramVO commnucfgvo
	 * @return List<ComMnuCfgSearchVO>
	 * @throws DAOException
	 */
	public List<ComMnuCfgSearchVO> searchComMnuCfgVO(ComProgramVO commnucfgvo) throws DAOException {
		DBRowSet dbRowset = null;
		List<ComMnuCfgSearchVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();
		String mnuCfgCd = SiteConfigFactory.get("COM.CLT.MENU.CONFIG.CODE");
		String rootPgmCd = SiteConfigFactory.get("COM.CLT.MENU.ROOT.PROGRAM.CODE");
		param.put("mnu_cfg_cd", mnuCfgCd);
		param.put("pgm_no", rootPgmCd);
		velParam.put("acss_lvl", commnucfgvo.getUpdUsrId());
		try{
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new MenuDAOComMnuCfgVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComMnuCfgSearchVO.class);
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
	 * MenuDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @return List<MnuCfgExcelVO>
	 * @throws DAOException
	 */
	public List<MnuCfgExcelVO> searchExcelMenu() throws DAOException {
		DBRowSet dbRowset = null;
		List<MnuCfgExcelVO> list = null;
		try{
			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new MenuDAOMnuCfgExcelRSQL(), null, null);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MnuCfgExcelVO.class);
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
	 * 단건의 데이터를 생성한다.<br>
	 * 
	 * @param ComMnuCfgVO vo
	 * @throws DAOException,Exception
	 */
	public void addmultiComMnuCfgVO(ComMnuCfgVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int result = sqlExe.executeUpdate((ISQLTemplate)new MenuDAOComMnuCfgVOCSQL(), param, velParam);
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
	 * 단건의 데이터를 갱신한다.<br>
	 * 
	 * @param ComMnuCfgVO vo
	 * @return int
	 * @throws DAOException,Exception
	 */
	public int modifymultiComMnuCfgVO(ComMnuCfgVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new MenuDAOComMnuCfgVOUSQL(), param, velParam);
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
	 * 단건의 데이터를 삭제한다.<br>
	 * 
	 * @param ComMnuCfgVO vo
	 * @return int
	 * @throws DAOException,Exception
	 */
	public int removemultiComMnuCfgVO(ComMnuCfgVO vo) throws DAOException,Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		int result = 0;
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			
			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			result = sqlExe.executeUpdate((ISQLTemplate)new MenuDAOComMnuCfgVODSQL(), param, velParam);
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
	 * 다건의 데이터를 일괄적으로 생성한다.<br>
	 * 
	 * @param List<ComMnuCfgVO> insModels
	 * @throws DAOException, Exception
	 */
	public void addmultiComMnuCfgVOS(List<ComMnuCfgVO> insModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int insCnt[] = null;
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new MenuDAOComMnuCfgVOCSQL(), insModels,null);
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
	 * 다건의 데이터를 일괄적으로 갱신한다.<br>
	 * 
	 * @param List<ComMnuCfgVO> updModels
	 * @throws DAOException, Exception
	 */
	public void modifymultiComMnuCfgVOS(List<ComMnuCfgVO> updModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int updCnt[] = null;
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new MenuDAOComMnuCfgVOUSQL(), updModels,null);
				for(int i = 0; i < updCnt.length; i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
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
	 * 다건의 데이터를 일괄적으로 삭제한다.<br>
	 * 
	 * @param List<ComMnuCfgVO> delModels
	 * @throws DAOException, Exception
	 */
	public void removemultiComMnuCfgVOS(List<ComMnuCfgVO> delModels) throws DAOException,Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			int delCnt[] = null;
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new MenuDAOComMnuCfgVODSQL(), delModels,null);
				for(int i = 0; i < delCnt.length; i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
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
