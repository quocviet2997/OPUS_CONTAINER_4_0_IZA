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
package com.clt.syscommon.management.opus.faxmanagement.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.faxmanagement.vo.FaxMgmtCondVO;


/**
 * edm-edm Business Logic Command Interface<br>
 * - edm-edm에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author SeongWook Kim
 * @see FaxManagementEventResponse 참조
 * @since J2EE 1.4
 */
public interface FaxManagementBC  {
	

	/**
	 * 
	 * searchFaxDataList
	 * @author Jeong-Hoon, KIM
	 * @param e
	 * @return
	 * @throws EventException DBRowSet
	 */
	public DBRowSet searchFaxDataList(Event e) throws EventException ;
	

	/**
	 * 
	 * multiFaxMgmtMst
	 * @author Jeong-Hoon, KIM
	 * @param faxMgmtMstVOs
	 * @param account
	 * @throws EventException void
	 */
	public void multiFaxMgmtMst( FaxMgmtCondVO[] faxMgmtMstVOs, SignOnUserAccount account) throws EventException;


}