/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonSachDBDAO.java
*@FileTitle : Muon Sach
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.integration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.dou.muonsach.muonsach.basic.MuonSachBCImpl;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.apps.opus.dou.muonsach.muonsach.vo.MuonSachVO;


/**
 * ALPS MuonSachDBDAO <br>
 * - ALPS-MuonSach system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Vi Nguyen
 * @see MuonSachBCImpl 참조
 * @since J2EE 1.6
 */
public class MuonSachDBDAO extends DBDAOSupport {

	/**
	 * [처리대상] 정보를 [행위] 합니다.<br>
	 * 
	 * @param MuonSachVO muonSachVO
	 * @return List<MuonSachVO>
	 * @exception DAOException
	 */
	 @SuppressWarnings("unchecked")
	public List<MuonSachVO> searchMuonSach(MuonSachVO muonSachVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<MuonSachVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(muonSachVO != null){
				Map<String, String> mapVO = muonSachVO .getColumnValues();
				List<String> obj_list_no = new ArrayList<>();
				if(null != muonSachVO.getSinhvienId()){
					String[] idS = muonSachVO.getSinhvienId().split(",");
					for(int i = 0; i < idS.length; i++){
						obj_list_no.add(idS[i]);
					}
				}
				param.putAll(mapVO);
				param.put("obj_list_no", obj_list_no);
				
				velParam.putAll(mapVO);
				velParam.put("obj_list_no", obj_list_no);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new MuonSachDBDAOMuonSachVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, MuonSachVO .class);
		} catch(SQLException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}
}