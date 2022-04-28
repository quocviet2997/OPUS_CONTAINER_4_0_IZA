/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SalesRepBC.java
*@FileTitle : SalesRep
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : Kim Yong Jin
*@LastVersion : 1.0
* 2012-02-21 Kim Yong Jin
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.salesrep.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.salesrep.basic.SalesRepBCImpl;
import com.clt.bizcommon.salesrep.vo.SalesRepListVO;
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
 * @author Kim Yong Jin
 * @see SalesRepBCImpl 참조
 * @since J2EE 1.4
 */
public class SalesRepDBDAO extends DBDAOSupport {
		
	/**
	 * SalesRep의 모든 목록을 가져온다.<br>
	 * @param SalesRepListVO salesRepListVO
	 * @return List<SalesRepListVO>
	 * @throws DAOException
	 */
	public List<SalesRepListVO> searchSalesRepList(SalesRepListVO salesRepListVO) throws DAOException {
    	DBRowSet dbRowset = null;
		//List
		List<SalesRepListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try{
			if(!salesRepListVO.getSrepCd().equals("")) {
				param.put("srep_cd", salesRepListVO.getSrepCd());
				velParam.put("srep_cd", salesRepListVO.getSrepCd());
			}
			if(!salesRepListVO.getSrepNm().equals("")) {
				param.put("srep_nm", salesRepListVO.getSrepNm());
				velParam.put("srep_nm", salesRepListVO.getSrepNm());
			}
			if(!salesRepListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", salesRepListVO.getDeltFlg());
				velParam.put("delt_flg", salesRepListVO.getDeltFlg());
			}
//			log.debug("xxx : "+velParam);  
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SalesRepDBDAOSearchSalesRepListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SalesRepListVO.class);
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