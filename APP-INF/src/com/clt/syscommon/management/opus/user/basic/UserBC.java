/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserBC.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.basic;

import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.user.vo.ComUserInfoVO;
import com.clt.syscommon.management.opus.user.vo.ComUserVO;
import com.clt.syscommon.management.opus.user.vo.ComUsrPgmMtchVO;
import com.clt.syscommon.management.opus.user.vo.UserResponseContainerVO;

/**
 * NIS2010-Usermanagement Business Logic Command Interface<br>
 * - NIS2010-Usermanagement에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author KyungBum Kim
 * @see UsermanagementEventResponse 참조
 * @since J2EE 1.4
 */
public interface UserBC {
	/**
	 * 조회 이벤트 처리<br>
	 * User화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComUserVO comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO searchComUserVO(ComUserVO comuservo, SignOnUserAccount account) throws EventException;

	/**
	 * 멀티 이벤트 처리<br>
	 * User 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUserVO(ComUserVO[] comuservo, SignOnUserAccount account) throws EventException;
	
	/**
	 * update 이벤트 처리<br>
	 * main 화면에 대한 update 이벤트 처리<br>
	 * 
	 * @param ComUserVO comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO updateComUsrMain(ComUserVO comuservo, SignOnUserAccount account) throws EventException;
	
	/**
	 * 멀티 이벤트 처리<br>
	 * User Match 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUsrPgmMtchVO[] comUsrPgmMtchVOs
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUsrPgmMtch(ComUsrPgmMtchVO[] comUsrPgmMtchVOs, SignOnUserAccount account) throws EventException;

	/**
	 * Office 리스트 조회 <br>
	 * Office 리스트를 조회한다<br>
	 * 
	 * @param account SignOnUserAccount
	 * @param rqh String
	 * @param arOfcCd String
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchMdmOrganization(SignOnUserAccount account, String rqh, String arOfcCd) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * User Program 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @param String ofcCd
	 * @param String pgmNo
	 * @param String loginUsrId
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserProgramMapping(String usrId, String ofcCd, String pgmNo, String loginUsrId) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * User Info 화면에 대한 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @return List<ComUserInfoVO>
	 * @exception EventException
	 */
	public List<ComUserInfoVO> comUsrInfo(String usrId) throws EventException;
	
	/**
	 * 멀티 이벤트 처리<br>
	 * user 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUserPassHis(ComUserVO[] comuservo, SignOnUserAccount account) throws EventException;
	
	
	/**
	 * 조회 이벤트 처리<br>
	 * User Info 화면에 대한 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @return List<SignOnUserAccount>
	 * @exception EventException
	 */
	public List<ComUserVO> searchUserPassHis(String usrId) throws EventException;
	
}