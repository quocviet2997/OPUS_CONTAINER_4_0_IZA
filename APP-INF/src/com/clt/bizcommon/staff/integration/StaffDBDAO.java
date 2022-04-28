/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : StaffDBDAO.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.staff.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.staff.basic.StaffBCImpl;
import com.clt.bizcommon.staff.vo.SearchDeptListVO;
import com.clt.bizcommon.staff.vo.SearchStaffListVO;
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
 * @see StaffBCImpl 참조
 * @since J2EE 1.4
 */
public class StaffDBDAO extends DBDAOSupport {

	/**
	 * Staff의 모든 목록을 가져온다.<br>
	 * @param ofcCd
	 * @param userCd
	 * @param userNm
	 * @return List<SearchStaffListVO>
	 * @throws DAOException
	 */
	public List<SearchStaffListVO> searchStaffList(String ofcCd, String userCd, String userNm) throws DAOException {
		DBRowSet dbRowset = null;
    	// PDTO(Data Transfer Object including Parameters)
    	List<SearchStaffListVO> list = null;
        // 페이징 처리
//		int currentPage = iPage;
//		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
//		int endPart     = Constants.PAGE_SIZE_50 * currentPage;
		Map<String,Object> mapParam = new HashMap<String,Object>();
		
    	mapParam.put("ofc_cd", ofcCd);
    	mapParam.put("usr_id", userCd);
    	mapParam.put("usr_nm", userNm);
//    	mapParam.put("startpart", startPart);
//    	mapParam.put("endpart", endPart);
    	
        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new StaffDAOTotalStaffRSQL(), mapParam, mapParam);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new StaffDAOsearchStaffListRSQL(), mapParam, mapParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchStaffListVO.class);
			if (list.size() > 0)
				list.get(0).setMaxRows(cnt); 
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }
    	return list;

	}
	
	/**
	 * 모든 organization을 가져온다.<br>
	 * @param ofcCd
	 * @return List<SearchDeptListVO>
	 * @throws DAOException
	 */
	public List<SearchDeptListVO> searchDeptList(String ofcCd) throws DAOException {
        try {
        	Map<String,Object> mapParam = new HashMap<String,Object>();
        	mapParam.put("ofc_cd", "");
        	List<SearchDeptListVO> volist = (List)new SQLExecuter().executeQuery(new StaffDAOSearchDeptListRSQL(), mapParam, mapParam, SearchDeptListVO.class);

            return volist;
        } catch (SQLException se) {
            log.error(se.getMessage(), se);
            throw new DAOException(new ErrorHandler(se).getMessage());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new DAOException(e.getMessage());
        }		
	}
}