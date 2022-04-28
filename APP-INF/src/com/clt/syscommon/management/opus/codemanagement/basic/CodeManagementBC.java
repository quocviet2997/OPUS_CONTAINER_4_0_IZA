/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodepublishBC.java
*@FileTitle : 공통코드관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-07
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-07 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.codemanagement.event.CodeManagementEventResponse;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtDtlVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtMstVO;

/**
 * edm-edm Business Logic Command Interface<br>
 * - edm-edm에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see CodeManagementEventResponse 참조
 * @since J2EE 1.4
 */
public interface CodeManagementBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String[]
	 * @exception EventException
	 */
	public String[] searchSubSystemCodeList() throws EventException ;
	
	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String
	 * @exception EventException
	 */
	public String searchMaxIntgCdId() throws EventException ;

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_EDM_001 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param CodeMgmtMstVO[] codeMgmtMstVOs
	 * @param SignOnUserAccount a
	 * @exception EventException
	 */
	public void multiCodeMgmtMst(CodeMgmtMstVO[] codeMgmtMstVOs, SignOnUserAccount a) throws EventException;
	
	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_EDM_001 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param CodeMgmtDtlVO[] codeMgmtDtlVOs
	 * @param SignOnUserAccount a
	 * @exception EventException
	 */
	public void multiCodeMgmtDtl(CodeMgmtDtlVO[] codeMgmtDtlVOs, SignOnUserAccount a) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Codepublish화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchAPPCodeList(Event e) throws EventException;

	/**
	 * 조회 이벤트 처리<br>
	 * Codepublish화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchAPPCodeDetailList(Event e) throws EventException;


}