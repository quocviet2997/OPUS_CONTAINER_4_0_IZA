/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CntrSizeDBDAO.java
*@FileTitle : CntrSize
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2012-02-16 민정호
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrsize.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.cntrsize.basic.CntrSizeBCImpl;
import com.clt.bizcommon.cntrsize.vo.MdmCntrSzListVO;
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
 * @see CntrSizeBCImpl 참조
 * @since J2EE 1.4
 */
public class CntrSizeDBDAO extends DBDAOSupport {
	
	
	/**
	 * Container Size Code의 모든 목록을 가져온다.<br>
	 * @param MdmCntrSzListVO mdmCntrSzListVO
	 * @return List<MdmCntrSzListVO>
	 * @throws DAOException
	 */
	public List<MdmCntrSzListVO> searchMdmCntrSzList(MdmCntrSzListVO mdmCntrSzListVO) throws DAOException {
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		//List
		List<MdmCntrSzListVO> list = null; 
		try{
			
			
			if(!mdmCntrSzListVO.getCntrSzCd().equals("")) {
				param.put("cntr_sz_cd", mdmCntrSzListVO.getCntrSzCd());
				velParam.put("cntr_sz_cd", mdmCntrSzListVO.getCntrSzCd());
			}

			if(!mdmCntrSzListVO.getCntrSzDesc().equals("")) {
				param.put("cntr_sz_desc", mdmCntrSzListVO.getCntrSzDesc());
				velParam.put("cntr_sz_desc", mdmCntrSzListVO.getCntrSzDesc());
			}
						
			if(!mdmCntrSzListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", mdmCntrSzListVO.getDeltFlg());
				velParam.put("delt_flg", mdmCntrSzListVO.getDeltFlg());
			}

			param.put("mdm_yn", mdmCntrSzListVO.getMdmYn());
			velParam.put("mdm_yn", mdmCntrSzListVO.getMdmYn());
			
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CntrSizeDBDAOMdmCntrSzListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MdmCntrSzListVO.class);
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