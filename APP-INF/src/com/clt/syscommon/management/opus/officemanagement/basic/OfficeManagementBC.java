/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeManagementBC.java
*@FileTitle : Office
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.07.02 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.officemanagement.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officemanagement.vo.OfficListVO;

/**
 * ALPS-Programmanagement Business Logic Command Interface<br>
 * - ALPS-Programmanagement에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jung In Sun
 * @see Office_managementEventResponse 참조
 * @since J2EE 1.6
 */

public interface OfficeManagementBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param OfficListVO	officListVO
	 * @param String pgm_no
	 * @return List<OfficListVO>
	 * @exception EventException
	 */
	public List<OfficListVO> comOfcPgmMtchSearch(OfficListVO officListVO,String pgm_no) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param ComOfcPgmMtchVO[] comOfcPgmMtchVO
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void comOfcPgmMtchs(ComOfcPgmMtchVO[] comOfcPgmMtchVO,SignOnUserAccount account) throws EventException;
}