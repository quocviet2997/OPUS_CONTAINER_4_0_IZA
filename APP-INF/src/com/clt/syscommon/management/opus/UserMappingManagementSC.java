/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UserMappingManagementSC.java
*@FileTitle : 사용자 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.Collection;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComUsrRoleMtchVO;
import com.clt.syscommon.management.AbstractSysCommonSC;
import com.clt.syscommon.management.opus.role.basic.UserMappingBC;
import com.clt.syscommon.management.opus.role.basic.UserMappingBCImpl;
import com.clt.syscommon.management.opus.role.event.ComSys009Event;
import com.clt.syscommon.management.opus.role.vo.SearchMdmOrganizationVO;
import com.clt.syscommon.management.opus.role.vo.SearchUserMappingUsersVO;


/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see UI_COM_SYS_009EventResponse,RoleDBDAO 참조
 * @since J2EE 1.4
 */
public class UserMappingManagementSC extends AbstractSysCommonSC {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * syscommon 업무 시나리오 선행작업<br>
	 * Role업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account=getSignOnUserAccount();
		} catch (Exception e) {
			log.error("UserMappingManagementSC Error while preprocessing " + e.toString(), e);
		}
	}

	/**
	 * syscommon 업무 시나리오 마감작업<br>
	 * Role업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		// command.doEnd();
		log.debug("UserMappingManagementSC End");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * syscommon-syscommon 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		//관리자권한체크
		isAdministrator(this.account);
		
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = new GeneralEventResponse();

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("ComSys009Event")) {
			ComSys009Event event = (ComSys009Event)e;
			//Operator 소속조직,관리권한코드 설정
//			event.setLogin_user_ofc_cd(account.getOfc_cd());
//			event.setLogin_user_usr_auth_tp_cd(account.getUsr_auth_tp_cd());
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				SearchMdmOrganizationVO[] searchMdmOrganizationVOVOs  = searchOfficeList();
				eventResponse.setRsVoArray(searchMdmOrganizationVOVOs);
				
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				SearchUserMappingUsersVO[] searchUserMappingUsersVOs  = searchUserList(account,event.getOfcCd(), event.getRoleCd());
				eventResponse.setRsVoArray(searchUserMappingUsersVOs);
				
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiRoleUserMatch(e);
			} else {
				eventResponse = null;
			}
		}
		return eventResponse;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return response EventResponse
	 * @exception EventException
	 */
	private SearchMdmOrganizationVO[] searchOfficeList() throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		SearchMdmOrganizationVO[] searchMdmOrganizationVOVOs = null; 
		
		try {
			UserMappingBC command = new UserMappingBCImpl();
			searchMdmOrganizationVOVOs = command.searchOfficeList(account);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return searchMdmOrganizationVOVOs;
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Role 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return response EventResponse
	 * @exception EventException
	 */
	private SearchUserMappingUsersVO[] searchUserList(SignOnUserAccount account,String ofcCd,String usrRoleCd) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		SearchUserMappingUsersVO[] searchUserMappingUsersVOs = null;
		
		try {
			UserMappingBC command = new UserMappingBCImpl();
			searchUserMappingUsersVOs = command.searchUserList(account,ofcCd,usrRoleCd);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return searchUserMappingUsersVOs;
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * Role의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiRoleUserMatch(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComSys009Event event = (ComSys009Event)e;
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
//		EventResponse eventResponse = null;

		try {
			begin();
			UserMappingBC command = new UserMappingBCImpl();
			ComUsrRoleMtchVO[] comUsrRoleMtchVOs = event.getComUsrRoleMtchVOS();
			if(comUsrRoleMtchVOs!=null){
				int cnt = comUsrRoleMtchVOs.length;
				String creUsrId = account.getUsr_id();
				String usrRoleCd = event.getRoleCd();
				for(int i=0;i<cnt;i++){
					ComUsrRoleMtchVO comUsrRoleMtchVO = comUsrRoleMtchVOs[i];
					comUsrRoleMtchVO.setCreUsrId(creUsrId);
					comUsrRoleMtchVO.setUsrRoleCd(usrRoleCd);
				}
				
				command.multiRoleUserMatch(comUsrRoleMtchVOs, account);
			}
			commit();
		} catch (EventException de) {
			rollback();
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
//		return this.searchUserList(e);
		return null;
	}

}