/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FtpSendEvent.java
*@FileTitle : FTP_SEND
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.04 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.ftp.send.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComFtpSndInfoVO;


/**
 * FTP_SEND 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  FTP_SENDHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see FTP_SENDHTMLAction 참조
 * @since J2EE 1.6
 */

public class FtpSendEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComFtpSndInfoVO comFtpSndInfoVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComFtpSndInfoVO[] comFtpSndInfoVOs = null;

	public FtpSendEvent(){}
	
	public void setComFtpSndInfoVO(ComFtpSndInfoVO comFtpSndInfoVO){
		this. comFtpSndInfoVO = comFtpSndInfoVO;
	}

	public void setComFtpSndInfoVOS(ComFtpSndInfoVO[] comFtpSndInfoVOs){
		this. comFtpSndInfoVOs = comFtpSndInfoVOs;
	}

	public ComFtpSndInfoVO getComFtpSndInfoVO(){
		return comFtpSndInfoVO;
	}

	public ComFtpSndInfoVO[] getComFtpSndInfoVOS(){
		return comFtpSndInfoVOs;
	}

}