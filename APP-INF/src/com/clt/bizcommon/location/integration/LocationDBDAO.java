 /*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LocationDBDAO.java
*@FileTitle : Location조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : HyungChoonRoh
*@LastVersion : 1.0
* 2006-08-03 HyungChoonRoh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.location.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.location.basic.LocationBCImpl;
import com.clt.bizcommon.location.event.ComEns051Event;
import com.clt.bizcommon.location.vo.SearchLocationDetailVO;
import com.clt.bizcommon.location.vo.SearchLocationListVO;
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
 * @author HyungChoonRoh
 * @see LocationBCImpl 참조
 * @since J2EE 1.4
 */
public class LocationDBDAO extends DBDAOSupport {

	 
    /**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage) throws DAOException {
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dbRowset = null;
        List<SearchLocationListVO> list = null;
		// 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;

		Map<String, String> param = new HashMap<String, String>();
		param.put("loc_cd", locCd);
    	param.put("un_loc_ind_cd", unLocIndCd);
    	param.put("loc_nm", locNm);
    	param.put("cnt_cd", cntCd);
    	param.put("select", select);
    	param.put("rcc_cd", rccCd);
    	param.put("loc_state", locState);
    	param.put("loc_eq_ofc", locEqOfc);
    	if ( !"".equals((lccCd==null)?"":lccCd)){
    		param.put("lcc_cd", lccCd);
    	}
		param.put("startpart","" +  startPart);
		param.put("endpart", "" + endPart);

        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOTotalLocationRSQL(), param, param);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOSearchLocationListRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLocationListVO.class);
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
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg) throws DAOException{
    	 // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dbRowset = null;
        List<SearchLocationListVO> list = null;
		// 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;

		Map<String, String> param = new HashMap<String, String>();
		param.put("loc_cd", locCd);
    	param.put("un_loc_ind_cd", unLocIndCd);
    	param.put("loc_nm", locNm);
    	param.put("cnt_cd", cntCd);
    	param.put("select", select);
    	param.put("rcc_cd", rccCd);
    	param.put("loc_state", locState);
    	param.put("loc_eq_ofc", locEqOfc);
    	if ( !"".equals((lccCd==null)?"":lccCd)){
    		param.put("lcc_cd", lccCd);
    	}
    	if(!"".equals(mdmYN)){
    		param.put("mdm_yn", mdmYN);
    	}
    	if(!"".equals(deltFlg)){
    		param.put("delt_flg", deltFlg);
    	}
    	
		param.put("startpart","" +  startPart);
		param.put("endpart", "" + endPart);

        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOTotalLocationRSQL(), param, param);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOSearchLocationListRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLocationListVO.class);
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
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @param String sccFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg, String sccFlg) throws DAOException{
   	 // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dbRowset = null;
        List<SearchLocationListVO> list = null;
		// 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endPart     = Constants.PAGE_SIZE_50 * currentPage;

		Map<String, String> param = new HashMap<String, String>();
		param.put("loc_cd", locCd);
    	param.put("un_loc_ind_cd", unLocIndCd);
    	param.put("loc_nm", locNm);
    	param.put("cnt_cd", cntCd);
    	param.put("select", select);
    	param.put("rcc_cd", rccCd);
    	param.put("loc_state", locState);
    	param.put("loc_eq_ofc", locEqOfc);
    	if ( !"".equals((lccCd==null)?"":lccCd)){
    		param.put("lcc_cd", lccCd);
    	}
    	if(!"".equals(mdmYN)){
    		param.put("mdm_yn", mdmYN);
    	}
    	if(!"".equals(deltFlg)){
    		param.put("delt_flg", deltFlg);
    	}
    	
    	param.put("scc_flg", sccFlg);
    	
		param.put("startpart","" +  startPart);
		param.put("endpart", "" + endPart);

        try {
        	dbRowset =  new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOTotalLocationRSQL(), param, param);
			int cnt = 0;
			if (dbRowset.next()) {
				cnt = dbRowset.getInt(1);
			}

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOSearchLocationListRSQL(), param, param);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLocationListVO.class);
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
     * Location Detail 정보을 가져온다.<br>
     * @param locCd
     * @return List<SearchLocationDetailVO>
     * @throws DAOException
     */
    public List<SearchLocationDetailVO> searchLocationDetail(String locCd) throws DAOException {
        // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dbRowset = null;
		Map<String, String> param = new HashMap<String, String>();
		List<SearchLocationDetailVO> list = null;
		param.put("loc_cd", locCd);
        try {
        	dbRowset = new SQLExecuter().executeQuery(new LocationDBDAOSearchLocationDetailRSQL(), param, param);
        	list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLocationDetailVO.class);
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
	 * @Method Name  : searchLocationDetail
	 * @작성일   : 2012. 2. 9. 
	 * @작성자   : JUN SUNG, KIM ( 9011644 )
	 * @변경이력  : 상세 조회 화면에서 mdm type 이나 delt flg 가 필요 없을듯 하여 sql 수정 하지 않음.
	 * @Method 설명 :
	 * @param event
	 * @return
	 * @throws DAOException
	 */
	public List<SearchLocationDetailVO> searchLocationDetail( ComEns051Event event) throws DAOException {
		
		String locCd = event.getLocCd();
		String mdmYn = event.getMdmYN();
		String deltFlg = event.getDeltFlg();
		
		 // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        DBRowSet dbRowset = null;
        
		Map<String, String> param = new HashMap<String, String>();
		List<SearchLocationDetailVO> list = null;
		param.put("loc_cd", locCd);
		
		if(!"".equals(mdmYn)){
			param.put("mdm_yn", mdmYn);
		}
		if(!"".equals(deltFlg)){
			param.put("delt_flg", deltFlg);
		}
        try {
        	dbRowset = new SQLExecuter().executeQuery(new LocationDBDAOSearchLocationDetailRSQL(), param, param);
        	list = (List)RowSetUtil.rowSetToVOs(dbRowset, SearchLocationDetailVO.class);
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
	 *  RCC_CD, LCC_CD <br>
	 * 
	 * @param String loc_grp_cd
	 * @param String loc_cd
	 * @return CommonRsVO
	 * @throws DAOException
	 */
	/*public CommonRsVO searchRccLccCd(String loc_grp_cd, String loc_cd) throws DAOException {
		DBRowSet dbRowset = null;
		CommonRsVO commonRsVO = new CommonRsVO();
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
			
		try{
			if(loc_grp_cd != null){ 
				velParam.put("loc_grp_cd", loc_grp_cd);
			}
			if(loc_cd != null){
				param.put("loc_cd", loc_cd);
				velParam.put("loc_cd", loc_cd);
			}
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new LocationDBDAOSearchRccLccCdRSQL(), param, velParam);
			commonRsVO.setDbRowset(dbRowset);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return commonRsVO;
	}	*/ 
	

}
