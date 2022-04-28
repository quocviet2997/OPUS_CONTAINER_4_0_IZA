/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CntrTypeDBDAO.java
*@FileTitle : CntrType
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2012-02-16 민정호
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrtype.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.clt.bizcommon.cntrtype.basic.CntrTypeBCImpl;
import com.clt.bizcommon.cntrtype.vo.MdmCntrTpListVO;
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
 * @see CntrTypeBCImpl 참조
 * @since J2EE 1.4
 */
public class CntrTypeDBDAO extends DBDAOSupport {
	
	/**
	 * Container Type Code의 모든 목록을 가져온다.<br>
	 * @param MdmCntrTpListVO mdmCntrTpListVO
	 * @return List<MdmCntrTpListVO>
	 * @throws DAOException
	 */
	public List<MdmCntrTpListVO> searchMdmCntrTpList(MdmCntrTpListVO mdmCntrTpListVO) throws DAOException {
    	DBRowSet dbRowset = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		
		//List
		List<MdmCntrTpListVO> list = null; 
		try{
			
			
			if(!mdmCntrTpListVO.getCntrTpCd().equals("")) {
				param.put("cntr_tp_cd", mdmCntrTpListVO.getCntrTpCd());
				velParam.put("cntr_tp_cd", mdmCntrTpListVO.getCntrTpCd());
			}

			if(!mdmCntrTpListVO.getCntrTpDesc().equals("")) {
				param.put("cntr_tp_desc", mdmCntrTpListVO.getCntrTpDesc());
				velParam.put("cntr_tp_desc", mdmCntrTpListVO.getCntrTpDesc());
			}
						
			if(!mdmCntrTpListVO.getDeltFlg().equals("")) {
				param.put("delt_flg", mdmCntrTpListVO.getDeltFlg());
				velParam.put("delt_flg", mdmCntrTpListVO.getDeltFlg());
			}

			param.put("mdm_yn", mdmCntrTpListVO.getMdmYn());
			velParam.put("mdm_yn", mdmCntrTpListVO.getMdmYn());
			
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new CntrTypeDBDAOMdmCntrTpListRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MdmCntrTpListVO.class);
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