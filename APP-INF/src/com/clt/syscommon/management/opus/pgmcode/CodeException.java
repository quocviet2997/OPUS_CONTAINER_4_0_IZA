/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeException.java
*@FileTitle : 시스템코드 조회 예회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-12-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.pgmcode;

/**
 * 클래스 개요    : 코드에러 Class <p><p>
 * <p/>
 * 작성일 : 2006.12.17.<p>
 *
 * @see CodeInfo,CodeUtil 참조
 * @since J2EE 1.4
 * @author 김성욱
 * @version 1.0
 */
public class CodeException extends RuntimeException {

	/**
	 * 기능 : CodeException 생성자<p>
	 * 2. 처리개요 :  <p>
	 *    - CodeException 객체를 생성<p>
	 * 3. 주의사항 : <p>
	 *
	 **/
	public CodeException() {
	}

	/**
	 * 기능 : CodeException 생성자<p>
	 * 2. 처리개요 :  <p>
	 *    - CodeException 객체를 생성<p>
	 * 3. 주의사항 : <p>
	 *
	 * @param str 에러 setting String
	 **/
	public CodeException(String str) {
		super(str);
	}
	/**
	 * 기능 : CodeException 생성자<p>
	 * 2. 처리개요 :  <p>
	 *    - CodeException 객체를 생성<p>
	 * 3. 주의사항 : <p>
	 *
	 * @param str 에러 setting String
	 * @param Throwable throwable
	 **/
	public CodeException(String str, Throwable throwable) {
		super(str, throwable);
	}
}
