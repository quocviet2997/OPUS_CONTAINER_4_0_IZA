/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ServiceProviderDBDAO.java
*@FileTitle : ServiceProvider정보조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : sungseok, choi
*@LastVersion : 1.0
* 2006-08-07 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.serviceprovider.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.comm.Constants;
import com.clt.bizcommon.serviceprovider.vo.SpListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

  
/**
 * ENIS-BIZCOMMON에 대한 DB 처리를 담당<br>
 * ENIS-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author 		sungseok, choi
 * @see 		ServiceProviderImpl 참조
 * @since 		J2EE 1.4
 */
public class ServiceProviderDBDAO extends DBDAOSupport {

    /**
     * 1. 기능 : CntrRepoPlanManage<p>
     * 2. 처리개요 : RePo Plan의 총 카운트를 조회한다.<p>
     * - CntrRepoPlanManage<p>
     * 3. 주의사항 : <p>
     * ===================================<br>
     * 4. 작성자/작성일 : paksangyool/2006.06.29<br>
     * ===================================<br>
     * 5. 수정사항<p>
     * 5.1 요구사항 ID :<p>
     * - 수정자/수정일 :  sungseokchoi/2006.08.08<p>
     * - 수정사유/내역 :  ServiceProvider 내역 추가<p>
     * ===================================<br>
     * <p/>
     * @param SpListVO spListVO
     * @return int
     * @throws DAOException
     */
	public int totalServiceProvider(SpListVO spListVO) throws DAOException {
		DBRowSet dbRowset = null;
    	//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		if(!spListVO.getCntCd().equals("")) {
			param.put("cnt_cd", spListVO.getCntCd());
			velParam.put("cnt_cd", spListVO.getCntCd());
		}
		if(!spListVO.getVndrNmEng().equals("")) {
			param.put("vndr_nm_eng", spListVO.getVndrNmEng());
			velParam.put("vndr_nm_eng", spListVO.getVndrNmEng());
		}
		if(!spListVO.getOfcCd().equals("")) {
			param.put("ofc_cd", spListVO.getOfcCd());
			velParam.put("ofc_cd", spListVO.getOfcCd());
		}
		if(!spListVO.getPtsVndrCd().equals("")) {
			param.put("pts_vndr_cd", spListVO.getPtsVndrCd());
			velParam.put("pts_vndr_cd", spListVO.getPtsVndrCd());
		}
		if(!spListVO.getVndrCd().equals("")) {
			param.put("vndr_cd", spListVO.getVndrCd());
			velParam.put("vndr_cd", spListVO.getVndrCd());
		}
		if(!spListVO.getMdmYn().equals("")) {
			param.put("mdm_yn", spListVO.getMdmYn());
			velParam.put("mdm_yn", spListVO.getMdmYn());
		}
		if(!spListVO.getDeltFlg().equals("")) {
			param.put("delt_flg", spListVO.getDeltFlg());
			velParam.put("delt_flg", spListVO.getDeltFlg());
		}
		if(!spListVO.getModiVndrCd().equals("")) {
			param.put("modi_vndr_cd", spListVO.getModiVndrCd());
			velParam.put("modi_vndr_cd", spListVO.getModiVndrCd());
		}
		if(spListVO.getPSpType().equals("Y")) {
			velParam.put("lgs_flg", spListVO.getPSpType());
		}
		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ServiceProviderDAOSpCountRSQL(), param, velParam);
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
     * Service Provider 조회<br>
     * @param SpListVO spListVO
     * @param int iPage
     * @return List<SpListVO>
     * @throws DAOException
     */
    public List<SpListVO> searchServiceProviderList(SpListVO spListVO, int iPage) throws DAOException {
        
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
        
        // 페이징 처리
		int currentPage = iPage;
		int startPart   = Constants.PAGE_SIZE_100 * 2 * (currentPage - 1) + 1; // 2015.03.04 set default page size 200
		int endPart     = Constants.PAGE_SIZE_100 * 2 * currentPage;
		
		//List
		List<SpListVO> list = null; 
		
		if(!spListVO.getCntCd().equals("")) {
			param.put("cnt_cd", spListVO.getCntCd());
			velParam.put("cnt_cd", spListVO.getCntCd());
		}
		if(!spListVO.getVndrNmEng().equals("")) {
			param.put("vndr_nm_eng", spListVO.getVndrNmEng());
			velParam.put("vndr_nm_eng", spListVO.getVndrNmEng());
		}
		if(!spListVO.getOfcCd().equals("")) {
			param.put("ofc_cd", spListVO.getOfcCd());
			velParam.put("ofc_cd", spListVO.getOfcCd());
		}
		if(!spListVO.getPtsVndrCd().equals("")) {
			param.put("pts_vndr_cd", spListVO.getPtsVndrCd());
			velParam.put("pts_vndr_cd", spListVO.getPtsVndrCd());
		}
		if(!spListVO.getVndrCd().equals("")) {
			param.put("vndr_cd", spListVO.getVndrCd());
			velParam.put("vndr_cd", spListVO.getVndrCd());
		}
		if(!spListVO.getMdmYn().equals("")) {
			param.put("mdm_yn", spListVO.getMdmYn());
			velParam.put("mdm_yn", spListVO.getMdmYn());
		}
		if(!spListVO.getDeltFlg().equals("")) {
			param.put("delt_flg", spListVO.getDeltFlg());
			velParam.put("delt_flg", spListVO.getDeltFlg());
		}
		if(!spListVO.getModiVndrCd().equals("")) {
			param.put("modi_vndr_cd", spListVO.getModiVndrCd());
			velParam.put("modi_vndr_cd", spListVO.getModiVndrCd());
		}
		if(spListVO.getPSpType().equals("Y")) {
			velParam.put("lgs_flg", spListVO.getPSpType());
		}
		param.put("startpart", startPart);
		param.put("endpart", endPart);

		try {
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ServiceProviderDAOSpListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SpListVO.class);
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