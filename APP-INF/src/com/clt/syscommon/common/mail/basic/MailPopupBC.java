/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailPopupBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 13, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.basic;

import java.io.IOException;
import java.util.List;

import com.clt.framework.table.ComUpldFileVO;
import com.clt.syscommon.common.mail.vo.MailCustomVO;


/**
 * It's MailPopupBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 13, 2009
 */
public interface MailPopupBC {

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param string 
	 * @return
	 */
	String getTemplateContent(String template, String args) throws IOException;

	List<ComUpldFileVO> exportReport(MailCustomVO mailCustomVO) throws Exception;

}
