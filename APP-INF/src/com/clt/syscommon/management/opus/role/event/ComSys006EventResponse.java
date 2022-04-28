/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_006EventResponse.java
*@FileTitle : 사용자, 역할, 프로그램
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;



/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - UI_COM_SYS_006 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - UI_COM_SYS_006 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 *
 * @author SeongWook Kim
 * @see RoleManagementSC 참조
 * @since J2EE 1.4
 */
public class ComSys006EventResponse extends EventResponseSupport {

	// Database ResultSet
	private DBRowSet   rowSet;

	// Success Flag
	private String successFlag;

	/**
	 * UI_COM_SYS_006EventResponse 객체를 생성
	 */
	public ComSys006EventResponse() {
	}

	/**
	 * UI_COM_SYS_006 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 UI_COM_SYS_006EventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 */
	public ComSys006EventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * UI_COM_SYS_006 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 UI_COM_SYS_006EventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public ComSys006EventResponse(DBRowSet rowSet, String successFlag) {
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
	 * return SuccessFlg
	 */
	public String getSuccessFlag() {
		return this.successFlag ;
	}

	/**
	 * 객체 표현 문자열(UI_COM_SYS_006EventResponse)을 반환
	 * 
	 * @return String UI_COM_SYS_006EventResponse
	 */
	public String toString() {
		return "UI_COM_SYS_006EventResponse";
	}

	/**
	 * 이벤트 명(UI_COM_SYS_006EventResponse)을 반환
	 * 
	 * @return String UI_COM_SYS_006EventResponse
	 */
	public String getEventName() {
		return "UI_COM_SYS_006EventResponse";
	}

}