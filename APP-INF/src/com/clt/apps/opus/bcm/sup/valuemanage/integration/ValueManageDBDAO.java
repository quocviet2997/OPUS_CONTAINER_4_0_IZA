/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ValueManageDBDAO.java
*@FileTitle : OPUS Constants Manager
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.10
*@LastModifier : �〓���
*@LastVersion : 1.0
* 2011.02.10 �〓���
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.integration;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBCImpl;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.GroupOfficeListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupConstantListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupModuleVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.MdmOfcGrpVO;


/**
 * OPUS ValueManageDBDAO <br>
 * -  OPUS Constant system Business Logic��泥섎━�섍린 �꾪븳 JDBC �묒뾽�섑뻾.<br>
 * 
 * @author Min Seok Song
 * @see ValueManageBCImpl 李몄“
 * @since J2EE 1.6
 */
public class ValueManageDBDAO extends DBDAOSupport {
	private static final long serialVersionUID = 1L;

	/**
	 * Office Group���대떦�섎뒗 Office List 瑜�議고쉶�⑸땲��<br>
	 * 
	 * @param MdmOfcGrpVO mdmOfcGrpVO
	 * @return List<GroupOfficeListVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<GroupOfficeListVO> searchGroupOfficeList(MdmOfcGrpVO mdmOfcGrpVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<GroupOfficeListVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			if (mdmOfcGrpVO != null) {
				Map<String, String> mapVO = mdmOfcGrpVO.getColumnValues();

				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery(
					(ISQLTemplate) new ValueManageDBDAOGroupOfficeListRSQL(), param,
					velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, GroupOfficeListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}	
	
	/**
	 * �곸닔 愿�━ �뚯씠釉�com_stup_cons���댁슜��議고쉶�⑸땲��<br>
	 * 
	 * @return List<SetupConstantListVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SetupConstantListVO> searchSetupConstantCodeList() throws DAOException {
		DBRowSet dbRowset = null;
		List<SetupConstantListVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			dbRowset = new SQLExecuter("").executeQuery(
					(ISQLTemplate) new ValueManageDBDAOSetupConstantListRSQL(), param,
					velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, SetupConstantListVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}		
	
	/**
	 * 모듈 사용 정보 조회<BR>
	 * @return List<SetupConstantListVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SetupModuleVO> searchSetupModuleList() throws DAOException {
		DBRowSet dbRowset = null;
		List<SetupModuleVO> list = null;
		Map<String, Object> param = new HashMap<String, Object>();
		Map<String, Object> velParam = new HashMap<String, Object>();

		try {
			dbRowset = new SQLExecuter("").executeQuery(
					(ISQLTemplate) new ValueManageDBDAOsearchSetupModuleListRSQL(), param,
					velParam);
			list = (List) RowSetUtil.rowSetToVOs(dbRowset, SetupModuleVO.class);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return list;
	}		
}
