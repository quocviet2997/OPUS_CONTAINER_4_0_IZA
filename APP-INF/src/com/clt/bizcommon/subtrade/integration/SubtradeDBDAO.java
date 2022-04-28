/*=========================================================
**Copyright(c) 2012 CyberLogitec
*@FileName : SubtradeDBDAO.java
*@FileTitle : Subtrade
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.subtrade.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
//import com.clt.bizcommon.trade.basic.TradeBCImpl;
import com.clt.bizcommon.subtrade.vo.SearchSubtradeListVO;
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
 * @author Shin Ja Young
 * @see SubtradeBCImpl 참조
 * @since J2EE 1.4
 */
public class SubtradeDBDAO extends DBDAOSupport {

	/**
	 * Subtrade의 모든 목록을 가져온다.<br>
	 * @param SearchSubtradeListVO searchSubtradeListVO
	 * @param String mdm_yn
	 * @param String delt_flg
	 * @return List<SearchSubtradeListVO>
	 * @throws DAOException
	 */
	public List<SearchSubtradeListVO> searchSubtradeList(SearchSubtradeListVO searchSubtradeListVO, String mdm_yn, String delt_flg) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//List
		List<SearchSubtradeListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			if(!searchSubtradeListVO.getCode().equals("")) {
				param.put("code", searchSubtradeListVO.getCode());
				velParam.put("code", searchSubtradeListVO.getCode());
			}
			if(!searchSubtradeListVO.getDesc().equals("")) {
				param.put("desc", searchSubtradeListVO.getDesc());
				velParam.put("desc", searchSubtradeListVO.getDesc());
			}
			if(!searchSubtradeListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", searchSubtradeListVO.getMdmYN());
				velParam.put("mdm_yn", searchSubtradeListVO.getMdmYN());
			}
			if(!searchSubtradeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", searchSubtradeListVO.getDeltFlg());
				velParam.put("delt_flg", searchSubtradeListVO.getDeltFlg());
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new SubtradeDBDAOSearchSubtradeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchSubtradeListVO.class);
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