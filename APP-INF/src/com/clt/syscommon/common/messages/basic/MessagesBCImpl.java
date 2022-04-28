/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : MessagesBCImpl.java
 *@FileTitle : Message
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.01.02
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2009.01.02 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.messages.event.MessageEvent;
import com.clt.syscommon.common.messages.integration.MessagesDAO;
import com.clt.syscommon.common.table.ComMsgRcvVO;
import com.clt.syscommon.common.table.ComMsgSndVO;
import com.clt.utilitybox.utility.CheckUtilities;

/**
 * NIS2010-Messages Business Logic Basic Command implementation<br>
 * - NIS2010-Messages에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Jung_InSun
 * @see MessageEventResponse,MessagesBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class MessagesBCImpl extends BasicCommandSupport implements MessagesBC {

	// Database Access Object
	private transient MessagesDAO dbDao = null;

	/**
	 * $MessagesBCImpl 객체 생성<br>
	 * MessagesDBDAO를 생성한다.<br>
	 */
	public MessagesBCImpl() {
		dbDao = new MessagesDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Messages화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SignOnUserAccount account
	 * @return List[]
	 * @exception EventException
	 */
	public List[] searchMessagesList(SignOnUserAccount account) throws EventException {
		try {
			return dbDao.searchMessagesList(account);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Main 화면의 메세지 체크 이벤트 처리<br>
	 * 
	 * @param usrId String
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet checkMessagesList(String usrId) throws EventException {

		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
		DBRowSet rowSet = null;

		try {
			rowSet = dbDao.checkMessagesList(usrId);

			return rowSet;
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 생성 이벤트 처리<br>
	 * Messages화면에 대한 생성 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @exception EventException
	 */
	public void addComMessages(Event e) throws EventException {
		MessageEvent event = (MessageEvent) e;

		try {

			String msgId = dbDao.getMaxSequence();
			ComMsgSndVO sndVo = event.getComMsgSnd();
			ComMsgRcvVO rcvVo = event.getComMsgRcv();
			
			sndVo.setMsgId(msgId);
			sndVo.setSndrUsrId(event.getSignOnUserAccount().getUsr_id());
			sndVo.setSndrUsrNm(event.getSignOnUserAccount().getUsr_nm());
			sndVo.setCreUsrId(event.getSignOnUserAccount().getUsr_id());
			sndVo.setKepFlg((sndVo.getKepFlg().equals("on"))?"Y":"N");
			dbDao.addComMgsSnd(event.getComMsgSnd());

			rcvVo.setMsgId(msgId);
			rcvVo.setCreUsrId(event.getSignOnUserAccount().getUsr_id());
			addComMsgRcv(rcvVo);

		} catch (Exception de) {
			log.error("addComMessages error : " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 
	 * addComMsgRcv
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @param rcvVo
	 * @param rcvrUsrId
	 * @param rcvrUsrNm
	 * @throws DAOException
	 * @throws Exception void
	 */
	void addComMsgRcv(ComMsgRcvVO rcvVo) throws DAOException, Exception {
		String[] rcvrUsrId = rcvVo.getRcvrUsrId().split(",");
		String[] rcvrUsrNm = rcvVo.getRcvrUsrNm().split(",");
		for ( int i=0 ; i < rcvrUsrId.length ; i++ ) {
			if(!CheckUtilities.isNullAndNullString(rcvrUsrId[i]) && !CheckUtilities.isNullAndNullString(rcvrUsrNm[i])){
				rcvVo.setRcvrUsrId(rcvrUsrId[i]);
				rcvVo.setRcvrUsrNm(rcvrUsrNm[i]);
				dbDao.addComMgsRcv(rcvVo);
			} else{
				log.error("Receiver Definition Error [" + rcvVo.getRcvrUsrId() + "] ["+rcvVo.getRcvrUsrNm()+"]");
			}
		}
	}

	/**
	 * 수정 이벤트 처리<br>
	 * Messages 화면에 대한 수정 이벤트 처리<br>
	 * 
	 * @param event MessageEvent
	 * @exception EventException
	 */
	public void modifyMessage(MessageEvent event) throws EventException {

		try {
			dbDao.modifyMessage(event);

		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
}
