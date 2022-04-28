/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RevenueLaneDBDAO.java
*@FileTitle : zone code 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : SEOK JIN
*@LastVersion : 1.0
* 2012-02-21 SEOK JIN
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.revenuelane.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.lane.basic.LaneBCImpl;
import com.clt.bizcommon.revenuelane.vo.SearchRevenueLaneListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author SEOK JIN
 * @see LaneBCImpl 참조
 * @since J2EE 1.4
 */
public class RevenueLaneDBDAO extends DBDAOSupport {

	/**
	 * RevenueLane의 모든 목록을 가져온다.<br>
	 * @param rlaneCd
	 * @param rlaneNm
	 * @param status
	 * @return List<SearchRevenueLaneListVO>
	 * @throws DAOException
	 */
    public List<SearchRevenueLaneListVO> searchRevenueLaneList(String rlaneCd, String rlaneNm, String status) throws DAOException {
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchRevenueLaneListVO> list = null;
		DBRowSet dbRowset = null;
		
    	try{

    		Map<String, Object> param = new HashMap<String, Object>();

    		param.put("rlane_cd", rlaneCd);
    		param.put("rlane_nm", rlaneNm);
    		param.put("status", status);

    		
    		//dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new RevenueLaneDBDAOSearchRevenueLaneListVORSQL(), param, param);
			/*int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}*/

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new RevenueLaneDBDAOSearchRevenueLaneListVORSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchRevenueLaneListVO.class);
			/*if (cnt > 0)
				list.get(0).setMaxRows(cnt);  */
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