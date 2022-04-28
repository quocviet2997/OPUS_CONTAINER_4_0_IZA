/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SendBC.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.table.ComFtpSndInfoVO;

/**
 * ALPS-Ftp Business Logic Command Interface<br>
 * - ALPS-Ftp에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Ftp_sendEventResponse 참조
 * @since J2EE 1.6
 */

public interface SendBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComFtpSndInfoVO	comFtpSndInfoVO
	 * @return List<ComFtpSndInfoVO>
	 * @exception EventException
	 */
	public List<ComFtpSndInfoVO> retrieveFtp(ComFtpSndInfoVO comFtpSndInfoVO) throws EventException;
}