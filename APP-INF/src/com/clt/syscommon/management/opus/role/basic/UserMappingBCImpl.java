/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RoleBCImpl.java
*@FileTitle : 사용자 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.basic;


import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.opus.role.integration.UserMappingDBDAO;
import com.clt.syscommon.management.opus.role.vo.SearchMdmOrganizationVO;
import com.clt.syscommon.management.opus.role.vo.SearchUserMappingUsersVO;



/**
 * syscommon-syscommon Business Logic Basic Command implementation<br>
 * - syscommon-syscommon에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_009EventResponse,RoleBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class UserMappingBCImpl   extends BasicCommandSupport implements UserMappingBC {

	// Database Access Object
	private transient UserMappingDBDAO dbDao=null;

	/**
	 * RoleBCImpl 객체 생성<br>
	 * RoleDBDAO를 생성한다.<br>
	 */
	public UserMappingBCImpl(){
		dbDao = new UserMappingDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SignOnUserAccount account
	 * @return SearchMdmOrganizationVO
	 * @exception EventException
	 */
	public SearchMdmOrganizationVO[] searchOfficeList(SignOnUserAccount account) throws EventException {

		SearchMdmOrganizationVO[] searchMdmOrganizationVOVOs = null; 
		try {
			searchMdmOrganizationVOVOs=dbDao.searchOfficeList(account);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
		return searchMdmOrganizationVOVOs;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SignOnUserAccount account
	 * @param String ofcCd
	 * @param String usrRoleCd
	 * @return SearchUserMappingUsersVO[]
	 * @exception EventException
	 */
	public SearchUserMappingUsersVO[] searchUserList(SignOnUserAccount account, String ofcCd,String usrRoleCd) throws EventException {
		SearchUserMappingUsersVO[] searchUserMappingUsersVOs = null;
		
		try {
			searchUserMappingUsersVOs=dbDao.searchUserList(account, ofcCd, usrRoleCd);
			return searchUserMappingUsersVOs;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * UI_COM_SYS_009 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUsrRoleMtchVO[] comUsrRoleMtchVOs
	 * @param SignOnUserAccount account
	 * @return EventResponse UI_COM_SYS_009EventResponse
	 * @exception EventException
	 */
	public EventResponse multiRoleUserMatch(ComUsrRoleMtchVO[] comUsrRoleMtchVOs, SignOnUserAccount account) throws EventException{
		try {
			dbDao.multiComUsrRoleMtchVOS(comUsrRoleMtchVOs, account);
			return null;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * Role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}