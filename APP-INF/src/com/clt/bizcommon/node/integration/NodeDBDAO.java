/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : NodeDBDAO.java
*@FileTitle : Node 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-17
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-17 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.node.integration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.node.basic.NodeBCImpl;
import com.clt.bizcommon.node.vo.SearchNodeYardListVO;
import com.clt.bizcommon.node.vo.SearchNodeZoneListVO;
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
 * @author Hyung Choon
 * @see NodeBCImpl 참조
 * @since J2EE 1.4
 */
public class NodeDBDAO extends DBDAOSupport {
	
	/**
	 *  Node의 모든 목록을 가져온다.<br>
	 * @param cntCd
	 * @param locCd
	 * @param ofcCd
	 * @param nodeCd
	 * @param nodeNm
	 * @param mode
	 * @param modeOnly
	 * @param sccCd
	 * @param iPage
	 * @return List<Object>
	 * @throws DAOException
	 */
    public List<Object> searchNodeList(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd, int iPage) throws DAOException {
    	// PDTO(Data Transfer Object including Parameters)
        DBRowSet dbRowset = null;
        List<Object> obj = new ArrayList<Object>();
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;

		Map<String,String> mapParam = new HashMap<String,String>();
		
    	mapParam.put("cnt_cd", cntCd);
    	mapParam.put("loc_cd", locCd);
    	mapParam.put("ofc_cd", ofcCd);
    	mapParam.put("node_cd", nodeCd);
    	mapParam.put("node_nm", nodeNm);
    	mapParam.put("mode", mode);
    	mapParam.put("startpart", "" + startPart);
    	mapParam.put("endpart",  "" + endPart);
    	mapParam.put("scc_cd", sccCd);
    	
        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new NodeDBDAOTotalNodeRSQL(), mapParam, mapParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new NodeDBDAOSearchNodeListRSQL(), mapParam, mapParam);
			if(mode.equals("yard")){
				List<SearchNodeYardListVO> list = null;
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchNodeYardListVO.class);
				if (list.size() > 0) list.get(0).setMaxRows(cnt);  
				obj.add(list);
			}else{
				List<SearchNodeZoneListVO> list = null;
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchNodeZoneListVO.class);
				if (list.size() > 0) list.get(0).setMaxRows(cnt);  
				obj.add(list);
			}
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        return obj;
    }

    /**
	 *  Node의 모든 목록을 가져온다.<br>
	 * @param cntCd
	 * @param locCd
	 * @param ofcCd
	 * @param nodeCd
	 * @param nodeNm
	 * @param mode
	 * @param modeOnly
	 * @param sccCd
	 * @param iPage
	 * @param mdmYN
	 * @param deltFlg
	 * @return List<Object>
	 * @throws DAOException
	 */
	public List<Object> searchNodeList(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd, int iPage, String mdmYN, String deltFlg)throws DAOException {
		// PDTO(Data Transfer Object including Parameters)
        DBRowSet dbRowset = null;
        List<Object> obj = new ArrayList<Object>();
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;

		Map<String,String> mapParam = new HashMap<String,String>();
		
    	mapParam.put("cnt_cd", cntCd);
    	mapParam.put("loc_cd", locCd);
    	mapParam.put("ofc_cd", ofcCd);
    	mapParam.put("node_cd", nodeCd);
    	mapParam.put("node_nm", nodeNm);
    	mapParam.put("mode", mode);
    	mapParam.put("startpart", "" + startPart);
    	mapParam.put("endpart",  "" + endPart);
    	mapParam.put("scc_cd", sccCd);
    	
    	mapParam.put("mdm_yn", mdmYN);
    	mapParam.put("delt_flg", deltFlg);
    	
        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new NodeDBDAOTotalNodeRSQL(), mapParam, mapParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new NodeDBDAOSearchNodeListRSQL(), mapParam, mapParam);
			if(mode.equals("yard")){
				List<SearchNodeYardListVO> list = null;
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchNodeYardListVO.class);
				if (list.size() > 0) list.get(0).setMaxRows(cnt);  
				obj.add(list);
			}else{
				List<SearchNodeZoneListVO> list = null;
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchNodeZoneListVO.class);
				if (list.size() > 0) list.get(0).setMaxRows(cnt);  
				obj.add(list);
			}
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
        return obj;
	}	
}