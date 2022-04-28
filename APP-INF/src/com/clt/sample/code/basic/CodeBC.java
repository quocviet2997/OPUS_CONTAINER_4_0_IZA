/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CodeBC.java
*@FileTitle : Common code Basic command interface
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.05.25 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.code.basic;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.sample.code.vo.CustomVO;

/**
 * Common code inquiry sample Basic Command Interface
 * Inquiry common code list
 *
 * @author Seungyol Lee
 * @see 
 * @since J2EE 1.4
 */
public interface CodeBC {
	/**
	 * Retrive code list<br>
	 * 
	 * @param 
	 * @return CustomVO 	Costom ValueObject
	 * @exception 
	 */
	public CustomVO searchCodes();
}
