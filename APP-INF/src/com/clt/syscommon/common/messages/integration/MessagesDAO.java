/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : MessagesDAO.java
 *@FileTitle : Message
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.01.02
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2009.01.02 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.integration;

import java.sql.SQLException;
import java.util.ArrayList;
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
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.messages.basic.MessagesBCImpl;
import com.clt.syscommon.common.messages.event.MessageEvent;
import com.clt.syscommon.common.messages.vo.ComMsgDataVO;
import com.clt.syscommon.common.messages.vo.ComMsgDpsVO;
import com.clt.syscommon.common.table.ComMsgRcvVO;
import com.clt.syscommon.common.table.ComMsgSndVO;

/**
 * NIS2010 MessagesDAO <br>
 * - NIS2010-Messages system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Jung_InSun
 * @see MessagesBCImpl 참조
 * @since J2EE 1.4
 */
public class MessagesDAO extends DBDAOSupport {

	/**
	 * MessagesDAO의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param SignOnUserAccount account
	 * @return List[]
	 * @throws DAOException
	 */
	public List[] searchMessagesList(SignOnUserAccount account) throws DAOException {
		List[] voList = new ArrayList[3];

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("usr_id", account.getUsr_id());
		param.put("ofc_cd", account.getOfc_cd());

		try {
			DBRowSet dbRowsetRcv = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new MessagesDAOComMgsRcvRSQL(), param, null);
			DBRowSet dbRowsetSnd = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new MessagesDAOComMgsSndRSQL(), param, null);
			DBRowSet dbRowsetKep = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new MessagesDAOComMgsDpsRSQL(), param, null);
			voList[0] = (List)RowSetUtil.rowSetToVOs(dbRowsetRcv, ComMsgDataVO.class);
			voList[1] = (List)RowSetUtil.rowSetToVOs(dbRowsetSnd, ComMsgDataVO.class);
			voList[2] = (List)RowSetUtil.rowSetToVOs(dbRowsetKep, ComMsgDpsVO.class);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return voList;
	}

	/**
	 * 
	 * @param String usr_id
	 * @return DBRowSet
	 * @throws DAOException
	 */
	public DBRowSet checkMessagesList(String usr_id) throws DAOException {
		DBRowSet dbRowset = null;

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("usr_id", usr_id);
		try {

			dbRowset = new SQLExecuter("SysComDB").executeQuery((ISQLTemplate) new MessagesDAOComMgsRcvCheckRSQL(), param, null);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return dbRowset;
	}

	/**
	 * MessagesDAO의 메세지 발신 정보 추가<br>
	 * 
	 * @param vo 메세지 발신 정보
	 * @see MessagesDAOEvent
	 * @throws DAOException
	 */
	public void addComMgsSnd(ComMsgSndVO vo) throws DAOException, Exception {

		Map<String, Object> param = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			param.putAll(mapVO);

			new SQLExecuter("SysComDB").executeUpdate((ISQLTemplate) new MessagesDAOComMgsSndCSQL(), param, null);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * MessagesDAO의 메세지 수신 정보 추가<br>
	 * 
	 * @param vo 메세지 수신 정보 
	 * @see MessagesDAOEvent
	 * @throws DAOException
	 */
	public void addComMgsRcv(ComMsgRcvVO vo) throws DAOException, Exception {

		Map<String, Object> param = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = vo.getColumnValues();
			param.putAll(mapVO);

			new SQLExecuter("SysComDB").executeUpdate((ISQLTemplate) new MessagesDAOComMgsRcvCSQL(), param, null);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

	}

	/**
	 * MessagesDAO의 데이타 모델을 수정한다.<br>
	 * 
	 * @param event MessageEvent
	 * @see MessageEvent
	 * @throws DAOException
	 */
	public void modifyMessage(MessageEvent event) throws DAOException {

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("msg_id", event.getMsgId());
		param.put("usr_id", event.getUsrId());
		HashMap<String, Object> velParam = new HashMap<String, Object>();
		velParam.put("div", event.getDiv());
		velParam.put("delt_flg", event.getDeltFlg());
		velParam.put("kep_flg", event.getKepFlg());
		velParam.put("rcv_dt", event.getRcvDt());
		velParam.put("usr_id", event.getUsrId());
		try {

			new SQLExecuter("SysComDB").executeUpdate((ISQLTemplate) new MessagesDAOMessageUSQL(), param, velParam);

		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 업무시스템에서 자동으로 Message Insert 하기 위한 메소드..
	 * 
	 * @param params
	 * @return
	 */
	public String messageInset(Map<String, Object> params) {
		SQLExecuter sqlExe = new SQLExecuter("SysComDB");
		params.put("cre_usr_id", "SYSTEM");
		DBRowSet row;
		try {
			row = sqlExe.executeQuery((ISQLTemplate) new MessagesDAOComMgsSndIDMexRSQL(), params, null);
			if (row.next()) {
				params.put("msg_id", row.getObject(1));
			}
			sqlExe.executeUpdate((ISQLTemplate) new MessagesDAOComMgsSndCSQL(), params, null);
			sqlExe.executeUpdate((ISQLTemplate) new MessagesDAOComMgsRcvCSQL(), params, null);
		} catch (SQLException e) {
			log.error(e.getMessage(), e);
		} catch (DAOException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return params.get("msg_id").toString();
	}

	public String getMaxSequence() throws SQLException, DAOException {
		String rtn = "";
		SQLExecuter sqlExe = new SQLExecuter("SysComDB");
		DBRowSet row = sqlExe.executeQuery((ISQLTemplate) new MessagesDAOComMgsSndIDMexRSQL(), null, null);
		if (row.next()) {
			rtn =  row.getString(1);
		}
		return rtn;
	}

}
