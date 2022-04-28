/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AbstractSysCommonSC.java
*@FileTitle : 프로그램관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * syscommon-syscommon Business Logic ServiceCommand<br>
 * - syscommon-syscommon에 대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see MainPageEventResponse, ProgramDBDAO 참조
 * @since J2EE 1.4
 */
public abstract class AbstractSysCommonSC extends ServiceCommandSupport {

	/**
	 * 현재 시스템의 어플리케이션코드를 설정파일에서 가져온다.<br>
	 * EventResponse에 flowflag에 세팅한다.<br>
	 * 
	 * @param er EventResponse
	 */
	protected void setApplicationSystemCode(EventResponse er) {
		if(er != null) er.setFlowFlag(getApplicationSystemCode());
	}

	/**
	 * 현재 시스템의 어플리케이션코드를 설정파일에서 가져온다.<br>
	 * 
	 * @return app_sys_code String
	 */
	protected String getApplicationSystemCode() {
		String app_sys_code = (String)SiteConfigFactory.get(SiteConfigFactory.SYSTEM_TYPE);
		if(app_sys_code == null || app_sys_code.equals("")){
			app_sys_code = "DEFAULT";
		}
		return app_sys_code;
	}
	
	protected void isAdministrator(SignOnUserAccount account) throws EventException {
		if(account!=null){
			if(!account.getUsr_auth_tp_cd().equalsIgnoreCase("A") &&
					!account.getUsr_auth_tp_cd().equalsIgnoreCase("E") &&	// System Admin 인 경우 추가...added by Roh(2007.12.04)
					!account.getUsr_auth_tp_cd().equalsIgnoreCase("S")){
				throw new EventException(new ErrorHandler("COM10004","You are not authenticated as the administrator. Contact to your administrator.").getMessage());
			}
		}
	}
}