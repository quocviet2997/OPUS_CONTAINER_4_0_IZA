/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PackageTypeDAO.java
*@FileTitle : Package Table
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.16
*@LastModifier : 우지석
*@LastVersion : 1.0
* 2009.04.16 우지석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.packagetype.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.packagetype.basic.PackageTypeBCImpl;
import com.clt.bizcommon.packagetype.vo.PackageTypeVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;


/**
 * NIS2010 PackageTypeDBDAO <br>
 * - NIS2010-BizCommon system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Ji Seok Woo
 * @see PackageTypeBCImpl 참조
 * @since J2EE 1.4
 */
public class PackageTypeDBDAO extends DBDAOSupport {

	/**
	 * PackageTypeDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param PackageTypeVO packagetypevo
	 * @return List<PackageTypeVO>
	 * @Exception DAOException
	 */
	 @SuppressWarnings("unchecked")
//	public List<PackageTypeVO> searchPackageTypeVO(PackageTypeVO packagetypevo) throws DAOException {
	public List<PackageTypeVO> searchPackageTypeList(PackageTypeVO packagetypevo) throws DAOException {
		DBRowSet dbRowset = null;
		List<PackageTypeVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(packagetypevo != null){
				Map<String, String> mapVO = packagetypevo .getColumnValues();
				String mdmYn = packagetypevo.getMdmYN();
				if(!"".equals(mdmYn)){
					param.put("mdm_yn", mdmYn);
					velParam.put("mdm_yn", mdmYn);
				}
				
				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new PackageTypeDBDAOPackageTypeVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, PackageTypeVO .class);
            log.debug("Packages Table 조회 PackageTypeDAO searchPackageTypeList");
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
