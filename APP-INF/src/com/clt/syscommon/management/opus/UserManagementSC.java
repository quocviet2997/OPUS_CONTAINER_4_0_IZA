/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserManagementSC.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.CryptUtil;
import com.clt.framework.component.util.DateTime;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;

import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.framework.support.view.signon.dao.UserDAO;

import com.clt.syscommon.management.opus.role.basic.ProgramMappingBC;
import com.clt.syscommon.management.opus.role.basic.ProgramMappingBCImpl;
import com.clt.syscommon.management.opus.user.basic.UserBC;
import com.clt.syscommon.management.opus.user.basic.UserBCImpl;
import com.clt.syscommon.management.opus.user.event.UserManagementEvent;
import com.clt.syscommon.management.opus.user.vo.ComUserInfoVO;
import com.clt.syscommon.management.opus.user.vo.ComUserVO;
import com.clt.syscommon.management.opus.user.vo.UserResponseContainerVO;

/**
 * NIS2010-UserManagement Business Logic ServiceCommand - NIS2010-UserManagement 대한 비지니스 트랜잭션을 처리한다.
 * 
 * @author KyungBum Kim
 * @see UserManagementEventResponse,UserDBDAO
 * @since J2EE 1.4
 */

public class UserManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * UserManagement system 업무 시나리오 선행작업<br>
	 * UserManagement업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error("UserManagementSC doStart error!");
		}
	}

	/**
	 * UserManagement system 업무 시나리오 마감작업<br>
	 * UserManagement 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("UserManagementSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-UserManagement system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("UserManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchComUserVO(e);
			}else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiComUserVO(e);
			}else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
				eventResponse = multiComUsrPgmMtch(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchMdmOrganization(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchMenuList();
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = searchUserProgramMapping(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
				eventResponse = getComUsrInfo(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH05)) {
				eventResponse = getComUsrInfo2(e);
			
			// add 2014.11.03.
			}else if (e.getFormCommand().isCommand(FormCommand.COMMAND01)) {						
			eventResponse = updateComUsrPasswordInfo(e);
			}
			
		}
		return eventResponse;
	}

	private EventResponse searchMenuList() throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		try {
			ProgramMappingBC command = new ProgramMappingBCImpl();
			DBRowSet dbRowSet = command.searchMenuList();
			eventResponse.setRsVo(dbRowSet);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * User의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchComUserVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		ComUserVO comuservo = event.getComUserVO();
		UserResponseContainerVO containerVO = command.searchComUserVO(comuservo, event.getSignOnUserAccount());
	
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVoArray(containerVO.getComUserVO());
		eventResponse.setETCData("etckey1",containerVO.getEtcKey1());
		eventResponse.setETCData("etckey2",containerVO.getEtcKey2());
		//eventResponse.setUserMessage(containerVO.getUsrMessage());
		
		return eventResponse;
	}
	
	private EventResponse searchMdmOrganization(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		DBRowSet rowSet = command.searchMdmOrganization(event.getSignOnUserAccount(), (String)event.getVO("rhq"), (String)event.getVO("arOfcCd"));
	
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVo(rowSet);
		
		return eventResponse;
	}
	
	private EventResponse searchUserProgramMapping(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		String pgmNo = (String)event.getVO("pgm_no");
		DBRowSet rowSet = command.searchUserProgramMapping(event.getComUserVO().getUsrId(),event.getComUserVO().getOfcCd(),pgmNo,account.getUsr_id());
	
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setRsVo(rowSet);
		eventResponse.setFlowFlag("SUBMENU");
		
		return eventResponse;
	}
	
	
	/**
	 * 멀티 이벤트 처리<br>
	 * User의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiComUserVO(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		try{
			begin();
			UserResponseContainerVO containerVO = command.multiComUserVO(event.getComUserVOS(), account);
			
			eventResponse.setETCData("etckey1",containerVO.getEtcKey1());
			eventResponse.setETCData("etckey2",containerVO.getEtcKey2());

			eventResponse.setUserMessage(containerVO.getUsrMessage());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}

	/**
	 * 멀티 이벤트 처리<br>
	 * User Program Match 의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse multiComUsrPgmMtch(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		try{
			begin();
			UserResponseContainerVO containerVO = command.multiComUsrPgmMtch(event.getComUsrPgmMtchVOs(), account);
			
			eventResponse.setUserMessage(containerVO.getUsrMessage());
			commit();
		}catch(EventException ex){
			rollback();
			throw ex;
		}
		return eventResponse;
	}

	
	
	/**
	 * 멀티 이벤트 처리<br>
	 * update ComUsrPassword Info 의 event에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse updateComUsrPasswordInfo(Event e) throws EventException {				
		
		// PDTO(Data Transfer Object including Parameters)
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		UserManagementEvent event = (UserManagementEvent)e;
		UserBC command = new UserBCImpl();
		boolean authenticated = false;
		
		String password ="";	
		String sMsg =""; 				
		List<ComUserVO>  arrUsrPwdHis = new ArrayList<ComUserVO>();
			 
		try{			
			
			//Step 1.  로그인 정보 찾아오기			
			// DB에 저장된 Data 가져오기
			UserDAO userDAO = new UserDAO();		
			String  pwdFromDb ="";			
			
			if(event.getComUserVOS() != null && event.getComUserVOS().length > 0 && event.getComUserVOS()[0].getUsrId() != null ){	
				
			password =event.getComUserVOS()[0].getUsrPwd();
				 
			// Step 1-1. User 정보 찾기 
			SignOnUserAccount			userAccount = userDAO.readUser(event.getComUserVOS()[0].getUsrId(),0);
			 pwdFromDb 								= userAccount.getUsr_pwd();	
			 							 		
			 //Step 1-2. Pass His 정보 찾기 
			 arrUsrPwdHis 							= command.searchUserPassHis(event.getComUserVOS()[0].getUsrId());
			 
			 // Vo 설정
			 account = new SignOnUserAccount(
						event.getComUserVOS()[0].getUsrId() ,
						"" ,"" ,"" ,"" ,"" ,
						"" ,"","" ,"" ,"" ,
						"" ,"" ,"" ,"" ,"" ,
						"" ,"" ,"" ,"" ,"" , 
						"" );
			 
			}else{
			
			eventResponse.setETCData("userMessage", "Error - No Data" );				
			return eventResponse;
			}			
						
			authenticated = CryptUtil.checkPassword (pwdFromDb, password );
			if (! authenticated ){
				if (log.isDebugEnabled())
					log.debug("The password is not correct!");		
				sMsg ="The ID["+event.getComUserVOS()[0].getUsrId()+"] or Password["+password+"] value is not correct!"; 
				
			}
			
			if(authenticated  && arrUsrPwdHis !=null && arrUsrPwdHis.size() > 0){
					for (int i = 0; i <  arrUsrPwdHis.size(); i++) {						
						if(  CryptUtil.checkPassword (  arrUsrPwdHis.get(i).getUsrPwd() ,  event.getComUserVOS()[0].getUsrNewPwd() ) ) {
							sMsg =	"The password in the history cannot be reused. /n ";
							sMsg = sMsg +"Please change password value and retry. ";
							 
							 authenticated = false;
							 break;
						 }
						 						
					}
			}
			 			
			
			// Step 3. 정보 저장	
			if(authenticated){	
				begin();
				command.multiComUserPassHis(event.getComUserVOS(), account);				
				commit();			
				sMsg = "Data was saved successfully.";
			}
			
		}catch(EventException ex){
			
			rollback();
			sMsg = "Error -" + ex.toString();
			throw ex;
		}catch(Exception ex){				
			rollback();
			sMsg = "Error -" + ex.toString();			
			log.error(ex.toString());	
			throw new EventException(ex.getMessage());
		}
		
		eventResponse.setETCData("userMessage", sMsg );
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * User info의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse getComUsrInfo(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		// PDTO(Data Transfer Object including Parameters)
		try{
			UserManagementEvent event = (UserManagementEvent)e;
			UserBC command = new UserBCImpl();
			ComUserVO comuservo = event.getComUserVO();
			List<ComUserInfoVO> rsVoList = command.comUsrInfo(comuservo.getUsrId());
			eventResponse.setCustomData("ComUserInfoVO", rsVoList);
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * User info의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse getComUsrInfo2(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		// PDTO(Data Transfer Object including Parameters)
		try{
			UserManagementEvent event = (UserManagementEvent)e;
			UserBC command = new UserBCImpl();
			ComUserVO comuservo = event.getComUserVO();
			List<ComUserInfoVO> rsVoList = command.comUsrInfo(comuservo.getUsrId());
			if ( rsVoList.size() > 0 ) {
				ComUserInfoVO vo = rsVoList.get(0);
				eventResponse.setETCData("total", Integer.toString(rsVoList.size()));
				eventResponse.setETCData("usr_nm", vo.getUsrNm());
				eventResponse.setETCData("usr_locl_nm", vo.getUsrLoclNm());
				eventResponse.setETCData("xtn_phn_no", vo.getXtnPhnNo());
				eventResponse.setETCData("usr_eml", vo.getUsrEml());
				eventResponse.setETCData("rhq", vo.getRhq());
				eventResponse.setETCData("ofc_cd", vo.getOfcCd());
				eventResponse.setETCData("use_flg", vo.getUseFlg());
				eventResponse.setETCData("usr_auth_tp_cd", vo.getUsrAuthTpCd());
				eventResponse.setETCData("div", vo.getDiv());
			} else {
				eventResponse.setETCData("total", "0");
			}
		} catch (EventException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return eventResponse;
	}
	
	public void setAccount(SignOnUserAccount account) {
		this.account = account;
	}

	public SignOnUserAccount getAccount() {
		return account;
	}
	
	 /**
	 * User Info의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param String usrId
	 * @return List<ComUserInfoVO>
	 * @throws DAOException
	 */
	public String getHisCount()  {
		String hisCount="5";
		 if(! "NULL".equals(SiteConfigFactory.get("COM.CLT.PASSWORD.HIS.COUNT", "NULL")))
			    hisCount = SiteConfigFactory.get("COM.CLT.PASSWORD.HIS.COUNT", "NULL");
		 
		return hisCount;
	}
	
	
}