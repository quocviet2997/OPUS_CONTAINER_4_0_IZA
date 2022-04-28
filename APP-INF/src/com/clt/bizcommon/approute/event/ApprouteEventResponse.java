/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ApprouteEventResponse.java
*@FileTitle : ApprouteEventResponse PopUp
*Open Issues :
*Change history :
*@LastModifyDate : 2008-08-29
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2008-08-29 Jeong-Hoon, KIM
* 1.0 최초 생성
=========================================================*/ 
package com.clt.bizcommon.approute.event;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;

/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - Approute 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - Approute 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 * 
 * @author Jeong-Hoon, KIM
 * @see BIZCOMMONSC 참조
 * @since J2EE 1.4
 *
 * 2008. 09. 01
 */
public class ApprouteEventResponse extends EventResponseSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DBRowSet   rowSet;
	
	/**
	 * 이벤트 명(ApprouteEventResponse)을 반환
	 * 
	 * @return String ApprouteEventResponse
	 */
	public String getEventName() {
		return "ApprouteEventResponse";
	}
	
	private int cnt = 0;
	
	private String successFlag;

	/**
	 * ApprouteEventResponse 객체를 생성
	 */
	public ApprouteEventResponse() {
	}

	/**
	 * Approute 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 ApprouteEventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 */
	public ApprouteEventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * Approute 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 ApprouteEventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public ApprouteEventResponse(DBRowSet rowSet, String successFlag) {
		this.rowSet=rowSet;
		this.successFlag=successFlag;
	}

	/**
	 * DB ResultSet 반환작업
	 * 
	 * @return DBRowSet 서버 실행 결과
	 */
	public DBRowSet getRs() {
		return this.rowSet;
	}

	/**
	 * SuccessFlg 반환<br>
	 * @return 
	 */
	public String getSuccessFlag() {
		return this.successFlag ;
	}
	
	/**
	 * Count 반환<br>
	 * @return
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * Count 세팅<br>
	 * @param cnt
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
