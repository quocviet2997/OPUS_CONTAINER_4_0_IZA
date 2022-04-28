/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ProgramDAO.java
*@FileTitle : Program Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.17
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.17 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.program.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.program.basic.ProgramBCImpl;


/**
 * NIS2010 ProgramDAO <br>
 * - NIS2010-ProgramManagement system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author KyungBum Kim
 * @see ProgramBCImpl 참조
 * @since J2EE 1.4
 */
public class ProgramDAO extends DBDAOSupport {

	/**
	 * ProgramDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param ComProgramVO comprogramvo
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet searchProgramList(ComProgramVO comprogramvo) throws DAOException {
		DBRowSet dbRowset = null;
		
		//testQuery.java용 velocity parameter
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("pgm_tp_cd", comprogramvo.getPgmTpCd());
		param.put("pgm_mnu_div_cd", comprogramvo.getPgmMnuDivCd());
		param.put("pgm_no", comprogramvo.getPgmNo());
		param.put("pgm_nm", comprogramvo.getPgmNm());
		
		try{
			HashMap<String, Object> velParam = new HashMap<String, Object>();
			velParam.put("pgm_tp_cd", comprogramvo.getPgmTpCd());
			velParam.put("pgm_mnu_div_cd", comprogramvo.getPgmMnuDivCd());
			velParam.put("pgm_no", comprogramvo.getPgmNo());
			velParam.put("pgm_nm", comprogramvo.getPgmNm());

			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ProgramDAOProgramRSQL(), param,velParam);
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
	 * ProgramDAO의 여러 데이타 모델을 지정된 ibflag 값에 따라 DB에 반영한다.(추가, 수정, 삭제)<br>
	 * 
	 * @param models 여러 데이타 모델
	 * @param account 세션 정보
	 * @see ProgramDAOEvent
	 * @throws DAOException
	 */
	public void multiComProgramVO(ComProgramVO[] models, SignOnUserAccount account) throws DAOException,Exception {
		
		ArrayList<ComProgramVO> insModels = new ArrayList<ComProgramVO>();
		ArrayList<ComProgramVO> updModels = new ArrayList<ComProgramVO>();
		ArrayList<ComProgramVO> delModels = new ArrayList<ComProgramVO>();

		try {
			ComProgramVO model = null;
			for (int i = 0; i < models.length; i++) {
				model = models[i];
				// 세션 정보 설정
				model.setCreUsrId(account.getUsr_id());
				model.setUpdUsrId(account.getUsr_id());
				if (model.getIbflag().length() > 0) {
					if (model.getIbflag().equals("I")) {
						insModels.add(model);
					} else if (model.getIbflag().equals("U")) {
						updModels.add(model);
					} else if (model.getIbflag().equals("D")) {
						delModels.add(model);
					}
				}
			}
			int[] insCnt = null;
			int[] updCnt = null;
			int[] delCnt = null;

			SQLExecuter sqlExe = new SQLExecuter("SysComDB");
			
			if(updModels.size() > 0){
				updCnt = sqlExe.executeBatch((ISQLTemplate)new ProgramDAOComProgramVOUSQL(), updModels,null);
				for(int i=0;i<updCnt.length;i++){
					if(updCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to update No"+ i + " SQL");
				}
			}
			if(delModels.size() > 0){
				delCnt = sqlExe.executeBatch((ISQLTemplate)new ProgramDAOComProgramVODSQL(), delModels,null);
				for(int i=0;i<delCnt.length;i++){
					if(delCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to delete No"+ i + " SQL");
				}
			}
			
			if(insModels.size() > 0){
				insCnt = sqlExe.executeBatch((ISQLTemplate)new ProgramDAOComProgramVOCSQL(), insModels, null);
				for(int i=0;i<insCnt.length;i++){
					if(insCnt[i]== Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
				if(!"false".equals(SiteConfigFactory.get("COM.CLT.PROGRAM.MATCH.AUTO.INSERT"))){
					for(int i=0;i<insModels.size();i++){
						if(insModels.get(i).getPgmTpCd().equals("00")&&insModels.get(i).getPgmMnuDivCd().equals("02"))
							sqlExe.executeUpdate((ISQLTemplate)new ProgramDAOOfficeMappingCSQL(), insModels.get(i).getColumnValues(), null);
					}
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
