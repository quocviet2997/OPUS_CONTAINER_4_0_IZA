/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 6.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public class MailEvent extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5677672704195938174L;
	private MailCustomVO mailCustomVO;

	/**
	 * setMailCustomVO.
	 * @author Jeong-Hoon, KIM
	 * @param mailCustomVO
	 */
	public void setMailCustomVO(MailCustomVO mailCustomVO) {
		this.mailCustomVO = mailCustomVO;
	}

	/**
	 * getMailCustomVO.
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public MailCustomVO getMailCustomVO(){
		return this.mailCustomVO;
	}
}
