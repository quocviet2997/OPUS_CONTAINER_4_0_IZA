/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_011EventResponse.java
*@FileTitle : 프로그램별 역할매핑 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-10
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2006-11-10 Kildong_hong
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;
import com.clt.syscommon.common.table.ComPgmRoleVO;



/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - UI_COM_SYS_011 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - UI_COM_SYS_011 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 *
 * @author Kildong_hong
 * @see RoleMappingManagementSCSC 참조
 * @since J2EE 1.4
 */
public class ComSys011EventResponse extends EventResponseSupport {

	// Database ResultSet
	private DBRowSet   rowSet;

	// Success Flag
	private String successFlag;

	/**
	 * UI_COM_SYS_011EventResponse 객체를 생성
	 */
	public ComSys011EventResponse() {
	}

	/**
	 * UI_COM_SYS_011 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 UI_COM_SYS_011EventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 */
	public ComSys011EventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * UI_COM_SYS_011 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 UI_COM_SYS_011EventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public ComSys011EventResponse(DBRowSet rowSet, String successFlag) {
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
	 * 객체 표현 문자열(UI_COM_SYS_011EventResponse)을 반환
	 * 
	 * @return String UI_COM_SYS_011EventResponse
	 */
	public String toString() {
		return "UI_COM_SYS_011EventResponse";
	}

	/**
	 * 이벤트 명(UI_COM_SYS_011EventResponse)을 반환
	 * 
	 * @return String UI_COM_SYS_011EventResponse
	 */
	public String getEventName() {
		return "UI_COM_SYS_011EventResponse";
	}

}