/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : ComEmlSndDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.AtchFileVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.CtntVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.InfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.RptDsgnXptInfoVO;

/**
 * ComEmlSndDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 21.
 */
public class ComEmlSndDAO extends DBDAOSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8419155933763328273L;

	/**
	 * 
	 * getComEmlSndInfo
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException InfoVO
	 */
	public ComEmlSndInfoVO getComEmlSndInfo(String emlSndNo) throws DAOException {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("eml_snd_no", emlSndNo);
		try{
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ComEmlSndDAOInfoRSQL(), param, param);
			List<?> list = (List<?>)RowSetUtil.rowSetToVOs(dbRowset, ComEmlSndInfoVO.class);
			return (ComEmlSndInfoVO)list.get(0);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * getEmlSndCtntVO
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException CtntVO
	 */
	public CtntVO getEmlSndCtntVO(String emlSndNo) throws DAOException {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("eml_snd_no", emlSndNo);
		try{
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ComEmlSndDAOCtntRSQL(), param, param);
			List<?> list = (List<?>)RowSetUtil.rowSetToVOs(dbRowset, CtntVO.class);
			return (CtntVO)list.get(0);
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * getAtchFileVOs
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException List<AtchFileVO>
	 */
	public List<AtchFileVO> getAtchFileVOs(String emlSndNo) throws DAOException {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("eml_snd_no", emlSndNo);
		try{
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ComEmlSndDAOAtchFileRSQL(), param, param);
			List list = (List)RowSetUtil.rowSetToVOs(dbRowset, AtchFileVO.class);
			return list;
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 
	 * getRptDsgnXptInfoVO
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException List<RptDsgnXptInfoVO>
	 */
	public List<RptDsgnXptInfoVO> getRptDsgnXptInfoVO(String emlSndNo) throws DAOException {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("eml_snd_no", emlSndNo);
		try{
			DBRowSet dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate)new ComEmlSndDAORptDsgnXptInfoRSQL(), param, param);
			List list = (List)RowSetUtil.rowSetToVOs(dbRowset, RptDsgnXptInfoVO.class);
			return list;
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

}

