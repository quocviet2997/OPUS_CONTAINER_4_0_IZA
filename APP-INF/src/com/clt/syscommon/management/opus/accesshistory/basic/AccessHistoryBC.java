/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryBC.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.accesshistory.basic;

import java.util.HashMap;

import com.clt.framework.core.layer.event.EventException;

/**
 * ALPS-Accesshistory Business Logic Command Interface<br>
 * - ALPS-Accesshistory에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author kyungbum kim
 * @since J2EE 1.6
 * @see AccessHistoryBCImpl
 */
public interface AccessHistoryBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return String
	 * @exception EventException
	 */
	public String getAccessHistory(HashMap<String, String> param) throws EventException;

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return String
	 * @exception EventException
	 */
	public String getAccessHistoryExcel(HashMap<String, String> param) throws EventException;

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param HashMap<String, String> param
	 * @return String
	 * @exception EventException
	 */
	public String getLastLoginDate(HashMap<String, String> param) throws EventException;
}