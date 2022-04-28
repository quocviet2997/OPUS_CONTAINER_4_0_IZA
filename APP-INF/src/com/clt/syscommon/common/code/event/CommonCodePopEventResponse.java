/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePopEventResponse.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.code.event;


import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;
import com.clt.syscommon.common.table.COM_INTG_CD_DTL;



/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - CommonCodePop 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - CommonCodePop 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 *
 * @author HOESOO_JANG
 * @see CommonCodeSCSC 참조
 * @since J2EE 1.4
 */
public class CommonCodePopEventResponse extends EventResponseSupport {

	// Database ResultSet
	private DBRowSet   rowSet;

	// Success Flag
	private String successFlag;

	/**
	 * CommonCodePopEventResponse 객체를 생성
	 */
	public CommonCodePopEventResponse() {
	}

	/**
	 * CommonCodePop 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 CommonCodePopEventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 */
	public CommonCodePopEventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * CommonCodePop 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 CommonCodePopEventResponse 객체를 생성
	 * 
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public CommonCodePopEventResponse(DBRowSet rowSet, String successFlag) {
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
	 * 객체 표현 문자열(CommonCodePopEventResponse)을 반환
	 * 
	 * @return String CommonCodePopEventResponse
	 */
	public String toString() {
		return "CommonCodePopEventResponse";
	}

	/**
	 * 이벤트 명(CommonCodePopEventResponse)을 반환
	 * 
	 * @return String CommonCodePopEventResponse
	 */
	public String getEventName() {
		return "CommonCodePopEventResponse";
	}

}