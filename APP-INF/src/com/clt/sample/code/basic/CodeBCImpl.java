/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CodeBCImpl.java
*@FileTitle : Common code inquiry sample Basic command implementation class
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.05.25 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.code.basic;

import java.util.Collection;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.code.CodeInfo;
import com.clt.framework.component.util.code.CodeUtil;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.sample.code.vo.CustomVO;

/**
 * Common code inquiry sample Basic Command Class
 * Inquiry common code list
 *
 * @author Seungyol Lee
 * @see 
 * @since J2EE 1.4
 */
public class CodeBCImpl extends BasicCommandSupport implements CodeBC {
	
	/**
	 * Retrive code list<br>
	 * 
	 * @param 
	 * @return CustomVO 	Costom ValueObject
	 * @exception 
	 */	
	public CustomVO searchCodes(){
		CustomVO vo = new CustomVO();
		CodeUtil codeUtil = CodeUtil.getInstance();
		Collection<CodeInfo> codelist1 = codeUtil.getCodeSelect("CD00249", 0);
		Collection<CodeInfo> codelist2 = codeUtil.getCodeSelect("CD00250", 0);
		
		vo.setCodelist1(codelist1);
		vo.setCodelist2(codelist2);
		vo.setUsrMsg(new ErrorHandler("CGM00001").getUserMessage()); 
		
		return vo;
	}
}

