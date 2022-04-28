/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExcelDownloadUsingRowsetBC.java
*@FileTitle : ExcelDownloadUsingRowset
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.23
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.10.23 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownloadusingrowset.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;

/**
 * ALPS-File Business Logic Command Interface<br>
 * - ALPS-File에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jeong-Hoon, Kim
 * @since J2EE 1.6
 */

public interface ExcelDownloadUsingRowsetBC {

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	DBRowSet getRowSet() throws EventException ;

	String[] getTitle();

	String[] getColumns();
}