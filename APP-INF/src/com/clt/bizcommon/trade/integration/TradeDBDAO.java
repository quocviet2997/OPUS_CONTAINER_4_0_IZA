/*=========================================================
**Copyright(c) 2012 CyberLogitec
*@FileName : TradeDBDAO.java
*@FileTitle : Trade
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.trade.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
//import com.clt.bizcommon.trade.basic.TradeBCImpl;
import com.clt.bizcommon.trade.vo.SearchTradeListVO;
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
 * @see TradeBCImpl 참조
 * @since J2EE 1.4
 */
public class TradeDBDAO extends DBDAOSupport {

	/**
	 * Trade의 모든 목록을 가져온다.<br>
	 * @param SearchTradeListVO searchTradeListVO
	 * @param String mdm_yn
	 * @param String delt_flg
	 * @return List<SearchTradeListVO>
	 * @throws DAOException
	 */
	public List<SearchTradeListVO> searchTradeList(SearchTradeListVO searchTradeListVO, String mdm_yn, String delt_flg) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//List
		List<SearchTradeListVO> list = null; 
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			if(!searchTradeListVO.getCode().equals("")) {
				param.put("code", searchTradeListVO.getCode());
				velParam.put("code", searchTradeListVO.getCode());
			}
			if(!searchTradeListVO.getDesc().equals("")) {
				param.put("desc", searchTradeListVO.getDesc());
				velParam.put("desc", searchTradeListVO.getDesc());
			}
			if(!searchTradeListVO.getMdmYN().equals("")) {
				param.put("mdm_yn", searchTradeListVO.getMdmYN());
				velParam.put("mdm_yn", searchTradeListVO.getMdmYN());
			}
			if(!searchTradeListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", searchTradeListVO.getDeltFlg());
				velParam.put("delt_flg", searchTradeListVO.getDeltFlg());
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new TradeDBDAOSearchTradeListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchTradeListVO.class);
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