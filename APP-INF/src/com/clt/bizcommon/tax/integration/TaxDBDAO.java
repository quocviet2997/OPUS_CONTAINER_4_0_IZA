/*=========================================================
**Copyright(c) 2012 CyberLogitec
*@FileName : TaxDBDAO.java
*@FileTitle : Tax
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.tax.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.tax.vo.ComTaxVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * Tax-BIZCOMMON에 대한 DB 처리를 담당<br>
 * - Tax-BIZCOMMON Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Shin Ja Young
 * @see TaxBCImpl 참조
 * @since J2EE 1.4
 */
public class TaxDBDAO extends DBDAOSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * OFC_CD 의 Country, India 지역 여부 조회.<br>
	 * @param ComTaxVO comTaxVO
	 * @return ComTaxVO
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ComTaxVO searchCountryInfoForOffice(ComTaxVO comTaxVO) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//VO
    	ComTaxVO resultVo = null; 
    	//List
    	List<ComTaxVO> list = null;
    	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			Map<String, String> mapVO = comTaxVO.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new TaxDBDAOSearchCountryInfoForOfficeRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComTaxVO.class);
			if (list != null && list.size() > 0) {
				resultVo = (ComTaxVO) list.get(0);
			}
			
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return resultVo;
	}

	/**
	 * MDM_VENDR에서 India Tax 정보 조회.<br>
	 * @param ComTaxVO comTaxVO
	 * @return ComTaxVO
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ComTaxVO searchIndiaTaxInfo(ComTaxVO comTaxVO) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null;
		//VO
    	ComTaxVO resultVo = null; 
    	//List
    	List<ComTaxVO> list = null;
    	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			Map<String, String> mapVO = comTaxVO.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new TaxDBDAOSearchIndiaTaxInfoRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComTaxVO.class);
			if (list != null && list.size() > 0) {
				resultVo = (ComTaxVO) list.get(0);
			}
			
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return resultVo;
	}

	/**
	 * MDM_VENDR에서 India Tax Vendor SAC 조회.<br>
	 * @param ComTaxVO comTaxVO
	 * @return List<ComTaxVO>
	 * @throws DAOException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<ComTaxVO> searchIndiaTaxVendorSacList(ComTaxVO comTaxVO) throws DAOException {
		
		// PDTO(Data Transfer Object including Parameters)
    	DBRowSet dbRowset = null; 
    	//List
    	List<ComTaxVO> list = null;
    	
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		try{
			Map<String, String> mapVO = comTaxVO.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new TaxDBDAOSearchIndiaTaxVendorSacListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ComTaxVO.class);
			
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