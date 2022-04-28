/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MessageEventResponse.java
*@FileTitle : Message
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.02 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.event;

import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;


/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - Message 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - Message 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 * @author Jung_InSun
 * @see MessageHTMLAction 참조
 * @since J2EE 1.4
 */

public class MessageEventResponse extends EventResponseSupport {

	private DBRowSet rowSet = null;					// DB 조회결과
	private List<DBRowSet> lstRowSet = null;		// 다건의 DB 조회결과
	private String successFlag = null;				// Success Flag

	/**
	 * MessageEventResponse 객체를 생성<br>
	 */
	public MessageEventResponse() {	}

	/**
	 * Message 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 scheduleEventResponse 객체를 생성<br>
	 * @param rowSet 서버 실행 결과<br>
	 */
	public MessageEventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * Message 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 scheduleEventResponse 객체를 생성<br>
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public MessageEventResponse(DBRowSet rowSet, String successFlag) {
		this.rowSet = rowSet;
		this.successFlag = successFlag;
	}

	/**
	 * DB ResultSet 반환작업<br>
	 * @return DBRowSet 서버 실행 결과 
	 */
	public DBRowSet getRs() {
		return this.rowSet;
	}

	/**
	 * DB ResultSet 반환작업<br>
	 * @return List<DBRowSet> 서버 실행 결과
	 */
	public List<DBRowSet> getRsList() {
		return this.lstRowSet;
	}

	/**
	 * return SuccessFlg<br>
	 * @return String 성공여부
	 */
	public String getSuccessFlag() {
		return this.successFlag ;
	}
}
