/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CntrTpSzDBDAO.java
*@FileTitle : CntrTpSz
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrtpsz.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.clt.bizcommon.cntrtpsz.basic.CntrTpSzBCImpl;
import com.clt.bizcommon.cntrtpsz.event.ComEns0G1Event;
import com.clt.bizcommon.comm.Constants;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * eNIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - eNIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyung Choon_Roh
 * @see CntrTpSzBCImpl 참조
 * @since J2EE 1.4
 */
public class CntrTpSzDBDAO extends DBDAOSupport {

	/**
     * 1. 기능 : Container Type Size count<p>
     * 2. 처리개요 : Container Type Size의 총 카운트를 조회한다.<p> 
     * - totalCarrier<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : HyungChoonRoh/2006.10.17<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
	 * @param et COM_ENS_0G1Event
     * @return int
     * @throws DAOException
     *
     */
	public int totalCntrTpSz(Event et) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
		ComEns0G1Event event=(ComEns0G1Event)et;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

        try {
			if(!event.getCntr_tpsz_cd().equals("")) {
				param.put("cntr_tpsz_cd", event.getCntr_tpsz_cd());
				velParam.put("cntr_tpsz_cd", event.getCntr_tpsz_cd());
			}
			if(!event.getCntr_tpsz_desc().equals("")) {
				param.put("cntr_tpsz_desc", event.getCntr_tpsz_desc());
				velParam.put("cntr_tpsz_desc", event.getCntr_tpsz_desc());
			}
			if(!event.getMdmYN().equals("")) {
				param.put("mdm_yn", event.getMdmYN());
				velParam.put("mdm_yn", event.getMdmYN());
			}
			if(!event.getDeltFlg().equals("")) {
				param.put("delt_flg", event.getDeltFlg());
				velParam.put("delt_flg", event.getDeltFlg());
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CntrTpSzDBDAOTotalCntrTpSzRSQL(), param, velParam);
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
	 * CntrTpSz의 모든 목록을 가져온다.<br>
	 * @param et COM_ENS_0G1Event
	 * @return DBRowSet DB 처리 결과
	 * @throws DAOException
	 */
	public DBRowSet searchCntrTpSzList(Event et) throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
		ComEns0G1Event event=(ComEns0G1Event)et;
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		int currentPage = event.getIPage();
		int startpart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endpart     = Constants.PAGE_SIZE_50 * currentPage;
		try{
			if(!event.getCntr_tpsz_cd().equals("")) {
				param.put("cntr_tpsz_cd", event.getCntr_tpsz_cd());
				velParam.put("cntr_tpsz_cd", event.getCntr_tpsz_cd());
			}
			if(!event.getCntr_tpsz_desc().equals("")) {
				param.put("cntr_tpsz_desc", event.getCntr_tpsz_desc());
				velParam.put("cntr_tpsz_desc", event.getCntr_tpsz_desc());
			}
			if(!event.getMdmYN().equals("")) {
				param.put("mdm_yn", event.getMdmYN());
				velParam.put("mdm_yn", event.getMdmYN());
			}
			if(!event.getDeltFlg().equals("")) {
				param.put("delt_flg", event.getDeltFlg());
				velParam.put("delt_flg", event.getDeltFlg());
			}
			
			param.put("startpart", startpart);
			param.put("endpart", endpart);
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CntrTpSzDBDAOSearchCntrTpSzListRSQL(), param, velParam);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}
}