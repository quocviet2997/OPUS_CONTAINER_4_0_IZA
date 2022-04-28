/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileManagementBC.java
*@FileTitle : File Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.file.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.table.ComUpldFileVO;

/**
 * NIS2010-File Business Logic Command Interface<br>
 * - NIS2010-File에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @see Ui_com_fileuploadEventResponse 참조
 * @since J2EE 1.4
 */

public interface FileManagementBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Filemanagement화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e Ui_com_fileuploadEvent
	 * @return EventResponse Ui_com_fileuploadEventResponse
	 * @exception EventException
	 */
	public List<ComUpldFileVO> getComUpldFile(ComUpldFileVO comUpldFileVO) throws EventException;
	/**
	 * 멀티 이벤트 처리<br>
	 * Filemanagement 화면에 대한 멀티 이벤트 처리<br>
	 * @author Jeong-Hoon, KIM
	 * @param comUpldFileVO
	 * @param account
	 * @throws EventException
	 */
	public void deleteFileComUpldFile(ComUpldFileVO[] comUpldFileVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * 멀티 이벤트 처리<br>
	 * Filemanagement 화면에 대한 멀티 이벤트 처리<br>
	 * @author Jeong-Hoon, KIM
	 * @param comUpldFileVO
	 * @param account
	 * @throws EventException
	 */
	public void deleteComUpldFile(ComUpldFileVO[] comUpldFileVO,SignOnUserAccount account) throws EventException;
}