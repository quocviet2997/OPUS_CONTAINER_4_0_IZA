/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizComException.java
*@FileTitle : 공통
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.util;

/**
 * 업무공통에서 사용하는 공통 코드 등을 구현<br>
 * @author Hyung Choon_Roh
 * @see 
 * @since J2EE 1.4
 */
public class BizComException extends RuntimeException {

    /**
     * 1. 기능 : BizComException 생성자<p>
     * 2. 처리개요 :  <p>
     *    - BizComException 객체를 생성<p>
     * 3. 주의사항 : <p>
     *
     **/
    public BizComException() {
    }

    /**
     * 1. 기능 : BizComException 생성자<p>
     * 2. 처리개요 :  <p>
     *    - BizComException 객체를 생성<p>
     * 3. 주의사항 : <p>
     *
     * @param str 에러 setting String
     **/
    public BizComException(String str) {
        super(str);
    }
}
