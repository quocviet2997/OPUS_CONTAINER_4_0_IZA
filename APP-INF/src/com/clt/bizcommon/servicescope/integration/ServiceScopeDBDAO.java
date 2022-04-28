/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ServiceScopeDBDAO.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.servicescope.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.servicescope.basic.ServiceScopeBCImpl;
import com.clt.bizcommon.servicescope.vo.SearchServiceScopeListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see ServiceScopeBCImpl 참조
 * @since J2EE 1.4
 */
public class ServiceScopeDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Service Scope count<p>
     * 2. 처리개요 : Service Scope의 총 카운트를 조회한다.<p>
     * - totalServiceScope<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.08.03<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param SearchServiceScopeListVO searchServiceScopeListVO
     * @return int
     * @throws DAOException
     */
	public int totalServiceScope(SearchServiceScopeListVO searchServiceScopeListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

        try {
			if(!searchServiceScopeListVO.getSvcScpCd().equals("")) {
				param.put("svc_scp_cd", searchServiceScopeListVO.getSvcScpCd());
				velParam.put("svc_scp_cd", searchServiceScopeListVO.getSvcScpCd());
			}
			if(!searchServiceScopeListVO.getSvcScpNm().equals("")) {
				param.put("svc_scp_nm", searchServiceScopeListVO.getSvcScpNm());
				velParam.put("svc_scp_nm", searchServiceScopeListVO.getSvcScpNm());
			}
			if(!searchServiceScopeListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", searchServiceScopeListVO.getMdmYN());
				velParam.put("mdm_yn", searchServiceScopeListVO.getMdmYN());
			}
			if(!searchServiceScopeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", searchServiceScopeListVO.getDeltFlg());
				velParam.put("delt_flg", searchServiceScopeListVO.getDeltFlg());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ServiceScopeDBDAOTotalServiceScopeRSQL(), param, velParam);
			if (dbRowset.next()) {
				return dbRowset.getInt(1);
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return 0;
	}
	
	/**
	 * ServiceScope의 모든 목록을 가져온다.<br>
	 * @param SearchServiceScopeListVO searchServiceScopeListVO
	 * @param int iPage
	 * @return List<SearchServiceScopeListVO>
	 * @throws DAOException
	 */
	public List<SearchServiceScopeListVO> searchServiceScopeList(SearchServiceScopeListVO searchServiceScopeListVO, int iPage) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//List
		List<SearchServiceScopeListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = iPage;
		int startpart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endpart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
			if(!searchServiceScopeListVO.getSvcScpCd().equals("")) {
				param.put("svc_scp_cd", searchServiceScopeListVO.getSvcScpCd());
				velParam.put("svc_scp_cd", searchServiceScopeListVO.getSvcScpCd());
			}
			if(!searchServiceScopeListVO.getSvcScpNm().equals("")) {
				param.put("svc_scp_nm", searchServiceScopeListVO.getSvcScpNm());
				velParam.put("svc_scp_nm", searchServiceScopeListVO.getSvcScpNm());
			}
			if(!searchServiceScopeListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", searchServiceScopeListVO.getMdmYN());
				velParam.put("mdm_yn", searchServiceScopeListVO.getMdmYN());
			}
			if(!searchServiceScopeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", searchServiceScopeListVO.getDeltFlg());
				velParam.put("delt_flg", searchServiceScopeListVO.getDeltFlg());
			}
			
			param.put("startpart", startpart);
			param.put("endpart", endpart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ServiceScopeDBDAOSearchServiceScopeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchServiceScopeListVO.class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
}