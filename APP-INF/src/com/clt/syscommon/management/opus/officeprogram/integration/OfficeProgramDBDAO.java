/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeDBDAO.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.comm.Constants;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officeprogram.basic.OfficeProgramBCImpl;
import com.clt.syscommon.management.opus.officeprogram.vo.OfficeProgramListVO;
import com.clt.syscommon.management.opus.officeprogram.vo.SearchComOfcPgmMtchVO;



/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Hyunsu, Ryu
 * @see OfficeProgramBCImpl 참조
 * @since J2EE 1.4
 */
public class OfficeProgramDBDAO extends DBDAOSupport {

	
	
    /**
     * 1. 기능 : Office code search <p>
     * 2. 처리개요 : Office의 총 카운트를 조회한다.<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : hyunsu, Ryu /2006.08.03<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :<p>
     * - 수정사유/내역 :<p>
     * ===================================<br>
     * <p/>
     * @param SearchComOfcPgmMtchVO searchComOfcPgmMtchVO
     * @return int
     * @throws DAOException
     *
     */
	public int totalOffice(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws DAOException {
		int cnt  =0;
		
		
		Map params = searchComOfcPgmMtchVO.getColumnValues();

        DBRowSet dRs = null;
        try {
        	dRs = new SQLExecuter("SysComDB").executeQuery(new OfficeProgramDAOSearchCntComOfcPgmMtchRSQL(), params,params);	
    		if(dRs.next())
    			cnt = dRs.getInt("cnt");

        } catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
		
		return cnt;
	}
	
    /**
     * Office Program 매핑목록을 가져온다.<br>
     * @param searchComOfcPgmMtchVO 	SearchComOfcPgmMtchVO
     * @return  List<OfficeProgramListVO> Office Program 매핑목록 
     * @throws DAOException
     */
    public List<OfficeProgramListVO> searchOfficeProgramList(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws DAOException {
        int currentPage = searchComOfcPgmMtchVO.getIPage();
		int startNo   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
		int endNo     = Constants.PAGE_SIZE_50 * currentPage;  
		
		log.debug("currentPage: " + currentPage);
		log.debug("startNo: " + startNo);
		log.debug("endNo: " + endNo);
		
		Map params = searchComOfcPgmMtchVO.getColumnValues();
        params.put("startno", startNo);
        params.put("endno", endNo);

//        DBRowSet dRs = null;
        List<OfficeProgramListVO> vos = null;
        try {
        	vos =(List) new SQLExecuter("SysComDB").executeQuery(new OfficeProgramDAOSearchComOfcPgmMtchRSQL(), params,params,OfficeProgramListVO.class);	
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
        return vos;
    }

//    public DBRowSet searchPivotData(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws DAOException {
//        int currentPage = searchComOfcPgmMtchVO.getIPage();
//		int startNo   = Constants.PAGE_SIZE_50 * (currentPage - 1) + 1;
//		int endNo     = Constants.PAGE_SIZE_50 * currentPage;  
//		
//		log.debug("currentPage: " + currentPage);
//		log.debug("startNo: " + startNo);
//		log.debug("endNo: " + endNo);
//		
//		Map params = searchComOfcPgmMtchVO.getColumnValues();
//        params.put("startno", startNo);
//        params.put("endno", endNo);
//
//        DBRowSet dRs = null;
//        try {
//        	dRs = new SQLExecuter().executeQuery(new OfficeProgramDAOtestPivotRSQL(), params,params);	
//		} catch (SQLException se) {
//			log.error(se.getMessage(), se);
//			throw new DAOException(new ErrorHandler(se).getMessage());
//		} catch (Exception ee) {
//			log.error(ee.getMessage(), ee);
//			throw new DAOException(ee.getMessage());
//		} 
//        return dRs;
//    }

    /**
     * Office별 상위 메뉴아래 하위 메뉴리스트를 조회한다.<br>
     * @param pgmNoForm	String 상위메뉴번호
     * @param ofcCd			String 오피스 코드 
     * @return DBRowSet
     * @exception EventException
     */
    public DBRowSet searchSubmenuList(String pgmNoForm, String ofcCd)  throws DAOException {
		Map<String,Object> params = new HashMap<String,Object>();
        params.put("pgm_no_form", pgmNoForm);
        params.put("ofc_cd", ofcCd);

        DBRowSet dRs = null;
        try {
        	dRs = new SQLExecuter("SysComDB").executeQuery(new OfficeProgramDAOSearchSubMenuMappedOfcCdRSQL(), params,params);	
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ee) {
			log.error(ee.getMessage(), ee);
			throw new DAOException(ee.getMessage());
		} 
        return dRs;
    }

    /**
     * Office별 메뉴리스트를 추가한다.<br>
     * @param Collection<ComOfcPgmMtchVO> comOfcPgmMtchVOs Office별 메뉴리스트 정보 
     * @exception EventException
     */
    public void addOfficeProgram(Collection<ComOfcPgmMtchVO> comOfcPgmMtchVOs) throws DAOException{
		try {
			int[] insCnt = null;
			List<ComOfcPgmMtchVO> models = new ArrayList<ComOfcPgmMtchVO>();
			
			for(ComOfcPgmMtchVO vo:comOfcPgmMtchVOs){
				models.add(vo);
			}
			
			insCnt = new SQLExecuter("SysComDB").executeBatch(new OfficeProgramDAOComOfcPgmMtchCSQL(), models,null);
			for(int i=0;i<insCnt.length;i++){
				if(insCnt[i]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert No"+ i + " SQL");
			}

		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
   }

    /**
     * Office별 메뉴리스트를 삭제한다.<br>
     * @param Collection<ComOfcPgmMtchVO> comOfcPgmMtchVOs Office별 메뉴리스트 정보 
     * @exception EventException
     */
    public void removeOfficeProgram(Collection<ComOfcPgmMtchVO> comOfcPgmMtchVOs) throws DAOException{
		try {
			int[] delCnt = null;
			List<ComOfcPgmMtchVO> models = new ArrayList<ComOfcPgmMtchVO>();
			
			for(ComOfcPgmMtchVO vo:comOfcPgmMtchVOs){
				models.add(vo);
			}
			
			delCnt = new SQLExecuter("SysComDB").executeBatch(new OfficeProgramDAOComOfcPgmMtchDSQL(), models,null);
			for(int i=0;i<delCnt.length;i++){
				if(delCnt[i]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to delete No"+ i + " SQL");
			}

		} catch (SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
   }

}