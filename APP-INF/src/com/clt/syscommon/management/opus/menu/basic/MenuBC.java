/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuBC.java
*@FileTitle : Menu Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComMnuCfgVO;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.menu.vo.ComMnuCfgSearchVO;
import com.clt.syscommon.management.opus.menu.vo.MnuCfgExcelVO;

/**
 * NIS2010-Menumanagement Business Logic Command Interface<br>
 * - NIS2010-Menumanagement에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author KyungBum Kim
 * @see MenumanagementEventResponse 참조
 * @since J2EE 1.4
 */

public interface MenuBC {
	/**
	 * 조회 이벤트 처리<br>
	 * Menu화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComProgramVO commnucfgvo
	 * @return List<ComMnuCfgSearchVO>
	 * @exception EventException
	 */
	public List<ComMnuCfgSearchVO> searchComMnuCfgVO(ComProgramVO commnucfgvo) throws EventException;
	
	/**
	 * Excel조회 이벤트 처리<br>
	 *  Menu화면에 대한 Excel조회 이벤트 처리<br>
	 * 
	 * @return List<MnuCfgExcelVO>
	 * @exception EventException
	 */
	public List<MnuCfgExcelVO> searchExcelData() throws EventException;
	/**
	 * 멀티 이벤트 처리<br>
	 * Menu 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComMnuCfgVO[] commnucfgvo
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiComMnuCfgVO(ComMnuCfgVO[] commnucfgvo,SignOnUserAccount account) throws EventException;
}